package x10.regionarray;


@x10.runtime.impl.java.X10Generated
abstract public class Region extends x10.core.Ref implements x10.lang.Iterable, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Region> $RTT = 
        x10.rtt.NamedType.<Region> make("x10.regionarray.Region",
                                        Region.class,
                                        new x10.rtt.Type[] {
                                            x10.rtt.ParameterizedType.make(x10.lang.Iterable.$RTT, x10.lang.Point.$RTT)
                                        });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.Region $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.rank = $deserializer.readLong();
        $_obj.rect = $deserializer.readBoolean();
        $_obj.zeroBased = $deserializer.readBoolean();
        $_obj.rail = $deserializer.readBoolean();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return null;
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.rank);
        $serializer.write(this.rect);
        $serializer.write(this.zeroBased);
        $serializer.write(this.rail);
        
    }
    
    // constructor just for allocation
    public Region(final java.lang.System[] $dummy) {
        
    }
    
    
    // properties
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public long rank;
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public boolean rect;
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public boolean zeroBased;
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public boolean rail;
    

    
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    final public long rank$O() {
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134396 = rank;
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134396;
    }
    
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    final public boolean rect$O() {
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final boolean t$134397 = rect;
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134397;
    }
    
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    final public boolean zeroBased$O() {
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final boolean t$134398 = zeroBased;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134398;
    }
    
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    final public boolean rail$O() {
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final boolean t$134399 = rail;
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134399;
    }
    
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region makeEmpty(final long rank) {
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.EmptyRegion alloc$116480 = ((x10.regionarray.EmptyRegion)(new x10.regionarray.EmptyRegion((java.lang.System[]) null)));
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        alloc$116480.x10$regionarray$EmptyRegion$$init$S(((long)(rank)));
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return alloc$116480;
    }
    
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region makeFull(final long rank) {
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.FullRegion alloc$116481 = ((x10.regionarray.FullRegion)(new x10.regionarray.FullRegion((java.lang.System[]) null)));
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        alloc$116481.x10$regionarray$FullRegion$$init$S(((long)(rank)));
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return alloc$116481;
    }
    
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region makeUnit() {
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.FullRegion alloc$116482 = ((x10.regionarray.FullRegion)(new x10.regionarray.FullRegion((java.lang.System[]) null)));
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        alloc$116482.x10$regionarray$FullRegion$$init$S(((long)(0L)));
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return alloc$116482;
    }
    
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region makeHalfspace(final x10.lang.Point normal, final long k) {
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long rank = normal.rank;
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.PolyMatBuilder pmb = ((x10.regionarray.PolyMatBuilder)(new x10.regionarray.PolyMatBuilder((java.lang.System[]) null)));
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        pmb.x10$regionarray$PolyMatBuilder$$init$S(((long)(rank)));
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.PolyRow r = ((x10.regionarray.PolyRow)(new x10.regionarray.PolyRow((java.lang.System[]) null)));
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134632 = ((int)(long)(((long)(k))));
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        r.x10$regionarray$PolyRow$$init$S(((x10.lang.Point)(normal)), t$134632);
        
        //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        pmb.add(((x10.regionarray.Row)(r)));
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.PolyMat pm = ((x10.regionarray.PolyMat)(pmb.toSortedPolyMat((boolean)(false))));
        
        //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$134401 = ((x10.regionarray.Region)(x10.regionarray.PolyRegion.make(((x10.regionarray.PolyMat)(pm)))));
        
        //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134401;
    }
    
    
    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region makeRectangularPoly__0$1x10$lang$Long$2__1$1x10$lang$Long$2(final x10.core.Rail<x10.core.Long> minArg, final x10.core.Rail<x10.core.Long> maxArg) {
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134402 = ((x10.core.Rail<x10.core.Long>)minArg).size;
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134403 = ((x10.core.Rail<x10.core.Long>)maxArg).size;
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final boolean t$134411 = ((long) t$134402) != ((long) t$134403);
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        if (t$134411) {
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long t$134404 = ((x10.core.Rail<x10.core.Long>)minArg).size;
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final java.lang.String t$134405 = (("min and max not equal size (") + ((x10.core.Long.$box(t$134404))));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final java.lang.String t$134406 = ((t$134405) + (" != "));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long t$134407 = ((x10.core.Rail<x10.core.Long>)maxArg).size;
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final java.lang.String t$134408 = ((t$134406) + ((x10.core.Long.$box(t$134407))));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final java.lang.String t$134409 = ((t$134408) + (")"));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final java.lang.IllegalArgumentException t$134410 = ((java.lang.IllegalArgumentException)(new java.lang.IllegalArgumentException(t$134409)));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            throw t$134410;
        }
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long rank = ((x10.core.Rail<x10.core.Long>)minArg).size;
        
        //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.PolyMatBuilder pmb = ((x10.regionarray.PolyMatBuilder)(new x10.regionarray.PolyMatBuilder((java.lang.System[]) null)));
        
        //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        pmb.x10$regionarray$PolyMatBuilder$$init$S(((long)(rank)));
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long i$116502max$134664 = ((rank) - (((long)(1L))));
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        long i$134661 = 0L;
        {
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long[] minArg$value$134760 = ((long[])minArg.value);
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long[] maxArg$value$134761 = ((long[])maxArg.value);
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            for (;
                 true;
                 ) {
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final long t$134662 = i$134661;
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final boolean t$134663 = ((t$134662) <= (((long)(i$116502max$134664))));
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                if (!(t$134663)) {
                    
                    //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                    break;
                }
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final long i$134658 = i$134661;
                
                //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final long t$134650 = ((long)minArg$value$134760[(int)i$134658]);
                
                //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final long t$134651 = java.lang.Long.MIN_VALUE;
                
                //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final boolean t$134652 = ((t$134650) > (((long)(t$134651))));
                
                //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                if (t$134652) {
                    
                    //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                    final x10.regionarray.PolyRow r$134653 = ((x10.regionarray.PolyRow)(new x10.regionarray.PolyRow((java.lang.System[]) null)));
                    
                    //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                    final x10.core.fun.Fun_0_1 t$134633 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.Region.$Closure$267(i$134658)));
                    
                    //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                    final x10.lang.Point t$134638 = ((x10.lang.Point)(x10.lang.Point.make__1$1x10$lang$Long$3x10$lang$Long$2((long)(rank), ((x10.core.fun.Fun_0_1)(t$134633)))));
                    
                    //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                    final long t$134639 = ((long)minArg$value$134760[(int)i$134658]);
                    
                    //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                    final int t$134640 = ((int)(long)(((long)(t$134639))));
                    
                    //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                    r$134653.x10$regionarray$PolyRow$$init$S(((x10.lang.Point)(t$134638)), t$134640);
                    
                    //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                    pmb.add(((x10.regionarray.Row)(r$134653)));
                }
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final long t$134654 = ((long)maxArg$value$134761[(int)i$134658]);
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final long t$134655 = java.lang.Long.MAX_VALUE;
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final boolean t$134656 = ((t$134654) < (((long)(t$134655))));
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                if (t$134656) {
                    
                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                    final x10.regionarray.PolyRow s$134657 = ((x10.regionarray.PolyRow)(new x10.regionarray.PolyRow((java.lang.System[]) null)));
                    
                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                    final x10.core.fun.Fun_0_1 t$134641 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.Region.$Closure$268(i$134658)));
                    
                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                    final x10.lang.Point t$134646 = ((x10.lang.Point)(x10.lang.Point.make__1$1x10$lang$Long$3x10$lang$Long$2((long)(rank), ((x10.core.fun.Fun_0_1)(t$134641)))));
                    
                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                    final long t$134647 = ((long)maxArg$value$134761[(int)i$134658]);
                    
                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                    final int t$134648 = ((int)(long)(((long)(t$134647))));
                    
                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                    final int t$134649 = (-(t$134648));
                    
                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                    s$134657.x10$regionarray$PolyRow$$init$S(((x10.lang.Point)(t$134646)), t$134649);
                    
                    //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                    pmb.add(((x10.regionarray.Row)(s$134657)));
                }
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final long t$134659 = i$134661;
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final long t$134660 = ((t$134659) + (((long)(1L))));
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                i$134661 = t$134660;
            }
        }
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.PolyMat pm = ((x10.regionarray.PolyMat)(pmb.toSortedPolyMat((boolean)(false))));
        
        //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$134438 = ((x10.regionarray.Region)(x10.regionarray.PolyRegion.make(((x10.regionarray.PolyMat)(pm)))));
        
        //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134438;
    }
    
    
    //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region makeRectangular__0$1x10$lang$Long$2__1$1x10$lang$Long$2(final x10.core.Rail<x10.core.Long> minArg, final x10.core.Rail<x10.core.Long> maxArg) {
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134439 = ((x10.core.Rail<x10.core.Long>)minArg).size;
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final boolean t$134447 = ((long) t$134439) == ((long) 1L);
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        if (t$134447) {
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.RectRegion1D alloc$116483 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long t$134665 = ((long[])minArg.value)[(int)0L];
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long t$134666 = ((long[])maxArg.value)[(int)0L];
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            alloc$116483.x10$regionarray$RectRegion1D$$init$S(t$134665, t$134666);
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.Region t$134442 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                alloc$116483)));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            return t$134442;
        } else {
            
            //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.RectRegion alloc$116484 = ((x10.regionarray.RectRegion)(new x10.regionarray.RectRegion((java.lang.System[]) null)));
            
            //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long t$134667 = ((x10.core.Rail<x10.core.Long>)minArg).size;
            
            //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.core.Rail t$134668 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(t$134667)), ((x10.core.fun.Fun_0_1)(minArg)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
            
            //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long t$134669 = ((x10.core.Rail<x10.core.Long>)maxArg).size;
            
            //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.core.Rail t$134670 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(t$134669)), ((x10.core.fun.Fun_0_1)(maxArg)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
            
            //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            alloc$116484.x10$regionarray$RectRegion$$init$S(((x10.core.Rail)(t$134668)), ((x10.core.Rail)(t$134670)), (x10.regionarray.RectRegion.__0$1x10$lang$Long$2__1$1x10$lang$Long$2) null);
            
            //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            return alloc$116484;
        }
    }
    
    
    //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region makeRectangular__0$1x10$lang$IntRange$2(final x10.core.Rail<x10.lang.IntRange> ranges) {
        
        //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134448 = ((x10.core.Rail<x10.lang.IntRange>)ranges).size;
        
        //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final boolean t$134466 = ((long) t$134448) == ((long) 1L);
        
        //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        if (t$134466) {
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.RectRegion1D alloc$116485 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.lang.IntRange t$134671 = ((x10.lang.IntRange[])ranges.value)[(int)0L];
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final int t$134672 = t$134671.min;
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long t$134673 = ((long)(((int)(t$134672))));
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.lang.IntRange t$134674 = ((x10.lang.IntRange[])ranges.value)[(int)0L];
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final int t$134675 = t$134674.max;
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long t$134676 = ((long)(((int)(t$134675))));
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            alloc$116485.x10$regionarray$RectRegion1D$$init$S(t$134673, t$134676);
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.Region t$134455 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                alloc$116485)));
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            return t$134455;
        } else {
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long t$134459 = ((x10.core.Rail<x10.lang.IntRange>)ranges).size;
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.core.fun.Fun_0_1 t$134460 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.Region.$Closure$269(ranges, (x10.regionarray.Region.$Closure$269.__0$1x10$lang$IntRange$2) null)));
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.core.Rail mins = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(t$134459)), ((x10.core.fun.Fun_0_1)(t$134460)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long t$134464 = ((x10.core.Rail<x10.lang.IntRange>)ranges).size;
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.core.fun.Fun_0_1 t$134465 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.Region.$Closure$270(ranges, (x10.regionarray.Region.$Closure$270.__0$1x10$lang$IntRange$2) null)));
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.core.Rail maxs = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(t$134464)), ((x10.core.fun.Fun_0_1)(t$134465)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
            
            //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.RectRegion alloc$116486 = ((x10.regionarray.RectRegion)(new x10.regionarray.RectRegion((java.lang.System[]) null)));
            
            //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            alloc$116486.x10$regionarray$RectRegion$$init$S(((x10.core.Rail)(mins)), ((x10.core.Rail)(maxs)), (x10.regionarray.RectRegion.__0$1x10$lang$Long$2__1$1x10$lang$Long$2) null);
            
            //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            return alloc$116486;
        }
    }
    
    
    //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region make__0$1x10$lang$IntRange$2(final x10.core.Rail<x10.lang.IntRange> ranges) {
        
        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$134467 = ((x10.regionarray.Region)(x10.regionarray.Region.makeRectangular__0$1x10$lang$IntRange$2(((x10.core.Rail)(ranges)))));
        
        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134467;
    }
    
    
    //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region makeRectangular__0$1x10$lang$LongRange$2(final x10.core.Rail<x10.lang.LongRange> ranges) {
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134468 = ((x10.core.Rail<x10.lang.LongRange>)ranges).size;
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final boolean t$134482 = ((long) t$134468) == ((long) 1L);
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        if (t$134482) {
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.RectRegion1D alloc$116487 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.lang.LongRange t$134677 = ((x10.lang.LongRange[])ranges.value)[(int)0L];
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long t$134678 = t$134677.min;
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.lang.LongRange t$134679 = ((x10.lang.LongRange[])ranges.value)[(int)0L];
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long t$134680 = t$134679.max;
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            alloc$116487.x10$regionarray$RectRegion1D$$init$S(t$134678, t$134680);
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.Region t$134473 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                alloc$116487)));
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            return t$134473;
        } else {
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long t$134476 = ((x10.core.Rail<x10.lang.LongRange>)ranges).size;
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.core.fun.Fun_0_1 t$134477 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.Region.$Closure$271(ranges, (x10.regionarray.Region.$Closure$271.__0$1x10$lang$LongRange$2) null)));
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.core.Rail mins = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(t$134476)), ((x10.core.fun.Fun_0_1)(t$134477)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
            
            //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long t$134480 = ((x10.core.Rail<x10.lang.LongRange>)ranges).size;
            
            //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.core.fun.Fun_0_1 t$134481 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.Region.$Closure$272(ranges, (x10.regionarray.Region.$Closure$272.__0$1x10$lang$LongRange$2) null)));
            
            //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.core.Rail maxs = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(t$134480)), ((x10.core.fun.Fun_0_1)(t$134481)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
            
            //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.RectRegion alloc$116488 = ((x10.regionarray.RectRegion)(new x10.regionarray.RectRegion((java.lang.System[]) null)));
            
            //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            alloc$116488.x10$regionarray$RectRegion$$init$S(((x10.core.Rail)(mins)), ((x10.core.Rail)(maxs)), (x10.regionarray.RectRegion.__0$1x10$lang$Long$2__1$1x10$lang$Long$2) null);
            
            //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            return alloc$116488;
        }
    }
    
    
    //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region make__0$1x10$lang$LongRange$2(final x10.core.Rail<x10.lang.LongRange> ranges) {
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$134483 = ((x10.regionarray.Region)(x10.regionarray.Region.makeRectangular__0$1x10$lang$LongRange$2(((x10.core.Rail)(ranges)))));
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134483;
    }
    
    
    //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region make(final x10.lang.IntRange r) {
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.RectRegion1D alloc$116489 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134681 = r.min;
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134682 = ((long)(((int)(t$134681))));
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134683 = r.max;
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134684 = ((long)(((int)(t$134683))));
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        alloc$116489.x10$regionarray$RectRegion1D$$init$S(t$134682, t$134684);
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return alloc$116489;
    }
    
    
    //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region makeRectangular(final x10.lang.IntRange r) {
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.RectRegion1D alloc$116490 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134685 = r.min;
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134686 = ((long)(((int)(t$134685))));
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134687 = r.max;
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134688 = ((long)(((int)(t$134687))));
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        alloc$116490.x10$regionarray$RectRegion1D$$init$S(t$134686, t$134688);
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return alloc$116490;
    }
    
    
    //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region make(final x10.lang.LongRange r) {
        
        //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.RectRegion1D alloc$116491 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
        
        //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134689 = r.min;
        
        //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134690 = r.max;
        
        //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        alloc$116491.x10$regionarray$RectRegion1D$$init$S(((long)(t$134689)), ((long)(t$134690)));
        
        //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return alloc$116491;
    }
    
    
    //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region makeRectangular(final x10.lang.LongRange r) {
        
        //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.RectRegion1D alloc$116492 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
        
        //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134691 = r.min;
        
        //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134692 = r.max;
        
        //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        alloc$116492.x10$regionarray$RectRegion1D$$init$S(((long)(t$134691)), ((long)(t$134692)));
        
        //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return alloc$116492;
    }
    
    
    //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region makeRectangular(final x10.lang.IntRange r1, final x10.lang.IntRange r2) {
        
        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.RectRegion alloc$116493 = ((x10.regionarray.RectRegion)(new x10.regionarray.RectRegion((java.lang.System[]) null)));
        
        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134693 = r1.min;
        
        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134694 = ((long)(((int)(t$134693))));
        
        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134695 = r2.min;
        
        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134696 = ((long)(((int)(t$134695))));
        
        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.core.Rail t$134697 = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<x10.core.Long> makeRailFromJavaArray(x10.rtt.Types.LONG, new long[] {t$134694, t$134696})));
        
        //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134698 = r1.max;
        
        //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134699 = ((long)(((int)(t$134698))));
        
        //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134700 = r2.max;
        
        //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134701 = ((long)(((int)(t$134700))));
        
        //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.core.Rail t$134702 = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<x10.core.Long> makeRailFromJavaArray(x10.rtt.Types.LONG, new long[] {t$134699, t$134701})));
        
        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        alloc$116493.x10$regionarray$RectRegion$$init$S(((x10.core.Rail)(t$134697)), ((x10.core.Rail)(t$134702)), (x10.regionarray.RectRegion.__0$1x10$lang$Long$2__1$1x10$lang$Long$2) null);
        
        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$134506 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                            alloc$116493)));
        
        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134506;
    }
    
    
    //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region make(final x10.lang.IntRange r1, final x10.lang.IntRange r2) {
        
        //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$134507 = ((x10.regionarray.Region)(x10.regionarray.Region.makeRectangular(((x10.lang.IntRange)(r1)), ((x10.lang.IntRange)(r2)))));
        
        //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134507;
    }
    
    
    //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region makeRectangular(final x10.lang.LongRange r1, final x10.lang.LongRange r2) {
        
        //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.RectRegion alloc$116494 = ((x10.regionarray.RectRegion)(new x10.regionarray.RectRegion((java.lang.System[]) null)));
        
        //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134703 = r1.min;
        
        //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134704 = r2.min;
        
        //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.core.Rail t$134705 = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<x10.core.Long> makeRailFromJavaArray(x10.rtt.Types.LONG, new long[] {t$134703, t$134704})));
        
        //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134706 = r1.max;
        
        //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134707 = r2.max;
        
        //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.core.Rail t$134708 = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<x10.core.Long> makeRailFromJavaArray(x10.rtt.Types.LONG, new long[] {t$134706, t$134707})));
        
        //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        alloc$116494.x10$regionarray$RectRegion$$init$S(((x10.core.Rail)(t$134705)), ((x10.core.Rail)(t$134708)), (x10.regionarray.RectRegion.__0$1x10$lang$Long$2__1$1x10$lang$Long$2) null);
        
        //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$134514 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                            alloc$116494)));
        
        //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134514;
    }
    
    
    //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region make(final x10.lang.LongRange r1, final x10.lang.LongRange r2) {
        
        //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$134515 = ((x10.regionarray.Region)(x10.regionarray.Region.makeRectangular(((x10.lang.LongRange)(r1)), ((x10.lang.LongRange)(r2)))));
        
        //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134515;
    }
    
    
    //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region makeRectangular(final x10.lang.IntRange r1, final x10.lang.IntRange r2, final x10.lang.IntRange r3) {
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.RectRegion alloc$116495 = ((x10.regionarray.RectRegion)(new x10.regionarray.RectRegion((java.lang.System[]) null)));
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134709 = r1.min;
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134710 = ((long)(((int)(t$134709))));
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134711 = r2.min;
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134712 = ((long)(((int)(t$134711))));
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134713 = r3.min;
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134714 = ((long)(((int)(t$134713))));
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.core.Rail t$134715 = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<x10.core.Long> makeRailFromJavaArray(x10.rtt.Types.LONG, new long[] {t$134710, t$134712, t$134714})));
        
        //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134716 = r1.max;
        
        //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134717 = ((long)(((int)(t$134716))));
        
        //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134718 = r2.max;
        
        //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134719 = ((long)(((int)(t$134718))));
        
        //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134720 = r3.max;
        
        //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134721 = ((long)(((int)(t$134720))));
        
        //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.core.Rail t$134722 = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<x10.core.Long> makeRailFromJavaArray(x10.rtt.Types.LONG, new long[] {t$134717, t$134719, t$134721})));
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        alloc$116495.x10$regionarray$RectRegion$$init$S(((x10.core.Rail)(t$134715)), ((x10.core.Rail)(t$134722)), (x10.regionarray.RectRegion.__0$1x10$lang$Long$2__1$1x10$lang$Long$2) null);
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$134530 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                            alloc$116495)));
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134530;
    }
    
    
    //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region make(final x10.lang.IntRange r1, final x10.lang.IntRange r2, final x10.lang.IntRange r3) {
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$134531 = ((x10.regionarray.Region)(x10.regionarray.Region.makeRectangular(((x10.lang.IntRange)(r1)), ((x10.lang.IntRange)(r2)), ((x10.lang.IntRange)(r3)))));
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134531;
    }
    
    
    //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region makeRectangular(final x10.lang.LongRange r1, final x10.lang.LongRange r2, final x10.lang.LongRange r3) {
        
        //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.RectRegion alloc$116496 = ((x10.regionarray.RectRegion)(new x10.regionarray.RectRegion((java.lang.System[]) null)));
        
        //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134723 = r1.min;
        
        //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134724 = r2.min;
        
        //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134725 = r3.min;
        
        //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.core.Rail t$134726 = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<x10.core.Long> makeRailFromJavaArray(x10.rtt.Types.LONG, new long[] {t$134723, t$134724, t$134725})));
        
        //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134727 = r1.max;
        
        //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134728 = r2.max;
        
        //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134729 = r3.max;
        
        //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.core.Rail t$134730 = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<x10.core.Long> makeRailFromJavaArray(x10.rtt.Types.LONG, new long[] {t$134727, t$134728, t$134729})));
        
        //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        alloc$116496.x10$regionarray$RectRegion$$init$S(((x10.core.Rail)(t$134726)), ((x10.core.Rail)(t$134730)), (x10.regionarray.RectRegion.__0$1x10$lang$Long$2__1$1x10$lang$Long$2) null);
        
        //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$134540 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                            alloc$116496)));
        
        //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134540;
    }
    
    
    //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region make(final x10.lang.LongRange r1, final x10.lang.LongRange r2, final x10.lang.LongRange r3) {
        
        //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$134541 = ((x10.regionarray.Region)(x10.regionarray.Region.makeRectangular(((x10.lang.LongRange)(r1)), ((x10.lang.LongRange)(r2)), ((x10.lang.LongRange)(r3)))));
        
        //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134541;
    }
    
    
    //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region makeRectangular(final x10.lang.IntRange r1, final x10.lang.IntRange r2, final x10.lang.IntRange r3, final x10.lang.IntRange r4) {
        
        //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.RectRegion alloc$116497 = ((x10.regionarray.RectRegion)(new x10.regionarray.RectRegion((java.lang.System[]) null)));
        
        //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134731 = r1.min;
        
        //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134732 = ((long)(((int)(t$134731))));
        
        //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134733 = r2.min;
        
        //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134734 = ((long)(((int)(t$134733))));
        
        //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134735 = r3.min;
        
        //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134736 = ((long)(((int)(t$134735))));
        
        //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134737 = r4.min;
        
        //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134738 = ((long)(((int)(t$134737))));
        
        //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.core.Rail t$134739 = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<x10.core.Long> makeRailFromJavaArray(x10.rtt.Types.LONG, new long[] {t$134732, t$134734, t$134736, t$134738})));
        
        //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134740 = r1.max;
        
        //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134741 = ((long)(((int)(t$134740))));
        
        //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134742 = r2.max;
        
        //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134743 = ((long)(((int)(t$134742))));
        
        //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134744 = r3.max;
        
        //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134745 = ((long)(((int)(t$134744))));
        
        //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134746 = r4.max;
        
        //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134747 = ((long)(((int)(t$134746))));
        
        //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.core.Rail t$134748 = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<x10.core.Long> makeRailFromJavaArray(x10.rtt.Types.LONG, new long[] {t$134741, t$134743, t$134745, t$134747})));
        
        //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        alloc$116497.x10$regionarray$RectRegion$$init$S(((x10.core.Rail)(t$134739)), ((x10.core.Rail)(t$134748)), (x10.regionarray.RectRegion.__0$1x10$lang$Long$2__1$1x10$lang$Long$2) null);
        
        //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$134560 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                            alloc$116497)));
        
        //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134560;
    }
    
    
    //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region make(final x10.lang.IntRange r1, final x10.lang.IntRange r2, final x10.lang.IntRange r3, final x10.lang.IntRange r4) {
        
        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$134561 = ((x10.regionarray.Region)(x10.regionarray.Region.makeRectangular(((x10.lang.IntRange)(r1)), ((x10.lang.IntRange)(r2)), ((x10.lang.IntRange)(r3)), ((x10.lang.IntRange)(r4)))));
        
        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134561;
    }
    
    
    //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region makeRectangular(final x10.lang.LongRange r1, final x10.lang.LongRange r2, final x10.lang.LongRange r3, final x10.lang.LongRange r4) {
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.RectRegion alloc$116498 = ((x10.regionarray.RectRegion)(new x10.regionarray.RectRegion((java.lang.System[]) null)));
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134749 = r1.min;
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134750 = r2.min;
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134751 = r3.min;
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134752 = r4.min;
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.core.Rail t$134753 = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<x10.core.Long> makeRailFromJavaArray(x10.rtt.Types.LONG, new long[] {t$134749, t$134750, t$134751, t$134752})));
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134754 = r1.max;
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134755 = r2.max;
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134756 = r3.max;
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134757 = r4.max;
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.core.Rail t$134758 = ((x10.core.Rail)(x10.runtime.impl.java.ArrayUtils.<x10.core.Long> makeRailFromJavaArray(x10.rtt.Types.LONG, new long[] {t$134754, t$134755, t$134756, t$134757})));
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        alloc$116498.x10$regionarray$RectRegion$$init$S(((x10.core.Rail)(t$134753)), ((x10.core.Rail)(t$134758)), (x10.regionarray.RectRegion.__0$1x10$lang$Long$2__1$1x10$lang$Long$2) null);
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$134572 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                            alloc$116498)));
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134572;
    }
    
    
    //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region make(final x10.lang.LongRange r1, final x10.lang.LongRange r2, final x10.lang.LongRange r3, final x10.lang.LongRange r4) {
        
        //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$134573 = ((x10.regionarray.Region)(x10.regionarray.Region.makeRectangular(((x10.lang.LongRange)(r1)), ((x10.lang.LongRange)(r2)), ((x10.lang.LongRange)(r3)), ((x10.lang.LongRange)(r4)))));
        
        //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134573;
    }
    
    
    //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region makeRectangular(final long min, final long max) {
        
        //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.RectRegion1D alloc$116499 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
        
        //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        alloc$116499.x10$regionarray$RectRegion1D$$init$S(((long)(min)), ((long)(max)));
        
        //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return alloc$116499;
    }
    
    
    //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region make(final long min, final long max) {
        
        //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.RectRegion1D alloc$116500 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
        
        //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        alloc$116500.x10$regionarray$RectRegion1D$$init$S(((long)(min)), ((long)(max)));
        
        //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return alloc$116500;
    }
    
    
    //#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region makeBanded(final long size, final long upper, final long lower) {
        
        //#line 259 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int size$134356 = ((int)(long)(((long)(size))));
        
        //#line 259 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int upper$134357 = ((int)(long)(((long)(upper))));
        
        //#line 259 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int lower$134358 = ((int)(long)(((long)(lower))));
        
        //#line 260 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$134574 = ((size$134356) - (((int)(1))));
        
        //#line 260 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$134575 = ((size$134356) - (((int)(1))));
        
        //#line 260 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.Region t$134576 = ((x10.regionarray.Region)(x10.regionarray.PolyRegion.makeBanded((int)(0), (int)(0), (int)(t$134574), (int)(t$134575), (int)(upper$134357), (int)(lower$134358))));
        
        //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134576;
    }
    
    
    //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region makeBanded(final long size) {
        
        //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134577 = ((int)(long)(((long)(size))));
        
        //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134578 = ((long)(((int)(t$134577))));
        
        //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$134579 = ((x10.regionarray.Region)(x10.regionarray.PolyRegion.makeBanded((long)(t$134578), (long)(1L), (long)(1L))));
        
        //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134579;
    }
    
    
    //#line 306 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region makeUpperTriangular(final long size) {
        
        //#line 306 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$134580 = ((x10.regionarray.Region)(x10.regionarray.Region.makeUpperTriangular((long)(0L), (long)(0L), (long)(size))));
        
        //#line 306 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134580;
    }
    
    
    //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region makeUpperTriangular(final long rowMin, final long colMin, final long size) {
        
        //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134581 = ((int)(long)(((long)(rowMin))));
        
        //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134582 = ((int)(long)(((long)(colMin))));
        
        //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134583 = ((int)(long)(((long)(size))));
        
        //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$134584 = ((x10.regionarray.Region)(x10.regionarray.PolyRegion.makeUpperTriangular2((int)(t$134581), (int)(t$134582), (int)(t$134583))));
        
        //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134584;
    }
    
    
    //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region makeLowerTriangular(final long size) {
        
        //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$134585 = ((x10.regionarray.Region)(x10.regionarray.Region.makeLowerTriangular((long)(0L), (long)(0L), (long)(size))));
        
        //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134585;
    }
    
    
    //#line 324 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public static x10.regionarray.Region makeLowerTriangular(final long rowMin, final long colMin, final long size) {
        
        //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134586 = ((int)(long)(((long)(rowMin))));
        
        //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134587 = ((int)(long)(((long)(colMin))));
        
        //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final int t$134588 = ((int)(long)(((long)(size))));
        
        //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$134589 = ((x10.regionarray.Region)(x10.regionarray.PolyRegion.makeLowerTriangular2((int)(t$134586), (int)(t$134587), (int)(t$134588))));
        
        //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134589;
    }
    
    
    //#line 335 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    abstract public long size$O();
    
    
    //#line 340 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    abstract public boolean isConvex$O();
    
    
    //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    abstract public boolean isEmpty$O();
    
    
    //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    abstract public long indexOf$O(final x10.lang.Point p);
    
    
    //#line 362 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public long indexOf$O(final long i0) {
        
        //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$134359 = i0;
        
        //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$134360 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$134360.x10$lang$Point$$init$S(((long)(i$134359)));
        
        //#line 362 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134590 = this.indexOf$O(((x10.lang.Point)(alloc$134360)));
        
        //#line 362 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134590;
    }
    
    
    //#line 363 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public long indexOf$O(final long i0, final long i1) {
        
        //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$134361 = i0;
        
        //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$134362 = i1;
        
        //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$134363 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$134363.x10$lang$Point$$init$S(((long)(i$134361)), ((long)(i$134362)));
        
        //#line 363 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134591 = this.indexOf$O(((x10.lang.Point)(alloc$134363)));
        
        //#line 363 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134591;
    }
    
    
    //#line 364 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public long indexOf$O(final long i0, final long i1, final long i2) {
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$134364 = i0;
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$134365 = i1;
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$134366 = i2;
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$134367 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$134367.x10$lang$Point$$init$S(((long)(i$134364)), ((long)(i$134365)), ((long)(i$134366)));
        
        //#line 364 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134592 = this.indexOf$O(((x10.lang.Point)(alloc$134367)));
        
        //#line 364 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134592;
    }
    
    
    //#line 365 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public long indexOf$O(final long i0, final long i1, final long i2, final long i3) {
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$134368 = i0;
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$134369 = i1;
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$134370 = i2;
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$134371 = i3;
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$134372 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$134372.x10$lang$Point$$init$S(((long)(i$134368)), ((long)(i$134369)), ((long)(i$134370)), ((long)(i$134371)));
        
        //#line 365 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134593 = this.indexOf$O(((x10.lang.Point)(alloc$134372)));
        
        //#line 365 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134593;
    }
    
    
    //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public x10.regionarray.Region boundingBox() {
        
        //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$134594 = ((x10.regionarray.Region)(this.computeBoundingBox()));
        
        //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134594;
    }
    
    
    //#line 379 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    abstract public x10.regionarray.Region computeBoundingBox();
    
    
    //#line 385 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    abstract public x10.core.fun.Fun_0_1 min();
    
    
    //#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    abstract public x10.core.fun.Fun_0_1 max();
    
    
    //#line 397 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public long min$O(final long i) {
        
        //#line 397 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.core.fun.Fun_0_1 t$134595 = this.min();
        
        //#line 397 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134596 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)t$134595).$apply(x10.core.Long.$box(i), x10.rtt.Types.LONG));
        
        //#line 397 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134596;
    }
    
    
    //#line 403 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public long max$O(final long i) {
        
        //#line 403 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.core.fun.Fun_0_1 t$134597 = this.max();
        
        //#line 403 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134598 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)t$134597).$apply(x10.core.Long.$box(i), x10.rtt.Types.LONG));
        
        //#line 403 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134598;
    }
    
    
    //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public x10.lang.Point minPoint() {
        
        //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134599 = rank;
        
        //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.core.fun.Fun_0_1 t$134600 = this.min();
        
        //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.lang.Point t$134601 = ((x10.lang.Point)(x10.lang.Point.make__1$1x10$lang$Long$3x10$lang$Long$2((long)(t$134599), ((x10.core.fun.Fun_0_1)(t$134600)))));
        
        //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134601;
    }
    
    
    //#line 413 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public x10.lang.Point maxPoint() {
        
        //#line 413 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134602 = rank;
        
        //#line 413 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.core.fun.Fun_0_1 t$134603 = this.max();
        
        //#line 413 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.lang.Point t$134604 = ((x10.lang.Point)(x10.lang.Point.make__1$1x10$lang$Long$3x10$lang$Long$2((long)(t$134602), ((x10.core.fun.Fun_0_1)(t$134603)))));
        
        //#line 413 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134604;
    }
    
    
    //#line 450 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    abstract public x10.regionarray.Region intersection(final x10.regionarray.Region that);
    
    
    //#line 464 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public boolean disjoint$O(final x10.regionarray.Region that) {
        
        //#line 464 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$134605 = ((x10.regionarray.Region)(this.intersection(((x10.regionarray.Region)(that)))));
        
        //#line 464 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final boolean t$134606 = t$134605.isEmpty$O();
        
        //#line 464 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134606;
    }
    
    
    //#line 475 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    abstract public x10.regionarray.Region product(final x10.regionarray.Region that);
    
    
    //#line 483 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    abstract public x10.regionarray.Region translate(final x10.lang.Point v);
    
    
    //#line 492 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    abstract public x10.regionarray.Region projection(final long axis);
    
    
    //#line 500 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    abstract public x10.regionarray.Region eliminate(final long axis);
    
    
    //#line 511 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    abstract public x10.lang.Iterator iterator();
    
    
    //#line 519 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public x10.regionarray.Region $and(final x10.regionarray.Region that) {
        
        //#line 519 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$134607 = ((x10.regionarray.Region)(this.intersection(((x10.regionarray.Region)(that)))));
        
        //#line 519 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134607;
    }
    
    
    //#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public x10.regionarray.Region $times(final x10.regionarray.Region that) {
        
        //#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$134608 = ((x10.regionarray.Region)(this.product(((x10.regionarray.Region)(that)))));
        
        //#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134608;
    }
    
    
    //#line 525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public x10.regionarray.Region $plus(final x10.lang.Point v) {
        
        //#line 525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$134609 = ((x10.regionarray.Region)(this.translate(((x10.lang.Point)(v)))));
        
        //#line 525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134609;
    }
    
    
    //#line 526 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public x10.regionarray.Region $inv_plus(final x10.lang.Point v) {
        
        //#line 526 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$134610 = ((x10.regionarray.Region)(this.translate(((x10.lang.Point)(v)))));
        
        //#line 526 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134610;
    }
    
    
    //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public x10.regionarray.Region $minus(final x10.lang.Point v) {
        
        //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.lang.Point t$134611 = ((x10.lang.Point)(v.$minus()));
        
        //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$134612 = ((x10.regionarray.Region)(this.translate(((x10.lang.Point)(t$134611)))));
        
        //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134612;
    }
    
    
    //#line 534 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public boolean equals(final java.lang.Object that) {
        
        //#line 535 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final boolean t$134613 = x10.rtt.Equality.equalsequals((this),(that));
        
        //#line 535 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        if (t$134613) {
            
            //#line 535 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            return true;
        }
        
        //#line 536 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final boolean t$134614 = x10.regionarray.Region.$RTT.isInstance(that);
        
        //#line 536 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final boolean t$134615 = !(t$134614);
        
        //#line 536 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        if (t$134615) {
            
            //#line 536 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            return false;
        }
        
        //#line 537 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t1 = ((x10.regionarray.Region)(x10.rtt.Types.<x10.regionarray.Region> cast(that,x10.regionarray.Region.$RTT)));
        
        //#line 538 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134616 = rank;
        
        //#line 538 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long t$134617 = t1.rank;
        
        //#line 538 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final boolean t$134618 = ((long) t$134616) != ((long) t$134617);
        
        //#line 538 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        if (t$134618) {
            
            //#line 538 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            return false;
        }
        
        //#line 539 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t2 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                      t1)));
        
        //#line 540 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        boolean t$134619 = this.contains$O(((x10.regionarray.Region)(t2)));
        
        //#line 540 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        if (t$134619) {
            
            //#line 540 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            t$134619 = t2.contains$O(((x10.regionarray.Region)(this)));
        }
        
        //#line 540 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final boolean t$134620 = t$134619;
        
        //#line 540 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134620;
    }
    
    
    //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    abstract public boolean contains$O(final x10.regionarray.Region that);
    
    
    //#line 546 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    abstract public boolean contains$O(final x10.lang.Point p);
    
    
    //#line 548 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public boolean contains$O(final long i) {
        
        //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$134373 = i;
        
        //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$134374 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$134374.x10$lang$Point$$init$S(((long)(i$134373)));
        
        //#line 548 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final boolean t$134622 = this.contains$O(((x10.lang.Point)(alloc$134374)));
        
        //#line 548 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134622;
    }
    
    
    //#line 550 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public boolean contains$O(final long i0, final long i1) {
        
        //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$134375 = i0;
        
        //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$134376 = i1;
        
        //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$134377 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$134377.x10$lang$Point$$init$S(((long)(i$134375)), ((long)(i$134376)));
        
        //#line 550 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final boolean t$134624 = this.contains$O(((x10.lang.Point)(alloc$134377)));
        
        //#line 550 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134624;
    }
    
    
    //#line 552 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public boolean contains$O(final long i0, final long i1, final long i2) {
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$134378 = i0;
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$134379 = i1;
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$134380 = i2;
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$134381 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$134381.x10$lang$Point$$init$S(((long)(i$134378)), ((long)(i$134379)), ((long)(i$134380)));
        
        //#line 552 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final boolean t$134626 = this.contains$O(((x10.lang.Point)(alloc$134381)));
        
        //#line 552 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134626;
    }
    
    
    //#line 554 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public boolean contains$O(final long i0, final long i1, final long i2, final long i3) {
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$134382 = i0;
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$134383 = i1;
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$134384 = i2;
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$134385 = i3;
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$134386 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$134386.x10$lang$Point$$init$S(((long)(i$134382)), ((long)(i$134383)), ((long)(i$134384)), ((long)(i$134385)));
        
        //#line 554 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final boolean t$134628 = this.contains$O(((x10.lang.Point)(alloc$134386)));
        
        //#line 554 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134628;
    }
    
    
    //#line 556 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    
    // constructor for non-virtual call
    final public x10.regionarray.Region x10$regionarray$Region$$init$S(final long r, final boolean t, final boolean z) {
         {
            
            //#line 557 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            boolean t$134629 = ((long) r) == ((long) 1L);
            
            //#line 557 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            if (t$134629) {
                
                //#line 557 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                t$134629 = t;
            }
            
            //#line 557 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            boolean t$134630 = t$134629;
            
            //#line 557 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            if (t$134630) {
                
                //#line 557 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                t$134630 = z;
            }
            
            //#line 557 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final boolean isRail = t$134630;
            
            //#line 558 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this.rank = r;
            this.rect = t;
            this.zeroBased = z;
            this.rail = isRail;
            
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.Region this$134759 = this;
        }
        return this;
    }
    
    
    
    //#line 565 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    
    // constructor for non-virtual call
    final public x10.regionarray.Region x10$regionarray$Region$$init$S(final long r) {
         {
            
            //#line 566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this.rank = r;
            this.rect = true;
            this.zeroBased = true;
            this.rail = true;
            
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.Region this$134390 = this;
        }
        return this;
    }
    
    
    
    //#line 575 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    public x10.regionarray.Dist $arrow(final x10.lang.Place p) {
        
        //#line 188 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.Region r$134393 = ((x10.regionarray.Region)(this));
        
        //#line 188 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.lang.Place p$134394 = ((x10.lang.Place)(p));
        
        //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.ConstantDist alloc$134395 = ((x10.regionarray.ConstantDist)(new x10.regionarray.ConstantDist((java.lang.System[]) null)));
        
        //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        alloc$134395.x10$regionarray$ConstantDist$$init$S(((x10.regionarray.Region)(r$134393)), ((x10.lang.Place)(p$134394)));
        
        //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.Dist t$134631 = ((x10.regionarray.Dist)(((x10.regionarray.Dist)
                                                                        alloc$134395)));
        
        //#line 575 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return t$134631;
    }
    
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    final public x10.regionarray.Region x10$regionarray$Region$$this$x10$regionarray$Region() {
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return x10.regionarray.Region.this;
    }
    
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    final public void __fieldInitializers_x10_regionarray_Region() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$267 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$267> $RTT = 
            x10.rtt.StaticFunType.<$Closure$267> make($Closure$267.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.Region.$Closure$267 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.i$134658 = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.Region.$Closure$267 $_obj = new x10.regionarray.Region.$Closure$267((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.i$134658);
            
        }
        
        // constructor just for allocation
        public $Closure$267(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long j$134634) {
            
            //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final boolean t$134635 = ((long) this.i$134658) == ((long) j$134634);
            
            //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            long t$134636 =  0;
            
            //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            if (t$134635) {
                
                //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                t$134636 = -1L;
            } else {
                
                //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                t$134636 = 0L;
            }
            
            //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long t$134637 = t$134636;
            
            //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            return t$134637;
        }
        
        public long i$134658;
        
        public $Closure$267(final long i$134658) {
             {
                this.i$134658 = i$134658;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$268 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$268> $RTT = 
            x10.rtt.StaticFunType.<$Closure$268> make($Closure$268.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.Region.$Closure$268 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.i$134658 = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.Region.$Closure$268 $_obj = new x10.regionarray.Region.$Closure$268((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.i$134658);
            
        }
        
        // constructor just for allocation
        public $Closure$268(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long j$134642) {
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final boolean t$134643 = ((long) this.i$134658) == ((long) j$134642);
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            long t$134644 =  0;
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            if (t$134643) {
                
                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                t$134644 = 1L;
            } else {
                
                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                t$134644 = 0L;
            }
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long t$134645 = t$134644;
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            return t$134645;
        }
        
        public long i$134658;
        
        public $Closure$268(final long i$134658) {
             {
                this.i$134658 = i$134658;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$269 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$269> $RTT = 
            x10.rtt.StaticFunType.<$Closure$269> make($Closure$269.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.Region.$Closure$269 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.ranges = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.Region.$Closure$269 $_obj = new x10.regionarray.Region.$Closure$269((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.ranges);
            
        }
        
        // constructor just for allocation
        public $Closure$269(final java.lang.System[] $dummy) {
            
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
        public static final class __0$1x10$lang$IntRange$2 {}
        
    
        
        public long $apply$O(final long i) {
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.lang.IntRange t$134456 = ((x10.lang.IntRange[])this.ranges.value)[(int)i];
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final int t$134457 = t$134456.min;
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long t$134458 = ((long)(((int)(t$134457))));
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            return t$134458;
        }
        
        public x10.core.Rail<x10.lang.IntRange> ranges;
        
        public $Closure$269(final x10.core.Rail<x10.lang.IntRange> ranges, __0$1x10$lang$IntRange$2 $dummy) {
             {
                this.ranges = ((x10.core.Rail)(ranges));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$270 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$270> $RTT = 
            x10.rtt.StaticFunType.<$Closure$270> make($Closure$270.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.Region.$Closure$270 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.ranges = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.Region.$Closure$270 $_obj = new x10.regionarray.Region.$Closure$270((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.ranges);
            
        }
        
        // constructor just for allocation
        public $Closure$270(final java.lang.System[] $dummy) {
            
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
        public static final class __0$1x10$lang$IntRange$2 {}
        
    
        
        public long $apply$O(final long i) {
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.lang.IntRange t$134461 = ((x10.lang.IntRange[])this.ranges.value)[(int)i];
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final int t$134462 = t$134461.max;
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long t$134463 = ((long)(((int)(t$134462))));
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            return t$134463;
        }
        
        public x10.core.Rail<x10.lang.IntRange> ranges;
        
        public $Closure$270(final x10.core.Rail<x10.lang.IntRange> ranges, __0$1x10$lang$IntRange$2 $dummy) {
             {
                this.ranges = ((x10.core.Rail)(ranges));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$271 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$271> $RTT = 
            x10.rtt.StaticFunType.<$Closure$271> make($Closure$271.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.Region.$Closure$271 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.ranges = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.Region.$Closure$271 $_obj = new x10.regionarray.Region.$Closure$271((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.ranges);
            
        }
        
        // constructor just for allocation
        public $Closure$271(final java.lang.System[] $dummy) {
            
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
        public static final class __0$1x10$lang$LongRange$2 {}
        
    
        
        public long $apply$O(final long i) {
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.lang.LongRange t$134474 = ((x10.lang.LongRange[])this.ranges.value)[(int)i];
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long t$134475 = t$134474.min;
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            return t$134475;
        }
        
        public x10.core.Rail<x10.lang.LongRange> ranges;
        
        public $Closure$271(final x10.core.Rail<x10.lang.LongRange> ranges, __0$1x10$lang$LongRange$2 $dummy) {
             {
                this.ranges = ((x10.core.Rail)(ranges));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$272 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$272> $RTT = 
            x10.rtt.StaticFunType.<$Closure$272> make($Closure$272.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.Region.$Closure$272 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.ranges = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.Region.$Closure$272 $_obj = new x10.regionarray.Region.$Closure$272((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.ranges);
            
        }
        
        // constructor just for allocation
        public $Closure$272(final java.lang.System[] $dummy) {
            
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
        public static final class __0$1x10$lang$LongRange$2 {}
        
    
        
        public long $apply$O(final long i) {
            
            //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.lang.LongRange t$134478 = ((x10.lang.LongRange[])this.ranges.value)[(int)i];
            
            //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long t$134479 = t$134478.max;
            
            //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            return t$134479;
        }
        
        public x10.core.Rail<x10.lang.LongRange> ranges;
        
        public $Closure$272(final x10.core.Rail<x10.lang.LongRange> ranges, __0$1x10$lang$LongRange$2 $dummy) {
             {
                this.ranges = ((x10.core.Rail)(ranges));
            }
        }
        
    }
    
}



