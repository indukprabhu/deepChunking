package x10.lang;

@x10.runtime.impl.java.X10Generated
public class Empty extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Empty> $RTT = 
        x10.rtt.NamedType.<Empty> make("x10.lang.Empty",
                                       Empty.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.Empty $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.Empty $_obj = new x10.lang.Empty((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Empty(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Empty.x10"
    final public x10.lang.Empty x10$lang$Empty$$this$x10$lang$Empty() {
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Empty.x10"
        return x10.lang.Empty.this;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Empty.x10"
    // creation method for java code (1-phase java constructor)
    public Empty() {
        this((java.lang.System[]) null);
        x10$lang$Empty$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.lang.Empty x10$lang$Empty$$init$S() {
         {
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Empty.x10"
            
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Empty.x10"
            final x10.lang.Empty this$97714 = this;
        }
        return this;
    }
    
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Empty.x10"
    final public void __fieldInitializers_x10_lang_Empty() {
        
    }
}

