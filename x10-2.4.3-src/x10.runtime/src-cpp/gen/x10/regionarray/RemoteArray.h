#ifndef __X10_REGIONARRAY_REMOTEARRAY_H
#define __X10_REGIONARRAY_REMOTEARRAY_H

#include <x10rt.h>


#define X10_LANG_GLOBALRAIL_H_NODEPS
#include <x10/lang/GlobalRail.h>
#undef X10_LANG_GLOBALRAIL_H_NODEPS
#define X10_LANG_GLOBALRAIL_H_NODEPS
#include <x10/lang/GlobalRail.h>
#undef X10_LANG_GLOBALRAIL_H_NODEPS
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
namespace x10 { namespace regionarray { 
class Region;
} } 
namespace x10 { namespace regionarray { 
template<class TPMGL(T)> class Array;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace lang { 
class Point;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace regionarray { 

template<class TPMGL(T)> class RemoteArray;
template <> class RemoteArray<void>;
template<class TPMGL(T)> class RemoteArray : public ::x10::lang::X10Class
  {
    public:
    RTT_H_DECLS_CLASS
    
    ::x10::regionarray::Region* FMGL(region);
    
    x10_long FMGL(size);
    
    ::x10::lang::GlobalRef< ::x10::regionarray::Array<TPMGL(T)>* > FMGL(array);
    
    ::x10::lang::GlobalRail<TPMGL(T)> FMGL(rawData);
    
    x10_long rank();
    ::x10::lang::Place home();
    void _constructor(::x10::regionarray::Array<TPMGL(T)>* a);
    
    static ::x10::regionarray::RemoteArray<TPMGL(T)>* _make(::x10::regionarray::Array<TPMGL(T)>* a);
    
    virtual TPMGL(T) __apply(x10_int i);
    virtual TPMGL(T) __apply(::x10::lang::Point* p);
    virtual TPMGL(T) __set(x10_int i, TPMGL(T) v);
    virtual TPMGL(T) __set(::x10::lang::Point* p, TPMGL(T) v);
    virtual ::x10::regionarray::Array<TPMGL(T)>* __apply();
    virtual x10_boolean equals(::x10::lang::Any* other);
    virtual x10_int hashCode();
    virtual ::x10::regionarray::RemoteArray<TPMGL(T)>* x10__regionarray__RemoteArray____this__x10__regionarray__RemoteArray(
      );
    virtual void __fieldInitializers_x10_regionarray_RemoteArray(
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

template<class TPMGL(T)> ::x10aux::RuntimeType x10::regionarray::RemoteArray<TPMGL(T)>::rtt;
template<class TPMGL(T)> void x10::regionarray::RemoteArray<TPMGL(T)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::regionarray::RemoteArray<void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    const ::x10aux::RuntimeType* params[1] = { ::x10aux::getRTT<TPMGL(T)>()};
    ::x10aux::RuntimeType::Variance variances[1] = { ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.regionarray.RemoteArray";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 0, parents, 1, params, variances);
}

template <> class RemoteArray<void> : public ::x10::lang::X10Class
{
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    
};

} } 
#endif // X10_REGIONARRAY_REMOTEARRAY_H

namespace x10 { namespace regionarray { 
template<class TPMGL(T)> class RemoteArray;
} } 

#ifndef X10_REGIONARRAY_REMOTEARRAY_H_NODEPS
#define X10_REGIONARRAY_REMOTEARRAY_H_NODEPS
#include <x10/lang/GlobalRail.h>
#include <x10/lang/Long.h>
#include <x10/lang/GlobalRef.h>
#include <x10/regionarray/Region.h>
#include <x10/regionarray/Array.h>
#include <x10/lang/Place.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Int.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Point.h>
#include <x10/lang/Any.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_REGIONARRAY_REMOTEARRAY_H_GENERICS
#define X10_REGIONARRAY_REMOTEARRAY_H_GENERICS
#endif // X10_REGIONARRAY_REMOTEARRAY_H_GENERICS
#ifndef X10_REGIONARRAY_REMOTEARRAY_H_IMPLEMENTATION
#define X10_REGIONARRAY_REMOTEARRAY_H_IMPLEMENTATION
#include <x10/regionarray/RemoteArray.h>


//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"

//#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"

//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"

//#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
/**
     * Caches a remote reference to the backing storage for the remote array
     * to enable DMA operations to be initiated remotely.  
     */

//#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
template<class TPMGL(T)> x10_long x10::regionarray::RemoteArray<TPMGL(T)>::rank(
  ) {
    return ::x10aux::nullCheck(this->FMGL(region))->FMGL(rank);
    
}

//#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
template<class TPMGL(T)> ::x10::lang::Place x10::regionarray::RemoteArray<TPMGL(T)>::home(
  ) {
    return ::x10::lang::Place::place((this->FMGL(array))->location);
    
}

//#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
template<class TPMGL(T)> void x10::regionarray::RemoteArray<TPMGL(T)>::_constructor(
                           ::x10::regionarray::Array<TPMGL(T)>* a) {
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
    FMGL(region) = a->FMGL(region);
    FMGL(size) = a->FMGL(size);
    FMGL(array) = ::x10::lang::GlobalRef< ::x10::regionarray::Array<TPMGL(T)>* >(a);
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
    ::x10::regionarray::RemoteArray<TPMGL(T)>* this__116735 =
      this;
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
    this->FMGL(rawData) = (__extension__ ({
        ::x10::lang::GlobalRail<TPMGL(T)> alloc__116694 =
           ::x10::lang::GlobalRail<TPMGL(T)>::_alloc();
        (alloc__116694)->::x10::lang::GlobalRail<TPMGL(T)>::_constructor(
          a->FMGL(raw));
        alloc__116694;
    }))
    ;
}
template<class TPMGL(T)> ::x10::regionarray::RemoteArray<TPMGL(T)>* x10::regionarray::RemoteArray<TPMGL(T)>::_make(
                           ::x10::regionarray::Array<TPMGL(T)>* a)
{
    ::x10::regionarray::RemoteArray<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::regionarray::RemoteArray<TPMGL(T)> >()) ::x10::regionarray::RemoteArray<TPMGL(T)>();
    this_->_constructor(a);
    return this_;
}



//#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
template<class TPMGL(T)> TPMGL(T) x10::regionarray::RemoteArray<TPMGL(T)>::__apply(
  x10_int i) {
    ::x10::regionarray::Array<TPMGL(T)>* this__116736 = this->x10::regionarray::template RemoteArray<TPMGL(T)>::__apply();
    
    //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long i__116737 = ((x10_long)(i));
    
    //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    TPMGL(T) ret__116738;
    goto __ret__116739; __ret__116739: {
    {
        
        //#line 444 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        if (::x10aux::nullCheck(this__116736)->FMGL(rail))
        {
            
            //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret__116738 = ::x10aux::nullCheck(this__116736)->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__apply(
                            i__116737);
            goto __ret__116739_end_;
        } else {
            
            //#line 451 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret__116738 = ::x10aux::nullCheck(this__116736)->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__apply(
                            ((i__116737) - (::x10aux::nullCheck(this__116736)->FMGL(layout_min0))));
            goto __ret__116739_end_;
        }
        
    }goto __ret__116739_end_; __ret__116739_end_: ;
    }
    
    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
    return ret__116738;
    }
    

//#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
template<class TPMGL(T)> TPMGL(T) x10::regionarray::RemoteArray<TPMGL(T)>::__apply(
  ::x10::lang::Point* p) {
    ::x10::regionarray::Array<TPMGL(T)>* this__116746 = this->x10::regionarray::template RemoteArray<TPMGL(T)>::__apply();
    
    //#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::lang::Point* pt__116747 = p;
    TPMGL(T) ret__116748;
    
    //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ret__116748 = ::x10aux::nullCheck(this__116746)->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__apply(
                    (__extension__ ({
                        
                        //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        ::x10::lang::Point* pt__116744 = pt__116747;
                        x10_long ret__116745;
                        
                        //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        x10_long offset__116743 = ((::x10aux::nullCheck(pt__116744)->x10::lang::Point::__apply(
                                                      ((x10_long)(((x10_int)0))))) - (::x10aux::nullCheck(this__116746)->FMGL(layout_min0)));
                        
                        //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        if (((::x10aux::nullCheck(pt__116744)->FMGL(rank)) > (((x10_long)1ll))))
                        {
                            
                            //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            offset__116743 = ((((((offset__116743) * (::x10aux::nullCheck(this__116746)->FMGL(layout_stride1)))) + (::x10aux::nullCheck(pt__116744)->x10::lang::Point::__apply(
                                                                                                                                      ((x10_long)1ll))))) - (::x10aux::nullCheck(this__116746)->FMGL(layout_min1)));
                            
                            //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                            x10_long i__106291max__116740 =
                              ((::x10aux::nullCheck(pt__116744)->FMGL(rank)) - (((x10_long)1ll)));
                            {
                                x10_long i__116741;
                                for (i__116741 = ((x10_long)2ll);
                                     ((i__116741) <= (i__106291max__116740));
                                     i__116741 = ((i__116741) + (((x10_long)1ll))))
                                {
                                    x10_long i__116742 = i__116741;
                                    
                                    //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                                    offset__116743 = ((((((offset__116743) * (::x10aux::nullCheck(::x10aux::nullCheck(this__116746)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                ((((x10_long)2ll)) * (((i__116742) - (((x10_long)2ll))))))))) + (::x10aux::nullCheck(pt__116744)->x10::lang::Point::__apply(
                                                                                                                                                   i__116742)))) - (::x10aux::nullCheck(::x10aux::nullCheck(this__116746)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                                                                                      ((((((x10_long)2ll)) * (((i__116742) - (((x10_long)2ll)))))) + (((x10_long)1ll))))));
                                }
                            }
                            
                        }
                        
                        //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                        ret__116745 = offset__116743;
                        ret__116745;
                    }))
                    );
    
    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
    return ret__116748;
    
}

//#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
template<class TPMGL(T)> TPMGL(T) x10::regionarray::RemoteArray<TPMGL(T)>::__set(
  x10_int i, TPMGL(T) v) {
    ::x10::regionarray::Array<TPMGL(T)>* this__116749 = this->x10::regionarray::template RemoteArray<TPMGL(T)>::__apply();
    
    //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long i__116750 = ((x10_long)(i));
    TPMGL(T) v__116751 = v;
    
    //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    TPMGL(T) ret__116752;
    
    //#line 545 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    if (::x10aux::nullCheck(this__116749)->FMGL(rail)) {
        
        //#line 547 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ::x10aux::nullCheck(this__116749)->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__set(
          i__116750, v__116751);
    } else {
        
        //#line 552 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ::x10aux::nullCheck(this__116749)->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__set(
          ((i__116750) - (::x10aux::nullCheck(this__116749)->FMGL(layout_min0))),
          v__116751);
    }
    
    //#line 554 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ret__116752 = v__116751;
    
    //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
    return ret__116752;
    
}

//#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
template<class TPMGL(T)> TPMGL(T) x10::regionarray::RemoteArray<TPMGL(T)>::__set(
  ::x10::lang::Point* p, TPMGL(T) v) {
    
    //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
    ::x10::regionarray::Array<TPMGL(T)>* this__116759 = this->x10::regionarray::template RemoteArray<TPMGL(T)>::__apply();
    
    //#line 636 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::lang::Point* p__116760 = p;
    TPMGL(T) v__116761 = v;
    TPMGL(T) ret__116762;
    
    //#line 640 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10aux::nullCheck(this__116759)->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__set(
      (__extension__ ({
          
          //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
          ::x10::lang::Point* pt__116757 = p__116760;
          x10_long ret__116758;
          
          //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
          x10_long offset__116756 = ((::x10aux::nullCheck(pt__116757)->x10::lang::Point::__apply(
                                        ((x10_long)(((x10_int)0))))) - (::x10aux::nullCheck(this__116759)->FMGL(layout_min0)));
          
          //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
          if (((::x10aux::nullCheck(pt__116757)->FMGL(rank)) > (((x10_long)1ll))))
          {
              
              //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
              offset__116756 = ((((((offset__116756) * (::x10aux::nullCheck(this__116759)->FMGL(layout_stride1)))) + (::x10aux::nullCheck(pt__116757)->x10::lang::Point::__apply(
                                                                                                                        ((x10_long)1ll))))) - (::x10aux::nullCheck(this__116759)->FMGL(layout_min1)));
              
              //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
              x10_long i__106291max__116753 = ((::x10aux::nullCheck(pt__116757)->FMGL(rank)) - (((x10_long)1ll)));
              {
                  x10_long i__116754;
                  for (i__116754 = ((x10_long)2ll); ((i__116754) <= (i__106291max__116753));
                       i__116754 = ((i__116754) + (((x10_long)1ll))))
                  {
                      x10_long i__116755 = i__116754;
                      
                      //#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
                      offset__116756 = ((((((offset__116756) * (::x10aux::nullCheck(::x10aux::nullCheck(this__116759)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                  ((((x10_long)2ll)) * (((i__116755) - (((x10_long)2ll))))))))) + (::x10aux::nullCheck(pt__116757)->x10::lang::Point::__apply(
                                                                                                                                     i__116755)))) - (::x10aux::nullCheck(::x10aux::nullCheck(this__116759)->FMGL(layout))->x10::lang::template Rail< x10_long >::__apply(
                                                                                                                                                        ((((((x10_long)2ll)) * (((i__116755) - (((x10_long)2ll)))))) + (((x10_long)1ll))))));
                  }
              }
              
          }
          
          //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
          ret__116758 = offset__116756;
          ret__116758;
      }))
      , v__116761);
    
    //#line 641 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ret__116762 = v__116761;
    
    //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
    return ret__116762;
    
}

//#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
template<class TPMGL(T)> ::x10::regionarray::Array<TPMGL(T)>*
  x10::regionarray::RemoteArray<TPMGL(T)>::__apply() {
    return (this->FMGL(array))->__apply();
    
}

//#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
template<class TPMGL(T)> x10_boolean x10::regionarray::RemoteArray<TPMGL(T)>::equals(
  ::x10::lang::Any* other) {
    
    //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
    if (!(::x10aux::instanceof< ::x10::regionarray::RemoteArray<TPMGL(T)>*>(other)))
    {
        return false;
        
    }
    
    //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
    ::x10::regionarray::RemoteArray<TPMGL(T)>* oRA = ::x10aux::class_cast< ::x10::regionarray::RemoteArray<TPMGL(T)>*>(other);
    
    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
    return (::x10aux::nullCheck(oRA)->FMGL(array))->equals(::x10aux::class_cast_unchecked< ::x10::lang::Any*>(this->FMGL(array)));
    
}

//#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
template<class TPMGL(T)> x10_int x10::regionarray::RemoteArray<TPMGL(T)>::hashCode(
  ) {
    return (this->FMGL(array))->hashCode();
    
}

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RemoteArray.x10"
template<class TPMGL(T)> ::x10::regionarray::RemoteArray<TPMGL(T)>*
  x10::regionarray::RemoteArray<TPMGL(T)>::x10__regionarray__RemoteArray____this__x10__regionarray__RemoteArray(
  ) {
    return this;
    
}
template<class TPMGL(T)> void x10::regionarray::RemoteArray<TPMGL(T)>::__fieldInitializers_x10_regionarray_RemoteArray(
  ) {
 
}
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10::regionarray::RemoteArray<TPMGL(T)>::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::RemoteArray<TPMGL(T)>::_deserializer);

template<class TPMGL(T)> void x10::regionarray::RemoteArray<TPMGL(T)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(rawData));
    buf.write(this->FMGL(region));
    buf.write(this->FMGL(size));
    buf.write(this->FMGL(array));
    
}

template<class TPMGL(T)> ::x10::lang::Reference* ::x10::regionarray::RemoteArray<TPMGL(T)>::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::RemoteArray<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::regionarray::RemoteArray<TPMGL(T)> >()) ::x10::regionarray::RemoteArray<TPMGL(T)>();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

template<class TPMGL(T)> void x10::regionarray::RemoteArray<TPMGL(T)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(rawData) = buf.read< ::x10::lang::GlobalRail<TPMGL(T)> >();
    FMGL(region) = buf.read< ::x10::regionarray::Region*>();
    FMGL(size) = buf.read<x10_long>();
    FMGL(array) = buf.read< ::x10::lang::GlobalRef< ::x10::regionarray::Array<TPMGL(T)>* > >();
}

#endif // X10_REGIONARRAY_REMOTEARRAY_H_IMPLEMENTATION
#endif // __X10_REGIONARRAY_REMOTEARRAY_H_NODEPS
