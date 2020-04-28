/*************************************************/
/* START of X10JavaDeserializer */
#include <x10/compiler/X10JavaDeserializer.h>

#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeRep.h>

//#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/X10JavaDeserializer.x10"
::x10::compiler::X10JavaDeserializer* x10::compiler::X10JavaDeserializer::x10__compiler__X10JavaDeserializer____this__x10__compiler__X10JavaDeserializer(
  ) {
    return this;
    
}

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/X10JavaDeserializer.x10"
void x10::compiler::X10JavaDeserializer::_constructor() {
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/X10JavaDeserializer.x10"
    this->x10::compiler::X10JavaDeserializer::__fieldInitializers_x10_compiler_X10JavaDeserializer();
}
::x10::compiler::X10JavaDeserializer* x10::compiler::X10JavaDeserializer::_make(
  ) {
    ::x10::compiler::X10JavaDeserializer* this_ = new (::x10aux::alloc_z< ::x10::compiler::X10JavaDeserializer>()) ::x10::compiler::X10JavaDeserializer();
    this_->_constructor();
    return this_;
}



//#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/X10JavaDeserializer.x10"
void x10::compiler::X10JavaDeserializer::__fieldInitializers_x10_compiler_X10JavaDeserializer(
  ) {
 
}
const ::x10aux::serialization_id_t x10::compiler::X10JavaDeserializer::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::compiler::X10JavaDeserializer::_deserializer);

void x10::compiler::X10JavaDeserializer::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::compiler::X10JavaDeserializer::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::compiler::X10JavaDeserializer* this_ = new (::x10aux::alloc_z< ::x10::compiler::X10JavaDeserializer>()) ::x10::compiler::X10JavaDeserializer();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::compiler::X10JavaDeserializer::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::compiler::X10JavaDeserializer::rtt;
void x10::compiler::X10JavaDeserializer::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.compiler.X10JavaDeserializer",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of X10JavaDeserializer */
/*************************************************/
