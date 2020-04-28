package x10.io;


@x10.runtime.impl.java.X10Generated
public class OutputStreamWriter extends x10.io.Writer implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<OutputStreamWriter> $RTT = 
        x10.rtt.NamedType.<OutputStreamWriter> make("x10.io.OutputStreamWriter",
                                                    OutputStreamWriter.class,
                                                    new x10.rtt.Type[] {
                                                        x10.io.Writer.$RTT
                                                    });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.OutputStreamWriter $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.io.Writer.$_deserialize_body($_obj, $deserializer);
        $_obj.out = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.io.OutputStreamWriter $_obj = new x10.io.OutputStreamWriter((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.out);
        
    }
    
    // constructor just for allocation
    public OutputStreamWriter(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
    ;
    
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
    public x10.core.io.OutputStream out;
    
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
    public x10.core.io.OutputStream stream() {
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
        final x10.core.io.OutputStream t$91116 = ((x10.core.io.OutputStream)(out));
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
        return t$91116;
    }
    
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
    // creation method for java code (1-phase java constructor)
    public OutputStreamWriter(final x10.core.io.OutputStream out) {
        this((java.lang.System[]) null);
        x10$io$OutputStreamWriter$$init$S(out);
    }
    
    // constructor for non-virtual call
    final public x10.io.OutputStreamWriter x10$io$OutputStreamWriter$$init$S(final x10.core.io.OutputStream out) {
         {
            
            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
            final x10.io.Writer this$91109 = this;
            
            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
            
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
            final x10.io.OutputStreamWriter this$91123 = this;
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
            this.out = ((x10.core.io.OutputStream)(out));
        }
        return this;
    }
    
    
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
    public void flush() {
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
        final x10.core.io.OutputStream t$91117 = ((x10.core.io.OutputStream)(out));
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
        t$91117.flush();
    }
    
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
    public void close() {
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
        final x10.core.io.OutputStream t$91118 = ((x10.core.io.OutputStream)(out));
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
        t$91118.close();
    }
    
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
    public void write(final byte x) {
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
        final x10.core.io.OutputStream t$91119 = ((x10.core.io.OutputStream)(out));
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
        final int t$91120 = ((int)(byte)(((byte)(x))));
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
        t$91119.write((int)(t$91120));
    }
    
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
    public void write(final java.lang.String s) {
        
        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
        final x10.core.io.OutputStream t$91121 = ((x10.core.io.OutputStream)(out));
        
        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
        t$91121.write(((java.lang.String)(s)));
    }
    
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
    public void write__0$1x10$lang$Byte$2(final x10.core.Rail buf, final long off, final long len) {
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
        final x10.core.io.OutputStream t$91122 = ((x10.core.io.OutputStream)(out));
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
        t$91122.write__0$1x10$lang$Byte$2(((x10.core.Rail)(buf)), (long)(off), (long)(len));
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
    final public x10.io.OutputStreamWriter x10$io$OutputStreamWriter$$this$x10$io$OutputStreamWriter() {
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
        return x10.io.OutputStreamWriter.this;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
    final public void __fieldInitializers_x10_io_OutputStreamWriter() {
        
    }
}

