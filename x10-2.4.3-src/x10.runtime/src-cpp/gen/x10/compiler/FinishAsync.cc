/*************************************************/
/* START of FinishAsync */
#include <x10/compiler/FinishAsync.h>


//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/FinishAsync.x10"
::x10aux::RuntimeType x10::compiler::FinishAsync::rtt;
void x10::compiler::FinishAsync::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::Any>(), ::x10aux::getRTT< ::x10::lang::annotations::StatementAnnotation>()};
    rtt.initStageTwo("x10.compiler.FinishAsync",::x10aux::RuntimeType::interface_kind, 2, parents, 0, NULL, NULL);
}

/* END of FinishAsync */
/*************************************************/
