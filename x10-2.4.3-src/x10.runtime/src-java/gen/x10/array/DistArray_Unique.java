package x10.array;


@x10.runtime.impl.java.X10Generated
final public class DistArray_Unique<$T> extends x10.array.DistArray<$T> implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<DistArray_Unique> $RTT = 
        x10.rtt.NamedType.<DistArray_Unique> make("x10.array.DistArray_Unique",
                                                  DistArray_Unique.class,
                                                  1,
                                                  new x10.rtt.Type[] {
                                                      x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.UnresolvedType.PARAM(0)),
                                                      x10.rtt.ParameterizedType.make(x10.array.DistArray.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                                  });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.DistArray_Unique<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.array.DistArray.$_deserialize_body($_obj, $deserializer);
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.array.DistArray_Unique $_obj = new x10.array.DistArray_Unique((java.lang.System[]) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.$T);
        
    }
    
    // constructor just for allocation
    public DistArray_Unique(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        super($dummy, $T);
        x10.array.DistArray_Unique.$initParams(this, $T);
        
    }
    
    // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1){}:U
    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
        if (t1.equals(x10.rtt.Types.LONG)) { return $apply$G(x10.core.Long.$unbox(a1)); }
        if (t1.equals(x10.lang.Point.$RTT)) { return $apply$G((x10.lang.Point)a1); }
        throw new java.lang.Error("dispatch mechanism not completely implemented for contra-variant types.");
    }
    
    // bridge for method abstract public x10.array.DistArray[T].operator()=(p:x10.lang.Point{self.rank==this(:x10.array.DistArray).rank()}, v:T){}:T{self==v}
    public $T $set__1x10$array$DistArray$$T$G(x10.lang.Point a1, $T a2) {
        return $set__1x10$array$DistArray_Unique$$T$G(a1, a2);
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final DistArray_Unique $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    // synthetic type for parameter mangling
    public static final class __0$1x10$array$DistArray_Unique$$T$2 {}
    // synthetic type for parameter mangling
    public static final class __1$1x10$array$DistArray_Unique$$T$2 {}
    

    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    final public long rank$O() {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        return 1L;
    }
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    // creation method for java code (1-phase java constructor)
    public DistArray_Unique(final x10.rtt.Type $T) {
        this((java.lang.System[]) null, $T);
        x10$array$DistArray_Unique$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.array.DistArray_Unique<$T> x10$array$DistArray_Unique$$init$S() {
         {
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            final x10.lang.PlaceGroup.SimplePlaceGroup t$77296 = ((x10.lang.PlaceGroup.SimplePlaceGroup)(x10.lang.PlaceGroup.get$WORLD()));
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            final x10.core.fun.Fun_0_0 t$77297 = ((x10.core.fun.Fun_0_0)(new x10.array.DistArray_Unique.$Closure$9<$T>($T)));
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            final x10.lang.PlaceGroup.SimplePlaceGroup t$77305 = ((x10.lang.PlaceGroup.SimplePlaceGroup)(x10.lang.PlaceGroup.get$WORLD()));
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            final x10.lang.PlaceGroup this$77306 = ((x10.lang.PlaceGroup)
                                                     t$77305);
            
            //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final long t$77307 = this$77306.numPlaces$O();
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            /*super.*/x10$array$DistArray$$init$S(((x10.lang.PlaceGroup)(t$77296)), ((x10.core.fun.Fun_0_0)(t$77297)), t$77307, (x10.array.DistArray.__1$1x10$array$LocalState$1x10$array$DistArray$$T$2$2) null);
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            final x10.array.DistArray_Unique this$77308 = this;
        }
        return this;
    }
    
    
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    // creation method for java code (1-phase java constructor)
    public DistArray_Unique(final x10.rtt.Type $T, final x10.core.fun.Fun_0_0<$T> init, __0$1x10$array$DistArray_Unique$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$array$DistArray_Unique$$init$S(init, (x10.array.DistArray_Unique.__0$1x10$array$DistArray_Unique$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.array.DistArray_Unique<$T> x10$array$DistArray_Unique$$init$S(final x10.core.fun.Fun_0_0<$T> init, __0$1x10$array$DistArray_Unique$$T$2 $dummy) {
         {
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            final x10.lang.PlaceGroup.SimplePlaceGroup t$77309 = ((x10.lang.PlaceGroup.SimplePlaceGroup)(x10.lang.PlaceGroup.get$WORLD()));
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            final x10.core.fun.Fun_0_0 t$77310 = ((x10.core.fun.Fun_0_0)(new x10.array.DistArray_Unique.$Closure$10<$T>($T, init, (x10.array.DistArray_Unique.$Closure$10.__0$1x10$array$DistArray_Unique$$Closure$10$$T$2) null)));
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            final x10.lang.PlaceGroup.SimplePlaceGroup t$77319 = ((x10.lang.PlaceGroup.SimplePlaceGroup)(x10.lang.PlaceGroup.get$WORLD()));
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            final x10.lang.PlaceGroup this$77320 = ((x10.lang.PlaceGroup)
                                                     t$77319);
            
            //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final long t$77321 = this$77320.numPlaces$O();
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            /*super.*/x10$array$DistArray$$init$S(((x10.lang.PlaceGroup)(t$77309)), ((x10.core.fun.Fun_0_0)(t$77310)), t$77321, (x10.array.DistArray.__1$1x10$array$LocalState$1x10$array$DistArray$$T$2$2) null);
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            final x10.array.DistArray_Unique this$77322 = this;
        }
        return this;
    }
    
    
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    // creation method for java code (1-phase java constructor)
    public DistArray_Unique(final x10.rtt.Type $T, final x10.lang.PlaceGroup pg, final x10.core.fun.Fun_0_0<$T> init, __1$1x10$array$DistArray_Unique$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$array$DistArray_Unique$$init$S(pg, init, (x10.array.DistArray_Unique.__1$1x10$array$DistArray_Unique$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.array.DistArray_Unique<$T> x10$array$DistArray_Unique$$init$S(final x10.lang.PlaceGroup pg, final x10.core.fun.Fun_0_0<$T> init, __1$1x10$array$DistArray_Unique$$T$2 $dummy) {
         {
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            final x10.core.fun.Fun_0_0 t$77323 = ((x10.core.fun.Fun_0_0)(new x10.array.DistArray_Unique.$Closure$11<$T>($T, pg, init, (x10.array.DistArray_Unique.$Closure$11.__1$1x10$array$DistArray_Unique$$Closure$11$$T$2) null)));
            
            //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final long t$77329 = pg.numPlaces$O();
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            /*super.*/x10$array$DistArray$$init$S(((x10.lang.PlaceGroup)(pg)), ((x10.core.fun.Fun_0_0)(t$77323)), t$77329, (x10.array.DistArray.__1$1x10$array$LocalState$1x10$array$DistArray$$T$2$2) null);
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            final x10.array.DistArray_Unique this$77330 = this;
        }
        return this;
    }
    
    
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    public x10.array.DenseIterationSpace_1 globalIndices() {
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        final x10.array.DenseIterationSpace_1 alloc$77217 = ((x10.array.DenseIterationSpace_1)(new x10.array.DenseIterationSpace_1((java.lang.System[]) null)));
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        final x10.lang.PlaceGroup this$77331 = ((x10.lang.PlaceGroup)(placeGroup));
        
        //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final long t$77332 = this$77331.numPlaces$O();
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        final long t$77333 = ((t$77332) - (((long)(1L))));
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        alloc$77217.x10$array$DenseIterationSpace_1$$init$S(((long)(0L)), t$77333);
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        return alloc$77217;
    }
    
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    public x10.array.DenseIterationSpace_1 localIndices() {
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        final x10.lang.PlaceGroup t$77279 = ((x10.lang.PlaceGroup)(placeGroup));
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        final long idx = t$77279.indexOf$O(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))));
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        final x10.array.DenseIterationSpace_1 alloc$77218 = ((x10.array.DenseIterationSpace_1)(new x10.array.DenseIterationSpace_1((java.lang.System[]) null)));
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        alloc$77218.x10$array$DenseIterationSpace_1$$init$S(((long)(idx)), ((long)(idx)));
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        return alloc$77218;
    }
    
    
    //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    public x10.lang.Place place(final long i) {
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        boolean t$77281 = ((i) >= (((long)(0L))));
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        if (t$77281) {
            
            //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            final x10.lang.PlaceGroup this$77251 = ((x10.lang.PlaceGroup)(placeGroup));
            
            //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
            final long t$77280 = this$77251.numPlaces$O();
            
            //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            t$77281 = ((i) < (((long)(t$77280))));
        }
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        final boolean t$77283 = t$77281;
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        x10.lang.Place t$77284 =  null;
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        if (t$77283) {
            
            //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            final x10.lang.PlaceGroup t$77282 = ((x10.lang.PlaceGroup)(placeGroup));
            
            //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            t$77284 = t$77282.$apply((long)(i));
        } else {
            
            //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            t$77284 = x10.lang.Place.get$INVALID_PLACE();
        }
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        final x10.lang.Place t$77285 = t$77284;
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        return t$77285;
    }
    
    
    //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    public x10.lang.Place place(final x10.lang.Point p) {
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        final long t$77286 = p.$apply$O((long)(0L));
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        final x10.lang.Place t$77287 = this.place((long)(t$77286));
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        return t$77287;
    }
    
    
    //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    public $T $apply$G(final long i) {
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        final x10.core.Rail t$77288 = ((x10.core.Rail)(raw));
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        final $T t$77289 = (($T)(((x10.core.Rail<$T>)t$77288).$apply$G((long)(0L))));
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        return t$77289;
    }
    
    
    //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    public $T $apply$G(final x10.lang.Point p) {
        
        //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        final x10.array.DistArray_Unique this$77253 = ((x10.array.DistArray_Unique)(this));
        
        //#line 99 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        final long i$77252 = p.$apply$O((long)(0L));
        
        //#line 99 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        $T ret$77254 =  null;
        
        //#line 101 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        final x10.core.Rail t$77334 = ((x10.core.Rail)(((x10.array.DistArray<$T>)this$77253).raw));
        
        //#line 101 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        final $T t$77335 = (($T)(((x10.core.Rail<$T>)t$77334).$apply$G((long)(0L))));
        
        //#line 101 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        ret$77254 = (($T)(t$77335));
        
        //#line 99 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        final $T t$77292 = (($T)(ret$77254));
        
        //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        return t$77292;
    }
    
    
    //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    public $T $set__1x10$array$DistArray_Unique$$T$G(final long i, final $T v) {
        
        //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        final x10.core.Rail t$77293 = ((x10.core.Rail)(raw));
        
        //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        ((x10.core.Rail<$T>)t$77293).$set__1x10$lang$Rail$$T$G((long)(0L), (($T)(v)));
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        return v;
    }
    
    
    //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    public $T $set__1x10$array$DistArray_Unique$$T$G(final x10.lang.Point p, final $T v) {
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        final x10.array.DistArray_Unique this$77258 = ((x10.array.DistArray_Unique)(this));
        
        //#line 123 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        final long i$77256 = p.$apply$O((long)(0L));
        
        //#line 123 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        final $T v$77257 = (($T)(v));
        
        //#line 123 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        $T ret$77259 =  null;
        
        //#line 125 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        final x10.core.Rail t$77336 = ((x10.core.Rail)(((x10.array.DistArray<$T>)this$77258).raw));
        
        //#line 125 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        ((x10.core.Rail<$T>)t$77336).$set__1x10$lang$Rail$$T$G((long)(0L), (($T)(v$77257)));
        
        //#line 126 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        ret$77259 = (($T)(v$77257));
        
        //#line 123 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        final $T t$77295 = (($T)(ret$77259));
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        return t$77295;
    }
    
    
    //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    private void validateIndex(final long i) {
        
    }
    
    public static <$T>void validateIndex$P__1$1x10$array$DistArray_Unique$$T$2(final x10.rtt.Type $T, final long i, final x10.array.DistArray_Unique<$T> DistArray_Unique) {
        ((x10.array.DistArray_Unique<$T>)DistArray_Unique).validateIndex((long)(i));
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    final public x10.array.DistArray_Unique x10$array$DistArray_Unique$$this$x10$array$DistArray_Unique() {
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        return x10.array.DistArray_Unique.this;
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    final public void __fieldInitializers_x10_array_DistArray_Unique() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$9<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$9> $RTT = 
            x10.rtt.StaticFunType.<$Closure$9> make($Closure$9.class,
                                                    1,
                                                    new x10.rtt.Type[] {
                                                        x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.array.LocalState.$RTT, x10.rtt.UnresolvedType.PARAM(0)))
                                                    });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.DistArray_Unique.$Closure$9<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.array.DistArray_Unique.$Closure$9 $_obj = new x10.array.DistArray_Unique.$Closure$9((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            
        }
        
        // constructor just for allocation
        public $Closure$9(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.array.DistArray_Unique.$Closure$9.$initParams(this, $T);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.array.LocalState $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$9 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        
    
        
        public x10.array.LocalState $apply() {
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            final x10.array.LocalState alloc$77298 = ((x10.array.LocalState)(new x10.array.LocalState<$T>((java.lang.System[]) null, $T)));
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            final x10.lang.PlaceGroup.SimplePlaceGroup t$77299 = ((x10.lang.PlaceGroup.SimplePlaceGroup)(x10.lang.PlaceGroup.get$WORLD()));
            
            //#line 291 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final x10.lang.PlaceGroup pg$77300 = ((x10.lang.PlaceGroup)(((x10.lang.PlaceGroup)
                                                                          t$77299)));
            
            //#line 291 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final x10.core.Rail rail$77301 = ((x10.core.Rail)(new x10.core.Rail<$T>($T, ((long)(1L)))));
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            final x10.lang.PlaceGroup.SimplePlaceGroup t$77302 = ((x10.lang.PlaceGroup.SimplePlaceGroup)(x10.lang.PlaceGroup.get$WORLD()));
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            final x10.lang.PlaceGroup this$77303 = ((x10.lang.PlaceGroup)
                                                     t$77302);
            
            //#line 291 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final long size$77304 = this$77303.numPlaces$O();
            
            //#line 292 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            ((x10.array.LocalState<$T>)alloc$77298).pg = ((x10.lang.PlaceGroup)(pg$77300));
            
            //#line 292 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            ((x10.array.LocalState<$T>)alloc$77298).rail = ((x10.core.Rail)(rail$77301));
            
            //#line 292 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            ((x10.array.LocalState<$T>)alloc$77298).size = size$77304;
            {
                
            }
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            return alloc$77298;
        }
        
        public $Closure$9(final x10.rtt.Type $T) {
            x10.array.DistArray_Unique.$Closure$9.$initParams(this, $T);
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$10<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$10> $RTT = 
            x10.rtt.StaticFunType.<$Closure$10> make($Closure$10.class,
                                                     1,
                                                     new x10.rtt.Type[] {
                                                         x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.array.LocalState.$RTT, x10.rtt.UnresolvedType.PARAM(0)))
                                                     });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.DistArray_Unique.$Closure$10<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.init = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.array.DistArray_Unique.$Closure$10 $_obj = new x10.array.DistArray_Unique.$Closure$10((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.init);
            
        }
        
        // constructor just for allocation
        public $Closure$10(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.array.DistArray_Unique.$Closure$10.$initParams(this, $T);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.array.LocalState $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$10 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$array$DistArray_Unique$$Closure$10$$T$2 {}
        
    
        
        public x10.array.LocalState $apply() {
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            final x10.array.LocalState alloc$77311 = ((x10.array.LocalState)(new x10.array.LocalState<$T>((java.lang.System[]) null, $T)));
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            final x10.lang.PlaceGroup.SimplePlaceGroup t$77312 = ((x10.lang.PlaceGroup.SimplePlaceGroup)(x10.lang.PlaceGroup.get$WORLD()));
            
            //#line 291 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final x10.lang.PlaceGroup pg$77313 = ((x10.lang.PlaceGroup)(((x10.lang.PlaceGroup)
                                                                          t$77312)));
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            final $T t$77314 = (($T)(((x10.core.fun.Fun_0_0<$T>)this.init).$apply$G()));
            
            //#line 291 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final x10.core.Rail rail$77315 = ((x10.core.Rail)(new x10.core.Rail<$T>($T, ((long)(1L)), t$77314, (x10.core.Rail.__1x10$lang$Rail$$T) null)));
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            final x10.lang.PlaceGroup.SimplePlaceGroup t$77316 = ((x10.lang.PlaceGroup.SimplePlaceGroup)(x10.lang.PlaceGroup.get$WORLD()));
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            final x10.lang.PlaceGroup this$77317 = ((x10.lang.PlaceGroup)
                                                     t$77316);
            
            //#line 291 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final long size$77318 = this$77317.numPlaces$O();
            
            //#line 292 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            ((x10.array.LocalState<$T>)alloc$77311).pg = ((x10.lang.PlaceGroup)(pg$77313));
            
            //#line 292 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            ((x10.array.LocalState<$T>)alloc$77311).rail = ((x10.core.Rail)(rail$77315));
            
            //#line 292 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            ((x10.array.LocalState<$T>)alloc$77311).size = size$77318;
            {
                
            }
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            return alloc$77311;
        }
        
        public x10.core.fun.Fun_0_0<$T> init;
        
        public $Closure$10(final x10.rtt.Type $T, final x10.core.fun.Fun_0_0<$T> init, __0$1x10$array$DistArray_Unique$$Closure$10$$T$2 $dummy) {
            x10.array.DistArray_Unique.$Closure$10.$initParams(this, $T);
             {
                ((x10.array.DistArray_Unique.$Closure$10<$T>)this).init = ((x10.core.fun.Fun_0_0)(init));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$11<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$11> $RTT = 
            x10.rtt.StaticFunType.<$Closure$11> make($Closure$11.class,
                                                     1,
                                                     new x10.rtt.Type[] {
                                                         x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.array.LocalState.$RTT, x10.rtt.UnresolvedType.PARAM(0)))
                                                     });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.DistArray_Unique.$Closure$11<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.pg = $deserializer.readObject();
            $_obj.init = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.array.DistArray_Unique.$Closure$11 $_obj = new x10.array.DistArray_Unique.$Closure$11((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.pg);
            $serializer.write(this.init);
            
        }
        
        // constructor just for allocation
        public $Closure$11(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.array.DistArray_Unique.$Closure$11.$initParams(this, $T);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.array.LocalState $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$11 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __1$1x10$array$DistArray_Unique$$Closure$11$$T$2 {}
        
    
        
        public x10.array.LocalState $apply() {
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            final x10.array.LocalState alloc$77324 = ((x10.array.LocalState)(new x10.array.LocalState<$T>((java.lang.System[]) null, $T)));
            
            //#line 291 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final x10.lang.PlaceGroup pg$77325 = ((x10.lang.PlaceGroup)(this.pg));
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            final $T t$77326 = (($T)(((x10.core.fun.Fun_0_0<$T>)this.init).$apply$G()));
            
            //#line 291 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final x10.core.Rail rail$77327 = ((x10.core.Rail)(new x10.core.Rail<$T>($T, ((long)(1L)), t$77326, (x10.core.Rail.__1x10$lang$Rail$$T) null)));
            
            //#line 291 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final long size$77328 = this.pg.numPlaces$O();
            
            //#line 292 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            ((x10.array.LocalState<$T>)alloc$77324).pg = ((x10.lang.PlaceGroup)(pg$77325));
            
            //#line 292 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            ((x10.array.LocalState<$T>)alloc$77324).rail = ((x10.core.Rail)(rail$77327));
            
            //#line 292 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            ((x10.array.LocalState<$T>)alloc$77324).size = size$77328;
            {
                
            }
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            return alloc$77324;
        }
        
        public x10.lang.PlaceGroup pg;
        public x10.core.fun.Fun_0_0<$T> init;
        
        public $Closure$11(final x10.rtt.Type $T, final x10.lang.PlaceGroup pg, final x10.core.fun.Fun_0_0<$T> init, __1$1x10$array$DistArray_Unique$$Closure$11$$T$2 $dummy) {
            x10.array.DistArray_Unique.$Closure$11.$initParams(this, $T);
             {
                ((x10.array.DistArray_Unique.$Closure$11<$T>)this).pg = ((x10.lang.PlaceGroup)(pg));
                ((x10.array.DistArray_Unique.$Closure$11<$T>)this).init = ((x10.core.fun.Fun_0_0)(init));
            }
        }
        
    }
    
}

