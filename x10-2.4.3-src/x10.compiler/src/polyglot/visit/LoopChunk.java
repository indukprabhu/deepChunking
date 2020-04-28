package polyglot.visit;

import polyglot.frontend.Job;
import polyglot.frontend.Scheduler;
import polyglot.ast.*;
import polyglot.ast.Assign.Operator;
import polyglot.types.ClassDef.Kind;
import polyglot.types.ClassType;
import polyglot.types.Flags;
import polyglot.types.LocalDef;
import polyglot.types.Name;
import polyglot.types.Type;
import polyglot.types.TypeSystem;
import polyglot.util.*;
import x10.ast.*;
import x10.util.AltSynthesizer;
import x10.util.Synthesizer;
import x10.util.synthesizer.ClassSynth;
import x10.util.synthesizer.SwitchSynth;
import polyglot.types.SemanticException;
import sun.font.CreatedFontTracker;
import x10.visit.ClosureCaptureVisitor;

import java.beans.Statement;
import java.io.OutputStream;
import java.util.*;

import x10.types.*;

/**
 * 
 * @author suyash
 * 
 *         chunking of parallel for-loop
 * 
 *         takes place in 3 phases.each phase goes through one enter and leave
 *         call pahse 0 : it stores all the info regarding phase 1 : transforms
 *         the finsh-for-async-loop and chunks it. phase 2 : captures the scope
 *         and environment of the newly made changes. the structure of the par
 *         for loop. for loop in the form of For_c will only work.
 * @author indu input to chunk is a finish-async program P with no barrier.
 */

public class LoopChunk extends ContextVisitor // NodeVisitor
{
	private final TypeSystem ts;
	NodeFactory xnf;
	static MethodDecl mdec;

	static String phase = "start";
	static Name gName = null;
	static Local gLocal = null;
	static Stmt gStmt = null;
	static boolean setLocal = false;
	static boolean aChange = false; // To alert async body has been modified
	static For_c tempFor;
	// static Async_c tempAsync, oldAsync;
	static Finish_c tempFin;

	private AltSynthesizer syn;
	private Synthesizer synth;
	private ClassSynth synCl;

	//private Node costFunction;
	private static Position PCG = Position.COMPILER_GENERATED;

	static ArrayList<ForInfo> forHolder = new ArrayList<ForInfo>();

	static ClassDecl currentClass;

	public LoopChunk(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.ts = ts;
		this.xnf = xnf;
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);
		//costFunction = xnf.Empty(PCG);
		// tempAsync = null;
	}

	protected NodeVisitor enterCall(Node parent, Node n) {

		if (phase.equals("preProcessing")) {
			if (n instanceof ClassDecl) {
				System.out.println("innermost class found");
				currentClass = (ClassDecl) n;

			}

		}

		if (phase.equals("record")) { // pahse 0 : it stores all the info
										// regarding the
			// structure of the par for loop.

			if (n instanceof MethodDecl_c)
				mdec = (MethodDecl_c) n; // mdec stores the method declaration
											// node for future reference
			if (n instanceof Finish_c)
				tempFin = (Finish_c) n; // tempFin stores the finish node
										// immediately enclosing the for loop
										// node for future reference
			else if (n instanceof For_c) {
				if (tempFor != null) // if tempFor previously is not null then
										// it is a nested for loop. in that case
										// TempFin =null
					tempFin = null;
				tempFor = (For_c) n; // temp For : stores the inner most
										// for-loop node.
			} else if (n instanceof Async_c) {
				String mname = mdec.name().id().toString();
				if (!mname.equals("initialize")) { // TODO why check if it is an
													// initialize method
													// declaration.
					ForInfo fif = new ForInfo();
					String finPos;
					if (tempFin == null)
						finPos = "null";
					else
						finPos = tempFin.position().toString();
					if (tempFor != null) {
						Async_c asy = (Async_c) n;
						fif.setData(tempFor, asy, tempFin, asy.position()
								.toString(), tempFor.position().toString(),
								finPos); // initialize the object which stores
											// the info regarding the for
											// the for loop that encloses the
											// current async.
						forHolder.add(fif); // stores the details of all for
											// loops which contains an async
											// inside it.
					}
				}
			}
		} else if (phase.equals("transform")) {
			if (n instanceof Async_c) {
				aChange = false;
			}
		} else if (phase.equals("reComputeEnv")
				|| phase.equals("postProcessing")) {
			if (n instanceof MethodDecl_c)
				mdec = (MethodDecl_c) n;
			
		}
		return this;
	}

	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
		// System.out.println("leave call");
		if (Scheduler.passOn == 0) {

			if (parent == null) { // start from the root
				Scheduler.passOn++;

				Node modNode = n;
				phase = "preProcessing";
				modNode = visitEdgeNoOverride(null, modNode);

				/*
				 * Printing after each phase.
				 */

				System.out.println("after phase -1 ");
				OutputStream os1 = System.out;
				modNode.prettyPrint(os1);

				phase = "record"; // the record phase start after this.
				modNode = visitEdgeNoOverride(null, modNode); // calls the
																// leaveCall
																// method and
																// then
																// entercall
																// method for
																// each node of
																// the ast

				/*
				 * Printing after each phase.
				 */

				/*System.out.println("after phase 0 ");
				os1 = System.out;
				modNode.prettyPrint(os1);*/

				phase = "transform"; // phase=1
				modNode = visitEdgeNoOverride(null, modNode);
				/*
				 * Printing after each phase.
				 */

				/*System.out.println("after phase 1 ");
				os1 = System.out;
				modNode.prettyPrint(os1);*/

				phase = "reComputeEnv"; // phase=2
				modNode = visitEdgeNoOverride(null, modNode);

				/*
				 * Printing after each phase.
				 */

				/*System.out.println("after phase 2 ");
				os1 = System.out;
				modNode.prettyPrint(os1);*/

				phase = "postProcessing"; // phase=3
				/*
				 * Printing after each phase.
				 */

				System.out.println("after phase 3 ");
				os1 = System.out;
				modNode.prettyPrint(os1);

				/*
				 * try { OutputStream ost = System.out;
				 * modNode.prettyPrint(ost); ost.close(); }catch(Exception e) {}
				 */

				return modNode;
			}
		}

		

		if (phase.equals("record")) {
			// System.out.println("Pass 0");
			if (n instanceof Finish) // before leaving finish-node clearing the
										// tempfin for future values.
				tempFin = null;
			else if (n instanceof For) // before leaving for-node clearing the
										// temp-for future values.
				tempFor = null;
		} else if (phase.equals("transform")) {
			// System.out.println(n.getClass() + " leaving ----- " +
			// n.position());
			// System.out.println("Atleast leaving pass 2: ");
			if (n instanceof Async_c) {

				// TODO dont understant when the below code is executed.

				if (aChange) { // Only is async body is modified
					Async_c origAsync = (Async_c) n;
					ForInfo fdata = new ForInfo();
					ForInfo ndata = new ForInfo();
					for (int i = 0; i < forHolder.size(); i++) {
						fdata = forHolder.get(i);
						if (fdata.asyPos
								.equals(origAsync.position().toString())) {
							if (fdata.asyncNode != origAsync) {
								System.out
										.println("Modifying async entry *************");
								ndata = fdata;
								ndata.asyncNode = origAsync;
								forHolder.remove(i);
								forHolder.add(ndata); // Adding modified entry
								break;
							}
						}
					}
				}
			}

			if (n instanceof x10.ast.Finish_c) {

				System.out.println("Modifying Finish !!!");
				boolean proceed = false;

				For_c origFor = null;
				Async_c origAsync = null;
				Finish_c fin = (Finish_c) n; // Original finish
				ForInfo fdata = new ForInfo();
				for (int i = 0; i < forHolder.size(); i++) {
					fdata = forHolder.get(i); //
					if (fdata.finNode != null) {
						if (fdata.finPos.equals(fin.position().toString())) { // pick
																				// a
																				// forInfo
																				// form
																				// the
																				// holder
																				// ,
																				// which
																				// has
																				// the
																				// same
																				// enclosing
																				// finish
																				// as
																				// the
																				// current
																				// one
							proceed = true; // Found an entry for finish and
											// thus async. set proceed = true
											// for further changes of inner
											// for-loop node and async node in
											// the ast.
							origFor = fdata.forNode;
							origAsync = fdata.asyncNode;
							forHolder.remove(i);
							break;
						}
					}
				}

				if (proceed) { // if u found a for loop with an enclosing finsh
								// from the forHolder

					aChange = true; // enables the transformation of async

					System.out.println("proceed finish set achange = true");
					
					//calling the cost function calculator.
					
					/*CostCalculator calcCost = new CostCalculator(job, ts, xnf);
				    Stmt origForBody = origFor.body();
					 costFunction= calcCost.begin().visitEdgeNoOverride(null, origForBody); // calling visitor.begin will set the context as empty in the begining.
					 System.out.println("out of func");
					
					 System.out.println("costFunction ");
						OutputStream os1 = System.out;
						costFunction.prettyPrint(os1);
						System.out.println("costFunction ");
					 */
				    
					
					List<Stmt> stmts = new ArrayList<Stmt>(); // Final set of
																// statements

					// Generation of aworkers = Runtime.Nthreads();
					/*
					 * Call rc = synth.makeStaticCall(PCG, ts.Runtime(),
					 * Name.make("retNthreads"), ts.Int(), this.context()); //
					 * rc <-- Runtime.Nthreads(); LocalDecl ld =
					 * syn.createLocalDecl(PCG, Flags.FINAL,
					 * Name.makeFresh("aworkers"), ts.Int(), rc); // aworker =
					 * rc
					 */

					/*
					 * @author
					 * 
					 * creating a class "chunk".
					 */

					// ts.abstractSuperInterfaces(t)
					/*
					 * List interfaceVoid = new ArrayList<Type>();
					 * interfaceVoid.add(ts.Void()); X10ClassDef chunkDef =
					 * synth.createClassDef(ts.Void(), interfaceVoid,Flags.NONE,
					 * Kind.LOCAL, Name.make("chunk")); X10ClassDecl chunkDecl =
					 * synth.createClass(PCG, chunkDef, context);
					 * 
					 * X10ClassDecl isfullChunk = synth.addClassField(PCG,
					 * chunkDecl, Name.make("isfull"), Flags.MUTABLE,
					 * ts.Boolean());
					 * 
					 * 
					 * 
					 * synCl = new ClassSynth(job, xnf,context ,chunkDecl);
					 * //synCl.
					 */
					// As retNthreads is not available here hard-coding the
					// value as 4 now.

					IntLit nthreadLit = syn.createIntLit(4);
					LocalDecl ld = syn.createLocalDecl(PCG, Flags.FINAL,
							Name.makeFresh("nthreads"), ts.Int(), nthreadLit); // aworker
																				// =4

					// creating declaration of the local variable.
					Local aworker = syn.createLocal(PCG, ld); // creating local
																// varible
																// reference

					X10Call_c xc = (X10Call_c) origFor.cond(); // TODO why
																// needed.
					List<Expr> argu = xc.arguments();
					Expr loopbound = argu.get(0); // Extracting the loop bound
					System.out.println("loop bound " + loopbound);

					// Getting the initialization variable of the original loop
					// and its type.
					List<ForInit> iVar = origFor.inits();
					X10LocalDecl_c xld = (X10LocalDecl_c) iVar.get(0);
					Type typ = xld.type().type();

					/*
					 * IntLit oneLit = syn.createIntLit(1); // integer literal 1
					 * Expr t1 = syn.createBinary(PCG, aworker,
					 * Binary.Operator.SUB, oneLit, this); // t1 = // aworkers-1
					 * Expr t2 = syn.createBinary(PCG, numIterations,
					 * Binary.Operator.ADD, t1, this); // t2 = numIterations+t1
					 * Expr tchunkSize = syn.createBinary(PCG, t2,
					 * Binary.Operator.DIV, aworker, this); // tchunkSize = //
					 * t2/aworker
					 */LocalDecl nChunk = syn.createLocalDecl(PCG, Flags.FINAL,
							Name.makeFresh("chunkSize"), typ,
							syn.createIntLit(1)); // nchunk=1 initially

					Local chunkSize = syn.createLocal(PCG, nChunk); // create
																	// local var
																	// reference
																	// with
																	// chunkSize

					LocalDecl nIterations = syn.createLocalDecl(PCG,
							Flags.FINAL, Name.makeFresh("nIterations"), typ,
							loopbound); // nIterarions =
										// loopbound

					Local numIterations = syn.createLocal(PCG, nIterations); // created
																				// local
																				// decl
																				// and
																				// local
																				// varibles.

					Expr modCheckConditional = syn.createBinary(PCG,
							numIterations, Binary.Operator.MOD, aworker, this);
					Expr divConditional = syn.createBinary(PCG, numIterations,
							Binary.Operator.DIV, aworker, this);
					Expr divPlusOneConditional = syn.createBinary(PCG,
							divConditional, Binary.Operator.ADD,
							syn.createIntLit(1), this);

					If condChunkSize = syn.createIf(PCG, modCheckConditional,
							syn.createAssignment(PCG, chunkSize,
									Operator.ASSIGN, divConditional, this), syn
									.createAssignment(PCG, chunkSize,
											Operator.ASSIGN,
											divPlusOneConditional, this));

					// creating 2 vars chunkStart and chunkend.

					IntLit zeroLit = syn.createIntLit(0);
					LocalDecl chunkStartDecl = syn.createLocalDecl(PCG,
							Flags.NONE, Name.makeFresh("chunkStart"), typ,
							zeroLit); // chunkStart = 0
					Local chunkStartLocal = syn
							.createLocal(PCG, chunkStartDecl);

					LocalDecl chunkEndDecl = syn.createLocalDecl(PCG,
							Flags.NONE, Name.makeFresh("chunkEnd"), typ,
							loopbound); // chunkStart = n
					Local chunkEndLocal = syn.createLocal(PCG, chunkEndDecl);

					// Adding to the list of statements

					stmts.add(chunkStartDecl);
					stmts.add(chunkEndDecl);
					stmts.add(ld);
					stmts.add(nIterations);
					stmts.add(xld);
					stmts.add(nChunk);
					// stmts.add(syn.createBlock(PCG, chunkDecl));
					// Creating elements for outer For loop

					LocalDecl iiDecl = syn.createLocalDecl(PCG, Flags.NONE,
							Name.makeFresh("ii"), typ, zeroLit); // ii = 0 --
																	// Loop
																	// Initialization
					Local iiLocal = syn.createLocal(PCG, iiDecl);

					Expr outCond = syn.createBinary(PCG, iiLocal,
							Binary.Operator.LT, aworker, this); // outcond= ii <
																// aworker

					/*
					 * Expr t4 = syn.createBinary(PCG, iiLocal,
					 * Binary.Operator.ADD, chunkSize, this); // t4 = //
					 * ii+chunkSize
					 */

					Expr postIncUpdate = syn.createBinary(PCG, iiLocal,
							Binary.Operator.ADD, syn.createIntLit(1), this); // ii+1
					Expr outUpdate = syn.createAssign(PCG, iiLocal,
							Operator.ASSIGN, postIncUpdate, this); // ii = ii+1;

					// Body of outer for loop
					LocalDecl nid = syn.createLocalDecl(PCG, Flags.FINAL,
							Name.makeFresh("ni"), typ, iiLocal); // ni = ii
					Local ni = syn.createLocal(PCG, nid);

					// Creating Inner For Loop

					LocalDecl kkDecl = syn.createLocalDecl(PCG, Flags.NONE,
							Name.makeFresh("kk"), typ, chunkStartLocal); // kk =
																			// chunkStart
					Local kkLocal = syn.createLocal(PCG, kkDecl);

					Expr inCond = syn.createBinary(PCG, kkLocal,
							Binary.Operator.LT, chunkEndLocal, this); // kk <
																		// chunkEnd

					Expr postIncUpdateIn = syn.createBinary(PCG, kkLocal,
							Binary.Operator.ADD, syn.createIntLit(1), this); // kk+1
					Expr InUpdate = syn.createAssign(PCG, kkLocal,
							Operator.ASSIGN, postIncUpdateIn, this); // kk =
																		// kk+1;

					List<Stmt> outerSet = new ArrayList<Stmt>(); // Body of
																	// outer
																	// For-loop
					outerSet.add(nid);

					// add statements to inner for loop.
					// add ayncs body to inner for-loop
					Stmt forbody = origFor.body();
					Block forStmts;
					List<Stmt> stmtSet;
					List<Stmt> innerSet = new ArrayList<Stmt>();
					// TODO add i = kk;

					if (forbody instanceof Block) {
						forStmts = (Block) forbody;
						stmtSet = forStmts.statements();
						for (int i = 0; i < stmtSet.size(); i++) {
							Stmt st = stmtSet.get(i);
							if (st instanceof Async) {
								Async asy = (Async) stmtSet.get(i);
								Stmt asyncBody = asy.body();
								innerSet.add(asyncBody); // Add async body to
															// inner loop
							} else {
								if (st instanceof LocalDecl_c) {
									LocalDecl_c sld = (LocalDecl_c) st;
									innerSet.add(sld); // rest of the statements
								}
							}
						}
					} else { // Only one statement i.e. async
						Async asyncCons = (Async) forbody;
						innerSet.add(asyncCons.body());
					}

					List<Stmt> finiSet = new ArrayList<Stmt>(); // List of
																// finish
																// statements
					List<Stmt> endFor = new ArrayList<Stmt>(); // List of finish
																// statements
																// after for
					Block finBody = (Block) fin.body();
					List<Stmt> finStmts = finBody.statements();
					boolean changeSet = false;
					for (int i = 0; i < finStmts.size(); i++) {
						Stmt fst = finStmts.get(i);
						if (!(fst instanceof For)) {
							if (changeSet)
								endFor.add(fst);
							else
								finiSet.add(fst); // Adding all non for
													// statements
						} else {
							changeSet = true;
						}
					}

					Block innerblk = syn.createBlock(PCG, innerSet);
					// gName = innode.name().id();
					// gLocal = innode;
					setLocal = true;
					Block newBlock = (Block) innerblk.visit(this);
					setLocal = false;

					For innerFor = syn.createStandardFor(PCG, kkDecl, inCond,
							InUpdate, newBlock); // create inner For-loop
					AsyncDef asyncDef = (AsyncDef) AtStmt_c.createDummyAsync(
							PCG, ts, context.currentClass(), context
									.currentCode(), context.currentCode()
									.staticContext(), true);

					List<Stmt> asySet = new ArrayList<Stmt>();
					// asySet.add(kxld);

					asySet.add(innerFor);
					Block asyblock = syn.createBlock(PCG, asySet);
					Async newasync = nf.Async(PCG, new ArrayList<Expr>(),
							asyblock).asyncDef(asyncDef);
					outerSet.add(newasync); // Adding async to outer for
											// loop

					Block outerblock = syn.createBlock(PCG, outerSet);
					For outerFor = syn.createStandardFor(PCG, iiDecl, outCond,
							outUpdate, outerblock); // Generating outer For loop

					finiSet.add(outerFor);
					finiSet.addAll(endFor);
					endFor.clear();

					Block finiBody = syn.createBlock(PCG, finiSet);
					Finish fini = fin.body(finiBody); // Generating the new
														// Finish
					stmts.add(fini);
					Block result = syn.createBlock(PCG, stmts);
					return result;
				}
			} 
			
			
			
			
			
		} else if (phase.equals("reComputeEnv")) { // capturing the environment
													// and adding scope to new
													// variables.
			// System.out.println(n.getClass() + " leaving ----- " +
			// n.position());
			// System.out.println("Pass 2");
			if (n instanceof Async) {
				// System.out.println("Pass 2: Async");
				Stmt mbody = ((MethodDecl_c) mdec).body();
				Async asy = ((Async) n);
				mbody.visit(new ClosureCaptureVisitor(this.context(), asy
						.asyncDef()));
				// ((Finish_c)tempFin).body().visit(new
				// ClosureCaptureVisitor(this.context(),
				// ((Async)n).asyncDef()));
			}
			if (n instanceof AtStmt_c) {
				Stmt mbody = ((MethodDecl_c) mdec).body();
				AtStmt atm = (AtStmt) n;
				mbody.visit(new ClosureCaptureVisitor(this.context(), atm
						.atDef()));
			}
		}
		return n;
	}

	static boolean gflag = false;

}

class ForInfo { // class for storing the info regarding the for loop enclosing
				// an async node
	For_c forNode;
	String forPos;
	Async_c asyncNode;
	String asyPos;
	Finish_c finNode;
	String finPos;

	public void setData(For_c forNode, Async_c asyncNode, Finish_c finNode,
			String asyPos, String forPos, String finPos) {
		this.forNode = forNode;
		this.asyncNode = asyncNode;
		this.finNode = finNode;
		this.forPos = forPos;
		this.finPos = finPos;
		this.asyPos = asyPos;
	}
}
