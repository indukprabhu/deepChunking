#ifndef __X10_LANG_RESILIENTSTOREPLACEZERO_H
#define __X10_LANG_RESILIENTSTOREPLACEZERO_H

#include <x10rt.h>


#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
namespace x10 { namespace lang { 
class VoidFun_0_0;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class GlobalRef;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Cell;
} } 
namespace x10 { namespace lang { 
class Exception;
} } 
namespace x10 { namespace util { namespace concurrent { 
class AtomicBoolean;
} } } 
namespace x10 { namespace lang { 
class FinishState;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace compiler { 
class RemoteInvocation;
} } 
namespace x10 { namespace lang { 
class Runtime__Profile;
} } 
namespace x10 { namespace lang { 
class Runtime__Pool;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(U)> class Fun_0_0;
} } 
namespace x10 { namespace util { namespace concurrent { 
class AtomicLong;
} } } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class GrowableRail;
} } 
namespace x10 { namespace lang { 
class ResilientStorePlaceZero__State;
} } 
namespace x10 { namespace util { namespace concurrent { 
class SimpleLatch;
} } } 
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
namespace x10 { namespace util { 
template<class TPMGL(T), class TPMGL(U)> class Pair;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Iterator;
} } 
namespace x10 { namespace util { 
template<class TPMGL(Key), class TPMGL(Val)> class Map__Entry;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Iterable;
} } 
namespace x10 { namespace util { 
template<class TPMGL(K), class TPMGL(V)> class HashMap;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class Set;
} } 
namespace x10 { namespace lang { 
class MultipleExceptions;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 

class ResilientStorePlaceZero : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    static ::x10::lang::ResilientStorePlaceZero* FMGL(me);
    static void FMGL(me__do_init)();
    static void FMGL(me__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(me__status);
    static ::x10::lang::CheckedThrowable* FMGL(me__exception);
    static ::x10::lang::ResilientStorePlaceZero* FMGL(me__get)();
    
    static void lowLevelAt(::x10::lang::VoidFun_0_0* cl);
    static x10_long lowLevelAtExprLong(::x10::lang::Fun_0_0<x10_long>* cl);
    ::x10::util::GrowableRail< ::x10::lang::ResilientStorePlaceZero__State*>*
      FMGL(states);
    
    x10_long FMGL(numDead);
    
    static x10_long make(x10_long homeId, x10_long parentId, ::x10::util::concurrent::SimpleLatch* latch);
    static ::x10::util::Pair< ::x10::lang::ResilientStorePlaceZero__State*, x10_boolean>
      getStateAccountingForAdoption(x10_long id);
    static void notifySubActivitySpawn(x10_long id, x10_long srcId,
                                       x10_long dstId);
    static x10_boolean notifyActivityCreation(x10_long id, x10_long srcId,
                                              x10_long dstId);
    static void notifyActivityTermination(x10_long id, x10_long dstId);
    static void notifyPlaceDeath(x10_long root_id);
    static void pushException(x10_long id, ::x10::lang::Exception* t);
    virtual x10_boolean quiescent(::x10::lang::ResilientStorePlaceZero__State* fs);
    void pushUp();
    static void waitForFinish(x10_long id);
    virtual ::x10::lang::ResilientStorePlaceZero* x10__lang__ResilientStorePlaceZero____this__x10__lang__ResilientStorePlaceZero(
      );
    void _constructor();
    
    static ::x10::lang::ResilientStorePlaceZero* _make();
    
    virtual void __fieldInitializers_x10_lang_ResilientStorePlaceZero(
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
#endif // X10_LANG_RESILIENTSTOREPLACEZERO_H

namespace x10 { namespace lang { 
class ResilientStorePlaceZero;
} } 

#ifndef X10_LANG_RESILIENTSTOREPLACEZERO_H_NODEPS
#define X10_LANG_RESILIENTSTOREPLACEZERO_H_NODEPS
#include <x10/lang/Long.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Place.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/Cell.h>
#include <x10/lang/Exception.h>
#include <x10/util/concurrent/AtomicBoolean.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/FinishState.h>
#include <x10/lang/Any.h>
#include <x10/lang/String.h>
#include <x10/compiler/RemoteInvocation.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/lang/Runtime__Pool.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/util/concurrent/AtomicLong.h>
#include <x10/util/GrowableRail.h>
#include <x10/lang/ResilientStorePlaceZero__State.h>
#include <x10/util/concurrent/SimpleLatch.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/Rail.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/util/Pair.h>
#include <x10/lang/Int.h>
#include <x10/lang/Iterator.h>
#include <x10/util/Map__Entry.h>
#include <x10/lang/Iterable.h>
#include <x10/util/HashMap.h>
#include <x10/util/Set.h>
#include <x10/lang/MultipleExceptions.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_RESILIENTSTOREPLACEZERO_H_GENERICS
#define X10_LANG_RESILIENTSTOREPLACEZERO_H_GENERICS
inline ::x10::lang::ResilientStorePlaceZero* x10::lang::ResilientStorePlaceZero::FMGL(me__get)() {
    if (FMGL(me__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(me__init)();
    }
    return x10::lang::ResilientStorePlaceZero::FMGL(me);
}

#endif // X10_LANG_RESILIENTSTOREPLACEZERO_H_GENERICS
#endif // __X10_LANG_RESILIENTSTOREPLACEZERO_H_NODEPS
