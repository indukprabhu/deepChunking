package x10.util.concurrent;


@x10.runtime.impl.java.X10Generated
public class IntLatch extends x10.util.concurrent.Monitor implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<IntLatch> $RTT = 
        x10.rtt.NamedType.<IntLatch> make("x10.util.concurrent.IntLatch",
                                          IntLatch.class,
                                          new x10.rtt.Type[] {
                                              x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.Types.INT),
                                              x10.util.concurrent.Monitor.$RTT
                                          });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        throw new x10.io.NotSerializableException("Can't serialize x10.util.concurrent.IntLatch");
    }
    
    // constructor just for allocation
    public IntLatch(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    // bridge for method abstract public ()=>U.operator()(){}:U
    public x10.core.Int $apply$G() {
        return x10.core.Int.$box($apply$O());
    }
    
    

    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
    public IntLatch() {
        super();
         {
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
            
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
            this.__fieldInitializers_x10_util_concurrent_IntLatch();
        }
    }
    
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
    public IntLatch(final java.lang.Object id$206) {
        super();
         {
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
            
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
            this.__fieldInitializers_x10_util_concurrent_IntLatch();
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
            throw new java.lang.UnsupportedOperationException((("Cannot deserialize ") + (x10.rtt.Types.typeName(this))));
        }
    }
    
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
    public int value;
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
    public void $set(final int i) {
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
        this.set((int)(i));
    }
    
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
    public void set(final int i) {
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
        this.lock();
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
        this.value = i;
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
        super.release();
    }
    
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
    public void await() {
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
        x10.lang.Runtime.ensureNotInAtomic();
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
        final int t$145604 = value;
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
        final boolean t$145607 = ((int) t$145604) == ((int) 0);
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
        if (t$145607) {
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
            this.lock();
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
            while (true) {
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
                final int t$145605 = value;
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
                final boolean t$145606 = ((int) t$145605) == ((int) 0);
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
                if (!(t$145606)) {
                    
                    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
                    break;
                }
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
                super.await();
            }
            
            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
            this.unlock();
        }
    }
    
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
    public int $apply$O() {
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
        final int t$145608 = value;
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
        return t$145608;
    }
    
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
    final public x10.util.concurrent.IntLatch x10$util$concurrent$IntLatch$$this$x10$util$concurrent$IntLatch() {
        
        //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
        return x10.util.concurrent.IntLatch.this;
    }
    
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
    final public void __fieldInitializers_x10_util_concurrent_IntLatch() {
        
        //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
        this.value = 0;
    }
    
    public void x10$util$concurrent$Monitor$release$S() {
        super.release();
    }
    
    public void x10$util$concurrent$Monitor$await$S() {
        super.await();
    }
}

