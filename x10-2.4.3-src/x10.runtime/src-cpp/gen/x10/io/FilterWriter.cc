/*************************************************/
/* START of FilterWriter */
#include <x10/io/FilterWriter.h>

#include <x10/io/Writer.h>
#include <x10/lang/Byte.h>
#include <x10/lang/String.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Long.h>
#include <x10/compiler/Synthetic.h>

//#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
::x10::io::Writer* x10::io::FilterWriter::inner() {
    return this->FMGL(w);
    
}

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
void x10::io::FilterWriter::_constructor(::x10::io::Writer* w) {
    ::x10::io::Writer* this__87081 = this;
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
    ::x10::io::FilterWriter* this__87080 = this;
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
    this->FMGL(w) = w;
}
::x10::io::FilterWriter* x10::io::FilterWriter::_make(::x10::io::Writer* w)
{
    ::x10::io::FilterWriter* this_ = new (::x10aux::alloc_z< ::x10::io::FilterWriter>()) ::x10::io::FilterWriter();
    this_->_constructor(w);
    return this_;
}



//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
void x10::io::FilterWriter::close() {
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
    ::x10aux::nullCheck(this->FMGL(w))->close();
}

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
void x10::io::FilterWriter::flush() {
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
    ::x10aux::nullCheck(this->FMGL(w))->flush();
}

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
void x10::io::FilterWriter::write(x10_byte b) {
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
    ::x10aux::nullCheck(this->FMGL(w))->write(b);
}

//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
void x10::io::FilterWriter::write(::x10::lang::String* s) {
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
    ::x10aux::nullCheck(this->FMGL(w))->write(s);
}

//#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
void x10::io::FilterWriter::write(::x10::lang::Rail< x10_byte >* x, x10_long off,
                                  x10_long len) {
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
    ::x10aux::nullCheck(this->FMGL(w))->write(x, off, len);
}

//#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterWriter.x10"
::x10::io::FilterWriter* x10::io::FilterWriter::x10__io__FilterWriter____this__x10__io__FilterWriter(
  ) {
    return this;
    
}
void x10::io::FilterWriter::__fieldInitializers_x10_io_FilterWriter(
  ) {
 
}
const ::x10aux::serialization_id_t x10::io::FilterWriter::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::io::FilterWriter::_deserializer);

void x10::io::FilterWriter::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::io::Writer::_serialize_body(buf);
    buf.write(this->FMGL(w));
    
}

::x10::lang::Reference* ::x10::io::FilterWriter::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::io::FilterWriter* this_ = new (::x10aux::alloc_z< ::x10::io::FilterWriter>()) ::x10::io::FilterWriter();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::io::FilterWriter::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::io::Writer::_deserialize_body(buf);
    FMGL(w) = buf.read< ::x10::io::Writer*>();
}

::x10aux::RuntimeType x10::io::FilterWriter::rtt;
void x10::io::FilterWriter::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::io::Writer>()};
    rtt.initStageTwo("x10.io.FilterWriter",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of FilterWriter */
/*************************************************/
