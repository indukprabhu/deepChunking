package x10.lang;


@x10.runtime.impl.java.X10Generated
public class ResilientStorePlace0<$K, $V> extends x10.lang.ResilientStore<$K, $V> implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<ResilientStorePlace0> $RTT = 
        x10.rtt.NamedType.<ResilientStorePlace0> make("x10.lang.ResilientStorePlace0",
                                                      ResilientStorePlace0.class,
                                                      2,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.lang.ResilientStore.$RTT, x10.rtt.UnresolvedType.PARAM(0), x10.rtt.UnresolvedType.PARAM(1))
                                                      });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $K; if (i == 1) return $V; return null; }
    
    public static <$K, $V> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.ResilientStorePlace0<$K, $V> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.ResilientStore.$_deserialize_body($_obj, $deserializer);
        $_obj.$K = (x10.rtt.Type) $deserializer.readObject();
        $_obj.$V = (x10.rtt.Type) $deserializer.readObject();
        $_obj.root = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.ResilientStorePlace0 $_obj = new x10.lang.ResilientStorePlace0((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.$K);
        $serializer.write(this.$V);
        $serializer.write(this.root);
        
    }
    
    // constructor just for allocation
    public ResilientStorePlace0(final java.lang.System[] $dummy, final x10.rtt.Type $K, final x10.rtt.Type $V) {
        super($dummy, $K, $V);
        x10.lang.ResilientStorePlace0.$initParams(this, $K, $V);
        
    }
    
    // bridge for method abstract public x10.lang.ResilientStore[K, V].create(key:K, value:V){}:void
    public void create__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V($K a1, $V a2) {
        create__0x10$lang$ResilientStorePlace0$$K__1x10$lang$ResilientStorePlace0$$V(a1, a2);
    }
    
    // bridge for method abstract public x10.lang.ResilientStore[K, V].put(key:K, value:V){}:void
    public void put__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V($K a1, $V a2) {
        put__0x10$lang$ResilientStorePlace0$$K__1x10$lang$ResilientStorePlace0$$V(a1, a2);
    }
    
    // bridge for method abstract public x10.lang.ResilientStore[K, V].getOrElse(key:K, orelse:V){}:V
    public $V getOrElse__0x10$lang$ResilientStore$$K__1x10$lang$ResilientStore$$V$G($K a1, $V a2) {
        return getOrElse__0x10$lang$ResilientStorePlace0$$K__1x10$lang$ResilientStorePlace0$$V$G(a1, a2);
    }
    
    // bridge for method abstract public x10.lang.ResilientStore[K, V].remove(key:K){}:void
    public void remove__0x10$lang$ResilientStore$$K($K a1) {
        remove__0x10$lang$ResilientStorePlace0$$K(a1);
    }
    
    private x10.rtt.Type $K;
    private x10.rtt.Type $V;
    
    // initializer of type parameters
    public static void $initParams(final ResilientStorePlace0 $this, final x10.rtt.Type $K, final x10.rtt.Type $V) {
        $this.$K = $K;
        $this.$V = $V;
        
    }
    

    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    private static long verbose = 0L;
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    private static boolean lowLevelSend$O(final x10.lang.Place dst, final x10.core.fun.VoidFun_0_0 cl) {
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final boolean t$112185 = x10.lang.FinishResilient.lowLevelSend$O(((x10.lang.Place)(dst)), ((x10.core.fun.VoidFun_0_0)(cl)));
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        return t$112185;
    }
    
    public static boolean lowLevelSend$P$O(final x10.lang.Place dst, final x10.core.fun.VoidFun_0_0 cl) {
        return x10.lang.ResilientStorePlace0.lowLevelSend$O(((x10.lang.Place)(dst)), ((x10.core.fun.VoidFun_0_0)(cl)));
    }
    
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    private static boolean lowLevelAt$O(final x10.lang.Place dst, final x10.core.fun.VoidFun_0_0 cl) {
        
        //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final boolean t$112186 = x10.lang.FinishResilient.lowLevelAt$O(((x10.lang.Place)(dst)), ((x10.core.fun.VoidFun_0_0)(cl)));
        
        //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        return t$112186;
    }
    
    public static boolean lowLevelAt$P$O(final x10.lang.Place dst, final x10.core.fun.VoidFun_0_0 cl) {
        return x10.lang.ResilientStorePlace0.lowLevelAt$O(((x10.lang.Place)(dst)), ((x10.core.fun.VoidFun_0_0)(cl)));
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    private static <$T>boolean lowLevelFetch__1$1x10$lang$ResilientStorePlace0$$T$2__2$1x10$lang$ResilientStorePlace0$$T$2$O(final x10.rtt.Type $T, final x10.lang.Place dst, final x10.lang.Cell<$T> result, final x10.core.fun.Fun_0_0<$T> cl) {
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final boolean t$112187 = x10.lang.FinishResilient.<$T> lowLevelFetch__1$1x10$lang$FinishResilient$$T$2__2$1x10$lang$FinishResilient$$T$2$O($T, ((x10.lang.Place)(dst)), ((x10.lang.Cell)(result)), ((x10.core.fun.Fun_0_0)(cl)));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        return t$112187;
    }
    
    public static <$T>boolean lowLevelFetch$P__1$1x10$lang$ResilientStorePlace0$$T$2__2$1x10$lang$ResilientStorePlace0$$T$2$O(final x10.rtt.Type $T, final x10.lang.Place dst, final x10.lang.Cell<$T> result, final x10.core.fun.Fun_0_0<$T> cl) {
        return x10.lang.ResilientStorePlace0.<$T> lowLevelFetch__1$1x10$lang$ResilientStorePlace0$$T$2__2$1x10$lang$ResilientStorePlace0$$T$2$O($T, ((x10.lang.Place)(dst)), ((x10.lang.Cell)(result)), ((x10.core.fun.Fun_0_0)(cl)));
    }
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    private static x10.util.HashMap<java.lang.Object, java.lang.Object> ALL;
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    public x10.core.GlobalRef<x10.lang.ResilientStorePlace0<$K, $V>> root;
    
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    private x10.lang.ResilientStorePlace0 getMe() {
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.core.GlobalRef t$112188 = ((x10.core.GlobalRef)(root));
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.lang.ResilientStorePlace0 t$112189 = x10.core.GlobalRef.LocalEval.<x10.lang.ResilientStorePlace0<$K, $V>>getLocalOrCopy(x10.rtt.ParameterizedType.make(x10.lang.ResilientStorePlace0.$RTT, $K, $V),((x10.core.GlobalRef<x10.lang.ResilientStorePlace0<$K, $V>>)(t$112188)));
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        return t$112189;
    }
    
    public static <$K, $V>x10.lang.ResilientStorePlace0 getMe$P__0$1x10$lang$ResilientStorePlace0$$K$3x10$lang$ResilientStorePlace0$$V$2(final x10.rtt.Type $K, final x10.rtt.Type $V, final x10.lang.ResilientStorePlace0<$K, $V> ResilientStorePlace0) {
        return ((x10.lang.ResilientStorePlace0<$K, $V>)ResilientStorePlace0).getMe();
    }
    
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    // creation method for java code (1-phase java constructor)
    public ResilientStorePlace0(final x10.rtt.Type $K, final x10.rtt.Type $V) {
        this((java.lang.System[]) null, $K, $V);
        x10$lang$ResilientStorePlace0$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.lang.ResilientStorePlace0<$K, $V> x10$lang$ResilientStorePlace0$$init$S() {
         {
            
            //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final x10.lang.ResilientStore this$112073 = this;
            
            //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            
            
            //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            this.__fieldInitializers_x10_lang_ResilientStorePlace0();
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            assert ((long) x10.lang.Place.place(x10.x10rt.X10RT.here()).id) == ((long) 0L);
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final x10.core.GlobalRef t$112190 = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.lang.ResilientStorePlace0<$K, $V>>(x10.rtt.ParameterizedType.make(x10.lang.ResilientStorePlace0.$RTT, $K, $V), ((x10.lang.ResilientStorePlace0<$K, $V>)(this)), (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            ((x10.lang.ResilientStorePlace0<$K, $V>)this).root = ((x10.core.GlobalRef)(t$112190));
        }
        return this;
    }
    
    
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    public static <$K, $V>x10.lang.ResilientStorePlace0 make(final x10.rtt.Type $K, final x10.rtt.Type $V, final java.lang.Object name) {
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final long t$112191 = x10.lang.ResilientStorePlace0.get$verbose();
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final boolean t$112192 = ((t$112191) >= (((long)(3L))));
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        if (t$112192) {
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            final java.lang.String msg$112077 = ((java.lang.String)((("make called, name=") + (name))));
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(msg$112077)));
        }
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.lang.Cell result = ((x10.lang.Cell)(new x10.lang.Cell<x10.lang.ResilientStorePlace0<$K, $V>>((java.lang.System[]) null, x10.rtt.ParameterizedType.make(x10.lang.ResilientStorePlace0.$RTT, $K, $V))));
        
        //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        final x10.lang.ResilientStorePlace0 x$112080 = ((x10.lang.ResilientStorePlace0)(((x10.lang.ResilientStorePlace0<$K, $V>)
                                                                                          (null))));
        
        //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        ((x10.lang.Cell<x10.lang.ResilientStorePlace0<$K, $V>>)result).value = ((x10.lang.ResilientStorePlace0)(((x10.lang.ResilientStorePlace0)(null))));
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.lang.Place alloc$112044 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        alloc$112044.x10$lang$Place$$init$S(((long)(0L)));
        
        //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.lang.Place dst$112084 = ((x10.lang.Place)(alloc$112044));
        
        //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.lang.Cell result$112085 = ((x10.lang.Cell)(result));
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.core.fun.Fun_0_0 t$112201 = ((x10.core.fun.Fun_0_0)(new x10.lang.ResilientStorePlace0.$Closure$165<$K, $V>($K, $V, name)));
        
        //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        x10.lang.FinishResilient.<x10.lang.ResilientStorePlace0<$K, $V>> lowLevelFetch__1$1x10$lang$FinishResilient$$T$2__2$1x10$lang$FinishResilient$$T$2$O(x10.rtt.ParameterizedType.make(x10.lang.ResilientStorePlace0.$RTT, $K, $V), ((x10.lang.Place)(dst$112084)), ((x10.lang.Cell)(result$112085)), ((x10.core.fun.Fun_0_0)(t$112201)));
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.lang.ResilientStorePlace0 r = ((x10.lang.ResilientStorePlace0)(((x10.lang.Cell<x10.lang.ResilientStorePlace0<$K, $V>>)result).value));
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final long t$112202 = x10.lang.ResilientStorePlace0.get$verbose();
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final boolean t$112203 = ((t$112202) >= (((long)(3L))));
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        if (t$112203) {
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            final java.lang.String msg$112087 = ((java.lang.String)((("make returning result=") + (r))));
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(msg$112087)));
        }
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        return r;
    }
    
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    public static void delete(final java.lang.Object name) {
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final long t$112204 = x10.lang.ResilientStorePlace0.get$verbose();
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final boolean t$112205 = ((t$112204) >= (((long)(3L))));
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        if (t$112205) {
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            final java.lang.String msg$112090 = ((java.lang.String)((("delete called, name=") + (name))));
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(msg$112090)));
        }
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.lang.Place alloc$112046 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        alloc$112046.x10$lang$Place$$init$S(((long)(0L)));
        
        //#line 20 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.lang.Place dst$112093 = ((x10.lang.Place)(alloc$112046));
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.core.fun.VoidFun_0_0 t$112207 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.ResilientStorePlace0.$Closure$166(name)));
        
        //#line 20 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        x10.lang.FinishResilient.lowLevelAt$O(((x10.lang.Place)(dst$112093)), ((x10.core.fun.VoidFun_0_0)(t$112207)));
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final long t$112208 = x10.lang.ResilientStorePlace0.get$verbose();
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final boolean t$112209 = ((t$112208) >= (((long)(3L))));
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        if (t$112209) {
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            final java.lang.String msg$112095 = ((java.lang.String)("delete returning"));
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(msg$112095)));
        }
    }
    
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    public transient x10.util.HashMap<$K, $V> hm;
    
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    public void create__0x10$lang$ResilientStorePlace0$$K__1x10$lang$ResilientStorePlace0$$V(final $K key, final $V value) {
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        this.put__0x10$lang$ResilientStorePlace0$$K__1x10$lang$ResilientStorePlace0$$V((($K)(key)), (($V)(value)));
    }
    
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    public void put__0x10$lang$ResilientStorePlace0$$K__1x10$lang$ResilientStorePlace0$$V(final $K key, final $V value) {
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final long t$112210 = x10.lang.ResilientStorePlace0.get$verbose();
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final boolean t$112213 = ((t$112210) >= (((long)(3L))));
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        if (t$112213) {
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final java.lang.String t$112211 = (("put called, key=") + (key));
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final java.lang.String t$112212 = ((t$112211) + (" value="));
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            final java.lang.String msg$112098 = ((java.lang.String)(((t$112212) + (value))));
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(msg$112098)));
        }
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.core.GlobalRef t$112214 = ((x10.core.GlobalRef)(root));
        
        //#line 20 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.lang.Place dst$112102 = ((x10.lang.Place)((t$112214).home));
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.core.fun.VoidFun_0_0 t$112218 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.ResilientStorePlace0.$Closure$167<$K, $V>($K, $V, ((x10.lang.ResilientStorePlace0<$K, $V>)(this)), key, value, (x10.lang.ResilientStorePlace0.$Closure$167.__0$1x10$lang$ResilientStorePlace0$$Closure$167$$K$3x10$lang$ResilientStorePlace0$$Closure$167$$V$2__1x10$lang$ResilientStorePlace0$$Closure$167$$K__2x10$lang$ResilientStorePlace0$$Closure$167$$V) null)));
        
        //#line 20 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        x10.lang.FinishResilient.lowLevelAt$O(((x10.lang.Place)(dst$112102)), ((x10.core.fun.VoidFun_0_0)(t$112218)));
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final long t$112219 = x10.lang.ResilientStorePlace0.get$verbose();
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final boolean t$112220 = ((t$112219) >= (((long)(3L))));
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        if (t$112220) {
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            final java.lang.String msg$112104 = ((java.lang.String)("put returning"));
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(msg$112104)));
        }
    }
    
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    public $V getOrElse__0x10$lang$ResilientStorePlace0$$K__1x10$lang$ResilientStorePlace0$$V$G(final $K key, final $V orelse) {
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final long t$112221 = x10.lang.ResilientStorePlace0.get$verbose();
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final boolean t$112222 = ((t$112221) >= (((long)(3L))));
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        if (t$112222) {
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            final java.lang.String msg$112107 = ((java.lang.String)((("getOrElse called, key=") + (key))));
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(msg$112107)));
        }
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.lang.Cell result = ((x10.lang.Cell)(new x10.lang.Cell<$V>((java.lang.System[]) null, $V)));
        
        //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        final $V x$112110 = (($V)(orelse));
        
        //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        ((x10.lang.Cell<$V>)result).value = (($V)(x$112110));
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.core.GlobalRef t$112223 = ((x10.core.GlobalRef)(root));
        
        //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.lang.Place dst$112115 = ((x10.lang.Place)((t$112223).home));
        
        //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.lang.Cell result$112116 = ((x10.lang.Cell)(result));
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.core.fun.Fun_0_0 t$112228 = ((x10.core.fun.Fun_0_0)(new x10.lang.ResilientStorePlace0.$Closure$168<$K, $V>($K, $V, ((x10.lang.ResilientStorePlace0<$K, $V>)(this)), key, orelse, (x10.lang.ResilientStorePlace0.$Closure$168.__0$1x10$lang$ResilientStorePlace0$$Closure$168$$K$3x10$lang$ResilientStorePlace0$$Closure$168$$V$2__1x10$lang$ResilientStorePlace0$$Closure$168$$K__2x10$lang$ResilientStorePlace0$$Closure$168$$V) null)));
        
        //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        x10.lang.FinishResilient.<$V> lowLevelFetch__1$1x10$lang$FinishResilient$$T$2__2$1x10$lang$FinishResilient$$T$2$O($V, ((x10.lang.Place)(dst$112115)), ((x10.lang.Cell)(result$112116)), ((x10.core.fun.Fun_0_0)(t$112228)));
        
        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final $V r = (($V)(((x10.lang.Cell<$V>)result).value));
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final long t$112229 = x10.lang.ResilientStorePlace0.get$verbose();
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final boolean t$112230 = ((t$112229) >= (((long)(3L))));
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        if (t$112230) {
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            final java.lang.String msg$112118 = ((java.lang.String)((("getOrElse returning, result=") + (r))));
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(msg$112118)));
        }
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        return r;
    }
    
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    public void remove__0x10$lang$ResilientStorePlace0$$K(final $K key) {
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.core.GlobalRef t$112231 = ((x10.core.GlobalRef)(root));
        
        //#line 20 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.lang.Place dst$112122 = ((x10.lang.Place)((t$112231).home));
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.core.fun.VoidFun_0_0 t$112235 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.ResilientStorePlace0.$Closure$169<$K, $V>($K, $V, ((x10.lang.ResilientStorePlace0<$K, $V>)(this)), key, (x10.lang.ResilientStorePlace0.$Closure$169.__0$1x10$lang$ResilientStorePlace0$$Closure$169$$K$3x10$lang$ResilientStorePlace0$$Closure$169$$V$2__1x10$lang$ResilientStorePlace0$$Closure$169$$K) null)));
        
        //#line 20 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        x10.lang.FinishResilient.lowLevelAt$O(((x10.lang.Place)(dst$112122)), ((x10.core.fun.VoidFun_0_0)(t$112235)));
    }
    
    
    //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    @x10.runtime.impl.java.X10Generated
    public static class MyQueue<$E> extends x10.core.Ref implements x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<MyQueue> $RTT = 
            x10.rtt.NamedType.<MyQueue> make("x10.lang.ResilientStorePlace0.MyQueue",
                                             MyQueue.class,
                                             1);
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $E; return null; }
        
        public static <$E> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.ResilientStorePlace0.MyQueue<$E> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$E = (x10.rtt.Type) $deserializer.readObject();
            $_obj.head = $deserializer.readObject();
            $_obj.tail = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.ResilientStorePlace0.MyQueue $_obj = new x10.lang.ResilientStorePlace0.MyQueue((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$E);
            $serializer.write(this.head);
            $serializer.write(this.tail);
            
        }
        
        // constructor just for allocation
        public MyQueue(final java.lang.System[] $dummy, final x10.rtt.Type $E) {
            x10.lang.ResilientStorePlace0.MyQueue.$initParams(this, $E);
            
        }
        
        private x10.rtt.Type $E;
        
        // initializer of type parameters
        public static void $initParams(final MyQueue $this, final x10.rtt.Type $E) {
            $this.$E = $E;
            
        }
        
    
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        @x10.runtime.impl.java.X10Generated
        public static class Entry<$E> extends x10.core.Ref implements x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<Entry> $RTT = 
                x10.rtt.NamedType.<Entry> make("x10.lang.ResilientStorePlace0.MyQueue.Entry",
                                               Entry.class,
                                               1);
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $E; return null; }
            
            public static <$E> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.ResilientStorePlace0.MyQueue.Entry<$E> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                $_obj.$E = (x10.rtt.Type) $deserializer.readObject();
                $_obj.e = $deserializer.readObject();
                $_obj.next = $deserializer.readObject();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                x10.lang.ResilientStorePlace0.MyQueue.Entry $_obj = new x10.lang.ResilientStorePlace0.MyQueue.Entry((java.lang.System[]) null, (x10.rtt.Type) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                $serializer.write(this.$E);
                $serializer.write(this.e);
                $serializer.write(this.next);
                
            }
            
            // constructor just for allocation
            public Entry(final java.lang.System[] $dummy, final x10.rtt.Type $E) {
                x10.lang.ResilientStorePlace0.MyQueue.Entry.$initParams(this, $E);
                
            }
            
            private x10.rtt.Type $E;
            
            // initializer of type parameters
            public static void $initParams(final Entry $this, final x10.rtt.Type $E) {
                $this.$E = $E;
                
            }
            // synthetic type for parameter mangling
            public static final class __0x10$lang$ResilientStorePlace0$MyQueue$Entry$$E {}
            
        
            
            //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            public $E e;
            
            //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            public x10.lang.ResilientStorePlace0.MyQueue.Entry<$E> next;
            
            
            //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            // creation method for java code (1-phase java constructor)
            public Entry(final x10.rtt.Type $E, final $E e, __0x10$lang$ResilientStorePlace0$MyQueue$Entry$$E $dummy) {
                this((java.lang.System[]) null, $E);
                x10$lang$ResilientStorePlace0$MyQueue$Entry$$init$S(e, (x10.lang.ResilientStorePlace0.MyQueue.Entry.__0x10$lang$ResilientStorePlace0$MyQueue$Entry$$E) null);
            }
            
            // constructor for non-virtual call
            final public x10.lang.ResilientStorePlace0.MyQueue.Entry<$E> x10$lang$ResilientStorePlace0$MyQueue$Entry$$init$S(final $E e, __0x10$lang$ResilientStorePlace0$MyQueue$Entry$$E $dummy) {
                 {
                    
                    //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    
                    
                    //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final x10.lang.ResilientStorePlace0.MyQueue.Entry this$112288 = this;
                    
                    //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    ((x10.lang.ResilientStorePlace0.MyQueue.Entry<$E>)this$112288).next = null;
                    
                    //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    ((x10.lang.ResilientStorePlace0.MyQueue.Entry<$E>)this).e = (($E)(e));
                }
                return this;
            }
            
            
            
            //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final public x10.lang.ResilientStorePlace0.MyQueue.Entry x10$lang$ResilientStorePlace0$MyQueue$Entry$$this$x10$lang$ResilientStorePlace0$MyQueue$Entry() {
                
                //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                return x10.lang.ResilientStorePlace0.MyQueue.Entry.this;
            }
            
            
            //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final public void __fieldInitializers_x10_lang_ResilientStorePlace0_MyQueue_Entry() {
                
                //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                ((x10.lang.ResilientStorePlace0.MyQueue.Entry<$E>)this).next = null;
            }
        }
        
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        public x10.lang.ResilientStorePlace0.MyQueue.Entry<$E> head;
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        public x10.lang.ResilientStorePlace0.MyQueue.Entry<$E> tail;
        
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        public void add__0x10$lang$ResilientStorePlace0$MyQueue$$E(final $E e) {
            
            //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final x10.lang.ResilientStorePlace0.MyQueue.Entry entry = ((x10.lang.ResilientStorePlace0.MyQueue.Entry)(new x10.lang.ResilientStorePlace0.MyQueue.Entry<$E>((java.lang.System[]) null, $E)));
            
            //#line 100 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final $E e$112127 = (($E)(e));
            
            //#line 100 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            ((x10.lang.ResilientStorePlace0.MyQueue.Entry<$E>)entry).next = null;
            
            //#line 100 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            ((x10.lang.ResilientStorePlace0.MyQueue.Entry<$E>)entry).e = (($E)(e$112127));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final x10.lang.ResilientStorePlace0.MyQueue.Entry t$112236 = ((x10.lang.ResilientStorePlace0.MyQueue.Entry)(tail));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final boolean t$112238 = ((t$112236) == (null));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            if (t$112238) {
                
                //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                ((x10.lang.ResilientStorePlace0.MyQueue<$E>)this).head = ((x10.lang.ResilientStorePlace0.MyQueue.Entry)(entry));
            } else {
                
                //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                final x10.lang.ResilientStorePlace0.MyQueue.Entry t$112237 = ((x10.lang.ResilientStorePlace0.MyQueue.Entry)(tail));
                
                //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                ((x10.lang.ResilientStorePlace0.MyQueue.Entry<$E>)t$112237).next = ((x10.lang.ResilientStorePlace0.MyQueue.Entry)(entry));
            }
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            ((x10.lang.ResilientStorePlace0.MyQueue<$E>)this).tail = ((x10.lang.ResilientStorePlace0.MyQueue.Entry)(entry));
        }
        
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        public $E remove$G() {
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final x10.lang.ResilientStorePlace0.MyQueue.Entry entry = ((x10.lang.ResilientStorePlace0.MyQueue.Entry)(head));
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final x10.lang.ResilientStorePlace0.MyQueue.Entry t$112239 = ((x10.lang.ResilientStorePlace0.MyQueue.Entry)(((x10.lang.ResilientStorePlace0.MyQueue.Entry<$E>)entry).next));
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            ((x10.lang.ResilientStorePlace0.MyQueue<$E>)this).head = ((x10.lang.ResilientStorePlace0.MyQueue.Entry)(t$112239));
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final x10.lang.ResilientStorePlace0.MyQueue.Entry t$112240 = ((x10.lang.ResilientStorePlace0.MyQueue.Entry)(head));
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final boolean t$112241 = ((t$112240) == (null));
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            if (t$112241) {
                
                //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                ((x10.lang.ResilientStorePlace0.MyQueue<$E>)this).tail = null;
            }
            
            //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final $E t$112242 = (($E)(((x10.lang.ResilientStorePlace0.MyQueue.Entry<$E>)entry).e));
            
            //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            return t$112242;
        }
        
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final public x10.lang.ResilientStorePlace0.MyQueue x10$lang$ResilientStorePlace0$MyQueue$$this$x10$lang$ResilientStorePlace0$MyQueue() {
            
            //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            return x10.lang.ResilientStorePlace0.MyQueue.this;
        }
        
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        // creation method for java code (1-phase java constructor)
        public MyQueue(final x10.rtt.Type $E) {
            this((java.lang.System[]) null, $E);
            x10$lang$ResilientStorePlace0$MyQueue$$init$S();
        }
        
        // constructor for non-virtual call
        final public x10.lang.ResilientStorePlace0.MyQueue<$E> x10$lang$ResilientStorePlace0$MyQueue$$init$S() {
             {
                
                //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                
                
                //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                final x10.lang.ResilientStorePlace0.MyQueue this$112131 = this;
                
                //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                ((x10.lang.ResilientStorePlace0.MyQueue<$E>)this$112131).head = null;
                
                //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                ((x10.lang.ResilientStorePlace0.MyQueue<$E>)this$112131).tail = null;
            }
            return this;
        }
        
        
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final public void __fieldInitializers_x10_lang_ResilientStorePlace0_MyQueue() {
            
            //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            ((x10.lang.ResilientStorePlace0.MyQueue<$E>)this).head = null;
            
            //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            ((x10.lang.ResilientStorePlace0.MyQueue<$E>)this).tail = null;
        }
    }
    
    
    //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    @x10.runtime.impl.java.X10Generated
    public static class MyLatch extends x10.util.concurrent.SimpleLatch implements x10.lang.Runtime.Mortal, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<MyLatch> $RTT = 
            x10.rtt.NamedType.<MyLatch> make("x10.lang.ResilientStorePlace0.MyLatch",
                                             MyLatch.class,
                                             new x10.rtt.Type[] {
                                                 x10.lang.Runtime.Mortal.$RTT,
                                                 x10.util.concurrent.SimpleLatch.$RTT
                                             });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            throw new x10.io.NotSerializableException("Can't serialize x10.lang.ResilientStorePlace0.MyLatch");
        }
        
        // constructor just for allocation
        public MyLatch(final java.lang.System[] $dummy) {
            super($dummy);
            
        }
        
        
    
        
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final public x10.lang.ResilientStorePlace0.MyLatch x10$lang$ResilientStorePlace0$MyLatch$$this$x10$lang$ResilientStorePlace0$MyLatch() {
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            return x10.lang.ResilientStorePlace0.MyLatch.this;
        }
        
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        public MyLatch() {
            super();
             {
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                this.__fieldInitializers_x10_lang_ResilientStorePlace0_MyLatch();
            }
        }
        
        
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final public void __fieldInitializers_x10_lang_ResilientStorePlace0_MyLatch() {
            
        }
    }
    
    
    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    public transient x10.lang.ResilientStorePlace0.MyQueue<x10.core.GlobalRef<x10.lang.ResilientStorePlace0.MyLatch>> waitQueue;
    
    //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    public transient long waitCount;
    
    
    //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    public void lock() {
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final long t$112243 = x10.lang.ResilientStorePlace0.get$verbose();
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final boolean t$112244 = ((t$112243) >= (((long)(3L))));
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        if (t$112244) {
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            final java.lang.String msg$112134 = ((java.lang.String)("lock called"));
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(msg$112134)));
        }
        
        //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.lang.ResilientStorePlace0.MyLatch latch = ((x10.lang.ResilientStorePlace0.MyLatch)(new x10.lang.ResilientStorePlace0.MyLatch()));
        
        //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.core.GlobalRef gLatch = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.lang.ResilientStorePlace0.MyLatch>(x10.lang.ResilientStorePlace0.MyLatch.$RTT, ((x10.lang.ResilientStorePlace0.MyLatch)(latch)), (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
        
        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.lang.Cell needWait = ((x10.lang.Cell)(new x10.lang.Cell<x10.core.Boolean>((java.lang.System[]) null, x10.rtt.Types.BOOLEAN)));
        
        //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        ((x10.lang.Cell<x10.core.Boolean>)needWait).value = x10.core.Boolean.$box(false);
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.core.GlobalRef t$112245 = ((x10.core.GlobalRef)(root));
        
        //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.lang.Place dst$112142 = ((x10.lang.Place)((t$112245).home));
        
        //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.lang.Cell result$112143 = ((x10.lang.Cell)(needWait));
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.core.fun.Fun_0_0 t$112252 = ((x10.core.fun.Fun_0_0)(new x10.lang.ResilientStorePlace0.$Closure$170<$K, $V>($K, $V, ((x10.lang.ResilientStorePlace0<$K, $V>)(this)), gLatch, (x10.lang.ResilientStorePlace0.$Closure$170.__0$1x10$lang$ResilientStorePlace0$$Closure$170$$K$3x10$lang$ResilientStorePlace0$$Closure$170$$V$2__1$1x10$lang$ResilientStorePlace0$MyLatch$2) null)));
        
        //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        x10.lang.FinishResilient.<x10.core.Boolean> lowLevelFetch__1$1x10$lang$FinishResilient$$T$2__2$1x10$lang$FinishResilient$$T$2$O(x10.rtt.Types.BOOLEAN, ((x10.lang.Place)(dst$112142)), ((x10.lang.Cell)(result$112143)), ((x10.core.fun.Fun_0_0)(t$112252)));
        
        //#line 48 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        final boolean t$112259 = x10.core.Boolean.$unbox(((x10.lang.Cell<x10.core.Boolean>)needWait).value);
        
        //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        if (t$112259) {
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final long t$112253 = x10.lang.ResilientStorePlace0.get$verbose();
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final boolean t$112254 = ((t$112253) >= (((long)(3L))));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            if (t$112254) {
                
                //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
                final java.lang.String msg$112145 = ((java.lang.String)((("lock waiting gLatch=") + (gLatch))));
                
                //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)(msg$112145)));
            }
            
            //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            latch.await();
            
            //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final long t$112255 = x10.lang.ResilientStorePlace0.get$verbose();
            
            //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final boolean t$112256 = ((t$112255) >= (((long)(2L))));
            
            //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            if (t$112256) {
                
                //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
                final java.lang.String msg$112148 = ((java.lang.String)((("lock waited gLatch=") + (gLatch))));
                
                //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)(msg$112148)));
            }
        } else {
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final long t$112257 = x10.lang.ResilientStorePlace0.get$verbose();
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final boolean t$112258 = ((t$112257) >= (((long)(3L))));
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            if (t$112258) {
                
                //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
                final java.lang.String msg$112151 = ((java.lang.String)("lock need not wait"));
                
                //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)(msg$112151)));
            }
        }
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final long t$112260 = x10.lang.ResilientStorePlace0.get$verbose();
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final boolean t$112261 = ((t$112260) >= (((long)(3L))));
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        if (t$112261) {
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            final java.lang.String msg$112154 = ((java.lang.String)("lock returning (locked)"));
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(msg$112154)));
        }
    }
    
    
    //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    public void unlock() {
        
        //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final long t$112262 = x10.lang.ResilientStorePlace0.get$verbose();
        
        //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final boolean t$112263 = ((t$112262) >= (((long)(3L))));
        
        //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        if (t$112263) {
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            final java.lang.String msg$112157 = ((java.lang.String)("unlock called"));
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(msg$112157)));
        }
        
        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.lang.Cell toRelease = ((x10.lang.Cell)(new x10.lang.Cell<x10.core.GlobalRef<x10.lang.ResilientStorePlace0.MyLatch>>((java.lang.System[]) null, x10.rtt.ParameterizedType.make(x10.core.GlobalRef.$RTT, x10.lang.ResilientStorePlace0.MyLatch.$RTT))));
        
        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.lang.ResilientStorePlace0.MyLatch t$112264 = ((x10.lang.ResilientStorePlace0.MyLatch)
                                                                 (null));
        
        //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        final x10.core.GlobalRef x$112160 = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.lang.ResilientStorePlace0.MyLatch>(x10.lang.ResilientStorePlace0.MyLatch.$RTT, ((x10.lang.ResilientStorePlace0.MyLatch)(null)), (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
        
        //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        ((x10.lang.Cell<x10.core.GlobalRef<x10.lang.ResilientStorePlace0.MyLatch>>)toRelease).value = ((x10.core.GlobalRef)(x$112160));
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.core.GlobalRef t$112265 = ((x10.core.GlobalRef)(root));
        
        //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.lang.Place dst$112165 = ((x10.lang.Place)((t$112265).home));
        
        //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.lang.Cell result$112166 = ((x10.lang.Cell)(toRelease));
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.core.fun.Fun_0_0 t$112275 = ((x10.core.fun.Fun_0_0)(new x10.lang.ResilientStorePlace0.$Closure$171<$K, $V>($K, $V, ((x10.lang.ResilientStorePlace0<$K, $V>)(this)), (x10.lang.ResilientStorePlace0.$Closure$171.__0$1x10$lang$ResilientStorePlace0$$Closure$171$$K$3x10$lang$ResilientStorePlace0$$Closure$171$$V$2) null)));
        
        //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        x10.lang.FinishResilient.<x10.core.GlobalRef<x10.lang.ResilientStorePlace0.MyLatch>> lowLevelFetch__1$1x10$lang$FinishResilient$$T$2__2$1x10$lang$FinishResilient$$T$2$O(x10.rtt.ParameterizedType.make(x10.core.GlobalRef.$RTT, x10.lang.ResilientStorePlace0.MyLatch.$RTT), ((x10.lang.Place)(dst$112165)), ((x10.lang.Cell)(result$112166)), ((x10.core.fun.Fun_0_0)(t$112275)));
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.core.GlobalRef gLatch = ((x10.core.GlobalRef)(((x10.lang.Cell<x10.core.GlobalRef<x10.lang.ResilientStorePlace0.MyLatch>>)toRelease).value));
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final boolean t$112276 = (((x10.core.GlobalRef<x10.lang.ResilientStorePlace0.MyLatch>)(gLatch))).isNull();
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final boolean t$112285 = !(t$112276);
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        if (t$112285) {
            
            //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final long t$112277 = x10.lang.ResilientStorePlace0.get$verbose();
            
            //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final boolean t$112278 = ((t$112277) >= (((long)(3L))));
            
            //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            if (t$112278) {
                
                //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
                final java.lang.String msg$112168 = ((java.lang.String)((("unlock need to release gLatch=") + (gLatch))));
                
                //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)(msg$112168)));
            }
            
            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final x10.core.GlobalRef g = ((x10.core.GlobalRef)(gLatch));
            
            //#line 19 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final x10.lang.Place dst$112177 = ((x10.lang.Place)((g).home));
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final x10.core.fun.VoidFun_0_0 t$112284 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.ResilientStorePlace0.$Closure$172<$K, $V>($K, $V, g, (x10.lang.ResilientStorePlace0.$Closure$172.__0$1x10$lang$ResilientStorePlace0$MyLatch$2) null)));
            
            //#line 19 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            x10.lang.FinishResilient.lowLevelSend$O(((x10.lang.Place)(dst$112177)), ((x10.core.fun.VoidFun_0_0)(t$112284)));
        }
        
        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final long t$112286 = x10.lang.ResilientStorePlace0.get$verbose();
        
        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final boolean t$112287 = ((t$112286) >= (((long)(3L))));
        
        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        if (t$112287) {
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            final java.lang.String msg$112179 = ((java.lang.String)("unlock returning (unlocked)"));
            
            //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            x10.lang.FinishResilient.debug(((java.lang.String)(msg$112179)));
        }
    }
    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    final public x10.lang.ResilientStorePlace0 x10$lang$ResilientStorePlace0$$this$x10$lang$ResilientStorePlace0() {
        
        //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        return x10.lang.ResilientStorePlace0.this;
    }
    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    final public void __fieldInitializers_x10_lang_ResilientStorePlace0() {
        
        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.util.HashMap alloc$112047 = ((x10.util.HashMap)(new x10.util.HashMap<$K, $V>((java.lang.System[]) null, $K, $V)));
        
        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        alloc$112047.x10$util$HashMap$$init$S();
        
        //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        ((x10.lang.ResilientStorePlace0<$K, $V>)this).hm = alloc$112047;
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        final x10.lang.ResilientStorePlace0.MyQueue alloc$112048 = ((x10.lang.ResilientStorePlace0.MyQueue)(new x10.lang.ResilientStorePlace0.MyQueue<x10.core.GlobalRef<x10.lang.ResilientStorePlace0.MyLatch>>((java.lang.System[]) null, x10.rtt.ParameterizedType.make(x10.core.GlobalRef.$RTT, x10.lang.ResilientStorePlace0.MyLatch.$RTT))));
        
        //#line 99 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        ((x10.lang.ResilientStorePlace0.MyQueue<x10.core.GlobalRef<x10.lang.ResilientStorePlace0.MyLatch>>)alloc$112048).head = null;
        
        //#line 99 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        ((x10.lang.ResilientStorePlace0.MyQueue<x10.core.GlobalRef<x10.lang.ResilientStorePlace0.MyLatch>>)alloc$112048).tail = null;
        
        //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        ((x10.lang.ResilientStorePlace0<$K, $V>)this).waitQueue = alloc$112048;
        
        //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        ((x10.lang.ResilientStorePlace0<$K, $V>)this).waitCount = -1L;
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$ALL = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$ALL;
    final private static x10.core.concurrent.AtomicInteger initStatus$verbose = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$verbose;
    
    public static long get$verbose() {
        if (((int) x10.lang.ResilientStorePlace0.initStatus$verbose.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.ResilientStorePlace0.verbose;
        }
        if (((int) x10.lang.ResilientStorePlace0.initStatus$verbose.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.ResilientStorePlace0.exception$verbose;
        }
        if (x10.lang.ResilientStorePlace0.initStatus$verbose.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.ResilientStorePlace0.verbose = x10.lang.ResilientStore.get$verbose();
            }}catch (java.lang.Throwable exc$112289) {
                x10.lang.ResilientStorePlace0.exception$verbose = new x10.lang.ExceptionInInitializer(exc$112289);
                x10.lang.ResilientStorePlace0.initStatus$verbose.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.ResilientStorePlace0.exception$verbose;
            }
            x10.lang.ResilientStorePlace0.initStatus$verbose.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.ResilientStorePlace0.initStatus$verbose.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.ResilientStorePlace0.initStatus$verbose.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.ResilientStorePlace0.initStatus$verbose.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.ResilientStorePlace0.exception$verbose;
                }
            }
        }
        return x10.lang.ResilientStorePlace0.verbose;
    }
    
    public static x10.util.HashMap get$ALL() {
        if (((int) x10.lang.ResilientStorePlace0.initStatus$ALL.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.ResilientStorePlace0.ALL;
        }
        if (((int) x10.lang.ResilientStorePlace0.initStatus$ALL.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.ResilientStorePlace0.exception$ALL;
        }
        if (x10.lang.ResilientStorePlace0.initStatus$ALL.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.ResilientStorePlace0.ALL = ((long) x10.lang.Place.place(x10.x10rt.X10RT.here()).id) == ((long) 0L)
                  ? new x10.util.HashMap<java.lang.Object, java.lang.Object>((java.lang.System[]) null, x10.rtt.Types.ANY, x10.rtt.Types.ANY).x10$util$HashMap$$init$S()
                  : null;
            }}catch (java.lang.Throwable exc$112290) {
                x10.lang.ResilientStorePlace0.exception$ALL = new x10.lang.ExceptionInInitializer(exc$112290);
                x10.lang.ResilientStorePlace0.initStatus$ALL.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.ResilientStorePlace0.exception$ALL;
            }
            x10.lang.ResilientStorePlace0.initStatus$ALL.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.ResilientStorePlace0.initStatus$ALL.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.ResilientStorePlace0.initStatus$ALL.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.ResilientStorePlace0.initStatus$ALL.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.ResilientStorePlace0.exception$ALL;
                }
            }
        }
        return x10.lang.ResilientStorePlace0.ALL;
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$165<$K, $V> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$165> $RTT = 
            x10.rtt.StaticFunType.<$Closure$165> make($Closure$165.class,
                                                      2,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.lang.ResilientStorePlace0.$RTT, x10.rtt.UnresolvedType.PARAM(0), x10.rtt.UnresolvedType.PARAM(1)))
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $K; if (i == 1) return $V; return null; }
        
        public static <$K, $V> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.ResilientStorePlace0.$Closure$165<$K, $V> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$K = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$V = (x10.rtt.Type) $deserializer.readObject();
            $_obj.name = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.ResilientStorePlace0.$Closure$165 $_obj = new x10.lang.ResilientStorePlace0.$Closure$165((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$K);
            $serializer.write(this.$V);
            $serializer.write(this.name);
            
        }
        
        // constructor just for allocation
        public $Closure$165(final java.lang.System[] $dummy, final x10.rtt.Type $K, final x10.rtt.Type $V) {
            x10.lang.ResilientStorePlace0.$Closure$165.$initParams(this, $K, $V);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.lang.ResilientStorePlace0 $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $K;
        private x10.rtt.Type $V;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$165 $this, final x10.rtt.Type $K, final x10.rtt.Type $V) {
            $this.$K = $K;
            $this.$V = $V;
            
        }
        
    
        
        public x10.lang.ResilientStorePlace0 $apply() {
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            x10.lang.ResilientStorePlace0 rs =  null;
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            try {{
                
                //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                x10.lang.Runtime.enterAtomic();
                {
                    
                    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final x10.util.HashMap t$112193 = ((x10.util.HashMap)(x10.lang.ResilientStorePlace0.get$ALL()));
                    
                    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final java.lang.Object t$112194 = ((x10.util.HashMap<java.lang.Object, java.lang.Object>)t$112193).getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((java.lang.Object)(this.name)), ((java.lang.Object)(null)));
                    
                    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final x10.lang.ResilientStorePlace0 t$112195 = x10.rtt.Types.<x10.lang.ResilientStorePlace0<$K, $V>> cast(t$112194,x10.rtt.ParameterizedType.make(x10.lang.ResilientStorePlace0.$RTT, $K, $V));
                    
                    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    rs = t$112195;
                    
                    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final x10.lang.ResilientStorePlace0 t$112196 = rs;
                    
                    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final boolean t$112199 = ((t$112196) == (null));
                    
                    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    if (t$112199) {
                        
                        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                        final x10.lang.ResilientStorePlace0 alloc$112045 = ((x10.lang.ResilientStorePlace0)(new x10.lang.ResilientStorePlace0<$K, $V>((java.lang.System[]) null, $K, $V)));
                        
                        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                        alloc$112045.x10$lang$ResilientStorePlace0$$init$S();
                        
                        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                        rs = alloc$112045;
                        
                        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                        final x10.util.HashMap t$112197 = ((x10.util.HashMap)(x10.lang.ResilientStorePlace0.get$ALL()));
                        
                        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                        final x10.lang.ResilientStorePlace0 t$112198 = rs;
                        
                        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                        ((x10.util.HashMap<java.lang.Object, java.lang.Object>)t$112197).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((java.lang.Object)(this.name)), ((java.lang.Object)(t$112198)));
                    }
                }
            }}finally {{
                  
                  //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                  x10.lang.Runtime.exitAtomic();
              }}
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final x10.lang.ResilientStorePlace0 t$112200 = rs;
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            return t$112200;
            }
        
        public java.lang.Object name;
        
        public $Closure$165(final x10.rtt.Type $K, final x10.rtt.Type $V, final java.lang.Object name) {
            x10.lang.ResilientStorePlace0.$Closure$165.$initParams(this, $K, $V);
             {
                ((x10.lang.ResilientStorePlace0.$Closure$165<$K, $V>)this).name = ((java.lang.Object)(name));
            }
        }
        
        }
        
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$166 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$166> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$166> make($Closure$166.class,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.ResilientStorePlace0.$Closure$166 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.name = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.ResilientStorePlace0.$Closure$166 $_obj = new x10.lang.ResilientStorePlace0.$Closure$166((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.name);
            
        }
        
        // constructor just for allocation
        public $Closure$166(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            try {{
                
                //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                x10.lang.Runtime.enterAtomic();
                {
                    
                    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final x10.util.HashMap t$112206 = ((x10.util.HashMap)(x10.lang.ResilientStorePlace0.get$ALL()));
                    
                    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    ((x10.util.HashMap<java.lang.Object, java.lang.Object>)t$112206).remove__0x10$util$HashMap$$K(((java.lang.Object)(this.name)));
                }
            }}finally {{
                  
                  //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                  x10.lang.Runtime.exitAtomic();
              }}
            }
        
        public java.lang.Object name;
        
        public $Closure$166(final java.lang.Object name) {
             {
                this.name = ((java.lang.Object)(name));
            }
        }
        
        }
        
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$167<$K, $V> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$167> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$167> make($Closure$167.class,
                                                          2,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $K; if (i == 1) return $V; return null; }
        
        public static <$K, $V> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.ResilientStorePlace0.$Closure$167<$K, $V> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$K = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$V = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            $_obj.key = $deserializer.readObject();
            $_obj.value = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.ResilientStorePlace0.$Closure$167 $_obj = new x10.lang.ResilientStorePlace0.$Closure$167((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$K);
            $serializer.write(this.$V);
            $serializer.write(this.out$$);
            $serializer.write(this.key);
            $serializer.write(this.value);
            
        }
        
        // constructor just for allocation
        public $Closure$167(final java.lang.System[] $dummy, final x10.rtt.Type $K, final x10.rtt.Type $V) {
            x10.lang.ResilientStorePlace0.$Closure$167.$initParams(this, $K, $V);
            
        }
        
        private x10.rtt.Type $K;
        private x10.rtt.Type $V;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$167 $this, final x10.rtt.Type $K, final x10.rtt.Type $V) {
            $this.$K = $K;
            $this.$V = $V;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$ResilientStorePlace0$$Closure$167$$K$3x10$lang$ResilientStorePlace0$$Closure$167$$V$2__1x10$lang$ResilientStorePlace0$$Closure$167$$K__2x10$lang$ResilientStorePlace0$$Closure$167$$V {}
        
    
        
        public void $apply() {
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            try {{
                
                //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                x10.lang.Runtime.enterAtomic();
                {
                    
                    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final x10.lang.ResilientStorePlace0 this$112101 = ((x10.lang.ResilientStorePlace0)(this.out$$));
                    
                    //#line 26 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final x10.core.GlobalRef t$112215 = ((x10.core.GlobalRef)(((x10.lang.ResilientStorePlace0<$K, $V>)this$112101).root));
                    
                    //#line 26 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final x10.lang.ResilientStorePlace0 t$112216 = x10.core.GlobalRef.LocalEval.<x10.lang.ResilientStorePlace0<$K, $V>>getLocalOrCopy(x10.rtt.ParameterizedType.make(x10.lang.ResilientStorePlace0.$RTT, $K, $V),((x10.core.GlobalRef<x10.lang.ResilientStorePlace0<$K, $V>>)(t$112215)));
                    
                    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final x10.util.HashMap t$112217 = ((x10.util.HashMap)(((x10.lang.ResilientStorePlace0<$K, $V>)t$112216).hm));
                    
                    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    ((x10.util.HashMap<$K, $V>)t$112217).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V((($K)(this.key)), (($V)(this.value)));
                }
            }}finally {{
                  
                  //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                  x10.lang.Runtime.exitAtomic();
              }}
            }
        
        public x10.lang.ResilientStorePlace0<$K, $V> out$$;
        public $K key;
        public $V value;
        
        public $Closure$167(final x10.rtt.Type $K, final x10.rtt.Type $V, final x10.lang.ResilientStorePlace0<$K, $V> out$$, final $K key, final $V value, __0$1x10$lang$ResilientStorePlace0$$Closure$167$$K$3x10$lang$ResilientStorePlace0$$Closure$167$$V$2__1x10$lang$ResilientStorePlace0$$Closure$167$$K__2x10$lang$ResilientStorePlace0$$Closure$167$$V $dummy) {
            x10.lang.ResilientStorePlace0.$Closure$167.$initParams(this, $K, $V);
             {
                ((x10.lang.ResilientStorePlace0.$Closure$167<$K, $V>)this).out$$ = out$$;
                ((x10.lang.ResilientStorePlace0.$Closure$167<$K, $V>)this).key = (($K)(key));
                ((x10.lang.ResilientStorePlace0.$Closure$167<$K, $V>)this).value = (($V)(value));
            }
        }
        
        }
        
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$168<$K, $V> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$168> $RTT = 
            x10.rtt.StaticFunType.<$Closure$168> make($Closure$168.class,
                                                      2,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.UnresolvedType.PARAM(1))
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $K; if (i == 1) return $V; return null; }
        
        public static <$K, $V> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.ResilientStorePlace0.$Closure$168<$K, $V> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$K = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$V = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            $_obj.key = $deserializer.readObject();
            $_obj.orelse = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.ResilientStorePlace0.$Closure$168 $_obj = new x10.lang.ResilientStorePlace0.$Closure$168((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$K);
            $serializer.write(this.$V);
            $serializer.write(this.out$$);
            $serializer.write(this.key);
            $serializer.write(this.orelse);
            
        }
        
        // constructor just for allocation
        public $Closure$168(final java.lang.System[] $dummy, final x10.rtt.Type $K, final x10.rtt.Type $V) {
            x10.lang.ResilientStorePlace0.$Closure$168.$initParams(this, $K, $V);
            
        }
        
        private x10.rtt.Type $K;
        private x10.rtt.Type $V;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$168 $this, final x10.rtt.Type $K, final x10.rtt.Type $V) {
            $this.$K = $K;
            $this.$V = $V;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$ResilientStorePlace0$$Closure$168$$K$3x10$lang$ResilientStorePlace0$$Closure$168$$V$2__1x10$lang$ResilientStorePlace0$$Closure$168$$K__2x10$lang$ResilientStorePlace0$$Closure$168$$V {}
        
    
        
        public $V $apply$G() {
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final $V v;
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            try {{
                
                //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                x10.lang.Runtime.enterAtomic();
                {
                    
                    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final x10.lang.ResilientStorePlace0 this$112114 = ((x10.lang.ResilientStorePlace0)(this.out$$));
                    
                    //#line 26 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final x10.core.GlobalRef t$112224 = ((x10.core.GlobalRef)(((x10.lang.ResilientStorePlace0<$K, $V>)this$112114).root));
                    
                    //#line 26 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final x10.lang.ResilientStorePlace0 t$112225 = x10.core.GlobalRef.LocalEval.<x10.lang.ResilientStorePlace0<$K, $V>>getLocalOrCopy(x10.rtt.ParameterizedType.make(x10.lang.ResilientStorePlace0.$RTT, $K, $V),((x10.core.GlobalRef<x10.lang.ResilientStorePlace0<$K, $V>>)(t$112224)));
                    
                    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final x10.util.HashMap t$112226 = ((x10.util.HashMap)(((x10.lang.ResilientStorePlace0<$K, $V>)t$112225).hm));
                    
                    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final $V t$112227 = (($V)(((x10.util.HashMap<$K, $V>)t$112226).getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G((($K)(this.key)), (($V)(this.orelse)))));
                    
                    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    v = (($V)(t$112227));
                }
            }}finally {{
                  
                  //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                  x10.lang.Runtime.exitAtomic();
              }}
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            return v;
            }
        
        public x10.lang.ResilientStorePlace0<$K, $V> out$$;
        public $K key;
        public $V orelse;
        
        public $Closure$168(final x10.rtt.Type $K, final x10.rtt.Type $V, final x10.lang.ResilientStorePlace0<$K, $V> out$$, final $K key, final $V orelse, __0$1x10$lang$ResilientStorePlace0$$Closure$168$$K$3x10$lang$ResilientStorePlace0$$Closure$168$$V$2__1x10$lang$ResilientStorePlace0$$Closure$168$$K__2x10$lang$ResilientStorePlace0$$Closure$168$$V $dummy) {
            x10.lang.ResilientStorePlace0.$Closure$168.$initParams(this, $K, $V);
             {
                ((x10.lang.ResilientStorePlace0.$Closure$168<$K, $V>)this).out$$ = out$$;
                ((x10.lang.ResilientStorePlace0.$Closure$168<$K, $V>)this).key = (($K)(key));
                ((x10.lang.ResilientStorePlace0.$Closure$168<$K, $V>)this).orelse = (($V)(orelse));
            }
        }
        
        }
        
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$169<$K, $V> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$169> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$169> make($Closure$169.class,
                                                          2,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $K; if (i == 1) return $V; return null; }
        
        public static <$K, $V> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.ResilientStorePlace0.$Closure$169<$K, $V> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$K = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$V = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            $_obj.key = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.ResilientStorePlace0.$Closure$169 $_obj = new x10.lang.ResilientStorePlace0.$Closure$169((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$K);
            $serializer.write(this.$V);
            $serializer.write(this.out$$);
            $serializer.write(this.key);
            
        }
        
        // constructor just for allocation
        public $Closure$169(final java.lang.System[] $dummy, final x10.rtt.Type $K, final x10.rtt.Type $V) {
            x10.lang.ResilientStorePlace0.$Closure$169.$initParams(this, $K, $V);
            
        }
        
        private x10.rtt.Type $K;
        private x10.rtt.Type $V;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$169 $this, final x10.rtt.Type $K, final x10.rtt.Type $V) {
            $this.$K = $K;
            $this.$V = $V;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$ResilientStorePlace0$$Closure$169$$K$3x10$lang$ResilientStorePlace0$$Closure$169$$V$2__1x10$lang$ResilientStorePlace0$$Closure$169$$K {}
        
    
        
        public void $apply() {
            
            //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            try {{
                
                //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                x10.lang.Runtime.enterAtomic();
                {
                    
                    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final x10.lang.ResilientStorePlace0 this$112121 = ((x10.lang.ResilientStorePlace0)(this.out$$));
                    
                    //#line 26 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final x10.core.GlobalRef t$112232 = ((x10.core.GlobalRef)(((x10.lang.ResilientStorePlace0<$K, $V>)this$112121).root));
                    
                    //#line 26 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final x10.lang.ResilientStorePlace0 t$112233 = x10.core.GlobalRef.LocalEval.<x10.lang.ResilientStorePlace0<$K, $V>>getLocalOrCopy(x10.rtt.ParameterizedType.make(x10.lang.ResilientStorePlace0.$RTT, $K, $V),((x10.core.GlobalRef<x10.lang.ResilientStorePlace0<$K, $V>>)(t$112232)));
                    
                    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final x10.util.HashMap t$112234 = ((x10.util.HashMap)(((x10.lang.ResilientStorePlace0<$K, $V>)t$112233).hm));
                    
                    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    ((x10.util.HashMap<$K, $V>)t$112234).remove__0x10$util$HashMap$$K((($K)(this.key)));
                }
            }}finally {{
                  
                  //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                  x10.lang.Runtime.exitAtomic();
              }}
            }
        
        public x10.lang.ResilientStorePlace0<$K, $V> out$$;
        public $K key;
        
        public $Closure$169(final x10.rtt.Type $K, final x10.rtt.Type $V, final x10.lang.ResilientStorePlace0<$K, $V> out$$, final $K key, __0$1x10$lang$ResilientStorePlace0$$Closure$169$$K$3x10$lang$ResilientStorePlace0$$Closure$169$$V$2__1x10$lang$ResilientStorePlace0$$Closure$169$$K $dummy) {
            x10.lang.ResilientStorePlace0.$Closure$169.$initParams(this, $K, $V);
             {
                ((x10.lang.ResilientStorePlace0.$Closure$169<$K, $V>)this).out$$ = out$$;
                ((x10.lang.ResilientStorePlace0.$Closure$169<$K, $V>)this).key = (($K)(key));
            }
        }
        
        }
        
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$170<$K, $V> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$170> $RTT = 
            x10.rtt.StaticFunType.<$Closure$170> make($Closure$170.class,
                                                      2,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.Types.BOOLEAN)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $K; if (i == 1) return $V; return null; }
        
        public static <$K, $V> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.ResilientStorePlace0.$Closure$170<$K, $V> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$K = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$V = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            $_obj.gLatch = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.ResilientStorePlace0.$Closure$170 $_obj = new x10.lang.ResilientStorePlace0.$Closure$170((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$K);
            $serializer.write(this.$V);
            $serializer.write(this.out$$);
            $serializer.write(this.gLatch);
            
        }
        
        // constructor just for allocation
        public $Closure$170(final java.lang.System[] $dummy, final x10.rtt.Type $K, final x10.rtt.Type $V) {
            x10.lang.ResilientStorePlace0.$Closure$170.$initParams(this, $K, $V);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.core.Boolean $apply$G() {
            return x10.core.Boolean.$box($apply$O());
        }
        
        private x10.rtt.Type $K;
        private x10.rtt.Type $V;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$170 $this, final x10.rtt.Type $K, final x10.rtt.Type $V) {
            $this.$K = $K;
            $this.$V = $V;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$ResilientStorePlace0$$Closure$170$$K$3x10$lang$ResilientStorePlace0$$Closure$170$$V$2__1$1x10$lang$ResilientStorePlace0$MyLatch$2 {}
        
    
        
        public boolean $apply$O() {
            
            //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final x10.lang.ResilientStorePlace0 this$112141 = ((x10.lang.ResilientStorePlace0)(this.out$$));
            
            //#line 26 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final x10.core.GlobalRef t$112246 = ((x10.core.GlobalRef)(((x10.lang.ResilientStorePlace0<$K, $V>)this$112141).root));
            
            //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final x10.lang.ResilientStorePlace0 me = x10.core.GlobalRef.LocalEval.<x10.lang.ResilientStorePlace0<$K, $V>>getLocalOrCopy(x10.rtt.ParameterizedType.make(x10.lang.ResilientStorePlace0.$RTT, $K, $V),((x10.core.GlobalRef<x10.lang.ResilientStorePlace0<$K, $V>>)(t$112246)));
            
            //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            try {{
                
                //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                x10.lang.Runtime.enterAtomic();
                {
                    
                    //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final long t$112247 = ((x10.lang.ResilientStorePlace0<$K, $V>)me).waitCount;
                    
                    //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final long t$112248 = ((t$112247) + (((long)(1L))));
                    
                    //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final long t$112249 = ((x10.lang.ResilientStorePlace0<$K, $V>)me).waitCount = t$112248;
                    
                    //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final boolean t$112250 = ((long) t$112249) == ((long) 0L);
                    
                    //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    if (t$112250) {
                        
                        //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                        return false;
                    }
                    
                    //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final x10.lang.ResilientStorePlace0.MyQueue t$112251 = ((x10.lang.ResilientStorePlace0.MyQueue)(((x10.lang.ResilientStorePlace0<$K, $V>)me).waitQueue));
                    
                    //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    ((x10.lang.ResilientStorePlace0.MyQueue<x10.core.GlobalRef<x10.lang.ResilientStorePlace0.MyLatch>>)t$112251).add__0x10$lang$ResilientStorePlace0$MyQueue$$E(((x10.core.GlobalRef)(this.gLatch)));
                    
                    //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    return true;
                }
            }}finally {{
                  
                  //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                  x10.lang.Runtime.exitAtomic();
              }}
            }
        
        public x10.lang.ResilientStorePlace0<$K, $V> out$$;
        public x10.core.GlobalRef<x10.lang.ResilientStorePlace0.MyLatch> gLatch;
        
        public $Closure$170(final x10.rtt.Type $K, final x10.rtt.Type $V, final x10.lang.ResilientStorePlace0<$K, $V> out$$, final x10.core.GlobalRef<x10.lang.ResilientStorePlace0.MyLatch> gLatch, __0$1x10$lang$ResilientStorePlace0$$Closure$170$$K$3x10$lang$ResilientStorePlace0$$Closure$170$$V$2__1$1x10$lang$ResilientStorePlace0$MyLatch$2 $dummy) {
            x10.lang.ResilientStorePlace0.$Closure$170.$initParams(this, $K, $V);
             {
                ((x10.lang.ResilientStorePlace0.$Closure$170<$K, $V>)this).out$$ = out$$;
                ((x10.lang.ResilientStorePlace0.$Closure$170<$K, $V>)this).gLatch = ((x10.core.GlobalRef)(gLatch));
            }
        }
        
        }
        
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$171<$K, $V> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$171> $RTT = 
            x10.rtt.StaticFunType.<$Closure$171> make($Closure$171.class,
                                                      2,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.core.GlobalRef.$RTT, x10.lang.ResilientStorePlace0.MyLatch.$RTT))
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $K; if (i == 1) return $V; return null; }
        
        public static <$K, $V> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.ResilientStorePlace0.$Closure$171<$K, $V> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$K = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$V = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.ResilientStorePlace0.$Closure$171 $_obj = new x10.lang.ResilientStorePlace0.$Closure$171((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$K);
            $serializer.write(this.$V);
            $serializer.write(this.out$$);
            
        }
        
        // constructor just for allocation
        public $Closure$171(final java.lang.System[] $dummy, final x10.rtt.Type $K, final x10.rtt.Type $V) {
            x10.lang.ResilientStorePlace0.$Closure$171.$initParams(this, $K, $V);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.core.GlobalRef $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $K;
        private x10.rtt.Type $V;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$171 $this, final x10.rtt.Type $K, final x10.rtt.Type $V) {
            $this.$K = $K;
            $this.$V = $V;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$ResilientStorePlace0$$Closure$171$$K$3x10$lang$ResilientStorePlace0$$Closure$171$$V$2 {}
        
    
        
        public x10.core.GlobalRef $apply() {
            
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final x10.lang.ResilientStorePlace0 this$112164 = ((x10.lang.ResilientStorePlace0)(this.out$$));
            
            //#line 26 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final x10.core.GlobalRef t$112266 = ((x10.core.GlobalRef)(((x10.lang.ResilientStorePlace0<$K, $V>)this$112164).root));
            
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final x10.lang.ResilientStorePlace0 me = x10.core.GlobalRef.LocalEval.<x10.lang.ResilientStorePlace0<$K, $V>>getLocalOrCopy(x10.rtt.ParameterizedType.make(x10.lang.ResilientStorePlace0.$RTT, $K, $V),((x10.core.GlobalRef<x10.lang.ResilientStorePlace0<$K, $V>>)(t$112266)));
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final x10.lang.ResilientStorePlace0.MyLatch t$112267 = ((x10.lang.ResilientStorePlace0.MyLatch)
                                                                     (null));
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            x10.core.GlobalRef gLatch = new x10.core.GlobalRef<x10.lang.ResilientStorePlace0.MyLatch>(x10.lang.ResilientStorePlace0.MyLatch.$RTT, ((x10.lang.ResilientStorePlace0.MyLatch)(null)), (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null);
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            try {{
                
                //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                x10.lang.Runtime.enterAtomic();
                {
                    
                    //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final long t$112268 = ((x10.lang.ResilientStorePlace0<$K, $V>)me).waitCount;
                    
                    //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final long t$112269 = ((t$112268) - (((long)(1L))));
                    
                    //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final long t$112270 = ((x10.lang.ResilientStorePlace0<$K, $V>)me).waitCount = t$112269;
                    
                    //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    final boolean t$112273 = ((t$112270) >= (((long)(0L))));
                    
                    //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                    if (t$112273) {
                        
                        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                        final x10.lang.ResilientStorePlace0.MyQueue t$112271 = ((x10.lang.ResilientStorePlace0.MyQueue)(((x10.lang.ResilientStorePlace0<$K, $V>)me).waitQueue));
                        
                        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                        final x10.core.GlobalRef t$112272 = ((x10.lang.ResilientStorePlace0.MyQueue<x10.core.GlobalRef<x10.lang.ResilientStorePlace0.MyLatch>>)t$112271).remove$G();
                        
                        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                        gLatch = t$112272;
                    }
                }
            }}finally {{
                  
                  //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                  x10.lang.Runtime.exitAtomic();
              }}
            
            //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final x10.core.GlobalRef t$112274 = gLatch;
            
            //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            return t$112274;
            }
        
        public x10.lang.ResilientStorePlace0<$K, $V> out$$;
        
        public $Closure$171(final x10.rtt.Type $K, final x10.rtt.Type $V, final x10.lang.ResilientStorePlace0<$K, $V> out$$, __0$1x10$lang$ResilientStorePlace0$$Closure$171$$K$3x10$lang$ResilientStorePlace0$$Closure$171$$V$2 $dummy) {
            x10.lang.ResilientStorePlace0.$Closure$171.$initParams(this, $K, $V);
             {
                ((x10.lang.ResilientStorePlace0.$Closure$171<$K, $V>)this).out$$ = out$$;
            }
        }
        
        }
        
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$172<$K, $V> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$172> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$172> make($Closure$172.class,
                                                          2,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $K; if (i == 1) return $V; return null; }
        
        public static <$K, $V> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.ResilientStorePlace0.$Closure$172<$K, $V> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$K = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$V = (x10.rtt.Type) $deserializer.readObject();
            $_obj.g = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.ResilientStorePlace0.$Closure$172 $_obj = new x10.lang.ResilientStorePlace0.$Closure$172((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$K);
            $serializer.write(this.$V);
            $serializer.write(this.g);
            
        }
        
        // constructor just for allocation
        public $Closure$172(final java.lang.System[] $dummy, final x10.rtt.Type $K, final x10.rtt.Type $V) {
            x10.lang.ResilientStorePlace0.$Closure$172.$initParams(this, $K, $V);
            
        }
        
        private x10.rtt.Type $K;
        private x10.rtt.Type $V;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$172 $this, final x10.rtt.Type $K, final x10.rtt.Type $V) {
            $this.$K = $K;
            $this.$V = $V;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$ResilientStorePlace0$MyLatch$2 {}
        
    
        
        public void $apply() {
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final long t$112279 = x10.lang.ResilientStorePlace0.get$verbose();
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final boolean t$112280 = ((t$112279) >= (((long)(3L))));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            if (t$112280) {
                
                //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
                final java.lang.String msg$112171 = ((java.lang.String)((("unlock releasing gLatch=") + (this.g))));
                
                //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)(msg$112171)));
            }
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final x10.lang.ResilientStorePlace0.MyLatch t$112281 = x10.core.GlobalRef.LocalEval.<x10.lang.ResilientStorePlace0.MyLatch>getLocalOrCopy(x10.lang.ResilientStorePlace0.MyLatch.$RTT,((x10.core.GlobalRef<x10.lang.ResilientStorePlace0.MyLatch>)(this.g)));
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            t$112281.release();
            
            //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final long t$112282 = x10.lang.ResilientStorePlace0.get$verbose();
            
            //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            final boolean t$112283 = ((t$112282) >= (((long)(3L))));
            
            //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            if (t$112283) {
                
                //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
                final java.lang.String msg$112174 = ((java.lang.String)((("unlock released gLatch=") + (this.g))));
                
                //#line 15 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
                x10.lang.FinishResilient.debug(((java.lang.String)(msg$112174)));
            }
        }
        
        public x10.core.GlobalRef<x10.lang.ResilientStorePlace0.MyLatch> g;
        
        public $Closure$172(final x10.rtt.Type $K, final x10.rtt.Type $V, final x10.core.GlobalRef<x10.lang.ResilientStorePlace0.MyLatch> g, __0$1x10$lang$ResilientStorePlace0$MyLatch$2 $dummy) {
            x10.lang.ResilientStorePlace0.$Closure$172.$initParams(this, $K, $V);
             {
                ((x10.lang.ResilientStorePlace0.$Closure$172<$K, $V>)this).g = ((x10.core.GlobalRef)(g));
            }
        }
        
    }
    
    }
    
    