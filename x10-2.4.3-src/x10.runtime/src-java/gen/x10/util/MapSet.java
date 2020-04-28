package x10.util;

@x10.runtime.impl.java.X10Generated
abstract public class MapSet<$T> extends x10.util.AbstractCollection<$T> implements x10.util.Set, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<MapSet> $RTT = 
        x10.rtt.NamedType.<MapSet> make("x10.util.MapSet",
                                        MapSet.class,
                                        1,
                                        new x10.rtt.Type[] {
                                            x10.rtt.ParameterizedType.make(x10.util.Set.$RTT, x10.rtt.UnresolvedType.PARAM(0)),
                                            x10.rtt.ParameterizedType.make(x10.util.AbstractCollection.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                        });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.MapSet<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.AbstractCollection.$_deserialize_body($_obj, $deserializer);
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.map = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return null;
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.$T);
        $serializer.write(this.map);
        
    }
    
    // constructor just for allocation
    public MapSet(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        super($dummy, $T);
        x10.util.MapSet.$initParams(this, $T);
        
    }
    
    // dispatcher for method abstract public x10.util.Container[T].contains(y:T){}:x10.lang.Boolean
    public java.lang.Object contains(final java.lang.Object a1, final x10.rtt.Type t1) {
        return x10.core.Boolean.$box(contains__0x10$util$MapSet$$T$O(($T)a1));
        
    }
    
    // dispatcher for method abstract public x10.util.Container[T].contains(y:T){}:x10.lang.Boolean
    public boolean contains$Z(final java.lang.Object a1, final x10.rtt.Type t1) {
        return contains__0x10$util$MapSet$$T$O(($T)a1);
        
    }
    
    // dispatcher for method abstract public x10.util.Collection[T].add(v:T){}:x10.lang.Boolean
    public java.lang.Object add(final java.lang.Object a1, final x10.rtt.Type t1) {
        return x10.core.Boolean.$box(add__0x10$util$MapSet$$T$O(($T)a1));
        
    }
    
    // dispatcher for method abstract public x10.util.Collection[T].add(v:T){}:x10.lang.Boolean
    public boolean add$Z(final java.lang.Object a1, final x10.rtt.Type t1) {
        return add__0x10$util$MapSet$$T$O(($T)a1);
        
    }
    
    // dispatcher for method abstract public x10.util.Collection[T].remove(v:T){}:x10.lang.Boolean
    public java.lang.Object remove(final java.lang.Object a1, final x10.rtt.Type t1) {
        return x10.core.Boolean.$box(remove__0x10$util$MapSet$$T$O(($T)a1));
        
    }
    
    // dispatcher for method abstract public x10.util.Collection[T].remove(v:T){}:x10.lang.Boolean
    public boolean remove$Z(final java.lang.Object a1, final x10.rtt.Type t1) {
        return remove__0x10$util$MapSet$$T$O(($T)a1);
        
    }
    
    // dispatcher for method abstract public x10.util.Collection[T].addAll(c:x10.util.Container[T]){}:x10.lang.Boolean
    public java.lang.Object addAll(final x10.util.Container a1, final x10.rtt.Type t1) {
        return x10.core.Boolean.$box(addAll__0$1x10$util$AbstractCollection$$T$2$O((x10.util.Container)a1));
        
    }
    
    // dispatcher for method abstract public x10.util.Collection[T].addAll(c:x10.util.Container[T]){}:x10.lang.Boolean
    public boolean addAll$Z(final x10.util.Container a1, final x10.rtt.Type t1) {
        return addAll__0$1x10$util$AbstractCollection$$T$2$O((x10.util.Container)a1);
        
    }
    
    // dispatcher for method abstract public x10.util.Collection[T].retainAll(c:x10.util.Container[T]){}:x10.lang.Boolean
    public java.lang.Object retainAll(final x10.util.Container a1, final x10.rtt.Type t1) {
        return x10.core.Boolean.$box(retainAll__0$1x10$util$AbstractCollection$$T$2$O((x10.util.Container)a1));
        
    }
    
    // dispatcher for method abstract public x10.util.Collection[T].retainAll(c:x10.util.Container[T]){}:x10.lang.Boolean
    public boolean retainAll$Z(final x10.util.Container a1, final x10.rtt.Type t1) {
        return retainAll__0$1x10$util$AbstractCollection$$T$2$O((x10.util.Container)a1);
        
    }
    
    // dispatcher for method abstract public x10.util.Collection[T].removeAll(c:x10.util.Container[T]){}:x10.lang.Boolean
    public java.lang.Object removeAll(final x10.util.Container a1, final x10.rtt.Type t1) {
        return x10.core.Boolean.$box(removeAll__0$1x10$util$AbstractCollection$$T$2$O((x10.util.Container)a1));
        
    }
    
    // dispatcher for method abstract public x10.util.Collection[T].removeAll(c:x10.util.Container[T]){}:x10.lang.Boolean
    public boolean removeAll$Z(final x10.util.Container a1, final x10.rtt.Type t1) {
        return removeAll__0$1x10$util$AbstractCollection$$T$2$O((x10.util.Container)a1);
        
    }
    
    // dispatcher for method abstract public x10.util.Collection[T].addAllWhere(c:x10.util.Container[T], p:(T)=>x10.lang.Boolean){}:x10.lang.Boolean
    public java.lang.Object addAllWhere(final x10.util.Container a1, final x10.rtt.Type t1, final x10.core.fun.Fun_0_1 a2, final x10.rtt.Type t2) {
        return x10.core.Boolean.$box(addAllWhere__0$1x10$util$AbstractCollection$$T$2__1$1x10$util$AbstractCollection$$T$3x10$lang$Boolean$2$O((x10.util.Container)a1, (x10.core.fun.Fun_0_1)a2));
        
    }
    
    // dispatcher for method abstract public x10.util.Collection[T].addAllWhere(c:x10.util.Container[T], p:(T)=>x10.lang.Boolean){}:x10.lang.Boolean
    public boolean addAllWhere$Z(final x10.util.Container a1, final x10.rtt.Type t1, final x10.core.fun.Fun_0_1 a2, final x10.rtt.Type t2) {
        return addAllWhere__0$1x10$util$AbstractCollection$$T$2__1$1x10$util$AbstractCollection$$T$3x10$lang$Boolean$2$O((x10.util.Container)a1, (x10.core.fun.Fun_0_1)a2);
        
    }
    
    // dispatcher for method abstract public x10.util.Collection[T].removeAllWhere(p:(T)=>x10.lang.Boolean){}:x10.lang.Boolean
    public java.lang.Object removeAllWhere(final x10.core.fun.Fun_0_1 a1, final x10.rtt.Type t1) {
        return x10.core.Boolean.$box(removeAllWhere__0$1x10$util$AbstractCollection$$T$3x10$lang$Boolean$2$O((x10.core.fun.Fun_0_1)a1));
        
    }
    
    // dispatcher for method abstract public x10.util.Collection[T].removeAllWhere(p:(T)=>x10.lang.Boolean){}:x10.lang.Boolean
    public boolean removeAllWhere$Z(final x10.core.fun.Fun_0_1 a1, final x10.rtt.Type t1) {
        return removeAllWhere__0$1x10$util$AbstractCollection$$T$3x10$lang$Boolean$2$O((x10.core.fun.Fun_0_1)a1);
        
    }
    
    // dispatcher for method abstract public x10.util.Container[T].containsAll(c:x10.util.Container[T]){}:x10.lang.Boolean
    public java.lang.Object containsAll(final x10.util.Container a1, final x10.rtt.Type t1) {
        return x10.core.Boolean.$box(containsAll__0$1x10$util$AbstractContainer$$T$2$O((x10.util.Container)a1));
        
    }
    
    // dispatcher for method abstract public x10.util.Container[T].containsAll(c:x10.util.Container[T]){}:x10.lang.Boolean
    public boolean containsAll$Z(final x10.util.Container a1, final x10.rtt.Type t1) {
        return containsAll__0$1x10$util$AbstractContainer$$T$2$O((x10.util.Container)a1);
        
    }
    
    // bridge for method abstract public x10.util.AbstractContainer[T].contains(y:T){}:x10.lang.Boolean
    public boolean contains__0x10$util$AbstractContainer$$T$O($T a1) {
        return contains__0x10$util$MapSet$$T$O(a1);
    }
    
    // bridge for method abstract public x10.util.AbstractCollection[T].add(v:T){}:x10.lang.Boolean
    public boolean add__0x10$util$AbstractCollection$$T$O($T a1) {
        return add__0x10$util$MapSet$$T$O(a1);
    }
    
    // bridge for method abstract public x10.util.AbstractCollection[T].remove(v:T){}:x10.lang.Boolean
    public boolean remove__0x10$util$AbstractCollection$$T$O($T a1) {
        return remove__0x10$util$MapSet$$T$O(a1);
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final MapSet $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    // synthetic type for parameter mangling
    public static final class __0$1x10$util$MapSet$$T$3x10$lang$Boolean$2 {}
    

    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
    public x10.util.Map<$T, x10.core.Boolean> map;
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
    
    // constructor for non-virtual call
    final public x10.util.MapSet<$T> x10$util$MapSet$$init$S(final x10.util.Map<$T, x10.core.Boolean> map, __0$1x10$util$MapSet$$T$3x10$lang$Boolean$2 $dummy) {
         {
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
            /*super.*/x10$util$AbstractCollection$$init$S();
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
            
            
            //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
            final x10.util.MapSet this$136838 = this;
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
            ((x10.util.MapSet<$T>)this).map = ((x10.util.Map)(map));
        }
        return this;
    }
    
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
    public long size$O() {
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
        final x10.util.Map t$136823 = ((x10.util.Map)(map));
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
        final x10.util.Set t$136824 = ((x10.util.Set<$T>)
                                        ((x10.util.Map<$T, x10.core.Boolean>)t$136823).keySet());
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
        final long t$136825 = ((x10.util.Container<$T>)t$136824).size$O();
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
        return t$136825;
    }
    
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
    public boolean contains__0x10$util$MapSet$$T$O(final $T v) {
        
        //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
        final x10.util.Map t$136826 = ((x10.util.Map)(map));
        
        //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
        final boolean t$136827 = x10.core.Boolean.$unbox(((x10.util.Map<$T, x10.core.Boolean>)t$136826).containsKey$Z((($T)(v)), $T));
        
        //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
        return t$136827;
    }
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
    public boolean add__0x10$util$MapSet$$T$O(final $T v) {
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
        final x10.util.Map t$136828 = ((x10.util.Map)(map));
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
        final x10.util.Box t$136829 = ((x10.util.Box<x10.core.Boolean>)
                                        ((x10.util.Map<$T, x10.core.Boolean>)t$136828).put((($T)(v)), $T, x10.core.Boolean.$box(true), x10.rtt.Types.BOOLEAN));
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
        final boolean t$136830 = ((t$136829) == (null));
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
        return t$136830;
    }
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
    public boolean remove__0x10$util$MapSet$$T$O(final $T v) {
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
        final x10.util.Map t$136831 = ((x10.util.Map)(map));
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
        final x10.util.Box t$136832 = ((x10.util.Box<x10.core.Boolean>)
                                        ((x10.util.Map<$T, x10.core.Boolean>)t$136831).remove((($T)(v)), $T));
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
        final boolean t$136833 = ((t$136832) != (null));
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
        return t$136833;
    }
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
    public void clear() {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
        final x10.util.Map t$136834 = ((x10.util.Map)(map));
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
        ((x10.util.Map<$T, x10.core.Boolean>)t$136834).clear();
    }
    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
    public x10.lang.Iterator iterator() {
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
        final x10.util.Map t$136835 = ((x10.util.Map)(map));
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
        final x10.util.Set t$136836 = ((x10.util.Set<$T>)
                                        ((x10.util.Map<$T, x10.core.Boolean>)t$136835).keySet());
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
        final x10.lang.Iterator t$136837 = ((x10.lang.Iterator<$T>)
                                             ((x10.lang.Iterable<$T>)t$136836).iterator());
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
        return t$136837;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
    final public x10.util.MapSet x10$util$MapSet$$this$x10$util$MapSet() {
        
        //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
        return x10.util.MapSet.this;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapSet.x10"
    final public void __fieldInitializers_x10_util_MapSet() {
        
    }
}

