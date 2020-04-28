/*************************************************/
/* START of TransientInitExpr */
#include <x10/compiler/TransientInitExpr.h>


//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/TransientInitExpr.x10"
::x10aux::RuntimeType x10::compiler::TransientInitExpr::rtt;
void x10::compiler::TransientInitExpr::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::Any>(), ::x10aux::getRTT< ::x10::compiler::SuppressTransientError>()};
    rtt.initStageTwo("x10.compiler.TransientInitExpr",::x10aux::RuntimeType::interface_kind, 2, parents, 0, NULL, NULL);
}

/* END of TransientInitExpr */
/*************************************************/
