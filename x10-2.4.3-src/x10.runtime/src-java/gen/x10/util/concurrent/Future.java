package x10.util.concurrent;


@x10.runtime.impl.java.X10Generated
public class Future<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Future> $RTT = 
        x10.rtt.NamedType.<Future> make("x10.util.concurrent.Future",
                                        Future.class,
                                        1,
                                        new x10.rtt.Type[] {
                                            x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                        });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.concurrent.Future<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.root = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.concurrent.Future $_obj = new x10.util.concurrent.Future((java.lang.System[]) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$T);
        $serializer.write(this.root);
        
    }
    
    // constructor just for allocation
    public Future(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        x10.util.concurrent.Future.$initParams(this, $T);
        
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final Future $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    // synthetic type for parameter mangling
    public static final class __0$1x10$util$concurrent$Future$$T$2 {}
    

    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    public x10.core.GlobalRef<x10.util.concurrent.Future<$T>> root;
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    /**
     * Latch for signaling and wait
     */
    public transient x10.util.concurrent.Latch latch;
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    /**
     * Set if the activity terminated with an exception.
     * Can only be of type Error or Exception
     *
     */
    public transient x10.util.GrowableRail<java.lang.RuntimeException> exception;
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    public transient x10.util.GrowableRail<$T> result;
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    public transient x10.core.fun.Fun_0_0<$T> eval;
    
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    public static <$T>x10.util.concurrent.Future make__0$1x10$util$concurrent$Future$$T$2(final x10.rtt.Type $T, final x10.core.fun.Fun_0_0<$T> eval) {
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        x10.lang.Runtime.ensureNotInAtomic();
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        final x10.util.concurrent.Future f = ((x10.util.concurrent.Future)(new x10.util.concurrent.Future<$T>((java.lang.System[]) null, $T)));
        
        //#line 47 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        final x10.core.fun.Fun_0_0 eval$145475 = ((x10.core.fun.Fun_0_0)(eval));
        
        //#line 22 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        ((x10.util.concurrent.Future<$T>)f).__fieldInitializers_x10_util_concurrent_Future();
        
        //#line 48 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        ((x10.util.concurrent.Future<$T>)f).eval = ((x10.core.fun.Fun_0_0)(eval$145475));
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        x10.lang.Runtime.runAsync(((x10.core.fun.VoidFun_0_0)(new x10.util.concurrent.Future.$Closure$329<$T>($T, f, (x10.util.concurrent.Future.$Closure$329.__0$1x10$util$concurrent$Future$$Closure$329$$T$2) null))));
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        return f;
    }
    
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    // creation method for java code (1-phase java constructor)
    public Future(final x10.rtt.Type $T, final x10.core.fun.Fun_0_0<$T> eval, __0$1x10$util$concurrent$Future$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$util$concurrent$Future$$init$S(eval, (x10.util.concurrent.Future.__0$1x10$util$concurrent$Future$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.util.concurrent.Future<$T> x10$util$concurrent$Future$$init$S(final x10.core.fun.Fun_0_0<$T> eval, __0$1x10$util$concurrent$Future$$T$2 $dummy) {
         {
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
            
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
            this.__fieldInitializers_x10_util_concurrent_Future();
            
            //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
            ((x10.util.concurrent.Future<$T>)this).eval = ((x10.core.fun.Fun_0_0)(eval));
        }
        return this;
    }
    
    
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    public boolean forced$O() {
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        final x10.core.GlobalRef t$145453 = ((x10.core.GlobalRef)(root));
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        final x10.lang.Place t$145458 = ((x10.lang.Place)((t$145453).home));
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        final boolean t$145459 = x10.core.Boolean.$unbox(x10.lang.Runtime.<x10.core.Boolean> evalAt__1$1x10$lang$Runtime$$T$2$G(x10.rtt.Types.BOOLEAN, ((x10.lang.Place)(t$145458)), ((x10.core.fun.Fun_0_0)(new x10.util.concurrent.Future.$Closure$330<$T>($T, ((x10.util.concurrent.Future)(this)), root, (x10.util.concurrent.Future.$Closure$330.__0$1x10$util$concurrent$Future$$Closure$330$$T$2__1$1x10$util$concurrent$Future$1x10$util$concurrent$Future$$Closure$330$$T$2$2) null))), ((x10.lang.Runtime.Profile)(null))));
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        return t$145459;
    }
    
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    public $T $apply$G() {
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        final $T t$145529 = (($T)(this.force$G()));
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        return t$145529;
    }
    
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    public $T force$G() {
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        x10.lang.Runtime.ensureNotInAtomic();
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        final x10.core.GlobalRef t$145460 = ((x10.core.GlobalRef)(root));
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        final x10.lang.Place t$145464 = ((x10.lang.Place)((t$145460).home));
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        final $T t$145465 = (($T)(x10.lang.Runtime.<$T> evalAt__1$1x10$lang$Runtime$$T$2$G($T, ((x10.lang.Place)(t$145464)), ((x10.core.fun.Fun_0_0)(new x10.util.concurrent.Future.$Closure$331<$T>($T, ((x10.util.concurrent.Future)(this)), root, (x10.util.concurrent.Future.$Closure$331.__0$1x10$util$concurrent$Future$$Closure$331$$T$2__1$1x10$util$concurrent$Future$1x10$util$concurrent$Future$$Closure$331$$T$2$2) null))), ((x10.lang.Runtime.Profile)(null)))));
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        return t$145465;
    }
    
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    private $T forceLocal$G() {
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        final x10.util.concurrent.Latch t$145530 = ((x10.util.concurrent.Latch)(latch));
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        t$145530.await();
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        final x10.util.GrowableRail this$145518 = ((x10.util.GrowableRail)(exception));
        
        //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$145531 = ((x10.util.GrowableRail<java.lang.RuntimeException>)this$145518).size;
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        final boolean t$145535 = ((t$145531) > (((long)(0L))));
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        if (t$145535) {
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
            final x10.util.GrowableRail this$145520 = ((x10.util.GrowableRail)(exception));
            
            //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            java.lang.RuntimeException ret$145521 =  null;
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.core.Rail t$145547 = ((x10.core.Rail)(((x10.util.GrowableRail<java.lang.RuntimeException>)this$145520).data));
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final java.lang.RuntimeException t$145548 = ((java.lang.RuntimeException[])t$145547.value)[(int)0L];
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ret$145521 = t$145548;
            
            //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final java.lang.RuntimeException t$145534 = ret$145521;
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
            throw t$145534;
        }
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        final x10.util.GrowableRail this$145524 = ((x10.util.GrowableRail)(result));
        
        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        $T ret$145525 =  null;
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$145549 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$145524).data));
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final $T t$145550 = (($T)(((x10.core.Rail<$T>)t$145549).$apply$G((long)(0L))));
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ret$145525 = (($T)(t$145550));
        
        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final $T t$145538 = (($T)(ret$145525));
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        return t$145538;
    }
    
    public static <$T>$T forceLocal$P__0$1x10$util$concurrent$Future$$T$2$G(final x10.rtt.Type $T, final x10.util.concurrent.Future<$T> Future) {
        return ((x10.util.concurrent.Future<$T>)Future).forceLocal$G();
    }
    
    
    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    public void run() {
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        try {{
            {
                
                //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                x10.lang.Runtime.ensureNotInAtomic();
                
                //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                final x10.lang.FinishState x10$__var64 = x10.lang.Runtime.startFinish();
                
                //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                try {{
                    {
                        
                        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                        final x10.util.GrowableRail t$145540 = ((x10.util.GrowableRail)(result));
                        
                        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                        final x10.core.fun.Fun_0_0 t$145539 = ((x10.core.fun.Fun_0_0)(eval));
                        
                        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                        final $T t$145541 = (($T)(((x10.core.fun.Fun_0_0<$T>)t$145539).$apply$G()));
                        
                        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                        ((x10.util.GrowableRail<$T>)t$145540).add__0x10$util$GrowableRail$$T((($T)(t$145541)));
                    }
                }}catch (java.lang.Throwable __lowerer__var__0__) {
                    
                    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                    x10.lang.Runtime.pushException(((java.lang.Throwable)(__lowerer__var__0__)));
                    
                    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                    throw new java.lang.RuntimeException();
                }finally {{
                     
                     //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                     x10.lang.Runtime.stopFinish(((x10.lang.FinishState)(x10$__var64)));
                 }}
                }
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
            final x10.util.concurrent.Latch t$145542 = ((x10.util.concurrent.Latch)(latch));
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
            t$145542.release();
            }}catch (final java.lang.RuntimeException t) {
                
                //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                final x10.util.GrowableRail t$145543 = ((x10.util.GrowableRail)(exception));
                
                //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                ((x10.util.GrowableRail<java.lang.RuntimeException>)t$145543).add__0x10$util$GrowableRail$$T(((java.lang.RuntimeException)(t)));
                
                //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                final x10.util.concurrent.Latch t$145544 = ((x10.util.concurrent.Latch)(latch));
                
                //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                t$145544.release();
            }
        }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    final public x10.util.concurrent.Future x10$util$concurrent$Future$$this$x10$util$concurrent$Future() {
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        return x10.util.concurrent.Future.this;
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    final public void __fieldInitializers_x10_util_concurrent_Future() {
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        final x10.core.GlobalRef t$145545 = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.util.concurrent.Future<$T>>(x10.rtt.ParameterizedType.make(x10.util.concurrent.Future.$RTT, $T), ((x10.util.concurrent.Future)(this)), (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        ((x10.util.concurrent.Future<$T>)this).root = ((x10.core.GlobalRef)(t$145545));
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        final x10.util.concurrent.Latch t$145546 = ((x10.util.concurrent.Latch)(new x10.util.concurrent.Latch()));
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        ((x10.util.concurrent.Future<$T>)this).latch = ((x10.util.concurrent.Latch)(t$145546));
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        final x10.util.GrowableRail alloc$145473 = ((x10.util.GrowableRail)(new x10.util.GrowableRail<java.lang.RuntimeException>((java.lang.System[]) null, x10.rtt.Types.EXCEPTION)));
        
        //#line 50 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        alloc$145473.x10$util$GrowableRail$$init$S(((long)(0L)));
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        ((x10.util.concurrent.Future<$T>)this).exception = ((x10.util.GrowableRail)(alloc$145473));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        final x10.util.GrowableRail alloc$145474 = ((x10.util.GrowableRail)(new x10.util.GrowableRail<$T>((java.lang.System[]) null, $T)));
        
        //#line 50 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        alloc$145474.x10$util$GrowableRail$$init$S(((long)(0L)));
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        ((x10.util.concurrent.Future<$T>)this).result = ((x10.util.GrowableRail)(alloc$145474));
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$329<$T> extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$329> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$329> make($Closure$329.class,
                                                          1,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.concurrent.Future.$Closure$329<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.f = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.concurrent.Future.$Closure$329 $_obj = new x10.util.concurrent.Future.$Closure$329((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.f);
            
        }
        
        // constructor just for allocation
        public $Closure$329(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.util.concurrent.Future.$Closure$329.$initParams(this, $T);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$329 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$util$concurrent$Future$$Closure$329$$T$2 {}
        
    
        
        public void $apply() {
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
            try {{
                
                //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                ((x10.util.concurrent.Future<$T>)this.f).run();
            }}catch (java.lang.Error __lowerer__var__0__) {
                
                //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                throw __lowerer__var__0__;
            }catch (java.lang.Throwable __lowerer__var__1__) {
                
                //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                throw x10.rtt.Types.EXCEPTION.isInstance(__lowerer__var__1__) ? (java.lang.RuntimeException)(__lowerer__var__1__) : new x10.lang.WrappedThrowable(__lowerer__var__1__);
            }
        }
        
        public x10.util.concurrent.Future<$T> f;
        
        public $Closure$329(final x10.rtt.Type $T, final x10.util.concurrent.Future<$T> f, __0$1x10$util$concurrent$Future$$Closure$329$$T$2 $dummy) {
            x10.util.concurrent.Future.$Closure$329.$initParams(this, $T);
             {
                ((x10.util.concurrent.Future.$Closure$329<$T>)this).f = ((x10.util.concurrent.Future)(f));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$330<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$330> $RTT = 
            x10.rtt.StaticFunType.<$Closure$330> make($Closure$330.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.Types.BOOLEAN)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.concurrent.Future.$Closure$330<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            $_obj.root = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.concurrent.Future.$Closure$330 $_obj = new x10.util.concurrent.Future.$Closure$330((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.out$$);
            $serializer.write(this.root);
            
        }
        
        // constructor just for allocation
        public $Closure$330(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.util.concurrent.Future.$Closure$330.$initParams(this, $T);
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.core.Boolean $apply$G() {
            return x10.core.Boolean.$box($apply$O());
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$330 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$util$concurrent$Future$$Closure$330$$T$2__1$1x10$util$concurrent$Future$1x10$util$concurrent$Future$$Closure$330$$T$2$2 {}
        
    
        
        public boolean $apply$O() {
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
            try {{
                
                //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                final x10.core.GlobalRef t$145454 = ((x10.core.GlobalRef)(this.root));
                
                //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                final x10.util.concurrent.Future t$145455 = (((x10.core.GlobalRef<x10.util.concurrent.Future<$T>>)(t$145454))).$apply$G();
                
                //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                final x10.util.concurrent.Latch t$145456 = ((x10.util.concurrent.Latch)(((x10.util.concurrent.Future<$T>)t$145455).latch));
                
                //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                final boolean t$145457 = t$145456.$apply$O();
                
                //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                return t$145457;
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                boolean __lowerer__var__1__ = (x10.core.Boolean.$unbox(x10.lang.Runtime.<x10.core.Boolean> wrapAtChecked$G(x10.rtt.Types.BOOLEAN, ((java.lang.Throwable)(__lowerer__var__0__)))));
                
                //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                return __lowerer__var__1__;
            }
        }
        
        public x10.util.concurrent.Future<$T> out$$;
        public x10.core.GlobalRef<x10.util.concurrent.Future<$T>> root;
        
        public $Closure$330(final x10.rtt.Type $T, final x10.util.concurrent.Future<$T> out$$, final x10.core.GlobalRef<x10.util.concurrent.Future<$T>> root, __0$1x10$util$concurrent$Future$$Closure$330$$T$2__1$1x10$util$concurrent$Future$1x10$util$concurrent$Future$$Closure$330$$T$2$2 $dummy) {
            x10.util.concurrent.Future.$Closure$330.$initParams(this, $T);
             {
                ((x10.util.concurrent.Future.$Closure$330<$T>)this).out$$ = out$$;
                ((x10.util.concurrent.Future.$Closure$330<$T>)this).root = ((x10.core.GlobalRef)(root));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$331<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$331> $RTT = 
            x10.rtt.StaticFunType.<$Closure$331> make($Closure$331.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.concurrent.Future.$Closure$331<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.out$$ = $deserializer.readObject();
            $_obj.root = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.concurrent.Future.$Closure$331 $_obj = new x10.util.concurrent.Future.$Closure$331((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.out$$);
            $serializer.write(this.root);
            
        }
        
        // constructor just for allocation
        public $Closure$331(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.util.concurrent.Future.$Closure$331.$initParams(this, $T);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$331 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$util$concurrent$Future$$Closure$331$$T$2__1$1x10$util$concurrent$Future$1x10$util$concurrent$Future$$Closure$331$$T$2$2 {}
        
    
        
        public $T $apply$G() {
            
            //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
            try {{
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                final x10.core.GlobalRef t$145461 = ((x10.core.GlobalRef)(this.root));
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                final x10.util.concurrent.Future t$145462 = (((x10.core.GlobalRef<x10.util.concurrent.Future<$T>>)(t$145461))).$apply$G();
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                final $T t$145463 = (($T)(((x10.util.concurrent.Future<$T>)t$145462).forceLocal$G()));
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                return t$145463;
            }}catch (java.lang.Throwable __lowerer__var__0__) {
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                $T __lowerer__var__1__ = (($T)(x10.lang.Runtime.<$T> wrapAtChecked$G($T, ((java.lang.Throwable)(__lowerer__var__0__)))));
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                return __lowerer__var__1__;
            }
        }
        
        public x10.util.concurrent.Future<$T> out$$;
        public x10.core.GlobalRef<x10.util.concurrent.Future<$T>> root;
        
        public $Closure$331(final x10.rtt.Type $T, final x10.util.concurrent.Future<$T> out$$, final x10.core.GlobalRef<x10.util.concurrent.Future<$T>> root, __0$1x10$util$concurrent$Future$$Closure$331$$T$2__1$1x10$util$concurrent$Future$1x10$util$concurrent$Future$$Closure$331$$T$2$2 $dummy) {
            x10.util.concurrent.Future.$Closure$331.$initParams(this, $T);
             {
                ((x10.util.concurrent.Future.$Closure$331<$T>)this).out$$ = out$$;
                ((x10.util.concurrent.Future.$Closure$331<$T>)this).root = ((x10.core.GlobalRef)(root));
            }
        }
        
    }
    
    }
    
    