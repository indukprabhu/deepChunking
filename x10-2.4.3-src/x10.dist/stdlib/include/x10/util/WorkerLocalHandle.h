#ifndef __X10_UTIL_WORKERLOCALHANDLE_H
#define __X10_UTIL_WORKERLOCALHANDLE_H

#include <x10rt.h>


#define X10_LANG_FUN_0_0_H_NODEPS
#include <x10/lang/Fun_0_0.h>
#undef X10_LANG_FUN_0_0_H_NODEPS
#define X10_LANG_VOIDFUN_0_1_H_NODEPS
#include <x10/lang/VoidFun_0_1.h>
#undef X10_LANG_VOIDFUN_0_1_H_NODEPS
#define X10_LANG_PLACELOCALHANDLE_H_NODEPS
#include <x10/lang/PlaceLocalHandle.h>
#undef X10_LANG_PLACELOCALHANDLE_H_NODEPS
#define X10_LANG_PLACELOCALHANDLE_H_NODEPS
#include <x10/lang/PlaceLocalHandle.h>
#undef X10_LANG_PLACELOCALHANDLE_H_NODEPS
namespace x10 { namespace util { 
template<class TPMGL(U)> class WorkerLocalHandle__State;
} } 
namespace x10 { namespace lang { 
class PlaceGroup;
} } 
namespace x10 { namespace lang { 
class PlaceGroup__SimplePlaceGroup;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace lang { 
class Runtime__Worker;
} } 
namespace x10 { namespace lang { 
class Thread;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace lang { 
class FinishState;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace lang { 
class VoidFun_0_0;
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
template<class TPMGL(Z1), class TPMGL(Z2), class TPMGL(U)> class Fun_0_2;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace util { 

template<class TPMGL(T)> class WorkerLocalHandle;
template <> class WorkerLocalHandle<void>;
template<class TPMGL(T)> class WorkerLocalHandle : public ::x10::lang::X10Class
  {
    public:
    RTT_H_DECLS_CLASS
    
    static ::x10aux::itable_entry _itables[4];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static typename ::x10::lang::Fun_0_0<TPMGL(T)>::template itable< ::x10::util::WorkerLocalHandle<TPMGL(T)> > _itable_0;
    
    static ::x10::lang::Any::itable< ::x10::util::WorkerLocalHandle<TPMGL(T)> > _itable_1;
    
    static typename ::x10::lang::VoidFun_0_1<TPMGL(T)>::template itable< ::x10::util::WorkerLocalHandle<TPMGL(T)> > _itable_2;
    
    ::x10::lang::PlaceLocalHandle< ::x10::util::WorkerLocalHandle__State<TPMGL(T)>*>
      FMGL(state);
    
    void _constructor();
    
    static ::x10::util::WorkerLocalHandle<TPMGL(T)>* _make();
    
    void _constructor(::x10::lang::Fun_0_0<TPMGL(T)>* init);
    
    static ::x10::util::WorkerLocalHandle<TPMGL(T)>* _make(::x10::lang::Fun_0_0<TPMGL(T)>* init);
    
    virtual TPMGL(T) __apply();
    virtual void __apply(TPMGL(T) t);
    virtual void initLocal(::x10::lang::Fun_0_0<TPMGL(T)>* init);
    virtual void applyLocal(::x10::lang::VoidFun_0_1<TPMGL(T)>* op);
    virtual TPMGL(T) reduceLocal(::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), TPMGL(T)>* op);
    virtual TPMGL(T) reduceLocal(TPMGL(T) result, ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), TPMGL(T)>* op);
    virtual ::x10::util::WorkerLocalHandle<TPMGL(T)>* x10__util__WorkerLocalHandle____this__x10__util__WorkerLocalHandle(
      );
    virtual void __fieldInitializers_x10_util_WorkerLocalHandle(
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

template<class TPMGL(T)> ::x10aux::RuntimeType x10::util::WorkerLocalHandle<TPMGL(T)>::rtt;
template<class TPMGL(T)> void x10::util::WorkerLocalHandle<TPMGL(T)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::util::WorkerLocalHandle<void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::Fun_0_0<TPMGL(T)> >(), ::x10aux::getRTT< ::x10::lang::VoidFun_0_1<TPMGL(T)> >()};
    const ::x10aux::RuntimeType* params[1] = { ::x10aux::getRTT<TPMGL(T)>()};
    ::x10aux::RuntimeType::Variance variances[1] = { ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.util.WorkerLocalHandle";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 2, parents, 1, params, variances);
}

template <> class WorkerLocalHandle<void> : public ::x10::lang::X10Class
{
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    
};

} } 
#endif // X10_UTIL_WORKERLOCALHANDLE_H

namespace x10 { namespace util { 
template<class TPMGL(T)> class WorkerLocalHandle;
} } 

#ifndef X10_UTIL_WORKERLOCALHANDLE_H_NODEPS
#define X10_UTIL_WORKERLOCALHANDLE_H_NODEPS
#include <x10/lang/Fun_0_0.h>
#include <x10/lang/VoidFun_0_1.h>
#include <x10/lang/PlaceLocalHandle.h>
#include <x10/util/WorkerLocalHandle__State.h>
#include <x10/lang/PlaceGroup.h>
#include <x10/lang/PlaceGroup__SimplePlaceGroup.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Long.h>
#include <x10/lang/Runtime__Worker.h>
#include <x10/lang/Int.h>
#include <x10/lang/Thread.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/FinishState.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Error.h>
#include <x10/lang/Exception.h>
#include <x10/compiler/AsyncClosure.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/lang/Fun_0_2.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_UTIL_WORKERLOCALHANDLE_H_GENERICS
#define X10_UTIL_WORKERLOCALHANDLE_H_GENERICS
#endif // X10_UTIL_WORKERLOCALHANDLE_H_GENERICS
#ifndef X10_UTIL_WORKERLOCALHANDLE_H_IMPLEMENTATION
#define X10_UTIL_WORKERLOCALHANDLE_H_IMPLEMENTATION
#include <x10/util/WorkerLocalHandle.h>

#ifndef X10_UTIL_WORKERLOCALHANDLE__CLOSURE__1_CLOSURE
#define X10_UTIL_WORKERLOCALHANDLE__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T)> class x10_util_WorkerLocalHandle__closure__1 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::util::WorkerLocalHandle__State<TPMGL(T)>*>::template itable <x10_util_WorkerLocalHandle__closure__1<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::util::WorkerLocalHandle__State<TPMGL(T)>* __apply() {
        ::x10::util::WorkerLocalHandle__State<TPMGL(T)>* alloc__123083 = 
        (new (::x10aux::alloc_z< ::x10::util::WorkerLocalHandle__State<TPMGL(T)> >()) ::x10::util::WorkerLocalHandle__State<TPMGL(T)>());
        (alloc__123083)->::x10::util::WorkerLocalHandle__State<TPMGL(T)>::_constructor(
          init);
        return alloc__123083;
        
    }
    
    // captured environment
    ::x10::lang::Fun_0_0<TPMGL(T)>* init;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->init);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_WorkerLocalHandle__closure__1<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_util_WorkerLocalHandle__closure__1<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::Fun_0_0<TPMGL(T)>* that_init = buf.read< ::x10::lang::Fun_0_0<TPMGL(T)>*>();
        x10_util_WorkerLocalHandle__closure__1<TPMGL(T) >* this_ = new (storage) x10_util_WorkerLocalHandle__closure__1<TPMGL(T) >(that_init);
        return this_;
    }
    
    x10_util_WorkerLocalHandle__closure__1(::x10::lang::Fun_0_0<TPMGL(T)>* init) : init(init) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::util::WorkerLocalHandle__State<TPMGL(T)>*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::util::WorkerLocalHandle__State<TPMGL(T)>*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10:35";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_0< ::x10::util::WorkerLocalHandle__State<TPMGL(T)>*>::template itable <x10_util_WorkerLocalHandle__closure__1<TPMGL(T) > >x10_util_WorkerLocalHandle__closure__1<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_WorkerLocalHandle__closure__1<TPMGL(T) >::__apply, &x10_util_WorkerLocalHandle__closure__1<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_util_WorkerLocalHandle__closure__1<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::util::WorkerLocalHandle__State<TPMGL(T)>*> >, &x10_util_WorkerLocalHandle__closure__1<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_WorkerLocalHandle__closure__1<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_WorkerLocalHandle__closure__1<TPMGL(T) >::_deserialize);

#endif // X10_UTIL_WORKERLOCALHANDLE__CLOSURE__1_CLOSURE
#ifndef X10_UTIL_WORKERLOCALHANDLE__CLOSURE__2_CLOSURE
#define X10_UTIL_WORKERLOCALHANDLE__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_util_WorkerLocalHandle__closure__2 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_util_WorkerLocalHandle__closure__2<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            ::x10::lang::VoidFun_0_1<TPMGL(T)>::__apply(::x10aux::nullCheck(op), 
              t__123084);
        }
        catch (::x10::lang::CheckedThrowable* __exc3205) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc3205)) {
                ::x10::lang::Error* __lowerer__var__0__ = static_cast< ::x10::lang::Error*>(__exc3205);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc3205);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::VoidFun_0_1<TPMGL(T)>* op;
    TPMGL(T) t__123084;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->op);
        buf.write(this->t__123084);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_WorkerLocalHandle__closure__2<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_util_WorkerLocalHandle__closure__2<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::VoidFun_0_1<TPMGL(T)>* that_op = buf.read< ::x10::lang::VoidFun_0_1<TPMGL(T)>*>();
        TPMGL(T) that_t__123084 = buf.read<TPMGL(T)>();
        x10_util_WorkerLocalHandle__closure__2<TPMGL(T) >* this_ = new (storage) x10_util_WorkerLocalHandle__closure__2<TPMGL(T) >(that_op, that_t__123084);
        return this_;
    }
    
    x10_util_WorkerLocalHandle__closure__2(::x10::lang::VoidFun_0_1<TPMGL(T)>* op, TPMGL(T) t__123084) : op(op), t__123084(t__123084) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10:72";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_util_WorkerLocalHandle__closure__2<TPMGL(T) > >x10_util_WorkerLocalHandle__closure__2<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_WorkerLocalHandle__closure__2<TPMGL(T) >::__apply, &x10_util_WorkerLocalHandle__closure__2<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_util_WorkerLocalHandle__closure__2<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_util_WorkerLocalHandle__closure__2<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_WorkerLocalHandle__closure__2<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_WorkerLocalHandle__closure__2<TPMGL(T) >::_deserialize);
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_WorkerLocalHandle__closure__2<TPMGL(T) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_util_WorkerLocalHandle__closure__2<TPMGL(T) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_UTIL_WORKERLOCALHANDLE__CLOSURE__2_CLOSURE
template<class TPMGL(T)> typename ::x10::lang::Fun_0_0<TPMGL(T)>::template itable< ::x10::util::WorkerLocalHandle<TPMGL(T)> >  x10::util::WorkerLocalHandle<TPMGL(T)>::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::util::WorkerLocalHandle<TPMGL(T)>::__apply, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10::lang::Any::itable< ::x10::util::WorkerLocalHandle<TPMGL(T)> >  x10::util::WorkerLocalHandle<TPMGL(T)>::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_1<TPMGL(T)>::template itable< ::x10::util::WorkerLocalHandle<TPMGL(T)> >  x10::util::WorkerLocalHandle<TPMGL(T)>::_itable_2(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::util::WorkerLocalHandle<TPMGL(T)>::__apply, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10::util::WorkerLocalHandle<TPMGL(T)>::_itables[4] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0<TPMGL(T)> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_1<TPMGL(T)> >, &_itable_2), ::x10aux::itable_entry(NULL, (void*)"::x10::util::WorkerLocalHandle<TPMGL(T)>")};

//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"

//#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
template<class TPMGL(T)> void x10::util::WorkerLocalHandle<TPMGL(T)>::_constructor(
                           ) {
    (this)->::x10::util::WorkerLocalHandle<TPMGL(T)>::_constructor(
      ::x10aux::class_cast_unchecked< ::x10::lang::Fun_0_0<TPMGL(T)>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
}
template<class TPMGL(T)> ::x10::util::WorkerLocalHandle<TPMGL(T)>* x10::util::WorkerLocalHandle<TPMGL(T)>::_make(
                           ) {
    ::x10::util::WorkerLocalHandle<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::util::WorkerLocalHandle<TPMGL(T)> >()) ::x10::util::WorkerLocalHandle<TPMGL(T)>();
    this_->_constructor();
    return this_;
}



//#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
template<class TPMGL(T)> void x10::util::WorkerLocalHandle<TPMGL(T)>::_constructor(
                           ::x10::lang::Fun_0_0<TPMGL(T)>* init) {
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    ::x10::util::WorkerLocalHandle<TPMGL(T)>* this__123082 =
      this;
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    ::x10::lang::PlaceLocalHandle< ::x10::util::WorkerLocalHandle__State<TPMGL(T)>*> state =
      ::x10::lang::PlaceLocalHandle<void>::template make< ::x10::util::WorkerLocalHandle__State<TPMGL(T)>* >(
        reinterpret_cast< ::x10::lang::PlaceGroup*>(::x10::lang::PlaceGroup::FMGL(WORLD__get)()),
        reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::util::WorkerLocalHandle__State<TPMGL(T)>*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::util::WorkerLocalHandle__State<TPMGL(T)>*> >(sizeof(x10_util_WorkerLocalHandle__closure__1<TPMGL(T)>)))x10_util_WorkerLocalHandle__closure__1<TPMGL(T)>(init))));
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    this->FMGL(state) = state;
}
template<class TPMGL(T)> ::x10::util::WorkerLocalHandle<TPMGL(T)>* x10::util::WorkerLocalHandle<TPMGL(T)>::_make(
                           ::x10::lang::Fun_0_0<TPMGL(T)>* init)
{
    ::x10::util::WorkerLocalHandle<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::util::WorkerLocalHandle<TPMGL(T)> >()) ::x10::util::WorkerLocalHandle<TPMGL(T)>();
    this_->_constructor(init);
    return this_;
}



//#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
template<class TPMGL(T)> TPMGL(T) x10::util::WorkerLocalHandle<TPMGL(T)>::__apply(
  ) {
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    ::x10::util::WorkerLocalHandle__State<TPMGL(T)>* localState =
      this->FMGL(state)->x10::lang::template PlaceLocalHandle< ::x10::util::WorkerLocalHandle__State<TPMGL(T)>*>::__apply();
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    TPMGL(T) t = ::x10aux::nullCheck(::x10aux::nullCheck(localState)->FMGL(store))->x10::lang::template Rail< TPMGL(T) >::__apply(
                   ((x10_long)(::x10aux::nullCheck((::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread())))->FMGL(workerId))));
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    if ((::x10aux::struct_equals(t, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        t = ::x10::lang::Fun_0_0<TPMGL(T)>::__apply(::x10aux::nullCheck(::x10aux::nullCheck(localState)->FMGL(init)));
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        ::x10aux::nullCheck(::x10aux::nullCheck(localState)->FMGL(store))->x10::lang::template Rail< TPMGL(T) >::__set(
          ((x10_long)(::x10aux::nullCheck((::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread())))->FMGL(workerId))),
          t);
    }
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    return t;
    
}

//#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
template<class TPMGL(T)> void x10::util::WorkerLocalHandle<TPMGL(T)>::__apply(
  TPMGL(T) t) {
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    ::x10aux::nullCheck(::x10aux::nullCheck(this->FMGL(state)->x10::lang::template PlaceLocalHandle< ::x10::util::WorkerLocalHandle__State<TPMGL(T)>*>::__apply())->FMGL(store))->x10::lang::template Rail< TPMGL(T) >::__set(
      ((x10_long)(::x10aux::nullCheck((::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread())))->FMGL(workerId))),
      t);
}

//#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
template<class TPMGL(T)> void x10::util::WorkerLocalHandle<TPMGL(T)>::initLocal(
  ::x10::lang::Fun_0_0<TPMGL(T)>* init) {
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    ::x10::util::WorkerLocalHandle__State<TPMGL(T)>* localState =
      this->FMGL(state)->x10::lang::template PlaceLocalHandle< ::x10::util::WorkerLocalHandle__State<TPMGL(T)>*>::__apply();
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    ::x10::lang::Rail< TPMGL(T) >* localStore = ::x10aux::nullCheck(localState)->FMGL(store);
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    ::x10aux::nullCheck(localStore)->x10::lang::template Rail< TPMGL(T) >::clear();
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    ::x10aux::nullCheck(localState)->FMGL(init) = init;
}

//#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
template<class TPMGL(T)> void x10::util::WorkerLocalHandle<TPMGL(T)>::applyLocal(
  ::x10::lang::VoidFun_0_1<TPMGL(T)>* op) {
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    ::x10::lang::Rail< TPMGL(T) >* localStore = ::x10aux::nullCheck(this->FMGL(state)->x10::lang::template PlaceLocalHandle< ::x10::util::WorkerLocalHandle__State<TPMGL(T)>*>::__apply())->FMGL(store);
    {
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
        ::x10::lang::Runtime::ensureNotInAtomic();
        ::x10::lang::FinishState* x10____var64 = ::x10::lang::Runtime::startFinish();
        {
            ::x10::lang::CheckedThrowable* throwable__123100 =
              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                try {
                    {
                        x10_long i__123022max__123085 = (((x10_long)(::x10aux::nullCheck(localStore)->FMGL(size))) - (((x10_long)1ll)));
                        {
                            x10_long i__123086;
                            for (i__123086 = ((x10_long)0ll);
                                 ((i__123086) <= (i__123022max__123085));
                                 i__123086 = ((i__123086) + (((x10_long)1ll))))
                            {
                                x10_long i__123087 = i__123086;
                                
                                //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                                TPMGL(T) t__123084 = ::x10aux::nullCheck(localStore)->x10::lang::template Rail< TPMGL(T) >::__apply(
                                                       i__123087);
                                
                                //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                                if ((!::x10aux::struct_equals(t__123084,
                                                              reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
                                {
                                    
                                    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                                    ::x10::lang::Runtime::runAsync(
                                      reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_util_WorkerLocalHandle__closure__2<TPMGL(T)>)))x10_util_WorkerLocalHandle__closure__2<TPMGL(T)>(op, t__123084))));
                                }
                                
                            }
                        }
                        
                    }
                }
                catch (::x10::lang::CheckedThrowable* __exc3206) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc3206);
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
            catch (::x10::lang::CheckedThrowable* __exc3207) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__123101 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc3207);
                    {
                        throwable__123100 = formal__123101;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__123100)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__123100))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__123100));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::stopFinish(x10____var64);
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__123100)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__123100)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__123100));
                }
                
            }
            
        }
    }
    
    //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    return;
}

//#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
template<class TPMGL(T)> TPMGL(T) x10::util::WorkerLocalHandle<TPMGL(T)>::reduceLocal(
  ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), TPMGL(T)>* op) {
    
    //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    ::x10::util::WorkerLocalHandle__State<TPMGL(T)>* localState =
      this->FMGL(state)->x10::lang::template PlaceLocalHandle< ::x10::util::WorkerLocalHandle__State<TPMGL(T)>*>::__apply();
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    ::x10::lang::Rail< TPMGL(T) >* localStore = ::x10aux::nullCheck(localState)->FMGL(store);
    
    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    TPMGL(T) result = ::x10::lang::Fun_0_0<TPMGL(T)>::__apply(::x10aux::nullCheck(::x10aux::nullCheck(localState)->FMGL(init)));
    
    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    x10_long i__123040max__123089 = (((x10_long)(::x10aux::nullCheck(localStore)->FMGL(size))) - (((x10_long)1ll)));
    {
        x10_long i__123090;
        for (i__123090 = ((x10_long)0ll); ((i__123090) <= (i__123040max__123089));
             i__123090 = ((i__123090) + (((x10_long)1ll))))
        {
            x10_long i__123091 = i__123090;
            
            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            TPMGL(T) t__123088 = ::x10aux::nullCheck(localStore)->x10::lang::template Rail< TPMGL(T) >::__apply(
                                   i__123091);
            
            //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            if ((!::x10aux::struct_equals(t__123088, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
            {
                
                //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                result = ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), TPMGL(T)>::__apply(::x10aux::nullCheck(op), 
                  result, t__123088);
            }
            
        }
    }
    
    //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    return result;
    
}

//#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
template<class TPMGL(T)> TPMGL(T) x10::util::WorkerLocalHandle<TPMGL(T)>::reduceLocal(
  TPMGL(T) result, ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), TPMGL(T)>* op) {
    
    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    ::x10::util::WorkerLocalHandle__State<TPMGL(T)>* localState =
      this->FMGL(state)->x10::lang::template PlaceLocalHandle< ::x10::util::WorkerLocalHandle__State<TPMGL(T)>*>::__apply();
    
    //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    ::x10::lang::Rail< TPMGL(T) >* localStore = ::x10aux::nullCheck(localState)->FMGL(store);
    
    //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    x10_long i__123058max__123093 = (((x10_long)(::x10aux::nullCheck(localStore)->FMGL(size))) - (((x10_long)1ll)));
    {
        x10_long i__123094;
        for (i__123094 = ((x10_long)0ll); ((i__123094) <= (i__123058max__123093));
             i__123094 = ((i__123094) + (((x10_long)1ll))))
        {
            x10_long i__123095 = i__123094;
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            TPMGL(T) t__123092 = ::x10aux::nullCheck(localStore)->x10::lang::template Rail< TPMGL(T) >::__apply(
                                   i__123095);
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
            if ((!::x10aux::struct_equals(t__123092, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
            {
                
                //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
                result = ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), TPMGL(T)>::__apply(::x10aux::nullCheck(op), 
                  result, t__123092);
            }
            
        }
    }
    
    //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
    return result;
    
}

//#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/WorkerLocalHandle.x10"
template<class TPMGL(T)> ::x10::util::WorkerLocalHandle<TPMGL(T)>*
  x10::util::WorkerLocalHandle<TPMGL(T)>::x10__util__WorkerLocalHandle____this__x10__util__WorkerLocalHandle(
  ) {
    return this;
    
}
template<class TPMGL(T)> void x10::util::WorkerLocalHandle<TPMGL(T)>::__fieldInitializers_x10_util_WorkerLocalHandle(
  ) {
 
}
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10::util::WorkerLocalHandle<TPMGL(T)>::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::WorkerLocalHandle<TPMGL(T)>::_deserializer);

template<class TPMGL(T)> void x10::util::WorkerLocalHandle<TPMGL(T)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(state));
    
}

template<class TPMGL(T)> ::x10::lang::Reference* ::x10::util::WorkerLocalHandle<TPMGL(T)>::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::WorkerLocalHandle<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::util::WorkerLocalHandle<TPMGL(T)> >()) ::x10::util::WorkerLocalHandle<TPMGL(T)>();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

template<class TPMGL(T)> void x10::util::WorkerLocalHandle<TPMGL(T)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(state) = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::util::WorkerLocalHandle__State<TPMGL(T)>*> >();
}

#endif // X10_UTIL_WORKERLOCALHANDLE_H_IMPLEMENTATION
#endif // __X10_UTIL_WORKERLOCALHANDLE_H_NODEPS
