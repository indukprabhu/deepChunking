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
import polyglot.types.Flags;
import polyglot.types.LocalDef;
import polyglot.types.MethodDef;
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
import x10.ast.Finish;
import x10.ast.Finish_c;
import x10.ast.StmtExpr;
import x10.ast.StmtExpr_c;
import x10.ast.X10Binary_c;
import x10.ast.X10Call;
import x10.ast.X10Call_c;
import x10.ast.X10ClassDecl;
import x10.ast.X10Field_c;
import x10.ast.X10MethodDecl_c;
import x10.ast.X10New;
import x10.ast.X10New_c;
import x10.extension.X10Del;
import x10.types.AsyncDef;
import x10.types.MethodInstance;
import x10.types.MethodInstance_c;
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
 * create a table of functions in the input and store its node.
 * We assume that there is no function overloading and check for unique function names to identify the functions.
 */

public class FunctionTable extends ContextVisitor {

	private final TypeSystem ts;
	NodeFactory xnf;

	private AltSynthesizer syn;
	private Synthesizer synth;
	private Job job;
	public static List<functionTableElement> funTable = new ArrayList<functionTableElement>();
	private static Position PCG = Position.COMPILER_GENERATED;

	

	public FunctionTable(Job job, TypeSystem ts, NodeFactory xnf) {
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
		/*if(n instanceof ClassDecl_c){
			List<MethodDef> methods = ((ClassDecl_c)n).classDef().methods();
			for(MethodDef mi :  methods){
				functionTableElement	funElement = new functionTableElement(mi.name().toString(), mi, ((ClassDecl_c) n).name().toString());
				funTable.add(funElement);
			}
			
			
		}*/
		if(n instanceof MethodDecl_c){
			
				MethodDecl mi = ((MethodDecl)n);
				functionTableElement	funElement = new functionTableElement(mi.name().toString(), mi, context.currentClassDef().name().toString());
				funTable.add(funElement);
			
		}
		
		return n;
	}
	
}

class functionTableElement{
	
	public String funName;
	public MethodDecl funNode ;
	public String className;
	
	public functionTableElement(String funName, MethodDecl mi, String className) {
		// TODO Auto-generated constructor stub
		this.funName =funName;
		this.funNode = mi;
		this.className =className;
	
	}
	
}
	
