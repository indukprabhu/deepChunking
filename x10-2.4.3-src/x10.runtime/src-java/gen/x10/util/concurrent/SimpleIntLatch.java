package x10.util.concurrent;


@x10.runtime.impl.java.X10Generated
public class SimpleIntLatch extends x10.util.concurrent.Lock implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<SimpleIntLatch> $RTT = 
        x10.rtt.NamedType.<SimpleIntLatch> make("x10.util.concurrent.SimpleIntLatch",
                                                SimpleIntLatch.class,
                                                new x10.rtt.Type[] {
                                                    x10.util.concurrent.Lock.$RTT
                                                });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        throw new x10.io.NotSerializableException("Can't serialize x10.util.concurrent.SimpleIntLatch");
    }
    
    // constructor just for allocation
    public SimpleIntLatch(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
    public SimpleIntLatch() {
        super();
         {
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
            
            
            //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
            this.__fieldInitializers_x10_util_concurrent_SimpleIntLatch();
        }
    }
    
    
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
    public x10.lang.Runtime.Worker worker;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
    public int value;
    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
    public void await() {
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        final int t$145755 = value;
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        final boolean t$145756 = ((int) t$145755) != ((int) 0);
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        if (t$145756) {
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
            return;
        }
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        this.lock();
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        final int t$145757 = value;
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        final boolean t$145758 = ((int) t$145757) != ((int) 0);
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        if (t$145758) {
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
            this.unlock();
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
            return;
        }
        
        //#line 1539 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$145776 = x10.lang.Runtime.get$STATIC_THREADS();
        
        //#line 1539 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final boolean t$145777 = !(t$145776);
        
        //#line 1539 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (t$145777) {
            
            //#line 1540 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Pool t$145778 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
            
            //#line 1540 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            t$145778.increase();
        }
        
        //#line 745 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Thread t$145762 = x10.core.Thread.currentThread();
        
        //#line 745 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Worker t$145763 = x10.rtt.Types.<x10.lang.Runtime.Worker> cast(t$145762,x10.lang.Runtime.Worker.$RTT);
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        this.worker = ((x10.lang.Runtime.Worker)(t$145763));
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        while (true) {
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
            final int t$145764 = value;
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
            final boolean t$145765 = ((int) t$145764) == ((int) 0);
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
            if (!(t$145765)) {
                
                //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
                break;
            }
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
            this.unlock();
            
            //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
            x10.lang.Runtime.Worker.park();
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
            this.lock();
        }
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        this.unlock();
    }
    
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
    public void $set(final int v) {
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        this.set((int)(v));
    }
    
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
    public void set(final int v) {
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        this.lock();
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        final int t$145766 = value;
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        final boolean t$145767 = ((int) t$145766) != ((int) 0);
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        if (t$145767) {
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
            this.unlock();
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
            return;
        }
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        this.value = v;
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        final x10.lang.Runtime.Worker t$145768 = ((x10.lang.Runtime.Worker)(worker));
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        final boolean t$145774 = ((t$145768) != (null));
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        if (t$145774) {
            
            //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$145779 = x10.lang.Runtime.get$STATIC_THREADS();
            
            //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$145780 = !(t$145779);
            
            //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$145780) {
                
                //#line 1547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final x10.lang.Runtime.Pool t$145781 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
                
                //#line 1547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                t$145781.decrease((int)(1));
            }
            
            //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
            final x10.lang.Runtime.Worker this$145752 = ((x10.lang.Runtime.Worker)(worker));
            
            //#line 625 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$145782 = x10.lang.Runtime.get$STATIC_THREADS();
            
            //#line 625 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final boolean t$145783 = !(t$145782);
            
            //#line 625 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (t$145783) {
                
                //#line 626 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this$145752./*non-virtual*/x10$lang$Thread$unpark$S();
            }
        }
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        this.unlock();
    }
    
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
    public int $apply$O() {
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        final int t$145775 = value;
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        return t$145775;
    }
    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
    final public x10.util.concurrent.SimpleIntLatch x10$util$concurrent$SimpleIntLatch$$this$x10$util$concurrent$SimpleIntLatch() {
        
        //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        return x10.util.concurrent.SimpleIntLatch.this;
    }
    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
    final public void __fieldInitializers_x10_util_concurrent_SimpleIntLatch() {
        
        //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        this.worker = null;
        
        //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        this.value = 0;
    }
}

