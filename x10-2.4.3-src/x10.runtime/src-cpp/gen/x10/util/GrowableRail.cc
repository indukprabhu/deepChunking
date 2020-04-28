/*************************************************/
/* START of GrowableRail */
#include <x10/util/GrowableRail.h>

::x10aux::RuntimeType x10::util::GrowableRail<void>::rtt;
void x10::util::GrowableRail<void>::raiseIndexOutOfBounds(x10_long idx, x10_long size) {
    
    //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__128715 = ::x10aux::makeStringLit("Index is "); strLit__128715; })), idx), (__extension__ ({ static ::x10::lang::String* strLit__128716 = ::x10aux::makeStringLit("; size is "); strLit__128716; }))), size))));
}
void x10::util::GrowableRail<void>::illegalGap(x10_long idx, x10_long size) {
    
    //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__128717 = ::x10aux::makeStringLit("Insert at "); strLit__128717; })), idx), (__extension__ ({ static ::x10::lang::String* strLit__128718 = ::x10aux::makeStringLit(" would have created gap (size = "); strLit__128718; }))), size), (__extension__ ({ static ::x10::lang::String* strLit__128719 = ::x10aux::makeStringLit(")"); strLit__128719; }))))));
}

/* END of GrowableRail */
/*************************************************/
