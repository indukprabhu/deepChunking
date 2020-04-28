/*************************************************/
/* START of WrappedThrowable */
#include <x10/lang/WrappedThrowable.h>

#include <x10/lang/Exception.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/String.h>
#include <x10/compiler/Synthetic.h>

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/WrappedThrowable.x10"
void x10::lang::WrappedThrowable::_constructor() {
    (this)->::x10::lang::Exception::_constructor();
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/WrappedThrowable.x10"
    ::x10::lang::WrappedThrowable* this__104672 = this;
    
}
::x10::lang::WrappedThrowable* x10::lang::WrappedThrowable::_make() {
    ::x10::lang::WrappedThrowable* this_ = new (::x10aux::alloc_z< ::x10::lang::WrappedThrowable>()) ::x10::lang::WrappedThrowable();
    this_->_constructor();
    return this_;
}



//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/WrappedThrowable.x10"
void x10::lang::WrappedThrowable::_constructor(::x10::lang::CheckedThrowable* cause) {
    (this)->::x10::lang::Exception::_constructor(cause);
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/WrappedThrowable.x10"
    ::x10::lang::WrappedThrowable* this__104673 = this;
    
}
::x10::lang::WrappedThrowable* x10::lang::WrappedThrowable::_make(::x10::lang::CheckedThrowable* cause)
{
    ::x10::lang::WrappedThrowable* this_ = new (::x10aux::alloc_z< ::x10::lang::WrappedThrowable>()) ::x10::lang::WrappedThrowable();
    this_->_constructor(cause);
    return this_;
}



//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/WrappedThrowable.x10"
void x10::lang::WrappedThrowable::_constructor(::x10::lang::String* message,
                                               ::x10::lang::CheckedThrowable* cause) {
    (this)->::x10::lang::Exception::_constructor(message, cause);
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/WrappedThrowable.x10"
    ::x10::lang::WrappedThrowable* this__104674 = this;
    
}
::x10::lang::WrappedThrowable* x10::lang::WrappedThrowable::_make(
  ::x10::lang::String* message, ::x10::lang::CheckedThrowable* cause)
{
    ::x10::lang::WrappedThrowable* this_ = new (::x10aux::alloc_z< ::x10::lang::WrappedThrowable>()) ::x10::lang::WrappedThrowable();
    this_->_constructor(message, cause);
    return this_;
}



//#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/WrappedThrowable.x10"
::x10::lang::WrappedThrowable* x10::lang::WrappedThrowable::x10__lang__WrappedThrowable____this__x10__lang__WrappedThrowable(
  ) {
    return this;
    
}
void x10::lang::WrappedThrowable::__fieldInitializers_x10_lang_WrappedThrowable(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::WrappedThrowable::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::WrappedThrowable::_deserializer);

void x10::lang::WrappedThrowable::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::Exception::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::lang::WrappedThrowable::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::WrappedThrowable* this_ = new (::x10aux::alloc_z< ::x10::lang::WrappedThrowable>()) ::x10::lang::WrappedThrowable();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::WrappedThrowable::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Exception::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::lang::WrappedThrowable::rtt;
void x10::lang::WrappedThrowable::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Exception>()};
    rtt.initStageTwo("x10.lang.WrappedThrowable",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of WrappedThrowable */
/*************************************************/
