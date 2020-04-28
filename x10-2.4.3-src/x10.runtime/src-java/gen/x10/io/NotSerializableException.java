package x10.io;

@x10.runtime.impl.java.X10Generated
public class NotSerializableException extends x10.io.IOException implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<NotSerializableException> $RTT = 
        x10.rtt.NamedType.<NotSerializableException> make("x10.io.NotSerializableException",
                                                          NotSerializableException.class,
                                                          new x10.rtt.Type[] {
                                                              x10.io.IOException.$RTT
                                                          });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.NotSerializableException $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.io.IOException.$_deserialize_body($_obj, $deserializer);
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.io.NotSerializableException $_obj = new x10.io.NotSerializableException((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        
    }
    
    // constructor just for allocation
    public NotSerializableException(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/NotSerializableException.x10"
    public NotSerializableException() {
        super();
         {
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/NotSerializableException.x10"
            
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/NotSerializableException.x10"
            this.__fieldInitializers_x10_io_NotSerializableException();
        }
    }
    
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/NotSerializableException.x10"
    public NotSerializableException(final java.lang.String message) {
        super(((java.lang.String)(message)));
         {
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/NotSerializableException.x10"
            
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/NotSerializableException.x10"
            this.__fieldInitializers_x10_io_NotSerializableException();
        }
    }
    
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/NotSerializableException.x10"
    final public x10.io.NotSerializableException x10$io$NotSerializableException$$this$x10$io$NotSerializableException() {
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/NotSerializableException.x10"
        return x10.io.NotSerializableException.this;
    }
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/NotSerializableException.x10"
    final public void __fieldInitializers_x10_io_NotSerializableException() {
        
    }
}

