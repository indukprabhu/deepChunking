package x10.regionarray;

@x10.runtime.impl.java.X10Generated
final public class WrappedDistRegionRestricted extends x10.regionarray.Dist implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<WrappedDistRegionRestricted> $RTT = 
        x10.rtt.NamedType.<WrappedDistRegionRestricted> make("x10.regionarray.WrappedDistRegionRestricted",
                                                             WrappedDistRegionRestricted.class,
                                                             new x10.rtt.Type[] {
                                                                 x10.regionarray.Dist.$RTT
                                                             });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.WrappedDistRegionRestricted $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.Dist.$_deserialize_body($_obj, $deserializer);
        $_obj.base = $deserializer.readObject();
        $_obj.filter = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.WrappedDistRegionRestricted $_obj = new x10.regionarray.WrappedDistRegionRestricted((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.base);
        $serializer.write(this.filter);
        
    }
    
    // constructor just for allocation
    public WrappedDistRegionRestricted(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    public x10.regionarray.Dist base;
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    public x10.regionarray.Region filter;
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    // creation method for java code (1-phase java constructor)
    public WrappedDistRegionRestricted(final x10.regionarray.Dist d, final x10.regionarray.Region r) {
        this((java.lang.System[]) null);
        x10$regionarray$WrappedDistRegionRestricted$$init$S(d, r);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.WrappedDistRegionRestricted x10$regionarray$WrappedDistRegionRestricted$$init$S(final x10.regionarray.Dist d, final x10.regionarray.Region r) {
         {
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            final x10.regionarray.Dist this$135375 = ((x10.regionarray.Dist)(this));
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            final x10.regionarray.Region t$135400 = ((x10.regionarray.Region)(d.region));
            
            //#line 659 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Region region$135374 = ((x10.regionarray.Region)(t$135400.intersection(((x10.regionarray.Region)(r)))));
            
            //#line 660 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            this$135375.region = region$135374;
            {
                
            }
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            final x10.regionarray.WrappedDistRegionRestricted this$135458 = this;
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            this.base = ((x10.regionarray.Dist)(d));
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            this.filter = ((x10.regionarray.Region)(r));
        }
        return this;
    }
    
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    public x10.lang.PlaceGroup places() {
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final x10.regionarray.Dist t$135401 = ((x10.regionarray.Dist)(base));
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final x10.lang.PlaceGroup t$135402 = t$135401.places();
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        return t$135402;
    }
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    public long numPlaces$O() {
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final x10.regionarray.Dist t$135403 = ((x10.regionarray.Dist)(base));
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final long t$135404 = t$135403.numPlaces$O();
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        return t$135404;
    }
    
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    public x10.lang.Iterable regions() {
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final long t$135411 = x10.lang.Place.get$MAX_PLACES();
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final x10.core.fun.Fun_0_1 t$135412 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.WrappedDistRegionRestricted.$Closure$280(this, this.base, this.filter)));
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final x10.core.Rail t$135413 = ((x10.core.Rail)(new x10.core.Rail<x10.regionarray.Region>(x10.regionarray.Region.$RTT, ((long)(t$135411)), ((x10.core.fun.Fun_0_1)(t$135412)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        return t$135413;
    }
    
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    public x10.regionarray.Region get(final x10.lang.Place p) {
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final x10.regionarray.Dist t$135414 = ((x10.regionarray.Dist)(base));
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final x10.regionarray.Region t$135415 = ((x10.regionarray.Region)(t$135414.get(((x10.lang.Place)(p)))));
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final x10.regionarray.Region t$135416 = ((x10.regionarray.Region)(filter));
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final x10.regionarray.Region t$135417 = ((x10.regionarray.Region)(t$135415.intersection(((x10.regionarray.Region)(t$135416)))));
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        return t$135417;
    }
    
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    public x10.regionarray.Region $apply(final x10.lang.Place p) {
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final x10.regionarray.Region t$135418 = ((x10.regionarray.Region)(this.get(((x10.lang.Place)(p)))));
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        return t$135418;
    }
    
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    public x10.lang.Place $apply(final x10.lang.Point pt) {
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final x10.regionarray.Region t$135419 = ((x10.regionarray.Region)(filter));
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final boolean t$135425 = t$135419.contains$O(((x10.lang.Point)(pt)));
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        if (t$135425) {
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            final x10.regionarray.Dist t$135420 = ((x10.regionarray.Dist)(base));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            final x10.lang.Place t$135421 = t$135420.$apply(((x10.lang.Point)(pt)));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            return t$135421;
        } else {
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            final java.lang.String t$135422 = (("point ") + (pt));
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            final java.lang.String t$135423 = ((t$135422) + (" not contained in distribution"));
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            final java.lang.ArrayIndexOutOfBoundsException t$135424 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$135423)));
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            throw t$135424;
        }
    }
    
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    public x10.lang.Place $apply(final long i0) {
        
        //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$135383 = i0;
        
        //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$135384 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$135384.x10$lang$Point$$init$S(((long)(i$135383)));
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final x10.lang.Place t$135428 = this.$apply(((x10.lang.Point)(alloc$135384)));
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        return t$135428;
    }
    
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    public x10.lang.Place $apply(final long i0, final long i1) {
        
        //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$135386 = i0;
        
        //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$135387 = i1;
        
        //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$135388 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$135388.x10$lang$Point$$init$S(((long)(i$135386)), ((long)(i$135387)));
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final x10.lang.Place t$135431 = this.$apply(((x10.lang.Point)(alloc$135388)));
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        return t$135431;
    }
    
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    public x10.lang.Place $apply(final long i0, final long i1, final long i2) {
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$135390 = i0;
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$135391 = i1;
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$135392 = i2;
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$135393 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$135393.x10$lang$Point$$init$S(((long)(i$135390)), ((long)(i$135391)), ((long)(i$135392)));
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final x10.lang.Place t$135434 = this.$apply(((x10.lang.Point)(alloc$135393)));
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        return t$135434;
    }
    
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    public x10.lang.Place $apply(final long i0, final long i1, final long i2, final long i3) {
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$135395 = i0;
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$135396 = i1;
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$135397 = i2;
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$135398 = i3;
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$135399 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$135399.x10$lang$Point$$init$S(((long)(i$135395)), ((long)(i$135396)), ((long)(i$135397)), ((long)(i$135398)));
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final x10.lang.Place t$135437 = this.$apply(((x10.lang.Point)(alloc$135399)));
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        return t$135437;
    }
    
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    public long offset$O(final x10.lang.Point pt) {
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final x10.regionarray.Region t$135438 = ((x10.regionarray.Region)(filter));
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final boolean t$135444 = t$135438.contains$O(((x10.lang.Point)(pt)));
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        if (t$135444) {
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            final x10.regionarray.Dist t$135439 = ((x10.regionarray.Dist)(base));
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            final long t$135440 = t$135439.offset$O(((x10.lang.Point)(pt)));
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            return t$135440;
        } else {
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            final java.lang.String t$135441 = (("point ") + (pt));
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            final java.lang.String t$135442 = ((t$135441) + (" not contained in distribution"));
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            final java.lang.ArrayIndexOutOfBoundsException t$135443 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$135442)));
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            throw t$135443;
        }
    }
    
    
    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    public long maxOffset$O() {
        
        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final x10.regionarray.Dist t$135445 = ((x10.regionarray.Dist)(base));
        
        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final long t$135446 = t$135445.maxOffset$O();
        
        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        return t$135446;
    }
    
    
    //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    public x10.regionarray.Dist restriction(final x10.regionarray.Region r) {
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final x10.regionarray.WrappedDistRegionRestricted alloc$124435 = ((x10.regionarray.WrappedDistRegionRestricted)(new x10.regionarray.WrappedDistRegionRestricted((java.lang.System[]) null)));
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final x10.regionarray.Dist t$135461 = ((x10.regionarray.Dist)(base));
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final x10.regionarray.Region t$135462 = ((x10.regionarray.Region)(filter));
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final x10.regionarray.Region t$135463 = ((x10.regionarray.Region)(t$135462.intersection(((x10.regionarray.Region)(r)))));
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        alloc$124435.x10$regionarray$WrappedDistRegionRestricted$$init$S(((x10.regionarray.Dist)(t$135461)), ((x10.regionarray.Region)(t$135463)));
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        return alloc$124435;
    }
    
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    public x10.regionarray.Dist restriction(final x10.lang.Place p) {
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final x10.regionarray.WrappedDistPlaceRestricted alloc$124436 = ((x10.regionarray.WrappedDistPlaceRestricted)(new x10.regionarray.WrappedDistPlaceRestricted((java.lang.System[]) null)));
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        alloc$124436.x10$regionarray$WrappedDistPlaceRestricted$$init$S(((x10.regionarray.Dist)(this)), ((x10.lang.Place)(p)));
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        return alloc$124436;
    }
    
    
    //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    public boolean equals(final java.lang.Object thatObj) {
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final boolean t$135450 = x10.regionarray.WrappedDistRegionRestricted.$RTT.isInstance(thatObj);
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final boolean t$135451 = !(t$135450);
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        if (t$135451) {
            
            //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            return false;
        }
        
        //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final x10.regionarray.WrappedDistRegionRestricted that = ((x10.regionarray.WrappedDistRegionRestricted)(x10.rtt.Types.<x10.regionarray.WrappedDistRegionRestricted> cast(thatObj,x10.regionarray.WrappedDistRegionRestricted.$RTT)));
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final x10.regionarray.Dist t$135452 = ((x10.regionarray.Dist)(this.base));
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final x10.regionarray.Dist t$135453 = ((x10.regionarray.Dist)(that.base));
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        boolean t$135456 = t$135452.equals(((java.lang.Object)(t$135453)));
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        if (t$135456) {
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            final x10.regionarray.Region t$135454 = ((x10.regionarray.Region)(this.filter));
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            final x10.regionarray.Region t$135455 = ((x10.regionarray.Region)(that.filter));
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            t$135456 = t$135454.equals(((java.lang.Object)(t$135455)));
        }
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        final boolean t$135457 = t$135456;
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        return t$135457;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    final public x10.regionarray.WrappedDistRegionRestricted x10$regionarray$WrappedDistRegionRestricted$$this$x10$regionarray$WrappedDistRegionRestricted() {
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        return x10.regionarray.WrappedDistRegionRestricted.this;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    final public void __fieldInitializers_x10_regionarray_WrappedDistRegionRestricted() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$280 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$280> $RTT = 
            x10.rtt.StaticFunType.<$Closure$280> make($Closure$280.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.regionarray.Region.$RTT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.WrappedDistRegionRestricted.$Closure$280 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.base = $deserializer.readObject();
            $_obj.filter = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.WrappedDistRegionRestricted.$Closure$280 $_obj = new x10.regionarray.WrappedDistRegionRestricted.$Closure$280((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.base);
            $serializer.write(this.filter);
            
        }
        
        // constructor just for allocation
        public $Closure$280(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public x10.regionarray.Region $apply(final long i) {
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            final x10.regionarray.Dist t$135407 = ((x10.regionarray.Dist)(this.base));
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            final x10.lang.Place alloc$124434 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            final int t$135459 = ((int)(long)(((long)(i))));
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            final long t$135460 = ((long)(((int)(t$135459))));
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            alloc$124434.x10$lang$Place$$init$S(t$135460);
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            final x10.regionarray.Region t$135408 = ((x10.regionarray.Region)(t$135407.get(((x10.lang.Place)(alloc$124434)))));
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            final x10.regionarray.Region t$135409 = ((x10.regionarray.Region)(this.filter));
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            final x10.regionarray.Region t$135410 = ((x10.regionarray.Region)(t$135408.intersection(((x10.regionarray.Region)(t$135409)))));
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
            return t$135410;
        }
        
        public x10.regionarray.WrappedDistRegionRestricted out$$;
        public x10.regionarray.Dist base;
        public x10.regionarray.Region filter;
        
        public $Closure$280(final x10.regionarray.WrappedDistRegionRestricted out$$, final x10.regionarray.Dist base, final x10.regionarray.Region filter) {
             {
                this.out$$ = out$$;
                this.base = ((x10.regionarray.Dist)(base));
                this.filter = ((x10.regionarray.Region)(filter));
            }
        }
        
    }
    
}


