package x10.regionarray;

@x10.runtime.impl.java.X10Generated
public class UnboundedRegionException extends java.lang.RuntimeException implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<UnboundedRegionException> $RTT = 
        x10.rtt.NamedType.<UnboundedRegionException> make("x10.regionarray.UnboundedRegionException",
                                                          UnboundedRegionException.class,
                                                          new x10.rtt.Type[] {
                                                              x10.rtt.Types.EXCEPTION
                                                          });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.UnboundedRegionException $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $deserializer.deserializeFieldsStartingFromClass(java.lang.RuntimeException.class, $_obj, 0);
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.UnboundedRegionException $_obj = new x10.regionarray.UnboundedRegionException((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.serializeFieldsStartingFromClass(this, java.lang.RuntimeException.class);
        
    }
    
    // constructor just for allocation
    public UnboundedRegionException(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UnboundedRegionException.x10"
    public UnboundedRegionException(final java.lang.String msg) {
        super(((java.lang.String)(msg)));
         {
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UnboundedRegionException.x10"
            
            
            //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UnboundedRegionException.x10"
            this.__fieldInitializers_x10_regionarray_UnboundedRegionException();
        }
    }
    
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UnboundedRegionException.x10"
    public UnboundedRegionException() {
        super();
         {
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UnboundedRegionException.x10"
            
            
            //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UnboundedRegionException.x10"
            this.__fieldInitializers_x10_regionarray_UnboundedRegionException();
        }
    }
    
    
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UnboundedRegionException.x10"
    final public x10.regionarray.UnboundedRegionException x10$regionarray$UnboundedRegionException$$this$x10$regionarray$UnboundedRegionException() {
        
        //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UnboundedRegionException.x10"
        return x10.regionarray.UnboundedRegionException.this;
    }
    
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UnboundedRegionException.x10"
    final public void __fieldInitializers_x10_regionarray_UnboundedRegionException() {
        
    }
}

