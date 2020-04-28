/*************************************************/
/* START of OutputStreamWriter */
#include <x10/io/OutputStreamWriter.h>

#include <x10/io/Writer.h>
#include <x10/io/OutputStreamWriter__OutputStream.h>
#include <x10/lang/Byte.h>
#include <x10/lang/Int.h>
#include <x10/lang/String.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Long.h>
#include <x10/compiler/Synthetic.h>

//#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"

//#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
::x10::io::OutputStreamWriter__OutputStream* x10::io::OutputStreamWriter::stream(
  ) {
    return this->FMGL(out);
    
}

//#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
void x10::io::OutputStreamWriter::_constructor(::x10::io::OutputStreamWriter__OutputStream* out) {
    ::x10::io::Writer* this__87716 = this;
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
    ::x10::io::OutputStreamWriter* this__87715 = this;
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
    this->FMGL(out) = out;
}
::x10::io::OutputStreamWriter* x10::io::OutputStreamWriter::_make(
  ::x10::io::OutputStreamWriter__OutputStream* out) {
    ::x10::io::OutputStreamWriter* this_ = new (::x10aux::alloc_z< ::x10::io::OutputStreamWriter>()) ::x10::io::OutputStreamWriter();
    this_->_constructor(out);
    return this_;
}



//#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
void x10::io::OutputStreamWriter::flush() {
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
    ::x10aux::nullCheck(this->FMGL(out))->flush();
}

//#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
void x10::io::OutputStreamWriter::close() {
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
    ::x10aux::nullCheck(this->FMGL(out))->close();
}

//#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
void x10::io::OutputStreamWriter::write(x10_byte x) {
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
    ::x10aux::nullCheck(this->FMGL(out))->write(((x10_int) (x)));
}

//#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
void x10::io::OutputStreamWriter::write(::x10::lang::String* s) {
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
    ::x10aux::nullCheck(this->FMGL(out))->write(s);
}

//#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
void x10::io::OutputStreamWriter::write(::x10::lang::Rail< x10_byte >* buf,
                                        x10_long off, x10_long len) {
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
    ::x10aux::nullCheck(this->FMGL(out))->write(buf, off, len);
}

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/OutputStreamWriter.x10"
::x10::io::OutputStreamWriter* x10::io::OutputStreamWriter::x10__io__OutputStreamWriter____this__x10__io__OutputStreamWriter(
  ) {
    return this;
    
}
void x10::io::OutputStreamWriter::__fieldInitializers_x10_io_OutputStreamWriter(
  ) {
 
}
const ::x10aux::serialization_id_t x10::io::OutputStreamWriter::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::io::OutputStreamWriter::_deserializer);

void x10::io::OutputStreamWriter::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::io::Writer::_serialize_body(buf);
    buf.write(this->FMGL(out));
    
}

::x10::lang::Reference* ::x10::io::OutputStreamWriter::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::io::OutputStreamWriter* this_ = new (::x10aux::alloc_z< ::x10::io::OutputStreamWriter>()) ::x10::io::OutputStreamWriter();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::io::OutputStreamWriter::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::io::Writer::_deserialize_body(buf);
    FMGL(out) = buf.read< ::x10::io::OutputStreamWriter__OutputStream*>();
}

::x10aux::RuntimeType x10::io::OutputStreamWriter::rtt;
void x10::io::OutputStreamWriter::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::io::Writer>()};
    rtt.initStageTwo("x10.io.OutputStreamWriter",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of OutputStreamWriter */
/*************************************************/
