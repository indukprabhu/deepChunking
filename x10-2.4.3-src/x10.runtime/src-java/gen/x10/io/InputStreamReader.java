package x10.io;


@x10.runtime.impl.java.X10Generated
public class InputStreamReader extends x10.io.Reader implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<InputStreamReader> $RTT = 
        x10.rtt.NamedType.<InputStreamReader> make("x10.io.InputStreamReader",
                                                   InputStreamReader.class,
                                                   new x10.rtt.Type[] {
                                                       x10.io.Reader.$RTT
                                                   });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.InputStreamReader $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.io.Reader.$_deserialize_body($_obj, $deserializer);
        $_obj.stream = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.io.InputStreamReader $_obj = new x10.io.InputStreamReader((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.stream);
        
    }
    
    // constructor just for allocation
    public InputStreamReader(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
    public x10.core.io.InputStream stream;
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
    ;
    
    
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
    // creation method for java code (1-phase java constructor)
    public InputStreamReader(final x10.core.io.InputStream stream) {
        this((java.lang.System[]) null);
        x10$io$InputStreamReader$$init$S(stream);
    }
    
    // constructor for non-virtual call
    final public x10.io.InputStreamReader x10$io$InputStreamReader$$init$S(final x10.core.io.InputStream stream) {
         {
            
            //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
            final x10.io.Reader this$90267 = this;
            
            //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
            
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
            final x10.io.InputStreamReader this$90288 = this;
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
            this.stream = ((x10.core.io.InputStream)(stream));
        }
        return this;
    }
    
    
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
    public x10.core.io.InputStream stream() {
        
        //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
        final x10.core.io.InputStream t$90274 = ((x10.core.io.InputStream)(stream));
        
        //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
        return t$90274;
    }
    
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
    public void close() {
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
        final x10.core.io.InputStream t$90275 = ((x10.core.io.InputStream)(stream));
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
        t$90275.close();
    }
    
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
    public byte read$O() {
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
        final x10.core.io.InputStream t$90276 = ((x10.core.io.InputStream)(stream));
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
        final int n = t$90276.read$O();
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
        final boolean t$90278 = ((int) n) == ((int) -1);
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
        if (t$90278) {
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
            final x10.io.EOFException t$90277 = ((x10.io.EOFException)(new x10.io.EOFException()));
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
            throw t$90277;
        }
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
        final byte t$90279 = ((byte)(int)(((int)(n))));
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
        return t$90279;
    }
    
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
    public void read__0$1x10$lang$Byte$2(final x10.core.Rail r, final long off, final long len) {
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
        final x10.core.io.InputStream t$90280 = ((x10.core.io.InputStream)(stream));
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
        t$90280.read__0$1x10$lang$Byte$2(((x10.core.Rail)(r)), (long)(off), (long)(len));
    }
    
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
    public int available$O() {
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
        final x10.core.io.InputStream t$90281 = ((x10.core.io.InputStream)(stream));
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
        final int t$90282 = t$90281.available$O();
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
        return t$90282;
    }
    
    
    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
    public void skip(final long off) {
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
        final x10.core.io.InputStream t$90283 = ((x10.core.io.InputStream)(stream));
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
        t$90283.skip((long)(off));
    }
    
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
    public void mark(final int off) {
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
        final x10.core.io.InputStream t$90284 = ((x10.core.io.InputStream)(stream));
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
        t$90284.mark((int)(off));
    }
    
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
    public void reset() {
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
        final x10.core.io.InputStream t$90285 = ((x10.core.io.InputStream)(stream));
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
        t$90285.reset();
    }
    
    
    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
    public boolean markSupported$O() {
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
        final x10.core.io.InputStream t$90286 = ((x10.core.io.InputStream)(stream));
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
        final boolean t$90287 = t$90286.markSupported$O();
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
        return t$90287;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
    final public x10.io.InputStreamReader x10$io$InputStreamReader$$this$x10$io$InputStreamReader() {
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
        return x10.io.InputStreamReader.this;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
    final public void __fieldInitializers_x10_io_InputStreamReader() {
        
    }
}

