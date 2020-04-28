/*************************************************/
/* START of RootFinish */
#include <x10/compiler/ws/RootFinish.h>

#include <x10/compiler/ws/FinishFrame.h>
#include <x10/compiler/ws/Frame.h>
#include <x10/compiler/Ifdef.h>
#include <x10/compiler/ws/Worker.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/Synthetic.h>

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RootFinish.x10"
void x10::compiler::ws::RootFinish::_constructor() {
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RootFinish.x10"
    (this)->::x10::compiler::ws::FinishFrame::_constructor(::x10aux::class_cast_unchecked< ::x10::compiler::ws::Frame*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RootFinish.x10"
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RootFinish.x10"
    ::x10::compiler::ws::RootFinish* this__78056 = this;
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RootFinish.x10"
    this->FMGL(asyncs) = ((x10_int)1);
}
::x10::compiler::ws::RootFinish* x10::compiler::ws::RootFinish::_make() {
    ::x10::compiler::ws::RootFinish* this_ = new (::x10aux::alloc_z< ::x10::compiler::ws::RootFinish>()) ::x10::compiler::ws::RootFinish();
    this_->_constructor();
    return this_;
}



//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RootFinish.x10"
::x10::compiler::ws::Frame* x10::compiler::ws::RootFinish::remap() {
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RootFinish.x10"
    return reinterpret_cast< ::x10::compiler::ws::Frame*>(this);
    
}

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RootFinish.x10"
void x10::compiler::ws::RootFinish::wrapResume(::x10::compiler::ws::Worker* worker) {
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RootFinish.x10"
    ::x10::compiler::ws::FinishFrame::wrapResume(worker);
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RootFinish.x10"
    ::x10::compiler::ws::Worker::stop();
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RootFinish.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::compiler::Abort::FMGL(ABORT__get)()));
}

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RootFinish.x10"
::x10::compiler::ws::RootFinish* x10::compiler::ws::RootFinish::x10__compiler__ws__RootFinish____this__x10__compiler__ws__RootFinish(
  ) {
    return this;
    
}
void x10::compiler::ws::RootFinish::__fieldInitializers_x10_compiler_ws_RootFinish(
  ) {
 
}
const ::x10aux::serialization_id_t x10::compiler::ws::RootFinish::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::compiler::ws::RootFinish::_deserializer);

void x10::compiler::ws::RootFinish::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::compiler::ws::FinishFrame::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::compiler::ws::RootFinish::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::compiler::ws::RootFinish* this_ = new (::x10aux::alloc_z< ::x10::compiler::ws::RootFinish>()) ::x10::compiler::ws::RootFinish();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::compiler::ws::RootFinish::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::compiler::ws::FinishFrame::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::compiler::ws::RootFinish::rtt;
void x10::compiler::ws::RootFinish::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::compiler::ws::FinishFrame>()};
    rtt.initStageTwo("x10.compiler.ws.RootFinish",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of RootFinish */
/*************************************************/
