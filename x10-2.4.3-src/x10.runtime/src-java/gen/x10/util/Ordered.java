package x10.util;


@x10.runtime.impl.java.X10Generated
public interface Ordered<$T> extends x10.core.Any
{
    public static final x10.rtt.RuntimeType<Ordered> $RTT = 
        x10.rtt.NamedType.<Ordered> make("x10.util.Ordered",
                                         Ordered.class,
                                         1);
    
    

    
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Ordered.x10"
    boolean $lt$Z(final java.lang.Object that, x10.rtt.Type t1);
    
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Ordered.x10"
    boolean $gt$Z(final java.lang.Object that, x10.rtt.Type t1);
    
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Ordered.x10"
    boolean $le$Z(final java.lang.Object that, x10.rtt.Type t1);
    
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Ordered.x10"
    boolean $ge$Z(final java.lang.Object that, x10.rtt.Type t1);
}

