/*************************************************/
/* START of SuppressTransientError */
#include <x10/compiler/SuppressTransientError.h>

::x10aux::RuntimeType x10::compiler::SuppressTransientError::rtt;
void x10::compiler::SuppressTransientError::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::Any>(), ::x10aux::getRTT< ::x10::lang::annotations::FieldAnnotation>()};
    rtt.initStageTwo("x10.compiler.SuppressTransientError",::x10aux::RuntimeType::interface_kind, 2, parents, 0, NULL, NULL);
}

/* END of SuppressTransientError */
/*************************************************/
