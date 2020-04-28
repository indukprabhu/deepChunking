package x10.glb;


@x10.runtime.impl.java.X10Generated
final public class FixedSizeStack<$T> extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<FixedSizeStack> $RTT = 
        x10.rtt.NamedType.<FixedSizeStack> make("x10.glb.FixedSizeStack",
                                                FixedSizeStack.class,
                                                1);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.FixedSizeStack<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.data = $deserializer.readObject();
        $_obj.size = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.glb.FixedSizeStack $_obj = new x10.glb.FixedSizeStack((java.lang.System[]) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$T);
        $serializer.write(this.data);
        $serializer.write(this.size);
        
    }
    
    // constructor just for allocation
    public FixedSizeStack(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        x10.glb.FixedSizeStack.$initParams(this, $T);
        
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final FixedSizeStack $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    

    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
    /**
	 * Backing Rail.
	 */
    public x10.core.Rail<$T> data;
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
    /**
     * Number of elements in the stack.
     */
    public long size;
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
    // creation method for java code (1-phase java constructor)
    public FixedSizeStack(final x10.rtt.Type $T, final long n) {
        this((java.lang.System[]) null, $T);
        x10$glb$FixedSizeStack$$init$S(n);
    }
    
    // constructor for non-virtual call
    final public x10.glb.FixedSizeStack<$T> x10$glb$FixedSizeStack$$init$S(final long n) {
         {
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
            
            
            //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
            final x10.glb.FixedSizeStack this$81949 = this;
            
            //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
            ((x10.glb.FixedSizeStack<$T>)this$81949).size = 0L;
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
            final x10.core.Rail t$81937 = ((x10.core.Rail)(new x10.core.Rail<$T>($T, ((long)(n)))));
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
            ((x10.glb.FixedSizeStack<$T>)this).data = ((x10.core.Rail)(t$81937));
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
            ((x10.glb.FixedSizeStack<$T>)this).size = 0L;
        }
        return this;
    }
    
    
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
    public $T pop$G() {
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
        final x10.core.Rail t$81940 = ((x10.core.Rail)(data));
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
        final long t$81938 = this.size;
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
        final long t$81939 = ((t$81938) - (((long)(1L))));
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
        final long t$81941 = ((x10.glb.FixedSizeStack<$T>)this).size = t$81939;
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
        final $T t$81942 = (($T)(((x10.core.Rail<$T>)t$81940).$apply$G((long)(t$81941))));
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
        return t$81942;
    }
    
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
    public void push__0x10$glb$FixedSizeStack$$T(final $T t) {
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
        final x10.core.Rail t$81946 = ((x10.core.Rail)(data));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
        final long t$81943 = this.size;
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
        final long t$81944 = ((t$81943) + (((long)(1L))));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
        final long t$81945 = ((x10.glb.FixedSizeStack<$T>)this).size = t$81944;
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
        final long t$81947 = ((t$81945) - (((long)(1L))));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
        ((x10.core.Rail<$T>)t$81946).$set__1x10$lang$Rail$$T$G((long)(t$81947), (($T)(t)));
    }
    
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
    public long size$O() {
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
        final long t$81948 = size;
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
        return t$81948;
    }
    
    
    //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
    final public x10.glb.FixedSizeStack x10$glb$FixedSizeStack$$this$x10$glb$FixedSizeStack() {
        
        //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
        return x10.glb.FixedSizeStack.this;
    }
    
    
    //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
    final public void __fieldInitializers_x10_glb_FixedSizeStack() {
        
        //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
        ((x10.glb.FixedSizeStack<$T>)this).size = 0L;
    }
}

