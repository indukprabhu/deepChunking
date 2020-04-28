/*************************************************/
/* START of ExceptionInInitializer */
#include <x10/lang/ExceptionInInitializer.h>

#include <x10/lang/Exception.h>
#include <x10/lang/String.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/compiler/Synthetic.h>

//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ExceptionInInitializer.x10"
void x10::lang::ExceptionInInitializer::_constructor() {
    (this)->::x10::lang::Exception::_constructor((__extension__ ({ static ::x10::lang::String* strLit__124216 = ::x10aux::makeStringLit("exception in static field initialization"); strLit__124216; })));
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ExceptionInInitializer.x10"
    ::x10::lang::ExceptionInInitializer* this__93710 = this;
    
}
::x10::lang::ExceptionInInitializer* x10::lang::ExceptionInInitializer::_make(
  ) {
    ::x10::lang::ExceptionInInitializer* this_ = new (::x10aux::alloc_z< ::x10::lang::ExceptionInInitializer>()) ::x10::lang::ExceptionInInitializer();
    this_->_constructor();
    return this_;
}



//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ExceptionInInitializer.x10"
void x10::lang::ExceptionInInitializer::_constructor(::x10::lang::String* message) {
    (this)->::x10::lang::Exception::_constructor(message);
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ExceptionInInitializer.x10"
    ::x10::lang::ExceptionInInitializer* this__93711 = this;
    
}
::x10::lang::ExceptionInInitializer* x10::lang::ExceptionInInitializer::_make(
  ::x10::lang::String* message) {
    ::x10::lang::ExceptionInInitializer* this_ = new (::x10aux::alloc_z< ::x10::lang::ExceptionInInitializer>()) ::x10::lang::ExceptionInInitializer();
    this_->_constructor(message);
    return this_;
}



//#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ExceptionInInitializer.x10"
void x10::lang::ExceptionInInitializer::_constructor(::x10::lang::String* message,
                                                     ::x10::lang::CheckedThrowable* cause) {
    (this)->::x10::lang::Exception::_constructor(message, cause);
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ExceptionInInitializer.x10"
    ::x10::lang::ExceptionInInitializer* this__93712 = this;
    
}
::x10::lang::ExceptionInInitializer* x10::lang::ExceptionInInitializer::_make(
  ::x10::lang::String* message, ::x10::lang::CheckedThrowable* cause)
{
    ::x10::lang::ExceptionInInitializer* this_ = new (::x10aux::alloc_z< ::x10::lang::ExceptionInInitializer>()) ::x10::lang::ExceptionInInitializer();
    this_->_constructor(message, cause);
    return this_;
}



//#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ExceptionInInitializer.x10"
void x10::lang::ExceptionInInitializer::_constructor(::x10::lang::CheckedThrowable* cause) {
    (this)->::x10::lang::Exception::_constructor(cause);
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ExceptionInInitializer.x10"
    ::x10::lang::ExceptionInInitializer* this__93713 = this;
    
}
::x10::lang::ExceptionInInitializer* x10::lang::ExceptionInInitializer::_make(
  ::x10::lang::CheckedThrowable* cause) {
    ::x10::lang::ExceptionInInitializer* this_ = new (::x10aux::alloc_z< ::x10::lang::ExceptionInInitializer>()) ::x10::lang::ExceptionInInitializer();
    this_->_constructor(cause);
    return this_;
}



//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ExceptionInInitializer.x10"
::x10::lang::ExceptionInInitializer* x10::lang::ExceptionInInitializer::x10__lang__ExceptionInInitializer____this__x10__lang__ExceptionInInitializer(
  ) {
    return this;
    
}
void x10::lang::ExceptionInInitializer::__fieldInitializers_x10_lang_ExceptionInInitializer(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::ExceptionInInitializer::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::ExceptionInInitializer::_deserializer);

void x10::lang::ExceptionInInitializer::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::Exception::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::lang::ExceptionInInitializer::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::ExceptionInInitializer* this_ = new (::x10aux::alloc_z< ::x10::lang::ExceptionInInitializer>()) ::x10::lang::ExceptionInInitializer();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::ExceptionInInitializer::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Exception::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::lang::ExceptionInInitializer::rtt;
void x10::lang::ExceptionInInitializer::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Exception>()};
    rtt.initStageTwo("x10.lang.ExceptionInInitializer",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of ExceptionInInitializer */
/*************************************************/
