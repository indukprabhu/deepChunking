/*************************************************/
/* START of FailedDynamicCheckException */
#include <x10/lang/FailedDynamicCheckException.h>

#include <x10/lang/ClassCastException.h>
#include <x10/lang/String.h>
#include <x10/compiler/Synthetic.h>

//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FailedDynamicCheckException.x10"
void x10::lang::FailedDynamicCheckException::_constructor() {
    (this)->::x10::lang::ClassCastException::_constructor();
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FailedDynamicCheckException.x10"
    ::x10::lang::FailedDynamicCheckException* this__93720 = this;
    
}
::x10::lang::FailedDynamicCheckException* x10::lang::FailedDynamicCheckException::_make(
  ) {
    ::x10::lang::FailedDynamicCheckException* this_ = new (::x10aux::alloc_z< ::x10::lang::FailedDynamicCheckException>()) ::x10::lang::FailedDynamicCheckException();
    this_->_constructor();
    return this_;
}



//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FailedDynamicCheckException.x10"
void x10::lang::FailedDynamicCheckException::_constructor(::x10::lang::String* message) {
    (this)->::x10::lang::ClassCastException::_constructor(message);
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FailedDynamicCheckException.x10"
    ::x10::lang::FailedDynamicCheckException* this__93721 = this;
    
}
::x10::lang::FailedDynamicCheckException* x10::lang::FailedDynamicCheckException::_make(
  ::x10::lang::String* message) {
    ::x10::lang::FailedDynamicCheckException* this_ = new (::x10aux::alloc_z< ::x10::lang::FailedDynamicCheckException>()) ::x10::lang::FailedDynamicCheckException();
    this_->_constructor(message);
    return this_;
}



//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FailedDynamicCheckException.x10"
::x10::lang::FailedDynamicCheckException* x10::lang::FailedDynamicCheckException::x10__lang__FailedDynamicCheckException____this__x10__lang__FailedDynamicCheckException(
  ) {
    return this;
    
}
void x10::lang::FailedDynamicCheckException::__fieldInitializers_x10_lang_FailedDynamicCheckException(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::FailedDynamicCheckException::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::FailedDynamicCheckException::_deserializer);

void x10::lang::FailedDynamicCheckException::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::ClassCastException::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::lang::FailedDynamicCheckException::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FailedDynamicCheckException* this_ = new (::x10aux::alloc_z< ::x10::lang::FailedDynamicCheckException>()) ::x10::lang::FailedDynamicCheckException();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::FailedDynamicCheckException::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::ClassCastException::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::lang::FailedDynamicCheckException::rtt;
void x10::lang::FailedDynamicCheckException::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::ClassCastException>()};
    rtt.initStageTwo("x10.lang.FailedDynamicCheckException",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of FailedDynamicCheckException */
/*************************************************/
