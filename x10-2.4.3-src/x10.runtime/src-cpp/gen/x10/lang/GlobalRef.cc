/*************************************************/
/* START of GlobalRef$LocalEval */
#include <x10/lang/GlobalRef__LocalEval.h>


//#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRef.x10"

//#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRef.x10"

//#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRef.x10"
::x10::lang::GlobalRef__LocalEval* x10::lang::GlobalRef__LocalEval::x10__lang__GlobalRef__LocalEval____this__x10__lang__GlobalRef__LocalEval(
  ) {
    return this;
    
}
void x10::lang::GlobalRef__LocalEval::_constructor() {
    this->x10::lang::GlobalRef__LocalEval::__fieldInitializers_x10_lang_GlobalRef_LocalEval();
}
::x10::lang::GlobalRef__LocalEval* x10::lang::GlobalRef__LocalEval::_make(
  ) {
    ::x10::lang::GlobalRef__LocalEval* this_ = new (::x10aux::alloc_z< ::x10::lang::GlobalRef__LocalEval>()) ::x10::lang::GlobalRef__LocalEval();
    this_->_constructor();
    return this_;
}


void x10::lang::GlobalRef__LocalEval::__fieldInitializers_x10_lang_GlobalRef_LocalEval(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::GlobalRef__LocalEval::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::GlobalRef__LocalEval::_deserializer);

void x10::lang::GlobalRef__LocalEval::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::lang::GlobalRef__LocalEval::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::GlobalRef__LocalEval* this_ = new (::x10aux::alloc_z< ::x10::lang::GlobalRef__LocalEval>()) ::x10::lang::GlobalRef__LocalEval();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::GlobalRef__LocalEval::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::lang::GlobalRef__LocalEval::rtt;
void x10::lang::GlobalRef__LocalEval::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.lang.GlobalRef.LocalEval",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of GlobalRef$LocalEval */
/*************************************************/
