package polyglot.visit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ProcessBuilder.Redirect;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.naming.LimitExceededException;

import polyglot.ast.Assign.Operator;
import polyglot.ast.Binary;

import polyglot.ast.Block;
import polyglot.ast.Block_c;
import polyglot.ast.Call;
import polyglot.ast.Conditional_c;
import polyglot.ast.Eval_c;
import polyglot.ast.Expr;
import polyglot.ast.FloatLit.Kind;
import polyglot.ast.For;
import polyglot.ast.ForInit;
import polyglot.ast.For_c;
import polyglot.ast.Formal;
import polyglot.ast.If_c;
import polyglot.ast.IntLit_c;
import polyglot.ast.Local;
import polyglot.ast.LocalAssign_c;
import polyglot.ast.LocalDecl;
import polyglot.ast.LocalDecl_c;
import polyglot.ast.Local_c;
import polyglot.ast.Loop_c;
import polyglot.ast.MethodDecl;
import polyglot.ast.Node;
import polyglot.ast.NodeFactory;
import polyglot.ast.Node_c;
import polyglot.ast.Stmt;
import polyglot.frontend.Job;
import polyglot.lex.LongLiteral;
import polyglot.types.Def;
import polyglot.types.Flags;
import polyglot.types.LocalDef;
import polyglot.types.LocalDef_c;
import polyglot.types.Name;
import polyglot.types.SemanticException;
import polyglot.types.Type;
import polyglot.types.TypeSystem;
import polyglot.util.InternalCompilerError;
import polyglot.util.Position;
import x10.ast.Async;
import x10.ast.Async_c;
import x10.ast.Finish_c;
import x10.ast.ForLoop_c;
import x10.ast.X10Binary_c;
import x10.ast.X10Call;
import x10.ast.X10Call_c;
import x10.ast.X10Local_c;
import x10.ast.X10Loop;
import x10.ast.X10Loop_c;
import x10.types.MethodInstance;
import x10.util.AltSynthesizer;
import x10.util.Synthesizer;

/*
 * @author.
 * 
 * TODO : pre-processing. all statements are properly blocked.
 * TODO : restructuring for loop.
 * 
 * 
 */
public class CostFunctionGeneratorForAtomic extends ContextVisitor {

	private final TypeSystem ts;
	NodeFactory xnf;
	private AltSynthesizer syn;
	private Synthesizer synth;
	private int defaultCost;
	private Node parentAsync;
	public static List<MethodDecl> funAfterVisit;
	public static HashMap<String, Node> costFuncMap;
	public static boolean  isBoundRedefined;
	public static List<Loop_c> handledInnerLoops; 
	public static Loop_c parentLoop;
    public static List<Stmt> specialBoundStmts;
    public static boolean innerLoopHandled;
	private static Position PCG = Position.COMPILER_GENERATED;

	public CostFunctionGeneratorForAtomic(Job job, TypeSystem ts, NodeFactory xnf,Node parentAsync) {
		super(job, ts, xnf);
		this.ts = ts;
		this.xnf = xnf;
		this.parentAsync=parentAsync;
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);
		defaultCost = 100; // default cost be 100 nanoseconds.
		funAfterVisit = new ArrayList<MethodDecl>();
		costFuncMap = new HashMap<String, Node>();
		isBoundRedefined = false;
		handledInnerLoops = new ArrayList<Loop_c>();
		parentLoop = null;
		specialBoundStmts = new ArrayList<Stmt>();
		innerLoopHandled = false;
	}
	/*
	 * @author Indu
	 * 
	 * overriding the traversal of nodes that are not needed to process.
	 * Should be same as how statement profiler is doing.
	 */
	@Override
   public Node override(Node n) {
		
		if(!( n instanceof If_c || n instanceof Loop_c  || n instanceof Block_c || n instanceof Async_c ||n instanceof Finish_c))
			return n;
		else
			return null;
	}
	/*protected NodeVisitor enterCall(Node parent, Node n) {
		//handiling inner for loops, with loop bound redefined.and depended on outer loop
		if(n instanceof Loop_c){
			//check if this loop has a inner for loop.get the loop.
			QuerySubtreeLoops queryLoops_v = new QuerySubtreeLoops(job, ts, xnf);
			QuerySubtree.queriedNodes=null;
			queryLoops_v.begin().visitEdgeNoOverride(null, ((Loop_c)n).body());
			List<Loop_c> innerLoops = QuerySubtree.queriedNodes;
			Loop_c innerLoop = null;
			if(innerLoops.size()>0){
				innerLoop = innerLoops.get(0);
			}
			//handle the inner loops costfunction
			handledInnerLoops.add(innerLoop);
			
			
		}
		  
		return this;
	}
	*/
	
	
	
	
	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {

		if (n instanceof Loop_c) { // retrun a stmt equals to its cost
			
			
			
			Stmt forBody = ((Loop_c) n).body();
			
			Expr costLoopHeader = syn.createLongLit(100);//for time being adding it as 100 ms
			Expr costLoopBody = costLoopHeader;// default cost = 100ns															// 5*unit cost
			Expr costFunction = syn.createLongLit(3 *defaultCost); // deafult cost
																	// of whole
																	// loop
			if (forBody instanceof Eval_c) {
				costLoopBody = syn.createBinary(PCG,costLoopHeader,Binary.ADD, ((Eval_c) forBody).expr(),this);
			}
			
		
			Expr loopBound = extractLoopBound((Loop_c) n);
			
			/**
			 * get the list of variables in the loopbound to check if it is redefined 
			 * somewhere in between.
			 * 
			 **/
			
			getVarUse getuses_v = new getVarUse(job, ts, xnf);
			getuses_v.begin().visitEdge(null,loopBound);
			List<Name> listOfUses= getVarUse.listUses;
			
			//System.out.println(" variables in for expr ");
			for(Name d :listOfUses){
				//System.out.println( d);
			}
			
			/**
			 * check if the variables in the list above is been redefined between the statement under consideration (for loop)
			 * and the start of the async
			 * 
			 */
			boolean isRedefined=false;
			
			for(Name ld : listOfUses){
			 DefUseCheckerChunking defUsecheck_v	= new DefUseCheckerChunking(job, ts, xnf, ld,(Stmt)n);
			 DefUseCheckerChunking.isRedefined=false;DefUseCheckerChunking.redefinedVarToReplace=null;DefUseCheckerChunking.redefinedVarToBeReplaced=null;
			 defUsecheck_v.begin().visitEdgeNoOverride(null,parentAsync);
			 //check if there is variable to replace in the cost function with a class variable.
			 if(DefUseCheckerChunking.redefinedVarToReplace!=null){
				 replaceOldVarToNewVar replace_v = new replaceOldVarToNewVar(job, ts, xnf, DefUseCheckerChunking.redefinedVarToBeReplaced, DefUseCheckerChunking.redefinedVarToReplace);
				 loopBound=(Expr)replace_v.begin().visitEdgeNoOverride(null,loopBound);
				 //loopBound.prettyPrint(System.out);
			 }
			
			 
			 if(DefUseCheckerChunking.isRedefined){
				 isRedefined=true;
			 }
			}
			
			if(isRedefined){
				//System.out.println(" the variables is redefined Error Cannnot formulate loop");
				isBoundRedefined = true; 
				//throw new SemanticException(" Cannot formulate cost function because variable is redined");
				costFunction = syn.createBinary(PCG, costLoopBody, Binary.MUL,syn.createLongLit(1),this);
			}
			else{

				/**
				 *duplicate the loop bound and use it in the cost function 
				 **/
				//Duplicate loopbound to use it at different places.
				DuplicateSubtreeAndRenameLocals dup_v = new DuplicateSubtreeAndRenameLocals(job, ts, xnf);
				loopBound = (Expr)dup_v.begin().visitEdgeNoOverride(null,loopBound);
				costFunction = syn.createBinary(PCG, loopBound, Binary.MUL,
						costLoopBody, this);
				costFunction = syn.createBinary(PCG, costFunction, Binary.ADD,costLoopHeader,this);
			}
			
			
			//check the parent loop
			Loop_c pLoop = this.parentLoop;
			if(pLoop!= null){
				if(pLoop.position().equals(n.position())){
					//System.out.println();
					if(specialBoundStmts.size()>1){
					Stmt costStmt = specialBoundStmts.remove(0);
					Expr cost = syn.createLongLit(1);
					Local loopBoundLocal = null;
					if(costStmt instanceof Eval_c){
						cost = ((Eval_c)costStmt).expr();
					}
					Stmt loopBoundDec = specialBoundStmts.get(0);
					if(loopBoundDec instanceof LocalDecl_c){
						loopBoundLocal = syn.createLocal(PCG,(LocalDecl) loopBoundDec);
					}
					cost = syn.createBinary(PCG, cost, Binary.MUL,loopBoundLocal,this);
					costFunction = syn.createBinary(PCG,costFunction, Binary.ADD,cost, this);
					pLoop = null;
					innerLoopHandled=true;

					}
				}
				
			}
			Stmt costFunctionStmt = syn.createEval(costFunction);
			return costFunctionStmt;

		} else if (n instanceof Async_c) {

			//System.out.println("Async not needed ");
			Stmt bodyAsync = ((Async_c) n).body();
			Expr costFunction = syn.createLongLit(10 * defaultCost); // 10 times default cost because the ceation of async takes time
			if (bodyAsync instanceof Eval_c) {
				costFunction = ((Eval_c) bodyAsync).expr();

			}
			Stmt costFunctionStmt = syn.createEval(costFunction);
			return costFunctionStmt;
		} else if (n instanceof If_c) { // TODO the cost of checking the if
										// condition also
			Expr costFunction = syn.createLongLit(( defaultCost));// default
																	// cost
			Expr thenCost = syn.createLongLit(100); // default cost = 100ns
															
			Expr elseCost = syn.createLongLit(0); // default cost = 0;

			Stmt thenStmt = ((If_c) n).consequent();
			
			if (thenStmt instanceof Eval_c) {
				thenCost = syn.createBinary(PCG, thenCost,Binary.ADD,((Eval_c) thenStmt).expr() , this) ;

			}

			Stmt elseStmt = ((If_c) n).alternative();
			if (elseStmt instanceof Eval_c) {
				elseCost =syn.createBinary(PCG, elseCost,Binary.ADD,((Eval_c) elseStmt).expr() , this) ;

			}
			
			Expr cond= ((If_c)n).cond();
			/*
			 * check the def-use of the condition
			 * 1)get the uses of the variables in the expression specified.
			 * 2)check wether thr variable is redefined anywhere before this use.
			 * 
			 */
			getVarUse getuses_v = new getVarUse(job, ts, xnf);
			getuses_v.begin().visitEdge(null,cond);
			List<Name> listOfUses= getVarUse.listUses;
			
			//System.out.println(" variables in If ");
			for(Name d :listOfUses){
				//System.out.println( d);
			}
			boolean isRedefined=false;
			////System.out.println(" position "+((Stmt)n).position() + " "+((Stmt)n).firstChild().position());
			 for(Name ld : listOfUses){
			 DefUseCheckerChunking defUsecheck_v	= new DefUseCheckerChunking(job, ts, xnf, ld,((Stmt)n));
			 DefUseCheckerChunking.isRedefined=false;DefUseCheckerChunking.redefinedVarToReplace=null;DefUseCheckerChunking.redefinedVarToBeReplaced=null;
			 defUsecheck_v.begin().visitEdgeNoOverride(null,parentAsync);
			/* if(DefUseCheckerChunking.redefinedVarToReplace!=null){
				 replaceOldVarToNewVar replace_v = new replaceOldVarToNewVar(job, ts, xnf, DefUseCheckerChunking.redefinedVarToBeReplaced, DefUseCheckerChunking.redefinedVarToReplace);
				 cond=(Expr)replace_v.begin().visitEdgeNoOverride(null,cond);
				 cond.prettyPrint(System.out);
			 }*/
			
			
			 if(DefUseCheckerChunking.isRedefined ){
				 isRedefined=true;
			 }
			 else if( DefUseCheckerChunking.redefinedVarToReplace!=null ){
				 isRedefined=true;
			 }
			}
			if(isRedefined){
				//System.out.println("Yes it is redefined.");
				//make copy of then and else cost as we are using the same expression twice in the cost function now.
				DuplicateSubtreeAndRenameLocals dup_v = new DuplicateSubtreeAndRenameLocals(job, ts, xnf);
				Expr thenCostCopy = (Expr)dup_v.begin().visitEdgeNoOverride(null,thenCost);
				
				DuplicateSubtreeAndRenameLocals dup_v2 = new DuplicateSubtreeAndRenameLocals(job, ts, xnf);
				Expr elseCostCopy = (Expr)dup_v2.begin().visitEdgeNoOverride(null,elseCost);
				
				Expr maxCost = syn.createBinary(PCG, thenCost, Binary.GE, elseCost,this);
				costFunction = xnf.Conditional(PCG,maxCost,thenCostCopy,elseCostCopy).type(thenCostCopy.type()); 
				
				
						}
			else{
							
				
				
				/**
				 *duplicate the cond and use it in the cost function 
				 **/
				//Duplicate cond to use it at different places.
				DuplicateSubtreeAndRenameLocals dup_v = new DuplicateSubtreeAndRenameLocals(job, ts, xnf);
				cond = (Expr)dup_v.begin().visitEdgeNoOverride(null,cond);
				
				costFunction = xnf.Conditional(PCG, cond, thenCost,
						elseCost).type(thenCost.type());
			}
			
			//adding the cost of checking the conditional variable
			costFunction = syn.createBinary(PCG, costFunction, polyglot.ast.Binary.Operator.ADD,
					syn.createLongLit(100),this);
			Stmt costFunctionStmt = syn.createEval(costFunction);
			

			return costFunctionStmt;

		} else if (n instanceof Finish_c) {
			return n; // TODO check if it is correct; have to calculate cost of
						// async.

		} else if (n instanceof Block_c) {
			List<Stmt> bodyBlock = ((Block_c) n).statements();
			Expr costFunction = syn.createLongLit(0); // default value of cost
			BufferedReader br = null;
			String file;
			String line=null;
			try {
			file = "/home/induk/workspace/testprgms/src/classFiles/avgExecTime.txt";
			br = new BufferedReader(new FileReader(file)); 
		    
		   	}
			catch (IOException e) {
		    	 //System.out.println("Error no file exist ");
			}
			//
			boolean basicBlockOpen = false;
			for (Stmt s : bodyBlock) {
				

				//if it is a statement with a user defined func call then also not do profiling.
				 checkForFunctionCall funCheck_v = new checkForFunctionCall(job, ts, xnf);
				 funCheck_v.funcTocheck = funAfterVisit;
				 funCheck_v.begin().visitEdge(null,s);
				 
				
				 if(( s instanceof Eval_c) &&  ((Eval_c)s).expr() instanceof X10Call_c  && ((X10Call_c)((Eval_c)s).expr()).name().toString().startsWith("writeToFile")  ){
						 
					 
					 basicBlockOpen = false;
				 }
				 else if(( s instanceof Eval_c) &&  ((Eval_c)s).expr() instanceof X10Call_c  && ((X10Call_c)((Eval_c)s).expr()).name().toString().startsWith("operator()=") 
					&& ((X10Call_c)((Eval_c)s).expr()).target() instanceof X10Local_c 
					&& ((X10Local_c)(((X10Call_c)((Eval_c)s).expr()).target())).name().toString().startsWith("startTime") ) {
						 
					 //System.out.println("");
					 

						//extract the id from LocalDecl varibale and get the corresponding profiled cost.
					   
			    	   	int idOfTimer = -1 ;	 
						//String idOfTimer = timerarr[1];
						 if(  ((X10Call_c)((Eval_c)s).expr()).arguments().get(0) instanceof IntLit_c ){
							 idOfTimer =(int) ((IntLit_c)((X10Call_c)((Eval_c)s).expr()).arguments().get(0)).value();
							 //System.out.println(" name of the block"+idOfTimer );
						 }
						
						
						try{
							 while ((line = br.readLine())!= null ){
						    	String[]  arr = line.split(" ");
						    	 int id = Integer.parseInt(arr[0]);
						    	 double timeDouble = Double.parseDouble(arr[1]);
						    	 int time = (int) timeDouble;
						    	 if(id == idOfTimer){
						    		 Expr myCost = syn.createLongLit(time);
						    		 costFunction = syn.createBinary(PCG,costFunction,Binary.ADD,myCost, this); 
						    		 break;
						    	 }
						      	 	    	 
						    }
							
						}
						catch (IOException e) {
					    	 //System.out.println("Error while reading cost for basic block ");
						}
						basicBlockOpen = true;
					
				 }
				 //if it is user defined func call
				else if (basicBlockOpen == false && funCheck_v.funcPresent) {
					// get the function call statement
					X10Call funCall = funCheck_v.funCall;
					// get the actuals
					List<Expr> actualList = funCall.arguments();
					// get the formals.
					MethodDecl funcDecl = funCheck_v.funDecl;
					List<Formal> formalList = funcDecl.formals();
					// get the cost function for this call;
					Node funcCostFunc = costFuncMap.get(funCall.name()
							.toString());
					// dupilcate cost function so that it can be reused.
					DuplicateSubtreeAndRenameLocals dup_v = new DuplicateSubtreeAndRenameLocals(
							job, ts, xnf);
					funcCostFunc = dup_v.begin().visitEdgeNoOverride(null,
							funcCostFunc);

					// and replace each formal to actual.
					for (Formal fi : formalList) {
						replaceOldVarToNewVar replace_v = new replaceOldVarToNewVar(
								job, ts, xnf,
								(Local_c) syn.createLocal(PCG, fi),
								actualList.get(formalList.indexOf(fi)));
						funcCostFunc = replace_v.begin().visitEdgeNoOverride(
								null, funcCostFunc);

					}

					// check the cost function after replcing, if it is being
					// redefined before or not.
					// if a conditional statements condition is redefined then
					// the max of then cost and else cost is taken.
					// for each such change an id for identification and
					// updation is kept.and checked here.
					// if a redefinition is happended for a multiply statement
					// ie in left or right arguments then
					// a flag is set to indicate a bound redefinition.
					checkVarRedifinitionAfterFunCall checVar = new checkVarRedifinitionAfterFunCall(
							job, ts, xnf, parentAsync, s);
					funcCostFunc = checVar.begin().visitEdgeNoOverride(null,
							funcCostFunc);
					Expr toBeadded = checkVarRedifinitionAfterFunCall.boundRedifinedExpr;
					Expr costToBeadded = checkVarRedifinitionAfterFunCall.costToBeAddedLater ;

					if (checVar.isBoundRedefined == false
							&& (checVar.ifRedefined == checVar.ifRedefinitionFixed)) {
						costFunction = syn.createBinary(PCG, costFunction,
								Binary.ADD, ((Eval_c) funcCostFunc).expr(),
								this);
					} else {
						// check if the loop is enclosed in a outer for loop and
						// check if we can reformulate the cost function
						QueryEnclosingLoop queryLoop_v = new QueryEnclosingLoop(
								job, ts, xnf);
						QueryEnclosingLoop.keyNode = s;
						queryLoop_v.begin().visitEdgeNoOverride(null,
								parentAsync);

						Loop_c parentLoop;
						if (QueryEnclosingLoop.loopStack.size() == 0) {
							System.out
									.println(" the variables are redefined Error Cannnot formulate loop");
							isBoundRedefined = true;
							costFunction = syn.createBinary(PCG, costFunction,
									Binary.ADD, syn.createLongLit(1), this);
						} else {
							parentLoop = QueryEnclosingLoop.loopStack.peek();
							// now check if loop is redefined in between parent
							// loop and cuur statement.
							getVarUse getuses_v = new getVarUse(job, ts, xnf);
							getuses_v.begin().visitEdge(null, funcCostFunc);
							List<Name> listOfUses = getVarUse.listUses;

							Name redefinedVarName = null;
							for (Name ld : listOfUses) {
								DefUseCheckerChunking defUsecheck_v = new DefUseCheckerChunking(
										job, ts, xnf, ld, s);
								DefUseCheckerChunking.isRedefined = false;
								DefUseCheckerChunking.redefinedVarToReplace = null;
								DefUseCheckerChunking.redefinedVarToBeReplaced = null;
								defUsecheck_v.begin().visitEdgeNoOverride(null,
										parentLoop);
								// check if there is variable to replace in the
								// cost function with a class variable.

								if (DefUseCheckerChunking.isRedefined) {
									redefinedVarName = ld;
								}

							}
							if (redefinedVarName != null) {
								// now get the statements plus loop header that
								// have
								// to be added to bound
								// calculation.

								// first get the statements in between s and its
								// enclosing loop;
								
								// create of copy of parent loop.
								this.parentLoop = parentLoop;
								
								/*DuplicateSubtreeAndRenameLocals duplicate_v = new DuplicateSubtreeAndRenameLocals(
										job, ts, xnf);
								Loop_c newParentLoop = (Loop_c) duplicate_v.begin()
										.visitEdgeNoOverride(null, parentLoop);
*/								
								Loop_c newParentLoop = parentLoop;
								
								List<Stmt> parentStmts = ((Block_c) newParentLoop
										.body()).statements();
								List<Stmt> probableStmts = new ArrayList<Stmt>();
								for (Stmt lsi : parentStmts) {
									if (lsi.equals(s)) {
										break;
									}
									probableStmts.add(lsi);
								}
								
								
								
								
								List<Stmt> stmtsToAdd = new ArrayList<Stmt>();
								List<Name> currentVarList = new ArrayList<Name>();
								currentVarList.add(redefinedVarName);
								for (int i = probableStmts.size() - 1; i >= 0; i--) {
									Stmt currStmt = probableStmts.get(i);
									if (currStmt instanceof LocalDecl_c
											&& checkPresentName(
													((LocalDecl_c) currStmt)
															.name().id(),
													currentVarList) != null) {
										// add this statement to the list
										stmtsToAdd.add(0, currStmt);
										// get the local which is dependent on
										// this.
										currentVarList.remove(checkPresentName(
												((LocalDecl_c) currStmt).name()
														.id(), currentVarList));

										getVarUse getlocals_v = new getVarUse(
												job, ts, xnf);
										getlocals_v
												.begin()
												.visitEdgeNoOverride(
														null,
														((LocalDecl_c) currStmt)
																.init());
										currentVarList
												.addAll(getlocals_v.listUses);

									}
								}
								LocalDecl loopBounddecl = syn.createLocalDecl(
										PCG, Flags.MUTABLE,
										Name.make("loopBound"), ts.Long(),
										syn.createLongLit(0));
								Local loopBoundLocal = syn.createLocal(PCG,
										loopBounddecl);
								List<Stmt> specialBoundStmts = new ArrayList<Stmt>();
								specialBoundStmts.add(loopBounddecl);

								
								// create a for loop with the same header as the
								// parent loop.
								if (newParentLoop instanceof ForLoop_c) {
									X10Loop newLoop = (ForLoop_c) newParentLoop;
									newLoop = newLoop
											.body((Stmt) nf.Empty(PCG));
									List<Stmt> newLoopStmts = new ArrayList<Stmt>();
									newLoopStmts.addAll(stmtsToAdd);

									// create a loop bound calculating statement
									Stmt boundAStmt = syn
											.createAssignment(
													PCG,
													loopBoundLocal,
													polyglot.ast.Assign.Operator.ADD_ASSIGN,
													toBeadded, this);
									newLoopStmts.add(boundAStmt);
									Block newLoopBody = syn.createBlock(PCG,
											newLoopStmts);
									newLoop = newLoop.body(newLoopBody);
									
									//duplicate and rename locals with new iterator
									Formal parForIteratorDecl = newLoop.formal();
									Local parForIteratorLocal = syn.createLocal(PCG,parForIteratorDecl);
									DuplicateSubtreeAndRenameLocals dupAndRename = new DuplicateSubtreeAndRenameLocals(job, ts, xnf);
									newLoop = (X10Loop_c)dupAndRename.begin().visitEdgeNoOverride(null, newLoop);
									//rename Locals with new iterattor
								//	replaceOldVarToNewVar replace_v = new replaceOldVarToNewVar(job, 
								//			ts, xnf, , newVar)
									
									
									

									specialBoundStmts.add(newLoop);
									specialBoundStmts.add(0,syn.createEval(costToBeadded));
									this.specialBoundStmts.addAll(specialBoundStmts);
									
								} else {
									System.out
											.println(" the variables are redefined Error Cannnot formulate loop");
									isBoundRedefined = true;
									costFunction = syn.createBinary(PCG,
											costFunction, Binary.ADD,
											syn.createLongLit(1), this);

								}

							} else {
								System.out
										.println(" the variables are redefined Error Cannnot formulate loop");
								isBoundRedefined = true;
								costFunction = syn.createBinary(PCG,
										costFunction, Binary.ADD,
										syn.createLongLit(1), this);

							}

						}

					}
				}
				 else if (s instanceof Eval_c && basicBlockOpen == false){ // extract the cost expression from
											// stmts in block and add them
											// together.
				Expr costFunctionMember = ((Eval_c) s).expr();
				costFunction = syn.createBinary(PCG, costFunction,
							Binary.ADD, costFunctionMember, this);
				 }
			}
			Stmt costFunctionStmt = syn.createEval(costFunction);
			return costFunctionStmt;

		} 
		else return n;

	}

	public Name checkPresentName(Name n,List<Name> lst){
		
		for(Name l:lst){
			if(l.toString().equals(n.toString()))
				return l;
		}
		
		return null;
	}
	public Expr extractLoopBound(Loop_c forNode) throws SemanticException {

		IntLit_c update=null;
		IntLit_c init=null;
		Expr initExpr=null;
		Name operatorUpdate = null;
		Name operatorCond = null;
		Expr limitFor = syn.createLongLit(1); // default value of loop bound
		Expr condition= null;
		if (forNode instanceof For_c) {
			For_c forNd = ((For_c)forNode);
			
			// init expre Check
			//case 1 :If init expr is a Local decl and  int lit 
			//System.out.println("start extract bounds");
			List forInits = forNd.inits();
			if(forInits.get(0) instanceof LocalDecl_c && ((LocalDecl_c)forInits.get(0)).init().isConstant() && ((LocalDecl_c)forInits.get(0)).init() instanceof IntLit_c ){
				init = ((IntLit_c)((LocalDecl_c)forInits.get(0)).init()); 
				//System.out.println("Correct initialization");			
			}
			//case 2 :If init expr is a Local Assign and  int lit 
			else if(forInits.get(0) instanceof Eval_c && ((Eval_c)forInits.get(0)).expr() instanceof LocalAssign_c && ((LocalAssign_c)((Eval_c)forInits.get(0)).expr()).right() instanceof IntLit_c  ){
				init = (IntLit_c)((LocalAssign_c)((Eval_c)forInits.get(0)).expr()).right();
				//System.out.println("Correct initialization");	
			}
			//case 3 :If init expr is a local assign and it is a expr  as in for(i=exp;i>=0;i--)
			else if(forInits.get(0) instanceof Eval_c && ((Eval_c)forInits.get(0)).expr() instanceof LocalAssign_c ){
				initExpr = ((LocalAssign_c)((Eval_c)forInits.get(0)).expr()).right();
			}
			//case 4 :If init expr is a local decl and it is a expr  as in for(i=n;i>=0;i--)
			else if(forInits.get(0) instanceof LocalDecl_c){
				initExpr = ((LocalDecl_c)forInits.get(0)).init();
				//System.out.println("Correct initialization backward loop");
			}
			
			//case 4:throw exception 
			else
				throw new SemanticException(
						"TransformationError in extractLoopBound method, Loop bound cannot be extracted for the Loop : "
								+ forNode.toString() + " Worng initialisation for iterator");
			List forUpdates = forNd.iters();
			//Check update expr.
			//save the update value like i+1 and the the operator +
			if( ((Eval_c)forUpdates.get(0)).expr() instanceof LocalAssign_c && ((X10Call_c)((LocalAssign_c)((Eval_c)forUpdates.get(0)).expr()).right()).arguments().get(0) instanceof IntLit_c   ){
				update = (IntLit_c)((X10Call_c)((LocalAssign_c)((Eval_c)forUpdates.get(0)).expr()).right()).arguments().get(0);
				operatorUpdate=(Name)((X10Call_c)((LocalAssign_c)((Eval_c)forUpdates.get(0)).expr()).right()).name().id();
				
				//System.out.println("Correct update");
			}
			else
				throw new SemanticException(
						"TransformationError in extractLoopBound method, Loop bound cannot be extracted for the Loop : "
								+ forNode.toString() + " Worng updation for iterator");
			Expr forCond = forNd.cond();
			
			//System.out.println(forCond.getClass());
			//Check condition expr.
			//save the condition expr and operator like < or >
			if (forCond instanceof X10Call_c) {
				X10Call_c cond = (X10Call_c) forCond;
				condition = cond.arguments().get(0);
				operatorCond=cond.name().id();

			}
			else
				throw new SemanticException(
							"TransformationError in extractLoopBound method, Loop bound cannot be extracted for the Loop : "
									+ forNode.toString() + " Worng condition for iterator");
			//Extract the limit of for loop from the collected values.
			//case 0 : i=x ;i<n Or i<=n ;i++ ; n-x or n-x+1;
			if(operatorUpdate.toString().equals("operator+") && init ==null && !( initExpr instanceof IntLit_c )&& update.value()==1 ){
				limitFor=syn.createBinary(PCG,condition,Binary.SUB,initExpr,this);
				if(operatorCond.toString().equals("operator<"))
					limitFor=limitFor;
				else if(operatorCond.toString().equals("operator<="))
					limitFor=syn.createBinary(PCG,limitFor,Binary.ADD,syn.createLongLit(1),this);
				
			}
			//case 0.1 : i=c ;i<n Or i<=n ;i++ ; n-c or n-c+1
			else if(operatorUpdate.toString().equals("operator+") && init !=null && init.value() !=0 && update.value()==1 ){
				limitFor=syn.createBinary(PCG,condition,Binary.SUB,init,this);
				if(operatorCond.toString().equals("operator<"))
					limitFor=limitFor;
				else if(operatorCond.toString().equals("operator<="))
					limitFor=syn.createBinary(PCG,limitFor,Binary.ADD,syn.createLongLit(1),this);
				
			}
			
			
			
			//case 1 : i=0 ;i<n Or i<=n ;i++
			else if(operatorUpdate.toString().equals("operator+") && init.value()==0 && update.value()==1 ){
					if(operatorCond.toString().equals("operator<"))
						limitFor=condition;
					else if(operatorCond.toString().equals("operator<="))
						limitFor=syn.createBinary(PCG,condition,Binary.ADD,syn.createLongLit(1),this);
					
				}
				//case 1.2 : i=1 ;i<n Or i<=n ;i++
				else if(operatorUpdate.toString().equals("operator+") && init.value()==1 && update.value()==1 ){
					if(operatorCond.toString().equals("operator<=") || operatorCond.toString().equals("operator<"))
						limitFor=condition;
					else if(operatorCond.toString().equals("operator<"))
						limitFor=syn.createBinary(PCG,syn.createLongLit(1),Binary.SUB,condition,this);
					
				}
				//case 2 : i=n ;i>=0 ; i--; have to handle by changing init to an expr.
				else if( operatorUpdate.toString().equals("operator-") && update.value()==1 ){
					if( operatorCond.toString().equals("operator>") ){
						limitFor=initExpr;
					}
					else if( operatorCond.toString().equals("operator>=") ){
						List<Expr> args=  new ArrayList<Expr>();
						args.add(initExpr) ;
						List<Type> argsType=  new ArrayList<Type>();
						argsType.add(ts.Long());
						//limitFor=synth.makeInstanceCall(PCG, syn.createLongLit(1), Name.make("operator+"), new ArrayList<TypeNode>() ,args, ts.Long(),argsType ,context);
						Expr plus1 = syn.createLongLit(1);
						limitFor = syn.createBinary(PCG,plus1 , Binary.ADD, initExpr, this);
					}
					
				}
				else
				{
					throw new SemanticException(
							"TransformationError in extractLoopBound method, Loop bound cannot be extracted for the Loop : "
									+ forNode.toString() );

				}
				//System.out.println("end extract bounds");

			
			
			return limitFor;
		
		
		}
		//for( j in 0..n)
		else if (forNode instanceof ForLoop_c) {
			ForLoop_c ForNd = ((ForLoop_c)forNode);
			//case 1: init is a int Lit. like for(i in 0..n)
			if( ForNd.domain() instanceof X10Call_c  && ((X10Call_c)ForNd.domain()).name().toString().equals("operator..") 
					&& ((X10Call_c)ForNd.domain()).arguments().get(0) instanceof IntLit_c){
				init =  (IntLit_c)((X10Call_c)ForNd.domain()).arguments().get(0);
				condition =((X10Call_c)ForNd.domain()).arguments().get(1);
				if(init.value() ==0){
					
					if(condition instanceof X10Call_c && ((X10Call_c)condition).name().toString().equals("operator-") && ((X10Call_c)condition).arguments().get(0).isConstant() ){
						List<Expr> args = ((X10Call_c)condition).arguments();
						List<Expr> newArgs = new ArrayList<Expr>();
						newArgs.add(syn.createLongLit(0));
						condition = ((X10Call_c)condition).arguments(newArgs);
						
					}
					limitFor=condition;
				}
				else{
					throw new SemanticException(
							"TransformationError in extractLoopBound method, Loop bound cannot be extracted for the Loop : "
									+ forNode.toString()+"domain not startting from 0");
				}
				//limitFor = syn.createBinary(PCG,init,Operator.SUB,init,new ContextVisitor(job, ts, xnf));
			}
			else {
				throw new SemanticException(
						"TransformationError in extractLoopBound method, Loop bound cannot be extracted for the Loop : "
								+ forNode.toString());
			}
				
		 
		
		} else
			throw new SemanticException(
					"TransformationError in extractLoopBound method, Loop bound cannot be extracted for the Loop : "
							+ forNode.toString());

	return limitFor;
	}
	
	
	
}
