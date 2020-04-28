package x10.regionarray;


@x10.runtime.impl.java.X10Generated
public class PolyRow extends x10.regionarray.ValRow implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<PolyRow> $RTT = 
        x10.rtt.NamedType.<PolyRow> make("x10.regionarray.PolyRow",
                                         PolyRow.class,
                                         new x10.rtt.Type[] {
                                             x10.regionarray.ValRow.$RTT
                                         });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.PolyRow $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.ValRow.$_deserialize_body($_obj, $deserializer);
        $_obj.rank = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.PolyRow $_obj = new x10.regionarray.PolyRow((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.rank);
        
    }
    
    // constructor just for allocation
    public PolyRow(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    // synthetic type for parameter mangling
    public static final class __0$1x10$lang$Int$2 {}
    // synthetic type for parameter mangling
    public static final class __1$1x10$lang$Int$3x10$lang$Int$2 {}
    
    // properties
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    public long rank;
    

    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    // creation method for java code (1-phase java constructor)
    public PolyRow(final x10.core.Rail<x10.core.Int> as_, __0$1x10$lang$Int$2 $dummy) {
        this((java.lang.System[]) null);
        x10$regionarray$PolyRow$$init$S(as_, (x10.regionarray.PolyRow.__0$1x10$lang$Int$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.PolyRow x10$regionarray$PolyRow$$init$S(final x10.core.Rail<x10.core.Int> as_, __0$1x10$lang$Int$2 $dummy) {
         {
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final long t$131705 = ((x10.core.Rail<x10.core.Int>)as_).size;
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final long t$131706 = ((t$131705) - (((long)(1L))));
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            /*this.*/x10$regionarray$PolyRow$$init$S(((x10.core.Rail)(as_)), t$131706, (x10.regionarray.PolyRow.__0$1x10$lang$Int$2) null);
        }
        return this;
    }
    
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    // creation method for java code (1-phase java constructor)
    public PolyRow(final x10.core.Rail<x10.core.Int> as_, final long n, __0$1x10$lang$Int$2 $dummy) {
        this((java.lang.System[]) null);
        x10$regionarray$PolyRow$$init$S(as_, n, (x10.regionarray.PolyRow.__0$1x10$lang$Int$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.PolyRow x10$regionarray$PolyRow$$init$S(final x10.core.Rail<x10.core.Int> as_, final long n, __0$1x10$lang$Int$2 $dummy) {
         {
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            /*super.*/x10$regionarray$ValRow$$init$S(((x10.core.Rail)(as_)), (x10.regionarray.ValRow.__0$1x10$lang$Int$2) null);
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final long t$131857 = n;
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            this.rank = t$131857;
            
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final x10.regionarray.PolyRow this$131858 = this;
        }
        return this;
    }
    
    
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    // creation method for java code (1-phase java constructor)
    public PolyRow(final x10.lang.Point p, final int k) {
        this((java.lang.System[]) null);
        x10$regionarray$PolyRow$$init$S(p, k);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.PolyRow x10$regionarray$PolyRow$$init$S(final x10.lang.Point p, final int k) {
         {
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final long t$131860 = p.rank;
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final long t$131861 = ((t$131860) + (((long)(1L))));
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131862 = ((int)(long)(((long)(t$131861))));
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final x10.core.fun.Fun_0_1 t$131863 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.PolyRow.$Closure$231(p, k)));
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            /*super.*/x10$regionarray$ValRow$$init$S(t$131862, ((x10.core.fun.Fun_0_1)(t$131863)), (x10.regionarray.ValRow.__1$1x10$lang$Int$3x10$lang$Int$2) null);
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final long t$131859 = p.rank;
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            this.rank = t$131859;
            
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final x10.regionarray.PolyRow this$131872 = this;
        }
        return this;
    }
    
    
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    // creation method for java code (1-phase java constructor)
    public PolyRow(final int cols, final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int> init, __1$1x10$lang$Int$3x10$lang$Int$2 $dummy) {
        this((java.lang.System[]) null);
        x10$regionarray$PolyRow$$init$S(cols, init, (x10.regionarray.PolyRow.__1$1x10$lang$Int$3x10$lang$Int$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.PolyRow x10$regionarray$PolyRow$$init$S(final int cols, final x10.core.fun.Fun_0_1<x10.core.Int,x10.core.Int> init, __1$1x10$lang$Int$3x10$lang$Int$2 $dummy) {
         {
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            /*super.*/x10$regionarray$ValRow$$init$S(((int)(cols)), ((x10.core.fun.Fun_0_1)(init)), (x10.regionarray.ValRow.__1$1x10$lang$Int$3x10$lang$Int$2) null);
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int cols1 = ((cols) - (((int)(1))));
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final long t$131873 = ((long)(((int)(cols1))));
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            this.rank = t$131873;
            
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final x10.regionarray.PolyRow this$131874 = this;
        }
        return this;
    }
    
    
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    public static int compare$O(final x10.regionarray.Row a, final x10.regionarray.Row b) {
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        int i$131887 = 0;
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        for (;
             true;
             ) {
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131888 = i$131887;
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131889 = a.cols;
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final boolean t$131890 = ((t$131888) < (((int)(t$131889))));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            if (!(t$131890)) {
                
                //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                break;
            }
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131875 = i$131887;
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131876 = a.$apply$O((int)(t$131875));
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131877 = i$131887;
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131878 = b.$apply$O((int)(t$131877));
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final boolean t$131879 = ((t$131876) < (((int)(t$131878))));
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            if (t$131879) {
                
                //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                return -1;
            } else {
                
                //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                final int t$131880 = i$131887;
                
                //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                final int t$131881 = a.$apply$O((int)(t$131880));
                
                //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                final int t$131882 = i$131887;
                
                //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                final int t$131883 = b.$apply$O((int)(t$131882));
                
                //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                final boolean t$131884 = ((t$131881) > (((int)(t$131883))));
                
                //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                if (t$131884) {
                    
                    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                    return 1;
                }
            }
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131885 = i$131887;
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131886 = ((t$131885) + (((int)(1))));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            i$131887 = t$131886;
        }
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        return 0;
    }
    
    
    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    public boolean isParallel$O(final x10.regionarray.PolyRow that) {
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        int i$131898 = 0;
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        for (;
             true;
             ) {
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131899 = i$131898;
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131900 = cols;
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131901 = ((t$131900) - (((int)(1))));
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final boolean t$131902 = ((t$131899) < (((int)(t$131901))));
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            if (!(t$131902)) {
                
                //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                break;
            }
            
            //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131891 = i$131898;
            
            //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131892 = this.$apply$O((int)(t$131891));
            
            //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131893 = i$131898;
            
            //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131894 = that.$apply$O((int)(t$131893));
            
            //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final boolean t$131895 = ((int) t$131892) != ((int) t$131894);
            
            //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            if (t$131895) {
                
                //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                return false;
            }
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131896 = i$131898;
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131897 = ((t$131896) + (((int)(1))));
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            i$131898 = t$131897;
        }
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        return true;
    }
    
    
    //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    public boolean isRect$O() {
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        boolean nz = false;
        
        //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        int i$131909 = 0;
        
        //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        for (;
             true;
             ) {
            
            //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131910 = i$131909;
            
            //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131911 = cols;
            
            //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131912 = ((t$131911) - (((int)(1))));
            
            //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final boolean t$131913 = ((t$131910) < (((int)(t$131912))));
            
            //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            if (!(t$131913)) {
                
                //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                break;
            }
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131903 = i$131909;
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131904 = this.$apply$O((int)(t$131903));
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final boolean t$131905 = ((int) t$131904) != ((int) 0);
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            if (t$131905) {
                
                //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                final boolean t$131906 = nz;
                
                //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                if (t$131906) {
                    
                    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                    return false;
                }
                
                //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                nz = true;
            }
            
            //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131907 = i$131909;
            
            //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131908 = ((t$131907) + (((int)(1))));
            
            //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            i$131909 = t$131908;
        }
        
        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        return true;
    }
    
    
    //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    public boolean contains$O(final x10.lang.Point p) {
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        final long t$131760 = rank;
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        final int t$131761 = ((int)(long)(((long)(t$131760))));
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        int sum = this.$apply$O((int)(t$131761));
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        int i$131926 = 0;
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        for (;
             true;
             ) {
            
            //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131927 = i$131926;
            
            //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final long t$131928 = ((long)(((int)(t$131927))));
            
            //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final long t$131929 = rank;
            
            //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final boolean t$131930 = ((t$131928) < (((long)(t$131929))));
            
            //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            if (!(t$131930)) {
                
                //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                break;
            }
            
            //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131914 = sum;
            
            //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final long t$131915 = ((long)(((int)(t$131914))));
            
            //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131916 = i$131926;
            
            //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131917 = this.$apply$O((int)(t$131916));
            
            //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final long t$131918 = ((long)(((int)(t$131917))));
            
            //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131919 = i$131926;
            
            //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final long t$131920 = ((long)(((int)(t$131919))));
            
            //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final long t$131921 = p.$apply$O((long)(t$131920));
            
            //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final long t$131922 = ((t$131918) * (((long)(t$131921))));
            
            //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final long t$131923 = ((t$131915) + (((long)(t$131922))));
            
            //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            sum = ((int)(((long)(t$131923))));
            
            //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131924 = i$131926;
            
            //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131925 = ((t$131924) + (((int)(1))));
            
            //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            i$131926 = t$131925;
        }
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        final int t$131779 = sum;
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        final boolean t$131780 = ((t$131779) <= (((int)(0))));
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        return t$131780;
    }
    
    
    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    public x10.regionarray.PolyRow complement() {
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        final long t$131781 = rank;
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        final long t$131782 = ((long)(((int)(1))));
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        final long t$131795 = ((t$131781) + (((long)(t$131782))));
        
        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        final x10.core.fun.Fun_0_1 t$131796 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.PolyRow.$Closure$232(this, this.rank)));
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        final x10.core.Rail as_ = ((x10.core.Rail)(new x10.core.Rail<x10.core.Int>(x10.rtt.Types.INT, t$131795, ((x10.core.fun.Fun_0_1)(t$131796)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
        
        //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        final x10.regionarray.PolyRow alloc$129521 = ((x10.regionarray.PolyRow)(new x10.regionarray.PolyRow((java.lang.System[]) null)));
        
        //#line 29 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        final x10.core.Rail as_$131703 = ((x10.core.Rail)(as_));
        
        //#line 29 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        final long t$131931 = ((x10.core.Rail<x10.core.Int>)as_$131703).size;
        
        //#line 29 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        final long t$131932 = ((t$131931) - (((long)(1L))));
        
        //#line 29 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        alloc$129521.x10$regionarray$PolyRow$$init$S(((x10.core.Rail)(as_$131703)), t$131932, (x10.regionarray.PolyRow.__0$1x10$lang$Int$2) null);
        
        //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        return alloc$129521;
    }
    
    
    //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    public void printEqn(final x10.io.Printer ps, final java.lang.String spc, final int row) {
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        int sgn = 0;
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        boolean first = true;
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        int i$131969 = 0;
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        for (;
             true;
             ) {
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131970 = i$131969;
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final long t$131971 = ((long)(((int)(t$131970))));
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131972 = cols;
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final long t$131973 = ((long)(((int)(t$131972))));
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final long t$131974 = ((t$131973) - (((long)(1L))));
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final boolean t$131975 = ((t$131971) < (((long)(t$131974))));
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            if (!(t$131975)) {
                
                //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                break;
            }
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131933 = sgn;
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final boolean t$131934 = ((int) t$131933) == ((int) 0);
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            if (t$131934) {
                
                //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                final int t$131935 = i$131969;
                
                //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                final int t$131936 = this.$apply$O((int)(t$131935));
                
                //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                final boolean t$131937 = ((t$131936) < (((int)(0))));
                
                //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                if (t$131937) {
                    
                    //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                    sgn = -1;
                } else {
                    
                    //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                    final int t$131938 = i$131969;
                    
                    //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                    final int t$131939 = this.$apply$O((int)(t$131938));
                    
                    //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                    final boolean t$131940 = ((t$131939) > (((int)(0))));
                    
                    //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                    if (t$131940) {
                        
                        //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                        sgn = 1;
                    }
                }
            }
            
            //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131941 = sgn;
            
            //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131942 = i$131969;
            
            //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131943 = this.$apply$O((int)(t$131942));
            
            //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int c$131944 = ((t$131941) * (((int)(t$131943))));
            
            //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final boolean t$131945 = ((int) c$131944) == ((int) 1);
            
            //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            if (t$131945) {
                
                //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                final boolean t$131946 = first;
                
                //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                if (t$131946) {
                    
                    //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                    final int t$131947 = i$131969;
                    
                    //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                    final java.lang.String t$131948 = (("x") + ((x10.core.Int.$box(t$131947))));
                    
                    //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                    ps.print(((java.lang.String)(t$131948)));
                } else {
                    
                    //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                    final int t$131949 = i$131969;
                    
                    //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                    final java.lang.String t$131950 = (("+x") + ((x10.core.Int.$box(t$131949))));
                    
                    //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                    ps.print(((java.lang.String)(t$131950)));
                }
            } else {
                
                //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                final boolean t$131951 = ((int) c$131944) == ((int) -1);
                
                //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                if (t$131951) {
                    
                    //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                    final int t$131952 = i$131969;
                    
                    //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                    final java.lang.String t$131953 = (("-x") + ((x10.core.Int.$box(t$131952))));
                    
                    //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                    ps.print(((java.lang.String)(t$131953)));
                } else {
                    
                    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                    final boolean t$131954 = ((int) c$131944) != ((int) 0);
                    
                    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                    if (t$131954) {
                        
                        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                        final long t$131955 = ((long)(((int)(c$131944))));
                        
                        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                        boolean t$131956 = ((t$131955) >= (((long)(0L))));
                        
                        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                        if (t$131956) {
                            
                            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                            final boolean t$131957 = first;
                            
                            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                            t$131956 = !(t$131957);
                        }
                        
                        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                        final boolean t$131958 = t$131956;
                        
                        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                        java.lang.String t$131959 =  null;
                        
                        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                        if (t$131958) {
                            
                            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                            t$131959 = "+";
                        } else {
                            
                            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                            t$131959 = "";
                        }
                        
                        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                        final java.lang.String t$131960 = t$131959;
                        
                        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                        final java.lang.String t$131961 = ((t$131960) + ((x10.core.Int.$box(c$131944))));
                        
                        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                        final java.lang.String t$131962 = ((t$131961) + ("*x"));
                        
                        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                        final int t$131963 = i$131969;
                        
                        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                        final java.lang.String t$131964 = ((t$131962) + ((x10.core.Int.$box(t$131963))));
                        
                        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                        final java.lang.String t$131965 = ((t$131964) + (" "));
                        
                        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                        ps.print(((java.lang.String)(t$131965)));
                    }
                }
            }
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final boolean t$131966 = ((int) c$131944) != ((int) 0);
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            if (t$131966) {
                
                //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                first = false;
            }
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131967 = i$131969;
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131968 = ((t$131967) + (((int)(1))));
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            i$131969 = t$131968;
        }
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        final boolean t$131841 = first;
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        if (t$131841) {
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            ps.print(((java.lang.String)("0")));
        }
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        final int t$131842 = sgn;
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        final boolean t$131856 = ((t$131842) > (((int)(0))));
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        if (t$131856) {
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final java.lang.String t$131843 = ((spc) + ("<="));
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final java.lang.String t$131847 = ((t$131843) + (spc));
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131844 = cols;
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131845 = ((t$131844) - (((int)(1))));
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131846 = this.$apply$O((int)(t$131845));
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131848 = (-(t$131846));
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final java.lang.String t$131849 = ((t$131847) + ((x10.core.Int.$box(t$131848))));
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            ps.print(((java.lang.String)(t$131849)));
        } else {
            
            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final java.lang.String t$131850 = ((spc) + (">="));
            
            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final java.lang.String t$131853 = ((t$131850) + (spc));
            
            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131851 = cols;
            
            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131852 = ((t$131851) - (((int)(1))));
            
            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131854 = this.$apply$O((int)(t$131852));
            
            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final java.lang.String t$131855 = ((t$131853) + ((x10.core.Int.$box(t$131854))));
            
            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            ps.print(((java.lang.String)(t$131855)));
        }
    }
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    final public x10.regionarray.PolyRow x10$regionarray$PolyRow$$this$x10$regionarray$PolyRow() {
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
        return x10.regionarray.PolyRow.this;
    }
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
    final public void __fieldInitializers_x10_regionarray_PolyRow() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$231 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$231> $RTT = 
            x10.rtt.StaticFunType.<$Closure$231> make($Closure$231.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.INT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.PolyRow.$Closure$231 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.p = $deserializer.readObject();
            $_obj.k = $deserializer.readInt();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.PolyRow.$Closure$231 $_obj = new x10.regionarray.PolyRow.$Closure$231((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.p);
            $serializer.write(this.k);
            
        }
        
        // constructor just for allocation
        public $Closure$231(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Int.$box($apply$O(x10.core.Int.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public int $apply$I(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Int.$unbox(a1));
            
        }
        
        
    
        
        public int $apply$O(final int i$131864) {
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final long t$131865 = ((long)(((int)(i$131864))));
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final long t$131866 = this.p.rank;
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final boolean t$131867 = ((t$131865) < (((long)(t$131866))));
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            int t$131868 =  0;
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            if (t$131867) {
                
                //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                final long t$131869 = ((long)(((int)(i$131864))));
                
                //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                final long t$131870 = this.p.$apply$O((long)(t$131869));
                
                //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                t$131868 = ((int)(long)(((long)(t$131870))));
            } else {
                
                //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                t$131868 = this.k;
            }
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131871 = t$131868;
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            return t$131871;
        }
        
        public x10.lang.Point p;
        public int k;
        
        public $Closure$231(final x10.lang.Point p, final int k) {
             {
                this.p = ((x10.lang.Point)(p));
                this.k = k;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$232 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$232> $RTT = 
            x10.rtt.StaticFunType.<$Closure$232> make($Closure$232.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.INT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.PolyRow.$Closure$232 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.rank = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.PolyRow.$Closure$232 $_obj = new x10.regionarray.PolyRow.$Closure$232((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.rank);
            
        }
        
        // constructor just for allocation
        public $Closure$232(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Int.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public int $apply$I(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public int $apply$O(final long i) {
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131783 = ((int)(long)(((long)(i))));
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final long t$131784 = ((long)(((int)(t$131783))));
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final long t$131785 = this.rank;
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final boolean t$131792 = ((t$131784) < (((long)(t$131785))));
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            int t$131793 =  0;
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            if (t$131792) {
                
                //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                final int t$131786 = ((int)(long)(((long)(i))));
                
                //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                final int t$131787 = this.out$$.$apply$O((int)(t$131786));
                
                //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                t$131793 = (-(t$131787));
            } else {
                
                //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                final long t$131788 = this.rank;
                
                //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                final int t$131789 = ((int)(long)(((long)(t$131788))));
                
                //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                final int t$131790 = this.out$$.$apply$O((int)(t$131789));
                
                //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                final int t$131791 = (-(t$131790));
                
                //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                t$131793 = ((t$131791) + (((int)(1))));
            }
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final int t$131794 = t$131793;
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            return t$131794;
        }
        
        public x10.regionarray.PolyRow out$$;
        public long rank;
        
        public $Closure$232(final x10.regionarray.PolyRow out$$, final long rank) {
             {
                this.out$$ = out$$;
                this.rank = rank;
            }
        }
        
    }
    
}


