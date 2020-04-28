package x10.compiler.ws;


@x10.runtime.impl.java.X10Generated
final public class RootFinish extends x10.compiler.ws.FinishFrame implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<RootFinish> $RTT = 
        x10.rtt.NamedType.<RootFinish> make("x10.compiler.ws.RootFinish",
                                            RootFinish.class,
                                            new x10.rtt.Type[] {
                                                x10.compiler.ws.FinishFrame.$RTT
                                            });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.compiler.ws.RootFinish $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.compiler.ws.FinishFrame.$_deserialize_body($_obj, $deserializer);
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.compiler.ws.RootFinish $_obj = new x10.compiler.ws.RootFinish((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        
    }
    
    // constructor just for allocation
    public RootFinish(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RootFinish.x10"
    // creation method for java code (1-phase java constructor)
    public RootFinish() {
        this((java.lang.System[]) null);
        x10$compiler$ws$RootFinish$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.compiler.ws.RootFinish x10$compiler$ws$RootFinish$$init$S() {
         {
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RootFinish.x10"
            /*super.*/x10$compiler$ws$FinishFrame$$init$S(((x10.compiler.ws.Frame)(null)));
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RootFinish.x10"
            
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RootFinish.x10"
            final x10.compiler.ws.RootFinish this$79522 = this;
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RootFinish.x10"
            this.asyncs = 1;
        }
        return this;
    }
    
    
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RootFinish.x10"
    public void wrapResume(final x10.compiler.ws.Worker worker) {
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RootFinish.x10"
        super.wrapResume(((x10.compiler.ws.Worker)(worker)));
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RootFinish.x10"
        x10.compiler.ws.Worker.stop();
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RootFinish.x10"
        final x10.compiler.Abort t$79521 = ((x10.compiler.Abort)(x10.compiler.Abort.get$ABORT()));
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RootFinish.x10"
        throw t$79521;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RootFinish.x10"
    final public x10.compiler.ws.RootFinish x10$compiler$ws$RootFinish$$this$x10$compiler$ws$RootFinish() {
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RootFinish.x10"
        return x10.compiler.ws.RootFinish.this;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RootFinish.x10"
    final public void __fieldInitializers_x10_compiler_ws_RootFinish() {
        
    }
    
    public void x10$compiler$ws$FinishFrame$wrapResume$S(final x10.compiler.ws.Worker a0) {
        super.wrapResume(((x10.compiler.ws.Worker)(a0)));
    }
}

