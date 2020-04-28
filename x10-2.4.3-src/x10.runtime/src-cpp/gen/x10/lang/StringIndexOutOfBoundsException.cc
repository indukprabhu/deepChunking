/*************************************************/
/* START of StringIndexOutOfBoundsException */
#include <x10/lang/StringIndexOutOfBoundsException.h>

#include <x10/lang/IndexOutOfBoundsException.h>
#include <x10/compiler/Native.h>
#include <x10/lang/String.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeRep.h>

//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/StringIndexOutOfBoundsException.x10"
void x10::lang::StringIndexOutOfBoundsException::_constructor() {
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/StringIndexOutOfBoundsException.x10"
    (this)->::x10::lang::IndexOutOfBoundsException::_constructor();
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/StringIndexOutOfBoundsException.x10"
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/StringIndexOutOfBoundsException.x10"
    this->x10::lang::StringIndexOutOfBoundsException::__fieldInitializers_x10_lang_StringIndexOutOfBoundsException();
}
::x10::lang::StringIndexOutOfBoundsException* x10::lang::StringIndexOutOfBoundsException::_make(
  ) {
    ::x10::lang::StringIndexOutOfBoundsException* this_ = new (::x10aux::alloc_z< ::x10::lang::StringIndexOutOfBoundsException>()) ::x10::lang::StringIndexOutOfBoundsException();
    this_->_constructor();
    return this_;
}



//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/StringIndexOutOfBoundsException.x10"
void x10::lang::StringIndexOutOfBoundsException::_constructor(::x10::lang::String* message) {
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/StringIndexOutOfBoundsException.x10"
    (this)->::x10::lang::IndexOutOfBoundsException::_constructor(
      message);
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/StringIndexOutOfBoundsException.x10"
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/StringIndexOutOfBoundsException.x10"
    this->x10::lang::StringIndexOutOfBoundsException::__fieldInitializers_x10_lang_StringIndexOutOfBoundsException();
}
::x10::lang::StringIndexOutOfBoundsException* x10::lang::StringIndexOutOfBoundsException::_make(
  ::x10::lang::String* message) {
    ::x10::lang::StringIndexOutOfBoundsException* this_ = new (::x10aux::alloc_z< ::x10::lang::StringIndexOutOfBoundsException>()) ::x10::lang::StringIndexOutOfBoundsException();
    this_->_constructor(message);
    return this_;
}



//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/StringIndexOutOfBoundsException.x10"
::x10::lang::StringIndexOutOfBoundsException* x10::lang::StringIndexOutOfBoundsException::x10__lang__StringIndexOutOfBoundsException____this__x10__lang__StringIndexOutOfBoundsException(
  ) {
    return this;
    
}
void x10::lang::StringIndexOutOfBoundsException::__fieldInitializers_x10_lang_StringIndexOutOfBoundsException(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::StringIndexOutOfBoundsException::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::StringIndexOutOfBoundsException::_deserializer);

void x10::lang::StringIndexOutOfBoundsException::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::IndexOutOfBoundsException::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::lang::StringIndexOutOfBoundsException::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::StringIndexOutOfBoundsException* this_ = new (::x10aux::alloc_z< ::x10::lang::StringIndexOutOfBoundsException>()) ::x10::lang::StringIndexOutOfBoundsException();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::StringIndexOutOfBoundsException::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::IndexOutOfBoundsException::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::lang::StringIndexOutOfBoundsException::rtt;
void x10::lang::StringIndexOutOfBoundsException::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::IndexOutOfBoundsException>()};
    rtt.initStageTwo("x10.lang.StringIndexOutOfBoundsException",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of StringIndexOutOfBoundsException */
/*************************************************/
