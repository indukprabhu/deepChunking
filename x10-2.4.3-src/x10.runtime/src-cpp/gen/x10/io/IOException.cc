/*************************************************/
/* START of IOException */
#include <x10/io/IOException.h>

#include <x10/lang/Exception.h>
#include <x10/lang/String.h>
#include <x10/compiler/Synthetic.h>

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/IOException.x10"
void x10::io::IOException::_constructor() {
    (this)->::x10::lang::Exception::_constructor();
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/IOException.x10"
    ::x10::io::IOException* this__87097 = this;
    
}
::x10::io::IOException* x10::io::IOException::_make() {
    ::x10::io::IOException* this_ = new (::x10aux::alloc_z< ::x10::io::IOException>()) ::x10::io::IOException();
    this_->_constructor();
    return this_;
}



//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/IOException.x10"
void x10::io::IOException::_constructor(::x10::lang::String* message) {
    (this)->::x10::lang::Exception::_constructor(message);
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/IOException.x10"
    ::x10::io::IOException* this__87098 = this;
    
}
::x10::io::IOException* x10::io::IOException::_make(::x10::lang::String* message)
{
    ::x10::io::IOException* this_ = new (::x10aux::alloc_z< ::x10::io::IOException>()) ::x10::io::IOException();
    this_->_constructor(message);
    return this_;
}



//#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/IOException.x10"
::x10::io::IOException* x10::io::IOException::x10__io__IOException____this__x10__io__IOException(
  ) {
    return this;
    
}
void x10::io::IOException::__fieldInitializers_x10_io_IOException(
  ) {
 
}
const ::x10aux::serialization_id_t x10::io::IOException::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::io::IOException::_deserializer);

void x10::io::IOException::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::Exception::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::io::IOException::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::io::IOException* this_ = new (::x10aux::alloc_z< ::x10::io::IOException>()) ::x10::io::IOException();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::io::IOException::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Exception::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::io::IOException::rtt;
void x10::io::IOException::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Exception>()};
    rtt.initStageTwo("x10.io.IOException",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of IOException */
/*************************************************/
