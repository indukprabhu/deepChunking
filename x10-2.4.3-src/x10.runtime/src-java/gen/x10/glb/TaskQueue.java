package x10.glb;

@x10.runtime.impl.java.X10Generated
public interface TaskQueue<$Queue, $R> extends x10.core.Any
{
    public static final x10.rtt.RuntimeType<TaskQueue> $RTT = 
        x10.rtt.NamedType.<TaskQueue> make("x10.glb.TaskQueue",
                                           TaskQueue.class,
                                           2);
    
    

    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/TaskQueue.x10"
    boolean process$Z(final long n, final x10.glb.Context context, x10.rtt.Type t1);
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/TaskQueue.x10"
    x10.glb.TaskBag split();
    
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/TaskQueue.x10"
    void merge(final x10.glb.TaskBag tb);
    
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/TaskQueue.x10"
    long count$O();
    
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/TaskQueue.x10"
    x10.glb.GLBResult getResult();
    
    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/TaskQueue.x10"
    void printLog();
}

