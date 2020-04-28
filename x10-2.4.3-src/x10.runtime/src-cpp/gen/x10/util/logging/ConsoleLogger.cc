/*************************************************/
/* START of ConsoleLogger */
#include <x10/util/logging/ConsoleLogger.h>

::x10::util::logging::Log::itable< ::x10::util::logging::ConsoleLogger >  x10::util::logging::ConsoleLogger::_itable_0(&x10::util::logging::ConsoleLogger::debug, &x10::util::logging::ConsoleLogger::debug, &::x10::lang::X10Class::equals, &x10::util::logging::ConsoleLogger::error, &x10::util::logging::ConsoleLogger::error, &x10::util::logging::ConsoleLogger::fatal, &x10::util::logging::ConsoleLogger::fatal, &::x10::lang::X10Class::hashCode, &x10::util::logging::ConsoleLogger::info, &x10::util::logging::ConsoleLogger::info, &x10::util::logging::ConsoleLogger::isDebugEnabled, &x10::util::logging::ConsoleLogger::isErrorEnabled, &x10::util::logging::ConsoleLogger::isFatalEnabled, &x10::util::logging::ConsoleLogger::isInfoEnabled, &x10::util::logging::ConsoleLogger::isTraceEnabled, &x10::util::logging::ConsoleLogger::isWarnEnabled, &x10::util::logging::ConsoleLogger::toString, &x10::util::logging::ConsoleLogger::trace, &x10::util::logging::ConsoleLogger::trace, &::x10::lang::X10Class::typeName, &x10::util::logging::ConsoleLogger::warn, &x10::util::logging::ConsoleLogger::warn);
::x10::lang::Any::itable< ::x10::util::logging::ConsoleLogger >  x10::util::logging::ConsoleLogger::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::util::logging::ConsoleLogger::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::util::logging::ConsoleLogger::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::util::logging::Log>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::util::logging::ConsoleLogger")};

//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
x10_int x10::util::logging::ConsoleLogger::FMGL(DEFAULT_LEVEL);
void x10::util::logging::ConsoleLogger::FMGL(DEFAULT_LEVEL__do_init)() {
    FMGL(DEFAULT_LEVEL__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::logging::ConsoleLogger.DEFAULT_LEVEL");
    x10_int __var2722__ = ::x10::util::logging::ConsoleLogger::getDefaultLevel();
    FMGL(DEFAULT_LEVEL) = __var2722__;
    FMGL(DEFAULT_LEVEL__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::logging::ConsoleLogger::FMGL(DEFAULT_LEVEL__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(DEFAULT_LEVEL__status), &FMGL(DEFAULT_LEVEL__do_init), &FMGL(DEFAULT_LEVEL__exception), "x10::util::logging::ConsoleLogger.DEFAULT_LEVEL");
    
}
volatile ::x10aux::StaticInitController::status x10::util::logging::ConsoleLogger::FMGL(DEFAULT_LEVEL__status);
::x10::lang::CheckedThrowable* x10::util::logging::ConsoleLogger::FMGL(DEFAULT_LEVEL__exception);

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
::x10::lang::String* x10::util::logging::ConsoleLogger::FMGL(DEFAULT_LEVEL_ENV);
void x10::util::logging::ConsoleLogger::FMGL(DEFAULT_LEVEL_ENV__do_init)() {
    FMGL(DEFAULT_LEVEL_ENV__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::logging::ConsoleLogger.DEFAULT_LEVEL_ENV");
    ::x10::lang::String* __var2723__ = (__extension__ ({ static ::x10::lang::String* strLit__129622 = ::x10aux::makeStringLit("X10_LOG_LEVEL"); strLit__129622; }));
    FMGL(DEFAULT_LEVEL_ENV) = __var2723__;
    FMGL(DEFAULT_LEVEL_ENV__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::logging::ConsoleLogger::FMGL(DEFAULT_LEVEL_ENV__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(DEFAULT_LEVEL_ENV__status), &FMGL(DEFAULT_LEVEL_ENV__do_init), &FMGL(DEFAULT_LEVEL_ENV__exception), "x10::util::logging::ConsoleLogger.DEFAULT_LEVEL_ENV");
    
}
volatile ::x10aux::StaticInitController::status x10::util::logging::ConsoleLogger::FMGL(DEFAULT_LEVEL_ENV__status);
::x10::lang::CheckedThrowable* x10::util::logging::ConsoleLogger::FMGL(DEFAULT_LEVEL_ENV__exception);

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
x10_int x10::util::logging::ConsoleLogger::FMGL(LEVEL_ALL);
void x10::util::logging::ConsoleLogger::FMGL(LEVEL_ALL__do_init)() {
    FMGL(LEVEL_ALL__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::logging::ConsoleLogger.LEVEL_ALL");
    x10_int __var2724__ = ((x10_int)7);
    FMGL(LEVEL_ALL) = __var2724__;
    FMGL(LEVEL_ALL__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::logging::ConsoleLogger::FMGL(LEVEL_ALL__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(LEVEL_ALL__status), &FMGL(LEVEL_ALL__do_init), &FMGL(LEVEL_ALL__exception), "x10::util::logging::ConsoleLogger.LEVEL_ALL");
    
}
volatile ::x10aux::StaticInitController::status x10::util::logging::ConsoleLogger::FMGL(LEVEL_ALL__status);
::x10::lang::CheckedThrowable* x10::util::logging::ConsoleLogger::FMGL(LEVEL_ALL__exception);

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
x10_int x10::util::logging::ConsoleLogger::FMGL(LEVEL_TRACE);
void x10::util::logging::ConsoleLogger::FMGL(LEVEL_TRACE__do_init)() {
    FMGL(LEVEL_TRACE__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::logging::ConsoleLogger.LEVEL_TRACE");
    x10_int __var2725__ = ((x10_int)6);
    FMGL(LEVEL_TRACE) = __var2725__;
    FMGL(LEVEL_TRACE__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::logging::ConsoleLogger::FMGL(LEVEL_TRACE__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(LEVEL_TRACE__status), &FMGL(LEVEL_TRACE__do_init), &FMGL(LEVEL_TRACE__exception), "x10::util::logging::ConsoleLogger.LEVEL_TRACE");
    
}
volatile ::x10aux::StaticInitController::status x10::util::logging::ConsoleLogger::FMGL(LEVEL_TRACE__status);
::x10::lang::CheckedThrowable* x10::util::logging::ConsoleLogger::FMGL(LEVEL_TRACE__exception);

//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
x10_int x10::util::logging::ConsoleLogger::FMGL(LEVEL_DEBUG);
void x10::util::logging::ConsoleLogger::FMGL(LEVEL_DEBUG__do_init)() {
    FMGL(LEVEL_DEBUG__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::logging::ConsoleLogger.LEVEL_DEBUG");
    x10_int __var2726__ = ((x10_int)5);
    FMGL(LEVEL_DEBUG) = __var2726__;
    FMGL(LEVEL_DEBUG__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::logging::ConsoleLogger::FMGL(LEVEL_DEBUG__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(LEVEL_DEBUG__status), &FMGL(LEVEL_DEBUG__do_init), &FMGL(LEVEL_DEBUG__exception), "x10::util::logging::ConsoleLogger.LEVEL_DEBUG");
    
}
volatile ::x10aux::StaticInitController::status x10::util::logging::ConsoleLogger::FMGL(LEVEL_DEBUG__status);
::x10::lang::CheckedThrowable* x10::util::logging::ConsoleLogger::FMGL(LEVEL_DEBUG__exception);

//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
x10_int x10::util::logging::ConsoleLogger::FMGL(LEVEL_INFO);
void x10::util::logging::ConsoleLogger::FMGL(LEVEL_INFO__do_init)() {
    FMGL(LEVEL_INFO__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::logging::ConsoleLogger.LEVEL_INFO");
    x10_int __var2727__ = ((x10_int)4);
    FMGL(LEVEL_INFO) = __var2727__;
    FMGL(LEVEL_INFO__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::logging::ConsoleLogger::FMGL(LEVEL_INFO__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(LEVEL_INFO__status), &FMGL(LEVEL_INFO__do_init), &FMGL(LEVEL_INFO__exception), "x10::util::logging::ConsoleLogger.LEVEL_INFO");
    
}
volatile ::x10aux::StaticInitController::status x10::util::logging::ConsoleLogger::FMGL(LEVEL_INFO__status);
::x10::lang::CheckedThrowable* x10::util::logging::ConsoleLogger::FMGL(LEVEL_INFO__exception);

//#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
x10_int x10::util::logging::ConsoleLogger::FMGL(LEVEL_WARN);
void x10::util::logging::ConsoleLogger::FMGL(LEVEL_WARN__do_init)() {
    FMGL(LEVEL_WARN__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::logging::ConsoleLogger.LEVEL_WARN");
    x10_int __var2728__ = ((x10_int)3);
    FMGL(LEVEL_WARN) = __var2728__;
    FMGL(LEVEL_WARN__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::logging::ConsoleLogger::FMGL(LEVEL_WARN__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(LEVEL_WARN__status), &FMGL(LEVEL_WARN__do_init), &FMGL(LEVEL_WARN__exception), "x10::util::logging::ConsoleLogger.LEVEL_WARN");
    
}
volatile ::x10aux::StaticInitController::status x10::util::logging::ConsoleLogger::FMGL(LEVEL_WARN__status);
::x10::lang::CheckedThrowable* x10::util::logging::ConsoleLogger::FMGL(LEVEL_WARN__exception);

//#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
x10_int x10::util::logging::ConsoleLogger::FMGL(LEVEL_ERROR);
void x10::util::logging::ConsoleLogger::FMGL(LEVEL_ERROR__do_init)() {
    FMGL(LEVEL_ERROR__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::logging::ConsoleLogger.LEVEL_ERROR");
    x10_int __var2729__ = ((x10_int)2);
    FMGL(LEVEL_ERROR) = __var2729__;
    FMGL(LEVEL_ERROR__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::logging::ConsoleLogger::FMGL(LEVEL_ERROR__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(LEVEL_ERROR__status), &FMGL(LEVEL_ERROR__do_init), &FMGL(LEVEL_ERROR__exception), "x10::util::logging::ConsoleLogger.LEVEL_ERROR");
    
}
volatile ::x10aux::StaticInitController::status x10::util::logging::ConsoleLogger::FMGL(LEVEL_ERROR__status);
::x10::lang::CheckedThrowable* x10::util::logging::ConsoleLogger::FMGL(LEVEL_ERROR__exception);

//#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
x10_int x10::util::logging::ConsoleLogger::FMGL(LEVEL_FATAL);
void x10::util::logging::ConsoleLogger::FMGL(LEVEL_FATAL__do_init)() {
    FMGL(LEVEL_FATAL__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::logging::ConsoleLogger.LEVEL_FATAL");
    x10_int __var2730__ = ((x10_int)1);
    FMGL(LEVEL_FATAL) = __var2730__;
    FMGL(LEVEL_FATAL__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::logging::ConsoleLogger::FMGL(LEVEL_FATAL__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(LEVEL_FATAL__status), &FMGL(LEVEL_FATAL__do_init), &FMGL(LEVEL_FATAL__exception), "x10::util::logging::ConsoleLogger.LEVEL_FATAL");
    
}
volatile ::x10aux::StaticInitController::status x10::util::logging::ConsoleLogger::FMGL(LEVEL_FATAL__status);
::x10::lang::CheckedThrowable* x10::util::logging::ConsoleLogger::FMGL(LEVEL_FATAL__exception);

//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
x10_int x10::util::logging::ConsoleLogger::FMGL(LEVEL_NONE);
void x10::util::logging::ConsoleLogger::FMGL(LEVEL_NONE__do_init)() {
    FMGL(LEVEL_NONE__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::logging::ConsoleLogger.LEVEL_NONE");
    x10_int __var2731__ = ((x10_int)0);
    FMGL(LEVEL_NONE) = __var2731__;
    FMGL(LEVEL_NONE__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::logging::ConsoleLogger::FMGL(LEVEL_NONE__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(LEVEL_NONE__status), &FMGL(LEVEL_NONE__do_init), &FMGL(LEVEL_NONE__exception), "x10::util::logging::ConsoleLogger.LEVEL_NONE");
    
}
volatile ::x10aux::StaticInitController::status x10::util::logging::ConsoleLogger::FMGL(LEVEL_NONE__status);
::x10::lang::CheckedThrowable* x10::util::logging::ConsoleLogger::FMGL(LEVEL_NONE__exception);

//#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
::x10::lang::Rail< ::x10::lang::String* >* x10::util::logging::ConsoleLogger::FMGL(LEVEL_STRINGS);
void x10::util::logging::ConsoleLogger::FMGL(LEVEL_STRINGS__do_init)() {
    FMGL(LEVEL_STRINGS__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::logging::ConsoleLogger.LEVEL_STRINGS");
    ::x10::lang::Rail< ::x10::lang::String* >* __var2732__ = (__extension__ ({
        ::x10::lang::Rail< ::x10::lang::String* >* t__129477 = ::x10::lang::Rail< ::x10::lang::String* >::_makeUnsafe(((x10_long)8ll), false);
        t__129477->x10::lang::Rail< ::x10::lang::String* >::__set(((x10_long)0ll),
                                                                  (__extension__ ({ static ::x10::lang::String* strLit__129623 = ::x10aux::makeStringLit("NONE"); strLit__129623; })));
        t__129477->x10::lang::Rail< ::x10::lang::String* >::__set(
          ((x10_long)1ll), (__extension__ ({ static ::x10::lang::String* strLit__129624 = ::x10aux::makeStringLit("FATAL"); strLit__129624; })));
        t__129477->x10::lang::Rail< ::x10::lang::String* >::__set(
          ((x10_long)2ll), (__extension__ ({ static ::x10::lang::String* strLit__129625 = ::x10aux::makeStringLit("ERROR"); strLit__129625; })));
        t__129477->x10::lang::Rail< ::x10::lang::String* >::__set(
          ((x10_long)3ll), (__extension__ ({ static ::x10::lang::String* strLit__129626 = ::x10aux::makeStringLit("WARN"); strLit__129626; })));
        t__129477->x10::lang::Rail< ::x10::lang::String* >::__set(
          ((x10_long)4ll), (__extension__ ({ static ::x10::lang::String* strLit__129627 = ::x10aux::makeStringLit("INFO"); strLit__129627; })));
        t__129477->x10::lang::Rail< ::x10::lang::String* >::__set(
          ((x10_long)5ll), (__extension__ ({ static ::x10::lang::String* strLit__129628 = ::x10aux::makeStringLit("DEBUG"); strLit__129628; })));
        t__129477->x10::lang::Rail< ::x10::lang::String* >::__set(
          ((x10_long)6ll), (__extension__ ({ static ::x10::lang::String* strLit__129629 = ::x10aux::makeStringLit("TRACE"); strLit__129629; })));
        t__129477->x10::lang::Rail< ::x10::lang::String* >::__set(
          ((x10_long)7ll), (__extension__ ({ static ::x10::lang::String* strLit__129630 = ::x10aux::makeStringLit("ALL"); strLit__129630; })));
        t__129477;
    }))
    ;
    FMGL(LEVEL_STRINGS) = __var2732__;
    FMGL(LEVEL_STRINGS__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::logging::ConsoleLogger::FMGL(LEVEL_STRINGS__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(LEVEL_STRINGS__status), &FMGL(LEVEL_STRINGS__do_init), &FMGL(LEVEL_STRINGS__exception), "x10::util::logging::ConsoleLogger.LEVEL_STRINGS");
    
}
volatile ::x10aux::StaticInitController::status x10::util::logging::ConsoleLogger::FMGL(LEVEL_STRINGS__status);
::x10::lang::CheckedThrowable* x10::util::logging::ConsoleLogger::FMGL(LEVEL_STRINGS__exception);

//#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
x10_int x10::util::logging::ConsoleLogger::getDefaultLevel() {
    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    ::x10::lang::String* v = ::x10::lang::System::getenv(::x10::util::logging::ConsoleLogger::FMGL(DEFAULT_LEVEL_ENV__get)());
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    if ((::x10aux::struct_equals(v, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
        return ::x10::util::logging::ConsoleLogger::FMGL(LEVEL_INFO__get)();
        
    }
    
    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    ::x10::lang::String* prefix = (__extension__ ({ static ::x10::lang::String* strLit__129631 = ::x10aux::makeStringLit("LEVEL_"); strLit__129631; }));
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    x10_int prefixLength = prefix->x10::lang::String::length();
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    if ((((::x10aux::nullCheck(v)->x10::lang::String::length()) > (prefixLength)) &&
        prefix->x10::lang::String::equalsIgnoreCase(::x10aux::nullCheck(v)->x10::lang::String::substring(
                                                      ((x10_int)0),
                                                      prefixLength))))
    {
        
        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
        v = ::x10aux::nullCheck(v)->x10::lang::String::substring(
              prefixLength);
    }
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    ::x10::io::Console::FMGL(ERR__get)()->x10::io::Printer::println(
      reinterpret_cast< ::x10::lang::Any*>(v));
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    ::x10::lang::Rail< ::x10::lang::String* >* rail__117955 =
      ::x10::util::logging::ConsoleLogger::FMGL(LEVEL_STRINGS__get)();
    x10_long i__117937max__117956 = (x10_long)(::x10aux::nullCheck(rail__117955)->FMGL(size));
    {
        x10_long i__117957;
        for (i__117957 = ((x10_long)0ll); ((i__117957) < (i__117937max__117956));
             i__117957 = ((i__117957) + (((x10_long)1ll))))
        {
            x10_long i__117958 = i__117957;
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
            if (::x10aux::nullCheck(::x10aux::nullCheck(::x10::util::logging::ConsoleLogger::FMGL(LEVEL_STRINGS__get)())->x10::lang::Rail< ::x10::lang::String* >::__apply(
                                      i__117958))->x10::lang::String::equalsIgnoreCase(
                  v)) {
                
                //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
                return ((x10_int) (i__117958));
                
            }
            
        }
    }
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    return ::x10::util::logging::ConsoleLogger::FMGL(LEVEL_INFO__get)();
    
}

//#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
::x10::lang::String* x10::util::logging::ConsoleLogger::logLevelString(
  x10_int logLevel) {
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    return ::x10aux::nullCheck(::x10::util::logging::ConsoleLogger::FMGL(LEVEL_STRINGS__get)())->x10::lang::Rail< ::x10::lang::String* >::__apply(
             ((x10_long)(logLevel)));
    
}

//#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
::x10::lang::String* x10::util::logging::ConsoleLogger::getLastPartOfDotName(
  ::x10::lang::String* name) {
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    x10_int index = ::x10aux::nullCheck(name)->x10::lang::String::lastIndexOf(
                      (__extension__ ({ static ::x10::lang::String* strLit__129634 = ::x10aux::makeStringLit("."); strLit__129634; })));
    
    //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    if ((::x10aux::struct_equals(index, ((x10_int)-1)))) {
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
        return name;
        
    } else 
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    if (((index) >= (((::x10aux::nullCheck(name)->x10::lang::String::length()) - (((x10_int)1))))))
    {
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
        return name;
        
    } else {
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
        return ::x10aux::nullCheck(name)->x10::lang::String::substring(
                 ((index) + (((x10_int)1))));
        
    }
    
}

//#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
void x10::util::logging::ConsoleLogger::_constructor(::x10::lang::String* name) {
    
    //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    (this)->::x10::util::logging::ConsoleLogger::_constructor(
      name, ::x10::util::logging::ConsoleLogger::FMGL(DEFAULT_LEVEL__get)());
    
}
::x10::util::logging::ConsoleLogger* x10::util::logging::ConsoleLogger::_make(
  ::x10::lang::String* name) {
    ::x10::util::logging::ConsoleLogger* this_ = new (::x10aux::alloc_z< ::x10::util::logging::ConsoleLogger>()) ::x10::util::logging::ConsoleLogger();
    this_->_constructor(name);
    return this_;
}



//#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
void x10::util::logging::ConsoleLogger::_constructor(::x10::lang::String* name,
                                                     x10_int logLevel) {
    
    //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    (this)->::x10::util::logging::ConsoleLogger::_constructor(
      name, logLevel, ::x10::util::logging::ConsoleLogger::getLastPartOfDotName(
                        name));
    
}
::x10::util::logging::ConsoleLogger* x10::util::logging::ConsoleLogger::_make(
  ::x10::lang::String* name, x10_int logLevel) {
    ::x10::util::logging::ConsoleLogger* this_ = new (::x10aux::alloc_z< ::x10::util::logging::ConsoleLogger>()) ::x10::util::logging::ConsoleLogger();
    this_->_constructor(name, logLevel);
    return this_;
}



//#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
void x10::util::logging::ConsoleLogger::_constructor(::x10::lang::String* name,
                                                     x10_int logLevel,
                                                     ::x10::lang::String* outputName) {
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    this->x10::util::logging::ConsoleLogger::__fieldInitializers_x10_util_logging_ConsoleLogger();
    
    //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    this->FMGL(name) = name;
    
    //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    this->FMGL(logLevel) = logLevel;
    
    //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    this->FMGL(outputName) = outputName;
}
::x10::util::logging::ConsoleLogger* x10::util::logging::ConsoleLogger::_make(
  ::x10::lang::String* name, x10_int logLevel, ::x10::lang::String* outputName)
{
    ::x10::util::logging::ConsoleLogger* this_ = new (::x10aux::alloc_z< ::x10::util::logging::ConsoleLogger>()) ::x10::util::logging::ConsoleLogger();
    this_->_constructor(name, logLevel, outputName);
    return this_;
}



//#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
x10_boolean x10::util::logging::ConsoleLogger::isTraceEnabled(
  ) {
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    return ((::x10::util::logging::ConsoleLogger::FMGL(LEVEL_TRACE__get)()) <= (this->FMGL(logLevel)));
    
}

//#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
x10_boolean x10::util::logging::ConsoleLogger::isDebugEnabled(
  ) {
    
    //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    return ((::x10::util::logging::ConsoleLogger::FMGL(LEVEL_DEBUG__get)()) <= (this->FMGL(logLevel)));
    
}

//#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
x10_boolean x10::util::logging::ConsoleLogger::isInfoEnabled(
  ) {
    
    //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    return ((::x10::util::logging::ConsoleLogger::FMGL(LEVEL_INFO__get)()) <= (this->FMGL(logLevel)));
    
}

//#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
x10_boolean x10::util::logging::ConsoleLogger::isWarnEnabled(
  ) {
    
    //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    return ((::x10::util::logging::ConsoleLogger::FMGL(LEVEL_WARN__get)()) <= (this->FMGL(logLevel)));
    
}

//#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
x10_boolean x10::util::logging::ConsoleLogger::isErrorEnabled(
  ) {
    
    //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    return ((::x10::util::logging::ConsoleLogger::FMGL(LEVEL_ERROR__get)()) <= (this->FMGL(logLevel)));
    
}

//#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
x10_boolean x10::util::logging::ConsoleLogger::isFatalEnabled(
  ) {
    
    //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    return ((::x10::util::logging::ConsoleLogger::FMGL(LEVEL_FATAL__get)()) <= (this->FMGL(logLevel)));
    
}

//#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
void x10::util::logging::ConsoleLogger::trace(::x10::lang::Any* message) {
    
    //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    this->log(::x10::util::logging::ConsoleLogger::FMGL(LEVEL_TRACE__get)(),
              message);
}

//#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
void x10::util::logging::ConsoleLogger::trace(::x10::lang::Any* message,
                                              ::x10::lang::CheckedThrowable* t) {
    
    //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    this->log(::x10::util::logging::ConsoleLogger::FMGL(LEVEL_TRACE__get)(),
              message, t);
}

//#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
void x10::util::logging::ConsoleLogger::debug(::x10::lang::Any* message) {
    
    //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    this->log(::x10::util::logging::ConsoleLogger::FMGL(LEVEL_DEBUG__get)(),
              message);
}

//#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
void x10::util::logging::ConsoleLogger::debug(::x10::lang::Any* message,
                                              ::x10::lang::CheckedThrowable* t) {
    
    //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    this->log(::x10::util::logging::ConsoleLogger::FMGL(LEVEL_DEBUG__get)(),
              message, t);
}

//#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
void x10::util::logging::ConsoleLogger::info(::x10::lang::Any* message) {
    
    //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    this->log(::x10::util::logging::ConsoleLogger::FMGL(LEVEL_INFO__get)(),
              message);
}

//#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
void x10::util::logging::ConsoleLogger::info(::x10::lang::Any* message,
                                             ::x10::lang::CheckedThrowable* t) {
    
    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    this->log(::x10::util::logging::ConsoleLogger::FMGL(LEVEL_INFO__get)(),
              message, t);
}

//#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
void x10::util::logging::ConsoleLogger::warn(::x10::lang::Any* message) {
    
    //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    this->log(::x10::util::logging::ConsoleLogger::FMGL(LEVEL_WARN__get)(),
              message);
}

//#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
void x10::util::logging::ConsoleLogger::warn(::x10::lang::Any* message,
                                             ::x10::lang::CheckedThrowable* t) {
    
    //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    this->log(::x10::util::logging::ConsoleLogger::FMGL(LEVEL_WARN__get)(),
              message, t);
}

//#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
void x10::util::logging::ConsoleLogger::error(::x10::lang::Any* message) {
    
    //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    this->log(::x10::util::logging::ConsoleLogger::FMGL(LEVEL_ERROR__get)(),
              message);
}

//#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
void x10::util::logging::ConsoleLogger::error(::x10::lang::Any* message,
                                              ::x10::lang::CheckedThrowable* t) {
    
    //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    this->log(::x10::util::logging::ConsoleLogger::FMGL(LEVEL_ERROR__get)(),
              message, t);
}

//#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
void x10::util::logging::ConsoleLogger::fatal(::x10::lang::Any* message) {
    
    //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    this->log(::x10::util::logging::ConsoleLogger::FMGL(LEVEL_FATAL__get)(),
              message);
}

//#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
void x10::util::logging::ConsoleLogger::fatal(::x10::lang::Any* message,
                                              ::x10::lang::CheckedThrowable* t) {
    
    //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    this->log(::x10::util::logging::ConsoleLogger::FMGL(LEVEL_FATAL__get)(),
              message, t);
}

//#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
::x10::lang::String* x10::util::logging::ConsoleLogger::toString(
  ) {
    
    //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    return ::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129635 = ::x10aux::makeStringLit("ConsoleLog<"); strLit__129635; })), this->FMGL(name)), (__extension__ ({ static ::x10::lang::String* strLit__129636 = ::x10aux::makeStringLit("@"); strLit__129636; }))), ::x10::util::logging::ConsoleLogger::logLevelString(
                                                                                                                                                                                                                                                                                                                                                                                               this->FMGL(logLevel))), (__extension__ ({ static ::x10::lang::String* strLit__129637 = ::x10aux::makeStringLit(">"); strLit__129637; })));
    
}

//#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"

//#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"

//#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"

//#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
void x10::util::logging::ConsoleLogger::setLogLevel(x10_int newLevel) {
    
    //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    if (((newLevel) < (::x10::util::logging::ConsoleLogger::FMGL(LEVEL_NONE__get)())))
    {
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
        this->FMGL(logLevel) = ::x10::util::logging::ConsoleLogger::FMGL(LEVEL_NONE__get)();
    } else 
    //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    if (((newLevel) > (::x10::util::logging::ConsoleLogger::FMGL(LEVEL_ALL__get)())))
    {
        
        //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
        this->FMGL(logLevel) = ::x10::util::logging::ConsoleLogger::FMGL(LEVEL_ALL__get)();
    } else {
        
        //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
        this->FMGL(logLevel) = newLevel;
    }
    
}

//#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
x10_boolean x10::util::logging::ConsoleLogger::isLogEnabled(
  x10_int level) {
    
    //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    return ((level) <= (this->FMGL(logLevel)));
    
}

//#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
void x10::util::logging::ConsoleLogger::log(x10_int level,
                                            ::x10::lang::Any* message) {
    
    //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    if (!(this->isLogEnabled(level))) {
        
        //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
        return;
    }
    
    //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    ::x10::util::StringBuilder* sb =  (new (::x10aux::alloc_z< ::x10::util::StringBuilder>()) ::x10::util::StringBuilder());
    (sb)->::x10::util::StringBuilder::_constructor();
    
    //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    sb->add(::x10::util::logging::ConsoleLogger::logLevelString(
              level));
    
    //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    sb->add((__extension__ ({ static ::x10::lang::String* strLit__129640 = ::x10aux::makeStringLit(" "); strLit__129640; })));
    
    //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    sb->add(this->FMGL(outputName));
    
    //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    sb->add((__extension__ ({ static ::x10::lang::String* strLit__129643 = ::x10aux::makeStringLit(": "); strLit__129643; })));
    
    //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    reinterpret_cast< ::x10::util::StringBuilder*>(sb->add(
                                                     message));
    
    //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    ::x10::io::Console::FMGL(ERR__get)()->x10::io::Printer::println(
      reinterpret_cast< ::x10::lang::Any*>(sb->result()));
}

//#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
void x10::util::logging::ConsoleLogger::log(x10_int level,
                                            ::x10::lang::Any* message,
                                            ::x10::lang::CheckedThrowable* t) {
    
    //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    if (!(this->isLogEnabled(level))) {
        
        //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
        return;
    }
    
    //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    if ((::x10aux::struct_equals(t, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
        this->log(level, message);
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
        return;
    }
    
    //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    ::x10::util::StringBuilder* sb =  (new (::x10aux::alloc_z< ::x10::util::StringBuilder>()) ::x10::util::StringBuilder());
    (sb)->::x10::util::StringBuilder::_constructor();
    
    //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    sb->add(::x10::util::logging::ConsoleLogger::logLevelString(
              level));
    
    //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    sb->add((__extension__ ({ static ::x10::lang::String* strLit__129647 = ::x10aux::makeStringLit(" "); strLit__129647; })));
    
    //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    sb->add(this->FMGL(outputName));
    
    //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    sb->add((__extension__ ({ static ::x10::lang::String* strLit__129650 = ::x10aux::makeStringLit(": "); strLit__129650; })));
    
    //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    reinterpret_cast< ::x10::util::StringBuilder*>(sb->add(
                                                     message));
    
    //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    sb->add((__extension__ ({ static ::x10::lang::String* strLit__129653 = ::x10aux::makeStringLit(", cause: "); strLit__129653; })));
    
    //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    reinterpret_cast< ::x10::util::StringBuilder*>(sb->add(
                                                     reinterpret_cast< ::x10::lang::Any*>(::x10aux::nullCheck(t)->x10::lang::CheckedThrowable::getCause())));
    
    //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    ::x10::io::Console::FMGL(ERR__get)()->x10::io::Printer::println(
      reinterpret_cast< ::x10::lang::Any*>(sb->result()));
    
    //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
    ::x10aux::nullCheck(t)->printStackTrace();
}

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/logging/ConsoleLogger.x10"
::x10::util::logging::ConsoleLogger* x10::util::logging::ConsoleLogger::x10__util__logging__ConsoleLogger____this__x10__util__logging__ConsoleLogger(
  ) {
    return this;
    
}
void x10::util::logging::ConsoleLogger::__fieldInitializers_x10_util_logging_ConsoleLogger(
  ) {
    this->FMGL(logLevel) = ((x10_int)0);
}
const ::x10aux::serialization_id_t x10::util::logging::ConsoleLogger::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::logging::ConsoleLogger::_deserializer);

void x10::util::logging::ConsoleLogger::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(name));
    buf.write(this->FMGL(outputName));
    buf.write(this->FMGL(logLevel));
    
}

::x10::lang::Reference* ::x10::util::logging::ConsoleLogger::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::logging::ConsoleLogger* this_ = new (::x10aux::alloc_z< ::x10::util::logging::ConsoleLogger>()) ::x10::util::logging::ConsoleLogger();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::util::logging::ConsoleLogger::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(name) = buf.read< ::x10::lang::String*>();
    FMGL(outputName) = buf.read< ::x10::lang::String*>();
    FMGL(logLevel) = buf.read<x10_int>();
}

::x10aux::RuntimeType x10::util::logging::ConsoleLogger::rtt;
void x10::util::logging::ConsoleLogger::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::util::logging::Log>()};
    rtt.initStageTwo("x10.util.logging.ConsoleLogger",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of ConsoleLogger */
/*************************************************/
