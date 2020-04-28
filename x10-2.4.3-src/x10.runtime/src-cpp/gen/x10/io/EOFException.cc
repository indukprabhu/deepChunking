/*************************************************/
/* START of EOFException */
#include <x10/io/EOFException.h>

#include <x10/io/IOException.h>
#include <x10/lang/String.h>
#include <x10/compiler/Synthetic.h>

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/EOFException.x10"
void x10::io::EOFException::_constructor() {
    (this)->::x10::io::IOException::_constructor();
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/EOFException.x10"
    ::x10::io::EOFException* this__86910 = this;
    
}
::x10::io::EOFException* x10::io::EOFException::_make() {
    ::x10::io::EOFException* this_ = new (::x10aux::alloc_z< ::x10::io::EOFException>()) ::x10::io::EOFException();
    this_->_constructor();
    return this_;
}



//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/EOFException.x10"
void x10::io::EOFException::_constructor(::x10::lang::String* message) {
    (this)->::x10::io::IOException::_constructor(message);
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/EOFException.x10"
    ::x10::io::EOFException* this__86911 = this;
    
}
::x10::io::EOFException* x10::io::EOFException::_make(::x10::lang::String* message)
{
    ::x10::io::EOFException* this_ = new (::x10aux::alloc_z< ::x10::io::EOFException>()) ::x10::io::EOFException();
    this_->_constructor(message);
    return this_;
}



//#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/EOFException.x10"
::x10::io::EOFException* x10::io::EOFException::x10__io__EOFException____this__x10__io__EOFException(
  ) {
    return this;
    
}
void x10::io::EOFException::__fieldInitializers_x10_io_EOFException(
  ) {
 
}
const ::x10aux::serialization_id_t x10::io::EOFException::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::io::EOFException::_deserializer);

void x10::io::EOFException::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::io::IOException::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::io::EOFException::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::io::EOFException* this_ = new (::x10aux::alloc_z< ::x10::io::EOFException>()) ::x10::io::EOFException();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::io::EOFException::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::io::IOException::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::io::EOFException::rtt;
void x10::io::EOFException::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::io::IOException>()};
    rtt.initStageTwo("x10.io.EOFException",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of EOFException */
/*************************************************/
