#ifndef __X10_UTIL_TEAM_H
#define __X10_UTIL_TEAM_H

#include <x10rt.h>


#define X10_LANG_ANY_H_NODEPS
#include <x10/lang/Any.h>
#undef X10_LANG_ANY_H_NODEPS
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
class PlaceGroup;
} } 
namespace x10 { namespace lang { 
class PlaceGroup__SimplePlaceGroup;
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
namespace x10 { namespace util { 
class Team__LocalTeamState;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
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
class FinishState;
} } 
namespace x10 { namespace lang { 
class Exception;
} } 
namespace x10 { namespace lang { 
class VoidFun_0_0;
} } 
namespace x10 { namespace util { 
class Team__DoubleIdx;
} } 
namespace x10 { namespace lang { 
class SparsePlaceGroup;
} } 
namespace x10 { namespace lang { 
class IllegalArgumentException;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace compiler { 
class NonEscaping;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace util { 

class Team   {
    public:
    RTT_H_DECLS_STRUCT
    
    ::x10::util::Team* operator->() { return this; }
    
    static ::x10aux::itable_entry _itables[2];
    
    ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static ::x10::lang::Any::itable< ::x10::util::Team > _itable_0;
    
    static ::x10aux::itable_entry _iboxitables[2];
    
    ::x10aux::itable_entry* _getIBoxITables() { return _iboxitables; }
    
    static ::x10::util::Team _alloc(){::x10::util::Team t; return t; }
    
    static x10_boolean FMGL(DEBUG);
    static void FMGL(DEBUG__do_init)();
    static void FMGL(DEBUG__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(DEBUG__status);
    static ::x10::lang::CheckedThrowable* FMGL(DEBUG__exception);
    static x10_boolean FMGL(DEBUG__get)();
    
    static x10_boolean FMGL(DEBUGINTERNALS);
    static void FMGL(DEBUGINTERNALS__do_init)();
    static void FMGL(DEBUGINTERNALS__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(DEBUGINTERNALS__status);
    static ::x10::lang::CheckedThrowable* FMGL(DEBUGINTERNALS__exception);
    static x10_boolean FMGL(DEBUGINTERNALS__get)();
    
    static ::x10::util::Team FMGL(WORLD);
    static void FMGL(WORLD__do_init)();
    static void FMGL(WORLD__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(WORLD__status);
    static ::x10::lang::CheckedThrowable* FMGL(WORLD__exception);
    static ::x10::util::Team FMGL(WORLD__get)();
    
    static ::x10::util::GrowableRail<x10_int>* FMGL(roles);
    static void FMGL(roles__do_init)();
    static void FMGL(roles__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(roles__status);
    static ::x10::lang::CheckedThrowable* FMGL(roles__exception);
    static ::x10::util::GrowableRail<x10_int>* FMGL(roles__get)();
    
    static ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>*
      FMGL(state);
    static void FMGL(state__do_init)();
    static void FMGL(state__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(state__status);
    static ::x10::lang::CheckedThrowable* FMGL(state__exception);
    static ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>*
      FMGL(state__get)();
    
    x10_int FMGL(collectiveSupportLevel);
    
    static x10_int FMGL(X10RT_COLL_NOCOLLECTIVES);
    static void FMGL(X10RT_COLL_NOCOLLECTIVES__do_init)();
    static void FMGL(X10RT_COLL_NOCOLLECTIVES__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(X10RT_COLL_NOCOLLECTIVES__status);
    static ::x10::lang::CheckedThrowable* FMGL(X10RT_COLL_NOCOLLECTIVES__exception);
    static x10_int FMGL(X10RT_COLL_NOCOLLECTIVES__get)();
    
    static x10_int FMGL(X10RT_COLL_BARRIERONLY);
    static void FMGL(X10RT_COLL_BARRIERONLY__do_init)();
    static void FMGL(X10RT_COLL_BARRIERONLY__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(X10RT_COLL_BARRIERONLY__status);
    static ::x10::lang::CheckedThrowable* FMGL(X10RT_COLL_BARRIERONLY__exception);
    static x10_int FMGL(X10RT_COLL_BARRIERONLY__get)();
    
    static x10_int FMGL(X10RT_COLL_ALLBLOCKINGCOLLECTIVES);
    static void FMGL(X10RT_COLL_ALLBLOCKINGCOLLECTIVES__do_init)();
    static void FMGL(X10RT_COLL_ALLBLOCKINGCOLLECTIVES__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(X10RT_COLL_ALLBLOCKINGCOLLECTIVES__status);
    static ::x10::lang::CheckedThrowable* FMGL(X10RT_COLL_ALLBLOCKINGCOLLECTIVES__exception);
    static x10_int FMGL(X10RT_COLL_ALLBLOCKINGCOLLECTIVES__get)();
    
    static x10_int FMGL(X10RT_COLL_NONBLOCKINGBARRIER);
    static void FMGL(X10RT_COLL_NONBLOCKINGBARRIER__do_init)();
    static void FMGL(X10RT_COLL_NONBLOCKINGBARRIER__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(X10RT_COLL_NONBLOCKINGBARRIER__status);
    static ::x10::lang::CheckedThrowable* FMGL(X10RT_COLL_NONBLOCKINGBARRIER__exception);
    static x10_int FMGL(X10RT_COLL_NONBLOCKINGBARRIER__get)();
    
    static x10_int FMGL(X10RT_COLL_ALLNONBLOCKINGCOLLECTIVES);
    static void FMGL(X10RT_COLL_ALLNONBLOCKINGCOLLECTIVES__do_init)();
    static void FMGL(X10RT_COLL_ALLNONBLOCKINGCOLLECTIVES__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(X10RT_COLL_ALLNONBLOCKINGCOLLECTIVES__status);
    static ::x10::lang::CheckedThrowable* FMGL(X10RT_COLL_ALLNONBLOCKINGCOLLECTIVES__exception);
    static x10_int FMGL(X10RT_COLL_ALLNONBLOCKINGCOLLECTIVES__get)();
    
    x10_int FMGL(id);
    
    x10_int id() {
        return (*this)->FMGL(id);
        
    }
    void _constructor(x10_int id, ::x10::lang::PlaceGroup* places, x10_long role);
    
    static ::x10::util::Team _make(x10_int id, ::x10::lang::PlaceGroup* places,
                                   x10_long role);
    
    void _constructor(::x10::lang::PlaceGroup* places);
    
    static ::x10::util::Team _make(::x10::lang::PlaceGroup* places);
    
    static void nativeMake(::x10::lang::Rail< x10_int >* places, x10_int count,
                           ::x10::lang::Rail< x10_int >* result);
    static x10_int nativeCollectiveSupport() {
        return x10rt_coll_support();
    }
    x10_long size();
    static x10_int nativeSize(x10_int id) {
        return (x10_int)x10rt_team_sz(id);
    }
    void barrier();
    void nativeBarrier();
    static void nativeBarrier(x10_int id, x10_int role) {
        x10rt_barrier(id, role, ::x10aux::coll_handler, ::x10aux::coll_enter());
    }
    template<class TPMGL(T)> void scatter(::x10::lang::Place root, ::x10::lang::Rail< TPMGL(T) >* src,
                                          x10_long src_off, ::x10::lang::Rail< TPMGL(T) >* dst,
                                          x10_long dst_off,
                                          x10_long count);
    template<class TPMGL(T)> static void nativeScatter(x10_int id,
                                                       x10_int role,
                                                       x10_int root,
                                                       ::x10::lang::Rail< TPMGL(T) >* src,
                                                       x10_int src_off,
                                                       ::x10::lang::Rail< TPMGL(T) >* dst,
                                                       x10_int dst_off,
                                                       x10_int count);
    template<class TPMGL(T)> void bcast(::x10::lang::Place root,
                                        ::x10::lang::Rail< TPMGL(T) >* src,
                                        x10_long src_off,
                                        ::x10::lang::Rail< TPMGL(T) >* dst,
                                        x10_long dst_off,
                                        x10_long count);
    template<class TPMGL(T)> static void nativeBcast(x10_int id,
                                                     x10_int role,
                                                     x10_int root,
                                                     ::x10::lang::Rail< TPMGL(T) >* src,
                                                     x10_int src_off,
                                                     ::x10::lang::Rail< TPMGL(T) >* dst,
                                                     x10_int dst_off,
                                                     x10_int count);
    template<class TPMGL(T)> void alltoall(::x10::lang::Rail< TPMGL(T) >* src,
                                           x10_long src_off,
                                           ::x10::lang::Rail< TPMGL(T) >* dst,
                                           x10_long dst_off,
                                           x10_long count);
    template<class TPMGL(T)> static void nativeAlltoall(x10_int id,
                                                        x10_int role,
                                                        ::x10::lang::Rail< TPMGL(T) >* src,
                                                        x10_int src_off,
                                                        ::x10::lang::Rail< TPMGL(T) >* dst,
                                                        x10_int dst_off,
                                                        x10_int count);
    static x10_int FMGL(ADD);
    static void FMGL(ADD__do_init)();
    static void FMGL(ADD__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(ADD__status);
    static ::x10::lang::CheckedThrowable* FMGL(ADD__exception);
    static x10_int FMGL(ADD__get)();
    
    static x10_int FMGL(MUL);
    static void FMGL(MUL__do_init)();
    static void FMGL(MUL__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(MUL__status);
    static ::x10::lang::CheckedThrowable* FMGL(MUL__exception);
    static x10_int FMGL(MUL__get)();
    
    static x10_int FMGL(AND);
    static void FMGL(AND__do_init)();
    static void FMGL(AND__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(AND__status);
    static ::x10::lang::CheckedThrowable* FMGL(AND__exception);
    static x10_int FMGL(AND__get)();
    
    static x10_int FMGL(OR);
    static void FMGL(OR__do_init)();
    static void FMGL(OR__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(OR__status);
    static ::x10::lang::CheckedThrowable* FMGL(OR__exception);
    static x10_int FMGL(OR__get)();
    
    static x10_int FMGL(XOR);
    static void FMGL(XOR__do_init)();
    static void FMGL(XOR__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(XOR__status);
    static ::x10::lang::CheckedThrowable* FMGL(XOR__exception);
    static x10_int FMGL(XOR__get)();
    
    static x10_int FMGL(MAX);
    static void FMGL(MAX__do_init)();
    static void FMGL(MAX__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(MAX__status);
    static ::x10::lang::CheckedThrowable* FMGL(MAX__exception);
    static x10_int FMGL(MAX__get)();
    
    static x10_int FMGL(MIN);
    static void FMGL(MIN__do_init)();
    static void FMGL(MIN__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(MIN__status);
    static ::x10::lang::CheckedThrowable* FMGL(MIN__exception);
    static x10_int FMGL(MIN__get)();
    
    template<class TPMGL(T)> void reduce(::x10::lang::Place root,
                                         ::x10::lang::Rail< TPMGL(T) >* src,
                                         x10_long src_off,
                                         ::x10::lang::Rail< TPMGL(T) >* dst,
                                         x10_long dst_off,
                                         x10_long count, x10_int op);
    template<class TPMGL(T)> static void nativeReduce(x10_int id,
                                                      x10_int role,
                                                      x10_int root,
                                                      ::x10::lang::Rail< TPMGL(T) >* src,
                                                      x10_int src_off,
                                                      ::x10::lang::Rail< TPMGL(T) >* dst,
                                                      x10_int dst_off,
                                                      x10_int count,
                                                      x10_int op);
    x10_byte reduce(::x10::lang::Place root, x10_byte src,
                    x10_int op);
    x10_ubyte reduce(::x10::lang::Place root, x10_ubyte src,
                     x10_int op);
    x10_short reduce(::x10::lang::Place root, x10_short src,
                     x10_int op);
    x10_ushort reduce(::x10::lang::Place root, x10_ushort src,
                      x10_int op);
    x10_uint reduce(::x10::lang::Place root, x10_uint src,
                    x10_int op);
    x10_int reduce(::x10::lang::Place root, x10_int src, x10_int op);
    x10_long reduce(::x10::lang::Place root, x10_long src,
                    x10_int op);
    x10_ulong reduce(::x10::lang::Place root, x10_ulong src,
                     x10_int op);
    x10_float reduce(::x10::lang::Place root, x10_float src,
                     x10_int op);
    x10_double reduce(::x10::lang::Place root, x10_double src,
                      x10_int op);
    template<class TPMGL(T)> TPMGL(T) genericReduce(::x10::lang::Place root,
                                                    TPMGL(T) src,
                                                    x10_int op);
    template<class TPMGL(T)> static void nativeReduce(x10_int id,
                                                      x10_int role,
                                                      x10_int root,
                                                      ::x10::lang::Rail< TPMGL(T) >* src,
                                                      ::x10::lang::Rail< TPMGL(T) >* dst,
                                                      x10_int op);
    template<class TPMGL(T)> void allreduce(::x10::lang::Rail< TPMGL(T) >* src,
                                            x10_long src_off,
                                            ::x10::lang::Rail< TPMGL(T) >* dst,
                                            x10_long dst_off,
                                            x10_long count,
                                            x10_int op);
    template<class TPMGL(T)> static void nativeAllreduce(
      x10_int id, x10_int role, ::x10::lang::Rail< TPMGL(T) >* src,
      x10_int src_off, ::x10::lang::Rail< TPMGL(T) >* dst,
      x10_int dst_off, x10_int count, x10_int op);
    x10_byte allreduce(x10_byte src, x10_int op) {
        return (*this)->genericAllreduce< x10_byte >(src,
                                                     op);
        
    }
    x10_ubyte allreduce(x10_ubyte src, x10_int op) {
        return (*this)->genericAllreduce< x10_ubyte >(src,
                                                      op);
        
    }
    x10_short allreduce(x10_short src, x10_int op) {
        return (*this)->genericAllreduce< x10_short >(src,
                                                      op);
        
    }
    x10_ushort allreduce(x10_ushort src, x10_int op) {
        return (*this)->genericAllreduce< x10_ushort >(src,
                                                       op);
        
    }
    x10_uint allreduce(x10_uint src, x10_int op) {
        return (*this)->genericAllreduce< x10_uint >(src,
                                                     op);
        
    }
    x10_int allreduce(x10_int src, x10_int op) {
        return (*this)->genericAllreduce< x10_int >(src, op);
        
    }
    x10_long allreduce(x10_long src, x10_int op) {
        return (*this)->genericAllreduce< x10_long >(src,
                                                     op);
        
    }
    x10_ulong allreduce(x10_ulong src, x10_int op) {
        return (*this)->genericAllreduce< x10_ulong >(src,
                                                      op);
        
    }
    x10_float allreduce(x10_float src, x10_int op) {
        return (*this)->genericAllreduce< x10_float >(src,
                                                      op);
        
    }
    x10_double allreduce(x10_double src, x10_int op) {
        return (*this)->genericAllreduce< x10_double >(src,
                                                       op);
        
    }
    template<class TPMGL(T)> TPMGL(T) genericAllreduce(TPMGL(T) src,
                                                       x10_int op);
    template<class TPMGL(T)> static void nativeAllreduce(
      x10_int id, x10_int role, ::x10::lang::Rail< TPMGL(T) >* src,
      ::x10::lang::Rail< TPMGL(T) >* dst, x10_int op);
    x10_int indexOfMax(x10_double v, x10_int idx);
    static void nativeIndexOfMax(x10_int id, x10_int role,
                                 ::x10::lang::Rail< ::x10::util::Team__DoubleIdx >* src,
                                 ::x10::lang::Rail< ::x10::util::Team__DoubleIdx >* dst);
    x10_int indexOfMin(x10_double v, x10_int idx);
    static void nativeIndexOfMin(x10_int id, x10_int role,
                                 ::x10::lang::Rail< ::x10::util::Team__DoubleIdx >* src,
                                 ::x10::lang::Rail< ::x10::util::Team__DoubleIdx >* dst);
    ::x10::util::Team split(x10_int color, x10_long new_role);
    static void nativeSplit(x10_int id, x10_int role, x10_int color,
                            x10_int new_role, ::x10::lang::Rail< x10_int >* result);
    void _kwd__delete();
    static void nativeDel(x10_int id, x10_int role) {
        x10rt_team_del(id, role, ::x10aux::coll_handler, ::x10aux::coll_enter());
    }
    ::x10::lang::String* toString();
    x10_boolean equals(::x10::util::Team that) {
        return (::x10aux::struct_equals(that->FMGL(id), (*this)->FMGL(id)));
        
    }
    x10_boolean equals(::x10::lang::Any* that);
    x10_int hashCode() {
        return (*this)->FMGL(id);
        
    }
    ::x10::lang::String* typeName();
    x10_boolean _struct_equals(::x10::lang::Any* other);
    x10_boolean _struct_equals(::x10::util::Team other) {
        return ((::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                         other->FMGL(collectiveSupportLevel))) &&
        (::x10aux::struct_equals((*this)->FMGL(id), other->FMGL(id))));
        
    }
    ::x10::util::Team x10__util__Team____this__x10__util__Team(
      ) {
        return (*this);
        
    }
    void __fieldInitializers_x10_util_Team() {
     
    }
    
    static void _serialize(::x10::util::Team this_, ::x10aux::serialization_buffer& buf);
    
    static ::x10::util::Team _deserialize(::x10aux::deserialization_buffer& buf) {
        ::x10::util::Team this_;
        this_->_deserialize_body(buf);
        return this_;
    }
    
    void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};


} } 
#endif // X10_UTIL_TEAM_H

namespace x10 { namespace util { 
class Team;
} } 

#ifndef X10_UTIL_TEAM_H_NODEPS
#define X10_UTIL_TEAM_H_NODEPS
#include <x10/lang/Any.h>
#include <x10/lang/Int.h>
#include <x10/lang/Boolean.h>
#include <x10/compiler/Native.h>
#include <x10/lang/PlaceGroup.h>
#include <x10/lang/PlaceGroup__SimplePlaceGroup.h>
#include <x10/lang/Place.h>
#include <x10/lang/Long.h>
#include <x10/lang/Runtime.h>
#include <x10/util/GrowableRail.h>
#include <x10/util/Team__LocalTeamState.h>
#include <x10/lang/Rail.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/lang/FinishState.h>
#include <x10/lang/Exception.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Byte.h>
#include <x10/lang/UByte.h>
#include <x10/lang/Short.h>
#include <x10/lang/UShort.h>
#include <x10/lang/UInt.h>
#include <x10/lang/ULong.h>
#include <x10/lang/Float.h>
#include <x10/lang/Double.h>
#include <x10/util/Team__DoubleIdx.h>
#include <x10/lang/SparsePlaceGroup.h>
#include <x10/lang/IllegalArgumentException.h>
#include <x10/lang/String.h>
#include <x10/compiler/NonEscaping.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_UTIL_TEAM_H_GENERICS
#define X10_UTIL_TEAM_H_GENERICS
inline x10_boolean x10::util::Team::FMGL(DEBUG__get)() {
    if (FMGL(DEBUG__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(DEBUG__init)();
    }
    return x10::util::Team::FMGL(DEBUG);
}

inline x10_boolean x10::util::Team::FMGL(DEBUGINTERNALS__get)() {
    if (FMGL(DEBUGINTERNALS__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(DEBUGINTERNALS__init)();
    }
    return x10::util::Team::FMGL(DEBUGINTERNALS);
}

inline ::x10::util::Team x10::util::Team::FMGL(WORLD__get)() {
    if (FMGL(WORLD__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(WORLD__init)();
    }
    return x10::util::Team::FMGL(WORLD);
}

inline ::x10::util::GrowableRail<x10_int>* x10::util::Team::FMGL(roles__get)() {
    if (FMGL(roles__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(roles__init)();
    }
    return x10::util::Team::FMGL(roles);
}

inline ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* x10::util::Team::FMGL(state__get)() {
    if (FMGL(state__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(state__init)();
    }
    return x10::util::Team::FMGL(state);
}

inline x10_int x10::util::Team::FMGL(X10RT_COLL_NOCOLLECTIVES__get)() {
    if (FMGL(X10RT_COLL_NOCOLLECTIVES__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(X10RT_COLL_NOCOLLECTIVES__init)();
    }
    return x10::util::Team::FMGL(X10RT_COLL_NOCOLLECTIVES);
}

inline x10_int x10::util::Team::FMGL(X10RT_COLL_BARRIERONLY__get)() {
    if (FMGL(X10RT_COLL_BARRIERONLY__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(X10RT_COLL_BARRIERONLY__init)();
    }
    return x10::util::Team::FMGL(X10RT_COLL_BARRIERONLY);
}

inline x10_int x10::util::Team::FMGL(X10RT_COLL_ALLBLOCKINGCOLLECTIVES__get)() {
    if (FMGL(X10RT_COLL_ALLBLOCKINGCOLLECTIVES__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(X10RT_COLL_ALLBLOCKINGCOLLECTIVES__init)();
    }
    return x10::util::Team::FMGL(X10RT_COLL_ALLBLOCKINGCOLLECTIVES);
}

inline x10_int x10::util::Team::FMGL(X10RT_COLL_NONBLOCKINGBARRIER__get)() {
    if (FMGL(X10RT_COLL_NONBLOCKINGBARRIER__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(X10RT_COLL_NONBLOCKINGBARRIER__init)();
    }
    return x10::util::Team::FMGL(X10RT_COLL_NONBLOCKINGBARRIER);
}

inline x10_int x10::util::Team::FMGL(X10RT_COLL_ALLNONBLOCKINGCOLLECTIVES__get)() {
    if (FMGL(X10RT_COLL_ALLNONBLOCKINGCOLLECTIVES__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(X10RT_COLL_ALLNONBLOCKINGCOLLECTIVES__init)();
    }
    return x10::util::Team::FMGL(X10RT_COLL_ALLNONBLOCKINGCOLLECTIVES);
}

#ifndef X10_UTIL_TEAM_H_scatter_2999
#define X10_UTIL_TEAM_H_scatter_2999
template<class TPMGL(T)> void x10::util::Team::scatter(::x10::lang::Place root,
                                                       ::x10::lang::Rail< TPMGL(T) >* src,
                                                       x10_long src_off,
                                                       ::x10::lang::Rail< TPMGL(T) >* dst,
                                                       x10_long dst_off,
                                                       x10_long count) {
    
    //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if ((::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                 ((x10_int)4)))) {
        {
            
            //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var28 = ::x10::lang::Runtime::startFinish();
            {
                ::x10::lang::CheckedThrowable* throwable__122874 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            ::x10::util::Team::template nativeScatter< TPMGL(T) >(
                              (*this)->FMGL(id), (::x10aux::struct_equals((*this)->FMGL(id),
                                                                          ((x10_int)0)))
                                ? (((x10_int) ((__extension__ ({
                                       ::x10::lang::Place this__122253 =
                                         ::x10::lang::Place::_make(::x10aux::here);
                                       this__122253->FMGL(id);
                                   }))
                                   ))) : ((__extension__ ({
                                              ::x10::util::GrowableRail<x10_int>* this__122255 =
                                                ::x10::util::Team::FMGL(roles__get)();
                                              
                                              //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              x10_long idx__122254 =
                                                ((x10_long)((*this)->FMGL(id)));
                                              x10_int ret__122256;
                                              
                                              //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              ret__122256 =
                                                ::x10aux::nullCheck(::x10aux::nullCheck(this__122255)->FMGL(data))->x10::lang::template Rail< x10_int >::__apply(
                                                  idx__122254);
                                              ret__122256;
                                          }))
                                          ), ((x10_int) (root->FMGL(id))),
                              src, ((x10_int) (src_off)),
                              dst, ((x10_int) (dst_off)),
                              ((x10_int) (count)));
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3000) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3000);
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
                catch (::x10::lang::CheckedThrowable* __exc3001) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__122875 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc3001);
                        {
                            throwable__122874 = formal__122875;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122874)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122874))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122874));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var28);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122874)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122874)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122874));
                    }
                    
                }
                
            }
        }
    } else 
    //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if (((::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                  ((x10_int)2))) || (::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                                                             ((x10_int)3)))))
    {
        
        //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        (*this)->x10::util::Team::barrier();
        {
            
            //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var29 = ::x10::lang::Runtime::startFinish();
            {
                ::x10::lang::CheckedThrowable* throwable__122877 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            ::x10::util::Team::template nativeScatter< TPMGL(T) >(
                              (*this)->FMGL(id), (::x10aux::struct_equals((*this)->FMGL(id),
                                                                          ((x10_int)0)))
                                ? (((x10_int) ((__extension__ ({
                                       ::x10::lang::Place this__122258 =
                                         ::x10::lang::Place::_make(::x10aux::here);
                                       this__122258->FMGL(id);
                                   }))
                                   ))) : ((__extension__ ({
                                              ::x10::util::GrowableRail<x10_int>* this__122260 =
                                                ::x10::util::Team::FMGL(roles__get)();
                                              
                                              //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              x10_long idx__122259 =
                                                ((x10_long)((*this)->FMGL(id)));
                                              x10_int ret__122261;
                                              
                                              //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              ret__122261 =
                                                ::x10aux::nullCheck(::x10aux::nullCheck(this__122260)->FMGL(data))->x10::lang::template Rail< x10_int >::__apply(
                                                  idx__122259);
                                              ret__122261;
                                          }))
                                          ), ((x10_int) (root->FMGL(id))),
                              src, ((x10_int) (src_off)),
                              dst, ((x10_int) (dst_off)),
                              ((x10_int) (count)));
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3002) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3002);
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
                catch (::x10::lang::CheckedThrowable* __exc3003) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__122878 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc3003);
                        {
                            throwable__122877 = formal__122878;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122877)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122877))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122877));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var29);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122877)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122877)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122877));
                    }
                    
                }
                
            }
        }
    } else {
        
        //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10aux::nullCheck((__extension__ ({
            ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122264 =
              ::x10::util::Team::FMGL(state__get)();
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            x10_long idx__122263 = ((x10_long)((*this)->FMGL(id)));
            ::x10::util::Team__LocalTeamState* ret__122265;
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ret__122265 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122264)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                            idx__122263);
            ret__122265;
        }))
        )->template collective_impl< TPMGL(T) >(((x10_int)2),
                                                root, src,
                                                src_off, dst,
                                                dst_off, count,
                                                ((x10_int)0));
    }
    
}
#endif // X10_UTIL_TEAM_H_scatter_2999
#ifndef X10_UTIL_TEAM_H_nativeScatter_3004
#define X10_UTIL_TEAM_H_nativeScatter_3004
template<class TPMGL(T)> void x10::util::Team::nativeScatter(
  x10_int id, x10_int role, x10_int root, ::x10::lang::Rail< TPMGL(T) >* src,
  x10_int src_off, ::x10::lang::Rail< TPMGL(T) >* dst, x10_int dst_off,
  x10_int count) {
    x10rt_scatter(id, role, root, &src->raw[src_off], &dst->raw[dst_off], sizeof(TPMGL(T)), count, ::x10aux::coll_handler, ::x10aux::coll_enter());
}
#endif // X10_UTIL_TEAM_H_nativeScatter_3004
#ifndef X10_UTIL_TEAM_H_bcast_3005
#define X10_UTIL_TEAM_H_bcast_3005
template<class TPMGL(T)> void x10::util::Team::bcast(::x10::lang::Place root,
                                                     ::x10::lang::Rail< TPMGL(T) >* src,
                                                     x10_long src_off,
                                                     ::x10::lang::Rail< TPMGL(T) >* dst,
                                                     x10_long dst_off,
                                                     x10_long count) {
    
    //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if ((::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                 ((x10_int)4)))) {
        {
            
            //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var30 = ::x10::lang::Runtime::startFinish();
            {
                ::x10::lang::CheckedThrowable* throwable__122880 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            ::x10::util::Team::template nativeBcast< TPMGL(T) >(
                              (*this)->FMGL(id), (::x10aux::struct_equals((*this)->FMGL(id),
                                                                          ((x10_int)0)))
                                ? (((x10_int) ((__extension__ ({
                                       ::x10::lang::Place this__122267 =
                                         ::x10::lang::Place::_make(::x10aux::here);
                                       this__122267->FMGL(id);
                                   }))
                                   ))) : ((__extension__ ({
                                              ::x10::util::GrowableRail<x10_int>* this__122269 =
                                                ::x10::util::Team::FMGL(roles__get)();
                                              
                                              //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              x10_long idx__122268 =
                                                ((x10_long)((*this)->FMGL(id)));
                                              x10_int ret__122270;
                                              
                                              //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              ret__122270 =
                                                ::x10aux::nullCheck(::x10aux::nullCheck(this__122269)->FMGL(data))->x10::lang::template Rail< x10_int >::__apply(
                                                  idx__122268);
                                              ret__122270;
                                          }))
                                          ), ((x10_int) (root->FMGL(id))),
                              src, ((x10_int) (src_off)),
                              dst, ((x10_int) (dst_off)),
                              ((x10_int) (count)));
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3006) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3006);
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
                catch (::x10::lang::CheckedThrowable* __exc3007) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__122881 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc3007);
                        {
                            throwable__122880 = formal__122881;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122880)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122880))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122880));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var30);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122880)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122880)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122880));
                    }
                    
                }
                
            }
        }
    } else 
    //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if (((::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                  ((x10_int)2))) || (::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                                                             ((x10_int)3)))))
    {
        
        //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        (*this)->x10::util::Team::barrier();
        {
            
            //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var31 = ::x10::lang::Runtime::startFinish();
            {
                ::x10::lang::CheckedThrowable* throwable__122883 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            ::x10::util::Team::template nativeBcast< TPMGL(T) >(
                              (*this)->FMGL(id), (::x10aux::struct_equals((*this)->FMGL(id),
                                                                          ((x10_int)0)))
                                ? (((x10_int) ((__extension__ ({
                                       ::x10::lang::Place this__122272 =
                                         ::x10::lang::Place::_make(::x10aux::here);
                                       this__122272->FMGL(id);
                                   }))
                                   ))) : ((__extension__ ({
                                              ::x10::util::GrowableRail<x10_int>* this__122274 =
                                                ::x10::util::Team::FMGL(roles__get)();
                                              
                                              //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              x10_long idx__122273 =
                                                ((x10_long)((*this)->FMGL(id)));
                                              x10_int ret__122275;
                                              
                                              //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              ret__122275 =
                                                ::x10aux::nullCheck(::x10aux::nullCheck(this__122274)->FMGL(data))->x10::lang::template Rail< x10_int >::__apply(
                                                  idx__122273);
                                              ret__122275;
                                          }))
                                          ), ((x10_int) (root->FMGL(id))),
                              src, ((x10_int) (src_off)),
                              dst, ((x10_int) (dst_off)),
                              ((x10_int) (count)));
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3008) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3008);
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
                catch (::x10::lang::CheckedThrowable* __exc3009) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__122884 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc3009);
                        {
                            throwable__122883 = formal__122884;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122883)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122883))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122883));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var31);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122883)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122883)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122883));
                    }
                    
                }
                
            }
        }
    } else {
        
        //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10aux::nullCheck((__extension__ ({
            ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122278 =
              ::x10::util::Team::FMGL(state__get)();
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            x10_long idx__122277 = ((x10_long)((*this)->FMGL(id)));
            ::x10::util::Team__LocalTeamState* ret__122279;
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ret__122279 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122278)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                            idx__122277);
            ret__122279;
        }))
        )->template collective_impl< TPMGL(T) >(((x10_int)1),
                                                root, src,
                                                src_off, dst,
                                                dst_off, count,
                                                ((x10_int)0));
    }
    
}
#endif // X10_UTIL_TEAM_H_bcast_3005
#ifndef X10_UTIL_TEAM_H_nativeBcast_3010
#define X10_UTIL_TEAM_H_nativeBcast_3010
template<class TPMGL(T)> void x10::util::Team::nativeBcast(
  x10_int id, x10_int role, x10_int root, ::x10::lang::Rail< TPMGL(T) >* src,
  x10_int src_off, ::x10::lang::Rail< TPMGL(T) >* dst, x10_int dst_off,
  x10_int count) {
    x10rt_bcast(id, role, root, &src->raw[src_off], &dst->raw[dst_off], sizeof(TPMGL(T)), count, ::x10aux::coll_handler, ::x10aux::coll_enter());
}
#endif // X10_UTIL_TEAM_H_nativeBcast_3010
#ifndef X10_UTIL_TEAM_H_alltoall_3011
#define X10_UTIL_TEAM_H_alltoall_3011
template<class TPMGL(T)> void x10::util::Team::alltoall(::x10::lang::Rail< TPMGL(T) >* src,
                                                        x10_long src_off,
                                                        ::x10::lang::Rail< TPMGL(T) >* dst,
                                                        x10_long dst_off,
                                                        x10_long count) {
    
    //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if ((::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                 ((x10_int)4)))) {
        {
            
            //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var32 = ::x10::lang::Runtime::startFinish();
            {
                ::x10::lang::CheckedThrowable* throwable__122886 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            ::x10::util::Team::template nativeAlltoall< TPMGL(T) >(
                              (*this)->FMGL(id), (::x10aux::struct_equals((*this)->FMGL(id),
                                                                          ((x10_int)0)))
                                ? (((x10_int) ((__extension__ ({
                                       ::x10::lang::Place this__122281 =
                                         ::x10::lang::Place::_make(::x10aux::here);
                                       this__122281->FMGL(id);
                                   }))
                                   ))) : ((__extension__ ({
                                              ::x10::util::GrowableRail<x10_int>* this__122283 =
                                                ::x10::util::Team::FMGL(roles__get)();
                                              
                                              //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              x10_long idx__122282 =
                                                ((x10_long)((*this)->FMGL(id)));
                                              x10_int ret__122284;
                                              
                                              //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              ret__122284 =
                                                ::x10aux::nullCheck(::x10aux::nullCheck(this__122283)->FMGL(data))->x10::lang::template Rail< x10_int >::__apply(
                                                  idx__122282);
                                              ret__122284;
                                          }))
                                          ), src, ((x10_int) (src_off)),
                              dst, ((x10_int) (dst_off)),
                              ((x10_int) (count)));
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3012) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3012);
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
                catch (::x10::lang::CheckedThrowable* __exc3013) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__122887 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc3013);
                        {
                            throwable__122886 = formal__122887;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122886)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122886))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122886));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var32);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122886)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122886)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122886));
                    }
                    
                }
                
            }
        }
    } else 
    //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if (((::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                  ((x10_int)2))) || (::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                                                             ((x10_int)3)))))
    {
        
        //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        (*this)->x10::util::Team::barrier();
        {
            
            //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var33 = ::x10::lang::Runtime::startFinish();
            {
                ::x10::lang::CheckedThrowable* throwable__122889 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            ::x10::util::Team::template nativeAlltoall< TPMGL(T) >(
                              (*this)->FMGL(id), (::x10aux::struct_equals((*this)->FMGL(id),
                                                                          ((x10_int)0)))
                                ? (((x10_int) ((__extension__ ({
                                       ::x10::lang::Place this__122286 =
                                         ::x10::lang::Place::_make(::x10aux::here);
                                       this__122286->FMGL(id);
                                   }))
                                   ))) : ((__extension__ ({
                                              ::x10::util::GrowableRail<x10_int>* this__122288 =
                                                ::x10::util::Team::FMGL(roles__get)();
                                              
                                              //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              x10_long idx__122287 =
                                                ((x10_long)((*this)->FMGL(id)));
                                              x10_int ret__122289;
                                              
                                              //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              ret__122289 =
                                                ::x10aux::nullCheck(::x10aux::nullCheck(this__122288)->FMGL(data))->x10::lang::template Rail< x10_int >::__apply(
                                                  idx__122287);
                                              ret__122289;
                                          }))
                                          ), src, ((x10_int) (src_off)),
                              dst, ((x10_int) (dst_off)),
                              ((x10_int) (count)));
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3014) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3014);
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
                catch (::x10::lang::CheckedThrowable* __exc3015) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__122890 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc3015);
                        {
                            throwable__122889 = formal__122890;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122889)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122889))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122889));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var33);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122889)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122889)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122889));
                    }
                    
                }
                
            }
        }
    } else {
        
        //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10aux::nullCheck((__extension__ ({
            ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122292 =
              ::x10::util::Team::FMGL(state__get)();
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            x10_long idx__122291 = ((x10_long)((*this)->FMGL(id)));
            ::x10::util::Team__LocalTeamState* ret__122293;
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ret__122293 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122292)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                            idx__122291);
            ret__122293;
        }))
        )->template collective_impl< TPMGL(T) >(((x10_int)3),
                                                ::x10::lang::Place::FMGL(FIRST_PLACE__get)(),
                                                src, src_off,
                                                dst, dst_off,
                                                count, ((x10_int)0));
    }
    
}
#endif // X10_UTIL_TEAM_H_alltoall_3011
#ifndef X10_UTIL_TEAM_H_nativeAlltoall_3016
#define X10_UTIL_TEAM_H_nativeAlltoall_3016
template<class TPMGL(T)> void x10::util::Team::nativeAlltoall(
  x10_int id, x10_int role, ::x10::lang::Rail< TPMGL(T) >* src,
  x10_int src_off, ::x10::lang::Rail< TPMGL(T) >* dst, x10_int dst_off,
  x10_int count) {
    x10rt_alltoall(id, role, &src->raw[src_off], &dst->raw[dst_off], sizeof(TPMGL(T)), count, ::x10aux::coll_handler, ::x10aux::coll_enter());
}
#endif // X10_UTIL_TEAM_H_nativeAlltoall_3016
inline x10_int x10::util::Team::FMGL(ADD__get)() {
    if (FMGL(ADD__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(ADD__init)();
    }
    return x10::util::Team::FMGL(ADD);
}

inline x10_int x10::util::Team::FMGL(MUL__get)() {
    if (FMGL(MUL__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(MUL__init)();
    }
    return x10::util::Team::FMGL(MUL);
}

inline x10_int x10::util::Team::FMGL(AND__get)() {
    if (FMGL(AND__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(AND__init)();
    }
    return x10::util::Team::FMGL(AND);
}

inline x10_int x10::util::Team::FMGL(OR__get)() {
    if (FMGL(OR__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(OR__init)();
    }
    return x10::util::Team::FMGL(OR);
}

inline x10_int x10::util::Team::FMGL(XOR__get)() {
    if (FMGL(XOR__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(XOR__init)();
    }
    return x10::util::Team::FMGL(XOR);
}

inline x10_int x10::util::Team::FMGL(MAX__get)() {
    if (FMGL(MAX__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(MAX__init)();
    }
    return x10::util::Team::FMGL(MAX);
}

inline x10_int x10::util::Team::FMGL(MIN__get)() {
    if (FMGL(MIN__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(MIN__init)();
    }
    return x10::util::Team::FMGL(MIN);
}

#ifndef X10_UTIL_TEAM_H_reduce_3024
#define X10_UTIL_TEAM_H_reduce_3024
template<class TPMGL(T)> void x10::util::Team::reduce(::x10::lang::Place root,
                                                      ::x10::lang::Rail< TPMGL(T) >* src,
                                                      x10_long src_off,
                                                      ::x10::lang::Rail< TPMGL(T) >* dst,
                                                      x10_long dst_off,
                                                      x10_long count,
                                                      x10_int op) {
    
    //#line 316 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if ((::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                 ((x10_int)4)))) {
        {
            
            //#line 317 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var34 = ::x10::lang::Runtime::startFinish();
            {
                ::x10::lang::CheckedThrowable* throwable__122892 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            ::x10::util::Team::template nativeReduce< TPMGL(T) >(
                              (*this)->FMGL(id), (::x10aux::struct_equals((*this)->FMGL(id),
                                                                          ((x10_int)0)))
                                ? (((x10_int) ((__extension__ ({
                                       ::x10::lang::Place this__122295 =
                                         ::x10::lang::Place::_make(::x10aux::here);
                                       this__122295->FMGL(id);
                                   }))
                                   ))) : ((__extension__ ({
                                              ::x10::util::GrowableRail<x10_int>* this__122297 =
                                                ::x10::util::Team::FMGL(roles__get)();
                                              
                                              //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              x10_long idx__122296 =
                                                ((x10_long)((*this)->FMGL(id)));
                                              x10_int ret__122298;
                                              
                                              //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              ret__122298 =
                                                ::x10aux::nullCheck(::x10aux::nullCheck(this__122297)->FMGL(data))->x10::lang::template Rail< x10_int >::__apply(
                                                  idx__122296);
                                              ret__122298;
                                          }))
                                          ), ((x10_int) (root->FMGL(id))),
                              src, ((x10_int) (src_off)),
                              dst, ((x10_int) (dst_off)),
                              ((x10_int) (count)), op);
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3025) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3025);
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
                catch (::x10::lang::CheckedThrowable* __exc3026) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__122893 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc3026);
                        {
                            throwable__122892 = formal__122893;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122892)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122892))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122892));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var34);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122892)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122892)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122892));
                    }
                    
                }
                
            }
        }
    } else 
    //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if (((::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                  ((x10_int)2))) || (::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                                                             ((x10_int)3)))))
    {
        
        //#line 319 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        (*this)->x10::util::Team::barrier();
        {
            
            //#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var35 = ::x10::lang::Runtime::startFinish();
            {
                ::x10::lang::CheckedThrowable* throwable__122895 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            ::x10::util::Team::template nativeReduce< TPMGL(T) >(
                              (*this)->FMGL(id), (::x10aux::struct_equals((*this)->FMGL(id),
                                                                          ((x10_int)0)))
                                ? (((x10_int) ((__extension__ ({
                                       ::x10::lang::Place this__122300 =
                                         ::x10::lang::Place::_make(::x10aux::here);
                                       this__122300->FMGL(id);
                                   }))
                                   ))) : ((__extension__ ({
                                              ::x10::util::GrowableRail<x10_int>* this__122302 =
                                                ::x10::util::Team::FMGL(roles__get)();
                                              
                                              //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              x10_long idx__122301 =
                                                ((x10_long)((*this)->FMGL(id)));
                                              x10_int ret__122303;
                                              
                                              //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              ret__122303 =
                                                ::x10aux::nullCheck(::x10aux::nullCheck(this__122302)->FMGL(data))->x10::lang::template Rail< x10_int >::__apply(
                                                  idx__122301);
                                              ret__122303;
                                          }))
                                          ), ((x10_int) (root->FMGL(id))),
                              src, ((x10_int) (src_off)),
                              dst, ((x10_int) (dst_off)),
                              ((x10_int) (count)), op);
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3027) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3027);
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
                catch (::x10::lang::CheckedThrowable* __exc3028) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__122896 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc3028);
                        {
                            throwable__122895 = formal__122896;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122895)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122895))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122895));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var35);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122895)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122895)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122895));
                    }
                    
                }
                
            }
        }
    } else {
        
        //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10aux::nullCheck((__extension__ ({
            ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122306 =
              ::x10::util::Team::FMGL(state__get)();
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            x10_long idx__122305 = ((x10_long)((*this)->FMGL(id)));
            ::x10::util::Team__LocalTeamState* ret__122307;
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ret__122307 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122306)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                            idx__122305);
            ret__122307;
        }))
        )->template collective_impl< TPMGL(T) >(((x10_int)4),
                                                root, src,
                                                src_off, dst,
                                                dst_off, count,
                                                op);
    }
    
}
#endif // X10_UTIL_TEAM_H_reduce_3024
#ifndef X10_UTIL_TEAM_H_nativeReduce_3029
#define X10_UTIL_TEAM_H_nativeReduce_3029
template<class TPMGL(T)> void x10::util::Team::nativeReduce(
  x10_int id, x10_int role, x10_int root, ::x10::lang::Rail< TPMGL(T) >* src,
  x10_int src_off, ::x10::lang::Rail< TPMGL(T) >* dst, x10_int dst_off,
  x10_int count, x10_int op) {
    x10rt_reduce(id, role, root, &src->raw[src_off], &dst->raw[dst_off], (x10rt_red_op_type)op, x10rt_get_red_type<TPMGL(T)>(), count, ::x10aux::coll_handler, ::x10aux::coll_enter());
}
#endif // X10_UTIL_TEAM_H_nativeReduce_3029
#ifndef X10_UTIL_TEAM_H_genericReduce_3040
#define X10_UTIL_TEAM_H_genericReduce_3040
template<class TPMGL(T)> TPMGL(T) x10::util::Team::genericReduce(
  ::x10::lang::Place root, TPMGL(T) src, x10_int op) {
    
    //#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    ::x10::lang::Rail< TPMGL(T) >* chk = ::x10::lang::Rail< TPMGL(T) >::_make(((x10_long)1ll),
                                                                              src);
    
    //#line 354 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    ::x10::lang::Rail< TPMGL(T) >* dst = ::x10::lang::Rail< TPMGL(T) >::_make(((x10_long)1ll),
                                                                              src);
    
    //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if ((::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                 ((x10_int)4)))) {
        {
            
            //#line 356 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var36 = ::x10::lang::Runtime::startFinish();
            {
                ::x10::lang::CheckedThrowable* throwable__122898 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            ::x10::util::Team::template nativeReduce< TPMGL(T) >(
                              (*this)->FMGL(id), (::x10aux::struct_equals((*this)->FMGL(id),
                                                                          ((x10_int)0)))
                                ? (((x10_int) ((__extension__ ({
                                       ::x10::lang::Place this__122309 =
                                         ::x10::lang::Place::_make(::x10aux::here);
                                       this__122309->FMGL(id);
                                   }))
                                   ))) : ((__extension__ ({
                                              ::x10::util::GrowableRail<x10_int>* this__122311 =
                                                ::x10::util::Team::FMGL(roles__get)();
                                              
                                              //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              x10_long idx__122310 =
                                                ((x10_long)((*this)->FMGL(id)));
                                              x10_int ret__122312;
                                              
                                              //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              ret__122312 =
                                                ::x10aux::nullCheck(::x10aux::nullCheck(this__122311)->FMGL(data))->x10::lang::template Rail< x10_int >::__apply(
                                                  idx__122310);
                                              ret__122312;
                                          }))
                                          ), ((x10_int) (root->FMGL(id))),
                              chk, dst, op);
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3041) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3041);
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
                catch (::x10::lang::CheckedThrowable* __exc3042) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__122899 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc3042);
                        {
                            throwable__122898 = formal__122899;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122898)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122898))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122898));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var36);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122898)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122898)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122898));
                    }
                    
                }
                
            }
        }
    } else 
    //#line 357 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if (((::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                  ((x10_int)2))) || (::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                                                             ((x10_int)3)))))
    {
        
        //#line 358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        (*this)->x10::util::Team::barrier();
        {
            
            //#line 359 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var37 = ::x10::lang::Runtime::startFinish();
            {
                ::x10::lang::CheckedThrowable* throwable__122901 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            ::x10::util::Team::template nativeReduce< TPMGL(T) >(
                              (*this)->FMGL(id), (::x10aux::struct_equals((*this)->FMGL(id),
                                                                          ((x10_int)0)))
                                ? (((x10_int) ((__extension__ ({
                                       ::x10::lang::Place this__122314 =
                                         ::x10::lang::Place::_make(::x10aux::here);
                                       this__122314->FMGL(id);
                                   }))
                                   ))) : ((__extension__ ({
                                              ::x10::util::GrowableRail<x10_int>* this__122316 =
                                                ::x10::util::Team::FMGL(roles__get)();
                                              
                                              //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              x10_long idx__122315 =
                                                ((x10_long)((*this)->FMGL(id)));
                                              x10_int ret__122317;
                                              
                                              //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              ret__122317 =
                                                ::x10aux::nullCheck(::x10aux::nullCheck(this__122316)->FMGL(data))->x10::lang::template Rail< x10_int >::__apply(
                                                  idx__122315);
                                              ret__122317;
                                          }))
                                          ), ((x10_int) (root->FMGL(id))),
                              chk, dst, op);
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3043) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3043);
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
                catch (::x10::lang::CheckedThrowable* __exc3044) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__122902 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc3044);
                        {
                            throwable__122901 = formal__122902;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122901)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122901))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122901));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var37);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122901)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122901)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122901));
                    }
                    
                }
                
            }
        }
    } else {
        
        //#line 362 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10aux::nullCheck((__extension__ ({
            ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122320 =
              ::x10::util::Team::FMGL(state__get)();
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            x10_long idx__122319 = ((x10_long)((*this)->FMGL(id)));
            ::x10::util::Team__LocalTeamState* ret__122321;
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ret__122321 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122320)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                            idx__122319);
            ret__122321;
        }))
        )->template collective_impl< TPMGL(T) >(((x10_int)4),
                                                root, chk,
                                                ((x10_long)0ll),
                                                dst, ((x10_long)0ll),
                                                ((x10_long)1ll),
                                                op);
    }
    
    //#line 363 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    return dst->x10::lang::template Rail< TPMGL(T) >::__apply(
             ((x10_long)0ll));
    
}
#endif // X10_UTIL_TEAM_H_genericReduce_3040
#ifndef X10_UTIL_TEAM_H_nativeReduce_3045
#define X10_UTIL_TEAM_H_nativeReduce_3045
template<class TPMGL(T)> void x10::util::Team::nativeReduce(
  x10_int id, x10_int role, x10_int root, ::x10::lang::Rail< TPMGL(T) >* src,
  ::x10::lang::Rail< TPMGL(T) >* dst, x10_int op) {
    x10rt_reduce(id, role, root, src->raw, dst->raw, (x10rt_red_op_type)op, x10rt_get_red_type<TPMGL(T)>(), 1, ::x10aux::coll_handler, ::x10aux::coll_enter());
}
#endif // X10_UTIL_TEAM_H_nativeReduce_3045
#ifndef X10_UTIL_TEAM_H_allreduce_3046
#define X10_UTIL_TEAM_H_allreduce_3046
template<class TPMGL(T)> void x10::util::Team::allreduce(
  ::x10::lang::Rail< TPMGL(T) >* src, x10_long src_off, ::x10::lang::Rail< TPMGL(T) >* dst,
  x10_long dst_off, x10_long count, x10_int op) {
    
    //#line 387 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if ((::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                 ((x10_int)4)))) {
        {
            
            //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var38 = ::x10::lang::Runtime::startFinish();
            {
                ::x10::lang::CheckedThrowable* throwable__122904 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            ::x10::util::Team::template nativeAllreduce< TPMGL(T) >(
                              (*this)->FMGL(id), (::x10aux::struct_equals((*this)->FMGL(id),
                                                                          ((x10_int)0)))
                                ? (((x10_int) ((__extension__ ({
                                       ::x10::lang::Place this__122323 =
                                         ::x10::lang::Place::_make(::x10aux::here);
                                       this__122323->FMGL(id);
                                   }))
                                   ))) : ((__extension__ ({
                                              ::x10::util::GrowableRail<x10_int>* this__122325 =
                                                ::x10::util::Team::FMGL(roles__get)();
                                              
                                              //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              x10_long idx__122324 =
                                                ((x10_long)((*this)->FMGL(id)));
                                              x10_int ret__122326;
                                              
                                              //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              ret__122326 =
                                                ::x10aux::nullCheck(::x10aux::nullCheck(this__122325)->FMGL(data))->x10::lang::template Rail< x10_int >::__apply(
                                                  idx__122324);
                                              ret__122326;
                                          }))
                                          ), src, ((x10_int) (src_off)),
                              dst, ((x10_int) (dst_off)),
                              ((x10_int) (count)), op);
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3047) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3047);
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
                catch (::x10::lang::CheckedThrowable* __exc3048) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__122905 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc3048);
                        {
                            throwable__122904 = formal__122905;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122904)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122904))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122904));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var38);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122904)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122904)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122904));
                    }
                    
                }
                
            }
        }
    } else 
    //#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if (((::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                  ((x10_int)2))) || (::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                                                             ((x10_int)3)))))
    {
        
        //#line 393 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        (*this)->x10::util::Team::barrier();
        {
            
            //#line 395 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var39 = ::x10::lang::Runtime::startFinish();
            {
                ::x10::lang::CheckedThrowable* throwable__122907 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            ::x10::util::Team::template nativeAllreduce< TPMGL(T) >(
                              (*this)->FMGL(id), (::x10aux::struct_equals((*this)->FMGL(id),
                                                                          ((x10_int)0)))
                                ? (((x10_int) ((__extension__ ({
                                       ::x10::lang::Place this__122328 =
                                         ::x10::lang::Place::_make(::x10aux::here);
                                       this__122328->FMGL(id);
                                   }))
                                   ))) : ((__extension__ ({
                                              ::x10::util::GrowableRail<x10_int>* this__122330 =
                                                ::x10::util::Team::FMGL(roles__get)();
                                              
                                              //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              x10_long idx__122329 =
                                                ((x10_long)((*this)->FMGL(id)));
                                              x10_int ret__122331;
                                              
                                              //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              ret__122331 =
                                                ::x10aux::nullCheck(::x10aux::nullCheck(this__122330)->FMGL(data))->x10::lang::template Rail< x10_int >::__apply(
                                                  idx__122329);
                                              ret__122331;
                                          }))
                                          ), src, ((x10_int) (src_off)),
                              dst, ((x10_int) (dst_off)),
                              ((x10_int) (count)), op);
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3049) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3049);
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
                catch (::x10::lang::CheckedThrowable* __exc3050) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__122908 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc3050);
                        {
                            throwable__122907 = formal__122908;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122907)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122907))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122907));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var39);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122907)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122907)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122907));
                    }
                    
                }
                
            }
        }
    } else {
        
        //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10aux::nullCheck((__extension__ ({
            ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122334 =
              ::x10::util::Team::FMGL(state__get)();
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            x10_long idx__122333 = ((x10_long)((*this)->FMGL(id)));
            ::x10::util::Team__LocalTeamState* ret__122335;
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ret__122335 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122334)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                            idx__122333);
            ret__122335;
        }))
        )->template collective_impl< TPMGL(T) >(((x10_int)5),
                                                ::x10::lang::Place::FMGL(FIRST_PLACE__get)(),
                                                src, src_off,
                                                dst, dst_off,
                                                count, op);
    }
    
}
#endif // X10_UTIL_TEAM_H_allreduce_3046
#ifndef X10_UTIL_TEAM_H_nativeAllreduce_3051
#define X10_UTIL_TEAM_H_nativeAllreduce_3051
template<class TPMGL(T)> void x10::util::Team::nativeAllreduce(
  x10_int id, x10_int role, ::x10::lang::Rail< TPMGL(T) >* src,
  x10_int src_off, ::x10::lang::Rail< TPMGL(T) >* dst, x10_int dst_off,
  x10_int count, x10_int op) {
    x10rt_allreduce(id, role, &src->raw[src_off], &dst->raw[dst_off], (x10rt_red_op_type)op, x10rt_get_red_type<TPMGL(T)>(), count, ::x10aux::coll_handler, ::x10aux::coll_enter());
}
#endif // X10_UTIL_TEAM_H_nativeAllreduce_3051
#ifndef X10_UTIL_TEAM_H_genericAllreduce_3062
#define X10_UTIL_TEAM_H_genericAllreduce_3062
template<class TPMGL(T)> TPMGL(T) x10::util::Team::genericAllreduce(
  TPMGL(T) src, x10_int op) {
    
    //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    ::x10::lang::Rail< TPMGL(T) >* chk = ::x10::lang::Rail< TPMGL(T) >::_make(((x10_long)1ll),
                                                                              src);
    
    //#line 432 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    ::x10::lang::Rail< TPMGL(T) >* dst = ::x10::lang::Rail< TPMGL(T) >::_make(((x10_long)1ll),
                                                                              src);
    
    //#line 433 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if ((::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                 ((x10_int)4)))) {
        {
            
            //#line 434 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var40 = ::x10::lang::Runtime::startFinish();
            {
                ::x10::lang::CheckedThrowable* throwable__122910 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            ::x10::util::Team::template nativeAllreduce< TPMGL(T) >(
                              (*this)->FMGL(id), (::x10aux::struct_equals((*this)->FMGL(id),
                                                                          ((x10_int)0)))
                                ? (((x10_int) ((__extension__ ({
                                       ::x10::lang::Place this__122337 =
                                         ::x10::lang::Place::_make(::x10aux::here);
                                       this__122337->FMGL(id);
                                   }))
                                   ))) : ((__extension__ ({
                                              ::x10::util::GrowableRail<x10_int>* this__122339 =
                                                ::x10::util::Team::FMGL(roles__get)();
                                              
                                              //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              x10_long idx__122338 =
                                                ((x10_long)((*this)->FMGL(id)));
                                              x10_int ret__122340;
                                              
                                              //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              ret__122340 =
                                                ::x10aux::nullCheck(::x10aux::nullCheck(this__122339)->FMGL(data))->x10::lang::template Rail< x10_int >::__apply(
                                                  idx__122338);
                                              ret__122340;
                                          }))
                                          ), chk, dst, op);
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3063) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3063);
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
                catch (::x10::lang::CheckedThrowable* __exc3064) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__122911 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc3064);
                        {
                            throwable__122910 = formal__122911;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122910)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122910))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122910));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var40);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122910)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122910)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122910));
                    }
                    
                }
                
            }
        }
    } else 
    //#line 435 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    if (((::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                  ((x10_int)2))) || (::x10aux::struct_equals((*this)->FMGL(collectiveSupportLevel),
                                                                             ((x10_int)3)))))
    {
        
        //#line 436 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        (*this)->x10::util::Team::barrier();
        {
            
            //#line 437 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var41 = ::x10::lang::Runtime::startFinish();
            {
                ::x10::lang::CheckedThrowable* throwable__122913 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            ::x10::util::Team::template nativeAllreduce< TPMGL(T) >(
                              (*this)->FMGL(id), (::x10aux::struct_equals((*this)->FMGL(id),
                                                                          ((x10_int)0)))
                                ? (((x10_int) ((__extension__ ({
                                       ::x10::lang::Place this__122342 =
                                         ::x10::lang::Place::_make(::x10aux::here);
                                       this__122342->FMGL(id);
                                   }))
                                   ))) : ((__extension__ ({
                                              ::x10::util::GrowableRail<x10_int>* this__122344 =
                                                ::x10::util::Team::FMGL(roles__get)();
                                              
                                              //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              x10_long idx__122343 =
                                                ((x10_long)((*this)->FMGL(id)));
                                              x10_int ret__122345;
                                              
                                              //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                              ret__122345 =
                                                ::x10aux::nullCheck(::x10aux::nullCheck(this__122344)->FMGL(data))->x10::lang::template Rail< x10_int >::__apply(
                                                  idx__122343);
                                              ret__122345;
                                          }))
                                          ), chk, dst, op);
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc3065) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc3065);
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
                catch (::x10::lang::CheckedThrowable* __exc3066) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__122914 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc3066);
                        {
                            throwable__122913 = formal__122914;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122913)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__122913))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122913));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var41);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__122913)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__122913)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__122913));
                    }
                    
                }
                
            }
        }
    } else {
        
        //#line 440 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
        ::x10aux::nullCheck((__extension__ ({
            ::x10::util::GrowableRail< ::x10::util::Team__LocalTeamState*>* this__122348 =
              ::x10::util::Team::FMGL(state__get)();
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            x10_long idx__122347 = ((x10_long)((*this)->FMGL(id)));
            ::x10::util::Team__LocalTeamState* ret__122349;
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ret__122349 = ::x10aux::nullCheck(::x10aux::nullCheck(this__122348)->FMGL(data))->x10::lang::template Rail< ::x10::util::Team__LocalTeamState* >::__apply(
                            idx__122347);
            ret__122349;
        }))
        )->template collective_impl< TPMGL(T) >(((x10_int)5),
                                                ::x10::lang::Place::FMGL(FIRST_PLACE__get)(),
                                                chk, ((x10_long)0ll),
                                                dst, ((x10_long)0ll),
                                                ((x10_long)1ll),
                                                op);
    }
    
    //#line 441 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Team.x10"
    return dst->x10::lang::template Rail< TPMGL(T) >::__apply(
             ((x10_long)0ll));
    
}
#endif // X10_UTIL_TEAM_H_genericAllreduce_3062
#ifndef X10_UTIL_TEAM_H_nativeAllreduce_3067
#define X10_UTIL_TEAM_H_nativeAllreduce_3067
template<class TPMGL(T)> void x10::util::Team::nativeAllreduce(
  x10_int id, x10_int role, ::x10::lang::Rail< TPMGL(T) >* src,
  ::x10::lang::Rail< TPMGL(T) >* dst, x10_int op) {
    x10rt_allreduce(id, role, src->raw, dst->raw, (x10rt_red_op_type)op, x10rt_get_red_type<TPMGL(T)>(), 1, ::x10aux::coll_handler, ::x10aux::coll_enter());
}
#endif // X10_UTIL_TEAM_H_nativeAllreduce_3067
#endif // X10_UTIL_TEAM_H_GENERICS
#endif // __X10_UTIL_TEAM_H_NODEPS
