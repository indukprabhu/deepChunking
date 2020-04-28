package x10.compiler;

@x10.runtime.impl.java.X10Generated
public class Abort extends java.lang.RuntimeException implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Abort> $RTT = 
        x10.rtt.NamedType.<Abort> make("x10.compiler.Abort",
                                       Abort.class,
                                       new x10.rtt.Type[] {
                                           x10.rtt.Types.EXCEPTION
                                       });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.compiler.Abort $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $deserializer.deserializeFieldsStartingFromClass(java.lang.RuntimeException.class, $_obj, 0);
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.compiler.Abort $_obj = new x10.compiler.Abort((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.serializeFieldsStartingFromClass(this, java.lang.RuntimeException.class);
        
    }
    
    // constructor just for allocation
    public Abort(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Abort.x10"
    private static x10.compiler.Abort ABORT;
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Abort.x10"
    public Abort() {
        super();
         {
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Abort.x10"
            
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Abort.x10"
            this.__fieldInitializers_x10_compiler_Abort();
        }
    }
    
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Abort.x10"
    final public x10.compiler.Abort x10$compiler$Abort$$this$x10$compiler$Abort() {
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Abort.x10"
        return x10.compiler.Abort.this;
    }
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Abort.x10"
    final public void __fieldInitializers_x10_compiler_Abort() {
        
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$ABORT = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$ABORT;
    
    public static x10.compiler.Abort get$ABORT() {
        if (((int) x10.compiler.Abort.initStatus$ABORT.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.compiler.Abort.ABORT;
        }
        if (((int) x10.compiler.Abort.initStatus$ABORT.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.compiler.Abort.exception$ABORT;
        }
        if (x10.compiler.Abort.initStatus$ABORT.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.compiler.Abort.ABORT = ((x10.compiler.Abort)(new x10.compiler.Abort()));
            }}catch (java.lang.Throwable exc$77358) {
                x10.compiler.Abort.exception$ABORT = new x10.lang.ExceptionInInitializer(exc$77358);
                x10.compiler.Abort.initStatus$ABORT.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.compiler.Abort.exception$ABORT;
            }
            x10.compiler.Abort.initStatus$ABORT.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.compiler.Abort.initStatus$ABORT.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.compiler.Abort.initStatus$ABORT.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.compiler.Abort.initStatus$ABORT.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.compiler.Abort.exception$ABORT;
                }
            }
        }
        return x10.compiler.Abort.ABORT;
    }
}

