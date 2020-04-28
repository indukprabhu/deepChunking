/*************************************************/
/* START of Array_2 */
#include <x10/array/Array_2.h>

::x10aux::RuntimeType x10::array::Array_2<void>::rtt;
x10_long x10::array::Array_2<void>::validateSize(x10_long m, x10_long n) {
    
    //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    if ((((m) < (((x10_long)0ll))) || ((n) < (((x10_long)0ll))))) {
        ::x10::array::Array<void>::raiseNegativeArraySizeException();
    }
    
    //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    return ((m) * (n));
    
}

/* END of Array_2 */
/*************************************************/
