package x10.regionarray;


@x10.runtime.impl.java.X10Generated
final public class ConstantDist extends x10.regionarray.Dist implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<ConstantDist> $RTT = 
        x10.rtt.NamedType.<ConstantDist> make("x10.regionarray.ConstantDist",
                                              ConstantDist.class,
                                              new x10.rtt.Type[] {
                                                  x10.regionarray.Dist.$RTT
                                              });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.ConstantDist $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.Dist.$_deserialize_body($_obj, $deserializer);
        $_obj.onePlace = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.ConstantDist $_obj = new x10.regionarray.ConstantDist((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.onePlace);
        
    }
    
    // constructor just for allocation
    public ConstantDist(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    
    // properties
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    public x10.lang.Place onePlace;
    

    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    // creation method for java code (1-phase java constructor)
    public ConstantDist(final x10.regionarray.Region r, final x10.lang.Place p) {
        this((java.lang.System[]) null);
        x10$regionarray$ConstantDist$$init$S(r, p);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.ConstantDist x10$regionarray$ConstantDist$$init$S(final x10.regionarray.Region r, final x10.lang.Place p) {
         {
            
            //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
            final x10.regionarray.Dist this$125186 = ((x10.regionarray.Dist)(this));
            
            //#line 659 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Region region$125185 = ((x10.regionarray.Region)(r));
            
            //#line 660 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            this$125186.region = region$125185;
            {
                
            }
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
            this.onePlace = p;
            
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
            final x10.regionarray.ConstantDist this$125251 = this;
        }
        return this;
    }
    
    
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    public x10.lang.PlaceGroup places() {
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final x10.lang.SparsePlaceGroup alloc$125182 = ((x10.lang.SparsePlaceGroup)(new x10.lang.SparsePlaceGroup((java.lang.System[]) null)));
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final x10.lang.Place t$125252 = ((x10.lang.Place)(onePlace));
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        alloc$125182.x10$lang$SparsePlaceGroup$$init$S(((x10.lang.Place)(t$125252)));
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        return alloc$125182;
    }
    
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    public long numPlaces$O() {
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        return 1L;
    }
    
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    public x10.lang.Iterable regions() {
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final x10.regionarray.Region t$125207 = ((x10.regionarray.Region)(region));
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final x10.core.Rail t$125208 = ((x10.core.Rail)(new x10.core.Rail<x10.regionarray.Region>(x10.regionarray.Region.$RTT, ((long)(1L)), ((x10.regionarray.Region)(t$125207)), (x10.core.Rail.__1x10$lang$Rail$$T) null)));
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        return t$125208;
    }
    
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    public x10.regionarray.Region get(final x10.lang.Place p) {
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final x10.lang.Place t$125209 = ((x10.lang.Place)(onePlace));
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final boolean t$125213 = x10.rtt.Equality.equalsequals((p),(t$125209));
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        if (t$125213) {
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
            final x10.regionarray.Region t$125210 = ((x10.regionarray.Region)(region));
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
            return t$125210;
        } else {
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
            final x10.regionarray.Dist this$125193 = ((x10.regionarray.Dist)
                                                       this);
            
            //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Region t$125211 = ((x10.regionarray.Region)(this$125193.region));
            
            //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long rank$125194 = t$125211.rank;
            
            //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.EmptyRegion alloc$125195 = ((x10.regionarray.EmptyRegion)(new x10.regionarray.EmptyRegion((java.lang.System[]) null)));
            
            //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            alloc$125195.x10$regionarray$EmptyRegion$$init$S(((long)(rank$125194)));
            
            //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.Region t$125212 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                alloc$125195)));
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
            return t$125212;
        }
    }
    
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    public x10.regionarray.Region $apply(final x10.lang.Place p) {
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final x10.regionarray.Region t$125214 = ((x10.regionarray.Region)(this.get(((x10.lang.Place)(p)))));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        return t$125214;
    }
    
    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    public x10.lang.Place $apply(final x10.lang.Point pt) {
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final x10.lang.Place t$125215 = ((x10.lang.Place)(onePlace));
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        return t$125215;
    }
    
    
    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    public x10.lang.Place $apply(final long i0) {
        
        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final x10.lang.Place t$125218 = ((x10.lang.Place)(onePlace));
        
        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        return t$125218;
    }
    
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    public x10.lang.Place $apply(final long i0, final long i1) {
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final x10.lang.Place t$125221 = ((x10.lang.Place)(onePlace));
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        return t$125221;
    }
    
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    public x10.lang.Place $apply(final long i0, final long i1, final long i2) {
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final x10.lang.Place t$125224 = ((x10.lang.Place)(onePlace));
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        return t$125224;
    }
    
    
    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    public x10.lang.Place $apply(final long i0, final long i1, final long i2, final long i3) {
        
        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final x10.lang.Place t$125227 = ((x10.lang.Place)(onePlace));
        
        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        return t$125227;
    }
    
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    public long offset$O(final x10.lang.Point pt) {
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final x10.regionarray.Region t$125228 = ((x10.regionarray.Region)(region));
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final long offset = t$125228.indexOf$O(((x10.lang.Point)(pt)));
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        return offset;
    }
    
    
    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    public long offset$O(final long i0) {
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final x10.regionarray.Region t$125231 = ((x10.regionarray.Region)(region));
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final long offset = t$125231.indexOf$O((long)(i0));
        
        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        return offset;
    }
    
    
    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    public long offset$O(final long i0, final long i1) {
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final x10.regionarray.Region t$125234 = ((x10.regionarray.Region)(region));
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final long offset = t$125234.indexOf$O((long)(i0), (long)(i1));
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        return offset;
    }
    
    
    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    public long offset$O(final long i0, final long i1, final long i2) {
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final x10.regionarray.Region t$125237 = ((x10.regionarray.Region)(region));
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final long offset = t$125237.indexOf$O((long)(i0), (long)(i1), (long)(i2));
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        return offset;
    }
    
    
    //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    public long offset$O(final long i0, final long i1, final long i2, final long i3) {
        
        //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final x10.regionarray.Region t$125240 = ((x10.regionarray.Region)(region));
        
        //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final long offset = t$125240.indexOf$O((long)(i0), (long)(i1), (long)(i2), (long)(i3));
        
        //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        return offset;
    }
    
    
    //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    public long maxOffset$O() {
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final x10.regionarray.Region t$125241 = ((x10.regionarray.Region)(region));
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final long t$125242 = t$125241.size$O();
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        return t$125242;
    }
    
    
    //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    public x10.regionarray.Dist restriction(final x10.regionarray.Region r) {
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final x10.regionarray.WrappedDistRegionRestricted alloc$125183 = ((x10.regionarray.WrappedDistRegionRestricted)(new x10.regionarray.WrappedDistRegionRestricted((java.lang.System[]) null)));
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        alloc$125183.x10$regionarray$WrappedDistRegionRestricted$$init$S(((x10.regionarray.Dist)(this)), ((x10.regionarray.Region)(r)));
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        return alloc$125183;
    }
    
    
    //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    public x10.regionarray.Dist restriction(final x10.lang.Place p) {
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final x10.regionarray.WrappedDistPlaceRestricted alloc$125184 = ((x10.regionarray.WrappedDistPlaceRestricted)(new x10.regionarray.WrappedDistPlaceRestricted((java.lang.System[]) null)));
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        alloc$125184.x10$regionarray$WrappedDistPlaceRestricted$$init$S(((x10.regionarray.Dist)(this)), ((x10.lang.Place)(p)));
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        return alloc$125184;
    }
    
    
    //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    public boolean equals(final java.lang.Object thatObj) {
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final boolean t$125243 = x10.regionarray.ConstantDist.$RTT.isInstance(thatObj);
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final boolean t$125244 = !(t$125243);
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        if (t$125244) {
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
            return false;
        }
        
        //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final x10.regionarray.ConstantDist that = ((x10.regionarray.ConstantDist)(x10.rtt.Types.<x10.regionarray.ConstantDist> cast(thatObj,x10.regionarray.ConstantDist.$RTT)));
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final x10.lang.Place this$125205 = ((x10.lang.Place)(this.onePlace));
        
        //#line 216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final x10.lang.Place p$125204 = ((x10.lang.Place)(that.onePlace));
        
        //#line 216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$125245 = p$125204.id;
        
        //#line 216 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final long t$125246 = this$125205.id;
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        boolean t$125249 = ((long) t$125245) == ((long) t$125246);
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        if (t$125249) {
            
            //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
            final x10.regionarray.Region t$125247 = ((x10.regionarray.Region)(this.region));
            
            //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
            final x10.regionarray.Region t$125248 = ((x10.regionarray.Region)(that.region));
            
            //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
            t$125249 = t$125247.equals(((java.lang.Object)(t$125248)));
        }
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        final boolean t$125250 = t$125249;
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        return t$125250;
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    final public x10.regionarray.ConstantDist x10$regionarray$ConstantDist$$this$x10$regionarray$ConstantDist() {
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        return x10.regionarray.ConstantDist.this;
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    final public void __fieldInitializers_x10_regionarray_ConstantDist() {
        
    }
}

