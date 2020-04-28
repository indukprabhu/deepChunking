/*************************************************/
/* START of DistArray_BlockBlock_2 */
#include <x10/array/DistArray_BlockBlock_2.h>

::x10aux::RuntimeType x10::array::DistArray_BlockBlock_2<void>::rtt;
x10_long x10::array::DistArray_BlockBlock_2<void>::validateSize(x10_long m,
                                                                x10_long n) {
    
    //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    if ((((m) < (((x10_long)0ll))) || ((n) < (((x10_long)0ll))))) {
        ::x10::array::DistArray<void>::raiseNegativeArraySizeException();
    }
    
    //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    return ((m) * (n));
    
}

/* END of DistArray_BlockBlock_2 */
/*************************************************/
/*************************************************/
/* START of LocalState_BB2 */
#include <x10/array/LocalState_BB2.h>

::x10aux::RuntimeType x10::array::LocalState_BB2<void>::rtt;

/* END of LocalState_BB2 */
/*************************************************/
