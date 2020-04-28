package x10.lang;


@x10.runtime.impl.java.X10Generated
final public class FinishAccumulator<$T> extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<FinishAccumulator> $RTT = 
        x10.rtt.NamedType.<FinishAccumulator> make("x10.lang.FinishAccumulator",
                                                   FinishAccumulator.class,
                                                   1);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.FinishAccumulator<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.FinishAccumulator $_obj = new x10.lang.FinishAccumulator((java.lang.System[]) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$T);
        
    }
    
    // constructor just for allocation
    public FinishAccumulator(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        x10.lang.FinishAccumulator.$initParams(this, $T);
        
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final FinishAccumulator $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    

    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishAccumulator.x10"
    final public x10.lang.FinishAccumulator x10$lang$FinishAccumulator$$this$x10$lang$FinishAccumulator() {
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishAccumulator.x10"
        return x10.lang.FinishAccumulator.this;
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishAccumulator.x10"
    // creation method for java code (1-phase java constructor)
    public FinishAccumulator(final x10.rtt.Type $T) {
        this((java.lang.System[]) null, $T);
        x10$lang$FinishAccumulator$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.lang.FinishAccumulator<$T> x10$lang$FinishAccumulator$$init$S() {
         {
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishAccumulator.x10"
            
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishAccumulator.x10"
            final x10.lang.FinishAccumulator this$97720 = this;
        }
        return this;
    }
    
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishAccumulator.x10"
    final public void __fieldInitializers_x10_lang_FinishAccumulator() {
        
    }
}

