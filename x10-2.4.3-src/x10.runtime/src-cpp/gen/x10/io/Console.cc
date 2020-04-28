/*************************************************/
/* START of Console */
#include <x10/io/Console.h>


//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Console.x10"

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Console.x10"

//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Console.x10"

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Console.x10"
::x10::io::Printer* x10::io::Console::FMGL(OUT);
void x10::io::Console::FMGL(OUT__do_init)() {
    FMGL(OUT__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::io::Console.OUT");
    ::x10::io::Printer* __var382__ = ::x10::io::Printer::_make(reinterpret_cast< ::x10::io::Writer*>(::x10::io::OutputStreamWriter::_make(::x10::io::OutputStreamWriter__OutputStream::STANDARD_OUT())));
    FMGL(OUT) = __var382__;
    FMGL(OUT__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::io::Console::FMGL(OUT__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(OUT__status), &FMGL(OUT__do_init), &FMGL(OUT__exception), "x10::io::Console.OUT");
    
}
volatile ::x10aux::StaticInitController::status x10::io::Console::FMGL(OUT__status);
::x10::lang::CheckedThrowable* x10::io::Console::FMGL(OUT__exception);

//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Console.x10"
::x10::io::Printer* x10::io::Console::FMGL(ERR);
void x10::io::Console::FMGL(ERR__do_init)() {
    FMGL(ERR__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::io::Console.ERR");
    ::x10::io::Printer* __var383__ = ::x10::io::Printer::_make(reinterpret_cast< ::x10::io::Writer*>(::x10::io::OutputStreamWriter::_make(::x10::io::OutputStreamWriter__OutputStream::STANDARD_ERR())));
    FMGL(ERR) = __var383__;
    FMGL(ERR__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::io::Console::FMGL(ERR__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(ERR__status), &FMGL(ERR__do_init), &FMGL(ERR__exception), "x10::io::Console.ERR");
    
}
volatile ::x10aux::StaticInitController::status x10::io::Console::FMGL(ERR__status);
::x10::lang::CheckedThrowable* x10::io::Console::FMGL(ERR__exception);

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Console.x10"
::x10::io::Reader* x10::io::Console::FMGL(IN);
void x10::io::Console::FMGL(IN__do_init)() {
    FMGL(IN__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::io::Console.IN");
    ::x10::io::Reader* __var384__ = ::x10::io::InputStreamReader::_make(::x10::io::InputStreamReader__InputStream::STANDARD_IN());
    FMGL(IN) = __var384__;
    FMGL(IN__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::io::Console::FMGL(IN__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(IN__status), &FMGL(IN__do_init), &FMGL(IN__exception), "x10::io::Console.IN");
    
}
volatile ::x10aux::StaticInitController::status x10::io::Console::FMGL(IN__status);
::x10::lang::CheckedThrowable* x10::io::Console::FMGL(IN__exception);

//#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Console.x10"
::x10::io::Console* x10::io::Console::x10__io__Console____this__x10__io__Console(
  ) {
    return this;
    
}
void x10::io::Console::_constructor() {
    ::x10::io::Console* this__86903 = this;
    
}
::x10::io::Console* x10::io::Console::_make() {
    ::x10::io::Console* this_ = new (::x10aux::alloc_z< ::x10::io::Console>()) ::x10::io::Console();
    this_->_constructor();
    return this_;
}


void x10::io::Console::__fieldInitializers_x10_io_Console() {
 
}
const ::x10aux::serialization_id_t x10::io::Console::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::io::Console::_deserializer);

void x10::io::Console::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::io::Console::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::io::Console* this_ = new (::x10aux::alloc_z< ::x10::io::Console>()) ::x10::io::Console();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::io::Console::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::io::Console::rtt;
void x10::io::Console::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.io.Console",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of Console */
/*************************************************/
