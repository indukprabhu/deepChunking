package x10.compiler.ws;


@x10.runtime.impl.java.X10Generated
abstract public class TryFrame extends x10.compiler.ws.RegularFrame implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<TryFrame> $RTT = 
        x10.rtt.NamedType.<TryFrame> make("x10.compiler.ws.TryFrame",
                                          TryFrame.class,
                                          new x10.rtt.Type[] {
                                              x10.compiler.ws.RegularFrame.$RTT
                                          });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.compiler.ws.TryFrame $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.compiler.ws.RegularFrame.$_deserialize_body($_obj, $deserializer);
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return null;
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        
    }
    
    // constructor just for allocation
    public TryFrame(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/TryFrame.x10"
    
    // constructor for non-virtual call
    final public x10.compiler.ws.TryFrame x10$compiler$ws$TryFrame$$init$S(final x10.compiler.ws.Frame up, final x10.compiler.ws.FinishFrame ff) {
         {
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/TryFrame.x10"
            /*super.*/x10$compiler$ws$RegularFrame$$init$S(((x10.compiler.ws.Frame)(up)), ((x10.compiler.ws.FinishFrame)(ff)));
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/TryFrame.x10"
            
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/TryFrame.x10"
            final x10.compiler.ws.TryFrame this$79536 = this;
        }
        return this;
    }
    
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/TryFrame.x10"
    public void wrapResume(final x10.compiler.ws.Worker worker) {
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/TryFrame.x10"
        try {{
            
            //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/TryFrame.x10"
            this.resume(((x10.compiler.ws.Worker)(worker)));
        }}catch (final x10.compiler.Abort t) {
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/TryFrame.x10"
            throw t;
        }catch (final java.lang.RuntimeException t) {
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/TryFrame.x10"
            worker.throwable = ((java.lang.RuntimeException)(t));
        }
    }
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/TryFrame.x10"
    final public x10.compiler.ws.TryFrame x10$compiler$ws$TryFrame$$this$x10$compiler$ws$TryFrame() {
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/TryFrame.x10"
        return x10.compiler.ws.TryFrame.this;
    }
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/TryFrame.x10"
    final public void __fieldInitializers_x10_compiler_ws_TryFrame() {
        
    }
}

