/*************************************************/
/* START of ArithmeticException */
#include <x10/lang/ArithmeticException.h>

#include <x10/lang/Exception.h>
#include <x10/compiler/Native.h>
#include <x10/lang/String.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeRep.h>

//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ArithmeticException.x10"
void x10::lang::ArithmeticException::_constructor() {
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ArithmeticException.x10"
    (this)->::x10::lang::Exception::_constructor();
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ArithmeticException.x10"
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ArithmeticException.x10"
    this->x10::lang::ArithmeticException::__fieldInitializers_x10_lang_ArithmeticException();
}
::x10::lang::ArithmeticException* x10::lang::ArithmeticException::_make()
{
    ::x10::lang::ArithmeticException* this_ = new (::x10aux::alloc_z< ::x10::lang::ArithmeticException>()) ::x10::lang::ArithmeticException();
    this_->_constructor();
    return this_;
}



//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ArithmeticException.x10"
void x10::lang::ArithmeticException::_constructor(::x10::lang::String* message) {
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ArithmeticException.x10"
    (this)->::x10::lang::Exception::_constructor(message);
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ArithmeticException.x10"
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ArithmeticException.x10"
    this->x10::lang::ArithmeticException::__fieldInitializers_x10_lang_ArithmeticException();
}
::x10::lang::ArithmeticException* x10::lang::ArithmeticException::_make(::x10::lang::String* message)
{
    ::x10::lang::ArithmeticException* this_ = new (::x10aux::alloc_z< ::x10::lang::ArithmeticException>()) ::x10::lang::ArithmeticException();
    this_->_constructor(message);
    return this_;
}



//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ArithmeticException.x10"
::x10::lang::ArithmeticException* x10::lang::ArithmeticException::x10__lang__ArithmeticException____this__x10__lang__ArithmeticException(
  ) {
    return this;
    
}
void x10::lang::ArithmeticException::__fieldInitializers_x10_lang_ArithmeticException(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::ArithmeticException::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::ArithmeticException::_deserializer);

void x10::lang::ArithmeticException::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::Exception::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::lang::ArithmeticException::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::ArithmeticException* this_ = new (::x10aux::alloc_z< ::x10::lang::ArithmeticException>()) ::x10::lang::ArithmeticException();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::ArithmeticException::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Exception::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::lang::ArithmeticException::rtt;
void x10::lang::ArithmeticException::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Exception>()};
    rtt.initStageTwo("x10.lang.ArithmeticException",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of ArithmeticException */
/*************************************************/
