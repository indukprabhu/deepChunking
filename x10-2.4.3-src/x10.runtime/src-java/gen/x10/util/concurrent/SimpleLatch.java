package x10.util.concurrent;


@x10.runtime.impl.java.X10Generated
public class SimpleLatch extends x10.util.concurrent.Lock implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<SimpleLatch> $RTT = 
        x10.rtt.NamedType.<SimpleLatch> make("x10.util.concurrent.SimpleLatch",
                                             SimpleLatch.class,
                                             new x10.rtt.Type[] {
                                                 x10.util.concurrent.Lock.$RTT
                                             });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        throw new x10.io.NotSerializableException("Can't serialize x10.util.concurrent.SimpleLatch");
    }
    
    // constructor just for allocation
    public SimpleLatch(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
    public SimpleLatch() {
        super();
         {
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
            
            
            //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
            this.__fieldInitializers_x10_util_concurrent_SimpleLatch();
        }
    }
    
    
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
    public x10.lang.Runtime.Worker worker;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
    public boolean state;
    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
    public void await() {
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        final boolean t$145792 = state;
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        if (t$145792) {
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
            return;
        }
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        this.lock();
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        final boolean t$145793 = state;
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        if (t$145793) {
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
            this.unlock();
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
            return;
        }
        
        //#line 1539 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$145811 = x10.lang.Runtime.get$STATIC_THREADS();
        
        //#line 1539 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$145812 = !(t$145811);
        
        //#line 1539 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (t$145812) {
            
            //#line 1540 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Pool t$145813 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
            
            //#line 1540 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$145813.increase();
        }
        
        //#line 745 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Thread t$145797 = x10.core.Thread.currentThread();
        
        //#line 745 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Worker t$145798 = x10.rtt.Types.<x10.lang.Runtime.Worker> cast(t$145797,x10.lang.Runtime.Worker.$RTT);
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        this.worker = ((x10.lang.Runtime.Worker)(t$145798));
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        while (true) {
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
            final boolean t$145799 = state;
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
            final boolean t$145800 = !(t$145799);
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
            if (!(t$145800)) {
                
                //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
                break;
            }
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
            this.unlock();
            
            //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
            x10.lang.Runtime.Worker.park();
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
            this.lock();
        }
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        this.unlock();
    }
    
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
    public void release() {
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        final boolean t$145801 = state;
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        if (t$145801) {
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
            return;
        }
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        this.lock();
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        final boolean t$145802 = state;
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        if (t$145802) {
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
            this.unlock();
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
            return;
        }
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        this.state = true;
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        final x10.lang.Runtime.Worker t$145803 = ((x10.lang.Runtime.Worker)(worker));
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        final boolean t$145809 = ((t$145803) != (null));
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        if (t$145809) {
            
            //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$145814 = x10.lang.Runtime.get$STATIC_THREADS();
            
            //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$145815 = !(t$145814);
            
            //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$145815) {
                
                //#line 1547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Pool t$145816 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
                
                //#line 1547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$145816.decrease((int)(1));
            }
            
            //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
            final x10.lang.Runtime.Worker this$145789 = ((x10.lang.Runtime.Worker)(worker));
            
            //#line 625 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$145817 = x10.lang.Runtime.get$STATIC_THREADS();
            
            //#line 625 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$145818 = !(t$145817);
            
            //#line 625 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$145818) {
                
                //#line 626 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this$145789./*non-virtual*/x10$lang$Thread$unpark$S();
            }
        }
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        this.unlock();
    }
    
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
    public boolean $apply$O() {
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        final boolean t$145810 = state;
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        return t$145810;
    }
    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
    final public x10.util.concurrent.SimpleLatch x10$util$concurrent$SimpleLatch$$this$x10$util$concurrent$SimpleLatch() {
        
        //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        return x10.util.concurrent.SimpleLatch.this;
    }
    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
    final public void __fieldInitializers_x10_util_concurrent_SimpleLatch() {
        
        //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        this.worker = null;
        
        //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        this.state = false;
    }
}

