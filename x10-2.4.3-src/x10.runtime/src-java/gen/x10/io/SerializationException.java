package x10.io;

@x10.runtime.impl.java.X10Generated
public class SerializationException extends java.lang.RuntimeException implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<SerializationException> $RTT = 
        x10.rtt.NamedType.<SerializationException> make("x10.io.SerializationException",
                                                        SerializationException.class,
                                                        new x10.rtt.Type[] {
                                                            x10.rtt.Types.EXCEPTION
                                                        });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.SerializationException $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $deserializer.deserializeFieldsStartingFromClass(java.lang.RuntimeException.class, $_obj, 0);
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.io.SerializationException $_obj = new x10.io.SerializationException((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.serializeFieldsStartingFromClass(this, java.lang.RuntimeException.class);
        
    }
    
    // constructor just for allocation
    public SerializationException(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/SerializationException.x10"
    public SerializationException() {
        super();
         {
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/SerializationException.x10"
            
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/SerializationException.x10"
            this.__fieldInitializers_x10_io_SerializationException();
        }
    }
    
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/SerializationException.x10"
    public SerializationException(final java.lang.Throwable cause) {
        super(((java.lang.Throwable)(cause)));
         {
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/SerializationException.x10"
            
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/SerializationException.x10"
            this.__fieldInitializers_x10_io_SerializationException();
        }
    }
    
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/SerializationException.x10"
    public SerializationException(final java.lang.String message) {
        super(((java.lang.String)(message)));
         {
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/SerializationException.x10"
            
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/SerializationException.x10"
            this.__fieldInitializers_x10_io_SerializationException();
        }
    }
    
    
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/SerializationException.x10"
    public SerializationException(final java.lang.String message, final java.lang.Throwable cause) {
        super(((java.lang.String)(message)), ((java.lang.Throwable)(cause)));
         {
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/SerializationException.x10"
            
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/SerializationException.x10"
            this.__fieldInitializers_x10_io_SerializationException();
        }
    }
    
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/SerializationException.x10"
    final public x10.io.SerializationException x10$io$SerializationException$$this$x10$io$SerializationException() {
        
        //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/SerializationException.x10"
        return x10.io.SerializationException.this;
    }
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/SerializationException.x10"
    final public void __fieldInitializers_x10_io_SerializationException() {
        
    }
}

