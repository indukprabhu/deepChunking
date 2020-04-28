package x10.io;


@x10.runtime.impl.java.X10Generated
public class FileReader extends x10.io.InputStreamReader implements x10.io.Unserializable, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<FileReader> $RTT = 
        x10.rtt.NamedType.<FileReader> make("x10.io.FileReader",
                                            FileReader.class,
                                            new x10.rtt.Type[] {
                                                x10.io.Unserializable.$RTT,
                                                x10.io.InputStreamReader.$RTT
                                            });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        throw new x10.io.NotSerializableException("Can't serialize x10.io.FileReader");
    }
    
    // constructor just for allocation
    public FileReader(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
    ;
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
    public x10.io.File file;
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
    public x10.util.GrowableRail<x10.core.Byte> buf;
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
    public java.lang.String readLine() {
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
        try {{
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
            while (true) {
                
                //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
                final byte b = this.read$O();
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
                final char t$90188 = ((char) (((byte)(b))));
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
                final boolean t$90189 = ((char) t$90188) == ((char) '\n');
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
                if (t$90189) {
                    
                    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
                    break;
                }
                
                //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
                final x10.util.GrowableRail t$90190 = ((x10.util.GrowableRail)(buf));
                
                //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
                ((x10.util.GrowableRail<x10.core.Byte>)t$90190).add__0x10$util$GrowableRail$$T(x10.core.Byte.$box(b));
            }
        }}catch (final x10.io.IOException e) {
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
            final x10.util.GrowableRail this$90170 = ((x10.util.GrowableRail)(buf));
            
            //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$90191 = ((x10.util.GrowableRail<x10.core.Byte>)this$90170).size;
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
            final boolean t$90192 = ((long) t$90191) == ((long) 0L);
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
            if (t$90192) {
                
                //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
                throw e;
            }
        }
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
        final x10.util.GrowableRail t$90193 = ((x10.util.GrowableRail)(buf));
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
        final java.lang.String ans = ((java.lang.String)(new java.lang.String((t$90193).rail().getByteArray(), 0, (int)(t$90193).size)));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
        final x10.util.GrowableRail this$90171 = ((x10.util.GrowableRail)(buf));
        
        //#line 181 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$90201 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.core.Byte>)this$90171).data));
        
        //#line 181 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        (t$90201).clear();
        
        //#line 182 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ((x10.util.GrowableRail<x10.core.Byte>)this$90171).size = 0L;
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
        return ans;
    }
    
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
    @x10.runtime.impl.java.X10Generated
    public static class FRLM extends x10.core.Ref implements x10.io.Marshal, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<FRLM> $RTT = 
            x10.rtt.NamedType.<FRLM> make("x10.io.FileReader.FRLM",
                                          FRLM.class,
                                          new x10.rtt.Type[] {
                                              x10.rtt.ParameterizedType.make(x10.io.Marshal.$RTT, x10.rtt.Types.STRING)
                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.FileReader.FRLM $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.io.FileReader.FRLM $_obj = new x10.io.FileReader.FRLM((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public FRLM(final java.lang.System[] $dummy) {
            
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
        
        
    
        
        
        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
        public java.lang.String read(final x10.io.Reader r) {
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
            final java.lang.String t$90195 = r.readLine();
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
            return t$90195;
        }
        
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
        public void write(final x10.io.Writer w, final java.lang.String s) {
            
            //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
            final x10.core.Rail t$90196 = x10.runtime.impl.java.ArrayUtils.<x10.core.Byte>makeRailFromJavaArray(x10.rtt.Types.BYTE, (s).getBytes(), false);
            
            //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
            w.write__0$1x10$lang$Byte$2(((x10.core.Rail)(t$90196)));
        }
        
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
        final public x10.io.FileReader.FRLM x10$io$FileReader$FRLM$$this$x10$io$FileReader$FRLM() {
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
            return x10.io.FileReader.FRLM.this;
        }
        
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
        // creation method for java code (1-phase java constructor)
        public FRLM() {
            this((java.lang.System[]) null);
            x10$io$FileReader$FRLM$$init$S();
        }
        
        // constructor for non-virtual call
        final public x10.io.FileReader.FRLM x10$io$FileReader$FRLM$$init$S() {
             {
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
                
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
                final x10.io.FileReader.FRLM this$90174 = this;
            }
            return this;
        }
        
        
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
        final public void __fieldInitializers_x10_io_FileReader_FRLM() {
            
        }
    }
    
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
    private static x10.io.FileReader.FRLM M;
    
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
    public x10.io.ReaderIterator lines() {
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
        final x10.io.ReaderIterator alloc$90064 = ((x10.io.ReaderIterator)(new x10.io.ReaderIterator<java.lang.String>((java.lang.System[]) null, x10.rtt.Types.STRING)));
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
        final x10.io.FileReader.FRLM t$90197 = ((x10.io.FileReader.FRLM)(x10.io.FileReader.get$M()));
        
        //#line 34 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        final x10.io.Marshal m$90177 = ((x10.io.Marshal)(((x10.io.Marshal<java.lang.String>)
                                                           t$90197)));
        
        //#line 34 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        final x10.io.Reader r$90178 = ((x10.io.Reader)(((x10.io.Reader)
                                                         this)));
        
        //#line 32 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        final java.lang.String t$90202 = (java.lang.String) x10.rtt.Types.zeroValue(x10.rtt.Types.STRING);
        
        //#line 29 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        ((x10.io.ReaderIterator<java.lang.String>)alloc$90064).next = t$90202;
        
        //#line 35 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        ((x10.io.ReaderIterator<java.lang.String>)alloc$90064).m = ((x10.io.Marshal)(m$90177));
        
        //#line 36 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
        ((x10.io.ReaderIterator<java.lang.String>)alloc$90064).r = ((x10.io.Reader)(r$90178));
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
        return alloc$90064;
    }
    
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
    // creation method for java code (1-phase java constructor)
    public FileReader(final x10.io.File file) {
        this((java.lang.System[]) null);
        x10$io$FileReader$$init$S(file);
    }
    
    // constructor for non-virtual call
    final public x10.io.FileReader x10$io$FileReader$$init$S(final x10.io.File file) {
         {
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
            final java.lang.String t$90204 = file.getPath();
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
            final x10.core.io.FileInputStream t$90205 = ((x10.core.io.FileInputStream)(new x10.core.io.FileInputStream((java.lang.System[]) null).x10$io$FileReader$FileInputStream$$init$S(t$90204)));
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
            /*super.*/x10$io$InputStreamReader$$init$S(((x10.core.io.InputStream)(t$90205)));
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
            
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
            final x10.io.FileReader this$90206 = this;
            
            //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
            final x10.util.GrowableRail alloc$90203 = ((x10.util.GrowableRail)(new x10.util.GrowableRail<x10.core.Byte>((java.lang.System[]) null, x10.rtt.Types.BYTE)));
            
            //#line 50 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            alloc$90203.x10$util$GrowableRail$$init$S(((long)(0L)));
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
            this$90206.buf = ((x10.util.GrowableRail)(alloc$90203));
            
            //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
            this.file = ((x10.io.File)(file));
        }
        return this;
    }
    
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
    final public x10.io.FileReader x10$io$FileReader$$this$x10$io$FileReader() {
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
        return x10.io.FileReader.this;
    }
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
    final public void __fieldInitializers_x10_io_FileReader() {
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
        final x10.util.GrowableRail alloc$90065 = ((x10.util.GrowableRail)(new x10.util.GrowableRail<x10.core.Byte>((java.lang.System[]) null, x10.rtt.Types.BYTE)));
        
        //#line 50 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        alloc$90065.x10$util$GrowableRail$$init$S(((long)(0L)));
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
        this.buf = ((x10.util.GrowableRail)(alloc$90065));
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$M = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$M;
    
    public static x10.io.FileReader.FRLM get$M() {
        if (((int) x10.io.FileReader.initStatus$M.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.io.FileReader.M;
        }
        if (((int) x10.io.FileReader.initStatus$M.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.io.FileReader.exception$M;
        }
        if (x10.io.FileReader.initStatus$M.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.io.FileReader.M = ((x10.io.FileReader.FRLM)(new x10.io.FileReader.FRLM((java.lang.System[]) null).x10$io$FileReader$FRLM$$init$S()));
            }}catch (java.lang.Throwable exc$90207) {
                x10.io.FileReader.exception$M = new x10.lang.ExceptionInInitializer(exc$90207);
                x10.io.FileReader.initStatus$M.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.io.FileReader.exception$M;
            }
            x10.io.FileReader.initStatus$M.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.io.FileReader.initStatus$M.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.io.FileReader.initStatus$M.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.io.FileReader.initStatus$M.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.io.FileReader.exception$M;
                }
            }
        }
        return x10.io.FileReader.M;
    }
}

