/*************************************************/
/* START of Array_3 */
#include <x10/array/Array_3.h>

::x10aux::RuntimeType x10::array::Array_3<void>::rtt;
x10_long x10::array::Array_3<void>::validateSize(x10_long m, x10_long n, x10_long p) {
    
    //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    if (((((m) < (((x10_long)0ll))) || ((n) < (((x10_long)0ll)))) || ((p) < (((x10_long)0ll)))))
    {
        ::x10::array::Array<void>::raiseNegativeArraySizeException();
    }
    
    //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    return ((((m) * (n))) * (p));
    
}

/* END of Array_3 */
/*************************************************/
