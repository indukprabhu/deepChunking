#ifndef __X10_LANG_PLACELOCALHANDLE_H
#define __X10_LANG_PLACELOCALHANDLE_H

#include <x10rt.h>


#define X10_LANG_ANY_H_NODEPS
#include <x10/lang/Any.h>
#undef X10_LANG_ANY_H_NODEPS
#define X10_LANG_PLACELOCALHANDLE_IMPL_H_NODEPS
#include <x10/lang/PlaceLocalHandle_Impl.h>
#undef X10_LANG_PLACELOCALHANDLE_IMPL_H_NODEPS
#define X10_LANG_PLACELOCALHANDLE_IMPL_H_NODEPS
#include <x10/lang/PlaceLocalHandle_Impl.h>
#undef X10_LANG_PLACELOCALHANDLE_IMPL_H_NODEPS
#define X10_LANG_PLACELOCALHANDLE_IMPL_H_NODEPS
#include <x10/lang/PlaceLocalHandle_Impl.h>
#undef X10_LANG_PLACELOCALHANDLE_IMPL_H_NODEPS
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace lang { 
class PlaceGroup;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(U)> class Fun_0_0;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace lang { 
class Runtime__Profile;
} } 
namespace x10 { namespace lang { 
class FinishState;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Iterator;
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
template<class TPMGL(Z1), class TPMGL(U)> class Fun_0_1;
} } 
namespace x10 { namespace compiler { 
class Pragma;
} } 
namespace x10 { namespace compiler { 
class Native;
} } 
namespace x10 { namespace compiler { 
class NonEscaping;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace compiler { 
class NativeClass;
} } 
namespace x10 { namespace lang { 

template<class TPMGL(T)> class PlaceLocalHandle   {
    public:
    RTT_H_DECLS_STRUCT
    
    ::x10::lang::PlaceLocalHandle<TPMGL(T)>* operator->() { return this; }
    
    static ::x10aux::itable_entry _itables[2];
    
    ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static ::x10::lang::Any::itable< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > _itable_0;
    
    static ::x10aux::itable_entry _iboxitables[2];
    
    ::x10aux::itable_entry* _getIBoxITables() { return _iboxitables; }
    
    static ::x10::lang::PlaceLocalHandle<TPMGL(T)> _alloc(){::x10::lang::PlaceLocalHandle<TPMGL(T)> t; return t; }
    
    ::x10::lang::PlaceLocalHandle_Impl<TPMGL(T)> FMGL(__NATIVE_FIELD__);
    
    void _constructor(::x10::lang::PlaceLocalHandle_Impl<TPMGL(T)> id0);
    
    static ::x10::lang::PlaceLocalHandle<TPMGL(T)> _make(::x10::lang::PlaceLocalHandle_Impl<TPMGL(T)> id0);
    
    void _constructor();
    
    static ::x10::lang::PlaceLocalHandle<TPMGL(T)> _make();
    
    TPMGL(T) __apply();
    void set(TPMGL(T) newVal);
    x10_int hashCode();
    ::x10::lang::String* toString();
    ::x10::lang::String* typeName();
    x10_boolean equals(::x10::lang::Any* other);
    x10_boolean equals(::x10::lang::PlaceLocalHandle<TPMGL(T)> other);
    x10_boolean _struct_equals(::x10::lang::Any* other);
    x10_boolean _struct_equals(::x10::lang::PlaceLocalHandle<TPMGL(T)> other);
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> x10__lang__PlaceLocalHandle____this__x10__lang__PlaceLocalHandle(
      );
    void __fieldInitializers_x10_lang_PlaceLocalHandle();
    
    static void _serialize(::x10::lang::PlaceLocalHandle<TPMGL(T)> this_, ::x10aux::serialization_buffer& buf);
    
    static ::x10::lang::PlaceLocalHandle<TPMGL(T)> _deserialize(::x10aux::deserialization_buffer& buf) {
        ::x10::lang::PlaceLocalHandle<TPMGL(T)> this_;
        this_->_deserialize_body(buf);
        return this_;
    }
    
    void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

template<class TPMGL(T)> ::x10aux::RuntimeType x10::lang::PlaceLocalHandle<TPMGL(T)>::rtt;
template<class TPMGL(T)> void x10::lang::PlaceLocalHandle<TPMGL(T)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::lang::PlaceLocalHandle<void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Any>()};
    const ::x10aux::RuntimeType* params[1] = { ::x10aux::getRTT<TPMGL(T)>()};
    ::x10aux::RuntimeType::Variance variances[1] = { ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.lang.PlaceLocalHandle";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::struct_kind, 1, parents, 1, params, variances);
}

template <> class PlaceLocalHandle<void> {
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    template<class TPMGL(T)> static ::x10::lang::PlaceLocalHandle<TPMGL(T)>
      make(::x10::lang::PlaceGroup* pg, ::x10::lang::Fun_0_0<TPMGL(T)>* init);
    
    template<class TPMGL(T)> static ::x10::lang::PlaceLocalHandle<TPMGL(T)>
      make(::x10::lang::PlaceGroup* pg, ::x10::lang::Fun_0_0<TPMGL(T)>* init,
           ::x10::lang::Fun_0_1< ::x10::lang::Place, x10_boolean>* ignoreIfDead);
    
    template<class TPMGL(T), class TPMGL(U)> static ::x10::lang::PlaceLocalHandle<TPMGL(T)>
      make(::x10::lang::PlaceGroup* pg, ::x10::lang::Fun_0_1< ::x10::lang::Place, TPMGL(U)>* init_here,
           ::x10::lang::Fun_0_1<TPMGL(U), TPMGL(T)>* init_there);
    
    template<class TPMGL(T), class TPMGL(U)> static ::x10::lang::PlaceLocalHandle<TPMGL(T)>
      make(::x10::lang::PlaceGroup* pg, ::x10::lang::Fun_0_1< ::x10::lang::Place, TPMGL(U)>* init_here,
           ::x10::lang::Fun_0_1<TPMGL(U), TPMGL(T)>* init_there,
           ::x10::lang::Fun_0_1< ::x10::lang::Place, x10_boolean>* ignoreIfDead);
    
    template<class TPMGL(T)> static ::x10::lang::PlaceLocalHandle<TPMGL(T)>
      makeFlat(::x10::lang::PlaceGroup* pg, ::x10::lang::Fun_0_0<TPMGL(T)>* init);
    
    template<class TPMGL(T)> static ::x10::lang::PlaceLocalHandle<TPMGL(T)>
      makeFlat(::x10::lang::PlaceGroup* pg, ::x10::lang::Fun_0_0<TPMGL(T)>* init,
               ::x10::lang::Fun_0_1< ::x10::lang::Place, x10_boolean>* ignoreIfDead);
    
    template<class TPMGL(T), class TPMGL(U)> static ::x10::lang::PlaceLocalHandle<TPMGL(T)>
      makeFlat(::x10::lang::PlaceGroup* pg, ::x10::lang::Fun_0_1< ::x10::lang::Place, TPMGL(U)>* init_here,
               ::x10::lang::Fun_0_1<TPMGL(U), TPMGL(T)>* init_there);
    
    template<class TPMGL(T), class TPMGL(U)> static ::x10::lang::PlaceLocalHandle<TPMGL(T)>
      makeFlat(::x10::lang::PlaceGroup* pg, ::x10::lang::Fun_0_1< ::x10::lang::Place, TPMGL(U)>* init_here,
               ::x10::lang::Fun_0_1<TPMGL(U), TPMGL(T)>* init_there,
               ::x10::lang::Fun_0_1< ::x10::lang::Place, x10_boolean>* ignoreIfDead);
    
    template<class TPMGL(T)> static void destroy(::x10::lang::PlaceGroup* pg,
                                                 ::x10::lang::PlaceLocalHandle<TPMGL(T)> plh);
    
    template<class TPMGL(T)> static void destroy(::x10::lang::PlaceGroup* pg,
                                                 ::x10::lang::PlaceLocalHandle<TPMGL(T)> plh,
                                                 ::x10::lang::Fun_0_1< ::x10::lang::Place, x10_boolean>* ignoreIfDead);
    
    
};

} } 
#endif // X10_LANG_PLACELOCALHANDLE_H

namespace x10 { namespace lang { 
template<class TPMGL(T)> class PlaceLocalHandle;
} } 

#ifndef X10_LANG_PLACELOCALHANDLE_H_NODEPS
#define X10_LANG_PLACELOCALHANDLE_H_NODEPS
#include <x10/lang/Any.h>
#include <x10/lang/PlaceLocalHandle_Impl.h>
#include <x10/lang/Int.h>
#include <x10/lang/String.h>
#include <x10/lang/PlaceGroup.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Place.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/lang/FinishState.h>
#include <x10/lang/Iterator.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Error.h>
#include <x10/lang/Exception.h>
#include <x10/compiler/AsyncClosure.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/compiler/Pragma.h>
#include <x10/compiler/Native.h>
#include <x10/compiler/NonEscaping.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeClass.h>
#ifndef X10_LANG_PLACELOCALHANDLE_H_GENERICS
#define X10_LANG_PLACELOCALHANDLE_H_GENERICS
#endif // X10_LANG_PLACELOCALHANDLE_H_GENERICS
#ifndef X10_LANG_PLACELOCALHANDLE_H_IMPLEMENTATION
#define X10_LANG_PLACELOCALHANDLE_H_IMPLEMENTATION
#include <x10/lang/PlaceLocalHandle.h>

#ifndef X10_LANG_PLACELOCALHANDLE__CLOSURE__1_CLOSURE
#define X10_LANG_PLACELOCALHANDLE__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T)> class x10_lang_PlaceLocalHandle__closure__1 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >::template itable <x10_lang_PlaceLocalHandle__closure__1<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> __apply() {
        try {
            return ::x10::lang::PlaceLocalHandle<TPMGL(T)>::_make();
            
        }
        catch (::x10::lang::CheckedThrowable* __exc1330) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc1330);
                {
                    ::x10::lang::PlaceLocalHandle<TPMGL(T)> __lowerer__var__1__ =
                      ::x10aux::class_cast_unchecked< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >(::x10::lang::Runtime::wrapAtChecked< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >(
                                                                                                  __lowerer__var__0__));
                    return __lowerer__var__1__;
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_PlaceLocalHandle__closure__1<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_lang_PlaceLocalHandle__closure__1<TPMGL(T) > >();
        buf.record_reference(storage);
        x10_lang_PlaceLocalHandle__closure__1<TPMGL(T) >* this_ = new (storage) x10_lang_PlaceLocalHandle__closure__1<TPMGL(T) >();
        return this_;
    }
    
    x10_lang_PlaceLocalHandle__closure__1() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10:64";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >::template itable <x10_lang_PlaceLocalHandle__closure__1<TPMGL(T) > >x10_lang_PlaceLocalHandle__closure__1<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_PlaceLocalHandle__closure__1<TPMGL(T) >::__apply, &x10_lang_PlaceLocalHandle__closure__1<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_lang_PlaceLocalHandle__closure__1<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >, &x10_lang_PlaceLocalHandle__closure__1<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_PlaceLocalHandle__closure__1<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_PlaceLocalHandle__closure__1<TPMGL(T) >::_deserialize);

#endif // X10_LANG_PLACELOCALHANDLE__CLOSURE__1_CLOSURE
#ifndef X10_LANG_PLACELOCALHANDLE__CLOSURE__2_CLOSURE
#define X10_LANG_PLACELOCALHANDLE__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_lang_PlaceLocalHandle__closure__2 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_PlaceLocalHandle__closure__2<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            handle->x10::lang::template PlaceLocalHandle<TPMGL(T)>::set(::x10::lang::Fun_0_0<TPMGL(T)>::__apply(::x10aux::nullCheck(init)));
        }
        catch (::x10::lang::CheckedThrowable* __exc1331) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc1331)) {
                ::x10::lang::Error* __lowerer__var__2__ = static_cast< ::x10::lang::Error*>(__exc1331);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__2__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__3__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc1331);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__3__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> handle;
    ::x10::lang::Fun_0_0<TPMGL(T)>* init;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->handle);
        buf.write(this->init);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_PlaceLocalHandle__closure__2<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_lang_PlaceLocalHandle__closure__2<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle<TPMGL(T)> that_handle = buf.read< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >();
        ::x10::lang::Fun_0_0<TPMGL(T)>* that_init = buf.read< ::x10::lang::Fun_0_0<TPMGL(T)>*>();
        x10_lang_PlaceLocalHandle__closure__2<TPMGL(T) >* this_ = new (storage) x10_lang_PlaceLocalHandle__closure__2<TPMGL(T) >(that_handle, that_init);
        return this_;
    }
    
    x10_lang_PlaceLocalHandle__closure__2(::x10::lang::PlaceLocalHandle<TPMGL(T)> handle, ::x10::lang::Fun_0_0<TPMGL(T)>* init) : handle(handle), init(init) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10:66";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_PlaceLocalHandle__closure__2<TPMGL(T) > >x10_lang_PlaceLocalHandle__closure__2<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_PlaceLocalHandle__closure__2<TPMGL(T) >::__apply, &x10_lang_PlaceLocalHandle__closure__2<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_lang_PlaceLocalHandle__closure__2<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_PlaceLocalHandle__closure__2<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_PlaceLocalHandle__closure__2<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_PlaceLocalHandle__closure__2<TPMGL(T) >::_deserialize);
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_PlaceLocalHandle__closure__2<TPMGL(T) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_PlaceLocalHandle__closure__2<TPMGL(T) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_LANG_PLACELOCALHANDLE__CLOSURE__2_CLOSURE
#ifndef X10_LANG_PLACELOCALHANDLE__CLOSURE__3_CLOSURE
#define X10_LANG_PLACELOCALHANDLE__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T)> class x10_lang_PlaceLocalHandle__closure__3 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >::template itable <x10_lang_PlaceLocalHandle__closure__3<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> __apply() {
        try {
            return ::x10::lang::PlaceLocalHandle<TPMGL(T)>::_make();
            
        }
        catch (::x10::lang::CheckedThrowable* __exc1334) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc1334);
                {
                    ::x10::lang::PlaceLocalHandle<TPMGL(T)> __lowerer__var__1__ =
                      ::x10aux::class_cast_unchecked< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >(::x10::lang::Runtime::wrapAtChecked< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >(
                                                                                                  __lowerer__var__0__));
                    return __lowerer__var__1__;
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_PlaceLocalHandle__closure__3<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_lang_PlaceLocalHandle__closure__3<TPMGL(T) > >();
        buf.record_reference(storage);
        x10_lang_PlaceLocalHandle__closure__3<TPMGL(T) >* this_ = new (storage) x10_lang_PlaceLocalHandle__closure__3<TPMGL(T) >();
        return this_;
    }
    
    x10_lang_PlaceLocalHandle__closure__3() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10:86";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >::template itable <x10_lang_PlaceLocalHandle__closure__3<TPMGL(T) > >x10_lang_PlaceLocalHandle__closure__3<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_PlaceLocalHandle__closure__3<TPMGL(T) >::__apply, &x10_lang_PlaceLocalHandle__closure__3<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_lang_PlaceLocalHandle__closure__3<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >, &x10_lang_PlaceLocalHandle__closure__3<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_PlaceLocalHandle__closure__3<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_PlaceLocalHandle__closure__3<TPMGL(T) >::_deserialize);

#endif // X10_LANG_PLACELOCALHANDLE__CLOSURE__3_CLOSURE
#ifndef X10_LANG_PLACELOCALHANDLE__CLOSURE__4_CLOSURE
#define X10_LANG_PLACELOCALHANDLE__CLOSURE__4_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_lang_PlaceLocalHandle__closure__4 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_PlaceLocalHandle__closure__4<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            handle->x10::lang::template PlaceLocalHandle<TPMGL(T)>::set(::x10::lang::Fun_0_0<TPMGL(T)>::__apply(::x10aux::nullCheck(init)));
        }
        catch (::x10::lang::CheckedThrowable* __exc1335) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc1335)) {
                ::x10::lang::Error* __lowerer__var__2__ = static_cast< ::x10::lang::Error*>(__exc1335);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__2__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__3__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc1335);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__3__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> handle;
    ::x10::lang::Fun_0_0<TPMGL(T)>* init;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->handle);
        buf.write(this->init);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_PlaceLocalHandle__closure__4<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_lang_PlaceLocalHandle__closure__4<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle<TPMGL(T)> that_handle = buf.read< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >();
        ::x10::lang::Fun_0_0<TPMGL(T)>* that_init = buf.read< ::x10::lang::Fun_0_0<TPMGL(T)>*>();
        x10_lang_PlaceLocalHandle__closure__4<TPMGL(T) >* this_ = new (storage) x10_lang_PlaceLocalHandle__closure__4<TPMGL(T) >(that_handle, that_init);
        return this_;
    }
    
    x10_lang_PlaceLocalHandle__closure__4(::x10::lang::PlaceLocalHandle<TPMGL(T)> handle, ::x10::lang::Fun_0_0<TPMGL(T)>* init) : handle(handle), init(init) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10:89";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_PlaceLocalHandle__closure__4<TPMGL(T) > >x10_lang_PlaceLocalHandle__closure__4<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_PlaceLocalHandle__closure__4<TPMGL(T) >::__apply, &x10_lang_PlaceLocalHandle__closure__4<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_lang_PlaceLocalHandle__closure__4<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_PlaceLocalHandle__closure__4<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_PlaceLocalHandle__closure__4<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_PlaceLocalHandle__closure__4<TPMGL(T) >::_deserialize);
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_PlaceLocalHandle__closure__4<TPMGL(T) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_PlaceLocalHandle__closure__4<TPMGL(T) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_LANG_PLACELOCALHANDLE__CLOSURE__4_CLOSURE
#ifndef X10_LANG_PLACELOCALHANDLE__CLOSURE__5_CLOSURE
#define X10_LANG_PLACELOCALHANDLE__CLOSURE__5_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T), class TPMGL(U)> class x10_lang_PlaceLocalHandle__closure__5 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >::template itable <x10_lang_PlaceLocalHandle__closure__5<TPMGL(T),TPMGL(U) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> __apply() {
        try {
            return ::x10::lang::PlaceLocalHandle<TPMGL(T)>::_make();
            
        }
        catch (::x10::lang::CheckedThrowable* __exc1338) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc1338);
                {
                    ::x10::lang::PlaceLocalHandle<TPMGL(T)> __lowerer__var__1__ =
                      ::x10aux::class_cast_unchecked< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >(::x10::lang::Runtime::wrapAtChecked< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >(
                                                                                                  __lowerer__var__0__));
                    return __lowerer__var__1__;
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_PlaceLocalHandle__closure__5<TPMGL(T),TPMGL(U) >* storage = ::x10aux::alloc_z<x10_lang_PlaceLocalHandle__closure__5<TPMGL(T),TPMGL(U) > >();
        buf.record_reference(storage);
        x10_lang_PlaceLocalHandle__closure__5<TPMGL(T),TPMGL(U) >* this_ = new (storage) x10_lang_PlaceLocalHandle__closure__5<TPMGL(T),TPMGL(U) >();
        return this_;
    }
    
    x10_lang_PlaceLocalHandle__closure__5() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10:110";
    }

};

template<class TPMGL(T), class TPMGL(U)> typename ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >::template itable <x10_lang_PlaceLocalHandle__closure__5<TPMGL(T),TPMGL(U) > >x10_lang_PlaceLocalHandle__closure__5<TPMGL(T),TPMGL(U) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_PlaceLocalHandle__closure__5<TPMGL(T),TPMGL(U) >::__apply, &x10_lang_PlaceLocalHandle__closure__5<TPMGL(T),TPMGL(U) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T), class TPMGL(U)> ::x10aux::itable_entry x10_lang_PlaceLocalHandle__closure__5<TPMGL(T),TPMGL(U) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >, &x10_lang_PlaceLocalHandle__closure__5<TPMGL(T),TPMGL(U) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T), class TPMGL(U)> const ::x10aux::serialization_id_t x10_lang_PlaceLocalHandle__closure__5<TPMGL(T),TPMGL(U) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_PlaceLocalHandle__closure__5<TPMGL(T),TPMGL(U) >::_deserialize);

#endif // X10_LANG_PLACELOCALHANDLE__CLOSURE__5_CLOSURE
#ifndef X10_LANG_PLACELOCALHANDLE__CLOSURE__6_CLOSURE
#define X10_LANG_PLACELOCALHANDLE__CLOSURE__6_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T), class TPMGL(U)> class x10_lang_PlaceLocalHandle__closure__6 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_PlaceLocalHandle__closure__6<TPMGL(T),TPMGL(U) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            handle->x10::lang::template PlaceLocalHandle<TPMGL(T)>::set(::x10::lang::Fun_0_1<TPMGL(U), TPMGL(T)>::__apply(::x10aux::nullCheck(init_there), 
                                                                          v));
        }
        catch (::x10::lang::CheckedThrowable* __exc1339) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc1339)) {
                ::x10::lang::Error* __lowerer__var__2__ = static_cast< ::x10::lang::Error*>(__exc1339);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__2__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__3__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1339);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__3__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> handle;
    ::x10::lang::Fun_0_1<TPMGL(U), TPMGL(T)>* init_there;
    TPMGL(U) v;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->handle);
        buf.write(this->init_there);
        buf.write(this->v);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_PlaceLocalHandle__closure__6<TPMGL(T),TPMGL(U) >* storage = ::x10aux::alloc_z<x10_lang_PlaceLocalHandle__closure__6<TPMGL(T),TPMGL(U) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle<TPMGL(T)> that_handle = buf.read< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >();
        ::x10::lang::Fun_0_1<TPMGL(U), TPMGL(T)>* that_init_there = buf.read< ::x10::lang::Fun_0_1<TPMGL(U), TPMGL(T)>*>();
        TPMGL(U) that_v = buf.read<TPMGL(U)>();
        x10_lang_PlaceLocalHandle__closure__6<TPMGL(T),TPMGL(U) >* this_ = new (storage) x10_lang_PlaceLocalHandle__closure__6<TPMGL(T),TPMGL(U) >(that_handle, that_init_there, that_v);
        return this_;
    }
    
    x10_lang_PlaceLocalHandle__closure__6(::x10::lang::PlaceLocalHandle<TPMGL(T)> handle, ::x10::lang::Fun_0_1<TPMGL(U), TPMGL(T)>* init_there, TPMGL(U) v) : handle(handle), init_there(init_there), v(v) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10:113";
    }

};

template<class TPMGL(T), class TPMGL(U)> typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_PlaceLocalHandle__closure__6<TPMGL(T),TPMGL(U) > >x10_lang_PlaceLocalHandle__closure__6<TPMGL(T),TPMGL(U) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_PlaceLocalHandle__closure__6<TPMGL(T),TPMGL(U) >::__apply, &x10_lang_PlaceLocalHandle__closure__6<TPMGL(T),TPMGL(U) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T), class TPMGL(U)> ::x10aux::itable_entry x10_lang_PlaceLocalHandle__closure__6<TPMGL(T),TPMGL(U) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_PlaceLocalHandle__closure__6<TPMGL(T),TPMGL(U) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T), class TPMGL(U)> const ::x10aux::serialization_id_t x10_lang_PlaceLocalHandle__closure__6<TPMGL(T),TPMGL(U) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_PlaceLocalHandle__closure__6<TPMGL(T),TPMGL(U) >::_deserialize);
template<class TPMGL(T), class TPMGL(U)> const ::x10aux::serialization_id_t x10_lang_PlaceLocalHandle__closure__6<TPMGL(T),TPMGL(U) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_PlaceLocalHandle__closure__6<TPMGL(T),TPMGL(U) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_LANG_PLACELOCALHANDLE__CLOSURE__6_CLOSURE
#ifndef X10_LANG_PLACELOCALHANDLE__CLOSURE__7_CLOSURE
#define X10_LANG_PLACELOCALHANDLE__CLOSURE__7_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T), class TPMGL(U)> class x10_lang_PlaceLocalHandle__closure__7 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >::template itable <x10_lang_PlaceLocalHandle__closure__7<TPMGL(T),TPMGL(U) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> __apply() {
        try {
            return ::x10::lang::PlaceLocalHandle<TPMGL(T)>::_make();
            
        }
        catch (::x10::lang::CheckedThrowable* __exc1342) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc1342);
                {
                    ::x10::lang::PlaceLocalHandle<TPMGL(T)> __lowerer__var__1__ =
                      ::x10aux::class_cast_unchecked< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >(::x10::lang::Runtime::wrapAtChecked< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >(
                                                                                                  __lowerer__var__0__));
                    return __lowerer__var__1__;
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_PlaceLocalHandle__closure__7<TPMGL(T),TPMGL(U) >* storage = ::x10aux::alloc_z<x10_lang_PlaceLocalHandle__closure__7<TPMGL(T),TPMGL(U) > >();
        buf.record_reference(storage);
        x10_lang_PlaceLocalHandle__closure__7<TPMGL(T),TPMGL(U) >* this_ = new (storage) x10_lang_PlaceLocalHandle__closure__7<TPMGL(T),TPMGL(U) >();
        return this_;
    }
    
    x10_lang_PlaceLocalHandle__closure__7() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10:136";
    }

};

template<class TPMGL(T), class TPMGL(U)> typename ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >::template itable <x10_lang_PlaceLocalHandle__closure__7<TPMGL(T),TPMGL(U) > >x10_lang_PlaceLocalHandle__closure__7<TPMGL(T),TPMGL(U) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_PlaceLocalHandle__closure__7<TPMGL(T),TPMGL(U) >::__apply, &x10_lang_PlaceLocalHandle__closure__7<TPMGL(T),TPMGL(U) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T), class TPMGL(U)> ::x10aux::itable_entry x10_lang_PlaceLocalHandle__closure__7<TPMGL(T),TPMGL(U) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >, &x10_lang_PlaceLocalHandle__closure__7<TPMGL(T),TPMGL(U) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T), class TPMGL(U)> const ::x10aux::serialization_id_t x10_lang_PlaceLocalHandle__closure__7<TPMGL(T),TPMGL(U) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_PlaceLocalHandle__closure__7<TPMGL(T),TPMGL(U) >::_deserialize);

#endif // X10_LANG_PLACELOCALHANDLE__CLOSURE__7_CLOSURE
#ifndef X10_LANG_PLACELOCALHANDLE__CLOSURE__8_CLOSURE
#define X10_LANG_PLACELOCALHANDLE__CLOSURE__8_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T), class TPMGL(U)> class x10_lang_PlaceLocalHandle__closure__8 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_PlaceLocalHandle__closure__8<TPMGL(T),TPMGL(U) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            handle->x10::lang::template PlaceLocalHandle<TPMGL(T)>::set(::x10::lang::Fun_0_1<TPMGL(U), TPMGL(T)>::__apply(::x10aux::nullCheck(init_there), 
                                                                          v));
        }
        catch (::x10::lang::CheckedThrowable* __exc1343) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc1343)) {
                ::x10::lang::Error* __lowerer__var__2__ = static_cast< ::x10::lang::Error*>(__exc1343);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__2__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__3__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1343);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__3__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> handle;
    ::x10::lang::Fun_0_1<TPMGL(U), TPMGL(T)>* init_there;
    TPMGL(U) v;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->handle);
        buf.write(this->init_there);
        buf.write(this->v);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_PlaceLocalHandle__closure__8<TPMGL(T),TPMGL(U) >* storage = ::x10aux::alloc_z<x10_lang_PlaceLocalHandle__closure__8<TPMGL(T),TPMGL(U) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle<TPMGL(T)> that_handle = buf.read< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >();
        ::x10::lang::Fun_0_1<TPMGL(U), TPMGL(T)>* that_init_there = buf.read< ::x10::lang::Fun_0_1<TPMGL(U), TPMGL(T)>*>();
        TPMGL(U) that_v = buf.read<TPMGL(U)>();
        x10_lang_PlaceLocalHandle__closure__8<TPMGL(T),TPMGL(U) >* this_ = new (storage) x10_lang_PlaceLocalHandle__closure__8<TPMGL(T),TPMGL(U) >(that_handle, that_init_there, that_v);
        return this_;
    }
    
    x10_lang_PlaceLocalHandle__closure__8(::x10::lang::PlaceLocalHandle<TPMGL(T)> handle, ::x10::lang::Fun_0_1<TPMGL(U), TPMGL(T)>* init_there, TPMGL(U) v) : handle(handle), init_there(init_there), v(v) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10:140";
    }

};

template<class TPMGL(T), class TPMGL(U)> typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_PlaceLocalHandle__closure__8<TPMGL(T),TPMGL(U) > >x10_lang_PlaceLocalHandle__closure__8<TPMGL(T),TPMGL(U) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_PlaceLocalHandle__closure__8<TPMGL(T),TPMGL(U) >::__apply, &x10_lang_PlaceLocalHandle__closure__8<TPMGL(T),TPMGL(U) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T), class TPMGL(U)> ::x10aux::itable_entry x10_lang_PlaceLocalHandle__closure__8<TPMGL(T),TPMGL(U) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_PlaceLocalHandle__closure__8<TPMGL(T),TPMGL(U) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T), class TPMGL(U)> const ::x10aux::serialization_id_t x10_lang_PlaceLocalHandle__closure__8<TPMGL(T),TPMGL(U) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_PlaceLocalHandle__closure__8<TPMGL(T),TPMGL(U) >::_deserialize);
template<class TPMGL(T), class TPMGL(U)> const ::x10aux::serialization_id_t x10_lang_PlaceLocalHandle__closure__8<TPMGL(T),TPMGL(U) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_PlaceLocalHandle__closure__8<TPMGL(T),TPMGL(U) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_LANG_PLACELOCALHANDLE__CLOSURE__8_CLOSURE
#ifndef X10_LANG_PLACELOCALHANDLE__CLOSURE__9_CLOSURE
#define X10_LANG_PLACELOCALHANDLE__CLOSURE__9_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T)> class x10_lang_PlaceLocalHandle__closure__9 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >::template itable <x10_lang_PlaceLocalHandle__closure__9<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> __apply() {
        try {
            return ::x10::lang::PlaceLocalHandle<TPMGL(T)>::_make();
            
        }
        catch (::x10::lang::CheckedThrowable* __exc1346) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc1346);
                {
                    ::x10::lang::PlaceLocalHandle<TPMGL(T)> __lowerer__var__1__ =
                      ::x10aux::class_cast_unchecked< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >(::x10::lang::Runtime::wrapAtChecked< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >(
                                                                                                  __lowerer__var__0__));
                    return __lowerer__var__1__;
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_PlaceLocalHandle__closure__9<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_lang_PlaceLocalHandle__closure__9<TPMGL(T) > >();
        buf.record_reference(storage);
        x10_lang_PlaceLocalHandle__closure__9<TPMGL(T) >* this_ = new (storage) x10_lang_PlaceLocalHandle__closure__9<TPMGL(T) >();
        return this_;
    }
    
    x10_lang_PlaceLocalHandle__closure__9() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10:165";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >::template itable <x10_lang_PlaceLocalHandle__closure__9<TPMGL(T) > >x10_lang_PlaceLocalHandle__closure__9<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_PlaceLocalHandle__closure__9<TPMGL(T) >::__apply, &x10_lang_PlaceLocalHandle__closure__9<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_lang_PlaceLocalHandle__closure__9<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >, &x10_lang_PlaceLocalHandle__closure__9<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_PlaceLocalHandle__closure__9<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_PlaceLocalHandle__closure__9<TPMGL(T) >::_deserialize);

#endif // X10_LANG_PLACELOCALHANDLE__CLOSURE__9_CLOSURE
#ifndef X10_LANG_PLACELOCALHANDLE__CLOSURE__10_CLOSURE
#define X10_LANG_PLACELOCALHANDLE__CLOSURE__10_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_lang_PlaceLocalHandle__closure__10 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_PlaceLocalHandle__closure__10<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        handle->x10::lang::template PlaceLocalHandle<TPMGL(T)>::set(::x10::lang::Fun_0_0<TPMGL(T)>::__apply(::x10aux::nullCheck(init)));
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> handle;
    ::x10::lang::Fun_0_0<TPMGL(T)>* init;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->handle);
        buf.write(this->init);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_PlaceLocalHandle__closure__10<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_lang_PlaceLocalHandle__closure__10<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle<TPMGL(T)> that_handle = buf.read< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >();
        ::x10::lang::Fun_0_0<TPMGL(T)>* that_init = buf.read< ::x10::lang::Fun_0_0<TPMGL(T)>*>();
        x10_lang_PlaceLocalHandle__closure__10<TPMGL(T) >* this_ = new (storage) x10_lang_PlaceLocalHandle__closure__10<TPMGL(T) >(that_handle, that_init);
        return this_;
    }
    
    x10_lang_PlaceLocalHandle__closure__10(::x10::lang::PlaceLocalHandle<TPMGL(T)> handle, ::x10::lang::Fun_0_0<TPMGL(T)>* init) : handle(handle), init(init) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10:166";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_PlaceLocalHandle__closure__10<TPMGL(T) > >x10_lang_PlaceLocalHandle__closure__10<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_PlaceLocalHandle__closure__10<TPMGL(T) >::__apply, &x10_lang_PlaceLocalHandle__closure__10<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_lang_PlaceLocalHandle__closure__10<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_PlaceLocalHandle__closure__10<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_PlaceLocalHandle__closure__10<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_PlaceLocalHandle__closure__10<TPMGL(T) >::_deserialize);

#endif // X10_LANG_PLACELOCALHANDLE__CLOSURE__10_CLOSURE
#ifndef X10_LANG_PLACELOCALHANDLE__CLOSURE__11_CLOSURE
#define X10_LANG_PLACELOCALHANDLE__CLOSURE__11_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T)> class x10_lang_PlaceLocalHandle__closure__11 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >::template itable <x10_lang_PlaceLocalHandle__closure__11<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> __apply() {
        try {
            return ::x10::lang::PlaceLocalHandle<TPMGL(T)>::_make();
            
        }
        catch (::x10::lang::CheckedThrowable* __exc1347) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc1347);
                {
                    ::x10::lang::PlaceLocalHandle<TPMGL(T)> __lowerer__var__1__ =
                      ::x10aux::class_cast_unchecked< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >(::x10::lang::Runtime::wrapAtChecked< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >(
                                                                                                  __lowerer__var__0__));
                    return __lowerer__var__1__;
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_PlaceLocalHandle__closure__11<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_lang_PlaceLocalHandle__closure__11<TPMGL(T) > >();
        buf.record_reference(storage);
        x10_lang_PlaceLocalHandle__closure__11<TPMGL(T) >* this_ = new (storage) x10_lang_PlaceLocalHandle__closure__11<TPMGL(T) >();
        return this_;
    }
    
    x10_lang_PlaceLocalHandle__closure__11() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10:188";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >::template itable <x10_lang_PlaceLocalHandle__closure__11<TPMGL(T) > >x10_lang_PlaceLocalHandle__closure__11<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_PlaceLocalHandle__closure__11<TPMGL(T) >::__apply, &x10_lang_PlaceLocalHandle__closure__11<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_lang_PlaceLocalHandle__closure__11<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >, &x10_lang_PlaceLocalHandle__closure__11<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_PlaceLocalHandle__closure__11<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_PlaceLocalHandle__closure__11<TPMGL(T) >::_deserialize);

#endif // X10_LANG_PLACELOCALHANDLE__CLOSURE__11_CLOSURE
#ifndef X10_LANG_PLACELOCALHANDLE__CLOSURE__12_CLOSURE
#define X10_LANG_PLACELOCALHANDLE__CLOSURE__12_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_lang_PlaceLocalHandle__closure__12 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_PlaceLocalHandle__closure__12<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        handle->x10::lang::template PlaceLocalHandle<TPMGL(T)>::set(::x10::lang::Fun_0_0<TPMGL(T)>::__apply(::x10aux::nullCheck(init)));
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> handle;
    ::x10::lang::Fun_0_0<TPMGL(T)>* init;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->handle);
        buf.write(this->init);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_PlaceLocalHandle__closure__12<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_lang_PlaceLocalHandle__closure__12<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle<TPMGL(T)> that_handle = buf.read< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >();
        ::x10::lang::Fun_0_0<TPMGL(T)>* that_init = buf.read< ::x10::lang::Fun_0_0<TPMGL(T)>*>();
        x10_lang_PlaceLocalHandle__closure__12<TPMGL(T) >* this_ = new (storage) x10_lang_PlaceLocalHandle__closure__12<TPMGL(T) >(that_handle, that_init);
        return this_;
    }
    
    x10_lang_PlaceLocalHandle__closure__12(::x10::lang::PlaceLocalHandle<TPMGL(T)> handle, ::x10::lang::Fun_0_0<TPMGL(T)>* init) : handle(handle), init(init) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10:189";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_PlaceLocalHandle__closure__12<TPMGL(T) > >x10_lang_PlaceLocalHandle__closure__12<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_PlaceLocalHandle__closure__12<TPMGL(T) >::__apply, &x10_lang_PlaceLocalHandle__closure__12<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_lang_PlaceLocalHandle__closure__12<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_PlaceLocalHandle__closure__12<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_PlaceLocalHandle__closure__12<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_PlaceLocalHandle__closure__12<TPMGL(T) >::_deserialize);

#endif // X10_LANG_PLACELOCALHANDLE__CLOSURE__12_CLOSURE
#ifndef X10_LANG_PLACELOCALHANDLE__CLOSURE__13_CLOSURE
#define X10_LANG_PLACELOCALHANDLE__CLOSURE__13_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T), class TPMGL(U)> class x10_lang_PlaceLocalHandle__closure__13 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >::template itable <x10_lang_PlaceLocalHandle__closure__13<TPMGL(T),TPMGL(U) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> __apply() {
        try {
            return ::x10::lang::PlaceLocalHandle<TPMGL(T)>::_make();
            
        }
        catch (::x10::lang::CheckedThrowable* __exc1348) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc1348);
                {
                    ::x10::lang::PlaceLocalHandle<TPMGL(T)> __lowerer__var__1__ =
                      ::x10aux::class_cast_unchecked< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >(::x10::lang::Runtime::wrapAtChecked< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >(
                                                                                                  __lowerer__var__0__));
                    return __lowerer__var__1__;
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_PlaceLocalHandle__closure__13<TPMGL(T),TPMGL(U) >* storage = ::x10aux::alloc_z<x10_lang_PlaceLocalHandle__closure__13<TPMGL(T),TPMGL(U) > >();
        buf.record_reference(storage);
        x10_lang_PlaceLocalHandle__closure__13<TPMGL(T),TPMGL(U) >* this_ = new (storage) x10_lang_PlaceLocalHandle__closure__13<TPMGL(T),TPMGL(U) >();
        return this_;
    }
    
    x10_lang_PlaceLocalHandle__closure__13() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10:211";
    }

};

template<class TPMGL(T), class TPMGL(U)> typename ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >::template itable <x10_lang_PlaceLocalHandle__closure__13<TPMGL(T),TPMGL(U) > >x10_lang_PlaceLocalHandle__closure__13<TPMGL(T),TPMGL(U) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_PlaceLocalHandle__closure__13<TPMGL(T),TPMGL(U) >::__apply, &x10_lang_PlaceLocalHandle__closure__13<TPMGL(T),TPMGL(U) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T), class TPMGL(U)> ::x10aux::itable_entry x10_lang_PlaceLocalHandle__closure__13<TPMGL(T),TPMGL(U) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >, &x10_lang_PlaceLocalHandle__closure__13<TPMGL(T),TPMGL(U) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T), class TPMGL(U)> const ::x10aux::serialization_id_t x10_lang_PlaceLocalHandle__closure__13<TPMGL(T),TPMGL(U) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_PlaceLocalHandle__closure__13<TPMGL(T),TPMGL(U) >::_deserialize);

#endif // X10_LANG_PLACELOCALHANDLE__CLOSURE__13_CLOSURE
#ifndef X10_LANG_PLACELOCALHANDLE__CLOSURE__14_CLOSURE
#define X10_LANG_PLACELOCALHANDLE__CLOSURE__14_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T), class TPMGL(U)> class x10_lang_PlaceLocalHandle__closure__14 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_PlaceLocalHandle__closure__14<TPMGL(T),TPMGL(U) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            handle->x10::lang::template PlaceLocalHandle<TPMGL(T)>::set(::x10::lang::Fun_0_1<TPMGL(U), TPMGL(T)>::__apply(::x10aux::nullCheck(init_there), 
                                                                          v));
        }
        catch (::x10::lang::CheckedThrowable* __exc1349) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc1349)) {
                ::x10::lang::Error* __lowerer__var__2__ = static_cast< ::x10::lang::Error*>(__exc1349);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__2__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__3__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1349);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__3__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> handle;
    ::x10::lang::Fun_0_1<TPMGL(U), TPMGL(T)>* init_there;
    TPMGL(U) v;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->handle);
        buf.write(this->init_there);
        buf.write(this->v);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_PlaceLocalHandle__closure__14<TPMGL(T),TPMGL(U) >* storage = ::x10aux::alloc_z<x10_lang_PlaceLocalHandle__closure__14<TPMGL(T),TPMGL(U) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle<TPMGL(T)> that_handle = buf.read< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >();
        ::x10::lang::Fun_0_1<TPMGL(U), TPMGL(T)>* that_init_there = buf.read< ::x10::lang::Fun_0_1<TPMGL(U), TPMGL(T)>*>();
        TPMGL(U) that_v = buf.read<TPMGL(U)>();
        x10_lang_PlaceLocalHandle__closure__14<TPMGL(T),TPMGL(U) >* this_ = new (storage) x10_lang_PlaceLocalHandle__closure__14<TPMGL(T),TPMGL(U) >(that_handle, that_init_there, that_v);
        return this_;
    }
    
    x10_lang_PlaceLocalHandle__closure__14(::x10::lang::PlaceLocalHandle<TPMGL(T)> handle, ::x10::lang::Fun_0_1<TPMGL(U), TPMGL(T)>* init_there, TPMGL(U) v) : handle(handle), init_there(init_there), v(v) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10:214";
    }

};

template<class TPMGL(T), class TPMGL(U)> typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_PlaceLocalHandle__closure__14<TPMGL(T),TPMGL(U) > >x10_lang_PlaceLocalHandle__closure__14<TPMGL(T),TPMGL(U) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_PlaceLocalHandle__closure__14<TPMGL(T),TPMGL(U) >::__apply, &x10_lang_PlaceLocalHandle__closure__14<TPMGL(T),TPMGL(U) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T), class TPMGL(U)> ::x10aux::itable_entry x10_lang_PlaceLocalHandle__closure__14<TPMGL(T),TPMGL(U) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_PlaceLocalHandle__closure__14<TPMGL(T),TPMGL(U) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T), class TPMGL(U)> const ::x10aux::serialization_id_t x10_lang_PlaceLocalHandle__closure__14<TPMGL(T),TPMGL(U) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_PlaceLocalHandle__closure__14<TPMGL(T),TPMGL(U) >::_deserialize);
template<class TPMGL(T), class TPMGL(U)> const ::x10aux::serialization_id_t x10_lang_PlaceLocalHandle__closure__14<TPMGL(T),TPMGL(U) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_PlaceLocalHandle__closure__14<TPMGL(T),TPMGL(U) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_LANG_PLACELOCALHANDLE__CLOSURE__14_CLOSURE
#ifndef X10_LANG_PLACELOCALHANDLE__CLOSURE__15_CLOSURE
#define X10_LANG_PLACELOCALHANDLE__CLOSURE__15_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T), class TPMGL(U)> class x10_lang_PlaceLocalHandle__closure__15 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >::template itable <x10_lang_PlaceLocalHandle__closure__15<TPMGL(T),TPMGL(U) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> __apply() {
        try {
            return ::x10::lang::PlaceLocalHandle<TPMGL(T)>::_make();
            
        }
        catch (::x10::lang::CheckedThrowable* __exc1352) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc1352);
                {
                    ::x10::lang::PlaceLocalHandle<TPMGL(T)> __lowerer__var__1__ =
                      ::x10aux::class_cast_unchecked< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >(::x10::lang::Runtime::wrapAtChecked< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >(
                                                                                                  __lowerer__var__0__));
                    return __lowerer__var__1__;
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_PlaceLocalHandle__closure__15<TPMGL(T),TPMGL(U) >* storage = ::x10aux::alloc_z<x10_lang_PlaceLocalHandle__closure__15<TPMGL(T),TPMGL(U) > >();
        buf.record_reference(storage);
        x10_lang_PlaceLocalHandle__closure__15<TPMGL(T),TPMGL(U) >* this_ = new (storage) x10_lang_PlaceLocalHandle__closure__15<TPMGL(T),TPMGL(U) >();
        return this_;
    }
    
    x10_lang_PlaceLocalHandle__closure__15() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10:240";
    }

};

template<class TPMGL(T), class TPMGL(U)> typename ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >::template itable <x10_lang_PlaceLocalHandle__closure__15<TPMGL(T),TPMGL(U) > >x10_lang_PlaceLocalHandle__closure__15<TPMGL(T),TPMGL(U) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_PlaceLocalHandle__closure__15<TPMGL(T),TPMGL(U) >::__apply, &x10_lang_PlaceLocalHandle__closure__15<TPMGL(T),TPMGL(U) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T), class TPMGL(U)> ::x10aux::itable_entry x10_lang_PlaceLocalHandle__closure__15<TPMGL(T),TPMGL(U) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >, &x10_lang_PlaceLocalHandle__closure__15<TPMGL(T),TPMGL(U) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T), class TPMGL(U)> const ::x10aux::serialization_id_t x10_lang_PlaceLocalHandle__closure__15<TPMGL(T),TPMGL(U) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_PlaceLocalHandle__closure__15<TPMGL(T),TPMGL(U) >::_deserialize);

#endif // X10_LANG_PLACELOCALHANDLE__CLOSURE__15_CLOSURE
#ifndef X10_LANG_PLACELOCALHANDLE__CLOSURE__16_CLOSURE
#define X10_LANG_PLACELOCALHANDLE__CLOSURE__16_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T), class TPMGL(U)> class x10_lang_PlaceLocalHandle__closure__16 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_PlaceLocalHandle__closure__16<TPMGL(T),TPMGL(U) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            handle->x10::lang::template PlaceLocalHandle<TPMGL(T)>::set(::x10::lang::Fun_0_1<TPMGL(U), TPMGL(T)>::__apply(::x10aux::nullCheck(init_there), 
                                                                          v));
        }
        catch (::x10::lang::CheckedThrowable* __exc1353) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc1353)) {
                ::x10::lang::Error* __lowerer__var__2__ = static_cast< ::x10::lang::Error*>(__exc1353);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__2__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__3__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1353);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__3__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> handle;
    ::x10::lang::Fun_0_1<TPMGL(U), TPMGL(T)>* init_there;
    TPMGL(U) v;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->handle);
        buf.write(this->init_there);
        buf.write(this->v);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_PlaceLocalHandle__closure__16<TPMGL(T),TPMGL(U) >* storage = ::x10aux::alloc_z<x10_lang_PlaceLocalHandle__closure__16<TPMGL(T),TPMGL(U) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle<TPMGL(T)> that_handle = buf.read< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >();
        ::x10::lang::Fun_0_1<TPMGL(U), TPMGL(T)>* that_init_there = buf.read< ::x10::lang::Fun_0_1<TPMGL(U), TPMGL(T)>*>();
        TPMGL(U) that_v = buf.read<TPMGL(U)>();
        x10_lang_PlaceLocalHandle__closure__16<TPMGL(T),TPMGL(U) >* this_ = new (storage) x10_lang_PlaceLocalHandle__closure__16<TPMGL(T),TPMGL(U) >(that_handle, that_init_there, that_v);
        return this_;
    }
    
    x10_lang_PlaceLocalHandle__closure__16(::x10::lang::PlaceLocalHandle<TPMGL(T)> handle, ::x10::lang::Fun_0_1<TPMGL(U), TPMGL(T)>* init_there, TPMGL(U) v) : handle(handle), init_there(init_there), v(v) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10:244";
    }

};

template<class TPMGL(T), class TPMGL(U)> typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_PlaceLocalHandle__closure__16<TPMGL(T),TPMGL(U) > >x10_lang_PlaceLocalHandle__closure__16<TPMGL(T),TPMGL(U) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_PlaceLocalHandle__closure__16<TPMGL(T),TPMGL(U) >::__apply, &x10_lang_PlaceLocalHandle__closure__16<TPMGL(T),TPMGL(U) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T), class TPMGL(U)> ::x10aux::itable_entry x10_lang_PlaceLocalHandle__closure__16<TPMGL(T),TPMGL(U) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_PlaceLocalHandle__closure__16<TPMGL(T),TPMGL(U) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T), class TPMGL(U)> const ::x10aux::serialization_id_t x10_lang_PlaceLocalHandle__closure__16<TPMGL(T),TPMGL(U) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_PlaceLocalHandle__closure__16<TPMGL(T),TPMGL(U) >::_deserialize);
template<class TPMGL(T), class TPMGL(U)> const ::x10aux::serialization_id_t x10_lang_PlaceLocalHandle__closure__16<TPMGL(T),TPMGL(U) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_PlaceLocalHandle__closure__16<TPMGL(T),TPMGL(U) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_LANG_PLACELOCALHANDLE__CLOSURE__16_CLOSURE
#ifndef X10_LANG_PLACELOCALHANDLE__CLOSURE__17_CLOSURE
#define X10_LANG_PLACELOCALHANDLE__CLOSURE__17_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_lang_PlaceLocalHandle__closure__17 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_PlaceLocalHandle__closure__17<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        plh->x10::lang::template PlaceLocalHandle<TPMGL(T)>::set(::x10aux::class_cast_unchecked<TPMGL(T)>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> plh;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->plh);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_PlaceLocalHandle__closure__17<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_lang_PlaceLocalHandle__closure__17<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle<TPMGL(T)> that_plh = buf.read< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >();
        x10_lang_PlaceLocalHandle__closure__17<TPMGL(T) >* this_ = new (storage) x10_lang_PlaceLocalHandle__closure__17<TPMGL(T) >(that_plh);
        return this_;
    }
    
    x10_lang_PlaceLocalHandle__closure__17(::x10::lang::PlaceLocalHandle<TPMGL(T)> plh) : plh(plh) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10:257";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_PlaceLocalHandle__closure__17<TPMGL(T) > >x10_lang_PlaceLocalHandle__closure__17<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_PlaceLocalHandle__closure__17<TPMGL(T) >::__apply, &x10_lang_PlaceLocalHandle__closure__17<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_lang_PlaceLocalHandle__closure__17<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_PlaceLocalHandle__closure__17<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_PlaceLocalHandle__closure__17<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_PlaceLocalHandle__closure__17<TPMGL(T) >::_deserialize);

#endif // X10_LANG_PLACELOCALHANDLE__CLOSURE__17_CLOSURE
#ifndef X10_LANG_PLACELOCALHANDLE__CLOSURE__18_CLOSURE
#define X10_LANG_PLACELOCALHANDLE__CLOSURE__18_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_lang_PlaceLocalHandle__closure__18 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_PlaceLocalHandle__closure__18<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        plh->x10::lang::template PlaceLocalHandle<TPMGL(T)>::set(::x10aux::class_cast_unchecked<TPMGL(T)>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
    
    // captured environment
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> plh;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->plh);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_PlaceLocalHandle__closure__18<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_lang_PlaceLocalHandle__closure__18<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceLocalHandle<TPMGL(T)> that_plh = buf.read< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >();
        x10_lang_PlaceLocalHandle__closure__18<TPMGL(T) >* this_ = new (storage) x10_lang_PlaceLocalHandle__closure__18<TPMGL(T) >(that_plh);
        return this_;
    }
    
    x10_lang_PlaceLocalHandle__closure__18(::x10::lang::PlaceLocalHandle<TPMGL(T)> plh) : plh(plh) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10:267";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_PlaceLocalHandle__closure__18<TPMGL(T) > >x10_lang_PlaceLocalHandle__closure__18<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_PlaceLocalHandle__closure__18<TPMGL(T) >::__apply, &x10_lang_PlaceLocalHandle__closure__18<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_lang_PlaceLocalHandle__closure__18<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_PlaceLocalHandle__closure__18<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_PlaceLocalHandle__closure__18<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_PlaceLocalHandle__closure__18<TPMGL(T) >::_deserialize);

#endif // X10_LANG_PLACELOCALHANDLE__CLOSURE__18_CLOSURE
namespace x10 { namespace lang { 
template<class TPMGL(T)> class PlaceLocalHandle_ibox0 : public ::x10::lang::IBox< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > {
public:
    static ::x10::lang::Any::itable< PlaceLocalHandle_ibox0<TPMGL(T)> > itable;
    x10_boolean equals(::x10::lang::Any* arg0) {
        return this->value->equals(arg0);
    }
    x10_int hashCode() {
        return this->value->hashCode();
    }
    ::x10::lang::String* toString() {
        return this->value->toString();
    }
    ::x10::lang::String* typeName() {
        return this->value->typeName();
    }
    
};
template<class TPMGL(T)> ::x10::lang::Any::itable< PlaceLocalHandle_ibox0<TPMGL(T)> >  PlaceLocalHandle_ibox0<TPMGL(T)>::itable(&PlaceLocalHandle_ibox0<TPMGL(T)>::equals, &PlaceLocalHandle_ibox0<TPMGL(T)>::hashCode, &PlaceLocalHandle_ibox0<TPMGL(T)>::toString, &PlaceLocalHandle_ibox0<TPMGL(T)>::typeName);
} } 
template<class TPMGL(T)> ::x10::lang::Any::itable< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >  x10::lang::PlaceLocalHandle<TPMGL(T)>::_itable_0(&x10::lang::PlaceLocalHandle<TPMGL(T)>::equals, &x10::lang::PlaceLocalHandle<TPMGL(T)>::hashCode, &x10::lang::PlaceLocalHandle<TPMGL(T)>::toString, &x10::lang::PlaceLocalHandle<TPMGL(T)>::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10::lang::PlaceLocalHandle<TPMGL(T)>::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &x10::lang::PlaceLocalHandle<TPMGL(T)>::_itable_0), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::PlaceLocalHandle<TPMGL(T)>")};
template<class TPMGL(T)> ::x10aux::itable_entry x10::lang::PlaceLocalHandle<TPMGL(T)>::_iboxitables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &x10::lang::PlaceLocalHandle_ibox0<TPMGL(T)>::itable), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::PlaceLocalHandle<TPMGL(T)>")};

//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
template<class TPMGL(T)> void x10::lang::PlaceLocalHandle<TPMGL(T)>::_constructor(
                           ::x10::lang::PlaceLocalHandle_Impl<TPMGL(T)> id0) {
    (*this)->FMGL(__NATIVE_FIELD__) = id0;
}
template<class TPMGL(T)> ::x10::lang::PlaceLocalHandle<TPMGL(T)> x10::lang::PlaceLocalHandle<TPMGL(T)>::_make(
                           ::x10::lang::PlaceLocalHandle_Impl<TPMGL(T)> id0)
{
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> this_; 
    this_->_constructor(id0);
    return this_;
}



//#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
template<class TPMGL(T)> void x10::lang::PlaceLocalHandle<TPMGL(T)>::_constructor(
                           ) {
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    (*this)->FMGL(__NATIVE_FIELD__) = ::x10::lang::PlaceLocalHandle_Impl<TPMGL(T)>::_make();
}
template<class TPMGL(T)> ::x10::lang::PlaceLocalHandle<TPMGL(T)> x10::lang::PlaceLocalHandle<TPMGL(T)>::_make(
                           ) {
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> this_; 
    this_->_constructor();
    return this_;
}



//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
template<class TPMGL(T)> TPMGL(T) x10::lang::PlaceLocalHandle<TPMGL(T)>::__apply(
  ) {
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    return (*this)->FMGL(__NATIVE_FIELD__)->x10::lang::template PlaceLocalHandle_Impl<TPMGL(T)>::__apply();
    
}

//#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
template<class TPMGL(T)> void x10::lang::PlaceLocalHandle<TPMGL(T)>::set(
  TPMGL(T) newVal) {
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    (*this)->FMGL(__NATIVE_FIELD__)->x10::lang::template PlaceLocalHandle_Impl<TPMGL(T)>::set(
      newVal);
}

//#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
template<class TPMGL(T)> x10_int x10::lang::PlaceLocalHandle<TPMGL(T)>::hashCode(
  ) {
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    return (*this)->FMGL(__NATIVE_FIELD__)->x10::lang::template PlaceLocalHandle_Impl<TPMGL(T)>::hashCode();
    
}

//#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
template<class TPMGL(T)> ::x10::lang::String* x10::lang::PlaceLocalHandle<TPMGL(T)>::toString(
  ) {
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    return (*this)->FMGL(__NATIVE_FIELD__)->x10::lang::template PlaceLocalHandle_Impl<TPMGL(T)>::toString();
    
}

//#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"

//#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"

//#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"

//#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"

//#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"

//#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"

//#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"

//#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"

//#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"

//#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"

//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
template<class TPMGL(T)> ::x10::lang::String* x10::lang::PlaceLocalHandle<TPMGL(T)>::typeName(
  ){
    return ::x10aux::type_name((*this));
}
template<class TPMGL(T)> x10_boolean x10::lang::PlaceLocalHandle<TPMGL(T)>::equals(
  ::x10::lang::Any* other) {
    if (!(::x10aux::instanceof< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >(other)))
    {
        return false;
        
    }
    return (*this)->x10::lang::template PlaceLocalHandle<TPMGL(T)>::equals(
             ::x10aux::class_cast< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >(other));
    
}
template<class TPMGL(T)> x10_boolean x10::lang::PlaceLocalHandle<TPMGL(T)>::equals(
  ::x10::lang::PlaceLocalHandle<TPMGL(T)> other) {
    return true;
    
}
template<class TPMGL(T)> x10_boolean x10::lang::PlaceLocalHandle<TPMGL(T)>::_struct_equals(
  ::x10::lang::Any* other) {
    if (!(::x10aux::instanceof< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >(other)))
    {
        return false;
        
    }
    return (*this)->x10::lang::template PlaceLocalHandle<TPMGL(T)>::_struct_equals(
             ::x10aux::class_cast< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >(other));
    
}
template<class TPMGL(T)> x10_boolean x10::lang::PlaceLocalHandle<TPMGL(T)>::_struct_equals(
  ::x10::lang::PlaceLocalHandle<TPMGL(T)> other) {
    return true;
    
}

//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
template<class TPMGL(T)> ::x10::lang::PlaceLocalHandle<TPMGL(T)>
  x10::lang::PlaceLocalHandle<TPMGL(T)>::x10__lang__PlaceLocalHandle____this__x10__lang__PlaceLocalHandle(
  ) {
    return (*this);
    
}
template<class TPMGL(T)> void x10::lang::PlaceLocalHandle<TPMGL(T)>::__fieldInitializers_x10_lang_PlaceLocalHandle(
  ) {
 
}
template<class TPMGL(T)> void ::x10::lang::PlaceLocalHandle<TPMGL(T)>::_serialize(::x10::lang::PlaceLocalHandle<TPMGL(T)> this_, ::x10aux::serialization_buffer& buf) {
    buf.write(this_->FMGL(__NATIVE_FIELD__));
    
}

template<class TPMGL(T)> void ::x10::lang::PlaceLocalHandle<TPMGL(T)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(__NATIVE_FIELD__) = buf.read< ::x10::lang::PlaceLocalHandle_Impl<TPMGL(T)> >();
}


template<class TPMGL(T)> ::x10::lang::PlaceLocalHandle<TPMGL(T)>
  x10::lang::PlaceLocalHandle<void>::make(::x10::lang::PlaceGroup* pg,
                                          ::x10::lang::Fun_0_0<TPMGL(T)>* init) {
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> handle = ::x10::lang::Runtime::template evalAt< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >(
                                                       ::x10::lang::Place::FMGL(FIRST_PLACE__get)(),
                                                       reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >(sizeof(x10_lang_PlaceLocalHandle__closure__1<TPMGL(T)>)))x10_lang_PlaceLocalHandle__closure__1<TPMGL(T)>())),
                                                       ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    {
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        ::x10::lang::Runtime::ensureNotInAtomic();
        ::x10::lang::FinishState* x10____var8 = ::x10::lang::Runtime::startFinish();
        {
            ::x10::lang::CheckedThrowable* throwable__103272 =
              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                try {
                    {
                        {
                            ::x10::lang::Iterator< ::x10::lang::Place>* p__74525;
                            for (p__74525 = ::x10aux::nullCheck(pg)->iterator();
                                 ::x10::lang::Iterator< ::x10::lang::Place>::hasNext(::x10aux::nullCheck(p__74525));
                                 ) {
                                ::x10::lang::Place p = ::x10::lang::Iterator< ::x10::lang::Place>::next(::x10aux::nullCheck(p__74525));
                                
                                //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                                ::x10::lang::Runtime::runAsync(
                                  p, reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_PlaceLocalHandle__closure__2<TPMGL(T)>)))x10_lang_PlaceLocalHandle__closure__2<TPMGL(T)>(handle, init))),
                                  ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                            }
                        }
                        
                    }
                }
                catch (::x10::lang::CheckedThrowable* __exc1332) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* __lowerer__var__2__ =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc1332);
                        {
                            ::x10::lang::Runtime::pushException(
                              __lowerer__var__2__);
                            ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make()));
                        }
                    } else
                    throw;
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc1333) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__103273 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1333);
                    {
                        throwable__103272 = formal__103273;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103272)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__103272))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103272));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::stopFinish(x10____var8);
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103272)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__103272)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103272));
                }
                
            }
            
        }
    }
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    return handle;
    
}
template<class TPMGL(T)> ::x10::lang::PlaceLocalHandle<TPMGL(T)>
  x10::lang::PlaceLocalHandle<void>::make(::x10::lang::PlaceGroup* pg,
                                          ::x10::lang::Fun_0_0<TPMGL(T)>* init,
                                          ::x10::lang::Fun_0_1< ::x10::lang::Place, x10_boolean>* ignoreIfDead) {
    
    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> handle = ::x10::lang::Runtime::template evalAt< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >(
                                                       ::x10::lang::Place::FMGL(FIRST_PLACE__get)(),
                                                       reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >(sizeof(x10_lang_PlaceLocalHandle__closure__3<TPMGL(T)>)))x10_lang_PlaceLocalHandle__closure__3<TPMGL(T)>())),
                                                       ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    {
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        ::x10::lang::Runtime::ensureNotInAtomic();
        ::x10::lang::FinishState* x10____var9 = ::x10::lang::Runtime::startFinish();
        {
            ::x10::lang::CheckedThrowable* throwable__103275 =
              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                try {
                    {
                        {
                            ::x10::lang::Iterator< ::x10::lang::Place>* p__74527;
                            for (p__74527 = ::x10aux::nullCheck(pg)->iterator();
                                 ::x10::lang::Iterator< ::x10::lang::Place>::hasNext(::x10aux::nullCheck(p__74527));
                                 ) {
                                ::x10::lang::Place p = ::x10::lang::Iterator< ::x10::lang::Place>::next(::x10aux::nullCheck(p__74527));
                                
                                //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                                if ((!(p->x10::lang::Place::isDead()) ||
                                    !(::x10::lang::Fun_0_1< ::x10::lang::Place, x10_boolean>::__apply(::x10aux::nullCheck(ignoreIfDead), 
                                      p)))) {
                                    
                                    //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                                    ::x10::lang::Runtime::runAsync(
                                      p, reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_PlaceLocalHandle__closure__4<TPMGL(T)>)))x10_lang_PlaceLocalHandle__closure__4<TPMGL(T)>(handle, init))),
                                      ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                                }
                                
                            }
                        }
                        
                    }
                }
                catch (::x10::lang::CheckedThrowable* __exc1336) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* __lowerer__var__2__ =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc1336);
                        {
                            ::x10::lang::Runtime::pushException(
                              __lowerer__var__2__);
                            ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make()));
                        }
                    } else
                    throw;
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc1337) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__103276 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1337);
                    {
                        throwable__103275 = formal__103276;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103275)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__103275))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103275));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::stopFinish(x10____var9);
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103275)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__103275)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103275));
                }
                
            }
            
        }
    }
    
    //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    return handle;
    
}
template<class TPMGL(T), class TPMGL(U)> ::x10::lang::PlaceLocalHandle<TPMGL(T)>
  x10::lang::PlaceLocalHandle<void>::make(::x10::lang::PlaceGroup* pg,
                                          ::x10::lang::Fun_0_1< ::x10::lang::Place, TPMGL(U)>* init_here,
                                          ::x10::lang::Fun_0_1<TPMGL(U), TPMGL(T)>* init_there) {
    
    //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> handle = ::x10::lang::Runtime::template evalAt< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >(
                                                       ::x10::lang::Place::FMGL(FIRST_PLACE__get)(),
                                                       reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >(sizeof(x10_lang_PlaceLocalHandle__closure__5<TPMGL(T),TPMGL(U)>)))x10_lang_PlaceLocalHandle__closure__5<TPMGL(T),TPMGL(U)>())),
                                                       ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    {
        
        //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        ::x10::lang::Runtime::ensureNotInAtomic();
        ::x10::lang::FinishState* x10____var10 = ::x10::lang::Runtime::startFinish();
        {
            ::x10::lang::CheckedThrowable* throwable__103278 =
              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                try {
                    {
                        {
                            ::x10::lang::Iterator< ::x10::lang::Place>* p__74529;
                            for (p__74529 = ::x10aux::nullCheck(pg)->iterator();
                                 ::x10::lang::Iterator< ::x10::lang::Place>::hasNext(::x10aux::nullCheck(p__74529));
                                 ) {
                                ::x10::lang::Place p = ::x10::lang::Iterator< ::x10::lang::Place>::next(::x10aux::nullCheck(p__74529));
                                
                                //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                                TPMGL(U) v = ::x10::lang::Fun_0_1< ::x10::lang::Place, TPMGL(U)>::__apply(::x10aux::nullCheck(init_here), 
                                  p);
                                
                                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                                ::x10::lang::Runtime::runAsync(
                                  p, reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_PlaceLocalHandle__closure__6<TPMGL(T),TPMGL(U)>)))x10_lang_PlaceLocalHandle__closure__6<TPMGL(T),TPMGL(U)>(handle, init_there, v))),
                                  ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                            }
                        }
                        
                    }
                }
                catch (::x10::lang::CheckedThrowable* __exc1340) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* __lowerer__var__2__ =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc1340);
                        {
                            ::x10::lang::Runtime::pushException(
                              __lowerer__var__2__);
                            ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make()));
                        }
                    } else
                    throw;
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc1341) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__103279 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1341);
                    {
                        throwable__103278 = formal__103279;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103278)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__103278))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103278));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::stopFinish(x10____var10);
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103278)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__103278)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103278));
                }
                
            }
            
        }
    }
    
    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    return handle;
    
}
template<class TPMGL(T), class TPMGL(U)> ::x10::lang::PlaceLocalHandle<TPMGL(T)>
  x10::lang::PlaceLocalHandle<void>::make(::x10::lang::PlaceGroup* pg,
                                          ::x10::lang::Fun_0_1< ::x10::lang::Place, TPMGL(U)>* init_here,
                                          ::x10::lang::Fun_0_1<TPMGL(U), TPMGL(T)>* init_there,
                                          ::x10::lang::Fun_0_1< ::x10::lang::Place, x10_boolean>* ignoreIfDead) {
    
    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> handle = ::x10::lang::Runtime::template evalAt< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >(
                                                       ::x10::lang::Place::FMGL(FIRST_PLACE__get)(),
                                                       reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >(sizeof(x10_lang_PlaceLocalHandle__closure__7<TPMGL(T),TPMGL(U)>)))x10_lang_PlaceLocalHandle__closure__7<TPMGL(T),TPMGL(U)>())),
                                                       ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    {
        
        //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        ::x10::lang::Runtime::ensureNotInAtomic();
        ::x10::lang::FinishState* x10____var11 = ::x10::lang::Runtime::startFinish();
        {
            ::x10::lang::CheckedThrowable* throwable__103281 =
              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                try {
                    {
                        {
                            ::x10::lang::Iterator< ::x10::lang::Place>* p__74531;
                            for (p__74531 = ::x10aux::nullCheck(pg)->iterator();
                                 ::x10::lang::Iterator< ::x10::lang::Place>::hasNext(::x10aux::nullCheck(p__74531));
                                 ) {
                                ::x10::lang::Place p = ::x10::lang::Iterator< ::x10::lang::Place>::next(::x10aux::nullCheck(p__74531));
                                
                                //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                                TPMGL(U) v = ::x10::lang::Fun_0_1< ::x10::lang::Place, TPMGL(U)>::__apply(::x10aux::nullCheck(init_here), 
                                  p);
                                
                                //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                                if ((!(p->x10::lang::Place::isDead()) ||
                                    !(::x10::lang::Fun_0_1< ::x10::lang::Place, x10_boolean>::__apply(::x10aux::nullCheck(ignoreIfDead), 
                                      p)))) {
                                    
                                    //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                                    ::x10::lang::Runtime::runAsync(
                                      p, reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_PlaceLocalHandle__closure__8<TPMGL(T),TPMGL(U)>)))x10_lang_PlaceLocalHandle__closure__8<TPMGL(T),TPMGL(U)>(handle, init_there, v))),
                                      ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                                }
                                
                            }
                        }
                        
                    }
                }
                catch (::x10::lang::CheckedThrowable* __exc1344) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* __lowerer__var__2__ =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc1344);
                        {
                            ::x10::lang::Runtime::pushException(
                              __lowerer__var__2__);
                            ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make()));
                        }
                    } else
                    throw;
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc1345) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__103282 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1345);
                    {
                        throwable__103281 = formal__103282;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103281)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__103281))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103281));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::stopFinish(x10____var11);
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103281)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__103281)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103281));
                }
                
            }
            
        }
    }
    
    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    return handle;
    
}
template<class TPMGL(T)> ::x10::lang::PlaceLocalHandle<TPMGL(T)>
  x10::lang::PlaceLocalHandle<void>::makeFlat(::x10::lang::PlaceGroup* pg,
                                              ::x10::lang::Fun_0_0<TPMGL(T)>* init) {
    
    //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> handle = ::x10::lang::Runtime::template evalAt< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >(
                                                       ::x10::lang::Place::FMGL(FIRST_PLACE__get)(),
                                                       reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >(sizeof(x10_lang_PlaceLocalHandle__closure__9<TPMGL(T)>)))x10_lang_PlaceLocalHandle__closure__9<TPMGL(T)>())),
                                                       ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    ::x10aux::nullCheck(pg)->broadcastFlat(reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_PlaceLocalHandle__closure__10<TPMGL(T)>)))x10_lang_PlaceLocalHandle__closure__10<TPMGL(T)>(handle, init))));
    
    //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    return handle;
    
}
template<class TPMGL(T)> ::x10::lang::PlaceLocalHandle<TPMGL(T)>
  x10::lang::PlaceLocalHandle<void>::makeFlat(::x10::lang::PlaceGroup* pg,
                                              ::x10::lang::Fun_0_0<TPMGL(T)>* init,
                                              ::x10::lang::Fun_0_1< ::x10::lang::Place, x10_boolean>* ignoreIfDead) {
    
    //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> handle = ::x10::lang::Runtime::template evalAt< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >(
                                                       ::x10::lang::Place::FMGL(FIRST_PLACE__get)(),
                                                       reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >(sizeof(x10_lang_PlaceLocalHandle__closure__11<TPMGL(T)>)))x10_lang_PlaceLocalHandle__closure__11<TPMGL(T)>())),
                                                       ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    ::x10aux::nullCheck(pg)->broadcastFlat(reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_PlaceLocalHandle__closure__12<TPMGL(T)>)))x10_lang_PlaceLocalHandle__closure__12<TPMGL(T)>(handle, init))),
                                           ignoreIfDead);
    
    //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    return handle;
    
}
template<class TPMGL(T), class TPMGL(U)> ::x10::lang::PlaceLocalHandle<TPMGL(T)>
  x10::lang::PlaceLocalHandle<void>::makeFlat(::x10::lang::PlaceGroup* pg,
                                              ::x10::lang::Fun_0_1< ::x10::lang::Place, TPMGL(U)>* init_here,
                                              ::x10::lang::Fun_0_1<TPMGL(U), TPMGL(T)>* init_there) {
    
    //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> handle = ::x10::lang::Runtime::template evalAt< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >(
                                                       ::x10::lang::Place::FMGL(FIRST_PLACE__get)(),
                                                       reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >(sizeof(x10_lang_PlaceLocalHandle__closure__13<TPMGL(T),TPMGL(U)>)))x10_lang_PlaceLocalHandle__closure__13<TPMGL(T),TPMGL(U)>())),
                                                       ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    {
        
        //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        ::x10::lang::Runtime::ensureNotInAtomic();
        ::x10::lang::FinishState* x10____var12 = ::x10::lang::Runtime::startFinish(
                                                   ::x10::compiler::Pragma::FMGL(FINISH_SPMD__get)());
        {
            ::x10::lang::CheckedThrowable* throwable__103284 =
              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                try {
                    {
                        {
                            ::x10::lang::Iterator< ::x10::lang::Place>* p__74533;
                            for (p__74533 = ::x10aux::nullCheck(pg)->iterator();
                                 ::x10::lang::Iterator< ::x10::lang::Place>::hasNext(::x10aux::nullCheck(p__74533));
                                 ) {
                                ::x10::lang::Place p = ::x10::lang::Iterator< ::x10::lang::Place>::next(::x10aux::nullCheck(p__74533));
                                
                                //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                                TPMGL(U) v = ::x10::lang::Fun_0_1< ::x10::lang::Place, TPMGL(U)>::__apply(::x10aux::nullCheck(init_here), 
                                  p);
                                
                                //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                                ::x10::lang::Runtime::runAsync(
                                  p, reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_PlaceLocalHandle__closure__14<TPMGL(T),TPMGL(U)>)))x10_lang_PlaceLocalHandle__closure__14<TPMGL(T),TPMGL(U)>(handle, init_there, v))),
                                  ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                            }
                        }
                        
                    }
                }
                catch (::x10::lang::CheckedThrowable* __exc1350) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* __lowerer__var__2__ =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc1350);
                        {
                            ::x10::lang::Runtime::pushException(
                              __lowerer__var__2__);
                            ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make()));
                        }
                    } else
                    throw;
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc1351) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__103285 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1351);
                    {
                        throwable__103284 = formal__103285;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103284)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__103284))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103284));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::stopFinish(x10____var12);
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103284)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__103284)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103284));
                }
                
            }
            
        }
    }
    
    //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    return handle;
    
}
template<class TPMGL(T), class TPMGL(U)> ::x10::lang::PlaceLocalHandle<TPMGL(T)>
  x10::lang::PlaceLocalHandle<void>::makeFlat(::x10::lang::PlaceGroup* pg,
                                              ::x10::lang::Fun_0_1< ::x10::lang::Place, TPMGL(U)>* init_here,
                                              ::x10::lang::Fun_0_1<TPMGL(U), TPMGL(T)>* init_there,
                                              ::x10::lang::Fun_0_1< ::x10::lang::Place, x10_boolean>* ignoreIfDead) {
    
    //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    ::x10::lang::PlaceLocalHandle<TPMGL(T)> handle = ::x10::lang::Runtime::template evalAt< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >(
                                                       ::x10::lang::Place::FMGL(FIRST_PLACE__get)(),
                                                       reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> >*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::lang::PlaceLocalHandle<TPMGL(T)> > >(sizeof(x10_lang_PlaceLocalHandle__closure__15<TPMGL(T),TPMGL(U)>)))x10_lang_PlaceLocalHandle__closure__15<TPMGL(T),TPMGL(U)>())),
                                                       ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    {
        
        //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
        ::x10::lang::Runtime::ensureNotInAtomic();
        ::x10::lang::FinishState* x10____var13 = ::x10::lang::Runtime::startFinish(
                                                   ::x10::compiler::Pragma::FMGL(FINISH_SPMD__get)());
        {
            ::x10::lang::CheckedThrowable* throwable__103287 =
              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                try {
                    {
                        {
                            ::x10::lang::Iterator< ::x10::lang::Place>* p__74535;
                            for (p__74535 = ::x10aux::nullCheck(pg)->iterator();
                                 ::x10::lang::Iterator< ::x10::lang::Place>::hasNext(::x10aux::nullCheck(p__74535));
                                 ) {
                                ::x10::lang::Place p = ::x10::lang::Iterator< ::x10::lang::Place>::next(::x10aux::nullCheck(p__74535));
                                
                                //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                                TPMGL(U) v = ::x10::lang::Fun_0_1< ::x10::lang::Place, TPMGL(U)>::__apply(::x10aux::nullCheck(init_here), 
                                  p);
                                
                                //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                                if ((!(p->x10::lang::Place::isDead()) ||
                                    !(::x10::lang::Fun_0_1< ::x10::lang::Place, x10_boolean>::__apply(::x10aux::nullCheck(ignoreIfDead), 
                                      p)))) {
                                    
                                    //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
                                    ::x10::lang::Runtime::runAsync(
                                      p, reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_PlaceLocalHandle__closure__16<TPMGL(T),TPMGL(U)>)))x10_lang_PlaceLocalHandle__closure__16<TPMGL(T),TPMGL(U)>(handle, init_there, v))),
                                      ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                                }
                                
                            }
                        }
                        
                    }
                }
                catch (::x10::lang::CheckedThrowable* __exc1354) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* __lowerer__var__2__ =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc1354);
                        {
                            ::x10::lang::Runtime::pushException(
                              __lowerer__var__2__);
                            ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make()));
                        }
                    } else
                    throw;
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc1355) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__103288 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1355);
                    {
                        throwable__103287 = formal__103288;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103287)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__103287))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103287));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::stopFinish(x10____var13);
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__103287)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__103287)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__103287));
                }
                
            }
            
        }
    }
    
    //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    return handle;
    
}
template<class TPMGL(T)> void x10::lang::PlaceLocalHandle<void>::destroy(::x10::lang::PlaceGroup* pg,
                                                                         ::x10::lang::PlaceLocalHandle<TPMGL(T)> plh) {
    
    //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    ::x10aux::nullCheck(pg)->broadcastFlat(reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_PlaceLocalHandle__closure__17<TPMGL(T)>)))x10_lang_PlaceLocalHandle__closure__17<TPMGL(T)>(plh))));
}
template<class TPMGL(T)> void x10::lang::PlaceLocalHandle<void>::destroy(::x10::lang::PlaceGroup* pg,
                                                                         ::x10::lang::PlaceLocalHandle<TPMGL(T)> plh,
                                                                         ::x10::lang::Fun_0_1< ::x10::lang::Place, x10_boolean>* ignoreIfDead) {
    
    //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/PlaceLocalHandle.x10"
    ::x10aux::nullCheck(pg)->broadcastFlat(reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_PlaceLocalHandle__closure__18<TPMGL(T)>)))x10_lang_PlaceLocalHandle__closure__18<TPMGL(T)>(plh))),
                                           ignoreIfDead);
}
#endif // X10_LANG_PLACELOCALHANDLE_H_IMPLEMENTATION
#endif // __X10_LANG_PLACELOCALHANDLE_H_NODEPS
