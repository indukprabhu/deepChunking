/*************************************************/
/* START of TypeAnnotation */
#include <x10/lang/annotations/TypeAnnotation.h>

::x10aux::RuntimeType x10::lang::annotations::TypeAnnotation::rtt;
void x10::lang::annotations::TypeAnnotation::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::Any>(), ::x10aux::getRTT< ::x10::lang::annotations::Annotation>()};
    rtt.initStageTwo("x10.lang.annotations.TypeAnnotation",::x10aux::RuntimeType::interface_kind, 2, parents, 0, NULL, NULL);
}

/* END of TypeAnnotation */
/*************************************************/
