/*************************************************/
/* START of CheckedException */
#include <x10/lang/CheckedException.h>

#include <x10/lang/CheckedThrowable.h>
#include <x10/compiler/Native.h>
#include <x10/lang/String.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeRep.h>

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CheckedException.x10"
void x10::lang::CheckedException::_constructor() {
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CheckedException.x10"
    (this)->::x10::lang::CheckedThrowable::_constructor();
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CheckedException.x10"
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CheckedException.x10"
    this->x10::lang::CheckedException::__fieldInitializers_x10_lang_CheckedException();
}
::x10::lang::CheckedException* x10::lang::CheckedException::_make() {
    ::x10::lang::CheckedException* this_ = new (::x10aux::alloc_z< ::x10::lang::CheckedException>()) ::x10::lang::CheckedException();
    this_->_constructor();
    return this_;
}



//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CheckedException.x10"
void x10::lang::CheckedException::_constructor(::x10::lang::String* message) {
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CheckedException.x10"
    (this)->::x10::lang::CheckedThrowable::_constructor(message);
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CheckedException.x10"
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CheckedException.x10"
    this->x10::lang::CheckedException::__fieldInitializers_x10_lang_CheckedException();
}
::x10::lang::CheckedException* x10::lang::CheckedException::_make(::x10::lang::String* message)
{
    ::x10::lang::CheckedException* this_ = new (::x10aux::alloc_z< ::x10::lang::CheckedException>()) ::x10::lang::CheckedException();
    this_->_constructor(message);
    return this_;
}



//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CheckedException.x10"
void x10::lang::CheckedException::_constructor(::x10::lang::CheckedThrowable* cause) {
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CheckedException.x10"
    (this)->::x10::lang::CheckedThrowable::_constructor(cause);
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CheckedException.x10"
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CheckedException.x10"
    this->x10::lang::CheckedException::__fieldInitializers_x10_lang_CheckedException();
}
::x10::lang::CheckedException* x10::lang::CheckedException::_make(
  ::x10::lang::CheckedThrowable* cause) {
    ::x10::lang::CheckedException* this_ = new (::x10aux::alloc_z< ::x10::lang::CheckedException>()) ::x10::lang::CheckedException();
    this_->_constructor(cause);
    return this_;
}



//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CheckedException.x10"
void x10::lang::CheckedException::_constructor(::x10::lang::String* message,
                                               ::x10::lang::CheckedThrowable* cause) {
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CheckedException.x10"
    (this)->::x10::lang::CheckedThrowable::_constructor(message, cause);
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CheckedException.x10"
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CheckedException.x10"
    this->x10::lang::CheckedException::__fieldInitializers_x10_lang_CheckedException();
}
::x10::lang::CheckedException* x10::lang::CheckedException::_make(
  ::x10::lang::String* message, ::x10::lang::CheckedThrowable* cause)
{
    ::x10::lang::CheckedException* this_ = new (::x10aux::alloc_z< ::x10::lang::CheckedException>()) ::x10::lang::CheckedException();
    this_->_constructor(message, cause);
    return this_;
}



//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/CheckedException.x10"
::x10::lang::CheckedException* x10::lang::CheckedException::x10__lang__CheckedException____this__x10__lang__CheckedException(
  ) {
    return this;
    
}
void x10::lang::CheckedException::__fieldInitializers_x10_lang_CheckedException(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::CheckedException::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::CheckedException::_deserializer);

void x10::lang::CheckedException::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::CheckedThrowable::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::lang::CheckedException::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::CheckedException* this_ = new (::x10aux::alloc_z< ::x10::lang::CheckedException>()) ::x10::lang::CheckedException();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::CheckedException::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::CheckedThrowable::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::lang::CheckedException::rtt;
void x10::lang::CheckedException::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::CheckedThrowable>()};
    rtt.initStageTwo("x10.lang.CheckedException",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of CheckedException */
/*************************************************/
