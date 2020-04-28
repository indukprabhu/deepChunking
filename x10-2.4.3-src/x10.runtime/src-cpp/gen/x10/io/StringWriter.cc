/*************************************************/
/* START of StringWriter */
#include <x10/io/StringWriter.h>

#include <x10/io/Writer.h>
#include <x10/util/StringBuilder.h>
#include <x10/lang/Byte.h>
#include <x10/lang/Char.h>
#include <x10/lang/String.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/compiler/Synthetic.h>

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
void x10::io::StringWriter::_constructor() {
    ::x10::io::Writer* this__87895 = this;
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
    ::x10::io::StringWriter* this__87894 = this;
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
    this->FMGL(b) = (__extension__ ({
        ::x10::util::StringBuilder* alloc__87886 =  (new (::x10aux::alloc_z< ::x10::util::StringBuilder>()) ::x10::util::StringBuilder());
        (alloc__87886)->::x10::util::StringBuilder::_constructor();
        alloc__87886;
    }))
    ;
}
::x10::io::StringWriter* x10::io::StringWriter::_make() {
    ::x10::io::StringWriter* this_ = new (::x10aux::alloc_z< ::x10::io::StringWriter>()) ::x10::io::StringWriter();
    this_->_constructor();
    return this_;
}



//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
void x10::io::StringWriter::write(x10_byte x) {
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
    ::x10aux::nullCheck(this->FMGL(b))->add((x10_char((x10_int)(x))));
}

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
void x10::io::StringWriter::write(::x10::lang::String* s) {
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
    ::x10aux::nullCheck(this->FMGL(b))->addString(s);
}

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
void x10::io::StringWriter::write(::x10::lang::Rail< x10_byte >* x, x10_long off,
                                  x10_long len) {
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
    {
        x10_long i;
        for (i = off; ((i) < (((off) + (len)))); i = ((i) + (((x10_long)1ll))))
        {
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
            ::x10aux::nullCheck(this->FMGL(b))->add((x10_char((x10_int)(::x10aux::nullCheck(x)->x10::lang::Rail< x10_byte >::__apply(
                                                                          i)))));
        }
    }
    
}

//#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
x10_long x10::io::StringWriter::size() {
    return ::x10aux::nullCheck(this->FMGL(b))->length();
    
}

//#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
::x10::lang::String* x10::io::StringWriter::result() {
    return ::x10aux::nullCheck(this->FMGL(b))->result();
    
}

//#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
void x10::io::StringWriter::flush() {
 
}

//#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
void x10::io::StringWriter::close() {
 
}

//#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/StringWriter.x10"
::x10::io::StringWriter* x10::io::StringWriter::x10__io__StringWriter____this__x10__io__StringWriter(
  ) {
    return this;
    
}
void x10::io::StringWriter::__fieldInitializers_x10_io_StringWriter(
  ) {
 
}
const ::x10aux::serialization_id_t x10::io::StringWriter::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::io::StringWriter::_deserializer);

void x10::io::StringWriter::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::io::Writer::_serialize_body(buf);
    buf.write(this->FMGL(b));
    
}

::x10::lang::Reference* ::x10::io::StringWriter::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::io::StringWriter* this_ = new (::x10aux::alloc_z< ::x10::io::StringWriter>()) ::x10::io::StringWriter();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::io::StringWriter::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::io::Writer::_deserialize_body(buf);
    FMGL(b) = buf.read< ::x10::util::StringBuilder*>();
}

::x10aux::RuntimeType x10::io::StringWriter::rtt;
void x10::io::StringWriter::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::io::Writer>()};
    rtt.initStageTwo("x10.io.StringWriter",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of StringWriter */
/*************************************************/
