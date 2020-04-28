package x10.glb;


@x10.runtime.impl.java.X10Generated
final public class Worker<$Queue, $R> extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Worker> $RTT = 
        x10.rtt.NamedType.<Worker> make("x10.glb.Worker",
                                        Worker.class,
                                        2);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
    
    public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
        $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
        $_obj.queue = $deserializer.readObject();
        $_obj.lifelineThieves = $deserializer.readObject();
        $_obj.thieves = $deserializer.readObject();
        $_obj.lifelines = $deserializer.readObject();
        $_obj.lifelinesActivated = $deserializer.readObject();
        $_obj.n = $deserializer.readInt();
        $_obj.w = $deserializer.readInt();
        $_obj.m = $deserializer.readInt();
        $_obj.random = $deserializer.readObject();
        $_obj.victims = $deserializer.readObject();
        $_obj.logger = $deserializer.readObject();
        $_obj.P = $deserializer.readLong();
        $_obj.context = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.glb.Worker $_obj = new x10.glb.Worker((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$Queue);
        $serializer.write(this.$R);
        $serializer.write(this.queue);
        $serializer.write(this.lifelineThieves);
        $serializer.write(this.thieves);
        $serializer.write(this.lifelines);
        $serializer.write(this.lifelinesActivated);
        $serializer.write(this.n);
        $serializer.write(this.w);
        $serializer.write(this.m);
        $serializer.write(this.random);
        $serializer.write(this.victims);
        $serializer.write(this.logger);
        $serializer.write(this.P);
        $serializer.write(this.context);
        
    }
    
    // constructor just for allocation
    public Worker(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
        x10.glb.Worker.$initParams(this, $Queue, $R);
        
    }
    
    private x10.rtt.Type $Queue;
    private x10.rtt.Type $R;
    
    // initializer of type parameters
    public static void $initParams(final Worker $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
        $this.$Queue = $Queue;
        $this.$R = $R;
        
    }
    // synthetic type for parameter mangling
    public static final class __0$1x10$glb$Worker$$Queue$2 {}
    

    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    /** TaskQueue, responsible for crunching numbers */
    public $Queue queue;
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    /** Read as I am the "lifeline buddy" of my "lifelineThieves" */
    public x10.glb.FixedSizeStack<x10.core.Long> lifelineThieves;
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    /** Thieves that send stealing requests*/
    public x10.glb.FixedSizeStack<x10.core.Long> thieves;
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    /** Lifeline buddies */
    public x10.core.Rail<x10.core.Long> lifelines;
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    /** The data structure to keep a key invariant: 
     * At any time, at most one message has been sent on an
     * outgoing lifeline (and hence at most one message has
     * been received on an incoming lifeline).*/
    public x10.core.Rail<x10.core.Boolean> lifelinesActivated;
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    /** The granularity of tasks to run in a batch before starts to probe network to respond to work-stealing 
     * requests. The smaller n is, the more responsive to the work-stealing requests; on the other hand, less focused
     * on computation */
    public int n;
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    /** Number of random victims to probe before sending requests to lifeline buddy*/
    public int w;
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    /** Maximum number of random victims */
    public int m;
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    /** Random number, used when picking a non-lifeline victim/buddy. Important to seed with place id, otherwise
      BG/Q, the random sequence will be exactly same at different places*/
    public x10.util.Random random;
    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    /** Random buddies, a runner first probes its random buddy, only when none of the random buddies responds
     *  it starts to probe its lifeline buddies */
    public x10.core.Rail<x10.core.Long> victims;
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    /** Logger to record the work-stealing status */
    public x10.glb.Logger logger;
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    /** Variables used for synchronization, made sure not to be optimized out by the compiler */
    volatile public transient boolean active;
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    volatile public transient boolean empty;
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    volatile public transient boolean waiting;
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    public long P;
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    public x10.glb.Context<$Queue, $R> context;
    
    
    //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    // creation method for java code (1-phase java constructor)
    public Worker(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.core.fun.Fun_0_0<$Queue> init, final int n, final int w, final int l, final int z, final int m, final boolean tree, __0$1x10$glb$Worker$$Queue$2 $dummy) {
        this((java.lang.System[]) null, $Queue, $R);
        x10$glb$Worker$$init$S(init, n, w, l, z, m, tree, (x10.glb.Worker.__0$1x10$glb$Worker$$Queue$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.glb.Worker<$Queue, $R> x10$glb$Worker$$init$S(final x10.core.fun.Fun_0_0<$Queue> init, final int n, final int w, final int l, final int z, final int m, final boolean tree, __0$1x10$glb$Worker$$Queue$2 $dummy) {
         {
            
            //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            
            
            //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            this.__fieldInitializers_x10_glb_Worker();
            
            //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)this).n = n;
            
            //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)this).w = w;
            
            //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)this).m = m;
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$88933 = ((long)(((int)(z))));
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.core.Rail t$88934 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, t$88933, (x10.core.Long.$box(-1L)), (x10.core.Rail.__1x10$lang$Rail$$T) null)));
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)this).lifelines = ((x10.core.Rail)(t$88934));
            
            //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long h = ((long)x10.x10rt.X10RT.here());
            
            //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$88935 = ((long)(((int)(m))));
            
            //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.core.Rail t$88936 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Long>(x10.rtt.Types.LONG, t$88935)));
            
            //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)this).victims = ((x10.core.Rail)(t$88936));
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$88937 = P;
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final boolean t$88951 = ((t$88937) > (((long)(1L))));
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if (t$88951) {
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                long i = 0L;
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$88939 = i;
                    
                    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$88940 = ((long)(((int)(m))));
                    
                    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final boolean t$88950 = ((t$88939) < (((long)(t$88940))));
                    
                    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    if (!(t$88950)) {
                        
                        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        break;
                    }
                    
                    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    while (true) {
                        
                        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final x10.core.Rail t$89404 = ((x10.core.Rail)(victims));
                        
                        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final long t$89405 = i;
                        
                        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final x10.util.Random t$89406 = ((x10.util.Random)(random));
                        
                        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final long t$89407 = P;
                        
                        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final long t$89408 = t$89406.nextLong$O((long)(t$89407));
                        
                        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final long t$89409 = x10.core.Long.$unbox(((long[])t$89404.value)[(int)t$89405] = t$89408);
                        
                        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final boolean t$89410 = ((long) t$89409) == ((long) h);
                        
                        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        if (!(t$89410)) {
                            
                            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            break;
                        }
                    }
                    
                    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89411 = i;
                    
                    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89412 = ((t$89411) + (((long)(1L))));
                    
                    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    i = t$89412;
                }
            }
            
            //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            long x = 1L;
            
            //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            long t = 0L;
            
            //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            long j$89467 = 0L;
            
            //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            for (;
                 true;
                 ) {
                
                //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89468 = j$89467;
                
                //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89469 = ((long)(((int)(z))));
                
                //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final boolean t$89470 = ((t$89468) < (((long)(t$89469))));
                
                //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (!(t$89470)) {
                    
                    //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    break;
                }
                
                //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                long v$89446 = h;
                
                //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                long k$89442 = 1L;
                
                //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89443 = k$89442;
                    
                    //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89444 = ((long)(((int)(l))));
                    
                    //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final boolean t$89445 = ((t$89443) < (((long)(t$89444))));
                    
                    //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    if (!(t$89445)) {
                        
                        //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        break;
                    }
                    
                    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89413 = v$89446;
                    
                    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89414 = v$89446;
                    
                    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89415 = x;
                    
                    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89416 = ((long)(((int)(l))));
                    
                    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89417 = ((t$89415) * (((long)(t$89416))));
                    
                    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89418 = ((t$89414) % (((long)(t$89417))));
                    
                    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89419 = ((t$89413) - (((long)(t$89418))));
                    
                    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89420 = v$89446;
                    
                    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89421 = x;
                    
                    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89422 = ((long)(((int)(l))));
                    
                    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89423 = ((t$89421) * (((long)(t$89422))));
                    
                    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89424 = ((t$89420) + (((long)(t$89423))));
                    
                    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89425 = x;
                    
                    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89426 = ((t$89424) - (((long)(t$89425))));
                    
                    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89427 = x;
                    
                    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89428 = ((long)(((int)(l))));
                    
                    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89429 = ((t$89427) * (((long)(t$89428))));
                    
                    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89430 = ((t$89426) % (((long)(t$89429))));
                    
                    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89431 = ((t$89419) + (((long)(t$89430))));
                    
                    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    v$89446 = t$89431;
                    
                    //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89432 = v$89446;
                    
                    //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89433 = P;
                    
                    //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final boolean t$89434 = ((t$89432) < (((long)(t$89433))));
                    
                    //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    if (t$89434) {
                        
                        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final x10.core.Rail t$89435 = ((x10.core.Rail)(lifelines));
                        
                        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final long pre$89436 = t;
                        
                        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final long t$89437 = t;
                        
                        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final long t$89438 = ((t$89437) + (((long)(1L))));
                        
                        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        t = t$89438;
                        
                        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final long t$89439 = v$89446;
                        
                        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        ((long[])t$89435.value)[(int)pre$89436] = t$89439;
                        
                        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        break;
                    }
                    
                    //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89440 = k$89442;
                    
                    //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89441 = ((t$89440) + (((long)(1L))));
                    
                    //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    k$89442 = t$89441;
                }
                
                //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89447 = x;
                
                //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89448 = ((long)(((int)(l))));
                
                //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89449 = ((t$89447) * (((long)(t$89448))));
                
                //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                x = t$89449;
                
                //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89450 = j$89467;
                
                //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89451 = ((t$89450) + (((long)(1L))));
                
                //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                j$89467 = t$89451;
            }
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final $Queue t$88993 = (($Queue)(((x10.core.fun.Fun_0_0<$Queue>)init).$apply$G()));
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)this).queue = (($Queue)(t$88993));
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.FixedSizeStack alloc$81707 = ((x10.glb.FixedSizeStack)(new x10.glb.FixedSizeStack<x10.core.Long>((java.lang.System[]) null, x10.rtt.Types.LONG)));
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.core.Rail t$89471 = ((x10.core.Rail)(lifelines));
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89472 = ((x10.core.Rail<x10.core.Long>)t$89471).size;
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89473 = ((t$89472) + (((long)(3L))));
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            alloc$81707.x10$glb$FixedSizeStack$$init$S(t$89473);
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)this).lifelineThieves = ((x10.glb.FixedSizeStack)(alloc$81707));
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.FixedSizeStack alloc$81708 = ((x10.glb.FixedSizeStack)(new x10.glb.FixedSizeStack<x10.core.Long>((java.lang.System[]) null, x10.rtt.Types.LONG)));
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89474 = P;
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            alloc$81708.x10$glb$FixedSizeStack$$init$S(((long)(t$89474)));
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)this).thieves = ((x10.glb.FixedSizeStack)(alloc$81708));
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$88998 = P;
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.core.Rail t$88999 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Boolean>(x10.rtt.Types.BOOLEAN, ((long)(t$88998)))));
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)this).lifelinesActivated = ((x10.core.Rail)(t$88999));
            
            //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if (tree) {
                
                //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89000 = ((3L) * (((long)(h))));
                
                //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89001 = ((t$89000) + (((long)(1L))));
                
                //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89002 = P;
                
                //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final boolean t$89009 = ((t$89001) < (((long)(t$89002))));
                
                //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (t$89009) {
                    
                    //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.FixedSizeStack this$88752 = ((x10.glb.FixedSizeStack)(lifelineThieves));
                    
                    //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89003 = ((3L) * (((long)(h))));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$88751 = ((t$89003) + (((long)(1L))));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final x10.core.Rail t$89452 = ((x10.core.Rail)(((x10.glb.FixedSizeStack<x10.core.Long>)this$88752).data));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89453 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$88752).size;
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89454 = ((t$89453) + (((long)(1L))));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89455 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$88752).size = t$89454;
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89456 = ((t$89455) - (((long)(1L))));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    ((long[])t$89452.value)[(int)t$89456] = t$88751;
                }
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89010 = ((3L) * (((long)(h))));
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89011 = ((t$89010) + (((long)(2L))));
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89012 = P;
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final boolean t$89019 = ((t$89011) < (((long)(t$89012))));
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (t$89019) {
                    
                    //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.FixedSizeStack this$88756 = ((x10.glb.FixedSizeStack)(lifelineThieves));
                    
                    //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89013 = ((3L) * (((long)(h))));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$88755 = ((t$89013) + (((long)(2L))));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final x10.core.Rail t$89457 = ((x10.core.Rail)(((x10.glb.FixedSizeStack<x10.core.Long>)this$88756).data));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89458 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$88756).size;
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89459 = ((t$89458) + (((long)(1L))));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89460 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$88756).size = t$89459;
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89461 = ((t$89460) - (((long)(1L))));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    ((long[])t$89457.value)[(int)t$89461] = t$88755;
                }
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89020 = ((3L) * (((long)(h))));
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89021 = ((t$89020) + (((long)(3L))));
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89022 = P;
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final boolean t$89029 = ((t$89021) < (((long)(t$89022))));
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (t$89029) {
                    
                    //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.FixedSizeStack this$88760 = ((x10.glb.FixedSizeStack)(lifelineThieves));
                    
                    //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89023 = ((3L) * (((long)(h))));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$88759 = ((t$89023) + (((long)(3L))));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final x10.core.Rail t$89462 = ((x10.core.Rail)(((x10.glb.FixedSizeStack<x10.core.Long>)this$88760).data));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89463 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$88760).size;
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89464 = ((t$89463) + (((long)(1L))));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89465 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$88760).size = t$89464;
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89466 = ((t$89465) - (((long)(1L))));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    ((long[])t$89462.value)[(int)t$89466] = t$88759;
                }
                
                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final boolean t$89033 = ((h) > (((long)(0L))));
                
                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (t$89033) {
                    
                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.core.Rail t$89031 = ((x10.core.Rail)(lifelinesActivated));
                    
                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89030 = ((h) - (((long)(1L))));
                    
                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89032 = ((t$89030) / (((long)(3L))));
                    
                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    ((boolean[])t$89031.value)[(int)t$89032] = true;
                }
            }
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Logger alloc$81709 = ((x10.glb.Logger)(new x10.glb.Logger((java.lang.System[]) null)));
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            alloc$81709.x10$glb$Logger$$init$S(((boolean)(true)));
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)this).logger = ((x10.glb.Logger)(alloc$81709));
        }
        return this;
    }
    
    
    
    //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    final public void processStack__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(final x10.lang.PlaceLocalHandle st) {
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        boolean t$89106 = false;
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        do  {
            
            //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            while (true) {
                
                //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final $Queue t$89578 = (($Queue)(queue));
                
                //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final int t$89579 = n;
                
                //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89580 = ((long)(((int)(t$89579))));
                
                //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Context t$89581 = ((x10.glb.Context)(context));
                
                //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final boolean t$89582 = x10.core.Boolean.$unbox(((x10.glb.TaskQueue<$Queue, $R>)x10.rtt.Types.conversion(x10.rtt.ParameterizedType.make(x10.glb.TaskQueue.$RTT, $Queue, $R),t$89578)).process$Z((long)(t$89580), ((x10.glb.Context)(t$89581)), x10.rtt.ParameterizedType.make(x10.glb.Context.$RTT, $Queue, $R)));
                
                //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (!(t$89582)) {
                    
                    //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    break;
                }
                
                //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                x10.lang.Runtime.probe();
                
                //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Worker this$89551 = ((x10.glb.Worker)(this));
                
                //#line 172 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.lang.PlaceLocalHandle st$89552 = ((x10.lang.PlaceLocalHandle)(st));
                
                //#line 173 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                x10.glb.TaskBag loot$89537 =  null;
                
                //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                while (true) {
                    
                    //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.FixedSizeStack this$89538 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this$89551).thieves));
                    
                    //#line 44 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89539 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89538).size;
                    
                    //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    boolean t$89540 = ((t$89539) > (((long)(0L))));
                    
                    //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    if (!(t$89540)) {
                        
                        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final x10.glb.FixedSizeStack this$89541 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this$89551).lifelineThieves));
                        
                        //#line 44 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                        final long t$89542 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89541).size;
                        
                        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        t$89540 = ((t$89542) > (((long)(0L))));
                    }
                    
                    //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    boolean t$89543 = t$89540;
                    
                    //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    if (t$89543) {
                        
                        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final $Queue t$89544 = (($Queue)(((x10.glb.Worker<$Queue, $R>)this$89551).queue));
                        
                        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final x10.glb.TaskBag t$89545 = ((x10.glb.TaskQueue<$Queue, $R>)x10.rtt.Types.conversion(x10.rtt.ParameterizedType.make(x10.glb.TaskQueue.$RTT, $Queue, $R),t$89544)).split();
                        
                        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final x10.glb.TaskBag t$89546 = loot$89537 = ((x10.glb.TaskBag)(t$89545));
                        
                        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        t$89543 = ((t$89546) != (null));
                    }
                    
                    //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final boolean t$89547 = t$89543;
                    
                    //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    if (!(t$89547)) {
                        
                        //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        break;
                    }
                    
                    //#line 148 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.lang.PlaceLocalHandle st$89515 = ((x10.lang.PlaceLocalHandle)(st$89552));
                    
                    //#line 148 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.TaskBag loot$89516 = ((x10.glb.TaskBag)(loot$89537));
                    
                    //#line 149 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long victim$89477 = ((long)x10.x10rt.X10RT.here());
                    
                    //#line 150 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.Logger obj$89478 = ((x10.glb.Logger)(((x10.glb.Worker<$Queue, $R>)this$89551).logger));
                    
                    //#line 150 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89479 = obj$89478.nodesGiven;
                    
                    //#line 150 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89480 = loot$89516.size$O();
                    
                    //#line 150 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89481 = ((t$89479) + (((long)(t$89480))));
                    
                    //#line 150 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    obj$89478.nodesGiven = t$89481;
                    
                    //#line 151 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.FixedSizeStack this$89482 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this$89551).thieves));
                    
                    //#line 44 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89483 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89482).size;
                    
                    //#line 151 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final boolean t$89484 = ((t$89483) > (((long)(0L))));
                    
                    //#line 151 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    if (t$89484) {
                        
                        //#line 152 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final x10.glb.FixedSizeStack this$89485 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this$89551).thieves));
                        
                        //#line 33 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                        final x10.core.Rail t$89486 = ((x10.core.Rail)(((x10.glb.FixedSizeStack<x10.core.Long>)this$89485).data));
                        
                        //#line 33 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                        final long t$89487 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89485).size;
                        
                        //#line 33 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                        final long t$89488 = ((t$89487) - (((long)(1L))));
                        
                        //#line 33 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                        final long t$89489 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89485).size = t$89488;
                        
                        //#line 152 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final long thief$89490 = ((long[])t$89486.value)[(int)t$89489];
                        
                        //#line 153 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final boolean t$89491 = ((thief$89490) >= (((long)(0L))));
                        
                        //#line 153 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        if (t$89491) {
                            
                            //#line 154 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final x10.glb.Logger obj$89492 = ((x10.glb.Logger)(((x10.glb.Worker<$Queue, $R>)this$89551).logger));
                            
                            //#line 154 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final long t$89493 = obj$89492.lifelineStealsSuffered;
                            
                            //#line 154 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final long t$89494 = ((t$89493) + (((long)(1L))));
                            
                            //#line 154 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            obj$89492.lifelineStealsSuffered = t$89494;
                            
                            //#line 155 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final x10.lang.Place alloc$89495 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                            
                            //#line 155 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            alloc$89495.x10$lang$Place$$init$S(((long)(thief$89490)));
                            
                            //#line 155 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            x10.lang.Runtime.runUncountedAsync(((x10.lang.Place)(alloc$89495)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$33<$Queue, $R>($Queue, $R, st$89515, loot$89516, victim$89477, (x10.glb.Worker.$Closure$33.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$33$$Queue$3x10$glb$Worker$$Closure$33$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
                        } else {
                            
                            //#line 157 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final x10.glb.Logger obj$89498 = ((x10.glb.Logger)(((x10.glb.Worker<$Queue, $R>)this$89551).logger));
                            
                            //#line 157 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final long t$89499 = obj$89498.stealsSuffered;
                            
                            //#line 157 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final long t$89500 = ((t$89499) + (((long)(1L))));
                            
                            //#line 157 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            obj$89498.stealsSuffered = t$89500;
                            
                            //#line 158 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final x10.lang.Place alloc$89501 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                            
                            //#line 158 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final long t$89475 = (-(thief$89490));
                            
                            //#line 158 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final long t$89476 = ((t$89475) - (((long)(1L))));
                            
                            //#line 158 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            alloc$89501.x10$lang$Place$$init$S(t$89476);
                            
                            //#line 158 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            x10.lang.Runtime.runUncountedAsync(((x10.lang.Place)(alloc$89501)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$34<$Queue, $R>($Queue, $R, st$89515, loot$89516, (x10.glb.Worker.$Closure$34.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$34$$Queue$3x10$glb$Worker$$Closure$34$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
                        }
                    } else {
                        
                        //#line 161 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final x10.glb.Logger obj$89504 = ((x10.glb.Logger)(((x10.glb.Worker<$Queue, $R>)this$89551).logger));
                        
                        //#line 161 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final long t$89505 = obj$89504.lifelineStealsSuffered;
                        
                        //#line 161 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final long t$89506 = ((t$89505) + (((long)(1L))));
                        
                        //#line 161 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        obj$89504.lifelineStealsSuffered = t$89506;
                        
                        //#line 162 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final x10.glb.FixedSizeStack this$89507 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this$89551).lifelineThieves));
                        
                        //#line 33 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                        final x10.core.Rail t$89508 = ((x10.core.Rail)(((x10.glb.FixedSizeStack<x10.core.Long>)this$89507).data));
                        
                        //#line 33 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                        final long t$89509 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89507).size;
                        
                        //#line 33 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                        final long t$89510 = ((t$89509) - (((long)(1L))));
                        
                        //#line 33 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                        final long t$89511 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89507).size = t$89510;
                        
                        //#line 162 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final long thief$89512 = ((long[])t$89508.value)[(int)t$89511];
                        
                        //#line 163 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final x10.lang.Place alloc$89513 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                        
                        //#line 163 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        alloc$89513.x10$lang$Place$$init$S(((long)(thief$89512)));
                        
                        //#line 163 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        x10.lang.Runtime.runAsync(((x10.lang.Place)(alloc$89513)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$35<$Queue, $R>($Queue, $R, st$89515, loot$89516, victim$89477, (x10.glb.Worker.$Closure$35.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$35$$Queue$3x10$glb$Worker$$Closure$35$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
                    }
                }
                
                //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Worker this$89553 = ((x10.glb.Worker)(this));
                
                //#line 184 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.lang.PlaceLocalHandle st$89554 = ((x10.lang.PlaceLocalHandle)(st));
                
                //#line 185 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                while (true) {
                    
                    //#line 185 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.FixedSizeStack this$89548 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this$89553).thieves));
                    
                    //#line 44 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89549 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89548).size;
                    
                    //#line 185 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final boolean t$89550 = ((t$89549) > (((long)(0L))));
                    
                    //#line 185 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    if (!(t$89550)) {
                        
                        //#line 185 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        break;
                    }
                    
                    //#line 186 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.FixedSizeStack this$89524 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this$89553).thieves));
                    
                    //#line 33 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final x10.core.Rail t$89525 = ((x10.core.Rail)(((x10.glb.FixedSizeStack<x10.core.Long>)this$89524).data));
                    
                    //#line 33 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89526 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89524).size;
                    
                    //#line 33 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89527 = ((t$89526) - (((long)(1L))));
                    
                    //#line 33 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89528 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89524).size = t$89527;
                    
                    //#line 186 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long thief$89529 = ((long[])t$89525.value)[(int)t$89528];
                    
                    //#line 187 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final boolean t$89530 = ((thief$89529) >= (((long)(0L))));
                    
                    //#line 187 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    if (t$89530) {
                        
                        //#line 188 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final x10.glb.FixedSizeStack this$89531 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this$89553).lifelineThieves));
                        
                        //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                        final long t$89532 = thief$89529;
                        
                        //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                        final x10.core.Rail t$89517 = ((x10.core.Rail)(((x10.glb.FixedSizeStack<x10.core.Long>)this$89531).data));
                        
                        //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                        final long t$89518 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89531).size;
                        
                        //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                        final long t$89519 = ((t$89518) + (((long)(1L))));
                        
                        //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                        final long t$89520 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89531).size = t$89519;
                        
                        //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                        final long t$89521 = ((t$89520) - (((long)(1L))));
                        
                        //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                        ((long[])t$89517.value)[(int)t$89521] = t$89532;
                        
                        //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final x10.lang.Place alloc$89533 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                        
                        //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        alloc$89533.x10$lang$Place$$init$S(((long)(thief$89529)));
                        
                        //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        x10.lang.Runtime.runUncountedAsync(((x10.lang.Place)(alloc$89533)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$36<$Queue, $R>($Queue, $R, st$89554, (x10.glb.Worker.$Closure$36.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$36$$Queue$3x10$glb$Worker$$Closure$36$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
                    } else {
                        
                        //#line 191 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final x10.lang.Place alloc$89535 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                        
                        //#line 191 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final long t$89522 = (-(thief$89529));
                        
                        //#line 191 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final long t$89523 = ((t$89522) - (((long)(1L))));
                        
                        //#line 191 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        alloc$89535.x10$lang$Place$$init$S(t$89523);
                        
                        //#line 191 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        x10.lang.Runtime.runUncountedAsync(((x10.lang.Place)(alloc$89535)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$37<$Queue, $R>($Queue, $R, st$89554, (x10.glb.Worker.$Closure$37.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$37$$Queue$3x10$glb$Worker$$Closure$37$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
                    }
                }
            }
            
            //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker this$89583 = ((x10.glb.Worker)(this));
            
            //#line 184 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.lang.PlaceLocalHandle st$89584 = ((x10.lang.PlaceLocalHandle)(st));
            
            //#line 185 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            while (true) {
                
                //#line 185 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.FixedSizeStack this$89575 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this$89583).thieves));
                
                //#line 44 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final long t$89576 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89575).size;
                
                //#line 185 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final boolean t$89577 = ((t$89576) > (((long)(0L))));
                
                //#line 185 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (!(t$89577)) {
                    
                    //#line 185 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    break;
                }
                
                //#line 186 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.FixedSizeStack this$89562 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this$89583).thieves));
                
                //#line 33 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final x10.core.Rail t$89563 = ((x10.core.Rail)(((x10.glb.FixedSizeStack<x10.core.Long>)this$89562).data));
                
                //#line 33 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final long t$89564 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89562).size;
                
                //#line 33 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final long t$89565 = ((t$89564) - (((long)(1L))));
                
                //#line 33 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final long t$89566 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89562).size = t$89565;
                
                //#line 186 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long thief$89567 = ((long[])t$89563.value)[(int)t$89566];
                
                //#line 187 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final boolean t$89568 = ((thief$89567) >= (((long)(0L))));
                
                //#line 187 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (t$89568) {
                    
                    //#line 188 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.FixedSizeStack this$89569 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this$89583).lifelineThieves));
                    
                    //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89570 = thief$89567;
                    
                    //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final x10.core.Rail t$89555 = ((x10.core.Rail)(((x10.glb.FixedSizeStack<x10.core.Long>)this$89569).data));
                    
                    //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89556 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89569).size;
                    
                    //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89557 = ((t$89556) + (((long)(1L))));
                    
                    //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89558 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89569).size = t$89557;
                    
                    //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89559 = ((t$89558) - (((long)(1L))));
                    
                    //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    ((long[])t$89555.value)[(int)t$89559] = t$89570;
                    
                    //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.lang.Place alloc$89571 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                    
                    //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    alloc$89571.x10$lang$Place$$init$S(((long)(thief$89567)));
                    
                    //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    x10.lang.Runtime.runUncountedAsync(((x10.lang.Place)(alloc$89571)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$38<$Queue, $R>($Queue, $R, st$89584, (x10.glb.Worker.$Closure$38.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$38$$Queue$3x10$glb$Worker$$Closure$38$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
                } else {
                    
                    //#line 191 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.lang.Place alloc$89573 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                    
                    //#line 191 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89560 = (-(thief$89567));
                    
                    //#line 191 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89561 = ((t$89560) - (((long)(1L))));
                    
                    //#line 191 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    alloc$89573.x10$lang$Place$$init$S(t$89561);
                    
                    //#line 191 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    x10.lang.Runtime.runUncountedAsync(((x10.lang.Place)(alloc$89573)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$39<$Queue, $R>($Queue, $R, st$89584, (x10.glb.Worker.$Closure$39.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$39$$Queue$3x10$glb$Worker$$Closure$39$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
                }
            }
            
            //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final boolean t$89107 = this.steal__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2$O(((x10.lang.PlaceLocalHandle)(st)));
            
            //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            t$89106 = t$89107;
        }while(t$89106); 
    }
    
    
    //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    public void give__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(final x10.lang.PlaceLocalHandle st, final x10.glb.TaskBag loot) {
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        final long victim = ((long)x10.x10rt.X10RT.here());
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        final x10.glb.Logger obj$81345 = ((x10.glb.Logger)(logger));
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        final long t$89108 = obj$81345.nodesGiven;
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        final long t$89109 = loot.size$O();
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        final long t$89110 = ((t$89108) + (((long)(t$89109))));
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        obj$81345.nodesGiven = t$89110;
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        final x10.glb.FixedSizeStack this$88813 = ((x10.glb.FixedSizeStack)(thieves));
        
        //#line 44 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
        final long t$89111 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$88813).size;
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        final boolean t$89134 = ((t$89111) > (((long)(0L))));
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        if (t$89134) {
            
            //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.FixedSizeStack this$88814 = ((x10.glb.FixedSizeStack)(thieves));
            
            //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
            final x10.core.Rail t$89114 = ((x10.core.Rail)(((x10.glb.FixedSizeStack<x10.core.Long>)this$88814).data));
            
            //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
            final long t$89112 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$88814).size;
            
            //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
            final long t$89113 = ((t$89112) - (((long)(1L))));
            
            //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
            final long t$89115 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$88814).size = t$89113;
            
            //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long thief = ((long[])t$89114.value)[(int)t$89115];
            
            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final boolean t$89126 = ((thief) >= (((long)(0L))));
            
            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if (t$89126) {
                
                //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Logger obj$81367 = ((x10.glb.Logger)(logger));
                
                //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89116 = obj$81367.lifelineStealsSuffered;
                
                //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89117 = ((t$89116) + (((long)(1L))));
                
                //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                obj$81367.lifelineStealsSuffered = t$89117;
                
                //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.lang.Place alloc$81710 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                
                //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                alloc$81710.x10$lang$Place$$init$S(((long)(thief)));
                
                //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                x10.lang.Runtime.runUncountedAsync(((x10.lang.Place)(alloc$81710)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$40<$Queue, $R>($Queue, $R, st, loot, victim, (x10.glb.Worker.$Closure$40.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$40$$Queue$3x10$glb$Worker$$Closure$40$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
            } else {
                
                //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Logger obj$81375 = ((x10.glb.Logger)(logger));
                
                //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89120 = obj$81375.stealsSuffered;
                
                //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89121 = ((t$89120) + (((long)(1L))));
                
                //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                obj$81375.stealsSuffered = t$89121;
                
                //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.lang.Place alloc$81711 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                
                //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89585 = (-(thief));
                
                //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89586 = ((t$89585) - (((long)(1L))));
                
                //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                alloc$81711.x10$lang$Place$$init$S(t$89586);
                
                //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                x10.lang.Runtime.runUncountedAsync(((x10.lang.Place)(alloc$81711)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$41<$Queue, $R>($Queue, $R, st, loot, (x10.glb.Worker.$Closure$41.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$41$$Queue$3x10$glb$Worker$$Closure$41$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
            }
        } else {
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Logger obj$81397 = ((x10.glb.Logger)(logger));
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89127 = obj$81397.lifelineStealsSuffered;
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89128 = ((t$89127) + (((long)(1L))));
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            obj$81397.lifelineStealsSuffered = t$89128;
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.FixedSizeStack this$88815 = ((x10.glb.FixedSizeStack)(lifelineThieves));
            
            //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
            final x10.core.Rail t$89131 = ((x10.core.Rail)(((x10.glb.FixedSizeStack<x10.core.Long>)this$88815).data));
            
            //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
            final long t$89129 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$88815).size;
            
            //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
            final long t$89130 = ((t$89129) - (((long)(1L))));
            
            //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
            final long t$89132 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$88815).size = t$89130;
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long thief = ((long[])t$89131.value)[(int)t$89132];
            
            //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.lang.Place alloc$81712 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
            
            //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            alloc$81712.x10$lang$Place$$init$S(((long)(thief)));
            
            //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x10.lang.Runtime.runAsync(((x10.lang.Place)(alloc$81712)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$42<$Queue, $R>($Queue, $R, st, loot, victim, (x10.glb.Worker.$Closure$42.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$42$$Queue$3x10$glb$Worker$$Closure$42$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
        }
    }
    
    
    //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    public void distribute__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(final x10.lang.PlaceLocalHandle st) {
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        x10.glb.TaskBag loot =  null;
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        while (true) {
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.FixedSizeStack this$88816 = ((x10.glb.FixedSizeStack)(thieves));
            
            //#line 44 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
            final long t$89135 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$88816).size;
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            boolean t$89137 = ((t$89135) > (((long)(0L))));
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if (!(t$89137)) {
                
                //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.FixedSizeStack this$88817 = ((x10.glb.FixedSizeStack)(lifelineThieves));
                
                //#line 44 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final long t$89136 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$88817).size;
                
                //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                t$89137 = ((t$89136) > (((long)(0L))));
            }
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            boolean t$89141 = t$89137;
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if (t$89141) {
                
                //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final $Queue t$89138 = (($Queue)(queue));
                
                //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.TaskBag t$89139 = ((x10.glb.TaskQueue<$Queue, $R>)x10.rtt.Types.conversion(x10.rtt.ParameterizedType.make(x10.glb.TaskQueue.$RTT, $Queue, $R),t$89138)).split();
                
                //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.TaskBag t$89140 = loot = ((x10.glb.TaskBag)(t$89139));
                
                //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                t$89141 = ((t$89140) != (null));
            }
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final boolean t$89169 = t$89141;
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if (!(t$89169)) {
                
                //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                break;
            }
            
            //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker this$89627 = ((x10.glb.Worker)(this));
            
            //#line 148 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.lang.PlaceLocalHandle st$89628 = ((x10.lang.PlaceLocalHandle)(st));
            
            //#line 148 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.TaskBag loot$89629 = ((x10.glb.TaskBag)(loot));
            
            //#line 149 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long victim$89589 = ((long)x10.x10rt.X10RT.here());
            
            //#line 150 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Logger obj$89590 = ((x10.glb.Logger)(((x10.glb.Worker<$Queue, $R>)this$89627).logger));
            
            //#line 150 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89591 = obj$89590.nodesGiven;
            
            //#line 150 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89592 = loot$89629.size$O();
            
            //#line 150 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89593 = ((t$89591) + (((long)(t$89592))));
            
            //#line 150 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            obj$89590.nodesGiven = t$89593;
            
            //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.FixedSizeStack this$89594 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this$89627).thieves));
            
            //#line 44 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
            final long t$89595 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89594).size;
            
            //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final boolean t$89596 = ((t$89595) > (((long)(0L))));
            
            //#line 151 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if (t$89596) {
                
                //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.FixedSizeStack this$89597 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this$89627).thieves));
                
                //#line 33 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final x10.core.Rail t$89598 = ((x10.core.Rail)(((x10.glb.FixedSizeStack<x10.core.Long>)this$89597).data));
                
                //#line 33 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final long t$89599 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89597).size;
                
                //#line 33 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final long t$89600 = ((t$89599) - (((long)(1L))));
                
                //#line 33 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final long t$89601 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89597).size = t$89600;
                
                //#line 152 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long thief$89602 = ((long[])t$89598.value)[(int)t$89601];
                
                //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final boolean t$89603 = ((thief$89602) >= (((long)(0L))));
                
                //#line 153 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (t$89603) {
                    
                    //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.Logger obj$89604 = ((x10.glb.Logger)(((x10.glb.Worker<$Queue, $R>)this$89627).logger));
                    
                    //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89605 = obj$89604.lifelineStealsSuffered;
                    
                    //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89606 = ((t$89605) + (((long)(1L))));
                    
                    //#line 154 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    obj$89604.lifelineStealsSuffered = t$89606;
                    
                    //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.lang.Place alloc$89607 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                    
                    //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    alloc$89607.x10$lang$Place$$init$S(((long)(thief$89602)));
                    
                    //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    x10.lang.Runtime.runUncountedAsync(((x10.lang.Place)(alloc$89607)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$43<$Queue, $R>($Queue, $R, st$89628, loot$89629, victim$89589, (x10.glb.Worker.$Closure$43.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$43$$Queue$3x10$glb$Worker$$Closure$43$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
                } else {
                    
                    //#line 157 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.Logger obj$89610 = ((x10.glb.Logger)(((x10.glb.Worker<$Queue, $R>)this$89627).logger));
                    
                    //#line 157 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89611 = obj$89610.stealsSuffered;
                    
                    //#line 157 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89612 = ((t$89611) + (((long)(1L))));
                    
                    //#line 157 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    obj$89610.stealsSuffered = t$89612;
                    
                    //#line 158 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.lang.Place alloc$89613 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                    
                    //#line 158 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89587 = (-(thief$89602));
                    
                    //#line 158 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89588 = ((t$89587) - (((long)(1L))));
                    
                    //#line 158 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    alloc$89613.x10$lang$Place$$init$S(t$89588);
                    
                    //#line 158 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    x10.lang.Runtime.runUncountedAsync(((x10.lang.Place)(alloc$89613)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$44<$Queue, $R>($Queue, $R, st$89628, loot$89629, (x10.glb.Worker.$Closure$44.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$44$$Queue$3x10$glb$Worker$$Closure$44$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
                }
            } else {
                
                //#line 161 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Logger obj$89616 = ((x10.glb.Logger)(((x10.glb.Worker<$Queue, $R>)this$89627).logger));
                
                //#line 161 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89617 = obj$89616.lifelineStealsSuffered;
                
                //#line 161 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89618 = ((t$89617) + (((long)(1L))));
                
                //#line 161 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                obj$89616.lifelineStealsSuffered = t$89618;
                
                //#line 162 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.FixedSizeStack this$89619 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this$89627).lifelineThieves));
                
                //#line 33 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final x10.core.Rail t$89620 = ((x10.core.Rail)(((x10.glb.FixedSizeStack<x10.core.Long>)this$89619).data));
                
                //#line 33 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final long t$89621 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89619).size;
                
                //#line 33 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final long t$89622 = ((t$89621) - (((long)(1L))));
                
                //#line 33 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final long t$89623 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89619).size = t$89622;
                
                //#line 162 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long thief$89624 = ((long[])t$89620.value)[(int)t$89623];
                
                //#line 163 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.lang.Place alloc$89625 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                
                //#line 163 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                alloc$89625.x10$lang$Place$$init$S(((long)(thief$89624)));
                
                //#line 163 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                x10.lang.Runtime.runAsync(((x10.lang.Place)(alloc$89625)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$45<$Queue, $R>($Queue, $R, st$89628, loot$89629, victim$89589, (x10.glb.Worker.$Closure$45.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$45$$Queue$3x10$glb$Worker$$Closure$45$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
            }
        }
    }
    
    
    //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    public void reject__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(final x10.lang.PlaceLocalHandle st) {
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        while (true) {
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.FixedSizeStack this$88836 = ((x10.glb.FixedSizeStack)(thieves));
            
            //#line 44 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
            final long t$89170 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$88836).size;
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final boolean t$89185 = ((t$89170) > (((long)(0L))));
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if (!(t$89185)) {
                
                //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                break;
            }
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.FixedSizeStack this$89637 = ((x10.glb.FixedSizeStack)(thieves));
            
            //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
            final x10.core.Rail t$89638 = ((x10.core.Rail)(((x10.glb.FixedSizeStack<x10.core.Long>)this$89637).data));
            
            //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
            final long t$89639 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89637).size;
            
            //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
            final long t$89640 = ((t$89639) - (((long)(1L))));
            
            //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
            final long t$89641 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89637).size = t$89640;
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long thief$89642 = ((long[])t$89638.value)[(int)t$89641];
            
            //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final boolean t$89643 = ((thief$89642) >= (((long)(0L))));
            
            //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if (t$89643) {
                
                //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.FixedSizeStack this$89644 = ((x10.glb.FixedSizeStack)(lifelineThieves));
                
                //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final long t$89645 = thief$89642;
                
                //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final x10.core.Rail t$89630 = ((x10.core.Rail)(((x10.glb.FixedSizeStack<x10.core.Long>)this$89644).data));
                
                //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final long t$89631 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89644).size;
                
                //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final long t$89632 = ((t$89631) + (((long)(1L))));
                
                //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final long t$89633 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89644).size = t$89632;
                
                //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final long t$89634 = ((t$89633) - (((long)(1L))));
                
                //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                ((long[])t$89630.value)[(int)t$89634] = t$89645;
                
                //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.lang.Place alloc$89646 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                
                //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                alloc$89646.x10$lang$Place$$init$S(((long)(thief$89642)));
                
                //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                x10.lang.Runtime.runUncountedAsync(((x10.lang.Place)(alloc$89646)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$46<$Queue, $R>($Queue, $R, st, (x10.glb.Worker.$Closure$46.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$46$$Queue$3x10$glb$Worker$$Closure$46$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
            } else {
                
                //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.lang.Place alloc$89648 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                
                //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89635 = (-(thief$89642));
                
                //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89636 = ((t$89635) - (((long)(1L))));
                
                //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                alloc$89648.x10$lang$Place$$init$S(t$89636);
                
                //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                x10.lang.Runtime.runUncountedAsync(((x10.lang.Place)(alloc$89648)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$47<$Queue, $R>($Queue, $R, st, (x10.glb.Worker.$Closure$47.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$47$$Queue$3x10$glb$Worker$$Closure$47$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
            }
        }
    }
    
    
    //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    public boolean steal__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2$O(final x10.lang.PlaceLocalHandle st) {
        
        //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        final long t$89186 = P;
        
        //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        final boolean t$89187 = ((long) t$89186) == ((long) 1L);
        
        //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        if (t$89187) {
            
            //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            return false;
        }
        
        //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        final long p = ((long)x10.x10rt.X10RT.here());
        
        //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ((x10.glb.Worker<$Queue, $R>)this).empty = true;
        
        //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        long i$89683 = 0L;
        
        //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        for (;
             true;
             ) {
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89684 = i$89683;
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final int t$89685 = w;
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89686 = ((long)(((int)(t$89685))));
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            boolean t$89687 = ((t$89684) < (((long)(t$89686))));
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if (t$89687) {
                
                //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                t$89687 = empty;
            }
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final boolean t$89688 = t$89687;
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if (!(t$89688)) {
                
                //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                break;
            }
            
            //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Logger obj$89650 = ((x10.glb.Logger)(logger));
            
            //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89651 = obj$89650.stealsAttempted;
            
            //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89652 = ((t$89651) + (((long)(1L))));
            
            //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            obj$89650.stealsAttempted = t$89652;
            
            //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)this).waiting = true;
            
            //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Logger t$89653 = ((x10.glb.Logger)(logger));
            
            //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            t$89653.stopLive();
            
            //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.core.Rail t$89654 = ((x10.core.Rail)(victims));
            
            //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.util.Random t$89655 = ((x10.util.Random)(random));
            
            //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final int t$89656 = m;
            
            //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final int t$89657 = t$89655.nextInt$O((int)(t$89656));
            
            //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89658 = ((long)(((int)(t$89657))));
            
            //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long v$89659 = ((long[])t$89654.value)[(int)t$89658];
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.lang.Place alloc$89660 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            alloc$89660.x10$lang$Place$$init$S(((long)(v$89659)));
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x10.lang.Runtime.runUncountedAsync(((x10.lang.Place)(alloc$89660)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$48<$Queue, $R>($Queue, $R, st, p, (x10.glb.Worker.$Closure$48.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$48$$Queue$3x10$glb$Worker$$Closure$48$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            while (true) {
                
                //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final boolean t$89662 = waiting;
                
                //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (!(t$89662)) {
                    
                    //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    break;
                }
                
                //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                x10.lang.Runtime.probe();
            }
            
            //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Logger t$89663 = ((x10.glb.Logger)(logger));
            
            //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            t$89663.startLive();
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89664 = i$89683;
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89665 = ((t$89664) + (((long)(1L))));
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            i$89683 = t$89665;
        }
        
        //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        long i$89689 = 0L;
        
        //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        for (;
             true;
             ) {
            
            //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89690 = i$89689;
            
            //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.core.Rail t$89691 = ((x10.core.Rail)(lifelines));
            
            //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89692 = ((x10.core.Rail<x10.core.Long>)t$89691).size;
            
            //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            boolean t$89693 = ((t$89690) < (((long)(t$89692))));
            
            //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if (t$89693) {
                
                //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                t$89693 = empty;
            }
            
            //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            boolean t$89694 = t$89693;
            
            //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if (t$89694) {
                
                //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.core.Rail t$89695 = ((x10.core.Rail)(lifelines));
                
                //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89696 = i$89689;
                
                //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89697 = ((long[])t$89695.value)[(int)t$89696];
                
                //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                t$89694 = ((0L) <= (((long)(t$89697))));
            }
            
            //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final boolean t$89698 = t$89694;
            
            //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if (!(t$89698)) {
                
                //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                break;
            }
            
            //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.core.Rail t$89666 = ((x10.core.Rail)(lifelines));
            
            //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89667 = i$89689;
            
            //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long lifeline$89668 = ((long[])t$89666.value)[(int)t$89667];
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.core.Rail t$89669 = ((x10.core.Rail)(lifelinesActivated));
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final boolean t$89670 = ((boolean[])t$89669.value)[(int)lifeline$89668];
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final boolean t$89671 = !(t$89670);
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if (t$89671) {
                
                //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Logger obj$89672 = ((x10.glb.Logger)(logger));
                
                //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89673 = obj$89672.lifelineStealsAttempted;
                
                //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89674 = ((t$89673) + (((long)(1L))));
                
                //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                obj$89672.lifelineStealsAttempted = t$89674;
                
                //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.core.Rail t$89675 = ((x10.core.Rail)(lifelinesActivated));
                
                //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ((boolean[])t$89675.value)[(int)lifeline$89668] = true;
                
                //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ((x10.glb.Worker<$Queue, $R>)this).waiting = true;
                
                //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Logger t$89676 = ((x10.glb.Logger)(logger));
                
                //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                t$89676.stopLive();
                
                //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.lang.Place alloc$89677 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                
                //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                alloc$89677.x10$lang$Place$$init$S(((long)(lifeline$89668)));
                
                //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                x10.lang.Runtime.runUncountedAsync(((x10.lang.Place)(alloc$89677)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$49<$Queue, $R>($Queue, $R, st, p, (x10.glb.Worker.$Closure$49.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$49$$Queue$3x10$glb$Worker$$Closure$49$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
                
                //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                while (true) {
                    
                    //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final boolean t$89679 = waiting;
                    
                    //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    if (!(t$89679)) {
                        
                        //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        break;
                    }
                    
                    //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    x10.lang.Runtime.probe();
                }
                
                //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Logger t$89680 = ((x10.glb.Logger)(logger));
                
                //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                t$89680.startLive();
            }
            
            //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89681 = i$89689;
            
            //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89682 = ((t$89681) + (((long)(1L))));
            
            //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            i$89689 = t$89682;
        }
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        final boolean t$89231 = empty;
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        final boolean t$89232 = !(t$89231);
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        return t$89232;
    }
    
    
    //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    public void request__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(final x10.lang.PlaceLocalHandle st, final long thief, final boolean lifeline) {
        
        //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        try {{
            
            //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if (lifeline) {
                
                //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Logger obj$81498 = ((x10.glb.Logger)(logger));
                
                //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89233 = obj$81498.lifelineStealsReceived;
                
                //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89234 = ((t$89233) + (((long)(1L))));
                
                //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                obj$81498.lifelineStealsReceived = t$89234;
            } else {
                
                //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Logger obj$81506 = ((x10.glb.Logger)(logger));
                
                //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89235 = obj$81506.stealsReceived;
                
                //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89236 = ((t$89235) + (((long)(1L))));
                
                //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                obj$81506.stealsReceived = t$89236;
            }
            
            //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            boolean t$89237 = empty;
            
            //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if (!(t$89237)) {
                
                //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                t$89237 = waiting;
            }
            
            //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final boolean t$89255 = t$89237;
            
            //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if (t$89255) {
                
                //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (lifeline) {
                    
                    //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.FixedSizeStack this$88843 = ((x10.glb.FixedSizeStack)(lifelineThieves));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$88842 = thief;
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final x10.core.Rail t$89699 = ((x10.core.Rail)(((x10.glb.FixedSizeStack<x10.core.Long>)this$88843).data));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89700 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$88843).size;
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89701 = ((t$89700) + (((long)(1L))));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89702 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$88843).size = t$89701;
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89703 = ((t$89702) - (((long)(1L))));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    ((long[])t$89699.value)[(int)t$89703] = t$88842;
                }
                
                //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.lang.Place alloc$81717 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                
                //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                alloc$81717.x10$lang$Place$$init$S(((long)(thief)));
                
                //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                x10.lang.Runtime.runUncountedAsync(((x10.lang.Place)(alloc$81717)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$50<$Queue, $R>($Queue, $R, st, (x10.glb.Worker.$Closure$50.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$50$$Queue$3x10$glb$Worker$$Closure$50$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
            } else {
                
                //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (lifeline) {
                    
                    //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.FixedSizeStack this$88847 = ((x10.glb.FixedSizeStack)(thieves));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$88846 = thief;
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final x10.core.Rail t$89704 = ((x10.core.Rail)(((x10.glb.FixedSizeStack<x10.core.Long>)this$88847).data));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89705 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$88847).size;
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89706 = ((t$89705) + (((long)(1L))));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89707 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$88847).size = t$89706;
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89708 = ((t$89707) - (((long)(1L))));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    ((long[])t$89704.value)[(int)t$89708] = t$88846;
                } else {
                    
                    //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.FixedSizeStack this$88851 = ((x10.glb.FixedSizeStack)(thieves));
                    
                    //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89249 = (-(thief));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$88850 = ((t$89249) - (((long)(1L))));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final x10.core.Rail t$89709 = ((x10.core.Rail)(((x10.glb.FixedSizeStack<x10.core.Long>)this$88851).data));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89710 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$88851).size;
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89711 = ((t$89710) + (((long)(1L))));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89712 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$88851).size = t$89711;
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89713 = ((t$89712) - (((long)(1L))));
                    
                    //#line 38 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    ((long[])t$89709.value)[(int)t$89713] = t$88850;
                }
            }
        }}catch (final java.lang.Throwable v) {
            
            //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x10.glb.Worker.error(((java.lang.Throwable)(v)));
        }
    }
    
    
    //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    final public void processLoot(final x10.glb.TaskBag loot, final boolean lifeline) {
        
        //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        final long n = loot.size$O();
        
        //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        if (lifeline) {
            
            //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Logger obj$81528 = ((x10.glb.Logger)(logger));
            
            //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89256 = obj$81528.lifelineStealsPerpetrated;
            
            //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89257 = ((t$89256) + (((long)(1L))));
            
            //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            obj$81528.lifelineStealsPerpetrated = t$89257;
            
            //#line 266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Logger obj$81536 = ((x10.glb.Logger)(logger));
            
            //#line 266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89258 = obj$81536.lifelineNodesReceived;
            
            //#line 266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89259 = ((t$89258) + (((long)(n))));
            
            //#line 266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            obj$81536.lifelineNodesReceived = t$89259;
        } else {
            
            //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Logger obj$81544 = ((x10.glb.Logger)(logger));
            
            //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89260 = obj$81544.stealsPerpetrated;
            
            //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89261 = ((t$89260) + (((long)(1L))));
            
            //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            obj$81544.stealsPerpetrated = t$89261;
            
            //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Logger obj$81552 = ((x10.glb.Logger)(logger));
            
            //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89262 = obj$81552.nodesReceived;
            
            //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89263 = ((t$89262) + (((long)(n))));
            
            //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            obj$81552.nodesReceived = t$89263;
        }
        
        //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        final $Queue t$89264 = (($Queue)(queue));
        
        //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ((x10.glb.TaskQueue<$Queue, $R>)x10.rtt.Types.conversion(x10.rtt.ParameterizedType.make(x10.glb.TaskQueue.$RTT, $Queue, $R),t$89264)).merge(((x10.glb.TaskBag)(loot)));
    }
    
    
    //#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    public void deal__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(final x10.lang.PlaceLocalHandle st, final x10.glb.TaskBag loot, final long source) {
        
        //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        try {{
            
            //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final boolean lifeline = ((source) >= (((long)(0L))));
            
            //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if (lifeline) {
                
                //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.core.Rail t$89265 = ((x10.core.Rail)(lifelinesActivated));
                
                //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ((boolean[])t$89265.value)[(int)source] = false;
            }
            
            //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)this).empty = false;
            
            //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final boolean t$89289 = active;
            
            //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if (t$89289) {
                
                //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Worker this$88861 = ((x10.glb.Worker)(this));
                
                //#line 262 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.TaskBag loot$88854 = ((x10.glb.TaskBag)(loot));
                
                //#line 262 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final boolean lifeline$88855 = lifeline;
                
                //#line 263 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long n$89714 = loot$88854.size$O();
                
                //#line 264 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (lifeline$88855) {
                    
                    //#line 265 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.Logger obj$89715 = ((x10.glb.Logger)(((x10.glb.Worker<$Queue, $R>)this$88861).logger));
                    
                    //#line 265 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89716 = obj$89715.lifelineStealsPerpetrated;
                    
                    //#line 265 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89717 = ((t$89716) + (((long)(1L))));
                    
                    //#line 265 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    obj$89715.lifelineStealsPerpetrated = t$89717;
                    
                    //#line 266 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.Logger obj$89718 = ((x10.glb.Logger)(((x10.glb.Worker<$Queue, $R>)this$88861).logger));
                    
                    //#line 266 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89719 = obj$89718.lifelineNodesReceived;
                    
                    //#line 266 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89720 = ((t$89719) + (((long)(n$89714))));
                    
                    //#line 266 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    obj$89718.lifelineNodesReceived = t$89720;
                } else {
                    
                    //#line 268 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.Logger obj$89721 = ((x10.glb.Logger)(((x10.glb.Worker<$Queue, $R>)this$88861).logger));
                    
                    //#line 268 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89722 = obj$89721.stealsPerpetrated;
                    
                    //#line 268 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89723 = ((t$89722) + (((long)(1L))));
                    
                    //#line 268 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    obj$89721.stealsPerpetrated = t$89723;
                    
                    //#line 269 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.Logger obj$89724 = ((x10.glb.Logger)(((x10.glb.Worker<$Queue, $R>)this$88861).logger));
                    
                    //#line 269 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89725 = obj$89724.nodesReceived;
                    
                    //#line 269 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89726 = ((t$89725) + (((long)(n$89714))));
                    
                    //#line 269 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    obj$89724.nodesReceived = t$89726;
                }
                
                //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final $Queue t$89727 = (($Queue)(((x10.glb.Worker<$Queue, $R>)this$88861).queue));
                
                //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ((x10.glb.TaskQueue<$Queue, $R>)x10.rtt.Types.conversion(x10.rtt.ParameterizedType.make(x10.glb.TaskQueue.$RTT, $Queue, $R),t$89727)).merge(((x10.glb.TaskBag)(loot$88854)));
            } else {
                
                //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ((x10.glb.Worker<$Queue, $R>)this).active = true;
                
                //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Logger t$89275 = ((x10.glb.Logger)(logger));
                
                //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                t$89275.startLive();
                
                //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Worker this$88871 = ((x10.glb.Worker)(this));
                
                //#line 262 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.TaskBag loot$88864 = ((x10.glb.TaskBag)(loot));
                
                //#line 262 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final boolean lifeline$88865 = lifeline;
                
                //#line 263 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long n$89728 = loot$88864.size$O();
                
                //#line 264 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (lifeline$88865) {
                    
                    //#line 265 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.Logger obj$89729 = ((x10.glb.Logger)(((x10.glb.Worker<$Queue, $R>)this$88871).logger));
                    
                    //#line 265 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89730 = obj$89729.lifelineStealsPerpetrated;
                    
                    //#line 265 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89731 = ((t$89730) + (((long)(1L))));
                    
                    //#line 265 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    obj$89729.lifelineStealsPerpetrated = t$89731;
                    
                    //#line 266 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.Logger obj$89732 = ((x10.glb.Logger)(((x10.glb.Worker<$Queue, $R>)this$88871).logger));
                    
                    //#line 266 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89733 = obj$89732.lifelineNodesReceived;
                    
                    //#line 266 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89734 = ((t$89733) + (((long)(n$89728))));
                    
                    //#line 266 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    obj$89732.lifelineNodesReceived = t$89734;
                } else {
                    
                    //#line 268 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.Logger obj$89735 = ((x10.glb.Logger)(((x10.glb.Worker<$Queue, $R>)this$88871).logger));
                    
                    //#line 268 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89736 = obj$89735.stealsPerpetrated;
                    
                    //#line 268 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89737 = ((t$89736) + (((long)(1L))));
                    
                    //#line 268 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    obj$89735.stealsPerpetrated = t$89737;
                    
                    //#line 269 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.Logger obj$89738 = ((x10.glb.Logger)(((x10.glb.Worker<$Queue, $R>)this$88871).logger));
                    
                    //#line 269 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89739 = obj$89738.nodesReceived;
                    
                    //#line 269 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89740 = ((t$89739) + (((long)(n$89728))));
                    
                    //#line 269 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    obj$89738.nodesReceived = t$89740;
                }
                
                //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final $Queue t$89741 = (($Queue)(((x10.glb.Worker<$Queue, $R>)this$88871).queue));
                
                //#line 271 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ((x10.glb.TaskQueue<$Queue, $R>)x10.rtt.Types.conversion(x10.rtt.ParameterizedType.make(x10.glb.TaskQueue.$RTT, $Queue, $R),t$89741)).merge(((x10.glb.TaskBag)(loot$88864)));
                
                //#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                this.processStack__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(((x10.lang.PlaceLocalHandle)(st)));
                
                //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Logger t$89285 = ((x10.glb.Logger)(logger));
                
                //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                t$89285.stopLive();
                
                //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ((x10.glb.Worker<$Queue, $R>)this).active = false;
                
                //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Logger t$89287 = ((x10.glb.Logger)(logger));
                
                //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final $Queue t$89286 = (($Queue)(queue));
                
                //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89288 = ((x10.glb.TaskQueue<$Queue, $R>)x10.rtt.Types.conversion(x10.rtt.ParameterizedType.make(x10.glb.TaskQueue.$RTT, $Queue, $R),t$89286)).count$O();
                
                //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                t$89287.nodesCount = t$89288;
            }
        }}catch (final java.lang.Throwable v) {
            
            //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x10.glb.Worker.error(((java.lang.Throwable)(v)));
        }
    }
    
    
    //#line 311 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    public void main__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(final x10.lang.PlaceLocalHandle st, final x10.core.fun.VoidFun_0_0 start) {
        {
            
            //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x10.lang.Runtime.ensureNotInAtomic();
            
            //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.lang.FinishState x10$__var1 = x10.lang.Runtime.startFinish((int)(x10.compiler.Pragma.FINISH_DENSE));
            
            //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            try {{
                {
                    
                    //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    try {{
                        
                        //#line 314 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        ((x10.glb.Worker<$Queue, $R>)this).empty = false;
                        
                        //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        ((x10.glb.Worker<$Queue, $R>)this).active = true;
                        
                        //#line 316 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final x10.glb.Logger t$89290 = ((x10.glb.Logger)(logger));
                        
                        //#line 316 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        t$89290.startLive();
                        
                        //#line 317 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        ((x10.core.fun.VoidFun_0_0)start).$apply();
                        
                        //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        this.processStack__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(((x10.lang.PlaceLocalHandle)(st)));
                        
                        //#line 319 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final x10.glb.Logger t$89291 = ((x10.glb.Logger)(logger));
                        
                        //#line 319 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        t$89291.stopLive();
                        
                        //#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        ((x10.glb.Worker<$Queue, $R>)this).active = false;
                        
                        //#line 321 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final x10.glb.Logger t$89293 = ((x10.glb.Logger)(logger));
                        
                        //#line 321 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final $Queue t$89292 = (($Queue)(queue));
                        
                        //#line 321 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final long t$89294 = ((x10.glb.TaskQueue<$Queue, $R>)x10.rtt.Types.conversion(x10.rtt.ParameterizedType.make(x10.glb.TaskQueue.$RTT, $Queue, $R),t$89292)).count$O();
                        
                        //#line 321 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        t$89293.nodesCount = t$89294;
                    }}catch (final java.lang.Throwable v) {
                        
                        //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        x10.glb.Worker.error(((java.lang.Throwable)(v)));
                    }
                }
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__0__)));
                
                //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                 x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var1)));
             }}
            }
        }
    
    
    //#line 335 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    public void main__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(final x10.lang.PlaceLocalHandle st) {
        
        //#line 336 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        try {{
            
            //#line 337 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)this).empty = false;
            
            //#line 338 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)this).active = true;
            
            //#line 339 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Logger t$89295 = ((x10.glb.Logger)(logger));
            
            //#line 339 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            t$89295.startLive();
            
            //#line 340 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            this.processStack__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(((x10.lang.PlaceLocalHandle)(st)));
            
            //#line 341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Logger t$89296 = ((x10.glb.Logger)(logger));
            
            //#line 341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            t$89296.stopLive();
            
            //#line 342 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)this).active = false;
            
            //#line 343 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Logger t$89298 = ((x10.glb.Logger)(logger));
            
            //#line 343 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final $Queue t$89297 = (($Queue)(queue));
            
            //#line 343 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final long t$89299 = ((x10.glb.TaskQueue<$Queue, $R>)x10.rtt.Types.conversion(x10.rtt.ParameterizedType.make(x10.glb.TaskQueue.$RTT, $Queue, $R),t$89297)).count$O();
            
            //#line 343 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            t$89298.nodesCount = t$89299;
        }}catch (final java.lang.Throwable v) {
            
            //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x10.glb.Worker.error(((java.lang.Throwable)(v)));
        }
    }
    
    
    //#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    public static void error(final java.lang.Throwable v) {
        
        //#line 354 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        final java.lang.String t$89300 = (("Exception at ") + (x10.lang.Place.place(x10.x10rt.X10RT.here())));
        
        //#line 354 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        java.lang.System.err.println(t$89300);
        
        //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        v.printStackTrace();
    }
    
    
    //#line 361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    public static long min$O(final long i, final long j) {
        
        //#line 361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        final boolean t$89301 = ((i) < (((long)(j))));
        
        //#line 361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        long t$89302 =  0;
        
        //#line 361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        if (t$89301) {
            
            //#line 361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            t$89302 = i;
        } else {
            
            //#line 361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            t$89302 = j;
        }
        
        //#line 361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        final long t$89303 = t$89302;
        
        //#line 361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        return t$89303;
    }
    
    
    //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    public static <$Queue, $R>void broadcast__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st) {
        
        //#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        final long P = x10.lang.Place.get$MAX_PLACES();
        {
            
            //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x10.lang.Runtime.ensureNotInAtomic();
            
            //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.lang.FinishState x10$__var2 = x10.lang.Runtime.startFinish((int)(x10.compiler.Pragma.FINISH_DENSE));
            
            //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            try {{
                {
                    
                    //#line 393 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final boolean t$89325 = ((P) < (((long)(256L))));
                    
                    //#line 393 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    if (t$89325) {
                        
                        //#line 394 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        long i = 0L;
                        
                        //#line 394 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        for (;
                             true;
                             ) {
                            
                            //#line 394 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final long t$89305 = i;
                            
                            //#line 394 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final boolean t$89310 = ((t$89305) < (((long)(P))));
                            
                            //#line 394 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            if (!(t$89310)) {
                                
                                //#line 394 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                                break;
                            }
                            
                            //#line 395 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final x10.lang.Place alloc$89743 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                            
                            //#line 395 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final long t$89742 = i;
                            
                            //#line 395 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            alloc$89743.x10$lang$Place$$init$S(t$89742);
                            
                            //#line 395 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            x10.lang.Runtime.runAsync(((x10.lang.Place)(alloc$89743)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$51<$Queue, $R>($Queue, $R, st, (x10.glb.Worker.$Closure$51.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$51$$Queue$3x10$glb$Worker$$Closure$51$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
                            
                            //#line 394 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final long t$89745 = i;
                            
                            //#line 394 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final long t$89746 = ((t$89745) + (((long)(1L))));
                            
                            //#line 394 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            i = t$89746;
                        }
                    } else {
                        
                        //#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        long i = ((P) - (((long)(1L))));
                        
                        //#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        for (;
                             true;
                             ) {
                            
                            //#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final long t$89312 = i;
                            
                            //#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final boolean t$89324 = ((t$89312) >= (((long)(0L))));
                            
                            //#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            if (!(t$89324)) {
                                
                                //#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                                break;
                            }
                            
                            //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final x10.lang.Place alloc$89756 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                            
                            //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final long t$89755 = i;
                            
                            //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            alloc$89756.x10$lang$Place$$init$S(t$89755);
                            
                            //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            x10.lang.Runtime.runAsync(((x10.lang.Place)(alloc$89756)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$53<$Queue, $R>($Queue, $R, st, (x10.glb.Worker.$Closure$53.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$53$$Queue$3x10$glb$Worker$$Closure$53$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
                            
                            //#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final long t$89760 = i;
                            
                            //#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final long t$89761 = ((t$89760) - (((long)(32L))));
                            
                            //#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            i = t$89761;
                        }
                    }
                }
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__0__)));
                
                //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                 x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var2)));
             }}
            }
        }
    
    
    //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    public static <$Queue, $R>void initContexts__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st) {
        
        //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        final long P = x10.lang.Place.get$MAX_PLACES();
        {
            
            //#line 416 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x10.lang.Runtime.ensureNotInAtomic();
            
            //#line 416 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.lang.FinishState x10$__var3 = x10.lang.Runtime.startFinish((int)(x10.compiler.Pragma.FINISH_DENSE));
            
            //#line 416 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            try {{
                {
                    
                    //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final boolean t$89347 = ((P) < (((long)(256L))));
                    
                    //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    if (t$89347) {
                        
                        //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        long i = 0L;
                        
                        //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        for (;
                             true;
                             ) {
                            
                            //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final long t$89327 = i;
                            
                            //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final boolean t$89332 = ((t$89327) < (((long)(P))));
                            
                            //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            if (!(t$89332)) {
                                
                                //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                                break;
                            }
                            
                            //#line 419 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final x10.lang.Place alloc$89766 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                            
                            //#line 419 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final long t$89765 = i;
                            
                            //#line 419 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            alloc$89766.x10$lang$Place$$init$S(t$89765);
                            
                            //#line 419 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            x10.lang.Runtime.runAsync(((x10.lang.Place)(alloc$89766)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$54<$Queue, $R>($Queue, $R, st, (x10.glb.Worker.$Closure$54.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$54$$Queue$3x10$glb$Worker$$Closure$54$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
                            
                            //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final long t$89769 = i;
                            
                            //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final long t$89770 = ((t$89769) + (((long)(1L))));
                            
                            //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            i = t$89770;
                        }
                    } else {
                        
                        //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        long i = ((P) - (((long)(1L))));
                        
                        //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        for (;
                             true;
                             ) {
                            
                            //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final long t$89334 = i;
                            
                            //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final boolean t$89346 = ((t$89334) >= (((long)(0L))));
                            
                            //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            if (!(t$89346)) {
                                
                                //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                                break;
                            }
                            
                            //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final x10.lang.Place alloc$89784 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                            
                            //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final long t$89783 = i;
                            
                            //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            alloc$89784.x10$lang$Place$$init$S(t$89783);
                            
                            //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            x10.lang.Runtime.runAsync(((x10.lang.Place)(alloc$89784)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$56<$Queue, $R>($Queue, $R, st, (x10.glb.Worker.$Closure$56.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$56$$Queue$3x10$glb$Worker$$Closure$56$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
                            
                            //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final long t$89788 = i;
                            
                            //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            final long t$89789 = ((t$89788) - (((long)(32L))));
                            
                            //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            i = t$89789;
                        }
                    }
                }
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 416 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__0__)));
                
                //#line 416 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                throw new java.lang.RuntimeException();
            }finally {{
                 
                 //#line 416 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                 x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var3)));
             }}
            }
        }
    
    
    //#line 438 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    public x10.core.fun.VoidFun_0_1 getYieldPoint() {
        
        //#line 439 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        final x10.core.fun.VoidFun_0_1 t$89399 = ((x10.core.fun.VoidFun_0_1)(new x10.glb.Worker.$Closure$62<$Queue, $R>($Queue, $R, ((x10.glb.Worker<$Queue, $R>)(this)), (x10.glb.Worker.$Closure$62.__0$1x10$glb$Worker$$Closure$62$$Queue$3x10$glb$Worker$$Closure$62$$R$2) null)));
        
        //#line 439 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        return t$89399;
    }
    
    
    //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    public void setContext__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(final x10.lang.PlaceLocalHandle st) {
        
        //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        final x10.glb.Context alloc$81724 = ((x10.glb.Context)(new x10.glb.Context<$Queue, $R>((java.lang.System[]) null, $Queue, $R)));
        
        //#line 19 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
        final x10.lang.PlaceLocalHandle st$88929 = ((x10.lang.PlaceLocalHandle)(st));
        
        //#line 14 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
        final x10.lang.PlaceLocalHandle t$89866 = (x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>) x10.rtt.Types.zeroValue(x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, x10.rtt.ParameterizedType.make(x10.glb.Worker.$RTT, $Queue, $R)));
        
        //#line 9 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
        ((x10.glb.Context<$Queue, $R>)alloc$81724).st = t$89866;
        
        //#line 20 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
        ((x10.glb.Context<$Queue, $R>)alloc$81724).st = ((x10.lang.PlaceLocalHandle)(st$88929));
        
        //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ((x10.glb.Worker<$Queue, $R>)this).context = ((x10.glb.Context)(alloc$81724));
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    final public x10.glb.Worker x10$glb$Worker$$this$x10$glb$Worker() {
        
        //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        return x10.glb.Worker.this;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    final public void __fieldInitializers_x10_glb_Worker() {
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        final x10.util.Random alloc$81725 = ((x10.util.Random)(new x10.util.Random((java.lang.System[]) null)));
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        final int t$89867 = x10.x10rt.X10RT.here();
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        final long t$89868 = ((long)(((int)(t$89867))));
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        alloc$81725.x10$util$Random$$init$S(t$89868);
        
        //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ((x10.glb.Worker<$Queue, $R>)this).random = ((x10.util.Random)(alloc$81725));
        
        //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ((x10.glb.Worker<$Queue, $R>)this).active = false;
        
        //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ((x10.glb.Worker<$Queue, $R>)this).empty = true;
        
        //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ((x10.glb.Worker<$Queue, $R>)this).waiting = false;
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        final long t$89403 = x10.lang.Place.get$MAX_PLACES();
        
        //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ((x10.glb.Worker<$Queue, $R>)this).P = t$89403;
        
        //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ((x10.glb.Worker<$Queue, $R>)this).context = null;
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$33<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$33> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$33> make($Closure$33.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$33<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st$89515 = $deserializer.readObject();
            $_obj.loot$89516 = $deserializer.readObject();
            $_obj.victim$89477 = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$33 $_obj = new x10.glb.Worker.$Closure$33((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st$89515);
            $serializer.write(this.loot$89516);
            $serializer.write(this.victim$89477);
            
        }
        
        // constructor just for allocation
        public $Closure$33(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$33.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$33 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$33$$Queue$3x10$glb$Worker$$Closure$33$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 155 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$89496 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st$89515).$apply$G();
            
            //#line 155 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$89496).deal__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(((x10.lang.PlaceLocalHandle)(this.st$89515)), ((x10.glb.TaskBag)(this.loot$89516)), (long)(this.victim$89477));
            
            //#line 155 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$89497 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st$89515).$apply$G();
            
            //#line 155 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$89497).waiting = false;
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$89515;
        public x10.glb.TaskBag loot$89516;
        public long victim$89477;
        
        public $Closure$33(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$89515, final x10.glb.TaskBag loot$89516, final long victim$89477, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$33$$Queue$3x10$glb$Worker$$Closure$33$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$33.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$33<$Queue, $R>)this).st$89515 = ((x10.lang.PlaceLocalHandle)(st$89515));
                ((x10.glb.Worker.$Closure$33<$Queue, $R>)this).loot$89516 = ((x10.glb.TaskBag)(loot$89516));
                ((x10.glb.Worker.$Closure$33<$Queue, $R>)this).victim$89477 = victim$89477;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$34<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$34> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$34> make($Closure$34.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$34<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st$89515 = $deserializer.readObject();
            $_obj.loot$89516 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$34 $_obj = new x10.glb.Worker.$Closure$34((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st$89515);
            $serializer.write(this.loot$89516);
            
        }
        
        // constructor just for allocation
        public $Closure$34(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$34.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$34 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$34$$Queue$3x10$glb$Worker$$Closure$34$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 158 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$89502 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st$89515).$apply$G();
            
            //#line 158 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$89502).deal__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(((x10.lang.PlaceLocalHandle)(this.st$89515)), ((x10.glb.TaskBag)(this.loot$89516)), (long)(-1L));
            
            //#line 158 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$89503 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st$89515).$apply$G();
            
            //#line 158 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$89503).waiting = false;
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$89515;
        public x10.glb.TaskBag loot$89516;
        
        public $Closure$34(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$89515, final x10.glb.TaskBag loot$89516, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$34$$Queue$3x10$glb$Worker$$Closure$34$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$34.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$34<$Queue, $R>)this).st$89515 = ((x10.lang.PlaceLocalHandle)(st$89515));
                ((x10.glb.Worker.$Closure$34<$Queue, $R>)this).loot$89516 = ((x10.glb.TaskBag)(loot$89516));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$35<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$35> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$35> make($Closure$35.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$35<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st$89515 = $deserializer.readObject();
            $_obj.loot$89516 = $deserializer.readObject();
            $_obj.victim$89477 = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$35 $_obj = new x10.glb.Worker.$Closure$35((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st$89515);
            $serializer.write(this.loot$89516);
            $serializer.write(this.victim$89477);
            
        }
        
        // constructor just for allocation
        public $Closure$35(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$35.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$35 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$35$$Queue$3x10$glb$Worker$$Closure$35$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 163 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            try {{
                
                //#line 163 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Worker t$89514 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st$89515).$apply$G();
                
                //#line 163 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ((x10.glb.Worker<$Queue, $R>)t$89514).deal__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(((x10.lang.PlaceLocalHandle)(this.st$89515)), ((x10.glb.TaskBag)(this.loot$89516)), (long)(this.victim$89477));
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 163 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 163 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$89515;
        public x10.glb.TaskBag loot$89516;
        public long victim$89477;
        
        public $Closure$35(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$89515, final x10.glb.TaskBag loot$89516, final long victim$89477, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$35$$Queue$3x10$glb$Worker$$Closure$35$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$35.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$35<$Queue, $R>)this).st$89515 = ((x10.lang.PlaceLocalHandle)(st$89515));
                ((x10.glb.Worker.$Closure$35<$Queue, $R>)this).loot$89516 = ((x10.glb.TaskBag)(loot$89516));
                ((x10.glb.Worker.$Closure$35<$Queue, $R>)this).victim$89477 = victim$89477;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$36<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$36> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$36> make($Closure$36.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$36<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st$89554 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$36 $_obj = new x10.glb.Worker.$Closure$36((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st$89554);
            
        }
        
        // constructor just for allocation
        public $Closure$36(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$36.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$36 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$36$$Queue$3x10$glb$Worker$$Closure$36$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$89534 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st$89554).$apply$G();
            
            //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$89534).waiting = false;
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$89554;
        
        public $Closure$36(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$89554, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$36$$Queue$3x10$glb$Worker$$Closure$36$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$36.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$36<$Queue, $R>)this).st$89554 = ((x10.lang.PlaceLocalHandle)(st$89554));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$37<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$37> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$37> make($Closure$37.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$37<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st$89554 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$37 $_obj = new x10.glb.Worker.$Closure$37((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st$89554);
            
        }
        
        // constructor just for allocation
        public $Closure$37(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$37.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$37 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$37$$Queue$3x10$glb$Worker$$Closure$37$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 191 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$89536 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st$89554).$apply$G();
            
            //#line 191 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$89536).waiting = false;
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$89554;
        
        public $Closure$37(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$89554, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$37$$Queue$3x10$glb$Worker$$Closure$37$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$37.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$37<$Queue, $R>)this).st$89554 = ((x10.lang.PlaceLocalHandle)(st$89554));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$38<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$38> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$38> make($Closure$38.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$38<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st$89584 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$38 $_obj = new x10.glb.Worker.$Closure$38((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st$89584);
            
        }
        
        // constructor just for allocation
        public $Closure$38(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$38.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$38 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$38$$Queue$3x10$glb$Worker$$Closure$38$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$89572 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st$89584).$apply$G();
            
            //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$89572).waiting = false;
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$89584;
        
        public $Closure$38(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$89584, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$38$$Queue$3x10$glb$Worker$$Closure$38$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$38.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$38<$Queue, $R>)this).st$89584 = ((x10.lang.PlaceLocalHandle)(st$89584));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$39<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$39> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$39> make($Closure$39.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$39<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st$89584 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$39 $_obj = new x10.glb.Worker.$Closure$39((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st$89584);
            
        }
        
        // constructor just for allocation
        public $Closure$39(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$39.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$39 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$39$$Queue$3x10$glb$Worker$$Closure$39$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 191 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$89574 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st$89584).$apply$G();
            
            //#line 191 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$89574).waiting = false;
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$89584;
        
        public $Closure$39(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$89584, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$39$$Queue$3x10$glb$Worker$$Closure$39$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$39.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$39<$Queue, $R>)this).st$89584 = ((x10.lang.PlaceLocalHandle)(st$89584));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$40<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$40> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$40> make($Closure$40.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$40<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st = $deserializer.readObject();
            $_obj.loot = $deserializer.readObject();
            $_obj.victim = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$40 $_obj = new x10.glb.Worker.$Closure$40((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st);
            $serializer.write(this.loot);
            $serializer.write(this.victim);
            
        }
        
        // constructor just for allocation
        public $Closure$40(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$40.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$40 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$40$$Queue$3x10$glb$Worker$$Closure$40$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$89118 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st).$apply$G();
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$89118).deal__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(((x10.lang.PlaceLocalHandle)(this.st)), ((x10.glb.TaskBag)(this.loot)), (long)(this.victim));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$89119 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st).$apply$G();
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$89119).waiting = false;
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st;
        public x10.glb.TaskBag loot;
        public long victim;
        
        public $Closure$40(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st, final x10.glb.TaskBag loot, final long victim, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$40$$Queue$3x10$glb$Worker$$Closure$40$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$40.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$40<$Queue, $R>)this).st = ((x10.lang.PlaceLocalHandle)(st));
                ((x10.glb.Worker.$Closure$40<$Queue, $R>)this).loot = ((x10.glb.TaskBag)(loot));
                ((x10.glb.Worker.$Closure$40<$Queue, $R>)this).victim = victim;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$41<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$41> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$41> make($Closure$41.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$41<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st = $deserializer.readObject();
            $_obj.loot = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$41 $_obj = new x10.glb.Worker.$Closure$41((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st);
            $serializer.write(this.loot);
            
        }
        
        // constructor just for allocation
        public $Closure$41(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$41.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$41 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$41$$Queue$3x10$glb$Worker$$Closure$41$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$89124 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st).$apply$G();
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$89124).deal__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(((x10.lang.PlaceLocalHandle)(this.st)), ((x10.glb.TaskBag)(this.loot)), (long)(-1L));
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$89125 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st).$apply$G();
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$89125).waiting = false;
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st;
        public x10.glb.TaskBag loot;
        
        public $Closure$41(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st, final x10.glb.TaskBag loot, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$41$$Queue$3x10$glb$Worker$$Closure$41$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$41.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$41<$Queue, $R>)this).st = ((x10.lang.PlaceLocalHandle)(st));
                ((x10.glb.Worker.$Closure$41<$Queue, $R>)this).loot = ((x10.glb.TaskBag)(loot));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$42<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$42> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$42> make($Closure$42.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$42<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st = $deserializer.readObject();
            $_obj.loot = $deserializer.readObject();
            $_obj.victim = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$42 $_obj = new x10.glb.Worker.$Closure$42((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st);
            $serializer.write(this.loot);
            $serializer.write(this.victim);
            
        }
        
        // constructor just for allocation
        public $Closure$42(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$42.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$42 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$42$$Queue$3x10$glb$Worker$$Closure$42$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            try {{
                
                //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Worker t$89133 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st).$apply$G();
                
                //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ((x10.glb.Worker<$Queue, $R>)t$89133).deal__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(((x10.lang.PlaceLocalHandle)(this.st)), ((x10.glb.TaskBag)(this.loot)), (long)(this.victim));
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st;
        public x10.glb.TaskBag loot;
        public long victim;
        
        public $Closure$42(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st, final x10.glb.TaskBag loot, final long victim, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$42$$Queue$3x10$glb$Worker$$Closure$42$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$42.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$42<$Queue, $R>)this).st = ((x10.lang.PlaceLocalHandle)(st));
                ((x10.glb.Worker.$Closure$42<$Queue, $R>)this).loot = ((x10.glb.TaskBag)(loot));
                ((x10.glb.Worker.$Closure$42<$Queue, $R>)this).victim = victim;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$43<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$43> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$43> make($Closure$43.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$43<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st$89628 = $deserializer.readObject();
            $_obj.loot$89629 = $deserializer.readObject();
            $_obj.victim$89589 = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$43 $_obj = new x10.glb.Worker.$Closure$43((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st$89628);
            $serializer.write(this.loot$89629);
            $serializer.write(this.victim$89589);
            
        }
        
        // constructor just for allocation
        public $Closure$43(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$43.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$43 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$43$$Queue$3x10$glb$Worker$$Closure$43$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$89608 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st$89628).$apply$G();
            
            //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$89608).deal__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(((x10.lang.PlaceLocalHandle)(this.st$89628)), ((x10.glb.TaskBag)(this.loot$89629)), (long)(this.victim$89589));
            
            //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$89609 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st$89628).$apply$G();
            
            //#line 155 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$89609).waiting = false;
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$89628;
        public x10.glb.TaskBag loot$89629;
        public long victim$89589;
        
        public $Closure$43(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$89628, final x10.glb.TaskBag loot$89629, final long victim$89589, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$43$$Queue$3x10$glb$Worker$$Closure$43$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$43.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$43<$Queue, $R>)this).st$89628 = ((x10.lang.PlaceLocalHandle)(st$89628));
                ((x10.glb.Worker.$Closure$43<$Queue, $R>)this).loot$89629 = ((x10.glb.TaskBag)(loot$89629));
                ((x10.glb.Worker.$Closure$43<$Queue, $R>)this).victim$89589 = victim$89589;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$44<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$44> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$44> make($Closure$44.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$44<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st$89628 = $deserializer.readObject();
            $_obj.loot$89629 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$44 $_obj = new x10.glb.Worker.$Closure$44((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st$89628);
            $serializer.write(this.loot$89629);
            
        }
        
        // constructor just for allocation
        public $Closure$44(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$44.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$44 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$44$$Queue$3x10$glb$Worker$$Closure$44$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 158 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$89614 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st$89628).$apply$G();
            
            //#line 158 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$89614).deal__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(((x10.lang.PlaceLocalHandle)(this.st$89628)), ((x10.glb.TaskBag)(this.loot$89629)), (long)(-1L));
            
            //#line 158 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$89615 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st$89628).$apply$G();
            
            //#line 158 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$89615).waiting = false;
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$89628;
        public x10.glb.TaskBag loot$89629;
        
        public $Closure$44(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$89628, final x10.glb.TaskBag loot$89629, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$44$$Queue$3x10$glb$Worker$$Closure$44$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$44.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$44<$Queue, $R>)this).st$89628 = ((x10.lang.PlaceLocalHandle)(st$89628));
                ((x10.glb.Worker.$Closure$44<$Queue, $R>)this).loot$89629 = ((x10.glb.TaskBag)(loot$89629));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$45<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$45> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$45> make($Closure$45.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$45<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st$89628 = $deserializer.readObject();
            $_obj.loot$89629 = $deserializer.readObject();
            $_obj.victim$89589 = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$45 $_obj = new x10.glb.Worker.$Closure$45((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st$89628);
            $serializer.write(this.loot$89629);
            $serializer.write(this.victim$89589);
            
        }
        
        // constructor just for allocation
        public $Closure$45(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$45.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$45 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$45$$Queue$3x10$glb$Worker$$Closure$45$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 163 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            try {{
                
                //#line 163 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Worker t$89626 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st$89628).$apply$G();
                
                //#line 163 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ((x10.glb.Worker<$Queue, $R>)t$89626).deal__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(((x10.lang.PlaceLocalHandle)(this.st$89628)), ((x10.glb.TaskBag)(this.loot$89629)), (long)(this.victim$89589));
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 163 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 163 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$89628;
        public x10.glb.TaskBag loot$89629;
        public long victim$89589;
        
        public $Closure$45(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$89628, final x10.glb.TaskBag loot$89629, final long victim$89589, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$45$$Queue$3x10$glb$Worker$$Closure$45$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$45.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$45<$Queue, $R>)this).st$89628 = ((x10.lang.PlaceLocalHandle)(st$89628));
                ((x10.glb.Worker.$Closure$45<$Queue, $R>)this).loot$89629 = ((x10.glb.TaskBag)(loot$89629));
                ((x10.glb.Worker.$Closure$45<$Queue, $R>)this).victim$89589 = victim$89589;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$46<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$46> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$46> make($Closure$46.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$46<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$46 $_obj = new x10.glb.Worker.$Closure$46((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st);
            
        }
        
        // constructor just for allocation
        public $Closure$46(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$46.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$46 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$46$$Queue$3x10$glb$Worker$$Closure$46$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$89647 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st).$apply$G();
            
            //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$89647).waiting = false;
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st;
        
        public $Closure$46(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$46$$Queue$3x10$glb$Worker$$Closure$46$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$46.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$46<$Queue, $R>)this).st = ((x10.lang.PlaceLocalHandle)(st));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$47<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$47> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$47> make($Closure$47.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$47<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$47 $_obj = new x10.glb.Worker.$Closure$47((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st);
            
        }
        
        // constructor just for allocation
        public $Closure$47(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$47.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$47 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$47$$Queue$3x10$glb$Worker$$Closure$47$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$89649 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st).$apply$G();
            
            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$89649).waiting = false;
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st;
        
        public $Closure$47(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$47$$Queue$3x10$glb$Worker$$Closure$47$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$47.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$47<$Queue, $R>)this).st = ((x10.lang.PlaceLocalHandle)(st));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$48<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$48> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$48> make($Closure$48.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$48<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st = $deserializer.readObject();
            $_obj.p = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$48 $_obj = new x10.glb.Worker.$Closure$48((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st);
            $serializer.write(this.p);
            
        }
        
        // constructor just for allocation
        public $Closure$48(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$48.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$48 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$48$$Queue$3x10$glb$Worker$$Closure$48$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$89661 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st).$apply$G();
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$89661).request__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(((x10.lang.PlaceLocalHandle)(this.st)), (long)(this.p), (boolean)(false));
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st;
        public long p;
        
        public $Closure$48(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st, final long p, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$48$$Queue$3x10$glb$Worker$$Closure$48$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$48.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$48<$Queue, $R>)this).st = ((x10.lang.PlaceLocalHandle)(st));
                ((x10.glb.Worker.$Closure$48<$Queue, $R>)this).p = p;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$49<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$49> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$49> make($Closure$49.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$49<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st = $deserializer.readObject();
            $_obj.p = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$49 $_obj = new x10.glb.Worker.$Closure$49((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st);
            $serializer.write(this.p);
            
        }
        
        // constructor just for allocation
        public $Closure$49(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$49.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$49 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$49$$Queue$3x10$glb$Worker$$Closure$49$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$89678 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st).$apply$G();
            
            //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$89678).request__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(((x10.lang.PlaceLocalHandle)(this.st)), (long)(this.p), (boolean)(true));
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st;
        public long p;
        
        public $Closure$49(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st, final long p, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$49$$Queue$3x10$glb$Worker$$Closure$49$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$49.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$49<$Queue, $R>)this).st = ((x10.lang.PlaceLocalHandle)(st));
                ((x10.glb.Worker.$Closure$49<$Queue, $R>)this).p = p;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$50<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$50> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$50> make($Closure$50.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$50<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$50 $_obj = new x10.glb.Worker.$Closure$50((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st);
            
        }
        
        // constructor just for allocation
        public $Closure$50(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$50.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$50 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$50$$Queue$3x10$glb$Worker$$Closure$50$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$89243 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st).$apply$G();
            
            //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$89243).waiting = false;
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st;
        
        public $Closure$50(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$50$$Queue$3x10$glb$Worker$$Closure$50$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$50.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$50<$Queue, $R>)this).st = ((x10.lang.PlaceLocalHandle)(st));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$51<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$51> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$51> make($Closure$51.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$51<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$51 $_obj = new x10.glb.Worker.$Closure$51((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st);
            
        }
        
        // constructor just for allocation
        public $Closure$51(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$51.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$51 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$51$$Queue$3x10$glb$Worker$$Closure$51$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 395 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            try {{
                
                //#line 395 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Worker t$89744 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st).$apply$G();
                
                //#line 395 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ((x10.glb.Worker<$Queue, $R>)t$89744).main__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(((x10.lang.PlaceLocalHandle)(this.st)));
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 395 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 395 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st;
        
        public $Closure$51(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$51$$Queue$3x10$glb$Worker$$Closure$51$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$51.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$51<$Queue, $R>)this).st = ((x10.lang.PlaceLocalHandle)(st));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$52<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$52> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$52> make($Closure$52.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$52<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$52 $_obj = new x10.glb.Worker.$Closure$52((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st);
            
        }
        
        // constructor just for allocation
        public $Closure$52(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$52.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$52 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$52$$Queue$3x10$glb$Worker$$Closure$52$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 403 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            try {{
                
                //#line 403 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Worker t$89749 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st).$apply$G();
                
                //#line 403 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ((x10.glb.Worker<$Queue, $R>)t$89749).main__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(((x10.lang.PlaceLocalHandle)(this.st)));
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 403 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 403 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st;
        
        public $Closure$52(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$52$$Queue$3x10$glb$Worker$$Closure$52$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$52.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$52<$Queue, $R>)this).st = ((x10.lang.PlaceLocalHandle)(st));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$53<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$53> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$53> make($Closure$53.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$53<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$53 $_obj = new x10.glb.Worker.$Closure$53((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st);
            
        }
        
        // constructor just for allocation
        public $Closure$53(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$53.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$53 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$53$$Queue$3x10$glb$Worker$$Closure$53$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            try {{
                
                //#line 400 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long max$89757 = ((long)x10.x10rt.X10RT.here());
                
                //#line 401 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89758 = ((max$89757) - (((long)(31L))));
                
                //#line 401 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long min$89759 = java.lang.Math.max(((long)(t$89758)),((long)(0L)));
                
                //#line 402 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                long j$89752 = min$89759;
                
                //#line 402 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 402 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89753 = j$89752;
                    
                    //#line 402 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final boolean t$89754 = ((t$89753) <= (((long)(max$89757))));
                    
                    //#line 402 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    if (!(t$89754)) {
                        
                        //#line 402 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        break;
                    }
                    
                    //#line 403 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.lang.Place alloc$89748 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                    
                    //#line 403 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89747 = j$89752;
                    
                    //#line 403 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    alloc$89748.x10$lang$Place$$init$S(t$89747);
                    
                    //#line 403 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    x10.lang.Runtime.runAsync(((x10.lang.Place)(alloc$89748)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$52<$Queue, $R>($Queue, $R, ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)(this.st)), (x10.glb.Worker.$Closure$52.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$52$$Queue$3x10$glb$Worker$$Closure$52$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
                    
                    //#line 402 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89750 = j$89752;
                    
                    //#line 402 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89751 = ((t$89750) + (((long)(1L))));
                    
                    //#line 402 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    j$89752 = t$89751;
                }
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st;
        
        public $Closure$53(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$53$$Queue$3x10$glb$Worker$$Closure$53$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$53.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$53<$Queue, $R>)this).st = ((x10.lang.PlaceLocalHandle)(st));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$54<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$54> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$54> make($Closure$54.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$54<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$54 $_obj = new x10.glb.Worker.$Closure$54((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st);
            
        }
        
        // constructor just for allocation
        public $Closure$54(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$54.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$54 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$54$$Queue$3x10$glb$Worker$$Closure$54$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 419 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            try {{
                
                //#line 419 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Worker this$89767 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st).$apply$G();
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.lang.PlaceLocalHandle st$89768 = ((x10.lang.PlaceLocalHandle)(this.st));
                
                //#line 448 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Context alloc$89763 = ((x10.glb.Context)(new x10.glb.Context<$Queue, $R>((java.lang.System[]) null, $Queue, $R)));
                
                //#line 19 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
                final x10.lang.PlaceLocalHandle st$89764 = ((x10.lang.PlaceLocalHandle)(st$89768));
                
                //#line 14 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
                final x10.lang.PlaceLocalHandle t$89762 = (x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>) x10.rtt.Types.zeroValue(x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, x10.rtt.ParameterizedType.make(x10.glb.Worker.$RTT, $Queue, $R)));
                
                //#line 9 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
                ((x10.glb.Context<$Queue, $R>)alloc$89763).st = t$89762;
                
                //#line 20 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
                ((x10.glb.Context<$Queue, $R>)alloc$89763).st = ((x10.lang.PlaceLocalHandle)(st$89764));
                
                //#line 448 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ((x10.glb.Worker<$Queue, $R>)this$89767).context = ((x10.glb.Context)(alloc$89763));
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 419 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 419 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st;
        
        public $Closure$54(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$54$$Queue$3x10$glb$Worker$$Closure$54$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$54.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$54<$Queue, $R>)this).st = ((x10.lang.PlaceLocalHandle)(st));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$55<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$55> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$55> make($Closure$55.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$55<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$55 $_obj = new x10.glb.Worker.$Closure$55((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st);
            
        }
        
        // constructor just for allocation
        public $Closure$55(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$55.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$55 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$55$$Queue$3x10$glb$Worker$$Closure$55$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 427 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            try {{
                
                //#line 427 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Worker this$89776 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st).$apply$G();
                
                //#line 446 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.lang.PlaceLocalHandle st$89777 = ((x10.lang.PlaceLocalHandle)(this.st));
                
                //#line 448 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Context alloc$89772 = ((x10.glb.Context)(new x10.glb.Context<$Queue, $R>((java.lang.System[]) null, $Queue, $R)));
                
                //#line 19 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
                final x10.lang.PlaceLocalHandle st$89773 = ((x10.lang.PlaceLocalHandle)(st$89777));
                
                //#line 14 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
                final x10.lang.PlaceLocalHandle t$89771 = (x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>) x10.rtt.Types.zeroValue(x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, x10.rtt.ParameterizedType.make(x10.glb.Worker.$RTT, $Queue, $R)));
                
                //#line 9 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
                ((x10.glb.Context<$Queue, $R>)alloc$89772).st = t$89771;
                
                //#line 20 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
                ((x10.glb.Context<$Queue, $R>)alloc$89772).st = ((x10.lang.PlaceLocalHandle)(st$89773));
                
                //#line 448 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ((x10.glb.Worker<$Queue, $R>)this$89776).context = ((x10.glb.Context)(alloc$89772));
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 427 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 427 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st;
        
        public $Closure$55(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$55$$Queue$3x10$glb$Worker$$Closure$55$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$55.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$55<$Queue, $R>)this).st = ((x10.lang.PlaceLocalHandle)(st));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$56<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$56> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$56> make($Closure$56.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$56<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$56 $_obj = new x10.glb.Worker.$Closure$56((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st);
            
        }
        
        // constructor just for allocation
        public $Closure$56(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$56.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$56 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$56$$Queue$3x10$glb$Worker$$Closure$56$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            try {{
                
                //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long max$89785 = ((long)x10.x10rt.X10RT.here());
                
                //#line 425 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89786 = ((max$89785) - (((long)(31L))));
                
                //#line 425 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long min$89787 = java.lang.Math.max(((long)(t$89786)),((long)(0L)));
                
                //#line 426 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                long j$89780 = min$89787;
                
                //#line 426 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 426 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89781 = j$89780;
                    
                    //#line 426 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final boolean t$89782 = ((t$89781) <= (((long)(max$89785))));
                    
                    //#line 426 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    if (!(t$89782)) {
                        
                        //#line 426 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        break;
                    }
                    
                    //#line 427 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.lang.Place alloc$89775 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                    
                    //#line 427 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89774 = j$89780;
                    
                    //#line 427 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    alloc$89775.x10$lang$Place$$init$S(t$89774);
                    
                    //#line 427 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    x10.lang.Runtime.runAsync(((x10.lang.Place)(alloc$89775)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$55<$Queue, $R>($Queue, $R, ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)(this.st)), (x10.glb.Worker.$Closure$55.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$55$$Queue$3x10$glb$Worker$$Closure$55$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
                    
                    //#line 426 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89778 = j$89780;
                    
                    //#line 426 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89779 = ((t$89778) + (((long)(1L))));
                    
                    //#line 426 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    j$89780 = t$89779;
                }
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st;
        
        public $Closure$56(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$56$$Queue$3x10$glb$Worker$$Closure$56$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$56.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$56<$Queue, $R>)this).st = ((x10.lang.PlaceLocalHandle)(st));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$57<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$57> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$57> make($Closure$57.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$57<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st$89830 = $deserializer.readObject();
            $_obj.loot$89831 = $deserializer.readObject();
            $_obj.victim$89792 = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$57 $_obj = new x10.glb.Worker.$Closure$57((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st$89830);
            $serializer.write(this.loot$89831);
            $serializer.write(this.victim$89792);
            
        }
        
        // constructor just for allocation
        public $Closure$57(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$57.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$57 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$57$$Queue$3x10$glb$Worker$$Closure$57$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 155 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$89811 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st$89830).$apply$G();
            
            //#line 155 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$89811).deal__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(((x10.lang.PlaceLocalHandle)(this.st$89830)), ((x10.glb.TaskBag)(this.loot$89831)), (long)(this.victim$89792));
            
            //#line 155 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$89812 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st$89830).$apply$G();
            
            //#line 155 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$89812).waiting = false;
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$89830;
        public x10.glb.TaskBag loot$89831;
        public long victim$89792;
        
        public $Closure$57(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$89830, final x10.glb.TaskBag loot$89831, final long victim$89792, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$57$$Queue$3x10$glb$Worker$$Closure$57$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$57.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$57<$Queue, $R>)this).st$89830 = ((x10.lang.PlaceLocalHandle)(st$89830));
                ((x10.glb.Worker.$Closure$57<$Queue, $R>)this).loot$89831 = ((x10.glb.TaskBag)(loot$89831));
                ((x10.glb.Worker.$Closure$57<$Queue, $R>)this).victim$89792 = victim$89792;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$58<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$58> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$58> make($Closure$58.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$58<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st$89830 = $deserializer.readObject();
            $_obj.loot$89831 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$58 $_obj = new x10.glb.Worker.$Closure$58((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st$89830);
            $serializer.write(this.loot$89831);
            
        }
        
        // constructor just for allocation
        public $Closure$58(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$58.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$58 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$58$$Queue$3x10$glb$Worker$$Closure$58$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 158 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$89817 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st$89830).$apply$G();
            
            //#line 158 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$89817).deal__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(((x10.lang.PlaceLocalHandle)(this.st$89830)), ((x10.glb.TaskBag)(this.loot$89831)), (long)(-1L));
            
            //#line 158 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$89818 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st$89830).$apply$G();
            
            //#line 158 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$89818).waiting = false;
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$89830;
        public x10.glb.TaskBag loot$89831;
        
        public $Closure$58(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$89830, final x10.glb.TaskBag loot$89831, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$58$$Queue$3x10$glb$Worker$$Closure$58$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$58.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$58<$Queue, $R>)this).st$89830 = ((x10.lang.PlaceLocalHandle)(st$89830));
                ((x10.glb.Worker.$Closure$58<$Queue, $R>)this).loot$89831 = ((x10.glb.TaskBag)(loot$89831));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$59<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$59> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$59> make($Closure$59.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$59<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st$89830 = $deserializer.readObject();
            $_obj.loot$89831 = $deserializer.readObject();
            $_obj.victim$89792 = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$59 $_obj = new x10.glb.Worker.$Closure$59((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st$89830);
            $serializer.write(this.loot$89831);
            $serializer.write(this.victim$89792);
            
        }
        
        // constructor just for allocation
        public $Closure$59(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$59.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$59 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$59$$Queue$3x10$glb$Worker$$Closure$59$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 163 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            try {{
                
                //#line 163 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Worker t$89829 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st$89830).$apply$G();
                
                //#line 163 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ((x10.glb.Worker<$Queue, $R>)t$89829).deal__0$1x10$glb$Worker$1x10$glb$Worker$$Queue$3x10$glb$Worker$$R$2$2(((x10.lang.PlaceLocalHandle)(this.st$89830)), ((x10.glb.TaskBag)(this.loot$89831)), (long)(this.victim$89792));
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 163 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 163 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$89830;
        public x10.glb.TaskBag loot$89831;
        public long victim$89792;
        
        public $Closure$59(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$89830, final x10.glb.TaskBag loot$89831, final long victim$89792, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$59$$Queue$3x10$glb$Worker$$Closure$59$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$59.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$59<$Queue, $R>)this).st$89830 = ((x10.lang.PlaceLocalHandle)(st$89830));
                ((x10.glb.Worker.$Closure$59<$Queue, $R>)this).loot$89831 = ((x10.glb.TaskBag)(loot$89831));
                ((x10.glb.Worker.$Closure$59<$Queue, $R>)this).victim$89792 = victim$89792;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$60<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$60> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$60> make($Closure$60.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$60<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st$88916 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$60 $_obj = new x10.glb.Worker.$Closure$60((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st$88916);
            
        }
        
        // constructor just for allocation
        public $Closure$60(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$60.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$60 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$60$$Queue$3x10$glb$Worker$$Closure$60$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$89849 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st$88916).$apply$G();
            
            //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$89849).waiting = false;
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$88916;
        
        public $Closure$60(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$88916, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$60$$Queue$3x10$glb$Worker$$Closure$60$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$60.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$60<$Queue, $R>)this).st$88916 = ((x10.lang.PlaceLocalHandle)(st$88916));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$61<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$61> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$61> make($Closure$61.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$61<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.st$88916 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$61 $_obj = new x10.glb.Worker.$Closure$61((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.st$88916);
            
        }
        
        // constructor just for allocation
        public $Closure$61(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$61.$initParams(this, $Queue, $R);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$61 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$61$$Queue$3x10$glb$Worker$$Closure$61$$R$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 191 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker t$89851 = ((x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>>)this.st$88916).$apply$G();
            
            //#line 191 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ((x10.glb.Worker<$Queue, $R>)t$89851).waiting = false;
        }
        
        public x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$88916;
        
        public $Closure$61(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.lang.PlaceLocalHandle<x10.glb.Worker<$Queue, $R>> st$88916, __0$1x10$glb$Worker$1x10$glb$Worker$$Closure$61$$Queue$3x10$glb$Worker$$Closure$61$$R$2$2 $dummy) {
            x10.glb.Worker.$Closure$61.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$61<$Queue, $R>)this).st$88916 = ((x10.lang.PlaceLocalHandle)(st$88916));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$62<$Queue, $R> extends x10.core.Ref implements x10.core.fun.VoidFun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$62> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$62> make($Closure$62.class,
                                                         2,
                                                         new x10.rtt.Type[] {
                                                             x10.rtt.ParameterizedType.make(x10.core.fun.VoidFun_0_1.$RTT, x10.rtt.ParameterizedType.make(x10.lang.PlaceLocalHandle.$RTT, x10.rtt.ParameterizedType.make(x10.glb.Worker.$RTT, x10.rtt.UnresolvedType.PARAM(0), x10.rtt.UnresolvedType.PARAM(1))))
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Queue; if (i == 1) return $R; return null; }
        
        public static <$Queue, $R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.Worker.$Closure$62<$Queue, $R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Queue = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.glb.Worker.$Closure$62 $_obj = new x10.glb.Worker.$Closure$62((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Queue);
            $serializer.write(this.$R);
            $serializer.write(this.out$$);
            
        }
        
        // constructor just for allocation
        public $Closure$62(final java.lang.System[] $dummy, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            x10.glb.Worker.$Closure$62.$initParams(this, $Queue, $R);
            
        }
        
        // dispatcher for method abstract public (Z1)=>void.operator()(a1:Z1):void
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            $apply__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$62$$Queue$3x10$glb$Worker$$Closure$62$$R$2$2((x10.lang.PlaceLocalHandle)a1); return null;
            
        }
        
        // dispatcher for method abstract public (Z1)=>void.operator()(a1:Z1):void
        public void $apply$V(final java.lang.Object a1, final x10.rtt.Type t1) {
            $apply__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$62$$Queue$3x10$glb$Worker$$Closure$62$$R$2$2((x10.lang.PlaceLocalHandle)a1);
            
        }
        
        private x10.rtt.Type $Queue;
        private x10.rtt.Type $R;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$62 $this, final x10.rtt.Type $Queue, final x10.rtt.Type $R) {
            $this.$Queue = $Queue;
            $this.$R = $R;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$glb$Worker$$Closure$62$$Queue$3x10$glb$Worker$$Closure$62$$R$2 {}
        
    
        
        public void $apply__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$62$$Queue$3x10$glb$Worker$$Closure$62$$R$2$2(final x10.lang.PlaceLocalHandle st) {
            
            //#line 439 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x10.lang.Runtime.probe();
            
            //#line 439 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker this$88894 = ((x10.glb.Worker)(this.out$$));
            
            //#line 172 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.lang.PlaceLocalHandle st$88892 = ((x10.lang.PlaceLocalHandle)(st));
            
            //#line 173 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x10.glb.TaskBag loot$89852 =  null;
            
            //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            while (true) {
                
                //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.FixedSizeStack this$89853 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this$88894).thieves));
                
                //#line 44 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final long t$89854 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89853).size;
                
                //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                boolean t$89855 = ((t$89854) > (((long)(0L))));
                
                //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (!(t$89855)) {
                    
                    //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.FixedSizeStack this$89856 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this$88894).lifelineThieves));
                    
                    //#line 44 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89857 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89856).size;
                    
                    //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    t$89855 = ((t$89857) > (((long)(0L))));
                }
                
                //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                boolean t$89858 = t$89855;
                
                //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (t$89858) {
                    
                    //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final $Queue t$89859 = (($Queue)(((x10.glb.Worker<$Queue, $R>)this$88894).queue));
                    
                    //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.TaskBag t$89860 = ((x10.glb.TaskQueue<$Queue, $R>)x10.rtt.Types.conversion(x10.rtt.ParameterizedType.make(x10.glb.TaskQueue.$RTT, $Queue, $R),t$89859)).split();
                    
                    //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.TaskBag t$89861 = loot$89852 = ((x10.glb.TaskBag)(t$89860));
                    
                    //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    t$89858 = ((t$89861) != (null));
                }
                
                //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final boolean t$89862 = t$89858;
                
                //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (!(t$89862)) {
                    
                    //#line 174 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    break;
                }
                
                //#line 148 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.lang.PlaceLocalHandle st$89830 = ((x10.lang.PlaceLocalHandle)(st$88892));
                
                //#line 148 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.TaskBag loot$89831 = ((x10.glb.TaskBag)(loot$89852));
                
                //#line 149 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long victim$89792 = ((long)x10.x10rt.X10RT.here());
                
                //#line 150 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.Logger obj$89793 = ((x10.glb.Logger)(((x10.glb.Worker<$Queue, $R>)this$88894).logger));
                
                //#line 150 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89794 = obj$89793.nodesGiven;
                
                //#line 150 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89795 = loot$89831.size$O();
                
                //#line 150 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long t$89796 = ((t$89794) + (((long)(t$89795))));
                
                //#line 150 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                obj$89793.nodesGiven = t$89796;
                
                //#line 151 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.FixedSizeStack this$89797 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this$88894).thieves));
                
                //#line 44 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final long t$89798 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89797).size;
                
                //#line 151 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final boolean t$89799 = ((t$89798) > (((long)(0L))));
                
                //#line 151 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (t$89799) {
                    
                    //#line 152 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.FixedSizeStack this$89800 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this$88894).thieves));
                    
                    //#line 33 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final x10.core.Rail t$89801 = ((x10.core.Rail)(((x10.glb.FixedSizeStack<x10.core.Long>)this$89800).data));
                    
                    //#line 33 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89802 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89800).size;
                    
                    //#line 33 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89803 = ((t$89802) - (((long)(1L))));
                    
                    //#line 33 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89804 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89800).size = t$89803;
                    
                    //#line 152 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long thief$89805 = ((long[])t$89801.value)[(int)t$89804];
                    
                    //#line 153 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final boolean t$89806 = ((thief$89805) >= (((long)(0L))));
                    
                    //#line 153 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    if (t$89806) {
                        
                        //#line 154 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final x10.glb.Logger obj$89807 = ((x10.glb.Logger)(((x10.glb.Worker<$Queue, $R>)this$88894).logger));
                        
                        //#line 154 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final long t$89808 = obj$89807.lifelineStealsSuffered;
                        
                        //#line 154 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final long t$89809 = ((t$89808) + (((long)(1L))));
                        
                        //#line 154 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        obj$89807.lifelineStealsSuffered = t$89809;
                        
                        //#line 155 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final x10.lang.Place alloc$89810 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                        
                        //#line 155 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        alloc$89810.x10$lang$Place$$init$S(((long)(thief$89805)));
                        
                        //#line 155 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        x10.lang.Runtime.runUncountedAsync(((x10.lang.Place)(alloc$89810)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$57<$Queue, $R>($Queue, $R, st$89830, loot$89831, victim$89792, (x10.glb.Worker.$Closure$57.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$57$$Queue$3x10$glb$Worker$$Closure$57$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
                    } else {
                        
                        //#line 157 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final x10.glb.Logger obj$89813 = ((x10.glb.Logger)(((x10.glb.Worker<$Queue, $R>)this$88894).logger));
                        
                        //#line 157 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final long t$89814 = obj$89813.stealsSuffered;
                        
                        //#line 157 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final long t$89815 = ((t$89814) + (((long)(1L))));
                        
                        //#line 157 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        obj$89813.stealsSuffered = t$89815;
                        
                        //#line 158 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final x10.lang.Place alloc$89816 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                        
                        //#line 158 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final long t$89790 = (-(thief$89805));
                        
                        //#line 158 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        final long t$89791 = ((t$89790) - (((long)(1L))));
                        
                        //#line 158 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        alloc$89816.x10$lang$Place$$init$S(t$89791);
                        
                        //#line 158 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        x10.lang.Runtime.runUncountedAsync(((x10.lang.Place)(alloc$89816)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$58<$Queue, $R>($Queue, $R, st$89830, loot$89831, (x10.glb.Worker.$Closure$58.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$58$$Queue$3x10$glb$Worker$$Closure$58$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
                    }
                } else {
                    
                    //#line 161 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.Logger obj$89819 = ((x10.glb.Logger)(((x10.glb.Worker<$Queue, $R>)this$88894).logger));
                    
                    //#line 161 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89820 = obj$89819.lifelineStealsSuffered;
                    
                    //#line 161 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89821 = ((t$89820) + (((long)(1L))));
                    
                    //#line 161 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    obj$89819.lifelineStealsSuffered = t$89821;
                    
                    //#line 162 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.FixedSizeStack this$89822 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this$88894).lifelineThieves));
                    
                    //#line 33 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final x10.core.Rail t$89823 = ((x10.core.Rail)(((x10.glb.FixedSizeStack<x10.core.Long>)this$89822).data));
                    
                    //#line 33 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89824 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89822).size;
                    
                    //#line 33 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89825 = ((t$89824) - (((long)(1L))));
                    
                    //#line 33 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89826 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89822).size = t$89825;
                    
                    //#line 162 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long thief$89827 = ((long[])t$89823.value)[(int)t$89826];
                    
                    //#line 163 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.lang.Place alloc$89828 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                    
                    //#line 163 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    alloc$89828.x10$lang$Place$$init$S(((long)(thief$89827)));
                    
                    //#line 163 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    x10.lang.Runtime.runAsync(((x10.lang.Place)(alloc$89828)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$59<$Queue, $R>($Queue, $R, st$89830, loot$89831, victim$89792, (x10.glb.Worker.$Closure$59.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$59$$Queue$3x10$glb$Worker$$Closure$59$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
                }
            }
            
            //#line 439 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.glb.Worker this$88920 = ((x10.glb.Worker)(this.out$$));
            
            //#line 184 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            final x10.lang.PlaceLocalHandle st$88916 = ((x10.lang.PlaceLocalHandle)(st));
            
            //#line 185 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            while (true) {
                
                //#line 185 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.FixedSizeStack this$89863 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this$88920).thieves));
                
                //#line 44 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final long t$89864 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89863).size;
                
                //#line 185 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final boolean t$89865 = ((t$89864) > (((long)(0L))));
                
                //#line 185 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (!(t$89865)) {
                    
                    //#line 185 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    break;
                }
                
                //#line 186 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final x10.glb.FixedSizeStack this$89839 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this$88920).thieves));
                
                //#line 33 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final x10.core.Rail t$89840 = ((x10.core.Rail)(((x10.glb.FixedSizeStack<x10.core.Long>)this$89839).data));
                
                //#line 33 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final long t$89841 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89839).size;
                
                //#line 33 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final long t$89842 = ((t$89841) - (((long)(1L))));
                
                //#line 33 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                final long t$89843 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89839).size = t$89842;
                
                //#line 186 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final long thief$89844 = ((long[])t$89840.value)[(int)t$89843];
                
                //#line 187 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                final boolean t$89845 = ((thief$89844) >= (((long)(0L))));
                
                //#line 187 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (t$89845) {
                    
                    //#line 188 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.glb.FixedSizeStack this$89846 = ((x10.glb.FixedSizeStack)(((x10.glb.Worker<$Queue, $R>)this$88920).lifelineThieves));
                    
                    //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89847 = thief$89844;
                    
                    //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final x10.core.Rail t$89832 = ((x10.core.Rail)(((x10.glb.FixedSizeStack<x10.core.Long>)this$89846).data));
                    
                    //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89833 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89846).size;
                    
                    //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89834 = ((t$89833) + (((long)(1L))));
                    
                    //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89835 = ((x10.glb.FixedSizeStack<x10.core.Long>)this$89846).size = t$89834;
                    
                    //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    final long t$89836 = ((t$89835) - (((long)(1L))));
                    
                    //#line 38 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    ((long[])t$89832.value)[(int)t$89836] = t$89847;
                    
                    //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.lang.Place alloc$89848 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                    
                    //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    alloc$89848.x10$lang$Place$$init$S(((long)(thief$89844)));
                    
                    //#line 189 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    x10.lang.Runtime.runUncountedAsync(((x10.lang.Place)(alloc$89848)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$60<$Queue, $R>($Queue, $R, st$88916, (x10.glb.Worker.$Closure$60.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$60$$Queue$3x10$glb$Worker$$Closure$60$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
                } else {
                    
                    //#line 191 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final x10.lang.Place alloc$89850 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                    
                    //#line 191 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89837 = (-(thief$89844));
                    
                    //#line 191 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    final long t$89838 = ((t$89837) - (((long)(1L))));
                    
                    //#line 191 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    alloc$89850.x10$lang$Place$$init$S(t$89838);
                    
                    //#line 191 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    x10.lang.Runtime.runUncountedAsync(((x10.lang.Place)(alloc$89850)), ((x10.core.fun.VoidFun_0_0)(new x10.glb.Worker.$Closure$61<$Queue, $R>($Queue, $R, st$88916, (x10.glb.Worker.$Closure$61.__0$1x10$glb$Worker$1x10$glb$Worker$$Closure$61$$Queue$3x10$glb$Worker$$Closure$61$$R$2$2) null))), ((x10.lang.Runtime.Profile)(null)));
                }
            }
        }
        
        public x10.glb.Worker<$Queue, $R> out$$;
        
        public $Closure$62(final x10.rtt.Type $Queue, final x10.rtt.Type $R, final x10.glb.Worker<$Queue, $R> out$$, __0$1x10$glb$Worker$$Closure$62$$Queue$3x10$glb$Worker$$Closure$62$$R$2 $dummy) {
            x10.glb.Worker.$Closure$62.$initParams(this, $Queue, $R);
             {
                ((x10.glb.Worker.$Closure$62<$Queue, $R>)this).out$$ = out$$;
            }
        }
        
    }
    
    }
    
    