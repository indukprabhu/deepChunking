package x10.array;


@x10.runtime.impl.java.X10Generated
public class DistArray_Block_1<$T> extends x10.array.DistArray<$T> implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<DistArray_Block_1> $RTT = 
        x10.rtt.NamedType.<DistArray_Block_1> make("x10.array.DistArray_Block_1",
                                                   DistArray_Block_1.class,
                                                   1,
                                                   new x10.rtt.Type[] {
                                                       x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.UnresolvedType.PARAM(0)),
                                                       x10.rtt.ParameterizedType.make(x10.array.DistArray.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                                   });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.DistArray_Block_1<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.array.DistArray.$_deserialize_body($_obj, $deserializer);
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.globalIndices = $deserializer.readObject();
        
        /* fields with @TransientInitExpr annotations */
        $_obj.localIndices = $_obj.reloadLocalIndices();
        $_obj.minLocalIndex = $_obj.reloadMinLocalIndex$O();
        $_obj.maxLocalIndex = $_obj.reloadMaxLocalIndex$O();
        
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.array.DistArray_Block_1 $_obj = new x10.array.DistArray_Block_1((java.lang.System[]) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.$T);
        $serializer.write(this.globalIndices);
        
    }
    
    // constructor just for allocation
    public DistArray_Block_1(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        super($dummy, $T);
        x10.array.DistArray_Block_1.$initParams(this, $T);
        
    }
    
    // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1){}:U
    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
        if (t1.equals(x10.rtt.Types.LONG)) { return $apply$G(x10.core.Long.$unbox(a1)); }
        if (t1.equals(x10.lang.Point.$RTT)) { return $apply$G((x10.lang.Point)a1); }
        throw new java.lang.Error("dispatch mechanism not completely implemented for contra-variant types.");
    }
    
    // bridge for method abstract public x10.array.DistArray[T].operator()=(p:x10.lang.Point{self.rank==this(:x10.array.DistArray).rank()}, v:T){}:T{self==v}
    final public $T $set__1x10$array$DistArray$$T$G(x10.lang.Point a1, $T a2) {
        return $set__1x10$array$DistArray_Block_1$$T$G(a1, a2);
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final DistArray_Block_1 $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    // synthetic type for parameter mangling
    public static final class __2$1x10$lang$Long$3x10$array$DistArray_Block_1$$T$2 {}
    // synthetic type for parameter mangling
    public static final class __1$1x10$lang$Long$3x10$array$DistArray_Block_1$$T$2 {}
    

    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    final public long rank$O() {
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        return 1L;
    }
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    public x10.array.DenseIterationSpace_1 globalIndices;
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    public transient x10.array.DenseIterationSpace_1 localIndices;
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    final public x10.array.DenseIterationSpace_1 reloadLocalIndices() {
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final x10.lang.PlaceLocalHandle t$77091 = ((x10.lang.PlaceLocalHandle)(localHandle));
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final x10.array.LocalState t$77092 = ((x10.lang.PlaceLocalHandle<x10.array.LocalState<$T>>)t$77091).$apply$G();
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final x10.array.LocalState_B1 ls = x10.rtt.Types.<x10.array.LocalState_B1<$T>> cast(t$77092,x10.rtt.ParameterizedType.make(x10.array.LocalState_B1.$RTT, $T));
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final boolean t$77093 = ((ls) != (null));
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        x10.array.DenseIterationSpace_1 t$77094 =  null;
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        if (t$77093) {
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            t$77094 = ((x10.array.DenseIterationSpace_1)(((x10.array.LocalState_B1<$T>)ls).localIndices));
        } else {
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final x10.array.DenseIterationSpace_1 alloc$77028 = ((x10.array.DenseIterationSpace_1)(new x10.array.DenseIterationSpace_1((java.lang.System[]) null)));
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            alloc$77028.x10$array$DenseIterationSpace_1$$init$S(((long)(0L)), ((long)(-1L)));
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            t$77094 = ((x10.array.DenseIterationSpace_1)(alloc$77028));
        }
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final x10.array.DenseIterationSpace_1 t$77095 = ((x10.array.DenseIterationSpace_1)(t$77094));
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        return t$77095;
    }
    
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    public transient long minLocalIndex;
    
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    final public long reloadMinLocalIndex$O() {
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final x10.array.DenseIterationSpace_1 t$77096 = ((x10.array.DenseIterationSpace_1)(localIndices));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final long t$77097 = t$77096.min$O((long)(0L));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        return t$77097;
    }
    
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    public transient long maxLocalIndex;
    
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    final public long reloadMaxLocalIndex$O() {
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final x10.array.DenseIterationSpace_1 t$77098 = ((x10.array.DenseIterationSpace_1)(localIndices));
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final long t$77099 = t$77098.max$O((long)(0L));
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        return t$77099;
    }
    
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    // creation method for java code (1-phase java constructor)
    public DistArray_Block_1(final x10.rtt.Type $T, final long n, final x10.lang.PlaceGroup pg, final x10.core.fun.Fun_0_1<x10.core.Long,$T> init, __2$1x10$lang$Long$3x10$array$DistArray_Block_1$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$array$DistArray_Block_1$$init$S(n, pg, init, (x10.array.DistArray_Block_1.__2$1x10$lang$Long$3x10$array$DistArray_Block_1$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.array.DistArray_Block_1<$T> x10$array$DistArray_Block_1$$init$S(final long n, final x10.lang.PlaceGroup pg, final x10.core.fun.Fun_0_1<x10.core.Long,$T> init, __2$1x10$lang$Long$3x10$array$DistArray_Block_1$$T$2 $dummy) {
         {
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final x10.core.fun.Fun_0_0 t$77151 = ((x10.core.fun.Fun_0_0)(new x10.array.DistArray_Block_1.$Closure$6<$T>($T, pg, n, init, (x10.array.DistArray_Block_1.$Closure$6.__2$1x10$lang$Long$3x10$array$DistArray_Block_1$$Closure$6$$T$2) null)));
            
            //#line 203 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final long n$77153 = n;
            
            //#line 203 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            long ret$77154 =  0;
            
            //#line 204 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final boolean t$77150 = ((n$77153) < (((long)(0L))));
            
            //#line 204 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            if (t$77150) {
                
                //#line 204 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
                x10.array.DistArray.raiseNegativeArraySizeException();
            }
            
            //#line 205 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            ret$77154 = n$77153;
            
            //#line 203 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final long t$77155 = ret$77154;
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            /*super.*/x10$array$DistArray$$init$S(((x10.lang.PlaceGroup)(pg)), ((x10.core.fun.Fun_0_0)(t$77151)), t$77155, (x10.array.DistArray.__1$1x10$array$LocalState$1x10$array$DistArray$$T$2$2) null);
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final x10.array.DistArray_Block_1 this$77156 = this;
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final x10.array.DenseIterationSpace_1 alloc$77029 = ((x10.array.DenseIterationSpace_1)(new x10.array.DenseIterationSpace_1((java.lang.System[]) null)));
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final long t$77157 = ((n) - (((long)(1L))));
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            alloc$77029.x10$array$DenseIterationSpace_1$$init$S(((long)(0L)), t$77157);
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            ((x10.array.DistArray_Block_1<$T>)this).globalIndices = ((x10.array.DenseIterationSpace_1)(alloc$77029));
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final x10.array.DenseIterationSpace_1 t$77105 = ((x10.array.DenseIterationSpace_1)(this.reloadLocalIndices()));
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            ((x10.array.DistArray_Block_1<$T>)this).localIndices = ((x10.array.DenseIterationSpace_1)(t$77105));
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final x10.array.DistArray_Block_1 this$77055 = ((x10.array.DistArray_Block_1)(this));
            
            //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final x10.array.DenseIterationSpace_1 t$77106 = ((x10.array.DenseIterationSpace_1)(((x10.array.DistArray_Block_1<$T>)this$77055).localIndices));
            
            //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final long t$77107 = t$77106.min$O((long)(0L));
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            ((x10.array.DistArray_Block_1<$T>)this).minLocalIndex = t$77107;
            
            //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final x10.array.DistArray_Block_1 this$77056 = ((x10.array.DistArray_Block_1)(this));
            
            //#line 42 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final x10.array.DenseIterationSpace_1 t$77108 = ((x10.array.DenseIterationSpace_1)(((x10.array.DistArray_Block_1<$T>)this$77056).localIndices));
            
            //#line 42 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final long t$77109 = t$77108.max$O((long)(0L));
            
            //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            ((x10.array.DistArray_Block_1<$T>)this).maxLocalIndex = t$77109;
        }
        return this;
    }
    
    
    
    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    // creation method for java code (1-phase java constructor)
    public DistArray_Block_1(final x10.rtt.Type $T, final long n, final x10.core.fun.Fun_0_1<x10.core.Long,$T> init, __1$1x10$lang$Long$3x10$array$DistArray_Block_1$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$array$DistArray_Block_1$$init$S(n, init, (x10.array.DistArray_Block_1.__1$1x10$lang$Long$3x10$array$DistArray_Block_1$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.array.DistArray_Block_1<$T> x10$array$DistArray_Block_1$$init$S(final long n, final x10.core.fun.Fun_0_1<x10.core.Long,$T> init, __1$1x10$lang$Long$3x10$array$DistArray_Block_1$$T$2 $dummy) {
         {
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final x10.lang.PlaceGroup.SimplePlaceGroup t$77110 = ((x10.lang.PlaceGroup.SimplePlaceGroup)(x10.lang.PlaceGroup.get$WORLD()));
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            /*this.*/x10$array$DistArray_Block_1$$init$S(((long)(n)), ((x10.lang.PlaceGroup)(t$77110)), ((x10.core.fun.Fun_0_1)(init)), (x10.array.DistArray_Block_1.__2$1x10$lang$Long$3x10$array$DistArray_Block_1$$T$2) null);
        }
        return this;
    }
    
    
    
    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    // creation method for java code (1-phase java constructor)
    public DistArray_Block_1(final x10.rtt.Type $T, final long n, final x10.lang.PlaceGroup pg) {
        this((java.lang.System[]) null, $T);
        x10$array$DistArray_Block_1$$init$S(n, pg);
    }
    
    // constructor for non-virtual call
    final public x10.array.DistArray_Block_1<$T> x10$array$DistArray_Block_1$$init$S(final long n, final x10.lang.PlaceGroup pg) {
         {
            
            //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final x10.core.fun.Fun_0_1 t$77112 = ((x10.core.fun.Fun_0_1)(new x10.array.DistArray_Block_1.$Closure$7<$T>($T)));
            
            //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            /*this.*/x10$array$DistArray_Block_1$$init$S(((long)(n)), ((x10.lang.PlaceGroup)(pg)), ((x10.core.fun.Fun_0_1)(t$77112)), (x10.array.DistArray_Block_1.__2$1x10$lang$Long$3x10$array$DistArray_Block_1$$T$2) null);
        }
        return this;
    }
    
    
    
    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    // creation method for java code (1-phase java constructor)
    public DistArray_Block_1(final x10.rtt.Type $T, final long n) {
        this((java.lang.System[]) null, $T);
        x10$array$DistArray_Block_1$$init$S(n);
    }
    
    // constructor for non-virtual call
    final public x10.array.DistArray_Block_1<$T> x10$array$DistArray_Block_1$$init$S(final long n) {
         {
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final x10.lang.PlaceGroup.SimplePlaceGroup t$77114 = ((x10.lang.PlaceGroup.SimplePlaceGroup)(x10.lang.PlaceGroup.get$WORLD()));
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final x10.core.fun.Fun_0_1 t$77115 = ((x10.core.fun.Fun_0_1)(new x10.array.DistArray_Block_1.$Closure$8<$T>($T)));
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            /*this.*/x10$array$DistArray_Block_1$$init$S(((long)(n)), ((x10.lang.PlaceGroup)(t$77114)), ((x10.core.fun.Fun_0_1)(t$77115)), (x10.array.DistArray_Block_1.__2$1x10$lang$Long$3x10$array$DistArray_Block_1$$T$2) null);
        }
        return this;
    }
    
    
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    final public x10.array.DenseIterationSpace_1 globalIndices() {
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final x10.array.DenseIterationSpace_1 t$77116 = ((x10.array.DenseIterationSpace_1)(globalIndices));
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        return t$77116;
    }
    
    
    //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    final public x10.array.DenseIterationSpace_1 localIndices() {
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final x10.array.DenseIterationSpace_1 t$77117 = ((x10.array.DenseIterationSpace_1)(localIndices));
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        return t$77117;
    }
    
    
    //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    final public x10.lang.Place place(final long i) {
        
        //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final x10.array.DenseIterationSpace_1 t$77118 = ((x10.array.DenseIterationSpace_1)(globalIndices));
        
        //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final x10.lang.PlaceGroup this$77057 = ((x10.lang.PlaceGroup)(placeGroup));
        
        //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final long t$77119 = this$77057.numPlaces$O();
        
        //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final long tmp = x10.array.BlockingUtils.mapIndexToBlockPartition$O(((x10.array.IterationSpace)(t$77118)), (long)(t$77119), (long)(i));
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final boolean t$77121 = ((long) tmp) == ((long) -1L);
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        x10.lang.Place t$77122 =  null;
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        if (t$77121) {
            
            //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            t$77122 = x10.lang.Place.get$INVALID_PLACE();
        } else {
            
            //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final x10.lang.PlaceGroup t$77120 = ((x10.lang.PlaceGroup)(placeGroup));
            
            //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            t$77122 = t$77120.$apply((long)(tmp));
        }
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final x10.lang.Place t$77123 = t$77122;
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        return t$77123;
    }
    
    
    //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    final public x10.lang.Place place(final x10.lang.Point p) {
        
        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final long t$77124 = p.$apply$O((long)(0L));
        
        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final x10.lang.Place t$77125 = this.place((long)(t$77124));
        
        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        return t$77125;
    }
    
    
    //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    final public $T $apply$G(final long i) {
        
        //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.Rail r$77058 = ((x10.core.Rail)(raw));
        
        //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final long t$77126 = minLocalIndex;
        
        //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final long i$77059 = ((i) - (((long)(t$77126))));
        
        //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final $T t$77127 = (($T)(((x10.core.Rail<$T>)r$77058).$apply$G((long)(i$77059))));
        
        //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        return t$77127;
    }
    
    
    //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    final public $T $apply$G(final x10.lang.Point p) {
        
        //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final x10.array.DistArray_Block_1 this$77061 = ((x10.array.DistArray_Block_1)(this));
        
        //#line 149 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final long i$77060 = p.$apply$O((long)(0L));
        
        //#line 149 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        $T ret$77062 =  null;
        
        //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.Rail r$77158 = ((x10.core.Rail)(((x10.array.DistArray<$T>)this$77061).raw));
        
        //#line 156 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final long t$77159 = ((x10.array.DistArray_Block_1<$T>)this$77061).minLocalIndex;
        
        //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final long i$77160 = ((i$77060) - (((long)(t$77159))));
        
        //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final $T t$77161 = (($T)(((x10.core.Rail<$T>)r$77158).$apply$G((long)(i$77160))));
        
        //#line 156 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        ret$77062 = (($T)(t$77161));
        
        //#line 149 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final $T t$77130 = (($T)(ret$77062));
        
        //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        return t$77130;
    }
    
    
    //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    final public $T $set__1x10$array$DistArray_Block_1$$T$G(final long i, final $T v) {
        
        //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.Rail r$77066 = ((x10.core.Rail)(raw));
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final long t$77131 = minLocalIndex;
        
        //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final long i$77067 = ((i) - (((long)(t$77131))));
        
        //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final $T v$77068 = (($T)(v));
        
        //#line 40 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        $T ret$77069 =  null;
        
        //#line 42 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        ((x10.core.Rail<$T>)r$77066).$set__1x10$lang$Rail$$T$G((long)(i$77067), (($T)(v$77068)));
        
        //#line 43 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        ret$77069 = (($T)(v$77068));
        
        //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        return v;
    }
    
    
    //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    final public $T $set__1x10$array$DistArray_Block_1$$T$G(final x10.lang.Point p, final $T v) {
        
        //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final x10.array.DistArray_Block_1 this$77073 = ((x10.array.DistArray_Block_1)(this));
        
        //#line 179 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final long i$77071 = p.$apply$O((long)(0L));
        
        //#line 179 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final $T v$77072 = (($T)(v));
        
        //#line 179 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        $T ret$77074 =  null;
        
        //#line 41 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.Rail r$77162 = ((x10.core.Rail)(((x10.array.DistArray<$T>)this$77073).raw));
        
        //#line 186 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final long t$77163 = ((x10.array.DistArray_Block_1<$T>)this$77073).minLocalIndex;
        
        //#line 41 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final long i$77164 = ((i$77071) - (((long)(t$77163))));
        
        //#line 41 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final $T v$77165 = (($T)(v$77072));
        
        //#line 40 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        $T ret$77166 =  null;
        
        //#line 42 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        ((x10.core.Rail<$T>)r$77162).$set__1x10$lang$Rail$$T$G((long)(i$77164), (($T)(v$77165)));
        
        //#line 43 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        ret$77166 = (($T)(v$77165));
        
        //#line 187 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        ret$77074 = (($T)(v$77072));
        
        //#line 179 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final $T t$77133 = (($T)(ret$77074));
        
        //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        return t$77133;
    }
    
    
    //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    private static long validateSize$O(final long n) {
        
        //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        final boolean t$77134 = ((n) < (((long)(0L))));
        
        //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        if (t$77134) {
            
            //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            x10.array.DistArray.raiseNegativeArraySizeException();
        }
        
        //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        return n;
    }
    
    public static long validateSize$P$O(final long n) {
        return x10.array.DistArray_Block_1.validateSize$O((long)(n));
    }
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    final public x10.array.DistArray_Block_1 x10$array$DistArray_Block_1$$this$x10$array$DistArray_Block_1() {
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        return x10.array.DistArray_Block_1.this;
    }
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    final public void __fieldInitializers_x10_array_DistArray_Block_1() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$6<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$6> $RTT = 
            x10.rtt.StaticFunType.<$Closure$6> make($Closure$6.class,
                                                    1,
                                                    new x10.rtt.Type[] {
                                                        x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.array.LocalState_B1.$RTT, x10.rtt.UnresolvedType.PARAM(0)))
                                                    });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.DistArray_Block_1.$Closure$6<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.pg = $deserializer.readObject();
            $_obj.n = $deserializer.readLong();
            $_obj.init = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.array.DistArray_Block_1.$Closure$6 $_obj = new x10.array.DistArray_Block_1.$Closure$6((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.pg);
            $serializer.write(this.n);
            $serializer.write(this.init);
            
        }
        
        // constructor just for allocation
        public $Closure$6(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.array.DistArray_Block_1.$Closure$6.$initParams(this, $T);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.array.LocalState_B1 $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$6 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __2$1x10$lang$Long$3x10$array$DistArray_Block_1$$Closure$6$$T$2 {}
        
    
        
        public x10.array.LocalState_B1 $apply() {
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final x10.array.LocalState_B1 t$77152 = x10.array.LocalState_B1.<$T> make__2$1x10$lang$Long$3x10$array$LocalState_B1$$S$2($T, ((x10.lang.PlaceGroup)(this.pg)), (long)(this.n), ((x10.core.fun.Fun_0_1)(this.init)));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            return t$77152;
        }
        
        public x10.lang.PlaceGroup pg;
        public long n;
        public x10.core.fun.Fun_0_1<x10.core.Long,$T> init;
        
        public $Closure$6(final x10.rtt.Type $T, final x10.lang.PlaceGroup pg, final long n, final x10.core.fun.Fun_0_1<x10.core.Long,$T> init, __2$1x10$lang$Long$3x10$array$DistArray_Block_1$$Closure$6$$T$2 $dummy) {
            x10.array.DistArray_Block_1.$Closure$6.$initParams(this, $T);
             {
                ((x10.array.DistArray_Block_1.$Closure$6<$T>)this).pg = ((x10.lang.PlaceGroup)(pg));
                ((x10.array.DistArray_Block_1.$Closure$6<$T>)this).n = n;
                ((x10.array.DistArray_Block_1.$Closure$6<$T>)this).init = ((x10.core.fun.Fun_0_1)(init));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$7<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$7> $RTT = 
            x10.rtt.StaticFunType.<$Closure$7> make($Closure$7.class,
                                                    1,
                                                    new x10.rtt.Type[] {
                                                        x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.UnresolvedType.PARAM(0))
                                                    });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.DistArray_Block_1.$Closure$7<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.array.DistArray_Block_1.$Closure$7 $_obj = new x10.array.DistArray_Block_1.$Closure$7((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            
        }
        
        // constructor just for allocation
        public $Closure$7(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.array.DistArray_Block_1.$Closure$7.$initParams(this, $T);
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$G(x10.core.Long.$unbox(a1));
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$7 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        
    
        
        public $T $apply$G(final long id$44) {
            
            //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final $T t$77111 = (($T)(($T) x10.rtt.Types.zeroValue($T)));
            
            //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            return t$77111;
        }
        
        public $Closure$7(final x10.rtt.Type $T) {
            x10.array.DistArray_Block_1.$Closure$7.$initParams(this, $T);
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$8<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$8> $RTT = 
            x10.rtt.StaticFunType.<$Closure$8> make($Closure$8.class,
                                                    1,
                                                    new x10.rtt.Type[] {
                                                        x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.UnresolvedType.PARAM(0))
                                                    });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.DistArray_Block_1.$Closure$8<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.array.DistArray_Block_1.$Closure$8 $_obj = new x10.array.DistArray_Block_1.$Closure$8((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            
        }
        
        // constructor just for allocation
        public $Closure$8(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.array.DistArray_Block_1.$Closure$8.$initParams(this, $T);
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$G(x10.core.Long.$unbox(a1));
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$8 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        
    
        
        public $T $apply$G(final long id$45) {
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            final $T t$77113 = (($T)(($T) x10.rtt.Types.zeroValue($T)));
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
            return t$77113;
        }
        
        public $Closure$8(final x10.rtt.Type $T) {
            x10.array.DistArray_Block_1.$Closure$8.$initParams(this, $T);
             {
                
            }
        }
        
    }
    
}


