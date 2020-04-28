package x10.compiler;

@x10.runtime.impl.java.X10Generated
public interface SetOps<$T> extends x10.core.Any
{
    public static final x10.rtt.RuntimeType<SetOps> $RTT = 
        x10.rtt.NamedType.<SetOps> make("x10.compiler.SetOps",
                                        SetOps.class,
                                        1);
    
    

    
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/SetOps.x10"
    $T $not$G();
    
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/SetOps.x10"
    java.lang.Object $and(final java.lang.Object that, x10.rtt.Type t1);
    
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/SetOps.x10"
    java.lang.Object $or(final java.lang.Object that, x10.rtt.Type t1);
    
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/SetOps.x10"
    java.lang.Object $minus(final java.lang.Object that, x10.rtt.Type t1);
}

