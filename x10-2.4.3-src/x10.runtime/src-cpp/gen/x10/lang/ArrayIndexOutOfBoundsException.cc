/*************************************************/
/* START of ArrayIndexOutOfBoundsException */
#include <x10/lang/ArrayIndexOutOfBoundsException.h>

#include <x10/lang/IndexOutOfBoundsException.h>
#include <x10/compiler/Native.h>
#include <x10/lang/String.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeRep.h>

//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ArrayIndexOutOfBoundsException.x10"
void x10::lang::ArrayIndexOutOfBoundsException::_constructor() {
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ArrayIndexOutOfBoundsException.x10"
    (this)->::x10::lang::IndexOutOfBoundsException::_constructor();
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ArrayIndexOutOfBoundsException.x10"
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ArrayIndexOutOfBoundsException.x10"
    this->x10::lang::ArrayIndexOutOfBoundsException::__fieldInitializers_x10_lang_ArrayIndexOutOfBoundsException();
}
::x10::lang::ArrayIndexOutOfBoundsException* x10::lang::ArrayIndexOutOfBoundsException::_make(
  ) {
    ::x10::lang::ArrayIndexOutOfBoundsException* this_ = new (::x10aux::alloc_z< ::x10::lang::ArrayIndexOutOfBoundsException>()) ::x10::lang::ArrayIndexOutOfBoundsException();
    this_->_constructor();
    return this_;
}



//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ArrayIndexOutOfBoundsException.x10"
void x10::lang::ArrayIndexOutOfBoundsException::_constructor(::x10::lang::String* message) {
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ArrayIndexOutOfBoundsException.x10"
    (this)->::x10::lang::IndexOutOfBoundsException::_constructor(
      message);
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ArrayIndexOutOfBoundsException.x10"
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ArrayIndexOutOfBoundsException.x10"
    this->x10::lang::ArrayIndexOutOfBoundsException::__fieldInitializers_x10_lang_ArrayIndexOutOfBoundsException();
}
::x10::lang::ArrayIndexOutOfBoundsException* x10::lang::ArrayIndexOutOfBoundsException::_make(
  ::x10::lang::String* message) {
    ::x10::lang::ArrayIndexOutOfBoundsException* this_ = new (::x10aux::alloc_z< ::x10::lang::ArrayIndexOutOfBoundsException>()) ::x10::lang::ArrayIndexOutOfBoundsException();
    this_->_constructor(message);
    return this_;
}



//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ArrayIndexOutOfBoundsException.x10"
::x10::lang::ArrayIndexOutOfBoundsException* x10::lang::ArrayIndexOutOfBoundsException::x10__lang__ArrayIndexOutOfBoundsException____this__x10__lang__ArrayIndexOutOfBoundsException(
  ) {
    return this;
    
}
void x10::lang::ArrayIndexOutOfBoundsException::__fieldInitializers_x10_lang_ArrayIndexOutOfBoundsException(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::ArrayIndexOutOfBoundsException::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::ArrayIndexOutOfBoundsException::_deserializer);

void x10::lang::ArrayIndexOutOfBoundsException::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::IndexOutOfBoundsException::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::lang::ArrayIndexOutOfBoundsException::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::ArrayIndexOutOfBoundsException* this_ = new (::x10aux::alloc_z< ::x10::lang::ArrayIndexOutOfBoundsException>()) ::x10::lang::ArrayIndexOutOfBoundsException();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::ArrayIndexOutOfBoundsException::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::IndexOutOfBoundsException::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::lang::ArrayIndexOutOfBoundsException::rtt;
void x10::lang::ArrayIndexOutOfBoundsException::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::IndexOutOfBoundsException>()};
    rtt.initStageTwo("x10.lang.ArrayIndexOutOfBoundsException",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of ArrayIndexOutOfBoundsException */
/*************************************************/
