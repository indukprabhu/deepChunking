/*************************************************/
/* START of ClockUseException */
#include <x10/lang/ClockUseException.h>

#include <x10/lang/Exception.h>
#include <x10/lang/String.h>
#include <x10/compiler/Synthetic.h>

//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ClockUseException.x10"
void x10::lang::ClockUseException::_constructor() {
    (this)->::x10::lang::Exception::_constructor((__extension__ ({ static ::x10::lang::String* strLit__124154 = ::x10aux::makeStringLit("clock use exception"); strLit__124154; })));
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ClockUseException.x10"
    ::x10::lang::ClockUseException* this__93081 = this;
    
}
::x10::lang::ClockUseException* x10::lang::ClockUseException::_make() {
    ::x10::lang::ClockUseException* this_ = new (::x10aux::alloc_z< ::x10::lang::ClockUseException>()) ::x10::lang::ClockUseException();
    this_->_constructor();
    return this_;
}



//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ClockUseException.x10"
void x10::lang::ClockUseException::_constructor(::x10::lang::String* message) {
    (this)->::x10::lang::Exception::_constructor(message);
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ClockUseException.x10"
    ::x10::lang::ClockUseException* this__93082 = this;
    
}
::x10::lang::ClockUseException* x10::lang::ClockUseException::_make(::x10::lang::String* message)
{
    ::x10::lang::ClockUseException* this_ = new (::x10aux::alloc_z< ::x10::lang::ClockUseException>()) ::x10::lang::ClockUseException();
    this_->_constructor(message);
    return this_;
}



//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ClockUseException.x10"
::x10::lang::ClockUseException* x10::lang::ClockUseException::x10__lang__ClockUseException____this__x10__lang__ClockUseException(
  ) {
    return this;
    
}
void x10::lang::ClockUseException::__fieldInitializers_x10_lang_ClockUseException(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::ClockUseException::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::ClockUseException::_deserializer);

void x10::lang::ClockUseException::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::Exception::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::lang::ClockUseException::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::ClockUseException* this_ = new (::x10aux::alloc_z< ::x10::lang::ClockUseException>()) ::x10::lang::ClockUseException();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::ClockUseException::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Exception::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::lang::ClockUseException::rtt;
void x10::lang::ClockUseException::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Exception>()};
    rtt.initStageTwo("x10.lang.ClockUseException",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of ClockUseException */
/*************************************************/
