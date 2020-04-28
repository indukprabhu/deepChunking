package x10.array;


@x10.runtime.impl.java.X10Generated
final public class Array_2<$T> extends x10.array.Array<$T> implements x10.core.fun.Fun_0_2, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Array_2> $RTT = 
        x10.rtt.NamedType.<Array_2> make("x10.array.Array_2",
                                         Array_2.class,
                                         1,
                                         new x10.rtt.Type[] {
                                             x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_2.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG, x10.rtt.UnresolvedType.PARAM(0)),
                                             x10.rtt.ParameterizedType.make(x10.array.Array.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                         });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.Array_2<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.array.Array.$_deserialize_body($_obj, $deserializer);
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.numElems_1 = $deserializer.readLong();
        $_obj.numElems_2 = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.array.Array_2 $_obj = new x10.array.Array_2((java.lang.System[]) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.$T);
        $serializer.write(this.numElems_1);
        $serializer.write(this.numElems_2);
        
    }
    
    // constructor just for allocation
    public Array_2(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        super($dummy, $T);
        x10.array.Array_2.$initParams(this, $T);
        
    }
    
    // dispatcher for method abstract public (Z1,Z2)=>U.operator()(a1:Z1, a2:Z2){}:U
    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
        return $apply$G(x10.core.Long.$unbox(a1), x10.core.Long.$unbox(a2));
        
    }
    
    // bridge for method abstract public x10.array.Array[T].operator()=(p:x10.lang.Point{self.rank==this(:x10.array.Array).rank()}, v:T){}:T{self==v}
    public $T $set__1x10$array$Array$$T$G(x10.lang.Point a1, $T a2) {
        return $set__1x10$array$Array_2$$T$G(a1, a2);
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final Array_2 $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    // synthetic type for parameter mangling
    public static final class __2x10$array$Array_2$$T {}
    // synthetic type for parameter mangling
    public static final class __2$1x10$lang$Long$3x10$lang$Long$3x10$array$Array_2$$T$2 {}
    // synthetic type for parameter mangling
    public static final class __0$1x10$array$Array_2$$T$2 {}
    
    // properties
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    public long numElems_1;
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    public long numElems_2;
    

    
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    final public long rank$O() {
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        return 2L;
    }
    
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    // creation method for java code (1-phase java constructor)
    public Array_2(final x10.rtt.Type $T, final long m, final long n) {
        this((java.lang.System[]) null, $T);
        x10$array$Array_2$$init$S(m, n);
    }
    
    // constructor for non-virtual call
    final public x10.array.Array_2<$T> x10$array$Array_2$$init$S(final long m, final long n) {
         {
            
            //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final long m$72415 = m;
            
            //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final long n$72416 = n;
            
            //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            long ret$72417 =  0;
            
            //#line 190 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            boolean t$72412 = ((m$72415) < (((long)(0L))));
            
            //#line 190 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            if (!(t$72412)) {
                
                //#line 190 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                t$72412 = ((n$72416) < (((long)(0L))));
            }
            
            //#line 190 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final boolean t$72413 = t$72412;
            
            //#line 190 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            if (t$72413) {
                
                //#line 190 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                x10.array.Array.raiseNegativeArraySizeException();
            }
            
            //#line 191 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final long t$72414 = ((m$72415) * (((long)(n$72416))));
            
            //#line 191 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            ret$72417 = t$72414;
            
            //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final long t$72418 = ret$72417;
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            /*super.*/x10$array$Array$$init$S(t$72418, ((boolean)(true)));
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            this.numElems_1 = m;
            this.numElems_2 = n;
            
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final x10.array.Array_2 this$72419 = this;
        }
        return this;
    }
    
    
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    // creation method for java code (1-phase java constructor)
    public Array_2(final x10.rtt.Type $T, final long m, final long n, final $T init, __2x10$array$Array_2$$T $dummy) {
        this((java.lang.System[]) null, $T);
        x10$array$Array_2$$init$S(m, n, init, (x10.array.Array_2.__2x10$array$Array_2$$T) null);
    }
    
    // constructor for non-virtual call
    final public x10.array.Array_2<$T> x10$array$Array_2$$init$S(final long m, final long n, final $T init, __2x10$array$Array_2$$T $dummy) {
         {
            
            //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final long m$72423 = m;
            
            //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final long n$72424 = n;
            
            //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            long ret$72425 =  0;
            
            //#line 190 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            boolean t$72420 = ((m$72423) < (((long)(0L))));
            
            //#line 190 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            if (!(t$72420)) {
                
                //#line 190 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                t$72420 = ((n$72424) < (((long)(0L))));
            }
            
            //#line 190 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final boolean t$72421 = t$72420;
            
            //#line 190 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            if (t$72421) {
                
                //#line 190 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                x10.array.Array.raiseNegativeArraySizeException();
            }
            
            //#line 191 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final long t$72422 = ((m$72423) * (((long)(n$72424))));
            
            //#line 191 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            ret$72425 = t$72422;
            
            //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final long t$72426 = ret$72425;
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            /*super.*/x10$array$Array$$init$S(t$72426, ((boolean)(false)));
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            this.numElems_1 = m;
            this.numElems_2 = n;
            
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final x10.array.Array_2 this$72427 = this;
            
            //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final x10.core.Rail t$72328 = ((x10.core.Rail)(raw));
            
            //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            ((x10.core.Rail<$T>)t$72328).fill__0x10$lang$Rail$$T((($T)(init)));
        }
        return this;
    }
    
    
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    // creation method for java code (1-phase java constructor)
    public Array_2(final x10.rtt.Type $T, final long m, final long n, final x10.core.fun.Fun_0_2<x10.core.Long,x10.core.Long,$T> init, __2$1x10$lang$Long$3x10$lang$Long$3x10$array$Array_2$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$array$Array_2$$init$S(m, n, init, (x10.array.Array_2.__2$1x10$lang$Long$3x10$lang$Long$3x10$array$Array_2$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.array.Array_2<$T> x10$array$Array_2$$init$S(final long m, final long n, final x10.core.fun.Fun_0_2<x10.core.Long,x10.core.Long,$T> init, __2$1x10$lang$Long$3x10$lang$Long$3x10$array$Array_2$$T$2 $dummy) {
         {
            
            //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final long m$72452 = m;
            
            //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final long n$72453 = n;
            
            //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            long ret$72454 =  0;
            
            //#line 190 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            boolean t$72428 = ((m$72452) < (((long)(0L))));
            
            //#line 190 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            if (!(t$72428)) {
                
                //#line 190 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                t$72428 = ((n$72453) < (((long)(0L))));
            }
            
            //#line 190 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final boolean t$72429 = t$72428;
            
            //#line 190 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            if (t$72429) {
                
                //#line 190 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                x10.array.Array.raiseNegativeArraySizeException();
            }
            
            //#line 191 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final long t$72430 = ((m$72452) * (((long)(n$72453))));
            
            //#line 191 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            ret$72454 = t$72430;
            
            //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final long t$72455 = ret$72454;
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            /*super.*/x10$array$Array$$init$S(t$72455, ((boolean)(false)));
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            this.numElems_1 = m;
            this.numElems_2 = n;
            
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final x10.array.Array_2 this$72456 = this;
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final long i$72068max$72457 = ((m) - (((long)(1L))));
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            long i$72449 = 0L;
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            for (;
                 true;
                 ) {
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                final long t$72450 = i$72449;
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                final boolean t$72451 = ((t$72450) <= (((long)(i$72068max$72457))));
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                if (!(t$72451)) {
                    
                    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                    break;
                }
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                final long i$72446 = i$72449;
                
                //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                final long i$72050max$72445 = ((n) - (((long)(1L))));
                
                //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                long i$72442 = 0L;
                
                //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                    final long t$72443 = i$72442;
                    
                    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                    final boolean t$72444 = ((t$72443) <= (((long)(i$72050max$72445))));
                    
                    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                    if (!(t$72444)) {
                        
                        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                        break;
                    }
                    
                    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                    final long j$72439 = i$72442;
                    
                    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                    final x10.core.Rail t$72431 = ((x10.core.Rail)(raw));
                    
                    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                    final x10.array.Array_2 this$72432 = ((x10.array.Array_2)(this));
                    
                    //#line 130 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                    final long i$72433 = i$72446;
                    
                    //#line 130 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                    final long j$72434 = j$72439;
                    
                    //#line 131 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                    final long t$72435 = ((x10.array.Array_2<$T>)this$72432).numElems_2;
                    
                    //#line 131 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                    final long t$72436 = ((i$72433) * (((long)(t$72435))));
                    
                    //#line 131 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                    final long t$72437 = ((j$72434) + (((long)(t$72436))));
                    
                    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                    final $T t$72438 = (($T)((($T)
                                               ((x10.core.fun.Fun_0_2<x10.core.Long,x10.core.Long,$T>)init).$apply(x10.core.Long.$box(i$72446), x10.rtt.Types.LONG, x10.core.Long.$box(j$72439), x10.rtt.Types.LONG))));
                    
                    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                    ((x10.core.Rail<$T>)t$72431).$set__1x10$lang$Rail$$T$G((long)(t$72437), (($T)(t$72438)));
                    
                    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                    final long t$72440 = i$72442;
                    
                    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                    final long t$72441 = ((t$72440) + (((long)(1L))));
                    
                    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                    i$72442 = t$72441;
                }
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                final long t$72447 = i$72449;
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                final long t$72448 = ((t$72447) + (((long)(1L))));
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                i$72449 = t$72448;
            }
        }
        return this;
    }
    
    
    
    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    // creation method for java code (1-phase java constructor)
    public Array_2(final x10.rtt.Type $T, final x10.array.Array_2<$T> src, __0$1x10$array$Array_2$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$array$Array_2$$init$S(src, (x10.array.Array_2.__0$1x10$array$Array_2$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.array.Array_2<$T> x10$array$Array_2$$init$S(final x10.array.Array_2<$T> src, __0$1x10$array$Array_2$$T$2 $dummy) {
         {
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final x10.array.Array this$72146 = ((x10.array.Array)(this));
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final x10.core.Rail t$72348 = ((x10.core.Rail)(((x10.array.Array<$T>)src).raw));
            
            //#line 64 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            final x10.core.Rail r$72145 = ((x10.core.Rail)(new x10.core.Rail<$T>($T, ((x10.core.Rail)(t$72348)), (x10.core.Rail.__0$1x10$lang$Rail$$T$2) null)));
            
            //#line 65 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            final long t$72458 = ((x10.core.Rail<$T>)r$72145).size;
            
            //#line 65 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            ((x10.array.Array<$T>)this$72146).size = t$72458;
            {
                
            }
            
            //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            ((x10.array.Array<$T>)this$72146).raw = ((x10.core.Rail)(r$72145));
            
            //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final long t$72459 = ((x10.array.Array_2<$T>)src).numElems_1;
            
            //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final long t$72460 = ((x10.array.Array_2<$T>)src).numElems_2;
            
            //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            this.numElems_1 = t$72459;
            this.numElems_2 = t$72460;
            
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final x10.array.Array_2 this$72461 = this;
        }
        return this;
    }
    
    
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    // creation method for java code (1-phase java constructor)
    public Array_2(final x10.rtt.Type $T, final x10.core.Rail<$T> r, final long m, final long n, __0$1x10$array$Array_2$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$array$Array_2$$init$S(r, m, n, (x10.array.Array_2.__0$1x10$array$Array_2$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.array.Array_2<$T> x10$array$Array_2$$init$S(final x10.core.Rail<$T> r, final long m, final long n, __0$1x10$array$Array_2$$T$2 $dummy) {
         {
            
            //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final x10.array.Array this$72154 = ((x10.array.Array)(this));
            
            //#line 64 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            final x10.core.Rail r$72153 = ((x10.core.Rail)(r));
            
            //#line 65 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            final long t$72462 = ((x10.core.Rail<$T>)r$72153).size;
            
            //#line 65 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            ((x10.array.Array<$T>)this$72154).size = t$72462;
            {
                
            }
            
            //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            ((x10.array.Array<$T>)this$72154).raw = ((x10.core.Rail)(r$72153));
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            this.numElems_1 = m;
            this.numElems_2 = n;
            
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final x10.array.Array_2 this$72463 = this;
        }
        return this;
    }
    
    
    
    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    public static <$T>x10.array.Array_2 makeView__0$1x10$array$Array_2$$T$2(final x10.rtt.Type $T, final x10.core.Rail<$T> r, final long m, final long n) {
        
        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long size = ((m) * (((long)(n))));
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long t$72353 = ((x10.core.Rail<$T>)r).size;
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final boolean t$72361 = ((long) size) != ((long) t$72353);
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        if (t$72361) {
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final java.lang.String t$72354 = (("size mismatch: ") + ((x10.core.Long.$box(m))));
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final java.lang.String t$72355 = ((t$72354) + (" * "));
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final java.lang.String t$72356 = ((t$72355) + ((x10.core.Long.$box(n))));
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final java.lang.String t$72357 = ((t$72356) + (" != "));
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final long t$72358 = ((x10.core.Rail<$T>)r).size;
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final java.lang.String t$72359 = ((t$72357) + ((x10.core.Long.$box(t$72358))));
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final x10.lang.IllegalOperationException t$72360 = ((x10.lang.IllegalOperationException)(new x10.lang.IllegalOperationException(t$72359)));
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            throw t$72360;
        }
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final x10.array.Array_2 alloc$72047 = ((x10.array.Array_2)(new x10.array.Array_2<$T>((java.lang.System[]) null, $T)));
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        alloc$72047.x10$array$Array_2$$init$S(((x10.core.Rail)(r)), ((long)(m)), ((long)(n)), (x10.array.Array_2.__0$1x10$array$Array_2$$T$2) null);
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        return alloc$72047;
    }
    
    
    //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    public java.lang.String toString() {
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final x10.util.StringBuilder sb = ((x10.util.StringBuilder)(new x10.util.StringBuilder((java.lang.System[]) null)));
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        sb.x10$util$StringBuilder$$init$S();
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        sb.add(((java.lang.String)("[")));
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        long printed = 0L;
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long t$72496 = numElems_1;
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long i$72104max$72497 = ((t$72496) - (((long)(1L))));
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        long i$72492 = 0L;
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        outer$72493: 
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        for (;
             true;
             ) {
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final long t$72494 = i$72492;
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final boolean t$72495 = ((t$72494) <= (((long)(i$72104max$72497))));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            if (!(t$72495)) {
                
                //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                break;
            }
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final long i$72489 = i$72492;
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final long t$72487 = numElems_2;
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final long i$72086max$72488 = ((t$72487) - (((long)(1L))));
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            long i$72484 = 0L;
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            for (;
                 true;
                 ) {
                
                //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                final long t$72485 = i$72484;
                
                //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                final boolean t$72486 = ((t$72485) <= (((long)(i$72086max$72488))));
                
                //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                if (!(t$72486)) {
                    
                    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                    break;
                }
                
                //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                final long j$72481 = i$72484;
                
                //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                final boolean t$72471 = ((long) j$72481) != ((long) 0L);
                
                //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                if (t$72471) {
                    
                    //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                    sb.add(((java.lang.String)(", ")));
                }
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                final x10.array.Array_2 this$72472 = ((x10.array.Array_2)(this));
                
                //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                final long i$72473 = i$72489;
                
                //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                final long j$72474 = j$72481;
                
                //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                $T ret$72475 =  null;
                
                //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
                final x10.core.Rail r$72464 = ((x10.core.Rail)(((x10.array.Array<$T>)this$72472).raw));
                
                //#line 130 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                final long i$72465 = i$72473;
                
                //#line 130 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                final long j$72466 = j$72474;
                
                //#line 131 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                final long t$72467 = ((x10.array.Array_2<$T>)this$72472).numElems_2;
                
                //#line 131 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                final long t$72468 = ((i$72465) * (((long)(t$72467))));
                
                //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
                final long i$72469 = ((j$72466) + (((long)(t$72468))));
                
                //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
                final $T t$72470 = (($T)(((x10.core.Rail<$T>)r$72464).$apply$G((long)(i$72469))));
                
                //#line 147 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                ret$72475 = (($T)(t$72470));
                
                //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                final $T t$72476 = (($T)(ret$72475));
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                sb.add(((java.lang.Object)(t$72476)));
                
                //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                final long t$72477 = printed;
                
                //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                final long t$72478 = ((t$72477) + (((long)(1L))));
                
                //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                final long t$72479 = printed = t$72478;
                
                //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                final boolean t$72480 = ((t$72479) > (((long)(10L))));
                
                //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                if (t$72480) {
                    
                    //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                    break outer$72493;
                }
                
                //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                final long t$72482 = i$72484;
                
                //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                final long t$72483 = ((t$72482) + (((long)(1L))));
                
                //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                i$72484 = t$72483;
            }
            
            //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            sb.add(((java.lang.String)("; ")));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final long t$72490 = i$72492;
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final long t$72491 = ((t$72490) + (((long)(1L))));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            i$72492 = t$72491;
        }
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long t$72383 = size;
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final boolean t$72388 = ((10L) < (((long)(t$72383))));
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        if (t$72388) {
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final long t$72384 = size;
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final long t$72385 = ((t$72384) - (((long)(10L))));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final java.lang.String t$72386 = (("...(omitted ") + ((x10.core.Long.$box(t$72385))));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            final java.lang.String t$72387 = ((t$72386) + (" elements)"));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            sb.add(((java.lang.String)(t$72387)));
        }
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        sb.add(((java.lang.String)("]")));
        
        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final java.lang.String t$72389 = sb.toString();
        
        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        return t$72389;
    }
    
    
    //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    public x10.array.DenseIterationSpace_2 indices() {
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final x10.array.DenseIterationSpace_2 alloc$72048 = ((x10.array.DenseIterationSpace_2)(new x10.array.DenseIterationSpace_2((java.lang.System[]) null)));
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long t$72498 = numElems_1;
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long t$72499 = ((t$72498) - (((long)(1L))));
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long t$72500 = numElems_2;
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long t$72501 = ((t$72500) - (((long)(1L))));
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        alloc$72048.x10$array$DenseIterationSpace_2$$init$S(((long)(0L)), ((long)(0L)), t$72499, t$72501);
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        return alloc$72048;
    }
    
    
    //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    public long offset$O(final long i, final long j) {
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long t$72394 = numElems_2;
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long t$72395 = ((i) * (((long)(t$72394))));
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long t$72396 = ((j) + (((long)(t$72395))));
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        return t$72396;
    }
    
    
    //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    public $T $apply$G(final long i, final long j) {
        
        //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.Rail r$72288 = ((x10.core.Rail)(raw));
        
        //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final x10.array.Array_2 this$72287 = ((x10.array.Array_2)(this));
        
        //#line 130 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long i$72285 = i;
        
        //#line 130 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long j$72286 = j;
        
        //#line 131 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long t$72397 = ((x10.array.Array_2<$T>)this$72287).numElems_2;
        
        //#line 131 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long t$72398 = ((i$72285) * (((long)(t$72397))));
        
        //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final long i$72289 = ((j$72286) + (((long)(t$72398))));
        
        //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final $T t$72399 = (($T)(((x10.core.Rail<$T>)r$72288).$apply$G((long)(i$72289))));
        
        //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        return t$72399;
    }
    
    
    //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    public $T $apply$G(final x10.lang.Point p) {
        
        //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final x10.array.Array_2 this$72292 = ((x10.array.Array_2)(this));
        
        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long i$72290 = p.$apply$O((long)(0L));
        
        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long j$72291 = p.$apply$O((long)(1L));
        
        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        $T ret$72293 =  null;
        
        //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.Rail r$72502 = ((x10.core.Rail)(((x10.array.Array<$T>)this$72292).raw));
        
        //#line 130 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long i$72503 = i$72290;
        
        //#line 130 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long j$72504 = j$72291;
        
        //#line 131 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long t$72505 = ((x10.array.Array_2<$T>)this$72292).numElems_2;
        
        //#line 131 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long t$72506 = ((i$72503) * (((long)(t$72505))));
        
        //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final long i$72507 = ((j$72504) + (((long)(t$72506))));
        
        //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final $T t$72508 = (($T)(((x10.core.Rail<$T>)r$72502).$apply$G((long)(i$72507))));
        
        //#line 147 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        ret$72293 = (($T)(t$72508));
        
        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final $T t$72403 = (($T)(ret$72293));
        
        //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        return t$72403;
    }
    
    
    //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    public $T $set__2x10$array$Array_2$$T$G(final long i, final long j, final $T v) {
        
        //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.Rail r$72302 = ((x10.core.Rail)(raw));
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final x10.array.Array_2 this$72301 = ((x10.array.Array_2)(this));
        
        //#line 130 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long i$72299 = i;
        
        //#line 130 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long j$72300 = j;
        
        //#line 131 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long t$72404 = ((x10.array.Array_2<$T>)this$72301).numElems_2;
        
        //#line 131 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long t$72405 = ((i$72299) * (((long)(t$72404))));
        
        //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final long i$72303 = ((j$72300) + (((long)(t$72405))));
        
        //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final $T v$72304 = (($T)(v));
        
        //#line 40 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        $T ret$72305 =  null;
        
        //#line 42 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        ((x10.core.Rail<$T>)r$72302).$set__1x10$lang$Rail$$T$G((long)(i$72303), (($T)(v$72304)));
        
        //#line 43 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        ret$72305 = (($T)(v$72304));
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        return v;
    }
    
    
    //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    public $T $set__1x10$array$Array_2$$T$G(final x10.lang.Point p, final $T v) {
        
        //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final x10.array.Array_2 this$72310 = ((x10.array.Array_2)(this));
        
        //#line 169 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long i$72307 = p.$apply$O((long)(0L));
        
        //#line 169 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long j$72308 = p.$apply$O((long)(1L));
        
        //#line 169 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final $T v$72309 = (($T)(v));
        
        //#line 169 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        $T ret$72311 =  null;
        
        //#line 41 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.Rail r$72509 = ((x10.core.Rail)(((x10.array.Array<$T>)this$72310).raw));
        
        //#line 130 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long i$72510 = i$72307;
        
        //#line 130 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long j$72511 = j$72308;
        
        //#line 131 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long t$72512 = ((x10.array.Array_2<$T>)this$72310).numElems_2;
        
        //#line 131 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long t$72513 = ((i$72510) * (((long)(t$72512))));
        
        //#line 41 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final long i$72514 = ((j$72511) + (((long)(t$72513))));
        
        //#line 41 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final $T v$72515 = (($T)(v$72309));
        
        //#line 40 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        $T ret$72516 =  null;
        
        //#line 42 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        ((x10.core.Rail<$T>)r$72509).$set__1x10$lang$Rail$$T$G((long)(i$72514), (($T)(v$72515)));
        
        //#line 43 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        ret$72516 = (($T)(v$72515));
        
        //#line 175 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        ret$72311 = (($T)(v$72309));
        
        //#line 169 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final $T t$72408 = (($T)(ret$72311));
        
        //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        return t$72408;
    }
    
    
    //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    private static long validateSize$O(final long m, final long n) {
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        boolean t$72409 = ((m) < (((long)(0L))));
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        if (!(t$72409)) {
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            t$72409 = ((n) < (((long)(0L))));
        }
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final boolean t$72410 = t$72409;
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        if (t$72410) {
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            x10.array.Array.raiseNegativeArraySizeException();
        }
        
        //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        final long t$72411 = ((m) * (((long)(n))));
        
        //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        return t$72411;
    }
    
    public static long validateSize$P$O(final long m, final long n) {
        return x10.array.Array_2.validateSize$O((long)(m), (long)(n));
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    final public x10.array.Array_2 x10$array$Array_2$$this$x10$array$Array_2() {
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        return x10.array.Array_2.this;
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    final public void __fieldInitializers_x10_array_Array_2() {
        
    }
}

