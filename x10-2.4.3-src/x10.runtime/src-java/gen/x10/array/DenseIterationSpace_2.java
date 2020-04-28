package x10.array;

@x10.runtime.impl.java.X10Generated
final public class DenseIterationSpace_2 extends x10.array.IterationSpace implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<DenseIterationSpace_2> $RTT = 
        x10.rtt.NamedType.<DenseIterationSpace_2> make("x10.array.DenseIterationSpace_2",
                                                       DenseIterationSpace_2.class,
                                                       new x10.rtt.Type[] {
                                                           x10.array.IterationSpace.$RTT
                                                       });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.DenseIterationSpace_2 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.array.IterationSpace.$_deserialize_body($_obj, $deserializer);
        $_obj.min0 = $deserializer.readLong();
        $_obj.min1 = $deserializer.readLong();
        $_obj.max0 = $deserializer.readLong();
        $_obj.max1 = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.array.DenseIterationSpace_2 $_obj = new x10.array.DenseIterationSpace_2((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.min0);
        $serializer.write(this.min1);
        $serializer.write(this.max0);
        $serializer.write(this.max1);
        
    }
    
    // constructor just for allocation
    public DenseIterationSpace_2(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    public long min0;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    public long min1;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    public long max0;
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    public long max1;
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    private static x10.array.DenseIterationSpace_2 EMPTY;
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    // creation method for java code (1-phase java constructor)
    public DenseIterationSpace_2(final long min0, final long min1, final long max0, final long max1) {
        this((java.lang.System[]) null);
        x10$array$DenseIterationSpace_2$$init$S(min0, min1, max0, max1);
    }
    
    // constructor for non-virtual call
    final public x10.array.DenseIterationSpace_2 x10$array$DenseIterationSpace_2$$init$S(final long min0, final long min1, final long max0, final long max1) {
         {
            
            //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            final x10.array.IterationSpace this$75167 = ((x10.array.IterationSpace)(this));
            
            //#line 22 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
            this$75167.rank = 2L;
            
            //#line 22 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
            this$75167.rect = true;
            {
                
            }
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            final x10.array.DenseIterationSpace_2 this$75221 = this;
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            this.min0 = min0;
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            this.min1 = min1;
            
            //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            this.max0 = max0;
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            this.max1 = max1;
        }
        return this;
    }
    
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    public long min$O(final long i) {
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        final boolean t$75181 = ((long) i) == ((long) 0L);
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        if (t$75181) {
            
            //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            final long t$75180 = min0;
            
            //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            return t$75180;
        }
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        final boolean t$75183 = ((long) i) == ((long) 1L);
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        if (t$75183) {
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            final long t$75182 = min1;
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            return t$75182;
        }
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        final java.lang.String t$75184 = (((x10.core.Long.$box(i))) + (" is not a valid rank"));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        final x10.lang.IllegalOperationException t$75185 = ((x10.lang.IllegalOperationException)(new x10.lang.IllegalOperationException(t$75184)));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        throw t$75185;
    }
    
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    public long max$O(final long i) {
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        final boolean t$75187 = ((long) i) == ((long) 0L);
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        if (t$75187) {
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            final long t$75186 = max0;
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            return t$75186;
        }
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        final boolean t$75189 = ((long) i) == ((long) 1L);
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        if (t$75189) {
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            final long t$75188 = max1;
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            return t$75188;
        }
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        final java.lang.String t$75190 = (((x10.core.Long.$box(i))) + (" is not a valid rank"));
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        final x10.lang.IllegalOperationException t$75191 = ((x10.lang.IllegalOperationException)(new x10.lang.IllegalOperationException(t$75190)));
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        throw t$75191;
    }
    
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    public boolean isEmpty$O() {
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        final long t$75192 = max0;
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        final long t$75193 = min0;
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        boolean t$75196 = ((t$75192) < (((long)(t$75193))));
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        if (!(t$75196)) {
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            final long t$75194 = max1;
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            final long t$75195 = min1;
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            t$75196 = ((t$75194) < (((long)(t$75195))));
        }
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        final boolean t$75197 = t$75196;
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        return t$75197;
    }
    
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    public x10.lang.Iterator iterator() {
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        final x10.array.DenseIterationSpace_2.DIS2_It alloc$72284 = ((x10.array.DenseIterationSpace_2.DIS2_It)(new x10.array.DenseIterationSpace_2.DIS2_It((java.lang.System[]) null)));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        alloc$72284.x10$array$DenseIterationSpace_2$DIS2_It$$init$S(this);
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        return alloc$72284;
    }
    
    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    @x10.runtime.impl.java.X10Generated
    public static class DIS2_It extends x10.core.Ref implements x10.lang.Iterator, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<DIS2_It> $RTT = 
            x10.rtt.NamedType.<DIS2_It> make("x10.array.DenseIterationSpace_2.DIS2_It",
                                             DIS2_It.class,
                                             new x10.rtt.Type[] {
                                                 x10.rtt.ParameterizedType.make(x10.lang.Iterator.$RTT, x10.lang.Point.$RTT)
                                             });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.DenseIterationSpace_2.DIS2_It $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.cur0 = $deserializer.readLong();
            $_obj.cur1 = $deserializer.readLong();
            $_obj.out$ = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.array.DenseIterationSpace_2.DIS2_It $_obj = new x10.array.DenseIterationSpace_2.DIS2_It((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.cur0);
            $serializer.write(this.cur1);
            $serializer.write(this.out$);
            
        }
        
        // constructor just for allocation
        public DIS2_It(final java.lang.System[] $dummy) {
            
        }
        
        // bridge for method abstract public x10.lang.Iterator[T].next(){}:T
        public x10.lang.Point next$G() {
            return next();
        }
        
        
    
        
        //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        public x10.array.DenseIterationSpace_2 out$;
        
        //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        public long cur0;
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        public long cur1;
        
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        // creation method for java code (1-phase java constructor)
        public DIS2_It(final x10.array.DenseIterationSpace_2 out$) {
            this((java.lang.System[]) null);
            x10$array$DenseIterationSpace_2$DIS2_It$$init$S(out$);
        }
        
        // constructor for non-virtual call
        final public x10.array.DenseIterationSpace_2.DIS2_It x10$array$DenseIterationSpace_2$DIS2_It$$init$S(final x10.array.DenseIterationSpace_2 out$) {
             {
                
                //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
                this.out$ = out$;
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
                
                
                //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
                final x10.array.DenseIterationSpace_2.DIS2_It this$75222 = this;
                
                //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
                this$75222.cur0 = 0L;
                
                //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
                this$75222.cur1 = 0L;
                
                //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
                final x10.array.DenseIterationSpace_2 t$75198 = this.out$;
                
                //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
                final long t$75199 = t$75198.min0;
                
                //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
                this.cur0 = t$75199;
                
                //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
                final x10.array.DenseIterationSpace_2 t$75200 = this.out$;
                
                //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
                final long t$75201 = t$75200.min1;
                
                //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
                this.cur1 = t$75201;
            }
            return this;
        }
        
        
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        public boolean hasNext$O() {
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            final long t$75203 = cur0;
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            final x10.array.DenseIterationSpace_2 t$75202 = this.out$;
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            final long t$75204 = t$75202.max0;
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            boolean t$75208 = ((t$75203) <= (((long)(t$75204))));
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            if (t$75208) {
                
                //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
                final long t$75206 = cur1;
                
                //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
                final x10.array.DenseIterationSpace_2 t$75205 = this.out$;
                
                //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
                final long t$75207 = t$75205.max1;
                
                //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
                t$75208 = ((t$75206) <= (((long)(t$75207))));
            }
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            final boolean t$75209 = t$75208;
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            return t$75209;
        }
        
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        public x10.lang.Point next() {
            
            //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long i$75177 = cur0;
            
            //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long i$75178 = cur1;
            
            //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final x10.lang.Point alloc$75179 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
            
            //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            alloc$75179.x10$lang$Point$$init$S(((long)(i$75177)), ((long)(i$75178)));
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            final x10.lang.Point p = ((x10.lang.Point)(alloc$75179));
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            final long t$75210 = this.cur1;
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            final long t$75211 = ((t$75210) + (((long)(1L))));
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            this.cur1 = t$75211;
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            final long t$75213 = cur1;
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            final x10.array.DenseIterationSpace_2 t$75212 = this.out$;
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            final long t$75214 = t$75212.max1;
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            final boolean t$75219 = ((t$75213) > (((long)(t$75214))));
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            if (t$75219) {
                
                //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
                final x10.array.DenseIterationSpace_2 t$75215 = this.out$;
                
                //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
                final long t$75216 = t$75215.min1;
                
                //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
                this.cur1 = t$75216;
                
                //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
                final long t$75217 = this.cur0;
                
                //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
                final long t$75218 = ((t$75217) + (((long)(1L))));
                
                //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
                this.cur0 = t$75218;
            }
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            return p;
        }
        
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        final public x10.array.DenseIterationSpace_2.DIS2_It x10$array$DenseIterationSpace_2$DIS2_It$$this$x10$array$DenseIterationSpace_2$DIS2_It() {
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            return x10.array.DenseIterationSpace_2.DIS2_It.this;
        }
        
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        final public x10.array.DenseIterationSpace_2 x10$array$DenseIterationSpace_2$DIS2_It$$this$x10$array$DenseIterationSpace_2() {
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            final x10.array.DenseIterationSpace_2 t$75220 = this.out$;
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            return t$75220;
        }
        
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        final public void __fieldInitializers_x10_array_DenseIterationSpace_2_DIS2_It() {
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            this.cur0 = 0L;
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
            this.cur1 = 0L;
        }
    }
    
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    final public x10.array.DenseIterationSpace_2 x10$array$DenseIterationSpace_2$$this$x10$array$DenseIterationSpace_2() {
        
        //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        return x10.array.DenseIterationSpace_2.this;
    }
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    final public void __fieldInitializers_x10_array_DenseIterationSpace_2() {
        
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$EMPTY = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$EMPTY;
    
    public static x10.array.DenseIterationSpace_2 get$EMPTY() {
        if (((int) x10.array.DenseIterationSpace_2.initStatus$EMPTY.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.array.DenseIterationSpace_2.EMPTY;
        }
        if (((int) x10.array.DenseIterationSpace_2.initStatus$EMPTY.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.array.DenseIterationSpace_2.exception$EMPTY;
        }
        if (x10.array.DenseIterationSpace_2.initStatus$EMPTY.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.array.DenseIterationSpace_2.EMPTY = ((x10.array.DenseIterationSpace_2)(new x10.array.DenseIterationSpace_2((java.lang.System[]) null).x10$array$DenseIterationSpace_2$$init$S(((long)(0L)), ((long)(0L)), ((long)(-1L)), ((long)(-1L)))));
            }}catch (java.lang.Throwable exc$75223) {
                x10.array.DenseIterationSpace_2.exception$EMPTY = new x10.lang.ExceptionInInitializer(exc$75223);
                x10.array.DenseIterationSpace_2.initStatus$EMPTY.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.array.DenseIterationSpace_2.exception$EMPTY;
            }
            x10.array.DenseIterationSpace_2.initStatus$EMPTY.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.array.DenseIterationSpace_2.initStatus$EMPTY.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.array.DenseIterationSpace_2.initStatus$EMPTY.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.array.DenseIterationSpace_2.initStatus$EMPTY.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.array.DenseIterationSpace_2.exception$EMPTY;
                }
            }
        }
        return x10.array.DenseIterationSpace_2.EMPTY;
    }
}

