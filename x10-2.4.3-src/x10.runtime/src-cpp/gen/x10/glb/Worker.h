#ifndef __X10_GLB_WORKER_H
#define __X10_GLB_WORKER_H

#include <x10rt.h>


#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_BOOLEAN_H_NODEPS
#include <x10/lang/Boolean.h>
#undef X10_LANG_BOOLEAN_H_NODEPS
#define X10_LANG_INT_H_NODEPS
#include <x10/lang/Int.h>
#undef X10_LANG_INT_H_NODEPS
#define X10_LANG_INT_H_NODEPS
#include <x10/lang/Int.h>
#undef X10_LANG_INT_H_NODEPS
#define X10_LANG_BOOLEAN_H_NODEPS
#include <x10/lang/Boolean.h>
#undef X10_LANG_BOOLEAN_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
namespace x10 { namespace glb { 
template<class TPMGL(Queue), class TPMGL(R)> class TaskQueue;
} } 
namespace x10 { namespace glb { 
template<class TPMGL(T)> class FixedSizeStack;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace util { 
class Random;
} } 
namespace x10 { namespace glb { 
class Logger;
} } 
namespace x10 { namespace compiler { 
class Volatile;
} } 
namespace x10 { namespace glb { 
template<class TPMGL(Queue), class TPMGL(R)> class Context;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(U)> class Fun_0_0;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class PlaceLocalHandle;
} } 
namespace x10 { namespace glb { 
class TaskBag;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
class VoidFun_0_0;
} } 
namespace x10 { namespace lang { 
class Runtime__Profile;
} } 
namespace x10 { namespace lang { 
class Error;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace lang { 
class Exception;
} } 
namespace x10 { namespace compiler { 
class AsyncClosure;
} } 
namespace x10 { namespace compiler { 
class Inline;
} } 
namespace x10 { namespace lang { 
class FinishState;
} } 
namespace x10 { namespace compiler { 
class Pragma;
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
class Any;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace lang { 
class Zero;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(Z1)> class VoidFun_0_1;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace glb { 

template<class TPMGL(Queue), class TPMGL(R)> class Worker;
template <> class Worker<void, void>;
template<class TPMGL(Queue), class TPMGL(R)> class Worker : public ::x10::lang::X10Class
  {
    public:
    RTT_H_DECLS_CLASS
    
    TPMGL(Queue) FMGL(queue);
    
    ::x10::glb::FixedSizeStack<x10_long>* FMGL(lifelineThieves);
    
    ::x10::glb::FixedSizeStack<x10_long>* FMGL(thieves);
    
    ::x10::lang::Rail< x10_long >* FMGL(lifelines);
    
    ::x10::lang::Rail< x10_boolean >* FMGL(lifelinesActivated);
    
    x10_int FMGL(n);
    
    x10_int FMGL(w);
    
    x10_int FMGL(m);
    
    ::x10::util::Random* FMGL(random);
    
    ::x10::lang::Rail< x10_long >* FMGL(victims);
    
    ::x10::glb::Logger* FMGL(logger);
    
    volatile x10_boolean FMGL(active);
    
    volatile x10_boolean FMGL(empty);
    
    volatile x10_boolean FMGL(waiting);
    
    x10_long FMGL(P);
    
    ::x10::glb::Context<TPMGL(Queue), TPMGL(R)>* FMGL(context);
    
    void _constructor(::x10::lang::Fun_0_0<TPMGL(Queue)>* init, x10_int n,
                      x10_int w, x10_int l, x10_int z, x10_int m,
                      x10_boolean tree);
    
    static ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>* _make(::x10::lang::Fun_0_0<TPMGL(Queue)>* init,
                                                             x10_int n,
                                                             x10_int w,
                                                             x10_int l,
                                                             x10_int z,
                                                             x10_int m,
                                                             x10_boolean tree);
    
    virtual void processStack(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st);
    virtual void give(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st,
                      ::x10::glb::TaskBag* loot);
    virtual void distribute(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st);
    virtual void reject(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st);
    virtual x10_boolean steal(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st);
    virtual void request(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st,
                         x10_long thief, x10_boolean lifeline);
    virtual void processLoot(::x10::glb::TaskBag* loot, x10_boolean lifeline);
    virtual void deal(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st,
                      ::x10::glb::TaskBag* loot, x10_long source);
    virtual void main(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st,
                      ::x10::lang::VoidFun_0_0* start);
    virtual void main(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st);
    virtual ::x10::lang::VoidFun_0_1< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >*
      getYieldPoint();
    virtual void setContext(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st);
    virtual ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>* x10__glb__Worker____this__x10__glb__Worker(
      );
    virtual void __fieldInitializers_x10_glb_Worker();
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::RuntimeType x10::glb::Worker<TPMGL(Queue), TPMGL(R)>::rtt;
template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::Worker<TPMGL(Queue), TPMGL(R)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::glb::Worker<void, void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    const ::x10aux::RuntimeType* params[2] = { ::x10aux::getRTT<TPMGL(Queue)>(), ::x10aux::getRTT<TPMGL(R)>()};
    ::x10aux::RuntimeType::Variance variances[2] = { ::x10aux::RuntimeType::invariant, ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.glb.Worker";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 0, parents, 2, params, variances);
}

template <> class Worker<void, void> : public ::x10::lang::X10Class
{
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    static void error(::x10::lang::CheckedThrowable* v);
    
    static x10_long min(x10_long i, x10_long j);
    
    template<class TPMGL(Queue), class TPMGL(R)> static void
      broadcast(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st);
    
    template<class TPMGL(Queue), class TPMGL(R)> static void
      initContexts(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st);
    
    
};

} } 
#endif // X10_GLB_WORKER_H

namespace x10 { namespace glb { 
template<class TPMGL(Queue), class TPMGL(R)> class Worker;
} } 

#ifndef X10_GLB_WORKER_H_NODEPS
#define X10_GLB_WORKER_H_NODEPS
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Int.h>
#include <x10/glb/TaskQueue.h>
#include <x10/glb/FixedSizeStack.h>
#include <x10/lang/Rail.h>
#include <x10/util/Random.h>
#include <x10/glb/Logger.h>
#include <x10/compiler/Volatile.h>
#include <x10/glb/Context.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/PlaceLocalHandle.h>
#include <x10/glb/TaskBag.h>
#include <x10/lang/Place.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/lang/Error.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/Exception.h>
#include <x10/compiler/AsyncClosure.h>
#include <x10/compiler/Inline.h>
#include <x10/lang/FinishState.h>
#include <x10/compiler/Pragma.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/lang/Any.h>
#include <x10/lang/String.h>
#include <x10/lang/Zero.h>
#include <x10/lang/VoidFun_0_1.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_GLB_WORKER_H_GENERICS
#define X10_GLB_WORKER_H_GENERICS
#endif // X10_GLB_WORKER_H_GENERICS
#ifndef X10_GLB_WORKER_H_IMPLEMENTATION
#define X10_GLB_WORKER_H_IMPLEMENTATION
#include <x10/glb/Worker.h>

#ifndef X10_GLB_WORKER__CLOSURE__1_CLOSURE
#define X10_GLB_WORKER__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__1 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__1<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(st__86670->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->x10::glb::template Worker<TPMGL(Queue), TPMGL(R)>::deal(
          st__86670, loot__86671, victim__86661);
        ::x10aux::nullCheck(st__86670->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->FMGL(waiting) =
          false;
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86670;
    ::x10::glb::TaskBag* loot__86671;
    x10_long victim__86661;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st__86670);
        buf.write(this->loot__86671);
        buf.write(this->victim__86661);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__1<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__1<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st__86670 = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        ::x10::glb::TaskBag* that_loot__86671 = buf.read< ::x10::glb::TaskBag*>();
        x10_long that_victim__86661 = buf.read<x10_long>();
        x10_glb_Worker__closure__1<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__1<TPMGL(Queue),TPMGL(R) >(that_st__86670, that_loot__86671, that_victim__86661);
        return this_;
    }
    
    x10_glb_Worker__closure__1(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86670, ::x10::glb::TaskBag* loot__86671, x10_long victim__86661) : st__86670(st__86670), loot__86671(loot__86671), victim__86661(victim__86661) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:155";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__1<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__1<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__1<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__1<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__1<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__1<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__1<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__1<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_WORKER__CLOSURE__1_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__2_CLOSURE
#define X10_GLB_WORKER__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__2 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__2<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(st__86670->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->x10::glb::template Worker<TPMGL(Queue), TPMGL(R)>::deal(
          st__86670, loot__86671, ((x10_long)-1ll));
        ::x10aux::nullCheck(st__86670->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->FMGL(waiting) =
          false;
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86670;
    ::x10::glb::TaskBag* loot__86671;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st__86670);
        buf.write(this->loot__86671);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__2<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__2<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st__86670 = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        ::x10::glb::TaskBag* that_loot__86671 = buf.read< ::x10::glb::TaskBag*>();
        x10_glb_Worker__closure__2<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__2<TPMGL(Queue),TPMGL(R) >(that_st__86670, that_loot__86671);
        return this_;
    }
    
    x10_glb_Worker__closure__2(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86670, ::x10::glb::TaskBag* loot__86671) : st__86670(st__86670), loot__86671(loot__86671) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:158";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__2<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__2<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__2<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__2<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__2<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__2<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__2<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__2<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_WORKER__CLOSURE__2_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__3_CLOSURE
#define X10_GLB_WORKER__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__3 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__3<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            ::x10aux::nullCheck(st__86670->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->x10::glb::template Worker<TPMGL(Queue), TPMGL(R)>::deal(
              st__86670, loot__86671, victim__86661);
        }
        catch (::x10::lang::CheckedThrowable* __exc347) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc347)) {
                ::x10::lang::Error* __lowerer__var__0__ = static_cast< ::x10::lang::Error*>(__exc347);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc347);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86670;
    ::x10::glb::TaskBag* loot__86671;
    x10_long victim__86661;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st__86670);
        buf.write(this->loot__86671);
        buf.write(this->victim__86661);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__3<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__3<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st__86670 = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        ::x10::glb::TaskBag* that_loot__86671 = buf.read< ::x10::glb::TaskBag*>();
        x10_long that_victim__86661 = buf.read<x10_long>();
        x10_glb_Worker__closure__3<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__3<TPMGL(Queue),TPMGL(R) >(that_st__86670, that_loot__86671, that_victim__86661);
        return this_;
    }
    
    x10_glb_Worker__closure__3(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86670, ::x10::glb::TaskBag* loot__86671, x10_long victim__86661) : st__86670(st__86670), loot__86671(loot__86671), victim__86661(victim__86661) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:163";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__3<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__3<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__3<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__3<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__3<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__3<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__3<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__3<TPMGL(Queue),TPMGL(R) >::_deserialize);
template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__3<TPMGL(Queue),TPMGL(R) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_glb_Worker__closure__3<TPMGL(Queue),TPMGL(R) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_GLB_WORKER__CLOSURE__3_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__4_CLOSURE
#define X10_GLB_WORKER__CLOSURE__4_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__4 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__4<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(st__86685->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->FMGL(waiting) =
          false;
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86685;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st__86685);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__4<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__4<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st__86685 = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        x10_glb_Worker__closure__4<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__4<TPMGL(Queue),TPMGL(R) >(that_st__86685);
        return this_;
    }
    
    x10_glb_Worker__closure__4(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86685) : st__86685(st__86685) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:189";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__4<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__4<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__4<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__4<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__4<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__4<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__4<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__4<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_WORKER__CLOSURE__4_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__5_CLOSURE
#define X10_GLB_WORKER__CLOSURE__5_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__5 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__5<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(st__86685->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->FMGL(waiting) =
          false;
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86685;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st__86685);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__5<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__5<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st__86685 = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        x10_glb_Worker__closure__5<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__5<TPMGL(Queue),TPMGL(R) >(that_st__86685);
        return this_;
    }
    
    x10_glb_Worker__closure__5(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86685) : st__86685(st__86685) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:191";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__5<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__5<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__5<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__5<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__5<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__5<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__5<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__5<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_WORKER__CLOSURE__5_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__6_CLOSURE
#define X10_GLB_WORKER__CLOSURE__6_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__6 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__6<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(st__86694->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->FMGL(waiting) =
          false;
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86694;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st__86694);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__6<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__6<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st__86694 = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        x10_glb_Worker__closure__6<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__6<TPMGL(Queue),TPMGL(R) >(that_st__86694);
        return this_;
    }
    
    x10_glb_Worker__closure__6(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86694) : st__86694(st__86694) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:189";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__6<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__6<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__6<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__6<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__6<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__6<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__6<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__6<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_WORKER__CLOSURE__6_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__7_CLOSURE
#define X10_GLB_WORKER__CLOSURE__7_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__7 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__7<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(st__86694->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->FMGL(waiting) =
          false;
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86694;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st__86694);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__7<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__7<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st__86694 = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        x10_glb_Worker__closure__7<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__7<TPMGL(Queue),TPMGL(R) >(that_st__86694);
        return this_;
    }
    
    x10_glb_Worker__closure__7(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86694) : st__86694(st__86694) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:191";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__7<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__7<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__7<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__7<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__7<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__7<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__7<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__7<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_WORKER__CLOSURE__7_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__8_CLOSURE
#define X10_GLB_WORKER__CLOSURE__8_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__8 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__8<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(st->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->x10::glb::template Worker<TPMGL(Queue), TPMGL(R)>::deal(
          st, loot, victim);
        ::x10aux::nullCheck(st->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->FMGL(waiting) =
          false;
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st;
    ::x10::glb::TaskBag* loot;
    x10_long victim;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st);
        buf.write(this->loot);
        buf.write(this->victim);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__8<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__8<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        ::x10::glb::TaskBag* that_loot = buf.read< ::x10::glb::TaskBag*>();
        x10_long that_victim = buf.read<x10_long>();
        x10_glb_Worker__closure__8<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__8<TPMGL(Queue),TPMGL(R) >(that_st, that_loot, that_victim);
        return this_;
    }
    
    x10_glb_Worker__closure__8(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st, ::x10::glb::TaskBag* loot, x10_long victim) : st(st), loot(loot), victim(victim) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:155";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__8<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__8<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__8<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__8<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__8<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__8<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__8<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__8<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_WORKER__CLOSURE__8_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__9_CLOSURE
#define X10_GLB_WORKER__CLOSURE__9_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__9 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__9<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(st->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->x10::glb::template Worker<TPMGL(Queue), TPMGL(R)>::deal(
          st, loot, ((x10_long)-1ll));
        ::x10aux::nullCheck(st->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->FMGL(waiting) =
          false;
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st;
    ::x10::glb::TaskBag* loot;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st);
        buf.write(this->loot);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__9<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__9<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        ::x10::glb::TaskBag* that_loot = buf.read< ::x10::glb::TaskBag*>();
        x10_glb_Worker__closure__9<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__9<TPMGL(Queue),TPMGL(R) >(that_st, that_loot);
        return this_;
    }
    
    x10_glb_Worker__closure__9(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st, ::x10::glb::TaskBag* loot) : st(st), loot(loot) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:158";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__9<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__9<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__9<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__9<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__9<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__9<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__9<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__9<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_WORKER__CLOSURE__9_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__10_CLOSURE
#define X10_GLB_WORKER__CLOSURE__10_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__10 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__10<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            ::x10aux::nullCheck(st->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->x10::glb::template Worker<TPMGL(Queue), TPMGL(R)>::deal(
              st, loot, victim);
        }
        catch (::x10::lang::CheckedThrowable* __exc349) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc349)) {
                ::x10::lang::Error* __lowerer__var__0__ = static_cast< ::x10::lang::Error*>(__exc349);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc349);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st;
    ::x10::glb::TaskBag* loot;
    x10_long victim;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st);
        buf.write(this->loot);
        buf.write(this->victim);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__10<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__10<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        ::x10::glb::TaskBag* that_loot = buf.read< ::x10::glb::TaskBag*>();
        x10_long that_victim = buf.read<x10_long>();
        x10_glb_Worker__closure__10<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__10<TPMGL(Queue),TPMGL(R) >(that_st, that_loot, that_victim);
        return this_;
    }
    
    x10_glb_Worker__closure__10(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st, ::x10::glb::TaskBag* loot, x10_long victim) : st(st), loot(loot), victim(victim) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:163";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__10<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__10<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__10<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__10<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__10<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__10<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__10<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__10<TPMGL(Queue),TPMGL(R) >::_deserialize);
template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__10<TPMGL(Queue),TPMGL(R) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_glb_Worker__closure__10<TPMGL(Queue),TPMGL(R) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_GLB_WORKER__CLOSURE__10_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__11_CLOSURE
#define X10_GLB_WORKER__CLOSURE__11_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__11 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__11<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(st__86713->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->x10::glb::template Worker<TPMGL(Queue), TPMGL(R)>::deal(
          st__86713, loot__86714, victim__86703);
        ::x10aux::nullCheck(st__86713->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->FMGL(waiting) =
          false;
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86713;
    ::x10::glb::TaskBag* loot__86714;
    x10_long victim__86703;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st__86713);
        buf.write(this->loot__86714);
        buf.write(this->victim__86703);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__11<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__11<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st__86713 = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        ::x10::glb::TaskBag* that_loot__86714 = buf.read< ::x10::glb::TaskBag*>();
        x10_long that_victim__86703 = buf.read<x10_long>();
        x10_glb_Worker__closure__11<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__11<TPMGL(Queue),TPMGL(R) >(that_st__86713, that_loot__86714, that_victim__86703);
        return this_;
    }
    
    x10_glb_Worker__closure__11(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86713, ::x10::glb::TaskBag* loot__86714, x10_long victim__86703) : st__86713(st__86713), loot__86714(loot__86714), victim__86703(victim__86703) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:155";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__11<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__11<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__11<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__11<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__11<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__11<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__11<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__11<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_WORKER__CLOSURE__11_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__12_CLOSURE
#define X10_GLB_WORKER__CLOSURE__12_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__12 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__12<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(st__86713->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->x10::glb::template Worker<TPMGL(Queue), TPMGL(R)>::deal(
          st__86713, loot__86714, ((x10_long)-1ll));
        ::x10aux::nullCheck(st__86713->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->FMGL(waiting) =
          false;
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86713;
    ::x10::glb::TaskBag* loot__86714;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st__86713);
        buf.write(this->loot__86714);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__12<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__12<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st__86713 = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        ::x10::glb::TaskBag* that_loot__86714 = buf.read< ::x10::glb::TaskBag*>();
        x10_glb_Worker__closure__12<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__12<TPMGL(Queue),TPMGL(R) >(that_st__86713, that_loot__86714);
        return this_;
    }
    
    x10_glb_Worker__closure__12(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86713, ::x10::glb::TaskBag* loot__86714) : st__86713(st__86713), loot__86714(loot__86714) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:158";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__12<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__12<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__12<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__12<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__12<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__12<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__12<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__12<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_WORKER__CLOSURE__12_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__13_CLOSURE
#define X10_GLB_WORKER__CLOSURE__13_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__13 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__13<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            ::x10aux::nullCheck(st__86713->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->x10::glb::template Worker<TPMGL(Queue), TPMGL(R)>::deal(
              st__86713, loot__86714, victim__86703);
        }
        catch (::x10::lang::CheckedThrowable* __exc351) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc351)) {
                ::x10::lang::Error* __lowerer__var__0__ = static_cast< ::x10::lang::Error*>(__exc351);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc351);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86713;
    ::x10::glb::TaskBag* loot__86714;
    x10_long victim__86703;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st__86713);
        buf.write(this->loot__86714);
        buf.write(this->victim__86703);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__13<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__13<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st__86713 = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        ::x10::glb::TaskBag* that_loot__86714 = buf.read< ::x10::glb::TaskBag*>();
        x10_long that_victim__86703 = buf.read<x10_long>();
        x10_glb_Worker__closure__13<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__13<TPMGL(Queue),TPMGL(R) >(that_st__86713, that_loot__86714, that_victim__86703);
        return this_;
    }
    
    x10_glb_Worker__closure__13(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86713, ::x10::glb::TaskBag* loot__86714, x10_long victim__86703) : st__86713(st__86713), loot__86714(loot__86714), victim__86703(victim__86703) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:163";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__13<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__13<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__13<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__13<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__13<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__13<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__13<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__13<TPMGL(Queue),TPMGL(R) >::_deserialize);
template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__13<TPMGL(Queue),TPMGL(R) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_glb_Worker__closure__13<TPMGL(Queue),TPMGL(R) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_GLB_WORKER__CLOSURE__13_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__14_CLOSURE
#define X10_GLB_WORKER__CLOSURE__14_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__14 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__14<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(st->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->FMGL(waiting) =
          false;
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__14<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__14<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        x10_glb_Worker__closure__14<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__14<TPMGL(Queue),TPMGL(R) >(that_st);
        return this_;
    }
    
    x10_glb_Worker__closure__14(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st) : st(st) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:189";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__14<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__14<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__14<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__14<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__14<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__14<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__14<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__14<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_WORKER__CLOSURE__14_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__15_CLOSURE
#define X10_GLB_WORKER__CLOSURE__15_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__15 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__15<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(st->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->FMGL(waiting) =
          false;
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__15<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__15<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        x10_glb_Worker__closure__15<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__15<TPMGL(Queue),TPMGL(R) >(that_st);
        return this_;
    }
    
    x10_glb_Worker__closure__15(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st) : st(st) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:191";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__15<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__15<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__15<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__15<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__15<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__15<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__15<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__15<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_WORKER__CLOSURE__15_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__16_CLOSURE
#define X10_GLB_WORKER__CLOSURE__16_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__16 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__16<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(st->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->x10::glb::template Worker<TPMGL(Queue), TPMGL(R)>::request(
          st, p, false);
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st;
    x10_long p;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st);
        buf.write(this->p);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__16<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__16<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        x10_long that_p = buf.read<x10_long>();
        x10_glb_Worker__closure__16<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__16<TPMGL(Queue),TPMGL(R) >(that_st, that_p);
        return this_;
    }
    
    x10_glb_Worker__closure__16(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st, x10_long p) : st(st), p(p) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:217";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__16<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__16<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__16<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__16<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__16<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__16<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__16<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__16<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_WORKER__CLOSURE__16_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__17_CLOSURE
#define X10_GLB_WORKER__CLOSURE__17_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__17 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__17<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(st->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->x10::glb::template Worker<TPMGL(Queue), TPMGL(R)>::request(
          st, p, true);
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st;
    x10_long p;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st);
        buf.write(this->p);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__17<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__17<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        x10_long that_p = buf.read<x10_long>();
        x10_glb_Worker__closure__17<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__17<TPMGL(Queue),TPMGL(R) >(that_st, that_p);
        return this_;
    }
    
    x10_glb_Worker__closure__17(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st, x10_long p) : st(st), p(p) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:228";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__17<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__17<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__17<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__17<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__17<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__17<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__17<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__17<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_WORKER__CLOSURE__17_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__18_CLOSURE
#define X10_GLB_WORKER__CLOSURE__18_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__18 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__18<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(st->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->FMGL(waiting) =
          false;
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__18<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__18<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        x10_glb_Worker__closure__18<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__18<TPMGL(Queue),TPMGL(R) >(that_st);
        return this_;
    }
    
    x10_glb_Worker__closure__18(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st) : st(st) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:248";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__18<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__18<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__18<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__18<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__18<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__18<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__18<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__18<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_WORKER__CLOSURE__18_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__20_CLOSURE
#define X10_GLB_WORKER__CLOSURE__20_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__20 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__20<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(st__86768->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->x10::glb::template Worker<TPMGL(Queue), TPMGL(R)>::deal(
          st__86768, loot__86769, victim__86759);
        ::x10aux::nullCheck(st__86768->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->FMGL(waiting) =
          false;
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86768;
    ::x10::glb::TaskBag* loot__86769;
    x10_long victim__86759;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st__86768);
        buf.write(this->loot__86769);
        buf.write(this->victim__86759);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__20<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__20<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st__86768 = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        ::x10::glb::TaskBag* that_loot__86769 = buf.read< ::x10::glb::TaskBag*>();
        x10_long that_victim__86759 = buf.read<x10_long>();
        x10_glb_Worker__closure__20<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__20<TPMGL(Queue),TPMGL(R) >(that_st__86768, that_loot__86769, that_victim__86759);
        return this_;
    }
    
    x10_glb_Worker__closure__20(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86768, ::x10::glb::TaskBag* loot__86769, x10_long victim__86759) : st__86768(st__86768), loot__86769(loot__86769), victim__86759(victim__86759) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:155";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__20<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__20<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__20<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__20<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__20<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__20<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__20<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__20<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_WORKER__CLOSURE__20_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__21_CLOSURE
#define X10_GLB_WORKER__CLOSURE__21_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__21 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__21<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(st__86768->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->x10::glb::template Worker<TPMGL(Queue), TPMGL(R)>::deal(
          st__86768, loot__86769, ((x10_long)-1ll));
        ::x10aux::nullCheck(st__86768->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->FMGL(waiting) =
          false;
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86768;
    ::x10::glb::TaskBag* loot__86769;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st__86768);
        buf.write(this->loot__86769);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__21<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__21<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st__86768 = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        ::x10::glb::TaskBag* that_loot__86769 = buf.read< ::x10::glb::TaskBag*>();
        x10_glb_Worker__closure__21<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__21<TPMGL(Queue),TPMGL(R) >(that_st__86768, that_loot__86769);
        return this_;
    }
    
    x10_glb_Worker__closure__21(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86768, ::x10::glb::TaskBag* loot__86769) : st__86768(st__86768), loot__86769(loot__86769) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:158";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__21<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__21<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__21<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__21<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__21<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__21<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__21<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__21<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_WORKER__CLOSURE__21_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__22_CLOSURE
#define X10_GLB_WORKER__CLOSURE__22_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__22 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__22<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            ::x10aux::nullCheck(st__86768->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->x10::glb::template Worker<TPMGL(Queue), TPMGL(R)>::deal(
              st__86768, loot__86769, victim__86759);
        }
        catch (::x10::lang::CheckedThrowable* __exc366) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc366)) {
                ::x10::lang::Error* __lowerer__var__0__ = static_cast< ::x10::lang::Error*>(__exc366);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc366);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86768;
    ::x10::glb::TaskBag* loot__86769;
    x10_long victim__86759;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st__86768);
        buf.write(this->loot__86769);
        buf.write(this->victim__86759);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__22<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__22<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st__86768 = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        ::x10::glb::TaskBag* that_loot__86769 = buf.read< ::x10::glb::TaskBag*>();
        x10_long that_victim__86759 = buf.read<x10_long>();
        x10_glb_Worker__closure__22<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__22<TPMGL(Queue),TPMGL(R) >(that_st__86768, that_loot__86769, that_victim__86759);
        return this_;
    }
    
    x10_glb_Worker__closure__22(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86768, ::x10::glb::TaskBag* loot__86769, x10_long victim__86759) : st__86768(st__86768), loot__86769(loot__86769), victim__86759(victim__86759) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:163";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__22<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__22<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__22<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__22<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__22<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__22<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__22<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__22<TPMGL(Queue),TPMGL(R) >::_deserialize);
template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__22<TPMGL(Queue),TPMGL(R) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_glb_Worker__closure__22<TPMGL(Queue),TPMGL(R) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_GLB_WORKER__CLOSURE__22_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__23_CLOSURE
#define X10_GLB_WORKER__CLOSURE__23_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__23 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__23<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(st__86783->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->FMGL(waiting) =
          false;
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86783;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st__86783);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__23<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__23<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st__86783 = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        x10_glb_Worker__closure__23<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__23<TPMGL(Queue),TPMGL(R) >(that_st__86783);
        return this_;
    }
    
    x10_glb_Worker__closure__23(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86783) : st__86783(st__86783) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:189";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__23<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__23<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__23<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__23<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__23<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__23<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__23<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__23<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_WORKER__CLOSURE__23_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__24_CLOSURE
#define X10_GLB_WORKER__CLOSURE__24_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__24 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__24<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(st__86783->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->FMGL(waiting) =
          false;
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86783;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st__86783);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__24<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__24<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st__86783 = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        x10_glb_Worker__closure__24<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__24<TPMGL(Queue),TPMGL(R) >(that_st__86783);
        return this_;
    }
    
    x10_glb_Worker__closure__24(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86783) : st__86783(st__86783) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:191";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__24<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__24<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__24<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__24<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__24<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__24<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__24<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__24<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_WORKER__CLOSURE__24_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__19_CLOSURE
#define X10_GLB_WORKER__CLOSURE__19_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_1.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__19 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_1< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >::template itable <x10_glb_Worker__closure__19<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st) {
        ::x10::lang::Runtime::probe();
        ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>* this__86780 = saved_this;
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86781 =
          st;
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ::x10::glb::TaskBag* loot__86770;
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        while (((((((__extension__ ({
                     ::x10::glb::FixedSizeStack<x10_long>* this__86771 =
                       ::x10aux::nullCheck(this__86780)->FMGL(thieves);
                     ::x10aux::nullCheck(this__86771)->FMGL(size);
                 }))
                 ) > (((x10_long)0ll))) || (((__extension__ ({
                     ::x10::glb::FixedSizeStack<x10_long>* this__86772 =
                       ::x10aux::nullCheck(this__86780)->FMGL(lifelineThieves);
                     ::x10aux::nullCheck(this__86772)->FMGL(size);
                 }))
                 ) > (((x10_long)0ll))))) && (!::x10aux::struct_equals((loot__86770 =
                                                                          ::x10::glb::TaskQueue<TPMGL(Queue), TPMGL(R)>::split(::x10aux::nullCheck(::x10aux::nullCheck(this__86780)->FMGL(queue)))),
                                                                       reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))))
        {
            
            //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86768 =
              st__86781;
            ::x10::glb::TaskBag* loot__86769 = loot__86770;
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x10_long victim__86759 = ((x10_long)::x10aux::here);
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::glb::Logger* obj__86758 = ::x10aux::nullCheck(this__86780)->FMGL(logger);
            ::x10aux::nullCheck(obj__86758)->FMGL(nodesGiven) =
              ((::x10aux::nullCheck(obj__86758)->FMGL(nodesGiven)) + (::x10::glb::TaskBag::size(::x10aux::nullCheck(loot__86769))));
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if ((((__extension__ ({
                    ::x10::glb::FixedSizeStack<x10_long>* this__86760 =
                      ::x10aux::nullCheck(this__86780)->FMGL(thieves);
                    ::x10aux::nullCheck(this__86760)->FMGL(size);
                }))
                ) > (((x10_long)0ll)))) {
                
                //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                x10_long thief__86761 = (__extension__ ({
                    ::x10::glb::FixedSizeStack<x10_long>* this__86762 =
                      ::x10aux::nullCheck(this__86780)->FMGL(thieves);
                    ::x10aux::nullCheck(::x10aux::nullCheck(this__86762)->FMGL(data))->x10::lang::template Rail< x10_long >::__apply(
                      ::x10aux::nullCheck(this__86762)->FMGL(size) =
                        ((::x10aux::nullCheck(this__86762)->FMGL(size)) - (((x10_long)1ll))));
                }))
                ;
                
                //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (((thief__86761) >= (((x10_long)0ll))))
                {
                    
                    //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    ::x10::glb::Logger* obj__86755 = ::x10aux::nullCheck(this__86780)->FMGL(logger);
                    ::x10aux::nullCheck(obj__86755)->FMGL(lifelineStealsSuffered) =
                      ((::x10aux::nullCheck(obj__86755)->FMGL(lifelineStealsSuffered)) + (((x10_long)1ll)));
                    
                    //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    ::x10::lang::Runtime::runUncountedAsync(
                      (__extension__ ({
                          ::x10::lang::Place alloc__86763 =
                             ::x10::lang::Place::_alloc();
                          (alloc__86763)->::x10::lang::Place::_constructor(
                            thief__86761);
                          alloc__86763;
                      }))
                      , reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__20<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__20<TPMGL(Queue),TPMGL(R)>(st__86768, loot__86769, victim__86759))),
                      ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                } else {
                    
                    //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    ::x10::glb::Logger* obj__86756 = ::x10aux::nullCheck(this__86780)->FMGL(logger);
                    ::x10aux::nullCheck(obj__86756)->FMGL(stealsSuffered) =
                      ((::x10aux::nullCheck(obj__86756)->FMGL(stealsSuffered)) + (((x10_long)1ll)));
                    
                    //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    ::x10::lang::Runtime::runUncountedAsync(
                      (__extension__ ({
                          ::x10::lang::Place alloc__86764 =
                             ::x10::lang::Place::_alloc();
                          (alloc__86764)->::x10::lang::Place::_constructor(
                            (((-(thief__86761))) - (((x10_long)1ll))));
                          alloc__86764;
                      }))
                      , reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__21<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__21<TPMGL(Queue),TPMGL(R)>(st__86768, loot__86769))),
                      ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                }
                
            } else {
                
                //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::glb::Logger* obj__86757 = ::x10aux::nullCheck(this__86780)->FMGL(logger);
                ::x10aux::nullCheck(obj__86757)->FMGL(lifelineStealsSuffered) =
                  ((::x10aux::nullCheck(obj__86757)->FMGL(lifelineStealsSuffered)) + (((x10_long)1ll)));
                
                //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                x10_long thief__86765 = (__extension__ ({
                    ::x10::glb::FixedSizeStack<x10_long>* this__86766 =
                      ::x10aux::nullCheck(this__86780)->FMGL(lifelineThieves);
                    ::x10aux::nullCheck(::x10aux::nullCheck(this__86766)->FMGL(data))->x10::lang::template Rail< x10_long >::__apply(
                      ::x10aux::nullCheck(this__86766)->FMGL(size) =
                        ((::x10aux::nullCheck(this__86766)->FMGL(size)) - (((x10_long)1ll))));
                }))
                ;
                
                //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::lang::Runtime::runAsync((__extension__ ({
                                                   ::x10::lang::Place alloc__86767 =
                                                      ::x10::lang::Place::_alloc();
                                                   (alloc__86767)->::x10::lang::Place::_constructor(
                                                     thief__86765);
                                                   alloc__86767;
                                               }))
                                               , reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__22<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__22<TPMGL(Queue),TPMGL(R)>(st__86768, loot__86769, victim__86759))),
                                               ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            }
            
        }
        
        //#line 439 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>* this__86782 =
          saved_this;
        
        //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86783 =
          st;
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        while ((((__extension__ ({
                   ::x10::glb::FixedSizeStack<x10_long>* this__86775 =
                     ::x10aux::nullCheck(this__86782)->FMGL(thieves);
                   ::x10aux::nullCheck(this__86775)->FMGL(size);
               }))
               ) > (((x10_long)0ll)))) {
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x10_long thief__86776 = (__extension__ ({
                ::x10::glb::FixedSizeStack<x10_long>* this__86777 =
                  ::x10aux::nullCheck(this__86782)->FMGL(thieves);
                ::x10aux::nullCheck(::x10aux::nullCheck(this__86777)->FMGL(data))->x10::lang::template Rail< x10_long >::__apply(
                  ::x10aux::nullCheck(this__86777)->FMGL(size) =
                    ((::x10aux::nullCheck(this__86777)->FMGL(size)) - (((x10_long)1ll))));
            }))
            ;
            
            //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if (((thief__86776) >= (((x10_long)0ll)))) {
                
                //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::glb::FixedSizeStack<x10_long>* this__86773 =
                  ::x10aux::nullCheck(this__86782)->FMGL(lifelineThieves);
                
                //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                x10_long t__86774 = thief__86776;
                ::x10aux::nullCheck(::x10aux::nullCheck(this__86773)->FMGL(data))->x10::lang::template Rail< x10_long >::__set(
                  ((::x10aux::nullCheck(this__86773)->FMGL(size) =
                    ((::x10aux::nullCheck(this__86773)->FMGL(size)) + (((x10_long)1ll)))) - (((x10_long)1ll))),
                  t__86774);
                
                //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::lang::Runtime::runUncountedAsync((__extension__ ({
                                                            ::x10::lang::Place alloc__86778 =
                                                              
                                                            ::x10::lang::Place::_alloc();
                                                            (alloc__86778)->::x10::lang::Place::_constructor(
                                                              thief__86776);
                                                            alloc__86778;
                                                        }))
                                                        ,
                                                        reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__23<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__23<TPMGL(Queue),TPMGL(R)>(st__86783))),
                                                        ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            } else {
                
                //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::lang::Runtime::runUncountedAsync((__extension__ ({
                                                            ::x10::lang::Place alloc__86779 =
                                                              
                                                            ::x10::lang::Place::_alloc();
                                                            (alloc__86779)->::x10::lang::Place::_constructor(
                                                              (((-(thief__86776))) - (((x10_long)1ll))));
                                                            alloc__86779;
                                                        }))
                                                        ,
                                                        reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__24<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__24<TPMGL(Queue),TPMGL(R)>(st__86783))),
                                                        ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            }
            
        }
        
    }
    
    // captured environment
    ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__19<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__19<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>* that_saved_this = buf.read< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>();
        x10_glb_Worker__closure__19<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__19<TPMGL(Queue),TPMGL(R) >(that_saved_this);
        return this_;
    }
    
    x10_glb_Worker__closure__19(::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_1< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> > >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_1< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> > >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:439";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_1< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >::template itable <x10_glb_Worker__closure__19<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__19<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__19<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__19<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__19<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_1< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> > >, &x10_glb_Worker__closure__19<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__19<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__19<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_WORKER__CLOSURE__19_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__25_CLOSURE
#define X10_GLB_WORKER__CLOSURE__25_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__25 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__25<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            ::x10aux::nullCheck(st->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->x10::glb::template Worker<TPMGL(Queue), TPMGL(R)>::main(
              st);
        }
        catch (::x10::lang::CheckedThrowable* __exc370) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc370)) {
                ::x10::lang::Error* __lowerer__var__0__ = static_cast< ::x10::lang::Error*>(__exc370);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc370);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__25<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__25<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        x10_glb_Worker__closure__25<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__25<TPMGL(Queue),TPMGL(R) >(that_st);
        return this_;
    }
    
    x10_glb_Worker__closure__25(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st) : st(st) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:395";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__25<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__25<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__25<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__25<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__25<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__25<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__25<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__25<TPMGL(Queue),TPMGL(R) >::_deserialize);
template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__25<TPMGL(Queue),TPMGL(R) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_glb_Worker__closure__25<TPMGL(Queue),TPMGL(R) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_GLB_WORKER__CLOSURE__25_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__27_CLOSURE
#define X10_GLB_WORKER__CLOSURE__27_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__27 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__27<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            ::x10aux::nullCheck(st->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->x10::glb::template Worker<TPMGL(Queue), TPMGL(R)>::main(
              st);
        }
        catch (::x10::lang::CheckedThrowable* __exc371) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc371)) {
                ::x10::lang::Error* __lowerer__var__0__ = static_cast< ::x10::lang::Error*>(__exc371);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc371);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__27<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__27<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        x10_glb_Worker__closure__27<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__27<TPMGL(Queue),TPMGL(R) >(that_st);
        return this_;
    }
    
    x10_glb_Worker__closure__27(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st) : st(st) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:403";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__27<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__27<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__27<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__27<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__27<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__27<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__27<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__27<TPMGL(Queue),TPMGL(R) >::_deserialize);
template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__27<TPMGL(Queue),TPMGL(R) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_glb_Worker__closure__27<TPMGL(Queue),TPMGL(R) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_GLB_WORKER__CLOSURE__27_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__26_CLOSURE
#define X10_GLB_WORKER__CLOSURE__26_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__26 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__26<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 400 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x10_long max = ((x10_long)::x10aux::here);
            
            //#line 401 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x10_long min = (__extension__ ({
                
                //#line 374 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                x10_long a__86588 = ((max) - (((x10_long)31ll)));
                ((a__86588) < (((x10_long)0ll))) ? (((x10_long)0ll)) : (a__86588);
            }))
            ;
            
            //#line 402 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            {
                x10_long j;
                for (j = min; ((j) <= (max)); j = ((j) + (((x10_long)1ll))))
                {
                    
                    //#line 403 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    ::x10::lang::Runtime::runAsync((__extension__ ({
                                                       ::x10::lang::Place alloc__79994 =
                                                          ::x10::lang::Place::_alloc();
                                                       (alloc__79994)->::x10::lang::Place::_constructor(
                                                         j);
                                                       alloc__79994;
                                                   }))
                                                   , reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__27<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__27<TPMGL(Queue),TPMGL(R)>(st))),
                                                   ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                }
            }
            
        }
        catch (::x10::lang::CheckedThrowable* __exc372) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc372)) {
                ::x10::lang::Error* __lowerer__var__0__ =
                  static_cast< ::x10::lang::Error*>(__exc372);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc372);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__26<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__26<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        x10_glb_Worker__closure__26<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__26<TPMGL(Queue),TPMGL(R) >(that_st);
        return this_;
    }
    
    x10_glb_Worker__closure__26(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st) : st(st) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:399-405";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__26<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__26<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__26<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__26<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__26<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__26<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__26<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__26<TPMGL(Queue),TPMGL(R) >::_deserialize);
template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__26<TPMGL(Queue),TPMGL(R) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_glb_Worker__closure__26<TPMGL(Queue),TPMGL(R) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_GLB_WORKER__CLOSURE__26_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__28_CLOSURE
#define X10_GLB_WORKER__CLOSURE__28_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__28 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__28<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>* this__86749 = st->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply();
            
            //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86750 =
              st;
            
            //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10aux::nullCheck(this__86749)->FMGL(context) = (__extension__ ({
                ::x10::glb::Context<TPMGL(Queue), TPMGL(R)>* alloc__86748 =
                   (new (::x10aux::alloc_z< ::x10::glb::Context<TPMGL(Queue), TPMGL(R)> >()) ::x10::glb::Context<TPMGL(Queue), TPMGL(R)>());
                
                //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
                ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86747 =
                  st__86750;
                
                //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
                alloc__86748->FMGL(st) = ::x10aux::zeroValue< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
                
                //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
                alloc__86748->FMGL(st) = st__86747;
                alloc__86748;
            }))
            ;
        }
        catch (::x10::lang::CheckedThrowable* __exc375) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc375)) {
                ::x10::lang::Error* __lowerer__var__0__ =
                  static_cast< ::x10::lang::Error*>(__exc375);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc375);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__28<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__28<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        x10_glb_Worker__closure__28<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__28<TPMGL(Queue),TPMGL(R) >(that_st);
        return this_;
    }
    
    x10_glb_Worker__closure__28(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st) : st(st) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:419";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__28<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__28<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__28<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__28<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__28<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__28<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__28<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__28<TPMGL(Queue),TPMGL(R) >::_deserialize);
template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__28<TPMGL(Queue),TPMGL(R) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_glb_Worker__closure__28<TPMGL(Queue),TPMGL(R) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_GLB_WORKER__CLOSURE__28_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__30_CLOSURE
#define X10_GLB_WORKER__CLOSURE__30_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__30 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__30<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>* this__86753 = st->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply();
            
            //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86754 =
              st;
            
            //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10aux::nullCheck(this__86753)->FMGL(context) = (__extension__ ({
                ::x10::glb::Context<TPMGL(Queue), TPMGL(R)>* alloc__86752 =
                   (new (::x10aux::alloc_z< ::x10::glb::Context<TPMGL(Queue), TPMGL(R)> >()) ::x10::glb::Context<TPMGL(Queue), TPMGL(R)>());
                
                //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
                ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86751 =
                  st__86754;
                
                //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
                alloc__86752->FMGL(st) = ::x10aux::zeroValue< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
                
                //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
                alloc__86752->FMGL(st) = st__86751;
                alloc__86752;
            }))
            ;
        }
        catch (::x10::lang::CheckedThrowable* __exc376) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc376)) {
                ::x10::lang::Error* __lowerer__var__0__ =
                  static_cast< ::x10::lang::Error*>(__exc376);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc376);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__30<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__30<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        x10_glb_Worker__closure__30<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__30<TPMGL(Queue),TPMGL(R) >(that_st);
        return this_;
    }
    
    x10_glb_Worker__closure__30(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st) : st(st) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:427";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__30<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__30<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__30<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__30<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__30<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__30<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__30<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__30<TPMGL(Queue),TPMGL(R) >::_deserialize);
template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__30<TPMGL(Queue),TPMGL(R) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_glb_Worker__closure__30<TPMGL(Queue),TPMGL(R) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_GLB_WORKER__CLOSURE__30_CLOSURE
#ifndef X10_GLB_WORKER__CLOSURE__29_CLOSURE
#define X10_GLB_WORKER__CLOSURE__29_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Worker__closure__29 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__29<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x10_long max = ((x10_long)::x10aux::here);
            
            //#line 425 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x10_long min = (__extension__ ({
                
                //#line 374 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
                x10_long a__86599 = ((max) - (((x10_long)31ll)));
                ((a__86599) < (((x10_long)0ll))) ? (((x10_long)0ll)) : (a__86599);
            }))
            ;
            
            //#line 426 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            {
                x10_long j;
                for (j = min; ((j) <= (max)); j = ((j) + (((x10_long)1ll))))
                {
                    
                    //#line 427 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    ::x10::lang::Runtime::runAsync((__extension__ ({
                                                       ::x10::lang::Place alloc__79997 =
                                                          ::x10::lang::Place::_alloc();
                                                       (alloc__79997)->::x10::lang::Place::_constructor(
                                                         j);
                                                       alloc__79997;
                                                   }))
                                                   , reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__30<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__30<TPMGL(Queue),TPMGL(R)>(st))),
                                                   ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                }
            }
            
        }
        catch (::x10::lang::CheckedThrowable* __exc377) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc377)) {
                ::x10::lang::Error* __lowerer__var__0__ =
                  static_cast< ::x10::lang::Error*>(__exc377);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc377);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Worker__closure__29<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Worker__closure__29<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        x10_glb_Worker__closure__29<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Worker__closure__29<TPMGL(Queue),TPMGL(R) >(that_st);
        return this_;
    }
    
    x10_glb_Worker__closure__29(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st) : st(st) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:423-429";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Worker__closure__29<TPMGL(Queue),TPMGL(R) > >x10_glb_Worker__closure__29<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Worker__closure__29<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Worker__closure__29<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Worker__closure__29<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Worker__closure__29<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__29<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Worker__closure__29<TPMGL(Queue),TPMGL(R) >::_deserialize);
template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Worker__closure__29<TPMGL(Queue),TPMGL(R) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_glb_Worker__closure__29<TPMGL(Queue),TPMGL(R) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_GLB_WORKER__CLOSURE__29_CLOSURE

//#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
/** TaskQueue, responsible for crunching numbers */

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
/** Read as I am the "lifeline buddy" of my "lifelineThieves" */

//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
/** Thieves that send stealing requests*/

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
/** Lifeline buddies */

//#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
/** The data structure to keep a key invariant: 
     * At any time, at most one message has been sent on an
     * outgoing lifeline (and hence at most one message has
     * been received on an incoming lifeline).*/

//#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
/** The granularity of tasks to run in a batch before starts to probe network to respond to work-stealing 
     * requests. The smaller n is, the more responsive to the work-stealing requests; on the other hand, less focused
     * on computation */

//#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
/** Number of random victims to probe before sending requests to lifeline buddy*/

//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
/** Maximum number of random victims */

//#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
/** Random number, used when picking a non-lifeline victim/buddy. Important to seed with place id, otherwise
      BG/Q, the random sequence will be exactly same at different places*/

//#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
/** Random buddies, a runner first probes its random buddy, only when none of the random buddies responds
     *  it starts to probe its lifeline buddies */

//#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
/** Logger to record the work-stealing status */

//#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
/** Variables used for synchronization, made sure not to be optimized out by the compiler */

//#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"

//#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"

//#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"

//#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"

//#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::Worker<TPMGL(Queue), TPMGL(R)>::_constructor(
                                               ::x10::lang::Fun_0_0<TPMGL(Queue)>* init,
                                               x10_int n,
                                               x10_int w,
                                               x10_int l,
                                               x10_int z,
                                               x10_int m,
                                               x10_boolean tree) {
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    this->x10::glb::template Worker<TPMGL(Queue), TPMGL(R)>::__fieldInitializers_x10_glb_Worker();
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    this->FMGL(n) = n;
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    this->FMGL(w) = w;
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    this->FMGL(m) = m;
    
    //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    this->FMGL(lifelines) = ::x10::lang::Rail< x10_long >::_make(((x10_long)(z)),
                                                                 ((x10_long)-1ll));
    
    //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    x10_long h = ((x10_long)::x10aux::here);
    
    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    this->FMGL(victims) = ::x10::lang::Rail< x10_long >::_make(((x10_long)(m)));
    
    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    if (((this->FMGL(P)) > (((x10_long)1ll)))) {
        {
            x10_long i;
            for (i = ((x10_long)0ll); ((i) < (((x10_long)(m))));
                 i = ((i) + (((x10_long)1ll)))) {
                
                //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                while ((::x10aux::struct_equals(::x10aux::nullCheck(this->FMGL(victims))->x10::lang::template Rail< x10_long >::__set(
                                                  i, this->FMGL(random)->nextLong(
                                                       this->FMGL(P))),
                                                h))) {
                    ;
                }
                
            }
        }
        
    }
    
    //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    x10_long x = ((x10_long)1ll);
    
    //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    x10_long t = ((x10_long)0ll);
    
    //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    {
        x10_long j;
        for (j = ((x10_long)0ll); ((j) < (((x10_long)(z))));
             j = ((j) + (((x10_long)1ll)))) {
            
            //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x10_long v = h;
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            {
                x10_long k;
                for (k = ((x10_long)1ll); ((k) < (((x10_long)(l))));
                     k = ((k) + (((x10_long)1ll)))) {
                    
                    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    v = ((((v) - (((v) % ::x10aux::zeroCheck(((x) * (((x10_long)(l))))))))) + (((((((v) + (((x) * (((x10_long)(l))))))) - (x))) % ::x10aux::zeroCheck(((x) * (((x10_long)(l))))))));
                    
                    //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    if (((v) < (this->FMGL(P)))) {
                        
                        //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        ::x10aux::nullCheck(this->FMGL(lifelines))->x10::lang::template Rail< x10_long >::__set(
                          (__extension__ ({
                              x10_long pre__79464 = t;
                              t = ((t) + (((x10_long)1ll)));
                              pre__79464;
                          }))
                          , v);
                        
                        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        break;
                    }
                    
                }
            }
            
            //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x = ((x) * (((x10_long)(l))));
        }
    }
    
    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    this->FMGL(queue) = ::x10::lang::Fun_0_0<TPMGL(Queue)>::__apply(::x10aux::nullCheck(init));
    
    //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    this->FMGL(lifelineThieves) = (__extension__ ({
        ::x10::glb::FixedSizeStack<x10_long>* alloc__79981 =
           (new (::x10aux::alloc_z< ::x10::glb::FixedSizeStack<x10_long> >()) ::x10::glb::FixedSizeStack<x10_long>());
        (alloc__79981)->::x10::glb::FixedSizeStack<x10_long>::_constructor(
          (((x10_long)(::x10aux::nullCheck(this->FMGL(lifelines))->FMGL(size))) + (((x10_long)3ll))));
        alloc__79981;
    }))
    ;
    
    //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    this->FMGL(thieves) = (__extension__ ({
        ::x10::glb::FixedSizeStack<x10_long>* alloc__79982 =
           (new (::x10aux::alloc_z< ::x10::glb::FixedSizeStack<x10_long> >()) ::x10::glb::FixedSizeStack<x10_long>());
        (alloc__79982)->::x10::glb::FixedSizeStack<x10_long>::_constructor(
          this->FMGL(P));
        alloc__79982;
    }))
    ;
    
    //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    this->FMGL(lifelinesActivated) = ::x10::lang::Rail< x10_boolean >::_make(this->FMGL(P));
    
    //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    if (tree) {
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        if (((((((((x10_long)3ll)) * (h))) + (((x10_long)1ll)))) < (this->FMGL(P))))
        {
            ::x10::glb::FixedSizeStack<x10_long>* this__86651 =
              this->FMGL(lifelineThieves);
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
            x10_long t__86652 = ((((((x10_long)3ll)) * (h))) + (((x10_long)1ll)));
            ::x10aux::nullCheck(::x10aux::nullCheck(this__86651)->FMGL(data))->x10::lang::template Rail< x10_long >::__set(
              ((::x10aux::nullCheck(this__86651)->FMGL(size) =
                ((::x10aux::nullCheck(this__86651)->FMGL(size)) + (((x10_long)1ll)))) - (((x10_long)1ll))),
              t__86652);
        }
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        if (((((((((x10_long)3ll)) * (h))) + (((x10_long)2ll)))) < (this->FMGL(P))))
        {
            ::x10::glb::FixedSizeStack<x10_long>* this__86653 =
              this->FMGL(lifelineThieves);
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
            x10_long t__86654 = ((((((x10_long)3ll)) * (h))) + (((x10_long)2ll)));
            ::x10aux::nullCheck(::x10aux::nullCheck(this__86653)->FMGL(data))->x10::lang::template Rail< x10_long >::__set(
              ((::x10aux::nullCheck(this__86653)->FMGL(size) =
                ((::x10aux::nullCheck(this__86653)->FMGL(size)) + (((x10_long)1ll)))) - (((x10_long)1ll))),
              t__86654);
        }
        
        //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        if (((((((((x10_long)3ll)) * (h))) + (((x10_long)3ll)))) < (this->FMGL(P))))
        {
            ::x10::glb::FixedSizeStack<x10_long>* this__86655 =
              this->FMGL(lifelineThieves);
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
            x10_long t__86656 = ((((((x10_long)3ll)) * (h))) + (((x10_long)3ll)));
            ::x10aux::nullCheck(::x10aux::nullCheck(this__86655)->FMGL(data))->x10::lang::template Rail< x10_long >::__set(
              ((::x10aux::nullCheck(this__86655)->FMGL(size) =
                ((::x10aux::nullCheck(this__86655)->FMGL(size)) + (((x10_long)1ll)))) - (((x10_long)1ll))),
              t__86656);
        }
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        if (((h) > (((x10_long)0ll)))) {
            ::x10aux::nullCheck(this->FMGL(lifelinesActivated))->x10::lang::template Rail< x10_boolean >::__set(
              ((((h) - (((x10_long)1ll)))) / ::x10aux::zeroCheck(((x10_long)3ll))),
              true);
        }
        
    }
    
    //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    this->FMGL(logger) = (__extension__ ({
        ::x10::glb::Logger* alloc__79983 =  (new (::x10aux::alloc_z< ::x10::glb::Logger>()) ::x10::glb::Logger());
        (alloc__79983)->::x10::glb::Logger::_constructor(
          true);
        alloc__79983;
    }))
    ;
}
template<class TPMGL(Queue), class TPMGL(R)> ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>* x10::glb::Worker<TPMGL(Queue), TPMGL(R)>::_make(
                                               ::x10::lang::Fun_0_0<TPMGL(Queue)>* init,
                                               x10_int n,
                                               x10_int w,
                                               x10_int l,
                                               x10_int z,
                                               x10_int m,
                                               x10_boolean tree)
{
    ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>* this_ = new (::x10aux::alloc_z< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)> >()) ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>();
    this_->_constructor(init, n, w, l, z, m, tree);
    return this_;
}



//#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::Worker<TPMGL(Queue), TPMGL(R)>::processStack(
  ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st) {
    
    //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    do {
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        while (::x10::glb::TaskQueue<TPMGL(Queue), TPMGL(R)>::process(::x10aux::nullCheck(this->FMGL(queue)), 
                 ((x10_long)(this->FMGL(n))), this->FMGL(context)))
        {
            
            //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::lang::Runtime::probe();
            
            //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>* this__86682 =
              this;
            
            //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86683 =
              st;
            
            //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::glb::TaskBag* loot__86672;
            
            //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            while (((((((__extension__ ({
                         ::x10::glb::FixedSizeStack<x10_long>* this__86673 =
                           ::x10aux::nullCheck(this__86682)->FMGL(thieves);
                         ::x10aux::nullCheck(this__86673)->FMGL(size);
                     }))
                     ) > (((x10_long)0ll))) || (((__extension__ ({
                         ::x10::glb::FixedSizeStack<x10_long>* this__86674 =
                           ::x10aux::nullCheck(this__86682)->FMGL(lifelineThieves);
                         ::x10aux::nullCheck(this__86674)->FMGL(size);
                     }))
                     ) > (((x10_long)0ll))))) && (!::x10aux::struct_equals((loot__86672 =
                                                                              ::x10::glb::TaskQueue<TPMGL(Queue), TPMGL(R)>::split(::x10aux::nullCheck(::x10aux::nullCheck(this__86682)->FMGL(queue)))),
                                                                           reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))))
            {
                
                //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86670 =
                  st__86683;
                ::x10::glb::TaskBag* loot__86671 = loot__86672;
                
                //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                x10_long victim__86661 = ((x10_long)::x10aux::here);
                
                //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::glb::Logger* obj__86660 = ::x10aux::nullCheck(this__86682)->FMGL(logger);
                ::x10aux::nullCheck(obj__86660)->FMGL(nodesGiven) =
                  ((::x10aux::nullCheck(obj__86660)->FMGL(nodesGiven)) + (::x10::glb::TaskBag::size(::x10aux::nullCheck(loot__86671))));
                
                //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if ((((__extension__ ({
                        ::x10::glb::FixedSizeStack<x10_long>* this__86662 =
                          ::x10aux::nullCheck(this__86682)->FMGL(thieves);
                        ::x10aux::nullCheck(this__86662)->FMGL(size);
                    }))
                    ) > (((x10_long)0ll)))) {
                    
                    //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    x10_long thief__86663 = (__extension__ ({
                        ::x10::glb::FixedSizeStack<x10_long>* this__86664 =
                          ::x10aux::nullCheck(this__86682)->FMGL(thieves);
                        ::x10aux::nullCheck(::x10aux::nullCheck(this__86664)->FMGL(data))->x10::lang::template Rail< x10_long >::__apply(
                          ::x10aux::nullCheck(this__86664)->FMGL(size) =
                            ((::x10aux::nullCheck(this__86664)->FMGL(size)) - (((x10_long)1ll))));
                    }))
                    ;
                    
                    //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    if (((thief__86663) >= (((x10_long)0ll))))
                    {
                        
                        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        ::x10::glb::Logger* obj__86657 = ::x10aux::nullCheck(this__86682)->FMGL(logger);
                        ::x10aux::nullCheck(obj__86657)->FMGL(lifelineStealsSuffered) =
                          ((::x10aux::nullCheck(obj__86657)->FMGL(lifelineStealsSuffered)) + (((x10_long)1ll)));
                        
                        //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        ::x10::lang::Runtime::runUncountedAsync(
                          (__extension__ ({
                              ::x10::lang::Place alloc__86665 =
                                 ::x10::lang::Place::_alloc();
                              (alloc__86665)->::x10::lang::Place::_constructor(
                                thief__86663);
                              alloc__86665;
                          }))
                          , reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__1<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__1<TPMGL(Queue),TPMGL(R)>(st__86670, loot__86671, victim__86661))),
                          ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                    } else {
                        
                        //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        ::x10::glb::Logger* obj__86658 = ::x10aux::nullCheck(this__86682)->FMGL(logger);
                        ::x10aux::nullCheck(obj__86658)->FMGL(stealsSuffered) =
                          ((::x10aux::nullCheck(obj__86658)->FMGL(stealsSuffered)) + (((x10_long)1ll)));
                        
                        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        ::x10::lang::Runtime::runUncountedAsync(
                          (__extension__ ({
                              ::x10::lang::Place alloc__86666 =
                                 ::x10::lang::Place::_alloc();
                              (alloc__86666)->::x10::lang::Place::_constructor(
                                (((-(thief__86663))) - (((x10_long)1ll))));
                              alloc__86666;
                          }))
                          , reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__2<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__2<TPMGL(Queue),TPMGL(R)>(st__86670, loot__86671))),
                          ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                    }
                    
                } else {
                    
                    //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    ::x10::glb::Logger* obj__86659 = ::x10aux::nullCheck(this__86682)->FMGL(logger);
                    ::x10aux::nullCheck(obj__86659)->FMGL(lifelineStealsSuffered) =
                      ((::x10aux::nullCheck(obj__86659)->FMGL(lifelineStealsSuffered)) + (((x10_long)1ll)));
                    
                    //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    x10_long thief__86667 = (__extension__ ({
                        ::x10::glb::FixedSizeStack<x10_long>* this__86668 =
                          ::x10aux::nullCheck(this__86682)->FMGL(lifelineThieves);
                        ::x10aux::nullCheck(::x10aux::nullCheck(this__86668)->FMGL(data))->x10::lang::template Rail< x10_long >::__apply(
                          ::x10aux::nullCheck(this__86668)->FMGL(size) =
                            ((::x10aux::nullCheck(this__86668)->FMGL(size)) - (((x10_long)1ll))));
                    }))
                    ;
                    
                    //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    ::x10::lang::Runtime::runAsync((__extension__ ({
                                                       ::x10::lang::Place alloc__86669 =
                                                         
                                                       ::x10::lang::Place::_alloc();
                                                       (alloc__86669)->::x10::lang::Place::_constructor(
                                                         thief__86667);
                                                       alloc__86669;
                                                   }))
                                                   , reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__3<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__3<TPMGL(Queue),TPMGL(R)>(st__86670, loot__86671, victim__86661))),
                                                   ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                }
                
            }
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>* this__86684 =
              this;
            
            //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86685 =
              st;
            
            //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            while ((((__extension__ ({
                       ::x10::glb::FixedSizeStack<x10_long>* this__86677 =
                         ::x10aux::nullCheck(this__86684)->FMGL(thieves);
                       ::x10aux::nullCheck(this__86677)->FMGL(size);
                   }))
                   ) > (((x10_long)0ll)))) {
                
                //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                x10_long thief__86678 = (__extension__ ({
                    ::x10::glb::FixedSizeStack<x10_long>* this__86679 =
                      ::x10aux::nullCheck(this__86684)->FMGL(thieves);
                    ::x10aux::nullCheck(::x10aux::nullCheck(this__86679)->FMGL(data))->x10::lang::template Rail< x10_long >::__apply(
                      ::x10aux::nullCheck(this__86679)->FMGL(size) =
                        ((::x10aux::nullCheck(this__86679)->FMGL(size)) - (((x10_long)1ll))));
                }))
                ;
                
                //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (((thief__86678) >= (((x10_long)0ll))))
                {
                    
                    //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    ::x10::glb::FixedSizeStack<x10_long>* this__86675 =
                      ::x10aux::nullCheck(this__86684)->FMGL(lifelineThieves);
                    
                    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                    x10_long t__86676 = thief__86678;
                    ::x10aux::nullCheck(::x10aux::nullCheck(this__86675)->FMGL(data))->x10::lang::template Rail< x10_long >::__set(
                      ((::x10aux::nullCheck(this__86675)->FMGL(size) =
                        ((::x10aux::nullCheck(this__86675)->FMGL(size)) + (((x10_long)1ll)))) - (((x10_long)1ll))),
                      t__86676);
                    
                    //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    ::x10::lang::Runtime::runUncountedAsync(
                      (__extension__ ({
                          ::x10::lang::Place alloc__86680 =
                             ::x10::lang::Place::_alloc();
                          (alloc__86680)->::x10::lang::Place::_constructor(
                            thief__86678);
                          alloc__86680;
                      }))
                      , reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__4<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__4<TPMGL(Queue),TPMGL(R)>(st__86685))),
                      ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                } else {
                    
                    //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    ::x10::lang::Runtime::runUncountedAsync(
                      (__extension__ ({
                          ::x10::lang::Place alloc__86681 =
                             ::x10::lang::Place::_alloc();
                          (alloc__86681)->::x10::lang::Place::_constructor(
                            (((-(thief__86678))) - (((x10_long)1ll))));
                          alloc__86681;
                      }))
                      , reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__5<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__5<TPMGL(Queue),TPMGL(R)>(st__86685))),
                      ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                }
                
            }
            
        }
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>* this__86693 =
          this;
        
        //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86694 =
          st;
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        while ((((__extension__ ({
                   ::x10::glb::FixedSizeStack<x10_long>* this__86688 =
                     ::x10aux::nullCheck(this__86693)->FMGL(thieves);
                   ::x10aux::nullCheck(this__86688)->FMGL(size);
               }))
               ) > (((x10_long)0ll)))) {
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x10_long thief__86689 = (__extension__ ({
                ::x10::glb::FixedSizeStack<x10_long>* this__86690 =
                  ::x10aux::nullCheck(this__86693)->FMGL(thieves);
                ::x10aux::nullCheck(::x10aux::nullCheck(this__86690)->FMGL(data))->x10::lang::template Rail< x10_long >::__apply(
                  ::x10aux::nullCheck(this__86690)->FMGL(size) =
                    ((::x10aux::nullCheck(this__86690)->FMGL(size)) - (((x10_long)1ll))));
            }))
            ;
            
            //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if (((thief__86689) >= (((x10_long)0ll)))) {
                
                //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::glb::FixedSizeStack<x10_long>* this__86686 =
                  ::x10aux::nullCheck(this__86693)->FMGL(lifelineThieves);
                
                //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                x10_long t__86687 = thief__86689;
                ::x10aux::nullCheck(::x10aux::nullCheck(this__86686)->FMGL(data))->x10::lang::template Rail< x10_long >::__set(
                  ((::x10aux::nullCheck(this__86686)->FMGL(size) =
                    ((::x10aux::nullCheck(this__86686)->FMGL(size)) + (((x10_long)1ll)))) - (((x10_long)1ll))),
                  t__86687);
                
                //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::lang::Runtime::runUncountedAsync((__extension__ ({
                                                            ::x10::lang::Place alloc__86691 =
                                                              
                                                            ::x10::lang::Place::_alloc();
                                                            (alloc__86691)->::x10::lang::Place::_constructor(
                                                              thief__86689);
                                                            alloc__86691;
                                                        }))
                                                        ,
                                                        reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__6<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__6<TPMGL(Queue),TPMGL(R)>(st__86694))),
                                                        ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            } else {
                
                //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::lang::Runtime::runUncountedAsync((__extension__ ({
                                                            ::x10::lang::Place alloc__86692 =
                                                              
                                                            ::x10::lang::Place::_alloc();
                                                            (alloc__86692)->::x10::lang::Place::_constructor(
                                                              (((-(thief__86689))) - (((x10_long)1ll))));
                                                            alloc__86692;
                                                        }))
                                                        ,
                                                        reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__7<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__7<TPMGL(Queue),TPMGL(R)>(st__86694))),
                                                        ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            }
            
        }
        
    } while (this->x10::glb::template Worker<TPMGL(Queue), TPMGL(R)>::steal(
               st));
    
}

//#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::Worker<TPMGL(Queue), TPMGL(R)>::give(
  ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st,
  ::x10::glb::TaskBag* loot) {
    
    //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    x10_long victim = ((x10_long)::x10aux::here);
    
    //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    ::x10::glb::Logger* obj__86698 = this->FMGL(logger);
    ::x10aux::nullCheck(obj__86698)->FMGL(nodesGiven) = ((::x10aux::nullCheck(obj__86698)->FMGL(nodesGiven)) + (::x10::glb::TaskBag::size(::x10aux::nullCheck(loot))));
    
    //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    if ((((__extension__ ({
            ::x10::glb::FixedSizeStack<x10_long>* this__86527 =
              this->FMGL(thieves);
            ::x10aux::nullCheck(this__86527)->FMGL(size);
        }))
        ) > (((x10_long)0ll)))) {
        
        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        x10_long thief = (__extension__ ({
            ::x10::glb::FixedSizeStack<x10_long>* this__86528 =
              this->FMGL(thieves);
            ::x10aux::nullCheck(::x10aux::nullCheck(this__86528)->FMGL(data))->x10::lang::template Rail< x10_long >::__apply(
              ::x10aux::nullCheck(this__86528)->FMGL(size) =
                ((::x10aux::nullCheck(this__86528)->FMGL(size)) - (((x10_long)1ll))));
        }))
        ;
        
        //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        if (((thief) >= (((x10_long)0ll)))) {
            
            //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::glb::Logger* obj__86695 = this->FMGL(logger);
            ::x10aux::nullCheck(obj__86695)->FMGL(lifelineStealsSuffered) =
              ((::x10aux::nullCheck(obj__86695)->FMGL(lifelineStealsSuffered)) + (((x10_long)1ll)));
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::lang::Runtime::runUncountedAsync((__extension__ ({
                                                        ::x10::lang::Place alloc__79984 =
                                                          
                                                        ::x10::lang::Place::_alloc();
                                                        (alloc__79984)->::x10::lang::Place::_constructor(
                                                          thief);
                                                        alloc__79984;
                                                    }))
                                                    , reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__8<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__8<TPMGL(Queue),TPMGL(R)>(st, loot, victim))),
                                                    ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        } else {
            
            //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::glb::Logger* obj__86696 = this->FMGL(logger);
            ::x10aux::nullCheck(obj__86696)->FMGL(stealsSuffered) =
              ((::x10aux::nullCheck(obj__86696)->FMGL(stealsSuffered)) + (((x10_long)1ll)));
            
            //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::lang::Runtime::runUncountedAsync((__extension__ ({
                                                        ::x10::lang::Place alloc__79985 =
                                                          
                                                        ::x10::lang::Place::_alloc();
                                                        (alloc__79985)->::x10::lang::Place::_constructor(
                                                          (((-(thief))) - (((x10_long)1ll))));
                                                        alloc__79985;
                                                    }))
                                                    , reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__9<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__9<TPMGL(Queue),TPMGL(R)>(st, loot))),
                                                    ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        }
        
    } else {
        
        //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ::x10::glb::Logger* obj__86697 = this->FMGL(logger);
        ::x10aux::nullCheck(obj__86697)->FMGL(lifelineStealsSuffered) =
          ((::x10aux::nullCheck(obj__86697)->FMGL(lifelineStealsSuffered)) + (((x10_long)1ll)));
        
        //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        x10_long thief = (__extension__ ({
            ::x10::glb::FixedSizeStack<x10_long>* this__86529 =
              this->FMGL(lifelineThieves);
            ::x10aux::nullCheck(::x10aux::nullCheck(this__86529)->FMGL(data))->x10::lang::template Rail< x10_long >::__apply(
              ::x10aux::nullCheck(this__86529)->FMGL(size) =
                ((::x10aux::nullCheck(this__86529)->FMGL(size)) - (((x10_long)1ll))));
        }))
        ;
        
        //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ::x10::lang::Runtime::runAsync((__extension__ ({
                                           ::x10::lang::Place alloc__79986 =
                                              ::x10::lang::Place::_alloc();
                                           (alloc__79986)->::x10::lang::Place::_constructor(
                                             thief);
                                           alloc__79986;
                                       }))
                                       , reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__10<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__10<TPMGL(Queue),TPMGL(R)>(st, loot, victim))),
                                       ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
    
}

//#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::Worker<TPMGL(Queue), TPMGL(R)>::distribute(
  ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st) {
    
    //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    ::x10::glb::TaskBag* loot;
    
    //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    while (((((((__extension__ ({
                 ::x10::glb::FixedSizeStack<x10_long>* this__86530 =
                   this->FMGL(thieves);
                 ::x10aux::nullCheck(this__86530)->FMGL(size);
             }))
             ) > (((x10_long)0ll))) || (((__extension__ ({
                 ::x10::glb::FixedSizeStack<x10_long>* this__86531 =
                   this->FMGL(lifelineThieves);
                 ::x10aux::nullCheck(this__86531)->FMGL(size);
             }))
             ) > (((x10_long)0ll))))) && (!::x10aux::struct_equals((loot =
                                                                      ::x10::glb::TaskQueue<TPMGL(Queue), TPMGL(R)>::split(::x10aux::nullCheck(this->FMGL(queue)))),
                                                                   reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))))
    {
        
        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>* this__86712 =
          this;
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86713 =
          st;
        ::x10::glb::TaskBag* loot__86714 = loot;
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        x10_long victim__86703 = ((x10_long)::x10aux::here);
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ::x10::glb::Logger* obj__86702 = ::x10aux::nullCheck(this__86712)->FMGL(logger);
        ::x10aux::nullCheck(obj__86702)->FMGL(nodesGiven) =
          ((::x10aux::nullCheck(obj__86702)->FMGL(nodesGiven)) + (::x10::glb::TaskBag::size(::x10aux::nullCheck(loot__86714))));
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        if ((((__extension__ ({
                ::x10::glb::FixedSizeStack<x10_long>* this__86704 =
                  ::x10aux::nullCheck(this__86712)->FMGL(thieves);
                ::x10aux::nullCheck(this__86704)->FMGL(size);
            }))
            ) > (((x10_long)0ll)))) {
            
            //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x10_long thief__86705 = (__extension__ ({
                ::x10::glb::FixedSizeStack<x10_long>* this__86706 =
                  ::x10aux::nullCheck(this__86712)->FMGL(thieves);
                ::x10aux::nullCheck(::x10aux::nullCheck(this__86706)->FMGL(data))->x10::lang::template Rail< x10_long >::__apply(
                  ::x10aux::nullCheck(this__86706)->FMGL(size) =
                    ((::x10aux::nullCheck(this__86706)->FMGL(size)) - (((x10_long)1ll))));
            }))
            ;
            
            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if (((thief__86705) >= (((x10_long)0ll)))) {
                
                //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::glb::Logger* obj__86699 = ::x10aux::nullCheck(this__86712)->FMGL(logger);
                ::x10aux::nullCheck(obj__86699)->FMGL(lifelineStealsSuffered) =
                  ((::x10aux::nullCheck(obj__86699)->FMGL(lifelineStealsSuffered)) + (((x10_long)1ll)));
                
                //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::lang::Runtime::runUncountedAsync((__extension__ ({
                                                            ::x10::lang::Place alloc__86707 =
                                                              
                                                            ::x10::lang::Place::_alloc();
                                                            (alloc__86707)->::x10::lang::Place::_constructor(
                                                              thief__86705);
                                                            alloc__86707;
                                                        }))
                                                        ,
                                                        reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__11<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__11<TPMGL(Queue),TPMGL(R)>(st__86713, loot__86714, victim__86703))),
                                                        ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            } else {
                
                //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::glb::Logger* obj__86700 = ::x10aux::nullCheck(this__86712)->FMGL(logger);
                ::x10aux::nullCheck(obj__86700)->FMGL(stealsSuffered) =
                  ((::x10aux::nullCheck(obj__86700)->FMGL(stealsSuffered)) + (((x10_long)1ll)));
                
                //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::lang::Runtime::runUncountedAsync((__extension__ ({
                                                            ::x10::lang::Place alloc__86708 =
                                                              
                                                            ::x10::lang::Place::_alloc();
                                                            (alloc__86708)->::x10::lang::Place::_constructor(
                                                              (((-(thief__86705))) - (((x10_long)1ll))));
                                                            alloc__86708;
                                                        }))
                                                        ,
                                                        reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__12<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__12<TPMGL(Queue),TPMGL(R)>(st__86713, loot__86714))),
                                                        ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            }
            
        } else {
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::glb::Logger* obj__86701 = ::x10aux::nullCheck(this__86712)->FMGL(logger);
            ::x10aux::nullCheck(obj__86701)->FMGL(lifelineStealsSuffered) =
              ((::x10aux::nullCheck(obj__86701)->FMGL(lifelineStealsSuffered)) + (((x10_long)1ll)));
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x10_long thief__86709 = (__extension__ ({
                ::x10::glb::FixedSizeStack<x10_long>* this__86710 =
                  ::x10aux::nullCheck(this__86712)->FMGL(lifelineThieves);
                ::x10aux::nullCheck(::x10aux::nullCheck(this__86710)->FMGL(data))->x10::lang::template Rail< x10_long >::__apply(
                  ::x10aux::nullCheck(this__86710)->FMGL(size) =
                    ((::x10aux::nullCheck(this__86710)->FMGL(size)) - (((x10_long)1ll))));
            }))
            ;
            
            //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::lang::Runtime::runAsync((__extension__ ({
                                               ::x10::lang::Place alloc__86711 =
                                                  ::x10::lang::Place::_alloc();
                                               (alloc__86711)->::x10::lang::Place::_constructor(
                                                 thief__86709);
                                               alloc__86711;
                                           }))
                                           , reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__13<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__13<TPMGL(Queue),TPMGL(R)>(st__86713, loot__86714, victim__86703))),
                                           ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        }
        
    }
    
}

//#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::Worker<TPMGL(Queue), TPMGL(R)>::reject(
  ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st) {
    
    //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    while ((((__extension__ ({
               ::x10::glb::FixedSizeStack<x10_long>* this__86550 =
                 this->FMGL(thieves);
               ::x10aux::nullCheck(this__86550)->FMGL(size);
           }))
           ) > (((x10_long)0ll)))) {
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        x10_long thief = (__extension__ ({
            ::x10::glb::FixedSizeStack<x10_long>* this__86551 =
              this->FMGL(thieves);
            ::x10aux::nullCheck(::x10aux::nullCheck(this__86551)->FMGL(data))->x10::lang::template Rail< x10_long >::__apply(
              ::x10aux::nullCheck(this__86551)->FMGL(size) =
                ((::x10aux::nullCheck(this__86551)->FMGL(size)) - (((x10_long)1ll))));
        }))
        ;
        
        //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        if (((thief) >= (((x10_long)0ll)))) {
            
            //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::glb::FixedSizeStack<x10_long>* this__86715 =
              this->FMGL(lifelineThieves);
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
            x10_long t__86716 = thief;
            ::x10aux::nullCheck(::x10aux::nullCheck(this__86715)->FMGL(data))->x10::lang::template Rail< x10_long >::__set(
              ((::x10aux::nullCheck(this__86715)->FMGL(size) =
                ((::x10aux::nullCheck(this__86715)->FMGL(size)) + (((x10_long)1ll)))) - (((x10_long)1ll))),
              t__86716);
            
            //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::lang::Runtime::runUncountedAsync((__extension__ ({
                                                        ::x10::lang::Place alloc__79987 =
                                                          
                                                        ::x10::lang::Place::_alloc();
                                                        (alloc__79987)->::x10::lang::Place::_constructor(
                                                          thief);
                                                        alloc__79987;
                                                    }))
                                                    , reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__14<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__14<TPMGL(Queue),TPMGL(R)>(st))),
                                                    ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        } else {
            
            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::lang::Runtime::runUncountedAsync((__extension__ ({
                                                        ::x10::lang::Place alloc__79988 =
                                                          
                                                        ::x10::lang::Place::_alloc();
                                                        (alloc__79988)->::x10::lang::Place::_constructor(
                                                          (((-(thief))) - (((x10_long)1ll))));
                                                        alloc__79988;
                                                    }))
                                                    , reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__15<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__15<TPMGL(Queue),TPMGL(R)>(st))),
                                                    ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        }
        
    }
    
}

//#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
template<class TPMGL(Queue), class TPMGL(R)> x10_boolean x10::glb::Worker<TPMGL(Queue), TPMGL(R)>::steal(
  ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st) {
    
    //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    if ((::x10aux::struct_equals(this->FMGL(P), ((x10_long)1ll))))
    {
        return false;
        
    }
    
    //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    x10_long p = ((x10_long)::x10aux::here);
    
    //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    this->FMGL(empty) = true;
    
    //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    {
        x10_long i;
        for (i = ((x10_long)0ll); (((i) < (((x10_long)(this->FMGL(w))))) &&
                                  this->FMGL(empty)); i =
                                                        ((i) + (((x10_long)1ll))))
        {
            
            //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::glb::Logger* obj__86717 = this->FMGL(logger);
            ::x10aux::nullCheck(obj__86717)->FMGL(stealsAttempted) =
              ((::x10aux::nullCheck(obj__86717)->FMGL(stealsAttempted)) + (((x10_long)1ll)));
            
            //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            this->FMGL(waiting) = true;
            
            //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10aux::nullCheck(this->FMGL(logger))->x10::glb::Logger::stopLive();
            
            //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x10_long v = ::x10aux::nullCheck(this->FMGL(victims))->x10::lang::template Rail< x10_long >::__apply(
                           ((x10_long)(this->FMGL(random)->nextInt(
                                         this->FMGL(m)))));
            
            //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::lang::Runtime::runUncountedAsync((__extension__ ({
                                                        ::x10::lang::Place alloc__79989 =
                                                          
                                                        ::x10::lang::Place::_alloc();
                                                        (alloc__79989)->::x10::lang::Place::_constructor(
                                                          v);
                                                        alloc__79989;
                                                    }))
                                                    , reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__16<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__16<TPMGL(Queue),TPMGL(R)>(st, p))),
                                                    ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            
            //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            while (this->FMGL(waiting)) {
                ::x10::lang::Runtime::probe();
            }
            
            //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10aux::nullCheck(this->FMGL(logger))->x10::glb::Logger::startLive();
        }
    }
    
    //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    {
        x10_long i;
        for (i = ((x10_long)0ll); ((((i) < ((x10_long)(::x10aux::nullCheck(this->FMGL(lifelines))->FMGL(size)))) &&
                                  this->FMGL(empty)) && ((((x10_long)0ll)) <= (::x10aux::nullCheck(this->FMGL(lifelines))->x10::lang::template Rail< x10_long >::__apply(
                                                                                 i))));
             i = ((i) + (((x10_long)1ll)))) {
            
            //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x10_long lifeline = ::x10aux::nullCheck(this->FMGL(lifelines))->x10::lang::template Rail< x10_long >::__apply(
                                  i);
            
            //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if (!(::x10aux::nullCheck(this->FMGL(lifelinesActivated))->x10::lang::template Rail< x10_boolean >::__apply(
                    lifeline))) {
                
                //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::glb::Logger* obj__86718 = this->FMGL(logger);
                ::x10aux::nullCheck(obj__86718)->FMGL(lifelineStealsAttempted) =
                  ((::x10aux::nullCheck(obj__86718)->FMGL(lifelineStealsAttempted)) + (((x10_long)1ll)));
                
                //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10aux::nullCheck(this->FMGL(lifelinesActivated))->x10::lang::template Rail< x10_boolean >::__set(
                  lifeline, true);
                
                //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                this->FMGL(waiting) = true;
                
                //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10aux::nullCheck(this->FMGL(logger))->x10::glb::Logger::stopLive();
                
                //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::lang::Runtime::runUncountedAsync((__extension__ ({
                                                            ::x10::lang::Place alloc__79990 =
                                                              
                                                            ::x10::lang::Place::_alloc();
                                                            (alloc__79990)->::x10::lang::Place::_constructor(
                                                              lifeline);
                                                            alloc__79990;
                                                        }))
                                                        ,
                                                        reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__17<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__17<TPMGL(Queue),TPMGL(R)>(st, p))),
                                                        ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                
                //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                while (this->FMGL(waiting)) {
                    ::x10::lang::Runtime::probe();
                }
                
                //#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10aux::nullCheck(this->FMGL(logger))->x10::glb::Logger::startLive();
            }
            
        }
    }
    
    //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    return !(this->FMGL(empty));
    
}

//#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::Worker<TPMGL(Queue), TPMGL(R)>::request(
  ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st,
  x10_long thief, x10_boolean lifeline) {
    
    //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    try {
        
        //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        if (lifeline) {
            ::x10::glb::Logger* obj__86719 = this->FMGL(logger);
            ::x10aux::nullCheck(obj__86719)->FMGL(lifelineStealsReceived) =
              ((::x10aux::nullCheck(obj__86719)->FMGL(lifelineStealsReceived)) + (((x10_long)1ll)));
        } else {
            ::x10::glb::Logger* obj__86720 = this->FMGL(logger);
            ::x10aux::nullCheck(obj__86720)->FMGL(stealsReceived) =
              ((::x10aux::nullCheck(obj__86720)->FMGL(stealsReceived)) + (((x10_long)1ll)));
        }
        
        //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        if ((this->FMGL(empty) || this->FMGL(waiting))) {
            
            //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if (lifeline) {
                ::x10::glb::FixedSizeStack<x10_long>* this__86721 =
                  this->FMGL(lifelineThieves);
                
                //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                x10_long t__86722 = thief;
                ::x10aux::nullCheck(::x10aux::nullCheck(this__86721)->FMGL(data))->x10::lang::template Rail< x10_long >::__set(
                  ((::x10aux::nullCheck(this__86721)->FMGL(size) =
                    ((::x10aux::nullCheck(this__86721)->FMGL(size)) + (((x10_long)1ll)))) - (((x10_long)1ll))),
                  t__86722);
            }
            
            //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::lang::Runtime::runUncountedAsync((__extension__ ({
                                                        ::x10::lang::Place alloc__79991 =
                                                          
                                                        ::x10::lang::Place::_alloc();
                                                        (alloc__79991)->::x10::lang::Place::_constructor(
                                                          thief);
                                                        alloc__79991;
                                                    }))
                                                    , reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__18<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__18<TPMGL(Queue),TPMGL(R)>(st))),
                                                    ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        } else 
        //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        if (lifeline) {
            ::x10::glb::FixedSizeStack<x10_long>* this__86723 =
              this->FMGL(thieves);
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
            x10_long t__86724 = thief;
            ::x10aux::nullCheck(::x10aux::nullCheck(this__86723)->FMGL(data))->x10::lang::template Rail< x10_long >::__set(
              ((::x10aux::nullCheck(this__86723)->FMGL(size) =
                ((::x10aux::nullCheck(this__86723)->FMGL(size)) + (((x10_long)1ll)))) - (((x10_long)1ll))),
              t__86724);
        } else {
            ::x10::glb::FixedSizeStack<x10_long>* this__86725 =
              this->FMGL(thieves);
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
            x10_long t__86726 = (((-(thief))) - (((x10_long)1ll)));
            ::x10aux::nullCheck(::x10aux::nullCheck(this__86725)->FMGL(data))->x10::lang::template Rail< x10_long >::__set(
              ((::x10aux::nullCheck(this__86725)->FMGL(size) =
                ((::x10aux::nullCheck(this__86725)->FMGL(size)) + (((x10_long)1ll)))) - (((x10_long)1ll))),
              t__86726);
        }
        
    }
    catch (::x10::lang::CheckedThrowable* __exc355) {
        if (true) {
            ::x10::lang::CheckedThrowable* v = static_cast< ::x10::lang::CheckedThrowable*>(__exc355);
            {
                
                //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::glb::Worker<void, void>::error(v);
            }
        } else
        throw;
    }
}

//#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::Worker<TPMGL(Queue), TPMGL(R)>::processLoot(
  ::x10::glb::TaskBag* loot, x10_boolean lifeline) {
    
    //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    x10_long n = ::x10::glb::TaskBag::size(::x10aux::nullCheck(loot));
    
    //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    if (lifeline) {
        
        //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ::x10::glb::Logger* obj__86727 = this->FMGL(logger);
        ::x10aux::nullCheck(obj__86727)->FMGL(lifelineStealsPerpetrated) =
          ((::x10aux::nullCheck(obj__86727)->FMGL(lifelineStealsPerpetrated)) + (((x10_long)1ll)));
        
        //#line 266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ::x10::glb::Logger* obj__86728 = this->FMGL(logger);
        ::x10aux::nullCheck(obj__86728)->FMGL(lifelineNodesReceived) =
          ((::x10aux::nullCheck(obj__86728)->FMGL(lifelineNodesReceived)) + (n));
    } else {
        
        //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ::x10::glb::Logger* obj__86729 = this->FMGL(logger);
        ::x10aux::nullCheck(obj__86729)->FMGL(stealsPerpetrated) =
          ((::x10aux::nullCheck(obj__86729)->FMGL(stealsPerpetrated)) + (((x10_long)1ll)));
        
        //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ::x10::glb::Logger* obj__86730 = this->FMGL(logger);
        ::x10aux::nullCheck(obj__86730)->FMGL(nodesReceived) =
          ((::x10aux::nullCheck(obj__86730)->FMGL(nodesReceived)) + (n));
    }
    
    //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    ::x10::glb::TaskQueue<TPMGL(Queue), TPMGL(R)>::merge(::x10aux::nullCheck(this->FMGL(queue)), 
      loot);
}

//#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::Worker<TPMGL(Queue), TPMGL(R)>::deal(
  ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st,
  ::x10::glb::TaskBag* loot, x10_long source) {
    
    //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    try {
        
        //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        x10_boolean lifeline = ((source) >= (((x10_long)0ll)));
        
        //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        if (lifeline) {
            ::x10aux::nullCheck(this->FMGL(lifelinesActivated))->x10::lang::template Rail< x10_boolean >::__set(
              source, false);
        }
        
        //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        this->FMGL(empty) = false;
        
        //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        if (this->FMGL(active)) {
            
            //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>* this__86736 =
              this;
            
            //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::glb::TaskBag* loot__86737 = loot;
            x10_boolean lifeline__86738 = lifeline;
            
            //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x10_long n__86735 = ::x10::glb::TaskBag::size(::x10aux::nullCheck(loot__86737));
            
            //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if (lifeline__86738) {
                
                //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::glb::Logger* obj__86731 = ::x10aux::nullCheck(this__86736)->FMGL(logger);
                ::x10aux::nullCheck(obj__86731)->FMGL(lifelineStealsPerpetrated) =
                  ((::x10aux::nullCheck(obj__86731)->FMGL(lifelineStealsPerpetrated)) + (((x10_long)1ll)));
                
                //#line 266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::glb::Logger* obj__86732 = ::x10aux::nullCheck(this__86736)->FMGL(logger);
                ::x10aux::nullCheck(obj__86732)->FMGL(lifelineNodesReceived) =
                  ((::x10aux::nullCheck(obj__86732)->FMGL(lifelineNodesReceived)) + (n__86735));
            } else {
                
                //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::glb::Logger* obj__86733 = ::x10aux::nullCheck(this__86736)->FMGL(logger);
                ::x10aux::nullCheck(obj__86733)->FMGL(stealsPerpetrated) =
                  ((::x10aux::nullCheck(obj__86733)->FMGL(stealsPerpetrated)) + (((x10_long)1ll)));
                
                //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::glb::Logger* obj__86734 = ::x10aux::nullCheck(this__86736)->FMGL(logger);
                ::x10aux::nullCheck(obj__86734)->FMGL(nodesReceived) =
                  ((::x10aux::nullCheck(obj__86734)->FMGL(nodesReceived)) + (n__86735));
            }
            
            //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::glb::TaskQueue<TPMGL(Queue), TPMGL(R)>::merge(::x10aux::nullCheck(::x10aux::nullCheck(this__86736)->FMGL(queue)), 
              loot__86737);
        } else {
            
            //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            this->FMGL(active) = true;
            
            //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10aux::nullCheck(this->FMGL(logger))->x10::glb::Logger::startLive();
            
            //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>* this__86744 =
              this;
            
            //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::glb::TaskBag* loot__86745 = loot;
            x10_boolean lifeline__86746 = lifeline;
            
            //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x10_long n__86743 = ::x10::glb::TaskBag::size(::x10aux::nullCheck(loot__86745));
            
            //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if (lifeline__86746) {
                
                //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::glb::Logger* obj__86739 = ::x10aux::nullCheck(this__86744)->FMGL(logger);
                ::x10aux::nullCheck(obj__86739)->FMGL(lifelineStealsPerpetrated) =
                  ((::x10aux::nullCheck(obj__86739)->FMGL(lifelineStealsPerpetrated)) + (((x10_long)1ll)));
                
                //#line 266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::glb::Logger* obj__86740 = ::x10aux::nullCheck(this__86744)->FMGL(logger);
                ::x10aux::nullCheck(obj__86740)->FMGL(lifelineNodesReceived) =
                  ((::x10aux::nullCheck(obj__86740)->FMGL(lifelineNodesReceived)) + (n__86743));
            } else {
                
                //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::glb::Logger* obj__86741 = ::x10aux::nullCheck(this__86744)->FMGL(logger);
                ::x10aux::nullCheck(obj__86741)->FMGL(stealsPerpetrated) =
                  ((::x10aux::nullCheck(obj__86741)->FMGL(stealsPerpetrated)) + (((x10_long)1ll)));
                
                //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::glb::Logger* obj__86742 = ::x10aux::nullCheck(this__86744)->FMGL(logger);
                ::x10aux::nullCheck(obj__86742)->FMGL(nodesReceived) =
                  ((::x10aux::nullCheck(obj__86742)->FMGL(nodesReceived)) + (n__86743));
            }
            
            //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::glb::TaskQueue<TPMGL(Queue), TPMGL(R)>::merge(::x10aux::nullCheck(::x10aux::nullCheck(this__86744)->FMGL(queue)), 
              loot__86745);
            
            //#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            this->x10::glb::template Worker<TPMGL(Queue), TPMGL(R)>::processStack(
              st);
            
            //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10aux::nullCheck(this->FMGL(logger))->x10::glb::Logger::stopLive();
            
            //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            this->FMGL(active) = false;
            
            //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10aux::nullCheck(this->FMGL(logger))->FMGL(nodesCount) =
              ::x10::glb::TaskQueue<TPMGL(Queue), TPMGL(R)>::count(::x10aux::nullCheck(this->FMGL(queue)));
        }
        
    }
    catch (::x10::lang::CheckedThrowable* __exc358) {
        if (true) {
            ::x10::lang::CheckedThrowable* v = static_cast< ::x10::lang::CheckedThrowable*>(__exc358);
            {
                
                //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::glb::Worker<void, void>::error(v);
            }
        } else
        throw;
    }
}

//#line 311 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::Worker<TPMGL(Queue), TPMGL(R)>::main(
  ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st,
  ::x10::lang::VoidFun_0_0* start) {
    {
        
        //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ::x10::lang::Runtime::ensureNotInAtomic();
        ::x10::lang::FinishState* x10____var1 = ::x10::lang::Runtime::startFinish(
                                                  ::x10::compiler::Pragma::FMGL(FINISH_DENSE__get)());
        {
            ::x10::lang::CheckedThrowable* throwable__86891 =
              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                try {
                    {
                        
                        //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        try {
                            
                            //#line 314 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            this->FMGL(empty) = false;
                            
                            //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            this->FMGL(active) = true;
                            
                            //#line 316 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            ::x10aux::nullCheck(this->FMGL(logger))->x10::glb::Logger::startLive();
                            
                            //#line 317 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            ::x10::lang::VoidFun_0_0::__apply(::x10aux::nullCheck(start));
                            
                            //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            this->x10::glb::template Worker<TPMGL(Queue), TPMGL(R)>::processStack(
                              st);
                            
                            //#line 319 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            ::x10aux::nullCheck(this->FMGL(logger))->x10::glb::Logger::stopLive();
                            
                            //#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            this->FMGL(active) = false;
                            
                            //#line 321 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            ::x10aux::nullCheck(this->FMGL(logger))->FMGL(nodesCount) =
                              ::x10::glb::TaskQueue<TPMGL(Queue), TPMGL(R)>::count(::x10aux::nullCheck(this->FMGL(queue)));
                        }
                        catch (::x10::lang::CheckedThrowable* __exc360) {
                            if (true) {
                                ::x10::lang::CheckedThrowable* v =
                                  static_cast< ::x10::lang::CheckedThrowable*>(__exc360);
                                {
                                    
                                    //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                                    ::x10::glb::Worker<void, void>::error(
                                      v);
                                }
                            } else
                            throw;
                        }
                    }
                }
                catch (::x10::lang::CheckedThrowable* __exc361) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc361);
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
            catch (::x10::lang::CheckedThrowable* __exc362) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__86892 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc362);
                    {
                        throwable__86891 = formal__86892;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__86891)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__86891))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__86891));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::stopFinish(x10____var1);
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__86891)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__86891)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__86891));
                }
                
            }
            
        }
    }
}

//#line 335 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::Worker<TPMGL(Queue), TPMGL(R)>::main(
  ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st) {
    
    //#line 336 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    try {
        
        //#line 337 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        this->FMGL(empty) = false;
        
        //#line 338 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        this->FMGL(active) = true;
        
        //#line 339 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ::x10aux::nullCheck(this->FMGL(logger))->x10::glb::Logger::startLive();
        
        //#line 340 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        this->x10::glb::template Worker<TPMGL(Queue), TPMGL(R)>::processStack(
          st);
        
        //#line 341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ::x10aux::nullCheck(this->FMGL(logger))->x10::glb::Logger::stopLive();
        
        //#line 342 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        this->FMGL(active) = false;
        
        //#line 343 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ::x10aux::nullCheck(this->FMGL(logger))->FMGL(nodesCount) =
          ::x10::glb::TaskQueue<TPMGL(Queue), TPMGL(R)>::count(::x10aux::nullCheck(this->FMGL(queue)));
    }
    catch (::x10::lang::CheckedThrowable* __exc364) {
        if (true) {
            ::x10::lang::CheckedThrowable* v = static_cast< ::x10::lang::CheckedThrowable*>(__exc364);
            {
                
                //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::glb::Worker<void, void>::error(v);
            }
        } else
        throw;
    }
}

//#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"

//#line 361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"

//#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"

//#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"

//#line 438 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
template<class TPMGL(Queue), class TPMGL(R)> ::x10::lang::VoidFun_0_1< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >*
  x10::glb::Worker<TPMGL(Queue), TPMGL(R)>::getYieldPoint(
  ) {
    
    //#line 439 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    return reinterpret_cast< ::x10::lang::VoidFun_0_1< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_1< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> > >(sizeof(x10_glb_Worker__closure__19<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__19<TPMGL(Queue),TPMGL(R)>(this)));
    
}

//#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::Worker<TPMGL(Queue), TPMGL(R)>::setContext(
  ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st) {
    
    //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    this->FMGL(context) = (__extension__ ({
        ::x10::glb::Context<TPMGL(Queue), TPMGL(R)>* alloc__79998 =
           (new (::x10aux::alloc_z< ::x10::glb::Context<TPMGL(Queue), TPMGL(R)> >()) ::x10::glb::Context<TPMGL(Queue), TPMGL(R)>());
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__86784 =
          st;
        
        //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
        alloc__79998->FMGL(st) = ::x10aux::zeroValue< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        
        //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
        alloc__79998->FMGL(st) = st__86784;
        alloc__79998;
    }))
    ;
}

//#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
template<class TPMGL(Queue), class TPMGL(R)> ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*
  x10::glb::Worker<TPMGL(Queue), TPMGL(R)>::x10__glb__Worker____this__x10__glb__Worker(
  ) {
    return this;
    
}
template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::Worker<TPMGL(Queue), TPMGL(R)>::__fieldInitializers_x10_glb_Worker(
  ) {
    this->FMGL(random) = (__extension__ ({
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ::x10::util::Random* alloc__79999 =  (new (::x10aux::alloc_z< ::x10::util::Random>()) ::x10::util::Random());
        (alloc__79999)->::x10::util::Random::_constructor(
          ((x10_long)(::x10aux::here)));
        alloc__79999;
    }))
    ;
    this->FMGL(active) = false;
    this->FMGL(empty) = true;
    this->FMGL(waiting) = false;
    this->FMGL(P) = ((x10_long)::x10aux::num_hosts);
    this->FMGL(context) = (::x10aux::class_cast_unchecked< ::x10::glb::Context<TPMGL(Queue), TPMGL(R)>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10::glb::Worker<TPMGL(Queue), TPMGL(R)>::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>::_deserializer);

template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::Worker<TPMGL(Queue), TPMGL(R)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(queue));
    buf.write(this->FMGL(lifelineThieves));
    buf.write(this->FMGL(thieves));
    buf.write(this->FMGL(lifelines));
    buf.write(this->FMGL(lifelinesActivated));
    buf.write(this->FMGL(n));
    buf.write(this->FMGL(w));
    buf.write(this->FMGL(m));
    buf.write(this->FMGL(random));
    buf.write(this->FMGL(victims));
    buf.write(this->FMGL(logger));
    buf.write(this->FMGL(P));
    buf.write(this->FMGL(context));
    
}

template<class TPMGL(Queue), class TPMGL(R)> ::x10::lang::Reference* ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>* this_ = new (::x10aux::alloc_z< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)> >()) ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::Worker<TPMGL(Queue), TPMGL(R)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(queue) = buf.read<TPMGL(Queue)>();
    FMGL(lifelineThieves) = buf.read< ::x10::glb::FixedSizeStack<x10_long>*>();
    FMGL(thieves) = buf.read< ::x10::glb::FixedSizeStack<x10_long>*>();
    FMGL(lifelines) = buf.read< ::x10::lang::Rail< x10_long >*>();
    FMGL(lifelinesActivated) = buf.read< ::x10::lang::Rail< x10_boolean >*>();
    FMGL(n) = buf.read<x10_int>();
    FMGL(w) = buf.read<x10_int>();
    FMGL(m) = buf.read<x10_int>();
    FMGL(random) = buf.read< ::x10::util::Random*>();
    FMGL(victims) = buf.read< ::x10::lang::Rail< x10_long >*>();
    FMGL(logger) = buf.read< ::x10::glb::Logger*>();
    FMGL(P) = buf.read<x10_long>();
    FMGL(context) = buf.read< ::x10::glb::Context<TPMGL(Queue), TPMGL(R)>*>();
}

template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::Worker<void, void>::broadcast(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st) {
    
    //#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    x10_long P = ((x10_long)::x10aux::num_hosts);
    {
        
        //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ::x10::lang::Runtime::ensureNotInAtomic();
        ::x10::lang::FinishState* x10____var2 = ::x10::lang::Runtime::startFinish(
                                                  ::x10::compiler::Pragma::FMGL(FINISH_DENSE__get)());
        {
            ::x10::lang::CheckedThrowable* throwable__86894 =
              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                try {
                    {
                        
                        //#line 393 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        if (((P) < (((x10_long)256ll)))) {
                            
                            //#line 394 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            {
                                x10_long i;
                                for (i = ((x10_long)0ll);
                                     ((i) < (P)); i = ((i) + (((x10_long)1ll))))
                                {
                                    
                                    //#line 395 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                                    ::x10::lang::Runtime::runAsync(
                                      (__extension__ ({
                                          ::x10::lang::Place alloc__79992 =
                                             ::x10::lang::Place::_alloc();
                                          (alloc__79992)->::x10::lang::Place::_constructor(
                                            i);
                                          alloc__79992;
                                      }))
                                      , reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__25<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__25<TPMGL(Queue),TPMGL(R)>(st))),
                                      ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                                }
                            }
                            
                        } else {
                            
                            //#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            {
                                x10_long i;
                                for (i = ((P) - (((x10_long)1ll)));
                                     ((i) >= (((x10_long)0ll)));
                                     i = ((i) - (((x10_long)32ll))))
                                {
                                    
                                    //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                                    ::x10::lang::Runtime::runAsync(
                                      (__extension__ ({
                                          ::x10::lang::Place alloc__79993 =
                                             ::x10::lang::Place::_alloc();
                                          (alloc__79993)->::x10::lang::Place::_constructor(
                                            i);
                                          alloc__79993;
                                      }))
                                      , reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__26<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__26<TPMGL(Queue),TPMGL(R)>(st))),
                                      ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                                }
                            }
                            
                        }
                        
                    }
                }
                catch (::x10::lang::CheckedThrowable* __exc373) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc373);
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
            catch (::x10::lang::CheckedThrowable* __exc374) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__86895 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc374);
                    {
                        throwable__86894 = formal__86895;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__86894)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__86894))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__86894));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::stopFinish(x10____var2);
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__86894)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__86894)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__86894));
                }
                
            }
            
        }
    }
}
template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::Worker<void, void>::initContexts(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st) {
    
    //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
    x10_long P = ((x10_long)::x10aux::num_hosts);
    {
        
        //#line 416 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ::x10::lang::Runtime::ensureNotInAtomic();
        ::x10::lang::FinishState* x10____var3 = ::x10::lang::Runtime::startFinish(
                                                  ::x10::compiler::Pragma::FMGL(FINISH_DENSE__get)());
        {
            ::x10::lang::CheckedThrowable* throwable__86897 =
              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                try {
                    {
                        
                        //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                        if (((P) < (((x10_long)256ll)))) {
                            
                            //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            {
                                x10_long i;
                                for (i = ((x10_long)0ll);
                                     ((i) < (P)); i = ((i) + (((x10_long)1ll))))
                                {
                                    
                                    //#line 419 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                                    ::x10::lang::Runtime::runAsync(
                                      (__extension__ ({
                                          ::x10::lang::Place alloc__79995 =
                                             ::x10::lang::Place::_alloc();
                                          (alloc__79995)->::x10::lang::Place::_constructor(
                                            i);
                                          alloc__79995;
                                      }))
                                      , reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__28<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__28<TPMGL(Queue),TPMGL(R)>(st))),
                                      ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                                }
                            }
                            
                        } else {
                            
                            //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                            {
                                x10_long i;
                                for (i = ((P) - (((x10_long)1ll)));
                                     ((i) >= (((x10_long)0ll)));
                                     i = ((i) - (((x10_long)32ll))))
                                {
                                    
                                    //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                                    ::x10::lang::Runtime::runAsync(
                                      (__extension__ ({
                                          ::x10::lang::Place alloc__79996 =
                                             ::x10::lang::Place::_alloc();
                                          (alloc__79996)->::x10::lang::Place::_constructor(
                                            i);
                                          alloc__79996;
                                      }))
                                      , reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Worker__closure__29<TPMGL(Queue),TPMGL(R)>)))x10_glb_Worker__closure__29<TPMGL(Queue),TPMGL(R)>(st))),
                                      ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                                }
                            }
                            
                        }
                        
                    }
                }
                catch (::x10::lang::CheckedThrowable* __exc378) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc378);
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
            catch (::x10::lang::CheckedThrowable* __exc379) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__86898 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc379);
                    {
                        throwable__86897 = formal__86898;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__86897)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__86897))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__86897));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::stopFinish(x10____var3);
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__86897)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__86897)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__86897));
                }
                
            }
            
        }
    }
}
#endif // X10_GLB_WORKER_H_IMPLEMENTATION
#endif // __X10_GLB_WORKER_H_NODEPS
