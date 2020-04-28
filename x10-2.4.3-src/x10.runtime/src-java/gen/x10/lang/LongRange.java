package x10.lang;

@x10.runtime.impl.java.X10Generated
public class LongRange extends x10.core.Struct implements x10.lang.Iterable, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<LongRange> $RTT = 
        x10.rtt.NamedStructType.<LongRange> make("x10.lang.LongRange",
                                                 LongRange.class,
                                                 new x10.rtt.Type[] {
                                                     x10.rtt.ParameterizedType.make(x10.lang.Iterable.$RTT, x10.rtt.Types.LONG),
                                                     x10.rtt.Types.STRUCT
                                                 });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.LongRange $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.min = $deserializer.readLong();
        $_obj.max = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.LongRange $_obj = new x10.lang.LongRange((java.lang.System[]) null);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.min);
        $serializer.write(this.max);
        
    }
    
    // zero value constructor
    public LongRange(final java.lang.System $dummy) { this.min = 0L; this.max = 0L; }
    
    // constructor just for allocation
    public LongRange(final java.lang.System[] $dummy) {
        
    }
    
    
    // properties
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
    public long min;
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
    public long max;
    

    
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
    // creation method for java code (1-phase java constructor)
    public LongRange(final long min, final long max) {
        this((java.lang.System[]) null);
        x10$lang$LongRange$$init$S(min, max);
    }
    
    // constructor for non-virtual call
    final public x10.lang.LongRange x10$lang$LongRange$$init$S(final long min, final long max) {
         {
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
            this.min = min;
            this.max = max;
            
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
            final x10.lang.LongRange this$110297 = this;
        }
        return this;
    }
    
    
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
    final public static x10.lang.LongRange $implicit_convert(final x10.lang.IntRange x) {
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final x10.lang.LongRange alloc$110295 = ((x10.lang.LongRange)(new x10.lang.LongRange((java.lang.System[]) null)));
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final int t$110313 = x.min;
        
        //#line 34 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final long min$110300 = ((long)(((int)(t$110313))));
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final int t$110314 = x.max;
        
        //#line 34 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final long max$110301 = ((long)(((int)(t$110314))));
        
        //#line 35 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        alloc$110295.min = min$110300;
        
        //#line 35 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        alloc$110295.max = max$110301;
        {
            
        }
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        return alloc$110295;
    }
    
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
    final public java.lang.String toString() {
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final long t$110315 = min;
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final java.lang.String t$110316 = (((x10.core.Long.$box(t$110315))) + (".."));
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final long t$110317 = max;
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final java.lang.String t$110318 = ((t$110316) + ((x10.core.Long.$box(t$110317))));
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        return t$110318;
    }
    
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
    final public boolean equals(final java.lang.Object that) {
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final boolean t$110325 = x10.lang.LongRange.$RTT.isInstance(that);
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        if (t$110325) {
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
            final x10.lang.LongRange other = ((x10.lang.LongRange)(((x10.lang.LongRange)x10.rtt.Types.asStruct(x10.lang.LongRange.$RTT,that))));
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
            final long t$110319 = min;
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
            final long t$110320 = other.min;
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
            boolean t$110323 = ((long) t$110319) == ((long) t$110320);
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
            if (t$110323) {
                
                //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
                final long t$110321 = max;
                
                //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
                final long t$110322 = other.max;
                
                //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
                t$110323 = ((long) t$110321) == ((long) t$110322);
            }
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
            final boolean t$110324 = t$110323;
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
            return t$110324;
        }
        
        //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        return false;
    }
    
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
    final public int hashCode() {
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final long t$110326 = max;
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final long t$110327 = min;
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final long t$110328 = ((t$110326) - (((long)(t$110327))));
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final int t$110329 = x10.rtt.Types.hashCode(t$110328);
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        return t$110329;
    }
    
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
    final public x10.lang.Iterator iterator() {
        
        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final x10.lang.LongRange.LongRangeIt alloc$110296 = ((x10.lang.LongRange.LongRangeIt)(new x10.lang.LongRange.LongRangeIt((java.lang.System[]) null)));
        
        //#line 64 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final long min$110305 = min;
        
        //#line 64 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final long max$110306 = max;
        
        //#line 61 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        alloc$110296.cur = 0L;
        
        //#line 65 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        alloc$110296.cur = min$110305;
        
        //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        alloc$110296.max = max$110306;
        
        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        return alloc$110296;
    }
    
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
    @x10.runtime.impl.java.X10Generated
    public static class LongRangeIt extends x10.core.Ref implements x10.lang.Iterator, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<LongRangeIt> $RTT = 
            x10.rtt.NamedType.<LongRangeIt> make("x10.lang.LongRange.LongRangeIt",
                                                 LongRangeIt.class,
                                                 new x10.rtt.Type[] {
                                                     x10.rtt.ParameterizedType.make(x10.lang.Iterator.$RTT, x10.rtt.Types.LONG)
                                                 });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.LongRange.LongRangeIt $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.cur = $deserializer.readLong();
            $_obj.max = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.LongRange.LongRangeIt $_obj = new x10.lang.LongRange.LongRangeIt((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.cur);
            $serializer.write(this.max);
            
        }
        
        // constructor just for allocation
        public LongRangeIt(final java.lang.System[] $dummy) {
            
        }
        
        // bridge for method abstract public x10.lang.Iterator[T].next(){}:T
        public x10.core.Long next$G() {
            return x10.core.Long.$box(next$O());
        }
        
        
    
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        public long cur;
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        public long max;
        
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        // creation method for java code (1-phase java constructor)
        public LongRangeIt(final long min, final long max) {
            this((java.lang.System[]) null);
            x10$lang$LongRange$LongRangeIt$$init$S(min, max);
        }
        
        // constructor for non-virtual call
        final public x10.lang.LongRange.LongRangeIt x10$lang$LongRange$LongRangeIt$$init$S(final long min, final long max) {
             {
                
                //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
                
                
                //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
                final x10.lang.LongRange.LongRangeIt this$110351 = this;
                
                //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
                this$110351.cur = 0L;
                
                //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
                this.cur = min;
                
                //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
                this.max = max;
            }
            return this;
        }
        
        
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        public boolean hasNext$O() {
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
            final long t$110330 = cur;
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
            final long t$110331 = max;
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
            final boolean t$110332 = ((t$110330) <= (((long)(t$110331))));
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
            return t$110332;
        }
        
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        public long next$O() {
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
            final long t$110333 = this.cur;
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
            final long t$110334 = ((t$110333) + (((long)(1L))));
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
            final long t$110335 = this.cur = t$110334;
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
            final long t$110336 = ((t$110335) - (((long)(1L))));
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
            return t$110336;
        }
        
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final public x10.lang.LongRange.LongRangeIt x10$lang$LongRange$LongRangeIt$$this$x10$lang$LongRange$LongRangeIt() {
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
            return x10.lang.LongRange.LongRangeIt.this;
        }
        
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final public void __fieldInitializers_x10_lang_LongRange_LongRangeIt() {
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
            this.cur = 0L;
        }
    }
    
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
    final public java.lang.String typeName() {
        try {
            return x10.rtt.Types.typeName(this);
        }
        catch (java.lang.Throwable exc$146355) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146355);
        }
        
    }
    
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
    final public boolean _struct_equals$O(java.lang.Object other) {
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final java.lang.Object t$110337 = ((java.lang.Object)(other));
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final boolean t$110338 = x10.lang.LongRange.$RTT.isInstance(t$110337);
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final boolean t$110339 = !(t$110338);
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        if (t$110339) {
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
            return false;
        }
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final java.lang.Object t$110340 = ((java.lang.Object)(other));
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final x10.lang.LongRange t$110341 = ((x10.lang.LongRange)x10.rtt.Types.asStruct(x10.lang.LongRange.$RTT,t$110340));
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final boolean t$110342 = this._struct_equals$O(((x10.lang.LongRange)(t$110341)));
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        return t$110342;
    }
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
    final public boolean _struct_equals$O(x10.lang.LongRange other) {
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final long t$110344 = this.min;
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final x10.lang.LongRange t$110343 = ((x10.lang.LongRange)(other));
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final long t$110345 = t$110343.min;
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        boolean t$110349 = ((long) t$110344) == ((long) t$110345);
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        if (t$110349) {
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
            final long t$110347 = this.max;
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
            final x10.lang.LongRange t$110346 = ((x10.lang.LongRange)(other));
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
            final long t$110348 = t$110346.max;
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
            t$110349 = ((long) t$110347) == ((long) t$110348);
        }
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        final boolean t$110350 = t$110349;
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        return t$110350;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
    final public x10.lang.LongRange x10$lang$LongRange$$this$x10$lang$LongRange() {
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        return x10.lang.LongRange.this;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
    final public void __fieldInitializers_x10_lang_LongRange() {
        
    }
}

