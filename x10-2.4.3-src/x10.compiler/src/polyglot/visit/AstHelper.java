package polyglot.visit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

import javax.swing.text.StyledEditorKit.BoldAction;

import com.sun.org.apache.bcel.internal.generic.LUSHR;
import com.sun.org.apache.xpath.internal.operations.Bool;

import polyglot.ast.Binary;
import polyglot.ast.Binary.Operator;
import polyglot.ast.Binary_c;
import polyglot.ast.Block_c;
import polyglot.ast.BooleanLit_c;
import polyglot.ast.ClassDecl_c;
import polyglot.ast.Conditional_c;
import polyglot.ast.Eval_c;
import polyglot.ast.Expr;
import polyglot.ast.FieldAssign_c;
import polyglot.ast.Field_c;
import polyglot.ast.For;
import polyglot.ast.For_c;
import polyglot.ast.If_c;
import polyglot.ast.IntLit_c;
import polyglot.ast.Lit_c;
import polyglot.ast.Local;
import polyglot.ast.LocalAssign_c;
import polyglot.ast.LocalDecl;
import polyglot.ast.LocalDecl_c;
import polyglot.ast.Local_c;
import polyglot.ast.Loop_c;
import polyglot.ast.MethodDecl;
import polyglot.ast.New_c;
import polyglot.ast.Node;
import polyglot.ast.NodeFactory;
import polyglot.ast.Node_c;
import polyglot.ast.Receiver;
import polyglot.ast.Stmt;
import polyglot.ast.TypeNode;
import polyglot.frontend.Job;
import polyglot.types.ConstructorDef;
import polyglot.types.ConstructorInstance;
import polyglot.types.Context;
import polyglot.types.Flags;
import polyglot.types.Name;
import polyglot.types.SemanticException;
import polyglot.types.Type;
import polyglot.types.TypeSystem;
import polyglot.types.Types;
import polyglot.util.Position;
import x10.ast.AnnotationNode;
import x10.ast.Async_c;
import x10.ast.ForLoop_c;
import x10.ast.StmtExpr_c;
import x10.ast.X10Binary_c;
import x10.ast.X10Call;
import x10.ast.X10Call_c;
import x10.ast.X10Conditional_c;
import x10.ast.X10FieldAssign_c;
import x10.ast.X10Field_c;
import x10.ast.X10Instanceof;
import x10.ast.X10Instanceof_c;
import x10.ast.X10LocalDecl_c;
import x10.ast.X10Local_c;
import x10.ast.X10New;
import x10.extension.X10Del;
import x10.types.X10ClassDef;
import x10.types.X10CodeDef;
import x10.types.X10ParsedClassType;
import x10.util.AltSynthesizer;
import x10.util.Synthesizer;
import x10.visit.X10TypeChecker;

/**
 * @author induk
 *Helper methods in creating new ast nodes and functions for specific purposes.
 *
 *
 */

public class AstHelper extends ContextVisitor  {
	
	
	private final TypeSystem ts;
	NodeFactory xnf;
	private Job job;
	private AltSynthesizer syn;
	private Synthesizer synth;
	private static Position PCG = Position.COMPILER_GENERATED;
	
	public AstHelper(Job job, TypeSystem ts, NodeFactory xnf){
		super(job, ts, xnf);
		this.job=job;
		this.ts = ts;
		this.xnf = xnf;
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);
		
	}
	
	/*
	 * TODO can be converted to a standalone visitor which analyses more cases
	 * and gives a bound on more cases.
	 * 
	 * now handeled. for(var i:long=0; i<n ; i=i+1) Or for(i=0; i<n ; i=i+1) OR for(i=n; i>=0; i--) OR for(i in 0..n-1)
	 * 
	 * @return Expr "n" ie.one init expression and one update expression
	 */
	
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
			////System.out.println("start extract bounds");
			List forInits = forNd.inits();
			if(forInits.get(0) instanceof LocalDecl_c && ((LocalDecl_c)forInits.get(0)).init().isConstant() && ((LocalDecl_c)forInits.get(0)).init() instanceof IntLit_c ){
				init = ((IntLit_c)((LocalDecl_c)forInits.get(0)).init()); 
				////System.out.println("Correct initialization");			
			}
			//case 2 :If init expr is a Local Assign and  int lit 
			else if(forInits.get(0) instanceof Eval_c && ((Eval_c)forInits.get(0)).expr() instanceof LocalAssign_c && ((LocalAssign_c)((Eval_c)forInits.get(0)).expr()).right() instanceof IntLit_c  ){
				init = (IntLit_c)((LocalAssign_c)((Eval_c)forInits.get(0)).expr()).right();
				////System.out.println("Correct initialization");	
			}
			//case 3 :If init expr is a local assign and it is a expr  as in for(i=exp;i>=0;i--)
			else if(forInits.get(0) instanceof Eval_c && ((Eval_c)forInits.get(0)).expr() instanceof LocalAssign_c ){
				initExpr = ((LocalAssign_c)((Eval_c)forInits.get(0)).expr()).right();
			}
			//case 4 :If init expr is a local decl and it is a expr  as in for(i=n;i>=0;i--)
			else if(forInits.get(0) instanceof LocalDecl_c){
				initExpr = ((LocalDecl_c)forInits.get(0)).init();
				////System.out.println("Correct initialization backward loop");
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
				
				////System.out.println("Correct update");
			}
			else
				throw new SemanticException(
						"TransformationError in extractLoopBound method, Loop bound cannot be extracted for the Loop : "
								+ forNode.toString() + " Worng updation for iterator");
			Expr forCond = forNd.cond();
			
			////System.out.println(forCond.getClass());
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
			//case 1 : i=0 ;i<n Or i<=n ;i++
				if(operatorUpdate.toString().equals("operator+") && init.value()==0 && update.value()==1 ){
					if(operatorCond.toString().equals("operator<"))
						limitFor=condition;
					else if(operatorCond.toString().equals("operator<="))
						limitFor=syn.createBinary(PCG,condition,Binary.ADD,syn.createLongLit(1),this);
					
				}
				//case 1.2 : i=1 ;i<n Or i<=n ;i++
				else if(operatorUpdate.toString().equals("operator+") && init.value()==1 && update.value()==1 ){
					if(operatorCond.toString().equals("operator<=") || operatorCond.toString().equals("operator<"))
						limitFor=condition;
					/*else if(operatorCond.toString().equals("operator<"))
						limitFor=syn.createBinary(PCG,syn.createLongLit(1),Binary.SUB,condition,this);
					*/
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
				////System.out.println("end extract bounds");

			
			
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
	public Expr makeConditional(Expr cond,Expr thenPart,Expr elsePart){
		Expr conditional = xnf.Conditional(PCG, cond, thenPart,
				elsePart).type(thenPart.type());
		return conditional;
		
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

	 /* @author Indu Arrayacess2D expresiion of the form sample(i,j) is created
	 *         (sample[long][long]) It returns the expression of the form
	 *         sample.operator()(i:long)(j:long).
	 * @param Local
	 *            variable array.
	 * @param Type
	 *            of the array. ie long if sample[long].
	 * @param Argument
	 *            to acees. ie i,j if sample(i)
	 * @param Types
	 *            of the argument passed.
	 * @context from the parent visitor.
	 * @return instanceCall of the form sample.operator()(i:long)(j:long)
	 */

	public Expr makeArrayAccess2D(Local arrayLocal, Type arrayType, Expr arg1, Expr arg2,
			Type argType1, Type argType2, Context context) throws SemanticException {

		List<TypeNode> arrayTypeList = new ArrayList<TypeNode>();
		List<Expr> arrayArgList = new ArrayList<Expr>();
		arrayArgList.add(arg1);
		arrayArgList.add(arg2);

		List<Type> arrayArgTypeList = new ArrayList<Type>();
		arrayArgTypeList.add(argType1);
		arrayArgTypeList.add(argType2);

		Expr arrayAcess = synth.makeInstanceCall(PCG, arrayLocal,
				Name.make("operator()"), arrayTypeList, arrayArgList,
				arrayType, arrayArgTypeList, context);
		return arrayAcess;

	}
	
	
	
	
	

}

/*
 * A visitor, which takes 2 arguments oldVariable and newVariable.
 * It replaces each occurence of oldvariable(in the form of local_c) in the subtree
 * with the newVariable. And returns the subtree.
 */
class tempVisitor extends ContextVisitor {

	private final TypeSystem ts;
	private NodeFactory xnf;
	private AltSynthesizer syn;
	private Synthesizer synth;
    private Job job;
    
	private static Position PCG = Position.COMPILER_GENERATED;

	public tempVisitor(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.job = job;
		this.ts = ts;
		this.xnf = xnf;
		
	}
	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
		if(n instanceof Local_c){
			////System.out.println("found");
		}
		return n;
	}

}

/*
 * A visitor, which takes 2 arguments oldVariable and newVariable.
 * It replaces each occurence of oldvariable(in the form of local_c) in the subtree
 * with the newVariable. And returns the subtree.
 */
class checkForFunctionCall extends ContextVisitor {

	private final TypeSystem ts;
	private NodeFactory xnf;
	private AltSynthesizer syn;
	private Synthesizer synth;
    private Job job;
    public static List<MethodDecl> funcTocheck;
    public static  Boolean funcPresent;
    public static X10Call funCall;
    public static MethodDecl funDecl;
    
	private static Position PCG = Position.COMPILER_GENERATED;

	public checkForFunctionCall(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.job = job;
		this.ts = ts;
		this.xnf = xnf;
		funcTocheck = new ArrayList<MethodDecl>();
		funcPresent = false;
		funCall = null;
		funDecl = null;
		
	}
	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
		if(n instanceof X10Call_c){
			for(MethodDecl mi:funcTocheck){
				if(mi.name().toString().equals(((X10Call_c)n).name().toString())){
					funcPresent = true;
					funCall= ((X10Call)n);
					funDecl = mi;
					
				}
			}
		}
		return n;
	}

}





/*@author Indu.
 * Temporary visitor which returns the "chunk" class node.
 * TODO : need to replace this with a vistor preprocessing stage,which adds the class "chunk" to the
 * source X10 files.either as a seperate file or as a new class def.
 *  
 */
class getChunkClassVisitor extends ContextVisitor {

	private final TypeSystem ts;
	NodeFactory xnf;

	private AltSynthesizer syn;
	private Synthesizer synth;
    private Job job;
    public static ClassDecl_c chunkNode;
	private static Position PCG = Position.COMPILER_GENERATED;

	public getChunkClassVisitor(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.job = job;
		this.ts = ts;
		this.xnf = xnf;
		chunkNode = null;
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);

	}

	protected NodeVisitor enterCall(Node parent, Node n) {

		return this;
	}

	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
		if(n instanceof ClassDecl_c){
			if( ((ClassDecl_c)n).name().toString().equals("chunk") ){
				chunkNode = ((ClassDecl_c)n);
			}
							
		}
		
		
		return n;
	}



}
/**
 * class to check if it is benefical to chunk a parallel for loop.
 * @author induk
 *
 */

class checkPossibleLoadImbalance extends ContextVisitor {

	private final TypeSystem ts;
	NodeFactory xnf;
	private AltSynthesizer syn;
	private Synthesizer synth;
	private int defaultCost;
	public static Name parForIterator=null;
	

	private static Position PCG = Position.COMPILER_GENERATED;

	public checkPossibleLoadImbalance(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.ts = ts;
		this.xnf = xnf;
		
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);
		defaultCost = 100; // default cost be 100 nanoseconds.
	

	}
	/*
	 * @author Indu
	 * 
	 * overriding the traversal of nodes that are not needed to process.
	 * Should be same as how statement profiler is doing.
	 */
	@Override
   public Node override(Node n) {
		
		if(!((n instanceof X10Call_c && ((X10Call_c)n).name().toString().startsWith("operator"))|| n instanceof X10Conditional_c))
			
			return n;
		else
			return null;
		
		
		
	}
	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {

		if (n instanceof X10Call_c && ((X10Call_c)n).name().toString().equals("operator*")) { // retrun true if its costFunction contains loop iterator.
			// n of the form m.op*(some expr);
			
			Expr right= ((X10Call_c) n).arguments().get(0);
			Expr canBeChunked = syn.createFalse(PCG); //assume that the bounds are constatnt
			if(right instanceof IntLit_c){
				canBeChunked=syn.createFalse(PCG);
			}
			else if(right instanceof BooleanLit_c){
				canBeChunked=right;
				
			}
			else{
				/**
				 * get the list of variables in the loopbound to check if it is dependent on the loop variable 
				 **/
						
				getVarUse getuses_v = new getVarUse(job, ts, xnf);
				getuses_v.begin().visitEdge(null,right);
				List<Name> listOfUses= getVarUse.listUses;
				boolean dependsOnFor=false;
				////System.out.println(" variables in right expresion of for loop ");
				for(Name d :listOfUses){
					if(d.toString().equals(parForIterator.toString())){
						dependsOnFor=true;
					}
				}
				if(dependsOnFor==true){
					canBeChunked=syn.createTrue(PCG);
				}
			}
			
			
			//check similarly for left expression
			Receiver left = ((X10Call_c) n).target(); 
			Expr canBeChunked2 = syn.createFalse(PCG); //assume that the bounds are constatnt
			if(left instanceof IntLit_c){
				canBeChunked2 = syn.createFalse(PCG);
				
			}
			else if(left instanceof BooleanLit_c){
				canBeChunked2 = (Expr)left;
				
			}
			else{
			/**
			 * get the list of variables in the loopbound to check if it is dependent on the loop variable 
			 **/
					
			getVarUse getuses_v = new getVarUse(job, ts, xnf);
			getuses_v.begin().visitEdge(null,left);
			List<Name> listOfUses= getVarUse.listUses;
			Boolean dependsOnFor=false;
			////System.out.println(" variables in left expresion of for loop ");
			for(Name d :listOfUses){
				if(d.toString().equals(parForIterator.toString())){
					dependsOnFor=true;
				}
			}
			if(dependsOnFor==true){
				canBeChunked2=syn.createTrue(PCG);
			}
			
			}
			
				if(canBeChunked instanceof BooleanLit_c && ((BooleanLit_c)canBeChunked).value()==true ){
					canBeChunked=syn.createTrue(PCG);
				}
				else if(canBeChunked2 instanceof BooleanLit_c && ((BooleanLit_c)canBeChunked2).value()==true ){
					canBeChunked=syn.createTrue(PCG);
				}
				
					
			
			
			
			Stmt canBeChunkedStmt = syn.createEval(canBeChunked);
			return canBeChunked;

		} 
	
	else if(n instanceof X10Call_c && ((X10Call_c)n).name().toString().equals("operator+")){
		Expr canBeChunked = syn.createFalse(PCG); //assume that the bounds are constatnt
		Expr dependsOnFor = syn.createFalse(PCG);
		//process the right operand
		Expr right = ((X10Call_c)n).arguments().get(0);
		Receiver left = ((X10Call_c)n).target();
		/**
		 * get the list of variables in the loopbound to check if it is dependent on the loop variable 
		 **/
				
		getVarUse getuses_v = new getVarUse(job, ts, xnf);
		getuses_v.begin().visitEdge(null,right);
		List<Name> listOfUses= getVarUse.listUses;
		////System.out.println(" variables in left expresion of for loop ");
		for(Name d :listOfUses){
			if(d.toString().equals(parForIterator.toString())){
				canBeChunked=syn.createTrue(PCG);
			}
		}
	
		
		/**
		 * get the list of variables in the loopbound to check if it is dependent on the loop variable 
		 **/
				
		getVarUse getuses_v1 = new getVarUse(job, ts, xnf);
		getuses_v1.begin().visitEdge(null,left);
		List<Name> listOfUses2= getVarUse.listUses;
		////System.out.println(" variables in left expresion of for loop ");
		for(Name d :listOfUses2){
			if(d.toString().equals(parForIterator.toString())){
				dependsOnFor=syn.createTrue(PCG);
			}
		}
		
		

		if(right instanceof IntLit_c){
			canBeChunked=syn.createFalse(PCG);
		}
		
		if (right instanceof BooleanLit_c) {
			canBeChunked = right; 
		}
		
		if(left instanceof IntLit_c){
			dependsOnFor=syn.createFalse(PCG);
		}
		
		if (left instanceof BooleanLit_c) {
			dependsOnFor = (Expr)left; 
		}
		
		
		
		
		//combine both left and right side
		if(dependsOnFor instanceof BooleanLit_c && ((BooleanLit_c)dependsOnFor).value()==true){
			canBeChunked=syn.createTrue(PCG);
		}
		else if(canBeChunked instanceof BooleanLit_c && ((BooleanLit_c)canBeChunked).value()==true){
			canBeChunked=syn.createTrue(PCG);
		}
		
		Stmt canBeChunkedStmt = syn.createEval(canBeChunked);
		return canBeChunked;
	}
	else if(n instanceof X10Conditional_c){
		Expr canBeChunked = syn.createFalse(PCG);
		Expr predicate = ((X10Conditional_c)n).cond();
		//then expr.
		Expr thenExpr= ((X10Conditional_c)n).consequent();
		boolean thenValue = false;
		if(thenExpr instanceof BooleanLit_c && ((BooleanLit_c)thenExpr).value()==true){
			thenValue=true;
		}
		else if(thenExpr instanceof BooleanLit_c && ((BooleanLit_c)thenExpr).value()==false){
			thenValue=false;
		}
		else if(thenExpr instanceof IntLit_c){
			thenValue=false;
		}
		//else expr.
		Expr elseExpr= ((X10Conditional_c)n).alternative();
		boolean elseValue = false;
		if(elseExpr instanceof BooleanLit_c && ((BooleanLit_c)elseExpr).value()==true){
			elseValue=true;
		}
		else if(elseExpr instanceof BooleanLit_c && ((BooleanLit_c)elseExpr).value()==false){
			elseValue=false;
		}
		else if(elseExpr instanceof IntLit_c){
			elseValue=false;
		}

		getVarUse getuses_v = new getVarUse(job, ts, xnf);
		getuses_v.begin().visitEdge(null,predicate);
		List<Name> listOfUses= getVarUse.listUses;
		Boolean dependsOnFor=false;
		////System.out.println(" variables in left expresion of if condition ");
		for(Name d :listOfUses){
			if(d.toString().equals(parForIterator.toString())){
				dependsOnFor=true;
			}
		}
		if(dependsOnFor == true){
			//check if the if else has a for loop inside , by checking if the cost function has a "*" in any of the then part or else part.
			/*checkForMultCal checkLoopPresent_v1 = new checkForMultCal(job, ts, xnf);
			checkForMultCal.loopPresent=false;
			checkLoopPresent_v1.begin().visitEdgeNoOverride(null,thenExpr);
			Boolean loopPresentThen = checkForMultCal.loopPresent;
			checkForMultCal checkLoopPresent_v2 = new checkForMultCal(job, ts, xnf);
			checkForMultCal.loopPresent=false;
			checkLoopPresent_v2.begin().visitEdgeNoOverride(null,elseExpr);
			Boolean loopPresentElse = checkForMultCal.loopPresent;
			
			if(loopPresentElse || loopPresentThen){
				canBeChunked = syn.createTrue(PCG);
			}*/
			canBeChunked = syn.createTrue(PCG);
		}
		else if (elseValue || thenValue){
			 canBeChunked = syn.createTrue(PCG);
		}
		
		Stmt canBeChunkedStmt = syn.createEval(canBeChunked);
		return canBeChunked;
		
	}
		return n;
	}
	
}
/**to be used as small helper class to check if a costfunction passed has
 * a multiply function inside it. It means to check if a loop is present in the subTree of current Node.
 * t
 * @author induk
 *
 */
class checkForMultCal extends ContextVisitor {
	private final TypeSystem ts;
	NodeFactory xnf;
	public static  boolean loopPresent;
	private static Position PCG = Position.COMPILER_GENERATED;

	public checkForMultCal(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.ts = ts;
		this.xnf = xnf;
		loopPresent=false;
	}
	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
		if(n instanceof X10Call_c && ((X10Call_c)n).name().toString().equals("operator*")){
			loopPresent = true;
		}
		return n;
	}

}
/**to be used as small helper class to check if a costfunction passed has
 * a multiply function inside it. It means to check if a loop is present in the subTree of current Node.
 * t
 * @author induk
 *
 */
class ListMultCal extends ContextVisitor {
	private final TypeSystem ts;
	NodeFactory xnf;
	
	private static Position PCG = Position.COMPILER_GENERATED;
	public static List<Node> loopCalls ;
	public ListMultCal(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.ts = ts;
		this.xnf = xnf;
		
		loopCalls = new ArrayList<Node>();
	}
	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
		if(n instanceof X10Call_c && ((X10Call_c)n).name().toString().equals("operator*")){
			loopCalls.add(n);
		}
		return n;
	}

}


/**
 * class to cleanup the costFunction generated by the parallel for loop
 * @author induk
 *
 */

class cleanUpCostFunction extends ContextVisitor {

	private final TypeSystem ts;
	NodeFactory xnf;
	private AltSynthesizer syn;
	private Synthesizer synth;
	private int defaultCost;
	public static Name parForIterator = null;

	private static Position PCG = Position.COMPILER_GENERATED;

	public cleanUpCostFunction(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.ts = ts;
		this.xnf = xnf;

		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);
		defaultCost = 100; // default cost be 100 nanoseconds.

	}

	/*
	 * @author Indu
	 * 
	 * overriding the traversal of nodes that are not needed to process. Should
	 * be same as how statement profiler is doing.
	 */
	@Override
	public Node override(Node n) {

		if (!((n instanceof X10Call_c && ((X10Call_c) n).name().toString()
				.startsWith("operator")) || n instanceof X10Conditional_c))

			return n;
		else
			return null;

	}

	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {

		if (n instanceof X10Call_c
				&& ((X10Call_c) n).name().toString().equals("operator*")) {
			
			
			Expr newCal = (Expr) n;
			Receiver left = ((X10Call_c) n).target();
			Expr right = ((X10Call_c) n).arguments().get(0);
			long leftValue = 1;			
			long rightValue = 1;
			long result = 1;
			//a*0 =0 
			if( (right instanceof IntLit_c && ((IntLit_c) right).value() == 0) || ( left instanceof IntLit_c && ((IntLit_c) left).value() == 0 )){
				newCal = syn.createLongLit(0);
			}
			 //a*b = ab
			else if (right instanceof IntLit_c && left instanceof IntLit_c) {
				leftValue = ((IntLit_c) left).value();
				rightValue = ((IntLit_c) right).value();
				result = leftValue * rightValue;
				newCal = syn.createLongLit(result);

			}
			return newCal;

		}
		
		else if (n instanceof X10Call_c
				&& ((X10Call_c) n).name().toString().equals("operator+")) {
			Expr newCal = (Expr) n;
			Receiver left = ((X10Call_c) n).target();
			long leftValue = 0;

			Expr right = ((X10Call_c) n).arguments().get(0);
			long rightValue = 0;
			long result = 0;
					
		// Some error for some expression eg:mis atomic zero -new version	
			if (right instanceof IntLit_c && left instanceof IntLit_c) {
				leftValue = ((IntLit_c) left).value();
				rightValue = ((IntLit_c) right).value();
				result = leftValue + rightValue;
				newCal = syn.createLongLit(result);
				}
			
				else if (right instanceof IntLit_c || left instanceof IntLit_c) {
					
					//a+0=a
					if( right instanceof IntLit_c && ((IntLit_c) right).value() == 0 ){
						newCal = (Expr)left;
					}
					//0+a=a;
					else if( left instanceof IntLit_c && ((IntLit_c) left).value() == 0 ) {
						newCal = (Expr)right;
						
					}
				}
		
        /*//FIXME: old version
						
			if (right instanceof IntLit_c || left instanceof IntLit_c) {
				
				//a+0=a
				if( right instanceof IntLit_c && ((IntLit_c) right).value() == 0 ){
					newCal = (Expr)left;
				}
				//0+a=a;
				else if( left instanceof IntLit_c && ((IntLit_c) left).value() == 0 ) {
					newCal = (Expr)right;
					
				}
			}
				else if (right instanceof IntLit_c && left instanceof IntLit_c) {
				leftValue = ((IntLit_c) left).value();
				rightValue = ((IntLit_c) right).value();
				result = leftValue + rightValue;
				newCal = syn.createLongLit(result);
				}*/
			
			return newCal;

		} else if (n instanceof X10Conditional_c) {
			Expr newCal = (Expr) n;
			// check if there is no variables in the conditional expresiion.if
			// no variables are present then directly evaluate the expresiion
			// by returning the max of then or else part.
			getVarUse getuses_v = new getVarUse(job, ts, xnf);
			getuses_v.begin().visitEdge(null, n);
			List<Name> listOfUses = getVarUse.listUses;

			Expr thenPart = ((X10Conditional_c) n).consequent();
			Expr elsePart = ((X10Conditional_c) n).alternative();
			//if (x? 0:0) -> 0
			if(thenPart instanceof IntLit_c && ((IntLit_c)thenPart).value() == 0 && elsePart instanceof IntLit_c && ((IntLit_c)elsePart).value()==0  ){
				
				newCal = syn.createLongLit(0);
			}
			else{
			
			long thenValue = 0;
			long elsevalue = 0;
			long max = 0;
			if (listOfUses.size() == 0 && thenPart instanceof IntLit_c
					&& elsePart instanceof IntLit_c) {
				thenValue = ((IntLit_c) thenPart).value();
				elsevalue = ((IntLit_c) elsePart).value();
				max = Math.max(thenValue, elsevalue);
				newCal = syn.createLongLit(max);
			}
			}
			return newCal;

		}
		return n;
	}

}

/*
 * @author Indu
 * 
 * 
 * query the subtree rooted at node n.
 * 
 * @return : Populate a List of nodes of type "keyNodeType" under the subtree
 * rooted at n
 */

class QuerySubtree extends ContextVisitor {

	private static Class<?> keyNodeType; // Node to search if present in the
											// subtree
	public static List queriedNodes;
	private AltSynthesizer syn;
	private Synthesizer synth;
	TypeSystem ts;

	public QuerySubtree(Job job, TypeSystem ts, NodeFactory xnf,
			Class<?> keyNodeType) {
		super(job, ts, xnf);

		this.keyNodeType = keyNodeType;
		queriedNodes = new ArrayList<Node>();
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);
		this.ts = ts;
		// costFunction = xnf.Empty(PCG);
		// tempAsync = null;
	}

	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {

		if (keyNodeType.isInstance(n)) {
			queriedNodes.add(n);

		}

		return n;
	}

}

/*
 * @author Indu
 * 
 * query the subtree rooted at node n.
 * 
 * @return : populates the member keyParent with a node of type "keyNodeType"
 * which immediately encloses node n.
 * 
 * @return : null if no such node exists.
 * 
 * TODO : take-care of the static field keyParent and sample.It may create
 * problems
 */

class QueryImmediateAstParent extends ContextVisitor {

	public static Class<?> keyParentType; // Node to search if present in the subtree
	public Node keyNode;
	public static Node keyParent;
	private static boolean toOverride;

	public QueryImmediateAstParent(Job job, TypeSystem ts, NodeFactory xnf,Class<?> keyParentType,
			 Node keyNode) {
		super(job, ts, xnf);

		
		this.keyNode = keyNode;
		this.keyParent = null;
		toOverride = false;
		this.keyParentType = keyParentType;

	}

	/*
	 * @author Indu
	 * 
	 * overriding the traversal of nodes rooted at n;as we are searching for
	 * parent
	 */
	@Override
	public Node override(Node parent, Node n) {
		// TODO Auto-generated method stub
		if (n.equals(keyNode)) {
			toOverride = true;
		}
		if (toOverride == true) {
			return n;
		}

		return super.override(parent, n);
	}

	protected NodeVisitor enterCall(Node parent, Node n) {
		if (n.getClass().equals(keyParentType)) {
			////System.out.println("found parent");
			X10CodeDef def = context.currentCode();
			keyParent = n;
		}
		return this;
	}

	public Node getImmediateParent() {
		// ////System.out.println("inside getImmediateParent :found parent"
		// + keyParent.getClass());
		return keyParent;
	}

}



/*
* @author Indu
* 
* 
* 
* @return : populates the member keyParent with a node of type "classDecl"
* which immediately encloses node n.
* 
* @return : null if no such node exists.
* 
* TODO : take-care of the static field keyParent and sample.It may create
* problems
*/

class QueryEnclosingClass extends ContextVisitor {

public Node keyNode;
public static Node keyParent;
private static boolean toOverride;

public QueryEnclosingClass(Job job, TypeSystem ts, NodeFactory xnf, Node keyNode) {
	super(job, ts, xnf);

	
	this.keyNode = keyNode;
	this.keyParent = null;
	toOverride = false;
	
}


/*
 * overriding the traversal of nodes rooted at n;as we are searching for
 * parent
 */
@Override
public Node override(Node parent, Node n) {
	// TODO Auto-generated method stub
	if (n.equals(keyNode)) {
		toOverride = true;
	}
	if (toOverride == true) {
		return n;
	}

	return super.override(parent, n);
}

protected NodeVisitor enterCall(Node parent, Node n) {
	if (n instanceof ClassDecl_c) {
		//System.out.println("found parent");
		X10CodeDef def = context.currentCode();
		keyParent = n;
	}
	return this;
}

public Node getImmediateParent() {
	// //System.out.println("inside getImmediateParent :found parent"
	// + keyParent.getClass());
	return keyParent;
}

}




/*
 * @author Indu. Temporary visitor which returns the workDivider class node.
 * TODO : need to replace this with a vistor preprocessing stage,which adds the
 * class "workDivider" to the source X10 files.either as a separate file or as a
 * new class def.
 */
class getWorkDivider extends ContextVisitor {

	private final TypeSystem ts;
	NodeFactory xnf;

	private AltSynthesizer syn;
	private Synthesizer synth;
	private Job job;
	public static ClassDecl_c workDividerClass;
	private static Position PCG = Position.COMPILER_GENERATED;

	public getWorkDivider(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.job = job;
		this.ts = ts;
		this.xnf = xnf;
		workDividerClass = null;
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);

	}

	protected NodeVisitor enterCall(Node parent, Node n) {

		return this;
	}

	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
		if (n instanceof ClassDecl_c) {
			if (((ClassDecl_c) n).name().toString().equals("WorkDivider")) {
				ClassDecl_c c = ((ClassDecl_c) n);
				workDividerClass = c;

			}

		}

		return n;
	}

}



/*
 * @author Indu. Temporary visitor which returns the workDivider class node.
 * TODO : need to replace this with a vistor preprocessing stage,which adds the
 * class "workDivider" to the source X10 files.either as a separate file or as a
 * new class def.
 */
class getDynSched extends ContextVisitor {

	private final TypeSystem ts;
	NodeFactory xnf;

	private AltSynthesizer syn;
	private Synthesizer synth;
	private Job job;
	public static ClassDecl_c workDividerClass;
	private static Position PCG = Position.COMPILER_GENERATED;

	public getDynSched(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.job = job;
		this.ts = ts;
		this.xnf = xnf;
		workDividerClass = null;
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);

	}

	protected NodeVisitor enterCall(Node parent, Node n) {

		return this;
	}

	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
		if (n instanceof ClassDecl_c) {
			if (((ClassDecl_c) n).name().toString().equals("DynSched")) {
				ClassDecl_c c = ((ClassDecl_c) n);
				workDividerClass = c;

			}

		}

		return n;
	}

}
class getGuidSched extends ContextVisitor {

	private final TypeSystem ts;
	NodeFactory xnf;

	private AltSynthesizer syn;
	private Synthesizer synth;
	private Job job;
	public static ClassDecl_c workDividerClass;
	private static Position PCG = Position.COMPILER_GENERATED;

	public getGuidSched(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.job = job;
		this.ts = ts;
		this.xnf = xnf;
		workDividerClass = null;
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);

	}

	protected NodeVisitor enterCall(Node parent, Node n) {

		return this;
	}

	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
		if (n instanceof ClassDecl_c) {
			if (((ClassDecl_c) n).name().toString().equals("GuidSched")) {
				ClassDecl_c c = ((ClassDecl_c) n);
				workDividerClass = c;

			}

		}

		return n;
	}

}

/*
 * @author Indu. Temporary visitor which returns the workDivider class node.
 * TODO : need to replace this with a vistor preprocessing stage,which adds the
 * class "workDivider" to the source X10 files.either as a separate file or as a
 * new class def.
 */
class getHistSched extends ContextVisitor {

	private final TypeSystem ts;
	NodeFactory xnf;

	private AltSynthesizer syn;
	private Synthesizer synth;
	private Job job;
	public static ClassDecl_c workDividerClass;
	private static Position PCG = Position.COMPILER_GENERATED;

	public getHistSched(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.job = job;
		this.ts = ts;
		this.xnf = xnf;
		workDividerClass = null;
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);

	}

	protected NodeVisitor enterCall(Node parent, Node n) {

		return this;
	}

	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
		if (n instanceof ClassDecl_c) {
			if (((ClassDecl_c) n).name().toString().equals("HistorySched")) {
				ClassDecl_c c = ((ClassDecl_c) n);
				//System.out.println("found History");
				workDividerClass = c;

			}

		}

		return n;
	}

}
/*
 * @author Indu. Temporary visitor which returns the workDivider class node.
 * TODO : need to replace this with a vistor preprocessing stage,which adds the
 * class "workDivider" to the source X10 files.either as a separate file or as a
 * new class def.
 */
class getHistProfileObj extends ContextVisitor {

	private final TypeSystem ts;
	NodeFactory xnf;

	private AltSynthesizer syn;
	private Synthesizer synth;
	private Job job;
	public static X10FieldAssign_c obj;
	private static Position PCG = Position.COMPILER_GENERATED;

	public getHistProfileObj(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.job = job;
		this.ts = ts;
		this.xnf = xnf;
		obj = null;
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);

	}

	protected NodeVisitor enterCall(Node parent, Node n) {

		return this;
	}

	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
		if (n instanceof X10FieldAssign_c) {
			if(((X10FieldAssign_c )n).name().toString().contentEquals("histObj")) {
				 
				X10FieldAssign_c c = ((X10FieldAssign_c) n);
				obj= c;

			}

		}

		return n;
	}

}


/*
 * @author Indu. Temporary visitor which returns the getFileWriter class node.
 * TODO : need to replace this with a vistor preprocessing stage,which adds the
 * class "getFileWriter" to the source X10 files.either as a separate file or as
 * a new class def.
 */
class getFileWriter extends ContextVisitor {

	private final TypeSystem ts;
	NodeFactory xnf;

	private AltSynthesizer syn;
	private Synthesizer synth;
	private Job job;
	public static ClassDecl_c workDividerClass;
	private static Position PCG = Position.COMPILER_GENERATED;

	public getFileWriter(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.job = job;
		this.ts = ts;
		this.xnf = xnf;
		workDividerClass = null;
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);

	}

	protected NodeVisitor enterCall(Node parent, Node n) {

		return this;
	}

	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
		if (n instanceof ClassDecl_c) {
			if (((ClassDecl_c) n).name().toString().equals("WriteToFile")) {
				ClassDecl_c c = ((ClassDecl_c) n);
				workDividerClass = c;

			}

		}

		return n;
	}

}



/*
 * @author Indu. Temporary visitor which returns the getFileWriter class node.
 * TODO : need to replace this with a vistor preprocessing stage,which adds the
 * class "getFileWriter" to the source X10 files.either as a separate file or as
 * a new class def.
 */
class getHistFileWriter extends ContextVisitor {

	private final TypeSystem ts;
	NodeFactory xnf;

	private AltSynthesizer syn;
	private Synthesizer synth;
	private Job job;
	public static ClassDecl_c workDividerClass;
	private static Position PCG = Position.COMPILER_GENERATED;

	public getHistFileWriter(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.job = job;
		this.ts = ts;
		this.xnf = xnf;
		workDividerClass = null;
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);

	}

	protected NodeVisitor enterCall(Node parent, Node n) {

		return this;
	}

	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
		if (n instanceof ClassDecl_c) {
			if (((ClassDecl_c) n).name().toString().equals("WriteToHistoryFile")) {
				ClassDecl_c c = ((ClassDecl_c) n);
				workDividerClass = c;

			}

		}

		return n;
	}

}





/*
 * A visitor which traverses the nodes between an async and its parent for-loop
 * and finds if there is any variable_declarations which are used to make the
 * for-loops iterator visible inside the async body. eg: for( i ...) val i_temp
 * = i; async{...} The visitor searches for the presence of a variable
 * i_temp,which makes the i visible inside the async. If such a varible not
 * present then returns the loop iterator itself.
 */
class getLoopIteratorToReplace extends ContextVisitor {

	private final TypeSystem ts;
	NodeFactory xnf;

	private AltSynthesizer syn;
	private Synthesizer synth;
	private Job job;
	private LocalDecl_c parForIt;
	public static Local_c varToReplace;
	private static Position PCG = Position.COMPILER_GENERATED;

	public getLoopIteratorToReplace(Job job, TypeSystem ts, NodeFactory xnf,
			LocalDecl_c parForIt) {
		super(job, ts, xnf);
		this.job = job;
		this.ts = ts;
		this.xnf = xnf;
		this.parForIt = parForIt;

		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);
		varToReplace = (Local_c) syn.createLocal(PCG, parForIt);

	}

	// No need to traverse inside an async.
	public Node override(Node parent, Node n) {
		if (n instanceof Async_c) {
			return n;
		}
		return super.override(parent, n);
	}

	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {

		if (n instanceof LocalDecl_c && !((LocalDecl_c) n).init().isConstant()) {
			// ((Local_c)((LocalDecl_c)n).init()).name().toString().equals(parForIt.name().toString());
			varToReplace = (Local_c) syn.createLocal(PCG, ((LocalDecl_c) n));
		}

		return n;
	}

}

/*
 * A visitor, which takes 2 arguments oldVariable and newVariable. It replaces
 * each occurence of oldvariable(in the form of local_c) in the subtree with the
 * newVariable. And returns the subtree.
 */
class replaceOldVarToNewVar extends ContextVisitor {

	private final TypeSystem ts;
	private NodeFactory xnf;
	private AltSynthesizer syn;
	private Synthesizer synth;
	private Job job;
	private Expr newVar;
	public Local_c oldVar;
	private static Position PCG = Position.COMPILER_GENERATED;

	public replaceOldVarToNewVar(Job job, TypeSystem ts, NodeFactory xnf,
			Local_c oldVar, Expr newVar) {
		super(job, ts, xnf);
		this.job = job;
		this.ts = ts;
		this.xnf = xnf;
		this.oldVar = oldVar;
		this.newVar = newVar;
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);
	}

	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
		if (n instanceof Local_c
				&& ((Local_c) n).name().toString()
						.equals(oldVar.name().toString())) {
			return newVar;
		}
		
		return n;
	}

}

/*
 *A visitor which changes the array access with a point index to a array access to a long index.
 *By changing its exception condition.
 */
class replacePointIteratorToLongIterator extends ContextVisitor {

	private final TypeSystem ts;
	private NodeFactory xnf;
	private AltSynthesizer syn;
	private Synthesizer synth;
	private Job job;
	private Expr newVar;
	public Local_c oldVar;
	private static Position PCG = Position.COMPILER_GENERATED;

	public replacePointIteratorToLongIterator(Job job, TypeSystem ts, NodeFactory xnf, Local_c oldVar) {
		super(job, ts, xnf);
		this.job = job;
		this.ts = ts;
		this.xnf = xnf;
		this.oldVar = oldVar;
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);
	}

	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
		if (n instanceof StmtExpr_c) {
			if( ((StmtExpr_c)n).statements().size() >=3 && ((StmtExpr_c)n).statements().get(1) instanceof LocalDecl_c ){
				LocalDecl_c ptDec= (LocalDecl_c) ((StmtExpr_c)n).statements().get(1);
				if( ptDec.init() instanceof Local_c && ((Local_c)ptDec.init()).name().toString().equals(oldVar.name().toString()) ){
					
					if( ((StmtExpr_c)n).statements().get(2) instanceof If_c){
						If_c ifExpr = (If_c)((StmtExpr_c)n).statements().get(2);
						if( ifExpr.cond() instanceof X10Call_c && ((X10Call_c)ifExpr.cond()).name().toString().equals("operator!") &&
								((X10Call_c)ifExpr.cond()).target() instanceof X10Binary_c && ((Binary_c)((X10Call_c)ifExpr.cond()).target()).right() instanceof X10Field_c
								&& ((Binary_c)((X10Call_c)ifExpr.cond()).target()).left() instanceof X10Field_c)
								{
							X10Field_c t =  (X10Field_c)((Binary_c)((X10Call_c)ifExpr.cond()).target()).right() ;
									if(t.name().toString().equals("rank")){
									Expr rightExpr = 	syn.createLongLit(1);
									Expr leftExpr =     ((Binary_c)((X10Call_c)ifExpr.cond()).target()).right();
									Binary newBinary = ((Binary_c)((X10Call_c)ifExpr.cond()).target()).left(leftExpr);
									newBinary = newBinary.right(rightExpr);
									X10Call newCall = ((X10Call_c)ifExpr.cond()).target(newBinary);
									If_c newIf =(If_c) ifExpr.cond(newCall);
									//change the type of pt variable to long
									ptDec =(LocalDecl_c) ptDec.type(nf.CanonicalTypeNode(PCG,ts.Long()));
									
									List<Stmt> newList = new ArrayList<Stmt>();
									newList.add(((StmtExpr_c)n).statements().get(0));
									newList.add(ptDec);
									newList.add(newIf);
									return syn.createStmtExpr(PCG,newList,((StmtExpr_c)n).result() );
 									}
								}
						
						
					}
					
				}
				
			}
		}
		
		return n;
	}

}

/*
 * A visitor,creates a duplicate of the subtree.
 */
class duplicateSubtree extends ContextVisitor {

	private final TypeSystem ts;
	private NodeFactory xnf;
	private AltSynthesizer syn;
	private Synthesizer synth;
	private Job job;

	private static Position PCG = Position.COMPILER_GENERATED;

	public duplicateSubtree(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.job = job;
		this.ts = ts;
		this.xnf = xnf;

		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);
	}

	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
		if (n instanceof Node_c) {
			Node_c newN = (Node_c) ((Node_c) n).copy();
			return newN;
		}
		return n;
	}

}
/*
 * @author Indu
 * 
 * 
 * query the subtree rooted at node n.
 * 
 * @return : Populate a List of nodes of type "keyNodeType" under the subtree
 * rooted at n
 */

class QuerySubtreeLoops extends ContextVisitor {

	
	public static List queriedNodes  = new ArrayList<Node>();;
	private AltSynthesizer syn;
	private Synthesizer synth;
	TypeSystem ts;

	public QuerySubtreeLoops(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);
		this.ts = ts;
		// costFunction = xnf.Empty(PCG);
		// tempAsync = null;
	}

	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {

		if (n instanceof Loop_c) {
			queriedNodes.add((Loop_c)n);

		}

		return n;
	}

}

/*
 * @author Indu
 * 
 * query the subtree rooted at node n.
 * 
 * @return : populates the member keyParent with a node of type "keyNodeType"
 * which immediately encloses node n.
 * 
 * @return : null if no such node exists.
 * 
 * TODO : take-care of the static field keyParent and sample.It may create
 * problems
 */

class QueryEnclosingLoop extends ContextVisitor {

	
	public static Node keyNode;
	public static Stack<Loop_c> loopStack;
	private static boolean toOverride;

	public QueryEnclosingLoop(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);

		
		loopStack = new Stack<Loop_c>();
		toOverride = false;
		
	}

	/*
	 * @author Indu
	 * 
	 * overriding the traversal of nodes rooted at n;as we are searching for
	 * parent
	 */
	@Override
	public Node override(Node parent, Node n) {
		// TODO Auto-generated method stub
		if (n.equals(keyNode)) {
			toOverride = true;
		}
		if (toOverride == true) {
			return n;
		}

		return super.override(parent, n);
	}

	protected NodeVisitor enterCall(Node parent, Node n) {
		if (n instanceof Loop_c) {
			Loop_c newLoop = (Loop_c)n;
			loopStack.push(newLoop);
		}
		return this;
	}

	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {

		if (n instanceof Loop_c) {
		if( n.equals(loopStack.peek()) && toOverride==false){
			loopStack.pop();
		}
		}

		return n;
	}
	
}
class innerLoopDefUseCheck extends ContextVisitor {

	
	private final TypeSystem ts;
	NodeFactory xnf;
	private AltSynthesizer syn;
	private Synthesizer synth;
	
	private static Position PCG = Position.COMPILER_GENERATED;
	private Job job;
	private Name varUseToCheck;
	public static boolean isRedefined;
	private static Stmt stmtInUse;
	private static boolean toOverrideAfterThis;
	public static Expr redefinedVarToReplace;
	public static Local_c redefinedVarToBeReplaced;
	public static Stack<Stmt> stmtStack;
	public innerLoopDefUseCheck(Job job, TypeSystem ts, NodeFactory xnf,Name varUseToCheck,Stmt stmtInUse) {
		super(job, ts, xnf);
		this.job = job;
		this.ts = ts;
		this.xnf = xnf;
		isRedefined=false;
		toOverrideAfterThis=false;
		this.stmtInUse=stmtInUse;
		this.varUseToCheck=varUseToCheck;
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);
		stmtStack = new Stack<Stmt>();
		
		

	}
     public Node override(Node n) {
		if(toOverrideAfterThis == true){
			return n; 
		}
		else
			return null;
	}
	
	
	protected NodeVisitor enterCall(Node parent, Node n) {
		  
		 if(n instanceof Stmt && n.position().equals(stmtInUse.position())){
			 toOverrideAfterThis = true;
		 }
		 else if(n instanceof Stmt){
			 stmtStack.push((Stmt)n);
			 
		 }
		 return this;
		}
		
	
	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
		if(n instanceof Block_c){
			List<Stmt> loopList = ((Block_c)n).statements();
			for(int i=loopList.size()-1;i>=0;i++){
				
				
			}
			
		}
		
		
		/*if(n instanceof FieldAssign_c){
			FieldAssign_c fa = ((FieldAssign_c)n);
			if( fa.left() instanceof FieldAssign_c && ((FieldAssign_c)fa.left()).name().toString().equals(varUseToCheck.toString()) )
			{
				//System.out.println(" this var is redifined "+((FieldAssign_c)fa.left()).name());
				isRedefined=true;
			}
		}
		*//**
		 * case 2 : there is a function call which modifies the variables under consideration.
		 * here we assume that the functions that modify the varibles are
		 *  1) clear
		 *  2) add
		 *  3) remove
		 *  4) operator()= (in the case of a array writing)
		 * these function are considered by analysing the benchmark under consideration.
		 * If the function is of any of the above form, then check the receiver of the function
		 *//*
		else if(n instanceof X10Call_c){
			if( ((X10Call_c)n).name().toString().contains("clear") || ((X10Call_c)n).name().toString().contains("add") ||((X10Call_c)n).name().toString().contains("operator()=")
					|| ((X10Call_c)n).name().toString().contains("remove")){
				//case 1 the receiver is a Local variable
				if( ((X10Call_c)n).target() instanceof Local_c )
				{				
				Name nm = ((Local_c)((X10Call_c)n).target()).name().id();
				if(nm.toString().equals(varUseToCheck.toString())){
					//System.out.println(" this var is redifined "+nm);
					isRedefined=true;
				}
				} 
				//case 2 the receiver is a field reference
				else if( ((X10Call_c)n).target() instanceof Field_c )
				{				
				Name nm = ((Field_c)((X10Call_c)n).target()).name().id();
				if(nm.toString().equals(varUseToCheck.toString())){
					//System.out.println(" this var is redifined "+nm);
					isRedefined=true;
				}
				} 
				
			}
		}
		else if(n instanceof StmtExpr_c && ((StmtExpr_c)n).result() instanceof X10Call_c ){
			StmtExpr_c e = ((StmtExpr_c)n);
			if ( ((X10Call_c)e.result()).name().toString().contains("operator()=")){
				Stmt firstStmt = e.statements().get(0);
				if(firstStmt instanceof X10LocalDecl_c){
					Expr var =((LocalDecl_c)firstStmt).init();
					if(var instanceof X10Local_c && ((X10Local_c)var).name().toString().equals(varUseToCheck.toString())){
						
						//System.out.println(" this var is redifined "+((X10Local_c)var).name().id());
						isRedefined=true;
					}
					else if(var instanceof X10Field_c && ((X10Field_c)var).name().toString().equals(varUseToCheck.toString()) ){
						//System.out.println(" this var is redifined "+((X10Field_c)var).name());
						isRedefined=true;
					}
				}
				//System.out.print("");
				
			}
			
		}
		
		
		else if(n instanceof LocalAssign_c){
			LocalAssign_c la = ((LocalAssign_c)n);
			if( la.left() instanceof Local_c && ((Local_c)la.left()).name().toString().equals(varUseToCheck.toString()) )
			{
				//System.out.println(" this var is redifined "+((Local_c)la.left()).name());
				isRedefined=true;
			}
			
		}
		if(n instanceof LocalDecl_c){
			LocalDecl_c ld = ((LocalDecl_c)n);
			if(ld.name().toString().equals(varUseToCheck.toString())){
				//System.out.println(" this var is redifined "+varUseToCheck);
				isRedefined = true;
				
				Expr init = ld.init();
				*//**
				 * The redefined variable if is using a class varible in any of the following form
				 *  1) array access.
				 *  2)filed access.
				 *  If it is using class variable then replace the local variable with class variable
				 *  Currently only array access is handeled.
				 *//*
				//case 1 array access
				if(init instanceof StmtExpr_c && ((StmtExpr_c)init).result() instanceof X10Call_c 
						&& ((X10Call_c)((StmtExpr_c)init).result()).name().toString().equals("operator()")){
					Stmt firstStmt = ((StmtExpr_c)init).statements().get(0);
					
					if(firstStmt instanceof LocalDecl_c){
						if( ((LocalDecl_c)firstStmt).init().toString().startsWith("this") ){
							//System.out.println("class variable oK to use");
							isRedefined=false;
							redefinedVarToReplace=init;
							redefinedVarToBeReplaced=(Local_c)syn.createLocal(PCG,ld.localDef().asInstance());
						}
					}
					
				}
				
				
			}
			
			
		}*/
		
		
		
		return n;
	}
	
	
	
	
	

}
/**
 * class to check if it is benefical to chunk a parallel for loop.
 * @author induk
 * 
 *
 */

class loadImbalanceChecker extends ContextVisitor {

	private final TypeSystem ts;
	NodeFactory xnf;
	private AltSynthesizer syn;
	private Synthesizer synth;
	
	public static Name parForIterator=null;
	private static Position PCG = Position.COMPILER_GENERATED;
	public  static boolean dependsOnFor;
	public static HashMap<Node, Boolean> loopCalls;
	public loadImbalanceChecker(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.ts = ts;
		this.xnf = xnf;
		dependsOnFor = false;
		loopCalls = new HashMap<Node, Boolean>();
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);
	}
	/*
	 * @author Indu
	 * 
	 * overriding the traversal of nodes that are not needed to process.
	 * Should be same as how statement profiler is doing.
	 */
	@Override
    public Node override(Node n) {
		if(!((n instanceof X10Call_c && ((X10Call_c)n).name().toString().startsWith("operator"))|| n instanceof X10Conditional_c))
			return n;
		else
			return null;
	}
	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {

		if (n instanceof X10Call_c && ((X10Call_c)n).name().toString().equals("operator*")) { // retrun true if its costFunction contains loop iterator.
			// n of the form m.op*(some expr);
			Expr right= ((X10Call_c) n).arguments().get(0);
			Receiver left = ((X10Call_c) n).target();
			//get the list of uses form right and left and check for loop-iterator.
			getVarUse getuses_v = new getVarUse(job, ts, xnf);
			getuses_v.begin().visitEdge(null,right);
			List<Name> listOfUses= getVarUse.listUses;
			getVarUse getuses_v2 = new getVarUse(job, ts, xnf);
			getuses_v2.begin().visitEdge(null,left);
			List<Name> listOfUses2= getVarUse.listUses;
			//combine both lists
			listOfUses.addAll(listOfUses2);

			boolean dependsOnFor=false;
			//System.out.println(" variables in right expresion of for loop ");
			for(Name d :listOfUses){
				if(d.toString().equals(parForIterator.toString())){
					dependsOnFor=true;
				}
			}
			if(dependsOnFor==true){
				this.dependsOnFor = true;
			}
			//add to the list of loop cals.
			loopCalls.put(n, dependsOnFor);
			
		}
		else if(n instanceof X10Conditional_c){
		Expr canBeChunked = syn.createFalse(PCG);
		Expr predicate = ((X10Conditional_c)n).cond();
		//then expr.
		Expr thenExpr= ((X10Conditional_c)n).consequent();
		//else expr.
		Expr elseExpr= ((X10Conditional_c)n).alternative();
		
		//check if the condition has a loop variable inside it.
		getVarUse getuses_v = new getVarUse(job, ts, xnf);
		getuses_v.begin().visitEdge(null,predicate);
		List<Name> listOfUses= getVarUse.listUses;
		Boolean dependsOnFor=false;
		//System.out.println(" variables in left expresion of if condition ");
		for(Name d :listOfUses){
			if(d.toString().equals(parForIterator.toString())){
				dependsOnFor=true;
			}
		}
		if(dependsOnFor == true){
			//if loop cond depends on for, then take decision based on inner loops.
			//case 1: there is a loop present in the subtree then set depends on for is true. irrespective of whether inner loop depends or not.
			ListMultCal listMultCals = new ListMultCal(job, ts, xnf);
			listMultCals.begin().visitEdgeNoOverride(null,thenExpr);
			List<Node> loopsInside = ListMultCal.loopCalls;
			
			ListMultCal listMultCals2 = new ListMultCal(job, ts, xnf);
			listMultCals2.begin().visitEdgeNoOverride(null,elseExpr);
			List<Node> loopsInside2 = ListMultCal.loopCalls;
			loopsInside.addAll(loopsInside2);
			
			if(loopsInside.size() >0){
				this.dependsOnFor = true;
			}
			//remove the if condition from the conditional expression. so that in future it doesnot give wron value for the loop.
			
			n = ((Conditional_c)n).cond(syn.createFalse(PCG));
			
		}
		else{
			//when loop condition doesnot depend on loop iterator,
			//case 1:Inner loop depends on loop iterator, then set dependsOnFor as true
			ListMultCal listMultCals = new ListMultCal(job, ts, xnf);
			listMultCals.begin().visitEdgeNoOverride(null,thenExpr);
			List<Node> loopsInside = ListMultCal.loopCalls;
			
			ListMultCal listMultCals2 = new ListMultCal(job, ts, xnf);
			listMultCals2.begin().visitEdgeNoOverride(null,elseExpr);
			List<Node> loopsInside2 = ListMultCal.loopCalls;
			loopsInside.addAll(loopsInside2);
			for(Node li : loopsInside){
				if( loopCalls.get(li) != null){
					Boolean checkDependency = loopCalls.get(li);
					if(checkDependency == true){
						this.dependsOnFor = true;
					}
					
				}
				//check if this loop depends on loop iterator.
				//check if the condition has a loop variable inside it.
				getVarUse getuses_v3 = new getVarUse(job, ts, xnf);
				getuses_v3.begin().visitEdge(null,li);
				List<Name> listOfUses3= getVarUse.listUses;
				Boolean checkDependency =false;
				
				for(Name d :listOfUses3){
					if(d.toString().equals(parForIterator.toString())){
						checkDependency = true;
					}
				}
				loopCalls.put(li, checkDependency);
				if(checkDependency == true ){
					this.dependsOnFor = true;
				}
				
				
			}
			//case 2: If no inner loops depends on loop iterator then do nothing to set the dependsOnFor variable
			
			
		}
		
		
	}
		return n;
	}
	
}
class getProfiledAsyncBody extends ContextVisitor {

	private final TypeSystem ts;
	private NodeFactory xnf;
	private AltSynthesizer syn;
	private Synthesizer synth;
    private Job job;
    public static  For_c forToSearch;
    public static For_c forFound ;
    
	private static Position PCG = Position.COMPILER_GENERATED;

	public getProfiledAsyncBody(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.job = job;
		this.ts = ts;
		this.xnf = xnf;
	
		forFound = null;
		
	}
	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
		if(n instanceof For_c){
			if( n.position().equals(forToSearch.position())){
				forFound =( For_c)n;
			}
		}
		return n;
	}

}
/*
 * @author : inDu
 * This class checks if a given variable is getting redefined any where in  the specified program.
 * It is used to check if the loop bound is a constatnt or not.
 * A loop bound is constant if all the variables in its cost Function is constant throughout its execution path.
 * 
 */
 class constantLoopBoundChecker extends ContextVisitor {

	
	private final TypeSystem ts;
	NodeFactory xnf;
	private AltSynthesizer syn;
	private Synthesizer synth;
	
	private static Position PCG = Position.COMPILER_GENERATED;
	private Job job;
	private static Name varUseToCheck;
	public static boolean isRedefined;
	public static int countRedefined;
	
	
	public static Expr redefinedVarToReplace;
	public static Local_c redefinedVarToBeReplaced;
	public constantLoopBoundChecker(Job job, TypeSystem ts, NodeFactory xnf,Name varUseToCheck) {
		super(job, ts, xnf);
		this.job = job;
		this.ts = ts;
		this.xnf = xnf;
		isRedefined=false;
		countRedefined = 0;
		
		this.varUseToCheck=varUseToCheck;
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);
		

	}
  
	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
		if(n instanceof FieldAssign_c){
			FieldAssign_c fa = ((FieldAssign_c)n);
			if( fa.left() instanceof FieldAssign_c && ((FieldAssign_c)fa.left()).name().toString().equals(varUseToCheck.toString()) )
			{
				////System.out.println(" this var is redifined "+((FieldAssign_c)fa.left()).name());
				isRedefined=true;
				countRedefined++;
			}
			else if( fa instanceof X10FieldAssign_c &&  ((X10FieldAssign_c)fa).fieldInstance().name().toString().equals(varUseToCheck.toString()) )
			{
				////System.out.println(" this var is redifined "+(fa.fieldInstance()).name());
				isRedefined=true;
				countRedefined++;
			}
		}
		/**
		 * case 2 : there is a function call which modifies the variables under consideration.
		 * here we assume that the functions that modify the varibles are
		 *  1) clear
		 *  2) add
		 *  3) remove
		 *  4) operator()= (in the case of a array writing)
		 * these function are considered by analysing the benchmark under consideration.
		 * If the function is of any of the above form, then check the receiver of the function
		 */
		else if(n instanceof X10Call_c){
			if( ((X10Call_c)n).name().toString().contains("clear") || ((X10Call_c)n).name().toString().contains("add") ||((X10Call_c)n).name().toString().contains("operator()=")
					|| ((X10Call_c)n).name().toString().contains("remove")){
				//case 1 the receiver is a Local variable
				if( ((X10Call_c)n).target() instanceof Local_c )
				{				
				Name nm = ((Local_c)((X10Call_c)n).target()).name().id();
				if(nm.toString().equals(varUseToCheck.toString())){
					////System.out.println(" this var is redifined "+nm);
					isRedefined=true;
					countRedefined++;
				}
				} 
				//case 2 the receiver is a field reference
				else if( ((X10Call_c)n).target() instanceof Field_c )
				{				
				Name nm = ((Field_c)((X10Call_c)n).target()).name().id();
				if(nm.toString().equals(varUseToCheck.toString())){
					////System.out.println(" this var is redifined "+nm);
					isRedefined=true;
					countRedefined++;
				}
				} 
				
			}
		}
		else if(n instanceof StmtExpr_c && ((StmtExpr_c)n).result() instanceof X10Call_c ){
			StmtExpr_c e = ((StmtExpr_c)n);
			if ( ((X10Call_c)e.result()).name().toString().contains("operator()=")){
				Stmt firstStmt = e.statements().get(0);
				if(firstStmt instanceof X10LocalDecl_c){
					Expr var =((LocalDecl_c)firstStmt).init();
					if(var instanceof X10Local_c && ((X10Local_c)var).name().toString().equals(varUseToCheck.toString())){
						
						////System.out.println(" this var is redifined "+((X10Local_c)var).name().id());
						isRedefined=true;
						countRedefined++;
					}
					else if(var instanceof X10Field_c && ((X10Field_c)var).name().toString().equals(varUseToCheck.toString()) ){
						////System.out.println(" this var is redifined "+((X10Field_c)var).name());
						isRedefined=true;
						countRedefined++;
					}
				}
				////System.out.print("");
				
			}
			
		}
		
		
		else if(n instanceof LocalAssign_c){
			LocalAssign_c la = ((LocalAssign_c)n);
			if( la.left() instanceof Local_c && ((Local_c)la.left()).name().toString().equals(varUseToCheck.toString()) )
			{
				////System.out.println(" this var is redifined "+((Local_c)la.left()).name());
				isRedefined=true;
				countRedefined++;
			}
			
		}
		if(n instanceof LocalDecl_c){
			LocalDecl_c ld = ((LocalDecl_c)n);
			if(ld.name().toString().equals(varUseToCheck.toString())){
				////System.out.println(" this var is redifined "+varUseToCheck);
				isRedefined = true;
				countRedefined++;
				
				Expr init = ld.init();
				/**
				 * The redefined variable if is using a class varible in any of the following form
				 *  1) array access.
				 *  2)filed access.
				 *  If it is using class variable then replace the local variable with class variable
				 *  Currently only array access is handeled.
				 */
				//case 1 array access
				if(init instanceof StmtExpr_c && ((StmtExpr_c)init).result() instanceof X10Call_c
						&& ((X10Call_c)((StmtExpr_c)init).result()).name().toString().equals("operator()")){
					Stmt firstStmt = ((StmtExpr_c)init).statements().get(0);
					
					if(firstStmt instanceof LocalDecl_c){
						if( ((LocalDecl_c)firstStmt).init().toString().startsWith("this") ){
							////System.out.println("class variable oK to use");
							isRedefined=false;
							countRedefined++;
							redefinedVarToReplace=init;
							redefinedVarToBeReplaced=(Local_c)syn.createLocal(PCG,ld.localDef().asInstance());
						}
					}
					
				}
			}

		}
		return n;
	}

}
