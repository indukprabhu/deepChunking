package x10.array;


@x10.runtime.impl.java.X10Generated
final public class Array_1<$T> extends x10.array.Array<$T> implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Array_1> $RTT = 
        x10.rtt.NamedType.<Array_1> make("x10.array.Array_1",
                                         Array_1.class,
                                         1,
                                         new x10.rtt.Type[] {
                                             x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.UnresolvedType.PARAM(0)),
                                             x10.rtt.ParameterizedType.make(x10.array.Array.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                         });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.Array_1<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.array.Array.$_deserialize_body($_obj, $deserializer);
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.array.Array_1 $_obj = new x10.array.Array_1((java.lang.System[]) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.$T);
        
    }
    
    // constructor just for allocation
    public Array_1(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        super($dummy, $T);
        x10.array.Array_1.$initParams(this, $T);
        
    }
    
    // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1){}:U
    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
        if (t1.equals(x10.rtt.Types.LONG)) { return $apply$G(x10.core.Long.$unbox(a1)); }
        if (t1.equals(x10.lang.Point.$RTT)) { return $apply$G((x10.lang.Point)a1); }
        throw new java.lang.Error("dispatch mechanism not completely implemented for contra-variant types.");
    }
    
    // bridge for method abstract public x10.array.Array[T].operator()=(p:x10.lang.Point{self.rank==this(:x10.array.Array).rank()}, v:T){}:T{self==v}
    public $T $set__1x10$array$Array$$T$G(x10.lang.Point a1, $T a2) {
        return $set__1x10$array$Array_1$$T$G(a1, a2);
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final Array_1 $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    // synthetic type for parameter mangling
    public static final class __1x10$array$Array_1$$T {}
    // synthetic type for parameter mangling
    public static final class __1$1x10$lang$Long$3x10$array$Array_1$$T$2 {}
    // synthetic type for parameter mangling
    public static final class __0$1x10$array$Array_1$$T$2 {}
    

    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    final public long rank$O() {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        return 1L;
    }
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    // creation method for java code (1-phase java constructor)
    public Array_1(final x10.rtt.Type $T, final long n) {
        this((java.lang.System[]) null, $T);
        x10$array$Array_1$$init$S(n);
    }
    
    // constructor for non-virtual call
    final public x10.array.Array_1<$T> x10$array$Array_1$$init$S(final long n) {
         {
            
            //#line 137 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            final long n$71697 = n;
            
            //#line 137 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            long ret$71698 =  0;
            
            //#line 138 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            final boolean t$71696 = ((n$71697) < (((long)(0L))));
            
            //#line 138 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            if (t$71696) {
                
                //#line 138 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
                x10.array.Array.raiseNegativeArraySizeException();
            }
            
            //#line 139 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            ret$71698 = n$71697;
            
            //#line 137 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            final long t$71699 = ret$71698;
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            /*super.*/x10$array$Array$$init$S(t$71699, ((boolean)(true)));
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            final x10.array.Array_1 this$71700 = this;
        }
        return this;
    }
    
    
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    // creation method for java code (1-phase java constructor)
    public Array_1(final x10.rtt.Type $T, final long n, final $T init, __1x10$array$Array_1$$T $dummy) {
        this((java.lang.System[]) null, $T);
        x10$array$Array_1$$init$S(n, init, (x10.array.Array_1.__1x10$array$Array_1$$T) null);
    }
    
    // constructor for non-virtual call
    final public x10.array.Array_1<$T> x10$array$Array_1$$init$S(final long n, final $T init, __1x10$array$Array_1$$T $dummy) {
         {
            
            //#line 137 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            final long n$71702 = n;
            
            //#line 137 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            long ret$71703 =  0;
            
            //#line 138 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            final boolean t$71701 = ((n$71702) < (((long)(0L))));
            
            //#line 138 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            if (t$71701) {
                
                //#line 138 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
                x10.array.Array.raiseNegativeArraySizeException();
            }
            
            //#line 139 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            ret$71703 = n$71702;
            
            //#line 137 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            final long t$71704 = ret$71703;
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            /*super.*/x10$array$Array$$init$S(t$71704, ((boolean)(false)));
            
            //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            final x10.array.Array_1 this$71705 = this;
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            final x10.core.Rail t$71671 = ((x10.core.Rail)(raw));
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            ((x10.core.Rail<$T>)t$71671).fill__0x10$lang$Rail$$T((($T)(init)));
        }
        return this;
    }
    
    
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    // creation method for java code (1-phase java constructor)
    public Array_1(final x10.rtt.Type $T, final long n, final x10.core.fun.Fun_0_1<x10.core.Long,$T> init, __1$1x10$lang$Long$3x10$array$Array_1$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$array$Array_1$$init$S(n, init, (x10.array.Array_1.__1$1x10$lang$Long$3x10$array$Array_1$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.array.Array_1<$T> x10$array$Array_1$$init$S(final long n, final x10.core.fun.Fun_0_1<x10.core.Long,$T> init, __1$1x10$lang$Long$3x10$array$Array_1$$T$2 $dummy) {
         {
            
            //#line 137 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            final long n$71715 = n;
            
            //#line 137 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            long ret$71716 =  0;
            
            //#line 138 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            final boolean t$71706 = ((n$71715) < (((long)(0L))));
            
            //#line 138 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            if (t$71706) {
                
                //#line 138 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
                x10.array.Array.raiseNegativeArraySizeException();
            }
            
            //#line 139 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            ret$71716 = n$71715;
            
            //#line 137 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            final long t$71717 = ret$71716;
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            /*super.*/x10$array$Array$$init$S(t$71717, ((boolean)(false)));
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            final x10.array.Array_1 this$71718 = this;
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            final x10.core.Rail rail$71719 = ((x10.core.Rail)(raw));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            final long i$70908max$71720 = ((x10.core.Rail<$T>)rail$71719).size;
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            long i$71712 = 0L;
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            for (;
                 true;
                 ) {
                
                //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
                final long t$71713 = i$71712;
                
                //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
                final boolean t$71714 = ((t$71713) < (((long)(i$70908max$71720))));
                
                //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
                if (!(t$71714)) {
                    
                    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
                    break;
                }
                
                //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
                final long i$71709 = i$71712;
                
                //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
                final x10.core.Rail t$71707 = ((x10.core.Rail)(raw));
                
                //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
                final $T t$71708 = (($T)((($T)
                                           ((x10.core.fun.Fun_0_1<x10.core.Long,$T>)init).$apply(x10.core.Long.$box(i$71709), x10.rtt.Types.LONG))));
                
                //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
                ((x10.core.Rail<$T>)t$71707).$set__1x10$lang$Rail$$T$G((long)(i$71709), (($T)(t$71708)));
                
                //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
                final long t$71710 = i$71712;
                
                //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
                final long t$71711 = ((t$71710) + (((long)(1L))));
                
                //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
                i$71712 = t$71711;
            }
        }
        return this;
    }
    
    
    
    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    // creation method for java code (1-phase java constructor)
    public Array_1(final x10.rtt.Type $T, final x10.array.Array_1<$T> src, __0$1x10$array$Array_1$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$array$Array_1$$init$S(src, (x10.array.Array_1.__0$1x10$array$Array_1$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.array.Array_1<$T> x10$array$Array_1$$init$S(final x10.array.Array_1<$T> src, __0$1x10$array$Array_1$$T$2 $dummy) {
         {
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            final x10.array.Array this$70945 = ((x10.array.Array)(this));
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            final x10.core.Rail t$71681 = ((x10.core.Rail)(((x10.array.Array<$T>)src).raw));
            
            //#line 64 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            final x10.core.Rail r$70944 = ((x10.core.Rail)(new x10.core.Rail<$T>($T, ((x10.core.Rail)(t$71681)), (x10.core.Rail.__0$1x10$lang$Rail$$T$2) null)));
            
            //#line 65 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            final long t$71721 = ((x10.core.Rail<$T>)r$70944).size;
            
            //#line 65 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            ((x10.array.Array<$T>)this$70945).size = t$71721;
            {
                
            }
            
            //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            ((x10.array.Array<$T>)this$70945).raw = ((x10.core.Rail)(r$70944));
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            final x10.array.Array_1 this$71722 = this;
        }
        return this;
    }
    
    
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    // creation method for java code (1-phase java constructor)
    public Array_1(final x10.rtt.Type $T, final x10.core.Rail<$T> r, __0$1x10$array$Array_1$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$array$Array_1$$init$S(r, (x10.array.Array_1.__0$1x10$array$Array_1$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.array.Array_1<$T> x10$array$Array_1$$init$S(final x10.core.Rail<$T> r, __0$1x10$array$Array_1$$T$2 $dummy) {
         {
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            final x10.array.Array this$70953 = ((x10.array.Array)(this));
            
            //#line 64 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            final x10.core.Rail r$70952 = ((x10.core.Rail)(r));
            
            //#line 65 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            final long t$71723 = ((x10.core.Rail<$T>)r$70952).size;
            
            //#line 65 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            ((x10.array.Array<$T>)this$70953).size = t$71723;
            {
                
            }
            
            //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            ((x10.array.Array<$T>)this$70953).raw = ((x10.core.Rail)(r$70952));
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            final x10.array.Array_1 this$71724 = this;
        }
        return this;
    }
    
    
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    public static <$T>x10.array.Array_1 makeView__0$1x10$array$Array_1$$T$2(final x10.rtt.Type $T, final x10.core.Rail<$T> r) {
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        final x10.array.Array_1 alloc$70905 = ((x10.array.Array_1)(new x10.array.Array_1<$T>((java.lang.System[]) null, $T)));
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        alloc$70905.x10$array$Array_1$$init$S(((x10.core.Rail)(r)), (x10.array.Array_1.__0$1x10$array$Array_1$$T$2) null);
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        return alloc$70905;
    }
    
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    public java.lang.String toString() {
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        final x10.core.Rail t$71684 = ((x10.core.Rail)(raw));
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        final java.lang.String t$71685 = ((x10.core.Rail<$T>)t$71684).toString();
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        return t$71685;
    }
    
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    public x10.array.DenseIterationSpace_1 indices() {
        
        //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        final x10.array.DenseIterationSpace_1 alloc$70906 = ((x10.array.DenseIterationSpace_1)(new x10.array.DenseIterationSpace_1((java.lang.System[]) null)));
        
        //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        final long t$71725 = size;
        
        //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        final long t$71726 = ((t$71725) - (((long)(1L))));
        
        //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        alloc$70906.x10$array$DenseIterationSpace_1$$init$S(((long)(0L)), t$71726);
        
        //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        return alloc$70906;
    }
    
    
    //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    public $T $apply$G(final long i) {
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        final x10.core.Rail t$71688 = ((x10.core.Rail)(raw));
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        final $T t$71689 = (($T)(((x10.core.Rail<$T>)t$71688).$apply$G((long)(i))));
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        return t$71689;
    }
    
    
    //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    public $T $apply$G(final x10.lang.Point p) {
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        final x10.array.Array_1 this$71661 = ((x10.array.Array_1)(this));
        
        //#line 95 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        final long i$71660 = p.$apply$O((long)(0L));
        
        //#line 97 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        final x10.core.Rail t$71690 = ((x10.core.Rail)(((x10.array.Array<$T>)this$71661).raw));
        
        //#line 97 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        final $T t$71691 = (($T)(((x10.core.Rail<$T>)t$71690).$apply$G((long)(i$71660))));
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        return t$71691;
    }
    
    
    //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    public $T $set__1x10$array$Array_1$$T$G(final long i, final $T v) {
        
        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        final x10.core.Rail t$71692 = ((x10.core.Rail)(raw));
        
        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        ((x10.core.Rail<$T>)t$71692).$set__1x10$lang$Rail$$T$G((long)(i), (($T)(v)));
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        return v;
    }
    
    
    //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    public $T $set__1x10$array$Array_1$$T$G(final x10.lang.Point p, final $T v) {
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        final x10.array.Array_1 this$71664 = ((x10.array.Array_1)(this));
        
        //#line 119 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        final long i$71662 = p.$apply$O((long)(0L));
        
        //#line 119 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        final $T v$71663 = (($T)(v));
        
        //#line 119 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        $T ret$71665 =  null;
        
        //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        final x10.core.Rail t$71727 = ((x10.core.Rail)(((x10.array.Array<$T>)this$71664).raw));
        
        //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        ((x10.core.Rail<$T>)t$71727).$set__1x10$lang$Rail$$T$G((long)(i$71662), (($T)(v$71663)));
        
        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        ret$71665 = (($T)(v$71663));
        
        //#line 119 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        final $T t$71694 = (($T)(ret$71665));
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        return t$71694;
    }
    
    
    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    private static long validateSize$O(final long n) {
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        final boolean t$71695 = ((n) < (((long)(0L))));
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        if (t$71695) {
            
            //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            x10.array.Array.raiseNegativeArraySizeException();
        }
        
        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        return n;
    }
    
    public static long validateSize$P$O(final long n) {
        return x10.array.Array_1.validateSize$O((long)(n));
    }
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    final public x10.array.Array_1 x10$array$Array_1$$this$x10$array$Array_1() {
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
        return x10.array.Array_1.this;
    }
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    final public void __fieldInitializers_x10_array_Array_1() {
        
    }
}

