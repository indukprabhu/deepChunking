package polyglot.visit;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.naming.LimitExceededException;















import polyglot.ast.Binary;
import polyglot.ast.Block;
import polyglot.ast.Block_c;
import polyglot.ast.Call;
import polyglot.ast.ClassDecl;
import polyglot.ast.ClassDecl_c;
import polyglot.ast.Eval_c;
import polyglot.ast.Expr;
import polyglot.ast.ForInit;
import polyglot.ast.For_c;
import polyglot.ast.If;
import polyglot.ast.If_c;
import polyglot.ast.Local;
import polyglot.ast.LocalDecl;
import polyglot.ast.LocalDecl_c;
import polyglot.ast.Local_c;
import polyglot.ast.MethodDecl;
import polyglot.ast.MethodDecl_c;
import polyglot.ast.Node;
import polyglot.ast.NodeFactory;
import polyglot.ast.Node_c;
import polyglot.ast.Stmt;
import polyglot.ast.TypeNode;
import polyglot.ast.Assign.Operator;
import polyglot.frontend.Job;
import polyglot.types.ConstructorDef;
import polyglot.types.ConstructorInstance;
import polyglot.types.Context;
import polyglot.types.Flags;
import polyglot.types.MethodDef;
import polyglot.types.MethodDef_c;
import polyglot.types.Name;
import polyglot.types.SemanticException;
import polyglot.types.Type;
import polyglot.types.TypeSystem;
import polyglot.types.Types;
import polyglot.util.InternalCompilerError;
import polyglot.util.Position;
import polyglot.visit.ContextVisitor;
import polyglot.visit.NodeVisitor;
import x10.ast.AnnotationNode;
import x10.ast.Async;
import x10.ast.Async_c;
import x10.ast.Finish;
import x10.ast.Finish_c;
import x10.ast.X10Binary_c;
import x10.ast.X10Call_c;
import x10.ast.X10MethodDecl_c;
import x10.ast.X10New;
import x10.extension.X10Del;
import x10.types.MethodInstance;
import x10.types.X10ClassDef;
import x10.types.X10ParsedClassType;
import x10.util.AltSynthesizer;
import x10.util.Synthesizer;
import x10.visit.X10TypeChecker;
import x10cpp.visit.ASTQuery;


public class HistoryLoopProfileInstrumentation extends ContextVisitor {

	private final TypeSystem ts;
	NodeFactory xnf;
	private AltSynthesizer syn;
	private Synthesizer synth;
	public static int finishId=0;
	private static Position PCG = Position.COMPILER_GENERATED;
	public static List<MethodDecl> funAfterVisit ;

	public HistoryLoopProfileInstrumentation(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.ts = ts;
		this.xnf = xnf;
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);
		funAfterVisit =  new ArrayList<MethodDecl>();
		
	}
	
	
	protected NodeVisitor enterCall(Node parent, Node n) {
		  
		return this;
	}
	
	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {

		
/*		if (n instanceof MethodDecl) {
			for (MethodDecl mi : funAfterVisit) {
				if (((MethodDecl) n).name().toString()
						.equals(mi.name().toString())) {
					return mi;
				}
			}

		}
        */
		if (n instanceof For_c) {

			For_c forNode = ((For_c) n);

			
			
			
			//get the immediately enclosing finish of this for
			//requires the traversal from root than traversing backwards.
			QueryImmediateAstParent enclFinish_v = new QueryImmediateAstParent(
					job, ts, xnf,Finish_c.class , n);
			
			enclFinish_v.begin(); // sets and initializes the context
			enclFinish_v.keyParentType = Finish_c.class;
			job.ast().visit(enclFinish_v);
			Node enclFinish = enclFinish_v.getImmediateParent();
			
			
			
			
			

			// get the async chhild of the for loop.
			Async_c asyncChild = getAsyncChild(forNode);

			// Assumes that a par-for-loop requires a Finish encosing it and a
			// async as a direct child
			if (enclFinish != null && asyncChild != null) {
				
				
				finishId++;
				////System.out.println(finishId);
				
				//get the file Writer class.
				//create a object for the fileWriter class and pass it to statement profiler,
				getHistFileWriter getWriter_v = new getHistFileWriter(job, ts, xnf);
				getHistFileWriter.workDividerClass=null;
				getWriter_v.begin().visitEdgeNoOverride(null,job.ast());
				
				ClassDecl_c fileWriterClass = getHistFileWriter.workDividerClass;
												
				List<AnnotationNode> annList = new ArrayList<AnnotationNode>();
				Expr newWriter = synth.makeNewInstance(PCG,
						fileWriterClass.classDef(),new ArrayList<Type>() ,
						new ArrayList<Expr>(), annList, context);
				
				//create a local var decl for the file writer.
				LocalDecl newFileWriterDecl= syn.createLocalDecl(PCG, Flags.FINAL, Name.make("newFileWriter"),fileWriterClass.classDef().asType(),newWriter);
				Local newFileWriterLocal = syn.createLocal(PCG,newFileWriterDecl);
				
				//create Timer variable arrays and their initialisation.
				LocalDecl startArrayDecl = makeNewRailDecl(syn.createLongLit(1000), ts.Long(), ts.Long(),"startTime" ,syn.createLongLit(0));
				Local startArrayLocal  = syn.createLocal(PCG,startArrayDecl);
				
				LocalDecl endArrayDecl = makeNewRailDecl(syn.createLongLit(1000), ts.Long(), ts.Long(),"endTime" ,syn.createLongLit(0));
				Local endArrayLocal  = syn.createLocal(PCG,endArrayDecl);
				
				LocalDecl estArrayDecl = makeNewRailDecl(syn.createLongLit(1000), ts.Long(), ts.Long(),"estTime" ,syn.createLongLit(0));
				Local estArrayLocal  = syn.createLocal(PCG,estArrayDecl);
				
				
				
				//create writeToFileCall in the end of the function
				List<polyglot.types.Type> writerArgType = new ArrayList<polyglot.types.Type>();
				writerArgType.add( ts.String());
				writerArgType.add( ts.Double());
				writerArgType.add( ts.Boolean());
				
				
				
				
				
				List<Expr> writerArg =  new ArrayList<Expr>();
				
				writerArg.add(syn.createStringLit("0"));
				writerArg.add(syn.createLongLit(1));
				writerArg.add(syn.createTrue(PCG));
				
				
				writerArg.add(syn.createFalse(PCG));
				writerArg.add(syn.createLongLit(1));
				writerArg.add(syn.createLongLit(1));
				writerArgType.add( ts.Boolean());
				writerArgType.add( ts.Long());
				writerArgType.add( ts.Long());
				
				
				Expr fileWriterCall =  synth.makeInstanceCall(PCG, newFileWriterLocal,
						Name.make("writeToFile"), new ArrayList<TypeNode>(), 
						writerArg, ts.Void(),writerArgType , context);
				
			   Stmt fileWriterCallStmt = syn.createEval(fileWriterCall);
			   
			   /*
			    * check if there are any user defined function calls inside this parallel for loop if yes then first visit all those function nodes.
			    */
			   QueryUserFunctionCalls funToVisit_v = new QueryUserFunctionCalls(job, ts, xnf);
			   funToVisit_v.begin().visitEdgeNoOverride(null,asyncChild.body() );
			   List<MethodDecl> funToVisit =  QueryUserFunctionCalls.funToVisit;
			 
			   
			   for(MethodDecl mi : funToVisit){
				   boolean alreadyVisited = false;
				  for(MethodDecl ai: funAfterVisit){
					  if(mi.name().equals(ai.name())){
						  alreadyVisited = true;
						  
					  }
				  }
				  if(!alreadyVisited){
				   
				   List<AnnotationNode> annListNew = new ArrayList<AnnotationNode>();
					Expr newWriterNew = synth.makeNewInstance(PCG,
							fileWriterClass.classDef(),new ArrayList<Type>() ,
							new ArrayList<Expr>(), annListNew, context);
					
					//create a local var decl for the file writer.
					LocalDecl newFileWriterDeclNew= syn.createLocalDecl(PCG, Flags.FINAL, Name.make("newFileWriter"),fileWriterClass.classDef().asType(),newWriterNew);
					Local newFileWriterLocalNew = syn.createLocal(PCG,newFileWriterDeclNew);
					
					//create Timer variable arrays and their initialisation.
					LocalDecl startArrayDeclNew = makeNewRailDecl(syn.createLongLit(1000), ts.Long(), ts.Long(),"startTime" ,syn.createLongLit(0));
					Local startArrayLocalNew  = syn.createLocal(PCG,startArrayDeclNew);
					
					LocalDecl endArrayDeclNew = makeNewRailDecl(syn.createLongLit(1000), ts.Long(), ts.Long(),"endTime" ,syn.createLongLit(0));
					Local endArrayLocalNew  = syn.createLocal(PCG,endArrayDeclNew);
					
					LocalDecl estArrayDeclNew = makeNewRailDecl(syn.createLongLit(1000), ts.Long(), ts.Long(),"estTime" ,syn.createLongLit(0));
					Local estArrayLocalNew  = syn.createLocal(PCG,estArrayDeclNew);
					
					
					
					//create writeToFileCall in the end of the function
					List<polyglot.types.Type> writerArgTypeNew = new ArrayList<polyglot.types.Type>();
					writerArgTypeNew.add( ts.String());
					writerArgTypeNew.add( ts.Double());
					writerArgTypeNew.add( ts.Boolean());
					
					List<Expr> writerArgNew =  new ArrayList<Expr>();
					
					writerArgNew.add(syn.createStringLit("0"));
					writerArgNew.add(syn.createLongLit(1));
					writerArgNew.add(syn.createTrue(PCG));
					
					
					writerArgNew.add(syn.createFalse(PCG));
					writerArgNew.add(syn.createLongLit(1));
					writerArgNew.add(syn.createLongLit(1));
					writerArgTypeNew.add( ts.Boolean());
					writerArgTypeNew.add( ts.Long());
					writerArgTypeNew.add( ts.Long());
					
					
					Expr fileWriterCallNew =  synth.makeInstanceCall(PCG, newFileWriterLocalNew,
							Name.make("writeToFile"), new ArrayList<TypeNode>(), 
							writerArgNew, ts.Void(),writerArgTypeNew , context);
					
				   Stmt fileWriterCallStmtNew = syn.createEval(fileWriterCallNew);
				   
				   
				   
				   
				   HistoryStatementProfiler stmtProfiler_v = new HistoryStatementProfiler(job, ts, xnf);
					stmtProfiler_v.newWriter=newFileWriterLocalNew;
					stmtProfiler_v.startTimer=startArrayLocalNew;
					stmtProfiler_v.endTimer=endArrayLocalNew;
					stmtProfiler_v.estTimer=estArrayLocalNew;
					if(funAfterVisit.size()>0){
						 stmtProfiler_v.funToCheck = funAfterVisit;
						}
					Block newMiBody = (Block)stmtProfiler_v.begin().visitEdge(null,mi.body());
					
					//adding the fileWriter to the outer block.
					List<Stmt> newOuterBlock=new ArrayList<Stmt>();
					newOuterBlock.add(newFileWriterDeclNew);
					newOuterBlock.add(startArrayDeclNew);
					newOuterBlock.add(endArrayDeclNew);
					newOuterBlock.add(estArrayDeclNew);
					newOuterBlock.addAll(newMiBody.statements());
					newOuterBlock.add(fileWriterCallStmtNew);
					Block newForOuterBlock = syn.createBlock(PCG,newOuterBlock);
					
					MethodDecl newMi =(MethodDecl) mi.body(newForOuterBlock);
					funAfterVisit.add(newMi);
					////System.out.println(" here ");
					
					
				  } 
			   }
			   
				//profile the actual body of for loop
				
				HistoryStatementProfiler stmtProfiler_v = new HistoryStatementProfiler(job, ts, xnf);
				stmtProfiler_v.newWriter=newFileWriterLocal;
				stmtProfiler_v.startTimer=startArrayLocal;
				stmtProfiler_v.endTimer=endArrayLocal;
				stmtProfiler_v.estTimer=estArrayLocal;
				stmtProfiler_v.funToCheck = funToVisit;
				Node newasyncBody = stmtProfiler_v.begin().visitEdge(null,asyncChild.body());
				
				
			
				
				//adding newFileWriter.writeTofile("0",1L,true, endIt =true ,iterationId, forId);
			
				//create writeToFileCall end of loop fr adding iteration number.
				List<polyglot.types.Type> itIndexWriterArgType = new ArrayList<polyglot.types.Type>();
				itIndexWriterArgType.add( ts.String());
				itIndexWriterArgType.add( ts.Double());
				itIndexWriterArgType.add( ts.Boolean());
				itIndexWriterArgType.add( ts.Boolean());
				itIndexWriterArgType.add( ts.Long());
				itIndexWriterArgType.add( ts.Long());
				
				
				 ForInit parForIteratorIdx = forNode.inits().get(0);
				 Local parForIteratorIdxLocal = syn.createLocal(PCG, (LocalDecl)parForIteratorIdx);
				
				List<Expr> itIndexWriterArg =  new ArrayList<Expr>();
				
				itIndexWriterArg.add(syn.createStringLit("0"));
				itIndexWriterArg.add(syn.createLongLit(1));
				itIndexWriterArg.add(syn.createTrue(PCG));
				itIndexWriterArg.add(syn.createTrue(PCG));
				itIndexWriterArg.add(parForIteratorIdxLocal);
				itIndexWriterArg.add(syn.createLongLit(finishId));
				
				Expr itIndexWriterCall =  synth.makeInstanceCall(PCG, newFileWriterLocal,
						Name.make("writeToFile"), new ArrayList<TypeNode>(), 
						itIndexWriterArg, ts.Void(),itIndexWriterArgType , context);
				
			   Stmt itIndexfileWriterCallStmt = syn.createEval(itIndexWriterCall);
				
				
				asyncChild = (Async_c)asyncChild.body((Stmt)newasyncBody);
				
				
				
				int id = HistoryStatementProfiler.id;
				
				FileWriter out;
	            String file = "/home/induk/workspace/testprgms/src/classFiles/profileResults.txt";
	        	try {
	                out = new FileWriter(file);
	                out.write("totalBlocks "+id+"\n");
	                out.close();
	            } catch(IOException e) {
	                ////System.out.println("Error no file exist " + file );
	            }
			// change the for.
				Node forbody = forNode.body();
				if(forbody instanceof Async_c){
								
					List<Stmt> newForBodyList = new ArrayList<Stmt>();
					newForBodyList.add(itIndexfileWriterCallStmt);
					newForBodyList.add(asyncChild.body());	
					newForBodyList.add(itIndexfileWriterCallStmt);
					forbody = syn.createBlock(PCG,newForBodyList);
					forNode = (For_c)forNode.body((Stmt)forbody);
					
					
					
				}
				else if(forbody instanceof Block_c){
					
					List<Stmt> forBodyList =((Block_c)forbody).statements();
					List<Stmt> newForBodyList = new ArrayList<Stmt>();
					newForBodyList.add(itIndexfileWriterCallStmt);
					for(Stmt s:forBodyList){
						
						if(s instanceof Async_c){
							newForBodyList.add(asyncChild.body());
						}
						else {
							newForBodyList.add(s);
						}
					}
					newForBodyList.add(itIndexfileWriterCallStmt);
					forbody = syn.createBlock(PCG,newForBodyList);
					forNode = (For_c)forNode.body((Stmt)forbody);
					
					//adding the fileWriter to the outer block.
					List<Stmt> newOuterBlock=new ArrayList<Stmt>();
					newOuterBlock.add(newFileWriterDecl);
					newOuterBlock.add(startArrayDecl);
					newOuterBlock.add(endArrayDecl);
					newOuterBlock.add(estArrayDecl);
					newOuterBlock.add(forNode);
					newOuterBlock.add(fileWriterCallStmt);
					Block newForOuterBlock = syn.createBlock(PCG,newOuterBlock);
		
					//newForOuterBlock.prettyPrint(System.out);
					return newForOuterBlock;
				}
				//forNode.prettyPrint(System.out);
				return forNode;
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
			////System.out.println("found place");
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


	
}

