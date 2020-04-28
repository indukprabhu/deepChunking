package x10.io;

@x10.runtime.impl.java.X10Generated
public class FilterWriter extends x10.io.Writer implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<FilterWriter> $RTT = 
        x10.rtt.NamedType.<FilterWriter> make("x10.io.FilterWriter",
                                              FilterWriter.class,
                                              new x10.rtt.Type[] {
                                                  x10.io.Writer.$RTT
                                              });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.FilterWriter $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.io.Writer.$_deserialize_body($_obj, $deserializer);
        $_obj.w = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.io.FilterWriter $_obj = new x10.io.FilterWriter((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.w);
        
    }
    
    // constructor just for allocation
    public FilterWriter(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
    public x10.io.Writer w;
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
    public x10.io.Writer inner() {
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
        final x10.io.Writer t$90260 = ((x10.io.Writer)(w));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
        return t$90260;
    }
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
    // creation method for java code (1-phase java constructor)
    public FilterWriter(final x10.io.Writer w) {
        this((java.lang.System[]) null);
        x10$io$FilterWriter$$init$S(w);
    }
    
    // constructor for non-virtual call
    final public x10.io.FilterWriter x10$io$FilterWriter$$init$S(final x10.io.Writer w) {
         {
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
            final x10.io.Writer this$90253 = this;
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
            
            
            //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
            final x10.io.FilterWriter this$90266 = this;
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
            this.w = ((x10.io.Writer)(w));
        }
        return this;
    }
    
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
    public void close() {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
        final x10.io.Writer t$90261 = ((x10.io.Writer)(w));
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
        t$90261.close();
    }
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
    public void flush() {
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
        final x10.io.Writer t$90262 = ((x10.io.Writer)(w));
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
        t$90262.flush();
    }
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
    public void write(final byte b) {
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
        final x10.io.Writer t$90263 = ((x10.io.Writer)(w));
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
        t$90263.write((byte)(b));
    }
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
    public void write(final java.lang.String s) {
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
        final x10.io.Writer t$90264 = ((x10.io.Writer)(w));
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
        t$90264.write(((java.lang.String)(s)));
    }
    
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
    public void write__0$1x10$lang$Byte$2(final x10.core.Rail x, final long off, final long len) {
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
        final x10.io.Writer t$90265 = ((x10.io.Writer)(w));
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
        t$90265.write__0$1x10$lang$Byte$2(((x10.core.Rail)(x)), (long)(off), (long)(len));
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
    final public x10.io.FilterWriter x10$io$FilterWriter$$this$x10$io$FilterWriter() {
        
        //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
        return x10.io.FilterWriter.this;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
    final public void __fieldInitializers_x10_io_FilterWriter() {
        
    }
}

