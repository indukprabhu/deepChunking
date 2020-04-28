/*************************************************/
/* START of Incomplete */
#include <x10/compiler/Incomplete.h>

::x10aux::RuntimeType x10::compiler::Incomplete::rtt;
void x10::compiler::Incomplete::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::Any>(), ::x10aux::getRTT< ::x10::lang::annotations::MethodAnnotation>()};
    rtt.initStageTwo("x10.compiler.Incomplete",::x10aux::RuntimeType::interface_kind, 2, parents, 0, NULL, NULL);
}

/* END of Incomplete */
/*************************************************/
