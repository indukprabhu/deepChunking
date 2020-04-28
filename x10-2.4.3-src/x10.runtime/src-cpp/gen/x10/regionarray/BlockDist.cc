/*************************************************/
/* START of BlockDist */
#include <x10/regionarray/BlockDist.h>

#include <x10/regionarray/Dist.h>
#include <x10/lang/Long.h>
#include <x10/lang/PlaceGroup.h>
#include <x10/regionarray/Region.h>
#include <x10/lang/Place.h>
#include <x10/lang/Boolean.h>
#include <x10/regionarray/RectRegion.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/regionarray/RectRegion1D.h>
#include <x10/regionarray/FullRegion.h>
#include <x10/lang/Iterable.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Point.h>
#include <x10/regionarray/WrappedDistRegionRestricted.h>
#include <x10/regionarray/WrappedDistPlaceRestricted.h>
#include <x10/lang/Any.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_REGIONARRAY_BLOCKDIST__CLOSURE__1_CLOSURE
#define X10_REGIONARRAY_BLOCKDIST__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_BlockDist__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_BlockDist__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ::x10aux::nullCheck(saved_this->FMGL(region))->min(i);
        
    }
    
    // captured environment
    ::x10::regionarray::BlockDist* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_BlockDist__closure__1* storage = ::x10aux::alloc_z<x10_regionarray_BlockDist__closure__1>();
        buf.record_reference(storage);
        ::x10::regionarray::BlockDist* that_saved_this = buf.read< ::x10::regionarray::BlockDist*>();
        x10_regionarray_BlockDist__closure__1* this_ = new (storage) x10_regionarray_BlockDist__closure__1(that_saved_this);
        return this_;
    }
    
    x10_regionarray_BlockDist__closure__1(::x10::regionarray::BlockDist* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10:74";
    }

};

#endif // X10_REGIONARRAY_BLOCKDIST__CLOSURE__1_CLOSURE
#ifndef X10_REGIONARRAY_BLOCKDIST__CLOSURE__2_CLOSURE
#define X10_REGIONARRAY_BLOCKDIST__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_BlockDist__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_BlockDist__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ::x10aux::nullCheck(saved_this->FMGL(region))->max(i);
        
    }
    
    // captured environment
    ::x10::regionarray::BlockDist* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_BlockDist__closure__2* storage = ::x10aux::alloc_z<x10_regionarray_BlockDist__closure__2>();
        buf.record_reference(storage);
        ::x10::regionarray::BlockDist* that_saved_this = buf.read< ::x10::regionarray::BlockDist*>();
        x10_regionarray_BlockDist__closure__2* this_ = new (storage) x10_regionarray_BlockDist__closure__2(that_saved_this);
        return this_;
    }
    
    x10_regionarray_BlockDist__closure__2(::x10::regionarray::BlockDist* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10:75";
    }

};

#endif // X10_REGIONARRAY_BLOCKDIST__CLOSURE__2_CLOSURE
#ifndef X10_REGIONARRAY_BLOCKDIST__CLOSURE__3_CLOSURE
#define X10_REGIONARRAY_BLOCKDIST__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_BlockDist__closure__3 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::Region*>::itable<x10_regionarray_BlockDist__closure__3> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::regionarray::Region* __apply(x10_long i) {
        return saved_this->x10::regionarray::BlockDist::blockRegionForPlace(
                 ::x10aux::nullCheck(saved_this->FMGL(pg))->__apply(i));
        
    }
    
    // captured environment
    ::x10::regionarray::BlockDist* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_BlockDist__closure__3* storage = ::x10aux::alloc_z<x10_regionarray_BlockDist__closure__3>();
        buf.record_reference(storage);
        ::x10::regionarray::BlockDist* that_saved_this = buf.read< ::x10::regionarray::BlockDist*>();
        x10_regionarray_BlockDist__closure__3* this_ = new (storage) x10_regionarray_BlockDist__closure__3(that_saved_this);
        return this_;
    }
    
    x10_regionarray_BlockDist__closure__3(::x10::regionarray::BlockDist* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::Region*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::Region*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10:122";
    }

};

#endif // X10_REGIONARRAY_BLOCKDIST__CLOSURE__3_CLOSURE
::x10::lang::Fun_0_1< ::x10::lang::Point*, ::x10::lang::Place>::itable< ::x10::regionarray::BlockDist >  x10::regionarray::BlockDist::_itable_0(&x10::regionarray::BlockDist::equals, &::x10::lang::X10Class::hashCode, &x10::regionarray::BlockDist::__apply, &::x10::regionarray::Dist::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::regionarray::BlockDist >  x10::regionarray::BlockDist::_itable_1(&x10::regionarray::BlockDist::equals, &::x10::lang::X10Class::hashCode, &::x10::regionarray::Dist::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Iterable< ::x10::lang::Point*>::itable< ::x10::regionarray::BlockDist >  x10::regionarray::BlockDist::_itable_2(&x10::regionarray::BlockDist::equals, &::x10::lang::X10Class::hashCode, &::x10::regionarray::Dist::iterator, &::x10::regionarray::Dist::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::regionarray::BlockDist::_itables[4] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::Point*, ::x10::lang::Place> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Point*> >, &_itable_2), ::x10aux::itable_entry(NULL, (void*)"::x10::regionarray::BlockDist")};

//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
/**
     * The place group for this distribution
     */

//#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
/**
     * The axis along which the region is being distributed
     */

//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
/**
     * Cached restricted region for the current place.
     */

//#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
void x10::regionarray::BlockDist::_constructor(::x10::regionarray::Region* r,
                                               x10_long axis, ::x10::lang::PlaceGroup* pg) {
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    ::x10::regionarray::Dist* this__111968 = this;
    
    //#line 659 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10::regionarray::Region* region__111969 = r;
    
    //#line 660 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10aux::nullCheck(this__111968)->FMGL(region) = region__111969;
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    ::x10::regionarray::BlockDist* this__111967 = this;
    ::x10aux::nullCheck(this__111967)->FMGL(regionForHere) = (::x10aux::class_cast_unchecked< ::x10::regionarray::Region*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    this->FMGL(axis) = axis;
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    this->FMGL(pg) = pg;
}
::x10::regionarray::BlockDist* x10::regionarray::BlockDist::_make(::x10::regionarray::Region* r,
                                                                  x10_long axis,
                                                                  ::x10::lang::PlaceGroup* pg)
{
    ::x10::regionarray::BlockDist* this_ = new (::x10aux::alloc_z< ::x10::regionarray::BlockDist>()) ::x10::regionarray::BlockDist();
    this_->_constructor(r, axis, pg);
    return this_;
}



//#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
::x10::regionarray::Region* x10::regionarray::BlockDist::blockRegionForPlace(
  ::x10::lang::Place place) {
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    ::x10::regionarray::Region* b = ::x10aux::nullCheck(this->FMGL(region))->boundingBox();
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    x10_long min = ::x10aux::nullCheck(b)->min(this->FMGL(axis));
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    x10_long max = ::x10aux::nullCheck(b)->max(this->FMGL(axis));
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    x10_long P = ::x10aux::nullCheck(this->FMGL(pg))->numPlaces();
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    x10_long numElems = ((((max) - (min))) + (((x10_long)1ll)));
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    x10_long blockSize = ((numElems) / ::x10aux::zeroCheck(P));
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    x10_long leftOver = ((numElems) - (((P) * (blockSize))));
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    x10_long i = ::x10aux::nullCheck(this->FMGL(pg))->indexOf(
                   place);
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    x10_long low = ((((min) + (((blockSize) * (i))))) + (((i) < (leftOver))
      ? (i) : (leftOver)));
    
    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    x10_long hi = ((((low) + (blockSize))) + (((i) < (leftOver))
      ? (((x10_long)0ll)) : (((x10_long)-1ll))));
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    if (::x10aux::instanceof< ::x10::regionarray::RectRegion*>(this->FMGL(region)))
    {
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        ::x10::lang::Rail< x10_long >* newMin = ::x10::lang::Rail< x10_long >::_make((__extension__ ({
                                                                                         ::x10::regionarray::Dist* this__111950 =
                                                                                           reinterpret_cast< ::x10::regionarray::Dist*>(this);
                                                                                         ::x10aux::nullCheck(::x10aux::nullCheck(this__111950)->FMGL(region))->FMGL(rank);
                                                                                     }))
                                                                                     ,
                                                                                     reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_BlockDist__closure__1)))x10_regionarray_BlockDist__closure__1(this))));
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        ::x10::lang::Rail< x10_long >* newMax = ::x10::lang::Rail< x10_long >::_make((__extension__ ({
                                                                                         ::x10::regionarray::Dist* this__111951 =
                                                                                           reinterpret_cast< ::x10::regionarray::Dist*>(this);
                                                                                         ::x10aux::nullCheck(::x10aux::nullCheck(this__111951)->FMGL(region))->FMGL(rank);
                                                                                     }))
                                                                                     ,
                                                                                     reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_BlockDist__closure__2)))x10_regionarray_BlockDist__closure__2(this))));
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        newMin->x10::lang::Rail< x10_long >::__set(this->FMGL(axis),
                                                   low);
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        newMax->x10::lang::Rail< x10_long >::__set(this->FMGL(axis),
                                                   hi);
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        return reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
            ::x10::regionarray::RectRegion* alloc__111938 =
               (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion>()) ::x10::regionarray::RectRegion());
            (alloc__111938)->::x10::regionarray::RectRegion::_constructor(
              newMin, newMax);
            alloc__111938;
        }))
        );
        
    } else 
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    if (::x10aux::instanceof< ::x10::regionarray::RectRegion1D*>(this->FMGL(region)))
    {
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        return ::x10aux::class_cast< ::x10::regionarray::Region*>((__extension__ ({
            ::x10::regionarray::RectRegion1D* alloc__111939 =
               (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
            (alloc__111939)->::x10::regionarray::RectRegion1D::_constructor(
              low, hi);
            alloc__111939;
        }))
        );
        
    } else {
        
        //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        ::x10::regionarray::Region* r1 = (__extension__ ({
            
            //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            x10_long rank__111952 = this->FMGL(axis);
            reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
                ::x10::regionarray::FullRegion* alloc__111953 =
                   (new (::x10aux::alloc_z< ::x10::regionarray::FullRegion>()) ::x10::regionarray::FullRegion());
                (alloc__111953)->::x10::regionarray::FullRegion::_constructor(
                  rank__111952);
                alloc__111953;
            }))
            );
        }))
        ;
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        ::x10::regionarray::Region* r2 = (__extension__ ({
            
            //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            x10_long min__111954 = low;
            x10_long max__111955 = hi;
            reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
                ::x10::regionarray::RectRegion1D* alloc__111956 =
                   (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
                (alloc__111956)->::x10::regionarray::RectRegion1D::_constructor(
                  min__111954, max__111955);
                alloc__111956;
            }))
            );
        }))
        ;
        
        //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        ::x10::regionarray::Region* r3 = (__extension__ ({
            
            //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            x10_long rank__111957 = ((((::x10aux::nullCheck(this->FMGL(region))->FMGL(rank)) - (this->FMGL(axis)))) - (((x10_long)1ll)));
            reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
                ::x10::regionarray::FullRegion* alloc__111958 =
                   (new (::x10aux::alloc_z< ::x10::regionarray::FullRegion>()) ::x10::regionarray::FullRegion());
                (alloc__111958)->::x10::regionarray::FullRegion::_constructor(
                  rank__111957);
                alloc__111958;
            }))
            );
        }))
        ;
        
        //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        return (r1->product(r2)->product(r3))->intersection(
                 this->FMGL(region));
        
    }
    
}

//#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
::x10::lang::Place x10::regionarray::BlockDist::mapIndexToPlace(
  x10_long index) {
    
    //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    ::x10::regionarray::Region* bb = ::x10aux::nullCheck(this->FMGL(region))->boundingBox();
    
    //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    x10_long min = ::x10aux::nullCheck(bb)->min(this->FMGL(axis));
    
    //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    x10_long max = ::x10aux::nullCheck(bb)->max(this->FMGL(axis));
    
    //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    x10_long P = ::x10aux::nullCheck(this->FMGL(pg))->numPlaces();
    
    //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    x10_long numElems = ((((max) - (min))) + (((x10_long)1ll)));
    
    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    x10_long blockSize = ((numElems) / ::x10aux::zeroCheck(P));
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    x10_long leftOver = ((numElems) - (((P) * (blockSize))));
    
    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    x10_long normalizedIndex = ((index) - (min));
    
    //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    x10_long nominalPlace = ((normalizedIndex) / ::x10aux::zeroCheck(((blockSize) + (((x10_long)1ll)))));
    
    //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    if (((nominalPlace) < (leftOver))) {
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        return ::x10aux::nullCheck(this->FMGL(pg))->__apply(
                 nominalPlace);
        
    } else {
        
        //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        x10_long indexFromTop = ((max) - (index));
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        return ::x10aux::nullCheck(this->FMGL(pg))->__apply(
                 ((((::x10aux::nullCheck(this->FMGL(pg))->numPlaces()) - (((x10_long)1ll)))) - (((indexFromTop) / ::x10aux::zeroCheck(blockSize)))));
        
    }
    
}

//#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
::x10::lang::PlaceGroup* x10::regionarray::BlockDist::places(
  ) {
    return this->FMGL(pg);
    
}

//#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
x10_long x10::regionarray::BlockDist::numPlaces() {
    return ::x10aux::nullCheck(this->FMGL(pg))->numPlaces();
    
}

//#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
::x10::lang::Iterable< ::x10::regionarray::Region*>* x10::regionarray::BlockDist::regions(
  ) {
    
    //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    return reinterpret_cast< ::x10::lang::Iterable< ::x10::regionarray::Region*>*>(::x10::lang::Rail< ::x10::regionarray::Region* >::_make(::x10aux::nullCheck(this->FMGL(pg))->numPlaces(),
                                                                                                                                           reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::Region*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::Region*> >(sizeof(x10_regionarray_BlockDist__closure__3)))x10_regionarray_BlockDist__closure__3(this)))));
    
}

//#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
::x10::regionarray::Region* x10::regionarray::BlockDist::get(
  ::x10::lang::Place p) {
    
    //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    if ((::x10aux::struct_equals(p, ::x10::lang::Place::_make(::x10aux::here))))
    {
        
        //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        if ((::x10aux::struct_equals(this->FMGL(regionForHere),
                                     reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
        {
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
            this->FMGL(regionForHere) = this->x10::regionarray::BlockDist::blockRegionForPlace(
                                          ::x10::lang::Place::_make(::x10aux::here));
        }
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        return this->FMGL(regionForHere);
        
    } else {
        
        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
        return this->x10::regionarray::BlockDist::blockRegionForPlace(
                 p);
        
    }
    
}

//#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
x10_boolean x10::regionarray::BlockDist::containsLocally(
  ::x10::lang::Point* p) {
    return ::x10aux::nullCheck(this->x10::regionarray::BlockDist::get(
                                 ::x10::lang::Place::_make(::x10aux::here)))->contains(
             p);
    
}

//#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
::x10::regionarray::Region* x10::regionarray::BlockDist::__apply(
  ::x10::lang::Place p) {
    return this->x10::regionarray::BlockDist::get(p);
    
}

//#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
::x10::lang::Place x10::regionarray::BlockDist::__apply(::x10::lang::Point* pt) {
    
    //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    return this->x10::regionarray::BlockDist::mapIndexToPlace(
             ::x10aux::nullCheck(pt)->x10::lang::Point::__apply(
               this->FMGL(axis)));
    
}

//#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
::x10::lang::Place x10::regionarray::BlockDist::__apply(x10_long i0) {
    
    //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    return this->x10::regionarray::BlockDist::mapIndexToPlace(
             i0);
    
}

//#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
::x10::lang::Place x10::regionarray::BlockDist::__apply(x10_long i0,
                                                        x10_long i1) {
    
    //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    return (::x10aux::struct_equals(this->FMGL(axis), ((x10_long)0ll)))
      ? (this->x10::regionarray::BlockDist::mapIndexToPlace(
           i0)) : (this->x10::regionarray::BlockDist::mapIndexToPlace(
                     i1));
    
}

//#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
::x10::lang::Place x10::regionarray::BlockDist::__apply(x10_long i0,
                                                        x10_long i1,
                                                        x10_long i2) {
    
    //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    if ((::x10aux::struct_equals(this->FMGL(axis), ((x10_long)0ll))))
    {
        return this->x10::regionarray::BlockDist::mapIndexToPlace(
                 i0);
        
    }
    
    //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    if ((::x10aux::struct_equals(this->FMGL(axis), ((x10_long)1ll))))
    {
        return this->x10::regionarray::BlockDist::mapIndexToPlace(
                 i1);
        
    }
    
    //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    return this->x10::regionarray::BlockDist::mapIndexToPlace(
             i2);
    
}

//#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
::x10::lang::Place x10::regionarray::BlockDist::__apply(x10_long i0,
                                                        x10_long i1,
                                                        x10_long i2,
                                                        x10_long i3) {
    
    //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    if ((::x10aux::struct_equals(this->FMGL(axis), ((x10_long)0ll))))
    {
        return this->x10::regionarray::BlockDist::mapIndexToPlace(
                 i0);
        
    }
    
    //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    if ((::x10aux::struct_equals(this->FMGL(axis), ((x10_long)1ll))))
    {
        return this->x10::regionarray::BlockDist::mapIndexToPlace(
                 i1);
        
    }
    
    //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    if ((::x10aux::struct_equals(this->FMGL(axis), ((x10_long)2ll))))
    {
        return this->x10::regionarray::BlockDist::mapIndexToPlace(
                 i2);
        
    }
    
    //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    return this->x10::regionarray::BlockDist::mapIndexToPlace(
             i3);
    
}

//#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
x10_long x10::regionarray::BlockDist::offset(::x10::lang::Point* pt) {
    
    //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    ::x10::regionarray::Region* r = this->x10::regionarray::BlockDist::get(
                                      ::x10::lang::Place::_make(::x10aux::here));
    
    //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    x10_long offset = ::x10aux::nullCheck(r)->indexOf(pt);
    
    //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    if ((::x10aux::struct_equals(offset, ((x10_long)-1ll))))
    {
     
    }
    
    //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    return offset;
    
}

//#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
x10_long x10::regionarray::BlockDist::offset(x10_long i0) {
    
    //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    ::x10::regionarray::Region* r = this->x10::regionarray::BlockDist::get(
                                      ::x10::lang::Place::_make(::x10aux::here));
    
    //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    x10_long offset = ::x10aux::nullCheck(r)->indexOf(i0);
    
    //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    if ((::x10aux::struct_equals(offset, ((x10_long)-1ll))))
    {
     
    }
    
    //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    return offset;
    
}

//#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
x10_long x10::regionarray::BlockDist::offset(x10_long i0,
                                             x10_long i1) {
    
    //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    ::x10::regionarray::Region* r = this->x10::regionarray::BlockDist::get(
                                      ::x10::lang::Place::_make(::x10aux::here));
    
    //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    x10_long offset = ::x10aux::nullCheck(r)->indexOf(i0,
                                                      i1);
    
    //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    if ((::x10aux::struct_equals(offset, ((x10_long)-1ll))))
    {
     
    }
    
    //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    return offset;
    
}

//#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
x10_long x10::regionarray::BlockDist::offset(x10_long i0,
                                             x10_long i1,
                                             x10_long i2) {
    
    //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    ::x10::regionarray::Region* r = this->x10::regionarray::BlockDist::get(
                                      ::x10::lang::Place::_make(::x10aux::here));
    
    //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    x10_long offset = ::x10aux::nullCheck(r)->indexOf(i0,
                                                      i1,
                                                      i2);
    
    //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    if ((::x10aux::struct_equals(offset, ((x10_long)-1ll))))
    {
     
    }
    
    //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    return offset;
    
}

//#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
x10_long x10::regionarray::BlockDist::offset(x10_long i0,
                                             x10_long i1,
                                             x10_long i2,
                                             x10_long i3) {
    
    //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    ::x10::regionarray::Region* r = this->x10::regionarray::BlockDist::get(
                                      ::x10::lang::Place::_make(::x10aux::here));
    
    //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    x10_long offset = ::x10aux::nullCheck(r)->indexOf(i0,
                                                      i1,
                                                      i2,
                                                      i3);
    
    //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    if ((::x10aux::struct_equals(offset, ((x10_long)-1ll))))
    {
     
    }
    
    //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    return offset;
    
}

//#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
x10_long x10::regionarray::BlockDist::maxOffset() {
    
    //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    ::x10::regionarray::Region* r = this->x10::regionarray::BlockDist::get(
                                      ::x10::lang::Place::_make(::x10aux::here));
    
    //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    return ((::x10aux::nullCheck(r)->size()) - (((x10_long)1ll)));
    
}

//#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
::x10::regionarray::Dist* x10::regionarray::BlockDist::restriction(
  ::x10::regionarray::Region* r) {
    
    //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    ::x10::regionarray::WrappedDistRegionRestricted* alloc__111970 =
       (new (::x10aux::alloc_z< ::x10::regionarray::WrappedDistRegionRestricted>()) ::x10::regionarray::WrappedDistRegionRestricted());
    (alloc__111970)->::x10::regionarray::WrappedDistRegionRestricted::_constructor(
      reinterpret_cast< ::x10::regionarray::Dist*>(this),
      r);
    return alloc__111970;
    
}

//#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
::x10::regionarray::Dist* x10::regionarray::BlockDist::restriction(
  ::x10::lang::Place p) {
    
    //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    ::x10::regionarray::WrappedDistPlaceRestricted* alloc__111971 =
       (new (::x10aux::alloc_z< ::x10::regionarray::WrappedDistPlaceRestricted>()) ::x10::regionarray::WrappedDistPlaceRestricted());
    (alloc__111971)->::x10::regionarray::WrappedDistPlaceRestricted::_constructor(
      reinterpret_cast< ::x10::regionarray::Dist*>(this),
      p);
    return alloc__111971;
    
}

//#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
x10_boolean x10::regionarray::BlockDist::equals(::x10::lang::Any* thatObj) {
    
    //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    if ((::x10aux::struct_equals(this, thatObj))) {
        return true;
        
    }
    
    //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    if (!(::x10aux::instanceof< ::x10::regionarray::BlockDist*>(thatObj)))
    {
        return ::x10::regionarray::Dist::equals(thatObj);
        
    }
    
    //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    ::x10::regionarray::BlockDist* that = ::x10aux::class_cast< ::x10::regionarray::BlockDist*>(thatObj);
    
    //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
    return (::x10aux::equals(this->FMGL(axis), ::x10aux::nullCheck(that)->FMGL(axis)) &&
    ::x10aux::nullCheck(this->FMGL(region))->equals(reinterpret_cast< ::x10::lang::Any*>(::x10aux::nullCheck(that)->FMGL(region))));
    
}

//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockDist.x10"
::x10::regionarray::BlockDist* x10::regionarray::BlockDist::x10__regionarray__BlockDist____this__x10__regionarray__BlockDist(
  ) {
    return this;
    
}
void x10::regionarray::BlockDist::__fieldInitializers_x10_regionarray_BlockDist(
  ) {
    this->FMGL(regionForHere) = (::x10aux::class_cast_unchecked< ::x10::regionarray::Region*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
const ::x10aux::serialization_id_t x10::regionarray::BlockDist::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::BlockDist::_deserializer);

void x10::regionarray::BlockDist::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::regionarray::Dist::_serialize_body(buf);
    buf.write(this->FMGL(pg));
    buf.write(this->FMGL(axis));
    
}

::x10::lang::Reference* ::x10::regionarray::BlockDist::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::BlockDist* this_ = new (::x10aux::alloc_z< ::x10::regionarray::BlockDist>()) ::x10::regionarray::BlockDist();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::regionarray::BlockDist::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::Dist::_deserialize_body(buf);
    FMGL(pg) = buf.read< ::x10::lang::PlaceGroup*>();
    FMGL(axis) = buf.read<x10_long>();
    
}

::x10aux::RuntimeType x10::regionarray::BlockDist::rtt;
void x10::regionarray::BlockDist::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::regionarray::Dist>()};
    rtt.initStageTwo("x10.regionarray.BlockDist",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_BlockDist__closure__1>x10_regionarray_BlockDist__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_BlockDist__closure__1::__apply, &x10_regionarray_BlockDist__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_BlockDist__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_BlockDist__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_BlockDist__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_BlockDist__closure__1::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_BlockDist__closure__2>x10_regionarray_BlockDist__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_BlockDist__closure__2::__apply, &x10_regionarray_BlockDist__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_BlockDist__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_BlockDist__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_BlockDist__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_BlockDist__closure__2::_deserialize);

::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::Region*>::itable<x10_regionarray_BlockDist__closure__3>x10_regionarray_BlockDist__closure__3::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_BlockDist__closure__3::__apply, &x10_regionarray_BlockDist__closure__3::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_BlockDist__closure__3::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::Region*> >, &x10_regionarray_BlockDist__closure__3::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_BlockDist__closure__3::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_BlockDist__closure__3::_deserialize);

/* END of BlockDist */
/*************************************************/
