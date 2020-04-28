package x10.lang;

@x10.runtime.impl.java.X10Generated
public class DeadPlaceException extends java.lang.RuntimeException implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<DeadPlaceException> $RTT = 
        x10.rtt.NamedType.<DeadPlaceException> make("x10.lang.DeadPlaceException",
                                                    DeadPlaceException.class,
                                                    new x10.rtt.Type[] {
                                                        x10.rtt.Types.EXCEPTION
                                                    });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.DeadPlaceException $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $deserializer.deserializeFieldsStartingFromClass(java.lang.RuntimeException.class, $_obj, 0);
        $_obj.place = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.DeadPlaceException $_obj = new x10.lang.DeadPlaceException((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.serializeFieldsStartingFromClass(this, java.lang.RuntimeException.class);
        $serializer.write(this.place);
        
    }
    
    // constructor just for allocation
    public DeadPlaceException(final java.lang.System[] $dummy) {
        
    }
    
    
    // properties
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
    public x10.lang.Place place;
    

    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
    public DeadPlaceException() {
        super((("DeadPlaceException at ") + (x10.lang.Place.place(x10.x10rt.X10RT.here()))));
         {
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
            this.place = x10.lang.Place.place(x10.x10rt.X10RT.here());
            
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
            this.__fieldInitializers_x10_lang_DeadPlaceException();
        }
    }
    
    
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
    public DeadPlaceException(final java.lang.String message) {
        super(((java.lang.String)(message)));
         {
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
            this.place = x10.lang.Place.place(x10.x10rt.X10RT.here());
            
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
            this.__fieldInitializers_x10_lang_DeadPlaceException();
        }
    }
    
    
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
    public DeadPlaceException(final x10.lang.Place p) {
        super((("DeadPlaceException at ") + (p)));
         {
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
            this.place = p;
            
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
            this.__fieldInitializers_x10_lang_DeadPlaceException();
        }
    }
    
    
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
    public DeadPlaceException(final x10.lang.Place p, final java.lang.String message) {
        super(((java.lang.String)(message)));
         {
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
            this.place = p;
            
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
            this.__fieldInitializers_x10_lang_DeadPlaceException();
        }
    }
    
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
    final public x10.lang.DeadPlaceException x10$lang$DeadPlaceException$$this$x10$lang$DeadPlaceException() {
        
        //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
        return x10.lang.DeadPlaceException.this;
    }
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
    final public void __fieldInitializers_x10_lang_DeadPlaceException() {
        
    }
}

