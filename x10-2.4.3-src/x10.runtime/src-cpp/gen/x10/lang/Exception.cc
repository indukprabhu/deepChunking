/*************************************************/
/* START of Exception */
#include <x10/lang/Exception.h>

#include <x10/lang/CheckedException.h>
#include <x10/compiler/Native.h>
#include <x10/lang/String.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/WrappedThrowable.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeRep.h>

//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Exception.x10"
void x10::lang::Exception::_constructor() {
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Exception.x10"
    (this)->::x10::lang::CheckedException::_constructor();
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Exception.x10"
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Exception.x10"
    this->x10::lang::Exception::__fieldInitializers_x10_lang_Exception();
}
::x10::lang::Exception* x10::lang::Exception::_make() {
    ::x10::lang::Exception* this_ = new (::x10aux::alloc_z< ::x10::lang::Exception>()) ::x10::lang::Exception();
    this_->_constructor();
    return this_;
}



//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Exception.x10"
void x10::lang::Exception::_constructor(::x10::lang::String* message) {
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Exception.x10"
    (this)->::x10::lang::CheckedException::_constructor(message);
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Exception.x10"
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Exception.x10"
    this->x10::lang::Exception::__fieldInitializers_x10_lang_Exception();
}
::x10::lang::Exception* x10::lang::Exception::_make(::x10::lang::String* message)
{
    ::x10::lang::Exception* this_ = new (::x10aux::alloc_z< ::x10::lang::Exception>()) ::x10::lang::Exception();
    this_->_constructor(message);
    return this_;
}



//#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Exception.x10"
void x10::lang::Exception::_constructor(::x10::lang::CheckedThrowable* cause) {
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Exception.x10"
    (this)->::x10::lang::CheckedException::_constructor(cause);
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Exception.x10"
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Exception.x10"
    this->x10::lang::Exception::__fieldInitializers_x10_lang_Exception();
}
::x10::lang::Exception* x10::lang::Exception::_make(::x10::lang::CheckedThrowable* cause)
{
    ::x10::lang::Exception* this_ = new (::x10aux::alloc_z< ::x10::lang::Exception>()) ::x10::lang::Exception();
    this_->_constructor(cause);
    return this_;
}



//#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Exception.x10"
void x10::lang::Exception::_constructor(::x10::lang::String* message,
                                        ::x10::lang::CheckedThrowable* cause) {
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Exception.x10"
    (this)->::x10::lang::CheckedException::_constructor(message,
                                                        cause);
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Exception.x10"
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Exception.x10"
    this->x10::lang::Exception::__fieldInitializers_x10_lang_Exception();
}
::x10::lang::Exception* x10::lang::Exception::_make(::x10::lang::String* message,
                                                    ::x10::lang::CheckedThrowable* cause)
{
    ::x10::lang::Exception* this_ = new (::x10aux::alloc_z< ::x10::lang::Exception>()) ::x10::lang::Exception();
    this_->_constructor(message, cause);
    return this_;
}



//#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Exception.x10"
::x10::lang::Exception* x10::lang::Exception::ensureException(
  ::x10::lang::CheckedThrowable* e) {
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Exception.x10"
    return ::x10aux::instanceof< ::x10::lang::Exception*>(e)
      ? ((::x10aux::class_cast< ::x10::lang::Exception*>(e)))
      : ((reinterpret_cast< ::x10::lang::Exception*>(::x10::lang::WrappedThrowable::_make(e))));
    
}

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Exception.x10"
::x10::lang::Exception* x10::lang::Exception::x10__lang__Exception____this__x10__lang__Exception(
  ) {
    return this;
    
}
void x10::lang::Exception::__fieldInitializers_x10_lang_Exception(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::Exception::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::Exception::_deserializer);

void x10::lang::Exception::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::CheckedException::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::lang::Exception::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Exception* this_ = new (::x10aux::alloc_z< ::x10::lang::Exception>()) ::x10::lang::Exception();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::Exception::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::CheckedException::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::lang::Exception::rtt;
void x10::lang::Exception::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::CheckedException>()};
    rtt.initStageTwo("x10.lang.Exception",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of Exception */
/*************************************************/
