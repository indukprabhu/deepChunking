/*************************************************/
/* START of ShouldNotBeERR */
#include <x10/compiler/tests/ShouldNotBeERR.h>

::x10aux::RuntimeType x10::compiler::tests::ShouldNotBeERR::rtt;
void x10::compiler::tests::ShouldNotBeERR::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[9] = { ::x10aux::getRTT< ::x10::lang::Any>(), ::x10aux::getRTT< ::x10::lang::annotations::MethodAnnotation>(), ::x10aux::getRTT< ::x10::lang::annotations::ClassAnnotation>(), ::x10aux::getRTT< ::x10::lang::annotations::FieldAnnotation>(), ::x10aux::getRTT< ::x10::lang::annotations::ImportAnnotation>(), ::x10aux::getRTT< ::x10::lang::annotations::PackageAnnotation>(), ::x10aux::getRTT< ::x10::lang::annotations::TypeAnnotation>(), ::x10aux::getRTT< ::x10::lang::annotations::ExpressionAnnotation>(), ::x10aux::getRTT< ::x10::lang::annotations::StatementAnnotation>()};
    rtt.initStageTwo("x10.compiler.tests.ShouldNotBeERR",::x10aux::RuntimeType::interface_kind, 9, parents, 0, NULL, NULL);
}

/* END of ShouldNotBeERR */
/*************************************************/
