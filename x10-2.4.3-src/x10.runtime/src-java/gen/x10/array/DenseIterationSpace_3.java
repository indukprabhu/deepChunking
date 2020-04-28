package x10.array;

@x10.runtime.impl.java.X10Generated
final public class DenseIterationSpace_3 extends x10.array.IterationSpace implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<DenseIterationSpace_3> $RTT = 
        x10.rtt.NamedType.<DenseIterationSpace_3> make("x10.array.DenseIterationSpace_3",
                                                       DenseIterationSpace_3.class,
                                                       new x10.rtt.Type[] {
                                                           x10.array.IterationSpace.$RTT
                                                       });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.DenseIterationSpace_3 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.array.IterationSpace.$_deserialize_body($_obj, $deserializer);
        $_obj.min0 = $deserializer.readLong();
        $_obj.min1 = $deserializer.readLong();
        $_obj.min2 = $deserializer.readLong();
        $_obj.max0 = $deserializer.readLong();
        $_obj.max1 = $deserializer.readLong();
        $_obj.max2 = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.array.DenseIterationSpace_3 $_obj = new x10.array.DenseIterationSpace_3((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.min0);
        $serializer.write(this.min1);
        $serializer.write(this.min2);
        $serializer.write(this.max0);
        $serializer.write(this.max1);
        $serializer.write(this.max2);
        
    }
    
    // constructor just for allocation
    public DenseIterationSpace_3(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    public long min0;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    public long min1;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    public long min2;
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    public long max0;
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    public long max1;
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    public long max2;
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    private static x10.array.DenseIterationSpace_3 EMPTY;
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    // creation method for java code (1-phase java constructor)
    public DenseIterationSpace_3(final long min0, final long min1, final long min2, final long max0, final long max1, final long max2) {
        this((java.lang.System[]) null);
        x10$array$DenseIterationSpace_3$$init$S(min0, min1, min2, max0, max1, max2);
    }
    
    // constructor for non-virtual call
    final public x10.array.DenseIterationSpace_3 x10$array$DenseIterationSpace_3$$init$S(final long min0, final long min1, final long min2, final long max0, final long max1, final long max2) {
         {
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            final x10.array.IterationSpace this$75226 = ((x10.array.IterationSpace)(this));
            
            //#line 22 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
            this$75226.rank = 3L;
            
            //#line 22 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
            this$75226.rect = true;
            {
                
            }
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            final x10.array.DenseIterationSpace_3 this$75302 = this;
            
            //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            this.min0 = min0;
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            this.min1 = min1;
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            this.min2 = min2;
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            this.max0 = max0;
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            this.max1 = max1;
            
            //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            this.max2 = max2;
        }
        return this;
    }
    
    
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    public long min$O(final long i) {
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        final boolean t$75241 = ((long) i) == ((long) 0L);
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        if (t$75241) {
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            final long t$75240 = min0;
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            return t$75240;
        }
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        final boolean t$75243 = ((long) i) == ((long) 1L);
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        if (t$75243) {
            
            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            final long t$75242 = min1;
            
            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            return t$75242;
        }
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        final boolean t$75245 = ((long) i) == ((long) 2L);
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        if (t$75245) {
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            final long t$75244 = min2;
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            return t$75244;
        }
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        final java.lang.String t$75246 = (((x10.core.Long.$box(i))) + (" is not a valid rank"));
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        final x10.lang.IllegalOperationException t$75247 = ((x10.lang.IllegalOperationException)(new x10.lang.IllegalOperationException(t$75246)));
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        throw t$75247;
    }
    
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    public long max$O(final long i) {
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        final boolean t$75249 = ((long) i) == ((long) 0L);
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        if (t$75249) {
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            final long t$75248 = max0;
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            return t$75248;
        }
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        final boolean t$75251 = ((long) i) == ((long) 1L);
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        if (t$75251) {
            
            //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            final long t$75250 = max1;
            
            //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            return t$75250;
        }
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        final boolean t$75253 = ((long) i) == ((long) 2L);
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        if (t$75253) {
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            final long t$75252 = max2;
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            return t$75252;
        }
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        final java.lang.String t$75254 = (((x10.core.Long.$box(i))) + (" is not a valid rank"));
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        final x10.lang.IllegalOperationException t$75255 = ((x10.lang.IllegalOperationException)(new x10.lang.IllegalOperationException(t$75254)));
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        throw t$75255;
    }
    
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    public boolean isEmpty$O() {
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        final long t$75256 = max0;
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        final long t$75257 = min0;
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        boolean t$75260 = ((t$75256) < (((long)(t$75257))));
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        if (!(t$75260)) {
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            final long t$75258 = max1;
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            final long t$75259 = min1;
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            t$75260 = ((t$75258) < (((long)(t$75259))));
        }
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        boolean t$75263 = t$75260;
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        if (!(t$75263)) {
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            final long t$75261 = max2;
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            final long t$75262 = min2;
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            t$75263 = ((t$75261) < (((long)(t$75262))));
        }
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        final boolean t$75264 = t$75263;
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        return t$75264;
    }
    
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    public x10.lang.Iterator iterator() {
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        final x10.array.DenseIterationSpace_3.DIS3_It alloc$73234 = ((x10.array.DenseIterationSpace_3.DIS3_It)(new x10.array.DenseIterationSpace_3.DIS3_It((java.lang.System[]) null)));
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        alloc$73234.x10$array$DenseIterationSpace_3$DIS3_It$$init$S(this);
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        return alloc$73234;
    }
    
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    @x10.runtime.impl.java.X10Generated
    public static class DIS3_It extends x10.core.Ref implements x10.lang.Iterator, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<DIS3_It> $RTT = 
            x10.rtt.NamedType.<DIS3_It> make("x10.array.DenseIterationSpace_3.DIS3_It",
                                             DIS3_It.class,
                                             new x10.rtt.Type[] {
                                                 x10.rtt.ParameterizedType.make(x10.lang.Iterator.$RTT, x10.lang.Point.$RTT)
                                             });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.DenseIterationSpace_3.DIS3_It $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.cur0 = $deserializer.readLong();
            $_obj.cur1 = $deserializer.readLong();
            $_obj.cur2 = $deserializer.readLong();
            $_obj.out$ = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.array.DenseIterationSpace_3.DIS3_It $_obj = new x10.array.DenseIterationSpace_3.DIS3_It((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.cur0);
            $serializer.write(this.cur1);
            $serializer.write(this.cur2);
            $serializer.write(this.out$);
            
        }
        
        // constructor just for allocation
        public DIS3_It(final java.lang.System[] $dummy) {
            
        }
        
        // bridge for method abstract public x10.lang.Iterator[T].next(){}:T
        public x10.lang.Point next$G() {
            return next();
        }
        
        
    
        
        //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        public x10.array.DenseIterationSpace_3 out$;
        
        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        public long cur0;
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        public long cur1;
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        public long cur2;
        
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        // creation method for java code (1-phase java constructor)
        public DIS3_It(final x10.array.DenseIterationSpace_3 out$) {
            this((java.lang.System[]) null);
            x10$array$DenseIterationSpace_3$DIS3_It$$init$S(out$);
        }
        
        // constructor for non-virtual call
        final public x10.array.DenseIterationSpace_3.DIS3_It x10$array$DenseIterationSpace_3$DIS3_It$$init$S(final x10.array.DenseIterationSpace_3 out$) {
             {
                
                //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                this.out$ = out$;
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                
                
                //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                final x10.array.DenseIterationSpace_3.DIS3_It this$75303 = this;
                
                //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                this$75303.cur0 = 0L;
                
                //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                this$75303.cur1 = 0L;
                
                //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                this$75303.cur2 = 0L;
                
                //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                final x10.array.DenseIterationSpace_3 t$75265 = this.out$;
                
                //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                final long t$75266 = t$75265.min0;
                
                //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                this.cur0 = t$75266;
                
                //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                final x10.array.DenseIterationSpace_3 t$75267 = this.out$;
                
                //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                final long t$75268 = t$75267.min1;
                
                //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                this.cur1 = t$75268;
                
                //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                final x10.array.DenseIterationSpace_3 t$75269 = this.out$;
                
                //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                final long t$75270 = t$75269.min2;
                
                //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                this.cur2 = t$75270;
            }
            return this;
        }
        
        
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        public boolean hasNext$O() {
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            final long t$75272 = cur0;
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            final x10.array.DenseIterationSpace_3 t$75271 = this.out$;
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            final long t$75273 = t$75271.max0;
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            boolean t$75277 = ((t$75272) <= (((long)(t$75273))));
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            if (t$75277) {
                
                //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                final long t$75275 = cur1;
                
                //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                final x10.array.DenseIterationSpace_3 t$75274 = this.out$;
                
                //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                final long t$75276 = t$75274.max1;
                
                //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                t$75277 = ((t$75275) <= (((long)(t$75276))));
            }
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            boolean t$75281 = t$75277;
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            if (t$75281) {
                
                //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                final long t$75279 = cur2;
                
                //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                final x10.array.DenseIterationSpace_3 t$75278 = this.out$;
                
                //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                final long t$75280 = t$75278.max2;
                
                //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                t$75281 = ((t$75279) <= (((long)(t$75280))));
            }
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            final boolean t$75282 = t$75281;
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            return t$75282;
        }
        
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        public x10.lang.Point next() {
            
            //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long i$75236 = cur0;
            
            //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long i$75237 = cur1;
            
            //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long i$75238 = cur2;
            
            //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final x10.lang.Point alloc$75239 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
            
            //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            alloc$75239.x10$lang$Point$$init$S(((long)(i$75236)), ((long)(i$75237)), ((long)(i$75238)));
            
            //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            final x10.lang.Point p = ((x10.lang.Point)(alloc$75239));
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            final long t$75283 = this.cur2;
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            final long t$75284 = ((t$75283) + (((long)(1L))));
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            this.cur2 = t$75284;
            
            //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            final long t$75286 = cur2;
            
            //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            final x10.array.DenseIterationSpace_3 t$75285 = this.out$;
            
            //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            final long t$75287 = t$75285.max2;
            
            //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            final boolean t$75300 = ((t$75286) > (((long)(t$75287))));
            
            //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            if (t$75300) {
                
                //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                final x10.array.DenseIterationSpace_3 t$75288 = this.out$;
                
                //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                final long t$75289 = t$75288.min2;
                
                //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                this.cur2 = t$75289;
                
                //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                final long t$75290 = this.cur1;
                
                //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                final long t$75291 = ((t$75290) + (((long)(1L))));
                
                //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                this.cur1 = t$75291;
                
                //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                final long t$75293 = cur1;
                
                //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                final x10.array.DenseIterationSpace_3 t$75292 = this.out$;
                
                //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                final long t$75294 = t$75292.max1;
                
                //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                final boolean t$75299 = ((t$75293) > (((long)(t$75294))));
                
                //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                if (t$75299) {
                    
                    //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                    final x10.array.DenseIterationSpace_3 t$75295 = this.out$;
                    
                    //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                    final long t$75296 = t$75295.min1;
                    
                    //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                    this.cur1 = t$75296;
                    
                    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                    final long t$75297 = this.cur0;
                    
                    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                    final long t$75298 = ((t$75297) + (((long)(1L))));
                    
                    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
                    this.cur0 = t$75298;
                }
            }
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            return p;
        }
        
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        final public x10.array.DenseIterationSpace_3.DIS3_It x10$array$DenseIterationSpace_3$DIS3_It$$this$x10$array$DenseIterationSpace_3$DIS3_It() {
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            return x10.array.DenseIterationSpace_3.DIS3_It.this;
        }
        
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        final public x10.array.DenseIterationSpace_3 x10$array$DenseIterationSpace_3$DIS3_It$$this$x10$array$DenseIterationSpace_3() {
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            final x10.array.DenseIterationSpace_3 t$75301 = this.out$;
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            return t$75301;
        }
        
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        final public void __fieldInitializers_x10_array_DenseIterationSpace_3_DIS3_It() {
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            this.cur0 = 0L;
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            this.cur1 = 0L;
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            this.cur2 = 0L;
        }
    }
    
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    final public x10.array.DenseIterationSpace_3 x10$array$DenseIterationSpace_3$$this$x10$array$DenseIterationSpace_3() {
        
        //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        return x10.array.DenseIterationSpace_3.this;
    }
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    final public void __fieldInitializers_x10_array_DenseIterationSpace_3() {
        
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$EMPTY = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$EMPTY;
    
    public static x10.array.DenseIterationSpace_3 get$EMPTY() {
        if (((int) x10.array.DenseIterationSpace_3.initStatus$EMPTY.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.array.DenseIterationSpace_3.EMPTY;
        }
        if (((int) x10.array.DenseIterationSpace_3.initStatus$EMPTY.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.array.DenseIterationSpace_3.exception$EMPTY;
        }
        if (x10.array.DenseIterationSpace_3.initStatus$EMPTY.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.array.DenseIterationSpace_3.EMPTY = ((x10.array.DenseIterationSpace_3)(new x10.array.DenseIterationSpace_3((java.lang.System[]) null).x10$array$DenseIterationSpace_3$$init$S(((long)(0L)), ((long)(0L)), ((long)(0L)), ((long)(-1L)), ((long)(-1L)), ((long)(-1L)))));
            }}catch (java.lang.Throwable exc$75304) {
                x10.array.DenseIterationSpace_3.exception$EMPTY = new x10.lang.ExceptionInInitializer(exc$75304);
                x10.array.DenseIterationSpace_3.initStatus$EMPTY.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.array.DenseIterationSpace_3.exception$EMPTY;
            }
            x10.array.DenseIterationSpace_3.initStatus$EMPTY.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.array.DenseIterationSpace_3.initStatus$EMPTY.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.array.DenseIterationSpace_3.initStatus$EMPTY.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.array.DenseIterationSpace_3.initStatus$EMPTY.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.array.DenseIterationSpace_3.exception$EMPTY;
                }
            }
        }
        return x10.array.DenseIterationSpace_3.EMPTY;
    }
}

