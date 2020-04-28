

package polyglot.visit;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import polyglot.ast.NodeFactory;
import polyglot.frontend.Goal;
import polyglot.frontend.Job;
import polyglot.frontend.Scheduler;
import polyglot.types.TypeSystem;
import polyglot.visit.NodeVisitor;
import x10.Configuration;
import x10.ExtensionInfo;
import x10.X10CompilerOptions;
import x10.ExtensionInfo.X10Scheduler.ValidatingVisitorGoal;
import x10.visit.X10TypeChecker;

/*
 * @Author	=	Suyash Gupta
 * @Author	= 	V. Krishna Nandivada
 * @Author  =   Indu 
 */

public class ChunkOptimizer {
	private final Scheduler     scheduler;
    private final Job           job;
    private final ExtensionInfo extInfo;
    private final Configuration config;
    private final TypeSystem    ts;
    private final NodeFactory   nf;

    public ChunkOptimizer(Scheduler s, Job j) {
        scheduler = s;
        job       = j;
        extInfo   = (ExtensionInfo) j.extensionInfo();
        config    = ((X10CompilerOptions) extInfo.getOptions()).x10_config;
        ts        = extInfo.typeSystem();
        nf        = extInfo.nodeFactory();
    }
    
    public static List<Goal> goals(Scheduler scheduler, Job job) {
        return new ChunkOptimizer(scheduler, job).goals();
    }
    
    private List<Goal> goals() {
        List<Goal> goals = new ArrayList<Goal>();
        if (config.CHUNK_CUSTOM || config.CHUNK_CYCLIC || config.CHUNK_BLOCK || config.CHUNK_DYNAMIC || config.CHUNK_GUIDED || config.CHUNK_HISTORY) {
            goals.add(FunctionTable());
        	goals.add(PreCustomChunkLoop());
        	 goals.add(CustomChunkLoop());
        	goals.add(CustomChunkClosureCapture());
        	
        }
        else  if (config.CHUNK_ATOMIC) {
            goals.add(FunctionTable());
        	goals.add(PreCustomChunkLoop());
        	 goals.add(CustomChunkLoopAtomic());
        	 goals.add(CustomChunkClosureCapture());
        	
        }
        else if (config.CHUNK_PROFILE) {
        	goals.add(FunctionTable());
        	goals.add(ChunkProfileInstrument());
        	goals.add(PostChunkingProfile());
        	goals.add(CustomChunkClosureCapture());
        }
        else if (config.CHUNK_ATOMIC_PROFILE) {
        	 goals.add(FunctionTable());
        	goals.add(ChunkAtomicProfileInstrument());
        	goals.add(PostChunkingProfile());
        	goals.add(CustomChunkClosureCapture());
        }
        else if (config.CHUNK_HISTORY_PROFILE) {
        	goals.add(FunctionTable());
        	goals.add(HistoryLoopProfileInstrument());
        	goals.add(PostChunkingProfile());
        	goals.add(CustomChunkClosureCapture());
        }
        
        return goals;
    }
    
    /*public Goal PassingInfo() {
        NodeVisitor visitor = new AsyncCount(job, ts, nf);
        Goal goal = new ValidatingVisitorGoal("CountPassInfo", job, visitor);
        return goal.intern(scheduler);
    }*/
    
    public Goal ChunkingLoops() {
        NodeVisitor visitor = new LoopChunk(job, ts, nf);
        Goal goal = new ValidatingVisitorGoal("ModifyAsyncs", job, visitor);
        return goal.intern(scheduler);
    }
   
    public Goal CustomChunkLoop() {
        NodeVisitor visitor = new CustomChunk(job, ts, nf);
        Goal goal = new ValidatingVisitorGoal("CustomChunk", job, visitor);
        return goal.intern(scheduler);
        
    }
    public Goal CustomChunkLoopAtomic() {
        NodeVisitor visitor = new CustomChunkAtomic(job, ts, nf);
        Goal goal = new ValidatingVisitorGoal("CustomChunk", job, visitor);
        return goal.intern(scheduler);
        
    }
    public Goal FunctionTable() {
        NodeVisitor visitor = new FunctionTable(job, ts, nf);
        Goal goal = new ValidatingVisitorGoal("FunctionTable", job, visitor);
        return goal.intern(scheduler);
        
    }
    
    public Goal PreCustomChunkLoop() {
        NodeVisitor visitor = new PreCustomChunk(job, ts, nf);
        Goal goal = new ValidatingVisitorGoal("PreCustomChunk", job, visitor);
        return goal.intern(scheduler);
        
    }
    
    public Goal  PostChunkingProfile() {
        NodeVisitor visitor = new PostChunking(job, ts, nf);
        Goal goal = new ValidatingVisitorGoal("PostChunking", job, visitor);
        return goal.intern(scheduler);
    }
    
    
    public Goal CustomChunkClosureCapture() {
        NodeVisitor visitor = new customChunkClosureCapture(job, ts, nf);
        Goal goal = new ValidatingVisitorGoal("CustomChunkclosure", job, visitor);
        return goal.intern(scheduler);
    }
    public Goal ChunkProfileInstrument() {
        NodeVisitor visitor = new ChunkProfileInstrumentation(job, ts, nf);
        Goal goal = new ValidatingVisitorGoal("ChunkProfileInstrument", job, visitor);
        return goal.intern(scheduler);
    }
    public Goal HistoryLoopProfileInstrument() {
        NodeVisitor visitor = new HistoryLoopProfileInstrumentation(job, ts, nf);
        Goal goal = new ValidatingVisitorGoal("HistoryLoopProfileInstrument", job, visitor);
        return goal.intern(scheduler);
    }
    public Goal ChunkAtomicProfileInstrument() {
        NodeVisitor visitor = new ChunkAtomicProfileInstrumentation(job, ts, nf);
        Goal goal = new ValidatingVisitorGoal("ChunAtomicProfileInstrument", job, visitor);
        return goal.intern(scheduler);
    }
    
    
    public Goal typeCheckAfterChanges() {
    	ContextVisitor visitor = new X10TypeChecker(job, ts, nf,job.nodeMemo()); 
    	Goal goal = new ValidatingVisitorGoal("typeCheckAfterChange", job, visitor);
        return goal.intern(scheduler);
        
    }
    public Goal initCheckAfterChanges() {
    	InitChecker visitor = new InitChecker(job,ts,nf); 
    	Goal goal = new ValidatingVisitorGoal("initCheckAfterChange", job, visitor);
        return goal.intern(scheduler);
        
    }

	
    
    
    /*public Goal CountingAsyncs() {
        NodeVisitor visitor = new RTReduction(job, ts, nf);
        Goal goal = new ValidatingVisitorGoal("CountAsyncs", job, visitor);
        return goal.intern(scheduler);
    }*/
    
    /*public Goal RenamerData() {
        NodeVisitor visitor = new SimpleRenamer(job, ts, nf);
        Goal goal = new ValidatingVisitorGoal("RenamingData", job, visitor);
        return goal.intern(scheduler);
    }*/
    
    
}






