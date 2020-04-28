package x10.lang;


@x10.runtime.impl.java.X10Generated
public interface Arithmetic<$T> extends x10.core.Any
{
    public static final x10.rtt.RuntimeType<Arithmetic> $RTT = 
        x10.rtt.NamedType.<Arithmetic> make("x10.lang.Arithmetic",
                                            Arithmetic.class,
                                            1);
    
    

    
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Arithmetic.x10"
    $T $plus$G();
    
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Arithmetic.x10"
    $T $minus$G();
    
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Arithmetic.x10"
    java.lang.Object $plus(final java.lang.Object that, x10.rtt.Type t1);
    
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Arithmetic.x10"
    java.lang.Object $minus(final java.lang.Object that, x10.rtt.Type t1);
    
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Arithmetic.x10"
    java.lang.Object $times(final java.lang.Object that, x10.rtt.Type t1);
    
    
    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Arithmetic.x10"
    java.lang.Object $over(final java.lang.Object that, x10.rtt.Type t1);
}

