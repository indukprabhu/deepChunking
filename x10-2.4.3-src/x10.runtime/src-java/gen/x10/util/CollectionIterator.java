package x10.util;

@x10.runtime.impl.java.X10Generated
public interface CollectionIterator<$T> extends x10.lang.Iterator, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<CollectionIterator> $RTT = 
        x10.rtt.NamedType.<CollectionIterator> make("x10.util.CollectionIterator",
                                                    CollectionIterator.class,
                                                    1,
                                                    new x10.rtt.Type[] {
                                                        x10.rtt.ParameterizedType.make(x10.lang.Iterator.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                                    });
    
    

    
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CollectionIterator.x10"
    void remove();
}

