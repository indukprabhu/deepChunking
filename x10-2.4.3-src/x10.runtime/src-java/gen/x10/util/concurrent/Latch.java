package x10.util.concurrent;


@x10.runtime.impl.java.X10Generated
public class Latch extends x10.util.concurrent.Monitor implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Latch> $RTT = 
        x10.rtt.NamedType.<Latch> make("x10.util.concurrent.Latch",
                                       Latch.class,
                                       new x10.rtt.Type[] {
                                           x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.Types.BOOLEAN),
                                           x10.util.concurrent.Monitor.$RTT
                                       });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        throw new x10.io.NotSerializableException("Can't serialize x10.util.concurrent.Latch");
    }
    
    // constructor just for allocation
    public Latch(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    // bridge for method abstract public ()=>U.operator()(){}:U
    public x10.core.Boolean $apply$G() {
        return x10.core.Boolean.$box($apply$O());
    }
    
    

    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
    public Latch() {
        super();
         {
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
            
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
            this.__fieldInitializers_x10_util_concurrent_Latch();
        }
    }
    
    
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
    public Latch(final java.lang.Object id$207) {
        super();
         {
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
            
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
            this.__fieldInitializers_x10_util_concurrent_Latch();
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
            throw new java.lang.UnsupportedOperationException((("Cannot deserialize ") + (x10.rtt.Types.typeName(this))));
        }
    }
    
    
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
    public boolean state;
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
    public void release() {
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
        this.lock();
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
        this.state = true;
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
        super.release();
    }
    
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
    public void await() {
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
        x10.lang.Runtime.ensureNotInAtomic();
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
        final boolean t$145609 = state;
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
        final boolean t$145612 = !(t$145609);
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
        if (t$145612) {
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
            this.lock();
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
            while (true) {
                
                //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
                final boolean t$145610 = state;
                
                //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
                final boolean t$145611 = !(t$145610);
                
                //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
                if (!(t$145611)) {
                    
                    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
                    break;
                }
                
                //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
                super.await();
            }
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
            this.unlock();
        }
    }
    
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
    public boolean $apply$O() {
        
        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
        final boolean t$145613 = state;
        
        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
        return t$145613;
    }
    
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
    final public x10.util.concurrent.Latch x10$util$concurrent$Latch$$this$x10$util$concurrent$Latch() {
        
        //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
        return x10.util.concurrent.Latch.this;
    }
    
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
    final public void __fieldInitializers_x10_util_concurrent_Latch() {
        
        //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
        this.state = false;
    }
    
    public void x10$util$concurrent$Monitor$release$S() {
        super.release();
    }
    
    public void x10$util$concurrent$Monitor$await$S() {
        super.await();
    }
}

