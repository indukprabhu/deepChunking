package x10.compiler.ws;


@x10.runtime.impl.java.X10Generated
abstract public class MainFrame extends x10.compiler.ws.RegularFrame implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<MainFrame> $RTT = 
        x10.rtt.NamedType.<MainFrame> make("x10.compiler.ws.MainFrame",
                                           MainFrame.class,
                                           new x10.rtt.Type[] {
                                               x10.compiler.ws.RegularFrame.$RTT
                                           });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.compiler.ws.MainFrame $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
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
    public MainFrame(final java.lang.System[] $dummy) {
        super($dummy);
        
    }
    
    

    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/MainFrame.x10"
    
    // constructor for non-virtual call
    final public x10.compiler.ws.MainFrame x10$compiler$ws$MainFrame$$init$S(final x10.compiler.ws.Frame up, final x10.compiler.ws.FinishFrame ff) {
         {
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/MainFrame.x10"
            /*super.*/x10$compiler$ws$RegularFrame$$init$S(((x10.compiler.ws.Frame)(up)), ((x10.compiler.ws.FinishFrame)(ff)));
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/MainFrame.x10"
            
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/MainFrame.x10"
            final x10.compiler.ws.MainFrame this$79458 = this;
        }
        return this;
    }
    
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/MainFrame.x10"
    abstract public void fast(final x10.compiler.ws.Worker worker);
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/MainFrame.x10"
    final public x10.compiler.ws.MainFrame x10$compiler$ws$MainFrame$$this$x10$compiler$ws$MainFrame() {
        
        //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/MainFrame.x10"
        return x10.compiler.ws.MainFrame.this;
    }
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/MainFrame.x10"
    final public void __fieldInitializers_x10_compiler_ws_MainFrame() {
        
    }
}

