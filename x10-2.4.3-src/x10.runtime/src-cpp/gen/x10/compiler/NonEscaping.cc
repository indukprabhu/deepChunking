/*************************************************/
/* START of NonEscaping */
#include <x10/compiler/NonEscaping.h>

::x10aux::RuntimeType x10::compiler::NonEscaping::rtt;
void x10::compiler::NonEscaping::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[3] = { ::x10aux::getRTT< ::x10::lang::Any>(), ::x10aux::getRTT< ::x10::lang::annotations::MethodAnnotation>(), ::x10aux::getRTT< ::x10::lang::annotations::FieldAnnotation>()};
    rtt.initStageTwo("x10.compiler.NonEscaping",::x10aux::RuntimeType::interface_kind, 3, parents, 0, NULL, NULL);
}

/* END of NonEscaping */
/*************************************************/
