#ifndef __X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER_H
#define __X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER_H

#include <x10rt.h>


#define X10_LANG_RUNTIME__MORTAL_H_NODEPS
#include <x10/lang/Runtime__Mortal.h>
#undef X10_LANG_RUNTIME__MORTAL_H_NODEPS
#define X10_LANG_INT_H_NODEPS
#include <x10/lang/Int.h>
#undef X10_LANG_INT_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_GLOBALREF_H_NODEPS
#include <x10/lang/GlobalRef.h>
#undef X10_LANG_GLOBALREF_H_NODEPS
#define X10_LANG_GLOBALREF_H_NODEPS
#include <x10/lang/GlobalRef.h>
#undef X10_LANG_GLOBALREF_H_NODEPS
#define X10_LANG_GLOBALREF_H_NODEPS
#include <x10/lang/GlobalRef.h>
#undef X10_LANG_GLOBALREF_H_NODEPS
#define X10_LANG_BOOLEAN_H_NODEPS
#include <x10/lang/Boolean.h>
#undef X10_LANG_BOOLEAN_H_NODEPS
#define X10_LANG_BOOLEAN_H_NODEPS
#include <x10/lang/Boolean.h>
#undef X10_LANG_BOOLEAN_H_NODEPS
namespace x10 { namespace util { 
template<class TPMGL(T)> class HashSet;
} } 
namespace x10 { namespace util { namespace concurrent { 
class AtomicInteger;
} } } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class GrowableRail;
} } 
namespace x10 { namespace lang { 
class Exception;
} } 
namespace x10 { namespace util { namespace concurrent { 
class SimpleLatch;
} } } 
namespace x10 { namespace lang { 
class FinishState__FinishResilientDistributedBackup;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
class DeadPlaceException;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace lang { 
class FinishState;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace util { namespace concurrent { 
class Lock;
} } } 
namespace x10 { namespace lang { 
class VoidFun_0_0;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Cell;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(U)> class Fun_0_0;
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
template<class TPMGL(Z1), class TPMGL(U)> class Fun_0_1;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 
class Zero;
} } 
namespace x10 { namespace lang { 

class FinishState__FinishResilientDistributedMaster : public ::x10::lang::X10Class
  {
    public:
    RTT_H_DECLS_CLASS
    
    static ::x10aux::itable_entry _itables[3];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static ::x10::lang::Runtime__Mortal::itable< ::x10::lang::FinishState__FinishResilientDistributedMaster > _itable_0;
    
    static ::x10::lang::Any::itable< ::x10::lang::FinishState__FinishResilientDistributedMaster > _itable_1;
    
    virtual x10_boolean _isMortal() { return true; }
    
    static ::x10::util::HashSet< ::x10::lang::FinishState__FinishResilientDistributedMaster*>*
      FMGL(ALL);
    static void FMGL(ALL__do_init)();
    static void FMGL(ALL__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(ALL__status);
    static ::x10::lang::CheckedThrowable* FMGL(ALL__exception);
    static ::x10::util::HashSet< ::x10::lang::FinishState__FinishResilientDistributedMaster*>*
      FMGL(ALL__get)();
    
    static ::x10::util::concurrent::AtomicInteger* FMGL(nameCounter);
    static void FMGL(nameCounter__do_init)();
    static void FMGL(nameCounter__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(nameCounter__status);
    static ::x10::lang::CheckedThrowable* FMGL(nameCounter__exception);
    static ::x10::util::concurrent::AtomicInteger* FMGL(nameCounter__get)();
    
    ::x10::lang::Rail< x10_int >* FMGL(transit);
    
    ::x10::lang::Rail< x10_int >* FMGL(live);
    
    ::x10::lang::Rail< x10_int >* FMGL(transitAdopted);
    
    ::x10::lang::Rail< x10_int >* FMGL(liveAdopted);
    
    x10_long FMGL(totalCounter);
    
    ::x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >*
      FMGL(children);
    
    x10_long FMGL(numDead);
    
    ::x10::util::GrowableRail< ::x10::lang::Exception*>* FMGL(multipleExceptions);
    
    ::x10::util::concurrent::SimpleLatch* FMGL(latch);
    
    ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* >
      FMGL(backup);
    
    x10_boolean FMGL(hasBackup);
    
    ::x10::lang::String* FMGL(name);
    
    virtual void transitInc(x10_long src, x10_long dst, x10_int v);
    virtual void transitDec(x10_long src, x10_long dst);
    virtual x10_int transitGet(x10_long src, x10_long dst);
    virtual void transitSet(x10_long src, x10_long dst, x10_int v);
    virtual void transitAdoptedInc(x10_long src, x10_long dst,
                                   x10_int v);
    virtual void transitAdoptedDec(x10_long src, x10_long dst);
    virtual x10_int transitAdoptedGet(x10_long src, x10_long dst);
    virtual void transitAdoptedSet(x10_long src, x10_long dst,
                                   x10_int v);
    virtual void transitInc(x10_long src, x10_long dst);
    virtual void transitAdoptedInc(x10_long src, x10_long dst);
    void recalculateTotal();
    ::x10::util::GrowableRail< ::x10::lang::Exception*>* ensureMultipleExceptions(
      );
    virtual void addDeadPlaceException(::x10::lang::Place p);
    void _constructor(::x10::util::concurrent::SimpleLatch* latch);
    
    static ::x10::lang::FinishState__FinishResilientDistributedMaster* _make(
             ::x10::util::concurrent::SimpleLatch* latch);
    
    virtual void addChild(::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > child);
    static ::x10::lang::FinishState__FinishResilientDistributedMaster*
      make(::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > parent,
           ::x10::util::concurrent::SimpleLatch* latch);
    virtual void notifyAdoptedSubActivitySpawn(x10_long srcId,
                                               x10_long dstId);
    virtual void notifySubActivitySpawn(x10_long srcId, x10_long dstId);
    virtual x10_boolean notifyAdoptedActivityCreation(x10_long srcId,
                                                      x10_long dstId);
    virtual x10_boolean notifyActivityCreation(x10_long srcId,
                                               x10_long dstId);
    virtual void notifyAdoptedActivityTermination(x10_long dstId);
    virtual void notifyActivityTermination(x10_long dstId);
    virtual void notifyPlaceDeath();
    static void notifyAllPlaceDeath();
    virtual void pushException(::x10::lang::Exception* t);
    void pullUpDeadChildFinishes();
    x10_boolean quiescent();
    virtual ::x10::lang::FinishState__FinishResilientDistributedMaster*
      x10__lang__FinishState__FinishResilientDistributedMaster____this__x10__lang__FinishState__FinishResilientDistributedMaster(
      );
    virtual void __fieldInitializers_x10_lang_FinishState_FinishResilientDistributedMaster(
      );
    
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
#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER_H

namespace x10 { namespace lang { 
class FinishState__FinishResilientDistributedMaster;
} } 

#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER_H_NODEPS
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER_H_NODEPS
#include <x10/lang/Runtime__Mortal.h>
#include <x10/lang/Int.h>
#include <x10/lang/Long.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/Boolean.h>
#include <x10/util/HashSet.h>
#include <x10/util/concurrent/AtomicInteger.h>
#include <x10/lang/Rail.h>
#include <x10/util/GrowableRail.h>
#include <x10/lang/Exception.h>
#include <x10/util/concurrent/SimpleLatch.h>
#include <x10/lang/FinishState__FinishResilientDistributedBackup.h>
#include <x10/lang/String.h>
#include <x10/lang/Place.h>
#include <x10/lang/DeadPlaceException.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/FinishState.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Any.h>
#include <x10/util/concurrent/Lock.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Cell.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/util/MapSet.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/lang/Iterator.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/compiler/Synthetic.h>
#include <x10/lang/Zero.h>
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER_H_GENERICS
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER_H_GENERICS
inline ::x10::util::HashSet< ::x10::lang::FinishState__FinishResilientDistributedMaster*>*
  x10::lang::FinishState__FinishResilientDistributedMaster::FMGL(ALL__get)() {
    if (FMGL(ALL__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(ALL__init)();
    }
    return x10::lang::FinishState__FinishResilientDistributedMaster::FMGL(ALL);
}

inline ::x10::util::concurrent::AtomicInteger* x10::lang::FinishState__FinishResilientDistributedMaster::FMGL(nameCounter__get)() {
    if (FMGL(nameCounter__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(nameCounter__init)();
    }
    return x10::lang::FinishState__FinishResilientDistributedMaster::FMGL(nameCounter);
}

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER_H_GENERICS
#endif // __X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER_H_NODEPS
