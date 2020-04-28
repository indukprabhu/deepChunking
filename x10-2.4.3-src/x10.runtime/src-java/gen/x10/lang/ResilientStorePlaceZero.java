package x10.lang;


@x10.runtime.impl.java.X10Generated
public class ResilientStorePlaceZero extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<ResilientStorePlaceZero> $RTT = 
        x10.rtt.NamedType.<ResilientStorePlaceZero> make("x10.lang.ResilientStorePlaceZero",
                                                         ResilientStorePlaceZero.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.ResilientStorePlaceZero $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.states = $deserializer.readObject();
        $_obj.numDead = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.ResilientStorePlaceZero $_obj = new x10.lang.ResilientStorePlaceZero((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.states);
        $serializer.write(this.numDead);
        
    }
    
    // constructor just for allocation
    public ResilientStorePlaceZero(final java.lang.System[] $dummy) {
        
    }
    
    

    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    private static x10.lang.ResilientStorePlaceZero me;
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    private static void lowLevelAt(final x10.core.fun.VoidFun_0_0 cl) {
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final long t$112409 = x10.lang.Place.place(x10.x10rt.X10RT.here()).id;
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final boolean t$112441 = ((long) t$112409) == ((long) 0L);
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        if (t$112441) {
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            ((x10.core.fun.VoidFun_0_0)cl).$apply();
        } else {
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.lang.Cell alloc$105043 = ((x10.lang.Cell)(new x10.lang.Cell<java.lang.RuntimeException>((java.lang.System[]) null, x10.rtt.Types.EXCEPTION)));
            
            //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
            final java.lang.RuntimeException x$112291 = ((java.lang.RuntimeException)(((java.lang.RuntimeException)
                                                                                        (null))));
            
            //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
            ((x10.lang.Cell<java.lang.RuntimeException>)alloc$105043).value = ((java.lang.RuntimeException)(((java.lang.RuntimeException)(null))));
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.core.GlobalRef exc = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.lang.Cell<java.lang.RuntimeException>>(x10.rtt.ParameterizedType.make(x10.lang.Cell.$RTT, x10.rtt.Types.EXCEPTION), alloc$105043, (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.core.concurrent.AtomicBoolean t$112410 = ((x10.core.concurrent.AtomicBoolean)(new x10.core.concurrent.AtomicBoolean()));
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.core.GlobalRef c = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean>(x10.core.concurrent.AtomicBoolean.$RTT, t$112410, (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
            
            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.core.fun.VoidFun_0_0 t$112424 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.ResilientStorePlaceZero.$Closure_low_level_at_out(cl, c, exc, (x10.lang.ResilientStorePlaceZero.$Closure_low_level_at_out.__1$1x10$util$concurrent$AtomicBoolean$2__2$1x10$lang$Cell$1x10$lang$Exception$2$2) null)));
            
            //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.fun.VoidFun_0_0 msgBody$112296 = ((x10.core.fun.VoidFun_0_0)(((x10.core.fun.VoidFun_0_0)
                                                                                          t$112424)));
            
            //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Profile prof$112297 = ((x10.lang.Runtime.Profile)(((x10.lang.Runtime.Profile)
                                                                                       (null))));
            
            //#line 77 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            x10.runtime.impl.java.Runtime.runClosureAt((int)(((long)(0L))), msgBody$112296, ((x10.lang.Runtime.Profile)(null)), null);
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.core.concurrent.AtomicBoolean t$112425 = ((x10.core.concurrent.AtomicBoolean)((((x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean>)(c))).$apply$G()));
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final boolean t$112426 = t$112425.get();
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final boolean t$112437 = !(t$112426);
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            if (t$112437) {
                
                //#line 1539 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$112853 = x10.lang.Runtime.get$STATIC_THREADS();
                
                //#line 1539 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$112854 = !(t$112853);
                
                //#line 1539 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (t$112854) {
                    
                    //#line 1540 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.Runtime.Pool t$112855 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
                    
                    //#line 1540 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    t$112855.increase();
                }
                
                //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                boolean t$112856 = false;
                
                //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                do  {
                    
                    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    x10.runtime.impl.java.Runtime.eventProbe();
                    
                    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final x10.core.concurrent.AtomicBoolean t$112857 = ((x10.core.concurrent.AtomicBoolean)((((x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean>)(c))).$apply$G()));
                    
                    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final boolean t$112858 = t$112857.get();
                    
                    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final boolean t$112859 = !(t$112858);
                    
                    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    t$112856 = t$112859;
                }while(t$112856); 
                
                //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$112860 = x10.lang.Runtime.get$STATIC_THREADS();
                
                //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$112861 = !(t$112860);
                
                //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (t$112861) {
                    
                    //#line 1547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.Runtime.Pool t$112862 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
                    
                    //#line 1547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    t$112862.decrease((int)(1));
                }
            }
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.lang.Cell this$112305 = ((x10.lang.Cell)((((x10.core.GlobalRef<x10.lang.Cell<java.lang.RuntimeException>>)(exc))).$apply$G()));
            
            //#line 48 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
            final java.lang.RuntimeException t$112438 = ((java.lang.RuntimeException)(((x10.lang.Cell<java.lang.RuntimeException>)this$112305).value));
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final boolean t$112440 = ((t$112438) != (null));
            
            //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            if (t$112440) {
                
                //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.lang.Cell this$112306 = ((x10.lang.Cell)((((x10.core.GlobalRef<x10.lang.Cell<java.lang.RuntimeException>>)(exc))).$apply$G()));
                
                //#line 48 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
                final java.lang.RuntimeException t$112439 = ((java.lang.RuntimeException)(((x10.lang.Cell<java.lang.RuntimeException>)this$112306).value));
                
                //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                throw t$112439;
            }
        }
    }
    
    public static void lowLevelAt$P(final x10.core.fun.VoidFun_0_0 cl) {
        x10.lang.ResilientStorePlaceZero.lowLevelAt(((x10.core.fun.VoidFun_0_0)(cl)));
    }
    
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    private static long lowLevelAtExprLong__0$1x10$lang$Long$2$O(final x10.core.fun.Fun_0_0<x10.core.Long> cl) {
        
        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final long t$112442 = x10.lang.Place.place(x10.x10rt.X10RT.here()).id;
        
        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final boolean t$112465 = ((long) t$112442) == ((long) 0L);
        
        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        if (t$112465) {
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final long t$112443 = x10.core.Long.$unbox(((x10.core.fun.Fun_0_0<x10.core.Long>)cl).$apply$G());
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            return t$112443;
        } else {
            
            //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.core.concurrent.AtomicLong t$112444 = ((x10.core.concurrent.AtomicLong)(new x10.core.concurrent.AtomicLong(((long)(-1L)))));
            
            //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.core.GlobalRef c = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.core.concurrent.AtomicLong>(x10.core.concurrent.AtomicLong.$RTT, t$112444, (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
            
            //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.core.fun.VoidFun_0_0 t$112449 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.ResilientStorePlaceZero.$Closure_low_level_at_int_out(cl, c, (x10.lang.ResilientStorePlaceZero.$Closure_low_level_at_int_out.__0$1x10$lang$Long$2__1$1x10$util$concurrent$AtomicLong$2) null)));
            
            //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.core.fun.VoidFun_0_0 msgBody$112308 = ((x10.core.fun.VoidFun_0_0)(((x10.core.fun.VoidFun_0_0)
                                                                                          t$112449)));
            
            //#line 76 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            final x10.lang.Runtime.Profile prof$112309 = ((x10.lang.Runtime.Profile)(((x10.lang.Runtime.Profile)
                                                                                       (null))));
            
            //#line 77 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            x10.runtime.impl.java.Runtime.runClosureAt((int)(((long)(0L))), msgBody$112308, ((x10.lang.Runtime.Profile)(null)), null);
            
            //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.core.concurrent.AtomicLong t$112450 = ((x10.core.concurrent.AtomicLong)((((x10.core.GlobalRef<x10.core.concurrent.AtomicLong>)(c))).$apply$G()));
            
            //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final long t$112451 = t$112450.get();
            
            //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final boolean t$112462 = ((long) t$112451) == ((long) -1L);
            
            //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            if (t$112462) {
                
                //#line 1539 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$112863 = x10.lang.Runtime.get$STATIC_THREADS();
                
                //#line 1539 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$112864 = !(t$112863);
                
                //#line 1539 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (t$112864) {
                    
                    //#line 1540 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.Runtime.Pool t$112865 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
                    
                    //#line 1540 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    t$112865.increase();
                }
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                boolean t$112866 = false;
                
                //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                do  {
                    
                    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    x10.runtime.impl.java.Runtime.eventProbe();
                    
                    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final x10.core.concurrent.AtomicLong t$112867 = ((x10.core.concurrent.AtomicLong)((((x10.core.GlobalRef<x10.core.concurrent.AtomicLong>)(c))).$apply$G()));
                    
                    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final long t$112868 = t$112867.get();
                    
                    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final boolean t$112869 = ((long) t$112868) == ((long) -1L);
                    
                    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    t$112866 = t$112869;
                }while(t$112866); 
                
                //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$112870 = x10.lang.Runtime.get$STATIC_THREADS();
                
                //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                final boolean t$112871 = !(t$112870);
                
                //#line 1546 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (t$112871) {
                    
                    //#line 1547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    final x10.lang.Runtime.Pool t$112872 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
                    
                    //#line 1547 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    t$112872.decrease((int)(1));
                }
            }
            
            //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.core.concurrent.AtomicLong t$112463 = ((x10.core.concurrent.AtomicLong)((((x10.core.GlobalRef<x10.core.concurrent.AtomicLong>)(c))).$apply$G()));
            
            //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final long t$112464 = t$112463.get();
            
            //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            return t$112464;
        }
    }
    
    public static long lowLevelAtExprLong$P__0$1x10$lang$Long$2$O(final x10.core.fun.Fun_0_0<x10.core.Long> cl) {
        return x10.lang.ResilientStorePlaceZero.lowLevelAtExprLong__0$1x10$lang$Long$2$O(((x10.core.fun.Fun_0_0)(cl)));
    }
    
    
    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    @x10.runtime.impl.java.X10Generated
    public static class State extends x10.core.Ref implements x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<State> $RTT = 
            x10.rtt.NamedType.<State> make("x10.lang.ResilientStorePlaceZero.State",
                                           State.class);
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.ResilientStorePlaceZero.State $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.id = $deserializer.readLong();
            $_obj.parent = $deserializer.readObject();
            $_obj.transit = $deserializer.readObject();
            $_obj.live = $deserializer.readObject();
            $_obj.transitAdopted = $deserializer.readObject();
            $_obj.liveAdopted = $deserializer.readObject();
            $_obj.homeId = $deserializer.readLong();
            $_obj.adopted = $deserializer.readBoolean();
            $_obj.adoptedParent = $deserializer.readLong();
            $_obj.multipleExceptions = $deserializer.readObject();
            $_obj.latch = $deserializer.readObject();
            $_obj.totalCounter = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.ResilientStorePlaceZero.State $_obj = new x10.lang.ResilientStorePlaceZero.State((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.id);
            $serializer.write(this.parent);
            $serializer.write(this.transit);
            $serializer.write(this.live);
            $serializer.write(this.transitAdopted);
            $serializer.write(this.liveAdopted);
            $serializer.write(this.homeId);
            $serializer.write(this.adopted);
            $serializer.write(this.adoptedParent);
            $serializer.write(this.multipleExceptions);
            $serializer.write(this.latch);
            $serializer.write(this.totalCounter);
            
        }
        
        // constructor just for allocation
        public State(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        public long id;
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        public x10.lang.ResilientStorePlaceZero.State parent;
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        public x10.util.HashMap<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int> transit;
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        public x10.core.Rail<x10.core.Int> live;
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        public x10.util.HashMap<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int> transitAdopted;
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        public x10.core.Rail<x10.core.Int> liveAdopted;
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        public long homeId;
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        public boolean adopted;
        
        //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        public long adoptedParent;
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        public x10.util.GrowableRail<java.lang.RuntimeException> multipleExceptions;
        
        //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        public x10.util.concurrent.SimpleLatch latch;
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        public long totalCounter;
        
        
        //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        private void recalculateTotal() {
            
            //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            this.totalCounter = 0L;
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final long t$112899 = x10.lang.Place.get$MAX_PLACES();
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final long i$105053max$112900 = ((t$112899) - (((long)(1L))));
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            long i$112886 = 0L;
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            for (;
                 true;
                 ) {
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$112887 = i$112886;
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final boolean t$112888 = ((t$112887) <= (((long)(i$105053max$112900))));
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                if (!(t$112888)) {
                    
                    //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    break;
                }
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long i$112883 = i$112886;
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$112873 = this.totalCounter;
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.core.Rail t$112874 = ((x10.core.Rail)(live));
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final int t$112875 = ((int[])t$112874.value)[(int)i$112883];
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$112876 = ((long)(((int)(t$112875))));
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$112877 = ((t$112873) + (((long)(t$112876))));
                
                //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                this.totalCounter = t$112877;
                
                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$112878 = this.totalCounter;
                
                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.core.Rail t$112879 = ((x10.core.Rail)(liveAdopted));
                
                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final int t$112880 = ((int[])t$112879.value)[(int)i$112883];
                
                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$112881 = ((long)(((int)(t$112880))));
                
                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$112882 = ((t$112878) + (((long)(t$112881))));
                
                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                this.totalCounter = t$112882;
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$112884 = i$112886;
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$112885 = ((t$112884) + (((long)(1L))));
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                i$112886 = t$112885;
            }
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.HashMap t$112901 = ((x10.util.HashMap)(transit));
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.Set t$112902 = ((x10.util.Set<x10.util.Map.Entry<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>>)
                                            ((x10.util.HashMap<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>)t$112901).entries());
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.lang.Iterator ent$112903 = ((x10.lang.Iterator<x10.util.Map.Entry<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>>)
                                                   ((x10.lang.Iterable<x10.util.Map.Entry<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>>)t$112902).iterator());
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            for (;
                 true;
                 ) {
                
                //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final boolean t$112904 = ((x10.lang.Iterator<x10.util.Map.Entry<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>>)ent$112903).hasNext$O();
                
                //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                if (!(t$112904)) {
                    
                    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    break;
                }
                
                //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.util.Map.Entry ent$112889 = ((x10.util.Map.Entry)(((x10.lang.Iterator<x10.util.Map.Entry<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>>)ent$112903).next$G()));
                
                //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$112890 = this.totalCounter;
                
                //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final int t$112891 = x10.core.Int.$unbox(((x10.util.Map.Entry<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>)ent$112889).getValue$G());
                
                //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$112892 = ((long)(((int)(t$112891))));
                
                //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$112893 = ((t$112890) + (((long)(t$112892))));
                
                //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                this.totalCounter = t$112893;
            }
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.HashMap t$112905 = ((x10.util.HashMap)(transitAdopted));
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.Set t$112906 = ((x10.util.Set<x10.util.Map.Entry<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>>)
                                            ((x10.util.HashMap<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>)t$112905).entries());
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.lang.Iterator ent$112907 = ((x10.lang.Iterator<x10.util.Map.Entry<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>>)
                                                   ((x10.lang.Iterable<x10.util.Map.Entry<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>>)t$112906).iterator());
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            for (;
                 true;
                 ) {
                
                //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final boolean t$112908 = ((x10.lang.Iterator<x10.util.Map.Entry<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>>)ent$112907).hasNext$O();
                
                //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                if (!(t$112908)) {
                    
                    //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    break;
                }
                
                //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.util.Map.Entry ent$112894 = ((x10.util.Map.Entry)(((x10.lang.Iterator<x10.util.Map.Entry<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>>)ent$112907).next$G()));
                
                //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$112895 = this.totalCounter;
                
                //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final int t$112896 = x10.core.Int.$unbox(((x10.util.Map.Entry<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>)ent$112894).getValue$G());
                
                //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$112897 = ((long)(((int)(t$112896))));
                
                //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$112898 = ((t$112895) + (((long)(t$112897))));
                
                //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                this.totalCounter = t$112898;
            }
        }
        
        public static void recalculateTotal$P(final x10.lang.ResilientStorePlaceZero.State State) {
            State.recalculateTotal();
        }
        
        
        //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        private x10.util.GrowableRail ensureMultipleExceptions() {
            
            //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.GrowableRail t$112498 = ((x10.util.GrowableRail)(multipleExceptions));
            
            //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final boolean t$112499 = ((t$112498) == (null));
            
            //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            if (t$112499) {
                
                //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.util.GrowableRail alloc$105044 = ((x10.util.GrowableRail)(new x10.util.GrowableRail<java.lang.RuntimeException>((java.lang.System[]) null, x10.rtt.Types.EXCEPTION)));
                
                //#line 50 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                alloc$105044.x10$util$GrowableRail$$init$S(((long)(0L)));
                
                //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                this.multipleExceptions = ((x10.util.GrowableRail)(alloc$105044));
            }
            
            //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.GrowableRail t$112500 = ((x10.util.GrowableRail)(multipleExceptions));
            
            //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            return t$112500;
        }
        
        public static x10.util.GrowableRail ensureMultipleExceptions$P(final x10.lang.ResilientStorePlaceZero.State State) {
            return State.ensureMultipleExceptions();
        }
        
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        // creation method for java code (1-phase java constructor)
        public State(final x10.lang.ResilientStorePlaceZero.State pfs, final long homeId, final long id, final x10.util.concurrent.SimpleLatch latch) {
            this((java.lang.System[]) null);
            x10$lang$ResilientStorePlaceZero$State$$init$S(pfs, homeId, id, latch);
        }
        
        // constructor for non-virtual call
        final public x10.lang.ResilientStorePlaceZero.State x10$lang$ResilientStorePlaceZero$State$$init$S(final x10.lang.ResilientStorePlaceZero.State pfs, final long homeId, final long id, final x10.util.concurrent.SimpleLatch latch) {
             {
                
                //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                
                
                //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.lang.ResilientStorePlaceZero.State this$112909 = this;
                
                //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                this$112909.adopted = false;
                
                //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                this$112909.adoptedParent = 0L;
                
                //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                this$112909.multipleExceptions = null;
                
                //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                this$112909.totalCounter = 0L;
                
                //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                this.id = id;
                
                //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                this.parent = ((x10.lang.ResilientStorePlaceZero.State)(pfs));
                
                //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.util.HashMap alloc$105045 = ((x10.util.HashMap)(new x10.util.HashMap<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>((java.lang.System[]) null, x10.rtt.ParameterizedType.make(x10.util.Pair.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG), x10.rtt.Types.INT)));
                
                //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                alloc$105045.x10$util$HashMap$$init$S();
                
                //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                this.transit = ((x10.util.HashMap)(alloc$105045));
                
                //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$112501 = x10.lang.Place.get$MAX_PLACES();
                
                //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.core.Rail t$112502 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Int>(x10.rtt.Types.INT, ((long)(t$112501)), (x10.core.Int.$box(0)), (x10.core.Rail.__1x10$lang$Rail$$T) null)));
                
                //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                this.live = ((x10.core.Rail)(t$112502));
                
                //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.util.HashMap alloc$105046 = ((x10.util.HashMap)(new x10.util.HashMap<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>((java.lang.System[]) null, x10.rtt.ParameterizedType.make(x10.util.Pair.$RTT, x10.rtt.Types.LONG, x10.rtt.Types.LONG), x10.rtt.Types.INT)));
                
                //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                alloc$105046.x10$util$HashMap$$init$S();
                
                //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                this.transitAdopted = ((x10.util.HashMap)(alloc$105046));
                
                //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$112503 = x10.lang.Place.get$MAX_PLACES();
                
                //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.core.Rail t$112504 = ((x10.core.Rail)(new x10.core.Rail<x10.core.Int>(x10.rtt.Types.INT, ((long)(t$112503)), (x10.core.Int.$box(0)), (x10.core.Rail.__1x10$lang$Rail$$T) null)));
                
                //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                this.liveAdopted = ((x10.core.Rail)(t$112504));
                
                //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.core.Rail t$112505 = ((x10.core.Rail)(this.live));
                
                //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                ((int[])t$112505.value)[(int)homeId] = 1;
                
                //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final boolean t$112508 = x10.lang.FinishState.get$VERBOSE();
                
                //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                if (t$112508) {
                    
                    //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final java.lang.String t$112506 = (("    initial live(") + ((x10.core.Long.$box(homeId))));
                    
                    //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final java.lang.String t$112507 = ((t$112506) + (") == 1"));
                    
                    //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    java.lang.System.err.println(t$112507);
                }
                
                //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                this.totalCounter = 1L;
                
                //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                this.homeId = homeId;
                
                //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                this.adopted = false;
                
                //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                this.latch = ((x10.util.concurrent.SimpleLatch)(latch));
            }
            return this;
        }
        
        
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        public void transitInc(final long src, final long dst, final int v) {
            
            //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final boolean t$112509 = ((int) v) == ((int) 0);
            
            //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            if (t$112509) {
                
                //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                return;
            }
            
            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.Pair p = new x10.util.Pair<x10.core.Long, x10.core.Long>((java.lang.System[]) null, x10.rtt.Types.LONG, x10.rtt.Types.LONG);
            
            //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            final long first$112321 = src;
            
            //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            final long second$112322 = dst;
            
            //#line 22 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            ((x10.util.Pair<x10.core.Long, x10.core.Long>)p).first = x10.core.Long.$box(first$112321);
            
            //#line 23 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            ((x10.util.Pair<x10.core.Long, x10.core.Long>)p).second = x10.core.Long.$box(second$112322);
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.HashMap t$112510 = ((x10.util.HashMap)(transit));
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final int old = x10.core.Int.$unbox(((x10.util.HashMap<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>)t$112510).getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((x10.util.Pair)(p)), x10.core.Int.$box(0)));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.HashMap t$112511 = ((x10.util.HashMap)(transit));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final int t$112512 = ((old) + (((int)(v))));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            ((x10.util.HashMap<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>)t$112511).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((x10.util.Pair)(p)), x10.core.Int.$box(t$112512));
        }
        
        
        //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        public void transitDec(final long src, final long dst) {
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.Pair p = new x10.util.Pair<x10.core.Long, x10.core.Long>((java.lang.System[]) null, x10.rtt.Types.LONG, x10.rtt.Types.LONG);
            
            //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            final long first$112326 = src;
            
            //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            final long second$112327 = dst;
            
            //#line 22 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            ((x10.util.Pair<x10.core.Long, x10.core.Long>)p).first = x10.core.Long.$box(first$112326);
            
            //#line 23 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            ((x10.util.Pair<x10.core.Long, x10.core.Long>)p).second = x10.core.Long.$box(second$112327);
            
            //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.HashMap t$112513 = ((x10.util.HashMap)(transit));
            
            //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final int old = x10.core.Int.$unbox(((x10.util.HashMap<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>)t$112513).getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((x10.util.Pair)(p)), x10.core.Int.$box(0)));
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.HashMap t$112514 = ((x10.util.HashMap)(transit));
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final int t$112515 = ((old) - (((int)(1))));
            
            //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            ((x10.util.HashMap<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>)t$112514).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((x10.util.Pair)(p)), x10.core.Int.$box(t$112515));
        }
        
        
        //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        public int transitGet$O(final long src, final long dst) {
            
            //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.Pair p = new x10.util.Pair<x10.core.Long, x10.core.Long>((java.lang.System[]) null, x10.rtt.Types.LONG, x10.rtt.Types.LONG);
            
            //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            final long first$112331 = src;
            
            //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            final long second$112332 = dst;
            
            //#line 22 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            ((x10.util.Pair<x10.core.Long, x10.core.Long>)p).first = x10.core.Long.$box(first$112331);
            
            //#line 23 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            ((x10.util.Pair<x10.core.Long, x10.core.Long>)p).second = x10.core.Long.$box(second$112332);
            
            //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.HashMap t$112516 = ((x10.util.HashMap)(transit));
            
            //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final int t$112517 = x10.core.Int.$unbox(((x10.util.HashMap<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>)t$112516).getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((x10.util.Pair)(p)), x10.core.Int.$box(0)));
            
            //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            return t$112517;
        }
        
        
        //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        public void transitSet(final long src, final long dst, final int v) {
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.Pair p = new x10.util.Pair<x10.core.Long, x10.core.Long>((java.lang.System[]) null, x10.rtt.Types.LONG, x10.rtt.Types.LONG);
            
            //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            final long first$112336 = src;
            
            //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            final long second$112337 = dst;
            
            //#line 22 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            ((x10.util.Pair<x10.core.Long, x10.core.Long>)p).first = x10.core.Long.$box(first$112336);
            
            //#line 23 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            ((x10.util.Pair<x10.core.Long, x10.core.Long>)p).second = x10.core.Long.$box(second$112337);
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.HashMap t$112518 = ((x10.util.HashMap)(transit));
            
            //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            ((x10.util.HashMap<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>)t$112518).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((x10.util.Pair)(p)), x10.core.Int.$box(v));
        }
        
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        public void transitAdoptedInc(final long src, final long dst, final int v) {
            
            //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final boolean t$112519 = ((int) v) == ((int) 0);
            
            //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            if (t$112519) {
                
                //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                return;
            }
            
            //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.Pair p = new x10.util.Pair<x10.core.Long, x10.core.Long>((java.lang.System[]) null, x10.rtt.Types.LONG, x10.rtt.Types.LONG);
            
            //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            final long first$112341 = src;
            
            //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            final long second$112342 = dst;
            
            //#line 22 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            ((x10.util.Pair<x10.core.Long, x10.core.Long>)p).first = x10.core.Long.$box(first$112341);
            
            //#line 23 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            ((x10.util.Pair<x10.core.Long, x10.core.Long>)p).second = x10.core.Long.$box(second$112342);
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.HashMap t$112520 = ((x10.util.HashMap)(transitAdopted));
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final int old = x10.core.Int.$unbox(((x10.util.HashMap<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>)t$112520).getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((x10.util.Pair)(p)), x10.core.Int.$box(0)));
            
            //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.HashMap t$112521 = ((x10.util.HashMap)(transitAdopted));
            
            //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final int t$112522 = ((old) + (((int)(v))));
            
            //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            ((x10.util.HashMap<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>)t$112521).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((x10.util.Pair)(p)), x10.core.Int.$box(t$112522));
        }
        
        
        //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        public void transitAdoptedDec(final long src, final long dst) {
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.Pair p = new x10.util.Pair<x10.core.Long, x10.core.Long>((java.lang.System[]) null, x10.rtt.Types.LONG, x10.rtt.Types.LONG);
            
            //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            final long first$112346 = src;
            
            //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            final long second$112347 = dst;
            
            //#line 22 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            ((x10.util.Pair<x10.core.Long, x10.core.Long>)p).first = x10.core.Long.$box(first$112346);
            
            //#line 23 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            ((x10.util.Pair<x10.core.Long, x10.core.Long>)p).second = x10.core.Long.$box(second$112347);
            
            //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.HashMap t$112523 = ((x10.util.HashMap)(transitAdopted));
            
            //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final int old = x10.core.Int.$unbox(((x10.util.HashMap<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>)t$112523).getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((x10.util.Pair)(p)), x10.core.Int.$box(0)));
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.HashMap t$112524 = ((x10.util.HashMap)(transitAdopted));
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final int t$112525 = ((old) - (((int)(1))));
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            ((x10.util.HashMap<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>)t$112524).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((x10.util.Pair)(p)), x10.core.Int.$box(t$112525));
        }
        
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        public int transitAdoptedGet$O(final long src, final long dst) {
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.Pair p = new x10.util.Pair<x10.core.Long, x10.core.Long>((java.lang.System[]) null, x10.rtt.Types.LONG, x10.rtt.Types.LONG);
            
            //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            final long first$112351 = src;
            
            //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            final long second$112352 = dst;
            
            //#line 22 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            ((x10.util.Pair<x10.core.Long, x10.core.Long>)p).first = x10.core.Long.$box(first$112351);
            
            //#line 23 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            ((x10.util.Pair<x10.core.Long, x10.core.Long>)p).second = x10.core.Long.$box(second$112352);
            
            //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.HashMap t$112526 = ((x10.util.HashMap)(transitAdopted));
            
            //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final int t$112527 = x10.core.Int.$unbox(((x10.util.HashMap<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>)t$112526).getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(((x10.util.Pair)(p)), x10.core.Int.$box(0)));
            
            //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            return t$112527;
        }
        
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        public void transitAdoptedSet(final long src, final long dst, final int v) {
            
            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.Pair p = new x10.util.Pair<x10.core.Long, x10.core.Long>((java.lang.System[]) null, x10.rtt.Types.LONG, x10.rtt.Types.LONG);
            
            //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            final long first$112356 = src;
            
            //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            final long second$112357 = dst;
            
            //#line 22 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            ((x10.util.Pair<x10.core.Long, x10.core.Long>)p).first = x10.core.Long.$box(first$112356);
            
            //#line 23 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            ((x10.util.Pair<x10.core.Long, x10.core.Long>)p).second = x10.core.Long.$box(second$112357);
            
            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.HashMap t$112528 = ((x10.util.HashMap)(transitAdopted));
            
            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            ((x10.util.HashMap<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>)t$112528).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(((x10.util.Pair)(p)), x10.core.Int.$box(v));
        }
        
        
        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        public void transitInc(final long src, final long dst) {
            
            //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            this.transitInc((long)(src), (long)(dst), (int)(1));
        }
        
        
        //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        public void transitAdoptedInc(final long src, final long dst) {
            
            //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            this.transitAdoptedInc((long)(src), (long)(dst), (int)(1));
        }
        
        
        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        public x10.lang.ResilientStorePlaceZero.State findFirstNonDeadParent() {
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.lang.ResilientStorePlaceZero.State t$112529 = ((x10.lang.ResilientStorePlaceZero.State)(parent));
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final long t$112530 = t$112529.homeId;
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final boolean t$112531 = x10.x10rt.X10RT.isPlaceDead((int)((long)(t$112530)));
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final boolean t$112533 = !(t$112531);
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            if (t$112533) {
                
                //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.lang.ResilientStorePlaceZero.State t$112532 = ((x10.lang.ResilientStorePlaceZero.State)(parent));
                
                //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                return t$112532;
            }
            
            //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.lang.ResilientStorePlaceZero.State t$112534 = ((x10.lang.ResilientStorePlaceZero.State)(parent));
            
            //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.lang.ResilientStorePlaceZero.State t$112535 = t$112534.findFirstNonDeadParent();
            
            //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            return t$112535;
        }
        
        
        //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        public void adopt(final x10.lang.ResilientStorePlaceZero.State child) {
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final long t$112938 = x10.lang.Place.get$MAX_PLACES();
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final long i$105093max$112939 = ((t$112938) - (((long)(1L))));
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            long i$112935 = 0L;
            
            //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            for (;
                 true;
                 ) {
                
                //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$112936 = i$112935;
                
                //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final boolean t$112937 = ((t$112936) <= (((long)(i$105093max$112939))));
                
                //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                if (!(t$112937)) {
                    
                    //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    break;
                }
                
                //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long i$112932 = i$112935;
                
                //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.core.Rail a$112920 = ((x10.core.Rail)(liveAdopted));
                
                //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long i$112921 = i$112932;
                
                //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final int t$112922 = ((int[])a$112920.value)[(int)i$112921];
                
                //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.core.Rail t$112923 = ((x10.core.Rail)(child.live));
                
                //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final int t$112924 = ((int[])t$112923.value)[(int)i$112932];
                
                //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final int r$112925 = ((t$112922) + (((int)(t$112924))));
                
                //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                ((int[])a$112920.value)[(int)i$112921] = r$112925;
                
                //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.core.Rail a$112926 = ((x10.core.Rail)(liveAdopted));
                
                //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long i$112927 = i$112932;
                
                //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final int t$112928 = ((int[])a$112926.value)[(int)i$112927];
                
                //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.core.Rail t$112929 = ((x10.core.Rail)(child.liveAdopted));
                
                //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final int t$112930 = ((int[])t$112929.value)[(int)i$112932];
                
                //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final int r$112931 = ((t$112928) + (((int)(t$112930))));
                
                //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                ((int[])a$112926.value)[(int)i$112927] = r$112931;
                
                //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$112918 = x10.lang.Place.get$MAX_PLACES();
                
                //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long i$105075max$112919 = ((t$112918) - (((long)(1L))));
                
                //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                long i$112915 = 0L;
                
                //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final long t$112916 = i$112915;
                    
                    //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final boolean t$112917 = ((t$112916) <= (((long)(i$105075max$112919))));
                    
                    //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (!(t$112917)) {
                        
                        //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        break;
                    }
                    
                    //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final long j$112912 = i$112915;
                    
                    //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final int t$112910 = child.transitGet$O((long)(j$112912), (long)(i$112932));
                    
                    //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    this.transitAdoptedInc((long)(j$112912), (long)(i$112932), (int)(t$112910));
                    
                    //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final int t$112911 = child.transitAdoptedGet$O((long)(j$112912), (long)(i$112932));
                    
                    //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    this.transitAdoptedInc((long)(j$112912), (long)(i$112932), (int)(t$112911));
                    
                    //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final long t$112913 = i$112915;
                    
                    //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final long t$112914 = ((t$112913) + (((long)(1L))));
                    
                    //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    i$112915 = t$112914;
                }
                
                //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$112933 = i$112935;
                
                //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$112934 = ((t$112933) + (((long)(1L))));
                
                //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                i$112935 = t$112934;
            }
            
            //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            this.recalculateTotal();
            
            //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            child.adopted = true;
            
            //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final long t$112556 = id;
            
            //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            child.adoptedParent = t$112556;
            
            //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.concurrent.SimpleLatch t$112557 = ((x10.util.concurrent.SimpleLatch)(child.latch));
            
            //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            t$112557.release();
        }
        
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        public void addDeadPlaceException(final x10.lang.Place p) {
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.lang.DeadPlaceException e = ((x10.lang.DeadPlaceException)(new x10.lang.DeadPlaceException(((x10.lang.Place)(p)))));
            
            //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            x10.runtime.impl.java.EvalUtils.eval(e.fillInStackTrace());
            
            //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.GrowableRail t$112558 = ((x10.util.GrowableRail)(this.ensureMultipleExceptions()));
            
            //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            ((x10.util.GrowableRail<java.lang.RuntimeException>)t$112558).add__0x10$util$GrowableRail$$T(((java.lang.RuntimeException)(e)));
        }
        
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final public x10.lang.ResilientStorePlaceZero.State x10$lang$ResilientStorePlaceZero$State$$this$x10$lang$ResilientStorePlaceZero$State() {
            
            //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            return x10.lang.ResilientStorePlaceZero.State.this;
        }
        
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final public void __fieldInitializers_x10_lang_ResilientStorePlaceZero_State() {
            
            //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            this.adopted = false;
            
            //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            this.adoptedParent = 0L;
            
            //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            this.multipleExceptions = null;
            
            //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            this.totalCounter = 0L;
        }
    }
    
    
    //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    public x10.util.GrowableRail<x10.lang.ResilientStorePlaceZero.State> states;
    
    //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    public long numDead;
    
    
    //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    public static long make$O(final long homeId, final long parentId, final x10.util.concurrent.SimpleLatch latch) {
        
        //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final x10.core.fun.Fun_0_0 t$112577 = ((x10.core.fun.Fun_0_0)(new x10.lang.ResilientStorePlaceZero.$Closure$173(parentId, homeId, latch)));
        
        //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final long t$112578 = x10.lang.ResilientStorePlaceZero.lowLevelAtExprLong__0$1x10$lang$Long$2$O(((x10.core.fun.Fun_0_0)(t$112577)));
        
        //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        return t$112578;
    }
    
    
    //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    public static x10.util.Pair getStateAccountingForAdoption(final long id) {
        
        //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final x10.lang.ResilientStorePlaceZero t$112579 = ((x10.lang.ResilientStorePlaceZero)(x10.lang.ResilientStorePlaceZero.get$me()));
        
        //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final x10.util.GrowableRail this$112367 = ((x10.util.GrowableRail)(t$112579.states));
        
        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long idx$112366 = id;
        
        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        x10.lang.ResilientStorePlaceZero.State ret$112368 =  null;
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$112953 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.lang.ResilientStorePlaceZero.State>)this$112367).data));
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.lang.ResilientStorePlaceZero.State t$112954 = ((x10.lang.ResilientStorePlaceZero.State[])t$112953.value)[(int)idx$112366];
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ret$112368 = t$112954;
        
        //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        x10.lang.ResilientStorePlaceZero.State fs = ret$112368;
        
        //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        boolean adopted = false;
        
        //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        while (true) {
            
            //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.lang.ResilientStorePlaceZero.State t$112582 = ((x10.lang.ResilientStorePlaceZero.State)(fs));
            
            //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final boolean t$112588 = t$112582.adopted;
            
            //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            if (!(t$112588)) {
                
                //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                break;
            }
            
            //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            adopted = true;
            
            //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.lang.ResilientStorePlaceZero t$112947 = ((x10.lang.ResilientStorePlaceZero)(x10.lang.ResilientStorePlaceZero.get$me()));
            
            //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.GrowableRail this$112948 = ((x10.util.GrowableRail)(t$112947.states));
            
            //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.lang.ResilientStorePlaceZero.State t$112949 = ((x10.lang.ResilientStorePlaceZero.State)(fs));
            
            //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long idx$112950 = t$112949.adoptedParent;
            
            //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            x10.lang.ResilientStorePlaceZero.State ret$112951 =  null;
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.core.Rail t$112945 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.lang.ResilientStorePlaceZero.State>)this$112948).data));
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.lang.ResilientStorePlaceZero.State t$112946 = ((x10.lang.ResilientStorePlaceZero.State[])t$112945.value)[(int)idx$112950];
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ret$112951 = t$112946;
            
            //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.lang.ResilientStorePlaceZero.State t$112952 = ret$112951;
            
            //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            fs = ((x10.lang.ResilientStorePlaceZero.State)(t$112952));
        }
        
        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final x10.util.Pair alloc$105047 = new x10.util.Pair<x10.lang.ResilientStorePlaceZero.State, x10.core.Boolean>((java.lang.System[]) null, x10.lang.ResilientStorePlaceZero.State.$RTT, x10.rtt.Types.BOOLEAN);
        
        //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final x10.lang.ResilientStorePlaceZero.State first$112374 = ((x10.lang.ResilientStorePlaceZero.State)(fs));
        
        //#line 21 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        final boolean second$112375 = adopted;
        
        //#line 22 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        ((x10.util.Pair<x10.lang.ResilientStorePlaceZero.State, x10.core.Boolean>)alloc$105047).first = ((x10.lang.ResilientStorePlaceZero.State)(first$112374));
        
        //#line 23 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        ((x10.util.Pair<x10.lang.ResilientStorePlaceZero.State, x10.core.Boolean>)alloc$105047).second = x10.core.Boolean.$box(second$112375);
        
        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        return alloc$105047;
    }
    
    
    //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    public static void notifySubActivitySpawn(final long id, final long srcId, final long dstId) {
        
        //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final x10.core.fun.VoidFun_0_0 t$112612 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.ResilientStorePlaceZero.$Closure$174(id, srcId, dstId)));
        
        //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        x10.lang.ResilientStorePlaceZero.lowLevelAt(((x10.core.fun.VoidFun_0_0)(t$112612)));
    }
    
    
    //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    public static boolean notifyActivityCreation$O(final long id, final long srcId, final long dstId) {
        
        //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final x10.core.fun.Fun_0_0 t$112650 = ((x10.core.fun.Fun_0_0)(new x10.lang.ResilientStorePlaceZero.$Closure$175(id, srcId, dstId)));
        
        //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final long t$112651 = x10.lang.ResilientStorePlaceZero.lowLevelAtExprLong__0$1x10$lang$Long$2$O(((x10.core.fun.Fun_0_0)(t$112650)));
        
        //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final boolean t$112652 = ((long) 1L) == ((long) t$112651);
        
        //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        return t$112652;
    }
    
    
    //#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    public static void notifyActivityTermination(final long id, final long dstId) {
        
        //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final x10.core.fun.VoidFun_0_0 t$112672 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.ResilientStorePlaceZero.$Closure$176(id, dstId)));
        
        //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        x10.lang.ResilientStorePlaceZero.lowLevelAt(((x10.core.fun.VoidFun_0_0)(t$112672)));
    }
    
    
    //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    public static void notifyPlaceDeath(final long root_id) {
        
        //#line 314 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        assert x10.rtt.Equality.equalsequals((x10.lang.Place.place(x10.x10rt.X10RT.here())),(x10.lang.Place.get$FIRST_PLACE()));
        
        //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final x10.lang.ResilientStorePlaceZero t$112673 = ((x10.lang.ResilientStorePlaceZero)(x10.lang.ResilientStorePlaceZero.get$me()));
        
        //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        t$112673.pushUp();
    }
    
    
    //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    public static void pushException(final long id, final java.lang.RuntimeException t) {
        
        //#line 319 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final x10.core.fun.VoidFun_0_0 t$112689 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.ResilientStorePlaceZero.$Closure$177(id, t)));
        
        //#line 319 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        x10.lang.ResilientStorePlaceZero.lowLevelAt(((x10.core.fun.VoidFun_0_0)(t$112689)));
    }
    
    
    //#line 331 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    public boolean quiescent$O(final x10.lang.ResilientStorePlaceZero.State fs) {
        
        //#line 338 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final long nd = ((long)x10.x10rt.X10RT.numDead());
        
        //#line 339 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final x10.lang.ResilientStorePlaceZero t$112690 = ((x10.lang.ResilientStorePlaceZero)(x10.lang.ResilientStorePlaceZero.get$me()));
        
        //#line 339 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final long t$112691 = t$112690.numDead;
        
        //#line 339 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final boolean t$112692 = ((long) nd) != ((long) t$112691);
        
        //#line 339 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        if (t$112692) {
            
            //#line 340 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            this.numDead = nd;
            
            //#line 341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            this.pushUp();
        }
        
        //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        boolean recalc_needed = false;
        
        //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final long t$113063 = x10.lang.Place.get$MAX_PLACES();
        
        //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final long i$105165max$113064 = ((t$113063) - (((long)(1L))));
        
        //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        long i$112990 = 0L;
        
        //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        for (;
             true;
             ) {
            
            //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final long t$112991 = i$112990;
            
            //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final boolean t$112992 = ((t$112991) <= (((long)(i$105165max$113064))));
            
            //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            if (!(t$112992)) {
                
                //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                break;
            }
            
            //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final long i$112987 = i$112990;
            
            //#line 347 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final boolean t$112984 = x10.x10rt.X10RT.isPlaceDead((int)((long)(i$112987)));
            
            //#line 347 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            if (t$112984) {
                
                //#line 348 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.core.Rail t$112979 = ((x10.core.Rail)(fs.live));
                
                //#line 348 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final int t$112980 = ((int[])t$112979.value)[(int)i$112987];
                
                //#line 348 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long i$105111max$112981 = ((long)(((int)(t$112980))));
                
                //#line 348 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                long i$112961 = 1L;
                
                //#line 348 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 348 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final long t$112962 = i$112961;
                    
                    //#line 348 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final boolean t$112963 = ((t$112962) <= (((long)(i$105111max$112981))));
                    
                    //#line 348 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (!(t$112963)) {
                        
                        //#line 348 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        break;
                    }
                    
                    //#line 348 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final long unused$112958 = i$112961;
                    
                    //#line 349 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final x10.lang.Place alloc$112957 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                    
                    //#line 349 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    alloc$112957.x10$lang$Place$$init$S(((long)(i$112987)));
                    
                    //#line 349 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    fs.addDeadPlaceException(((x10.lang.Place)(alloc$112957)));
                    
                    //#line 348 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final long t$112959 = i$112961;
                    
                    //#line 348 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final long t$112960 = ((t$112959) + (((long)(1L))));
                    
                    //#line 348 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    i$112961 = t$112960;
                }
                
                //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.core.Rail t$112985 = ((x10.core.Rail)(fs.live));
                
                //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                ((int[])t$112985.value)[(int)i$112987] = 0;
                
                //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.core.Rail t$112986 = ((x10.core.Rail)(fs.liveAdopted));
                
                //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                ((int[])t$112986.value)[(int)i$112987] = 0;
                
                //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$112982 = x10.lang.Place.get$MAX_PLACES();
                
                //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long i$105147max$112983 = ((t$112982) - (((long)(1L))));
                
                //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                long i$112976 = 0L;
                
                //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final long t$112977 = i$112976;
                    
                    //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final boolean t$112978 = ((t$112977) <= (((long)(i$105147max$112983))));
                    
                    //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (!(t$112978)) {
                        
                        //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        break;
                    }
                    
                    //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final long j$112973 = i$112976;
                    
                    //#line 357 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    fs.transitSet((long)(i$112987), (long)(j$112973), (int)(0));
                    
                    //#line 358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    fs.transitAdoptedSet((long)(i$112987), (long)(j$112973), (int)(0));
                    
                    //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final int t$112971 = fs.transitGet$O((long)(j$112973), (long)(i$112987));
                    
                    //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final long i$105129max$112972 = ((long)(((int)(t$112971))));
                    
                    //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    long i$112968 = 1L;
                    
                    //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    for (;
                         true;
                         ) {
                        
                        //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final long t$112969 = i$112968;
                        
                        //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final boolean t$112970 = ((t$112969) <= (((long)(i$105129max$112972))));
                        
                        //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        if (!(t$112970)) {
                            
                            //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            break;
                        }
                        
                        //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final long unused$112965 = i$112968;
                        
                        //#line 361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final x10.lang.Place alloc$112964 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                        
                        //#line 361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        alloc$112964.x10$lang$Place$$init$S(((long)(i$112987)));
                        
                        //#line 361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        fs.addDeadPlaceException(((x10.lang.Place)(alloc$112964)));
                        
                        //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final long t$112966 = i$112968;
                        
                        //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final long t$112967 = ((t$112966) + (((long)(1L))));
                        
                        //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        i$112968 = t$112967;
                    }
                    
                    //#line 363 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    fs.transitSet((long)(j$112973), (long)(i$112987), (int)(0));
                    
                    //#line 364 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    fs.transitAdoptedSet((long)(j$112973), (long)(i$112987), (int)(0));
                    
                    //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final long t$112974 = i$112976;
                    
                    //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final long t$112975 = ((t$112974) + (((long)(1L))));
                    
                    //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    i$112976 = t$112975;
                }
                
                //#line 366 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                recalc_needed = true;
            }
            
            //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final long t$112988 = i$112990;
            
            //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final long t$112989 = ((t$112988) + (((long)(1L))));
            
            //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            i$112990 = t$112989;
        }
        
        //#line 369 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final boolean t$112721 = recalc_needed;
        
        //#line 369 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        if (t$112721) {
            
            //#line 369 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            fs.recalculateTotal();
        }
        
        //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final long t$112722 = fs.totalCounter;
        
        //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final boolean t$112723 = ((t$112722) <= (((long)(0L))));
        
        //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        if (t$112723) {
            
            //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            return true;
        }
        
        //#line 375 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final boolean t$112789 = x10.lang.FinishState.get$VERBOSE();
        
        //#line 375 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        if (t$112789) {
            
            //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final long t$112724 = fs.id;
            
            //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final java.lang.String t$112725 = (("quiescent(") + ((x10.core.Long.$box(t$112724))));
            
            //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final java.lang.String t$112726 = ((t$112725) + (")"));
            
            //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            java.lang.System.err.println(t$112726);
            
            //#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final long t$113051 = x10.lang.Place.get$MAX_PLACES();
            
            //#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final long i$105183max$113052 = ((t$113051) - (((long)(1L))));
            
            //#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            long i$113005 = 0L;
            
            //#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            for (;
                 true;
                 ) {
                
                //#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$113006 = i$113005;
                
                //#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final boolean t$113007 = ((t$113006) <= (((long)(i$105183max$113052))));
                
                //#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                if (!(t$113007)) {
                    
                    //#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    break;
                }
                
                //#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long i$113002 = i$113005;
                
                //#line 378 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.core.Rail t$112993 = ((x10.core.Rail)(fs.live));
                
                //#line 378 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final int t$112994 = ((int[])t$112993.value)[(int)i$113002];
                
                //#line 378 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$112995 = ((long)(((int)(t$112994))));
                
                //#line 378 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final boolean t$112996 = ((t$112995) > (((long)(0L))));
                
                //#line 378 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                if (t$112996) {
                    
                    //#line 379 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final boolean t$112997 = x10.lang.FinishState.get$VERBOSE();
                    
                    //#line 379 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (t$112997) {
                        
                        //#line 379 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final long t$112998 = fs.id;
                        
                        //#line 379 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112999 = (("    ") + ((x10.core.Long.$box(t$112998))));
                        
                        //#line 379 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$113000 = ((t$112999) + (" Live at "));
                        
                        //#line 379 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$113001 = ((t$113000) + ((x10.core.Long.$box(i$113002))));
                        
                        //#line 379 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        java.lang.System.err.println(t$113001);
                    }
                    
                    //#line 380 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    return false;
                }
                
                //#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$113003 = i$113005;
                
                //#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$113004 = ((t$113003) + (((long)(1L))));
                
                //#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                i$113005 = t$113004;
            }
            
            //#line 383 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.HashMap t$113053 = ((x10.util.HashMap)(fs.transit));
            
            //#line 383 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.Set t$113054 = ((x10.util.Set<x10.util.Map.Entry<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>>)
                                            ((x10.util.HashMap<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>)t$113053).entries());
            
            //#line 383 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.lang.Iterator ent$113055 = ((x10.lang.Iterator<x10.util.Map.Entry<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>>)
                                                   ((x10.lang.Iterable<x10.util.Map.Entry<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>>)t$113054).iterator());
            
            //#line 383 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            for (;
                 true;
                 ) {
                
                //#line 383 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final boolean t$113056 = ((x10.lang.Iterator<x10.util.Map.Entry<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>>)ent$113055).hasNext$O();
                
                //#line 383 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                if (!(t$113056)) {
                    
                    //#line 383 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    break;
                }
                
                //#line 383 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.util.Map.Entry ent$113008 = ((x10.util.Map.Entry)(((x10.lang.Iterator<x10.util.Map.Entry<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>>)ent$113055).next$G()));
                
                //#line 384 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final int t$113009 = x10.core.Int.$unbox(((x10.util.Map.Entry<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>)ent$113008).getValue$G());
                
                //#line 384 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$113010 = ((long)(((int)(t$113009))));
                
                //#line 384 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final boolean t$113011 = ((t$113010) > (((long)(0L))));
                
                //#line 384 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                if (t$113011) {
                    
                    //#line 385 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final x10.util.Pair pair$113012 = ((x10.util.Map.Entry<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>)ent$113008).getKey$G();
                    
                    //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final boolean t$113013 = x10.lang.FinishState.get$VERBOSE();
                    
                    //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (t$113013) {
                        
                        //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final long t$113014 = fs.id;
                        
                        //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$113015 = (("    ") + ((x10.core.Long.$box(t$113014))));
                        
                        //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$113016 = ((t$113015) + (" In transit from "));
                        
                        //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final long t$113017 = x10.core.Long.$unbox(x10.core.Long.$unbox(((x10.util.Pair<x10.core.Long, x10.core.Long>)pair$113012).first));
                        
                        //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$113018 = ((t$113016) + ((x10.core.Long.$box(t$113017))));
                        
                        //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$113019 = ((t$113018) + (" -> "));
                        
                        //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final long t$113020 = x10.core.Long.$unbox(x10.core.Long.$unbox(((x10.util.Pair<x10.core.Long, x10.core.Long>)pair$113012).second));
                        
                        //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$113021 = ((t$113019) + ((x10.core.Long.$box(t$113020))));
                        
                        //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        java.lang.System.err.println(t$113021);
                    }
                    
                    //#line 387 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    return false;
                }
            }
            
            //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final long t$113057 = x10.lang.Place.get$MAX_PLACES();
            
            //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final long i$105203max$113058 = ((t$113057) - (((long)(1L))));
            
            //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            long i$113034 = 0L;
            
            //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            for (;
                 true;
                 ) {
                
                //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$113035 = i$113034;
                
                //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final boolean t$113036 = ((t$113035) <= (((long)(i$105203max$113058))));
                
                //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                if (!(t$113036)) {
                    
                    //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    break;
                }
                
                //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long i$113031 = i$113034;
                
                //#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.core.Rail t$113022 = ((x10.core.Rail)(fs.liveAdopted));
                
                //#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final int t$113023 = ((int[])t$113022.value)[(int)i$113031];
                
                //#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$113024 = ((long)(((int)(t$113023))));
                
                //#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final boolean t$113025 = ((t$113024) > (((long)(0L))));
                
                //#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                if (t$113025) {
                    
                    //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final boolean t$113026 = x10.lang.FinishState.get$VERBOSE();
                    
                    //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (t$113026) {
                        
                        //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final long t$113027 = fs.id;
                        
                        //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$113028 = (("    ") + ((x10.core.Long.$box(t$113027))));
                        
                        //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$113029 = ((t$113028) + (" Live (adopted) at "));
                        
                        //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$113030 = ((t$113029) + ((x10.core.Long.$box(i$113031))));
                        
                        //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        java.lang.System.err.println(t$113030);
                    }
                    
                    //#line 393 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    return false;
                }
                
                //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$113032 = i$113034;
                
                //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$113033 = ((t$113032) + (((long)(1L))));
                
                //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                i$113034 = t$113033;
            }
            
            //#line 396 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.HashMap t$113059 = ((x10.util.HashMap)(fs.transitAdopted));
            
            //#line 396 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.Set t$113060 = ((x10.util.Set<x10.util.Map.Entry<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>>)
                                            ((x10.util.HashMap<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>)t$113059).entries());
            
            //#line 396 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.lang.Iterator ent$113061 = ((x10.lang.Iterator<x10.util.Map.Entry<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>>)
                                                   ((x10.lang.Iterable<x10.util.Map.Entry<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>>)t$113060).iterator());
            
            //#line 396 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            for (;
                 true;
                 ) {
                
                //#line 396 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final boolean t$113062 = ((x10.lang.Iterator<x10.util.Map.Entry<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>>)ent$113061).hasNext$O();
                
                //#line 396 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                if (!(t$113062)) {
                    
                    //#line 396 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    break;
                }
                
                //#line 396 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.util.Map.Entry ent$113037 = ((x10.util.Map.Entry)(((x10.lang.Iterator<x10.util.Map.Entry<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>>)ent$113061).next$G()));
                
                //#line 397 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final int t$113038 = x10.core.Int.$unbox(((x10.util.Map.Entry<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>)ent$113037).getValue$G());
                
                //#line 397 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$113039 = ((long)(((int)(t$113038))));
                
                //#line 397 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final boolean t$113040 = ((t$113039) > (((long)(0L))));
                
                //#line 397 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                if (t$113040) {
                    
                    //#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final x10.util.Pair pair$113041 = ((x10.util.Map.Entry<x10.util.Pair<x10.core.Long, x10.core.Long>, x10.core.Int>)ent$113037).getKey$G();
                    
                    //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final boolean t$113042 = x10.lang.FinishState.get$VERBOSE();
                    
                    //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (t$113042) {
                        
                        //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final long t$113043 = fs.id;
                        
                        //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$113044 = (("    ") + ((x10.core.Long.$box(t$113043))));
                        
                        //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$113045 = ((t$113044) + (" In transit (adopted) from "));
                        
                        //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final long t$113046 = x10.core.Long.$unbox(x10.core.Long.$unbox(((x10.util.Pair<x10.core.Long, x10.core.Long>)pair$113041).first));
                        
                        //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$113047 = ((t$113045) + ((x10.core.Long.$box(t$113046))));
                        
                        //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$113048 = ((t$113047) + (" -> "));
                        
                        //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final long t$113049 = x10.core.Long.$unbox(x10.core.Long.$unbox(((x10.util.Pair<x10.core.Long, x10.core.Long>)pair$113041).second));
                        
                        //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$113050 = ((t$113048) + ((x10.core.Long.$box(t$113049))));
                        
                        //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        java.lang.System.err.println(t$113050);
                    }
                    
                    //#line 400 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    return false;
                }
            }
        }
        
        //#line 405 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        return false;
    }
    
    
    //#line 409 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    private void pushUp() {
        
        //#line 410 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        try {{
            
            //#line 410 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            x10.lang.Runtime.enterAtomic();
            {
                
                //#line 411 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final boolean t$112790 = x10.lang.FinishState.get$VERBOSE();
                
                //#line 411 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                if (t$112790) {
                    
                    //#line 411 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    java.lang.System.err.println("pushUp called");
                }
                
                //#line 412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.util.GrowableRail this$113108 = ((x10.util.GrowableRail)(states));
                
                //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long t$113109 = ((x10.util.GrowableRail<x10.lang.ResilientStorePlaceZero.State>)this$113108).size;
                
                //#line 412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long i$105223max$113110 = ((t$113109) - (((long)(1L))));
                
                //#line 412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                long i$113085 = 0L;
                
                //#line 412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final long t$113086 = i$113085;
                    
                    //#line 412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final boolean t$113087 = ((t$113086) <= (((long)(i$105223max$113110))));
                    
                    //#line 412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (!(t$113087)) {
                        
                        //#line 412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        break;
                    }
                    
                    //#line 412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    L$113088: {
                        
                        //#line 412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final long i$113089 = i$113085;
                        //#line 413 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final x10.util.GrowableRail this$113067 = ((x10.util.GrowableRail)(states));
                        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final long idx$113068 = i$113089;
                        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        x10.lang.ResilientStorePlaceZero.State ret$113069 =  null;
                        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final x10.core.Rail t$113065 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.lang.ResilientStorePlaceZero.State>)this$113067).data));
                        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final x10.lang.ResilientStorePlaceZero.State t$113066 = ((x10.lang.ResilientStorePlaceZero.State[])t$113065.value)[(int)idx$113068];
                        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        ret$113069 = t$113066;
                        //#line 413 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final x10.lang.ResilientStorePlaceZero.State fs$113070 = ret$113069;
                        //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        boolean t$113071 = ((fs$113070) == (null));
                        //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        if (!(t$113071)) {
                            
                            //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            t$113071 = fs$113070.adopted;
                        }
                        //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final boolean t$113072 = t$113071;
                        //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        if (t$113072) {
                            
                            //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            break L$113088;
                        }
                        //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final long t$113073 = fs$113070.homeId;
                        //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final boolean t$113074 = x10.x10rt.X10RT.isPlaceDead((int)((long)(t$113073)));
                        //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        if (t$113074) {
                            
                            //#line 416 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final x10.lang.ResilientStorePlaceZero.State pfs$113075 = fs$113070.findFirstNonDeadParent();
                            
                            //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final boolean t$113076 = x10.lang.FinishState.get$VERBOSE();
                            
                            //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            if (t$113076) {
                                
                                //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                                final long t$113077 = fs$113070.id;
                                
                                //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                                final java.lang.String t$113078 = (("Finish has died (") + ((x10.core.Long.$box(t$113077))));
                                
                                //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                                final java.lang.String t$113079 = ((t$113078) + ("), adopting activities into ("));
                                
                                //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                                final long t$113080 = pfs$113075.id;
                                
                                //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                                final java.lang.String t$113081 = ((t$113079) + ((x10.core.Long.$box(t$113080))));
                                
                                //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                                final java.lang.String t$113082 = ((t$113081) + (")"));
                                
                                //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                                java.lang.System.err.println(t$113082);
                            }
                            
                            //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            pfs$113075.adopt(((x10.lang.ResilientStorePlaceZero.State)(fs$113070)));
                        }
                    }
                    
                    //#line 412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final long t$113083 = i$113085;
                    
                    //#line 412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final long t$113084 = ((t$113083) + (((long)(1L))));
                    
                    //#line 412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    i$113085 = t$113084;
                }
                
                //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.util.GrowableRail this$113111 = ((x10.util.GrowableRail)(states));
                
                //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long t$113112 = ((x10.util.GrowableRail<x10.lang.ResilientStorePlaceZero.State>)this$113111).size;
                
                //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long i$105241max$113113 = ((t$113112) - (((long)(1L))));
                
                //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                long i$113103 = 0L;
                
                //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                for (;
                     true;
                     ) {
                    
                    //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final long t$113104 = i$113103;
                    
                    //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final boolean t$113105 = ((t$113104) <= (((long)(i$105241max$113113))));
                    
                    //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (!(t$113105)) {
                        
                        //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        break;
                    }
                    
                    //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    L$113106: {
                        
                        //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final long i$113107 = i$113103;
                        //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final x10.util.GrowableRail this$113092 = ((x10.util.GrowableRail)(states));
                        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final long idx$113093 = i$113107;
                        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        x10.lang.ResilientStorePlaceZero.State ret$113094 =  null;
                        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final x10.core.Rail t$113090 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.lang.ResilientStorePlaceZero.State>)this$113092).data));
                        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final x10.lang.ResilientStorePlaceZero.State t$113091 = ((x10.lang.ResilientStorePlaceZero.State[])t$113090.value)[(int)idx$113093];
                        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        ret$113094 = t$113091;
                        //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final x10.lang.ResilientStorePlaceZero.State fs$113095 = ret$113094;
                        //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        boolean t$113096 = ((fs$113095) == (null));
                        //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        if (!(t$113096)) {
                            
                            //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            t$113096 = fs$113095.adopted;
                        }
                        //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final boolean t$113097 = t$113096;
                        //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        if (t$113097) {
                            
                            //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            break L$113106;
                        }
                        //#line 425 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final x10.lang.ResilientStorePlaceZero t$113098 = ((x10.lang.ResilientStorePlaceZero)(x10.lang.ResilientStorePlaceZero.get$me()));
                        //#line 425 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final boolean t$113099 = t$113098.quiescent$O(((x10.lang.ResilientStorePlaceZero.State)(fs$113095)));
                        //#line 425 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        if (t$113099) {
                            
                            //#line 425 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final x10.util.concurrent.SimpleLatch t$113100 = ((x10.util.concurrent.SimpleLatch)(fs$113095.latch));
                            
                            //#line 425 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            t$113100.release();
                        }
                    }
                    
                    //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final long t$113101 = i$113103;
                    
                    //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final long t$113102 = ((t$113101) + (((long)(1L))));
                    
                    //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    i$113103 = t$113102;
                }
                
                //#line 427 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final boolean t$112823 = x10.lang.FinishState.get$VERBOSE();
                
                //#line 427 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                if (t$112823) {
                    
                    //#line 427 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    java.lang.System.err.println("pushUp returning");
                }
            }
        }}finally {{
              
              //#line 410 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
              x10.lang.Runtime.exitAtomic();
          }}
        }
    
    public static void pushUp$P(final x10.lang.ResilientStorePlaceZero ResilientStorePlaceZero) {
        ResilientStorePlaceZero.pushUp();
    }
    
    
    //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    public static void waitForFinish(final long id) {
        
        //#line 432 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final x10.core.fun.VoidFun_0_0 t$112852 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.ResilientStorePlaceZero.$Closure$178(id)));
        
        //#line 432 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        x10.lang.ResilientStorePlaceZero.lowLevelAt(((x10.core.fun.VoidFun_0_0)(t$112852)));
    }
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    final public x10.lang.ResilientStorePlaceZero x10$lang$ResilientStorePlaceZero$$this$x10$lang$ResilientStorePlaceZero() {
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        return x10.lang.ResilientStorePlaceZero.this;
    }
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    // creation method for java code (1-phase java constructor)
    public ResilientStorePlaceZero() {
        this((java.lang.System[]) null);
        x10$lang$ResilientStorePlaceZero$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.lang.ResilientStorePlaceZero x10$lang$ResilientStorePlaceZero$$init$S() {
         {
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.lang.ResilientStorePlaceZero this$112404 = this;
            
            //#line 226 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.GrowableRail alloc$113119 = ((x10.util.GrowableRail)(new x10.util.GrowableRail<x10.lang.ResilientStorePlaceZero.State>((java.lang.System[]) null, x10.lang.ResilientStorePlaceZero.State.$RTT)));
            
            //#line 50 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            alloc$113119.x10$util$GrowableRail$$init$S(((long)(0L)));
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            this$112404.states = ((x10.util.GrowableRail)(alloc$113119));
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            this$112404.numDead = 0L;
        }
        return this;
    }
    
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    final public void __fieldInitializers_x10_lang_ResilientStorePlaceZero() {
        
        //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        final x10.util.GrowableRail alloc$105051 = ((x10.util.GrowableRail)(new x10.util.GrowableRail<x10.lang.ResilientStorePlaceZero.State>((java.lang.System[]) null, x10.lang.ResilientStorePlaceZero.State.$RTT)));
        
        //#line 50 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        alloc$105051.x10$util$GrowableRail$$init$S(((long)(0L)));
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        this.states = ((x10.util.GrowableRail)(alloc$105051));
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        this.numDead = 0L;
    }
    
    final private static x10.core.concurrent.AtomicInteger initStatus$me = new x10.core.concurrent.AtomicInteger(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED);
    private static x10.lang.ExceptionInInitializer exception$me;
    
    public static x10.lang.ResilientStorePlaceZero get$me() {
        if (((int) x10.lang.ResilientStorePlaceZero.initStatus$me.get()) == ((int) x10.runtime.impl.java.InitDispatcher.INITIALIZED)) {
            return x10.lang.ResilientStorePlaceZero.me;
        }
        if (((int) x10.lang.ResilientStorePlaceZero.initStatus$me.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
            throw x10.lang.ResilientStorePlaceZero.exception$me;
        }
        if (x10.lang.ResilientStorePlaceZero.initStatus$me.compareAndSet((int)(x10.runtime.impl.java.InitDispatcher.UNINITIALIZED), (int)(x10.runtime.impl.java.InitDispatcher.INITIALIZING))) {
            try {{
                x10.lang.ResilientStorePlaceZero.me = ((x10.lang.ResilientStorePlaceZero)(new x10.lang.ResilientStorePlaceZero((java.lang.System[]) null).x10$lang$ResilientStorePlaceZero$$init$S()));
            }}catch (java.lang.Throwable exc$113120) {
                x10.lang.ResilientStorePlaceZero.exception$me = new x10.lang.ExceptionInInitializer(exc$113120);
                x10.lang.ResilientStorePlaceZero.initStatus$me.set((int)(x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED));
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                x10.runtime.impl.java.InitDispatcher.notifyInitialized();
                throw x10.lang.ResilientStorePlaceZero.exception$me;
            }
            x10.lang.ResilientStorePlaceZero.initStatus$me.set((int)(x10.runtime.impl.java.InitDispatcher.INITIALIZED));
            x10.runtime.impl.java.InitDispatcher.lockInitialized();
            x10.runtime.impl.java.InitDispatcher.notifyInitialized();
        } else {
            if (x10.lang.ResilientStorePlaceZero.initStatus$me.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                x10.runtime.impl.java.InitDispatcher.lockInitialized();
                while (x10.lang.ResilientStorePlaceZero.initStatus$me.get() < x10.runtime.impl.java.InitDispatcher.INITIALIZED) {
                    x10.runtime.impl.java.InitDispatcher.awaitInitialized();
                }
                x10.runtime.impl.java.InitDispatcher.unlockInitialized();
                if (((int) x10.lang.ResilientStorePlaceZero.initStatus$me.get()) == ((int) x10.runtime.impl.java.InitDispatcher.EXCEPTION_RAISED)) {
                    throw x10.lang.ResilientStorePlaceZero.exception$me;
                }
            }
        }
        return x10.lang.ResilientStorePlaceZero.me;
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure_low_level_at_back_exc extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure_low_level_at_back_exc> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure_low_level_at_back_exc> make($Closure_low_level_at_back_exc.class,
                                                                            new x10.rtt.Type[] {
                                                                                x10.core.fun.VoidFun_0_0.$RTT
                                                                            });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.ResilientStorePlaceZero.$Closure_low_level_at_back_exc $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.exc = $deserializer.readObject();
            $_obj.t = $deserializer.readObject();
            $_obj.c = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.ResilientStorePlaceZero.$Closure_low_level_at_back_exc $_obj = new x10.lang.ResilientStorePlaceZero.$Closure_low_level_at_back_exc((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.exc);
            $serializer.write(this.t);
            $serializer.write(this.c);
            
        }
        
        // constructor just for allocation
        public $Closure_low_level_at_back_exc(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$Cell$1x10$lang$Exception$2$2__2$1x10$util$concurrent$AtomicBoolean$2 {}
        
    
        
        public void $apply() {
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.lang.Cell t$112414 = ((x10.lang.Cell)(x10.core.GlobalRef.LocalEval.<x10.lang.Cell<java.lang.RuntimeException>>getLocalOrCopy(x10.rtt.ParameterizedType.make(x10.lang.Cell.$RTT, x10.rtt.Types.EXCEPTION),((x10.core.GlobalRef<x10.lang.Cell<java.lang.RuntimeException>>)(this.exc)))));
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            ((x10.lang.Cell<java.lang.RuntimeException>)t$112414).$apply__0x10$lang$Cell$$T(((java.lang.RuntimeException)(this.t)));
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.core.concurrent.AtomicBoolean t$112415 = ((x10.core.concurrent.AtomicBoolean)(x10.core.GlobalRef.LocalEval.<x10.core.concurrent.AtomicBoolean>getLocalOrCopy(x10.core.concurrent.AtomicBoolean.$RTT,((x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean>)(this.c)))));
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            x10.runtime.impl.java.EvalUtils.eval(t$112415.getAndSet(((boolean)(true))));
        }
        
        public x10.core.GlobalRef<x10.lang.Cell<java.lang.RuntimeException>> exc;
        public java.lang.RuntimeException t;
        public x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean> c;
        
        public $Closure_low_level_at_back_exc(final x10.core.GlobalRef<x10.lang.Cell<java.lang.RuntimeException>> exc, final java.lang.RuntimeException t, final x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean> c, __0$1x10$lang$Cell$1x10$lang$Exception$2$2__2$1x10$util$concurrent$AtomicBoolean$2 $dummy) {
             {
                this.exc = ((x10.core.GlobalRef)(exc));
                this.t = ((java.lang.RuntimeException)(t));
                this.c = ((x10.core.GlobalRef)(c));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure_low_level_at_back extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure_low_level_at_back> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure_low_level_at_back> make($Closure_low_level_at_back.class,
                                                                        new x10.rtt.Type[] {
                                                                            x10.core.fun.VoidFun_0_0.$RTT
                                                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.ResilientStorePlaceZero.$Closure_low_level_at_back $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.c = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.ResilientStorePlaceZero.$Closure_low_level_at_back $_obj = new x10.lang.ResilientStorePlaceZero.$Closure_low_level_at_back((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.c);
            
        }
        
        // constructor just for allocation
        public $Closure_low_level_at_back(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$util$concurrent$AtomicBoolean$2 {}
        
    
        
        public void $apply() {
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.core.concurrent.AtomicBoolean t$112420 = ((x10.core.concurrent.AtomicBoolean)(x10.core.GlobalRef.LocalEval.<x10.core.concurrent.AtomicBoolean>getLocalOrCopy(x10.core.concurrent.AtomicBoolean.$RTT,((x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean>)(this.c)))));
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            x10.runtime.impl.java.EvalUtils.eval(t$112420.getAndSet(((boolean)(true))));
        }
        
        public x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean> c;
        
        public $Closure_low_level_at_back(final x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean> c, __0$1x10$util$concurrent$AtomicBoolean$2 $dummy) {
             {
                this.c = ((x10.core.GlobalRef)(c));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure_low_level_at_out extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure_low_level_at_out> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure_low_level_at_out> make($Closure_low_level_at_out.class,
                                                                       new x10.rtt.Type[] {
                                                                           x10.core.fun.VoidFun_0_0.$RTT
                                                                       });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.ResilientStorePlaceZero.$Closure_low_level_at_out $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.cl = $deserializer.readObject();
            $_obj.c = $deserializer.readObject();
            $_obj.exc = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.ResilientStorePlaceZero.$Closure_low_level_at_out $_obj = new x10.lang.ResilientStorePlaceZero.$Closure_low_level_at_out((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.cl);
            $serializer.write(this.c);
            $serializer.write(this.exc);
            
        }
        
        // constructor just for allocation
        public $Closure_low_level_at_out(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __1$1x10$util$concurrent$AtomicBoolean$2__2$1x10$lang$Cell$1x10$lang$Exception$2$2 {}
        
    
        
        public void $apply() {
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            boolean exc_thrown = false;
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            try {{
                
                //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                ((x10.core.fun.VoidFun_0_0)this.cl).$apply();
            }}catch (final java.lang.RuntimeException t) {
                
                //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final boolean t$112412 = x10.lang.FinishState.get$VERBOSE();
                
                //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                if (t$112412) {
                    
                    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final java.lang.String t$112411 = (("lowLevelAt caught exception ") + (t));
                    
                    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    java.lang.System.err.println(t$112411);
                }
                
                //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                exc_thrown = true;
                
                //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.lang.Place t$112413 = ((x10.lang.Place)((this.c).home));
                
                //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$112416 = t$112413.id;
                
                //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.core.fun.VoidFun_0_0 t$112417 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.ResilientStorePlaceZero.$Closure_low_level_at_back_exc(((x10.core.GlobalRef<x10.lang.Cell<java.lang.RuntimeException>>)(this.exc)), t, ((x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean>)(this.c)), (x10.lang.ResilientStorePlaceZero.$Closure_low_level_at_back_exc.__0$1x10$lang$Cell$1x10$lang$Exception$2$2__2$1x10$util$concurrent$AtomicBoolean$2) null)));
                
                //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                x10.lang.Runtime.x10rtSendMessage((long)(t$112416), ((x10.core.fun.VoidFun_0_0)(t$112417)), ((x10.lang.Runtime.Profile)(null)));
            }
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final boolean t$112418 = exc_thrown;
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final boolean t$112423 = !(t$112418);
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            if (t$112423) {
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.lang.Place t$112419 = ((x10.lang.Place)((this.c).home));
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final long t$112421 = t$112419.id;
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.core.fun.VoidFun_0_0 t$112422 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.ResilientStorePlaceZero.$Closure_low_level_at_back(((x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean>)(this.c)), (x10.lang.ResilientStorePlaceZero.$Closure_low_level_at_back.__0$1x10$util$concurrent$AtomicBoolean$2) null)));
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                x10.lang.Runtime.x10rtSendMessage((long)(t$112421), ((x10.core.fun.VoidFun_0_0)(t$112422)), ((x10.lang.Runtime.Profile)(null)));
            }
        }
        
        public x10.core.fun.VoidFun_0_0 cl;
        public x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean> c;
        public x10.core.GlobalRef<x10.lang.Cell<java.lang.RuntimeException>> exc;
        
        public $Closure_low_level_at_out(final x10.core.fun.VoidFun_0_0 cl, final x10.core.GlobalRef<x10.core.concurrent.AtomicBoolean> c, final x10.core.GlobalRef<x10.lang.Cell<java.lang.RuntimeException>> exc, __1$1x10$util$concurrent$AtomicBoolean$2__2$1x10$lang$Cell$1x10$lang$Exception$2$2 $dummy) {
             {
                this.cl = ((x10.core.fun.VoidFun_0_0)(cl));
                this.c = ((x10.core.GlobalRef)(c));
                this.exc = ((x10.core.GlobalRef)(exc));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure_low_level_at_int_back extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure_low_level_at_int_back> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure_low_level_at_int_back> make($Closure_low_level_at_int_back.class,
                                                                            new x10.rtt.Type[] {
                                                                                x10.core.fun.VoidFun_0_0.$RTT
                                                                            });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.ResilientStorePlaceZero.$Closure_low_level_at_int_back $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.c = $deserializer.readObject();
            $_obj.r = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.ResilientStorePlaceZero.$Closure_low_level_at_int_back $_obj = new x10.lang.ResilientStorePlaceZero.$Closure_low_level_at_int_back((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.c);
            $serializer.write(this.r);
            
        }
        
        // constructor just for allocation
        public $Closure_low_level_at_int_back(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$util$concurrent$AtomicLong$2 {}
        
    
        
        public void $apply() {
            
            //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.core.concurrent.AtomicLong t$112446 = ((x10.core.concurrent.AtomicLong)(x10.core.GlobalRef.LocalEval.<x10.core.concurrent.AtomicLong>getLocalOrCopy(x10.core.concurrent.AtomicLong.$RTT,((x10.core.GlobalRef<x10.core.concurrent.AtomicLong>)(this.c)))));
            
            //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            t$112446.set(((long)(this.r)));
        }
        
        public x10.core.GlobalRef<x10.core.concurrent.AtomicLong> c;
        public long r;
        
        public $Closure_low_level_at_int_back(final x10.core.GlobalRef<x10.core.concurrent.AtomicLong> c, final long r, __0$1x10$util$concurrent$AtomicLong$2 $dummy) {
             {
                this.c = ((x10.core.GlobalRef)(c));
                this.r = r;
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure_low_level_at_int_out extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure_low_level_at_int_out> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure_low_level_at_int_out> make($Closure_low_level_at_int_out.class,
                                                                           new x10.rtt.Type[] {
                                                                               x10.core.fun.VoidFun_0_0.$RTT
                                                                           });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.ResilientStorePlaceZero.$Closure_low_level_at_int_out $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.cl = $deserializer.readObject();
            $_obj.c = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.ResilientStorePlaceZero.$Closure_low_level_at_int_out $_obj = new x10.lang.ResilientStorePlaceZero.$Closure_low_level_at_int_out((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.cl);
            $serializer.write(this.c);
            
        }
        
        // constructor just for allocation
        public $Closure_low_level_at_int_out(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$lang$Long$2__1$1x10$util$concurrent$AtomicLong$2 {}
        
    
        
        public void $apply() {
            
            //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final long r = x10.core.Long.$unbox(((x10.core.fun.Fun_0_0<x10.core.Long>)this.cl).$apply$G());
            
            //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.lang.Place t$112445 = ((x10.lang.Place)((this.c).home));
            
            //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final long t$112447 = t$112445.id;
            
            //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.core.fun.VoidFun_0_0 t$112448 = ((x10.core.fun.VoidFun_0_0)(new x10.lang.ResilientStorePlaceZero.$Closure_low_level_at_int_back(((x10.core.GlobalRef<x10.core.concurrent.AtomicLong>)(this.c)), r, (x10.lang.ResilientStorePlaceZero.$Closure_low_level_at_int_back.__0$1x10$util$concurrent$AtomicLong$2) null)));
            
            //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            x10.lang.Runtime.x10rtSendMessage((long)(t$112447), ((x10.core.fun.VoidFun_0_0)(t$112448)), ((x10.lang.Runtime.Profile)(null)));
        }
        
        public x10.core.fun.Fun_0_0<x10.core.Long> cl;
        public x10.core.GlobalRef<x10.core.concurrent.AtomicLong> c;
        
        public $Closure_low_level_at_int_out(final x10.core.fun.Fun_0_0<x10.core.Long> cl, final x10.core.GlobalRef<x10.core.concurrent.AtomicLong> c, __0$1x10$lang$Long$2__1$1x10$util$concurrent$AtomicLong$2 $dummy) {
             {
                this.cl = ((x10.core.fun.Fun_0_0)(cl));
                this.c = ((x10.core.GlobalRef)(c));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$173 extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$173> $RTT = 
            x10.rtt.StaticFunType.<$Closure$173> make($Closure$173.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.ResilientStorePlaceZero.$Closure$173 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.parentId = $deserializer.readLong();
            $_obj.homeId = $deserializer.readLong();
            $_obj.latch = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.ResilientStorePlaceZero.$Closure$173 $_obj = new x10.lang.ResilientStorePlaceZero.$Closure$173((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.parentId);
            $serializer.write(this.homeId);
            $serializer.write(this.latch);
            
        }
        
        // constructor just for allocation
        public $Closure$173(final java.lang.System[] $dummy) {
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.core.Long $apply$G() {
            return x10.core.Long.$box($apply$O());
        }
        
        
    
        
        public long $apply$O() {
            
            //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            try {{
                
                //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                x10.lang.Runtime.enterAtomic();
                {
                    
                    //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final boolean t$112562 = ((long) this.parentId) == ((long) -1L);
                    
                    //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    x10.lang.ResilientStorePlaceZero.State t$112563 =  null;
                    
                    //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (t$112562) {
                        
                        //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        t$112563 = null;
                    } else {
                        
                        //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final x10.lang.ResilientStorePlaceZero t$112559 = ((x10.lang.ResilientStorePlaceZero)(x10.lang.ResilientStorePlaceZero.get$me()));
                        
                        //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final x10.util.GrowableRail this$112362 = ((x10.util.GrowableRail)(t$112559.states));
                        
                        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final long idx$112361 = this.parentId;
                        
                        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        x10.lang.ResilientStorePlaceZero.State ret$112363 =  null;
                        
                        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final x10.core.Rail t$112940 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.lang.ResilientStorePlaceZero.State>)this$112362).data));
                        
                        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final x10.lang.ResilientStorePlaceZero.State t$112941 = ((x10.lang.ResilientStorePlaceZero.State[])t$112940.value)[(int)idx$112361];
                        
                        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        ret$112363 = t$112941;
                        
                        //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        t$112563 = ret$112363;
                    }
                    
                    //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final x10.lang.ResilientStorePlaceZero.State pfs = t$112563;
                    
                    //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final x10.lang.ResilientStorePlaceZero t$112564 = ((x10.lang.ResilientStorePlaceZero)(x10.lang.ResilientStorePlaceZero.get$me()));
                    
                    //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final x10.util.GrowableRail this$112365 = ((x10.util.GrowableRail)(t$112564.states));
                    
                    //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final long id = ((x10.util.GrowableRail<x10.lang.ResilientStorePlaceZero.State>)this$112365).size;
                    
                    //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final boolean t$112570 = x10.lang.FinishState.get$VERBOSE();
                    
                    //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (t$112570) {
                        
                        //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112565 = (("make(") + ((x10.core.Long.$box(this.parentId))));
                        
                        //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112566 = ((t$112565) + (","));
                        
                        //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112567 = ((t$112566) + ((x10.core.Long.$box(id))));
                        
                        //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112568 = ((t$112567) + (") @ "));
                        
                        //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112569 = ((t$112568) + ((x10.core.Long.$box(this.homeId))));
                        
                        //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        java.lang.System.err.println(t$112569);
                    }
                    
                    //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final x10.lang.ResilientStorePlaceZero.State fs = ((x10.lang.ResilientStorePlaceZero.State)(new x10.lang.ResilientStorePlaceZero.State((java.lang.System[]) null)));
                    
                    //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final boolean t$112942 = ((this.latch) == (null));
                    
                    //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    x10.util.concurrent.SimpleLatch t$112943 =  null;
                    
                    //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (t$112942) {
                        
                        //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        t$112943 = new x10.util.concurrent.SimpleLatch();
                    } else {
                        
                        //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        t$112943 = this.latch;
                    }
                    
                    //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final x10.util.concurrent.SimpleLatch t$112944 = t$112943;
                    
                    //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    fs.x10$lang$ResilientStorePlaceZero$State$$init$S(((x10.lang.ResilientStorePlaceZero.State)(pfs)), this.homeId, ((long)(id)), t$112944);
                    
                    //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final x10.lang.ResilientStorePlaceZero t$112574 = ((x10.lang.ResilientStorePlaceZero)(x10.lang.ResilientStorePlaceZero.get$me()));
                    
                    //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final x10.util.GrowableRail t$112575 = ((x10.util.GrowableRail)(t$112574.states));
                    
                    //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    ((x10.util.GrowableRail<x10.lang.ResilientStorePlaceZero.State>)t$112575).add__0x10$util$GrowableRail$$T(((x10.lang.ResilientStorePlaceZero.State)(fs)));
                    
                    //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final long t$112576 = fs.id;
                    
                    //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    return t$112576;
                }
            }}finally {{
                  
                  //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                  x10.lang.Runtime.exitAtomic();
              }}
            }
        
        public long parentId;
        public long homeId;
        public x10.util.concurrent.SimpleLatch latch;
        
        public $Closure$173(final long parentId, final long homeId, final x10.util.concurrent.SimpleLatch latch) {
             {
                this.parentId = parentId;
                this.homeId = homeId;
                this.latch = ((x10.util.concurrent.SimpleLatch)(latch));
            }
        }
        
        }
        
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$174 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$174> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$174> make($Closure$174.class,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.ResilientStorePlaceZero.$Closure$174 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.id = $deserializer.readLong();
            $_obj.srcId = $deserializer.readLong();
            $_obj.dstId = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.ResilientStorePlaceZero.$Closure$174 $_obj = new x10.lang.ResilientStorePlaceZero.$Closure$174((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.id);
            $serializer.write(this.srcId);
            $serializer.write(this.dstId);
            
        }
        
        // constructor just for allocation
        public $Closure$174(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            try {{
                
                //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                x10.lang.Runtime.enterAtomic();
                {
                    
                    //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final boolean t$112595 = x10.lang.FinishState.get$VERBOSE();
                    
                    //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (t$112595) {
                        
                        //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112589 = (("notifySubActivitySpawn(") + ((x10.core.Long.$box(this.id))));
                        
                        //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112590 = ((t$112589) + (", "));
                        
                        //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112591 = ((t$112590) + ((x10.core.Long.$box(this.srcId))));
                        
                        //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112592 = ((t$112591) + (", "));
                        
                        //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112593 = ((t$112592) + ((x10.core.Long.$box(this.dstId))));
                        
                        //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112594 = ((t$112593) + (")"));
                        
                        //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        java.lang.System.err.println(t$112594);
                    }
                    
                    //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final x10.util.Pair pair = x10.lang.ResilientStorePlaceZero.getStateAccountingForAdoption((long)(this.id));
                    
                    //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final x10.lang.ResilientStorePlaceZero.State fs = ((x10.lang.ResilientStorePlaceZero.State)(((x10.util.Pair<x10.lang.ResilientStorePlaceZero.State, x10.core.Boolean>)pair).first));
                    
                    //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final boolean adopted = x10.core.Boolean.$unbox(x10.core.Boolean.$unbox(((x10.util.Pair<x10.lang.ResilientStorePlaceZero.State, x10.core.Boolean>)pair).second));
                    
                    //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (adopted) {
                        
                        //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        fs.transitAdoptedInc((long)(this.srcId), (long)(this.dstId));
                        
                        //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final boolean t$112602 = x10.lang.FinishState.get$VERBOSE();
                        
                        //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        if (t$112602) {
                            
                            //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112596 = (("    transitAdopted(") + ((x10.core.Long.$box(this.srcId))));
                            
                            //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112597 = ((t$112596) + (","));
                            
                            //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112598 = ((t$112597) + ((x10.core.Long.$box(this.dstId))));
                            
                            //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112599 = ((t$112598) + (") == "));
                            
                            //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final int t$112600 = fs.transitAdoptedGet$O((long)(this.srcId), (long)(this.dstId));
                            
                            //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112601 = ((t$112599) + ((x10.core.Int.$box(t$112600))));
                            
                            //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            java.lang.System.err.println(t$112601);
                        }
                    } else {
                        
                        //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        fs.transitInc((long)(this.srcId), (long)(this.dstId));
                        
                        //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final boolean t$112609 = x10.lang.FinishState.get$VERBOSE();
                        
                        //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        if (t$112609) {
                            
                            //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112603 = (("    transit(") + ((x10.core.Long.$box(this.srcId))));
                            
                            //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112604 = ((t$112603) + (","));
                            
                            //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112605 = ((t$112604) + ((x10.core.Long.$box(this.dstId))));
                            
                            //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112606 = ((t$112605) + (") == "));
                            
                            //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final int t$112607 = fs.transitGet$O((long)(this.srcId), (long)(this.dstId));
                            
                            //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112608 = ((t$112606) + ((x10.core.Int.$box(t$112607))));
                            
                            //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            java.lang.System.err.println(t$112608);
                        }
                    }
                    
                    //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final long t$112610 = fs.totalCounter;
                    
                    //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final long t$112611 = ((t$112610) + (((long)(1L))));
                    
                    //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    fs.totalCounter = t$112611;
                }
            }}finally {{
                  
                  //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                  x10.lang.Runtime.exitAtomic();
              }}
            }
        
        public long id;
        public long srcId;
        public long dstId;
        
        public $Closure$174(final long id, final long srcId, final long dstId) {
             {
                this.id = id;
                this.srcId = srcId;
                this.dstId = dstId;
            }
        }
        
        }
        
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$175 extends x10.core.Ref implements x10.core.fun.Fun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$175> $RTT = 
            x10.rtt.StaticFunType.<$Closure$175> make($Closure$175.class,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_0.$RTT, x10.rtt.Types.LONG)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.ResilientStorePlaceZero.$Closure$175 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.id = $deserializer.readLong();
            $_obj.srcId = $deserializer.readLong();
            $_obj.dstId = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.ResilientStorePlaceZero.$Closure$175 $_obj = new x10.lang.ResilientStorePlaceZero.$Closure$175((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.id);
            $serializer.write(this.srcId);
            $serializer.write(this.dstId);
            
        }
        
        // constructor just for allocation
        public $Closure$175(final java.lang.System[] $dummy) {
            
        }
        
        // bridge for method abstract public ()=>U.operator()():U
        public x10.core.Long $apply$G() {
            return x10.core.Long.$box($apply$O());
        }
        
        
    
        
        public long $apply$O() {
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            try {{
                
                //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                x10.lang.Runtime.enterAtomic();
                {
                    
                    //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final boolean t$112619 = x10.lang.FinishState.get$VERBOSE();
                    
                    //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (t$112619) {
                        
                        //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112613 = (("notifyActivityCreation(") + ((x10.core.Long.$box(this.id))));
                        
                        //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112614 = ((t$112613) + (", "));
                        
                        //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112615 = ((t$112614) + ((x10.core.Long.$box(this.srcId))));
                        
                        //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112616 = ((t$112615) + (", "));
                        
                        //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112617 = ((t$112616) + ((x10.core.Long.$box(this.dstId))));
                        
                        //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112618 = ((t$112617) + (")"));
                        
                        //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        java.lang.System.err.println(t$112618);
                    }
                    
                    //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final x10.lang.Place alloc$105048 = ((x10.lang.Place)(new x10.lang.Place((java.lang.System[]) null)));
                    
                    //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    alloc$105048.x10$lang$Place$$init$S(this.srcId);
                    
                    //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final x10.lang.Place this$112379 = ((x10.lang.Place)(alloc$105048));
                    
                    //#line 186 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
                    final long t$112620 = this$112379.id;
                    
                    //#line 186 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
                    final boolean t$112621 = x10.x10rt.X10RT.isPlaceDead((int)((long)(t$112620)));
                    
                    //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (t$112621) {
                        
                        //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        return 0L;
                    }
                    
                    //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final x10.util.Pair pair = x10.lang.ResilientStorePlaceZero.getStateAccountingForAdoption((long)(this.id));
                    
                    //#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final x10.lang.ResilientStorePlaceZero.State fs = ((x10.lang.ResilientStorePlaceZero.State)(((x10.util.Pair<x10.lang.ResilientStorePlaceZero.State, x10.core.Boolean>)pair).first));
                    
                    //#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final boolean adopted = x10.core.Boolean.$unbox(x10.core.Boolean.$unbox(((x10.util.Pair<x10.lang.ResilientStorePlaceZero.State, x10.core.Boolean>)pair).second));
                    
                    //#line 278 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (adopted) {
                        
                        //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final x10.core.Rail a$103656 = ((x10.core.Rail)(fs.liveAdopted));
                        
                        //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final long i0$103657 = this.dstId;
                        
                        //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final int t$112622 = ((int[])a$103656.value)[(int)i0$103657];
                        
                        //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final int r$103665 = ((t$112622) + (((int)(1))));
                        
                        //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        ((int[])a$103656.value)[(int)i0$103657] = r$103665;
                        
                        //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        fs.transitAdoptedDec((long)(this.srcId), (long)(this.dstId));
                        
                        //#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final boolean t$112628 = x10.lang.FinishState.get$VERBOSE();
                        
                        //#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        if (t$112628) {
                            
                            //#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112623 = (("    liveAdopted(") + ((x10.core.Long.$box(this.dstId))));
                            
                            //#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112625 = ((t$112623) + (") == "));
                            
                            //#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final x10.core.Rail t$112624 = ((x10.core.Rail)(fs.liveAdopted));
                            
                            //#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final int t$112626 = ((int[])t$112624.value)[(int)this.dstId];
                            
                            //#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112627 = ((t$112625) + ((x10.core.Int.$box(t$112626))));
                            
                            //#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            java.lang.System.err.println(t$112627);
                        }
                        
                        //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final boolean t$112635 = x10.lang.FinishState.get$VERBOSE();
                        
                        //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        if (t$112635) {
                            
                            //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112629 = (("    transitAdopted(") + ((x10.core.Long.$box(this.srcId))));
                            
                            //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112630 = ((t$112629) + (","));
                            
                            //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112631 = ((t$112630) + ((x10.core.Long.$box(this.dstId))));
                            
                            //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112632 = ((t$112631) + (") == "));
                            
                            //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final int t$112633 = fs.transitAdoptedGet$O((long)(this.srcId), (long)(this.dstId));
                            
                            //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112634 = ((t$112632) + ((x10.core.Int.$box(t$112633))));
                            
                            //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            java.lang.System.err.println(t$112634);
                        }
                    } else {
                        
                        //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final x10.core.Rail a$103816 = ((x10.core.Rail)(fs.live));
                        
                        //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final long i0$103817 = this.dstId;
                        
                        //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final int t$112636 = ((int[])a$103816.value)[(int)i0$103817];
                        
                        //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final int r$103825 = ((t$112636) + (((int)(1))));
                        
                        //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        ((int[])a$103816.value)[(int)i0$103817] = r$103825;
                        
                        //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        fs.transitDec((long)(this.srcId), (long)(this.dstId));
                        
                        //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final boolean t$112642 = x10.lang.FinishState.get$VERBOSE();
                        
                        //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        if (t$112642) {
                            
                            //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112637 = (("    live(") + ((x10.core.Long.$box(this.dstId))));
                            
                            //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112639 = ((t$112637) + (") == "));
                            
                            //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final x10.core.Rail t$112638 = ((x10.core.Rail)(fs.live));
                            
                            //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final int t$112640 = ((int[])t$112638.value)[(int)this.dstId];
                            
                            //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112641 = ((t$112639) + ((x10.core.Int.$box(t$112640))));
                            
                            //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            java.lang.System.err.println(t$112641);
                        }
                        
                        //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final boolean t$112649 = x10.lang.FinishState.get$VERBOSE();
                        
                        //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        if (t$112649) {
                            
                            //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112643 = (("    transit(") + ((x10.core.Long.$box(this.srcId))));
                            
                            //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112644 = ((t$112643) + (","));
                            
                            //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112645 = ((t$112644) + ((x10.core.Long.$box(this.dstId))));
                            
                            //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112646 = ((t$112645) + (") == "));
                            
                            //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final int t$112647 = fs.transitGet$O((long)(this.srcId), (long)(this.dstId));
                            
                            //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112648 = ((t$112646) + ((x10.core.Int.$box(t$112647))));
                            
                            //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            java.lang.System.err.println(t$112648);
                        }
                    }
                    
                    //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    return 1L;
                }
            }}finally {{
                  
                  //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                  x10.lang.Runtime.exitAtomic();
              }}
            }
        
        public long id;
        public long srcId;
        public long dstId;
        
        public $Closure$175(final long id, final long srcId, final long dstId) {
             {
                this.id = id;
                this.srcId = srcId;
                this.dstId = dstId;
            }
        }
        
        }
        
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$176 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$176> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$176> make($Closure$176.class,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.ResilientStorePlaceZero.$Closure$176 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.id = $deserializer.readLong();
            $_obj.dstId = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.ResilientStorePlaceZero.$Closure$176 $_obj = new x10.lang.ResilientStorePlaceZero.$Closure$176((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.id);
            $serializer.write(this.dstId);
            
        }
        
        // constructor just for allocation
        public $Closure$176(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            try {{
                
                //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                x10.lang.Runtime.enterAtomic();
                {
                    
                    //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final boolean t$112657 = x10.lang.FinishState.get$VERBOSE();
                    
                    //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (t$112657) {
                        
                        //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112653 = (("notifyActivityTermination(") + ((x10.core.Long.$box(this.id))));
                        
                        //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112654 = ((t$112653) + (", "));
                        
                        //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112655 = ((t$112654) + ((x10.core.Long.$box(this.dstId))));
                        
                        //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112656 = ((t$112655) + (")"));
                        
                        //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        java.lang.System.err.println(t$112656);
                    }
                    
                    //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final x10.util.Pair pair = x10.lang.ResilientStorePlaceZero.getStateAccountingForAdoption((long)(this.id));
                    
                    //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final x10.lang.ResilientStorePlaceZero.State fs = ((x10.lang.ResilientStorePlaceZero.State)(((x10.util.Pair<x10.lang.ResilientStorePlaceZero.State, x10.core.Boolean>)pair).first));
                    
                    //#line 298 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final boolean adopted = x10.core.Boolean.$unbox(x10.core.Boolean.$unbox(((x10.util.Pair<x10.lang.ResilientStorePlaceZero.State, x10.core.Boolean>)pair).second));
                    
                    //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (adopted) {
                        
                        //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final x10.core.Rail a$104068 = ((x10.core.Rail)(fs.liveAdopted));
                        
                        //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final long i0$104069 = this.dstId;
                        
                        //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final int t$112658 = ((int[])a$104068.value)[(int)i0$104069];
                        
                        //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final int r$104077 = ((t$112658) - (((int)(1))));
                        
                        //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        ((int[])a$104068.value)[(int)i0$104069] = r$104077;
                    } else {
                        
                        //#line 302 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final x10.core.Rail a$104080 = ((x10.core.Rail)(fs.live));
                        
                        //#line 302 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final long i0$104081 = this.dstId;
                        
                        //#line 302 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final int t$112659 = ((int[])a$104080.value)[(int)i0$104081];
                        
                        //#line 302 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final int r$104089 = ((t$112659) - (((int)(1))));
                        
                        //#line 302 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        ((int[])a$104080.value)[(int)i0$104081] = r$104089;
                    }
                    
                    //#line 304 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final long t$112660 = fs.totalCounter;
                    
                    //#line 304 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final long t$112661 = ((t$112660) - (((long)(1L))));
                    
                    //#line 304 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    fs.totalCounter = t$112661;
                    
                    //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final boolean t$112667 = x10.lang.FinishState.get$VERBOSE();
                    
                    //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (t$112667) {
                        
                        //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112662 = (("    live(") + ((x10.core.Long.$box(this.dstId))));
                        
                        //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112664 = ((t$112662) + (") == "));
                        
                        //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final x10.core.Rail t$112663 = ((x10.core.Rail)(fs.live));
                        
                        //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final int t$112665 = ((int[])t$112663.value)[(int)this.dstId];
                        
                        //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112666 = ((t$112664) + ((x10.core.Int.$box(t$112665))));
                        
                        //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        java.lang.System.err.println(t$112666);
                    }
                    
                    //#line 306 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final x10.lang.ResilientStorePlaceZero t$112668 = ((x10.lang.ResilientStorePlaceZero)(x10.lang.ResilientStorePlaceZero.get$me()));
                    
                    //#line 306 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final boolean t$112671 = t$112668.quiescent$O(((x10.lang.ResilientStorePlaceZero.State)(fs)));
                    
                    //#line 306 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (t$112671) {
                        
                        //#line 307 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final boolean t$112669 = x10.lang.FinishState.get$VERBOSE();
                        
                        //#line 307 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        if (t$112669) {
                            
                            //#line 307 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            java.lang.System.err.println("    Releasing latch...");
                        }
                        
                        //#line 308 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final x10.util.concurrent.SimpleLatch t$112670 = ((x10.util.concurrent.SimpleLatch)(fs.latch));
                        
                        //#line 308 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        t$112670.release();
                    }
                }
            }}finally {{
                  
                  //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                  x10.lang.Runtime.exitAtomic();
              }}
            }
        
        public long id;
        public long dstId;
        
        public $Closure$176(final long id, final long dstId) {
             {
                this.id = id;
                this.dstId = dstId;
            }
        }
        
        }
        
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$177 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$177> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$177> make($Closure$177.class,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.ResilientStorePlaceZero.$Closure$177 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.id = $deserializer.readLong();
            $_obj.t = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.ResilientStorePlaceZero.$Closure$177 $_obj = new x10.lang.ResilientStorePlaceZero.$Closure$177((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.id);
            $serializer.write(this.t);
            
        }
        
        // constructor just for allocation
        public $Closure$177(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 319 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            try {{
                
                //#line 319 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                x10.lang.Runtime.enterAtomic();
                {
                    
                    //#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final x10.lang.ResilientStorePlaceZero t$112674 = ((x10.lang.ResilientStorePlaceZero)(x10.lang.ResilientStorePlaceZero.get$me()));
                    
                    //#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final x10.util.GrowableRail this$112381 = ((x10.util.GrowableRail)(t$112674.states));
                    
                    //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final long idx$112380 = this.id;
                    
                    //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    x10.lang.ResilientStorePlaceZero.State ret$112382 =  null;
                    
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final x10.core.Rail t$112955 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.lang.ResilientStorePlaceZero.State>)this$112381).data));
                    
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final x10.lang.ResilientStorePlaceZero.State t$112956 = ((x10.lang.ResilientStorePlaceZero.State[])t$112955.value)[(int)idx$112380];
                    
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    ret$112382 = t$112956;
                    
                    //#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final x10.lang.ResilientStorePlaceZero.State fs = ret$112382;
                    
                    //#line 321 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final boolean t$112688 = fs.adopted;
                    
                    //#line 321 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (t$112688) {
                        
                        //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final boolean t$112681 = x10.lang.FinishState.get$VERBOSE();
                        
                        //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        if (t$112681) {
                            
                            //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112677 = (("pushException(") + ((x10.core.Long.$box(this.id))));
                            
                            //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112678 = ((t$112677) + (", "));
                            
                            //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112679 = ((t$112678) + (this.t));
                            
                            //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112680 = ((t$112679) + (") dropped due to dead finish"));
                            
                            //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            java.lang.System.err.println(t$112680);
                        }
                    } else {
                        
                        //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final boolean t$112686 = x10.lang.FinishState.get$VERBOSE();
                        
                        //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        if (t$112686) {
                            
                            //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112682 = (("pushException(") + ((x10.core.Long.$box(this.id))));
                            
                            //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112683 = ((t$112682) + (", "));
                            
                            //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112684 = ((t$112683) + (this.t));
                            
                            //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            final java.lang.String t$112685 = ((t$112684) + (")"));
                            
                            //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            java.lang.System.err.println(t$112685);
                        }
                        
                        //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final x10.util.GrowableRail t$112687 = ((x10.util.GrowableRail)(fs.ensureMultipleExceptions()));
                        
                        //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        ((x10.util.GrowableRail<java.lang.RuntimeException>)t$112687).add__0x10$util$GrowableRail$$T(((java.lang.RuntimeException)(this.t)));
                    }
                }
            }}finally {{
                  
                  //#line 319 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                  x10.lang.Runtime.exitAtomic();
              }}
            }
        
        public long id;
        public java.lang.RuntimeException t;
        
        public $Closure$177(final long id, final java.lang.RuntimeException t) {
             {
                this.id = id;
                this.t = ((java.lang.RuntimeException)(t));
            }
        }
        
        }
        
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$178 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$178> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$178> make($Closure$178.class,
                                                          new x10.rtt.Type[] {
                                                              x10.core.fun.VoidFun_0_0.$RTT
                                                          });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.ResilientStorePlaceZero.$Closure$178 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.id = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.lang.ResilientStorePlaceZero.$Closure$178 $_obj = new x10.lang.ResilientStorePlaceZero.$Closure$178((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.id);
            
        }
        
        // constructor just for allocation
        public $Closure$178(final java.lang.System[] $dummy) {
            
        }
        
        
    
        
        public void $apply() {
            
            //#line 433 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final boolean t$112826 = x10.lang.FinishState.get$VERBOSE();
            
            //#line 433 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            if (t$112826) {
                
                //#line 433 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final java.lang.String t$112824 = (("waitForFinish(") + ((x10.core.Long.$box(this.id))));
                
                //#line 433 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final java.lang.String t$112825 = ((t$112824) + (")"));
                
                //#line 433 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                java.lang.System.err.println(t$112825);
            }
            
            //#line 434 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.lang.ResilientStorePlaceZero.State s;
            
            //#line 435 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            try {{
                
                //#line 435 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                x10.lang.Runtime.enterAtomic();
                {
                    
                    //#line 436 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final x10.lang.ResilientStorePlaceZero t$112827 = ((x10.lang.ResilientStorePlaceZero)(x10.lang.ResilientStorePlaceZero.get$me()));
                    
                    //#line 436 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final x10.util.GrowableRail this$112395 = ((x10.util.GrowableRail)(t$112827.states));
                    
                    //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final long idx$112394 = this.id;
                    
                    //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    x10.lang.ResilientStorePlaceZero.State ret$112396 =  null;
                    
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final x10.core.Rail t$113114 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.lang.ResilientStorePlaceZero.State>)this$112395).data));
                    
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final x10.lang.ResilientStorePlaceZero.State t$113115 = ((x10.lang.ResilientStorePlaceZero.State[])t$113114.value)[(int)idx$112394];
                    
                    //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    ret$112396 = t$113115;
                    
                    //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    final x10.lang.ResilientStorePlaceZero.State t$112830 = ret$112396;
                    
                    //#line 436 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    s = ((x10.lang.ResilientStorePlaceZero.State)(t$112830));
                }
            }}finally {{
                  
                  //#line 435 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                  x10.lang.Runtime.exitAtomic();
              }}
            
            //#line 438 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final long t$112831 = s.homeId;
            
            //#line 438 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            x10.lang.ResilientStorePlaceZero.notifyActivityTermination((long)(this.id), (long)(t$112831));
            
            //#line 440 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final x10.util.concurrent.SimpleLatch t$112832 = ((x10.util.concurrent.SimpleLatch)(s.latch));
            
            //#line 440 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            t$112832.await();
            
            //#line 444 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final boolean t$112833 = s.adopted;
            
            //#line 444 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            final boolean t$112851 = !(t$112833);
            
            //#line 444 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            if (t$112851) {
                
                //#line 445 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                try {{
                    
                    //#line 445 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    x10.lang.Runtime.enterAtomic();
                    {
                        
                        //#line 445 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final x10.lang.ResilientStorePlaceZero t$112834 = ((x10.lang.ResilientStorePlaceZero)(x10.lang.ResilientStorePlaceZero.get$me()));
                        
                        //#line 445 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final x10.util.GrowableRail this$112400 = ((x10.util.GrowableRail)(t$112834.states));
                        
                        //#line 120 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final long idx$112398 = this.id;
                        
                        //#line 120 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final x10.lang.ResilientStorePlaceZero.State v$112399 = ((x10.lang.ResilientStorePlaceZero.State)(((x10.lang.ResilientStorePlaceZero.State)
                                                                                                                            (null))));
                        
                        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final long t$113116 = ((x10.util.GrowableRail<x10.lang.ResilientStorePlaceZero.State>)this$112400).size;
                        
                        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        final boolean t$113117 = ((long) idx$112398) == ((long) t$113116);
                        
                        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                        if (t$113117) {
                            
                            //#line 123 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            ((x10.util.GrowableRail<x10.lang.ResilientStorePlaceZero.State>)this$112400).add__0x10$util$GrowableRail$$T(((x10.lang.ResilientStorePlaceZero.State)(null)));
                        } else {
                            
                            //#line 125 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            final x10.core.Rail t$113118 = ((x10.core.Rail)(((x10.util.GrowableRail<x10.lang.ResilientStorePlaceZero.State>)this$112400).data));
                            
                            //#line 125 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            ((x10.lang.ResilientStorePlaceZero.State[])t$113118.value)[(int)idx$112398] = null;
                        }
                    }
                }}finally {{
                      
                      //#line 445 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                      x10.lang.Runtime.exitAtomic();
                  }}
                
                //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final x10.util.GrowableRail t$112838 = ((x10.util.GrowableRail)(s.multipleExceptions));
                
                //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final boolean t$112844 = ((t$112838) != (null));
                
                //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                if (t$112844) {
                    
                    //#line 447 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final boolean t$112841 = x10.lang.FinishState.get$VERBOSE();
                    
                    //#line 447 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (t$112841) {
                        
                        //#line 447 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112839 = (("waitForFinish(") + ((x10.core.Long.$box(this.id))));
                        
                        //#line 447 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112840 = ((t$112839) + (") done waiting (throwing exceptions)"));
                        
                        //#line 447 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        java.lang.System.err.println(t$112840);
                    }
                    
                    //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final x10.util.GrowableRail t$112842 = ((x10.util.GrowableRail)(s.multipleExceptions));
                    
                    //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final x10.lang.MultipleExceptions t$112843 = ((x10.lang.MultipleExceptions)(new x10.lang.MultipleExceptions(t$112842, (x10.lang.MultipleExceptions.__0$1x10$lang$Exception$2) null)));
                    
                    //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    throw t$112843;
                }
                
                //#line 450 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                final boolean t$112847 = x10.lang.FinishState.get$VERBOSE();
                
                //#line 450 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                if (t$112847) {
                    
                    //#line 450 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final java.lang.String t$112845 = (("waitForFinish(") + ((x10.core.Long.$box(this.id))));
                    
                    //#line 450 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final java.lang.String t$112846 = ((t$112845) + (") done waiting"));
                    
                    //#line 450 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    java.lang.System.err.println(t$112846);
                }
                } else {
                    
                    //#line 452 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    final boolean t$112850 = x10.lang.FinishState.get$VERBOSE();
                    
                    //#line 452 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (t$112850) {
                        
                        //#line 452 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112848 = (("waitForFinish(") + ((x10.core.Long.$box(this.id))));
                        
                        //#line 452 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        final java.lang.String t$112849 = ((t$112848) + (") done waiting, finish was dead (cleaning up)"));
                        
                        //#line 452 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        java.lang.System.err.println(t$112849);
                    }
                }
            }
            
            public long id;
            
            public $Closure$178(final long id) {
                 {
                    this.id = id;
                }
            }
            
        }
        
    }
    
    