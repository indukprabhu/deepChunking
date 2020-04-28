package x10.lang;

@x10.runtime.impl.java.X10Generated
public class WrappedThrowable extends java.lang.RuntimeException implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<WrappedThrowable> $RTT = 
        x10.rtt.NamedType.<WrappedThrowable> make("x10.lang.WrappedThrowable",
                                                  WrappedThrowable.class,
                                                  new x10.rtt.Type[] {
                                                      x10.rtt.Types.EXCEPTION
                                                  });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.WrappedThrowable $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $deserializer.deserializeFieldsStartingFromClass(java.lang.RuntimeException.class, $_obj, 0);
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.WrappedThrowable $_obj = new x10.lang.WrappedThrowable((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.serializeFieldsStartingFromClass(this, java.lang.RuntimeException.class);
        
    }
    
    // constructor just for allocation
    public WrappedThrowable(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/WrappedThrowable.x10"
    public WrappedThrowable() {
        super();
         {
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/WrappedThrowable.x10"
            
            
            //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/WrappedThrowable.x10"
            this.__fieldInitializers_x10_lang_WrappedThrowable();
        }
    }
    
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/WrappedThrowable.x10"
    public WrappedThrowable(final java.lang.Throwable cause) {
        super(((java.lang.Throwable)(cause)));
         {
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/WrappedThrowable.x10"
            
            
            //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/WrappedThrowable.x10"
            this.__fieldInitializers_x10_lang_WrappedThrowable();
        }
    }
    
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/WrappedThrowable.x10"
    public WrappedThrowable(final java.lang.String message, final java.lang.Throwable cause) {
        super(((java.lang.String)(message)), ((java.lang.Throwable)(cause)));
         {
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/WrappedThrowable.x10"
            
            
            //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/WrappedThrowable.x10"
            this.__fieldInitializers_x10_lang_WrappedThrowable();
        }
    }
    
    
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/WrappedThrowable.x10"
    final public x10.lang.WrappedThrowable x10$lang$WrappedThrowable$$this$x10$lang$WrappedThrowable() {
        
        //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/WrappedThrowable.x10"
        return x10.lang.WrappedThrowable.this;
    }
    
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/WrappedThrowable.x10"
    final public void __fieldInitializers_x10_lang_WrappedThrowable() {
        
    }
}

