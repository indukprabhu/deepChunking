/*************************************************/
/* START of Writer */
#include <x10/io/Writer.h>


//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"

//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"

//#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"

//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"

//#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
void x10::io::Writer::write(::x10::lang::Rail< x10_byte >* buf) {
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    this->write(buf, ((x10_long)0ll), (x10_long)(::x10aux::nullCheck(buf)->FMGL(size)));
}

//#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
void x10::io::Writer::writeByte(x10_byte x) {
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    ::x10::io::Marshal__ByteMarshal* this__87904 = ::x10::io::Marshal<void>::FMGL(BYTE__get)();
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    ::x10::io::Writer* w__87905 = this;
    x10_byte b__87906 = x;
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    ::x10aux::nullCheck(w__87905)->write(b__87906);
}

//#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
void x10::io::Writer::writeUByte(x10_ubyte x) {
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    ::x10::io::Marshal<void>::FMGL(UBYTE__get)()->x10::io::Marshal__UByteMarshal::write(
      this, x);
}

//#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
void x10::io::Writer::writeChar(x10_char x) {
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    ::x10::io::Marshal<void>::FMGL(CHAR__get)()->x10::io::Marshal__CharMarshal::write(
      this, x);
}

//#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
void x10::io::Writer::writeShort(x10_short x) {
    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    ::x10::io::Marshal<void>::FMGL(SHORT__get)()->x10::io::Marshal__ShortMarshal::write(
      this, x);
}

//#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
void x10::io::Writer::writeUShort(x10_ushort x) {
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    ::x10::io::Marshal<void>::FMGL(USHORT__get)()->x10::io::Marshal__UShortMarshal::write(
      this, x);
}

//#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
void x10::io::Writer::writeInt(x10_int x) {
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    ::x10::io::Marshal<void>::FMGL(INT__get)()->x10::io::Marshal__IntMarshal::write(
      this, x);
}

//#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
void x10::io::Writer::writeUInt(x10_uint x) {
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    ::x10::io::Marshal<void>::FMGL(UINT__get)()->x10::io::Marshal__UIntMarshal::write(
      this, x);
}

//#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
void x10::io::Writer::writeLong(x10_long x) {
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    ::x10::io::Marshal<void>::FMGL(LONG__get)()->x10::io::Marshal__LongMarshal::write(
      this, x);
}

//#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
void x10::io::Writer::writeULong(x10_ulong x) {
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    ::x10::io::Marshal<void>::FMGL(ULONG__get)()->x10::io::Marshal__ULongMarshal::write(
      this, x);
}

//#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
void x10::io::Writer::writeFloat(x10_float x) {
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    ::x10::io::Marshal<void>::FMGL(FLOAT__get)()->x10::io::Marshal__FloatMarshal::write(
      this, x);
}

//#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
void x10::io::Writer::writeDouble(x10_double x) {
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    ::x10::io::Marshal<void>::FMGL(DOUBLE__get)()->x10::io::Marshal__DoubleMarshal::write(
      this, x);
}

//#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
void x10::io::Writer::writeBoolean(x10_boolean x) {
    
    //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    ::x10::io::Marshal<void>::FMGL(BOOLEAN__get)()->x10::io::Marshal__BooleanMarshal::write(
      this, x);
}

//#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"

//#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
::x10::io::OutputStreamWriter__OutputStream* x10::io::Writer::getNativeOutputStream(
  ) {
    
    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
    return ::x10aux::class_cast_unchecked< ::x10::io::OutputStreamWriter__OutputStream*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
    
}

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Writer.x10"
::x10::io::Writer* x10::io::Writer::x10__io__Writer____this__x10__io__Writer(
  ) {
    return this;
    
}
void x10::io::Writer::_constructor() {
    ::x10::io::Writer* this__87907 = this;
    
}

void x10::io::Writer::__fieldInitializers_x10_io_Writer() {
 
}
void x10::io::Writer::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

void x10::io::Writer::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::io::Writer::rtt;
void x10::io::Writer::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.io.Writer",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of Writer */
/*************************************************/
