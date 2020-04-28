/*************************************************/
/* START of FileSystem */
#include <x10/io/FileSystem.h>


//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileSystem.x10"
x10_char x10::io::FileSystem::FMGL(SEPARATOR_CHAR);
void x10::io::FileSystem::FMGL(SEPARATOR_CHAR__do_init)() {
    FMGL(SEPARATOR_CHAR__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::io::FileSystem.SEPARATOR_CHAR");
    x10_char __var403__ = ((x10_char)'/');
    FMGL(SEPARATOR_CHAR) = __var403__;
    FMGL(SEPARATOR_CHAR__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::io::FileSystem::FMGL(SEPARATOR_CHAR__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(SEPARATOR_CHAR__status), &FMGL(SEPARATOR_CHAR__do_init), &FMGL(SEPARATOR_CHAR__exception), "x10::io::FileSystem.SEPARATOR_CHAR");
    
}
volatile ::x10aux::StaticInitController::status x10::io::FileSystem::FMGL(SEPARATOR_CHAR__status);
::x10::lang::CheckedThrowable* x10::io::FileSystem::FMGL(SEPARATOR_CHAR__exception);

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileSystem.x10"
::x10::lang::String* x10::io::FileSystem::FMGL(SEPARATOR);
void x10::io::FileSystem::FMGL(SEPARATOR__do_init)() {
    FMGL(SEPARATOR__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::io::FileSystem.SEPARATOR");
    ::x10::lang::String* __var404__ = (__extension__ ({ static ::x10::lang::String* strLit__123646 = ::x10aux::makeStringLit("/"); strLit__123646; }));
    FMGL(SEPARATOR) = __var404__;
    FMGL(SEPARATOR__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::io::FileSystem::FMGL(SEPARATOR__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(SEPARATOR__status), &FMGL(SEPARATOR__do_init), &FMGL(SEPARATOR__exception), "x10::io::FileSystem.SEPARATOR");
    
}
volatile ::x10aux::StaticInitController::status x10::io::FileSystem::FMGL(SEPARATOR__status);
::x10::lang::CheckedThrowable* x10::io::FileSystem::FMGL(SEPARATOR__exception);

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileSystem.x10"
x10_char x10::io::FileSystem::FMGL(PATH_SEPARATOR_CHAR);
void x10::io::FileSystem::FMGL(PATH_SEPARATOR_CHAR__do_init)() {
    FMGL(PATH_SEPARATOR_CHAR__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::io::FileSystem.PATH_SEPARATOR_CHAR");
    x10_char __var405__ = ((x10_char)':');
    FMGL(PATH_SEPARATOR_CHAR) = __var405__;
    FMGL(PATH_SEPARATOR_CHAR__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::io::FileSystem::FMGL(PATH_SEPARATOR_CHAR__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(PATH_SEPARATOR_CHAR__status), &FMGL(PATH_SEPARATOR_CHAR__do_init), &FMGL(PATH_SEPARATOR_CHAR__exception), "x10::io::FileSystem.PATH_SEPARATOR_CHAR");
    
}
volatile ::x10aux::StaticInitController::status x10::io::FileSystem::FMGL(PATH_SEPARATOR_CHAR__status);
::x10::lang::CheckedThrowable* x10::io::FileSystem::FMGL(PATH_SEPARATOR_CHAR__exception);

//#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileSystem.x10"
::x10::lang::String* x10::io::FileSystem::FMGL(PATH_SEPARATOR);
void x10::io::FileSystem::FMGL(PATH_SEPARATOR__do_init)() {
    FMGL(PATH_SEPARATOR__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::io::FileSystem.PATH_SEPARATOR");
    ::x10::lang::String* __var406__ = (__extension__ ({ static ::x10::lang::String* strLit__123647 = ::x10aux::makeStringLit(":"); strLit__123647; }));
    FMGL(PATH_SEPARATOR) = __var406__;
    FMGL(PATH_SEPARATOR__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::io::FileSystem::FMGL(PATH_SEPARATOR__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(PATH_SEPARATOR__status), &FMGL(PATH_SEPARATOR__do_init), &FMGL(PATH_SEPARATOR__exception), "x10::io::FileSystem.PATH_SEPARATOR");
    
}
volatile ::x10aux::StaticInitController::status x10::io::FileSystem::FMGL(PATH_SEPARATOR__status);
::x10::lang::CheckedThrowable* x10::io::FileSystem::FMGL(PATH_SEPARATOR__exception);

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileSystem.x10"
void x10::io::FileSystem::_kwd__delete(::x10::io::File* id__55) {
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileSystem.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
}

//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileSystem.x10"
void x10::io::FileSystem::deleteOnExit(::x10::io::File* id__56) {
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileSystem.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
}

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileSystem.x10"
void x10::io::FileSystem::rename(::x10::io::File* f, ::x10::io::File* t) {
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileSystem.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
}

//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileSystem.x10"
void x10::io::FileSystem::mkdir(::x10::io::File* id__57) {
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileSystem.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
}

//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileSystem.x10"
void x10::io::FileSystem::mkdirs(::x10::io::File* id__58) {
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileSystem.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
}

//#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileSystem.x10"
x10_boolean x10::io::FileSystem::exists(::x10::io::File* id__59) {
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileSystem.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
}

//#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileSystem.x10"
x10_long x10::io::FileSystem::size(::x10::io::File* id__60) {
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileSystem.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
}

//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileSystem.x10"
::x10::lang::Rail< ::x10::io::File* >* x10::io::FileSystem::listFiles(::x10::io::File* id__61) {
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileSystem.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
}

//#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileSystem.x10"
::x10::lang::Rail< ::x10::io::File* >* x10::io::FileSystem::listFiles(::x10::io::File* id__62,
                                                                      ::x10::lang::Fun_0_1< ::x10::io::File*, x10_boolean>* id__64) {
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileSystem.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
}

//#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/FileSystem.x10"
::x10::io::FileSystem* x10::io::FileSystem::x10__io__FileSystem____this__x10__io__FileSystem(
  ) {
    return this;
    
}
void x10::io::FileSystem::_constructor() {
    ::x10::io::FileSystem* this__87044 = this;
    
}

void x10::io::FileSystem::__fieldInitializers_x10_io_FileSystem(
  ) {
 
}
void x10::io::FileSystem::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

void x10::io::FileSystem::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::io::FileSystem::rtt;
void x10::io::FileSystem::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.io.FileSystem",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of FileSystem */
/*************************************************/
