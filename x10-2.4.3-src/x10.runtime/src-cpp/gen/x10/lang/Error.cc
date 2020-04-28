/*************************************************/
/* START of Error */
#include <x10/lang/Error.h>

#include <x10/lang/CheckedThrowable.h>
#include <x10/compiler/Native.h>
#include <x10/lang/String.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeRep.h>

//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Error.x10"
void x10::lang::Error::_constructor() {
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Error.x10"
    (this)->::x10::lang::CheckedThrowable::_constructor();
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Error.x10"
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Error.x10"
    this->x10::lang::Error::__fieldInitializers_x10_lang_Error();
}
::x10::lang::Error* x10::lang::Error::_make() {
    ::x10::lang::Error* this_ = new (::x10aux::alloc_z< ::x10::lang::Error>()) ::x10::lang::Error();
    this_->_constructor();
    return this_;
}



//#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Error.x10"
void x10::lang::Error::_constructor(::x10::lang::String* message) {
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Error.x10"
    (this)->::x10::lang::CheckedThrowable::_constructor(message);
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Error.x10"
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Error.x10"
    this->x10::lang::Error::__fieldInitializers_x10_lang_Error();
}
::x10::lang::Error* x10::lang::Error::_make(::x10::lang::String* message)
{
    ::x10::lang::Error* this_ = new (::x10aux::alloc_z< ::x10::lang::Error>()) ::x10::lang::Error();
    this_->_constructor(message);
    return this_;
}



//#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Error.x10"
void x10::lang::Error::_constructor(::x10::lang::CheckedThrowable* cause) {
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Error.x10"
    (this)->::x10::lang::CheckedThrowable::_constructor(cause);
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Error.x10"
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Error.x10"
    this->x10::lang::Error::__fieldInitializers_x10_lang_Error();
}
::x10::lang::Error* x10::lang::Error::_make(::x10::lang::CheckedThrowable* cause)
{
    ::x10::lang::Error* this_ = new (::x10aux::alloc_z< ::x10::lang::Error>()) ::x10::lang::Error();
    this_->_constructor(cause);
    return this_;
}



//#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Error.x10"
void x10::lang::Error::_constructor(::x10::lang::String* message,
                                    ::x10::lang::CheckedThrowable* cause) {
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Error.x10"
    (this)->::x10::lang::CheckedThrowable::_constructor(message, cause);
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Error.x10"
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Error.x10"
    this->x10::lang::Error::__fieldInitializers_x10_lang_Error();
}
::x10::lang::Error* x10::lang::Error::_make(::x10::lang::String* message,
                                            ::x10::lang::CheckedThrowable* cause)
{
    ::x10::lang::Error* this_ = new (::x10aux::alloc_z< ::x10::lang::Error>()) ::x10::lang::Error();
    this_->_constructor(message, cause);
    return this_;
}



//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Error.x10"
::x10::lang::Error* x10::lang::Error::x10__lang__Error____this__x10__lang__Error(
  ) {
    return this;
    
}
void x10::lang::Error::__fieldInitializers_x10_lang_Error(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::Error::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::Error::_deserializer);

void x10::lang::Error::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::CheckedThrowable::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::lang::Error::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Error* this_ = new (::x10aux::alloc_z< ::x10::lang::Error>()) ::x10::lang::Error();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::Error::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::CheckedThrowable::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::lang::Error::rtt;
void x10::lang::Error::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::CheckedThrowable>()};
    rtt.initStageTwo("x10.lang.Error",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of Error */
/*************************************************/
