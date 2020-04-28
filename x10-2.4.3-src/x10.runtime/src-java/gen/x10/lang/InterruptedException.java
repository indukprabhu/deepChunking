package x10.lang;


@x10.runtime.impl.java.X10Generated
public class InterruptedException extends java.lang.RuntimeException implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<InterruptedException> $RTT = 
        x10.rtt.NamedType.<InterruptedException> make("x10.lang.InterruptedException",
                                                      InterruptedException.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.Types.EXCEPTION
                                                      });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.InterruptedException $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $deserializer.deserializeFieldsStartingFromClass(java.lang.RuntimeException.class, $_obj, 0);
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.InterruptedException $_obj = new x10.lang.InterruptedException((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.serializeFieldsStartingFromClass(this, java.lang.RuntimeException.class);
        
    }
    
    // constructor just for allocation
    public InterruptedException(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/InterruptedException.x10"
    public InterruptedException() {
        super();
         {
            
            //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/InterruptedException.x10"
            
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/InterruptedException.x10"
            this.__fieldInitializers_x10_lang_InterruptedException();
        }
    }
    
    
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/InterruptedException.x10"
    public InterruptedException(final java.lang.String message) {
        super(((java.lang.String)(message)));
         {
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/InterruptedException.x10"
            
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/InterruptedException.x10"
            this.__fieldInitializers_x10_lang_InterruptedException();
        }
    }
    
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/InterruptedException.x10"
    final public x10.lang.InterruptedException x10$lang$InterruptedException$$this$x10$lang$InterruptedException() {
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/InterruptedException.x10"
        return x10.lang.InterruptedException.this;
    }
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/InterruptedException.x10"
    final public void __fieldInitializers_x10_lang_InterruptedException() {
        
    }
}

