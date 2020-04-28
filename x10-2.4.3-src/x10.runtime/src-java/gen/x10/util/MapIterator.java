package x10.util;

@x10.runtime.impl.java.X10Generated
public class MapIterator<$S, $T> extends x10.core.Ref implements x10.lang.Iterator, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<MapIterator> $RTT = 
        x10.rtt.NamedType.<MapIterator> make("x10.util.MapIterator",
                                             MapIterator.class,
                                             2,
                                             new x10.rtt.Type[] {
                                                 x10.rtt.ParameterizedType.make(x10.lang.Iterator.$RTT, x10.rtt.UnresolvedType.PARAM(1))
                                             });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $S; if (i == 1) return $T; return null; }
    
    public static <$S, $T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.MapIterator<$S, $T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$S = (x10.rtt.Type) $deserializer.readObject();
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.i = $deserializer.readObject();
        $_obj.f = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.MapIterator $_obj = new x10.util.MapIterator((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$S);
        $serializer.write(this.$T);
        $serializer.write(this.i);
        $serializer.write(this.f);
        
    }
    
    // constructor just for allocation
    public MapIterator(final java.lang.System[] $dummy, final x10.rtt.Type $S, final x10.rtt.Type $T) {
        x10.util.MapIterator.$initParams(this, $S, $T);
        
    }
    
    private x10.rtt.Type $S;
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final MapIterator $this, final x10.rtt.Type $S, final x10.rtt.Type $T) {
        $this.$S = $S;
        $this.$T = $T;
        
    }
    // synthetic type for parameter mangling
    public static final class __0$1x10$util$MapIterator$$S$2__1$1x10$util$MapIterator$$S$3x10$util$MapIterator$$T$2 {}
    

    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
    public x10.lang.Iterator<$S> i;
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
    public x10.core.fun.Fun_0_1<$S,$T> f;
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
    // creation method for java code (1-phase java constructor)
    public MapIterator(final x10.rtt.Type $S, final x10.rtt.Type $T, final x10.lang.Iterator<$S> i, final x10.core.fun.Fun_0_1<$S,$T> f, __0$1x10$util$MapIterator$$S$2__1$1x10$util$MapIterator$$S$3x10$util$MapIterator$$T$2 $dummy) {
        this((java.lang.System[]) null, $S, $T);
        x10$util$MapIterator$$init$S(i, f, (x10.util.MapIterator.__0$1x10$util$MapIterator$$S$2__1$1x10$util$MapIterator$$S$3x10$util$MapIterator$$T$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.util.MapIterator<$S, $T> x10$util$MapIterator$$init$S(final x10.lang.Iterator<$S> i, final x10.core.fun.Fun_0_1<$S,$T> f, __0$1x10$util$MapIterator$$S$2__1$1x10$util$MapIterator$$S$3x10$util$MapIterator$$T$2 $dummy) {
         {
            
            //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
            
            
            //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
            final x10.util.MapIterator this$136819 = this;
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
            ((x10.util.MapIterator<$S, $T>)this).i = ((x10.lang.Iterator)(i));
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
            ((x10.util.MapIterator<$S, $T>)this).f = ((x10.core.fun.Fun_0_1)(f));
        }
        return this;
    }
    
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
    public boolean hasNext$O() {
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
        final x10.lang.Iterator t$136813 = ((x10.lang.Iterator)(i));
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
        final boolean t$136814 = ((x10.lang.Iterator<$S>)t$136813).hasNext$O();
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
        return t$136814;
    }
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
    public $T next$G() {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
        final x10.core.fun.Fun_0_1 t$136816 = ((x10.core.fun.Fun_0_1)(f));
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
        final x10.lang.Iterator t$136815 = ((x10.lang.Iterator)(i));
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
        final $S t$136817 = (($S)(((x10.lang.Iterator<$S>)t$136815).next$G()));
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
        final $T t$136818 = (($T)((($T)
                                    ((x10.core.fun.Fun_0_1<$S,$T>)t$136816).$apply(t$136817, $S))));
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
        return t$136818;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
    final public x10.util.MapIterator x10$util$MapIterator$$this$x10$util$MapIterator() {
        
        //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
        return x10.util.MapIterator.this;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
    final public void __fieldInitializers_x10_util_MapIterator() {
        
    }
}

