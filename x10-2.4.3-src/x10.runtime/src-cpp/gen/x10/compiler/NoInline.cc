/*************************************************/
/* START of NoInline */
#include <x10/compiler/NoInline.h>

::x10aux::RuntimeType x10::compiler::NoInline::rtt;
void x10::compiler::NoInline::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[4] = { ::x10aux::getRTT< ::x10::lang::Any>(), ::x10aux::getRTT< ::x10::lang::annotations::MethodAnnotation>(), ::x10aux::getRTT< ::x10::lang::annotations::StatementAnnotation>(), ::x10aux::getRTT< ::x10::lang::annotations::ExpressionAnnotation>()};
    rtt.initStageTwo("x10.compiler.NoInline",::x10aux::RuntimeType::interface_kind, 4, parents, 0, NULL, NULL);
}

/* END of NoInline */
/*************************************************/
