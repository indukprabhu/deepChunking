#ifndef __X10_REGIONARRAY_ARRAY_H
#define __X10_REGIONARRAY_ARRAY_H

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
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_BOOLEAN_H_NODEPS
#include <x10/lang/Boolean.h>
#undef X10_LANG_BOOLEAN_H_NODEPS
#define X10_LANG_BOOLEAN_H_NODEPS
#include <x10/lang/Boolean.h>
#undef X10_LANG_BOOLEAN_H_NODEPS
namespace x10 { namespace regionarray { 
class Region;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace compiler { 
class Inline;
} } 
namespace x10 { namespace regionarray { 
class Array__LayoutHelper;
} } 
namespace x10 { namespace lang { 
class Unsafe;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Iterator;
} } 
namespace x10 { namespace lang { 
class IllegalArgumentException;
} } 
namespace x10 { namespace regionarray { 
class RectRegion1D;
} } 
namespace x10 { namespace regionarray { 
template<class TPMGL(T)> class RemoteArray;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class GlobalRef;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace util { 
class StringBuilder;
} } 
namespace x10 { namespace regionarray { 
template<class TPMGL(T)> class Array__Anonymous__14235;
} } 
namespace x10 { namespace regionarray { 
template<class TPMGL(T)> class Array__Anonymous__14520;
} } 
namespace x10 { namespace compiler { 
class Native;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(Z1), class TPMGL(Z2), class TPMGL(U)> class Fun_0_2;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class GlobalRail;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(U)> class Fun_0_0;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace lang { 
class Runtime__Profile;
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
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace regionarray { 

template<class TPMGL(T)> class Array;
template <> class Array<void>;
template<class TPMGL(T)> class Array : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    ::x10::regionarray::Region* FMGL(region);
    
    x10_long FMGL(rank);
    
    x10_boolean FMGL(rect);
    
    x10_boolean FMGL(zeroBased);
    
    x10_boolean FMGL(rail);
    
    x10_long FMGL(size);
    
    static ::x10aux::itable_entry _itables[4];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static typename ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)>::template itable< ::x10::regionarray::Array<TPMGL(T)> > _itable_0;
    
    static ::x10::lang::Any::itable< ::x10::regionarray::Array<TPMGL(T)> > _itable_1;
    
    static typename ::x10::lang::Iterable< ::x10::lang::Point*>::template itable< ::x10::regionarray::Array<TPMGL(T)> > _itable_2;
    
    ::x10::lang::Rail< TPMGL(T) >* FMGL(raw);
    
    virtual ::x10::lang::Rail< TPMGL(T) >* raw();
    void _constructor(::x10::regionarray::Region* reg);
    
    static ::x10::regionarray::Array<TPMGL(T)>* _make(::x10::regionarray::Region* reg);
    
    void _constructor(x10_boolean zeroed, ::x10::regionarray::Region* reg);
    
    static ::x10::regionarray::Array<TPMGL(T)>* _make(x10_boolean zeroed,
                                                      ::x10::regionarray::Region* reg);
    
    void _constructor(::x10::regionarray::Region* reg, ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)>* init);
    
    static ::x10::regionarray::Array<TPMGL(T)>* _make(::x10::regionarray::Region* reg,
                                                      ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)>* init);
    
    void _constructor(::x10::regionarray::Region* reg, TPMGL(T) init);
    
    static ::x10::regionarray::Array<TPMGL(T)>* _make(::x10::regionarray::Region* reg,
                                                      TPMGL(T) init);
    
    void _constructor(::x10::regionarray::Region* reg, ::x10::lang::Rail< TPMGL(T) >* backingStore);
    
    static ::x10::regionarray::Array<TPMGL(T)>* _make(::x10::regionarray::Region* reg,
                                                      ::x10::lang::Rail< TPMGL(T) >* backingStore);
    
    void _constructor(::x10::lang::Rail< TPMGL(T) >* backingStore);
    
    static ::x10::regionarray::Array<TPMGL(T)>* _make(::x10::lang::Rail< TPMGL(T) >* backingStore);
    
    void _constructor(x10_long size);
    
    static ::x10::regionarray::Array<TPMGL(T)>* _make(x10_long size);
    
    void _constructor(x10_boolean zeroed, x10_long size);
    
    static ::x10::regionarray::Array<TPMGL(T)>* _make(x10_boolean zeroed,
                                                      x10_long size);
    
    void _constructor(x10_long size, ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* init);
    
    static ::x10::regionarray::Array<TPMGL(T)>* _make(x10_long size,
                                                      ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* init);
    
    void _constructor(x10_long size, TPMGL(T) init);
    
    static ::x10::regionarray::Array<TPMGL(T)>* _make(x10_long size,
                                                      TPMGL(T) init);
    
    void _constructor(::x10::regionarray::Array<TPMGL(T)>* init);
    
    static ::x10::regionarray::Array<TPMGL(T)>* _make(::x10::regionarray::Array<TPMGL(T)>* init);
    
    void _constructor(::x10::regionarray::RemoteArray<TPMGL(T)>* init);
    
    static ::x10::regionarray::Array<TPMGL(T)>* _make(::x10::regionarray::RemoteArray<TPMGL(T)>* init);
    
    virtual ::x10::lang::String* toString();
    virtual ::x10::lang::Iterator< ::x10::lang::Point*>* iterator(
      );
    virtual ::x10::lang::Iterable<TPMGL(T)>* values();
    virtual TPMGL(T) __apply(x10_long i0);
    virtual TPMGL(T) __apply(x10_long i0, x10_long i1);
    virtual TPMGL(T) __apply(x10_long i0, x10_long i1, x10_long i2);
    virtual TPMGL(T) __apply(x10_long i0, x10_long i1, x10_long i2,
                             x10_long i3);
    virtual TPMGL(T) __apply(::x10::lang::Point* pt);
    virtual TPMGL(T) __set(x10_long i0, TPMGL(T) v);
    virtual TPMGL(T) __set(x10_long i0, x10_long i1, TPMGL(T) v);
    virtual TPMGL(T) __set(x10_long i0, x10_long i1, x10_long i2,
                           TPMGL(T) v);
    virtual TPMGL(T) __set(x10_long i0, x10_long i1, x10_long i2,
                           x10_long i3, TPMGL(T) v);
    virtual TPMGL(T) __set(::x10::lang::Point* p, TPMGL(T) v);
    virtual void fill(TPMGL(T) v);
    virtual void clear();
    template<class TPMGL(U)> ::x10::regionarray::Array<TPMGL(U)>*
      map(::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op);
    template<class TPMGL(U)> ::x10::regionarray::Array<TPMGL(U)>*
      map(::x10::regionarray::Array<TPMGL(U)>* dst, ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op);
    template<class TPMGL(U)> ::x10::regionarray::Array<TPMGL(U)>*
      map(::x10::regionarray::Array<TPMGL(U)>* dst, ::x10::regionarray::Region* filter,
          ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op);
    template<class TPMGL(S), class TPMGL(U)> ::x10::regionarray::Array<TPMGL(S)>*
      map(::x10::regionarray::Array<TPMGL(U)>* src, ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>* op);
    template<class TPMGL(S), class TPMGL(U)> ::x10::regionarray::Array<TPMGL(S)>*
      map(::x10::regionarray::Array<TPMGL(S)>* dst, ::x10::regionarray::Array<TPMGL(U)>* src,
          ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>* op);
    template<class TPMGL(S), class TPMGL(U)> ::x10::regionarray::Array<TPMGL(S)>*
      map(::x10::regionarray::Array<TPMGL(S)>* dst, ::x10::regionarray::Array<TPMGL(U)>* src,
          ::x10::regionarray::Region* filter, ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>* op);
    template<class TPMGL(U)> TPMGL(U) reduce(::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>* op,
                                             TPMGL(U) unit);
    template<class TPMGL(U)> ::x10::regionarray::Array<TPMGL(U)>*
      scan(::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>* op,
           TPMGL(U) unit);
    template<class TPMGL(U)> ::x10::regionarray::Array<TPMGL(U)>*
      scan(::x10::regionarray::Array<TPMGL(U)>* dst, ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>* op,
           TPMGL(U) unit);
    x10_long FMGL(layout_min0);
    
    x10_long FMGL(layout_stride1);
    
    x10_long FMGL(layout_min1);
    
    ::x10::lang::Rail< x10_long >* FMGL(layout);
    
    x10_long offset(x10_long i0);
    x10_long offset(x10_long i0, x10_long i1);
    x10_long offset(x10_long i0, x10_long i1, x10_long i2);
    x10_long offset(x10_long i0, x10_long i1, x10_long i2,
                    x10_long i3);
    x10_long offset(::x10::lang::Point* pt);
    virtual ::x10::regionarray::Array<TPMGL(T)>* x10__regionarray__Array____this__x10__regionarray__Array(
      );
    virtual void __fieldInitializers_x10_regionarray_Array(
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

template<class TPMGL(T)> ::x10aux::RuntimeType x10::regionarray::Array<TPMGL(T)>::rtt;
template<class TPMGL(T)> void x10::regionarray::Array<TPMGL(T)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::regionarray::Array<void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)> >(), ::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Point*> >()};
    const ::x10aux::RuntimeType* params[1] = { ::x10aux::getRTT<TPMGL(T)>()};
    ::x10aux::RuntimeType::Variance variances[1] = { ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.regionarray.Array";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 2, parents, 1, params, variances);
}

template <> class Array<void> : public ::x10::lang::X10Class
{
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    template<class TPMGL(T)> static void asyncCopy(::x10::regionarray::Array<TPMGL(T)>* src,
                                                   ::x10::regionarray::RemoteArray<TPMGL(T)>* dst);
    
    template<class TPMGL(T)> static void asyncCopy(::x10::regionarray::Array<TPMGL(T)>* src,
                                                   ::x10::lang::Point* srcPoint,
                                                   ::x10::regionarray::RemoteArray<TPMGL(T)>* dst,
                                                   ::x10::lang::Point* dstPoint,
                                                   x10_long numElems);
    
    template<class TPMGL(T)> static void asyncCopy(::x10::regionarray::Array<TPMGL(T)>* src,
                                                   x10_long srcIndex,
                                                   ::x10::regionarray::RemoteArray<TPMGL(T)>* dst,
                                                   x10_long dstIndex,
                                                   x10_long numElems);
    
    template<class TPMGL(T)> static void asyncCopy(::x10::regionarray::RemoteArray<TPMGL(T)>* src,
                                                   ::x10::regionarray::Array<TPMGL(T)>* dst);
    
    template<class TPMGL(T)> static void asyncCopy(::x10::regionarray::RemoteArray<TPMGL(T)>* src,
                                                   ::x10::lang::Point* srcPoint,
                                                   ::x10::regionarray::Array<TPMGL(T)>* dst,
                                                   ::x10::lang::Point* dstPoint,
                                                   x10_long numElems);
    
    template<class TPMGL(T)> static void asyncCopy(::x10::regionarray::RemoteArray<TPMGL(T)>* src,
                                                   x10_long srcIndex,
                                                   ::x10::regionarray::Array<TPMGL(T)>* dst,
                                                   x10_long dstIndex,
                                                   x10_long numElems);
    
    template<class TPMGL(T)> static void copy(::x10::regionarray::Array<TPMGL(T)>* src,
                                              ::x10::regionarray::Array<TPMGL(T)>* dst);
    
    template<class TPMGL(T)> static void copy(::x10::regionarray::Array<TPMGL(T)>* src,
                                              ::x10::lang::Point* srcPoint,
                                              ::x10::regionarray::Array<TPMGL(T)>* dst,
                                              ::x10::lang::Point* dstPoint,
                                              x10_long numElems);
    
    template<class TPMGL(T)> static void copy(::x10::regionarray::Array<TPMGL(T)>* src,
                                              x10_long srcIndex,
                                              ::x10::regionarray::Array<TPMGL(T)>* dst,
                                              x10_long dstIndex,
                                              x10_long numElems);
    
    static void raiseBoundsError(x10_long i0) X10_PRAGMA_NORETURN ;
    
    static void raiseBoundsError(x10_long i0, x10_long i1) X10_PRAGMA_NORETURN ;
    
    static void raiseBoundsError(x10_long i0, x10_long i1,
                                 x10_long i2) X10_PRAGMA_NORETURN ;
    
    static void raiseBoundsError(x10_long i0, x10_long i1,
                                 x10_long i2, x10_long i3) X10_PRAGMA_NORETURN ;
    
    static void raiseBoundsError(::x10::lang::Point* pt) X10_PRAGMA_NORETURN ;
    
    
};

} } 
#endif // X10_REGIONARRAY_ARRAY_H

namespace x10 { namespace regionarray { 
template<class TPMGL(T)> class Array;
} } 

#ifndef X10_REGIONARRAY_ARRAY_H_NODEPS
#define X10_REGIONARRAY_ARRAY_H_NODEPS
#include <x10/lang/Fun_0_1.h>
#include <x10/lang/Point.h>
#include <x10/lang/Iterable.h>
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/regionarray/Region.h>
#include <x10/lang/Rail.h>
#include <x10/compiler/Inline.h>
#include <x10/regionarray/Array__LayoutHelper.h>
#include <x10/lang/Unsafe.h>
#include <x10/lang/Iterator.h>
#include <x10/lang/IllegalArgumentException.h>
#include <x10/regionarray/RectRegion1D.h>
#include <x10/regionarray/RemoteArray.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/String.h>
#include <x10/util/StringBuilder.h>
#include <x10/regionarray/Array__Anonymous__14235.h>
#include <x10/regionarray/Array__Anonymous__14520.h>
#include <x10/compiler/Native.h>
#include <x10/lang/Fun_0_2.h>
#include <x10/lang/GlobalRail.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Place.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/lang/ArrayIndexOutOfBoundsException.h>
#include <x10/compiler/NoInline.h>
#include <x10/compiler/NoReturn.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_REGIONARRAY_ARRAY_H_GENERICS
#define X10_REGIONARRAY_ARRAY_H_GENERICS
#ifndef X10_REGIONARRAY_ARRAY_H_map_1805
#define X10_REGIONARRAY_ARRAY_H_map_1805
template<class TPMGL(T)> template<class TPMGL(U)> ::x10::regionarray::Array<TPMGL(U)>*
  x10::regionarray::Array<TPMGL(T)>::map(::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op) {
    
    //#line 685 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array<TPMGL(U)>* alloc__107403 =  (new (::x10aux::alloc_z< ::x10::regionarray::Array<TPMGL(U)> >()) ::x10::regionarray::Array<TPMGL(U)>());
    
    //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Region* reg__107402 = this->FMGL(region);
    
    //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    alloc__107403->FMGL(region) = (reg__107402);
    alloc__107403->FMGL(rank) = ::x10aux::nullCheck(reg__107402)->FMGL(rank);
    alloc__107403->FMGL(rect) = ::x10aux::nullCheck(reg__107402)->FMGL(rect);
    alloc__107403->FMGL(zeroBased) = ::x10aux::nullCheck(reg__107402)->FMGL(zeroBased);
    alloc__107403->FMGL(rail) = ::x10aux::nullCheck(reg__107402)->FMGL(rail);
    alloc__107403->FMGL(size) = ::x10aux::nullCheck(reg__107402)->size();
    
    //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array__LayoutHelper crh__107391 =  ::x10::regionarray::Array__LayoutHelper::_alloc();
    (crh__107391)->::x10::regionarray::Array__LayoutHelper::_constructor(
      reg__107402);
    
    //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    alloc__107403->FMGL(layout_min0) = crh__107391->FMGL(min0);
    
    //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    alloc__107403->FMGL(layout_stride1) = crh__107391->FMGL(stride1);
    
    //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    alloc__107403->FMGL(layout_min1) = crh__107391->FMGL(min1);
    
    //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    alloc__107403->FMGL(layout) = crh__107391->FMGL(layout);
    
    //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long n__107392 = crh__107391->FMGL(size);
    
    //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::lang::Rail< TPMGL(U) >* r__107393 = ::x10::lang::Rail< TPMGL(U) >::_makeUnsafe(n__107392, false);
    
    //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    {
        ::x10::lang::Iterator< ::x10::lang::Point*>* p__107394;
        for (p__107394 = ::x10aux::nullCheck(reg__107402)->iterator();
             ::x10::lang::Iterator< ::x10::lang::Point*>::hasNext(::x10aux::nullCheck(p__107394));
             ) {
            ::x10::lang::Point* p__107395 = ::x10::lang::Iterator< ::x10::lang::Point*>::next(::x10aux::nullCheck(p__107394));
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            r__107393->x10::lang::template Rail< TPMGL(U) >::__set(
              (__extension__ ({
                  
                  //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  ::x10::lang::Point* pt__107396 = p__107395;
                  x10_long ret__107397;
                  
                  //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  x10_long offset__107384 = ((::x10aux::nullCheck(pt__107396)->x10::lang::Point::__apply(
                                                ((x10_long)(((x10_int)0))))) - (alloc__107403->FMGL(layout_min0)));
                  
                  //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  if (((::x10aux::nullCheck(pt__107396)->FMGL(rank)) > (((x10_long)1ll))))
                  {
                      
                      //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      offset__107384 = ((((((offset__107384) * (alloc__107403->FMGL(layout_stride1)))) + (::x10aux::nullCheck(pt__107396)->x10::lang::Point::__apply(
                                                                                                            ((x10_long)1ll))))) - (alloc__107403->FMGL(layout_min1)));
                      
                      //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      x10_long i__106291max__107381 = ((::x10aux::nullCheck(pt__107396)->FMGL(rank)) - (((x10_long)1ll)));
                      {
                          x10_long i__107382;
                          for (i__107382 = ((x10_long)2ll);
                               ((i__107382) <= (i__106291max__107381));
                               i__107382 = ((i__107382) + (((x10_long)1ll))))
                          {
                              x10_long i__107383 = i__107382;
                              
                              //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                              offset__107384 = ((((((offset__107384) * (::x10aux::nullCheck(alloc__107403->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                          ((((x10_long)2ll)) * (((i__107383) - (((x10_long)2ll))))))))) + (::x10aux::nullCheck(pt__107396)->x10::lang::Point::__apply(
                                                                                                                                             i__107383)))) - (::x10aux::nullCheck(alloc__107403->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                                                                                ((((((x10_long)2ll)) * (((i__107383) - (((x10_long)2ll)))))) + (((x10_long)1ll))))));
                          }
                      }
                      
                  }
                  
                  //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  ret__107397 = offset__107384;
                  ret__107397;
              }))
              , (__extension__ ({
                  
                  //#line 685 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  ::x10::lang::Point* p__107398 = p__107395;
                  ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>::__apply(::x10aux::nullCheck(op), 
                    (__extension__ ({
                        ::x10::regionarray::Array<TPMGL(T)>* this__107399 =
                          this;
                        
                        //#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        ::x10::lang::Point* pt__107400 = p__107398;
                        TPMGL(T) ret__107401;
                        
                        //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        ret__107401 = ::x10aux::nullCheck(this__107399)->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__apply(
                                        (__extension__ ({
                                            
                                            //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                            ::x10::lang::Point* pt__107389 =
                                              pt__107400;
                                            x10_long ret__107390;
                                            
                                            //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                            x10_long offset__107388 =
                                              ((::x10aux::nullCheck(pt__107389)->x10::lang::Point::__apply(
                                                  ((x10_long)(((x10_int)0))))) - (::x10aux::nullCheck(this__107399)->FMGL(layout_min0)));
                                            
                                            //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                            if (((::x10aux::nullCheck(pt__107389)->FMGL(rank)) > (((x10_long)1ll))))
                                            {
                                                
                                                //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                offset__107388 =
                                                  ((((((offset__107388) * (::x10aux::nullCheck(this__107399)->FMGL(layout_stride1)))) + (::x10aux::nullCheck(pt__107389)->x10::lang::Point::__apply(
                                                                                                                                           ((x10_long)1ll))))) - (::x10aux::nullCheck(this__107399)->FMGL(layout_min1)));
                                                
                                                //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                x10_long i__106291max__107385 =
                                                  ((::x10aux::nullCheck(pt__107389)->FMGL(rank)) - (((x10_long)1ll)));
                                                {
                                                    x10_long i__107386;
                                                    for (i__107386 =
                                                           ((x10_long)2ll);
                                                         ((i__107386) <= (i__106291max__107385));
                                                         i__107386 =
                                                           ((i__107386) + (((x10_long)1ll))))
                                                    {
                                                        x10_long i__107387 =
                                                          i__107386;
                                                        
                                                        //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                        offset__107388 =
                                                          ((((((offset__107388) * (::x10aux::nullCheck(::x10aux::nullCheck(this__107399)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                     ((((x10_long)2ll)) * (((i__107387) - (((x10_long)2ll))))))))) + (::x10aux::nullCheck(pt__107389)->x10::lang::Point::__apply(
                                                                                                                                                        i__107387)))) - (::x10aux::nullCheck(::x10aux::nullCheck(this__107399)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                                                                                           ((((((x10_long)2ll)) * (((i__107387) - (((x10_long)2ll)))))) + (((x10_long)1ll))))));
                                                    }
                                                }
                                                
                                            }
                                            
                                            //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                            ret__107390 =
                                              offset__107388;
                                            ret__107390;
                                        }))
                                        );
                        ret__107401;
                    }))
                    );
              }))
              );
        }
    }
    
    //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    alloc__107403->FMGL(raw) = r__107393;
    
    //#line 685 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    return alloc__107403;
    
}
#endif // X10_REGIONARRAY_ARRAY_H_map_1805
#ifndef X10_REGIONARRAY_ARRAY_H_map_1806
#define X10_REGIONARRAY_ARRAY_H_map_1806
template<class TPMGL(T)> template<class TPMGL(U)> ::x10::regionarray::Array<TPMGL(U)>*
  x10::regionarray::Array<TPMGL(T)>::map(::x10::regionarray::Array<TPMGL(U)>* dst,
                                         ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op) {
    
    //#line 704 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    if (this->FMGL(rect)) {
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ::x10::lang::Rail< TPMGL(T) >* src__107408 = this->FMGL(raw);
        ::x10::lang::Rail< TPMGL(U) >* dst__107409 = ::x10aux::nullCheck(dst)->FMGL(raw);
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op__107410 =
          op;
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ::x10::lang::Rail< TPMGL(U) >* ret__107411;
        
        //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ::x10::lang::Rail< TPMGL(T) >* rail__107404 = src__107408;
        x10_long i__72803max__107405 = (x10_long)(::x10aux::nullCheck(rail__107404)->FMGL(size));
        {
            x10_long i__107406;
            for (i__107406 = ((x10_long)0ll); ((i__107406) < (i__72803max__107405));
                 i__107406 = ((i__107406) + (((x10_long)1ll))))
            {
                x10_long i__107407 = i__107406;
                
                //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                ::x10aux::nullCheck(dst__107409)->x10::lang::template Rail< TPMGL(U) >::__set(
                  i__107407, ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>::__apply(::x10aux::nullCheck(op__107410), 
                    ::x10aux::nullCheck(src__107408)->x10::lang::template Rail< TPMGL(T) >::__apply(
                      i__107407)));
            }
        }
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ret__107411 = dst__107409;
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ret__107411;
        
        //#line 709 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return dst;
        
    } else {
        
        //#line 711 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        {
            ::x10::lang::Iterator< ::x10::lang::Point*>* p__106279;
            for (p__106279 = this->FMGL(region)->iterator();
                 ::x10::lang::Iterator< ::x10::lang::Point*>::hasNext(::x10aux::nullCheck(p__106279));
                 ) {
                ::x10::lang::Point* p = ::x10::lang::Iterator< ::x10::lang::Point*>::next(::x10aux::nullCheck(p__106279));
                
                //#line 636 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ::x10::lang::Point* p__107424 = p;
                TPMGL(U) v__107425 = ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>::__apply(::x10aux::nullCheck(op), 
                  (__extension__ ({
                      
                      //#line 712 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      ::x10::regionarray::Array<TPMGL(T)>* this__107426 =
                        this;
                      
                      //#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      ::x10::lang::Point* pt__107427 = p;
                      TPMGL(T) ret__107428;
                      
                      //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      ret__107428 = ::x10aux::nullCheck(this__107426)->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__apply(
                                      (__extension__ ({
                                          
                                          //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                          ::x10::lang::Point* pt__107416 =
                                            pt__107427;
                                          x10_long ret__107417;
                                          
                                          //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                          x10_long offset__107415 =
                                            ((::x10aux::nullCheck(pt__107416)->x10::lang::Point::__apply(
                                                ((x10_long)(((x10_int)0))))) - (::x10aux::nullCheck(this__107426)->FMGL(layout_min0)));
                                          
                                          //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                          if (((::x10aux::nullCheck(pt__107416)->FMGL(rank)) > (((x10_long)1ll))))
                                          {
                                              
                                              //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                              offset__107415 =
                                                ((((((offset__107415) * (::x10aux::nullCheck(this__107426)->FMGL(layout_stride1)))) + (::x10aux::nullCheck(pt__107416)->x10::lang::Point::__apply(
                                                                                                                                         ((x10_long)1ll))))) - (::x10aux::nullCheck(this__107426)->FMGL(layout_min1)));
                                              
                                              //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                              x10_long i__106291max__107412 =
                                                ((::x10aux::nullCheck(pt__107416)->FMGL(rank)) - (((x10_long)1ll)));
                                              {
                                                  x10_long i__107413;
                                                  for (i__107413 =
                                                         ((x10_long)2ll);
                                                       ((i__107413) <= (i__106291max__107412));
                                                       i__107413 =
                                                         ((i__107413) + (((x10_long)1ll))))
                                                  {
                                                      x10_long i__107414 =
                                                        i__107413;
                                                      
                                                      //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                      offset__107415 =
                                                        ((((((offset__107415) * (::x10aux::nullCheck(::x10aux::nullCheck(this__107426)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                   ((((x10_long)2ll)) * (((i__107414) - (((x10_long)2ll))))))))) + (::x10aux::nullCheck(pt__107416)->x10::lang::Point::__apply(
                                                                                                                                                      i__107414)))) - (::x10aux::nullCheck(::x10aux::nullCheck(this__107426)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                                                                                         ((((((x10_long)2ll)) * (((i__107414) - (((x10_long)2ll)))))) + (((x10_long)1ll))))));
                                                  }
                                              }
                                              
                                          }
                                          
                                          //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                          ret__107417 = offset__107415;
                                          ret__107417;
                                      }))
                                      );
                      ret__107428;
                  }))
                  );
                TPMGL(U) ret__107429;
                
                //#line 640 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ::x10aux::nullCheck(dst)->FMGL(raw)->x10::lang::template Rail< TPMGL(U) >::__set(
                  (__extension__ ({
                      
                      //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      ::x10::lang::Point* pt__107422 = p__107424;
                      x10_long ret__107423;
                      
                      //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      x10_long offset__107421 = ((::x10aux::nullCheck(pt__107422)->x10::lang::Point::__apply(
                                                    ((x10_long)(((x10_int)0))))) - (::x10aux::nullCheck(dst)->FMGL(layout_min0)));
                      
                      //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      if (((::x10aux::nullCheck(pt__107422)->FMGL(rank)) > (((x10_long)1ll))))
                      {
                          
                          //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                          offset__107421 = ((((((offset__107421) * (::x10aux::nullCheck(dst)->FMGL(layout_stride1)))) + (::x10aux::nullCheck(pt__107422)->x10::lang::Point::__apply(
                                                                                                                           ((x10_long)1ll))))) - (::x10aux::nullCheck(dst)->FMGL(layout_min1)));
                          
                          //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                          x10_long i__106291max__107418 =
                            ((::x10aux::nullCheck(pt__107422)->FMGL(rank)) - (((x10_long)1ll)));
                          {
                              x10_long i__107419;
                              for (i__107419 = ((x10_long)2ll);
                                   ((i__107419) <= (i__106291max__107418));
                                   i__107419 = ((i__107419) + (((x10_long)1ll))))
                              {
                                  x10_long i__107420 = i__107419;
                                  
                                  //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                  offset__107421 = ((((((offset__107421) * (::x10aux::nullCheck(::x10aux::nullCheck(dst)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                              ((((x10_long)2ll)) * (((i__107420) - (((x10_long)2ll))))))))) + (::x10aux::nullCheck(pt__107422)->x10::lang::Point::__apply(
                                                                                                                                                 i__107420)))) - (::x10aux::nullCheck(::x10aux::nullCheck(dst)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                                                                                    ((((((x10_long)2ll)) * (((i__107420) - (((x10_long)2ll)))))) + (((x10_long)1ll))))));
                              }
                          }
                          
                      }
                      
                      //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      ret__107423 = offset__107421;
                      ret__107423;
                  }))
                  , v__107425);
                
                //#line 641 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret__107429 = v__107425;
                
                //#line 636 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret__107429;
            }
        }
        
    }
    
    //#line 715 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    return dst;
    
}
#endif // X10_REGIONARRAY_ARRAY_H_map_1806
#ifndef X10_REGIONARRAY_ARRAY_H_map_1807
#define X10_REGIONARRAY_ARRAY_H_map_1807
template<class TPMGL(T)> template<class TPMGL(U)> ::x10::regionarray::Array<TPMGL(U)>*
  x10::regionarray::Array<TPMGL(T)>::map(::x10::regionarray::Array<TPMGL(U)>* dst,
                                         ::x10::regionarray::Region* filter,
                                         ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op) {
    
    //#line 734 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Region* fregion = this->FMGL(region)->__and(
                                            filter);
    
    //#line 735 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    {
        ::x10::lang::Iterator< ::x10::lang::Point*>* p__106281;
        for (p__106281 = ::x10aux::nullCheck(fregion)->iterator();
             ::x10::lang::Iterator< ::x10::lang::Point*>::hasNext(::x10aux::nullCheck(p__106281));
             ) {
            ::x10::lang::Point* p = ::x10::lang::Iterator< ::x10::lang::Point*>::next(::x10aux::nullCheck(p__106281));
            
            //#line 636 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ::x10::lang::Point* p__107442 = p;
            TPMGL(U) v__107443 = ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>::__apply(::x10aux::nullCheck(op), 
              (__extension__ ({
                  
                  //#line 736 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  ::x10::regionarray::Array<TPMGL(T)>* this__107444 =
                    this;
                  
                  //#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  ::x10::lang::Point* pt__107445 = p;
                  TPMGL(T) ret__107446;
                  
                  //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  ret__107446 = ::x10aux::nullCheck(this__107444)->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__apply(
                                  (__extension__ ({
                                      
                                      //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                      ::x10::lang::Point* pt__107434 =
                                        pt__107445;
                                      x10_long ret__107435;
                                      
                                      //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                      x10_long offset__107433 =
                                        ((::x10aux::nullCheck(pt__107434)->x10::lang::Point::__apply(
                                            ((x10_long)(((x10_int)0))))) - (::x10aux::nullCheck(this__107444)->FMGL(layout_min0)));
                                      
                                      //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                      if (((::x10aux::nullCheck(pt__107434)->FMGL(rank)) > (((x10_long)1ll))))
                                      {
                                          
                                          //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                          offset__107433 =
                                            ((((((offset__107433) * (::x10aux::nullCheck(this__107444)->FMGL(layout_stride1)))) + (::x10aux::nullCheck(pt__107434)->x10::lang::Point::__apply(
                                                                                                                                     ((x10_long)1ll))))) - (::x10aux::nullCheck(this__107444)->FMGL(layout_min1)));
                                          
                                          //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                          x10_long i__106291max__107430 =
                                            ((::x10aux::nullCheck(pt__107434)->FMGL(rank)) - (((x10_long)1ll)));
                                          {
                                              x10_long i__107431;
                                              for (i__107431 =
                                                     ((x10_long)2ll);
                                                   ((i__107431) <= (i__106291max__107430));
                                                   i__107431 =
                                                     ((i__107431) + (((x10_long)1ll))))
                                              {
                                                  x10_long i__107432 =
                                                    i__107431;
                                                  
                                                  //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                  offset__107433 =
                                                    ((((((offset__107433) * (::x10aux::nullCheck(::x10aux::nullCheck(this__107444)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                               ((((x10_long)2ll)) * (((i__107432) - (((x10_long)2ll))))))))) + (::x10aux::nullCheck(pt__107434)->x10::lang::Point::__apply(
                                                                                                                                                  i__107432)))) - (::x10aux::nullCheck(::x10aux::nullCheck(this__107444)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                                                                                     ((((((x10_long)2ll)) * (((i__107432) - (((x10_long)2ll)))))) + (((x10_long)1ll))))));
                                              }
                                          }
                                          
                                      }
                                      
                                      //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                      ret__107435 = offset__107433;
                                      ret__107435;
                                  }))
                                  );
                  ret__107446;
              }))
              );
            TPMGL(U) ret__107447;
            
            //#line 640 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ::x10aux::nullCheck(dst)->FMGL(raw)->x10::lang::template Rail< TPMGL(U) >::__set(
              (__extension__ ({
                  
                  //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  ::x10::lang::Point* pt__107440 = p__107442;
                  x10_long ret__107441;
                  
                  //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  x10_long offset__107439 = ((::x10aux::nullCheck(pt__107440)->x10::lang::Point::__apply(
                                                ((x10_long)(((x10_int)0))))) - (::x10aux::nullCheck(dst)->FMGL(layout_min0)));
                  
                  //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  if (((::x10aux::nullCheck(pt__107440)->FMGL(rank)) > (((x10_long)1ll))))
                  {
                      
                      //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      offset__107439 = ((((((offset__107439) * (::x10aux::nullCheck(dst)->FMGL(layout_stride1)))) + (::x10aux::nullCheck(pt__107440)->x10::lang::Point::__apply(
                                                                                                                       ((x10_long)1ll))))) - (::x10aux::nullCheck(dst)->FMGL(layout_min1)));
                      
                      //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      x10_long i__106291max__107436 = ((::x10aux::nullCheck(pt__107440)->FMGL(rank)) - (((x10_long)1ll)));
                      {
                          x10_long i__107437;
                          for (i__107437 = ((x10_long)2ll);
                               ((i__107437) <= (i__106291max__107436));
                               i__107437 = ((i__107437) + (((x10_long)1ll))))
                          {
                              x10_long i__107438 = i__107437;
                              
                              //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                              offset__107439 = ((((((offset__107439) * (::x10aux::nullCheck(::x10aux::nullCheck(dst)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                          ((((x10_long)2ll)) * (((i__107438) - (((x10_long)2ll))))))))) + (::x10aux::nullCheck(pt__107440)->x10::lang::Point::__apply(
                                                                                                                                             i__107438)))) - (::x10aux::nullCheck(::x10aux::nullCheck(dst)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                                                                                ((((((x10_long)2ll)) * (((i__107438) - (((x10_long)2ll)))))) + (((x10_long)1ll))))));
                          }
                      }
                      
                  }
                  
                  //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  ret__107441 = offset__107439;
                  ret__107441;
              }))
              , v__107443);
            
            //#line 641 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret__107447 = v__107443;
            
            //#line 636 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret__107447;
        }
    }
    
    //#line 738 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    return dst;
    
}
#endif // X10_REGIONARRAY_ARRAY_H_map_1807
#ifndef X10_REGIONARRAY_ARRAY_H_map_1808
#define X10_REGIONARRAY_ARRAY_H_map_1808
template<class TPMGL(T)> template<class TPMGL(S), class TPMGL(U)>
::x10::regionarray::Array<TPMGL(S)>* x10::regionarray::Array<TPMGL(T)>::map(
  ::x10::regionarray::Array<TPMGL(U)>* src, ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>* op) {
    
    //#line 755 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array<TPMGL(S)>* alloc__107478 = 
    (new (::x10aux::alloc_z< ::x10::regionarray::Array<TPMGL(S)> >()) ::x10::regionarray::Array<TPMGL(S)>());
    
    //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Region* reg__107477 = this->FMGL(region);
    
    //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    alloc__107478->FMGL(region) = (reg__107477);
    alloc__107478->FMGL(rank) = ::x10aux::nullCheck(reg__107477)->FMGL(rank);
    alloc__107478->FMGL(rect) = ::x10aux::nullCheck(reg__107477)->FMGL(rect);
    alloc__107478->FMGL(zeroBased) = ::x10aux::nullCheck(reg__107477)->FMGL(zeroBased);
    alloc__107478->FMGL(rail) = ::x10aux::nullCheck(reg__107477)->FMGL(rail);
    alloc__107478->FMGL(size) = ::x10aux::nullCheck(reg__107477)->size();
    
    //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array__LayoutHelper crh__107464 =
       ::x10::regionarray::Array__LayoutHelper::_alloc();
    (crh__107464)->::x10::regionarray::Array__LayoutHelper::_constructor(
      reg__107477);
    
    //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    alloc__107478->FMGL(layout_min0) = crh__107464->FMGL(min0);
    
    //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    alloc__107478->FMGL(layout_stride1) = crh__107464->FMGL(stride1);
    
    //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    alloc__107478->FMGL(layout_min1) = crh__107464->FMGL(min1);
    
    //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    alloc__107478->FMGL(layout) = crh__107464->FMGL(layout);
    
    //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long n__107465 = crh__107464->FMGL(size);
    
    //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::lang::Rail< TPMGL(S) >* r__107466 = ::x10::lang::Rail< TPMGL(S) >::_makeUnsafe(n__107465, false);
    
    //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    {
        ::x10::lang::Iterator< ::x10::lang::Point*>* p__107467;
        for (p__107467 = ::x10aux::nullCheck(reg__107477)->iterator();
             ::x10::lang::Iterator< ::x10::lang::Point*>::hasNext(::x10aux::nullCheck(p__107467));
             ) {
            ::x10::lang::Point* p__107468 = ::x10::lang::Iterator< ::x10::lang::Point*>::next(::x10aux::nullCheck(p__107467));
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            r__107466->x10::lang::template Rail< TPMGL(S) >::__set(
              (__extension__ ({
                  
                  //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  ::x10::lang::Point* pt__107469 = p__107468;
                  x10_long ret__107470;
                  
                  //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  x10_long offset__107451 = ((::x10aux::nullCheck(pt__107469)->x10::lang::Point::__apply(
                                                ((x10_long)(((x10_int)0))))) - (alloc__107478->FMGL(layout_min0)));
                  
                  //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  if (((::x10aux::nullCheck(pt__107469)->FMGL(rank)) > (((x10_long)1ll))))
                  {
                      
                      //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      offset__107451 = ((((((offset__107451) * (alloc__107478->FMGL(layout_stride1)))) + (::x10aux::nullCheck(pt__107469)->x10::lang::Point::__apply(
                                                                                                            ((x10_long)1ll))))) - (alloc__107478->FMGL(layout_min1)));
                      
                      //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      x10_long i__106291max__107448 = ((::x10aux::nullCheck(pt__107469)->FMGL(rank)) - (((x10_long)1ll)));
                      {
                          x10_long i__107449;
                          for (i__107449 = ((x10_long)2ll);
                               ((i__107449) <= (i__106291max__107448));
                               i__107449 = ((i__107449) + (((x10_long)1ll))))
                          {
                              x10_long i__107450 = i__107449;
                              
                              //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                              offset__107451 = ((((((offset__107451) * (::x10aux::nullCheck(alloc__107478->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                          ((((x10_long)2ll)) * (((i__107450) - (((x10_long)2ll))))))))) + (::x10aux::nullCheck(pt__107469)->x10::lang::Point::__apply(
                                                                                                                                             i__107450)))) - (::x10aux::nullCheck(alloc__107478->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                                                                                ((((((x10_long)2ll)) * (((i__107450) - (((x10_long)2ll)))))) + (((x10_long)1ll))))));
                          }
                      }
                      
                  }
                  
                  //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  ret__107470 = offset__107451;
                  ret__107470;
              }))
              , (__extension__ ({
                  
                  //#line 755 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  ::x10::lang::Point* p__107471 = p__107468;
                  ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>::__apply(::x10aux::nullCheck(op), 
                    (__extension__ ({
                        ::x10::regionarray::Array<TPMGL(T)>* this__107472 =
                          this;
                        
                        //#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        ::x10::lang::Point* pt__107473 = p__107471;
                        TPMGL(T) ret__107474;
                        
                        //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        ret__107474 = ::x10aux::nullCheck(this__107472)->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__apply(
                                        (__extension__ ({
                                            
                                            //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                            ::x10::lang::Point* pt__107456 =
                                              pt__107473;
                                            x10_long ret__107457;
                                            
                                            //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                            x10_long offset__107455 =
                                              ((::x10aux::nullCheck(pt__107456)->x10::lang::Point::__apply(
                                                  ((x10_long)(((x10_int)0))))) - (::x10aux::nullCheck(this__107472)->FMGL(layout_min0)));
                                            
                                            //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                            if (((::x10aux::nullCheck(pt__107456)->FMGL(rank)) > (((x10_long)1ll))))
                                            {
                                                
                                                //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                offset__107455 =
                                                  ((((((offset__107455) * (::x10aux::nullCheck(this__107472)->FMGL(layout_stride1)))) + (::x10aux::nullCheck(pt__107456)->x10::lang::Point::__apply(
                                                                                                                                           ((x10_long)1ll))))) - (::x10aux::nullCheck(this__107472)->FMGL(layout_min1)));
                                                
                                                //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                x10_long i__106291max__107452 =
                                                  ((::x10aux::nullCheck(pt__107456)->FMGL(rank)) - (((x10_long)1ll)));
                                                {
                                                    x10_long i__107453;
                                                    for (i__107453 =
                                                           ((x10_long)2ll);
                                                         ((i__107453) <= (i__106291max__107452));
                                                         i__107453 =
                                                           ((i__107453) + (((x10_long)1ll))))
                                                    {
                                                        x10_long i__107454 =
                                                          i__107453;
                                                        
                                                        //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                        offset__107455 =
                                                          ((((((offset__107455) * (::x10aux::nullCheck(::x10aux::nullCheck(this__107472)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                     ((((x10_long)2ll)) * (((i__107454) - (((x10_long)2ll))))))))) + (::x10aux::nullCheck(pt__107456)->x10::lang::Point::__apply(
                                                                                                                                                        i__107454)))) - (::x10aux::nullCheck(::x10aux::nullCheck(this__107472)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                                                                                           ((((((x10_long)2ll)) * (((i__107454) - (((x10_long)2ll)))))) + (((x10_long)1ll))))));
                                                    }
                                                }
                                                
                                            }
                                            
                                            //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                            ret__107457 =
                                              offset__107455;
                                            ret__107457;
                                        }))
                                        );
                        ret__107474;
                    }))
                    , (__extension__ ({
                        
                        //#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        ::x10::lang::Point* pt__107475 = p__107471;
                        TPMGL(U) ret__107476;
                        
                        //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        ret__107476 = ::x10aux::nullCheck(src)->FMGL(raw)->x10::lang::template Rail< TPMGL(U) >::__apply(
                                        (__extension__ ({
                                            
                                            //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                            ::x10::lang::Point* pt__107462 =
                                              pt__107475;
                                            x10_long ret__107463;
                                            
                                            //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                            x10_long offset__107461 =
                                              ((::x10aux::nullCheck(pt__107462)->x10::lang::Point::__apply(
                                                  ((x10_long)(((x10_int)0))))) - (::x10aux::nullCheck(src)->FMGL(layout_min0)));
                                            
                                            //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                            if (((::x10aux::nullCheck(pt__107462)->FMGL(rank)) > (((x10_long)1ll))))
                                            {
                                                
                                                //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                offset__107461 =
                                                  ((((((offset__107461) * (::x10aux::nullCheck(src)->FMGL(layout_stride1)))) + (::x10aux::nullCheck(pt__107462)->x10::lang::Point::__apply(
                                                                                                                                  ((x10_long)1ll))))) - (::x10aux::nullCheck(src)->FMGL(layout_min1)));
                                                
                                                //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                x10_long i__106291max__107458 =
                                                  ((::x10aux::nullCheck(pt__107462)->FMGL(rank)) - (((x10_long)1ll)));
                                                {
                                                    x10_long i__107459;
                                                    for (i__107459 =
                                                           ((x10_long)2ll);
                                                         ((i__107459) <= (i__106291max__107458));
                                                         i__107459 =
                                                           ((i__107459) + (((x10_long)1ll))))
                                                    {
                                                        x10_long i__107460 =
                                                          i__107459;
                                                        
                                                        //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                        offset__107461 =
                                                          ((((((offset__107461) * (::x10aux::nullCheck(::x10aux::nullCheck(src)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                     ((((x10_long)2ll)) * (((i__107460) - (((x10_long)2ll))))))))) + (::x10aux::nullCheck(pt__107462)->x10::lang::Point::__apply(
                                                                                                                                                        i__107460)))) - (::x10aux::nullCheck(::x10aux::nullCheck(src)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                                                                                           ((((((x10_long)2ll)) * (((i__107460) - (((x10_long)2ll)))))) + (((x10_long)1ll))))));
                                                    }
                                                }
                                                
                                            }
                                            
                                            //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                            ret__107463 =
                                              offset__107461;
                                            ret__107463;
                                        }))
                                        );
                        ret__107476;
                    }))
                    );
              }))
              );
        }
    }
    
    //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    alloc__107478->FMGL(raw) = r__107466;
    
    //#line 755 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    return alloc__107478;
    
}
#endif // X10_REGIONARRAY_ARRAY_H_map_1808
#ifndef X10_REGIONARRAY_ARRAY_H_map_1809
#define X10_REGIONARRAY_ARRAY_H_map_1809
template<class TPMGL(T)> template<class TPMGL(S), class TPMGL(U)>
::x10::regionarray::Array<TPMGL(S)>* x10::regionarray::Array<TPMGL(T)>::map(
  ::x10::regionarray::Array<TPMGL(S)>* dst, ::x10::regionarray::Array<TPMGL(U)>* src,
  ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>* op) {
    
    //#line 774 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    if ((this->FMGL(rect) && (::x10aux::struct_equals(this->FMGL(size),
                                                      ::x10aux::nullCheck(src)->FMGL(size)))))
    {
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ::x10::lang::Rail< TPMGL(T) >* src__107483 = this->FMGL(raw);
        ::x10::lang::Rail< TPMGL(U) >* src__107484 = ::x10aux::nullCheck(src)->FMGL(raw);
        ::x10::lang::Rail< TPMGL(S) >* dst__107485 = ::x10aux::nullCheck(dst)->FMGL(raw);
        ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>* op__107486 =
          op;
        ::x10::lang::Rail< TPMGL(S) >* ret__107487;
        
        //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ::x10::lang::Rail< TPMGL(T) >* rail__107479 = src__107483;
        x10_long i__72822max__107480 = (x10_long)(::x10aux::nullCheck(rail__107479)->FMGL(size));
        {
            x10_long i__107481;
            for (i__107481 = ((x10_long)0ll); ((i__107481) < (i__72822max__107480));
                 i__107481 = ((i__107481) + (((x10_long)1ll))))
            {
                x10_long i__107482 = i__107481;
                
                //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                ::x10aux::nullCheck(dst__107485)->x10::lang::template Rail< TPMGL(S) >::__set(
                  i__107482, ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>::__apply(::x10aux::nullCheck(op__107486), 
                    ::x10aux::nullCheck(src__107483)->x10::lang::template Rail< TPMGL(T) >::__apply(
                      i__107482), ::x10aux::nullCheck(src__107484)->x10::lang::template Rail< TPMGL(U) >::__apply(
                                    i__107482)));
            }
        }
        
        //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ret__107487 = dst__107485;
        
        //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ret__107487;
        
        //#line 779 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return dst;
        
    } else {
        
        //#line 781 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        {
            ::x10::lang::Iterator< ::x10::lang::Point*>* p__106283;
            for (p__106283 = this->FMGL(region)->iterator();
                 ::x10::lang::Iterator< ::x10::lang::Point*>::hasNext(::x10aux::nullCheck(p__106283));
                 ) {
                ::x10::lang::Point* p = ::x10::lang::Iterator< ::x10::lang::Point*>::next(::x10aux::nullCheck(p__106283));
                
                //#line 636 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ::x10::lang::Point* p__107506 = p;
                TPMGL(S) v__107507 = ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>::__apply(::x10aux::nullCheck(op), 
                  (__extension__ ({
                      
                      //#line 782 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      ::x10::regionarray::Array<TPMGL(T)>* this__107508 =
                        this;
                      
                      //#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      ::x10::lang::Point* pt__107509 = p;
                      TPMGL(T) ret__107510;
                      
                      //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      ret__107510 = ::x10aux::nullCheck(this__107508)->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__apply(
                                      (__extension__ ({
                                          
                                          //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                          ::x10::lang::Point* pt__107492 =
                                            pt__107509;
                                          x10_long ret__107493;
                                          
                                          //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                          x10_long offset__107491 =
                                            ((::x10aux::nullCheck(pt__107492)->x10::lang::Point::__apply(
                                                ((x10_long)(((x10_int)0))))) - (::x10aux::nullCheck(this__107508)->FMGL(layout_min0)));
                                          
                                          //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                          if (((::x10aux::nullCheck(pt__107492)->FMGL(rank)) > (((x10_long)1ll))))
                                          {
                                              
                                              //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                              offset__107491 =
                                                ((((((offset__107491) * (::x10aux::nullCheck(this__107508)->FMGL(layout_stride1)))) + (::x10aux::nullCheck(pt__107492)->x10::lang::Point::__apply(
                                                                                                                                         ((x10_long)1ll))))) - (::x10aux::nullCheck(this__107508)->FMGL(layout_min1)));
                                              
                                              //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                              x10_long i__106291max__107488 =
                                                ((::x10aux::nullCheck(pt__107492)->FMGL(rank)) - (((x10_long)1ll)));
                                              {
                                                  x10_long i__107489;
                                                  for (i__107489 =
                                                         ((x10_long)2ll);
                                                       ((i__107489) <= (i__106291max__107488));
                                                       i__107489 =
                                                         ((i__107489) + (((x10_long)1ll))))
                                                  {
                                                      x10_long i__107490 =
                                                        i__107489;
                                                      
                                                      //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                      offset__107491 =
                                                        ((((((offset__107491) * (::x10aux::nullCheck(::x10aux::nullCheck(this__107508)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                   ((((x10_long)2ll)) * (((i__107490) - (((x10_long)2ll))))))))) + (::x10aux::nullCheck(pt__107492)->x10::lang::Point::__apply(
                                                                                                                                                      i__107490)))) - (::x10aux::nullCheck(::x10aux::nullCheck(this__107508)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                                                                                         ((((((x10_long)2ll)) * (((i__107490) - (((x10_long)2ll)))))) + (((x10_long)1ll))))));
                                                  }
                                              }
                                              
                                          }
                                          
                                          //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                          ret__107493 = offset__107491;
                                          ret__107493;
                                      }))
                                      );
                      ret__107510;
                  }))
                  , (__extension__ ({
                      
                      //#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      ::x10::lang::Point* pt__107511 = p;
                      TPMGL(U) ret__107512;
                      
                      //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      ret__107512 = ::x10aux::nullCheck(src)->FMGL(raw)->x10::lang::template Rail< TPMGL(U) >::__apply(
                                      (__extension__ ({
                                          
                                          //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                          ::x10::lang::Point* pt__107498 =
                                            pt__107511;
                                          x10_long ret__107499;
                                          
                                          //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                          x10_long offset__107497 =
                                            ((::x10aux::nullCheck(pt__107498)->x10::lang::Point::__apply(
                                                ((x10_long)(((x10_int)0))))) - (::x10aux::nullCheck(src)->FMGL(layout_min0)));
                                          
                                          //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                          if (((::x10aux::nullCheck(pt__107498)->FMGL(rank)) > (((x10_long)1ll))))
                                          {
                                              
                                              //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                              offset__107497 =
                                                ((((((offset__107497) * (::x10aux::nullCheck(src)->FMGL(layout_stride1)))) + (::x10aux::nullCheck(pt__107498)->x10::lang::Point::__apply(
                                                                                                                                ((x10_long)1ll))))) - (::x10aux::nullCheck(src)->FMGL(layout_min1)));
                                              
                                              //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                              x10_long i__106291max__107494 =
                                                ((::x10aux::nullCheck(pt__107498)->FMGL(rank)) - (((x10_long)1ll)));
                                              {
                                                  x10_long i__107495;
                                                  for (i__107495 =
                                                         ((x10_long)2ll);
                                                       ((i__107495) <= (i__106291max__107494));
                                                       i__107495 =
                                                         ((i__107495) + (((x10_long)1ll))))
                                                  {
                                                      x10_long i__107496 =
                                                        i__107495;
                                                      
                                                      //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                      offset__107497 =
                                                        ((((((offset__107497) * (::x10aux::nullCheck(::x10aux::nullCheck(src)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                   ((((x10_long)2ll)) * (((i__107496) - (((x10_long)2ll))))))))) + (::x10aux::nullCheck(pt__107498)->x10::lang::Point::__apply(
                                                                                                                                                      i__107496)))) - (::x10aux::nullCheck(::x10aux::nullCheck(src)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                                                                                         ((((((x10_long)2ll)) * (((i__107496) - (((x10_long)2ll)))))) + (((x10_long)1ll))))));
                                                  }
                                              }
                                              
                                          }
                                          
                                          //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                          ret__107499 = offset__107497;
                                          ret__107499;
                                      }))
                                      );
                      ret__107512;
                  }))
                  );
                TPMGL(S) ret__107513;
                
                //#line 640 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ::x10aux::nullCheck(dst)->FMGL(raw)->x10::lang::template Rail< TPMGL(S) >::__set(
                  (__extension__ ({
                      
                      //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      ::x10::lang::Point* pt__107504 = p__107506;
                      x10_long ret__107505;
                      
                      //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      x10_long offset__107503 = ((::x10aux::nullCheck(pt__107504)->x10::lang::Point::__apply(
                                                    ((x10_long)(((x10_int)0))))) - (::x10aux::nullCheck(dst)->FMGL(layout_min0)));
                      
                      //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      if (((::x10aux::nullCheck(pt__107504)->FMGL(rank)) > (((x10_long)1ll))))
                      {
                          
                          //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                          offset__107503 = ((((((offset__107503) * (::x10aux::nullCheck(dst)->FMGL(layout_stride1)))) + (::x10aux::nullCheck(pt__107504)->x10::lang::Point::__apply(
                                                                                                                           ((x10_long)1ll))))) - (::x10aux::nullCheck(dst)->FMGL(layout_min1)));
                          
                          //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                          x10_long i__106291max__107500 =
                            ((::x10aux::nullCheck(pt__107504)->FMGL(rank)) - (((x10_long)1ll)));
                          {
                              x10_long i__107501;
                              for (i__107501 = ((x10_long)2ll);
                                   ((i__107501) <= (i__106291max__107500));
                                   i__107501 = ((i__107501) + (((x10_long)1ll))))
                              {
                                  x10_long i__107502 = i__107501;
                                  
                                  //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                  offset__107503 = ((((((offset__107503) * (::x10aux::nullCheck(::x10aux::nullCheck(dst)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                              ((((x10_long)2ll)) * (((i__107502) - (((x10_long)2ll))))))))) + (::x10aux::nullCheck(pt__107504)->x10::lang::Point::__apply(
                                                                                                                                                 i__107502)))) - (::x10aux::nullCheck(::x10aux::nullCheck(dst)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                                                                                    ((((((x10_long)2ll)) * (((i__107502) - (((x10_long)2ll)))))) + (((x10_long)1ll))))));
                              }
                          }
                          
                      }
                      
                      //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      ret__107505 = offset__107503;
                      ret__107505;
                  }))
                  , v__107507);
                
                //#line 641 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret__107513 = v__107507;
                
                //#line 636 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                ret__107513;
            }
        }
        
    }
    
    //#line 785 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    return dst;
    
}
#endif // X10_REGIONARRAY_ARRAY_H_map_1809
#ifndef X10_REGIONARRAY_ARRAY_H_map_1810
#define X10_REGIONARRAY_ARRAY_H_map_1810
template<class TPMGL(T)> template<class TPMGL(S), class TPMGL(U)>
::x10::regionarray::Array<TPMGL(S)>* x10::regionarray::Array<TPMGL(T)>::map(
  ::x10::regionarray::Array<TPMGL(S)>* dst, ::x10::regionarray::Array<TPMGL(U)>* src,
  ::x10::regionarray::Region* filter, ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>* op) {
    
    //#line 805 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Region* fregion = this->FMGL(region)->__and(
                                            filter);
    
    //#line 806 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    {
        ::x10::lang::Iterator< ::x10::lang::Point*>* p__106285;
        for (p__106285 = ::x10aux::nullCheck(fregion)->iterator();
             ::x10::lang::Iterator< ::x10::lang::Point*>::hasNext(::x10aux::nullCheck(p__106285));
             ) {
            ::x10::lang::Point* p = ::x10::lang::Iterator< ::x10::lang::Point*>::next(::x10aux::nullCheck(p__106285));
            
            //#line 636 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ::x10::lang::Point* p__107532 = p;
            TPMGL(S) v__107533 = ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(U), TPMGL(S)>::__apply(::x10aux::nullCheck(op), 
              (__extension__ ({
                  
                  //#line 807 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  ::x10::regionarray::Array<TPMGL(T)>* this__107534 =
                    this;
                  
                  //#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  ::x10::lang::Point* pt__107535 = p;
                  TPMGL(T) ret__107536;
                  
                  //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  ret__107536 = ::x10aux::nullCheck(this__107534)->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__apply(
                                  (__extension__ ({
                                      
                                      //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                      ::x10::lang::Point* pt__107518 =
                                        pt__107535;
                                      x10_long ret__107519;
                                      
                                      //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                      x10_long offset__107517 =
                                        ((::x10aux::nullCheck(pt__107518)->x10::lang::Point::__apply(
                                            ((x10_long)(((x10_int)0))))) - (::x10aux::nullCheck(this__107534)->FMGL(layout_min0)));
                                      
                                      //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                      if (((::x10aux::nullCheck(pt__107518)->FMGL(rank)) > (((x10_long)1ll))))
                                      {
                                          
                                          //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                          offset__107517 =
                                            ((((((offset__107517) * (::x10aux::nullCheck(this__107534)->FMGL(layout_stride1)))) + (::x10aux::nullCheck(pt__107518)->x10::lang::Point::__apply(
                                                                                                                                     ((x10_long)1ll))))) - (::x10aux::nullCheck(this__107534)->FMGL(layout_min1)));
                                          
                                          //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                          x10_long i__106291max__107514 =
                                            ((::x10aux::nullCheck(pt__107518)->FMGL(rank)) - (((x10_long)1ll)));
                                          {
                                              x10_long i__107515;
                                              for (i__107515 =
                                                     ((x10_long)2ll);
                                                   ((i__107515) <= (i__106291max__107514));
                                                   i__107515 =
                                                     ((i__107515) + (((x10_long)1ll))))
                                              {
                                                  x10_long i__107516 =
                                                    i__107515;
                                                  
                                                  //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                  offset__107517 =
                                                    ((((((offset__107517) * (::x10aux::nullCheck(::x10aux::nullCheck(this__107534)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                               ((((x10_long)2ll)) * (((i__107516) - (((x10_long)2ll))))))))) + (::x10aux::nullCheck(pt__107518)->x10::lang::Point::__apply(
                                                                                                                                                  i__107516)))) - (::x10aux::nullCheck(::x10aux::nullCheck(this__107534)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                                                                                     ((((((x10_long)2ll)) * (((i__107516) - (((x10_long)2ll)))))) + (((x10_long)1ll))))));
                                              }
                                          }
                                          
                                      }
                                      
                                      //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                      ret__107519 = offset__107517;
                                      ret__107519;
                                  }))
                                  );
                  ret__107536;
              }))
              , (__extension__ ({
                  
                  //#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  ::x10::lang::Point* pt__107537 = p;
                  TPMGL(U) ret__107538;
                  
                  //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  ret__107538 = ::x10aux::nullCheck(src)->FMGL(raw)->x10::lang::template Rail< TPMGL(U) >::__apply(
                                  (__extension__ ({
                                      
                                      //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                      ::x10::lang::Point* pt__107524 =
                                        pt__107537;
                                      x10_long ret__107525;
                                      
                                      //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                      x10_long offset__107523 =
                                        ((::x10aux::nullCheck(pt__107524)->x10::lang::Point::__apply(
                                            ((x10_long)(((x10_int)0))))) - (::x10aux::nullCheck(src)->FMGL(layout_min0)));
                                      
                                      //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                      if (((::x10aux::nullCheck(pt__107524)->FMGL(rank)) > (((x10_long)1ll))))
                                      {
                                          
                                          //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                          offset__107523 =
                                            ((((((offset__107523) * (::x10aux::nullCheck(src)->FMGL(layout_stride1)))) + (::x10aux::nullCheck(pt__107524)->x10::lang::Point::__apply(
                                                                                                                            ((x10_long)1ll))))) - (::x10aux::nullCheck(src)->FMGL(layout_min1)));
                                          
                                          //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                          x10_long i__106291max__107520 =
                                            ((::x10aux::nullCheck(pt__107524)->FMGL(rank)) - (((x10_long)1ll)));
                                          {
                                              x10_long i__107521;
                                              for (i__107521 =
                                                     ((x10_long)2ll);
                                                   ((i__107521) <= (i__106291max__107520));
                                                   i__107521 =
                                                     ((i__107521) + (((x10_long)1ll))))
                                              {
                                                  x10_long i__107522 =
                                                    i__107521;
                                                  
                                                  //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                  offset__107523 =
                                                    ((((((offset__107523) * (::x10aux::nullCheck(::x10aux::nullCheck(src)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                               ((((x10_long)2ll)) * (((i__107522) - (((x10_long)2ll))))))))) + (::x10aux::nullCheck(pt__107524)->x10::lang::Point::__apply(
                                                                                                                                                  i__107522)))) - (::x10aux::nullCheck(::x10aux::nullCheck(src)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                                                                                     ((((((x10_long)2ll)) * (((i__107522) - (((x10_long)2ll)))))) + (((x10_long)1ll))))));
                                              }
                                          }
                                          
                                      }
                                      
                                      //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                      ret__107525 = offset__107523;
                                      ret__107525;
                                  }))
                                  );
                  ret__107538;
              }))
              );
            TPMGL(S) ret__107539;
            
            //#line 640 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ::x10aux::nullCheck(dst)->FMGL(raw)->x10::lang::template Rail< TPMGL(S) >::__set(
              (__extension__ ({
                  
                  //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  ::x10::lang::Point* pt__107530 = p__107532;
                  x10_long ret__107531;
                  
                  //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  x10_long offset__107529 = ((::x10aux::nullCheck(pt__107530)->x10::lang::Point::__apply(
                                                ((x10_long)(((x10_int)0))))) - (::x10aux::nullCheck(dst)->FMGL(layout_min0)));
                  
                  //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  if (((::x10aux::nullCheck(pt__107530)->FMGL(rank)) > (((x10_long)1ll))))
                  {
                      
                      //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      offset__107529 = ((((((offset__107529) * (::x10aux::nullCheck(dst)->FMGL(layout_stride1)))) + (::x10aux::nullCheck(pt__107530)->x10::lang::Point::__apply(
                                                                                                                       ((x10_long)1ll))))) - (::x10aux::nullCheck(dst)->FMGL(layout_min1)));
                      
                      //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      x10_long i__106291max__107526 = ((::x10aux::nullCheck(pt__107530)->FMGL(rank)) - (((x10_long)1ll)));
                      {
                          x10_long i__107527;
                          for (i__107527 = ((x10_long)2ll);
                               ((i__107527) <= (i__106291max__107526));
                               i__107527 = ((i__107527) + (((x10_long)1ll))))
                          {
                              x10_long i__107528 = i__107527;
                              
                              //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                              offset__107529 = ((((((offset__107529) * (::x10aux::nullCheck(::x10aux::nullCheck(dst)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                          ((((x10_long)2ll)) * (((i__107528) - (((x10_long)2ll))))))))) + (::x10aux::nullCheck(pt__107530)->x10::lang::Point::__apply(
                                                                                                                                             i__107528)))) - (::x10aux::nullCheck(::x10aux::nullCheck(dst)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                                                                                ((((((x10_long)2ll)) * (((i__107528) - (((x10_long)2ll)))))) + (((x10_long)1ll))))));
                          }
                      }
                      
                  }
                  
                  //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  ret__107531 = offset__107529;
                  ret__107531;
              }))
              , v__107533);
            
            //#line 641 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret__107539 = v__107533;
            
            //#line 636 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret__107539;
        }
    }
    
    //#line 809 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    return dst;
    
}
#endif // X10_REGIONARRAY_ARRAY_H_map_1810
#ifndef X10_REGIONARRAY_ARRAY_H_reduce_1811
#define X10_REGIONARRAY_ARRAY_H_reduce_1811
template<class TPMGL(T)> template<class TPMGL(U)> TPMGL(U)
  x10::regionarray::Array<TPMGL(T)>::reduce(::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>* op,
                                            TPMGL(U) unit) {
    
    //#line 826 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    if (this->FMGL(rect)) {
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ::x10::lang::Rail< TPMGL(T) >* src__107545 = this->FMGL(raw);
        ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>* op__107546 =
          op;
        TPMGL(U) unit__107547 = unit;
        TPMGL(U) ret__107548;
        
        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        TPMGL(U) accum__107544 = unit__107547;
        
        //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ::x10::lang::Rail< TPMGL(T) >* rail__107540 = src__107545;
        x10_long i__72784max__107541 = (x10_long)(::x10aux::nullCheck(rail__107540)->FMGL(size));
        {
            x10_long i__107542;
            for (i__107542 = ((x10_long)0ll); ((i__107542) < (i__72784max__107541));
                 i__107542 = ((i__107542) + (((x10_long)1ll))))
            {
                x10_long i__107543 = i__107542;
                
                //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
                accum__107544 = ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>::__apply(::x10aux::nullCheck(op__107546), 
                  accum__107544, ::x10aux::nullCheck(src__107545)->x10::lang::template Rail< TPMGL(T) >::__apply(
                                   i__107543));
            }
        }
        
        //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
        ret__107548 = accum__107544;
        
        //#line 830 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return ret__107548;
        
    } else {
        
        //#line 832 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        TPMGL(U) accum = unit;
        
        //#line 833 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        {
            ::x10::lang::Iterator< ::x10::lang::Point*>* p__106287;
            for (p__106287 = this->FMGL(region)->iterator();
                 ::x10::lang::Iterator< ::x10::lang::Point*>::hasNext(::x10aux::nullCheck(p__106287));
                 ) {
                ::x10::lang::Point* p = ::x10::lang::Iterator< ::x10::lang::Point*>::next(::x10aux::nullCheck(p__106287));
                
                //#line 834 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                accum = ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>::__apply(::x10aux::nullCheck(op), 
                  accum, (__extension__ ({
                      ::x10::regionarray::Array<TPMGL(T)>* this__107213 =
                        this;
                      
                      //#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      ::x10::lang::Point* pt__107212 = p;
                      TPMGL(T) ret__107214;
                      
                      //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      ret__107214 = ::x10aux::nullCheck(this__107213)->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__apply(
                                      (__extension__ ({
                                          
                                          //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                          ::x10::lang::Point* pt__107553 =
                                            pt__107212;
                                          x10_long ret__107554;
                                          
                                          //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                          x10_long offset__107552 =
                                            ((::x10aux::nullCheck(pt__107553)->x10::lang::Point::__apply(
                                                ((x10_long)(((x10_int)0))))) - (::x10aux::nullCheck(this__107213)->FMGL(layout_min0)));
                                          
                                          //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                          if (((::x10aux::nullCheck(pt__107553)->FMGL(rank)) > (((x10_long)1ll))))
                                          {
                                              
                                              //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                              offset__107552 =
                                                ((((((offset__107552) * (::x10aux::nullCheck(this__107213)->FMGL(layout_stride1)))) + (::x10aux::nullCheck(pt__107553)->x10::lang::Point::__apply(
                                                                                                                                         ((x10_long)1ll))))) - (::x10aux::nullCheck(this__107213)->FMGL(layout_min1)));
                                              
                                              //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                              x10_long i__106291max__107549 =
                                                ((::x10aux::nullCheck(pt__107553)->FMGL(rank)) - (((x10_long)1ll)));
                                              {
                                                  x10_long i__107550;
                                                  for (i__107550 =
                                                         ((x10_long)2ll);
                                                       ((i__107550) <= (i__106291max__107549));
                                                       i__107550 =
                                                         ((i__107550) + (((x10_long)1ll))))
                                                  {
                                                      x10_long i__107551 =
                                                        i__107550;
                                                      
                                                      //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                      offset__107552 =
                                                        ((((((offset__107552) * (::x10aux::nullCheck(::x10aux::nullCheck(this__107213)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                   ((((x10_long)2ll)) * (((i__107551) - (((x10_long)2ll))))))))) + (::x10aux::nullCheck(pt__107553)->x10::lang::Point::__apply(
                                                                                                                                                      i__107551)))) - (::x10aux::nullCheck(::x10aux::nullCheck(this__107213)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                                                                                         ((((((x10_long)2ll)) * (((i__107551) - (((x10_long)2ll)))))) + (((x10_long)1ll))))));
                                                  }
                                              }
                                              
                                          }
                                          
                                          //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                          ret__107554 = offset__107552;
                                          ret__107554;
                                      }))
                                      );
                      ret__107214;
                  }))
                  );
            }
        }
        
        //#line 836 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return accum;
        
    }
    
}
#endif // X10_REGIONARRAY_ARRAY_H_reduce_1811
#ifndef X10_REGIONARRAY_ARRAY_H_scan_1812
#define X10_REGIONARRAY_ARRAY_H_scan_1812
template<class TPMGL(T)> template<class TPMGL(U)> ::x10::regionarray::Array<TPMGL(U)>*
  x10::regionarray::Array<TPMGL(T)>::scan(::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>* op,
                                          TPMGL(U) unit) {
    
    //#line 855 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array<TPMGL(T)>* this__107578 = this;
    
    //#line 872 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array<TPMGL(U)>* dst__107579 = (__extension__ ({
        
        //#line 855 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ::x10::regionarray::Array<TPMGL(U)>* alloc__107580 =
           (new (::x10aux::alloc_z< ::x10::regionarray::Array<TPMGL(U)> >()) ::x10::regionarray::Array<TPMGL(U)>());
        
        //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ::x10::regionarray::Region* reg__107557 = this->FMGL(region);
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        alloc__107580->FMGL(region) = (reg__107557);
        alloc__107580->FMGL(rank) = ::x10aux::nullCheck(reg__107557)->FMGL(rank);
        alloc__107580->FMGL(rect) = ::x10aux::nullCheck(reg__107557)->FMGL(rect);
        alloc__107580->FMGL(zeroBased) = ::x10aux::nullCheck(reg__107557)->FMGL(zeroBased);
        alloc__107580->FMGL(rail) = ::x10aux::nullCheck(reg__107557)->FMGL(rail);
        alloc__107580->FMGL(size) = ::x10aux::nullCheck(reg__107557)->size();
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ::x10::regionarray::Array__LayoutHelper crh__107555 =
           ::x10::regionarray::Array__LayoutHelper::_alloc();
        (crh__107555)->::x10::regionarray::Array__LayoutHelper::_constructor(
          reg__107557);
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        alloc__107580->FMGL(layout_min0) = crh__107555->FMGL(min0);
        
        //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        alloc__107580->FMGL(layout_stride1) = crh__107555->FMGL(stride1);
        
        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        alloc__107580->FMGL(layout_min1) = crh__107555->FMGL(min1);
        
        //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        alloc__107580->FMGL(layout) = crh__107555->FMGL(layout);
        
        //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        x10_long n__107556 = crh__107555->FMGL(size);
        
        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        alloc__107580->FMGL(raw) = ::x10::lang::Rail< TPMGL(U) >::_makeUnsafe(n__107556, false);
        alloc__107580;
    }))
    ;
    ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>* op__107581 =
      op;
    TPMGL(U) unit__107582 = unit;
    ::x10::regionarray::Array<TPMGL(U)>* ret__107583;
    
    //#line 873 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    TPMGL(U) accum__107573 = unit__107582;
    
    //#line 874 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    {
        ::x10::lang::Iterator< ::x10::lang::Point*>* p__107574;
        for (p__107574 = ::x10aux::nullCheck(this__107578)->FMGL(region)->iterator();
             ::x10::lang::Iterator< ::x10::lang::Point*>::hasNext(::x10aux::nullCheck(p__107574));
             ) {
            ::x10::lang::Point* p__107575 = ::x10::lang::Iterator< ::x10::lang::Point*>::next(::x10aux::nullCheck(p__107574));
            
            //#line 875 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            accum__107573 = ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>::__apply(::x10aux::nullCheck(op__107581), 
              accum__107573, (__extension__ ({
                  
                  //#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  ::x10::lang::Point* pt__107576 = p__107575;
                  TPMGL(T) ret__107577;
                  
                  //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  ret__107577 = ::x10aux::nullCheck(this__107578)->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__apply(
                                  (__extension__ ({
                                      
                                      //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                      ::x10::lang::Point* pt__107562 =
                                        pt__107576;
                                      x10_long ret__107563;
                                      
                                      //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                      x10_long offset__107561 =
                                        ((::x10aux::nullCheck(pt__107562)->x10::lang::Point::__apply(
                                            ((x10_long)(((x10_int)0))))) - (::x10aux::nullCheck(this__107578)->FMGL(layout_min0)));
                                      
                                      //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                      if (((::x10aux::nullCheck(pt__107562)->FMGL(rank)) > (((x10_long)1ll))))
                                      {
                                          
                                          //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                          offset__107561 =
                                            ((((((offset__107561) * (::x10aux::nullCheck(this__107578)->FMGL(layout_stride1)))) + (::x10aux::nullCheck(pt__107562)->x10::lang::Point::__apply(
                                                                                                                                     ((x10_long)1ll))))) - (::x10aux::nullCheck(this__107578)->FMGL(layout_min1)));
                                          
                                          //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                          x10_long i__106291max__107558 =
                                            ((::x10aux::nullCheck(pt__107562)->FMGL(rank)) - (((x10_long)1ll)));
                                          {
                                              x10_long i__107559;
                                              for (i__107559 =
                                                     ((x10_long)2ll);
                                                   ((i__107559) <= (i__106291max__107558));
                                                   i__107559 =
                                                     ((i__107559) + (((x10_long)1ll))))
                                              {
                                                  x10_long i__107560 =
                                                    i__107559;
                                                  
                                                  //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                  offset__107561 =
                                                    ((((((offset__107561) * (::x10aux::nullCheck(::x10aux::nullCheck(this__107578)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                               ((((x10_long)2ll)) * (((i__107560) - (((x10_long)2ll))))))))) + (::x10aux::nullCheck(pt__107562)->x10::lang::Point::__apply(
                                                                                                                                                  i__107560)))) - (::x10aux::nullCheck(::x10aux::nullCheck(this__107578)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                                                                                     ((((((x10_long)2ll)) * (((i__107560) - (((x10_long)2ll)))))) + (((x10_long)1ll))))));
                                              }
                                          }
                                          
                                      }
                                      
                                      //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                      ret__107563 = offset__107561;
                                      ret__107563;
                                  }))
                                  );
                  ret__107577;
              }))
              );
            
            //#line 636 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ::x10::lang::Point* p__107570 = p__107575;
            TPMGL(U) v__107571 = accum__107573;
            TPMGL(U) ret__107572;
            
            //#line 640 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            dst__107579->FMGL(raw)->x10::lang::template Rail< TPMGL(U) >::__set(
              (__extension__ ({
                  
                  //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  ::x10::lang::Point* pt__107568 = p__107570;
                  x10_long ret__107569;
                  
                  //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  x10_long offset__107567 = ((::x10aux::nullCheck(pt__107568)->x10::lang::Point::__apply(
                                                ((x10_long)(((x10_int)0))))) - (dst__107579->FMGL(layout_min0)));
                  
                  //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  if (((::x10aux::nullCheck(pt__107568)->FMGL(rank)) > (((x10_long)1ll))))
                  {
                      
                      //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      offset__107567 = ((((((offset__107567) * (dst__107579->FMGL(layout_stride1)))) + (::x10aux::nullCheck(pt__107568)->x10::lang::Point::__apply(
                                                                                                          ((x10_long)1ll))))) - (dst__107579->FMGL(layout_min1)));
                      
                      //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      x10_long i__106291max__107564 = ((::x10aux::nullCheck(pt__107568)->FMGL(rank)) - (((x10_long)1ll)));
                      {
                          x10_long i__107565;
                          for (i__107565 = ((x10_long)2ll);
                               ((i__107565) <= (i__106291max__107564));
                               i__107565 = ((i__107565) + (((x10_long)1ll))))
                          {
                              x10_long i__107566 = i__107565;
                              
                              //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                              offset__107567 = ((((((offset__107567) * (::x10aux::nullCheck(dst__107579->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                          ((((x10_long)2ll)) * (((i__107566) - (((x10_long)2ll))))))))) + (::x10aux::nullCheck(pt__107568)->x10::lang::Point::__apply(
                                                                                                                                             i__107566)))) - (::x10aux::nullCheck(dst__107579->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                                                                                ((((((x10_long)2ll)) * (((i__107566) - (((x10_long)2ll)))))) + (((x10_long)1ll))))));
                          }
                      }
                      
                  }
                  
                  //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  ret__107569 = offset__107567;
                  ret__107569;
              }))
              , v__107571);
            
            //#line 641 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret__107572 = v__107571;
            
            //#line 636 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret__107572;
        }
    }
    
    //#line 878 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ret__107583 = dst__107579;
    
    //#line 855 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    return ret__107583;
    
}
#endif // X10_REGIONARRAY_ARRAY_H_scan_1812
#ifndef X10_REGIONARRAY_ARRAY_H_scan_1813
#define X10_REGIONARRAY_ARRAY_H_scan_1813
template<class TPMGL(T)> template<class TPMGL(U)> ::x10::regionarray::Array<TPMGL(U)>*
  x10::regionarray::Array<TPMGL(T)>::scan(::x10::regionarray::Array<TPMGL(U)>* dst,
                                          ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>* op,
                                          TPMGL(U) unit) {
    
    //#line 873 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    TPMGL(U) accum = unit;
    
    //#line 874 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    {
        ::x10::lang::Iterator< ::x10::lang::Point*>* p__106289;
        for (p__106289 = this->FMGL(region)->iterator(); ::x10::lang::Iterator< ::x10::lang::Point*>::hasNext(::x10aux::nullCheck(p__106289));
             ) {
            ::x10::lang::Point* p = ::x10::lang::Iterator< ::x10::lang::Point*>::next(::x10aux::nullCheck(p__106289));
            
            //#line 875 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            accum = ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>::__apply(::x10aux::nullCheck(op), 
              accum, (__extension__ ({
                  ::x10::regionarray::Array<TPMGL(T)>* this__107264 =
                    this;
                  
                  //#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  ::x10::lang::Point* pt__107263 = p;
                  TPMGL(T) ret__107265;
                  
                  //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  ret__107265 = ::x10aux::nullCheck(this__107264)->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__apply(
                                  (__extension__ ({
                                      
                                      //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                      ::x10::lang::Point* pt__107588 =
                                        pt__107263;
                                      x10_long ret__107589;
                                      
                                      //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                      x10_long offset__107587 =
                                        ((::x10aux::nullCheck(pt__107588)->x10::lang::Point::__apply(
                                            ((x10_long)(((x10_int)0))))) - (::x10aux::nullCheck(this__107264)->FMGL(layout_min0)));
                                      
                                      //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                      if (((::x10aux::nullCheck(pt__107588)->FMGL(rank)) > (((x10_long)1ll))))
                                      {
                                          
                                          //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                          offset__107587 =
                                            ((((((offset__107587) * (::x10aux::nullCheck(this__107264)->FMGL(layout_stride1)))) + (::x10aux::nullCheck(pt__107588)->x10::lang::Point::__apply(
                                                                                                                                     ((x10_long)1ll))))) - (::x10aux::nullCheck(this__107264)->FMGL(layout_min1)));
                                          
                                          //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                          x10_long i__106291max__107584 =
                                            ((::x10aux::nullCheck(pt__107588)->FMGL(rank)) - (((x10_long)1ll)));
                                          {
                                              x10_long i__107585;
                                              for (i__107585 =
                                                     ((x10_long)2ll);
                                                   ((i__107585) <= (i__106291max__107584));
                                                   i__107585 =
                                                     ((i__107585) + (((x10_long)1ll))))
                                              {
                                                  x10_long i__107586 =
                                                    i__107585;
                                                  
                                                  //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                                  offset__107587 =
                                                    ((((((offset__107587) * (::x10aux::nullCheck(::x10aux::nullCheck(this__107264)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                               ((((x10_long)2ll)) * (((i__107586) - (((x10_long)2ll))))))))) + (::x10aux::nullCheck(pt__107588)->x10::lang::Point::__apply(
                                                                                                                                                  i__107586)))) - (::x10aux::nullCheck(::x10aux::nullCheck(this__107264)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                                                                                     ((((((x10_long)2ll)) * (((i__107586) - (((x10_long)2ll)))))) + (((x10_long)1ll))))));
                                              }
                                          }
                                          
                                      }
                                      
                                      //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                      ret__107589 = offset__107587;
                                      ret__107589;
                                  }))
                                  );
                  ret__107265;
              }))
              );
            
            //#line 636 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ::x10::lang::Point* p__107596 = p;
            TPMGL(U) v__107597 = accum;
            TPMGL(U) ret__107598;
            
            //#line 640 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ::x10aux::nullCheck(dst)->FMGL(raw)->x10::lang::template Rail< TPMGL(U) >::__set(
              (__extension__ ({
                  
                  //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  ::x10::lang::Point* pt__107594 = p__107596;
                  x10_long ret__107595;
                  
                  //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  x10_long offset__107593 = ((::x10aux::nullCheck(pt__107594)->x10::lang::Point::__apply(
                                                ((x10_long)(((x10_int)0))))) - (::x10aux::nullCheck(dst)->FMGL(layout_min0)));
                  
                  //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  if (((::x10aux::nullCheck(pt__107594)->FMGL(rank)) > (((x10_long)1ll))))
                  {
                      
                      //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      offset__107593 = ((((((offset__107593) * (::x10aux::nullCheck(dst)->FMGL(layout_stride1)))) + (::x10aux::nullCheck(pt__107594)->x10::lang::Point::__apply(
                                                                                                                       ((x10_long)1ll))))) - (::x10aux::nullCheck(dst)->FMGL(layout_min1)));
                      
                      //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      x10_long i__106291max__107590 = ((::x10aux::nullCheck(pt__107594)->FMGL(rank)) - (((x10_long)1ll)));
                      {
                          x10_long i__107591;
                          for (i__107591 = ((x10_long)2ll);
                               ((i__107591) <= (i__106291max__107590));
                               i__107591 = ((i__107591) + (((x10_long)1ll))))
                          {
                              x10_long i__107592 = i__107591;
                              
                              //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                              offset__107593 = ((((((offset__107593) * (::x10aux::nullCheck(::x10aux::nullCheck(dst)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                          ((((x10_long)2ll)) * (((i__107592) - (((x10_long)2ll))))))))) + (::x10aux::nullCheck(pt__107594)->x10::lang::Point::__apply(
                                                                                                                                             i__107592)))) - (::x10aux::nullCheck(::x10aux::nullCheck(dst)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                                                                                ((((((x10_long)2ll)) * (((i__107592) - (((x10_long)2ll)))))) + (((x10_long)1ll))))));
                          }
                      }
                      
                  }
                  
                  //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  ret__107595 = offset__107593;
                  ret__107595;
              }))
              , v__107597);
            
            //#line 641 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret__107598 = v__107597;
            
            //#line 636 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret__107598;
        }
    }
    
    //#line 878 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    return dst;
    
}
#endif // X10_REGIONARRAY_ARRAY_H_scan_1813
#endif // X10_REGIONARRAY_ARRAY_H_GENERICS
#ifndef X10_REGIONARRAY_ARRAY_H_IMPLEMENTATION
#define X10_REGIONARRAY_ARRAY_H_IMPLEMENTATION
#include <x10/regionarray/Array.h>

#ifndef X10_REGIONARRAY_ARRAY__CLOSURE__1_CLOSURE
#define X10_REGIONARRAY_ARRAY__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T)> class x10_regionarray_Array__closure__1 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0<x10_long>::template itable <x10_regionarray_Array__closure__1<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply() {
        try {
            return ::x10aux::nullCheck((gra)->__apply())->FMGL(region)->indexOf(
                     dstPoint);
            
        }
        catch (::x10::lang::CheckedThrowable* __exc1821) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc1821);
                {
                    x10_long __lowerer__var__1__ = ::x10aux::class_cast_unchecked<x10_long>(::x10::lang::Runtime::wrapAtChecked< x10_long >(
                                                                                              __lowerer__var__0__));
                    return __lowerer__var__1__;
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::regionarray::Array<TPMGL(T)>* > gra;
    ::x10::lang::Point* dstPoint;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->gra);
        buf.write(this->dstPoint);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_Array__closure__1<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_regionarray_Array__closure__1<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::regionarray::Array<TPMGL(T)>* > that_gra = buf.read< ::x10::lang::GlobalRef< ::x10::regionarray::Array<TPMGL(T)>* > >();
        ::x10::lang::Point* that_dstPoint = buf.read< ::x10::lang::Point*>();
        x10_regionarray_Array__closure__1<TPMGL(T) >* this_ = new (storage) x10_regionarray_Array__closure__1<TPMGL(T) >(that_gra, that_dstPoint);
        return this_;
    }
    
    x10_regionarray_Array__closure__1(::x10::lang::GlobalRef< ::x10::regionarray::Array<TPMGL(T)>* > gra, ::x10::lang::Point* dstPoint) : gra(gra), dstPoint(dstPoint) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10:938";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_0<x10_long>::template itable <x10_regionarray_Array__closure__1<TPMGL(T) > >x10_regionarray_Array__closure__1<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_Array__closure__1<TPMGL(T) >::__apply, &x10_regionarray_Array__closure__1<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_regionarray_Array__closure__1<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_long> >, &x10_regionarray_Array__closure__1<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_regionarray_Array__closure__1<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_Array__closure__1<TPMGL(T) >::_deserialize);

#endif // X10_REGIONARRAY_ARRAY__CLOSURE__1_CLOSURE
#ifndef X10_REGIONARRAY_ARRAY__CLOSURE__2_CLOSURE
#define X10_REGIONARRAY_ARRAY__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T)> class x10_regionarray_Array__closure__2 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0<x10_long>::template itable <x10_regionarray_Array__closure__2<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply() {
        try {
            return ::x10aux::nullCheck((gra)->__apply())->FMGL(region)->indexOf(
                     srcPoint);
            
        }
        catch (::x10::lang::CheckedThrowable* __exc1822) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc1822);
                {
                    x10_long __lowerer__var__1__ = ::x10aux::class_cast_unchecked<x10_long>(::x10::lang::Runtime::wrapAtChecked< x10_long >(
                                                                                              __lowerer__var__0__));
                    return __lowerer__var__1__;
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::regionarray::Array<TPMGL(T)>* > gra;
    ::x10::lang::Point* srcPoint;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->gra);
        buf.write(this->srcPoint);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_Array__closure__2<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_regionarray_Array__closure__2<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::regionarray::Array<TPMGL(T)>* > that_gra = buf.read< ::x10::lang::GlobalRef< ::x10::regionarray::Array<TPMGL(T)>* > >();
        ::x10::lang::Point* that_srcPoint = buf.read< ::x10::lang::Point*>();
        x10_regionarray_Array__closure__2<TPMGL(T) >* this_ = new (storage) x10_regionarray_Array__closure__2<TPMGL(T) >(that_gra, that_srcPoint);
        return this_;
    }
    
    x10_regionarray_Array__closure__2(::x10::lang::GlobalRef< ::x10::regionarray::Array<TPMGL(T)>* > gra, ::x10::lang::Point* srcPoint) : gra(gra), srcPoint(srcPoint) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10:1041";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_0<x10_long>::template itable <x10_regionarray_Array__closure__2<TPMGL(T) > >x10_regionarray_Array__closure__2<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_Array__closure__2<TPMGL(T) >::__apply, &x10_regionarray_Array__closure__2<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_regionarray_Array__closure__2<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_long> >, &x10_regionarray_Array__closure__2<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_regionarray_Array__closure__2<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_Array__closure__2<TPMGL(T) >::_deserialize);

#endif // X10_REGIONARRAY_ARRAY__CLOSURE__2_CLOSURE

//#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> typename ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)>::template itable< ::x10::regionarray::Array<TPMGL(T)> >  x10::regionarray::Array<TPMGL(T)>::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::regionarray::Array<TPMGL(T)>::__apply, &x10::regionarray::Array<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10::lang::Any::itable< ::x10::regionarray::Array<TPMGL(T)> >  x10::regionarray::Array<TPMGL(T)>::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::regionarray::Array<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> typename ::x10::lang::Iterable< ::x10::lang::Point*>::template itable< ::x10::regionarray::Array<TPMGL(T)> >  x10::regionarray::Array<TPMGL(T)>::_itable_2(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::regionarray::Array<TPMGL(T)>::iterator, &x10::regionarray::Array<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10::regionarray::Array<TPMGL(T)>::_itables[4] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Point*> >, &_itable_2), ::x10aux::itable_entry(NULL, (void*)"::x10::regionarray::Array<TPMGL(T)>")};

//#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
/**
     * The backing storage for the array's elements
     */

//#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> ::x10::lang::Rail< TPMGL(T) >* x10::regionarray::Array<TPMGL(T)>::raw(
  ) {
    return this->FMGL(raw);
    
}

//#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> void x10::regionarray::Array<TPMGL(T)>::_constructor(
                           ::x10::regionarray::Region* reg) {
    
    //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    FMGL(region) = reg;
    FMGL(rank) = ::x10aux::nullCheck(reg)->FMGL(rank);
    FMGL(rect) = ::x10aux::nullCheck(reg)->FMGL(rect);
    FMGL(zeroBased) = ::x10aux::nullCheck(reg)->FMGL(zeroBased);
    FMGL(rail) = ::x10aux::nullCheck(reg)->FMGL(rail);
    FMGL(size) = ::x10aux::nullCheck(reg)->size();
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array<TPMGL(T)>* this__107326 = this;
    
    //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array__LayoutHelper crh =  ::x10::regionarray::Array__LayoutHelper::_alloc();
    (crh)->::x10::regionarray::Array__LayoutHelper::_constructor(
      reg);
    
    //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout_min0) = crh->FMGL(min0);
    
    //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout_stride1) = crh->FMGL(stride1);
    
    //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout_min1) = crh->FMGL(min1);
    
    //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout) = crh->FMGL(layout);
    
    //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long n = crh->FMGL(size);
    
    //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(raw) = ::x10::lang::Rail< TPMGL(T) >::_make(n);
}
template<class TPMGL(T)> ::x10::regionarray::Array<TPMGL(T)>* x10::regionarray::Array<TPMGL(T)>::_make(
                           ::x10::regionarray::Region* reg)
{
    ::x10::regionarray::Array<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::regionarray::Array<TPMGL(T)> >()) ::x10::regionarray::Array<TPMGL(T)>();
    this_->_constructor(reg);
    return this_;
}



//#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> void x10::regionarray::Array<TPMGL(T)>::_constructor(
                           x10_boolean zeroed, ::x10::regionarray::Region* reg) {
    
    //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    FMGL(region) = reg;
    FMGL(rank) = ::x10aux::nullCheck(reg)->FMGL(rank);
    FMGL(rect) = ::x10aux::nullCheck(reg)->FMGL(rect);
    FMGL(zeroBased) = ::x10aux::nullCheck(reg)->FMGL(zeroBased);
    FMGL(rail) = ::x10aux::nullCheck(reg)->FMGL(rail);
    FMGL(size) = ::x10aux::nullCheck(reg)->size();
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array<TPMGL(T)>* this__107327 = this;
    
    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array__LayoutHelper crh =  ::x10::regionarray::Array__LayoutHelper::_alloc();
    (crh)->::x10::regionarray::Array__LayoutHelper::_constructor(
      reg);
    
    //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout_min0) = crh->FMGL(min0);
    
    //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout_stride1) = crh->FMGL(stride1);
    
    //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout_min1) = crh->FMGL(min1);
    
    //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout) = crh->FMGL(layout);
    
    //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long n = crh->FMGL(size);
    
    //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    if (zeroed) {
        
        //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        this->FMGL(raw) = ::x10::lang::Rail< TPMGL(T) >::_make(n);
    } else {
        
        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        this->FMGL(raw) = ::x10::lang::Rail< TPMGL(T) >::_makeUnsafe(n, false);
    }
    
}
template<class TPMGL(T)> ::x10::regionarray::Array<TPMGL(T)>* x10::regionarray::Array<TPMGL(T)>::_make(
                           x10_boolean zeroed, ::x10::regionarray::Region* reg)
{
    ::x10::regionarray::Array<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::regionarray::Array<TPMGL(T)> >()) ::x10::regionarray::Array<TPMGL(T)>();
    this_->_constructor(zeroed, reg);
    return this_;
}



//#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> void x10::regionarray::Array<TPMGL(T)>::_constructor(
                           ::x10::regionarray::Region* reg,
                           ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)>* init) {
    
    //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    FMGL(region) = reg;
    FMGL(rank) = ::x10aux::nullCheck(reg)->FMGL(rank);
    FMGL(rect) = ::x10aux::nullCheck(reg)->FMGL(rect);
    FMGL(zeroBased) = ::x10aux::nullCheck(reg)->FMGL(zeroBased);
    FMGL(rail) = ::x10aux::nullCheck(reg)->FMGL(rail);
    FMGL(size) = ::x10aux::nullCheck(reg)->size();
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array<TPMGL(T)>* this__107328 = this;
    
    //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array__LayoutHelper crh =  ::x10::regionarray::Array__LayoutHelper::_alloc();
    (crh)->::x10::regionarray::Array__LayoutHelper::_constructor(
      reg);
    
    //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout_min0) = crh->FMGL(min0);
    
    //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout_stride1) = crh->FMGL(stride1);
    
    //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout_min1) = crh->FMGL(min1);
    
    //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout) = crh->FMGL(layout);
    
    //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long n = crh->FMGL(size);
    
    //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::lang::Rail< TPMGL(T) >* r = ::x10::lang::Rail< TPMGL(T) >::_makeUnsafe(n, false);
    
    //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    {
        ::x10::lang::Iterator< ::x10::lang::Point*>* p__106200;
        for (p__106200 = ::x10aux::nullCheck(reg)->iterator();
             ::x10::lang::Iterator< ::x10::lang::Point*>::hasNext(::x10aux::nullCheck(p__106200));
             ) {
            ::x10::lang::Point* p = ::x10::lang::Iterator< ::x10::lang::Point*>::next(::x10aux::nullCheck(p__106200));
            
            //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            r->x10::lang::template Rail< TPMGL(T) >::__set(
              (__extension__ ({
                  ::x10::regionarray::Array<TPMGL(T)>* this__106503 =
                    this;
                  
                  //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  ::x10::lang::Point* pt__106497 = p;
                  x10_long ret__106504;
                  
                  //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  x10_long offset__107332 = ((::x10aux::nullCheck(pt__106497)->x10::lang::Point::__apply(
                                                ((x10_long)(((x10_int)0))))) - (::x10aux::nullCheck(this__106503)->FMGL(layout_min0)));
                  
                  //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  if (((::x10aux::nullCheck(pt__106497)->FMGL(rank)) > (((x10_long)1ll))))
                  {
                      
                      //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      offset__107332 = ((((((offset__107332) * (::x10aux::nullCheck(this__106503)->FMGL(layout_stride1)))) + (::x10aux::nullCheck(pt__106497)->x10::lang::Point::__apply(
                                                                                                                                ((x10_long)1ll))))) - (::x10aux::nullCheck(this__106503)->FMGL(layout_min1)));
                      
                      //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      x10_long i__106291max__107329 = ((::x10aux::nullCheck(pt__106497)->FMGL(rank)) - (((x10_long)1ll)));
                      {
                          x10_long i__107330;
                          for (i__107330 = ((x10_long)2ll);
                               ((i__107330) <= (i__106291max__107329));
                               i__107330 = ((i__107330) + (((x10_long)1ll))))
                          {
                              x10_long i__107331 = i__107330;
                              
                              //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                              offset__107332 = ((((((offset__107332) * (::x10aux::nullCheck(::x10aux::nullCheck(this__106503)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                          ((((x10_long)2ll)) * (((i__107331) - (((x10_long)2ll))))))))) + (::x10aux::nullCheck(pt__106497)->x10::lang::Point::__apply(
                                                                                                                                             i__107331)))) - (::x10aux::nullCheck(::x10aux::nullCheck(this__106503)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                                                                                ((((((x10_long)2ll)) * (((i__107331) - (((x10_long)2ll)))))) + (((x10_long)1ll))))));
                          }
                      }
                      
                  }
                  
                  //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                  ret__106504 = offset__107332;
                  ret__106504;
              }))
              , ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)>::__apply(::x10aux::nullCheck(init), 
                p));
        }
    }
    
    //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(raw) = r;
}
template<class TPMGL(T)> ::x10::regionarray::Array<TPMGL(T)>* x10::regionarray::Array<TPMGL(T)>::_make(
                           ::x10::regionarray::Region* reg,
                           ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)>* init)
{
    ::x10::regionarray::Array<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::regionarray::Array<TPMGL(T)> >()) ::x10::regionarray::Array<TPMGL(T)>();
    this_->_constructor(reg, init);
    return this_;
}



//#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> void x10::regionarray::Array<TPMGL(T)>::_constructor(
                           ::x10::regionarray::Region* reg,
                           TPMGL(T) init) {
    
    //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    FMGL(region) = reg;
    FMGL(rank) = ::x10aux::nullCheck(reg)->FMGL(rank);
    FMGL(rect) = ::x10aux::nullCheck(reg)->FMGL(rect);
    FMGL(zeroBased) = ::x10aux::nullCheck(reg)->FMGL(zeroBased);
    FMGL(rail) = ::x10aux::nullCheck(reg)->FMGL(rail);
    FMGL(size) = ::x10aux::nullCheck(reg)->size();
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array<TPMGL(T)>* this__107333 = this;
    
    //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array__LayoutHelper crh =  ::x10::regionarray::Array__LayoutHelper::_alloc();
    (crh)->::x10::regionarray::Array__LayoutHelper::_constructor(
      reg);
    
    //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout_min0) = crh->FMGL(min0);
    
    //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout_stride1) = crh->FMGL(stride1);
    
    //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout_min1) = crh->FMGL(min1);
    
    //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout) = crh->FMGL(layout);
    
    //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long n = crh->FMGL(size);
    
    //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::lang::Rail< TPMGL(T) >* r = ::x10::lang::Rail< TPMGL(T) >::_makeUnsafe(n, false);
    
    //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    if (::x10aux::nullCheck(reg)->FMGL(rect)) {
        
        //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ::x10::lang::Rail< TPMGL(T) >* rail__107334 = r;
        x10_long i__106202max__107335 = (x10_long)(::x10aux::nullCheck(rail__107334)->FMGL(size));
        {
            x10_long i__107336;
            for (i__107336 = ((x10_long)0ll); ((i__107336) < (i__106202max__107335));
                 i__107336 = ((i__107336) + (((x10_long)1ll))))
            {
                x10_long i__107337 = i__107336;
                
                //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                r->x10::lang::template Rail< TPMGL(T) >::__set(
                  i__107337, init);
            }
        }
        
    } else {
        
        //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        {
            ::x10::lang::Iterator< ::x10::lang::Point*>* p__106221;
            for (p__106221 = ::x10aux::nullCheck(reg)->iterator();
                 ::x10::lang::Iterator< ::x10::lang::Point*>::hasNext(::x10aux::nullCheck(p__106221));
                 ) {
                ::x10::lang::Point* p = ::x10::lang::Iterator< ::x10::lang::Point*>::next(::x10aux::nullCheck(p__106221));
                
                //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                r->x10::lang::template Rail< TPMGL(T) >::__set(
                  (__extension__ ({
                      ::x10::regionarray::Array<TPMGL(T)>* this__106515 =
                        this;
                      
                      //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      ::x10::lang::Point* pt__106509 = p;
                      x10_long ret__106516;
                      
                      //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      x10_long offset__107341 = ((::x10aux::nullCheck(pt__106509)->x10::lang::Point::__apply(
                                                    ((x10_long)(((x10_int)0))))) - (::x10aux::nullCheck(this__106515)->FMGL(layout_min0)));
                      
                      //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      if (((::x10aux::nullCheck(pt__106509)->FMGL(rank)) > (((x10_long)1ll))))
                      {
                          
                          //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                          offset__107341 = ((((((offset__107341) * (::x10aux::nullCheck(this__106515)->FMGL(layout_stride1)))) + (::x10aux::nullCheck(pt__106509)->x10::lang::Point::__apply(
                                                                                                                                    ((x10_long)1ll))))) - (::x10aux::nullCheck(this__106515)->FMGL(layout_min1)));
                          
                          //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                          x10_long i__106291max__107338 =
                            ((::x10aux::nullCheck(pt__106509)->FMGL(rank)) - (((x10_long)1ll)));
                          {
                              x10_long i__107339;
                              for (i__107339 = ((x10_long)2ll);
                                   ((i__107339) <= (i__106291max__107338));
                                   i__107339 = ((i__107339) + (((x10_long)1ll))))
                              {
                                  x10_long i__107340 = i__107339;
                                  
                                  //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                  offset__107341 = ((((((offset__107341) * (::x10aux::nullCheck(::x10aux::nullCheck(this__106515)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                              ((((x10_long)2ll)) * (((i__107340) - (((x10_long)2ll))))))))) + (::x10aux::nullCheck(pt__106509)->x10::lang::Point::__apply(
                                                                                                                                                 i__107340)))) - (::x10aux::nullCheck(::x10aux::nullCheck(this__106515)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                                                                                    ((((((x10_long)2ll)) * (((i__107340) - (((x10_long)2ll)))))) + (((x10_long)1ll))))));
                              }
                          }
                          
                      }
                      
                      //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      ret__106516 = offset__107341;
                      ret__106516;
                  }))
                  , init);
            }
        }
        
    }
    
    //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(raw) = r;
}
template<class TPMGL(T)> ::x10::regionarray::Array<TPMGL(T)>* x10::regionarray::Array<TPMGL(T)>::_make(
                           ::x10::regionarray::Region* reg,
                           TPMGL(T) init) {
    ::x10::regionarray::Array<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::regionarray::Array<TPMGL(T)> >()) ::x10::regionarray::Array<TPMGL(T)>();
    this_->_constructor(reg, init);
    return this_;
}



//#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> void x10::regionarray::Array<TPMGL(T)>::_constructor(
                           ::x10::regionarray::Region* reg,
                           ::x10::lang::Rail< TPMGL(T) >* backingStore) {
    
    //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    FMGL(region) = reg;
    FMGL(rank) = ::x10aux::nullCheck(reg)->FMGL(rank);
    FMGL(rect) = ::x10aux::nullCheck(reg)->FMGL(rect);
    FMGL(zeroBased) = ::x10aux::nullCheck(reg)->FMGL(zeroBased);
    FMGL(rail) = ::x10aux::nullCheck(reg)->FMGL(rail);
    FMGL(size) = ::x10aux::nullCheck(reg)->size();
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array<TPMGL(T)>* this__107342 = this;
    
    //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array__LayoutHelper crh =  ::x10::regionarray::Array__LayoutHelper::_alloc();
    (crh)->::x10::regionarray::Array__LayoutHelper::_constructor(
      reg);
    
    //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout_min0) = crh->FMGL(min0);
    
    //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout_stride1) = crh->FMGL(stride1);
    
    //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout_min1) = crh->FMGL(min1);
    
    //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout) = crh->FMGL(layout);
    
    //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long n = crh->FMGL(size);
    
    //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    if (((n) > ((x10_long)(::x10aux::nullCheck(backingStore)->FMGL(size)))))
    {
        
        //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::IllegalArgumentException::_make((__extension__ ({ static ::x10::lang::String* strLit__125780 = ::x10aux::makeStringLit("backingStore too small"); strLit__125780; })))));
    }
    
    //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(raw) = (backingStore);
}
template<class TPMGL(T)> ::x10::regionarray::Array<TPMGL(T)>* x10::regionarray::Array<TPMGL(T)>::_make(
                           ::x10::regionarray::Region* reg,
                           ::x10::lang::Rail< TPMGL(T) >* backingStore)
{
    ::x10::regionarray::Array<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::regionarray::Array<TPMGL(T)> >()) ::x10::regionarray::Array<TPMGL(T)>();
    this_->_constructor(reg, backingStore);
    return this_;
}



//#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> void x10::regionarray::Array<TPMGL(T)>::_constructor(
                           ::x10::lang::Rail< TPMGL(T) >* backingStore) {
    
    //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long s = (x10_long)(::x10aux::nullCheck(backingStore)->FMGL(size));
    
    //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::RectRegion1D* myReg =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
    (myReg)->::x10::regionarray::RectRegion1D::_constructor(
      ((s) - (((x10_long)1ll))));
    
    //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    FMGL(region) = reinterpret_cast< ::x10::regionarray::Region*>(myReg);
    FMGL(rank) = ((x10_long)1ll);
    FMGL(rect) = true;
    FMGL(zeroBased) = true;
    FMGL(rail) = true;
    FMGL(size) = s;
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array<TPMGL(T)>* this__107343 = this;
    
    //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout_min0) = this->FMGL(layout_stride1) =
      this->FMGL(layout_min1) = ((x10_long)0ll);
    
    //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(raw) = (backingStore);
}
template<class TPMGL(T)> ::x10::regionarray::Array<TPMGL(T)>* x10::regionarray::Array<TPMGL(T)>::_make(
                           ::x10::lang::Rail< TPMGL(T) >* backingStore)
{
    ::x10::regionarray::Array<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::regionarray::Array<TPMGL(T)> >()) ::x10::regionarray::Array<TPMGL(T)>();
    this_->_constructor(backingStore);
    return this_;
}



//#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> void x10::regionarray::Array<TPMGL(T)>::_constructor(
                           x10_long size) {
    
    //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::RectRegion1D* myReg =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
    (myReg)->::x10::regionarray::RectRegion1D::_constructor(
      ((size) - (((x10_long)1ll))));
    
    //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    FMGL(region) = reinterpret_cast< ::x10::regionarray::Region*>(myReg);
    FMGL(rank) = ((x10_long)1ll);
    FMGL(rect) = true;
    FMGL(zeroBased) = true;
    FMGL(rail) = true;
    FMGL(size) = size;
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array<TPMGL(T)>* this__107344 = this;
    
    //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout_min0) = this->FMGL(layout_stride1) =
      this->FMGL(layout_min1) = ((x10_long)0ll);
    
    //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(raw) = ::x10::lang::Rail< TPMGL(T) >::_make(size);
}
template<class TPMGL(T)> ::x10::regionarray::Array<TPMGL(T)>* x10::regionarray::Array<TPMGL(T)>::_make(
                           x10_long size) {
    ::x10::regionarray::Array<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::regionarray::Array<TPMGL(T)> >()) ::x10::regionarray::Array<TPMGL(T)>();
    this_->_constructor(size);
    return this_;
}



//#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> void x10::regionarray::Array<TPMGL(T)>::_constructor(
                           x10_boolean zeroed, x10_long size) {
    
    //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::RectRegion1D* myReg =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
    (myReg)->::x10::regionarray::RectRegion1D::_constructor(
      ((size) - (((x10_long)1ll))));
    
    //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    FMGL(region) = reinterpret_cast< ::x10::regionarray::Region*>(myReg);
    FMGL(rank) = ((x10_long)1ll);
    FMGL(rect) = true;
    FMGL(zeroBased) = true;
    FMGL(rail) = true;
    FMGL(size) = size;
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array<TPMGL(T)>* this__107345 = this;
    
    //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout_min0) = this->FMGL(layout_stride1) =
      this->FMGL(layout_min1) = ((x10_long)0ll);
    
    //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    if (zeroed) {
        
        //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        this->FMGL(raw) = ::x10::lang::Rail< TPMGL(T) >::_make(size);
    } else {
        
        //#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        this->FMGL(raw) = ::x10::lang::Rail< TPMGL(T) >::_makeUnsafe(size, false);
    }
    
}
template<class TPMGL(T)> ::x10::regionarray::Array<TPMGL(T)>* x10::regionarray::Array<TPMGL(T)>::_make(
                           x10_boolean zeroed, x10_long size)
{
    ::x10::regionarray::Array<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::regionarray::Array<TPMGL(T)> >()) ::x10::regionarray::Array<TPMGL(T)>();
    this_->_constructor(zeroed, size);
    return this_;
}



//#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> void x10::regionarray::Array<TPMGL(T)>::_constructor(
                           x10_long size, ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* init) {
    
    //#line 314 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::RectRegion1D* myReg =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
    (myReg)->::x10::regionarray::RectRegion1D::_constructor(
      ((size) - (((x10_long)1ll))));
    
    //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    FMGL(region) = reinterpret_cast< ::x10::regionarray::Region*>(myReg);
    FMGL(rank) = ((x10_long)1ll);
    FMGL(rect) = true;
    FMGL(zeroBased) = true;
    FMGL(rail) = true;
    FMGL(size) = size;
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array<TPMGL(T)>* this__107346 = this;
    
    //#line 317 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout_min0) = this->FMGL(layout_stride1) =
      this->FMGL(layout_min1) = ((x10_long)0ll);
    
    //#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 319 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::lang::Rail< TPMGL(T) >* r = ::x10::lang::Rail< TPMGL(T) >::_makeUnsafe(size, false);
    
    //#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long i__106223max__107347 = ((size) - (((x10_long)1ll)));
    {
        x10_long i__107348;
        for (i__107348 = ((x10_long)0ll); ((i__107348) <= (i__106223max__107347));
             i__107348 = ((i__107348) + (((x10_long)1ll))))
        {
            x10_long i__107349 = i__107348;
            
            //#line 321 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            r->x10::lang::template Rail< TPMGL(T) >::__set(
              i__107349, ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>::__apply(::x10aux::nullCheck(init), 
                i__107349));
        }
    }
    
    //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(raw) = r;
}
template<class TPMGL(T)> ::x10::regionarray::Array<TPMGL(T)>* x10::regionarray::Array<TPMGL(T)>::_make(
                           x10_long size, ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* init)
{
    ::x10::regionarray::Array<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::regionarray::Array<TPMGL(T)> >()) ::x10::regionarray::Array<TPMGL(T)>();
    this_->_constructor(size, init);
    return this_;
}



//#line 333 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> void x10::regionarray::Array<TPMGL(T)>::_constructor(
                           x10_long size, TPMGL(T) init) {
    
    //#line 335 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::RectRegion1D* myReg =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
    (myReg)->::x10::regionarray::RectRegion1D::_constructor(
      ((size) - (((x10_long)1ll))));
    
    //#line 336 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    FMGL(region) = reinterpret_cast< ::x10::regionarray::Region*>(myReg);
    FMGL(rank) = ((x10_long)1ll);
    FMGL(rect) = true;
    FMGL(zeroBased) = true;
    FMGL(rail) = true;
    FMGL(size) = size;
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array<TPMGL(T)>* this__107350 = this;
    
    //#line 338 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout_min0) = this->FMGL(layout_stride1) =
      this->FMGL(layout_min1) = ((x10_long)0ll);
    
    //#line 339 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 340 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::lang::Rail< TPMGL(T) >* r = ::x10::lang::Rail< TPMGL(T) >::_makeUnsafe(size, false);
    
    //#line 341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long i__106241max__107351 = ((size) - (((x10_long)1ll)));
    {
        x10_long i__107352;
        for (i__107352 = ((x10_long)0ll); ((i__107352) <= (i__106241max__107351));
             i__107352 = ((i__107352) + (((x10_long)1ll))))
        {
            x10_long i__107353 = i__107352;
            
            //#line 342 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            r->x10::lang::template Rail< TPMGL(T) >::__set(
              i__107353, init);
        }
    }
    
    //#line 344 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(raw) = r;
}
template<class TPMGL(T)> ::x10::regionarray::Array<TPMGL(T)>* x10::regionarray::Array<TPMGL(T)>::_make(
                           x10_long size, TPMGL(T) init) {
    ::x10::regionarray::Array<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::regionarray::Array<TPMGL(T)> >()) ::x10::regionarray::Array<TPMGL(T)>();
    this_->_constructor(size, init);
    return this_;
}



//#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> void x10::regionarray::Array<TPMGL(T)>::_constructor(
                           ::x10::regionarray::Array<TPMGL(T)>* init) {
    
    //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    FMGL(region) = ::x10aux::nullCheck(init)->FMGL(region);
    FMGL(rank) = ::x10aux::nullCheck(init)->FMGL(rank);
    FMGL(rect) = ::x10aux::nullCheck(init)->FMGL(rect);
    FMGL(zeroBased) = ::x10aux::nullCheck(init)->FMGL(zeroBased);
    FMGL(rail) = ::x10aux::nullCheck(init)->FMGL(rail);
    FMGL(size) = ::x10aux::nullCheck(init)->FMGL(size);
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array<TPMGL(T)>* this__107354 = this;
    
    //#line 356 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout_min0) = ::x10aux::nullCheck(init)->FMGL(layout_min0);
    
    //#line 357 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout_stride1) = ::x10aux::nullCheck(init)->FMGL(layout_stride1);
    
    //#line 358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout_min1) = ::x10aux::nullCheck(init)->FMGL(layout_min1);
    
    //#line 359 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(layout) = ::x10aux::nullCheck(init)->FMGL(layout);
    
    //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::lang::Rail< TPMGL(T) >* r = ::x10::lang::Rail< TPMGL(T) >::_makeUnsafe((x10_long)(::x10aux::nullCheck(::x10aux::nullCheck(init)->FMGL(raw))->FMGL(size)), false);
    
    //#line 361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::lang::Rail< void >::template copy< TPMGL(T) >(
      ::x10aux::nullCheck(init)->FMGL(raw), ((x10_long)0ll),
      r, ((x10_long)0ll), (x10_long)(::x10aux::nullCheck(r)->FMGL(size)));
    
    //#line 362 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(raw) = r;
}
template<class TPMGL(T)> ::x10::regionarray::Array<TPMGL(T)>* x10::regionarray::Array<TPMGL(T)>::_make(
                           ::x10::regionarray::Array<TPMGL(T)>* init)
{
    ::x10::regionarray::Array<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::regionarray::Array<TPMGL(T)> >()) ::x10::regionarray::Array<TPMGL(T)>();
    this_->_constructor(init);
    return this_;
}



//#line 371 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> void x10::regionarray::Array<TPMGL(T)>::_constructor(
                           ::x10::regionarray::RemoteArray<TPMGL(T)>* init) {
    
    //#line 373 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array<TPMGL(T)>* this__107356 = this;
    
    //#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array<TPMGL(T)>* init__107357 = (::x10aux::nullCheck(init)->FMGL(array))->__apply();
    
    //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10aux::nullCheck(this__107356)->FMGL(region) = ::x10aux::nullCheck(init__107357)->FMGL(region);
    ::x10aux::nullCheck(this__107356)->FMGL(rank) = ::x10aux::nullCheck(init__107357)->FMGL(rank);
    ::x10aux::nullCheck(this__107356)->FMGL(rect) = ::x10aux::nullCheck(init__107357)->FMGL(rect);
    ::x10aux::nullCheck(this__107356)->FMGL(zeroBased) = ::x10aux::nullCheck(init__107357)->FMGL(zeroBased);
    ::x10aux::nullCheck(this__107356)->FMGL(rail) = ::x10aux::nullCheck(init__107357)->FMGL(rail);
    ::x10aux::nullCheck(this__107356)->FMGL(size) = ::x10aux::nullCheck(init__107357)->FMGL(size);
    
    //#line 356 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10aux::nullCheck(this__107356)->FMGL(layout_min0) =
      ::x10aux::nullCheck(init__107357)->FMGL(layout_min0);
    
    //#line 357 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10aux::nullCheck(this__107356)->FMGL(layout_stride1) =
      ::x10aux::nullCheck(init__107357)->FMGL(layout_stride1);
    
    //#line 358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10aux::nullCheck(this__107356)->FMGL(layout_min1) =
      ::x10aux::nullCheck(init__107357)->FMGL(layout_min1);
    
    //#line 359 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10aux::nullCheck(this__107356)->FMGL(layout) = ::x10aux::nullCheck(init__107357)->FMGL(layout);
    
    //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::lang::Rail< TPMGL(T) >* r__107355 = ::x10::lang::Rail< TPMGL(T) >::_makeUnsafe((x10_long)(::x10aux::nullCheck(::x10aux::nullCheck(init__107357)->FMGL(raw))->FMGL(size)), false);
    
    //#line 361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::lang::Rail< void >::template copy< TPMGL(T) >(
      ::x10aux::nullCheck(init__107357)->FMGL(raw), ((x10_long)0ll),
      r__107355, ((x10_long)0ll), (x10_long)(::x10aux::nullCheck(r__107355)->FMGL(size)));
    
    //#line 362 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10aux::nullCheck(this__107356)->FMGL(raw) = r__107355;
}
template<class TPMGL(T)> ::x10::regionarray::Array<TPMGL(T)>* x10::regionarray::Array<TPMGL(T)>::_make(
                           ::x10::regionarray::RemoteArray<TPMGL(T)>* init)
{
    ::x10::regionarray::Array<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::regionarray::Array<TPMGL(T)> >()) ::x10::regionarray::Array<TPMGL(T)>();
    this_->_constructor(init);
    return this_;
}



//#line 381 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> ::x10::lang::String* x10::regionarray::Array<TPMGL(T)>::toString(
  ) {
    
    //#line 382 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    if (this->FMGL(rail)) {
        
        //#line 383 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ::x10::util::StringBuilder* sb =  (new (::x10aux::alloc_z< ::x10::util::StringBuilder>()) ::x10::util::StringBuilder());
        (sb)->::x10::util::StringBuilder::_constructor();
        
        //#line 384 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        sb->add((__extension__ ({ static ::x10::lang::String* strLit__125783 = ::x10aux::makeStringLit("["); strLit__125783; })));
        
        //#line 385 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        x10_long sz = (__extension__ ({
            
            //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            x10_long a__106894 = this->FMGL(size);
            ((a__106894) < (((x10_long)10ll))) ? (a__106894)
              : (((x10_long)10ll));
        }))
        ;
        
        //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        x10_long i__106259max__107358 = ((sz) - (((x10_long)1ll)));
        {
            x10_long i__107359;
            for (i__107359 = ((x10_long)0ll); ((i__107359) <= (i__106259max__107358));
                 i__107359 = ((i__107359) + (((x10_long)1ll))))
            {
                x10_long i__107360 = i__107359;
                
                //#line 387 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                if (((i__107360) > (((x10_long)0ll)))) {
                    sb->add((__extension__ ({ static ::x10::lang::String* strLit__125785 = ::x10aux::makeStringLit(","); strLit__125785; })));
                }
                
                //#line 388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                sb->add(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125787 = ::x10aux::makeStringLit(""); strLit__125787; })), this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__apply(
                                                                                                                                                                       i__107360)));
            }
        }
        
        //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        if (((sz) < (this->FMGL(size)))) {
            sb->add(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125790 = ::x10aux::makeStringLit("...(omitted "); strLit__125790; })), ((this->FMGL(size)) - (sz))), (__extension__ ({ static ::x10::lang::String* strLit__125791 = ::x10aux::makeStringLit(" elements)"); strLit__125791; }))));
        }
        
        //#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        sb->add((__extension__ ({ static ::x10::lang::String* strLit__125793 = ::x10aux::makeStringLit("]"); strLit__125793; })));
        
        //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return sb->toString();
        
    } else {
        
        //#line 394 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return ::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125794 = ::x10aux::makeStringLit("Array("); strLit__125794; })), this->FMGL(region)), (__extension__ ({ static ::x10::lang::String* strLit__125795 = ::x10aux::makeStringLit(")"); strLit__125795; })));
        
    }
    
}

//#line 404 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> ::x10::lang::Iterator< ::x10::lang::Point*>*
  x10::regionarray::Array<TPMGL(T)>::iterator() {
    return this->FMGL(region)->iterator();
    
}

//#line 412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> ::x10::lang::Iterable<TPMGL(T)>*
  x10::regionarray::Array<TPMGL(T)>::values() {
    
    //#line 413 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    if (this->FMGL(rect)) {
        
        //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ::x10::regionarray::Array__Anonymous__14235<TPMGL(T)>* alloc__107362 =
           (new (::x10aux::alloc_z< ::x10::regionarray::Array__Anonymous__14235<TPMGL(T)> >()) ::x10::regionarray::Array__Anonymous__14235<TPMGL(T)>());
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ::x10::regionarray::Array<TPMGL(T)>* out__107361 =
          this;
        alloc__107362->FMGL(out__) = out__107361;
        
        //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return reinterpret_cast< ::x10::lang::Iterable<TPMGL(T)>*>(alloc__107362);
        
    } else {
        
        //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ::x10::regionarray::Array__Anonymous__14520<TPMGL(T)>* alloc__107364 =
           (new (::x10aux::alloc_z< ::x10::regionarray::Array__Anonymous__14520<TPMGL(T)> >()) ::x10::regionarray::Array__Anonymous__14520<TPMGL(T)>());
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ::x10::regionarray::Array<TPMGL(T)>* out__107363 =
          this;
        alloc__107364->FMGL(out__) = out__107363;
        
        //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return reinterpret_cast< ::x10::lang::Iterable<TPMGL(T)>*>(alloc__107364);
        
    }
    
}

//#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> TPMGL(T) x10::regionarray::Array<TPMGL(T)>::__apply(
  x10_long i0) {
    
    //#line 444 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    if (this->FMGL(rail)) {
        
        //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__apply(
                 i0);
        
    } else {
        
        //#line 451 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        return this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__apply(
                 ((i0) - (this->FMGL(layout_min0))));
        
    }
    
}

//#line 466 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> TPMGL(T) x10::regionarray::Array<TPMGL(T)>::__apply(
  x10_long i0, x10_long i1) {
    
    //#line 470 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long offset = ((i0) - (this->FMGL(layout_min0)));
    
    //#line 471 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    offset = ((((((offset) * (this->FMGL(layout_stride1)))) + (i1))) - (this->FMGL(layout_min1)));
    
    //#line 472 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    return this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__apply(
             offset);
    
}

//#line 487 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> TPMGL(T) x10::regionarray::Array<TPMGL(T)>::__apply(
  x10_long i0, x10_long i1, x10_long i2) {
    
    //#line 491 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    return this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__apply(
             (__extension__ ({
                 ::x10::regionarray::Array<TPMGL(T)>* this__106904 =
                   this;
                 
                 //#line 1206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                 x10_long i__106900 = i0;
                 x10_long i__106901 = i1;
                 x10_long i__106902 = i2;
                 x10_long ret__106905;
                 
                 //#line 1207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                 x10_long offset__107365 = ((i__106900) - (::x10aux::nullCheck(this__106904)->FMGL(layout_min0)));
                 
                 //#line 1208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                 offset__107365 = ((((((offset__107365) * (::x10aux::nullCheck(this__106904)->FMGL(layout_stride1)))) + (i__106901))) - (::x10aux::nullCheck(this__106904)->FMGL(layout_min1)));
                 
                 //#line 1209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                 offset__107365 = ((((((offset__107365) * (::x10aux::nullCheck(::x10aux::nullCheck(this__106904)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                             ((x10_long)0ll))))) + (i__106902))) - (::x10aux::nullCheck(::x10aux::nullCheck(this__106904)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                      ((x10_long)1ll))));
                 
                 //#line 1210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                 ret__106905 = offset__107365;
                 ret__106905;
             }))
             );
    
}

//#line 507 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> TPMGL(T) x10::regionarray::Array<TPMGL(T)>::__apply(
  x10_long i0, x10_long i1, x10_long i2, x10_long i3) {
    
    //#line 511 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    return this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__apply(
             (__extension__ ({
                 ::x10::regionarray::Array<TPMGL(T)>* this__106912 =
                   this;
                 
                 //#line 1213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                 x10_long i__106907 = i0;
                 x10_long i__106908 = i1;
                 x10_long i__106909 = i2;
                 x10_long i__106910 = i3;
                 x10_long ret__106913;
                 
                 //#line 1214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                 x10_long offset__107366 = ((i__106907) - (::x10aux::nullCheck(this__106912)->FMGL(layout_min0)));
                 
                 //#line 1215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                 offset__107366 = ((((((offset__107366) * (::x10aux::nullCheck(this__106912)->FMGL(layout_stride1)))) + (i__106908))) - (::x10aux::nullCheck(this__106912)->FMGL(layout_min1)));
                 
                 //#line 1216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                 offset__107366 = ((((((offset__107366) * (::x10aux::nullCheck(::x10aux::nullCheck(this__106912)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                             ((x10_long)0ll))))) + (i__106909))) - (::x10aux::nullCheck(::x10aux::nullCheck(this__106912)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                      ((x10_long)1ll))));
                 
                 //#line 1217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                 offset__107366 = ((((((offset__107366) * (::x10aux::nullCheck(::x10aux::nullCheck(this__106912)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                             ((x10_long)2ll))))) + (i__106910))) - (::x10aux::nullCheck(::x10aux::nullCheck(this__106912)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                      ((x10_long)3ll))));
                 
                 //#line 1218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                 ret__106913 = offset__107366;
                 ret__106913;
             }))
             );
    
}

//#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> TPMGL(T) x10::regionarray::Array<TPMGL(T)>::__apply(
  ::x10::lang::Point* pt) {
    
    //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    return this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__apply(
             (__extension__ ({
                 ::x10::regionarray::Array<TPMGL(T)>* this__106921 =
                   this;
                 
                 //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                 ::x10::lang::Point* pt__106915 = pt;
                 x10_long ret__106922;
                 
                 //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                 x10_long offset__107370 = ((::x10aux::nullCheck(pt__106915)->x10::lang::Point::__apply(
                                               ((x10_long)(((x10_int)0))))) - (::x10aux::nullCheck(this__106921)->FMGL(layout_min0)));
                 
                 //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                 if (((::x10aux::nullCheck(pt__106915)->FMGL(rank)) > (((x10_long)1ll))))
                 {
                     
                     //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                     offset__107370 = ((((((offset__107370) * (::x10aux::nullCheck(this__106921)->FMGL(layout_stride1)))) + (::x10aux::nullCheck(pt__106915)->x10::lang::Point::__apply(
                                                                                                                               ((x10_long)1ll))))) - (::x10aux::nullCheck(this__106921)->FMGL(layout_min1)));
                     
                     //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                     x10_long i__106291max__107367 = ((::x10aux::nullCheck(pt__106915)->FMGL(rank)) - (((x10_long)1ll)));
                     {
                         x10_long i__107368;
                         for (i__107368 = ((x10_long)2ll);
                              ((i__107368) <= (i__106291max__107367));
                              i__107368 = ((i__107368) + (((x10_long)1ll))))
                         {
                             x10_long i__107369 = i__107368;
                             
                             //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                             offset__107370 = ((((((offset__107370) * (::x10aux::nullCheck(::x10aux::nullCheck(this__106921)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                         ((((x10_long)2ll)) * (((i__107369) - (((x10_long)2ll))))))))) + (::x10aux::nullCheck(pt__106915)->x10::lang::Point::__apply(
                                                                                                                                            i__107369)))) - (::x10aux::nullCheck(::x10aux::nullCheck(this__106921)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                                                                               ((((((x10_long)2ll)) * (((i__107369) - (((x10_long)2ll)))))) + (((x10_long)1ll))))));
                         }
                     }
                     
                 }
                 
                 //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                 ret__106922 = offset__107370;
                 ret__106922;
             }))
             );
    
}

//#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> TPMGL(T) x10::regionarray::Array<TPMGL(T)>::__set(
  x10_long i0, TPMGL(T) v) {
    
    //#line 545 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    if (this->FMGL(rail)) {
        
        //#line 547 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__set(
          i0, v);
    } else {
        
        //#line 552 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__set(
          ((i0) - (this->FMGL(layout_min0))), v);
    }
    
    //#line 554 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    return v;
    
}

//#line 570 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> TPMGL(T) x10::regionarray::Array<TPMGL(T)>::__set(
  x10_long i0, x10_long i1, TPMGL(T) v) {
    
    //#line 574 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long offset = ((i0) - (this->FMGL(layout_min0)));
    
    //#line 575 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    offset = ((((((offset) * (this->FMGL(layout_stride1)))) + (i1))) - (this->FMGL(layout_min1)));
    
    //#line 576 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__set(
      offset, v);
    
    //#line 577 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    return v;
    
}

//#line 594 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> TPMGL(T) x10::regionarray::Array<TPMGL(T)>::__set(
  x10_long i0, x10_long i1, x10_long i2, TPMGL(T) v) {
    
    //#line 598 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__set(
      (__extension__ ({
          ::x10::regionarray::Array<TPMGL(T)>* this__106928 =
            this;
          
          //#line 1206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
          x10_long i__106924 = i0;
          x10_long i__106925 = i1;
          x10_long i__106926 = i2;
          x10_long ret__106929;
          
          //#line 1207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
          x10_long offset__107371 = ((i__106924) - (::x10aux::nullCheck(this__106928)->FMGL(layout_min0)));
          
          //#line 1208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
          offset__107371 = ((((((offset__107371) * (::x10aux::nullCheck(this__106928)->FMGL(layout_stride1)))) + (i__106925))) - (::x10aux::nullCheck(this__106928)->FMGL(layout_min1)));
          
          //#line 1209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
          offset__107371 = ((((((offset__107371) * (::x10aux::nullCheck(::x10aux::nullCheck(this__106928)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                      ((x10_long)0ll))))) + (i__106926))) - (::x10aux::nullCheck(::x10aux::nullCheck(this__106928)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                               ((x10_long)1ll))));
          
          //#line 1210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
          ret__106929 = offset__107371;
          ret__106929;
      }))
      , v);
    
    //#line 599 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    return v;
    
}

//#line 617 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> TPMGL(T) x10::regionarray::Array<TPMGL(T)>::__set(
  x10_long i0, x10_long i1, x10_long i2, x10_long i3, TPMGL(T) v) {
    
    //#line 621 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__set(
      (__extension__ ({
          ::x10::regionarray::Array<TPMGL(T)>* this__106936 =
            this;
          
          //#line 1213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
          x10_long i__106931 = i0;
          x10_long i__106932 = i1;
          x10_long i__106933 = i2;
          x10_long i__106934 = i3;
          x10_long ret__106937;
          
          //#line 1214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
          x10_long offset__107372 = ((i__106931) - (::x10aux::nullCheck(this__106936)->FMGL(layout_min0)));
          
          //#line 1215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
          offset__107372 = ((((((offset__107372) * (::x10aux::nullCheck(this__106936)->FMGL(layout_stride1)))) + (i__106932))) - (::x10aux::nullCheck(this__106936)->FMGL(layout_min1)));
          
          //#line 1216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
          offset__107372 = ((((((offset__107372) * (::x10aux::nullCheck(::x10aux::nullCheck(this__106936)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                      ((x10_long)0ll))))) + (i__106933))) - (::x10aux::nullCheck(::x10aux::nullCheck(this__106936)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                               ((x10_long)1ll))));
          
          //#line 1217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
          offset__107372 = ((((((offset__107372) * (::x10aux::nullCheck(::x10aux::nullCheck(this__106936)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                      ((x10_long)2ll))))) + (i__106934))) - (::x10aux::nullCheck(::x10aux::nullCheck(this__106936)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                               ((x10_long)3ll))));
          
          //#line 1218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
          ret__106937 = offset__107372;
          ret__106937;
      }))
      , v);
    
    //#line 622 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    return v;
    
}

//#line 636 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> TPMGL(T) x10::regionarray::Array<TPMGL(T)>::__set(
  ::x10::lang::Point* p, TPMGL(T) v) {
    
    //#line 640 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__set(
      (__extension__ ({
          ::x10::regionarray::Array<TPMGL(T)>* this__106945 =
            this;
          
          //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
          ::x10::lang::Point* pt__106939 = p;
          x10_long ret__106946;
          
          //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
          x10_long offset__107376 = ((::x10aux::nullCheck(pt__106939)->x10::lang::Point::__apply(
                                        ((x10_long)(((x10_int)0))))) - (::x10aux::nullCheck(this__106945)->FMGL(layout_min0)));
          
          //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
          if (((::x10aux::nullCheck(pt__106939)->FMGL(rank)) > (((x10_long)1ll))))
          {
              
              //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
              offset__107376 = ((((((offset__107376) * (::x10aux::nullCheck(this__106945)->FMGL(layout_stride1)))) + (::x10aux::nullCheck(pt__106939)->x10::lang::Point::__apply(
                                                                                                                        ((x10_long)1ll))))) - (::x10aux::nullCheck(this__106945)->FMGL(layout_min1)));
              
              //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
              x10_long i__106291max__107373 = ((::x10aux::nullCheck(pt__106939)->FMGL(rank)) - (((x10_long)1ll)));
              {
                  x10_long i__107374;
                  for (i__107374 = ((x10_long)2ll); ((i__107374) <= (i__106291max__107373));
                       i__107374 = ((i__107374) + (((x10_long)1ll))))
                  {
                      x10_long i__107375 = i__107374;
                      
                      //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      offset__107376 = ((((((offset__107376) * (::x10aux::nullCheck(::x10aux::nullCheck(this__106945)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                  ((((x10_long)2ll)) * (((i__107375) - (((x10_long)2ll))))))))) + (::x10aux::nullCheck(pt__106939)->x10::lang::Point::__apply(
                                                                                                                                     i__107375)))) - (::x10aux::nullCheck(::x10aux::nullCheck(this__106945)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                                                                        ((((((x10_long)2ll)) * (((i__107375) - (((x10_long)2ll)))))) + (((x10_long)1ll))))));
                  }
              }
              
          }
          
          //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
          ret__106946 = offset__107376;
          ret__106946;
      }))
      , v);
    
    //#line 641 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    return v;
    
}

//#line 650 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> void x10::regionarray::Array<TPMGL(T)>::fill(
  TPMGL(T) v) {
    
    //#line 651 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    if (this->FMGL(rect)) {
        
        //#line 654 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::fill(
          v);
    } else {
        
        //#line 656 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        {
            ::x10::lang::Iterator< ::x10::lang::Point*>* p__106277;
            for (p__106277 = this->FMGL(region)->iterator();
                 ::x10::lang::Iterator< ::x10::lang::Point*>::hasNext(::x10aux::nullCheck(p__106277));
                 ) {
                ::x10::lang::Point* p = ::x10::lang::Iterator< ::x10::lang::Point*>::next(::x10aux::nullCheck(p__106277));
                
                //#line 657 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__set(
                  (__extension__ ({
                      ::x10::regionarray::Array<TPMGL(T)>* this__106954 =
                        this;
                      
                      //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      ::x10::lang::Point* pt__106948 = p;
                      x10_long ret__106955;
                      
                      //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      x10_long offset__107380 = ((::x10aux::nullCheck(pt__106948)->x10::lang::Point::__apply(
                                                    ((x10_long)(((x10_int)0))))) - (::x10aux::nullCheck(this__106954)->FMGL(layout_min0)));
                      
                      //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      if (((::x10aux::nullCheck(pt__106948)->FMGL(rank)) > (((x10_long)1ll))))
                      {
                          
                          //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                          offset__107380 = ((((((offset__107380) * (::x10aux::nullCheck(this__106954)->FMGL(layout_stride1)))) + (::x10aux::nullCheck(pt__106948)->x10::lang::Point::__apply(
                                                                                                                                    ((x10_long)1ll))))) - (::x10aux::nullCheck(this__106954)->FMGL(layout_min1)));
                          
                          //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                          x10_long i__106291max__107377 =
                            ((::x10aux::nullCheck(pt__106948)->FMGL(rank)) - (((x10_long)1ll)));
                          {
                              x10_long i__107378;
                              for (i__107378 = ((x10_long)2ll);
                                   ((i__107378) <= (i__106291max__107377));
                                   i__107378 = ((i__107378) + (((x10_long)1ll))))
                              {
                                  x10_long i__107379 = i__107378;
                                  
                                  //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                  offset__107380 = ((((((offset__107380) * (::x10aux::nullCheck(::x10aux::nullCheck(this__106954)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                              ((((x10_long)2ll)) * (((i__107379) - (((x10_long)2ll))))))))) + (::x10aux::nullCheck(pt__106948)->x10::lang::Point::__apply(
                                                                                                                                                 i__107379)))) - (::x10aux::nullCheck(::x10aux::nullCheck(this__106954)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                                                                                    ((((((x10_long)2ll)) * (((i__107379) - (((x10_long)2ll)))))) + (((x10_long)1ll))))));
                              }
                          }
                          
                      }
                      
                      //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      ret__106955 = offset__107380;
                      ret__106955;
                  }))
                  , v);
            }
        }
        
    }
    
}

//#line 667 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> void x10::regionarray::Array<TPMGL(T)>::clear(
  ) {
    
    //#line 668 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::clear(
      ((x10_long)0ll), (x10_long)(::x10aux::nullCheck(this->FMGL(raw))->FMGL(size)));
}

//#line 684 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 702 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 733 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 754 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 772 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 804 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 825 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 854 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 872 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 903 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 934 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 978 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 1006 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 1037 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 1081 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 1099 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 1121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 1154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 1161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 1164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 1167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 1170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 1173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 1184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 1185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 1186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 1194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"

//#line 1197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> x10_long x10::regionarray::Array<TPMGL(T)>::offset(
  x10_long i0) {
    return ((i0) - (this->FMGL(layout_min0)));
    
}

//#line 1200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> x10_long x10::regionarray::Array<TPMGL(T)>::offset(
  x10_long i0, x10_long i1) {
    
    //#line 1201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long offset = ((i0) - (this->FMGL(layout_min0)));
    
    //#line 1202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    offset = ((((((offset) * (this->FMGL(layout_stride1)))) + (i1))) - (this->FMGL(layout_min1)));
    
    //#line 1203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    return offset;
    
}

//#line 1206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> x10_long x10::regionarray::Array<TPMGL(T)>::offset(
  x10_long i0, x10_long i1, x10_long i2) {
    
    //#line 1207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long offset = ((i0) - (this->FMGL(layout_min0)));
    
    //#line 1208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    offset = ((((((offset) * (this->FMGL(layout_stride1)))) + (i1))) - (this->FMGL(layout_min1)));
    
    //#line 1209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    offset = ((((((offset) * (::x10aux::nullCheck(this->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                ((x10_long)0ll))))) + (i2))) - (::x10aux::nullCheck(this->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                  ((x10_long)1ll))));
    
    //#line 1210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    return offset;
    
}

//#line 1213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> x10_long x10::regionarray::Array<TPMGL(T)>::offset(
  x10_long i0, x10_long i1, x10_long i2, x10_long i3) {
    
    //#line 1214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long offset = ((i0) - (this->FMGL(layout_min0)));
    
    //#line 1215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    offset = ((((((offset) * (this->FMGL(layout_stride1)))) + (i1))) - (this->FMGL(layout_min1)));
    
    //#line 1216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    offset = ((((((offset) * (::x10aux::nullCheck(this->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                ((x10_long)0ll))))) + (i2))) - (::x10aux::nullCheck(this->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                  ((x10_long)1ll))));
    
    //#line 1217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    offset = ((((((offset) * (::x10aux::nullCheck(this->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                ((x10_long)2ll))))) + (i3))) - (::x10aux::nullCheck(this->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                  ((x10_long)3ll))));
    
    //#line 1218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    return offset;
    
}

//#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> x10_long x10::regionarray::Array<TPMGL(T)>::offset(
  ::x10::lang::Point* pt) {
    
    //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long offset = ((::x10aux::nullCheck(pt)->x10::lang::Point::__apply(
                          ((x10_long)(((x10_int)0))))) - (this->FMGL(layout_min0)));
    
    //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    if (((::x10aux::nullCheck(pt)->FMGL(rank)) > (((x10_long)1ll))))
    {
        
        //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        offset = ((((((offset) * (this->FMGL(layout_stride1)))) + (::x10aux::nullCheck(pt)->x10::lang::Point::__apply(
                                                                     ((x10_long)1ll))))) - (this->FMGL(layout_min1)));
        
        //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        x10_long i__106291max__107614 = ((::x10aux::nullCheck(pt)->FMGL(rank)) - (((x10_long)1ll)));
        {
            x10_long i__107615;
            for (i__107615 = ((x10_long)2ll); ((i__107615) <= (i__106291max__107614));
                 i__107615 = ((i__107615) + (((x10_long)1ll))))
            {
                x10_long i__107616 = i__107615;
                
                //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                offset = ((((((offset) * (::x10aux::nullCheck(this->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                            ((((x10_long)2ll)) * (((i__107616) - (((x10_long)2ll))))))))) + (::x10aux::nullCheck(pt)->x10::lang::Point::__apply(
                                                                                                               i__107616)))) - (::x10aux::nullCheck(this->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                                                  ((((((x10_long)2ll)) * (((i__107616) - (((x10_long)2ll)))))) + (((x10_long)1ll))))));
            }
        }
        
    }
    
    //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    return offset;
    
}

//#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
template<class TPMGL(T)> ::x10::regionarray::Array<TPMGL(T)>*
  x10::regionarray::Array<TPMGL(T)>::x10__regionarray__Array____this__x10__regionarray__Array(
  ) {
    return this;
    
}
template<class TPMGL(T)> void x10::regionarray::Array<TPMGL(T)>::__fieldInitializers_x10_regionarray_Array(
  ) {
 
}
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10::regionarray::Array<TPMGL(T)>::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::Array<TPMGL(T)>::_deserializer);

template<class TPMGL(T)> void x10::regionarray::Array<TPMGL(T)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(raw));
    buf.write(this->FMGL(layout_min0));
    buf.write(this->FMGL(layout_stride1));
    buf.write(this->FMGL(layout_min1));
    buf.write(this->FMGL(layout));
    buf.write(this->FMGL(region));
    buf.write(this->FMGL(rank));
    buf.write(this->FMGL(rect));
    buf.write(this->FMGL(zeroBased));
    buf.write(this->FMGL(rail));
    buf.write(this->FMGL(size));
    
}

template<class TPMGL(T)> ::x10::lang::Reference* ::x10::regionarray::Array<TPMGL(T)>::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::Array<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::regionarray::Array<TPMGL(T)> >()) ::x10::regionarray::Array<TPMGL(T)>();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

template<class TPMGL(T)> void x10::regionarray::Array<TPMGL(T)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(raw) = buf.read< ::x10::lang::Rail< TPMGL(T) >*>();
    FMGL(layout_min0) = buf.read<x10_long>();
    FMGL(layout_stride1) = buf.read<x10_long>();
    FMGL(layout_min1) = buf.read<x10_long>();
    FMGL(layout) = buf.read< ::x10::lang::Rail< x10_long >*>();
    FMGL(region) = buf.read< ::x10::regionarray::Region*>();
    FMGL(rank) = buf.read<x10_long>();
    FMGL(rect) = buf.read<x10_boolean>();
    FMGL(zeroBased) = buf.read<x10_boolean>();
    FMGL(rail) = buf.read<x10_boolean>();
    FMGL(size) = buf.read<x10_long>();
}

template<class TPMGL(T)> void x10::regionarray::Array<void>::asyncCopy(::x10::regionarray::Array<TPMGL(T)>* src,
                                                                       ::x10::regionarray::RemoteArray<TPMGL(T)>* dst) {
    
    //#line 904 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::lang::Rail< void >::template asyncCopy< TPMGL(T) >(
      ::x10aux::nullCheck(src)->FMGL(raw), ((x10_long)0ll),
      ::x10aux::nullCheck(dst)->FMGL(rawData), ((x10_long)0ll),
      (x10_long)(::x10aux::nullCheck(::x10aux::nullCheck(src)->FMGL(raw))->FMGL(size)));
}
template<class TPMGL(T)> void x10::regionarray::Array<void>::asyncCopy(::x10::regionarray::Array<TPMGL(T)>* src,
                                                                       ::x10::lang::Point* srcPoint,
                                                                       ::x10::regionarray::RemoteArray<TPMGL(T)>* dst,
                                                                       ::x10::lang::Point* dstPoint,
                                                                       x10_long numElems) {
    
    //#line 937 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::lang::GlobalRef< ::x10::regionarray::Array<TPMGL(T)>* > gra =
      ::x10aux::nullCheck(dst)->FMGL(array);
    
    //#line 938 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long dstIndex = ::x10::lang::Runtime::template evalAt< x10_long >(
                          ::x10::lang::Place::place(((x10_long)((gra)->location))),
                          reinterpret_cast< ::x10::lang::Fun_0_0<x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0<x10_long> >(sizeof(x10_regionarray_Array__closure__1<TPMGL(T)>)))x10_regionarray_Array__closure__1<TPMGL(T)>(gra, dstPoint))),
                          ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 978 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array<TPMGL(T)>* src__107599 = src;
    x10_long srcIndex__107600 = ::x10aux::nullCheck(src)->FMGL(region)->indexOf(
                                  srcPoint);
    
    //#line 979 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::RemoteArray<TPMGL(T)>* dst__107601 =
      dst;
    x10_long dstIndex__107602 = dstIndex;
    
    //#line 980 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long numElems__107603 = numElems;
    
    //#line 981 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::lang::Rail< void >::template asyncCopy< TPMGL(T) >(
      ::x10aux::nullCheck(src__107599)->FMGL(raw), srcIndex__107600,
      ::x10aux::nullCheck(dst__107601)->FMGL(rawData), dstIndex__107602,
      numElems__107603);
}
template<class TPMGL(T)> void x10::regionarray::Array<void>::asyncCopy(::x10::regionarray::Array<TPMGL(T)>* src,
                                                                       x10_long srcIndex,
                                                                       ::x10::regionarray::RemoteArray<TPMGL(T)>* dst,
                                                                       x10_long dstIndex,
                                                                       x10_long numElems) {
    
    //#line 981 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::lang::Rail< void >::template asyncCopy< TPMGL(T) >(
      ::x10aux::nullCheck(src)->FMGL(raw), srcIndex, ::x10aux::nullCheck(dst)->FMGL(rawData),
      dstIndex, numElems);
}
template<class TPMGL(T)> void x10::regionarray::Array<void>::asyncCopy(::x10::regionarray::RemoteArray<TPMGL(T)>* src,
                                                                       ::x10::regionarray::Array<TPMGL(T)>* dst) {
    
    //#line 1007 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::lang::Rail< void >::template asyncCopy< TPMGL(T) >(
      ::x10aux::nullCheck(src)->FMGL(rawData), ((x10_long)0ll),
      ::x10aux::nullCheck(dst)->FMGL(raw), ((x10_long)0ll),
      (x10_long)(::x10aux::nullCheck(::x10aux::nullCheck(dst)->FMGL(raw))->FMGL(size)));
}
template<class TPMGL(T)> void x10::regionarray::Array<void>::asyncCopy(::x10::regionarray::RemoteArray<TPMGL(T)>* src,
                                                                       ::x10::lang::Point* srcPoint,
                                                                       ::x10::regionarray::Array<TPMGL(T)>* dst,
                                                                       ::x10::lang::Point* dstPoint,
                                                                       x10_long numElems) {
    
    //#line 1040 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::lang::GlobalRef< ::x10::regionarray::Array<TPMGL(T)>* > gra =
      ::x10aux::nullCheck(src)->FMGL(array);
    
    //#line 1041 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long srcIndex = ::x10::lang::Runtime::template evalAt< x10_long >(
                          ::x10::lang::Place::place(((x10_long)((gra)->location))),
                          reinterpret_cast< ::x10::lang::Fun_0_0<x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0<x10_long> >(sizeof(x10_regionarray_Array__closure__2<TPMGL(T)>)))x10_regionarray_Array__closure__2<TPMGL(T)>(gra, srcPoint))),
                          ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 1081 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::RemoteArray<TPMGL(T)>* src__107604 =
      src;
    x10_long srcIndex__107605 = srcIndex;
    
    //#line 1082 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array<TPMGL(T)>* dst__107606 = dst;
    x10_long dstIndex__107607 = ::x10aux::nullCheck(dst)->FMGL(region)->indexOf(
                                  dstPoint);
    
    //#line 1083 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long numElems__107608 = numElems;
    
    //#line 1084 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::lang::Rail< void >::template asyncCopy< TPMGL(T) >(
      ::x10aux::nullCheck(src__107604)->FMGL(rawData), srcIndex__107605,
      ::x10aux::nullCheck(dst__107606)->FMGL(raw), dstIndex__107607,
      numElems__107608);
}
template<class TPMGL(T)> void x10::regionarray::Array<void>::asyncCopy(::x10::regionarray::RemoteArray<TPMGL(T)>* src,
                                                                       x10_long srcIndex,
                                                                       ::x10::regionarray::Array<TPMGL(T)>* dst,
                                                                       x10_long dstIndex,
                                                                       x10_long numElems) {
    
    //#line 1084 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::lang::Rail< void >::template asyncCopy< TPMGL(T) >(
      ::x10aux::nullCheck(src)->FMGL(rawData), srcIndex, ::x10aux::nullCheck(dst)->FMGL(raw),
      dstIndex, numElems);
}
template<class TPMGL(T)> void x10::regionarray::Array<void>::copy(::x10::regionarray::Array<TPMGL(T)>* src,
                                                                  ::x10::regionarray::Array<TPMGL(T)>* dst) {
    
    //#line 1100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::lang::Rail< void >::template copy< TPMGL(T) >(
      ::x10aux::nullCheck(src)->FMGL(raw), ((x10_long)0ll),
      ::x10aux::nullCheck(dst)->FMGL(raw), ((x10_long)0ll),
      (x10_long)(::x10aux::nullCheck(::x10aux::nullCheck(src)->FMGL(raw))->FMGL(size)));
}
template<class TPMGL(T)> void x10::regionarray::Array<void>::copy(::x10::regionarray::Array<TPMGL(T)>* src,
                                                                  ::x10::lang::Point* srcPoint,
                                                                  ::x10::regionarray::Array<TPMGL(T)>* dst,
                                                                  ::x10::lang::Point* dstPoint,
                                                                  x10_long numElems) {
    
    //#line 1154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array<TPMGL(T)>* src__107609 = src;
    x10_long srcIndex__107610 = ::x10aux::nullCheck(src)->FMGL(region)->indexOf(
                                  srcPoint);
    
    //#line 1155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::Array<TPMGL(T)>* dst__107611 = dst;
    x10_long dstIndex__107612 = ::x10aux::nullCheck(dst)->FMGL(region)->indexOf(
                                  dstPoint);
    
    //#line 1156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long numElems__107613 = numElems;
    
    //#line 1157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::lang::Rail< void >::template copy< TPMGL(T) >(
      ::x10aux::nullCheck(src__107609)->FMGL(raw), srcIndex__107610,
      ::x10aux::nullCheck(dst__107611)->FMGL(raw), dstIndex__107612,
      numElems__107613);
}
template<class TPMGL(T)> void x10::regionarray::Array<void>::copy(::x10::regionarray::Array<TPMGL(T)>* src,
                                                                  x10_long srcIndex,
                                                                  ::x10::regionarray::Array<TPMGL(T)>* dst,
                                                                  x10_long dstIndex,
                                                                  x10_long numElems) {
    
    //#line 1157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::lang::Rail< void >::template copy< TPMGL(T) >(
      ::x10aux::nullCheck(src)->FMGL(raw), srcIndex, ::x10aux::nullCheck(dst)->FMGL(raw),
      dstIndex, numElems);
}
#endif // X10_REGIONARRAY_ARRAY_H_IMPLEMENTATION
#endif // __X10_REGIONARRAY_ARRAY_H_NODEPS
