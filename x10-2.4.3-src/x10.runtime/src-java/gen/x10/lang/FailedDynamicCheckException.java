package x10.lang;

@x10.runtime.impl.java.X10Generated
public class FailedDynamicCheckException extends java.lang.ClassCastException implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<FailedDynamicCheckException> $RTT = 
        x10.rtt.NamedType.<FailedDynamicCheckException> make("x10.lang.FailedDynamicCheckException",
                                                             FailedDynamicCheckException.class,
                                                             new x10.rtt.Type[] {
                                                                 x10.rtt.Types.CLASS_CAST_EXCEPTION
                                                             });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.FailedDynamicCheckException $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $deserializer.deserializeFieldsStartingFromClass(java.lang.ClassCastException.class, $_obj, 0);
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.FailedDynamicCheckException $_obj = new x10.lang.FailedDynamicCheckException((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.serializeFieldsStartingFromClass(this, java.lang.ClassCastException.class);
        
    }
    
    // constructor just for allocation
    public FailedDynamicCheckException(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FailedDynamicCheckException.x10"
    public FailedDynamicCheckException() {
        super();
         {
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FailedDynamicCheckException.x10"
            
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FailedDynamicCheckException.x10"
            this.__fieldInitializers_x10_lang_FailedDynamicCheckException();
        }
    }
    
    
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FailedDynamicCheckException.x10"
    public FailedDynamicCheckException(final java.lang.String message) {
        super(((java.lang.String)(message)));
         {
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FailedDynamicCheckException.x10"
            
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FailedDynamicCheckException.x10"
            this.__fieldInitializers_x10_lang_FailedDynamicCheckException();
        }
    }
    
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FailedDynamicCheckException.x10"
    final public x10.lang.FailedDynamicCheckException x10$lang$FailedDynamicCheckException$$this$x10$lang$FailedDynamicCheckException() {
        
        //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FailedDynamicCheckException.x10"
        return x10.lang.FailedDynamicCheckException.this;
    }
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FailedDynamicCheckException.x10"
    final public void __fieldInitializers_x10_lang_FailedDynamicCheckException() {
        
    }
}

