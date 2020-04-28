/*************************************************/
/* START of TryFrame */
#include <x10/compiler/ws/TryFrame.h>


//#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/TryFrame.x10"


//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/TryFrame.x10"
void x10::compiler::ws::TryFrame::_constructor(x10_int id__52, ::x10::compiler::ws::TryFrame* o) {
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/TryFrame.x10"
    (this)->::x10::compiler::ws::RegularFrame::_constructor(((x10_int)-1),
                                                            reinterpret_cast< ::x10::compiler::ws::RegularFrame*>(o));
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/TryFrame.x10"
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/TryFrame.x10"
    ::x10::compiler::ws::TryFrame* this__78075 = this;
    
}


//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/TryFrame.x10"
void x10::compiler::ws::TryFrame::wrapResume(::x10::compiler::ws::Worker* worker) {
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/TryFrame.x10"
    try {
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/TryFrame.x10"
        this->resume(worker);
    }
    catch (::x10::lang::CheckedThrowable* __exc262) {
        if (::x10aux::instanceof< ::x10::compiler::Abort*>(__exc262)) {
            ::x10::compiler::Abort* t = static_cast< ::x10::compiler::Abort*>(__exc262);
            {
                
                //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/TryFrame.x10"
                ::x10aux::throwException(::x10aux::nullCheck(t));
            }
        } else
        if (::x10aux::instanceof< ::x10::lang::Exception*>(__exc262)) {
            ::x10::lang::Exception* t = static_cast< ::x10::lang::Exception*>(__exc262);
            {
                
                //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/TryFrame.x10"
                ::x10aux::nullCheck(worker)->FMGL(throwable) = t;
            }
        } else
        throw;
    }
}

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/TryFrame.x10"
::x10::compiler::ws::TryFrame* x10::compiler::ws::TryFrame::x10__compiler__ws__TryFrame____this__x10__compiler__ws__TryFrame(
  ) {
    return this;
    
}
void x10::compiler::ws::TryFrame::__fieldInitializers_x10_compiler_ws_TryFrame(
  ) {
 
}
void x10::compiler::ws::TryFrame::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::compiler::ws::RegularFrame::_serialize_body(buf);
    
}

void x10::compiler::ws::TryFrame::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::compiler::ws::RegularFrame::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::compiler::ws::TryFrame::rtt;
void x10::compiler::ws::TryFrame::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::compiler::ws::RegularFrame>()};
    rtt.initStageTwo("x10.compiler.ws.TryFrame",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of TryFrame */
/*************************************************/
