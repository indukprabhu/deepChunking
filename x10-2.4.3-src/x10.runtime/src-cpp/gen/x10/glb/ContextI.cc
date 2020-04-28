/*************************************************/
/* START of ContextI */
#include <x10/glb/ContextI.h>

::x10aux::RuntimeType x10::glb::ContextI::rtt;
void x10::glb::ContextI::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Any>()};
    rtt.initStageTwo("x10.glb.ContextI",::x10aux::RuntimeType::interface_kind, 1, parents, 0, NULL, NULL);
}

/* END of ContextI */
/*************************************************/
