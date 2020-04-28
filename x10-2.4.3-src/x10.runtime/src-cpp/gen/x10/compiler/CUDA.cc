/*************************************************/
/* START of CUDA */
#include <x10/compiler/CUDA.h>

::x10aux::RuntimeType x10::compiler::CUDA::rtt;
void x10::compiler::CUDA::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[3] = { ::x10aux::getRTT< ::x10::lang::Any>(), ::x10aux::getRTT< ::x10::lang::annotations::StatementAnnotation>(), ::x10aux::getRTT< ::x10::lang::annotations::MethodAnnotation>()};
    rtt.initStageTwo("x10.compiler.CUDA",::x10aux::RuntimeType::interface_kind, 3, parents, 0, NULL, NULL);
}

/* END of CUDA */
/*************************************************/
