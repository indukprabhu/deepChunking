/*************************************************/
/* START of ThrowFrame */
#include <x10/compiler/ws/ThrowFrame.h>

#include <x10/compiler/ws/Frame.h>
#include <x10/lang/Exception.h>
#include <x10/compiler/Ifdef.h>
#include <x10/compiler/ws/Worker.h>
#include <x10/compiler/Synthetic.h>

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/ThrowFrame.x10"

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/ThrowFrame.x10"
void x10::compiler::ws::ThrowFrame::_constructor(::x10::compiler::ws::Frame* up,
                                                 ::x10::lang::Exception* throwable) {
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/ThrowFrame.x10"
    ::x10::compiler::ws::Frame* this__78066 = this;
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
    ::x10::compiler::ws::Frame* up__78067 = up;
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
    ::x10aux::nullCheck(this__78066)->FMGL(up) = up__78067;
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/ThrowFrame.x10"
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/ThrowFrame.x10"
    ::x10::compiler::ws::ThrowFrame* this__78065 = this;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/ThrowFrame.x10"
    this->FMGL(throwable) = throwable;
}
::x10::compiler::ws::ThrowFrame* x10::compiler::ws::ThrowFrame::_make(::x10::compiler::ws::Frame* up,
                                                                      ::x10::lang::Exception* throwable)
{
    ::x10::compiler::ws::ThrowFrame* this_ = new (::x10aux::alloc_z< ::x10::compiler::ws::ThrowFrame>()) ::x10::compiler::ws::ThrowFrame();
    this_->_constructor(up, throwable);
    return this_;
}



//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/ThrowFrame.x10"
::x10::compiler::ws::Frame* x10::compiler::ws::ThrowFrame::remap(
  ) {
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/ThrowFrame.x10"
    return reinterpret_cast< ::x10::compiler::ws::Frame*>(this);
    
}

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/ThrowFrame.x10"
void x10::compiler::ws::ThrowFrame::wrapResume(::x10::compiler::ws::Worker* worker) {
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/ThrowFrame.x10"
    ::x10aux::nullCheck(worker)->FMGL(throwable) = this->FMGL(throwable);
}

//#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/ThrowFrame.x10"
::x10::compiler::ws::ThrowFrame* x10::compiler::ws::ThrowFrame::x10__compiler__ws__ThrowFrame____this__x10__compiler__ws__ThrowFrame(
  ) {
    return this;
    
}
void x10::compiler::ws::ThrowFrame::__fieldInitializers_x10_compiler_ws_ThrowFrame(
  ) {
 
}
const ::x10aux::serialization_id_t x10::compiler::ws::ThrowFrame::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::compiler::ws::ThrowFrame::_deserializer);

void x10::compiler::ws::ThrowFrame::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::compiler::ws::Frame::_serialize_body(buf);
    buf.write(this->FMGL(throwable));
    
}

::x10::lang::Reference* ::x10::compiler::ws::ThrowFrame::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::compiler::ws::ThrowFrame* this_ = new (::x10aux::alloc_z< ::x10::compiler::ws::ThrowFrame>()) ::x10::compiler::ws::ThrowFrame();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::compiler::ws::ThrowFrame::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::compiler::ws::Frame::_deserialize_body(buf);
    FMGL(throwable) = buf.read< ::x10::lang::Exception*>();
}

::x10aux::RuntimeType x10::compiler::ws::ThrowFrame::rtt;
void x10::compiler::ws::ThrowFrame::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::compiler::ws::Frame>()};
    rtt.initStageTwo("x10.compiler.ws.ThrowFrame",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of ThrowFrame */
/*************************************************/
