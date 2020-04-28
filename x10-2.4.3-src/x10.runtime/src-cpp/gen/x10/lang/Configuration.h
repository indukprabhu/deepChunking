#ifndef __X10_LANG_CONFIGURATION_H
#define __X10_LANG_CONFIGURATION_H

#include <x10rt.h>


namespace x10 { namespace compiler { 
class Native;
} } 
namespace x10 { namespace util { 
template<class TPMGL(K), class TPMGL(V)> class HashMap;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace lang { 
class NumberFormatException;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 

class Configuration : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    static x10_int FMGL(AVAILABLE_PROCESSORS);
    static void FMGL(AVAILABLE_PROCESSORS__do_init)();
    static void FMGL(AVAILABLE_PROCESSORS__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(AVAILABLE_PROCESSORS__status);
    static ::x10::lang::CheckedThrowable* FMGL(AVAILABLE_PROCESSORS__exception);
    static x10_int FMGL(AVAILABLE_PROCESSORS__get)();
    
    static x10_boolean envOrElse(::x10::lang::String* s, x10_boolean b);
    static x10_boolean strict_finish();
    static x10_boolean static_threads();
    static x10_boolean warn_on_thread_creation();
    static x10_boolean busy_waiting();
    static x10_int nthreads();
    static x10_double deltaCustom();
    static x10_int max_threads();
    static x10_int FMGL(RESILIENT_MODE_NONE);
    static void FMGL(RESILIENT_MODE_NONE__do_init)();
    static void FMGL(RESILIENT_MODE_NONE__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(RESILIENT_MODE_NONE__status);
    static ::x10::lang::CheckedThrowable* FMGL(RESILIENT_MODE_NONE__exception);
    static x10_int FMGL(RESILIENT_MODE_NONE__get)();
    
    static x10_int FMGL(RESILIENT_MODE_PLACE_ZERO);
    static void FMGL(RESILIENT_MODE_PLACE_ZERO__do_init)();
    static void FMGL(RESILIENT_MODE_PLACE_ZERO__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(RESILIENT_MODE_PLACE_ZERO__status);
    static ::x10::lang::CheckedThrowable* FMGL(RESILIENT_MODE_PLACE_ZERO__exception);
    static x10_int FMGL(RESILIENT_MODE_PLACE_ZERO__get)();
    
    static x10_int FMGL(RESILIENT_MODE_DISTRIBUTED);
    static void FMGL(RESILIENT_MODE_DISTRIBUTED__do_init)();
    static void FMGL(RESILIENT_MODE_DISTRIBUTED__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(RESILIENT_MODE_DISTRIBUTED__status);
    static ::x10::lang::CheckedThrowable* FMGL(RESILIENT_MODE_DISTRIBUTED__exception);
    static x10_int FMGL(RESILIENT_MODE_DISTRIBUTED__get)();
    
    static x10_int FMGL(RESILIENT_MODE_ZOO_KEEPER);
    static void FMGL(RESILIENT_MODE_ZOO_KEEPER__do_init)();
    static void FMGL(RESILIENT_MODE_ZOO_KEEPER__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(RESILIENT_MODE_ZOO_KEEPER__status);
    static ::x10::lang::CheckedThrowable* FMGL(RESILIENT_MODE_ZOO_KEEPER__exception);
    static x10_int FMGL(RESILIENT_MODE_ZOO_KEEPER__get)();
    
    static x10_int FMGL(RESILIENT_MODE_SAMPLE);
    static void FMGL(RESILIENT_MODE_SAMPLE__do_init)();
    static void FMGL(RESILIENT_MODE_SAMPLE__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(RESILIENT_MODE_SAMPLE__status);
    static ::x10::lang::CheckedThrowable* FMGL(RESILIENT_MODE_SAMPLE__exception);
    static x10_int FMGL(RESILIENT_MODE_SAMPLE__get)();
    
    static x10_int FMGL(RESILIENT_MODE_PLACE0);
    static void FMGL(RESILIENT_MODE_PLACE0__do_init)();
    static void FMGL(RESILIENT_MODE_PLACE0__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(RESILIENT_MODE_PLACE0__status);
    static ::x10::lang::CheckedThrowable* FMGL(RESILIENT_MODE_PLACE0__exception);
    static x10_int FMGL(RESILIENT_MODE_PLACE0__get)();
    
    static x10_int resilient_mode();
    virtual ::x10::lang::Configuration* x10__lang__Configuration____this__x10__lang__Configuration(
      );
    void _constructor();
    
    static ::x10::lang::Configuration* _make();
    
    virtual void __fieldInitializers_x10_lang_Configuration();
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};


} } 
#endif // X10_LANG_CONFIGURATION_H

namespace x10 { namespace lang { 
class Configuration;
} } 

#ifndef X10_LANG_CONFIGURATION_H_NODEPS
#define X10_LANG_CONFIGURATION_H_NODEPS
#include <x10/lang/Int.h>
#include <x10/compiler/Native.h>
#include <x10/lang/Boolean.h>
#include <x10/util/HashMap.h>
#include <x10/lang/String.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/NumberFormatException.h>
#include <x10/lang/Long.h>
#include <x10/lang/Double.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_CONFIGURATION_H_GENERICS
#define X10_LANG_CONFIGURATION_H_GENERICS
inline x10_int x10::lang::Configuration::FMGL(AVAILABLE_PROCESSORS__get)() {
    if (FMGL(AVAILABLE_PROCESSORS__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(AVAILABLE_PROCESSORS__init)();
    }
    return x10::lang::Configuration::FMGL(AVAILABLE_PROCESSORS);
}

inline x10_int x10::lang::Configuration::FMGL(RESILIENT_MODE_NONE__get)() {
    if (FMGL(RESILIENT_MODE_NONE__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(RESILIENT_MODE_NONE__init)();
    }
    return x10::lang::Configuration::FMGL(RESILIENT_MODE_NONE);
}

inline x10_int x10::lang::Configuration::FMGL(RESILIENT_MODE_PLACE_ZERO__get)() {
    if (FMGL(RESILIENT_MODE_PLACE_ZERO__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(RESILIENT_MODE_PLACE_ZERO__init)();
    }
    return x10::lang::Configuration::FMGL(RESILIENT_MODE_PLACE_ZERO);
}

inline x10_int x10::lang::Configuration::FMGL(RESILIENT_MODE_DISTRIBUTED__get)() {
    if (FMGL(RESILIENT_MODE_DISTRIBUTED__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(RESILIENT_MODE_DISTRIBUTED__init)();
    }
    return x10::lang::Configuration::FMGL(RESILIENT_MODE_DISTRIBUTED);
}

inline x10_int x10::lang::Configuration::FMGL(RESILIENT_MODE_ZOO_KEEPER__get)() {
    if (FMGL(RESILIENT_MODE_ZOO_KEEPER__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(RESILIENT_MODE_ZOO_KEEPER__init)();
    }
    return x10::lang::Configuration::FMGL(RESILIENT_MODE_ZOO_KEEPER);
}

inline x10_int x10::lang::Configuration::FMGL(RESILIENT_MODE_SAMPLE__get)() {
    if (FMGL(RESILIENT_MODE_SAMPLE__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(RESILIENT_MODE_SAMPLE__init)();
    }
    return x10::lang::Configuration::FMGL(RESILIENT_MODE_SAMPLE);
}

inline x10_int x10::lang::Configuration::FMGL(RESILIENT_MODE_PLACE0__get)() {
    if (FMGL(RESILIENT_MODE_PLACE0__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(RESILIENT_MODE_PLACE0__init)();
    }
    return x10::lang::Configuration::FMGL(RESILIENT_MODE_PLACE0);
}

#endif // X10_LANG_CONFIGURATION_H_GENERICS
#endif // __X10_LANG_CONFIGURATION_H_NODEPS
