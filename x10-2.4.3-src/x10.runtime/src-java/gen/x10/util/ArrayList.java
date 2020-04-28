package x10.util;

@x10.runtime.impl.java.X10Generated
public class ArrayList<$T> extends x10.util.AbstractCollection<$T> implements x10.util.List, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<ArrayList> $RTT = 
        x10.rtt.NamedType.<ArrayList> make("x10.util.ArrayList",
                                           ArrayList.class,
                                           1,
                                           new x10.rtt.Type[] {
                                               x10.rtt.ParameterizedType.make(x10.util.List.$RTT, x10.rtt.UnresolvedType.PARAM(0)),
                                               x10.rtt.ParameterizedType.make(x10.util.AbstractCollection.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                           });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.ArrayList<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.AbstractCollection.$_deserialize_body($_obj, $deserializer);
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        $_obj.a = $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.ArrayList $_obj = new x10.util.ArrayList((java.lang.System[]) null, (x10.rtt.Type) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.$T);
        $serializer.write(this.a);
        
    }
    
    // constructor just for allocation
    public ArrayList(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        super($dummy, $T);
        x10.util.ArrayList.$initParams(this, $T);
        
    }
    
    // dispatcher for method abstract public x10.util.Container[T].contains(y:T){}:x10.lang.Boolean
    public java.lang.Object contains(final java.lang.Object a1, final x10.rtt.Type t1) {
        return x10.core.Boolean.$box(contains__0x10$util$ArrayList$$T$O(($T)a1));
        
    }
    
    // dispatcher for method abstract public x10.util.Container[T].contains(y:T){}:x10.lang.Boolean
    public boolean contains$Z(final java.lang.Object a1, final x10.rtt.Type t1) {
        return contains__0x10$util$ArrayList$$T$O(($T)a1);
        
    }
    
    // dispatcher for method abstract public x10.util.Collection[T].add(v:T){}:x10.lang.Boolean
    public java.lang.Object add(final java.lang.Object a1, final x10.rtt.Type t1) {
        return x10.core.Boolean.$box(add__0x10$util$ArrayList$$T$O(($T)a1));
        
    }
    
    // dispatcher for method abstract public x10.util.Collection[T].add(v:T){}:x10.lang.Boolean
    public boolean add$Z(final java.lang.Object a1, final x10.rtt.Type t1) {
        return add__0x10$util$ArrayList$$T$O(($T)a1);
        
    }
    
    // dispatcher for method abstract public x10.util.Collection[T].remove(v:T){}:x10.lang.Boolean
    public java.lang.Object remove(final java.lang.Object a1, final x10.rtt.Type t1) {
        return x10.core.Boolean.$box(remove__0x10$util$ArrayList$$T$O(($T)a1));
        
    }
    
    // dispatcher for method abstract public x10.util.Collection[T].remove(v:T){}:x10.lang.Boolean
    public boolean remove$Z(final java.lang.Object a1, final x10.rtt.Type t1) {
        return remove__0x10$util$ArrayList$$T$O(($T)a1);
        
    }
    
    // dispatcher for method abstract public x10.util.List[T].addBefore(i:x10.lang.Long, v:T){}:void
    public java.lang.Object addBefore(final long a1, final java.lang.Object a2, final x10.rtt.Type t2) {
        addBefore__1x10$util$ArrayList$$T(a1, ($T)a2); return null;
        
    }
    
    // dispatcher for method abstract public x10.util.List[T].addBefore(i:x10.lang.Long, v:T){}:void
    public void addBefore$V(final long a1, final java.lang.Object a2, final x10.rtt.Type t2) {
        addBefore__1x10$util$ArrayList$$T(a1, ($T)a2);
        
    }
    
    // dispatcher for method abstract public x10.lang.Settable[I, V].operator()=(i:I, v:V){}:V
    public java.lang.Object $set(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
        return $set__1x10$util$ArrayList$$T$G(x10.core.Long.$unbox(a1), ($T)a2);
        
    }
    
    // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1){}:U
    public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
        return $apply$G(x10.core.Long.$unbox(a1));
        
    }
    
    // dispatcher for method abstract public x10.util.List[T].indexOf(v:T){}:x10.lang.Long
    public java.lang.Object indexOf(final java.lang.Object a1, final x10.rtt.Type t1) {
        return x10.core.Long.$box(indexOf__0x10$util$ArrayList$$T$O(($T)a1));
        
    }
    
    // dispatcher for method abstract public x10.util.List[T].indexOf(v:T){}:x10.lang.Long
    public long indexOf$J(final java.lang.Object a1, final x10.rtt.Type t1) {
        return indexOf__0x10$util$ArrayList$$T$O(($T)a1);
        
    }
    
    // dispatcher for method abstract public x10.util.List[T].indexOf(index:x10.lang.Long, v:T){}:x10.lang.Long
    public java.lang.Object indexOf(final long a1, final java.lang.Object a2, final x10.rtt.Type t2) {
        return x10.core.Long.$box(indexOf__1x10$util$ArrayList$$T$O(a1, ($T)a2));
        
    }
    
    // dispatcher for method abstract public x10.util.List[T].indexOf(index:x10.lang.Long, v:T){}:x10.lang.Long
    public long indexOf$J(final long a1, final java.lang.Object a2, final x10.rtt.Type t2) {
        return indexOf__1x10$util$ArrayList$$T$O(a1, ($T)a2);
        
    }
    
    // dispatcher for method abstract public x10.util.List[T].lastIndexOf(v:T){}:x10.lang.Long
    public java.lang.Object lastIndexOf(final java.lang.Object a1, final x10.rtt.Type t1) {
        return x10.core.Long.$box(lastIndexOf__0x10$util$ArrayList$$T$O(($T)a1));
        
    }
    
    // dispatcher for method abstract public x10.util.List[T].lastIndexOf(v:T){}:x10.lang.Long
    public long lastIndexOf$J(final java.lang.Object a1, final x10.rtt.Type t1) {
        return lastIndexOf__0x10$util$ArrayList$$T$O(($T)a1);
        
    }
    
    // dispatcher for method abstract public x10.util.List[T].lastIndexOf(index:x10.lang.Long, v:T){}:x10.lang.Long
    public java.lang.Object lastIndexOf(final long a1, final java.lang.Object a2, final x10.rtt.Type t2) {
        return x10.core.Long.$box(lastIndexOf__1x10$util$ArrayList$$T$O(a1, ($T)a2));
        
    }
    
    // dispatcher for method abstract public x10.util.List[T].lastIndexOf(index:x10.lang.Long, v:T){}:x10.lang.Long
    public long lastIndexOf$J(final long a1, final java.lang.Object a2, final x10.rtt.Type t2) {
        return lastIndexOf__1x10$util$ArrayList$$T$O(a1, ($T)a2);
        
    }
    
    // dispatcher for method abstract public x10.util.List[T].sort(cmp:(T,T)=>x10.lang.Int){}:void
    public java.lang.Object sort(final x10.core.fun.Fun_0_2 a1, final x10.rtt.Type t1) {
        sort__0$1x10$util$ArrayList$$T$3x10$util$ArrayList$$T$3x10$lang$Int$2((x10.core.fun.Fun_0_2)a1); return null;
        
    }
    
    // dispatcher for method abstract public x10.util.List[T].sort(cmp:(T,T)=>x10.lang.Int){}:void
    public void sort$V(final x10.core.fun.Fun_0_2 a1, final x10.rtt.Type t1) {
        sort__0$1x10$util$ArrayList$$T$3x10$util$ArrayList$$T$3x10$lang$Int$2((x10.core.fun.Fun_0_2)a1);
        
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
        return contains__0x10$util$ArrayList$$T$O(a1);
    }
    
    // bridge for method abstract public x10.util.AbstractCollection[T].add(v:T){}:x10.lang.Boolean
    public boolean add__0x10$util$AbstractCollection$$T$O($T a1) {
        return add__0x10$util$ArrayList$$T$O(a1);
    }
    
    // bridge for method abstract public x10.util.AbstractCollection[T].remove(v:T){}:x10.lang.Boolean
    public boolean remove__0x10$util$AbstractCollection$$T$O($T a1) {
        return remove__0x10$util$ArrayList$$T$O(a1);
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final ArrayList $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    

    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public x10.util.GrowableRail<$T> a;
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public static <$T>x10.util.ArrayList make__0$1x10$util$ArrayList$$T$2(final x10.rtt.Type $T, final x10.util.Container<$T> c) {
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.ArrayList a = ((x10.util.ArrayList)(new x10.util.ArrayList<$T>((java.lang.System[]) null, $T)));
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        a.x10$util$ArrayList$$init$S();
        
        //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        ((x10.util.AbstractCollection<$T>)a).addAll__0$1x10$util$AbstractCollection$$T$2$O(((x10.util.Container)(c)));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return a;
    }
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public boolean contains__0x10$util$ArrayList$$T$O(final $T v) {
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.GrowableRail this$135922 = ((x10.util.GrowableRail)(a));
        
        //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$135923 = ((x10.util.GrowableRail<$T>)this$135922).size;
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final long i$80983max$135924 = ((t$135923) - (((long)(1L))));
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        long i$135919 = 0L;
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        for (;
             true;
             ) {
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135920 = i$135919;
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final boolean t$135921 = ((t$135920) <= (((long)(i$80983max$135924))));
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            if (!(t$135921)) {
                
                //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                break;
            }
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long i$135916 = i$135919;
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final boolean t$135905 = ((v) == (null));
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            boolean t$135906 =  false;
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            if (t$135905) {
                
                //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                final x10.util.GrowableRail this$135907 = ((x10.util.GrowableRail)(a));
                
                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long idx$135908 = i$135916;
                
                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                $T ret$135909 =  null;
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final x10.core.Rail t$135901 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$135907).data));
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final $T t$135902 = (($T)(((x10.core.Rail<$T>)t$135901).$apply$G((long)(idx$135908))));
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                ret$135909 = (($T)(t$135902));
                
                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final $T t$135910 = (($T)(ret$135909));
                
                //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                t$135906 = ((t$135910) == (null));
            } else {
                
                //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                final x10.util.GrowableRail this$135911 = ((x10.util.GrowableRail)(a));
                
                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long idx$135912 = i$135916;
                
                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                $T ret$135913 =  null;
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final x10.core.Rail t$135903 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$135911).data));
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final $T t$135904 = (($T)(((x10.core.Rail<$T>)t$135903).$apply$G((long)(idx$135912))));
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                ret$135913 = (($T)(t$135904));
                
                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final $T t$135914 = (($T)(ret$135913));
                
                //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                t$135906 = ((java.lang.Object)(((java.lang.Object)(v)))).equals(t$135914);
            }
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final boolean t$135915 = t$135906;
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            if (t$135915) {
                
                //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                return true;
            }
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135917 = i$135919;
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135918 = ((t$135917) + (((long)(1L))));
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            i$135919 = t$135918;
        }
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return false;
    }
    
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public void clear() {
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.GrowableRail this$135537 = ((x10.util.GrowableRail)(a));
        
        //#line 181 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$135925 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$135537).data));
        
        //#line 181 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        (t$135925).clear();
        
        //#line 182 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ((x10.util.GrowableRail<$T>)this$135537).size = 0L;
    }
    
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public x10.util.ArrayList clone() {
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.ArrayList a = ((x10.util.ArrayList)(new x10.util.ArrayList<$T>((java.lang.System[]) null, $T)));
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        a.x10$util$ArrayList$$init$S();
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        ((x10.util.AbstractCollection<$T>)a).addAll__0$1x10$util$AbstractCollection$$T$2$O(((x10.util.Container)(this)));
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return a;
    }
    
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public boolean add__0x10$util$ArrayList$$T$O(final $T v) {
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.GrowableRail t$135691 = ((x10.util.GrowableRail)(a));
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        ((x10.util.GrowableRail<$T>)t$135691).add__0x10$util$GrowableRail$$T((($T)(v)));
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return true;
    }
    
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public boolean remove__0x10$util$ArrayList$$T$O(final $T v) {
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.GrowableRail this$135947 = ((x10.util.GrowableRail)(a));
        
        //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$135948 = ((x10.util.GrowableRail<$T>)this$135947).size;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final long i$81001max$135949 = ((t$135948) - (((long)(1L))));
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        long i$135944 = 0L;
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        for (;
             true;
             ) {
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135945 = i$135944;
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final boolean t$135946 = ((t$135945) <= (((long)(i$81001max$135949))));
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            if (!(t$135946)) {
                
                //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                break;
            }
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long i$135941 = i$135944;
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final boolean t$135930 = ((v) == (null));
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            boolean t$135931 =  false;
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            if (t$135930) {
                
                //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                final x10.util.GrowableRail this$135932 = ((x10.util.GrowableRail)(a));
                
                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long idx$135933 = i$135941;
                
                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                $T ret$135934 =  null;
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final x10.core.Rail t$135926 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$135932).data));
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final $T t$135927 = (($T)(((x10.core.Rail<$T>)t$135926).$apply$G((long)(idx$135933))));
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                ret$135934 = (($T)(t$135927));
                
                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final $T t$135935 = (($T)(ret$135934));
                
                //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                t$135931 = ((t$135935) == (null));
            } else {
                
                //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                final x10.util.GrowableRail this$135936 = ((x10.util.GrowableRail)(a));
                
                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long idx$135937 = i$135941;
                
                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                $T ret$135938 =  null;
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final x10.core.Rail t$135928 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$135936).data));
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final $T t$135929 = (($T)(((x10.core.Rail<$T>)t$135928).$apply$G((long)(idx$135937))));
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                ret$135938 = (($T)(t$135929));
                
                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final $T t$135939 = (($T)(ret$135938));
                
                //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                t$135931 = ((java.lang.Object)(((java.lang.Object)(v)))).equals(t$135939);
            }
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final boolean t$135940 = t$135931;
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            if (t$135940) {
                
                //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                this.removeAt$G((long)(i$135941));
                
                //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                return true;
            }
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135942 = i$135944;
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135943 = ((t$135942) + (((long)(1L))));
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            i$135944 = t$135943;
        }
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return false;
    }
    
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public void addBefore__1x10$util$ArrayList$$T(final long i, final $T v) {
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.GrowableRail t$135707 = ((x10.util.GrowableRail)(a));
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        ((x10.util.GrowableRail<$T>)t$135707).add__0x10$util$GrowableRail$$T((($T)(v)));
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.GrowableRail this$135964 = ((x10.util.GrowableRail)(a));
        
        //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$135965 = ((x10.util.GrowableRail<$T>)this$135964).size;
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        long j$135966 = ((t$135965) - (((long)(1L))));
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        for (;
             true;
             ) {
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135967 = j$135966;
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final boolean t$135968 = ((t$135967) > (((long)(i))));
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            if (!(t$135968)) {
                
                //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                break;
            }
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final x10.util.GrowableRail this$135955 = ((x10.util.GrowableRail)(a));
            
            //#line 120 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long idx$135956 = j$135966;
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final x10.util.GrowableRail this$135957 = ((x10.util.GrowableRail)(a));
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135958 = j$135966;
            
            //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long idx$135959 = ((t$135958) - (((long)(1L))));
            
            //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            $T ret$135960 =  null;
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.core.Rail t$135950 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$135957).data));
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final $T t$135951 = (($T)(((x10.core.Rail<$T>)t$135950).$apply$G((long)(idx$135959))));
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ret$135960 = (($T)(t$135951));
            
            //#line 120 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final $T v$135961 = (($T)(ret$135960));
            
            //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$135952 = ((x10.util.GrowableRail<$T>)this$135955).size;
            
            //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final boolean t$135953 = ((long) idx$135956) == ((long) t$135952);
            
            //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            if (t$135953) {
                
                //#line 123 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                ((x10.util.GrowableRail<$T>)this$135955).add__0x10$util$GrowableRail$$T((($T)(v$135961)));
            } else {
                
                //#line 125 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final x10.core.Rail t$135954 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$135955).data));
                
                //#line 125 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                ((x10.core.Rail<$T>)t$135954).$set__1x10$lang$Rail$$T$G((long)(idx$135956), (($T)(v$135961)));
            }
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135962 = j$135966;
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135963 = ((t$135962) - (((long)(1L))));
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            j$135966 = t$135963;
        }
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.GrowableRail this$135561 = ((x10.util.GrowableRail)(a));
        
        //#line 120 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long idx$135559 = i;
        
        //#line 120 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final $T v$135560 = (($T)(v));
        
        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$135969 = ((x10.util.GrowableRail<$T>)this$135561).size;
        
        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final boolean t$135970 = ((long) idx$135559) == ((long) t$135969);
        
        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        if (t$135970) {
            
            //#line 123 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ((x10.util.GrowableRail<$T>)this$135561).add__0x10$util$GrowableRail$$T((($T)(v$135560)));
        } else {
            
            //#line 125 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.core.Rail t$135971 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$135561).data));
            
            //#line 125 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ((x10.core.Rail<$T>)t$135971).$set__1x10$lang$Rail$$T$G((long)(idx$135559), (($T)(v$135560)));
        }
    }
    
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public $T $set__1x10$util$ArrayList$$T$G(final long i, final $T v) {
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final $T t$135723 = (($T)(this.set__0x10$util$ArrayList$$T$G((($T)(v)), (long)(i))));
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return t$135723;
    }
    
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public $T set__0x10$util$ArrayList$$T$G(final $T v, final long i) {
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.GrowableRail this$135566 = ((x10.util.GrowableRail)(a));
        
        //#line 120 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long idx$135564 = i;
        
        //#line 120 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final $T v$135565 = (($T)(v));
        
        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$135972 = ((x10.util.GrowableRail<$T>)this$135566).size;
        
        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final boolean t$135973 = ((long) idx$135564) == ((long) t$135972);
        
        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        if (t$135973) {
            
            //#line 123 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ((x10.util.GrowableRail<$T>)this$135566).add__0x10$util$GrowableRail$$T((($T)(v$135565)));
        } else {
            
            //#line 125 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.core.Rail t$135974 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$135566).data));
            
            //#line 125 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ((x10.core.Rail<$T>)t$135974).$set__1x10$lang$Rail$$T$G((long)(idx$135564), (($T)(v$135565)));
        }
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return v;
    }
    
    
    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public $T removeAt$G(final long i) {
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.GrowableRail this$135570 = ((x10.util.GrowableRail)(a));
        
        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long idx$135569 = i;
        
        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        $T ret$135571 =  null;
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$135989 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$135570).data));
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final $T t$135990 = (($T)(((x10.core.Rail<$T>)t$135989).$apply$G((long)(idx$135569))));
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ret$135571 = (($T)(t$135990));
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final $T v = (($T)(ret$135571));
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        long j$135991 = ((i) + (((long)(1L))));
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        for (;
             true;
             ) {
            
            //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135992 = j$135991;
            
            //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final x10.util.GrowableRail this$135993 = ((x10.util.GrowableRail)(a));
            
            //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$135994 = ((x10.util.GrowableRail<$T>)this$135993).size;
            
            //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final boolean t$135995 = ((t$135992) < (((long)(t$135994))));
            
            //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            if (!(t$135995)) {
                
                //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                break;
            }
            
            //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final x10.util.GrowableRail this$135980 = ((x10.util.GrowableRail)(a));
            
            //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135981 = j$135991;
            
            //#line 120 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long idx$135982 = ((t$135981) - (((long)(1L))));
            
            //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final x10.util.GrowableRail this$135983 = ((x10.util.GrowableRail)(a));
            
            //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long idx$135984 = j$135991;
            
            //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            $T ret$135985 =  null;
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.core.Rail t$135975 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$135983).data));
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final $T t$135976 = (($T)(((x10.core.Rail<$T>)t$135975).$apply$G((long)(idx$135984))));
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ret$135985 = (($T)(t$135976));
            
            //#line 120 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final $T v$135986 = (($T)(ret$135985));
            
            //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$135977 = ((x10.util.GrowableRail<$T>)this$135980).size;
            
            //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final boolean t$135978 = ((long) idx$135982) == ((long) t$135977);
            
            //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            if (t$135978) {
                
                //#line 123 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                ((x10.util.GrowableRail<$T>)this$135980).add__0x10$util$GrowableRail$$T((($T)(v$135986)));
            } else {
                
                //#line 125 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final x10.core.Rail t$135979 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$135980).data));
                
                //#line 125 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                ((x10.core.Rail<$T>)t$135979).$set__1x10$lang$Rail$$T$G((long)(idx$135982), (($T)(v$135986)));
            }
            
            //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135987 = j$135991;
            
            //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135988 = ((t$135987) + (((long)(1L))));
            
            //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            j$135991 = t$135988;
        }
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.GrowableRail t$135741 = ((x10.util.GrowableRail)(a));
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        ((x10.util.GrowableRail<$T>)t$135741).removeLast$G();
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return v;
    }
    
    
    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public $T $apply$G(final long i) {
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.GrowableRail this$135584 = ((x10.util.GrowableRail)(a));
        
        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long idx$135583 = i;
        
        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        $T ret$135585 =  null;
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$135996 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$135584).data));
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final $T t$135997 = (($T)(((x10.core.Rail<$T>)t$135996).$apply$G((long)(idx$135583))));
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ret$135585 = (($T)(t$135997));
        
        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final $T t$135744 = (($T)(ret$135585));
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return t$135744;
    }
    
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public $T get$G(final long i) {
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.GrowableRail this$135588 = ((x10.util.GrowableRail)(a));
        
        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long idx$135587 = i;
        
        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        $T ret$135589 =  null;
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$135998 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$135588).data));
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final $T t$135999 = (($T)(((x10.core.Rail<$T>)t$135998).$apply$G((long)(idx$135587))));
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ret$135589 = (($T)(t$135999));
        
        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final $T t$135747 = (($T)(ret$135589));
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return t$135747;
    }
    
    
    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public long size$O() {
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.GrowableRail this$135591 = ((x10.util.GrowableRail)(a));
        
        //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$135748 = ((x10.util.GrowableRail<$T>)this$135591).size;
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return t$135748;
    }
    
    
    //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public boolean isEmpty$O() {
        
        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final long t$135749 = this.size$O();
        
        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final boolean t$135750 = ((long) t$135749) == ((long) 0L);
        
        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return t$135750;
    }
    
    
    //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public x10.core.Rail toRail() {
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.GrowableRail t$135751 = ((x10.util.GrowableRail)(a));
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.core.Rail t$135752 = ((x10.core.Rail<$T>)
                                         ((x10.util.GrowableRail<$T>)t$135751).toRail());
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return t$135752;
    }
    
    
    //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    // creation method for java code (1-phase java constructor)
    public ArrayList(final x10.rtt.Type $T) {
        this((java.lang.System[]) null, $T);
        x10$util$ArrayList$$init$S();
    }
    
    // constructor for non-virtual call
    final public x10.util.ArrayList<$T> x10$util$ArrayList$$init$S() {
         {
            
            //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            /*super.*/x10$util$AbstractCollection$$init$S();
            
            //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            
            
            //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final x10.util.ArrayList this$136000 = this;
            
            //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final x10.util.GrowableRail alloc$80978 = ((x10.util.GrowableRail)(new x10.util.GrowableRail<$T>((java.lang.System[]) null, $T)));
            
            //#line 50 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            alloc$80978.x10$util$GrowableRail$$init$S(((long)(0L)));
            
            //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            ((x10.util.ArrayList<$T>)this).a = ((x10.util.GrowableRail)(alloc$80978));
        }
        return this;
    }
    
    
    
    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    // creation method for java code (1-phase java constructor)
    public ArrayList(final x10.rtt.Type $T, final long size) {
        this((java.lang.System[]) null, $T);
        x10$util$ArrayList$$init$S(size);
    }
    
    // constructor for non-virtual call
    final public x10.util.ArrayList<$T> x10$util$ArrayList$$init$S(final long size) {
         {
            
            //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            /*super.*/x10$util$AbstractCollection$$init$S();
            
            //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            
            
            //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final x10.util.ArrayList this$136001 = this;
            
            //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final x10.util.GrowableRail alloc$80979 = ((x10.util.GrowableRail)(new x10.util.GrowableRail<$T>((java.lang.System[]) null, $T)));
            
            //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            alloc$80979.x10$util$GrowableRail$$init$S(((long)(size)));
            
            //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            ((x10.util.ArrayList<$T>)this).a = ((x10.util.GrowableRail)(alloc$80979));
        }
        return this;
    }
    
    
    
    //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public $T removeFirst$G() {
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final $T t$135753 = (($T)(this.removeAt$G((long)(0L))));
        
        //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return t$135753;
    }
    
    
    //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public $T removeLast$G() {
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.GrowableRail this$135599 = ((x10.util.GrowableRail)(a));
        
        //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$135754 = ((x10.util.GrowableRail<$T>)this$135599).size;
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final long t$135755 = ((t$135754) - (((long)(1L))));
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final $T t$135756 = (($T)(this.removeAt$G((long)(t$135755))));
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return t$135756;
    }
    
    
    //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public $T getFirst$G() {
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final $T t$135757 = (($T)(this.get$G((long)(0L))));
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return t$135757;
    }
    
    
    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public $T getLast$G() {
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.GrowableRail this$135600 = ((x10.util.GrowableRail)(a));
        
        //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$135758 = ((x10.util.GrowableRail<$T>)this$135600).size;
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final long t$135759 = ((t$135758) - (((long)(1L))));
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final $T t$135760 = (($T)(this.get$G((long)(t$135759))));
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return t$135760;
    }
    
    
    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public x10.util.List indices() {
        
        //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.ArrayList l = ((x10.util.ArrayList)(new x10.util.ArrayList<x10.core.Long>((java.lang.System[]) null, x10.rtt.Types.LONG)));
        
        //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        l.x10$util$ArrayList$$init$S();
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.GrowableRail this$136008 = ((x10.util.GrowableRail)(a));
        
        //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136009 = ((x10.util.GrowableRail<$T>)this$136008).size;
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final long i$81019max$136010 = ((t$136009) - (((long)(1L))));
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        long i$136005 = 0L;
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        for (;
             true;
             ) {
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$136006 = i$136005;
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final boolean t$136007 = ((t$136006) <= (((long)(i$81019max$136010))));
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            if (!(t$136007)) {
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                break;
            }
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long i$136002 = i$136005;
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            ((x10.util.ArrayList<x10.core.Long>)l).add__0x10$util$ArrayList$$T$O(x10.core.Long.$box(i$136002));
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$136003 = i$136005;
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$136004 = ((t$136003) + (((long)(1L))));
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            i$136005 = t$136004;
        }
        
        //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return l;
    }
    
    
    //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public x10.util.List subList(final long begin, final long end) {
        
        //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.ArrayList l = ((x10.util.ArrayList)(new x10.util.ArrayList<$T>((java.lang.System[]) null, $T)));
        
        //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        l.x10$util$ArrayList$$init$S();
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        long i$136019 = begin;
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        for (;
             true;
             ) {
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$136020 = i$136019;
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final x10.util.GrowableRail this$136021 = ((x10.util.GrowableRail)(a));
            
            //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136022 = ((x10.util.GrowableRail<$T>)this$136021).size;
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            boolean t$136023 = ((t$136020) < (((long)(t$136022))));
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            if (t$136023) {
                
                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                final long t$136024 = i$136019;
                
                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                t$136023 = ((t$136024) < (((long)(end))));
            }
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final boolean t$136025 = t$136023;
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            if (!(t$136025)) {
                
                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                break;
            }
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final x10.util.GrowableRail this$136013 = ((x10.util.GrowableRail)(a));
            
            //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long idx$136014 = i$136019;
            
            //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            $T ret$136015 =  null;
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.core.Rail t$136011 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$136013).data));
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final $T t$136012 = (($T)(((x10.core.Rail<$T>)t$136011).$apply$G((long)(idx$136014))));
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ret$136015 = (($T)(t$136012));
            
            //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final $T t$136016 = (($T)(ret$136015));
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            ((x10.util.ArrayList<$T>)l).add__0x10$util$ArrayList$$T$O((($T)(t$136016)));
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$136017 = i$136019;
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$136018 = ((t$136017) + (((long)(1L))));
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            i$136019 = t$136018;
        }
        
        //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return l;
    }
    
    
    //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public long indexOf__0x10$util$ArrayList$$T$O(final $T v) {
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final long t$135778 = this.indexOf__1x10$util$ArrayList$$T$O((long)(0L), (($T)(v)));
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return t$135778;
    }
    
    
    //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public long indexOf__1x10$util$ArrayList$$T$O(final long index, final $T v) {
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        long i$136044 = index;
        
        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        for (;
             true;
             ) {
            
            //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$136045 = i$136044;
            
            //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final x10.util.GrowableRail this$136046 = ((x10.util.GrowableRail)(a));
            
            //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long t$136047 = ((x10.util.GrowableRail<$T>)this$136046).size;
            
            //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final boolean t$136048 = ((t$136045) < (((long)(t$136047))));
            
            //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            if (!(t$136048)) {
                
                //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                break;
            }
            
            //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final boolean t$136030 = ((v) == (null));
            
            //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            boolean t$136031 =  false;
            
            //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            if (t$136030) {
                
                //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                final x10.util.GrowableRail this$136032 = ((x10.util.GrowableRail)(a));
                
                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long idx$136033 = i$136044;
                
                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                $T ret$136034 =  null;
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final x10.core.Rail t$136026 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$136032).data));
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final $T t$136027 = (($T)(((x10.core.Rail<$T>)t$136026).$apply$G((long)(idx$136033))));
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                ret$136034 = (($T)(t$136027));
                
                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final $T t$136035 = (($T)(ret$136034));
                
                //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                t$136031 = ((t$136035) == (null));
            } else {
                
                //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                final x10.util.GrowableRail this$136036 = ((x10.util.GrowableRail)(a));
                
                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long idx$136037 = i$136044;
                
                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                $T ret$136038 =  null;
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final x10.core.Rail t$136028 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$136036).data));
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final $T t$136029 = (($T)(((x10.core.Rail<$T>)t$136028).$apply$G((long)(idx$136037))));
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                ret$136038 = (($T)(t$136029));
                
                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final $T t$136039 = (($T)(ret$136038));
                
                //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                t$136031 = ((java.lang.Object)(((java.lang.Object)(v)))).equals(t$136039);
            }
            
            //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final boolean t$136040 = t$136031;
            
            //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            if (t$136040) {
                
                //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                final long t$136041 = i$136044;
                
                //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                return t$136041;
            }
            
            //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$136042 = i$136044;
            
            //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$136043 = ((t$136042) + (((long)(1L))));
            
            //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            i$136044 = t$136043;
        }
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return -1L;
    }
    
    
    //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public long lastIndexOf__0x10$util$ArrayList$$T$O(final $T v) {
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.GrowableRail this$135616 = ((x10.util.GrowableRail)(a));
        
        //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$135795 = ((x10.util.GrowableRail<$T>)this$135616).size;
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final long t$135796 = ((t$135795) - (((long)(1L))));
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final long t$135797 = this.lastIndexOf__1x10$util$ArrayList$$T$O((long)(t$135796), (($T)(v)));
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return t$135797;
    }
    
    
    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public long lastIndexOf__1x10$util$ArrayList$$T$O(final long index, final $T v) {
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        long i$136067 = index;
        
        //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        for (;
             true;
             ) {
            
            //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$136068 = i$136067;
            
            //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final boolean t$136069 = ((t$136068) >= (((long)(0L))));
            
            //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            if (!(t$136069)) {
                
                //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                break;
            }
            
            //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final boolean t$136053 = ((v) == (null));
            
            //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            boolean t$136054 =  false;
            
            //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            if (t$136053) {
                
                //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                final x10.util.GrowableRail this$136055 = ((x10.util.GrowableRail)(a));
                
                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long idx$136056 = i$136067;
                
                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                $T ret$136057 =  null;
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final x10.core.Rail t$136049 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$136055).data));
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final $T t$136050 = (($T)(((x10.core.Rail<$T>)t$136049).$apply$G((long)(idx$136056))));
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                ret$136057 = (($T)(t$136050));
                
                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final $T t$136058 = (($T)(ret$136057));
                
                //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                t$136054 = ((t$136058) == (null));
            } else {
                
                //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                final x10.util.GrowableRail this$136059 = ((x10.util.GrowableRail)(a));
                
                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final long idx$136060 = i$136067;
                
                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                $T ret$136061 =  null;
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final x10.core.Rail t$136051 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$136059).data));
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final $T t$136052 = (($T)(((x10.core.Rail<$T>)t$136051).$apply$G((long)(idx$136060))));
                
                //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                ret$136061 = (($T)(t$136052));
                
                //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                final $T t$136062 = (($T)(ret$136061));
                
                //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                t$136054 = ((java.lang.Object)(((java.lang.Object)(v)))).equals(t$136062);
            }
            
            //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final boolean t$136063 = t$136054;
            
            //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            if (t$136063) {
                
                //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                final long t$136064 = i$136067;
                
                //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                return t$136064;
            }
            
            //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$136065 = i$136067;
            
            //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$136066 = ((t$136065) - (((long)(1L))));
            
            //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            i$136067 = t$136066;
        }
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return -1L;
    }
    
    
    //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public x10.core.Rail moveSectionToRail(final long i, final long j) {
        
        //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.GrowableRail t$135813 = ((x10.util.GrowableRail)(a));
        
        //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.core.Rail t$135814 = ((x10.core.Rail<$T>)
                                         ((x10.util.GrowableRail<$T>)t$135813).moveSectionToRail((long)(i), (long)(j)));
        
        //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return t$135814;
    }
    
    
    //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    @x10.runtime.impl.java.X10Generated
    public static class It<$S> extends x10.core.Ref implements x10.util.ListIterator, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<It> $RTT = 
            x10.rtt.NamedType.<It> make("x10.util.ArrayList.It",
                                        It.class,
                                        1,
                                        new x10.rtt.Type[] {
                                            x10.rtt.ParameterizedType.make(x10.util.ListIterator.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                        });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $S; return null; }
        
        public static <$S> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.ArrayList.It<$S> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$S = (x10.rtt.Type) $deserializer.readObject();
            $_obj.i = $deserializer.readLong();
            $_obj.al = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.ArrayList.It $_obj = new x10.util.ArrayList.It((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$S);
            $serializer.write(this.i);
            $serializer.write(this.al);
            
        }
        
        // constructor just for allocation
        public It(final java.lang.System[] $dummy, final x10.rtt.Type $S) {
            x10.util.ArrayList.It.$initParams(this, $S);
            
        }
        
        // dispatcher for method abstract public x10.util.ListIterator[T].set(v:T){}:void
        public java.lang.Object set(final java.lang.Object a1, final x10.rtt.Type t1) {
            set__0x10$util$ArrayList$It$$S(($S)a1); return null;
            
        }
        
        // dispatcher for method abstract public x10.util.ListIterator[T].set(v:T){}:void
        public void set$V(final java.lang.Object a1, final x10.rtt.Type t1) {
            set__0x10$util$ArrayList$It$$S(($S)a1);
            
        }
        
        // dispatcher for method abstract public x10.util.ListIterator[T].add(v:T){}:void
        public java.lang.Object add(final java.lang.Object a1, final x10.rtt.Type t1) {
            add__0x10$util$ArrayList$It$$S(($S)a1); return null;
            
        }
        
        // dispatcher for method abstract public x10.util.ListIterator[T].add(v:T){}:void
        public void add$V(final java.lang.Object a1, final x10.rtt.Type t1) {
            add__0x10$util$ArrayList$It$$S(($S)a1);
            
        }
        
        private x10.rtt.Type $S;
        
        // initializer of type parameters
        public static void $initParams(final It $this, final x10.rtt.Type $S) {
            $this.$S = $S;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$util$ArrayList$It$$S$2 {}
        
    
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        public long i;
        
        //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        public x10.util.ArrayList<$S> al;
        
        
        //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        // creation method for java code (1-phase java constructor)
        public It(final x10.rtt.Type $S, final x10.util.ArrayList<$S> al, __0$1x10$util$ArrayList$It$$S$2 $dummy) {
            this((java.lang.System[]) null, $S);
            x10$util$ArrayList$It$$init$S(al, (x10.util.ArrayList.It.__0$1x10$util$ArrayList$It$$S$2) null);
        }
        
        // constructor for non-virtual call
        final public x10.util.ArrayList.It<$S> x10$util$ArrayList$It$$init$S(final x10.util.ArrayList<$S> al, __0$1x10$util$ArrayList$It$$S$2 $dummy) {
             {
                
                //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                final x10.util.ArrayList.It this$135627 = this;
                
                //#line 161 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                final x10.util.ArrayList al$135625 = ((x10.util.ArrayList)(al));
                
                //#line 152 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                ((x10.util.ArrayList.It<$S>)this$135627).i = 0L;
                
                //#line 162 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                ((x10.util.ArrayList.It<$S>)this$135627).al = ((x10.util.ArrayList)(al$135625));
                
                //#line 163 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                ((x10.util.ArrayList.It<$S>)this$135627).i = -1L;
            }
            return this;
        }
        
        
        
        //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        // creation method for java code (1-phase java constructor)
        public It(final x10.rtt.Type $S, final x10.util.ArrayList<$S> al, final long i, __0$1x10$util$ArrayList$It$$S$2 $dummy) {
            this((java.lang.System[]) null, $S);
            x10$util$ArrayList$It$$init$S(al, i, (x10.util.ArrayList.It.__0$1x10$util$ArrayList$It$$S$2) null);
        }
        
        // constructor for non-virtual call
        final public x10.util.ArrayList.It<$S> x10$util$ArrayList$It$$init$S(final x10.util.ArrayList<$S> al, final long i, __0$1x10$util$ArrayList$It$$S$2 $dummy) {
             {
                
                //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                
                
                //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                final x10.util.ArrayList.It this$136070 = this;
                
                //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                ((x10.util.ArrayList.It<$S>)this$136070).i = 0L;
                
                //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                ((x10.util.ArrayList.It<$S>)this).al = ((x10.util.ArrayList)(al));
                
                //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                ((x10.util.ArrayList.It<$S>)this).i = i;
            }
            return this;
        }
        
        
        
        //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        public boolean hasNext$O() {
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135815 = i;
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135817 = ((t$135815) + (((long)(1L))));
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final x10.util.ArrayList t$135816 = ((x10.util.ArrayList)(al));
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135818 = ((x10.util.ArrayList<$S>)t$135816).size$O();
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final boolean t$135819 = ((t$135817) < (((long)(t$135818))));
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            return t$135819;
        }
        
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        public long nextIndex$O() {
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135820 = this.i;
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135821 = ((t$135820) + (((long)(1L))));
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135822 = ((x10.util.ArrayList.It<$S>)this).i = t$135821;
            
            //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            return t$135822;
        }
        
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        public $S next$G() {
            
            //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final x10.util.ArrayList t$135823 = ((x10.util.ArrayList)(al));
            
            //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final x10.util.GrowableRail this$135635 = ((x10.util.GrowableRail)(((x10.util.ArrayList<$S>)t$135823).a));
            
            //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135824 = this.i;
            
            //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135825 = ((t$135824) + (((long)(1L))));
            
            //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long idx$135634 = ((x10.util.ArrayList.It<$S>)this).i = t$135825;
            
            //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            $S ret$135636 =  null;
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.core.Rail t$136071 = ((x10.core.Rail)(((x10.util.GrowableRail<$S>)this$135635).data));
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final $S t$136072 = (($S)(((x10.core.Rail<$S>)t$136071).$apply$G((long)(idx$135634))));
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ret$135636 = (($S)(t$136072));
            
            //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final $S t$135828 = (($S)(ret$135636));
            
            //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            return t$135828;
        }
        
        
        //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        public boolean hasPrevious$O() {
            
            //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135829 = i;
            
            //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135830 = ((t$135829) - (((long)(1L))));
            
            //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final boolean t$135831 = ((t$135830) >= (((long)(0L))));
            
            //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            return t$135831;
        }
        
        
        //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        public long previousIndex$O() {
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135832 = this.i;
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135833 = ((t$135832) - (((long)(1L))));
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135834 = ((x10.util.ArrayList.It<$S>)this).i = t$135833;
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            return t$135834;
        }
        
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        public $S previous$G() {
            
            //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final x10.util.ArrayList t$135835 = ((x10.util.ArrayList)(al));
            
            //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final x10.util.GrowableRail this$135639 = ((x10.util.GrowableRail)(((x10.util.ArrayList<$S>)t$135835).a));
            
            //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135836 = this.i;
            
            //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135837 = ((t$135836) - (((long)(1L))));
            
            //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final long idx$135638 = ((x10.util.ArrayList.It<$S>)this).i = t$135837;
            
            //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            $S ret$135640 =  null;
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.core.Rail t$136073 = ((x10.core.Rail)(((x10.util.GrowableRail<$S>)this$135639).data));
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final $S t$136074 = (($S)(((x10.core.Rail<$S>)t$136073).$apply$G((long)(idx$135638))));
            
            //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ret$135640 = (($S)(t$136074));
            
            //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final $S t$135840 = (($S)(ret$135640));
            
            //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            return t$135840;
        }
        
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        public void remove() {
            
            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final x10.util.ArrayList t$135841 = ((x10.util.ArrayList)(al));
            
            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135842 = i;
            
            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            ((x10.util.ArrayList<$S>)t$135841).removeAt$G((long)(t$135842));
        }
        
        
        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        public void set__0x10$util$ArrayList$It$$S(final $S v) {
            
            //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final x10.util.ArrayList t$135843 = ((x10.util.ArrayList)(al));
            
            //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135844 = i;
            
            //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            ((x10.util.ArrayList<$S>)t$135843).set__0x10$util$ArrayList$$T$G((($S)(v)), (long)(t$135844));
        }
        
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        public void add__0x10$util$ArrayList$It$$S(final $S v) {
            
            //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final x10.util.ArrayList t$135845 = ((x10.util.ArrayList)(al));
            
            //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135846 = i;
            
            //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            ((x10.util.ArrayList<$S>)t$135845).addBefore__1x10$util$ArrayList$$T((long)(t$135846), (($S)(v)));
        }
        
        
        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final public x10.util.ArrayList.It x10$util$ArrayList$It$$this$x10$util$ArrayList$It() {
            
            //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            return x10.util.ArrayList.It.this;
        }
        
        
        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final public void __fieldInitializers_x10_util_ArrayList_It() {
            
            //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            ((x10.util.ArrayList.It<$S>)this).i = 0L;
        }
    }
    
    
    
    //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public x10.util.ListIterator iterator() {
        
        //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.ArrayList.It alloc$80980 = ((x10.util.ArrayList.It)(new x10.util.ArrayList.It<$T>((java.lang.System[]) null, $T)));
        
        //#line 157 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.ArrayList al$135642 = ((x10.util.ArrayList)(this));
        
        //#line 161 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.ArrayList al$136075 = ((x10.util.ArrayList)(al$135642));
        
        //#line 152 ... "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        ((x10.util.ArrayList.It<$T>)alloc$80980).i = 0L;
        
        //#line 162 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        ((x10.util.ArrayList.It<$T>)alloc$80980).al = ((x10.util.ArrayList)(al$136075));
        
        //#line 163 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        ((x10.util.ArrayList.It<$T>)alloc$80980).i = -1L;
        
        //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return alloc$80980;
    }
    
    
    //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public x10.util.ListIterator iteratorFrom(final long i) {
        
        //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.ArrayList.It alloc$80981 = ((x10.util.ArrayList.It)(new x10.util.ArrayList.It<$T>((java.lang.System[]) null, $T)));
        
        //#line 161 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.ArrayList al$135649 = ((x10.util.ArrayList)(this));
        
        //#line 161 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final long i$135650 = i;
        
        //#line 152 .. "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        ((x10.util.ArrayList.It<$T>)alloc$80981).i = 0L;
        
        //#line 162 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        ((x10.util.ArrayList.It<$T>)alloc$80981).al = ((x10.util.ArrayList)(al$135649));
        
        //#line 163 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        ((x10.util.ArrayList.It<$T>)alloc$80981).i = i$135650;
        
        //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return alloc$80981;
    }
    
    
    //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public void reverse() {
        
        //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.GrowableRail this$135654 = ((x10.util.GrowableRail)(a));
        
        //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final long length = ((x10.util.GrowableRail<$T>)this$135654).size;
        
        //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        long i$136083 = 0L;
        
        //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        for (;
             true;
             ) {
            
            //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$136084 = i$136083;
            
            //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$136085 = ((length) / (((long)(2L))));
            
            //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final boolean t$136086 = ((t$136084) < (((long)(t$136085))));
            
            //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            if (!(t$136086)) {
                
                //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                break;
            }
            
            //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final x10.util.GrowableRail t$136076 = ((x10.util.GrowableRail)(a));
            
            //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$136077 = i$136083;
            
            //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$136078 = ((length) - (((long)(1L))));
            
            //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$136079 = i$136083;
            
            //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$136080 = ((t$136078) - (((long)(t$136079))));
            
            //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            this.exch__0$1x10$util$ArrayList$$T$2(((x10.util.GrowableRail)(t$136076)), (long)(t$136077), (long)(t$136080));
            
            //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$136081 = i$136083;
            
            //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$136082 = ((t$136081) + (((long)(1L))));
            
            //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            i$136083 = t$136082;
        }
    }
    
    
    //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public void sort() {
        
        //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.core.fun.Fun_0_2 t$135860 = ((x10.core.fun.Fun_0_2)(new x10.util.ArrayList.$Closure$285<$T>($T)));
        
        //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        this.sort__0$1x10$util$ArrayList$$T$3x10$util$ArrayList$$T$3x10$lang$Int$2(((x10.core.fun.Fun_0_2)(t$135860)));
    }
    
    
    //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public void sort__0$1x10$util$ArrayList$$T$3x10$util$ArrayList$$T$3x10$lang$Int$2(final x10.core.fun.Fun_0_2 cmp) {
        
        //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.GrowableRail this$135655 = ((x10.util.GrowableRail)(a));
        
        //#line 35 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$135862 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$135655).data));
        
        //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.GrowableRail this$135656 = ((x10.util.GrowableRail)(a));
        
        //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$135861 = ((x10.util.GrowableRail<$T>)this$135656).size;
        
        //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final long t$135863 = ((t$135861) - (((long)(1L))));
        
        //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        x10.util.RailUtils.<$T> qsort__0$1x10$util$RailUtils$$T$2__3$1x10$util$RailUtils$$T$3x10$util$RailUtils$$T$3x10$lang$Int$2($T, ((x10.core.Rail)(t$135862)), (long)(0L), (long)(t$135863), ((x10.core.fun.Fun_0_2)(cmp)));
    }
    
    
    //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    private void exch__0$1x10$util$ArrayList$$T$2(final x10.util.GrowableRail a, final long i, final long j) {
        
        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long idx$135657 = i;
        
        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        $T ret$135658 =  null;
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$136087 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)a).data));
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final $T t$136088 = (($T)(((x10.core.Rail<$T>)t$136087).$apply$G((long)(idx$135657))));
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ret$135658 = (($T)(t$136088));
        
        //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final $T temp = (($T)(ret$135658));
        
        //#line 120 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long idx$135663 = i;
        
        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long idx$135660 = j;
        
        //#line 115 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        $T ret$135661 =  null;
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$136089 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)a).data));
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final $T t$136090 = (($T)(((x10.core.Rail<$T>)t$136089).$apply$G((long)(idx$135660))));
        
        //#line 117 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ret$135661 = (($T)(t$136090));
        
        //#line 120 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final $T v$135664 = (($T)(ret$135661));
        
        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136091 = ((x10.util.GrowableRail<$T>)a).size;
        
        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final boolean t$136092 = ((long) idx$135663) == ((long) t$136091);
        
        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        if (t$136092) {
            
            //#line 123 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ((x10.util.GrowableRail<$T>)a).add__0x10$util$GrowableRail$$T((($T)(v$135664)));
        } else {
            
            //#line 125 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.core.Rail t$136093 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)a).data));
            
            //#line 125 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ((x10.core.Rail<$T>)t$136093).$set__1x10$lang$Rail$$T$G((long)(idx$135663), (($T)(v$135664)));
        }
        
        //#line 120 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long idx$135667 = j;
        
        //#line 120 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final $T v$135668 = (($T)(temp));
        
        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$136094 = ((x10.util.GrowableRail<$T>)a).size;
        
        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final boolean t$136095 = ((long) idx$135667) == ((long) t$136094);
        
        //#line 122 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        if (t$136095) {
            
            //#line 123 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ((x10.util.GrowableRail<$T>)a).add__0x10$util$GrowableRail$$T((($T)(v$135668)));
        } else {
            
            //#line 125 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            final x10.core.Rail t$136096 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)a).data));
            
            //#line 125 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ((x10.core.Rail<$T>)t$136096).$set__1x10$lang$Rail$$T$G((long)(idx$135667), (($T)(v$135668)));
        }
    }
    
    public static <$T>void exch$P__0$1x10$util$ArrayList$$T$2__3$1x10$util$ArrayList$$T$2(final x10.rtt.Type $T, final x10.util.GrowableRail<$T> a, final long i, final long j, final x10.util.ArrayList<$T> ArrayList) {
        ((x10.util.ArrayList<$T>)ArrayList).exch__0$1x10$util$ArrayList$$T$2(((x10.util.GrowableRail)(a)), (long)(i), (long)(j));
    }
    
    
    //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public long binarySearch__0x10$util$ArrayList$$T__1$1x10$util$ArrayList$$T$3x10$util$ArrayList$$T$3x10$lang$Int$2$O(final $T key, final x10.core.fun.Fun_0_2 cmp) {
        
        //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.GrowableRail this$135671 = ((x10.util.GrowableRail)(a));
        
        //#line 35 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$135874 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$135671).data));
        
        //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.GrowableRail this$135672 = ((x10.util.GrowableRail)(a));
        
        //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$135875 = ((x10.util.GrowableRail<$T>)this$135672).size;
        
        //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final long t$135876 = x10.util.RailUtils.<$T> binarySearch__0$1x10$util$RailUtils$$T$2__1x10$util$RailUtils$$T__4$1x10$util$RailUtils$$T$3x10$util$RailUtils$$T$3x10$lang$Int$2$O($T, ((x10.core.Rail)(t$135874)), (($T)(key)), (long)(0L), (long)(t$135875), ((x10.core.fun.Fun_0_2)(cmp)));
        
        //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return t$135876;
    }
    
    
    //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public long binarySearch__0x10$util$ArrayList$$T$O(final $T key) {
        
        //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.GrowableRail this$135673 = ((x10.util.GrowableRail)(a));
        
        //#line 35 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final x10.core.Rail t$135879 = ((x10.core.Rail)(((x10.util.GrowableRail<$T>)this$135673).data));
        
        //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.GrowableRail this$135674 = ((x10.util.GrowableRail)(a));
        
        //#line 159 . "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        final long t$135880 = ((x10.util.GrowableRail<$T>)this$135674).size;
        
        //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.core.fun.Fun_0_2 t$135881 = ((x10.core.fun.Fun_0_2)(new x10.util.ArrayList.$Closure$286<$T>($T)));
        
        //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final long t$135882 = x10.util.RailUtils.<$T> binarySearch__0$1x10$util$RailUtils$$T$2__1x10$util$RailUtils$$T__4$1x10$util$RailUtils$$T$3x10$util$RailUtils$$T$3x10$lang$Int$2$O($T, ((x10.core.Rail)(t$135879)), (($T)(key)), (long)(0L), (long)(t$135880), ((x10.core.fun.Fun_0_2)(t$135881)));
        
        //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return t$135882;
    }
    
    
    //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    public java.lang.String toString() {
        
        //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final x10.util.StringBuilder sb = ((x10.util.StringBuilder)(new x10.util.StringBuilder((java.lang.System[]) null)));
        
        //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        sb.x10$util$StringBuilder$$init$S();
        
        //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        sb.add(((java.lang.String)("[")));
        
        //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final long t$135883 = this.size$O();
        
        //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final long sz = java.lang.Math.min(((long)(t$135883)),((long)(10L)));
        
        //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        long i$136104 = 0L;
        
        //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        for (;
             true;
             ) {
            
            //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$136105 = i$136104;
            
            //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final boolean t$136106 = ((t$136105) < (((long)(sz))));
            
            //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            if (!(t$136106)) {
                
                //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                break;
            }
            
            //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$136097 = i$136104;
            
            //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final boolean t$136098 = ((t$136097) > (((long)(0L))));
            
            //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            if (t$136098) {
                
                //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                sb.add(((java.lang.String)(",")));
            }
            
            //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$136099 = i$136104;
            
            //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final $T t$136100 = (($T)(this.$apply$G((long)(t$136099))));
            
            //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final java.lang.String t$136101 = (("") + (t$136100));
            
            //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            sb.add(((java.lang.String)(t$136101)));
            
            //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$136102 = i$136104;
            
            //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$136103 = ((t$136102) + (((long)(1L))));
            
            //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            i$136104 = t$136103;
        }
        
        //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final long t$135894 = this.size$O();
        
        //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final boolean t$135899 = ((sz) < (((long)(t$135894))));
        
        //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        if (t$135899) {
            
            //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135895 = this.size$O();
            
            //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final long t$135896 = ((t$135895) - (((long)(sz))));
            
            //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final java.lang.String t$135897 = (("...(omitted ") + ((x10.core.Long.$box(t$135896))));
            
            //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final java.lang.String t$135898 = ((t$135897) + (" elements)"));
            
            //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            sb.add(((java.lang.String)(t$135898)));
        }
        
        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        sb.add(((java.lang.String)("]")));
        
        //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        final java.lang.String t$135900 = sb.toString();
        
        //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return t$135900;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    final public x10.util.ArrayList x10$util$ArrayList$$this$x10$util$ArrayList() {
        
        //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
        return x10.util.ArrayList.this;
    }
    
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    final public void __fieldInitializers_x10_util_ArrayList() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$285<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_2, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$285> $RTT = 
            x10.rtt.StaticFunType.<$Closure$285> make($Closure$285.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_2.$RTT, x10.rtt.UnresolvedType.PARAM(0), x10.rtt.UnresolvedType.PARAM(0), x10.rtt.Types.INT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.ArrayList.$Closure$285<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.ArrayList.$Closure$285 $_obj = new x10.util.ArrayList.$Closure$285((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            
        }
        
        // constructor just for allocation
        public $Closure$285(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.util.ArrayList.$Closure$285.$initParams(this, $T);
            
        }
        
        // dispatcher for method abstract public (Z1,Z2)=>U.operator()(a1:Z1, a2:Z2):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return x10.core.Int.$box($apply__0x10$util$ArrayList$$Closure$285$$T__1x10$util$ArrayList$$Closure$285$$T$O(($T)a1, ($T)a2));
            
        }
        
        // dispatcher for method abstract public (Z1,Z2)=>U.operator()(a1:Z1, a2:Z2):U
        public int $apply$I(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return $apply__0x10$util$ArrayList$$Closure$285$$T__1x10$util$ArrayList$$Closure$285$$T$O(($T)a1, ($T)a2);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$285 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        
    
        
        public int $apply__0x10$util$ArrayList$$Closure$285$$T__1x10$util$ArrayList$$Closure$285$$T$O(final $T x, final $T y) {
            
            //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final java.lang.Comparable t$135858 = x10.rtt.Types.<java.lang.Comparable<$T>> castConversion(x,x10.rtt.ParameterizedType.make(x10.rtt.Types.COMPARABLE, $T));
            
            //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final int t$135859 = ((java.lang.Comparable<$T>)(t$135858)).compareTo(y);
            
            //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            return t$135859;
        }
        
        public $Closure$285(final x10.rtt.Type $T) {
            x10.util.ArrayList.$Closure$285.$initParams(this, $T);
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$286<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_2, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$286> $RTT = 
            x10.rtt.StaticFunType.<$Closure$286> make($Closure$286.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_2.$RTT, x10.rtt.UnresolvedType.PARAM(0), x10.rtt.UnresolvedType.PARAM(0), x10.rtt.Types.INT)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.ArrayList.$Closure$286<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.ArrayList.$Closure$286 $_obj = new x10.util.ArrayList.$Closure$286((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            
        }
        
        // constructor just for allocation
        public $Closure$286(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.util.ArrayList.$Closure$286.$initParams(this, $T);
            
        }
        
        // dispatcher for method abstract public (Z1,Z2)=>U.operator()(a1:Z1, a2:Z2):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return x10.core.Int.$box($apply__0x10$util$ArrayList$$Closure$286$$T__1x10$util$ArrayList$$Closure$286$$T$O(($T)a1, ($T)a2));
            
        }
        
        // dispatcher for method abstract public (Z1,Z2)=>U.operator()(a1:Z1, a2:Z2):U
        public int $apply$I(final java.lang.Object a1, final x10.rtt.Type t1, final java.lang.Object a2, final x10.rtt.Type t2) {
            return $apply__0x10$util$ArrayList$$Closure$286$$T__1x10$util$ArrayList$$Closure$286$$T$O(($T)a1, ($T)a2);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$286 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        
    
        
        public int $apply__0x10$util$ArrayList$$Closure$286$$T__1x10$util$ArrayList$$Closure$286$$T$O(final $T x, final $T y) {
            
            //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final java.lang.Comparable t$135877 = x10.rtt.Types.<java.lang.Comparable<$T>> castConversion(x,x10.rtt.ParameterizedType.make(x10.rtt.Types.COMPARABLE, $T));
            
            //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            final int t$135878 = ((java.lang.Comparable<$T>)(t$135877)).compareTo(y);
            
            //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            return t$135878;
        }
        
        public $Closure$286(final x10.rtt.Type $T) {
            x10.util.ArrayList.$Closure$286.$initParams(this, $T);
             {
                
            }
        }
        
    }
    
}

