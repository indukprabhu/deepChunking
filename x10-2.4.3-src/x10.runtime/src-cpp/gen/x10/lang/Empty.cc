/*************************************************/
/* START of Empty */
#include <x10/lang/Empty.h>

#include <x10/compiler/Synthetic.h>

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Empty.x10"
::x10::lang::Empty* x10::lang::Empty::x10__lang__Empty____this__x10__lang__Empty(
  ) {
    return this;
    
}
void x10::lang::Empty::_constructor() {
    ::x10::lang::Empty* this__93697 = this;
    
}
::x10::lang::Empty* x10::lang::Empty::_make() {
    ::x10::lang::Empty* this_ = new (::x10aux::alloc_z< ::x10::lang::Empty>()) ::x10::lang::Empty();
    this_->_constructor();
    return this_;
}


void x10::lang::Empty::__fieldInitializers_x10_lang_Empty() {
 
}
const ::x10aux::serialization_id_t x10::lang::Empty::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::Empty::_deserializer);

void x10::lang::Empty::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::lang::Empty::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Empty* this_ = new (::x10aux::alloc_z< ::x10::lang::Empty>()) ::x10::lang::Empty();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::Empty::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::lang::Empty::rtt;
void x10::lang::Empty::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.lang.Empty",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of Empty */
/*************************************************/
