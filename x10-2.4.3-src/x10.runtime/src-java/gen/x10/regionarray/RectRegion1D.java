package x10.regionarray;


@x10.runtime.impl.java.X10Generated
final public class RectRegion1D extends x10.regionarray.Region implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<RectRegion1D> $RTT = 
        x10.rtt.NamedType.<RectRegion1D> make("x10.regionarray.RectRegion1D",
                                              RectRegion1D.class,
                                              new x10.rtt.Type[] {
                                                  x10.regionarray.Region.$RTT
                                              });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion1D $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.Region.$_deserialize_body($_obj, $deserializer);
        $_obj.size = $deserializer.readLong();
        $_obj.min = $deserializer.readLong();
        $_obj.max = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.RectRegion1D $_obj = new x10.regionarray.RectRegion1D((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.size);
        $serializer.write(this.min);
        $serializer.write(this.max);
        
    }
    
    // constructor just for allocation
    public RectRegion1D(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    public long size;
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    public long min;
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    public long max;
    
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    // creation method for java code (1-phase java constructor)
    public RectRegion1D(final long minArg, final long maxArg) {
        this((java.lang.System[]) null);
        x10$regionarray$RectRegion1D$$init$S(minArg, maxArg);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.RectRegion1D x10$regionarray$RectRegion1D$$init$S(final long minArg, final long maxArg) {
         {
            
            //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final x10.regionarray.Region this$134188 = ((x10.regionarray.Region)(this));
            
            //#line 556 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final boolean z$134186 = ((long) minArg) == ((long) 0L);
            
            //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final boolean isRail$134333 = z$134186;
            
            //#line 558 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this$134188.rank = 1L;
            
            //#line 558 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this$134188.rect = true;
            
            //#line 558 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this$134188.zeroBased = z$134186;
            
            //#line 558 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this$134188.rail = isRail$134333;
            {
                
            }
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final x10.regionarray.RectRegion1D this$134334 = this;
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final long t$134226 = ((maxArg) - (((long)(minArg))));
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final long s = ((t$134226) + (((long)(1L))));
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final long t$134227 = java.lang.Long.MIN_VALUE;
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            boolean t$134229 = ((long) minArg) == ((long) t$134227);
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            if (t$134229) {
                
                //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
                final long t$134228 = java.lang.Long.MAX_VALUE;
                
                //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
                t$134229 = ((long) maxArg) == ((long) t$134228);
            }
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final boolean t$134233 = t$134229;
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            if (t$134233) {
                
                //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
                this.size = -1L;
            } else {
                
                //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
                final boolean t$134230 = ((s) > (((long)(0L))));
                
                //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
                long t$134231 =  0;
                
                //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
                if (t$134230) {
                    
                    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
                    t$134231 = s;
                } else {
                    
                    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
                    t$134231 = 0L;
                }
                
                //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
                final long t$134232 = t$134231;
                
                //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
                this.size = t$134232;
            }
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            this.min = minArg;
            
            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            this.max = maxArg;
        }
        return this;
    }
    
    
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    // creation method for java code (1-phase java constructor)
    public RectRegion1D(final long maxArg) {
        this((java.lang.System[]) null);
        x10$regionarray$RectRegion1D$$init$S(maxArg);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.RectRegion1D x10$regionarray$RectRegion1D$$init$S(final long maxArg) {
         {
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final x10.regionarray.Region this$134196 = ((x10.regionarray.Region)(this));
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final long t$134234 = ((long)(((int)(1))));
            
            //#line 565 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long r$134195 = t$134234;
            
            //#line 566 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this$134196.rank = r$134195;
            
            //#line 566 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this$134196.rect = true;
            
            //#line 566 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this$134196.zeroBased = true;
            
            //#line 566 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this$134196.rail = true;
            {
                
            }
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final x10.regionarray.RectRegion1D this$134335 = this;
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final long t$134235 = ((maxArg) + (((long)(1L))));
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            this.size = t$134235;
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            this.min = 0L;
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            this.max = maxArg;
        }
        return this;
    }
    
    
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    public long size$O() {
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final long t$134236 = size;
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final boolean t$134238 = ((t$134236) < (((long)(0L))));
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        if (t$134238) {
            
            //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final x10.regionarray.UnboundedRegionException t$134237 = ((x10.regionarray.UnboundedRegionException)(new x10.regionarray.UnboundedRegionException(((java.lang.String)("size exceeds capacity of long")))));
            
            //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            throw t$134237;
        }
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final long t$134239 = size;
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        return t$134239;
    }
    
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    public boolean isConvex$O() {
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        return true;
    }
    
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    public boolean isEmpty$O() {
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final long t$134240 = size;
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final boolean t$134241 = ((long) t$134240) == ((long) 0L);
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        return t$134241;
    }
    
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    public long indexOf$O(final x10.lang.Point pt) {
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final boolean t$134242 = this.contains$O(((x10.lang.Point)(pt)));
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final boolean t$134243 = !(t$134242);
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        if (t$134243) {
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            return -1L;
        }
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final long t$134244 = pt.$apply$O((long)(0L));
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final long t$134245 = min;
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final long t$134246 = ((t$134244) - (((long)(t$134245))));
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        return t$134246;
    }
    
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    public long indexOf$O(final long i0) {
        
        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final boolean t$134259 = zeroBased;
        
        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        if (t$134259) {
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final x10.regionarray.RectRegion1D this$134204 = ((x10.regionarray.RectRegion1D)(this));
            
            //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final long i$134203 = i0;
            
            //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final long t$134247 = this$134204.min;
            
            //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            boolean t$134249 = ((i$134203) >= (((long)(t$134247))));
            
            //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            if (t$134249) {
                
                //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
                final long t$134248 = this$134204.max;
                
                //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
                t$134249 = ((i$134203) <= (((long)(t$134248))));
            }
            
            //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final boolean t$134250 = t$134249;
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final boolean t$134251 = !(t$134250);
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            if (t$134251) {
                
                //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
                return -1L;
            }
            
            //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            return i0;
        } else {
            
            //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final x10.regionarray.RectRegion1D this$134206 = ((x10.regionarray.RectRegion1D)(this));
            
            //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final long i$134205 = i0;
            
            //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final long t$134252 = this$134206.min;
            
            //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            boolean t$134254 = ((i$134205) >= (((long)(t$134252))));
            
            //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            if (t$134254) {
                
                //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
                final long t$134253 = this$134206.max;
                
                //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
                t$134254 = ((i$134205) <= (((long)(t$134253))));
            }
            
            //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final boolean t$134255 = t$134254;
            
            //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final boolean t$134256 = !(t$134255);
            
            //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            if (t$134256) {
                
                //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
                return -1L;
            }
            
            //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final long t$134257 = min;
            
            //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final long t$134258 = ((i0) - (((long)(t$134257))));
            
            //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            return t$134258;
        }
    }
    
    
    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    public long indexOf$O(final long i0, final long i1) {
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        return -1L;
    }
    
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    public long indexOf$O(final long i0, final long i1, final long i2) {
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        return -1L;
    }
    
    
    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    public long indexOf$O(final long i0, final long i1, final long i2, final long i3) {
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        return -1L;
    }
    
    
    //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    public long min$O(final long i) {
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final boolean t$134264 = ((long) i) != ((long) 0L);
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        if (t$134264) {
            
            //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final java.lang.String t$134260 = (("min: ") + ((x10.core.Long.$box(i))));
            
            //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final java.lang.String t$134261 = ((t$134260) + (" is not a valid rank for "));
            
            //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final java.lang.String t$134262 = ((t$134261) + (this));
            
            //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final java.lang.ArrayIndexOutOfBoundsException t$134263 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$134262)));
            
            //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            throw t$134263;
        }
        
        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final long t$134265 = min;
        
        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        return t$134265;
    }
    
    
    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    public long max$O(final long i) {
        
        //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final boolean t$134270 = ((long) i) != ((long) 0L);
        
        //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        if (t$134270) {
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final java.lang.String t$134266 = (("max: ") + ((x10.core.Long.$box(i))));
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final java.lang.String t$134267 = ((t$134266) + (" is not a valid rank for "));
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final java.lang.String t$134268 = ((t$134267) + (this));
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final java.lang.ArrayIndexOutOfBoundsException t$134269 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$134268)));
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            throw t$134269;
        }
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final long t$134271 = max;
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        return t$134271;
    }
    
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    public x10.regionarray.Region computeBoundingBox() {
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        return this;
    }
    
    
    //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    public x10.regionarray.RectRegion toRectRegion() {
        
        //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final x10.regionarray.RectRegion alloc$116898 = ((x10.regionarray.RectRegion)(new x10.regionarray.RectRegion((java.lang.System[]) null)));
        
        //#line 104 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long min$134207 = min;
        
        //#line 104 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long max$134208 = max;
        
        //#line 556 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final boolean z$134337 = ((long) min$134207) == ((long) 0L);
        
        //#line 557 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        final boolean isRail$134336 = z$134337;
        
        //#line 558 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        alloc$116898.rank = 1L;
        
        //#line 558 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        alloc$116898.rect = true;
        
        //#line 558 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        alloc$116898.zeroBased = z$134337;
        
        //#line 558 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        alloc$116898.rail = isRail$134336;
        {
            
        }
        
        //#line 21 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        alloc$116898.polyRep = null;
        
        //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$134338 = java.lang.Long.MIN_VALUE;
        
        //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        boolean t$134339 = ((long) min$134207) == ((long) t$134338);
        
        //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$134339) {
            
            //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$134340 = java.lang.Long.MAX_VALUE;
            
            //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            t$134339 = ((long) max$134208) == ((long) t$134340);
        }
        
        //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final boolean t$134341 = t$134339;
        
        //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        long t$134342 =  0;
        
        //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        if (t$134341) {
            
            //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            t$134342 = -1L;
        } else {
            
            //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            final long t$134343 = ((max$134208) - (((long)(min$134207))));
            
            //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
            t$134342 = ((t$134343) + (((long)(1L))));
        }
        
        //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$134344 = t$134342;
        
        //#line 107 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        alloc$116898.size = t$134344;
        
        //#line 108 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        alloc$116898.min0 = min$134207;
        
        //#line 109 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        alloc$116898.max0 = max$134208;
        
        //#line 111 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$134345 = alloc$116898.min3 = 0L;
        
        //#line 111 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$134346 = alloc$116898.min2 = t$134345;
        
        //#line 111 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        alloc$116898.min1 = t$134346;
        
        //#line 112 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$134347 = alloc$116898.max3 = 0L;
        
        //#line 112 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        final long t$134348 = alloc$116898.max2 = t$134347;
        
        //#line 112 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        alloc$116898.max1 = t$134348;
        
        //#line 113 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        alloc$116898.mins = null;
        
        //#line 114 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        alloc$116898.maxs = null;
        
        //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        return alloc$116898;
    }
    
    
    //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    public x10.core.fun.Fun_0_1 min() {
        
        //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final x10.core.fun.Fun_0_1 t$134284 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion1D.$Closure$265(this)));
        
        //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        return t$134284;
    }
    
    
    //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    public x10.core.fun.Fun_0_1 max() {
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final x10.core.fun.Fun_0_1 t$134286 = ((x10.core.fun.Fun_0_1)(new x10.regionarray.RectRegion1D.$Closure$266(this)));
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        return t$134286;
    }
    
    
    //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    public boolean contains$O(final x10.regionarray.Region that) {
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final x10.regionarray.RectRegion t$134287 = ((x10.regionarray.RectRegion)(this.toRectRegion()));
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final boolean t$134288 = t$134287.contains$O(((x10.regionarray.Region)(that)));
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        return t$134288;
    }
    
    
    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    public boolean contains$O(final x10.lang.Point p) {
        
        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final x10.regionarray.RectRegion t$134289 = ((x10.regionarray.RectRegion)(this.toRectRegion()));
        
        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final boolean t$134290 = t$134289.contains$O(((x10.lang.Point)(p)));
        
        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        return t$134290;
    }
    
    
    //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    public boolean contains$O(final long i0) {
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final x10.regionarray.RectRegion1D this$134220 = ((x10.regionarray.RectRegion1D)(this));
        
        //#line 121 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final long i$134219 = i0;
        
        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final long t$134291 = this$134220.min;
        
        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        boolean t$134293 = ((i$134219) >= (((long)(t$134291))));
        
        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        if (t$134293) {
            
            //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final long t$134292 = this$134220.max;
            
            //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            t$134293 = ((i$134219) <= (((long)(t$134292))));
        }
        
        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final boolean t$134294 = t$134293;
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        return t$134294;
    }
    
    
    //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    private boolean containsInternal$O(final long i0) {
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final long t$134295 = min;
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        boolean t$134297 = ((i0) >= (((long)(t$134295))));
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        if (t$134297) {
            
            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final long t$134296 = max;
            
            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            t$134297 = ((i0) <= (((long)(t$134296))));
        }
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final boolean t$134298 = t$134297;
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        return t$134298;
    }
    
    public static boolean containsInternal$P$O(final long i0, final x10.regionarray.RectRegion1D RectRegion1D) {
        return RectRegion1D.containsInternal$O((long)(i0));
    }
    
    
    //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    public x10.regionarray.Region toPolyRegion() {
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final x10.regionarray.RectRegion t$134299 = ((x10.regionarray.RectRegion)(this.toRectRegion()));
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final x10.regionarray.Region t$134300 = ((x10.regionarray.Region)(t$134299.toPolyRegion()));
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        return t$134300;
    }
    
    
    //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    public x10.regionarray.Region intersection(final x10.regionarray.Region that) {
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final x10.regionarray.RectRegion t$134301 = ((x10.regionarray.RectRegion)(this.toRectRegion()));
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final x10.regionarray.Region t$134302 = ((x10.regionarray.Region)(t$134301.intersection(((x10.regionarray.Region)(that)))));
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        return t$134302;
    }
    
    
    //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    public x10.regionarray.Region product(final x10.regionarray.Region that) {
        
        //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final x10.regionarray.RectRegion t$134303 = ((x10.regionarray.RectRegion)(this.toRectRegion()));
        
        //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final x10.regionarray.Region t$134304 = ((x10.regionarray.Region)(t$134303.product(((x10.regionarray.Region)(that)))));
        
        //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        return t$134304;
    }
    
    
    //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    public x10.regionarray.Region translate(final x10.lang.Point v) {
        
        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final x10.regionarray.RectRegion1D alloc$116899 = ((x10.regionarray.RectRegion1D)(new x10.regionarray.RectRegion1D((java.lang.System[]) null)));
        
        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final long t$134349 = min;
        
        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final long t$134350 = v.$apply$O((long)(0L));
        
        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final long t$134351 = ((t$134349) + (((long)(t$134350))));
        
        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final long t$134352 = max;
        
        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final long t$134353 = v.$apply$O((long)(0L));
        
        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final long t$134354 = ((t$134352) + (((long)(t$134353))));
        
        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        alloc$116899.x10$regionarray$RectRegion1D$$init$S(t$134351, t$134354);
        
        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        return alloc$116899;
    }
    
    
    //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    public x10.regionarray.Region projection(final long axis) {
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final boolean t$134311 = ((long) axis) == ((long) 0L);
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        if (t$134311) {
            
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            return this;
        }
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final java.lang.String t$134312 = (("projection: ") + ((x10.core.Long.$box(axis))));
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final java.lang.String t$134313 = ((t$134312) + (" is not a valid rank for "));
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final java.lang.String t$134314 = ((t$134313) + (this));
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final java.lang.ArrayIndexOutOfBoundsException t$134315 = ((java.lang.ArrayIndexOutOfBoundsException)(new java.lang.ArrayIndexOutOfBoundsException(t$134314)));
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        throw t$134315;
    }
    
    
    //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    public x10.regionarray.Region eliminate(final long axis) {
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final x10.regionarray.RectRegion t$134316 = ((x10.regionarray.RectRegion)(this.toRectRegion()));
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final x10.regionarray.Region t$134317 = ((x10.regionarray.Region)(t$134316.eliminate((long)(axis))));
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        return t$134317;
    }
    
    
    //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    @x10.runtime.impl.java.X10Generated
    public static class RRIterator extends x10.core.Ref implements x10.lang.Iterator, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<RRIterator> $RTT = 
            x10.rtt.NamedType.<RRIterator> make("x10.regionarray.RectRegion1D.RRIterator",
                                                RRIterator.class,
                                                new x10.rtt.Type[] {
                                                    x10.rtt.ParameterizedType.make(x10.lang.Iterator.$RTT, x10.lang.Point.$RTT)
                                                });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion1D.RRIterator $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.min = $deserializer.readLong();
            $_obj.max = $deserializer.readLong();
            $_obj.cur = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion1D.RRIterator $_obj = new x10.regionarray.RectRegion1D.RRIterator((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.min);
            $serializer.write(this.max);
            $serializer.write(this.cur);
            
        }
        
        // constructor just for allocation
        public RRIterator(final java.lang.System[] $dummy) {
            
        }
        
        // bridge for method abstract public x10.lang.Iterator[T].next(){}:T
        public x10.lang.Point next$G() {
            return next();
        }
        
        
    
        
        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        public long min;
        
        //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        public long max;
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        public long cur;
        
        
        //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        // creation method for java code (1-phase java constructor)
        public RRIterator(final x10.regionarray.RectRegion1D rr) {
            this((java.lang.System[]) null);
            x10$regionarray$RectRegion1D$RRIterator$$init$S(rr);
        }
        
        // constructor for non-virtual call
        final public x10.regionarray.RectRegion1D.RRIterator x10$regionarray$RectRegion1D$RRIterator$$init$S(final x10.regionarray.RectRegion1D rr) {
             {
                
                //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
                
                
                //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
                final x10.regionarray.RectRegion1D.RRIterator this$134355 = this;
                
                //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
                this$134355.cur = 0L;
                
                //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
                final long t$134318 = rr.min;
                
                //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
                this.min = t$134318;
                
                //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
                final long t$134319 = rr.max;
                
                //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
                this.max = t$134319;
                
                //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
                final long t$134320 = min;
                
                //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
                this.cur = t$134320;
            }
            return this;
        }
        
        
        
        //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        public boolean hasNext$O() {
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final long t$134321 = cur;
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final long t$134322 = max;
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final boolean t$134323 = ((t$134321) <= (((long)(t$134322))));
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            return t$134323;
        }
        
        
        //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        public x10.lang.Point next() {
            
            //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final long t$134324 = this.cur;
            
            //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final long t$134325 = ((t$134324) + (((long)(1L))));
            
            //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final long t$134326 = this.cur = t$134325;
            
            //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long i$134224 = ((t$134326) - (((long)(1L))));
            
            //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final x10.lang.Point alloc$134225 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
            
            //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            alloc$134225.x10$lang$Point$$init$S(((long)(i$134224)));
            
            //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            return alloc$134225;
        }
        
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final public x10.regionarray.RectRegion1D.RRIterator x10$regionarray$RectRegion1D$RRIterator$$this$x10$regionarray$RectRegion1D$RRIterator() {
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            return x10.regionarray.RectRegion1D.RRIterator.this;
        }
        
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final public void __fieldInitializers_x10_regionarray_RectRegion1D_RRIterator() {
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            this.cur = 0L;
        }
    }
    
    
    
    //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    public x10.lang.Iterator iterator() {
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final x10.regionarray.RectRegion1D.RRIterator alloc$116900 = ((x10.regionarray.RectRegion1D.RRIterator)(new x10.regionarray.RectRegion1D.RRIterator((java.lang.System[]) null)));
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        alloc$116900.x10$regionarray$RectRegion1D$RRIterator$$init$S(((x10.regionarray.RectRegion1D)(this)));
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        return alloc$116900;
    }
    
    
    //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    public java.lang.String toString() {
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final long t$134327 = min;
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final java.lang.String t$134328 = (("[") + ((x10.core.Long.$box(t$134327))));
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final java.lang.String t$134329 = ((t$134328) + (".."));
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final long t$134330 = max;
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final java.lang.String t$134331 = ((t$134329) + ((x10.core.Long.$box(t$134330))));
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        final java.lang.String t$134332 = ((t$134331) + ("]"));
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        return t$134332;
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    final public x10.regionarray.RectRegion1D x10$regionarray$RectRegion1D$$this$x10$regionarray$RectRegion1D() {
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        return x10.regionarray.RectRegion1D.this;
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    final public void __fieldInitializers_x10_regionarray_RectRegion1D() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$265 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$265> $RTT = 
            x10.rtt.StaticFunType.<$Closure$265> make($Closure$265.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion1D.$Closure$265 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion1D.$Closure$265 $_obj = new x10.regionarray.RectRegion1D.$Closure$265((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            
        }
        
        // constructor just for allocation
        public $Closure$265(final java.lang.System[] $dummy) {
            
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
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final long t$134283 = this.out$$.min$O((long)(i));
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            return t$134283;
        }
        
        public x10.regionarray.RectRegion1D out$$;
        
        public $Closure$265(final x10.regionarray.RectRegion1D out$$) {
             {
                this.out$$ = out$$;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$266 extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$266> $RTT = 
            x10.rtt.StaticFunType.<$Closure$266> make($Closure$266.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.RectRegion1D.$Closure$266 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.out$$ = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.RectRegion1D.$Closure$266 $_obj = new x10.regionarray.RectRegion1D.$Closure$266((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.out$$);
            
        }
        
        // constructor just for allocation
        public $Closure$266(final java.lang.System[] $dummy) {
            
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
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            final long t$134285 = this.out$$.max$O((long)(i));
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
            return t$134285;
        }
        
        public x10.regionarray.RectRegion1D out$$;
        
        public $Closure$266(final x10.regionarray.RectRegion1D out$$) {
             {
                this.out$$ = out$$;
            }
        }
        
    }
    
}

