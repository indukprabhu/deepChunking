#ifndef __X10_UTIL_LOGGING_CONSOLELOGGER_H
#define __X10_UTIL_LOGGING_CONSOLELOGGER_H

#include <x10rt.h>


#define X10_UTIL_LOGGING_LOG_H_NODEPS
#include <x10/util/logging/Log.h>
#undef X10_UTIL_LOGGING_LOG_H_NODEPS
#define X10_LANG_INT_H_NODEPS
#include <x10/lang/Int.h>
#undef X10_LANG_INT_H_NODEPS
#define X10_LANG_INT_H_NODEPS
#include <x10/lang/Int.h>
#undef X10_LANG_INT_H_NODEPS
namespace x10 { namespace compiler { 
class Native;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace lang { 
class Unsafe;
} } 
namespace x10 { namespace lang { 
class System;
} } 
namespace x10 { namespace io { 
class Printer;
} } 
namespace x10 { namespace io { 
class Console;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace compiler { 
class Inline;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace util { 
class StringBuilder;
} } 
namespace x10 { namespace lang { 
class Exception;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace compiler { 
class NativeRep;
} } 
namespace x10 { namespace util { namespace logging { 

class ConsoleLogger : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    static ::x10aux::itable_entry _itables[3];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static ::x10::util::logging::Log::itable< ::x10::util::logging::ConsoleLogger > _itable_0;
    
    static ::x10::lang::Any::itable< ::x10::util::logging::ConsoleLogger > _itable_1;
    
    static x10_int FMGL(DEFAULT_LEVEL);
    static void FMGL(DEFAULT_LEVEL__do_init)();
    static void FMGL(DEFAULT_LEVEL__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(DEFAULT_LEVEL__status);
    static ::x10::lang::CheckedThrowable* FMGL(DEFAULT_LEVEL__exception);
    static x10_int FMGL(DEFAULT_LEVEL__get)();
    
    static ::x10::lang::String* FMGL(DEFAULT_LEVEL_ENV);
    static void FMGL(DEFAULT_LEVEL_ENV__do_init)();
    static void FMGL(DEFAULT_LEVEL_ENV__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(DEFAULT_LEVEL_ENV__status);
    static ::x10::lang::CheckedThrowable* FMGL(DEFAULT_LEVEL_ENV__exception);
    static ::x10::lang::String* FMGL(DEFAULT_LEVEL_ENV__get)();
    
    static x10_int FMGL(LEVEL_ALL);
    static void FMGL(LEVEL_ALL__do_init)();
    static void FMGL(LEVEL_ALL__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(LEVEL_ALL__status);
    static ::x10::lang::CheckedThrowable* FMGL(LEVEL_ALL__exception);
    static x10_int FMGL(LEVEL_ALL__get)();
    
    static x10_int FMGL(LEVEL_TRACE);
    static void FMGL(LEVEL_TRACE__do_init)();
    static void FMGL(LEVEL_TRACE__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(LEVEL_TRACE__status);
    static ::x10::lang::CheckedThrowable* FMGL(LEVEL_TRACE__exception);
    static x10_int FMGL(LEVEL_TRACE__get)();
    
    static x10_int FMGL(LEVEL_DEBUG);
    static void FMGL(LEVEL_DEBUG__do_init)();
    static void FMGL(LEVEL_DEBUG__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(LEVEL_DEBUG__status);
    static ::x10::lang::CheckedThrowable* FMGL(LEVEL_DEBUG__exception);
    static x10_int FMGL(LEVEL_DEBUG__get)();
    
    static x10_int FMGL(LEVEL_INFO);
    static void FMGL(LEVEL_INFO__do_init)();
    static void FMGL(LEVEL_INFO__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(LEVEL_INFO__status);
    static ::x10::lang::CheckedThrowable* FMGL(LEVEL_INFO__exception);
    static x10_int FMGL(LEVEL_INFO__get)();
    
    static x10_int FMGL(LEVEL_WARN);
    static void FMGL(LEVEL_WARN__do_init)();
    static void FMGL(LEVEL_WARN__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(LEVEL_WARN__status);
    static ::x10::lang::CheckedThrowable* FMGL(LEVEL_WARN__exception);
    static x10_int FMGL(LEVEL_WARN__get)();
    
    static x10_int FMGL(LEVEL_ERROR);
    static void FMGL(LEVEL_ERROR__do_init)();
    static void FMGL(LEVEL_ERROR__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(LEVEL_ERROR__status);
    static ::x10::lang::CheckedThrowable* FMGL(LEVEL_ERROR__exception);
    static x10_int FMGL(LEVEL_ERROR__get)();
    
    static x10_int FMGL(LEVEL_FATAL);
    static void FMGL(LEVEL_FATAL__do_init)();
    static void FMGL(LEVEL_FATAL__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(LEVEL_FATAL__status);
    static ::x10::lang::CheckedThrowable* FMGL(LEVEL_FATAL__exception);
    static x10_int FMGL(LEVEL_FATAL__get)();
    
    static x10_int FMGL(LEVEL_NONE);
    static void FMGL(LEVEL_NONE__do_init)();
    static void FMGL(LEVEL_NONE__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(LEVEL_NONE__status);
    static ::x10::lang::CheckedThrowable* FMGL(LEVEL_NONE__exception);
    static x10_int FMGL(LEVEL_NONE__get)();
    
    static ::x10::lang::Rail< ::x10::lang::String* >* FMGL(LEVEL_STRINGS);
    static void FMGL(LEVEL_STRINGS__do_init)();
    static void FMGL(LEVEL_STRINGS__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(LEVEL_STRINGS__status);
    static ::x10::lang::CheckedThrowable* FMGL(LEVEL_STRINGS__exception);
    static ::x10::lang::Rail< ::x10::lang::String* >* FMGL(LEVEL_STRINGS__get)();
    
    static x10_int getDefaultLevel();
    static ::x10::lang::String* logLevelString(x10_int logLevel);
    static ::x10::lang::String* getLastPartOfDotName(::x10::lang::String* name);
    void _constructor(::x10::lang::String* name);
    
    static ::x10::util::logging::ConsoleLogger* _make(::x10::lang::String* name);
    
    void _constructor(::x10::lang::String* name, x10_int logLevel);
    
    static ::x10::util::logging::ConsoleLogger* _make(::x10::lang::String* name,
                                                      x10_int logLevel);
    
    void _constructor(::x10::lang::String* name, x10_int logLevel, ::x10::lang::String* outputName);
    
    static ::x10::util::logging::ConsoleLogger* _make(::x10::lang::String* name,
                                                      x10_int logLevel, ::x10::lang::String* outputName);
    
    virtual x10_boolean isTraceEnabled();
    virtual x10_boolean isDebugEnabled();
    virtual x10_boolean isInfoEnabled();
    virtual x10_boolean isWarnEnabled();
    virtual x10_boolean isErrorEnabled();
    virtual x10_boolean isFatalEnabled();
    virtual void trace(::x10::lang::Any* message);
    virtual void trace(::x10::lang::Any* message, ::x10::lang::CheckedThrowable* t);
    virtual void debug(::x10::lang::Any* message);
    virtual void debug(::x10::lang::Any* message, ::x10::lang::CheckedThrowable* t);
    virtual void info(::x10::lang::Any* message);
    virtual void info(::x10::lang::Any* message, ::x10::lang::CheckedThrowable* t);
    virtual void warn(::x10::lang::Any* message);
    virtual void warn(::x10::lang::Any* message, ::x10::lang::CheckedThrowable* t);
    virtual void error(::x10::lang::Any* message);
    virtual void error(::x10::lang::Any* message, ::x10::lang::CheckedThrowable* t);
    virtual void fatal(::x10::lang::Any* message);
    virtual void fatal(::x10::lang::Any* message, ::x10::lang::CheckedThrowable* t);
    virtual ::x10::lang::String* toString();
    ::x10::lang::String* FMGL(name);
    
    ::x10::lang::String* FMGL(outputName);
    
    x10_int FMGL(logLevel);
    
    void setLogLevel(x10_int newLevel);
    x10_boolean isLogEnabled(x10_int level);
    void log(x10_int level, ::x10::lang::Any* message);
    void log(x10_int level, ::x10::lang::Any* message, ::x10::lang::CheckedThrowable* t);
    virtual ::x10::util::logging::ConsoleLogger* x10__util__logging__ConsoleLogger____this__x10__util__logging__ConsoleLogger(
      );
    virtual void __fieldInitializers_x10_util_logging_ConsoleLogger(
      );
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: virtual ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};


} } } 
#endif // X10_UTIL_LOGGING_CONSOLELOGGER_H

namespace x10 { namespace util { namespace logging { 
class ConsoleLogger;
} } } 

#ifndef X10_UTIL_LOGGING_CONSOLELOGGER_H_NODEPS
#define X10_UTIL_LOGGING_CONSOLELOGGER_H_NODEPS
#include <x10/util/logging/Log.h>
#include <x10/lang/Int.h>
#include <x10/compiler/Native.h>
#include <x10/lang/String.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Unsafe.h>
#include <x10/lang/System.h>
#include <x10/lang/Boolean.h>
#include <x10/io/Printer.h>
#include <x10/io/Console.h>
#include <x10/lang/Any.h>
#include <x10/lang/Long.h>
#include <x10/compiler/Inline.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/util/StringBuilder.h>
#include <x10/lang/Exception.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeRep.h>
#ifndef X10_UTIL_LOGGING_CONSOLELOGGER_H_GENERICS
#define X10_UTIL_LOGGING_CONSOLELOGGER_H_GENERICS
inline x10_int x10::util::logging::ConsoleLogger::FMGL(DEFAULT_LEVEL__get)() {
    if (FMGL(DEFAULT_LEVEL__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(DEFAULT_LEVEL__init)();
    }
    return x10::util::logging::ConsoleLogger::FMGL(DEFAULT_LEVEL);
}

inline ::x10::lang::String* x10::util::logging::ConsoleLogger::FMGL(DEFAULT_LEVEL_ENV__get)() {
    if (FMGL(DEFAULT_LEVEL_ENV__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(DEFAULT_LEVEL_ENV__init)();
    }
    return x10::util::logging::ConsoleLogger::FMGL(DEFAULT_LEVEL_ENV);
}

inline x10_int x10::util::logging::ConsoleLogger::FMGL(LEVEL_ALL__get)() {
    if (FMGL(LEVEL_ALL__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(LEVEL_ALL__init)();
    }
    return x10::util::logging::ConsoleLogger::FMGL(LEVEL_ALL);
}

inline x10_int x10::util::logging::ConsoleLogger::FMGL(LEVEL_TRACE__get)() {
    if (FMGL(LEVEL_TRACE__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(LEVEL_TRACE__init)();
    }
    return x10::util::logging::ConsoleLogger::FMGL(LEVEL_TRACE);
}

inline x10_int x10::util::logging::ConsoleLogger::FMGL(LEVEL_DEBUG__get)() {
    if (FMGL(LEVEL_DEBUG__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(LEVEL_DEBUG__init)();
    }
    return x10::util::logging::ConsoleLogger::FMGL(LEVEL_DEBUG);
}

inline x10_int x10::util::logging::ConsoleLogger::FMGL(LEVEL_INFO__get)() {
    if (FMGL(LEVEL_INFO__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(LEVEL_INFO__init)();
    }
    return x10::util::logging::ConsoleLogger::FMGL(LEVEL_INFO);
}

inline x10_int x10::util::logging::ConsoleLogger::FMGL(LEVEL_WARN__get)() {
    if (FMGL(LEVEL_WARN__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(LEVEL_WARN__init)();
    }
    return x10::util::logging::ConsoleLogger::FMGL(LEVEL_WARN);
}

inline x10_int x10::util::logging::ConsoleLogger::FMGL(LEVEL_ERROR__get)() {
    if (FMGL(LEVEL_ERROR__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(LEVEL_ERROR__init)();
    }
    return x10::util::logging::ConsoleLogger::FMGL(LEVEL_ERROR);
}

inline x10_int x10::util::logging::ConsoleLogger::FMGL(LEVEL_FATAL__get)() {
    if (FMGL(LEVEL_FATAL__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(LEVEL_FATAL__init)();
    }
    return x10::util::logging::ConsoleLogger::FMGL(LEVEL_FATAL);
}

inline x10_int x10::util::logging::ConsoleLogger::FMGL(LEVEL_NONE__get)() {
    if (FMGL(LEVEL_NONE__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(LEVEL_NONE__init)();
    }
    return x10::util::logging::ConsoleLogger::FMGL(LEVEL_NONE);
}

inline ::x10::lang::Rail< ::x10::lang::String* >* x10::util::logging::ConsoleLogger::FMGL(LEVEL_STRINGS__get)() {
    if (FMGL(LEVEL_STRINGS__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(LEVEL_STRINGS__init)();
    }
    return x10::util::logging::ConsoleLogger::FMGL(LEVEL_STRINGS);
}

#endif // X10_UTIL_LOGGING_CONSOLELOGGER_H_GENERICS
#endif // __X10_UTIL_LOGGING_CONSOLELOGGER_H_NODEPS
