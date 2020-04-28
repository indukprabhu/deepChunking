package x10.regionarray;


@x10.runtime.impl.java.X10Generated
final public class UniqueDist extends x10.regionarray.Dist implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<UniqueDist> $RTT = 
        x10.rtt.NamedType.<UniqueDist> make("x10.regionarray.UniqueDist",
                                            UniqueDist.class,
                                            new x10.rtt.Type[] {
                                                x10.regionarray.Dist.$RTT
                                            });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.UniqueDist $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.Dist.$_deserialize_body($_obj, $deserializer);
        $_obj.pg = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.UniqueDist $_obj = new x10.regionarray.UniqueDist((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.pg);
        
    }
    
    // constructor just for allocation
    public UniqueDist(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    /**
    * The place group for this distribution
    */
    public x10.lang.PlaceGroup pg;
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    /**
     * Cached restricted region for the current place.
     */
    public transient x10.regionarray.Region regionForHere;
    
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    // creation method for java code (1-phase java constructor)
    public UniqueDist(final x10.lang.PlaceGroup g) {
        this((java.lang.System[]) null);
        x10$regionarray$UniqueDist$$init$S(g);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.UniqueDist x10$regionarray$UniqueDist$$init$S(final x10.lang.PlaceGroup g) {
         {
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
            final x10.regionarray.Dist this$135116 = ((x10.regionarray.Dist)(this));
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
            final long t$135137 = g.numPlaces$O();
            
            //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long max$135113 = ((t$135137) - (((long)(1L))));
            
            //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.RectRegion1D alloc$135114 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
            
            //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            alloc$135114.x10$regionarray$RectRegion1D$$init$S(((long)(0L)), ((long)(max$135113)));
            
            //#line 659 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Region region$135115 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                     alloc$135114)));
            
            //#line 660 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            this$135116.region = region$135115;
            {
                
            }
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
            
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
            final x10.regionarray.UniqueDist this$135184 = this;
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
            this$135184.regionForHere = null;
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
            this.pg = ((x10.lang.PlaceGroup)(g));
        }
        return this;
    }
    
    
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    // creation method for java code (1-phase java constructor)
    public UniqueDist() {
        this((java.lang.System[]) null);
        x10$regionarray$UniqueDist$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.UniqueDist x10$regionarray$UniqueDist$$init$S() {
         {
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
            final x10.lang.PlaceGroup.SimplePlaceGroup t$135138 = ((x10.lang.PlaceGroup.SimplePlaceGroup)(x10.lang.PlaceGroup.get$WORLD()));
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
            /*this.*/x10$regionarray$UniqueDist$$init$S(((x10.lang.PlaceGroup)(t$135138)));
        }
        return this;
    }
    
    
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    public x10.lang.PlaceGroup places() {
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        final x10.lang.PlaceGroup t$135139 = ((x10.lang.PlaceGroup)(pg));
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        return t$135139;
    }
    
    
    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    public long numPlaces$O() {
        
        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        final x10.lang.PlaceGroup t$135140 = ((x10.lang.PlaceGroup)(pg));
        
        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        final long t$135141 = t$135140.numPlaces$O();
        
        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        return t$135141;
    }
    
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    public x10.lang.Iterable regions() {
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        final x10.lang.PlaceGroup t$135142 = ((x10.lang.PlaceGroup)(pg));
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        final long t$135145 = t$135142.numPlaces$O();
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        final x10.core.fun.Fun_0_1 t$135146 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.UniqueDist.$Closure$273()));
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        final x10.core.Rail t$135147 = ((x10.core.Rail)(new x10.core.Rail<x10.regionarray.Region>(x10.regionarray.Region.$RTT, t$135145, ((x10.core.fun.Fun_0_1)(t$135146)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        return t$135147;
    }
    
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    public x10.regionarray.Region get(final x10.lang.Place p) {
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        final boolean t$135157 = x10.rtt.Equality.equalsequals((p),(x10.lang.Place.place(x10.x10rt.X10RT.here())));
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        if (t$135157) {
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
            final x10.regionarray.Region t$135148 = ((x10.regionarray.Region)(regionForHere));
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
            final boolean t$135152 = ((t$135148) == (null));
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
            if (t$135152) {
                
                //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
                final x10.lang.PlaceGroup t$135149 = ((x10.lang.PlaceGroup)(pg));
                
                //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
                final long idx = t$135149.indexOf$O(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))));
                
                //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final long min$135126 = idx;
                
                //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final long max$135127 = idx;
                
                //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final x10.regionarray.RectRegion1D alloc$135128 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
                
                //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                alloc$135128.x10$regionarray$RectRegion1D$$init$S(((long)(min$135126)), ((long)(max$135127)));
                
                //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final x10.regionarray.Region t$135150 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                    alloc$135128)));
                
                //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
                final x10.regionarray.Region t$135151 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                    t$135150)));
                
                //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
                this.regionForHere = ((x10.regionarray.Region)(t$135151));
            }
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
            final x10.regionarray.Region t$135153 = ((x10.regionarray.Region)(regionForHere));
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
            return t$135153;
        } else {
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
            final x10.lang.PlaceGroup t$135154 = ((x10.lang.PlaceGroup)(pg));
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
            final long idx = t$135154.indexOf$O(((x10.lang.Place)(p)));
            
            //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long min$135129 = idx;
            
            //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long max$135130 = idx;
            
            //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.RectRegion1D alloc$135131 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
            
            //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            alloc$135131.x10$regionarray$RectRegion1D$$init$S(((long)(min$135129)), ((long)(max$135130)));
            
            //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.Region t$135155 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                alloc$135131)));
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
            final x10.regionarray.Region t$135156 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                t$135155)));
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
            return t$135156;
        }
    }
    
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    public x10.regionarray.Region $apply(final x10.lang.Place p) {
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        final x10.regionarray.Region t$135158 = ((x10.regionarray.Region)(this.get(((x10.lang.Place)(p)))));
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        return t$135158;
    }
    
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    public x10.lang.Place $apply(final x10.lang.Point pt) {
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        final x10.lang.PlaceGroup t$135160 = ((x10.lang.PlaceGroup)(pg));
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        final long t$135159 = ((long)(((int)(0))));
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        final long t$135161 = pt.$apply$O((long)(t$135159));
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        final x10.lang.Place t$135162 = t$135160.$apply((long)(t$135161));
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        return t$135162;
    }
    
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    public x10.lang.Place $apply(final long i0) {
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        final x10.lang.PlaceGroup t$135165 = ((x10.lang.PlaceGroup)(pg));
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        final x10.lang.Place t$135166 = t$135165.$apply((long)(i0));
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        return t$135166;
    }
    
    
    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    public long offset$O(final x10.lang.Point pt) {
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        return 0L;
    }
    
    
    //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    public long offset$O(final long i0) {
        
        //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        return 0L;
    }
    
    
    //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    public x10.lang.Place $apply(final long i0, final long i1) {
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        final java.lang.UnsupportedOperationException t$135171 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException("operator(i0:Long,i1:Long)")));
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        throw t$135171;
    }
    
    
    //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    public x10.lang.Place $apply(final long i0, final long i1, final long i2) {
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        final java.lang.UnsupportedOperationException t$135174 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException("operator(i0:Long,i1:Long,i2:Long)")));
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        throw t$135174;
    }
    
    
    //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    public x10.lang.Place $apply(final long i0, final long i1, final long i2, final long i3) {
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        final java.lang.UnsupportedOperationException t$135177 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException("operator(i0:Long,i1:Long,i2:Long,i3:Long)")));
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        throw t$135177;
    }
    
    
    //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    public long maxOffset$O() {
        
        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        return 0L;
    }
    
    
    //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    public x10.regionarray.Dist restriction(final x10.regionarray.Region r) {
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        final x10.regionarray.WrappedDistRegionRestricted alloc$125298 = ((x10.regionarray.WrappedDistRegionRestricted)(new x10.regionarray.WrappedDistRegionRestricted((java.lang.System[]) null)));
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        alloc$125298.x10$regionarray$WrappedDistRegionRestricted$$init$S(((x10.regionarray.Dist)(this)), ((x10.regionarray.Region)(r)));
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        return alloc$125298;
    }
    
    
    //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    public x10.regionarray.Dist restriction(final x10.lang.Place p) {
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        final x10.regionarray.WrappedDistPlaceRestricted alloc$125299 = ((x10.regionarray.WrappedDistPlaceRestricted)(new x10.regionarray.WrappedDistPlaceRestricted((java.lang.System[]) null)));
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        alloc$125299.x10$regionarray$WrappedDistPlaceRestricted$$init$S(((x10.regionarray.Dist)(this)), ((x10.lang.Place)(p)));
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        final x10.regionarray.Dist t$135178 = ((x10.regionarray.Dist)(((x10.regionarray.Dist)
                                                                        alloc$125299)));
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        return t$135178;
    }
    
    
    //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    public boolean equals(final java.lang.Object thatObj) {
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        final boolean t$135183 = x10.regionarray.UniqueDist.$RTT.isInstance(thatObj);
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        if (t$135183) {
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
            final x10.regionarray.UniqueDist that = ((x10.regionarray.UniqueDist)(x10.rtt.Types.<x10.regionarray.UniqueDist> cast(thatObj,x10.regionarray.UniqueDist.$RTT)));
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
            final x10.lang.PlaceGroup t$135179 = ((x10.lang.PlaceGroup)(pg));
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
            final x10.lang.PlaceGroup t$135180 = ((x10.lang.PlaceGroup)(that.pg));
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
            final boolean t$135181 = t$135179.equals(((java.lang.Object)(t$135180)));
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
            return t$135181;
        } else {
            
            //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
            final boolean t$135182 = super.equals(((java.lang.Object)(thatObj)));
            
            //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
            return t$135182;
        }
    }
    
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    final public x10.regionarray.UniqueDist x10$regionarray$UniqueDist$$this$x10$regionarray$UniqueDist() {
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        return x10.regionarray.UniqueDist.this;
    }
    
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    final public void __fieldInitializers_x10_regionarray_UniqueDist() {
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        this.regionForHere = null;
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$273 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$273> $RTT = 
            x10.rtt.StaticFunType.<$Closure$273> make($Closure$273.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.regionarray.Region.$RTT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.UniqueDist.$Closure$273 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.UniqueDist.$Closure$273 $_obj = new x10.regionarray.UniqueDist.$Closure$273((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            
        }
        
        // constructor just for allocation
        public $Closure$273(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public x10.regionarray.Region $apply(final long i) {
            
            //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long min$135123 = i;
            
            //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long max$135124 = i;
            
            //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.RectRegion1D alloc$135125 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
            
            //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            alloc$135125.x10$regionarray$RectRegion1D$$init$S(((long)(min$135123)), ((long)(max$135124)));
            
            //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.Region t$135143 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                alloc$135125)));
            
            //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
            final x10.regionarray.Region t$135144 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                t$135143)));
            
            //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
            return t$135144;
        }
        
        public $Closure$273() {
             {
                
            }
        }
        
    }
    
    
    public boolean x10$regionarray$Dist$equals$S$O(final java.lang.Object a0) {
        return super.equals(((java.lang.Object)(a0)));
    }
}

