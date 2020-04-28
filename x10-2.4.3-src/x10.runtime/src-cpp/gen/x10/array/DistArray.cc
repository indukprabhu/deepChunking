/*************************************************/
/* START of DistArray */
#include <x10/array/DistArray.h>

::x10aux::RuntimeType x10::array::DistArray<void>::rtt;
void x10::array::DistArray<void>::raiseBoundsError(x10_long i) {
    
    //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__123472 = ::x10aux::makeStringLit("("); strLit__123472; })), i), (__extension__ ({ static ::x10::lang::String* strLit__123473 = ::x10aux::makeStringLit(") not contained in array"); strLit__123473; }))))));
}
void x10::array::DistArray<void>::raiseBoundsError(x10_long i, x10_long j) {
    
    //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__123474 = ::x10aux::makeStringLit("("); strLit__123474; })), i), (__extension__ ({ static ::x10::lang::String* strLit__123475 = ::x10aux::makeStringLit(", "); strLit__123475; }))), j), (__extension__ ({ static ::x10::lang::String* strLit__123476 = ::x10aux::makeStringLit(") not contained in array"); strLit__123476; }))))));
}
void x10::array::DistArray<void>::raiseBoundsError(x10_long i, x10_long j,
                                                   x10_long k) {
    
    //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__123477 = ::x10aux::makeStringLit("("); strLit__123477; })), i), (__extension__ ({ static ::x10::lang::String* strLit__123478 = ::x10aux::makeStringLit(", "); strLit__123478; }))), j), (__extension__ ({ static ::x10::lang::String* strLit__123479 = ::x10aux::makeStringLit(", "); strLit__123479; }))), k), (__extension__ ({ static ::x10::lang::String* strLit__123480 = ::x10aux::makeStringLit(") not contained in array"); strLit__123480; }))))));
}
void x10::array::DistArray<void>::raisePlaceError(x10_long i) {
    
    //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::BadPlaceException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__123481 = ::x10aux::makeStringLit("point ("); strLit__123481; })), i), (__extension__ ({ static ::x10::lang::String* strLit__123482 = ::x10aux::makeStringLit(") not defined at "); strLit__123482; }))), ::x10::lang::Place::_make(::x10aux::here)))));
}
void x10::array::DistArray<void>::raisePlaceError(x10_long i, x10_long j) {
    
    //#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::BadPlaceException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__123483 = ::x10aux::makeStringLit("point ("); strLit__123483; })), i), (__extension__ ({ static ::x10::lang::String* strLit__123484 = ::x10aux::makeStringLit(", "); strLit__123484; }))), j), (__extension__ ({ static ::x10::lang::String* strLit__123485 = ::x10aux::makeStringLit(") not defined at "); strLit__123485; }))), ::x10::lang::Place::_make(::x10aux::here)))));
}
void x10::array::DistArray<void>::raisePlaceError(x10_long i, x10_long j,
                                                  x10_long k) {
    
    //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::BadPlaceException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__123486 = ::x10aux::makeStringLit("point ("); strLit__123486; })), i), (__extension__ ({ static ::x10::lang::String* strLit__123487 = ::x10aux::makeStringLit(", "); strLit__123487; }))), j), (__extension__ ({ static ::x10::lang::String* strLit__123488 = ::x10aux::makeStringLit(", "); strLit__123488; }))), k), (__extension__ ({ static ::x10::lang::String* strLit__123489 = ::x10aux::makeStringLit(") not defined at "); strLit__123489; }))), ::x10::lang::Place::_make(::x10aux::here)))));
}
void x10::array::DistArray<void>::raiseNegativeArraySizeException() {
    
    //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::NegativeArraySizeException::_make()));
}

/* END of DistArray */
/*************************************************/
/*************************************************/
/* START of LocalState */
#include <x10/array/LocalState.h>

::x10aux::RuntimeType x10::array::LocalState<void>::rtt;

/* END of LocalState */
/*************************************************/
/*************************************************/
/* START of DistArray$Anonymous$7530 */
#include <x10/array/DistArray__Anonymous__7530.h>

::x10aux::RuntimeType x10::array::DistArray__Anonymous__7530<void, void>::rtt;

/* END of DistArray$Anonymous$7530 */
/*************************************************/
