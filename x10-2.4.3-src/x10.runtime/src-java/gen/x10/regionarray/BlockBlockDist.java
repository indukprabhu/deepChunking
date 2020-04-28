package x10.regionarray;


@x10.runtime.impl.java.X10Generated
final public class BlockBlockDist extends x10.regionarray.Dist implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<BlockBlockDist> $RTT = 
        x10.rtt.NamedType.<BlockBlockDist> make("x10.regionarray.BlockBlockDist",
                                                BlockBlockDist.class,
                                                new x10.rtt.Type[] {
                                                    x10.regionarray.Dist.$RTT
                                                });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.BlockBlockDist $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.Dist.$_deserialize_body($_obj, $deserializer);
        $_obj.pg = $deserializer.readObject();
        $_obj.axis0 = $deserializer.readLong();
        $_obj.axis1 = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.BlockBlockDist $_obj = new x10.regionarray.BlockBlockDist((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.pg);
        $serializer.write(this.axis0);
        $serializer.write(this.axis1);
        
    }
    
    // constructor just for allocation
    public BlockBlockDist(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    /**
     * The place group for this distribution
     */
    public x10.lang.PlaceGroup pg;
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    /**
     * The first axis along which the region is distributed
     */
    public long axis0;
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    /**
     * The second axis along which the region is distributed
     */
    public long axis1;
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    /**
     * Cached restricted region for the current place.
     */
    public transient x10.regionarray.Region regionForHere;
    
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    // creation method for java code (1-phase java constructor)
    public BlockBlockDist(final x10.regionarray.Region r, final long axis0, final long axis1, final x10.lang.PlaceGroup pg) {
        this((java.lang.System[]) null);
        x10$regionarray$BlockBlockDist$$init$S(r, axis0, axis1, pg);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.BlockBlockDist x10$regionarray$BlockBlockDist$$init$S(final x10.regionarray.Region r, final long axis0, final long axis1, final x10.lang.PlaceGroup pg) {
         {
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.regionarray.Dist this$122254 = ((x10.regionarray.Dist)(this));
            
            //#line 659 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Region region$122253 = ((x10.regionarray.Region)(r));
            
            //#line 660 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            this$122254.region = region$122253;
            {
                
            }
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.regionarray.BlockBlockDist this$124816 = this;
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            this$124816.regionForHere = null;
            
            //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            this.axis0 = axis0;
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            this.axis1 = axis1;
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            this.pg = ((x10.lang.PlaceGroup)(pg));
        }
        return this;
    }
    
    
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    private x10.regionarray.Region blockBlockRegionForPlace(final x10.lang.Place place) {
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final x10.regionarray.Region t$124533 = ((x10.regionarray.Region)(region));
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final x10.regionarray.Region b = ((x10.regionarray.Region)(t$124533.boundingBox()));
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124534 = axis0;
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long min0 = b.min$O((long)(t$124534));
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124535 = axis0;
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long max0 = b.max$O((long)(t$124535));
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124536 = axis1;
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long min1 = b.min$O((long)(t$124536));
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124537 = axis1;
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long max1 = b.max$O((long)(t$124537));
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124538 = ((max0) - (((long)(min0))));
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long size0 = ((t$124538) + (((long)(1L))));
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124539 = ((max1) - (((long)(min1))));
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long size1 = ((t$124539) + (((long)(1L))));
        
        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long divisions0;
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long P;
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final boolean t$124560 = ((size0) > (((long)(1L))));
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        if (t$124560) {
            
            //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124540 = ((size0) % (((long)(2L))));
            
            //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final boolean t$124541 = ((long) t$124540) == ((long) 0L);
            
            //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            long t$124542 =  0;
            
            //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            if (t$124541) {
                
                //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                t$124542 = size0;
            } else {
                
                //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                t$124542 = ((size0) - (((long)(1L))));
            }
            
            //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long size0Even = t$124542;
            
            //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.lang.PlaceGroup t$124543 = ((x10.lang.PlaceGroup)(pg));
            
            //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124544 = t$124543.numPlaces$O();
            
            //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124545 = t$124544;
            
            //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124546 = ((size0Even) * (((long)(size1))));
            
            //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124547 = java.lang.Math.min(((long)(t$124545)),((long)(t$124546)));
            
            //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            P = t$124547;
            
            //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final double t$124548 = ((double)(long)(((long)(P))));
            
            //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final double t$124549 = java.lang.Math.log(((double)(t$124548)));
            
            //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final double t$124550 = java.lang.Math.log(((double)(2.0)));
            
            //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final double t$124551 = ((t$124549) / (((double)(t$124550))));
            
            //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final double t$124552 = ((t$124551) / (((double)(2.0))));
            
            //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final double t$124553 = java.lang.Math.ceil(((double)(t$124552)));
            
            //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124554 = ((long)(double)(((double)(t$124553))));
            
            //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124555 = x10.lang.Math.pow2$O((long)(t$124554));
            
            //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124556 = java.lang.Math.min(((long)(size0Even)),((long)(t$124555)));
            
            //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            divisions0 = t$124556;
        } else {
            
            //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.lang.PlaceGroup t$124557 = ((x10.lang.PlaceGroup)(pg));
            
            //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124558 = t$124557.numPlaces$O();
            
            //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124559 = java.lang.Math.min(((long)(t$124558)),((long)(size1)));
            
            //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            P = t$124559;
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            divisions0 = 1L;
        }
        
        //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final double t$124561 = ((double)(long)(((long)(P))));
        
        //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final double t$124562 = ((double)(long)(((long)(divisions0))));
        
        //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final double t$124563 = ((t$124561) / (((double)(t$124562))));
        
        //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final double t$124564 = java.lang.Math.ceil(((double)(t$124563)));
        
        //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124565 = ((long)(double)(((double)(t$124564))));
        
        //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long divisions1 = java.lang.Math.min(((long)(size1)),((long)(t$124565)));
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124566 = ((divisions0) * (((long)(divisions1))));
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long leftOver = ((t$124566) - (((long)(P))));
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final x10.lang.PlaceGroup t$124567 = ((x10.lang.PlaceGroup)(pg));
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long i = t$124567.indexOf$O(((x10.lang.Place)(place)));
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final boolean t$124570 = ((i) >= (((long)(P))));
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        if (t$124570) {
            
            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.regionarray.Dist this$122261 = ((x10.regionarray.Dist)
                                                       this);
            
            //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Region t$124568 = ((x10.regionarray.Region)(this$122261.region));
            
            //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long rank$122262 = t$124568.rank;
            
            //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.EmptyRegion alloc$122263 = ((x10.regionarray.EmptyRegion)(new x10.regionarray.EmptyRegion((java.lang.System[]) null)));
            
            //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            alloc$122263.x10$regionarray$EmptyRegion$$init$S(((long)(rank$122262)));
            
            //#line 60 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.Region t$124569 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                alloc$122263)));
            
            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            return t$124569;
        }
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124571 = ((divisions0) % (((long)(2L))));
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final boolean t$124574 = ((long) t$124571) == ((long) 0L);
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        long t$124575 =  0;
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        if (t$124574) {
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            t$124575 = 0L;
        } else {
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124572 = ((i) * (((long)(2L))));
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124573 = ((divisions0) + (((long)(1L))));
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            t$124575 = ((t$124572) / (((long)(t$124573))));
        }
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long leftOverOddOffset = t$124575;
        
        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final boolean t$124579 = ((i) < (((long)(leftOver))));
        
        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        long t$124580 =  0;
        
        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        if (t$124579) {
            
            //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124576 = ((i) * (((long)(2L))));
            
            //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124577 = ((t$124576) - (((long)(leftOverOddOffset))));
            
            //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            t$124580 = ((t$124577) % (((long)(divisions0))));
        } else {
            
            //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124578 = ((i) + (((long)(leftOver))));
            
            //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            t$124580 = ((t$124578) % (((long)(divisions0))));
        }
        
        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long blockIndex0 = t$124580;
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final boolean t$124583 = ((i) < (((long)(leftOver))));
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        long t$124584 =  0;
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        if (t$124583) {
            
            //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124581 = ((i) * (((long)(2L))));
            
            //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            t$124584 = ((t$124581) / (((long)(divisions0))));
        } else {
            
            //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124582 = ((i) + (((long)(leftOver))));
            
            //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            t$124584 = ((t$124582) / (((long)(divisions0))));
        }
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long blockIndex1 = t$124584;
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124585 = ((blockIndex0) * (((long)(size0))));
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final double t$124586 = ((double)(long)(((long)(t$124585))));
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final double t$124587 = ((double)(long)(((long)(divisions0))));
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final double t$124588 = ((t$124586) / (((double)(t$124587))));
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final double t$124589 = java.lang.Math.ceil(((double)(t$124588)));
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124590 = ((long)(double)(((double)(t$124589))));
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long low0 = ((min0) + (((long)(t$124590))));
        
        //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final boolean t$124591 = ((i) < (((long)(leftOver))));
        
        //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        long t$124592 =  0;
        
        //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        if (t$124591) {
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            t$124592 = 2L;
        } else {
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            t$124592 = 1L;
        }
        
        //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124593 = t$124592;
        
        //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long blockHi0 = ((blockIndex0) + (((long)(t$124593))));
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124594 = ((blockHi0) * (((long)(size0))));
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final double t$124595 = ((double)(long)(((long)(t$124594))));
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final double t$124596 = ((double)(long)(((long)(divisions0))));
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final double t$124597 = ((t$124595) / (((double)(t$124596))));
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final double t$124598 = java.lang.Math.ceil(((double)(t$124597)));
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124599 = ((long)(double)(((double)(t$124598))));
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124600 = ((min0) + (((long)(t$124599))));
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long hi0 = ((t$124600) - (((long)(1L))));
        
        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124601 = ((blockIndex1) * (((long)(size1))));
        
        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final double t$124602 = ((double)(long)(((long)(t$124601))));
        
        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final double t$124603 = ((double)(long)(((long)(divisions1))));
        
        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final double t$124604 = ((t$124602) / (((double)(t$124603))));
        
        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final double t$124605 = java.lang.Math.ceil(((double)(t$124604)));
        
        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124606 = ((long)(double)(((double)(t$124605))));
        
        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long low1 = ((min1) + (((long)(t$124606))));
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124607 = ((blockIndex1) + (((long)(1L))));
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124608 = ((t$124607) * (((long)(size1))));
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final double t$124609 = ((double)(long)(((long)(t$124608))));
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final double t$124610 = ((double)(long)(((long)(divisions1))));
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final double t$124611 = ((t$124609) / (((double)(t$124610))));
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final double t$124612 = java.lang.Math.ceil(((double)(t$124611)));
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124613 = ((long)(double)(((double)(t$124612))));
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124614 = ((min1) + (((long)(t$124613))));
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long hi1 = ((t$124614) - (((long)(1L))));
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final x10.regionarray.Region t$124615 = ((x10.regionarray.Region)(region));
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final boolean t$124675 = x10.regionarray.RectRegion.$RTT.isInstance(t$124615);
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        if (t$124675) {
            
            //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.regionarray.Dist this$122381 = ((x10.regionarray.Dist)
                                                       this);
            
            //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Region t$124616 = ((x10.regionarray.Region)(this$122381.region));
            
            //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final long t$124621 = t$124616.rank;
            
            //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.core.fun.Fun_0_1 t$124622 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.BlockBlockDist.$Closure$193(this, this.region)));
            
            //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.core.Rail newMin = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(t$124621)), ((x10.core.fun.Fun_0_1)(t$124622)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.regionarray.Dist this$122382 = ((x10.regionarray.Dist)
                                                       this);
            
            //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final x10.regionarray.Region t$124623 = ((x10.regionarray.Region)(this$122382.region));
            
            //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
            final long t$124628 = t$124623.rank;
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.core.fun.Fun_0_1 t$124629 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.BlockBlockDist.$Closure$194(this, this.region)));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.core.Rail newMax = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(t$124628)), ((x10.core.fun.Fun_0_1)(t$124629)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124630 = axis0;
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            ((long[])newMin.value)[(int)t$124630] = low0;
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124631 = axis1;
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            ((long[])newMin.value)[(int)t$124631] = low1;
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124632 = axis0;
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            ((long[])newMax.value)[(int)t$124632] = hi0;
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124633 = axis1;
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            ((long[])newMax.value)[(int)t$124633] = hi1;
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.regionarray.RectRegion alloc$121015 = ((x10.regionarray.RectRegion)(new x10.regionarray.RectRegion((java.lang.System[]) null)));
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            alloc$121015.x10$regionarray$RectRegion$$init$S(((x10.core.Rail)(newMin)), ((x10.core.Rail)(newMax)), (x10.regionarray.RectRegion.__0$1x10$lang$Long$2__1$1x10$lang$Long$2) null);
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.regionarray.Region t$124634 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                alloc$121015)));
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            return t$124634;
        } else {
            
            //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124635 = axis1;
            
            //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124636 = axis0;
            
            //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final boolean t$124637 = ((t$124635) > (((long)(t$124636))));
            
            //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            x10.regionarray.Region t$124638 =  null;
            
            //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            if (t$124637) {
                
                //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final long rank$123977 = axis0;
                
                //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final x10.regionarray.FullRegion alloc$123978 = ((x10.regionarray.FullRegion)(new x10.regionarray.FullRegion((java.lang.System[]) null)));
                
                //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                alloc$123978.x10$regionarray$FullRegion$$init$S(((long)(rank$123977)));
                
                //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                t$124638 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                       alloc$123978)));
            } else {
                
                //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final long rank$124311 = axis1;
                
                //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final x10.regionarray.FullRegion alloc$124312 = ((x10.regionarray.FullRegion)(new x10.regionarray.FullRegion((java.lang.System[]) null)));
                
                //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                alloc$124312.x10$regionarray$FullRegion$$init$S(((long)(rank$124311)));
                
                //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                t$124638 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                       alloc$124312)));
            }
            
            //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.regionarray.Region beforeAxes = ((x10.regionarray.Region)(t$124638));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124639 = axis1;
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124640 = axis0;
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final boolean t$124649 = ((t$124639) > (((long)(t$124640))));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            x10.regionarray.Region t$124650 =  null;
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            if (t$124649) {
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                final long t$124641 = axis1;
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                final long t$124642 = axis0;
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                final long t$124643 = ((t$124641) - (((long)(t$124642))));
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                final long t$124644 = ((long)(((int)(1))));
                
                //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final long rank$124313 = ((t$124643) - (((long)(t$124644))));
                
                //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final x10.regionarray.FullRegion alloc$124314 = ((x10.regionarray.FullRegion)(new x10.regionarray.FullRegion((java.lang.System[]) null)));
                
                //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                alloc$124314.x10$regionarray$FullRegion$$init$S(((long)(rank$124313)));
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                t$124650 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                       alloc$124314)));
            } else {
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                final long t$124645 = axis0;
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                final long t$124646 = axis1;
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                final long t$124647 = ((t$124645) - (((long)(t$124646))));
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                final long t$124648 = ((long)(((int)(1))));
                
                //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final long rank$124315 = ((t$124647) - (((long)(t$124648))));
                
                //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final x10.regionarray.FullRegion alloc$124316 = ((x10.regionarray.FullRegion)(new x10.regionarray.FullRegion((java.lang.System[]) null)));
                
                //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                alloc$124316.x10$regionarray$FullRegion$$init$S(((long)(rank$124315)));
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                t$124650 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                       alloc$124316)));
            }
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.regionarray.Region betweenAxes = ((x10.regionarray.Region)(t$124650));
            
            //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124651 = axis1;
            
            //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124652 = axis0;
            
            //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final boolean t$124663 = ((t$124651) > (((long)(t$124652))));
            
            //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            x10.regionarray.Region t$124664 =  null;
            
            //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            if (t$124663) {
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                final x10.regionarray.Region t$124653 = ((x10.regionarray.Region)(region));
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                final long t$124654 = t$124653.rank;
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                final long t$124655 = axis1;
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                final long t$124656 = ((t$124654) - (((long)(t$124655))));
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                final long t$124657 = ((long)(((int)(1))));
                
                //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final long rank$124317 = ((t$124656) - (((long)(t$124657))));
                
                //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final x10.regionarray.FullRegion alloc$124318 = ((x10.regionarray.FullRegion)(new x10.regionarray.FullRegion((java.lang.System[]) null)));
                
                //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                alloc$124318.x10$regionarray$FullRegion$$init$S(((long)(rank$124317)));
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                t$124664 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                       alloc$124318)));
            } else {
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                final x10.regionarray.Region t$124658 = ((x10.regionarray.Region)(region));
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                final long t$124659 = t$124658.rank;
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                final long t$124660 = axis0;
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                final long t$124661 = ((t$124659) - (((long)(t$124660))));
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                final long t$124662 = ((long)(((int)(1))));
                
                //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final long rank$124319 = ((t$124661) - (((long)(t$124662))));
                
                //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                final x10.regionarray.FullRegion alloc$124320 = ((x10.regionarray.FullRegion)(new x10.regionarray.FullRegion((java.lang.System[]) null)));
                
                //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                alloc$124320.x10$regionarray$FullRegion$$init$S(((long)(rank$124319)));
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                t$124664 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                       alloc$124320)));
            }
            
            //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.regionarray.Region afterAxes = ((x10.regionarray.Region)(t$124664));
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            long lowFirst =  0;
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long hiFirst;
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long lowSecond;
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long hiSecond;
            
            //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124665 = axis1;
            
            //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124666 = axis0;
            
            //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final boolean t$124667 = ((t$124665) > (((long)(t$124666))));
            
            //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            if (t$124667) {
                
                //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                lowFirst = low0;
                
                //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                lowSecond = low1;
                
                //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                hiFirst = hi0;
                
                //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                hiSecond = hi1;
            } else {
                
                //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                lowFirst = low1;
                
                //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                lowSecond = low0;
                
                //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                hiFirst = hi1;
                
                //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                hiSecond = hi0;
            }
            
            //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long min$124321 = lowFirst;
            
            //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long max$124322 = hiFirst;
            
            //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.RectRegion1D alloc$124323 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
            
            //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            alloc$124323.x10$regionarray$RectRegion1D$$init$S(((long)(min$124321)), ((long)(max$124322)));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.regionarray.Region rFirst = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                              alloc$124323)));
            
            //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long min$124324 = lowSecond;
            
            //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long max$124325 = hiSecond;
            
            //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final x10.regionarray.RectRegion1D alloc$124326 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
            
            //#line 279 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            alloc$124326.x10$regionarray$RectRegion1D$$init$S(((long)(min$124324)), ((long)(max$124325)));
            
            //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.regionarray.Region rSecond = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                               alloc$124326)));
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.regionarray.Region t$124668 = ((x10.regionarray.Region)(beforeAxes.product(((x10.regionarray.Region)(rFirst)))));
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.regionarray.Region t$124669 = ((x10.regionarray.Region)(t$124668.product(((x10.regionarray.Region)(betweenAxes)))));
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.regionarray.Region t$124670 = ((x10.regionarray.Region)(t$124669.product(((x10.regionarray.Region)(rSecond)))));
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.regionarray.Region t$124671 = ((x10.regionarray.Region)(t$124670.product(((x10.regionarray.Region)(afterAxes)))));
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.regionarray.Region t$124672 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                t$124671)));
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.regionarray.Region t$124673 = ((x10.regionarray.Region)(region));
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.regionarray.Region t$124674 = ((x10.regionarray.Region)(t$124672.intersection(((x10.regionarray.Region)(t$124673)))));
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            return t$124674;
        }
    }
    
    public static x10.regionarray.Region blockBlockRegionForPlace$P(final x10.lang.Place place, final x10.regionarray.BlockBlockDist BlockBlockDist) {
        return BlockBlockDist.blockBlockRegionForPlace(((x10.lang.Place)(place)));
    }
    
    
    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    private x10.lang.Place mapIndexToPlace(final long index0, final long index1) {
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final x10.regionarray.Region t$124676 = ((x10.regionarray.Region)(region));
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final x10.regionarray.Region b = ((x10.regionarray.Region)(t$124676.boundingBox()));
        
        //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124677 = axis0;
        
        //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long min0 = b.min$O((long)(t$124677));
        
        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124678 = axis0;
        
        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long max0 = b.max$O((long)(t$124678));
        
        //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124679 = axis1;
        
        //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long min1 = b.min$O((long)(t$124679));
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124680 = axis1;
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long max1 = b.max$O((long)(t$124680));
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124681 = ((max0) - (((long)(min0))));
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long size0 = ((t$124681) + (((long)(1L))));
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124682 = ((max1) - (((long)(min1))));
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long size1 = ((t$124682) + (((long)(1L))));
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long divisions0;
        
        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long P;
        
        //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final boolean t$124703 = ((size0) > (((long)(1L))));
        
        //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        if (t$124703) {
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124683 = ((size0) % (((long)(2L))));
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final boolean t$124684 = ((long) t$124683) == ((long) 0L);
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            long t$124685 =  0;
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            if (t$124684) {
                
                //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                t$124685 = size0;
            } else {
                
                //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                t$124685 = ((size0) - (((long)(1L))));
            }
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long size0Even = t$124685;
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.lang.PlaceGroup t$124686 = ((x10.lang.PlaceGroup)(pg));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124687 = t$124686.numPlaces$O();
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124688 = t$124687;
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124689 = ((size0Even) * (((long)(size1))));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124690 = java.lang.Math.min(((long)(t$124688)),((long)(t$124689)));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            P = t$124690;
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final double t$124691 = ((double)(long)(((long)(P))));
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final double t$124692 = java.lang.Math.log(((double)(t$124691)));
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final double t$124693 = java.lang.Math.log(((double)(2.0)));
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final double t$124694 = ((t$124692) / (((double)(t$124693))));
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final double t$124695 = ((t$124694) / (((double)(2.0))));
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final double t$124696 = java.lang.Math.ceil(((double)(t$124695)));
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124697 = ((long)(double)(((double)(t$124696))));
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124698 = x10.lang.Math.pow2$O((long)(t$124697));
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124699 = java.lang.Math.min(((long)(size0Even)),((long)(t$124698)));
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            divisions0 = t$124699;
        } else {
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.lang.PlaceGroup t$124700 = ((x10.lang.PlaceGroup)(pg));
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124701 = t$124700.numPlaces$O();
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124702 = java.lang.Math.min(((long)(t$124701)),((long)(size1)));
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            P = t$124702;
            
            //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            divisions0 = 1L;
        }
        
        //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final double t$124704 = ((double)(long)(((long)(P))));
        
        //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final double t$124705 = ((double)(long)(((long)(divisions0))));
        
        //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final double t$124706 = ((t$124704) / (((double)(t$124705))));
        
        //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final double t$124707 = java.lang.Math.ceil(((double)(t$124706)));
        
        //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124708 = ((long)(double)(((double)(t$124707))));
        
        //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long divisions1 = java.lang.Math.min(((long)(size1)),((long)(t$124708)));
        
        //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long numBlocks = ((divisions0) * (((long)(divisions1))));
        
        //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long leftOver = ((numBlocks) - (((long)(P))));
        
        //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final boolean t$124711 = ((long) divisions0) == ((long) 1L);
        
        //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        long t$124712 =  0;
        
        //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        if (t$124711) {
            
            //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            t$124712 = 0L;
        } else {
            
            //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124709 = ((index0) - (((long)(min0))));
            
            //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124710 = ((t$124709) * (((long)(divisions0))));
            
            //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            t$124712 = ((t$124710) / (((long)(size0))));
        }
        
        //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long blockIndex0 = t$124712;
        
        //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final boolean t$124715 = ((long) divisions1) == ((long) 1L);
        
        //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        long t$124716 =  0;
        
        //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        if (t$124715) {
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            t$124716 = 0L;
        } else {
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124713 = ((index1) - (((long)(min1))));
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124714 = ((t$124713) * (((long)(divisions1))));
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            t$124716 = ((t$124714) / (((long)(size1))));
        }
        
        //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long blockIndex1 = t$124716;
        
        //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124717 = ((blockIndex1) * (((long)(divisions0))));
        
        //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long blockIndex = ((t$124717) + (((long)(blockIndex0))));
        
        //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124718 = ((leftOver) * (((long)(2L))));
        
        //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final boolean t$124729 = ((blockIndex) <= (((long)(t$124718))));
        
        //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        if (t$124729) {
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.lang.PlaceGroup t$124721 = ((x10.lang.PlaceGroup)(pg));
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124719 = ((blockIndex) / (((long)(2L))));
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final int t$124720 = ((int)(long)(((long)(t$124719))));
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124722 = ((long)(((int)(t$124720))));
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.lang.Place t$124723 = t$124721.$apply((long)(t$124722));
            
            //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            return t$124723;
        } else {
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.lang.PlaceGroup t$124726 = ((x10.lang.PlaceGroup)(pg));
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124724 = ((blockIndex) - (((long)(leftOver))));
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final int t$124725 = ((int)(long)(((long)(t$124724))));
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124727 = ((long)(((int)(t$124725))));
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.lang.Place t$124728 = t$124726.$apply((long)(t$124727));
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            return t$124728;
        }
    }
    
    public static x10.lang.Place mapIndexToPlace$P(final long index0, final long index1, final x10.regionarray.BlockBlockDist BlockBlockDist) {
        return BlockBlockDist.mapIndexToPlace((long)(index0), (long)(index1));
    }
    
    
    //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    public x10.lang.PlaceGroup places() {
        
        //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final x10.lang.PlaceGroup t$124730 = ((x10.lang.PlaceGroup)(pg));
        
        //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        return t$124730;
    }
    
    
    //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    public long numPlaces$O() {
        
        //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final x10.lang.PlaceGroup t$124731 = ((x10.lang.PlaceGroup)(pg));
        
        //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124732 = t$124731.numPlaces$O();
        
        //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        return t$124732;
    }
    
    
    //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    public x10.lang.Iterable regions() {
        
        //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final x10.lang.PlaceGroup t$124733 = ((x10.lang.PlaceGroup)(pg));
        
        //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124739 = t$124733.numPlaces$O();
        
        //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final x10.core.fun.Fun_0_1 t$124740 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.BlockBlockDist.$Closure$195(this, this.pg)));
        
        //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final x10.core.Rail t$124741 = ((x10.core.Rail)(new x10.core.Rail<x10.regionarray.Region>(x10.regionarray.Region.$RTT, t$124739, ((x10.core.fun.Fun_0_1)(t$124740)), (x10.core.Rail.__1$1x10$lang$Long$3x10$lang$Rail$$T$2) null)));
        
        //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        return t$124741;
    }
    
    
    //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    public x10.regionarray.Region get(final x10.lang.Place p) {
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final boolean t$124747 = x10.rtt.Equality.equalsequals((p),(x10.lang.Place.place(x10.x10rt.X10RT.here())));
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        if (t$124747) {
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.regionarray.Region t$124742 = ((x10.regionarray.Region)(regionForHere));
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final boolean t$124744 = ((t$124742) == (null));
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            if (t$124744) {
                
                //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                final x10.regionarray.Region t$124743 = ((x10.regionarray.Region)(this.blockBlockRegionForPlace(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
                
                //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                this.regionForHere = ((x10.regionarray.Region)(t$124743));
            }
            
            //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.regionarray.Region t$124745 = ((x10.regionarray.Region)(regionForHere));
            
            //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            return t$124745;
        } else {
            
            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.regionarray.Region t$124746 = ((x10.regionarray.Region)(this.blockBlockRegionForPlace(((x10.lang.Place)(p)))));
            
            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            return t$124746;
        }
    }
    
    
    //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    public boolean containsLocally$O(final x10.lang.Point p) {
        
        //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final x10.regionarray.Region t$124748 = ((x10.regionarray.Region)(this.get(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
        
        //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final boolean t$124749 = t$124748.contains$O(((x10.lang.Point)(p)));
        
        //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        return t$124749;
    }
    
    
    //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    public x10.regionarray.Region $apply(final x10.lang.Place p) {
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final x10.regionarray.Region t$124750 = ((x10.regionarray.Region)(this.get(((x10.lang.Place)(p)))));
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        return t$124750;
    }
    
    
    //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    public x10.lang.Place $apply(final x10.lang.Point pt) {
        
        //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124751 = axis0;
        
        //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124753 = pt.$apply$O((long)(t$124751));
        
        //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124752 = axis1;
        
        //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124754 = pt.$apply$O((long)(t$124752));
        
        //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final x10.lang.Place t$124755 = this.mapIndexToPlace((long)(t$124753), (long)(t$124754));
        
        //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        return t$124755;
    }
    
    
    //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    public x10.lang.Place $apply(final long i0) {
        
        //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final java.lang.UnsupportedOperationException t$124758 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException("operator(i0:Long)")));
        
        //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        throw t$124758;
    }
    
    
    //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    public x10.lang.Place $apply(final long i0, final long i1) {
        
        //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124761 = axis0;
        
        //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final boolean t$124762 = ((long) t$124761) == ((long) 0L);
        
        //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        x10.lang.Place t$124763 =  null;
        
        //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        if (t$124762) {
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            t$124763 = this.mapIndexToPlace((long)(i0), (long)(i1));
        } else {
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            t$124763 = this.mapIndexToPlace((long)(i1), (long)(i0));
        }
        
        //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final x10.lang.Place t$124764 = t$124763;
        
        //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        return t$124764;
    }
    
    
    //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    public x10.lang.Place $apply(final long i0, final long i1, final long i2) {
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124767 = axis0;
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final boolean t$124782 = ((long) t$124767) == ((long) 0L);
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        if (t$124782) {
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124768 = axis1;
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final boolean t$124769 = ((long) t$124768) == ((long) 1L);
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            x10.lang.Place t$124770 =  null;
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            if (t$124769) {
                
                //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                t$124770 = this.mapIndexToPlace((long)(i0), (long)(i1));
            } else {
                
                //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                t$124770 = this.mapIndexToPlace((long)(i0), (long)(i2));
            }
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.lang.Place t$124771 = t$124770;
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            return t$124771;
        } else {
            
            //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124772 = axis0;
            
            //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final boolean t$124781 = ((long) t$124772) == ((long) 1L);
            
            //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            if (t$124781) {
                
                //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                final long t$124773 = axis1;
                
                //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                final boolean t$124774 = ((long) t$124773) == ((long) 0L);
                
                //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                x10.lang.Place t$124775 =  null;
                
                //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                if (t$124774) {
                    
                    //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                    t$124775 = this.mapIndexToPlace((long)(i1), (long)(i0));
                } else {
                    
                    //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                    t$124775 = this.mapIndexToPlace((long)(i1), (long)(i2));
                }
                
                //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                final x10.lang.Place t$124776 = t$124775;
                
                //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                return t$124776;
            } else {
                
                //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                final long t$124777 = axis1;
                
                //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                final boolean t$124778 = ((long) t$124777) == ((long) 0L);
                
                //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                x10.lang.Place t$124779 =  null;
                
                //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                if (t$124778) {
                    
                    //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                    t$124779 = this.mapIndexToPlace((long)(i2), (long)(i0));
                } else {
                    
                    //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                    t$124779 = this.mapIndexToPlace((long)(i2), (long)(i1));
                }
                
                //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                final x10.lang.Place t$124780 = t$124779;
                
                //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
                return t$124780;
            }
        }
    }
    
    
    //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    public x10.lang.Place $apply(final long i0, final long i1, final long i2, final long i3) {
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$124331 = i0;
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$124332 = i1;
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$124333 = i2;
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final long i$124334 = i3;
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        final x10.lang.Point alloc$124335 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
        
        //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        alloc$124335.x10$lang$Point$$init$S(((long)(i$124331)), ((long)(i$124332)), ((long)(i$124333)), ((long)(i$124334)));
        
        //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final x10.lang.Point pt = ((x10.lang.Point)(alloc$124335));
        
        //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124785 = axis0;
        
        //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124787 = pt.$apply$O((long)(t$124785));
        
        //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124786 = axis1;
        
        //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124788 = pt.$apply$O((long)(t$124786));
        
        //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final x10.lang.Place t$124789 = this.mapIndexToPlace((long)(t$124787), (long)(t$124788));
        
        //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        return t$124789;
    }
    
    
    //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    public long offset$O(final x10.lang.Point pt) {
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final x10.regionarray.Region r = ((x10.regionarray.Region)(this.get(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
        
        //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long offset = r.indexOf$O(((x10.lang.Point)(pt)));
        
        //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final boolean t$124790 = ((long) offset) == ((long) -1L);
        
        //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        if (t$124790) {
            
        }
        
        //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        return offset;
    }
    
    
    //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    public long offset$O(final long i0) {
        
        //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final x10.regionarray.Region r = ((x10.regionarray.Region)(this.get(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
        
        //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long offset = r.indexOf$O((long)(i0));
        
        //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final boolean t$124793 = ((long) offset) == ((long) -1L);
        
        //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        if (t$124793) {
            
        }
        
        //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        return offset;
    }
    
    
    //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    public long offset$O(final long i0, final long i1) {
        
        //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final x10.regionarray.Region r = ((x10.regionarray.Region)(this.get(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
        
        //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long offset = r.indexOf$O((long)(i0), (long)(i1));
        
        //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final boolean t$124796 = ((long) offset) == ((long) -1L);
        
        //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        if (t$124796) {
            
        }
        
        //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        return offset;
    }
    
    
    //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    public long offset$O(final long i0, final long i1, final long i2) {
        
        //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final x10.regionarray.Region r = ((x10.regionarray.Region)(this.get(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
        
        //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long offset = r.indexOf$O((long)(i0), (long)(i1), (long)(i2));
        
        //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final boolean t$124799 = ((long) offset) == ((long) -1L);
        
        //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        if (t$124799) {
            
        }
        
        //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        return offset;
    }
    
    
    //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    public long offset$O(final long i0, final long i1, final long i2, final long i3) {
        
        //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final x10.regionarray.Region r = ((x10.regionarray.Region)(this.get(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
        
        //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long offset = r.indexOf$O((long)(i0), (long)(i1), (long)(i2), (long)(i3));
        
        //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final boolean t$124802 = ((long) offset) == ((long) -1L);
        
        //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        if (t$124802) {
            
        }
        
        //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        return offset;
    }
    
    
    //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    public long maxOffset$O() {
        
        //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final x10.regionarray.Region r = ((x10.regionarray.Region)(this.get(((x10.lang.Place)(x10.lang.Place.place(x10.x10rt.X10RT.here()))))));
        
        //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124803 = r.size$O();
        
        //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124804 = ((t$124803) - (((long)(1L))));
        
        //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        return t$124804;
    }
    
    
    //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    public x10.regionarray.Dist restriction(final x10.regionarray.Region r) {
        
        //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final x10.regionarray.WrappedDistRegionRestricted alloc$121016 = ((x10.regionarray.WrappedDistRegionRestricted)(new x10.regionarray.WrappedDistRegionRestricted((java.lang.System[]) null)));
        
        //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        alloc$121016.x10$regionarray$WrappedDistRegionRestricted$$init$S(((x10.regionarray.Dist)(this)), ((x10.regionarray.Region)(r)));
        
        //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        return alloc$121016;
    }
    
    
    //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    public x10.regionarray.Dist restriction(final x10.lang.Place p) {
        
        //#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final x10.regionarray.WrappedDistPlaceRestricted alloc$121017 = ((x10.regionarray.WrappedDistPlaceRestricted)(new x10.regionarray.WrappedDistPlaceRestricted((java.lang.System[]) null)));
        
        //#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        alloc$121017.x10$regionarray$WrappedDistPlaceRestricted$$init$S(((x10.regionarray.Dist)(this)), ((x10.lang.Place)(p)));
        
        //#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        return alloc$121017;
    }
    
    
    //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    public boolean equals(final java.lang.Object thatObj) {
        
        //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final boolean t$124805 = x10.regionarray.BlockBlockDist.$RTT.isInstance(thatObj);
        
        //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final boolean t$124806 = !(t$124805);
        
        //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        if (t$124806) {
            
            //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            return false;
        }
        
        //#line 298 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final x10.regionarray.BlockBlockDist that = ((x10.regionarray.BlockBlockDist)(x10.rtt.Types.<x10.regionarray.BlockBlockDist> cast(thatObj,x10.regionarray.BlockBlockDist.$RTT)));
        
        //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124807 = this.axis0;
        
        //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final long t$124808 = that.axis0;
        
        //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        boolean t$124811 = x10.rtt.Equality.equalsequals(t$124807, ((long)(t$124808)));
        
        //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        if (t$124811) {
            
            //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124809 = this.axis1;
            
            //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124810 = that.axis1;
            
            //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            t$124811 = x10.rtt.Equality.equalsequals(t$124809, ((long)(t$124810)));
        }
        
        //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        boolean t$124814 = t$124811;
        
        //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        if (t$124814) {
            
            //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.regionarray.Region t$124812 = ((x10.regionarray.Region)(this.region));
            
            //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.regionarray.Region t$124813 = ((x10.regionarray.Region)(that.region));
            
            //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            t$124814 = t$124812.equals(((java.lang.Object)(t$124813)));
        }
        
        //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        final boolean t$124815 = t$124814;
        
        //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        return t$124815;
    }
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    final public x10.regionarray.BlockBlockDist x10$regionarray$BlockBlockDist$$this$x10$regionarray$BlockBlockDist() {
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        return x10.regionarray.BlockBlockDist.this;
    }
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    final public void __fieldInitializers_x10_regionarray_BlockBlockDist() {
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        this.regionForHere = null;
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$193 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$193> $RTT = 
            x10.rtt.StaticFunType.<$Closure$193> make($Closure$193.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.BlockBlockDist.$Closure$193 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.region = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.BlockBlockDist.$Closure$193 $_obj = new x10.regionarray.BlockBlockDist.$Closure$193((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.region);
            
        }
        
        // constructor just for allocation
        public $Closure$193(final java.lang.System[] $dummy) {
            
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
            
            //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.regionarray.Region t$124618 = ((x10.regionarray.Region)(this.region));
            
            //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final int t$124617 = ((int)(long)(((long)(i))));
            
            //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124619 = ((long)(((int)(t$124617))));
            
            //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124620 = t$124618.min$O((long)(t$124619));
            
            //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            return t$124620;
        }
        
        public x10.regionarray.BlockBlockDist out$$;
        public x10.regionarray.Region region;
        
        public $Closure$193(final x10.regionarray.BlockBlockDist out$$, final x10.regionarray.Region region) {
             {
                this.out$$ = out$$;
                this.region = ((x10.regionarray.Region)(region));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$194 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$194> $RTT = 
            x10.rtt.StaticFunType.<$Closure$194> make($Closure$194.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.BlockBlockDist.$Closure$194 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.region = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.BlockBlockDist.$Closure$194 $_obj = new x10.regionarray.BlockBlockDist.$Closure$194((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.region);
            
        }
        
        // constructor just for allocation
        public $Closure$194(final java.lang.System[] $dummy) {
            
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
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.regionarray.Region t$124625 = ((x10.regionarray.Region)(this.region));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final int t$124624 = ((int)(long)(((long)(i))));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124626 = ((long)(((int)(t$124624))));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124627 = t$124625.max$O((long)(t$124626));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            return t$124627;
        }
        
        public x10.regionarray.BlockBlockDist out$$;
        public x10.regionarray.Region region;
        
        public $Closure$194(final x10.regionarray.BlockBlockDist out$$, final x10.regionarray.Region region) {
             {
                this.out$$ = out$$;
                this.region = ((x10.regionarray.Region)(region));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$195 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$195> $RTT = 
            x10.rtt.StaticFunType.<$Closure$195> make($Closure$195.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.regionarray.Region.$RTT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.BlockBlockDist.$Closure$195 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            $_obj.pg = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.BlockBlockDist.$Closure$195 $_obj = new x10.regionarray.BlockBlockDist.$Closure$195((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            $serializer.write(this.pg);
            
        }
        
        // constructor just for allocation
        public $Closure$195(final java.lang.System[] $dummy) {
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply(x10.core.Long.$unbox(a1));
            
        }
        
        
    
        
        public x10.regionarray.Region $apply(final long i) {
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.lang.PlaceGroup t$124735 = ((x10.lang.PlaceGroup)(this.pg));
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final int t$124734 = ((int)(long)(((long)(i))));
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final long t$124736 = ((long)(((int)(t$124734))));
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.lang.Place t$124737 = t$124735.$apply((long)(t$124736));
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            final x10.regionarray.Region t$124738 = ((x10.regionarray.Region)(this.out$$.blockBlockRegionForPlace(((x10.lang.Place)(t$124737)))));
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            return t$124738;
        }
        
        public x10.regionarray.BlockBlockDist out$$;
        public x10.lang.PlaceGroup pg;
        
        public $Closure$195(final x10.regionarray.BlockBlockDist out$$, final x10.lang.PlaceGroup pg) {
             {
                this.out$$ = out$$;
                this.pg = ((x10.lang.PlaceGroup)(pg));
            }
        }
        
    }
    
}

