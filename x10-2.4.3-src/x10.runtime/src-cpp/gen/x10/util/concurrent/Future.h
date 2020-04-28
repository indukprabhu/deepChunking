#ifndef __X10_UTIL_CONCURRENT_FUTURE_H
#define __X10_UTIL_CONCURRENT_FUTURE_H

#include <x10rt.h>


#define X10_LANG_FUN_0_0_H_NODEPS
#include <x10/lang/Fun_0_0.h>
#undef X10_LANG_FUN_0_0_H_NODEPS
#define X10_LANG_GLOBALREF_H_NODEPS
#include <x10/lang/GlobalRef.h>
#undef X10_LANG_GLOBALREF_H_NODEPS
#define X10_LANG_GLOBALREF_H_NODEPS
#include <x10/lang/GlobalRef.h>
#undef X10_LANG_GLOBALREF_H_NODEPS
namespace x10 { namespace util { namespace concurrent { 
class Latch;
} } } 
namespace x10 { namespace compiler { 
class SuppressTransientError;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class GrowableRail;
} } 
namespace x10 { namespace lang { 
class Exception;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace lang { 
class VoidFun_0_0;
} } 
namespace x10 { namespace lang { 
class Error;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace compiler { 
class AsyncClosure;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
class Runtime__Profile;
} } 
namespace x10 { namespace compiler { 
class Global;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace compiler { 
class Pinned;
} } 
namespace x10 { namespace lang { 
class FinishState;
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
class Synthetic;
} } 
namespace x10 { namespace util { namespace concurrent { 

template<class TPMGL(T)> class Future;
template <> class Future<void>;
template<class TPMGL(T)> class Future : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    static ::x10aux::itable_entry _itables[3];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static typename ::x10::lang::Fun_0_0<TPMGL(T)>::template itable< ::x10::util::concurrent::Future<TPMGL(T)> > _itable_0;
    
    static ::x10::lang::Any::itable< ::x10::util::concurrent::Future<TPMGL(T)> > _itable_1;
    
    ::x10::lang::GlobalRef< ::x10::util::concurrent::Future<TPMGL(T)>* > FMGL(root);
    
    ::x10::util::concurrent::Latch* FMGL(latch);
    
    ::x10::util::GrowableRail< ::x10::lang::Exception*>* FMGL(exception);
    
    ::x10::util::GrowableRail<TPMGL(T)>* FMGL(result);
    
    ::x10::lang::Fun_0_0<TPMGL(T)>* FMGL(eval);
    
    void _constructor(::x10::lang::Fun_0_0<TPMGL(T)>* eval);
    
    static ::x10::util::concurrent::Future<TPMGL(T)>* _make(::x10::lang::Fun_0_0<TPMGL(T)>* eval);
    
    virtual x10_boolean forced();
    virtual TPMGL(T) __apply();
    virtual TPMGL(T) force();
    TPMGL(T) forceLocal();
    virtual void run();
    virtual ::x10::util::concurrent::Future<TPMGL(T)>* x10__util__concurrent__Future____this__x10__util__concurrent__Future(
      );
    virtual void __fieldInitializers_x10_util_concurrent_Future();
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: virtual ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

template<class TPMGL(T)> ::x10aux::RuntimeType x10::util::concurrent::Future<TPMGL(T)>::rtt;
template<class TPMGL(T)> void x10::util::concurrent::Future<TPMGL(T)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::util::concurrent::Future<void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Fun_0_0<TPMGL(T)> >()};
    const ::x10aux::RuntimeType* params[1] = { ::x10aux::getRTT<TPMGL(T)>()};
    ::x10aux::RuntimeType::Variance variances[1] = { ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.util.concurrent.Future";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 1, parents, 1, params, variances);
}

template <> class Future<void> : public ::x10::lang::X10Class {
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    template<class TPMGL(T)> static ::x10::util::concurrent::Future<TPMGL(T)>*
      make(::x10::lang::Fun_0_0<TPMGL(T)>* eval);
    
    
};

} } } 
#endif // X10_UTIL_CONCURRENT_FUTURE_H

namespace x10 { namespace util { namespace concurrent { 
template<class TPMGL(T)> class Future;
} } } 

#ifndef X10_UTIL_CONCURRENT_FUTURE_H_NODEPS
#define X10_UTIL_CONCURRENT_FUTURE_H_NODEPS
#include <x10/lang/Fun_0_0.h>
#include <x10/lang/GlobalRef.h>
#include <x10/util/concurrent/Latch.h>
#include <x10/compiler/SuppressTransientError.h>
#include <x10/util/GrowableRail.h>
#include <x10/lang/Exception.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Error.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/compiler/AsyncClosure.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Place.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/compiler/Global.h>
#include <x10/lang/Long.h>
#include <x10/lang/Rail.h>
#include <x10/compiler/Pinned.h>
#include <x10/lang/FinishState.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_UTIL_CONCURRENT_FUTURE_H_GENERICS
#define X10_UTIL_CONCURRENT_FUTURE_H_GENERICS
#endif // X10_UTIL_CONCURRENT_FUTURE_H_GENERICS
#ifndef X10_UTIL_CONCURRENT_FUTURE_H_IMPLEMENTATION
#define X10_UTIL_CONCURRENT_FUTURE_H_IMPLEMENTATION
#include <x10/util/concurrent/Future.h>

#ifndef X10_UTIL_CONCURRENT_FUTURE__CLOSURE__1_CLOSURE
#define X10_UTIL_CONCURRENT_FUTURE__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T)> class x10_util_concurrent_Future__closure__1 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0<x10_boolean>::template itable <x10_util_concurrent_Future__closure__1<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_boolean __apply() {
        try {
            return ::x10aux::nullCheck((saved_this->FMGL(root))->__apply())->FMGL(latch)->__apply();
            
        }
        catch (::x10::lang::CheckedThrowable* __exc2560) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc2560);
                {
                    x10_boolean __lowerer__var__1__ = ::x10aux::class_cast_unchecked<x10_boolean>(::x10::lang::Runtime::template wrapAtChecked< x10_boolean >(
                                                                                                    __lowerer__var__0__));
                    return __lowerer__var__1__;
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::util::concurrent::Future<TPMGL(T)>* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_concurrent_Future__closure__1<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_util_concurrent_Future__closure__1<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::util::concurrent::Future<TPMGL(T)>* that_saved_this = buf.read< ::x10::util::concurrent::Future<TPMGL(T)>*>();
        x10_util_concurrent_Future__closure__1<TPMGL(T) >* this_ = new (storage) x10_util_concurrent_Future__closure__1<TPMGL(T) >(that_saved_this);
        return this_;
    }
    
    x10_util_concurrent_Future__closure__1(::x10::util::concurrent::Future<TPMGL(T)>* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_boolean> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_boolean> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10:54";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_0<x10_boolean>::template itable <x10_util_concurrent_Future__closure__1<TPMGL(T) > >x10_util_concurrent_Future__closure__1<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_concurrent_Future__closure__1<TPMGL(T) >::__apply, &x10_util_concurrent_Future__closure__1<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_util_concurrent_Future__closure__1<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_boolean> >, &x10_util_concurrent_Future__closure__1<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_concurrent_Future__closure__1<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_concurrent_Future__closure__1<TPMGL(T) >::_deserialize);

#endif // X10_UTIL_CONCURRENT_FUTURE__CLOSURE__1_CLOSURE
#ifndef X10_UTIL_CONCURRENT_FUTURE__CLOSURE__2_CLOSURE
#define X10_UTIL_CONCURRENT_FUTURE__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T)> class x10_util_concurrent_Future__closure__2 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0<TPMGL(T)>::template itable <x10_util_concurrent_Future__closure__2<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    TPMGL(T) __apply() {
        try {
            return ::x10aux::nullCheck((saved_this->FMGL(root))->__apply())->forceLocal();
            
        }
        catch (::x10::lang::CheckedThrowable* __exc2563) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc2563);
                {
                    TPMGL(T) __lowerer__var__1__ = ::x10aux::class_cast_unchecked<TPMGL(T)>(::x10::lang::Runtime::template wrapAtChecked< TPMGL(T) >(
                                                                                              __lowerer__var__0__));
                    return __lowerer__var__1__;
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::util::concurrent::Future<TPMGL(T)>* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_concurrent_Future__closure__2<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_util_concurrent_Future__closure__2<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::util::concurrent::Future<TPMGL(T)>* that_saved_this = buf.read< ::x10::util::concurrent::Future<TPMGL(T)>*>();
        x10_util_concurrent_Future__closure__2<TPMGL(T) >* this_ = new (storage) x10_util_concurrent_Future__closure__2<TPMGL(T) >(that_saved_this);
        return this_;
    }
    
    x10_util_concurrent_Future__closure__2(::x10::util::concurrent::Future<TPMGL(T)>* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0<TPMGL(T)> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0<TPMGL(T)> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10:62";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_0<TPMGL(T)>::template itable <x10_util_concurrent_Future__closure__2<TPMGL(T) > >x10_util_concurrent_Future__closure__2<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_concurrent_Future__closure__2<TPMGL(T) >::__apply, &x10_util_concurrent_Future__closure__2<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_util_concurrent_Future__closure__2<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0<TPMGL(T)> >, &x10_util_concurrent_Future__closure__2<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_concurrent_Future__closure__2<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_concurrent_Future__closure__2<TPMGL(T) >::_deserialize);

#endif // X10_UTIL_CONCURRENT_FUTURE__CLOSURE__2_CLOSURE
#ifndef X10_UTIL_CONCURRENT_FUTURE__CLOSURE__3_CLOSURE
#define X10_UTIL_CONCURRENT_FUTURE__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_util_concurrent_Future__closure__3 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_util_concurrent_Future__closure__3<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            f->run();
        }
        catch (::x10::lang::CheckedThrowable* __exc2571) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc2571)) {
                ::x10::lang::Error* __lowerer__var__0__ = static_cast< ::x10::lang::Error*>(__exc2571);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc2571);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::util::concurrent::Future<TPMGL(T)>* f;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->f);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_concurrent_Future__closure__3<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_util_concurrent_Future__closure__3<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::util::concurrent::Future<TPMGL(T)>* that_f = buf.read< ::x10::util::concurrent::Future<TPMGL(T)>*>();
        x10_util_concurrent_Future__closure__3<TPMGL(T) >* this_ = new (storage) x10_util_concurrent_Future__closure__3<TPMGL(T) >(that_f);
        return this_;
    }
    
    x10_util_concurrent_Future__closure__3(::x10::util::concurrent::Future<TPMGL(T)>* f) : f(f) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10:44";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_util_concurrent_Future__closure__3<TPMGL(T) > >x10_util_concurrent_Future__closure__3<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_concurrent_Future__closure__3<TPMGL(T) >::__apply, &x10_util_concurrent_Future__closure__3<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_util_concurrent_Future__closure__3<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_util_concurrent_Future__closure__3<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_concurrent_Future__closure__3<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_concurrent_Future__closure__3<TPMGL(T) >::_deserialize);
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_concurrent_Future__closure__3<TPMGL(T) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_util_concurrent_Future__closure__3<TPMGL(T) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_UTIL_CONCURRENT_FUTURE__CLOSURE__3_CLOSURE
template<class TPMGL(T)> typename ::x10::lang::Fun_0_0<TPMGL(T)>::template itable< ::x10::util::concurrent::Future<TPMGL(T)> >  x10::util::concurrent::Future<TPMGL(T)>::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::util::concurrent::Future<TPMGL(T)>::__apply, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10::lang::Any::itable< ::x10::util::concurrent::Future<TPMGL(T)> >  x10::util::concurrent::Future<TPMGL(T)>::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10::util::concurrent::Future<TPMGL(T)>::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0<TPMGL(T)> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::util::concurrent::Future<TPMGL(T)>")};

//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"

//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
/**
     * Latch for signaling and wait
     */

//#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
/**
     * Set if the activity terminated with an exception.
     * Can only be of type Error or Exception
     *
     */

//#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"

//#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"

//#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"

//#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
template<class TPMGL(T)> void x10::util::concurrent::Future<TPMGL(T)>::_constructor(
                           ::x10::lang::Fun_0_0<TPMGL(T)>* eval) {
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    this->x10::util::concurrent::template Future<TPMGL(T)>::__fieldInitializers_x10_util_concurrent_Future();
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    this->FMGL(eval) = eval;
}
template<class TPMGL(T)> ::x10::util::concurrent::Future<TPMGL(T)>* x10::util::concurrent::Future<TPMGL(T)>::_make(
                           ::x10::lang::Fun_0_0<TPMGL(T)>* eval)
{
    ::x10::util::concurrent::Future<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::Future<TPMGL(T)> >()) ::x10::util::concurrent::Future<TPMGL(T)>();
    this_->_constructor(eval);
    return this_;
}



//#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
template<class TPMGL(T)> x10_boolean x10::util::concurrent::Future<TPMGL(T)>::forced(
  ) {
    return ::x10::lang::Runtime::template evalAt< x10_boolean >(
             ::x10::lang::Place::place(((x10_long)((this->FMGL(root))->location))),
             reinterpret_cast< ::x10::lang::Fun_0_0<x10_boolean>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0<x10_boolean> >(sizeof(x10_util_concurrent_Future__closure__1<TPMGL(T)>)))x10_util_concurrent_Future__closure__1<TPMGL(T)>(this))),
             ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
}

//#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
template<class TPMGL(T)> TPMGL(T) x10::util::concurrent::Future<TPMGL(T)>::__apply(
  ) {
    return this->force();
    
}

//#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
template<class TPMGL(T)> TPMGL(T) x10::util::concurrent::Future<TPMGL(T)>::force(
  ) {
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    ::x10::lang::Runtime::ensureNotInAtomic();
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    return ::x10::lang::Runtime::template evalAt< TPMGL(T) >(
             ::x10::lang::Place::place(((x10_long)((this->FMGL(root))->location))),
             reinterpret_cast< ::x10::lang::Fun_0_0<TPMGL(T)>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0<TPMGL(T)> >(sizeof(x10_util_concurrent_Future__closure__2<TPMGL(T)>)))x10_util_concurrent_Future__closure__2<TPMGL(T)>(this))),
             ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
}

//#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
template<class TPMGL(T)> TPMGL(T) x10::util::concurrent::Future<TPMGL(T)>::forceLocal(
  ) {
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    this->FMGL(latch)->await();
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    if ((((__extension__ ({
            ::x10::util::GrowableRail< ::x10::lang::Exception*>* this__117312 =
              this->FMGL(exception);
            this__117312->FMGL(size);
        }))
        ) > (((x10_long)0ll)))) {
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        ::x10aux::throwException(::x10aux::nullCheck((__extension__ ({
            ::x10::util::GrowableRail< ::x10::lang::Exception*>* this__117314 =
              this->FMGL(exception);
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ::x10::lang::Exception* ret__117315;
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ret__117315 = ::x10aux::nullCheck(this__117314->FMGL(data))->x10::lang::template Rail< ::x10::lang::Exception* >::__apply(
                            ((x10_long)0ll));
            ret__117315;
        }))
        ));
    }
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    ::x10::util::GrowableRail<TPMGL(T)>* this__117324 = this->FMGL(result);
    
    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    TPMGL(T) ret__117325;
    
    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    ret__117325 = ::x10aux::nullCheck(this__117324->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__apply(
                    ((x10_long)0ll));
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    return ret__117325;
    
}

//#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
template<class TPMGL(T)> void x10::util::concurrent::Future<TPMGL(T)>::run(
  ) {
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    try {
        {
            
            //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var23 = ::x10::lang::Runtime::startFinish();
            {
                ::x10::lang::CheckedThrowable* throwable__117338 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            this->FMGL(result)->x10::util::template GrowableRail<TPMGL(T)>::add(
                              ::x10::lang::Fun_0_0<TPMGL(T)>::__apply(::x10aux::nullCheck(this->FMGL(eval))));
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc2566) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc2566);
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
                catch (::x10::lang::CheckedThrowable* __exc2567) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__117339 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc2567);
                        {
                            throwable__117338 = formal__117339;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__117338)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__117338))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__117338));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var23);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__117338)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__117338)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__117338));
                    }
                    
                }
                
            }
        }
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        this->FMGL(latch)->release();
    }
    catch (::x10::lang::CheckedThrowable* __exc2568) {
        if (::x10aux::instanceof< ::x10::lang::Exception*>(__exc2568)) {
            ::x10::lang::Exception* t = static_cast< ::x10::lang::Exception*>(__exc2568);
            {
                
                //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                this->FMGL(exception)->x10::util::template GrowableRail< ::x10::lang::Exception*>::add(
                  t);
                
                //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
                this->FMGL(latch)->release();
            }
        } else
        throw;
    }
}

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
template<class TPMGL(T)> ::x10::util::concurrent::Future<TPMGL(T)>*
  x10::util::concurrent::Future<TPMGL(T)>::x10__util__concurrent__Future____this__x10__util__concurrent__Future(
  ) {
    return this;
    
}
template<class TPMGL(T)> void x10::util::concurrent::Future<TPMGL(T)>::__fieldInitializers_x10_util_concurrent_Future(
  ) {
    this->FMGL(root) = ::x10::lang::GlobalRef< ::x10::util::concurrent::Future<TPMGL(T)>* >(this);
    this->FMGL(latch) = ::x10::util::concurrent::Latch::_make();
    this->FMGL(exception) = (__extension__ ({
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        ::x10::util::GrowableRail< ::x10::lang::Exception*>* alloc__117267 =
           (new (::x10aux::alloc_z< ::x10::util::GrowableRail< ::x10::lang::Exception*> >()) ::x10::util::GrowableRail< ::x10::lang::Exception*>());
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        (alloc__117267)->::x10::util::GrowableRail< ::x10::lang::Exception*>::_constructor(
          ((x10_long)0ll));
        alloc__117267;
    }))
    ;
    this->FMGL(result) = (__extension__ ({
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
        ::x10::util::GrowableRail<TPMGL(T)>* alloc__117268 =
           (new (::x10aux::alloc_z< ::x10::util::GrowableRail<TPMGL(T)> >()) ::x10::util::GrowableRail<TPMGL(T)>());
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        (alloc__117268)->::x10::util::GrowableRail<TPMGL(T)>::_constructor(
          ((x10_long)0ll));
        alloc__117268;
    }))
    ;
}
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10::util::concurrent::Future<TPMGL(T)>::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::concurrent::Future<TPMGL(T)>::_deserializer);

template<class TPMGL(T)> void x10::util::concurrent::Future<TPMGL(T)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(root));
    
}

template<class TPMGL(T)> ::x10::lang::Reference* ::x10::util::concurrent::Future<TPMGL(T)>::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::concurrent::Future<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::Future<TPMGL(T)> >()) ::x10::util::concurrent::Future<TPMGL(T)>();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

template<class TPMGL(T)> void x10::util::concurrent::Future<TPMGL(T)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(root) = buf.read< ::x10::lang::GlobalRef< ::x10::util::concurrent::Future<TPMGL(T)>* > >();
    
}

template<class TPMGL(T)> ::x10::util::concurrent::Future<TPMGL(T)>*
  x10::util::concurrent::Future<void>::make(::x10::lang::Fun_0_0<TPMGL(T)>* eval) {
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    ::x10::lang::Runtime::ensureNotInAtomic();
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    ::x10::util::concurrent::Future<TPMGL(T)>* f =  (new (::x10aux::alloc_z< ::x10::util::concurrent::Future<TPMGL(T)> >()) ::x10::util::concurrent::Future<TPMGL(T)>());
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    ::x10::lang::Fun_0_0<TPMGL(T)>* eval__117323 = eval;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    f->x10::util::concurrent::template Future<TPMGL(T)>::__fieldInitializers_x10_util_concurrent_Future();
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    f->FMGL(eval) = eval__117323;
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    ::x10::lang::Runtime::runAsync(reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_util_concurrent_Future__closure__3<TPMGL(T)>)))x10_util_concurrent_Future__closure__3<TPMGL(T)>(f))));
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Future.x10"
    return f;
    
}
#endif // X10_UTIL_CONCURRENT_FUTURE_H_IMPLEMENTATION
#endif // __X10_UTIL_CONCURRENT_FUTURE_H_NODEPS
