package x10.compiler;

@x10.runtime.impl.java.X10Generated
public class CompilerFlags extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<CompilerFlags> $RTT = 
        x10.rtt.NamedType.<CompilerFlags> make("x10.compiler.CompilerFlags",
                                               CompilerFlags.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.compiler.CompilerFlags $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.compiler.CompilerFlags $_obj = new x10.compiler.CompilerFlags((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public CompilerFlags(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/CompilerFlags.x10"
    public static boolean checkBounds$O() {
        try {
            return (!true);
        }
        catch (java.lang.Throwable exc$146303) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146303);
        }
        
    }
    
    
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/CompilerFlags.x10"
    public static boolean checkPlace$O() {
        try {
            return (!true);
        }
        catch (java.lang.Throwable exc$146304) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146304);
        }
        
    }
    
    
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/CompilerFlags.x10"
    public static boolean useUnsigned$O() {
        try {
            return true;
        }
        catch (java.lang.Throwable exc$146305) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146305);
        }
        
    }
    
    
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/CompilerFlags.x10"
    public static boolean FALSE$O() {
        try {
            return false;
        }
        catch (java.lang.Throwable exc$146306) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146306);
        }
        
    }
    
    
    
    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/CompilerFlags.x10"
    public static boolean TRUE$O() {
        try {
            return true;
        }
        catch (java.lang.Throwable exc$146307) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146307);
        }
        
    }
    
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/CompilerFlags.x10"
    final public x10.compiler.CompilerFlags x10$compiler$CompilerFlags$$this$x10$compiler$CompilerFlags() {
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/CompilerFlags.x10"
        return x10.compiler.CompilerFlags.this;
    }
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/CompilerFlags.x10"
    // creation method for java code (1-phase java constructor)
    public CompilerFlags() {
        this((java.lang.System[]) null);
        x10$compiler$CompilerFlags$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.compiler.CompilerFlags x10$compiler$CompilerFlags$$init$S() {
         {
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/CompilerFlags.x10"
            
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/CompilerFlags.x10"
            final x10.compiler.CompilerFlags this$77359 = this;
        }
        return this;
    }
    
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/CompilerFlags.x10"
    final public void __fieldInitializers_x10_compiler_CompilerFlags() {
        
    }
}

