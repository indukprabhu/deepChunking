package x10.compiler.ws;


@x10.runtime.impl.java.X10Generated
abstract public class RegularFrame extends x10.compiler.ws.Frame implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<RegularFrame> $RTT = 
        x10.rtt.NamedType.<RegularFrame> make("x10.compiler.ws.RegularFrame",
                                              RegularFrame.class,
                                              new x10.rtt.Type[] {
                                                  x10.compiler.ws.Frame.$RTT
                                              });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.compiler.ws.RegularFrame $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.compiler.ws.Frame.$_deserialize_body($_obj, $deserializer);
        $_obj.ff = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return null;
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.ff);
        
    }
    
    // constructor just for allocation
    public RegularFrame(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
    public x10.compiler.ws.FinishFrame ff;
    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
    
    // constructor for non-virtual call
    final public x10.compiler.ws.RegularFrame x10$compiler$ws$RegularFrame$$init$S(final x10.compiler.ws.Frame up, final x10.compiler.ws.FinishFrame ff) {
         {
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
            final x10.compiler.ws.Frame this$79460 = this;
            
            //#line 29 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
            final x10.compiler.ws.Frame up$79459 = ((x10.compiler.ws.Frame)(up));
            
            //#line 30 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
            this$79460.up = ((x10.compiler.ws.Frame)(up$79459));
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
            
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
            final x10.compiler.ws.RegularFrame this$79478 = this;
            
            //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
            this.ff = ((x10.compiler.ws.FinishFrame)(ff));
        }
        return this;
    }
    
    
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
    final public void push(final x10.compiler.ws.Worker worker) {
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
        final x10.core.Deque t$79470 = ((x10.core.Deque)(worker.deque));
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
        t$79470.push(((java.lang.Object)(this)));
    }
    
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
    final public void continueLater(final x10.compiler.ws.Worker worker) {
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
        worker.migrate();
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
        x10.compiler.ws.RegularFrame k = this;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
        final x10.compiler.ws.RegularFrame t$79471 = ((x10.compiler.ws.RegularFrame)(k));
        
        //#line 281 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final java.lang.Object k$79467 = ((java.lang.Object)(((java.lang.Object)
                                                               t$79471)));
        
        //#line 282 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.lang.Runtime.Pool t$79479 = ((x10.lang.Runtime.Pool)(x10.lang.Runtime.get$pool()));
        
        //#line 282 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        final x10.core.Deque t$79480 = ((x10.core.Deque)(t$79479.wsBlockedContinuations));
        
        //#line 282 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        t$79480.push(((java.lang.Object)(k$79467)));
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
        final x10.compiler.Abort t$79474 = ((x10.compiler.Abort)(x10.compiler.Abort.get$ABORT()));
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
        throw t$79474;
    }
    
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
    final public void continueNow(final x10.compiler.ws.Worker worker) {
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
        worker.migrate();
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
        x10.compiler.ws.RegularFrame k = this;
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
        final x10.core.Deque t$79475 = ((x10.core.Deque)(worker.fifo));
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
        final x10.compiler.ws.RegularFrame t$79476 = ((x10.compiler.ws.RegularFrame)(k));
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
        t$79475.push(((java.lang.Object)(t$79476)));
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
        final x10.compiler.Abort t$79477 = ((x10.compiler.Abort)(x10.compiler.Abort.get$ABORT()));
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
        throw t$79477;
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
    final public x10.compiler.ws.RegularFrame x10$compiler$ws$RegularFrame$$this$x10$compiler$ws$RegularFrame() {
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
        return x10.compiler.ws.RegularFrame.this;
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RegularFrame.x10"
    final public void __fieldInitializers_x10_compiler_ws_RegularFrame() {
        
    }
}

