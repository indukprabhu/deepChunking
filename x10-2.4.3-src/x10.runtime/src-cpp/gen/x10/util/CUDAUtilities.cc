/*************************************************/
/* START of CUDAUtilities */
#include <x10/util/CUDAUtilities.h>


//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
x10_int x10::util::CUDAUtilities::autoBlocks() {
    return ((x10_int)8);
    
}

//#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
x10_int x10::util::CUDAUtilities::autoThreads() {
    return ((x10_int)1);
    
}

//#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"

//#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"

//#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"

//#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"

//#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"

//#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"

//#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"

//#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
x10_int x10::util::CUDAUtilities::mul24(x10_int a, x10_int b) {
    
    //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
    return ((a) * (b));
    
}

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
::x10::util::CUDAUtilities* x10::util::CUDAUtilities::x10__util__CUDAUtilities____this__x10__util__CUDAUtilities(
  ) {
    return this;
    
}
void x10::util::CUDAUtilities::_constructor() {
    ::x10::util::CUDAUtilities* this__117493 = this;
    
}
::x10::util::CUDAUtilities* x10::util::CUDAUtilities::_make() {
    ::x10::util::CUDAUtilities* this_ = new (::x10aux::alloc_z< ::x10::util::CUDAUtilities>()) ::x10::util::CUDAUtilities();
    this_->_constructor();
    return this_;
}


void x10::util::CUDAUtilities::__fieldInitializers_x10_util_CUDAUtilities(
  ) {
 
}
const ::x10aux::serialization_id_t x10::util::CUDAUtilities::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::CUDAUtilities::_deserializer);

void x10::util::CUDAUtilities::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::util::CUDAUtilities::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::CUDAUtilities* this_ = new (::x10aux::alloc_z< ::x10::util::CUDAUtilities>()) ::x10::util::CUDAUtilities();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::util::CUDAUtilities::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::util::CUDAUtilities::rtt;
void x10::util::CUDAUtilities::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.util.CUDAUtilities",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of CUDAUtilities */
/*************************************************/
