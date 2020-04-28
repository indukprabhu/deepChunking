/*************************************************/
/* START of ByRef */
#include <x10/compiler/ByRef.h>

::x10aux::RuntimeType x10::compiler::ByRef::rtt;
void x10::compiler::ByRef::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::Any>(), ::x10aux::getRTT< ::x10::lang::annotations::ClassAnnotation>()};
    rtt.initStageTwo("x10.compiler.ByRef",::x10aux::RuntimeType::interface_kind, 2, parents, 0, NULL, NULL);
}

/* END of ByRef */
/*************************************************/
