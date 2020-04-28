/*************************************************/
/* START of DistArray_Block_1 */
#include <x10/array/DistArray_Block_1.h>

::x10aux::RuntimeType x10::array::DistArray_Block_1<void>::rtt;
x10_long x10::array::DistArray_Block_1<void>::validateSize(x10_long n) {
    
    //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    if (((n) < (((x10_long)0ll)))) {
        ::x10::array::DistArray<void>::raiseNegativeArraySizeException();
    }
    
    //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    return n;
    
}

/* END of DistArray_Block_1 */
/*************************************************/
/*************************************************/
/* START of LocalState_B1 */
#include <x10/array/LocalState_B1.h>

::x10aux::RuntimeType x10::array::LocalState_B1<void>::rtt;

/* END of LocalState_B1 */
/*************************************************/
