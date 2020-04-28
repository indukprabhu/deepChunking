package polyglot.visit;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import polyglot.ast.MethodDecl;
import polyglot.ast.Node;
import polyglot.ast.NodeFactory;
import polyglot.frontend.Job;
import polyglot.types.SemanticException;
import polyglot.types.TypeSystem;
import polyglot.util.Position;
import sun.security.krb5.Config;
import x10.X10CompilerOptions;
import x10.config.Configuration;

class PostChunking extends ContextVisitor {

	private final TypeSystem ts;
	NodeFactory xnf;

	public static List<MethodDecl> funAfterVisit;
	private static Position PCG = Position.COMPILER_GENERATED;

	

	public PostChunking(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.job = job;
		this.ts = ts;
		this.xnf = xnf;
		if(((X10CompilerOptions)job.extensionInfo().getOptions()).x10_config.CHUNK_ATOMIC == true ||
				((X10CompilerOptions)job.extensionInfo().getOptions()).x10_config.CHUNK_ATOMIC_PROFILE == true	)
		funAfterVisit = ChunkAtomicProfileInstrumentation.funAfterVisit;
		else if(((X10CompilerOptions)job.extensionInfo().getOptions()).x10_config.CHUNK_CUSTOM == true ||
				((X10CompilerOptions)job.extensionInfo().getOptions()).x10_config.CHUNK_PROFILE == true	)
			funAfterVisit = ChunkProfileInstrumentation.funAfterVisit;
		else if(((X10CompilerOptions)job.extensionInfo().getOptions()).x10_config.CHUNK_HISTORY == true ||
				((X10CompilerOptions)job.extensionInfo().getOptions()).x10_config.CHUNK_HISTORY_PROFILE == true	)
			funAfterVisit = HistoryLoopProfileInstrumentation.funAfterVisit;
	}

	
	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
		if (n instanceof polyglot.ast.ClassDecl && ( ((X10CompilerOptions)job.extensionInfo().getOptions()).x10_config.CHUNK_ATOMIC_PROFILE == true ||  
				((X10CompilerOptions)job.extensionInfo().getOptions()).x10_config.CHUNK_PROFILE == true )) {
			/*if (((polyglot.ast.ClassDecl) n).name().toString()
					.equals("vertexColoring") ||((polyglot.ast.ClassDecl) n).name().toString()
					.equals("simpleLoop") || ((polyglot.ast.ClassDecl) n).name().toString()
					.equals("WorkDivider") || ((polyglot.ast.ClassDecl) n).name().toString()
					.equals("oddEven") ( ((ClassDecl)n).classDef().sourceFile().userSpecified() && !((ClassDecl)n).name().toString().contains("harness"))  ) {
				OutputStream os = System.out;
				((polyglot.ast.ClassDecl_c) n).prettyPrint(os);
			}*/
			OutputStream os = System.out;
			//((polyglot.ast.ClassDecl_c) n).prettyPrint(os);
		}
		
		else if (n instanceof MethodDecl) {
			//OutputStream os = System.out;
			//((polyglot.ast.MethodDecl_c) n).prettyPrint(os);
			for (MethodDecl mi : funAfterVisit) {
				if (((MethodDecl) n).name().toString()
						.equals(mi.name().toString())) {
					return mi;
				}
			}

		}
		
		return n;
		
	}
	
}
	
