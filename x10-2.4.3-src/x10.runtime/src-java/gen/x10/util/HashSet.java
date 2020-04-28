package x10.util;

@x10.runtime.impl.java.X10Generated
public class HashSet<$T> extends x10.util.MapSet<$T> implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<HashSet> $RTT = 
        x10.rtt.NamedType.<HashSet> make("x10.util.HashSet",
                                         HashSet.class,
                                         1,
                                         new x10.rtt.Type[] {
                                             x10.rtt.ParameterizedType.make(x10.util.MapSet.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                         });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.HashSet<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.MapSet.$_deserialize_body($_obj, $deserializer);
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.HashSet $_obj = new x10.util.HashSet((java.lang.System[]) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.$T);
        
    }
    
    // constructor just for allocation
    public HashSet(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        super($dummy, $T);
        x10.util.HashSet.$initParams(this, $T);
        
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final HashSet $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    // synthetic type for parameter mangling
    public static final class __0$1x10$util$HashSet$$T$3x10$lang$Boolean$2 {}
    

    
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
    // creation method for java code (1-phase java constructor)
    public HashSet(final x10.rtt.Type $T) {
        this((java.lang.System[]) null, $T);
        x10$util$HashSet$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.util.HashSet<$T> x10$util$HashSet$$init$S() {
         {
            
            //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
            final x10.util.HashMap alloc$136795 = ((x10.util.HashMap)(new x10.util.HashMap<$T, x10.core.Boolean>((java.lang.System[]) null, $T, x10.rtt.Types.BOOLEAN)));
            
            //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
            alloc$136795.x10$util$HashMap$$init$S();
            
            //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
            /*super.*/x10$util$MapSet$$init$S(((x10.util.Map<$T, x10.core.Boolean>)(alloc$136795)), (x10.util.MapSet.__0$1x10$util$MapSet$$T$3x10$lang$Boolean$2) null);
            
            //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
            
            
            //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
            final x10.util.HashSet this$136796 = this;
        }
        return this;
    }
    
    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
    // creation method for java code (1-phase java constructor)
    public HashSet(final x10.rtt.Type $T, final int sz) {
        this((java.lang.System[]) null, $T);
        x10$util$HashSet$$init$S(sz);
    }
    
    // constructor for non-virtual call
    final public x10.util.HashSet<$T> x10$util$HashSet$$init$S(final int sz) {
         {
            
            //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
            final x10.util.HashMap alloc$136798 = ((x10.util.HashMap)(new x10.util.HashMap<$T, x10.core.Boolean>((java.lang.System[]) null, $T, x10.rtt.Types.BOOLEAN)));
            
            //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
            final long t$136797 = ((long)(((int)(sz))));
            
            //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
            alloc$136798.x10$util$HashMap$$init$S(t$136797);
            
            //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
            /*super.*/x10$util$MapSet$$init$S(((x10.util.Map<$T, x10.core.Boolean>)(alloc$136798)), (x10.util.MapSet.__0$1x10$util$MapSet$$T$3x10$lang$Boolean$2) null);
            
            //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
            
            
            //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
            final x10.util.HashSet this$136799 = this;
        }
        return this;
    }
    
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
    // creation method for java code (1-phase java constructor)
    public HashSet(final x10.rtt.Type $T, final x10.util.HashMap<$T, x10.core.Boolean> map, __0$1x10$util$HashSet$$T$3x10$lang$Boolean$2 $dummy) {
        this((java.lang.System[]) null, $T);
        x10$util$HashSet$$init$S(map, (x10.util.HashSet.__0$1x10$util$HashSet$$T$3x10$lang$Boolean$2) null);
    }
    
    // constructor for non-virtual call
    final public x10.util.HashSet<$T> x10$util$HashSet$$init$S(final x10.util.HashMap<$T, x10.core.Boolean> map, __0$1x10$util$HashSet$$T$3x10$lang$Boolean$2 $dummy) {
         {
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
            /*super.*/x10$util$MapSet$$init$S(((x10.util.Map<$T, x10.core.Boolean>)(map)), (x10.util.MapSet.__0$1x10$util$MapSet$$T$3x10$lang$Boolean$2) null);
            
            //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
            
            
            //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
            final x10.util.HashSet this$136800 = this;
        }
        return this;
    }
    
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
    public x10.util.HashSet clone() {
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
        final x10.util.HashMap tmp = ((x10.util.HashMap)(new x10.util.HashMap<$T, x10.core.Boolean>((java.lang.System[]) null, $T, x10.rtt.Types.BOOLEAN)));
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
        final x10.util.Map t$136804 = ((x10.util.Map)(map));
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
        final long t$136805 = ((x10.util.Map<$T, x10.core.Boolean>)t$136804).size$O();
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
        tmp.x10$util$HashMap$$init$S(t$136805);
        
        //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
        final x10.util.Map t$136806 = ((x10.util.Map)(map));
        
        //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
        final x10.util.Set t$136807 = ((x10.util.Set<x10.util.Map.Entry<$T, x10.core.Boolean>>)
                                        ((x10.util.Map<$T, x10.core.Boolean>)t$136806).entries());
        
        //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
        final x10.lang.Iterator e$136808 = ((x10.lang.Iterator<x10.util.Map.Entry<$T, x10.core.Boolean>>)
                                             ((x10.lang.Iterable<x10.util.Map.Entry<$T, x10.core.Boolean>>)t$136807).iterator());
        
        //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
        for (;
             true;
             ) {
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
            final boolean t$136809 = ((x10.lang.Iterator<x10.util.Map.Entry<$T, x10.core.Boolean>>)e$136808).hasNext$O();
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
            if (!(t$136809)) {
                
                //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
                break;
            }
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
            final x10.util.Map.Entry e$136801 = ((x10.util.Map.Entry)(((x10.lang.Iterator<x10.util.Map.Entry<$T, x10.core.Boolean>>)e$136808).next$G()));
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
            final $T t$136802 = (($T)(((x10.util.Map.Entry<$T, x10.core.Boolean>)e$136801).getKey$G()));
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
            final boolean t$136803 = x10.core.Boolean.$unbox(((x10.util.Map.Entry<$T, x10.core.Boolean>)e$136801).getValue$G());
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
            ((x10.util.HashMap<$T, x10.core.Boolean>)tmp).put__0x10$util$HashMap$$K__1x10$util$HashMap$$V((($T)(t$136802)), x10.core.Boolean.$box(t$136803));
        }
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
        final x10.util.HashSet alloc$136774 = ((x10.util.HashSet)(new x10.util.HashSet<$T>((java.lang.System[]) null, $T)));
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
        alloc$136774.x10$util$HashSet$$init$S(((x10.util.HashMap<$T, x10.core.Boolean>)(tmp)), (x10.util.HashSet.__0$1x10$util$HashSet$$T$3x10$lang$Boolean$2) null);
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
        return alloc$136774;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
    final public x10.util.HashSet x10$util$HashSet$$this$x10$util$HashSet() {
        
        //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
        return x10.util.HashSet.this;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashSet.x10"
    final public void __fieldInitializers_x10_util_HashSet() {
        
    }
}

