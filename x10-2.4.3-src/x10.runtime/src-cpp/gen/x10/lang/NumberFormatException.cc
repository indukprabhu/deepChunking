/*************************************************/
/* START of NumberFormatException */
#include <x10/lang/NumberFormatException.h>

#include <x10/lang/IllegalArgumentException.h>
#include <x10/compiler/Native.h>
#include <x10/lang/String.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeRep.h>

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/NumberFormatException.x10"
void x10::lang::NumberFormatException::_constructor() {
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/NumberFormatException.x10"
    (this)->::x10::lang::IllegalArgumentException::_constructor();
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/NumberFormatException.x10"
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/NumberFormatException.x10"
    this->x10::lang::NumberFormatException::__fieldInitializers_x10_lang_NumberFormatException();
}
::x10::lang::NumberFormatException* x10::lang::NumberFormatException::_make(
  ) {
    ::x10::lang::NumberFormatException* this_ = new (::x10aux::alloc_z< ::x10::lang::NumberFormatException>()) ::x10::lang::NumberFormatException();
    this_->_constructor();
    return this_;
}



//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/NumberFormatException.x10"
void x10::lang::NumberFormatException::_constructor(::x10::lang::String* message) {
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/NumberFormatException.x10"
    (this)->::x10::lang::IllegalArgumentException::_constructor(message);
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/NumberFormatException.x10"
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/NumberFormatException.x10"
    this->x10::lang::NumberFormatException::__fieldInitializers_x10_lang_NumberFormatException();
}
::x10::lang::NumberFormatException* x10::lang::NumberFormatException::_make(
  ::x10::lang::String* message) {
    ::x10::lang::NumberFormatException* this_ = new (::x10aux::alloc_z< ::x10::lang::NumberFormatException>()) ::x10::lang::NumberFormatException();
    this_->_constructor(message);
    return this_;
}



//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/NumberFormatException.x10"
::x10::lang::NumberFormatException* x10::lang::NumberFormatException::x10__lang__NumberFormatException____this__x10__lang__NumberFormatException(
  ) {
    return this;
    
}
void x10::lang::NumberFormatException::__fieldInitializers_x10_lang_NumberFormatException(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::NumberFormatException::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::NumberFormatException::_deserializer);

void x10::lang::NumberFormatException::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::IllegalArgumentException::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::lang::NumberFormatException::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::NumberFormatException* this_ = new (::x10aux::alloc_z< ::x10::lang::NumberFormatException>()) ::x10::lang::NumberFormatException();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::NumberFormatException::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::IllegalArgumentException::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::lang::NumberFormatException::rtt;
void x10::lang::NumberFormatException::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::IllegalArgumentException>()};
    rtt.initStageTwo("x10.lang.NumberFormatException",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of NumberFormatException */
/*************************************************/
