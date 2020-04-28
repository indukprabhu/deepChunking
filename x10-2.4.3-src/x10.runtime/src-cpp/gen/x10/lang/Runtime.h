#ifndef __X10_LANG_RUNTIME_H
#define __X10_LANG_RUNTIME_H

#include <x10rt.h>

#include "x10/lang/RuntimeNatives.h"

namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace compiler { 
class Native;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace lang { 
class VoidFun_0_0;
} } 
namespace x10 { namespace lang { 
class Runtime__Profile;
} } 
namespace x10 { namespace lang { 
class FinishState;
} } 
namespace x10 { namespace util { 
class Timer;
} } 
namespace x10 { namespace io { 
class Serializer;
} } 
namespace x10 { namespace compiler { 
class StackAllocate;
} } 
namespace x10 { namespace io { 
class Deserializer;
} } 
namespace x10 { namespace util { 
template<class TPMGL(K), class TPMGL(V)> class HashMap;
} } 
namespace x10 { namespace lang { 
class Configuration;
} } 
namespace x10 { namespace io { 
class Reader;
} } 
namespace x10 { namespace io { 
class Writer;
} } 
namespace x10 { namespace util { namespace concurrent { 
class Monitor;
} } } 
namespace x10 { namespace lang { 
class Runtime__Pool;
} } 
namespace x10 { namespace lang { 
class FinishState__FinishStates;
} } 
namespace x10 { namespace lang { 
class Runtime__Workers;
} } 
namespace x10 { namespace lang { 
class Deque;
} } 
namespace x10 { namespace lang { 
class Runtime__Worker;
} } 
namespace x10 { namespace lang { 
class Thread;
} } 
namespace x10 { namespace lang { 
class Activity;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace util { namespace concurrent { 
class SimpleLatch;
} } } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Cell;
} } 
namespace x10 { namespace lang { 
class FinishState__UncountedFinish;
} } 
namespace x10 { namespace lang { 
class Runtime__Watcher;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace lang { 
class Exception;
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
class MultipleExceptions;
} } 
namespace x10 { namespace util { namespace concurrent { 
class Condition;
} } } 
namespace x10 { namespace compiler { 
class RemoteInvocation;
} } 
namespace x10 { namespace lang { 
class Math;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace lang { 
class Clock;
} } 
namespace x10 { namespace lang { 
class Activity__ClockPhases;
} } 
namespace x10 { namespace lang { 
class Unsafe;
} } 
namespace x10 { namespace lang { 
class Error;
} } 
namespace x10 { namespace lang { 
class Runtime__AtCheckedWrapper;
} } 
namespace x10 { namespace lang { 
class Runtime__RemoteControl;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class GlobalRef;
} } 
namespace x10 { namespace compiler { 
class AsyncClosure;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(U)> class Fun_0_0;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Runtime__Remote;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class Box;
} } 
namespace x10 { namespace util { namespace concurrent { 
class Lock;
} } } 
namespace x10 { namespace lang { 
class FinishState__Finish;
} } 
namespace x10 { namespace lang { 
class FinishState__RootFinish;
} } 
namespace x10 { namespace lang { 
class FinishResilient;
} } 
namespace x10 { namespace lang { 
class FinishState__FinishAsync;
} } 
namespace x10 { namespace lang { 
class FinishState__FinishHere;
} } 
namespace x10 { namespace lang { 
class FinishState__FinishSPMD;
} } 
namespace x10 { namespace lang { 
class FinishState__LocalFinish;
} } 
namespace x10 { namespace lang { 
class FinishState__DenseFinish;
} } 
namespace x10 { namespace lang { 
class FinishState__FinishResilientPlaceZero;
} } 
namespace x10 { namespace lang { 
class FinishState__FinishResilientZooKeeper;
} } 
namespace x10 { namespace lang { 
class FinishState__FinishResilientDistributed;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Reducible;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class FinishState__CollectingFinish;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace compiler { 
class NativeCPPInclude;
} } 
namespace x10 { namespace lang { 

class Runtime : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    static void x10rtSendMessage(x10_long id, ::x10::lang::VoidFun_0_0* msgBody,
                                 ::x10::lang::Runtime__Profile* prof);
    template<class TPMGL(T)> static TPMGL(T) deepCopy(TPMGL(T) o, ::x10::lang::Runtime__Profile* prof);
    template<class TPMGL(T)> static TPMGL(T) deepCopy(TPMGL(T) o);
    static ::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::String*>*
      FMGL(env);
    static void FMGL(env__do_init)();
    static void FMGL(env__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(env__status);
    static ::x10::lang::CheckedThrowable* FMGL(env__exception);
    static ::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::String*>*
      FMGL(env__get)();
    
    static x10_boolean FMGL(STRICT_FINISH);
    static void FMGL(STRICT_FINISH__do_init)();
    static void FMGL(STRICT_FINISH__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(STRICT_FINISH__status);
    static ::x10::lang::CheckedThrowable* FMGL(STRICT_FINISH__exception);
    static x10_boolean FMGL(STRICT_FINISH__get)();
    
    static x10_int FMGL(NTHREADS);
    static void FMGL(NTHREADS__do_init)();
    static void FMGL(NTHREADS__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(NTHREADS__status);
    static ::x10::lang::CheckedThrowable* FMGL(NTHREADS__exception);
    static x10_int FMGL(NTHREADS__get)();
    
    static x10_int FMGL(MAX_THREADS);
    static void FMGL(MAX_THREADS__do_init)();
    static void FMGL(MAX_THREADS__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(MAX_THREADS__status);
    static ::x10::lang::CheckedThrowable* FMGL(MAX_THREADS__exception);
    static x10_int FMGL(MAX_THREADS__get)();
    
    static x10_boolean FMGL(STATIC_THREADS);
    static void FMGL(STATIC_THREADS__do_init)();
    static void FMGL(STATIC_THREADS__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(STATIC_THREADS__status);
    static ::x10::lang::CheckedThrowable* FMGL(STATIC_THREADS__exception);
    static x10_boolean FMGL(STATIC_THREADS__get)();
    
    static x10_boolean FMGL(WARN_ON_THREAD_CREATION);
    static void FMGL(WARN_ON_THREAD_CREATION__do_init)();
    static void FMGL(WARN_ON_THREAD_CREATION__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(WARN_ON_THREAD_CREATION__status);
    static ::x10::lang::CheckedThrowable* FMGL(WARN_ON_THREAD_CREATION__exception);
    static x10_boolean FMGL(WARN_ON_THREAD_CREATION__get)();
    
    static x10_boolean FMGL(BUSY_WAITING);
    static void FMGL(BUSY_WAITING__do_init)();
    static void FMGL(BUSY_WAITING__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(BUSY_WAITING__status);
    static ::x10::lang::CheckedThrowable* FMGL(BUSY_WAITING__exception);
    static x10_boolean FMGL(BUSY_WAITING__get)();
    
    static x10_int FMGL(RESILIENT_MODE);
    static void FMGL(RESILIENT_MODE__do_init)();
    static void FMGL(RESILIENT_MODE__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(RESILIENT_MODE__status);
    static ::x10::lang::CheckedThrowable* FMGL(RESILIENT_MODE__exception);
    static x10_int FMGL(RESILIENT_MODE__get)();
    
    static x10_double FMGL(CHUNK_DELTA);
    static void FMGL(CHUNK_DELTA__do_init)();
    static void FMGL(CHUNK_DELTA__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(CHUNK_DELTA__status);
    static ::x10::lang::CheckedThrowable* FMGL(CHUNK_DELTA__exception);
    static x10_double FMGL(CHUNK_DELTA__get)();
    
    static ::x10::util::concurrent::Monitor* FMGL(staticMonitor);
    static void FMGL(staticMonitor__do_init)();
    static void FMGL(staticMonitor__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(staticMonitor__status);
    static ::x10::lang::CheckedThrowable* FMGL(staticMonitor__exception);
    static ::x10::util::concurrent::Monitor* FMGL(staticMonitor__get)();
    
    static ::x10::util::concurrent::Monitor* FMGL(atomicMonitor);
    static void FMGL(atomicMonitor__do_init)();
    static void FMGL(atomicMonitor__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(atomicMonitor__status);
    static ::x10::lang::CheckedThrowable* FMGL(atomicMonitor__exception);
    static ::x10::util::concurrent::Monitor* FMGL(atomicMonitor__get)();
    
    static ::x10::lang::Runtime__Pool* FMGL(pool);
    static void FMGL(pool__do_init)();
    static void FMGL(pool__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(pool__status);
    static ::x10::lang::CheckedThrowable* FMGL(pool__exception);
    static ::x10::lang::Runtime__Pool* FMGL(pool__get)();
    
    static ::x10::lang::FinishState__FinishStates* FMGL(finishStates);
    static void FMGL(finishStates__do_init)();
    static void FMGL(finishStates__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(finishStates__status);
    static ::x10::lang::CheckedThrowable* FMGL(finishStates__exception);
    static ::x10::lang::FinishState__FinishStates* FMGL(finishStates__get)();
    
    static ::x10::lang::Runtime__Workers* FMGL(workerInstance);
    static void FMGL(workerInstance__do_init)();
    static void FMGL(workerInstance__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(workerInstance__status);
    static ::x10::lang::CheckedThrowable* FMGL(workerInstance__exception);
    static ::x10::lang::Runtime__Workers* FMGL(workerInstance__get)();
    
    static x10_int FMGL(IdleWorkers);
    static void FMGL(IdleWorkers__do_init)();
    static void FMGL(IdleWorkers__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(IdleWorkers__status);
    static ::x10::lang::CheckedThrowable* FMGL(IdleWorkers__exception);
    static x10_int FMGL(IdleWorkers__get)();
    
    static x10_int retNthreads();
    static x10_int retIdleWorkers();
    static x10_int retTotalWorkers();
    static void wsInit();
    static ::x10::lang::Deque* wsFIFO();
    static void wsBlock(::x10::lang::Any* k);
    static void wsUnblock();
    static void wsEnd();
    static x10_boolean wsEnded();
    static ::x10::lang::Runtime__Worker* worker();
    static x10_int workerId();
    static x10_int poolSize();
    static ::x10::lang::Activity* activity();
    static x10_int hereInt();
    static x10_long hereLong();
    static x10_int surplusActivityCount();
    static ::x10::lang::FinishState* FMGL(rootFinish);
    static void FMGL(rootFinish__do_init)();
    static void FMGL(rootFinish__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(rootFinish__status);
    static ::x10::lang::CheckedThrowable* FMGL(rootFinish__exception);
    static ::x10::lang::FinishState* FMGL(rootFinish__get)();
    
    static ::x10::lang::Cell<x10_long>* FMGL(processStartNanos_);
    static void FMGL(processStartNanos___do_init)();
    static void FMGL(processStartNanos___init)();
    static volatile ::x10aux::StaticInitController::status FMGL(processStartNanos___status);
    static ::x10::lang::CheckedThrowable* FMGL(processStartNanos___exception);
    static ::x10::lang::Cell<x10_long>* FMGL(processStartNanos___get)();
    
    static x10_long processStartNanos();
    static void submitUncounted(::x10::lang::VoidFun_0_0* job);
    static ::x10::lang::Runtime__Watcher* submit(::x10::lang::VoidFun_0_0* job);
    static void start(x10_int n);
    static void join();
    static void start(::x10::lang::VoidFun_0_0* job);
    static void terminate();
    static void terminateAll();
    static void startDeprecated(::x10::lang::VoidFun_0_0* body);
    static void runAsync(::x10::lang::Place place, ::x10::lang::Rail< ::x10::lang::Clock* >* clocks,
                         ::x10::lang::VoidFun_0_0* body, ::x10::lang::Runtime__Profile* prof);
    static void runAsync(::x10::lang::Place place, ::x10::lang::VoidFun_0_0* body,
                         ::x10::lang::Runtime__Profile* prof);
    static void runAsync(::x10::lang::Rail< ::x10::lang::Clock* >* clocks,
                         ::x10::lang::VoidFun_0_0* body);
    static void runAsync(::x10::lang::VoidFun_0_0* body);
    static void runFinish(::x10::lang::VoidFun_0_0* body);
    static void runUncountedAsync(::x10::lang::Place place,
                                  ::x10::lang::VoidFun_0_0* body,
                                  ::x10::lang::Runtime__Profile* prof);
    static void runUncountedAsync(::x10::lang::VoidFun_0_0* body);
    template<class TPMGL(T)> static TPMGL(T) wrapAtChecked(
      ::x10::lang::CheckedThrowable* caught);
    static void runAtNonResilient(::x10::lang::Place place,
                                  ::x10::lang::VoidFun_0_0* body,
                                  ::x10::lang::Runtime__Profile* prof);
    static void runAt(::x10::lang::Place place, ::x10::lang::VoidFun_0_0* body,
                      ::x10::lang::Runtime__Profile* prof);
    static void runAtSimple(::x10::lang::Place place, ::x10::lang::VoidFun_0_0* body,
                            x10_boolean toWait);
    static ::x10::lang::Any* evalAtNonResilient(::x10::lang::Place place,
                                                ::x10::lang::Fun_0_0< ::x10::lang::Any*>* eval,
                                                ::x10::lang::Runtime__Profile* prof);
    template<class TPMGL(T)> static TPMGL(T) evalAt(::x10::lang::Place place,
                                                    ::x10::lang::Fun_0_0<TPMGL(T)>* body,
                                                    ::x10::lang::Runtime__Profile* prof);
    static void StaticInitBroadcastDispatcherLock();
    static void StaticInitBroadcastDispatcherAwait();
    static void StaticInitBroadcastDispatcherUnlock();
    static void StaticInitBroadcastDispatcherNotify();
    static void enterAtomic();
    static void ensureNotInAtomic();
    static void exitAtomic();
    static void exitWSWhen(x10_boolean b);
    static void awaitAtomic();
    static ::x10::lang::FinishState* makeDefaultFinish();
    static ::x10::lang::FinishState* makeDefaultFinish(::x10::util::concurrent::SimpleLatch* latch);
    static ::x10::lang::FinishState* startFinish();
    static ::x10::lang::FinishState* startFinish(x10_int pragma);
    static ::x10::lang::FinishState* startLocalFinish();
    static ::x10::lang::FinishState* startSimpleFinish();
    static void stopFinish(::x10::lang::FinishState* f);
    static void pushException(::x10::lang::CheckedThrowable* t);
    template<class TPMGL(T)> static ::x10::lang::FinishState*
      startCollectingFinish(::x10::lang::Reducible<TPMGL(T)>* r);
    template<class TPMGL(T)> static void makeOffer(TPMGL(T) t);
    template<class TPMGL(T)> static TPMGL(T) stopCollectingFinish(
      ::x10::lang::FinishState* f);
    static void execute(::x10::lang::Activity* activity);
    static void executeLocal(::x10::lang::Activity* activity);
    static void execute(::x10::lang::VoidFun_0_0* body, ::x10::lang::Place src,
                        ::x10::lang::FinishState* finishState);
    static void probe();
    static void increaseParallelism();
    static void decreaseParallelism(x10_int n);
    static void removeThreadLocalContexts();
    static ::x10::lang::Runtime__Worker* wrapNativeThread(
      );
    virtual ::x10::lang::Runtime* x10__lang__Runtime____this__x10__lang__Runtime(
      );
    void _constructor();
    
    static ::x10::lang::Runtime* _make();
    
    virtual void __fieldInitializers_x10_lang_Runtime();
    
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
#endif // X10_LANG_RUNTIME_H

namespace x10 { namespace lang { 
class Runtime;
} } 

#ifndef X10_LANG_RUNTIME_H_NODEPS
#define X10_LANG_RUNTIME_H_NODEPS
#include <x10/lang/Any.h>
#include <x10/compiler/Native.h>
#include <x10/lang/String.h>
#include <x10/lang/Long.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/lang/FinishState.h>
#include <x10/lang/Boolean.h>
#include <x10/util/Timer.h>
#include <x10/io/Serializer.h>
#include <x10/compiler/StackAllocate.h>
#include <x10/io/Deserializer.h>
#include <x10/lang/Int.h>
#include <x10/util/HashMap.h>
#include <x10/lang/Configuration.h>
#include <x10/lang/Double.h>
#include <x10/io/Reader.h>
#include <x10/io/Writer.h>
#include <x10/util/concurrent/Monitor.h>
#include <x10/lang/Runtime__Pool.h>
#include <x10/lang/FinishState__FinishStates.h>
#include <x10/lang/Runtime__Workers.h>
#include <x10/lang/Deque.h>
#include <x10/lang/Runtime__Worker.h>
#include <x10/lang/Thread.h>
#include <x10/lang/Activity.h>
#include <x10/lang/Place.h>
#include <x10/util/concurrent/SimpleLatch.h>
#include <x10/lang/Cell.h>
#include <x10/lang/FinishState__UncountedFinish.h>
#include <x10/lang/Runtime__Watcher.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/Exception.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/lang/MultipleExceptions.h>
#include <x10/util/concurrent/Condition.h>
#include <x10/compiler/RemoteInvocation.h>
#include <x10/lang/Math.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Clock.h>
#include <x10/lang/Activity__ClockPhases.h>
#include <x10/lang/Unsafe.h>
#include <x10/lang/Error.h>
#include <x10/lang/Runtime__AtCheckedWrapper.h>
#include <x10/lang/Runtime__RemoteControl.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/Byte.h>
#include <x10/compiler/AsyncClosure.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/lang/Runtime__Remote.h>
#include <x10/util/Box.h>
#include <x10/util/concurrent/Lock.h>
#include <x10/lang/FinishState__Finish.h>
#include <x10/lang/FinishState__RootFinish.h>
#include <x10/lang/FinishResilient.h>
#include <x10/lang/FinishState__FinishAsync.h>
#include <x10/lang/FinishState__FinishHere.h>
#include <x10/lang/FinishState__FinishSPMD.h>
#include <x10/lang/FinishState__LocalFinish.h>
#include <x10/lang/FinishState__DenseFinish.h>
#include <x10/lang/FinishState__FinishResilientPlaceZero.h>
#include <x10/lang/FinishState__FinishResilientZooKeeper.h>
#include <x10/lang/FinishState__FinishResilientDistributed.h>
#include <x10/lang/Reducible.h>
#include <x10/lang/FinishState__CollectingFinish.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeCPPInclude.h>
#ifndef X10_LANG_RUNTIME__CLOSURE__22_CLOSURE
#define X10_LANG_RUNTIME__CLOSURE__22_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T)> class x10_lang_Runtime__closure__22 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::lang::Any*>::template itable <x10_lang_Runtime__closure__22<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::Any* __apply() {
        return ::x10aux::class_cast_unchecked< ::x10::lang::Any*>(::x10::lang::Fun_0_0<TPMGL(T)>::__apply(::x10aux::nullCheck(body)));
        
    }
    
    // captured environment
    ::x10::lang::Fun_0_0<TPMGL(T)>* body;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->body);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Runtime__closure__22<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_lang_Runtime__closure__22<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::Fun_0_0<TPMGL(T)>* that_body = buf.read< ::x10::lang::Fun_0_0<TPMGL(T)>*>();
        x10_lang_Runtime__closure__22<TPMGL(T) >* this_ = new (storage) x10_lang_Runtime__closure__22<TPMGL(T) >(that_body);
        return this_;
    }
    
    x10_lang_Runtime__closure__22(::x10::lang::Fun_0_0<TPMGL(T)>* body) : body(body) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::Any*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::Any*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10:1386";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_0< ::x10::lang::Any*>::template itable <x10_lang_Runtime__closure__22<TPMGL(T) > >x10_lang_Runtime__closure__22<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Runtime__closure__22<TPMGL(T) >::__apply, &x10_lang_Runtime__closure__22<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_lang_Runtime__closure__22<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::Any*> >, &x10_lang_Runtime__closure__22<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_Runtime__closure__22<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Runtime__closure__22<TPMGL(T) >::_deserialize);

#endif // X10_LANG_RUNTIME__CLOSURE__22_CLOSURE
#ifndef X10_LANG_RUNTIME__CLOSURE__23_CLOSURE
#define X10_LANG_RUNTIME__CLOSURE__23_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T)> class x10_lang_Runtime__closure__23 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::lang::Any*>::template itable <x10_lang_Runtime__closure__23<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::Any* __apply() {
        
        //#line 1385 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return ::x10aux::class_cast_unchecked< ::x10::lang::Any*>(::x10::lang::Fun_0_0<TPMGL(T)>::__apply(::x10aux::nullCheck(body)));
        
    }
    
    // captured environment
    ::x10::lang::Fun_0_0<TPMGL(T)>* body;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->body);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Runtime__closure__23<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_lang_Runtime__closure__23<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::Fun_0_0<TPMGL(T)>* that_body = buf.read< ::x10::lang::Fun_0_0<TPMGL(T)>*>();
        x10_lang_Runtime__closure__23<TPMGL(T) >* this_ = new (storage) x10_lang_Runtime__closure__23<TPMGL(T) >(that_body);
        return this_;
    }
    
    x10_lang_Runtime__closure__23(::x10::lang::Fun_0_0<TPMGL(T)>* body) : body(body) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::Any*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::Any*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10:1385";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_0< ::x10::lang::Any*>::template itable <x10_lang_Runtime__closure__23<TPMGL(T) > >x10_lang_Runtime__closure__23<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Runtime__closure__23<TPMGL(T) >::__apply, &x10_lang_Runtime__closure__23<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_lang_Runtime__closure__23<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::Any*> >, &x10_lang_Runtime__closure__23<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_Runtime__closure__23<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Runtime__closure__23<TPMGL(T) >::_deserialize);

#endif // X10_LANG_RUNTIME__CLOSURE__23_CLOSURE
#ifndef X10_LANG_RUNTIME_H_GENERICS
#define X10_LANG_RUNTIME_H_GENERICS
#ifndef X10_LANG_RUNTIME_H_deepCopy_1570
#define X10_LANG_RUNTIME_H_deepCopy_1570
template<class TPMGL(T)> TPMGL(T) x10::lang::Runtime::deepCopy(TPMGL(T) o,
                                                               ::x10::lang::Runtime__Profile* prof) {
    
    //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    x10_long start = (!::x10aux::struct_equals(prof, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
      ? (::x10::lang::RuntimeNatives::nanoTime()) : (((x10_long)0ll));
    
    //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::io::Serializer _StackAllocate_ser;
     _StackAllocate_ser._constructor();
    ::x10::io::Serializer* ser(&_StackAllocate_ser);
    
    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ser->x10::io::Serializer::writeAny(::x10aux::class_cast_unchecked< ::x10::lang::Any*>(o));
    
    //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::io::Deserializer _StackAllocate_deser;
     _StackAllocate_deser._constructor(ser);
    ::x10::io::Deserializer* deser(&_StackAllocate_deser);
    
    //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    TPMGL(T) copy = ::x10aux::class_cast<TPMGL(T)>(deser->x10::io::Deserializer::readAny());
    
    //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if ((!::x10aux::struct_equals(prof, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10_long end = ::x10::lang::RuntimeNatives::nanoTime();
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::nullCheck(prof)->FMGL(serializationNanos) =
          ((::x10aux::nullCheck(prof)->FMGL(serializationNanos)) + (((end) - (start))));
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::nullCheck(prof)->FMGL(bytes) = ((::x10aux::nullCheck(prof)->FMGL(bytes)) + (((x10_long)(ser->x10::io::Serializer::dataBytesWritten()))));
    }
    
    //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    return copy;
    
}
#endif // X10_LANG_RUNTIME_H_deepCopy_1570
#ifndef X10_LANG_RUNTIME_H_deepCopy_1571
#define X10_LANG_RUNTIME_H_deepCopy_1571
template<class TPMGL(T)> TPMGL(T) x10::lang::Runtime::deepCopy(
  TPMGL(T) o) {
    return ::x10::lang::Runtime::template deepCopy< TPMGL(T) >(
             o, ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
}
#endif // X10_LANG_RUNTIME_H_deepCopy_1571
inline ::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::String*>*
  x10::lang::Runtime::FMGL(env__get)() {
    if (FMGL(env__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(env__init)();
    }
    return x10::lang::Runtime::FMGL(env);
}

inline x10_boolean x10::lang::Runtime::FMGL(STRICT_FINISH__get)() {
    if (FMGL(STRICT_FINISH__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(STRICT_FINISH__init)();
    }
    return x10::lang::Runtime::FMGL(STRICT_FINISH);
}

inline x10_int x10::lang::Runtime::FMGL(NTHREADS__get)() {
    if (FMGL(NTHREADS__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(NTHREADS__init)();
    }
    return x10::lang::Runtime::FMGL(NTHREADS);
}

inline x10_int x10::lang::Runtime::FMGL(MAX_THREADS__get)() {
    if (FMGL(MAX_THREADS__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(MAX_THREADS__init)();
    }
    return x10::lang::Runtime::FMGL(MAX_THREADS);
}

inline x10_boolean x10::lang::Runtime::FMGL(STATIC_THREADS__get)() {
    if (FMGL(STATIC_THREADS__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(STATIC_THREADS__init)();
    }
    return x10::lang::Runtime::FMGL(STATIC_THREADS);
}

inline x10_boolean x10::lang::Runtime::FMGL(WARN_ON_THREAD_CREATION__get)() {
    if (FMGL(WARN_ON_THREAD_CREATION__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(WARN_ON_THREAD_CREATION__init)();
    }
    return x10::lang::Runtime::FMGL(WARN_ON_THREAD_CREATION);
}

inline x10_boolean x10::lang::Runtime::FMGL(BUSY_WAITING__get)() {
    if (FMGL(BUSY_WAITING__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(BUSY_WAITING__init)();
    }
    return x10::lang::Runtime::FMGL(BUSY_WAITING);
}

inline x10_int x10::lang::Runtime::FMGL(RESILIENT_MODE__get)() {
    if (FMGL(RESILIENT_MODE__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(RESILIENT_MODE__init)();
    }
    return x10::lang::Runtime::FMGL(RESILIENT_MODE);
}

inline x10_double x10::lang::Runtime::FMGL(CHUNK_DELTA__get)() {
    if (FMGL(CHUNK_DELTA__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(CHUNK_DELTA__init)();
    }
    return x10::lang::Runtime::FMGL(CHUNK_DELTA);
}

inline ::x10::util::concurrent::Monitor* x10::lang::Runtime::FMGL(staticMonitor__get)() {
    if (FMGL(staticMonitor__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(staticMonitor__init)();
    }
    return x10::lang::Runtime::FMGL(staticMonitor);
}

inline ::x10::util::concurrent::Monitor* x10::lang::Runtime::FMGL(atomicMonitor__get)() {
    if (FMGL(atomicMonitor__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(atomicMonitor__init)();
    }
    return x10::lang::Runtime::FMGL(atomicMonitor);
}

inline ::x10::lang::Runtime__Pool* x10::lang::Runtime::FMGL(pool__get)() {
    if (FMGL(pool__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(pool__init)();
    }
    return x10::lang::Runtime::FMGL(pool);
}

inline ::x10::lang::FinishState__FinishStates* x10::lang::Runtime::FMGL(finishStates__get)() {
    if (FMGL(finishStates__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(finishStates__init)();
    }
    return x10::lang::Runtime::FMGL(finishStates);
}

inline ::x10::lang::Runtime__Workers* x10::lang::Runtime::FMGL(workerInstance__get)() {
    if (FMGL(workerInstance__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(workerInstance__init)();
    }
    return x10::lang::Runtime::FMGL(workerInstance);
}

inline x10_int x10::lang::Runtime::FMGL(IdleWorkers__get)() {
    if (FMGL(IdleWorkers__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(IdleWorkers__init)();
    }
    return x10::lang::Runtime::FMGL(IdleWorkers);
}

inline ::x10::lang::FinishState* x10::lang::Runtime::FMGL(rootFinish__get)() {
    if (FMGL(rootFinish__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(rootFinish__init)();
    }
    return x10::lang::Runtime::FMGL(rootFinish);
}

inline ::x10::lang::Cell<x10_long>* x10::lang::Runtime::FMGL(processStartNanos___get)() {
    if (FMGL(processStartNanos___status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(processStartNanos___init)();
    }
    return x10::lang::Runtime::FMGL(processStartNanos_);
}

#ifndef X10_LANG_RUNTIME_H_wrapAtChecked_1632
#define X10_LANG_RUNTIME_H_wrapAtChecked_1632
template<class TPMGL(T)> TPMGL(T) x10::lang::Runtime::wrapAtChecked(
  ::x10::lang::CheckedThrowable* caught) {
    
    //#line 1168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (::x10aux::instanceof< ::x10::lang::Exception*>(caught))
    {
        ::x10aux::throwException(::x10aux::nullCheck(::x10aux::class_cast< ::x10::lang::Exception*>(caught)));
    }
    
    //#line 1169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (::x10aux::instanceof< ::x10::lang::Error*>(caught))
    {
        ::x10aux::throwException(::x10aux::nullCheck(::x10aux::class_cast< ::x10::lang::Error*>(caught)));
    }
    
    //#line 1170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Runtime__AtCheckedWrapper::_make(caught)));
}
#endif // X10_LANG_RUNTIME_H_wrapAtChecked_1632
#ifndef X10_LANG_RUNTIME_H_evalAt_1648
#define X10_LANG_RUNTIME_H_evalAt_1648
template<class TPMGL(T)> TPMGL(T) x10::lang::Runtime::evalAt(
  ::x10::lang::Place place, ::x10::lang::Fun_0_0<TPMGL(T)>* body,
  ::x10::lang::Runtime__Profile* prof) {
    
    //#line 1386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    TPMGL(T) r = ::x10aux::class_cast<TPMGL(T)>(::x10aux::nullCheck(::x10aux::nullCheck(::x10::lang::Runtime::activity())->finishState())->evalAt(
                                                  place, reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::lang::Any*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::lang::Any*> >(sizeof(x10_lang_Runtime__closure__22<TPMGL(T)>)))x10_lang_Runtime__closure__22<TPMGL(T)>(body))),
                                                  prof));
    
    //#line 1387 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::dealloc(reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::lang::Any*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::lang::Any*> >(sizeof(x10_lang_Runtime__closure__23<TPMGL(T)>)))x10_lang_Runtime__closure__23<TPMGL(T)>(body))));
    
    //#line 1388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    return r;
    
}
#endif // X10_LANG_RUNTIME_H_evalAt_1648
#ifndef X10_LANG_RUNTIME_H_startCollectingFinish_1666
#define X10_LANG_RUNTIME_H_startCollectingFinish_1666
template<class TPMGL(T)> ::x10::lang::FinishState* x10::lang::Runtime::startCollectingFinish(
  ::x10::lang::Reducible<TPMGL(T)>* r) {
    
    //#line 1525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    return ::x10aux::nullCheck(::x10::lang::Runtime::activity())->swapFinish(
             reinterpret_cast< ::x10::lang::FinishState*>((__extension__ ({
                 ::x10::lang::FinishState__CollectingFinish<TPMGL(T)>* alloc__77983 =
                    (new (::x10aux::alloc_z< ::x10::lang::FinishState__CollectingFinish<TPMGL(T)> >()) ::x10::lang::FinishState__CollectingFinish<TPMGL(T)>());
                 (alloc__77983)->::x10::lang::FinishState__CollectingFinish<TPMGL(T)>::_constructor(
                   r);
                 alloc__77983;
             }))
             ));
    
}
#endif // X10_LANG_RUNTIME_H_startCollectingFinish_1666
#ifndef X10_LANG_RUNTIME_H_makeOffer_1667
#define X10_LANG_RUNTIME_H_makeOffer_1667
template<class TPMGL(T)> void x10::lang::Runtime::makeOffer(
  TPMGL(T) t) {
    
    //#line 1529 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::FinishState* state = ::x10aux::nullCheck(::x10::lang::Runtime::activity())->finishState();
    
    //#line 1531 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::nullCheck((::x10aux::class_cast< ::x10::lang::FinishState__CollectingFinish<TPMGL(T)>*>(state)))->accept(
      t, ::x10aux::nullCheck((::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread())))->FMGL(workerId));
}
#endif // X10_LANG_RUNTIME_H_makeOffer_1667
#ifndef X10_LANG_RUNTIME_H_stopCollectingFinish_1668
#define X10_LANG_RUNTIME_H_stopCollectingFinish_1668
template<class TPMGL(T)> TPMGL(T) x10::lang::Runtime::stopCollectingFinish(
  ::x10::lang::FinishState* f) {
    
    //#line 1535 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::FinishState* state = ::x10aux::nullCheck(::x10::lang::Runtime::activity())->swapFinish(
                                        f);
    
    //#line 1536 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    return ::x10aux::nullCheck((::x10aux::class_cast< ::x10::lang::FinishState__CollectingFinish<TPMGL(T)>*>(state)))->waitForFinishExpr();
    
}
#endif // X10_LANG_RUNTIME_H_stopCollectingFinish_1668
#endif // X10_LANG_RUNTIME_H_GENERICS
#endif // __X10_LANG_RUNTIME_H_NODEPS
