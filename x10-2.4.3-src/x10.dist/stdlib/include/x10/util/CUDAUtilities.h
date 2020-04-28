#ifndef __X10_UTIL_CUDAUTILITIES_H
#define __X10_UTIL_CUDAUTILITIES_H

#include <x10rt.h>


namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class GlobalRail;
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
class Place;
} } 
namespace x10 { namespace compiler { 
class Native;
} } 
namespace x10 { namespace lang { 
class UnsupportedOperationException;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(U)> class Fun_0_0;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(Z1), class TPMGL(U)> class Fun_0_1;
} } 
namespace x10 { namespace lang { 
class Runtime__Profile;
} } 
namespace x10 { namespace lang { 
class Zero;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class GlobalRef;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace util { 

class CUDAUtilities : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    static x10_int autoBlocks();
    static x10_int autoThreads();
    template<class TPMGL(T)> static void initCUDARail(::x10::lang::Rail< TPMGL(T) >* local,
                                                      ::x10::lang::GlobalRail<TPMGL(T)> remote,
                                                      x10_long numElements);
    template<class TPMGL(T)> static ::x10::lang::GlobalRail<TPMGL(T)>
      makeCUDARail(::x10::lang::Place gpu, x10_long numElements,
                   ::x10::lang::Rail< TPMGL(T) >* init);
    template<class TPMGL(T)> static ::x10::lang::GlobalRail<TPMGL(T)>
      makeGlobalRail(::x10::lang::Place place, x10_long numElements,
                     ::x10::lang::Rail< TPMGL(T) >* init);
    template<class TPMGL(T)> static ::x10::lang::GlobalRail<TPMGL(T)>
      makeGlobalRail(::x10::lang::Place place, x10_long numElements);
    template<class TPMGL(T)> static ::x10::lang::GlobalRail<TPMGL(T)>
      makeGlobalRail(::x10::lang::Place place, x10_long numElements,
                     TPMGL(T) init);
    template<class TPMGL(T)> static ::x10::lang::GlobalRail<TPMGL(T)>
      makeGlobalRail(::x10::lang::Place place, x10_long numElements,
                     ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* init);
    template<class TPMGL(T)> static void deleteGlobalRail(
      ::x10::lang::GlobalRail<TPMGL(T)> arr);
    static x10_int mul24(x10_int a, x10_int b);
    virtual ::x10::util::CUDAUtilities* x10__util__CUDAUtilities____this__x10__util__CUDAUtilities(
      );
    void _constructor();
    
    static ::x10::util::CUDAUtilities* _make();
    
    virtual void __fieldInitializers_x10_util_CUDAUtilities(
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


} } 
#endif // X10_UTIL_CUDAUTILITIES_H

namespace x10 { namespace util { 
class CUDAUtilities;
} } 

#ifndef X10_UTIL_CUDAUTILITIES_H_NODEPS
#define X10_UTIL_CUDAUTILITIES_H_NODEPS
#include <x10/lang/Int.h>
#include <x10/lang/Rail.h>
#include <x10/lang/GlobalRail.h>
#include <x10/lang/Long.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/FinishState.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/Exception.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Place.h>
#include <x10/compiler/Native.h>
#include <x10/lang/UnsupportedOperationException.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/lang/Zero.h>
#include <x10/lang/GlobalRef.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_UTIL_CUDAUTILITIES__CLOSURE__2_CLOSURE
#define X10_UTIL_CUDAUTILITIES__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
template<class TPMGL(T)> class x10_util_CUDAUtilities__closure__2 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>::template itable <x10_util_CUDAUtilities__closure__2<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    TPMGL(T) __apply(x10_long p__117489) {
        return ::x10aux::nullCheck(init)->x10::lang::template Rail< TPMGL(T) >::__apply(
                 ((x10_long)(((x10_int) (p__117489)))));
        
    }
    
    // captured environment
    ::x10::lang::Rail< TPMGL(T) >* init;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->init);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_CUDAUtilities__closure__2<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_util_CUDAUtilities__closure__2<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::Rail< TPMGL(T) >* that_init = buf.read< ::x10::lang::Rail< TPMGL(T) >*>();
        x10_util_CUDAUtilities__closure__2<TPMGL(T) >* this_ = new (storage) x10_util_CUDAUtilities__closure__2<TPMGL(T) >(that_init);
        return this_;
    }
    
    x10_util_CUDAUtilities__closure__2(::x10::lang::Rail< TPMGL(T) >* init) : init(init) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10:67";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>::template itable <x10_util_CUDAUtilities__closure__2<TPMGL(T) > >x10_util_CUDAUtilities__closure__2<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_CUDAUtilities__closure__2<TPMGL(T) >::__apply, &x10_util_CUDAUtilities__closure__2<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_util_CUDAUtilities__closure__2<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)> >, &x10_util_CUDAUtilities__closure__2<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_CUDAUtilities__closure__2<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_CUDAUtilities__closure__2<TPMGL(T) >::_deserialize);

#endif // X10_UTIL_CUDAUTILITIES__CLOSURE__2_CLOSURE
#ifndef X10_UTIL_CUDAUTILITIES__CLOSURE__1_CLOSURE
#define X10_UTIL_CUDAUTILITIES__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T)> class x10_util_CUDAUtilities__closure__1 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::lang::GlobalRail<TPMGL(T)> >::template itable <x10_util_CUDAUtilities__closure__1<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::GlobalRail<TPMGL(T)> __apply() {
        try {
            ::x10::lang::GlobalRail<TPMGL(T)> alloc__117488 =  ::x10::lang::GlobalRail<TPMGL(T)>::_alloc();
            (alloc__117488)->::x10::lang::GlobalRail<TPMGL(T)>::_constructor(
              ::x10::lang::Rail< TPMGL(T) >::_make(numElements, reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)> >(sizeof(x10_util_CUDAUtilities__closure__2<TPMGL(T)>)))x10_util_CUDAUtilities__closure__2<TPMGL(T)>(init)))));
            return alloc__117488;
            
        }
        catch (::x10::lang::CheckedThrowable* __exc2615) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc2615);
                {
                    ::x10::lang::GlobalRail<TPMGL(T)> __lowerer__var__1__ =
                      ::x10aux::class_cast_unchecked< ::x10::lang::GlobalRail<TPMGL(T)> >(::x10::lang::Runtime::wrapAtChecked< ::x10::lang::GlobalRail<TPMGL(T)> >(
                                                                                            __lowerer__var__0__));
                    return __lowerer__var__1__;
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    x10_long numElements;
    ::x10::lang::Rail< TPMGL(T) >* init;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->numElements);
        buf.write(this->init);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_CUDAUtilities__closure__1<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_util_CUDAUtilities__closure__1<TPMGL(T) > >();
        buf.record_reference(storage);
        x10_long that_numElements = buf.read<x10_long>();
        ::x10::lang::Rail< TPMGL(T) >* that_init = buf.read< ::x10::lang::Rail< TPMGL(T) >*>();
        x10_util_CUDAUtilities__closure__1<TPMGL(T) >* this_ = new (storage) x10_util_CUDAUtilities__closure__1<TPMGL(T) >(that_numElements, that_init);
        return this_;
    }
    
    x10_util_CUDAUtilities__closure__1(x10_long numElements, ::x10::lang::Rail< TPMGL(T) >* init) : numElements(numElements), init(init) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRail<TPMGL(T)> > >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRail<TPMGL(T)> > >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10:67";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_0< ::x10::lang::GlobalRail<TPMGL(T)> >::template itable <x10_util_CUDAUtilities__closure__1<TPMGL(T) > >x10_util_CUDAUtilities__closure__1<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_CUDAUtilities__closure__1<TPMGL(T) >::__apply, &x10_util_CUDAUtilities__closure__1<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_util_CUDAUtilities__closure__1<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRail<TPMGL(T)> > >, &x10_util_CUDAUtilities__closure__1<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_CUDAUtilities__closure__1<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_CUDAUtilities__closure__1<TPMGL(T) >::_deserialize);

#endif // X10_UTIL_CUDAUTILITIES__CLOSURE__1_CLOSURE
#ifndef X10_UTIL_CUDAUTILITIES__CLOSURE__3_CLOSURE
#define X10_UTIL_CUDAUTILITIES__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T)> class x10_util_CUDAUtilities__closure__3 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::lang::GlobalRail<TPMGL(T)> >::template itable <x10_util_CUDAUtilities__closure__3<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::GlobalRail<TPMGL(T)> __apply() {
        try {
            ::x10::lang::GlobalRail<TPMGL(T)> alloc__117490 =  ::x10::lang::GlobalRail<TPMGL(T)>::_alloc();
            (alloc__117490)->::x10::lang::GlobalRail<TPMGL(T)>::_constructor(
              ::x10::lang::Rail< TPMGL(T) >::_make(numElements, init));
            return alloc__117490;
            
        }
        catch (::x10::lang::CheckedThrowable* __exc2618) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc2618);
                {
                    ::x10::lang::GlobalRail<TPMGL(T)> __lowerer__var__1__ =
                      ::x10aux::class_cast_unchecked< ::x10::lang::GlobalRail<TPMGL(T)> >(::x10::lang::Runtime::wrapAtChecked< ::x10::lang::GlobalRail<TPMGL(T)> >(
                                                                                            __lowerer__var__0__));
                    return __lowerer__var__1__;
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    x10_long numElements;
    TPMGL(T) init;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->numElements);
        buf.write(this->init);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_CUDAUtilities__closure__3<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_util_CUDAUtilities__closure__3<TPMGL(T) > >();
        buf.record_reference(storage);
        x10_long that_numElements = buf.read<x10_long>();
        TPMGL(T) that_init = buf.read<TPMGL(T)>();
        x10_util_CUDAUtilities__closure__3<TPMGL(T) >* this_ = new (storage) x10_util_CUDAUtilities__closure__3<TPMGL(T) >(that_numElements, that_init);
        return this_;
    }
    
    x10_util_CUDAUtilities__closure__3(x10_long numElements, TPMGL(T) init) : numElements(numElements), init(init) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRail<TPMGL(T)> > >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRail<TPMGL(T)> > >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10:84";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_0< ::x10::lang::GlobalRail<TPMGL(T)> >::template itable <x10_util_CUDAUtilities__closure__3<TPMGL(T) > >x10_util_CUDAUtilities__closure__3<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_CUDAUtilities__closure__3<TPMGL(T) >::__apply, &x10_util_CUDAUtilities__closure__3<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_util_CUDAUtilities__closure__3<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRail<TPMGL(T)> > >, &x10_util_CUDAUtilities__closure__3<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_CUDAUtilities__closure__3<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_CUDAUtilities__closure__3<TPMGL(T) >::_deserialize);

#endif // X10_UTIL_CUDAUTILITIES__CLOSURE__3_CLOSURE
#ifndef X10_UTIL_CUDAUTILITIES__CLOSURE__5_CLOSURE
#define X10_UTIL_CUDAUTILITIES__CLOSURE__5_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
template<class TPMGL(T)> class x10_util_CUDAUtilities__closure__5 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>::template itable <x10_util_CUDAUtilities__closure__5<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    TPMGL(T) __apply(x10_long p__117492) {
        return ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>::__apply(::x10aux::nullCheck(init), 
          ((x10_long)(((x10_int) (p__117492)))));
        
    }
    
    // captured environment
    ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* init;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->init);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_CUDAUtilities__closure__5<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_util_CUDAUtilities__closure__5<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* that_init = buf.read< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>*>();
        x10_util_CUDAUtilities__closure__5<TPMGL(T) >* this_ = new (storage) x10_util_CUDAUtilities__closure__5<TPMGL(T) >(that_init);
        return this_;
    }
    
    x10_util_CUDAUtilities__closure__5(::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* init) : init(init) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10:95";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>::template itable <x10_util_CUDAUtilities__closure__5<TPMGL(T) > >x10_util_CUDAUtilities__closure__5<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_CUDAUtilities__closure__5<TPMGL(T) >::__apply, &x10_util_CUDAUtilities__closure__5<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_util_CUDAUtilities__closure__5<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)> >, &x10_util_CUDAUtilities__closure__5<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_CUDAUtilities__closure__5<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_CUDAUtilities__closure__5<TPMGL(T) >::_deserialize);

#endif // X10_UTIL_CUDAUTILITIES__CLOSURE__5_CLOSURE
#ifndef X10_UTIL_CUDAUTILITIES__CLOSURE__4_CLOSURE
#define X10_UTIL_CUDAUTILITIES__CLOSURE__4_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T)> class x10_util_CUDAUtilities__closure__4 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::lang::GlobalRail<TPMGL(T)> >::template itable <x10_util_CUDAUtilities__closure__4<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::GlobalRail<TPMGL(T)> __apply() {
        try {
            ::x10::lang::GlobalRail<TPMGL(T)> alloc__117491 =  ::x10::lang::GlobalRail<TPMGL(T)>::_alloc();
            (alloc__117491)->::x10::lang::GlobalRail<TPMGL(T)>::_constructor(
              ::x10::lang::Rail< TPMGL(T) >::_make(numElements, reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)> >(sizeof(x10_util_CUDAUtilities__closure__5<TPMGL(T)>)))x10_util_CUDAUtilities__closure__5<TPMGL(T)>(init)))));
            return alloc__117491;
            
        }
        catch (::x10::lang::CheckedThrowable* __exc2620) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc2620);
                {
                    ::x10::lang::GlobalRail<TPMGL(T)> __lowerer__var__1__ =
                      ::x10aux::class_cast_unchecked< ::x10::lang::GlobalRail<TPMGL(T)> >(::x10::lang::Runtime::wrapAtChecked< ::x10::lang::GlobalRail<TPMGL(T)> >(
                                                                                            __lowerer__var__0__));
                    return __lowerer__var__1__;
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    x10_long numElements;
    ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* init;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->numElements);
        buf.write(this->init);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_CUDAUtilities__closure__4<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_util_CUDAUtilities__closure__4<TPMGL(T) > >();
        buf.record_reference(storage);
        x10_long that_numElements = buf.read<x10_long>();
        ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* that_init = buf.read< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>*>();
        x10_util_CUDAUtilities__closure__4<TPMGL(T) >* this_ = new (storage) x10_util_CUDAUtilities__closure__4<TPMGL(T) >(that_numElements, that_init);
        return this_;
    }
    
    x10_util_CUDAUtilities__closure__4(x10_long numElements, ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* init) : numElements(numElements), init(init) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRail<TPMGL(T)> > >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRail<TPMGL(T)> > >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10:95";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_0< ::x10::lang::GlobalRail<TPMGL(T)> >::template itable <x10_util_CUDAUtilities__closure__4<TPMGL(T) > >x10_util_CUDAUtilities__closure__4<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_CUDAUtilities__closure__4<TPMGL(T) >::__apply, &x10_util_CUDAUtilities__closure__4<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_util_CUDAUtilities__closure__4<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRail<TPMGL(T)> > >, &x10_util_CUDAUtilities__closure__4<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_CUDAUtilities__closure__4<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_CUDAUtilities__closure__4<TPMGL(T) >::_deserialize);

#endif // X10_UTIL_CUDAUTILITIES__CLOSURE__4_CLOSURE
#ifndef X10_UTIL_CUDAUTILITIES_H_GENERICS
#define X10_UTIL_CUDAUTILITIES_H_GENERICS
#ifndef X10_UTIL_CUDAUTILITIES_H_initCUDARail_2610
#define X10_UTIL_CUDAUTILITIES_H_initCUDARail_2610
template<class TPMGL(T)> void x10::util::CUDAUtilities::initCUDARail(::x10::lang::Rail< TPMGL(T) >* local,
                                                                     ::x10::lang::GlobalRail<TPMGL(T)> remote,
                                                                     x10_long numElements) {
    {
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
        ::x10::lang::Runtime::ensureNotInAtomic();
        ::x10::lang::FinishState* x10____var24 = ::x10::lang::Runtime::startFinish();
        {
            ::x10::lang::CheckedThrowable* throwable__117508 =
              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                try {
                    {
                        ::x10::lang::Rail< void >::template asyncCopy< TPMGL(T) >(
                          local, ((x10_long)0ll), remote,
                          ((x10_long)0ll), numElements);
                    }
                }
                catch (::x10::lang::CheckedThrowable* __exc2611) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc2611);
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
            catch (::x10::lang::CheckedThrowable* __exc2612) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__117509 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc2612);
                    {
                        throwable__117508 = formal__117509;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__117508)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__117508))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__117508));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::stopFinish(x10____var24);
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__117508)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__117508)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__117508));
                }
                
            }
            
        }
    }
}
#endif // X10_UTIL_CUDAUTILITIES_H_initCUDARail_2610
#ifndef X10_UTIL_CUDAUTILITIES_H_makeCUDARail_2613
#define X10_UTIL_CUDAUTILITIES_H_makeCUDARail_2613
template<class TPMGL(T)> ::x10::lang::GlobalRail<TPMGL(T)>
  x10::util::CUDAUtilities::makeCUDARail(::x10::lang::Place gpu,
                                         x10_long numElements,
                                         ::x10::lang::Rail< TPMGL(T) >* init) {
    x10_ulong addr = x10aux::remote_alloc(gpu.FMGL(id), ((size_t)numElements)*sizeof(TPMGL(T)));
x10::lang::GlobalRef<x10::lang::Rail<TPMGL(T)> *> gr(gpu->FMGL(id), addr);
x10::lang::GlobalRail<TPMGL(T)> remote_rail = x10::lang::GlobalRail<TPMGL(T)>::_make(numElements, gr);
initCUDARail<TPMGL(T)>(init,remote_rail,numElements);
return remote_rail;

    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
}
#endif // X10_UTIL_CUDAUTILITIES_H_makeCUDARail_2613
#ifndef X10_UTIL_CUDAUTILITIES_H_makeGlobalRail_2614
#define X10_UTIL_CUDAUTILITIES_H_makeGlobalRail_2614
template<class TPMGL(T)> ::x10::lang::GlobalRail<TPMGL(T)>
  x10::util::CUDAUtilities::makeGlobalRail(::x10::lang::Place place,
                                           x10_long numElements,
                                           ::x10::lang::Rail< TPMGL(T) >* init) {
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
    if (::x10aux::is_cuda((x10_int)place->FMGL(id))) {
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
        return ::x10::util::CUDAUtilities::template makeCUDARail< TPMGL(T) >(
                 place, numElements, init);
        
    } else {
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
        return ::x10::lang::Runtime::template evalAt< ::x10::lang::GlobalRail<TPMGL(T)> >(
                 place, reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRail<TPMGL(T)> >*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRail<TPMGL(T)> > >(sizeof(x10_util_CUDAUtilities__closure__1<TPMGL(T)>)))x10_util_CUDAUtilities__closure__1<TPMGL(T)>(numElements, init))),
                 ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
    }
    
}
#endif // X10_UTIL_CUDAUTILITIES_H_makeGlobalRail_2614
#ifndef X10_UTIL_CUDAUTILITIES_H_makeGlobalRail_2616
#define X10_UTIL_CUDAUTILITIES_H_makeGlobalRail_2616
template<class TPMGL(T)> ::x10::lang::GlobalRail<TPMGL(T)>
  x10::util::CUDAUtilities::makeGlobalRail(::x10::lang::Place place,
                                           x10_long numElements) {
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
    return ::x10::util::CUDAUtilities::template makeGlobalRail< TPMGL(T) >(
             place, numElements, ::x10aux::zeroValue< TPMGL(T) >());
    
}
#endif // X10_UTIL_CUDAUTILITIES_H_makeGlobalRail_2616
#ifndef X10_UTIL_CUDAUTILITIES_H_makeGlobalRail_2617
#define X10_UTIL_CUDAUTILITIES_H_makeGlobalRail_2617
template<class TPMGL(T)> ::x10::lang::GlobalRail<TPMGL(T)>
  x10::util::CUDAUtilities::makeGlobalRail(::x10::lang::Place place,
                                           x10_long numElements,
                                           TPMGL(T) init) {
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
    if (::x10aux::is_cuda((x10_int)place->FMGL(id))) {
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
        ::x10::lang::Rail< TPMGL(T) >* chunk = ::x10::lang::Rail< TPMGL(T) >::_make(numElements,
                                                                                    init);
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
        return ::x10::util::CUDAUtilities::template makeCUDARail< TPMGL(T) >(
                 place, numElements, chunk);
        
    } else {
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
        return ::x10::lang::Runtime::template evalAt< ::x10::lang::GlobalRail<TPMGL(T)> >(
                 place, reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRail<TPMGL(T)> >*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRail<TPMGL(T)> > >(sizeof(x10_util_CUDAUtilities__closure__3<TPMGL(T)>)))x10_util_CUDAUtilities__closure__3<TPMGL(T)>(numElements, init))),
                 ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
    }
    
}
#endif // X10_UTIL_CUDAUTILITIES_H_makeGlobalRail_2617
#ifndef X10_UTIL_CUDAUTILITIES_H_makeGlobalRail_2619
#define X10_UTIL_CUDAUTILITIES_H_makeGlobalRail_2619
template<class TPMGL(T)> ::x10::lang::GlobalRail<TPMGL(T)>
  x10::util::CUDAUtilities::makeGlobalRail(::x10::lang::Place place,
                                           x10_long numElements,
                                           ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* init) {
    
    //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
    if (::x10aux::is_cuda((x10_int)place->FMGL(id))) {
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
        ::x10::lang::Rail< TPMGL(T) >* chunk = ::x10::lang::Rail< TPMGL(T) >::_make(numElements,
                                                                                    init);
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
        return ::x10::util::CUDAUtilities::template makeCUDARail< TPMGL(T) >(
                 place, numElements, chunk);
        
    } else {
        
        //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
        return ::x10::lang::Runtime::template evalAt< ::x10::lang::GlobalRail<TPMGL(T)> >(
                 place, reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRail<TPMGL(T)> >*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRail<TPMGL(T)> > >(sizeof(x10_util_CUDAUtilities__closure__4<TPMGL(T)>)))x10_util_CUDAUtilities__closure__4<TPMGL(T)>(numElements, init))),
                 ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
    }
    
}
#endif // X10_UTIL_CUDAUTILITIES_H_makeGlobalRail_2619
#ifndef X10_UTIL_CUDAUTILITIES_H_deleteGlobalRail_2621
#define X10_UTIL_CUDAUTILITIES_H_deleteGlobalRail_2621
template<class TPMGL(T)> void x10::util::CUDAUtilities::deleteGlobalRail(
  ::x10::lang::GlobalRail<TPMGL(T)> arr) {
    
    //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
    ::x10::lang::Place place = ::x10::lang::Place::place((arr->FMGL(rail))->location);
    
    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/CUDAUtilities.x10"
    if (::x10aux::is_cuda((x10_int)place->FMGL(id))) {
        x10aux::remote_free(place.FMGL(id), arr->FMGL(rail)->value);

    } else {
     
    }
    
}
#endif // X10_UTIL_CUDAUTILITIES_H_deleteGlobalRail_2621
#endif // X10_UTIL_CUDAUTILITIES_H_GENERICS
#endif // __X10_UTIL_CUDAUTILITIES_H_NODEPS
