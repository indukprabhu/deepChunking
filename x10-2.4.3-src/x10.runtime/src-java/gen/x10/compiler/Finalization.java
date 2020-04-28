package x10.compiler;


@x10.runtime.impl.java.X10Generated
public class Finalization extends java.lang.RuntimeException implements x10.io.Unserializable, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Finalization> $RTT = 
        x10.rtt.NamedType.<Finalization> make("x10.compiler.Finalization",
                                              Finalization.class,
                                              new x10.rtt.Type[] {
                                                  x10.io.Unserializable.$RTT,
                                                  x10.rtt.Types.EXCEPTION
                                              });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        throw new x10.io.NotSerializableException("Can't serialize x10.compiler.Finalization");
    }
    
    // constructor just for allocation
    public Finalization(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
    public java.lang.Object value;
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
    public java.lang.String label;
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
    public boolean isReturn;
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
    public boolean isBreak;
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
    public boolean isContinue;
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
    private static x10.compiler.Finalization FALLTHROUGH;
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
    private static x10.compiler.Finalization RETURN_VOID;
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
    private static x10.compiler.Finalization SIMPLE_BREAK;
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
    private static x10.compiler.Finalization SIMPLE_CONTINUE;
    
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
    public Finalization(final boolean ret, final boolean br, final boolean cont) {
        super();
         {
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
            
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
            this.__fieldInitializers_x10_compiler_Finalization();
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
            this.isReturn = ret;
            
            //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
            this.isBreak = br;
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
            this.isContinue = cont;
        }
    }
    
    
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
    public static void throwReturn() {
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
        final x10.compiler.Finalization t$77362 = ((x10.compiler.Finalization)(x10.compiler.Finalization.get$RETURN_VOID()));
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
        throw t$77362;
    }
    
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
    public static void throwReturn(final java.lang.Object v) {
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
        final x10.compiler.Finalization f = ((x10.compiler.Finalization)(new x10.compiler.Finalization()));
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
        f.value = ((java.lang.Object)(v));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
        f.isReturn = true;
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
        throw f;
    }
    
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
    public static void throwBreak() {
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
        final x10.compiler.Finalization t$77363 = ((x10.compiler.Finalization)(x10.compiler.Finalization.get$SIMPLE_BREAK()));
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
        throw t$77363;
    }
    
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
    public static void throwBreak(final java.lang.String l) {
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
        final x10.compiler.Finalization f = ((x10.compiler.Finalization)(new x10.compiler.Finalization()));
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
        f.label = ((java.lang.String)(l));
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
        f.isBreak = true;
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
        throw f;
    }
    
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
    public static void throwContinue() {
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
        final x10.compiler.Finalization t$77364 = ((x10.compiler.Finalization)(x10.compiler.Finalization.get$SIMPLE_CONTINUE()));
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
        throw t$77364;
    }
    
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
    public static void throwContinue(final java.lang.String l) {
        
        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
        final x10.compiler.Finalization f = ((x10.compiler.Finalization)(new x10.compiler.Finalization()));
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
        f.label = ((java.lang.String)(l));
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
        f.isContinue = true;
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
        throw f;
    }
    
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
    public static void plausibleThrow() {
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
        final boolean t$77365 = true;
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
        if (t$77365) {
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
            return;
        }
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
        final x10.compiler.Finalization t$77366 = ((x10.compiler.Finalization)(x10.compiler.Finalization.get$FALLTHROUGH()));
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
        throw t$77366;
    }
    
    
    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
    public Finalization() {
        super();
         {
            
            //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
            
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
            this.__fieldInitializers_x10_compiler_Finalization();
        }
    }
    
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
    final public x10.compiler.Finalization x10$compiler$Finalization$$this$x10$compiler$Finalization() {
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
        return x10.compiler.Finalization.this;
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
    final public void __fieldInitializers_x10_compiler_Finalization() {
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
        this.value = null;
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
        this.label = null;
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
        this.isReturn = false;
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
        this.isBreak = false;
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Finalization.x10"
        this.isContinue = false;
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$SIMPLE_CONTINUE = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$SIMPLE_CONTINUE;
    final private static x10.core.concurrent.AtomicInteger initStatus$SIMPLE_BREAK = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$SIMPLE_BREAK;
    final private static x10.core.concurrent.AtomicInteger initStatus$RETURN_VOID = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$RETURN_VOID;
    final private static x10.core.concurrent.AtomicInteger initStatus$FALLTHROUGH = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$FALLTHROUGH;
    
    public static x10.compiler.Finalization get$FALLTHROUGH() {
        if (((int) x10.compiler.Finalization.initStatus$FALLTHROUGH.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.compiler.Finalization.FALLTHROUGH;
        }
        if (((int) x10.compiler.Finalization.initStatus$FALLTHROUGH.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.compiler.Finalization.exception$FALLTHROUGH;
        }
        if (x10.compiler.Finalization.initStatus$FALLTHROUGH.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.compiler.Finalization.FALLTHROUGH = ((x10.compiler.Finalization)(new x10.compiler.Finalization(((boolean)(false)), ((boolean)(false)), ((boolean)(false)))));
            }}catch (java.lang.Throwable exc$77367) {
                x10.compiler.Finalization.exception$FALLTHROUGH = new x10.lang.ExceptionInInitializer(exc$77367);
                x10.compiler.Finalization.initStatus$FALLTHROUGH.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.compiler.Finalization.exception$FALLTHROUGH;
            }
            x10.compiler.Finalization.initStatus$FALLTHROUGH.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.compiler.Finalization.initStatus$FALLTHROUGH.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.compiler.Finalization.initStatus$FALLTHROUGH.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.compiler.Finalization.initStatus$FALLTHROUGH.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.compiler.Finalization.exception$FALLTHROUGH;
                }
            }
        }
        return x10.compiler.Finalization.FALLTHROUGH;
    }
    
    public static x10.compiler.Finalization get$RETURN_VOID() {
        if (((int) x10.compiler.Finalization.initStatus$RETURN_VOID.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.compiler.Finalization.RETURN_VOID;
        }
        if (((int) x10.compiler.Finalization.initStatus$RETURN_VOID.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.compiler.Finalization.exception$RETURN_VOID;
        }
        if (x10.compiler.Finalization.initStatus$RETURN_VOID.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.compiler.Finalization.RETURN_VOID = ((x10.compiler.Finalization)(new x10.compiler.Finalization(((boolean)(true)), ((boolean)(false)), ((boolean)(false)))));
            }}catch (java.lang.Throwable exc$77368) {
                x10.compiler.Finalization.exception$RETURN_VOID = new x10.lang.ExceptionInInitializer(exc$77368);
                x10.compiler.Finalization.initStatus$RETURN_VOID.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.compiler.Finalization.exception$RETURN_VOID;
            }
            x10.compiler.Finalization.initStatus$RETURN_VOID.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.compiler.Finalization.initStatus$RETURN_VOID.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.compiler.Finalization.initStatus$RETURN_VOID.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.compiler.Finalization.initStatus$RETURN_VOID.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.compiler.Finalization.exception$RETURN_VOID;
                }
            }
        }
        return x10.compiler.Finalization.RETURN_VOID;
    }
    
    public static x10.compiler.Finalization get$SIMPLE_BREAK() {
        if (((int) x10.compiler.Finalization.initStatus$SIMPLE_BREAK.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.compiler.Finalization.SIMPLE_BREAK;
        }
        if (((int) x10.compiler.Finalization.initStatus$SIMPLE_BREAK.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.compiler.Finalization.exception$SIMPLE_BREAK;
        }
        if (x10.compiler.Finalization.initStatus$SIMPLE_BREAK.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.compiler.Finalization.SIMPLE_BREAK = ((x10.compiler.Finalization)(new x10.compiler.Finalization(((boolean)(false)), ((boolean)(true)), ((boolean)(false)))));
            }}catch (java.lang.Throwable exc$77369) {
                x10.compiler.Finalization.exception$SIMPLE_BREAK = new x10.lang.ExceptionInInitializer(exc$77369);
                x10.compiler.Finalization.initStatus$SIMPLE_BREAK.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.compiler.Finalization.exception$SIMPLE_BREAK;
            }
            x10.compiler.Finalization.initStatus$SIMPLE_BREAK.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.compiler.Finalization.initStatus$SIMPLE_BREAK.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.compiler.Finalization.initStatus$SIMPLE_BREAK.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.compiler.Finalization.initStatus$SIMPLE_BREAK.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.compiler.Finalization.exception$SIMPLE_BREAK;
                }
            }
        }
        return x10.compiler.Finalization.SIMPLE_BREAK;
    }
    
    public static x10.compiler.Finalization get$SIMPLE_CONTINUE() {
        if (((int) x10.compiler.Finalization.initStatus$SIMPLE_CONTINUE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.compiler.Finalization.SIMPLE_CONTINUE;
        }
        if (((int) x10.compiler.Finalization.initStatus$SIMPLE_CONTINUE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.compiler.Finalization.exception$SIMPLE_CONTINUE;
        }
        if (x10.compiler.Finalization.initStatus$SIMPLE_CONTINUE.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.compiler.Finalization.SIMPLE_CONTINUE = ((x10.compiler.Finalization)(new x10.compiler.Finalization(((boolean)(false)), ((boolean)(false)), ((boolean)(true)))));
            }}catch (java.lang.Throwable exc$77370) {
                x10.compiler.Finalization.exception$SIMPLE_CONTINUE = new x10.lang.ExceptionInInitializer(exc$77370);
                x10.compiler.Finalization.initStatus$SIMPLE_CONTINUE.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.compiler.Finalization.exception$SIMPLE_CONTINUE;
            }
            x10.compiler.Finalization.initStatus$SIMPLE_CONTINUE.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.compiler.Finalization.initStatus$SIMPLE_CONTINUE.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.compiler.Finalization.initStatus$SIMPLE_CONTINUE.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.compiler.Finalization.initStatus$SIMPLE_CONTINUE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.compiler.Finalization.exception$SIMPLE_CONTINUE;
                }
            }
        }
        return x10.compiler.Finalization.SIMPLE_CONTINUE;
    }
}

