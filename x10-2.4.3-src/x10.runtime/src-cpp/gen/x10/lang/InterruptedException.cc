/*************************************************/
/* START of InterruptedException */
#include <x10/lang/InterruptedException.h>

#include <x10/lang/Exception.h>
#include <x10/lang/String.h>
#include <x10/compiler/Synthetic.h>

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/InterruptedException.x10"
void x10::lang::InterruptedException::_constructor() {
    (this)->::x10::lang::Exception::_constructor();
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/InterruptedException.x10"
    ::x10::lang::InterruptedException* this__102977 = this;
    
}
::x10::lang::InterruptedException* x10::lang::InterruptedException::_make(
  ) {
    ::x10::lang::InterruptedException* this_ = new (::x10aux::alloc_z< ::x10::lang::InterruptedException>()) ::x10::lang::InterruptedException();
    this_->_constructor();
    return this_;
}



//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/InterruptedException.x10"
void x10::lang::InterruptedException::_constructor(::x10::lang::String* message) {
    (this)->::x10::lang::Exception::_constructor(message);
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/InterruptedException.x10"
    ::x10::lang::InterruptedException* this__102978 = this;
    
}
::x10::lang::InterruptedException* x10::lang::InterruptedException::_make(
  ::x10::lang::String* message) {
    ::x10::lang::InterruptedException* this_ = new (::x10aux::alloc_z< ::x10::lang::InterruptedException>()) ::x10::lang::InterruptedException();
    this_->_constructor(message);
    return this_;
}



//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/InterruptedException.x10"
::x10::lang::InterruptedException* x10::lang::InterruptedException::x10__lang__InterruptedException____this__x10__lang__InterruptedException(
  ) {
    return this;
    
}
void x10::lang::InterruptedException::__fieldInitializers_x10_lang_InterruptedException(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::InterruptedException::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::InterruptedException::_deserializer);

void x10::lang::InterruptedException::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::Exception::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::lang::InterruptedException::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::InterruptedException* this_ = new (::x10aux::alloc_z< ::x10::lang::InterruptedException>()) ::x10::lang::InterruptedException();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::InterruptedException::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Exception::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::lang::InterruptedException::rtt;
void x10::lang::InterruptedException::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Exception>()};
    rtt.initStageTwo("x10.lang.InterruptedException",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of InterruptedException */
/*************************************************/
