package x10.regionarray;


@x10.runtime.impl.java.X10Generated
abstract public class Dist extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.lang.Iterable, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Dist> $RTT = 
        x10.rtt.NamedType.<Dist> make("x10.regionarray.Dist",
                                      Dist.class,
                                      new x10.rtt.Type[] {
                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.lang.Point.$RTT, x10.lang.Place.$RTT),
                                          x10.rtt.ParameterizedType.make(x10.lang.Iterable.$RTT, x10.lang.Point.$RTT)
                                      });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.Dist $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.region = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return null;
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.region);
        
    }
    
    // constructor just for allocation
    public Dist(final java.lang.System[] $dummy) {
        
    }
    
    // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1){}:U
    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
        return $apply((x10.lang.Point)a1);
        
    }
    
    
    // properties
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public x10.regionarray.Region region;
    

    
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    final public long rank$O() {
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.Region t$125340 = ((x10.regionarray.Region)(region));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final long t$125341 = t$125340.rank;
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return t$125341;
    }
    
    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public static x10.regionarray.Dist makeUnique() {
        
        //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.UniqueDist t$125342 = ((x10.regionarray.UniqueDist)(x10.regionarray.Dist.get$UNIQUE()));
        
        //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.Dist t$125343 = ((x10.regionarray.Dist)(((x10.regionarray.Dist)
                                                                        t$125342)));
        
        //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return t$125343;
    }
    
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    private static x10.regionarray.UniqueDist UNIQUE;
    
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public static x10.regionarray.Dist makeConstant(final x10.regionarray.Region r) {
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.ConstantDist alloc$122242 = ((x10.regionarray.ConstantDist)(new x10.regionarray.ConstantDist((java.lang.System[]) null)));
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        alloc$122242.x10$regionarray$ConstantDist$$init$S(((x10.regionarray.Region)(r)), x10.lang.Place.place(x10.x10rt.X10RT.here()));
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return alloc$122242;
    }
    
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public static x10.regionarray.Dist make(final x10.regionarray.Region r) {
        
        //#line 64 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.Region r$125253 = ((x10.regionarray.Region)(r));
        
        //#line 65 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.ConstantDist alloc$125254 = ((x10.regionarray.ConstantDist)(new x10.regionarray.ConstantDist((java.lang.System[]) null)));
        
        //#line 65 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        alloc$125254.x10$regionarray$ConstantDist$$init$S(((x10.regionarray.Region)(r$125253)), x10.lang.Place.place(x10.x10rt.X10RT.here()));
        
        //#line 65 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.Dist t$125344 = ((x10.regionarray.Dist)(((x10.regionarray.Dist)
                                                                        alloc$125254)));
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return t$125344;
    }
    
    
    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public static x10.regionarray.Dist makeCyclic(final x10.regionarray.Region r, final long axis) {
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.Dist t$125345 = ((x10.regionarray.Dist)(x10.regionarray.Dist.makeBlockCyclic(((x10.regionarray.Region)(r)), (long)(axis), (long)(1L))));
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return t$125345;
    }
    
    
    //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public static x10.regionarray.Dist makeCyclic(final x10.regionarray.Region r) {
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.Dist t$125346 = ((x10.regionarray.Dist)(x10.regionarray.Dist.makeBlockCyclic(((x10.regionarray.Region)(r)), (long)(0L), (long)(1L))));
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return t$125346;
    }
    
    
    //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public static x10.regionarray.Dist makeBlock(final x10.regionarray.Region r, final long axis) {
        
        //#line 220 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.Region r$125255 = ((x10.regionarray.Region)(r));
        
        //#line 220 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final long axis$125256 = axis;
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.lang.PlaceGroup.SimplePlaceGroup t$125347 = ((x10.lang.PlaceGroup.SimplePlaceGroup)(x10.lang.PlaceGroup.get$WORLD()));
        
        //#line 220 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.lang.PlaceGroup pg$125257 = ((x10.lang.PlaceGroup)(((x10.lang.PlaceGroup)
                                                                       t$125347)));
        
        //#line 221 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.BlockDist alloc$125258 = ((x10.regionarray.BlockDist)(new x10.regionarray.BlockDist((java.lang.System[]) null)));
        
        //#line 221 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        alloc$125258.x10$regionarray$BlockDist$$init$S(((x10.regionarray.Region)(r$125255)), ((long)(axis$125256)), ((x10.lang.PlaceGroup)(pg$125257)));
        
        //#line 221 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.Dist t$125348 = ((x10.regionarray.Dist)(((x10.regionarray.Dist)
                                                                        alloc$125258)));
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return t$125348;
    }
    
    
    //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public static x10.regionarray.Dist makeBlockBlock(final x10.regionarray.Region r, final long axis0, final long axis1) {
        
        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.BlockBlockDist alloc$122243 = ((x10.regionarray.BlockBlockDist)(new x10.regionarray.BlockBlockDist((java.lang.System[]) null)));
        
        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.lang.PlaceGroup.SimplePlaceGroup t$125495 = ((x10.lang.PlaceGroup.SimplePlaceGroup)(x10.lang.PlaceGroup.get$WORLD()));
        
        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        alloc$122243.x10$regionarray$BlockBlockDist$$init$S(((x10.regionarray.Region)(r)), ((long)(axis0)), ((long)(axis1)), ((x10.lang.PlaceGroup)(t$125495)));
        
        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return alloc$122243;
    }
    
    
    //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public static x10.regionarray.Dist makeBlock(final x10.regionarray.Region r) {
        
        //#line 220 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.Region r$125259 = ((x10.regionarray.Region)(r));
        
        //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.lang.PlaceGroup.SimplePlaceGroup t$125350 = ((x10.lang.PlaceGroup.SimplePlaceGroup)(x10.lang.PlaceGroup.get$WORLD()));
        
        //#line 220 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.lang.PlaceGroup pg$125261 = ((x10.lang.PlaceGroup)(((x10.lang.PlaceGroup)
                                                                       t$125350)));
        
        //#line 221 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.BlockDist alloc$125262 = ((x10.regionarray.BlockDist)(new x10.regionarray.BlockDist((java.lang.System[]) null)));
        
        //#line 221 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        alloc$125262.x10$regionarray$BlockDist$$init$S(((x10.regionarray.Region)(r$125259)), ((long)(0L)), ((x10.lang.PlaceGroup)(pg$125261)));
        
        //#line 221 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.Dist t$125351 = ((x10.regionarray.Dist)(((x10.regionarray.Dist)
                                                                        alloc$125262)));
        
        //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return t$125351;
    }
    
    
    //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public static x10.regionarray.Dist makeBlockCyclic(final x10.regionarray.Region r, final long axis, final long blockSize) {
        
        //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.UnsupportedOperationException t$125352 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException()));
        
        //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        throw t$125352;
    }
    
    
    //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public static x10.regionarray.Dist makeUnique(final x10.lang.PlaceGroup pg) {
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.lang.PlaceGroup.SimplePlaceGroup t$125353 = ((x10.lang.PlaceGroup.SimplePlaceGroup)(x10.lang.PlaceGroup.get$WORLD()));
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final boolean t$125357 = pg.equals(((java.lang.Object)(t$125353)));
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        if (t$125357) {
            
            //#line 52 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.UniqueDist t$125354 = ((x10.regionarray.UniqueDist)(x10.regionarray.Dist.get$UNIQUE()));
            
            //#line 52 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Dist t$125355 = ((x10.regionarray.Dist)(((x10.regionarray.Dist)
                                                                            t$125354)));
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            return t$125355;
        } else {
            
            //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.UniqueDist alloc$122244 = ((x10.regionarray.UniqueDist)(new x10.regionarray.UniqueDist((java.lang.System[]) null)));
            
            //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            alloc$122244.x10$regionarray$UniqueDist$$init$S(((x10.lang.PlaceGroup)(pg)));
            
            //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Dist t$125356 = ((x10.regionarray.Dist)(((x10.regionarray.Dist)
                                                                            alloc$122244)));
            
            //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            return t$125356;
        }
    }
    
    
    //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public static x10.regionarray.Dist makeConstant(final x10.regionarray.Region r, final x10.lang.Place p) {
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.ConstantDist alloc$122245 = ((x10.regionarray.ConstantDist)(new x10.regionarray.ConstantDist((java.lang.System[]) null)));
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        alloc$122245.x10$regionarray$ConstantDist$$init$S(((x10.regionarray.Region)(r)), ((x10.lang.Place)(p)));
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return alloc$122245;
    }
    
    
    //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public static x10.regionarray.Dist makeCyclic(final x10.regionarray.Region r, final long axis, final x10.lang.PlaceGroup pg) {
        
        //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.UnsupportedOperationException t$125358 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException()));
        
        //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        throw t$125358;
    }
    
    
    //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public static x10.regionarray.Dist makeBlock(final x10.regionarray.Region r, final long axis, final x10.lang.PlaceGroup pg) {
        
        //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.BlockDist alloc$122246 = ((x10.regionarray.BlockDist)(new x10.regionarray.BlockDist((java.lang.System[]) null)));
        
        //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        alloc$122246.x10$regionarray$BlockDist$$init$S(((x10.regionarray.Region)(r)), ((long)(axis)), ((x10.lang.PlaceGroup)(pg)));
        
        //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return alloc$122246;
    }
    
    
    //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    abstract public x10.lang.PlaceGroup places();
    
    
    //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    abstract public long numPlaces$O();
    
    
    //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    abstract public x10.lang.Iterable regions();
    
    
    //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    abstract public x10.regionarray.Region get(final x10.lang.Place p);
    
    
    //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public x10.regionarray.Region $apply(final x10.lang.Place p) {
        
        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.Region t$125359 = ((x10.regionarray.Region)(this.get(((x10.lang.Place)(p)))));
        
        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return t$125359;
    }
    
    
    //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    abstract public x10.lang.Place $apply(final x10.lang.Point pt);
    
    
    //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public x10.lang.Place $apply(final long i0) {
        
        //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$125301 = i0;
        
        //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$125302 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$125302.x10$lang$Point$$init$S(((long)(i$125301)));
        
        //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.lang.Place t$125362 = this.$apply(((x10.lang.Point)(alloc$125302)));
        
        //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return t$125362;
    }
    
    
    //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public x10.lang.Place $apply(final long i0, final long i1) {
        
        //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$125304 = i0;
        
        //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$125305 = i1;
        
        //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$125306 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$125306.x10$lang$Point$$init$S(((long)(i$125304)), ((long)(i$125305)));
        
        //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.lang.Place t$125365 = this.$apply(((x10.lang.Point)(alloc$125306)));
        
        //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return t$125365;
    }
    
    
    //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public x10.lang.Place $apply(final long i0, final long i1, final long i2) {
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$125308 = i0;
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$125309 = i1;
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$125310 = i2;
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$125311 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$125311.x10$lang$Point$$init$S(((long)(i$125308)), ((long)(i$125309)), ((long)(i$125310)));
        
        //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.lang.Place t$125368 = this.$apply(((x10.lang.Point)(alloc$125311)));
        
        //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return t$125368;
    }
    
    
    //#line 324 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public x10.lang.Place $apply(final long i0, final long i1, final long i2, final long i3) {
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$125313 = i0;
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$125314 = i1;
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$125315 = i2;
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$125316 = i3;
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$125317 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$125317.x10$lang$Point$$init$S(((long)(i$125313)), ((long)(i$125314)), ((long)(i$125315)), ((long)(i$125316)));
        
        //#line 324 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.lang.Place t$125371 = this.$apply(((x10.lang.Point)(alloc$125317)));
        
        //#line 324 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return t$125371;
    }
    
    
    //#line 338 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    abstract public long offset$O(final x10.lang.Point pt);
    
    
    //#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public long offset$O(final long i0) {
        
        //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$125319 = i0;
        
        //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$125320 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$125320.x10$lang$Point$$init$S(((long)(i$125319)));
        
        //#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final long t$125374 = this.offset$O(((x10.lang.Point)(alloc$125320)));
        
        //#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return t$125374;
    }
    
    
    //#line 369 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public long offset$O(final long i0, final long i1) {
        
        //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$125322 = i0;
        
        //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$125323 = i1;
        
        //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$125324 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$125324.x10$lang$Point$$init$S(((long)(i$125322)), ((long)(i$125323)));
        
        //#line 369 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final long t$125377 = this.offset$O(((x10.lang.Point)(alloc$125324)));
        
        //#line 369 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return t$125377;
    }
    
    
    //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public long offset$O(final long i0, final long i1, final long i2) {
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$125326 = i0;
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$125327 = i1;
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$125328 = i2;
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$125329 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$125329.x10$lang$Point$$init$S(((long)(i$125326)), ((long)(i$125327)), ((long)(i$125328)));
        
        //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final long t$125380 = this.offset$O(((x10.lang.Point)(alloc$125329)));
        
        //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return t$125380;
    }
    
    
    //#line 404 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public long offset$O(final long i0, final long i1, final long i2, final long i3) {
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$125331 = i0;
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$125332 = i1;
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$125333 = i2;
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$125334 = i3;
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$125335 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$125335.x10$lang$Point$$init$S(((long)(i$125331)), ((long)(i$125332)), ((long)(i$125333)), ((long)(i$125334)));
        
        //#line 404 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final long t$125383 = this.offset$O(((x10.lang.Point)(alloc$125335)));
        
        //#line 404 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return t$125383;
    }
    
    
    //#line 411 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    abstract public long maxOffset$O();
    
    
    //#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public x10.lang.Iterator iterator() {
        
        //#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.Region t$125384 = ((x10.regionarray.Region)(region));
        
        //#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.lang.Iterator t$125385 = t$125384.iterator();
        
        //#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return t$125385;
    }
    
    
    //#line 465 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    abstract public x10.regionarray.Dist restriction(final x10.regionarray.Region r);
    
    
    //#line 480 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public boolean isSubdistribution$O(final x10.regionarray.Dist that) {
        
        //#line 118 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final x10.lang.PlaceGroup.SimplePlaceGroup t$125501 = ((x10.lang.PlaceGroup.SimplePlaceGroup)(x10.lang.PlaceGroup.get$WORLD()));
        
        //#line 118 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        final x10.lang.PlaceGroup t$125502 = ((x10.lang.PlaceGroup)
                                               t$125501);
        
        //#line 481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.lang.Iterator p$125503 = t$125502.iterator();
        
        //#line 481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        for (;
             true;
             ) {
            
            //#line 481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final boolean t$125504 = ((x10.lang.Iterator<x10.lang.Place>)p$125503).hasNext$O();
            
            //#line 481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            if (!(t$125504)) {
                
                //#line 481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
                break;
            }
            
            //#line 481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.lang.Place p$125496 = ((x10.lang.Iterator<x10.lang.Place>)p$125503).next$G();
            
            //#line 482 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Region t$125497 = ((x10.regionarray.Region)(that.get(((x10.lang.Place)(p$125496)))));
            
            //#line 482 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Region t$125498 = ((x10.regionarray.Region)(this.get(((x10.lang.Place)(p$125496)))));
            
            //#line 482 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final boolean t$125499 = t$125497.contains$O(((x10.regionarray.Region)(t$125498)));
            
            //#line 482 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final boolean t$125500 = !(t$125499);
            
            //#line 482 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            if (t$125500) {
                
                //#line 483 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
                return false;
            }
        }
        
        //#line 484 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return true;
    }
    
    
    //#line 539 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public boolean equals(final java.lang.Object thatObj) {
        
        //#line 540 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final boolean t$125394 = x10.rtt.Equality.equalsequals((this),(thatObj));
        
        //#line 540 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        if (t$125394) {
            
            //#line 540 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            return true;
        }
        
        //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final boolean t$125395 = x10.regionarray.Dist.$RTT.isInstance(thatObj);
        
        //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final boolean t$125396 = !(t$125395);
        
        //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        if (t$125396) {
            
            //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            return false;
        }
        
        //#line 542 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.Dist that = ((x10.regionarray.Dist)(x10.rtt.Types.<x10.regionarray.Dist> cast(thatObj,x10.regionarray.Dist.$RTT)));
        
        //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.Dist this$125336 = ((x10.regionarray.Dist)(this));
        
        //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.Region t$125397 = ((x10.regionarray.Region)(this$125336.region));
        
        //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final long t$125399 = t$125397.rank;
        
        //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.Region t$125398 = ((x10.regionarray.Region)(that.region));
        
        //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final long t$125400 = t$125398.rank;
        
        //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final boolean t$125401 = ((long) t$125399) != ((long) t$125400);
        
        //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        if (t$125401) {
            
            //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            return false;
        }
        
        //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.Region t$125402 = ((x10.regionarray.Region)(region));
        
        //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.Region t$125403 = ((x10.regionarray.Region)(that.region));
        
        //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final boolean t$125404 = t$125402.equals(((java.lang.Object)(t$125403)));
        
        //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final boolean t$125405 = !(t$125404);
        
        //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        if (t$125405) {
            
            //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            return false;
        }
        
        //#line 545 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.lang.PlaceGroup pg = this.places();
        
        //#line 546 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.lang.Iterator p$125510 = pg.iterator();
        
        //#line 546 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        for (;
             true;
             ) {
            
            //#line 546 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final boolean t$125511 = ((x10.lang.Iterator<x10.lang.Place>)p$125510).hasNext$O();
            
            //#line 546 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            if (!(t$125511)) {
                
                //#line 546 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
                break;
            }
            
            //#line 546 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.lang.Place p$125505 = ((x10.lang.Place)(((x10.lang.Iterator<x10.lang.Place>)p$125510).next$G()));
            
            //#line 547 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Region t$125506 = ((x10.regionarray.Region)(this.get(((x10.lang.Place)(p$125505)))));
            
            //#line 547 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Region t$125507 = ((x10.regionarray.Region)(that.get(((x10.lang.Place)(p$125505)))));
            
            //#line 547 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final boolean t$125508 = t$125506.equals(((java.lang.Object)(t$125507)));
            
            //#line 547 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final boolean t$125509 = !(t$125508);
            
            //#line 547 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            if (t$125509) {
                
                //#line 547 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
                return false;
            }
        }
        
        //#line 549 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return true;
    }
    
    
    //#line 563 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    abstract public x10.regionarray.Dist restriction(final x10.lang.Place p);
    
    
    //#line 571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public boolean contains$O(final x10.lang.Point p) {
        
        //#line 571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.Region t$125412 = ((x10.regionarray.Region)(region));
        
        //#line 571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final boolean t$125413 = t$125412.contains$O(((x10.lang.Point)(p)));
        
        //#line 571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return t$125413;
    }
    
    
    //#line 579 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public boolean containsLocally$O(final x10.lang.Point p) {
        
        //#line 579 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        boolean t$125415 = this.contains$O(((x10.lang.Point)(p)));
        
        //#line 579 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        if (t$125415) {
            
            //#line 579 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Region t$125414 = ((x10.regionarray.Region)(this.$apply(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
            
            //#line 579 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            t$125415 = t$125414.contains$O(((x10.lang.Point)(p)));
        }
        
        //#line 579 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final boolean t$125416 = t$125415;
        
        //#line 579 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return t$125416;
    }
    
    
    //#line 591 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public x10.regionarray.Dist $bar(final x10.regionarray.Region r) {
        
        //#line 592 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.Dist t$125417 = ((x10.regionarray.Dist)(this.restriction(((x10.regionarray.Region)(r)))));
        
        //#line 592 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return t$125417;
    }
    
    
    //#line 600 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public x10.regionarray.Dist $bar(final x10.lang.Place p) {
        
        //#line 600 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.regionarray.Dist t$125418 = ((x10.regionarray.Dist)(this.restriction(((x10.lang.Place)(p)))));
        
        //#line 600 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return t$125418;
    }
    
    
    //#line 638 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public java.lang.String toString() {
        
        //#line 639 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        java.lang.String s = "Dist(";
        
        //#line 640 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        boolean first = true;
        
        //#line 641 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.lang.PlaceGroup t$125524 = this.places();
        
        //#line 641 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.lang.Iterator p$125525 = t$125524.iterator();
        
        //#line 641 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        for (;
             true;
             ) {
            
            //#line 641 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final boolean t$125526 = ((x10.lang.Iterator<x10.lang.Place>)p$125525).hasNext$O();
            
            //#line 641 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            if (!(t$125526)) {
                
                //#line 641 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
                break;
            }
            
            //#line 641 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.lang.Place p$125512 = ((x10.lang.Iterator<x10.lang.Place>)p$125525).next$G();
            
            //#line 642 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final boolean t$125513 = first;
            
            //#line 642 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final boolean t$125514 = !(t$125513);
            
            //#line 642 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            if (t$125514) {
                
                //#line 642 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
                final java.lang.String t$125515 = ((java.lang.String)(s));
                
                //#line 642 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
                final java.lang.String t$125516 = ((t$125515) + (","));
                
                //#line 642 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
                s = ((java.lang.String)(t$125516));
            }
            
            //#line 643 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final java.lang.String t$125517 = ((java.lang.String)(s));
            
            //#line 643 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Region t$125518 = ((x10.regionarray.Region)(this.get(((x10.lang.Place)(p$125512)))));
            
            //#line 643 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final java.lang.String t$125519 = (("") + (t$125518));
            
            //#line 643 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final java.lang.String t$125520 = ((t$125519) + ("->"));
            
            //#line 643 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final long t$125521 = p$125512.id;
            
            //#line 643 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final java.lang.String t$125522 = ((t$125520) + ((x10.core.Long.$box(t$125521))));
            
            //#line 643 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final java.lang.String t$125523 = ((t$125517) + (t$125522));
            
            //#line 643 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            s = ((java.lang.String)(t$125523));
            
            //#line 644 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            first = false;
        }
        
        //#line 646 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125433 = ((java.lang.String)(s));
        
        //#line 646 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125434 = ((t$125433) + (")"));
        
        //#line 646 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        s = ((java.lang.String)(t$125434));
        
        //#line 647 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125435 = ((java.lang.String)(s));
        
        //#line 647 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return t$125435;
    }
    
    
    //#line 659 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    
    // constructor for non-virtual call
    final public x10.regionarray.Dist x10$regionarray$Dist$$init$S(final x10.regionarray.Region region) {
         {
            
            //#line 660 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            this.region = region;
            
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Dist this$125337 = this;
        }
        return this;
    }
    
    
    
    //#line 663 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public static void raiseBoundsError(final long i0) {
        
        //#line 664 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125436 = (("point (") + ((x10.core.Long.$box(i0))));
        
        //#line 664 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125437 = ((t$125436) + (") not contained in distribution"));
        
        //#line 664 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.ArrayIndexOutOfBoundsException t$125438 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$125437)));
        
        //#line 664 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        throw t$125438;
    }
    
    
    //#line 666 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public static void raiseBoundsError(final long i0, final long i1) {
        
        //#line 667 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125439 = (("point (") + ((x10.core.Long.$box(i0))));
        
        //#line 667 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125440 = ((t$125439) + (", "));
        
        //#line 667 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125441 = ((t$125440) + ((x10.core.Long.$box(i1))));
        
        //#line 667 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125442 = ((t$125441) + (") not contained in distribution"));
        
        //#line 667 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.ArrayIndexOutOfBoundsException t$125443 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$125442)));
        
        //#line 667 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        throw t$125443;
    }
    
    
    //#line 669 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public static void raiseBoundsError(final long i0, final long i1, final long i2) {
        
        //#line 670 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125444 = (("point (") + ((x10.core.Long.$box(i0))));
        
        //#line 670 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125445 = ((t$125444) + (", "));
        
        //#line 670 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125446 = ((t$125445) + ((x10.core.Long.$box(i1))));
        
        //#line 670 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125447 = ((t$125446) + (", "));
        
        //#line 670 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125448 = ((t$125447) + ((x10.core.Long.$box(i2))));
        
        //#line 670 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125449 = ((t$125448) + (") not contained in distribution"));
        
        //#line 670 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.ArrayIndexOutOfBoundsException t$125450 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$125449)));
        
        //#line 670 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        throw t$125450;
    }
    
    
    //#line 672 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public static void raiseBoundsError(final long i0, final long i1, final long i2, final long i3) {
        
        //#line 673 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125451 = (("point (") + ((x10.core.Long.$box(i0))));
        
        //#line 673 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125452 = ((t$125451) + (", "));
        
        //#line 673 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125453 = ((t$125452) + ((x10.core.Long.$box(i1))));
        
        //#line 673 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125454 = ((t$125453) + (", "));
        
        //#line 673 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125455 = ((t$125454) + ((x10.core.Long.$box(i2))));
        
        //#line 673 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125456 = ((t$125455) + (", "));
        
        //#line 673 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125457 = ((t$125456) + ((x10.core.Long.$box(i3))));
        
        //#line 673 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125458 = ((t$125457) + (") not contained in distribution"));
        
        //#line 673 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.ArrayIndexOutOfBoundsException t$125459 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$125458)));
        
        //#line 673 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        throw t$125459;
    }
    
    
    //#line 675 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public static void raiseBoundsError(final x10.lang.Point pt) {
        
        //#line 676 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125460 = (("point ") + (pt));
        
        //#line 676 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125461 = ((t$125460) + (" not contained in distribution"));
        
        //#line 676 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.ArrayIndexOutOfBoundsException t$125462 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$125461)));
        
        //#line 676 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        throw t$125462;
    }
    
    
    //#line 679 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public static void raisePlaceError(final long i0) {
        
        //#line 680 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125463 = (("point (") + ((x10.core.Long.$box(i0))));
        
        //#line 680 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125464 = ((t$125463) + (") not defined at "));
        
        //#line 680 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125465 = ((t$125464) + (x10.lang.Place.place(x10.x10rt.X10RT.here())));
        
        //#line 680 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.lang.BadPlaceException t$125466 = ((x10.lang.BadPlaceException)(new x10.lang.BadPlaceException(t$125465)));
        
        //#line 680 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        throw t$125466;
    }
    
    
    //#line 682 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public static void raisePlaceError(final long i0, final long i1) {
        
        //#line 683 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125467 = (("point (") + ((x10.core.Long.$box(i0))));
        
        //#line 683 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125468 = ((t$125467) + (", "));
        
        //#line 683 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125469 = ((t$125468) + ((x10.core.Long.$box(i1))));
        
        //#line 683 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125470 = ((t$125469) + (") not defined at "));
        
        //#line 683 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125471 = ((t$125470) + (x10.lang.Place.place(x10.x10rt.X10RT.here())));
        
        //#line 683 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.lang.BadPlaceException t$125472 = ((x10.lang.BadPlaceException)(new x10.lang.BadPlaceException(t$125471)));
        
        //#line 683 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        throw t$125472;
    }
    
    
    //#line 685 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public static void raisePlaceError(final long i0, final long i1, final long i2) {
        
        //#line 686 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125473 = (("point (") + ((x10.core.Long.$box(i0))));
        
        //#line 686 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125474 = ((t$125473) + (", "));
        
        //#line 686 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125475 = ((t$125474) + ((x10.core.Long.$box(i1))));
        
        //#line 686 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125476 = ((t$125475) + (", "));
        
        //#line 686 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125477 = ((t$125476) + ((x10.core.Long.$box(i2))));
        
        //#line 686 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125478 = ((t$125477) + (") not defined at "));
        
        //#line 686 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125479 = ((t$125478) + (x10.lang.Place.place(x10.x10rt.X10RT.here())));
        
        //#line 686 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.lang.BadPlaceException t$125480 = ((x10.lang.BadPlaceException)(new x10.lang.BadPlaceException(t$125479)));
        
        //#line 686 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        throw t$125480;
    }
    
    
    //#line 688 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public static void raisePlaceError(final long i0, final long i1, final long i2, final long i3) {
        
        //#line 689 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125481 = (("point (") + ((x10.core.Long.$box(i0))));
        
        //#line 689 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125482 = ((t$125481) + (", "));
        
        //#line 689 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125483 = ((t$125482) + ((x10.core.Long.$box(i1))));
        
        //#line 689 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125484 = ((t$125483) + (", "));
        
        //#line 689 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125485 = ((t$125484) + ((x10.core.Long.$box(i2))));
        
        //#line 689 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125486 = ((t$125485) + (", "));
        
        //#line 689 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125487 = ((t$125486) + ((x10.core.Long.$box(i3))));
        
        //#line 689 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125488 = ((t$125487) + (") not defined at "));
        
        //#line 689 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125489 = ((t$125488) + (x10.lang.Place.place(x10.x10rt.X10RT.here())));
        
        //#line 689 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.lang.BadPlaceException t$125490 = ((x10.lang.BadPlaceException)(new x10.lang.BadPlaceException(t$125489)));
        
        //#line 689 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        throw t$125490;
    }
    
    
    //#line 691 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    public static void raisePlaceError(final x10.lang.Point pt) {
        
        //#line 692 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125491 = (("point ") + (pt));
        
        //#line 692 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125492 = ((t$125491) + (" not defined at "));
        
        //#line 692 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final java.lang.String t$125493 = ((t$125492) + (x10.lang.Place.place(x10.x10rt.X10RT.here())));
        
        //#line 692 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        final x10.lang.BadPlaceException t$125494 = ((x10.lang.BadPlaceException)(new x10.lang.BadPlaceException(t$125493)));
        
        //#line 692 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        throw t$125494;
    }
    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    final public x10.regionarray.Dist x10$regionarray$Dist$$this$x10$regionarray$Dist() {
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        return x10.regionarray.Dist.this;
    }
    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    final public void __fieldInitializers_x10_regionarray_Dist() {
        
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$UNIQUE = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$UNIQUE;
    
    public static x10.regionarray.UniqueDist get$UNIQUE() {
        if (((int) x10.regionarray.Dist.initStatus$UNIQUE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.regionarray.Dist.UNIQUE;
        }
        if (((int) x10.regionarray.Dist.initStatus$UNIQUE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.regionarray.Dist.exception$UNIQUE;
        }
        if (x10.regionarray.Dist.initStatus$UNIQUE.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.regionarray.Dist.UNIQUE = ((x10.regionarray.UniqueDist)(new x10.regionarray.UniqueDist((java.lang.System[]) null).x10$regionarray$UniqueDist$$init$S()));
            }}catch (java.lang.Throwable exc$125527) {
                x10.regionarray.Dist.exception$UNIQUE = new x10.lang.ExceptionInInitializer(exc$125527);
                x10.regionarray.Dist.initStatus$UNIQUE.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.regionarray.Dist.exception$UNIQUE;
            }
            x10.regionarray.Dist.initStatus$UNIQUE.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.regionarray.Dist.initStatus$UNIQUE.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.regionarray.Dist.initStatus$UNIQUE.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.regionarray.Dist.initStatus$UNIQUE.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.regionarray.Dist.exception$UNIQUE;
                }
            }
        }
        return x10.regionarray.Dist.UNIQUE;
    }
}




