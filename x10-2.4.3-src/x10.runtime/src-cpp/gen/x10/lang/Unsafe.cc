/*************************************************/
/* START of Unsafe */
#include <x10/lang/Unsafe.h>


//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"

//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"

//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"

//#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"

//#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"

//#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"

//#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"

//#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"

//#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
::x10::lang::Unsafe* x10::lang::Unsafe::x10__lang__Unsafe____this__x10__lang__Unsafe(
  ) {
    return this;
    
}

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
void x10::lang::Unsafe::_constructor() {
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
    ::x10::lang::Unsafe* this__104662 = this;
    
}
::x10::lang::Unsafe* x10::lang::Unsafe::_make() {
    ::x10::lang::Unsafe* this_ = new (::x10aux::alloc_z< ::x10::lang::Unsafe>()) ::x10::lang::Unsafe();
    this_->_constructor();
    return this_;
}



//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
void x10::lang::Unsafe::__fieldInitializers_x10_lang_Unsafe() {
 
}
const ::x10aux::serialization_id_t x10::lang::Unsafe::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::Unsafe::_deserializer);

void x10::lang::Unsafe::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::lang::Unsafe::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Unsafe* this_ = new (::x10aux::alloc_z< ::x10::lang::Unsafe>()) ::x10::lang::Unsafe();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::Unsafe::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::lang::Unsafe::rtt;
void x10::lang::Unsafe::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.lang.Unsafe",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of Unsafe */
/*************************************************/
