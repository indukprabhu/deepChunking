package x10.array;


@x10.runtime.impl.java.X10Generated
public class DistArray_BlockBlock_2<$T> extends x10.array.DistArray<$T> implements x10.core.fun.Fun_0_2, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<DistArray_BlockBlock_2> $RTT = 
        x10.rtt.NamedType.<DistArray_BlockBlock_2> make("x10.array.DistArray_BlockBlock_2",
                                                        DistArray_BlockBlock_2.class,
                                                        1,
                                                        new x10.rtt.Type[] {
                                                            x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_2.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG, x10.rtt.UnresolvedType.PARAM(0)),
                                                            x10.rtt.ParameterizedType.make(x10.array.DistArray.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                                        });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.DistArray_BlockBlock_2<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.array.DistArray.$_deserialize_body($_obj, $deserializer);
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.globalIndices = $deserializer.readObject();
        $_obj.numElems_1 = $deserializer.readLong();
        $_obj.numElems_2 = $deserializer.readLong();
        
        /* fields with @TransientInitExpr annotations */
        $_obj.localIndices = $_obj.reloadLocalIndices();
        $_obj.minIndex_1 = $_obj.reloadMinIndex_1$O();
        $_obj.minIndex_2 = $_obj.reloadMinIndex_2$O();
        $_obj.numElemsLocal_1 = $_obj.reloadNumElemsLocal_1$O();
        $_obj.numElemsLocal_2 = $_obj.reloadNumElemsLocal_2$O();
        
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.array.DistArray_BlockBlock_2 $_obj = new x10.array.DistArray_BlockBlock_2((java.lang.System[]) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.$T);
        $serializer.write(this.globalIndices);
        $serializer.write(this.numElems_1);
        $serializer.write(this.numElems_2);
        
    }
    
    // constructor just for allocation
    public DistArray_BlockBlock_2(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        super($dummy, $T);
        x10.array.DistArray_BlockBlock_2.$initParams(this, $T);
        
    }
    
    // dispatcher for method abstract public (Z1,Z2)=>U.operator()(a1:Z1, a2:Z2){}:U
    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
        return $apply$G(x10.core.Long.$unbox(a1), x10.core.Long.$unbox(a2));
        
    }
    
    // bridge for method abstract public x10.array.DistArray[T].operator()=(p:x10.lang.Point{self.rank==this(:x10.array.DistArray).rank()}, v:T){}:T{self==v}
    final public $T $set__1x10$array$DistArray$$T$G(x10.lang.Point a1, $T a2) {
        return $set__1x10$array$DistArray_BlockBlock_2$$T$G(a1, a2);
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final DistArray_BlockBlock_2 $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    // synthetic type for parameter mangling
    public static final class __3$1x10$lang$Long$3x10$lang$Long$3x10$array$DistArray_BlockBlock_2$$T$2 {}
    // synthetic type for parameter mangling
    public static final class __2$1x10$lang$Long$3x10$lang$Long$3x10$array$DistArray_BlockBlock_2$$T$2 {}
    

    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    final public long rank$O() {
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        return 2L;
    }
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    public x10.array.DenseIterationSpace_2 globalIndices;
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    public long numElems_1;
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    public long numElems_2;
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    public transient x10.array.DenseIterationSpace_2 localIndices;
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    final public x10.array.DenseIterationSpace_2 reloadLocalIndices() {
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final x10.lang.PlaceLocalHandle t$76729 = ((x10.lang.PlaceLocalHandle)(localHandle));
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final x10.array.LocalState t$76730 = ((x10.lang.PlaceLocalHandle<x10.array.LocalState<$T>>)t$76729).$apply$G();
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final x10.array.LocalState_BB2 ls = x10.rtt.Types.<x10.array.LocalState_BB2<$T>> cast(t$76730,x10.rtt.ParameterizedType.make(x10.array.LocalState_BB2.$RTT, $T));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final boolean t$76731 = ((ls) != (null));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        x10.array.DenseIterationSpace_2 t$76732 =  null;
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        if (t$76731) {
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            t$76732 = ((x10.array.DenseIterationSpace_2)(((x10.array.LocalState_BB2<$T>)ls).localIndices));
        } else {
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final x10.array.DenseIterationSpace_2 alloc$76635 = ((x10.array.DenseIterationSpace_2)(new x10.array.DenseIterationSpace_2((java.lang.System[]) null)));
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            alloc$76635.x10$array$DenseIterationSpace_2$$init$S(((long)(0L)), ((long)(-1L)), ((long)(0L)), ((long)(-1L)));
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            t$76732 = ((x10.array.DenseIterationSpace_2)(alloc$76635));
        }
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final x10.array.DenseIterationSpace_2 t$76733 = ((x10.array.DenseIterationSpace_2)(t$76732));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        return t$76733;
    }
    
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    public transient long minIndex_1;
    
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    final public long reloadMinIndex_1$O() {
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final x10.array.DenseIterationSpace_2 t$76734 = ((x10.array.DenseIterationSpace_2)(localIndices));
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76735 = t$76734.min$O((long)(0L));
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        return t$76735;
    }
    
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    public transient long minIndex_2;
    
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    final public long reloadMinIndex_2$O() {
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final x10.array.DenseIterationSpace_2 t$76736 = ((x10.array.DenseIterationSpace_2)(localIndices));
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76737 = t$76736.min$O((long)(1L));
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        return t$76737;
    }
    
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    public transient long numElemsLocal_1;
    
    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    final public long reloadNumElemsLocal_1$O() {
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final x10.array.DenseIterationSpace_2 t$76738 = ((x10.array.DenseIterationSpace_2)(localIndices));
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76739 = t$76738.max$O((long)(0L));
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76740 = minIndex_1;
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76741 = ((t$76739) - (((long)(t$76740))));
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76742 = ((t$76741) + (((long)(1L))));
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        return t$76742;
    }
    
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    public transient long numElemsLocal_2;
    
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    final public long reloadNumElemsLocal_2$O() {
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final x10.array.DenseIterationSpace_2 t$76743 = ((x10.array.DenseIterationSpace_2)(localIndices));
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76744 = t$76743.max$O((long)(1L));
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76745 = minIndex_2;
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76746 = ((t$76744) - (((long)(t$76745))));
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76747 = ((t$76746) + (((long)(1L))));
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        return t$76747;
    }
    
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    // creation method for java code (1-phase java constructor)
    public DistArray_BlockBlock_2(final x10.rtt.Type $T, final long m, final long n, final x10.lang.PlaceGroup pg, final x10.core.fun.Fun_0_2<x10.core.Long,x10.core.Long,$T> init, __3$1x10$lang$Long$3x10$lang$Long$3x10$array$DistArray_BlockBlock_2$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$array$DistArray_BlockBlock_2$$init$S(m, n, pg, init, (x10.array.DistArray_BlockBlock_2.__3$1x10$lang$Long$3x10$lang$Long$3x10$array$DistArray_BlockBlock_2$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.array.DistArray_BlockBlock_2<$T> x10$array$DistArray_BlockBlock_2$$init$S(final long m, final long n, final x10.lang.PlaceGroup pg, final x10.core.fun.Fun_0_2<x10.core.Long,x10.core.Long,$T> init, __3$1x10$lang$Long$3x10$lang$Long$3x10$array$DistArray_BlockBlock_2$$T$2 $dummy) {
         {
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final x10.core.fun.Fun_0_0 t$76857 = ((x10.core.fun.Fun_0_0)(new x10.array.DistArray_BlockBlock_2.$Closure$3<$T>($T, pg, m, n, init, (x10.array.DistArray_BlockBlock_2.$Closure$3.__3$1x10$lang$Long$3x10$lang$Long$3x10$array$DistArray_BlockBlock_2$$Closure$3$$T$2) null)));
            
            //#line 238 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long m$76859 = m;
            
            //#line 238 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long n$76860 = n;
            
            //#line 238 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            long ret$76861 =  0;
            
            //#line 239 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            boolean t$76854 = ((m$76859) < (((long)(0L))));
            
            //#line 239 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            if (!(t$76854)) {
                
                //#line 239 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
                t$76854 = ((n$76860) < (((long)(0L))));
            }
            
            //#line 239 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final boolean t$76855 = t$76854;
            
            //#line 239 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            if (t$76855) {
                
                //#line 239 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
                x10.array.DistArray.raiseNegativeArraySizeException();
            }
            
            //#line 240 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long t$76856 = ((m$76859) * (((long)(n$76860))));
            
            //#line 240 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            ret$76861 = t$76856;
            
            //#line 238 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long t$76862 = ret$76861;
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            /*super.*/x10$array$DistArray$$init$S(((x10.lang.PlaceGroup)(pg)), ((x10.core.fun.Fun_0_0)(t$76857)), t$76862, (x10.array.DistArray.__1$1x10$array$LocalState$1x10$array$DistArray$$T$2$2) null);
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final x10.array.DistArray_BlockBlock_2 this$76863 = this;
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final x10.array.DenseIterationSpace_2 alloc$76636 = ((x10.array.DenseIterationSpace_2)(new x10.array.DenseIterationSpace_2((java.lang.System[]) null)));
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long t$76864 = ((m) - (((long)(1L))));
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long t$76865 = ((n) - (((long)(1L))));
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            alloc$76636.x10$array$DenseIterationSpace_2$$init$S(((long)(0L)), ((long)(0L)), t$76864, t$76865);
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            ((x10.array.DistArray_BlockBlock_2<$T>)this).globalIndices = ((x10.array.DenseIterationSpace_2)(alloc$76636));
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final x10.array.DenseIterationSpace_2 t$76756 = ((x10.array.DenseIterationSpace_2)(globalIndices));
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long t$76758 = t$76756.max$O((long)(0L));
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final x10.array.DenseIterationSpace_2 t$76757 = ((x10.array.DenseIterationSpace_2)(globalIndices));
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long t$76759 = t$76757.min$O((long)(0L));
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long t$76760 = ((t$76758) - (((long)(t$76759))));
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long t$76761 = ((t$76760) + (((long)(1L))));
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            ((x10.array.DistArray_BlockBlock_2<$T>)this).numElems_1 = t$76761;
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final x10.array.DenseIterationSpace_2 t$76762 = ((x10.array.DenseIterationSpace_2)(globalIndices));
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long t$76764 = t$76762.max$O((long)(1L));
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final x10.array.DenseIterationSpace_2 t$76763 = ((x10.array.DenseIterationSpace_2)(globalIndices));
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long t$76765 = t$76763.min$O((long)(1L));
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long t$76766 = ((t$76764) - (((long)(t$76765))));
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long t$76767 = ((t$76766) + (((long)(1L))));
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            ((x10.array.DistArray_BlockBlock_2<$T>)this).numElems_2 = t$76767;
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final x10.array.DenseIterationSpace_2 t$76768 = ((x10.array.DenseIterationSpace_2)(this.reloadLocalIndices()));
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            ((x10.array.DistArray_BlockBlock_2<$T>)this).localIndices = ((x10.array.DenseIterationSpace_2)(t$76768));
            
            //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final x10.array.DistArray_BlockBlock_2 this$76681 = ((x10.array.DistArray_BlockBlock_2)(this));
            
            //#line 43 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final x10.array.DenseIterationSpace_2 t$76769 = ((x10.array.DenseIterationSpace_2)(((x10.array.DistArray_BlockBlock_2<$T>)this$76681).localIndices));
            
            //#line 43 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long t$76770 = t$76769.min$O((long)(0L));
            
            //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            ((x10.array.DistArray_BlockBlock_2<$T>)this).minIndex_1 = t$76770;
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final x10.array.DistArray_BlockBlock_2 this$76682 = ((x10.array.DistArray_BlockBlock_2)(this));
            
            //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final x10.array.DenseIterationSpace_2 t$76771 = ((x10.array.DenseIterationSpace_2)(((x10.array.DistArray_BlockBlock_2<$T>)this$76682).localIndices));
            
            //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long t$76772 = t$76771.min$O((long)(1L));
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            ((x10.array.DistArray_BlockBlock_2<$T>)this).minIndex_2 = t$76772;
            
            //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long t$76773 = this.reloadNumElemsLocal_1$O();
            
            //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            ((x10.array.DistArray_BlockBlock_2<$T>)this).numElemsLocal_1 = t$76773;
            
            //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final long t$76774 = this.reloadNumElemsLocal_2$O();
            
            //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            ((x10.array.DistArray_BlockBlock_2<$T>)this).numElemsLocal_2 = t$76774;
        }
        return this;
    }
    
    
    
    //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    // creation method for java code (1-phase java constructor)
    public DistArray_BlockBlock_2(final x10.rtt.Type $T, final long m, final long n, final x10.core.fun.Fun_0_2<x10.core.Long,x10.core.Long,$T> init, __2$1x10$lang$Long$3x10$lang$Long$3x10$array$DistArray_BlockBlock_2$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$array$DistArray_BlockBlock_2$$init$S(m, n, init, (x10.array.DistArray_BlockBlock_2.__2$1x10$lang$Long$3x10$lang$Long$3x10$array$DistArray_BlockBlock_2$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.array.DistArray_BlockBlock_2<$T> x10$array$DistArray_BlockBlock_2$$init$S(final long m, final long n, final x10.core.fun.Fun_0_2<x10.core.Long,x10.core.Long,$T> init, __2$1x10$lang$Long$3x10$lang$Long$3x10$array$DistArray_BlockBlock_2$$T$2 $dummy) {
         {
            
            //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final x10.lang.PlaceGroup.SimplePlaceGroup t$76775 = ((x10.lang.PlaceGroup.SimplePlaceGroup)(x10.lang.PlaceGroup.get$WORLD()));
            
            //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            /*this.*/x10$array$DistArray_BlockBlock_2$$init$S(((long)(m)), ((long)(n)), ((x10.lang.PlaceGroup)(t$76775)), ((x10.core.fun.Fun_0_2)(init)), (x10.array.DistArray_BlockBlock_2.__3$1x10$lang$Long$3x10$lang$Long$3x10$array$DistArray_BlockBlock_2$$T$2) null);
        }
        return this;
    }
    
    
    
    //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    // creation method for java code (1-phase java constructor)
    public DistArray_BlockBlock_2(final x10.rtt.Type $T, final long m, final long n, final x10.lang.PlaceGroup pg) {
        this((java.lang.System[]) null, $T);
        x10$array$DistArray_BlockBlock_2$$init$S(m, n, pg);
    }
    
    // constructor for non-virtual call
    final public x10.array.DistArray_BlockBlock_2<$T> x10$array$DistArray_BlockBlock_2$$init$S(final long m, final long n, final x10.lang.PlaceGroup pg) {
         {
            
            //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final x10.core.fun.Fun_0_2 t$76777 = ((x10.core.fun.Fun_0_2)(new x10.array.DistArray_BlockBlock_2.$Closure$4<$T>($T)));
            
            //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            /*this.*/x10$array$DistArray_BlockBlock_2$$init$S(((long)(m)), ((long)(n)), ((x10.lang.PlaceGroup)(pg)), ((x10.core.fun.Fun_0_2)(t$76777)), (x10.array.DistArray_BlockBlock_2.__3$1x10$lang$Long$3x10$lang$Long$3x10$array$DistArray_BlockBlock_2$$T$2) null);
        }
        return this;
    }
    
    
    
    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    // creation method for java code (1-phase java constructor)
    public DistArray_BlockBlock_2(final x10.rtt.Type $T, final long m, final long n) {
        this((java.lang.System[]) null, $T);
        x10$array$DistArray_BlockBlock_2$$init$S(m, n);
    }
    
    // constructor for non-virtual call
    final public x10.array.DistArray_BlockBlock_2<$T> x10$array$DistArray_BlockBlock_2$$init$S(final long m, final long n) {
         {
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final x10.lang.PlaceGroup.SimplePlaceGroup t$76779 = ((x10.lang.PlaceGroup.SimplePlaceGroup)(x10.lang.PlaceGroup.get$WORLD()));
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final x10.core.fun.Fun_0_2 t$76780 = ((x10.core.fun.Fun_0_2)(new x10.array.DistArray_BlockBlock_2.$Closure$5<$T>($T)));
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            /*this.*/x10$array$DistArray_BlockBlock_2$$init$S(((long)(m)), ((long)(n)), ((x10.lang.PlaceGroup)(t$76779)), ((x10.core.fun.Fun_0_2)(t$76780)), (x10.array.DistArray_BlockBlock_2.__3$1x10$lang$Long$3x10$lang$Long$3x10$array$DistArray_BlockBlock_2$$T$2) null);
        }
        return this;
    }
    
    
    
    //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    final public x10.array.DenseIterationSpace_2 globalIndices() {
        
        //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final x10.array.DenseIterationSpace_2 t$76781 = ((x10.array.DenseIterationSpace_2)(globalIndices));
        
        //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        return t$76781;
    }
    
    
    //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    final public x10.array.DenseIterationSpace_2 localIndices() {
        
        //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final x10.array.DenseIterationSpace_2 t$76782 = ((x10.array.DenseIterationSpace_2)(localIndices));
        
        //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        return t$76782;
    }
    
    
    //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    final public x10.lang.Place place(final long i, final long j) {
        
        //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final x10.array.DenseIterationSpace_2 t$76783 = ((x10.array.DenseIterationSpace_2)(globalIndices));
        
        //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final x10.lang.PlaceGroup this$76683 = ((x10.lang.PlaceGroup)(placeGroup));
        
        //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceGroup.x10"
        final long t$76784 = this$76683.numPlaces$O();
        
        //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long tmp = x10.array.BlockingUtils.mapIndexToBlockBlockPartition$O(((x10.array.IterationSpace)(t$76783)), (long)(t$76784), (long)(i), (long)(j));
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final boolean t$76786 = ((long) tmp) == ((long) -1L);
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        x10.lang.Place t$76787 =  null;
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        if (t$76786) {
            
            //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            t$76787 = x10.lang.Place.get$INVALID_PLACE();
        } else {
            
            //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final x10.lang.PlaceGroup t$76785 = ((x10.lang.PlaceGroup)(placeGroup));
            
            //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            t$76787 = t$76785.$apply((long)(tmp));
        }
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final x10.lang.Place t$76788 = t$76787;
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        return t$76788;
    }
    
    
    //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    final public x10.lang.Place place(final x10.lang.Point p) {
        
        //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76789 = p.$apply$O((long)(0L));
        
        //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76790 = p.$apply$O((long)(1L));
        
        //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final x10.lang.Place t$76791 = this.place((long)(t$76789), (long)(t$76790));
        
        //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        return t$76791;
    }
    
    
    //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    final public $T $apply$G(final long i, final long j) {
        
        //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.Rail r$76687 = ((x10.core.Rail)(raw));
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final x10.array.DistArray_BlockBlock_2 this$76686 = ((x10.array.DistArray_BlockBlock_2)(this));
        
        //#line 234 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long i$76684 = i;
        
        //#line 234 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long j$76685 = j;
        
        //#line 235 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76792 = ((x10.array.DistArray_BlockBlock_2<$T>)this$76686).minIndex_2;
        
        //#line 235 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76796 = ((j$76685) - (((long)(t$76792))));
        
        //#line 235 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76793 = ((x10.array.DistArray_BlockBlock_2<$T>)this$76686).minIndex_1;
        
        //#line 235 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76794 = ((i$76684) - (((long)(t$76793))));
        
        //#line 235 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76795 = ((x10.array.DistArray_BlockBlock_2<$T>)this$76686).numElemsLocal_2;
        
        //#line 235 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76797 = ((t$76794) * (((long)(t$76795))));
        
        //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final long i$76688 = ((t$76796) + (((long)(t$76797))));
        
        //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final $T t$76798 = (($T)(((x10.core.Rail<$T>)r$76687).$apply$G((long)(i$76688))));
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        return t$76798;
    }
    
    
    //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    final public $T $apply$G(final x10.lang.Point p) {
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final x10.array.DistArray_BlockBlock_2 this$76691 = ((x10.array.DistArray_BlockBlock_2)(this));
        
        //#line 172 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long i$76689 = p.$apply$O((long)(0L));
        
        //#line 172 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long j$76690 = p.$apply$O((long)(1L));
        
        //#line 172 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        $T ret$76692 =  null;
        
        //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.Rail r$76866 = ((x10.core.Rail)(((x10.array.DistArray<$T>)this$76691).raw));
        
        //#line 234 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long i$76867 = i$76689;
        
        //#line 234 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long j$76868 = j$76690;
        
        //#line 235 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76869 = ((x10.array.DistArray_BlockBlock_2<$T>)this$76691).minIndex_2;
        
        //#line 235 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76870 = ((j$76868) - (((long)(t$76869))));
        
        //#line 235 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76871 = ((x10.array.DistArray_BlockBlock_2<$T>)this$76691).minIndex_1;
        
        //#line 235 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76872 = ((i$76867) - (((long)(t$76871))));
        
        //#line 235 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76873 = ((x10.array.DistArray_BlockBlock_2<$T>)this$76691).numElemsLocal_2;
        
        //#line 235 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76874 = ((t$76872) * (((long)(t$76873))));
        
        //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final long i$76875 = ((t$76870) + (((long)(t$76874))));
        
        //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final $T t$76876 = (($T)(((x10.core.Rail<$T>)r$76866).$apply$G((long)(i$76875))));
        
        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        ret$76692 = (($T)(t$76876));
        
        //#line 172 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final $T t$76806 = (($T)(ret$76692));
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        return t$76806;
    }
    
    
    //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    final public $T $set__2x10$array$DistArray_BlockBlock_2$$T$G(final long i, final long j, final $T v) {
        
        //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.Rail r$76701 = ((x10.core.Rail)(raw));
        
        //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final x10.array.DistArray_BlockBlock_2 this$76700 = ((x10.array.DistArray_BlockBlock_2)(this));
        
        //#line 234 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long i$76698 = i;
        
        //#line 234 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long j$76699 = j;
        
        //#line 235 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76807 = ((x10.array.DistArray_BlockBlock_2<$T>)this$76700).minIndex_2;
        
        //#line 235 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76811 = ((j$76699) - (((long)(t$76807))));
        
        //#line 235 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76808 = ((x10.array.DistArray_BlockBlock_2<$T>)this$76700).minIndex_1;
        
        //#line 235 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76809 = ((i$76698) - (((long)(t$76808))));
        
        //#line 235 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76810 = ((x10.array.DistArray_BlockBlock_2<$T>)this$76700).numElemsLocal_2;
        
        //#line 235 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76812 = ((t$76809) * (((long)(t$76810))));
        
        //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final long i$76702 = ((t$76811) + (((long)(t$76812))));
        
        //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final $T v$76703 = (($T)(v));
        
        //#line 40 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        $T ret$76704 =  null;
        
        //#line 42 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        ((x10.core.Rail<$T>)r$76701).$set__1x10$lang$Rail$$T$G((long)(i$76702), (($T)(v$76703)));
        
        //#line 43 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        ret$76704 = (($T)(v$76703));
        
        //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        return v;
    }
    
    
    //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    final public $T $set__1x10$array$DistArray_BlockBlock_2$$T$G(final x10.lang.Point p, final $T v) {
        
        //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final x10.array.DistArray_BlockBlock_2 this$76709 = ((x10.array.DistArray_BlockBlock_2)(this));
        
        //#line 198 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long i$76706 = p.$apply$O((long)(0L));
        
        //#line 198 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long j$76707 = p.$apply$O((long)(1L));
        
        //#line 198 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final $T v$76708 = (($T)(v));
        
        //#line 198 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        $T ret$76710 =  null;
        
        //#line 41 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.Rail r$76877 = ((x10.core.Rail)(((x10.array.DistArray<$T>)this$76709).raw));
        
        //#line 234 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long i$76878 = i$76706;
        
        //#line 234 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long j$76879 = j$76707;
        
        //#line 235 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76880 = ((x10.array.DistArray_BlockBlock_2<$T>)this$76709).minIndex_2;
        
        //#line 235 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76881 = ((j$76879) - (((long)(t$76880))));
        
        //#line 235 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76882 = ((x10.array.DistArray_BlockBlock_2<$T>)this$76709).minIndex_1;
        
        //#line 235 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76883 = ((i$76878) - (((long)(t$76882))));
        
        //#line 235 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76884 = ((x10.array.DistArray_BlockBlock_2<$T>)this$76709).numElemsLocal_2;
        
        //#line 235 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76885 = ((t$76883) * (((long)(t$76884))));
        
        //#line 41 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final long i$76886 = ((t$76881) + (((long)(t$76885))));
        
        //#line 41 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final $T v$76887 = (($T)(v$76708));
        
        //#line 40 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        $T ret$76888 =  null;
        
        //#line 42 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        ((x10.core.Rail<$T>)r$76877).$set__1x10$lang$Rail$$T$G((long)(i$76886), (($T)(v$76887)));
        
        //#line 43 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        ret$76888 = (($T)(v$76887));
        
        //#line 201 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        ret$76710 = (($T)(v$76708));
        
        //#line 198 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final $T t$76819 = (($T)(ret$76710));
        
        //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        return t$76819;
    }
    
    
    //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    final public void validateIndex(final long i, final long j) {
        
    }
    
    
    //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    final public long offset$O(final long i, final long j) {
        
        //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76820 = minIndex_2;
        
        //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76824 = ((j) - (((long)(t$76820))));
        
        //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76821 = minIndex_1;
        
        //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76822 = ((i) - (((long)(t$76821))));
        
        //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76823 = numElemsLocal_2;
        
        //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76825 = ((t$76822) * (((long)(t$76823))));
        
        //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76826 = ((t$76824) + (((long)(t$76825))));
        
        //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        return t$76826;
    }
    
    
    //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    private static long validateSize$O(final long m, final long n) {
        
        //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        boolean t$76827 = ((m) < (((long)(0L))));
        
        //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        if (!(t$76827)) {
            
            //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            t$76827 = ((n) < (((long)(0L))));
        }
        
        //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final boolean t$76828 = t$76827;
        
        //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        if (t$76828) {
            
            //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            x10.array.DistArray.raiseNegativeArraySizeException();
        }
        
        //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        final long t$76829 = ((m) * (((long)(n))));
        
        //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        return t$76829;
    }
    
    public static long validateSize$P$O(final long m, final long n) {
        return x10.array.DistArray_BlockBlock_2.validateSize$O((long)(m), (long)(n));
    }
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    final public x10.array.DistArray_BlockBlock_2 x10$array$DistArray_BlockBlock_2$$this$x10$array$DistArray_BlockBlock_2() {
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        return x10.array.DistArray_BlockBlock_2.this;
    }
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    final public void __fieldInitializers_x10_array_DistArray_BlockBlock_2() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$3<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$3> $RTT = 
            x10.rtt.StaticFunType.<$Closure$3> make($Closure$3.class,
                                                    1,
                                                    new x10.rtt.Type[] {
                                                        x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.ParameterizedType.make(x10.array.LocalState_BB2.$RTT, x10.rtt.UnresolvedType.PARAM(0)))
                                                    });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.DistArray_BlockBlock_2.$Closure$3<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.pg = $deserializer.readObject();
            $_obj.m = $deserializer.readLong();
            $_obj.n = $deserializer.readLong();
            $_obj.init = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.array.DistArray_BlockBlock_2.$Closure$3 $_obj = new x10.array.DistArray_BlockBlock_2.$Closure$3((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.pg);
            $serializer.write(this.m);
            $serializer.write(this.n);
            $serializer.write(this.init);
            
        }
        
        // constructor just for allocation
        public $Closure$3(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.array.DistArray_BlockBlock_2.$Closure$3.$initParams(this, $T);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.array.LocalState_BB2 $apply$G() {
            return $apply();
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$3 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __3$1x10$lang$Long$3x10$lang$Long$3x10$array$DistArray_BlockBlock_2$$Closure$3$$T$2 {}
        
    
        
        public x10.array.LocalState_BB2 $apply() {
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final x10.array.LocalState_BB2 t$76858 = x10.array.LocalState_BB2.<$T> make__3$1x10$lang$Long$3x10$lang$Long$3x10$array$LocalState_BB2$$S$2($T, ((x10.lang.PlaceGroup)(this.pg)), (long)(this.m), (long)(this.n), ((x10.core.fun.Fun_0_2)(this.init)));
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            return t$76858;
        }
        
        public x10.lang.PlaceGroup pg;
        public long m;
        public long n;
        public x10.core.fun.Fun_0_2<x10.core.Long,x10.core.Long,$T> init;
        
        public $Closure$3(final x10.rtt.Type $T, final x10.lang.PlaceGroup pg, final long m, final long n, final x10.core.fun.Fun_0_2<x10.core.Long,x10.core.Long,$T> init, __3$1x10$lang$Long$3x10$lang$Long$3x10$array$DistArray_BlockBlock_2$$Closure$3$$T$2 $dummy) {
            x10.array.DistArray_BlockBlock_2.$Closure$3.$initParams(this, $T);
             {
                ((x10.array.DistArray_BlockBlock_2.$Closure$3<$T>)this).pg = ((x10.lang.PlaceGroup)(pg));
                ((x10.array.DistArray_BlockBlock_2.$Closure$3<$T>)this).m = m;
                ((x10.array.DistArray_BlockBlock_2.$Closure$3<$T>)this).n = n;
                ((x10.array.DistArray_BlockBlock_2.$Closure$3<$T>)this).init = ((x10.core.fun.Fun_0_2)(init));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$4<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_2, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$4> $RTT = 
            x10.rtt.StaticFunType.<$Closure$4> make($Closure$4.class,
                                                    1,
                                                    new x10.rtt.Type[] {
                                                        x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_2.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG, x10.rtt.UnresolvedType.PARAM(0))
                                                    });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.DistArray_BlockBlock_2.$Closure$4<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.array.DistArray_BlockBlock_2.$Closure$4 $_obj = new x10.array.DistArray_BlockBlock_2.$Closure$4((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            
        }
        
        // constructor just for allocation
        public $Closure$4(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.array.DistArray_BlockBlock_2.$Closure$4.$initParams(this, $T);
            
        }
        
        // dispatcher for method abstract public (Z1,Z2)=>U.operator()(a1:Z1, a2:Z2):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return $apply$G(x10.core.Long.$unbox(a1), x10.core.Long.$unbox(a2));
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$4 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        
    
        
        public $T $apply$G(final long id$35, final long id$36) {
            
            //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final $T t$76776 = (($T)(($T) x10.rtt.Types.zeroValue($T)));
            
            //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            return t$76776;
        }
        
        public $Closure$4(final x10.rtt.Type $T) {
            x10.array.DistArray_BlockBlock_2.$Closure$4.$initParams(this, $T);
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$5<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_2, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$5> $RTT = 
            x10.rtt.StaticFunType.<$Closure$5> make($Closure$5.class,
                                                    1,
                                                    new x10.rtt.Type[] {
                                                        x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_2.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG, x10.rtt.UnresolvedType.PARAM(0))
                                                    });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.DistArray_BlockBlock_2.$Closure$5<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.array.DistArray_BlockBlock_2.$Closure$5 $_obj = new x10.array.DistArray_BlockBlock_2.$Closure$5((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            
        }
        
        // constructor just for allocation
        public $Closure$5(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.array.DistArray_BlockBlock_2.$Closure$5.$initParams(this, $T);
            
        }
        
        // dispatcher for method abstract public (Z1,Z2)=>U.operator()(a1:Z1, a2:Z2):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return $apply$G(x10.core.Long.$unbox(a1), x10.core.Long.$unbox(a2));
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$5 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        
    
        
        public $T $apply$G(final long id$37, final long id$38) {
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            final $T t$76778 = (($T)(($T) x10.rtt.Types.zeroValue($T)));
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
            return t$76778;
        }
        
        public $Closure$5(final x10.rtt.Type $T) {
            x10.array.DistArray_BlockBlock_2.$Closure$5.$initParams(this, $T);
             {
                
            }
        }
        
    }
    
}


