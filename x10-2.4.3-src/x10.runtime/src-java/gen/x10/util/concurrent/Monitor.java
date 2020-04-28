package x10.util.concurrent;


@x10.runtime.impl.java.X10Generated
public class Monitor extends x10.util.concurrent.Lock implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Monitor> $RTT = 
        x10.rtt.NamedType.<Monitor> make("x10.util.concurrent.Monitor",
                                         Monitor.class,
                                         new x10.rtt.Type[] {
                                             x10.util.concurrent.Lock.$RTT
                                         });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        throw new x10.io.NotSerializableException("Can't serialize x10.util.concurrent.Monitor");
    }
    
    // constructor just for allocation
    public Monitor(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
    public Monitor() {
        super();
         {
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
            
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
            this.__fieldInitializers_x10_util_concurrent_Monitor();
        }
    }
    
    
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
    /**
     * Parked workers
     */
    public x10.util.GrowableRail<x10.lang.Runtime.Worker> workers;
    
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
    public void await() {
        
        //#line 1539 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$145651 = x10.lang.Runtime.get$STATIC_THREADS();
        
        //#line 1539 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$145652 = !(t$145651);
        
        //#line 1539 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (t$145652) {
            
            //#line 1540 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Pool t$145653 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
            
            //#line 1540 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$145653.increase();
        }
        
        //#line 745 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Thread t$145633 = x10.core.Thread.currentThread();
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
        final x10.lang.Runtime.Worker worker = x10.rtt.Types.<x10.lang.Runtime.Worker> cast(t$145633,x10.lang.Runtime.Worker.$RTT);
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
        final x10.util.GrowableRail t$145634 = ((x10.util.GrowableRail)(workers));
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
        ((x10.util.GrowableRail<x10.lang.Runtime.Worker>)t$145634).add__0x10$util$GrowableRail$$T(((x10.lang.Runtime.Worker)(worker)));
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
        while (true) {
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
            final x10.util.GrowableRail t$145635 = ((x10.util.GrowableRail)(workers));
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
            final boolean t$145636 = ((x10.util.GrowableRail<x10.lang.Runtime.Worker>)t$145635).contains__0x10$util$GrowableRail$$T$O(((x10.lang.Runtime.Worker)(worker)));
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
            if (!(t$145636)) {
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
                break;
            }
            
            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
            super.unlock();
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
            x10.lang.Runtime.Worker.park();
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
            super.lock();
        }
    }
    
    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
    public void release() {
        
        //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
        final x10.util.GrowableRail this$145622 = ((x10.util.GrowableRail)(workers));
        
        //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$145637 = ((x10.util.GrowableRail<x10.lang.Runtime.Worker>)this$145622).size;
        
        //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
        final int size = ((int)(long)(((long)(t$145637))));
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
        final long t$145638 = ((long)(((int)(size))));
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
        final boolean t$145650 = ((t$145638) > (((long)(0L))));
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
        if (t$145650) {
            
            //#line 1545 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final int n$145623 = size;
            
            //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$145660 = x10.lang.Runtime.get$STATIC_THREADS();
            
            //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$145661 = !(t$145660);
            
            //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$145661) {
                
                //#line 1547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Pool t$145662 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
                
                //#line 1547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$145662.decrease((int)(n$145623));
            }
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
            int i$145663 = 0;
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
            for (;
                 true;
                 ) {
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
                final int t$145664 = i$145663;
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
                final boolean t$145665 = ((t$145664) < (((int)(size))));
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
                if (!(t$145665)) {
                    
                    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
                    break;
                }
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
                final x10.util.GrowableRail t$145656 = ((x10.util.GrowableRail)(workers));
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
                final x10.lang.Runtime.Worker this$145657 = ((x10.util.GrowableRail<x10.lang.Runtime.Worker>)t$145656).removeLast$G();
                
                //#line 625 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$145654 = x10.lang.Runtime.get$STATIC_THREADS();
                
                //#line 625 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$145655 = !(t$145654);
                
                //#line 625 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (t$145655) {
                    
                    //#line 626 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    this$145657./*non-virtual*/x10$lang$Thread$unpark$S();
                }
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
                final int t$145658 = i$145663;
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
                final int t$145659 = ((t$145658) + (((int)(1))));
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
                i$145663 = t$145659;
            }
        }
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
        super.unlock();
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
    final public x10.util.concurrent.Monitor x10$util$concurrent$Monitor$$this$x10$util$concurrent$Monitor() {
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
        return x10.util.concurrent.Monitor.this;
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
    final public void __fieldInitializers_x10_util_concurrent_Monitor() {
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
        final x10.util.GrowableRail alloc$113371 = ((x10.util.GrowableRail)(new x10.util.GrowableRail<x10.lang.Runtime.Worker>((java.lang.System[]) null, x10.lang.Runtime.Worker.$RTT)));
        
        //#line 50 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        alloc$113371.x10$util$GrowableRail$$init$S(((long)(0L)));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
        this.workers = ((x10.util.GrowableRail)(alloc$113371));
    }
    
    public void x10$util$concurrent$Lock$unlock$S() {
        super.unlock();
    }
    
    public void x10$util$concurrent$Lock$lock$S() {
        super.lock();
    }
}

