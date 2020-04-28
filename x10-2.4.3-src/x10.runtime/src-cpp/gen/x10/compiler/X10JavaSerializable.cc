/*************************************************/
/* START of X10JavaSerializable */
#include <x10/compiler/X10JavaSerializable.h>

::x10aux::RuntimeType x10::compiler::X10JavaSerializable::rtt;
void x10::compiler::X10JavaSerializable::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Any>()};
    rtt.initStageTwo("x10.compiler.X10JavaSerializable",::x10aux::RuntimeType::interface_kind, 1, parents, 0, NULL, NULL);
}

/* END of X10JavaSerializable */
/*************************************************/
