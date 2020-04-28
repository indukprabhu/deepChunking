/*************************************************/
/* START of Worker */
#include <x10/glb/Worker.h>

::x10aux::RuntimeType x10::glb::Worker<void, void>::rtt;
void x10::glb::Worker<void, void>::error(::x10::lang::CheckedThrowable* v) {
    
    //#line 354 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__123616 = ::x10aux::makeStringLit("Exception at "); strLit__123616; })), ::x10::lang::Place::_make(::x10aux::here))))->c_str());
    
    //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    ::x10aux::nullCheck(v)->printStackTrace();
}
x10_long x10::glb::Worker<void, void>::min(x10_long i, x10_long j) {
    
    //#line 361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    return ((i) < (j)) ? (i) : (j);
    
}

/* END of Worker */
/*************************************************/
