package x10.glb;

@x10.runtime.impl.java.X10Generated
abstract public class GLBResult<$R> extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<GLBResult> $RTT = 
        x10.rtt.NamedType.<GLBResult> make("x10.glb.GLBResult",
                                           GLBResult.class,
                                           1);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $R; return null; }
    
    public static <$R> x10.serialization.X10JavaSerializable $_deserialize_body(x10.glb.GLBResult<$R> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$R = (x10.rtt.Type) $deserializer.readObject();
        $_obj.result = $deserializer.readObject();
        $_obj.op = $deserializer.readInt();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return null;
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$R);
        $serializer.write(this.result);
        $serializer.write(this.op);
        
    }
    
    // constructor just for allocation
    public GLBResult(final java.lang.System[] $dummy, final x10.rtt.Type $R) {
        x10.glb.GLBResult.$initParams(this, $R);
        
    }
    
    private x10.rtt.Type $R;
    
    // initializer of type parameters
    public static void $initParams(final GLBResult $this, final x10.rtt.Type $R) {
        $this.$R = $R;
        
    }
    

    
    //#line 8 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
    /**
	 * Backing storage of result.
	 */
    public x10.core.Rail<$R> result;
    
    //#line 13 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
    /**
	 * Reduction operator. Numbered the same as the operator defined in {@link x10.util.Team}
	 */
    public int op;
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
    abstract public int getReduceOperator$O();
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
    abstract public x10.core.Rail getResult();
    
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
    abstract public void display__0$1x10$glb$GLBResult$$R$2(final x10.core.Rail id$54);
    
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
    public x10.core.Rail submitResult() {
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
        final x10.core.Rail t$88586 = ((x10.core.Rail)(this.result));
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
        final boolean t$88588 = ((t$88586) == (null));
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
        if (t$88588) {
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
            final x10.core.Rail t$88587 = ((x10.core.Rail<$R>)
                                            this.getResult());
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
            ((x10.glb.GLBResult<$R>)this).result = ((x10.core.Rail)(t$88587));
        }
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
        final x10.core.Rail t$88589 = ((x10.core.Rail)(this.result));
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
        return t$88589;
    }
    
    
    //#line 3 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
    final public x10.glb.GLBResult x10$glb$GLBResult$$this$x10$glb$GLBResult() {
        
        //#line 3 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
        return x10.glb.GLBResult.this;
    }
    
    
    //#line 3 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
    
    // constructor for non-virtual call
    final public x10.glb.GLBResult<$R> x10$glb$GLBResult$$init$S() {
         {
            
            //#line 3 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
            
            
            //#line 3 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
            final x10.glb.GLBResult this$88583 = this;
            
            //#line 3 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
            ((x10.glb.GLBResult<$R>)this$88583).result = null;
            
            //#line 3 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
            ((x10.glb.GLBResult<$R>)this$88583).op = -1;
        }
        return this;
    }
    
    
    
    //#line 3 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
    final public void __fieldInitializers_x10_glb_GLBResult() {
        
        //#line 3 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
        ((x10.glb.GLBResult<$R>)this).result = null;
        
        //#line 3 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLBResult.x10"
        ((x10.glb.GLBResult<$R>)this).op = -1;
    }
}

