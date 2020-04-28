/*************************************************/
/* START of FileReader */
#include <x10/io/FileReader.h>

::x10::io::Unserializable::itable< ::x10::io::FileReader >  x10::io::FileReader::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::io::FileReader >  x10::io::FileReader::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::io::FileReader::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Unserializable>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::io::FileReader")};

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"

//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"

//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
::x10::lang::String* x10::io::FileReader::readLine(){
    return reinterpret_cast< ::x10::io::FileReader__FileInputStream* >((this)->FMGL(stream))->readLine();
}

//#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
::x10::io::FileReader__FRLM* x10::io::FileReader::FMGL(M);
void x10::io::FileReader::FMGL(M__do_init)() {
    FMGL(M__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::io::FileReader.M");
    ::x10::io::FileReader__FRLM* __var395__ = ::x10::io::FileReader__FRLM::_make();
    FMGL(M) = __var395__;
    FMGL(M__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::io::FileReader::FMGL(M__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(M__status), &FMGL(M__do_init), &FMGL(M__exception), "x10::io::FileReader.M");
    
}
volatile ::x10aux::StaticInitController::status x10::io::FileReader::FMGL(M__status);
::x10::lang::CheckedThrowable* x10::io::FileReader::FMGL(M__exception);

//#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
::x10::io::ReaderIterator< ::x10::lang::String*>* x10::io::FileReader::lines(
  ) {
    ::x10::io::ReaderIterator< ::x10::lang::String*>* alloc__87038 =  (new (::x10aux::alloc_z< ::x10::io::ReaderIterator< ::x10::lang::String*> >()) ::x10::io::ReaderIterator< ::x10::lang::String*>());
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
    ::x10::io::Marshal< ::x10::lang::String*>* m__87036 = reinterpret_cast< ::x10::io::Marshal< ::x10::lang::String*>*>(::x10::io::FileReader::FMGL(M__get)());
    ::x10::io::Reader* r__87037 = reinterpret_cast< ::x10::io::Reader*>(this);
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
    alloc__87038->FMGL(next) = ::x10aux::zeroValue< ::x10::lang::String* >();
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
    alloc__87038->FMGL(m) = m__87036;
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/ReaderIterator.x10"
    alloc__87038->FMGL(r) = r__87037;
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
    return alloc__87038;
    
}

//#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
void x10::io::FileReader::_constructor(::x10::io::File* file) {
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
    (this)->::x10::io::InputStreamReader::_constructor(reinterpret_cast< ::x10::io::InputStreamReader__InputStream*>(::x10::io::FileReader__FileInputStream::_make(::x10aux::nullCheck(file)->getPath())));
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
    ::x10::io::FileReader* this__87040 = this;
    ::x10aux::nullCheck(this__87040)->FMGL(buf) = (__extension__ ({
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
        ::x10::util::GrowableRail<x10_byte>* alloc__87039 =  (new (::x10aux::alloc_z< ::x10::util::GrowableRail<x10_byte> >()) ::x10::util::GrowableRail<x10_byte>());
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        (alloc__87039)->::x10::util::GrowableRail<x10_byte>::_constructor(
          ((x10_long)0ll));
        alloc__87039;
    }))
    ;
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
    this->FMGL(file) = file;
}
::x10::io::FileReader* x10::io::FileReader::_make(::x10::io::File* file) {
    ::x10::io::FileReader* this_ = new (::x10aux::alloc_z< ::x10::io::FileReader>()) ::x10::io::FileReader();
    this_->_constructor(file);
    return this_;
}



//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
::x10::io::FileReader* x10::io::FileReader::x10__io__FileReader____this__x10__io__FileReader(
  ) {
    return this;
    
}
void x10::io::FileReader::__fieldInitializers_x10_io_FileReader() {
    this->FMGL(buf) = (__extension__ ({
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
        ::x10::util::GrowableRail<x10_byte>* alloc__86921 =  (new (::x10aux::alloc_z< ::x10::util::GrowableRail<x10_byte> >()) ::x10::util::GrowableRail<x10_byte>());
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        (alloc__86921)->::x10::util::GrowableRail<x10_byte>::_constructor(
          ((x10_long)0ll));
        alloc__86921;
    }))
    ;
}
::x10aux::RuntimeType x10::io::FileReader::rtt;
void x10::io::FileReader::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::io::InputStreamReader>(), ::x10aux::getRTT< ::x10::io::Unserializable>()};
    rtt.initStageTwo("x10.io.FileReader",::x10aux::RuntimeType::class_kind, 2, parents, 0, NULL, NULL);
}

/* END of FileReader */
/*************************************************/
/*************************************************/
/* START of FileReader$FRLM */
#include <x10/io/FileReader__FRLM.h>

#include <x10/io/Marshal.h>
#include <x10/lang/String.h>
#include <x10/io/Reader.h>
#include <x10/io/Writer.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Byte.h>
#include <x10/compiler/Synthetic.h>
::x10::io::Marshal< ::x10::lang::String*>::itable< ::x10::io::FileReader__FRLM >  x10::io::FileReader__FRLM::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::io::FileReader__FRLM::read, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName, &x10::io::FileReader__FRLM::write);
::x10::lang::Any::itable< ::x10::io::FileReader__FRLM >  x10::io::FileReader__FRLM::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::io::FileReader__FRLM::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Marshal< ::x10::lang::String*> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::io::FileReader__FRLM")};

//#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
::x10::lang::String* x10::io::FileReader__FRLM::read(::x10::io::Reader* r) {
    return ::x10aux::nullCheck(r)->readLine();
    
}

//#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
void x10::io::FileReader__FRLM::write(::x10::io::Writer* w, ::x10::lang::String* s) {
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
    ::x10aux::nullCheck(w)->write(::x10aux::nullCheck(s)->x10::lang::String::bytes());
}

//#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileReader.x10"
::x10::io::FileReader__FRLM* x10::io::FileReader__FRLM::x10__io__FileReader__FRLM____this__x10__io__FileReader__FRLM(
  ) {
    return this;
    
}
void x10::io::FileReader__FRLM::_constructor() {
    ::x10::io::FileReader__FRLM* this__87035 = this;
    
}
::x10::io::FileReader__FRLM* x10::io::FileReader__FRLM::_make() {
    ::x10::io::FileReader__FRLM* this_ = new (::x10aux::alloc_z< ::x10::io::FileReader__FRLM>()) ::x10::io::FileReader__FRLM();
    this_->_constructor();
    return this_;
}


void x10::io::FileReader__FRLM::__fieldInitializers_x10_io_FileReader_FRLM(
  ) {
 
}
const ::x10aux::serialization_id_t x10::io::FileReader__FRLM::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::io::FileReader__FRLM::_deserializer);

void x10::io::FileReader__FRLM::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::io::FileReader__FRLM::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::io::FileReader__FRLM* this_ = new (::x10aux::alloc_z< ::x10::io::FileReader__FRLM>()) ::x10::io::FileReader__FRLM();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::io::FileReader__FRLM::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::io::FileReader__FRLM::rtt;
void x10::io::FileReader__FRLM::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::io::Marshal< ::x10::lang::String*> >()};
    rtt.initStageTwo("x10.io.FileReader.FRLM",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of FileReader$FRLM */
/*************************************************/
