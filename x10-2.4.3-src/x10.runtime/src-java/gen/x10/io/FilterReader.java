package x10.io;

@x10.runtime.impl.java.X10Generated
public class FilterReader extends x10.io.Reader implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<FilterReader> $RTT = 
        x10.rtt.NamedType.<FilterReader> make("x10.io.FilterReader",
                                              FilterReader.class,
                                              new x10.rtt.Type[] {
                                                  x10.io.Reader.$RTT
                                              });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.FilterReader $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.io.Reader.$_deserialize_body($_obj, $deserializer);
        $_obj.r = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.io.FilterReader $_obj = new x10.io.FilterReader((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.r);
        
    }
    
    // constructor just for allocation
    public FilterReader(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
    public x10.io.Reader r;
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
    public x10.io.Reader inner() {
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
        final x10.io.Reader t$90240 = ((x10.io.Reader)(r));
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
        return t$90240;
    }
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
    // creation method for java code (1-phase java constructor)
    public FilterReader(final x10.io.Reader r) {
        this((java.lang.System[]) null);
        x10$io$FilterReader$$init$S(r);
    }
    
    // constructor for non-virtual call
    final public x10.io.FilterReader x10$io$FilterReader$$init$S(final x10.io.Reader r) {
         {
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
            final x10.io.Reader this$90233 = this;
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
            
            
            //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
            final x10.io.FilterReader this$90252 = this;
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
            this.r = ((x10.io.Reader)(r));
        }
        return this;
    }
    
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
    public void close() {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
        final x10.io.Reader t$90241 = ((x10.io.Reader)(r));
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
        t$90241.close();
    }
    
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
    public byte read$O() {
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
        final x10.io.Reader t$90242 = ((x10.io.Reader)(r));
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
        final byte t$90243 = t$90242.read$O();
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
        return t$90243;
    }
    
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
    public void read__0$1x10$lang$Byte$2(final x10.core.Rail r, final long off, final long len) {
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
        final x10.io.Reader t$90244 = ((x10.io.Reader)(this.r));
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
        t$90244.read__0$1x10$lang$Byte$2(((x10.core.Rail)(r)), (long)(off), (long)(len));
    }
    
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
    public int available$O() {
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
        final x10.io.Reader t$90245 = ((x10.io.Reader)(r));
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
        final int t$90246 = t$90245.available$O();
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
        return t$90246;
    }
    
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
    public void skip(final long off) {
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
        final x10.io.Reader t$90247 = ((x10.io.Reader)(r));
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
        t$90247.skip((long)(off));
    }
    
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
    public void mark(final int off) {
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
        final x10.io.Reader t$90248 = ((x10.io.Reader)(r));
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
        t$90248.mark((int)(off));
    }
    
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
    public void reset() {
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
        final x10.io.Reader t$90249 = ((x10.io.Reader)(r));
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
        t$90249.reset();
    }
    
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
    public boolean markSupported$O() {
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
        final x10.io.Reader t$90250 = ((x10.io.Reader)(r));
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
        final boolean t$90251 = t$90250.markSupported$O();
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
        return t$90251;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
    final public x10.io.FilterReader x10$io$FilterReader$$this$x10$io$FilterReader() {
        
        //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
        return x10.io.FilterReader.this;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
    final public void __fieldInitializers_x10_io_FilterReader() {
        
    }
}

