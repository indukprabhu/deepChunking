/*************************************************/
/* START of Endpoint */
#include <x10/compiler/Endpoint.h>


//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Endpoint.x10"
::x10aux::RuntimeType x10::compiler::Endpoint::rtt;
void x10::compiler::Endpoint::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[3] = { ::x10aux::getRTT< ::x10::lang::Any>(), ::x10aux::getRTT< ::x10::lang::annotations::ExpressionAnnotation>(), ::x10aux::getRTT< ::x10::lang::annotations::StatementAnnotation>()};
    rtt.initStageTwo("x10.compiler.Endpoint",::x10aux::RuntimeType::interface_kind, 3, parents, 0, NULL, NULL);
}

/* END of Endpoint */
/*************************************************/
