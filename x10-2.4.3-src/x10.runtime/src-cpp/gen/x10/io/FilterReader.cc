/*************************************************/
/* START of FilterReader */
#include <x10/io/FilterReader.h>

#include <x10/io/Reader.h>
#include <x10/lang/Byte.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Long.h>
#include <x10/lang/Int.h>
#include <x10/lang/Boolean.h>
#include <x10/compiler/Synthetic.h>

//#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
::x10::io::Reader* x10::io::FilterReader::inner() {
    return this->FMGL(r);
    
}

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
void x10::io::FilterReader::_constructor(::x10::io::Reader* r) {
    ::x10::io::Reader* this__87072 = this;
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
    ::x10::io::FilterReader* this__87071 = this;
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
    this->FMGL(r) = r;
}
::x10::io::FilterReader* x10::io::FilterReader::_make(::x10::io::Reader* r)
{
    ::x10::io::FilterReader* this_ = new (::x10aux::alloc_z< ::x10::io::FilterReader>()) ::x10::io::FilterReader();
    this_->_constructor(r);
    return this_;
}



//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
void x10::io::FilterReader::close() {
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
    ::x10aux::nullCheck(this->FMGL(r))->close();
}

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
x10_byte x10::io::FilterReader::read() {
    return ::x10aux::nullCheck(this->FMGL(r))->read();
    
}

//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
void x10::io::FilterReader::read(::x10::lang::Rail< x10_byte >* r, x10_long off,
                                 x10_long len) {
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
    ::x10aux::nullCheck(this->FMGL(r))->read(r, off, len);
}

//#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
x10_int x10::io::FilterReader::available() {
    return ::x10aux::nullCheck(this->FMGL(r))->available();
    
}

//#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
void x10::io::FilterReader::skip(x10_long off) {
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
    ::x10aux::nullCheck(this->FMGL(r))->skip(off);
}

//#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
void x10::io::FilterReader::mark(x10_int off) {
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
    ::x10aux::nullCheck(this->FMGL(r))->mark(off);
}

//#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
void x10::io::FilterReader::reset() {
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
    ::x10aux::nullCheck(this->FMGL(r))->reset();
}

//#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
x10_boolean x10::io::FilterReader::markSupported() {
    return ::x10aux::nullCheck(this->FMGL(r))->markSupported();
    
}

//#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FilterReader.x10"
::x10::io::FilterReader* x10::io::FilterReader::x10__io__FilterReader____this__x10__io__FilterReader(
  ) {
    return this;
    
}
void x10::io::FilterReader::__fieldInitializers_x10_io_FilterReader(
  ) {
 
}
const ::x10aux::serialization_id_t x10::io::FilterReader::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::io::FilterReader::_deserializer);

void x10::io::FilterReader::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::io::Reader::_serialize_body(buf);
    buf.write(this->FMGL(r));
    
}

::x10::lang::Reference* ::x10::io::FilterReader::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::io::FilterReader* this_ = new (::x10aux::alloc_z< ::x10::io::FilterReader>()) ::x10::io::FilterReader();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::io::FilterReader::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::io::Reader::_deserialize_body(buf);
    FMGL(r) = buf.read< ::x10::io::Reader*>();
}

::x10aux::RuntimeType x10::io::FilterReader::rtt;
void x10::io::FilterReader::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::io::Reader>()};
    rtt.initStageTwo("x10.io.FilterReader",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of FilterReader */
/*************************************************/
