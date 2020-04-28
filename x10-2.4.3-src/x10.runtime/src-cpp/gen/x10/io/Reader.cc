/*************************************************/
/* START of Reader */
#include <x10/io/Reader.h>


//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"

//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"

//#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"

//#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"

//#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"

//#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"

//#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"

//#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"

//#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
x10_boolean x10::io::Reader::readBoolean() {
    ::x10::io::Marshal__BooleanMarshal* this__87835 = ::x10::io::Marshal<void>::FMGL(BOOLEAN__get)();
    
    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    ::x10::io::Reader* r__87836 = this;
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    return (!::x10aux::struct_equals(::x10aux::nullCheck(r__87836)->read(),
                                     ((x10_byte)0)));
    
}

//#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
x10_byte x10::io::Reader::readByte() {
    ::x10::io::Marshal__ByteMarshal* this__87837 = ::x10::io::Marshal<void>::FMGL(BYTE__get)();
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    ::x10::io::Reader* r__87838 = this;
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    return ::x10aux::nullCheck(r__87838)->read();
    
}

//#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
x10_ubyte x10::io::Reader::readUByte() {
    return ::x10::io::Marshal<void>::FMGL(UBYTE__get)()->x10::io::Marshal__UByteMarshal::read(
             this);
    
}

//#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
x10_char x10::io::Reader::readChar() {
    return ::x10::io::Marshal<void>::FMGL(CHAR__get)()->x10::io::Marshal__CharMarshal::read(
             this);
    
}

//#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
x10_short x10::io::Reader::readShort() {
    return ::x10::io::Marshal<void>::FMGL(SHORT__get)()->x10::io::Marshal__ShortMarshal::read(
             this);
    
}

//#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
x10_ushort x10::io::Reader::readUShort() {
    return ::x10::io::Marshal<void>::FMGL(USHORT__get)()->x10::io::Marshal__UShortMarshal::read(
             this);
    
}

//#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
x10_int x10::io::Reader::readInt() {
    return ::x10::io::Marshal<void>::FMGL(INT__get)()->x10::io::Marshal__IntMarshal::read(
             this);
    
}

//#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
x10_uint x10::io::Reader::readUInt() {
    return ::x10::io::Marshal<void>::FMGL(UINT__get)()->x10::io::Marshal__UIntMarshal::read(
             this);
    
}

//#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
x10_long x10::io::Reader::readLong() {
    return ::x10::io::Marshal<void>::FMGL(LONG__get)()->x10::io::Marshal__LongMarshal::read(
             this);
    
}

//#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
x10_ulong x10::io::Reader::readULong() {
    return ::x10::io::Marshal<void>::FMGL(ULONG__get)()->x10::io::Marshal__ULongMarshal::read(
             this);
    
}

//#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
x10_float x10::io::Reader::readFloat() {
    return ::x10::io::Marshal<void>::FMGL(FLOAT__get)()->x10::io::Marshal__FloatMarshal::read(
             this);
    
}

//#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
x10_double x10::io::Reader::readDouble() {
    return ::x10::io::Marshal<void>::FMGL(DOUBLE__get)()->x10::io::Marshal__DoubleMarshal::read(
             this);
    
}

//#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
::x10::lang::String* x10::io::Reader::readLine() {
    return ::x10::io::Marshal<void>::FMGL(LINE__get)()->x10::io::Marshal__LineMarshal::read(
             this);
    
}

//#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"

//#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"

//#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"

//#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
::x10::io::ReaderIterator< ::x10::lang::String*>* x10::io::Reader::lines(
  ) {
    ::x10::io::ReaderIterator< ::x10::lang::String*>* alloc__87841 =
       (new (::x10aux::alloc_z< ::x10::io::ReaderIterator< ::x10::lang::String*> >()) ::x10::io::ReaderIterator< ::x10::lang::String*>());
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
    ::x10::io::Marshal< ::x10::lang::String*>* m__87839 =
      reinterpret_cast< ::x10::io::Marshal< ::x10::lang::String*>*>(::x10::io::Marshal<void>::FMGL(LINE__get)());
    ::x10::io::Reader* r__87840 = this;
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
    alloc__87841->FMGL(next) = ::x10aux::zeroValue< ::x10::lang::String* >();
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
    alloc__87841->FMGL(m) = m__87839;
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
    alloc__87841->FMGL(r) = r__87840;
    
    //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    return alloc__87841;
    
}

//#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
::x10::io::ReaderIterator<x10_char>* x10::io::Reader::chars(
  ) {
    ::x10::io::ReaderIterator<x10_char>* alloc__87844 =  (new (::x10aux::alloc_z< ::x10::io::ReaderIterator<x10_char> >()) ::x10::io::ReaderIterator<x10_char>());
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
    ::x10::io::Marshal<x10_char>* m__87842 = reinterpret_cast< ::x10::io::Marshal<x10_char>*>(::x10::io::Marshal<void>::FMGL(CHAR__get)());
    ::x10::io::Reader* r__87843 = this;
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
    alloc__87844->FMGL(next) = ::x10aux::zeroValue< x10_char >();
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
    alloc__87844->FMGL(m) = m__87842;
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
    alloc__87844->FMGL(r) = r__87843;
    
    //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    return alloc__87844;
    
}

//#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
::x10::io::ReaderIterator<x10_byte>* x10::io::Reader::bytes(
  ) {
    ::x10::io::ReaderIterator<x10_byte>* alloc__87847 =  (new (::x10aux::alloc_z< ::x10::io::ReaderIterator<x10_byte> >()) ::x10::io::ReaderIterator<x10_byte>());
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
    ::x10::io::Marshal<x10_byte>* m__87845 = reinterpret_cast< ::x10::io::Marshal<x10_byte>*>(::x10::io::Marshal<void>::FMGL(BYTE__get)());
    ::x10::io::Reader* r__87846 = this;
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
    alloc__87847->FMGL(next) = ::x10aux::zeroValue< x10_byte >();
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
    alloc__87847->FMGL(m) = m__87845;
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
    alloc__87847->FMGL(r) = r__87846;
    
    //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
    return alloc__87847;
    
}

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Reader.x10"
::x10::io::Reader* x10::io::Reader::x10__io__Reader____this__x10__io__Reader(
  ) {
    return this;
    
}
void x10::io::Reader::_constructor() {
    ::x10::io::Reader* this__87848 = this;
    
}

void x10::io::Reader::__fieldInitializers_x10_io_Reader() {
 
}
void x10::io::Reader::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

void x10::io::Reader::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::io::Reader::rtt;
void x10::io::Reader::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.io.Reader",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of Reader */
/*************************************************/
