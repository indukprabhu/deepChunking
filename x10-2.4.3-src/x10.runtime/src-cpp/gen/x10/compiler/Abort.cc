/*************************************************/
/* START of Abort */
#include <x10/compiler/Abort.h>


//#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Abort.x10"
::x10::compiler::Abort* x10::compiler::Abort::FMGL(ABORT);
void x10::compiler::Abort::FMGL(ABORT__do_init)() {
    FMGL(ABORT__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::compiler::Abort.ABORT");
    ::x10::compiler::Abort* __var164__ = ::x10::compiler::Abort::_make();
    FMGL(ABORT) = __var164__;
    FMGL(ABORT__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::compiler::Abort::FMGL(ABORT__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(ABORT__status), &FMGL(ABORT__do_init), &FMGL(ABORT__exception), "x10::compiler::Abort.ABORT");
    
}
volatile ::x10aux::StaticInitController::status x10::compiler::Abort::FMGL(ABORT__status);
::x10::lang::CheckedThrowable* x10::compiler::Abort::FMGL(ABORT__exception);

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Abort.x10"
void x10::compiler::Abort::_constructor() {
    (this)->::x10::lang::Exception::_constructor();
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Abort.x10"
    ::x10::compiler::Abort* this__76009 = this;
    
}
::x10::compiler::Abort* x10::compiler::Abort::_make() {
    ::x10::compiler::Abort* this_ = new (::x10aux::alloc_z< ::x10::compiler::Abort>()) ::x10::compiler::Abort();
    this_->_constructor();
    return this_;
}



//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/Abort.x10"
::x10::compiler::Abort* x10::compiler::Abort::x10__compiler__Abort____this__x10__compiler__Abort(
  ) {
    return this;
    
}
void x10::compiler::Abort::__fieldInitializers_x10_compiler_Abort(
  ) {
 
}
const ::x10aux::serialization_id_t x10::compiler::Abort::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::compiler::Abort::_deserializer);

void x10::compiler::Abort::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::Exception::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::compiler::Abort::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::compiler::Abort* this_ = new (::x10aux::alloc_z< ::x10::compiler::Abort>()) ::x10::compiler::Abort();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::compiler::Abort::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Exception::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::compiler::Abort::rtt;
void x10::compiler::Abort::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Exception>()};
    rtt.initStageTwo("x10.compiler.Abort",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of Abort */
/*************************************************/
