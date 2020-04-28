package x10.util;


@x10.runtime.impl.java.X10Generated
public class Timer extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Timer> $RTT = 
        x10.rtt.NamedType.<Timer> make("x10.util.Timer",
                                       Timer.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.Timer $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.Timer $_obj = new x10.util.Timer((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Timer(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Timer.x10"
    public static long milliTime$O() {
        try {
            return java.lang.System.currentTimeMillis();
        }
        catch (java.lang.Throwable exc$146468) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146468);
        }
        
    }
    
    
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Timer.x10"
    public static long nanoTime$O() {
        try {
            return java.lang.System.nanoTime();
        }
        catch (java.lang.Throwable exc$146469) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146469);
        }
        
    }
    
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Timer.x10"
    final public x10.util.Timer x10$util$Timer$$this$x10$util$Timer() {
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Timer.x10"
        return x10.util.Timer.this;
    }
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Timer.x10"
    // creation method for java code (1-phase java constructor)
    public Timer() {
        this((java.lang.System[]) null);
        x10$util$Timer$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.util.Timer x10$util$Timer$$init$S() {
         {
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Timer.x10"
            
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Timer.x10"
            final x10.util.Timer this$144986 = this;
        }
        return this;
    }
    
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Timer.x10"
    final public void __fieldInitializers_x10_util_Timer() {
        
    }
}

