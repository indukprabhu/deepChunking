package x10.io;


@x10.runtime.impl.java.X10Generated
public class PutbackReader extends x10.io.FilterReader implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<PutbackReader> $RTT = 
        x10.rtt.NamedType.<PutbackReader> make("x10.io.PutbackReader",
                                               PutbackReader.class,
                                               new x10.rtt.Type[] {
                                                   x10.io.FilterReader.$RTT
                                               });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.PutbackReader $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.io.FilterReader.$_deserialize_body($_obj, $deserializer);
        $_obj.putback = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.io.PutbackReader $_obj = new x10.io.PutbackReader((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.putback);
        
    }
    
    // constructor just for allocation
    public PutbackReader(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
    public x10.util.GrowableRail<x10.core.Byte> putback;
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
    // creation method for java code (1-phase java constructor)
    public PutbackReader(final x10.io.Reader r) {
        this((java.lang.System[]) null);
        x10$io$PutbackReader$$init$S(r);
    }
    
    // constructor for non-virtual call
    final public x10.io.PutbackReader x10$io$PutbackReader$$init$S(final x10.io.Reader r) {
         {
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
            /*super.*/x10$io$FilterReader$$init$S(((x10.io.Reader)(r)));
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
            
            
            //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
            final x10.io.PutbackReader this$91270 = this;
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
            final x10.util.GrowableRail alloc$91225 = ((x10.util.GrowableRail)(new x10.util.GrowableRail<x10.core.Byte>((java.lang.System[]) null, x10.rtt.Types.BYTE)));
            
            //#line 50 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            alloc$91225.x10$util$GrowableRail$$init$S(((long)(0L)));
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
            this.putback = ((x10.util.GrowableRail)(alloc$91225));
        }
        return this;
    }
    
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
    public byte read$O() {
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
        final x10.util.GrowableRail this$91230 = ((x10.util.GrowableRail)(putback));
        
        //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$91242 = ((x10.util.GrowableRail<x10.core.Byte>)this$91230).size;
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
        final boolean t$91247 = ((t$91242) > (((long)(0L))));
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
        if (t$91247) {
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
            final x10.util.GrowableRail this$91233 = ((x10.util.GrowableRail)(putback));
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
            final x10.util.GrowableRail this$91231 = ((x10.util.GrowableRail)(putback));
            
            //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$91243 = ((x10.util.GrowableRail<x10.core.Byte>)this$91231).size;
            
            //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long idx$91232 = ((t$91243) - (((long)(1L))));
            
            //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            byte ret$91234 =  0;
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.core.Rail t$91271 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.core.Byte>)this$91233).data));
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final byte t$91272 = ((byte[])t$91271.value)[(int)idx$91232];
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ret$91234 = t$91272;
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
            final byte p = ret$91234;
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
            final x10.util.GrowableRail t$91246 = ((x10.util.GrowableRail)(putback));
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
            ((x10.util.GrowableRail<x10.core.Byte>)t$91246).removeLast$G();
            
            //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
            return p;
        }
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
        final byte t$91248 = super.read$O();
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
        return t$91248;
    }
    
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
    public void read__0$1x10$lang$Byte$2(final x10.core.Rail r, final int off, final int len) {
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
        int read = 0;
        {
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
            final byte[] r$value$91288 = ((byte[])r.value);
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
            while (true) {
                
                //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
                final x10.util.GrowableRail this$91236 = ((x10.util.GrowableRail)(putback));
                
                //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long t$91249 = ((x10.util.GrowableRail<x10.core.Byte>)this$91236).size;
                
                //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
                final boolean t$91260 = ((t$91249) > (((long)(0L))));
                
                //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
                if (!(t$91260)) {
                    
                    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
                    break;
                }
                
                //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
                final int t$91275 = read;
                
                //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
                final boolean t$91276 = ((t$91275) >= (((int)(len))));
                
                //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
                if (t$91276) {
                    
                    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
                    break;
                }
                
                //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
                final x10.util.GrowableRail this$91277 = ((x10.util.GrowableRail)(putback));
                
                //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
                final x10.util.GrowableRail this$91278 = ((x10.util.GrowableRail)(putback));
                
                //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long t$91279 = ((x10.util.GrowableRail<x10.core.Byte>)this$91278).size;
                
                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long idx$91280 = ((t$91279) - (((long)(1L))));
                
                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                byte ret$91281 =  0;
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final x10.core.Rail t$91273 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.core.Byte>)this$91277).data));
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final byte t$91274 = ((byte[])t$91273.value)[(int)idx$91280];
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                ret$91281 = t$91274;
                
                //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
                final byte p$91282 = ret$91281;
                
                //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
                final x10.util.GrowableRail t$91283 = ((x10.util.GrowableRail)(putback));
                
                //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
                ((x10.util.GrowableRail<x10.core.Byte>)t$91283).removeLast$G();
                
                //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
                final int t$91284 = read;
                
                //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
                final long t$91285 = ((long)(((int)(t$91284))));
                
                //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
                r$value$91288[(int)t$91285]=p$91282;
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
                final int t$91286 = read;
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
                final int t$91287 = ((t$91286) + (((int)(1))));
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
                read = t$91287;
            }
        }
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
        final int t$91261 = read;
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
        final boolean t$91268 = ((t$91261) < (((int)(len))));
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
        if (t$91268) {
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
            final int t$91262 = read;
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
            final int t$91263 = ((off) + (((int)(t$91262))));
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
            final long t$91266 = ((long)(((int)(t$91263))));
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
            final int t$91264 = read;
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
            final int t$91265 = ((len) - (((int)(t$91264))));
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
            final long t$91267 = ((long)(((int)(t$91265))));
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
            super.read__0$1x10$lang$Byte$2(((x10.core.Rail)(r)), (long)(t$91266), (long)(t$91267));
        }
    }
    
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
    public void putback(final byte p) {
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
        final x10.util.GrowableRail t$91269 = ((x10.util.GrowableRail)(putback));
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
        ((x10.util.GrowableRail<x10.core.Byte>)t$91269).add__0x10$util$GrowableRail$$T(x10.core.Byte.$box(p));
    }
    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
    final public x10.io.PutbackReader x10$io$PutbackReader$$this$x10$io$PutbackReader() {
        
        //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
        return x10.io.PutbackReader.this;
    }
    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
    final public void __fieldInitializers_x10_io_PutbackReader() {
        
    }
    
    public byte x10$io$FilterReader$read$S$O() {
        return super.read$O();
    }
    
    public void x10$io$FilterReader$read$S__0$1x10$lang$Byte$2(final x10.core.Rail a0, final long a1, final long a2) {
        super.read__0$1x10$lang$Byte$2(((x10.core.Rail)(a0)), (long)(a1), (long)(a2));
    }
}

