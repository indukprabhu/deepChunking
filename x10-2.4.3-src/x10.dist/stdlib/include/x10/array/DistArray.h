#ifndef __X10_ARRAY_DISTARRAY_H
#define __X10_ARRAY_DISTARRAY_H

#include <x10rt.h>


#define X10_LANG_ITERABLE_H_NODEPS
#include <x10/lang/Iterable.h>
#undef X10_LANG_ITERABLE_H_NODEPS
namespace x10 { namespace lang { 
class Point;
} } 
#define X10_LANG_PLACELOCALHANDLE_H_NODEPS
#include <x10/lang/PlaceLocalHandle.h>
#undef X10_LANG_PLACELOCALHANDLE_H_NODEPS
#define X10_LANG_PLACELOCALHANDLE_H_NODEPS
#include <x10/lang/PlaceLocalHandle.h>
#undef X10_LANG_PLACELOCALHANDLE_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
namespace x10 { namespace array { 
template<class TPMGL(S)> class LocalState;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace compiler { 
class TransientInitExpr;
} } 
namespace x10 { namespace compiler { 
class NonEscaping;
} } 
namespace x10 { namespace lang { 
class PlaceGroup;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(U)> class Fun_0_0;
} } 
namespace x10 { namespace compiler { 
class Inline;
} } 
namespace x10 { namespace array { 
class IterationSpace;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Iterator;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(Z1), class TPMGL(Z2), class TPMGL(U)> class Fun_0_2;
} } 
namespace x10 { namespace array { 
template<class TPMGL(U), class TPMGL(T)> class DistArray__Anonymous__7530;
} } 
namespace x10 { namespace lang { 
class FinishState;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Reducible;
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
namespace x10 { namespace lang { 
class Runtime__Profile;
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
namespace x10 { namespace lang { 
class IllegalArgumentException;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace lang { 
class ArrayIndexOutOfBoundsException;
} } 
namespace x10 { namespace compiler { 
class NoInline;
} } 
namespace x10 { namespace compiler { 
class NoReturn;
} } 
namespace x10 { namespace lang { 
class BadPlaceException;
} } 
namespace x10 { namespace lang { 
class NegativeArraySizeException;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace array { 

template<class TPMGL(T)> class DistArray;
template <> class DistArray<void>;
template<class TPMGL(T)> class DistArray : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    x10_long FMGL(size);
    
    x10_long rank();
    ::x10::lang::PlaceLocalHandle< ::x10::array::LocalState<TPMGL(T)>*> FMGL(localHandle);
    
    ::x10::lang::Rail< TPMGL(T) >* FMGL(raw);
    
    virtual ::x10::lang::Rail< TPMGL(T) >* getRailFromLocalHandle();
    ::x10::lang::PlaceGroup* FMGL(placeGroup);
    
    void _constructor(::x10::lang::PlaceGroup* pg, ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*>* init,
                      x10_long sz);
    
    virtual ::x10::lang::Rail< TPMGL(T) >* raw();
    virtual ::x10::lang::PlaceGroup* placeGroup();
    virtual ::x10::array::IterationSpace* globalIndices() = 0;
    virtual ::x10::lang::Iterator< ::x10::lang::Point*>* iterator(
      );
    virtual ::x10::array::IterationSpace* localIndices() = 0;
    virtual ::x10::lang::Place place(::x10::lang::Point* p) = 0;
    virtual TPMGL(T) __apply(::x10::lang::Point* p) = 0;
    virtual TPMGL(T) __set(::x10::lang::Point* p, TPMGL(T) v) = 0;
    virtual TPMGL(T) reduce(::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), TPMGL(T)>* op,
                            TPMGL(T) unit);
    template<class TPMGL(U)> TPMGL(U) reduce(::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>* lop,
                                             ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(U), TPMGL(U)>* gop,
                                             TPMGL(U) unit);
    template<class TPMGL(U)> ::x10::array::DistArray<TPMGL(U)>*
      map(::x10::array::DistArray<TPMGL(U)>* dst, ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op);
    template<class TPMGL(S), class TPMGL(U)> ::x10::array::DistArray<TPMGL(U)>*
      map(::x10::array::DistArray<TPMGL(S)>* src2, ::x10::array::DistArray<TPMGL(U)>* dst,
          ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(S), TPMGL(U)>* op);
    virtual ::x10::array::DistArray<TPMGL(T)>* x10__array__DistArray____this__x10__array__DistArray(
      );
    virtual void __fieldInitializers_x10_array_DistArray(
      );
    
    // Serialization
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

template<class TPMGL(T)> ::x10aux::RuntimeType x10::array::DistArray<TPMGL(T)>::rtt;
template<class TPMGL(T)> void x10::array::DistArray<TPMGL(T)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::array::DistArray<void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Point*> >()};
    const ::x10aux::RuntimeType* params[1] = { ::x10aux::getRTT<TPMGL(T)>()};
    ::x10aux::RuntimeType::Variance variances[1] = { ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.array.DistArray";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 1, parents, 1, params, variances);
}

template <> class DistArray<void> : public ::x10::lang::X10Class
{
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    static void raiseBoundsError(x10_long i) X10_PRAGMA_NORETURN ;
    
    static void raiseBoundsError(x10_long i, x10_long j) X10_PRAGMA_NORETURN ;
    
    static void raiseBoundsError(x10_long i, x10_long j, x10_long k) X10_PRAGMA_NORETURN ;
    
    static void raisePlaceError(x10_long i) X10_PRAGMA_NORETURN ;
    
    static void raisePlaceError(x10_long i, x10_long j) X10_PRAGMA_NORETURN ;
    
    static void raisePlaceError(x10_long i, x10_long j, x10_long k) X10_PRAGMA_NORETURN ;
    
    static void raiseNegativeArraySizeException() X10_PRAGMA_NORETURN ;
    
    
};

} } 
#endif // X10_ARRAY_DISTARRAY_H

namespace x10 { namespace array { 
template<class TPMGL(T)> class DistArray;
} } 

#ifndef X10_ARRAY_DISTARRAY_H_NODEPS
#define X10_ARRAY_DISTARRAY_H_NODEPS
#include <x10/lang/Iterable.h>
#include <x10/lang/Point.h>
#include <x10/lang/PlaceLocalHandle.h>
#include <x10/lang/Long.h>
#include <x10/array/LocalState.h>
#include <x10/lang/Rail.h>
#include <x10/compiler/TransientInitExpr.h>
#include <x10/compiler/NonEscaping.h>
#include <x10/lang/PlaceGroup.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/compiler/Inline.h>
#include <x10/array/IterationSpace.h>
#include <x10/lang/Iterator.h>
#include <x10/lang/Place.h>
#include <x10/lang/Fun_0_2.h>
#include <x10/array/DistArray__Anonymous__7530.h>
#include <x10/lang/FinishState.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Reducible.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Error.h>
#include <x10/lang/Exception.h>
#include <x10/compiler/AsyncClosure.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/lang/IllegalArgumentException.h>
#include <x10/lang/String.h>
#include <x10/lang/ArrayIndexOutOfBoundsException.h>
#include <x10/compiler/NoInline.h>
#include <x10/compiler/NoReturn.h>
#include <x10/lang/BadPlaceException.h>
#include <x10/lang/NegativeArraySizeException.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_ARRAY_DISTARRAY__CLOSURE__1_CLOSURE
#define X10_ARRAY_DISTARRAY__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T), class TPMGL(U)> class x10_array_DistArray__closure__1 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_array_DistArray__closure__1<TPMGL(T),TPMGL(U) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            TPMGL(U) localRes = (__extension__ ({
                
                //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                ::x10::lang::Rail< TPMGL(T) >* src__75925 = (__extension__ ({
                    
                    //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                    ::x10::array::DistArray<TPMGL(T)>* this__75924 = saved_this;
                    ::x10aux::nullCheck(this__75924)->FMGL(raw);
                }))
                ;
                ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>* op__75926 =
                  lop;
                TPMGL(U) unit__75927 = unit;
                TPMGL(U) ret__75934;
                
                //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                TPMGL(U) accum__75967 = unit__75927;
                
                //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                ::x10::lang::Rail< TPMGL(T) >* rail__75963 = src__75925;
                x10_long i__72784max__75964 = (x10_long)(::x10aux::nullCheck(rail__75963)->FMGL(size));
                {
                    x10_long i__75965;
                    for (i__75965 = ((x10_long)0ll); ((i__75965) < (i__72784max__75964));
                         i__75965 = ((i__75965) + (((x10_long)1ll))))
                    {
                        x10_long i__75966 = i__75965;
                        
                        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                        accum__75967 = ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>::__apply(::x10aux::nullCheck(op__75926), 
                          accum__75967, ::x10aux::nullCheck(src__75925)->x10::lang::template Rail< TPMGL(T) >::__apply(
                                          i__75966));
                    }
                }
                
                //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                ret__75934 = accum__75967;
                ret__75934;
            }))
            ;
            
            //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            ::x10::lang::Runtime::template makeOffer< TPMGL(U) >(
              localRes);
        }
        catch (::x10::lang::CheckedThrowable* __exc146) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc146)) {
                ::x10::lang::Error* __lowerer__var__0__ =
                  static_cast< ::x10::lang::Error*>(__exc146);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc146);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::array::DistArray<TPMGL(T)>* saved_this;
    ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>* lop;
    TPMGL(U) unit;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->lop);
        buf.write(this->unit);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_array_DistArray__closure__1<TPMGL(T),TPMGL(U) >* storage = ::x10aux::alloc_z<x10_array_DistArray__closure__1<TPMGL(T),TPMGL(U) > >();
        buf.record_reference(storage);
        ::x10::array::DistArray<TPMGL(T)>* that_saved_this = buf.read< ::x10::array::DistArray<TPMGL(T)>*>();
        ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>* that_lop = buf.read< ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>*>();
        TPMGL(U) that_unit = buf.read<TPMGL(U)>();
        x10_array_DistArray__closure__1<TPMGL(T),TPMGL(U) >* this_ = new (storage) x10_array_DistArray__closure__1<TPMGL(T),TPMGL(U) >(that_saved_this, that_lop, that_unit);
        return this_;
    }
    
    x10_array_DistArray__closure__1(::x10::array::DistArray<TPMGL(T)>* saved_this, ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>* lop, TPMGL(U) unit) : saved_this(saved_this), lop(lop), unit(unit) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10:195-198";
    }

};

template<class TPMGL(T), class TPMGL(U)> typename ::x10::lang::VoidFun_0_0::template itable <x10_array_DistArray__closure__1<TPMGL(T),TPMGL(U) > >x10_array_DistArray__closure__1<TPMGL(T),TPMGL(U) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_array_DistArray__closure__1<TPMGL(T),TPMGL(U) >::__apply, &x10_array_DistArray__closure__1<TPMGL(T),TPMGL(U) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T), class TPMGL(U)> ::x10aux::itable_entry x10_array_DistArray__closure__1<TPMGL(T),TPMGL(U) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_array_DistArray__closure__1<TPMGL(T),TPMGL(U) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T), class TPMGL(U)> const ::x10aux::serialization_id_t x10_array_DistArray__closure__1<TPMGL(T),TPMGL(U) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_array_DistArray__closure__1<TPMGL(T),TPMGL(U) >::_deserialize);
template<class TPMGL(T), class TPMGL(U)> const ::x10aux::serialization_id_t x10_array_DistArray__closure__1<TPMGL(T),TPMGL(U) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_array_DistArray__closure__1<TPMGL(T),TPMGL(U) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_ARRAY_DISTARRAY__CLOSURE__1_CLOSURE
#ifndef X10_ARRAY_DISTARRAY__CLOSURE__2_CLOSURE
#define X10_ARRAY_DISTARRAY__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T), class TPMGL(U)> class x10_array_DistArray__closure__2 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_array_DistArray__closure__2<TPMGL(T),TPMGL(U) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        ::x10::lang::Rail< TPMGL(T) >* s = (__extension__ ({
            ::x10::array::DistArray<TPMGL(T)>* this__75936 = saved_this;
            ::x10aux::nullCheck(this__75936)->FMGL(raw);
        }))
        ;
        
        //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        ::x10::lang::Rail< TPMGL(U) >* d = ::x10aux::nullCheck(dst)->FMGL(raw);
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ::x10::lang::Rail< TPMGL(T) >* src__75975 = s;
        ::x10::lang::Rail< TPMGL(U) >* dst__75976 = d;
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op__75977 = op;
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ::x10::lang::Rail< TPMGL(U) >* ret__75978;
        
        //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ::x10::lang::Rail< TPMGL(T) >* rail__75971 = src__75975;
        x10_long i__72803max__75972 = (x10_long)(::x10aux::nullCheck(rail__75971)->FMGL(size));
        {
            x10_long i__75973;
            for (i__75973 = ((x10_long)0ll); ((i__75973) < (i__72803max__75972));
                 i__75973 = ((i__75973) + (((x10_long)1ll)))) {
                x10_long i__75974 = i__75973;
                
                //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                ::x10aux::nullCheck(dst__75976)->x10::lang::template Rail< TPMGL(U) >::__set(
                  i__75974, ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>::__apply(::x10aux::nullCheck(op__75977), 
                    ::x10aux::nullCheck(src__75975)->x10::lang::template Rail< TPMGL(T) >::__apply(
                      i__75974)));
            }
        }
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ret__75978 = dst__75976;
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ret__75978;
    }
    
    // captured environment
    ::x10::array::DistArray<TPMGL(T)>* saved_this;
    ::x10::array::DistArray<TPMGL(U)>* dst;
    ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->dst);
        buf.write(this->op);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_array_DistArray__closure__2<TPMGL(T),TPMGL(U) >* storage = ::x10aux::alloc_z<x10_array_DistArray__closure__2<TPMGL(T),TPMGL(U) > >();
        buf.record_reference(storage);
        ::x10::array::DistArray<TPMGL(T)>* that_saved_this = buf.read< ::x10::array::DistArray<TPMGL(T)>*>();
        ::x10::array::DistArray<TPMGL(U)>* that_dst = buf.read< ::x10::array::DistArray<TPMGL(U)>*>();
        ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* that_op = buf.read< ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>*>();
        x10_array_DistArray__closure__2<TPMGL(T),TPMGL(U) >* this_ = new (storage) x10_array_DistArray__closure__2<TPMGL(T),TPMGL(U) >(that_saved_this, that_dst, that_op);
        return this_;
    }
    
    x10_array_DistArray__closure__2(::x10::array::DistArray<TPMGL(T)>* saved_this, ::x10::array::DistArray<TPMGL(U)>* dst, ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op) : saved_this(saved_this), dst(dst), op(op) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10:223-227";
    }

};

template<class TPMGL(T), class TPMGL(U)> typename ::x10::lang::VoidFun_0_0::template itable <x10_array_DistArray__closure__2<TPMGL(T),TPMGL(U) > >x10_array_DistArray__closure__2<TPMGL(T),TPMGL(U) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_array_DistArray__closure__2<TPMGL(T),TPMGL(U) >::__apply, &x10_array_DistArray__closure__2<TPMGL(T),TPMGL(U) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T), class TPMGL(U)> ::x10aux::itable_entry x10_array_DistArray__closure__2<TPMGL(T),TPMGL(U) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_array_DistArray__closure__2<TPMGL(T),TPMGL(U) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T), class TPMGL(U)> const ::x10aux::serialization_id_t x10_array_DistArray__closure__2<TPMGL(T),TPMGL(U) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_array_DistArray__closure__2<TPMGL(T),TPMGL(U) >::_deserialize);

#endif // X10_ARRAY_DISTARRAY__CLOSURE__2_CLOSURE
#ifndef X10_ARRAY_DISTARRAY__CLOSURE__3_CLOSURE
#define X10_ARRAY_DISTARRAY__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T), class TPMGL(S), class TPMGL(U)> class x10_array_DistArray__closure__3 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_array_DistArray__closure__3<TPMGL(T),TPMGL(S),TPMGL(U) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        ::x10::lang::Rail< TPMGL(T) >* s1 = (__extension__ ({
            ::x10::array::DistArray<TPMGL(T)>* this__75947 = saved_this;
            ::x10aux::nullCheck(this__75947)->FMGL(raw);
        }))
        ;
        
        //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        ::x10::lang::Rail< TPMGL(S) >* s2 = ::x10aux::nullCheck(src2)->FMGL(raw);
        
        //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        ::x10::lang::Rail< TPMGL(U) >* d = ::x10aux::nullCheck(dst)->FMGL(raw);
        
        //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        if ((!::x10aux::struct_equals((x10_long)(::x10aux::nullCheck(s1)->FMGL(size)),
                                      (x10_long)(::x10aux::nullCheck(s2)->FMGL(size)))))
        {
            
            //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
            ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::IllegalArgumentException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__123465 = ::x10aux::makeStringLit("Source arrays have different sizes ("); strLit__123465; })), (x10_long)(::x10aux::nullCheck(s1)->FMGL(size))), (__extension__ ({ static ::x10::lang::String* strLit__123466 = ::x10aux::makeStringLit(", "); strLit__123466; }))), (x10_long)(::x10aux::nullCheck(s2)->FMGL(size))), (__extension__ ({ static ::x10::lang::String* strLit__123467 = ::x10aux::makeStringLit(") at "); strLit__123467; }))), ::x10::lang::Place::_make(::x10aux::here)))));
        }
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ::x10::lang::Rail< TPMGL(T) >* src__75983 = s1;
        ::x10::lang::Rail< TPMGL(S) >* src__75984 = s2;
        ::x10::lang::Rail< TPMGL(U) >* dst__75985 = d;
        ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(S), TPMGL(U)>* op__75986 =
          op;
        ::x10::lang::Rail< TPMGL(U) >* ret__75987;
        
        //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ::x10::lang::Rail< TPMGL(T) >* rail__75979 = src__75983;
        x10_long i__72822max__75980 = (x10_long)(::x10aux::nullCheck(rail__75979)->FMGL(size));
        {
            x10_long i__75981;
            for (i__75981 = ((x10_long)0ll); ((i__75981) < (i__72822max__75980));
                 i__75981 = ((i__75981) + (((x10_long)1ll))))
            {
                x10_long i__75982 = i__75981;
                
                //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                ::x10aux::nullCheck(dst__75985)->x10::lang::template Rail< TPMGL(U) >::__set(
                  i__75982, ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(S), TPMGL(U)>::__apply(::x10aux::nullCheck(op__75986), 
                    ::x10aux::nullCheck(src__75983)->x10::lang::template Rail< TPMGL(T) >::__apply(
                      i__75982), ::x10aux::nullCheck(src__75984)->x10::lang::template Rail< TPMGL(S) >::__apply(
                                   i__75982)));
            }
        }
        
        //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ret__75987 = dst__75985;
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ret__75987;
    }
    
    // captured environment
    ::x10::array::DistArray<TPMGL(T)>* saved_this;
    ::x10::array::DistArray<TPMGL(S)>* src2;
    ::x10::array::DistArray<TPMGL(U)>* dst;
    ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(S), TPMGL(U)>* op;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->src2);
        buf.write(this->dst);
        buf.write(this->op);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_array_DistArray__closure__3<TPMGL(T),TPMGL(S),TPMGL(U) >* storage = ::x10aux::alloc_z<x10_array_DistArray__closure__3<TPMGL(T),TPMGL(S),TPMGL(U) > >();
        buf.record_reference(storage);
        ::x10::array::DistArray<TPMGL(T)>* that_saved_this = buf.read< ::x10::array::DistArray<TPMGL(T)>*>();
        ::x10::array::DistArray<TPMGL(S)>* that_src2 = buf.read< ::x10::array::DistArray<TPMGL(S)>*>();
        ::x10::array::DistArray<TPMGL(U)>* that_dst = buf.read< ::x10::array::DistArray<TPMGL(U)>*>();
        ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(S), TPMGL(U)>* that_op = buf.read< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(S), TPMGL(U)>*>();
        x10_array_DistArray__closure__3<TPMGL(T),TPMGL(S),TPMGL(U) >* this_ = new (storage) x10_array_DistArray__closure__3<TPMGL(T),TPMGL(S),TPMGL(U) >(that_saved_this, that_src2, that_dst, that_op);
        return this_;
    }
    
    x10_array_DistArray__closure__3(::x10::array::DistArray<TPMGL(T)>* saved_this, ::x10::array::DistArray<TPMGL(S)>* src2, ::x10::array::DistArray<TPMGL(U)>* dst, ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(S), TPMGL(U)>* op) : saved_this(saved_this), src2(src2), dst(dst), op(op) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10:251-259";
    }

};

template<class TPMGL(T), class TPMGL(S), class TPMGL(U)> typename ::x10::lang::VoidFun_0_0::template itable <x10_array_DistArray__closure__3<TPMGL(T),TPMGL(S),TPMGL(U) > >x10_array_DistArray__closure__3<TPMGL(T),TPMGL(S),TPMGL(U) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_array_DistArray__closure__3<TPMGL(T),TPMGL(S),TPMGL(U) >::__apply, &x10_array_DistArray__closure__3<TPMGL(T),TPMGL(S),TPMGL(U) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T), class TPMGL(S), class TPMGL(U)> ::x10aux::itable_entry x10_array_DistArray__closure__3<TPMGL(T),TPMGL(S),TPMGL(U) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_array_DistArray__closure__3<TPMGL(T),TPMGL(S),TPMGL(U) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T), class TPMGL(S), class TPMGL(U)> const ::x10aux::serialization_id_t x10_array_DistArray__closure__3<TPMGL(T),TPMGL(S),TPMGL(U) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_array_DistArray__closure__3<TPMGL(T),TPMGL(S),TPMGL(U) >::_deserialize);

#endif // X10_ARRAY_DISTARRAY__CLOSURE__3_CLOSURE
#ifndef X10_ARRAY_DISTARRAY_H_GENERICS
#define X10_ARRAY_DISTARRAY_H_GENERICS
#ifndef X10_ARRAY_DISTARRAY_H_reduce_145
#define X10_ARRAY_DISTARRAY_H_reduce_145
template<class TPMGL(T)> template<class TPMGL(U)> TPMGL(U) x10::array::DistArray<TPMGL(T)>::reduce(
  ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>* lop, ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(U), TPMGL(U)>* gop,
  TPMGL(U) unit) {
    
    //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    ::x10::array::DistArray__Anonymous__7530<TPMGL(U), TPMGL(T)>* reducer =
       (new (::x10aux::alloc_z< ::x10::array::DistArray__Anonymous__7530<TPMGL(U), TPMGL(T)> >()) ::x10::array::DistArray__Anonymous__7530<TPMGL(U), TPMGL(T)>());
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    ::x10::array::DistArray<TPMGL(T)>* out__75968 = this;
    
    //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    TPMGL(U) unit__75969 = unit;
    ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(U), TPMGL(U)>* gop__75970 =
      gop;
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    reducer->FMGL(out__) = out__75968;
    
    //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    reducer->FMGL(unit) = unit__75969;
    reducer->FMGL(gop) = gop__75970;
    
    //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    TPMGL(U) result;
    {
        ::x10::lang::FinishState* x10____var0 = ::x10aux::class_cast_unchecked< ::x10::lang::FinishState*>(::x10::lang::Runtime::template startCollectingFinish< TPMGL(U) >(
                                                                                                             reinterpret_cast< ::x10::lang::Reducible<TPMGL(U)>*>(reducer)));
        {
            ::x10::lang::CheckedThrowable* throwable__75999 =
              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                try {
                    {
                        
                        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                        {
                            ::x10::lang::Iterator< ::x10::lang::Place>* where__75213;
                            for (where__75213 = ::x10aux::nullCheck(this->FMGL(placeGroup))->iterator();
                                 ::x10::lang::Iterator< ::x10::lang::Place>::hasNext(::x10aux::nullCheck(where__75213));
                                 ) {
                                ::x10::lang::Place where =
                                  ::x10::lang::Iterator< ::x10::lang::Place>::next(::x10aux::nullCheck(where__75213));
                                
                                //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
                                ::x10::lang::Runtime::runAsync(
                                  where, reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_array_DistArray__closure__1<TPMGL(T),TPMGL(U)>)))x10_array_DistArray__closure__1<TPMGL(T),TPMGL(U)>(this, lop, unit))),
                                  ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                            }
                        }
                        
                    }
                }
                catch (::x10::lang::CheckedThrowable* __exc147) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc147);
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
            catch (::x10::lang::CheckedThrowable* __exc148) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__76000 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc148);
                    {
                        throwable__75999 = formal__76000;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__75999)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__75999))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__75999));
                }
                
            }
            if (true) {
                result = ::x10::lang::Runtime::template stopCollectingFinish< TPMGL(U) >(
                           x10____var0);
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__75999)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__75999)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__75999));
                }
                
            }
            
        }
    }
    
    //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    return result;
    
}
#endif // X10_ARRAY_DISTARRAY_H_reduce_145
#ifndef X10_ARRAY_DISTARRAY_H_map_149
#define X10_ARRAY_DISTARRAY_H_map_149
template<class TPMGL(T)> template<class TPMGL(U)> ::x10::array::DistArray<TPMGL(U)>*
  x10::array::DistArray<TPMGL(T)>::map(::x10::array::DistArray<TPMGL(U)>* dst,
                                       ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op) {
    
    //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    ::x10aux::nullCheck(this->FMGL(placeGroup))->broadcastFlat(
      reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_array_DistArray__closure__2<TPMGL(T),TPMGL(U)>)))x10_array_DistArray__closure__2<TPMGL(T),TPMGL(U)>(this, dst, op))));
    
    //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    return dst;
    
}
#endif // X10_ARRAY_DISTARRAY_H_map_149
#ifndef X10_ARRAY_DISTARRAY_H_map_150
#define X10_ARRAY_DISTARRAY_H_map_150
template<class TPMGL(T)> template<class TPMGL(S), class TPMGL(U)>
::x10::array::DistArray<TPMGL(U)>* x10::array::DistArray<TPMGL(T)>::map(
  ::x10::array::DistArray<TPMGL(S)>* src2, ::x10::array::DistArray<TPMGL(U)>* dst,
  ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(S), TPMGL(U)>* op) {
    
    //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    ::x10aux::nullCheck(this->FMGL(placeGroup))->broadcastFlat(
      reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_array_DistArray__closure__3<TPMGL(T),TPMGL(S),TPMGL(U)>)))x10_array_DistArray__closure__3<TPMGL(T),TPMGL(S),TPMGL(U)>(this, src2, dst, op))));
    
    //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    return dst;
    
}
#endif // X10_ARRAY_DISTARRAY_H_map_150
#endif // X10_ARRAY_DISTARRAY_H_GENERICS
#ifndef X10_ARRAY_DISTARRAY_H_IMPLEMENTATION
#define X10_ARRAY_DISTARRAY_H_IMPLEMENTATION
#include <x10/array/DistArray.h>


//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"

//#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"

//#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
/** 
     * The place-local state for the DistArray 
     */

//#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
/**
     * The place-local backing storage for elements of the DistArray.
     */

//#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
template<class TPMGL(T)> ::x10::lang::Rail< TPMGL(T) >* x10::array::DistArray<TPMGL(T)>::getRailFromLocalHandle(
  ) {
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    ::x10::array::LocalState<TPMGL(T)>* ls = this->FMGL(localHandle)->x10::lang::template PlaceLocalHandle< ::x10::array::LocalState<TPMGL(T)>*>::__apply();
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    return (!::x10aux::struct_equals(ls, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
      ? (::x10aux::nullCheck(ls)->FMGL(rail)) : (::x10::lang::Rail< TPMGL(T) >::_make());
    
}

//#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
/**
     * The PlaceGroup over which this DistArray is defined.
     */

//#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
template<class TPMGL(T)> void x10::array::DistArray<TPMGL(T)>::_constructor(
                           ::x10::lang::PlaceGroup* pg, ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*>* init,
                           x10_long sz) {
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    FMGL(size) = sz;
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    ::x10::array::DistArray<TPMGL(T)>* this__75962 = this;
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    ::x10::lang::PlaceLocalHandle< ::x10::array::LocalState<TPMGL(T)>*> plh =
      ::x10::lang::PlaceLocalHandle<void>::template makeFlat< ::x10::array::LocalState<TPMGL(T)>* >(
        pg, init);
    
    //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    ::x10::array::LocalState<TPMGL(T)>* ls = plh->x10::lang::template PlaceLocalHandle< ::x10::array::LocalState<TPMGL(T)>*>::__apply();
    
    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    this->FMGL(localHandle) = plh;
    
    //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    this->FMGL(placeGroup) = pg;
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    this->FMGL(raw) = this->x10::array::template DistArray<TPMGL(T)>::getRailFromLocalHandle();
}


//#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
template<class TPMGL(T)> ::x10::lang::Rail< TPMGL(T) >* x10::array::DistArray<TPMGL(T)>::raw(
  ) {
    return this->FMGL(raw);
    
}

//#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
template<class TPMGL(T)> ::x10::lang::PlaceGroup* x10::array::DistArray<TPMGL(T)>::placeGroup(
  ) {
    return this->FMGL(placeGroup);
    
}

//#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"

//#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
template<class TPMGL(T)> ::x10::lang::Iterator< ::x10::lang::Point*>*
  x10::array::DistArray<TPMGL(T)>::iterator() {
    return this->globalIndices()->iterator();
    
}

//#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"

//#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"

//#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"

//#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"

//#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
template<class TPMGL(T)> TPMGL(T) x10::array::DistArray<TPMGL(T)>::reduce(
  ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), TPMGL(T)>* op,
  TPMGL(T) unit) {
    return this->template reduce< TPMGL(T) >(op, op, unit);
    
}

//#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"

//#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"

//#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"

//#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"

//#line 266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"

//#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"

//#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"

//#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"

//#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"

//#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"

//#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
template<class TPMGL(T)> ::x10::array::DistArray<TPMGL(T)>*
  x10::array::DistArray<TPMGL(T)>::x10__array__DistArray____this__x10__array__DistArray(
  ) {
    return this;
    
}
template<class TPMGL(T)> void x10::array::DistArray<TPMGL(T)>::__fieldInitializers_x10_array_DistArray(
  ) {
 
}
template<class TPMGL(T)> void x10::array::DistArray<TPMGL(T)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(localHandle));
    buf.write(this->FMGL(placeGroup));
    buf.write(this->FMGL(size));
    
}

template<class TPMGL(T)> void x10::array::DistArray<TPMGL(T)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(localHandle) = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::array::LocalState<TPMGL(T)>*> >();
    FMGL(placeGroup) = buf.read< ::x10::lang::PlaceGroup*>();
    FMGL(size) = buf.read<x10_long>();
    /* fields with @TransientInitExpr annotations */
    FMGL(raw) = x10::array::template DistArray<TPMGL(T)>::getRailFromLocalHandle();
    
}

#endif // X10_ARRAY_DISTARRAY_H_IMPLEMENTATION
#endif // __X10_ARRAY_DISTARRAY_H_NODEPS
