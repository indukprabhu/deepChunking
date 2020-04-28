package x10.io;


@x10.runtime.impl.java.X10Generated
final public class Deserializer extends x10.core.Ref implements x10.io.Unserializable, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Deserializer> $RTT = 
        x10.rtt.NamedType.<Deserializer> make("x10.io.Deserializer",
                                              Deserializer.class,
                                              new x10.rtt.Type[] {
                                                  x10.io.Unserializable.$RTT
                                              });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        throw new x10.io.NotSerializableException("Can't serialize x10.io.Deserializer");
    }
    
    // constructor just for allocation
    public Deserializer(final java.lang.System[] $dummy) {
        
    }
    
    // synthetic type for parameter mangling
    public static final class __0$1x10$lang$Byte$2 {}
    

    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Deserializer.x10"
    public x10.serialization.X10JavaDeserializer __NATIVE_FIELD__;
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Deserializer.x10"
    public Deserializer(final x10.serialization.X10JavaDeserializer id0) {
         {
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Deserializer.x10"
            this.__NATIVE_FIELD__ = id0;
        }
    }
    
    
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Deserializer.x10"
    public Deserializer(final x10.io.Serializer s) {
         {
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Deserializer.x10"
            this.__NATIVE_FIELD__ = new x10.serialization.X10JavaDeserializer((java.lang.System[]) null).x10$serialization$X10JavaDeserializer$$init$S(s);
        }
    }
    
    
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Deserializer.x10"
    public Deserializer(final x10.core.Rail<x10.core.Byte> r, __0$1x10$lang$Byte$2 $dummy) {
         {
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Deserializer.x10"
            this.__NATIVE_FIELD__ = new x10.serialization.X10JavaDeserializer((java.lang.System[]) null).x10$serialization$X10JavaDeserializer$$init$S(r, (x10.io.Deserializer.__0$1x10$lang$Byte$2) null);
        }
    }
    
    
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Deserializer.x10"
    public Deserializer(final x10.io.InputStreamReader i) {
         {
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Deserializer.x10"
            this.__NATIVE_FIELD__ = new x10.serialization.X10JavaDeserializer((java.lang.System[]) null).x10$serialization$X10JavaDeserializer$$init$S(i);
        }
    }
    
    
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Deserializer.x10"
    public java.lang.Object readAny() {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Deserializer.x10"
        final x10.serialization.X10JavaDeserializer t$89986 = this.__NATIVE_FIELD__;
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Deserializer.x10"
        final java.lang.Object t$89987 = t$89986.readAny();
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Deserializer.x10"
        return t$89987;
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Deserializer.x10"
    final public x10.io.Deserializer x10$io$Deserializer$$this$x10$io$Deserializer() {
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Deserializer.x10"
        return x10.io.Deserializer.this;
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Deserializer.x10"
    final public void __fieldInitializers_x10_io_Deserializer() {
        
    }
}

