package x10.compiler.ws;


@x10.runtime.impl.java.X10Generated
final public class RemoteFinish extends x10.compiler.ws.FinishFrame implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<RemoteFinish> $RTT = 
        x10.rtt.NamedType.<RemoteFinish> make("x10.compiler.ws.RemoteFinish",
                                              RemoteFinish.class,
                                              new x10.rtt.Type[] {
                                                  x10.compiler.ws.FinishFrame.$RTT
                                              });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.compiler.ws.RemoteFinish $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.compiler.ws.FinishFrame.$_deserialize_body($_obj, $deserializer);
        $_obj.ffRef = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.compiler.ws.RemoteFinish $_obj = new x10.compiler.ws.RemoteFinish((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.ffRef);
        
    }
    
    // constructor just for allocation
    public RemoteFinish(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
    public x10.core.GlobalRef<x10.compiler.ws.FinishFrame> ffRef;
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
    // creation method for java code (1-phase java constructor)
    public RemoteFinish(final x10.compiler.ws.FinishFrame ff) {
        this((java.lang.System[]) null);
        x10$compiler$ws$RemoteFinish$$init$S(ff);
    }
    
    // constructor for non-virtual call
    final public x10.compiler.ws.RemoteFinish x10$compiler$ws$RemoteFinish$$init$S(final x10.compiler.ws.FinishFrame ff) {
         {
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
            /*super.*/x10$compiler$ws$FinishFrame$$init$S(((x10.compiler.ws.Frame)(null)));
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
            
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
            final x10.compiler.ws.RemoteFinish this$79511 = this;
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
            this.asyncs = 1;
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
            final x10.core.GlobalRef t$79497 = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.compiler.ws.FinishFrame>(x10.compiler.ws.FinishFrame.$RTT, ((x10.compiler.ws.FinishFrame)(ff)), (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
            this.ffRef = ((x10.core.GlobalRef)(t$79497));
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
            final x10.util.concurrent.Monitor t$79498 = ((x10.util.concurrent.Monitor)(x10.lang.Runtime.get$atomicMonitor()));
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
            t$79498.lock();
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
            final int t$79499 = ff.asyncs;
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
            final int t$79500 = ((t$79499) + (((int)(1))));
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
            ff.asyncs = t$79500;
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
            final x10.util.concurrent.Monitor t$79501 = ((x10.util.concurrent.Monitor)(x10.lang.Runtime.get$atomicMonitor()));
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
            t$79501.unlock();
        }
        return this;
    }
    
    
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
    public void wrapResume(final x10.compiler.ws.Worker worker) {
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
        super.wrapResume(((x10.compiler.ws.Worker)(worker)));
        
        //#line 40 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
        final x10.core.GlobalRef ffRef$79491 = ((x10.core.GlobalRef)(ffRef));
        
        //#line 40 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
        final x10.util.GrowableRail exceptions$79492 = ((x10.util.GrowableRail)(exceptions));
        
        //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
        final x10.core.fun.VoidFun_0_0 body$79512 = ((x10.core.fun.VoidFun_0_0)(new x10.compiler.ws.RemoteFinish.$Closure$14(ffRef$79491, exceptions$79492, (x10.compiler.ws.RemoteFinish.$Closure$14.__0$1x10$compiler$ws$FinishFrame$2__1$1x10$lang$Exception$2) null)));
        
        //#line 46 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
        final x10.lang.Place t$79516 = ((x10.lang.Place)((ffRef$79491).home));
        
        //#line 46 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
        final long t$79517 = t$79516.id;
        
        //#line 46 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
        x10.compiler.ws.Worker.wsRunAsync((long)(t$79517), ((x10.core.fun.VoidFun_0_0)(body$79512)));
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
        worker.throwable = null;
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
        final x10.compiler.Abort t$79506 = ((x10.compiler.Abort)(x10.compiler.Abort.get$ABORT()));
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
        throw t$79506;
    }
    
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
    public static void update__0$1x10$compiler$ws$FinishFrame$2__1$1x10$lang$Exception$2(final x10.core.GlobalRef<x10.compiler.ws.FinishFrame> ffRef, final x10.util.GrowableRail<java.lang.RuntimeException> exceptions) {
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
        final x10.core.fun.VoidFun_0_0 body = ((x10.core.fun.VoidFun_0_0)(new x10.compiler.ws.RemoteFinish.$Closure$15(ffRef, exceptions, (x10.compiler.ws.RemoteFinish.$Closure$15.__0$1x10$compiler$ws$FinishFrame$2__1$1x10$lang$Exception$2) null)));
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
        final x10.lang.Place t$79509 = ((x10.lang.Place)((ffRef).home));
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
        final long t$79510 = t$79509.id;
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
        x10.compiler.ws.Worker.wsRunAsync((long)(t$79510), ((x10.core.fun.VoidFun_0_0)(body)));
    }
    
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
    final public x10.compiler.ws.RemoteFinish x10$compiler$ws$RemoteFinish$$this$x10$compiler$ws$RemoteFinish() {
        
        //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
        return x10.compiler.ws.RemoteFinish.this;
    }
    
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
    final public void __fieldInitializers_x10_compiler_ws_RemoteFinish() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$14 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$14> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$14> make($Closure$14.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.compiler.ws.RemoteFinish.$Closure$14 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.ffRef$79491 = $deserializer.readObject();
            $_obj.exceptions$79492 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.compiler.ws.RemoteFinish.$Closure$14 $_obj = new x10.compiler.ws.RemoteFinish.$Closure$14((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.ffRef$79491);
            $serializer.write(this.exceptions$79492);
            
        }
        
        // constructor just for allocation
        public $Closure$14(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$compiler$ws$FinishFrame$2__1$1x10$lang$Exception$2 {}
        
    
        
        public void $apply() {
            
            //#line 42 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
            final x10.core.GlobalRef t$79513 = ((x10.core.GlobalRef)(((x10.core.GlobalRef)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.core.GlobalRef.$RTT, x10.compiler.ws.FinishFrame.$RTT),this.ffRef$79491))));
            
            //#line 42 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
            final x10.compiler.ws.FinishFrame ff$79514 = (((x10.core.GlobalRef<x10.compiler.ws.FinishFrame>)(t$79513))).$apply$G();
            
            //#line 43 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
            ff$79514.append__0$1x10$lang$Exception$2(((x10.util.GrowableRail)(this.exceptions$79492)));
            
            //#line 44 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
            final x10.core.Deque t$79515 = x10.lang.Runtime.wsFIFO();
            
            //#line 44 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
            t$79515.push(((java.lang.Object)(ff$79514)));
        }
        
        public x10.core.GlobalRef<x10.compiler.ws.FinishFrame> ffRef$79491;
        public x10.util.GrowableRail<java.lang.RuntimeException> exceptions$79492;
        
        public $Closure$14(final x10.core.GlobalRef<x10.compiler.ws.FinishFrame> ffRef$79491, final x10.util.GrowableRail<java.lang.RuntimeException> exceptions$79492, __0$1x10$compiler$ws$FinishFrame$2__1$1x10$lang$Exception$2 $dummy) {
             {
                this.ffRef$79491 = ((x10.core.GlobalRef)(ffRef$79491));
                this.exceptions$79492 = ((x10.util.GrowableRail)(exceptions$79492));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$15 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$15> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$15> make($Closure$15.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.compiler.ws.RemoteFinish.$Closure$15 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.ffRef = $deserializer.readObject();
            $_obj.exceptions = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.compiler.ws.RemoteFinish.$Closure$15 $_obj = new x10.compiler.ws.RemoteFinish.$Closure$15((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.ffRef);
            $serializer.write(this.exceptions);
            
        }
        
        // constructor just for allocation
        public $Closure$15(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$compiler$ws$FinishFrame$2__1$1x10$lang$Exception$2 {}
        
    
        
        public void $apply() {
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
            final x10.core.GlobalRef t$79507 = ((x10.core.GlobalRef)(((x10.core.GlobalRef)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.core.GlobalRef.$RTT, x10.compiler.ws.FinishFrame.$RTT),this.ffRef))));
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
            final x10.compiler.ws.FinishFrame ff = (((x10.core.GlobalRef<x10.compiler.ws.FinishFrame>)(t$79507))).$apply$G();
            
            //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
            ff.append__0$1x10$lang$Exception$2(((x10.util.GrowableRail)(this.exceptions)));
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
            final x10.core.Deque t$79508 = x10.lang.Runtime.wsFIFO();
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
            t$79508.push(((java.lang.Object)(ff)));
        }
        
        public x10.core.GlobalRef<x10.compiler.ws.FinishFrame> ffRef;
        public x10.util.GrowableRail<java.lang.RuntimeException> exceptions;
        
        public $Closure$15(final x10.core.GlobalRef<x10.compiler.ws.FinishFrame> ffRef, final x10.util.GrowableRail<java.lang.RuntimeException> exceptions, __0$1x10$compiler$ws$FinishFrame$2__1$1x10$lang$Exception$2 $dummy) {
             {
                this.ffRef = ((x10.core.GlobalRef)(ffRef));
                this.exceptions = ((x10.util.GrowableRail)(exceptions));
            }
        }
        
    }
    
    
    public void x10$compiler$ws$FinishFrame$wrapResume$S(final x10.compiler.ws.Worker a0) {
        super.wrapResume(((x10.compiler.ws.Worker)(a0)));
    }
}

