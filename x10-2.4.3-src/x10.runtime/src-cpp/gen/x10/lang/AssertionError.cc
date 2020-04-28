/*************************************************/
/* START of AssertionError */
#include <x10/lang/AssertionError.h>

#include <x10/lang/Error.h>
#include <x10/compiler/Native.h>
#include <x10/lang/String.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeRep.h>

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/AssertionError.x10"
void x10::lang::AssertionError::_constructor() {
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/AssertionError.x10"
    (this)->::x10::lang::Error::_constructor();
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/AssertionError.x10"
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/AssertionError.x10"
    this->x10::lang::AssertionError::__fieldInitializers_x10_lang_AssertionError();
}
::x10::lang::AssertionError* x10::lang::AssertionError::_make() {
    ::x10::lang::AssertionError* this_ = new (::x10aux::alloc_z< ::x10::lang::AssertionError>()) ::x10::lang::AssertionError();
    this_->_constructor();
    return this_;
}



//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/AssertionError.x10"
void x10::lang::AssertionError::_constructor(::x10::lang::String* message) {
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/AssertionError.x10"
    (this)->::x10::lang::Error::_constructor(message);
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/AssertionError.x10"
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/AssertionError.x10"
    this->x10::lang::AssertionError::__fieldInitializers_x10_lang_AssertionError();
}
::x10::lang::AssertionError* x10::lang::AssertionError::_make(::x10::lang::String* message)
{
    ::x10::lang::AssertionError* this_ = new (::x10aux::alloc_z< ::x10::lang::AssertionError>()) ::x10::lang::AssertionError();
    this_->_constructor(message);
    return this_;
}



//#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/AssertionError.x10"
void x10::lang::AssertionError::_constructor(::x10::lang::String* message,
                                             ::x10::lang::CheckedThrowable* cause) {
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/AssertionError.x10"
    (this)->::x10::lang::Error::_constructor(message, cause);
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/AssertionError.x10"
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/AssertionError.x10"
    this->x10::lang::AssertionError::__fieldInitializers_x10_lang_AssertionError();
}
::x10::lang::AssertionError* x10::lang::AssertionError::_make(::x10::lang::String* message,
                                                              ::x10::lang::CheckedThrowable* cause)
{
    ::x10::lang::AssertionError* this_ = new (::x10aux::alloc_z< ::x10::lang::AssertionError>()) ::x10::lang::AssertionError();
    this_->_constructor(message, cause);
    return this_;
}



//#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/AssertionError.x10"
void x10::lang::AssertionError::_constructor(::x10::lang::CheckedThrowable* cause) {
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/AssertionError.x10"
    (this)->::x10::lang::Error::_constructor(cause);
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/AssertionError.x10"
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/AssertionError.x10"
    this->x10::lang::AssertionError::__fieldInitializers_x10_lang_AssertionError();
}
::x10::lang::AssertionError* x10::lang::AssertionError::_make(
  ::x10::lang::CheckedThrowable* cause) {
    ::x10::lang::AssertionError* this_ = new (::x10aux::alloc_z< ::x10::lang::AssertionError>()) ::x10::lang::AssertionError();
    this_->_constructor(cause);
    return this_;
}



//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/AssertionError.x10"
::x10::lang::AssertionError* x10::lang::AssertionError::x10__lang__AssertionError____this__x10__lang__AssertionError(
  ) {
    return this;
    
}
void x10::lang::AssertionError::__fieldInitializers_x10_lang_AssertionError(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::AssertionError::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::AssertionError::_deserializer);

void x10::lang::AssertionError::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::Error::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::lang::AssertionError::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::AssertionError* this_ = new (::x10aux::alloc_z< ::x10::lang::AssertionError>()) ::x10::lang::AssertionError();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::AssertionError::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Error::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::lang::AssertionError::rtt;
void x10::lang::AssertionError::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Error>()};
    rtt.initStageTwo("x10.lang.AssertionError",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of AssertionError */
/*************************************************/
