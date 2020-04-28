package x10.util.concurrent;


@x10.runtime.impl.java.X10Generated
public class Condition extends x10.core.Ref implements x10.io.Unserializable, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Condition> $RTT = 
        x10.rtt.NamedType.<Condition> make("x10.util.concurrent.Condition",
                                           Condition.class,
                                           new x10.rtt.Type[] {
                                               x10.io.Unserializable.$RTT
                                           });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        throw new x10.io.NotSerializableException("Can't serialize x10.util.concurrent.Condition");
    }
    
    // constructor just for allocation
    public Condition(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 13 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Condition.x10"
    public x10.core.concurrent.Condition __NATIVE_FIELD__;
    
    
    //#line 13 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Condition.x10"
    public Condition(final x10.core.concurrent.Condition id0) {
         {
            
            //#line 13 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Condition.x10"
            this.__NATIVE_FIELD__ = id0;
        }
    }
    
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Condition.x10"
    public Condition() {
         {
            
            //#line 13 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Condition.x10"
            this.__NATIVE_FIELD__ = new x10.core.concurrent.Condition((java.lang.System[]) null).x10$core$concurrent$Condition$$init$S();
        }
    }
    
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Condition.x10"
    public void release() {
        
        //#line 13 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Condition.x10"
        final x10.core.concurrent.Condition t$145448 = this.__NATIVE_FIELD__;
        
        //#line 13 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Condition.x10"
        t$145448.release();
    }
    
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Condition.x10"
    public void await() {
        
        //#line 13 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Condition.x10"
        final x10.core.concurrent.Condition t$145449 = this.__NATIVE_FIELD__;
        
        //#line 13 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Condition.x10"
        t$145449.await();
    }
    
    
    //#line 11 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Condition.x10"
    final public x10.util.concurrent.Condition x10$util$concurrent$Condition$$this$x10$util$concurrent$Condition() {
        
        //#line 11 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Condition.x10"
        return x10.util.concurrent.Condition.this;
    }
    
    
    //#line 11 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Condition.x10"
    final public void __fieldInitializers_x10_util_concurrent_Condition() {
        
    }
}

