package x10.regionarray;


@x10.runtime.impl.java.X10Generated
public class PolyRegion extends x10.regionarray.Region implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<PolyRegion> $RTT = 
        x10.rtt.NamedType.<PolyRegion> make("x10.regionarray.PolyRegion",
                                            PolyRegion.class,
                                            new x10.rtt.Type[] {
                                                x10.regionarray.Region.$RTT
                                            });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.PolyRegion $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.Region.$_deserialize_body($_obj, $deserializer);
        $_obj.mat = $deserializer.readObject();
        $_obj.size = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.PolyRegion $_obj = new x10.regionarray.PolyRegion((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.mat);
        $serializer.write(this.size);
        
    }
    
    // constructor just for allocation
    public PolyRegion(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    public x10.regionarray.PolyMat mat;
    
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    public boolean isConvex$O() {
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        return true;
    }
    
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    public long size;
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    public long size$O() {
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final long t$131300 = size;
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final boolean t$131307 = ((t$131300) < (((long)(0L))));
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        if (t$131307) {
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            long s = 0L;
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final x10.lang.Iterator it = this.iterator();
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final x10.lang.Iterator p$131551 = this.iterator();
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            for (;
                 true;
                 ) {
                
                //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final boolean t$131552 = ((x10.lang.Iterator<x10.lang.Point>)p$131551).hasNext$O();
                
                //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                if (!(t$131552)) {
                    
                    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    break;
                }
                
                //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final x10.lang.Point t$131547 = ((x10.lang.Point)(((x10.lang.Iterator<x10.lang.Point>)p$131551).next$G()));
                
                //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final x10.lang.Point p$131548 = ((x10.lang.Point)
                                                  t$131547);
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final long t$131549 = s;
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final long t$131550 = ((t$131549) + (((long)(1L))));
                
                //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                s = t$131550;
            }
            
            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final long t$131306 = s;
            
            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            this.size = t$131306;
        }
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final long t$131308 = size;
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        return t$131308;
    }
    
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    public long indexOf$O(final x10.lang.Point id$143) {
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final java.lang.UnsupportedOperationException t$131309 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException()));
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        throw t$131309;
    }
    
    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    public x10.lang.Iterator iterator() {
        
        //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.PolyMat t$131310 = ((x10.regionarray.PolyMat)(mat));
        
        //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.PolyScanner this$131281 = ((x10.regionarray.PolyScanner)(x10.regionarray.PolyScanner.make(((x10.regionarray.PolyMat)(t$131310)))));
        
        //#line 289 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final x10.regionarray.PolyScanner.Anonymous$10018 alloc$131280 = ((x10.regionarray.PolyScanner.Anonymous$10018)(new x10.regionarray.PolyScanner.Anonymous$10018((java.lang.System[]) null)));
        
        //#line 289 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        alloc$131280.x10$regionarray$PolyScanner$Anonymous$10018$$init$S(((x10.regionarray.PolyScanner)(this$131281)));
        
        //#line 289 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyScanner.x10"
        final x10.lang.Iterator t$131311 = ((x10.lang.Iterator<x10.lang.Point>)
                                             alloc$131280);
        
        //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        return t$131311;
    }
    
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    public x10.regionarray.Region intersection(final x10.regionarray.Region t) {
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final boolean t$131333 = x10.regionarray.PolyRegion.$RTT.isInstance(t);
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        if (t$131333) {
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final x10.regionarray.PolyRegion that = ((x10.regionarray.PolyRegion)(x10.rtt.Types.<x10.regionarray.PolyRegion> cast(t,x10.regionarray.PolyRegion.$RTT)));
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final x10.regionarray.PolyMatBuilder pmb = ((x10.regionarray.PolyMatBuilder)(new x10.regionarray.PolyMatBuilder((java.lang.System[]) null)));
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final long t$131555 = rank;
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            pmb.x10$regionarray$PolyMatBuilder$$init$S(((long)(t$131555)));
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final x10.regionarray.PolyMat t$131556 = ((x10.regionarray.PolyMat)(this.mat));
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final x10.lang.Iterator r$131557 = ((x10.regionarray.Mat<x10.regionarray.PolyRow>)t$131556).iterator();
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            for (;
                 true;
                 ) {
                
                //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final boolean t$131558 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)r$131557).hasNext$O();
                
                //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                if (!(t$131558)) {
                    
                    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    break;
                }
                
                //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final x10.regionarray.PolyRow r$131553 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)r$131557).next$G();
                
                //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                pmb.add(((x10.regionarray.Row)(r$131553)));
            }
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final x10.regionarray.PolyMat t$131559 = ((x10.regionarray.PolyMat)(that.mat));
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final x10.lang.Iterator r$131560 = ((x10.regionarray.Mat<x10.regionarray.PolyRow>)t$131559).iterator();
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            for (;
                 true;
                 ) {
                
                //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final boolean t$131561 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)r$131560).hasNext$O();
                
                //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                if (!(t$131561)) {
                    
                    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    break;
                }
                
                //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final x10.regionarray.PolyRow r$131554 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)r$131560).next$G();
                
                //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                pmb.add(((x10.regionarray.Row)(r$131554)));
            }
            
            //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final x10.regionarray.PolyMat pm = ((x10.regionarray.PolyMat)(pmb.toSortedPolyMat((boolean)(false))));
            
            //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final x10.regionarray.Region t$131319 = ((x10.regionarray.Region)(x10.regionarray.PolyRegion.make(((x10.regionarray.PolyMat)(pm)))));
            
            //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            return t$131319;
        } else {
            
            //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final boolean t$131332 = x10.regionarray.RectRegion.$RTT.isInstance(t);
            
            //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            if (t$131332) {
                
                //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final x10.regionarray.RectRegion t$131320 = ((x10.regionarray.RectRegion)(x10.rtt.Types.<x10.regionarray.RectRegion> cast(t,x10.regionarray.RectRegion.$RTT)));
                
                //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final x10.regionarray.Region t$131321 = ((x10.regionarray.Region)(t$131320.toPolyRegion()));
                
                //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final x10.regionarray.Region t$131322 = ((x10.regionarray.Region)(this.intersection(((x10.regionarray.Region)(t$131321)))));
                
                //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                return t$131322;
            } else {
                
                //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final boolean t$131331 = x10.regionarray.RectRegion1D.$RTT.isInstance(t);
                
                //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                if (t$131331) {
                    
                    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final x10.regionarray.RectRegion1D t$131323 = ((x10.regionarray.RectRegion1D)(x10.rtt.Types.<x10.regionarray.RectRegion1D> cast(t,x10.regionarray.RectRegion1D.$RTT)));
                    
                    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final x10.regionarray.RectRegion t$131324 = ((x10.regionarray.RectRegion)(t$131323.toRectRegion()));
                    
                    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final x10.regionarray.Region t$131325 = ((x10.regionarray.Region)(t$131324.toPolyRegion()));
                    
                    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final x10.regionarray.Region t$131326 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                                        t$131325)));
                    
                    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final x10.regionarray.Region t$131327 = ((x10.regionarray.Region)(this.intersection(((x10.regionarray.Region)(t$131326)))));
                    
                    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    return t$131327;
                } else {
                    
                    //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final java.lang.String t$131328 = (("intersection(") + (t));
                    
                    //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final java.lang.String t$131329 = ((t$131328) + (")"));
                    
                    //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final java.lang.UnsupportedOperationException t$131330 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException(t$131329)));
                    
                    //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    throw t$131330;
                }
            }
        }
    }
    
    
    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    public boolean contains$O(final x10.regionarray.Region that) {
        
        //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.Region t$131334 = ((x10.regionarray.Region)(this.computeBoundingBox()));
        
        //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.Region t$131335 = ((x10.regionarray.Region)(that.computeBoundingBox()));
        
        //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final boolean t$131336 = t$131334.contains$O(((x10.regionarray.Region)(t$131335)));
        
        //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        return t$131336;
    }
    
    
    //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    public x10.regionarray.Region projection(final long axis) {
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        x10.regionarray.PolyMat pm = ((x10.regionarray.PolyMat)(mat));
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        int k$131570 = 0;
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        for (;
             true;
             ) {
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final int t$131571 = k$131570;
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final long t$131572 = ((long)(((int)(t$131571))));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final long t$131573 = rank;
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final boolean t$131574 = ((t$131572) < (((long)(t$131573))));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            if (!(t$131574)) {
                
                //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                break;
            }
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final int t$131562 = k$131570;
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final int t$131563 = ((int)(long)(((long)(axis))));
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final boolean t$131564 = ((int) t$131562) != ((int) t$131563);
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            if (t$131564) {
                
                //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final x10.regionarray.PolyMat t$131565 = ((x10.regionarray.PolyMat)(pm));
                
                //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final int t$131566 = k$131570;
                
                //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final x10.regionarray.PolyMat t$131567 = ((x10.regionarray.PolyMat)(t$131565.eliminate((int)(t$131566), (boolean)(true))));
                
                //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                pm = ((x10.regionarray.PolyMat)(t$131567));
            }
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final int t$131568 = k$131570;
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final int t$131569 = ((t$131568) + (((int)(1))));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            k$131570 = t$131569;
        }
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.PolyMat t$131350 = ((x10.regionarray.PolyMat)(pm));
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131351 = ((int)(long)(((long)(axis))));
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131352 = t$131350.rectMin$O((int)(t$131351));
        
        //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long min$131282 = ((long)(((int)(t$131352))));
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.PolyMat t$131353 = ((x10.regionarray.PolyMat)(pm));
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131354 = ((int)(long)(((long)(axis))));
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131355 = t$131353.rectMax$O((int)(t$131354));
        
        //#line 273 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final long max$131283 = ((long)(((int)(t$131355))));
        
        //#line 274 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.RectRegion1D alloc$131284 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
        
        //#line 274 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        alloc$131284.x10$regionarray$RectRegion1D$$init$S(((long)(min$131282)), ((long)(max$131283)));
        
        //#line 274 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final x10.regionarray.Region t$131356 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                            alloc$131284)));
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        return t$131356;
    }
    
    
    //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    public x10.regionarray.Region eliminate(final long axis) {
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.PolyMat t$131357 = ((x10.regionarray.PolyMat)(mat));
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131358 = ((int)(long)(((long)(axis))));
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.PolyMat pm = ((x10.regionarray.PolyMat)(t$131357.eliminate((int)(t$131358), (boolean)(true))));
        
        //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.Region result = ((x10.regionarray.Region)(x10.regionarray.PolyRegion.make(((x10.regionarray.PolyMat)(pm)))));
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        return result;
    }
    
    
    //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    public x10.regionarray.Region product(final x10.regionarray.Region r) {
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final boolean t$131359 = x10.regionarray.PolyRegion.$RTT.isInstance(r);
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final boolean t$131363 = !(t$131359);
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        if (t$131363) {
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final java.lang.String t$131360 = (("product(") + (r));
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final java.lang.String t$131361 = ((t$131360) + (")"));
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final java.lang.UnsupportedOperationException t$131362 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException(t$131361)));
            
            //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            throw t$131362;
        }
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.PolyRegion that = ((x10.regionarray.PolyRegion)(x10.rtt.Types.<x10.regionarray.PolyRegion> cast(r,x10.regionarray.PolyRegion.$RTT)));
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.PolyMatBuilder pmb = ((x10.regionarray.PolyMatBuilder)(new x10.regionarray.PolyMatBuilder((java.lang.System[]) null)));
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final long t$131575 = this.rank;
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final long t$131576 = that.rank;
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final long t$131577 = ((t$131575) + (((long)(t$131576))));
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        pmb.x10$regionarray$PolyMatBuilder$$init$S(t$131577);
        
        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.PolyMat t$131367 = ((x10.regionarray.PolyMat)(this.mat));
        
        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        x10.regionarray.PolyRegion.copy(((x10.regionarray.PolyMatBuilder)(pmb)), ((x10.regionarray.PolyMat)(t$131367)), (int)(0));
        
        //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.PolyMat t$131369 = ((x10.regionarray.PolyMat)(that.mat));
        
        //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final long t$131368 = this.rank;
        
        //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131370 = ((int)(long)(((long)(t$131368))));
        
        //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        x10.regionarray.PolyRegion.copy(((x10.regionarray.PolyMatBuilder)(pmb)), ((x10.regionarray.PolyMat)(t$131369)), (int)(t$131370));
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.PolyMat pm = ((x10.regionarray.PolyMat)(pmb.toSortedPolyMat((boolean)(false))));
        
        //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.Region t$131371 = ((x10.regionarray.Region)(x10.regionarray.PolyRegion.make(((x10.regionarray.PolyMat)(pm)))));
        
        //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        return t$131371;
    }
    
    
    //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    private static void copy(final x10.regionarray.PolyMatBuilder tt, final x10.regionarray.PolyMat ff, final int offset) {
        
        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.lang.Iterator r$130529 = ((x10.regionarray.Mat<x10.regionarray.PolyRow>)ff).iterator();
        
        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        for (;
             true;
             ) {
            
            //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final boolean t$131393 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)r$130529).hasNext$O();
            
            //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            if (!(t$131393)) {
                
                //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                break;
            }
            
            //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final x10.regionarray.PolyRow r$131592 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)r$130529).next$G();
            
            //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final x10.regionarray.PolyRow f$131593 = ((x10.regionarray.PolyRow)(r$131592));
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final long t$131594 = tt.rank;
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final long t$131595 = ((t$131594) + (((long)(1L))));
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final x10.core.Rail t$131596 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Int>(x10.rtt.Types.INT, t$131595)));
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            int i$131585 = 0;
            {
                
                //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final int[] t$131596$value$131690 = ((int[])t$131596.value);
                
                //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final int t$131586 = i$131585;
                    
                    //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final long t$131587 = ((long)(((int)(t$131586))));
                    
                    //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final long t$131588 = ff.rank;
                    
                    //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final boolean t$131589 = ((t$131587) < (((long)(t$131588))));
                    
                    //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    if (!(t$131589)) {
                        
                        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                        break;
                    }
                    
                    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final int t$131578 = i$131585;
                    
                    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final int t$131579 = ((offset) + (((int)(t$131578))));
                    
                    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final long t$131580 = ((long)(((int)(t$131579))));
                    
                    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final int t$131581 = i$131585;
                    
                    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final int t$131582 = f$131593.$apply$O((int)(t$131581));
                    
                    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    t$131596$value$131690[(int)t$131580]=t$131582;
                    
                    //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final int t$131583 = i$131585;
                    
                    //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final int t$131584 = ((t$131583) + (((int)(1))));
                    
                    //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    i$131585 = t$131584;
                }
            }
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final long t$131597 = tt.rank;
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final long t$131598 = ff.rank;
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final int t$131599 = ((int)(long)(((long)(t$131598))));
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final int t$131600 = f$131593.$apply$O((int)(t$131599));
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            ((int[])t$131596.value)[(int)t$131597] = t$131600;
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final x10.regionarray.PolyRow alloc$131601 = ((x10.regionarray.PolyRow)(new x10.regionarray.PolyRow((java.lang.System[]) null)));
            
            //#line 29 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final x10.core.Rail as_$131602 = ((x10.core.Rail)(t$131596));
            
            //#line 29 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final long t$131590 = ((x10.core.Rail<x10.core.Int>)as_$131602).size;
            
            //#line 29 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final long t$131591 = ((t$131590) - (((long)(1L))));
            
            //#line 29 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            alloc$131601.x10$regionarray$PolyRow$$init$S(((x10.core.Rail)(as_$131602)), t$131591, (x10.regionarray.PolyRow.__0$1x10$lang$Int$2) null);
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            tt.add(((x10.regionarray.Row)(alloc$131601)));
        }
    }
    
    public static void copy$P(final x10.regionarray.PolyMatBuilder tt, final x10.regionarray.PolyMat ff, final int offset) {
        x10.regionarray.PolyRegion.copy(((x10.regionarray.PolyMatBuilder)(tt)), ((x10.regionarray.PolyMat)(ff)), (int)(offset));
    }
    
    
    //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    public x10.regionarray.Region translate(final x10.lang.Point v) {
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.PolyMatBuilder pmb = ((x10.regionarray.PolyMatBuilder)(new x10.regionarray.PolyMatBuilder((java.lang.System[]) null)));
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final long t$131603 = this.rank;
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        pmb.x10$regionarray$PolyMatBuilder$$init$S(((long)(t$131603)));
        
        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.PolyMat t$131395 = ((x10.regionarray.PolyMat)(this.mat));
        
        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        x10.regionarray.PolyRegion.translate(((x10.regionarray.PolyMatBuilder)(pmb)), ((x10.regionarray.PolyMat)(t$131395)), ((x10.lang.Point)(v)));
        
        //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.PolyMat pm = ((x10.regionarray.PolyMat)(pmb.toSortedPolyMat((boolean)(false))));
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.Region t$131396 = ((x10.regionarray.Region)(x10.regionarray.PolyRegion.make(((x10.regionarray.PolyMat)(pm)))));
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        return t$131396;
    }
    
    
    //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    private static void translate(final x10.regionarray.PolyMatBuilder tt, final x10.regionarray.PolyMat ff, final x10.lang.Point v) {
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.lang.Iterator r$130531 = ((x10.regionarray.Mat<x10.regionarray.PolyRow>)ff).iterator();
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        for (;
             true;
             ) {
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final boolean t$131429 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)r$130531).hasNext$O();
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            if (!(t$131429)) {
                
                //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                break;
            }
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final x10.regionarray.PolyRow r$131627 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)r$130531).next$G();
            
            //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final x10.regionarray.PolyRow f$131628 = ((x10.regionarray.PolyRow)(r$131627));
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final long t$131629 = ff.rank;
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final long t$131630 = ((t$131629) + (((long)(1L))));
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final x10.core.Rail t$131631 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Int>(x10.rtt.Types.INT, t$131630)));
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            int s$131632 = 0;
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            int i$131620 = 0;
            {
                
                //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final int[] t$131631$value$131691 = ((int[])t$131631.value);
                
                //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final int t$131621 = i$131620;
                    
                    //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final long t$131622 = ((long)(((int)(t$131621))));
                    
                    //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final long t$131623 = ff.rank;
                    
                    //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final boolean t$131624 = ((t$131622) < (((long)(t$131623))));
                    
                    //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    if (!(t$131624)) {
                        
                        //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                        break;
                    }
                    
                    //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final int t$131604 = i$131620;
                    
                    //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final long t$131605 = ((long)(((int)(t$131604))));
                    
                    //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final int t$131606 = i$131620;
                    
                    //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final int t$131607 = f$131628.$apply$O((int)(t$131606));
                    
                    //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    t$131631$value$131691[(int)t$131605]=t$131607;
                    
                    //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final int t$131608 = s$131632;
                    
                    //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final long t$131609 = ((long)(((int)(t$131608))));
                    
                    //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final int t$131610 = i$131620;
                    
                    //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final int t$131611 = f$131628.$apply$O((int)(t$131610));
                    
                    //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final long t$131612 = ((long)(((int)(t$131611))));
                    
                    //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final int t$131613 = i$131620;
                    
                    //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final long t$131614 = ((long)(((int)(t$131613))));
                    
                    //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final long t$131615 = v.$apply$O((long)(t$131614));
                    
                    //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final long t$131616 = ((t$131612) * (((long)(t$131615))));
                    
                    //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final long t$131617 = ((t$131609) + (((long)(t$131616))));
                    
                    //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    s$131632 = ((int)(((long)(t$131617))));
                    
                    //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final int t$131618 = i$131620;
                    
                    //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final int t$131619 = ((t$131618) + (((int)(1))));
                    
                    //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    i$131620 = t$131619;
                }
            }
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final long t$131633 = ff.rank;
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final long t$131634 = ff.rank;
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final int t$131635 = ((int)(long)(((long)(t$131634))));
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final int t$131636 = f$131628.$apply$O((int)(t$131635));
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final int t$131637 = s$131632;
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final int t$131638 = ((t$131636) - (((int)(t$131637))));
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            ((int[])t$131631.value)[(int)t$131633] = t$131638;
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final x10.regionarray.PolyRow alloc$131639 = ((x10.regionarray.PolyRow)(new x10.regionarray.PolyRow((java.lang.System[]) null)));
            
            //#line 29 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final x10.core.Rail as_$131640 = ((x10.core.Rail)(t$131631));
            
            //#line 29 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final long t$131625 = ((x10.core.Rail<x10.core.Int>)as_$131640).size;
            
            //#line 29 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            final long t$131626 = ((t$131625) - (((long)(1L))));
            
            //#line 29 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRow.x10"
            alloc$131639.x10$regionarray$PolyRow$$init$S(((x10.core.Rail)(as_$131640)), t$131626, (x10.regionarray.PolyRow.__0$1x10$lang$Int$2) null);
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            tt.add(((x10.regionarray.Row)(alloc$131639)));
        }
    }
    
    public static void translate$P(final x10.regionarray.PolyMatBuilder tt, final x10.regionarray.PolyMat ff, final x10.lang.Point v) {
        x10.regionarray.PolyRegion.translate(((x10.regionarray.PolyMatBuilder)(tt)), ((x10.regionarray.PolyMat)(ff)), ((x10.lang.Point)(v)));
    }
    
    
    //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    public boolean isEmpty$O() {
        
        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.PolyMat t$131430 = ((x10.regionarray.PolyMat)(mat));
        
        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final boolean tmp = t$131430.isEmpty$O();
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        return tmp;
    }
    
    
    //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    public x10.regionarray.Region computeBoundingBox() {
        
        //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final long t$131431 = rank;
        
        //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.core.Rail min = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(t$131431)))));
        
        //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final long t$131432 = rank;
        
        //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.core.Rail max = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, ((long)(t$131432)))));
        
        //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        x10.regionarray.PolyMat pm = ((x10.regionarray.PolyMat)(mat));
        
        //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        int axis$131670 = 0;
        {
            
            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final long[] min$value$131692 = ((long[])min.value);
            
            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final long[] max$value$131693 = ((long[])max.value);
            
            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            for (;
                 true;
                 ) {
                
                //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final int t$131671 = axis$131670;
                
                //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final long t$131672 = ((long)(((int)(t$131671))));
                
                //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final long t$131673 = rank;
                
                //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final boolean t$131674 = ((t$131672) < (((long)(t$131673))));
                
                //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                if (!(t$131674)) {
                    
                    //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    break;
                }
                
                //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                x10.regionarray.PolyMat x$131652 = pm;
                
                //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final int t$131646 = axis$131670;
                
                //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                int k$131647 = ((t$131646) + (((int)(1))));
                
                //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final int t$131648 = k$131647;
                    
                    //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final long t$131649 = ((long)(((int)(t$131648))));
                    
                    //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final long t$131650 = rank;
                    
                    //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final boolean t$131651 = ((t$131649) < (((long)(t$131650))));
                    
                    //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    if (!(t$131651)) {
                        
                        //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                        break;
                    }
                    
                    //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final x10.regionarray.PolyMat t$131641 = ((x10.regionarray.PolyMat)(x$131652));
                    
                    //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final int t$131642 = k$131647;
                    
                    //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final x10.regionarray.PolyMat t$131643 = ((x10.regionarray.PolyMat)(t$131641.eliminate((int)(t$131642), (boolean)(true))));
                    
                    //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    x$131652 = ((x10.regionarray.PolyMat)(t$131643));
                    
                    //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final int t$131644 = k$131647;
                    
                    //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    final int t$131645 = ((t$131644) + (((int)(1))));
                    
                    //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                    k$131647 = t$131645;
                }
                
                //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final int t$131653 = axis$131670;
                
                //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final long t$131654 = ((long)(((int)(t$131653))));
                
                //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final x10.regionarray.PolyMat t$131655 = ((x10.regionarray.PolyMat)(x$131652));
                
                //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final int t$131656 = axis$131670;
                
                //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final int t$131657 = t$131655.rectMin$O((int)(t$131656));
                
                //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final long t$131658 = ((long)(((int)(t$131657))));
                
                //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                min$value$131692[(int)t$131654]=t$131658;
                
                //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final int t$131659 = axis$131670;
                
                //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final long t$131660 = ((long)(((int)(t$131659))));
                
                //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final x10.regionarray.PolyMat t$131661 = ((x10.regionarray.PolyMat)(x$131652));
                
                //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final int t$131662 = axis$131670;
                
                //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final int t$131663 = t$131661.rectMax$O((int)(t$131662));
                
                //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final long t$131664 = ((long)(((int)(t$131663))));
                
                //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                max$value$131693[(int)t$131660]=t$131664;
                
                //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final x10.regionarray.PolyMat t$131665 = ((x10.regionarray.PolyMat)(pm));
                
                //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final int t$131666 = axis$131670;
                
                //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final x10.regionarray.PolyMat t$131667 = ((x10.regionarray.PolyMat)(t$131665.eliminate((int)(t$131666), (boolean)(true))));
                
                //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                pm = ((x10.regionarray.PolyMat)(t$131667));
                
                //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final int t$131668 = axis$131670;
                
                //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                final int t$131669 = ((t$131668) + (((int)(1))));
                
                //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                axis$131670 = t$131669;
            }
        }
        
        //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.Region t$131466 = ((x10.regionarray.Region)(x10.regionarray.Region.makeRectangular__0$1x10$lang$Long$2__1$1x10$lang$Long$2(((x10.core.Rail)(min)), ((x10.core.Rail)(max)))));
        
        //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.Region t$131467 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                            t$131466)));
        
        //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        return t$131467;
    }
    
    
    //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    public boolean contains$O(final x10.lang.Point p) {
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.PolyMat t$131678 = ((x10.regionarray.PolyMat)(mat));
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.lang.Iterator r$131679 = ((x10.regionarray.Mat<x10.regionarray.PolyRow>)t$131678).iterator();
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        for (;
             true;
             ) {
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final boolean t$131680 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)r$131679).hasNext$O();
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            if (!(t$131680)) {
                
                //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                break;
            }
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final x10.regionarray.PolyRow r$131675 = ((x10.lang.Iterator<x10.regionarray.PolyRow>)r$131679).next$G();
            
            //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final boolean t$131676 = r$131675.contains$O(((x10.lang.Point)(p)));
            
            //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final boolean t$131677 = !(t$131676);
            
            //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            if (t$131677) {
                
                //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
                return false;
            }
        }
        
        //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        return true;
    }
    
    
    //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    private static int ROW = 0;
    
    //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    private static int COL = 0;
    
    
    //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    public static x10.regionarray.Region makeBanded(final int rowMin, final int colMin, final int rowMax, final int colMax, final int upper, final int lower) {
        
        //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.PolyMatBuilder pmb = ((x10.regionarray.PolyMatBuilder)(new x10.regionarray.PolyMatBuilder((java.lang.System[]) null)));
        
        //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        pmb.x10$regionarray$PolyMatBuilder$$init$S(((long)(2L)));
        
        //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131473 = x10.regionarray.PolyRegion.get$ROW();
        
        //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131474 = x10.regionarray.PolyMatBuilder.get$GE();
        
        //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        pmb.add((int)(t$131473), (int)(t$131474), (int)(rowMin));
        
        //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131475 = x10.regionarray.PolyRegion.get$ROW();
        
        //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131476 = x10.regionarray.PolyMatBuilder.get$LE();
        
        //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        pmb.add((int)(t$131475), (int)(t$131476), (int)(rowMax));
        
        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131477 = x10.regionarray.PolyRegion.get$COL();
        
        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131478 = x10.regionarray.PolyMatBuilder.get$GE();
        
        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        pmb.add((int)(t$131477), (int)(t$131478), (int)(colMin));
        
        //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131479 = x10.regionarray.PolyRegion.get$COL();
        
        //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131480 = x10.regionarray.PolyMatBuilder.get$LE();
        
        //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        pmb.add((int)(t$131479), (int)(t$131480), (int)(colMax));
        
        //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131481 = x10.regionarray.PolyRegion.get$COL();
        
        //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131482 = x10.regionarray.PolyRegion.get$ROW();
        
        //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131485 = ((t$131481) - (((int)(t$131482))));
        
        //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131486 = x10.regionarray.PolyMatBuilder.get$GE();
        
        //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131483 = ((colMin) - (((int)(rowMin))));
        
        //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131484 = ((lower) - (((int)(1))));
        
        //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131487 = ((t$131483) - (((int)(t$131484))));
        
        //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        pmb.add((int)(t$131485), (int)(t$131486), (int)(t$131487));
        
        //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131488 = x10.regionarray.PolyRegion.get$COL();
        
        //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131489 = x10.regionarray.PolyRegion.get$ROW();
        
        //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131492 = ((t$131488) - (((int)(t$131489))));
        
        //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131493 = x10.regionarray.PolyMatBuilder.get$LE();
        
        //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131490 = ((colMin) - (((int)(rowMin))));
        
        //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131491 = ((upper) - (((int)(1))));
        
        //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131494 = ((t$131490) + (((int)(t$131491))));
        
        //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        pmb.add((int)(t$131492), (int)(t$131493), (int)(t$131494));
        
        //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.PolyMat pm = ((x10.regionarray.PolyMat)(pmb.toSortedPolyMat((boolean)(false))));
        
        //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.Region t$131495 = ((x10.regionarray.Region)(x10.regionarray.PolyRegion.make(((x10.regionarray.PolyMat)(pm)))));
        
        //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        return t$131495;
    }
    
    
    //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    public static x10.regionarray.Region makeBanded(final int size, final int upper, final int lower) {
        
        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131496 = ((size) - (((int)(1))));
        
        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131497 = ((size) - (((int)(1))));
        
        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.Region t$131498 = ((x10.regionarray.Region)(x10.regionarray.PolyRegion.makeBanded((int)(0), (int)(0), (int)(t$131496), (int)(t$131497), (int)(upper), (int)(lower))));
        
        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        return t$131498;
    }
    
    
    //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    public static x10.regionarray.Region makeUpperTriangular2(final int rowMin, final int colMin, final int size) {
        
        //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.PolyMatBuilder pmb = ((x10.regionarray.PolyMatBuilder)(new x10.regionarray.PolyMatBuilder((java.lang.System[]) null)));
        
        //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final long t$131681 = ((long)(((int)(2))));
        
        //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        pmb.x10$regionarray$PolyMatBuilder$$init$S(t$131681);
        
        //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131500 = x10.regionarray.PolyRegion.get$ROW();
        
        //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131501 = x10.regionarray.PolyMatBuilder.get$GE();
        
        //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        pmb.add((int)(t$131500), (int)(t$131501), (int)(rowMin));
        
        //#line 266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131503 = x10.regionarray.PolyRegion.get$COL();
        
        //#line 266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131504 = x10.regionarray.PolyMatBuilder.get$LE();
        
        //#line 266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131502 = ((colMin) + (((int)(size))));
        
        //#line 266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131505 = ((t$131502) - (((int)(1))));
        
        //#line 266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        pmb.add((int)(t$131503), (int)(t$131504), (int)(t$131505));
        
        //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131506 = x10.regionarray.PolyRegion.get$COL();
        
        //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131507 = x10.regionarray.PolyRegion.get$ROW();
        
        //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131508 = ((t$131506) - (((int)(t$131507))));
        
        //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131509 = x10.regionarray.PolyMatBuilder.get$GE();
        
        //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131510 = ((colMin) - (((int)(rowMin))));
        
        //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        pmb.add((int)(t$131508), (int)(t$131509), (int)(t$131510));
        
        //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.PolyMat pm = ((x10.regionarray.PolyMat)(pmb.toSortedPolyMat((boolean)(true))));
        
        //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.Region t$131511 = ((x10.regionarray.Region)(x10.regionarray.PolyRegion.make(((x10.regionarray.PolyMat)(pm)))));
        
        //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.Region t$131512 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                            t$131511)));
        
        //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        return t$131512;
    }
    
    
    //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    public static x10.regionarray.Region makeLowerTriangular2(final int rowMin, final int colMin, final int size) {
        
        //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.PolyMatBuilder pmb = ((x10.regionarray.PolyMatBuilder)(new x10.regionarray.PolyMatBuilder((java.lang.System[]) null)));
        
        //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final long t$131682 = ((long)(((int)(2))));
        
        //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        pmb.x10$regionarray$PolyMatBuilder$$init$S(t$131682);
        
        //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131514 = x10.regionarray.PolyRegion.get$COL();
        
        //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131515 = x10.regionarray.PolyMatBuilder.get$GE();
        
        //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        pmb.add((int)(t$131514), (int)(t$131515), (int)(colMin));
        
        //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131517 = x10.regionarray.PolyRegion.get$ROW();
        
        //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131518 = x10.regionarray.PolyMatBuilder.get$LE();
        
        //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131516 = ((rowMin) + (((int)(size))));
        
        //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131519 = ((t$131516) - (((int)(1))));
        
        //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        pmb.add((int)(t$131517), (int)(t$131518), (int)(t$131519));
        
        //#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131520 = x10.regionarray.PolyRegion.get$ROW();
        
        //#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131521 = x10.regionarray.PolyRegion.get$COL();
        
        //#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131522 = ((t$131520) - (((int)(t$131521))));
        
        //#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131523 = x10.regionarray.PolyMatBuilder.get$GE();
        
        //#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final int t$131524 = ((rowMin) - (((int)(colMin))));
        
        //#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        pmb.add((int)(t$131522), (int)(t$131523), (int)(t$131524));
        
        //#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.PolyMat pm = ((x10.regionarray.PolyMat)(pmb.toSortedPolyMat((boolean)(true))));
        
        //#line 278 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.Region t$131525 = ((x10.regionarray.Region)(x10.regionarray.PolyRegion.make(((x10.regionarray.PolyMat)(pm)))));
        
        //#line 278 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.Region t$131526 = ((x10.regionarray.Region)(((x10.regionarray.Region)
                                                                            t$131525)));
        
        //#line 278 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        return t$131526;
    }
    
    
    //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    public static x10.regionarray.Region make(final x10.regionarray.PolyMat pm) {
        
        //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final boolean t$131528 = pm.isEmpty$O();
        
        //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        if (t$131528) {
            
            //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final x10.regionarray.EmptyRegion alloc$130520 = ((x10.regionarray.EmptyRegion)(new x10.regionarray.EmptyRegion((java.lang.System[]) null)));
            
            //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final long t$131683 = pm.rank;
            
            //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            alloc$130520.x10$regionarray$EmptyRegion$$init$S(((long)(t$131683)));
            
            //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            return alloc$130520;
        } else {
            
            //#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final x10.regionarray.PolyRegion alloc$130521 = ((x10.regionarray.PolyRegion)(new x10.regionarray.PolyRegion((java.lang.System[]) null)));
            
            //#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            alloc$130521.x10$regionarray$PolyRegion$$init$S(((x10.regionarray.PolyMat)(pm)), ((boolean)(false)));
            
            //#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            return alloc$130521;
        }
    }
    
    
    //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    // creation method for java code (1-phase java constructor)
    public PolyRegion(final x10.regionarray.PolyMat pm, final boolean hack198) {
        this((java.lang.System[]) null);
        x10$regionarray$PolyRegion$$init$S(pm, hack198);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.PolyRegion x10$regionarray$PolyRegion$$init$S(final x10.regionarray.PolyMat pm, final boolean hack198) {
         {
            
            //#line 298 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final x10.regionarray.Region this$131293 = ((x10.regionarray.Region)(this));
            
            //#line 556 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long r$131289 = pm.rank;
            
            //#line 556 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final boolean t$131290 = pm.isRect$O();
            
            //#line 556 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final boolean z$131291 = pm.isZeroBased$O();
            
            //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            boolean t$131684 = ((long) r$131289) == ((long) 1L);
            
            //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            if (t$131684) {
                
                //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                t$131684 = t$131290;
            }
            
            //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            boolean t$131685 = t$131684;
            
            //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            if (t$131685) {
                
                //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                t$131685 = z$131291;
            }
            
            //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final boolean isRail$131686 = t$131685;
            
            //#line 558 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this$131293.rank = r$131289;
            
            //#line 558 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this$131293.rect = t$131290;
            
            //#line 558 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this$131293.zeroBased = z$131291;
            
            //#line 558 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this$131293.rail = isRail$131686;
            {
                
            }
            
            //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final x10.regionarray.PolyRegion this$131687 = this;
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            this$131687.size = -1L;
            
            //#line 302 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final x10.regionarray.PolyMat t$131531 = ((x10.regionarray.PolyMat)(pm.simplifyAll()));
            
            //#line 302 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final x10.regionarray.PolyMat t$131532 = ((x10.regionarray.PolyMat)(((x10.regionarray.PolyMat)
                                                                                  t$131531)));
            
            //#line 302 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            this.mat = ((x10.regionarray.PolyMat)(t$131532));
        }
        return this;
    }
    
    
    
    //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    public x10.core.fun.Fun_0_1 min() {
        
        //#line 311 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.Region t$131533 = ((x10.regionarray.Region)(this.boundingBox()));
        
        //#line 311 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.core.fun.Fun_0_1 t = t$131533.min();
        
        //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.core.fun.Fun_0_1 t$131537 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.PolyRegion.$Closure$229(t, (x10.regionarray.PolyRegion.$Closure$229.__0$1x10$lang$Long$3x10$lang$Long$2) null)));
        
        //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        return t$131537;
    }
    
    
    //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    public x10.core.fun.Fun_0_1 max() {
        
        //#line 316 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.Region t$131538 = ((x10.regionarray.Region)(this.boundingBox()));
        
        //#line 316 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.core.fun.Fun_0_1 t = t$131538.max();
        
        //#line 317 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.core.fun.Fun_0_1 t$131542 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.PolyRegion.$Closure$230(t, (x10.regionarray.PolyRegion.$Closure$230.__0$1x10$lang$Long$3x10$lang$Long$2) null)));
        
        //#line 317 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        return t$131542;
    }
    
    
    //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    public void printInfo(final x10.io.Printer out) {
        
        //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.PolyMat t$131543 = ((x10.regionarray.PolyMat)(mat));
        
        //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final java.lang.String t$131544 = this.toString();
        
        //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        ((x10.regionarray.Mat<x10.regionarray.PolyRow>)t$131543).printInfo(((x10.io.Printer)(out)), ((java.lang.String)(t$131544)));
    }
    
    
    //#line 329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    public java.lang.String toString() {
        
        //#line 330 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final x10.regionarray.PolyMat t$131545 = ((x10.regionarray.PolyMat)(mat));
        
        //#line 330 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        final java.lang.String t$131546 = t$131545.toString();
        
        //#line 330 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        return t$131546;
    }
    
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    final public x10.regionarray.PolyRegion x10$regionarray$PolyRegion$$this$x10$regionarray$PolyRegion() {
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        return x10.regionarray.PolyRegion.this;
    }
    
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    final public void __fieldInitializers_x10_regionarray_PolyRegion() {
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
        this.size = -1L;
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$COL = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$COL;
    final private static x10.core.concurrent.AtomicInteger initStatus$ROW = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$ROW;
    
    public static int get$ROW() {
        if (((int) x10.regionarray.PolyRegion.initStatus$ROW.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.regionarray.PolyRegion.ROW;
        }
        if (((int) x10.regionarray.PolyRegion.initStatus$ROW.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.regionarray.PolyRegion.exception$ROW;
        }
        if (x10.regionarray.PolyRegion.initStatus$ROW.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.regionarray.PolyRegion.ROW = x10.regionarray.PolyMatBuilder.X$O((int)(0));
            }}catch (java.lang.Throwable exc$131688) {
                x10.regionarray.PolyRegion.exception$ROW = new x10.lang.ExceptionInInitializer(exc$131688);
                x10.regionarray.PolyRegion.initStatus$ROW.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.regionarray.PolyRegion.exception$ROW;
            }
            x10.regionarray.PolyRegion.initStatus$ROW.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.regionarray.PolyRegion.initStatus$ROW.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.regionarray.PolyRegion.initStatus$ROW.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.regionarray.PolyRegion.initStatus$ROW.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.regionarray.PolyRegion.exception$ROW;
                }
            }
        }
        return x10.regionarray.PolyRegion.ROW;
    }
    
    public static int get$COL() {
        if (((int) x10.regionarray.PolyRegion.initStatus$COL.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.regionarray.PolyRegion.COL;
        }
        if (((int) x10.regionarray.PolyRegion.initStatus$COL.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.regionarray.PolyRegion.exception$COL;
        }
        if (x10.regionarray.PolyRegion.initStatus$COL.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.regionarray.PolyRegion.COL = x10.regionarray.PolyMatBuilder.X$O((int)(1));
            }}catch (java.lang.Throwable exc$131689) {
                x10.regionarray.PolyRegion.exception$COL = new x10.lang.ExceptionInInitializer(exc$131689);
                x10.regionarray.PolyRegion.initStatus$COL.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.regionarray.PolyRegion.exception$COL;
            }
            x10.regionarray.PolyRegion.initStatus$COL.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.regionarray.PolyRegion.initStatus$COL.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.regionarray.PolyRegion.initStatus$COL.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.regionarray.PolyRegion.initStatus$COL.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.regionarray.PolyRegion.exception$COL;
                }
            }
        }
        return x10.regionarray.PolyRegion.COL;
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$229 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$229> $RTT = 
            x10.rtt.StaticFunType.<$Closure$229> make($Closure$229.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.PolyRegion.$Closure$229 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.t = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.PolyRegion.$Closure$229 $_obj = new x10.regionarray.PolyRegion.$Closure$229((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.t);
            
        }
        
        // constructor just for allocation
        public $Closure$229(final java.lang.System[] $dummy) {
            
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
        
    
        
        public long $apply$O(final long i) {
            
            //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final int t$131534 = ((int)(long)(((long)(i))));
            
            //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final long t$131535 = ((long)(((int)(t$131534))));
            
            //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final long t$131536 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)this.t).$apply(x10.core.Long.$box(t$131535), x10.rtt.Types.LONG));
            
            //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            return t$131536;
        }
        
        public x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long> t;
        
        public $Closure$229(final x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long> t, __0$1x10$lang$Long$3x10$lang$Long$2 $dummy) {
             {
                this.t = ((x10.core.fun.Fun_0_1)(t));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$230 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$230> $RTT = 
            x10.rtt.StaticFunType.<$Closure$230> make($Closure$230.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.PolyRegion.$Closure$230 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.t = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.PolyRegion.$Closure$230 $_obj = new x10.regionarray.PolyRegion.$Closure$230((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.t);
            
        }
        
        // constructor just for allocation
        public $Closure$230(final java.lang.System[] $dummy) {
            
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
        
    
        
        public long $apply$O(final long i) {
            
            //#line 317 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final int t$131539 = ((int)(long)(((long)(i))));
            
            //#line 317 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final long t$131540 = ((long)(((int)(t$131539))));
            
            //#line 317 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            final long t$131541 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long>)this.t).$apply(x10.core.Long.$box(t$131540), x10.rtt.Types.LONG));
            
            //#line 317 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
            return t$131541;
        }
        
        public x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long> t;
        
        public $Closure$230(final x10.core.fun.Fun_0_1<x10.core.Long,x10.core.Long> t, __0$1x10$lang$Long$3x10$lang$Long$2 $dummy) {
             {
                this.t = ((x10.core.fun.Fun_0_1)(t));
            }
        }
        
    }
    
}


