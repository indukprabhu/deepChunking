#ifndef __X10_UTIL_TEAM__LOCALTEAMSTATE_H
#define __X10_UTIL_TEAM__LOCALTEAMSTATE_H

#include <x10rt.h>


#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_INT_H_NODEPS
#include <x10/lang/Int.h>
#undef X10_LANG_INT_H_NODEPS
#define X10_LANG_INT_H_NODEPS
#include <x10/lang/Int.h>
#undef X10_LANG_INT_H_NODEPS
namespace x10 { namespace lang { 
class PlaceGroup;
} } 
namespace x10 { namespace util { namespace concurrent { 
class AtomicInteger;
} } } 
namespace x10 { namespace util { namespace concurrent { 
class Lock;
} } } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace util { 
class Team;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace lang { 
class Runtime__Pool;
} } 
namespace x10 { namespace lang { 
class Thread;
} } 
namespace x10 { namespace lang { 
class InterruptedException;
} } 
namespace x10 { namespace util { 
class Team__LocalTeamState__TreeStructure;
} } 
namespace x10 { namespace lang { 
class FinishState;
} } 
namespace x10 { namespace compiler { 
class Pragma;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
class VoidFun_0_0;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class GrowableRail;
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
class Error;
} } 
namespace x10 { namespace lang { 
class Exception;
} } 
namespace x10 { namespace compiler { 
class AsyncClosure;
} } 
namespace x10 { namespace lang { 
class Runtime__Profile;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class GlobalRail;
} } 
namespace x10 { namespace util { 
class Team__DoubleIdx;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace util { 

class Team__LocalTeamState : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    ::x10::lang::PlaceGroup* FMGL(places);
    
    x10_int FMGL(teamid);
    
    x10_long FMGL(myIndex);
    
    static x10_int FMGL(PHASE_READY);
    static void FMGL(PHASE_READY__do_init)();
    static void FMGL(PHASE_READY__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(PHASE_READY__status);
    static ::x10::lang::CheckedThrowable* FMGL(PHASE_READY__exception);
    static x10_int FMGL(PHASE_READY__get)();
    
    static x10_int FMGL(PHASE_INIT);
    static void FMGL(PHASE_INIT__do_init)();
    static void FMGL(PHASE_INIT__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(PHASE_INIT__status);
    static ::x10::lang::CheckedThrowable* FMGL(PHASE_INIT__exception);
    static x10_int FMGL(PHASE_INIT__get)();
    
    static x10_int FMGL(PHASE_GATHER1);
    static void FMGL(PHASE_GATHER1__do_init)();
    static void FMGL(PHASE_GATHER1__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(PHASE_GATHER1__status);
    static ::x10::lang::CheckedThrowable* FMGL(PHASE_GATHER1__exception);
    static x10_int FMGL(PHASE_GATHER1__get)();
    
    static x10_int FMGL(PHASE_GATHER2);
    static void FMGL(PHASE_GATHER2__do_init)();
    static void FMGL(PHASE_GATHER2__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(PHASE_GATHER2__status);
    static ::x10::lang::CheckedThrowable* FMGL(PHASE_GATHER2__exception);
    static x10_int FMGL(PHASE_GATHER2__get)();
    
    static x10_int FMGL(PHASE_SCATTER);
    static void FMGL(PHASE_SCATTER__do_init)();
    static void FMGL(PHASE_SCATTER__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(PHASE_SCATTER__status);
    static ::x10::lang::CheckedThrowable* FMGL(PHASE_SCATTER__exception);
    static x10_int FMGL(PHASE_SCATTER__get)();
    
    static x10_int FMGL(PHASE_DONE);
    static void FMGL(PHASE_DONE__do_init)();
    static void FMGL(PHASE_DONE__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(PHASE_DONE__status);
    static ::x10::lang::CheckedThrowable* FMGL(PHASE_DONE__exception);
    static x10_int FMGL(PHASE_DONE__get)();
    
    ::x10::util::concurrent::AtomicInteger* FMGL(phase);
    
    ::x10::util::concurrent::Lock* FMGL(dstLock);
    
    static x10_int FMGL(COLL_BARRIER);
    static void FMGL(COLL_BARRIER__do_init)();
    static void FMGL(COLL_BARRIER__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(COLL_BARRIER__status);
    static ::x10::lang::CheckedThrowable* FMGL(COLL_BARRIER__exception);
    static x10_int FMGL(COLL_BARRIER__get)();
    
    static x10_int FMGL(COLL_BROADCAST);
    static void FMGL(COLL_BROADCAST__do_init)();
    static void FMGL(COLL_BROADCAST__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(COLL_BROADCAST__status);
    static ::x10::lang::CheckedThrowable* FMGL(COLL_BROADCAST__exception);
    static x10_int FMGL(COLL_BROADCAST__get)();
    
    static x10_int FMGL(COLL_SCATTER);
    static void FMGL(COLL_SCATTER__do_init)();
    static void FMGL(COLL_SCATTER__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(COLL_SCATTER__status);
    static ::x10::lang::CheckedThrowable* FMGL(COLL_SCATTER__exception);
    static x10_int FMGL(COLL_SCATTER__get)();
    
    static x10_int FMGL(COLL_ALLTOALL);
    static void FMGL(COLL_ALLTOALL__do_init)();
    static void FMGL(COLL_ALLTOALL__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(COLL_ALLTOALL__status);
    static ::x10::lang::CheckedThrowable* FMGL(COLL_ALLTOALL__exception);
    static x10_int FMGL(COLL_ALLTOALL__get)();
    
    static x10_int FMGL(COLL_REDUCE);
    static void FMGL(COLL_REDUCE__do_init)();
    static void FMGL(COLL_REDUCE__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(COLL_REDUCE__status);
    static ::x10::lang::CheckedThrowable* FMGL(COLL_REDUCE__exception);
    static x10_int FMGL(COLL_REDUCE__get)();
    
    static x10_int FMGL(COLL_ALLREDUCE);
    static void FMGL(COLL_ALLREDUCE__do_init)();
    static void FMGL(COLL_ALLREDUCE__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(COLL_ALLREDUCE__status);
    static ::x10::lang::CheckedThrowable* FMGL(COLL_ALLREDUCE__exception);
    static x10_int FMGL(COLL_ALLREDUCE__get)();
    
    static x10_int FMGL(COLL_INDEXOFMIN);
    static void FMGL(COLL_INDEXOFMIN__do_init)();
    static void FMGL(COLL_INDEXOFMIN__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(COLL_INDEXOFMIN__status);
    static ::x10::lang::CheckedThrowable* FMGL(COLL_INDEXOFMIN__exception);
    static x10_int FMGL(COLL_INDEXOFMIN__get)();
    
    static x10_int FMGL(COLL_INDEXOFMAX);
    static void FMGL(COLL_INDEXOFMAX__do_init)();
    static void FMGL(COLL_INDEXOFMAX__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(COLL_INDEXOFMAX__status);
    static ::x10::lang::CheckedThrowable* FMGL(COLL_INDEXOFMAX__exception);
    static x10_int FMGL(COLL_INDEXOFMAX__get)();
    
    ::x10::lang::Any* FMGL(local_src);
    
    x10_long FMGL(local_src_off);
    
    ::x10::lang::Any* FMGL(local_dst);
    
    x10_long FMGL(local_dst_off);
    
    x10_long FMGL(local_count);
    
    x10_long FMGL(local_grandchildren);
    
    static ::x10::lang::String* getCollName(x10_int collType);
    static void lockDst(x10_int teamidcopy, ::x10::util::concurrent::Lock* lock);
    ::x10::util::Team__LocalTeamState__TreeStructure getLinks(x10_long parent,
                                                              x10_long startIndex,
                                                              x10_long endIndex);
    void init();
    template<class TPMGL(T)> void performReduction(::x10::lang::Rail< TPMGL(T) >* src,
                                                   x10_long src_off,
                                                   ::x10::lang::Rail< TPMGL(T) >* dst,
                                                   x10_long dst_off,
                                                   x10_long count,
                                                   x10_int operation);
    template<class TPMGL(T)> void collective_impl(x10_int collType,
                                                  ::x10::lang::Place root,
                                                  ::x10::lang::Rail< TPMGL(T) >* src,
                                                  x10_long src_off,
                                                  ::x10::lang::Rail< TPMGL(T) >* dst,
                                                  x10_long dst_off,
                                                  x10_long count,
                                                  x10_int operation);
    virtual ::x10::util::Team__LocalTeamState* x10__util__Team__LocalTeamState____this__x10__util__Team__LocalTeamState(
      );
    void _constructor(::x10::lang::PlaceGroup* places, x10_int teamid,
                      x10_long myIndex);
    
    static ::x10::util::Team__LocalTeamState* _make(::x10::lang::PlaceGroup* places,
                                                    x10_int teamid,
                                                    x10_long myIndex);
    
    virtual void __fieldInitializers_x10_util_Team_LocalTeamState(
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
#endif // X10_UTIL_TEAM__LOCALTEAMSTATE_H

namespace x10 { namespace util { 
class Team__LocalTeamState;
} } 

#ifndef X10_UTIL_TEAM__LOCALTEAMSTATE_H_NODEPS
#define X10_UTIL_TEAM__LOCALTEAMSTATE_H_NODEPS
#include <x10/lang/Long.h>
#include <x10/lang/Int.h>
#include <x10/lang/PlaceGroup.h>
#include <x10/util/concurrent/AtomicInteger.h>
#include <x10/util/concurrent/Lock.h>
#include <x10/lang/Any.h>
#include <x10/lang/String.h>
#include <x10/lang/Boolean.h>
#include <x10/util/Team.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Runtime__Pool.h>
#include <x10/lang/Thread.h>
#include <x10/lang/InterruptedException.h>
#include <x10/util/Team__LocalTeamState__TreeStructure.h>
#include <x10/lang/FinishState.h>
#include <x10/compiler/Pragma.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/Place.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/util/GrowableRail.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/lang/Error.h>
#include <x10/lang/Exception.h>
#include <x10/compiler/AsyncClosure.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/lang/Rail.h>
#include <x10/lang/GlobalRail.h>
#include <x10/util/Team__DoubleIdx.h>
#include <x10/lang/Double.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__4_CLOSURE
#define X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__4_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_util_Team__LocalTeamState__closure__4 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_util_Team__LocalTeamState__closure__4<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 833 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            if ((((::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                           ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122474 =
                                             ::x10::util::Team::FMGL(state__get)();
                                           
                                           //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                           x10_long idx__122473 =
                                             ((x10_long)(teamidcopy));
                                           ::x10::util::Team__LocalTeamState* ret__122475;
                                           
                                           //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                           ret__122475 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122474)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                           idx__122473);
                                           ret__122475;
                                       }))
                                       )->FMGL(phase))->x10::util::concurrent::AtomicInteger::get()) < (((x10_int)2))) ||
                ((::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                          ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122478 =
                                            ::x10::util::Team::FMGL(state__get)();
                                          
                                          //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                          x10_long idx__122477 =
                                            ((x10_long)(teamidcopy));
                                          ::x10::util::Team__LocalTeamState* ret__122479;
                                          
                                          //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                          ret__122479 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122478)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                          idx__122477);
                                          ret__122479;
                                      }))
                                      )->FMGL(phase))->x10::util::concurrent::AtomicInteger::get()) > (((x10_int)4)))))
            {
                
                //#line 834 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                if (false) {
                    
                    //#line 835 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                    while ((((::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                      ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122482 =
                                                        ::x10::util::Team::FMGL(state__get)();
                                                      
                                                      //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                      x10_long idx__122481 =
                                                        ((x10_long)(teamidcopy));
                                                      ::x10::util::Team__LocalTeamState* ret__122483;
                                                      
                                                      //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                      ret__122483 =
                                                        ::x10aux::nullCheck(::x10aux::nullCheck(this__122482)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                          idx__122481);
                                                      ret__122483;
                                                  }))
                                                  )->FMGL(phase))->x10::util::concurrent::AtomicInteger::get()) < (((x10_int)2))) ||
                           ((::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                     ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122486 =
                                                       ::x10::util::Team::FMGL(state__get)();
                                                     
                                                     //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                     x10_long idx__122485 =
                                                       ((x10_long)(teamidcopy));
                                                     ::x10::util::Team__LocalTeamState* ret__122487;
                                                     
                                                     //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                     ret__122487 =
                                                       ::x10aux::nullCheck(::x10aux::nullCheck(this__122486)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                         idx__122485);
                                                     ret__122487;
                                                 }))
                                                 )->FMGL(phase))->x10::util::concurrent::AtomicInteger::get()) >= (((x10_int)4)))))
                    {
                        
                        //#line 836 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                        ::x10::lang::Runtime::probe();
                    }
                    
                } else {
                    
                    //#line 1559 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
                    {
                        
                        //#line 1560 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        ::x10::lang::Runtime::FMGL(pool__get)()->increase();
                    }
                    
                    //#line 840 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                    while ((((::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                      ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122492 =
                                                        ::x10::util::Team::FMGL(state__get)();
                                                      
                                                      //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                      x10_long idx__122491 =
                                                        ((x10_long)(teamidcopy));
                                                      ::x10::util::Team__LocalTeamState* ret__122493;
                                                      
                                                      //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                      ret__122493 =
                                                        ::x10aux::nullCheck(::x10aux::nullCheck(this__122492)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                          idx__122491);
                                                      ret__122493;
                                                  }))
                                                  )->FMGL(phase))->x10::util::concurrent::AtomicInteger::get()) < (((x10_int)2))) ||
                           ((::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                     ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122496 =
                                                       ::x10::util::Team::FMGL(state__get)();
                                                     
                                                     //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                     x10_long idx__122495 =
                                                       ((x10_long)(teamidcopy));
                                                     ::x10::util::Team__LocalTeamState* ret__122497;
                                                     
                                                     //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                     ret__122497 =
                                                       ::x10aux::nullCheck(::x10aux::nullCheck(this__122496)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                         idx__122495);
                                                     ret__122497;
                                                 }))
                                                 )->FMGL(phase))->x10::util::concurrent::AtomicInteger::get()) >= (((x10_int)4)))))
                    {
                        
                        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                        x10_boolean ret__122501;
                        goto __ret__122502; __ret__122502: {
                        {
                            
                            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                            try {
                                
                                //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                                ::x10::lang::Thread::sleep(
                                  ((x10_long)0ll));
                                
                                //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                                ret__122501 = true;
                                goto __ret__122502_end_;
                            }
                            catch (::x10::lang::CheckedThrowable* __exc3146) {
                                if (::x10aux::instanceof< ::x10::lang::InterruptedException*>(__exc3146)) {
                                    ::x10::lang::InterruptedException* e__122500 =
                                      static_cast< ::x10::lang::InterruptedException*>(__exc3146);
                                    {
                                        
                                        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                                        ret__122501 = false;
                                        goto __ret__122502_end_;
                                    }
                                } else
                                throw;
                            }
                        }goto __ret__122502_end_; __ret__122502_end_: ;
                        }
                        ret__122501;
                        }
                        
                    
                    //#line 1566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
                    {
                        
                        //#line 1567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        ::x10::lang::Runtime::FMGL(pool__get)()->decrease(
                          ((x10_int)1));
                    }
                    }
                    
                }
                
            }
            catch (::x10::lang::CheckedThrowable* __exc3147) {
                if (::x10aux::instanceof< ::x10::lang::Error*>(__exc3147)) {
                    ::x10::lang::Error* __lowerer__var__0__ =
                      static_cast< ::x10::lang::Error*>(__exc3147);
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                    }
                } else
                if (true) {
                    ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc3147);
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                       __lowerer__var__1__)));
                    }
                } else
                throw;
            }
        }
        
        // captured environment
        x10_int teamidcopy;
        
        ::x10aux::serialization_id_t _get_serialization_id() {
            return _serialization_id;
        }
        
        ::x10aux::serialization_id_t _get_network_id() {
            return _network_id;
        }
        
        void _serialize_body(::x10aux::serialization_buffer &buf) {
            buf.write(this->teamidcopy);
        }
        
        static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
            x10_util_Team__LocalTeamState__closure__4<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_util_Team__LocalTeamState__closure__4<TPMGL(T) > >();
            buf.record_reference(storage);
            x10_int that_teamidcopy = buf.read<x10_int>();
            x10_util_Team__LocalTeamState__closure__4<TPMGL(T) >* this_ = new (storage) x10_util_Team__LocalTeamState__closure__4<TPMGL(T) >(that_teamidcopy);
            return this_;
        }
        
        x10_util_Team__LocalTeamState__closure__4(x10_int teamidcopy) : teamidcopy(teamidcopy) { }
        
        static const ::x10aux::serialization_id_t _serialization_id;
        
        static const ::x10aux::serialization_id_t _network_id;
        
        static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
        virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
        
        const char* toNativeString() {
            return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10:832-845";
        }
    
    };
    
    template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_util_Team__LocalTeamState__closure__4<TPMGL(T) > >x10_util_Team__LocalTeamState__closure__4<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_Team__LocalTeamState__closure__4<TPMGL(T) >::__apply, &x10_util_Team__LocalTeamState__closure__4<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
    template<class TPMGL(T)> ::x10aux::itable_entry x10_util_Team__LocalTeamState__closure__4<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_util_Team__LocalTeamState__closure__4<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};
    
    template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_Team__LocalTeamState__closure__4<TPMGL(T) >::_serialization_id = 
        ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_Team__LocalTeamState__closure__4<TPMGL(T) >::_deserialize);
    template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_Team__LocalTeamState__closure__4<TPMGL(T) >::_network_id = 
        ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_util_Team__LocalTeamState__closure__4<TPMGL(T) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);
    
    #endif // X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__4_CLOSURE
    #ifndef X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__5_CLOSURE
#define X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__5_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_util_Team__LocalTeamState__closure__5 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_util_Team__LocalTeamState__closure__5<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 856 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Rail< void >::asyncCopy< TPMGL(T) >(gr, dst_off,
                                                             ::x10aux::class_cast< ::x10::lang::Rail< TPMGL(T) >*>(::x10aux::nullCheck((__extension__ ({
                                                                                                                       ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122507 =
                                                                                                                         ::x10::util::Team::FMGL(state__get)();
                                                                                                                       
                                                                                                                       //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                                                                       x10_long idx__122506 =
                                                                                                                         ((x10_long)(teamidcopy));
                                                                                                                       ::x10::util::Team__LocalTeamState* ret__122508;
                                                                                                                       
                                                                                                                       //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                                                                       ret__122508 =
                                                                                                                         ::x10aux::nullCheck(::x10aux::nullCheck(this__122507)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                                                                                           idx__122506);
                                                                                                                       ret__122508;
                                                                                                                   }))
                                                                                                                   )->FMGL(local_dst)),
                                                             ::x10aux::nullCheck((__extension__ ({
                                                                 ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122511 =
                                                                   ::x10::util::Team::FMGL(state__get)();
                                                                 
                                                                 //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                 x10_long idx__122510 =
                                                                   ((x10_long)(teamidcopy));
                                                                 ::x10::util::Team__LocalTeamState* ret__122512;
                                                                 
                                                                 //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                 ret__122512 =
                                                                   ::x10aux::nullCheck(::x10aux::nullCheck(this__122511)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                                     idx__122510);
                                                                 ret__122512;
                                                             }))
                                                             )->FMGL(local_dst_off),
                                                             totalData);
        }
        catch (::x10::lang::CheckedThrowable* __exc3150) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc3150)) {
                ::x10::lang::Error* __lowerer__var__1__ =
                  static_cast< ::x10::lang::Error*>(__exc3150);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__1__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__2__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc3150);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__2__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::GlobalRail<TPMGL(T)> gr;
    x10_long dst_off;
    x10_int teamidcopy;
    x10_long totalData;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->gr);
        buf.write(this->dst_off);
        buf.write(this->teamidcopy);
        buf.write(this->totalData);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_Team__LocalTeamState__closure__5<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_util_Team__LocalTeamState__closure__5<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::GlobalRail<TPMGL(T)> that_gr = buf.read< ::x10::lang::GlobalRail<TPMGL(T)> >();
        x10_long that_dst_off = buf.read<x10_long>();
        x10_int that_teamidcopy = buf.read<x10_int>();
        x10_long that_totalData = buf.read<x10_long>();
        x10_util_Team__LocalTeamState__closure__5<TPMGL(T) >* this_ = new (storage) x10_util_Team__LocalTeamState__closure__5<TPMGL(T) >(that_gr, that_dst_off, that_teamidcopy, that_totalData);
        return this_;
    }
    
    x10_util_Team__LocalTeamState__closure__5(::x10::lang::GlobalRail<TPMGL(T)> gr, x10_long dst_off, x10_int teamidcopy, x10_long totalData) : gr(gr), dst_off(dst_off), teamidcopy(teamidcopy), totalData(totalData) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10:854-857";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_util_Team__LocalTeamState__closure__5<TPMGL(T) > >x10_util_Team__LocalTeamState__closure__5<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_Team__LocalTeamState__closure__5<TPMGL(T) >::__apply, &x10_util_Team__LocalTeamState__closure__5<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_util_Team__LocalTeamState__closure__5<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_util_Team__LocalTeamState__closure__5<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_Team__LocalTeamState__closure__5<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_Team__LocalTeamState__closure__5<TPMGL(T) >::_deserialize);
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_Team__LocalTeamState__closure__5<TPMGL(T) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_util_Team__LocalTeamState__closure__5<TPMGL(T) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__5_CLOSURE
#ifndef X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__6_CLOSURE
#define X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__6_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_util_Team__LocalTeamState__closure__6 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_util_Team__LocalTeamState__closure__6<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 865 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::util::Team__LocalTeamState::lockDst(teamidcopy, ::x10aux::nullCheck((__extension__ ({
                                                                       ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122515 =
                                                                         ::x10::util::Team::FMGL(state__get)();
                                                                       
                                                                       //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                       x10_long idx__122514 =
                                                                         ((x10_long)(teamidcopy));
                                                                       ::x10::util::Team__LocalTeamState* ret__122516;
                                                                       
                                                                       //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                       ret__122516 =
                                                                         ::x10aux::nullCheck(::x10aux::nullCheck(this__122515)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                                           idx__122514);
                                                                       ret__122516;
                                                                   }))
                                                                   )->FMGL(dstLock));
            
            //#line 866 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Rail< ::x10::util::Team__DoubleIdx >* ldi =
              ::x10aux::class_cast< ::x10::lang::Rail< ::x10::util::Team__DoubleIdx >*>(::x10aux::nullCheck((__extension__ ({
                                                                                            ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122519 =
                                                                                              ::x10::util::Team::FMGL(state__get)();
                                                                                            
                                                                                            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                                            x10_long idx__122518 =
                                                                                              ((x10_long)(teamidcopy));
                                                                                            ::x10::util::Team__LocalTeamState* ret__122520;
                                                                                            
                                                                                            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                                            ret__122520 =
                                                                                              ::x10aux::nullCheck(::x10aux::nullCheck(this__122519)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                                                                idx__122518);
                                                                                            ret__122520;
                                                                                        }))
                                                                                        )->FMGL(local_dst));
            
            //#line 872 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            if (((childVal->FMGL(value)) > (::x10aux::nullCheck(ldi)->x10::lang::template Rail< ::x10::util::Team__DoubleIdx >::__apply(
                                              ((x10_long)0ll))->FMGL(value))))
            {
                
                //#line 873 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                ::x10aux::nullCheck(ldi)->x10::lang::template Rail< ::x10::util::Team__DoubleIdx >::__set(
                  ((x10_long)0ll), childVal);
            }
            
            //#line 874 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                    ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122523 =
                                      ::x10::util::Team::FMGL(state__get)();
                                    
                                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                    x10_long idx__122522 =
                                      ((x10_long)(teamidcopy));
                                    ::x10::util::Team__LocalTeamState* ret__122524;
                                    
                                    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                    ret__122524 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122523)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                    idx__122522);
                                    ret__122524;
                                }))
                                )->FMGL(dstLock))->unlock();
        }
        catch (::x10::lang::CheckedThrowable* __exc3153) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc3153)) {
                ::x10::lang::Error* __lowerer__var__1__ =
                  static_cast< ::x10::lang::Error*>(__exc3153);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__1__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__2__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc3153);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__2__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    x10_int teamidcopy;
    ::x10::util::Team__DoubleIdx childVal;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->teamidcopy);
        buf.write(this->childVal);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_Team__LocalTeamState__closure__6<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_util_Team__LocalTeamState__closure__6<TPMGL(T) > >();
        buf.record_reference(storage);
        x10_int that_teamidcopy = buf.read<x10_int>();
        ::x10::util::Team__DoubleIdx that_childVal = buf.read< ::x10::util::Team__DoubleIdx>();
        x10_util_Team__LocalTeamState__closure__6<TPMGL(T) >* this_ = new (storage) x10_util_Team__LocalTeamState__closure__6<TPMGL(T) >(that_teamidcopy, that_childVal);
        return this_;
    }
    
    x10_util_Team__LocalTeamState__closure__6(x10_int teamidcopy, ::x10::util::Team__DoubleIdx childVal) : teamidcopy(teamidcopy), childVal(childVal) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10:864-875";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_util_Team__LocalTeamState__closure__6<TPMGL(T) > >x10_util_Team__LocalTeamState__closure__6<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_Team__LocalTeamState__closure__6<TPMGL(T) >::__apply, &x10_util_Team__LocalTeamState__closure__6<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_util_Team__LocalTeamState__closure__6<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_util_Team__LocalTeamState__closure__6<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_Team__LocalTeamState__closure__6<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_Team__LocalTeamState__closure__6<TPMGL(T) >::_deserialize);
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_Team__LocalTeamState__closure__6<TPMGL(T) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_util_Team__LocalTeamState__closure__6<TPMGL(T) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__6_CLOSURE
#ifndef X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__7_CLOSURE
#define X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__7_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_util_Team__LocalTeamState__closure__7 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_util_Team__LocalTeamState__closure__7<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 880 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::util::Team__LocalTeamState::lockDst(teamidcopy, ::x10aux::nullCheck((__extension__ ({
                                                                       ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122527 =
                                                                         ::x10::util::Team::FMGL(state__get)();
                                                                       
                                                                       //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                       x10_long idx__122526 =
                                                                         ((x10_long)(teamidcopy));
                                                                       ::x10::util::Team__LocalTeamState* ret__122528;
                                                                       
                                                                       //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                       ret__122528 =
                                                                         ::x10aux::nullCheck(::x10aux::nullCheck(this__122527)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                                           idx__122526);
                                                                       ret__122528;
                                                                   }))
                                                                   )->FMGL(dstLock));
            
            //#line 881 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Rail< ::x10::util::Team__DoubleIdx >* ldi =
              ::x10aux::class_cast< ::x10::lang::Rail< ::x10::util::Team__DoubleIdx >*>(::x10aux::nullCheck((__extension__ ({
                                                                                            ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122531 =
                                                                                              ::x10::util::Team::FMGL(state__get)();
                                                                                            
                                                                                            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                                            x10_long idx__122530 =
                                                                                              ((x10_long)(teamidcopy));
                                                                                            ::x10::util::Team__LocalTeamState* ret__122532;
                                                                                            
                                                                                            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                                            ret__122532 =
                                                                                              ::x10aux::nullCheck(::x10aux::nullCheck(this__122531)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                                                                idx__122530);
                                                                                            ret__122532;
                                                                                        }))
                                                                                        )->FMGL(local_dst));
            
            //#line 882 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            if (((childVal->FMGL(value)) < (::x10aux::nullCheck(ldi)->x10::lang::template Rail< ::x10::util::Team__DoubleIdx >::__apply(
                                              ((x10_long)0ll))->FMGL(value))))
            {
                
                //#line 883 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                ::x10aux::nullCheck(ldi)->x10::lang::template Rail< ::x10::util::Team__DoubleIdx >::__set(
                  ((x10_long)0ll), childVal);
            }
            
            //#line 884 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                    ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122535 =
                                      ::x10::util::Team::FMGL(state__get)();
                                    
                                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                    x10_long idx__122534 =
                                      ((x10_long)(teamidcopy));
                                    ::x10::util::Team__LocalTeamState* ret__122536;
                                    
                                    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                    ret__122536 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122535)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                    idx__122534);
                                    ret__122536;
                                }))
                                )->FMGL(dstLock))->unlock();
        }
        catch (::x10::lang::CheckedThrowable* __exc3156) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc3156)) {
                ::x10::lang::Error* __lowerer__var__1__ =
                  static_cast< ::x10::lang::Error*>(__exc3156);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__1__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__2__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc3156);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__2__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    x10_int teamidcopy;
    ::x10::util::Team__DoubleIdx childVal;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->teamidcopy);
        buf.write(this->childVal);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_Team__LocalTeamState__closure__7<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_util_Team__LocalTeamState__closure__7<TPMGL(T) > >();
        buf.record_reference(storage);
        x10_int that_teamidcopy = buf.read<x10_int>();
        ::x10::util::Team__DoubleIdx that_childVal = buf.read< ::x10::util::Team__DoubleIdx>();
        x10_util_Team__LocalTeamState__closure__7<TPMGL(T) >* this_ = new (storage) x10_util_Team__LocalTeamState__closure__7<TPMGL(T) >(that_teamidcopy, that_childVal);
        return this_;
    }
    
    x10_util_Team__LocalTeamState__closure__7(x10_int teamidcopy, ::x10::util::Team__DoubleIdx childVal) : teamidcopy(teamidcopy), childVal(childVal) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10:879-885";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_util_Team__LocalTeamState__closure__7<TPMGL(T) > >x10_util_Team__LocalTeamState__closure__7<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_Team__LocalTeamState__closure__7<TPMGL(T) >::__apply, &x10_util_Team__LocalTeamState__closure__7<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_util_Team__LocalTeamState__closure__7<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_util_Team__LocalTeamState__closure__7<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_Team__LocalTeamState__closure__7<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_Team__LocalTeamState__closure__7<TPMGL(T) >::_deserialize);
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_Team__LocalTeamState__closure__7<TPMGL(T) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_util_Team__LocalTeamState__closure__7<TPMGL(T) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__7_CLOSURE
#ifndef X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__8_CLOSURE
#define X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__8_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_util_Team__LocalTeamState__closure__8 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_util_Team__LocalTeamState__closure__8<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 893 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            if ((!(::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                           ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122539 =
                                             ::x10::util::Team::FMGL(state__get)();
                                           
                                           //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                           x10_long idx__122538 =
                                             ((x10_long)(teamidcopy));
                                           ::x10::util::Team__LocalTeamState* ret__122540;
                                           
                                           //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                           ret__122540 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122539)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                           idx__122538);
                                           ret__122540;
                                       }))
                                       )->FMGL(phase))->x10::util::concurrent::AtomicInteger::compareAndSet(
                     ((x10_int)2), ((x10_int)3))) && !(::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                                               
                                                                               //#line 894 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                                                                               ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122543 =
                                                                                 ::x10::util::Team::FMGL(state__get)();
                                                                               
                                                                               //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                               x10_long idx__122542 =
                                                                                 ((x10_long)(teamidcopy));
                                                                               ::x10::util::Team__LocalTeamState* ret__122544;
                                                                               
                                                                               //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                               ret__122544 =
                                                                                 ::x10aux::nullCheck(::x10aux::nullCheck(this__122543)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                                                   idx__122542);
                                                                               ret__122544;
                                                                           }))
                                                                           )->FMGL(phase))->x10::util::concurrent::AtomicInteger::compareAndSet(
                                                         ((x10_int)3),
                                                         ((x10_int)4)))))
            {
                
                //#line 895 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                if (false) {
                    
                    //#line 896 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                    while ((!(::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                      ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122547 =
                                                        ::x10::util::Team::FMGL(state__get)();
                                                      
                                                      //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                      x10_long idx__122546 =
                                                        ((x10_long)(teamidcopy));
                                                      ::x10::util::Team__LocalTeamState* ret__122548;
                                                      
                                                      //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                      ret__122548 =
                                                        ::x10aux::nullCheck(::x10aux::nullCheck(this__122547)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                          idx__122546);
                                                      ret__122548;
                                                  }))
                                                  )->FMGL(phase))->x10::util::concurrent::AtomicInteger::compareAndSet(
                                ((x10_int)2), ((x10_int)3))) &&
                           !(::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                     
                                                     //#line 897 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                                                     ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122551 =
                                                       ::x10::util::Team::FMGL(state__get)();
                                                     
                                                     //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                     x10_long idx__122550 =
                                                       ((x10_long)(teamidcopy));
                                                     ::x10::util::Team__LocalTeamState* ret__122552;
                                                     
                                                     //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                     ret__122552 =
                                                       ::x10aux::nullCheck(::x10aux::nullCheck(this__122551)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                         idx__122550);
                                                     ret__122552;
                                                 }))
                                                 )->FMGL(phase))->x10::util::concurrent::AtomicInteger::compareAndSet(
                               ((x10_int)3), ((x10_int)4)))))
                    {
                        
                        //#line 898 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                        ::x10::lang::Runtime::probe();
                    }
                    
                } else {
                    
                    //#line 1559 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
                    {
                        
                        //#line 1560 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        ::x10::lang::Runtime::FMGL(pool__get)()->increase();
                    }
                    
                    //#line 902 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                    while ((!(::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                      ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122557 =
                                                        ::x10::util::Team::FMGL(state__get)();
                                                      
                                                      //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                      x10_long idx__122556 =
                                                        ((x10_long)(teamidcopy));
                                                      ::x10::util::Team__LocalTeamState* ret__122558;
                                                      
                                                      //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                      ret__122558 =
                                                        ::x10aux::nullCheck(::x10aux::nullCheck(this__122557)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                          idx__122556);
                                                      ret__122558;
                                                  }))
                                                  )->FMGL(phase))->x10::util::concurrent::AtomicInteger::compareAndSet(
                                ((x10_int)2), ((x10_int)3))) &&
                           !(::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                     
                                                     //#line 903 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                                                     ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122561 =
                                                       ::x10::util::Team::FMGL(state__get)();
                                                     
                                                     //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                     x10_long idx__122560 =
                                                       ((x10_long)(teamidcopy));
                                                     ::x10::util::Team__LocalTeamState* ret__122562;
                                                     
                                                     //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                     ret__122562 =
                                                       ::x10aux::nullCheck(::x10aux::nullCheck(this__122561)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                         idx__122560);
                                                     ret__122562;
                                                 }))
                                                 )->FMGL(phase))->x10::util::concurrent::AtomicInteger::compareAndSet(
                               ((x10_int)3), ((x10_int)4)))))
                    {
                        
                        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                        x10_boolean ret__122566;
                        goto __ret__122567; __ret__122567: {
                        {
                            
                            //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                            try {
                                
                                //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                                ::x10::lang::Thread::sleep(
                                  ((x10_long)0ll));
                                
                                //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                                ret__122566 = true;
                                goto __ret__122567_end_;
                            }
                            catch (::x10::lang::CheckedThrowable* __exc3159) {
                                if (::x10aux::instanceof< ::x10::lang::InterruptedException*>(__exc3159)) {
                                    ::x10::lang::InterruptedException* e__122565 =
                                      static_cast< ::x10::lang::InterruptedException*>(__exc3159);
                                    {
                                        
                                        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                                        ret__122566 = false;
                                        goto __ret__122567_end_;
                                    }
                                } else
                                throw;
                            }
                        }goto __ret__122567_end_; __ret__122567_end_: ;
                        }
                        ret__122566;
                        }
                        
                    
                    //#line 1566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
                    {
                        
                        //#line 1567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        ::x10::lang::Runtime::FMGL(pool__get)()->decrease(
                          ((x10_int)1));
                    }
                    }
                    
                }
                
            }
            catch (::x10::lang::CheckedThrowable* __exc3160) {
                if (::x10aux::instanceof< ::x10::lang::Error*>(__exc3160)) {
                    ::x10::lang::Error* __lowerer__var__1__ =
                      static_cast< ::x10::lang::Error*>(__exc3160);
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__1__));
                    }
                } else
                if (true) {
                    ::x10::lang::CheckedThrowable* __lowerer__var__2__ =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc3160);
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                       __lowerer__var__2__)));
                    }
                } else
                throw;
            }
        }
        
        // captured environment
        x10_int teamidcopy;
        
        ::x10aux::serialization_id_t _get_serialization_id() {
            return _serialization_id;
        }
        
        ::x10aux::serialization_id_t _get_network_id() {
            return _network_id;
        }
        
        void _serialize_body(::x10aux::serialization_buffer &buf) {
            buf.write(this->teamidcopy);
        }
        
        static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
            x10_util_Team__LocalTeamState__closure__8<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_util_Team__LocalTeamState__closure__8<TPMGL(T) > >();
            buf.record_reference(storage);
            x10_int that_teamidcopy = buf.read<x10_int>();
            x10_util_Team__LocalTeamState__closure__8<TPMGL(T) >* this_ = new (storage) x10_util_Team__LocalTeamState__closure__8<TPMGL(T) >(that_teamidcopy);
            return this_;
        }
        
        x10_util_Team__LocalTeamState__closure__8(x10_int teamidcopy) : teamidcopy(teamidcopy) { }
        
        static const ::x10aux::serialization_id_t _serialization_id;
        
        static const ::x10aux::serialization_id_t _network_id;
        
        static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
        virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
        
        const char* toNativeString() {
            return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10:891-909";
        }
    
    };
    
    template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_util_Team__LocalTeamState__closure__8<TPMGL(T) > >x10_util_Team__LocalTeamState__closure__8<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_Team__LocalTeamState__closure__8<TPMGL(T) >::__apply, &x10_util_Team__LocalTeamState__closure__8<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
    template<class TPMGL(T)> ::x10aux::itable_entry x10_util_Team__LocalTeamState__closure__8<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_util_Team__LocalTeamState__closure__8<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};
    
    template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_Team__LocalTeamState__closure__8<TPMGL(T) >::_serialization_id = 
        ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_Team__LocalTeamState__closure__8<TPMGL(T) >::_deserialize);
    template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_Team__LocalTeamState__closure__8<TPMGL(T) >::_network_id = 
        ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_util_Team__LocalTeamState__closure__8<TPMGL(T) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);
    
    #endif // X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__8_CLOSURE
    #ifndef X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__9_CLOSURE
#define X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__9_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_util_Team__LocalTeamState__closure__9 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_util_Team__LocalTeamState__closure__9<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            {
                
                //#line 937 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                ::x10::lang::Runtime::ensureNotInAtomic();
                ::x10::lang::FinishState* x10____var56 = ::x10::lang::Runtime::startFinish(
                                                           ::x10::compiler::Pragma::FMGL(FINISH_ASYNC__get)());
                {
                    ::x10::lang::CheckedThrowable* throwable__122961 =
                      ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                    try {
                        try {
                            {
                                
                                //#line 939 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                                ::x10::lang::Rail< void >::asyncCopy< TPMGL(T) >(
                                  gr, dst_off, ::x10aux::class_cast< ::x10::lang::Rail< TPMGL(T) >*>(::x10aux::nullCheck((__extension__ ({
                                                                                                         ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122581 =
                                                                                                           ::x10::util::Team::FMGL(state__get)();
                                                                                                         
                                                                                                         //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                                                         x10_long idx__122580 =
                                                                                                           ((x10_long)(teamidcopy));
                                                                                                         ::x10::util::Team__LocalTeamState* ret__122582;
                                                                                                         
                                                                                                         //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                                                         ret__122582 =
                                                                                                           ::x10aux::nullCheck(::x10aux::nullCheck(this__122581)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                                                                             idx__122580);
                                                                                                         ret__122582;
                                                                                                     }))
                                                                                                     )->FMGL(local_dst)),
                                  ::x10aux::nullCheck((__extension__ ({
                                      ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122585 =
                                        ::x10::util::Team::FMGL(state__get)();
                                      
                                      //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                      x10_long idx__122584 =
                                        ((x10_long)(teamidcopy));
                                      ::x10::util::Team__LocalTeamState* ret__122586;
                                      
                                      //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                      ret__122586 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122585)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                      idx__122584);
                                      ret__122586;
                                  }))
                                  )->FMGL(local_dst_off),
                                  ((::x10aux::nullCheck((__extension__ ({
                                        ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122589 =
                                          ::x10::util::Team::FMGL(state__get)();
                                        
                                        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                        x10_long idx__122588 =
                                          ((x10_long)(teamidcopy));
                                        ::x10::util::Team__LocalTeamState* ret__122590;
                                        
                                        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                        ret__122590 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122589)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                        idx__122588);
                                        ret__122590;
                                    }))
                                    )->FMGL(local_count)) * (::x10aux::nullCheck((__extension__ ({
                                                                 ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122593 =
                                                                   ::x10::util::Team::FMGL(state__get)();
                                                                 
                                                                 //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                 x10_long idx__122592 =
                                                                   ((x10_long)(teamidcopy));
                                                                 ::x10::util::Team__LocalTeamState* ret__122594;
                                                                 
                                                                 //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                 ret__122594 =
                                                                   ::x10aux::nullCheck(::x10aux::nullCheck(this__122593)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                                     idx__122592);
                                                                 ret__122594;
                                                             }))
                                                             )->FMGL(myIndex))));
                                
                                //#line 941 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                                ::x10::lang::Rail< void >::asyncCopy< TPMGL(T) >(
                                  gr, ((dst_off) + (((::x10aux::nullCheck((__extension__ ({
                                                          ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122597 =
                                                            ::x10::util::Team::FMGL(state__get)();
                                                          
                                                          //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                          x10_long idx__122596 =
                                                            ((x10_long)(teamidcopy));
                                                          ::x10::util::Team__LocalTeamState* ret__122598;
                                                          
                                                          //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                          ret__122598 =
                                                            ::x10aux::nullCheck(::x10aux::nullCheck(this__122597)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                              idx__122596);
                                                          ret__122598;
                                                      }))
                                                      )->FMGL(local_count)) * (((::x10aux::nullCheck((__extension__ ({
                                                                                     ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122601 =
                                                                                       ::x10::util::Team::FMGL(state__get)();
                                                                                     
                                                                                     //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                                     x10_long idx__122600 =
                                                                                       ((x10_long)(teamidcopy));
                                                                                     ::x10::util::Team__LocalTeamState* ret__122602;
                                                                                     
                                                                                     //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                                     ret__122602 =
                                                                                       ::x10aux::nullCheck(::x10aux::nullCheck(this__122601)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                                                         idx__122600);
                                                                                     ret__122602;
                                                                                 }))
                                                                                 )->FMGL(local_grandchildren)) + (((x10_long)1ll))))))),
                                  ::x10aux::class_cast< ::x10::lang::Rail< TPMGL(T) >*>(::x10aux::nullCheck((__extension__ ({
                                                                                            ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122605 =
                                                                                              ::x10::util::Team::FMGL(state__get)();
                                                                                            
                                                                                            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                                            x10_long idx__122604 =
                                                                                              ((x10_long)(teamidcopy));
                                                                                            ::x10::util::Team__LocalTeamState* ret__122606;
                                                                                            
                                                                                            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                                            ret__122606 =
                                                                                              ::x10aux::nullCheck(::x10aux::nullCheck(this__122605)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                                                                idx__122604);
                                                                                            ret__122606;
                                                                                        }))
                                                                                        )->FMGL(local_dst)),
                                  ::x10aux::nullCheck((__extension__ ({
                                      ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122609 =
                                        ::x10::util::Team::FMGL(state__get)();
                                      
                                      //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                      x10_long idx__122608 =
                                        ((x10_long)(teamidcopy));
                                      ::x10::util::Team__LocalTeamState* ret__122610;
                                      
                                      //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                      ret__122610 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122609)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                      idx__122608);
                                      ret__122610;
                                  }))
                                  )->FMGL(local_dst_off),
                                  ::x10aux::nullCheck((__extension__ ({
                                      ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122613 =
                                        ::x10::util::Team::FMGL(state__get)();
                                      
                                      //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                      x10_long idx__122612 =
                                        ((x10_long)(teamidcopy));
                                      ::x10::util::Team__LocalTeamState* ret__122614;
                                      
                                      //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                      ret__122614 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122613)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                      idx__122612);
                                      ret__122614;
                                  }))
                                  )->FMGL(local_count));
                            }
                        }
                        catch (::x10::lang::CheckedThrowable* __exc3164) {
                            if (true) {
                                ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                                  static_cast< ::x10::lang::CheckedThrowable*>(__exc3164);
                                {
                                    ::x10::lang::Runtime::pushException(
                                      __lowerer__var__0__);
                                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make()));
                                }
                            } else
                            throw;
                        }
                        ::x10::compiler::Finalization::plausibleThrow();
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3165) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* formal__122962 =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3165);
                            {
                                throwable__122961 = formal__122962;
                            }
                        } else
                        throw;
                    }
                    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                  throwable__122961)))
                    {
                        if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122961))
                        {
                            ::x10aux::throwException(::x10aux::nullCheck(throwable__122961));
                        }
                        
                    }
                    if (true) {
                        ::x10::lang::Runtime::stopFinish(
                          x10____var56);
                    }
                    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                  throwable__122961)))
                    {
                        if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122961)))
                        {
                            ::x10aux::throwException(::x10aux::nullCheck(throwable__122961));
                        }
                        
                    }
                    
                }
            }
        }
        catch (::x10::lang::CheckedThrowable* __exc3166) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc3166)) {
                ::x10::lang::Error* __lowerer__var__0__ =
                  static_cast< ::x10::lang::Error*>(__exc3166);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc3166);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::GlobalRail<TPMGL(T)> gr;
    x10_long dst_off;
    x10_int teamidcopy;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->gr);
        buf.write(this->dst_off);
        buf.write(this->teamidcopy);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_Team__LocalTeamState__closure__9<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_util_Team__LocalTeamState__closure__9<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::GlobalRail<TPMGL(T)> that_gr = buf.read< ::x10::lang::GlobalRail<TPMGL(T)> >();
        x10_long that_dst_off = buf.read<x10_long>();
        x10_int that_teamidcopy = buf.read<x10_int>();
        x10_util_Team__LocalTeamState__closure__9<TPMGL(T) >* this_ = new (storage) x10_util_Team__LocalTeamState__closure__9<TPMGL(T) >(that_gr, that_dst_off, that_teamidcopy);
        return this_;
    }
    
    x10_util_Team__LocalTeamState__closure__9(::x10::lang::GlobalRail<TPMGL(T)> gr, x10_long dst_off, x10_int teamidcopy) : gr(gr), dst_off(dst_off), teamidcopy(teamidcopy) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10:936-943";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_util_Team__LocalTeamState__closure__9<TPMGL(T) > >x10_util_Team__LocalTeamState__closure__9<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_Team__LocalTeamState__closure__9<TPMGL(T) >::__apply, &x10_util_Team__LocalTeamState__closure__9<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_util_Team__LocalTeamState__closure__9<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_util_Team__LocalTeamState__closure__9<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_Team__LocalTeamState__closure__9<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_Team__LocalTeamState__closure__9<TPMGL(T) >::_deserialize);
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_Team__LocalTeamState__closure__9<TPMGL(T) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_util_Team__LocalTeamState__closure__9<TPMGL(T) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__9_CLOSURE
#ifndef X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__10_CLOSURE
#define X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__10_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_util_Team__LocalTeamState__closure__10 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_util_Team__LocalTeamState__closure__10<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            {
                
                //#line 946 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                ::x10::lang::Runtime::ensureNotInAtomic();
                ::x10::lang::FinishState* x10____var57 = ::x10::lang::Runtime::startFinish(
                                                           ::x10::compiler::Pragma::FMGL(FINISH_ASYNC__get)());
                {
                    ::x10::lang::CheckedThrowable* throwable__122964 =
                      ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                    try {
                        try {
                            {
                                
                                //#line 948 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                                ::x10::lang::Rail< void >::asyncCopy< TPMGL(T) >(
                                  gr, dst_off, ::x10aux::class_cast< ::x10::lang::Rail< TPMGL(T) >*>(::x10aux::nullCheck((__extension__ ({
                                                                                                         ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122617 =
                                                                                                           ::x10::util::Team::FMGL(state__get)();
                                                                                                         
                                                                                                         //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                                                         x10_long idx__122616 =
                                                                                                           ((x10_long)(teamidcopy));
                                                                                                         ::x10::util::Team__LocalTeamState* ret__122618;
                                                                                                         
                                                                                                         //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                                                         ret__122618 =
                                                                                                           ::x10aux::nullCheck(::x10aux::nullCheck(this__122617)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                                                                             idx__122616);
                                                                                                         ret__122618;
                                                                                                     }))
                                                                                                     )->FMGL(local_dst)),
                                  ::x10aux::nullCheck((__extension__ ({
                                      ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122621 =
                                        ::x10::util::Team::FMGL(state__get)();
                                      
                                      //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                      x10_long idx__122620 =
                                        ((x10_long)(teamidcopy));
                                      ::x10::util::Team__LocalTeamState* ret__122622;
                                      
                                      //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                      ret__122622 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122621)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                      idx__122620);
                                      ret__122622;
                                  }))
                                  )->FMGL(local_dst_off),
                                  ::x10aux::nullCheck((__extension__ ({
                                      ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122625 =
                                        ::x10::util::Team::FMGL(state__get)();
                                      
                                      //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                      x10_long idx__122624 =
                                        ((x10_long)(teamidcopy));
                                      ::x10::util::Team__LocalTeamState* ret__122626;
                                      
                                      //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                      ret__122626 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122625)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                      idx__122624);
                                      ret__122626;
                                  }))
                                  )->FMGL(local_count));
                                
                                //#line 950 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                                ::x10::lang::Rail< void >::asyncCopy< TPMGL(T) >(
                                  gr, dst_off, ::x10aux::class_cast< ::x10::lang::Rail< TPMGL(T) >*>(::x10aux::nullCheck((__extension__ ({
                                                                                                         ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122629 =
                                                                                                           ::x10::util::Team::FMGL(state__get)();
                                                                                                         
                                                                                                         //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                                                         x10_long idx__122628 =
                                                                                                           ((x10_long)(teamidcopy));
                                                                                                         ::x10::util::Team__LocalTeamState* ret__122630;
                                                                                                         
                                                                                                         //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                                                         ret__122630 =
                                                                                                           ::x10aux::nullCheck(::x10aux::nullCheck(this__122629)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                                                                             idx__122628);
                                                                                                         ret__122630;
                                                                                                     }))
                                                                                                     )->FMGL(local_dst)),
                                  ::x10aux::nullCheck((__extension__ ({
                                      ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122633 =
                                        ::x10::util::Team::FMGL(state__get)();
                                      
                                      //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                      x10_long idx__122632 =
                                        ((x10_long)(teamidcopy));
                                      ::x10::util::Team__LocalTeamState* ret__122634;
                                      
                                      //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                      ret__122634 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122633)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                      idx__122632);
                                      ret__122634;
                                  }))
                                  )->FMGL(local_dst_off),
                                  ::x10aux::nullCheck((__extension__ ({
                                      ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122637 =
                                        ::x10::util::Team::FMGL(state__get)();
                                      
                                      //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                      x10_long idx__122636 =
                                        ((x10_long)(teamidcopy));
                                      ::x10::util::Team__LocalTeamState* ret__122638;
                                      
                                      //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                      ret__122638 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122637)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                      idx__122636);
                                      ret__122638;
                                  }))
                                  )->FMGL(local_count));
                            }
                        }
                        catch (::x10::lang::CheckedThrowable* __exc3167) {
                            if (true) {
                                ::x10::lang::CheckedThrowable* __lowerer__var__2__ =
                                  static_cast< ::x10::lang::CheckedThrowable*>(__exc3167);
                                {
                                    ::x10::lang::Runtime::pushException(
                                      __lowerer__var__2__);
                                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make()));
                                }
                            } else
                            throw;
                        }
                        ::x10::compiler::Finalization::plausibleThrow();
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3168) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* formal__122965 =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3168);
                            {
                                throwable__122964 = formal__122965;
                            }
                        } else
                        throw;
                    }
                    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                  throwable__122964)))
                    {
                        if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122964))
                        {
                            ::x10aux::throwException(::x10aux::nullCheck(throwable__122964));
                        }
                        
                    }
                    if (true) {
                        ::x10::lang::Runtime::stopFinish(
                          x10____var57);
                    }
                    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                  throwable__122964)))
                    {
                        if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122964)))
                        {
                            ::x10aux::throwException(::x10aux::nullCheck(throwable__122964));
                        }
                        
                    }
                    
                }
            }
        }
        catch (::x10::lang::CheckedThrowable* __exc3169) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc3169)) {
                ::x10::lang::Error* __lowerer__var__2__ =
                  static_cast< ::x10::lang::Error*>(__exc3169);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__2__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__3__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc3169);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__3__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::GlobalRail<TPMGL(T)> gr;
    x10_long dst_off;
    x10_int teamidcopy;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->gr);
        buf.write(this->dst_off);
        buf.write(this->teamidcopy);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_Team__LocalTeamState__closure__10<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_util_Team__LocalTeamState__closure__10<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::GlobalRail<TPMGL(T)> that_gr = buf.read< ::x10::lang::GlobalRail<TPMGL(T)> >();
        x10_long that_dst_off = buf.read<x10_long>();
        x10_int that_teamidcopy = buf.read<x10_int>();
        x10_util_Team__LocalTeamState__closure__10<TPMGL(T) >* this_ = new (storage) x10_util_Team__LocalTeamState__closure__10<TPMGL(T) >(that_gr, that_dst_off, that_teamidcopy);
        return this_;
    }
    
    x10_util_Team__LocalTeamState__closure__10(::x10::lang::GlobalRail<TPMGL(T)> gr, x10_long dst_off, x10_int teamidcopy) : gr(gr), dst_off(dst_off), teamidcopy(teamidcopy) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10:945-952";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_util_Team__LocalTeamState__closure__10<TPMGL(T) > >x10_util_Team__LocalTeamState__closure__10<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_Team__LocalTeamState__closure__10<TPMGL(T) >::__apply, &x10_util_Team__LocalTeamState__closure__10<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_util_Team__LocalTeamState__closure__10<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_util_Team__LocalTeamState__closure__10<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_Team__LocalTeamState__closure__10<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_Team__LocalTeamState__closure__10<TPMGL(T) >::_deserialize);
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_Team__LocalTeamState__closure__10<TPMGL(T) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_util_Team__LocalTeamState__closure__10<TPMGL(T) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__10_CLOSURE
#ifndef X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__11_CLOSURE
#define X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__11_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_util_Team__LocalTeamState__closure__11 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_util_Team__LocalTeamState__closure__11<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            {
                
                //#line 962 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                ::x10::lang::Runtime::ensureNotInAtomic();
                ::x10::lang::FinishState* x10____var59 = ::x10::lang::Runtime::startFinish(
                                                           ::x10::compiler::Pragma::FMGL(FINISH_ASYNC__get)());
                {
                    ::x10::lang::CheckedThrowable* throwable__122970 =
                      ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                    try {
                        try {
                            {
                                
                                //#line 963 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                                ::x10::lang::Rail< void >::asyncCopy< TPMGL(T) >(
                                  gr, dst_off, ::x10aux::class_cast< ::x10::lang::Rail< TPMGL(T) >*>(::x10aux::nullCheck((__extension__ ({
                                                                                                         ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122641 =
                                                                                                           ::x10::util::Team::FMGL(state__get)();
                                                                                                         
                                                                                                         //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                                                         x10_long idx__122640 =
                                                                                                           ((x10_long)(teamidcopy));
                                                                                                         ::x10::util::Team__LocalTeamState* ret__122642;
                                                                                                         
                                                                                                         //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                                                         ret__122642 =
                                                                                                           ::x10aux::nullCheck(::x10aux::nullCheck(this__122641)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                                                                             idx__122640);
                                                                                                         ret__122642;
                                                                                                     }))
                                                                                                     )->FMGL(local_dst)),
                                  ::x10aux::nullCheck((__extension__ ({
                                      ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122645 =
                                        ::x10::util::Team::FMGL(state__get)();
                                      
                                      //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                      x10_long idx__122644 =
                                        ((x10_long)(teamidcopy));
                                      ::x10::util::Team__LocalTeamState* ret__122646;
                                      
                                      //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                      ret__122646 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122645)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                      idx__122644);
                                      ret__122646;
                                  }))
                                  )->FMGL(local_dst_off),
                                  ::x10aux::nullCheck((__extension__ ({
                                      ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122649 =
                                        ::x10::util::Team::FMGL(state__get)();
                                      
                                      //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                      x10_long idx__122648 =
                                        ((x10_long)(teamidcopy));
                                      ::x10::util::Team__LocalTeamState* ret__122650;
                                      
                                      //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                      ret__122650 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122649)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                      idx__122648);
                                      ret__122650;
                                  }))
                                  )->FMGL(local_count));
                            }
                        }
                        catch (::x10::lang::CheckedThrowable* __exc3172) {
                            if (true) {
                                ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                                  static_cast< ::x10::lang::CheckedThrowable*>(__exc3172);
                                {
                                    ::x10::lang::Runtime::pushException(
                                      __lowerer__var__0__);
                                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make()));
                                }
                            } else
                            throw;
                        }
                        ::x10::compiler::Finalization::plausibleThrow();
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3173) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* formal__122971 =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3173);
                            {
                                throwable__122970 = formal__122971;
                            }
                        } else
                        throw;
                    }
                    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                  throwable__122970)))
                    {
                        if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122970))
                        {
                            ::x10aux::throwException(::x10aux::nullCheck(throwable__122970));
                        }
                        
                    }
                    if (true) {
                        ::x10::lang::Runtime::stopFinish(
                          x10____var59);
                    }
                    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                  throwable__122970)))
                    {
                        if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122970)))
                        {
                            ::x10aux::throwException(::x10aux::nullCheck(throwable__122970));
                        }
                        
                    }
                    
                }
            }
        }
        catch (::x10::lang::CheckedThrowable* __exc3174) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc3174)) {
                ::x10::lang::Error* __lowerer__var__0__ =
                  static_cast< ::x10::lang::Error*>(__exc3174);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc3174);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::GlobalRail<TPMGL(T)> gr;
    x10_long dst_off;
    x10_int teamidcopy;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->gr);
        buf.write(this->dst_off);
        buf.write(this->teamidcopy);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_Team__LocalTeamState__closure__11<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_util_Team__LocalTeamState__closure__11<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::GlobalRail<TPMGL(T)> that_gr = buf.read< ::x10::lang::GlobalRail<TPMGL(T)> >();
        x10_long that_dst_off = buf.read<x10_long>();
        x10_int that_teamidcopy = buf.read<x10_int>();
        x10_util_Team__LocalTeamState__closure__11<TPMGL(T) >* this_ = new (storage) x10_util_Team__LocalTeamState__closure__11<TPMGL(T) >(that_gr, that_dst_off, that_teamidcopy);
        return this_;
    }
    
    x10_util_Team__LocalTeamState__closure__11(::x10::lang::GlobalRail<TPMGL(T)> gr, x10_long dst_off, x10_int teamidcopy) : gr(gr), dst_off(dst_off), teamidcopy(teamidcopy) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10:960-965";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_util_Team__LocalTeamState__closure__11<TPMGL(T) > >x10_util_Team__LocalTeamState__closure__11<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_Team__LocalTeamState__closure__11<TPMGL(T) >::__apply, &x10_util_Team__LocalTeamState__closure__11<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_util_Team__LocalTeamState__closure__11<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_util_Team__LocalTeamState__closure__11<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_Team__LocalTeamState__closure__11<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_Team__LocalTeamState__closure__11<TPMGL(T) >::_deserialize);
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_Team__LocalTeamState__closure__11<TPMGL(T) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_util_Team__LocalTeamState__closure__11<TPMGL(T) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__11_CLOSURE
#ifndef X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__12_CLOSURE
#define X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__12_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_util_Team__LocalTeamState__closure__12 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_util_Team__LocalTeamState__closure__12<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            {
                
                //#line 969 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                ::x10::lang::Runtime::ensureNotInAtomic();
                ::x10::lang::FinishState* x10____var60 = ::x10::lang::Runtime::startFinish(
                                                           ::x10::compiler::Pragma::FMGL(FINISH_ASYNC__get)());
                {
                    ::x10::lang::CheckedThrowable* throwable__122973 =
                      ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                    try {
                        try {
                            {
                                
                                //#line 970 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                                ::x10::lang::Rail< void >::asyncCopy< TPMGL(T) >(
                                  gr, dst_off, ::x10aux::class_cast< ::x10::lang::Rail< TPMGL(T) >*>(::x10aux::nullCheck((__extension__ ({
                                                                                                         ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122653 =
                                                                                                           ::x10::util::Team::FMGL(state__get)();
                                                                                                         
                                                                                                         //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                                                         x10_long idx__122652 =
                                                                                                           ((x10_long)(teamidcopy));
                                                                                                         ::x10::util::Team__LocalTeamState* ret__122654;
                                                                                                         
                                                                                                         //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                                                                         ret__122654 =
                                                                                                           ::x10aux::nullCheck(::x10aux::nullCheck(this__122653)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                                                                             idx__122652);
                                                                                                         ret__122654;
                                                                                                     }))
                                                                                                     )->FMGL(local_dst)),
                                  ::x10aux::nullCheck((__extension__ ({
                                      ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122657 =
                                        ::x10::util::Team::FMGL(state__get)();
                                      
                                      //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                      x10_long idx__122656 =
                                        ((x10_long)(teamidcopy));
                                      ::x10::util::Team__LocalTeamState* ret__122658;
                                      
                                      //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                      ret__122658 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122657)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                      idx__122656);
                                      ret__122658;
                                  }))
                                  )->FMGL(local_dst_off),
                                  ::x10aux::nullCheck((__extension__ ({
                                      ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122661 =
                                        ::x10::util::Team::FMGL(state__get)();
                                      
                                      //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                      x10_long idx__122660 =
                                        ((x10_long)(teamidcopy));
                                      ::x10::util::Team__LocalTeamState* ret__122662;
                                      
                                      //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                      ret__122662 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122661)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                      idx__122660);
                                      ret__122662;
                                  }))
                                  )->FMGL(local_count));
                            }
                        }
                        catch (::x10::lang::CheckedThrowable* __exc3175) {
                            if (true) {
                                ::x10::lang::CheckedThrowable* __lowerer__var__2__ =
                                  static_cast< ::x10::lang::CheckedThrowable*>(__exc3175);
                                {
                                    ::x10::lang::Runtime::pushException(
                                      __lowerer__var__2__);
                                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make()));
                                }
                            } else
                            throw;
                        }
                        ::x10::compiler::Finalization::plausibleThrow();
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3176) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* formal__122974 =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3176);
                            {
                                throwable__122973 = formal__122974;
                            }
                        } else
                        throw;
                    }
                    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                  throwable__122973)))
                    {
                        if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122973))
                        {
                            ::x10aux::throwException(::x10aux::nullCheck(throwable__122973));
                        }
                        
                    }
                    if (true) {
                        ::x10::lang::Runtime::stopFinish(
                          x10____var60);
                    }
                    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                  throwable__122973)))
                    {
                        if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122973)))
                        {
                            ::x10aux::throwException(::x10aux::nullCheck(throwable__122973));
                        }
                        
                    }
                    
                }
            }
        }
        catch (::x10::lang::CheckedThrowable* __exc3177) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc3177)) {
                ::x10::lang::Error* __lowerer__var__2__ =
                  static_cast< ::x10::lang::Error*>(__exc3177);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__2__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__3__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc3177);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__3__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::GlobalRail<TPMGL(T)> gr;
    x10_long dst_off;
    x10_int teamidcopy;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->gr);
        buf.write(this->dst_off);
        buf.write(this->teamidcopy);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_Team__LocalTeamState__closure__12<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_util_Team__LocalTeamState__closure__12<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::GlobalRail<TPMGL(T)> that_gr = buf.read< ::x10::lang::GlobalRail<TPMGL(T)> >();
        x10_long that_dst_off = buf.read<x10_long>();
        x10_int that_teamidcopy = buf.read<x10_int>();
        x10_util_Team__LocalTeamState__closure__12<TPMGL(T) >* this_ = new (storage) x10_util_Team__LocalTeamState__closure__12<TPMGL(T) >(that_gr, that_dst_off, that_teamidcopy);
        return this_;
    }
    
    x10_util_Team__LocalTeamState__closure__12(::x10::lang::GlobalRail<TPMGL(T)> gr, x10_long dst_off, x10_int teamidcopy) : gr(gr), dst_off(dst_off), teamidcopy(teamidcopy) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10:967-972";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_util_Team__LocalTeamState__closure__12<TPMGL(T) > >x10_util_Team__LocalTeamState__closure__12<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_Team__LocalTeamState__closure__12<TPMGL(T) >::__apply, &x10_util_Team__LocalTeamState__closure__12<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_util_Team__LocalTeamState__closure__12<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_util_Team__LocalTeamState__closure__12<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_Team__LocalTeamState__closure__12<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_Team__LocalTeamState__closure__12<TPMGL(T) >::_deserialize);
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_Team__LocalTeamState__closure__12<TPMGL(T) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_util_Team__LocalTeamState__closure__12<TPMGL(T) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__12_CLOSURE
#ifndef X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__14_CLOSURE
#define X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__14_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_util_Team__LocalTeamState__closure__14 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_util_Team__LocalTeamState__closure__14<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
         
        }
        catch (::x10::lang::CheckedThrowable* __exc3180) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc3180)) {
                ::x10::lang::Error* __lowerer__var__0__ = static_cast< ::x10::lang::Error*>(__exc3180);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc3180);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_Team__LocalTeamState__closure__14<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_util_Team__LocalTeamState__closure__14<TPMGL(T) > >();
        buf.record_reference(storage);
        x10_util_Team__LocalTeamState__closure__14<TPMGL(T) >* this_ = new (storage) x10_util_Team__LocalTeamState__closure__14<TPMGL(T) >();
        return this_;
    }
    
    x10_util_Team__LocalTeamState__closure__14() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10:993";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_util_Team__LocalTeamState__closure__14<TPMGL(T) > >x10_util_Team__LocalTeamState__closure__14<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_Team__LocalTeamState__closure__14<TPMGL(T) >::__apply, &x10_util_Team__LocalTeamState__closure__14<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_util_Team__LocalTeamState__closure__14<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_util_Team__LocalTeamState__closure__14<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_Team__LocalTeamState__closure__14<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_Team__LocalTeamState__closure__14<TPMGL(T) >::_deserialize);
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_Team__LocalTeamState__closure__14<TPMGL(T) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_util_Team__LocalTeamState__closure__14<TPMGL(T) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__14_CLOSURE
#ifndef X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__13_CLOSURE
#define X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__13_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_util_Team__LocalTeamState__closure__13 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_util_Team__LocalTeamState__closure__13<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 993 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::runAsync(origPlace, reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_util_Team__LocalTeamState__closure__14<TPMGL(T)>)))x10_util_Team__LocalTeamState__closure__14<TPMGL(T)>())),
                                           ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            
            //#line 994 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            if (!(::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                          ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122665 =
                                            ::x10::util::Team::FMGL(state__get)();
                                          
                                          //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                          x10_long idx__122664 =
                                            ((x10_long)(teamidcopy));
                                          ::x10::util::Team__LocalTeamState* ret__122666;
                                          
                                          //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                          ret__122666 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122665)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                          idx__122664);
                                          ret__122666;
                                      }))
                                      )->FMGL(phase))->x10::util::concurrent::AtomicInteger::compareAndSet(
                    ((x10_int)4), ((x10_int)5)))) {
                
                //#line 995 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__130685 = ::x10aux::makeStringLit("ERROR root setting the first child "); strLit__130685; })), ::x10::lang::Place::_make(::x10aux::here)), (__extension__ ({ static ::x10::lang::String* strLit__130686 = ::x10aux::makeStringLit(":team"); strLit__130686; }))), teamidcopy), (__extension__ ({ static ::x10::lang::String* strLit__130687 = ::x10aux::makeStringLit(" to PHASE_DONE"); strLit__130687; })))))->c_str());
            } else {
             
            }
            
        }
        catch (::x10::lang::CheckedThrowable* __exc3181) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc3181)) {
                ::x10::lang::Error* __lowerer__var__0__ =
                  static_cast< ::x10::lang::Error*>(__exc3181);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc3181);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::Place origPlace;
    x10_int teamidcopy;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->origPlace);
        buf.write(this->teamidcopy);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_Team__LocalTeamState__closure__13<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_util_Team__LocalTeamState__closure__13<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::Place that_origPlace = buf.read< ::x10::lang::Place>();
        x10_int that_teamidcopy = buf.read<x10_int>();
        x10_util_Team__LocalTeamState__closure__13<TPMGL(T) >* this_ = new (storage) x10_util_Team__LocalTeamState__closure__13<TPMGL(T) >(that_origPlace, that_teamidcopy);
        return this_;
    }
    
    x10_util_Team__LocalTeamState__closure__13(::x10::lang::Place origPlace, x10_int teamidcopy) : origPlace(origPlace), teamidcopy(teamidcopy) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10:992-997";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_util_Team__LocalTeamState__closure__13<TPMGL(T) > >x10_util_Team__LocalTeamState__closure__13<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_Team__LocalTeamState__closure__13<TPMGL(T) >::__apply, &x10_util_Team__LocalTeamState__closure__13<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_util_Team__LocalTeamState__closure__13<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_util_Team__LocalTeamState__closure__13<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_Team__LocalTeamState__closure__13<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_Team__LocalTeamState__closure__13<TPMGL(T) >::_deserialize);
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_Team__LocalTeamState__closure__13<TPMGL(T) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_util_Team__LocalTeamState__closure__13<TPMGL(T) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__13_CLOSURE
#ifndef X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__16_CLOSURE
#define X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__16_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_util_Team__LocalTeamState__closure__16 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_util_Team__LocalTeamState__closure__16<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
         
        }
        catch (::x10::lang::CheckedThrowable* __exc3184) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc3184)) {
                ::x10::lang::Error* __lowerer__var__1__ = static_cast< ::x10::lang::Error*>(__exc3184);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__1__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__2__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc3184);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__2__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_Team__LocalTeamState__closure__16<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_util_Team__LocalTeamState__closure__16<TPMGL(T) > >();
        buf.record_reference(storage);
        x10_util_Team__LocalTeamState__closure__16<TPMGL(T) >* this_ = new (storage) x10_util_Team__LocalTeamState__closure__16<TPMGL(T) >();
        return this_;
    }
    
    x10_util_Team__LocalTeamState__closure__16() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10:1002";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_util_Team__LocalTeamState__closure__16<TPMGL(T) > >x10_util_Team__LocalTeamState__closure__16<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_Team__LocalTeamState__closure__16<TPMGL(T) >::__apply, &x10_util_Team__LocalTeamState__closure__16<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_util_Team__LocalTeamState__closure__16<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_util_Team__LocalTeamState__closure__16<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_Team__LocalTeamState__closure__16<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_Team__LocalTeamState__closure__16<TPMGL(T) >::_deserialize);
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_Team__LocalTeamState__closure__16<TPMGL(T) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_util_Team__LocalTeamState__closure__16<TPMGL(T) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__16_CLOSURE
#ifndef X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__15_CLOSURE
#define X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__15_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_util_Team__LocalTeamState__closure__15 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_util_Team__LocalTeamState__closure__15<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 1002 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::runAsync(origPlace, reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_util_Team__LocalTeamState__closure__16<TPMGL(T)>)))x10_util_Team__LocalTeamState__closure__16<TPMGL(T)>())),
                                           ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            
            //#line 1003 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            if (!(::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                          ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122669 =
                                            ::x10::util::Team::FMGL(state__get)();
                                          
                                          //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                          x10_long idx__122668 =
                                            ((x10_long)(teamidcopy));
                                          ::x10::util::Team__LocalTeamState* ret__122670;
                                          
                                          //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                          ret__122670 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122669)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                                                          idx__122668);
                                          ret__122670;
                                      }))
                                      )->FMGL(phase))->x10::util::concurrent::AtomicInteger::compareAndSet(
                    ((x10_int)4), ((x10_int)5)))) {
                
                //#line 1004 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__130689 = ::x10aux::makeStringLit("ERROR root setting the second child "); strLit__130689; })), ::x10::lang::Place::_make(::x10aux::here)), (__extension__ ({ static ::x10::lang::String* strLit__130690 = ::x10aux::makeStringLit(":team"); strLit__130690; }))), teamidcopy), (__extension__ ({ static ::x10::lang::String* strLit__130691 = ::x10aux::makeStringLit(" to PHASE_DONE"); strLit__130691; })))))->c_str());
            } else {
             
            }
            
        }
        catch (::x10::lang::CheckedThrowable* __exc3185) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc3185)) {
                ::x10::lang::Error* __lowerer__var__1__ =
                  static_cast< ::x10::lang::Error*>(__exc3185);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__1__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__2__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc3185);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__2__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::Place origPlace;
    x10_int teamidcopy;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->origPlace);
        buf.write(this->teamidcopy);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_Team__LocalTeamState__closure__15<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_util_Team__LocalTeamState__closure__15<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::Place that_origPlace = buf.read< ::x10::lang::Place>();
        x10_int that_teamidcopy = buf.read<x10_int>();
        x10_util_Team__LocalTeamState__closure__15<TPMGL(T) >* this_ = new (storage) x10_util_Team__LocalTeamState__closure__15<TPMGL(T) >(that_origPlace, that_teamidcopy);
        return this_;
    }
    
    x10_util_Team__LocalTeamState__closure__15(::x10::lang::Place origPlace, x10_int teamidcopy) : origPlace(origPlace), teamidcopy(teamidcopy) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10:1001-1006";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_util_Team__LocalTeamState__closure__15<TPMGL(T) > >x10_util_Team__LocalTeamState__closure__15<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_Team__LocalTeamState__closure__15<TPMGL(T) >::__apply, &x10_util_Team__LocalTeamState__closure__15<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_util_Team__LocalTeamState__closure__15<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_util_Team__LocalTeamState__closure__15<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_Team__LocalTeamState__closure__15<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_Team__LocalTeamState__closure__15<TPMGL(T) >::_deserialize);
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_Team__LocalTeamState__closure__15<TPMGL(T) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_util_Team__LocalTeamState__closure__15<TPMGL(T) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_UTIL_TEAM__LOCALTEAMSTATE__CLOSURE__15_CLOSURE
#ifndef X10_UTIL_TEAM__LOCALTEAMSTATE_H_GENERICS
#define X10_UTIL_TEAM__LOCALTEAMSTATE_H_GENERICS
inline x10_int x10::util::Team__LocalTeamState::FMGL(PHASE_READY__get)() {
    if (FMGL(PHASE_READY__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(PHASE_READY__init)();
    }
    return x10::util::Team__LocalTeamState::FMGL(PHASE_READY);
}

inline x10_int x10::util::Team__LocalTeamState::FMGL(PHASE_INIT__get)() {
    if (FMGL(PHASE_INIT__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(PHASE_INIT__init)();
    }
    return x10::util::Team__LocalTeamState::FMGL(PHASE_INIT);
}

inline x10_int x10::util::Team__LocalTeamState::FMGL(PHASE_GATHER1__get)() {
    if (FMGL(PHASE_GATHER1__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(PHASE_GATHER1__init)();
    }
    return x10::util::Team__LocalTeamState::FMGL(PHASE_GATHER1);
}

inline x10_int x10::util::Team__LocalTeamState::FMGL(PHASE_GATHER2__get)() {
    if (FMGL(PHASE_GATHER2__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(PHASE_GATHER2__init)();
    }
    return x10::util::Team__LocalTeamState::FMGL(PHASE_GATHER2);
}

inline x10_int x10::util::Team__LocalTeamState::FMGL(PHASE_SCATTER__get)() {
    if (FMGL(PHASE_SCATTER__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(PHASE_SCATTER__init)();
    }
    return x10::util::Team__LocalTeamState::FMGL(PHASE_SCATTER);
}

inline x10_int x10::util::Team__LocalTeamState::FMGL(PHASE_DONE__get)() {
    if (FMGL(PHASE_DONE__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(PHASE_DONE__init)();
    }
    return x10::util::Team__LocalTeamState::FMGL(PHASE_DONE);
}

inline x10_int x10::util::Team__LocalTeamState::FMGL(COLL_BARRIER__get)() {
    if (FMGL(COLL_BARRIER__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(COLL_BARRIER__init)();
    }
    return x10::util::Team__LocalTeamState::FMGL(COLL_BARRIER);
}

inline x10_int x10::util::Team__LocalTeamState::FMGL(COLL_BROADCAST__get)() {
    if (FMGL(COLL_BROADCAST__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(COLL_BROADCAST__init)();
    }
    return x10::util::Team__LocalTeamState::FMGL(COLL_BROADCAST);
}

inline x10_int x10::util::Team__LocalTeamState::FMGL(COLL_SCATTER__get)() {
    if (FMGL(COLL_SCATTER__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(COLL_SCATTER__init)();
    }
    return x10::util::Team__LocalTeamState::FMGL(COLL_SCATTER);
}

inline x10_int x10::util::Team__LocalTeamState::FMGL(COLL_ALLTOALL__get)() {
    if (FMGL(COLL_ALLTOALL__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(COLL_ALLTOALL__init)();
    }
    return x10::util::Team__LocalTeamState::FMGL(COLL_ALLTOALL);
}

inline x10_int x10::util::Team__LocalTeamState::FMGL(COLL_REDUCE__get)() {
    if (FMGL(COLL_REDUCE__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(COLL_REDUCE__init)();
    }
    return x10::util::Team__LocalTeamState::FMGL(COLL_REDUCE);
}

inline x10_int x10::util::Team__LocalTeamState::FMGL(COLL_ALLREDUCE__get)() {
    if (FMGL(COLL_ALLREDUCE__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(COLL_ALLREDUCE__init)();
    }
    return x10::util::Team__LocalTeamState::FMGL(COLL_ALLREDUCE);
}

inline x10_int x10::util::Team__LocalTeamState::FMGL(COLL_INDEXOFMIN__get)() {
    if (FMGL(COLL_INDEXOFMIN__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(COLL_INDEXOFMIN__init)();
    }
    return x10::util::Team__LocalTeamState::FMGL(COLL_INDEXOFMIN);
}

inline x10_int x10::util::Team__LocalTeamState::FMGL(COLL_INDEXOFMAX__get)() {
    if (FMGL(COLL_INDEXOFMAX__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(COLL_INDEXOFMAX__init)();
    }
    return x10::util::Team__LocalTeamState::FMGL(COLL_INDEXOFMAX);
}

#ifndef X10_UTIL_TEAM__LOCALTEAMSTATE_H_performReduction_3142
#define X10_UTIL_TEAM__LOCALTEAMSTATE_H_performReduction_3142
template<class TPMGL(T)> void x10::util::Team__LocalTeamState::performReduction(
  ::x10::lang::Rail< TPMGL(T) >* src, x10_long src_off, ::x10::lang::Rail< TPMGL(T) >* dst,
  x10_long dst_off, x10_long count, x10_int operation) {
    
    //#line 713 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    switch (operation) {
        
        //#line 714 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        case ((x10_int)0): ;
        {
            
            //#line 715 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            break;
        }
        //#line 716 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        case ((x10_int)1): ;
        {
            
            //#line 717 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            break;
        }
        //#line 718 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        case ((x10_int)3): ;
        {
            
            //#line 719 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            break;
        }
        //#line 720 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        case ((x10_int)4): ;
        {
            
            //#line 721 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            break;
        }
        //#line 722 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        case ((x10_int)5): ;
        {
            
            //#line 723 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            break;
        }
        //#line 724 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        case ((x10_int)6): ;
        {
            
            //#line 725 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            break;
        }
        //#line 726 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        case ((x10_int)7): ;
        {
            
            //#line 727 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            break;
        }
        //#line 728 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        default: ;
        {
            
            //#line 729 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__130637 = ::x10aux::makeStringLit("ERROR: Unknown reduction operation: "); strLit__130637; })), operation)))->c_str());
        }
    }
}
#endif // X10_UTIL_TEAM__LOCALTEAMSTATE_H_performReduction_3142
#ifndef X10_UTIL_TEAM__LOCALTEAMSTATE_H_collective_impl_3143
#define X10_UTIL_TEAM__LOCALTEAMSTATE_H_collective_impl_3143
template<class TPMGL(T)> void x10::util::Team__LocalTeamState::collective_impl(
  x10_int collType, ::x10::lang::Place root, ::x10::lang::Rail< TPMGL(T) >* src,
  x10_long src_off, ::x10::lang::Rail< TPMGL(T) >* dst, x10_long dst_off,
  x10_long count, x10_int operation) {
    
    //#line 739 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    x10_int teamidcopy = this->FMGL(teamid);
    
    //#line 741 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if (!(::x10aux::nullCheck(this->FMGL(phase))->x10::util::concurrent::AtomicInteger::compareAndSet(
            ((x10_int)0), ((x10_int)1)))) {
        
        //#line 742 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        if (false) {
            
            //#line 743 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            while (!(::x10aux::nullCheck(this->FMGL(phase))->x10::util::concurrent::AtomicInteger::compareAndSet(
                       ((x10_int)0), ((x10_int)1)))) {
                
                //#line 744 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                ::x10::lang::Runtime::probe();
            }
            
        } else {
            
            //#line 1559 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
            {
                
                //#line 1560 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                ::x10::lang::Runtime::FMGL(pool__get)()->increase();
            }
            
            //#line 748 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            while (!(::x10aux::nullCheck(this->FMGL(phase))->x10::util::concurrent::AtomicInteger::compareAndSet(
                       ((x10_int)0), ((x10_int)1)))) {
                
                //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                x10_boolean ret__122452;
                goto __ret__122453; __ret__122453: {
                {
                    
                    //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                    try {
                        
                        //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                        ::x10::lang::Thread::sleep(((x10_long)0ll));
                        
                        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                        ret__122452 = true;
                        goto __ret__122453_end_;
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3144) {
                        if (::x10aux::instanceof< ::x10::lang::InterruptedException*>(__exc3144)) {
                            ::x10::lang::InterruptedException* e__122451 =
                              static_cast< ::x10::lang::InterruptedException*>(__exc3144);
                            {
                                
                                //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                                ret__122452 = false;
                                goto __ret__122453_end_;
                            }
                        } else
                        throw;
                    }
                }goto __ret__122453_end_; __ret__122453_end_: ;
                }
                ret__122452;
                }
                
            
            //#line 1566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
            {
                
                //#line 1567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                ::x10::lang::Runtime::FMGL(pool__get)()->decrease(
                  ((x10_int)1));
            }
            }
            
        }
        
    
    //#line 755 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    ::x10::util::Team__LocalTeamState__TreeStructure myLinks;
    
    //#line 756 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    x10_long rootIndex = ::x10aux::nullCheck(this->FMGL(places))->indexOf(
                           root);
    
    //#line 757 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if ((((this->FMGL(myIndex)) > (rootIndex)) || (::x10aux::struct_equals(rootIndex,
                                                                           ((x10_long)0ll)))))
    {
        
        //#line 758 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        myLinks = this->getLinks(((x10_long)-1ll), rootIndex,
                                 ((::x10aux::nullCheck(this->FMGL(places))->numPlaces()) - (((x10_long)1ll))));
    } else 
    //#line 759 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if (((this->FMGL(myIndex)) < (rootIndex))) {
        
        //#line 760 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        myLinks = this->getLinks(rootIndex, ((x10_long)0ll),
                                 ((rootIndex) - (((x10_long)1ll))));
    } else {
        
        //#line 762 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        myLinks = (__extension__ ({
            ::x10::util::Team__LocalTeamState__TreeStructure alloc__86441 =
               ::x10::util::Team__LocalTeamState__TreeStructure::_alloc();
            
            //#line 616 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            x10_long child2Index__122712 = (::x10aux::struct_equals(((::x10aux::nullCheck(this->FMGL(places))->numPlaces()) - (((x10_long)1ll))),
                                                                    rootIndex))
              ? (((x10_long)-1ll)) : (((rootIndex) + (((x10_long)1ll))));
            x10_long totalChildren__122713 = ((::x10aux::nullCheck(this->FMGL(places))->numPlaces()) - (((x10_long)1ll)));
            alloc__86441->FMGL(parentIndex) = ((x10_long)-1ll);
            alloc__86441->FMGL(child1Index) = ((x10_long)0ll);
            alloc__86441->FMGL(child2Index) = child2Index__122712;
            alloc__86441->FMGL(totalChildren) = totalChildren__122713;
            alloc__86441;
        }))
        ;
    }
    
    //#line 770 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    this->FMGL(local_src) = (reinterpret_cast< ::x10::lang::Any*>(src));
    
    //#line 771 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    this->FMGL(local_src_off) = src_off;
    
    //#line 772 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    this->FMGL(local_dst) = (reinterpret_cast< ::x10::lang::Any*>(dst));
    
    //#line 773 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    this->FMGL(local_dst_off) = dst_off;
    
    //#line 774 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    this->FMGL(local_count) = count;
    
    //#line 775 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    this->FMGL(local_grandchildren) = myLinks->FMGL(totalChildren);
    
    //#line 786 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if (((::x10aux::struct_equals(collType, ((x10_int)4))) ||
        (::x10aux::struct_equals(collType, ((x10_int)5)))))
    {
        
        //#line 787 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        this->template performReduction< TPMGL(T) >(src, src_off,
                                                    dst, dst_off,
                                                    count,
                                                    operation);
    } else 
    //#line 788 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if (((::x10aux::struct_equals(collType, ((x10_int)7))) ||
        (::x10aux::struct_equals(collType, ((x10_int)6)))))
    {
        
        //#line 789 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10aux::nullCheck(dst)->x10::lang::template Rail< TPMGL(T) >::__set(
          ((x10_long)0ll), ::x10aux::nullCheck(src)->x10::lang::template Rail< TPMGL(T) >::__apply(
                             ((x10_long)0ll)));
    }
    
    //#line 793 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    ::x10aux::nullCheck(this->FMGL(phase))->x10::util::concurrent::AtomicInteger::compareAndSet(
      ((x10_int)1), ((x10_int)2));
    
    //#line 796 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if ((::x10aux::struct_equals(myLinks->FMGL(child1Index),
                                 ((x10_long)-1ll)))) {
        
        //#line 797 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10aux::nullCheck(this->FMGL(phase))->x10::util::concurrent::AtomicInteger::compareAndSet(
          ((x10_int)2), ((x10_int)4));
    } else 
    //#line 798 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if ((::x10aux::struct_equals(myLinks->FMGL(child2Index),
                                 ((x10_long)-1ll)))) {
        
        //#line 799 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        if (!(::x10aux::nullCheck(this->FMGL(phase))->x10::util::concurrent::AtomicInteger::compareAndSet(
                ((x10_int)2), ((x10_int)3)))) {
            
            //#line 800 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10aux::nullCheck(this->FMGL(phase))->x10::util::concurrent::AtomicInteger::compareAndSet(
              ((x10_int)3), ((x10_int)4));
        }
        
    }
    
    //#line 804 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if ((!::x10aux::struct_equals(::x10aux::nullCheck(this->FMGL(phase))->x10::util::concurrent::AtomicInteger::get(),
                                  ((x10_int)4)))) {
        
        //#line 806 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        if (false) {
            
            //#line 807 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            while ((!::x10aux::struct_equals(::x10aux::nullCheck(this->FMGL(phase))->x10::util::concurrent::AtomicInteger::get(),
                                             ((x10_int)4))))
            {
                
                //#line 808 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                ::x10::lang::Runtime::probe();
            }
            
        } else {
            
            //#line 1559 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
            {
                
                //#line 1560 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                ::x10::lang::Runtime::FMGL(pool__get)()->increase();
            }
            
            //#line 812 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            while ((!::x10aux::struct_equals(::x10aux::nullCheck(this->FMGL(phase))->x10::util::concurrent::AtomicInteger::get(),
                                             ((x10_int)4))))
            {
                
                //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                x10_boolean ret__122468;
                goto __ret__122469; __ret__122469: {
                {
                    
                    //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                    try {
                        
                        //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                        ::x10::lang::Thread::sleep(((x10_long)0ll));
                        
                        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                        ret__122468 = true;
                        goto __ret__122469_end_;
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3145) {
                        if (::x10aux::instanceof< ::x10::lang::InterruptedException*>(__exc3145)) {
                            ::x10::lang::InterruptedException* e__122467 =
                              static_cast< ::x10::lang::InterruptedException*>(__exc3145);
                            {
                                
                                //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                                ret__122468 = false;
                                goto __ret__122469_end_;
                            }
                        } else
                        throw;
                    }
                }goto __ret__122469_end_; __ret__122469_end_: ;
                }
                ret__122468;
                }
                
            
            //#line 1566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
            {
                
                //#line 1567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                ::x10::lang::Runtime::FMGL(pool__get)()->decrease(
                  ((x10_int)1));
            }
            }
            
        }
        
    
    //#line 820 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if ((::x10aux::struct_equals(myLinks->FMGL(parentIndex),
                                 ((x10_long)-1ll)))) {
        
        //#line 822 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        if ((::x10aux::struct_equals(collType, ((x10_int)1))))
        {
            
            //#line 823 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Rail< void >::template copy< TPMGL(T) >(
              src, src_off, dst, dst_off, count);
        } else 
        //#line 824 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        if ((::x10aux::struct_equals(collType, ((x10_int)2))))
        {
            
            //#line 825 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Rail< void >::template copy< TPMGL(T) >(
              src, ((src_off) + (((count) * (this->FMGL(myIndex))))),
              dst, dst_off, count);
        } else 
        //#line 826 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        if ((::x10aux::struct_equals(collType, ((x10_int)3))))
        {
            
            //#line 827 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Rail< void >::template copy< TPMGL(T) >(
              src, ((src_off) + (((count) * (this->FMGL(myIndex))))),
              dst, ((dst_off) + (((count) * (this->FMGL(myIndex))))),
              count);
        }
        
        //#line 828 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10aux::nullCheck(this->FMGL(phase))->x10::util::concurrent::AtomicInteger::set(
          ((x10_int)5));
    } else {
        {
            
            //#line 832 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var51 = ::x10::lang::Runtime::startFinish(
                                                       ::x10::compiler::Pragma::FMGL(FINISH_ASYNC__get)());
            {
                ::x10::lang::CheckedThrowable* throwable__122946 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            ::x10::lang::Runtime::runAsync(
                              ::x10aux::nullCheck(this->FMGL(places))->__apply(
                                myLinks->FMGL(parentIndex)),
                              reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_util_Team__LocalTeamState__closure__4<TPMGL(T)>)))x10_util_Team__LocalTeamState__closure__4<TPMGL(T)>(teamidcopy))),
                              ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3148) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3148);
                            {
                                ::x10::lang::Runtime::pushException(
                                  __lowerer__var__0__);
                                ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make()));
                            }
                        } else
                        throw;
                    }
                    ::x10::compiler::Finalization::plausibleThrow();
                }
                catch (::x10::lang::CheckedThrowable* __exc3149) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__122947 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc3149);
                        {
                            throwable__122946 = formal__122947;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122946)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122946))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122946));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var51);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122946)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122946)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122946));
                    }
                    
                }
                
            }
        }
        
        //#line 848 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        if (((collType) >= (((x10_int)3)))) {
            
            //#line 850 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Rail< TPMGL(T) >* notnulldst = dst;
            
            //#line 851 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::GlobalRail<TPMGL(T)> gr =  ::x10::lang::GlobalRail<TPMGL(T)>::_alloc();
            (gr)->::x10::lang::GlobalRail<TPMGL(T)>::_constructor(
              notnulldst);
            
            //#line 852 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            if ((::x10aux::struct_equals(collType, ((x10_int)3))))
            {
                
                //#line 853 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                x10_long totalData = ((count) * (((myLinks->FMGL(totalChildren)) + (((x10_long)1ll)))));
                {
                    
                    //#line 854 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                    ::x10::lang::Runtime::ensureNotInAtomic();
                    ::x10::lang::FinishState* x10____var52 =
                      ::x10::lang::Runtime::startFinish(::x10::compiler::Pragma::FMGL(FINISH_ASYNC__get)());
                    {
                        ::x10::lang::CheckedThrowable* throwable__122949 =
                          ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                        try {
                            try {
                                {
                                    ::x10::lang::Runtime::runAsync(
                                      ::x10aux::nullCheck(this->FMGL(places))->__apply(
                                        myLinks->FMGL(parentIndex)),
                                      reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_util_Team__LocalTeamState__closure__5<TPMGL(T)>)))x10_util_Team__LocalTeamState__closure__5<TPMGL(T)>(gr, dst_off, teamidcopy, totalData))),
                                      ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                                }
                            }
                            catch (::x10::lang::CheckedThrowable* __exc3151) {
                                if (true) {
                                    ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                                      static_cast< ::x10::lang::CheckedThrowable*>(__exc3151);
                                    {
                                        ::x10::lang::Runtime::pushException(
                                          __lowerer__var__1__);
                                        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make()));
                                    }
                                } else
                                throw;
                            }
                            ::x10::compiler::Finalization::plausibleThrow();
                        }
                        catch (::x10::lang::CheckedThrowable* __exc3152) {
                            if (true) {
                                ::x10::lang::CheckedThrowable* formal__122950 =
                                  static_cast< ::x10::lang::CheckedThrowable*>(__exc3152);
                                {
                                    throwable__122949 = formal__122950;
                                }
                            } else
                            throw;
                        }
                        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                      throwable__122949)))
                        {
                            if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122949))
                            {
                                ::x10aux::throwException(::x10aux::nullCheck(throwable__122949));
                            }
                            
                        }
                        if (true) {
                            ::x10::lang::Runtime::stopFinish(
                              x10____var52);
                        }
                        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                      throwable__122949)))
                        {
                            if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122949)))
                            {
                                ::x10aux::throwException(::x10aux::nullCheck(throwable__122949));
                            }
                            
                        }
                        
                    }
                }
            } else 
            //#line 859 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            if (((::x10aux::struct_equals(collType, ((x10_int)4))) ||
                (::x10aux::struct_equals(collType, ((x10_int)5)))))
            {
             
            } else 
            //#line 862 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            if ((::x10aux::struct_equals(collType, ((x10_int)7))))
            {
                
                //#line 863 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                ::x10::util::Team__DoubleIdx childVal = ::x10aux::class_cast< ::x10::util::Team__DoubleIdx>(::x10aux::nullCheck(dst)->x10::lang::template Rail< TPMGL(T) >::__apply(
                                                                                                              ((x10_long)0ll)));
                {
                    
                    //#line 864 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                    ::x10::lang::Runtime::ensureNotInAtomic();
                    ::x10::lang::FinishState* x10____var53 =
                      ::x10::lang::Runtime::startFinish(::x10::compiler::Pragma::FMGL(FINISH_ASYNC__get)());
                    {
                        ::x10::lang::CheckedThrowable* throwable__122952 =
                          ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                        try {
                            try {
                                {
                                    ::x10::lang::Runtime::runAsync(
                                      ::x10aux::nullCheck(this->FMGL(places))->__apply(
                                        myLinks->FMGL(parentIndex)),
                                      reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_util_Team__LocalTeamState__closure__6<TPMGL(T)>)))x10_util_Team__LocalTeamState__closure__6<TPMGL(T)>(teamidcopy, childVal))),
                                      ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                                }
                            }
                            catch (::x10::lang::CheckedThrowable* __exc3154) {
                                if (true) {
                                    ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                                      static_cast< ::x10::lang::CheckedThrowable*>(__exc3154);
                                    {
                                        ::x10::lang::Runtime::pushException(
                                          __lowerer__var__1__);
                                        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make()));
                                    }
                                } else
                                throw;
                            }
                            ::x10::compiler::Finalization::plausibleThrow();
                        }
                        catch (::x10::lang::CheckedThrowable* __exc3155) {
                            if (true) {
                                ::x10::lang::CheckedThrowable* formal__122953 =
                                  static_cast< ::x10::lang::CheckedThrowable*>(__exc3155);
                                {
                                    throwable__122952 = formal__122953;
                                }
                            } else
                            throw;
                        }
                        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                      throwable__122952)))
                        {
                            if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122952))
                            {
                                ::x10aux::throwException(::x10aux::nullCheck(throwable__122952));
                            }
                            
                        }
                        if (true) {
                            ::x10::lang::Runtime::stopFinish(
                              x10____var53);
                        }
                        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                      throwable__122952)))
                        {
                            if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122952)))
                            {
                                ::x10aux::throwException(::x10aux::nullCheck(throwable__122952));
                            }
                            
                        }
                        
                    }
                }
            } else 
            //#line 877 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            if ((::x10aux::struct_equals(collType, ((x10_int)6))))
            {
                
                //#line 878 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                ::x10::util::Team__DoubleIdx childVal = ::x10aux::class_cast< ::x10::util::Team__DoubleIdx>(::x10aux::nullCheck(dst)->x10::lang::template Rail< TPMGL(T) >::__apply(
                                                                                                              ((x10_long)0ll)));
                {
                    
                    //#line 879 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                    ::x10::lang::Runtime::ensureNotInAtomic();
                    ::x10::lang::FinishState* x10____var54 =
                      ::x10::lang::Runtime::startFinish(::x10::compiler::Pragma::FMGL(FINISH_ASYNC__get)());
                    {
                        ::x10::lang::CheckedThrowable* throwable__122955 =
                          ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                        try {
                            try {
                                {
                                    ::x10::lang::Runtime::runAsync(
                                      ::x10aux::nullCheck(this->FMGL(places))->__apply(
                                        myLinks->FMGL(parentIndex)),
                                      reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_util_Team__LocalTeamState__closure__7<TPMGL(T)>)))x10_util_Team__LocalTeamState__closure__7<TPMGL(T)>(teamidcopy, childVal))),
                                      ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                                }
                            }
                            catch (::x10::lang::CheckedThrowable* __exc3157) {
                                if (true) {
                                    ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                                      static_cast< ::x10::lang::CheckedThrowable*>(__exc3157);
                                    {
                                        ::x10::lang::Runtime::pushException(
                                          __lowerer__var__1__);
                                        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make()));
                                    }
                                } else
                                throw;
                            }
                            ::x10::compiler::Finalization::plausibleThrow();
                        }
                        catch (::x10::lang::CheckedThrowable* __exc3158) {
                            if (true) {
                                ::x10::lang::CheckedThrowable* formal__122956 =
                                  static_cast< ::x10::lang::CheckedThrowable*>(__exc3158);
                                {
                                    throwable__122955 = formal__122956;
                                }
                            } else
                            throw;
                        }
                        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                      throwable__122955)))
                        {
                            if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122955))
                            {
                                ::x10aux::throwException(::x10aux::nullCheck(throwable__122955));
                            }
                            
                        }
                        if (true) {
                            ::x10::lang::Runtime::stopFinish(
                              x10____var54);
                        }
                        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                      throwable__122955)))
                        {
                            if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122955)))
                            {
                                ::x10aux::throwException(::x10aux::nullCheck(throwable__122955));
                            }
                            
                        }
                        
                    }
                }
            }
            
        }
        {
            
            //#line 891 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var55 = ::x10::lang::Runtime::startFinish(
                                                       ::x10::compiler::Pragma::FMGL(FINISH_ASYNC__get)());
            {
                ::x10::lang::CheckedThrowable* throwable__122958 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            ::x10::lang::Runtime::runAsync(
                              ::x10aux::nullCheck(this->FMGL(places))->__apply(
                                myLinks->FMGL(parentIndex)),
                              reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_util_Team__LocalTeamState__closure__8<TPMGL(T)>)))x10_util_Team__LocalTeamState__closure__8<TPMGL(T)>(teamidcopy))),
                              ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3161) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3161);
                            {
                                ::x10::lang::Runtime::pushException(
                                  __lowerer__var__1__);
                                ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make()));
                            }
                        } else
                        throw;
                    }
                    ::x10::compiler::Finalization::plausibleThrow();
                }
                catch (::x10::lang::CheckedThrowable* __exc3162) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__122959 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc3162);
                        {
                            throwable__122958 = formal__122959;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122958)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122958))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122958));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var55);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122958)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122958)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122958));
                    }
                    
                }
                
            }
        }
        
        //#line 911 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        if ((!::x10aux::struct_equals(::x10aux::nullCheck(this->FMGL(phase))->x10::util::concurrent::AtomicInteger::get(),
                                      ((x10_int)5)))) {
            
            //#line 913 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            if (false) {
                
                //#line 914 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                while ((!::x10aux::struct_equals(::x10aux::nullCheck(this->FMGL(phase))->x10::util::concurrent::AtomicInteger::get(),
                                                 ((x10_int)5))))
                {
                    
                    //#line 915 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                    ::x10::lang::Runtime::probe();
                }
                
            } else {
                
                //#line 1559 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
                {
                    
                    //#line 1560 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ::x10::lang::Runtime::FMGL(pool__get)()->increase();
                }
                
                //#line 919 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                while ((!::x10aux::struct_equals(::x10aux::nullCheck(this->FMGL(phase))->x10::util::concurrent::AtomicInteger::get(),
                                                 ((x10_int)5))))
                {
                    
                    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                    x10_boolean ret__122575;
                    goto __ret__122576; __ret__122576: {
                    {
                        
                        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                        try {
                            
                            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                            ::x10::lang::Thread::sleep(((x10_long)0ll));
                            
                            //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                            ret__122575 = true;
                            goto __ret__122576_end_;
                        }
                        catch (::x10::lang::CheckedThrowable* __exc3163) {
                            if (::x10aux::instanceof< ::x10::lang::InterruptedException*>(__exc3163)) {
                                ::x10::lang::InterruptedException* e__122574 =
                                  static_cast< ::x10::lang::InterruptedException*>(__exc3163);
                                {
                                    
                                    //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/System.x10"
                                    ret__122575 = false;
                                    goto __ret__122576_end_;
                                }
                            } else
                            throw;
                        }
                    }goto __ret__122576_end_; __ret__122576_end_: ;
                    }
                    ret__122575;
                    }
                    
                
                //#line 1566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
                {
                    
                    //#line 1567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ::x10::lang::Runtime::FMGL(pool__get)()->decrease(
                      ((x10_int)1));
                }
                }
                
            }
            
        }
        
    
    //#line 929 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if ((((!::x10aux::struct_equals(myLinks->FMGL(child1Index),
                                    ((x10_long)-1ll))) &&
        (!::x10aux::struct_equals(collType, ((x10_int)0)))) &&
        (!::x10aux::struct_equals(collType, ((x10_int)4)))))
    {
        
        //#line 930 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10::lang::Rail< TPMGL(T) >* notnulldst = dst;
        
        //#line 931 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10::lang::GlobalRail<TPMGL(T)> gr =  ::x10::lang::GlobalRail<TPMGL(T)>::_alloc();
        (gr)->::x10::lang::GlobalRail<TPMGL(T)>::_constructor(
          notnulldst);
        
        //#line 933 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        if ((::x10aux::struct_equals(collType, ((x10_int)3))))
        {
            {
                
                //#line 935 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                ::x10::lang::Runtime::ensureNotInAtomic();
                ::x10::lang::FinishState* x10____var58 = ::x10::lang::Runtime::startFinish(
                                                           ::x10::compiler::Pragma::FMGL(FINISH_SPMD__get)());
                {
                    ::x10::lang::CheckedThrowable* throwable__122967 =
                      ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                    try {
                        try {
                            {
                                
                                //#line 936 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                                ::x10::lang::Runtime::runAsync(
                                  ::x10aux::nullCheck(this->FMGL(places))->__apply(
                                    myLinks->FMGL(child1Index)),
                                  reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_util_Team__LocalTeamState__closure__9<TPMGL(T)>)))x10_util_Team__LocalTeamState__closure__9<TPMGL(T)>(gr, dst_off, teamidcopy))),
                                  ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                                
                                //#line 944 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                                if ((!::x10aux::struct_equals(myLinks->FMGL(child2Index),
                                                              ((x10_long)-1ll))))
                                {
                                    
                                    //#line 945 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                                    ::x10::lang::Runtime::runAsync(
                                      ::x10aux::nullCheck(this->FMGL(places))->__apply(
                                        myLinks->FMGL(child2Index)),
                                      reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_util_Team__LocalTeamState__closure__10<TPMGL(T)>)))x10_util_Team__LocalTeamState__closure__10<TPMGL(T)>(gr, dst_off, teamidcopy))),
                                      ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                                }
                                
                            }
                        }
                        catch (::x10::lang::CheckedThrowable* __exc3170) {
                            if (true) {
                                ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                                  static_cast< ::x10::lang::CheckedThrowable*>(__exc3170);
                                {
                                    ::x10::lang::Runtime::pushException(
                                      __lowerer__var__0__);
                                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make()));
                                }
                            } else
                            throw;
                        }
                        ::x10::compiler::Finalization::plausibleThrow();
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3171) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* formal__122968 =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3171);
                            {
                                throwable__122967 = formal__122968;
                            }
                        } else
                        throw;
                    }
                    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                  throwable__122967)))
                    {
                        if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122967))
                        {
                            ::x10aux::throwException(::x10aux::nullCheck(throwable__122967));
                        }
                        
                    }
                    if (true) {
                        ::x10::lang::Runtime::stopFinish(
                          x10____var58);
                    }
                    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                  throwable__122967)))
                    {
                        if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122967)))
                        {
                            ::x10aux::throwException(::x10aux::nullCheck(throwable__122967));
                        }
                        
                    }
                    
                }
            }
        } else 
        //#line 956 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        if (((((::x10aux::struct_equals(collType, ((x10_int)1))) ||
            (::x10aux::struct_equals(collType, ((x10_int)5)))) ||
            (::x10aux::struct_equals(collType, ((x10_int)6)))) ||
            (::x10aux::struct_equals(collType, ((x10_int)7)))))
        {
            {
                
                //#line 959 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                ::x10::lang::Runtime::ensureNotInAtomic();
                ::x10::lang::FinishState* x10____var61 = ::x10::lang::Runtime::startFinish(
                                                           ::x10::compiler::Pragma::FMGL(FINISH_SPMD__get)());
                {
                    ::x10::lang::CheckedThrowable* throwable__122976 =
                      ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                    try {
                        try {
                            {
                                
                                //#line 960 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                                ::x10::lang::Runtime::runAsync(
                                  ::x10aux::nullCheck(this->FMGL(places))->__apply(
                                    myLinks->FMGL(child1Index)),
                                  reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_util_Team__LocalTeamState__closure__11<TPMGL(T)>)))x10_util_Team__LocalTeamState__closure__11<TPMGL(T)>(gr, dst_off, teamidcopy))),
                                  ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                                
                                //#line 966 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                                if ((!::x10aux::struct_equals(myLinks->FMGL(child2Index),
                                                              ((x10_long)-1ll))))
                                {
                                    
                                    //#line 967 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                                    ::x10::lang::Runtime::runAsync(
                                      ::x10aux::nullCheck(this->FMGL(places))->__apply(
                                        myLinks->FMGL(child2Index)),
                                      reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_util_Team__LocalTeamState__closure__12<TPMGL(T)>)))x10_util_Team__LocalTeamState__closure__12<TPMGL(T)>(gr, dst_off, teamidcopy))),
                                      ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                                }
                                
                            }
                        }
                        catch (::x10::lang::CheckedThrowable* __exc3178) {
                            if (true) {
                                ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                                  static_cast< ::x10::lang::CheckedThrowable*>(__exc3178);
                                {
                                    ::x10::lang::Runtime::pushException(
                                      __lowerer__var__0__);
                                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make()));
                                }
                            } else
                            throw;
                        }
                        ::x10::compiler::Finalization::plausibleThrow();
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3179) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* formal__122977 =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3179);
                            {
                                throwable__122976 = formal__122977;
                            }
                        } else
                        throw;
                    }
                    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                  throwable__122976)))
                    {
                        if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122976))
                        {
                            ::x10aux::throwException(::x10aux::nullCheck(throwable__122976));
                        }
                        
                    }
                    if (true) {
                        ::x10::lang::Runtime::stopFinish(
                          x10____var61);
                    }
                    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                  throwable__122976)))
                    {
                        if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122976)))
                        {
                            ::x10aux::throwException(::x10aux::nullCheck(throwable__122976));
                        }
                        
                    }
                    
                }
            }
        } else 
        //#line 976 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        if ((::x10aux::struct_equals(collType, ((x10_int)2))))
        {
         
        }
        
    }
    
    //#line 983 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if ((!::x10aux::struct_equals(myLinks->FMGL(child1Index),
                                  ((x10_long)-1ll)))) {
        
        //#line 990 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10::lang::Place origPlace = ::x10::lang::Place::_make(::x10aux::here);
        {
            
            //#line 991 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var62 = ::x10::lang::Runtime::startFinish(
                                                       ::x10::compiler::Pragma::FMGL(FINISH_HERE__get)());
            {
                ::x10::lang::CheckedThrowable* throwable__122979 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            
                            //#line 992 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                            ::x10::lang::Runtime::runAsync(
                              ::x10aux::nullCheck(this->FMGL(places))->__apply(
                                myLinks->FMGL(child1Index)),
                              reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_util_Team__LocalTeamState__closure__13<TPMGL(T)>)))x10_util_Team__LocalTeamState__closure__13<TPMGL(T)>(origPlace, teamidcopy))),
                              ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3182) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3182);
                            {
                                ::x10::lang::Runtime::pushException(
                                  __lowerer__var__0__);
                                ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make()));
                            }
                        } else
                        throw;
                    }
                    ::x10::compiler::Finalization::plausibleThrow();
                }
                catch (::x10::lang::CheckedThrowable* __exc3183) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__122980 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc3183);
                        {
                            throwable__122979 = formal__122980;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122979)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122979))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122979));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var62);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122979)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122979)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122979));
                    }
                    
                }
                
            }
        }
        
        //#line 999 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        if ((!::x10aux::struct_equals(myLinks->FMGL(child2Index),
                                      ((x10_long)-1ll))))
        {
            {
                
                //#line 1000 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                ::x10::lang::Runtime::ensureNotInAtomic();
                ::x10::lang::FinishState* x10____var63 = ::x10::lang::Runtime::startFinish(
                                                           ::x10::compiler::Pragma::FMGL(FINISH_HERE__get)());
                {
                    ::x10::lang::CheckedThrowable* throwable__122982 =
                      ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                    try {
                        try {
                            {
                                
                                //#line 1001 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
                                ::x10::lang::Runtime::runAsync(
                                  ::x10aux::nullCheck(this->FMGL(places))->__apply(
                                    myLinks->FMGL(child2Index)),
                                  reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_util_Team__LocalTeamState__closure__15<TPMGL(T)>)))x10_util_Team__LocalTeamState__closure__15<TPMGL(T)>(origPlace, teamidcopy))),
                                  ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                            }
                        }
                        catch (::x10::lang::CheckedThrowable* __exc3186) {
                            if (true) {
                                ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                                  static_cast< ::x10::lang::CheckedThrowable*>(__exc3186);
                                {
                                    ::x10::lang::Runtime::pushException(
                                      __lowerer__var__1__);
                                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make()));
                                }
                            } else
                            throw;
                        }
                        ::x10::compiler::Finalization::plausibleThrow();
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3187) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* formal__122983 =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3187);
                            {
                                throwable__122982 = formal__122983;
                            }
                        } else
                        throw;
                    }
                    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                  throwable__122982)))
                    {
                        if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122982))
                        {
                            ::x10aux::throwException(::x10aux::nullCheck(throwable__122982));
                        }
                        
                    }
                    if (true) {
                        ::x10::lang::Runtime::stopFinish(
                          x10____var63);
                    }
                    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                  throwable__122982)))
                    {
                        if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122982)))
                        {
                            ::x10aux::throwException(::x10aux::nullCheck(throwable__122982));
                        }
                        
                    }
                    
                }
            }
        }
        
    }
    
    //#line 1022 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    this->FMGL(local_src) = (::x10aux::class_cast_unchecked< ::x10::lang::Any*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 1023 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    this->FMGL(local_dst) = (::x10aux::class_cast_unchecked< ::x10::lang::Any*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 1025 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    ::x10aux::nullCheck(this->FMGL(phase))->x10::util::concurrent::AtomicInteger::set(
      ((x10_int)0));
    }
    #endif // X10_UTIL_TEAM__LOCALTEAMSTATE_H_collective_impl_3143
    #endif // X10_UTIL_TEAM__LOCALTEAMSTATE_H_GENERICS
    #endif // __X10_UTIL_TEAM__LOCALTEAMSTATE_H_NODEPS
