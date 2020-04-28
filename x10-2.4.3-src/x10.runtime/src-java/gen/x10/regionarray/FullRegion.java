package x10.regionarray;

@x10.runtime.impl.java.X10Generated
final public class FullRegion extends x10.regionarray.Region implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<FullRegion> $RTT = 
        x10.rtt.NamedType.<FullRegion> make("x10.regionarray.FullRegion",
                                            FullRegion.class,
                                            new x10.rtt.Type[] {
                                                x10.regionarray.Region.$RTT
                                            });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.FullRegion $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.Region.$_deserialize_body($_obj, $deserializer);
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.FullRegion $_obj = new x10.regionarray.FullRegion((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        
    }
    
    // constructor just for allocation
    public FullRegion(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    // creation method for java code (1-phase java constructor)
    public FullRegion(final long rank) {
        this((java.lang.System[]) null);
        x10$regionarray$FullRegion$$init$S(rank);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.FullRegion x10$regionarray$FullRegion$$init$S(final long rank) {
         {
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            final x10.regionarray.Region this$126200 = ((x10.regionarray.Region)(this));
            
            //#line 556 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long r$126196 = rank;
            
            //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            boolean t$126279 = ((long) r$126196) == ((long) 1L);
            
            //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            if (t$126279) {
                
                //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                t$126279 = true;
            }
            
            //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            boolean t$126280 = t$126279;
            
            //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            if (t$126280) {
                
                //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                t$126280 = false;
            }
            
            //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final boolean isRail$126281 = t$126280;
            
            //#line 558 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this$126200.rank = r$126196;
            
            //#line 558 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this$126200.rect = true;
            
            //#line 558 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this$126200.zeroBased = false;
            
            //#line 558 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this$126200.rail = isRail$126281;
            {
                
            }
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            final x10.regionarray.FullRegion this$126282 = this;
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            final boolean t$126218 = ((rank) < (((long)(0L))));
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            if (t$126218) {
                
                //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                final java.lang.String t$126215 = (("Rank is negative (") + ((x10.core.Long.$box(rank))));
                
                //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                final java.lang.String t$126216 = ((t$126215) + (")"));
                
                //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                final java.lang.IllegalArgumentException t$126217 = ((java.lang.IllegalArgumentException)(new java.lang.IllegalArgumentException(t$126216)));
                
                //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                throw t$126217;
            }
        }
        return this;
    }
    
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    public boolean isConvex$O() {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        return true;
    }
    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    public boolean isEmpty$O() {
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        return false;
    }
    
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    public long size$O() {
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        final x10.regionarray.UnboundedRegionException t$126219 = ((x10.regionarray.UnboundedRegionException)(new x10.regionarray.UnboundedRegionException(((java.lang.String)("size not supported")))));
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        throw t$126219;
    }
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    public long indexOf$O(final x10.lang.Point id$135) {
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        final x10.regionarray.UnboundedRegionException t$126220 = ((x10.regionarray.UnboundedRegionException)(new x10.regionarray.UnboundedRegionException(((java.lang.String)("indexOf not supported")))));
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        throw t$126220;
    }
    
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    public x10.core.fun.Fun_0_1 min() {
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        final x10.core.fun.Fun_0_1 t$126229 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.FullRegion.$Closure$211(this, this.rank)));
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        return t$126229;
    }
    
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    public x10.core.fun.Fun_0_1 max() {
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        final x10.core.fun.Fun_0_1 t$126238 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.FullRegion.$Closure$212(this, this.rank)));
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        return t$126238;
    }
    
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    public x10.regionarray.Region intersection(final x10.regionarray.Region that) {
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        return that;
    }
    
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    public x10.regionarray.Region product(final x10.regionarray.Region that) {
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        final boolean t$126272 = that.isEmpty$O();
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        if (t$126272) {
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            final long t$126239 = rank;
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            final long t$126240 = that.rank;
            
            //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long rank$126207 = ((t$126239) + (((long)(t$126240))));
            
            //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.EmptyRegion alloc$126208 = ((x10.regionarray.EmptyRegion)(new x10.regionarray.EmptyRegion((java.lang.System[]) null)));
            
            //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            alloc$126208.x10$regionarray$EmptyRegion$$init$S(((long)(rank$126207)));
            
            //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.Region t$126241 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                alloc$126208)));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            return t$126241;
        } else {
            
            //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            final boolean t$126271 = x10.regionarray.FullRegion.$RTT.isInstance(that);
            
            //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            if (t$126271) {
                
                //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                final x10.regionarray.FullRegion alloc$124307 = ((x10.regionarray.FullRegion)(new x10.regionarray.FullRegion((java.lang.System[]) null)));
                
                //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                final long t$126283 = rank;
                
                //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                final long t$126284 = that.rank;
                
                //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                final long t$126285 = ((t$126283) + (((long)(t$126284))));
                
                //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                alloc$124307.x10$regionarray$FullRegion$$init$S(t$126285);
                
                //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                return alloc$124307;
            } else {
                
                //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                final boolean t$126270 = x10.regionarray.RectRegion.$RTT.isInstance(that);
                
                //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                if (t$126270) {
                    
                    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                    final x10.regionarray.RectRegion this$126210 = ((x10.regionarray.RectRegion)(x10.rtt.Types.<x10.regionarray.RectRegion> cast(that,x10.regionarray.RectRegion.$RTT)));
                    
                    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                    final x10.core.fun.Fun_0_1 thatMin = ((x10.core.fun.Fun_0_1)(new x10.regionarray.FullRegion.$Closure$213(this$126210)));
                    
                    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                    final x10.regionarray.RectRegion this$126212 = ((x10.regionarray.RectRegion)(x10.rtt.Types.<x10.regionarray.RectRegion> cast(that,x10.regionarray.RectRegion.$RTT)));
                    
                    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                    final x10.core.fun.Fun_0_1 thatMax = ((x10.core.fun.Fun_0_1)(new x10.regionarray.FullRegion.$Closure$214(this$126212)));
                    
                    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                    final long t$126247 = rank;
                    
                    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                    final long t$126248 = that.rank;
                    
                    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                    final long newRank = ((t$126247) + (((long)(t$126248))));
                    
                    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                    final x10.core.fun.Fun_0_1 t$126255 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.FullRegion.$Closure$215(this, this.rank, thatMin, (x10.regionarray.FullRegion.$Closure$215.__2$1x10$lang$Long$3x10$lang$Long$2) null)));
                    
                    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                    final x10.core.Rail newMin = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(newRank)), ((x10.core.fun.Fun_0_1)(t$126255)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
                    
                    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                    final x10.core.fun.Fun_0_1 t$126262 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.FullRegion.$Closure$216(this, this.rank, thatMax, (x10.regionarray.FullRegion.$Closure$216.__2$1x10$lang$Long$3x10$lang$Long$2) null)));
                    
                    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                    final x10.core.Rail newMax = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(newRank)), ((x10.core.fun.Fun_0_1)(t$126262)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
                    
                    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                    final x10.regionarray.RectRegion alloc$124308 = ((x10.regionarray.RectRegion)(new x10.regionarray.RectRegion((java.lang.System[]) null)));
                    
                    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                    alloc$124308.x10$regionarray$RectRegion$$init$S(((x10.core.Rail)(newMin)), ((x10.core.Rail)(newMax)), (x10.regionarray.RectRegion.__0$1x10$lang$Long$2__1$1x10$lang$Long$2) null);
                    
                    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                    return alloc$124308;
                } else {
                    
                    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                    final boolean t$126269 = x10.regionarray.RectRegion1D.$RTT.isInstance(that);
                    
                    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                    if (t$126269) {
                        
                        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                        final x10.regionarray.RectRegion1D t$126263 = ((x10.regionarray.RectRegion1D)(x10.rtt.Types.<x10.regionarray.RectRegion1D> cast(that,x10.regionarray.RectRegion1D.$RTT)));
                        
                        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                        final x10.regionarray.RectRegion t$126264 = ((x10.regionarray.RectRegion)(t$126263.toRectRegion()));
                        
                        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                        final x10.regionarray.Region t$126265 = ((x10.regionarray.Region)(this.product(((x10.regionarray.Region)(t$126264)))));
                        
                        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                        return t$126265;
                    } else {
                        
                        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                        final java.lang.String t$126266 = x10.rtt.Types.typeName(that);
                        
                        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                        final java.lang.String t$126267 = (("haven\'t implemented FullRegion product with ") + (t$126266));
                        
                        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                        final java.lang.UnsupportedOperationException t$126268 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException(t$126267)));
                        
                        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                        throw t$126268;
                    }
                }
            }
        }
    }
    
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    public x10.regionarray.Region projection(final long axis) {
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        final x10.regionarray.FullRegion alloc$124309 = ((x10.regionarray.FullRegion)(new x10.regionarray.FullRegion((java.lang.System[]) null)));
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        alloc$124309.x10$regionarray$FullRegion$$init$S(((long)(1L)));
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        return alloc$124309;
    }
    
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    public x10.regionarray.Region translate(final x10.lang.Point p) {
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        return this;
    }
    
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    public x10.regionarray.FullRegion eliminate(final long i) {
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        final x10.regionarray.FullRegion alloc$124310 = ((x10.regionarray.FullRegion)(new x10.regionarray.FullRegion((java.lang.System[]) null)));
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        final long t$126286 = rank;
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        final long t$126287 = ((t$126286) - (((long)(1L))));
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        alloc$124310.x10$regionarray$FullRegion$$init$S(t$126287);
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        return alloc$124310;
    }
    
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    public x10.regionarray.Region computeBoundingBox() {
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        return this;
    }
    
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    public boolean contains$O(final x10.regionarray.Region that) {
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        return true;
    }
    
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    public boolean contains$O(final x10.lang.Point p) {
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        return true;
    }
    
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    public java.lang.String toString() {
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        final long t$126275 = rank;
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        final java.lang.String t$126276 = (("full(") + ((x10.core.Long.$box(t$126275))));
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        final java.lang.String t$126277 = ((t$126276) + (")"));
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        return t$126277;
    }
    
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    public x10.lang.Iterator iterator() {
        
        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        final x10.regionarray.UnboundedRegionException t$126278 = ((x10.regionarray.UnboundedRegionException)(new x10.regionarray.UnboundedRegionException(((java.lang.String)("iterator not supported")))));
        
        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        throw t$126278;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    final public x10.regionarray.FullRegion x10$regionarray$FullRegion$$this$x10$regionarray$FullRegion() {
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        return x10.regionarray.FullRegion.this;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    final public void __fieldInitializers_x10_regionarray_FullRegion() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$211 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$211> $RTT = 
            x10.rtt.StaticFunType.<$Closure$211> make($Closure$211.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.FullRegion.$Closure$211 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.rank = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.FullRegion.$Closure$211 $_obj = new x10.regionarray.FullRegion.$Closure$211((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.rank);
            
        }
        
        // constructor just for allocation
        public $Closure$211(final java.lang.System[] $dummy) {
            
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
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            boolean t$126222 = ((i) < (((long)(0L))));
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            if (!(t$126222)) {
                
                //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                final long t$126221 = this.rank;
                
                //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                t$126222 = ((i) >= (((long)(t$126221))));
            }
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            final boolean t$126227 = t$126222;
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            if (t$126227) {
                
                //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                final java.lang.String t$126223 = (("min: ") + ((x10.core.Long.$box(i))));
                
                //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                final java.lang.String t$126224 = ((t$126223) + (" is not a valid rank for "));
                
                //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                final java.lang.String t$126225 = ((t$126224) + (this.out$$));
                
                //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                final java.lang.ArrayIndexOutOfBoundsException t$126226 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$126225)));
                
                //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                throw t$126226;
            }
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            final long t$126228 = java.lang.Long.MIN_VALUE;
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            return t$126228;
        }
        
        public x10.regionarray.FullRegion out$$;
        public long rank;
        
        public $Closure$211(final x10.regionarray.FullRegion out$$, final long rank) {
             {
                this.out$$ = out$$;
                this.rank = rank;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$212 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$212> $RTT = 
            x10.rtt.StaticFunType.<$Closure$212> make($Closure$212.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.FullRegion.$Closure$212 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.rank = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.FullRegion.$Closure$212 $_obj = new x10.regionarray.FullRegion.$Closure$212((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.rank);
            
        }
        
        // constructor just for allocation
        public $Closure$212(final java.lang.System[] $dummy) {
            
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
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            boolean t$126231 = ((i) < (((long)(0L))));
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            if (!(t$126231)) {
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                final long t$126230 = this.rank;
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                t$126231 = ((i) >= (((long)(t$126230))));
            }
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            final boolean t$126236 = t$126231;
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            if (t$126236) {
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                final java.lang.String t$126232 = (("max: ") + ((x10.core.Long.$box(i))));
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                final java.lang.String t$126233 = ((t$126232) + (" is not a valid rank for "));
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                final java.lang.String t$126234 = ((t$126233) + (this.out$$));
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                final java.lang.ArrayIndexOutOfBoundsException t$126235 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$126234)));
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                throw t$126235;
            }
            
            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            final long t$126237 = java.lang.Long.MAX_VALUE;
            
            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            return t$126237;
        }
        
        public x10.regionarray.FullRegion out$$;
        public long rank;
        
        public $Closure$212(final x10.regionarray.FullRegion out$$, final long rank) {
             {
                this.out$$ = out$$;
                this.rank = rank;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$213 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$213> $RTT = 
            x10.rtt.StaticFunType.<$Closure$213> make($Closure$213.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.FullRegion.$Closure$213 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.this$126210 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.FullRegion.$Closure$213 $_obj = new x10.regionarray.FullRegion.$Closure$213((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.this$126210);
            
        }
        
        // constructor just for allocation
        public $Closure$213(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i$126209) {
            
            //#line 223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$126245 = this.this$126210.min$O((long)(i$126209));
            
            //#line 223 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$126245;
        }
        
        public x10.regionarray.RectRegion this$126210;
        
        public $Closure$213(final x10.regionarray.RectRegion this$126210) {
             {
                this.this$126210 = ((x10.regionarray.RectRegion)(this$126210));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$214 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$214> $RTT = 
            x10.rtt.StaticFunType.<$Closure$214> make($Closure$214.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.FullRegion.$Closure$214 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.this$126212 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.FullRegion.$Closure$214 $_obj = new x10.regionarray.FullRegion.$Closure$214((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.this$126212);
            
        }
        
        // constructor just for allocation
        public $Closure$214(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Long.$box($apply$O(x10.core.Long.$unbox(a1)));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public long $apply$J(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply$O(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public long $apply$O(final long i$126211) {
            
            //#line 224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$126246 = this.this$126212.max$O((long)(i$126211));
            
            //#line 224 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            return t$126246;
        }
        
        public x10.regionarray.RectRegion this$126212;
        
        public $Closure$214(final x10.regionarray.RectRegion this$126212) {
             {
                this.this$126212 = ((x10.regionarray.RectRegion)(this$126212));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$215 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$215> $RTT = 
            x10.rtt.StaticFunType.<$Closure$215> make($Closure$215.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.FullRegion.$Closure$215 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.rank = $deserializer.readLong();
            $_obj.thatMin = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.FullRegion.$Closure$215 $_obj = new x10.regionarray.FullRegion.$Closure$215((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.rank);
            $serializer.write(this.thatMin);
            
        }
        
        // constructor just for allocation
        public $Closure$215(final java.lang.System[] $dummy) {
            
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
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            final long t$126249 = this.rank;
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            final boolean t$126252 = ((i) < (((long)(t$126249))));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            long t$126253 =  0;
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            if (t$126252) {
                
                //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                t$126253 = java.lang.Long.MIN_VALUE;
            } else {
                
                //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                final long t$126250 = this.rank;
                
                //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                final long t$126251 = ((i) - (((long)(t$126250))));
                
                //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                t$126253 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)this.thatMin).$apply(x10.core.Long.$box(t$126251), x10.rtt.Types.LONG));
            }
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            final long t$126254 = t$126253;
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            return t$126254;
        }
        
        public x10.regionarray.FullRegion out$$;
        public long rank;
        public x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long> thatMin;
        
        public $Closure$215(final x10.regionarray.FullRegion out$$, final long rank, final x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long> thatMin, __2$1x10$lang$Long$3x10$lang$Long$2 $dummy) {
             {
                this.out$$ = out$$;
                this.rank = rank;
                this.thatMin = ((x10.core.fun.Fun_0_1)(thatMin));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$216 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$216> $RTT = 
            x10.rtt.StaticFunType.<$Closure$216> make($Closure$216.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.FullRegion.$Closure$216 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.rank = $deserializer.readLong();
            $_obj.thatMax = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.FullRegion.$Closure$216 $_obj = new x10.regionarray.FullRegion.$Closure$216((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.rank);
            $serializer.write(this.thatMax);
            
        }
        
        // constructor just for allocation
        public $Closure$216(final java.lang.System[] $dummy) {
            
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
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            final long t$126256 = this.rank;
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            final boolean t$126259 = ((i) < (((long)(t$126256))));
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            long t$126260 =  0;
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            if (t$126259) {
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                t$126260 = java.lang.Long.MAX_VALUE;
            } else {
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                final long t$126257 = this.rank;
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                final long t$126258 = ((i) - (((long)(t$126257))));
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
                t$126260 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)this.thatMax).$apply(x10.core.Long.$box(t$126258), x10.rtt.Types.LONG));
            }
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            final long t$126261 = t$126260;
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
            return t$126261;
        }
        
        public x10.regionarray.FullRegion out$$;
        public long rank;
        public x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long> thatMax;
        
        public $Closure$216(final x10.regionarray.FullRegion out$$, final long rank, final x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long> thatMax, __2$1x10$lang$Long$3x10$lang$Long$2 $dummy) {
             {
                this.out$$ = out$$;
                this.rank = rank;
                this.thatMax = ((x10.core.fun.Fun_0_1)(thatMax));
            }
        }
        
    }
    
}

