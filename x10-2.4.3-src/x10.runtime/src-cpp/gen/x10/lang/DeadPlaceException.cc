/*************************************************/
/* START of DeadPlaceException */
#include <x10/lang/DeadPlaceException.h>

#include <x10/lang/Exception.h>
#include <x10/lang/Place.h>
#include <x10/lang/String.h>
#include <x10/lang/Runtime.h>
#include <x10/compiler/Synthetic.h>

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"

//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
void x10::lang::DeadPlaceException::_constructor() {
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
    (this)->::x10::lang::Exception::_constructor(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124214 = ::x10aux::makeStringLit("DeadPlaceException at "); strLit__124214; })), ::x10::lang::Place::_make(::x10aux::here)));
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
    FMGL(place) = ::x10::lang::Place::_make(::x10aux::here);
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
    ::x10::lang::DeadPlaceException* this__93690 = this;
    
}
::x10::lang::DeadPlaceException* x10::lang::DeadPlaceException::_make() {
    ::x10::lang::DeadPlaceException* this_ = new (::x10aux::alloc_z< ::x10::lang::DeadPlaceException>()) ::x10::lang::DeadPlaceException();
    this_->_constructor();
    return this_;
}



//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
void x10::lang::DeadPlaceException::_constructor(::x10::lang::String* message) {
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
    (this)->::x10::lang::Exception::_constructor(message);
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
    FMGL(place) = ::x10::lang::Place::_make(::x10aux::here);
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
    ::x10::lang::DeadPlaceException* this__93691 = this;
    
}
::x10::lang::DeadPlaceException* x10::lang::DeadPlaceException::_make(::x10::lang::String* message)
{
    ::x10::lang::DeadPlaceException* this_ = new (::x10aux::alloc_z< ::x10::lang::DeadPlaceException>()) ::x10::lang::DeadPlaceException();
    this_->_constructor(message);
    return this_;
}



//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
void x10::lang::DeadPlaceException::_constructor(::x10::lang::Place p) {
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
    (this)->::x10::lang::Exception::_constructor(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124215 = ::x10aux::makeStringLit("DeadPlaceException at "); strLit__124215; })), p));
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
    FMGL(place) = p;
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
    ::x10::lang::DeadPlaceException* this__93692 = this;
    
}
::x10::lang::DeadPlaceException* x10::lang::DeadPlaceException::_make(
  ::x10::lang::Place p) {
    ::x10::lang::DeadPlaceException* this_ = new (::x10aux::alloc_z< ::x10::lang::DeadPlaceException>()) ::x10::lang::DeadPlaceException();
    this_->_constructor(p);
    return this_;
}



//#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
void x10::lang::DeadPlaceException::_constructor(::x10::lang::Place p,
                                                 ::x10::lang::String* message) {
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
    (this)->::x10::lang::Exception::_constructor(message);
    
    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
    FMGL(place) = p;
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
    ::x10::lang::DeadPlaceException* this__93693 = this;
    
}
::x10::lang::DeadPlaceException* x10::lang::DeadPlaceException::_make(
  ::x10::lang::Place p, ::x10::lang::String* message) {
    ::x10::lang::DeadPlaceException* this_ = new (::x10aux::alloc_z< ::x10::lang::DeadPlaceException>()) ::x10::lang::DeadPlaceException();
    this_->_constructor(p, message);
    return this_;
}



//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/DeadPlaceException.x10"
::x10::lang::DeadPlaceException* x10::lang::DeadPlaceException::x10__lang__DeadPlaceException____this__x10__lang__DeadPlaceException(
  ) {
    return this;
    
}
void x10::lang::DeadPlaceException::__fieldInitializers_x10_lang_DeadPlaceException(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::DeadPlaceException::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::DeadPlaceException::_deserializer);

void x10::lang::DeadPlaceException::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::Exception::_serialize_body(buf);
    buf.write(this->FMGL(place));
    
}

::x10::lang::Reference* ::x10::lang::DeadPlaceException::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::DeadPlaceException* this_ = new (::x10aux::alloc_z< ::x10::lang::DeadPlaceException>()) ::x10::lang::DeadPlaceException();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::DeadPlaceException::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Exception::_deserialize_body(buf);
    FMGL(place) = buf.read< ::x10::lang::Place>();
}

::x10aux::RuntimeType x10::lang::DeadPlaceException::rtt;
void x10::lang::DeadPlaceException::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Exception>()};
    rtt.initStageTwo("x10.lang.DeadPlaceException",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of DeadPlaceException */
/*************************************************/
