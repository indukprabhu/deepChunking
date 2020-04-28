/*************************************************/
/* START of Unserializable */
#include <x10/io/Unserializable.h>

::x10aux::RuntimeType x10::io::Unserializable::rtt;
void x10::io::Unserializable::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Any>()};
    rtt.initStageTwo("x10.io.Unserializable",::x10aux::RuntimeType::interface_kind, 1, parents, 0, NULL, NULL);
}

/* END of Unserializable */
/*************************************************/
