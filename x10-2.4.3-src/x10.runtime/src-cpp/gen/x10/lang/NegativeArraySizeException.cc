/*************************************************/
/* START of NegativeArraySizeException */
#include <x10/lang/NegativeArraySizeException.h>

#include <x10/lang/Exception.h>
#include <x10/compiler/Native.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeRep.h>

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/NegativeArraySizeException.x10"
void x10::lang::NegativeArraySizeException::_constructor() {
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/NegativeArraySizeException.x10"
    (this)->::x10::lang::Exception::_constructor();
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/NegativeArraySizeException.x10"
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/NegativeArraySizeException.x10"
    this->x10::lang::NegativeArraySizeException::__fieldInitializers_x10_lang_NegativeArraySizeException();
}
::x10::lang::NegativeArraySizeException* x10::lang::NegativeArraySizeException::_make(
  ) {
    ::x10::lang::NegativeArraySizeException* this_ = new (::x10aux::alloc_z< ::x10::lang::NegativeArraySizeException>()) ::x10::lang::NegativeArraySizeException();
    this_->_constructor();
    return this_;
}



//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/NegativeArraySizeException.x10"
::x10::lang::NegativeArraySizeException* x10::lang::NegativeArraySizeException::x10__lang__NegativeArraySizeException____this__x10__lang__NegativeArraySizeException(
  ) {
    return this;
    
}
void x10::lang::NegativeArraySizeException::__fieldInitializers_x10_lang_NegativeArraySizeException(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::NegativeArraySizeException::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::NegativeArraySizeException::_deserializer);

void x10::lang::NegativeArraySizeException::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::Exception::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::lang::NegativeArraySizeException::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::NegativeArraySizeException* this_ = new (::x10aux::alloc_z< ::x10::lang::NegativeArraySizeException>()) ::x10::lang::NegativeArraySizeException();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::NegativeArraySizeException::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Exception::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::lang::NegativeArraySizeException::rtt;
void x10::lang::NegativeArraySizeException::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Exception>()};
    rtt.initStageTwo("x10.lang.NegativeArraySizeException",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of NegativeArraySizeException */
/*************************************************/
