package x10.util;

@x10.runtime.impl.java.X10Generated
public interface Container<$T> extends x10.lang.Iterable, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Container> $RTT = 
        x10.rtt.NamedType.<Container> make("x10.util.Container",
                                           Container.class,
                                           1,
                                           new x10.rtt.Type[] {
                                               x10.rtt.ParameterizedType.make(x10.lang.Iterable.$RTT, x10.rtt.UnresolvedType.PARAM(0))
                                           });
    
    

    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Container.x10"
    long size$O();
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Container.x10"
    boolean isEmpty$O();
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Container.x10"
    boolean contains$Z(final java.lang.Object y, x10.rtt.Type t1);
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Container.x10"
    boolean containsAll$Z(final x10.util.Container c, x10.rtt.Type t1);
    
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Container.x10"
    x10.util.Container clone();
}

