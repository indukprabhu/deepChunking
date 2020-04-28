/*************************************************/
/* START of Array */
#include <x10/array/Array.h>

::x10aux::RuntimeType x10::array::Array<void>::rtt;
void x10::array::Array<void>::raiseBoundsError(x10_long i) {
    
    //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__123305 = ::x10aux::makeStringLit("("); strLit__123305; })), i), (__extension__ ({ static ::x10::lang::String* strLit__123306 = ::x10aux::makeStringLit(") not contained in array"); strLit__123306; }))))));
}
void x10::array::Array<void>::raiseBoundsError(x10_long i, x10_long j) {
    
    //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__123307 = ::x10aux::makeStringLit("("); strLit__123307; })), i), (__extension__ ({ static ::x10::lang::String* strLit__123308 = ::x10aux::makeStringLit(", "); strLit__123308; }))), j), (__extension__ ({ static ::x10::lang::String* strLit__123309 = ::x10aux::makeStringLit(") not contained in array"); strLit__123309; }))))));
}
void x10::array::Array<void>::raiseBoundsError(x10_long i, x10_long j, x10_long k) {
    
    //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__123310 = ::x10aux::makeStringLit("("); strLit__123310; })), i), (__extension__ ({ static ::x10::lang::String* strLit__123311 = ::x10aux::makeStringLit(", "); strLit__123311; }))), j), (__extension__ ({ static ::x10::lang::String* strLit__123312 = ::x10aux::makeStringLit(", "); strLit__123312; }))), k), (__extension__ ({ static ::x10::lang::String* strLit__123313 = ::x10aux::makeStringLit(") not contained in array"); strLit__123313; }))))));
}
void x10::array::Array<void>::raiseNegativeArraySizeException() {
    
    //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::NegativeArraySizeException::_make()));
}

/* END of Array */
/*************************************************/
