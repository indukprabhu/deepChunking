package polyglot.visit;

import polyglot.ast.ClassDecl_c;
import polyglot.ast.Local;
import polyglot.ast.LocalDecl;
import polyglot.ast.LocalDecl_c;
import polyglot.ast.Local_c;
import polyglot.ast.Node;
import polyglot.ast.NodeFactory;
import polyglot.frontend.Job;
import polyglot.types.SemanticException;
import polyglot.types.TypeSystem;
import polyglot.util.Position;
import x10.ast.Async_c;
import x10.ast.X10MethodDecl_c;
import x10.types.AsyncDef;
import x10.util.AltSynthesizer;
import x10.util.Synthesizer;
import x10.visit.ClosureCaptureVisitor;

import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

public class customChunkClosureCapture extends ContextVisitor{
	
	private final TypeSystem ts;
	NodeFactory xnf;

	private AltSynthesizer syn;
	private Synthesizer synth;
    private Job job;
	private static Position PCG = Position.COMPILER_GENERATED;
	private X10MethodDecl_c mdec;

	public customChunkClosureCapture(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.job = job;
		this.ts = ts;
		this.xnf = xnf;
		
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);

	}
	protected NodeVisitor enterCall(Node parent, Node n) {
  
		if(n instanceof X10MethodDecl_c){
			
			mdec = ((X10MethodDecl_c)n);
		}
		
		return this;
	}
	
	
	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
		
		
		if(n instanceof ClassDecl_c){
		OutputStream os = System.out;
		((polyglot.ast.ClassDecl_c) n).prettyPrint(os);
		}
		if(n instanceof Async_c){
			/*////System.out.println(mdec);
			mdec.body().visit(new ClosureCaptureVisitor(this.context(), ((Async_c)n).asyncDef()));
			////System.out.println(((Async_c)n).asyncDef().toString());*/
			
			AsyncDef asynDef = ((Async_c)n).asyncDef();
			n.visit(new ClosureCaptureVisitor(this.context(), ((Async_c)n).asyncDef()));
			return n;
		}
		
		
		return n;
	}


}
 
