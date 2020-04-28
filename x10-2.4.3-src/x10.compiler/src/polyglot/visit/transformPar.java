package polyglot.visit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.plaf.synth.SynthViewportUI;
import javax.swing.text.DefaultEditorKit.CutAction;

import com.sun.corba.se.impl.javax.rmi.CORBA.Util;
import com.sun.nio.sctp.AssociationChangeNotification.AssocChangeEvent;
import com.sun.org.apache.bcel.internal.generic.IINC;

import polyglot.ast.Assign;
import polyglot.ast.Assign.Operator;
import polyglot.ast.Block;
import polyglot.ast.Block_c;
import polyglot.ast.BooleanLit_c;
import polyglot.ast.Call;
import polyglot.ast.Call_c;
import polyglot.ast.ClassDecl_c;
import polyglot.ast.Eval_c;
import polyglot.ast.Expr;
import polyglot.ast.Field;
import polyglot.ast.FieldDecl_c;
import polyglot.ast.FlagsNode;
import polyglot.ast.For;
import polyglot.ast.ForInit;
import polyglot.ast.For_c;
import polyglot.ast.Formal;
import polyglot.ast.Id;
import polyglot.ast.IntLit_c;
import polyglot.ast.Loop_c;
import polyglot.ast.Local;
import polyglot.ast.LocalAssign_c;
import polyglot.ast.LocalDecl;
import polyglot.ast.LocalDecl_c;
import polyglot.ast.Local_c;
import polyglot.ast.Loop;
import polyglot.ast.Loop_c;
import polyglot.ast.MethodDecl;
import polyglot.ast.MethodDecl_c;
import polyglot.ast.Node;
import polyglot.ast.NodeFactory;
import polyglot.ast.Node_c;
import polyglot.ast.Receiver;
import polyglot.ast.Stmt;
import polyglot.ast.Term;
import polyglot.ast.TypeNode;
import polyglot.frontend.FileResource;
import polyglot.frontend.FileSource;
import polyglot.frontend.Job;
import polyglot.frontend.Parser;
import polyglot.types.ClassDef;
import polyglot.types.ConstructorDef;
import polyglot.types.ConstructorInstance;
import polyglot.types.Context;
import polyglot.types.FieldDef;
import polyglot.types.FieldDef_c;
import polyglot.types.Flags;
import polyglot.types.MethodDef_c;
import polyglot.types.Name;
import polyglot.types.ParsedTypeObject;
import polyglot.types.SemanticException;
import polyglot.types.Type;
import polyglot.types.TypeSystem;
import polyglot.types.TypeSystem_c;
import polyglot.types.Types;
import polyglot.util.ErrorInfo;
import polyglot.util.ErrorQueue;
import polyglot.util.Position;
import x10.ast.*;
import x10.errors.Errors.NoAssignmentInDepType;
import x10.extension.X10Del;
import x10.types.AsyncDef;
import x10.types.X10ClassDef;
import x10.types.X10ClassDef_c;
import x10.types.X10CodeDef;
import x10.types.X10FieldDef;
import x10.types.X10LocalInstance;
import x10.types.X10ParsedClassType;
import x10.util.AltSynthesizer;
import x10.util.Synthesizer;
import x10.visit.X10TypeChecker;
import polyglot.ast.Binary;
import sun.util.LocaleDataMetaInfo;
import x10.util.synthesizer.FieldSynth;
/*
 * @author Indu
 * 
 * Transforms the Par-for-loop, with an enclosing finish and an async inside the
 * for-loop.
 * 
 * 
 * TODO 1) replace nproc initializing expression by reading the command line
 * arguments
 */
class transformParFor extends ContextVisitor {

	private final TypeSystem ts;
	NodeFactory xnf;
	private AltSynthesizer syn;
	private Synthesizer synth;
	public static For_c parForNode;
	public static Async_c asyncNode;
	public static Finish finishNode;
	public static Block_c finalNode;
	public static ClassDecl_c enclosingClass;
	public static int finishId ;
	private static List<MethodDecl> funAfterVisit ;
	public static Node profiledProg ;
	public static boolean isConstantBound;
	
	public  static ArrayList<LocalDecl_c> LocalsForMethod;
	private static Position PCG = Position.COMPILER_GENERATED;
	private Job job;
    public static X10Call_c consolePrinter;
	/*public transformParFor(Job job, TypeSystem ts, NodeFactory xnf,
			For_c forNode, Async_c asyncNode, Finish_c finishNode) {
		super(job, ts, xnf);
		this.job = job;
		this.ts = ts;
		this.xnf = xnf;
		this.parForNode = forNode;
		this.asyncNode = asyncNode;
		this.finishNode = finishNode;

		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);

	}*/

	public transformParFor(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.job = job;
		this.ts = ts;
		this.xnf = xnf;

		this.parForNode = null;
		this.asyncNode = null;
		this.finishNode = null;
	
		LocalsForMethod=new ArrayList<LocalDecl_c>();
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);

	}
	

	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
		
		
        
		if (n.equals(parForNode)) {

			//System.out.println(context.currentCode());
			//System.out.println("Starting to change the par-for-loop");
			Stmt forNode = parForNode;
			Stmt forBody = parForNode.body();
			
			// Cost calculation (to be done here so that statement profiler and cost generator are similar)
			// calling the cost function calculator.
		
			//create Timer variable arrays and their initialisation.
			LocalDecl startArrayDecl = makeNewRailDecl(syn.createLongLit(1000), ts.Long(), ts.Long(),"startTime" ,syn.createLongLit(0));
			Local startArrayLocal  = syn.createLocal(PCG,startArrayDecl);
			
			LocalDecl endArrayDecl = makeNewRailDecl(syn.createLongLit(1000), ts.Long(), ts.Long(),"endTime" ,syn.createLongLit(0));
			Local endArrayLocal  = syn.createLocal(PCG,endArrayDecl);
			
			LocalDecl estArrayDecl = makeNewRailDecl(syn.createLongLit(1000), ts.Long(), ts.Long(),"estTime" ,syn.createLongLit(0));
			Local estArrayLocal  = syn.createLocal(PCG,estArrayDecl);
			
			//profile the statement using the same profiler used in profiling step.
			
			
			/*	//startHere

			   
			    * check if there are any user defined function calls inside this parallel for loop if yes then first visit all those function nodes.
			   
			   QueryUserFunctionCalls funToVisit_v = new QueryUserFunctionCalls(job, ts, xnf);
			   funToVisit_v.begin().visitEdgeNoOverride(null,asyncNode.body() );
			   List<MethodDecl> funToVisit =  QueryUserFunctionCalls.funToVisit;
			   
			   for(MethodDecl mi : funToVisit){
				  
					//create Timer variable arrays and their initialisation.
					LocalDecl startArrayDeclNew = makeNewRailDecl(syn.createLongLit(1000), ts.Long(), ts.Long(),"startTime" ,syn.createLongLit(0));
					Local startArrayLocalNew  = syn.createLocal(PCG,startArrayDeclNew);
					
					LocalDecl endArrayDeclNew = makeNewRailDecl(syn.createLongLit(1000), ts.Long(), ts.Long(),"endTime" ,syn.createLongLit(0));
					Local endArrayLocalNew  = syn.createLocal(PCG,endArrayDeclNew);
					
					LocalDecl estArrayDeclNew = makeNewRailDecl(syn.createLongLit(1000), ts.Long(), ts.Long(),"estTime" ,syn.createLongLit(0));
					Local estArrayLocalNew  = syn.createLocal(PCG,estArrayDeclNew);
				
					StatementProfiler stmtProfiler_v = new StatementProfiler(job, ts, xnf);
					stmtProfiler_v.startTimer=startArrayLocalNew;
					stmtProfiler_v.endTimer=endArrayLocalNew;
					stmtProfiler_v.estTimer=estArrayLocalNew;
					if(funAfterVisit.size()>0){
					 stmtProfiler_v.funToCheck = funAfterVisit;
					}
					Block newMiBody = (Block)stmtProfiler_v.begin().visitEdge(null,mi.body());
					
					//adding the fileWriter to the outer block.
					List<Stmt> newOuterBlock=new ArrayList<Stmt>();
					newOuterBlock.addAll(newMiBody.statements());
					
					Block newForOuterBlock = syn.createBlock(PCG,newOuterBlock);
					
					MethodDecl newMi =(MethodDecl) mi.body(newForOuterBlock);
					funAfterVisit.add(newMi);
					//System.out.println(" here ");
			 }
			   //profile the actual body
			    StatementProfiler stmtProf_v = new StatementProfiler(job, ts, xnf);
			    stmtProf_v.startTimer=startArrayLocal;
				stmtProf_v.endTimer=endArrayLocal;
				stmtProf_v.estTimer=estArrayLocal;
				stmtProf_v.funToCheck = funToVisit;
				Node profiledBody = stmtProf_v.begin().visitEdgeNoOverride(null, asyncNode.body());
				//System.out.println("new profiled body");
				profiledBody.prettyPrint(System.out);
			   
			*/
				//generate cost function, atomic and non atomic combined.
				
				if(this.profiledProg == null){
				ChunkProfileInstrumentation chunk_v = new ChunkProfileInstrumentation(job, ts, xnf);
				chunk_v = (ChunkProfileInstrumentation)chunk_v.begin();
				Node profileProg = job.ast().visit(chunk_v);
				
				PostChunking postChunk_v = new PostChunking(job, ts, xnf);
				postChunk_v =(PostChunking) postChunk_v.begin();
				profileProg = profileProg.visit(postChunk_v);
				this.profiledProg = profileProg;
				this.funAfterVisit = postChunk_v.funAfterVisit;
				//List<MethodDecl> funsProfiled = chunk_v.funAfterVisit;
				}
				//find user defined functions inside this async body
				/*QueryUserFunctionCalls funToVisit_v = new QueryUserFunctionCalls(job, ts, xnf);
				funToVisit_v.begin().visitEdgeNoOverride(null,asyncNode.body() );
				List<MethodDecl> funToVisit =  QueryUserFunctionCalls.funToVisit;
				*/
				   
				List<MethodDecl> funAfterVisit = this.funAfterVisit;
				getProfiledAsyncBody getAsyncBody_v = new getProfiledAsyncBody(job, ts, xnf);
				getAsyncBody_v.forToSearch= parForNode;
				getAsyncBody_v.begin().visitEdgeNoOverride(null,this.profiledProg );
				//get the async body from the for node returned
				int sizeOfElem = ((Block_c) getAsyncBody_v.forFound.body()).statements().size();
				Node profiledBody = ((Block_c) getAsyncBody_v.forFound.body()).statements().get(sizeOfElem-1);
				//first generate a cost function list for all the functions called in this current loop.
				
			
				HashMap<String,Node> costFuncMap = new HashMap<String, Node>();
				for(MethodDecl mi : funAfterVisit){
					CostFunctionGenerator costFuncGen_v = new CostFunctionGenerator(job, ts, xnf,mi.body());
					costFuncGen_v.funAfterVisit=funAfterVisit;
					costFuncGen_v.costFuncMap = costFuncMap;
					Node costFunction = costFuncGen_v.begin().visitEdgeNoOverride(null,mi.body());
					//add the costfunctions to respective maps
					costFuncMap.put(mi.name().toString(), costFunction);
			}
			 Node costFunction = null;
		 
			//cost functions for the actual loop body
			CostFunctionGenerator costFuncGen_v = new CostFunctionGenerator(job, ts, xnf,asyncNode );
			costFuncGen_v.funAfterVisit=funAfterVisit;
			costFuncGen_v.costFuncMap = costFuncMap;
			costFunction = costFuncGen_v.begin().visitEdgeNoOverride(null,profiledBody);
			Block specialLoopBoundBlock = syn.createBlock(PCG, costFuncGen_v.specialBoundStmts);
			Boolean innnerLoopHandeled = costFuncGen_v.innerLoopHandled;
			//check if the costFunction generated is correct
			if(costFuncGen_v.isBoundRedefined){
				//System.out.println("loop bound redefined, switching to  default ");
				performBlockChunk();
			//	performCyclicChunk(parForNode, asyncNode);
				return n;
			}
			
			
       
            //cost calculation and assignment
			
			//check if its beneficial to do a custom chunking otherwise skip and do a block chunking 
			getLoopIteratorToReplace getIt_v = new getLoopIteratorToReplace(job, ts, xnf, (LocalDecl_c)parForNode.inits().get(0));
			getIt_v.begin().visitEdge(null, parForNode.body());
			Local_c varToreplace = getIt_v.varToReplace;
			//System.out.println("var to replace "+ varToreplace);
		
			loadImbalanceChecker checkImbalance = new loadImbalanceChecker(job, ts, xnf);
			checkImbalance.parForIterator=varToreplace.name().id();
			Stmt canBeChunked = (Stmt)checkImbalance.begin().visitEdgeNoOverride(null, costFunction);
			if(checkImbalance.dependsOnFor == false){
				//System.out.println(forBody+"no beneficial loop inside par for loop");
				performBlockChunk();
				return n;
				//call function to chunk in block.
				
			}
			
			//cleanup the costFunction by evaluating all available expressions.
			for(int cl=0;cl<30;cl++){
			cleanUpCostFunction cleanCostFuncton_v = new cleanUpCostFunction(job, ts, xnf);
			costFunction = cleanCostFuncton_v.begin().visitEdgeNoOverride(null,costFunction);
			}
			//System.out.println("after cleaning up");
			
			//costFunction.prettyPrint(System.out);
			
			/*check if the loop bounds and the cost function remains unchanged through the entire 
			 * call cycle of the for loop.
			 * 
			 */
			//get lis of variables in the costFunction
			
			getVarUse getuses_v = new getVarUse(job, ts, xnf);
			getuses_v.begin().visitEdge(null,costFunction);
			List<Name> listOfUses= getVarUse.listUses;
			
			//System.out.println(" variables in for expr ");
			for(Name d :listOfUses){
				//System.out.println( d);
			}
			boolean constatntBound = true; 
			//boolean constatntBound = false;//commenting for overhead check
			for(Name ni :listOfUses){
				if(!ni.toString().equals(varToreplace.name().toString())){
					constantLoopBoundChecker constBoundCheck_v = new constantLoopBoundChecker(job, ts, xnf,ni );
					constBoundCheck_v.isRedefined = false; constBoundCheck_v.countRedefined=0;
					constBoundCheck_v = (constantLoopBoundChecker)constBoundCheck_v.begin();
					job.ast().visit(constBoundCheck_v);
					if(constBoundCheck_v.isRedefined == true){
						if(constBoundCheck_v.countRedefined >1){
							constatntBound = false;
						}
					}
				}
			}
			// creating nrpoc. TODO replace init expression
						LocalDecl nprocDec = addLocals("nproc");
						if(nprocDec==null){
							
							Expr nthreadAccess = synth.makeStaticField(PCG,ts.Runtime(),Name.make("NTHREADS"),ts.Long(), context) ;
							nprocDec = syn.createLocalDecl(PCG, Flags.FINAL,
										Name.make("nproc"), ts.Long(), nthreadAccess);
							/*nprocDec = syn.createLocalDecl(PCG, Flags.MUTABLE,
										Name.make("nproc"), ts.Long(), syn.createLongLit(8));*/
							LocalsForMethod.add((LocalDecl_c)nprocDec);
						}
						
						Local nprocLocal = syn.createLocal(PCG, nprocDec);
		/*// creating nrpoc. TODO replace init expression
			LocalDecl nprocDec = addLocals("nproc");
			X10LocalInstance xi=null;
			Local nprocLocal = null;
			if(nprocDec==null){
				
				xi = context.findLocal(Name.make("nproc"));
				if(xi == null){
				
				
				Expr nthreadAccess = synth.makeStaticField(PCG,ts.Runtime(),Name.make("NTHREADS"),ts.Long(), context) ;
				nprocDec = syn.createLocalDecl(PCG, Flags.FINAL,
							Name.make("nproc"), ts.Long(), nthreadAccess);
				nprocDec = syn.createLocalDecl(PCG, Flags.MUTABLE,
							Name.make("nproc"), ts.Long(), syn.createLongLit(8));
				LocalsForMethod.add((LocalDecl_c)nprocDec);
				 nprocLocal = syn.createLocal(PCG, nprocDec);
				}
				else{
					//LocalsForMethod.add((LocalDecl_c)syn.createLocalDecl(PCG, xi.def()));
					 nprocLocal = syn.createLocal(PCG, xi);
					
				}
				
			}
			
			
			
			//add to arraylist of locals.
*/			
			
			

			/*// creating ksize : ksize = 2;TODO : accept the command line args
			LocalDecl ksizeDec = addLocals("ksize");
			if(ksizeDec==null){
				 ksizeDec = syn.createLocalDecl(PCG, Flags.MUTABLE,
							Name.make("ksize"), ts.Long(), syn.createLongLit(4));
				 LocalsForMethod.add((LocalDecl_c)ksizeDec);
					
			}
		
			Local ksizeLocal = syn.createLocal(PCG, ksizeDec);
			//add to arraylist of locals.
*/			
			
			// getting the value of n:par-for-loop bound.
			AstHelper asthelper = new AstHelper(job, ts, xnf);
			Expr nExpr = asthelper.extractLoopBound((For_c) forNode);
			
			// creating nrpoc. TODO replace init expression
			LocalDecl nDec = syn.createLocalDecl(PCG, Flags.FINAL,
								Name.make("nn"), ts.Long(),nExpr);
			Local nLocal = syn.createLocal(PCG, nDec);
			
			/*//n is now a class variable
			 Expr nLocal  = synth.makeFieldAccess(PCG,syn.createThis(PCG,enclosingClass.classDef().asType()) ,Name.make("nn"), context);
			Stmt nDec = syn.createAssignment(PCG, nLocal, Operator.ASSIGN, nExpr, this);
*/
			// var costArray:Rail[long] = new Rail[long](n,0);
			
			/*LocalDecl costArrayDec = addLocals("costArray");
			if(costArrayDec == null){
				costArrayDec = makeNewRailDeclNoInit(nExpr, ts.Long(),	ts.Long(), "costArray");
				LocalsForMethod.add((LocalDecl_c)costArrayDec);
				
			}*/
			
			
			Expr costArrayLocal = synth.makeFieldAccess(PCG, syn.createThis(PCG,enclosingClass.classDef().asType()), Name.make("costArray") , context);
			
			//Local costArrayLocal = syn.createLocal(PCG, costArrayDec);
			LocalDecl tempDeclCostArray = makeNewRailDeclWithNew(nExpr, ts.Long(),	ts.Long(), "costArray");
			Stmt costArrayReAssign = syn.createAssignment(PCG, costArrayLocal,Operator.ASSIGN,tempDeclCostArray.init() , this);		
			
			
			
			// var partialCostArray:Rail[long] = new Rail[long](nproc,0);
			/*LocalDecl partialCostArrayDec  = addLocals("partialCostArray");
			if(partialCostArrayDec==null){
				partialCostArrayDec = makeNewRailDeclNoInit(nprocLocal, ts.Long(),	ts.Long(), "partialCostArray");
				LocalsForMethod.add((LocalDecl_c)partialCostArrayDec);
			}
			*/
			
			Expr partialCostArrayLocal = synth.makeFieldAccess(PCG, syn.createThis(PCG,enclosingClass.classDef().asType()), Name.make("partialCostArray") , context);
			
			//Local partialCostArrayLocal = syn.createLocal(PCG, partialCostArrayDec);
			LocalDecl tempDeclpartialCostArray = makeNewRailDeclWithNew(nprocLocal, ts.Long(),	ts.Long(), "partialCostArray");
			Stmt partialCostArrayReAssign = syn.createAssignment(PCG, partialCostArrayLocal,Operator.ASSIGN,tempDeclpartialCostArray.init() , this);		
			


			//block = (n+nproc -1 )/nproc;
			Expr nPlNrpoc = syn.createBinary(PCG, nLocal, Binary.ADD, nprocLocal, this);
			Expr nPlNprocM1 = syn.createBinary(PCG,nPlNrpoc, Binary.SUB, syn.createLongLit(1),this);
			Expr blockExpr = syn.createBinary(PCG,nPlNprocM1, Binary.DIV, nprocLocal, this);
			
			LocalDecl_c blockDecl = (LocalDecl_c)syn.createLocalDecl(PCG, Flags.FINAL,Name.make("block"),blockExpr);
			Local blockLocal = syn.createLocal(PCG, blockDecl);
			

			//mychunk array 
			 
			//var myChunks:Rail[chunk] = new Rail[chunk][nproc,new chunk()]
			// get the chunk class declaration node.
			getChunkClassVisitor chunkClassDecl_v = new getChunkClassVisitor(
						job, ts, xnf);
			chunkClassDecl_v.begin().visitEdgeNoOverride(null, job.ast());
			ClassDecl_c chunkClassDecl = chunkClassDecl_v.chunkNode;
			
			
			
		    
			//new chunk();
			Expr newChunk = synth.makeNewInstance(PCG,
					chunkClassDecl.classDef(), new ArrayList<Type>(),
						new ArrayList<Expr>(), null, context);
			Stmt newChunkStmt = syn.createEval(newChunk);
				
				  List closureStmts = new ArrayList<Stmt>();
				  closureStmts.add(newChunkStmt); Block closureBody =
				  syn.createBlock(PCG, closureStmts); List closureParams = new
				  ArrayList<Formal>(); Formal iParam = synth.createFormal(PCG,
				  ts.Long(), Name.make("i"), Flags.NONE);
				  closureParams.add(iParam);
				  
				  
				  Expr chunkInitClosure =
				  synth.makeClosure(PCG,chunkClassDecl.classDef().asType() ,
				  closureParams, closureBody,context());
				 
				// creating myChunks[chunk] to store the chunks info.
				LocalDecl myChunksDecl = makeNewRailDeclNoInit(nprocLocal, ts.Long(),chunkClassDecl.classDef().asType(), "myChunks");
			//	LocalsForMethod.add((LocalDecl_c)myChunksDecl);
				Local myChunksLocal = syn.createLocal(PCG, myChunksDecl);
				
				
				
				
				
			

			
			
			
			
			//finish async block to calculate costArray 
			/*
			 * finish {
			 * 	for(var proc:long =0 ; proc<nproc ; proc++){
			 * 		val t_proc:long=proc;
			 * 		async{
			 * 			var procCost:long=0;
			 * 			val jUpper:long= Math.min(n,((t_proc+1)*(block)));
			 * 			for(..){
			 * 				var iiCost:long = costFunc;
			 * 				procCost +=iiCost;
			 * 				costarray(ii)=iiCost;
			 * 			}
			 * 			partialCostArr(t_proc) = procCost;			
			 * 			... 
			 * 		}
			 * 
			 *  }
			 * }
			 */
			 //statements inside for
			 LocalDecl_c procForCostCom =(LocalDecl_c) syn.createLocalDecl(PCG,Flags.MUTABLE,Name.make("proc"), ts.Long(),syn.createLongLit(0));
			 Local_c procForCostComLocal = (Local_c)syn.createLocal(PCG,procForCostCom);
			 Expr procLessN = syn.createBinary(PCG,procForCostComLocal,Binary.LT, nprocLocal, this);
			 Expr procInc = syn.createAssign(PCG,procForCostComLocal, Operator.ADD_ASSIGN, syn.createLongLit(1), this);
			 
			 LocalDecl_c tprocForCostCom = (LocalDecl_c) syn.createLocalDecl(PCG,Flags.FINAL,Name.make("tproc"), ts.Long(),procForCostComLocal);
			 Local tprocForCostLocal = syn.createLocal(PCG, tprocForCostCom);
			 
			 
			 //statements inside async
			 
			 //proCost 
			 LocalDecl procCostDecl = syn.createLocalDecl(PCG,Flags.MUTABLE, Name.make("procCost"),ts.Long(), syn.createLongLit(0));
			 Local procCostLocal = syn.createLocal(PCG,procCostDecl);
			 //Jupper
			 Expr tprocPlusOne = syn.createBinary(PCG,tprocForCostLocal,Binary.Operator.ADD,syn.createIntLit(1),this);
			 Expr tprocP1Mblock = syn.createBinary(PCG,tprocPlusOne, Binary.MUL, blockLocal,this);
			 Expr nLessThanOther = syn.createBinary(PCG, nLocal,Binary.LE,tprocP1Mblock, this);
			 Expr jUpperCondExpr = asthelper.makeConditional(nLessThanOther, nLocal, tprocP1Mblock);
			 LocalDecl jUpperDecl = syn.createLocalDecl(PCG,Flags.FINAL,Name.make("jUpper"),ts.Long(),jUpperCondExpr);
			 Local jUpperLocal = syn.createLocal(PCG,jUpperDecl);
			  
			  
			 List<Expr> partCostArrayLoopArgs = new ArrayList<Expr>();
			 partCostArrayLoopArgs.add(tprocForCostLocal);
			 partCostArrayLoopArgs.add(procCostLocal);
				
		    	List<Type> partCostArrayLoopArgTypes = new ArrayList<Type>();
				partCostArrayLoopArgTypes.add(ts.Long());
				partCostArrayLoopArgTypes.add(ts.Long());
				
				Call partCostArrayAssign = synth.makeInstanceCall(PCG,partialCostArrayLocal ,
						Name.make("operator()="),new ArrayList<TypeNode>(),
						partCostArrayLoopArgs, ts.Long(), partCostArrayLoopArgTypes,context);
				Stmt partCostArrayAssignStmt = syn.createEval(partCostArrayAssign);
				
				
			  //inner for 
				Expr tprocMulBlock = syn.createBinary(PCG, tprocForCostLocal, Binary.MUL,blockLocal,this);
				LocalDecl iiDecl = syn.createLocalDecl(PCG,Flags.MUTABLE,Name.make("ii"),ts.Long(),
						tprocMulBlock);
				Local iiLocal = syn.createLocal(PCG,iiDecl);
				Expr iiInc = syn.createAssign(PCG, iiLocal,Operator.ADD_ASSIGN, syn.createLongLit(1), this);
				
				Expr iiLeThJupper = syn.createBinary(PCG, iiLocal,Binary.LT,jUpperLocal, this);
				
				/*******/

				
				LocalDecl costArrayIterator = iiDecl;
				Local_c costArrayIteratorLocal =(Local_c) syn.createLocal(PCG, costArrayIterator);
				LocalDecl_c costArrayIteratorPoint=null;
				Local_c costArrayIteratorPointLocal=null;
				Stmt costArrayIteratorPointAssign = null;
				//if ii should be converted to point type
				if(varToreplace.type().toString().equals(ts.Point().toString())){
					replacePointIteratorToLongIterator	replacePointToLong_v =new replacePointIteratorToLongIterator(job, ts, xnf,varToreplace);
					costFunction = replacePointToLong_v.begin().visitEdgeNoOverride(null, costFunction);	
				}
				
				
				
				
				
				
				
				
				
				
				/*if(varToreplace.type().toString().equals(ts.Point().toString())){
					List<Type> makeargType = new ArrayList<Type>();
					makeargType.add(ts.Long());
					List<Expr> exprArgs = new ArrayList<Expr>();
					exprArgs.add(costArrayIteratorLocal);
					List typesArgsmake= new ArrayList<TypeNode>();
					Expr makeOfii =synth.makeStaticCall(PCG, (Type)ts.Point(),Name.make("make"),
							typesArgsmake,exprArgs , ts.Point(),makeargType , context);
					
					costArrayIteratorPoint =(LocalDecl_c) syn.createLocalDecl(PCG, Flags.MUTABLE, Name.make("iiPoint"), ts.Point()); 
					 costArrayIteratorPointLocal= (Local_c)syn.createLocal(PCG,costArrayIteratorPoint);
					 
					costArrayIteratorPointAssign = syn.createAssignment(PCG, costArrayIteratorPointLocal, Operator.ASSIGN, makeOfii, this);
					
					replaceOldVarToNewVar replaceIt_v = new replaceOldVarToNewVar(job, ts, xnf,varToreplace ,costArrayIteratorPointLocal );
					costFunction = replaceIt_v.begin().visitEdgeNoOverride(null, costFunction);
					//System.out.println("new costFunction");
					costFunction.prettyPrint(System.out);
				}
				else*/{
					
					replaceOldVarToNewVar replaceIt_v = new replaceOldVarToNewVar(job, ts, xnf,varToreplace ,costArrayIteratorLocal );
					costFunction = replaceIt_v.begin().visitEdgeNoOverride(null, costFunction);
					//System.out.println("new costFunction");
				//	costFunction.prettyPrint(System.out);
				}
				
				
				Expr costFuncExpr=null;
				if(costFunction instanceof Eval_c)
				{
					costFuncExpr= ((Eval_c)costFunction).expr();
				//	costFuncExpr = syn.createBinary(PCG, costFuncExpr, Binary.ADD, syn.createLongLit(1),this);
				}
				
				
				
				
				
				LocalDecl iiCostComDecl = syn.createLocalDecl(PCG, Flags.FINAL, Name.make("iiCost"),ts.Long(), costFuncExpr);
				Local iiCostComLocal = syn.createLocal(PCG,iiCostComDecl);
				//procCost assignment
				Stmt procCostAssignment = syn.createAssignment(PCG, procCostLocal, Operator.ADD_ASSIGN,iiCostComLocal , this);
				//costArrayAssignment 
				List<Expr> costArrAssArgs = new ArrayList<Expr>();
				costArrAssArgs.add(iiLocal);
				costArrAssArgs.add(iiCostComLocal);
				List<Type> costArrAssArgsType = new ArrayList<Type>();
				costArrAssArgsType.add(ts.Long());
				costArrAssArgsType.add(ts.Long());
               	Call costArrayAssignmentCall = synth.makeInstanceCall(PCG,costArrayLocal ,
						Name.make("operator()="),new ArrayList<TypeNode>(),
						costArrAssArgs, ts.Long(), costArrAssArgsType,context);
				Stmt costArrayAssignment = syn.createEval(costArrayAssignmentCall);
				//inner for statement
				List<Stmt> innerForStmts = new ArrayList<Stmt>();
				/*if(varToreplace.type().toString().equals(ts.Point().toString())){
					innerForStmts.add(costArrayIteratorPointAssign);
				}*/
				innerForStmts.add(iiCostComDecl);
				innerForStmts.add(procCostAssignment);
				innerForStmts.add(costArrayAssignment);
				Block innerForBlock = syn.createBlock(PCG,innerForStmts);
				For innerForCost = syn.createStandardFor(PCG,iiDecl ,iiLeThJupper, iiInc, innerForBlock);
				
			 List<Stmt> asyncParStmts = new ArrayList<Stmt>();
			 asyncParStmts.add(procCostDecl);
			 asyncParStmts.add(jUpperDecl);
			 /*if(varToreplace.type().toString().equals(ts.Point().toString())){
				 asyncParStmts.add(costArrayIteratorPoint);
				}*/
			 asyncParStmts.add(innerForCost);
			 asyncParStmts.add(partCostArrayAssignStmt);
			 Block  asyncParBlock= syn.createBlock(PCG, asyncParStmts);
			 
			 
			 //async 
			 AsyncDef asyncParDef = (AsyncDef) AtStmt_c.createDummyAsync(
						PCG, ts, context.currentClass(), context
								.currentCode(), context.currentCode()
								.staticContext(), true);
				
				
				Async_c asyncParNode =(Async_c) nf.Async(PCG, new ArrayList<Expr>(),
						asyncParBlock).asyncDef(asyncParDef);
				 
				
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 List<Stmt> listStmtCostcom = new ArrayList<Stmt>();
			 listStmtCostcom.add(tprocForCostCom);
			 listStmtCostcom.add(asyncParNode);
			 Block parallelCostForBody = syn.createBlock(PCG,listStmtCostcom);
			 
			 For parallelCostFor = syn.createStandardFor(PCG,procForCostCom ,procLessN,procInc,parallelCostForBody);
			 Stmt parallelCostCompt = xnf.Finish(PCG,parallelCostFor , false);
			 
			 //System.out.println("inside new finish");
			// parallelCostCompt.prettyPrint(System.out);
			 
			 
			 //enclosing the 1st finish inside if(!isPopulated) or if(!flag)
			 Expr isPopulatedAccess  = synth.makeFieldAccess(PCG,syn.createThis(PCG,enclosingClass.classDef().asType()) ,Name.make("isPopulated"+finishId), context);
			 Expr isPopulatedCondition = syn.createNot(isPopulatedAccess, this);
			 
			 Expr myChunksArrayAccess = synth.makeFieldAccess(PCG,syn.createThis(PCG,enclosingClass.classDef().asType()) ,Name.make("myChunks"+finishId), context);
			 
			 
			 Stmt ifIspopulatedStmt = syn.createIf(PCG, isPopulatedCondition,parallelCostCompt , nf.Empty(PCG));
			 
			 
				/*LocalDecl tempMyChunkDecl = makeNewRailDecl(nprocLocal, ts.Long(),
						chunkClassDecl.classDef().asType(), "tempDelim",
						chunkInitClosure);*/
				LocalDecl tempMyChunkDecl = makeNewRailDeclWithNew(nprocLocal, ts.Long(),chunkClassDecl.classDef().asType(), "tempDelim");
					Stmt mychunkReAssign = syn.createAssignment(PCG,myChunksArrayAccess,Operator.ASSIGN,tempMyChunkDecl.init(),this);
					
			 Stmt  myChunksReassignConditional = syn.createIf(PCG,isPopulatedCondition, mychunkReAssign, nf.Empty(PCG));
			 
			
					//adding statements for the 2nd finish
					
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
							outForUpdate, forBody);//change newOuterFor.body with extra param and new async body 
		
					// add t_proc=proc in the forBody.
					LocalDecl tprocDec = syn.createLocalDecl(PCG,Flags.FINAL,
							Name.make("tproc"), ts.Long(), procLocal);
					Local tprocLocal = syn.createLocal(PCG, tprocDec);
					
					/*changing the async body.**/
					if(asyncNode.body() instanceof Block ){
						List<Stmt> asyncBodyStmtList = ((Block_c)asyncNode.body()).statements();
						
					   //change the asyncnode and to the outer for block
						
						
												
					   //mychunk(t_proc) = WorkDivider.divideWork(nproc, t_proc, n, block, costArray,partialCostArray);
						
						//get Workdivider class
						getWorkDivider getworkdiv_v = new getWorkDivider(job, ts, xnf);
						getworkdiv_v.begin();
						job.ast().visit(getworkdiv_v);
						ClassDecl_c workDividerClass=getworkdiv_v.workDividerClass;
						
						List<Type> workdivArgType =  new ArrayList<Type>();
						workdivArgType.add(ts.Long());
						workdivArgType.add(ts.Long());
						workdivArgType.add(ts.Long());
						workdivArgType.add(ts.Long());
						workdivArgType.add(costArrayLocal.type());
						workdivArgType.add(partialCostArrayLocal.type());
						
						List<Expr> workdivArg =  new ArrayList<Expr>();
						workdivArg.add(nprocLocal);
						workdivArg.add(tprocLocal);
						workdivArg.add(nLocal);
						workdivArg.add(blockLocal);
						workdivArg.add(costArrayLocal);
						workdivArg.add(partialCostArrayLocal);
						
						//call divideWork function in static
						Expr divideWorkCall = synth.makeStaticCall(PCG,workDividerClass.classDef().asType() ,Name.make("divideWork"),
								new ArrayList<TypeNode>(),workdivArg ,chunkClassDecl.classDef().asType(),workdivArgType , context);
								
						List<Expr> myChunksArrayArgs = new ArrayList<Expr>();
						myChunksArrayArgs.add(tprocLocal);
						myChunksArrayArgs.add(divideWorkCall);
						
						List<Type> myChunksArrayArgTypes = new ArrayList<Type>();
						myChunksArrayArgTypes.add(ts.Long());
						myChunksArrayArgTypes.add(chunkClassDecl.classDef().asType());
						
						//myChunks Array assign
						Call myChunksArrayAssign = synth.makeInstanceCall(PCG, myChunksArrayAccess, Name.make("operator()="),new ArrayList<TypeNode>(),
								myChunksArrayArgs,chunkClassDecl.classDef().asType(),myChunksArrayArgTypes,context);
						Stmt myChunkArrayAssignStmt = syn.createEval(myChunksArrayAssign);
						
						
						
						// debug statemnt
						List<Expr> printArgs = new ArrayList<Expr>();
						Expr toPrint = syn.createStringLit("inside conditional"+isPopulatedAccess);
						printArgs.add(isPopulatedAccess);
						
						List<Type> printArgsTypes = new ArrayList<Type>();
						printArgsTypes.add(isPopulatedAccess.type());
						duplicateSubtree debug1_v = new duplicateSubtree(job, ts, xnf);
						X10Call_c debug1 =(X10Call_c) debug1_v.begin().visitEdgeNoOverride(null,consolePrinter);
						//debug1 = (X10Call_c)debug1.methodInstance(debug1.methodInstance().formalTypes(printArgsTypes));
						debug1 =(X10Call_c)debug1.arguments(printArgs);
						List debugBloList = new ArrayList<Stmt>();
						debugBloList.add(syn.createEval(debug1));
						debugBloList.add(myChunkArrayAssignStmt);
						Block debugBlock = syn.createBlock(PCG, debugBloList);
						
						//mychunk decl, var myChunk:chunk;
						LocalDecl myChunvarkdecl = null;
						Stmt myChunkArrayAssignStmtConditional=null;
						Stmt myChunkVarReAssign =null;
						Local myChunkvarLocal=null;
						if(constatntBound){
							myChunvarkdecl = syn.createLocalDecl(PCG, Flags.MUTABLE,Name.make("myChunk"), chunkClassDecl.classDef().asType());
							myChunkvarLocal = syn.createLocal(PCG,myChunvarkdecl);
							myChunkArrayAssignStmtConditional  = syn.createIf(PCG,isPopulatedCondition, debugBlock,nf.Empty(PCG));


							//myChunk = myChunks(tproc);
							Expr myChunksOfTproc = makeArrayAccess(myChunksArrayAccess, chunkClassDecl.classDef().asType(), tprocLocal, ts.Long(), context);
							myChunkVarReAssign= syn.createAssignment(PCG, myChunkvarLocal,Operator.ASSIGN,myChunksOfTproc,this);	 		
						}
						else{
							myChunvarkdecl = syn.createLocalDecl(PCG, Flags.FINAL,Name.make("myChunk"), chunkClassDecl.classDef().asType(),divideWorkCall);
							myChunkvarLocal = syn.createLocal(PCG,myChunvarkdecl);

						}
						
						
						
						//kkmax decl : var kkamx:long = myChunk.myChunkEnd;
						LocalDecl kkmaxDecl = syn.createLocalDecl(PCG,Flags.FINAL, Name.make("kkmax"),ts.Long(),
								syn.createFieldRef(PCG, myChunkvarLocal,Name.make("myChunkEnd")));
						Local kkmaxLocal = syn.createLocal(PCG,kkmaxDecl);
						
						//inner For loop
						/*
						 * var i:Point;
						 * for(var kk:long= myChunk.myChunkStart; kk<kkmax ; kk++){
						 * 		i= point.make(kk);
						 * 		//beg async
						 * 
						 * 
						 * 		//end of async
						 * }
						 */
						

						//changing async body
						Stmt oldAsyncBody = asyncNode.body();
		
						//preprocessing step to push statements in between async and forloop inside async.
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
					  
						
						
						
						
						
						
						//iterator of the original parallel for loop
						ForInit parForIteratorDecl = parForNode.inits().get(0);
						Local parForIteratorLocal = syn.createLocal(PCG,(LocalDecl)parForIteratorDecl);
						//creating new iterators for async body
						LocalDecl parForItDecl1 = syn.createLocalDecl(PCG,parForIteratorLocal.flags() ,parForIteratorLocal.name().id(),parForIteratorLocal.type());
						Local parForItLocal1 = syn.createLocal(PCG,parForItDecl1);
						
												
						//rename  async body with parForIteratorDecl declaration.
						replaceOldVarToNewVar replace_v2 = new replaceOldVarToNewVar(job, ts, xnf,(Local_c)parForIteratorLocal ,(Local_c) parForItLocal1);
						replace_v2.begin();
						Stmt newAsyncBodyAfterIterReplace =(Stmt) replace_v2.visitEdgeNoOverride(null,oldAsyncBody);
						List<Stmt> newAsyncBodyAfterIterReplaceList = ((Block_c)newAsyncBodyAfterIterReplace).statements();
						
						
						
						LocalDecl kkDecl = syn.createLocalDecl(PCG,Flags.MUTABLE,Name.make("kk"),ts.Long(),
								syn.createFieldRef(PCG, myChunkvarLocal,Name.make("myChunkStart")));
						Local kkLocal = syn.createLocal(PCG,kkDecl);
						Expr kkCond = syn.createBinary(PCG, kkLocal,Binary.LE, kkmaxLocal, this);
						Expr kkPlus = syn.createBinary(PCG,kkLocal,Binary.ADD,syn.createLongLit(1),this);
						Expr kkUpdate = syn.createAssign(PCG,kkLocal,Operator.ASSIGN,kkPlus, this);
						
						//assign kk to parForIterator.
						Stmt assignKktoIterator = syn.createAssignment(PCG,parForItLocal1,Operator.ASSIGN,kkLocal,this);
						
						List customChunkForStmts = new ArrayList<Stmt>();
						customChunkForStmts.add(assignKktoIterator);
						//add the statements between async and par-for TODO
						
						//extra tweak to replace Runtime.workerId to t_proc.
						
						
						
						
						for(Stmt s:newAsyncBodyAfterIterReplaceList ){
							customChunkForStmts.add(s);
						}
						Block customChunkForBody = syn.createBlock(PCG, customChunkForStmts);
						Stmt customChunkFor = syn.createStandardFor(PCG,kkDecl,kkCond,kkUpdate ,customChunkForBody);
						
						
						
						
						List<Stmt> customChunInnerForBlockList = new ArrayList<Stmt>();
						customChunInnerForBlockList.add(parForItDecl1); //add par-fornode 's iterator decl.
						customChunInnerForBlockList.add(customChunkFor);
						Block customChunknnerForBlock = syn.createBlock(PCG, customChunInnerForBlockList);
						
						
						
						
					    List<Stmt> asyncNewList = new ArrayList<Stmt>();
						
						
						
						
					    
					    //if(constatntBound) then conditional assignment.Otherwise direct call.
						if(constatntBound){
							asyncNewList.add(myChunvarkdecl);
							asyncNewList.add(myChunkArrayAssignStmtConditional);

							asyncNewList.add(myChunkVarReAssign);
						}
						else {
							asyncNewList.add(myChunvarkdecl);
						}
						
						
						
						asyncNewList.add(kkmaxDecl);
						asyncNewList.add(customChunknnerForBlock);
						
						
						
						Block asyncNewBlock = syn.createBlock(PCG,asyncNewList);
						
						
						
						
						AsyncDef asyncDef = (AsyncDef) AtStmt_c.createDummyAsync(
								PCG, ts, context.currentClass(), context
										.currentCode(), context.currentCode()
										.staticContext(), true);
						
						
						Async newasyncNode = nf.Async(PCG, new ArrayList<Expr>(),
								asyncNewBlock).asyncDef(asyncDef);
						asyncNode = (Async_c)newasyncNode;
						
						
						
						
						
						

					}
					else
						throw new SemanticException("async body not a block");
						
					//add t_proc and all in the newOuterFor loop
					// add t_proc decl as loopbdy and return the block
					List<Stmt> newOuterForBody = new ArrayList<Stmt>();
					if (forBody instanceof Async_c ) {
						if((((Async_c)forBody).equals(asyncNode))){
							//System.out.println("async found inside for loop ***********");
							newOuterForBody.add(tprocDec);
							newOuterForBody.add(asyncNode);
						}
						
					} else if (forBody instanceof Block_c) { // add t_proc to the
						newOuterForBody.add(tprocDec);
						List<Stmt> oldOuterForBody = ((Block_c) forBody).statements();
						//no need to add the statements before async. as they all will be added 
						//to inner chunked for loop.
						//TODO: check the assumption that the statements in-between the par-for-loop and
						//its async are meant to be pushed inside the inner chunked loop. If yes,then it can be
						//improved by pusing only variables dependend on the par-for-loop.
						boolean notAdd=true; // to add the statements after async. Check notebook for more details	 			
						for (Stmt s : oldOuterForBody) {
							if( s instanceof Async_c){
								//System.out.println("async found inside for loop Block ***********");
								newOuterForBody.add(asyncNode);
								notAdd=false;//add statements after this
							}
							else if(!notAdd) {
								newOuterForBody.add(s);
							}
							
						}
					}
					Block newOuterLoopBlock = syn.createBlock(PCG, newOuterForBody);
					newOuterFor = newOuterFor.body(newOuterLoopBlock);
					
					finishNode =xnf.Finish(PCG,newOuterFor , false);
					 
			 
		
					/*//adding statements for overhead calculations.
				    ///**********************************///
					//add timers around the first finish block to get the overhead of custom chunking.
				/*	List<Type> argTypesTimer= new ArrayList<Type>();
					Expr argsTimer[] = new Expr[0];
					Expr timerCall =syn.createStaticCall(PCG,(polyglot.types.Type)ts.System(),Name.make("nanoTime"), argsTimer);
					LocalDecl overStartDecl = syn.createLocalDecl(PCG, Flags.MUTABLE,Name.make("overStart"), ts.Double());
					Local overStartLocal = syn.createLocal(PCG,overStartDecl);
					Stmt startAssign = syn.createAssignment(PCG, overStartLocal, Operator.ASSIGN, timerCall, this);
					
					Expr timerCall2 =syn.createStaticCall(PCG,(polyglot.types.Type)ts.System(),Name.make("nanoTime"), argsTimer);
					LocalDecl overEndDecl  = syn.createLocalDecl(PCG, Flags.MUTABLE,Name.make("overEnd"),
							ts.Double());
					Local overEndLocal = syn.createLocal(PCG, overEndDecl);
					Stmt endAssign = syn.createAssignment(PCG, overEndLocal,Operator.ASSIGN, timerCall2, this);
						
					Expr endMinusStart = syn.createBinary(PCG, overEndLocal, Binary.SUB, overStartLocal, this);
					List<Expr> printArgs = new ArrayList<Expr>();
					Expr toPrint = syn.createStringLit(""+endMinusStart);
					printArgs.add(endMinusStart);
					
					List<Type> printArgsTypes = new ArrayList<Type>();
					printArgsTypes.add(endMinusStart.type());
					duplicateSubtree debug1_v = new duplicateSubtree(job, ts, xnf);
					X10Call_c debug1 =(X10Call_c) debug1_v.begin().visitEdgeNoOverride(null,consolePrinter);
					//debug1 = (X10Call_c)debug1.methodInstance(debug1.methodInstance().formalTypes(printArgsTypes));
					debug1 =(X10Call_c)debug1.arguments(printArgs);
					Stmt printTimerOverHead = syn.createEval(debug1);*/
					
					
					
			
		
					
			//isPopulated = true 
			Stmt isPopulatedToTrue = syn.createAssignment(PCG, isPopulatedAccess, Operator.ASSIGN, syn.createTrue(PCG), this);
					
					
			List outerBlockList = new ArrayList<Stmt>();
			
			

			/*//****extra code for overhead calculation /
			//timer variable to be removed
			outerBlockList.add(overStartDecl);
			outerBlockList.add(overEndDecl);
			
			outerBlockList.add(startAssign);*/
			
			outerBlockList.add(nDec);
			outerBlockList.add(costArrayReAssign);
			outerBlockList.add(partialCostArrayReAssign);
			outerBlockList.add(blockDecl);
			if(constatntBound){
				outerBlockList.add(ifIspopulatedStmt);
				outerBlockList.add(myChunksReassignConditional);
				
				/*//timer variable to be removed
				outerBlockList.add(endAssign);
				outerBlockList.add(printTimerOverHead);
				*/
				
				outerBlockList.add(finishNode);
				outerBlockList.add(isPopulatedToTrue);
				
			}
			else
			{
				
				outerBlockList.add(parallelCostCompt);// instead of ifPop
				//no need of myChunksReassignConditional
				
				/*//timer variable to be removed
				outerBlockList.add(endAssign);
				outerBlockList.add(printTimerOverHead);
				*/
				
				outerBlockList.add(finishNode);//changes handled inside.
				//no need of ifPopTotrue
			}
			
			
			this.isConstantBound = constatntBound;
		
			
			
			
			finalNode = (Block_c)syn.createBlock(PCG, outerBlockList);

			//System.out.println("Starting to change the async node");
			return n;
		}
		
		
		
		return n;
	}
	
	/**
	 * 
	 * 
	 * return null, but changes the class variable finalNode corresponding to transformed for block
	 */
	public void performBlockChunk()  throws SemanticException{
		Stmt forNode = parForNode;
		Stmt forBody = parForNode.body();
		//nproc decl.
		LocalDecl nprocDec = addLocals("nproc");
		if(nprocDec==null){
			
			Expr nthreadAccess = synth.makeStaticField(PCG,ts.Runtime(),Name.make("NTHREADS"),ts.Long(), context) ;
			nprocDec = syn.createLocalDecl(PCG, Flags.MUTABLE,
						Name.make("nproc"), ts.Long(), nthreadAccess);
			/*nprocDec = syn.createLocalDecl(PCG, Flags.MUTABLE,
						Name.make("nproc"), ts.Long(), syn.createLongLit(8));*/
			LocalsForMethod.add((LocalDecl_c)nprocDec);
		}
		Local nprocLocal = syn.createLocal(PCG, nprocDec);
		//add to arraylist of locals.
		
		// getting the value of n:par-for-loop bound.
		AstHelper asthelper = new AstHelper(job, ts, xnf);
		Expr nExpr = asthelper.extractLoopBound((For_c) forNode);

		// creating nrpoc. TODO replace init expression
		LocalDecl nDec = syn.createLocalDecl(PCG, Flags.FINAL,
				Name.make("nn"), ts.Long(), nExpr);
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

		finalNode = (Block_c) syn.createBlock(PCG, outerBlockList);

		//System.out.println("Inside Cyclic chunk done");
		

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
				Name.make("nn"), ts.Long(), nExpr);
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
	
	
	

	/**
	 * @author Indu k
	 * 
	 *         According to the input parameters, create a new instance of the
	 *         type classDef
	 * 
	 * @param pos
	 * @param classDef
	 *            The class def
	 * @param List
	 *            of TypeArguments. eg Rail[Boolean]: boolean is the
	 *            typeArgument of Rail.
	 * @param args
	 *            expressions or values of the input parameters
	 * @param annotations
	 *            annotation of the new instance, could be null
	 * @param context
	 * @return the expression of the new instance
	 * @throws SemanticException
	 */
	public Expr makeArrayNewInstance(Position pos, X10ClassDef classDef,
			List<Type> typeArgs, List<Type> formalTypes, List<Expr> args,
			List<AnnotationNode> annotations, Context context)
			throws SemanticException {
		Type classT = classDef.asType();
		X10ParsedClassType classType = (X10ParsedClassType) classT;
		if (classT instanceof X10ParsedClassType) {
			//System.out.println("found place");
			classType = ((X10ParsedClassType) classT).typeArguments(typeArgs); // set
																				// the
																				// typeArguments
																				// of
																				// classDef
																				// receiver
																				// of
																				// new
																				// call.
		}

		ConstructorDef constructorDef = ts
				.findConstructor(
						classType,
						ts.ConstructorMatcher(classType, typeArgs, formalTypes,
								context)).def(); // findConstructor function
													// called with extra
													// argument typeArgument.
		ConstructorInstance constructorIns = constructorDef.asInstance();
		List<TypeNode> typeArgsNode = new ArrayList<TypeNode>();
		for (Type t : typeArgs) {
			typeArgsNode.add(xnf.CanonicalTypeNode(PCG, t));
		}
		X10New aNew = xnf.X10New(pos,
				xnf.CanonicalTypeNode(pos, Types.ref(classType)), typeArgsNode,
				args);

		// Add annotations to New
		if (annotations != null && annotations.size() > 0) {
			aNew = (X10New) ((X10Del) aNew.del()).annotations(annotations);
		}

		aNew = aNew.typeArguments(typeArgsNode);

		// Important step. The newly created new Instance should typeCheck to
		// have all typing information.
		// Added as a solution when the new instance created was not correctly
		// transformed to java and was throwing error.
		Expr construct = aNew.constructorInstance(constructorIns).type(
				classType);
		ContextVisitor typecheck = new X10TypeChecker(job, ts, xnf,
				job.nodeMemo()).context(context); // need to add context also
													// otherwise will not be
													// able to typeCheck

		return (Expr) construct.typeCheck(typecheck);
	}

	
	
	
	
	
	
	
	
	
	
	/**
	 * @author Indu k
	 * 
	 *         According to the input parameters, create a Rail array
	 *         declaration and initialize it return the array declaration
	 * @param arg
	 *            to new constructor of Rail class
	 * @param argtype
	 *            to new constructor of Rail class
	 * @param arrayType
	 *            of the new array. eg Array[boolean]
	 * @param name
	 *            of the array being created
	 * @return a Localdecl instance with new instance initialised.
	 * @throws SemanticException
	 */

	public LocalDecl makeNewRailDecl(Expr arg, Type argType, Type arrType,
			String arrayName, Expr init) throws SemanticException {

		List<Expr> arrayRefArgs = new ArrayList<Expr>();
		arrayRefArgs.add(arg);
		arrayRefArgs.add(init);
		List<Type> arrayRefArgsType = new ArrayList<Type>();
		arrayRefArgsType.add(argType);
		arrayRefArgsType.add(arrType);
		List<Type> arrayType = new ArrayList<Type>();
		arrayType.add(arrType);

		X10ClassDef railDef = ts.Rail(arrType).typeArguments(arrayType)
				.x10Def();
		Expr arrayNewInstance = makeArrayNewInstance(PCG, railDef, arrayType,
				arrayRefArgsType, arrayRefArgs, null, context);
		LocalDecl railDecl = syn.createLocalDecl(PCG, Flags.MUTABLE,
				Name.make(arrayName),
				ts.Rail(arrType).typeArguments(arrayType), arrayNewInstance);
		return railDecl;

	}
	/**
	 * @author Indu k
	 * 
	 *         According to the input parameters, create a Rail array
	 *         declaration and new istance and  it return the array declaration
	 * @param arg
	 *            to new constructor of Rail class
	 * @param argtype
	 *            to new constructor of Rail class
	 * @param arrayType
	 *            of the new array. eg Array[boolean]
	 * @param name
	 *            of the array being created
	 * @return a Localdecl instance with new instance initialised to defaults
	 * @throws SemanticException
	 */

	public LocalDecl makeNewRailDeclWithNew(Expr arg, Type argType, Type arrType,
			String arrayName) throws SemanticException {

		List<Expr> arrayRefArgs = new ArrayList<Expr>();
		arrayRefArgs.add(arg);
		List<Type> arrayRefArgsType = new ArrayList<Type>();
		arrayRefArgsType.add(argType);
		List<Type> arrayType = new ArrayList<Type>();
		arrayType.add(arrType);

		X10ClassDef railDef = ts.Rail(arrType).typeArguments(arrayType)
				.x10Def();
		Expr arrayNewInstance = makeArrayNewInstance(PCG, railDef, arrayType,
				arrayRefArgsType, arrayRefArgs, null, context);
		LocalDecl railDecl = syn.createLocalDecl(PCG, Flags.MUTABLE,
				Name.make(arrayName),
				ts.Rail(arrType).typeArguments(arrayType), arrayNewInstance);
		return railDecl;

	}
	
	/**
	 * @author Indu k
	 * 
	 *         According to the input parameters, create a Rail array
	 *         declaration and without initializing it return the array declaration
	 * @param arg
	 *            to new constructor of Rail class
	 * @param argtype
	 *            to new constructor of Rail class
	 * @param arrayType
	 *            of the new array. eg Array[boolean]
	 * @param name
	 *            of the array being created
	 * @return a Localdecl instance initialised to null.
	 * @throws SemanticException
	 */

	public LocalDecl makeNewRailDeclNoInit(Expr arg, Type argType, Type arrType,
			String arrayName) throws SemanticException {

		
		
		List<Type> arrayType = new ArrayList<Type>();
		arrayType.add(arrType);

		X10ClassDef railDef = ts.Rail(arrType).typeArguments(arrayType)
				.x10Def();
		
		LocalDecl railDecl = syn.createLocalDecl(PCG, Flags.MUTABLE,
				Name.make(arrayName),
				ts.Rail(arrType).typeArguments(arrayType));
		return railDecl;

	}
	
	
	
	
	/**
	 * @author Indu k
	 * 
	 *         According to the input parameters, create a  array
	 *         declaration and initialize it return the array declaration
	 * @param arg
	 *            to new constructor of regionArray class
	 * @param argtype
	 *            to new constructor of regionArray class
	 * @param arrayType
	 *            of the new array. eg Array[boolean]
	 * @param name
	 *            of the array being created
	 * @return a Localdecl instance with new instance initialised.
	 * @throws SemanticException
	 */

	public LocalDecl makeNewRegionArrayDecl(Expr arg, Type argType, Type arrType,
			String arrayName, Expr init) throws SemanticException {

		List<Expr> arrayRefArgs = new ArrayList<Expr>();
		arrayRefArgs.add(arg);
		arrayRefArgs.add(init);
		List<Type> arrayRefArgsType = new ArrayList<Type>();
		arrayRefArgsType.add(argType);
		arrayRefArgsType.add(arrType);
		List<Type> arrayType = new ArrayList<Type>();
		arrayType.add(arrType);

		X10ClassDef regionArrayDef = ts.RegionArray(arrType).typeArguments(arrayType)
				.x10Def();
		
		Expr arrayNewInstance = makeArrayNewInstance(PCG, regionArrayDef, arrayType,
				arrayRefArgsType, arrayRefArgs, null, context);
		LocalDecl regionArrayDecl = syn.createLocalDecl(PCG, Flags.MUTABLE,
				Name.make(arrayName),
				ts.RegionArray(arrType).typeArguments(arrayType), arrayNewInstance);
		return regionArrayDecl;

	}
	
	/**
	 * @author Indu k
	 * 
	 *         According to the input parameters, create a  array
	 *         declaration and initialize it return the array declaration
	 * @param arg
	 *            to new constructor of regionArray class
	 * @param argtype
	 *            to new constructor of regionArray class
	 * @param arrayType
	 *            of the new array. eg Array[boolean]
	 * @param name
	 *            of the array being created
	 * @return a Localdecl instance with new instance initialised.
	 * @throws SemanticException
	 * Note not working has to update.
	 */

	public LocalDecl makeNew2DArrayDecl(Expr arg1,Expr arg2, Type argType, Type arrType,
			String arrayName, Expr init) throws SemanticException {

		List<Expr> arrayRefArgs = new ArrayList<Expr>();
		arrayRefArgs.add(arg1);
		arrayRefArgs.add(arg2);
		arrayRefArgs.add(init);
		List<Type> arrayRefArgsType = new ArrayList<Type>();
		arrayRefArgsType.add(argType);
		arrayRefArgsType.add(argType);
		arrayRefArgsType.add(arrType);
		
		List<Type> arrayType = new ArrayList<Type>();
		arrayType.add(arrType);

		X10ClassDef regionArrayDef = ts.RegionArray(arrType).typeArguments(arrayType)
				.x10Def();
		//X10ClassDef array_2Def = ts.Array(arrType).typeArguments(arrayType).
		
		Expr arrayNewInstance = makeArrayNewInstance(PCG, regionArrayDef, arrayType,
				arrayRefArgsType, arrayRefArgs, null, context);
		LocalDecl regionArrayDecl = syn.createLocalDecl(PCG, Flags.MUTABLE,
				Name.make(arrayName),
				ts.RegionArray(arrType).typeArguments(arrayType), arrayNewInstance);
		return regionArrayDecl;

	}
	
	/**
	 * @author Indu k
	 * 
	 *         According to the input parameters, create a  array
	 *         declaration and initialize it return the array declaration
	 * @param arg
	 *            to new constructor of regionArray class
	 * @param argtype
	 *            to new constructor of regionArray class
	 * @param arrayType
	 *            of the new array. eg Array[boolean]
	 * @param name
	 *            of the array being created
	 * @return a Localdecl instance with new instance initialised.
	 * @throws SemanticException
	 */

	public LocalDecl makeNewRegionArrayDeclNoInit(Expr arg, Type argType, Type arrType,
			String arrayName) throws SemanticException {

		List<Expr> arrayRefArgs = new ArrayList<Expr>();
		arrayRefArgs.add(arg);
		
		List<Type> arrayRefArgsType = new ArrayList<Type>();
		arrayRefArgsType.add(argType);
		
		List<Type> arrayType = new ArrayList<Type>();
		arrayType.add(arrType);

		X10ClassDef regionArrayDef = ts.RegionArray(arrType).typeArguments(arrayType)
				.x10Def();
		
		LocalDecl regionArrayDecl = syn.createLocalDecl(PCG, Flags.MUTABLE,
				Name.make(arrayName),
				ts.RegionArray(arrType).typeArguments(arrayType));
		return regionArrayDecl;

	}
	
	
	/**
	 * @author Indu Arrayacess expresiion of the form sample(i) is created
	 *         (sample[long]) It returns the expression of the form
	 *         sample.operator()(i:long).
	 * @param Local
	 *            variable array.
	 * @param Type
	 *            of the array. ie long if sample[long].
	 * @param Argument
	 *            to acees. ie i if sample(i)
	 * @param Type
	 *            of the argument passed.
	 * @context from the parent visitor.
	 * @return instanceCall of the form sample.operator()(i:long)
	 */

	public Expr makeArrayAccess(Expr arrayLocal, Type arrayType, Expr arg,
			Type argType, Context context) throws SemanticException {

		List<TypeNode> arrayTypeList = new ArrayList<TypeNode>();
		List<Expr> arrayArgList = new ArrayList<Expr>();
		arrayArgList.add(arg);

		List<Type> arrayArgTypeList = new ArrayList<Type>();
		arrayArgTypeList.add(argType);

		Expr arrayAcess = synth.makeInstanceCall(PCG, arrayLocal,
				Name.make("operator()"), arrayTypeList, arrayArgList,
				arrayType, arrayArgTypeList, context);
		return arrayAcess;

	}

	
	
	
	/*public Stmt makeWhileStmt(LocalDecl iterator, Expr Cond, ){
		LocalDecl  iDone = syn.createLocalDecl(PCG,Flags.MUTABLE, Name.make("isDoneTproc"),ts.Boolean(), syn.createFalse(PCG));
		Local iDoneLocal = syn.createLocal(PCG, iDone);
		Expr iDoneCond = syn.createBinary(PCG,iDoneLocal, Binary.NE,syn.createTrue(PCG), this);
		syn.createStandardFor(PCG,iDone ,iDoneCond , xnf.Empty(PCG));
	    Stmt whileStmt = syn.createStandardFor(PCG, iDone, iDoneCond, , )
	    return whileStmt;
	}*/
	
	/*
	 * function to check if the local variable is already defined.
	 * 
	 */
	public LocalDecl_c addLocals(String name){
		if(LocalsForMethod.size()!=0){
		for(LocalDecl_c l:LocalsForMethod){
			if(l.name().toString().equals(name))
				return l;
		}
		}
		return null;
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

	

}
