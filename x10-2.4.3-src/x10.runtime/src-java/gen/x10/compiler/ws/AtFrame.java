package x10.compiler.ws;


@x10.runtime.impl.java.X10Generated
final public class AtFrame extends x10.compiler.ws.Frame implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<AtFrame> $RTT = 
        x10.rtt.NamedType.<AtFrame> make("x10.compiler.ws.AtFrame",
                                         AtFrame.class,
                                         new x10.rtt.Type[] {
                                             x10.compiler.ws.Frame.$RTT
                                         });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.compiler.ws.AtFrame $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.compiler.ws.Frame.$_deserialize_body($_obj, $deserializer);
        $_obj.upRef = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.compiler.ws.AtFrame $_obj = new x10.compiler.ws.AtFrame((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.upRef);
        
    }
    
    // constructor just for allocation
    public AtFrame(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
    public x10.core.GlobalRef<x10.compiler.ws.Frame> upRef;
    
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
    // creation method for java code (1-phase java constructor)
    public AtFrame(final x10.compiler.ws.Frame up, final x10.compiler.ws.FinishFrame ff) {
        this((java.lang.System[]) null);
        x10$compiler$ws$AtFrame$$init$S(up, ff);
    }
    
    // constructor for non-virtual call
    final public x10.compiler.ws.AtFrame x10$compiler$ws$AtFrame$$init$S(final x10.compiler.ws.Frame up, final x10.compiler.ws.FinishFrame ff) {
         {
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
            final x10.compiler.ws.Frame this$77575 = this;
            
            //#line 29 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
            final x10.compiler.ws.Frame up$77574 = ((x10.compiler.ws.Frame)(((x10.compiler.ws.Frame)
                                                                              ff)));
            
            //#line 30 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
            this$77575.up = ((x10.compiler.ws.Frame)(up$77574));
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
            
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
            final x10.compiler.ws.AtFrame this$77604 = this;
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
            final x10.core.GlobalRef t$77589 = ((x10.core.GlobalRef)(new x10.core.GlobalRef<x10.compiler.ws.Frame>(x10.compiler.ws.Frame.$RTT, ((x10.compiler.ws.Frame)(up)), (x10.core.GlobalRef.__0x10$lang$GlobalRef$$T) null)));
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
            this.upRef = ((x10.core.GlobalRef)(t$77589));
        }
        return this;
    }
    
    
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
    public void wrapResume(final x10.compiler.ws.Worker worker) {
        
        //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
        final x10.core.GlobalRef upRef$77582 = ((x10.core.GlobalRef)(upRef));
        
        //#line 33 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
        final java.lang.RuntimeException throwable$77583 = ((java.lang.RuntimeException)(worker.throwable));
        
        //#line 34 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
        final x10.core.fun.VoidFun_0_0 body$77606 = ((x10.core.fun.VoidFun_0_0)(new x10.compiler.ws.AtFrame.$Closure$12(upRef$77582, throwable$77583, (x10.compiler.ws.AtFrame.$Closure$12.__0$1x10$compiler$ws$Frame$2) null)));
        
        //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
        final x10.lang.Place t$77613 = ((x10.lang.Place)((upRef$77582).home));
        
        //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
        final long t$77614 = t$77613.id;
        
        //#line 41 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
        x10.compiler.ws.Worker.wsRunAsync((long)(t$77614), ((x10.core.fun.VoidFun_0_0)(body$77606)));
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
        worker.throwable = null;
    }
    
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
    public static void update__0$1x10$compiler$ws$Frame$2(final x10.core.GlobalRef<x10.compiler.ws.Frame> upRef, final java.lang.RuntimeException throwable) {
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
        final x10.core.fun.VoidFun_0_0 body = ((x10.core.fun.VoidFun_0_0)(new x10.compiler.ws.AtFrame.$Closure$13(upRef, throwable, (x10.compiler.ws.AtFrame.$Closure$13.__0$1x10$compiler$ws$Frame$2) null)));
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
        final x10.lang.Place t$77602 = ((x10.lang.Place)((upRef).home));
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
        final long t$77603 = t$77602.id;
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
        x10.compiler.ws.Worker.wsRunAsync((long)(t$77603), ((x10.core.fun.VoidFun_0_0)(body)));
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
    final public x10.compiler.ws.AtFrame x10$compiler$ws$AtFrame$$this$x10$compiler$ws$AtFrame() {
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
        return x10.compiler.ws.AtFrame.this;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
    final public void __fieldInitializers_x10_compiler_ws_AtFrame() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$12 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$12> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$12> make($Closure$12.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.compiler.ws.AtFrame.$Closure$12 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.upRef$77582 = $deserializer.readObject();
            $_obj.throwable$77583 = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.compiler.ws.AtFrame.$Closure$12 $_obj = new x10.compiler.ws.AtFrame.$Closure$12((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.upRef$77582);
            $serializer.write(this.throwable$77583);
            
        }
        
        // constructor just for allocation
        public $Closure$12(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$compiler$ws$Frame$2 {}
        
    
        
        public void $apply() {
            
            //#line 35 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
            final x10.core.GlobalRef t$77607 = ((x10.core.GlobalRef)(((x10.core.GlobalRef)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.core.GlobalRef.$RTT, x10.compiler.ws.Frame.$RTT),this.upRef$77582))));
            
            //#line 35 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
            x10.compiler.ws.Frame up$77608 = (((x10.core.GlobalRef<x10.compiler.ws.Frame>)(t$77607))).$apply$G();
            
            //#line 36 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
            final boolean t$77609 = ((null) != (this.throwable$77583));
            
            //#line 36 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
            if (t$77609) {
                
                //#line 37 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
                final x10.compiler.ws.ThrowFrame alloc$77610 = ((x10.compiler.ws.ThrowFrame)(new x10.compiler.ws.ThrowFrame((java.lang.System[]) null)));
                
                //#line 37 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
                final x10.compiler.ws.Frame t$77605 = up$77608;
                
                //#line 37 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
                alloc$77610.x10$compiler$ws$ThrowFrame$$init$S(t$77605, this.throwable$77583);
                
                //#line 37 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
                up$77608 = ((x10.compiler.ws.Frame)(alloc$77610));
            }
            
            //#line 39 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
            final x10.core.Deque t$77611 = x10.lang.Runtime.wsFIFO();
            
            //#line 39 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
            final x10.compiler.ws.Frame t$77612 = up$77608;
            
            //#line 39 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
            t$77611.push(((java.lang.Object)(t$77612)));
        }
        
        public x10.core.GlobalRef<x10.compiler.ws.Frame> upRef$77582;
        public java.lang.RuntimeException throwable$77583;
        
        public $Closure$12(final x10.core.GlobalRef<x10.compiler.ws.Frame> upRef$77582, final java.lang.RuntimeException throwable$77583, __0$1x10$compiler$ws$Frame$2 $dummy) {
             {
                this.upRef$77582 = ((x10.core.GlobalRef)(upRef$77582));
                this.throwable$77583 = ((java.lang.RuntimeException)(throwable$77583));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$13 extends x10.core.Ref implements x10.core.fun.VoidFun_0_0, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$13> $RTT = 
            x10.rtt.StaticVoidFunType.<$Closure$13> make($Closure$13.class,
                                                         new x10.rtt.Type[] {
                                                             x10.core.fun.VoidFun_0_0.$RTT
                                                         });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { return null; }
        
        public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.compiler.ws.AtFrame.$Closure$13 $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.upRef = $deserializer.readObject();
            $_obj.throwable = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.compiler.ws.AtFrame.$Closure$13 $_obj = new x10.compiler.ws.AtFrame.$Closure$13((java.lang.System[]) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.upRef);
            $serializer.write(this.throwable);
            
        }
        
        // constructor just for allocation
        public $Closure$13(final java.lang.System[] $dummy) {
            
        }
        
        // synthetic type for parameter mangling
        public static final class __0$1x10$compiler$ws$Frame$2 {}
        
    
        
        public void $apply() {
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
            final x10.core.GlobalRef t$77597 = ((x10.core.GlobalRef)(((x10.core.GlobalRef)x10.rtt.Types.asStruct(x10.rtt.ParameterizedType.make(x10.core.GlobalRef.$RTT, x10.compiler.ws.Frame.$RTT),this.upRef))));
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
            x10.compiler.ws.Frame up = (((x10.core.GlobalRef<x10.compiler.ws.Frame>)(t$77597))).$apply$G();
            
            //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
            final boolean t$77599 = ((null) != (this.throwable));
            
            //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
            if (t$77599) {
                
                //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
                final x10.compiler.ws.ThrowFrame alloc$77573 = ((x10.compiler.ws.ThrowFrame)(new x10.compiler.ws.ThrowFrame((java.lang.System[]) null)));
                
                //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
                final x10.compiler.ws.Frame t$77615 = up;
                
                //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
                alloc$77573.x10$compiler$ws$ThrowFrame$$init$S(t$77615, this.throwable);
                
                //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
                up = ((x10.compiler.ws.Frame)(alloc$77573));
            }
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
            final x10.core.Deque t$77600 = x10.lang.Runtime.wsFIFO();
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
            final x10.compiler.ws.Frame t$77601 = up;
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
            t$77600.push(((java.lang.Object)(t$77601)));
        }
        
        public x10.core.GlobalRef<x10.compiler.ws.Frame> upRef;
        public java.lang.RuntimeException throwable;
        
        public $Closure$13(final x10.core.GlobalRef<x10.compiler.ws.Frame> upRef, final java.lang.RuntimeException throwable, __0$1x10$compiler$ws$Frame$2 $dummy) {
             {
                this.upRef = ((x10.core.GlobalRef)(upRef));
                this.throwable = ((java.lang.RuntimeException)(throwable));
            }
        }
        
    }
    
}

