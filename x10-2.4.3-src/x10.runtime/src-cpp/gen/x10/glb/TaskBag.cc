/*************************************************/
/* START of TaskBag */
#include <x10/glb/TaskBag.h>

::x10aux::RuntimeType x10::glb::TaskBag::rtt;
void x10::glb::TaskBag::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Any>()};
    rtt.initStageTwo("x10.glb.TaskBag",::x10aux::RuntimeType::interface_kind, 1, parents, 0, NULL, NULL);
}

/* END of TaskBag */
/*************************************************/
