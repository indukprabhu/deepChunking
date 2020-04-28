/*************************************************/
/* START of Ifdef */
#include <x10/compiler/Ifdef.h>


//#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Ifdef.x10"
::x10aux::RuntimeType x10::compiler::Ifdef::rtt;
void x10::compiler::Ifdef::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[5] = { ::x10aux::getRTT< ::x10::lang::Any>(), ::x10aux::getRTT< ::x10::lang::annotations::FieldAnnotation>(), ::x10aux::getRTT< ::x10::lang::annotations::MethodAnnotation>(), ::x10aux::getRTT< ::x10::lang::annotations::StatementAnnotation>(), ::x10aux::getRTT< ::x10::lang::annotations::ClassAnnotation>()};
    rtt.initStageTwo("x10.compiler.Ifdef",::x10aux::RuntimeType::interface_kind, 5, parents, 0, NULL, NULL);
}

/* END of Ifdef */
/*************************************************/
