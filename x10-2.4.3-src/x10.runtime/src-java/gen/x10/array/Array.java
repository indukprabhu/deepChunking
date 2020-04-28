package x10.array;


@x10.runtime.impl.java.X10Generated
abstract public class Array<$T> extends x10.core.Ref implements x10.lang.Iterable, x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Array> $RTT = 
        x10.rtt.NamedType.<Array> make("x10.array.Array",
                                       Array.class,
                                       1,
                                       new x10.rtt.Type[] {
                                           x10.rtt.ParameterizedType.make(x10.lang.Iterable.$RTT, x10.rtt.UnresolvedType.PARAM(0)),
                                           x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.lang.Point.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                       });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.Array<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.raw = $deserializer.readObject();
        $_obj.size = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return null;
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$T);
        $serializer.write(this.raw);
        $serializer.write(this.size);
        
    }
    
    // constructor just for allocation
    public Array(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        x10.array.Array.$initParams(this, $T);
        
    }
    
    // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1){}:U
    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
        return $apply$G((x10.lang.Point)a1);
        
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final Array $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    // synthetic type for parameter mangling
    public static final class __0$1x10$array$Array$$T$2 {}
    
    // properties
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    public long size;
    

    
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    abstract public long rank$O();
    
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    /**
     * The backing storage for the array's elements
     */
    public x10.core.Rail<$T> raw;
    
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    
    // constructor for non-virtual call
    final public x10.array.Array<$T> x10$array$Array$$init$S(final long s, final boolean zero) {
         {
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            this.size = s;
            
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            final x10.array.Array this$70854 = this;
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            x10.core.Rail t$70787 =  null;
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            if (zero) {
                
                //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
                t$70787 = ((x10.core.Rail)(x10.core.Rail.<$T>makeUnsafe($T, ((long)(s)), true)));
            } else {
                
                //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
                t$70787 = ((x10.core.Rail)(x10.core.Rail.<$T>makeUnsafe($T, ((long)(s)), false)));
            }
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            final x10.core.Rail t$70788 = ((x10.core.Rail)(t$70787));
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            ((x10.array.Array<$T>)this).raw = ((x10.core.Rail)(t$70788));
        }
        return this;
    }
    
    
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    
    // constructor for non-virtual call
    final public x10.array.Array<$T> x10$array$Array$$init$S(final x10.core.Rail<$T> r, __0$1x10$array$Array$$T$2 $dummy) {
         {
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            final long t$70855 = ((x10.core.Rail<$T>)r).size;
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            this.size = t$70855;
            
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            final x10.array.Array this$70856 = this;
            
            //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            ((x10.array.Array<$T>)this).raw = ((x10.core.Rail)(r));
        }
        return this;
    }
    
    
    
    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    final public x10.core.Rail raw() {
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final x10.core.Rail t$70790 = ((x10.core.Rail)(raw));
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        return t$70790;
    }
    
    
    //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    final public void modifyRaw__0$1x10$array$Array$$T$2(final x10.core.Rail r) {
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final x10.core.Rail t$70791 = ((x10.core.Rail)(raw));
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final long t$70792 = ((x10.core.Rail<$T>)t$70791).size;
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final long t$70793 = this.size;
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final boolean t$70795 = ((long) t$70792) != ((long) t$70793);
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        if (t$70795) {
            
            //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            final java.lang.IllegalArgumentException t$70794 = ((java.lang.IllegalArgumentException)(new java.lang.IllegalArgumentException("size mismatch")));
            
            //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
            throw t$70794;
        }
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final x10.core.Rail t$70796 = ((x10.core.Rail)(((x10.core.Rail<$T>)
                                                         r)));
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        ((x10.array.Array<$T>)this).raw = ((x10.core.Rail)(t$70796));
    }
    
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    final public x10.lang.Iterator iterator() {
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final x10.core.Rail t$70797 = ((x10.core.Rail)(raw));
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final x10.lang.Iterator t$70798 = ((x10.lang.Iterator<$T>)
                                            ((x10.core.Rail<$T>)t$70797).iterator());
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        return t$70798;
    }
    
    
    //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    public void fill__0x10$array$Array$$T(final $T v) {
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final x10.core.Rail t$70799 = ((x10.core.Rail)(raw));
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        ((x10.core.Rail<$T>)t$70799).fill__0x10$lang$Rail$$T((($T)(v)));
    }
    
    
    //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    public void clear() {
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final x10.core.Rail t$70800 = ((x10.core.Rail)(raw));
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        ((x10.core.Rail<$T>)t$70800).clear();
    }
    
    
    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    final public <$U>$U reduce__0$1x10$array$Array$$U$3x10$array$Array$$T$3x10$array$Array$$U$2__1x10$array$Array$$U$G(final x10.rtt.Type $U, final x10.core.fun.Fun_0_2 op, final $U unit) {
        
        //#line 128 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final x10.core.Rail src$70734 = ((x10.core.Rail)(this.raw));
        
        //#line 128 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final x10.core.fun.Fun_0_2 op$70735 = ((x10.core.fun.Fun_0_2)(op));
        
        //#line 128 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final $U unit$70736 = (($U)(unit));
        
        //#line 128 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        $U ret$70743 =  null;
        
        //#line 132 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        $U accum$70868 = (($U)(unit$70736));
        
        //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final x10.core.Rail rail$70866 = ((x10.core.Rail)(src$70734));
        
        //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final long i$70678max$70867 = ((x10.core.Rail<$T>)rail$70866).size;
        
        //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        long i$70863 = 0L;
        
        //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        for (;
             true;
             ) {
            
            //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$70864 = i$70863;
            
            //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final boolean t$70865 = ((t$70864) < (((long)(i$70678max$70867))));
            
            //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            if (!(t$70865)) {
                
                //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                break;
            }
            
            //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long i$70860 = i$70863;
            
            //#line 134 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final $U t$70857 = (($U)(accum$70868));
            
            //#line 134 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final $T t$70858 = (($T)(((x10.core.Rail<$T>)src$70734).$apply$G((long)(i$70860))));
            
            //#line 134 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final $U t$70859 = (($U)((($U)
                                       ((x10.core.fun.Fun_0_2<$U,$T,$U>)op$70735).$apply(t$70857, $U, t$70858, $T))));
            
            //#line 134 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            accum$70868 = (($U)(t$70859));
            
            //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$70861 = i$70863;
            
            //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$70862 = ((t$70861) + (((long)(1L))));
            
            //#line 133 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            i$70863 = t$70862;
        }
        
        //#line 136 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final $U t$70869 = (($U)(accum$70868));
        
        //#line 136 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ret$70743 = (($U)(t$70869));
        
        //#line 128 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final $U t$70810 = (($U)(ret$70743));
        
        //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        return t$70810;
    }
    
    
    //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    final public <$U>x10.array.Array map__0$1x10$array$Array$$U$2__1$1x10$array$Array$$T$3x10$array$Array$$U$2(final x10.rtt.Type $U, final x10.array.Array dst, final x10.core.fun.Fun_0_1 op) {
        
        //#line 150 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final x10.core.Rail src$70745 = ((x10.core.Rail)(this.raw));
        
        //#line 150 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final x10.core.Rail dst$70746 = ((x10.core.Rail)(((x10.array.Array<$U>)dst).raw));
        
        //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final x10.core.fun.Fun_0_1 op$70747 = ((x10.core.fun.Fun_0_1)(op));
        
        //#line 150 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        x10.core.Rail ret$70753 =  null;
        
        //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final x10.core.Rail rail$70878 = ((x10.core.Rail)(src$70745));
        
        //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final long i$70697max$70879 = ((x10.core.Rail<$T>)rail$70878).size;
        
        //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        long i$70875 = 0L;
        
        //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        for (;
             true;
             ) {
            
            //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$70876 = i$70875;
            
            //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final boolean t$70877 = ((t$70876) < (((long)(i$70697max$70879))));
            
            //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            if (!(t$70877)) {
                
                //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                break;
            }
            
            //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long i$70872 = i$70875;
            
            //#line 156 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final $T t$70870 = (($T)(((x10.core.Rail<$T>)src$70745).$apply$G((long)(i$70872))));
            
            //#line 156 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final $U t$70871 = (($U)((($U)
                                       ((x10.core.fun.Fun_0_1<$T,$U>)op$70747).$apply(t$70870, $T))));
            
            //#line 156 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            ((x10.core.Rail<$U>)dst$70746).$set__1x10$lang$Rail$$T$G((long)(i$70872), (($U)(t$70871)));
            
            //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$70873 = i$70875;
            
            //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$70874 = ((t$70873) + (((long)(1L))));
            
            //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            i$70875 = t$70874;
        }
        
        //#line 158 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ret$70753 = ((x10.core.Rail)(dst$70746));
        
        //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        return dst;
    }
    
    
    //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    final public <$S, $U>x10.array.Array map__0$1x10$array$Array$$S$2__1$1x10$array$Array$$U$2__2$1x10$array$Array$$T$3x10$array$Array$$S$3x10$array$Array$$U$2(final x10.rtt.Type $S, final x10.rtt.Type $U, final x10.array.Array src2, final x10.array.Array dst, final x10.core.fun.Fun_0_2 op) {
        
        //#line 173 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final x10.core.Rail src$70755 = ((x10.core.Rail)(this.raw));
        
        //#line 173 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final x10.core.Rail src$70756 = ((x10.core.Rail)(((x10.array.Array<$S>)src2).raw));
        
        //#line 173 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final x10.core.Rail dst$70757 = ((x10.core.Rail)(((x10.array.Array<$U>)dst).raw));
        
        //#line 173 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final x10.core.fun.Fun_0_2 op$70758 = ((x10.core.fun.Fun_0_2)(op));
        
        //#line 173 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        x10.core.Rail ret$70764 =  null;
        
        //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final x10.core.Rail rail$70889 = ((x10.core.Rail)(src$70755));
        
        //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final long i$70716max$70890 = ((x10.core.Rail<$T>)rail$70889).size;
        
        //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        long i$70886 = 0L;
        
        //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        for (;
             true;
             ) {
            
            //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$70887 = i$70886;
            
            //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final boolean t$70888 = ((t$70887) < (((long)(i$70716max$70890))));
            
            //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            if (!(t$70888)) {
                
                //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                break;
            }
            
            //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long i$70883 = i$70886;
            
            //#line 179 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final $T t$70880 = (($T)(((x10.core.Rail<$T>)src$70755).$apply$G((long)(i$70883))));
            
            //#line 179 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final $S t$70881 = (($S)(((x10.core.Rail<$S>)src$70756).$apply$G((long)(i$70883))));
            
            //#line 179 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final $U t$70882 = (($U)((($U)
                                       ((x10.core.fun.Fun_0_2<$T,$S,$U>)op$70758).$apply(t$70880, $T, t$70881, $S))));
            
            //#line 179 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            ((x10.core.Rail<$U>)dst$70757).$set__1x10$lang$Rail$$T$G((long)(i$70883), (($U)(t$70882)));
            
            //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$70884 = i$70886;
            
            //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$70885 = ((t$70884) + (((long)(1L))));
            
            //#line 178 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            i$70886 = t$70885;
        }
        
        //#line 181 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ret$70764 = ((x10.core.Rail)(dst$70757));
        
        //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        return dst;
    }
    
    
    //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    abstract public x10.array.IterationSpace indices();
    
    
    //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    abstract public $T $apply$G(final x10.lang.Point p);
    
    
    //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    abstract public $T $set__1x10$array$Array$$T$G(final x10.lang.Point p, final $T v);
    
    
    //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    public static <$T>void copy__0$1x10$array$Array$$T$2__1$1x10$array$Array$$T$2(final x10.rtt.Type $T, final x10.array.Array<$T> src, final x10.array.Array<$T> dst) {
        
        //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final x10.core.Rail t$70833 = ((x10.core.Rail)(((x10.array.Array<$T>)src).raw));
        
        //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final x10.core.Rail t$70834 = ((x10.core.Rail)(((x10.array.Array<$T>)dst).raw));
        
        //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final x10.core.Rail t$70832 = ((x10.core.Rail)(((x10.array.Array<$T>)src).raw));
        
        //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final long t$70835 = ((x10.core.Rail<$T>)t$70832).size;
        
        //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        x10.core.Rail.<$T> copy__0$1x10$lang$Rail$$T$2__2$1x10$lang$Rail$$T$2($T, ((x10.core.Rail)(t$70833)), (long)(0L), ((x10.core.Rail)(t$70834)), (long)(0L), (long)(t$70835));
    }
    
    
    //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    public static <$T>void copy__0$1x10$array$Array$$T$2__2$1x10$array$Array$$T$2(final x10.rtt.Type $T, final x10.array.Array<$T> src, final long srcIndex, final x10.array.Array<$T> dst, final long dstIndex, final long numElems) {
        
        //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final x10.core.Rail t$70836 = ((x10.core.Rail)(((x10.array.Array<$T>)src).raw));
        
        //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final x10.core.Rail t$70837 = ((x10.core.Rail)(((x10.array.Array<$T>)dst).raw));
        
        //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        x10.core.Rail.<$T> copy__0$1x10$lang$Rail$$T$2__2$1x10$lang$Rail$$T$2($T, ((x10.core.Rail)(t$70836)), (long)(srcIndex), ((x10.core.Rail)(t$70837)), (long)(dstIndex), (long)(numElems));
    }
    
    
    //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    public static void raiseBoundsError(final long i) {
        
        //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final java.lang.String t$70838 = (("(") + ((x10.core.Long.$box(i))));
        
        //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final java.lang.String t$70839 = ((t$70838) + (") not contained in array"));
        
        //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final java.lang.ArrayIndexOutOfBoundsException t$70840 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$70839)));
        
        //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        throw t$70840;
    }
    
    
    //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    public static void raiseBoundsError(final long i, final long j) {
        
        //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final java.lang.String t$70841 = (("(") + ((x10.core.Long.$box(i))));
        
        //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final java.lang.String t$70842 = ((t$70841) + (", "));
        
        //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final java.lang.String t$70843 = ((t$70842) + ((x10.core.Long.$box(j))));
        
        //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final java.lang.String t$70844 = ((t$70843) + (") not contained in array"));
        
        //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final java.lang.ArrayIndexOutOfBoundsException t$70845 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$70844)));
        
        //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        throw t$70845;
    }
    
    
    //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    public static void raiseBoundsError(final long i, final long j, final long k) {
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final java.lang.String t$70846 = (("(") + ((x10.core.Long.$box(i))));
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final java.lang.String t$70847 = ((t$70846) + (", "));
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final java.lang.String t$70848 = ((t$70847) + ((x10.core.Long.$box(j))));
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final java.lang.String t$70849 = ((t$70848) + (", "));
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final java.lang.String t$70850 = ((t$70849) + ((x10.core.Long.$box(k))));
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final java.lang.String t$70851 = ((t$70850) + (") not contained in array"));
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final java.lang.ArrayIndexOutOfBoundsException t$70852 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$70851)));
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        throw t$70852;
    }
    
    
    //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    public static void raiseNegativeArraySizeException() {
        
        //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        final java.lang.NegativeArraySizeException t$70853 = ((java.lang.NegativeArraySizeException)(new java.lang.NegativeArraySizeException()));
        
        //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        throw t$70853;
    }
    
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    final public x10.array.Array x10$array$Array$$this$x10$array$Array() {
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
        return x10.array.Array.this;
    }
    
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    final public void __fieldInitializers_x10_array_Array() {
        
    }
}

