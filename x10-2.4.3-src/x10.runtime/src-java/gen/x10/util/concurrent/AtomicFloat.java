package x10.util.concurrent;

@x10.runtime.impl.java.X10Generated
final public class AtomicFloat extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<AtomicFloat> $RTT = 
        x10.rtt.NamedType.<AtomicFloat> make("x10.util.concurrent.AtomicFloat",
                                             AtomicFloat.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.concurrent.AtomicFloat $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.v = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.concurrent.AtomicFloat $_obj = new x10.util.concurrent.AtomicFloat((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.v);
        
    }
    
    // constructor just for allocation
    public AtomicFloat(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    public x10.core.concurrent.AtomicInteger v;
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    // creation method for java code (1-phase java constructor)
    public AtomicFloat() {
        this((java.lang.System[]) null);
        x10$util$concurrent$AtomicFloat$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.util.concurrent.AtomicFloat x10$util$concurrent$AtomicFloat$$init$S() {
         {
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
            
            
            //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
            final x10.util.concurrent.AtomicFloat this$145418 = this;
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
            final int t$145381 = java.lang.Float.floatToRawIntBits(0.0F);
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
            final x10.core.concurrent.AtomicInteger t$145382 = ((x10.core.concurrent.AtomicInteger)(new x10.core.concurrent.AtomicInteger(t$145381)));
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
            this.v = ((x10.core.concurrent.AtomicInteger)(t$145382));
        }
        return this;
    }
    
    
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    // creation method for java code (1-phase java constructor)
    public AtomicFloat(final float v) {
        this((java.lang.System[]) null);
        x10$util$concurrent$AtomicFloat$$init$S(v);
    }
    
    // constructor for non-virtual call
    final public x10.util.concurrent.AtomicFloat x10$util$concurrent$AtomicFloat$$init$S(final float v) {
         {
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
            
            
            //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
            final x10.util.concurrent.AtomicFloat this$145419 = this;
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
            final int t$145383 = java.lang.Float.floatToRawIntBits(v);
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
            final x10.core.concurrent.AtomicInteger t$145384 = ((x10.core.concurrent.AtomicInteger)(new x10.core.concurrent.AtomicInteger(t$145383)));
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
            this.v = ((x10.core.concurrent.AtomicInteger)(t$145384));
        }
        return this;
    }
    
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    public float get() {
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final x10.core.concurrent.AtomicInteger t$145385 = ((x10.core.concurrent.AtomicInteger)(v));
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final int t$145386 = t$145385.get();
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final float t$145387 = java.lang.Float.intBitsToFloat(((int)(t$145386)));
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        return t$145387;
    }
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    public void set(final float v) {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final x10.core.concurrent.AtomicInteger t$145388 = ((x10.core.concurrent.AtomicInteger)(this.v));
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final int t$145389 = java.lang.Float.floatToRawIntBits(v);
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        t$145388.set(((int)(t$145389)));
    }
    
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    public boolean compareAndSet(final float expect, final float update) {
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final int exp = java.lang.Float.floatToRawIntBits(expect);
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final int upd = java.lang.Float.floatToRawIntBits(update);
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final x10.core.concurrent.AtomicInteger t$145390 = ((x10.core.concurrent.AtomicInteger)(v));
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final boolean t$145391 = t$145390.compareAndSet(((int)(exp)),((int)(upd)));
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        return t$145391;
    }
    
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    public boolean weakCompareAndSet(final float expect, final float update) {
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final int exp = java.lang.Float.floatToRawIntBits(expect);
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final int upd = java.lang.Float.floatToRawIntBits(update);
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final x10.core.concurrent.AtomicInteger t$145392 = ((x10.core.concurrent.AtomicInteger)(v));
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final boolean t$145393 = t$145392.weakCompareAndSet(((int)(exp)),((int)(upd)));
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        return t$145393;
    }
    
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    public float getAndIncrement() {
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final float t$145394 = ((float)(long)(((long)(1L))));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final float t$145395 = this.getAndAdd((float)(t$145394));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        return t$145395;
    }
    
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    public float getAndDecrement() {
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final float t$145396 = ((float)(long)(((long)(-1L))));
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final float t$145397 = this.getAndAdd((float)(t$145396));
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        return t$145397;
    }
    
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    public float getAndAdd(final float delta) {
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        do  {
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
            final x10.core.concurrent.AtomicInteger t$145398 = ((x10.core.concurrent.AtomicInteger)(v));
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
            final int exp = t$145398.get();
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
            final float expect = java.lang.Float.intBitsToFloat(((int)(exp)));
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
            final float update = ((expect) + (((float)(delta))));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
            final int upd = java.lang.Float.floatToRawIntBits(update);
            
            //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
            final x10.core.concurrent.AtomicInteger t$145399 = ((x10.core.concurrent.AtomicInteger)(v));
            
            //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
            final boolean t$145400 = t$145399.weakCompareAndSet(((int)(exp)),((int)(upd)));
            
            //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
            if (t$145400) {
                
                //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
                return expect;
            }
        }while(true); 
    }
    
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    public float incrementAndGet() {
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final float t$145401 = ((float)(long)(((long)(1L))));
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final float t$145402 = this.addAndGet((float)(t$145401));
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        return t$145402;
    }
    
    
    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    public float decrementAndGet() {
        
        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final float t$145403 = ((float)(long)(((long)(-1L))));
        
        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final float t$145404 = this.addAndGet((float)(t$145403));
        
        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        return t$145404;
    }
    
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    public float addAndGet(final float delta) {
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        do  {
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
            final x10.core.concurrent.AtomicInteger t$145405 = ((x10.core.concurrent.AtomicInteger)(v));
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
            final int exp = t$145405.get();
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
            final float expect = java.lang.Float.intBitsToFloat(((int)(exp)));
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
            final float update = ((expect) + (((float)(delta))));
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
            final int upd = java.lang.Float.floatToRawIntBits(update);
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
            final x10.core.concurrent.AtomicInteger t$145406 = ((x10.core.concurrent.AtomicInteger)(v));
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
            final boolean t$145407 = t$145406.weakCompareAndSet(((int)(exp)),((int)(upd)));
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
            if (t$145407) {
                
                //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
                return update;
            }
        }while(true); 
    }
    
    
    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    public java.lang.String toString() {
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final float t$145408 = this.get();
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final java.lang.String t$145409 = java.lang.Float.toString(t$145408);
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        return t$145409;
    }
    
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    public int intValue() {
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final float t$145410 = this.get();
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final int t$145411 = ((int)(float)(((float)(t$145410))));
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        return t$145411;
    }
    
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    public long longValue() {
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final float t$145412 = this.get();
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final long t$145413 = ((long)(float)(((float)(t$145412))));
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        return t$145413;
    }
    
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    public float floatValue() {
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final float t$145414 = this.get();
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final float t$145415 = t$145414;
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        return t$145415;
    }
    
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    public double doubleValue() {
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final float t$145416 = this.get();
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        final double t$145417 = ((double)(float)(((float)(t$145416))));
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        return t$145417;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    final public x10.util.concurrent.AtomicFloat x10$util$concurrent$AtomicFloat$$this$x10$util$concurrent$AtomicFloat() {
        
        //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        return x10.util.concurrent.AtomicFloat.this;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    final public void __fieldInitializers_x10_util_concurrent_AtomicFloat() {
        
    }
}

