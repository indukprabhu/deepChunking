package x10.util;

@x10.runtime.impl.java.X10Generated
public class WorkerLocalStorage<$Key, $Value> extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<WorkerLocalStorage> $RTT = 
        x10.rtt.NamedType.<WorkerLocalStorage> make("x10.util.WorkerLocalStorage",
                                                    WorkerLocalStorage.class,
                                                    2);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Key; if (i == 1) return $Value; return null; }
    
    public static <$Key, $Value> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.WorkerLocalStorage<$Key, $Value> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$Key = (x10.rtt.Type) $deserializer.readObject();
        $_obj.$Value = (x10.rtt.Type) $deserializer.readObject();
        $_obj.store = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.WorkerLocalStorage $_obj = new x10.util.WorkerLocalStorage((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$Key);
        $serializer.write(this.$Value);
        $serializer.write(this.store);
        
    }
    
    // constructor just for allocation
    public WorkerLocalStorage(final java.lang.System[] $dummy, final x10.rtt.Type $Key, final x10.rtt.Type $Value) {
        x10.util.WorkerLocalStorage.$initParams(this, $Key, $Value);
        
    }
    
    private x10.rtt.Type $Key;
    private x10.rtt.Type $Value;
    
    // initializer of type parameters
    public static void $initParams(final WorkerLocalStorage $this, final x10.rtt.Type $Key, final x10.rtt.Type $Value) {
        $this.$Key = $Key;
        $this.$Value = $Value;
        
    }
    

    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    public x10.lang.PlaceLocalHandle<x10.core.Rail<x10.util.HashMap<$Key, $Value>>> store;
    
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    public x10.util.Box get__0x10$util$WorkerLocalStorage$$Key(final $Key key) {
        
        //#line 745 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Thread t$145243 = x10.core.Thread.currentThread();
        
        //#line 745 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Worker t$145244 = x10.rtt.Types.<x10.lang.Runtime.Worker> cast(t$145243,x10.lang.Runtime.Worker.$RTT);
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final int id = t$145244.workerId;
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final x10.lang.PlaceLocalHandle t$145245 = ((x10.lang.PlaceLocalHandle)(store));
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final x10.core.Rail localStore = ((x10.lang.PlaceLocalHandle<x10.core.Rail<x10.util.HashMap<$Key, $Value>>>)t$145245).$apply$G();
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final long t$145246 = ((long)(((int)(id))));
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final x10.util.HashMap t$145247 = ((x10.util.HashMap[])localStore.value)[(int)t$145246];
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final boolean t$145248 = ((null) == (t$145247));
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        if (t$145248) {
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
            return null;
        }
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final long t$145249 = ((long)(((int)(id))));
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final x10.util.HashMap t$145250 = ((x10.util.HashMap[])localStore.value)[(int)t$145249];
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final x10.util.Box t$145251 = ((x10.util.Box<$Value>)
                                        ((x10.util.HashMap<$Key, $Value>)t$145250).get__0x10$util$HashMap$$K((($Key)(key))));
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        return t$145251;
    }
    
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    public $Value getOrElse__0x10$util$WorkerLocalStorage$$Key__1x10$util$WorkerLocalStorage$$Value$G(final $Key key, final $Value value) {
        
        //#line 745 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Thread t$145252 = x10.core.Thread.currentThread();
        
        //#line 745 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Worker t$145253 = x10.rtt.Types.<x10.lang.Runtime.Worker> cast(t$145252,x10.lang.Runtime.Worker.$RTT);
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final int id = t$145253.workerId;
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final x10.lang.PlaceLocalHandle t$145254 = ((x10.lang.PlaceLocalHandle)(store));
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final x10.core.Rail localStore = ((x10.lang.PlaceLocalHandle<x10.core.Rail<x10.util.HashMap<$Key, $Value>>>)t$145254).$apply$G();
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final long t$145255 = ((long)(((int)(id))));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final x10.util.HashMap t$145256 = ((x10.util.HashMap[])localStore.value)[(int)t$145255];
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final boolean t$145257 = ((null) == (t$145256));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        if (t$145257) {
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
            return value;
        }
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final long t$145258 = ((long)(((int)(id))));
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final x10.util.HashMap t$145259 = ((x10.util.HashMap[])localStore.value)[(int)t$145258];
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final $Value t$145260 = (($Value)(((x10.util.HashMap<$Key, $Value>)t$145259).getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G((($Key)(key)), (($Value)(value)))));
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        return t$145260;
    }
    
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    public $Value getOrThrow__0x10$util$WorkerLocalStorage$$Key$G(final $Key key) {
        
        //#line 745 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Thread t$145261 = x10.core.Thread.currentThread();
        
        //#line 745 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Worker t$145262 = x10.rtt.Types.<x10.lang.Runtime.Worker> cast(t$145261,x10.lang.Runtime.Worker.$RTT);
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final int id = t$145262.workerId;
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final x10.lang.PlaceLocalHandle t$145263 = ((x10.lang.PlaceLocalHandle)(store));
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final x10.core.Rail localStore = ((x10.lang.PlaceLocalHandle<x10.core.Rail<x10.util.HashMap<$Key, $Value>>>)t$145263).$apply$G();
        
        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final long t$145264 = ((long)(((int)(id))));
        
        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final x10.util.HashMap t$145265 = ((x10.util.HashMap[])localStore.value)[(int)t$145264];
        
        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final boolean t$145267 = ((null) == (t$145265));
        
        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        if (t$145267) {
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
            final java.util.NoSuchElementException t$145266 = ((java.util.NoSuchElementException)(new java.util.NoSuchElementException("Not found")));
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
            throw t$145266;
        }
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final long t$145268 = ((long)(((int)(id))));
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final x10.util.HashMap t$145269 = ((x10.util.HashMap[])localStore.value)[(int)t$145268];
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final $Value t$145270 = (($Value)(((x10.util.HashMap<$Key, $Value>)t$145269).getOrThrow__0x10$util$HashMap$$K$G((($Key)(key)))));
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        return t$145270;
    }
    
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    public x10.util.Box put__0x10$util$WorkerLocalStorage$$Key__1x10$util$WorkerLocalStorage$$Value(final $Key key, final $Value value) {
        
        //#line 745 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Thread t$145271 = x10.core.Thread.currentThread();
        
        //#line 745 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Worker t$145272 = x10.rtt.Types.<x10.lang.Runtime.Worker> cast(t$145271,x10.lang.Runtime.Worker.$RTT);
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final int id = t$145272.workerId;
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final x10.lang.PlaceLocalHandle t$145273 = ((x10.lang.PlaceLocalHandle)(store));
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final x10.core.Rail localStore = ((x10.lang.PlaceLocalHandle<x10.core.Rail<x10.util.HashMap<$Key, $Value>>>)t$145273).$apply$G();
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final long t$145274 = ((long)(((int)(id))));
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final x10.util.HashMap t$145275 = ((x10.util.HashMap[])localStore.value)[(int)t$145274];
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final boolean t$145277 = ((null) == (t$145275));
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        if (t$145277) {
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
            final long t$145276 = ((long)(((int)(id))));
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
            final x10.util.HashMap alloc$145242 = ((x10.util.HashMap)(new x10.util.HashMap<$Key, $Value>((java.lang.System[]) null, $Key, $Value)));
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
            alloc$145242.x10$util$HashMap$$init$S();
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
            ((x10.util.HashMap[])localStore.value)[(int)t$145276] = alloc$145242;
        }
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final long t$145278 = ((long)(((int)(id))));
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final x10.util.HashMap t$145279 = ((x10.util.HashMap[])localStore.value)[(int)t$145278];
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final x10.util.Box t$145280 = ((x10.util.Box<$Value>)
                                        ((x10.util.HashMap<$Key, $Value>)t$145279).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V((($Key)(key)), (($Value)(value))));
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        return t$145280;
    }
    
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    public x10.util.Box remove__0x10$util$WorkerLocalStorage$$Key(final $Key key) {
        
        //#line 745 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Thread t$145281 = x10.core.Thread.currentThread();
        
        //#line 745 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Worker t$145282 = x10.rtt.Types.<x10.lang.Runtime.Worker> cast(t$145281,x10.lang.Runtime.Worker.$RTT);
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final int id = t$145282.workerId;
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final x10.lang.PlaceLocalHandle t$145283 = ((x10.lang.PlaceLocalHandle)(store));
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final x10.core.Rail localStore = ((x10.lang.PlaceLocalHandle<x10.core.Rail<x10.util.HashMap<$Key, $Value>>>)t$145283).$apply$G();
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final long t$145284 = ((long)(((int)(id))));
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final x10.util.HashMap t$145285 = ((x10.util.HashMap[])localStore.value)[(int)t$145284];
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final boolean t$145286 = ((null) == (t$145285));
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        if (t$145286) {
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
            return null;
        }
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final long t$145287 = ((long)(((int)(id))));
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final x10.util.HashMap t$145288 = ((x10.util.HashMap[])localStore.value)[(int)t$145287];
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final x10.util.Box t$145289 = ((x10.util.Box<$Value>)
                                        ((x10.util.HashMap<$Key, $Value>)t$145288).remove__0x10$util$HashMap$$K((($Key)(key))));
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        return t$145289;
    }
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    final public x10.util.WorkerLocalStorage x10$util$WorkerLocalStorage$$this$x10$util$WorkerLocalStorage() {
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        return x10.util.WorkerLocalStorage.this;
    }
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    // creation method for java code (1-phase java constructor)
    public WorkerLocalStorage(final x10.rtt.Type $Key, final x10.rtt.Type $Value) {
        this((java.lang.System[]) null, $Key, $Value);
        x10$util$WorkerLocalStorage$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.util.WorkerLocalStorage<$Key, $Value> x10$util$WorkerLocalStorage$$init$S() {
         {
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
            
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
            this.__fieldInitializers_x10_util_WorkerLocalStorage();
        }
        return this;
    }
    
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
    final public void __fieldInitializers_x10_util_WorkerLocalStorage() {
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final x10.lang.PlaceGroup.SimplePlaceGroup t$145293 = ((x10.lang.PlaceGroup.SimplePlaceGroup)(x10.lang.PlaceGroup.get$WORLD()));
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final x10.core.fun.Fun_0_0 t$145294 = ((x10.core.fun.Fun_0_0)(new x10.util.WorkerLocalStorage.$Closure$328<$Key, $Value>($Key, $Value)));
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        final x10.lang.PlaceLocalHandle t$145295 = x10.lang.PlaceLocalHandle.<x10.core.Rail<x10.util.HashMap<$Key, $Value>>> make__1$1x10$lang$PlaceLocalHandle$$T$2(x10.rtt.ParameterizedType.make(x10.core.Rail.$RTT, x10.rtt.ParameterizedType.make(x10.util.HashMap.$RTT, $Key, $Value)), ((x10.lang.PlaceGroup)(t$145293)), ((x10.core.fun.Fun_0_0)(t$145294)));
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
        ((x10.util.WorkerLocalStorage<$Key, $Value>)this).store = t$145295;
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$328<$Key, $Value> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$328> $RTT = 
            x10.rtt.StaticFunType.<$Closure$328> make($Closure$328.class,
                                                      2,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.core.Rail.$RTT, x10.rtt.ParameterizedType.make(x10.util.HashMap.$RTT, x10.rtt.UnresolvedType.PARAM(0), x10.rtt.UnresolvedType.PARAM(1))))
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Key; if (i == 1) return $Value; return null; }
        
        public static <$Key, $Value> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.WorkerLocalStorage.$Closure$328<$Key, $Value> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Key = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$Value = (x10.rtt.Type) $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.WorkerLocalStorage.$Closure$328 $_obj = new x10.util.WorkerLocalStorage.$Closure$328((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Key);
            $serializer.write(this.$Value);
            
        }
        
        // constructor just for allocation
        public $Closure$328(final java.lang.System[] $dummy, final x10.rtt.Type $Key, final x10.rtt.Type $Value) {
            x10.util.WorkerLocalStorage.$Closure$328.$initParams(this, $Key, $Value);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.core.Rail $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $Key;
        private x10.rtt.Type $Value;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$328 $this, final x10.rtt.Type $Key, final x10.rtt.Type $Value) {
            $this.$Key = $Key;
            $this.$Value = $Value;
            
        }
        
    
        
        public x10.core.Rail $apply() {
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
            final int t$145290 = x10.lang.Runtime.get$MAX_THREADS();
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
            final long t$145291 = ((long)(((int)(t$145290))));
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
            final x10.core.Rail t$145292 = ((x10.core.Rail)(new x10.core.Rail<x10.util.HashMap<$Key, $Value>>(x10.rtt.ParameterizedType.make(x10.util.HashMap.$RTT, $Key, $Value), t$145291)));
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalStorage.x10"
            return t$145292;
        }
        
        public $Closure$328(final x10.rtt.Type $Key, final x10.rtt.Type $Value) {
            x10.util.WorkerLocalStorage.$Closure$328.$initParams(this, $Key, $Value);
             {
                
            }
        }
        
    }
    
}

