/*************************************************/
/* START of Profile */
#include <x10/compiler/Profile.h>


//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Profile.x10"
::x10aux::RuntimeType x10::compiler::Profile::rtt;
void x10::compiler::Profile::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[3] = { ::x10aux::getRTT< ::x10::lang::Any>(), ::x10aux::getRTT< ::x10::lang::annotations::StatementAnnotation>(), ::x10aux::getRTT< ::x10::lang::annotations::ExpressionAnnotation>()};
    rtt.initStageTwo("x10.compiler.Profile",::x10aux::RuntimeType::interface_kind, 3, parents, 0, NULL, NULL);
}

/* END of Profile */
/*************************************************/
