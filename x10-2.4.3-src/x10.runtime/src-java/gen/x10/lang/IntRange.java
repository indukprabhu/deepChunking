package x10.lang;

@x10.runtime.impl.java.X10Generated
public class IntRange extends x10.core.Struct implements x10.lang.Iterable, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<IntRange> $RTT = 
        x10.rtt.NamedStructType.<IntRange> make("x10.lang.IntRange",
                                                IntRange.class,
                                                new x10.rtt.Type[] {
                                                    x10.rtt.ParameterizedType.make(x10.lang.Iterable.$RTT, x10.rtt.Types.INT),
                                                    x10.rtt.Types.STRUCT
                                                });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.IntRange $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.min = $deserializer.readInt();
        $_obj.max = $deserializer.readInt();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.IntRange $_obj = new x10.lang.IntRange((java.lang.System[]) null);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.min);
        $serializer.write(this.max);
        
    }
    
    // zero value constructor
    public IntRange(final java.lang.System $dummy) { this.min = 0; this.max = 0; }
    
    // constructor just for allocation
    public IntRange(final java.lang.System[] $dummy) {
        
    }
    
    
    // properties
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
    public int min;
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
    public int max;
    

    
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
    // creation method for java code (1-phase java constructor)
    public IntRange(final int min, final int max) {
        this((java.lang.System[]) null);
        x10$lang$IntRange$$init$S(min, max);
    }
    
    // constructor for non-virtual call
    final public x10.lang.IntRange x10$lang$IntRange$$init$S(final int min, final int max) {
         {
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
            this.min = min;
            this.max = max;
            
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
            final x10.lang.IntRange this$110194 = this;
        }
        return this;
    }
    
    
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
    final public static x10.lang.IntRange $convert(final x10.lang.LongRange x) {
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final x10.lang.IntRange alloc$110192 = ((x10.lang.IntRange)(new x10.lang.IntRange((java.lang.System[]) null)));
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final long t$110210 = x.min;
        
        //#line 34 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final int min$110197 = ((int)(long)(((long)(t$110210))));
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final long t$110211 = x.max;
        
        //#line 34 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final int max$110198 = ((int)(long)(((long)(t$110211))));
        
        //#line 35 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        alloc$110192.min = min$110197;
        
        //#line 35 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        alloc$110192.max = max$110198;
        {
            
        }
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        return alloc$110192;
    }
    
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
    final public java.lang.String toString() {
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final int t$110212 = min;
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final java.lang.String t$110213 = (((x10.core.Int.$box(t$110212))) + (".."));
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final int t$110214 = max;
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final java.lang.String t$110215 = ((t$110213) + ((x10.core.Int.$box(t$110214))));
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        return t$110215;
    }
    
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
    final public boolean equals(final java.lang.Object that) {
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final boolean t$110222 = x10.lang.IntRange.$RTT.isInstance(that);
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        if (t$110222) {
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
            final x10.lang.IntRange other = ((x10.lang.IntRange)(((x10.lang.IntRange)x10.rtt.Types.asStruct(x10.lang.IntRange.$RTT,that))));
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
            final int t$110216 = min;
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
            final int t$110217 = other.min;
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
            boolean t$110220 = ((int) t$110216) == ((int) t$110217);
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
            if (t$110220) {
                
                //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
                final int t$110218 = max;
                
                //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
                final int t$110219 = other.max;
                
                //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
                t$110220 = ((int) t$110218) == ((int) t$110219);
            }
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
            final boolean t$110221 = t$110220;
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
            return t$110221;
        }
        
        //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        return false;
    }
    
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
    final public int hashCode() {
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final int t$110223 = max;
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final int t$110224 = min;
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final int t$110225 = ((t$110223) - (((int)(t$110224))));
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final int t$110226 = x10.rtt.Types.hashCode(t$110225);
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        return t$110226;
    }
    
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
    final public x10.lang.Iterator iterator() {
        
        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final x10.lang.IntRange.IntRangeIt alloc$110193 = ((x10.lang.IntRange.IntRangeIt)(new x10.lang.IntRange.IntRangeIt((java.lang.System[]) null)));
        
        //#line 64 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final int min$110202 = min;
        
        //#line 64 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final int max$110203 = max;
        
        //#line 61 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        alloc$110193.cur = 0;
        
        //#line 65 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        alloc$110193.cur = min$110202;
        
        //#line 66 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        alloc$110193.max = max$110203;
        
        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        return alloc$110193;
    }
    
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
    @x10.runtime.impl.java.X10Generated
    public static class IntRangeIt extends x10.core.Ref implements x10.lang.Iterator, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<IntRangeIt> $RTT = 
            x10.rtt.NamedType.<IntRangeIt> make("x10.lang.IntRange.IntRangeIt",
                                                IntRangeIt.class,
                                                new x10.rtt.Type[] {
                                                    x10.rtt.ParameterizedType.make(x10.lang.Iterator.$RTT, x10.rtt.Types.INT)
                                                });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.IntRange.IntRangeIt $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.cur = $deserializer.readInt();
            $_obj.max = $deserializer.readInt();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.IntRange.IntRangeIt $_obj = new x10.lang.IntRange.IntRangeIt((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.cur);
            $serializer.write(this.max);
            
        }
        
        // constructor just for allocation
        public IntRangeIt(final java.lang.System[] $dummy) {
            
        }
        
        // bridge for method abstract public x10.lang.Iterator[T].next(){}:T
        public x10.core.Int next$G() {
            return x10.core.Int.$box(next$O());
        }
        
        
    
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        public int cur;
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        public int max;
        
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        // creation method for java code (1-phase java constructor)
        public IntRangeIt(final int min, final int max) {
            this((java.lang.System[]) null);
            x10$lang$IntRange$IntRangeIt$$init$S(min, max);
        }
        
        // constructor for non-virtual call
        final public x10.lang.IntRange.IntRangeIt x10$lang$IntRange$IntRangeIt$$init$S(final int min, final int max) {
             {
                
                //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
                
                
                //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
                final x10.lang.IntRange.IntRangeIt this$110248 = this;
                
                //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
                this$110248.cur = 0;
                
                //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
                this.cur = min;
                
                //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
                this.max = max;
            }
            return this;
        }
        
        
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        public boolean hasNext$O() {
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
            final int t$110227 = cur;
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
            final int t$110228 = max;
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
            final boolean t$110229 = ((t$110227) <= (((int)(t$110228))));
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
            return t$110229;
        }
        
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        public int next$O() {
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
            final int t$110230 = this.cur;
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
            final int t$110231 = ((t$110230) + (((int)(1))));
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
            final int t$110232 = this.cur = t$110231;
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
            final int t$110233 = ((t$110232) - (((int)(1))));
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
            return t$110233;
        }
        
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final public x10.lang.IntRange.IntRangeIt x10$lang$IntRange$IntRangeIt$$this$x10$lang$IntRange$IntRangeIt() {
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
            return x10.lang.IntRange.IntRangeIt.this;
        }
        
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final public void __fieldInitializers_x10_lang_IntRange_IntRangeIt() {
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
            this.cur = 0;
        }
    }
    
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
    final public java.lang.String typeName() {
        try {
            return x10.rtt.Types.typeName(this);
        }
        catch (java.lang.Throwable exc$146354) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146354);
        }
        
    }
    
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
    final public boolean _struct_equals$O(java.lang.Object other) {
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final java.lang.Object t$110234 = ((java.lang.Object)(other));
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final boolean t$110235 = x10.lang.IntRange.$RTT.isInstance(t$110234);
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final boolean t$110236 = !(t$110235);
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        if (t$110236) {
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
            return false;
        }
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final java.lang.Object t$110237 = ((java.lang.Object)(other));
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final x10.lang.IntRange t$110238 = ((x10.lang.IntRange)x10.rtt.Types.asStruct(x10.lang.IntRange.$RTT,t$110237));
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final boolean t$110239 = this._struct_equals$O(((x10.lang.IntRange)(t$110238)));
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        return t$110239;
    }
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
    final public boolean _struct_equals$O(x10.lang.IntRange other) {
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final int t$110241 = this.min;
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final x10.lang.IntRange t$110240 = ((x10.lang.IntRange)(other));
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final int t$110242 = t$110240.min;
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        boolean t$110246 = ((int) t$110241) == ((int) t$110242);
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        if (t$110246) {
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
            final int t$110244 = this.max;
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
            final x10.lang.IntRange t$110243 = ((x10.lang.IntRange)(other));
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
            final int t$110245 = t$110243.max;
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
            t$110246 = ((int) t$110244) == ((int) t$110245);
        }
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        final boolean t$110247 = t$110246;
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        return t$110247;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
    final public x10.lang.IntRange x10$lang$IntRange$$this$x10$lang$IntRange() {
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        return x10.lang.IntRange.this;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
    final public void __fieldInitializers_x10_lang_IntRange() {
        
    }
}

