package x10.compiler.ws;


@x10.runtime.impl.java.X10Generated
abstract public class Frame extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Frame> $RTT = 
        x10.rtt.NamedType.<Frame> make("x10.compiler.ws.Frame",
                                       Frame.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(x10.compiler.ws.Frame $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.up = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return null;
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.up);
        
    }
    
    // constructor just for allocation
    public Frame(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
    public static <$T, $U>$U cast__0x10$compiler$ws$Frame$$T$G(final x10.rtt.Type $T, final x10.rtt.Type $U, final $T x) {
        try {
            return (($U) x);
        }
        catch (java.lang.Throwable exc$146308) {
            throw x10.runtime.impl.java.ThrowableUtils.ensureX10Exception(exc$146308);
        }
        
    }
    
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
    public x10.compiler.ws.Frame up;
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
    
    // constructor for non-virtual call
    final public x10.compiler.ws.Frame x10$compiler$ws$Frame$$init$S(final x10.compiler.ws.Frame up) {
         {
            
            //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
            
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
            final x10.compiler.ws.Frame this$79454 = this;
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
            this.up = ((x10.compiler.ws.Frame)(up));
        }
        return this;
    }
    
    
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
    public void back(final x10.compiler.ws.Worker worker, final x10.compiler.ws.Frame frame) {
        
    }
    
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
    public void wrapBack(final x10.compiler.ws.Worker worker, final x10.compiler.ws.Frame frame) {
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
        final java.lang.RuntimeException t$79450 = ((java.lang.RuntimeException)(worker.throwable));
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
        final boolean t$79451 = ((null) != (t$79450));
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
        if (t$79451) {
            
            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
            return;
        }
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
        this.back(((x10.compiler.ws.Worker)(worker)), ((x10.compiler.ws.Frame)(frame)));
    }
    
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
    public void resume(final x10.compiler.ws.Worker worker) {
        
    }
    
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
    public void wrapResume(final x10.compiler.ws.Worker worker) {
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
        final java.lang.RuntimeException t$79452 = ((java.lang.RuntimeException)(worker.throwable));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
        final boolean t$79453 = ((null) != (t$79452));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
        if (t$79453) {
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
            return;
        }
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
        try {{
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
            this.resume(((x10.compiler.ws.Worker)(worker)));
        }}catch (final x10.compiler.Abort t) {
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
            throw t;
        }catch (final java.lang.RuntimeException t) {
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
            worker.throwable = ((java.lang.RuntimeException)(t));
        }
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
    final public x10.compiler.ws.Frame x10$compiler$ws$Frame$$this$x10$compiler$ws$Frame() {
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
        return x10.compiler.ws.Frame.this;
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
    final public void __fieldInitializers_x10_compiler_ws_Frame() {
        
    }
}

