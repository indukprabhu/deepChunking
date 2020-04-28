#ifndef __X10_GLB_CONTEXT_H
#define __X10_GLB_CONTEXT_H

#include <x10rt.h>


#define X10_GLB_CONTEXTI_H_NODEPS
#include <x10/glb/ContextI.h>
#undef X10_GLB_CONTEXTI_H_NODEPS
#define X10_LANG_PLACELOCALHANDLE_H_NODEPS
#include <x10/lang/PlaceLocalHandle.h>
#undef X10_LANG_PLACELOCALHANDLE_H_NODEPS
#define X10_LANG_PLACELOCALHANDLE_H_NODEPS
#include <x10/lang/PlaceLocalHandle.h>
#undef X10_LANG_PLACELOCALHANDLE_H_NODEPS
namespace x10 { namespace glb { 
template<class TPMGL(Queue), class TPMGL(R)> class TaskQueue;
} } 
namespace x10 { namespace glb { 
template<class TPMGL(Queue), class TPMGL(R)> class Worker;
} } 
namespace x10 { namespace lang { 
class Zero;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(Z1)> class VoidFun_0_1;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace glb { 
class TaskBag;
} } 
namespace x10 { namespace glb { 
template<class TPMGL(T)> class FixedSizeStack;
} } 
namespace x10 { namespace glb { 
class Logger;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
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
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace glb { 

template<class TPMGL(Queue), class TPMGL(R)> class Context;
template <> class Context<void, void>;
template<class TPMGL(Queue), class TPMGL(R)> class Context : public ::x10::lang::X10Class
  {
    public:
    RTT_H_DECLS_CLASS
    
    static ::x10aux::itable_entry _itables[3];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static ::x10::glb::ContextI::itable< ::x10::glb::Context<TPMGL(Queue), TPMGL(R)> > _itable_0;
    
    static ::x10::lang::Any::itable< ::x10::glb::Context<TPMGL(Queue), TPMGL(R)> > _itable_1;
    
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>
      FMGL(st);
    
    void _constructor(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st);
    
    static ::x10::glb::Context<TPMGL(Queue), TPMGL(R)>* _make(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st);
    
    virtual void yield();
    virtual void yielding();
    virtual ::x10::glb::Context<TPMGL(Queue), TPMGL(R)>* x10__glb__Context____this__x10__glb__Context(
      );
    virtual void __fieldInitializers_x10_glb_Context();
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: virtual ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::RuntimeType x10::glb::Context<TPMGL(Queue), TPMGL(R)>::rtt;
template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::Context<TPMGL(Queue), TPMGL(R)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::glb::Context<void, void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::glb::ContextI>()};
    const ::x10aux::RuntimeType* params[2] = { ::x10aux::getRTT<TPMGL(Queue)>(), ::x10aux::getRTT<TPMGL(R)>()};
    ::x10aux::RuntimeType::Variance variances[2] = { ::x10aux::RuntimeType::invariant, ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.glb.Context";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 1, parents, 2, params, variances);
}

template <> class Context<void, void> : public ::x10::lang::X10Class
{
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    
};

} } 
#endif // X10_GLB_CONTEXT_H

namespace x10 { namespace glb { 
template<class TPMGL(Queue), class TPMGL(R)> class Context;
} } 

#ifndef X10_GLB_CONTEXT_H_NODEPS
#define X10_GLB_CONTEXT_H_NODEPS
#include <x10/glb/ContextI.h>
#include <x10/lang/PlaceLocalHandle.h>
#include <x10/glb/TaskQueue.h>
#include <x10/glb/Worker.h>
#include <x10/lang/Zero.h>
#include <x10/lang/VoidFun_0_1.h>
#include <x10/lang/Runtime.h>
#include <x10/glb/TaskBag.h>
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/glb/FixedSizeStack.h>
#include <x10/glb/Logger.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Place.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/lang/Error.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/Exception.h>
#include <x10/compiler/AsyncClosure.h>
#include <x10/compiler/Inline.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_GLB_CONTEXT_H_GENERICS
#define X10_GLB_CONTEXT_H_GENERICS
#endif // X10_GLB_CONTEXT_H_GENERICS
#ifndef X10_GLB_CONTEXT_H_IMPLEMENTATION
#define X10_GLB_CONTEXT_H_IMPLEMENTATION
#include <x10/glb/Context.h>

#ifndef X10_GLB_CONTEXT__CLOSURE__2_CLOSURE
#define X10_GLB_CONTEXT__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Context__closure__2 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Context__closure__2<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(st__80072->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->x10::glb::template Worker<TPMGL(Queue), TPMGL(R)>::deal(
          st__80072, loot__80073, victim__80063);
        ::x10aux::nullCheck(st__80072->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->FMGL(waiting) =
          false;
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__80072;
    ::x10::glb::TaskBag* loot__80073;
    x10_long victim__80063;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st__80072);
        buf.write(this->loot__80073);
        buf.write(this->victim__80063);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Context__closure__2<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Context__closure__2<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st__80072 = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        ::x10::glb::TaskBag* that_loot__80073 = buf.read< ::x10::glb::TaskBag*>();
        x10_long that_victim__80063 = buf.read<x10_long>();
        x10_glb_Context__closure__2<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Context__closure__2<TPMGL(Queue),TPMGL(R) >(that_st__80072, that_loot__80073, that_victim__80063);
        return this_;
    }
    
    x10_glb_Context__closure__2(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__80072, ::x10::glb::TaskBag* loot__80073, x10_long victim__80063) : st__80072(st__80072), loot__80073(loot__80073), victim__80063(victim__80063) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:155";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Context__closure__2<TPMGL(Queue),TPMGL(R) > >x10_glb_Context__closure__2<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Context__closure__2<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Context__closure__2<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Context__closure__2<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Context__closure__2<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Context__closure__2<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Context__closure__2<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_CONTEXT__CLOSURE__2_CLOSURE
#ifndef X10_GLB_CONTEXT__CLOSURE__3_CLOSURE
#define X10_GLB_CONTEXT__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Context__closure__3 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Context__closure__3<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(st__80072->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->x10::glb::template Worker<TPMGL(Queue), TPMGL(R)>::deal(
          st__80072, loot__80073, ((x10_long)-1ll));
        ::x10aux::nullCheck(st__80072->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->FMGL(waiting) =
          false;
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__80072;
    ::x10::glb::TaskBag* loot__80073;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st__80072);
        buf.write(this->loot__80073);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Context__closure__3<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Context__closure__3<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st__80072 = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        ::x10::glb::TaskBag* that_loot__80073 = buf.read< ::x10::glb::TaskBag*>();
        x10_glb_Context__closure__3<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Context__closure__3<TPMGL(Queue),TPMGL(R) >(that_st__80072, that_loot__80073);
        return this_;
    }
    
    x10_glb_Context__closure__3(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__80072, ::x10::glb::TaskBag* loot__80073) : st__80072(st__80072), loot__80073(loot__80073) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:158";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Context__closure__3<TPMGL(Queue),TPMGL(R) > >x10_glb_Context__closure__3<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Context__closure__3<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Context__closure__3<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Context__closure__3<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Context__closure__3<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Context__closure__3<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Context__closure__3<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_CONTEXT__CLOSURE__3_CLOSURE
#ifndef X10_GLB_CONTEXT__CLOSURE__4_CLOSURE
#define X10_GLB_CONTEXT__CLOSURE__4_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Context__closure__4 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Context__closure__4<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            ::x10aux::nullCheck(st__80072->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->x10::glb::template Worker<TPMGL(Queue), TPMGL(R)>::deal(
              st__80072, loot__80073, victim__80063);
        }
        catch (::x10::lang::CheckedThrowable* __exc294) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc294)) {
                ::x10::lang::Error* __lowerer__var__0__ = static_cast< ::x10::lang::Error*>(__exc294);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc294);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__80072;
    ::x10::glb::TaskBag* loot__80073;
    x10_long victim__80063;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st__80072);
        buf.write(this->loot__80073);
        buf.write(this->victim__80063);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Context__closure__4<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Context__closure__4<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st__80072 = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        ::x10::glb::TaskBag* that_loot__80073 = buf.read< ::x10::glb::TaskBag*>();
        x10_long that_victim__80063 = buf.read<x10_long>();
        x10_glb_Context__closure__4<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Context__closure__4<TPMGL(Queue),TPMGL(R) >(that_st__80072, that_loot__80073, that_victim__80063);
        return this_;
    }
    
    x10_glb_Context__closure__4(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__80072, ::x10::glb::TaskBag* loot__80073, x10_long victim__80063) : st__80072(st__80072), loot__80073(loot__80073), victim__80063(victim__80063) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:163";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Context__closure__4<TPMGL(Queue),TPMGL(R) > >x10_glb_Context__closure__4<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Context__closure__4<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Context__closure__4<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Context__closure__4<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Context__closure__4<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Context__closure__4<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Context__closure__4<TPMGL(Queue),TPMGL(R) >::_deserialize);
template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Context__closure__4<TPMGL(Queue),TPMGL(R) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_glb_Context__closure__4<TPMGL(Queue),TPMGL(R) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_GLB_CONTEXT__CLOSURE__4_CLOSURE
#ifndef X10_GLB_CONTEXT__CLOSURE__5_CLOSURE
#define X10_GLB_CONTEXT__CLOSURE__5_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Context__closure__5 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Context__closure__5<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(st__80085->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->FMGL(waiting) =
          false;
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__80085;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st__80085);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Context__closure__5<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Context__closure__5<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st__80085 = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        x10_glb_Context__closure__5<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Context__closure__5<TPMGL(Queue),TPMGL(R) >(that_st__80085);
        return this_;
    }
    
    x10_glb_Context__closure__5(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__80085) : st__80085(st__80085) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:189";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Context__closure__5<TPMGL(Queue),TPMGL(R) > >x10_glb_Context__closure__5<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Context__closure__5<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Context__closure__5<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Context__closure__5<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Context__closure__5<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Context__closure__5<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Context__closure__5<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_CONTEXT__CLOSURE__5_CLOSURE
#ifndef X10_GLB_CONTEXT__CLOSURE__6_CLOSURE
#define X10_GLB_CONTEXT__CLOSURE__6_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Context__closure__6 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Context__closure__6<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(st__80085->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply())->FMGL(waiting) =
          false;
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__80085;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->st__80085);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Context__closure__6<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Context__closure__6<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> that_st__80085 = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
        x10_glb_Context__closure__6<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Context__closure__6<TPMGL(Queue),TPMGL(R) >(that_st__80085);
        return this_;
    }
    
    x10_glb_Context__closure__6(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__80085) : st__80085(st__80085) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:191";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_0::template itable <x10_glb_Context__closure__6<TPMGL(Queue),TPMGL(R) > >x10_glb_Context__closure__6<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Context__closure__6<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Context__closure__6<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Context__closure__6<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_glb_Context__closure__6<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Context__closure__6<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Context__closure__6<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_CONTEXT__CLOSURE__6_CLOSURE
#ifndef X10_GLB_CONTEXT__CLOSURE__1_CLOSURE
#define X10_GLB_CONTEXT__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_1.h>
template<class TPMGL(Queue), class TPMGL(R)> class x10_glb_Context__closure__1 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_1< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >::template itable <x10_glb_Context__closure__1<TPMGL(Queue),TPMGL(R) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply(::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__80000) {
        
        //#line 439 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ::x10::lang::Runtime::probe();
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__80084 =
          st__80000;
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ::x10::glb::TaskBag* loot__80074;
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        while (((((((__extension__ ({
                     ::x10::glb::FixedSizeStack<x10_long>* this__80075 =
                       ::x10aux::nullCheck(this__80001)->FMGL(thieves);
                     ::x10aux::nullCheck(this__80075)->FMGL(size);
                 }))
                 ) > (((x10_long)0ll))) || (((__extension__ ({
                     ::x10::glb::FixedSizeStack<x10_long>* this__80076 =
                       ::x10aux::nullCheck(this__80001)->FMGL(lifelineThieves);
                     ::x10aux::nullCheck(this__80076)->FMGL(size);
                 }))
                 ) > (((x10_long)0ll))))) && (!::x10aux::struct_equals((loot__80074 =
                                                                          ::x10::glb::TaskQueue<TPMGL(Queue), TPMGL(R)>::split(::x10aux::nullCheck(::x10aux::nullCheck(this__80001)->FMGL(queue)))),
                                                                       reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))))
        {
            
            //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__80072 =
              st__80084;
            ::x10::glb::TaskBag* loot__80073 = loot__80074;
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x10_long victim__80063 = ((x10_long)::x10aux::here);
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            ::x10::glb::Logger* obj__80062 = ::x10aux::nullCheck(this__80001)->FMGL(logger);
            ::x10aux::nullCheck(obj__80062)->FMGL(nodesGiven) =
              ((::x10aux::nullCheck(obj__80062)->FMGL(nodesGiven)) + (::x10::glb::TaskBag::size(::x10aux::nullCheck(loot__80073))));
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if ((((__extension__ ({
                    ::x10::glb::FixedSizeStack<x10_long>* this__80064 =
                      ::x10aux::nullCheck(this__80001)->FMGL(thieves);
                    ::x10aux::nullCheck(this__80064)->FMGL(size);
                }))
                ) > (((x10_long)0ll)))) {
                
                //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                x10_long thief__80065 = (__extension__ ({
                    ::x10::glb::FixedSizeStack<x10_long>* this__80066 =
                      ::x10aux::nullCheck(this__80001)->FMGL(thieves);
                    ::x10aux::nullCheck(::x10aux::nullCheck(this__80066)->FMGL(data))->x10::lang::template Rail< x10_long >::__apply(
                      ::x10aux::nullCheck(this__80066)->FMGL(size) =
                        ((::x10aux::nullCheck(this__80066)->FMGL(size)) - (((x10_long)1ll))));
                }))
                ;
                
                //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                if (((thief__80065) >= (((x10_long)0ll))))
                {
                    
                    //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    ::x10::glb::Logger* obj__80059 = ::x10aux::nullCheck(this__80001)->FMGL(logger);
                    ::x10aux::nullCheck(obj__80059)->FMGL(lifelineStealsSuffered) =
                      ((::x10aux::nullCheck(obj__80059)->FMGL(lifelineStealsSuffered)) + (((x10_long)1ll)));
                    
                    //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    ::x10::lang::Runtime::runUncountedAsync(
                      (__extension__ ({
                          ::x10::lang::Place alloc__80067 =
                             ::x10::lang::Place::_alloc();
                          (alloc__80067)->::x10::lang::Place::_constructor(
                            thief__80065);
                          alloc__80067;
                      }))
                      , reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Context__closure__2<TPMGL(Queue),TPMGL(R)>)))x10_glb_Context__closure__2<TPMGL(Queue),TPMGL(R)>(st__80072, loot__80073, victim__80063))),
                      ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                } else {
                    
                    //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    ::x10::glb::Logger* obj__80060 = ::x10aux::nullCheck(this__80001)->FMGL(logger);
                    ::x10aux::nullCheck(obj__80060)->FMGL(stealsSuffered) =
                      ((::x10aux::nullCheck(obj__80060)->FMGL(stealsSuffered)) + (((x10_long)1ll)));
                    
                    //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                    ::x10::lang::Runtime::runUncountedAsync(
                      (__extension__ ({
                          ::x10::lang::Place alloc__80068 =
                             ::x10::lang::Place::_alloc();
                          (alloc__80068)->::x10::lang::Place::_constructor(
                            (((-(thief__80065))) - (((x10_long)1ll))));
                          alloc__80068;
                      }))
                      , reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Context__closure__3<TPMGL(Queue),TPMGL(R)>)))x10_glb_Context__closure__3<TPMGL(Queue),TPMGL(R)>(st__80072, loot__80073))),
                      ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                }
                
            } else {
                
                //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::glb::Logger* obj__80061 = ::x10aux::nullCheck(this__80001)->FMGL(logger);
                ::x10aux::nullCheck(obj__80061)->FMGL(lifelineStealsSuffered) =
                  ((::x10aux::nullCheck(obj__80061)->FMGL(lifelineStealsSuffered)) + (((x10_long)1ll)));
                
                //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                x10_long thief__80069 = (__extension__ ({
                    ::x10::glb::FixedSizeStack<x10_long>* this__80070 =
                      ::x10aux::nullCheck(this__80001)->FMGL(lifelineThieves);
                    ::x10aux::nullCheck(::x10aux::nullCheck(this__80070)->FMGL(data))->x10::lang::template Rail< x10_long >::__apply(
                      ::x10aux::nullCheck(this__80070)->FMGL(size) =
                        ((::x10aux::nullCheck(this__80070)->FMGL(size)) - (((x10_long)1ll))));
                }))
                ;
                
                //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::lang::Runtime::runAsync((__extension__ ({
                                                   ::x10::lang::Place alloc__80071 =
                                                      ::x10::lang::Place::_alloc();
                                                   (alloc__80071)->::x10::lang::Place::_constructor(
                                                     thief__80069);
                                                   alloc__80071;
                                               }))
                                               , reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Context__closure__4<TPMGL(Queue),TPMGL(R)>)))x10_glb_Context__closure__4<TPMGL(Queue),TPMGL(R)>(st__80072, loot__80073, victim__80063))),
                                               ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            }
            
        }
        
        //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st__80085 =
          st__80000;
        
        //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
        while ((((__extension__ ({
                   ::x10::glb::FixedSizeStack<x10_long>* this__80079 =
                     ::x10aux::nullCheck(this__80001)->FMGL(thieves);
                   ::x10aux::nullCheck(this__80079)->FMGL(size);
               }))
               ) > (((x10_long)0ll)))) {
            
            //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            x10_long thief__80080 = (__extension__ ({
                ::x10::glb::FixedSizeStack<x10_long>* this__80081 =
                  ::x10aux::nullCheck(this__80001)->FMGL(thieves);
                ::x10aux::nullCheck(::x10aux::nullCheck(this__80081)->FMGL(data))->x10::lang::template Rail< x10_long >::__apply(
                  ::x10aux::nullCheck(this__80081)->FMGL(size) =
                    ((::x10aux::nullCheck(this__80081)->FMGL(size)) - (((x10_long)1ll))));
            }))
            ;
            
            //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
            if (((thief__80080) >= (((x10_long)0ll)))) {
                
                //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::glb::FixedSizeStack<x10_long>* this__80077 =
                  ::x10aux::nullCheck(this__80001)->FMGL(lifelineThieves);
                
                //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/FixedSizeStack.x10"
                x10_long t__80078 = thief__80080;
                ::x10aux::nullCheck(::x10aux::nullCheck(this__80077)->FMGL(data))->x10::lang::template Rail< x10_long >::__set(
                  ((::x10aux::nullCheck(this__80077)->FMGL(size) =
                    ((::x10aux::nullCheck(this__80077)->FMGL(size)) + (((x10_long)1ll)))) - (((x10_long)1ll))),
                  t__80078);
                
                //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::lang::Runtime::runUncountedAsync((__extension__ ({
                                                            ::x10::lang::Place alloc__80082 =
                                                              
                                                            ::x10::lang::Place::_alloc();
                                                            (alloc__80082)->::x10::lang::Place::_constructor(
                                                              thief__80080);
                                                            alloc__80082;
                                                        }))
                                                        ,
                                                        reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Context__closure__5<TPMGL(Queue),TPMGL(R)>)))x10_glb_Context__closure__5<TPMGL(Queue),TPMGL(R)>(st__80085))),
                                                        ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            } else {
                
                //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10"
                ::x10::lang::Runtime::runUncountedAsync((__extension__ ({
                                                            ::x10::lang::Place alloc__80083 =
                                                              
                                                            ::x10::lang::Place::_alloc();
                                                            (alloc__80083)->::x10::lang::Place::_constructor(
                                                              (((-(thief__80080))) - (((x10_long)1ll))));
                                                            alloc__80083;
                                                        }))
                                                        ,
                                                        reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_glb_Context__closure__6<TPMGL(Queue),TPMGL(R)>)))x10_glb_Context__closure__6<TPMGL(Queue),TPMGL(R)>(st__80085))),
                                                        ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            }
            
        }
        
    }
    
    // captured environment
    ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>* this__80001;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->this__80001);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_glb_Context__closure__1<TPMGL(Queue),TPMGL(R) >* storage = ::x10aux::alloc_z<x10_glb_Context__closure__1<TPMGL(Queue),TPMGL(R) > >();
        buf.record_reference(storage);
        ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>* that_this__80001 = buf.read< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>();
        x10_glb_Context__closure__1<TPMGL(Queue),TPMGL(R) >* this_ = new (storage) x10_glb_Context__closure__1<TPMGL(Queue),TPMGL(R) >(that_this__80001);
        return this_;
    }
    
    x10_glb_Context__closure__1(::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>* this__80001) : this__80001(this__80001) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_1< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> > >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_1< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> > >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Worker.x10:439";
    }

};

template<class TPMGL(Queue), class TPMGL(R)> typename ::x10::lang::VoidFun_0_1< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >::template itable <x10_glb_Context__closure__1<TPMGL(Queue),TPMGL(R) > >x10_glb_Context__closure__1<TPMGL(Queue),TPMGL(R) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_glb_Context__closure__1<TPMGL(Queue),TPMGL(R) >::__apply, &x10_glb_Context__closure__1<TPMGL(Queue),TPMGL(R) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10_glb_Context__closure__1<TPMGL(Queue),TPMGL(R) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_1< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> > >, &x10_glb_Context__closure__1<TPMGL(Queue),TPMGL(R) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10_glb_Context__closure__1<TPMGL(Queue),TPMGL(R) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_glb_Context__closure__1<TPMGL(Queue),TPMGL(R) >::_deserialize);

#endif // X10_GLB_CONTEXT__CLOSURE__1_CLOSURE
template<class TPMGL(Queue), class TPMGL(R)> ::x10::glb::ContextI::itable< ::x10::glb::Context<TPMGL(Queue), TPMGL(R)> >  x10::glb::Context<TPMGL(Queue), TPMGL(R)>::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName, &x10::glb::Context<TPMGL(Queue), TPMGL(R)>::yielding);
template<class TPMGL(Queue), class TPMGL(R)> ::x10::lang::Any::itable< ::x10::glb::Context<TPMGL(Queue), TPMGL(R)> >  x10::glb::Context<TPMGL(Queue), TPMGL(R)>::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(Queue), class TPMGL(R)> ::x10aux::itable_entry x10::glb::Context<TPMGL(Queue), TPMGL(R)>::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::glb::ContextI>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::glb::Context<TPMGL(Queue), TPMGL(R)>")};

//#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
/**
	 * PlaceLocalHandle of {@link Worker}
	 */

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::Context<TPMGL(Queue), TPMGL(R)>::_constructor(
                                               ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st) {
    
    //#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
    ::x10::glb::Context<TPMGL(Queue), TPMGL(R)>* this__80058 = this;
    ::x10aux::nullCheck(this__80058)->FMGL(st) = ::x10aux::zeroValue< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
    this->FMGL(st) = st;
}
template<class TPMGL(Queue), class TPMGL(R)> ::x10::glb::Context<TPMGL(Queue), TPMGL(R)>* x10::glb::Context<TPMGL(Queue), TPMGL(R)>::_make(
                                               ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> st)
{
    ::x10::glb::Context<TPMGL(Queue), TPMGL(R)>* this_ = new (::x10aux::alloc_z< ::x10::glb::Context<TPMGL(Queue), TPMGL(R)> >()) ::x10::glb::Context<TPMGL(Queue), TPMGL(R)>();
    this_->_constructor(st);
    return this_;
}



//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::Context<TPMGL(Queue), TPMGL(R)>::yield(
  ) {
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
    ::x10::lang::VoidFun_0_1< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >::__apply(::x10aux::nullCheck((__extension__ ({
        ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>* this__80001 =
          this->FMGL(st)->x10::lang::template PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*>::__apply();
        reinterpret_cast< ::x10::lang::VoidFun_0_1< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_1< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> > >(sizeof(x10_glb_Context__closure__1<TPMGL(Queue),TPMGL(R)>)))x10_glb_Context__closure__1<TPMGL(Queue),TPMGL(R)>(this__80001)));
    }))
    ), this->FMGL(st));
}

//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::Context<TPMGL(Queue), TPMGL(R)>::yielding(
  ) {
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
    this->yield();
}

//#line 9 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/glb/Context.x10"
template<class TPMGL(Queue), class TPMGL(R)> ::x10::glb::Context<TPMGL(Queue), TPMGL(R)>*
  x10::glb::Context<TPMGL(Queue), TPMGL(R)>::x10__glb__Context____this__x10__glb__Context(
  ) {
    return this;
    
}
template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::Context<TPMGL(Queue), TPMGL(R)>::__fieldInitializers_x10_glb_Context(
  ) {
    this->FMGL(st) = ::x10aux::zeroValue< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
}
template<class TPMGL(Queue), class TPMGL(R)> const ::x10aux::serialization_id_t x10::glb::Context<TPMGL(Queue), TPMGL(R)>::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::glb::Context<TPMGL(Queue), TPMGL(R)>::_deserializer);

template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::Context<TPMGL(Queue), TPMGL(R)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(st));
    
}

template<class TPMGL(Queue), class TPMGL(R)> ::x10::lang::Reference* ::x10::glb::Context<TPMGL(Queue), TPMGL(R)>::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::glb::Context<TPMGL(Queue), TPMGL(R)>* this_ = new (::x10aux::alloc_z< ::x10::glb::Context<TPMGL(Queue), TPMGL(R)> >()) ::x10::glb::Context<TPMGL(Queue), TPMGL(R)>();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

template<class TPMGL(Queue), class TPMGL(R)> void x10::glb::Context<TPMGL(Queue), TPMGL(R)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(st) = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::glb::Worker<TPMGL(Queue), TPMGL(R)>*> >();
}

#endif // X10_GLB_CONTEXT_H_IMPLEMENTATION
#endif // __X10_GLB_CONTEXT_H_NODEPS
