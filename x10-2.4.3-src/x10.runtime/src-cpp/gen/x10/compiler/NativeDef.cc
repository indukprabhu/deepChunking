/*************************************************/
/* START of NativeDef */
#include <x10/compiler/NativeDef.h>


//#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/NativeDef.x10"
::x10aux::RuntimeType x10::compiler::NativeDef::rtt;
void x10::compiler::NativeDef::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::Any>(), ::x10aux::getRTT< ::x10::lang::annotations::MethodAnnotation>()};
    rtt.initStageTwo("x10.compiler.NativeDef",::x10aux::RuntimeType::interface_kind, 2, parents, 0, NULL, NULL);
}

/* END of NativeDef */
/*************************************************/
