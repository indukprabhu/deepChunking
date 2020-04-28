/*************************************************/
/* START of GLB */
#include <x10/glb/GLB.h>

::x10aux::RuntimeType x10::glb::GLB<void, void>::rtt;
x10_long x10::glb::GLB<void, void>::min(x10_long i, x10_long j) {
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/GLB.x10"
    return ((i) < (j)) ? (i) : (j);
    
}

/* END of GLB */
/*************************************************/
