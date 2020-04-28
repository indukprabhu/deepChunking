/*************************************************/
/* START of MissingResourceException */
#include <x10/util/MissingResourceException.h>

#include <x10/lang/Exception.h>
#include <x10/lang/String.h>
#include <x10/compiler/Native.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeRep.h>

//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MissingResourceException.x10"

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MissingResourceException.x10"

//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MissingResourceException.x10"
void x10::util::MissingResourceException::_constructor(::x10::lang::String* message,
                                                       ::x10::lang::String* className,
                                                       ::x10::lang::String* key) {
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MissingResourceException.x10"
    (this)->::x10::lang::Exception::_constructor(message);
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MissingResourceException.x10"
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MissingResourceException.x10"
    this->x10::util::MissingResourceException::__fieldInitializers_x10_util_MissingResourceException();
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MissingResourceException.x10"
    this->FMGL(className) = className;
    this->FMGL(key) = key;
}
::x10::util::MissingResourceException* x10::util::MissingResourceException::_make(
  ::x10::lang::String* message, ::x10::lang::String* className,
  ::x10::lang::String* key) {
    ::x10::util::MissingResourceException* this_ = new (::x10aux::alloc_z< ::x10::util::MissingResourceException>()) ::x10::util::MissingResourceException();
    this_->_constructor(message, className, key);
    return this_;
}



//#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MissingResourceException.x10"
void x10::util::MissingResourceException::_constructor(::x10::lang::String* message,
                                                       ::x10::lang::String* className,
                                                       ::x10::lang::String* key,
                                                       ::x10::lang::CheckedThrowable* cause) {
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MissingResourceException.x10"
    (this)->::x10::lang::Exception::_constructor(message,
                                                 cause);
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MissingResourceException.x10"
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MissingResourceException.x10"
    this->x10::util::MissingResourceException::__fieldInitializers_x10_util_MissingResourceException();
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MissingResourceException.x10"
    this->FMGL(className) = className;
    this->FMGL(key) = key;
}
::x10::util::MissingResourceException* x10::util::MissingResourceException::_make(
  ::x10::lang::String* message, ::x10::lang::String* className,
  ::x10::lang::String* key, ::x10::lang::CheckedThrowable* cause)
{
    ::x10::util::MissingResourceException* this_ = new (::x10aux::alloc_z< ::x10::util::MissingResourceException>()) ::x10::util::MissingResourceException();
    this_->_constructor(message, className, key, cause);
    return this_;
}



//#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MissingResourceException.x10"
::x10::lang::String* x10::util::MissingResourceException::getClassName(
  ) {
    
    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MissingResourceException.x10"
    return this->FMGL(className);
    
}

//#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MissingResourceException.x10"
::x10::lang::String* x10::util::MissingResourceException::getKey(
  ) {
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MissingResourceException.x10"
    return this->FMGL(key);
    
}

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MissingResourceException.x10"
::x10::util::MissingResourceException* x10::util::MissingResourceException::x10__util__MissingResourceException____this__x10__util__MissingResourceException(
  ) {
    return this;
    
}
void x10::util::MissingResourceException::__fieldInitializers_x10_util_MissingResourceException(
  ) {
 
}
const ::x10aux::serialization_id_t x10::util::MissingResourceException::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::MissingResourceException::_deserializer);

void x10::util::MissingResourceException::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::Exception::_serialize_body(buf);
    buf.write(this->FMGL(className));
    buf.write(this->FMGL(key));
    
}

::x10::lang::Reference* ::x10::util::MissingResourceException::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::MissingResourceException* this_ = new (::x10aux::alloc_z< ::x10::util::MissingResourceException>()) ::x10::util::MissingResourceException();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::util::MissingResourceException::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Exception::_deserialize_body(buf);
    FMGL(className) = buf.read< ::x10::lang::String*>();
    FMGL(key) = buf.read< ::x10::lang::String*>();
}

::x10aux::RuntimeType x10::util::MissingResourceException::rtt;
void x10::util::MissingResourceException::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Exception>()};
    rtt.initStageTwo("x10.util.MissingResourceException",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of MissingResourceException */
/*************************************************/
