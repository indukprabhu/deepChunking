package x10.io;


@x10.runtime.impl.java.X10Generated
public interface Marshal<$T> extends x10.core.Any
{
    public static final x10.rtt.RuntimeType<Marshal> $RTT = 
        x10.rtt.NamedType.<Marshal> make("x10.io.Marshal",
                                         Marshal.class,
                                         1);
    
    

    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    $T read$G(final x10.io.Reader r);
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    void write$V(final x10.io.Writer w, final java.lang.Object v, x10.rtt.Type t1);
    
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    @x10.runtime.impl.java.X10Generated
    final public static class LineMarshal extends x10.core.Ref implements x10.io.Marshal, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<LineMarshal> $RTT = 
            x10.rtt.NamedType.<LineMarshal> make("x10.io.Marshal.LineMarshal",
                                                 LineMarshal.class,
                                                 new x10.rtt.Type[] {
                                                     x10.rtt.ParameterizedType.make(x10.io.Marshal.$RTT, x10.rtt.Types.STRING)
                                                 });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.Marshal.LineMarshal $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.io.Marshal.LineMarshal $_obj = new x10.io.Marshal.LineMarshal((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public LineMarshal(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public x10.io.Marshal[T].write(w:x10.io.Writer, v:T){}:void
        public java.lang.Object write(final x10.io.Writer a1, final java.lang.Object a2, final x10.rtt.Type t2) {
            write((x10.io.Writer)a1, (java.lang.String)a2); return null;
            
        }
        
        // dispatcher for method abstract public x10.io.Marshal[T].write(w:x10.io.Writer, v:T){}:void
        public void write$V(final x10.io.Writer a1, final java.lang.Object a2, final x10.rtt.Type t2) {
            write((x10.io.Writer)a1, (java.lang.String)a2);
            
        }
        
        // bridge for method abstract public x10.io.Marshal[T].read(r:x10.io.Reader){}:T
        public java.lang.String read$G(x10.io.Reader a1) {
            return read(a1);
        }
        
        
    
        
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        public java.lang.String read(final x10.io.Reader r) {
            
            //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final x10.util.GrowableRail buf = ((x10.util.GrowableRail)(new x10.util.GrowableRail<x10.core.Byte>((java.lang.System[]) null, x10.rtt.Types.BYTE)));
            
            //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            buf.x10$util$GrowableRail$$init$S(((long)(32L)));
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            try {{
                
                //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                while (true) {
                    
                    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                    final byte b = r.read$O();
                    
                    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                    final char t$90877 = ((char) (((byte)(b))));
                    
                    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                    final boolean t$90878 = ((char) t$90877) == ((char) '\n');
                    
                    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                    if (t$90878) {
                        
                        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                        break;
                    }
                    
                    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                    ((x10.util.GrowableRail<x10.core.Byte>)buf).add__0x10$util$GrowableRail$$T(x10.core.Byte.$box(b));
                }
            }}catch (final x10.io.IOException e) {
                
                //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long t$90879 = ((x10.util.GrowableRail<x10.core.Byte>)buf).size;
                
                //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final boolean t$90880 = ((long) t$90879) == ((long) 0L);
                
                //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                if (t$90880) {
                    
                    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                    throw e;
                }
            }
            
            //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final java.lang.String t$90881 = ((java.lang.String)(new java.lang.String((buf).rail().getByteArray(), 0, (int)(buf).size)));
            
            //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            return t$90881;
        }
        
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        public void write(final x10.io.Writer w, final java.lang.String s) {
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final x10.core.Rail t$90882 = x10.runtime.impl.java.ArrayUtils.<x10.core.Byte>makeRailFromJavaArray(x10.rtt.Types.BYTE, (s).getBytes(), false);
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            w.write__0$1x10$lang$Byte$2(((x10.core.Rail)(t$90882)));
        }
        
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final public x10.io.Marshal.LineMarshal x10$io$Marshal$LineMarshal$$this$x10$io$Marshal$LineMarshal() {
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            return x10.io.Marshal.LineMarshal.this;
        }
        
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        // creation method for java code (1-phase java constructor)
        public LineMarshal() {
            this((java.lang.System[]) null);
            x10$io$Marshal$LineMarshal$$init$S();
        }
        
        // constructor for non-virtual call
        final public x10.io.Marshal.LineMarshal x10$io$Marshal$LineMarshal$$init$S() {
             {
                
                //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                
                
                //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final x10.io.Marshal.LineMarshal this$90838 = this;
            }
            return this;
        }
        
        
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final public void __fieldInitializers_x10_io_Marshal_LineMarshal() {
            
        }
    }
    
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    @x10.runtime.impl.java.X10Generated
    final public static class BooleanMarshal extends x10.core.Ref implements x10.io.Marshal, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<BooleanMarshal> $RTT = 
            x10.rtt.NamedType.<BooleanMarshal> make("x10.io.Marshal.BooleanMarshal",
                                                    BooleanMarshal.class,
                                                    new x10.rtt.Type[] {
                                                        x10.rtt.ParameterizedType.make(x10.io.Marshal.$RTT, x10.rtt.Types.BOOLEAN)
                                                    });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.Marshal.BooleanMarshal $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.io.Marshal.BooleanMarshal $_obj = new x10.io.Marshal.BooleanMarshal((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public BooleanMarshal(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public x10.io.Marshal[T].write(w:x10.io.Writer, v:T){}:void
        public java.lang.Object write(final x10.io.Writer a1, final java.lang.Object a2, final x10.rtt.Type t2) {
            write((x10.io.Writer)a1, x10.core.Boolean.$unbox(a2)); return null;
            
        }
        
        // dispatcher for method abstract public x10.io.Marshal[T].write(w:x10.io.Writer, v:T){}:void
        public void write$V(final x10.io.Writer a1, final java.lang.Object a2, final x10.rtt.Type t2) {
            write((x10.io.Writer)a1, x10.core.Boolean.$unbox(a2));
            
        }
        
        // bridge for method abstract public x10.io.Marshal[T].read(r:x10.io.Reader){}:T
        public x10.core.Boolean read$G(x10.io.Reader a1) {
            return x10.core.Boolean.$box(read$O(a1));
        }
        
        
    
        
        
        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        public boolean read$O(final x10.io.Reader r) {
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final byte t$90883 = r.read$O();
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final boolean t$90884 = ((byte) t$90883) != ((byte) ((byte) 0));
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            return t$90884;
        }
        
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        public void write(final x10.io.Writer w, final boolean b) {
            
            //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            long t$90885 =  0;
            
            //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            if (b) {
                
                //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                t$90885 = 0L;
            } else {
                
                //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                t$90885 = 1L;
            }
            
            //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long t$90886 = t$90885;
            
            //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final byte t$90887 = ((byte)(long)(((long)(t$90886))));
            
            //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            w.write((byte)(t$90887));
        }
        
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final public x10.io.Marshal.BooleanMarshal x10$io$Marshal$BooleanMarshal$$this$x10$io$Marshal$BooleanMarshal() {
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            return x10.io.Marshal.BooleanMarshal.this;
        }
        
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        // creation method for java code (1-phase java constructor)
        public BooleanMarshal() {
            this((java.lang.System[]) null);
            x10$io$Marshal$BooleanMarshal$$init$S();
        }
        
        // constructor for non-virtual call
        final public x10.io.Marshal.BooleanMarshal x10$io$Marshal$BooleanMarshal$$init$S() {
             {
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final x10.io.Marshal.BooleanMarshal this$90841 = this;
            }
            return this;
        }
        
        
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final public void __fieldInitializers_x10_io_Marshal_BooleanMarshal() {
            
        }
    }
    
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    @x10.runtime.impl.java.X10Generated
    final public static class ByteMarshal extends x10.core.Ref implements x10.io.Marshal, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<ByteMarshal> $RTT = 
            x10.rtt.NamedType.<ByteMarshal> make("x10.io.Marshal.ByteMarshal",
                                                 ByteMarshal.class,
                                                 new x10.rtt.Type[] {
                                                     x10.rtt.ParameterizedType.make(x10.io.Marshal.$RTT, x10.rtt.Types.BYTE)
                                                 });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.Marshal.ByteMarshal $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.io.Marshal.ByteMarshal $_obj = new x10.io.Marshal.ByteMarshal((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public ByteMarshal(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public x10.io.Marshal[T].write(w:x10.io.Writer, v:T){}:void
        public java.lang.Object write(final x10.io.Writer a1, final java.lang.Object a2, final x10.rtt.Type t2) {
            write((x10.io.Writer)a1, x10.core.Byte.$unbox(a2)); return null;
            
        }
        
        // dispatcher for method abstract public x10.io.Marshal[T].write(w:x10.io.Writer, v:T){}:void
        public void write$V(final x10.io.Writer a1, final java.lang.Object a2, final x10.rtt.Type t2) {
            write((x10.io.Writer)a1, x10.core.Byte.$unbox(a2));
            
        }
        
        // bridge for method abstract public x10.io.Marshal[T].read(r:x10.io.Reader){}:T
        public x10.core.Byte read$G(x10.io.Reader a1) {
            return x10.core.Byte.$box(read$O(a1));
        }
        
        
    
        
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        public byte read$O(final x10.io.Reader r) {
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final byte t$90888 = r.read$O();
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            return t$90888;
        }
        
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        public void write(final x10.io.Writer w, final byte b) {
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            w.write((byte)(b));
        }
        
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final public x10.io.Marshal.ByteMarshal x10$io$Marshal$ByteMarshal$$this$x10$io$Marshal$ByteMarshal() {
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            return x10.io.Marshal.ByteMarshal.this;
        }
        
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        // creation method for java code (1-phase java constructor)
        public ByteMarshal() {
            this((java.lang.System[]) null);
            x10$io$Marshal$ByteMarshal$$init$S();
        }
        
        // constructor for non-virtual call
        final public x10.io.Marshal.ByteMarshal x10$io$Marshal$ByteMarshal$$init$S() {
             {
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final x10.io.Marshal.ByteMarshal this$90844 = this;
            }
            return this;
        }
        
        
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final public void __fieldInitializers_x10_io_Marshal_ByteMarshal() {
            
        }
    }
    
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    @x10.runtime.impl.java.X10Generated
    final public static class UByteMarshal extends x10.core.Ref implements x10.io.Marshal, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<UByteMarshal> $RTT = 
            x10.rtt.NamedType.<UByteMarshal> make("x10.io.Marshal.UByteMarshal",
                                                  UByteMarshal.class,
                                                  new x10.rtt.Type[] {
                                                      x10.rtt.ParameterizedType.make(x10.io.Marshal.$RTT, x10.rtt.Types.UBYTE)
                                                  });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.Marshal.UByteMarshal $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.io.Marshal.UByteMarshal $_obj = new x10.io.Marshal.UByteMarshal((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public UByteMarshal(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public x10.io.Marshal[T].write(w:x10.io.Writer, v:T){}:void
        public java.lang.Object write(final x10.io.Writer a1, final java.lang.Object a2, final x10.rtt.Type t2) {
            write__1$u((x10.io.Writer)a1, x10.core.UByte.$unbox(a2)); return null;
            
        }
        
        // dispatcher for method abstract public x10.io.Marshal[T].write(w:x10.io.Writer, v:T){}:void
        public void write$V(final x10.io.Writer a1, final java.lang.Object a2, final x10.rtt.Type t2) {
            write__1$u((x10.io.Writer)a1, x10.core.UByte.$unbox(a2));
            
        }
        
        // bridge for method abstract public x10.io.Marshal[T].read(r:x10.io.Reader){}:T
        public x10.core.UByte read$G(x10.io.Reader a1) {
            return x10.core.UByte.$box(read$O(a1));
        }
        
        
    
        
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        public byte read$O(final x10.io.Reader r) {
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final byte t$90889 = r.readByte$O();
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final byte t$90890 = ((byte)(((byte)(t$90889))));
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            return t$90890;
        }
        
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        public void write__1$u(final x10.io.Writer w, final byte ub) {
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final byte t$90891 = ((byte)(((byte)(ub))));
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            w.write((byte)(t$90891));
        }
        
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final public x10.io.Marshal.UByteMarshal x10$io$Marshal$UByteMarshal$$this$x10$io$Marshal$UByteMarshal() {
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            return x10.io.Marshal.UByteMarshal.this;
        }
        
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        // creation method for java code (1-phase java constructor)
        public UByteMarshal() {
            this((java.lang.System[]) null);
            x10$io$Marshal$UByteMarshal$$init$S();
        }
        
        // constructor for non-virtual call
        final public x10.io.Marshal.UByteMarshal x10$io$Marshal$UByteMarshal$$init$S() {
             {
                
                //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                
                
                //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final x10.io.Marshal.UByteMarshal this$90847 = this;
            }
            return this;
        }
        
        
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final public void __fieldInitializers_x10_io_Marshal_UByteMarshal() {
            
        }
    }
    
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    @x10.runtime.impl.java.X10Generated
    final public static class CharMarshal extends x10.core.Ref implements x10.io.Marshal, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<CharMarshal> $RTT = 
            x10.rtt.NamedType.<CharMarshal> make("x10.io.Marshal.CharMarshal",
                                                 CharMarshal.class,
                                                 new x10.rtt.Type[] {
                                                     x10.rtt.ParameterizedType.make(x10.io.Marshal.$RTT, x10.rtt.Types.CHAR)
                                                 });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.Marshal.CharMarshal $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.io.Marshal.CharMarshal $_obj = new x10.io.Marshal.CharMarshal((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public CharMarshal(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public x10.io.Marshal[T].write(w:x10.io.Writer, v:T){}:void
        public java.lang.Object write(final x10.io.Writer a1, final java.lang.Object a2, final x10.rtt.Type t2) {
            write((x10.io.Writer)a1, x10.core.Char.$unbox(a2)); return null;
            
        }
        
        // dispatcher for method abstract public x10.io.Marshal[T].write(w:x10.io.Writer, v:T){}:void
        public void write$V(final x10.io.Writer a1, final java.lang.Object a2, final x10.rtt.Type t2) {
            write((x10.io.Writer)a1, x10.core.Char.$unbox(a2));
            
        }
        
        // bridge for method abstract public x10.io.Marshal[T].read(r:x10.io.Reader){}:T
        public x10.core.Char read$G(x10.io.Reader a1) {
            return x10.core.Char.$box(read$O(a1));
        }
        
        
    
        
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        public char read$O(final x10.io.Reader r) {
            
            //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final byte b1 = r.read$O();
            
            //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final boolean t$90893 = ((byte) b1) == ((byte) ((byte) -1));
            
            //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            if (t$90893) {
                
                //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final x10.io.EOFException t$90892 = ((x10.io.EOFException)(new x10.io.EOFException()));
                
                //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                throw t$90892;
            }
            
            //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long t$90894 = ((long)(((byte)(b1))));
            
            //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long t$90895 = ((t$90894) & (((long)(248L))));
            
            //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final boolean t$90914 = ((long) t$90895) == ((long) 240L);
            
            //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            if (t$90914) {
                
                //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final byte b2 = r.read$O();
                
                //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final byte b3 = r.read$O();
                
                //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final byte b4 = r.read$O();
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90896 = ((int)(byte)(((byte)(b1))));
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90897 = ((t$90896) & (((int)(3))));
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90898 = ((long)(((int)(18))));
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90902 = ((t$90897) << (int)(((long)(t$90898))));
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90899 = ((int)(byte)(((byte)(b2))));
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90900 = ((t$90899) & (((int)(63))));
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90901 = ((long)(((int)(12))));
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90903 = ((t$90900) << (int)(((long)(t$90901))));
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90907 = ((t$90902) | (((int)(t$90903))));
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90904 = ((int)(byte)(((byte)(b3))));
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90905 = ((t$90904) & (((int)(63))));
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90906 = ((long)(((int)(6))));
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90908 = ((t$90905) << (int)(((long)(t$90906))));
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90910 = ((t$90907) | (((int)(t$90908))));
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90909 = ((int)(byte)(((byte)(b4))));
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90911 = ((t$90909) & (((int)(63))));
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90912 = ((t$90910) | (((int)(t$90911))));
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final char t$90913 = ((char) (((int)(t$90912))));
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                return t$90913;
            }
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long t$90915 = ((long)(((byte)(b1))));
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long t$90916 = ((t$90915) & (((long)(240L))));
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final boolean t$90930 = ((long) t$90916) == ((long) 224L);
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            if (t$90930) {
                
                //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final byte b2 = r.read$O();
                
                //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final byte b3 = r.read$O();
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90917 = ((int)(byte)(((byte)(b1))));
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90918 = ((t$90917) & (((int)(31))));
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90919 = ((long)(((int)(12))));
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90923 = ((t$90918) << (int)(((long)(t$90919))));
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90920 = ((int)(byte)(((byte)(b2))));
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90921 = ((t$90920) & (((int)(63))));
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90922 = ((long)(((int)(6))));
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90924 = ((t$90921) << (int)(((long)(t$90922))));
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90926 = ((t$90923) | (((int)(t$90924))));
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90925 = ((int)(byte)(((byte)(b3))));
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90927 = ((t$90925) & (((int)(63))));
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90928 = ((t$90926) | (((int)(t$90927))));
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final char t$90929 = ((char) (((int)(t$90928))));
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                return t$90929;
            }
            
            //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long t$90931 = ((long)(((byte)(b1))));
            
            //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long t$90932 = ((t$90931) & (((long)(224L))));
            
            //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final boolean t$90941 = ((long) t$90932) == ((long) 192L);
            
            //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            if (t$90941) {
                
                //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final byte b2 = r.read$O();
                
                //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90933 = ((int)(byte)(((byte)(b1))));
                
                //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90934 = ((t$90933) & (((int)(31))));
                
                //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90935 = ((long)(((int)(6))));
                
                //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90937 = ((t$90934) << (int)(((long)(t$90935))));
                
                //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90936 = ((int)(byte)(((byte)(b2))));
                
                //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90938 = ((t$90936) & (((int)(63))));
                
                //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90939 = ((t$90937) | (((int)(t$90938))));
                
                //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final char t$90940 = ((char) (((int)(t$90939))));
                
                //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                return t$90940;
            }
            
            //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$90942 = ((int)(byte)(((byte)(b1))));
            
            //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final char t$90943 = ((char) (((int)(t$90942))));
            
            //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            return t$90943;
        }
        
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        public void write(final x10.io.Writer w, final char c) {
            
            //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int i = ((int) (c));
            
            //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long t$90944 = ((long)(((int)(i))));
            
            //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long t$90945 = ((t$90944) & (((long)(4294967168L))));
            
            //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final boolean t$90947 = ((long) t$90945) == ((long) 0L);
            
            //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            if (t$90947) {
                
                //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final byte t$90946 = ((byte)(int)(((int)(i))));
                
                //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                w.write((byte)(t$90946));
                
                //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                return;
            }
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long t$90948 = ((long)(((int)(i))));
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long t$90949 = ((t$90948) & (((long)(4294965248L))));
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final boolean t$90960 = ((long) t$90949) == ((long) 0L);
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            if (t$90960) {
                
                //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90950 = ((long)(((int)(6))));
                
                //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90951 = ((i) >> (int)(((long)(t$90950))));
                
                //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90952 = ((long)(((int)(t$90951))));
                
                //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90953 = ((t$90952) & (((long)(31L))));
                
                //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90954 = ((t$90953) | (((long)(192L))));
                
                //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final byte t$90955 = ((byte)(long)(((long)(t$90954))));
                
                //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                w.write((byte)(t$90955));
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90956 = ((long)(((int)(i))));
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90957 = ((t$90956) & (((long)(63L))));
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90958 = ((t$90957) | (((long)(128L))));
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final byte t$90959 = ((byte)(long)(((long)(t$90958))));
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                w.write((byte)(t$90959));
                
                //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                return;
            }
            
            //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long t$90961 = ((long)(((int)(i))));
            
            //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long t$90962 = ((t$90961) & (((long)(4294901760L))));
            
            //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final boolean t$90979 = ((long) t$90962) == ((long) 0L);
            
            //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            if (t$90979) {
                
                //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90963 = ((long)(((int)(12))));
                
                //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90964 = ((i) >> (int)(((long)(t$90963))));
                
                //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90965 = ((long)(((int)(t$90964))));
                
                //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90966 = ((t$90965) & (((long)(15L))));
                
                //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90967 = ((t$90966) | (((long)(224L))));
                
                //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final byte t$90968 = ((byte)(long)(((long)(t$90967))));
                
                //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                w.write((byte)(t$90968));
                
                //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90969 = ((long)(((int)(6))));
                
                //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90970 = ((i) >> (int)(((long)(t$90969))));
                
                //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90971 = ((long)(((int)(t$90970))));
                
                //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90972 = ((t$90971) & (((long)(63L))));
                
                //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90973 = ((t$90972) | (((long)(128L))));
                
                //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final byte t$90974 = ((byte)(long)(((long)(t$90973))));
                
                //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                w.write((byte)(t$90974));
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90975 = ((long)(((int)(i))));
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90976 = ((t$90975) & (((long)(63L))));
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90977 = ((t$90976) | (((long)(128L))));
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final byte t$90978 = ((byte)(long)(((long)(t$90977))));
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                w.write((byte)(t$90978));
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                return;
            }
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long t$90980 = ((long)(((int)(i))));
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long t$90981 = ((t$90980) & (((long)(4292870144L))));
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final boolean t$91004 = ((long) t$90981) == ((long) 0L);
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            if (t$91004) {
                
                //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90982 = ((long)(((int)(18))));
                
                //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90983 = ((i) >> (int)(((long)(t$90982))));
                
                //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90984 = ((long)(((int)(t$90983))));
                
                //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90985 = ((t$90984) & (((long)(7L))));
                
                //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90986 = ((t$90985) | (((long)(240L))));
                
                //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final byte t$90987 = ((byte)(long)(((long)(t$90986))));
                
                //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                w.write((byte)(t$90987));
                
                //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90988 = ((long)(((int)(12))));
                
                //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90989 = ((i) >> (int)(((long)(t$90988))));
                
                //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90990 = ((long)(((int)(t$90989))));
                
                //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90991 = ((t$90990) & (((long)(63L))));
                
                //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90992 = ((t$90991) | (((long)(128L))));
                
                //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final byte t$90993 = ((byte)(long)(((long)(t$90992))));
                
                //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                w.write((byte)(t$90993));
                
                //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90994 = ((long)(((int)(6))));
                
                //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$90995 = ((i) >> (int)(((long)(t$90994))));
                
                //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90996 = ((long)(((int)(t$90995))));
                
                //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90997 = ((t$90996) & (((long)(63L))));
                
                //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$90998 = ((t$90997) | (((long)(128L))));
                
                //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final byte t$90999 = ((byte)(long)(((long)(t$90998))));
                
                //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                w.write((byte)(t$90999));
                
                //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$91000 = ((long)(((int)(i))));
                
                //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$91001 = ((t$91000) & (((long)(63L))));
                
                //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$91002 = ((t$91001) | (((long)(128L))));
                
                //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final byte t$91003 = ((byte)(long)(((long)(t$91002))));
                
                //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                w.write((byte)(t$91003));
                
                //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                return;
            }
        }
        
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final public x10.io.Marshal.CharMarshal x10$io$Marshal$CharMarshal$$this$x10$io$Marshal$CharMarshal() {
            
            //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            return x10.io.Marshal.CharMarshal.this;
        }
        
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        // creation method for java code (1-phase java constructor)
        public CharMarshal() {
            this((java.lang.System[]) null);
            x10$io$Marshal$CharMarshal$$init$S();
        }
        
        // constructor for non-virtual call
        final public x10.io.Marshal.CharMarshal x10$io$Marshal$CharMarshal$$init$S() {
             {
                
                //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                
                
                //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final x10.io.Marshal.CharMarshal this$90850 = this;
            }
            return this;
        }
        
        
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final public void __fieldInitializers_x10_io_Marshal_CharMarshal() {
            
        }
    }
    
    
    //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    @x10.runtime.impl.java.X10Generated
    final public static class ShortMarshal extends x10.core.Ref implements x10.io.Marshal, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<ShortMarshal> $RTT = 
            x10.rtt.NamedType.<ShortMarshal> make("x10.io.Marshal.ShortMarshal",
                                                  ShortMarshal.class,
                                                  new x10.rtt.Type[] {
                                                      x10.rtt.ParameterizedType.make(x10.io.Marshal.$RTT, x10.rtt.Types.SHORT)
                                                  });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.Marshal.ShortMarshal $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.io.Marshal.ShortMarshal $_obj = new x10.io.Marshal.ShortMarshal((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public ShortMarshal(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public x10.io.Marshal[T].write(w:x10.io.Writer, v:T){}:void
        public java.lang.Object write(final x10.io.Writer a1, final java.lang.Object a2, final x10.rtt.Type t2) {
            write((x10.io.Writer)a1, x10.core.Short.$unbox(a2)); return null;
            
        }
        
        // dispatcher for method abstract public x10.io.Marshal[T].write(w:x10.io.Writer, v:T){}:void
        public void write$V(final x10.io.Writer a1, final java.lang.Object a2, final x10.rtt.Type t2) {
            write((x10.io.Writer)a1, x10.core.Short.$unbox(a2));
            
        }
        
        // bridge for method abstract public x10.io.Marshal[T].read(r:x10.io.Reader){}:T
        public x10.core.Short read$G(x10.io.Reader a1) {
            return x10.core.Short.$box(read$O(a1));
        }
        
        
    
        
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        public short read$O(final x10.io.Reader r) {
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final byte b1 = r.read$O();
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final byte b2 = r.read$O();
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$91005 = ((int)(byte)(((byte)(b1))));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$91006 = ((t$91005) & (((int)(255))));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long t$91007 = ((long)(((int)(8))));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$91009 = ((t$91006) << (int)(((long)(t$91007))));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$91008 = ((int)(byte)(((byte)(b2))));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$91010 = ((t$91008) & (((int)(255))));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$91011 = ((t$91009) | (((int)(t$91010))));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final short t$91012 = ((short)(int)(((int)(t$91011))));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            return t$91012;
        }
        
        
        //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        public void write(final x10.io.Writer w, final short s) {
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int i = ((int)(short)(((short)(s))));
            
            //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long t$91013 = ((long)(((int)(8))));
            
            //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$91014 = ((i) >> (int)(((long)(t$91013))));
            
            //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final byte b1 = ((byte)(int)(((int)(t$91014))));
            
            //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final byte b2 = ((byte)(int)(((int)(i))));
            
            //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            w.write((byte)(b1));
            
            //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            w.write((byte)(b2));
        }
        
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final public x10.io.Marshal.ShortMarshal x10$io$Marshal$ShortMarshal$$this$x10$io$Marshal$ShortMarshal() {
            
            //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            return x10.io.Marshal.ShortMarshal.this;
        }
        
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        // creation method for java code (1-phase java constructor)
        public ShortMarshal() {
            this((java.lang.System[]) null);
            x10$io$Marshal$ShortMarshal$$init$S();
        }
        
        // constructor for non-virtual call
        final public x10.io.Marshal.ShortMarshal x10$io$Marshal$ShortMarshal$$init$S() {
             {
                
                //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                
                
                //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final x10.io.Marshal.ShortMarshal this$90853 = this;
            }
            return this;
        }
        
        
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final public void __fieldInitializers_x10_io_Marshal_ShortMarshal() {
            
        }
    }
    
    
    //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    @x10.runtime.impl.java.X10Generated
    final public static class UShortMarshal extends x10.core.Ref implements x10.io.Marshal, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<UShortMarshal> $RTT = 
            x10.rtt.NamedType.<UShortMarshal> make("x10.io.Marshal.UShortMarshal",
                                                   UShortMarshal.class,
                                                   new x10.rtt.Type[] {
                                                       x10.rtt.ParameterizedType.make(x10.io.Marshal.$RTT, x10.rtt.Types.USHORT)
                                                   });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.Marshal.UShortMarshal $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.io.Marshal.UShortMarshal $_obj = new x10.io.Marshal.UShortMarshal((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public UShortMarshal(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public x10.io.Marshal[T].write(w:x10.io.Writer, v:T){}:void
        public java.lang.Object write(final x10.io.Writer a1, final java.lang.Object a2, final x10.rtt.Type t2) {
            write__1$u((x10.io.Writer)a1, x10.core.UShort.$unbox(a2)); return null;
            
        }
        
        // dispatcher for method abstract public x10.io.Marshal[T].write(w:x10.io.Writer, v:T){}:void
        public void write$V(final x10.io.Writer a1, final java.lang.Object a2, final x10.rtt.Type t2) {
            write__1$u((x10.io.Writer)a1, x10.core.UShort.$unbox(a2));
            
        }
        
        // bridge for method abstract public x10.io.Marshal[T].read(r:x10.io.Reader){}:T
        public x10.core.UShort read$G(x10.io.Reader a1) {
            return x10.core.UShort.$box(read$O(a1));
        }
        
        
    
        
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        public short read$O(final x10.io.Reader r) {
            
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final short t$91015 = r.readShort$O();
            
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final short t$91016 = ((short)(short)(((short)(t$91015))));
            
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            return t$91016;
        }
        
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        public void write__1$u(final x10.io.Writer w, final short us) {
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final short t$91017 = ((short)(((short)(us))));
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            w.writeShort((short)(t$91017));
        }
        
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final public x10.io.Marshal.UShortMarshal x10$io$Marshal$UShortMarshal$$this$x10$io$Marshal$UShortMarshal() {
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            return x10.io.Marshal.UShortMarshal.this;
        }
        
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        // creation method for java code (1-phase java constructor)
        public UShortMarshal() {
            this((java.lang.System[]) null);
            x10$io$Marshal$UShortMarshal$$init$S();
        }
        
        // constructor for non-virtual call
        final public x10.io.Marshal.UShortMarshal x10$io$Marshal$UShortMarshal$$init$S() {
             {
                
                //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                
                
                //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final x10.io.Marshal.UShortMarshal this$90856 = this;
            }
            return this;
        }
        
        
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final public void __fieldInitializers_x10_io_Marshal_UShortMarshal() {
            
        }
    }
    
    
    //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    @x10.runtime.impl.java.X10Generated
    final public static class IntMarshal extends x10.core.Ref implements x10.io.Marshal, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<IntMarshal> $RTT = 
            x10.rtt.NamedType.<IntMarshal> make("x10.io.Marshal.IntMarshal",
                                                IntMarshal.class,
                                                new x10.rtt.Type[] {
                                                    x10.rtt.ParameterizedType.make(x10.io.Marshal.$RTT, x10.rtt.Types.INT)
                                                });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.Marshal.IntMarshal $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.io.Marshal.IntMarshal $_obj = new x10.io.Marshal.IntMarshal((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public IntMarshal(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public x10.io.Marshal[T].write(w:x10.io.Writer, v:T){}:void
        public java.lang.Object write(final x10.io.Writer a1, final java.lang.Object a2, final x10.rtt.Type t2) {
            write((x10.io.Writer)a1, x10.core.Int.$unbox(a2)); return null;
            
        }
        
        // dispatcher for method abstract public x10.io.Marshal[T].write(w:x10.io.Writer, v:T){}:void
        public void write$V(final x10.io.Writer a1, final java.lang.Object a2, final x10.rtt.Type t2) {
            write((x10.io.Writer)a1, x10.core.Int.$unbox(a2));
            
        }
        
        // bridge for method abstract public x10.io.Marshal[T].read(r:x10.io.Reader){}:T
        public x10.core.Int read$G(x10.io.Reader a1) {
            return x10.core.Int.$box(read$O(a1));
        }
        
        
    
        
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        public int read$O(final x10.io.Reader r) {
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final byte b1 = r.read$O();
            
            //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final byte b2 = r.read$O();
            
            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final byte b3 = r.read$O();
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final byte b4 = r.read$O();
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$91018 = ((int)(byte)(((byte)(b1))));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$91019 = ((t$91018) & (((int)(255))));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long t$91020 = ((long)(((int)(24))));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$91024 = ((t$91019) << (int)(((long)(t$91020))));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$91021 = ((int)(byte)(((byte)(b2))));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$91022 = ((t$91021) & (((int)(255))));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long t$91023 = ((long)(((int)(16))));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$91025 = ((t$91022) << (int)(((long)(t$91023))));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$91029 = ((t$91024) | (((int)(t$91025))));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$91026 = ((int)(byte)(((byte)(b3))));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$91027 = ((t$91026) & (((int)(255))));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long t$91028 = ((long)(((int)(8))));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$91030 = ((t$91027) << (int)(((long)(t$91028))));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$91032 = ((t$91029) | (((int)(t$91030))));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$91031 = ((int)(byte)(((byte)(b4))));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$91033 = ((t$91031) & (((int)(255))));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$91034 = ((t$91032) | (((int)(t$91033))));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$91035 = t$91034;
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            return t$91035;
        }
        
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        public void write(final x10.io.Writer w, final int i) {
            
            //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long t$91036 = ((long)(((int)(24))));
            
            //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$91037 = ((i) >> (int)(((long)(t$91036))));
            
            //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final byte b1 = ((byte)(int)(((int)(t$91037))));
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long t$91038 = ((long)(((int)(16))));
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$91039 = ((i) >> (int)(((long)(t$91038))));
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final byte b2 = ((byte)(int)(((int)(t$91039))));
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long t$91040 = ((long)(((int)(8))));
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$91041 = ((i) >> (int)(((long)(t$91040))));
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final byte b3 = ((byte)(int)(((int)(t$91041))));
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final byte b4 = ((byte)(int)(((int)(i))));
            
            //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            w.write((byte)(b1));
            
            //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            w.write((byte)(b2));
            
            //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            w.write((byte)(b3));
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            w.write((byte)(b4));
        }
        
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final public x10.io.Marshal.IntMarshal x10$io$Marshal$IntMarshal$$this$x10$io$Marshal$IntMarshal() {
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            return x10.io.Marshal.IntMarshal.this;
        }
        
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        // creation method for java code (1-phase java constructor)
        public IntMarshal() {
            this((java.lang.System[]) null);
            x10$io$Marshal$IntMarshal$$init$S();
        }
        
        // constructor for non-virtual call
        final public x10.io.Marshal.IntMarshal x10$io$Marshal$IntMarshal$$init$S() {
             {
                
                //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                
                
                //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final x10.io.Marshal.IntMarshal this$90859 = this;
            }
            return this;
        }
        
        
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final public void __fieldInitializers_x10_io_Marshal_IntMarshal() {
            
        }
    }
    
    
    //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    @x10.runtime.impl.java.X10Generated
    final public static class UIntMarshal extends x10.core.Ref implements x10.io.Marshal, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<UIntMarshal> $RTT = 
            x10.rtt.NamedType.<UIntMarshal> make("x10.io.Marshal.UIntMarshal",
                                                 UIntMarshal.class,
                                                 new x10.rtt.Type[] {
                                                     x10.rtt.ParameterizedType.make(x10.io.Marshal.$RTT, x10.rtt.Types.UINT)
                                                 });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.Marshal.UIntMarshal $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.io.Marshal.UIntMarshal $_obj = new x10.io.Marshal.UIntMarshal((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public UIntMarshal(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public x10.io.Marshal[T].write(w:x10.io.Writer, v:T){}:void
        public java.lang.Object write(final x10.io.Writer a1, final java.lang.Object a2, final x10.rtt.Type t2) {
            write__1$u((x10.io.Writer)a1, x10.core.UInt.$unbox(a2)); return null;
            
        }
        
        // dispatcher for method abstract public x10.io.Marshal[T].write(w:x10.io.Writer, v:T){}:void
        public void write$V(final x10.io.Writer a1, final java.lang.Object a2, final x10.rtt.Type t2) {
            write__1$u((x10.io.Writer)a1, x10.core.UInt.$unbox(a2));
            
        }
        
        // bridge for method abstract public x10.io.Marshal[T].read(r:x10.io.Reader){}:T
        public x10.core.UInt read$G(x10.io.Reader a1) {
            return x10.core.UInt.$box(read$O(a1));
        }
        
        
    
        
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        public int read$O(final x10.io.Reader r) {
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$91042 = r.readInt$O();
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$91043 = ((int)(((int)(t$91042))));
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            return t$91043;
        }
        
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        public void write__1$u(final x10.io.Writer w, final int ui) {
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int t$91044 = ((int)((int)(ui)));
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            w.writeInt((int)(t$91044));
        }
        
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final public x10.io.Marshal.UIntMarshal x10$io$Marshal$UIntMarshal$$this$x10$io$Marshal$UIntMarshal() {
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            return x10.io.Marshal.UIntMarshal.this;
        }
        
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        // creation method for java code (1-phase java constructor)
        public UIntMarshal() {
            this((java.lang.System[]) null);
            x10$io$Marshal$UIntMarshal$$init$S();
        }
        
        // constructor for non-virtual call
        final public x10.io.Marshal.UIntMarshal x10$io$Marshal$UIntMarshal$$init$S() {
             {
                
                //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                
                
                //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final x10.io.Marshal.UIntMarshal this$90862 = this;
            }
            return this;
        }
        
        
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final public void __fieldInitializers_x10_io_Marshal_UIntMarshal() {
            
        }
    }
    
    
    //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    @x10.runtime.impl.java.X10Generated
    final public static class LongMarshal extends x10.core.Ref implements x10.io.Marshal, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<LongMarshal> $RTT = 
            x10.rtt.NamedType.<LongMarshal> make("x10.io.Marshal.LongMarshal",
                                                 LongMarshal.class,
                                                 new x10.rtt.Type[] {
                                                     x10.rtt.ParameterizedType.make(x10.io.Marshal.$RTT, x10.rtt.Types.LONG)
                                                 });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.Marshal.LongMarshal $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.io.Marshal.LongMarshal $_obj = new x10.io.Marshal.LongMarshal((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public LongMarshal(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public x10.io.Marshal[T].write(w:x10.io.Writer, v:T){}:void
        public java.lang.Object write(final x10.io.Writer a1, final java.lang.Object a2, final x10.rtt.Type t2) {
            write((x10.io.Writer)a1, x10.core.Long.$unbox(a2)); return null;
            
        }
        
        // dispatcher for method abstract public x10.io.Marshal[T].write(w:x10.io.Writer, v:T){}:void
        public void write$V(final x10.io.Writer a1, final java.lang.Object a2, final x10.rtt.Type t2) {
            write((x10.io.Writer)a1, x10.core.Long.$unbox(a2));
            
        }
        
        // bridge for method abstract public x10.io.Marshal[T].read(r:x10.io.Reader){}:T
        public x10.core.Long read$G(x10.io.Reader a1) {
            return x10.core.Long.$box(read$O(a1));
        }
        
        
    
        
        
        //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        public long read$O(final x10.io.Reader r) {
            
            //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            long l = 0L;
            
            //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            int i$91086 = 0;
            
            //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            for (;
                 true;
                 ) {
                
                //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$91087 = i$91086;
                
                //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final boolean t$91088 = ((t$91087) < (((int)(8))));
                
                //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                if (!(t$91088)) {
                    
                    //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                    break;
                }
                
                //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final byte b$91076 = r.read$O();
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$91077 = l;
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$91078 = ((long)(((int)(8))));
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$91079 = ((t$91077) << (int)(((long)(t$91078))));
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$91080 = ((int)(byte)(((byte)(b$91076))));
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$91081 = ((t$91080) & (((int)(255))));
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$91082 = ((long)(((int)(t$91081))));
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$91083 = ((t$91079) | (((long)(t$91082))));
                
                //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                l = t$91083;
                
                //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$91084 = i$91086;
                
                //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$91085 = ((t$91084) + (((int)(1))));
                
                //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                i$91086 = t$91085;
            }
            
            //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long t$91057 = l;
            
            //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            return t$91057;
        }
        
        
        //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        public void write(final x10.io.Writer w, final long l) {
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            int shift = 64;
            
            //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            while (true) {
                
                //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$91058 = shift;
                
                //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$91059 = ((long)(((int)(t$91058))));
                
                //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final boolean t$91066 = ((t$91059) > (((long)(0L))));
                
                //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                if (!(t$91066)) {
                    
                    //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                    break;
                }
                
                //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$91089 = shift;
                
                //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$91090 = ((long)(((int)(t$91089))));
                
                //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$91091 = ((t$91090) - (((long)(8L))));
                
                //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                shift = ((int)(((long)(t$91091))));
                
                //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final int t$91092 = shift;
                
                //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$91093 = ((long)(((int)(t$91092))));
                
                //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final long t$91094 = ((l) >> (int)(((long)(t$91093))));
                
                //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final byte b$91095 = ((byte)(long)(((long)(t$91094))));
                
                //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                w.write((byte)(b$91095));
            }
        }
        
        
        //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final public x10.io.Marshal.LongMarshal x10$io$Marshal$LongMarshal$$this$x10$io$Marshal$LongMarshal() {
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            return x10.io.Marshal.LongMarshal.this;
        }
        
        
        //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        // creation method for java code (1-phase java constructor)
        public LongMarshal() {
            this((java.lang.System[]) null);
            x10$io$Marshal$LongMarshal$$init$S();
        }
        
        // constructor for non-virtual call
        final public x10.io.Marshal.LongMarshal x10$io$Marshal$LongMarshal$$init$S() {
             {
                
                //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                
                
                //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final x10.io.Marshal.LongMarshal this$90865 = this;
            }
            return this;
        }
        
        
        
        //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final public void __fieldInitializers_x10_io_Marshal_LongMarshal() {
            
        }
    }
    
    
    //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    @x10.runtime.impl.java.X10Generated
    final public static class ULongMarshal extends x10.core.Ref implements x10.io.Marshal, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<ULongMarshal> $RTT = 
            x10.rtt.NamedType.<ULongMarshal> make("x10.io.Marshal.ULongMarshal",
                                                  ULongMarshal.class,
                                                  new x10.rtt.Type[] {
                                                      x10.rtt.ParameterizedType.make(x10.io.Marshal.$RTT, x10.rtt.Types.ULONG)
                                                  });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.Marshal.ULongMarshal $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.io.Marshal.ULongMarshal $_obj = new x10.io.Marshal.ULongMarshal((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public ULongMarshal(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public x10.io.Marshal[T].write(w:x10.io.Writer, v:T){}:void
        public java.lang.Object write(final x10.io.Writer a1, final java.lang.Object a2, final x10.rtt.Type t2) {
            write__1$u((x10.io.Writer)a1, x10.core.ULong.$unbox(a2)); return null;
            
        }
        
        // dispatcher for method abstract public x10.io.Marshal[T].write(w:x10.io.Writer, v:T){}:void
        public void write$V(final x10.io.Writer a1, final java.lang.Object a2, final x10.rtt.Type t2) {
            write__1$u((x10.io.Writer)a1, x10.core.ULong.$unbox(a2));
            
        }
        
        // bridge for method abstract public x10.io.Marshal[T].read(r:x10.io.Reader){}:T
        public x10.core.ULong read$G(x10.io.Reader a1) {
            return x10.core.ULong.$box(read$O(a1));
        }
        
        
    
        
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        public long read$O(final x10.io.Reader r) {
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long t$91067 = r.readLong$O();
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long t$91068 = ((long)(((long)(t$91067))));
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            return t$91068;
        }
        
        
        //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        public void write__1$u(final x10.io.Writer w, final long ul) {
            
            //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long t$91069 = ((long)(((long)(ul))));
            
            //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            w.writeLong((long)(t$91069));
        }
        
        
        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final public x10.io.Marshal.ULongMarshal x10$io$Marshal$ULongMarshal$$this$x10$io$Marshal$ULongMarshal() {
            
            //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            return x10.io.Marshal.ULongMarshal.this;
        }
        
        
        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        // creation method for java code (1-phase java constructor)
        public ULongMarshal() {
            this((java.lang.System[]) null);
            x10$io$Marshal$ULongMarshal$$init$S();
        }
        
        // constructor for non-virtual call
        final public x10.io.Marshal.ULongMarshal x10$io$Marshal$ULongMarshal$$init$S() {
             {
                
                //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                
                
                //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final x10.io.Marshal.ULongMarshal this$90868 = this;
            }
            return this;
        }
        
        
        
        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final public void __fieldInitializers_x10_io_Marshal_ULongMarshal() {
            
        }
    }
    
    
    //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    @x10.runtime.impl.java.X10Generated
    final public static class FloatMarshal extends x10.core.Ref implements x10.io.Marshal, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<FloatMarshal> $RTT = 
            x10.rtt.NamedType.<FloatMarshal> make("x10.io.Marshal.FloatMarshal",
                                                  FloatMarshal.class,
                                                  new x10.rtt.Type[] {
                                                      x10.rtt.ParameterizedType.make(x10.io.Marshal.$RTT, x10.rtt.Types.FLOAT)
                                                  });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.Marshal.FloatMarshal $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.io.Marshal.FloatMarshal $_obj = new x10.io.Marshal.FloatMarshal((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public FloatMarshal(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public x10.io.Marshal[T].write(w:x10.io.Writer, v:T){}:void
        public java.lang.Object write(final x10.io.Writer a1, final java.lang.Object a2, final x10.rtt.Type t2) {
            write((x10.io.Writer)a1, x10.core.Float.$unbox(a2)); return null;
            
        }
        
        // dispatcher for method abstract public x10.io.Marshal[T].write(w:x10.io.Writer, v:T){}:void
        public void write$V(final x10.io.Writer a1, final java.lang.Object a2, final x10.rtt.Type t2) {
            write((x10.io.Writer)a1, x10.core.Float.$unbox(a2));
            
        }
        
        // bridge for method abstract public x10.io.Marshal[T].read(r:x10.io.Reader){}:T
        public x10.core.Float read$G(x10.io.Reader a1) {
            return x10.core.Float.$box(read$O(a1));
        }
        
        
    
        
        
        //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        public float read$O(final x10.io.Reader r) {
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final x10.io.Marshal.IntMarshal t$91070 = ((x10.io.Marshal.IntMarshal)(x10.io.Marshal.$Shadow.get$INT()));
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int i = t$91070.read$O(((x10.io.Reader)(r)));
            
            //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final float t$91071 = java.lang.Float.intBitsToFloat(((int)(i)));
            
            //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            return t$91071;
        }
        
        
        //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        public void write(final x10.io.Writer w, final float f) {
            
            //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final int i = java.lang.Float.floatToIntBits(f);
            
            //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final x10.io.Marshal.IntMarshal t$91072 = ((x10.io.Marshal.IntMarshal)(x10.io.Marshal.$Shadow.get$INT()));
            
            //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            t$91072.write(((x10.io.Writer)(w)), (int)(i));
        }
        
        
        //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final public x10.io.Marshal.FloatMarshal x10$io$Marshal$FloatMarshal$$this$x10$io$Marshal$FloatMarshal() {
            
            //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            return x10.io.Marshal.FloatMarshal.this;
        }
        
        
        //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        // creation method for java code (1-phase java constructor)
        public FloatMarshal() {
            this((java.lang.System[]) null);
            x10$io$Marshal$FloatMarshal$$init$S();
        }
        
        // constructor for non-virtual call
        final public x10.io.Marshal.FloatMarshal x10$io$Marshal$FloatMarshal$$init$S() {
             {
                
                //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                
                
                //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final x10.io.Marshal.FloatMarshal this$90871 = this;
            }
            return this;
        }
        
        
        
        //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final public void __fieldInitializers_x10_io_Marshal_FloatMarshal() {
            
        }
    }
    
    
    //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    @x10.runtime.impl.java.X10Generated
    final public static class DoubleMarshal extends x10.core.Ref implements x10.io.Marshal, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<DoubleMarshal> $RTT = 
            x10.rtt.NamedType.<DoubleMarshal> make("x10.io.Marshal.DoubleMarshal",
                                                   DoubleMarshal.class,
                                                   new x10.rtt.Type[] {
                                                       x10.rtt.ParameterizedType.make(x10.io.Marshal.$RTT, x10.rtt.Types.DOUBLE)
                                                   });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.Marshal.DoubleMarshal $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.io.Marshal.DoubleMarshal $_obj = new x10.io.Marshal.DoubleMarshal((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public DoubleMarshal(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public x10.io.Marshal[T].write(w:x10.io.Writer, v:T){}:void
        public java.lang.Object write(final x10.io.Writer a1, final java.lang.Object a2, final x10.rtt.Type t2) {
            write((x10.io.Writer)a1, x10.core.Double.$unbox(a2)); return null;
            
        }
        
        // dispatcher for method abstract public x10.io.Marshal[T].write(w:x10.io.Writer, v:T){}:void
        public void write$V(final x10.io.Writer a1, final java.lang.Object a2, final x10.rtt.Type t2) {
            write((x10.io.Writer)a1, x10.core.Double.$unbox(a2));
            
        }
        
        // bridge for method abstract public x10.io.Marshal[T].read(r:x10.io.Reader){}:T
        public x10.core.Double read$G(x10.io.Reader a1) {
            return x10.core.Double.$box(read$O(a1));
        }
        
        
    
        
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        public double read$O(final x10.io.Reader r) {
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final x10.io.Marshal.LongMarshal t$91073 = ((x10.io.Marshal.LongMarshal)(x10.io.Marshal.$Shadow.get$LONG()));
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long l = t$91073.read$O(((x10.io.Reader)(r)));
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final double t$91074 = java.lang.Double.longBitsToDouble(((long)(l)));
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            return t$91074;
        }
        
        
        //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        public void write(final x10.io.Writer w, final double d) {
            
            //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final long l = java.lang.Double.doubleToLongBits(d);
            
            //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            final x10.io.Marshal.LongMarshal t$91075 = ((x10.io.Marshal.LongMarshal)(x10.io.Marshal.$Shadow.get$LONG()));
            
            //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            t$91075.write(((x10.io.Writer)(w)), (long)(l));
        }
        
        
        //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final public x10.io.Marshal.DoubleMarshal x10$io$Marshal$DoubleMarshal$$this$x10$io$Marshal$DoubleMarshal() {
            
            //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            return x10.io.Marshal.DoubleMarshal.this;
        }
        
        
        //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        // creation method for java code (1-phase java constructor)
        public DoubleMarshal() {
            this((java.lang.System[]) null);
            x10$io$Marshal$DoubleMarshal$$init$S();
        }
        
        // constructor for non-virtual call
        final public x10.io.Marshal.DoubleMarshal x10$io$Marshal$DoubleMarshal$$init$S() {
             {
                
                //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                
                
                //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                final x10.io.Marshal.DoubleMarshal this$90874 = this;
            }
            return this;
        }
        
        
        
        //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        final public void __fieldInitializers_x10_io_Marshal_DoubleMarshal() {
            
        }
    }
    
    @x10.runtime.impl.java.X10Generated
    abstract public class $Shadow extends x10.core.Ref implements x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Shadow> $RTT = 
            x10.rtt.NamedType.<$Shadow> make("x10.io.Marshal.$Shadow",
                                             $Shadow.class);
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.Marshal.$Shadow $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return null;
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Shadow(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        private static x10.io.Marshal.LineMarshal LINE;
        final private static x10.core.concurrent.AtomicInteger initStatus$LINE = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
        private static x10.lang.ExceptionInInitializer exception$LINE;
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        private static x10.io.Marshal.DoubleMarshal DOUBLE;
        final private static x10.core.concurrent.AtomicInteger initStatus$DOUBLE = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
        private static x10.lang.ExceptionInInitializer exception$DOUBLE;
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        private static x10.io.Marshal.FloatMarshal FLOAT;
        final private static x10.core.concurrent.AtomicInteger initStatus$FLOAT = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
        private static x10.lang.ExceptionInInitializer exception$FLOAT;
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        private static x10.io.Marshal.ULongMarshal ULONG;
        final private static x10.core.concurrent.AtomicInteger initStatus$ULONG = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
        private static x10.lang.ExceptionInInitializer exception$ULONG;
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        private static x10.io.Marshal.LongMarshal LONG;
        final private static x10.core.concurrent.AtomicInteger initStatus$LONG = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
        private static x10.lang.ExceptionInInitializer exception$LONG;
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        private static x10.io.Marshal.UIntMarshal UINT;
        final private static x10.core.concurrent.AtomicInteger initStatus$UINT = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
        private static x10.lang.ExceptionInInitializer exception$UINT;
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        private static x10.io.Marshal.IntMarshal INT;
        final private static x10.core.concurrent.AtomicInteger initStatus$INT = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
        private static x10.lang.ExceptionInInitializer exception$INT;
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        private static x10.io.Marshal.UShortMarshal USHORT;
        final private static x10.core.concurrent.AtomicInteger initStatus$USHORT = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
        private static x10.lang.ExceptionInInitializer exception$USHORT;
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        private static x10.io.Marshal.ShortMarshal SHORT;
        final private static x10.core.concurrent.AtomicInteger initStatus$SHORT = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
        private static x10.lang.ExceptionInInitializer exception$SHORT;
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        private static x10.io.Marshal.CharMarshal CHAR;
        final private static x10.core.concurrent.AtomicInteger initStatus$CHAR = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
        private static x10.lang.ExceptionInInitializer exception$CHAR;
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        private static x10.io.Marshal.UByteMarshal UBYTE;
        final private static x10.core.concurrent.AtomicInteger initStatus$UBYTE = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
        private static x10.lang.ExceptionInInitializer exception$UBYTE;
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        private static x10.io.Marshal.ByteMarshal BYTE;
        final private static x10.core.concurrent.AtomicInteger initStatus$BYTE = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
        private static x10.lang.ExceptionInInitializer exception$BYTE;
        
        //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        private static x10.io.Marshal.BooleanMarshal BOOLEAN;
        final private static x10.core.concurrent.AtomicInteger initStatus$BOOLEAN = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
        private static x10.lang.ExceptionInInitializer exception$BOOLEAN;
        
        public static x10.io.Marshal.BooleanMarshal get$BOOLEAN() {
            if (((int) x10.io.Marshal.$Shadow.initStatus$BOOLEAN.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
                return x10.io.Marshal.$Shadow.BOOLEAN;
            }
            if (((int) x10.io.Marshal.$Shadow.initStatus$BOOLEAN.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                throw x10.io.Marshal.$Shadow.exception$BOOLEAN;
            }
            if (x10.io.Marshal.$Shadow.initStatus$BOOLEAN.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
                try {{
                    x10.io.Marshal.$Shadow.BOOLEAN = ((x10.io.Marshal.BooleanMarshal)(new x10.io.Marshal.BooleanMarshal((java.lang.System[]) null).x10$io$Marshal$BooleanMarshal$$init$S()));
                }}catch (java.lang.Throwable exc$91096) {
                    x10.io.Marshal.$Shadow.exception$BOOLEAN = new x10.lang.ExceptionInInitializer(exc$91096);
                    x10.io.Marshal.$Shadow.initStatus$BOOLEAN.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                    throw x10.io.Marshal.$Shadow.exception$BOOLEAN;
                }
                x10.io.Marshal.$Shadow.initStatus$BOOLEAN.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
            } else {
                if (x10.io.Marshal.$Shadow.initStatus$BOOLEAN.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    while (x10.io.Marshal.$Shadow.initStatus$BOOLEAN.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                        x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                    }
                    x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                    if (((int) x10.io.Marshal.$Shadow.initStatus$BOOLEAN.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                        throw x10.io.Marshal.$Shadow.exception$BOOLEAN;
                    }
                }
            }
            return x10.io.Marshal.$Shadow.BOOLEAN;
        }
        
        public static x10.io.Marshal.ByteMarshal get$BYTE() {
            if (((int) x10.io.Marshal.$Shadow.initStatus$BYTE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
                return x10.io.Marshal.$Shadow.BYTE;
            }
            if (((int) x10.io.Marshal.$Shadow.initStatus$BYTE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                throw x10.io.Marshal.$Shadow.exception$BYTE;
            }
            if (x10.io.Marshal.$Shadow.initStatus$BYTE.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
                try {{
                    x10.io.Marshal.$Shadow.BYTE = ((x10.io.Marshal.ByteMarshal)(new x10.io.Marshal.ByteMarshal((java.lang.System[]) null).x10$io$Marshal$ByteMarshal$$init$S()));
                }}catch (java.lang.Throwable exc$91097) {
                    x10.io.Marshal.$Shadow.exception$BYTE = new x10.lang.ExceptionInInitializer(exc$91097);
                    x10.io.Marshal.$Shadow.initStatus$BYTE.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                    throw x10.io.Marshal.$Shadow.exception$BYTE;
                }
                x10.io.Marshal.$Shadow.initStatus$BYTE.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
            } else {
                if (x10.io.Marshal.$Shadow.initStatus$BYTE.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    while (x10.io.Marshal.$Shadow.initStatus$BYTE.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                        x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                    }
                    x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                    if (((int) x10.io.Marshal.$Shadow.initStatus$BYTE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                        throw x10.io.Marshal.$Shadow.exception$BYTE;
                    }
                }
            }
            return x10.io.Marshal.$Shadow.BYTE;
        }
        
        public static x10.io.Marshal.UByteMarshal get$UBYTE() {
            if (((int) x10.io.Marshal.$Shadow.initStatus$UBYTE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
                return x10.io.Marshal.$Shadow.UBYTE;
            }
            if (((int) x10.io.Marshal.$Shadow.initStatus$UBYTE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                throw x10.io.Marshal.$Shadow.exception$UBYTE;
            }
            if (x10.io.Marshal.$Shadow.initStatus$UBYTE.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
                try {{
                    x10.io.Marshal.$Shadow.UBYTE = ((x10.io.Marshal.UByteMarshal)(new x10.io.Marshal.UByteMarshal((java.lang.System[]) null).x10$io$Marshal$UByteMarshal$$init$S()));
                }}catch (java.lang.Throwable exc$91098) {
                    x10.io.Marshal.$Shadow.exception$UBYTE = new x10.lang.ExceptionInInitializer(exc$91098);
                    x10.io.Marshal.$Shadow.initStatus$UBYTE.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                    throw x10.io.Marshal.$Shadow.exception$UBYTE;
                }
                x10.io.Marshal.$Shadow.initStatus$UBYTE.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
            } else {
                if (x10.io.Marshal.$Shadow.initStatus$UBYTE.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    while (x10.io.Marshal.$Shadow.initStatus$UBYTE.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                        x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                    }
                    x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                    if (((int) x10.io.Marshal.$Shadow.initStatus$UBYTE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                        throw x10.io.Marshal.$Shadow.exception$UBYTE;
                    }
                }
            }
            return x10.io.Marshal.$Shadow.UBYTE;
        }
        
        public static x10.io.Marshal.CharMarshal get$CHAR() {
            if (((int) x10.io.Marshal.$Shadow.initStatus$CHAR.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
                return x10.io.Marshal.$Shadow.CHAR;
            }
            if (((int) x10.io.Marshal.$Shadow.initStatus$CHAR.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                throw x10.io.Marshal.$Shadow.exception$CHAR;
            }
            if (x10.io.Marshal.$Shadow.initStatus$CHAR.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
                try {{
                    x10.io.Marshal.$Shadow.CHAR = ((x10.io.Marshal.CharMarshal)(new x10.io.Marshal.CharMarshal((java.lang.System[]) null).x10$io$Marshal$CharMarshal$$init$S()));
                }}catch (java.lang.Throwable exc$91099) {
                    x10.io.Marshal.$Shadow.exception$CHAR = new x10.lang.ExceptionInInitializer(exc$91099);
                    x10.io.Marshal.$Shadow.initStatus$CHAR.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                    throw x10.io.Marshal.$Shadow.exception$CHAR;
                }
                x10.io.Marshal.$Shadow.initStatus$CHAR.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
            } else {
                if (x10.io.Marshal.$Shadow.initStatus$CHAR.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    while (x10.io.Marshal.$Shadow.initStatus$CHAR.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                        x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                    }
                    x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                    if (((int) x10.io.Marshal.$Shadow.initStatus$CHAR.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                        throw x10.io.Marshal.$Shadow.exception$CHAR;
                    }
                }
            }
            return x10.io.Marshal.$Shadow.CHAR;
        }
        
        public static x10.io.Marshal.ShortMarshal get$SHORT() {
            if (((int) x10.io.Marshal.$Shadow.initStatus$SHORT.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
                return x10.io.Marshal.$Shadow.SHORT;
            }
            if (((int) x10.io.Marshal.$Shadow.initStatus$SHORT.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                throw x10.io.Marshal.$Shadow.exception$SHORT;
            }
            if (x10.io.Marshal.$Shadow.initStatus$SHORT.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
                try {{
                    x10.io.Marshal.$Shadow.SHORT = ((x10.io.Marshal.ShortMarshal)(new x10.io.Marshal.ShortMarshal((java.lang.System[]) null).x10$io$Marshal$ShortMarshal$$init$S()));
                }}catch (java.lang.Throwable exc$91100) {
                    x10.io.Marshal.$Shadow.exception$SHORT = new x10.lang.ExceptionInInitializer(exc$91100);
                    x10.io.Marshal.$Shadow.initStatus$SHORT.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                    throw x10.io.Marshal.$Shadow.exception$SHORT;
                }
                x10.io.Marshal.$Shadow.initStatus$SHORT.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
            } else {
                if (x10.io.Marshal.$Shadow.initStatus$SHORT.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    while (x10.io.Marshal.$Shadow.initStatus$SHORT.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                        x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                    }
                    x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                    if (((int) x10.io.Marshal.$Shadow.initStatus$SHORT.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                        throw x10.io.Marshal.$Shadow.exception$SHORT;
                    }
                }
            }
            return x10.io.Marshal.$Shadow.SHORT;
        }
        
        public static x10.io.Marshal.UShortMarshal get$USHORT() {
            if (((int) x10.io.Marshal.$Shadow.initStatus$USHORT.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
                return x10.io.Marshal.$Shadow.USHORT;
            }
            if (((int) x10.io.Marshal.$Shadow.initStatus$USHORT.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                throw x10.io.Marshal.$Shadow.exception$USHORT;
            }
            if (x10.io.Marshal.$Shadow.initStatus$USHORT.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
                try {{
                    x10.io.Marshal.$Shadow.USHORT = ((x10.io.Marshal.UShortMarshal)(new x10.io.Marshal.UShortMarshal((java.lang.System[]) null).x10$io$Marshal$UShortMarshal$$init$S()));
                }}catch (java.lang.Throwable exc$91101) {
                    x10.io.Marshal.$Shadow.exception$USHORT = new x10.lang.ExceptionInInitializer(exc$91101);
                    x10.io.Marshal.$Shadow.initStatus$USHORT.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                    throw x10.io.Marshal.$Shadow.exception$USHORT;
                }
                x10.io.Marshal.$Shadow.initStatus$USHORT.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
            } else {
                if (x10.io.Marshal.$Shadow.initStatus$USHORT.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    while (x10.io.Marshal.$Shadow.initStatus$USHORT.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                        x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                    }
                    x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                    if (((int) x10.io.Marshal.$Shadow.initStatus$USHORT.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                        throw x10.io.Marshal.$Shadow.exception$USHORT;
                    }
                }
            }
            return x10.io.Marshal.$Shadow.USHORT;
        }
        
        public static x10.io.Marshal.IntMarshal get$INT() {
            if (((int) x10.io.Marshal.$Shadow.initStatus$INT.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
                return x10.io.Marshal.$Shadow.INT;
            }
            if (((int) x10.io.Marshal.$Shadow.initStatus$INT.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                throw x10.io.Marshal.$Shadow.exception$INT;
            }
            if (x10.io.Marshal.$Shadow.initStatus$INT.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
                try {{
                    x10.io.Marshal.$Shadow.INT = ((x10.io.Marshal.IntMarshal)(new x10.io.Marshal.IntMarshal((java.lang.System[]) null).x10$io$Marshal$IntMarshal$$init$S()));
                }}catch (java.lang.Throwable exc$91102) {
                    x10.io.Marshal.$Shadow.exception$INT = new x10.lang.ExceptionInInitializer(exc$91102);
                    x10.io.Marshal.$Shadow.initStatus$INT.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                    throw x10.io.Marshal.$Shadow.exception$INT;
                }
                x10.io.Marshal.$Shadow.initStatus$INT.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
            } else {
                if (x10.io.Marshal.$Shadow.initStatus$INT.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    while (x10.io.Marshal.$Shadow.initStatus$INT.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                        x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                    }
                    x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                    if (((int) x10.io.Marshal.$Shadow.initStatus$INT.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                        throw x10.io.Marshal.$Shadow.exception$INT;
                    }
                }
            }
            return x10.io.Marshal.$Shadow.INT;
        }
        
        public static x10.io.Marshal.UIntMarshal get$UINT() {
            if (((int) x10.io.Marshal.$Shadow.initStatus$UINT.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
                return x10.io.Marshal.$Shadow.UINT;
            }
            if (((int) x10.io.Marshal.$Shadow.initStatus$UINT.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                throw x10.io.Marshal.$Shadow.exception$UINT;
            }
            if (x10.io.Marshal.$Shadow.initStatus$UINT.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
                try {{
                    x10.io.Marshal.$Shadow.UINT = ((x10.io.Marshal.UIntMarshal)(new x10.io.Marshal.UIntMarshal((java.lang.System[]) null).x10$io$Marshal$UIntMarshal$$init$S()));
                }}catch (java.lang.Throwable exc$91103) {
                    x10.io.Marshal.$Shadow.exception$UINT = new x10.lang.ExceptionInInitializer(exc$91103);
                    x10.io.Marshal.$Shadow.initStatus$UINT.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                    throw x10.io.Marshal.$Shadow.exception$UINT;
                }
                x10.io.Marshal.$Shadow.initStatus$UINT.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
            } else {
                if (x10.io.Marshal.$Shadow.initStatus$UINT.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    while (x10.io.Marshal.$Shadow.initStatus$UINT.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                        x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                    }
                    x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                    if (((int) x10.io.Marshal.$Shadow.initStatus$UINT.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                        throw x10.io.Marshal.$Shadow.exception$UINT;
                    }
                }
            }
            return x10.io.Marshal.$Shadow.UINT;
        }
        
        public static x10.io.Marshal.LongMarshal get$LONG() {
            if (((int) x10.io.Marshal.$Shadow.initStatus$LONG.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
                return x10.io.Marshal.$Shadow.LONG;
            }
            if (((int) x10.io.Marshal.$Shadow.initStatus$LONG.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                throw x10.io.Marshal.$Shadow.exception$LONG;
            }
            if (x10.io.Marshal.$Shadow.initStatus$LONG.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
                try {{
                    x10.io.Marshal.$Shadow.LONG = ((x10.io.Marshal.LongMarshal)(new x10.io.Marshal.LongMarshal((java.lang.System[]) null).x10$io$Marshal$LongMarshal$$init$S()));
                }}catch (java.lang.Throwable exc$91104) {
                    x10.io.Marshal.$Shadow.exception$LONG = new x10.lang.ExceptionInInitializer(exc$91104);
                    x10.io.Marshal.$Shadow.initStatus$LONG.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                    throw x10.io.Marshal.$Shadow.exception$LONG;
                }
                x10.io.Marshal.$Shadow.initStatus$LONG.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
            } else {
                if (x10.io.Marshal.$Shadow.initStatus$LONG.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    while (x10.io.Marshal.$Shadow.initStatus$LONG.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                        x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                    }
                    x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                    if (((int) x10.io.Marshal.$Shadow.initStatus$LONG.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                        throw x10.io.Marshal.$Shadow.exception$LONG;
                    }
                }
            }
            return x10.io.Marshal.$Shadow.LONG;
        }
        
        public static x10.io.Marshal.ULongMarshal get$ULONG() {
            if (((int) x10.io.Marshal.$Shadow.initStatus$ULONG.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
                return x10.io.Marshal.$Shadow.ULONG;
            }
            if (((int) x10.io.Marshal.$Shadow.initStatus$ULONG.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                throw x10.io.Marshal.$Shadow.exception$ULONG;
            }
            if (x10.io.Marshal.$Shadow.initStatus$ULONG.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
                try {{
                    x10.io.Marshal.$Shadow.ULONG = ((x10.io.Marshal.ULongMarshal)(new x10.io.Marshal.ULongMarshal((java.lang.System[]) null).x10$io$Marshal$ULongMarshal$$init$S()));
                }}catch (java.lang.Throwable exc$91105) {
                    x10.io.Marshal.$Shadow.exception$ULONG = new x10.lang.ExceptionInInitializer(exc$91105);
                    x10.io.Marshal.$Shadow.initStatus$ULONG.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                    throw x10.io.Marshal.$Shadow.exception$ULONG;
                }
                x10.io.Marshal.$Shadow.initStatus$ULONG.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
            } else {
                if (x10.io.Marshal.$Shadow.initStatus$ULONG.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    while (x10.io.Marshal.$Shadow.initStatus$ULONG.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                        x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                    }
                    x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                    if (((int) x10.io.Marshal.$Shadow.initStatus$ULONG.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                        throw x10.io.Marshal.$Shadow.exception$ULONG;
                    }
                }
            }
            return x10.io.Marshal.$Shadow.ULONG;
        }
        
        public static x10.io.Marshal.FloatMarshal get$FLOAT() {
            if (((int) x10.io.Marshal.$Shadow.initStatus$FLOAT.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
                return x10.io.Marshal.$Shadow.FLOAT;
            }
            if (((int) x10.io.Marshal.$Shadow.initStatus$FLOAT.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                throw x10.io.Marshal.$Shadow.exception$FLOAT;
            }
            if (x10.io.Marshal.$Shadow.initStatus$FLOAT.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
                try {{
                    x10.io.Marshal.$Shadow.FLOAT = ((x10.io.Marshal.FloatMarshal)(new x10.io.Marshal.FloatMarshal((java.lang.System[]) null).x10$io$Marshal$FloatMarshal$$init$S()));
                }}catch (java.lang.Throwable exc$91106) {
                    x10.io.Marshal.$Shadow.exception$FLOAT = new x10.lang.ExceptionInInitializer(exc$91106);
                    x10.io.Marshal.$Shadow.initStatus$FLOAT.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                    throw x10.io.Marshal.$Shadow.exception$FLOAT;
                }
                x10.io.Marshal.$Shadow.initStatus$FLOAT.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
            } else {
                if (x10.io.Marshal.$Shadow.initStatus$FLOAT.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    while (x10.io.Marshal.$Shadow.initStatus$FLOAT.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                        x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                    }
                    x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                    if (((int) x10.io.Marshal.$Shadow.initStatus$FLOAT.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                        throw x10.io.Marshal.$Shadow.exception$FLOAT;
                    }
                }
            }
            return x10.io.Marshal.$Shadow.FLOAT;
        }
        
        public static x10.io.Marshal.DoubleMarshal get$DOUBLE() {
            if (((int) x10.io.Marshal.$Shadow.initStatus$DOUBLE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
                return x10.io.Marshal.$Shadow.DOUBLE;
            }
            if (((int) x10.io.Marshal.$Shadow.initStatus$DOUBLE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                throw x10.io.Marshal.$Shadow.exception$DOUBLE;
            }
            if (x10.io.Marshal.$Shadow.initStatus$DOUBLE.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
                try {{
                    x10.io.Marshal.$Shadow.DOUBLE = ((x10.io.Marshal.DoubleMarshal)(new x10.io.Marshal.DoubleMarshal((java.lang.System[]) null).x10$io$Marshal$DoubleMarshal$$init$S()));
                }}catch (java.lang.Throwable exc$91107) {
                    x10.io.Marshal.$Shadow.exception$DOUBLE = new x10.lang.ExceptionInInitializer(exc$91107);
                    x10.io.Marshal.$Shadow.initStatus$DOUBLE.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                    throw x10.io.Marshal.$Shadow.exception$DOUBLE;
                }
                x10.io.Marshal.$Shadow.initStatus$DOUBLE.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
            } else {
                if (x10.io.Marshal.$Shadow.initStatus$DOUBLE.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    while (x10.io.Marshal.$Shadow.initStatus$DOUBLE.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                        x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                    }
                    x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                    if (((int) x10.io.Marshal.$Shadow.initStatus$DOUBLE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                        throw x10.io.Marshal.$Shadow.exception$DOUBLE;
                    }
                }
            }
            return x10.io.Marshal.$Shadow.DOUBLE;
        }
        
        public static x10.io.Marshal.LineMarshal get$LINE() {
            if (((int) x10.io.Marshal.$Shadow.initStatus$LINE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
                return x10.io.Marshal.$Shadow.LINE;
            }
            if (((int) x10.io.Marshal.$Shadow.initStatus$LINE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                throw x10.io.Marshal.$Shadow.exception$LINE;
            }
            if (x10.io.Marshal.$Shadow.initStatus$LINE.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
                try {{
                    x10.io.Marshal.$Shadow.LINE = ((x10.io.Marshal.LineMarshal)(new x10.io.Marshal.LineMarshal((java.lang.System[]) null).x10$io$Marshal$LineMarshal$$init$S()));
                }}catch (java.lang.Throwable exc$91108) {
                    x10.io.Marshal.$Shadow.exception$LINE = new x10.lang.ExceptionInInitializer(exc$91108);
                    x10.io.Marshal.$Shadow.initStatus$LINE.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                    throw x10.io.Marshal.$Shadow.exception$LINE;
                }
                x10.io.Marshal.$Shadow.initStatus$LINE.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
            } else {
                if (x10.io.Marshal.$Shadow.initStatus$LINE.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.lockInitialized();
                    while (x10.io.Marshal.$Shadow.initStatus$LINE.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                        x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                    }
                    x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                    if (((int) x10.io.Marshal.$Shadow.initStatus$LINE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                        throw x10.io.Marshal.$Shadow.exception$LINE;
                    }
                }
            }
            return x10.io.Marshal.$Shadow.LINE;
        }
    }
    
}

