/*************************************************/
/* START of Configuration */
#include <x10/lang/Configuration.h>


//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"

//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
x10_int x10::lang::Configuration::FMGL(AVAILABLE_PROCESSORS);
void x10::lang::Configuration::FMGL(AVAILABLE_PROCESSORS__do_init)() {
    FMGL(AVAILABLE_PROCESSORS__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Configuration.AVAILABLE_PROCESSORS");
    x10_int __var777__ = ((x10_int)1);
    FMGL(AVAILABLE_PROCESSORS) = __var777__;
    FMGL(AVAILABLE_PROCESSORS__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Configuration::FMGL(AVAILABLE_PROCESSORS__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(AVAILABLE_PROCESSORS__status), &FMGL(AVAILABLE_PROCESSORS__do_init), &FMGL(AVAILABLE_PROCESSORS__exception), "x10::lang::Configuration.AVAILABLE_PROCESSORS");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Configuration::FMGL(AVAILABLE_PROCESSORS__status);
::x10::lang::CheckedThrowable* x10::lang::Configuration::FMGL(AVAILABLE_PROCESSORS__exception);

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"

//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
x10_boolean x10::lang::Configuration::envOrElse(::x10::lang::String* s, x10_boolean b) {
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    ::x10::lang::String* v = ::x10aux::nullCheck(::x10::lang::Runtime::FMGL(env__get)())->getOrElse(
                               s, ::x10aux::class_cast_unchecked< ::x10::lang::String*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    if ((::x10aux::struct_equals(v, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        return b;
        
    }
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    return !(((::x10aux::nullCheck(v)->x10::lang::String::equalsIgnoreCase(
                 (__extension__ ({ static ::x10::lang::String* strLit__124175 = ::x10aux::makeStringLit("false"); strLit__124175; }))) ||
    ::x10aux::nullCheck(v)->x10::lang::String::equalsIgnoreCase(
      (__extension__ ({ static ::x10::lang::String* strLit__124176 = ::x10aux::makeStringLit("f"); strLit__124176; })))) ||
    ::x10aux::equals(v,(__extension__ ({ static ::x10::lang::String* strLit__124177 = ::x10aux::makeStringLit("0"); strLit__124177; })))));
    
}

//#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
x10_boolean x10::lang::Configuration::strict_finish() {
    return ::x10::lang::Configuration::envOrElse((__extension__ ({ static ::x10::lang::String* strLit__124178 = ::x10aux::makeStringLit("X10_STRICT_FINISH"); strLit__124178; })),
                                                 false);
    
}

//#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
x10_boolean x10::lang::Configuration::static_threads() {
    return ::x10::lang::Configuration::envOrElse((__extension__ ({ static ::x10::lang::String* strLit__124179 = ::x10aux::makeStringLit("X10_STATIC_THREADS"); strLit__124179; })),
                                                 DEFAULT_STATIC_THREADS);
    
}

//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
x10_boolean x10::lang::Configuration::warn_on_thread_creation(
  ) {
    return ::x10::lang::Configuration::envOrElse((__extension__ ({ static ::x10::lang::String* strLit__124180 = ::x10aux::makeStringLit("X10_WARN_ON_THREAD_CREATION"); strLit__124180; })),
                                                 false);
    
}

//#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
x10_boolean x10::lang::Configuration::busy_waiting() {
    return ::x10::lang::Configuration::envOrElse((__extension__ ({ static ::x10::lang::String* strLit__124181 = ::x10aux::makeStringLit("X10_BUSY_WAITING"); strLit__124181; })),
                                                 false);
    
}

//#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
x10_int x10::lang::Configuration::nthreads() {
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    x10_int v = ((x10_int)0);
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    try {
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        v = ::x10::lang::IntNatives::parseInt(::x10aux::nullCheck(::x10::lang::Runtime::FMGL(env__get)())->getOrElse(
                                                (__extension__ ({ static ::x10::lang::String* strLit__124184 = ::x10aux::makeStringLit("X10_NTHREADS"); strLit__124184; })),
                                                (__extension__ ({ static ::x10::lang::String* strLit__124185 = ::x10aux::makeStringLit("1"); strLit__124185; }))));
    }
    catch (::x10::lang::CheckedThrowable* __exc784) {
        if (::x10aux::instanceof< ::x10::lang::NumberFormatException*>(__exc784)) {
            ::x10::lang::NumberFormatException* id__69 = static_cast< ::x10::lang::NumberFormatException*>(__exc784);
            {
             
            }
        } else
        throw;
    }
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    if (((((x10_long)(v))) <= (((x10_long)0ll)))) {
        v = ::x10::lang::Configuration::FMGL(AVAILABLE_PROCESSORS__get)();
    }
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    if (((v) > (PLATFORM_MAX_THREADS))) {
        v = PLATFORM_MAX_THREADS;
    }
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    return v;
    
}

//#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
x10_double x10::lang::Configuration::deltaCustom() {
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    x10_double v = 0.01;
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    v = ::x10::lang::DoubleNatives::parseDouble(::x10aux::nullCheck(::x10::lang::Runtime::FMGL(env__get)())->getOrElse(
                                                  (__extension__ ({ static ::x10::lang::String* strLit__124188 = ::x10aux::makeStringLit("CHUNK_DELTA"); strLit__124188; })),
                                                  (__extension__ ({ static ::x10::lang::String* strLit__124189 = ::x10aux::makeStringLit("0.1"); strLit__124189; }))));
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    return v;
    
}

//#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
x10_int x10::lang::Configuration::max_threads() {
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    x10_int v = ((x10_int)0);
    
    //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    try {
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        v = ::x10::lang::IntNatives::parseInt(::x10aux::nullCheck(::x10::lang::Runtime::FMGL(env__get)())->getOrElse(
                                                (__extension__ ({ static ::x10::lang::String* strLit__124192 = ::x10aux::makeStringLit("X10_MAX_THREADS"); strLit__124192; })),
                                                (__extension__ ({ static ::x10::lang::String* strLit__124193 = ::x10aux::makeStringLit("0"); strLit__124193; }))));
    }
    catch (::x10::lang::CheckedThrowable* __exc787) {
        if (::x10aux::instanceof< ::x10::lang::NumberFormatException*>(__exc787)) {
            ::x10::lang::NumberFormatException* id__70 = static_cast< ::x10::lang::NumberFormatException*>(__exc787);
            {
             
            }
        } else
        throw;
    }
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    if (((((x10_long)(v))) <= (((x10_long)0ll)))) {
        v = ::x10::lang::Configuration::nthreads();
    }
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    if ((!(::x10::lang::Configuration::envOrElse((__extension__ ({ static ::x10::lang::String* strLit__124194 = ::x10aux::makeStringLit("X10_STATIC_THREADS"); strLit__124194; })),
                                                 DEFAULT_STATIC_THREADS)) &&
        ((((x10_long)(v))) < (((x10_long)1000ll))))) {
        v = ((x10_int)1000);
    }
    
    //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    if (((v) > (PLATFORM_MAX_THREADS))) {
        v = PLATFORM_MAX_THREADS;
    }
    
    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    return v;
    
}

//#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
x10_int x10::lang::Configuration::FMGL(RESILIENT_MODE_NONE);
void x10::lang::Configuration::FMGL(RESILIENT_MODE_NONE__do_init)() {
    FMGL(RESILIENT_MODE_NONE__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Configuration.RESILIENT_MODE_NONE");
    x10_int __var788__ = ((x10_int)0);
    FMGL(RESILIENT_MODE_NONE) = __var788__;
    FMGL(RESILIENT_MODE_NONE__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Configuration::FMGL(RESILIENT_MODE_NONE__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(RESILIENT_MODE_NONE__status), &FMGL(RESILIENT_MODE_NONE__do_init), &FMGL(RESILIENT_MODE_NONE__exception), "x10::lang::Configuration.RESILIENT_MODE_NONE");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Configuration::FMGL(RESILIENT_MODE_NONE__status);
::x10::lang::CheckedThrowable* x10::lang::Configuration::FMGL(RESILIENT_MODE_NONE__exception);

//#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
x10_int x10::lang::Configuration::FMGL(RESILIENT_MODE_PLACE_ZERO);
void x10::lang::Configuration::FMGL(RESILIENT_MODE_PLACE_ZERO__do_init)() {
    FMGL(RESILIENT_MODE_PLACE_ZERO__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Configuration.RESILIENT_MODE_PLACE_ZERO");
    x10_int __var789__ = ((x10_int)1);
    FMGL(RESILIENT_MODE_PLACE_ZERO) = __var789__;
    FMGL(RESILIENT_MODE_PLACE_ZERO__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Configuration::FMGL(RESILIENT_MODE_PLACE_ZERO__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(RESILIENT_MODE_PLACE_ZERO__status), &FMGL(RESILIENT_MODE_PLACE_ZERO__do_init), &FMGL(RESILIENT_MODE_PLACE_ZERO__exception), "x10::lang::Configuration.RESILIENT_MODE_PLACE_ZERO");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Configuration::FMGL(RESILIENT_MODE_PLACE_ZERO__status);
::x10::lang::CheckedThrowable* x10::lang::Configuration::FMGL(RESILIENT_MODE_PLACE_ZERO__exception);

//#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
x10_int x10::lang::Configuration::FMGL(RESILIENT_MODE_DISTRIBUTED);
void x10::lang::Configuration::FMGL(RESILIENT_MODE_DISTRIBUTED__do_init)() {
    FMGL(RESILIENT_MODE_DISTRIBUTED__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Configuration.RESILIENT_MODE_DISTRIBUTED");
    x10_int __var790__ = ((x10_int)2);
    FMGL(RESILIENT_MODE_DISTRIBUTED) = __var790__;
    FMGL(RESILIENT_MODE_DISTRIBUTED__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Configuration::FMGL(RESILIENT_MODE_DISTRIBUTED__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(RESILIENT_MODE_DISTRIBUTED__status), &FMGL(RESILIENT_MODE_DISTRIBUTED__do_init), &FMGL(RESILIENT_MODE_DISTRIBUTED__exception), "x10::lang::Configuration.RESILIENT_MODE_DISTRIBUTED");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Configuration::FMGL(RESILIENT_MODE_DISTRIBUTED__status);
::x10::lang::CheckedThrowable* x10::lang::Configuration::FMGL(RESILIENT_MODE_DISTRIBUTED__exception);

//#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
x10_int x10::lang::Configuration::FMGL(RESILIENT_MODE_ZOO_KEEPER);
void x10::lang::Configuration::FMGL(RESILIENT_MODE_ZOO_KEEPER__do_init)() {
    FMGL(RESILIENT_MODE_ZOO_KEEPER__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Configuration.RESILIENT_MODE_ZOO_KEEPER");
    x10_int __var791__ = ((x10_int)3);
    FMGL(RESILIENT_MODE_ZOO_KEEPER) = __var791__;
    FMGL(RESILIENT_MODE_ZOO_KEEPER__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Configuration::FMGL(RESILIENT_MODE_ZOO_KEEPER__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(RESILIENT_MODE_ZOO_KEEPER__status), &FMGL(RESILIENT_MODE_ZOO_KEEPER__do_init), &FMGL(RESILIENT_MODE_ZOO_KEEPER__exception), "x10::lang::Configuration.RESILIENT_MODE_ZOO_KEEPER");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Configuration::FMGL(RESILIENT_MODE_ZOO_KEEPER__status);
::x10::lang::CheckedThrowable* x10::lang::Configuration::FMGL(RESILIENT_MODE_ZOO_KEEPER__exception);

//#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
x10_int x10::lang::Configuration::FMGL(RESILIENT_MODE_SAMPLE);
void x10::lang::Configuration::FMGL(RESILIENT_MODE_SAMPLE__do_init)() {
    FMGL(RESILIENT_MODE_SAMPLE__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Configuration.RESILIENT_MODE_SAMPLE");
    x10_int __var792__ = ((x10_int)9);
    FMGL(RESILIENT_MODE_SAMPLE) = __var792__;
    FMGL(RESILIENT_MODE_SAMPLE__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Configuration::FMGL(RESILIENT_MODE_SAMPLE__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(RESILIENT_MODE_SAMPLE__status), &FMGL(RESILIENT_MODE_SAMPLE__do_init), &FMGL(RESILIENT_MODE_SAMPLE__exception), "x10::lang::Configuration.RESILIENT_MODE_SAMPLE");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Configuration::FMGL(RESILIENT_MODE_SAMPLE__status);
::x10::lang::CheckedThrowable* x10::lang::Configuration::FMGL(RESILIENT_MODE_SAMPLE__exception);

//#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
x10_int x10::lang::Configuration::FMGL(RESILIENT_MODE_PLACE0);
void x10::lang::Configuration::FMGL(RESILIENT_MODE_PLACE0__do_init)() {
    FMGL(RESILIENT_MODE_PLACE0__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Configuration.RESILIENT_MODE_PLACE0");
    x10_int __var793__ = ((x10_int)11);
    FMGL(RESILIENT_MODE_PLACE0) = __var793__;
    FMGL(RESILIENT_MODE_PLACE0__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Configuration::FMGL(RESILIENT_MODE_PLACE0__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(RESILIENT_MODE_PLACE0__status), &FMGL(RESILIENT_MODE_PLACE0__do_init), &FMGL(RESILIENT_MODE_PLACE0__exception), "x10::lang::Configuration.RESILIENT_MODE_PLACE0");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Configuration::FMGL(RESILIENT_MODE_PLACE0__status);
::x10::lang::CheckedThrowable* x10::lang::Configuration::FMGL(RESILIENT_MODE_PLACE0__exception);

//#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
x10_int x10::lang::Configuration::resilient_mode() {
    
    //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    x10_int v = ((x10_int)0);
    
    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    try {
        
        //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
        v = ::x10::lang::IntNatives::parseInt(::x10aux::nullCheck(::x10::lang::Runtime::FMGL(env__get)())->getOrElse(
                                                (__extension__ ({ static ::x10::lang::String* strLit__124197 = ::x10aux::makeStringLit("X10_RESILIENT_MODE"); strLit__124197; })),
                                                (__extension__ ({ static ::x10::lang::String* strLit__124198 = ::x10aux::makeStringLit("0"); strLit__124198; }))));
    }
    catch (::x10::lang::CheckedThrowable* __exc795) {
        if (::x10aux::instanceof< ::x10::lang::NumberFormatException*>(__exc795)) {
            ::x10::lang::NumberFormatException* id__71 = static_cast< ::x10::lang::NumberFormatException*>(__exc795);
            {
             
            }
        } else
        throw;
    }
    
    //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
    return v;
    
}

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Configuration.x10"
::x10::lang::Configuration* x10::lang::Configuration::x10__lang__Configuration____this__x10__lang__Configuration(
  ) {
    return this;
    
}
void x10::lang::Configuration::_constructor() {
    ::x10::lang::Configuration* this__93591 = this;
    
}
::x10::lang::Configuration* x10::lang::Configuration::_make(
  ) {
    ::x10::lang::Configuration* this_ = new (::x10aux::alloc_z< ::x10::lang::Configuration>()) ::x10::lang::Configuration();
    this_->_constructor();
    return this_;
}


void x10::lang::Configuration::__fieldInitializers_x10_lang_Configuration(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::Configuration::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::Configuration::_deserializer);

void x10::lang::Configuration::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::lang::Configuration::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Configuration* this_ = new (::x10aux::alloc_z< ::x10::lang::Configuration>()) ::x10::lang::Configuration();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::Configuration::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::lang::Configuration::rtt;
void x10::lang::Configuration::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.lang.Configuration",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of Configuration */
/*************************************************/
