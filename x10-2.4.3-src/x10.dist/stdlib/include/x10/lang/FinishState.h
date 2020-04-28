#ifndef __X10_LANG_FINISHSTATE_H
#define __X10_LANG_FINISHSTATE_H

#include <x10rt.h>


namespace x10 { namespace lang { 
class Configuration;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
class Exception;
} } 
namespace x10 { namespace util { namespace concurrent { 
class SimpleLatch;
} } } 
namespace x10 { namespace lang { 
class VoidFun_0_0;
} } 
namespace x10 { namespace lang { 
class Runtime__Profile;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(U)> class Fun_0_0;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class GlobalRef;
} } 
namespace x10 { namespace lang { 
class FinishState__UncountedFinish;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace util { namespace concurrent { 
class AtomicBoolean;
} } } 
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace compiler { 
class RemoteInvocation;
} } 
namespace x10 { namespace lang { 
class Runtime__Pool;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Cell;
} } 
namespace x10 { namespace lang { 
class FinishResilient;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 

class FinishState : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    static x10_boolean FMGL(VERBOSE);
    static void FMGL(VERBOSE__do_init)();
    static void FMGL(VERBOSE__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(VERBOSE__status);
    static ::x10::lang::CheckedThrowable* FMGL(VERBOSE__exception);
    static x10_boolean FMGL(VERBOSE__get)();
    
    virtual void notifySubActivitySpawn(::x10::lang::Place place) = 0;
    virtual x10_boolean notifyActivityCreation(::x10::lang::Place srcPlace) = 0;
    virtual void notifyActivityTermination() = 0;
    virtual void pushException(::x10::lang::Exception* t) = 0;
    virtual void waitForFinish() = 0;
    virtual ::x10::util::concurrent::SimpleLatch* simpleLatch() = 0;
    virtual void runAt(::x10::lang::Place place, ::x10::lang::VoidFun_0_0* body,
                       ::x10::lang::Runtime__Profile* prof) = 0;
    virtual ::x10::lang::Any* evalAt(::x10::lang::Place place, ::x10::lang::Fun_0_0< ::x10::lang::Any*>* body,
                                     ::x10::lang::Runtime__Profile* prof) = 0;
    template<class TPMGL(T)> static TPMGL(T) deref(::x10::lang::GlobalRef< ::x10::lang::FinishState* > root);
    static ::x10::lang::FinishState__UncountedFinish* FMGL(UNCOUNTED_FINISH);
    static void FMGL(UNCOUNTED_FINISH__do_init)();
    static void FMGL(UNCOUNTED_FINISH__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(UNCOUNTED_FINISH__status);
    static ::x10::lang::CheckedThrowable* FMGL(UNCOUNTED_FINISH__exception);
    static ::x10::lang::FinishState__UncountedFinish* FMGL(UNCOUNTED_FINISH__get)();
    
    static x10_boolean lowLevelAt(::x10::lang::Place dst, ::x10::lang::VoidFun_0_0* cl);
    template<class TPMGL(T)> static x10_boolean lowLevelFetch(::x10::lang::Place dst,
                                                              ::x10::lang::Fun_0_0<TPMGL(T)>* cl,
                                                              ::x10::lang::Cell<TPMGL(T)>* cell);
    static void notifyPlaceDeath();
    virtual ::x10::lang::FinishState* x10__lang__FinishState____this__x10__lang__FinishState(
      );
    void _constructor();
    
    virtual void __fieldInitializers_x10_lang_FinishState(
      );
    
    // Serialization
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};


} } 
#endif // X10_LANG_FINISHSTATE_H

namespace x10 { namespace lang { 
class FinishState;
} } 

#ifndef X10_LANG_FINISHSTATE_H_NODEPS
#define X10_LANG_FINISHSTATE_H_NODEPS
#include <x10/lang/Boolean.h>
#include <x10/lang/Configuration.h>
#include <x10/lang/Place.h>
#include <x10/lang/Exception.h>
#include <x10/util/concurrent/SimpleLatch.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/lang/Any.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/FinishState__UncountedFinish.h>
#include <x10/lang/Runtime.h>
#include <x10/util/concurrent/AtomicBoolean.h>
#include <x10/lang/Long.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/compiler/RemoteInvocation.h>
#include <x10/lang/Runtime__Pool.h>
#include <x10/lang/Cell.h>
#include <x10/lang/Int.h>
#include <x10/lang/FinishResilient.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_FINISHSTATE__CLOSURE__4_CLOSURE
#define X10_LANG_FINISHSTATE__CLOSURE__4_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_lang_FinishState__closure__4 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_FinishState__closure__4<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 1074 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::util::concurrent::AtomicBoolean* >(done)->x10::util::concurrent::AtomicBoolean::getAndSet(
          true);
        
        //#line 1075 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::Cell<TPMGL(T)>* >(gcell))->x10::lang::template Cell<TPMGL(T)>::__apply(
          r__102471);
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > done;
    ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* > gcell;
    TPMGL(T) r__102471;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->done);
        buf.write(this->gcell);
        buf.write(this->r__102471);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__closure__4<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_lang_FinishState__closure__4<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > that_done = buf.read< ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > >();
        ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* > that_gcell = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* > >();
        TPMGL(T) that_r__102471 = buf.read<TPMGL(T)>();
        x10_lang_FinishState__closure__4<TPMGL(T) >* this_ = new (storage) x10_lang_FinishState__closure__4<TPMGL(T) >(that_done, that_gcell, that_r__102471);
        return this_;
    }
    
    x10_lang_FinishState__closure__4(::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > done, ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* > gcell, TPMGL(T) r__102471) : done(done), gcell(gcell), r__102471(r__102471) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1073-1076";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_FinishState__closure__4<TPMGL(T) > >x10_lang_FinishState__closure__4<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__closure__4<TPMGL(T) >::__apply, &x10_lang_FinishState__closure__4<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_lang_FinishState__closure__4<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__closure__4<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_FinishState__closure__4<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__closure__4<TPMGL(T) >::_deserialize);
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_FinishState__closure__4<TPMGL(T) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishState__closure__4<TPMGL(T) >::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

#endif // X10_LANG_FINISHSTATE__CLOSURE__4_CLOSURE
#ifndef X10_LANG_FINISHSTATE__CLOSURE__3_CLOSURE
#define X10_LANG_FINISHSTATE__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_lang_FinishState__closure__3 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_FinishState__closure__3<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 1071 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        try {
            
            //#line 1072 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            TPMGL(T) r__102471 = ::x10::lang::Fun_0_0<TPMGL(T)>::__apply(::x10aux::nullCheck(cl));
            
            //#line 1073 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::lang::Runtime::x10rtSendMessage(::x10::lang::Place::place((gcell)->location)->FMGL(id),
                                                   reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__closure__4<TPMGL(T)>)))x10_lang_FinishState__closure__4<TPMGL(T)>(done, gcell, r__102471))),
                                                   ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        }
        catch (::x10::lang::CheckedThrowable* __exc913) {
            if (true) {
                ::x10::lang::CheckedThrowable* t__102472 =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc913);
                {
                    
                    //#line 1078 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    ::x10aux::nullCheck(t__102472)->printStackTrace();
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::Fun_0_0<TPMGL(T)>* cl;
    ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* > gcell;
    ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > done;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->cl);
        buf.write(this->gcell);
        buf.write(this->done);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__closure__3<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_lang_FinishState__closure__3<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::Fun_0_0<TPMGL(T)>* that_cl = buf.read< ::x10::lang::Fun_0_0<TPMGL(T)>*>();
        ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* > that_gcell = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* > >();
        ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > that_done = buf.read< ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > >();
        x10_lang_FinishState__closure__3<TPMGL(T) >* this_ = new (storage) x10_lang_FinishState__closure__3<TPMGL(T) >(that_cl, that_gcell, that_done);
        return this_;
    }
    
    x10_lang_FinishState__closure__3(::x10::lang::Fun_0_0<TPMGL(T)>* cl, ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* > gcell, ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > done) : cl(cl), gcell(gcell), done(done) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1070-1080";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_FinishState__closure__3<TPMGL(T) > >x10_lang_FinishState__closure__3<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__closure__3<TPMGL(T) >::__apply, &x10_lang_FinishState__closure__3<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_lang_FinishState__closure__3<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__closure__3<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_FinishState__closure__3<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__closure__3<TPMGL(T) >::_deserialize);
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_FinishState__closure__3<TPMGL(T) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishState__closure__3<TPMGL(T) >::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

#endif // X10_LANG_FINISHSTATE__CLOSURE__3_CLOSURE
#ifndef X10_LANG_FINISHSTATE_H_GENERICS
#define X10_LANG_FINISHSTATE_H_GENERICS
inline x10_boolean x10::lang::FinishState::FMGL(VERBOSE__get)() {
    if (FMGL(VERBOSE__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(VERBOSE__init)();
    }
    return x10::lang::FinishState::FMGL(VERBOSE);
}

#ifndef X10_LANG_FINISHSTATE_H_deref_908
#define X10_LANG_FINISHSTATE_H_deref_908
template<class TPMGL(T)> TPMGL(T) x10::lang::FinishState::deref(::x10::lang::GlobalRef< ::x10::lang::FinishState* > root) {
    return ::x10aux::class_cast<TPMGL(T)>((root)->__apply());
    
}
#endif // X10_LANG_FINISHSTATE_H_deref_908
inline ::x10::lang::FinishState__UncountedFinish* x10::lang::FinishState::FMGL(UNCOUNTED_FINISH__get)() {
    if (FMGL(UNCOUNTED_FINISH__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(UNCOUNTED_FINISH__init)();
    }
    return x10::lang::FinishState::FMGL(UNCOUNTED_FINISH);
}

#ifndef X10_LANG_FINISHSTATE_H_lowLevelFetch_912
#define X10_LANG_FINISHSTATE_H_lowLevelFetch_912
template<class TPMGL(T)> x10_boolean x10::lang::FinishState::lowLevelFetch(
  ::x10::lang::Place dst, ::x10::lang::Fun_0_0<TPMGL(T)>* cl, ::x10::lang::Cell<TPMGL(T)>* cell) {
    
    //#line 1064 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(::x10::lang::Place::_make(::x10aux::here),
                                 dst))) {
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        TPMGL(T) x__102468 = ::x10::lang::Fun_0_0<TPMGL(T)>::__apply(::x10aux::nullCheck(cl));
        ::x10aux::nullCheck(cell)->FMGL(value) = x__102468;
        
        //#line 1066 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        return true;
        
    } else {
        
        //#line 1068 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > done =
          ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* >(::x10::util::concurrent::AtomicBoolean::_make(false));
        
        //#line 1069 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* > gcell = ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* >(cell);
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10_long id__102469 = dst->FMGL(id);
        ::x10::lang::VoidFun_0_0* msgBody__102470 = reinterpret_cast< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__closure__3<TPMGL(T)>)))x10_lang_FinishState__closure__3<TPMGL(T)>(cl, gcell, done))));
        ::x10::lang::Runtime__Profile* prof__102473 = ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::run_closure_at((x10_int)id__102469, msgBody__102470, reinterpret_cast< ::x10::lang::Runtime__Profile*>(X10_NULL), ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
        //#line 1088 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (!((done)->__apply()->x10::util::concurrent::AtomicBoolean::get()))
        {
            
            //#line 1559 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)())) {
                
                //#line 1560 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                ::x10::lang::Runtime::FMGL(pool__get)()->increase();
            }
            
            //#line 1090 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            do {
                
                //#line 1091 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                ::x10aux::event_probe();
                
                //#line 1092 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                if (x10rt_is_place_dead((x10_int)dst->FMGL(id))) {
                    
                    //#line 1566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
                    {
                        
                        //#line 1567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        ::x10::lang::Runtime::FMGL(pool__get)()->decrease(
                          ((x10_int)1));
                    }
                    
                    //#line 1094 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    return false;
                    
                }
                
            } while (!((done)->__apply()->x10::util::concurrent::AtomicBoolean::get()));
            
            //#line 1566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)())) {
                
                //#line 1567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                ::x10::lang::Runtime::FMGL(pool__get)()->decrease(((x10_int)1));
            }
            
        }
        
        //#line 1100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        return true;
        
    }
    
}
#endif // X10_LANG_FINISHSTATE_H_lowLevelFetch_912
#endif // X10_LANG_FINISHSTATE_H_GENERICS
#endif // __X10_LANG_FINISHSTATE_H_NODEPS
