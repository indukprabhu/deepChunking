package x10.lang;

@x10.runtime.impl.java.X10Generated
public class ExceptionInInitializer extends java.lang.RuntimeException implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<ExceptionInInitializer> $RTT = 
        x10.rtt.NamedType.<ExceptionInInitializer> make("x10.lang.ExceptionInInitializer",
                                                        ExceptionInInitializer.class,
                                                        new x10.rtt.Type[] {
                                                            x10.rtt.Types.EXCEPTION
                                                        });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.ExceptionInInitializer $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $deserializer.deserializeFieldsStartingFromClass(java.lang.RuntimeException.class, $_obj, 0);
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.ExceptionInInitializer $_obj = new x10.lang.ExceptionInInitializer((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.serializeFieldsStartingFromClass(this, java.lang.RuntimeException.class);
        
    }
    
    // constructor just for allocation
    public ExceptionInInitializer(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ExceptionInInitializer.x10"
    public ExceptionInInitializer() {
        super(((java.lang.String)("exception in static field initialization")));
         {
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ExceptionInInitializer.x10"
            
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ExceptionInInitializer.x10"
            this.__fieldInitializers_x10_lang_ExceptionInInitializer();
        }
    }
    
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ExceptionInInitializer.x10"
    public ExceptionInInitializer(final java.lang.String message) {
        super(((java.lang.String)(message)));
         {
            
            //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ExceptionInInitializer.x10"
            
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ExceptionInInitializer.x10"
            this.__fieldInitializers_x10_lang_ExceptionInInitializer();
        }
    }
    
    
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ExceptionInInitializer.x10"
    public ExceptionInInitializer(final java.lang.String message, final java.lang.Throwable cause) {
        super(((java.lang.String)(message)), ((java.lang.Throwable)(cause)));
         {
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ExceptionInInitializer.x10"
            
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ExceptionInInitializer.x10"
            this.__fieldInitializers_x10_lang_ExceptionInInitializer();
        }
    }
    
    
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ExceptionInInitializer.x10"
    public ExceptionInInitializer(final java.lang.Throwable cause) {
        super(((java.lang.Throwable)(cause)));
         {
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ExceptionInInitializer.x10"
            
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ExceptionInInitializer.x10"
            this.__fieldInitializers_x10_lang_ExceptionInInitializer();
        }
    }
    
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ExceptionInInitializer.x10"
    final public x10.lang.ExceptionInInitializer x10$lang$ExceptionInInitializer$$this$x10$lang$ExceptionInInitializer() {
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ExceptionInInitializer.x10"
        return x10.lang.ExceptionInInitializer.this;
    }
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ExceptionInInitializer.x10"
    final public void __fieldInitializers_x10_lang_ExceptionInInitializer() {
        
    }
}

