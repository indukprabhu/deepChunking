#ifndef __X10_REGIONARRAY_DISTARRAY_H
#define __X10_REGIONARRAY_DISTARRAY_H

#include <x10rt.h>


#define X10_LANG_FUN_0_1_H_NODEPS
#include <x10/lang/Fun_0_1.h>
#undef X10_LANG_FUN_0_1_H_NODEPS
namespace x10 { namespace lang { 
class Point;
} } 
#define X10_LANG_ITERABLE_H_NODEPS
#include <x10/lang/Iterable.h>
#undef X10_LANG_ITERABLE_H_NODEPS
#define X10_LANG_PLACELOCALHANDLE_H_NODEPS
#include <x10/lang/PlaceLocalHandle.h>
#undef X10_LANG_PLACELOCALHANDLE_H_NODEPS
#define X10_LANG_PLACELOCALHANDLE_H_NODEPS
#include <x10/lang/PlaceLocalHandle.h>
#undef X10_LANG_PLACELOCALHANDLE_H_NODEPS
namespace x10 { namespace regionarray { 
class Dist;
} } 
namespace x10 { namespace regionarray { 
class Region;
} } 
namespace x10 { namespace regionarray { 
template<class TPMGL(T)> class DistArray__LocalState;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace compiler { 
class TransientInitExpr;
} } 
namespace x10 { namespace regionarray { 
template<class TPMGL(T)> class Array;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
class UnsupportedOperationException;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace regionarray { 
class Array__LayoutHelper;
} } 
namespace x10 { namespace compiler { 
class CompilerFlags;
} } 
namespace x10 { namespace lang { 
class IllegalArgumentException;
} } 
namespace x10 { namespace lang { 
class PlaceGroup;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(U)> class Fun_0_0;
} } 
namespace x10 { namespace lang { 
class Unsafe;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Iterator;
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
namespace x10 { namespace lang { 
class Runtime__Profile;
} } 
namespace x10 { namespace compiler { 
class Finalization;
} } 
namespace x10 { namespace compiler { 
class Abort;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(Z1), class TPMGL(Z2), class TPMGL(U)> class Fun_0_2;
} } 
namespace x10 { namespace regionarray { 
template<class TPMGL(U), class TPMGL(T)> class DistArray__Anonymous__27635;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Reducible;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace regionarray { 

template<class TPMGL(T)> class DistArray;
template <> class DistArray<void>;
template<class TPMGL(T)> class DistArray : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    ::x10::regionarray::Dist* FMGL(dist);
    
    static ::x10aux::itable_entry _itables[4];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static typename ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)>::template itable< ::x10::regionarray::DistArray<TPMGL(T)> > _itable_0;
    
    static ::x10::lang::Any::itable< ::x10::regionarray::DistArray<TPMGL(T)> > _itable_1;
    
    static typename ::x10::lang::Iterable< ::x10::lang::Point*>::template itable< ::x10::regionarray::DistArray<TPMGL(T)> > _itable_2;
    
    ::x10::regionarray::Region* region();
    x10_long rank();
    ::x10::lang::PlaceLocalHandle< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*>
      FMGL(localHandle);
    
    ::x10::lang::Rail< TPMGL(T) >* FMGL(raw);
    
    virtual ::x10::lang::Rail< TPMGL(T) >* getRawFromLocalHandle(
      );
    virtual ::x10::lang::Rail< TPMGL(T) >* raw();
    virtual ::x10::regionarray::Array<TPMGL(T)>* getLocalPortion(
      );
    void _constructor(::x10::regionarray::Dist* dist);
    
    static ::x10::regionarray::DistArray<TPMGL(T)>* _make(::x10::regionarray::Dist* dist);
    
    void _constructor(::x10::regionarray::Dist* dist, ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)>* init);
    
    static ::x10::regionarray::DistArray<TPMGL(T)>* _make(::x10::regionarray::Dist* dist,
                                                          ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)>* init);
    
    void _constructor(::x10::regionarray::Dist* dist, TPMGL(T) init);
    
    static ::x10::regionarray::DistArray<TPMGL(T)>* _make(
             ::x10::regionarray::Dist* dist, TPMGL(T) init);
    
    void _constructor(::x10::regionarray::DistArray<TPMGL(T)>* a,
                      ::x10::regionarray::Dist* d);
    
    static ::x10::regionarray::DistArray<TPMGL(T)>* _make(
             ::x10::regionarray::DistArray<TPMGL(T)>* a, ::x10::regionarray::Dist* d);
    
    void _constructor(::x10::regionarray::Dist* d, ::x10::lang::PlaceLocalHandle< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*> pls);
    
    static ::x10::regionarray::DistArray<TPMGL(T)>* _make(
             ::x10::regionarray::Dist* d, ::x10::lang::PlaceLocalHandle< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*> pls);
    
    virtual TPMGL(T) __apply(::x10::lang::Point* pt);
    virtual TPMGL(T) __apply(x10_long i0);
    virtual TPMGL(T) __apply(x10_long i0, x10_long i1);
    virtual TPMGL(T) __apply(x10_long i0, x10_long i1, x10_long i2);
    virtual TPMGL(T) __apply(x10_long i0, x10_long i1, x10_long i2,
                             x10_long i3);
    virtual TPMGL(T) __set(::x10::lang::Point* pt, TPMGL(T) v);
    virtual TPMGL(T) __set(x10_long i0, TPMGL(T) v);
    virtual TPMGL(T) __set(x10_long i0, x10_long i1, TPMGL(T) v);
    virtual TPMGL(T) __set(x10_long i0, x10_long i1, x10_long i2,
                           TPMGL(T) v);
    virtual TPMGL(T) __set(x10_long i0, x10_long i1, x10_long i2,
                           x10_long i3, TPMGL(T) v);
    virtual ::x10::regionarray::DistArray<TPMGL(T)>* restriction(
      ::x10::regionarray::Dist* d);
    virtual ::x10::regionarray::DistArray<TPMGL(T)>* restriction(
      ::x10::regionarray::Region* r);
    virtual ::x10::regionarray::DistArray<TPMGL(T)>* restriction(
      ::x10::lang::Place p);
    virtual ::x10::regionarray::DistArray<TPMGL(T)>* __bar(
      ::x10::regionarray::Region* r);
    virtual ::x10::regionarray::DistArray<TPMGL(T)>* __bar(
      ::x10::lang::Place p);
    virtual void fill(TPMGL(T) v);
    template<class TPMGL(U)> ::x10::regionarray::DistArray<TPMGL(U)>*
      map(::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op);
    template<class TPMGL(U)> ::x10::regionarray::DistArray<TPMGL(U)>*
      map(::x10::regionarray::DistArray<TPMGL(U)>* dst, ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op);
    template<class TPMGL(U)> ::x10::regionarray::DistArray<TPMGL(U)>*
      map(::x10::regionarray::DistArray<TPMGL(U)>* dst, ::x10::regionarray::Region* filter,
          ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op);
    template<class TPMGL(S), class TPMGL(U)> ::x10::regionarray::DistArray<TPMGL(S)>*
      map(::x10::regionarray::DistArray<TPMGL(U)>* src, ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>* op);
    template<class TPMGL(S), class TPMGL(U)> ::x10::regionarray::DistArray<TPMGL(S)>*
      map(::x10::regionarray::DistArray<TPMGL(S)>* dst, ::x10::regionarray::DistArray<TPMGL(U)>* src,
          ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>* op);
    template<class TPMGL(S), class TPMGL(U)> ::x10::regionarray::DistArray<TPMGL(S)>*
      map(::x10::regionarray::DistArray<TPMGL(S)>* dst, ::x10::regionarray::DistArray<TPMGL(U)>* src,
          ::x10::regionarray::Region* filter, ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>* op);
    virtual TPMGL(T) reduce(::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), TPMGL(T)>* op,
                            TPMGL(T) unit);
    template<class TPMGL(U)> TPMGL(U) reduce(::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>* lop,
                                             ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(U), TPMGL(U)>* gop,
                                             TPMGL(U) unit);
    virtual ::x10::lang::String* toString();
    virtual ::x10::lang::Iterator< ::x10::lang::Point*>* iterator(
      );
    virtual ::x10::regionarray::DistArray<TPMGL(T)>* x10__regionarray__DistArray____this__x10__regionarray__DistArray(
      );
    virtual void __fieldInitializers_x10_regionarray_DistArray(
      );
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

template<class TPMGL(T)> ::x10aux::RuntimeType x10::regionarray::DistArray<TPMGL(T)>::rtt;
template<class TPMGL(T)> void x10::regionarray::DistArray<TPMGL(T)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::regionarray::DistArray<void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)> >(), ::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Point*> >()};
    const ::x10aux::RuntimeType* params[1] = { ::x10aux::getRTT<TPMGL(T)>()};
    ::x10aux::RuntimeType::Variance variances[1] = { ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.regionarray.DistArray";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 2, parents, 1, params, variances);
}

template <> class DistArray<void> : public ::x10::lang::X10Class
{
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    template<class TPMGL(T)> static ::x10::regionarray::DistArray<TPMGL(T)>*
      make(::x10::regionarray::Dist* dist);
    
    template<class TPMGL(T)> static ::x10::regionarray::DistArray<TPMGL(T)>*
      make(::x10::regionarray::Dist* dist, ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)>* init);
    
    template<class TPMGL(T)> static ::x10::regionarray::DistArray<TPMGL(T)>*
      make(::x10::regionarray::Dist* dist, TPMGL(T) init);
    
    
};

} } 
#endif // X10_REGIONARRAY_DISTARRAY_H

namespace x10 { namespace regionarray { 
template<class TPMGL(T)> class DistArray;
} } 

#ifndef X10_REGIONARRAY_DISTARRAY_H_NODEPS
#define X10_REGIONARRAY_DISTARRAY_H_NODEPS
#include <x10/lang/Fun_0_1.h>
#include <x10/lang/Point.h>
#include <x10/lang/Iterable.h>
#include <x10/lang/PlaceLocalHandle.h>
#include <x10/regionarray/Dist.h>
#include <x10/regionarray/Region.h>
#include <x10/lang/Long.h>
#include <x10/regionarray/DistArray__LocalState.h>
#include <x10/lang/Rail.h>
#include <x10/compiler/TransientInitExpr.h>
#include <x10/regionarray/Array.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Place.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/UnsupportedOperationException.h>
#include <x10/lang/String.h>
#include <x10/lang/Any.h>
#include <x10/regionarray/Array__LayoutHelper.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/lang/IllegalArgumentException.h>
#include <x10/lang/PlaceGroup.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/lang/Unsafe.h>
#include <x10/lang/Iterator.h>
#include <x10/lang/FinishState.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Error.h>
#include <x10/lang/Exception.h>
#include <x10/compiler/AsyncClosure.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/lang/Fun_0_2.h>
#include <x10/regionarray/DistArray__Anonymous__27635.h>
#include <x10/lang/Reducible.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_REGIONARRAY_DISTARRAY__CLOSURE__6_CLOSURE
#define X10_REGIONARRAY_DISTARRAY__CLOSURE__6_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T), class TPMGL(U)> class x10_regionarray_DistArray__closure__6 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(U)>*>::template itable <x10_regionarray_DistArray__closure__6<TPMGL(T),TPMGL(U) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::regionarray::DistArray__LocalState<TPMGL(U)>* __apply() {
        
        //#line 516 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ::x10::lang::Rail< TPMGL(T) >* srcRail = (__extension__ ({
            ::x10::regionarray::DistArray<TPMGL(T)>* this__112223 = saved_this;
            ::x10aux::nullCheck(this__112223)->FMGL(raw);
        }))
        ;
        
        //#line 517 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ::x10::lang::Rail< TPMGL(U) >* newRail = ::x10::lang::Rail< TPMGL(U) >::_makeUnsafe(((::x10aux::nullCheck(saved_this->FMGL(dist))->maxOffset()) + (((x10_long)1ll))), false);
        
        //#line 518 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ::x10::regionarray::Region* reg = ::x10aux::nullCheck(saved_this->FMGL(dist))->get(
                                            ::x10::lang::Place::_make(::x10aux::here));
        
        //#line 519 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        {
            ::x10::lang::Iterator< ::x10::lang::Point*>* pt__112152;
            for (pt__112152 = ::x10aux::nullCheck(reg)->iterator();
                 ::x10::lang::Iterator< ::x10::lang::Point*>::hasNext(::x10aux::nullCheck(pt__112152));
                 ) {
                ::x10::lang::Point* pt = ::x10::lang::Iterator< ::x10::lang::Point*>::next(::x10aux::nullCheck(pt__112152));
                
                //#line 520 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                x10_long offset = ::x10aux::nullCheck(saved_this->FMGL(dist))->offset(
                                    pt);
                
                //#line 521 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                newRail->x10::lang::template Rail< TPMGL(U) >::__set(
                  offset, ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>::__apply(::x10aux::nullCheck(op), 
                    srcRail->x10::lang::template Rail< TPMGL(T) >::__apply(
                      offset)));
            }
        }
        
        //#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ::x10::regionarray::DistArray__LocalState<TPMGL(U)>* alloc__112260 =
           (new (::x10aux::alloc_z< ::x10::regionarray::DistArray__LocalState<TPMGL(U)> >()) ::x10::regionarray::DistArray__LocalState<TPMGL(U)>());
        (alloc__112260)->::x10::regionarray::DistArray__LocalState<TPMGL(U)>::_constructor(
          saved_this->FMGL(dist), newRail);
        return alloc__112260;
        
    }
    
    // captured environment
    ::x10::regionarray::DistArray<TPMGL(T)>* saved_this;
    ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->op);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_DistArray__closure__6<TPMGL(T),TPMGL(U) >* storage = ::x10aux::alloc_z<x10_regionarray_DistArray__closure__6<TPMGL(T),TPMGL(U) > >();
        buf.record_reference(storage);
        ::x10::regionarray::DistArray<TPMGL(T)>* that_saved_this = buf.read< ::x10::regionarray::DistArray<TPMGL(T)>*>();
        ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* that_op = buf.read< ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>*>();
        x10_regionarray_DistArray__closure__6<TPMGL(T),TPMGL(U) >* this_ = new (storage) x10_regionarray_DistArray__closure__6<TPMGL(T),TPMGL(U) >(that_saved_this, that_op);
        return this_;
    }
    
    x10_regionarray_DistArray__closure__6(::x10::regionarray::DistArray<TPMGL(T)>* saved_this, ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op) : saved_this(saved_this), op(op) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(U)>*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(U)>*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10:515-524";
    }

};

template<class TPMGL(T), class TPMGL(U)> typename ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(U)>*>::template itable <x10_regionarray_DistArray__closure__6<TPMGL(T),TPMGL(U) > >x10_regionarray_DistArray__closure__6<TPMGL(T),TPMGL(U) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_DistArray__closure__6<TPMGL(T),TPMGL(U) >::__apply, &x10_regionarray_DistArray__closure__6<TPMGL(T),TPMGL(U) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T), class TPMGL(U)> ::x10aux::itable_entry x10_regionarray_DistArray__closure__6<TPMGL(T),TPMGL(U) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(U)>*> >, &x10_regionarray_DistArray__closure__6<TPMGL(T),TPMGL(U) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T), class TPMGL(U)> const ::x10aux::serialization_id_t x10_regionarray_DistArray__closure__6<TPMGL(T),TPMGL(U) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_DistArray__closure__6<TPMGL(T),TPMGL(U) >::_deserialize);

#endif // X10_REGIONARRAY_DISTARRAY__CLOSURE__6_CLOSURE
#ifndef X10_REGIONARRAY_DISTARRAY__CLOSURE__7_CLOSURE
#define X10_REGIONARRAY_DISTARRAY__CLOSURE__7_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T), class TPMGL(U)> class x10_regionarray_DistArray__closure__7 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_regionarray_DistArray__closure__7<TPMGL(T),TPMGL(U) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 542 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ::x10::regionarray::Region* reg = ::x10aux::nullCheck(saved_this->FMGL(dist))->get(
                                                ::x10::lang::Place::_make(::x10aux::here));
            
            //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ::x10::lang::Rail< TPMGL(T) >* srcRail = (__extension__ ({
                ::x10::regionarray::DistArray<TPMGL(T)>* this__112224 =
                  saved_this;
                ::x10aux::nullCheck(this__112224)->FMGL(raw);
            }))
            ;
            
            //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ::x10::lang::Rail< TPMGL(U) >* dstRail = ::x10aux::nullCheck(dst)->FMGL(raw);
            
            //#line 545 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            {
                ::x10::lang::Iterator< ::x10::lang::Point*>* pt__112154;
                for (pt__112154 = ::x10aux::nullCheck(reg)->iterator();
                     ::x10::lang::Iterator< ::x10::lang::Point*>::hasNext(::x10aux::nullCheck(pt__112154));
                     ) {
                    ::x10::lang::Point* pt = ::x10::lang::Iterator< ::x10::lang::Point*>::next(::x10aux::nullCheck(pt__112154));
                    
                    //#line 546 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    x10_long offset = ::x10aux::nullCheck(saved_this->FMGL(dist))->offset(
                                        pt);
                    
                    //#line 547 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    dstRail->x10::lang::template Rail< TPMGL(U) >::__set(
                      offset, ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>::__apply(::x10aux::nullCheck(op), 
                        srcRail->x10::lang::template Rail< TPMGL(T) >::__apply(
                          offset)));
                }
            }
            
        }
        catch (::x10::lang::CheckedThrowable* __exc1933) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc1933)) {
                ::x10::lang::Error* __lowerer__var__0__ =
                  static_cast< ::x10::lang::Error*>(__exc1933);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1933);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::regionarray::DistArray<TPMGL(T)>* saved_this;
    ::x10::regionarray::DistArray<TPMGL(U)>* dst;
    ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->dst);
        buf.write(this->op);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_DistArray__closure__7<TPMGL(T),TPMGL(U) >* storage = ::x10aux::alloc_z<x10_regionarray_DistArray__closure__7<TPMGL(T),TPMGL(U) > >();
        buf.record_reference(storage);
        ::x10::regionarray::DistArray<TPMGL(T)>* that_saved_this = buf.read< ::x10::regionarray::DistArray<TPMGL(T)>*>();
        ::x10::regionarray::DistArray<TPMGL(U)>* that_dst = buf.read< ::x10::regionarray::DistArray<TPMGL(U)>*>();
        ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* that_op = buf.read< ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>*>();
        x10_regionarray_DistArray__closure__7<TPMGL(T),TPMGL(U) >* this_ = new (storage) x10_regionarray_DistArray__closure__7<TPMGL(T),TPMGL(U) >(that_saved_this, that_dst, that_op);
        return this_;
    }
    
    x10_regionarray_DistArray__closure__7(::x10::regionarray::DistArray<TPMGL(T)>* saved_this, ::x10::regionarray::DistArray<TPMGL(U)>* dst, ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op) : saved_this(saved_this), dst(dst), op(op) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10:541-549";
    }

};

template<class TPMGL(T), class TPMGL(U)> typename ::x10::lang::VoidFun_0_0::template itable <x10_regionarray_DistArray__closure__7<TPMGL(T),TPMGL(U) > >x10_regionarray_DistArray__closure__7<TPMGL(T),TPMGL(U) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_DistArray__closure__7<TPMGL(T),TPMGL(U) >::__apply, &x10_regionarray_DistArray__closure__7<TPMGL(T),TPMGL(U) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T), class TPMGL(U)> ::x10aux::itable_entry x10_regionarray_DistArray__closure__7<TPMGL(T),TPMGL(U) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_regionarray_DistArray__closure__7<TPMGL(T),TPMGL(U) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T), class TPMGL(U)> const ::x10aux::serialization_id_t x10_regionarray_DistArray__closure__7<TPMGL(T),TPMGL(U) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_DistArray__closure__7<TPMGL(T),TPMGL(U) >::_deserialize);
template<class TPMGL(T), class TPMGL(U)> const ::x10aux::serialization_id_t x10_regionarray_DistArray__closure__7<TPMGL(T),TPMGL(U) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_regionarray_DistArray__closure__7<TPMGL(T),TPMGL(U) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_REGIONARRAY_DISTARRAY__CLOSURE__7_CLOSURE
#ifndef X10_REGIONARRAY_DISTARRAY__CLOSURE__8_CLOSURE
#define X10_REGIONARRAY_DISTARRAY__CLOSURE__8_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T), class TPMGL(U)> class x10_regionarray_DistArray__closure__8 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_regionarray_DistArray__closure__8<TPMGL(T),TPMGL(U) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ::x10::regionarray::Region* reg = ::x10aux::nullCheck(saved_this->FMGL(dist))->get(
                                                ::x10::lang::Place::_make(::x10aux::here));
            
            //#line 572 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ::x10::regionarray::Region* freg = ::x10aux::nullCheck(reg)->__and(
                                                 filter);
            
            //#line 573 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ::x10::lang::Rail< TPMGL(T) >* srcRail = (__extension__ ({
                ::x10::regionarray::DistArray<TPMGL(T)>* this__112225 =
                  saved_this;
                ::x10aux::nullCheck(this__112225)->FMGL(raw);
            }))
            ;
            
            //#line 574 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ::x10::lang::Rail< TPMGL(U) >* dstRail = ::x10aux::nullCheck(dst)->FMGL(raw);
            
            //#line 575 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            {
                ::x10::lang::Iterator< ::x10::lang::Point*>* pt__112158;
                for (pt__112158 = ::x10aux::nullCheck(freg)->iterator();
                     ::x10::lang::Iterator< ::x10::lang::Point*>::hasNext(::x10aux::nullCheck(pt__112158));
                     ) {
                    ::x10::lang::Point* pt = ::x10::lang::Iterator< ::x10::lang::Point*>::next(::x10aux::nullCheck(pt__112158));
                    
                    //#line 576 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    x10_long offset = ::x10aux::nullCheck(saved_this->FMGL(dist))->offset(
                                        pt);
                    
                    //#line 577 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    dstRail->x10::lang::template Rail< TPMGL(U) >::__set(
                      offset, ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>::__apply(::x10aux::nullCheck(op), 
                        srcRail->x10::lang::template Rail< TPMGL(T) >::__apply(
                          offset)));
                }
            }
            
        }
        catch (::x10::lang::CheckedThrowable* __exc1937) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc1937)) {
                ::x10::lang::Error* __lowerer__var__0__ =
                  static_cast< ::x10::lang::Error*>(__exc1937);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1937);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::regionarray::DistArray<TPMGL(T)>* saved_this;
    ::x10::regionarray::Region* filter;
    ::x10::regionarray::DistArray<TPMGL(U)>* dst;
    ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->filter);
        buf.write(this->dst);
        buf.write(this->op);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_DistArray__closure__8<TPMGL(T),TPMGL(U) >* storage = ::x10aux::alloc_z<x10_regionarray_DistArray__closure__8<TPMGL(T),TPMGL(U) > >();
        buf.record_reference(storage);
        ::x10::regionarray::DistArray<TPMGL(T)>* that_saved_this = buf.read< ::x10::regionarray::DistArray<TPMGL(T)>*>();
        ::x10::regionarray::Region* that_filter = buf.read< ::x10::regionarray::Region*>();
        ::x10::regionarray::DistArray<TPMGL(U)>* that_dst = buf.read< ::x10::regionarray::DistArray<TPMGL(U)>*>();
        ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* that_op = buf.read< ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>*>();
        x10_regionarray_DistArray__closure__8<TPMGL(T),TPMGL(U) >* this_ = new (storage) x10_regionarray_DistArray__closure__8<TPMGL(T),TPMGL(U) >(that_saved_this, that_filter, that_dst, that_op);
        return this_;
    }
    
    x10_regionarray_DistArray__closure__8(::x10::regionarray::DistArray<TPMGL(T)>* saved_this, ::x10::regionarray::Region* filter, ::x10::regionarray::DistArray<TPMGL(U)>* dst, ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op) : saved_this(saved_this), filter(filter), dst(dst), op(op) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10:570-579";
    }

};

template<class TPMGL(T), class TPMGL(U)> typename ::x10::lang::VoidFun_0_0::template itable <x10_regionarray_DistArray__closure__8<TPMGL(T),TPMGL(U) > >x10_regionarray_DistArray__closure__8<TPMGL(T),TPMGL(U) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_DistArray__closure__8<TPMGL(T),TPMGL(U) >::__apply, &x10_regionarray_DistArray__closure__8<TPMGL(T),TPMGL(U) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T), class TPMGL(U)> ::x10aux::itable_entry x10_regionarray_DistArray__closure__8<TPMGL(T),TPMGL(U) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_regionarray_DistArray__closure__8<TPMGL(T),TPMGL(U) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T), class TPMGL(U)> const ::x10aux::serialization_id_t x10_regionarray_DistArray__closure__8<TPMGL(T),TPMGL(U) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_DistArray__closure__8<TPMGL(T),TPMGL(U) >::_deserialize);
template<class TPMGL(T), class TPMGL(U)> const ::x10aux::serialization_id_t x10_regionarray_DistArray__closure__8<TPMGL(T),TPMGL(U) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_regionarray_DistArray__closure__8<TPMGL(T),TPMGL(U) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_REGIONARRAY_DISTARRAY__CLOSURE__8_CLOSURE
#ifndef X10_REGIONARRAY_DISTARRAY__CLOSURE__9_CLOSURE
#define X10_REGIONARRAY_DISTARRAY__CLOSURE__9_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T), class TPMGL(S), class TPMGL(U)> class x10_regionarray_DistArray__closure__9 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(S)>*>::template itable <x10_regionarray_DistArray__closure__9<TPMGL(T),TPMGL(S),TPMGL(U) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::regionarray::DistArray__LocalState<TPMGL(S)>* __apply() {
        
        //#line 597 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ::x10::lang::Rail< TPMGL(T) >* src1Rail = (__extension__ ({
            ::x10::regionarray::DistArray<TPMGL(T)>* this__112226 = saved_this;
            ::x10aux::nullCheck(this__112226)->FMGL(raw);
        }))
        ;
        
        //#line 598 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ::x10::lang::Rail< TPMGL(U) >* src2Rail = ::x10aux::nullCheck(src)->FMGL(raw);
        
        //#line 599 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ::x10::lang::Rail< TPMGL(S) >* newRail = ::x10::lang::Rail< TPMGL(S) >::_makeUnsafe(((::x10aux::nullCheck(saved_this->FMGL(dist))->maxOffset()) + (((x10_long)1ll))), false);
        
        //#line 600 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ::x10::regionarray::Region* reg = ::x10aux::nullCheck(saved_this->FMGL(dist))->get(
                                            ::x10::lang::Place::_make(::x10aux::here));
        
        //#line 601 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        {
            ::x10::lang::Iterator< ::x10::lang::Point*>* pt__112162;
            for (pt__112162 = ::x10aux::nullCheck(reg)->iterator();
                 ::x10::lang::Iterator< ::x10::lang::Point*>::hasNext(::x10aux::nullCheck(pt__112162));
                 ) {
                ::x10::lang::Point* pt = ::x10::lang::Iterator< ::x10::lang::Point*>::next(::x10aux::nullCheck(pt__112162));
                
                //#line 602 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                x10_long offset = ::x10aux::nullCheck(saved_this->FMGL(dist))->offset(
                                    pt);
                
                //#line 603 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                newRail->x10::lang::template Rail< TPMGL(S) >::__set(
                  offset, ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>::__apply(::x10aux::nullCheck(op), 
                    src1Rail->x10::lang::template Rail< TPMGL(T) >::__apply(
                      offset), src2Rail->x10::lang::template Rail< TPMGL(U) >::__apply(
                                 offset)));
            }
        }
        
        //#line 605 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ::x10::regionarray::DistArray__LocalState<TPMGL(S)>* alloc__112262 =
           (new (::x10aux::alloc_z< ::x10::regionarray::DistArray__LocalState<TPMGL(S)> >()) ::x10::regionarray::DistArray__LocalState<TPMGL(S)>());
        (alloc__112262)->::x10::regionarray::DistArray__LocalState<TPMGL(S)>::_constructor(
          saved_this->FMGL(dist), newRail);
        return alloc__112262;
        
    }
    
    // captured environment
    ::x10::regionarray::DistArray<TPMGL(T)>* saved_this;
    ::x10::regionarray::DistArray<TPMGL(U)>* src;
    ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>* op;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->src);
        buf.write(this->op);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_DistArray__closure__9<TPMGL(T),TPMGL(S),TPMGL(U) >* storage = ::x10aux::alloc_z<x10_regionarray_DistArray__closure__9<TPMGL(T),TPMGL(S),TPMGL(U) > >();
        buf.record_reference(storage);
        ::x10::regionarray::DistArray<TPMGL(T)>* that_saved_this = buf.read< ::x10::regionarray::DistArray<TPMGL(T)>*>();
        ::x10::regionarray::DistArray<TPMGL(U)>* that_src = buf.read< ::x10::regionarray::DistArray<TPMGL(U)>*>();
        ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>* that_op = buf.read< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>*>();
        x10_regionarray_DistArray__closure__9<TPMGL(T),TPMGL(S),TPMGL(U) >* this_ = new (storage) x10_regionarray_DistArray__closure__9<TPMGL(T),TPMGL(S),TPMGL(U) >(that_saved_this, that_src, that_op);
        return this_;
    }
    
    x10_regionarray_DistArray__closure__9(::x10::regionarray::DistArray<TPMGL(T)>* saved_this, ::x10::regionarray::DistArray<TPMGL(U)>* src, ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>* op) : saved_this(saved_this), src(src), op(op) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(S)>*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(S)>*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10:596-606";
    }

};

template<class TPMGL(T), class TPMGL(S), class TPMGL(U)> typename ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(S)>*>::template itable <x10_regionarray_DistArray__closure__9<TPMGL(T),TPMGL(S),TPMGL(U) > >x10_regionarray_DistArray__closure__9<TPMGL(T),TPMGL(S),TPMGL(U) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_DistArray__closure__9<TPMGL(T),TPMGL(S),TPMGL(U) >::__apply, &x10_regionarray_DistArray__closure__9<TPMGL(T),TPMGL(S),TPMGL(U) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T), class TPMGL(S), class TPMGL(U)> ::x10aux::itable_entry x10_regionarray_DistArray__closure__9<TPMGL(T),TPMGL(S),TPMGL(U) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(S)>*> >, &x10_regionarray_DistArray__closure__9<TPMGL(T),TPMGL(S),TPMGL(U) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T), class TPMGL(S), class TPMGL(U)> const ::x10aux::serialization_id_t x10_regionarray_DistArray__closure__9<TPMGL(T),TPMGL(S),TPMGL(U) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_DistArray__closure__9<TPMGL(T),TPMGL(S),TPMGL(U) >::_deserialize);

#endif // X10_REGIONARRAY_DISTARRAY__CLOSURE__9_CLOSURE
#ifndef X10_REGIONARRAY_DISTARRAY__CLOSURE__10_CLOSURE
#define X10_REGIONARRAY_DISTARRAY__CLOSURE__10_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T), class TPMGL(S), class TPMGL(U)> class x10_regionarray_DistArray__closure__10 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_regionarray_DistArray__closure__10<TPMGL(T),TPMGL(S),TPMGL(U) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 625 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ::x10::regionarray::Region* reg = ::x10aux::nullCheck(saved_this->FMGL(dist))->get(
                                                ::x10::lang::Place::_make(::x10aux::here));
            
            //#line 626 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ::x10::lang::Rail< TPMGL(T) >* src1Rail = (__extension__ ({
                ::x10::regionarray::DistArray<TPMGL(T)>* this__112227 =
                  saved_this;
                ::x10aux::nullCheck(this__112227)->FMGL(raw);
            }))
            ;
            
            //#line 627 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ::x10::lang::Rail< TPMGL(U) >* src2Rail = ::x10aux::nullCheck(src)->FMGL(raw);
            
            //#line 628 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ::x10::lang::Rail< TPMGL(S) >* dstRail = ::x10aux::nullCheck(dst)->FMGL(raw);
            
            //#line 629 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            {
                ::x10::lang::Iterator< ::x10::lang::Point*>* pt__112164;
                for (pt__112164 = ::x10aux::nullCheck(reg)->iterator();
                     ::x10::lang::Iterator< ::x10::lang::Point*>::hasNext(::x10aux::nullCheck(pt__112164));
                     ) {
                    ::x10::lang::Point* pt = ::x10::lang::Iterator< ::x10::lang::Point*>::next(::x10aux::nullCheck(pt__112164));
                    
                    //#line 630 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    x10_long offset = ::x10aux::nullCheck(saved_this->FMGL(dist))->offset(
                                        pt);
                    
                    //#line 631 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    dstRail->x10::lang::template Rail< TPMGL(S) >::__set(
                      offset, ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>::__apply(::x10aux::nullCheck(op), 
                        src1Rail->x10::lang::template Rail< TPMGL(T) >::__apply(
                          offset), src2Rail->x10::lang::template Rail< TPMGL(U) >::__apply(
                                     offset)));
                }
            }
            
        }
        catch (::x10::lang::CheckedThrowable* __exc1942) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc1942)) {
                ::x10::lang::Error* __lowerer__var__0__ =
                  static_cast< ::x10::lang::Error*>(__exc1942);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1942);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::regionarray::DistArray<TPMGL(T)>* saved_this;
    ::x10::regionarray::DistArray<TPMGL(U)>* src;
    ::x10::regionarray::DistArray<TPMGL(S)>* dst;
    ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>* op;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->src);
        buf.write(this->dst);
        buf.write(this->op);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_DistArray__closure__10<TPMGL(T),TPMGL(S),TPMGL(U) >* storage = ::x10aux::alloc_z<x10_regionarray_DistArray__closure__10<TPMGL(T),TPMGL(S),TPMGL(U) > >();
        buf.record_reference(storage);
        ::x10::regionarray::DistArray<TPMGL(T)>* that_saved_this = buf.read< ::x10::regionarray::DistArray<TPMGL(T)>*>();
        ::x10::regionarray::DistArray<TPMGL(U)>* that_src = buf.read< ::x10::regionarray::DistArray<TPMGL(U)>*>();
        ::x10::regionarray::DistArray<TPMGL(S)>* that_dst = buf.read< ::x10::regionarray::DistArray<TPMGL(S)>*>();
        ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>* that_op = buf.read< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>*>();
        x10_regionarray_DistArray__closure__10<TPMGL(T),TPMGL(S),TPMGL(U) >* this_ = new (storage) x10_regionarray_DistArray__closure__10<TPMGL(T),TPMGL(S),TPMGL(U) >(that_saved_this, that_src, that_dst, that_op);
        return this_;
    }
    
    x10_regionarray_DistArray__closure__10(::x10::regionarray::DistArray<TPMGL(T)>* saved_this, ::x10::regionarray::DistArray<TPMGL(U)>* src, ::x10::regionarray::DistArray<TPMGL(S)>* dst, ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>* op) : saved_this(saved_this), src(src), dst(dst), op(op) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10:624-633";
    }

};

template<class TPMGL(T), class TPMGL(S), class TPMGL(U)> typename ::x10::lang::VoidFun_0_0::template itable <x10_regionarray_DistArray__closure__10<TPMGL(T),TPMGL(S),TPMGL(U) > >x10_regionarray_DistArray__closure__10<TPMGL(T),TPMGL(S),TPMGL(U) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_DistArray__closure__10<TPMGL(T),TPMGL(S),TPMGL(U) >::__apply, &x10_regionarray_DistArray__closure__10<TPMGL(T),TPMGL(S),TPMGL(U) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T), class TPMGL(S), class TPMGL(U)> ::x10aux::itable_entry x10_regionarray_DistArray__closure__10<TPMGL(T),TPMGL(S),TPMGL(U) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_regionarray_DistArray__closure__10<TPMGL(T),TPMGL(S),TPMGL(U) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T), class TPMGL(S), class TPMGL(U)> const ::x10aux::serialization_id_t x10_regionarray_DistArray__closure__10<TPMGL(T),TPMGL(S),TPMGL(U) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_DistArray__closure__10<TPMGL(T),TPMGL(S),TPMGL(U) >::_deserialize);
template<class TPMGL(T), class TPMGL(S), class TPMGL(U)> const ::x10aux::serialization_id_t x10_regionarray_DistArray__closure__10<TPMGL(T),TPMGL(S),TPMGL(U) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_regionarray_DistArray__closure__10<TPMGL(T),TPMGL(S),TPMGL(U) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_REGIONARRAY_DISTARRAY__CLOSURE__10_CLOSURE
#ifndef X10_REGIONARRAY_DISTARRAY__CLOSURE__11_CLOSURE
#define X10_REGIONARRAY_DISTARRAY__CLOSURE__11_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T), class TPMGL(S), class TPMGL(U)> class x10_regionarray_DistArray__closure__11 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_regionarray_DistArray__closure__11<TPMGL(T),TPMGL(S),TPMGL(U) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 655 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ::x10::regionarray::Region* reg = ::x10aux::nullCheck(saved_this->FMGL(dist))->get(
                                                ::x10::lang::Place::_make(::x10aux::here));
            
            //#line 656 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ::x10::regionarray::Region* freg = ::x10aux::nullCheck(reg)->__and(
                                                 filter);
            
            //#line 657 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ::x10::lang::Rail< TPMGL(T) >* src1Rail = (__extension__ ({
                ::x10::regionarray::DistArray<TPMGL(T)>* this__112228 =
                  saved_this;
                ::x10aux::nullCheck(this__112228)->FMGL(raw);
            }))
            ;
            
            //#line 658 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ::x10::lang::Rail< TPMGL(U) >* src2Rail = ::x10aux::nullCheck(src)->FMGL(raw);
            
            //#line 659 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ::x10::lang::Rail< TPMGL(S) >* dstRail = ::x10aux::nullCheck(dst)->FMGL(raw);
            
            //#line 660 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            {
                ::x10::lang::Iterator< ::x10::lang::Point*>* pt__112168;
                for (pt__112168 = ::x10aux::nullCheck(freg)->iterator();
                     ::x10::lang::Iterator< ::x10::lang::Point*>::hasNext(::x10aux::nullCheck(pt__112168));
                     ) {
                    ::x10::lang::Point* pt = ::x10::lang::Iterator< ::x10::lang::Point*>::next(::x10aux::nullCheck(pt__112168));
                    
                    //#line 661 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    x10_long offset = ::x10aux::nullCheck(saved_this->FMGL(dist))->offset(
                                        pt);
                    
                    //#line 662 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    dstRail->x10::lang::template Rail< TPMGL(S) >::__set(
                      offset, ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>::__apply(::x10aux::nullCheck(op), 
                        src1Rail->x10::lang::template Rail< TPMGL(T) >::__apply(
                          offset), src2Rail->x10::lang::template Rail< TPMGL(U) >::__apply(
                                     offset)));
                }
            }
            
        }
        catch (::x10::lang::CheckedThrowable* __exc1946) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc1946)) {
                ::x10::lang::Error* __lowerer__var__0__ =
                  static_cast< ::x10::lang::Error*>(__exc1946);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1946);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::regionarray::DistArray<TPMGL(T)>* saved_this;
    ::x10::regionarray::Region* filter;
    ::x10::regionarray::DistArray<TPMGL(U)>* src;
    ::x10::regionarray::DistArray<TPMGL(S)>* dst;
    ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>* op;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->filter);
        buf.write(this->src);
        buf.write(this->dst);
        buf.write(this->op);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_DistArray__closure__11<TPMGL(T),TPMGL(S),TPMGL(U) >* storage = ::x10aux::alloc_z<x10_regionarray_DistArray__closure__11<TPMGL(T),TPMGL(S),TPMGL(U) > >();
        buf.record_reference(storage);
        ::x10::regionarray::DistArray<TPMGL(T)>* that_saved_this = buf.read< ::x10::regionarray::DistArray<TPMGL(T)>*>();
        ::x10::regionarray::Region* that_filter = buf.read< ::x10::regionarray::Region*>();
        ::x10::regionarray::DistArray<TPMGL(U)>* that_src = buf.read< ::x10::regionarray::DistArray<TPMGL(U)>*>();
        ::x10::regionarray::DistArray<TPMGL(S)>* that_dst = buf.read< ::x10::regionarray::DistArray<TPMGL(S)>*>();
        ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>* that_op = buf.read< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>*>();
        x10_regionarray_DistArray__closure__11<TPMGL(T),TPMGL(S),TPMGL(U) >* this_ = new (storage) x10_regionarray_DistArray__closure__11<TPMGL(T),TPMGL(S),TPMGL(U) >(that_saved_this, that_filter, that_src, that_dst, that_op);
        return this_;
    }
    
    x10_regionarray_DistArray__closure__11(::x10::regionarray::DistArray<TPMGL(T)>* saved_this, ::x10::regionarray::Region* filter, ::x10::regionarray::DistArray<TPMGL(U)>* src, ::x10::regionarray::DistArray<TPMGL(S)>* dst, ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>* op) : saved_this(saved_this), filter(filter), src(src), dst(dst), op(op) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10:654-664";
    }

};

template<class TPMGL(T), class TPMGL(S), class TPMGL(U)> typename ::x10::lang::VoidFun_0_0::template itable <x10_regionarray_DistArray__closure__11<TPMGL(T),TPMGL(S),TPMGL(U) > >x10_regionarray_DistArray__closure__11<TPMGL(T),TPMGL(S),TPMGL(U) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_DistArray__closure__11<TPMGL(T),TPMGL(S),TPMGL(U) >::__apply, &x10_regionarray_DistArray__closure__11<TPMGL(T),TPMGL(S),TPMGL(U) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T), class TPMGL(S), class TPMGL(U)> ::x10aux::itable_entry x10_regionarray_DistArray__closure__11<TPMGL(T),TPMGL(S),TPMGL(U) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_regionarray_DistArray__closure__11<TPMGL(T),TPMGL(S),TPMGL(U) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T), class TPMGL(S), class TPMGL(U)> const ::x10aux::serialization_id_t x10_regionarray_DistArray__closure__11<TPMGL(T),TPMGL(S),TPMGL(U) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_DistArray__closure__11<TPMGL(T),TPMGL(S),TPMGL(U) >::_deserialize);
template<class TPMGL(T), class TPMGL(S), class TPMGL(U)> const ::x10aux::serialization_id_t x10_regionarray_DistArray__closure__11<TPMGL(T),TPMGL(S),TPMGL(U) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_regionarray_DistArray__closure__11<TPMGL(T),TPMGL(S),TPMGL(U) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_REGIONARRAY_DISTARRAY__CLOSURE__11_CLOSURE
#ifndef X10_REGIONARRAY_DISTARRAY__CLOSURE__12_CLOSURE
#define X10_REGIONARRAY_DISTARRAY__CLOSURE__12_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T), class TPMGL(U)> class x10_regionarray_DistArray__closure__12 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_regionarray_DistArray__closure__12<TPMGL(T),TPMGL(U) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 705 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ::x10::regionarray::Region* reg = ::x10aux::nullCheck(saved_this->FMGL(dist))->get(
                                                ::x10::lang::Place::_make(::x10aux::here));
            
            //#line 706 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            TPMGL(U) localRes = unit;
            
            //#line 707 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ::x10::lang::Rail< TPMGL(T) >* rail = (__extension__ ({
                ::x10::regionarray::DistArray<TPMGL(T)>* this__112233 =
                  saved_this;
                ::x10aux::nullCheck(this__112233)->FMGL(raw);
            }))
            ;
            
            //#line 708 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            {
                ::x10::lang::Iterator< ::x10::lang::Point*>* pt__112172;
                for (pt__112172 = ::x10aux::nullCheck(reg)->iterator();
                     ::x10::lang::Iterator< ::x10::lang::Point*>::hasNext(::x10aux::nullCheck(pt__112172));
                     ) {
                    ::x10::lang::Point* pt = ::x10::lang::Iterator< ::x10::lang::Point*>::next(::x10aux::nullCheck(pt__112172));
                    
                    //#line 709 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    localRes = ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>::__apply(::x10aux::nullCheck(lop), 
                      localRes, rail->x10::lang::template Rail< TPMGL(T) >::__apply(
                                  ::x10aux::nullCheck(saved_this->FMGL(dist))->offset(
                                    pt)));
                }
            }
            
            //#line 711 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ::x10::lang::Runtime::template makeOffer< TPMGL(U) >(
              localRes);
        }
        catch (::x10::lang::CheckedThrowable* __exc1951) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc1951)) {
                ::x10::lang::Error* __lowerer__var__0__ =
                  static_cast< ::x10::lang::Error*>(__exc1951);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1951);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::regionarray::DistArray<TPMGL(T)>* saved_this;
    TPMGL(U) unit;
    ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>* lop;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->unit);
        buf.write(this->lop);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_DistArray__closure__12<TPMGL(T),TPMGL(U) >* storage = ::x10aux::alloc_z<x10_regionarray_DistArray__closure__12<TPMGL(T),TPMGL(U) > >();
        buf.record_reference(storage);
        ::x10::regionarray::DistArray<TPMGL(T)>* that_saved_this = buf.read< ::x10::regionarray::DistArray<TPMGL(T)>*>();
        TPMGL(U) that_unit = buf.read<TPMGL(U)>();
        ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>* that_lop = buf.read< ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>*>();
        x10_regionarray_DistArray__closure__12<TPMGL(T),TPMGL(U) >* this_ = new (storage) x10_regionarray_DistArray__closure__12<TPMGL(T),TPMGL(U) >(that_saved_this, that_unit, that_lop);
        return this_;
    }
    
    x10_regionarray_DistArray__closure__12(::x10::regionarray::DistArray<TPMGL(T)>* saved_this, TPMGL(U) unit, ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>* lop) : saved_this(saved_this), unit(unit), lop(lop) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10:704-712";
    }

};

template<class TPMGL(T), class TPMGL(U)> typename ::x10::lang::VoidFun_0_0::template itable <x10_regionarray_DistArray__closure__12<TPMGL(T),TPMGL(U) > >x10_regionarray_DistArray__closure__12<TPMGL(T),TPMGL(U) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_DistArray__closure__12<TPMGL(T),TPMGL(U) >::__apply, &x10_regionarray_DistArray__closure__12<TPMGL(T),TPMGL(U) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T), class TPMGL(U)> ::x10aux::itable_entry x10_regionarray_DistArray__closure__12<TPMGL(T),TPMGL(U) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_regionarray_DistArray__closure__12<TPMGL(T),TPMGL(U) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T), class TPMGL(U)> const ::x10aux::serialization_id_t x10_regionarray_DistArray__closure__12<TPMGL(T),TPMGL(U) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_DistArray__closure__12<TPMGL(T),TPMGL(U) >::_deserialize);
template<class TPMGL(T), class TPMGL(U)> const ::x10aux::serialization_id_t x10_regionarray_DistArray__closure__12<TPMGL(T),TPMGL(U) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_regionarray_DistArray__closure__12<TPMGL(T),TPMGL(U) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_REGIONARRAY_DISTARRAY__CLOSURE__12_CLOSURE
#ifndef X10_REGIONARRAY_DISTARRAY_H_GENERICS
#define X10_REGIONARRAY_DISTARRAY_H_GENERICS
#ifndef X10_REGIONARRAY_DISTARRAY_H_map_1931
#define X10_REGIONARRAY_DISTARRAY_H_map_1931
template<class TPMGL(T)> template<class TPMGL(U)> ::x10::regionarray::DistArray<TPMGL(U)>*
  x10::regionarray::DistArray<TPMGL(T)>::map(::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op) {
    
    //#line 515 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    ::x10::lang::PlaceLocalHandle< ::x10::regionarray::DistArray__LocalState<TPMGL(U)>*> plh =
      ::x10::lang::PlaceLocalHandle<void>::template make< ::x10::regionarray::DistArray__LocalState<TPMGL(U)>* >(
        ::x10aux::nullCheck(this->FMGL(dist))->places(), reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(U)>*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(U)>*> >(sizeof(x10_regionarray_DistArray__closure__6<TPMGL(T),TPMGL(U)>)))x10_regionarray_DistArray__closure__6<TPMGL(T),TPMGL(U)>(this, op))));
    
    //#line 525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    ::x10::regionarray::DistArray<TPMGL(U)>* alloc__112261 =
       (new (::x10aux::alloc_z< ::x10::regionarray::DistArray<TPMGL(U)> >()) ::x10::regionarray::DistArray<TPMGL(U)>());
    (alloc__112261)->::x10::regionarray::DistArray<TPMGL(U)>::_constructor(
      this->FMGL(dist), plh);
    return alloc__112261;
    
}
#endif // X10_REGIONARRAY_DISTARRAY_H_map_1931
#ifndef X10_REGIONARRAY_DISTARRAY_H_map_1932
#define X10_REGIONARRAY_DISTARRAY_H_map_1932
template<class TPMGL(T)> template<class TPMGL(U)> ::x10::regionarray::DistArray<TPMGL(U)>*
  x10::regionarray::DistArray<TPMGL(T)>::map(::x10::regionarray::DistArray<TPMGL(U)>* dst,
                                             ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op) {
    {
        
        //#line 539 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ::x10::lang::Runtime::ensureNotInAtomic();
        ::x10::lang::FinishState* x10____var18 = ::x10::lang::Runtime::startFinish();
        {
            ::x10::lang::CheckedThrowable* throwable__112310 =
              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                try {
                    {
                        
                        //#line 540 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        {
                            ::x10::lang::Iterator< ::x10::lang::Place>* where__112156;
                            for (where__112156 = ::x10aux::nullCheck(::x10aux::nullCheck(this->FMGL(dist))->places())->iterator();
                                 ::x10::lang::Iterator< ::x10::lang::Place>::hasNext(::x10aux::nullCheck(where__112156));
                                 ) {
                                ::x10::lang::Place where =
                                  ::x10::lang::Iterator< ::x10::lang::Place>::next(::x10aux::nullCheck(where__112156));
                                
                                //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                                ::x10::lang::Runtime::runAsync(
                                  where, reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_regionarray_DistArray__closure__7<TPMGL(T),TPMGL(U)>)))x10_regionarray_DistArray__closure__7<TPMGL(T),TPMGL(U)>(this, dst, op))),
                                  ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                            }
                        }
                        
                    }
                }
                catch (::x10::lang::CheckedThrowable* __exc1934) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc1934);
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
            catch (::x10::lang::CheckedThrowable* __exc1935) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__112311 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1935);
                    {
                        throwable__112310 = formal__112311;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__112310)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__112310))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__112310));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::stopFinish(x10____var18);
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__112310)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__112310)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__112310));
                }
                
            }
            
        }
    }
    
    //#line 552 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    return dst;
    
}
#endif // X10_REGIONARRAY_DISTARRAY_H_map_1932
#ifndef X10_REGIONARRAY_DISTARRAY_H_map_1936
#define X10_REGIONARRAY_DISTARRAY_H_map_1936
template<class TPMGL(T)> template<class TPMGL(U)> ::x10::regionarray::DistArray<TPMGL(U)>*
  x10::regionarray::DistArray<TPMGL(T)>::map(::x10::regionarray::DistArray<TPMGL(U)>* dst,
                                             ::x10::regionarray::Region* filter,
                                             ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op) {
    {
        
        //#line 568 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ::x10::lang::Runtime::ensureNotInAtomic();
        ::x10::lang::FinishState* x10____var19 = ::x10::lang::Runtime::startFinish();
        {
            ::x10::lang::CheckedThrowable* throwable__112313 =
              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                try {
                    {
                        
                        //#line 569 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        {
                            ::x10::lang::Iterator< ::x10::lang::Place>* where__112160;
                            for (where__112160 = ::x10aux::nullCheck(::x10aux::nullCheck(this->FMGL(dist))->places())->iterator();
                                 ::x10::lang::Iterator< ::x10::lang::Place>::hasNext(::x10aux::nullCheck(where__112160));
                                 ) {
                                ::x10::lang::Place where =
                                  ::x10::lang::Iterator< ::x10::lang::Place>::next(::x10aux::nullCheck(where__112160));
                                
                                //#line 570 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                                ::x10::lang::Runtime::runAsync(
                                  where, reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_regionarray_DistArray__closure__8<TPMGL(T),TPMGL(U)>)))x10_regionarray_DistArray__closure__8<TPMGL(T),TPMGL(U)>(this, filter, dst, op))),
                                  ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                            }
                        }
                        
                    }
                }
                catch (::x10::lang::CheckedThrowable* __exc1938) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc1938);
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
            catch (::x10::lang::CheckedThrowable* __exc1939) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__112314 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1939);
                    {
                        throwable__112313 = formal__112314;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__112313)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__112313))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__112313));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::stopFinish(x10____var19);
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__112313)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__112313)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__112313));
                }
                
            }
            
        }
    }
    
    //#line 582 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    return dst;
    
}
#endif // X10_REGIONARRAY_DISTARRAY_H_map_1936
#ifndef X10_REGIONARRAY_DISTARRAY_H_map_1940
#define X10_REGIONARRAY_DISTARRAY_H_map_1940
template<class TPMGL(T)> template<class TPMGL(S), class TPMGL(U)>
::x10::regionarray::DistArray<TPMGL(S)>* x10::regionarray::DistArray<TPMGL(T)>::map(
  ::x10::regionarray::DistArray<TPMGL(U)>* src, ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>* op) {
    
    //#line 596 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    ::x10::lang::PlaceLocalHandle< ::x10::regionarray::DistArray__LocalState<TPMGL(S)>*> plh =
      ::x10::lang::PlaceLocalHandle<void>::template make< ::x10::regionarray::DistArray__LocalState<TPMGL(S)>* >(
        ::x10aux::nullCheck(this->FMGL(dist))->places(), reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(S)>*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(S)>*> >(sizeof(x10_regionarray_DistArray__closure__9<TPMGL(T),TPMGL(S),TPMGL(U)>)))x10_regionarray_DistArray__closure__9<TPMGL(T),TPMGL(S),TPMGL(U)>(this, src, op))));
    
    //#line 607 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    ::x10::regionarray::DistArray<TPMGL(S)>* alloc__112263 =
       (new (::x10aux::alloc_z< ::x10::regionarray::DistArray<TPMGL(S)> >()) ::x10::regionarray::DistArray<TPMGL(S)>());
    (alloc__112263)->::x10::regionarray::DistArray<TPMGL(S)>::_constructor(
      this->FMGL(dist), plh);
    return alloc__112263;
    
}
#endif // X10_REGIONARRAY_DISTARRAY_H_map_1940
#ifndef X10_REGIONARRAY_DISTARRAY_H_map_1941
#define X10_REGIONARRAY_DISTARRAY_H_map_1941
template<class TPMGL(T)> template<class TPMGL(S), class TPMGL(U)>
::x10::regionarray::DistArray<TPMGL(S)>* x10::regionarray::DistArray<TPMGL(T)>::map(
  ::x10::regionarray::DistArray<TPMGL(S)>* dst, ::x10::regionarray::DistArray<TPMGL(U)>* src,
  ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>* op) {
    {
        
        //#line 622 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ::x10::lang::Runtime::ensureNotInAtomic();
        ::x10::lang::FinishState* x10____var20 = ::x10::lang::Runtime::startFinish();
        {
            ::x10::lang::CheckedThrowable* throwable__112316 =
              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                try {
                    {
                        
                        //#line 623 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        {
                            ::x10::lang::Iterator< ::x10::lang::Place>* where__112166;
                            for (where__112166 = ::x10aux::nullCheck(::x10aux::nullCheck(this->FMGL(dist))->places())->iterator();
                                 ::x10::lang::Iterator< ::x10::lang::Place>::hasNext(::x10aux::nullCheck(where__112166));
                                 ) {
                                ::x10::lang::Place where =
                                  ::x10::lang::Iterator< ::x10::lang::Place>::next(::x10aux::nullCheck(where__112166));
                                
                                //#line 624 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                                ::x10::lang::Runtime::runAsync(
                                  where, reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_regionarray_DistArray__closure__10<TPMGL(T),TPMGL(S),TPMGL(U)>)))x10_regionarray_DistArray__closure__10<TPMGL(T),TPMGL(S),TPMGL(U)>(this, src, dst, op))),
                                  ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                            }
                        }
                        
                    }
                }
                catch (::x10::lang::CheckedThrowable* __exc1943) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc1943);
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
            catch (::x10::lang::CheckedThrowable* __exc1944) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__112317 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1944);
                    {
                        throwable__112316 = formal__112317;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__112316)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__112316))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__112316));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::stopFinish(x10____var20);
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__112316)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__112316)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__112316));
                }
                
            }
            
        }
    }
    
    //#line 636 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    return dst;
    
}
#endif // X10_REGIONARRAY_DISTARRAY_H_map_1941
#ifndef X10_REGIONARRAY_DISTARRAY_H_map_1945
#define X10_REGIONARRAY_DISTARRAY_H_map_1945
template<class TPMGL(T)> template<class TPMGL(S), class TPMGL(U)>
::x10::regionarray::DistArray<TPMGL(S)>* x10::regionarray::DistArray<TPMGL(T)>::map(
  ::x10::regionarray::DistArray<TPMGL(S)>* dst, ::x10::regionarray::DistArray<TPMGL(U)>* src,
  ::x10::regionarray::Region* filter, ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>* op) {
    {
        
        //#line 652 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ::x10::lang::Runtime::ensureNotInAtomic();
        ::x10::lang::FinishState* x10____var21 = ::x10::lang::Runtime::startFinish();
        {
            ::x10::lang::CheckedThrowable* throwable__112319 =
              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                try {
                    {
                        
                        //#line 653 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        {
                            ::x10::lang::Iterator< ::x10::lang::Place>* where__112170;
                            for (where__112170 = ::x10aux::nullCheck(::x10aux::nullCheck(this->FMGL(dist))->places())->iterator();
                                 ::x10::lang::Iterator< ::x10::lang::Place>::hasNext(::x10aux::nullCheck(where__112170));
                                 ) {
                                ::x10::lang::Place where =
                                  ::x10::lang::Iterator< ::x10::lang::Place>::next(::x10aux::nullCheck(where__112170));
                                
                                //#line 654 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                                ::x10::lang::Runtime::runAsync(
                                  where, reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_regionarray_DistArray__closure__11<TPMGL(T),TPMGL(S),TPMGL(U)>)))x10_regionarray_DistArray__closure__11<TPMGL(T),TPMGL(S),TPMGL(U)>(this, filter, src, dst, op))),
                                  ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                            }
                        }
                        
                    }
                }
                catch (::x10::lang::CheckedThrowable* __exc1947) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc1947);
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
            catch (::x10::lang::CheckedThrowable* __exc1948) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__112320 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1948);
                    {
                        throwable__112319 = formal__112320;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__112319)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__112319))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__112319));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::stopFinish(x10____var21);
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__112319)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__112319)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__112319));
                }
                
            }
            
        }
    }
    
    //#line 667 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    return dst;
    
}
#endif // X10_REGIONARRAY_DISTARRAY_H_map_1945
#ifndef X10_REGIONARRAY_DISTARRAY_H_reduce_1950
#define X10_REGIONARRAY_DISTARRAY_H_reduce_1950
template<class TPMGL(T)> template<class TPMGL(U)> TPMGL(U)
  x10::regionarray::DistArray<TPMGL(T)>::reduce(::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>* lop,
                                                ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(U), TPMGL(U)>* gop,
                                                TPMGL(U) unit) {
    
    //#line 697 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    ::x10::regionarray::DistArray__Anonymous__27635<TPMGL(U), TPMGL(T)>* reducer =
       (new (::x10aux::alloc_z< ::x10::regionarray::DistArray__Anonymous__27635<TPMGL(U), TPMGL(T)> >()) ::x10::regionarray::DistArray__Anonymous__27635<TPMGL(U), TPMGL(T)>());
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    ::x10::regionarray::DistArray<TPMGL(T)>* out__112264 =
      this;
    
    //#line 696 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    TPMGL(U) unit__112265 = unit;
    ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(U), TPMGL(U)>* gop__112266 =
      gop;
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    reducer->FMGL(out__) = out__112264;
    
    //#line 696 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    reducer->FMGL(unit) = unit__112265;
    reducer->FMGL(gop) = gop__112266;
    
    //#line 702 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    TPMGL(U) result;
    {
        ::x10::lang::FinishState* x10____var22 = ::x10aux::class_cast_unchecked< ::x10::lang::FinishState*>(::x10::lang::Runtime::template startCollectingFinish< TPMGL(U) >(
                                                                                                              reinterpret_cast< ::x10::lang::Reducible<TPMGL(U)>*>(reducer)));
        {
            ::x10::lang::CheckedThrowable* throwable__112322 =
              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                try {
                    {
                        
                        //#line 703 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                        {
                            ::x10::lang::Iterator< ::x10::lang::Place>* where__112174;
                            for (where__112174 = ::x10aux::nullCheck(::x10aux::nullCheck(this->FMGL(dist))->places())->iterator();
                                 ::x10::lang::Iterator< ::x10::lang::Place>::hasNext(::x10aux::nullCheck(where__112174));
                                 ) {
                                ::x10::lang::Place where =
                                  ::x10::lang::Iterator< ::x10::lang::Place>::next(::x10aux::nullCheck(where__112174));
                                
                                //#line 704 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                                ::x10::lang::Runtime::runAsync(
                                  where, reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_regionarray_DistArray__closure__12<TPMGL(T),TPMGL(U)>)))x10_regionarray_DistArray__closure__12<TPMGL(T),TPMGL(U)>(this, unit, lop))),
                                  ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                            }
                        }
                        
                    }
                }
                catch (::x10::lang::CheckedThrowable* __exc1952) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc1952);
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
            catch (::x10::lang::CheckedThrowable* __exc1953) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__112323 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1953);
                    {
                        throwable__112322 = formal__112323;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__112322)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__112322))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__112322));
                }
                
            }
            if (true) {
                result = ::x10::lang::Runtime::template stopCollectingFinish< TPMGL(U) >(
                           x10____var22);
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__112322)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__112322)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__112322));
                }
                
            }
            
        }
    }
    
    //#line 716 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    return result;
    
}
#endif // X10_REGIONARRAY_DISTARRAY_H_reduce_1950
#endif // X10_REGIONARRAY_DISTARRAY_H_GENERICS
#ifndef X10_REGIONARRAY_DISTARRAY_H_IMPLEMENTATION
#define X10_REGIONARRAY_DISTARRAY_H_IMPLEMENTATION
#include <x10/regionarray/DistArray.h>

#ifndef X10_REGIONARRAY_DISTARRAY__CLOSURE__1_CLOSURE
#define X10_REGIONARRAY_DISTARRAY__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T)> class x10_regionarray_DistArray__closure__1 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*>::template itable <x10_regionarray_DistArray__closure__1<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::regionarray::DistArray__LocalState<TPMGL(T)>* __apply() {
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        x10_long size = ((::x10aux::nullCheck(dist)->maxOffset()) + (((x10_long)1ll)));
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ::x10::lang::Rail< TPMGL(T) >* localRaw = ::x10::lang::Rail< TPMGL(T) >::_make(size);
        
        //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ::x10::regionarray::DistArray__LocalState<TPMGL(T)>* alloc__112244 =
           (new (::x10aux::alloc_z< ::x10::regionarray::DistArray__LocalState<TPMGL(T)> >()) ::x10::regionarray::DistArray__LocalState<TPMGL(T)>());
        (alloc__112244)->::x10::regionarray::DistArray__LocalState<TPMGL(T)>::_constructor(
          dist, localRaw);
        return alloc__112244;
        
    }
    
    // captured environment
    ::x10::regionarray::Dist* dist;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->dist);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_DistArray__closure__1<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_regionarray_DistArray__closure__1<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::regionarray::Dist* that_dist = buf.read< ::x10::regionarray::Dist*>();
        x10_regionarray_DistArray__closure__1<TPMGL(T) >* this_ = new (storage) x10_regionarray_DistArray__closure__1<TPMGL(T) >(that_dist);
        return this_;
    }
    
    x10_regionarray_DistArray__closure__1(::x10::regionarray::Dist* dist) : dist(dist) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10:121-125";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*>::template itable <x10_regionarray_DistArray__closure__1<TPMGL(T) > >x10_regionarray_DistArray__closure__1<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_DistArray__closure__1<TPMGL(T) >::__apply, &x10_regionarray_DistArray__closure__1<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_regionarray_DistArray__closure__1<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*> >, &x10_regionarray_DistArray__closure__1<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_regionarray_DistArray__closure__1<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_DistArray__closure__1<TPMGL(T) >::_deserialize);

#endif // X10_REGIONARRAY_DISTARRAY__CLOSURE__1_CLOSURE
#ifndef X10_REGIONARRAY_DISTARRAY__CLOSURE__2_CLOSURE
#define X10_REGIONARRAY_DISTARRAY__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T)> class x10_regionarray_DistArray__closure__2 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*>::template itable <x10_regionarray_DistArray__closure__2<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::regionarray::DistArray__LocalState<TPMGL(T)>* __apply() {
        
        //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ::x10::lang::Rail< TPMGL(T) >* localRaw = ::x10::lang::Rail< TPMGL(T) >::_makeUnsafe(((::x10aux::nullCheck(dist)->maxOffset()) + (((x10_long)1ll))), false);
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ::x10::regionarray::Region* reg = ::x10aux::nullCheck(dist)->get(
                                            ::x10::lang::Place::_make(::x10aux::here));
        
        //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        {
            ::x10::lang::Iterator< ::x10::lang::Point*>* pt__112144;
            for (pt__112144 = ::x10aux::nullCheck(reg)->iterator(); ::x10::lang::Iterator< ::x10::lang::Point*>::hasNext(::x10aux::nullCheck(pt__112144));
                 ) {
                ::x10::lang::Point* pt = ::x10::lang::Iterator< ::x10::lang::Point*>::next(::x10aux::nullCheck(pt__112144));
                
                //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                localRaw->x10::lang::template Rail< TPMGL(T) >::__set(
                  ::x10aux::nullCheck(dist)->offset(pt), ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)>::__apply(::x10aux::nullCheck(init), 
                    pt));
            }
        }
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ::x10::regionarray::DistArray__LocalState<TPMGL(T)>* alloc__112247 =
           (new (::x10aux::alloc_z< ::x10::regionarray::DistArray__LocalState<TPMGL(T)> >()) ::x10::regionarray::DistArray__LocalState<TPMGL(T)>());
        (alloc__112247)->::x10::regionarray::DistArray__LocalState<TPMGL(T)>::_constructor(
          dist, localRaw);
        return alloc__112247;
        
    }
    
    // captured environment
    ::x10::regionarray::Dist* dist;
    ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)>* init;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->dist);
        buf.write(this->init);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_DistArray__closure__2<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_regionarray_DistArray__closure__2<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::regionarray::Dist* that_dist = buf.read< ::x10::regionarray::Dist*>();
        ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)>* that_init = buf.read< ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)>*>();
        x10_regionarray_DistArray__closure__2<TPMGL(T) >* this_ = new (storage) x10_regionarray_DistArray__closure__2<TPMGL(T) >(that_dist, that_init);
        return this_;
    }
    
    x10_regionarray_DistArray__closure__2(::x10::regionarray::Dist* dist, ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)>* init) : dist(dist), init(init) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10:152-159";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*>::template itable <x10_regionarray_DistArray__closure__2<TPMGL(T) > >x10_regionarray_DistArray__closure__2<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_DistArray__closure__2<TPMGL(T) >::__apply, &x10_regionarray_DistArray__closure__2<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_regionarray_DistArray__closure__2<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*> >, &x10_regionarray_DistArray__closure__2<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_regionarray_DistArray__closure__2<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_DistArray__closure__2<TPMGL(T) >::_deserialize);

#endif // X10_REGIONARRAY_DISTARRAY__CLOSURE__2_CLOSURE
#ifndef X10_REGIONARRAY_DISTARRAY__CLOSURE__3_CLOSURE
#define X10_REGIONARRAY_DISTARRAY__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T)> class x10_regionarray_DistArray__closure__3 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*>::template itable <x10_regionarray_DistArray__closure__3<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::regionarray::DistArray__LocalState<TPMGL(T)>* __apply() {
        
        //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ::x10::lang::Rail< TPMGL(T) >* localRaw = ::x10::lang::Rail< TPMGL(T) >::_makeUnsafe(((::x10aux::nullCheck(dist)->maxOffset()) + (((x10_long)1ll))), false);
        
        //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ::x10::regionarray::Region* reg = ::x10aux::nullCheck(dist)->get(
                                            ::x10::lang::Place::_make(::x10aux::here));
        
        //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        {
            ::x10::lang::Iterator< ::x10::lang::Point*>* pt__112146;
            for (pt__112146 = ::x10aux::nullCheck(reg)->iterator(); ::x10::lang::Iterator< ::x10::lang::Point*>::hasNext(::x10aux::nullCheck(pt__112146));
                 ) {
                ::x10::lang::Point* pt = ::x10::lang::Iterator< ::x10::lang::Point*>::next(::x10aux::nullCheck(pt__112146));
                
                //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                localRaw->x10::lang::template Rail< TPMGL(T) >::__set(
                  ::x10aux::nullCheck(dist)->offset(pt), init);
            }
        }
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ::x10::regionarray::DistArray__LocalState<TPMGL(T)>* alloc__112250 =
           (new (::x10aux::alloc_z< ::x10::regionarray::DistArray__LocalState<TPMGL(T)> >()) ::x10::regionarray::DistArray__LocalState<TPMGL(T)>());
        (alloc__112250)->::x10::regionarray::DistArray__LocalState<TPMGL(T)>::_constructor(
          dist, localRaw);
        return alloc__112250;
        
    }
    
    // captured environment
    ::x10::regionarray::Dist* dist;
    TPMGL(T) init;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->dist);
        buf.write(this->init);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_DistArray__closure__3<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_regionarray_DistArray__closure__3<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::regionarray::Dist* that_dist = buf.read< ::x10::regionarray::Dist*>();
        TPMGL(T) that_init = buf.read<TPMGL(T)>();
        x10_regionarray_DistArray__closure__3<TPMGL(T) >* this_ = new (storage) x10_regionarray_DistArray__closure__3<TPMGL(T) >(that_dist, that_init);
        return this_;
    }
    
    x10_regionarray_DistArray__closure__3(::x10::regionarray::Dist* dist, TPMGL(T) init) : dist(dist), init(init) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10:180-187";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*>::template itable <x10_regionarray_DistArray__closure__3<TPMGL(T) > >x10_regionarray_DistArray__closure__3<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_DistArray__closure__3<TPMGL(T) >::__apply, &x10_regionarray_DistArray__closure__3<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_regionarray_DistArray__closure__3<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*> >, &x10_regionarray_DistArray__closure__3<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_regionarray_DistArray__closure__3<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_DistArray__closure__3<TPMGL(T) >::_deserialize);

#endif // X10_REGIONARRAY_DISTARRAY__CLOSURE__3_CLOSURE
#ifndef X10_REGIONARRAY_DISTARRAY__CLOSURE__4_CLOSURE
#define X10_REGIONARRAY_DISTARRAY__CLOSURE__4_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T)> class x10_regionarray_DistArray__closure__4 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*>::template itable <x10_regionarray_DistArray__closure__4<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::regionarray::DistArray__LocalState<TPMGL(T)>* __apply() {
        
        //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ::x10::regionarray::DistArray__LocalState<TPMGL(T)>* alloc__112252 =
           (new (::x10aux::alloc_z< ::x10::regionarray::DistArray__LocalState<TPMGL(T)> >()) ::x10::regionarray::DistArray__LocalState<TPMGL(T)>());
        (alloc__112252)->::x10::regionarray::DistArray__LocalState<TPMGL(T)>::_constructor(
          d, ::x10aux::nullCheck(::x10aux::nullCheck(a)->FMGL(localHandle)->x10::lang::template PlaceLocalHandle< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*>::__apply())->FMGL(data));
        return alloc__112252;
        
    }
    
    // captured environment
    ::x10::regionarray::Dist* d;
    ::x10::regionarray::DistArray<TPMGL(T)>* a;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->d);
        buf.write(this->a);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_DistArray__closure__4<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_regionarray_DistArray__closure__4<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::regionarray::Dist* that_d = buf.read< ::x10::regionarray::Dist*>();
        ::x10::regionarray::DistArray<TPMGL(T)>* that_a = buf.read< ::x10::regionarray::DistArray<TPMGL(T)>*>();
        x10_regionarray_DistArray__closure__4<TPMGL(T) >* this_ = new (storage) x10_regionarray_DistArray__closure__4<TPMGL(T) >(that_d, that_a);
        return this_;
    }
    
    x10_regionarray_DistArray__closure__4(::x10::regionarray::Dist* d, ::x10::regionarray::DistArray<TPMGL(T)>* a) : d(d), a(a) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10:205";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*>::template itable <x10_regionarray_DistArray__closure__4<TPMGL(T) > >x10_regionarray_DistArray__closure__4<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_DistArray__closure__4<TPMGL(T) >::__apply, &x10_regionarray_DistArray__closure__4<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_regionarray_DistArray__closure__4<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*> >, &x10_regionarray_DistArray__closure__4<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_regionarray_DistArray__closure__4<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_DistArray__closure__4<TPMGL(T) >::_deserialize);

#endif // X10_REGIONARRAY_DISTARRAY__CLOSURE__4_CLOSURE
#ifndef X10_REGIONARRAY_DISTARRAY__CLOSURE__5_CLOSURE
#define X10_REGIONARRAY_DISTARRAY__CLOSURE__5_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
template<class TPMGL(T)> class x10_regionarray_DistArray__closure__5 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::VoidFun_0_0::template itable <x10_regionarray_DistArray__closure__5<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 496 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ::x10::regionarray::Region* reg = ::x10aux::nullCheck(saved_this->FMGL(dist))->get(
                                                ::x10::lang::Place::_make(::x10aux::here));
            
            //#line 497 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            ::x10::lang::Rail< TPMGL(T) >* rail = saved_this->FMGL(raw);
            
            //#line 498 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
            {
                ::x10::lang::Iterator< ::x10::lang::Point*>* pt__112148;
                for (pt__112148 = ::x10aux::nullCheck(reg)->iterator();
                     ::x10::lang::Iterator< ::x10::lang::Point*>::hasNext(::x10aux::nullCheck(pt__112148));
                     ) {
                    ::x10::lang::Point* pt = ::x10::lang::Iterator< ::x10::lang::Point*>::next(::x10aux::nullCheck(pt__112148));
                    
                    //#line 499 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                    rail->x10::lang::template Rail< TPMGL(T) >::__set(
                      ::x10aux::nullCheck(saved_this->FMGL(dist))->offset(
                        pt), v);
                }
            }
            
        }
        catch (::x10::lang::CheckedThrowable* __exc1928) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc1928)) {
                ::x10::lang::Error* __lowerer__var__0__ =
                  static_cast< ::x10::lang::Error*>(__exc1928);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1928);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::regionarray::DistArray<TPMGL(T)>* saved_this;
    TPMGL(T) v;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->v);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_DistArray__closure__5<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_regionarray_DistArray__closure__5<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::regionarray::DistArray<TPMGL(T)>* that_saved_this = buf.read< ::x10::regionarray::DistArray<TPMGL(T)>*>();
        TPMGL(T) that_v = buf.read<TPMGL(T)>();
        x10_regionarray_DistArray__closure__5<TPMGL(T) >* this_ = new (storage) x10_regionarray_DistArray__closure__5<TPMGL(T) >(that_saved_this, that_v);
        return this_;
    }
    
    x10_regionarray_DistArray__closure__5(::x10::regionarray::DistArray<TPMGL(T)>* saved_this, TPMGL(T) v) : saved_this(saved_this), v(v) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10:495-501";
    }

};

template<class TPMGL(T)> typename ::x10::lang::VoidFun_0_0::template itable <x10_regionarray_DistArray__closure__5<TPMGL(T) > >x10_regionarray_DistArray__closure__5<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_DistArray__closure__5<TPMGL(T) >::__apply, &x10_regionarray_DistArray__closure__5<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_regionarray_DistArray__closure__5<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_regionarray_DistArray__closure__5<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_regionarray_DistArray__closure__5<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_DistArray__closure__5<TPMGL(T) >::_deserialize);
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_regionarray_DistArray__closure__5<TPMGL(T) >::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_regionarray_DistArray__closure__5<TPMGL(T) >::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

#endif // X10_REGIONARRAY_DISTARRAY__CLOSURE__5_CLOSURE

//#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> typename ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)>::template itable< ::x10::regionarray::DistArray<TPMGL(T)> >  x10::regionarray::DistArray<TPMGL(T)>::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::regionarray::DistArray<TPMGL(T)>::__apply, &x10::regionarray::DistArray<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10::lang::Any::itable< ::x10::regionarray::DistArray<TPMGL(T)> >  x10::regionarray::DistArray<TPMGL(T)>::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::regionarray::DistArray<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> typename ::x10::lang::Iterable< ::x10::lang::Point*>::template itable< ::x10::regionarray::DistArray<TPMGL(T)> >  x10::regionarray::DistArray<TPMGL(T)>::_itable_2(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::regionarray::DistArray<TPMGL(T)>::iterator, &x10::regionarray::DistArray<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10::regionarray::DistArray<TPMGL(T)>::_itables[4] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Point*> >, &_itable_2), ::x10aux::itable_entry(NULL, (void*)"::x10::regionarray::DistArray<TPMGL(T)>")};

//#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> ::x10::regionarray::Region* x10::regionarray::DistArray<TPMGL(T)>::region(
  ) {
    return ::x10aux::nullCheck(this->FMGL(dist))->FMGL(region);
    
}

//#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> x10_long x10::regionarray::DistArray<TPMGL(T)>::rank(
  ) {
    ::x10::regionarray::Dist* this__112235 = this->FMGL(dist);
    return ::x10aux::nullCheck(::x10aux::nullCheck(this__112235)->FMGL(region))->FMGL(rank);
    
}

//#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
/** The place-local state for the DistArray */

//#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
/** 
     * The place-local backing storage for elements of the DistArray.
     */

//#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> ::x10::lang::Rail< TPMGL(T) >* x10::regionarray::DistArray<TPMGL(T)>::getRawFromLocalHandle(
  ) {
    
    //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    ::x10::regionarray::DistArray__LocalState<TPMGL(T)>* ls =
      this->FMGL(localHandle)->x10::lang::template PlaceLocalHandle< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*>::__apply();
    
    //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    return (!::x10aux::struct_equals(ls, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
      ? (::x10aux::nullCheck(ls)->FMGL(data)) : (::x10::lang::Rail< TPMGL(T) >::_make());
    
}

//#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> ::x10::lang::Rail< TPMGL(T) >* x10::regionarray::DistArray<TPMGL(T)>::raw(
  ) {
    return this->FMGL(raw);
    
}

//#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> ::x10::regionarray::Array<TPMGL(T)>*
  x10::regionarray::DistArray<TPMGL(T)>::getLocalPortion(
  ) {
    
    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    ::x10::regionarray::Region* regionForHere = ::x10aux::nullCheck(this->FMGL(dist))->get(
                                                  ::x10::lang::Place::_make(::x10aux::here));
    
    //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    if (!(::x10aux::nullCheck(regionForHere)->FMGL(rect)))
    {
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make(::x10::lang::String::__plus(::x10aux::type_name(this), (__extension__ ({ static ::x10::lang::String* strLit__126475 = ::x10aux::makeStringLit(".getLocalPortion(): local portion is not rectangular!"); strLit__126475; }))))));
    }
    
    //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    ::x10::regionarray::Array<TPMGL(T)>* alloc__112241 = 
    (new (::x10aux::alloc_z< ::x10::regionarray::Array<TPMGL(T)> >()) ::x10::regionarray::Array<TPMGL(T)>());
    
    //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Region* reg__112239 = regionForHere;
    ::x10::lang::Rail< TPMGL(T) >* backingStore__112240 =
      this->FMGL(raw);
    
    //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    alloc__112241->FMGL(region) = (reg__112239);
    alloc__112241->FMGL(rank) = ::x10aux::nullCheck(reg__112239)->FMGL(rank);
    alloc__112241->FMGL(rect) = ::x10aux::nullCheck(reg__112239)->FMGL(rect);
    alloc__112241->FMGL(zeroBased) = ::x10aux::nullCheck(reg__112239)->FMGL(zeroBased);
    alloc__112241->FMGL(rail) = ::x10aux::nullCheck(reg__112239)->FMGL(rail);
    alloc__112241->FMGL(size) = ::x10aux::nullCheck(reg__112239)->size();
    
    //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array__LayoutHelper crh__112237 =
       ::x10::regionarray::Array__LayoutHelper::_alloc();
    (crh__112237)->::x10::regionarray::Array__LayoutHelper::_constructor(
      reg__112239);
    
    //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    alloc__112241->FMGL(layout_min0) = crh__112237->FMGL(min0);
    
    //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    alloc__112241->FMGL(layout_stride1) = crh__112237->FMGL(stride1);
    
    //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    alloc__112241->FMGL(layout_min1) = crh__112237->FMGL(min1);
    
    //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    alloc__112241->FMGL(layout) = crh__112237->FMGL(layout);
    
    //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long n__112238 = crh__112237->FMGL(size);
    
    //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    if (((n__112238) > ((x10_long)(::x10aux::nullCheck(backingStore__112240)->FMGL(size)))))
    {
        
        //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        if (true) {
            ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::IllegalArgumentException::_make((__extension__ ({ static ::x10::lang::String* strLit__126476 = ::x10aux::makeStringLit("backingStore too small"); strLit__126476; })))));
        }
        
    }
    
    //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    alloc__112241->FMGL(raw) = (backingStore__112240);
    
    //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    return alloc__112241;
    
}

//#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"

//#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> void x10::regionarray::DistArray<TPMGL(T)>::_constructor(
                           ::x10::regionarray::Dist* dist) {
    
    //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    FMGL(dist) = dist;
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    ::x10::regionarray::DistArray<TPMGL(T)>* this__112243 =
      this;
    
    //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    this->FMGL(localHandle) = ::x10::lang::PlaceLocalHandle<void>::template makeFlat< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>* >(
                                ::x10aux::nullCheck(dist)->places(),
                                reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*> >(sizeof(x10_regionarray_DistArray__closure__1<TPMGL(T)>)))x10_regionarray_DistArray__closure__1<TPMGL(T)>(dist))));
    
    //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    this->FMGL(raw) = this->x10::regionarray::template DistArray<TPMGL(T)>::getRawFromLocalHandle();
}
template<class TPMGL(T)> ::x10::regionarray::DistArray<TPMGL(T)>* x10::regionarray::DistArray<TPMGL(T)>::_make(
                           ::x10::regionarray::Dist* dist)
{
    ::x10::regionarray::DistArray<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::regionarray::DistArray<TPMGL(T)> >()) ::x10::regionarray::DistArray<TPMGL(T)>();
    this_->_constructor(dist);
    return this_;
}



//#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"

//#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> void x10::regionarray::DistArray<TPMGL(T)>::_constructor(
                           ::x10::regionarray::Dist* dist,
                           ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)>* init) {
    
    //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    FMGL(dist) = dist;
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    ::x10::regionarray::DistArray<TPMGL(T)>* this__112246 =
      this;
    
    //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    this->FMGL(localHandle) = ::x10::lang::PlaceLocalHandle<void>::template make< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>* >(
                                ::x10aux::nullCheck(dist)->places(),
                                reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*> >(sizeof(x10_regionarray_DistArray__closure__2<TPMGL(T)>)))x10_regionarray_DistArray__closure__2<TPMGL(T)>(dist, init))));
    
    //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    this->FMGL(raw) = this->x10::regionarray::template DistArray<TPMGL(T)>::getRawFromLocalHandle();
}
template<class TPMGL(T)> ::x10::regionarray::DistArray<TPMGL(T)>* x10::regionarray::DistArray<TPMGL(T)>::_make(
                           ::x10::regionarray::Dist* dist,
                           ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)>* init)
{
    ::x10::regionarray::DistArray<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::regionarray::DistArray<TPMGL(T)> >()) ::x10::regionarray::DistArray<TPMGL(T)>();
    this_->_constructor(dist, init);
    return this_;
}



//#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"

//#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> void x10::regionarray::DistArray<TPMGL(T)>::_constructor(
                           ::x10::regionarray::Dist* dist,
                           TPMGL(T) init) {
    
    //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    FMGL(dist) = dist;
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    ::x10::regionarray::DistArray<TPMGL(T)>* this__112249 =
      this;
    
    //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    this->FMGL(localHandle) = ::x10::lang::PlaceLocalHandle<void>::template makeFlat< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>* >(
                                ::x10aux::nullCheck(dist)->places(),
                                reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*> >(sizeof(x10_regionarray_DistArray__closure__3<TPMGL(T)>)))x10_regionarray_DistArray__closure__3<TPMGL(T)>(dist, init))));
    
    //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    this->FMGL(raw) = this->x10::regionarray::template DistArray<TPMGL(T)>::getRawFromLocalHandle();
}
template<class TPMGL(T)> ::x10::regionarray::DistArray<TPMGL(T)>* x10::regionarray::DistArray<TPMGL(T)>::_make(
                           ::x10::regionarray::Dist* dist,
                           TPMGL(T) init) {
    ::x10::regionarray::DistArray<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::regionarray::DistArray<TPMGL(T)> >()) ::x10::regionarray::DistArray<TPMGL(T)>();
    this_->_constructor(dist, init);
    return this_;
}



//#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> void x10::regionarray::DistArray<TPMGL(T)>::_constructor(
                           ::x10::regionarray::DistArray<TPMGL(T)>* a,
                           ::x10::regionarray::Dist* d) {
    
    //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    FMGL(dist) = d;
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    ::x10::regionarray::DistArray<TPMGL(T)>* this__112251 =
      this;
    
    //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    this->FMGL(localHandle) = ::x10::lang::PlaceLocalHandle<void>::template makeFlat< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>* >(
                                ::x10aux::nullCheck(d)->places(),
                                reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*> >(sizeof(x10_regionarray_DistArray__closure__4<TPMGL(T)>)))x10_regionarray_DistArray__closure__4<TPMGL(T)>(d, a))));
    
    //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    this->FMGL(raw) = this->x10::regionarray::template DistArray<TPMGL(T)>::getRawFromLocalHandle();
}
template<class TPMGL(T)> ::x10::regionarray::DistArray<TPMGL(T)>* x10::regionarray::DistArray<TPMGL(T)>::_make(
                           ::x10::regionarray::DistArray<TPMGL(T)>* a,
                           ::x10::regionarray::Dist* d) {
    ::x10::regionarray::DistArray<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::regionarray::DistArray<TPMGL(T)> >()) ::x10::regionarray::DistArray<TPMGL(T)>();
    this_->_constructor(a, d);
    return this_;
}



//#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> void x10::regionarray::DistArray<TPMGL(T)>::_constructor(
                           ::x10::regionarray::Dist* d, ::x10::lang::PlaceLocalHandle< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*> pls) {
    
    //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    FMGL(dist) = d;
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    ::x10::regionarray::DistArray<TPMGL(T)>* this__112253 =
      this;
    
    //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    this->FMGL(localHandle) = pls;
    
    //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    this->FMGL(raw) = this->x10::regionarray::template DistArray<TPMGL(T)>::getRawFromLocalHandle();
}
template<class TPMGL(T)> ::x10::regionarray::DistArray<TPMGL(T)>* x10::regionarray::DistArray<TPMGL(T)>::_make(
                           ::x10::regionarray::Dist* d, ::x10::lang::PlaceLocalHandle< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*> pls)
{
    ::x10::regionarray::DistArray<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::regionarray::DistArray<TPMGL(T)> >()) ::x10::regionarray::DistArray<TPMGL(T)>();
    this_->_constructor(d, pls);
    return this_;
}



//#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> TPMGL(T) x10::regionarray::DistArray<TPMGL(T)>::__apply(
  ::x10::lang::Point* pt) {
    
    //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    x10_long offset = ::x10aux::nullCheck(this->FMGL(dist))->offset(
                        pt);
    
    //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    return this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__apply(
             offset);
    
}

//#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> TPMGL(T) x10::regionarray::DistArray<TPMGL(T)>::__apply(
  x10_long i0) {
    
    //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    x10_long offset = ::x10aux::nullCheck(this->FMGL(dist))->offset(
                        i0);
    
    //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    return this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__apply(
             offset);
    
}

//#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> TPMGL(T) x10::regionarray::DistArray<TPMGL(T)>::__apply(
  x10_long i0, x10_long i1) {
    
    //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    x10_long offset = ::x10aux::nullCheck(this->FMGL(dist))->offset(
                        i0, i1);
    
    //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    return this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__apply(
             offset);
    
}

//#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> TPMGL(T) x10::regionarray::DistArray<TPMGL(T)>::__apply(
  x10_long i0, x10_long i1, x10_long i2) {
    
    //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    x10_long offset = ::x10aux::nullCheck(this->FMGL(dist))->offset(
                        i0, i1, i2);
    
    //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    return this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__apply(
             offset);
    
}

//#line 307 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> TPMGL(T) x10::regionarray::DistArray<TPMGL(T)>::__apply(
  x10_long i0, x10_long i1, x10_long i2, x10_long i3) {
    
    //#line 308 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    x10_long offset = ::x10aux::nullCheck(this->FMGL(dist))->offset(
                        i0, i1, i2, i3);
    
    //#line 309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    return this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__apply(
             offset);
    
}

//#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> TPMGL(T) x10::regionarray::DistArray<TPMGL(T)>::__set(
  ::x10::lang::Point* pt, TPMGL(T) v) {
    
    //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    x10_long offset = ::x10aux::nullCheck(this->FMGL(dist))->offset(
                        pt);
    
    //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__set(
      offset, v);
    
    //#line 329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    return v;
    
}

//#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> TPMGL(T) x10::regionarray::DistArray<TPMGL(T)>::__set(
  x10_long i0, TPMGL(T) v) {
    
    //#line 347 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    x10_long offset = ::x10aux::nullCheck(this->FMGL(dist))->offset(
                        i0);
    
    //#line 348 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__set(
      offset, v);
    
    //#line 349 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    return v;
    
}

//#line 367 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> TPMGL(T) x10::regionarray::DistArray<TPMGL(T)>::__set(
  x10_long i0, x10_long i1, TPMGL(T) v) {
    
    //#line 368 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    x10_long offset = ::x10aux::nullCheck(this->FMGL(dist))->offset(
                        i0, i1);
    
    //#line 369 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__set(
      offset, v);
    
    //#line 370 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    return v;
    
}

//#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> TPMGL(T) x10::regionarray::DistArray<TPMGL(T)>::__set(
  x10_long i0, x10_long i1, x10_long i2, TPMGL(T) v) {
    
    //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    x10_long offset = ::x10aux::nullCheck(this->FMGL(dist))->offset(
                        i0, i1, i2);
    
    //#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__set(
      offset, v);
    
    //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    return v;
    
}

//#line 412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> TPMGL(T) x10::regionarray::DistArray<TPMGL(T)>::__set(
  x10_long i0, x10_long i1, x10_long i2, x10_long i3, TPMGL(T) v) {
    
    //#line 413 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    x10_long offset = ::x10aux::nullCheck(this->FMGL(dist))->offset(
                        i0, i1, i2, i3);
    
    //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__set(
      offset, v);
    
    //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    return v;
    
}

//#line 435 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> ::x10::regionarray::DistArray<TPMGL(T)>*
  x10::regionarray::DistArray<TPMGL(T)>::restriction(::x10::regionarray::Dist* d) {
    
    //#line 436 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    return (__extension__ ({
        ::x10::regionarray::DistArray<TPMGL(T)>* alloc__112138 =
           (new (::x10aux::alloc_z< ::x10::regionarray::DistArray<TPMGL(T)> >()) ::x10::regionarray::DistArray<TPMGL(T)>());
        (alloc__112138)->::x10::regionarray::DistArray<TPMGL(T)>::_constructor(
          this, d);
        alloc__112138;
    }))
    ;
    
}

//#line 447 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> ::x10::regionarray::DistArray<TPMGL(T)>*
  x10::regionarray::DistArray<TPMGL(T)>::restriction(::x10::regionarray::Region* r) {
    
    //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    ::x10::regionarray::DistArray<TPMGL(T)>* this__112254 =
      this;
    
    //#line 435 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    ::x10::regionarray::Dist* d__112255 = ::x10aux::nullCheck(this->FMGL(dist))->restriction(
                                            r);
    
    //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    return (__extension__ ({
        
        //#line 436 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ::x10::regionarray::DistArray<TPMGL(T)>* alloc__112256 =
           (new (::x10aux::alloc_z< ::x10::regionarray::DistArray<TPMGL(T)> >()) ::x10::regionarray::DistArray<TPMGL(T)>());
        (alloc__112256)->::x10::regionarray::DistArray<TPMGL(T)>::_constructor(
          this__112254, d__112255);
        alloc__112256;
    }))
    ;
    
}

//#line 459 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> ::x10::regionarray::DistArray<TPMGL(T)>*
  x10::regionarray::DistArray<TPMGL(T)>::restriction(::x10::lang::Place p) {
    
    //#line 460 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    ::x10::regionarray::DistArray<TPMGL(T)>* this__112257 =
      this;
    
    //#line 435 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    ::x10::regionarray::Dist* d__112258 = ::x10aux::nullCheck(this->FMGL(dist))->restriction(
                                            p);
    
    //#line 460 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    return (__extension__ ({
        
        //#line 436 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ::x10::regionarray::DistArray<TPMGL(T)>* alloc__112259 =
           (new (::x10aux::alloc_z< ::x10::regionarray::DistArray<TPMGL(T)> >()) ::x10::regionarray::DistArray<TPMGL(T)>());
        (alloc__112259)->::x10::regionarray::DistArray<TPMGL(T)>::_constructor(
          this__112257, d__112258);
        alloc__112259;
    }))
    ;
    
}

//#line 471 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> ::x10::regionarray::DistArray<TPMGL(T)>*
  x10::regionarray::DistArray<TPMGL(T)>::__bar(::x10::regionarray::Region* r) {
    return this->x10::regionarray::template DistArray<TPMGL(T)>::restriction(
             r);
    
}

//#line 481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> ::x10::regionarray::DistArray<TPMGL(T)>*
  x10::regionarray::DistArray<TPMGL(T)>::__bar(::x10::lang::Place p) {
    return this->x10::regionarray::template DistArray<TPMGL(T)>::restriction(
             p);
    
}

//#line 493 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> void x10::regionarray::DistArray<TPMGL(T)>::fill(
  TPMGL(T) v) {
    {
        
        //#line 494 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
        ::x10::lang::Runtime::ensureNotInAtomic();
        ::x10::lang::FinishState* x10____var17 = ::x10::lang::Runtime::startFinish();
        {
            ::x10::lang::CheckedThrowable* throwable__112307 =
              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                try {
                    {
                        {
                            ::x10::lang::Iterator< ::x10::lang::Place>* where__112150;
                            for (where__112150 = ::x10aux::nullCheck(::x10aux::nullCheck(this->FMGL(dist))->places())->iterator();
                                 ::x10::lang::Iterator< ::x10::lang::Place>::hasNext(::x10aux::nullCheck(where__112150));
                                 ) {
                                ::x10::lang::Place where =
                                  ::x10::lang::Iterator< ::x10::lang::Place>::next(::x10aux::nullCheck(where__112150));
                                
                                //#line 495 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
                                ::x10::lang::Runtime::runAsync(
                                  where, reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_regionarray_DistArray__closure__5<TPMGL(T)>)))x10_regionarray_DistArray__closure__5<TPMGL(T)>(this, v))),
                                  ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                            }
                        }
                        
                    }
                }
                catch (::x10::lang::CheckedThrowable* __exc1929) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc1929);
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
            catch (::x10::lang::CheckedThrowable* __exc1930) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__112308 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1930);
                    {
                        throwable__112307 = formal__112308;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__112307)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__112307))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__112307));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::stopFinish(x10____var17);
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__112307)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__112307)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__112307));
                }
                
            }
            
        }
    }
}

//#line 514 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"

//#line 538 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"

//#line 567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"

//#line 595 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"

//#line 621 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"

//#line 651 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"

//#line 682 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> TPMGL(T) x10::regionarray::DistArray<TPMGL(T)>::reduce(
  ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), TPMGL(T)>* op,
  TPMGL(T) unit) {
    return this->template reduce< TPMGL(T) >(op, op, unit);
    
}

//#line 696 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"

//#line 720 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> ::x10::lang::String* x10::regionarray::DistArray<TPMGL(T)>::toString(
  ) {
    
    //#line 721 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    return ::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126506 = ::x10aux::makeStringLit("DistArray("); strLit__126506; })), this->FMGL(dist)), (__extension__ ({ static ::x10::lang::String* strLit__126507 = ::x10aux::makeStringLit(")"); strLit__126507; })));
    
}

//#line 730 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> ::x10::lang::Iterator< ::x10::lang::Point*>*
  x10::regionarray::DistArray<TPMGL(T)>::iterator() {
    return ::x10aux::nullCheck((__extension__ ({
               ::x10::regionarray::DistArray<TPMGL(T)>* this__112234 =
                 this;
               ::x10aux::nullCheck(::x10aux::nullCheck(this__112234)->FMGL(dist))->FMGL(region);
           }))
           )->iterator();
    
}

//#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
template<class TPMGL(T)> ::x10::regionarray::DistArray<TPMGL(T)>*
  x10::regionarray::DistArray<TPMGL(T)>::x10__regionarray__DistArray____this__x10__regionarray__DistArray(
  ) {
    return this;
    
}
template<class TPMGL(T)> void x10::regionarray::DistArray<TPMGL(T)>::__fieldInitializers_x10_regionarray_DistArray(
  ) {
 
}
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10::regionarray::DistArray<TPMGL(T)>::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::DistArray<TPMGL(T)>::_deserializer);

template<class TPMGL(T)> void x10::regionarray::DistArray<TPMGL(T)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(localHandle));
    buf.write(this->FMGL(dist));
    
}

template<class TPMGL(T)> ::x10::lang::Reference* ::x10::regionarray::DistArray<TPMGL(T)>::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::DistArray<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::regionarray::DistArray<TPMGL(T)> >()) ::x10::regionarray::DistArray<TPMGL(T)>();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

template<class TPMGL(T)> void x10::regionarray::DistArray<TPMGL(T)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(localHandle) = buf.read< ::x10::lang::PlaceLocalHandle< ::x10::regionarray::DistArray__LocalState<TPMGL(T)>*> >();
    FMGL(dist) = buf.read< ::x10::regionarray::Dist*>();
    /* fields with @TransientInitExpr annotations */
    FMGL(raw) = x10::regionarray::template DistArray<TPMGL(T)>::getRawFromLocalHandle();
    
}

template<class TPMGL(T)> ::x10::regionarray::DistArray<TPMGL(T)>*
  x10::regionarray::DistArray<void>::make(::x10::regionarray::Dist* dist) {
    
    //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    ::x10::regionarray::DistArray<TPMGL(T)>* alloc__112242 =
       (new (::x10aux::alloc_z< ::x10::regionarray::DistArray<TPMGL(T)> >()) ::x10::regionarray::DistArray<TPMGL(T)>());
    (alloc__112242)->::x10::regionarray::DistArray<TPMGL(T)>::_constructor(
      dist);
    return alloc__112242;
    
}
template<class TPMGL(T)> ::x10::regionarray::DistArray<TPMGL(T)>*
  x10::regionarray::DistArray<void>::make(::x10::regionarray::Dist* dist,
                                          ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)>* init) {
    
    //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    ::x10::regionarray::DistArray<TPMGL(T)>* alloc__112245 =
       (new (::x10aux::alloc_z< ::x10::regionarray::DistArray<TPMGL(T)> >()) ::x10::regionarray::DistArray<TPMGL(T)>());
    (alloc__112245)->::x10::regionarray::DistArray<TPMGL(T)>::_constructor(
      dist, init);
    return alloc__112245;
    
}
template<class TPMGL(T)> ::x10::regionarray::DistArray<TPMGL(T)>*
  x10::regionarray::DistArray<void>::make(::x10::regionarray::Dist* dist,
                                          TPMGL(T) init) {
    
    //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/DistArray.x10"
    ::x10::regionarray::DistArray<TPMGL(T)>* alloc__112248 =
       (new (::x10aux::alloc_z< ::x10::regionarray::DistArray<TPMGL(T)> >()) ::x10::regionarray::DistArray<TPMGL(T)>());
    (alloc__112248)->::x10::regionarray::DistArray<TPMGL(T)>::_constructor(
      dist, init);
    return alloc__112248;
    
}
#endif // X10_REGIONARRAY_DISTARRAY_H_IMPLEMENTATION
#endif // __X10_REGIONARRAY_DISTARRAY_H_NODEPS
