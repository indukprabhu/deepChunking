/*************************************************/
/* START of Ephemeral */
#include <x10/compiler/Ephemeral.h>

::x10aux::RuntimeType x10::compiler::Ephemeral::rtt;
void x10::compiler::Ephemeral::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::Any>(), ::x10aux::getRTT< ::x10::lang::annotations::StatementAnnotation>()};
    rtt.initStageTwo("x10.compiler.Ephemeral",::x10aux::RuntimeType::interface_kind, 2, parents, 0, NULL, NULL);
}

/* END of Ephemeral */
/*************************************************/
