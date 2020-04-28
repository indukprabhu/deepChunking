package polyglot.visit;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sun.corba.se.spi.orbutil.closure.Closure;

import polyglot.ast.Allocation;
import polyglot.ast.Assign;
import polyglot.ast.Assign.Operator;
import polyglot.ast.Binary;
import polyglot.ast.Binary_c;
import polyglot.ast.Block;
import polyglot.ast.Block_c;
import polyglot.ast.Call;
import polyglot.ast.ClassBody_c;
import polyglot.ast.ClassDecl;
import polyglot.ast.ClassDecl_c;
import polyglot.ast.ClassMember;
import polyglot.ast.Eval_c;
import polyglot.ast.Expr;
import polyglot.ast.For;
import polyglot.ast.For_c;
import polyglot.ast.Formal;
import polyglot.ast.If_c;
import polyglot.ast.Local;
import polyglot.ast.LocalDecl;
import polyglot.ast.LocalDecl_c;
import polyglot.ast.Local_c;
import polyglot.ast.MethodDecl;
import polyglot.ast.MethodDecl_c;
import polyglot.ast.New;
import polyglot.ast.New_c;
import polyglot.ast.Node;
import polyglot.ast.NodeFactory;
import polyglot.ast.Node_c;
import polyglot.ast.Stmt;
import polyglot.ast.TypeNode;
import polyglot.frontend.Compiler;
import polyglot.frontend.ExtensionInfo;
import polyglot.frontend.FileResource;
import polyglot.frontend.FileSource;
import polyglot.frontend.Job;
import polyglot.frontend.Parser;
import polyglot.frontend.Source;
import polyglot.types.ClassDef;
import polyglot.types.ClassDef.Kind;
import polyglot.types.ConstructorDef;
import polyglot.types.ConstructorInstance;
import polyglot.types.Context;
import polyglot.types.FieldDef;
import polyglot.types.Flags;
import polyglot.types.LocalDef;
import polyglot.types.MethodDef_c;
import polyglot.types.Name;
import polyglot.types.SemanticException;
import polyglot.types.Type;
import polyglot.types.TypeSystem;
import polyglot.types.TypeSystem_c;
import polyglot.types.Types;
import polyglot.util.ErrorInfo;
import polyglot.util.ErrorQueue;
import polyglot.util.Position;
import x10.Configuration;
import x10.ast.AnnotationNode;
import x10.ast.Async;
import x10.ast.Async_c;
import x10.ast.AtStmt_c;
import x10.ast.Atomic_c;
import x10.ast.Finish;
import x10.ast.Finish_c;
import x10.ast.StmtExpr;
import x10.ast.StmtExpr_c;
import x10.ast.X10Binary_c;
import x10.ast.X10Call;
import x10.ast.X10Call_c;
import x10.ast.X10ClassDecl;
import x10.ast.X10FieldDecl_c;
import x10.ast.X10Field_c;
import x10.ast.X10MethodDecl_c;
import x10.ast.X10New;
import x10.ast.X10New_c;
import x10.extension.X10Del;
import x10.types.AsyncDef;
import x10.types.X10ClassDef;
import x10.types.X10ClassType;
import x10.types.X10CodeDef;
import x10.types.X10MethodDef_c;
import x10.types.X10ParsedClassType;
import x10.util.AltSynthesizer;
import x10.util.Synthesizer;
import x10.util.synthesizer.ClassSynth;
import x10.visit.ClosureCaptureVisitor;
import x10.visit.X10TypeChecker;
import x10cpp.visit.ASTQuery;
import x10.X10CompilerOptions;
/*
 * @author Indu 
 * 
 * Finds the Par-For-loop in the code.and calls the transform visitor which will transform
 * the Par-for-loop.
 * 
 * A For_c is Par-for-loop.If
 * 1) It has an async as a direct child of it. It can have any statements in between or after the async.
 * 2) It may or may not have an enclosing finish around it.
 * 
 * Assumptions.
 * 1) Async as a direct child of the for is considered as Par-for-loop
 * 2) Enclosing finish is not mandatory.
 * 3) Does not consider main-function's implicit finish.Only consideres explicit finishes in a func in a class.
 * 4) Assumes the code is already inlined and hence doesnot require inter-procedural analysis.
 * 5) Assumes that the chunk.x10 code is already inserted in the input file.or an alternative.
 * 6)TODO initialising chunk array by constructor.
 * 7)TODO adding the isertable code as in form shown in simpleLoop
 * 8)TODO the loop bound of the par-for-loop should be of the form i from 0 < n. where n is the 
 *   number of iterations. 
 * 10) Assuming the async body is always converted to block.otherwise the transformer jus throws an error.
 * 11) the variable n is not present in the user code.
 * 12) Cost calculated function needs to be insereted.Refer noteBook
 * 13) Needs to handle if i in the loop is not of long tyep. exapme Point i.
 * 14) While taking the par-for-nodes iterator, i assumed that the loop has only one iterator.
 * 15) calc cost has some problem when there is a initialising closure inside the async body.Currently i am commenting it. check it later. 
 */

public class CustomChunkAtomic extends ContextVisitor {

	private final TypeSystem ts;
	NodeFactory xnf;

	private AltSynthesizer syn;
	private Synthesizer synth;
	private Job job;
	public static X10MethodDecl_c enclosingMethod;
	public static ClassDecl_c enclosingClass;
	public static ArrayList<LocalDecl_c> LocalsForMethod = new ArrayList<LocalDecl_c>();
	public static ArrayList<LocalDecl_c> LocalsForClass = new ArrayList<LocalDecl_c>();
	private static Position PCG = Position.COMPILER_GENERATED;
	private static X10Call_c consolePrinter;
	public static int finishId = 0;
	public static Node profiledNode = null;

	public CustomChunkAtomic(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.job = job;
		this.ts = ts;
		this.xnf = xnf;
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);
		//LocalsForMethod = new ArrayList<LocalDecl_c>();
		//LocalsForClass = new ArrayList<LocalDecl_c>();
		//enclosingClass = null;
		//enclosingMethod = null;
	}

	protected NodeVisitor enterCall(Node parent, Node n) {
		
		
		if (n instanceof X10Call_c) {
			if (((X10Call_c) n).name().toString().equals("println") && ((X10Call_c) n).arguments().size()>0 ) {
				//System.out.println("Found printer");
				duplicateSubtree dupl_v = new duplicateSubtree(job, ts, xnf);
				consolePrinter = (X10Call_c) dupl_v.begin().visitEdge(null, n);
			}
		}
		return this;
	}

	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
		/*
		 * 
		 * Method changed to include chunking variables in the begining.
		 */
		if (n instanceof X10MethodDecl_c && enclosingMethod != null
				&& ((X10MethodDecl_c) n).name().equals(enclosingMethod.name())) {
			// adding the variable declaration specific to custom chunking in
			// the begining of the function statements.
			List<Stmt> oldBodyStmtList = ((Block_c) ((X10MethodDecl_c) n)
					.body()).statements();
			List<Stmt> newBodyStmtList = new ArrayList<Stmt>();
			for (LocalDecl_c s : LocalsForMethod) {
				newBodyStmtList.add(s);
			}
			for (Stmt s : oldBodyStmtList) {
				newBodyStmtList.add(s);
			}
			Block newMethodBody = syn.createBlock(PCG, newBodyStmtList);
			n = ((X10MethodDecl_c) n).body(newMethodBody);
			LocalsForMethod.clear();
			//n.prettyPrint(System.out);
			return n;

		}
		/*
		 * donot add outer finish for custom chunked block. 
		 * as there is already 2 seperate finishes inside for custom chunking.
		 * To check if they are custom chunked. Check the new final node has already a finish inside or not
		 * If yes then remove the outer finish, otherwise return the finish node as such.
		 */
		if(n instanceof Finish_c){
			QuerySubtree.queriedNodes = null;
			QuerySubtree checkFinish_v = new QuerySubtree(job, ts, xnf, Finish_c.class);
			checkFinish_v.begin();
			checkFinish_v.visitEdgeNoOverride(null,((Finish_c) n).body());
			if(QuerySubtree.queriedNodes.size() == 0)
				return n;
			else{
				//System.out.println(" hi heloo");
				return ((Finish)n).body();
			}
	
		}
		
		
		

if (n instanceof polyglot.ast.ClassDecl) {
			
			if(((ClassDecl)n).name().toString().equals(enclosingClass.name().toString())){
				List<ClassMember> listEncMem = enclosingClass.body().members();
				List<String> listNameToBeKept = new ArrayList<String>();
				for(ClassMember ci : listEncMem){
					if(ci instanceof X10FieldDecl_c && (((X10FieldDecl_c) ci).name().toString().contains("isPopulated") ||((X10FieldDecl_c) ci).name().toString().contains("myChunks")) ){
						listNameToBeKept.add(((X10FieldDecl_c)ci).name().toString());
					}
				}
				
				List<ClassMember> listMem =	((ClassDecl)n).body().members();
				List<ClassMember> listNewMem = new ArrayList<ClassMember>();
				List<FieldDef> listNewField = new ArrayList<FieldDef>();
				for(ClassMember mi : listMem){
					if(mi instanceof X10FieldDecl_c && (((X10FieldDecl_c) mi).name().toString().contains("isPopulated") ||((X10FieldDecl_c) mi).name().toString().contains("myChunks")) ){
						for(String si :listNameToBeKept){
							if((((X10FieldDecl_c) mi).name().toString().equals(si))){
								listNewMem.add(mi);
								listNewField.add(((X10FieldDecl_c)mi).fieldDef());
							}
						}
					}
					else{
						listNewMem.add(mi);
						if(mi instanceof X10FieldDecl_c){
							listNewField.add(((X10FieldDecl_c)mi).fieldDef());
						}
					}
				}
				
				X10ClassDef nDef = ((ClassDecl)n).classDef();
				nDef.setFields(listNewField);
				
				n = ((ClassDecl)n).classDef(nDef).body(((ClassDecl)n).body().members(listNewMem));
				//OutputStream os = System.out;
				//((polyglot.ast.ClassDecl_c) n).prettyPrint(os);
				
					return n;
				
				}
				//OutputStream os = System.out;
				//((polyglot.ast.ClassDecl_c) n).prettyPrint(os);
				
					return n;
			}
		
		
		if (n instanceof For_c) {

			For_c forNode = ((For_c) n);
			

			
			// get the immediately enclosing finish of this for
			// requires the traversal from root than traversing backwards.
			QueryImmediateAstParent enclFinish_v = new QueryImmediateAstParent(
					job, ts, xnf,Finish_c.class , n);
			QueryImmediateAstParent.keyParentType = Finish_c.class;
			enclFinish_v.begin(); // sets and initializes the context
			job.ast().visit(enclFinish_v);
			Node enclFinish = enclFinish_v.getImmediateParent();

			// get the async chhild of the for loop.
			Async_c asyncChild = getAsyncChild(forNode);

			// Assumes that a par-for-loop requires a Finish encosing it and a
			// async as a direct child
			if (enclFinish != null && asyncChild != null) {
				// Steps to chunk the parallel for loop onl if there is a for
				// loop inside.Which will incur load imbalance.
				// have to handle functions also.
				// get the enclosing function of this par-for-loop.
				// requires the traversal from root than traversing backwards.
				QueryImmediateAstParent encl_method = new QueryImmediateAstParent(
						job, ts, xnf,MethodDecl_c.class , n);
				
				encl_method.begin(); // sets and initializes the context
				QueryImmediateAstParent.keyParentType = X10MethodDecl_c.class;
				job.ast().visit(encl_method);
				enclosingMethod = (X10MethodDecl_c) encl_method
						.getImmediateParent();
				
				
				
				//chunk only required finish blocks
				finishId++;
				//System.out.println(finishId);
				
				ExtensionInfo extInfo   = (ExtensionInfo) job.extensionInfo();
				Configuration    config    = ((X10CompilerOptions) extInfo.getOptions()).x10_config;
				
	        if(config.CHUNK_CYCLIC){
					return performCyclicChunk((For_c)n, asyncChild);
					
				}
				else if(config.CHUNK_BLOCK){
					return performBlockChunk((For_c)n, asyncChild);
					
				}			
				else if(config.CHUNK_ATOMIC){
				// get the enclosing class decl of this par-for-loop.
				// requires the traversal from root than traversing backwards.
				QueryEnclosingClass enclosingClass_v = new QueryEnclosingClass(job, ts, xnf, n);
				enclosingClass_v.begin();
				job.ast().visit(enclosingClass_v);
				ClassDecl_c tempClass =(ClassDecl_c) enclosingClass_v.getImmediateParent();
				if(enclosingClass==null || !(tempClass.name().toString().equals(enclosingClass.name().toString()))){
					
					enclosingClass = tempClass;
				}
				
				
				
				// transform the par-for-loop
				transformParAtomic trans_v = new transformParAtomic(job, ts, xnf);
				trans_v.begin();
				trans_v.parForNode = forNode;
				trans_v.asyncNode = asyncChild;
				trans_v.finishNode = (Finish) enclFinish;
				trans_v.consolePrinter = this.consolePrinter;
				trans_v.enclosingClass = enclosingClass;
				trans_v.finishId=  finishId;
				trans_v.isConstantBound= false;
				if(LocalsForMethod.size()!=0){
				trans_v.LocalsForMethod.addAll(LocalsForMethod);
				}
				 job.ast().visit(trans_v);
				//update the enclosing class variable for next finish
				
				Node newForNode = trans_v.finalNode;
				for (LocalDecl_c var : trans_v.LocalsForMethod) {
					if (!checkIfAlreadyDeclared(var))
						LocalsForMethod.add(var);
				}

				
				if(trans_v.isConstantBound==false){
					
					List<ClassMember> listEncMem = enclosingClass.body().members();
					List<ClassMember> listNewF = new ArrayList<ClassMember>();
					for(ClassMember fi:listEncMem){
						if(fi instanceof X10FieldDecl_c && !( ((X10FieldDecl_c)fi).name().toString().equals("isPopulated"+finishId)) && !(((X10FieldDecl_c)fi).name().toString().equals("myChunks"+finishId)) ){
							listNewF.add(fi);
					}
					
				}
				 enclosingClass =(ClassDecl_c) enclosingClass.body(enclosingClass.body().members(listNewF));
				}
				/*
				 * ((X10MethodDecl_c)enclMethod).body().visit(new
				 * ClosureCaptureVisitor(this.context(), trans_v.asyncNode
				 * .asyncDef()));
				 */

				return newForNode;
				}
				 
					 
				return n;
			}

			// TODO
			// when there is no enclosing finish for the par-for-loop

			if (n instanceof Finish_c) {

				context.currentCode();

				//n.prettyPrint(System.out);

			}
		}

		return n;
	}

	/*
	 * function to get the direct async inside the for-loop.Which will then be
	 * used to custom chunk the par-for-loop.
	 * 
	 * @arg forNode : the for-loop node.
	 * 
	 * @return asyncNode : which is a direct child of the for loop.
	 * 
	 * @return null: if no such async statement exists as a child of the
	 * for-loop.
	 */
	private Async_c getAsyncChild(For_c forNode) {

		Stmt forBody = forNode.body();

		// If the forBody is a single statement, then check if it is an Async
		if (forBody instanceof Async_c) {
			return ((Async_c) forBody);
		}

		// if the forBody is a block, then check if it has an Async direct
		// child.
		else if (forBody instanceof Block_c) {
			List<Stmt> forBlock = ((Block_c) forBody).statements();
			for (Stmt s : forBlock) {
				if (s instanceof Async_c) {

					return ((Async_c) s);
				}

			}

		}
		// else return null;
		return null;
	}

	public boolean checkIfAlreadyDeclared(LocalDecl_c var) {
		boolean declared = false;
		for (LocalDecl_c loc : LocalsForMethod) {
			if (loc.name().toString().equals(var.name().toString())) {
				declared = true;
			}
		}
		return declared;
	}
	
	/**
	 * 
	 * 
	 * return null, but changes the class variable finalNode corresponding to transformed for block
	 */
	public Stmt performBlockChunk(For_c parForNode,Async_c asyncNode)  throws SemanticException{
		Stmt forNode = parForNode;
		Stmt forBody = parForNode.body();
		//nproc decl.
		LocalDecl nprocDec = addLocals("nproc");
		if(nprocDec==null){
			
			Expr nthreadAccess = synth.makeStaticField(PCG,ts.Runtime(),Name.make("NTHREADS"),ts.Long(), context) ;
			nprocDec = syn.createLocalDecl(PCG, Flags.FINAL,
						Name.make("nproc"), ts.Long(), nthreadAccess);
			
			
			LocalsForMethod.add((LocalDecl_c)nprocDec);
			
		}
		Local nprocLocal = syn.createLocal(PCG, nprocDec);
		//add to arraylist of locals.
		
		// getting the value of n:par-for-loop bound.
		AstHelper asthelper = new AstHelper(job, ts, xnf);
		Expr nExpr = asthelper.extractLoopBound((For_c) forNode);

		// creating nDec. TODO replace init expression
		LocalDecl nDec = syn.createLocalDecl(PCG, Flags.FINAL,
				Name.make("n"), ts.Long(), nExpr);
		Local nLocal = syn.createLocal(PCG, nDec);
		/*//n is now a class variable
		 Expr nLocal  = synth.makeFieldAccess(PCG,syn.createThis(PCG,enclosingClass.classDef().asType()) ,Name.make("nn"), context);
		Stmt nDec = syn.createAssignment(PCG, nLocal, Operator.ASSIGN, nExpr, this);
*/
		
		// blockSize = n%nproc==0? n/nproc : n/nproc+1;
		Expr nModnproc = syn.createBinary(PCG, nExpr, Binary.MOD, nprocLocal,
				this);
		Expr BlockSizeCond = syn.createBinary(PCG, nModnproc,
				Binary.EQ, syn.createLongLit(0), this);
		Expr BlocksizeThen = syn.createBinary(PCG, nExpr, Binary.DIV,
				nprocLocal, this);
		Expr BlockSizeElse = syn.createBinary(PCG, BlocksizeThen, Binary.ADD,
				syn.createLongLit(1), this);
		Expr BlockSizeExpr = asthelper.makeConditional(BlockSizeCond,
				BlocksizeThen, BlockSizeElse);
		LocalDecl BlockSizeDec = syn.createLocalDecl(PCG, Flags.MUTABLE,
				Name.make("blockSize"), ts.Long(), BlockSizeExpr);
		Local blockSizeLocal = syn.createLocal(PCG, BlockSizeDec);
		
		 // creating outer for-loop
		LocalDecl procDec = syn.createLocalDecl(PCG, Flags.MUTABLE,
				Name.make("proc"), ts.Long(), syn.createLongLit(0));
		Local procLocal = syn.createLocal(PCG, procDec);
		Expr outForCond = syn.createBinary(PCG, procLocal, Binary.LT,
				nprocLocal, this);
		Expr outForInc = syn.createBinary(PCG, procLocal, Binary.ADD,
				syn.createLongLit(1), this);
		Expr outForUpdate = syn.createAssign(PCG, procLocal,
				Operator.ASSIGN, outForInc, this);
		For newOuterFor = syn.createStandardFor(PCG, procDec, outForCond,
				outForUpdate, forBody);

		// t_proc=proc to be added in the forBody.
		LocalDecl tprocDec = syn.createLocalDecl(PCG,Flags.FINAL,
				Name.make("tproc"), ts.Long(), procLocal);
		Local tprocLocal = syn.createLocal(PCG, tprocDec);
		
		
		Stmt oldAsyncBody = asyncNode.body();
		//preprocessing step to push statements in between async and forlopp inside async.
		  List  concatenatedAsyncStmt = new ArrayList<Stmt>();
		  if(parForNode.body() instanceof Block_c){
             	List<Stmt> parForBodyList = ((Block_c)parForNode.body()).statements();
             	
             	for(Stmt s : parForBodyList){
             		if(s instanceof Async_c){
             			break;
             		}
             		else 
             			concatenatedAsyncStmt.add(s);               		
             	}
             }
	  for(Stmt s : ((Block_c)oldAsyncBody).statements()){
			  
			  concatenatedAsyncStmt.add(s);
		  }
		  oldAsyncBody = syn.createBlock(PCG,concatenatedAsyncStmt);
		  
		
		//create variables for inner block chunked for loop
			//int jUpper = Math.min(n < ((t_proc+1)*(blocksize)) ? n : ((t_proc+1)*(blocksize)));
		  Expr tprocPlusOne = syn.createBinary(PCG,tprocLocal,Binary.Operator.ADD,syn.createIntLit(1),this);
		  Expr tprocP1Mblock = syn.createBinary(PCG,tprocPlusOne, Binary.MUL, blockSizeLocal,this);
		  Expr nLessThanOther = syn.createBinary(PCG, nLocal,Binary.LE,tprocP1Mblock, this);
		  Expr jUpperCondExpr = asthelper.makeConditional(nLessThanOther, nLocal, tprocP1Mblock);
		  LocalDecl jUpperDecl = syn.createLocalDecl(PCG,Flags.FINAL,Name.make("jUpper"),ts.Long(),jUpperCondExpr);
		  Local jUpperLocal = syn.createLocal(PCG,jUpperDecl);
		  
		  Expr tprocMulBlock = syn.createBinary(PCG,tprocLocal,Binary.Operator.MUL,blockSizeLocal,this);
		  LocalDecl kkDecl = syn.createLocalDecl(PCG,Flags.MUTABLE,Name.make("kk"),ts.Long(),tprocMulBlock);
		  Local kkLocal = syn.createLocal(PCG,kkDecl);
		  Expr kkLTjUpper = syn.createBinary(PCG, kkLocal,Binary.LT, jUpperLocal, this);
		  Expr kkkInc = syn.createAssign(PCG,kkLocal,Operator.ADD_ASSIGN,syn.createIntLit(1),this);
		  
		  //assign kk to parforIterator.
		  LocalDecl parForIteratorDecl =(LocalDecl) parForNode.inits().get(0);
		  Local parForIteratorLocal = syn.createLocal(PCG,(LocalDecl)parForIteratorDecl);
		  //create a local var decl with same defenition as the par for iterator beacuse the previous iterator decl inside the for loop is lost now
		  LocalDecl parforItDecl = syn.createLocalDecl(PCG,parForIteratorDecl.localDef());
		   parforItDecl= parforItDecl.init(kkLocal);
		  
         // Stmt kkAssignToI = syn.createAssignment(PCG,parForIteratorLocal,Operator.ASSIGN, kkLocal,this);
          List<Stmt> kkToIAsyncList =  new ArrayList<Stmt>();
          kkToIAsyncList.add(parforItDecl);
          
          //add the statements from asyncs body and make a new block including i=kk;
         
          for(Stmt s : ((Block_c)oldAsyncBody).statements()){
          	kkToIAsyncList.add(s);
          }
         Block newAsyncBody = syn.createBlock(PCG, kkToIAsyncList);
          
			Stmt innerFor = syn.createStandardFor(PCG,kkDecl,kkLTjUpper, kkkInc,newAsyncBody);                
			List<Stmt> newAsyncStmt = new ArrayList<Stmt>();
			newAsyncStmt.add(jUpperDecl);
			newAsyncStmt.add(innerFor);
			
			
			Block asyncNewBlock = syn.createBlock(PCG,newAsyncStmt);
			
			
			
			
			AsyncDef asyncDef = (AsyncDef) AtStmt_c.createDummyAsync(
					PCG, ts, context.currentClass(), context
							.currentCode(), context.currentCode()
							.staticContext(), true);
			
			
			Async newasyncNode = nf.Async(PCG, new ArrayList<Expr>(),
					asyncNewBlock).asyncDef(asyncDef);
			asyncNode = (Async_c)newasyncNode;
			
			
			
		// add t_proc decl as loopbdy and return the block
		List<Stmt> newOuterForBody = new ArrayList<Stmt>();
		if (forBody instanceof Async_c) {
			if ((((Async_c) forBody).equals(asyncNode))) {
				//System.out.println("async found inside for loop ***********");
				newOuterForBody.add(tprocDec);
				newOuterForBody.add(asyncNode);
			}

		} else if (forBody instanceof Block_c) { // add t_proc to the
			newOuterForBody.add(tprocDec);
			List<Stmt> oldOuterForBody = ((Block_c) forBody).statements();
			// no need to add the statements before async. as they all will be
			// added
			// to inner chunked for loop.
			// TODO: check the assumption that the statements in-between the
			// par-for-loop and
			// its async are meant to be pushed inside the inner chunked loop.
			// If yes,then it can be
			// improved by pusing only variables dependend on the par-for-loop.
			boolean notAdd = true; // to add the statements after async. Check
									// notebook for more details
			for (Stmt s : oldOuterForBody) {
				if (s instanceof Async_c) {
					System.out
							.println("async found inside for loop Block ***********");
					newOuterForBody.add(asyncNode);
					notAdd = false;// add statements after this
				} else if (!notAdd) {
					newOuterForBody.add(s);
				}

			}
		}
		Block newOuterLoopBlock = syn.createBlock(PCG, newOuterForBody);
		newOuterFor = newOuterFor.body(newOuterLoopBlock);

		List outerBlockList = new ArrayList<Stmt>();

		// outerBlockList.add(nprocDec);//no need to add it here, added in the
		// function body
		outerBlockList.add(nDec);
		
		// outerBlockList.add(ksizeDec);//no need to add it here, added in the
		// function body
		outerBlockList.add(BlockSizeDec);
		outerBlockList.add(newOuterFor);

		Stmt finalNode = (Block_c) syn.createBlock(PCG, outerBlockList);

		return finalNode;
		

	}
	/**
	 * 
	 * 
	 * return null, but changes the class variable finalNode corresponding to transformed for block
	 */
	public Stmt performCyclicChunk(For_c parForNode,Async_c asyncNode)  throws SemanticException{
		Stmt forNode = parForNode;
		Stmt forBody = parForNode.body();
		//nproc decl.
		LocalDecl nprocDec = addLocals("nproc");
		if(nprocDec==null){
			
			Expr nthreadAccess = synth.makeStaticField(PCG,ts.Runtime(),Name.make("NTHREADS"),ts.Long(), context) ;
			nprocDec = syn.createLocalDecl(PCG, Flags.FINAL,
						Name.make("nproc"), ts.Long(), nthreadAccess);
			
			
			LocalsForMethod.add((LocalDecl_c)nprocDec);
			
		}
		Local nprocLocal = syn.createLocal(PCG, nprocDec);
		//add to arraylist of locals.
		
		// getting the value of n:par-for-loop bound.
		AstHelper asthelper = new AstHelper(job, ts, xnf);
		Expr nExpr = asthelper.extractLoopBound((For_c) forNode);

		// creating nDec. TODO replace init expression
		LocalDecl nDec = syn.createLocalDecl(PCG, Flags.FINAL,
				Name.make("n"), ts.Long(), nExpr);
		Local nLocal = syn.createLocal(PCG, nDec);
		
		/*//n is now a class variable
		 Expr nLocal  = synth.makeFieldAccess(PCG,syn.createThis(PCG,enclosingClass.classDef().asType()) ,Name.make("nn"), context);
		Stmt nDec = syn.createAssignment(PCG, nLocal, Operator.ASSIGN, nExpr, this);
*/
		
		
		 // creating outer for-loop
		LocalDecl procDec = syn.createLocalDecl(PCG, Flags.MUTABLE,
				Name.make("proc"), ts.Long(), syn.createLongLit(0));
		Local procLocal = syn.createLocal(PCG, procDec);
		Expr outForCond = syn.createBinary(PCG, procLocal, Binary.LT,
				nprocLocal, this);
		Expr outForInc = syn.createBinary(PCG, procLocal, Binary.ADD,
				syn.createLongLit(1), this);
		Expr outForUpdate = syn.createAssign(PCG, procLocal,
				Operator.ASSIGN, outForInc, this);
		For newOuterFor = syn.createStandardFor(PCG, procDec, outForCond,
				outForUpdate, forBody);

		// t_proc=proc to be added in the forBody.
		LocalDecl tprocDec = syn.createLocalDecl(PCG,Flags.FINAL,
				Name.make("tproc"), ts.Long(), procLocal);
		Local tprocLocal = syn.createLocal(PCG, tprocDec);
		
		
		Stmt oldAsyncBody = asyncNode.body();
		//preprocessing step to push statements in between async and forlopp inside async.
		  List  concatenatedAsyncStmt = new ArrayList<Stmt>();
		  if(parForNode.body() instanceof Block_c){
             	List<Stmt> parForBodyList = ((Block_c)parForNode.body()).statements();
             	
             	for(Stmt s : parForBodyList){
             		if(s instanceof Async_c){
             			break;
             		}
             		else 
             			concatenatedAsyncStmt.add(s);               		
             	}
             }
	  for(Stmt s : ((Block_c)oldAsyncBody).statements()){
			  
			  concatenatedAsyncStmt.add(s);
		  }
		  oldAsyncBody = syn.createBlock(PCG,concatenatedAsyncStmt);
		  
		
		//create variables for inner block chunked for loop
			//int jUpper = Math.min(n < ((t_proc+1)*(blocksize)) ? n : ((t_proc+1)*(blocksize)));
		  Expr tprocPlusOne = syn.createBinary(PCG,tprocLocal,Binary.Operator.ADD,syn.createIntLit(1),this);
		
		  LocalDecl kkDecl = syn.createLocalDecl(PCG,Flags.MUTABLE,Name.make("kk"),ts.Long(),tprocLocal);
		  Local kkLocal = syn.createLocal(PCG,kkDecl);
		  Expr kkLTn = syn.createBinary(PCG, kkLocal,Binary.LT, nLocal, this);
		  Expr kkkInc = syn.createAssign(PCG,kkLocal,Operator.ADD_ASSIGN,nprocLocal,this);
		  
		  //assign kk to parforIterator.
		  LocalDecl parForIteratorDecl =(LocalDecl) parForNode.inits().get(0);
		  Local parForIteratorLocal = syn.createLocal(PCG,(LocalDecl)parForIteratorDecl);
		  //create a local var decl with same defenition as the par for iterator beacuse the previous iterator decl inside the for loop is lost now
		  LocalDecl parforItDecl = syn.createLocalDecl(PCG,parForIteratorDecl.localDef());
		   parforItDecl= parforItDecl.init(kkLocal);
		  
         // Stmt kkAssignToI = syn.createAssignment(PCG,parForIteratorLocal,Operator.ASSIGN, kkLocal,this);
          List<Stmt> kkToIAsyncList =  new ArrayList<Stmt>();
          kkToIAsyncList.add(parforItDecl);
          
          //add the statements from asyncs body and make a new block including i=kk;
         
          for(Stmt s : ((Block_c)oldAsyncBody).statements()){
          	kkToIAsyncList.add(s);
          }
         Block newAsyncBody = syn.createBlock(PCG, kkToIAsyncList);
          
			Stmt innerFor = syn.createStandardFor(PCG,kkDecl,kkLTn, kkkInc,newAsyncBody);                
			List<Stmt> newAsyncStmt = new ArrayList<Stmt>();
			
			newAsyncStmt.add(innerFor);
			
			
			Block asyncNewBlock = syn.createBlock(PCG,newAsyncStmt);
			
			
			
			
			AsyncDef asyncDef = (AsyncDef) AtStmt_c.createDummyAsync(
					PCG, ts, context.currentClass(), context
							.currentCode(), context.currentCode()
							.staticContext(), true);
			
			
			Async newasyncNode = nf.Async(PCG, new ArrayList<Expr>(),
					asyncNewBlock).asyncDef(asyncDef);
			asyncNode = (Async_c)newasyncNode;
			
			
			
		// add t_proc decl as loopbdy and return the block
		List<Stmt> newOuterForBody = new ArrayList<Stmt>();
		if (forBody instanceof Async_c) {
			if ((((Async_c) forBody).equals(asyncNode))) {
				//System.out.println("async found inside for loop ***********");
				newOuterForBody.add(tprocDec);
				newOuterForBody.add(asyncNode);
			}

		} else if (forBody instanceof Block_c) { // add t_proc to the
			newOuterForBody.add(tprocDec);
			List<Stmt> oldOuterForBody = ((Block_c) forBody).statements();
			// no need to add the statements before async. as they all will be
			// added
			// to inner chunked for loop.
			// TODO: check the assumption that the statements in-between the
			// par-for-loop and
			// its async are meant to be pushed inside the inner chunked loop.
			// If yes,then it can be
			// improved by pusing only variables dependend on the par-for-loop.
			boolean notAdd = true; // to add the statements after async. Check
									// notebook for more details
			for (Stmt s : oldOuterForBody) {
				if (s instanceof Async_c) {
					System.out
							.println("async found inside for loop Block ***********");
					newOuterForBody.add(asyncNode);
					notAdd = false;// add statements after this
				} else if (!notAdd) {
					newOuterForBody.add(s);
				}

			}
		}
		Block newOuterLoopBlock = syn.createBlock(PCG, newOuterForBody);
		newOuterFor = newOuterFor.body(newOuterLoopBlock);

		List outerBlockList = new ArrayList<Stmt>();

		// outerBlockList.add(nprocDec);//no need to add it here, added in the
		// function body
		outerBlockList.add(nDec);
		
		// outerBlockList.add(ksizeDec);//no need to add it here, added in the
		// function body
		
		outerBlockList.add(newOuterFor);

		Stmt finalNode = (Block_c) syn.createBlock(PCG, outerBlockList);

		return finalNode;
		

	}
	
	
	/*
	 * function to check if the local variable is already defined.
	 * 
	 */
	public LocalDecl_c addLocals(String name){
		for(LocalDecl_c l:LocalsForMethod){
			if(l.name().toString().equals(name))
				return l;
		}
		return null;
	}
	
	
	

}

