package x10.util.concurrent;


@x10.runtime.impl.java.X10Generated
public class Fences extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Fences> $RTT = 
        x10.rtt.NamedType.<Fences> make("x10.util.concurrent.Fences",
                                        Fences.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.concurrent.Fences $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.concurrent.Fences $_obj = new x10.util.concurrent.Fences((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Fences(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Fences.x10"
    public static void loadLoadBarrier() {
        try {
            x10.runtime.impl.java.FencesUtils.loadLoadBarrier();
        }
        catch (java.lang.Throwable exc$146471) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146471);
        }
        
    }
    
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Fences.x10"
    public static void loadStoreBarrier() {
        try {
            x10.runtime.impl.java.FencesUtils.loadStoreBarrier();
        }
        catch (java.lang.Throwable exc$146472) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146472);
        }
        
    }
    
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Fences.x10"
    public static void storeLoadBarrier() {
        try {
            x10.runtime.impl.java.FencesUtils.storeLoadBarrier();
        }
        catch (java.lang.Throwable exc$146473) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146473);
        }
        
    }
    
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Fences.x10"
    public static void storeStoreBarrier() {
        try {
            x10.runtime.impl.java.FencesUtils.storeStoreBarrier();
        }
        catch (java.lang.Throwable exc$146474) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146474);
        }
        
    }
    
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Fences.x10"
    final public x10.util.concurrent.Fences x10$util$concurrent$Fences$$this$x10$util$concurrent$Fences() {
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Fences.x10"
        return x10.util.concurrent.Fences.this;
    }
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Fences.x10"
    // creation method for java code (1-phase java constructor)
    public Fences() {
        this((java.lang.System[]) null);
        x10$util$concurrent$Fences$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.util.concurrent.Fences x10$util$concurrent$Fences$$init$S() {
         {
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Fences.x10"
            
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Fences.x10"
            final x10.util.concurrent.Fences this$145450 = this;
        }
        return this;
    }
    
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Fences.x10"
    final public void __fieldInitializers_x10_util_concurrent_Fences() {
        
    }
}

