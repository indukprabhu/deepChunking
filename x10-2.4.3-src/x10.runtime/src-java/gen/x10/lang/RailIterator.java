package x10.lang;

@x10.runtime.impl.java.X10Generated
final public class RailIterator<$T> extends x10.core.Ref implements x10.lang.Iterator, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<RailIterator> $RTT = 
        x10.rtt.NamedType.<RailIterator> make("x10.lang.RailIterator",
                                              RailIterator.class,
                                              1,
                                              new x10.rtt.Type[] {
                                                  x10.rtt.ParameterizedType.make(x10.lang.Iterator.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                              });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.lang.RailIterator<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.rail = $deserializer.readObject();
        $_obj.cur = $deserializer.readLong();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.lang.RailIterator $_obj = new x10.lang.RailIterator((java.lang.System[]) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$T);
        $serializer.write(this.rail);
        $serializer.write(this.cur);
        
    }
    
    // constructor just for allocation
    public RailIterator(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        x10.lang.RailIterator.$initParams(this, $T);
        
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final RailIterator $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    // synthetic type for parameter mangling
    public static final class __0$1x10$lang$RailIterator$$T$2 {}
    

    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/RailIterator.x10"
    public x10.core.Rail<$T> rail;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/RailIterator.x10"
    public long cur;
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/RailIterator.x10"
    // creation method for java code (1-phase java constructor)
    public RailIterator(final x10.rtt.Type $T, final x10.core.Rail<$T> x, __0$1x10$lang$RailIterator$$T$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$lang$RailIterator$$init$S(x, (x10.lang.RailIterator.__0$1x10$lang$RailIterator$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.lang.RailIterator<$T> x10$lang$RailIterator$$init$S(final x10.core.Rail<$T> x, __0$1x10$lang$RailIterator$$T$2 $dummy) {
         {
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/RailIterator.x10"
            
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/RailIterator.x10"
            final x10.lang.RailIterator this$111648 = this;
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/RailIterator.x10"
            ((x10.lang.RailIterator<$T>)this$111648).cur = 0L;
            
            //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/RailIterator.x10"
            ((x10.lang.RailIterator<$T>)this).rail = ((x10.core.Rail)(x));
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/RailIterator.x10"
            ((x10.lang.RailIterator<$T>)this).cur = 0L;
        }
        return this;
    }
    
    
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/RailIterator.x10"
    public $T next$G() {
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/RailIterator.x10"
        final x10.core.Rail t$111641 = ((x10.core.Rail)(rail));
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/RailIterator.x10"
        final long t$111638 = this.cur;
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/RailIterator.x10"
        final long t$111639 = ((t$111638) + (((long)(1L))));
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/RailIterator.x10"
        final long t$111640 = ((x10.lang.RailIterator<$T>)this).cur = t$111639;
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/RailIterator.x10"
        final long t$111642 = ((t$111640) - (((long)(1L))));
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/RailIterator.x10"
        final $T t$111643 = (($T)(((x10.core.Rail<$T>)t$111641).$apply$G((long)(t$111642))));
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/RailIterator.x10"
        return t$111643;
    }
    
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/RailIterator.x10"
    public boolean hasNext$O() {
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/RailIterator.x10"
        final long t$111645 = cur;
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/RailIterator.x10"
        final x10.core.Rail t$111644 = ((x10.core.Rail)(rail));
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/RailIterator.x10"
        final long t$111646 = ((x10.core.Rail<$T>)t$111644).size;
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/RailIterator.x10"
        final boolean t$111647 = ((t$111645) < (((long)(t$111646))));
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/RailIterator.x10"
        return t$111647;
    }
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/RailIterator.x10"
    final public x10.lang.RailIterator x10$lang$RailIterator$$this$x10$lang$RailIterator() {
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/RailIterator.x10"
        return x10.lang.RailIterator.this;
    }
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/RailIterator.x10"
    final public void __fieldInitializers_x10_lang_RailIterator() {
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/RailIterator.x10"
        ((x10.lang.RailIterator<$T>)this).cur = 0L;
    }
}

