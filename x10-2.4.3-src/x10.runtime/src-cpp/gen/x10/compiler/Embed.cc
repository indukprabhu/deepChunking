/*************************************************/
/* START of Embed */
#include <x10/compiler/Embed.h>

::x10aux::RuntimeType x10::compiler::Embed::rtt;
void x10::compiler::Embed::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[4] = { ::x10aux::getRTT< ::x10::lang::Any>(), ::x10aux::getRTT< ::x10::lang::annotations::FieldAnnotation>(), ::x10aux::getRTT< ::x10::lang::annotations::StatementAnnotation>(), ::x10aux::getRTT< ::x10::lang::annotations::ExpressionAnnotation>()};
    rtt.initStageTwo("x10.compiler.Embed",::x10aux::RuntimeType::interface_kind, 4, parents, 0, NULL, NULL);
}

/* END of Embed */
/*************************************************/
