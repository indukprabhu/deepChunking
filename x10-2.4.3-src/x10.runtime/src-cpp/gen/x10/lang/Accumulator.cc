/*************************************************/
/* START of Accumulator */
#include <x10/lang/Accumulator.h>

::x10aux::RuntimeType x10::lang::Accumulator<void>::rtt;
void x10::lang::Accumulator<void>::MYPRINT(::x10::lang::String* msg) {
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124072 = ::x10aux::makeStringLit("Worker="); strLit__124072; })), ::x10aux::nullCheck((::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread())))->FMGL(workerId)), (__extension__ ({ static ::x10::lang::String* strLit__124073 = ::x10aux::makeStringLit(" "); strLit__124073; }))), msg)))->c_str());
}

/* END of Accumulator */
/*************************************************/
