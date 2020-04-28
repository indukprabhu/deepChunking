/*************************************************/
/* START of Fences */
#include <x10/util/concurrent/Fences.h>

#include <x10/compiler/Native.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeCPPInclude.h>

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Fences.x10"

//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Fences.x10"

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Fences.x10"

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Fences.x10"

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Fences.x10"
::x10::util::concurrent::Fences* x10::util::concurrent::Fences::x10__util__concurrent__Fences____this__x10__util__concurrent__Fences(
  ) {
    return this;
    
}

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Fences.x10"
void x10::util::concurrent::Fences::_constructor() {
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Fences.x10"
    ::x10::util::concurrent::Fences* this__117259 = this;
    
}
::x10::util::concurrent::Fences* x10::util::concurrent::Fences::_make(
  ) {
    ::x10::util::concurrent::Fences* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::Fences>()) ::x10::util::concurrent::Fences();
    this_->_constructor();
    return this_;
}



//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Fences.x10"
void x10::util::concurrent::Fences::__fieldInitializers_x10_util_concurrent_Fences(
  ) {
 
}
const ::x10aux::serialization_id_t x10::util::concurrent::Fences::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::concurrent::Fences::_deserializer);

void x10::util::concurrent::Fences::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::util::concurrent::Fences::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::concurrent::Fences* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::Fences>()) ::x10::util::concurrent::Fences();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::util::concurrent::Fences::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::util::concurrent::Fences::rtt;
void x10::util::concurrent::Fences::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.util.concurrent.Fences",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of Fences */
/*************************************************/
