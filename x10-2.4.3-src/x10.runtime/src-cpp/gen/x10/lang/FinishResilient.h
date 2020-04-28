#ifndef __X10_LANG_FINISHRESILIENT_H
#define __X10_LANG_FINISHRESILIENT_H

#include <x10rt.h>


#define X10_LANG_FINISHSTATE_H_NODEPS
#include <x10/lang/FinishState.h>
#undef X10_LANG_FINISHSTATE_H_NODEPS
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace util { 
template<class TPMGL(K), class TPMGL(V)> class HashMap;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace io { 
class Printer;
} } 
namespace x10 { namespace io { 
class Console;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace util { 
class Timer;
} } 
namespace x10 { namespace lang { 
class Activity;
} } 
namespace x10 { namespace lang { 
class Exception;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace util { namespace concurrent { 
class SimpleLatch;
} } } 
namespace x10 { namespace lang { 
class FinishResilientSample;
} } 
namespace x10 { namespace lang { 
class FinishResilientPlace0;
} } 
namespace x10 { namespace lang { 
class FinishState__FinishResilientPlaceZero;
} } 
namespace x10 { namespace lang { 
class FinishState__FinishResilientDistributed;
} } 
namespace x10 { namespace lang { 
class FinishState__FinishResilientZooKeeper;
} } 
namespace x10 { namespace lang { 
class UnsupportedOperationException;
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
class ResilientStorePlaceZero;
} } 
namespace x10 { namespace lang { 
class FinishState__FinishResilientDistributedMaster;
} } 
namespace x10 { namespace lang { 
class VoidFun_0_0;
} } 
namespace x10 { namespace lang { 
class Runtime__Profile;
} } 
namespace x10 { namespace lang { 
class Activity__ClockPhases;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Cell;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class GlobalRef;
} } 
namespace x10 { namespace lang { 
class Runtime__AtCheckedWrapper;
} } 
namespace x10 { namespace compiler { 
class RemoteInvocation;
} } 
namespace x10 { namespace lang { 
class Unsafe;
} } 
namespace x10 { namespace lang { 
class MultipleExceptions;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace lang { 
class WrappedThrowable;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(U)> class Fun_0_0;
} } 
namespace x10 { namespace lang { 
class Empty;
} } 
namespace x10 { namespace compiler { 
class StackAllocate;
} } 
namespace x10 { namespace lang { 
class DeadPlaceException;
} } 
namespace x10 { namespace util { namespace concurrent { 
class AtomicBoolean;
} } } 
namespace x10 { namespace lang { 
class Runtime__Pool;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 

class FinishResilient : public ::x10::lang::FinishState   {
    public:
    RTT_H_DECLS_CLASS
    
    using ::x10::lang::FinishState::lowLevelFetch;
    
    static x10_long FMGL(verbose);
    static void FMGL(verbose__do_init)();
    static void FMGL(verbose__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(verbose__status);
    static ::x10::lang::CheckedThrowable* FMGL(verbose__exception);
    static x10_long FMGL(verbose__get)();
    
    static x10_long getEnvLong(::x10::lang::String* name);
    static void debug(::x10::lang::String* msg);
    static void dumpStack(::x10::lang::String* msg);
    static ::x10::lang::FinishState* getCurrentFS();
    static ::x10::lang::FinishState* make(::x10::lang::FinishState* parent,
                                          ::x10::util::concurrent::SimpleLatch* latch);
    static void notifyPlaceDeath();
    virtual ::x10::util::concurrent::SimpleLatch* simpleLatch();
    virtual void runAt(::x10::lang::Place place, ::x10::lang::VoidFun_0_0* body,
                       ::x10::lang::Runtime__Profile* prof);
    virtual ::x10::lang::Any* evalAt(::x10::lang::Place place, ::x10::lang::Fun_0_0< ::x10::lang::Any*>* body,
                                     ::x10::lang::Runtime__Profile* prof);
    static x10_boolean lowLevelSend(::x10::lang::Place dst, ::x10::lang::VoidFun_0_0* cl);
    static x10_boolean lowLevelAt(::x10::lang::Place dst, ::x10::lang::VoidFun_0_0* cl);
    template<class TPMGL(T)> static x10_boolean lowLevelFetch(::x10::lang::Place dst,
                                                              ::x10::lang::Cell<TPMGL(T)>* result,
                                                              ::x10::lang::Fun_0_0<TPMGL(T)>* cl);
    virtual ::x10::lang::FinishResilient* x10__lang__FinishResilient____this__x10__lang__FinishResilient(
      );
    void _constructor();
    
    virtual void __fieldInitializers_x10_lang_FinishResilient(
      );
    
    // Serialization
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};


} } 
#endif // X10_LANG_FINISHRESILIENT_H

namespace x10 { namespace lang { 
class FinishResilient;
} } 

#ifndef X10_LANG_FINISHRESILIENT_H_NODEPS
#define X10_LANG_FINISHRESILIENT_H_NODEPS
#include <x10/lang/FinishState.h>
#include <x10/lang/Long.h>
#include <x10/lang/String.h>
#include <x10/util/HashMap.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Place.h>
#include <x10/io/Printer.h>
#include <x10/io/Console.h>
#include <x10/lang/Any.h>
#include <x10/util/Timer.h>
#include <x10/lang/Activity.h>
#include <x10/lang/Exception.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/util/concurrent/SimpleLatch.h>
#include <x10/lang/Int.h>
#include <x10/lang/FinishResilientSample.h>
#include <x10/lang/FinishResilientPlace0.h>
#include <x10/lang/FinishState__FinishResilientPlaceZero.h>
#include <x10/lang/FinishState__FinishResilientDistributed.h>
#include <x10/lang/FinishState__FinishResilientZooKeeper.h>
#include <x10/lang/UnsupportedOperationException.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/lang/ResilientStorePlaceZero.h>
#include <x10/lang/FinishState__FinishResilientDistributedMaster.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/lang/Activity__ClockPhases.h>
#include <x10/lang/Cell.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/Runtime__AtCheckedWrapper.h>
#include <x10/compiler/RemoteInvocation.h>
#include <x10/lang/Unsafe.h>
#include <x10/lang/MultipleExceptions.h>
#include <x10/lang/Rail.h>
#include <x10/lang/WrappedThrowable.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/lang/Empty.h>
#include <x10/compiler/StackAllocate.h>
#include <x10/lang/DeadPlaceException.h>
#include <x10/util/concurrent/AtomicBoolean.h>
#include <x10/lang/Runtime__Pool.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_FINISHRESILIENT__CLOSURE__11_CLOSURE
#define X10_LANG_FINISHRESILIENT__CLOSURE__11_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_lang_FinishResilient__closure__11 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_FinishResilient__closure__11<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
        {
            ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124537 = ::x10aux::makeStringLit("----lowLevelFetch(home) setting the result and done-flag"); strLit__124537; })));
        }
        
        //#line 354 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        ::x10aux::nullCheck(::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::Cell<TPMGL(T)>* >(gresult))->x10::lang::template Cell<TPMGL(T)>::__apply(
          r__101704);
        
        //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        ::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::util::concurrent::AtomicBoolean* >(done)->x10::util::concurrent::AtomicBoolean::getAndSet(
          true);
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* > gresult;
    TPMGL(T) r__101704;
    ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > done;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->gresult);
        buf.write(this->r__101704);
        buf.write(this->done);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishResilient__closure__11<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_lang_FinishResilient__closure__11<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* > that_gresult = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* > >();
        TPMGL(T) that_r__101704 = buf.read<TPMGL(T)>();
        ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > that_done = buf.read< ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > >();
        x10_lang_FinishResilient__closure__11<TPMGL(T) >* this_ = new (storage) x10_lang_FinishResilient__closure__11<TPMGL(T) >(that_gresult, that_r__101704, that_done);
        return this_;
    }
    
    x10_lang_FinishResilient__closure__11(::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* > gresult, TPMGL(T) r__101704, ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > done) : gresult(gresult), r__101704(r__101704), done(done) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10:352-356";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_FinishResilient__closure__11<TPMGL(T) > >x10_lang_FinishResilient__closure__11<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishResilient__closure__11<TPMGL(T) >::__apply, &x10_lang_FinishResilient__closure__11<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_lang_FinishResilient__closure__11<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishResilient__closure__11<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_FinishResilient__closure__11<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishResilient__closure__11<TPMGL(T) >::_deserialize);
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_FinishResilient__closure__11<TPMGL(T) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishResilient__closure__11<TPMGL(T) >::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

#endif // X10_LANG_FINISHRESILIENT__CLOSURE__11_CLOSURE
#ifndef X10_LANG_FINISHRESILIENT__CLOSURE__12_CLOSURE
#define X10_LANG_FINISHRESILIENT__CLOSURE__12_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_lang_FinishResilient__closure__12 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_FinishResilient__closure__12<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
        {
            ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124538 = ::x10aux::makeStringLit("----lowLevelFetch(home) setting exc and done-flag"); strLit__124538; })));
        }
        
        //#line 361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        ::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::Cell< ::x10::lang::Exception*>* >(exc)->x10::lang::template Cell< ::x10::lang::Exception*>::__apply(
          t__101705);
        
        //#line 362 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        ::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::util::concurrent::AtomicBoolean* >(done)->x10::util::concurrent::AtomicBoolean::getAndSet(
          true);
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* > exc;
    ::x10::lang::Exception* t__101705;
    ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > done;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->exc);
        buf.write(this->t__101705);
        buf.write(this->done);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishResilient__closure__12<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_lang_FinishResilient__closure__12<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* > that_exc = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* > >();
        ::x10::lang::Exception* that_t__101705 = buf.read< ::x10::lang::Exception*>();
        ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > that_done = buf.read< ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > >();
        x10_lang_FinishResilient__closure__12<TPMGL(T) >* this_ = new (storage) x10_lang_FinishResilient__closure__12<TPMGL(T) >(that_exc, that_t__101705, that_done);
        return this_;
    }
    
    x10_lang_FinishResilient__closure__12(::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* > exc, ::x10::lang::Exception* t__101705, ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > done) : exc(exc), t__101705(t__101705), done(done) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10:358-363";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_FinishResilient__closure__12<TPMGL(T) > >x10_lang_FinishResilient__closure__12<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishResilient__closure__12<TPMGL(T) >::__apply, &x10_lang_FinishResilient__closure__12<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_lang_FinishResilient__closure__12<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishResilient__closure__12<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_FinishResilient__closure__12<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishResilient__closure__12<TPMGL(T) >::_deserialize);
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_FinishResilient__closure__12<TPMGL(T) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishResilient__closure__12<TPMGL(T) >::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

#endif // X10_LANG_FINISHRESILIENT__CLOSURE__12_CLOSURE
#ifndef X10_LANG_FINISHRESILIENT__CLOSURE__10_CLOSURE
#define X10_LANG_FINISHRESILIENT__CLOSURE__10_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_lang_FinishResilient__closure__10 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_FinishResilient__closure__10<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 348 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        try {
            
            //#line 349 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
            {
                ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124535 = ::x10aux::makeStringLit("----lowLevelFetch(remote) calling cl()"); strLit__124535; })));
            }
            
            //#line 350 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            TPMGL(T) r__101704 = ::x10::lang::Fun_0_0<TPMGL(T)>::__apply(::x10aux::nullCheck(cl));
            
            //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
            {
                ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124536 = ::x10aux::makeStringLit("----lowLevelFetch(remote) returned from cl()"); strLit__124536; })));
            }
            
            //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            ::x10::lang::Runtime::x10rtSendMessage(::x10::lang::Place::place((done)->location)->FMGL(id),
                                                   reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishResilient__closure__11<TPMGL(T)>)))x10_lang_FinishResilient__closure__11<TPMGL(T)>(gresult, r__101704, done))),
                                                   ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        }
        catch (::x10::lang::CheckedThrowable* __exc896) {
            if (::x10aux::instanceof< ::x10::lang::Exception*>(__exc896)) {
                ::x10::lang::Exception* t__101705 = static_cast< ::x10::lang::Exception*>(__exc896);
                {
                    
                    //#line 358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                    ::x10::lang::Runtime::x10rtSendMessage(
                      ::x10::lang::Place::place((done)->location)->FMGL(id),
                      reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishResilient__closure__12<TPMGL(T)>)))x10_lang_FinishResilient__closure__12<TPMGL(T)>(exc, t__101705, done))),
                      ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                }
            } else
            throw;
        }
        
        //#line 365 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
        {
            ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124539 = ::x10aux::makeStringLit("----lowLevelFetch(remote) finished"); strLit__124539; })));
        }
        
    }
    
    // captured environment
    ::x10::lang::Fun_0_0<TPMGL(T)>* cl;
    ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > done;
    ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* > gresult;
    ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* > exc;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->cl);
        buf.write(this->done);
        buf.write(this->gresult);
        buf.write(this->exc);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishResilient__closure__10<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_lang_FinishResilient__closure__10<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::Fun_0_0<TPMGL(T)>* that_cl = buf.read< ::x10::lang::Fun_0_0<TPMGL(T)>*>();
        ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > that_done = buf.read< ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > >();
        ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* > that_gresult = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* > >();
        ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* > that_exc = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* > >();
        x10_lang_FinishResilient__closure__10<TPMGL(T) >* this_ = new (storage) x10_lang_FinishResilient__closure__10<TPMGL(T) >(that_cl, that_done, that_gresult, that_exc);
        return this_;
    }
    
    x10_lang_FinishResilient__closure__10(::x10::lang::Fun_0_0<TPMGL(T)>* cl, ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > done, ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* > gresult, ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* > exc) : cl(cl), done(done), gresult(gresult), exc(exc) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10:346-366";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_FinishResilient__closure__10<TPMGL(T) > >x10_lang_FinishResilient__closure__10<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishResilient__closure__10<TPMGL(T) >::__apply, &x10_lang_FinishResilient__closure__10<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_lang_FinishResilient__closure__10<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishResilient__closure__10<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_FinishResilient__closure__10<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishResilient__closure__10<TPMGL(T) >::_deserialize);
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_FinishResilient__closure__10<TPMGL(T) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishResilient__closure__10<TPMGL(T) >::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

#endif // X10_LANG_FINISHRESILIENT__CLOSURE__10_CLOSURE
#ifndef X10_LANG_FINISHRESILIENT_H_GENERICS
#define X10_LANG_FINISHRESILIENT_H_GENERICS
inline x10_long x10::lang::FinishResilient::FMGL(verbose__get)() {
    if (FMGL(verbose__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(verbose__init)();
    }
    return x10::lang::FinishResilient::FMGL(verbose);
}

#ifndef X10_LANG_FINISHRESILIENT_H_lowLevelFetch_895
#define X10_LANG_FINISHRESILIENT_H_lowLevelFetch_895
template<class TPMGL(T)> x10_boolean x10::lang::FinishResilient::lowLevelFetch(
  ::x10::lang::Place dst, ::x10::lang::Cell<TPMGL(T)>* result, ::x10::lang::Fun_0_0<TPMGL(T)>* cl) {
    
    //#line 333 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
    {
        ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124528 = ::x10aux::makeStringLit("----lowLevelFetch called, dst.id="); strLit__124528; })), dst->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124529 = ::x10aux::makeStringLit(" ("); strLit__124529; }))), ::x10::lang::Place::_make(::x10aux::here)->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124530 = ::x10aux::makeStringLit("->"); strLit__124530; }))), dst->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124531 = ::x10aux::makeStringLit(")"); strLit__124531; }))));
    }
    
    //#line 334 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if ((::x10aux::struct_equals(::x10::lang::Place::_make(::x10aux::here),
                                 dst))) {
        
        //#line 335 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
        {
            ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124532 = ::x10aux::makeStringLit("----lowLevelFetch locally calling cl()"); strLit__124532; })));
        }
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        TPMGL(T) x__101700 = ::x10::lang::Fun_0_0<TPMGL(T)>::__apply(::x10aux::nullCheck(cl));
        ::x10aux::nullCheck(result)->FMGL(value) = x__101700;
        
        //#line 337 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
        {
            ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124533 = ::x10aux::makeStringLit("----lowLevelFetch locally executed, returning true"); strLit__124533; })));
        }
        
        //#line 338 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        return true;
        
    }
    
    //#line 342 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* > exc =
      ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* >((__extension__ ({
        ::x10::lang::Cell< ::x10::lang::Exception*>* alloc__96927 =
           (new (::x10aux::alloc_z< ::x10::lang::Cell< ::x10::lang::Exception*> >()) ::x10::lang::Cell< ::x10::lang::Exception*>());
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        ::x10::lang::Exception* x__101701 = ::x10aux::class_cast_unchecked< ::x10::lang::Exception*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        alloc__96927->FMGL(value) = (reinterpret_cast< ::x10::lang::Exception*>(reinterpret_cast< ::x10::lang::Exception*>(X10_NULL)));
        alloc__96927;
    }))
    );
    
    //#line 343 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > done =
      ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* >(::x10::util::concurrent::AtomicBoolean::_make(false));
    
    //#line 344 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* > gresult =
      ::x10::lang::GlobalRef< ::x10::lang::Cell<TPMGL(T)>* >(result);
    
    //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
    {
        ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124534 = ::x10aux::makeStringLit("----lowLevelFetch remote execution"); strLit__124534; })));
    }
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    x10_long id__101702 = dst->FMGL(id);
    ::x10::lang::VoidFun_0_0* msgBody__101703 = reinterpret_cast< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishResilient__closure__10<TPMGL(T)>)))x10_lang_FinishResilient__closure__10<TPMGL(T)>(cl, done, gresult, exc))));
    ::x10::lang::Runtime__Profile* prof__101706 = ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
    
    //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::run_closure_at((x10_int)id__101702, msgBody__101703, reinterpret_cast< ::x10::lang::Runtime__Profile*>(X10_NULL), ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 369 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
    {
        ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124540 = ::x10aux::makeStringLit("----lowLevelFetch waiting for done-flag"); strLit__124540; })));
    }
    
    //#line 370 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if (!((done)->__apply()->x10::util::concurrent::AtomicBoolean::get()))
    {
        
        //#line 1559 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
        {
            
            //#line 1560 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10::lang::Runtime::FMGL(pool__get)()->increase();
        }
        
        //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        do {
            
            //#line 373 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)9ll))))
            {
                ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124541 = ::x10aux::makeStringLit("----lowLevelFetch calling x10rtProbe"); strLit__124541; })));
            }
            
            //#line 374 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            ::x10aux::event_probe();
            
            //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)9ll))))
            {
                ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124542 = ::x10aux::makeStringLit("----lowLevelFetch returned from x10rtProbe"); strLit__124542; })));
            }
            
            //#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
            if (x10rt_is_place_dead((x10_int)dst->FMGL(id)))
            {
                
                //#line 1566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
                {
                    
                    //#line 1567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ::x10::lang::Runtime::FMGL(pool__get)()->decrease(
                      ((x10_int)1));
                }
                
                //#line 379 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
                {
                    ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124543 = ::x10aux::makeStringLit("----lowLevelFetch returning false"); strLit__124543; })));
                }
                
                //#line 380 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
                return false;
                
            }
            
        } while (!((done)->__apply()->x10::util::concurrent::AtomicBoolean::get()));
        
        //#line 1566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
        {
            
            //#line 1567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10::lang::Runtime::FMGL(pool__get)()->decrease(
              ((x10_int)1));
        }
        
    }
    
    //#line 385 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
    {
        ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124544 = ::x10aux::makeStringLit("----lowLevelFetch returned from waiting loop"); strLit__124544; })));
    }
    
    //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    ::x10::lang::Exception* t = (__extension__ ({
        ::x10::lang::Cell< ::x10::lang::Exception*>* this__101676 =
          (exc)->__apply();
        this__101676->FMGL(value);
    }))
    ;
    
    //#line 387 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if ((!::x10aux::struct_equals(t, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        
        //#line 388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
        {
            ::x10::lang::FinishResilient::debug(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124545 = ::x10aux::makeStringLit("----lowLevelFetch throwing exception "); strLit__124545; })), t));
        }
        
        //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
        ::x10aux::throwException(::x10aux::nullCheck(t));
    }
    
    //#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    if (((::x10::lang::FinishResilient::FMGL(verbose__get)()) >= (((x10_long)4ll))))
    {
        ::x10::lang::FinishResilient::debug((__extension__ ({ static ::x10::lang::String* strLit__124546 = ::x10aux::makeStringLit("----lowLevelFetch returning true"); strLit__124546; })));
    }
    
    //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishResilient.x10"
    return true;
    
}
#endif // X10_LANG_FINISHRESILIENT_H_lowLevelFetch_895
#endif // X10_LANG_FINISHRESILIENT_H_GENERICS
#endif // __X10_LANG_FINISHRESILIENT_H_NODEPS
