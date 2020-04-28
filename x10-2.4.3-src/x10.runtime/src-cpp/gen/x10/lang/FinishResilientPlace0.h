#ifndef __X10_LANG_FINISHRESILIENTPLACE0_H
#define __X10_LANG_FINISHRESILIENTPLACE0_H

#include <x10rt.h>


#define X10_LANG_FINISHRESILIENT_H_NODEPS
#include <x10/lang/FinishResilient.h>
#undef X10_LANG_FINISHRESILIENT_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class GrowableRail;
} } 
namespace x10 { namespace lang { 
class FinishResilientPlace0__State;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace lang { 
class FinishState;
} } 
namespace x10 { namespace util { namespace concurrent { 
class SimpleLatch;
} } } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class GlobalRef;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Cell;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(U)> class Fun_0_0;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
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
class VoidFun_0_0;
} } 
namespace x10 { namespace lang { 
class Any;
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

class FinishResilientPlace0 : public ::x10::lang::FinishResilient   {
    public:
    RTT_H_DECLS_CLASS
    
    static x10_long FMGL(verbose);
    static void FMGL(verbose__do_init)();
    static void FMGL(verbose__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(verbose__status);
    static ::x10::lang::CheckedThrowable* FMGL(verbose__exception);
    static x10_long FMGL(verbose__get)();
    
    static ::x10::lang::Place FMGL(place0);
    static void FMGL(place0__do_init)();
    static void FMGL(place0__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(place0__status);
    static ::x10::lang::CheckedThrowable* FMGL(place0__exception);
    static ::x10::lang::Place FMGL(place0__get)();
    
    static ::x10::util::GrowableRail< ::x10::lang::FinishResilientPlace0__State*>*
      FMGL(states);
    static void FMGL(states__do_init)();
    static void FMGL(states__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(states__status);
    static ::x10::lang::CheckedThrowable* FMGL(states__exception);
    static ::x10::util::GrowableRail< ::x10::lang::FinishResilientPlace0__State*>*
      FMGL(states__get)();
    
    x10_long FMGL(id);
    
    virtual ::x10::lang::String* toString();
    void _constructor(x10_long id);
    
    static ::x10::lang::FinishResilientPlace0* _make(x10_long id);
    
    static ::x10::lang::FinishResilient* make(::x10::lang::FinishState* parent,
                                              ::x10::util::concurrent::SimpleLatch* latch);
    static void notifyPlaceDeath();
    virtual void notifySubActivitySpawn(::x10::lang::Place place);
    virtual x10_boolean notifyActivityCreation(::x10::lang::Place srcPlace);
    virtual void notifyActivityTermination();
    virtual void pushException(::x10::lang::Exception* t);
    virtual void waitForFinish();
    static x10_long getCurrentAdopterId(x10_long id);
    static void releaseLatch(x10_long id);
    static x10_boolean quiescent(x10_long id);
    static void addDeadPlaceException(::x10::lang::FinishResilientPlace0__State* state,
                                      x10_long placeId);
    virtual ::x10::lang::FinishResilientPlace0* x10__lang__FinishResilientPlace0____this__x10__lang__FinishResilientPlace0(
      );
    virtual void __fieldInitializers_x10_lang_FinishResilientPlace0(
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
#endif // X10_LANG_FINISHRESILIENTPLACE0_H

namespace x10 { namespace lang { 
class FinishResilientPlace0;
} } 

#ifndef X10_LANG_FINISHRESILIENTPLACE0_H_NODEPS
#define X10_LANG_FINISHRESILIENTPLACE0_H_NODEPS
#include <x10/lang/FinishResilient.h>
#include <x10/lang/Long.h>
#include <x10/lang/Place.h>
#include <x10/util/GrowableRail.h>
#include <x10/lang/FinishResilientPlace0__State.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/String.h>
#include <x10/lang/FinishState.h>
#include <x10/util/concurrent/SimpleLatch.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/Cell.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Int.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Any.h>
#include <x10/lang/Exception.h>
#include <x10/lang/MultipleExceptions.h>
#include <x10/lang/DeadPlaceException.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_FINISHRESILIENTPLACE0_H_GENERICS
#define X10_LANG_FINISHRESILIENTPLACE0_H_GENERICS
inline x10_long x10::lang::FinishResilientPlace0::FMGL(verbose__get)() {
    if (FMGL(verbose__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(verbose__init)();
    }
    return x10::lang::FinishResilientPlace0::FMGL(verbose);
}

inline ::x10::lang::Place x10::lang::FinishResilientPlace0::FMGL(place0__get)() {
    if (FMGL(place0__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(place0__init)();
    }
    return x10::lang::FinishResilientPlace0::FMGL(place0);
}

inline ::x10::util::GrowableRail< ::x10::lang::FinishResilientPlace0__State*>*
  x10::lang::FinishResilientPlace0::FMGL(states__get)() {
    if (FMGL(states__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(states__init)();
    }
    return x10::lang::FinishResilientPlace0::FMGL(states);
}

#endif // X10_LANG_FINISHRESILIENTPLACE0_H_GENERICS
#endif // __X10_LANG_FINISHRESILIENTPLACE0_H_NODEPS
