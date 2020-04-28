/*************************************************/
/* START of Array_1 */
#include <x10/array/Array_1.h>

::x10aux::RuntimeType x10::array::Array_1<void>::rtt;
x10_long x10::array::Array_1<void>::validateSize(x10_long n) {
    
    //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    if (((n) < (((x10_long)0ll)))) {
        ::x10::array::Array<void>::raiseNegativeArraySizeException();
    }
    
    //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    return n;
    
}

/* END of Array_1 */
/*************************************************/
