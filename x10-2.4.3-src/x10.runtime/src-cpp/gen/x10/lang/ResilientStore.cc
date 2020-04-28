/*************************************************/
/* START of ResilientStore */
#include <x10/lang/ResilientStore.h>

::x10aux::RuntimeType x10::lang::ResilientStore<void, void>::rtt;
x10_long x10::lang::ResilientStore<void, void>::FMGL(verbose);
void x10::lang::ResilientStore<void, void>::FMGL(verbose__do_init)() {
    FMGL(verbose__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::ResilientStore<void, void>.verbose");
    x10_long __var1568__ = ::x10::lang::FinishResilient::FMGL(verbose__get)();
    FMGL(verbose) = __var1568__;
    FMGL(verbose__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::ResilientStore<void, void>::FMGL(verbose__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(verbose__status), &FMGL(verbose__do_init), &FMGL(verbose__exception), "x10::lang::ResilientStore<void, void>.verbose");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::ResilientStore<void, void>::FMGL(verbose__status);
::x10::lang::CheckedThrowable* x10::lang::ResilientStore<void, void>::FMGL(verbose__exception);
void x10::lang::ResilientStore<void, void>::debug(::x10::lang::String* msg) {
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
    ::x10::lang::FinishResilient::debug(msg);
}
void x10::lang::ResilientStore<void, void>::_kwd__delete(::x10::lang::Any* name) {
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
    if (((::x10::lang::ResilientStore<void, void>::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        
        //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        ::x10::lang::String* msg__104152 = ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125696 = ::x10aux::makeStringLit("ResilientStore.delete called, name="); strLit__125696; })), name);
        ::x10::lang::FinishResilient::debug(msg__104152);
    }
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
    ::x10::lang::ResilientStorePlace0<void, void>::_kwd__delete(name);
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
    if (((::x10::lang::ResilientStore<void, void>::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        
        //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        ::x10::lang::String* msg__104153 = (__extension__ ({ static ::x10::lang::String* strLit__125697 = ::x10aux::makeStringLit("ResilientStore.delete returning"); strLit__125697; }));
        ::x10::lang::FinishResilient::debug(msg__104153);
    }
    
}

/* END of ResilientStore */
/*************************************************/
