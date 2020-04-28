/*************************************************/
/* START of CustomSerialization */
#include <x10/io/CustomSerialization.h>

::x10aux::RuntimeType x10::io::CustomSerialization::rtt;
void x10::io::CustomSerialization::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Any>()};
    rtt.initStageTwo("x10.io.CustomSerialization",::x10aux::RuntimeType::interface_kind, 1, parents, 0, NULL, NULL);
}

/* END of CustomSerialization */
/*************************************************/
