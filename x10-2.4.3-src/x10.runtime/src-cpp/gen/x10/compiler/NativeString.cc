/*************************************************/
/* START of NativeString */
#include <x10/compiler/NativeString.h>

::x10aux::RuntimeType x10::compiler::NativeString::rtt;
void x10::compiler::NativeString::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::Any>(), ::x10aux::getRTT< ::x10::lang::annotations::ExpressionAnnotation>()};
    rtt.initStageTwo("x10.compiler.NativeString",::x10aux::RuntimeType::interface_kind, 2, parents, 0, NULL, NULL);
}

/* END of NativeString */
/*************************************************/
