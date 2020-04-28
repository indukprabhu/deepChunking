/*************************************************/
/* START of IllegalAccAccess */
#include <x10/lang/IllegalAccAccess.h>

#include <x10/lang/Exception.h>
#include <x10/compiler/Synthetic.h>

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IllegalAccAccess.x10"
::x10::lang::IllegalAccAccess* x10::lang::IllegalAccAccess::x10__lang__IllegalAccAccess____this__x10__lang__IllegalAccAccess(
  ) {
    return this;
    
}
void x10::lang::IllegalAccAccess::_constructor() {
    (this)->::x10::lang::Exception::_constructor();
    ::x10::lang::IllegalAccAccess* this__102962 = this;
    
}
::x10::lang::IllegalAccAccess* x10::lang::IllegalAccAccess::_make(
  ) {
    ::x10::lang::IllegalAccAccess* this_ = new (::x10aux::alloc_z< ::x10::lang::IllegalAccAccess>()) ::x10::lang::IllegalAccAccess();
    this_->_constructor();
    return this_;
}


void x10::lang::IllegalAccAccess::__fieldInitializers_x10_lang_IllegalAccAccess(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::IllegalAccAccess::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::IllegalAccAccess::_deserializer);

void x10::lang::IllegalAccAccess::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::Exception::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::lang::IllegalAccAccess::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::IllegalAccAccess* this_ = new (::x10aux::alloc_z< ::x10::lang::IllegalAccAccess>()) ::x10::lang::IllegalAccAccess();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::IllegalAccAccess::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Exception::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::lang::IllegalAccAccess::rtt;
void x10::lang::IllegalAccAccess::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Exception>()};
    rtt.initStageTwo("x10.lang.IllegalAccAccess",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of IllegalAccAccess */
/*************************************************/
