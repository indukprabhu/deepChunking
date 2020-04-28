/*************************************************/
/* START of BadPlaceException */
#include <x10/lang/BadPlaceException.h>

#include <x10/lang/Exception.h>
#include <x10/lang/String.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Place.h>
#include <x10/compiler/Synthetic.h>

//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/BadPlaceException.x10"
void x10::lang::BadPlaceException::_constructor() {
    (this)->::x10::lang::Exception::_constructor(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124150 = ::x10aux::makeStringLit("bad place exception at "); strLit__124150; })), ::x10::lang::Place::_make(::x10aux::here)));
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/BadPlaceException.x10"
    ::x10::lang::BadPlaceException* this__92964 = this;
    
}
::x10::lang::BadPlaceException* x10::lang::BadPlaceException::_make() {
    ::x10::lang::BadPlaceException* this_ = new (::x10aux::alloc_z< ::x10::lang::BadPlaceException>()) ::x10::lang::BadPlaceException();
    this_->_constructor();
    return this_;
}



//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/BadPlaceException.x10"
void x10::lang::BadPlaceException::_constructor(::x10::lang::String* message) {
    (this)->::x10::lang::Exception::_constructor(message);
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/BadPlaceException.x10"
    ::x10::lang::BadPlaceException* this__92965 = this;
    
}
::x10::lang::BadPlaceException* x10::lang::BadPlaceException::_make(::x10::lang::String* message)
{
    ::x10::lang::BadPlaceException* this_ = new (::x10aux::alloc_z< ::x10::lang::BadPlaceException>()) ::x10::lang::BadPlaceException();
    this_->_constructor(message);
    return this_;
}



//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/BadPlaceException.x10"
::x10::lang::BadPlaceException* x10::lang::BadPlaceException::x10__lang__BadPlaceException____this__x10__lang__BadPlaceException(
  ) {
    return this;
    
}
void x10::lang::BadPlaceException::__fieldInitializers_x10_lang_BadPlaceException(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::BadPlaceException::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::BadPlaceException::_deserializer);

void x10::lang::BadPlaceException::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::Exception::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::lang::BadPlaceException::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::BadPlaceException* this_ = new (::x10aux::alloc_z< ::x10::lang::BadPlaceException>()) ::x10::lang::BadPlaceException();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::BadPlaceException::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Exception::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::lang::BadPlaceException::rtt;
void x10::lang::BadPlaceException::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Exception>()};
    rtt.initStageTwo("x10.lang.BadPlaceException",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of BadPlaceException */
/*************************************************/
