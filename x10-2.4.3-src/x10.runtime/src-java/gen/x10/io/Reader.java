package x10.io;

@x10.runtime.impl.java.X10Generated
abstract public class Reader extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Reader> $RTT = 
        x10.rtt.NamedType.<Reader> make("x10.io.Reader",
                                        Reader.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.Reader $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return null;
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Reader(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    abstract public void close();
    
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    abstract public byte read$O();
    
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    abstract public void read__0$1x10$lang$Byte$2(final x10.core.Rail r, final long off, final long len);
    
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    abstract public int available$O();
    
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    abstract public void skip(final long v);
    
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    abstract public void mark(final int m);
    
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    abstract public void reset();
    
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    abstract public boolean markSupported$O();
    
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    public boolean readBoolean$O() {
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final x10.io.Marshal.BooleanMarshal this$91290 = ((x10.io.Marshal.BooleanMarshal)(x10.io.Marshal.$Shadow.get$BOOLEAN()));
        
        //#line 56 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final x10.io.Reader r$91289 = ((x10.io.Reader)(this));
        
        //#line 56 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final byte t$91313 = r$91289.read$O();
        
        //#line 56 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final boolean t$91314 = ((byte) t$91313) != ((byte) ((byte) 0));
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        return t$91314;
    }
    
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    public byte readByte$O() {
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final x10.io.Marshal.ByteMarshal this$91292 = ((x10.io.Marshal.ByteMarshal)(x10.io.Marshal.$Shadow.get$BYTE()));
        
        //#line 63 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final x10.io.Reader r$91291 = ((x10.io.Reader)(this));
        
        //#line 63 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final byte t$91315 = r$91291.read$O();
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        return t$91315;
    }
    
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    public byte readUByte$O() {
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final x10.io.Marshal.UByteMarshal t$91316 = ((x10.io.Marshal.UByteMarshal)(x10.io.Marshal.$Shadow.get$UBYTE()));
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final byte t$91317 = t$91316.read$O(((x10.io.Reader)(this)));
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        return t$91317;
    }
    
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    public char readChar$O() {
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final x10.io.Marshal.CharMarshal t$91318 = ((x10.io.Marshal.CharMarshal)(x10.io.Marshal.$Shadow.get$CHAR()));
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final char t$91319 = t$91318.read$O(((x10.io.Reader)(this)));
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        return t$91319;
    }
    
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    public short readShort$O() {
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final x10.io.Marshal.ShortMarshal t$91320 = ((x10.io.Marshal.ShortMarshal)(x10.io.Marshal.$Shadow.get$SHORT()));
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final short t$91321 = t$91320.read$O(((x10.io.Reader)(this)));
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        return t$91321;
    }
    
    
    //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    public short readUShort$O() {
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final x10.io.Marshal.UShortMarshal t$91322 = ((x10.io.Marshal.UShortMarshal)(x10.io.Marshal.$Shadow.get$USHORT()));
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final short t$91323 = t$91322.read$O(((x10.io.Reader)(this)));
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        return t$91323;
    }
    
    
    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    public int readInt$O() {
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final x10.io.Marshal.IntMarshal t$91324 = ((x10.io.Marshal.IntMarshal)(x10.io.Marshal.$Shadow.get$INT()));
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final int t$91325 = t$91324.read$O(((x10.io.Reader)(this)));
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        return t$91325;
    }
    
    
    //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    public int readUInt$O() {
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final x10.io.Marshal.UIntMarshal t$91326 = ((x10.io.Marshal.UIntMarshal)(x10.io.Marshal.$Shadow.get$UINT()));
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final int t$91327 = t$91326.read$O(((x10.io.Reader)(this)));
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        return t$91327;
    }
    
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    public long readLong$O() {
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final x10.io.Marshal.LongMarshal t$91328 = ((x10.io.Marshal.LongMarshal)(x10.io.Marshal.$Shadow.get$LONG()));
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final long t$91329 = t$91328.read$O(((x10.io.Reader)(this)));
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        return t$91329;
    }
    
    
    //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    public long readULong$O() {
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final x10.io.Marshal.ULongMarshal t$91330 = ((x10.io.Marshal.ULongMarshal)(x10.io.Marshal.$Shadow.get$ULONG()));
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final long t$91331 = t$91330.read$O(((x10.io.Reader)(this)));
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        return t$91331;
    }
    
    
    //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    public float readFloat$O() {
        
        //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final x10.io.Marshal.FloatMarshal t$91332 = ((x10.io.Marshal.FloatMarshal)(x10.io.Marshal.$Shadow.get$FLOAT()));
        
        //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final float t$91333 = t$91332.read$O(((x10.io.Reader)(this)));
        
        //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        return t$91333;
    }
    
    
    //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    public double readDouble$O() {
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final x10.io.Marshal.DoubleMarshal t$91334 = ((x10.io.Marshal.DoubleMarshal)(x10.io.Marshal.$Shadow.get$DOUBLE()));
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final double t$91335 = t$91334.read$O(((x10.io.Reader)(this)));
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        return t$91335;
    }
    
    
    //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    public java.lang.String readLine() {
        
        //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final x10.io.Marshal.LineMarshal t$91336 = ((x10.io.Marshal.LineMarshal)(x10.io.Marshal.$Shadow.get$LINE()));
        
        //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final java.lang.String t$91337 = t$91336.read(((x10.io.Reader)(this)));
        
        //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        return t$91337;
    }
    
    
    //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    final public <$T>$T read__0$1x10$io$Reader$$T$2$G(final x10.rtt.Type $T, final x10.io.Marshal m) {
        
        //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final $T t$91338 = (($T)(((x10.io.Marshal<$T>)m).read$G(((x10.io.Reader)(this)))));
        
        //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        return t$91338;
    }
    
    
    //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    final public <$T>void read__0$1x10$io$Reader$$T$2__1$1x10$io$Reader$$T$2(final x10.rtt.Type $T, final x10.io.Marshal m, final x10.core.Rail a) {
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final long t$91339 = ((x10.core.Rail<$T>)a).size;
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        this.<$T> read__0$1x10$io$Reader$$T$2__1$1x10$io$Reader$$T$2($T, ((x10.io.Marshal)(m)), ((x10.core.Rail)(a)), (long)(0L), (long)(t$91339));
    }
    
    
    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    final public <$T>void read__0$1x10$io$Reader$$T$2__1$1x10$io$Reader$$T$2(final x10.rtt.Type $T, final x10.io.Marshal m, final x10.core.Rail a, final long off, final long len) {
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        long i = off;
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        for (;
             true;
             ) {
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
            final long t$91341 = i;
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
            final long t$91342 = ((off) + (((long)(len))));
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
            final boolean t$91347 = ((t$91341) < (((long)(t$91342))));
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
            if (!(t$91347)) {
                
                //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
                break;
            }
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
            final long t$91354 = i;
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
            final x10.io.Reader this$91355 = ((x10.io.Reader)(this));
            
            //#line 129 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
            final x10.io.Marshal m$91356 = ((x10.io.Marshal)(m));
            
            //#line 129 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
            final $T t$91357 = (($T)(((x10.io.Marshal<$T>)m$91356).read$G(((x10.io.Reader)(this$91355)))));
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
            ((x10.core.Rail<$T>)a).$set__1x10$lang$Rail$$T$G((long)(t$91354), (($T)(t$91357)));
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
            final long t$91358 = i;
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
            final long t$91359 = ((t$91358) + (((long)(1L))));
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
            i = t$91359;
        }
    }
    
    
    //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    public x10.io.ReaderIterator lines() {
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final x10.io.ReaderIterator alloc$90087 = ((x10.io.ReaderIterator)(new x10.io.ReaderIterator<java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING)));
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final x10.io.Marshal.LineMarshal t$91348 = ((x10.io.Marshal.LineMarshal)(x10.io.Marshal.$Shadow.get$LINE()));
        
        //#line 34 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        final x10.io.Marshal m$91295 = ((x10.io.Marshal)(((x10.io.Marshal<java.lang.String>)
                                                           t$91348)));
        
        //#line 34 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        final x10.io.Reader r$91296 = ((x10.io.Reader)(this));
        
        //#line 32 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        final java.lang.String t$91360 = (java.lang.String) x10.rtt.Types.zeroValue(x10.rtt.Types.STRING);
        
        //#line 29 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        ((x10.io.ReaderIterator<java.lang.String>)alloc$90087).next = t$91360;
        
        //#line 35 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        ((x10.io.ReaderIterator<java.lang.String>)alloc$90087).m = ((x10.io.Marshal)(m$91295));
        
        //#line 36 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        ((x10.io.ReaderIterator<java.lang.String>)alloc$90087).r = ((x10.io.Reader)(r$91296));
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        return alloc$90087;
    }
    
    
    //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    public x10.io.ReaderIterator chars() {
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final x10.io.ReaderIterator alloc$90088 = ((x10.io.ReaderIterator)(new x10.io.ReaderIterator<x10.core.Char>((java.lang.System[]) null, x10.rtt.Types.CHAR)));
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final x10.io.Marshal.CharMarshal t$91350 = ((x10.io.Marshal.CharMarshal)(x10.io.Marshal.$Shadow.get$CHAR()));
        
        //#line 34 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        final x10.io.Marshal m$91300 = ((x10.io.Marshal)(((x10.io.Marshal<x10.core.Char>)
                                                           t$91350)));
        
        //#line 34 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        final x10.io.Reader r$91301 = ((x10.io.Reader)(this));
        
        //#line 32 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        final char t$91361 = x10.core.Char.$unbox((x10.core.Char) x10.rtt.Types.zeroValue(x10.rtt.Types.CHAR));
        
        //#line 29 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        ((x10.io.ReaderIterator<x10.core.Char>)alloc$90088).next = x10.core.Char.$box(t$91361);
        
        //#line 35 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        ((x10.io.ReaderIterator<x10.core.Char>)alloc$90088).m = ((x10.io.Marshal)(m$91300));
        
        //#line 36 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        ((x10.io.ReaderIterator<x10.core.Char>)alloc$90088).r = ((x10.io.Reader)(r$91301));
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        return alloc$90088;
    }
    
    
    //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    public x10.io.ReaderIterator bytes() {
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final x10.io.ReaderIterator alloc$90089 = ((x10.io.ReaderIterator)(new x10.io.ReaderIterator<x10.core.Byte>((java.lang.System[]) null, x10.rtt.Types.BYTE)));
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        final x10.io.Marshal.ByteMarshal t$91352 = ((x10.io.Marshal.ByteMarshal)(x10.io.Marshal.$Shadow.get$BYTE()));
        
        //#line 34 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        final x10.io.Marshal m$91305 = ((x10.io.Marshal)(((x10.io.Marshal<x10.core.Byte>)
                                                           t$91352)));
        
        //#line 34 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        final x10.io.Reader r$91306 = ((x10.io.Reader)(this));
        
        //#line 32 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        final byte t$91362 = x10.core.Byte.$unbox((x10.core.Byte) x10.rtt.Types.zeroValue(x10.rtt.Types.BYTE));
        
        //#line 29 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        ((x10.io.ReaderIterator<x10.core.Byte>)alloc$90089).next = x10.core.Byte.$box(t$91362);
        
        //#line 35 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        ((x10.io.ReaderIterator<x10.core.Byte>)alloc$90089).m = ((x10.io.Marshal)(m$91305));
        
        //#line 36 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        ((x10.io.ReaderIterator<x10.core.Byte>)alloc$90089).r = ((x10.io.Reader)(r$91306));
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        return alloc$90089;
    }
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    final public x10.io.Reader x10$io$Reader$$this$x10$io$Reader() {
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
        return x10.io.Reader.this;
    }
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    
    // constructor for non-virtual call
    final public x10.io.Reader x10$io$Reader$$init$S() {
         {
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
            
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
            final x10.io.Reader this$91310 = this;
        }
        return this;
    }
    
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    final public void __fieldInitializers_x10_io_Reader() {
        
    }
}

