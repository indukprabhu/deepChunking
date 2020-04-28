/*************************************************/
/* START of Log */
#include <x10/util/logging/Log.h>

::x10aux::RuntimeType x10::util::logging::Log::rtt;
void x10::util::logging::Log::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Any>()};
    rtt.initStageTwo("x10.util.logging.Log",::x10aux::RuntimeType::interface_kind, 1, parents, 0, NULL, NULL);
}

/* END of Log */
/*************************************************/
