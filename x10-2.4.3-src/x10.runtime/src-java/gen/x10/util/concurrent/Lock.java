package x10.util.concurrent;


@x10.runtime.impl.java.X10Generated
public class Lock extends x10.core.Ref implements x10.io.Unserializable, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Lock> $RTT = 
        x10.rtt.NamedType.<Lock> make("x10.util.concurrent.Lock",
                                      Lock.class,
                                      new x10.rtt.Type[] {
                                          x10.io.Unserializable.$RTT
                                      });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        throw new x10.io.NotSerializableException("Can't serialize x10.util.concurrent.Lock");
    }
    
    // constructor just for allocation
    public Lock(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
    public java.util.concurrent.locks.ReentrantLock __NATIVE_FIELD__;
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
    public Lock(final java.util.concurrent.locks.ReentrantLock id0) {
         {
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
            this.__NATIVE_FIELD__ = id0;
        }
    }
    
    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
    public Lock() {
         {
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
            this.__NATIVE_FIELD__ = new java.util.concurrent.locks.ReentrantLock();
        }
    }
    
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
    public void lock() {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
        final java.util.concurrent.locks.ReentrantLock t$145614 = this.__NATIVE_FIELD__;
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
        t$145614.lock();
    }
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
    public boolean tryLock() {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
        final java.util.concurrent.locks.ReentrantLock t$145615 = this.__NATIVE_FIELD__;
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
        final boolean t$145616 = t$145615.tryLock();
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
        return t$145616;
    }
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
    public void unlock() {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
        final java.util.concurrent.locks.ReentrantLock t$145617 = this.__NATIVE_FIELD__;
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
        t$145617.unlock();
    }
    
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
    public int getHoldCount() {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
        final java.util.concurrent.locks.ReentrantLock t$145618 = this.__NATIVE_FIELD__;
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
        final int t$145619 = t$145618.getHoldCount();
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
        return t$145619;
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
    final public x10.util.concurrent.Lock x10$util$concurrent$Lock$$this$x10$util$concurrent$Lock() {
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
        return x10.util.concurrent.Lock.this;
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
    final public void __fieldInitializers_x10_util_concurrent_Lock() {
        
    }
}

