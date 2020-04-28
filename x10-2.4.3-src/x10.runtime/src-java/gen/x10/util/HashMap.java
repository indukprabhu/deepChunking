package x10.util;


@x10.runtime.impl.java.X10Generated
public class HashMap<$K, $V> extends x10.core.Ref implements x10.util.Map, x10.io.CustomSerialization
{
    public static final x10.rtt.RuntimeType<HashMap> $RTT = 
        x10.rtt.NamedType.<HashMap> make("x10.util.HashMap",
                                         HashMap.class,
                                         2,
                                         new x10.rtt.Type[] {
                                             x10.rtt.ParameterizedType.make(x10.util.Map.$RTT, x10.rtt.UnresolvedType.PARAM(0), x10.rtt.UnresolvedType.PARAM(1)),
                                             x10.io.CustomSerialization.$RTT
                                         });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $K; if (i == 1) return $V; return null; }
    
    // custom serialization support
    public static <$K, $V> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.HashMap<$K, $V> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.io.Deserializer $ds = new x10.io.Deserializer($deserializer);
        $_obj.x10$util$HashMap$$init$S($ds);
        short $marker = $deserializer.readSerializationId();
        if ($marker != x10.serialization.SerializationConstants.CUSTOM_SERIALIZATION_END) { x10.serialization.X10JavaDeserializer.raiseSerializationProtocolError(); }
        return $_obj;
        
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        int $obj_id = $deserializer.record_reference(null); /* Get id eagerly so that ordering in object map is stable (needed for repeated reference mechanism) */
        x10.rtt.Type $K = (x10.rtt.Type) $deserializer.readObject();
        x10.rtt.Type $V = (x10.rtt.Type) $deserializer.readObject();
        HashMap $_obj = new HashMap((java.lang.System[]) null, (x10.rtt.Type) $K, (x10.rtt.Type) $V);
        $deserializer.update_reference($obj_id, $_obj); /* Update entry in object map with the actual object before deserializing body */
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
    
        $serializer.write($K);
        $serializer.write($V);
        serialize(new x10.io.Serializer($serializer)); 
        $serializer.writeSerializationId(x10.serialization.SerializationConstants.CUSTOM_SERIALIZATION_END);
        
    }
    
    // constructor just for allocation
    public HashMap(final java.lang.System[] $dummy, final x10.rtt.Type $K, final x10.rtt.Type $V) {
        x10.util.HashMap.$initParams(this, $K, $V);
        
    }
    
    // dispatcher for method abstract public x10.util.Map[K, V].get(k:K){}:x10.util.Box[V]
    public java.lang.Object get(final java.lang.Object a1, final x10.rtt.Type t1) {
        return get__0x10$util$HashMap$$K(($K)a1);
        
    }
    
    // dispatcher for method abstract public x10.util.Map[K, V].getOrElse(k:K, orelse:V){}:V
    public java.lang.Object getOrElse(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
        return getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(($K)a1, ($V)a2);
        
    }
    
    // dispatcher for method abstract public x10.util.Map[K, V].getOrThrow(k:K){}:V
    public java.lang.Object getOrThrow(final java.lang.Object a1, final x10.rtt.Type t1) {
        return getOrThrow__0x10$util$HashMap$$K$G(($K)a1);
        
    }
    
    // dispatcher for method abstract public x10.util.Map[K, V].put(k:K, v:V){}:x10.util.Box[V]
    public java.lang.Object put(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
        return put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(($K)a1, ($V)a2);
        
    }
    
    // dispatcher for method abstract public x10.util.Map[K, V].containsKey(k:K){}:x10.lang.Boolean
    public java.lang.Object containsKey(final java.lang.Object a1, final x10.rtt.Type t1) {
        return x10.core.Boolean.$box(containsKey__0x10$util$HashMap$$K$O(($K)a1));
        
    }
    
    // dispatcher for method abstract public x10.util.Map[K, V].containsKey(k:K){}:x10.lang.Boolean
    public boolean containsKey$Z(final java.lang.Object a1, final x10.rtt.Type t1) {
        return containsKey__0x10$util$HashMap$$K$O(($K)a1);
        
    }
    
    // dispatcher for method abstract public x10.util.Map[K, V].remove(k:K){}:x10.util.Box[V]
    public java.lang.Object remove(final java.lang.Object a1, final x10.rtt.Type t1) {
        return remove__0x10$util$HashMap$$K(($K)a1);
        
    }
    
    private x10.rtt.Type $K;
    private x10.rtt.Type $V;
    
    // initializer of type parameters
    public static void $initParams(final HashMap $this, final x10.rtt.Type $K, final x10.rtt.Type $V) {
        $this.$K = $K;
        $this.$V = $V;
        
    }
    

    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    @x10.runtime.impl.java.X10Generated
    public static class HashEntry<$Key, $Value> extends x10.core.Ref implements x10.util.Map.Entry, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<HashEntry> $RTT = 
            x10.rtt.NamedType.<HashEntry> make("x10.util.HashMap.HashEntry",
                                               HashEntry.class,
                                               2,
                                               new x10.rtt.Type[] {
                                                   x10.rtt.ParameterizedType.make(x10.util.Map.Entry.$RTT, x10.rtt.UnresolvedType.PARAM(0), x10.rtt.UnresolvedType.PARAM(1))
                                               });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Key; if (i == 1) return $Value; return null; }
        
        public static <$Key, $Value> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.HashMap.HashEntry<$Key, $Value> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Key = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$Value = (x10.rtt.Type) $deserializer.readObject();
            $_obj.key = $deserializer.readObject();
            $_obj.value = $deserializer.readObject();
            $_obj.removed = $deserializer.readBoolean();
            $_obj.hash = $deserializer.readInt();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.HashMap.HashEntry $_obj = new x10.util.HashMap.HashEntry((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Key);
            $serializer.write(this.$Value);
            $serializer.write(this.key);
            $serializer.write(this.value);
            $serializer.write(this.removed);
            $serializer.write(this.hash);
            
        }
        
        // constructor just for allocation
        public HashEntry(final java.lang.System[] $dummy, final x10.rtt.Type $Key, final x10.rtt.Type $Value) {
            x10.util.HashMap.HashEntry.$initParams(this, $Key, $Value);
            
        }
        
        // dispatcher for method abstract public x10.util.Map.Entry[Key, Val].setValue(v:Val){}:void
        public java.lang.Object setValue(final java.lang.Object a1, final x10.rtt.Type t1) {
            setValue__0x10$util$HashMap$HashEntry$$Value(($Value)a1); return null;
            
        }
        
        // dispatcher for method abstract public x10.util.Map.Entry[Key, Val].setValue(v:Val){}:void
        public void setValue$V(final java.lang.Object a1, final x10.rtt.Type t1) {
            setValue__0x10$util$HashMap$HashEntry$$Value(($Value)a1);
            
        }
        
        private x10.rtt.Type $Key;
        private x10.rtt.Type $Value;
        
        // initializer of type parameters
        public static void $initParams(final HashEntry $this, final x10.rtt.Type $Key, final x10.rtt.Type $Value) {
            $this.$Key = $Key;
            $this.$Value = $Value;
            
        }
        // synthetic type for parameter mangling
        public static final class __0x10$util$HashMap$HashEntry$$Key__1x10$util$HashMap$HashEntry$$Value {}
        
    
        
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        public $Key getKey$G() {
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final $Key t$136521 = (($Key)(key));
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            return t$136521;
        }
        
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        public $Value getValue$G() {
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final $Value t$136522 = (($Value)(value));
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            return t$136522;
        }
        
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        public void setValue__0x10$util$HashMap$HashEntry$$Value(final $Value v) {
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            ((x10.util.HashMap.HashEntry<$Key, $Value>)this).value = (($Value)(v));
        }
        
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        public $Key key;
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        public $Value value;
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        public boolean removed;
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        public int hash;
        
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        // creation method for java code (1-phase java constructor)
        public HashEntry(final x10.rtt.Type $Key, final x10.rtt.Type $Value, final $Key key, final $Value value, final int h, __0x10$util$HashMap$HashEntry$$Key__1x10$util$HashMap$HashEntry$$Value $dummy) {
            this((java.lang.System[]) null, $Key, $Value);
            x10$util$HashMap$HashEntry$$init$S(key, value, h, (x10.util.HashMap.HashEntry.__0x10$util$HashMap$HashEntry$$Key__1x10$util$HashMap$HashEntry$$Value) null);
        }
        
        // constructor for non-virtual call
        final public x10.util.HashMap.HashEntry<$Key, $Value> x10$util$HashMap$HashEntry$$init$S(final $Key key, final $Value value, final int h, __0x10$util$HashMap$HashEntry$$Key__1x10$util$HashMap$HashEntry$$Value $dummy) {
             {
                
                //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                
                
                //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final x10.util.HashMap.HashEntry this$136712 = this;
                
                //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                ((x10.util.HashMap.HashEntry<$Key, $Value>)this$136712).removed = false;
                
                //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                ((x10.util.HashMap.HashEntry<$Key, $Value>)this).key = (($Key)(key));
                
                //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                ((x10.util.HashMap.HashEntry<$Key, $Value>)this).value = (($Value)(value));
                
                //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                ((x10.util.HashMap.HashEntry<$Key, $Value>)this).hash = h;
                
                //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                ((x10.util.HashMap.HashEntry<$Key, $Value>)this).removed = false;
            }
            return this;
        }
        
        
        
        //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final public x10.util.HashMap.HashEntry x10$util$HashMap$HashEntry$$this$x10$util$HashMap$HashEntry() {
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            return x10.util.HashMap.HashEntry.this;
        }
        
        
        //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final public void __fieldInitializers_x10_util_HashMap_HashEntry() {
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            ((x10.util.HashMap.HashEntry<$Key, $Value>)this).removed = false;
        }
    }
    
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    /** The actual table, must be of size 2**n */
    public x10.core.Rail<x10.util.HashMap.HashEntry<$K, $V>> table;
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    /** Number of non-null, non-removed entries in the table. */
    public long size;
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    /** Number of non-null entries in the table. */
    public long occupation;
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    /** table.length - 1 */
    public long mask;
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    public long modCount;
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    final public static long MAX_PROBES = 3L;
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    final public static long MIN_SIZE = 4L;
    
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    // creation method for java code (1-phase java constructor)
    public HashMap(final x10.rtt.Type $K, final x10.rtt.Type $V) {
        this((java.lang.System[]) null, $K, $V);
        x10$util$HashMap$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.util.HashMap<$K, $V> x10$util$HashMap$$init$S() {
         {
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final x10.util.HashMap this$136713 = this;
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            ((x10.util.HashMap<$K, $V>)this$136713).table = null;
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            ((x10.util.HashMap<$K, $V>)this$136713).size = 0L;
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            ((x10.util.HashMap<$K, $V>)this$136713).occupation = 0L;
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            ((x10.util.HashMap<$K, $V>)this$136713).mask = 0L;
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            ((x10.util.HashMap<$K, $V>)this$136713).modCount = 0L;
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            this.init((long)(4L));
        }
        return this;
    }
    
    
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    // creation method for java code (1-phase java constructor)
    public HashMap(final x10.rtt.Type $K, final x10.rtt.Type $V, long sz) {
        this((java.lang.System[]) null, $K, $V);
        x10$util$HashMap$$init$S(sz);
    }
    
    // constructor for non-virtual call
    final public x10.util.HashMap<$K, $V> x10$util$HashMap$$init$S(long sz) {
         {
            
            //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final x10.util.HashMap this$136717 = this;
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            ((x10.util.HashMap<$K, $V>)this$136717).table = null;
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            ((x10.util.HashMap<$K, $V>)this$136717).size = 0L;
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            ((x10.util.HashMap<$K, $V>)this$136717).occupation = 0L;
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            ((x10.util.HashMap<$K, $V>)this$136717).mask = 0L;
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            ((x10.util.HashMap<$K, $V>)this$136717).modCount = 0L;
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            long pow2 = 4L;
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            while (true) {
                
                //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136523 = pow2;
                
                //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136524 = sz;
                
                //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final boolean t$136528 = ((t$136523) < (((long)(t$136524))));
                
                //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                if (!(t$136528)) {
                    
                    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    break;
                }
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136714 = pow2;
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136715 = ((long)(((int)(1))));
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136716 = ((t$136714) << (int)(((long)(t$136715))));
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                pow2 = t$136716;
            }
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final long t$136529 = pow2;
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            this.init((long)(t$136529));
        }
        return this;
    }
    
    
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    final public void init(final long sz) {
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        assert ((long) ((sz) & (((long)((-(sz))))))) == ((long) sz);
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        assert ((sz) >= (((long)(4L))));
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final x10.core.Rail t$136530 = ((x10.core.Rail)(new x10.core.Rail<x10.util.HashMap.HashEntry<$K, $V>>(x10.rtt.ParameterizedType.make(x10.util.HashMap.HashEntry.$RTT, $K, $V), ((long)(sz)))));
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        ((x10.util.HashMap<$K, $V>)this).table = ((x10.core.Rail)(t$136530));
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final long t$136531 = ((sz) - (((long)(1L))));
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        ((x10.util.HashMap<$K, $V>)this).mask = t$136531;
        
        //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        ((x10.util.HashMap<$K, $V>)this).size = 0L;
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        ((x10.util.HashMap<$K, $V>)this).occupation = 0L;
    }
    
    
    //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    public void clear() {
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final long t$136532 = this.modCount;
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final long t$136533 = ((t$136532) + (((long)(1L))));
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        ((x10.util.HashMap<$K, $V>)this).modCount = t$136533;
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        this.init((long)(4L));
    }
    
    
    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    public int hash__0x10$util$HashMap$$K$O(final $K k) {
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final x10.util.HashMap this$136487 = ((x10.util.HashMap)(this));
        
        //#line 83 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final $K k$136486 = (($K)(k));
        
        //#line 84 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final int t$136534 = x10.rtt.Types.hashCode(((java.lang.Object)(k$136486)));
        
        //#line 84 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final int t$136535 = ((t$136534) * (((int)(17))));
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        return t$136535;
    }
    
    
    //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    final public int hashInternal__0x10$util$HashMap$$K$O(final $K k) {
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final int t$136536 = x10.rtt.Types.hashCode(((java.lang.Object)(k)));
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final int t$136537 = ((t$136536) * (((int)(17))));
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        return t$136537;
    }
    
    
    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    public x10.util.Box $apply__0x10$util$HashMap$$K(final $K k) {
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final x10.util.Box t$136538 = ((x10.util.Box<$V>)
                                        this.get__0x10$util$HashMap$$K((($K)(k))));
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        return t$136538;
    }
    
    
    //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    public x10.util.Box get__0x10$util$HashMap$$K(final $K k) {
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final x10.util.HashMap.HashEntry e = ((x10.util.HashMap.HashEntry<$K, $V>)
                                               this.getEntry__0x10$util$HashMap$$K((($K)(k))));
        
        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        boolean t$136539 = ((e) == (null));
        
        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        if (!(t$136539)) {
            
            //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            t$136539 = ((x10.util.HashMap.HashEntry<$K, $V>)e).removed;
        }
        
        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final boolean t$136540 = t$136539;
        
        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        if (t$136540) {
            
            //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            return null;
        }
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final x10.util.Box alloc$92225 = ((x10.util.Box)(new x10.util.Box<$V>((java.lang.System[]) null, $V)));
        
        //#line 16 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
        final $V x$136488 = (($V)(((x10.util.HashMap.HashEntry<$K, $V>)e).value));
        
        //#line 16 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
        ((x10.util.Box<$V>)alloc$92225).value = (($V)(x$136488));
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        return alloc$92225;
    }
    
    
    //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    public $V getOrElse__0x10$util$HashMap$$K__1x10$util$HashMap$$V$G(final $K k, final $V orelse) {
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final x10.util.HashMap.HashEntry e = ((x10.util.HashMap.HashEntry<$K, $V>)
                                               this.getEntry__0x10$util$HashMap$$K((($K)(k))));
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        boolean t$136541 = ((e) == (null));
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        if (!(t$136541)) {
            
            //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            t$136541 = ((x10.util.HashMap.HashEntry<$K, $V>)e).removed;
        }
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final boolean t$136542 = t$136541;
        
        //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        if (t$136542) {
            
            //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            return orelse;
        }
        
        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final $V t$136543 = (($V)(((x10.util.HashMap.HashEntry<$K, $V>)e).value));
        
        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        return t$136543;
    }
    
    
    //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    public $V getOrThrow__0x10$util$HashMap$$K$G(final $K k) {
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final x10.util.HashMap.HashEntry e = ((x10.util.HashMap.HashEntry<$K, $V>)
                                               this.getEntry__0x10$util$HashMap$$K((($K)(k))));
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        boolean t$136544 = ((e) == (null));
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        if (!(t$136544)) {
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            t$136544 = ((x10.util.HashMap.HashEntry<$K, $V>)e).removed;
        }
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final boolean t$136547 = t$136544;
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        if (t$136547) {
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final java.lang.String t$136545 = (("Not found: ") + (k));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final java.util.NoSuchElementException t$136546 = ((java.util.NoSuchElementException)(new java.util.NoSuchElementException(t$136545)));
            
            //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            throw t$136546;
        }
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final $V t$136548 = (($V)(((x10.util.HashMap.HashEntry<$K, $V>)e).value));
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        return t$136548;
    }
    
    
    //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    public x10.util.HashMap.HashEntry getEntry__0x10$util$HashMap$$K(final $K k) {
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final long t$136549 = size;
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final boolean t$136550 = ((long) t$136549) == ((long) 0L);
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        if (t$136550) {
            
            //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            return null;
        }
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final int h = this.hash__0x10$util$HashMap$$K$O((($K)(k)));
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        long i = ((long)(((int)(h))));
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        while (true) {
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final long t$136551 = i;
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final long t$136552 = mask;
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final long j = ((t$136551) & (((long)(t$136552))));
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final long t$136553 = i;
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final long t$136554 = ((t$136553) + (((long)(1L))));
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            i = t$136554;
            
            //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final x10.core.Rail t$136555 = ((x10.core.Rail)(table));
            
            //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final x10.util.HashMap.HashEntry e = ((x10.util.HashMap.HashEntry[])t$136555.value)[(int)j];
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final boolean t$136556 = ((e) == (null));
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            if (t$136556) {
                
                //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                return null;
            }
            
            //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final boolean t$136567 = ((e) != (null));
            
            //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            if (t$136567) {
                
                //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final int t$136557 = ((x10.util.HashMap.HashEntry<$K, $V>)e).hash;
                
                //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                boolean t$136559 = ((int) t$136557) == ((int) h);
                
                //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                if (t$136559) {
                    
                    //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    final $K t$136558 = (($K)(((x10.util.HashMap.HashEntry<$K, $V>)e).key));
                    
                    //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    t$136559 = ((java.lang.Object)(((java.lang.Object)(k)))).equals(t$136558);
                }
                
                //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final boolean t$136560 = t$136559;
                
                //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                if (t$136560) {
                    
                    //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    return e;
                }
                
                //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136561 = i;
                
                //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136562 = ((long)(((int)(h))));
                
                //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136564 = ((t$136561) - (((long)(t$136562))));
                
                //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final x10.core.Rail t$136563 = ((x10.core.Rail)(table));
                
                //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136565 = ((x10.core.Rail<x10.util.HashMap.HashEntry<$K, $V>>)t$136563).size;
                
                //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final boolean t$136566 = ((t$136564) > (((long)(t$136565))));
                
                //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                if (t$136566) {
                    
                    //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    return null;
                }
            }
        }
    }
    
    
    //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    public x10.util.Box put__0x10$util$HashMap$$K__1x10$util$HashMap$$V(final $K k, final $V v) {
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final x10.util.Box t$136568 = ((x10.util.Box<$V>)
                                        this.putInternal__0x10$util$HashMap$$K__1x10$util$HashMap$$V((($K)(k)), (($V)(v)), (boolean)(true)));
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        return t$136568;
    }
    
    
    //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    final public x10.util.Box putInternal__0x10$util$HashMap$$K__1x10$util$HashMap$$V(final $K k, final $V v, final boolean mayRehash) {
        
        //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final x10.util.HashMap this$136493 = ((x10.util.HashMap)(this));
        
        //#line 83 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final $K k$136492 = (($K)(k));
        
        //#line 84 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final int t$136569 = x10.rtt.Types.hashCode(((java.lang.Object)(k$136492)));
        
        //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final int h = ((t$136569) * (((int)(17))));
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        long i = ((long)(((int)(h))));
        
        //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        while (true) {
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final long t$136570 = i;
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final long t$136571 = mask;
            
            //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final long j = ((t$136570) & (((long)(t$136571))));
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final long t$136572 = i;
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final long t$136573 = ((t$136572) + (((long)(1L))));
            
            //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            i = t$136573;
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final x10.core.Rail t$136574 = ((x10.core.Rail)(table));
            
            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final x10.util.HashMap.HashEntry e = ((x10.util.HashMap.HashEntry[])t$136574.value)[(int)j];
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final boolean t$136603 = ((e) == (null));
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            if (t$136603) {
                
                //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136575 = this.modCount;
                
                //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136576 = ((t$136575) + (((long)(1L))));
                
                //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                ((x10.util.HashMap<$K, $V>)this).modCount = t$136576;
                
                //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final x10.core.Rail t$136577 = ((x10.core.Rail)(table));
                
                //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final x10.util.HashMap.HashEntry alloc$92226 = ((x10.util.HashMap.HashEntry)(new x10.util.HashMap.HashEntry<$K, $V>((java.lang.System[]) null, $K, $V)));
                
                //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                alloc$92226.x10$util$HashMap$HashEntry$$init$S((($K)(k)), (($V)(v)), ((int)(h)), (x10.util.HashMap.HashEntry.__0x10$util$HashMap$HashEntry$$Key__1x10$util$HashMap$HashEntry$$Value) null);
                
                //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                ((x10.util.HashMap.HashEntry[])t$136577.value)[(int)j] = alloc$92226;
                
                //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136578 = this.size;
                
                //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136579 = ((t$136578) + (((long)(1L))));
                
                //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                ((x10.util.HashMap<$K, $V>)this).size = t$136579;
                
                //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136580 = this.occupation;
                
                //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136581 = ((t$136580) + (((long)(1L))));
                
                //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                ((x10.util.HashMap<$K, $V>)this).occupation = t$136581;
                
                //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                boolean t$136594 = mayRehash;
                
                //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                if (t$136594) {
                    
                    //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    final long t$136582 = i;
                    
                    //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    final long t$136583 = ((long)(((int)(h))));
                    
                    //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    final long t$136584 = ((t$136582) - (((long)(t$136583))));
                    
                    //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    boolean t$136589 = ((t$136584) > (((long)(3L))));
                    
                    //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    if (t$136589) {
                        
                        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                        final long t$136587 = occupation;
                        
                        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                        final x10.core.Rail t$136585 = ((x10.core.Rail)(table));
                        
                        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                        final long t$136586 = ((x10.core.Rail<x10.util.HashMap.HashEntry<$K, $V>>)t$136585).size;
                        
                        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                        final long t$136588 = ((t$136586) / (((long)(2L))));
                        
                        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                        t$136589 = ((t$136587) >= (((long)(t$136588))));
                    }
                    
                    //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    boolean t$136593 = t$136589;
                    
                    //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    if (!(t$136593)) {
                        
                        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                        final long t$136591 = occupation;
                        
                        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                        final x10.core.Rail t$136590 = ((x10.core.Rail)(table));
                        
                        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                        final long t$136592 = ((x10.core.Rail<x10.util.HashMap.HashEntry<$K, $V>>)t$136590).size;
                        
                        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                        t$136593 = ((long) t$136591) == ((long) t$136592);
                    }
                    
                    //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    t$136594 = t$136593;
                }
                
                //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final boolean t$136595 = t$136594;
                
                //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                if (t$136595) {
                    
                    //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    this.rehashInternal();
                }
                
                //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                return null;
            } else {
                
                //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final int t$136596 = ((x10.util.HashMap.HashEntry<$K, $V>)e).hash;
                
                //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                boolean t$136598 = ((int) t$136596) == ((int) h);
                
                //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                if (t$136598) {
                    
                    //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    final $K t$136597 = (($K)(((x10.util.HashMap.HashEntry<$K, $V>)e).key));
                    
                    //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    t$136598 = ((java.lang.Object)(((java.lang.Object)(k)))).equals(t$136597);
                }
                
                //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final boolean t$136602 = t$136598;
                
                //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                if (t$136602) {
                    
                    //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    final $V old = (($V)(((x10.util.HashMap.HashEntry<$K, $V>)e).value));
                    
                    //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    ((x10.util.HashMap.HashEntry<$K, $V>)e).value = (($V)(v));
                    
                    //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    final boolean t$136601 = ((x10.util.HashMap.HashEntry<$K, $V>)e).removed;
                    
                    //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    if (t$136601) {
                        
                        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                        ((x10.util.HashMap.HashEntry<$K, $V>)e).removed = false;
                        
                        //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                        final long t$136599 = this.size;
                        
                        //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                        final long t$136600 = ((t$136599) + (((long)(1L))));
                        
                        //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                        ((x10.util.HashMap<$K, $V>)this).size = t$136600;
                        
                        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                        return null;
                    }
                    
                    //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    final x10.util.Box alloc$92227 = ((x10.util.Box)(new x10.util.Box<$V>((java.lang.System[]) null, $V)));
                    
                    //#line 16 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
                    final $V x$136494 = (($V)(old));
                    
                    //#line 16 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
                    ((x10.util.Box<$V>)alloc$92227).value = (($V)(x$136494));
                    
                    //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    return alloc$92227;
                }
            }
        }
    }
    
    
    //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    public void rehash() {
        
        //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        this.rehashInternal();
    }
    
    
    //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    final public void rehashInternal() {
        
        //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final long t$136604 = this.modCount;
        
        //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final long t$136605 = ((t$136604) + (((long)(1L))));
        
        //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        ((x10.util.HashMap<$K, $V>)this).modCount = t$136605;
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final x10.core.Rail t = ((x10.core.Rail)(table));
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final long oldSize = size;
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final long t$136606 = ((x10.core.Rail<x10.util.HashMap.HashEntry<$K, $V>>)t).size;
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final long t$136607 = ((t$136606) * (((long)(2L))));
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final x10.core.Rail t$136608 = ((x10.core.Rail)(new x10.core.Rail<x10.util.HashMap.HashEntry<$K, $V>>(x10.rtt.ParameterizedType.make(x10.util.HashMap.HashEntry.$RTT, $K, $V), t$136607)));
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        ((x10.util.HashMap<$K, $V>)this).table = ((x10.core.Rail)(t$136608));
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final x10.core.Rail t$136609 = ((x10.core.Rail)(table));
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final long t$136610 = ((x10.core.Rail<x10.util.HashMap.HashEntry<$K, $V>>)t$136609).size;
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final long t$136611 = ((t$136610) - (((long)(1L))));
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        ((x10.util.HashMap<$K, $V>)this).mask = t$136611;
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        ((x10.util.HashMap<$K, $V>)this).size = 0L;
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        ((x10.util.HashMap<$K, $V>)this).occupation = 0L;
        
        //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        long i$136733 = 0L;
        {
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final x10.util.HashMap.HashEntry[] t$value$136771 = ((x10.util.HashMap.HashEntry[])t.value);
            
            //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            for (;
                 true;
                 ) {
                
                //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136734 = i$136733;
                
                //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136735 = ((x10.core.Rail<x10.util.HashMap.HashEntry<$K, $V>>)t).size;
                
                //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final boolean t$136736 = ((t$136734) < (((long)(t$136735))));
                
                //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                if (!(t$136736)) {
                    
                    //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    break;
                }
                
                //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136718 = i$136733;
                
                //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final x10.util.HashMap.HashEntry t$136719 = ((x10.util.HashMap.HashEntry<$K, $V>)t$value$136771[(int)t$136718]);
                
                //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                boolean t$136720 = ((t$136719) != (null));
                
                //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                if (t$136720) {
                    
                    //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    final long t$136721 = i$136733;
                    
                    //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    final x10.util.HashMap.HashEntry t$136722 = ((x10.util.HashMap.HashEntry<$K, $V>)t$value$136771[(int)t$136721]);
                    
                    //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    final boolean t$136723 = ((x10.util.HashMap.HashEntry<$K, $V>)t$136722).removed;
                    
                    //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    t$136720 = !(t$136723);
                }
                
                //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final boolean t$136724 = t$136720;
                
                //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                if (t$136724) {
                    
                    //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    final long t$136725 = i$136733;
                    
                    //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    final x10.util.HashMap.HashEntry t$136726 = ((x10.util.HashMap.HashEntry<$K, $V>)t$value$136771[(int)t$136725]);
                    
                    //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    final $K t$136727 = (($K)(((x10.util.HashMap.HashEntry<$K, $V>)t$136726).key));
                    
                    //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    final long t$136728 = i$136733;
                    
                    //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    final x10.util.HashMap.HashEntry t$136729 = ((x10.util.HashMap.HashEntry<$K, $V>)t$value$136771[(int)t$136728]);
                    
                    //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    final $V t$136730 = (($V)(((x10.util.HashMap.HashEntry<$K, $V>)t$136729).value));
                    
                    //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    this.putInternal__0x10$util$HashMap$$K__1x10$util$HashMap$$V((($K)(t$136727)), (($V)(t$136730)), (boolean)(false));
                }
                
                //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136731 = i$136733;
                
                //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136732 = ((t$136731) + (((long)(1L))));
                
                //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                i$136733 = t$136732;
            }
        }
        
        //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        assert ((long) size) == ((long) oldSize);
    }
    
    
    //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    public boolean containsKey__0x10$util$HashMap$$K$O(final $K k) {
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final x10.util.HashMap.HashEntry e = ((x10.util.HashMap.HashEntry<$K, $V>)
                                               this.getEntry__0x10$util$HashMap$$K((($K)(k))));
        
        //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        boolean t$136632 = ((e) != (null));
        
        //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        if (t$136632) {
            
            //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final boolean t$136631 = ((x10.util.HashMap.HashEntry<$K, $V>)e).removed;
            
            //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            t$136632 = !(t$136631);
        }
        
        //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final boolean t$136633 = t$136632;
        
        //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        return t$136633;
    }
    
    
    //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    public x10.util.Box remove__0x10$util$HashMap$$K(final $K k) {
        
        //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final long t$136634 = this.modCount;
        
        //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final long t$136635 = ((t$136634) + (((long)(1L))));
        
        //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        ((x10.util.HashMap<$K, $V>)this).modCount = t$136635;
        
        //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final x10.util.HashMap.HashEntry e = ((x10.util.HashMap.HashEntry<$K, $V>)
                                               this.getEntry__0x10$util$HashMap$$K((($K)(k))));
        
        //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        boolean t$136637 = ((e) != (null));
        
        //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        if (t$136637) {
            
            //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final boolean t$136636 = ((x10.util.HashMap.HashEntry<$K, $V>)e).removed;
            
            //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            t$136637 = !(t$136636);
        }
        
        //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final boolean t$136640 = t$136637;
        
        //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        if (t$136640) {
            
            //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final long t$136638 = this.size;
            
            //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final long t$136639 = ((t$136638) - (((long)(1L))));
            
            //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            ((x10.util.HashMap<$K, $V>)this).size = t$136639;
            
            //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            ((x10.util.HashMap.HashEntry<$K, $V>)e).removed = true;
            
            //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final x10.util.Box alloc$92228 = ((x10.util.Box)(new x10.util.Box<$V>((java.lang.System[]) null, $V)));
            
            //#line 16 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
            final $V x$136498 = (($V)(((x10.util.HashMap.HashEntry<$K, $V>)e).value));
            
            //#line 16 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
            ((x10.util.Box<$V>)alloc$92228).value = (($V)(x$136498));
            
            //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            return alloc$92228;
        }
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        return null;
    }
    
    
    //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    public x10.util.Set keySet() {
        
        //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final x10.util.HashMap.KeySet alloc$92229 = ((x10.util.HashMap.KeySet)(new x10.util.HashMap.KeySet<$K, $V>((java.lang.System[]) null, $K, $V)));
        
        //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        alloc$92229.x10$util$HashMap$KeySet$$init$S(((x10.util.HashMap<$K, $V>)(this)), (x10.util.HashMap.KeySet.__0$1x10$util$HashMap$KeySet$$Key$3x10$util$HashMap$KeySet$$Value$2) null);
        
        //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        return alloc$92229;
    }
    
    
    //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    public x10.util.Set entries() {
        
        //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final x10.util.HashMap.EntrySet alloc$92230 = ((x10.util.HashMap.EntrySet)(new x10.util.HashMap.EntrySet<$K, $V>((java.lang.System[]) null, $K, $V)));
        
        //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        alloc$92230.x10$util$HashMap$EntrySet$$init$S(((x10.util.HashMap<$K, $V>)(this)), (x10.util.HashMap.EntrySet.__0$1x10$util$HashMap$EntrySet$$Key$3x10$util$HashMap$EntrySet$$Value$2) null);
        
        //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        return alloc$92230;
    }
    
    
    //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    public x10.lang.Iterator entriesIterator() {
        
        //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final x10.util.HashMap.EntriesIterator iterator = ((x10.util.HashMap.EntriesIterator)(new x10.util.HashMap.EntriesIterator<$K, $V>((java.lang.System[]) null, $K, $V)));
        
        //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        iterator.x10$util$HashMap$EntriesIterator$$init$S(((x10.util.HashMap<$K, $V>)(this)), (x10.util.HashMap.EntriesIterator.__0$1x10$util$HashMap$EntriesIterator$$Key$3x10$util$HashMap$EntriesIterator$$Value$2) null);
        
        //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        ((x10.util.HashMap.EntriesIterator<$K, $V>)iterator).advance();
        
        //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        return iterator;
    }
    
    
    //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    @x10.runtime.impl.java.X10Generated
    public static class EntriesIterator<$Key, $Value> extends x10.core.Ref implements x10.lang.Iterator, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<EntriesIterator> $RTT = 
            x10.rtt.NamedType.<EntriesIterator> make("x10.util.HashMap.EntriesIterator",
                                                     EntriesIterator.class,
                                                     2,
                                                     new x10.rtt.Type[] {
                                                         x10.rtt.ParameterizedType.make(x10.lang.Iterator.$RTT, x10.rtt.ParameterizedType.make(x10.util.HashMap.HashEntry.$RTT, x10.rtt.UnresolvedType.PARAM(0), x10.rtt.UnresolvedType.PARAM(1)))
                                                     });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Key; if (i == 1) return $Value; return null; }
        
        public static <$Key, $Value> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.HashMap.EntriesIterator<$Key, $Value> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$Key = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$Value = (x10.rtt.Type) $deserializer.readObject();
            $_obj.map = $deserializer.readObject();
            $_obj.i = $deserializer.readLong();
            $_obj.originalModCount = $deserializer.readLong();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.HashMap.EntriesIterator $_obj = new x10.util.HashMap.EntriesIterator((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$Key);
            $serializer.write(this.$Value);
            $serializer.write(this.map);
            $serializer.write(this.i);
            $serializer.write(this.originalModCount);
            
        }
        
        // constructor just for allocation
        public EntriesIterator(final java.lang.System[] $dummy, final x10.rtt.Type $Key, final x10.rtt.Type $Value) {
            x10.util.HashMap.EntriesIterator.$initParams(this, $Key, $Value);
            
        }
        
        // bridge for method abstract public x10.lang.Iterator[T].next(){}:T
        public x10.util.HashMap.HashEntry next$G() {
            return next();
        }
        
        private x10.rtt.Type $Key;
        private x10.rtt.Type $Value;
        
        // initializer of type parameters
        public static void $initParams(final EntriesIterator $this, final x10.rtt.Type $Key, final x10.rtt.Type $Value) {
            $this.$Key = $Key;
            $this.$Value = $Value;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$util$HashMap$EntriesIterator$$Key$3x10$util$HashMap$EntriesIterator$$Value$2 {}
        
    
        
        //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        public x10.util.HashMap<$Key, $Value> map;
        
        //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        public long i;
        
        //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        public long originalModCount;
        
        
        //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        // creation method for java code (1-phase java constructor)
        public EntriesIterator(final x10.rtt.Type $Key, final x10.rtt.Type $Value, final x10.util.HashMap<$Key, $Value> map, __0$1x10$util$HashMap$EntriesIterator$$Key$3x10$util$HashMap$EntriesIterator$$Value$2 $dummy) {
            this((java.lang.System[]) null, $Key, $Value);
            x10$util$HashMap$EntriesIterator$$init$S(map, (x10.util.HashMap.EntriesIterator.__0$1x10$util$HashMap$EntriesIterator$$Key$3x10$util$HashMap$EntriesIterator$$Value$2) null);
        }
        
        // constructor for non-virtual call
        final public x10.util.HashMap.EntriesIterator<$Key, $Value> x10$util$HashMap$EntriesIterator$$init$S(final x10.util.HashMap<$Key, $Value> map, __0$1x10$util$HashMap$EntriesIterator$$Key$3x10$util$HashMap$EntriesIterator$$Value$2 $dummy) {
             {
                
                //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                
                
                //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final x10.util.HashMap.EntriesIterator this$136737 = this;
                
                //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                ((x10.util.HashMap.EntriesIterator<$Key, $Value>)this$136737).i = 0L;
                
                //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                ((x10.util.HashMap.EntriesIterator<$Key, $Value>)this$136737).originalModCount = 0L;
                
                //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                ((x10.util.HashMap.EntriesIterator<$Key, $Value>)this).map = ((x10.util.HashMap)(map));
                
                //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                ((x10.util.HashMap.EntriesIterator<$Key, $Value>)this).i = 0L;
                
                //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136641 = ((x10.util.HashMap<$Key, $Value>)map).modCount;
                
                //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                ((x10.util.HashMap.EntriesIterator<$Key, $Value>)this).originalModCount = t$136641;
            }
            return this;
        }
        
        
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        public void advance() {
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            while (true) {
                
                //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136644 = i;
                
                //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final x10.util.HashMap t$136642 = ((x10.util.HashMap)(map));
                
                //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final x10.core.Rail t$136643 = ((x10.core.Rail)(((x10.util.HashMap<$Key, $Value>)t$136642).table));
                
                //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136645 = ((x10.core.Rail<x10.util.HashMap.HashEntry<$Key, $Value>>)t$136643).size;
                
                //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final boolean t$136659 = ((t$136644) < (((long)(t$136645))));
                
                //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                if (!(t$136659)) {
                    
                    //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    break;
                }
                
                //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final x10.util.HashMap t$136738 = ((x10.util.HashMap)(map));
                
                //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final x10.core.Rail t$136739 = ((x10.core.Rail)(((x10.util.HashMap<$Key, $Value>)t$136738).table));
                
                //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136740 = i;
                
                //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final x10.util.HashMap.HashEntry t$136741 = ((x10.util.HashMap.HashEntry[])t$136739.value)[(int)t$136740];
                
                //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                boolean t$136742 = ((t$136741) != (null));
                
                //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                if (t$136742) {
                    
                    //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    final x10.util.HashMap t$136743 = ((x10.util.HashMap)(map));
                    
                    //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    final x10.core.Rail t$136744 = ((x10.core.Rail)(((x10.util.HashMap<$Key, $Value>)t$136743).table));
                    
                    //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    final long t$136745 = i;
                    
                    //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    final x10.util.HashMap.HashEntry t$136746 = ((x10.util.HashMap.HashEntry[])t$136744.value)[(int)t$136745];
                    
                    //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    final boolean t$136747 = ((x10.util.HashMap.HashEntry<$Key, $Value>)t$136746).removed;
                    
                    //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    t$136742 = !(t$136747);
                }
                
                //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final boolean t$136748 = t$136742;
                
                //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                if (t$136748) {
                    
                    //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    return;
                }
                
                //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136749 = this.i;
                
                //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136750 = ((t$136749) + (((long)(1L))));
                
                //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                ((x10.util.HashMap.EntriesIterator<$Key, $Value>)this).i = t$136750;
            }
        }
        
        
        //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        public boolean hasNext$O() {
            
            //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final long t$136662 = i;
            
            //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final x10.util.HashMap t$136660 = ((x10.util.HashMap)(map));
            
            //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final x10.core.Rail t$136661 = ((x10.core.Rail)(((x10.util.HashMap<$Key, $Value>)t$136660).table));
            
            //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final long t$136663 = ((x10.core.Rail<x10.util.HashMap.HashEntry<$Key, $Value>>)t$136661).size;
            
            //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final boolean t$136664 = ((t$136662) < (((long)(t$136663))));
            
            //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            if (t$136664) {
                
                //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                return true;
            }
            
            //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            return false;
        }
        
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        public x10.util.HashMap.HashEntry next() {
            
            //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final long t$136666 = originalModCount;
            
            //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final x10.util.HashMap t$136665 = ((x10.util.HashMap)(map));
            
            //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final long t$136667 = ((x10.util.HashMap<$Key, $Value>)t$136665).modCount;
            
            //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final boolean t$136675 = ((long) t$136666) != ((long) t$136667);
            
            //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            if (t$136675) {
                
                //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final x10.util.HashMap t$136668 = ((x10.util.HashMap)(map));
                
                //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136669 = ((x10.util.HashMap<$Key, $Value>)t$136668).modCount;
                
                //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136670 = originalModCount;
                
                //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136671 = ((t$136669) - (((long)(t$136670))));
                
                //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final java.lang.String t$136672 = (("Your code has a concurrency bug! You updated the hashmap ") + ((x10.core.Long.$box(t$136671))));
                
                //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final java.lang.String t$136673 = ((t$136672) + (" times since you created the iterator."));
                
                //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final java.lang.RuntimeException t$136674 = ((java.lang.RuntimeException)(new java.lang.RuntimeException(t$136673)));
                
                //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                throw t$136674;
            }
            
            //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final long j = i;
            
            //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final long t$136676 = this.i;
            
            //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final long t$136677 = ((t$136676) + (((long)(1L))));
            
            //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            ((x10.util.HashMap.EntriesIterator<$Key, $Value>)this).i = t$136677;
            
            //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            this.advance();
            
            //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final x10.util.HashMap t$136678 = ((x10.util.HashMap)(map));
            
            //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final x10.core.Rail t$136679 = ((x10.core.Rail)(((x10.util.HashMap<$Key, $Value>)t$136678).table));
            
            //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final x10.util.HashMap.HashEntry t$136680 = ((x10.util.HashMap.HashEntry[])t$136679.value)[(int)j];
            
            //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            return t$136680;
        }
        
        
        //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final public x10.util.HashMap.EntriesIterator x10$util$HashMap$EntriesIterator$$this$x10$util$HashMap$EntriesIterator() {
            
            //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            return x10.util.HashMap.EntriesIterator.this;
        }
        
        
        //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final public void __fieldInitializers_x10_util_HashMap_EntriesIterator() {
            
            //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            ((x10.util.HashMap.EntriesIterator<$Key, $Value>)this).i = 0L;
            
            //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            ((x10.util.HashMap.EntriesIterator<$Key, $Value>)this).originalModCount = 0L;
        }
    }
    
    
    
    //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    public long size$O() {
        
        //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final long t$136681 = size;
        
        //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        return t$136681;
    }
    
    
    //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    @x10.runtime.impl.java.X10Generated
    public static class KeySet<$Key, $Value> extends x10.util.AbstractCollection<$Key> implements x10.util.Set, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<KeySet> $RTT = 
            x10.rtt.NamedType.<KeySet> make("x10.util.HashMap.KeySet",
                                            KeySet.class,
                                            2,
                                            new x10.rtt.Type[] {
                                                x10.rtt.ParameterizedType.make(x10.util.Set.$RTT, x10.rtt.UnresolvedType.PARAM(0)),
                                                x10.rtt.ParameterizedType.make(x10.util.AbstractCollection.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                            });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Key; if (i == 1) return $Value; return null; }
        
        public static <$Key, $Value> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.HashMap.KeySet<$Key, $Value> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.AbstractCollection.$_deserialize_body($_obj, $deserializer);
            $_obj.$Key = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$Value = (x10.rtt.Type) $deserializer.readObject();
            $_obj.map = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.HashMap.KeySet $_obj = new x10.util.HashMap.KeySet((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            super.$_serialize($serializer);
            $serializer.write(this.$Key);
            $serializer.write(this.$Value);
            $serializer.write(this.map);
            
        }
        
        // constructor just for allocation
        public KeySet(final java.lang.System[] $dummy, final x10.rtt.Type $Key, final x10.rtt.Type $Value) {
            super($dummy, $Key);
            x10.util.HashMap.KeySet.$initParams(this, $Key, $Value);
            
        }
        
        // dispatcher for method abstract public x10.util.Container[T].contains(y:T){}:x10.lang.Boolean
        public java.lang.Object contains(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Boolean.$box(contains__0x10$util$HashMap$KeySet$$Key$O(($Key)a1));
            
        }
        
        // dispatcher for method abstract public x10.util.Container[T].contains(y:T){}:x10.lang.Boolean
        public boolean contains$Z(final java.lang.Object a1, final x10.rtt.Type t1) {
            return contains__0x10$util$HashMap$KeySet$$Key$O(($Key)a1);
            
        }
        
        // dispatcher for method abstract public x10.util.Collection[T].add(v:T){}:x10.lang.Boolean
        public java.lang.Object add(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Boolean.$box(add__0x10$util$HashMap$KeySet$$Key$O(($Key)a1));
            
        }
        
        // dispatcher for method abstract public x10.util.Collection[T].add(v:T){}:x10.lang.Boolean
        public boolean add$Z(final java.lang.Object a1, final x10.rtt.Type t1) {
            return add__0x10$util$HashMap$KeySet$$Key$O(($Key)a1);
            
        }
        
        // dispatcher for method abstract public x10.util.Collection[T].remove(v:T){}:x10.lang.Boolean
        public java.lang.Object remove(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Boolean.$box(remove__0x10$util$HashMap$KeySet$$Key$O(($Key)a1));
            
        }
        
        // dispatcher for method abstract public x10.util.Collection[T].remove(v:T){}:x10.lang.Boolean
        public boolean remove$Z(final java.lang.Object a1, final x10.rtt.Type t1) {
            return remove__0x10$util$HashMap$KeySet$$Key$O(($Key)a1);
            
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
        public boolean contains__0x10$util$AbstractContainer$$T$O($Key a1) {
            return contains__0x10$util$HashMap$KeySet$$Key$O(a1);
        }
        
        // bridge for method abstract public x10.util.AbstractCollection[T].add(v:T){}:x10.lang.Boolean
        public boolean add__0x10$util$AbstractCollection$$T$O($Key a1) {
            return add__0x10$util$HashMap$KeySet$$Key$O(a1);
        }
        
        // bridge for method abstract public x10.util.AbstractCollection[T].remove(v:T){}:x10.lang.Boolean
        public boolean remove__0x10$util$AbstractCollection$$T$O($Key a1) {
            return remove__0x10$util$HashMap$KeySet$$Key$O(a1);
        }
        
        private x10.rtt.Type $Key;
        private x10.rtt.Type $Value;
        
        // initializer of type parameters
        public static void $initParams(final KeySet $this, final x10.rtt.Type $Key, final x10.rtt.Type $Value) {
            $this.$Key = $Key;
            $this.$Value = $Value;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$util$HashMap$KeySet$$Key$3x10$util$HashMap$KeySet$$Value$2 {}
        
    
        
        //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        public x10.util.HashMap<$Key, $Value> map;
        
        
        //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        // creation method for java code (1-phase java constructor)
        public KeySet(final x10.rtt.Type $Key, final x10.rtt.Type $Value, final x10.util.HashMap<$Key, $Value> map, __0$1x10$util$HashMap$KeySet$$Key$3x10$util$HashMap$KeySet$$Value$2 $dummy) {
            this((java.lang.System[]) null, $Key, $Value);
            x10$util$HashMap$KeySet$$init$S(map, (x10.util.HashMap.KeySet.__0$1x10$util$HashMap$KeySet$$Key$3x10$util$HashMap$KeySet$$Value$2) null);
        }
        
        // constructor for non-virtual call
        final public x10.util.HashMap.KeySet<$Key, $Value> x10$util$HashMap$KeySet$$init$S(final x10.util.HashMap<$Key, $Value> map, __0$1x10$util$HashMap$KeySet$$Key$3x10$util$HashMap$KeySet$$Value$2 $dummy) {
             {
                
                //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                /*super.*/x10$util$AbstractCollection$$init$S();
                
                //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                
                
                //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final x10.util.HashMap.KeySet this$136751 = this;
                
                //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                ((x10.util.HashMap.KeySet<$Key, $Value>)this).map = ((x10.util.HashMap)(map));
            }
            return this;
        }
        
        
        
        //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        public x10.lang.Iterator iterator() {
            
            //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final x10.util.MapIterator alloc$92231 = ((x10.util.MapIterator)(new x10.util.MapIterator<x10.util.HashMap.HashEntry<$Key, $Value>, $Key>((java.lang.System[]) null, x10.rtt.ParameterizedType.make(x10.util.HashMap.HashEntry.$RTT, $Key, $Value), $Key)));
            
            //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final x10.util.HashMap t$136682 = ((x10.util.HashMap)(map));
            
            //#line 18 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
            final x10.lang.Iterator i$136508 = ((x10.lang.Iterator)(((x10.lang.Iterator<x10.util.HashMap.HashEntry<$Key, $Value>>)
                                                                      ((x10.util.HashMap<$Key, $Value>)t$136682).entriesIterator())));
            
            //#line 19 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
            ((x10.util.MapIterator<x10.util.HashMap.HashEntry<$Key, $Value>, $Key>)alloc$92231).i = ((x10.lang.Iterator)(i$136508));
            
            //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final x10.core.fun.Fun_0_1 t$136752 = ((x10.core.fun.Fun_0_1)(new x10.util.HashMap.KeySet.$Closure$292<$Key, $Value>($Key, $Value)));
            
            //#line 20 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
            ((x10.util.MapIterator<x10.util.HashMap.HashEntry<$Key, $Value>, $Key>)alloc$92231).f = ((x10.core.fun.Fun_0_1)(t$136752));
            
            //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            return alloc$92231;
        }
        
        
        //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        public boolean contains__0x10$util$HashMap$KeySet$$Key$O(final $Key k) {
            
            //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final x10.util.HashMap t$136685 = ((x10.util.HashMap)(map));
            
            //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final boolean t$136686 = ((x10.util.HashMap<$Key, $Value>)t$136685).containsKey__0x10$util$HashMap$$K$O((($Key)(k)));
            
            //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            return t$136686;
        }
        
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        public boolean add__0x10$util$HashMap$KeySet$$Key$O(final $Key k) {
            
            //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final java.lang.UnsupportedOperationException t$136687 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException()));
            
            //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            throw t$136687;
        }
        
        
        //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        public boolean remove__0x10$util$HashMap$KeySet$$Key$O(final $Key k) {
            
            //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final java.lang.UnsupportedOperationException t$136688 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException()));
            
            //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            throw t$136688;
        }
        
        
        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        public x10.util.HashMap.KeySet clone() {
            
            //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final java.lang.UnsupportedOperationException t$136689 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException()));
            
            //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            throw t$136689;
        }
        
        
        //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        public long size$O() {
            
            //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final x10.util.HashMap t$136690 = ((x10.util.HashMap)(map));
            
            //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final long t$136691 = ((x10.util.HashMap<$Key, $Value>)t$136690).size$O();
            
            //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            return t$136691;
        }
        
        
        //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final public x10.util.HashMap.KeySet x10$util$HashMap$KeySet$$this$x10$util$HashMap$KeySet() {
            
            //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            return x10.util.HashMap.KeySet.this;
        }
        
        
        //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final public void __fieldInitializers_x10_util_HashMap_KeySet() {
            
        }
        
        @x10.runtime.impl.java.X10Generated
        final public static class $Closure$292<$Key, $Value> extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<$Closure$292> $RTT = 
                x10.rtt.StaticFunType.<$Closure$292> make($Closure$292.class,
                                                          2,
                                                          new x10.rtt.Type[] {
                                                              x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.ParameterizedType.make(x10.util.HashMap.HashEntry.$RTT, x10.rtt.UnresolvedType.PARAM(0), x10.rtt.UnresolvedType.PARAM(1)), x10.rtt.UnresolvedType.PARAM(0))
                                                          });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Key; if (i == 1) return $Value; return null; }
            
            public static <$Key, $Value> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.HashMap.KeySet.$Closure$292<$Key, $Value> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                $_obj.$Key = (x10.rtt.Type) $deserializer.readObject();
                $_obj.$Value = (x10.rtt.Type) $deserializer.readObject();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                x10.util.HashMap.KeySet.$Closure$292 $_obj = new x10.util.HashMap.KeySet.$Closure$292((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                $serializer.write(this.$Key);
                $serializer.write(this.$Value);
                
            }
            
            // constructor just for allocation
            public $Closure$292(final java.lang.System[] $dummy, final x10.rtt.Type $Key, final x10.rtt.Type $Value) {
                x10.util.HashMap.KeySet.$Closure$292.$initParams(this, $Key, $Value);
                
            }
            
            // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                return $apply__0$1x10$util$HashMap$KeySet$$Closure$292$$Key$3x10$util$HashMap$KeySet$$Closure$292$$Value$2$G((x10.util.HashMap.HashEntry)a1);
                
            }
            
            private x10.rtt.Type $Key;
            private x10.rtt.Type $Value;
            
            // initializer of type parameters
            public static void $initParams(final $Closure$292 $this, final x10.rtt.Type $Key, final x10.rtt.Type $Value) {
                $this.$Key = $Key;
                $this.$Value = $Value;
                
            }
            
        
            
            public $Key $apply__0$1x10$util$HashMap$KeySet$$Closure$292$$Key$3x10$util$HashMap$KeySet$$Closure$292$$Value$2$G(final x10.util.HashMap.HashEntry e$136753) {
                
                //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final $Key t$136754 = (($Key)(((x10.util.HashMap.HashEntry<$Key, $Value>)e$136753).key));
                
                //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                return t$136754;
            }
            
            public $Closure$292(final x10.rtt.Type $Key, final x10.rtt.Type $Value) {
                x10.util.HashMap.KeySet.$Closure$292.$initParams(this, $Key, $Value);
                 {
                    
                }
            }
            
        }
        
    }
    
    
    //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    @x10.runtime.impl.java.X10Generated
    public static class EntrySet<$Key, $Value> extends x10.util.AbstractCollection<x10.util.Map.Entry<$Key, $Value>> implements x10.util.Set, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<EntrySet> $RTT = 
            x10.rtt.NamedType.<EntrySet> make("x10.util.HashMap.EntrySet",
                                              EntrySet.class,
                                              2,
                                              new x10.rtt.Type[] {
                                                  x10.rtt.ParameterizedType.make(x10.util.Set.$RTT, x10.rtt.ParameterizedType.make(x10.util.Map.Entry.$RTT, x10.rtt.UnresolvedType.PARAM(0), x10.rtt.UnresolvedType.PARAM(1))),
                                                  x10.rtt.ParameterizedType.make(x10.util.AbstractCollection.$RTT, x10.rtt.ParameterizedType.make(x10.util.Map.Entry.$RTT, x10.rtt.UnresolvedType.PARAM(0), x10.rtt.UnresolvedType.PARAM(1)))
                                              });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Key; if (i == 1) return $Value; return null; }
        
        public static <$Key, $Value> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.HashMap.EntrySet<$Key, $Value> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.AbstractCollection.$_deserialize_body($_obj, $deserializer);
            $_obj.$Key = (x10.rtt.Type) $deserializer.readObject();
            $_obj.$Value = (x10.rtt.Type) $deserializer.readObject();
            $_obj.map = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.HashMap.EntrySet $_obj = new x10.util.HashMap.EntrySet((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            super.$_serialize($serializer);
            $serializer.write(this.$Key);
            $serializer.write(this.$Value);
            $serializer.write(this.map);
            
        }
        
        // constructor just for allocation
        public EntrySet(final java.lang.System[] $dummy, final x10.rtt.Type $Key, final x10.rtt.Type $Value) {
            super($dummy, x10.rtt.ParameterizedType.make(x10.util.Map.Entry.$RTT, $Key, $Value));
            x10.util.HashMap.EntrySet.$initParams(this, $Key, $Value);
            
        }
        
        // dispatcher for method abstract public x10.util.Container[T].contains(y:T){}:x10.lang.Boolean
        public java.lang.Object contains(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Boolean.$box(contains__0$1x10$util$HashMap$EntrySet$$Key$3x10$util$HashMap$EntrySet$$Value$2$O((x10.util.Map.Entry)a1));
            
        }
        
        // dispatcher for method abstract public x10.util.Container[T].contains(y:T){}:x10.lang.Boolean
        public boolean contains$Z(final java.lang.Object a1, final x10.rtt.Type t1) {
            return contains__0$1x10$util$HashMap$EntrySet$$Key$3x10$util$HashMap$EntrySet$$Value$2$O((x10.util.Map.Entry)a1);
            
        }
        
        // dispatcher for method abstract public x10.util.Collection[T].add(v:T){}:x10.lang.Boolean
        public java.lang.Object add(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Boolean.$box(add__0$1x10$util$HashMap$EntrySet$$Key$3x10$util$HashMap$EntrySet$$Value$2$O((x10.util.Map.Entry)a1));
            
        }
        
        // dispatcher for method abstract public x10.util.Collection[T].add(v:T){}:x10.lang.Boolean
        public boolean add$Z(final java.lang.Object a1, final x10.rtt.Type t1) {
            return add__0$1x10$util$HashMap$EntrySet$$Key$3x10$util$HashMap$EntrySet$$Value$2$O((x10.util.Map.Entry)a1);
            
        }
        
        // dispatcher for method abstract public x10.util.Collection[T].remove(v:T){}:x10.lang.Boolean
        public java.lang.Object remove(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Boolean.$box(remove__0$1x10$util$HashMap$EntrySet$$Key$3x10$util$HashMap$EntrySet$$Value$2$O((x10.util.Map.Entry)a1));
            
        }
        
        // dispatcher for method abstract public x10.util.Collection[T].remove(v:T){}:x10.lang.Boolean
        public boolean remove$Z(final java.lang.Object a1, final x10.rtt.Type t1) {
            return remove__0$1x10$util$HashMap$EntrySet$$Key$3x10$util$HashMap$EntrySet$$Value$2$O((x10.util.Map.Entry)a1);
            
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
        public boolean contains__0x10$util$AbstractContainer$$T$O(x10.util.Map.Entry a1) {
            return contains__0$1x10$util$HashMap$EntrySet$$Key$3x10$util$HashMap$EntrySet$$Value$2$O(a1);
        }
        
        // bridge for method abstract public x10.util.AbstractCollection[T].add(v:T){}:x10.lang.Boolean
        public boolean add__0x10$util$AbstractCollection$$T$O(x10.util.Map.Entry a1) {
            return add__0$1x10$util$HashMap$EntrySet$$Key$3x10$util$HashMap$EntrySet$$Value$2$O(a1);
        }
        
        // bridge for method abstract public x10.util.AbstractCollection[T].remove(v:T){}:x10.lang.Boolean
        public boolean remove__0x10$util$AbstractCollection$$T$O(x10.util.Map.Entry a1) {
            return remove__0$1x10$util$HashMap$EntrySet$$Key$3x10$util$HashMap$EntrySet$$Value$2$O(a1);
        }
        
        private x10.rtt.Type $Key;
        private x10.rtt.Type $Value;
        
        // initializer of type parameters
        public static void $initParams(final EntrySet $this, final x10.rtt.Type $Key, final x10.rtt.Type $Value) {
            $this.$Key = $Key;
            $this.$Value = $Value;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$util$HashMap$EntrySet$$Key$3x10$util$HashMap$EntrySet$$Value$2 {}
        
    
        
        //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        public x10.util.HashMap<$Key, $Value> map;
        
        
        //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        // creation method for java code (1-phase java constructor)
        public EntrySet(final x10.rtt.Type $Key, final x10.rtt.Type $Value, final x10.util.HashMap<$Key, $Value> map, __0$1x10$util$HashMap$EntrySet$$Key$3x10$util$HashMap$EntrySet$$Value$2 $dummy) {
            this((java.lang.System[]) null, $Key, $Value);
            x10$util$HashMap$EntrySet$$init$S(map, (x10.util.HashMap.EntrySet.__0$1x10$util$HashMap$EntrySet$$Key$3x10$util$HashMap$EntrySet$$Value$2) null);
        }
        
        // constructor for non-virtual call
        final public x10.util.HashMap.EntrySet<$Key, $Value> x10$util$HashMap$EntrySet$$init$S(final x10.util.HashMap<$Key, $Value> map, __0$1x10$util$HashMap$EntrySet$$Key$3x10$util$HashMap$EntrySet$$Value$2 $dummy) {
             {
                
                //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                /*super.*/x10$util$AbstractCollection$$init$S();
                
                //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                
                
                //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final x10.util.HashMap.EntrySet this$136755 = this;
                
                //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                ((x10.util.HashMap.EntrySet<$Key, $Value>)this).map = ((x10.util.HashMap)(map));
            }
            return this;
        }
        
        
        
        //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        public x10.lang.Iterator iterator() {
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final x10.util.MapIterator alloc$92232 = ((x10.util.MapIterator)(new x10.util.MapIterator<x10.util.HashMap.HashEntry<$Key, $Value>, x10.util.Map.Entry<$Key, $Value>>((java.lang.System[]) null, x10.rtt.ParameterizedType.make(x10.util.HashMap.HashEntry.$RTT, $Key, $Value), x10.rtt.ParameterizedType.make(x10.util.Map.Entry.$RTT, $Key, $Value))));
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final x10.util.HashMap t$136692 = ((x10.util.HashMap)(map));
            
            //#line 18 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
            final x10.lang.Iterator i$136516 = ((x10.lang.Iterator)(((x10.lang.Iterator<x10.util.HashMap.HashEntry<$Key, $Value>>)
                                                                      ((x10.util.HashMap<$Key, $Value>)t$136692).entriesIterator())));
            
            //#line 19 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
            ((x10.util.MapIterator<x10.util.HashMap.HashEntry<$Key, $Value>, x10.util.Map.Entry<$Key, $Value>>)alloc$92232).i = ((x10.lang.Iterator)(i$136516));
            
            //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final x10.core.fun.Fun_0_1 t$136756 = ((x10.core.fun.Fun_0_1)(new x10.util.HashMap.EntrySet.$Closure$293<$Key, $Value>($Key, $Value)));
            
            //#line 20 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
            ((x10.util.MapIterator<x10.util.HashMap.HashEntry<$Key, $Value>, x10.util.Map.Entry<$Key, $Value>>)alloc$92232).f = ((x10.core.fun.Fun_0_1)(t$136756));
            
            //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            return alloc$92232;
        }
        
        
        //#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        public boolean contains__0$1x10$util$HashMap$EntrySet$$Key$3x10$util$HashMap$EntrySet$$Value$2$O(final x10.util.Map.Entry k) {
            
            //#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final java.lang.UnsupportedOperationException t$136694 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException()));
            
            //#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            throw t$136694;
        }
        
        
        //#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        public boolean add__0$1x10$util$HashMap$EntrySet$$Key$3x10$util$HashMap$EntrySet$$Value$2$O(final x10.util.Map.Entry k) {
            
            //#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final java.lang.UnsupportedOperationException t$136695 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException()));
            
            //#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            throw t$136695;
        }
        
        
        //#line 278 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        public boolean remove__0$1x10$util$HashMap$EntrySet$$Key$3x10$util$HashMap$EntrySet$$Value$2$O(final x10.util.Map.Entry k) {
            
            //#line 278 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final java.lang.UnsupportedOperationException t$136696 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException()));
            
            //#line 278 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            throw t$136696;
        }
        
        
        //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        public x10.util.HashMap.EntrySet clone() {
            
            //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final java.lang.UnsupportedOperationException t$136697 = ((java.lang.UnsupportedOperationException)(new java.lang.UnsupportedOperationException()));
            
            //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            throw t$136697;
        }
        
        
        //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        public long size$O() {
            
            //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final x10.util.HashMap t$136698 = ((x10.util.HashMap)(map));
            
            //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final long t$136699 = ((x10.util.HashMap<$Key, $Value>)t$136698).size$O();
            
            //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            return t$136699;
        }
        
        
        //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final public x10.util.HashMap.EntrySet x10$util$HashMap$EntrySet$$this$x10$util$HashMap$EntrySet() {
            
            //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            return x10.util.HashMap.EntrySet.this;
        }
        
        
        //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final public void __fieldInitializers_x10_util_HashMap_EntrySet() {
            
        }
        
        @x10.runtime.impl.java.X10Generated
        final public static class $Closure$293<$Key, $Value> extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
        {
            public static final x10.rtt.RuntimeType<$Closure$293> $RTT = 
                x10.rtt.StaticFunType.<$Closure$293> make($Closure$293.class,
                                                          2,
                                                          new x10.rtt.Type[] {
                                                              x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.ParameterizedType.make(x10.util.HashMap.HashEntry.$RTT, x10.rtt.UnresolvedType.PARAM(0), x10.rtt.UnresolvedType.PARAM(1)), x10.rtt.ParameterizedType.make(x10.util.Map.Entry.$RTT, x10.rtt.UnresolvedType.PARAM(0), x10.rtt.UnresolvedType.PARAM(1)))
                                                          });
            
            public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
            
            public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $Key; if (i == 1) return $Value; return null; }
            
            public static <$Key, $Value> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.HashMap.EntrySet.$Closure$293<$Key, $Value> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                $_obj.$Key = (x10.rtt.Type) $deserializer.readObject();
                $_obj.$Value = (x10.rtt.Type) $deserializer.readObject();
                return $_obj;
            }
            
            public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
                x10.util.HashMap.EntrySet.$Closure$293 $_obj = new x10.util.HashMap.EntrySet.$Closure$293((java.lang.System[]) null, (x10.rtt.Type) null, (x10.rtt.Type) null);
                $deserializer.record_reference($_obj);
                return $_deserialize_body($_obj, $deserializer);
            }
            
            public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
                $serializer.write(this.$Key);
                $serializer.write(this.$Value);
                
            }
            
            // constructor just for allocation
            public $Closure$293(final java.lang.System[] $dummy, final x10.rtt.Type $Key, final x10.rtt.Type $Value) {
                x10.util.HashMap.EntrySet.$Closure$293.$initParams(this, $Key, $Value);
                
            }
            
            // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
            public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
                return $apply__0$1x10$util$HashMap$EntrySet$$Closure$293$$Key$3x10$util$HashMap$EntrySet$$Closure$293$$Value$2((x10.util.HashMap.HashEntry)a1);
                
            }
            
            private x10.rtt.Type $Key;
            private x10.rtt.Type $Value;
            
            // initializer of type parameters
            public static void $initParams(final $Closure$293 $this, final x10.rtt.Type $Key, final x10.rtt.Type $Value) {
                $this.$Key = $Key;
                $this.$Value = $Value;
                
            }
            
        
            
            public x10.util.Map.Entry $apply__0$1x10$util$HashMap$EntrySet$$Closure$293$$Key$3x10$util$HashMap$EntrySet$$Closure$293$$Value$2(final x10.util.HashMap.HashEntry e$136757) {
                
                //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                return e$136757;
            }
            
            public $Closure$293(final x10.rtt.Type $Key, final x10.rtt.Type $Value) {
                x10.util.HashMap.EntrySet.$Closure$293.$initParams(this, $Key, $Value);
                 {
                    
                }
            }
            
        }
        
    }
    
    
    
    //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    // creation method for java code (1-phase java constructor)
    public HashMap(final x10.rtt.Type $K, final x10.rtt.Type $V, final x10.io.Deserializer ds) {
        this((java.lang.System[]) null, $K, $V);
        x10$util$HashMap$$init$S(ds);
    }
    
    // constructor for non-virtual call
    final public x10.util.HashMap<$K, $V> x10$util$HashMap$$init$S(final x10.io.Deserializer ds) {
        x10$util$HashMap$$initForReflection(ds);
        
        return this;
    }
    
    public void x10$util$HashMap$$initForReflection(x10.io.Deserializer ds) {
         {
            
            //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            /*this.*/x10$util$HashMap$$init$S();
            
            //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final java.lang.Object t$136700 = ds.readAny();
            
            //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final long numEntries = x10.rtt.Types.aslong(t$136700,x10.rtt.Types.ANY);
            
            //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final long i$92234max$136767 = numEntries;
            
            //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            long i$136764 = 1L;
            
            //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            for (;
                 true;
                 ) {
                
                //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136765 = i$136764;
                
                //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final boolean t$136766 = ((t$136765) <= (((long)(i$92234max$136767))));
                
                //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                if (!(t$136766)) {
                    
                    //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                    break;
                }
                
                //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final java.lang.Object t$136758 = ds.readAny();
                
                //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final $K key$136759 = (($K)(x10.rtt.Types.<$K> cast(t$136758,$K)));
                
                //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final java.lang.Object t$136760 = ds.readAny();
                
                //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final $V value$136761 = (($V)(x10.rtt.Types.<$V> cast(t$136760,$V)));
                
                //#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                this.putInternal__0x10$util$HashMap$$K__1x10$util$HashMap$$V((($K)(key$136759)), (($V)(value$136761)), (boolean)(true));
                
                //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136762 = i$136764;
                
                //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                final long t$136763 = ((t$136762) + (((long)(1L))));
                
                //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                i$136764 = t$136763;
            }
        }
    }
    
    
    
    //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    public void serialize(final x10.io.Serializer s) {
        
        //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final x10.lang.Iterator it = ((x10.lang.Iterator<x10.util.HashMap.HashEntry<$K, $V>>)
                                       this.entriesIterator());
        
        //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        final long t$136708 = this.size$O();
        
        //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        s.writeAny(x10.core.Long.$box(t$136708));
        
        //#line 302 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        while (true) {
            
            //#line 302 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final boolean t$136711 = ((x10.lang.Iterator<x10.util.HashMap.HashEntry<$K, $V>>)it).hasNext$O();
            
            //#line 302 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            if (!(t$136711)) {
                
                //#line 302 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                break;
            }
            
            //#line 303 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final x10.util.HashMap.HashEntry entry$136768 = ((x10.lang.Iterator<x10.util.HashMap.HashEntry<$K, $V>>)it).next$G();
            
            //#line 304 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final $K t$136769 = (($K)(((x10.util.HashMap.HashEntry<$K, $V>)entry$136768).getKey$G()));
            
            //#line 304 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            s.writeAny(((java.lang.Object)(t$136769)));
            
            //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            final $V t$136770 = (($V)(((x10.util.HashMap.HashEntry<$K, $V>)entry$136768).getValue$G()));
            
            //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            s.writeAny(((java.lang.Object)(t$136770)));
        }
    }
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    final public x10.util.HashMap x10$util$HashMap$$this$x10$util$HashMap() {
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        return x10.util.HashMap.this;
    }
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    final public void __fieldInitializers_x10_util_HashMap() {
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        ((x10.util.HashMap<$K, $V>)this).table = null;
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        ((x10.util.HashMap<$K, $V>)this).size = 0L;
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        ((x10.util.HashMap<$K, $V>)this).occupation = 0L;
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        ((x10.util.HashMap<$K, $V>)this).mask = 0L;
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        ((x10.util.HashMap<$K, $V>)this).modCount = 0L;
    }
    
    public static long get$MAX_PROBES() {
        return x10.util.HashMap.MAX_PROBES;
    }
    
    public static long get$MIN_SIZE() {
        return x10.util.HashMap.MIN_SIZE;
    }
}

