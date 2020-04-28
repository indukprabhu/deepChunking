package x10.util;

@x10.runtime.impl.java.X10Generated
abstract public class AbstractContainer<$T> extends x10.core.Ref implements x10.util.Container, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<AbstractContainer> $RTT = 
        x10.rtt.NamedType.<AbstractContainer> make("x10.util.AbstractContainer",
                                                   AbstractContainer.class,
                                                   1,
                                                   new x10.rtt.Type[] {
                                                       x10.rtt.ParameterizedType.make(x10.util.Container.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                                   });
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { if (i == 0) return $T; return null; }
    
    public static <$T> x10.serialization.X10JavaSerializable $_deserialize_body(x10.util.AbstractContainer<$T> $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        $_obj.$T = (x10.rtt.Type) $deserializer.readObject();
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        return null;
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        $serializer.write(this.$T);
        
    }
    
    // constructor just for allocation
    public AbstractContainer(final java.lang.System[] $dummy, final x10.rtt.Type $T) {
        x10.util.AbstractContainer.$initParams(this, $T);
        
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
    public static void $initParams(final AbstractContainer $this, final x10.rtt.Type $T) {
        $this.$T = $T;
        
    }
    

    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractContainer.x10"
    abstract public long size$O();
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractContainer.x10"
    public boolean isEmpty$O() {
        
        //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractContainer.x10"
        final long t$135517 = this.size$O();
        
        //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractContainer.x10"
        final boolean t$135518 = ((long) t$135517) == ((long) 0L);
        
        //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractContainer.x10"
        return t$135518;
    }
    
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractContainer.x10"
    abstract public boolean contains__0x10$util$AbstractContainer$$T$O(final $T y);
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractContainer.x10"
    abstract public x10.util.Container clone();
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractContainer.x10"
    abstract public x10.lang.Iterator iterator();
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractContainer.x10"
    public boolean containsAll__0$1x10$util$AbstractContainer$$T$2$O(final x10.util.Container c) {
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractContainer.x10"
        final x10.lang.Iterator x$135526 = ((x10.lang.Iterator<$T>)
                                             ((x10.lang.Iterable<$T>)c).iterator());
        
        //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractContainer.x10"
        for (;
             true;
             ) {
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractContainer.x10"
            final boolean t$135527 = ((x10.lang.Iterator<$T>)x$135526).hasNext$O();
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractContainer.x10"
            if (!(t$135527)) {
                
                //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractContainer.x10"
                break;
            }
            
            //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractContainer.x10"
            final $T x$135523 = (($T)(((x10.lang.Iterator<$T>)x$135526).next$G()));
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractContainer.x10"
            final boolean t$135524 = this.contains__0x10$util$AbstractContainer$$T$O((($T)(x$135523)));
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractContainer.x10"
            final boolean t$135525 = !(t$135524);
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractContainer.x10"
            if (t$135525) {
                
                //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractContainer.x10"
                return false;
            }
        }
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractContainer.x10"
        return true;
    }
    
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractContainer.x10"
    final public x10.util.AbstractContainer x10$util$AbstractContainer$$this$x10$util$AbstractContainer() {
        
        //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractContainer.x10"
        return x10.util.AbstractContainer.this;
    }
    
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractContainer.x10"
    
    // constructor for non-virtual call
    final public x10.util.AbstractContainer<$T> x10$util$AbstractContainer$$init$S() {
         {
            
            //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractContainer.x10"
            
            
            //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractContainer.x10"
            final x10.util.AbstractContainer this$135514 = this;
        }
        return this;
    }
    
    
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/AbstractContainer.x10"
    final public void __fieldInitializers_x10_util_AbstractContainer() {
        
    }
}

