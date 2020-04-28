/*************************************************/
/* START of RemoteInvocation */
#include <x10/compiler/RemoteInvocation.h>


//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/RemoteInvocation.x10"
::x10aux::RuntimeType x10::compiler::RemoteInvocation::rtt;
void x10::compiler::RemoteInvocation::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[4] = { ::x10aux::getRTT< ::x10::lang::Any>(), ::x10aux::getRTT< ::x10::compiler::NoInline>(), ::x10aux::getRTT< ::x10::lang::annotations::ExpressionAnnotation>(), ::x10aux::getRTT< ::x10::lang::annotations::StatementAnnotation>()};
    rtt.initStageTwo("x10.compiler.RemoteInvocation",::x10aux::RuntimeType::interface_kind, 4, parents, 0, NULL, NULL);
}

/* END of RemoteInvocation */
/*************************************************/
