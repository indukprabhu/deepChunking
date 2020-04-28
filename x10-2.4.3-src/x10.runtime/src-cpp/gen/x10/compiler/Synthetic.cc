/*************************************************/
/* START of Synthetic */
#include <x10/compiler/Synthetic.h>

::x10aux::RuntimeType x10::compiler::Synthetic::rtt;
void x10::compiler::Synthetic::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[4] = { ::x10aux::getRTT< ::x10::lang::Any>(), ::x10aux::getRTT< ::x10::lang::annotations::ClassAnnotation>(), ::x10aux::getRTT< ::x10::lang::annotations::FieldAnnotation>(), ::x10aux::getRTT< ::x10::lang::annotations::MethodAnnotation>()};
    rtt.initStageTwo("x10.compiler.Synthetic",::x10aux::RuntimeType::interface_kind, 4, parents, 0, NULL, NULL);
}

/* END of Synthetic */
/*************************************************/
