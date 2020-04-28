package x10.io;


@x10.runtime.impl.java.X10Generated
final public class Serializer extends x10.core.Ref implements x10.io.Unserializable, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Serializer> $RTT = 
        x10.rtt.NamedType.<Serializer> make("x10.io.Serializer",
                                            Serializer.class,
                                            new x10.rtt.Type[] {
                                                x10.io.Unserializable.$RTT
                                            });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        throw new x10.io.NotSerializableException("Can't serialize x10.io.Serializer");
    }
    
    // constructor just for allocation
    public Serializer(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
    public x10.serialization.X10JavaSerializer __NATIVE_FIELD__;
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
    public Serializer(final x10.serialization.X10JavaSerializer id0) {
         {
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
            this.__NATIVE_FIELD__ = id0;
        }
    }
    
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
    public Serializer() {
         {
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
            this.__NATIVE_FIELD__ = new x10.serialization.X10JavaSerializer((java.lang.System[]) null).x10$serialization$X10JavaSerializer$$init$S();
        }
    }
    
    
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
    public Serializer(final x10.io.OutputStreamWriter o) {
         {
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
            this.__NATIVE_FIELD__ = new x10.serialization.X10JavaSerializer((java.lang.System[]) null).x10$serialization$X10JavaSerializer$$init$S(o);
        }
    }
    
    
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
    public void writeAny(final java.lang.Object v) {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
        final x10.serialization.X10JavaSerializer t$91380 = this.__NATIVE_FIELD__;
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
        t$91380.writeAny(((java.lang.Object)(v)));
    }
    
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
    public x10.core.Rail toRail() {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
        final x10.serialization.X10JavaSerializer t$91381 = this.__NATIVE_FIELD__;
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
        final x10.core.Rail t$91382 = t$91381.toRail();
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
        return t$91382;
    }
    
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
    public int dataBytesWritten$O() {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
        final x10.serialization.X10JavaSerializer t$91383 = this.__NATIVE_FIELD__;
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
        final int t$91384 = t$91383.dataBytesWritten$O();
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
        return t$91384;
    }
    
    
    //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
    public void newObjectGraph() {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
        final x10.serialization.X10JavaSerializer t$91385 = this.__NATIVE_FIELD__;
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
        t$91385.newObjectGraph();
    }
    
    
    //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
    public void addDeserializeCount(final long extraCount) {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
        final x10.serialization.X10JavaSerializer t$91386 = this.__NATIVE_FIELD__;
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
        t$91386.addDeserializeCount((long)(extraCount));
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
    final public x10.io.Serializer x10$io$Serializer$$this$x10$io$Serializer() {
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
        return x10.io.Serializer.this;
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
    final public void __fieldInitializers_x10_io_Serializer() {
        
    }
}

