/*************************************************/
/* START of CompilerFlags */
#include <x10/compiler/CompilerFlags.h>

#include <x10/lang/Boolean.h>
#include <x10/compiler/Native.h>
#include <x10/compiler/CompileTimeConstant.h>
#include <x10/compiler/Synthetic.h>

//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/CompilerFlags.x10"

//#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/CompilerFlags.x10"

//#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/CompilerFlags.x10"

//#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/CompilerFlags.x10"

//#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/CompilerFlags.x10"

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/CompilerFlags.x10"
::x10::compiler::CompilerFlags* x10::compiler::CompilerFlags::x10__compiler__CompilerFlags____this__x10__compiler__CompilerFlags(
  ) {
    return this;
    
}
void x10::compiler::CompilerFlags::_constructor() {
    ::x10::compiler::CompilerFlags* this__76013 = this;
    
}
::x10::compiler::CompilerFlags* x10::compiler::CompilerFlags::_make(
  ) {
    ::x10::compiler::CompilerFlags* this_ = new (::x10aux::alloc_z< ::x10::compiler::CompilerFlags>()) ::x10::compiler::CompilerFlags();
    this_->_constructor();
    return this_;
}


void x10::compiler::CompilerFlags::__fieldInitializers_x10_compiler_CompilerFlags(
  ) {
 
}
const ::x10aux::serialization_id_t x10::compiler::CompilerFlags::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::compiler::CompilerFlags::_deserializer);

void x10::compiler::CompilerFlags::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::compiler::CompilerFlags::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::compiler::CompilerFlags* this_ = new (::x10aux::alloc_z< ::x10::compiler::CompilerFlags>()) ::x10::compiler::CompilerFlags();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::compiler::CompilerFlags::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::compiler::CompilerFlags::rtt;
void x10::compiler::CompilerFlags::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.compiler.CompilerFlags",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of CompilerFlags */
/*************************************************/
