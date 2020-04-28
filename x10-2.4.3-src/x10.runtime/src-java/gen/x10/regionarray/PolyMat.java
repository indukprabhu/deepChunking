package x10.regionarray;


@x10.runtime.impl.java.X10Generated
public class PolyMat extends x10.regionarray.Mat<x10.regionarray.PolyRow> implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<PolyMat> $RTT = 
        x10.rtt.NamedType.<PolyMat> make("x10.regionarray.PolyMat",
                                         PolyMat.class,
                                         new x10.rtt.Type[] {
                                             x10.rtt.ParameterizedType.make(x10.regionarray.Mat.$RTT, x10.regionarray.PolyRow.$RTT)
                                         });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.PolyMat $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.Mat.$_deserialize_body($_obj, $deserializer);
        $_obj.isSimplified = $deserializer.readBoolean();
        $_obj.rank = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.PolyMat $_obj = new x10.regionarray.PolyMat((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.isSimplified);
        $serializer.write(this.rank);
        
    }
    
    // constructor just for allocation
    public PolyMat(final java.lang.System[] $dummy) {
        super($dummy, x10.regionarray.PolyRow.$RTT);
        
    }
    
    // bridge for method public x10.regionarray.Mat[T].operator()(i:x10.lang.Int){}:T
    public x10.regionarray.PolyRow $apply(int a1){
        return super.$apply$G((a1));
    }
    
    // synthetic type for parameter mangling
    public static final class __2$1x10$lang$Int$3x10$lang$Int$3x10$lang$Int$2 {}
    
    // properties
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    public long rank;
    

    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    public boolean isSimplified;
    
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    // creation method for java code (1-phase java constructor)
    public PolyMat(final int rows, final int cols, final x10.core.fun.Fun_0_2<x10.core.Int,x10.core.Int,x10.core.Int> init, final boolean isSimplified, __2$1x10$lang$Int$3x10$lang$Int$3x10$lang$Int$2 $dummy) {
        this((java.lang.System[]) null);
        x10$regionarray$PolyMat$$init$S(rows, cols, init, isSimplified, (x10.regionarray.PolyMat.__2$1x10$lang$Int$3x10$lang$Int$3x10$lang$Int$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.PolyMat x10$regionarray$PolyMat$$init$S(final int rows, final int cols, final x10.core.fun.Fun_0_2<x10.core.Int,x10.core.Int,x10.core.Int> init, final boolean isSimplified, __2$1x10$lang$Int$3x10$lang$Int$3x10$lang$Int$2 $dummy) {
         {
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final x10.regionarray.Mat this$129525 = ((x10.regionarray.Mat)(this));
            
            //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            final int rows$129522 = rows;
            
            //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            final int cols$129523 = cols;
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final long t$129628 = ((long)(((int)(rows))));
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final x10.core.fun.Fun_0_1 t$129629 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.PolyMat.$Closure$222(init, cols, (x10.regionarray.PolyMat.$Closure$222.__0$1x10$lang$Int$3x10$lang$Int$3x10$lang$Int$2) null)));
            
            //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            final x10.core.Rail mat$129524 = ((x10.core.Rail)(new x10.core.Rail<x10.regionarray.PolyRow>(x10.regionarray.PolyRow.$RTT, t$129628, ((x10.core.fun.Fun_0_1)(t$129629)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
            
            //#line 22 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            ((x10.regionarray.Mat<x10.regionarray.PolyRow>)this$129525).rows = rows$129522;
            
            //#line 22 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            ((x10.regionarray.Mat<x10.regionarray.PolyRow>)this$129525).cols = cols$129523;
            {
                
            }
            
            //#line 23 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            ((x10.regionarray.Mat<x10.regionarray.PolyRow>)this$129525).mat = ((x10.core.Rail)(mat$129524));
            
            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final int cols1 = ((cols) - (((int)(1))));
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final long t$129844 = ((long)(((int)(cols1))));
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            this.rank = t$129844;
            
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final x10.regionarray.PolyMat this$129845 = this;
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            this.isSimplified = isSimplified;
        }
        return this;
    }
    
    
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    public x10.regionarray.PolyMat simplifyParallel() {
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final int t$129631 = rows;
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final boolean t$129632 = ((int) t$129631) == ((int) 0);
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        if (t$129632) {
            
            //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            return this;
        }
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final x10.regionarray.PolyMatBuilder pmb = ((x10.regionarray.PolyMatBuilder)(new x10.regionarray.PolyMatBuilder((java.lang.System[]) null)));
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final long t$129853 = rank;
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        pmb.x10$regionarray$PolyMatBuilder$$init$S(((long)(t$129853)));
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        x10.regionarray.PolyRow last = null;
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final x10.lang.Iterator next$129854 = this.iterator();
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        for (;
             true;
             ) {
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final boolean t$129855 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)next$129854).hasNext$O();
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            if (!(t$129855)) {
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                break;
            }
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final x10.regionarray.PolyRow next$129846 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)next$129854).next$G();
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final x10.regionarray.PolyRow t$129847 = ((x10.regionarray.PolyRow)(last));
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            boolean t$129848 = ((t$129847) != (null));
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            if (t$129848) {
                
                //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final x10.regionarray.PolyRow t$129849 = ((x10.regionarray.PolyRow)(last));
                
                //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final boolean t$129850 = next$129846.isParallel$O(((x10.regionarray.PolyRow)(t$129849)));
                
                //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                t$129848 = !(t$129850);
            }
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final boolean t$129851 = t$129848;
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            if (t$129851) {
                
                //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final x10.regionarray.PolyRow t$129852 = ((x10.regionarray.PolyRow)(last));
                
                //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                pmb.add(((x10.regionarray.Row)(t$129852)));
            }
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            last = ((x10.regionarray.PolyRow)(next$129846));
        }
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final x10.regionarray.PolyRow t$129642 = ((x10.regionarray.PolyRow)(last));
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        pmb.add(((x10.regionarray.Row)(t$129642)));
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final x10.regionarray.PolyMat t$129643 = ((x10.regionarray.PolyMat)(pmb.toSortedPolyMat((boolean)(false))));
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        return t$129643;
    }
    
    
    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    public x10.regionarray.PolyMat simplifyAll() {
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final boolean t$129644 = isSimplified;
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        if (t$129644) {
            
            //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            return this;
        }
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final x10.regionarray.PolyMatBuilder pmb = ((x10.regionarray.PolyMatBuilder)(new x10.regionarray.PolyMatBuilder((java.lang.System[]) null)));
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final long t$129883 = rank;
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        pmb.x10$regionarray$PolyMatBuilder$$init$S(((long)(t$129883)));
        
        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final int t$129646 = rows;
        
        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final long t$129647 = ((long)(((int)(t$129646))));
        
        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final x10.core.Rail removed = ((x10.core.Rail)(new x10.core.Rail<x10.core.Boolean>(x10.rtt.Types.BOOLEAN, t$129647, (x10.core.Boolean.$box(false)), (x10.core.Rail.__1x10$lang$Rail$$T) null)));
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        int i$129884 = 0;
        {
            
            //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final boolean[] removed$value$130036 = ((boolean[])removed.value);
            
            //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            for (;
                 true;
                 ) {
                
                //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final int t$129885 = i$129884;
                
                //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final int t$129886 = rows;
                
                //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final boolean t$129887 = ((t$129885) < (((int)(t$129886))));
                
                //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                if (!(t$129887)) {
                    
                    //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    break;
                }
                
                //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final int t$129873 = i$129884;
                
                //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final x10.regionarray.PolyRow r$129874 = this.$apply$G((int)(t$129873));
                
                //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final x10.regionarray.PolyMatBuilder trial$129875 = ((x10.regionarray.PolyMatBuilder)(new x10.regionarray.PolyMatBuilder((java.lang.System[]) null)));
                
                //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final long t$129868 = rank;
                
                //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                trial$129875.x10$regionarray$PolyMatBuilder$$init$S(((long)(t$129868)));
                
                //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                int j$129869 = 0;
                {
                    
                    //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        final int t$129870 = j$129869;
                        
                        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        final int t$129871 = rows;
                        
                        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        final boolean t$129872 = ((t$129870) < (((int)(t$129871))));
                        
                        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        if (!(t$129872)) {
                            
                            //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                            break;
                        }
                        
                        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        final int t$129856 = j$129869;
                        
                        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        final long t$129857 = ((long)(((int)(t$129856))));
                        
                        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        final boolean t$129858 = ((boolean)removed$value$130036[(int)t$129857]);
                        
                        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        final boolean t$129859 = !(t$129858);
                        
                        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        if (t$129859) {
                            
                            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                            final int t$129860 = i$129884;
                            
                            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                            final int t$129861 = j$129869;
                            
                            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                            final boolean t$129862 = ((int) t$129860) == ((int) t$129861);
                            
                            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                            x10.regionarray.PolyRow t$129863 =  null;
                            
                            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                            if (t$129862) {
                                
                                //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                t$129863 = r$129874.complement();
                            } else {
                                
                                //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                final int t$129864 = j$129869;
                                
                                //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                t$129863 = this.$apply$G((int)(t$129864));
                            }
                            
                            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                            final x10.regionarray.PolyRow t$129865 = t$129863;
                            
                            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                            trial$129875.add(((x10.regionarray.Row)(t$129865)));
                        }
                        
                        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        final int t$129866 = j$129869;
                        
                        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        final int t$129867 = ((t$129866) + (((int)(1))));
                        
                        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        j$129869 = t$129867;
                    }
                }
                
                //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final x10.regionarray.PolyMat t$129876 = ((x10.regionarray.PolyMat)(trial$129875.toSortedPolyMat((boolean)(false))));
                
                //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final boolean t$129877 = t$129876.isEmpty$O();
                
                //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final boolean t$129878 = !(t$129877);
                
                //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                if (t$129878) {
                    
                    //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    pmb.add(((x10.regionarray.Row)(r$129874)));
                } else {
                    
                    //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    final int t$129879 = i$129884;
                    
                    //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    final long t$129880 = ((long)(((int)(t$129879))));
                    
                    //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    removed$value$130036[(int)t$129880]=true;
                }
                
                //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final int t$129881 = i$129884;
                
                //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final int t$129882 = ((t$129881) + (((int)(1))));
                
                //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                i$129884 = t$129882;
            }
        }
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final x10.regionarray.PolyMat t$129677 = ((x10.regionarray.PolyMat)(pmb.toSortedPolyMat((boolean)(true))));
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        return t$129677;
    }
    
    
    //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    public x10.regionarray.PolyMat eliminate(final int k, final boolean simplifyDegenerate) {
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final x10.regionarray.PolyMatBuilder pmb = ((x10.regionarray.PolyMatBuilder)(new x10.regionarray.PolyMatBuilder((java.lang.System[]) null)));
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final long t$129961 = rank;
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        pmb.x10$regionarray$PolyMatBuilder$$init$S(((long)(t$129961)));
        
        //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final x10.lang.Iterator ir$129962 = this.iterator();
        
        //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        for (;
             true;
             ) {
            
            //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final boolean t$129963 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)ir$129962).hasNext$O();
            
            //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            if (!(t$129963)) {
                
                //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                break;
            }
            
            //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final x10.regionarray.PolyRow ir$129956 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)ir$129962).next$G();
            
            //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final int ia$129957 = ir$129956.$apply$O((int)(k));
            
            //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final boolean t$129958 = ((int) ia$129957) == ((int) 0);
            
            //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            if (t$129958) {
                
                //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                pmb.add(((x10.regionarray.Row)(ir$129956)));
            } else {
                
                //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final x10.lang.Iterator jr$129959 = this.iterator();
                
                //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    final boolean t$129960 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)jr$129959).hasNext$O();
                    
                    //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    if (!(t$129960)) {
                        
                        //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        break;
                    }
                    
                    //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    final x10.regionarray.PolyRow jr$129922 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)jr$129959).next$G();
                    
                    //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    final int ja$129923 = jr$129922.$apply$O((int)(k));
                    
                    //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    final long t$129924 = rank;
                    
                    //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    final long t$129925 = ((long)(((int)(1))));
                    
                    //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    final long t$129926 = ((t$129924) + (((long)(t$129925))));
                    
                    //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    final x10.core.Rail as_$129927 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Int>(x10.rtt.Types.INT, t$129926)));
                    
                    //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    boolean t$129928 = ((ia$129957) > (((int)(0))));
                    
                    //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    if (t$129928) {
                        
                        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        t$129928 = ((ja$129923) < (((int)(0))));
                    }
                    
                    //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    final boolean t$129929 = t$129928;
                    
                    //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    if (t$129929) {
                        
                        //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        int l$129930 = 0;
                        {
                            
                            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                            final int[] as_$129927$value$130037 = ((int[])as_$129927.value);
                            
                            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                            for (;
                                 true;
                                 ) {
                                
                                //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                final int t$129931 = l$129930;
                                
                                //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                final long t$129932 = ((long)(((int)(t$129931))));
                                
                                //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                final long t$129933 = rank;
                                
                                //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                final boolean t$129934 = ((t$129932) <= (((long)(t$129933))));
                                
                                //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                if (!(t$129934)) {
                                    
                                    //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                    break;
                                }
                                
                                //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                final int t$129888 = l$129930;
                                
                                //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                final long t$129889 = ((long)(((int)(t$129888))));
                                
                                //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                final int t$129890 = l$129930;
                                
                                //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                final int t$129891 = jr$129922.$apply$O((int)(t$129890));
                                
                                //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                final int t$129892 = ((ia$129957) * (((int)(t$129891))));
                                
                                //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                final int t$129893 = l$129930;
                                
                                //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                final int t$129894 = ir$129956.$apply$O((int)(t$129893));
                                
                                //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                final int t$129895 = ((ja$129923) * (((int)(t$129894))));
                                
                                //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                final int t$129896 = ((t$129892) - (((int)(t$129895))));
                                
                                //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                as_$129927$value$130037[(int)t$129889]=t$129896;
                                
                                //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                final int t$129897 = l$129930;
                                
                                //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                final int t$129898 = ((t$129897) + (((int)(1))));
                                
                                //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                l$129930 = t$129898;
                            }
                        }
                    } else {
                        
                        //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        boolean t$129935 = ((ia$129957) < (((int)(0))));
                        
                        //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        if (t$129935) {
                            
                            //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                            t$129935 = ((ja$129923) > (((int)(0))));
                        }
                        
                        //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        final boolean t$129936 = t$129935;
                        
                        //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        if (t$129936) {
                            
                            //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                            int l$129937 = 0;
                            {
                                
                                //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                final int[] as_$129927$value$130038 = ((int[])as_$129927.value);
                                
                                //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                for (;
                                     true;
                                     ) {
                                    
                                    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                    final int t$129938 = l$129937;
                                    
                                    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                    final long t$129939 = ((long)(((int)(t$129938))));
                                    
                                    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                    final long t$129940 = rank;
                                    
                                    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                    final boolean t$129941 = ((t$129939) <= (((long)(t$129940))));
                                    
                                    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                    if (!(t$129941)) {
                                        
                                        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                        break;
                                    }
                                    
                                    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                    final int t$129899 = l$129937;
                                    
                                    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                    final long t$129900 = ((long)(((int)(t$129899))));
                                    
                                    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                    final int t$129901 = l$129937;
                                    
                                    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                    final int t$129902 = ir$129956.$apply$O((int)(t$129901));
                                    
                                    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                    final int t$129903 = ((ja$129923) * (((int)(t$129902))));
                                    
                                    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                    final int t$129904 = l$129937;
                                    
                                    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                    final int t$129905 = jr$129922.$apply$O((int)(t$129904));
                                    
                                    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                    final int t$129906 = ((ia$129957) * (((int)(t$129905))));
                                    
                                    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                    final int t$129907 = ((t$129903) - (((int)(t$129906))));
                                    
                                    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                    as_$129927$value$130038[(int)t$129900]=t$129907;
                                    
                                    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                    final int t$129908 = l$129937;
                                    
                                    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                    final int t$129909 = ((t$129908) + (((int)(1))));
                                    
                                    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                    l$129937 = t$129909;
                                }
                            }
                        }
                    }
                    
                    //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    long t$129942 =  0;
                    
                    //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    if (simplifyDegenerate) {
                        
                        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        t$129942 = rank;
                    } else {
                        
                        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        final long t$129943 = rank;
                        
                        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        final long t$129944 = ((long)(((int)(1))));
                        
                        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        t$129942 = ((t$129943) + (((long)(t$129944))));
                    }
                    
                    //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    final long lim$129945 = t$129942;
                    
                    //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    boolean degenerate$129946 = true;
                    
                    //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    int l$129918 = 0;
                    {
                        
                        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        final int[] as_$129927$value$130039 = ((int[])as_$129927.value);
                        
                        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        for (;
                             true;
                             ) {
                            
                            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                            final int t$129919 = l$129918;
                            
                            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                            final long t$129920 = ((long)(((int)(t$129919))));
                            
                            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                            final boolean t$129921 = ((t$129920) < (((long)(lim$129945))));
                            
                            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                            if (!(t$129921)) {
                                
                                //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                break;
                            }
                            
                            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                            final int t$129910 = l$129918;
                            
                            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                            final long t$129911 = ((long)(((int)(t$129910))));
                            
                            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                            final int t$129912 = ((int)as_$129927$value$130039[(int)t$129911]);
                            
                            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                            final boolean t$129913 = ((int) t$129912) != ((int) 0);
                            
                            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                            if (t$129913) {
                                
                                //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                                degenerate$129946 = false;
                            }
                            
                            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                            final int t$129914 = l$129918;
                            
                            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                            final int t$129915 = ((t$129914) + (((int)(1))));
                            
                            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                            l$129918 = t$129915;
                        }
                    }
                    
                    //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    final boolean t$129947 = degenerate$129946;
                    
                    //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    final boolean t$129948 = !(t$129947);
                    
                    //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    if (t$129948) {
                        
                        //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        x10.regionarray.PolyRow r$129949 = new x10.regionarray.PolyRow((java.lang.System[]) null);
                        
                        //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        final long t$129950 = ((x10.core.Rail<x10.core.Int>)as_$129927).size;
                        
                        //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        final x10.core.fun.Fun_0_1 t$129951 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.PolyMat.$Closure$223(as_$129927, (x10.regionarray.PolyMat.$Closure$223.__0$1x10$lang$Int$2) null)));
                        
                        //#line 29 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                        final x10.core.Rail as_$129954 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Int>(x10.rtt.Types.INT, ((long)(t$129950)), ((x10.core.fun.Fun_0_1)(t$129951)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
                        
                        //#line 29 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                        final long t$129916 = ((x10.core.Rail<x10.core.Int>)as_$129954).size;
                        
                        //#line 29 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                        final long t$129917 = ((t$129916) - (((long)(1L))));
                        
                        //#line 29 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
                        r$129949.x10$regionarray$PolyRow$$init$S(((x10.core.Rail)(as_$129954)), t$129917, (x10.regionarray.PolyRow.__0$1x10$lang$Int$2) null);
                        
                        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        final x10.regionarray.PolyRow t$129955 = ((x10.regionarray.PolyRow)(r$129949));
                        
                        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                        pmb.add(((x10.regionarray.Row)(t$129955)));
                    }
                }
            }
        }
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final x10.regionarray.PolyMat t$129744 = ((x10.regionarray.PolyMat)(pmb.toSortedPolyMat((boolean)(false))));
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final x10.regionarray.PolyMat t$129745 = ((x10.regionarray.PolyMat)(t$129744.simplifyParallel()));
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        return t$129745;
    }
    
    
    //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    public boolean isRect$O() {
        
        //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final x10.lang.Iterator r$129967 = this.iterator();
        
        //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        for (;
             true;
             ) {
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final boolean t$129968 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)r$129967).hasNext$O();
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            if (!(t$129968)) {
                
                //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                break;
            }
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final x10.regionarray.PolyRow r$129964 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)r$129967).next$G();
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final boolean t$129965 = r$129964.isRect$O();
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final boolean t$129966 = !(t$129965);
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            if (t$129966) {
                
                //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                return false;
            }
        }
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        return true;
    }
    
    
    //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    public int rectMin$O(final int axis) {
        
        //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final x10.lang.Iterator r$129978 = this.iterator();
        
        //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        for (;
             true;
             ) {
            
            //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final boolean t$129979 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)r$129978).hasNext$O();
            
            //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            if (!(t$129979)) {
                
                //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                break;
            }
            
            //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final x10.regionarray.PolyRow r$129969 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)r$129978).next$G();
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final int a$129970 = r$129969.$apply$O((int)(axis));
            
            //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final long t$129971 = ((long)(((int)(a$129970))));
            
            //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final boolean t$129972 = ((t$129971) < (((long)(0L))));
            
            //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            if (t$129972) {
                
                //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final long t$129973 = rank;
                
                //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final int t$129974 = ((int)(long)(((long)(t$129973))));
                
                //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final int t$129975 = r$129969.$apply$O((int)(t$129974));
                
                //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final int t$129976 = (-(t$129975));
                
                //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final int t$129977 = ((t$129976) / (((int)(a$129970))));
                
                //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                return t$129977;
            }
        }
        
        //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final java.lang.String t$129759 = (("axis ") + ((x10.core.Int.$box(axis))));
        
        //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        java.lang.String msg = ((t$129759) + (" has no minimum"));
        
        //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final java.lang.String t$129760 = ((java.lang.String)(msg));
        
        //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final x10.regionarray.UnboundedRegionException t$129761 = ((x10.regionarray.UnboundedRegionException)(new x10.regionarray.UnboundedRegionException(t$129760)));
        
        //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        throw t$129761;
    }
    
    
    //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    public int rectMax$O(final int axis) {
        
        //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final x10.lang.Iterator r$129989 = this.iterator();
        
        //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        for (;
             true;
             ) {
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final boolean t$129990 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)r$129989).hasNext$O();
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            if (!(t$129990)) {
                
                //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                break;
            }
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final x10.regionarray.PolyRow r$129980 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)r$129989).next$G();
            
            //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final int a$129981 = r$129980.$apply$O((int)(axis));
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final long t$129982 = ((long)(((int)(a$129981))));
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final boolean t$129983 = ((t$129982) > (((long)(0L))));
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            if (t$129983) {
                
                //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final long t$129984 = rank;
                
                //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final int t$129985 = ((int)(long)(((long)(t$129984))));
                
                //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final int t$129986 = r$129980.$apply$O((int)(t$129985));
                
                //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final int t$129987 = (-(t$129986));
                
                //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final int t$129988 = ((t$129987) / (((int)(a$129981))));
                
                //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                return t$129988;
            }
        }
        
        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final java.lang.String t$129771 = (("axis ") + ((x10.core.Int.$box(axis))));
        
        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final java.lang.String msg = ((t$129771) + (" has no maximum"));
        
        //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final x10.regionarray.UnboundedRegionException t$129772 = ((x10.regionarray.UnboundedRegionException)(new x10.regionarray.UnboundedRegionException(((java.lang.String)(msg)))));
        
        //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        throw t$129772;
    }
    
    
    //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    public x10.core.Rail rectMin() {
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final long t$129775 = rank;
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final x10.core.fun.Fun_0_1 t$129776 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.PolyMat.$Closure$224(this)));
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final x10.core.Rail t$129777 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Int>(x10.rtt.Types.INT, ((long)(t$129775)), ((x10.core.fun.Fun_0_1)(t$129776)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        return t$129777;
    }
    
    
    //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    public x10.core.Rail rectMax() {
        
        //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final long t$129780 = rank;
        
        //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final x10.core.fun.Fun_0_1 t$129781 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.PolyMat.$Closure$225(this)));
        
        //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final x10.core.Rail t$129782 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Int>(x10.rtt.Types.INT, ((long)(t$129780)), ((x10.core.fun.Fun_0_1)(t$129781)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
        
        //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        return t$129782;
    }
    
    
    //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    public boolean isZeroBased$O() {
        
        //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final boolean t$129783 = this.isRect$O();
        
        //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final boolean t$129784 = !(t$129783);
        
        //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        if (t$129784) {
            
            //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            return false;
        }
        
        //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        try {{
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            int i = 0;
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            for (;
                 true;
                 ) {
                
                //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final int t$129786 = i;
                
                //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final long t$129787 = ((long)(((int)(t$129786))));
                
                //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final long t$129788 = rank;
                
                //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final boolean t$129794 = ((t$129787) < (((long)(t$129788))));
                
                //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                if (!(t$129794)) {
                    
                    //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    break;
                }
                
                //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final int t$129991 = i;
                
                //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final int t$129992 = this.rectMin$O((int)(t$129991));
                
                //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final boolean t$129993 = ((int) t$129992) != ((int) 0);
                
                //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                if (t$129993) {
                    
                    //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    return false;
                }
                
                //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final int t$129994 = i;
                
                //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final int t$129995 = ((t$129994) + (((int)(1))));
                
                //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                i = t$129995;
            }
        }}catch (final x10.regionarray.UnboundedRegionException e) {
            
            //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            return false;
        }
        
        //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        return true;
    }
    
    
    //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    public boolean isBounded$O() {
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        try {{
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            int i = 0;
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            for (;
                 true;
                 ) {
                
                //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final int t$129796 = i;
                
                //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final long t$129797 = ((long)(((int)(t$129796))));
                
                //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final long t$129798 = rank;
                
                //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final boolean t$129803 = ((t$129797) < (((long)(t$129798))));
                
                //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                if (!(t$129803)) {
                    
                    //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                    break;
                }
                
                //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final int t$129996 = i;
                
                //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                this.rectMin$O((int)(t$129996));
                
                //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final int t$129997 = i;
                
                //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                this.rectMax$O((int)(t$129997));
                
                //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final int t$129998 = i;
                
                //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final int t$129999 = ((t$129998) + (((int)(1))));
                
                //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                i = t$129999;
            }
        }}catch (final x10.regionarray.UnboundedRegionException e) {
            
            //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            return false;
        }
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        return true;
    }
    
    
    //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    public boolean isEmpty$O() {
        
        //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        x10.regionarray.PolyMat pm = this;
        
        //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        int i$130011 = 0;
        
        //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        for (;
             true;
             ) {
            
            //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final int t$130012 = i$130011;
            
            //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final long t$130013 = ((long)(((int)(t$130012))));
            
            //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final long t$130014 = rank;
            
            //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final boolean t$130015 = ((t$130013) < (((long)(t$130014))));
            
            //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            if (!(t$130015)) {
                
                //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                break;
            }
            
            //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final x10.regionarray.PolyMat t$130000 = ((x10.regionarray.PolyMat)(pm));
            
            //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final int t$130001 = i$130011;
            
            //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final x10.regionarray.PolyMat t$130002 = ((x10.regionarray.PolyMat)(t$130000.eliminate((int)(t$130001), (boolean)(false))));
            
            //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            pm = ((x10.regionarray.PolyMat)(t$130002));
            
            //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final int t$130003 = i$130011;
            
            //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final int t$130004 = ((t$130003) + (((int)(1))));
            
            //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            i$130011 = t$130004;
        }
        
        //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final x10.regionarray.PolyMat t$130016 = ((x10.regionarray.PolyMat)(pm));
        
        //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final x10.lang.Iterator r$130017 = ((x10.regionarray.Mat<x10.regionarray.PolyRow>)t$130016).iterator();
        
        //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        for (;
             true;
             ) {
            
            //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final boolean t$130018 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)r$130017).hasNext$O();
            
            //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            if (!(t$130018)) {
                
                //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                break;
            }
            
            //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final x10.regionarray.PolyRow r$130005 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)r$130017).next$G();
            
            //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final long t$130006 = rank;
            
            //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final int t$130007 = ((int)(long)(((long)(t$130006))));
            
            //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final int t$130008 = r$130005.$apply$O((int)(t$130007));
            
            //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final long t$130009 = ((long)(((int)(t$130008))));
            
            //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final boolean t$130010 = ((t$130009) > (((long)(0L))));
            
            //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            if (t$130010) {
                
                //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                return true;
            }
        }
        
        //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        return false;
    }
    
    
    //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    public x10.regionarray.PolyMat $or(final x10.regionarray.PolyMat that) {
        
        //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final x10.regionarray.PolyMatBuilder pmb = ((x10.regionarray.PolyMatBuilder)(new x10.regionarray.PolyMatBuilder((java.lang.System[]) null)));
        
        //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final long t$130021 = rank;
        
        //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        pmb.x10$regionarray$PolyMatBuilder$$init$S(((long)(t$130021)));
        
        //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final x10.lang.Iterator r$130022 = this.iterator();
        
        //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        for (;
             true;
             ) {
            
            //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final boolean t$130023 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)r$130022).hasNext$O();
            
            //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            if (!(t$130023)) {
                
                //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                break;
            }
            
            //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final x10.regionarray.PolyRow r$130019 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)r$130022).next$G();
            
            //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            pmb.add(((x10.regionarray.Row)(r$130019)));
        }
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final x10.lang.Iterator r$130024 = ((x10.regionarray.Mat<x10.regionarray.PolyRow>)that).iterator();
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        for (;
             true;
             ) {
            
            //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final boolean t$130025 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)r$130024).hasNext$O();
            
            //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            if (!(t$130025)) {
                
                //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                break;
            }
            
            //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final x10.regionarray.PolyRow r$130020 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)r$130024).next$G();
            
            //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            pmb.add(((x10.regionarray.Row)(r$130020)));
        }
        
        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final x10.regionarray.PolyMat t$129827 = ((x10.regionarray.PolyMat)(pmb.toSortedPolyMat((boolean)(false))));
        
        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        return t$129827;
    }
    
    
    //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    public java.lang.String toString() {
        
        //#line 266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        java.lang.String s = "(";
        
        //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        boolean first = true;
        
        //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final x10.lang.Iterator r$130034 = this.iterator();
        
        //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        for (;
             true;
             ) {
            
            //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final boolean t$130035 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)r$130034).hasNext$O();
            
            //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            if (!(t$130035)) {
                
                //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                break;
            }
            
            //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final x10.regionarray.PolyRow r$130026 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)r$130034).next$G();
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final boolean t$130027 = first;
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final boolean t$130028 = !(t$130027);
            
            //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            if (t$130028) {
                
                //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final java.lang.String t$130029 = ((java.lang.String)(s));
                
                //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                final java.lang.String t$130030 = ((t$130029) + (" && "));
                
                //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
                s = ((java.lang.String)(t$130030));
            }
            
            //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final java.lang.String t$130031 = ((java.lang.String)(s));
            
            //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final java.lang.String t$130032 = r$130026.toString();
            
            //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final java.lang.String t$130033 = ((t$130031) + (t$130032));
            
            //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            s = ((java.lang.String)(t$130033));
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            first = false;
        }
        
        //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final java.lang.String t$129837 = ((java.lang.String)(s));
        
        //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final java.lang.String t$129838 = ((t$129837) + (")"));
        
        //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        s = ((java.lang.String)(t$129838));
        
        //#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        final java.lang.String t$129839 = ((java.lang.String)(s));
        
        //#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        return t$129839;
    }
    
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    final public x10.regionarray.PolyMat x10$regionarray$PolyMat$$this$x10$regionarray$PolyMat() {
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
        return x10.regionarray.PolyMat.this;
    }
    
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
    final public void __fieldInitializers_x10_regionarray_PolyMat() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$221 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$221> $RTT = 
            x10.rtt.StaticFunType.<$Closure$221> make($Closure$221.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.INT, x10.rtt.Types.INT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.PolyMat.$Closure$221 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.i = $deserializer.readLong();
            $_obj.init = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.PolyMat.$Closure$221 $_obj = new x10.regionarray.PolyMat.$Closure$221((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.i);
            $serializer.write(this.init);
            
        }
        
        // constructor just for allocation
        public $Closure$221(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Int.$box($apply$O(x10.core.Int.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public int $apply$I(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Int.$unbox(a1));
            
        }
        
        // synthetic type for parameter mangling
        public static final class __1$1x10$lang$Int$3x10$lang$Int$3x10$lang$Int$2 {}
        
    
        
        public int $apply$O(final int j$129841) {
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final int t$129842 = ((int)(long)(((long)(this.i))));
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final int t$129843 = x10.core.Int.$unbox(((x10.core.fun.Fun_0_2<x10.core.Int,x10.core.Int,x10.core.Int>)this.init).$apply(x10.core.Int.$box(t$129842), x10.rtt.Types.INT, x10.core.Int.$box(j$129841), x10.rtt.Types.INT));
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            return t$129843;
        }
        
        public long i;
        public x10.core.fun.Fun_0_2<x10.core.Int,x10.core.Int,x10.core.Int> init;
        
        public $Closure$221(final long i, final x10.core.fun.Fun_0_2<x10.core.Int,x10.core.Int,x10.core.Int> init, __1$1x10$lang$Int$3x10$lang$Int$3x10$lang$Int$2 $dummy) {
             {
                this.i = i;
                this.init = ((x10.core.fun.Fun_0_2)(init));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$222 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$222> $RTT = 
            x10.rtt.StaticFunType.<$Closure$222> make($Closure$222.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.regionarray.PolyRow.$RTT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.PolyMat.$Closure$222 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.init = $deserializer.readObject();
            $_obj.cols = $deserializer.readInt();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.PolyMat.$Closure$222 $_obj = new x10.regionarray.PolyMat.$Closure$222((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.init);
            $serializer.write(this.cols);
            
        }
        
        // constructor just for allocation
        public $Closure$222(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply(x10.core.Long.$unbox(a1));
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$Int$3x10$lang$Int$3x10$lang$Int$2 {}
        
    
        
        public x10.regionarray.PolyRow $apply(final long i) {
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final x10.regionarray.PolyRow alloc$128971 = ((x10.regionarray.PolyRow)(new x10.regionarray.PolyRow((java.lang.System[]) null)));
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final x10.core.fun.Fun_0_1 t$129840 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.PolyMat.$Closure$221(i, ((x10.core.fun.Fun_0_2)(this.init)), (x10.regionarray.PolyMat.$Closure$221.__1$1x10$lang$Int$3x10$lang$Int$3x10$lang$Int$2) null)));
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            alloc$128971.x10$regionarray$PolyRow$$init$S(this.cols, ((x10.core.fun.Fun_0_1)(t$129840)), (x10.regionarray.PolyRow.__1$1x10$lang$Int$3x10$lang$Int$2) null);
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            return alloc$128971;
        }
        
        public x10.core.fun.Fun_0_2<x10.core.Int,x10.core.Int,x10.core.Int> init;
        public int cols;
        
        public $Closure$222(final x10.core.fun.Fun_0_2<x10.core.Int,x10.core.Int,x10.core.Int> init, final int cols, __0$1x10$lang$Int$3x10$lang$Int$3x10$lang$Int$2 $dummy) {
             {
                this.init = ((x10.core.fun.Fun_0_2)(init));
                this.cols = cols;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$223 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$223> $RTT = 
            x10.rtt.StaticFunType.<$Closure$223> make($Closure$223.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.INT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.PolyMat.$Closure$223 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.as_$129927 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.PolyMat.$Closure$223 $_obj = new x10.regionarray.PolyMat.$Closure$223((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.as_$129927);
            
        }
        
        // constructor just for allocation
        public $Closure$223(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Int.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public int $apply$I(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$Int$2 {}
        
    
        
        public int $apply$O(final long i$129952) {
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final int t$129953 = ((int[])this.as_$129927.value)[(int)i$129952];
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            return t$129953;
        }
        
        public x10.core.Rail<x10.core.Int> as_$129927;
        
        public $Closure$223(final x10.core.Rail<x10.core.Int> as_$129927, __0$1x10$lang$Int$2 $dummy) {
             {
                this.as_$129927 = ((x10.core.Rail)(as_$129927));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$224 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$224> $RTT = 
            x10.rtt.StaticFunType.<$Closure$224> make($Closure$224.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.INT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.PolyMat.$Closure$224 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.PolyMat.$Closure$224 $_obj = new x10.regionarray.PolyMat.$Closure$224((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            
        }
        
        // constructor just for allocation
        public $Closure$224(final java.lang.System[] $dummy) {
            
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
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final int t$129773 = ((int)(long)(((long)(i))));
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final int t$129774 = this.out$$.rectMin$O((int)(t$129773));
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            return t$129774;
        }
        
        public x10.regionarray.PolyMat out$$;
        
        public $Closure$224(final x10.regionarray.PolyMat out$$) {
             {
                this.out$$ = out$$;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$225 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$225> $RTT = 
            x10.rtt.StaticFunType.<$Closure$225> make($Closure$225.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.INT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.PolyMat.$Closure$225 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.PolyMat.$Closure$225 $_obj = new x10.regionarray.PolyMat.$Closure$225((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            
        }
        
        // constructor just for allocation
        public $Closure$225(final java.lang.System[] $dummy) {
            
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
            
            //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final int t$129778 = ((int)(long)(((long)(i))));
            
            //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            final int t$129779 = this.out$$.rectMax$O((int)(t$129778));
            
            //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMat.x10"
            return t$129779;
        }
        
        public x10.regionarray.PolyMat out$$;
        
        public $Closure$225(final x10.regionarray.PolyMat out$$) {
             {
                this.out$$ = out$$;
            }
        }
        
    }
    
}


