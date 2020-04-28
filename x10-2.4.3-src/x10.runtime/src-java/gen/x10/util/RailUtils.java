package x10.util;


@x10.runtime.impl.java.X10Generated
public class RailUtils extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<RailUtils> $RTT = 
        x10.rtt.NamedType.<RailUtils> make("x10.util.RailUtils",
                                           RailUtils.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.RailUtils $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.RailUtils $_obj = new x10.util.RailUtils((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public RailUtils(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    public static <$T>void sort__0$1x10$util$RailUtils$$T$2__1$1x10$util$RailUtils$$T$3x10$util$RailUtils$$T$3x10$lang$Int$2(final x10.rtt.Type $T, final x10.core.Rail<$T> a, final x10.core.fun.Fun_0_2<$T,$T,x10.core.Int> cmp) {
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final long t$141737 = ((x10.core.Rail<$T>)a).size;
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final long t$141738 = ((t$141737) - (((long)(1L))));
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        x10.util.RailUtils.<$T> qsort__0$1x10$util$RailUtils$$T$2__3$1x10$util$RailUtils$$T$3x10$util$RailUtils$$T$3x10$lang$Int$2($T, ((x10.core.Rail)(a)), (long)(0L), (long)(t$141738), ((x10.core.fun.Fun_0_2)(cmp)));
    }
    
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    public static <$T>void sort__0$1x10$util$RailUtils$$T$2(final x10.rtt.Type $T, final x10.core.Rail<$T> a) {
        
        //#line 28 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final x10.core.Rail a$141730 = ((x10.core.Rail)(a));
        
        //#line 29 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final long t$141829 = ((x10.core.Rail<$T>)a$141730).size;
        
        //#line 29 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final long t$141830 = ((t$141829) - (((long)(1L))));
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final x10.core.fun.Fun_0_2 t$141831 = ((x10.core.fun.Fun_0_2)(new x10.util.RailUtils.$Closure$307<$T>($T)));
        
        //#line 29 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        x10.util.RailUtils.<$T> qsort__0$1x10$util$RailUtils$$T$2__3$1x10$util$RailUtils$$T$3x10$util$RailUtils$$T$3x10$lang$Int$2($T, ((x10.core.Rail)(a$141730)), (long)(0L), (long)(t$141830), ((x10.core.fun.Fun_0_2)(t$141831)));
    }
    
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    public static <$T>void qsort__0$1x10$util$RailUtils$$T$2__3$1x10$util$RailUtils$$T$3x10$util$RailUtils$$T$3x10$lang$Int$2(final x10.rtt.Type $T, final x10.core.Rail<$T> a, final long lo, final long hi, final x10.core.fun.Fun_0_2<$T,$T,x10.core.Int> cmp) {
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final boolean t$141743 = ((hi) <= (((long)(lo))));
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        if (t$141743) {
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            return;
        }
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        long l = ((lo) - (((long)(1L))));
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        long h = hi;
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        while (true) {
            
            //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            while (true) {
                
                //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long t$141744 = l;
                
                //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long t$141745 = ((t$141744) + (((long)(1L))));
                
                //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long t$141746 = l = t$141745;
                
                //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final $T t$141747 = (($T)(((x10.core.Rail<$T>)a).$apply$G((long)(t$141746))));
                
                //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final $T t$141748 = (($T)(((x10.core.Rail<$T>)a).$apply$G((long)(hi))));
                
                //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final int t$141749 = x10.core.Int.$unbox(((x10.core.fun.Fun_0_2<$T,$T,x10.core.Int>)cmp).$apply(t$141747, $T, t$141748, $T));
                
                //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long t$141750 = ((long)(((int)(t$141749))));
                
                //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final boolean t$141751 = ((t$141750) < (((long)(0L))));
                
                //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                if (!(t$141751)) {
                    
                    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                    break;
                }
            }
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            while (true) {
                
                //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final $T t$141755 = (($T)(((x10.core.Rail<$T>)a).$apply$G((long)(hi))));
                
                //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long t$141752 = h;
                
                //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long t$141753 = ((t$141752) - (((long)(1L))));
                
                //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long t$141754 = h = t$141753;
                
                //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final $T t$141756 = (($T)(((x10.core.Rail<$T>)a).$apply$G((long)(t$141754))));
                
                //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final int t$141757 = x10.core.Int.$unbox(((x10.core.fun.Fun_0_2<$T,$T,x10.core.Int>)cmp).$apply(t$141755, $T, t$141756, $T));
                
                //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long t$141758 = ((long)(((int)(t$141757))));
                
                //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                boolean t$141760 = ((t$141758) < (((long)(0L))));
                
                //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                if (t$141760) {
                    
                    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                    final long t$141759 = h;
                    
                    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                    t$141760 = ((t$141759) > (((long)(lo))));
                }
                
                //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final boolean t$141761 = t$141760;
                
                //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                if (!(t$141761)) {
                    
                    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                    break;
                }
            }
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$141762 = l;
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$141763 = h;
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final boolean t$141764 = ((t$141762) >= (((long)(t$141763))));
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            if (t$141764) {
                
                //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                break;
            }
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$141765 = l;
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$141766 = h;
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            x10.util.RailUtils.<$T> exch__0$1x10$util$RailUtils$$T$2($T, ((x10.core.Rail)(a)), (long)(t$141765), (long)(t$141766));
        }
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final long t$141767 = l;
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        x10.util.RailUtils.<$T> exch__0$1x10$util$RailUtils$$T$2($T, ((x10.core.Rail)(a)), (long)(t$141767), (long)(hi));
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final long t$141768 = l;
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final long t$141769 = ((t$141768) - (((long)(1L))));
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        x10.util.RailUtils.<$T> qsort__0$1x10$util$RailUtils$$T$2__3$1x10$util$RailUtils$$T$3x10$util$RailUtils$$T$3x10$lang$Int$2($T, ((x10.core.Rail)(a)), (long)(lo), (long)(t$141769), ((x10.core.fun.Fun_0_2)(cmp)));
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final long t$141770 = l;
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final long t$141771 = ((t$141770) + (((long)(1L))));
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        x10.util.RailUtils.<$T> qsort__0$1x10$util$RailUtils$$T$2__3$1x10$util$RailUtils$$T$3x10$util$RailUtils$$T$3x10$lang$Int$2($T, ((x10.core.Rail)(a)), (long)(t$141771), (long)(hi), ((x10.core.fun.Fun_0_2)(cmp)));
    }
    
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    private static <$T>void exch__0$1x10$util$RailUtils$$T$2(final x10.rtt.Type $T, final x10.core.Rail<$T> a, final long i, final long j) {
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final $T temp = (($T)(((x10.core.Rail<$T>)a).$apply$G((long)(i))));
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final $T t$141772 = (($T)(((x10.core.Rail<$T>)a).$apply$G((long)(j))));
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ((x10.core.Rail<$T>)a).$set__1x10$lang$Rail$$T$G((long)(i), (($T)(t$141772)));
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ((x10.core.Rail<$T>)a).$set__1x10$lang$Rail$$T$G((long)(j), (($T)(temp)));
    }
    
    public static <$T>void exch$P__0$1x10$util$RailUtils$$T$2(final x10.rtt.Type $T, final x10.core.Rail<$T> a, final long i, final long j) {
        x10.util.RailUtils.<$T> exch__0$1x10$util$RailUtils$$T$2($T, ((x10.core.Rail)(a)), (long)(i), (long)(j));
    }
    
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    public static <$T>long binarySearch__0$1x10$util$RailUtils$$T$2__1x10$util$RailUtils$$T__2$1x10$util$RailUtils$$T$3x10$util$RailUtils$$T$3x10$lang$Int$2$O(final x10.rtt.Type $T, final x10.core.Rail<$T> a, final $T key, final x10.core.fun.Fun_0_2<$T,$T,x10.core.Int> cmp) {
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final long t$141773 = ((x10.core.Rail<$T>)a).size;
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final long t$141774 = x10.util.RailUtils.<$T> binarySearch__0$1x10$util$RailUtils$$T$2__1x10$util$RailUtils$$T__4$1x10$util$RailUtils$$T$3x10$util$RailUtils$$T$3x10$lang$Int$2$O($T, ((x10.core.Rail)(a)), (($T)(key)), (long)(0L), (long)(t$141773), ((x10.core.fun.Fun_0_2)(cmp)));
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        return t$141774;
    }
    
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    public static <$T>long binarySearch__0$1x10$util$RailUtils$$T$2__1x10$util$RailUtils$$T$O(final x10.rtt.Type $T, final x10.core.Rail<$T> a, final $T key) {
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final long t$141776 = ((x10.core.Rail<$T>)a).size;
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final x10.core.fun.Fun_0_2 t$141777 = ((x10.core.fun.Fun_0_2)(new x10.util.RailUtils.$Closure$308<$T>($T)));
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final long t$141778 = x10.util.RailUtils.<$T> binarySearch__0$1x10$util$RailUtils$$T$2__1x10$util$RailUtils$$T__4$1x10$util$RailUtils$$T$3x10$util$RailUtils$$T$3x10$lang$Int$2$O($T, ((x10.core.Rail)(a)), (($T)(key)), (long)(0L), (long)(t$141776), ((x10.core.fun.Fun_0_2)(t$141777)));
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        return t$141778;
    }
    
    
    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    public static <$T>long binarySearch__0$1x10$util$RailUtils$$T$2__1x10$util$RailUtils$$T__4$1x10$util$RailUtils$$T$3x10$util$RailUtils$$T$3x10$lang$Int$2$O(final x10.rtt.Type $T, final x10.core.Rail<$T> a, final $T key, final long min, final long max, final x10.core.fun.Fun_0_2<$T,$T,x10.core.Int> cmp) {
        
        //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        long low = min;
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        long high = ((max) - (((long)(1L))));
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        while (true) {
            
            //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$141779 = low;
            
            //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$141780 = high;
            
            //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final boolean t$141795 = ((t$141779) <= (((long)(t$141780))));
            
            //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            if (!(t$141795)) {
                
                //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                break;
            }
            
            //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$141835 = low;
            
            //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$141836 = high;
            
            //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$141837 = ((t$141835) + (((long)(t$141836))));
            
            //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            long mid$141838 = ((t$141837) / (((long)(2L))));
            
            //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$141839 = mid$141838;
            
            //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final $T t$141840 = (($T)(((x10.core.Rail<$T>)a).$apply$G((long)(t$141839))));
            
            //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final int compare$141841 = x10.core.Int.$unbox(((x10.core.fun.Fun_0_2<$T,$T,x10.core.Int>)cmp).$apply(t$141840, $T, key, $T));
            
            //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$141842 = ((long)(((int)(compare$141841))));
            
            //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final boolean t$141843 = ((t$141842) < (((long)(0L))));
            
            //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            if (t$141843) {
                
                //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long t$141844 = mid$141838;
                
                //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long t$141845 = ((t$141844) + (((long)(1L))));
                
                //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                low = t$141845;
            } else {
                
                //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final long t$141846 = ((long)(((int)(compare$141841))));
                
                //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                final boolean t$141847 = ((t$141846) > (((long)(0L))));
                
                //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                if (t$141847) {
                    
                    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                    final long t$141848 = mid$141838;
                    
                    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                    final long t$141849 = ((t$141848) - (((long)(1L))));
                    
                    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                    high = t$141849;
                } else {
                    
                    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                    final long t$141850 = mid$141838;
                    
                    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                    return t$141850;
                }
            }
        }
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final long t$141796 = low;
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final long t$141797 = ((t$141796) + (((long)(1L))));
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final long t$141798 = (-(t$141797));
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        return t$141798;
    }
    
    
    //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    public static <$T>long binarySearch__0$1x10$util$RailUtils$$T$2__1x10$util$RailUtils$$T$O(final x10.rtt.Type $T, final x10.core.Rail<$T> a, final $T key, final long min, final long max) {
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final long t$141800 = ((x10.core.Rail<$T>)a).size;
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final x10.core.fun.Fun_0_2 t$141801 = ((x10.core.fun.Fun_0_2)(new x10.util.RailUtils.$Closure$309<$T>($T)));
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final long t$141802 = x10.util.RailUtils.<$T> binarySearch__0$1x10$util$RailUtils$$T$2__1x10$util$RailUtils$$T__4$1x10$util$RailUtils$$T$3x10$util$RailUtils$$T$3x10$lang$Int$2$O($T, ((x10.core.Rail)(a)), (($T)(key)), (long)(0L), (long)(t$141800), ((x10.core.fun.Fun_0_2)(t$141801)));
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        return t$141802;
    }
    
    
    //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    public static <$T, $U>$U reduce__0$1x10$util$RailUtils$$T$2__1$1x10$util$RailUtils$$U$3x10$util$RailUtils$$T$3x10$util$RailUtils$$U$2__2x10$util$RailUtils$$U$G(final x10.rtt.Type $T, final x10.rtt.Type $U, final x10.core.Rail<$T> src, final x10.core.fun.Fun_0_2<$U,$T,$U> op, final $U unit) {
        
        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        $U accum = (($U)(unit));
        
        //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final x10.core.Rail rail$141860 = ((x10.core.Rail)(src));
        
        //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final long i$70678max$141861 = ((x10.core.Rail<$T>)rail$141860).size;
        
        //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        long i$141857 = 0L;
        
        //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        for (;
             true;
             ) {
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$141858 = i$141857;
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final boolean t$141859 = ((t$141858) < (((long)(i$70678max$141861))));
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            if (!(t$141859)) {
                
                //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                break;
            }
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long i$141854 = i$141857;
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final $U t$141851 = (($U)(accum));
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final $T t$141852 = (($T)(((x10.core.Rail<$T>)src).$apply$G((long)(i$141854))));
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final $U t$141853 = (($U)((($U)
                                        ((x10.core.fun.Fun_0_2<$U,$T,$U>)op).$apply(t$141851, $U, t$141852, $T))));
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            accum = (($U)(t$141853));
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$141855 = i$141857;
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$141856 = ((t$141855) + (((long)(1L))));
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            i$141857 = t$141856;
        }
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final $U t$141811 = (($U)(accum));
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        return t$141811;
    }
    
    
    //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    public static <$T, $U>x10.core.Rail map__0$1x10$util$RailUtils$$T$2__1$1x10$util$RailUtils$$U$2__2$1x10$util$RailUtils$$T$3x10$util$RailUtils$$U$2(final x10.rtt.Type $T, final x10.rtt.Type $U, final x10.core.Rail<$T> src, final x10.core.Rail<$U> dst, final x10.core.fun.Fun_0_1<$T,$U> op) {
        
        //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final x10.core.Rail rail$141870 = ((x10.core.Rail)(src));
        
        //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final long i$70697max$141871 = ((x10.core.Rail<$T>)rail$141870).size;
        
        //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        long i$141867 = 0L;
        
        //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        for (;
             true;
             ) {
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$141868 = i$141867;
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final boolean t$141869 = ((t$141868) < (((long)(i$70697max$141871))));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            if (!(t$141869)) {
                
                //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                break;
            }
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long i$141864 = i$141867;
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final $T t$141862 = (($T)(((x10.core.Rail<$T>)src).$apply$G((long)(i$141864))));
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final $U t$141863 = (($U)((($U)
                                        ((x10.core.fun.Fun_0_1<$T,$U>)op).$apply(t$141862, $T))));
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            ((x10.core.Rail<$U>)dst).$set__1x10$lang$Rail$$T$G((long)(i$141864), (($U)(t$141863)));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$141865 = i$141867;
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$141866 = ((t$141865) + (((long)(1L))));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            i$141867 = t$141866;
        }
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        return dst;
    }
    
    
    //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    public static <$S, $T, $U>x10.core.Rail map__0$1x10$util$RailUtils$$S$2__1$1x10$util$RailUtils$$T$2__2$1x10$util$RailUtils$$U$2__3$1x10$util$RailUtils$$S$3x10$util$RailUtils$$T$3x10$util$RailUtils$$U$2(final x10.rtt.Type $S, final x10.rtt.Type $T, final x10.rtt.Type $U, final x10.core.Rail<$S> src1, final x10.core.Rail<$T> src2, final x10.core.Rail<$U> dst, final x10.core.fun.Fun_0_2<$S,$T,$U> op) {
        
        //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final x10.core.Rail rail$141881 = ((x10.core.Rail)(src1));
        
        //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        final long i$70716max$141882 = ((x10.core.Rail<$S>)rail$141881).size;
        
        //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        long i$141878 = 0L;
        
        //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        for (;
             true;
             ) {
            
            //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$141879 = i$141878;
            
            //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final boolean t$141880 = ((t$141879) < (((long)(i$70716max$141882))));
            
            //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            if (!(t$141880)) {
                
                //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                break;
            }
            
            //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long i$141875 = i$141878;
            
            //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final $S t$141872 = (($S)(((x10.core.Rail<$S>)src1).$apply$G((long)(i$141875))));
            
            //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final $T t$141873 = (($T)(((x10.core.Rail<$T>)src2).$apply$G((long)(i$141875))));
            
            //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final $U t$141874 = (($U)((($U)
                                        ((x10.core.fun.Fun_0_2<$S,$T,$U>)op).$apply(t$141872, $S, t$141873, $T))));
            
            //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            ((x10.core.Rail<$U>)dst).$set__1x10$lang$Rail$$T$G((long)(i$141875), (($U)(t$141874)));
            
            //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$141876 = i$141878;
            
            //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final long t$141877 = ((t$141876) + (((long)(1L))));
            
            //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            i$141878 = t$141877;
        }
        
        //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        return dst;
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    final public x10.util.RailUtils x10$util$RailUtils$$this$x10$util$RailUtils() {
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        return x10.util.RailUtils.this;
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    // creation method for java code (1-phase java constructor)
    public RailUtils() {
        this((java.lang.System[]) null);
        x10$util$RailUtils$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.util.RailUtils x10$util$RailUtils$$init$S() {
         {
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final x10.util.RailUtils this$141734 = this;
        }
        return this;
    }
    
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    final public void __fieldInitializers_x10_util_RailUtils() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$307<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_2, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$307> $RTT = 
            x10.rtt.StaticFunType.<$Closure$307> make($Closure$307.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_2.$RTT, x10.rtt.UnresolvedType.PARAM(0), x10.rtt.UnresolvedType.PARAM(0), x10.rtt.Types.INT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.RailUtils.$Closure$307<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.RailUtils.$Closure$307 $_obj = new x10.util.RailUtils.$Closure$307((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            
        }
        
        // constructor just for allocation
        public $Closure$307(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.util.RailUtils.$Closure$307.$initParams(this, $T);
            
        }
        
        // dispatcher for method abstract public (Z1,Z2)=>U.operator()(a1:Z1, a2:Z2):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return x10.core.Int.$box($apply__0x10$util$RailUtils$$Closure$307$$T__1x10$util$RailUtils$$Closure$307$$T$O(($T)a1, ($T)a2));
            
        }
        
        // dispatcher for method abstract public (Z1,Z2)=>U.operator()(a1:Z1, a2:Z2):U
        public int $apply$I(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return $apply__0x10$util$RailUtils$$Closure$307$$T__1x10$util$RailUtils$$Closure$307$$T$O(($T)a1, ($T)a2);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$307 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        
    
        
        public int $apply__0x10$util$RailUtils$$Closure$307$$T__1x10$util$RailUtils$$Closure$307$$T$O(final $T x$141832, final $T y$141833) {
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final int t$141834 = ((java.lang.Comparable<$T>)(x$141832)).compareTo(y$141833);
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            return t$141834;
        }
        
        public $Closure$307(final x10.rtt.Type $T) {
            x10.util.RailUtils.$Closure$307.$initParams(this, $T);
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$308<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_2, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$308> $RTT = 
            x10.rtt.StaticFunType.<$Closure$308> make($Closure$308.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_2.$RTT, x10.rtt.UnresolvedType.PARAM(0), x10.rtt.UnresolvedType.PARAM(0), x10.rtt.Types.INT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.RailUtils.$Closure$308<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.RailUtils.$Closure$308 $_obj = new x10.util.RailUtils.$Closure$308((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            
        }
        
        // constructor just for allocation
        public $Closure$308(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.util.RailUtils.$Closure$308.$initParams(this, $T);
            
        }
        
        // dispatcher for method abstract public (Z1,Z2)=>U.operator()(a1:Z1, a2:Z2):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return x10.core.Int.$box($apply__0x10$util$RailUtils$$Closure$308$$T__1x10$util$RailUtils$$Closure$308$$T$O(($T)a1, ($T)a2));
            
        }
        
        // dispatcher for method abstract public (Z1,Z2)=>U.operator()(a1:Z1, a2:Z2):U
        public int $apply$I(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return $apply__0x10$util$RailUtils$$Closure$308$$T__1x10$util$RailUtils$$Closure$308$$T$O(($T)a1, ($T)a2);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$308 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        
    
        
        public int $apply__0x10$util$RailUtils$$Closure$308$$T__1x10$util$RailUtils$$Closure$308$$T$O(final $T x, final $T y) {
            
            //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final int t$141775 = ((java.lang.Comparable<$T>)(x)).compareTo(y);
            
            //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            return t$141775;
        }
        
        public $Closure$308(final x10.rtt.Type $T) {
            x10.util.RailUtils.$Closure$308.$initParams(this, $T);
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$309<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_2, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$309> $RTT = 
            x10.rtt.StaticFunType.<$Closure$309> make($Closure$309.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_2.$RTT, x10.rtt.UnresolvedType.PARAM(0), x10.rtt.UnresolvedType.PARAM(0), x10.rtt.Types.INT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.RailUtils.$Closure$309<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.RailUtils.$Closure$309 $_obj = new x10.util.RailUtils.$Closure$309((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            
        }
        
        // constructor just for allocation
        public $Closure$309(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.util.RailUtils.$Closure$309.$initParams(this, $T);
            
        }
        
        // dispatcher for method abstract public (Z1,Z2)=>U.operator()(a1:Z1, a2:Z2):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return x10.core.Int.$box($apply__0x10$util$RailUtils$$Closure$309$$T__1x10$util$RailUtils$$Closure$309$$T$O(($T)a1, ($T)a2));
            
        }
        
        // dispatcher for method abstract public (Z1,Z2)=>U.operator()(a1:Z1, a2:Z2):U
        public int $apply$I(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return $apply__0x10$util$RailUtils$$Closure$309$$T__1x10$util$RailUtils$$Closure$309$$T$O(($T)a1, ($T)a2);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$309 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        
    
        
        public int $apply__0x10$util$RailUtils$$Closure$309$$T__1x10$util$RailUtils$$Closure$309$$T$O(final $T x, final $T y) {
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            final int t$141799 = ((java.lang.Comparable<$T>)(x)).compareTo(y);
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            return t$141799;
        }
        
        public $Closure$309(final x10.rtt.Type $T) {
            x10.util.RailUtils.$Closure$309.$initParams(this, $T);
             {
                
            }
        }
        
    }
    
}

