package x10.lang;


@x10.runtime.impl.java.X10Generated
public interface Iterator<$T> extends x10.core.Any
{
    public static final x10.rtt.RuntimeType<Iterator> $RTT = 
        x10.rtt.NamedType.<Iterator> make("x10.lang.Iterator",
                                          Iterator.class,
                                          1);
    
    

    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Iterator.x10"
    boolean hasNext$O();
    
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Iterator.x10"
    $T next$G();
}

