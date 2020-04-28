/*************************************************/
/* START of RailUtils */
#include <x10/util/RailUtils.h>


//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"

//#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"

//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"

//#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"

//#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"

//#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"

//#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"

//#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"

//#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"

//#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"

//#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
::x10::util::RailUtils* x10::util::RailUtils::x10__util__RailUtils____this__x10__util__RailUtils(
  ) {
    return this;
    
}
void x10::util::RailUtils::_constructor() {
    ::x10::util::RailUtils* this__121840 = this;
    
}
::x10::util::RailUtils* x10::util::RailUtils::_make() {
    ::x10::util::RailUtils* this_ = new (::x10aux::alloc_z< ::x10::util::RailUtils>()) ::x10::util::RailUtils();
    this_->_constructor();
    return this_;
}


void x10::util::RailUtils::__fieldInitializers_x10_util_RailUtils(
  ) {
 
}
const ::x10aux::serialization_id_t x10::util::RailUtils::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::RailUtils::_deserializer);

void x10::util::RailUtils::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::util::RailUtils::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::RailUtils* this_ = new (::x10aux::alloc_z< ::x10::util::RailUtils>()) ::x10::util::RailUtils();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::util::RailUtils::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::util::RailUtils::rtt;
void x10::util::RailUtils::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.util.RailUtils",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of RailUtils */
/*************************************************/
