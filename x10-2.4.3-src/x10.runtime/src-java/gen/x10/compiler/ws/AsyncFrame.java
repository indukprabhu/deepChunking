package x10.compiler.ws;


@x10.runtime.impl.java.X10Generated
abstract public class AsyncFrame extends x10.compiler.ws.Frame implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<AsyncFrame> $RTT = 
        x10.rtt.NamedType.<AsyncFrame> make("x10.compiler.ws.AsyncFrame",
                                            AsyncFrame.class,
                                            new x10.rtt.Type[] {
                                                x10.compiler.ws.Frame.$RTT
                                            });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.compiler.ws.AsyncFrame $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.compiler.ws.Frame.$_deserialize_body($_obj, $deserializer);
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return null;
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        
    }
    
    // constructor just for allocation
    public AsyncFrame(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
    
    // constructor for non-virtual call
    final public x10.compiler.ws.AsyncFrame x10$compiler$ws$AsyncFrame$$init$S(final x10.compiler.ws.Frame up) {
         {
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
            final x10.compiler.ws.Frame this$77376 = this;
            
            //#line 29 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
            final x10.compiler.ws.Frame up$77375 = ((x10.compiler.ws.Frame)(up));
            
            //#line 30 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
            this$77376.up = ((x10.compiler.ws.Frame)(up$77375));
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
            
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
            final x10.compiler.ws.AsyncFrame this$77572 = this;
        }
        return this;
    }
    
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
    final public x10.compiler.ws.FinishFrame ff() {
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
        final x10.compiler.ws.Frame t$77563 = ((x10.compiler.ws.Frame)(up));
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
        final x10.compiler.ws.FinishFrame t$77564 = ((x10.compiler.ws.FinishFrame) t$77563);
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
        return t$77564;
    }
    
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
    final public void poll(final x10.compiler.ws.Worker worker) {
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
        final x10.core.Deque t$77565 = ((x10.core.Deque)(worker.deque));
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
        final java.lang.Object t$77566 = t$77565.poll();
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
        final boolean t$77567 = ((null) == (t$77566));
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
        if (t$77567) {
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
            this.pollSlow(((x10.compiler.ws.Worker)(worker)));
        }
    }
    
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
    final public void pollSlow(final x10.compiler.ws.Worker worker) {
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
        final x10.util.concurrent.Lock lock = ((x10.util.concurrent.Lock)(worker.lock));
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
        lock.lock();
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
        lock.unlock();
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
        final x10.compiler.ws.AsyncFrame this$77383 = ((x10.compiler.ws.AsyncFrame)(this));
        
        //#line 29 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
        final x10.compiler.ws.Frame t$77568 = ((x10.compiler.ws.Frame)(this$77383.up));
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
        x10.compiler.ws.FinishFrame ff = ((x10.compiler.ws.FinishFrame) t$77568);
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
        final x10.compiler.ws.FinishFrame t$77569 = ((x10.compiler.ws.FinishFrame)(ff));
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
        worker.unroll(((x10.compiler.ws.Frame)(t$77569)));
    }
    
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
    final public void caught(final java.lang.RuntimeException t) {
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
        final x10.compiler.ws.AsyncFrame this$77553 = ((x10.compiler.ws.AsyncFrame)(this));
        
        //#line 29 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
        final x10.compiler.ws.Frame t$77570 = ((x10.compiler.ws.Frame)(this$77553.up));
        
        //#line 29 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
        final x10.compiler.ws.FinishFrame t$77571 = ((x10.compiler.ws.FinishFrame) t$77570);
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
        t$77571.caught(((java.lang.RuntimeException)(t)));
    }
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
    final public x10.compiler.ws.AsyncFrame x10$compiler$ws$AsyncFrame$$this$x10$compiler$ws$AsyncFrame() {
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
        return x10.compiler.ws.AsyncFrame.this;
    }
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AsyncFrame.x10"
    final public void __fieldInitializers_x10_compiler_ws_AsyncFrame() {
        
    }
}

