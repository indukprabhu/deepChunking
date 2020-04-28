#ifndef __X10_LANG_ACTIVITY_H
#define __X10_LANG_ACTIVITY_H

#include <x10rt.h>


#define X10_LANG_BOOLEAN_H_NODEPS
#include <x10/lang/Boolean.h>
#undef X10_LANG_BOOLEAN_H_NODEPS
#define X10_LANG_BOOLEAN_H_NODEPS
#include <x10/lang/Boolean.h>
#undef X10_LANG_BOOLEAN_H_NODEPS
#define X10_LANG_INT_H_NODEPS
#include <x10/lang/Int.h>
#undef X10_LANG_INT_H_NODEPS
#define X10_LANG_INT_H_NODEPS
#include <x10/lang/Int.h>
#undef X10_LANG_INT_H_NODEPS
namespace x10 { namespace lang { 
class FinishState;
} } 
namespace x10 { namespace lang { 
class VoidFun_0_0;
} } 
namespace x10 { namespace lang { 
class Activity__ClockPhases;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
class IllegalOperationException;
} } 
namespace x10 { namespace lang { 
class Error;
} } 
namespace x10 { namespace lang { 
class Exception;
} } 
namespace x10 { namespace lang { 
class WrappedThrowable;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace lang { 
class Unsafe;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 

class Activity : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    static x10_boolean FMGL(DEALLOC_BODY);
    static void FMGL(DEALLOC_BODY__do_init)();
    static void FMGL(DEALLOC_BODY__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(DEALLOC_BODY__status);
    static ::x10::lang::CheckedThrowable* FMGL(DEALLOC_BODY__exception);
    static x10_boolean FMGL(DEALLOC_BODY__get)();
    
    static x10_boolean canDealloc();
    ::x10::lang::FinishState* FMGL(finishState);
    
    ::x10::lang::VoidFun_0_0* FMGL(body);
    
    ::x10::lang::Activity__ClockPhases* FMGL(clockPhases);
    
    x10_boolean FMGL(shouldNotifyTermination);
    
    x10_boolean FMGL(confirmed);
    
    x10_int FMGL(atomicDepth);
    
    void _constructor(::x10::lang::VoidFun_0_0* body, ::x10::lang::Place srcPlace,
                      ::x10::lang::FinishState* finishState);
    
    static ::x10::lang::Activity* _make(::x10::lang::VoidFun_0_0* body,
                                        ::x10::lang::Place srcPlace,
                                        ::x10::lang::FinishState* finishState);
    
    void _constructor(::x10::lang::VoidFun_0_0* body, ::x10::lang::Place srcPlace,
                      ::x10::lang::FinishState* finishState,
                      x10_boolean nac);
    
    static ::x10::lang::Activity* _make(::x10::lang::VoidFun_0_0* body,
                                        ::x10::lang::Place srcPlace,
                                        ::x10::lang::FinishState* finishState,
                                        x10_boolean nac);
    
    void _constructor(::x10::lang::VoidFun_0_0* body, ::x10::lang::Place srcPlace,
                      ::x10::lang::FinishState* finishState,
                      x10_boolean nac, x10_boolean nt);
    
    static ::x10::lang::Activity* _make(::x10::lang::VoidFun_0_0* body,
                                        ::x10::lang::Place srcPlace,
                                        ::x10::lang::FinishState* finishState,
                                        x10_boolean nac, x10_boolean nt);
    
    void _constructor(::x10::lang::VoidFun_0_0* body, ::x10::lang::Place srcPlace,
                      ::x10::lang::FinishState* finishState,
                      ::x10::lang::Activity__ClockPhases* clockPhases);
    
    static ::x10::lang::Activity* _make(::x10::lang::VoidFun_0_0* body,
                                        ::x10::lang::Place srcPlace,
                                        ::x10::lang::FinishState* finishState,
                                        ::x10::lang::Activity__ClockPhases* clockPhases);
    
    virtual ::x10::lang::Activity__ClockPhases* clockPhases(
      );
    virtual ::x10::lang::FinishState* finishState();
    virtual ::x10::lang::FinishState* swapFinish(::x10::lang::FinishState* f);
    virtual void pushAtomic();
    virtual void popAtomic();
    virtual void ensureNotInAtomic();
    virtual void run();
    virtual ::x10::lang::Activity* x10__lang__Activity____this__x10__lang__Activity(
      );
    virtual void __fieldInitializers_x10_lang_Activity();
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: virtual ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};


} } 
#endif // X10_LANG_ACTIVITY_H

namespace x10 { namespace lang { 
class Activity;
} } 

#ifndef X10_LANG_ACTIVITY_H_NODEPS
#define X10_LANG_ACTIVITY_H_NODEPS
#include <x10/lang/Boolean.h>
#include <x10/lang/Int.h>
#include <x10/lang/FinishState.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Activity__ClockPhases.h>
#include <x10/lang/Place.h>
#include <x10/lang/Long.h>
#include <x10/lang/IllegalOperationException.h>
#include <x10/lang/Error.h>
#include <x10/lang/Exception.h>
#include <x10/lang/WrappedThrowable.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/Unsafe.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_ACTIVITY_H_GENERICS
#define X10_LANG_ACTIVITY_H_GENERICS
inline x10_boolean x10::lang::Activity::FMGL(DEALLOC_BODY__get)() {
    if (FMGL(DEALLOC_BODY__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(DEALLOC_BODY__init)();
    }
    return x10::lang::Activity::FMGL(DEALLOC_BODY);
}

#endif // X10_LANG_ACTIVITY_H_GENERICS
#endif // __X10_LANG_ACTIVITY_H_NODEPS
