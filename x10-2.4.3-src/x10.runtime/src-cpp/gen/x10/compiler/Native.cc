/*************************************************/
/* START of Native */
#include <x10/compiler/Native.h>


//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Native.x10"
::x10aux::RuntimeType x10::compiler::Native::rtt;
void x10::compiler::Native::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[5] = { ::x10aux::getRTT< ::x10::lang::Any>(), ::x10aux::getRTT< ::x10::compiler::NoInferType>(), ::x10aux::getRTT< ::x10::lang::annotations::StatementAnnotation>(), ::x10aux::getRTT< ::x10::lang::annotations::MethodAnnotation>(), ::x10aux::getRTT< ::x10::lang::annotations::FieldAnnotation>()};
    rtt.initStageTwo("x10.compiler.Native",::x10aux::RuntimeType::interface_kind, 5, parents, 0, NULL, NULL);
}

/* END of Native */
/*************************************************/
