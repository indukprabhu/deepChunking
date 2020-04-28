package polyglot.visit;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.naming.LimitExceededException;














import polyglot.ast.Assign.Operator;
import polyglot.ast.Binary;
import polyglot.ast.Block;
import polyglot.ast.Block_c;
import polyglot.ast.Call;
import polyglot.ast.Call_c;
import polyglot.ast.ClassDecl_c;
import polyglot.ast.Eval_c;
import polyglot.ast.Expr;
import polyglot.ast.For_c;
import polyglot.ast.If;
import polyglot.ast.If_c;
import polyglot.ast.Local;
import polyglot.ast.LocalDecl;
import polyglot.ast.LocalDecl_c;
import polyglot.ast.Local_c;
import polyglot.ast.Loop_c;
import polyglot.ast.MethodDecl;
import polyglot.ast.Node;
import polyglot.ast.NodeFactory;
import polyglot.ast.Node_c;
import polyglot.ast.Return_c;
import polyglot.ast.Stmt;
import polyglot.ast.TypeNode;
import polyglot.frontend.Job;
import polyglot.types.Context;
import polyglot.types.Flags;
import polyglot.types.Name;
import polyglot.types.SemanticException;
import polyglot.types.Type;
import polyglot.types.TypeSystem;
import polyglot.types.Types;
import polyglot.util.InternalCompilerError;
import polyglot.util.Position;
import x10.ast.AnnotationNode;
import x10.ast.Async;
import x10.ast.Async_c;
import x10.ast.Finish_c;
import x10.ast.X10Binary_c;
import x10.ast.X10Call_c;
import x10.types.MethodInstance;
import x10.util.AltSynthesizer;
import x10.util.Synthesizer;


public class StatementProfiler extends ContextVisitor {

	private final TypeSystem ts;
	NodeFactory xnf;
	private AltSynthesizer syn;
	private Synthesizer synth;
	private int unitCost;
	
	private ArrayList<basicblock> listBBlock;
	private basicblock currentBlock;
	public static int id;
	private boolean flagToOverride;

	private static Position PCG = Position.COMPILER_GENERATED;
	public static Local newWriter;
	public static Local startTimer;
	public static Local endTimer;
	public static Local estTimer;
	public static List<MethodDecl> funToCheck;
	public StatementProfiler(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.ts = ts;
		this.xnf = xnf;
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);
		newWriter=null;
		endTimer = null;
		estTimer = null;
		funToCheck = new ArrayList<MethodDecl>();
		
	}
public Node override(Node n) {
		
		if(!( n instanceof If_c || n instanceof Loop_c || n instanceof Block_c || n instanceof Async_c ||n instanceof Finish_c))
			return n;
		else
			return null;
		

		
	}

		
	protected NodeVisitor enterCall(Node parent, Node n) {
		  
		
		
	 return this;
	}
	
	
	
	
	
	
	
	
	
	
	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
	
		if(n instanceof Block_c){
			List<Stmt> blockStmts = ((Block_c)n).statements();
			List <Stmt> newBlockStmt = new ArrayList<Stmt>();
			
			LocalDecl startTimerDecl=null;
			Expr startTimerLocal=null;
			LocalDecl endTimerDecl;
			Expr endTimerLocal ;
			int basicBlockStatus = 0; //A 1 indicates the current basic block has begun, 0 indicates we have to start a new block.
			for(Stmt s:blockStmts){
				
                //if it is a statement with a user defined func call then also not do profiling.
				 checkForFunctionCall funCheck_v = new checkForFunctionCall(job, ts, xnf);
				 funCheck_v.funcTocheck = funToCheck;
				 funCheck_v.begin().visitEdge(null,s);
				 
			 if(basicBlockStatus == 0){
				 if(s instanceof Return_c){
					 //add the last write to file call 
						//create writeToFileCall in the end of the function
					 List<polyglot.types.Type> writerArgType = new ArrayList<polyglot.types.Type>();
						writerArgType.add( ts.String());
						writerArgType.add( ts.Double());
						writerArgType.add( ts.Boolean());
						
						List<Expr> writerArg =  new ArrayList<Expr>();
						
						writerArg.add(syn.createStringLit("0"));
						writerArg.add(syn.createLongLit(1));
						writerArg.add(syn.createTrue(PCG));
						Expr fileWriterCall=null;
						if(newWriter==null){
							
							getFileWriter getWriter_v = new getFileWriter(job, ts, xnf);
							getFileWriter.workDividerClass=null;
							getWriter_v.begin().visitEdgeNoOverride(null,job.ast());
							
							ClassDecl_c fileWriterClass = getFileWriter.workDividerClass;
							
							List<AnnotationNode> annList = new ArrayList<AnnotationNode>();
							Expr newFileWriter = synth.makeNewInstance(PCG,
									fileWriterClass.classDef(),new ArrayList<Type>() ,
									new ArrayList<Expr>(), annList, context);
							
							fileWriterCall = synth.makeInstanceCall(PCG, newFileWriter,
									Name.make("writeToFile"), new ArrayList<TypeNode>(), 
									writerArg, ts.Void(),writerArgType , context);
							
						}
						else
							fileWriterCall = synth.makeInstanceCall(PCG, newWriter,
									Name.make("writeToFile"), new ArrayList<TypeNode>(), 
									writerArg, ts.Void(),writerArgType , context);
							
						Stmt fileWriterCallStmt = syn.createEval(fileWriterCall);
						//add this statement
						newBlockStmt.add(fileWriterCallStmt);
						
						
					   
					 
				 }
				 
				 else if(!(s instanceof Loop_c || s instanceof If_c 
							||s instanceof Finish_c || s instanceof Async_c 
							|| s instanceof Block_c || checkForFunctionCall.funcPresent)){
						
					  //the timer variables for this block.
					   
					    
					    List<Type> argTypesTimer= new ArrayList<Type>();
						Expr argsTimer[] = new Expr[0];
						Expr timerCall =syn.createStaticCall(PCG,(polyglot.types.Type)ts.System(),Name.make("nanoTime"), argsTimer);
						Expr startTimeAssignCall = makeArrayAssign(startTimer,ts.Long()
						    		,syn.createLongLit(id), ts.Long(),timerCall, context);
					    Stmt startTimerAssignStmt = syn.createEval(startTimeAssignCall);
						    
																	
						newBlockStmt.add(startTimerAssignStmt);
						newBlockStmt.add(s);
						basicBlockStatus=1;
						
				 }
				 else{
						newBlockStmt.add(s);
					}
				}
					else{
						
						 if(s instanceof Return_c){
							 //first close the current block and then write the writeToFile call
							 //add the last write to file call 
								//create writeToFileCall in the end of the function
												
								////

								List<Type> argTypesTimer= new ArrayList<Type>();
								Expr argsTimer[] = new Expr[0];
								Expr timerCall =syn.createStaticCall(PCG,(polyglot.types.Type)ts.System(),Name.make("nanoTime"), argsTimer);
								
								Expr endTimeAssignCall = makeArrayAssign(endTimer,ts.Long()
									    		,syn.createLongLit(id), ts.Long(),timerCall, context);
								Stmt endTimerAssignStmt = syn.createEval(endTimeAssignCall);
								
								endTimerLocal = makeArrayAccess(endTimer,ts.Long(),syn.createLongLit(id)
										, ts.Long(), context);
								startTimerLocal = makeArrayAccess(startTimer,ts.Long(),syn.createLongLit(id)
										, ts.Long(), context);
									    
								Expr endMinusStart = syn.createBinary(PCG,endTimerLocal,Binary.SUB, startTimerLocal,this);
								//Stmt totalTimer = syn.createAssignment(PCG,endTimerLocal,Operator.ASSIGN,endMinusStart, this);
								Expr estTimeAssignCall = makeArrayAssign(estTimer,ts.Long()
							    		,syn.createLongLit(id), ts.Long(),endMinusStart, context);
						        Stmt estTimeAssignStmt = syn.createEval(estTimeAssignCall);
						        Expr estTimerLocal = makeArrayAccess(estTimer,ts.Long(),syn.createLongLit(id)
										, ts.Long(), context);
									    
								
								
								List<polyglot.types.Type> writerArgType = new ArrayList<polyglot.types.Type>();
								writerArgType.add( ts.String());
								writerArgType.add( ts.Double());
								writerArgType.add( ts.Boolean());
								
								List<Expr> writerArg =  new ArrayList<Expr>();
								
								writerArg.add(syn.createStringLit("0"));
								writerArg.add(syn.createLongLit(1));
								writerArg.add(syn.createTrue(PCG));
								
								Expr fileWriterCall=null;
								if(newWriter==null){
									
									getFileWriter getWriter_v = new getFileWriter(job, ts, xnf);
									getFileWriter.workDividerClass=null;
									getWriter_v.begin().visitEdgeNoOverride(null,job.ast());
									
									ClassDecl_c fileWriterClass = getFileWriter.workDividerClass;
									
									List<AnnotationNode> annList = new ArrayList<AnnotationNode>();
									Expr newFileWriter = synth.makeNewInstance(PCG,
											fileWriterClass.classDef(),new ArrayList<Type>() ,
											new ArrayList<Expr>(), annList, context);
									
									fileWriterCall = synth.makeInstanceCall(PCG, newFileWriter,
											Name.make("writeToFile"), new ArrayList<TypeNode>(), 
											writerArg, ts.Void(),writerArgType , context);
									
								}
								else
									fileWriterCall = synth.makeInstanceCall(PCG, newWriter,
											Name.make("writeToFile"), new ArrayList<TypeNode>(), 
											writerArg, ts.Void(),writerArgType , context);
									
								Stmt fileWriterCallStmt = syn.createEval(fileWriterCall);
								
								newBlockStmt.add(endTimerAssignStmt);
								newBlockStmt.add(estTimeAssignStmt);
								newBlockStmt.add(fileWriterCallStmt);
								newBlockStmt.add(s);
								
								basicBlockStatus=0;
								//System.out.println("id"+id);
								id=id+1;
						
						 }
						
						
						
						//when the basic block is open
						//if a special construct or a user function call is present
						//stop the current block 
						
						 else if((s instanceof Loop_c || s instanceof If_c 	 
									|| s instanceof Block_c || checkForFunctionCall.funcPresent) ){
						List<Type> argTypesTimer= new ArrayList<Type>();
						Expr argsTimer[] = new Expr[0];
						Expr timerCall =syn.createStaticCall(PCG,(polyglot.types.Type)ts.System(),Name.make("nanoTime"), argsTimer);
						
						Expr endTimeAssignCall = makeArrayAssign(endTimer,ts.Long()
							    		,syn.createLongLit(id), ts.Long(),timerCall, context);
						Stmt endTimerAssignStmt = syn.createEval(endTimeAssignCall);
						
						endTimerLocal = makeArrayAccess(endTimer,ts.Long(),syn.createLongLit(id)
								, ts.Long(), context);
						startTimerLocal = makeArrayAccess(startTimer,ts.Long(),syn.createLongLit(id)
								, ts.Long(), context);
							    
						Expr endMinusStart = syn.createBinary(PCG,endTimerLocal,Binary.SUB, startTimerLocal,this);
						//Stmt totalTimer = syn.createAssignment(PCG,endTimerLocal,Operator.ASSIGN,endMinusStart, this);
						Expr estTimeAssignCall = makeArrayAssign(estTimer,ts.Long()
					    		,syn.createLongLit(id), ts.Long(),endMinusStart, context);
				        Stmt estTimeAssignStmt = syn.createEval(estTimeAssignCall);
				        Expr estTimerLocal = makeArrayAccess(estTimer,ts.Long(),syn.createLongLit(id)
								, ts.Long(), context);
							    
						
						
						List<polyglot.types.Type> writerArgType = new ArrayList<polyglot.types.Type>();
						writerArgType.add( ts.String());
						writerArgType.add( ts.Double());
						writerArgType.add( ts.Boolean());
						
						List<Expr> writerArg =  new ArrayList<Expr>();
						
						writerArg.add(syn.createStringLit(""+id));
						writerArg.add(estTimerLocal);
						writerArg.add(syn.createFalse(PCG));
						
						Expr fileWriterCall=null;
						if(newWriter==null){
							
							getFileWriter getWriter_v = new getFileWriter(job, ts, xnf);
							getFileWriter.workDividerClass=null;
							getWriter_v.begin().visitEdgeNoOverride(null,job.ast());
							
							ClassDecl_c fileWriterClass = getFileWriter.workDividerClass;
							
							List<AnnotationNode> annList = new ArrayList<AnnotationNode>();
							Expr newFileWriter = synth.makeNewInstance(PCG,
									fileWriterClass.classDef(),new ArrayList<Type>() ,
									new ArrayList<Expr>(), annList, context);
							
							fileWriterCall = synth.makeInstanceCall(PCG, newFileWriter,
									Name.make("writeToFile"), new ArrayList<TypeNode>(), 
									writerArg, ts.Void(),writerArgType , context);
							
						}
						else
							fileWriterCall = synth.makeInstanceCall(PCG, newWriter,
									Name.make("writeToFile"), new ArrayList<TypeNode>(), 
									writerArg, ts.Void(),writerArgType , context);
							
						Stmt fileWriterCallStmt = syn.createEval(fileWriterCall);
						
						newBlockStmt.add(endTimerAssignStmt);
						newBlockStmt.add(estTimeAssignStmt);
						newBlockStmt.add(fileWriterCallStmt);
						newBlockStmt.add(s);
						
						basicBlockStatus=0;
						//System.out.println("id"+id);
						id=id+1;
						
					}
						 else{
								newBlockStmt.add(s);
							}
					}					
					
				
				
				
			}
			//handle the corner case the last statement in block should also have an end timer.
			if(basicBlockStatus == 1){
				
				List<Type> argTypesTimer= new ArrayList<Type>();
				Expr argsTimer[] = new Expr[0];
				Expr timerCall =syn.createStaticCall(PCG,(polyglot.types.Type)ts.System(),Name.make("nanoTime"), argsTimer);
				
				Expr endTimeAssignCall = makeArrayAssign(endTimer,ts.Long()
					    		,syn.createLongLit(id), ts.Long(),timerCall, context);
				Stmt endTimerAssignStmt = syn.createEval(endTimeAssignCall);
				
				endTimerLocal = makeArrayAccess(endTimer,ts.Long(),syn.createLongLit(id)
						, ts.Long(), context);
				startTimerLocal = makeArrayAccess(startTimer,ts.Long(),syn.createLongLit(id)
						, ts.Long(), context);
					    
				Expr endMinusStart = syn.createBinary(PCG,endTimerLocal,Binary.SUB, startTimerLocal,this);
				//Stmt totalTimer = syn.createAssignment(PCG,endTimerLocal,Operator.ASSIGN,endMinusStart, this);
				Expr estTimeAssignCall = makeArrayAssign(estTimer,ts.Long()
			    		,syn.createLongLit(id), ts.Long(),endMinusStart, context);
		        Stmt estTimeAssignStmt = syn.createEval(estTimeAssignCall);
		        Expr estTimerLocal = makeArrayAccess(estTimer,ts.Long(),syn.createLongLit(id)
						, ts.Long(), context);
					    
				
				
				
				List<polyglot.types.Type> writerArgType = new ArrayList<polyglot.types.Type>();
				writerArgType.add( ts.String());
				writerArgType.add( ts.Double());
				writerArgType.add( ts.Boolean());
				
				List<Expr> writerArg =  new ArrayList<Expr>();
				writerArg.add(syn.createStringLit(""+id));
				
				writerArg.add(estTimerLocal);
				writerArg.add(syn.createFalse(PCG));
									
				
				Expr fileWriterCall=null;
				if(newWriter==null){
					
					getFileWriter getWriter_v = new getFileWriter(job, ts, xnf);
					getFileWriter.workDividerClass=null;
					getWriter_v.begin().visitEdgeNoOverride(null,job.ast());
					
					ClassDecl_c fileWriterClass = getFileWriter.workDividerClass;
					
					List<AnnotationNode> annList = new ArrayList<AnnotationNode>();
					Expr newfileWriter = synth.makeNewInstance(PCG,
							fileWriterClass.classDef(),new ArrayList<Type>() ,
							new ArrayList<Expr>(), annList, context);
					
					fileWriterCall = synth.makeInstanceCall(PCG, newfileWriter,
							Name.make("writeToFile"), new ArrayList<TypeNode>(), 
							writerArg, ts.Void(),writerArgType , context);
					
				}
				else
					fileWriterCall = synth.makeInstanceCall(PCG, newWriter,
							Name.make("writeToFile"), new ArrayList<TypeNode>(), 
							writerArg, ts.Void(),writerArgType , context);
					
				Stmt fileWriterCallStmt = syn.createEval(fileWriterCall);
				
				
				
				
				
				
				newBlockStmt.add(endTimerAssignStmt);
				newBlockStmt.add(estTimeAssignStmt);
				newBlockStmt.add(fileWriterCallStmt);
				basicBlockStatus=0;
				//System.out.println("id"+id);
				id=id+1;
			}
			
			
			n = syn.createBlock(PCG, newBlockStmt);
		}
		
		
		return n;
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

	public Expr makeArrayAccess(Local arrayLocal, Type arrayType, Expr arg,
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
	/**
	 * @author Indu Arrayassign expresiion of the form sample(i) =  is created
	 *         (sample[long]) It returns the expression of the form
	 *         sample.operator()=(i:long).
	 * @param Local
	 *            variable array.
	 * @param Type
	 *            of the array. ie long if sample[long].
	 * @param Argument
	 *            to acees. ie i if sample(i)
	 * @param Type
	 *            of the argument passed.
	 * @context from the parent visitor.
	 * @return instanceCall of the form sample.operator()=(i:long)
	 */

	public Expr makeArrayAssign(Local arrayLocal, Type arrayType, Expr arg,
			Type argType,Expr init ,Context context) throws SemanticException {

		List<TypeNode> arrayTypeList = new ArrayList<TypeNode>();
		List<Expr> arrayArgList = new ArrayList<Expr>();
		arrayArgList.add(arg);
		arrayArgList.add(init);

		List<Type> arrayArgTypeList = new ArrayList<Type>();
		arrayArgTypeList.add(argType);
		arrayArgTypeList.add(arrayType);

		Expr arrayAcess = synth.makeInstanceCall(PCG, arrayLocal,
				Name.make("operator()="), arrayTypeList, arrayArgList,
				arrayType, arrayArgTypeList, context);
		return arrayAcess;

	}

	
}


