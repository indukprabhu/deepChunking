package x10.lang;

@x10.runtime.impl.java.X10Generated
public class BadPlaceException extends java.lang.RuntimeException implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<BadPlaceException> $RTT = 
        x10.rtt.NamedType.<BadPlaceException> make("x10.lang.BadPlaceException",
                                                   BadPlaceException.class,
                                                   new x10.rtt.Type[] {
                                                       x10.rtt.Types.EXCEPTION
                                                   });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.BadPlaceException $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $deserializer.deserializeFieldsStartingFromClass(java.lang.RuntimeException.class, $_obj, 0);
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.BadPlaceException $_obj = new x10.lang.BadPlaceException((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.serializeFieldsStartingFromClass(this, java.lang.RuntimeException.class);
        
    }
    
    // constructor just for allocation
    public BadPlaceException(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/BadPlaceException.x10"
    public BadPlaceException() {
        super((("bad place exception at ") + (x10.lang.Place.place(x10.x10rt.X10RT.here()))));
         {
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/BadPlaceException.x10"
            
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/BadPlaceException.x10"
            this.__fieldInitializers_x10_lang_BadPlaceException();
        }
    }
    
    
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/BadPlaceException.x10"
    public BadPlaceException(final java.lang.String message) {
        super(((java.lang.String)(message)));
         {
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/BadPlaceException.x10"
            
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/BadPlaceException.x10"
            this.__fieldInitializers_x10_lang_BadPlaceException();
        }
    }
    
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/BadPlaceException.x10"
    final public x10.lang.BadPlaceException x10$lang$BadPlaceException$$this$x10$lang$BadPlaceException() {
        
        //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/BadPlaceException.x10"
        return x10.lang.BadPlaceException.this;
    }
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/BadPlaceException.x10"
    final public void __fieldInitializers_x10_lang_BadPlaceException() {
        
    }
}

