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
import polyglot.ast.Block;
import polyglot.ast.Block_c;
import polyglot.ast.Call;
import polyglot.ast.ClassBody_c;
import polyglot.ast.ClassDecl;
import polyglot.ast.ClassDecl_c;
import polyglot.ast.Eval_c;
import polyglot.ast.Expr;
import polyglot.ast.For;
import polyglot.ast.For_c;
import polyglot.ast.Formal;
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
import x10.X10CompilerOptions;
import x10.ast.AnnotationNode;
import x10.ast.Async;
import x10.ast.Async_c;
import x10.ast.Finish;
import x10.ast.Finish_c;
import x10.ast.X10Call_c;
import x10.ast.X10ClassDecl;
import x10.ast.X10MethodDecl_c;
import x10.ast.X10New;
import x10.ast.X10New_c;
import x10.extension.X10Del;
import x10.types.TypeDef;
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


public class PreCustomChunk extends ContextVisitor {

	private final TypeSystem ts;
	NodeFactory xnf;

	private AltSynthesizer syn;
	private Synthesizer synth;
	private Job job;
	public static X10MethodDecl_c enclosingMethod;
	public static ClassDecl_c enclosingClass;
	public static ArrayList<LocalDecl_c> LocalsForMethod = new ArrayList<LocalDecl_c>();
	
	private static Position PCG = Position.COMPILER_GENERATED;
	
	public static int finishId = 0;
	public static boolean toAdd = true;

	public PreCustomChunk(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.job = job;
		this.ts = ts;
		this.xnf = xnf;
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);
	
	}

	protected NodeVisitor enterCall(Node parent, Node n) {
		
		return this;
	}

	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {

		

		

		/*
		 * class changed to include global chunking variables.
		 */
		if (n instanceof polyglot.ast.ClassDecl) {
			if( enclosingClass!= null && ((polyglot.ast.ClassDecl) n).name().toString()
					.equals(enclosingClass.name().toString()) ){
				ExtensionInfo extInfo   = (ExtensionInfo) job.extensionInfo();
				Configuration    config    = ((X10CompilerOptions) extInfo.getOptions()).x10_config;
				if(config.CHUNK_CYCLIC || config.CHUNK_BLOCK || config.CHUNK_DYNAMIC || config.CHUNK_GUIDED){
					return n;
				}else{
					//add costArray
					LocalDecl costArrayDec = makeNewRailDeclNoInit( ts.Long(),	ts.Long(), "costArray");
					enclosingClass =(ClassDecl_c) synth.addClassField(PCG,(X10ClassDecl)enclosingClass, Name.make("costArray"), Flags.MUTABLE,costArrayDec.declType());
					LocalDecl partialCostArrayDec = makeNewRailDeclNoInit( ts.Long(),	ts.Long(), "partialCostArray");
					enclosingClass =(ClassDecl_c) synth.addClassField(PCG,(X10ClassDecl)enclosingClass, Name.make("partialCostArray"), Flags.MUTABLE,partialCostArrayDec.declType());
					

					return enclosingClass;
				}
			}



		}

		if (n instanceof For_c) {
			ExtensionInfo extInfo   = (ExtensionInfo) job.extensionInfo();
			Configuration    config    = ((X10CompilerOptions) extInfo.getOptions()).x10_config;
			if(!(config.CHUNK_CYCLIC || config.CHUNK_BLOCK)){
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
				finishId++;
				
				// get the enclosing class decl of this par-for-loop.
				// requires the traversal from root than traversing backwards.
				QueryEnclosingClass enclosingClass_v = new QueryEnclosingClass(job, ts, xnf, n);
				enclosingClass_v.begin();
				job.ast().visit(enclosingClass_v);
				ClassDecl_c tempClass =(ClassDecl_c) enclosingClass_v.getImmediateParent();
				if(enclosingClass==null || !(tempClass.name().toString().equals(enclosingClass.name().toString()))){
					
					enclosingClass = tempClass;
				}
				
				//mychunk array 
				 
				//var myChunks:Rail[chunk] = new Rail[chunk][nproc,new chunk()]
				// get the chunk class declaration node.
				getChunkClassVisitor chunkClassDecl_v = new getChunkClassVisitor(
							job, ts, xnf);
				chunkClassDecl_v.begin().visitEdgeNoOverride(null, job.ast());
				ClassDecl_c chunkClassDecl = chunkClassDecl_v.chunkNode;
				
				
				
				// creating myChunks[chunk] to store the chunks info.
				LocalDecl myChunksDecl = makeNewRailDeclNoInit( ts.Long(),chunkClassDecl.classDef().asType(), "myChunks");
				//LocalsForMethod.add((LocalDecl_c)myChunksDecl);
				Local myChunksLocal = syn.createLocal(PCG, myChunksDecl);
				
				
				
				//flag and myChunks array for this finish both to be added in the enclosing Class.
				
				enclosingClass =(ClassDecl_c) synth.addClassField(PCG,(X10ClassDecl)enclosingClass, Name.make("isPopulated"+finishId), Flags.MUTABLE,ts.Boolean());
			//	enclosingClass.addDecls(context);
				
				enclosingClass = (ClassDecl_c) synth.addClassField(PCG,(X10ClassDecl)enclosingClass, Name.make("myChunks"+finishId), Flags.MUTABLE,myChunksLocal.type());
			//	enclosingClass.addDecls(context);
				
				
				
				
				
				
				
			}

			// TODO
			// when there is no enclosing finish for the par-for-loop

			
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

	public LocalDecl makeNewRailDeclNoInit( Type argType, Type arrType,
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
	

}
