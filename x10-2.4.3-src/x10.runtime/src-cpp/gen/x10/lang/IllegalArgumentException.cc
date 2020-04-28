/*************************************************/
/* START of IllegalArgumentException */
#include <x10/lang/IllegalArgumentException.h>

#include <x10/lang/Exception.h>
#include <x10/compiler/Native.h>
#include <x10/lang/String.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeRep.h>

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IllegalArgumentException.x10"
void x10::lang::IllegalArgumentException::_constructor() {
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IllegalArgumentException.x10"
    (this)->::x10::lang::Exception::_constructor();
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IllegalArgumentException.x10"
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IllegalArgumentException.x10"
    this->x10::lang::IllegalArgumentException::__fieldInitializers_x10_lang_IllegalArgumentException();
}
::x10::lang::IllegalArgumentException* x10::lang::IllegalArgumentException::_make(
  ) {
    ::x10::lang::IllegalArgumentException* this_ = new (::x10aux::alloc_z< ::x10::lang::IllegalArgumentException>()) ::x10::lang::IllegalArgumentException();
    this_->_constructor();
    return this_;
}



//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IllegalArgumentException.x10"
void x10::lang::IllegalArgumentException::_constructor(::x10::lang::String* message) {
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IllegalArgumentException.x10"
    (this)->::x10::lang::Exception::_constructor(message);
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IllegalArgumentException.x10"
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IllegalArgumentException.x10"
    this->x10::lang::IllegalArgumentException::__fieldInitializers_x10_lang_IllegalArgumentException();
}
::x10::lang::IllegalArgumentException* x10::lang::IllegalArgumentException::_make(
  ::x10::lang::String* message) {
    ::x10::lang::IllegalArgumentException* this_ = new (::x10aux::alloc_z< ::x10::lang::IllegalArgumentException>()) ::x10::lang::IllegalArgumentException();
    this_->_constructor(message);
    return this_;
}



//#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IllegalArgumentException.x10"
void x10::lang::IllegalArgumentException::_constructor(::x10::lang::String* message,
                                                       ::x10::lang::CheckedThrowable* cause) {
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IllegalArgumentException.x10"
    (this)->::x10::lang::Exception::_constructor(message,
                                                 cause);
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IllegalArgumentException.x10"
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IllegalArgumentException.x10"
    this->x10::lang::IllegalArgumentException::__fieldInitializers_x10_lang_IllegalArgumentException();
}
::x10::lang::IllegalArgumentException* x10::lang::IllegalArgumentException::_make(
  ::x10::lang::String* message, ::x10::lang::CheckedThrowable* cause)
{
    ::x10::lang::IllegalArgumentException* this_ = new (::x10aux::alloc_z< ::x10::lang::IllegalArgumentException>()) ::x10::lang::IllegalArgumentException();
    this_->_constructor(message, cause);
    return this_;
}



//#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IllegalArgumentException.x10"
void x10::lang::IllegalArgumentException::_constructor(::x10::lang::CheckedThrowable* cause) {
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IllegalArgumentException.x10"
    (this)->::x10::lang::Exception::_constructor(cause);
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IllegalArgumentException.x10"
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IllegalArgumentException.x10"
    this->x10::lang::IllegalArgumentException::__fieldInitializers_x10_lang_IllegalArgumentException();
}
::x10::lang::IllegalArgumentException* x10::lang::IllegalArgumentException::_make(
  ::x10::lang::CheckedThrowable* cause) {
    ::x10::lang::IllegalArgumentException* this_ = new (::x10aux::alloc_z< ::x10::lang::IllegalArgumentException>()) ::x10::lang::IllegalArgumentException();
    this_->_constructor(cause);
    return this_;
}



//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IllegalArgumentException.x10"
::x10::lang::IllegalArgumentException* x10::lang::IllegalArgumentException::x10__lang__IllegalArgumentException____this__x10__lang__IllegalArgumentException(
  ) {
    return this;
    
}
void x10::lang::IllegalArgumentException::__fieldInitializers_x10_lang_IllegalArgumentException(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::IllegalArgumentException::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::IllegalArgumentException::_deserializer);

void x10::lang::IllegalArgumentException::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::Exception::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::lang::IllegalArgumentException::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::IllegalArgumentException* this_ = new (::x10aux::alloc_z< ::x10::lang::IllegalArgumentException>()) ::x10::lang::IllegalArgumentException();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::IllegalArgumentException::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Exception::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::lang::IllegalArgumentException::rtt;
void x10::lang::IllegalArgumentException::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Exception>()};
    rtt.initStageTwo("x10.lang.IllegalArgumentException",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of IllegalArgumentException */
/*************************************************/
