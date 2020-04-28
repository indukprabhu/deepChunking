package x10.util;

@x10.runtime.impl.java.X10Generated
public interface ListIterator<$T> extends x10.util.CollectionIterator, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<ListIterator> $RTT = 
        x10.rtt.NamedType.<ListIterator> make("x10.util.ListIterator",
                                              ListIterator.class,
                                              1,
                                              new x10.rtt.Type[] {
                                                  x10.rtt.ParameterizedType.make(x10.util.CollectionIterator.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                              });
    
    

    
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ListIterator.x10"
    boolean hasNext$O();
    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ListIterator.x10"
    $T next$G();
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ListIterator.x10"
    long nextIndex$O();
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ListIterator.x10"
    boolean hasPrevious$O();
    
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ListIterator.x10"
    $T previous$G();
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ListIterator.x10"
    long previousIndex$O();
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ListIterator.x10"
    void set$V(final java.lang.Object v, x10.rtt.Type t1);
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ListIterator.x10"
    void add$V(final java.lang.Object v, x10.rtt.Type t1);
}

