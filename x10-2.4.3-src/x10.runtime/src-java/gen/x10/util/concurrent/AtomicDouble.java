package x10.util.concurrent;

@x10.runtime.impl.java.X10Generated
final public class AtomicDouble extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<AtomicDouble> $RTT = 
        x10.rtt.NamedType.<AtomicDouble> make("x10.util.concurrent.AtomicDouble",
                                              AtomicDouble.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.concurrent.AtomicDouble $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.v = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.concurrent.AtomicDouble $_obj = new x10.util.concurrent.AtomicDouble((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.v);
        
    }
    
    // constructor just for allocation
    public AtomicDouble(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    public x10.core.concurrent.AtomicLong v;
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    // creation method for java code (1-phase java constructor)
    public AtomicDouble() {
        this((java.lang.System[]) null);
        x10$util$concurrent$AtomicDouble$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.util.concurrent.AtomicDouble x10$util$concurrent$AtomicDouble$$init$S() {
         {
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
            
            
            //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
            final x10.util.concurrent.AtomicDouble this$145359 = this;
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
            final long t$145322 = java.lang.Double.doubleToRawLongBits(0.0);
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
            final x10.core.concurrent.AtomicLong t$145323 = ((x10.core.concurrent.AtomicLong)(new x10.core.concurrent.AtomicLong(t$145322)));
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
            this.v = ((x10.core.concurrent.AtomicLong)(t$145323));
        }
        return this;
    }
    
    
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    // creation method for java code (1-phase java constructor)
    public AtomicDouble(final double v) {
        this((java.lang.System[]) null);
        x10$util$concurrent$AtomicDouble$$init$S(v);
    }
    
    // constructor for non-virtual call
    final public x10.util.concurrent.AtomicDouble x10$util$concurrent$AtomicDouble$$init$S(final double v) {
         {
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
            
            
            //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
            final x10.util.concurrent.AtomicDouble this$145360 = this;
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
            final long t$145324 = java.lang.Double.doubleToRawLongBits(v);
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
            final x10.core.concurrent.AtomicLong t$145325 = ((x10.core.concurrent.AtomicLong)(new x10.core.concurrent.AtomicLong(t$145324)));
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
            this.v = ((x10.core.concurrent.AtomicLong)(t$145325));
        }
        return this;
    }
    
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    public double get() {
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final x10.core.concurrent.AtomicLong t$145326 = ((x10.core.concurrent.AtomicLong)(v));
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final long t$145327 = t$145326.get();
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final double t$145328 = java.lang.Double.longBitsToDouble(((long)(t$145327)));
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        return t$145328;
    }
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    public void set(final double v) {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final x10.core.concurrent.AtomicLong t$145329 = ((x10.core.concurrent.AtomicLong)(this.v));
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final long t$145330 = java.lang.Double.doubleToRawLongBits(v);
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        t$145329.set(((long)(t$145330)));
    }
    
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    public boolean compareAndSet(final double expect, final double update) {
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final long exp = java.lang.Double.doubleToRawLongBits(expect);
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final long upd = java.lang.Double.doubleToRawLongBits(update);
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final x10.core.concurrent.AtomicLong t$145331 = ((x10.core.concurrent.AtomicLong)(v));
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final boolean t$145332 = t$145331.compareAndSet(((long)(exp)),((long)(upd)));
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        return t$145332;
    }
    
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    public boolean weakCompareAndSet(final double expect, final double update) {
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final long exp = java.lang.Double.doubleToRawLongBits(expect);
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final long upd = java.lang.Double.doubleToRawLongBits(update);
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final x10.core.concurrent.AtomicLong t$145333 = ((x10.core.concurrent.AtomicLong)(v));
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final boolean t$145334 = t$145333.weakCompareAndSet(((long)(exp)),((long)(upd)));
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        return t$145334;
    }
    
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    public double getAndIncrement() {
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final double t$145335 = ((double)(long)(((long)(1L))));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final double t$145336 = this.getAndAdd((double)(t$145335));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        return t$145336;
    }
    
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    public double getAndDecrement() {
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final double t$145337 = ((double)(long)(((long)(-1L))));
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final double t$145338 = this.getAndAdd((double)(t$145337));
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        return t$145338;
    }
    
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    public double getAndAdd(final double delta) {
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        do  {
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
            final x10.core.concurrent.AtomicLong t$145339 = ((x10.core.concurrent.AtomicLong)(v));
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
            final long exp = t$145339.get();
            
            //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
            final double expect = java.lang.Double.longBitsToDouble(((long)(exp)));
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
            final double update = ((expect) + (((double)(delta))));
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
            final long upd = java.lang.Double.doubleToRawLongBits(update);
            
            //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
            final x10.core.concurrent.AtomicLong t$145340 = ((x10.core.concurrent.AtomicLong)(v));
            
            //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
            final boolean t$145341 = t$145340.weakCompareAndSet(((long)(exp)),((long)(upd)));
            
            //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
            if (t$145341) {
                
                //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
                return expect;
            }
        }while(true); 
    }
    
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    public double incrementAndGet() {
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final double t$145342 = ((double)(long)(((long)(1L))));
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final double t$145343 = this.addAndGet((double)(t$145342));
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        return t$145343;
    }
    
    
    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    public double decrementAndGet() {
        
        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final double t$145344 = ((double)(long)(((long)(-1L))));
        
        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final double t$145345 = this.addAndGet((double)(t$145344));
        
        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        return t$145345;
    }
    
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    public double addAndGet(final double delta) {
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        do  {
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
            final x10.core.concurrent.AtomicLong t$145346 = ((x10.core.concurrent.AtomicLong)(v));
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
            final long exp = t$145346.get();
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
            final double expect = java.lang.Double.longBitsToDouble(((long)(exp)));
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
            final double update = ((expect) + (((double)(delta))));
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
            final long upd = java.lang.Double.doubleToRawLongBits(update);
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
            final x10.core.concurrent.AtomicLong t$145347 = ((x10.core.concurrent.AtomicLong)(v));
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
            final boolean t$145348 = t$145347.weakCompareAndSet(((long)(exp)),((long)(upd)));
            
            //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
            if (t$145348) {
                
                //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
                return update;
            }
        }while(true); 
    }
    
    
    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    public java.lang.String toString() {
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final double t$145349 = this.get();
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final java.lang.String t$145350 = java.lang.Double.toString(t$145349);
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        return t$145350;
    }
    
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    public int intValue() {
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final double t$145351 = this.get();
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final int t$145352 = ((int)(double)(((double)(t$145351))));
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        return t$145352;
    }
    
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    public long longValue() {
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final double t$145353 = this.get();
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final long t$145354 = ((long)(double)(((double)(t$145353))));
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        return t$145354;
    }
    
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    public float floatValue() {
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final double t$145355 = this.get();
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final float t$145356 = ((float)(double)(((double)(t$145355))));
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        return t$145356;
    }
    
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    public double doubleValue() {
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final double t$145357 = this.get();
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        final double t$145358 = t$145357;
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        return t$145358;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    final public x10.util.concurrent.AtomicDouble x10$util$concurrent$AtomicDouble$$this$x10$util$concurrent$AtomicDouble() {
        
        //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        return x10.util.concurrent.AtomicDouble.this;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    final public void __fieldInitializers_x10_util_concurrent_AtomicDouble() {
        
    }
}

