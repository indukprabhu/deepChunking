package x10.compiler.ws;


@x10.runtime.impl.java.X10Generated
final public class ThrowFrame extends x10.compiler.ws.Frame implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<ThrowFrame> $RTT = 
        x10.rtt.NamedType.<ThrowFrame> make("x10.compiler.ws.ThrowFrame",
                                            ThrowFrame.class,
                                            new x10.rtt.Type[] {
                                                x10.compiler.ws.Frame.$RTT
                                            });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.compiler.ws.ThrowFrame $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.compiler.ws.Frame.$_deserialize_body($_obj, $deserializer);
        $_obj.throwable = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.compiler.ws.ThrowFrame $_obj = new x10.compiler.ws.ThrowFrame((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.throwable);
        
    }
    
    // constructor just for allocation
    public ThrowFrame(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/ThrowFrame.x10"
    public java.lang.RuntimeException throwable;
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/ThrowFrame.x10"
    // creation method for java code (1-phase java constructor)
    public ThrowFrame(final x10.compiler.ws.Frame up, final java.lang.RuntimeException throwable) {
        this((java.lang.System[]) null);
        x10$compiler$ws$ThrowFrame$$init$S(up, throwable);
    }
    
    // constructor for non-virtual call
    final public x10.compiler.ws.ThrowFrame x10$compiler$ws$ThrowFrame$$init$S(final x10.compiler.ws.Frame up, final java.lang.RuntimeException throwable) {
         {
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/ThrowFrame.x10"
            final x10.compiler.ws.Frame this$79524 = this;
            
            //#line 29 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
            final x10.compiler.ws.Frame up$79523 = ((x10.compiler.ws.Frame)(up));
            
            //#line 30 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
            this$79524.up = ((x10.compiler.ws.Frame)(up$79523));
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/ThrowFrame.x10"
            
            
            //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/ThrowFrame.x10"
            final x10.compiler.ws.ThrowFrame this$79532 = this;
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/ThrowFrame.x10"
            this.throwable = ((java.lang.RuntimeException)(throwable));
        }
        return this;
    }
    
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/ThrowFrame.x10"
    public void wrapResume(final x10.compiler.ws.Worker worker) {
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/ThrowFrame.x10"
        final java.lang.RuntimeException t$79531 = ((java.lang.RuntimeException)(throwable));
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/ThrowFrame.x10"
        worker.throwable = ((java.lang.RuntimeException)(t$79531));
    }
    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/ThrowFrame.x10"
    final public x10.compiler.ws.ThrowFrame x10$compiler$ws$ThrowFrame$$this$x10$compiler$ws$ThrowFrame() {
        
        //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/ThrowFrame.x10"
        return x10.compiler.ws.ThrowFrame.this;
    }
    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/ThrowFrame.x10"
    final public void __fieldInitializers_x10_compiler_ws_ThrowFrame() {
        
    }
}

