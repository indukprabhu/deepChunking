package x10.util;

@x10.runtime.impl.java.X10Generated
abstract public class AbstractCollection<$T> extends x10.util.AbstractContainer<$T> implements x10.util.Collection, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<AbstractCollection> $RTT = 
        x10.rtt.NamedType.<AbstractCollection> make("x10.util.AbstractCollection",
                                                    AbstractCollection.class,
                                                    1,
                                                    new x10.rtt.Type[] {
                                                        x10.rtt.ParameterizedType.make(x10.util.Collection.$RTT, x10.rtt.UnresolvedType.PARAM(0)),
                                                        x10.rtt.ParameterizedType.make(x10.util.AbstractContainer.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                                    });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.AbstractCollection<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        x10.util.AbstractContainer.$_deserialize_body($_obj, $deserializer);
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return null;
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        super.$_serialize($serializer);
        $serializer.write(this.$T);
        
    }
    
    // constructor just for allocation
    public AbstractCollection(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        super($dummy, $T);
        x10.util.AbstractCollection.$initParams(this, $T);
        
    }
    
    // dispatcher for method abstract public x10.util.Collection[T].add(v:T){}:x10.lang.Boolean
    public java.lang.Object add(final java.lang.Object a1, final x10.rtt.Type t1) {
        return x10.core.Boolean.$box(add__0x10$util$AbstractCollection$$T$O(($T)a1));
        
    }
    
    // dispatcher for method abstract public x10.util.Collection[T].add(v:T){}:x10.lang.Boolean
    public boolean add$Z(final java.lang.Object a1, final x10.rtt.Type t1) {
        return add__0x10$util$AbstractCollection$$T$O(($T)a1);
        
    }
    
    // dispatcher for method abstract public x10.util.Collection[T].remove(v:T){}:x10.lang.Boolean
    public java.lang.Object remove(final java.lang.Object a1, final x10.rtt.Type t1) {
        return x10.core.Boolean.$box(remove__0x10$util$AbstractCollection$$T$O(($T)a1));
        
    }
    
    // dispatcher for method abstract public x10.util.Collection[T].remove(v:T){}:x10.lang.Boolean
    public boolean remove$Z(final java.lang.Object a1, final x10.rtt.Type t1) {
        return remove__0x10$util$AbstractCollection$$T$O(($T)a1);
        
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
    
    // dispatcher for method abstract public x10.util.Container[T].contains(y:T){}:x10.lang.Boolean
    public java.lang.Object contains(final java.lang.Object a1, final x10.rtt.Type t1) {
        return x10.core.Boolean.$box(contains__0x10$util$AbstractContainer$$T$O(($T)a1));
        
    }
    
    // dispatcher for method abstract public x10.util.Container[T].contains(y:T){}:x10.lang.Boolean
    public boolean contains$Z(final java.lang.Object a1, final x10.rtt.Type t1) {
        return contains__0x10$util$AbstractContainer$$T$O(($T)a1);
        
    }
    
    // dispatcher for method abstract public x10.util.Container[T].containsAll(c:x10.util.Container[T]){}:x10.lang.Boolean
    public java.lang.Object containsAll(final x10.util.Container a1, final x10.rtt.Type t1) {
        return x10.core.Boolean.$box(containsAll__0$1x10$util$AbstractContainer$$T$2$O((x10.util.Container)a1));
        
    }
    
    // dispatcher for method abstract public x10.util.Container[T].containsAll(c:x10.util.Container[T]){}:x10.lang.Boolean
    public boolean containsAll$Z(final x10.util.Container a1, final x10.rtt.Type t1) {
        return containsAll__0$1x10$util$AbstractContainer$$T$2$O((x10.util.Container)a1);
        
    }
    
    private x10.rtt.Type $T;
    
    // initializer of type parameters
    public static void $initParams(final AbstractCollection $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    

    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
    abstract public boolean add__0x10$util$AbstractCollection$$T$O(final $T v);
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
    abstract public boolean remove__0x10$util$AbstractCollection$$T$O(final $T v);
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
    public boolean addAll__0$1x10$util$AbstractCollection$$T$2$O(final x10.util.Container c) {
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
        final x10.core.fun.Fun_0_1 t$135473 = ((x10.core.fun.Fun_0_1)(new x10.util.AbstractCollection.$Closure$281<$T>($T)));
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
        final boolean t$135474 = this.addAllWhere__0$1x10$util$AbstractCollection$$T$2__1$1x10$util$AbstractCollection$$T$3x10$lang$Boolean$2$O(((x10.util.Container)(c)), ((x10.core.fun.Fun_0_1)(t$135473)));
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
        return t$135474;
    }
    
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
    public boolean retainAll__0$1x10$util$AbstractCollection$$T$2$O(final x10.util.Container c) {
        
        //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
        final x10.core.fun.Fun_0_1 t$135477 = ((x10.core.fun.Fun_0_1)(new x10.util.AbstractCollection.$Closure$282<$T>($T, c, (x10.util.AbstractCollection.$Closure$282.__0$1x10$util$AbstractCollection$$Closure$282$$T$2) null)));
        
        //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
        final boolean t$135478 = this.removeAllWhere__0$1x10$util$AbstractCollection$$T$3x10$lang$Boolean$2$O(((x10.core.fun.Fun_0_1)(t$135477)));
        
        //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
        return t$135478;
    }
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
    public boolean removeAll__0$1x10$util$AbstractCollection$$T$2$O(final x10.util.Container c) {
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
        final x10.core.fun.Fun_0_1 t$135480 = ((x10.core.fun.Fun_0_1)(new x10.util.AbstractCollection.$Closure$283<$T>($T, c, (x10.util.AbstractCollection.$Closure$283.__0$1x10$util$AbstractCollection$$Closure$283$$T$2) null)));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
        final boolean t$135481 = this.removeAllWhere__0$1x10$util$AbstractCollection$$T$3x10$lang$Boolean$2$O(((x10.core.fun.Fun_0_1)(t$135480)));
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
        return t$135481;
    }
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
    public boolean addAllWhere__0$1x10$util$AbstractCollection$$T$2__1$1x10$util$AbstractCollection$$T$3x10$lang$Boolean$2$O(final x10.util.Container c, final x10.core.fun.Fun_0_1 p) {
        
        //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
        boolean result = false;
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
        final x10.lang.Iterator x$135503 = ((x10.lang.Iterator<$T>)
                                             ((x10.lang.Iterable<$T>)c).iterator());
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
        for (;
             true;
             ) {
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
            final boolean t$135504 = ((x10.lang.Iterator<$T>)x$135503).hasNext$O();
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
            if (!(t$135504)) {
                
                //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
                break;
            }
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
            final $T x$135498 = (($T)(((x10.lang.Iterator<$T>)x$135503).next$G()));
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
            final boolean t$135499 = x10.core.Boolean.$unbox(((x10.core.fun.Fun_0_1<$T,x10.core.Boolean>)p).$apply(x$135498, $T));
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
            if (t$135499) {
                
                //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
                final boolean t$135500 = result;
                
                //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
                final boolean t$135501 = this.add__0x10$util$AbstractCollection$$T$O((($T)(x$135498)));
                
                //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
                final boolean t$135502 = ((t$135500) | (((boolean)(t$135501))));
                
                //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
                result = t$135502;
            }
        }
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
        final boolean t$135488 = result;
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
        return t$135488;
    }
    
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
    public boolean removeAllWhere__0$1x10$util$AbstractCollection$$T$3x10$lang$Boolean$2$O(final x10.core.fun.Fun_0_1 p) {
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
        boolean result = false;
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
        final x10.util.Collection t$135510 = ((x10.util.Collection<$T>)
                                               this.clone());
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
        final x10.lang.Iterator x$135511 = ((x10.lang.Iterator<$T>)
                                             ((x10.lang.Iterable<$T>)t$135510).iterator());
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
        for (;
             true;
             ) {
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
            final boolean t$135512 = ((x10.lang.Iterator<$T>)x$135511).hasNext$O();
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
            if (!(t$135512)) {
                
                //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
                break;
            }
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
            final $T x$135505 = (($T)(((x10.lang.Iterator<$T>)x$135511).next$G()));
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
            final boolean t$135506 = x10.core.Boolean.$unbox(((x10.core.fun.Fun_0_1<$T,x10.core.Boolean>)p).$apply(x$135505, $T));
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
            if (t$135506) {
                
                //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
                final boolean t$135507 = result;
                
                //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
                final boolean t$135508 = this.remove__0x10$util$AbstractCollection$$T$O((($T)(x$135505)));
                
                //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
                final boolean t$135509 = ((t$135507) | (((boolean)(t$135508))));
                
                //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
                result = t$135509;
            }
        }
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
        final boolean t$135496 = result;
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
        return t$135496;
    }
    
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
    public void clear() {
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
        final x10.core.fun.Fun_0_1 t$135497 = ((x10.core.fun.Fun_0_1)(new x10.util.AbstractCollection.$Closure$284<$T>($T)));
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
        this.removeAllWhere__0$1x10$util$AbstractCollection$$T$3x10$lang$Boolean$2$O(((x10.core.fun.Fun_0_1)(t$135497)));
    }
    
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
    abstract public x10.util.Collection clone();
    
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
    final public x10.util.AbstractCollection x10$util$AbstractCollection$$this$x10$util$AbstractCollection() {
        
        //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
        return x10.util.AbstractCollection.this;
    }
    
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
    
    // constructor for non-virtual call
    final public x10.util.AbstractCollection<$T> x10$util$AbstractCollection$$init$S() {
         {
            
            //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
            final x10.util.AbstractContainer this$135466 = this;
            
            //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
            
            
            //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
            final x10.util.AbstractCollection this$135513 = this;
        }
        return this;
    }
    
    
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
    final public void __fieldInitializers_x10_util_AbstractCollection() {
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$281<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$281> $RTT = 
            x10.rtt.StaticFunType.<$Closure$281> make($Closure$281.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.UnresolvedType.PARAM(0), x10.rtt.Types.BOOLEAN)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.AbstractCollection.$Closure$281<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.AbstractCollection.$Closure$281 $_obj = new x10.util.AbstractCollection.$Closure$281((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            
        }
        
        // constructor just for allocation
        public $Closure$281(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.util.AbstractCollection.$Closure$281.$initParams(this, $T);
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Boolean.$box($apply__0x10$util$AbstractCollection$$Closure$281$$T$O(($T)a1));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public boolean $apply$Z(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply__0x10$util$AbstractCollection$$Closure$281$$T$O(($T)a1);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$281 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        
    
        
        public boolean $apply__0x10$util$AbstractCollection$$Closure$281$$T$O(final $T id$159) {
            
            //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
            return true;
        }
        
        public $Closure$281(final x10.rtt.Type $T) {
            x10.util.AbstractCollection.$Closure$281.$initParams(this, $T);
             {
                
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$282<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$282> $RTT = 
            x10.rtt.StaticFunType.<$Closure$282> make($Closure$282.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.UnresolvedType.PARAM(0), x10.rtt.Types.BOOLEAN)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.AbstractCollection.$Closure$282<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.c = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.AbstractCollection.$Closure$282 $_obj = new x10.util.AbstractCollection.$Closure$282((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.c);
            
        }
        
        // constructor just for allocation
        public $Closure$282(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.util.AbstractCollection.$Closure$282.$initParams(this, $T);
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Boolean.$box($apply__0x10$util$AbstractCollection$$Closure$282$$T$O(($T)a1));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public boolean $apply$Z(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply__0x10$util$AbstractCollection$$Closure$282$$T$O(($T)a1);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$282 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$util$AbstractCollection$$Closure$282$$T$2 {}
        
    
        
        public boolean $apply__0x10$util$AbstractCollection$$Closure$282$$T$O(final $T x) {
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
            final boolean t$135475 = x10.core.Boolean.$unbox(((x10.util.Container<$T>)this.c).contains$Z((($T)(x)), $T));
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
            final boolean t$135476 = !(t$135475);
            
            //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
            return t$135476;
        }
        
        public x10.util.Container<$T> c;
        
        public $Closure$282(final x10.rtt.Type $T, final x10.util.Container<$T> c, __0$1x10$util$AbstractCollection$$Closure$282$$T$2 $dummy) {
            x10.util.AbstractCollection.$Closure$282.$initParams(this, $T);
             {
                ((x10.util.AbstractCollection.$Closure$282<$T>)this).c = ((x10.util.Container)(c));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$283<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$283> $RTT = 
            x10.rtt.StaticFunType.<$Closure$283> make($Closure$283.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.UnresolvedType.PARAM(0), x10.rtt.Types.BOOLEAN)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.AbstractCollection.$Closure$283<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            $_obj.c = $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.AbstractCollection.$Closure$283 $_obj = new x10.util.AbstractCollection.$Closure$283((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            $serializer.write(this.c);
            
        }
        
        // constructor just for allocation
        public $Closure$283(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.util.AbstractCollection.$Closure$283.$initParams(this, $T);
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Boolean.$box($apply__0x10$util$AbstractCollection$$Closure$283$$T$O(($T)a1));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public boolean $apply$Z(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply__0x10$util$AbstractCollection$$Closure$283$$T$O(($T)a1);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$283 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        // synthetic type for parameter mangling
        public static final class __0$1x10$util$AbstractCollection$$Closure$283$$T$2 {}
        
    
        
        public boolean $apply__0x10$util$AbstractCollection$$Closure$283$$T$O(final $T x) {
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
            final boolean t$135479 = x10.core.Boolean.$unbox(((x10.util.Container<$T>)this.c).contains$Z((($T)(x)), $T));
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
            return t$135479;
        }
        
        public x10.util.Container<$T> c;
        
        public $Closure$283(final x10.rtt.Type $T, final x10.util.Container<$T> c, __0$1x10$util$AbstractCollection$$Closure$283$$T$2 $dummy) {
            x10.util.AbstractCollection.$Closure$283.$initParams(this, $T);
             {
                ((x10.util.AbstractCollection.$Closure$283<$T>)this).c = ((x10.util.Container)(c));
            }
        }
        
    }
    
    @x10.runtime.impl.java.X10Generated
    final public static class $Closure$284<$T> extends x10.core.Ref implements x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
    {
        public static final x10.rtt.RuntimeType<$Closure$284> $RTT = 
            x10.rtt.StaticFunType.<$Closure$284> make($Closure$284.class,
                                                      1,
                                                      new x10.rtt.Type[] {
                                                          x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.UnresolvedType.PARAM(0), x10.rtt.Types.BOOLEAN)
                                                      });
        
        public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
        
        public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
        
        public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.AbstractCollection.$Closure$284<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
            return $_obj;
        }
        
        public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
            x10.util.AbstractCollection.$Closure$284 $_obj = new x10.util.AbstractCollection.$Closure$284((java.lang.System[]) null, (x10.rtt.Type) null);
            $deserializer.record_reference($_obj);
            return $_deserialize_body($_obj, $deserializer);
        }
        
        public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
            $serializer.write(this.$T);
            
        }
        
        // constructor just for allocation
        public $Closure$284(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
            x10.util.AbstractCollection.$Closure$284.$initParams(this, $T);
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public java.lang.Object $apply(final java.lang.Object a1, final x10.rtt.Type t1) {
            return x10.core.Boolean.$box($apply__0x10$util$AbstractCollection$$Closure$284$$T$O(($T)a1));
            
        }
        
        // dispatcher for method abstract public (Z1)=>U.operator()(a1:Z1):U
        public boolean $apply$Z(final java.lang.Object a1, final x10.rtt.Type t1) {
            return $apply__0x10$util$AbstractCollection$$Closure$284$$T$O(($T)a1);
            
        }
        
        private x10.rtt.Type $T;
        
        // initializer of type parameters
        public static void $initParams(final $Closure$284 $this, final x10.rtt.Type $T) {
            $this.$T = $T;
            
        }
        
    
        
        public boolean $apply__0x10$util$AbstractCollection$$Closure$284$$T$O(final $T id$162) {
            
            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractCollection.x10"
            return true;
        }
        
        public $Closure$284(final x10.rtt.Type $T) {
            x10.util.AbstractCollection.$Closure$284.$initParams(this, $T);
             {
                
            }
        }
        
    }
    
}

