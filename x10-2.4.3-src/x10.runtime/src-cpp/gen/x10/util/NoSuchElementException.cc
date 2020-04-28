/*************************************************/
/* START of NoSuchElementException */
#include <x10/util/NoSuchElementException.h>

#include <x10/lang/Exception.h>
#include <x10/compiler/Native.h>
#include <x10/lang/String.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeRep.h>

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/NoSuchElementException.x10"
void x10::util::NoSuchElementException::_constructor() {
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/NoSuchElementException.x10"
    (this)->::x10::lang::Exception::_constructor();
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/NoSuchElementException.x10"
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/NoSuchElementException.x10"
    this->x10::util::NoSuchElementException::__fieldInitializers_x10_util_NoSuchElementException();
}
::x10::util::NoSuchElementException* x10::util::NoSuchElementException::_make(
  ) {
    ::x10::util::NoSuchElementException* this_ = new (::x10aux::alloc_z< ::x10::util::NoSuchElementException>()) ::x10::util::NoSuchElementException();
    this_->_constructor();
    return this_;
}



//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/NoSuchElementException.x10"
void x10::util::NoSuchElementException::_constructor(::x10::lang::String* message) {
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/NoSuchElementException.x10"
    (this)->::x10::lang::Exception::_constructor(message);
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/NoSuchElementException.x10"
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/NoSuchElementException.x10"
    this->x10::util::NoSuchElementException::__fieldInitializers_x10_util_NoSuchElementException();
}
::x10::util::NoSuchElementException* x10::util::NoSuchElementException::_make(
  ::x10::lang::String* message) {
    ::x10::util::NoSuchElementException* this_ = new (::x10aux::alloc_z< ::x10::util::NoSuchElementException>()) ::x10::util::NoSuchElementException();
    this_->_constructor(message);
    return this_;
}



//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/NoSuchElementException.x10"
::x10::util::NoSuchElementException* x10::util::NoSuchElementException::x10__util__NoSuchElementException____this__x10__util__NoSuchElementException(
  ) {
    return this;
    
}
void x10::util::NoSuchElementException::__fieldInitializers_x10_util_NoSuchElementException(
  ) {
 
}
const ::x10aux::serialization_id_t x10::util::NoSuchElementException::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::NoSuchElementException::_deserializer);

void x10::util::NoSuchElementException::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::Exception::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::util::NoSuchElementException::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::NoSuchElementException* this_ = new (::x10aux::alloc_z< ::x10::util::NoSuchElementException>()) ::x10::util::NoSuchElementException();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::util::NoSuchElementException::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Exception::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::util::NoSuchElementException::rtt;
void x10::util::NoSuchElementException::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Exception>()};
    rtt.initStageTwo("x10.util.NoSuchElementException",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of NoSuchElementException */
/*************************************************/
