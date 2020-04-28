/*************************************************/
/* START of Frame */
#include <x10/compiler/ws/Frame.h>


//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"


//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"

//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
::x10::compiler::ws::Frame* x10::compiler::ws::Frame::realloc() {
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
    return this->remap();
    
}

//#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
void x10::compiler::ws::Frame::back(::x10::compiler::ws::Worker* worker, ::x10::compiler::ws::Frame* frame) {
 
}

//#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
void x10::compiler::ws::Frame::wrapBack(::x10::compiler::ws::Worker* worker,
                                        ::x10::compiler::ws::Frame* frame) {
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                  ::x10aux::nullCheck(worker)->FMGL(throwable))))
    {
        return;
    }
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
    this->back(worker, frame);
}

//#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
void x10::compiler::ws::Frame::resume(::x10::compiler::ws::Worker* worker) {
 
}

//#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
void x10::compiler::ws::Frame::wrapResume(::x10::compiler::ws::Worker* worker) {
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                  ::x10aux::nullCheck(worker)->FMGL(throwable))))
    {
        return;
    }
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
    try {
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
        this->resume(worker);
    }
    catch (::x10::lang::CheckedThrowable* __exc236) {
        if (::x10aux::instanceof< ::x10::compiler::Abort*>(__exc236)) {
            ::x10::compiler::Abort* t = static_cast< ::x10::compiler::Abort*>(__exc236);
            {
                
                //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
                ::x10aux::throwException(::x10aux::nullCheck(t));
            }
        } else
        if (::x10aux::instanceof< ::x10::lang::Exception*>(__exc236)) {
            ::x10::lang::Exception* t = static_cast< ::x10::lang::Exception*>(__exc236);
            {
                
                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
                ::x10aux::nullCheck(worker)->FMGL(throwable) =
                  t;
            }
        } else
        throw;
    }
}

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
::x10::compiler::ws::Frame* x10::compiler::ws::Frame::x10__compiler__ws__Frame____this__x10__compiler__ws__Frame(
  ) {
    return this;
    
}
void x10::compiler::ws::Frame::__fieldInitializers_x10_compiler_ws_Frame(
  ) {
 
}
void x10::compiler::ws::Frame::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(up));
    
}

void x10::compiler::ws::Frame::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(up) = buf.read< ::x10::compiler::ws::Frame*>();
}

::x10aux::RuntimeType x10::compiler::ws::Frame::rtt;
void x10::compiler::ws::Frame::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.compiler.ws.Frame",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of Frame */
/*************************************************/
