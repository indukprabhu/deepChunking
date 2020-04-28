/*************************************************/
/* START of SerializationException */
#include <x10/io/SerializationException.h>

#include <x10/lang/Exception.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/String.h>
#include <x10/compiler/Synthetic.h>

//#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/SerializationException.x10"
void x10::io::SerializationException::_constructor() {
    (this)->::x10::lang::Exception::_constructor();
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/SerializationException.x10"
    ::x10::io::SerializationException* this__87861 = this;
    
}
::x10::io::SerializationException* x10::io::SerializationException::_make(
  ) {
    ::x10::io::SerializationException* this_ = new (::x10aux::alloc_z< ::x10::io::SerializationException>()) ::x10::io::SerializationException();
    this_->_constructor();
    return this_;
}



//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/SerializationException.x10"
void x10::io::SerializationException::_constructor(::x10::lang::CheckedThrowable* cause) {
    (this)->::x10::lang::Exception::_constructor(cause);
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/SerializationException.x10"
    ::x10::io::SerializationException* this__87862 = this;
    
}
::x10::io::SerializationException* x10::io::SerializationException::_make(
  ::x10::lang::CheckedThrowable* cause) {
    ::x10::io::SerializationException* this_ = new (::x10aux::alloc_z< ::x10::io::SerializationException>()) ::x10::io::SerializationException();
    this_->_constructor(cause);
    return this_;
}



//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/SerializationException.x10"
void x10::io::SerializationException::_constructor(::x10::lang::String* message) {
    (this)->::x10::lang::Exception::_constructor(message);
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/SerializationException.x10"
    ::x10::io::SerializationException* this__87863 = this;
    
}
::x10::io::SerializationException* x10::io::SerializationException::_make(
  ::x10::lang::String* message) {
    ::x10::io::SerializationException* this_ = new (::x10aux::alloc_z< ::x10::io::SerializationException>()) ::x10::io::SerializationException();
    this_->_constructor(message);
    return this_;
}



//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/SerializationException.x10"
void x10::io::SerializationException::_constructor(::x10::lang::String* message,
                                                   ::x10::lang::CheckedThrowable* cause) {
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/SerializationException.x10"
    (this)->::x10::lang::Exception::_constructor(message, cause);
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/SerializationException.x10"
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/SerializationException.x10"
    ::x10::io::SerializationException* this__87864 = this;
    
}
::x10::io::SerializationException* x10::io::SerializationException::_make(
  ::x10::lang::String* message, ::x10::lang::CheckedThrowable* cause) {
    ::x10::io::SerializationException* this_ = new (::x10aux::alloc_z< ::x10::io::SerializationException>()) ::x10::io::SerializationException();
    this_->_constructor(message, cause);
    return this_;
}



//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/SerializationException.x10"
::x10::io::SerializationException* x10::io::SerializationException::x10__io__SerializationException____this__x10__io__SerializationException(
  ) {
    return this;
    
}
void x10::io::SerializationException::__fieldInitializers_x10_io_SerializationException(
  ) {
 
}
const ::x10aux::serialization_id_t x10::io::SerializationException::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::io::SerializationException::_deserializer);

void x10::io::SerializationException::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::Exception::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::io::SerializationException::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::io::SerializationException* this_ = new (::x10aux::alloc_z< ::x10::io::SerializationException>()) ::x10::io::SerializationException();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::io::SerializationException::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Exception::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::io::SerializationException::rtt;
void x10::io::SerializationException::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Exception>()};
    rtt.initStageTwo("x10.io.SerializationException",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of SerializationException */
/*************************************************/
