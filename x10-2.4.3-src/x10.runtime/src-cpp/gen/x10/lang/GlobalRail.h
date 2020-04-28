#ifndef __X10_LANG_GLOBALRAIL_H
#define __X10_LANG_GLOBALRAIL_H

#include <x10rt.h>

#include "x10/lang/RemoteOps.h"

#define X10_LANG_ANY_H_NODEPS
#include <x10/lang/Any.h>
#undef X10_LANG_ANY_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_GLOBALREF_H_NODEPS
#include <x10/lang/GlobalRef.h>
#undef X10_LANG_GLOBALREF_H_NODEPS
#define X10_LANG_GLOBALREF_H_NODEPS
#include <x10/lang/GlobalRef.h>
#undef X10_LANG_GLOBALREF_H_NODEPS
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace compiler { 
class Native;
} } 
namespace x10 { namespace lang { 
class VoidFun_0_0;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace lang { 
class Runtime__Profile;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace compiler { 
class NonEscaping;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace compiler { 
class NativeCPPInclude;
} } 
namespace x10 { namespace lang { 

template<class TPMGL(T)> class GlobalRail   {
    public:
    RTT_H_DECLS_STRUCT
    
    ::x10::lang::GlobalRail<TPMGL(T)>* operator->() { return this; }
    
    x10_long FMGL(size);
    
    ::x10::lang::GlobalRef< ::x10::lang::Rail< TPMGL(T) >* > FMGL(rail);
    
    static ::x10aux::itable_entry _itables[2];
    
    ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static ::x10::lang::Any::itable< ::x10::lang::GlobalRail<TPMGL(T)> > _itable_0;
    
    static ::x10aux::itable_entry _iboxitables[2];
    
    ::x10aux::itable_entry* _getIBoxITables() { return _iboxitables; }
    
    static ::x10::lang::GlobalRail<TPMGL(T)> _alloc(){::x10::lang::GlobalRail<TPMGL(T)> t; return t; }
    
    ::x10::lang::Place home();
    void _constructor(::x10::lang::Rail< TPMGL(T) >* a);
    
    static ::x10::lang::GlobalRail<TPMGL(T)> _make(::x10::lang::Rail< TPMGL(T) >* a);
    
    void _constructor(x10_long size, ::x10::lang::GlobalRef< ::x10::lang::Rail< TPMGL(T) >* > raw);
    
    static ::x10::lang::GlobalRail<TPMGL(T)> _make(x10_long size, ::x10::lang::GlobalRef< ::x10::lang::Rail< TPMGL(T) >* > raw);
    
    TPMGL(T) __apply(x10_long index);
    TPMGL(T) __set(x10_long index, TPMGL(T) v);
    ::x10::lang::Rail< TPMGL(T) >* __apply();
    ::x10::lang::String* typeName();
    ::x10::lang::String* toString();
    x10_int hashCode();
    x10_boolean equals(::x10::lang::Any* other);
    x10_boolean equals(::x10::lang::GlobalRail<TPMGL(T)> other);
    x10_boolean _struct_equals(::x10::lang::Any* other);
    x10_boolean _struct_equals(::x10::lang::GlobalRail<TPMGL(T)> other);
    ::x10::lang::GlobalRail<TPMGL(T)> x10__lang__GlobalRail____this__x10__lang__GlobalRail(
      );
    void __fieldInitializers_x10_lang_GlobalRail();
    
    static void _serialize(::x10::lang::GlobalRail<TPMGL(T)> this_, ::x10aux::serialization_buffer& buf);
    
    static ::x10::lang::GlobalRail<TPMGL(T)> _deserialize(::x10aux::deserialization_buffer& buf) {
        ::x10::lang::GlobalRail<TPMGL(T)> this_;
        this_->_deserialize_body(buf);
        return this_;
    }
    
    void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

template<class TPMGL(T)> ::x10aux::RuntimeType x10::lang::GlobalRail<TPMGL(T)>::rtt;
template<class TPMGL(T)> void x10::lang::GlobalRail<TPMGL(T)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::lang::GlobalRail<void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Any>()};
    const ::x10aux::RuntimeType* params[1] = { ::x10aux::getRTT<TPMGL(T)>()};
    ::x10aux::RuntimeType::Variance variances[1] = { ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.lang.GlobalRail";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::struct_kind, 1, parents, 1, params, variances);
}

template <> class GlobalRail<void> {
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    static void remoteAdd(::x10::lang::GlobalRail<x10_ulong> target,
                          x10_long idx, x10_ulong v);
    
    static void remoteAdd(::x10::lang::GlobalRail<x10_long> target,
                          x10_long idx, x10_long v);
    
    static void remoteAnd(::x10::lang::GlobalRail<x10_ulong> target,
                          x10_long idx, x10_ulong v);
    
    static void remoteAnd(::x10::lang::GlobalRail<x10_long> target,
                          x10_long idx, x10_long v);
    
    static void remoteOr(::x10::lang::GlobalRail<x10_ulong> target,
                         x10_long idx, x10_ulong v);
    
    static void remoteOr(::x10::lang::GlobalRail<x10_long> target,
                         x10_long idx, x10_long v);
    
    static void remoteXor(::x10::lang::GlobalRail<x10_ulong> target,
                          x10_long idx, x10_ulong v);
    
    static void remoteXor(::x10::lang::GlobalRail<x10_long> target,
                          x10_long idx, x10_long v);
    
    
};

} } 
#endif // X10_LANG_GLOBALRAIL_H

namespace x10 { namespace lang { 
template<class TPMGL(T)> class GlobalRail;
} } 

#ifndef X10_LANG_GLOBALRAIL_H_NODEPS
#define X10_LANG_GLOBALRAIL_H_NODEPS
#include <x10/lang/Any.h>
#include <x10/lang/Long.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Place.h>
#include <x10/lang/Runtime.h>
#include <x10/compiler/Native.h>
#include <x10/lang/ULong.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/Int.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/lang/String.h>
#include <x10/compiler/NonEscaping.h>
#include <x10/compiler/Synthetic.h>
#include <x10/lang/Boolean.h>
#include <x10/compiler/NativeCPPInclude.h>
#ifndef X10_LANG_GLOBALRAIL_H_GENERICS
#define X10_LANG_GLOBALRAIL_H_GENERICS
#endif // X10_LANG_GLOBALRAIL_H_GENERICS
#ifndef X10_LANG_GLOBALRAIL_H_IMPLEMENTATION
#define X10_LANG_GLOBALRAIL_H_IMPLEMENTATION
#include <x10/lang/GlobalRail.h>

#ifndef X10_LANG_GLOBALRAIL__CLOSURE__1_CLOSURE
#define X10_LANG_GLOBALRAIL__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_GlobalRail__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_GlobalRail__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            ::x10::lang::GlobalRail<x10_ulong> a__102895 = target;
            x10_long i__102896 = idx;
            x10_ulong r__102897 = ((x10_ulong) ((a__102895->x10::lang::GlobalRail<x10_ulong>::__apply(
                                                   i__102896)) + (v)));
            a__102895->x10::lang::GlobalRail<x10_ulong>::__set(i__102896,
                                                               r__102897);
        }
        catch (::x10::lang::CheckedThrowable* __exc1165) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1165);
                {
                    x10_int __lowerer__var__1__ = ::x10aux::class_cast_unchecked<x10_int>(::x10::lang::Runtime::wrapAtChecked< x10_int >(
                                                                                            __lowerer__var__0__));
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::GlobalRail<x10_ulong> target;
    x10_long idx;
    x10_ulong v;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->target);
        buf.write(this->idx);
        buf.write(this->v);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_GlobalRail__closure__1* storage = ::x10aux::alloc_z<x10_lang_GlobalRail__closure__1>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRail<x10_ulong> that_target = buf.read< ::x10::lang::GlobalRail<x10_ulong> >();
        x10_long that_idx = buf.read<x10_long>();
        x10_ulong that_v = buf.read<x10_ulong>();
        x10_lang_GlobalRail__closure__1* this_ = new (storage) x10_lang_GlobalRail__closure__1(that_target, that_idx, that_v);
        return this_;
    }
    
    x10_lang_GlobalRail__closure__1(::x10::lang::GlobalRail<x10_ulong> target, x10_long idx, x10_ulong v) : target(target), idx(idx), v(v) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10:107";
    }

};

#endif // X10_LANG_GLOBALRAIL__CLOSURE__1_CLOSURE
#ifndef X10_LANG_GLOBALRAIL__CLOSURE__2_CLOSURE
#define X10_LANG_GLOBALRAIL__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_GlobalRail__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_GlobalRail__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            ::x10::lang::GlobalRail<x10_long> a__102898 = target;
            x10_long i__102899 = idx;
            x10_long r__102900 = ((a__102898->x10::lang::GlobalRail<x10_long>::__apply(
                                     i__102899)) + (v));
            a__102898->x10::lang::GlobalRail<x10_long>::__set(i__102899,
                                                              r__102900);
        }
        catch (::x10::lang::CheckedThrowable* __exc1166) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1166);
                {
                    x10_int __lowerer__var__1__ = ::x10aux::class_cast_unchecked<x10_int>(::x10::lang::Runtime::wrapAtChecked< x10_int >(
                                                                                            __lowerer__var__0__));
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::GlobalRail<x10_long> target;
    x10_long idx;
    x10_long v;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->target);
        buf.write(this->idx);
        buf.write(this->v);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_GlobalRail__closure__2* storage = ::x10aux::alloc_z<x10_lang_GlobalRail__closure__2>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRail<x10_long> that_target = buf.read< ::x10::lang::GlobalRail<x10_long> >();
        x10_long that_idx = buf.read<x10_long>();
        x10_long that_v = buf.read<x10_long>();
        x10_lang_GlobalRail__closure__2* this_ = new (storage) x10_lang_GlobalRail__closure__2(that_target, that_idx, that_v);
        return this_;
    }
    
    x10_lang_GlobalRail__closure__2(::x10::lang::GlobalRail<x10_long> target, x10_long idx, x10_long v) : target(target), idx(idx), v(v) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10:113";
    }

};

#endif // X10_LANG_GLOBALRAIL__CLOSURE__2_CLOSURE
#ifndef X10_LANG_GLOBALRAIL__CLOSURE__3_CLOSURE
#define X10_LANG_GLOBALRAIL__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_GlobalRail__closure__3 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_GlobalRail__closure__3> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            ::x10::lang::GlobalRail<x10_ulong> a__102901 = target;
            x10_long i__102902 = idx;
            x10_ulong r__102903 = ((x10_ulong) ((a__102901->x10::lang::GlobalRail<x10_ulong>::__apply(
                                                   i__102902)) & (v)));
            a__102901->x10::lang::GlobalRail<x10_ulong>::__set(i__102902,
                                                               r__102903);
        }
        catch (::x10::lang::CheckedThrowable* __exc1167) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1167);
                {
                    x10_int __lowerer__var__1__ = ::x10aux::class_cast_unchecked<x10_int>(::x10::lang::Runtime::wrapAtChecked< x10_int >(
                                                                                            __lowerer__var__0__));
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::GlobalRail<x10_ulong> target;
    x10_long idx;
    x10_ulong v;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->target);
        buf.write(this->idx);
        buf.write(this->v);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_GlobalRail__closure__3* storage = ::x10aux::alloc_z<x10_lang_GlobalRail__closure__3>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRail<x10_ulong> that_target = buf.read< ::x10::lang::GlobalRail<x10_ulong> >();
        x10_long that_idx = buf.read<x10_long>();
        x10_ulong that_v = buf.read<x10_ulong>();
        x10_lang_GlobalRail__closure__3* this_ = new (storage) x10_lang_GlobalRail__closure__3(that_target, that_idx, that_v);
        return this_;
    }
    
    x10_lang_GlobalRail__closure__3(::x10::lang::GlobalRail<x10_ulong> target, x10_long idx, x10_ulong v) : target(target), idx(idx), v(v) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10:119";
    }

};

#endif // X10_LANG_GLOBALRAIL__CLOSURE__3_CLOSURE
#ifndef X10_LANG_GLOBALRAIL__CLOSURE__4_CLOSURE
#define X10_LANG_GLOBALRAIL__CLOSURE__4_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_GlobalRail__closure__4 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_GlobalRail__closure__4> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            ::x10::lang::GlobalRail<x10_long> a__102904 = target;
            x10_long i__102905 = idx;
            x10_long r__102906 = ((a__102904->x10::lang::GlobalRail<x10_long>::__apply(
                                     i__102905)) & (v));
            a__102904->x10::lang::GlobalRail<x10_long>::__set(i__102905,
                                                              r__102906);
        }
        catch (::x10::lang::CheckedThrowable* __exc1168) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1168);
                {
                    x10_int __lowerer__var__1__ = ::x10aux::class_cast_unchecked<x10_int>(::x10::lang::Runtime::wrapAtChecked< x10_int >(
                                                                                            __lowerer__var__0__));
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::GlobalRail<x10_long> target;
    x10_long idx;
    x10_long v;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->target);
        buf.write(this->idx);
        buf.write(this->v);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_GlobalRail__closure__4* storage = ::x10aux::alloc_z<x10_lang_GlobalRail__closure__4>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRail<x10_long> that_target = buf.read< ::x10::lang::GlobalRail<x10_long> >();
        x10_long that_idx = buf.read<x10_long>();
        x10_long that_v = buf.read<x10_long>();
        x10_lang_GlobalRail__closure__4* this_ = new (storage) x10_lang_GlobalRail__closure__4(that_target, that_idx, that_v);
        return this_;
    }
    
    x10_lang_GlobalRail__closure__4(::x10::lang::GlobalRail<x10_long> target, x10_long idx, x10_long v) : target(target), idx(idx), v(v) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10:125";
    }

};

#endif // X10_LANG_GLOBALRAIL__CLOSURE__4_CLOSURE
#ifndef X10_LANG_GLOBALRAIL__CLOSURE__5_CLOSURE
#define X10_LANG_GLOBALRAIL__CLOSURE__5_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_GlobalRail__closure__5 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_GlobalRail__closure__5> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            ::x10::lang::GlobalRail<x10_ulong> a__102907 = target;
            x10_long i__102908 = idx;
            x10_ulong r__102909 = ((x10_ulong) ((a__102907->x10::lang::GlobalRail<x10_ulong>::__apply(
                                                   i__102908)) | (v)));
            a__102907->x10::lang::GlobalRail<x10_ulong>::__set(i__102908,
                                                               r__102909);
        }
        catch (::x10::lang::CheckedThrowable* __exc1169) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1169);
                {
                    x10_int __lowerer__var__1__ = ::x10aux::class_cast_unchecked<x10_int>(::x10::lang::Runtime::wrapAtChecked< x10_int >(
                                                                                            __lowerer__var__0__));
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::GlobalRail<x10_ulong> target;
    x10_long idx;
    x10_ulong v;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->target);
        buf.write(this->idx);
        buf.write(this->v);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_GlobalRail__closure__5* storage = ::x10aux::alloc_z<x10_lang_GlobalRail__closure__5>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRail<x10_ulong> that_target = buf.read< ::x10::lang::GlobalRail<x10_ulong> >();
        x10_long that_idx = buf.read<x10_long>();
        x10_ulong that_v = buf.read<x10_ulong>();
        x10_lang_GlobalRail__closure__5* this_ = new (storage) x10_lang_GlobalRail__closure__5(that_target, that_idx, that_v);
        return this_;
    }
    
    x10_lang_GlobalRail__closure__5(::x10::lang::GlobalRail<x10_ulong> target, x10_long idx, x10_ulong v) : target(target), idx(idx), v(v) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10:131";
    }

};

#endif // X10_LANG_GLOBALRAIL__CLOSURE__5_CLOSURE
#ifndef X10_LANG_GLOBALRAIL__CLOSURE__6_CLOSURE
#define X10_LANG_GLOBALRAIL__CLOSURE__6_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_GlobalRail__closure__6 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_GlobalRail__closure__6> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            ::x10::lang::GlobalRail<x10_long> a__102910 = target;
            x10_long i__102911 = idx;
            x10_long r__102912 = ((a__102910->x10::lang::GlobalRail<x10_long>::__apply(
                                     i__102911)) | (v));
            a__102910->x10::lang::GlobalRail<x10_long>::__set(i__102911,
                                                              r__102912);
        }
        catch (::x10::lang::CheckedThrowable* __exc1170) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1170);
                {
                    x10_int __lowerer__var__1__ = ::x10aux::class_cast_unchecked<x10_int>(::x10::lang::Runtime::wrapAtChecked< x10_int >(
                                                                                            __lowerer__var__0__));
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::GlobalRail<x10_long> target;
    x10_long idx;
    x10_long v;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->target);
        buf.write(this->idx);
        buf.write(this->v);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_GlobalRail__closure__6* storage = ::x10aux::alloc_z<x10_lang_GlobalRail__closure__6>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRail<x10_long> that_target = buf.read< ::x10::lang::GlobalRail<x10_long> >();
        x10_long that_idx = buf.read<x10_long>();
        x10_long that_v = buf.read<x10_long>();
        x10_lang_GlobalRail__closure__6* this_ = new (storage) x10_lang_GlobalRail__closure__6(that_target, that_idx, that_v);
        return this_;
    }
    
    x10_lang_GlobalRail__closure__6(::x10::lang::GlobalRail<x10_long> target, x10_long idx, x10_long v) : target(target), idx(idx), v(v) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10:137";
    }

};

#endif // X10_LANG_GLOBALRAIL__CLOSURE__6_CLOSURE
#ifndef X10_LANG_GLOBALRAIL__CLOSURE__7_CLOSURE
#define X10_LANG_GLOBALRAIL__CLOSURE__7_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_GlobalRail__closure__7 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_GlobalRail__closure__7> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            ::x10::lang::GlobalRail<x10_ulong> a__102913 = target;
            x10_long i__102914 = idx;
            x10_ulong r__102915 = ((x10_ulong) ((a__102913->x10::lang::GlobalRail<x10_ulong>::__apply(
                                                   i__102914)) ^ (v)));
            a__102913->x10::lang::GlobalRail<x10_ulong>::__set(i__102914,
                                                               r__102915);
        }
        catch (::x10::lang::CheckedThrowable* __exc1171) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1171);
                {
                    x10_int __lowerer__var__1__ = ::x10aux::class_cast_unchecked<x10_int>(::x10::lang::Runtime::wrapAtChecked< x10_int >(
                                                                                            __lowerer__var__0__));
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::GlobalRail<x10_ulong> target;
    x10_long idx;
    x10_ulong v;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->target);
        buf.write(this->idx);
        buf.write(this->v);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_GlobalRail__closure__7* storage = ::x10aux::alloc_z<x10_lang_GlobalRail__closure__7>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRail<x10_ulong> that_target = buf.read< ::x10::lang::GlobalRail<x10_ulong> >();
        x10_long that_idx = buf.read<x10_long>();
        x10_ulong that_v = buf.read<x10_ulong>();
        x10_lang_GlobalRail__closure__7* this_ = new (storage) x10_lang_GlobalRail__closure__7(that_target, that_idx, that_v);
        return this_;
    }
    
    x10_lang_GlobalRail__closure__7(::x10::lang::GlobalRail<x10_ulong> target, x10_long idx, x10_ulong v) : target(target), idx(idx), v(v) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10:143";
    }

};

#endif // X10_LANG_GLOBALRAIL__CLOSURE__7_CLOSURE
#ifndef X10_LANG_GLOBALRAIL__CLOSURE__8_CLOSURE
#define X10_LANG_GLOBALRAIL__CLOSURE__8_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_GlobalRail__closure__8 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_GlobalRail__closure__8> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            ::x10::lang::GlobalRail<x10_long> a__102916 = target;
            x10_long i__102917 = idx;
            x10_long r__102918 = ((a__102916->x10::lang::GlobalRail<x10_long>::__apply(
                                     i__102917)) ^ (v));
            a__102916->x10::lang::GlobalRail<x10_long>::__set(i__102917,
                                                              r__102918);
        }
        catch (::x10::lang::CheckedThrowable* __exc1172) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1172);
                {
                    x10_int __lowerer__var__1__ = ::x10aux::class_cast_unchecked<x10_int>(::x10::lang::Runtime::wrapAtChecked< x10_int >(
                                                                                            __lowerer__var__0__));
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::GlobalRail<x10_long> target;
    x10_long idx;
    x10_long v;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->target);
        buf.write(this->idx);
        buf.write(this->v);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_GlobalRail__closure__8* storage = ::x10aux::alloc_z<x10_lang_GlobalRail__closure__8>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRail<x10_long> that_target = buf.read< ::x10::lang::GlobalRail<x10_long> >();
        x10_long that_idx = buf.read<x10_long>();
        x10_long that_v = buf.read<x10_long>();
        x10_lang_GlobalRail__closure__8* this_ = new (storage) x10_lang_GlobalRail__closure__8(that_target, that_idx, that_v);
        return this_;
    }
    
    x10_lang_GlobalRail__closure__8(::x10::lang::GlobalRail<x10_long> target, x10_long idx, x10_long v) : target(target), idx(idx), v(v) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10:149";
    }

};

#endif // X10_LANG_GLOBALRAIL__CLOSURE__8_CLOSURE

//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"

//#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
namespace x10 { namespace lang { 
template<class TPMGL(T)> class GlobalRail_ibox0 : public ::x10::lang::IBox< ::x10::lang::GlobalRail<TPMGL(T)> > {
public:
    static ::x10::lang::Any::itable< GlobalRail_ibox0<TPMGL(T)> > itable;
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
template<class TPMGL(T)> ::x10::lang::Any::itable< GlobalRail_ibox0<TPMGL(T)> >  GlobalRail_ibox0<TPMGL(T)>::itable(&GlobalRail_ibox0<TPMGL(T)>::equals, &GlobalRail_ibox0<TPMGL(T)>::hashCode, &GlobalRail_ibox0<TPMGL(T)>::toString, &GlobalRail_ibox0<TPMGL(T)>::typeName);
} } 
template<class TPMGL(T)> ::x10::lang::Any::itable< ::x10::lang::GlobalRail<TPMGL(T)> >  x10::lang::GlobalRail<TPMGL(T)>::_itable_0(&x10::lang::GlobalRail<TPMGL(T)>::equals, &x10::lang::GlobalRail<TPMGL(T)>::hashCode, &x10::lang::GlobalRail<TPMGL(T)>::toString, &x10::lang::GlobalRail<TPMGL(T)>::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10::lang::GlobalRail<TPMGL(T)>::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &x10::lang::GlobalRail<TPMGL(T)>::_itable_0), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::GlobalRail<TPMGL(T)>")};
template<class TPMGL(T)> ::x10aux::itable_entry x10::lang::GlobalRail<TPMGL(T)>::_iboxitables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &x10::lang::GlobalRail_ibox0<TPMGL(T)>::itable), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::GlobalRail<TPMGL(T)>")};

//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
template<class TPMGL(T)> ::x10::lang::Place x10::lang::GlobalRail<TPMGL(T)>::home(
  ) {
    return ::x10::lang::Place::place(((*this)->FMGL(rail))->location);
    
}

//#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
template<class TPMGL(T)> void x10::lang::GlobalRail<TPMGL(T)>::_constructor(
                           ::x10::lang::Rail< TPMGL(T) >* a) {
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    FMGL(size) = (x10_long)(::x10aux::nullCheck(a)->FMGL(size));
    FMGL(rail) = ::x10::lang::GlobalRef< ::x10::lang::Rail< TPMGL(T) >* >(a);
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    ::x10::lang::GlobalRail<TPMGL(T)> this__102893 = (*this);
    
}
template<class TPMGL(T)> ::x10::lang::GlobalRail<TPMGL(T)> x10::lang::GlobalRail<TPMGL(T)>::_make(
                           ::x10::lang::Rail< TPMGL(T) >* a)
{
    ::x10::lang::GlobalRail<TPMGL(T)> this_; 
    this_->_constructor(a);
    return this_;
}



//#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
template<class TPMGL(T)> void x10::lang::GlobalRail<TPMGL(T)>::_constructor(
                           x10_long size, ::x10::lang::GlobalRef< ::x10::lang::Rail< TPMGL(T) >* > raw) {
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    FMGL(size) = size;
    FMGL(rail) = raw;
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    ::x10::lang::GlobalRail<TPMGL(T)> this__102894 = (*this);
    
}
template<class TPMGL(T)> ::x10::lang::GlobalRail<TPMGL(T)> x10::lang::GlobalRail<TPMGL(T)>::_make(
                           x10_long size, ::x10::lang::GlobalRef< ::x10::lang::Rail< TPMGL(T) >* > raw)
{
    ::x10::lang::GlobalRail<TPMGL(T)> this_; 
    this_->_constructor(size, raw);
    return this_;
}



//#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
template<class TPMGL(T)> TPMGL(T) x10::lang::GlobalRail<TPMGL(T)>::__apply(
  x10_long index) {
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    return (*this)->x10::lang::template GlobalRail<TPMGL(T)>::__apply()->x10::lang::template Rail< TPMGL(T) >::__apply(
             index);
    
}

//#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
template<class TPMGL(T)> TPMGL(T) x10::lang::GlobalRail<TPMGL(T)>::__set(
  x10_long index, TPMGL(T) v) {
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    return (*this)->x10::lang::template GlobalRail<TPMGL(T)>::__apply()->x10::lang::template Rail< TPMGL(T) >::__set(
             index, v);
    
}

//#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
template<class TPMGL(T)> ::x10::lang::Rail< TPMGL(T) >* x10::lang::GlobalRail<TPMGL(T)>::__apply(
  ) {
    
    //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    return ((*this)->FMGL(rail))->__apply();
    
}

//#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"

//#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"

//#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"

//#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"

//#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"

//#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"

//#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"

//#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"

//#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"

//#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
template<class TPMGL(T)> ::x10::lang::String* x10::lang::GlobalRail<TPMGL(T)>::typeName(
  ){
    return ::x10aux::type_name((*this));
}
template<class TPMGL(T)> ::x10::lang::String* x10::lang::GlobalRail<TPMGL(T)>::toString(
  ) {
    return ::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124976 = ::x10aux::makeStringLit("struct x10.lang.GlobalRail:"); strLit__124976; })), (__extension__ ({ static ::x10::lang::String* strLit__124977 = ::x10aux::makeStringLit(" size="); strLit__124977; }))), (*this)->FMGL(size)), (__extension__ ({ static ::x10::lang::String* strLit__124978 = ::x10aux::makeStringLit(" rail="); strLit__124978; }))), (*this)->FMGL(rail));
    
}
template<class TPMGL(T)> x10_int x10::lang::GlobalRail<TPMGL(T)>::hashCode(
  ) {
    x10_int result = ((x10_int)1);
    result = ((((((x10_int)8191)) * (result))) + (::x10aux::hash_code((*this)->FMGL(size))));
    result = ((((((x10_int)8191)) * (result))) + (((*this)->FMGL(rail))->hashCode()));
    return result;
    
}
template<class TPMGL(T)> x10_boolean x10::lang::GlobalRail<TPMGL(T)>::equals(
  ::x10::lang::Any* other) {
    if (!(::x10aux::instanceof< ::x10::lang::GlobalRail<TPMGL(T)> >(other)))
    {
        return false;
        
    }
    return (*this)->x10::lang::template GlobalRail<TPMGL(T)>::equals(
             ::x10aux::class_cast< ::x10::lang::GlobalRail<TPMGL(T)> >(other));
    
}
template<class TPMGL(T)> x10_boolean x10::lang::GlobalRail<TPMGL(T)>::equals(
  ::x10::lang::GlobalRail<TPMGL(T)> other) {
    return ((::x10aux::struct_equals((*this)->FMGL(size),
                                     other->FMGL(size))) &&
    (::x10aux::struct_equals((*this)->FMGL(rail), other->FMGL(rail))));
    
}
template<class TPMGL(T)> x10_boolean x10::lang::GlobalRail<TPMGL(T)>::_struct_equals(
  ::x10::lang::Any* other) {
    if (!(::x10aux::instanceof< ::x10::lang::GlobalRail<TPMGL(T)> >(other)))
    {
        return false;
        
    }
    return (*this)->x10::lang::template GlobalRail<TPMGL(T)>::_struct_equals(
             ::x10aux::class_cast< ::x10::lang::GlobalRail<TPMGL(T)> >(other));
    
}
template<class TPMGL(T)> x10_boolean x10::lang::GlobalRail<TPMGL(T)>::_struct_equals(
  ::x10::lang::GlobalRail<TPMGL(T)> other) {
    return ((::x10aux::struct_equals((*this)->FMGL(size),
                                     other->FMGL(size))) &&
    (::x10aux::struct_equals((*this)->FMGL(rail), other->FMGL(rail))));
    
}

//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
template<class TPMGL(T)> ::x10::lang::GlobalRail<TPMGL(T)>
  x10::lang::GlobalRail<TPMGL(T)>::x10__lang__GlobalRail____this__x10__lang__GlobalRail(
  ) {
    return (*this);
    
}
template<class TPMGL(T)> void x10::lang::GlobalRail<TPMGL(T)>::__fieldInitializers_x10_lang_GlobalRail(
  ) {
 
}
template<class TPMGL(T)> void ::x10::lang::GlobalRail<TPMGL(T)>::_serialize(::x10::lang::GlobalRail<TPMGL(T)> this_, ::x10aux::serialization_buffer& buf) {
    buf.write(this_->FMGL(size));
    buf.write(this_->FMGL(rail));
    
}

template<class TPMGL(T)> void ::x10::lang::GlobalRail<TPMGL(T)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(size) = buf.read<x10_long>();
    FMGL(rail) = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Rail< TPMGL(T) >* > >();
}


#endif // X10_LANG_GLOBALRAIL_H_IMPLEMENTATION
#endif // __X10_LANG_GLOBALRAIL_H_NODEPS
