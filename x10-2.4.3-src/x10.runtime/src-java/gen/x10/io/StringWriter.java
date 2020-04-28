package x10.io;


@x10.runtime.impl.java.X10Generated
public class StringWriter extends x10.io.Writer implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<StringWriter> $RTT = 
        x10.rtt.NamedType.<StringWriter> make("x10.io.StringWriter",
                                              StringWriter.class,
                                              new x10.rtt.Type[] {
                                                  x10.io.Writer.$RTT
                                              });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.StringWriter $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.io.Writer.$_deserialize_body($_obj, $deserializer);
        $_obj.b = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.io.StringWriter $_obj = new x10.io.StringWriter((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.b);
        
    }
    
    // constructor just for allocation
    public StringWriter(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
    public x10.util.StringBuilder b;
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
    // creation method for java code (1-phase java constructor)
    public StringWriter() {
        this((java.lang.System[]) null);
        x10$io$StringWriter$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.io.StringWriter x10$io$StringWriter$$init$S() {
         {
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
            final x10.io.Writer this$91409 = this;
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
            
            
            //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
            final x10.io.StringWriter this$91433 = this;
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
            final x10.util.StringBuilder alloc$91408 = ((x10.util.StringBuilder)(new x10.util.StringBuilder((java.lang.System[]) null)));
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
            alloc$91408.x10$util$StringBuilder$$init$S();
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
            this.b = ((x10.util.StringBuilder)(alloc$91408));
        }
        return this;
    }
    
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
    public void write(final byte x) {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
        final x10.util.StringBuilder t$91416 = ((x10.util.StringBuilder)(b));
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
        final char t$91417 = ((char) (((byte)(x))));
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
        t$91416.add((char)(t$91417));
    }
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
    public void write(final java.lang.String s) {
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
        final x10.util.StringBuilder t$91418 = ((x10.util.StringBuilder)(b));
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
        t$91418.addString(((java.lang.String)(s)));
    }
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
    public void write__0$1x10$lang$Byte$2(final x10.core.Rail x, final long off, final long len) {
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
        long i = off;
        {
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
            final byte[] x$value$91440 = ((byte[])x.value);
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
            for (;
                 true;
                 ) {
                
                //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
                final long t$91420 = i;
                
                //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
                final long t$91421 = ((off) + (((long)(len))));
                
                //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
                final boolean t$91428 = ((t$91420) < (((long)(t$91421))));
                
                //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
                if (!(t$91428)) {
                    
                    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
                    break;
                }
                
                //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
                final x10.util.StringBuilder t$91434 = ((x10.util.StringBuilder)(b));
                
                //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
                final long t$91435 = i;
                
                //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
                final byte t$91436 = ((byte)x$value$91440[(int)t$91435]);
                
                //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
                final char t$91437 = ((char) (((byte)(t$91436))));
                
                //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
                t$91434.add((char)(t$91437));
                
                //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
                final long t$91438 = i;
                
                //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
                final long t$91439 = ((t$91438) + (((long)(1L))));
                
                //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
                i = t$91439;
            }
        }
    }
    
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
    public long size$O() {
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
        final x10.util.StringBuilder t$91429 = ((x10.util.StringBuilder)(b));
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
        final long t$91430 = t$91429.length();
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
        return t$91430;
    }
    
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
    public java.lang.String result() {
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
        final x10.util.StringBuilder t$91431 = ((x10.util.StringBuilder)(b));
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
        final java.lang.String t$91432 = t$91431.result();
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
        return t$91432;
    }
    
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
    public void flush() {
        
    }
    
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
    public void close() {
        
    }
    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
    final public x10.io.StringWriter x10$io$StringWriter$$this$x10$io$StringWriter() {
        
        //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
        return x10.io.StringWriter.this;
    }
    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
    final public void __fieldInitializers_x10_io_StringWriter() {
        
    }
}

