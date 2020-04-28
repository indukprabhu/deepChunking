#ifndef __X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDBACKUP_H
#define __X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDBACKUP_H

#include <x10rt.h>


#define X10_LANG_RUNTIME__MORTAL_H_NODEPS
#include <x10/lang/Runtime__Mortal.h>
#undef X10_LANG_RUNTIME__MORTAL_H_NODEPS
#define X10_LANG_INT_H_NODEPS
#include <x10/lang/Int.h>
#undef X10_LANG_INT_H_NODEPS
#define X10_LANG_GLOBALREF_H_NODEPS
#include <x10/lang/GlobalRef.h>
#undef X10_LANG_GLOBALREF_H_NODEPS
#define X10_LANG_BOOLEAN_H_NODEPS
#include <x10/lang/Boolean.h>
#undef X10_LANG_BOOLEAN_H_NODEPS
#define X10_LANG_BOOLEAN_H_NODEPS
#include <x10/lang/Boolean.h>
#undef X10_LANG_BOOLEAN_H_NODEPS
#define X10_LANG_GLOBALREF_H_NODEPS
#include <x10/lang/GlobalRef.h>
#undef X10_LANG_GLOBALREF_H_NODEPS
namespace x10 { namespace util { 
template<class TPMGL(K), class TPMGL(V)> class HashMap;
} } 
namespace x10 { namespace lang { 
class FinishState__FinishResilientDistributedMaster;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
class VoidFun_0_0;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class Box;
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
namespace x10 { namespace compiler { 
class RemoteInvocation;
} } 
namespace x10 { namespace lang { 
class Runtime__Profile;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(Z1), class TPMGL(U)> class Fun_0_1;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Cell;
} } 
namespace x10 { namespace util { namespace concurrent { 
class AtomicInteger;
} } } 
namespace x10 { namespace util { namespace concurrent { 
class Lock;
} } } 
namespace x10 { namespace util { namespace concurrent { 
class Monitor;
} } } 
namespace x10 { namespace lang { 
class Runtime__Pool;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(Z1)> class VoidFun_0_1;
} } 
namespace x10 { namespace lang { 
class FinishState;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(U)> class Fun_0_0;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class GrowableRail;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 
class Zero;
} } 
namespace x10 { namespace lang { 

class FinishState__FinishResilientDistributedBackup : public ::x10::lang::X10Class
  {
    public:
    RTT_H_DECLS_CLASS
    
    static ::x10aux::itable_entry _itables[3];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static ::x10::lang::Runtime__Mortal::itable< ::x10::lang::FinishState__FinishResilientDistributedBackup > _itable_0;
    
    static ::x10::lang::Any::itable< ::x10::lang::FinishState__FinishResilientDistributedBackup > _itable_1;
    
    virtual x10_boolean _isMortal() { return true; }
    
    static ::x10::util::HashMap< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >, ::x10::lang::FinishState__FinishResilientDistributedBackup*>*
      FMGL(MAP);
    static void FMGL(MAP__do_init)();
    static void FMGL(MAP__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(MAP__status);
    static ::x10::lang::CheckedThrowable* FMGL(MAP__exception);
    static ::x10::util::HashMap< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >, ::x10::lang::FinishState__FinishResilientDistributedBackup*>*
      FMGL(MAP__get)();
    
    static void backupForget(::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > master,
                             ::x10::lang::Place backup_place);
    template<class TPMGL(T)> static x10_boolean backupLowLevelFetch(
      ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > master,
      ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, TPMGL(T)>* cl,
      ::x10::lang::Cell<TPMGL(T)>* cell);
    static x10_boolean backupLowLevelAt(::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > master,
                                        ::x10::lang::VoidFun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*>* cl);
    ::x10::lang::Rail< x10_int >* FMGL(transit);
    
    ::x10::lang::Rail< x10_int >* FMGL(live);
    
    ::x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >*
      FMGL(children);
    
    x10_boolean FMGL(adopted);
    
    ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >
      FMGL(adoptedRoot);
    
    void _constructor(::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > root);
    
    static ::x10::lang::FinishState__FinishResilientDistributedBackup* _make(
             ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > root);
    
    static ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* >
      make(::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > root);
    virtual void notifySubActivitySpawn(x10_long srcId, x10_long dstId);
    virtual x10_boolean notifyActivityCreation(x10_long srcId,
                                               x10_long dstId);
    virtual void notifyActivityTermination(x10_long dstId);
    virtual ::x10::lang::FinishState__FinishResilientDistributedBackup*
      x10__lang__FinishState__FinishResilientDistributedBackup____this__x10__lang__FinishState__FinishResilientDistributedBackup(
      );
    virtual void __fieldInitializers_x10_lang_FinishState_FinishResilientDistributedBackup(
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
#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDBACKUP_H

namespace x10 { namespace lang { 
class FinishState__FinishResilientDistributedBackup;
} } 

#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDBACKUP_H_NODEPS
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDBACKUP_H_NODEPS
#include <x10/lang/Runtime__Mortal.h>
#include <x10/lang/Int.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/Boolean.h>
#include <x10/util/HashMap.h>
#include <x10/lang/FinishState__FinishResilientDistributedMaster.h>
#include <x10/lang/Place.h>
#include <x10/lang/Long.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/Runtime.h>
#include <x10/util/Box.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/compiler/RemoteInvocation.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/lang/Cell.h>
#include <x10/util/concurrent/AtomicInteger.h>
#include <x10/util/concurrent/Lock.h>
#include <x10/util/concurrent/Monitor.h>
#include <x10/lang/Runtime__Pool.h>
#include <x10/lang/VoidFun_0_1.h>
#include <x10/lang/FinishState.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/lang/Rail.h>
#include <x10/util/GrowableRail.h>
#include <x10/compiler/Synthetic.h>
#include <x10/lang/Zero.h>
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDBACKUP__CLOSURE__36_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDBACKUP__CLOSURE__36_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_lang_FinishState__FinishResilientDistributedBackup__closure__36 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_FinishState__FinishResilientDistributedBackup__closure__36<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 1143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::util::concurrent::AtomicInteger* >(done)->x10::util::concurrent::AtomicInteger::set(
          ((x10_int)2));
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicInteger* > done;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->done);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientDistributedBackup__closure__36<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientDistributedBackup__closure__36<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicInteger* > that_done = buf.read< ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicInteger* > >();
        x10_lang_FinishState__FinishResilientDistributedBackup__closure__36<TPMGL(T) >* this_ = new (storage) x10_lang_FinishState__FinishResilientDistributedBackup__closure__36<TPMGL(T) >(that_done);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientDistributedBackup__closure__36(::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicInteger* > done) : done(done) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1142-1144";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_FinishState__FinishResilientDistributedBackup__closure__36<TPMGL(T) > >x10_lang_FinishState__FinishResilientDistributedBackup__closure__36<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientDistributedBackup__closure__36<TPMGL(T) >::__apply, &x10_lang_FinishState__FinishResilientDistributedBackup__closure__36<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_lang_FinishState__FinishResilientDistributedBackup__closure__36<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__FinishResilientDistributedBackup__closure__36<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributedBackup__closure__36<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientDistributedBackup__closure__36<TPMGL(T) >::_deserialize);
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributedBackup__closure__36<TPMGL(T) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishState__FinishResilientDistributedBackup__closure__36<TPMGL(T) >::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDBACKUP__CLOSURE__36_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDBACKUP__CLOSURE__37_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDBACKUP__CLOSURE__37_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_lang_FinishState__FinishResilientDistributedBackup__closure__37 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_FinishState__FinishResilientDistributedBackup__closure__37<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 1150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::util::concurrent::AtomicInteger* >(done)->x10::util::concurrent::AtomicInteger::set(
          ((x10_int)1));
        
        //#line 1151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::Cell<TPMGL(T)>* >(gcell))->x10::lang::template Cell<TPMGL(T)>::__apply(
          r__102482);
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicInteger* > done;
    ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* > gcell;
    TPMGL(T) r__102482;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->done);
        buf.write(this->gcell);
        buf.write(this->r__102482);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientDistributedBackup__closure__37<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientDistributedBackup__closure__37<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicInteger* > that_done = buf.read< ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicInteger* > >();
        ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* > that_gcell = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* > >();
        TPMGL(T) that_r__102482 = buf.read<TPMGL(T)>();
        x10_lang_FinishState__FinishResilientDistributedBackup__closure__37<TPMGL(T) >* this_ = new (storage) x10_lang_FinishState__FinishResilientDistributedBackup__closure__37<TPMGL(T) >(that_done, that_gcell, that_r__102482);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientDistributedBackup__closure__37(::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicInteger* > done, ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* > gcell, TPMGL(T) r__102482) : done(done), gcell(gcell), r__102482(r__102482) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1149-1152";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_FinishState__FinishResilientDistributedBackup__closure__37<TPMGL(T) > >x10_lang_FinishState__FinishResilientDistributedBackup__closure__37<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientDistributedBackup__closure__37<TPMGL(T) >::__apply, &x10_lang_FinishState__FinishResilientDistributedBackup__closure__37<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_lang_FinishState__FinishResilientDistributedBackup__closure__37<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__FinishResilientDistributedBackup__closure__37<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributedBackup__closure__37<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientDistributedBackup__closure__37<TPMGL(T) >::_deserialize);
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributedBackup__closure__37<TPMGL(T) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishState__FinishResilientDistributedBackup__closure__37<TPMGL(T) >::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDBACKUP__CLOSURE__37_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDBACKUP__CLOSURE__35_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDBACKUP__CLOSURE__35_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_lang_FinishState__FinishResilientDistributedBackup__closure__35 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_FinishState__FinishResilientDistributedBackup__closure__35<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 1136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        try {
            
            //#line 1137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->lock();
            
            //#line 1138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::lang::FinishState__FinishResilientDistributedBackup* bup__102481 =
              ::x10::lang::FinishState__FinishResilientDistributedBackup::FMGL(MAP__get)()->getOrElse(
                master, ::x10aux::class_cast_unchecked< ::x10::lang::FinishState__FinishResilientDistributedBackup*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            
            //#line 1139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            if ((::x10aux::struct_equals(bup__102481, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
            {
                
                //#line 1141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->release();
                
                //#line 1142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                ::x10::lang::Runtime::x10rtSendMessage(::x10::lang::Place::place((gcell)->location)->FMGL(id),
                                                       reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__FinishResilientDistributedBackup__closure__36<TPMGL(T)>)))x10_lang_FinishState__FinishResilientDistributedBackup__closure__36<TPMGL(T)>(done))),
                                                       ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            } else {
                
                //#line 1147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                TPMGL(T) r__102482 = ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, TPMGL(T)>::__apply(::x10aux::nullCheck(cl), 
                  bup__102481);
                
                //#line 1148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->release();
                
                //#line 1149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                ::x10::lang::Runtime::x10rtSendMessage(::x10::lang::Place::place((gcell)->location)->FMGL(id),
                                                       reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__FinishResilientDistributedBackup__closure__37<TPMGL(T)>)))x10_lang_FinishState__FinishResilientDistributedBackup__closure__37<TPMGL(T)>(done, gcell, r__102482))),
                                                       ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            }
            
        }
        catch (::x10::lang::CheckedThrowable* __exc1080) {
            if (true) {
                ::x10::lang::CheckedThrowable* t__102483 =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1080);
                {
                    
                    //#line 1155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->release();
                    
                    //#line 1156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    ::x10aux::nullCheck(t__102483)->printStackTrace();
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > master;
    ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* > gcell;
    ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicInteger* > done;
    ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, TPMGL(T)>* cl;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->master);
        buf.write(this->gcell);
        buf.write(this->done);
        buf.write(this->cl);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientDistributedBackup__closure__35<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientDistributedBackup__closure__35<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > that_master = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >();
        ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* > that_gcell = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* > >();
        ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicInteger* > that_done = buf.read< ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicInteger* > >();
        ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, TPMGL(T)>* that_cl = buf.read< ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, TPMGL(T)>*>();
        x10_lang_FinishState__FinishResilientDistributedBackup__closure__35<TPMGL(T) >* this_ = new (storage) x10_lang_FinishState__FinishResilientDistributedBackup__closure__35<TPMGL(T) >(that_master, that_gcell, that_done, that_cl);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientDistributedBackup__closure__35(::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > master, ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* > gcell, ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicInteger* > done, ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, TPMGL(T)>* cl) : master(master), gcell(gcell), done(done), cl(cl) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1135-1158";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_FinishState__FinishResilientDistributedBackup__closure__35<TPMGL(T) > >x10_lang_FinishState__FinishResilientDistributedBackup__closure__35<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientDistributedBackup__closure__35<TPMGL(T) >::__apply, &x10_lang_FinishState__FinishResilientDistributedBackup__closure__35<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_lang_FinishState__FinishResilientDistributedBackup__closure__35<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__FinishResilientDistributedBackup__closure__35<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributedBackup__closure__35<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientDistributedBackup__closure__35<TPMGL(T) >::_deserialize);
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributedBackup__closure__35<TPMGL(T) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishState__FinishResilientDistributedBackup__closure__35<TPMGL(T) >::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDBACKUP__CLOSURE__35_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDBACKUP_H_GENERICS
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDBACKUP_H_GENERICS
inline ::x10::util::HashMap< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >, ::x10::lang::FinishState__FinishResilientDistributedBackup*>*
  x10::lang::FinishState__FinishResilientDistributedBackup::FMGL(MAP__get)() {
    if (FMGL(MAP__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(MAP__init)();
    }
    return x10::lang::FinishState__FinishResilientDistributedBackup::FMGL(MAP);
}

#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDBACKUP_H_backupLowLevelFetch_1078
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDBACKUP_H_backupLowLevelFetch_1078
template<class TPMGL(T)> x10_boolean x10::lang::FinishState__FinishResilientDistributedBackup::backupLowLevelFetch(
  ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > master,
  ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, TPMGL(T)>* cl,
  ::x10::lang::Cell<TPMGL(T)>* cell) {
    
    //#line 1118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Place place = ::x10::lang::Place::place((master)->location);
    
    //#line 1119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    while (true) {
        
        //#line 1120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        place = place->x10::lang::Place::next(((x10_long)1ll));
        
        //#line 1121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if ((::x10aux::struct_equals(place, ::x10::lang::Place::place((master)->location))))
        {
            return false;
            
        }
        
        //#line 1122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicInteger* > done =
          ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicInteger* >(::x10::util::concurrent::AtomicInteger::_make(((x10_int)0)));
        
        //#line 1123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* > gcell =
          ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* >(cell);
        
        //#line 1124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if ((::x10aux::struct_equals(place, ::x10::lang::Place::_make(::x10aux::here))))
        {
            {
                
                //#line 1125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                ::x10::lang::CheckedThrowable* throwable__102630 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    {
                        ::x10::lang::Runtime::enterAtomic();
                        {
                            
                            //#line 1126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                            ::x10::lang::FinishState__FinishResilientDistributedBackup* bup =
                              ::x10::lang::FinishState__FinishResilientDistributedBackup::FMGL(MAP__get)()->getOrElse(
                                master, ::x10aux::class_cast_unchecked< ::x10::lang::FinishState__FinishResilientDistributedBackup*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                            
                            //#line 1127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                            if ((::x10aux::struct_equals(bup,
                                                         reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
                            {
                                
                                //#line 1128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                                (done)->__apply()->x10::util::concurrent::AtomicInteger::set(
                                  ((x10_int)2));
                            } else {
                                
                                //#line 1130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                                (done)->__apply()->x10::util::concurrent::AtomicInteger::set(
                                  ((x10_int)1));
                                
                                //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
                                TPMGL(T) x__102478 = ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, TPMGL(T)>::__apply(::x10aux::nullCheck(cl), 
                                  bup);
                                ::x10aux::nullCheck(cell)->FMGL(value) =
                                  x__102478;
                            }
                            
                        }
                    }
                    ::x10::compiler::Finalization::plausibleThrow();
                }
                catch (::x10::lang::CheckedThrowable* __exc1079) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__102631 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc1079);
                        {
                            throwable__102630 = formal__102631;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__102630)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__102630))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__102630));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::exitAtomic();
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__102630)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__102630)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__102630));
                    }
                    
                }
                
            }
        } else {
            
            //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            x10_long id__102479 = place->FMGL(id);
            ::x10::lang::VoidFun_0_0* msgBody__102480 = reinterpret_cast< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__FinishResilientDistributedBackup__closure__35<TPMGL(T)>)))x10_lang_FinishState__FinishResilientDistributedBackup__closure__35<TPMGL(T)>(master, gcell, done, cl))));
            ::x10::lang::Runtime__Profile* prof__102484 =
              ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            
            //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10aux::run_closure_at((x10_int)id__102479, msgBody__102480, reinterpret_cast< ::x10::lang::Runtime__Profile*>(X10_NULL), ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            
            //#line 1166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            if ((::x10aux::struct_equals((done)->__apply()->x10::util::concurrent::AtomicInteger::get(),
                                         ((x10_int)0)))) {
                
                //#line 1559 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
                {
                    
                    //#line 1560 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ::x10::lang::Runtime::FMGL(pool__get)()->increase();
                }
                
                //#line 1168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                do {
                    
                    //#line 1169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    ::x10aux::event_probe();
                    
                    //#line 1170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    if (x10rt_is_place_dead((x10_int)place->FMGL(id)))
                    {
                        
                        //#line 1566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
                        {
                            
                            //#line 1567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            ::x10::lang::Runtime::FMGL(pool__get)()->decrease(
                              ((x10_int)1));
                        }
                        
                        //#line 1172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                        return false;
                        
                    }
                    
                } while ((::x10aux::struct_equals((done)->__apply()->x10::util::concurrent::AtomicInteger::get(),
                                                  ((x10_int)0))));
                
                //#line 1566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
                {
                    
                    //#line 1567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ::x10::lang::Runtime::FMGL(pool__get)()->decrease(
                      ((x10_int)1));
                }
                
            }
            
        }
        
        //#line 1178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if ((::x10aux::struct_equals((done)->__apply()->x10::util::concurrent::AtomicInteger::get(),
                                     ((x10_int)1)))) {
            return true;
            
        }
        
    }
    
}
#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDBACKUP_H_backupLowLevelFetch_1078
#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDBACKUP_H_GENERICS
#endif // __X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDBACKUP_H_NODEPS
