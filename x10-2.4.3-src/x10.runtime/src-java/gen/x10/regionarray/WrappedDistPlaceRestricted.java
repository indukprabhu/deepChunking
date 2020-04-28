package x10.regionarray;

@x10.runtime.impl.java.X10Generated
final public class WrappedDistPlaceRestricted extends x10.regionarray.Dist implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<WrappedDistPlaceRestricted> $RTT = 
        x10.rtt.NamedType.<WrappedDistPlaceRestricted> make("x10.regionarray.WrappedDistPlaceRestricted",
                                                            WrappedDistPlaceRestricted.class,
                                                            new x10.rtt.Type[] {
                                                                x10.regionarray.Dist.$RTT
                                                            });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.WrappedDistPlaceRestricted $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.Dist.$_deserialize_body($_obj, $deserializer);
        $_obj.base = $deserializer.readObject();
        $_obj.filter = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.WrappedDistPlaceRestricted $_obj = new x10.regionarray.WrappedDistPlaceRestricted((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.base);
        $serializer.write(this.filter);
        
    }
    
    // constructor just for allocation
    public WrappedDistPlaceRestricted(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    public x10.regionarray.Dist base;
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    public x10.lang.Place filter;
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    // creation method for java code (1-phase java constructor)
    public WrappedDistPlaceRestricted(final x10.regionarray.Dist d, final x10.lang.Place p) {
        this((java.lang.System[]) null);
        x10$regionarray$WrappedDistPlaceRestricted$$init$S(d, p);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.WrappedDistPlaceRestricted x10$regionarray$WrappedDistPlaceRestricted$$init$S(final x10.regionarray.Dist d, final x10.lang.Place p) {
         {
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
            final x10.regionarray.Dist this$135282 = ((x10.regionarray.Dist)(this));
            
            //#line 659 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Region region$135281 = ((x10.regionarray.Region)(d.$apply(((x10.lang.Place)(p)))));
            
            //#line 660 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            this$135282.region = region$135281;
            {
                
            }
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
            
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
            final x10.regionarray.WrappedDistPlaceRestricted this$135372 = this;
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
            this.base = ((x10.regionarray.Dist)(d));
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
            this.filter = ((x10.lang.Place)(p));
        }
        return this;
    }
    
    
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    public x10.lang.PlaceGroup places() {
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        final x10.lang.SparsePlaceGroup alloc$124531 = ((x10.lang.SparsePlaceGroup)(new x10.lang.SparsePlaceGroup((java.lang.System[]) null)));
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        final x10.lang.Place t$135373 = ((x10.lang.Place)(filter));
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        alloc$124531.x10$lang$SparsePlaceGroup$$init$S(((x10.lang.Place)(t$135373)));
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        return alloc$124531;
    }
    
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    public long numPlaces$O() {
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        return 1L;
    }
    
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    public x10.lang.Iterable regions() {
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        final x10.regionarray.Region t$135322 = ((x10.regionarray.Region)(region));
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        final x10.core.Rail t$135323 = ((x10.core.Rail)(new x10.core.Rail<x10.regionarray.Region>(x10.regionarray.Region.$RTT, ((long)(1L)), ((x10.regionarray.Region)(t$135322)), (x10.core.Rail.__1x10$lang$Rail$$T) null)));
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        return t$135323;
    }
    
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    public x10.regionarray.Region get(final x10.lang.Place p) {
        
        //#line 216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final x10.lang.Place p$135289 = ((x10.lang.Place)(filter));
        
        //#line 216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$135324 = p$135289.id;
        
        //#line 216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$135325 = p.id;
        
        //#line 216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final boolean t$135329 = ((long) t$135324) == ((long) t$135325);
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        if (t$135329) {
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
            final x10.regionarray.Region t$135326 = ((x10.regionarray.Region)(region));
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
            return t$135326;
        } else {
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
            final x10.regionarray.Dist this$135290 = ((x10.regionarray.Dist)
                                                       this);
            
            //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Region t$135327 = ((x10.regionarray.Region)(this$135290.region));
            
            //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long rank$135291 = t$135327.rank;
            
            //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.EmptyRegion alloc$135292 = ((x10.regionarray.EmptyRegion)(new x10.regionarray.EmptyRegion((java.lang.System[]) null)));
            
            //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            alloc$135292.x10$regionarray$EmptyRegion$$init$S(((long)(rank$135291)));
            
            //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.Region t$135328 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                alloc$135292)));
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
            return t$135328;
        }
    }
    
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    public x10.regionarray.Region $apply(final x10.lang.Place p) {
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        final x10.regionarray.Region t$135330 = ((x10.regionarray.Region)(this.get(((x10.lang.Place)(p)))));
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        return t$135330;
    }
    
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    public x10.lang.Place $apply(final x10.lang.Point pt) {
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        final x10.regionarray.Dist t$135331 = ((x10.regionarray.Dist)(base));
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        final x10.lang.Place bp = t$135331.$apply(((x10.lang.Point)(pt)));
        
        //#line 216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final x10.lang.Place p$135293 = ((x10.lang.Place)(filter));
        
        //#line 216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$135332 = p$135293.id;
        
        //#line 216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$135333 = bp.id;
        
        //#line 216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final boolean t$135337 = ((long) t$135332) == ((long) t$135333);
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        if (t$135337) {
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
            return bp;
        } else {
            
            //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
            final java.lang.String t$135334 = (("point ") + (pt));
            
            //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
            final java.lang.String t$135335 = ((t$135334) + (" not contained in distribution"));
            
            //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
            final java.lang.ArrayIndexOutOfBoundsException t$135336 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$135335)));
            
            //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
            throw t$135336;
        }
    }
    
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    public x10.lang.Place $apply(final long i0) {
        
        //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$135295 = i0;
        
        //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$135296 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$135296.x10$lang$Point$$init$S(((long)(i$135295)));
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        final x10.lang.Place t$135340 = this.$apply(((x10.lang.Point)(alloc$135296)));
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        return t$135340;
    }
    
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    public x10.lang.Place $apply(final long i0, final long i1) {
        
        //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$135298 = i0;
        
        //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$135299 = i1;
        
        //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$135300 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$135300.x10$lang$Point$$init$S(((long)(i$135298)), ((long)(i$135299)));
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        final x10.lang.Place t$135343 = this.$apply(((x10.lang.Point)(alloc$135300)));
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        return t$135343;
    }
    
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    public x10.lang.Place $apply(final long i0, final long i1, final long i2) {
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$135302 = i0;
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$135303 = i1;
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$135304 = i2;
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$135305 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$135305.x10$lang$Point$$init$S(((long)(i$135302)), ((long)(i$135303)), ((long)(i$135304)));
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        final x10.lang.Place t$135346 = this.$apply(((x10.lang.Point)(alloc$135305)));
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        return t$135346;
    }
    
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    public x10.lang.Place $apply(final long i0, final long i1, final long i2, final long i3) {
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$135307 = i0;
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$135308 = i1;
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$135309 = i2;
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$135310 = i3;
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$135311 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$135311.x10$lang$Point$$init$S(((long)(i$135307)), ((long)(i$135308)), ((long)(i$135309)), ((long)(i$135310)));
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        final x10.lang.Place t$135349 = this.$apply(((x10.lang.Point)(alloc$135311)));
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        return t$135349;
    }
    
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    public long offset$O(final x10.lang.Point pt) {
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        final x10.lang.Place t$135350 = ((x10.lang.Place)(filter));
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        final boolean t$135356 = x10.rtt.Equality.equalsequals((x10.lang.Place.place(x10.x10rt.X10RT.here())),(t$135350));
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        if (t$135356) {
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
            final x10.regionarray.Dist t$135351 = ((x10.regionarray.Dist)(base));
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
            final long t$135352 = t$135351.offset$O(((x10.lang.Point)(pt)));
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
            return t$135352;
        } else {
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
            final java.lang.String t$135353 = (("point ") + (pt));
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
            final java.lang.String t$135354 = ((t$135353) + (" not contained in distribution"));
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
            final java.lang.ArrayIndexOutOfBoundsException t$135355 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$135354)));
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
            throw t$135355;
        }
    }
    
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    public long maxOffset$O() {
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        final x10.regionarray.Dist t$135357 = ((x10.regionarray.Dist)(base));
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        final long t$135358 = t$135357.maxOffset$O();
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        return t$135358;
    }
    
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    public x10.regionarray.Dist restriction(final x10.regionarray.Region r) {
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        final x10.regionarray.WrappedDistRegionRestricted alloc$124532 = ((x10.regionarray.WrappedDistRegionRestricted)(new x10.regionarray.WrappedDistRegionRestricted((java.lang.System[]) null)));
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        alloc$124532.x10$regionarray$WrappedDistRegionRestricted$$init$S(((x10.regionarray.Dist)(this)), ((x10.regionarray.Region)(r)));
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        return alloc$124532;
    }
    
    
    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    public x10.regionarray.Dist restriction(final x10.lang.Place p) {
        
        //#line 216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final x10.lang.Place p$135312 = ((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here())));
        
        //#line 216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$135359 = p$135312.id;
        
        //#line 216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$135360 = p.id;
        
        //#line 216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final boolean t$135363 = ((long) t$135359) == ((long) t$135360);
        
        //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        if (t$135363) {
            
            //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
            return this;
        } else {
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
            final x10.regionarray.Dist this$135313 = ((x10.regionarray.Dist)
                                                       this);
            
            //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Region t$135361 = ((x10.regionarray.Region)(this$135313.region));
            
            //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long rank$135314 = t$135361.rank;
            
            //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.EmptyRegion alloc$135315 = ((x10.regionarray.EmptyRegion)(new x10.regionarray.EmptyRegion((java.lang.System[]) null)));
            
            //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            alloc$135315.x10$regionarray$EmptyRegion$$init$S(((long)(rank$135314)));
            
            //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Region r$135316 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                alloc$135315)));
            
            //#line 64 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Region r$135317 = ((x10.regionarray.Region)(r$135316));
            
            //#line 65 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.ConstantDist alloc$135318 = ((x10.regionarray.ConstantDist)(new x10.regionarray.ConstantDist((java.lang.System[]) null)));
            
            //#line 65 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            alloc$135318.x10$regionarray$ConstantDist$$init$S(((x10.regionarray.Region)(r$135317)), x10.lang.Place.place(x10.x10rt.X10RT.here()));
            
            //#line 65 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Dist t$135362 = ((x10.regionarray.Dist)(((x10.regionarray.Dist)
                                                                            alloc$135318)));
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
            return t$135362;
        }
    }
    
    
    //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    public boolean equals(final java.lang.Object thatObj) {
        
        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        final boolean t$135364 = x10.regionarray.WrappedDistPlaceRestricted.$RTT.isInstance(thatObj);
        
        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        final boolean t$135365 = !(t$135364);
        
        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        if (t$135365) {
            
            //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
            return false;
        }
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        final x10.regionarray.WrappedDistPlaceRestricted that = ((x10.regionarray.WrappedDistPlaceRestricted)(x10.rtt.Types.<x10.regionarray.WrappedDistPlaceRestricted> cast(thatObj,x10.regionarray.WrappedDistPlaceRestricted.$RTT)));
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        final x10.regionarray.Dist t$135366 = ((x10.regionarray.Dist)(this.base));
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        final x10.regionarray.Dist t$135367 = ((x10.regionarray.Dist)(that.base));
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        boolean t$135370 = t$135366.equals(((java.lang.Object)(t$135367)));
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        if (t$135370) {
            
            //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
            final x10.lang.Place this$135320 = ((x10.lang.Place)(this.filter));
            
            //#line 216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            final x10.lang.Place p$135319 = ((x10.lang.Place)(that.filter));
            
            //#line 216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            final long t$135368 = p$135319.id;
            
            //#line 216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            final long t$135369 = this$135320.id;
            
            //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
            t$135370 = ((long) t$135368) == ((long) t$135369);
        }
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        final boolean t$135371 = t$135370;
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        return t$135371;
    }
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    final public x10.regionarray.WrappedDistPlaceRestricted x10$regionarray$WrappedDistPlaceRestricted$$this$x10$regionarray$WrappedDistPlaceRestricted() {
        
        //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
        return x10.regionarray.WrappedDistPlaceRestricted.this;
    }
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistPlaceRestricted.x10"
    final public void __fieldInitializers_x10_regionarray_WrappedDistPlaceRestricted() {
        
    }
}


