package polyglot.visit;

/*
 *  This file is part of the X10 project (http://x10-lang.org).
 *
 *  This file is licensed to You under the Eclipse Public License (EPL);
 *  You may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *      http://www.opensource.org/licenses/eclipse-1.0.php
 *
 *  (C) Copyright IBM Corporation 2006-2014.
 */

import static x10cpp.visit.ASTQuery.annotationNamed;
import static x10cpp.visit.ASTQuery.assertNumberOfInitializers;
import static x10cpp.visit.ASTQuery.getPropertyInit;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import polyglot.ast.Assign;
import polyglot.ast.Assign.Operator;
import polyglot.ast.Binary;
import polyglot.ast.Binary_c;
import polyglot.ast.Block;
import polyglot.ast.Call;
import polyglot.ast.CanonicalTypeNode;
import polyglot.ast.Expr;
import polyglot.ast.Field;
import polyglot.ast.FlagsNode;
import polyglot.ast.For;
import polyglot.ast.ForInit;
import polyglot.ast.ForUpdate;
import polyglot.ast.For_c;
import polyglot.ast.Formal;
import polyglot.ast.Id;
import polyglot.ast.IntLit;
import polyglot.ast.Local;
import polyglot.ast.LocalDecl;
import polyglot.ast.Loop_c;
import polyglot.ast.Node;
import polyglot.ast.NodeFactory;
import polyglot.ast.Receiver;
import polyglot.ast.Stmt;
import polyglot.ast.Unary;
import polyglot.ast.VarDecl;
import polyglot.frontend.Globals;
import polyglot.frontend.Job;
import polyglot.types.ClassType;
import polyglot.types.Context;
import polyglot.types.FieldDef;
import polyglot.types.Flags;
import polyglot.types.LocalDef;
import polyglot.types.LocalInstance;
import polyglot.types.Name;
import polyglot.types.SemanticException;
import polyglot.types.Type;
import polyglot.types.TypeSystem;
import polyglot.types.Types;
import polyglot.util.InternalCompilerError;
import polyglot.util.Position;
import polyglot.util.CollectionUtil;
import x10.util.CollectionFactory;
import x10.util.Synthesizer;
import polyglot.visit.ContextVisitor;
import polyglot.visit.NodeVisitor;
import x10.ast.Async;
import x10.ast.ForLoop;
import x10.ast.OperatorNames;
import x10.ast.Tuple;
import x10.ast.X10Binary_c;
import x10.ast.X10Formal;
import x10.ast.X10Loop;
import x10.constraint.XEquals;
import x10.constraint.XFailure;
import x10.constraint.XField;
import x10.constraint.XLit;
import x10.constraint.XLocal;
import x10.constraint.XTerm;
import x10.constraint.XVar;
import x10.types.ConstrainedType;
import x10.types.MethodInstance;
import x10.types.TypeParamSubst;
import polyglot.types.TypeSystem;
import x10.types.constants.IntegralValue;
import x10.types.constraints.CConstraint;
import x10.visit.Desugarer;
import x10.visit.NodeTransformingVisitor;
import x10.visit.Reinstantiator;
import x10.visit.TypeTransformer;

public class ChunkingForLoop extends ContextVisitor {
	private static final String LOOP_UNROLL_TRANSFORMATION_NAME = "Loop Trans";
	private static final String UNROLL_ANNOTATION_NAME = "x10.compiler.Unroll";

	private class LoopParams {
		final VarDecl fLoopVar;
		final Expr fLoopDomain;
		Set<Expr> fLoopDomainValues = CollectionFactory.newHashSet();
		boolean fNumIterationsKnown;
		long fMin;
		Expr fMinSymbolic;
		long fMax;
		Expr fMaxSymbolic;
		long fStride;

		public LoopParams(VarDecl vd, Expr domain) {
			fLoopVar = vd;
			fLoopDomain = domain;
			fNumIterationsKnown = false;
		}
		public LoopParams(VarDecl vd, Expr domain, int min, int max, int stride) {
			this(vd, domain);
			fMin = min;
			fMax = max;
			fStride = stride;
			fNumIterationsKnown = true;
		}
	}

	/**
	 * The user-selected ForLoop (often the same as fNode, if the latter is a
	 * ForLoop)
	 */
	private ForLoop fLoop;
	private Async fasync;
	/**
	 * the user-supplied number of times to unroll the loop
	 */
	private long fUnrollFactor;

	/**
	 * records symbolic and constant information about the loop iteration domain
	 */
	private LoopParams fLoopParams;

	private final TypeSystem xts;

	private final NodeFactory xnf;

	private final Job xjob;

	public ChunkingForLoop(Job job, TypeSystem ts, NodeFactory nf) {
		super(job, ts, nf);
		xjob = job;
		xts = (TypeSystem) ts;
		xnf = (NodeFactory) nf;
	}

	protected Node leaveCall(Node old, Node n, NodeVisitor v)
			throws SemanticException {
 
		if (n instanceof polyglot.ast.ClassDecl) {
			if (((polyglot.ast.ClassDecl) n).name().toString()
					.equals("simpleLoop")) {
				//OutputStream os = System.out;
				//((polyglot.ast.ClassDecl_c) n).prettyPrint(os);
			}
			return n;
		} else if (n instanceof ForLoop) {
			{ 
		    //return transformForLoop((ForLoop) n);
				return super.leaveCall(old, n, v);
			}
		}

		else if (n instanceof Async) {
			System.out.println("async present");
			//return transformAsync((Async) n);
			
			return super.leaveCall(old, n, v);
			
		} else
			return super.leaveCall(old, n, v);

	}

	/*
	 * private class TransformAsyncInsideForLoop extends ContextVisitor{
	 * 
	 * private final TypeSystem asyncXts; private final NodeFactory asyncXnf;
	 * 
	 * 
	 * private TransformAsyncInsideForLoop(Job job, TypeSystem ts, NodeFactory
	 * nf) {
	 * 
	 * super(job, ts, nf); asyncXts = (TypeSystem) ts; asyncXnf = (NodeFactory)
	 * nf; System.out.println(" ********* here ************"); }
	 * 
	 * 
	 * 
	 * protected Node leaveCall(Node old, Node n, NodeVisitor v) throws
	 * SemanticException { System.out.println(" ********* inside ************");
	 * if(n instanceof Async) {
	 * System.out.println(" ********* async inside for found ************"); }
	 * 
	 * return super.leaveCall(old, n, v);
	 * 
	 * 
	 * }
	 * 
	 * }
	 */

	
	/*  protected NodeVisitor enterCall(Node parent, Node n) throws
	  SemanticException { // System.out.println(" enter ");
	  
	  if(n instanceof ForLoop) { System.out.println(" entering for loop");
	 
	   fLoop= (ForLoop)n;
	  
	 
	  }
	  return super.enterCall(parent, n);
	 
	}*/
	 

	public String getName() {
		return LOOP_UNROLL_TRANSFORMATION_NAME;
	}

	public void warn(String message) {
		System.err.println(getName() + ": " + message);
		// TODO: put a WARNING on the compiler's error queue
	}

	public boolean fatalStatus(String message) {
		warn(message);
		return false;
	}

	public boolean okStatus() {
		return true;
	}

	private Type getAnnotation(Node o, String name) {
		try {
			return annotationNamed(xts, o, name);
		} catch (SemanticException e) {
		}
		return null;
	}

	private boolean extractUnrollFactor() {
		Type at = getAnnotation(fLoop, UNROLL_ANNOTATION_NAME);
		if (at == null)
			return false;
		assertNumberOfInitializers(at, 1);
		Object val = getPropertyInit(at, 0);
		assert (val instanceof Long);
		fUnrollFactor = ((Long) val).longValue();
		return okStatus();
	}

	public boolean checkPreconditions(ForLoop fLoop) {
		this.fLoop = fLoop;
		return checkInitialConditions();
	}

	public boolean checkInitialConditions() {
		boolean status = extractUnrollFactor();
		//if (!status)
			//return false;
		return true;
	}

	private static Position PCG = Position.COMPILER_GENERATED;

	private Stmt transformForLoop(ForLoop fLoop) {
		// this.fLoop=fLoop;
		if (!checkPreconditions(fLoop))
			return fLoop;
		System.out.println("conditions check done");
		// System.out.println(fLoop.body().getClass().getName());
		/*
		 * if(fLoop.body() instanceof Async) {
		 * System.out.println("body contains async");
		 * 
		 * }
		 */

		/*
		 * List<Stmt> newLoopBodyStmts= new ArrayList<Stmt>(2);
		 * newLoopBodyStmts.add(fLoop.body());
		 * newLoopBodyStmts.add(fLoop.body());
		 * 
		 * 
		 * 
		 * 
		 * Block newLoopBody= xnf.Block(PCG, newLoopBodyStmts);
		 * 
		 * 
		 * 
		 * X10Loop newLoop1=xnf.ForLoop(PCG,
		 * fLoop.formal(),fLoop.domain(),newLoopBody);
		 * 
		 * newLoopBody= xnf.Block(PCG,newLoop1 ); X10Loop
		 * newLoop2=xnf.ForLoop(PCG, fLoop.formal(),fLoop.domain(),newLoopBody);
		 * newLoopBody= xnf.Block(PCG,newLoop2 );
		 */
 
		
		System.out.println("returning ");
		return fLoop;

	}

	private IntLit longLit(long i) {
		return (IntLit) xnf.IntLit(PCG, IntLit.LONG, i).type(xts.Long());
	}

	private IntLit intLit(long i) {
		return (IntLit) xnf.IntLit(PCG, IntLit.INT, i).type(xts.Int());
	}

	private IntLit lit(long i, Type t) {
		return t.isIntOrLess() ? intLit(i) : longLit(i);
	}

	private Id id(String name) {
		return xnf.Id(PCG, name);
	}

	private Name makeFreshInContext(String prefix) {
		Context ctx = context();
		Name name = Name.make(prefix);
		if (ctx.findVariableSilent(name) != null)
			return Name.makeFresh(prefix);
		return name;
	}


    private FlagsNode noFlags() {
        return xnf.FlagsNode(PCG, Flags.NONE);
    }

    private Id id(Name name) {
        return xnf.Id(PCG, name);
    }
	 private LocalDecl localDecl(Name name, CanonicalTypeNode dTypeNode, Expr init) {
	        LocalDef def= xts.localDef(PCG, Flags.NONE, Types.ref(dTypeNode.type()), name);
	        return xnf.LocalDecl(PCG, noFlags(), dTypeNode, id(name), init).localDef(def);
	    }

	 private CanonicalTypeNode makeTypeNode(Type t) {
	        return xnf.CanonicalTypeNode(PCG, t);
	    }
	private Stmt transformAsync(Async asyncstmt) {
		System.out.println("Inside transform async");
		Stmt asyncBody = asyncstmt.body();
		// has to make the new name in context 
		Name loopVarName = makeFreshInContext("ii");
		ArrayList<LocalDecl> inits = new ArrayList<LocalDecl>();
		// falgs type and name should not be null or else assertion error will
		// be thrown
				
		LocalDecl localVar= localDecl(loopVarName, xnf.CanonicalTypeNode(PCG, xts.Int()), (Expr)intLit(0));
		inits.add(localVar);

		// Expr initialAssign= xnf.LocalAssign(PCG, (Local)localVar,
		// Operator.ASSIGN,(Expr)longLit(0) );

		// Binary addExpr= xnf.Binary(PCG,xnf.Local(PCG,
		// localVar.name()),Binary.ADD , (Expr)longLit(1));
		// Assign updateExpr= xnf.Assign(PCG,xnf.Local(PCG, localVar.name()),
		// Operator.ASSIGN ,(Expr)addExpr );
		Expr updateExpr = (Expr) xnf.Unary(PCG, Unary.PRE_INC,xnf.Local(PCG, localVar.name()));
		Stmt forUpdate = xnf.Eval(PCG, updateExpr);
    	ArrayList<Stmt> iters = new ArrayList<Stmt>();
		iters.add(forUpdate);

		Binary condExpr = xnf.Binary(PCG, xnf.Local(PCG, localVar.name()),Binary.LE, (Expr) intLit(5));
		For newLoop = xnf.For(PCG, (List) inits, (Expr) condExpr, (List) iters,xnf.Empty(PCG));
		 Context ctx=context();
		 newLoop.addDecls(ctx);
		// how to change the context of new Async or for loop
		Stmt newAsyncBody = xnf.Block(PCG, newLoop);
		asyncstmt =  asyncstmt.body(newAsyncBody);
		System.out.println("Created new async");
		OutputStream os = System.out;
		//asyncstmt.prettyPrint(os);
		System.out.println("out of trans");
		asyncstmt.addDecls(ctx);
		return asyncstmt;
	}

}
