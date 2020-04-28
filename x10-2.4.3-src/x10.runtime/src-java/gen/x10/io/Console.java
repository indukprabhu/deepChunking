package x10.io;


@x10.runtime.impl.java.X10Generated
public class Console extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Console> $RTT = 
        x10.rtt.NamedType.<Console> make("x10.io.Console",
                                         Console.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.io.Console $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.io.Console $_obj = new x10.io.Console((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Console(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Console.x10"
    private static x10.core.io.OutputStream realOut() {
        try {
            return new x10.core.io.OutputStream(java.lang.System.out);
        }
        catch (java.lang.Throwable exc$146345) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146345);
        }
        
    }
    
    
    public static x10.core.io.OutputStream realOut$P() {
        return new x10.core.io.OutputStream(java.lang.System.out);
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Console.x10"
    private static x10.core.io.OutputStream realErr() {
        try {
            return new x10.core.io.OutputStream(java.lang.System.err);
        }
        catch (java.lang.Throwable exc$146346) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146346);
        }
        
    }
    
    
    public static x10.core.io.OutputStream realErr$P() {
        return new x10.core.io.OutputStream(java.lang.System.err);
    }
    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Console.x10"
    private static x10.core.io.InputStream realIn() {
        try {
            return new x10.core.io.InputStream(java.lang.System.in);
        }
        catch (java.lang.Throwable exc$146347) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146347);
        }
        
    }
    
    
    public static x10.core.io.InputStream realIn$P() {
        return new x10.core.io.InputStream(java.lang.System.in);
    }
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Console.x10"
    private static x10.io.Printer OUT;
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Console.x10"
    private static x10.io.Printer ERR;
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Console.x10"
    private static x10.io.Reader IN;
    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Console.x10"
    final public x10.io.Console x10$io$Console$$this$x10$io$Console() {
        
        //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Console.x10"
        return x10.io.Console.this;
    }
    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Console.x10"
    // creation method for java code (1-phase java constructor)
    public Console() {
        this((java.lang.System[]) null);
        x10$io$Console$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.io.Console x10$io$Console$$init$S() {
         {
            
            //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Console.x10"
            
            
            //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Console.x10"
            final x10.io.Console this$89980 = this;
        }
        return this;
    }
    
    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Console.x10"
    final public void __fieldInitializers_x10_io_Console() {
        
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$IN = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$IN;
    final private static x10.core.concurrent.AtomicInteger initStatus$ERR = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$ERR;
    final private static x10.core.concurrent.AtomicInteger initStatus$OUT = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$OUT;
    
    public static x10.io.Printer get$OUT() {
        if (((int) x10.io.Console.initStatus$OUT.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.io.Console.OUT;
        }
        if (((int) x10.io.Console.initStatus$OUT.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.io.Console.exception$OUT;
        }
        if (x10.io.Console.initStatus$OUT.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.io.Console.OUT = ((x10.io.Printer)(new x10.io.Printer((java.lang.System[]) null).x10$io$Printer$$init$S(((x10.io.Writer)(new x10.io.OutputStreamWriter((java.lang.System[]) null).x10$io$OutputStreamWriter$$init$S(new x10.core.io.OutputStream(java.lang.System.out)))))));
            }}catch (java.lang.Throwable exc$89983) {
                x10.io.Console.exception$OUT = new x10.lang.ExceptionInInitializer(exc$89983);
                x10.io.Console.initStatus$OUT.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.io.Console.exception$OUT;
            }
            x10.io.Console.initStatus$OUT.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.io.Console.initStatus$OUT.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.io.Console.initStatus$OUT.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.io.Console.initStatus$OUT.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.io.Console.exception$OUT;
                }
            }
        }
        return x10.io.Console.OUT;
    }
    
    public static x10.io.Printer get$ERR() {
        if (((int) x10.io.Console.initStatus$ERR.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.io.Console.ERR;
        }
        if (((int) x10.io.Console.initStatus$ERR.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.io.Console.exception$ERR;
        }
        if (x10.io.Console.initStatus$ERR.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.io.Console.ERR = ((x10.io.Printer)(new x10.io.Printer((java.lang.System[]) null).x10$io$Printer$$init$S(((x10.io.Writer)(new x10.io.OutputStreamWriter((java.lang.System[]) null).x10$io$OutputStreamWriter$$init$S(new x10.core.io.OutputStream(java.lang.System.err)))))));
            }}catch (java.lang.Throwable exc$89984) {
                x10.io.Console.exception$ERR = new x10.lang.ExceptionInInitializer(exc$89984);
                x10.io.Console.initStatus$ERR.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.io.Console.exception$ERR;
            }
            x10.io.Console.initStatus$ERR.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.io.Console.initStatus$ERR.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.io.Console.initStatus$ERR.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.io.Console.initStatus$ERR.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.io.Console.exception$ERR;
                }
            }
        }
        return x10.io.Console.ERR;
    }
    
    public static x10.io.Reader get$IN() {
        if (((int) x10.io.Console.initStatus$IN.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.io.Console.IN;
        }
        if (((int) x10.io.Console.initStatus$IN.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.io.Console.exception$IN;
        }
        if (x10.io.Console.initStatus$IN.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.io.Console.IN = ((x10.io.Reader)(new x10.io.InputStreamReader((java.lang.System[]) null).x10$io$InputStreamReader$$init$S(new x10.core.io.InputStream(java.lang.System.in))));
            }}catch (java.lang.Throwable exc$89985) {
                x10.io.Console.exception$IN = new x10.lang.ExceptionInInitializer(exc$89985);
                x10.io.Console.initStatus$IN.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.io.Console.exception$IN;
            }
            x10.io.Console.initStatus$IN.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.io.Console.initStatus$IN.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.io.Console.initStatus$IN.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.io.Console.initStatus$IN.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.io.Console.exception$IN;
                }
            }
        }
        return x10.io.Console.IN;
    }
}

