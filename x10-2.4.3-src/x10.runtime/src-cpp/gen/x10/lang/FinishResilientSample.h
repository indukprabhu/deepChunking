#ifndef __X10_LANG_FINISHRESILIENTSAMPLE_H
#define __X10_LANG_FINISHRESILIENTSAMPLE_H

#include <x10rt.h>


#define X10_LANG_FINISHRESILIENT_H_NODEPS
#include <x10/lang/FinishResilient.h>
#undef X10_LANG_FINISHRESILIENT_H_NODEPS
#define X10_LANG_RUNTIME__MORTAL_H_NODEPS
#include <x10/lang/Runtime__Mortal.h>
#undef X10_LANG_RUNTIME__MORTAL_H_NODEPS
#define X10_LANG_GLOBALREF_H_NODEPS
#include <x10/lang/GlobalRef.h>
#undef X10_LANG_GLOBALREF_H_NODEPS
#define X10_LANG_GLOBALREF_H_NODEPS
#include <x10/lang/GlobalRef.h>
#undef X10_LANG_GLOBALREF_H_NODEPS
namespace x10 { namespace lang { 
template<class TPMGL(K), class TPMGL(V)> class ResilientStore;
} } 
namespace x10 { namespace lang { 
class FinishResilientSample__State;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class HashSet;
} } 
namespace x10 { namespace compiler { 
class NonEscaping;
} } 
namespace x10 { namespace util { namespace concurrent { 
class SimpleLatch;
} } } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace lang { 
class System;
} } 
namespace x10 { namespace lang { 
class FinishState;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class GrowableRail;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class MapSet;
} } 
namespace x10 { namespace compiler { 
class Finalization;
} } 
namespace x10 { namespace compiler { 
class Abort;
} } 
namespace x10 { namespace compiler { 
class CompilerFlags;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Iterator;
} } 
namespace x10 { namespace lang { 
class VoidFun_0_0;
} } 
namespace x10 { namespace lang { 
class Exception;
} } 
namespace x10 { namespace lang { 
class MultipleExceptions;
} } 
namespace x10 { namespace lang { 
class DeadPlaceException;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 

class FinishResilientSample : public ::x10::lang::FinishResilient   {
    public:
    RTT_H_DECLS_CLASS
    
    static ::x10aux::itable_entry _itables[3];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static ::x10::lang::Runtime__Mortal::itable< ::x10::lang::FinishResilientSample > _itable_0;
    
    static ::x10::lang::Any::itable< ::x10::lang::FinishResilientSample > _itable_1;
    
    virtual x10_boolean _isMortal() { return true; }
    
    static x10_long FMGL(verbose);
    static void FMGL(verbose__do_init)();
    static void FMGL(verbose__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(verbose__status);
    static ::x10::lang::CheckedThrowable* FMGL(verbose__exception);
    static x10_long FMGL(verbose__get)();
    
    static ::x10::lang::ResilientStore< ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* >, ::x10::lang::FinishResilientSample__State*>*
      FMGL(RS);
    static void FMGL(RS__do_init)();
    static void FMGL(RS__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(RS__status);
    static ::x10::lang::CheckedThrowable* FMGL(RS__exception);
    static ::x10::lang::ResilientStore< ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* >, ::x10::lang::FinishResilientSample__State*>*
      FMGL(RS__get)();
    
    static ::x10::util::HashSet< ::x10::lang::FinishResilientSample*>*
      FMGL(ALL);
    static void FMGL(ALL__do_init)();
    static void FMGL(ALL__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(ALL__status);
    static ::x10::lang::CheckedThrowable* FMGL(ALL__exception);
    static ::x10::util::HashSet< ::x10::lang::FinishResilientSample*>*
      FMGL(ALL__get)();
    
    ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* >
      FMGL(id);
    
    ::x10::util::concurrent::SimpleLatch* FMGL(latch);
    
    virtual ::x10::lang::String* toString();
    void _constructor(::x10::lang::FinishState* parent, ::x10::util::concurrent::SimpleLatch* latch);
    
    static ::x10::lang::FinishResilientSample* _make(::x10::lang::FinishState* parent,
                                                     ::x10::util::concurrent::SimpleLatch* latch);
    
    static ::x10::lang::FinishResilientSample* make(::x10::lang::FinishState* parent,
                                                    ::x10::util::concurrent::SimpleLatch* latch);
    static void notifyPlaceDeath();
    void releaseLatch();
    ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* >
      getCurrentAdopterId();
    virtual void notifySubActivitySpawn(::x10::lang::Place place);
    virtual x10_boolean notifyActivityCreation(::x10::lang::Place srcPlace);
    virtual void notifyActivityTermination();
    virtual void pushException(::x10::lang::Exception* t);
    virtual void waitForFinish();
    x10_boolean quiescent();
    void addDeadPlaceException(::x10::lang::FinishResilientSample__State* state,
                               x10_long placeId);
    virtual ::x10::lang::FinishResilientSample* x10__lang__FinishResilientSample____this__x10__lang__FinishResilientSample(
      );
    virtual void __fieldInitializers_x10_lang_FinishResilientSample(
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


} } 
#endif // X10_LANG_FINISHRESILIENTSAMPLE_H

namespace x10 { namespace lang { 
class FinishResilientSample;
} } 

#ifndef X10_LANG_FINISHRESILIENTSAMPLE_H_NODEPS
#define X10_LANG_FINISHRESILIENTSAMPLE_H_NODEPS
#include <x10/lang/FinishResilient.h>
#include <x10/lang/Runtime__Mortal.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/Long.h>
#include <x10/lang/ResilientStore.h>
#include <x10/lang/FinishResilientSample__State.h>
#include <x10/lang/Any.h>
#include <x10/util/HashSet.h>
#include <x10/compiler/NonEscaping.h>
#include <x10/util/concurrent/SimpleLatch.h>
#include <x10/lang/String.h>
#include <x10/lang/System.h>
#include <x10/lang/FinishState.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Int.h>
#include <x10/lang/Place.h>
#include <x10/lang/Runtime.h>
#include <x10/util/GrowableRail.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/util/MapSet.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/lang/Iterator.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Exception.h>
#include <x10/lang/MultipleExceptions.h>
#include <x10/lang/DeadPlaceException.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_FINISHRESILIENTSAMPLE_H_GENERICS
#define X10_LANG_FINISHRESILIENTSAMPLE_H_GENERICS
inline x10_long x10::lang::FinishResilientSample::FMGL(verbose__get)() {
    if (FMGL(verbose__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(verbose__init)();
    }
    return x10::lang::FinishResilientSample::FMGL(verbose);
}

inline ::x10::lang::ResilientStore< ::x10::lang::GlobalRef< ::x10::lang::FinishResilientSample* >, ::x10::lang::FinishResilientSample__State*>*
  x10::lang::FinishResilientSample::FMGL(RS__get)() {
    if (FMGL(RS__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(RS__init)();
    }
    return x10::lang::FinishResilientSample::FMGL(RS);
}

inline ::x10::util::HashSet< ::x10::lang::FinishResilientSample*>*
  x10::lang::FinishResilientSample::FMGL(ALL__get)() {
    if (FMGL(ALL__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(ALL__init)();
    }
    return x10::lang::FinishResilientSample::FMGL(ALL);
}

#endif // X10_LANG_FINISHRESILIENTSAMPLE_H_GENERICS
#endif // __X10_LANG_FINISHRESILIENTSAMPLE_H_NODEPS
