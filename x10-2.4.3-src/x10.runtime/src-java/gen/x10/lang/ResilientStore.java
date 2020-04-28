package x10.lang;

@x10.runtime.impl.java.X10Generated
abstract public class ResilientStore<$K, $V> extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<ResilientStore> $RTT = 
        x10.rtt.NamedType.<ResilientStore> make("x10.lang.ResilientStore",
                                                ResilientStore.class,
                                                2);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $K; if (i == 1) return $V; return null; }
    
    public static <$K, $V> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.ResilientStore<$K, $V> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$K = (x10.rtt.Type) $deserializer.readObject();
        $_obj.$V = (x10.rtt.Type) $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return null;
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$K);
        $serializer.write(this.$V);
        
    }
    
    // constructor just for allocation
    public ResilientStore(final java.lang.System[] $dummy, final x10.rtt.Type $K, final x10.rtt.Type $V) {
        x10.lang.ResilientStore.$initParams(this, $K, $V);
        
    }
    
    private x10.rtt.Type $K;
    private x10.rtt.Type $V;
    
    // initializer of type parameters
    public static void $initParams(final ResilientStore $this, final x10.rtt.Type $K, final x10.rtt.Type $V) {
        $this.$K = $K;
        $this.$V = $V;
        
    }
    

    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
    private static long verbose = 0L;
    
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
    public static void debug(final java.lang.String msg) {
        
        //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        x10.lang.FinishResilient.debug(((java.lang.String)(msg)));
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
    public static <$K, $V>x10.lang.ResilientStore make(final x10.rtt.Type $K, final x10.rtt.Type $V, final java.lang.Object name) {
        
        //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        final long t$112061 = x10.lang.ResilientStore.get$verbose();
        
        //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        final boolean t$112062 = ((t$112061) >= (((long)(1L))));
        
        //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        if (t$112062) {
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            final java.lang.String msg$111793 = ((java.lang.String)((("ResilientStore.make called, name=") + (name))));
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(msg$111793)));
        }
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        x10.lang.ResilientStore rs =  null;
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        final x10.lang.ResilientStorePlace0 t$112063 = x10.lang.ResilientStorePlace0.<$K, $V> make($K, $V, ((java.lang.Object)(name)));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        rs = ((x10.lang.ResilientStore)(t$112063));
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        final long t$112064 = x10.lang.ResilientStore.get$verbose();
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        final boolean t$112066 = ((t$112064) >= (((long)(1L))));
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        if (t$112066) {
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            final x10.lang.ResilientStore t$112065 = ((x10.lang.ResilientStore)(rs));
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            final java.lang.String msg$112049 = ((java.lang.String)((("ResilientStore.make returning rs=") + (t$112065))));
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(msg$112049)));
        }
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        final x10.lang.ResilientStore t$112067 = ((x10.lang.ResilientStore)(rs));
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        return t$112067;
    }
    
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
    public static void delete(final java.lang.Object name) {
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        final long t$112068 = x10.lang.ResilientStore.get$verbose();
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        final boolean t$112069 = ((t$112068) >= (((long)(1L))));
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        if (t$112069) {
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            final java.lang.String msg$112052 = ((java.lang.String)((("ResilientStore.delete called, name=") + (name))));
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(msg$112052)));
        }
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        x10.lang.ResilientStorePlace0.delete(((java.lang.Object)(name)));
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        final long t$112070 = x10.lang.ResilientStore.get$verbose();
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        final boolean t$112071 = ((t$112070) >= (((long)(1L))));
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        if (t$112071) {
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            final java.lang.String msg$112055 = ((java.lang.String)("ResilientStore.delete returning"));
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(msg$112055)));
        }
    }
    
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
    abstract public void create__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V(final $K key, final $V value);
    
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
    abstract public void put__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V(final $K key, final $V value);
    
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
    abstract public $V getOrElse__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V$G(final $K key, final $V orelse);
    
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
    abstract public void remove__0x10$lang$ResilientStore$$K(final $K key);
    
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
    abstract public void lock();
    
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
    abstract public void unlock();
    
    
    //#line 13 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
    final public x10.lang.ResilientStore x10$lang$ResilientStore$$this$x10$lang$ResilientStore() {
        
        //#line 13 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        return x10.lang.ResilientStore.this;
    }
    
    
    //#line 13 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
    
    // constructor for non-virtual call
    final public x10.lang.ResilientStore<$K, $V> x10$lang$ResilientStore$$init$S() {
         {
            
            //#line 13 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            
            
            //#line 13 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            final x10.lang.ResilientStore this$112058 = this;
        }
        return this;
    }
    
    
    
    //#line 13 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
    final public void __fieldInitializers_x10_lang_ResilientStore() {
        
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$verbose = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$verbose;
    
    public static long get$verbose() {
        if (((int) x10.lang.ResilientStore.initStatus$verbose.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.ResilientStore.verbose;
        }
        if (((int) x10.lang.ResilientStore.initStatus$verbose.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.ResilientStore.exception$verbose;
        }
        if (x10.lang.ResilientStore.initStatus$verbose.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.ResilientStore.verbose = x10.lang.FinishResilient.get$verbose();
            }}catch (java.lang.Throwable exc$112072) {
                x10.lang.ResilientStore.exception$verbose = new x10.lang.ExceptionInInitializer(exc$112072);
                x10.lang.ResilientStore.initStatus$verbose.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.ResilientStore.exception$verbose;
            }
            x10.lang.ResilientStore.initStatus$verbose.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.ResilientStore.initStatus$verbose.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.ResilientStore.initStatus$verbose.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.ResilientStore.initStatus$verbose.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.ResilientStore.exception$verbose;
                }
            }
        }
        return x10.lang.ResilientStore.verbose;
    }
}

