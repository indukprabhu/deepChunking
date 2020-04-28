/*************************************************/
/* START of InputStreamReader */
#include <x10/io/InputStreamReader.h>

#include <x10/io/Reader.h>
#include <x10/io/InputStreamReader__InputStream.h>
#include <x10/lang/Byte.h>
#include <x10/lang/Int.h>
#include <x10/io/EOFException.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/compiler/Synthetic.h>

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"

//#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
void x10::io::InputStreamReader::_constructor(::x10::io::InputStreamReader__InputStream* stream) {
    ::x10::io::Reader* this__87090 = this;
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
    ::x10::io::InputStreamReader* this__87089 = this;
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
    this->FMGL(stream) = stream;
}
::x10::io::InputStreamReader* x10::io::InputStreamReader::_make(::x10::io::InputStreamReader__InputStream* stream)
{
    ::x10::io::InputStreamReader* this_ = new (::x10aux::alloc_z< ::x10::io::InputStreamReader>()) ::x10::io::InputStreamReader();
    this_->_constructor(stream);
    return this_;
}



//#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
::x10::io::InputStreamReader__InputStream* x10::io::InputStreamReader::stream(
  ) {
    return this->FMGL(stream);
    
}

//#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
void x10::io::InputStreamReader::close() {
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
    ::x10aux::nullCheck(this->FMGL(stream))->close();
}

//#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
x10_byte x10::io::InputStreamReader::read() {
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
    x10_int n = ::x10aux::nullCheck(this->FMGL(stream))->read();
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
    if ((::x10aux::struct_equals(n, ((x10_int)-1)))) {
        ::x10aux::throwException(::x10aux::nullCheck(::x10::io::EOFException::_make()));
    }
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
    return ((x10_byte) (n));
    
}

//#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
void x10::io::InputStreamReader::read(::x10::lang::Rail< x10_byte >* r,
                                      x10_long off, x10_long len) {
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
    ::x10aux::nullCheck(this->FMGL(stream))->read(r, off, len);
}

//#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
x10_int x10::io::InputStreamReader::available() {
    return ::x10aux::nullCheck(this->FMGL(stream))->available();
    
}

//#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
void x10::io::InputStreamReader::skip(x10_long off) {
    
    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
    ::x10aux::nullCheck(this->FMGL(stream))->skip(off);
}

//#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
void x10::io::InputStreamReader::mark(x10_int off) {
    
    //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
    ::x10aux::nullCheck(this->FMGL(stream))->mark(off);
}

//#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
void x10::io::InputStreamReader::reset() {
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
    ::x10aux::nullCheck(this->FMGL(stream))->reset();
}

//#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
x10_boolean x10::io::InputStreamReader::markSupported() {
    return ::x10aux::nullCheck(this->FMGL(stream))->markSupported();
    
}

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/InputStreamReader.x10"
::x10::io::InputStreamReader* x10::io::InputStreamReader::x10__io__InputStreamReader____this__x10__io__InputStreamReader(
  ) {
    return this;
    
}
void x10::io::InputStreamReader::__fieldInitializers_x10_io_InputStreamReader(
  ) {
 
}
const ::x10aux::serialization_id_t x10::io::InputStreamReader::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::io::InputStreamReader::_deserializer);

void x10::io::InputStreamReader::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::io::Reader::_serialize_body(buf);
    buf.write(this->FMGL(stream));
    
}

::x10::lang::Reference* ::x10::io::InputStreamReader::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::io::InputStreamReader* this_ = new (::x10aux::alloc_z< ::x10::io::InputStreamReader>()) ::x10::io::InputStreamReader();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::io::InputStreamReader::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::io::Reader::_deserialize_body(buf);
    FMGL(stream) = buf.read< ::x10::io::InputStreamReader__InputStream*>();
}

::x10aux::RuntimeType x10::io::InputStreamReader::rtt;
void x10::io::InputStreamReader::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::io::Reader>()};
    rtt.initStageTwo("x10.io.InputStreamReader",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of InputStreamReader */
/*************************************************/
