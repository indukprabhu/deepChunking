/*************************************************/
/* START of IllegalOperationException */
#include <x10/lang/IllegalOperationException.h>

#include <x10/lang/Exception.h>
#include <x10/lang/String.h>
#include <x10/compiler/Synthetic.h>

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IllegalOperationException.x10"
void x10::lang::IllegalOperationException::_constructor() {
    (this)->::x10::lang::Exception::_constructor((__extension__ ({ static ::x10::lang::String* strLit__124987 = ::x10aux::makeStringLit("illegal operation exception"); strLit__124987; })));
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IllegalOperationException.x10"
    ::x10::lang::IllegalOperationException* this__102969 = this;
    
}
::x10::lang::IllegalOperationException* x10::lang::IllegalOperationException::_make(
  ) {
    ::x10::lang::IllegalOperationException* this_ = new (::x10aux::alloc_z< ::x10::lang::IllegalOperationException>()) ::x10::lang::IllegalOperationException();
    this_->_constructor();
    return this_;
}



//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IllegalOperationException.x10"
void x10::lang::IllegalOperationException::_constructor(::x10::lang::String* message) {
    (this)->::x10::lang::Exception::_constructor(message);
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IllegalOperationException.x10"
    ::x10::lang::IllegalOperationException* this__102970 = this;
    
}
::x10::lang::IllegalOperationException* x10::lang::IllegalOperationException::_make(
  ::x10::lang::String* message) {
    ::x10::lang::IllegalOperationException* this_ = new (::x10aux::alloc_z< ::x10::lang::IllegalOperationException>()) ::x10::lang::IllegalOperationException();
    this_->_constructor(message);
    return this_;
}



//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IllegalOperationException.x10"
::x10::lang::IllegalOperationException* x10::lang::IllegalOperationException::x10__lang__IllegalOperationException____this__x10__lang__IllegalOperationException(
  ) {
    return this;
    
}
void x10::lang::IllegalOperationException::__fieldInitializers_x10_lang_IllegalOperationException(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::IllegalOperationException::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::IllegalOperationException::_deserializer);

void x10::lang::IllegalOperationException::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::Exception::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::lang::IllegalOperationException::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::IllegalOperationException* this_ = new (::x10aux::alloc_z< ::x10::lang::IllegalOperationException>()) ::x10::lang::IllegalOperationException();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::IllegalOperationException::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Exception::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::lang::IllegalOperationException::rtt;
void x10::lang::IllegalOperationException::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Exception>()};
    rtt.initStageTwo("x10.lang.IllegalOperationException",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of IllegalOperationException */
/*************************************************/
