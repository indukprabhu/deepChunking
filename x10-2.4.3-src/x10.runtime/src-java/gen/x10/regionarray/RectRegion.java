package x10.regionarray;


@x10.runtime.impl.java.X10Generated
final public class RectRegion extends x10.regionarray.Region implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<RectRegion> $RTT = 
        x10.rtt.NamedType.<RectRegion> make("x10.regionarray.RectRegion",
                                            RectRegion.class,
                                            new x10.rtt.Type[] {
                                                x10.regionarray.Region.$RTT
                                            });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.Region.$_deserialize_body($_obj, $deserializer);
        $_obj.size = $deserializer.readLong();
        $_obj.mins = $deserializer.readObject();
        $_obj.maxs = $deserializer.readObject();
        $_obj.min0 = $deserializer.readLong();
        $_obj.min1 = $deserializer.readLong();
        $_obj.min2 = $deserializer.readLong();
        $_obj.min3 = $deserializer.readLong();
        $_obj.max0 = $deserializer.readLong();
        $_obj.max1 = $deserializer.readLong();
        $_obj.max2 = $deserializer.readLong();
        $_obj.max3 = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.RectRegion $_obj = new x10.regionarray.RectRegion((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.size);
        $serializer.write(this.mins);
        $serializer.write(this.maxs);
        $serializer.write(this.min0);
        $serializer.write(this.min1);
        $serializer.write(this.min2);
        $serializer.write(this.min3);
        $serializer.write(this.max0);
        $serializer.write(this.max1);
        $serializer.write(this.max2);
        $serializer.write(this.max3);
        
    }
    
    // constructor just for allocation
    public RectRegion(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    // synthetic type for parameter mangling
    public static final class __0$1x10$lang$Long$2__1$1x10$lang$Long$2 {}
    

    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public long size;
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public x10.core.Rail<x10.core.Long> mins;
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public x10.core.Rail<x10.core.Long> maxs;
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public long min0;
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public long min1;
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public long min2;
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public long min3;
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public long max0;
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public long max1;
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public long max2;
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public long max3;
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public transient x10.regionarray.Region polyRep;
    
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    private static boolean allZeros__0$1x10$lang$Long$2$O(final x10.core.Rail<x10.core.Long> a) {
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.core.Rail rail$134029 = ((x10.core.Rail)(a));
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long i$123832max$134030 = ((x10.core.Rail<x10.core.Long>)rail$134029).size;
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        long i$134026 = 0L;
        {
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long[] a$value$134179 = ((long[])a.value);
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            for (;
                 true;
                 ) {
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$134027 = i$134026;
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final boolean t$134028 = ((t$134027) < (((long)(i$123832max$134030))));
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                if (!(t$134028)) {
                    
                    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    break;
                }
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long i$134023 = i$134026;
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$134021 = ((long)a$value$134179[(int)i$134023]);
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final boolean t$134022 = ((long) t$134021) != ((long) 0L);
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                if (t$134022) {
                    
                    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    return false;
                }
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$134024 = i$134026;
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$134025 = ((t$134024) + (((long)(1L))));
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                i$134026 = t$134025;
            }
        }
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return true;
    }
    
    public static boolean allZeros$P__0$1x10$lang$Long$2$O(final x10.core.Rail<x10.core.Long> a) {
        return x10.regionarray.RectRegion.allZeros__0$1x10$lang$Long$2$O(((x10.core.Rail)(a)));
    }
    
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    // creation method for java code (1-phase java constructor)
    public RectRegion(final x10.core.Rail<x10.core.Long> minArg, final x10.core.Rail<x10.core.Long> maxArg, __0$1x10$lang$Long$2__1$1x10$lang$Long$2 $dummy) {
        this((java.lang.System[]) null);
        x10$regionarray$RectRegion$$init$S(minArg, maxArg, (x10.regionarray.RectRegion.__0$1x10$lang$Long$2__1$1x10$lang$Long$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.RectRegion x10$regionarray$RectRegion$$init$S(final x10.core.Rail<x10.core.Long> minArg, final x10.core.Rail<x10.core.Long> maxArg, __0$1x10$lang$Long$2__1$1x10$lang$Long$2 $dummy) {
         {
            
            //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final x10.regionarray.Region this$133292 = ((x10.regionarray.Region)(this));
            
            //#line 556 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long r$133288 = ((x10.core.Rail<x10.core.Long>)minArg).size;
            
            //#line 556 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final boolean z$133290 = x10.regionarray.RectRegion.allZeros__0$1x10$lang$Long$2$O(((x10.core.Rail)(minArg)));
            
            //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            boolean t$134052 = ((long) r$133288) == ((long) 1L);
            
            //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            if (t$134052) {
                
                //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                t$134052 = true;
            }
            
            //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            boolean t$134053 = t$134052;
            
            //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            if (t$134053) {
                
                //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                t$134053 = z$133290;
            }
            
            //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final boolean isRail$134054 = t$134053;
            
            //#line 558 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this$133292.rank = r$133288;
            
            //#line 558 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this$133292.rect = true;
            
            //#line 558 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this$133292.zeroBased = z$133290;
            
            //#line 558 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this$133292.rail = isRail$134054;
            {
                
            }
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final x10.regionarray.RectRegion this$134055 = this;
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            this$134055.polyRep = null;
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133372 = ((x10.core.Rail<x10.core.Long>)minArg).size;
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133373 = ((x10.core.Rail<x10.core.Long>)maxArg).size;
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133375 = ((long) t$133372) != ((long) t$133373);
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133375) {
                
                //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final java.lang.IllegalArgumentException t$133374 = ((java.lang.IllegalArgumentException)(new java.lang.IllegalArgumentException("size of min and max args are not equal")));
                
                //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                throw t$133374;
            }
            
            //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            long s = 1L;
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final x10.core.Rail rail$134056 = ((x10.core.Rail)(minArg));
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long i$123851max$134057 = ((x10.core.Rail<x10.core.Long>)rail$134056).size;
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            long i$134049 = 0L;
            {
                
                //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long[] maxArg$value$134180 = ((long[])maxArg.value);
                
                //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long[] minArg$value$134181 = ((long[])minArg.value);
                
                //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$134050 = i$134049;
                    
                    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final boolean t$134051 = ((t$134050) < (((long)(i$123851max$134057))));
                    
                    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    if (!(t$134051)) {
                        
                        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        break;
                    }
                    
                    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long i$134046 = i$134049;
                    
                    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$134031 = ((long)maxArg$value$134180[(int)i$134046]);
                    
                    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$134032 = ((long)minArg$value$134181[(int)i$134046]);
                    
                    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$134033 = ((t$134031) - (((long)(t$134032))));
                    
                    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    long rs$134034 = ((t$134033) + (((long)(1L))));
                    
                    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$134035 = rs$134034;
                    
                    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final boolean t$134036 = ((t$134035) < (((long)(0L))));
                    
                    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    if (t$134036) {
                        
                        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        rs$134034 = 0L;
                    }
                    
                    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$134037 = ((long)maxArg$value$134180[(int)i$134046]);
                    
                    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$134038 = java.lang.Long.MAX_VALUE;
                    
                    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    boolean t$134039 = ((long) t$134037) == ((long) t$134038);
                    
                    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    if (t$134039) {
                        
                        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long t$134040 = ((long)minArg$value$134181[(int)i$134046]);
                        
                        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long t$134041 = java.lang.Long.MIN_VALUE;
                        
                        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        t$134039 = ((long) t$134040) == ((long) t$134041);
                    }
                    
                    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final boolean t$134042 = t$134039;
                    
                    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    if (t$134042) {
                        
                        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        s = -1L;
                        
                        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        break;
                    }
                    
                    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$134043 = s;
                    
                    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$134044 = rs$134034;
                    
                    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$134045 = ((t$134043) * (((long)(t$134044))));
                    
                    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    s = t$134045;
                    
                    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$134047 = i$134049;
                    
                    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$134048 = ((t$134047) + (((long)(1L))));
                    
                    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    i$134049 = t$134048;
                }
            }
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133395 = s;
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            this.size = t$133395;
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133396 = ((x10.core.Rail<x10.core.Long>)minArg).size;
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133400 = ((t$133396) > (((long)(0L))));
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133400) {
                
                //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133397 = ((long[])minArg.value)[(int)0L];
                
                //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                this.min0 = t$133397;
                
                //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133398 = ((long[])maxArg.value)[(int)0L];
                
                //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                this.max0 = t$133398;
            } else {
                
                //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133399 = this.max0 = 0L;
                
                //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                this.min0 = t$133399;
            }
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133401 = ((x10.core.Rail<x10.core.Long>)minArg).size;
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133405 = ((t$133401) > (((long)(1L))));
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133405) {
                
                //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133402 = ((long[])minArg.value)[(int)1L];
                
                //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                this.min1 = t$133402;
                
                //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133403 = ((long[])maxArg.value)[(int)1L];
                
                //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                this.max1 = t$133403;
            } else {
                
                //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133404 = this.max1 = 0L;
                
                //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                this.min1 = t$133404;
            }
            
            //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133406 = ((x10.core.Rail<x10.core.Long>)minArg).size;
            
            //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133410 = ((t$133406) > (((long)(2L))));
            
            //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133410) {
                
                //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133407 = ((long[])minArg.value)[(int)2L];
                
                //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                this.min2 = t$133407;
                
                //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133408 = ((long[])maxArg.value)[(int)2L];
                
                //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                this.max2 = t$133408;
            } else {
                
                //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133409 = this.max2 = 0L;
                
                //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                this.min2 = t$133409;
            }
            
            //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133411 = ((x10.core.Rail<x10.core.Long>)minArg).size;
            
            //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133415 = ((t$133411) > (((long)(3L))));
            
            //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133415) {
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133412 = ((long[])minArg.value)[(int)3L];
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                this.min3 = t$133412;
                
                //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133413 = ((long[])maxArg.value)[(int)3L];
                
                //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                this.max3 = t$133413;
            } else {
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133414 = this.max3 = 0L;
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                this.min3 = t$133414;
            }
            
            //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133416 = ((x10.core.Rail<x10.core.Long>)minArg).size;
            
            //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133417 = ((t$133416) > (((long)(4L))));
            
            //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133417) {
                
                //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                this.mins = ((x10.core.Rail)(minArg));
                
                //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                this.maxs = ((x10.core.Rail)(maxArg));
            } else {
                
                //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                this.mins = null;
                
                //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                this.maxs = null;
            }
        }
        return this;
    }
    
    
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    // creation method for java code (1-phase java constructor)
    public RectRegion(final long min, final long max) {
        this((java.lang.System[]) null);
        x10$regionarray$RectRegion$$init$S(min, max);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.RectRegion x10$regionarray$RectRegion$$init$S(final long min, final long max) {
         {
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final x10.regionarray.Region this$133303 = ((x10.regionarray.Region)(this));
            
            //#line 556 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final boolean z$133301 = ((long) min) == ((long) 0L);
            
            //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final boolean isRail$134058 = z$133301;
            
            //#line 558 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this$133303.rank = 1L;
            
            //#line 558 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this$133303.rect = true;
            
            //#line 558 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this$133303.zeroBased = z$133301;
            
            //#line 558 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this$133303.rail = isRail$134058;
            {
                
            }
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final x10.regionarray.RectRegion this$134059 = this;
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            this$134059.polyRep = null;
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133418 = java.lang.Long.MIN_VALUE;
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133420 = ((long) min) == ((long) t$133418);
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133420) {
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133419 = java.lang.Long.MAX_VALUE;
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133420 = ((long) max) == ((long) t$133419);
            }
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133422 = t$133420;
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            long t$133423 =  0;
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133422) {
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133423 = -1L;
            } else {
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133421 = ((max) - (((long)(min))));
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133423 = ((t$133421) + (((long)(1L))));
            }
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133424 = t$133423;
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            this.size = t$133424;
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            this.min0 = min;
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            this.max0 = max;
            
            //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133425 = this.min3 = 0L;
            
            //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133426 = this.min2 = t$133425;
            
            //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            this.min1 = t$133426;
            
            //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133427 = this.max3 = 0L;
            
            //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133428 = this.max2 = t$133427;
            
            //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            this.max1 = t$133428;
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            this.mins = null;
            
            //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            this.maxs = null;
        }
        return this;
    }
    
    
    
    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public long size$O() {
        
        //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$133429 = size;
        
        //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133431 = ((t$133429) < (((long)(0L))));
        
        //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133431) {
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final x10.regionarray.UnboundedRegionException t$133430 = ((x10.regionarray.UnboundedRegionException)(new x10.regionarray.UnboundedRegionException(((java.lang.String)("size exceeds capacity of long")))));
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            throw t$133430;
        }
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$133432 = size;
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return t$133432;
    }
    
    
    //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public boolean isConvex$O() {
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return true;
    }
    
    
    //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public boolean isEmpty$O() {
        
        //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$133433 = size;
        
        //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133434 = ((long) t$133433) == ((long) 0L);
        
        //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return t$133434;
    }
    
    
    //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public long indexOf$O(final x10.lang.Point pt) {
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133435 = this.contains$O(((x10.lang.Point)(pt)));
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133436 = !(t$133435);
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133436) {
            
            //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return -1L;
        }
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$133437 = ((long)(((int)(0))));
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$133439 = pt.$apply$O((long)(t$133437));
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$133438 = ((long)(((int)(0))));
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$133440 = this.min$O((long)(t$133438));
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        long offset = ((t$133439) - (((long)(t$133440))));
        
        //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$134075 = rank;
        
        //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long i$123870max$134076 = ((t$134075) - (((long)(1L))));
        
        //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        long i$134072 = 1L;
        
        //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        for (;
             true;
             ) {
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$134073 = i$134072;
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$134074 = ((t$134073) <= (((long)(i$123870max$134076))));
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (!(t$134074)) {
                
                //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                break;
            }
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long i$134069 = i$134072;
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long min_i$134060 = this.min$O((long)(i$134069));
            
            //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long max_i$134061 = this.max$O((long)(i$134069));
            
            //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long pt_i$134062 = pt.$apply$O((long)(i$134069));
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$134063 = ((max_i$134061) - (((long)(min_i$134060))));
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long delta_i$134064 = ((t$134063) + (((long)(1L))));
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$134065 = offset;
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$134066 = ((t$134065) * (((long)(delta_i$134064))));
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$134067 = ((t$134066) + (((long)(pt_i$134062))));
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$134068 = ((t$134067) - (((long)(min_i$134060))));
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            offset = t$134068;
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$134070 = i$134072;
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$134071 = ((t$134070) + (((long)(1L))));
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            i$134072 = t$134071;
        }
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$133452 = offset;
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return t$133452;
    }
    
    
    //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public long indexOf$O(final long i0) {
        
        //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133469 = zeroBased;
        
        //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133469) {
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133453 = rank;
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133458 = ((long) t$133453) != ((long) 1L);
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (!(t$133458)) {
                
                //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final x10.regionarray.RectRegion this$133311 = ((x10.regionarray.RectRegion)(this));
                
                //#line 263 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long i$133310 = i0;
                
                //#line 264 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133454 = this$133311.min0;
                
                //#line 264 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                boolean t$133456 = ((i$133310) >= (((long)(t$133454))));
                
                //#line 264 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                if (t$133456) {
                    
                    //#line 264 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$133455 = this$133311.max0;
                    
                    //#line 264 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    t$133456 = ((i$133310) <= (((long)(t$133455))));
                }
                
                //#line 264 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final boolean t$133457 = t$133456;
                
                //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133458 = !(t$133457);
            }
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133459 = t$133458;
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133459) {
                
                //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                return -1L;
            }
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return i0;
        } else {
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133460 = rank;
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133465 = ((long) t$133460) != ((long) 1L);
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (!(t$133465)) {
                
                //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final x10.regionarray.RectRegion this$133313 = ((x10.regionarray.RectRegion)(this));
                
                //#line 263 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long i$133312 = i0;
                
                //#line 264 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133461 = this$133313.min0;
                
                //#line 264 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                boolean t$133463 = ((i$133312) >= (((long)(t$133461))));
                
                //#line 264 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                if (t$133463) {
                    
                    //#line 264 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$133462 = this$133313.max0;
                    
                    //#line 264 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    t$133463 = ((i$133312) <= (((long)(t$133462))));
                }
                
                //#line 264 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final boolean t$133464 = t$133463;
                
                //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133465 = !(t$133464);
            }
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133466 = t$133465;
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133466) {
                
                //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                return -1L;
            }
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133467 = min0;
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133468 = ((i0) - (((long)(t$133467))));
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133468;
        }
    }
    
    
    //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public long indexOf$O(final long i0, final long i1) {
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133495 = zeroBased;
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133495) {
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133470 = rank;
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133472 = ((long) t$133470) != ((long) 2L);
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (!(t$133472)) {
                
                //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final boolean t$133471 = this.containsInternal$O((long)(i0), (long)(i1));
                
                //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133472 = !(t$133471);
            }
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133473 = t$133472;
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133473) {
                
                //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                return -1L;
            }
            
            //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            long offset = i0;
            
            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133475 = offset;
            
            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133474 = max1;
            
            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133476 = ((t$133474) + (((long)(1L))));
            
            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133477 = ((t$133475) * (((long)(t$133476))));
            
            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133478 = ((t$133477) + (((long)(i1))));
            
            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            offset = t$133478;
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133479 = offset;
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133479;
        } else {
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133480 = rank;
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133482 = ((long) t$133480) != ((long) 2L);
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (!(t$133482)) {
                
                //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final boolean t$133481 = this.containsInternal$O((long)(i0), (long)(i1));
                
                //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133482 = !(t$133481);
            }
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133483 = t$133482;
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133483) {
                
                //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                return -1L;
            }
            
            //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133484 = min0;
            
            //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            long offset = ((i0) - (((long)(t$133484))));
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133488 = offset;
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133485 = max1;
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133486 = min1;
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133487 = ((t$133485) - (((long)(t$133486))));
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133489 = ((t$133487) + (((long)(1L))));
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133490 = ((t$133488) * (((long)(t$133489))));
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133491 = ((t$133490) + (((long)(i1))));
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133492 = min1;
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133493 = ((t$133491) - (((long)(t$133492))));
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            offset = t$133493;
            
            //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133494 = offset;
            
            //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133494;
        }
    }
    
    
    //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public long indexOf$O(final long i0, final long i1, final long i2) {
        
        //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133535 = zeroBased;
        
        //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133535) {
            
            //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133496 = rank;
            
            //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133498 = ((long) t$133496) != ((long) 3L);
            
            //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (!(t$133498)) {
                
                //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final boolean t$133497 = this.containsInternal$O((long)(i0), (long)(i1), (long)(i2));
                
                //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133498 = !(t$133497);
            }
            
            //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133499 = t$133498;
            
            //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133499) {
                
                //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                return -1L;
            }
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            long offset = i0;
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133501 = offset;
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133500 = max1;
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133502 = ((t$133500) + (((long)(1L))));
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133503 = ((t$133501) * (((long)(t$133502))));
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133504 = ((t$133503) + (((long)(i1))));
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            offset = t$133504;
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133506 = offset;
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133505 = max2;
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133507 = ((t$133505) + (((long)(1L))));
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133508 = ((t$133506) * (((long)(t$133507))));
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133509 = ((t$133508) + (((long)(i2))));
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            offset = t$133509;
            
            //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133510 = offset;
            
            //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133510;
        } else {
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133511 = rank;
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133513 = ((long) t$133511) != ((long) 3L);
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (!(t$133513)) {
                
                //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final boolean t$133512 = this.containsInternal$O((long)(i0), (long)(i1), (long)(i2));
                
                //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133513 = !(t$133512);
            }
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133514 = t$133513;
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133514) {
                
                //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                return -1L;
            }
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133515 = min0;
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            long offset = ((i0) - (((long)(t$133515))));
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133519 = offset;
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133516 = max1;
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133517 = min1;
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133518 = ((t$133516) - (((long)(t$133517))));
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133520 = ((t$133518) + (((long)(1L))));
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133521 = ((t$133519) * (((long)(t$133520))));
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133522 = ((t$133521) + (((long)(i1))));
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133523 = min1;
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133524 = ((t$133522) - (((long)(t$133523))));
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            offset = t$133524;
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133528 = offset;
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133525 = max2;
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133526 = min2;
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133527 = ((t$133525) - (((long)(t$133526))));
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133529 = ((t$133527) + (((long)(1L))));
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133530 = ((t$133528) * (((long)(t$133529))));
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133531 = ((t$133530) + (((long)(i2))));
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133532 = min2;
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133533 = ((t$133531) - (((long)(t$133532))));
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            offset = t$133533;
            
            //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133534 = offset;
            
            //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133534;
        }
    }
    
    
    //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public long indexOf$O(final long i0, final long i1, final long i2, final long i3) {
        
        //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133589 = zeroBased;
        
        //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133589) {
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133536 = rank;
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133538 = ((long) t$133536) != ((long) 4L);
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (!(t$133538)) {
                
                //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final boolean t$133537 = this.containsInternal$O((long)(i0), (long)(i1), (long)(i2), (long)(i3));
                
                //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133538 = !(t$133537);
            }
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133539 = t$133538;
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133539) {
                
                //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                return -1L;
            }
            
            //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            long offset = i0;
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133541 = offset;
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133540 = max1;
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133542 = ((t$133540) + (((long)(1L))));
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133543 = ((t$133541) * (((long)(t$133542))));
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133544 = ((t$133543) + (((long)(i1))));
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            offset = t$133544;
            
            //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133546 = offset;
            
            //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133545 = max2;
            
            //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133547 = ((t$133545) + (((long)(1L))));
            
            //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133548 = ((t$133546) * (((long)(t$133547))));
            
            //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133549 = ((t$133548) + (((long)(i2))));
            
            //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            offset = t$133549;
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133551 = offset;
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133550 = max3;
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133552 = ((t$133550) + (((long)(1L))));
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133553 = ((t$133551) * (((long)(t$133552))));
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133554 = ((t$133553) + (((long)(i3))));
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            offset = t$133554;
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133555 = offset;
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133555;
        } else {
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133556 = rank;
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133558 = ((long) t$133556) != ((long) 4L);
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (!(t$133558)) {
                
                //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final boolean t$133557 = this.containsInternal$O((long)(i0), (long)(i1), (long)(i2), (long)(i3));
                
                //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133558 = !(t$133557);
            }
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133559 = t$133558;
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133559) {
                
                //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                return -1L;
            }
            
            //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133560 = min0;
            
            //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            long offset = ((i0) - (((long)(t$133560))));
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133564 = offset;
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133561 = max1;
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133562 = min1;
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133563 = ((t$133561) - (((long)(t$133562))));
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133565 = ((t$133563) + (((long)(1L))));
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133566 = ((t$133564) * (((long)(t$133565))));
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133567 = ((t$133566) + (((long)(i1))));
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133568 = min1;
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133569 = ((t$133567) - (((long)(t$133568))));
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            offset = t$133569;
            
            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133573 = offset;
            
            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133570 = max2;
            
            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133571 = min2;
            
            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133572 = ((t$133570) - (((long)(t$133571))));
            
            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133574 = ((t$133572) + (((long)(1L))));
            
            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133575 = ((t$133573) * (((long)(t$133574))));
            
            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133576 = ((t$133575) + (((long)(i2))));
            
            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133577 = min2;
            
            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133578 = ((t$133576) - (((long)(t$133577))));
            
            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            offset = t$133578;
            
            //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133582 = offset;
            
            //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133579 = max3;
            
            //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133580 = min3;
            
            //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133581 = ((t$133579) - (((long)(t$133580))));
            
            //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133583 = ((t$133581) + (((long)(1L))));
            
            //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133584 = ((t$133582) * (((long)(t$133583))));
            
            //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133585 = ((t$133584) + (((long)(i3))));
            
            //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133586 = min3;
            
            //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133587 = ((t$133585) - (((long)(t$133586))));
            
            //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            offset = t$133587;
            
            //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133588 = offset;
            
            //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133588;
        }
    }
    
    
    //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public long min$O(final long i) {
        
        //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133591 = ((long) i) == ((long) 0L);
        
        //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133591) {
            
            //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133590 = min0;
            
            //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133590;
        }
        
        //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133593 = ((long) i) == ((long) 1L);
        
        //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133593) {
            
            //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133592 = min1;
            
            //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133592;
        }
        
        //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133595 = ((long) i) == ((long) 2L);
        
        //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133595) {
            
            //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133594 = min2;
            
            //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133594;
        }
        
        //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133597 = ((long) i) == ((long) 3L);
        
        //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133597) {
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133596 = min3;
            
            //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133596;
        }
        
        //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        boolean t$133599 = ((i) < (((long)(0L))));
        
        //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (!(t$133599)) {
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133598 = rank;
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            t$133599 = ((i) >= (((long)(t$133598))));
        }
        
        //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133604 = t$133599;
        
        //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133604) {
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final java.lang.String t$133600 = (("min: ") + ((x10.core.Long.$box(i))));
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final java.lang.String t$133601 = ((t$133600) + (" is not a valid rank for "));
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final java.lang.String t$133602 = ((t$133601) + (this));
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final java.lang.ArrayIndexOutOfBoundsException t$133603 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$133602)));
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            throw t$133603;
        }
        
        //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.core.Rail t$133605 = ((x10.core.Rail)(mins));
        
        //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$133606 = ((long[])t$133605.value)[(int)i];
        
        //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return t$133606;
    }
    
    
    //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public long max$O(final long i) {
        
        //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133608 = ((long) i) == ((long) 0L);
        
        //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133608) {
            
            //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133607 = max0;
            
            //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133607;
        }
        
        //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133610 = ((long) i) == ((long) 1L);
        
        //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133610) {
            
            //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133609 = max1;
            
            //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133609;
        }
        
        //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133612 = ((long) i) == ((long) 2L);
        
        //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133612) {
            
            //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133611 = max2;
            
            //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133611;
        }
        
        //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133614 = ((long) i) == ((long) 3L);
        
        //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133614) {
            
            //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133613 = max3;
            
            //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133613;
        }
        
        //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        boolean t$133616 = ((i) < (((long)(0L))));
        
        //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (!(t$133616)) {
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133615 = rank;
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            t$133616 = ((i) >= (((long)(t$133615))));
        }
        
        //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133621 = t$133616;
        
        //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133621) {
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final java.lang.String t$133617 = (("max: ") + ((x10.core.Long.$box(i))));
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final java.lang.String t$133618 = ((t$133617) + (" is not a valid rank for "));
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final java.lang.String t$133619 = ((t$133618) + (this));
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final java.lang.ArrayIndexOutOfBoundsException t$133620 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$133619)));
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            throw t$133620;
        }
        
        //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.core.Rail t$133622 = ((x10.core.Rail)(maxs));
        
        //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$133623 = ((long[])t$133622.value)[(int)i];
        
        //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return t$133623;
    }
    
    
    //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public x10.regionarray.Region computeBoundingBox() {
        
        //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return this;
    }
    
    
    //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public x10.core.fun.Fun_0_1 min() {
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.core.fun.Fun_0_1 t$133625 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.$Closure$237(this)));
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return t$133625;
    }
    
    
    //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public x10.core.fun.Fun_0_1 max() {
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.core.fun.Fun_0_1 t$133627 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.$Closure$238(this)));
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return t$133627;
    }
    
    
    //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public boolean contains$O(final x10.regionarray.Region that) {
        
        //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133651 = x10.regionarray.RectRegion.$RTT.isInstance(that);
        
        //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133651) {
            
            //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final x10.regionarray.RectRegion this$133315 = ((x10.regionarray.RectRegion)(x10.rtt.Types.<x10.regionarray.RectRegion> cast(that,x10.regionarray.RectRegion.$RTT)));
            
            //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final x10.core.fun.Fun_0_1 thatMin = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.$Closure$239(this$133315)));
            
            //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final x10.regionarray.RectRegion this$133317 = ((x10.regionarray.RectRegion)(x10.rtt.Types.<x10.regionarray.RectRegion> cast(that,x10.regionarray.RectRegion.$RTT)));
            
            //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final x10.core.fun.Fun_0_1 thatMax = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.$Closure$240(this$133317)));
            
            //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$134089 = rank;
            
            //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long i$123888max$134090 = ((t$134089) - (((long)(1L))));
            
            //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            long i$134086 = 0L;
            
            //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            for (;
                 true;
                 ) {
                
                //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$134087 = i$134086;
                
                //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final boolean t$134088 = ((t$134087) <= (((long)(i$123888max$134090))));
                
                //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                if (!(t$134088)) {
                    
                    //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    break;
                }
                
                //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long i$134083 = i$134086;
                
                //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$134077 = this.min$O((long)(i$134083));
                
                //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$134078 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)thatMin).$apply(x10.core.Long.$box(i$134083), x10.rtt.Types.LONG));
                
                //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final boolean t$134079 = ((t$134077) > (((long)(t$134078))));
                
                //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                if (t$134079) {
                    
                    //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    return false;
                }
                
                //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$134080 = this.max$O((long)(i$134083));
                
                //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$134081 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)thatMax).$apply(x10.core.Long.$box(i$134083), x10.rtt.Types.LONG));
                
                //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final boolean t$134082 = ((t$134080) < (((long)(t$134081))));
                
                //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                if (t$134082) {
                    
                    //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    return false;
                }
                
                //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$134084 = i$134086;
                
                //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$134085 = ((t$134084) + (((long)(1L))));
                
                //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                i$134086 = t$134085;
            }
            
            //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return true;
        } else {
            
            //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133650 = x10.regionarray.RectRegion1D.$RTT.isInstance(that);
            
            //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133650) {
                
                //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133642 = this.min$O((long)(0L));
                
                //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133643 = that.min$O((long)(0L));
                
                //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                boolean t$133646 = ((t$133642) <= (((long)(t$133643))));
                
                //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                if (t$133646) {
                    
                    //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$133644 = this.max$O((long)(0L));
                    
                    //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$133645 = that.max$O((long)(0L));
                    
                    //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    t$133646 = ((t$133644) >= (((long)(t$133645))));
                }
                
                //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final boolean t$133647 = t$133646;
                
                //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                return t$133647;
            } else {
                
                //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final x10.regionarray.Region t$133648 = ((x10.regionarray.Region)(that.computeBoundingBox()));
                
                //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final boolean t$133649 = this.contains$O(((x10.regionarray.Region)(t$133648)));
                
                //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                return t$133649;
            }
        }
    }
    
    
    //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public boolean contains$O(final x10.lang.Point p) {
        
        //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$133652 = p.rank;
        
        //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$133653 = rank;
        
        //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133654 = ((long) t$133652) != ((long) t$133653);
        
        //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133654) {
            
            //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return false;
        }
        
        //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$133655 = p.rank;
        
        //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$133656 = ((t$133655) - (((long)(1L))));
        
        //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final int t$133687 = ((int)(long)(((long)(t$133656))));
        
        //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        switch (t$133687) {
            
            //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            default:
                {
                    
                    //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$133657 = p.rank;
                    
                    //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long i$123906min$123907 = ((t$133657) - (((long)(1L))));
                    
                    //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    long i$134102 = i$123906min$123907;
                    
                    //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long t$134103 = i$134102;
                        
                        //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final boolean t$134104 = ((t$134103) <= (((long)(4L))));
                        
                        //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        if (!(t$134104)) {
                            
                            //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                            break;
                        }
                        
                        //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long r$134099 = i$134102;
                        
                        //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long t$134091 = p.$apply$O((long)(r$134099));
                        
                        //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final x10.core.Rail t$134092 = ((x10.core.Rail)(mins));
                        
                        //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long t$134093 = ((long[])t$134092.value)[(int)r$134099];
                        
                        //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        boolean t$134094 = ((t$134091) < (((long)(t$134093))));
                        
                        //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        if (!(t$134094)) {
                            
                            //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                            final long t$134095 = p.$apply$O((long)(r$134099));
                            
                            //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                            final x10.core.Rail t$134096 = ((x10.core.Rail)(maxs));
                            
                            //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                            final long t$134097 = ((long[])t$134096.value)[(int)r$134099];
                            
                            //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                            t$134094 = ((t$134095) > (((long)(t$134097))));
                        }
                        
                        //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final boolean t$134098 = t$134094;
                        
                        //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        if (t$134098) {
                            
                            //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                            return false;
                        }
                        
                        //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long t$134100 = i$134102;
                        
                        //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long t$134101 = ((t$134100) + (((long)(1L))));
                        
                        //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        i$134102 = t$134101;
                    }
                }
            
            //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            case 3:
                {
                    
                    //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long tmp = p.$apply$O((long)(3L));
                    
                    //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$133671 = min3;
                    
                    //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    boolean t$133673 = ((tmp) < (((long)(t$133671))));
                    
                    //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    if (!(t$133673)) {
                        
                        //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long t$133672 = max3;
                        
                        //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        t$133673 = ((tmp) > (((long)(t$133672))));
                    }
                    
                    //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final boolean t$133674 = t$133673;
                    
                    //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    if (t$133674) {
                        
                        //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        return false;
                    }
                }
            
            //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            case 2:
                {
                    
                    //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long tmp = p.$apply$O((long)(2L));
                    
                    //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$133675 = min2;
                    
                    //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    boolean t$133677 = ((tmp) < (((long)(t$133675))));
                    
                    //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    if (!(t$133677)) {
                        
                        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long t$133676 = max2;
                        
                        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        t$133677 = ((tmp) > (((long)(t$133676))));
                    }
                    
                    //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final boolean t$133678 = t$133677;
                    
                    //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    if (t$133678) {
                        
                        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        return false;
                    }
                }
            
            //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            case 1:
                {
                    
                    //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long tmp = p.$apply$O((long)(1L));
                    
                    //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$133679 = min1;
                    
                    //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    boolean t$133681 = ((tmp) < (((long)(t$133679))));
                    
                    //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    if (!(t$133681)) {
                        
                        //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long t$133680 = max1;
                        
                        //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        t$133681 = ((tmp) > (((long)(t$133680))));
                    }
                    
                    //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final boolean t$133682 = t$133681;
                    
                    //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    if (t$133682) {
                        
                        //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        return false;
                    }
                }
            
            //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            case 0:
                {
                    
                    //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long tmp = p.$apply$O((long)(0L));
                    
                    //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$133683 = min0;
                    
                    //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    boolean t$133685 = ((tmp) < (((long)(t$133683))));
                    
                    //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    if (!(t$133685)) {
                        
                        //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long t$133684 = max0;
                        
                        //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        t$133685 = ((tmp) > (((long)(t$133684))));
                    }
                    
                    //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final boolean t$133686 = t$133685;
                    
                    //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    if (t$133686) {
                        
                        //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        return false;
                    }
                }
        }
        
        //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return true;
    }
    
    
    //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public boolean contains$O(final long i0) {
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.regionarray.RectRegion this$133319 = ((x10.regionarray.RectRegion)(this));
        
        //#line 263 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long i$133318 = i0;
        
        //#line 264 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$133688 = this$133319.min0;
        
        //#line 264 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        boolean t$133690 = ((i$133318) >= (((long)(t$133688))));
        
        //#line 264 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133690) {
            
            //#line 264 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133689 = this$133319.max0;
            
            //#line 264 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            t$133690 = ((i$133318) <= (((long)(t$133689))));
        }
        
        //#line 264 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133691 = t$133690;
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return t$133691;
    }
    
    
    //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public boolean contains$O(final long i0, final long i1) {
        
        //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133692 = this.containsInternal$O((long)(i0), (long)(i1));
        
        //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return t$133692;
    }
    
    
    //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public boolean contains$O(final long i0, final long i1, final long i2) {
        
        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133693 = this.containsInternal$O((long)(i0), (long)(i1), (long)(i2));
        
        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return t$133693;
    }
    
    
    //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public boolean contains$O(final long i0, final long i1, final long i2, final long i3) {
        
        //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133694 = this.containsInternal$O((long)(i0), (long)(i1), (long)(i2), (long)(i3));
        
        //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return t$133694;
    }
    
    
    //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    private boolean containsInternal$O(final long i0) {
        
        //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$133695 = min0;
        
        //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        boolean t$133697 = ((i0) >= (((long)(t$133695))));
        
        //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133697) {
            
            //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133696 = max0;
            
            //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            t$133697 = ((i0) <= (((long)(t$133696))));
        }
        
        //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133698 = t$133697;
        
        //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return t$133698;
    }
    
    public static boolean containsInternal$P$O(final long i0, final x10.regionarray.RectRegion RectRegion) {
        return RectRegion.containsInternal$O((long)(i0));
    }
    
    
    //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    private boolean containsInternal$O(final long i0, final long i1) {
        
        //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        boolean t$133699 = true;
        
        //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133699) {
            
            //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            t$133699 = zeroBased;
        }
        
        //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133716 = t$133699;
        
        //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133716) {
            
            //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133701 = ((long)(((long)(i0))));
            
            //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133700 = max0;
            
            //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133702 = ((long)(((long)(t$133700))));
            
            //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133706 = x10.runtime.impl.java.ULongUtils.le(t$133701, ((long)(t$133702)));
            
            //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133706) {
                
                //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133704 = ((long)(((long)(i1))));
                
                //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133703 = max1;
                
                //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133705 = ((long)(((long)(t$133703))));
                
                //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133706 = x10.runtime.impl.java.ULongUtils.le(t$133704, ((long)(t$133705)));
            }
            
            //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133707 = t$133706;
            
            //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133707;
        } else {
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133708 = min0;
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133710 = ((i0) >= (((long)(t$133708))));
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133710) {
                
                //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133709 = max0;
                
                //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133710 = ((i0) <= (((long)(t$133709))));
            }
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133712 = t$133710;
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133712) {
                
                //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133711 = min1;
                
                //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133712 = ((i1) >= (((long)(t$133711))));
            }
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133714 = t$133712;
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133714) {
                
                //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133713 = max1;
                
                //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133714 = ((i1) <= (((long)(t$133713))));
            }
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133715 = t$133714;
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133715;
        }
    }
    
    public static boolean containsInternal$P$O(final long i0, final long i1, final x10.regionarray.RectRegion RectRegion) {
        return RectRegion.containsInternal$O((long)(i0), (long)(i1));
    }
    
    
    //#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    private boolean containsInternal$O(final long i0, final long i1, final long i2) {
        
        //#line 278 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        boolean t$133717 = true;
        
        //#line 278 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133717) {
            
            //#line 278 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            t$133717 = zeroBased;
        }
        
        //#line 278 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133742 = t$133717;
        
        //#line 278 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133742) {
            
            //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133719 = ((long)(((long)(i0))));
            
            //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133718 = max0;
            
            //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133720 = ((long)(((long)(t$133718))));
            
            //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133724 = x10.runtime.impl.java.ULongUtils.le(t$133719, ((long)(t$133720)));
            
            //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133724) {
                
                //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133722 = ((long)(((long)(i1))));
                
                //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133721 = max1;
                
                //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133723 = ((long)(((long)(t$133721))));
                
                //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133724 = x10.runtime.impl.java.ULongUtils.le(t$133722, ((long)(t$133723)));
            }
            
            //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133728 = t$133724;
            
            //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133728) {
                
                //#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133726 = ((long)(((long)(i2))));
                
                //#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133725 = max2;
                
                //#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133727 = ((long)(((long)(t$133725))));
                
                //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133728 = x10.runtime.impl.java.ULongUtils.le(t$133726, ((long)(t$133727)));
            }
            
            //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133729 = t$133728;
            
            //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133729;
        } else {
            
            //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133730 = min0;
            
            //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133732 = ((i0) >= (((long)(t$133730))));
            
            //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133732) {
                
                //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133731 = max0;
                
                //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133732 = ((i0) <= (((long)(t$133731))));
            }
            
            //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133734 = t$133732;
            
            //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133734) {
                
                //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133733 = min1;
                
                //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133734 = ((i1) >= (((long)(t$133733))));
            }
            
            //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133736 = t$133734;
            
            //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133736) {
                
                //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133735 = max1;
                
                //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133736 = ((i1) <= (((long)(t$133735))));
            }
            
            //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133738 = t$133736;
            
            //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133738) {
                
                //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133737 = min2;
                
                //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133738 = ((i2) >= (((long)(t$133737))));
            }
            
            //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133740 = t$133738;
            
            //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133740) {
                
                //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133739 = max2;
                
                //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133740 = ((i2) <= (((long)(t$133739))));
            }
            
            //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133741 = t$133740;
            
            //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133741;
        }
    }
    
    public static boolean containsInternal$P$O(final long i0, final long i1, final long i2, final x10.regionarray.RectRegion RectRegion) {
        return RectRegion.containsInternal$O((long)(i0), (long)(i1), (long)(i2));
    }
    
    
    //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    private boolean containsInternal$O(final long i0, final long i1, final long i2, final long i3) {
        
        //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        boolean t$133743 = true;
        
        //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133743) {
            
            //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            t$133743 = zeroBased;
        }
        
        //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133776 = t$133743;
        
        //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133776) {
            
            //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133745 = ((long)(((long)(i0))));
            
            //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133744 = max0;
            
            //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133746 = ((long)(((long)(t$133744))));
            
            //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133750 = x10.runtime.impl.java.ULongUtils.le(t$133745, ((long)(t$133746)));
            
            //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133750) {
                
                //#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133748 = ((long)(((long)(i1))));
                
                //#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133747 = max1;
                
                //#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133749 = ((long)(((long)(t$133747))));
                
                //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133750 = x10.runtime.impl.java.ULongUtils.le(t$133748, ((long)(t$133749)));
            }
            
            //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133754 = t$133750;
            
            //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133754) {
                
                //#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133752 = ((long)(((long)(i2))));
                
                //#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133751 = max2;
                
                //#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133753 = ((long)(((long)(t$133751))));
                
                //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133754 = x10.runtime.impl.java.ULongUtils.le(t$133752, ((long)(t$133753)));
            }
            
            //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133758 = t$133754;
            
            //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133758) {
                
                //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133756 = ((long)(((long)(i3))));
                
                //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133755 = max3;
                
                //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133757 = ((long)(((long)(t$133755))));
                
                //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133758 = x10.runtime.impl.java.ULongUtils.le(t$133756, ((long)(t$133757)));
            }
            
            //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133759 = t$133758;
            
            //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133759;
        } else {
            
            //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133760 = min0;
            
            //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133762 = ((i0) >= (((long)(t$133760))));
            
            //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133762) {
                
                //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133761 = max0;
                
                //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133762 = ((i0) <= (((long)(t$133761))));
            }
            
            //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133764 = t$133762;
            
            //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133764) {
                
                //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133763 = min1;
                
                //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133764 = ((i1) >= (((long)(t$133763))));
            }
            
            //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133766 = t$133764;
            
            //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133766) {
                
                //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133765 = max1;
                
                //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133766 = ((i1) <= (((long)(t$133765))));
            }
            
            //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133768 = t$133766;
            
            //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133768) {
                
                //#line 298 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133767 = min2;
                
                //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133768 = ((i2) >= (((long)(t$133767))));
            }
            
            //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133770 = t$133768;
            
            //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133770) {
                
                //#line 298 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133769 = max2;
                
                //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133770 = ((i2) <= (((long)(t$133769))));
            }
            
            //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133772 = t$133770;
            
            //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133772) {
                
                //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133771 = min3;
                
                //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133772 = ((i3) >= (((long)(t$133771))));
            }
            
            //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$133774 = t$133772;
            
            //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133774) {
                
                //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133773 = max3;
                
                //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133774 = ((i3) <= (((long)(t$133773))));
            }
            
            //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133775 = t$133774;
            
            //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133775;
        }
    }
    
    public static boolean containsInternal$P$O(final long i0, final long i1, final long i2, final long i3, final x10.regionarray.RectRegion RectRegion) {
        return RectRegion.containsInternal$O((long)(i0), (long)(i1), (long)(i2), (long)(i3));
    }
    
    
    //#line 308 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public x10.regionarray.Region toPolyRegion() {
        
        //#line 309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.regionarray.Region t$133777 = ((x10.regionarray.Region)(polyRep));
        
        //#line 309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133788 = ((t$133777) == (null));
        
        //#line 309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133788) {
            
            //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133779 = rank;
            
            //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final x10.core.fun.Fun_0_1 t$133780 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.$Closure$241(this)));
            
            //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final x10.core.Rail t$133784 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(t$133779)), ((x10.core.fun.Fun_0_1)(t$133780)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
            
            //#line 311 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133782 = rank;
            
            //#line 311 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final x10.core.fun.Fun_0_1 t$133783 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.$Closure$242(this)));
            
            //#line 311 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final x10.core.Rail t$133785 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(t$133782)), ((x10.core.fun.Fun_0_1)(t$133783)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
            
            //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final x10.regionarray.Region t$133786 = ((x10.regionarray.Region)(x10.regionarray.Region.makeRectangularPoly__0$1x10$lang$Long$2__1$1x10$lang$Long$2(((x10.core.Rail)(t$133784)), ((x10.core.Rail)(t$133785)))));
            
            //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final x10.regionarray.Region t$133787 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                t$133786)));
            
            //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            this.polyRep = ((x10.regionarray.Region)(t$133787));
        }
        
        //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.regionarray.Region t$133789 = ((x10.regionarray.Region)(polyRep));
        
        //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return t$133789;
    }
    
    
    //#line 317 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public x10.regionarray.Region intersection(final x10.regionarray.Region that) {
        
        //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133827 = that.isEmpty$O();
        
        //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133827) {
            
            //#line 319 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return that;
        } else {
            
            //#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133826 = x10.regionarray.FullRegion.$RTT.isInstance(that);
            
            //#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133826) {
                
                //#line 321 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                return this;
            } else {
                
                //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final boolean t$133825 = x10.regionarray.RectRegion.$RTT.isInstance(that);
                
                //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                if (t$133825) {
                    
                    //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final x10.regionarray.RectRegion this$133321 = ((x10.regionarray.RectRegion)(x10.rtt.Types.<x10.regionarray.RectRegion> cast(that,x10.regionarray.RectRegion.$RTT)));
                    
                    //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final x10.core.fun.Fun_0_1 thatMin = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.$Closure$243(this$133321)));
                    
                    //#line 324 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final x10.regionarray.RectRegion this$133323 = ((x10.regionarray.RectRegion)(x10.rtt.Types.<x10.regionarray.RectRegion> cast(that,x10.regionarray.RectRegion.$RTT)));
                    
                    //#line 324 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final x10.core.fun.Fun_0_1 thatMax = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.$Closure$244(this$133323)));
                    
                    //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$133795 = rank;
                    
                    //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final x10.core.fun.Fun_0_1 t$133796 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.$Closure$245(this, thatMin, (x10.regionarray.RectRegion.$Closure$245.__1$1x10$lang$Long$3x10$lang$Long$2) null)));
                    
                    //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final x10.core.Rail newMin = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(t$133795)), ((x10.core.fun.Fun_0_1)(t$133796)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
                    
                    //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$133800 = rank;
                    
                    //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final x10.core.fun.Fun_0_1 t$133801 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.$Closure$246(this, thatMax, (x10.regionarray.RectRegion.$Closure$246.__1$1x10$lang$Long$3x10$lang$Long$2) null)));
                    
                    //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final x10.core.Rail newMax = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(t$133800)), ((x10.core.fun.Fun_0_1)(t$133801)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
                    
                    //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$134117 = ((x10.core.Rail<x10.core.Long>)newMin).size;
                    
                    //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long i$123924max$134118 = ((t$134117) - (((long)(1L))));
                    
                    //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    long i$134114 = 0L;
                    {
                        
                        //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long[] newMax$value$134182 = ((long[])newMax.value);
                        
                        //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long[] newMin$value$134183 = ((long[])newMin.value);
                        
                        //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        for (;
                             true;
                             ) {
                            
                            //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                            final long t$134115 = i$134114;
                            
                            //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                            final boolean t$134116 = ((t$134115) <= (((long)(i$123924max$134118))));
                            
                            //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                            if (!(t$134116)) {
                                
                                //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                                break;
                            }
                            
                            //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                            final long i$134111 = i$134114;
                            
                            //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                            final long t$134105 = ((long)newMax$value$134182[(int)i$134111]);
                            
                            //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                            final long t$134106 = ((long)newMin$value$134183[(int)i$134111]);
                            
                            //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                            final boolean t$134107 = ((t$134105) < (((long)(t$134106))));
                            
                            //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                            if (t$134107) {
                                
                                //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                                final long rank$134108 = rank;
                                
                                //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                                final x10.regionarray.EmptyRegion alloc$134109 = ((x10.regionarray.EmptyRegion)(new x10.regionarray.EmptyRegion((java.lang.System[]) null)));
                                
                                //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                                alloc$134109.x10$regionarray$EmptyRegion$$init$S(((long)(rank$134108)));
                                
                                //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                                final x10.regionarray.Region t$134110 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                                    alloc$134109)));
                                
                                //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                                return t$134110;
                            }
                            
                            //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                            final long t$134112 = i$134114;
                            
                            //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                            final long t$134113 = ((t$134112) + (((long)(1L))));
                            
                            //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                            i$134114 = t$134113;
                        }
                    }
                    
                    //#line 330 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final x10.regionarray.RectRegion alloc$123822 = ((x10.regionarray.RectRegion)(new x10.regionarray.RectRegion((java.lang.System[]) null)));
                    
                    //#line 330 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    alloc$123822.x10$regionarray$RectRegion$$init$S(((x10.core.Rail)(newMin)), ((x10.core.Rail)(newMax)), (x10.regionarray.RectRegion.__0$1x10$lang$Long$2__1$1x10$lang$Long$2) null);
                    
                    //#line 330 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final x10.regionarray.Region t$133812 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                        alloc$123822)));
                    
                    //#line 330 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    return t$133812;
                } else {
                    
                    //#line 331 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final boolean t$133824 = x10.regionarray.RectRegion1D.$RTT.isInstance(that);
                    
                    //#line 331 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    if (t$133824) {
                        
                        //#line 332 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long t$133813 = this.min$O((long)(0L));
                        
                        //#line 332 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long t$133814 = that.min$O((long)(0L));
                        
                        //#line 332 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long newMin = java.lang.Math.max(((long)(t$133813)),((long)(t$133814)));
                        
                        //#line 333 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long t$133815 = this.max$O((long)(0L));
                        
                        //#line 333 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long t$133816 = that.max$O((long)(0L));
                        
                        //#line 333 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long newMax = java.lang.Math.min(((long)(t$133815)),((long)(t$133816)));
                        
                        //#line 334 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final boolean t$133819 = ((newMax) < (((long)(newMin))));
                        
                        //#line 334 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        if (t$133819) {
                            
                            //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                            final x10.regionarray.EmptyRegion alloc$133327 = ((x10.regionarray.EmptyRegion)(new x10.regionarray.EmptyRegion((java.lang.System[]) null)));
                            
                            //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                            alloc$133327.x10$regionarray$EmptyRegion$$init$S(((long)(1L)));
                            
                            //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                            final x10.regionarray.Region t$133817 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                                alloc$133327)));
                            
                            //#line 334 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                            final x10.regionarray.Region t$133818 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                                t$133817)));
                            
                            //#line 334 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                            return t$133818;
                        }
                        
                        //#line 335 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final x10.regionarray.RectRegion1D alloc$123823 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
                        
                        //#line 335 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        alloc$123823.x10$regionarray$RectRegion1D$$init$S(((long)(newMin)), ((long)(newMax)));
                        
                        //#line 335 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final x10.regionarray.Region t$133820 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                            alloc$123823)));
                        
                        //#line 335 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        return t$133820;
                    } else {
                        
                        //#line 338 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final x10.regionarray.Region t$133821 = ((x10.regionarray.Region)(this.toPolyRegion()));
                        
                        //#line 338 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final x10.regionarray.Region t$133822 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                            t$133821)));
                        
                        //#line 338 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final x10.regionarray.Region t$133823 = ((x10.regionarray.Region)(t$133822.intersection(((x10.regionarray.Region)(that)))));
                        
                        //#line 338 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        return t$133823;
                    }
                }
            }
        }
    }
    
    
    //#line 344 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public x10.regionarray.Region product(final x10.regionarray.Region that) {
        
        //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133878 = that.isEmpty$O();
        
        //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133878) {
            
            //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133828 = rank;
            
            //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133829 = that.rank;
            
            //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long rank$133328 = ((t$133828) + (((long)(t$133829))));
            
            //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.EmptyRegion alloc$133329 = ((x10.regionarray.EmptyRegion)(new x10.regionarray.EmptyRegion((java.lang.System[]) null)));
            
            //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            alloc$133329.x10$regionarray$EmptyRegion$$init$S(((long)(rank$133328)));
            
            //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.Region t$133830 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                alloc$133329)));
            
            //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133830;
        } else {
            
            //#line 347 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133877 = x10.regionarray.RectRegion.$RTT.isInstance(that);
            
            //#line 347 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133877) {
                
                //#line 348 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final x10.regionarray.RectRegion this$133331 = ((x10.regionarray.RectRegion)(x10.rtt.Types.<x10.regionarray.RectRegion> cast(that,x10.regionarray.RectRegion.$RTT)));
                
                //#line 348 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final x10.core.fun.Fun_0_1 thatMin = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.$Closure$247(this$133331)));
                
                //#line 349 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final x10.regionarray.RectRegion this$133333 = ((x10.regionarray.RectRegion)(x10.rtt.Types.<x10.regionarray.RectRegion> cast(that,x10.regionarray.RectRegion.$RTT)));
                
                //#line 349 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final x10.core.fun.Fun_0_1 thatMax = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.$Closure$248(this$133333)));
                
                //#line 350 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133833 = rank;
                
                //#line 350 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133834 = that.rank;
                
                //#line 350 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long k = ((t$133833) + (((long)(t$133834))));
                
                //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final x10.core.fun.Fun_0_1 t$133841 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.$Closure$249(this, this.rank, thatMin, (x10.regionarray.RectRegion.$Closure$249.__2$1x10$lang$Long$3x10$lang$Long$2) null)));
                
                //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final x10.core.Rail newMin = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(k)), ((x10.core.fun.Fun_0_1)(t$133841)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
                
                //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final x10.core.fun.Fun_0_1 t$133848 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.$Closure$250(this, this.rank, thatMax, (x10.regionarray.RectRegion.$Closure$250.__2$1x10$lang$Long$3x10$lang$Long$2) null)));
                
                //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final x10.core.Rail newMax = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(k)), ((x10.core.fun.Fun_0_1)(t$133848)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
                
                //#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final x10.regionarray.RectRegion alloc$123824 = ((x10.regionarray.RectRegion)(new x10.regionarray.RectRegion((java.lang.System[]) null)));
                
                //#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                alloc$123824.x10$regionarray$RectRegion$$init$S(((x10.core.Rail)(newMin)), ((x10.core.Rail)(newMax)), (x10.regionarray.RectRegion.__0$1x10$lang$Long$2__1$1x10$lang$Long$2) null);
                
                //#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                return alloc$123824;
            } else {
                
                //#line 354 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final boolean t$133876 = x10.regionarray.RectRegion1D.$RTT.isInstance(that);
                
                //#line 354 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                if (t$133876) {
                    
                    //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long thatMin = that.min$O((long)(0L));
                    
                    //#line 356 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long thatMax = that.max$O((long)(0L));
                    
                    //#line 357 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$133849 = rank;
                    
                    //#line 357 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long k = ((t$133849) + (((long)(1L))));
                    
                    //#line 358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final x10.core.fun.Fun_0_1 t$133854 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.$Closure$251(this, this.rank, thatMin)));
                    
                    //#line 358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final x10.core.Rail newMin = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(k)), ((x10.core.fun.Fun_0_1)(t$133854)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
                    
                    //#line 359 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final x10.core.fun.Fun_0_1 t$133859 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.$Closure$252(this, this.rank, thatMax)));
                    
                    //#line 359 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final x10.core.Rail newMax = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(k)), ((x10.core.fun.Fun_0_1)(t$133859)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
                    
                    //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final x10.regionarray.RectRegion alloc$123825 = ((x10.regionarray.RectRegion)(new x10.regionarray.RectRegion((java.lang.System[]) null)));
                    
                    //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    alloc$123825.x10$regionarray$RectRegion$$init$S(((x10.core.Rail)(newMin)), ((x10.core.Rail)(newMax)), (x10.regionarray.RectRegion.__0$1x10$lang$Long$2__1$1x10$lang$Long$2) null);
                    
                    //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    return alloc$123825;
                } else {
                    
                    //#line 361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final boolean t$133875 = x10.regionarray.FullRegion.$RTT.isInstance(that);
                    
                    //#line 361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    if (t$133875) {
                        
                        //#line 362 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long t$133860 = rank;
                        
                        //#line 362 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long t$133861 = that.rank;
                        
                        //#line 362 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long k = ((t$133860) + (((long)(t$133861))));
                        
                        //#line 363 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final x10.core.fun.Fun_0_1 t$133866 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.$Closure$253(this, this.rank)));
                        
                        //#line 363 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final x10.core.Rail newMin = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(k)), ((x10.core.fun.Fun_0_1)(t$133866)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
                        
                        //#line 364 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final x10.core.fun.Fun_0_1 t$133871 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.$Closure$254(this, this.rank)));
                        
                        //#line 364 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final x10.core.Rail newMax = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(k)), ((x10.core.fun.Fun_0_1)(t$133871)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
                        
                        //#line 365 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final x10.regionarray.RectRegion alloc$123826 = ((x10.regionarray.RectRegion)(new x10.regionarray.RectRegion((java.lang.System[]) null)));
                        
                        //#line 365 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        alloc$123826.x10$regionarray$RectRegion$$init$S(((x10.core.Rail)(newMin)), ((x10.core.Rail)(newMax)), (x10.regionarray.RectRegion.__0$1x10$lang$Long$2__1$1x10$lang$Long$2) null);
                        
                        //#line 365 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        return alloc$123826;
                    } else {
                        
                        //#line 367 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final x10.regionarray.Region t$133872 = ((x10.regionarray.Region)(this.toPolyRegion()));
                        
                        //#line 367 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final x10.regionarray.Region t$133873 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                            t$133872)));
                        
                        //#line 367 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final x10.regionarray.Region t$133874 = ((x10.regionarray.Region)(t$133873.product(((x10.regionarray.Region)(that)))));
                        
                        //#line 367 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        return t$133874;
                    }
                }
            }
        }
    }
    
    
    //#line 371 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public x10.regionarray.Region translate(final x10.lang.Point v) {
        
        //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$133882 = rank;
        
        //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.core.fun.Fun_0_1 t$133883 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.$Closure$255(this, v)));
        
        //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.core.Rail newMin = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(t$133882)), ((x10.core.fun.Fun_0_1)(t$133883)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
        
        //#line 373 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$133887 = rank;
        
        //#line 373 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.core.fun.Fun_0_1 t$133888 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.$Closure$256(this, v)));
        
        //#line 373 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.core.Rail newMax = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(t$133887)), ((x10.core.fun.Fun_0_1)(t$133888)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
        
        //#line 374 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.regionarray.RectRegion alloc$123827 = ((x10.regionarray.RectRegion)(new x10.regionarray.RectRegion((java.lang.System[]) null)));
        
        //#line 374 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        alloc$123827.x10$regionarray$RectRegion$$init$S(((x10.core.Rail)(newMin)), ((x10.core.Rail)(newMax)), (x10.regionarray.RectRegion.__0$1x10$lang$Long$2__1$1x10$lang$Long$2) null);
        
        //#line 374 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.regionarray.Region t$133889 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                            alloc$123827)));
        
        //#line 374 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return t$133889;
    }
    
    
    //#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public x10.regionarray.Region projection(final long axis) {
        
        //#line 378 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.regionarray.RectRegion alloc$123828 = ((x10.regionarray.RectRegion)(new x10.regionarray.RectRegion((java.lang.System[]) null)));
        
        //#line 104 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long min$133334 = this.min$O((long)(axis));
        
        //#line 104 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long max$133335 = this.max$O((long)(axis));
        
        //#line 556 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final boolean z$134120 = ((long) min$133334) == ((long) 0L);
        
        //#line 557 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final boolean isRail$134119 = z$134120;
        
        //#line 558 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        alloc$123828.rank = 1L;
        
        //#line 558 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        alloc$123828.rect = true;
        
        //#line 558 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        alloc$123828.zeroBased = z$134120;
        
        //#line 558 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        alloc$123828.rail = isRail$134119;
        {
            
        }
        
        //#line 21 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        alloc$123828.polyRep = null;
        
        //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$134121 = java.lang.Long.MIN_VALUE;
        
        //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        boolean t$134122 = ((long) min$133334) == ((long) t$134121);
        
        //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$134122) {
            
            //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$134123 = java.lang.Long.MAX_VALUE;
            
            //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            t$134122 = ((long) max$133335) == ((long) t$134123);
        }
        
        //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$134124 = t$134122;
        
        //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        long t$134125 =  0;
        
        //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$134124) {
            
            //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            t$134125 = -1L;
        } else {
            
            //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$134126 = ((max$133335) - (((long)(min$133334))));
            
            //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            t$134125 = ((t$134126) + (((long)(1L))));
        }
        
        //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$134127 = t$134125;
        
        //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        alloc$123828.size = t$134127;
        
        //#line 108 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        alloc$123828.min0 = min$133334;
        
        //#line 109 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        alloc$123828.max0 = max$133335;
        
        //#line 111 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$134128 = alloc$123828.min3 = 0L;
        
        //#line 111 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$134129 = alloc$123828.min2 = t$134128;
        
        //#line 111 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        alloc$123828.min1 = t$134129;
        
        //#line 112 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$134130 = alloc$123828.max3 = 0L;
        
        //#line 112 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$134131 = alloc$123828.max2 = t$134130;
        
        //#line 112 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        alloc$123828.max1 = t$134131;
        
        //#line 113 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        alloc$123828.mins = null;
        
        //#line 114 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        alloc$123828.maxs = null;
        
        //#line 378 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return alloc$123828;
    }
    
    
    //#line 381 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public x10.regionarray.Region eliminate(final long axis) {
        
        //#line 382 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$133901 = rank;
        
        //#line 382 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long k = ((t$133901) - (((long)(1L))));
        
        //#line 383 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.core.fun.Fun_0_1 t$133906 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.$Closure$257(this, axis)));
        
        //#line 383 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.core.Rail newMin = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(k)), ((x10.core.fun.Fun_0_1)(t$133906)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
        
        //#line 384 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.core.fun.Fun_0_1 t$133911 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.$Closure$258(this, axis)));
        
        //#line 384 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.core.Rail newMax = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(k)), ((x10.core.fun.Fun_0_1)(t$133911)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
        
        //#line 385 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.regionarray.RectRegion alloc$123829 = ((x10.regionarray.RectRegion)(new x10.regionarray.RectRegion((java.lang.System[]) null)));
        
        //#line 385 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        alloc$123829.x10$regionarray$RectRegion$$init$S(((x10.core.Rail)(newMin)), ((x10.core.Rail)(newMax)), (x10.regionarray.RectRegion.__0$1x10$lang$Long$2__1$1x10$lang$Long$2) null);
        
        //#line 385 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return alloc$123829;
    }
    
    
    //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    @x10.runtime.impl.java.X10Generated
    public static class RRIterator extends x10.core.Ref implements x10.lang.Iterator, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<RRIterator> $RTT = 
            x10.rtt.NamedType.<RRIterator> make("x10.regionarray.RectRegion.RRIterator",
                                                RRIterator.class,
                                                new x10.rtt.Type[] {
                                                    x10.rtt.ParameterizedType.make(x10.lang.Iterator.$RTT, x10.lang.Point.$RTT)
                                                });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.RRIterator $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.min = $deserializer.readObject();
            $_obj.max = $deserializer.readObject();
            $_obj.done = $deserializer.readBoolean();
            $_obj.cur = $deserializer.readObject();
            $_obj.myRank = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.RRIterator $_obj = new x10.regionarray.RectRegion.RRIterator((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.min);
            $serializer.write(this.max);
            $serializer.write(this.done);
            $serializer.write(this.cur);
            $serializer.write(this.myRank);
            
        }
        
        // constructor just for allocation
        public RRIterator(final java.lang.System[] $dummy) {
            
        }
        
        // bridge for method abstract public x10.lang.Iterator[T].next(){}:T
        public x10.lang.Point next$G() {
            return next();
        }
        
        
        // properties
        
        //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        public long myRank;
        
    
        
        //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        public x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long> min;
        
        //#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        public x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long> max;
        
        //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        public boolean done;
        
        //#line 393 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        public x10.core.Rail<x10.core.Long> cur;
        
        
        //#line 395 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        // creation method for java code (1-phase java constructor)
        public RRIterator(final x10.regionarray.RectRegion rr) {
            this((java.lang.System[]) null);
            x10$regionarray$RectRegion$RRIterator$$init$S(rr);
        }
        
        // constructor for non-virtual call
        final public x10.regionarray.RectRegion.RRIterator x10$regionarray$RectRegion$RRIterator$$init$S(final x10.regionarray.RectRegion rr) {
             {
                
                //#line 396 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$134132 = rr.rank;
                
                //#line 396 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                this.myRank = t$134132;
                
                
                //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final x10.regionarray.RectRegion.RRIterator this$134133 = this;
                
                //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                this$134133.done = false;
                
                //#line 397 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final x10.core.fun.Fun_0_1 t = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.RRIterator.$Closure$234(rr)));
                
                //#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                this.min = ((x10.core.fun.Fun_0_1)(t));
                
                //#line 224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final x10.core.fun.Fun_0_1 t$133915 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.RRIterator.$Closure$235(rr)));
                
                //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                this.max = ((x10.core.fun.Fun_0_1)(t$133915));
                
                //#line 400 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133916 = rr.size;
                
                //#line 400 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final boolean t$133917 = ((long) t$133916) == ((long) 0L);
                
                //#line 400 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                this.done = t$133917;
                
                //#line 401 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133919 = myRank;
                
                //#line 401 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final x10.core.fun.Fun_0_1 t$133920 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.RRIterator.$Closure$236(t, (x10.regionarray.RectRegion.RRIterator.$Closure$236.__0$1x10$lang$Long$3x10$lang$Long$2) null)));
                
                //#line 401 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final x10.core.Rail t$133921 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(t$133919)), ((x10.core.fun.Fun_0_1)(t$133920)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
                
                //#line 401 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                this.cur = ((x10.core.Rail)(t$133921));
            }
            return this;
        }
        
        
        
        //#line 404 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        public boolean hasNext$O() {
            
            //#line 404 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133922 = done;
            
            //#line 404 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133923 = !(t$133922);
            
            //#line 404 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133923;
        }
        
        
        //#line 406 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        public x10.lang.Point next() {
            
            //#line 407 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final x10.core.Rail t$133924 = ((x10.core.Rail)(cur));
            
            //#line 407 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final x10.lang.Point ans = ((x10.lang.Point)(x10.lang.Point.make__0$1x10$lang$Long$2(((x10.core.Rail)(t$133924)))));
            
            //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final x10.core.Rail t$133926 = ((x10.core.Rail)(cur));
            
            //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133925 = myRank;
            
            //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133927 = ((t$133925) - (((long)(1L))));
            
            //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133931 = ((long[])t$133926.value)[(int)t$133927];
            
            //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final x10.core.fun.Fun_0_1 t$133929 = ((x10.core.fun.Fun_0_1)(max));
            
            //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133928 = myRank;
            
            //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133930 = ((t$133928) - (((long)(1L))));
            
            //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133932 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)t$133929).$apply(x10.core.Long.$box(t$133930), x10.rtt.Types.LONG));
            
            //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133973 = ((t$133931) < (((long)(t$133932))));
            
            //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133973) {
                
                //#line 409 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final x10.core.Rail a$123526 = ((x10.core.Rail)(cur));
                
                //#line 409 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133933 = myRank;
                
                //#line 409 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long i0$123527 = ((t$133933) - (((long)(1L))));
                
                //#line 409 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133934 = ((long[])a$123526.value)[(int)i0$123527];
                
                //#line 409 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long r$123535 = ((t$133934) + (((long)(1L))));
                
                //#line 409 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                ((long[])a$123526.value)[(int)i0$123527] = r$123535;
            } else {
                
                //#line 411 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133935 = myRank;
                
                //#line 411 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final boolean t$133972 = ((long) t$133935) == ((long) 1L);
                
                //#line 411 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                if (t$133972) {
                    
                    //#line 412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    this.done = true;
                } else {
                    
                    //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final x10.core.Rail t$133940 = ((x10.core.Rail)(cur));
                    
                    //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$133936 = myRank;
                    
                    //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$133941 = ((t$133936) - (((long)(1L))));
                    
                    //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final x10.core.fun.Fun_0_1 t$133938 = ((x10.core.fun.Fun_0_1)(min));
                    
                    //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$133937 = myRank;
                    
                    //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$133939 = ((t$133937) - (((long)(1L))));
                    
                    //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$133942 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)t$133938).$apply(x10.core.Long.$box(t$133939), x10.rtt.Types.LONG));
                    
                    //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    ((long[])t$133940.value)[(int)t$133941] = t$133942;
                    
                    //#line 416 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final x10.core.Rail a$123559 = ((x10.core.Rail)(cur));
                    
                    //#line 416 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$133943 = myRank;
                    
                    //#line 416 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long i0$123560 = ((t$133943) - (((long)(2L))));
                    
                    //#line 416 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$133944 = ((long[])a$123559.value)[(int)i0$123560];
                    
                    //#line 416 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long r$123568 = ((t$133944) + (((long)(1L))));
                    
                    //#line 416 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    ((long[])a$123559.value)[(int)i0$123560] = r$123568;
                    
                    //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$133945 = myRank;
                    
                    //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    long carryRank = ((t$133945) - (((long)(2L))));
                    
                    //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    while (true) {
                        
                        //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long t$133946 = carryRank;
                        
                        //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        boolean t$133953 = ((t$133946) > (((long)(0L))));
                        
                        //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        if (t$133953) {
                            
                            //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                            final x10.core.Rail t$133947 = ((x10.core.Rail)(cur));
                            
                            //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                            final long t$133948 = carryRank;
                            
                            //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                            final long t$133951 = ((long[])t$133947.value)[(int)t$133948];
                            
                            //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                            final x10.core.fun.Fun_0_1 t$133949 = ((x10.core.fun.Fun_0_1)(max));
                            
                            //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                            final long t$133950 = carryRank;
                            
                            //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                            final long t$133952 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)t$133949).$apply(x10.core.Long.$box(t$133950), x10.rtt.Types.LONG));
                            
                            //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                            t$133953 = ((t$133951) > (((long)(t$133952))));
                        }
                        
                        //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final boolean t$133964 = t$133953;
                        
                        //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        if (!(t$133964)) {
                            
                            //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                            break;
                        }
                        
                        //#line 419 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final x10.core.Rail t$134134 = ((x10.core.Rail)(cur));
                        
                        //#line 419 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long t$134135 = carryRank;
                        
                        //#line 419 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final x10.core.fun.Fun_0_1 t$134136 = ((x10.core.fun.Fun_0_1)(min));
                        
                        //#line 419 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long t$134137 = carryRank;
                        
                        //#line 419 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long t$134138 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)t$134136).$apply(x10.core.Long.$box(t$134137), x10.rtt.Types.LONG));
                        
                        //#line 419 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        ((long[])t$134134.value)[(int)t$134135] = t$134138;
                        
                        //#line 420 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final x10.core.Rail a$134139 = ((x10.core.Rail)(cur));
                        
                        //#line 420 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long t$134140 = carryRank;
                        
                        //#line 420 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long t$134141 = ((long)(((int)(1))));
                        
                        //#line 420 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long i$134142 = ((t$134140) - (((long)(t$134141))));
                        
                        //#line 420 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long t$134143 = ((long[])a$134139.value)[(int)i$134142];
                        
                        //#line 420 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long r$134144 = ((t$134143) + (((long)(1L))));
                        
                        //#line 420 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        ((long[])a$134139.value)[(int)i$134142] = r$134144;
                        
                        //#line 421 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long t$134145 = carryRank;
                        
                        //#line 421 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long t$134146 = ((t$134145) - (((long)(1L))));
                        
                        //#line 421 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        carryRank = t$134146;
                    }
                    
                    //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final long t$133965 = carryRank;
                    
                    //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    boolean t$133970 = ((long) t$133965) == ((long) 0L);
                    
                    //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    if (t$133970) {
                        
                        //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final x10.core.Rail t$133966 = ((x10.core.Rail)(cur));
                        
                        //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long t$133968 = ((long[])t$133966.value)[(int)0L];
                        
                        //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final x10.core.fun.Fun_0_1 t$133967 = ((x10.core.fun.Fun_0_1)(max));
                        
                        //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        final long t$133969 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)t$133967).$apply(x10.core.Long.$box(0L), x10.rtt.Types.LONG));
                        
                        //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        t$133970 = ((t$133968) > (((long)(t$133969))));
                    }
                    
                    //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    final boolean t$133971 = t$133970;
                    
                    //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                    if (t$133971) {
                        
                        //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                        this.done = true;
                    }
                }
            }
            
            //#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final x10.lang.Point t$133974 = ((x10.lang.Point)(((x10.lang.Point)
                                                                ans)));
            
            //#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133974;
        }
        
        
        //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final public x10.regionarray.RectRegion.RRIterator x10$regionarray$RectRegion$RRIterator$$this$x10$regionarray$RectRegion$RRIterator() {
            
            //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return x10.regionarray.RectRegion.RRIterator.this;
        }
        
        
        //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final public void __fieldInitializers_x10_regionarray_RectRegion_RRIterator() {
            
            //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            this.done = false;
        }
        
        @x10.runtime.impl.java.X10Generated
        final public static class $Closure$234 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<$Closure$234> $RTT = 
                x10.rtt.StaticFunType.<$Closure$234> make($Closure$234.class,
                                                          new x10.rtt.Type[] {
                                                              x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                          });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { return null; }
            
            public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.RRIterator.$Closure$234 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                $_obj.rr = $deserializer.readObject();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                x10.regionarray.RectRegion.RRIterator.$Closure$234 $_obj = new x10.regionarray.RectRegion.RRIterator.$Closure$234((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                $serializer.write(this.rr);
                
            }
            
            // constructor just for allocation
            public $Closure$234(final java.lang.System[] $dummy) {
                
            }
            
            // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
                
            }
            
            // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
            public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
                return $apply$O(x10.core.Long.$unbox(a1));
                
            }
            
            
        
            
            public long $apply$O(final long i$133349) {
                
                //#line 223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133913 = this.rr.min$O((long)(i$133349));
                
                //#line 223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                return t$133913;
            }
            
            public x10.regionarray.RectRegion rr;
            
            public $Closure$234(final x10.regionarray.RectRegion rr) {
                 {
                    this.rr = rr;
                }
            }
            
        }
        
        @x10.runtime.impl.java.X10Generated
        final public static class $Closure$235 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<$Closure$235> $RTT = 
                x10.rtt.StaticFunType.<$Closure$235> make($Closure$235.class,
                                                          new x10.rtt.Type[] {
                                                              x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                          });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { return null; }
            
            public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.RRIterator.$Closure$235 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                $_obj.rr = $deserializer.readObject();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                x10.regionarray.RectRegion.RRIterator.$Closure$235 $_obj = new x10.regionarray.RectRegion.RRIterator.$Closure$235((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                $serializer.write(this.rr);
                
            }
            
            // constructor just for allocation
            public $Closure$235(final java.lang.System[] $dummy) {
                
            }
            
            // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
                
            }
            
            // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
            public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
                return $apply$O(x10.core.Long.$unbox(a1));
                
            }
            
            
        
            
            public long $apply$O(final long i$133350) {
                
                //#line 224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133914 = this.rr.max$O((long)(i$133350));
                
                //#line 224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                return t$133914;
            }
            
            public x10.regionarray.RectRegion rr;
            
            public $Closure$235(final x10.regionarray.RectRegion rr) {
                 {
                    this.rr = rr;
                }
            }
            
        }
        
        @x10.runtime.impl.java.X10Generated
        final public static class $Closure$236 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<$Closure$236> $RTT = 
                x10.rtt.StaticFunType.<$Closure$236> make($Closure$236.class,
                                                          new x10.rtt.Type[] {
                                                              x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                          });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { return null; }
            
            public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.RRIterator.$Closure$236 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                $_obj.t = $deserializer.readObject();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                x10.regionarray.RectRegion.RRIterator.$Closure$236 $_obj = new x10.regionarray.RectRegion.RRIterator.$Closure$236((java.lang.System[]) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                $serializer.write(this.t);
                
            }
            
            // constructor just for allocation
            public $Closure$236(final java.lang.System[] $dummy) {
                
            }
            
            // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
                
            }
            
            // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
            public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
                return $apply$O(x10.core.Long.$unbox(a1));
                
            }
            
            // synthetic type for parameter mangling
            public static final class __0$1x10$lang$Long$3x10$lang$Long$2 {}
            
        
            
            public long $apply$O(final long l) {
                
                //#line 401 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133918 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)this.t).$apply(x10.core.Long.$box(l), x10.rtt.Types.LONG));
                
                //#line 401 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                return t$133918;
            }
            
            public x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long> t;
            
            public $Closure$236(final x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long> t, __0$1x10$lang$Long$3x10$lang$Long$2 $dummy) {
                 {
                    this.t = ((x10.core.fun.Fun_0_1)(t));
                }
            }
            
        }
        
    }
    
    
    
    //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public x10.lang.Iterator iterator() {
        
        //#line 432 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.regionarray.RectRegion.RRIterator alloc$123830 = ((x10.regionarray.RectRegion.RRIterator)(new x10.regionarray.RectRegion.RRIterator((java.lang.System[]) null)));
        
        //#line 432 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        alloc$123830.x10$regionarray$RectRegion$RRIterator$$init$S(((x10.regionarray.RectRegion)(this)));
        
        //#line 432 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return alloc$123830;
    }
    
    
    //#line 436 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public boolean equals(final java.lang.Object thatObj) {
        
        //#line 437 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133975 = x10.rtt.Equality.equalsequals((this),(thatObj));
        
        //#line 437 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133975) {
            
            //#line 437 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return true;
        }
        
        //#line 438 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133976 = x10.regionarray.Region.$RTT.isInstance(thatObj);
        
        //#line 438 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133977 = !(t$133976);
        
        //#line 438 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133977) {
            
            //#line 438 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return false;
        }
        
        //#line 439 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.regionarray.Region that = x10.rtt.Types.<x10.regionarray.Region> cast(thatObj,x10.regionarray.Region.$RTT);
        
        //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133978 = x10.regionarray.RectRegion.$RTT.isInstance(that);
        
        //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133980 = !(t$133978);
        
        //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133980) {
            
            //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133979 = super.equals(((java.lang.Object)(that)));
            
            //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133979;
        }
        
        //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$133981 = this.rank;
        
        //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$133982 = that.rank;
        
        //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$133983 = ((long) t$133981) != ((long) t$133982);
        
        //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$133983) {
            
            //#line 447 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return false;
        }
        
        //#line 450 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.regionarray.RectRegion this$133352 = ((x10.regionarray.RectRegion)(this));
        
        //#line 450 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.core.fun.Fun_0_1 thisMin = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.$Closure$259(this$133352)));
        
        //#line 451 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.regionarray.RectRegion this$133354 = ((x10.regionarray.RectRegion)(this));
        
        //#line 451 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.core.fun.Fun_0_1 thisMax = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.$Closure$260(this$133354)));
        
        //#line 452 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.regionarray.RectRegion this$133356 = ((x10.regionarray.RectRegion)(x10.rtt.Types.<x10.regionarray.RectRegion> cast(that,x10.regionarray.RectRegion.$RTT)));
        
        //#line 452 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.core.fun.Fun_0_1 thatMin = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.$Closure$261(this$133356)));
        
        //#line 453 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.regionarray.RectRegion this$133358 = ((x10.regionarray.RectRegion)(x10.rtt.Types.<x10.regionarray.RectRegion> cast(that,x10.regionarray.RectRegion.$RTT)));
        
        //#line 453 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.core.fun.Fun_0_1 thatMax = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.$Closure$262(this$133358)));
        
        //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$134159 = rank;
        
        //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long i$123942max$134160 = ((t$134159) - (((long)(1L))));
        
        //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        long i$134156 = 0L;
        
        //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        for (;
             true;
             ) {
            
            //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$134157 = i$134156;
            
            //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$134158 = ((t$134157) <= (((long)(i$123942max$134160))));
            
            //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (!(t$134158)) {
                
                //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                break;
            }
            
            //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long i$134153 = i$134156;
            
            //#line 457 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$134147 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)thisMin).$apply(x10.core.Long.$box(i$134153), x10.rtt.Types.LONG));
            
            //#line 457 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$134148 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)thatMin).$apply(x10.core.Long.$box(i$134153), x10.rtt.Types.LONG));
            
            //#line 457 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            boolean t$134149 = ((long) t$134147) != ((long) t$134148);
            
            //#line 457 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (!(t$134149)) {
                
                //#line 457 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$134150 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)thisMax).$apply(x10.core.Long.$box(i$134153), x10.rtt.Types.LONG));
                
                //#line 457 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$134151 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)thatMax).$apply(x10.core.Long.$box(i$134153), x10.rtt.Types.LONG));
                
                //#line 457 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$134149 = ((long) t$134150) != ((long) t$134151);
            }
            
            //#line 457 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$134152 = t$134149;
            
            //#line 457 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$134152) {
                
                //#line 458 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                return false;
            }
            
            //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$134154 = i$134156;
            
            //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$134155 = ((t$134154) + (((long)(1L))));
            
            //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            i$134156 = t$134155;
        }
        
        //#line 460 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return true;
    }
    
    
    //#line 463 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    public java.lang.String toString() {
        
        //#line 464 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.regionarray.RectRegion this$133360 = ((x10.regionarray.RectRegion)(this));
        
        //#line 464 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.core.fun.Fun_0_1 thisMin = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.$Closure$263(this$133360)));
        
        //#line 465 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.regionarray.RectRegion this$133362 = ((x10.regionarray.RectRegion)(this));
        
        //#line 465 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final x10.core.fun.Fun_0_1 thisMax = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion.$Closure$264(this$133362)));
        
        //#line 466 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        java.lang.String s = "[";
        
        //#line 467 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$134177 = rank;
        
        //#line 467 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long i$123960max$134178 = ((t$134177) - (((long)(1L))));
        
        //#line 467 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        long i$134174 = 0L;
        
        //#line 467 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        for (;
             true;
             ) {
            
            //#line 467 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$134175 = i$134174;
            
            //#line 467 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$134176 = ((t$134175) <= (((long)(i$123960max$134178))));
            
            //#line 467 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (!(t$134176)) {
                
                //#line 467 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                break;
            }
            
            //#line 467 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long i$134171 = i$134174;
            
            //#line 468 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$134161 = ((i$134171) > (((long)(0L))));
            
            //#line 468 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$134161) {
                
                //#line 468 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final java.lang.String t$134162 = ((java.lang.String)(s));
                
                //#line 468 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final java.lang.String t$134163 = ((t$134162) + (","));
                
                //#line 468 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                s = ((java.lang.String)(t$134163));
            }
            
            //#line 469 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final java.lang.String t$134164 = ((java.lang.String)(s));
            
            //#line 469 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$134165 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)thisMin).$apply(x10.core.Long.$box(i$134171), x10.rtt.Types.LONG));
            
            //#line 469 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final java.lang.String t$134166 = (("") + ((x10.core.Long.$box(t$134165))));
            
            //#line 469 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final java.lang.String t$134167 = ((t$134166) + (".."));
            
            //#line 469 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$134168 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)thisMax).$apply(x10.core.Long.$box(i$134171), x10.rtt.Types.LONG));
            
            //#line 469 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final java.lang.String t$134169 = ((t$134167) + ((x10.core.Long.$box(t$134168))));
            
            //#line 469 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final java.lang.String t$134170 = ((t$134164) + (t$134169));
            
            //#line 469 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            s = ((java.lang.String)(t$134170));
            
            //#line 467 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$134172 = i$134174;
            
            //#line 467 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$134173 = ((t$134172) + (((long)(1L))));
            
            //#line 467 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            i$134174 = t$134173;
        }
        
        //#line 471 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final java.lang.String t$134018 = ((java.lang.String)(s));
        
        //#line 471 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final java.lang.String t$134019 = ((t$134018) + ("]"));
        
        //#line 471 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        s = ((java.lang.String)(t$134019));
        
        //#line 472 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final java.lang.String t$134020 = ((java.lang.String)(s));
        
        //#line 472 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return t$134020;
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    final public x10.regionarray.RectRegion x10$regionarray$RectRegion$$this$x10$regionarray$RectRegion() {
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return x10.regionarray.RectRegion.this;
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    final public void __fieldInitializers_x10_regionarray_RectRegion() {
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        this.polyRep = null;
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$237 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$237> $RTT = 
            x10.rtt.StaticFunType.<$Closure$237> make($Closure$237.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.$Closure$237 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.$Closure$237 $_obj = new x10.regionarray.RectRegion.$Closure$237((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            
        }
        
        // constructor just for allocation
        public $Closure$237(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133624 = this.out$$.min$O((long)(i));
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133624;
        }
        
        public x10.regionarray.RectRegion out$$;
        
        public $Closure$237(final x10.regionarray.RectRegion out$$) {
             {
                this.out$$ = out$$;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$238 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$238> $RTT = 
            x10.rtt.StaticFunType.<$Closure$238> make($Closure$238.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.$Closure$238 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.$Closure$238 $_obj = new x10.regionarray.RectRegion.$Closure$238((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            
        }
        
        // constructor just for allocation
        public $Closure$238(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133626 = this.out$$.max$O((long)(i));
            
            //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133626;
        }
        
        public x10.regionarray.RectRegion out$$;
        
        public $Closure$238(final x10.regionarray.RectRegion out$$) {
             {
                this.out$$ = out$$;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$239 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$239> $RTT = 
            x10.rtt.StaticFunType.<$Closure$239> make($Closure$239.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.$Closure$239 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.this$133315 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.$Closure$239 $_obj = new x10.regionarray.RectRegion.$Closure$239((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.this$133315);
            
        }
        
        // constructor just for allocation
        public $Closure$239(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i$133314) {
            
            //#line 223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133628 = this.this$133315.min$O((long)(i$133314));
            
            //#line 223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133628;
        }
        
        public x10.regionarray.RectRegion this$133315;
        
        public $Closure$239(final x10.regionarray.RectRegion this$133315) {
             {
                this.this$133315 = ((x10.regionarray.RectRegion)(this$133315));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$240 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$240> $RTT = 
            x10.rtt.StaticFunType.<$Closure$240> make($Closure$240.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.$Closure$240 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.this$133317 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.$Closure$240 $_obj = new x10.regionarray.RectRegion.$Closure$240((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.this$133317);
            
        }
        
        // constructor just for allocation
        public $Closure$240(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i$133316) {
            
            //#line 224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133629 = this.this$133317.max$O((long)(i$133316));
            
            //#line 224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133629;
        }
        
        public x10.regionarray.RectRegion this$133317;
        
        public $Closure$240(final x10.regionarray.RectRegion this$133317) {
             {
                this.this$133317 = ((x10.regionarray.RectRegion)(this$133317));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$241 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$241> $RTT = 
            x10.rtt.StaticFunType.<$Closure$241> make($Closure$241.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.$Closure$241 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.$Closure$241 $_obj = new x10.regionarray.RectRegion.$Closure$241((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            
        }
        
        // constructor just for allocation
        public $Closure$241(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133778 = this.out$$.min$O((long)(i));
            
            //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133778;
        }
        
        public x10.regionarray.RectRegion out$$;
        
        public $Closure$241(final x10.regionarray.RectRegion out$$) {
             {
                this.out$$ = out$$;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$242 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$242> $RTT = 
            x10.rtt.StaticFunType.<$Closure$242> make($Closure$242.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.$Closure$242 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.$Closure$242 $_obj = new x10.regionarray.RectRegion.$Closure$242((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            
        }
        
        // constructor just for allocation
        public $Closure$242(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 311 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133781 = this.out$$.max$O((long)(i));
            
            //#line 311 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133781;
        }
        
        public x10.regionarray.RectRegion out$$;
        
        public $Closure$242(final x10.regionarray.RectRegion out$$) {
             {
                this.out$$ = out$$;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$243 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$243> $RTT = 
            x10.rtt.StaticFunType.<$Closure$243> make($Closure$243.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.$Closure$243 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.this$133321 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.$Closure$243 $_obj = new x10.regionarray.RectRegion.$Closure$243((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.this$133321);
            
        }
        
        // constructor just for allocation
        public $Closure$243(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i$133320) {
            
            //#line 223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133790 = this.this$133321.min$O((long)(i$133320));
            
            //#line 223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133790;
        }
        
        public x10.regionarray.RectRegion this$133321;
        
        public $Closure$243(final x10.regionarray.RectRegion this$133321) {
             {
                this.this$133321 = ((x10.regionarray.RectRegion)(this$133321));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$244 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$244> $RTT = 
            x10.rtt.StaticFunType.<$Closure$244> make($Closure$244.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.$Closure$244 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.this$133323 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.$Closure$244 $_obj = new x10.regionarray.RectRegion.$Closure$244((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.this$133323);
            
        }
        
        // constructor just for allocation
        public $Closure$244(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i$133322) {
            
            //#line 224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133791 = this.this$133323.max$O((long)(i$133322));
            
            //#line 224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133791;
        }
        
        public x10.regionarray.RectRegion this$133323;
        
        public $Closure$244(final x10.regionarray.RectRegion this$133323) {
             {
                this.this$133323 = ((x10.regionarray.RectRegion)(this$133323));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$245 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$245> $RTT = 
            x10.rtt.StaticFunType.<$Closure$245> make($Closure$245.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.$Closure$245 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.thatMin = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.$Closure$245 $_obj = new x10.regionarray.RectRegion.$Closure$245((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.thatMin);
            
        }
        
        // constructor just for allocation
        public $Closure$245(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        // synthetic type for parameter mangling
        public static final class __1$1x10$lang$Long$3x10$lang$Long$2 {}
        
    
        
        public long $apply$O(final long i) {
            
            //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133792 = this.out$$.min$O((long)(i));
            
            //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133793 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)this.thatMin).$apply(x10.core.Long.$box(i), x10.rtt.Types.LONG));
            
            //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133794 = java.lang.Math.max(((long)(t$133792)),((long)(t$133793)));
            
            //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133794;
        }
        
        public x10.regionarray.RectRegion out$$;
        public x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long> thatMin;
        
        public $Closure$245(final x10.regionarray.RectRegion out$$, final x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long> thatMin, __1$1x10$lang$Long$3x10$lang$Long$2 $dummy) {
             {
                this.out$$ = out$$;
                this.thatMin = ((x10.core.fun.Fun_0_1)(thatMin));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$246 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$246> $RTT = 
            x10.rtt.StaticFunType.<$Closure$246> make($Closure$246.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.$Closure$246 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.thatMax = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.$Closure$246 $_obj = new x10.regionarray.RectRegion.$Closure$246((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.thatMax);
            
        }
        
        // constructor just for allocation
        public $Closure$246(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        // synthetic type for parameter mangling
        public static final class __1$1x10$lang$Long$3x10$lang$Long$2 {}
        
    
        
        public long $apply$O(final long i) {
            
            //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133797 = this.out$$.max$O((long)(i));
            
            //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133798 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)this.thatMax).$apply(x10.core.Long.$box(i), x10.rtt.Types.LONG));
            
            //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133799 = java.lang.Math.min(((long)(t$133797)),((long)(t$133798)));
            
            //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133799;
        }
        
        public x10.regionarray.RectRegion out$$;
        public x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long> thatMax;
        
        public $Closure$246(final x10.regionarray.RectRegion out$$, final x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long> thatMax, __1$1x10$lang$Long$3x10$lang$Long$2 $dummy) {
             {
                this.out$$ = out$$;
                this.thatMax = ((x10.core.fun.Fun_0_1)(thatMax));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$247 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$247> $RTT = 
            x10.rtt.StaticFunType.<$Closure$247> make($Closure$247.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.$Closure$247 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.this$133331 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.$Closure$247 $_obj = new x10.regionarray.RectRegion.$Closure$247((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.this$133331);
            
        }
        
        // constructor just for allocation
        public $Closure$247(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i$133330) {
            
            //#line 223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133831 = this.this$133331.min$O((long)(i$133330));
            
            //#line 223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133831;
        }
        
        public x10.regionarray.RectRegion this$133331;
        
        public $Closure$247(final x10.regionarray.RectRegion this$133331) {
             {
                this.this$133331 = ((x10.regionarray.RectRegion)(this$133331));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$248 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$248> $RTT = 
            x10.rtt.StaticFunType.<$Closure$248> make($Closure$248.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.$Closure$248 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.this$133333 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.$Closure$248 $_obj = new x10.regionarray.RectRegion.$Closure$248((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.this$133333);
            
        }
        
        // constructor just for allocation
        public $Closure$248(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i$133332) {
            
            //#line 224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133832 = this.this$133333.max$O((long)(i$133332));
            
            //#line 224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133832;
        }
        
        public x10.regionarray.RectRegion this$133333;
        
        public $Closure$248(final x10.regionarray.RectRegion this$133333) {
             {
                this.this$133333 = ((x10.regionarray.RectRegion)(this$133333));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$249 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$249> $RTT = 
            x10.rtt.StaticFunType.<$Closure$249> make($Closure$249.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.$Closure$249 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.rank = $deserializer.readLong();
            $_obj.thatMin = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.$Closure$249 $_obj = new x10.regionarray.RectRegion.$Closure$249((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.rank);
            $serializer.write(this.thatMin);
            
        }
        
        // constructor just for allocation
        public $Closure$249(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        // synthetic type for parameter mangling
        public static final class __2$1x10$lang$Long$3x10$lang$Long$2 {}
        
    
        
        public long $apply$O(final long i) {
            
            //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133835 = this.rank;
            
            //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133838 = ((i) < (((long)(t$133835))));
            
            //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            long t$133839 =  0;
            
            //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133838) {
                
                //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133839 = this.out$$.min$O((long)(i));
            } else {
                
                //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133836 = this.rank;
                
                //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133837 = ((i) - (((long)(t$133836))));
                
                //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133839 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)this.thatMin).$apply(x10.core.Long.$box(t$133837), x10.rtt.Types.LONG));
            }
            
            //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133840 = t$133839;
            
            //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133840;
        }
        
        public x10.regionarray.RectRegion out$$;
        public long rank;
        public x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long> thatMin;
        
        public $Closure$249(final x10.regionarray.RectRegion out$$, final long rank, final x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long> thatMin, __2$1x10$lang$Long$3x10$lang$Long$2 $dummy) {
             {
                this.out$$ = out$$;
                this.rank = rank;
                this.thatMin = ((x10.core.fun.Fun_0_1)(thatMin));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$250 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$250> $RTT = 
            x10.rtt.StaticFunType.<$Closure$250> make($Closure$250.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.$Closure$250 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.rank = $deserializer.readLong();
            $_obj.thatMax = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.$Closure$250 $_obj = new x10.regionarray.RectRegion.$Closure$250((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.rank);
            $serializer.write(this.thatMax);
            
        }
        
        // constructor just for allocation
        public $Closure$250(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        // synthetic type for parameter mangling
        public static final class __2$1x10$lang$Long$3x10$lang$Long$2 {}
        
    
        
        public long $apply$O(final long i) {
            
            //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133842 = this.rank;
            
            //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133845 = ((i) < (((long)(t$133842))));
            
            //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            long t$133846 =  0;
            
            //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133845) {
                
                //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133846 = this.out$$.max$O((long)(i));
            } else {
                
                //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133843 = this.rank;
                
                //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133844 = ((i) - (((long)(t$133843))));
                
                //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133846 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)this.thatMax).$apply(x10.core.Long.$box(t$133844), x10.rtt.Types.LONG));
            }
            
            //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133847 = t$133846;
            
            //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133847;
        }
        
        public x10.regionarray.RectRegion out$$;
        public long rank;
        public x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long> thatMax;
        
        public $Closure$250(final x10.regionarray.RectRegion out$$, final long rank, final x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long> thatMax, __2$1x10$lang$Long$3x10$lang$Long$2 $dummy) {
             {
                this.out$$ = out$$;
                this.rank = rank;
                this.thatMax = ((x10.core.fun.Fun_0_1)(thatMax));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$251 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$251> $RTT = 
            x10.rtt.StaticFunType.<$Closure$251> make($Closure$251.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.$Closure$251 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.rank = $deserializer.readLong();
            $_obj.thatMin = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.$Closure$251 $_obj = new x10.regionarray.RectRegion.$Closure$251((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.rank);
            $serializer.write(this.thatMin);
            
        }
        
        // constructor just for allocation
        public $Closure$251(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133850 = this.rank;
            
            //#line 358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133851 = ((i) < (((long)(t$133850))));
            
            //#line 358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            long t$133852 =  0;
            
            //#line 358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133851) {
                
                //#line 358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133852 = this.out$$.min$O((long)(i));
            } else {
                
                //#line 358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133852 = this.thatMin;
            }
            
            //#line 358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133853 = t$133852;
            
            //#line 358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133853;
        }
        
        public x10.regionarray.RectRegion out$$;
        public long rank;
        public long thatMin;
        
        public $Closure$251(final x10.regionarray.RectRegion out$$, final long rank, final long thatMin) {
             {
                this.out$$ = out$$;
                this.rank = rank;
                this.thatMin = thatMin;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$252 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$252> $RTT = 
            x10.rtt.StaticFunType.<$Closure$252> make($Closure$252.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.$Closure$252 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.rank = $deserializer.readLong();
            $_obj.thatMax = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.$Closure$252 $_obj = new x10.regionarray.RectRegion.$Closure$252((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.rank);
            $serializer.write(this.thatMax);
            
        }
        
        // constructor just for allocation
        public $Closure$252(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 359 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133855 = this.rank;
            
            //#line 359 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133856 = ((i) < (((long)(t$133855))));
            
            //#line 359 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            long t$133857 =  0;
            
            //#line 359 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133856) {
                
                //#line 359 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133857 = this.out$$.max$O((long)(i));
            } else {
                
                //#line 359 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133857 = this.thatMax;
            }
            
            //#line 359 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133858 = t$133857;
            
            //#line 359 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133858;
        }
        
        public x10.regionarray.RectRegion out$$;
        public long rank;
        public long thatMax;
        
        public $Closure$252(final x10.regionarray.RectRegion out$$, final long rank, final long thatMax) {
             {
                this.out$$ = out$$;
                this.rank = rank;
                this.thatMax = thatMax;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$253 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$253> $RTT = 
            x10.rtt.StaticFunType.<$Closure$253> make($Closure$253.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.$Closure$253 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.rank = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.$Closure$253 $_obj = new x10.regionarray.RectRegion.$Closure$253((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.rank);
            
        }
        
        // constructor just for allocation
        public $Closure$253(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 363 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133862 = this.rank;
            
            //#line 363 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133863 = ((i) < (((long)(t$133862))));
            
            //#line 363 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            long t$133864 =  0;
            
            //#line 363 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133863) {
                
                //#line 363 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133864 = this.out$$.min$O((long)(i));
            } else {
                
                //#line 363 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133864 = java.lang.Long.MIN_VALUE;
            }
            
            //#line 363 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133865 = t$133864;
            
            //#line 363 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133865;
        }
        
        public x10.regionarray.RectRegion out$$;
        public long rank;
        
        public $Closure$253(final x10.regionarray.RectRegion out$$, final long rank) {
             {
                this.out$$ = out$$;
                this.rank = rank;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$254 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$254> $RTT = 
            x10.rtt.StaticFunType.<$Closure$254> make($Closure$254.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.$Closure$254 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.rank = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.$Closure$254 $_obj = new x10.regionarray.RectRegion.$Closure$254((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.rank);
            
        }
        
        // constructor just for allocation
        public $Closure$254(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 364 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133867 = this.rank;
            
            //#line 364 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133868 = ((i) < (((long)(t$133867))));
            
            //#line 364 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            long t$133869 =  0;
            
            //#line 364 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133868) {
                
                //#line 364 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133869 = this.out$$.max$O((long)(i));
            } else {
                
                //#line 364 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133869 = java.lang.Long.MAX_VALUE;
            }
            
            //#line 364 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133870 = t$133869;
            
            //#line 364 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133870;
        }
        
        public x10.regionarray.RectRegion out$$;
        public long rank;
        
        public $Closure$254(final x10.regionarray.RectRegion out$$, final long rank) {
             {
                this.out$$ = out$$;
                this.rank = rank;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$255 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$255> $RTT = 
            x10.rtt.StaticFunType.<$Closure$255> make($Closure$255.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.$Closure$255 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.v = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.$Closure$255 $_obj = new x10.regionarray.RectRegion.$Closure$255((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.v);
            
        }
        
        // constructor just for allocation
        public $Closure$255(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133879 = this.out$$.min$O((long)(i));
            
            //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133880 = this.v.$apply$O((long)(i));
            
            //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133881 = ((t$133879) + (((long)(t$133880))));
            
            //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133881;
        }
        
        public x10.regionarray.RectRegion out$$;
        public x10.lang.Point v;
        
        public $Closure$255(final x10.regionarray.RectRegion out$$, final x10.lang.Point v) {
             {
                this.out$$ = out$$;
                this.v = ((x10.lang.Point)(v));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$256 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$256> $RTT = 
            x10.rtt.StaticFunType.<$Closure$256> make($Closure$256.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.$Closure$256 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.v = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.$Closure$256 $_obj = new x10.regionarray.RectRegion.$Closure$256((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.v);
            
        }
        
        // constructor just for allocation
        public $Closure$256(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 373 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133884 = this.out$$.max$O((long)(i));
            
            //#line 373 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133885 = this.v.$apply$O((long)(i));
            
            //#line 373 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133886 = ((t$133884) + (((long)(t$133885))));
            
            //#line 373 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133886;
        }
        
        public x10.regionarray.RectRegion out$$;
        public x10.lang.Point v;
        
        public $Closure$256(final x10.regionarray.RectRegion out$$, final x10.lang.Point v) {
             {
                this.out$$ = out$$;
                this.v = ((x10.lang.Point)(v));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$257 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$257> $RTT = 
            x10.rtt.StaticFunType.<$Closure$257> make($Closure$257.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.$Closure$257 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.axis = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.$Closure$257 $_obj = new x10.regionarray.RectRegion.$Closure$257((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.axis);
            
        }
        
        // constructor just for allocation
        public $Closure$257(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 383 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133903 = ((i) < (((long)(this.axis))));
            
            //#line 383 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            long t$133904 =  0;
            
            //#line 383 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133903) {
                
                //#line 383 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133904 = this.out$$.min$O((long)(i));
            } else {
                
                //#line 383 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133902 = ((i) + (((long)(1L))));
                
                //#line 383 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133904 = this.out$$.min$O((long)(t$133902));
            }
            
            //#line 383 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133905 = t$133904;
            
            //#line 383 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133905;
        }
        
        public x10.regionarray.RectRegion out$$;
        public long axis;
        
        public $Closure$257(final x10.regionarray.RectRegion out$$, final long axis) {
             {
                this.out$$ = out$$;
                this.axis = axis;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$258 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$258> $RTT = 
            x10.rtt.StaticFunType.<$Closure$258> make($Closure$258.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.$Closure$258 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.axis = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.$Closure$258 $_obj = new x10.regionarray.RectRegion.$Closure$258((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.axis);
            
        }
        
        // constructor just for allocation
        public $Closure$258(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i) {
            
            //#line 384 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final boolean t$133908 = ((i) < (((long)(this.axis))));
            
            //#line 384 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            long t$133909 =  0;
            
            //#line 384 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            if (t$133908) {
                
                //#line 384 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133909 = this.out$$.max$O((long)(i));
            } else {
                
                //#line 384 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                final long t$133907 = ((i) + (((long)(1L))));
                
                //#line 384 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
                t$133909 = this.out$$.max$O((long)(t$133907));
            }
            
            //#line 384 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133910 = t$133909;
            
            //#line 384 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133910;
        }
        
        public x10.regionarray.RectRegion out$$;
        public long axis;
        
        public $Closure$258(final x10.regionarray.RectRegion out$$, final long axis) {
             {
                this.out$$ = out$$;
                this.axis = axis;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$259 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$259> $RTT = 
            x10.rtt.StaticFunType.<$Closure$259> make($Closure$259.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.$Closure$259 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.this$133352 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.$Closure$259 $_obj = new x10.regionarray.RectRegion.$Closure$259((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.this$133352);
            
        }
        
        // constructor just for allocation
        public $Closure$259(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i$133351) {
            
            //#line 223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133984 = this.this$133352.min$O((long)(i$133351));
            
            //#line 223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133984;
        }
        
        public x10.regionarray.RectRegion this$133352;
        
        public $Closure$259(final x10.regionarray.RectRegion this$133352) {
             {
                this.this$133352 = ((x10.regionarray.RectRegion)(this$133352));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$260 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$260> $RTT = 
            x10.rtt.StaticFunType.<$Closure$260> make($Closure$260.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.$Closure$260 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.this$133354 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.$Closure$260 $_obj = new x10.regionarray.RectRegion.$Closure$260((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.this$133354);
            
        }
        
        // constructor just for allocation
        public $Closure$260(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i$133353) {
            
            //#line 224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133985 = this.this$133354.max$O((long)(i$133353));
            
            //#line 224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133985;
        }
        
        public x10.regionarray.RectRegion this$133354;
        
        public $Closure$260(final x10.regionarray.RectRegion this$133354) {
             {
                this.this$133354 = ((x10.regionarray.RectRegion)(this$133354));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$261 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$261> $RTT = 
            x10.rtt.StaticFunType.<$Closure$261> make($Closure$261.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.$Closure$261 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.this$133356 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.$Closure$261 $_obj = new x10.regionarray.RectRegion.$Closure$261((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.this$133356);
            
        }
        
        // constructor just for allocation
        public $Closure$261(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i$133355) {
            
            //#line 223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133986 = this.this$133356.min$O((long)(i$133355));
            
            //#line 223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133986;
        }
        
        public x10.regionarray.RectRegion this$133356;
        
        public $Closure$261(final x10.regionarray.RectRegion this$133356) {
             {
                this.this$133356 = ((x10.regionarray.RectRegion)(this$133356));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$262 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$262> $RTT = 
            x10.rtt.StaticFunType.<$Closure$262> make($Closure$262.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.$Closure$262 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.this$133358 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.$Closure$262 $_obj = new x10.regionarray.RectRegion.$Closure$262((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.this$133358);
            
        }
        
        // constructor just for allocation
        public $Closure$262(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i$133357) {
            
            //#line 224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$133987 = this.this$133358.max$O((long)(i$133357));
            
            //#line 224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$133987;
        }
        
        public x10.regionarray.RectRegion this$133358;
        
        public $Closure$262(final x10.regionarray.RectRegion this$133358) {
             {
                this.this$133358 = ((x10.regionarray.RectRegion)(this$133358));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$263 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$263> $RTT = 
            x10.rtt.StaticFunType.<$Closure$263> make($Closure$263.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.$Closure$263 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.this$133360 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.$Closure$263 $_obj = new x10.regionarray.RectRegion.$Closure$263((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.this$133360);
            
        }
        
        // constructor just for allocation
        public $Closure$263(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i$133359) {
            
            //#line 223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$134000 = this.this$133360.min$O((long)(i$133359));
            
            //#line 223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$134000;
        }
        
        public x10.regionarray.RectRegion this$133360;
        
        public $Closure$263(final x10.regionarray.RectRegion this$133360) {
             {
                this.this$133360 = ((x10.regionarray.RectRegion)(this$133360));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$264 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$264> $RTT = 
            x10.rtt.StaticFunType.<$Closure$264> make($Closure$264.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion.$Closure$264 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.this$133362 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion.$Closure$264 $_obj = new x10.regionarray.RectRegion.$Closure$264((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.this$133362);
            
        }
        
        // constructor just for allocation
        public $Closure$264(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i$133361) {
            
            //#line 224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$134001 = this.this$133362.max$O((long)(i$133361));
            
            //#line 224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$134001;
        }
        
        public x10.regionarray.RectRegion this$133362;
        
        public $Closure$264(final x10.regionarray.RectRegion this$133362) {
             {
                this.this$133362 = ((x10.regionarray.RectRegion)(this$133362));
            }
        }
        
    }
    
    
    public boolean x10$regionarray$Region$equals$S$O(final java.lang.Object a0) {
        return super.equals(((java.lang.Object)(a0)));
    }
}

