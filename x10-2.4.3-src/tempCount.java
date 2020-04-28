package polyglot.visit;


import polyglot.frontend.Job;
import polyglot.frontend.Scheduler;
import polyglot.ast.*;
import polyglot.ast.Assign.Operator;
import polyglot.types.Flags;
import polyglot.types.Name;
import polyglot.types.Type;
import polyglot.types.TypeSystem;
import polyglot.util.*;
import x10.ast.*;
import x10.util.AltSynthesizer;
import x10.util.Synthesizer;
import x10.util.synthesizer.SwitchSynth;
import polyglot.types.SemanticException;
import x10.visit.ClosureCaptureVisitor;

import java.io.OutputStream;
import java.util.*;

import x10.types.*;



/**
 * 
 * @author suyash
 * 
 *         chunking of parallel for-loop
 * 
 *         takes place in 3 phases.each phase goes through one enter and leave call
 *          pahse 0 : it stores all the info regarding
 *          phase 1 : transforms the finsh-for-async-loop and chunks it. 
 *          phase 2 : captures the scope and environment of the newly made changes. 
 *         the structure of the par for loop. for loop in the form of For_c will
 *         only work.
 *         
 * @author indu
 *         input to chunk is a finish-async program P with no barrier.
 * 
 */


public class LoopChunk extends  ContextVisitor //NodeVisitor 
{
	private final TypeSystem ts;
	NodeFactory xnf;
	static MethodDecl mdec;
	
	static int phase		= 4;
	static Name gName 		= null;
	static Local gLocal		= null;
	static Stmt gStmt		= null;
	static boolean setLocal = false;
	static boolean aChange	= false;		// To alert async body has been modified
	static For_c tempFor;
	//static Async_c tempAsync, oldAsync;
	static Finish_c tempFin;

	private AltSynthesizer syn;
	private Synthesizer synth;
	private static Position PCG= Position.COMPILER_GENERATED;
	
	static ArrayList<ForInfo> forHolder	= new ArrayList<ForInfo>(); 
	
	public LoopChunk(Job job, TypeSystem ts, NodeFactory xnf) {
		super(job, ts, xnf);
		this.ts 	= ts;
		this.xnf 	= xnf;
		syn 		= new AltSynthesizer(ts, xnf);
		synth 		= new Synthesizer(xnf, ts);
		//tempAsync	= null;
	}
	
	protected NodeVisitor enterCall(Node parent, Node n) {
		//System.out.println("Entered enterCall");
		if(phase == 0) {
			//System.out.println(n + " :: " + n.getClass());
			//System.out.println("Phase 0");
			if(n instanceof MethodDecl_c) 
				mdec	=	(MethodDecl_c)n;
			if(n instanceof Finish_c)
				tempFin	=	(Finish_c)n;
			else if(n instanceof For_c) {
				if(tempFor != null)			// Nested For 
					tempFin = null;
				tempFor	=	(For_c)n;
			}
			else if(n instanceof Async_c) {
				String mname = mdec.name().id().toString();
				if(!mname.equals("initialize")) {
					ForInfo fif = new ForInfo();
					String finPos;
					if(tempFin == null) 
						finPos 	= "null";
					else
						finPos	= tempFin.position().toString();
					if(tempFor != null) {
						Async_c asy = (Async_c)n;
						fif.setData(tempFor, asy, tempFin, asy.position().toString(), 
									tempFor.position().toString(), finPos);
						forHolder.add(fif);
					} } } }
		else if(phase == 1) {
			if(n instanceof Async_c) {
				aChange = false;
			} }
		else if(phase == 2 || phase == 3) {
			if(n instanceof MethodDecl_c) 
				mdec	=	(MethodDecl_c)n;
		}
        return this;
    }
	
	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v) throws SemanticException {
		
		
		
		if (n instanceof polyglot.ast.ClassDecl) {
			if (((polyglot.ast.ClassDecl) n).name().toString()
					.equals("simpleLoop")) {
				OutputStream os = System.out;
				((polyglot.ast.ClassDecl_c) n).prettyPrint(os);
			}
		}
		
		
		
		if(Scheduler.passOn == 0) {
			if(parent == null) {
				Scheduler.passOn++;
				
				Node modNode = n;
				phase=0;
				modNode = visitEdgeNoOverride(null, modNode);
				phase++;	//phase=1
				modNode = visitEdgeNoOverride(null, modNode);
				phase++;	//phase=2
				modNode = visitEdgeNoOverride(null, modNode);
				phase++;	//phase=3
				
				/*try {
					OutputStream ost = new FileOutputStream("TestOutputClass.java");
					modNode.prettyPrint(ost);
					ost.close();
				}catch(Exception e) {}
				*/
				
				return modNode;
			} }
		
		if(phase == 0) {
			//System.out.println("Pass 0");
			if(n instanceof Finish)
				tempFin	= null;
			else if(n instanceof For)
				tempFor	= null;
		}
		else if(phase == 1) {
			//System.out.println(n.getClass() + " leaving ----- " + n.position());
			//System.out.println("Atleast leaving pass 2: ");
			if(n instanceof Async_c) {
				if(aChange) {																	// Only is async body is modified
					Async_c	origAsync	= (Async_c)n;
					ForInfo fdata 		= new ForInfo();
					ForInfo ndata 		= new ForInfo();
					for(int i=0; i<forHolder.size(); i++) {
						fdata 			= forHolder.get(i);
						if(fdata.asyPos.equals(origAsync.position().toString())) {
							if(fdata.asyncNode != origAsync) {
								System.out.println("Modifying async entry *************");
								ndata			= fdata;
								ndata.asyncNode	= origAsync;
								forHolder.remove(i);
								forHolder.add(ndata);											// Adding modified entry 
								break;
							} } } } }
			if(n instanceof For_c) {
				System.out.println("Modifying For !!!");
				
				For_c	origFor		= (For_c)n;
				ForInfo fdata 		= new ForInfo();
				ForInfo ndata 		= new ForInfo();
				for(int i=0; i<forHolder.size(); i++) {
					fdata 			= forHolder.get(i);
					if(fdata.forPos.equals(origFor.position().toString())) {
						if(fdata.forNode != origFor) {
							System.out.println("Modifying for entry @@@@@@@@@@@@@@@@");
							ndata			= fdata;
							ndata.forNode	= origFor;
							forHolder.remove(i);
							forHolder.add(ndata);												// Adding modified entry 
							break;
						} } }
				
				boolean proceed		= false;
				Async_c	origAsync	= null;
				for(int i=0; i<forHolder.size(); i++) {
					fdata 			= forHolder.get(i);
					if(fdata.finNode == null) {
						if(fdata.forNode.equals(origFor)) {
							proceed = true;														// Found an entry for finish and thus async
							origAsync = fdata.asyncNode;
							forHolder.remove(i);
							break;
						} } }
				
				if(proceed) {
					aChange = true;
					System.out.println("proceed for");
					List<Stmt> stmts	= new ArrayList<Stmt>();															// Final set of statements
					
					// Generation of aworkers = Runtime.Nthreads();
					/*Call rc				= synth.makeStaticCall(PCG, ts.Runtime(), 
											Name.make("retNthreads"), ts.Int(), this.context());							// rc <-- Runtime.Nthreads();
					LocalDecl ld		= syn.createLocalDecl(PCG, Flags.FINAL, Name.makeFresh("aworkers"), ts.Int(), rc);	// aworker = rc
*/					
					
					//As retNthreads is not available here hardcoding the value as 4 now.
					
					IntLit nthreadLit		= syn.createIntLit(4);
					LocalDecl ld		= syn.createLocalDecl(PCG, Flags.FINAL, Name.makeFresh("aworkers"), ts.Int(), nthreadLit);	// aworker =4 
					
					Local aworker		= syn.createLocal(PCG, ld);
					
					X10Call_c xc		= (X10Call_c)origFor.cond();
					List<Expr> argu		= xc.arguments();
					Expr loopbound		= argu.get(0);																				// Extracting the loop bound
					//System.out.println(loopbound);
				
					// Getting the initialization variable of the original loop and its type.
					List<ForInit> iVar	= origFor.inits();
					X10LocalDecl_c xld	= (X10LocalDecl_c)iVar.get(0);
					Type typ			= xld.type().type();
					
					LocalDecl nld		= syn.createLocalDecl(PCG, Flags.FINAL, Name.makeFresh("nbors"), typ, loopbound);			// nbors = loopbound
					Local neighbors		= syn.createLocal(PCG, nld);

					IntLit oneLit		= syn.createIntLit(1);
					Expr t1				= syn.createBinary(PCG, aworker, Binary.Operator.SUB, oneLit, this);						// t1 = aworkers-1
					Expr t2				= syn.createBinary(PCG, neighbors, Binary.Operator.ADD, t1, this);							// t2 = neighbors+t1
					Expr tchunkSize		= syn.createBinary(PCG, t2, Binary.Operator.DIV, aworker, this);							// tchunkSize = t2/aworker
					LocalDecl nchunk	= syn.createLocalDecl(PCG, Flags.FINAL, Name.makeFresh("chunkSize"), typ, tchunkSize);		// chunkSize = tChunkSize
					Local chunkSize		= syn.createLocal(PCG, nchunk);
					
					// Adding to the list of statements
					stmts.add(ld);
					stmts.add(nld);
					stmts.add(xld);
					stmts.add(nchunk);
	
					// Creating Outer For loop
					IntLit zeroLit		= syn.createIntLit(0);
					LocalDecl ild		= syn.createLocalDecl(PCG, Flags.NONE, Name.makeFresh("ii"), typ, zeroLit);							// ii = 0 -- Loop Initialization
					Local iinode		= syn.createLocal(PCG, ild);
					Expr ocond			= syn.createBinary(PCG, iinode, Binary.Operator.LT, neighbors, this);						// ocund = ii<loopbound -- Loop update
					Expr t4				= syn.createBinary(PCG, iinode, Binary.Operator.ADD, chunkSize, this);						// t4 = ii+chunkSize
					Expr oupdate		= syn.createAssign(PCG, iinode, Operator.ASSIGN, t4, this);									// ii = t4;
					
					// Body of outer for loop
					LocalDecl nid		= syn.createLocalDecl(PCG, Flags.FINAL, Name.makeFresh("ni"), typ, iinode);					// ni = ii
					Local ni			= syn.createLocal(PCG, nid);
					
					Expr t5				= syn.createBinary(PCG, ni,Binary.Operator.ADD, chunkSize, this);							// t5 = ni+chunkSize
					LocalDecl kxld		= syn.createLocalDecl(PCG, Flags.NONE, Name.makeFresh("kx"), ts.Int(), t5);					// kx = t5
					Local kx			= syn.createLocal(PCG, kxld);
					Expr ifcheck		= syn.createBinary(PCG, kx, Binary.Operator.GT, neighbors, this);							// ifcheck <-- kx>nbors
					Stmt kxval			= syn.createAssignment(PCG, kx, Operator.ASSIGN, neighbors, this);							// kx = nbors
					If ifexpr			= syn.createIf(PCG,ifcheck, kxval, null);				// if-cond for value of kx
					
					// Creating Inner For Loop
					Id initVar			= xld.name();
					LocalDecl inld		= syn.createLocalDecl(PCG, Flags.NONE, initVar.id(), ts.Int(), ni);							// initVar = ni -- Loop Initialization
					Local innode		= syn.createLocal(PCG, inld);
					Expr incond			= syn.createBinary(PCG, innode, Binary.Operator.LT, kx, this);								// incund <-- initVar<kx -- Loop update
					Expr inupdate		= syn.createUnary(PCG, Unary.Operator.POST_INC, innode, this);								// initVar++;
					
					List<Stmt> outerSet = new ArrayList<Stmt>();
					outerSet.add(nid);
					
					Stmt forbody		= origFor.body();
					Block forStmts;		List<Stmt> stmtSet;		
					List<Stmt> innerSet = new ArrayList<Stmt>();
					if(forbody instanceof Block) {
						forStmts		= (Block)forbody;
						stmtSet			= forStmts.statements();
						for(int i=0; i<stmtSet.size(); i++) {
							Stmt st = stmtSet.get(i); 
							if(st instanceof Async) {
								Async asy 		= (Async)stmtSet.get(i);
								Stmt asyncBody 	= asy.body();
								innerSet.add(asyncBody);																		// Add async body to inner loop
							}
							else {
								if(st instanceof LocalDecl_c) {
									LocalDecl_c sld	= (LocalDecl_c)st;
									innerSet.add(sld);																			// rest of the statements
								} } } }
					else {																										// Only one statement i.e. async
						Async asyncCons	= (Async)forbody;			
						innerSet.add(asyncCons.body());
					}
					
					
					
						Block innerblk 		= syn.createBlock(PCG, innerSet);
						gName 				= innode.name().id();
						gLocal 				= innode; 
						setLocal 			= true;
						Block newBlock 		= (Block)innerblk.visit(this);
						setLocal 			= false;
						
						For innerFor		= syn.createStandardFor(PCG, inld, incond, inupdate, newBlock);
						AsyncDef asyncDef 	= (AsyncDef)AtStmt_c.createDummyAsync(PCG, ts, context.currentClass(), context.currentCode(), 
												context.currentCode().staticContext(), true);
						
						List<Stmt> asySet	= new ArrayList<Stmt>();
						asySet.add(kxld);															
						asySet.add(ifexpr);
						asySet.add(innerFor);
						Block asyblock 		= syn.createBlock(PCG, asySet);
						Async newasync  	= nf.Async(PCG, new ArrayList<Expr>(),asyblock).asyncDef(asyncDef);						
						outerSet.add(newasync);																					// Adding async to outer for loop
					
					Block outerblock 	= syn.createBlock(PCG, outerSet);
					For outerFor		= syn.createStandardFor(PCG, ild, ocond, oupdate, outerblock);						// Generating outer For loop
					stmts.add(outerFor);
					Block result 			= syn.createBlock(PCG, stmts);
					return result;
				} }
			if(n instanceof x10.ast.Finish_c) {
				System.out.println("Modifying Finish !!!");
				boolean proceed		= false;
				For_c	origFor		= null;
				Async_c	origAsync	= null;
				Finish_c fin 		= (Finish_c)n;																		// Original finish
				ForInfo fdata 		= new ForInfo();
				for(int i=0; i<forHolder.size(); i++) {
					fdata 			= forHolder.get(i);
					if(fdata.finNode != null) {
						if(fdata.finPos.equals(fin.position().toString())) {
							proceed = true;														// Found an entry for finish and thus async
							origFor	= fdata.forNode;
							origAsync = fdata.asyncNode;
							forHolder.remove(i);
							break;
						} } }
				
				if(proceed) {
					aChange = true;
					System.out.println("proceed finish");
					List<Stmt> stmts	= new ArrayList<Stmt>();															// Final set of statements
					
					
					// Generation of aworkers = Runtime.Nthreads();
					/*Call rc				= synth.makeStaticCall(PCG, ts.Runtime(), 
											Name.make("retNthreads"), ts.Int(), this.context());							// rc <-- Runtime.Nthreads();
					LocalDecl ld		= syn.createLocalDecl(PCG, Flags.FINAL, Name.makeFresh("aworkers"), ts.Int(), rc);	// aworker = rc
*/					
					
					//As retNthreads is not available here hard-coding the value as 4 now.
					
					IntLit nthreadLit		= syn.createIntLit(4);
					LocalDecl ld		= syn.createLocalDecl(PCG, Flags.FINAL, Name.makeFresh("aworkers"), ts.Int(), nthreadLit);	// aworker =4 
					
					
					
					
					Local aworker		= syn.createLocal(PCG, ld);
					
					X10Call_c xc		= (X10Call_c)origFor.cond();
					List<Expr> argu		= xc.arguments();
					Expr loopbound		= argu.get(0);																				// Extracting the loop bound
					//System.out.println(loopbound);
				
					// Getting the initialization variable of the original loop and its type.
					List<ForInit> iVar	= origFor.inits();
					X10LocalDecl_c xld	= (X10LocalDecl_c)iVar.get(0);
					Type typ			= xld.type().type();
					
					LocalDecl nld		= syn.createLocalDecl(PCG, Flags.FINAL, Name.makeFresh("nbors"), typ, loopbound);			// nbors = loopbound
					Local neighbors		= syn.createLocal(PCG, nld);

					IntLit oneLit		= syn.createIntLit(1);
					Expr t1				= syn.createBinary(PCG, aworker, Binary.Operator.SUB, oneLit, this);						// t1 = aworkers-1
					Expr t2				= syn.createBinary(PCG, neighbors, Binary.Operator.ADD, t1, this);							// t2 = neighbors+t1
					Expr tchunkSize		= syn.createBinary(PCG, t2, Binary.Operator.DIV, aworker, this);							// tchunkSize = t2/aworker
					LocalDecl nchunk	= syn.createLocalDecl(PCG, Flags.FINAL, Name.makeFresh("chunkSize"), typ, tchunkSize);		// chunkSize = tChunkSize
					Local chunkSize		= syn.createLocal(PCG, nchunk);
					
					// Adding to the list of statements
					stmts.add(ld);
					stmts.add(nld);
					stmts.add(xld);
					stmts.add(nchunk);
	
					// Creating Outer For loop
					IntLit zeroLit		= syn.createIntLit(0);
					LocalDecl ild		= syn.createLocalDecl(PCG, Flags.NONE, Name.makeFresh("ii"), typ, zeroLit);							// ii = 0 -- Loop Initialization
					Local iinode		= syn.createLocal(PCG, ild);
					Expr ocond			= syn.createBinary(PCG, iinode, Binary.Operator.LT, neighbors, this);						// ocund = ii<loopbound -- Loop update
					Expr t4				= syn.createBinary(PCG, iinode, Binary.Operator.ADD, chunkSize, this);						// t4 = ii+chunkSize
					Expr oupdate		= syn.createAssign(PCG, iinode, Operator.ASSIGN, t4, this);									// ii = t4;
					
					// Body of outer for loop
					LocalDecl nid		= syn.createLocalDecl(PCG, Flags.FINAL, Name.makeFresh("ni"), typ, iinode);					// ni = ii
					Local ni			= syn.createLocal(PCG, nid);
					
					Expr t5				= syn.createBinary(PCG, ni,Binary.Operator.ADD, chunkSize, this);							// t5 = ni+chunkSize
					LocalDecl kxld		= syn.createLocalDecl(PCG, Flags.NONE, Name.makeFresh("kx"), ts.Int(), t5);					// kx = t5
					Local kx			= syn.createLocal(PCG, kxld);
					Expr ifcheck		= syn.createBinary(PCG, kx, Binary.Operator.GT, neighbors, this);							// ifcheck <-- kx>nbors
					Stmt kxval			= syn.createAssignment(PCG, kx, Operator.ASSIGN, neighbors, this);							// kx = nbors
					If ifexpr			= syn.createIf(PCG,ifcheck, kxval, null);				// if-cond for value of kx
					
					// Creating Inner For Loop
					Id initVar			= xld.name();
					LocalDecl inld		= syn.createLocalDecl(PCG, Flags.NONE, initVar.id(), ts.Int(), ni);							// initVar = ni -- Loop Initialization
					Local innode		= syn.createLocal(PCG, inld);
					Expr incond			= syn.createBinary(PCG, innode, Binary.Operator.LT, kx, this);								// incund <-- initVar<kx -- Loop update
					Expr inupdate		= syn.createUnary(PCG, Unary.Operator.POST_INC, innode, this);								// initVar++;
					
					List<Stmt> outerSet = new ArrayList<Stmt>();
					outerSet.add(nid);
					
					Stmt forbody		= origFor.body();
					Block forStmts;		List<Stmt> stmtSet;		
					List<Stmt> innerSet = new ArrayList<Stmt>();
					if(forbody instanceof Block) {
						forStmts		= (Block)forbody;
						stmtSet			= forStmts.statements();
						for(int i=0; i<stmtSet.size(); i++) {
							Stmt st = stmtSet.get(i); 
							if(st instanceof Async) {
								Async asy 		= (Async)stmtSet.get(i);
								Stmt asyncBody 	= asy.body();
								innerSet.add(asyncBody);																		// Add async body to inner loop
							}
							else {
								if(st instanceof LocalDecl_c) {
									LocalDecl_c sld	= (LocalDecl_c)st;
									innerSet.add(sld);																			// rest of the statements
								} } } }
					else {																										// Only one statement i.e. async
						Async asyncCons	= (Async)forbody;			
						innerSet.add(asyncCons.body());
					}
					
					List<Stmt> finiSet 	= new ArrayList<Stmt>();									// List of finish statements
					List<Stmt> endFor 	= new ArrayList<Stmt>();									// List of finish statements after for
					Block finBody		= (Block)fin.body();
					List<Stmt> finStmts	= finBody.statements();
					boolean changeSet	= false;
					for(int i=0; i<finStmts.size(); i++) {
						Stmt fst		= finStmts.get(i);
						if(!(fst instanceof For)) {
							if(changeSet)
								endFor.add(fst);
							else
								finiSet.add(fst);																				// Adding all non for statements
						}
						else {
							changeSet = true;
						} }
					
				
					
						Block innerblk 		= syn.createBlock(PCG, innerSet);
						gName 				= innode.name().id();
						gLocal 				= innode; 
						setLocal 			= true;
						Block newBlock 		= (Block)innerblk.visit(this);
						setLocal 			= false;
						
						For innerFor		= syn.createStandardFor(PCG, inld, incond, inupdate, newBlock);
						AsyncDef asyncDef 	= (AsyncDef)AtStmt_c.createDummyAsync(PCG, ts, context.currentClass(), context.currentCode(), 
												context.currentCode().staticContext(), true);
						
						List<Stmt> asySet	= new ArrayList<Stmt>();
						asySet.add(kxld);															
						asySet.add(ifexpr);
						asySet.add(innerFor);
						Block asyblock 		= syn.createBlock(PCG, asySet);
						Async newasync  	= nf.Async(PCG, new ArrayList<Expr>(),asyblock).asyncDef(asyncDef);						
						outerSet.add(newasync);																					// Adding async to outer for loop
					
					Block outerblock 	= syn.createBlock(PCG, outerSet);
					For outerFor		= syn.createStandardFor(PCG, ild, ocond, oupdate, outerblock);						// Generating outer For loop
					finiSet.add(outerFor);
					finiSet.addAll(endFor);
					endFor.clear();
					
					Block finiBody			= syn.createBlock(PCG, finiSet);
					Finish fini				= fin.body(finiBody);																// Generating the new Finish
					stmts.add(fini);
					Block result 			= syn.createBlock(PCG, stmts);
					return result;
				} }
			else if(n instanceof X10Local_c) {
				if(setLocal) {
					X10Local_c loc 	= (X10Local_c)n;
					String variable	= loc.name().toString();
					if(variable.equals(gName.toString())) {
						return gLocal;
					} } } }
		else if(phase == 2) {
			//System.out.println(n.getClass() + " leaving ----- " + n.position());
			//System.out.println("Pass 2");
			if(n instanceof Async) {
				//System.out.println("Pass 2: Async");
				Stmt mbody 		= ((MethodDecl_c)mdec).body();
				Async asy		= ((Async)n);
				mbody.visit(new ClosureCaptureVisitor(this.context(), asy.asyncDef()));
				//((Finish_c)tempFin).body().visit(new ClosureCaptureVisitor(this.context(), ((Async)n).asyncDef()));
			}
			if(n instanceof AtStmt_c) {
				Stmt mbody 		= ((MethodDecl_c)mdec).body();
				AtStmt atm		= (AtStmt)n;
				mbody.visit(new ClosureCaptureVisitor(this.context(), atm.atDef()));
			}
		}
        return n;
    }
	
	static boolean gflag = false;
	
	
	
	
	List<Stmt> localdecls	= new ArrayList<Stmt>();  
}
	
class ForInfo {
	For_c forNode;		String forPos;
	Async_c asyncNode;	String asyPos;
	Finish_c finNode;	String finPos;
	
	public void setData(For_c forNode, Async_c asyncNode, Finish_c finNode, String asyPos, String forPos, String finPos) {
		this.forNode 	= forNode;
		this.asyncNode 	= asyncNode;
		this.finNode 	= finNode;
		this.forPos		= forPos;
		this.finPos		= finPos;
		this.asyPos		= asyPos;
	}
}