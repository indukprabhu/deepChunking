/*************************************************/
/* START of StackAllocateUninitialized */
#include <x10/compiler/StackAllocateUninitialized.h>

::x10aux::RuntimeType x10::compiler::StackAllocateUninitialized::rtt;
void x10::compiler::StackAllocateUninitialized::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::Any>(), ::x10aux::getRTT< ::x10::lang::annotations::ExpressionAnnotation>()};
    rtt.initStageTwo("x10.compiler.StackAllocateUninitialized",::x10aux::RuntimeType::interface_kind, 2, parents, 0, NULL, NULL);
}

/* END of StackAllocateUninitialized */
/*************************************************/
