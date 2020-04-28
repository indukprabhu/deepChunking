package x10.regionarray;

@x10.runtime.impl.java.X10Generated
final public class EmptyRegion extends x10.regionarray.Region implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<EmptyRegion> $RTT = 
        x10.rtt.NamedType.<EmptyRegion> make("x10.regionarray.EmptyRegion",
                                             EmptyRegion.class,
                                             new x10.rtt.Type[] {
                                                 x10.regionarray.Region.$RTT
                                             });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.EmptyRegion $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.Region.$_deserialize_body($_obj, $deserializer);
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.regionarray.EmptyRegion $_obj = new x10.regionarray.EmptyRegion((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        
    }
    
    // constructor just for allocation
    public EmptyRegion(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    // creation method for java code (1-phase java constructor)
    public EmptyRegion(final long rank) {
        this((java.lang.System[]) null);
        x10$regionarray$EmptyRegion$$init$S(rank);
    }
    
    // constructor for non-virtual call
    final public x10.regionarray.EmptyRegion x10$regionarray$EmptyRegion$$init$S(final long rank) {
         {
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
            final x10.regionarray.Region this$126154 = ((x10.regionarray.Region)(this));
            
            //#line 556 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final long r$126150 = rank;
            
            //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            boolean t$126187 = ((long) r$126150) == ((long) 1L);
            
            //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            if (t$126187) {
                
                //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                t$126187 = true;
            }
            
            //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            boolean t$126188 = t$126187;
            
            //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            if (t$126188) {
                
                //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                t$126188 = false;
            }
            
            //#line 557 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            final boolean isRail$126189 = t$126188;
            
            //#line 558 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this$126154.rank = r$126150;
            
            //#line 558 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this$126154.rect = true;
            
            //#line 558 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this$126154.zeroBased = false;
            
            //#line 558 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            this$126154.rail = isRail$126189;
            {
                
            }
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
            
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
            final x10.regionarray.EmptyRegion this$126190 = this;
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
            final boolean t$126173 = ((rank) < (((long)(0L))));
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
            if (t$126173) {
                
                //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
                final java.lang.String t$126170 = (("Rank is negative (") + ((x10.core.Long.$box(rank))));
                
                //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
                final java.lang.String t$126171 = ((t$126170) + (")"));
                
                //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
                final java.lang.IllegalArgumentException t$126172 = ((java.lang.IllegalArgumentException)(new java.lang.IllegalArgumentException(t$126171)));
                
                //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
                throw t$126172;
            }
        }
        return this;
    }
    
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    public boolean isConvex$O() {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        return true;
    }
    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    public boolean isEmpty$O() {
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        return true;
    }
    
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    public long size$O() {
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        return 0L;
    }
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    public long indexOf$O(final x10.lang.Point id$132) {
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        return -1L;
    }
    
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    public x10.regionarray.Region intersection(final x10.regionarray.Region that) {
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        return this;
    }
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    public x10.regionarray.EmptyRegion product(final x10.regionarray.Region that) {
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        final x10.regionarray.EmptyRegion alloc$122377 = ((x10.regionarray.EmptyRegion)(new x10.regionarray.EmptyRegion((java.lang.System[]) null)));
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        final long t$126191 = this.rank;
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        final long t$126192 = that.rank;
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        final long t$126193 = ((t$126191) + (((long)(t$126192))));
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        alloc$122377.x10$regionarray$EmptyRegion$$init$S(t$126193);
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        return alloc$122377;
    }
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    public x10.regionarray.Region projection(final long axis) {
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        final x10.regionarray.EmptyRegion alloc$122378 = ((x10.regionarray.EmptyRegion)(new x10.regionarray.EmptyRegion((java.lang.System[]) null)));
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        alloc$122378.x10$regionarray$EmptyRegion$$init$S(((long)(1L)));
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        return alloc$122378;
    }
    
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    public x10.regionarray.EmptyRegion translate(final x10.lang.Point p) {
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        return this;
    }
    
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    public x10.regionarray.EmptyRegion eliminate(final long i) {
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        final x10.regionarray.EmptyRegion alloc$122379 = ((x10.regionarray.EmptyRegion)(new x10.regionarray.EmptyRegion((java.lang.System[]) null)));
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        final long t$126194 = rank;
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        final long t$126195 = ((t$126194) - (((long)(1L))));
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        alloc$122379.x10$regionarray$EmptyRegion$$init$S(t$126195);
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        return alloc$122379;
    }
    
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    public x10.regionarray.Region computeBoundingBox() {
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        final x10.lang.IllegalOperationException t$126179 = ((x10.lang.IllegalOperationException)(new x10.lang.IllegalOperationException(((java.lang.String)("bounding box not not defined for empty region")))));
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        throw t$126179;
    }
    
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    public x10.core.fun.Fun_0_1 min() {
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        final x10.lang.IllegalOperationException t$126180 = ((x10.lang.IllegalOperationException)(new x10.lang.IllegalOperationException(((java.lang.String)("min not not defined for empty region")))));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        throw t$126180;
    }
    
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    public x10.core.fun.Fun_0_1 max() {
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        final x10.lang.IllegalOperationException t$126181 = ((x10.lang.IllegalOperationException)(new x10.lang.IllegalOperationException(((java.lang.String)("max not not defined for empty region")))));
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        throw t$126181;
    }
    
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    public boolean contains$O(final x10.regionarray.Region that) {
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        final boolean t$126182 = that.isEmpty$O();
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        return t$126182;
    }
    
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    public boolean contains$O(final x10.lang.Point p) {
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        return false;
    }
    
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    @x10.runtime.impl.java.X10Generated
    public static class ERIterator extends x10.core.Ref implements x10.lang.Iterator, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<ERIterator> $RTT = 
            x10.rtt.NamedType.<ERIterator> make("x10.regionarray.EmptyRegion.ERIterator",
                                                ERIterator.class,
                                                new x10.rtt.Type[] {
                                                    x10.rtt.ParameterizedType.make(x10.lang.Iterator.$RTT, x10.lang.Point.$RTT)
                                                });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.regionarray.EmptyRegion.ERIterator $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.myRank = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.regionarray.EmptyRegion.ERIterator $_obj = new x10.regionarray.EmptyRegion.ERIterator((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.myRank);
            
        }
        
        // constructor just for allocation
        public ERIterator(final java.lang.System[] $dummy) {
            
        }
        
        // bridge for method abstract public x10.lang.Iterator[T].next(){}:T
        public x10.lang.Point next$G() {
            return next();
        }
        
        
        // properties
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        public long myRank;
        
    
        
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        // creation method for java code (1-phase java constructor)
        public ERIterator(final long r) {
            this((java.lang.System[]) null);
            x10$regionarray$EmptyRegion$ERIterator$$init$S(r);
        }
        
        // constructor for non-virtual call
        final public x10.regionarray.EmptyRegion.ERIterator x10$regionarray$EmptyRegion$ERIterator$$init$S(final long r) {
             {
                
                //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
                this.myRank = r;
                
                
                //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
                final x10.regionarray.EmptyRegion.ERIterator this$126161 = this;
            }
            return this;
        }
        
        
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        public boolean hasNext$O() {
            
            //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
            return false;
        }
        
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        public x10.lang.Point next() {
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
            final java.util.NoSuchElementException t$126183 = ((java.util.NoSuchElementException)(new java.util.NoSuchElementException()));
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
            throw t$126183;
        }
        
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        final public x10.regionarray.EmptyRegion.ERIterator x10$regionarray$EmptyRegion$ERIterator$$this$x10$regionarray$EmptyRegion$ERIterator() {
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
            return x10.regionarray.EmptyRegion.ERIterator.this;
        }
        
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        final public void __fieldInitializers_x10_regionarray_EmptyRegion_ERIterator() {
            
        }
    }
    
    
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    public x10.lang.Iterator iterator() {
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        final x10.regionarray.EmptyRegion.ERIterator alloc$122380 = ((x10.regionarray.EmptyRegion.ERIterator)(new x10.regionarray.EmptyRegion.ERIterator((java.lang.System[]) null)));
        
        //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        final long r$126164 = rank;
        
        //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        alloc$122380.myRank = r$126164;
        {
            
        }
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        return alloc$122380;
    }
    
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    public java.lang.String toString() {
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        final long t$126184 = rank;
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        final java.lang.String t$126185 = (("empty(") + ((x10.core.Long.$box(t$126184))));
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        final java.lang.String t$126186 = ((t$126185) + (")"));
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        return t$126186;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    final public x10.regionarray.EmptyRegion x10$regionarray$EmptyRegion$$this$x10$regionarray$EmptyRegion() {
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
        return x10.regionarray.EmptyRegion.this;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    final public void __fieldInitializers_x10_regionarray_EmptyRegion() {
        
    }
}

