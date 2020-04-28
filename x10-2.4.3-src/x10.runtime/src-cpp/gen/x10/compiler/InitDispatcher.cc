/*************************************************/
/* START of InitDispatcher */
#include <x10/compiler/InitDispatcher.h>

#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeRep.h>

//#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/InitDispatcher.x10"
::x10::compiler::InitDispatcher* x10::compiler::InitDispatcher::x10__compiler__InitDispatcher____this__x10__compiler__InitDispatcher(
  ) {
    return this;
    
}

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/InitDispatcher.x10"
void x10::compiler::InitDispatcher::_constructor() {
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/InitDispatcher.x10"
    this->x10::compiler::InitDispatcher::__fieldInitializers_x10_compiler_InitDispatcher();
}
::x10::compiler::InitDispatcher* x10::compiler::InitDispatcher::_make(
  ) {
    ::x10::compiler::InitDispatcher* this_ = new (::x10aux::alloc_z< ::x10::compiler::InitDispatcher>()) ::x10::compiler::InitDispatcher();
    this_->_constructor();
    return this_;
}



//#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/InitDispatcher.x10"
void x10::compiler::InitDispatcher::__fieldInitializers_x10_compiler_InitDispatcher(
  ) {
 
}
const ::x10aux::serialization_id_t x10::compiler::InitDispatcher::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::compiler::InitDispatcher::_deserializer);

void x10::compiler::InitDispatcher::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::compiler::InitDispatcher::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::compiler::InitDispatcher* this_ = new (::x10aux::alloc_z< ::x10::compiler::InitDispatcher>()) ::x10::compiler::InitDispatcher();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::compiler::InitDispatcher::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::compiler::InitDispatcher::rtt;
void x10::compiler::InitDispatcher::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.compiler.InitDispatcher",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of InitDispatcher */
/*************************************************/
