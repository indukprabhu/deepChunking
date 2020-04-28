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
import polyglot.ast.Eval_c;
import polyglot.ast.Expr;
import polyglot.ast.For_c;
import polyglot.ast.If;
import polyglot.ast.If_c;
import polyglot.ast.Local;
import polyglot.ast.LocalDecl;
import polyglot.ast.LocalDecl_c;
import polyglot.ast.Local_c;
import polyglot.ast.Node;
import polyglot.ast.NodeFactory;
import polyglot.ast.Node_c;
import polyglot.ast.Stmt;
import polyglot.frontend.Job;
import polyglot.types.Flags;
import polyglot.types.Name;
import polyglot.types.SemanticException;
import polyglot.types.TypeSystem;
import polyglot.types.Types;
import polyglot.util.InternalCompilerError;
import polyglot.util.Position;
import x10.ast.Async;
import x10.ast.Async_c;
import x10.ast.Finish_c;
import x10.ast.X10Binary_c;
import x10.ast.X10Call_c;
import x10.types.MethodInstance;
import x10.util.AltSynthesizer;
import x10.util.Synthesizer;


public class BasicBlockBuilder extends ContextVisitor {

	private final TypeSystem ts;
	NodeFactory xnf;
	private AltSynthesizer syn;
	private Synthesizer synth;
	private int unitCost;
	
	private ArrayList<basicblock> listBBlock;
	private basicblock currentBlock;
	private int id;
	private boolean flagToOverride;

	private static Position PCG = Position.COMPILER_GENERATED;

	public BasicBlockBuilder(Job job, TypeSystem ts, NodeFactory xnf, ArrayList<basicblock> listBBlock) {
		super(job, ts, xnf);
		this.ts = ts;
		this.xnf = xnf;
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);
		unitCost = 10;
		id =0;
		flagToOverride=false;
		currentBlock = new basicblock(id); // first basic block with id 1.contains a empty list of stmts.
		this.listBBlock = listBBlock;
	}
	
	public Node override(Node n) {
		
		if( flagToOverride )
			return n;
		else
			return null;
		

		
	}

	
	protected NodeVisitor enterCall(Node parent, Node n) {
		  
		if(n instanceof For_c || n instanceof If_c){
			if(currentBlock.blockMembers.size()!=0){
				basicblock newBasicblock = new basicblock(listBBlock.size());
				for(Stmt st:currentBlock.blockMembers){
					newBasicblock.blockMembers.add(st);
				}
				listBBlock.add(newBasicblock);
				currentBlock.blockMembers.clear();// rest of the stmts in a new basic block
			}
		}
				
		
			
		else if(n instanceof Stmt ){
			if( !(n  instanceof If_c) && !(n instanceof For_c) && !(n instanceof Block_c) && !(n instanceof Async_c)&& !(n instanceof Finish_c) ){
				flagToOverride=true;
			}
		}
		
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {

		if (n instanceof For_c) {
			
		} else if (n instanceof Async_c) {
			//not handled currently. the async and all other stmts are kept in the same basic block.
		} else if (n instanceof If_c) {
			
		} else if (n instanceof Finish_c) {
			//not handled currently. the async and all other stmts are kept in the same basic block.
		} else if (n instanceof Block_c) {
			
			basicblock newBasicblock = new basicblock(listBBlock.size());
			for(Stmt st:currentBlock.blockMembers){
				newBasicblock.blockMembers.add(st);
			}
			listBBlock.add(newBasicblock);
			currentBlock.blockMembers.clear();// rest of the stmts in a new basic block
			
		}
		/*else if (n instanceof Eval_c) {
			//no difference. just dont add this statement to any basic block.
		}*/ else if (n instanceof Stmt) {
				if(!(parent instanceof For_c)){
					
					currentBlock.blockMembers.add((Stmt)n);
				}
				flagToOverride=false;
		}
		return n;
	}
	
}


/**
 * 
 * @author induk
 * a basic block of a CFG, contains arrayList of Stmts.
 * TODO : to finish the CFG, a pointer in each basic block pointing to the nest basic block.
 * 			ie succ relationship.
 *
 */
class basicblock{
	
	int blockId=0;
	ArrayList<Stmt> blockMembers ;
	
	public basicblock(int id) {
		blockId=id;
		blockMembers = new ArrayList<Stmt>();
		
	}
	
}