#ifndef __X10_LANG_RESILIENTSTOREPLACE0_H
#define __X10_LANG_RESILIENTSTOREPLACE0_H

#include <x10rt.h>


#define X10_LANG_RESILIENTSTORE_H_NODEPS
#include <x10/lang/ResilientStore.h>
#undef X10_LANG_RESILIENTSTORE_H_NODEPS
#define X10_LANG_GLOBALREF_H_NODEPS
#include <x10/lang/GlobalRef.h>
#undef X10_LANG_GLOBALREF_H_NODEPS
#define X10_LANG_GLOBALREF_H_NODEPS
#include <x10/lang/GlobalRef.h>
#undef X10_LANG_GLOBALREF_H_NODEPS
#define X10_LANG_GLOBALREF_H_NODEPS
#include <x10/lang/GlobalRef.h>
#undef X10_LANG_GLOBALREF_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
class VoidFun_0_0;
} } 
namespace x10 { namespace lang { 
class FinishResilient;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Cell;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(U)> class Fun_0_0;
} } 
namespace x10 { namespace util { 
template<class TPMGL(K), class TPMGL(V)> class HashMap;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace compiler { 
class NonEscaping;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
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
namespace x10 { namespace lang { 
template<class TPMGL(E)> class ResilientStorePlace0__MyQueue;
} } 
namespace x10 { namespace lang { 
class ResilientStorePlace0__MyLatch;
} } 
namespace x10 { namespace util { namespace concurrent { 
class SimpleLatch;
} } } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(E)> class ResilientStorePlace0__MyQueue__Entry;
} } 
namespace x10 { namespace lang { 

template<class TPMGL(K), class TPMGL(V)> class ResilientStorePlace0;
template <> class ResilientStorePlace0<void, void>;
template<class TPMGL(K), class TPMGL(V)> class ResilientStorePlace0 : public ::x10::lang::ResilientStore<TPMGL(K), TPMGL(V)>
  {
    public:
    RTT_H_DECLS_CLASS
    
    ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* >
      FMGL(root);
    
    ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>*
      getMe();
    void _constructor();
    
    static ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* _make(
             );
    
    ::x10::util::HashMap<TPMGL(K), TPMGL(V)>* FMGL(hm);
    
    virtual void create(TPMGL(K) key, TPMGL(V) value);
    virtual void put(TPMGL(K) key, TPMGL(V) value);
    virtual TPMGL(V) getOrElse(TPMGL(K) key, TPMGL(V) orelse);
    virtual void remove(TPMGL(K) key);
    ::x10::lang::ResilientStorePlace0__MyQueue< ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > >*
      FMGL(waitQueue);
    
    x10_long FMGL(waitCount);
    
    virtual void lock();
    virtual void unlock();
    virtual ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>*
      x10__lang__ResilientStorePlace0____this__x10__lang__ResilientStorePlace0(
      );
    virtual void __fieldInitializers_x10_lang_ResilientStorePlace0(
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

template<class TPMGL(K), class TPMGL(V)> ::x10aux::RuntimeType x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>::rtt;
template<class TPMGL(K), class TPMGL(V)> void x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::lang::ResilientStorePlace0<void, void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::ResilientStore<TPMGL(K), TPMGL(V)> >()};
    const ::x10aux::RuntimeType* params[2] = { ::x10aux::getRTT<TPMGL(K)>(), ::x10aux::getRTT<TPMGL(V)>()};
    ::x10aux::RuntimeType::Variance variances[2] = { ::x10aux::RuntimeType::invariant, ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.lang.ResilientStorePlace0";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 1, parents, 2, params, variances);
}

template <> class ResilientStorePlace0<void, void> : public ::x10::lang::ResilientStore<void, void>
{
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    static x10_long FMGL(verbose);
    
    static x10_boolean lowLevelSend(::x10::lang::Place dst,
                                    ::x10::lang::VoidFun_0_0* cl);
    
    static x10_boolean lowLevelAt(::x10::lang::Place dst,
                                  ::x10::lang::VoidFun_0_0* cl);
    
    template<class TPMGL(T)> static x10_boolean lowLevelFetch(
      ::x10::lang::Place dst, ::x10::lang::Cell<TPMGL(T)>* result,
      ::x10::lang::Fun_0_0<TPMGL(T)>* cl);
    
    static ::x10::util::HashMap< ::x10::lang::Any*, ::x10::lang::Any*>*
      FMGL(ALL);
    
    template<class TPMGL(K), class TPMGL(V)> static ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>*
      make(::x10::lang::Any* name);
    
    static void _kwd__delete(::x10::lang::Any* name);
    
    static void FMGL(verbose__do_init)();
    static void FMGL(verbose__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(verbose__status);
    static ::x10::lang::CheckedThrowable* FMGL(verbose__exception);
    static x10_long FMGL(verbose__get)();
    static void FMGL(ALL__do_init)();
    static void FMGL(ALL__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(ALL__status);
    static ::x10::lang::CheckedThrowable* FMGL(ALL__exception);
    static ::x10::util::HashMap< ::x10::lang::Any*, ::x10::lang::Any*>*
      FMGL(ALL__get)();
    
};

} } 
#endif // X10_LANG_RESILIENTSTOREPLACE0_H

namespace x10 { namespace lang { 
template<class TPMGL(K), class TPMGL(V)> class ResilientStorePlace0;
} } 

#ifndef X10_LANG_RESILIENTSTOREPLACE0_H_NODEPS
#define X10_LANG_RESILIENTSTOREPLACE0_H_NODEPS
#include <x10/lang/ResilientStore.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/Long.h>
#include <x10/lang/Place.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/FinishResilient.h>
#include <x10/lang/Cell.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/util/HashMap.h>
#include <x10/lang/Any.h>
#include <x10/lang/Runtime.h>
#include <x10/compiler/NonEscaping.h>
#include <x10/lang/String.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/util/Box.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/lang/ResilientStorePlace0__MyQueue.h>
#include <x10/lang/ResilientStorePlace0__MyLatch.h>
#include <x10/util/concurrent/SimpleLatch.h>
#include <x10/compiler/Synthetic.h>
#include <x10/lang/ResilientStorePlace0__MyQueue__Entry.h>
#ifndef X10_LANG_RESILIENTSTOREPLACE0_H_GENERICS
#define X10_LANG_RESILIENTSTOREPLACE0_H_GENERICS
inline x10_long x10::lang::ResilientStorePlace0<void, void>::FMGL(verbose__get)() {
    if (FMGL(verbose__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(verbose__init)();
    }
    return x10::lang::ResilientStorePlace0<void, void>::FMGL(verbose);
}

inline ::x10::util::HashMap< ::x10::lang::Any*, ::x10::lang::Any*>* x10::lang::ResilientStorePlace0<void, void>::FMGL(ALL__get)() {
    if (FMGL(ALL__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(ALL__init)();
    }
    return x10::lang::ResilientStorePlace0<void, void>::FMGL(ALL);
}

#endif // X10_LANG_RESILIENTSTOREPLACE0_H_GENERICS
#ifndef X10_LANG_RESILIENTSTOREPLACE0_H_IMPLEMENTATION
#define X10_LANG_RESILIENTSTOREPLACE0_H_IMPLEMENTATION
#include <x10/lang/ResilientStorePlace0.h>

#ifndef X10_LANG_RESILIENTSTOREPLACE0__CLOSURE__1_CLOSURE
#define X10_LANG_RESILIENTSTOREPLACE0__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(K), class TPMGL(V)> class x10_lang_ResilientStorePlace0__closure__1 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_ResilientStorePlace0__closure__1<TPMGL(K),TPMGL(V) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        {
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            ::x10::lang::CheckedThrowable* throwable__103876 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                {
                    ::x10::lang::Runtime::enterAtomic();
                    {
                        ::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* this__103835 =
                                                  saved_this;
                                                ::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* >(::x10aux::nullCheck(this__103835)->FMGL(root));
                                            }))
                                            )->FMGL(hm))->put(key,
                                                              value);
                    }
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc1496) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__103877 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1496);
                    {
                        throwable__103876 = formal__103877;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103876)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__103876))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103876));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::exitAtomic();
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103876)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__103876)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103876));
                }
                
            }
            
        }
    }
    
    // captured environment
    ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* saved_this;
    TPMGL(K) key;
    TPMGL(V) value;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->key);
        buf.write(this->value);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_ResilientStorePlace0__closure__1<TPMGL(K),TPMGL(V) >* storage = ::x10aux::alloc_z<x10_lang_ResilientStorePlace0__closure__1<TPMGL(K),TPMGL(V) > >();
        buf.record_reference(storage);
        ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* that_saved_this = buf.read< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>*>();
        TPMGL(K) that_key = buf.read<TPMGL(K)>();
        TPMGL(V) that_value = buf.read<TPMGL(V)>();
        x10_lang_ResilientStorePlace0__closure__1<TPMGL(K),TPMGL(V) >* this_ = new (storage) x10_lang_ResilientStorePlace0__closure__1<TPMGL(K),TPMGL(V) >(that_saved_this, that_key, that_value);
        return this_;
    }
    
    x10_lang_ResilientStorePlace0__closure__1(::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* saved_this, TPMGL(K) key, TPMGL(V) value) : saved_this(saved_this), key(key), value(value) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10:63";
    }

};

template<class TPMGL(K), class TPMGL(V)> typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_ResilientStorePlace0__closure__1<TPMGL(K),TPMGL(V) > >x10_lang_ResilientStorePlace0__closure__1<TPMGL(K),TPMGL(V) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_ResilientStorePlace0__closure__1<TPMGL(K),TPMGL(V) >::__apply, &x10_lang_ResilientStorePlace0__closure__1<TPMGL(K),TPMGL(V) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(K), class TPMGL(V)> ::x10aux::itable_entry x10_lang_ResilientStorePlace0__closure__1<TPMGL(K),TPMGL(V) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_ResilientStorePlace0__closure__1<TPMGL(K),TPMGL(V) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(K), class TPMGL(V)> const ::x10aux::serialization_id_t x10_lang_ResilientStorePlace0__closure__1<TPMGL(K),TPMGL(V) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_ResilientStorePlace0__closure__1<TPMGL(K),TPMGL(V) >::_deserialize);

#endif // X10_LANG_RESILIENTSTOREPLACE0__CLOSURE__1_CLOSURE
#ifndef X10_LANG_RESILIENTSTOREPLACE0__CLOSURE__2_CLOSURE
#define X10_LANG_RESILIENTSTOREPLACE0__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(K), class TPMGL(V)> class x10_lang_ResilientStorePlace0__closure__2 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0<TPMGL(V)>::template itable <x10_lang_ResilientStorePlace0__closure__2<TPMGL(K),TPMGL(V) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    TPMGL(V) __apply() {
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        TPMGL(V) v__103841;
        {
            ::x10::lang::CheckedThrowable* throwable__103879 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                {
                    ::x10::lang::Runtime::enterAtomic();
                    {
                        v__103841 = ::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                            ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* this__103842 =
                                                              saved_this;
                                                            ::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* >(::x10aux::nullCheck(this__103842)->FMGL(root));
                                                        }))
                                                        )->FMGL(hm))->getOrElse(
                                      key, orelse);
                    }
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc1498) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__103880 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1498);
                    {
                        throwable__103879 = formal__103880;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103879)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__103879))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103879));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::exitAtomic();
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103879)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__103879)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103879));
                }
                
            }
            
        }
        return v__103841;
        
    }
    
    // captured environment
    ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* saved_this;
    TPMGL(K) key;
    TPMGL(V) orelse;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->key);
        buf.write(this->orelse);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_ResilientStorePlace0__closure__2<TPMGL(K),TPMGL(V) >* storage = ::x10aux::alloc_z<x10_lang_ResilientStorePlace0__closure__2<TPMGL(K),TPMGL(V) > >();
        buf.record_reference(storage);
        ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* that_saved_this = buf.read< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>*>();
        TPMGL(K) that_key = buf.read<TPMGL(K)>();
        TPMGL(V) that_orelse = buf.read<TPMGL(V)>();
        x10_lang_ResilientStorePlace0__closure__2<TPMGL(K),TPMGL(V) >* this_ = new (storage) x10_lang_ResilientStorePlace0__closure__2<TPMGL(K),TPMGL(V) >(that_saved_this, that_key, that_orelse);
        return this_;
    }
    
    x10_lang_ResilientStorePlace0__closure__2(::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* saved_this, TPMGL(K) key, TPMGL(V) orelse) : saved_this(saved_this), key(key), orelse(orelse) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0<TPMGL(V)> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0<TPMGL(V)> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10:70-72";
    }

};

template<class TPMGL(K), class TPMGL(V)> typename ::x10::lang::Fun_0_0<TPMGL(V)>::template itable <x10_lang_ResilientStorePlace0__closure__2<TPMGL(K),TPMGL(V) > >x10_lang_ResilientStorePlace0__closure__2<TPMGL(K),TPMGL(V) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_ResilientStorePlace0__closure__2<TPMGL(K),TPMGL(V) >::__apply, &x10_lang_ResilientStorePlace0__closure__2<TPMGL(K),TPMGL(V) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(K), class TPMGL(V)> ::x10aux::itable_entry x10_lang_ResilientStorePlace0__closure__2<TPMGL(K),TPMGL(V) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0<TPMGL(V)> >, &x10_lang_ResilientStorePlace0__closure__2<TPMGL(K),TPMGL(V) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(K), class TPMGL(V)> const ::x10aux::serialization_id_t x10_lang_ResilientStorePlace0__closure__2<TPMGL(K),TPMGL(V) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_ResilientStorePlace0__closure__2<TPMGL(K),TPMGL(V) >::_deserialize);

#endif // X10_LANG_RESILIENTSTOREPLACE0__CLOSURE__2_CLOSURE
#ifndef X10_LANG_RESILIENTSTOREPLACE0__CLOSURE__3_CLOSURE
#define X10_LANG_RESILIENTSTOREPLACE0__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(K), class TPMGL(V)> class x10_lang_ResilientStorePlace0__closure__3 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_ResilientStorePlace0__closure__3<TPMGL(K),TPMGL(V) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        {
            
            //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            ::x10::lang::CheckedThrowable* throwable__103882 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                {
                    ::x10::lang::Runtime::enterAtomic();
                    {
                        ::x10aux::nullCheck(::x10aux::nullCheck((__extension__ ({
                                                ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* this__103844 =
                                                  saved_this;
                                                ::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* >(::x10aux::nullCheck(this__103844)->FMGL(root));
                                            }))
                                            )->FMGL(hm))->remove(
                          key);
                    }
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc1500) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__103883 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1500);
                    {
                        throwable__103882 = formal__103883;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103882)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__103882))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103882));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::exitAtomic();
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103882)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__103882)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103882));
                }
                
            }
            
        }
    }
    
    // captured environment
    ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* saved_this;
    TPMGL(K) key;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->key);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_ResilientStorePlace0__closure__3<TPMGL(K),TPMGL(V) >* storage = ::x10aux::alloc_z<x10_lang_ResilientStorePlace0__closure__3<TPMGL(K),TPMGL(V) > >();
        buf.record_reference(storage);
        ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* that_saved_this = buf.read< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>*>();
        TPMGL(K) that_key = buf.read<TPMGL(K)>();
        x10_lang_ResilientStorePlace0__closure__3<TPMGL(K),TPMGL(V) >* this_ = new (storage) x10_lang_ResilientStorePlace0__closure__3<TPMGL(K),TPMGL(V) >(that_saved_this, that_key);
        return this_;
    }
    
    x10_lang_ResilientStorePlace0__closure__3(::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* saved_this, TPMGL(K) key) : saved_this(saved_this), key(key) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10:79";
    }

};

template<class TPMGL(K), class TPMGL(V)> typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_ResilientStorePlace0__closure__3<TPMGL(K),TPMGL(V) > >x10_lang_ResilientStorePlace0__closure__3<TPMGL(K),TPMGL(V) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_ResilientStorePlace0__closure__3<TPMGL(K),TPMGL(V) >::__apply, &x10_lang_ResilientStorePlace0__closure__3<TPMGL(K),TPMGL(V) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(K), class TPMGL(V)> ::x10aux::itable_entry x10_lang_ResilientStorePlace0__closure__3<TPMGL(K),TPMGL(V) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_ResilientStorePlace0__closure__3<TPMGL(K),TPMGL(V) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(K), class TPMGL(V)> const ::x10aux::serialization_id_t x10_lang_ResilientStorePlace0__closure__3<TPMGL(K),TPMGL(V) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_ResilientStorePlace0__closure__3<TPMGL(K),TPMGL(V) >::_deserialize);

#endif // X10_LANG_RESILIENTSTOREPLACE0__CLOSURE__3_CLOSURE
#ifndef X10_LANG_RESILIENTSTOREPLACE0__CLOSURE__4_CLOSURE
#define X10_LANG_RESILIENTSTOREPLACE0__CLOSURE__4_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(K), class TPMGL(V)> class x10_lang_ResilientStorePlace0__closure__4 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0<x10_boolean>::template itable <x10_lang_ResilientStorePlace0__closure__4<TPMGL(K),TPMGL(V) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_boolean __apply() {
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* me__103856 =
          (__extension__ ({
            ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* this__103857 =
              saved_this;
            ::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* >(::x10aux::nullCheck(this__103857)->FMGL(root));
        }))
        ;
        {
            
            //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            ::x10::lang::CheckedThrowable* throwable__103887 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                {
                    ::x10::lang::Runtime::enterAtomic();
                    {
                        
                        //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                        if ((::x10aux::struct_equals((::x10aux::nullCheck(me__103856)->FMGL(waitCount) =
                                                        ((::x10aux::nullCheck(me__103856)->FMGL(waitCount)) + (((x10_long)1ll)))),
                                                     ((x10_long)0ll))))
                        {
                            {
                                x10_boolean t__103885 = false;
                                {
                                    
                                    //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                                    ::x10::lang::Runtime::exitAtomic();
                                }
                                return t__103885;
                                
                            }
                        }
                        
                        //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                        ::x10aux::nullCheck(::x10aux::nullCheck(me__103856)->FMGL(waitQueue))->add(
                          gLatch);
                        {
                            x10_boolean t__103886 = true;
                            {
                                
                                //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                                ::x10::lang::Runtime::exitAtomic();
                            }
                            return t__103886;
                            
                        }
                    }
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc1502) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__103888 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1502);
                    {
                        throwable__103887 = formal__103888;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103887)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__103887))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103887));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::exitAtomic();
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103887)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__103887)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103887));
                }
                
            }
            
        }
    }
    
    // captured environment
    ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* saved_this;
    ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > gLatch;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->gLatch);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_ResilientStorePlace0__closure__4<TPMGL(K),TPMGL(V) >* storage = ::x10aux::alloc_z<x10_lang_ResilientStorePlace0__closure__4<TPMGL(K),TPMGL(V) > >();
        buf.record_reference(storage);
        ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* that_saved_this = buf.read< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>*>();
        ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > that_gLatch = buf.read< ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > >();
        x10_lang_ResilientStorePlace0__closure__4<TPMGL(K),TPMGL(V) >* this_ = new (storage) x10_lang_ResilientStorePlace0__closure__4<TPMGL(K),TPMGL(V) >(that_saved_this, that_gLatch);
        return this_;
    }
    
    x10_lang_ResilientStorePlace0__closure__4(::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* saved_this, ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > gLatch) : saved_this(saved_this), gLatch(gLatch) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_boolean> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_boolean> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10:122-128";
    }

};

template<class TPMGL(K), class TPMGL(V)> typename ::x10::lang::Fun_0_0<x10_boolean>::template itable <x10_lang_ResilientStorePlace0__closure__4<TPMGL(K),TPMGL(V) > >x10_lang_ResilientStorePlace0__closure__4<TPMGL(K),TPMGL(V) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_ResilientStorePlace0__closure__4<TPMGL(K),TPMGL(V) >::__apply, &x10_lang_ResilientStorePlace0__closure__4<TPMGL(K),TPMGL(V) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(K), class TPMGL(V)> ::x10aux::itable_entry x10_lang_ResilientStorePlace0__closure__4<TPMGL(K),TPMGL(V) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_boolean> >, &x10_lang_ResilientStorePlace0__closure__4<TPMGL(K),TPMGL(V) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(K), class TPMGL(V)> const ::x10aux::serialization_id_t x10_lang_ResilientStorePlace0__closure__4<TPMGL(K),TPMGL(V) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_ResilientStorePlace0__closure__4<TPMGL(K),TPMGL(V) >::_deserialize);

#endif // X10_LANG_RESILIENTSTOREPLACE0__CLOSURE__4_CLOSURE
#ifndef X10_LANG_RESILIENTSTOREPLACE0__CLOSURE__5_CLOSURE
#define X10_LANG_RESILIENTSTOREPLACE0__CLOSURE__5_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(K), class TPMGL(V)> class x10_lang_ResilientStorePlace0__closure__5 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > >::template itable <x10_lang_ResilientStorePlace0__closure__5<TPMGL(K),TPMGL(V) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > __apply() {
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* me__103867 =
          (__extension__ ({
            ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* this__103868 =
              saved_this;
            ::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* >(::x10aux::nullCheck(this__103868)->FMGL(root));
        }))
        ;
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > gLatch__103869 =
          ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* >(::x10aux::class_cast_unchecked< ::x10::lang::ResilientStorePlace0__MyLatch*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        {
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            ::x10::lang::CheckedThrowable* throwable__103890 =
              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                {
                    ::x10::lang::Runtime::enterAtomic();
                    {
                        
                        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                        if (((::x10aux::nullCheck(me__103867)->FMGL(waitCount) =
                              ((::x10aux::nullCheck(me__103867)->FMGL(waitCount)) - (((x10_long)1ll)))) >= (((x10_long)0ll))))
                        {
                            gLatch__103869 = ::x10aux::nullCheck(::x10aux::nullCheck(me__103867)->FMGL(waitQueue))->remove();
                        }
                        
                    }
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc1504) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__103891 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1504);
                    {
                        throwable__103890 = formal__103891;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103890)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__103890))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103890));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::exitAtomic();
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103890)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__103890)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103890));
                }
                
            }
            
        }
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        return gLatch__103869;
        
    }
    
    // captured environment
    ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_ResilientStorePlace0__closure__5<TPMGL(K),TPMGL(V) >* storage = ::x10aux::alloc_z<x10_lang_ResilientStorePlace0__closure__5<TPMGL(K),TPMGL(V) > >();
        buf.record_reference(storage);
        ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* that_saved_this = buf.read< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>*>();
        x10_lang_ResilientStorePlace0__closure__5<TPMGL(K),TPMGL(V) >* this_ = new (storage) x10_lang_ResilientStorePlace0__closure__5<TPMGL(K),TPMGL(V) >(that_saved_this);
        return this_;
    }
    
    x10_lang_ResilientStorePlace0__closure__5(::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > > >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > > >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10:142-149";
    }

};

template<class TPMGL(K), class TPMGL(V)> typename ::x10::lang::Fun_0_0< ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > >::template itable <x10_lang_ResilientStorePlace0__closure__5<TPMGL(K),TPMGL(V) > >x10_lang_ResilientStorePlace0__closure__5<TPMGL(K),TPMGL(V) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_ResilientStorePlace0__closure__5<TPMGL(K),TPMGL(V) >::__apply, &x10_lang_ResilientStorePlace0__closure__5<TPMGL(K),TPMGL(V) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(K), class TPMGL(V)> ::x10aux::itable_entry x10_lang_ResilientStorePlace0__closure__5<TPMGL(K),TPMGL(V) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > > >, &x10_lang_ResilientStorePlace0__closure__5<TPMGL(K),TPMGL(V) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(K), class TPMGL(V)> const ::x10aux::serialization_id_t x10_lang_ResilientStorePlace0__closure__5<TPMGL(K),TPMGL(V) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_ResilientStorePlace0__closure__5<TPMGL(K),TPMGL(V) >::_deserialize);

#endif // X10_LANG_RESILIENTSTOREPLACE0__CLOSURE__5_CLOSURE
#ifndef X10_LANG_RESILIENTSTOREPLACE0__CLOSURE__6_CLOSURE
#define X10_LANG_RESILIENTSTOREPLACE0__CLOSURE__6_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(K), class TPMGL(V)> class x10_lang_ResilientStorePlace0__closure__6 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_ResilientStorePlace0__closure__6<TPMGL(K),TPMGL(V) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        if (((::x10::lang::ResilientStorePlace0<void, void>::FMGL(verbose__get)()) >= (((x10_long)3ll))))
        {
            
            //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            ::x10::lang::String* msg__103860 = ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125565 = ::x10aux::makeStringLit("unlock releasing gLatch="); strLit__125565; })), g);
            ::x10::lang::FinishResilient::debug(msg__103860);
        }
        
        //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        ::x10aux::nullCheck(::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::ResilientStorePlace0__MyLatch* >(g))->release();
        
        //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        if (((::x10::lang::ResilientStorePlace0<void, void>::FMGL(verbose__get)()) >= (((x10_long)3ll))))
        {
            
            //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            ::x10::lang::String* msg__103861 = ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125566 = ::x10aux::makeStringLit("unlock released gLatch="); strLit__125566; })), g);
            ::x10::lang::FinishResilient::debug(msg__103861);
        }
        
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > g;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->g);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_ResilientStorePlace0__closure__6<TPMGL(K),TPMGL(V) >* storage = ::x10aux::alloc_z<x10_lang_ResilientStorePlace0__closure__6<TPMGL(K),TPMGL(V) > >();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > that_g = buf.read< ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > >();
        x10_lang_ResilientStorePlace0__closure__6<TPMGL(K),TPMGL(V) >* this_ = new (storage) x10_lang_ResilientStorePlace0__closure__6<TPMGL(K),TPMGL(V) >(that_g);
        return this_;
    }
    
    x10_lang_ResilientStorePlace0__closure__6(::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > g) : g(g) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10:154-158";
    }

};

template<class TPMGL(K), class TPMGL(V)> typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_ResilientStorePlace0__closure__6<TPMGL(K),TPMGL(V) > >x10_lang_ResilientStorePlace0__closure__6<TPMGL(K),TPMGL(V) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_ResilientStorePlace0__closure__6<TPMGL(K),TPMGL(V) >::__apply, &x10_lang_ResilientStorePlace0__closure__6<TPMGL(K),TPMGL(V) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(K), class TPMGL(V)> ::x10aux::itable_entry x10_lang_ResilientStorePlace0__closure__6<TPMGL(K),TPMGL(V) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_ResilientStorePlace0__closure__6<TPMGL(K),TPMGL(V) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(K), class TPMGL(V)> const ::x10aux::serialization_id_t x10_lang_ResilientStorePlace0__closure__6<TPMGL(K),TPMGL(V) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_ResilientStorePlace0__closure__6<TPMGL(K),TPMGL(V) >::_deserialize);

#endif // X10_LANG_RESILIENTSTOREPLACE0__CLOSURE__6_CLOSURE
#ifndef X10_LANG_RESILIENTSTOREPLACE0__CLOSURE__7_CLOSURE
#define X10_LANG_RESILIENTSTOREPLACE0__CLOSURE__7_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(K), class TPMGL(V)> class x10_lang_ResilientStorePlace0__closure__7 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>*>::template itable <x10_lang_ResilientStorePlace0__closure__7<TPMGL(K),TPMGL(V) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* __apply() {
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* rs__103826;
        {
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            ::x10::lang::CheckedThrowable* throwable__103870 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                {
                    ::x10::lang::Runtime::enterAtomic();
                    {
                        
                        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                        rs__103826 = (::x10aux::class_cast< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>*>(::x10aux::nullCheck(::x10::lang::ResilientStorePlace0<void, void>::FMGL(ALL__get)())->getOrElse(
                                                                                                                      name,
                                                                                                                      ::x10aux::class_cast_unchecked< ::x10::lang::Any*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))));
                        
                        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                        if ((::x10aux::struct_equals(rs__103826,
                                                     reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
                        {
                            
                            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                            rs__103826 = (__extension__ ({
                                ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* alloc__103827 =
                                   (new (::x10aux::alloc_z< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)> >()) ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>());
                                (alloc__103827)->::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>::_constructor();
                                alloc__103827;
                            }))
                            ;
                            
                            //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
                            ::x10aux::nullCheck(::x10::lang::ResilientStorePlace0<void, void>::FMGL(ALL__get)())->put(
                              name, reinterpret_cast< ::x10::lang::Any*>(rs__103826));
                        }
                        
                    }
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc1509) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__103871 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1509);
                    {
                        throwable__103870 = formal__103871;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103870)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__103870))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103870));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::exitAtomic();
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103870)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__103870)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103870));
                }
                
            }
            
        }
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        return rs__103826;
        
    }
    
    // captured environment
    ::x10::lang::Any* name;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->name);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_ResilientStorePlace0__closure__7<TPMGL(K),TPMGL(V) >* storage = ::x10aux::alloc_z<x10_lang_ResilientStorePlace0__closure__7<TPMGL(K),TPMGL(V) > >();
        buf.record_reference(storage);
        ::x10::lang::Any* that_name = buf.read< ::x10::lang::Any*>();
        x10_lang_ResilientStorePlace0__closure__7<TPMGL(K),TPMGL(V) >* this_ = new (storage) x10_lang_ResilientStorePlace0__closure__7<TPMGL(K),TPMGL(V) >(that_name);
        return this_;
    }
    
    x10_lang_ResilientStorePlace0__closure__7(::x10::lang::Any* name) : name(name) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10:36-46";
    }

};

template<class TPMGL(K), class TPMGL(V)> typename ::x10::lang::Fun_0_0< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>*>::template itable <x10_lang_ResilientStorePlace0__closure__7<TPMGL(K),TPMGL(V) > >x10_lang_ResilientStorePlace0__closure__7<TPMGL(K),TPMGL(V) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_ResilientStorePlace0__closure__7<TPMGL(K),TPMGL(V) >::__apply, &x10_lang_ResilientStorePlace0__closure__7<TPMGL(K),TPMGL(V) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(K), class TPMGL(V)> ::x10aux::itable_entry x10_lang_ResilientStorePlace0__closure__7<TPMGL(K),TPMGL(V) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>*> >, &x10_lang_ResilientStorePlace0__closure__7<TPMGL(K),TPMGL(V) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(K), class TPMGL(V)> const ::x10aux::serialization_id_t x10_lang_ResilientStorePlace0__closure__7<TPMGL(K),TPMGL(V) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_ResilientStorePlace0__closure__7<TPMGL(K),TPMGL(V) >::_deserialize);

#endif // X10_LANG_RESILIENTSTOREPLACE0__CLOSURE__7_CLOSURE
#ifndef X10_LANG_RESILIENTSTOREPLACE0__CLOSURE__8_CLOSURE
#define X10_LANG_RESILIENTSTOREPLACE0__CLOSURE__8_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_ResilientStorePlace0__closure__8 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_ResilientStorePlace0__closure__8> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        {
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
            ::x10::lang::CheckedThrowable* throwable__103873 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                {
                    ::x10::lang::Runtime::enterAtomic();
                    {
                        ::x10aux::nullCheck(::x10::lang::ResilientStorePlace0<void, void>::FMGL(ALL__get)())->remove(
                          name);
                    }
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc1510) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__103874 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1510);
                    {
                        throwable__103873 = formal__103874;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103873)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__103873))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103873));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::exitAtomic();
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103873)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__103873)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103873));
                }
                
            }
            
        }
    }
    
    // captured environment
    ::x10::lang::Any* name;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->name);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_ResilientStorePlace0__closure__8* storage = ::x10aux::alloc_z<x10_lang_ResilientStorePlace0__closure__8>();
        buf.record_reference(storage);
        ::x10::lang::Any* that_name = buf.read< ::x10::lang::Any*>();
        x10_lang_ResilientStorePlace0__closure__8* this_ = new (storage) x10_lang_ResilientStorePlace0__closure__8(that_name);
        return this_;
    }
    
    x10_lang_ResilientStorePlace0__closure__8(::x10::lang::Any* name) : name(name) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10:54";
    }

};

#endif // X10_LANG_RESILIENTSTOREPLACE0__CLOSURE__8_CLOSURE

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"

//#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"

//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"

//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
template<class TPMGL(K), class TPMGL(V)> ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>*
  x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>::getMe() {
    return ::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* >(this->FMGL(root));
    
}

//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
template<class TPMGL(K), class TPMGL(V)> void x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>::_constructor(
                                           ) {
    ::x10::lang::ResilientStore<TPMGL(K), TPMGL(V)>* this__103819 =
      this;
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    this->x10::lang::template ResilientStorePlace0<TPMGL(K), TPMGL(V)>::__fieldInitializers_x10_lang_ResilientStorePlace0();
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    #ifndef NO_ASSERTIONS
    if (::x10aux::x10__assertions_enabled)
        ::x10aux::x10__assert((::x10aux::struct_equals(::x10::lang::Place::_make(::x10aux::here)->FMGL(id),
                                                       ((x10_long)0ll))));
    #endif//NO_ASSERTIONS
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    this->FMGL(root) = ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* >(this);
}
template<class TPMGL(K), class TPMGL(V)> ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>::_make(
                                           ) {
    ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* this_ = new (::x10aux::alloc_z< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)> >()) ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>();
    this_->_constructor();
    return this_;
}



//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"

//#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"

//#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"

//#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
template<class TPMGL(K), class TPMGL(V)> void x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>::create(
  TPMGL(K) key, TPMGL(V) value) {
    this->put(key, value);
}

//#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
template<class TPMGL(K), class TPMGL(V)> void x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>::put(
  TPMGL(K) key, TPMGL(V) value) {
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    if (((::x10::lang::ResilientStorePlace0<void, void>::FMGL(verbose__get)()) >= (((x10_long)3ll))))
    {
        
        //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        ::x10::lang::String* msg__103832 = ::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125544 = ::x10aux::makeStringLit("put called, key="); strLit__125544; })), key), (__extension__ ({ static ::x10::lang::String* strLit__125545 = ::x10aux::makeStringLit(" value="); strLit__125545; }))), value);
        ::x10::lang::FinishResilient::debug(msg__103832);
    }
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    ::x10::lang::Place dst__103834 = ::x10::lang::Place::place((this->FMGL(root))->location);
    ::x10::lang::FinishResilient::lowLevelAt(dst__103834,
                                             reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_ResilientStorePlace0__closure__1<TPMGL(K),TPMGL(V)>)))x10_lang_ResilientStorePlace0__closure__1<TPMGL(K),TPMGL(V)>(this, key, value))));
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    if (((::x10::lang::ResilientStorePlace0<void, void>::FMGL(verbose__get)()) >= (((x10_long)3ll))))
    {
        
        //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        ::x10::lang::String* msg__103833 = (__extension__ ({ static ::x10::lang::String* strLit__125548 = ::x10aux::makeStringLit("put returning"); strLit__125548; }));
        ::x10::lang::FinishResilient::debug(msg__103833);
    }
    
}

//#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
template<class TPMGL(K), class TPMGL(V)> TPMGL(V) x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>::getOrElse(
  TPMGL(K) key, TPMGL(V) orelse) {
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    if (((::x10::lang::ResilientStorePlace0<void, void>::FMGL(verbose__get)()) >= (((x10_long)3ll))))
    {
        
        //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        ::x10::lang::String* msg__103836 = ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125551 = ::x10aux::makeStringLit("getOrElse called, key="); strLit__125551; })), key);
        ::x10::lang::FinishResilient::debug(msg__103836);
    }
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    ::x10::lang::Cell<TPMGL(V)>* result =  (new (::x10aux::alloc_z< ::x10::lang::Cell<TPMGL(V)> >()) ::x10::lang::Cell<TPMGL(V)>());
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    TPMGL(V) x__103838 = orelse;
    result->FMGL(value) = x__103838;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    ::x10::lang::Place dst__103839 = ::x10::lang::Place::place((this->FMGL(root))->location);
    ::x10::lang::Cell<TPMGL(V)>* result__103840 = result;
    ::x10::lang::FinishResilient::template lowLevelFetch< TPMGL(V) >(
      dst__103839, result__103840, reinterpret_cast< ::x10::lang::Fun_0_0<TPMGL(V)>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0<TPMGL(V)> >(sizeof(x10_lang_ResilientStorePlace0__closure__2<TPMGL(K),TPMGL(V)>)))x10_lang_ResilientStorePlace0__closure__2<TPMGL(K),TPMGL(V)>(this, key, orelse))));
    
    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    TPMGL(V) r = result->FMGL(value);
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    if (((::x10::lang::ResilientStorePlace0<void, void>::FMGL(verbose__get)()) >= (((x10_long)3ll))))
    {
        
        //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        ::x10::lang::String* msg__103837 = ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125554 = ::x10aux::makeStringLit("getOrElse returning, result="); strLit__125554; })), r);
        ::x10::lang::FinishResilient::debug(msg__103837);
    }
    
    //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    return r;
    
}

//#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
template<class TPMGL(K), class TPMGL(V)> void x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>::remove(
  TPMGL(K) key) {
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    ::x10::lang::Place dst__103843 = ::x10::lang::Place::place((this->FMGL(root))->location);
    ::x10::lang::FinishResilient::lowLevelAt(dst__103843,
                                             reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_ResilientStorePlace0__closure__3<TPMGL(K),TPMGL(V)>)))x10_lang_ResilientStorePlace0__closure__3<TPMGL(K),TPMGL(V)>(this, key))));
}

//#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"

//#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"

//#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
template<class TPMGL(K), class TPMGL(V)> void x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>::lock(
  ) {
    
    //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    if (((::x10::lang::ResilientStorePlace0<void, void>::FMGL(verbose__get)()) >= (((x10_long)3ll))))
    {
        
        //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        ::x10::lang::String* msg__103849 = (__extension__ ({ static ::x10::lang::String* strLit__125558 = ::x10aux::makeStringLit("lock called"); strLit__125558; }));
        ::x10::lang::FinishResilient::debug(msg__103849);
    }
    
    //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    ::x10::lang::ResilientStorePlace0__MyLatch* latch = ::x10::lang::ResilientStorePlace0__MyLatch::_make();
    ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > gLatch =
      ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* >(latch);
    
    //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    ::x10::lang::Cell<x10_boolean>* needWait =  (new (::x10aux::alloc_z< ::x10::lang::Cell<x10_boolean> >()) ::x10::lang::Cell<x10_boolean>());
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    needWait->FMGL(value) = false;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    ::x10::lang::Place dst__103854 = ::x10::lang::Place::place((this->FMGL(root))->location);
    ::x10::lang::Cell<x10_boolean>* result__103855 = needWait;
    ::x10::lang::FinishResilient::template lowLevelFetch< x10_boolean >(
      dst__103854, result__103855, reinterpret_cast< ::x10::lang::Fun_0_0<x10_boolean>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0<x10_boolean> >(sizeof(x10_lang_ResilientStorePlace0__closure__4<TPMGL(K),TPMGL(V)>)))x10_lang_ResilientStorePlace0__closure__4<TPMGL(K),TPMGL(V)>(this, gLatch))));
    
    //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    if (needWait->FMGL(value)) {
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        if (((::x10::lang::ResilientStorePlace0<void, void>::FMGL(verbose__get)()) >= (((x10_long)3ll))))
        {
            
            //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            ::x10::lang::String* msg__103850 = ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125559 = ::x10aux::makeStringLit("lock waiting gLatch="); strLit__125559; })), gLatch);
            ::x10::lang::FinishResilient::debug(msg__103850);
        }
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        latch->await();
        
        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        if (((::x10::lang::ResilientStorePlace0<void, void>::FMGL(verbose__get)()) >= (((x10_long)2ll))))
        {
            
            //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            ::x10::lang::String* msg__103851 = ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125560 = ::x10aux::makeStringLit("lock waited gLatch="); strLit__125560; })), gLatch);
            ::x10::lang::FinishResilient::debug(msg__103851);
        }
        
    } else 
    //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    if (((::x10::lang::ResilientStorePlace0<void, void>::FMGL(verbose__get)()) >= (((x10_long)3ll))))
    {
        
        //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        ::x10::lang::String* msg__103852 = (__extension__ ({ static ::x10::lang::String* strLit__125561 = ::x10aux::makeStringLit("lock need not wait"); strLit__125561; }));
        ::x10::lang::FinishResilient::debug(msg__103852);
    }
    
    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    if (((::x10::lang::ResilientStorePlace0<void, void>::FMGL(verbose__get)()) >= (((x10_long)3ll))))
    {
        
        //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        ::x10::lang::String* msg__103853 = (__extension__ ({ static ::x10::lang::String* strLit__125562 = ::x10aux::makeStringLit("lock returning (locked)"); strLit__125562; }));
        ::x10::lang::FinishResilient::debug(msg__103853);
    }
    
}

//#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
template<class TPMGL(K), class TPMGL(V)> void x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>::unlock(
  ) {
    
    //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    if (((::x10::lang::ResilientStorePlace0<void, void>::FMGL(verbose__get)()) >= (((x10_long)3ll))))
    {
        
        //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        ::x10::lang::String* msg__103858 = (__extension__ ({ static ::x10::lang::String* strLit__125563 = ::x10aux::makeStringLit("unlock called"); strLit__125563; }));
        ::x10::lang::FinishResilient::debug(msg__103858);
    }
    
    //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    ::x10::lang::Cell< ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > >* toRelease =
       (new (::x10aux::alloc_z< ::x10::lang::Cell< ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > > >()) ::x10::lang::Cell< ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > >());
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > x__103864 =
      ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* >(::x10aux::class_cast_unchecked< ::x10::lang::ResilientStorePlace0__MyLatch*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    toRelease->FMGL(value) = x__103864;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    ::x10::lang::Place dst__103865 = ::x10::lang::Place::place((this->FMGL(root))->location);
    ::x10::lang::Cell< ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > >* result__103866 =
      toRelease;
    ::x10::lang::FinishResilient::template lowLevelFetch< ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > >(
      dst__103865, result__103866, reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > >*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > > >(sizeof(x10_lang_ResilientStorePlace0__closure__5<TPMGL(K),TPMGL(V)>)))x10_lang_ResilientStorePlace0__closure__5<TPMGL(K),TPMGL(V)>(this))));
    
    //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > gLatch =
      toRelease->FMGL(value);
    
    //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    if (!((gLatch)->isNull())) {
        
        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        if (((::x10::lang::ResilientStorePlace0<void, void>::FMGL(verbose__get)()) >= (((x10_long)3ll))))
        {
            
            //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
            ::x10::lang::String* msg__103859 = ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125564 = ::x10aux::makeStringLit("unlock need to release gLatch="); strLit__125564; })), gLatch);
            ::x10::lang::FinishResilient::debug(msg__103859);
        }
        
        //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > g =
          gLatch;
        
        //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        ::x10::lang::Place dst__103862 = ::x10::lang::Place::place((g)->location);
        ::x10::lang::FinishResilient::lowLevelSend(dst__103862,
                                                   reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_ResilientStorePlace0__closure__6<TPMGL(K),TPMGL(V)>)))x10_lang_ResilientStorePlace0__closure__6<TPMGL(K),TPMGL(V)>(g))));
    }
    
    //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    if (((::x10::lang::ResilientStorePlace0<void, void>::FMGL(verbose__get)()) >= (((x10_long)3ll))))
    {
        
        //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        ::x10::lang::String* msg__103863 = (__extension__ ({ static ::x10::lang::String* strLit__125567 = ::x10aux::makeStringLit("unlock returning (unlocked)"); strLit__125567; }));
        ::x10::lang::FinishResilient::debug(msg__103863);
    }
    
}

//#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
template<class TPMGL(K), class TPMGL(V)> ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>*
  x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>::x10__lang__ResilientStorePlace0____this__x10__lang__ResilientStorePlace0(
  ) {
    return this;
    
}
template<class TPMGL(K), class TPMGL(V)> void x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>::__fieldInitializers_x10_lang_ResilientStorePlace0(
  ) {
    this->FMGL(hm) = (__extension__ ({
        
        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        ::x10::util::HashMap<TPMGL(K), TPMGL(V)>* alloc__103702 =
           (new (::x10aux::alloc_z< ::x10::util::HashMap<TPMGL(K), TPMGL(V)> >()) ::x10::util::HashMap<TPMGL(K), TPMGL(V)>());
        (alloc__103702)->::x10::util::HashMap<TPMGL(K), TPMGL(V)>::_constructor();
        alloc__103702;
    }))
    ;
    this->FMGL(waitQueue) = (__extension__ ({
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        ::x10::lang::ResilientStorePlace0__MyQueue< ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > >* alloc__103703 =
           (new (::x10aux::alloc_z< ::x10::lang::ResilientStorePlace0__MyQueue< ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > > >()) ::x10::lang::ResilientStorePlace0__MyQueue< ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > >());
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        alloc__103703->FMGL(head) = (::x10aux::class_cast_unchecked< ::x10::lang::ResilientStorePlace0__MyQueue__Entry< ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        alloc__103703->FMGL(tail) = (::x10aux::class_cast_unchecked< ::x10::lang::ResilientStorePlace0__MyQueue__Entry< ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0__MyLatch* > >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        alloc__103703;
    }))
    ;
    this->FMGL(waitCount) = ((x10_long)-1ll);
}
template<class TPMGL(K), class TPMGL(V)> const ::x10aux::serialization_id_t x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>::_deserializer);

template<class TPMGL(K), class TPMGL(V)> void x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::ResilientStore<TPMGL(K), TPMGL(V)>::_serialize_body(buf);
    buf.write(this->FMGL(root));
    
}

template<class TPMGL(K), class TPMGL(V)> ::x10::lang::Reference* ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* this_ = new (::x10aux::alloc_z< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)> >()) ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

template<class TPMGL(K), class TPMGL(V)> void x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::ResilientStore<TPMGL(K), TPMGL(V)>::_deserialize_body(buf);
    FMGL(root) = buf.read< ::x10::lang::GlobalRef< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* > >();
    
}

template<class TPMGL(T)> x10_boolean x10::lang::ResilientStorePlace0<void, void>::lowLevelFetch(::x10::lang::Place dst,
                                                                                                ::x10::lang::Cell<TPMGL(T)>* result,
                                                                                                ::x10::lang::Fun_0_0<TPMGL(T)>* cl) {
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    return ::x10::lang::FinishResilient::template lowLevelFetch< TPMGL(T) >(
             dst, result, cl);
    
}
template<class TPMGL(K), class TPMGL(V)> ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>*
  x10::lang::ResilientStorePlace0<void, void>::make(::x10::lang::Any* name) {
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    if (((::x10::lang::ResilientStorePlace0<void, void>::FMGL(verbose__get)()) >= (((x10_long)3ll))))
    {
        
        //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        ::x10::lang::String* msg__103820 = ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125568 = ::x10aux::makeStringLit("make called, name="); strLit__125568; })), name);
        ::x10::lang::FinishResilient::debug(msg__103820);
    }
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    ::x10::lang::Cell< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>*>* result =
       (new (::x10aux::alloc_z< ::x10::lang::Cell< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>*> >()) ::x10::lang::Cell< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>*>());
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* x__103822 =
      ::x10aux::class_cast_unchecked< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
    result->FMGL(value) = (reinterpret_cast< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>*>(reinterpret_cast< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>*>(X10_NULL)));
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    ::x10::lang::Place dst__103823 = (__extension__ ({
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        ::x10::lang::Place alloc__103824 =  ::x10::lang::Place::_alloc();
        (alloc__103824)->::x10::lang::Place::_constructor(
          ((x10_long)0ll));
        alloc__103824;
    }))
    ;
    ::x10::lang::Cell< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>*>* result__103825 =
      result;
    ::x10::lang::FinishResilient::template lowLevelFetch< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* >(
      dst__103823, result__103825, reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>*> >(sizeof(x10_lang_ResilientStorePlace0__closure__7<TPMGL(K),TPMGL(V)>)))x10_lang_ResilientStorePlace0__closure__7<TPMGL(K),TPMGL(V)>(name))));
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    ::x10::lang::ResilientStorePlace0<TPMGL(K), TPMGL(V)>* r =
      result->FMGL(value);
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    if (((::x10::lang::ResilientStorePlace0<void, void>::FMGL(verbose__get)()) >= (((x10_long)3ll))))
    {
        
        //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        ::x10::lang::String* msg__103821 = ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125573 = ::x10aux::makeStringLit("make returning result="); strLit__125573; })), r);
        ::x10::lang::FinishResilient::debug(msg__103821);
    }
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    return r;
    
}
#endif // X10_LANG_RESILIENTSTOREPLACE0_H_IMPLEMENTATION
#endif // __X10_LANG_RESILIENTSTOREPLACE0_H_NODEPS
