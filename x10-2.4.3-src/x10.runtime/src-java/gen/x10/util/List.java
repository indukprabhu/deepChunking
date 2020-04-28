package x10.util;

@x10.runtime.impl.java.X10Generated
public interface List<$T> extends x10.util.Collection, x10.util.Indexed, x10.lang.Settable, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<List> $RTT = 
        x10.rtt.NamedType.<List> make("x10.util.List",
                                      List.class,
                                      1,
                                      new x10.rtt.Type[] {
                                          x10.rtt.ParameterizedType.make(x10.util.Collection.$RTT, x10.rtt.UnresolvedType.PARAM(0)),
                                          x10.rtt.ParameterizedType.make(x10.util.Indexed.$RTT, x10.rtt.UnresolvedType.PARAM(0)),
                                          x10.rtt.ParameterizedType.make(x10.lang.Settable.$RTT, x10.rtt.Types.LONG, x10.rtt.UnresolvedType.PARAM(0))
                                      });
    
    

    
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/List.x10"
    x10.util.List indices();
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/List.x10"
    void addBefore$V(final long i, final java.lang.Object v, x10.rtt.Type t1);
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/List.x10"
    $T removeAt$G(final long i);
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/List.x10"
    long indexOf$J(final java.lang.Object v, x10.rtt.Type t1);
    
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/List.x10"
    long lastIndexOf$J(final java.lang.Object v, x10.rtt.Type t1);
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/List.x10"
    long indexOf$J(final long index, final java.lang.Object v, x10.rtt.Type t1);
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/List.x10"
    long lastIndexOf$J(final long index, final java.lang.Object v, x10.rtt.Type t1);
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/List.x10"
    x10.util.ListIterator iterator();
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/List.x10"
    x10.util.ListIterator iteratorFrom(final long i);
    
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/List.x10"
    x10.util.List subList(final long fromIndex, final long toIndex);
    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/List.x10"
    $T removeFirst$G();
    
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/List.x10"
    $T removeLast$G();
    
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/List.x10"
    $T getFirst$G();
    
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/List.x10"
    $T getLast$G();
    
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/List.x10"
    void reverse();
    
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/List.x10"
    void sort();
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/List.x10"
    void sort$V(final x10.core.fun.Fun_0_2 cmp, x10.rtt.Type t1);
}

