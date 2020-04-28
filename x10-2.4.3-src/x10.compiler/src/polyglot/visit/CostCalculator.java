package polyglot.visit;

import java.io.OutputStream;
import java.util.List;

import javax.naming.LimitExceededException;

import polyglot.ast.Binary;
import polyglot.ast.Block;
import polyglot.ast.Block_c;
import polyglot.ast.Call;
import polyglot.ast.Eval_c;
import polyglot.ast.Expr;
import polyglot.ast.For_c;
import polyglot.ast.If_c;
import polyglot.ast.LocalDecl_c;
import polyglot.ast.Local_c;
import polyglot.ast.Node;
import polyglot.ast.NodeFactory;
import polyglot.ast.Node_c;
import polyglot.ast.Stmt;
import polyglot.frontend.Job;
import polyglot.types.SemanticException;
import polyglot.types.TypeSystem;
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

/*
 * @author.
 * depreciated: use cost function generator instead.
 * TODO : pre-processing. all statements are properly blocked.
 * TODO : restructuring for loop.
 * 
 * 
 */
public class CostCalculator extends ContextVisitor {

	private final TypeSystem ts;
	NodeFactory xnf;
	private AltSynthesizer syn;
	private Synthesizer synth;
	private int unitCost;
	// private Expr costFunction;

	private static Position PCG = Position.COMPILER_GENERATED;

	public CostCalculator(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.ts = ts;
		this.xnf = xnf;
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);
		unitCost = 10;
		// costFunction= syn.createLongLit(1);

	}
	/*
	 * @author Indu
	 * 
	 * overriding the traversal of nodes under LocalDecl.As we are measuring statements.
	 */
	@Override
	public Node override(Node parent, Node n) {
		// TODO Auto-generated method stub
		if(n instanceof For_c || n instanceof If_c || n instanceof Async_c || n instanceof Finish_c ||
				n instanceof Block_c || n instanceof Eval_c)
			return null;
		else {
			return n;
		}
		

		
	}

	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {

		if (n instanceof For_c) { // retrun a stmt equals to its cost

			//System.out.println(context.currentCode());
			Stmt forBody = ((For_c) n).body();
			Expr costLoopBody = syn.createLongLit(unitCost);// default cost =
															// 5*unit cost
			Expr costFunction = syn.createLongLit(3 * unitCost); // deafult cost
																	// of whole
																	// loop
			if (forBody instanceof Eval_c) {
				costLoopBody = ((Eval_c) forBody).expr();
			}
			
			AstHelper astHelp =new AstHelper(job, ts, xnf);
			Expr loopBound = astHelp.extractLoopBound((For_c) n);

			costFunction = syn.createBinary(PCG, loopBound, Binary.MUL,
					costLoopBody, this);
			/*
			 * //System.out.println("costFunction in for loop"); OutputStream os1
			 * = System.out; costFunction.prettyPrint(os1);
			 * //System.out.println("costFunction in for loop");
			 */

			Stmt costFunctionStmt = syn.createEval(costFunction);
			return costFunctionStmt;

		} else if (n instanceof Async_c) {

			//System.out.println("Async not needed ");
			Stmt bodyAsync = ((Async_c) n).body();
			Expr costFunction = syn.createLongLit(10 * unitCost);
			if (bodyAsync instanceof Eval_c) {
				costFunction = ((Eval_c) bodyAsync).expr();

			}
			Stmt costFunctionStmt = syn.createEval(costFunction);
			return costFunctionStmt;
		} else if (n instanceof If_c) { // TODO the cost of checking the if
										// condition also
			Expr costFunction = syn.createLongLit((2 * unitCost));// default
																	// cost
			Expr thenCost = syn.createLongLit(unitCost); // default cost =
															// unitCost
			Expr elseCost = syn.createLongLit(0); // default cost = 0;

			Stmt thenStmt = ((If_c) n).consequent();
			if (thenStmt instanceof Eval_c) {
				thenCost = ((Eval_c) thenStmt).expr();

			}

			Stmt elseStmt = ((If_c) n).alternative();
			if (elseStmt instanceof Eval_c) {
				elseCost = ((Eval_c) elseStmt).expr();

			}
			/*
			 * Stmt costFunctionStmt = syn.createIf(PCG ,((If_c) n).cond(),
			 * syn.createEval(thenCost),syn.createEval(elseCost)); OutputStream
			 * os1 = System.out; costFunctionStmt.prettyPrint(os1);
			 */

			costFunction = xnf.Conditional(PCG, ((If_c) n).cond(), thenCost,
					elseCost).type(thenCost.type());
			Stmt costFunctionStmt = syn.createEval(costFunction);

			return costFunctionStmt;

		} else if (n instanceof Finish_c) {
			return n; // TODO check if it is correct; have to calculate cost of
						// async.

		} else if (n instanceof Block_c) {
			List<Stmt> bodyBlock = ((Block_c) n).statements();
			Expr costFunction = syn.createLongLit(0); // default value of cost
			for (Stmt s : bodyBlock) {
				if (s instanceof Eval_c) // extract the cost expression from
											// stmts in block and add them
											// together.
				{
					Expr costFunctionMember = ((Eval_c) s).expr();
					costFunction = syn.createBinary(PCG, costFunction,
							Binary.ADD, costFunctionMember, this);

				}
			}
			Stmt costFunctionStmt = syn.createEval(costFunction);
			return costFunctionStmt;

		} else {

			if (n instanceof Stmt) {
				Expr costFunction = syn.createLongLit(unitCost);
				Stmt costFunctionStmt = syn.createEval(costFunction);
				return costFunctionStmt;
			}
			return n;
		}

	}

	
}
