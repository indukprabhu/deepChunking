package x10.util;

@x10.runtime.impl.java.X10Generated
public interface Indexed<$T> extends x10.util.Container, x10.core.fun.Fun_0_1, x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Indexed> $RTT = 
        x10.rtt.NamedType.<Indexed> make("x10.util.Indexed",
                                         Indexed.class,
                                         1,
                                         new x10.rtt.Type[] {
                                             x10.rtt.ParameterizedType.make(x10.util.Container.$RTT, x10.rtt.UnresolvedType.PARAM(0)),
                                             x10.rtt.ParameterizedType.make(x10.core.fun.Fun_0_1.$RTT, x10.rtt.Types.LONG, x10.rtt.UnresolvedType.PARAM(0))
                                         });
    
    

    
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Indexed.x10"
    $T $apply$G(final long index);
}

