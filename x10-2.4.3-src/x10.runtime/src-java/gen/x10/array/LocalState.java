package x10.array;

@x10.runtime.impl.java.X10Generated
public class LocalState<$S> extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<LocalState> $RTT = 
        x10.rtt.NamedType.<LocalState> make("x10.array.LocalState",
                                            LocalState.class,
                                            1);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $S; return null; }
    
    public static <$S> x10.serialization.X10JavaSerializable $_deserialize_body(x10.array.LocalState<$S> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$S = (x10.rtt.Type) $deserializer.readObject();
        $_obj.pg = $deserializer.readObject();
        $_obj.rail = $deserializer.readObject();
        $_obj.size = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.array.LocalState $_obj = new x10.array.LocalState((java.lang.System[]) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$S);
        $serializer.write(this.pg);
        $serializer.write(this.rail);
        $serializer.write(this.size);
        
    }
    
    // constructor just for allocation
    public LocalState(final java.lang.System[] $dummy, final x10.rtt.Type $S) {
        x10.array.LocalState.$initParams(this, $S);
        
    }
    
    private x10.rtt.Type $S;
    
    // initializer of type parameters
    public static void $initParams(final LocalState $this, final x10.rtt.Type $S) {
        $this.$S = $S;
        
    }
    // synthetic type for parameter mangling
    public static final class __1$1x10$array$LocalState$$S$2 {}
    
    // properties
    
    //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    public x10.lang.PlaceGroup pg;
    
    //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    public x10.core.Rail<$S> rail;
    
    //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    public long size;
    

    
    
    //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    // creation method for java code (1-phase java constructor)
    public LocalState(final x10.rtt.Type $S, final x10.lang.PlaceGroup pg, final x10.core.Rail<$S> rail, final long size, __1$1x10$array$LocalState$$S$2 $dummy) {
        this((java.lang.System[]) null, $S);
        x10$array$LocalState$$init$S(pg, rail, size, (x10.array.LocalState.__1$1x10$array$LocalState$$S$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.array.LocalState<$S> x10$array$LocalState$$init$S(final x10.lang.PlaceGroup pg, final x10.core.Rail<$S> rail, final long size, __1$1x10$array$LocalState$$S$2 $dummy) {
         {
            
            //#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            this.pg = ((x10.lang.PlaceGroup)(pg));
            this.rail = ((x10.core.Rail)(rail));
            this.size = size;
            
            
            //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            final x10.array.LocalState this$76214 = this;
        }
        return this;
    }
    
    
    
    //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    final public x10.array.LocalState x10$array$LocalState$$this$x10$array$LocalState() {
        
        //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        return x10.array.LocalState.this;
    }
    
    
    //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    final public void __fieldInitializers_x10_array_LocalState() {
        
    }
}

