package polyglot.visit;



import polyglot.ast.Formal;
import polyglot.ast.Formal_c;
import polyglot.ast.Local;
import polyglot.ast.LocalDecl;
import polyglot.ast.LocalDecl_c;
import polyglot.ast.Local_c;
import polyglot.ast.Node;
import polyglot.ast.NodeFactory;
import polyglot.ast.Node_c;
import polyglot.frontend.Job;
import polyglot.types.LocalDef_c;
import polyglot.types.LocalInstance_c;
import polyglot.types.Name;
import polyglot.types.SemanticException;
import polyglot.types.TypeSystem;
import polyglot.types.Types;
import polyglot.util.Position;
import x10.ast.Async_c;
import x10.ast.ForLoop_c;
import x10.ast.X10Call_c;
import x10.ast.X10MethodDecl_c;
import x10.parser.X10SemanticRules;
import x10.util.AltSynthesizer;
import x10.util.Synthesizer;
import x10.visit.ClosureCaptureVisitor;

import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class DuplicateSubtreeAndRenameLocals extends ContextVisitor{
	
	private final TypeSystem ts;
	NodeFactory xnf;

	private AltSynthesizer syn;
	private Synthesizer synth;
    private Job job;
	private static Position PCG = Position.COMPILER_GENERATED;
	private List<LocalDecl_c> locDeclList;

	public DuplicateSubtreeAndRenameLocals(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.job = job;
		this.ts = ts;
		this.xnf = xnf;
		locDeclList = new ArrayList<LocalDecl_c>();
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);

	}
	protected NodeVisitor enterCall(Node parent, Node n) {
  
		if(n instanceof LocalDecl_c){
			LocalDecl_c locDecl =  (LocalDecl_c)( Node_c)((Node_c)n).copy();
			locDecl=(LocalDecl_c) locDecl.localDef(ts.localDef(PCG, locDecl.flags().flags(),Types.ref(locDecl.type().type()),Name.make(locDecl.name().toString())));
			locDeclList.add(locDecl);
			
		}
		//in case the variable is from ForLoop_c like for(i in 0..n) there is no explicit iterator declaration.
		if(n instanceof ForLoop_c){
			
			Formal form = (Formal_c)(Node)((ForLoop_c)n).formal().copy();
			//create a dummy local decl to save in the list
			LocalDecl_c dummylocDecl =(LocalDecl_c)syn.createLocalDecl(PCG,ts.localDef(PCG, form.flags().flags(),Types.ref(form.type().type()),Name.make(form.name().toString())) );
			locDeclList.add(dummylocDecl);
		}
		return this;
	}
	
	
	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
		if(n instanceof LocalDecl_c){
			LocalDecl_c localDecl = null;
			for(LocalDecl_c l:locDeclList){
				if(l.name().toString().equals(((LocalDecl_c)n).name().toString())){
					localDecl = l;
					localDecl = (LocalDecl_c)localDecl.init(((LocalDecl_c)n).init()); // assign the newly reassigned initial expr from the subtree of n to new local decl.
					
					
				}
			}
			return localDecl;
		}
		
		else if(n instanceof Local_c ){
			Local_c newN= (Local_c)n.copy();
			for(LocalDecl_c l:locDeclList){
				if(((Local_c)n).name().toString().equals(l.name().toString())){
					////System.out.println("Found local usage");
					newN = (Local_c)((Local_c)n).localInstance(l.localDef().asInstance());
				}
			}
			
		
		return newN;
		}
		if(n instanceof Formal_c){
			Formal_c newN= (Formal_c)n.copy();
			for(LocalDecl_c l:locDeclList){
				if(((Formal_c)n).name().toString().equals(l.name().toString())){
					//System.out.println("Found local usage");
					//newN = (Local_c)((Local_c)n).localInstance(l.localDef().asInstance());
					newN =  (Formal_c)newN.localDef(l.localDef());
				}
			}
			return newN;
		}
		else if(n instanceof Node_c){
			
			
			Node_c newN =  ( Node_c)((Node_c)n).copy();
			return newN;
		
		}
		
		
		return n;
	}


}
