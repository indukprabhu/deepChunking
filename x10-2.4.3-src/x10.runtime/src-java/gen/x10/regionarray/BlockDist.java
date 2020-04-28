package x10.regionarray;


@x10.runtime.impl.java.X10Generated
final public class BlockDist extends x10.regionarray.Dist implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<BlockDist> $RTT = 
        x10.rtt.NamedType.<BlockDist> make("x10.regionarray.BlockDist",
                                           BlockDist.class,
                                           new x10.rtt.Type[] {
                                               x10.regionarray.Dist.$RTT
                                           });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.BlockDist $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.Dist.$_deserialize_body($_obj, $deserializer);
        $_obj.pg = $deserializer.readObject();
        $_obj.axis = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.BlockDist $_obj = new x10.regionarray.BlockDist((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.pg);
        $serializer.write(this.axis);
        
    }
    
    // constructor just for allocation
    public BlockDist(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    /**
     * The place group for this distribution
     */
    public x10.lang.PlaceGroup pg;
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    /**
     * The axis along which the region is being distributed
     */
    public long axis;
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    /**
     * Cached restricted region for the current place.
     */
    public transient x10.regionarray.Region regionForHere;
    
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    // creation method for java code (1-phase java constructor)
    public BlockDist(final x10.regionarray.Region r, final long axis, final x10.lang.PlaceGroup pg) {
        this((java.lang.System[]) null);
        x10$regionarray$BlockDist$$init$S(r, axis, pg);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.BlockDist x10$regionarray$BlockDist$$init$S(final x10.regionarray.Region r, final long axis, final x10.lang.PlaceGroup pg) {
         {
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.regionarray.Dist this$125018 = ((x10.regionarray.Dist)(this));
            
            //#line 659 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Region region$125017 = ((x10.regionarray.Region)(r));
            
            //#line 660 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            this$125018.region = region$125017;
            {
                
            }
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            
            
            //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.regionarray.BlockDist this$125181 = this;
            
            //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            this$125181.regionForHere = null;
            
            //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            this.axis = axis;
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            this.pg = ((x10.lang.PlaceGroup)(pg));
        }
        return this;
    }
    
    
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    private x10.regionarray.Region blockRegionForPlace(final x10.lang.Place place) {
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.regionarray.Region t$125042 = ((x10.regionarray.Region)(region));
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.regionarray.Region b = ((x10.regionarray.Region)(t$125042.boundingBox()));
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125043 = axis;
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long min = b.min$O((long)(t$125043));
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125044 = axis;
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long max = b.max$O((long)(t$125044));
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.lang.PlaceGroup t$125045 = ((x10.lang.PlaceGroup)(pg));
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125046 = t$125045.numPlaces$O();
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long P = t$125046;
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125047 = ((max) - (((long)(min))));
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long numElems = ((t$125047) + (((long)(1L))));
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long blockSize = ((numElems) / (((long)(P))));
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125048 = ((P) * (((long)(blockSize))));
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long leftOver = ((numElems) - (((long)(t$125048))));
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.lang.PlaceGroup t$125049 = ((x10.lang.PlaceGroup)(pg));
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125050 = t$125049.indexOf$O(((x10.lang.Place)(place)));
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long i = t$125050;
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125051 = ((blockSize) * (((long)(i))));
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125054 = ((min) + (((long)(t$125051))));
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final boolean t$125052 = ((i) < (((long)(leftOver))));
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        long t$125053 =  0;
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        if (t$125052) {
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            t$125053 = i;
        } else {
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            t$125053 = leftOver;
        }
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125055 = t$125053;
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long low = ((t$125054) + (((long)(t$125055))));
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125058 = ((low) + (((long)(blockSize))));
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final boolean t$125056 = ((i) < (((long)(leftOver))));
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        long t$125057 =  0;
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        if (t$125056) {
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            t$125057 = 0L;
        } else {
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            t$125057 = -1L;
        }
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125059 = t$125057;
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long hi = ((t$125058) + (((long)(t$125059))));
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.regionarray.Region t$125060 = ((x10.regionarray.Region)(region));
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final boolean t$125086 = x10.regionarray.RectRegion.$RTT.isInstance(t$125060);
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        if (t$125086) {
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.regionarray.Dist this$125025 = ((x10.regionarray.Dist)
                                                       this);
            
            //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Region t$125061 = ((x10.regionarray.Region)(this$125025.region));
            
            //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final long t$125064 = t$125061.rank;
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.core.fun.Fun_0_1 t$125065 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.BlockDist.$Closure$196(this, this.region)));
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.core.Rail newMin = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(t$125064)), ((x10.core.fun.Fun_0_1)(t$125065)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
            
            //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.regionarray.Dist this$125026 = ((x10.regionarray.Dist)
                                                       this);
            
            //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Region t$125066 = ((x10.regionarray.Region)(this$125026.region));
            
            //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final long t$125069 = t$125066.rank;
            
            //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.core.fun.Fun_0_1 t$125070 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.BlockDist.$Closure$197(this, this.region)));
            
            //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.core.Rail newMax = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(t$125069)), ((x10.core.fun.Fun_0_1)(t$125070)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
            
            //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final long t$125071 = axis;
            
            //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            ((long[])newMin.value)[(int)t$125071] = low;
            
            //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final long t$125072 = axis;
            
            //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            ((long[])newMax.value)[(int)t$125072] = hi;
            
            //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.regionarray.RectRegion alloc$125013 = ((x10.regionarray.RectRegion)(new x10.regionarray.RectRegion((java.lang.System[]) null)));
            
            //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            alloc$125013.x10$regionarray$RectRegion$$init$S(((x10.core.Rail)(newMin)), ((x10.core.Rail)(newMax)), (x10.regionarray.RectRegion.__0$1x10$lang$Long$2__1$1x10$lang$Long$2) null);
            
            //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.regionarray.Region t$125073 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                alloc$125013)));
            
            //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            return t$125073;
        } else {
            
            //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.regionarray.Region t$125074 = ((x10.regionarray.Region)(region));
            
            //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final boolean t$125085 = x10.regionarray.RectRegion1D.$RTT.isInstance(t$125074);
            
            //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            if (t$125085) {
                
                //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
                final x10.regionarray.RectRegion1D alloc$125014 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
                
                //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
                alloc$125014.x10$regionarray$RectRegion1D$$init$S(((long)(low)), ((long)(hi)));
                
                //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
                final x10.regionarray.Region t$125075 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                    alloc$125014)));
                
                //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
                return t$125075;
            } else {
                
                //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final long rank$125027 = axis;
                
                //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final x10.regionarray.FullRegion alloc$125028 = ((x10.regionarray.FullRegion)(new x10.regionarray.FullRegion((java.lang.System[]) null)));
                
                //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                alloc$125028.x10$regionarray$FullRegion$$init$S(((long)(rank$125027)));
                
                //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
                final x10.regionarray.Region r1 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                              alloc$125028)));
                
                //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final long min$125029 = low;
                
                //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final long max$125030 = hi;
                
                //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final x10.regionarray.RectRegion1D alloc$125031 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
                
                //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                alloc$125031.x10$regionarray$RectRegion1D$$init$S(((long)(min$125029)), ((long)(max$125030)));
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
                final x10.regionarray.Region r2 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                              alloc$125031)));
                
                //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
                final x10.regionarray.Region t$125076 = ((x10.regionarray.Region)(region));
                
                //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
                final long t$125077 = t$125076.rank;
                
                //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
                final long t$125078 = axis;
                
                //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
                final long t$125079 = ((t$125077) - (((long)(t$125078))));
                
                //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final long rank$125032 = ((t$125079) - (((long)(1L))));
                
                //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final x10.regionarray.FullRegion alloc$125033 = ((x10.regionarray.FullRegion)(new x10.regionarray.FullRegion((java.lang.System[]) null)));
                
                //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                alloc$125033.x10$regionarray$FullRegion$$init$S(((long)(rank$125032)));
                
                //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
                final x10.regionarray.Region r3 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                              alloc$125033)));
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
                final x10.regionarray.Region t$125080 = ((x10.regionarray.Region)(r1.product(((x10.regionarray.Region)(r2)))));
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
                final x10.regionarray.Region t$125081 = ((x10.regionarray.Region)(t$125080.product(((x10.regionarray.Region)(r3)))));
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
                final x10.regionarray.Region t$125082 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                    t$125081)));
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
                final x10.regionarray.Region t$125083 = ((x10.regionarray.Region)(region));
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
                final x10.regionarray.Region t$125084 = ((x10.regionarray.Region)(t$125082.intersection(((x10.regionarray.Region)(t$125083)))));
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
                return t$125084;
            }
        }
    }
    
    public static x10.regionarray.Region blockRegionForPlace$P(final x10.lang.Place place, final x10.regionarray.BlockDist BlockDist) {
        return BlockDist.blockRegionForPlace(((x10.lang.Place)(place)));
    }
    
    
    //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    private x10.lang.Place mapIndexToPlace(final long index) {
        
        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.regionarray.Region t$125087 = ((x10.regionarray.Region)(region));
        
        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.regionarray.Region bb = ((x10.regionarray.Region)(t$125087.boundingBox()));
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125088 = axis;
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long min = bb.min$O((long)(t$125088));
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125089 = axis;
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long max = bb.max$O((long)(t$125089));
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.lang.PlaceGroup t$125090 = ((x10.lang.PlaceGroup)(pg));
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long P = t$125090.numPlaces$O();
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125091 = ((max) - (((long)(min))));
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long numElems = ((t$125091) + (((long)(1L))));
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long blockSize = ((numElems) / (((long)(P))));
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125092 = ((P) * (((long)(blockSize))));
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long leftOver = ((numElems) - (((long)(t$125092))));
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long normalizedIndex = ((index) - (((long)(min))));
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125093 = ((blockSize) + (((long)(1L))));
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long nominalPlace = ((normalizedIndex) / (((long)(t$125093))));
        
        //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final boolean t$125103 = ((nominalPlace) < (((long)(leftOver))));
        
        //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        if (t$125103) {
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.lang.PlaceGroup t$125094 = ((x10.lang.PlaceGroup)(pg));
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.lang.Place t$125095 = t$125094.$apply((long)(nominalPlace));
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            return t$125095;
        } else {
            
            //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final long indexFromTop = ((max) - (((long)(index))));
            
            //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.lang.PlaceGroup t$125100 = ((x10.lang.PlaceGroup)(pg));
            
            //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.lang.PlaceGroup t$125096 = ((x10.lang.PlaceGroup)(pg));
            
            //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final long t$125097 = t$125096.numPlaces$O();
            
            //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final long t$125098 = ((t$125097) - (((long)(1L))));
            
            //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final long t$125099 = ((indexFromTop) / (((long)(blockSize))));
            
            //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final long t$125101 = ((t$125098) - (((long)(t$125099))));
            
            //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.lang.Place t$125102 = t$125100.$apply((long)(t$125101));
            
            //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            return t$125102;
        }
    }
    
    public static x10.lang.Place mapIndexToPlace$P(final long index, final x10.regionarray.BlockDist BlockDist) {
        return BlockDist.mapIndexToPlace((long)(index));
    }
    
    
    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    public x10.lang.PlaceGroup places() {
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.lang.PlaceGroup t$125104 = ((x10.lang.PlaceGroup)(pg));
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        return t$125104;
    }
    
    
    //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    public long numPlaces$O() {
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.lang.PlaceGroup t$125105 = ((x10.lang.PlaceGroup)(pg));
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125106 = t$125105.numPlaces$O();
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        return t$125106;
    }
    
    
    //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    public x10.lang.Iterable regions() {
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.lang.PlaceGroup t$125107 = ((x10.lang.PlaceGroup)(pg));
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125111 = t$125107.numPlaces$O();
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.core.fun.Fun_0_1 t$125112 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.BlockDist.$Closure$198(this, this.pg)));
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.core.Rail t$125113 = ((x10.core.Rail)(new x10.core.Rail<x10.regionarray.Region>(x10.regionarray.Region.$RTT, t$125111, ((x10.core.fun.Fun_0_1)(t$125112)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        return t$125113;
    }
    
    
    //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    public x10.regionarray.Region get(final x10.lang.Place p) {
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final boolean t$125119 = x10.rtt.Equality.equalsequals((p),(x10.lang.Place.place(x10.x10rt.X10RT.here())));
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        if (t$125119) {
            
            //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.regionarray.Region t$125114 = ((x10.regionarray.Region)(regionForHere));
            
            //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final boolean t$125116 = ((t$125114) == (null));
            
            //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            if (t$125116) {
                
                //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
                final x10.regionarray.Region t$125115 = ((x10.regionarray.Region)(this.blockRegionForPlace(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
                
                //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
                this.regionForHere = ((x10.regionarray.Region)(t$125115));
            }
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.regionarray.Region t$125117 = ((x10.regionarray.Region)(regionForHere));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            return t$125117;
        } else {
            
            //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.regionarray.Region t$125118 = ((x10.regionarray.Region)(this.blockRegionForPlace(((x10.lang.Place)(p)))));
            
            //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            return t$125118;
        }
    }
    
    
    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    public boolean containsLocally$O(final x10.lang.Point p) {
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.regionarray.Region t$125120 = ((x10.regionarray.Region)(this.get(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final boolean t$125121 = t$125120.contains$O(((x10.lang.Point)(p)));
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        return t$125121;
    }
    
    
    //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    public x10.regionarray.Region $apply(final x10.lang.Place p) {
        
        //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.regionarray.Region t$125122 = ((x10.regionarray.Region)(this.get(((x10.lang.Place)(p)))));
        
        //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        return t$125122;
    }
    
    
    //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    public x10.lang.Place $apply(final x10.lang.Point pt) {
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125123 = axis;
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125124 = pt.$apply$O((long)(t$125123));
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.lang.Place t$125125 = this.mapIndexToPlace((long)(t$125124));
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        return t$125125;
    }
    
    
    //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    public x10.lang.Place $apply(final long i0) {
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.lang.Place t$125128 = this.mapIndexToPlace((long)(i0));
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        return t$125128;
    }
    
    
    //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    public x10.lang.Place $apply(final long i0, final long i1) {
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125131 = axis;
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final boolean t$125132 = ((long) t$125131) == ((long) 0L);
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        x10.lang.Place t$125133 =  null;
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        if (t$125132) {
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            t$125133 = this.mapIndexToPlace((long)(i0));
        } else {
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            t$125133 = this.mapIndexToPlace((long)(i1));
        }
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.lang.Place t$125134 = t$125133;
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        return t$125134;
    }
    
    
    //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    public x10.lang.Place $apply(final long i0, final long i1, final long i2) {
        
        //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125137 = axis;
        
        //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final boolean t$125139 = ((long) t$125137) == ((long) 0L);
        
        //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        if (t$125139) {
            
            //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.lang.Place t$125138 = this.mapIndexToPlace((long)(i0));
            
            //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            return t$125138;
        }
        
        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125140 = axis;
        
        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final boolean t$125142 = ((long) t$125140) == ((long) 1L);
        
        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        if (t$125142) {
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.lang.Place t$125141 = this.mapIndexToPlace((long)(i1));
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            return t$125141;
        }
        
        //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.lang.Place t$125143 = this.mapIndexToPlace((long)(i2));
        
        //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        return t$125143;
    }
    
    
    //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    public x10.lang.Place $apply(final long i0, final long i1, final long i2, final long i3) {
        
        //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125146 = axis;
        
        //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final boolean t$125148 = ((long) t$125146) == ((long) 0L);
        
        //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        if (t$125148) {
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.lang.Place t$125147 = this.mapIndexToPlace((long)(i0));
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            return t$125147;
        }
        
        //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125149 = axis;
        
        //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final boolean t$125151 = ((long) t$125149) == ((long) 1L);
        
        //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        if (t$125151) {
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.lang.Place t$125150 = this.mapIndexToPlace((long)(i1));
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            return t$125150;
        }
        
        //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125152 = axis;
        
        //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final boolean t$125154 = ((long) t$125152) == ((long) 2L);
        
        //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        if (t$125154) {
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.lang.Place t$125153 = this.mapIndexToPlace((long)(i2));
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            return t$125153;
        }
        
        //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.lang.Place t$125155 = this.mapIndexToPlace((long)(i3));
        
        //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        return t$125155;
    }
    
    
    //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    public long offset$O(final x10.lang.Point pt) {
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.regionarray.Region r = ((x10.regionarray.Region)(this.get(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long offset = r.indexOf$O(((x10.lang.Point)(pt)));
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final boolean t$125156 = ((long) offset) == ((long) -1L);
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        if (t$125156) {
            
        }
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        return offset;
    }
    
    
    //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    public long offset$O(final long i0) {
        
        //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.regionarray.Region r = ((x10.regionarray.Region)(this.get(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long offset = r.indexOf$O((long)(i0));
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final boolean t$125159 = ((long) offset) == ((long) -1L);
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        if (t$125159) {
            
        }
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        return offset;
    }
    
    
    //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    public long offset$O(final long i0, final long i1) {
        
        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.regionarray.Region r = ((x10.regionarray.Region)(this.get(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
        
        //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long offset = r.indexOf$O((long)(i0), (long)(i1));
        
        //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final boolean t$125162 = ((long) offset) == ((long) -1L);
        
        //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        if (t$125162) {
            
        }
        
        //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        return offset;
    }
    
    
    //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    public long offset$O(final long i0, final long i1, final long i2) {
        
        //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.regionarray.Region r = ((x10.regionarray.Region)(this.get(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
        
        //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long offset = r.indexOf$O((long)(i0), (long)(i1), (long)(i2));
        
        //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final boolean t$125165 = ((long) offset) == ((long) -1L);
        
        //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        if (t$125165) {
            
        }
        
        //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        return offset;
    }
    
    
    //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    public long offset$O(final long i0, final long i1, final long i2, final long i3) {
        
        //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.regionarray.Region r = ((x10.regionarray.Region)(this.get(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
        
        //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long offset = r.indexOf$O((long)(i0), (long)(i1), (long)(i2), (long)(i3));
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final boolean t$125168 = ((long) offset) == ((long) -1L);
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        if (t$125168) {
            
        }
        
        //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        return offset;
    }
    
    
    //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    public long maxOffset$O() {
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.regionarray.Region r = ((x10.regionarray.Region)(this.get(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
        
        //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125169 = r.size$O();
        
        //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125170 = ((t$125169) - (((long)(1L))));
        
        //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        return t$125170;
    }
    
    
    //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    public x10.regionarray.Dist restriction(final x10.regionarray.Region r) {
        
        //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.regionarray.WrappedDistRegionRestricted alloc$125015 = ((x10.regionarray.WrappedDistRegionRestricted)(new x10.regionarray.WrappedDistRegionRestricted((java.lang.System[]) null)));
        
        //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        alloc$125015.x10$regionarray$WrappedDistRegionRestricted$$init$S(((x10.regionarray.Dist)(this)), ((x10.regionarray.Region)(r)));
        
        //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        return alloc$125015;
    }
    
    
    //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    public x10.regionarray.Dist restriction(final x10.lang.Place p) {
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.regionarray.WrappedDistPlaceRestricted alloc$125016 = ((x10.regionarray.WrappedDistPlaceRestricted)(new x10.regionarray.WrappedDistPlaceRestricted((java.lang.System[]) null)));
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        alloc$125016.x10$regionarray$WrappedDistPlaceRestricted$$init$S(((x10.regionarray.Dist)(this)), ((x10.lang.Place)(p)));
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        return alloc$125016;
    }
    
    
    //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    public boolean equals(final java.lang.Object thatObj) {
        
        //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final boolean t$125171 = x10.rtt.Equality.equalsequals((this),(thatObj));
        
        //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        if (t$125171) {
            
            //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            return true;
        }
        
        //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final boolean t$125172 = x10.regionarray.BlockDist.$RTT.isInstance(thatObj);
        
        //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final boolean t$125174 = !(t$125172);
        
        //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        if (t$125174) {
            
            //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final boolean t$125173 = super.equals(((java.lang.Object)(thatObj)));
            
            //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            return t$125173;
        }
        
        //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final x10.regionarray.BlockDist that = ((x10.regionarray.BlockDist)(x10.rtt.Types.<x10.regionarray.BlockDist> cast(thatObj,x10.regionarray.BlockDist.$RTT)));
        
        //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125175 = this.axis;
        
        //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final long t$125176 = that.axis;
        
        //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        boolean t$125179 = x10.rtt.Equality.equalsequals(t$125175, ((long)(t$125176)));
        
        //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        if (t$125179) {
            
            //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.regionarray.Region t$125177 = ((x10.regionarray.Region)(this.region));
            
            //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.regionarray.Region t$125178 = ((x10.regionarray.Region)(that.region));
            
            //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            t$125179 = t$125177.equals(((java.lang.Object)(t$125178)));
        }
        
        //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        final boolean t$125180 = t$125179;
        
        //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        return t$125180;
    }
    
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    final public x10.regionarray.BlockDist x10$regionarray$BlockDist$$this$x10$regionarray$BlockDist() {
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        return x10.regionarray.BlockDist.this;
    }
    
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    final public void __fieldInitializers_x10_regionarray_BlockDist() {
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        this.regionForHere = null;
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$196 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$196> $RTT = 
            x10.rtt.StaticFunType.<$Closure$196> make($Closure$196.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.BlockDist.$Closure$196 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.region = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.BlockDist.$Closure$196 $_obj = new x10.regionarray.BlockDist.$Closure$196((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.region);
            
        }
        
        // constructor just for allocation
        public $Closure$196(final java.lang.System[] $dummy) {
            
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
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.regionarray.Region t$125062 = ((x10.regionarray.Region)(this.region));
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final long t$125063 = t$125062.min$O((long)(i));
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            return t$125063;
        }
        
        public x10.regionarray.BlockDist out$$;
        public x10.regionarray.Region region;
        
        public $Closure$196(final x10.regionarray.BlockDist out$$, final x10.regionarray.Region region) {
             {
                this.out$$ = out$$;
                this.region = ((x10.regionarray.Region)(region));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$197 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$197> $RTT = 
            x10.rtt.StaticFunType.<$Closure$197> make($Closure$197.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.BlockDist.$Closure$197 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.region = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.BlockDist.$Closure$197 $_obj = new x10.regionarray.BlockDist.$Closure$197((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.region);
            
        }
        
        // constructor just for allocation
        public $Closure$197(final java.lang.System[] $dummy) {
            
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
            
            //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.regionarray.Region t$125067 = ((x10.regionarray.Region)(this.region));
            
            //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final long t$125068 = t$125067.max$O((long)(i));
            
            //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            return t$125068;
        }
        
        public x10.regionarray.BlockDist out$$;
        public x10.regionarray.Region region;
        
        public $Closure$197(final x10.regionarray.BlockDist out$$, final x10.regionarray.Region region) {
             {
                this.out$$ = out$$;
                this.region = ((x10.regionarray.Region)(region));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$198 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$198> $RTT = 
            x10.rtt.StaticFunType.<$Closure$198> make($Closure$198.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.regionarray.Region.$RTT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.BlockDist.$Closure$198 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.pg = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.BlockDist.$Closure$198 $_obj = new x10.regionarray.BlockDist.$Closure$198((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.pg);
            
        }
        
        // constructor just for allocation
        public $Closure$198(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public x10.regionarray.Region $apply(final long i) {
            
            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.lang.PlaceGroup t$125108 = ((x10.lang.PlaceGroup)(this.pg));
            
            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.lang.Place t$125109 = t$125108.$apply((long)(i));
            
            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            final x10.regionarray.Region t$125110 = ((x10.regionarray.Region)(this.out$$.blockRegionForPlace(((x10.lang.Place)(t$125109)))));
            
            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            return t$125110;
        }
        
        public x10.regionarray.BlockDist out$$;
        public x10.lang.PlaceGroup pg;
        
        public $Closure$198(final x10.regionarray.BlockDist out$$, final x10.lang.PlaceGroup pg) {
             {
                this.out$$ = out$$;
                this.pg = ((x10.lang.PlaceGroup)(pg));
            }
        }
        
    }
    
    
    public boolean x10$regionarray$Dist$equals$S$O(final java.lang.Object a0) {
        return super.equals(((java.lang.Object)(a0)));
    }
}

