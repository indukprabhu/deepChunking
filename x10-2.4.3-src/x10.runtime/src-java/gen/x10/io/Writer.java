package x10.io;


@x10.runtime.impl.java.X10Generated
abstract public class Writer extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Writer> $RTT = 
        x10.rtt.NamedType.<Writer> make("x10.io.Writer",
                                        Writer.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.Writer $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return null;
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Writer(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    abstract public void close();
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    abstract public void flush();
    
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    abstract public void write(final byte x);
    
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    abstract public void write(final java.lang.String x);
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    abstract public void write__0$1x10$lang$Byte$2(final x10.core.Rail x, final long off, final long len);
    
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    public void write__0$1x10$lang$Byte$2(final x10.core.Rail buf) {
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
        final long t$91449 = ((x10.core.Rail<x10.core.Byte>)buf).size;
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
        this.write__0$1x10$lang$Byte$2(((x10.core.Rail)(buf)), (long)(0L), (long)(t$91449));
    }
    
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    public void writeByte(final byte x) {
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
        final x10.io.Marshal.ByteMarshal this$91443 = ((x10.io.Marshal.ByteMarshal)(x10.io.Marshal.$Shadow.get$BYTE()));
        
        //#line 64 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final x10.io.Writer w$91441 = ((x10.io.Writer)(this));
        
        //#line 64 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final byte b$91442 = x;
        
        //#line 65 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        w$91441.write((byte)(b$91442));
    }
    
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    public void writeUByte__0$u(final byte x) {
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
        final x10.io.Marshal.UByteMarshal t$91450 = ((x10.io.Marshal.UByteMarshal)(x10.io.Marshal.$Shadow.get$UBYTE()));
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
        t$91450.write__1$u(((x10.io.Writer)(this)), (byte)(x));
    }
    
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    public void writeChar(final char x) {
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
        final x10.io.Marshal.CharMarshal t$91451 = ((x10.io.Marshal.CharMarshal)(x10.io.Marshal.$Shadow.get$CHAR()));
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
        t$91451.write(((x10.io.Writer)(this)), (char)(x));
    }
    
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    public void writeShort(final short x) {
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
        final x10.io.Marshal.ShortMarshal t$91452 = ((x10.io.Marshal.ShortMarshal)(x10.io.Marshal.$Shadow.get$SHORT()));
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
        t$91452.write(((x10.io.Writer)(this)), (short)(x));
    }
    
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    public void writeUShort__0$u(final short x) {
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
        final x10.io.Marshal.UShortMarshal t$91453 = ((x10.io.Marshal.UShortMarshal)(x10.io.Marshal.$Shadow.get$USHORT()));
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
        t$91453.write__1$u(((x10.io.Writer)(this)), (short)(x));
    }
    
    
    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    public void writeInt(final int x) {
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
        final x10.io.Marshal.IntMarshal t$91454 = ((x10.io.Marshal.IntMarshal)(x10.io.Marshal.$Shadow.get$INT()));
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
        t$91454.write(((x10.io.Writer)(this)), (int)(x));
    }
    
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    public void writeUInt__0$u(final int x) {
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
        final x10.io.Marshal.UIntMarshal t$91455 = ((x10.io.Marshal.UIntMarshal)(x10.io.Marshal.$Shadow.get$UINT()));
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
        t$91455.write__1$u(((x10.io.Writer)(this)), (int)(x));
    }
    
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    public void writeLong(final long x) {
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
        final x10.io.Marshal.LongMarshal t$91456 = ((x10.io.Marshal.LongMarshal)(x10.io.Marshal.$Shadow.get$LONG()));
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
        t$91456.write(((x10.io.Writer)(this)), (long)(x));
    }
    
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    public void writeULong__0$u(final long x) {
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
        final x10.io.Marshal.ULongMarshal t$91457 = ((x10.io.Marshal.ULongMarshal)(x10.io.Marshal.$Shadow.get$ULONG()));
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
        t$91457.write__1$u(((x10.io.Writer)(this)), (long)(x));
    }
    
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    public void writeFloat(final float x) {
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
        final x10.io.Marshal.FloatMarshal t$91458 = ((x10.io.Marshal.FloatMarshal)(x10.io.Marshal.$Shadow.get$FLOAT()));
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
        t$91458.write(((x10.io.Writer)(this)), (float)(x));
    }
    
    
    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    public void writeDouble(final double x) {
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
        final x10.io.Marshal.DoubleMarshal t$91459 = ((x10.io.Marshal.DoubleMarshal)(x10.io.Marshal.$Shadow.get$DOUBLE()));
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
        t$91459.write(((x10.io.Writer)(this)), (double)(x));
    }
    
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    public void writeBoolean(final boolean x) {
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
        final x10.io.Marshal.BooleanMarshal t$91460 = ((x10.io.Marshal.BooleanMarshal)(x10.io.Marshal.$Shadow.get$BOOLEAN()));
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
        t$91460.write(((x10.io.Writer)(this)), (boolean)(x));
    }
    
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    final public <$T>void write__0$1x10$io$Writer$$T$2__1x10$io$Writer$$T(final x10.rtt.Type $T, final x10.io.Marshal m, final $T x) {
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
        ((x10.io.Marshal<$T>)m).write$V(((x10.io.Writer)(this)), (($T)(x)), $T);
    }
    
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    final public x10.core.io.OutputStream getNativeOutputStream() {
        try {
            return x10.core.io.OutputStream.getNativeOutputStream(this);
        }
        catch (java.lang.Throwable exc$146348) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146348);
        }
        
    }
    
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    final public x10.io.Writer x10$io$Writer$$this$x10$io$Writer() {
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
        return x10.io.Writer.this;
    }
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    
    // constructor for non-virtual call
    final public x10.io.Writer x10$io$Writer$$init$S() {
         {
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
            
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
            final x10.io.Writer this$91446 = this;
        }
        return this;
    }
    
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    final public void __fieldInitializers_x10_io_Writer() {
        
    }
}

