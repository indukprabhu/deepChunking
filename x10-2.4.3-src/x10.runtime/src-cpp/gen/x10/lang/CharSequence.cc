/*************************************************/
/* START of CharSequence */
#include <x10/lang/CharSequence.h>

::x10aux::RuntimeType x10::lang::CharSequence::rtt;
void x10::lang::CharSequence::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Any>()};
    rtt.initStageTwo("x10.lang.CharSequence",::x10aux::RuntimeType::interface_kind, 1, parents, 0, NULL, NULL);
}

/* END of CharSequence */
/*************************************************/
