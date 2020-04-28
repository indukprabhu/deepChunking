/*************************************************/
/* START of Zero */
#include <x10/lang/Zero.h>


//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Zero.x10"

//#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Zero.x10"
::x10::lang::Zero* x10::lang::Zero::x10__lang__Zero____this__x10__lang__Zero(
  ) {
    return this;
    
}
void x10::lang::Zero::_constructor() {
    ::x10::lang::Zero* this__104682 = this;
    
}
::x10::lang::Zero* x10::lang::Zero::_make() {
    ::x10::lang::Zero* this_ = new (::x10aux::alloc_z< ::x10::lang::Zero>()) ::x10::lang::Zero();
    this_->_constructor();
    return this_;
}


void x10::lang::Zero::__fieldInitializers_x10_lang_Zero() {
 
}
const ::x10aux::serialization_id_t x10::lang::Zero::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::Zero::_deserializer);

void x10::lang::Zero::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::lang::Zero::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Zero* this_ = new (::x10aux::alloc_z< ::x10::lang::Zero>()) ::x10::lang::Zero();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::Zero::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::lang::Zero::rtt;
void x10::lang::Zero::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.lang.Zero",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of Zero */
/*************************************************/
