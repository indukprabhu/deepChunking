package x10.array;


@x10.runtime.impl.java.X10Generated
final public class Array_3<$T> extends x10.array.Array<$T> implements x10.core.fun.Fun_0_3, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Array_3> $RTT = 
        x10.rtt.NamedType.<Array_3> make("x10.array.Array_3",
                                         Array_3.class,
                                         1,
                                         new x10.rtt.Type[] {
                                             x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_3.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG, x10.rtt.Types.LONG, x10.rtt.UnresolvedType.PARAM(0)),
                                             x10.rtt.ParameterizedType.make(x10.array.Array.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                         });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.Array_3<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.array.Array.$_deserialize_body($_obj, $deserializer);
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.numElems_1 = $deserializer.readLong();
        $_obj.numElems_2 = $deserializer.readLong();
        $_obj.numElems_3 = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.array.Array_3 $_obj = new x10.array.Array_3((java.lang.System[]) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.$T);
        $serializer.write(this.numElems_1);
        $serializer.write(this.numElems_2);
        $serializer.write(this.numElems_3);
        
    }
    
    // constructor just for allocation
    public Array_3(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        super($dummy, $T);
        x10.array.Array_3.$initParams(this, $T);
        
    }
    
    // dispatcher for method abstract public (Z1,Z2,Z3)=>U.operator()(a1:Z1, a2:Z2, a3:Z3){}:U
    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2, final java.lang.Object a3, final x10.rtt.Type t3) {
        return $apply$G(x10.core.Long.$unbox(a1), x10.core.Long.$unbox(a2), x10.core.Long.$unbox(a3));
        
    }
    
    // bridge for method abstract public x10.array.Array[T].operator()=(p:x10.lang.Point{self.rank==this(:x10.array.Array).rank()}, v:T){}:T{self==v}
    public $T $set__1x10$array$Array$$T$G(x10.lang.Point a1, $T a2) {
        return $set__1x10$array$Array_3$$T$G(a1, a2);
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final Array_3 $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    // synthetic type for parameter mangling
    public static final class __3x10$array$Array_3$$T {}
    // synthetic type for parameter mangling
    public static final class __3$1x10$lang$Long$3x10$lang$Long$3x10$lang$Long$3x10$array$Array_3$$T$2 {}
    // synthetic type for parameter mangling
    public static final class __0$1x10$array$Array_3$$T$2 {}
    
    // properties
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    public long numElems_1;
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    public long numElems_2;
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    public long numElems_3;
    

    
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    final public long rank$O() {
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        return 3L;
    }
    
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    // creation method for java code (1-phase java constructor)
    public Array_3(final x10.rtt.Type $T, final long m, final long n, final long p) {
        this((java.lang.System[]) null, $T);
        x10$array$Array_3$$init$S(m, n, p);
    }
    
    // constructor for non-virtual call
    final public x10.array.Array_3<$T> x10$array$Array_3$$init$S(final long m, final long n, final long p) {
         {
            
            //#line 205 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long m$73424 = m;
            
            //#line 205 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long n$73425 = n;
            
            //#line 205 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long p$73426 = p;
            
            //#line 205 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            long ret$73427 =  0;
            
            //#line 206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            boolean t$73419 = ((m$73424) < (((long)(0L))));
            
            //#line 206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            if (!(t$73419)) {
                
                //#line 206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                t$73419 = ((n$73425) < (((long)(0L))));
            }
            
            //#line 206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            boolean t$73420 = t$73419;
            
            //#line 206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            if (!(t$73420)) {
                
                //#line 206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                t$73420 = ((p$73426) < (((long)(0L))));
            }
            
            //#line 206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final boolean t$73421 = t$73420;
            
            //#line 206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            if (t$73421) {
                
                //#line 206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                x10.array.Array.raiseNegativeArraySizeException();
            }
            
            //#line 207 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long t$73422 = ((m$73424) * (((long)(n$73425))));
            
            //#line 207 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long t$73423 = ((t$73422) * (((long)(p$73426))));
            
            //#line 207 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            ret$73427 = t$73423;
            
            //#line 205 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long t$73428 = ret$73427;
            
            //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            /*super.*/x10$array$Array$$init$S(t$73428, ((boolean)(true)));
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            this.numElems_1 = m;
            this.numElems_2 = n;
            this.numElems_3 = p;
            
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final x10.array.Array_3 this$73429 = this;
        }
        return this;
    }
    
    
    
    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    // creation method for java code (1-phase java constructor)
    public Array_3(final x10.rtt.Type $T, final long m, final long n, final long p, final $T init, __3x10$array$Array_3$$T $dummy) {
        this((java.lang.System[]) null, $T);
        x10$array$Array_3$$init$S(m, n, p, init, (x10.array.Array_3.__3x10$array$Array_3$$T) null);
    }
    
    // constructor for non-virtual call
    final public x10.array.Array_3<$T> x10$array$Array_3$$init$S(final long m, final long n, final long p, final $T init, __3x10$array$Array_3$$T $dummy) {
         {
            
            //#line 205 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long m$73435 = m;
            
            //#line 205 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long n$73436 = n;
            
            //#line 205 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long p$73437 = p;
            
            //#line 205 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            long ret$73438 =  0;
            
            //#line 206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            boolean t$73430 = ((m$73435) < (((long)(0L))));
            
            //#line 206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            if (!(t$73430)) {
                
                //#line 206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                t$73430 = ((n$73436) < (((long)(0L))));
            }
            
            //#line 206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            boolean t$73431 = t$73430;
            
            //#line 206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            if (!(t$73431)) {
                
                //#line 206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                t$73431 = ((p$73437) < (((long)(0L))));
            }
            
            //#line 206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final boolean t$73432 = t$73431;
            
            //#line 206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            if (t$73432) {
                
                //#line 206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                x10.array.Array.raiseNegativeArraySizeException();
            }
            
            //#line 207 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long t$73433 = ((m$73435) * (((long)(n$73436))));
            
            //#line 207 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long t$73434 = ((t$73433) * (((long)(p$73437))));
            
            //#line 207 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            ret$73438 = t$73434;
            
            //#line 205 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long t$73439 = ret$73438;
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            /*super.*/x10$array$Array$$init$S(t$73439, ((boolean)(false)));
            
            //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            this.numElems_1 = m;
            this.numElems_2 = n;
            this.numElems_3 = p;
            
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final x10.array.Array_3 this$73440 = this;
            
            //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final x10.core.Rail t$73288 = ((x10.core.Rail)(raw));
            
            //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            ((x10.core.Rail<$T>)t$73288).fill__0x10$lang$Rail$$T((($T)(init)));
        }
        return this;
    }
    
    
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    // creation method for java code (1-phase java constructor)
    public Array_3(final x10.rtt.Type $T, final long m, final long n, final long p, final x10.core.fun.Fun_0_3<x10.core.Long,x10.core.Long,x10.core.Long,$T> init, __3$1x10$lang$Long$3x10$lang$Long$3x10$lang$Long$3x10$array$Array_3$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$array$Array_3$$init$S(m, n, p, init, (x10.array.Array_3.__3$1x10$lang$Long$3x10$lang$Long$3x10$lang$Long$3x10$array$Array_3$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.array.Array_3<$T> x10$array$Array_3$$init$S(final long m, final long n, final long p, final x10.core.fun.Fun_0_3<x10.core.Long,x10.core.Long,x10.core.Long,$T> init, __3$1x10$lang$Long$3x10$lang$Long$3x10$lang$Long$3x10$array$Array_3$$T$2 $dummy) {
         {
            
            //#line 205 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long m$73478 = m;
            
            //#line 205 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long n$73479 = n;
            
            //#line 205 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long p$73480 = p;
            
            //#line 205 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            long ret$73481 =  0;
            
            //#line 206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            boolean t$73441 = ((m$73478) < (((long)(0L))));
            
            //#line 206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            if (!(t$73441)) {
                
                //#line 206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                t$73441 = ((n$73479) < (((long)(0L))));
            }
            
            //#line 206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            boolean t$73442 = t$73441;
            
            //#line 206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            if (!(t$73442)) {
                
                //#line 206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                t$73442 = ((p$73480) < (((long)(0L))));
            }
            
            //#line 206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final boolean t$73443 = t$73442;
            
            //#line 206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            if (t$73443) {
                
                //#line 206 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                x10.array.Array.raiseNegativeArraySizeException();
            }
            
            //#line 207 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long t$73444 = ((m$73478) * (((long)(n$73479))));
            
            //#line 207 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long t$73445 = ((t$73444) * (((long)(p$73480))));
            
            //#line 207 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            ret$73481 = t$73445;
            
            //#line 205 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long t$73482 = ret$73481;
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            /*super.*/x10$array$Array$$init$S(t$73482, ((boolean)(false)));
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            this.numElems_1 = m;
            this.numElems_2 = n;
            this.numElems_3 = p;
            
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final x10.array.Array_3 this$73483 = this;
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long i$73016max$73484 = ((m) - (((long)(1L))));
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            long i$73475 = 0L;
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            for (;
                 true;
                 ) {
                
                //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                final long t$73476 = i$73475;
                
                //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                final boolean t$73477 = ((t$73476) <= (((long)(i$73016max$73484))));
                
                //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                if (!(t$73477)) {
                    
                    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    break;
                }
                
                //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                final long i$73472 = i$73475;
                
                //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                final long i$72998max$73471 = ((n) - (((long)(1L))));
                
                //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                long i$73468 = 0L;
                
                //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final long t$73469 = i$73468;
                    
                    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final boolean t$73470 = ((t$73469) <= (((long)(i$72998max$73471))));
                    
                    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    if (!(t$73470)) {
                        
                        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                        break;
                    }
                    
                    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final long j$73465 = i$73468;
                    
                    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final long i$72980max$73464 = ((p) - (((long)(1L))));
                    
                    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    long i$73461 = 0L;
                    
                    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                        final long t$73462 = i$73461;
                        
                        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                        final boolean t$73463 = ((t$73462) <= (((long)(i$72980max$73464))));
                        
                        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                        if (!(t$73463)) {
                            
                            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                            break;
                        }
                        
                        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                        final long k$73458 = i$73461;
                        
                        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                        final x10.core.Rail t$73446 = ((x10.core.Rail)(raw));
                        
                        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                        final x10.array.Array_3 this$73447 = ((x10.array.Array_3)(this));
                        
                        //#line 141 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                        final long i$73448 = i$73472;
                        
                        //#line 141 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                        final long j$73449 = j$73465;
                        
                        //#line 141 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                        final long k$73450 = k$73458;
                        
                        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                        final long t$73451 = ((x10.array.Array_3<$T>)this$73447).numElems_3;
                        
                        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                        final long t$73452 = ((x10.array.Array_3<$T>)this$73447).numElems_2;
                        
                        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                        final long t$73453 = ((i$73448) * (((long)(t$73452))));
                        
                        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                        final long t$73454 = ((j$73449) + (((long)(t$73453))));
                        
                        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                        final long t$73455 = ((t$73451) * (((long)(t$73454))));
                        
                        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                        final long t$73456 = ((k$73450) + (((long)(t$73455))));
                        
                        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                        final $T t$73457 = (($T)((($T)
                                                   ((x10.core.fun.Fun_0_3<x10.core.Long,x10.core.Long,x10.core.Long,$T>)init).$apply(x10.core.Long.$box(i$73472), x10.rtt.Types.LONG, x10.core.Long.$box(j$73465), x10.rtt.Types.LONG, x10.core.Long.$box(k$73458), x10.rtt.Types.LONG))));
                        
                        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                        ((x10.core.Rail<$T>)t$73446).$set__1x10$lang$Rail$$T$G((long)(t$73456), (($T)(t$73457)));
                        
                        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                        final long t$73459 = i$73461;
                        
                        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                        final long t$73460 = ((t$73459) + (((long)(1L))));
                        
                        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                        i$73461 = t$73460;
                    }
                    
                    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final long t$73466 = i$73468;
                    
                    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final long t$73467 = ((t$73466) + (((long)(1L))));
                    
                    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    i$73468 = t$73467;
                }
                
                //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                final long t$73473 = i$73475;
                
                //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                final long t$73474 = ((t$73473) + (((long)(1L))));
                
                //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                i$73475 = t$73474;
            }
        }
        return this;
    }
    
    
    
    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    // creation method for java code (1-phase java constructor)
    public Array_3(final x10.rtt.Type $T, final x10.array.Array_3<$T> src, __0$1x10$array$Array_3$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$array$Array_3$$init$S(src, (x10.array.Array_3.__0$1x10$array$Array_3$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.array.Array_3<$T> x10$array$Array_3$$init$S(final x10.array.Array_3<$T> src, __0$1x10$array$Array_3$$T$2 $dummy) {
         {
            
            //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final x10.array.Array this$73116 = ((x10.array.Array)(this));
            
            //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final x10.core.Rail t$73318 = ((x10.core.Rail)(((x10.array.Array<$T>)src).raw));
            
            //#line 64 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            final x10.core.Rail r$73115 = ((x10.core.Rail)(new x10.core.Rail<$T>($T, ((x10.core.Rail)(t$73318)), (x10.core.Rail.__0$1x10$lang$Rail$$T$2) null)));
            
            //#line 65 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            final long t$73485 = ((x10.core.Rail<$T>)r$73115).size;
            
            //#line 65 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            ((x10.array.Array<$T>)this$73116).size = t$73485;
            {
                
            }
            
            //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            ((x10.array.Array<$T>)this$73116).raw = ((x10.core.Rail)(r$73115));
            
            //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long t$73486 = ((x10.array.Array_3<$T>)src).numElems_1;
            
            //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long t$73487 = ((x10.array.Array_3<$T>)src).numElems_2;
            
            //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long t$73488 = ((x10.array.Array_3<$T>)src).numElems_3;
            
            //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            this.numElems_1 = t$73486;
            this.numElems_2 = t$73487;
            this.numElems_3 = t$73488;
            
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final x10.array.Array_3 this$73489 = this;
        }
        return this;
    }
    
    
    
    //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    // creation method for java code (1-phase java constructor)
    public Array_3(final x10.rtt.Type $T, final x10.core.Rail<$T> r, final long m, final long n, final long p, __0$1x10$array$Array_3$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$array$Array_3$$init$S(r, m, n, p, (x10.array.Array_3.__0$1x10$array$Array_3$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.array.Array_3<$T> x10$array$Array_3$$init$S(final x10.core.Rail<$T> r, final long m, final long n, final long p, __0$1x10$array$Array_3$$T$2 $dummy) {
         {
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final x10.array.Array this$73124 = ((x10.array.Array)(this));
            
            //#line 64 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            final x10.core.Rail r$73123 = ((x10.core.Rail)(r));
            
            //#line 65 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            final long t$73490 = ((x10.core.Rail<$T>)r$73123).size;
            
            //#line 65 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            ((x10.array.Array<$T>)this$73124).size = t$73490;
            {
                
            }
            
            //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            ((x10.array.Array<$T>)this$73124).raw = ((x10.core.Rail)(r$73123));
            
            //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            this.numElems_1 = m;
            this.numElems_2 = n;
            this.numElems_3 = p;
            
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final x10.array.Array_3 this$73491 = this;
        }
        return this;
    }
    
    
    
    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    public static <$T>x10.array.Array_3 makeView__0$1x10$array$Array_3$$T$2(final x10.rtt.Type $T, final x10.core.Rail<$T> r, final long m, final long n, final long p) {
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73324 = ((n) * (((long)(m))));
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long size = ((t$73324) * (((long)(p))));
        
        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73325 = ((x10.core.Rail<$T>)r).size;
        
        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final boolean t$73335 = ((long) size) != ((long) t$73325);
        
        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        if (t$73335) {
            
            //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final java.lang.String t$73326 = (("size mismatch: ") + ((x10.core.Long.$box(m))));
            
            //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final java.lang.String t$73327 = ((t$73326) + (" * "));
            
            //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final java.lang.String t$73328 = ((t$73327) + ((x10.core.Long.$box(n))));
            
            //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final java.lang.String t$73329 = ((t$73328) + (" * "));
            
            //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final java.lang.String t$73330 = ((t$73329) + ((x10.core.Long.$box(p))));
            
            //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final java.lang.String t$73331 = ((t$73330) + (" != "));
            
            //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long t$73332 = ((x10.core.Rail<$T>)r).size;
            
            //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final java.lang.String t$73333 = ((t$73331) + ((x10.core.Long.$box(t$73332))));
            
            //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final x10.lang.IllegalOperationException t$73334 = ((x10.lang.IllegalOperationException)(new x10.lang.IllegalOperationException(t$73333)));
            
            //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            throw t$73334;
        }
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final x10.array.Array_3 alloc$72977 = ((x10.array.Array_3)(new x10.array.Array_3<$T>((java.lang.System[]) null, $T)));
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        alloc$72977.x10$array$Array_3$$init$S(((x10.core.Rail)(r)), ((long)(m)), ((long)(n)), ((long)(p)), (x10.array.Array_3.__0$1x10$array$Array_3$$T$2) null);
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        return alloc$72977;
    }
    
    
    //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    public java.lang.String toString() {
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final x10.util.StringBuilder sb = ((x10.util.StringBuilder)(new x10.util.StringBuilder((java.lang.System[]) null)));
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        sb.x10$util$StringBuilder$$init$S();
        
        //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        sb.add(((java.lang.String)("[")));
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        long printed = 0L;
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73542 = numElems_1;
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long i$73070max$73543 = ((t$73542) - (((long)(1L))));
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        long i$73538 = 0L;
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        outer$73539: 
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        for (;
             true;
             ) {
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long t$73540 = i$73538;
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final boolean t$73541 = ((t$73540) <= (((long)(i$73070max$73543))));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            if (!(t$73541)) {
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                break;
            }
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long i$73535 = i$73538;
            
            //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long t$73533 = numElems_2;
            
            //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long i$73052max$73534 = ((t$73533) - (((long)(1L))));
            
            //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            long i$73530 = 0L;
            
            //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            for (;
                 true;
                 ) {
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                final long t$73531 = i$73530;
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                final boolean t$73532 = ((t$73531) <= (((long)(i$73052max$73534))));
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                if (!(t$73532)) {
                    
                    //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    break;
                }
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                final long j$73527 = i$73530;
                
                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                final long t$73520 = numElems_3;
                
                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                final long i$73034max$73521 = ((t$73520) - (((long)(1L))));
                
                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                long i$73517 = 0L;
                
                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final long t$73518 = i$73517;
                    
                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final boolean t$73519 = ((t$73518) <= (((long)(i$73034max$73521))));
                    
                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    if (!(t$73519)) {
                        
                        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                        break;
                    }
                    
                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final long k$73514 = i$73517;
                    
                    //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final boolean t$73503 = ((long) k$73514) != ((long) 0L);
                    
                    //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    if (t$73503) {
                        
                        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                        sb.add(((java.lang.String)(", ")));
                    }
                    
                    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final x10.array.Array_3 this$73504 = ((x10.array.Array_3)(this));
                    
                    //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final long i$73505 = i$73535;
                    
                    //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final long j$73506 = j$73527;
                    
                    //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final long k$73507 = k$73514;
                    
                    //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    $T ret$73508 =  null;
                    
                    //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
                    final x10.core.Rail r$73492 = ((x10.core.Rail)(((x10.array.Array<$T>)this$73504).raw));
                    
                    //#line 141 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final long i$73493 = i$73505;
                    
                    //#line 141 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final long j$73494 = j$73506;
                    
                    //#line 141 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final long k$73495 = k$73507;
                    
                    //#line 142 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final long t$73496 = ((x10.array.Array_3<$T>)this$73504).numElems_3;
                    
                    //#line 142 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final long t$73497 = ((x10.array.Array_3<$T>)this$73504).numElems_2;
                    
                    //#line 142 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final long t$73498 = ((i$73493) * (((long)(t$73497))));
                    
                    //#line 142 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final long t$73499 = ((j$73494) + (((long)(t$73498))));
                    
                    //#line 142 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final long t$73500 = ((t$73496) * (((long)(t$73499))));
                    
                    //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
                    final long i$73501 = ((k$73495) + (((long)(t$73500))));
                    
                    //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
                    final $T t$73502 = (($T)(((x10.core.Rail<$T>)r$73492).$apply$G((long)(i$73501))));
                    
                    //#line 160 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    ret$73508 = (($T)(t$73502));
                    
                    //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final $T t$73509 = (($T)(ret$73508));
                    
                    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    sb.add(((java.lang.Object)(t$73509)));
                    
                    //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final long t$73510 = printed;
                    
                    //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final long t$73511 = ((t$73510) + (((long)(1L))));
                    
                    //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final long t$73512 = printed = t$73511;
                    
                    //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final boolean t$73513 = ((t$73512) > (((long)(10L))));
                    
                    //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    if (t$73513) {
                        
                        //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                        break outer$73539;
                    }
                    
                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final long t$73515 = i$73517;
                    
                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    final long t$73516 = ((t$73515) + (((long)(1L))));
                    
                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    i$73517 = t$73516;
                }
                
                //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                final long t$73522 = numElems_2;
                
                //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                final long t$73523 = ((t$73522) - (((long)(1L))));
                
                //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                final boolean t$73524 = ((long) j$73527) == ((long) t$73523);
                
                //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                java.lang.String t$73525 =  null;
                
                //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                if (t$73524) {
                    
                    //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    t$73525 = ";; ";
                } else {
                    
                    //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    t$73525 = "; ";
                }
                
                //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                final java.lang.String t$73526 = t$73525;
                
                //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                sb.add(((java.lang.String)(t$73526)));
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                final long t$73528 = i$73530;
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                final long t$73529 = ((t$73528) + (((long)(1L))));
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                i$73530 = t$73529;
            }
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long t$73536 = i$73538;
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long t$73537 = ((t$73536) + (((long)(1L))));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            i$73538 = t$73537;
        }
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73371 = size;
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final boolean t$73376 = ((10L) < (((long)(t$73371))));
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        if (t$73376) {
            
            //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long t$73372 = size;
            
            //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final long t$73373 = ((t$73372) - (((long)(10L))));
            
            //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final java.lang.String t$73374 = (("...(omitted ") + ((x10.core.Long.$box(t$73373))));
            
            //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            final java.lang.String t$73375 = ((t$73374) + (" elements)"));
            
            //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            sb.add(((java.lang.String)(t$73375)));
        }
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        sb.add(((java.lang.String)("]")));
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final java.lang.String t$73377 = sb.toString();
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        return t$73377;
    }
    
    
    //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    public x10.array.DenseIterationSpace_3 indices() {
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final x10.array.DenseIterationSpace_3 alloc$72978 = ((x10.array.DenseIterationSpace_3)(new x10.array.DenseIterationSpace_3((java.lang.System[]) null)));
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73544 = numElems_1;
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73545 = ((t$73544) - (((long)(1L))));
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73546 = numElems_2;
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73547 = ((t$73546) - (((long)(1L))));
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73548 = numElems_3;
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73549 = ((t$73548) - (((long)(1L))));
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        alloc$72978.x10$array$DenseIterationSpace_3$$init$S(((long)(0L)), ((long)(0L)), ((long)(0L)), t$73545, t$73547, t$73549);
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        return alloc$72978;
    }
    
    
    //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    public long offset$O(final long i, final long j, final long k) {
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73386 = numElems_3;
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73384 = numElems_2;
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73385 = ((i) * (((long)(t$73384))));
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73387 = ((j) + (((long)(t$73385))));
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73388 = ((t$73386) * (((long)(t$73387))));
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73389 = ((k) + (((long)(t$73388))));
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        return t$73389;
    }
    
    
    //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    public $T $apply$G(final long i, final long j, final long k) {
        
        //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.Rail r$73239 = ((x10.core.Rail)(raw));
        
        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final x10.array.Array_3 this$73238 = ((x10.array.Array_3)(this));
        
        //#line 141 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long i$73235 = i;
        
        //#line 141 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long j$73236 = j;
        
        //#line 141 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long k$73237 = k;
        
        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73392 = ((x10.array.Array_3<$T>)this$73238).numElems_3;
        
        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73390 = ((x10.array.Array_3<$T>)this$73238).numElems_2;
        
        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73391 = ((i$73235) * (((long)(t$73390))));
        
        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73393 = ((j$73236) + (((long)(t$73391))));
        
        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73394 = ((t$73392) * (((long)(t$73393))));
        
        //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final long i$73240 = ((k$73237) + (((long)(t$73394))));
        
        //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final $T t$73395 = (($T)(((x10.core.Rail<$T>)r$73239).$apply$G((long)(i$73240))));
        
        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        return t$73395;
    }
    
    
    //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    public $T $apply$G(final x10.lang.Point p) {
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final x10.array.Array_3 this$73244 = ((x10.array.Array_3)(this));
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long i$73241 = p.$apply$O((long)(0L));
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long j$73242 = p.$apply$O((long)(1L));
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long k$73243 = p.$apply$O((long)(2L));
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        $T ret$73245 =  null;
        
        //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.Rail r$73550 = ((x10.core.Rail)(((x10.array.Array<$T>)this$73244).raw));
        
        //#line 141 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long i$73551 = i$73241;
        
        //#line 141 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long j$73552 = j$73242;
        
        //#line 141 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long k$73553 = k$73243;
        
        //#line 142 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73554 = ((x10.array.Array_3<$T>)this$73244).numElems_3;
        
        //#line 142 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73555 = ((x10.array.Array_3<$T>)this$73244).numElems_2;
        
        //#line 142 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73556 = ((i$73551) * (((long)(t$73555))));
        
        //#line 142 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73557 = ((j$73552) + (((long)(t$73556))));
        
        //#line 142 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73558 = ((t$73554) * (((long)(t$73557))));
        
        //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final long i$73559 = ((k$73553) + (((long)(t$73558))));
        
        //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final $T t$73560 = (($T)(((x10.core.Rail<$T>)r$73550).$apply$G((long)(i$73559))));
        
        //#line 160 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        ret$73245 = (($T)(t$73560));
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final $T t$73402 = (($T)(ret$73245));
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        return t$73402;
    }
    
    
    //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    public $T $set__3x10$array$Array_3$$T$G(final long i, final long j, final long k, final $T v) {
        
        //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.Rail r$73256 = ((x10.core.Rail)(raw));
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final x10.array.Array_3 this$73255 = ((x10.array.Array_3)(this));
        
        //#line 141 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long i$73252 = i;
        
        //#line 141 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long j$73253 = j;
        
        //#line 141 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long k$73254 = k;
        
        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73405 = ((x10.array.Array_3<$T>)this$73255).numElems_3;
        
        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73403 = ((x10.array.Array_3<$T>)this$73255).numElems_2;
        
        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73404 = ((i$73252) * (((long)(t$73403))));
        
        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73406 = ((j$73253) + (((long)(t$73404))));
        
        //#line 142 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73407 = ((t$73405) * (((long)(t$73406))));
        
        //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final long i$73257 = ((k$73254) + (((long)(t$73407))));
        
        //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final $T v$73258 = (($T)(v));
        
        //#line 40 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        $T ret$73259 =  null;
        
        //#line 42 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        ((x10.core.Rail<$T>)r$73256).$set__1x10$lang$Rail$$T$G((long)(i$73257), (($T)(v$73258)));
        
        //#line 43 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        ret$73259 = (($T)(v$73258));
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        return v;
    }
    
    
    //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    public $T $set__1x10$array$Array_3$$T$G(final x10.lang.Point p, final $T v) {
        
        //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final x10.array.Array_3 this$73265 = ((x10.array.Array_3)(this));
        
        //#line 183 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long i$73261 = p.$apply$O((long)(0L));
        
        //#line 183 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long j$73262 = p.$apply$O((long)(1L));
        
        //#line 183 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long k$73263 = p.$apply$O((long)(2L));
        
        //#line 183 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final $T v$73264 = (($T)(v));
        
        //#line 183 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        $T ret$73266 =  null;
        
        //#line 41 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final x10.core.Rail r$73561 = ((x10.core.Rail)(((x10.array.Array<$T>)this$73265).raw));
        
        //#line 141 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long i$73562 = i$73261;
        
        //#line 141 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long j$73563 = j$73262;
        
        //#line 141 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long k$73564 = k$73263;
        
        //#line 142 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73565 = ((x10.array.Array_3<$T>)this$73265).numElems_3;
        
        //#line 142 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73566 = ((x10.array.Array_3<$T>)this$73265).numElems_2;
        
        //#line 142 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73567 = ((i$73562) * (((long)(t$73566))));
        
        //#line 142 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73568 = ((j$73563) + (((long)(t$73567))));
        
        //#line 142 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73569 = ((t$73565) * (((long)(t$73568))));
        
        //#line 41 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final long i$73570 = ((k$73564) + (((long)(t$73569))));
        
        //#line 41 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        final $T v$73571 = (($T)(v$73264));
        
        //#line 40 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        $T ret$73572 =  null;
        
        //#line 42 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        ((x10.core.Rail<$T>)r$73561).$set__1x10$lang$Rail$$T$G((long)(i$73570), (($T)(v$73571)));
        
        //#line 43 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
        ret$73572 = (($T)(v$73571));
        
        //#line 190 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        ret$73266 = (($T)(v$73264));
        
        //#line 183 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final $T t$73413 = (($T)(ret$73266));
        
        //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        return t$73413;
    }
    
    
    //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    private static long validateSize$O(final long m, final long n, final long p) {
        
        //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        boolean t$73414 = ((m) < (((long)(0L))));
        
        //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        if (!(t$73414)) {
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            t$73414 = ((n) < (((long)(0L))));
        }
        
        //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        boolean t$73415 = t$73414;
        
        //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        if (!(t$73415)) {
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            t$73415 = ((p) < (((long)(0L))));
        }
        
        //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final boolean t$73416 = t$73415;
        
        //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        if (t$73416) {
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            x10.array.Array.raiseNegativeArraySizeException();
        }
        
        //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73417 = ((m) * (((long)(n))));
        
        //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        final long t$73418 = ((t$73417) * (((long)(p))));
        
        //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        return t$73418;
    }
    
    public static long validateSize$P$O(final long m, final long n, final long p) {
        return x10.array.Array_3.validateSize$O((long)(m), (long)(n), (long)(p));
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    final public x10.array.Array_3 x10$array$Array_3$$this$x10$array$Array_3() {
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        return x10.array.Array_3.this;
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    final public void __fieldInitializers_x10_array_Array_3() {
        
    }
}

