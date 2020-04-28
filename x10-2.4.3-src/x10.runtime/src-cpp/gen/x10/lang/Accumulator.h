#ifndef __X10_LANG_ACCUMULATOR_H
#define __X10_LANG_ACCUMULATOR_H

#include <x10rt.h>


#define X10_LANG_ACC_H_NODEPS
#include <x10/lang/Acc.h>
#undef X10_LANG_ACC_H_NODEPS
#define X10_IO_CUSTOMSERIALIZATION_H_NODEPS
#include <x10/io/CustomSerialization.h>
#undef X10_IO_CUSTOMSERIALIZATION_H_NODEPS
#define X10_LANG_GLOBALREF_H_NODEPS
#include <x10/lang/GlobalRef.h>
#undef X10_LANG_GLOBALREF_H_NODEPS
#define X10_LANG_GLOBALREF_H_NODEPS
#include <x10/lang/GlobalRef.h>
#undef X10_LANG_GLOBALREF_H_NODEPS
namespace x10 { namespace compiler { 
class NonEscaping;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Reducible;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace lang { 
class Runtime__Worker;
} } 
namespace x10 { namespace lang { 
class Thread;
} } 
namespace x10 { namespace io { 
class Deserializer;
} } 
namespace x10 { namespace io { 
class Serializer;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
class VoidFun_0_0;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
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
class Runtime__Profile;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(U)> class Fun_0_0;
} } 
namespace x10 { namespace lang { 
class IllegalOperationException;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 

template<class TPMGL(T)> class Accumulator;
template <> class Accumulator<void>;
template<class TPMGL(T)> class Accumulator : public ::x10::lang::Acc   {
    public:
    RTT_H_DECLS_CLASS
    
    static ::x10aux::itable_entry _itables[3];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static ::x10::io::CustomSerialization::itable< ::x10::lang::Accumulator<TPMGL(T)> > _itable_0;
    
    static ::x10::lang::Any::itable< ::x10::lang::Accumulator<TPMGL(T)> > _itable_1;
    
    ::x10::lang::GlobalRef< ::x10::lang::Acc* > FMGL(root);
    
    TPMGL(T) FMGL(curr);
    
    ::x10::lang::Reducible<TPMGL(T)>* FMGL(red);
    
    void _constructor(::x10::lang::Reducible<TPMGL(T)>* red);
    
    static ::x10::lang::Accumulator<TPMGL(T)>* _make(::x10::lang::Reducible<TPMGL(T)>* red);
    
    void _constructor(::x10::io::Deserializer* ds);
    
    static ::x10::lang::Accumulator<TPMGL(T)>* _make(::x10::io::Deserializer* ds);
    
    virtual void serialize(::x10::io::Serializer* s);
    virtual ::x10::lang::Accumulator<TPMGL(T)>* me();
    virtual void __larrow(TPMGL(T) t);
    virtual void __set(TPMGL(T) t);
    TPMGL(T) localGetResult();
    virtual TPMGL(T) __apply();
    virtual void supply(::x10::lang::Any* t);
    virtual void reset(::x10::lang::Any* t);
    virtual ::x10::lang::Any* result();
    virtual ::x10::lang::Any* calcResult();
    virtual void acceptResult(::x10::lang::Any* a);
    virtual ::x10::lang::GlobalRef< ::x10::lang::Acc* > getRoot();
    virtual ::x10::lang::Place home();
    virtual ::x10::lang::Accumulator<TPMGL(T)>* x10__lang__Accumulator____this__x10__lang__Accumulator(
      );
    virtual void __fieldInitializers_x10_lang_Accumulator();
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: virtual ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

template<class TPMGL(T)> ::x10aux::RuntimeType x10::lang::Accumulator<TPMGL(T)>::rtt;
template<class TPMGL(T)> void x10::lang::Accumulator<TPMGL(T)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::lang::Accumulator<void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::Acc>(), ::x10aux::getRTT< ::x10::io::CustomSerialization>()};
    const ::x10aux::RuntimeType* params[1] = { ::x10aux::getRTT<TPMGL(T)>()};
    ::x10aux::RuntimeType::Variance variances[1] = { ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.lang.Accumulator";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 2, parents, 1, params, variances);
}

template <> class Accumulator<void> : public ::x10::lang::Acc {
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    static void MYPRINT(::x10::lang::String* msg);
    
    
};

} } 
#endif // X10_LANG_ACCUMULATOR_H

namespace x10 { namespace lang { 
template<class TPMGL(T)> class Accumulator;
} } 

#ifndef X10_LANG_ACCUMULATOR_H_NODEPS
#define X10_LANG_ACCUMULATOR_H_NODEPS
#include <x10/lang/Acc.h>
#include <x10/io/CustomSerialization.h>
#include <x10/lang/GlobalRef.h>
#include <x10/compiler/NonEscaping.h>
#include <x10/lang/Reducible.h>
#include <x10/lang/String.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Any.h>
#include <x10/lang/Runtime__Worker.h>
#include <x10/lang/Int.h>
#include <x10/lang/Thread.h>
#include <x10/io/Deserializer.h>
#include <x10/io/Serializer.h>
#include <x10/lang/Place.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/lang/IllegalOperationException.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_ACCUMULATOR_H_GENERICS
#define X10_LANG_ACCUMULATOR_H_GENERICS
#endif // X10_LANG_ACCUMULATOR_H_GENERICS
#ifndef X10_LANG_ACCUMULATOR_H_IMPLEMENTATION
#define X10_LANG_ACCUMULATOR_H_IMPLEMENTATION
#include <x10/lang/Accumulator.h>

#ifndef X10_LANG_ACCUMULATOR__CLOSURE__1_CLOSURE
#define X10_LANG_ACCUMULATOR__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_lang_Accumulator__closure__1 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_Accumulator__closure__1<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
            ::x10::lang::Accumulator<TPMGL(T)>* me = saved_this->me();
            {
                
                //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
                ::x10::lang::CheckedThrowable* throwable__88028 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    {
                        ::x10::lang::Runtime::enterAtomic();
                        {
                            
                            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
                            ::x10aux::nullCheck(me)->FMGL(curr) = ::x10::lang::Reducible<TPMGL(T)>::__apply(::x10aux::nullCheck(::x10aux::nullCheck(me)->FMGL(red)), 
                                                                    ::x10aux::nullCheck(me)->FMGL(curr),
                                                                    t);
                        }
                    }
                    ::x10::compiler::Finalization::plausibleThrow();
                }
                catch (::x10::lang::CheckedThrowable* __exc675) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__88029 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc675);
                        {
                            throwable__88028 = formal__88029;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__88028)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__88028))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__88028));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::exitAtomic();
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__88028)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__88028)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__88028));
                    }
                    
                }
                
            }
        }
        catch (::x10::lang::CheckedThrowable* __exc676) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc676);
                {
                    x10_int __lowerer__var__1__ = ::x10aux::class_cast_unchecked<x10_int>(::x10::lang::Runtime::template wrapAtChecked< x10_int >(
                                                                                            __lowerer__var__0__));
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::Accumulator<TPMGL(T)>* saved_this;
    TPMGL(T) t;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->t);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Accumulator__closure__1<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_lang_Accumulator__closure__1<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::Accumulator<TPMGL(T)>* that_saved_this = buf.read< ::x10::lang::Accumulator<TPMGL(T)>*>();
        TPMGL(T) that_t = buf.read<TPMGL(T)>();
        x10_lang_Accumulator__closure__1<TPMGL(T) >* this_ = new (storage) x10_lang_Accumulator__closure__1<TPMGL(T) >(that_saved_this, that_t);
        return this_;
    }
    
    x10_lang_Accumulator__closure__1(::x10::lang::Accumulator<TPMGL(T)>* saved_this, TPMGL(T) t) : saved_this(saved_this), t(t) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10:68-74";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_Accumulator__closure__1<TPMGL(T) > >x10_lang_Accumulator__closure__1<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Accumulator__closure__1<TPMGL(T) >::__apply, &x10_lang_Accumulator__closure__1<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_lang_Accumulator__closure__1<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Accumulator__closure__1<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_Accumulator__closure__1<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Accumulator__closure__1<TPMGL(T) >::_deserialize);

#endif // X10_LANG_ACCUMULATOR__CLOSURE__1_CLOSURE
#ifndef X10_LANG_ACCUMULATOR__CLOSURE__2_CLOSURE
#define X10_LANG_ACCUMULATOR__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_lang_Accumulator__closure__2 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_Accumulator__closure__2<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
            ::x10::lang::Accumulator<TPMGL(T)>* me = saved_this->me();
            {
                
                //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
                ::x10::lang::CheckedThrowable* throwable__88031 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    {
                        ::x10::lang::Runtime::enterAtomic();
                        {
                            
                            //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
                            ::x10aux::nullCheck(me)->FMGL(curr) = t;
                        }
                    }
                    ::x10::compiler::Finalization::plausibleThrow();
                }
                catch (::x10::lang::CheckedThrowable* __exc678) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__88032 = static_cast< ::x10::lang::CheckedThrowable*>(__exc678);
                        {
                            throwable__88031 = formal__88032;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__88031)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__88031))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__88031));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::exitAtomic();
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__88031)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__88031)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__88031));
                    }
                    
                }
                
            }
        }
        catch (::x10::lang::CheckedThrowable* __exc679) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc679);
                {
                    x10_int __lowerer__var__1__ = ::x10aux::class_cast_unchecked<x10_int>(::x10::lang::Runtime::template wrapAtChecked< x10_int >(
                                                                                            __lowerer__var__0__));
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::Accumulator<TPMGL(T)>* saved_this;
    TPMGL(T) t;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->t);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Accumulator__closure__2<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_lang_Accumulator__closure__2<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::Accumulator<TPMGL(T)>* that_saved_this = buf.read< ::x10::lang::Accumulator<TPMGL(T)>*>();
        TPMGL(T) that_t = buf.read<TPMGL(T)>();
        x10_lang_Accumulator__closure__2<TPMGL(T) >* this_ = new (storage) x10_lang_Accumulator__closure__2<TPMGL(T) >(that_saved_this, that_t);
        return this_;
    }
    
    x10_lang_Accumulator__closure__2(::x10::lang::Accumulator<TPMGL(T)>* saved_this, TPMGL(T) t) : saved_this(saved_this), t(t) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10:80-86";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_lang_Accumulator__closure__2<TPMGL(T) > >x10_lang_Accumulator__closure__2<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Accumulator__closure__2<TPMGL(T) >::__apply, &x10_lang_Accumulator__closure__2<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_lang_Accumulator__closure__2<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Accumulator__closure__2<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_Accumulator__closure__2<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Accumulator__closure__2<TPMGL(T) >::_deserialize);

#endif // X10_LANG_ACCUMULATOR__CLOSURE__2_CLOSURE
#ifndef X10_LANG_ACCUMULATOR__CLOSURE__3_CLOSURE
#define X10_LANG_ACCUMULATOR__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T)> class x10_lang_Accumulator__closure__3 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0<TPMGL(T)>::template itable <x10_lang_Accumulator__closure__3<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    TPMGL(T) __apply() {
        try {
            ::x10::lang::Accumulator<TPMGL(T)>* this__88015 = saved_this->me();
            return ::x10aux::nullCheck(this__88015)->FMGL(curr);
            
        }
        catch (::x10::lang::CheckedThrowable* __exc682) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc682);
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
    ::x10::lang::Accumulator<TPMGL(T)>* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Accumulator__closure__3<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_lang_Accumulator__closure__3<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::Accumulator<TPMGL(T)>* that_saved_this = buf.read< ::x10::lang::Accumulator<TPMGL(T)>*>();
        x10_lang_Accumulator__closure__3<TPMGL(T) >* this_ = new (storage) x10_lang_Accumulator__closure__3<TPMGL(T) >(that_saved_this);
        return this_;
    }
    
    x10_lang_Accumulator__closure__3(::x10::lang::Accumulator<TPMGL(T)>* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0<TPMGL(T)> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0<TPMGL(T)> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10:94";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_0<TPMGL(T)>::template itable <x10_lang_Accumulator__closure__3<TPMGL(T) > >x10_lang_Accumulator__closure__3<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Accumulator__closure__3<TPMGL(T) >::__apply, &x10_lang_Accumulator__closure__3<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_lang_Accumulator__closure__3<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0<TPMGL(T)> >, &x10_lang_Accumulator__closure__3<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_lang_Accumulator__closure__3<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Accumulator__closure__3<TPMGL(T) >::_deserialize);

#endif // X10_LANG_ACCUMULATOR__CLOSURE__3_CLOSURE
template<class TPMGL(T)> ::x10::io::CustomSerialization::itable< ::x10::lang::Accumulator<TPMGL(T)> >  x10::lang::Accumulator<TPMGL(T)>::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::lang::Accumulator<TPMGL(T)>::serialize, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10::lang::Any::itable< ::x10::lang::Accumulator<TPMGL(T)> >  x10::lang::Accumulator<TPMGL(T)>::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10::lang::Accumulator<TPMGL(T)>::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::CustomSerialization>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::Accumulator<TPMGL(T)>")};

//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"

//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"

//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"

//#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
template<class TPMGL(T)> void x10::lang::Accumulator<TPMGL(T)>::_constructor(
                           ::x10::lang::Reducible<TPMGL(T)>* red) {
    ::x10::lang::Acc* this__88012 = this;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    ::x10::lang::Accumulator<TPMGL(T)>* this__88011 = this;
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    this->FMGL(red) = red;
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    this->FMGL(root) = ::x10::lang::GlobalRef< ::x10::lang::Acc* >(reinterpret_cast< ::x10::lang::Acc*>(this));
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    this->FMGL(curr) = ::x10::lang::Reducible<TPMGL(T)>::zero(::x10aux::nullCheck(red));
}
template<class TPMGL(T)> ::x10::lang::Accumulator<TPMGL(T)>* x10::lang::Accumulator<TPMGL(T)>::_make(
                           ::x10::lang::Reducible<TPMGL(T)>* red)
{
    ::x10::lang::Accumulator<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::lang::Accumulator<TPMGL(T)> >()) ::x10::lang::Accumulator<TPMGL(T)>();
    this_->_constructor(red);
    return this_;
}



//#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
template<class TPMGL(T)> void x10::lang::Accumulator<TPMGL(T)>::_constructor(
                           ::x10::io::Deserializer* ds) {
    ::x10::lang::Acc* this__88014 = this;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    ::x10::lang::Accumulator<TPMGL(T)>* this__88013 = this;
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    this->FMGL(red) = (::x10aux::class_cast< ::x10::lang::Reducible<TPMGL(T)>*>(::x10aux::nullCheck(ds)->x10::io::Deserializer::readAny()));
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    this->FMGL(root) = (::x10aux::class_cast< ::x10::lang::GlobalRef< ::x10::lang::Acc* > >(::x10aux::nullCheck(ds)->x10::io::Deserializer::readAny()));
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    this->FMGL(curr) = ::x10::lang::Reducible<TPMGL(T)>::zero(::x10aux::nullCheck(this->FMGL(red)));
}
template<class TPMGL(T)> ::x10::lang::Accumulator<TPMGL(T)>* x10::lang::Accumulator<TPMGL(T)>::_make(
                           ::x10::io::Deserializer* ds) {
    ::x10::lang::Accumulator<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::lang::Accumulator<TPMGL(T)> >()) ::x10::lang::Accumulator<TPMGL(T)>();
    this_->_constructor(ds);
    return this_;
}



//#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
template<class TPMGL(T)> void x10::lang::Accumulator<TPMGL(T)>::serialize(
  ::x10::io::Serializer* s) {
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    ::x10aux::nullCheck(s)->x10::io::Serializer::writeAny(
      reinterpret_cast< ::x10::lang::Any*>(this->FMGL(red)));
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    ::x10aux::nullCheck(s)->x10::io::Serializer::writeAny(
      ::x10aux::class_cast_unchecked< ::x10::lang::Any*>(this->FMGL(root)));
}

//#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
template<class TPMGL(T)> ::x10::lang::Accumulator<TPMGL(T)>*
  x10::lang::Accumulator<TPMGL(T)>::me() {
    return ::x10aux::class_cast< ::x10::lang::Accumulator<TPMGL(T)>*>((this->FMGL(root))->__apply());
    
}

//#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
template<class TPMGL(T)> void x10::lang::Accumulator<TPMGL(T)>::__larrow(
  TPMGL(T) t) {
    {
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        ::x10::lang::Runtime::runAt(::x10::lang::Place::place((this->FMGL(root))->location),
                                    reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Accumulator__closure__1<TPMGL(T)>)))x10_lang_Accumulator__closure__1<TPMGL(T)>(this, t))),
                                    ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
}

//#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
template<class TPMGL(T)> void x10::lang::Accumulator<TPMGL(T)>::__set(
  TPMGL(T) t) {
    {
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
        ::x10::lang::Runtime::runAt(::x10::lang::Place::place((this->FMGL(root))->location),
                                    reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Accumulator__closure__2<TPMGL(T)>)))x10_lang_Accumulator__closure__2<TPMGL(T)>(this, t))),
                                    ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
}

//#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
template<class TPMGL(T)> TPMGL(T) x10::lang::Accumulator<TPMGL(T)>::localGetResult(
  ) {
    
    //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    return this->FMGL(curr);
    
}

//#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
template<class TPMGL(T)> TPMGL(T) x10::lang::Accumulator<TPMGL(T)>::__apply(
  ) {
    
    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    return ::x10::lang::Runtime::template evalAt< TPMGL(T) >(
             ::x10::lang::Place::place((this->FMGL(root))->location),
             reinterpret_cast< ::x10::lang::Fun_0_0<TPMGL(T)>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0<TPMGL(T)> >(sizeof(x10_lang_Accumulator__closure__3<TPMGL(T)>)))x10_lang_Accumulator__closure__3<TPMGL(T)>(this))),
             ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
}

//#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
template<class TPMGL(T)> void x10::lang::Accumulator<TPMGL(T)>::supply(
  ::x10::lang::Any* t) {
    
    //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    this->__larrow(::x10aux::class_cast<TPMGL(T)>(t));
}

//#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
template<class TPMGL(T)> void x10::lang::Accumulator<TPMGL(T)>::reset(
  ::x10::lang::Any* t) {
    
    //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    this->__set(::x10aux::class_cast<TPMGL(T)>(t));
}

//#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
template<class TPMGL(T)> ::x10::lang::Any* x10::lang::Accumulator<TPMGL(T)>::result(
  ) {
    
    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
    return ::x10aux::class_cast_unchecked< ::x10::lang::Any*>(this->__apply());
    
}

//#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
template<class TPMGL(T)> ::x10::lang::Any* x10::lang::Accumulator<TPMGL(T)>::calcResult(
  ) {
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::IllegalOperationException::_make()));
}

//#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
template<class TPMGL(T)> void x10::lang::Accumulator<TPMGL(T)>::acceptResult(
  ::x10::lang::Any* a) {
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::IllegalOperationException::_make()));
}

//#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
template<class TPMGL(T)> ::x10::lang::GlobalRef< ::x10::lang::Acc* >
  x10::lang::Accumulator<TPMGL(T)>::getRoot() {
    return this->FMGL(root);
    
}

//#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
template<class TPMGL(T)> ::x10::lang::Place x10::lang::Accumulator<TPMGL(T)>::home(
  ) {
    return ::x10::lang::Place::place((this->FMGL(root))->location);
    
}

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Accumulator.x10"
template<class TPMGL(T)> ::x10::lang::Accumulator<TPMGL(T)>*
  x10::lang::Accumulator<TPMGL(T)>::x10__lang__Accumulator____this__x10__lang__Accumulator(
  ) {
    return this;
    
}
template<class TPMGL(T)> void x10::lang::Accumulator<TPMGL(T)>::__fieldInitializers_x10_lang_Accumulator(
  ) {
 
}
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10::lang::Accumulator<TPMGL(T)>::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::Accumulator<TPMGL(T)>::_deserializer);

template<class TPMGL(T)> void x10::lang::Accumulator<TPMGL(T)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    /* NOTE: Implements x10.io.CustomSerialization */
    ::x10::io::Serializer* x10_buf = ::x10::io::Serializer::_make(&buf);
    this->serialize(x10_buf);
    buf.write(::x10aux::deserialization_buffer::CUSTOM_SERIALIZATION_END);
    
}

template<class TPMGL(T)> ::x10::lang::Reference* ::x10::lang::Accumulator<TPMGL(T)>::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Accumulator<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::lang::Accumulator<TPMGL(T)> >()) ::x10::lang::Accumulator<TPMGL(T)>();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

template<class TPMGL(T)> void x10::lang::Accumulator<TPMGL(T)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    /* NOTE: Implements x10.io.CustomSerialization */
    ::x10::io::Deserializer* x10_buf = ::x10::io::Deserializer::_make(&buf);
    _constructor(x10_buf);
    ::x10aux::serialization_id_t tmp = buf.read< ::x10aux::serialization_id_t>();
    if (tmp != ::x10aux::deserialization_buffer::CUSTOM_SERIALIZATION_END) { ::x10aux::raiseSerializationProtocolError(); }
    
}

#endif // X10_LANG_ACCUMULATOR_H_IMPLEMENTATION
#endif // __X10_LANG_ACCUMULATOR_H_NODEPS
