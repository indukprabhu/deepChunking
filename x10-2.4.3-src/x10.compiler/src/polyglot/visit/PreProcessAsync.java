package polyglot.visit;
import java.io.File;
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
import polyglot.ast.Stmt;
import polyglot.ast.TypeNode;
import polyglot.frontend.Compiler;
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
import x10.ast.AnnotationNode;
import x10.ast.Async;
import x10.ast.Async_c;
import x10.ast.Finish;
import x10.ast.Finish_c;
import x10.ast.X10Call_c;
import x10.ast.X10MethodDecl_c;
import x10.ast.X10New;
import x10.ast.X10New_c;
import x10.extension.X10Del;
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
/*
 * @author Indu
 * @depriciated.
 * 
 * 
 */
public class PreProcessAsync extends ContextVisitor {

	private final TypeSystem ts;
	NodeFactory xnf;
	private AltSynthesizer syn;
	private Synthesizer synth;
	public static For_c parForNode;
	public static Async_c asyncNode;
	public static Finish finishNode;
	public static Block_c finalNode;
	private static Position PCG = Position.COMPILER_GENERATED;
	private Job job;

	public PreProcessAsync(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.job = job;
		this.ts = ts;
		this.xnf = xnf;

		this.parForNode = null;
		this.asyncNode = null;
		this.finishNode = null;
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);

	}
	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
		
		
		if(n instanceof Async_c){
			
			/*Stmt asyncBody = ((Async_c)n).body();
			if(asyncBody instanceof Block_c){
				Block_c asyncBlock=((Block_c)asyncBody).toString();
				Block_c asynBlock_copy = 
				List asyncBodyStmts = new ArrayList<Stmt>();
				asyncBodyStmts.add(asyncBlock);
				
			}*/
		}
		
		
		return n;
	}
	
	
	
	
}
