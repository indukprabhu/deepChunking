package x10.array;

@x10.runtime.impl.java.X10Generated
final public class DenseIterationSpace_1 extends x10.array.IterationSpace implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<DenseIterationSpace_1> $RTT = 
        x10.rtt.NamedType.<DenseIterationSpace_1> make("x10.array.DenseIterationSpace_1",
                                                       DenseIterationSpace_1.class,
                                                       new x10.rtt.Type[] {
                                                           x10.array.IterationSpace.$RTT
                                                       });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.DenseIterationSpace_1 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.array.IterationSpace.$_deserialize_body($_obj, $deserializer);
        $_obj.min = $deserializer.readLong();
        $_obj.max = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.array.DenseIterationSpace_1 $_obj = new x10.array.DenseIterationSpace_1((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.min);
        $serializer.write(this.max);
        
    }
    
    // constructor just for allocation
    public DenseIterationSpace_1(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    public long min;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    public long max;
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    private static x10.array.DenseIterationSpace_1 EMPTY;
    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    // creation method for java code (1-phase java constructor)
    public DenseIterationSpace_1(final long min, final long max) {
        this((java.lang.System[]) null);
        x10$array$DenseIterationSpace_1$$init$S(min, max);
    }
    
    // constructor for non-virtual call
    final public x10.array.DenseIterationSpace_1 x10$array$DenseIterationSpace_1$$init$S(final long min, final long max) {
         {
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
            final x10.array.IterationSpace this$75128 = ((x10.array.IterationSpace)(this));
            
            //#line 22 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
            this$75128.rank = 1L;
            
            //#line 22 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
            this$75128.rect = true;
            {
                
            }
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
            
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
            final x10.array.DenseIterationSpace_1 this$75162 = this;
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
            this.min = min;
            
            //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
            this.max = max;
        }
        return this;
    }
    
    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    public long min$O(final long i) {
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        final boolean t$75147 = ((long) i) != ((long) 0L);
        
        //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        if (t$75147) {
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
            final java.lang.String t$75145 = (((x10.core.Long.$box(i))) + (" is not a valid rank"));
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
            final x10.lang.IllegalOperationException t$75146 = ((x10.lang.IllegalOperationException)(new x10.lang.IllegalOperationException(t$75145)));
            
            //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
            throw t$75146;
        }
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        final long t$75148 = min;
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        return t$75148;
    }
    
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    public long max$O(final long i) {
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        final boolean t$75151 = ((long) i) != ((long) 0L);
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        if (t$75151) {
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
            final java.lang.String t$75149 = (((x10.core.Long.$box(i))) + (" is not a valid rank"));
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
            final x10.lang.IllegalOperationException t$75150 = ((x10.lang.IllegalOperationException)(new x10.lang.IllegalOperationException(t$75149)));
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
            throw t$75150;
        }
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        final long t$75152 = max;
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        return t$75152;
    }
    
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    public boolean isEmpty$O() {
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        final long t$75153 = max;
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        final long t$75154 = min;
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        final boolean t$75155 = ((t$75153) < (((long)(t$75154))));
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        return t$75155;
    }
    
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    public x10.lang.Iterator iterator() {
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        final x10.array.DenseIterationSpace_1.DIS_1_It alloc$71002 = ((x10.array.DenseIterationSpace_1.DIS_1_It)(new x10.array.DenseIterationSpace_1.DIS_1_It((java.lang.System[]) null)));
        
        //#line 49 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        final long min$75135 = min;
        
        //#line 49 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        final long max$75136 = max;
        
        //#line 45 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        alloc$71002.cur = 0L;
        
        //#line 50 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        alloc$71002.cur = min$75135;
        
        //#line 51 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        alloc$71002.last = max$75136;
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        return alloc$71002;
    }
    
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    @x10.runtime.impl.java.X10Generated
    public static class DIS_1_It extends x10.core.Ref implements x10.lang.Iterator, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<DIS_1_It> $RTT = 
            x10.rtt.NamedType.<DIS_1_It> make("x10.array.DenseIterationSpace_1.DIS_1_It",
                                              DIS_1_It.class,
                                              new x10.rtt.Type[] {
                                                  x10.rtt.ParameterizedType.make(x10.lang.Iterator.$RTT, x10.lang.Point.$RTT)
                                              });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.DenseIterationSpace_1.DIS_1_It $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.cur = $deserializer.readLong();
            $_obj.last = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.array.DenseIterationSpace_1.DIS_1_It $_obj = new x10.array.DenseIterationSpace_1.DIS_1_It((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.cur);
            $serializer.write(this.last);
            
        }
        
        // constructor just for allocation
        public DIS_1_It(final java.lang.System[] $dummy) {
            
        }
        
        // bridge for method abstract public x10.lang.Iterator[T].next(){}:T
        public x10.lang.Point next$G() {
            return next();
        }
        
        
    
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        public long cur;
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        public long last;
        
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        // creation method for java code (1-phase java constructor)
        public DIS_1_It(final long min, final long max) {
            this((java.lang.System[]) null);
            x10$array$DenseIterationSpace_1$DIS_1_It$$init$S(min, max);
        }
        
        // constructor for non-virtual call
        final public x10.array.DenseIterationSpace_1.DIS_1_It x10$array$DenseIterationSpace_1$DIS_1_It$$init$S(final long min, final long max) {
             {
                
                //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
                
                
                //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
                final x10.array.DenseIterationSpace_1.DIS_1_It this$75163 = this;
                
                //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
                this$75163.cur = 0L;
                
                //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
                this.cur = min;
                
                //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
                this.last = max;
            }
            return this;
        }
        
        
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        public boolean hasNext$O() {
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
            final long t$75156 = cur;
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
            final long t$75157 = last;
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
            final boolean t$75158 = ((t$75156) <= (((long)(t$75157))));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
            return t$75158;
        }
        
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        public x10.lang.Point next() {
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
            final long t$75159 = this.cur;
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
            final long t$75160 = ((t$75159) + (((long)(1L))));
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
            final long t$75161 = this.cur = t$75160;
            
            //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final long i$75143 = ((t$75161) - (((long)(1L))));
            
            //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            final x10.lang.Point alloc$75144 = ((x10.lang.Point)(new x10.lang.Point((java.lang.System[]) null)));
            
            //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            alloc$75144.x10$lang$Point$$init$S(((long)(i$75143)));
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
            return alloc$75144;
        }
        
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        final public x10.array.DenseIterationSpace_1.DIS_1_It x10$array$DenseIterationSpace_1$DIS_1_It$$this$x10$array$DenseIterationSpace_1$DIS_1_It() {
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
            return x10.array.DenseIterationSpace_1.DIS_1_It.this;
        }
        
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        final public void __fieldInitializers_x10_array_DenseIterationSpace_1_DIS_1_It() {
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
            this.cur = 0L;
        }
    }
    
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    final public x10.array.DenseIterationSpace_1 x10$array$DenseIterationSpace_1$$this$x10$array$DenseIterationSpace_1() {
        
        //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
        return x10.array.DenseIterationSpace_1.this;
    }
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    final public void __fieldInitializers_x10_array_DenseIterationSpace_1() {
        
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$EMPTY = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$EMPTY;
    
    public static x10.array.DenseIterationSpace_1 get$EMPTY() {
        if (((int) x10.array.DenseIterationSpace_1.initStatus$EMPTY.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.array.DenseIterationSpace_1.EMPTY;
        }
        if (((int) x10.array.DenseIterationSpace_1.initStatus$EMPTY.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.array.DenseIterationSpace_1.exception$EMPTY;
        }
        if (x10.array.DenseIterationSpace_1.initStatus$EMPTY.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.array.DenseIterationSpace_1.EMPTY = ((x10.array.DenseIterationSpace_1)(new x10.array.DenseIterationSpace_1((java.lang.System[]) null).x10$array$DenseIterationSpace_1$$init$S(((long)(0L)), ((long)(-1L)))));
            }}catch (java.lang.Throwable exc$75164) {
                x10.array.DenseIterationSpace_1.exception$EMPTY = new x10.lang.ExceptionInInitializer(exc$75164);
                x10.array.DenseIterationSpace_1.initStatus$EMPTY.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.array.DenseIterationSpace_1.exception$EMPTY;
            }
            x10.array.DenseIterationSpace_1.initStatus$EMPTY.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.array.DenseIterationSpace_1.initStatus$EMPTY.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.array.DenseIterationSpace_1.initStatus$EMPTY.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.array.DenseIterationSpace_1.initStatus$EMPTY.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.array.DenseIterationSpace_1.exception$EMPTY;
                }
            }
        }
        return x10.array.DenseIterationSpace_1.EMPTY;
    }
}

