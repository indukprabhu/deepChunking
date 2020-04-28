/*************************************************/
/* START of CUDADirectParams */
#include <x10/compiler/CUDADirectParams.h>

::x10aux::RuntimeType x10::compiler::CUDADirectParams::rtt;
void x10::compiler::CUDADirectParams::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::Any>(), ::x10aux::getRTT< ::x10::lang::annotations::StatementAnnotation>()};
    rtt.initStageTwo("x10.compiler.CUDADirectParams",::x10aux::RuntimeType::interface_kind, 2, parents, 0, NULL, NULL);
}

/* END of CUDADirectParams */
/*************************************************/
