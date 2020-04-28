/*************************************************/
/* START of AsyncClosure */
#include <x10/compiler/AsyncClosure.h>

::x10aux::RuntimeType x10::compiler::AsyncClosure::rtt;
void x10::compiler::AsyncClosure::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[3] = { ::x10aux::getRTT< ::x10::lang::Any>(), ::x10aux::getRTT< ::x10::lang::annotations::ExpressionAnnotation>(), ::x10aux::getRTT< ::x10::lang::annotations::StatementAnnotation>()};
    rtt.initStageTwo("x10.compiler.AsyncClosure",::x10aux::RuntimeType::interface_kind, 3, parents, 0, NULL, NULL);
}

/* END of AsyncClosure */
/*************************************************/
