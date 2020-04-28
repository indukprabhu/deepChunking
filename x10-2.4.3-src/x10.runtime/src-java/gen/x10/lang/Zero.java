package x10.lang;


@x10.runtime.impl.java.X10Generated
public class Zero extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Zero> $RTT = 
        x10.rtt.NamedType.<Zero> make("x10.lang.Zero",
                                      Zero.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Zero $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.Zero $_obj = new x10.lang.Zero((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Zero(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Zero.x10"
    public static <$T>$T get$G(final x10.rtt.Type $T) {
        try {
            return ($T) x10.rtt.Types.zeroValue($T);
        }
        catch (java.lang.Throwable exc$146444) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146444);
        }
        
    }
    
    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Zero.x10"
    final public x10.lang.Zero x10$lang$Zero$$this$x10$lang$Zero() {
        
        //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Zero.x10"
        return x10.lang.Zero.this;
    }
    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Zero.x10"
    // creation method for java code (1-phase java constructor)
    public Zero() {
        this((java.lang.System[]) null);
        x10$lang$Zero$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.lang.Zero x10$lang$Zero$$init$S() {
         {
            
            //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Zero.x10"
            
            
            //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Zero.x10"
            final x10.lang.Zero this$114700 = this;
        }
        return this;
    }
    
    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Zero.x10"
    final public void __fieldInitializers_x10_lang_Zero() {
        
    }
}

