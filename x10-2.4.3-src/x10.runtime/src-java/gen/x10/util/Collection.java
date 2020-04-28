package x10.util;

@x10.runtime.impl.java.X10Generated
public interface Collection<$T> extends x10.util.Container, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Collection> $RTT = 
        x10.rtt.NamedType.<Collection> make("x10.util.Collection",
                                            Collection.class,
                                            1,
                                            new x10.rtt.Type[] {
                                                x10.rtt.ParameterizedType.make(x10.util.Container.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                            });
    
    

    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Collection.x10"
    boolean add$Z(final java.lang.Object v, x10.rtt.Type t1);
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Collection.x10"
    boolean remove$Z(final java.lang.Object v, x10.rtt.Type t1);
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Collection.x10"
    boolean addAll$Z(final x10.util.Container c, x10.rtt.Type t1);
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Collection.x10"
    boolean retainAll$Z(final x10.util.Container c, x10.rtt.Type t1);
    
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Collection.x10"
    boolean removeAll$Z(final x10.util.Container c, x10.rtt.Type t1);
    
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Collection.x10"
    boolean addAllWhere$Z(final x10.util.Container c, x10.rtt.Type t1, final x10.core.fun.Fun_0_1 p, x10.rtt.Type t2);
    
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Collection.x10"
    boolean removeAllWhere$Z(final x10.core.fun.Fun_0_1 p, x10.rtt.Type t1);
    
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Collection.x10"
    void clear();
    
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Collection.x10"
    x10.util.Collection clone();
}

