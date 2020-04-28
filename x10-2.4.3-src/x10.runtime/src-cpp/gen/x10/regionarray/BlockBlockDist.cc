/*************************************************/
/* START of BlockBlockDist */
#include <x10/regionarray/BlockBlockDist.h>

#include <x10/regionarray/Dist.h>
#include <x10/lang/Long.h>
#include <x10/lang/PlaceGroup.h>
#include <x10/regionarray/Region.h>
#include <x10/lang/Place.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Math.h>
#include <x10/lang/Double.h>
#include <x10/regionarray/EmptyRegion.h>
#include <x10/regionarray/RectRegion.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/lang/Int.h>
#include <x10/regionarray/FullRegion.h>
#include <x10/regionarray/RectRegion1D.h>
#include <x10/lang/Iterable.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Point.h>
#include <x10/lang/UnsupportedOperationException.h>
#include <x10/regionarray/WrappedDistRegionRestricted.h>
#include <x10/regionarray/WrappedDistPlaceRestricted.h>
#include <x10/lang/Any.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_REGIONARRAY_BLOCKBLOCKDIST__CLOSURE__1_CLOSURE
#define X10_REGIONARRAY_BLOCKBLOCKDIST__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_BlockBlockDist__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_BlockBlockDist__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ::x10aux::nullCheck(saved_this->FMGL(region))->min(((x10_long)(((x10_int) (i)))));
        
    }
    
    // captured environment
    ::x10::regionarray::BlockBlockDist* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_BlockBlockDist__closure__1* storage = ::x10aux::alloc_z<x10_regionarray_BlockBlockDist__closure__1>();
        buf.record_reference(storage);
        ::x10::regionarray::BlockBlockDist* that_saved_this = buf.read< ::x10::regionarray::BlockBlockDist*>();
        x10_regionarray_BlockBlockDist__closure__1* this_ = new (storage) x10_regionarray_BlockBlockDist__closure__1(that_saved_this);
        return this_;
    }
    
    x10_regionarray_BlockBlockDist__closure__1(::x10::regionarray::BlockBlockDist* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10:103";
    }

};

#endif // X10_REGIONARRAY_BLOCKBLOCKDIST__CLOSURE__1_CLOSURE
#ifndef X10_REGIONARRAY_BLOCKBLOCKDIST__CLOSURE__2_CLOSURE
#define X10_REGIONARRAY_BLOCKBLOCKDIST__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_BlockBlockDist__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_BlockBlockDist__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ::x10aux::nullCheck(saved_this->FMGL(region))->max(((x10_long)(((x10_int) (i)))));
        
    }
    
    // captured environment
    ::x10::regionarray::BlockBlockDist* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_BlockBlockDist__closure__2* storage = ::x10aux::alloc_z<x10_regionarray_BlockBlockDist__closure__2>();
        buf.record_reference(storage);
        ::x10::regionarray::BlockBlockDist* that_saved_this = buf.read< ::x10::regionarray::BlockBlockDist*>();
        x10_regionarray_BlockBlockDist__closure__2* this_ = new (storage) x10_regionarray_BlockBlockDist__closure__2(that_saved_this);
        return this_;
    }
    
    x10_regionarray_BlockBlockDist__closure__2(::x10::regionarray::BlockBlockDist* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10:104";
    }

};

#endif // X10_REGIONARRAY_BLOCKBLOCKDIST__CLOSURE__2_CLOSURE
#ifndef X10_REGIONARRAY_BLOCKBLOCKDIST__CLOSURE__3_CLOSURE
#define X10_REGIONARRAY_BLOCKBLOCKDIST__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_BlockBlockDist__closure__3 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::Region*>::itable<x10_regionarray_BlockBlockDist__closure__3> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::regionarray::Region* __apply(x10_long i) {
        return saved_this->x10::regionarray::BlockBlockDist::blockBlockRegionForPlace(
                 ::x10aux::nullCheck(saved_this->FMGL(pg))->__apply(
                   ((x10_long)(((x10_int) (i))))));
        
    }
    
    // captured environment
    ::x10::regionarray::BlockBlockDist* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_BlockBlockDist__closure__3* storage = ::x10aux::alloc_z<x10_regionarray_BlockBlockDist__closure__3>();
        buf.record_reference(storage);
        ::x10::regionarray::BlockBlockDist* that_saved_this = buf.read< ::x10::regionarray::BlockBlockDist*>();
        x10_regionarray_BlockBlockDist__closure__3* this_ = new (storage) x10_regionarray_BlockBlockDist__closure__3(that_saved_this);
        return this_;
    }
    
    x10_regionarray_BlockBlockDist__closure__3(::x10::regionarray::BlockBlockDist* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::Region*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::Region*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10:181";
    }

};

#endif // X10_REGIONARRAY_BLOCKBLOCKDIST__CLOSURE__3_CLOSURE
::x10::lang::Fun_0_1< ::x10::lang::Point*, ::x10::lang::Place>::itable< ::x10::regionarray::BlockBlockDist >  x10::regionarray::BlockBlockDist::_itable_0(&x10::regionarray::BlockBlockDist::equals, &::x10::lang::X10Class::hashCode, &x10::regionarray::BlockBlockDist::__apply, &::x10::regionarray::Dist::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::regionarray::BlockBlockDist >  x10::regionarray::BlockBlockDist::_itable_1(&x10::regionarray::BlockBlockDist::equals, &::x10::lang::X10Class::hashCode, &::x10::regionarray::Dist::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Iterable< ::x10::lang::Point*>::itable< ::x10::regionarray::BlockBlockDist >  x10::regionarray::BlockBlockDist::_itable_2(&x10::regionarray::BlockBlockDist::equals, &::x10::lang::X10Class::hashCode, &::x10::regionarray::Dist::iterator, &::x10::regionarray::Dist::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::regionarray::BlockBlockDist::_itables[4] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::Point*, ::x10::lang::Place> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Point*> >, &_itable_2), ::x10aux::itable_entry(NULL, (void*)"::x10::regionarray::BlockBlockDist")};

//#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
/**
     * The place group for this distribution
     */

//#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
/**
     * The first axis along which the region is distributed
     */

//#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
/**
     * The second axis along which the region is distributed
     */

//#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
/**
     * Cached restricted region for the current place.
     */

//#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
void x10::regionarray::BlockBlockDist::_constructor(::x10::regionarray::Region* r,
                                                    x10_long axis0,
                                                    x10_long axis1,
                                                    ::x10::lang::PlaceGroup* pg) {
    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    ::x10::regionarray::Dist* this__111735 = this;
    
    //#line 659 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10::regionarray::Region* region__111736 = r;
    
    //#line 660 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10aux::nullCheck(this__111735)->FMGL(region) = region__111736;
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    ::x10::regionarray::BlockBlockDist* this__111734 = this;
    ::x10aux::nullCheck(this__111734)->FMGL(regionForHere) = (::x10aux::class_cast_unchecked< ::x10::regionarray::Region*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    this->FMGL(axis0) = axis0;
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    this->FMGL(axis1) = axis1;
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    this->FMGL(pg) = pg;
}
::x10::regionarray::BlockBlockDist* x10::regionarray::BlockBlockDist::_make(
  ::x10::regionarray::Region* r, x10_long axis0, x10_long axis1, ::x10::lang::PlaceGroup* pg)
{
    ::x10::regionarray::BlockBlockDist* this_ = new (::x10aux::alloc_z< ::x10::regionarray::BlockBlockDist>()) ::x10::regionarray::BlockBlockDist();
    this_->_constructor(r, axis0, axis1, pg);
    return this_;
}



//#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
::x10::regionarray::Region* x10::regionarray::BlockBlockDist::blockBlockRegionForPlace(
  ::x10::lang::Place place) {
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    ::x10::regionarray::Region* b = ::x10aux::nullCheck(this->FMGL(region))->boundingBox();
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long min0 = ::x10aux::nullCheck(b)->min(this->FMGL(axis0));
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long max0 = ::x10aux::nullCheck(b)->max(this->FMGL(axis0));
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long min1 = ::x10aux::nullCheck(b)->min(this->FMGL(axis1));
    
    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long max1 = ::x10aux::nullCheck(b)->max(this->FMGL(axis1));
    
    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long size0 = ((((max0) - (min0))) + (((x10_long)1ll)));
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long size1 = ((((max1) - (min1))) + (((x10_long)1ll)));
    
    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long divisions0;
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long P;
    
    //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    if (((size0) > (((x10_long)1ll)))) {
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        x10_long size0Even = (::x10aux::struct_equals(((size0) % ::x10aux::zeroCheck(((x10_long)2ll))),
                                                      ((x10_long)0ll)))
          ? (size0) : (((size0) - (((x10_long)1ll))));
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        P = (__extension__ ({
            
            //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            x10_long a__109446 = ::x10aux::nullCheck(this->FMGL(pg))->numPlaces();
            x10_long b__109447 = ((size0Even) * (size1));
            ((a__109446) < (b__109447)) ? (a__109446) : (b__109447);
        }))
        ;
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        divisions0 = (__extension__ ({
            
            //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            x10_long a__109448 = size0Even;
            x10_long b__109449 = ::x10::lang::Math::pow2(
                                   ::x10::lang::DoubleNatives::toLong(::x10::lang::MathNatives::ceil(((((::x10::lang::MathNatives::log(((x10_double) (P)))) / (::x10::lang::MathNatives::log(2.0)))) / (2.0)))));
            ((a__109448) < (b__109449)) ? (a__109448) : (b__109449);
        }))
        ;
    } else {
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        P = (__extension__ ({
            
            //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            x10_long a__109450 = ::x10aux::nullCheck(this->FMGL(pg))->numPlaces();
            x10_long b__109451 = size1;
            ((a__109450) < (b__109451)) ? (a__109450) : (b__109451);
        }))
        ;
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        divisions0 = ((x10_long)1ll);
    }
    
    //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long divisions1 = (__extension__ ({
        
        //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        x10_long a__109452 = size1;
        x10_long b__109453 = ::x10::lang::DoubleNatives::toLong(::x10::lang::MathNatives::ceil(((((x10_double) (P))) / (((x10_double) (divisions0))))));
        ((a__109452) < (b__109453)) ? (a__109452) : (b__109453);
    }))
    ;
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long leftOver = ((((divisions0) * (divisions1))) - (P));
    
    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long i = ::x10aux::nullCheck(this->FMGL(pg))->indexOf(
                   place);
    
    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    if (((i) >= (P))) {
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        x10_long rank__111737 = (__extension__ ({
            
            //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            ::x10::regionarray::Dist* this__111738 = reinterpret_cast< ::x10::regionarray::Dist*>(this);
            ::x10aux::nullCheck(::x10aux::nullCheck(this__111738)->FMGL(region))->FMGL(rank);
        }))
        ;
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        return reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            ::x10::regionarray::EmptyRegion* alloc__111739 =
               (new (::x10aux::alloc_z< ::x10::regionarray::EmptyRegion>()) ::x10::regionarray::EmptyRegion());
            (alloc__111739)->::x10::regionarray::EmptyRegion::_constructor(
              rank__111737);
            alloc__111739;
        }))
        );
        
    }
    
    //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long leftOverOddOffset = (::x10aux::struct_equals(((divisions0) % ::x10aux::zeroCheck(((x10_long)2ll))),
                                                          ((x10_long)0ll)))
      ? (((x10_long)0ll)) : (((((i) * (((x10_long)2ll)))) / ::x10aux::zeroCheck(((divisions0) + (((x10_long)1ll))))));
    
    //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long blockIndex0 = ((i) < (leftOver)) ? (((((((i) * (((x10_long)2ll)))) - (leftOverOddOffset))) % ::x10aux::zeroCheck(divisions0)))
      : (((((i) + (leftOver))) % ::x10aux::zeroCheck(divisions0)));
    
    //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long blockIndex1 = ((i) < (leftOver)) ? (((((i) * (((x10_long)2ll)))) / ::x10aux::zeroCheck(divisions0)))
      : (((((i) + (leftOver))) / ::x10aux::zeroCheck(divisions0)));
    
    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long low0 = ((min0) + (::x10::lang::DoubleNatives::toLong(::x10::lang::MathNatives::ceil(((((x10_double) (((blockIndex0) * (size0))))) / (((x10_double) (divisions0))))))));
    
    //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long blockHi0 = ((blockIndex0) + (((i) < (leftOver))
      ? (((x10_long)2ll)) : (((x10_long)1ll))));
    
    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long hi0 = ((((min0) + (::x10::lang::DoubleNatives::toLong(::x10::lang::MathNatives::ceil(((((x10_double) (((blockHi0) * (size0))))) / (((x10_double) (divisions0))))))))) - (((x10_long)1ll)));
    
    //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long low1 = ((min1) + (::x10::lang::DoubleNatives::toLong(::x10::lang::MathNatives::ceil(((((x10_double) (((blockIndex1) * (size1))))) / (((x10_double) (divisions1))))))));
    
    //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long hi1 = ((((min1) + (::x10::lang::DoubleNatives::toLong(::x10::lang::MathNatives::ceil(((((x10_double) (((((blockIndex1) + (((x10_long)1ll)))) * (size1))))) / (((x10_double) (divisions1))))))))) - (((x10_long)1ll)));
    
    //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    if (::x10aux::instanceof< ::x10::regionarray::RectRegion*>(this->FMGL(region)))
    {
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        ::x10::lang::Rail< x10_long >* newMin = ::x10::lang::Rail< x10_long >::_make((__extension__ ({
                                                                                         ::x10::regionarray::Dist* this__109574 =
                                                                                           reinterpret_cast< ::x10::regionarray::Dist*>(this);
                                                                                         ::x10aux::nullCheck(::x10aux::nullCheck(this__109574)->FMGL(region))->FMGL(rank);
                                                                                     }))
                                                                                     ,
                                                                                     reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_BlockBlockDist__closure__1)))x10_regionarray_BlockBlockDist__closure__1(this))));
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        ::x10::lang::Rail< x10_long >* newMax = ::x10::lang::Rail< x10_long >::_make((__extension__ ({
                                                                                         ::x10::regionarray::Dist* this__109575 =
                                                                                           reinterpret_cast< ::x10::regionarray::Dist*>(this);
                                                                                         ::x10aux::nullCheck(::x10aux::nullCheck(this__109575)->FMGL(region))->FMGL(rank);
                                                                                     }))
                                                                                     ,
                                                                                     reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_BlockBlockDist__closure__2)))x10_regionarray_BlockBlockDist__closure__2(this))));
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        newMin->x10::lang::Rail< x10_long >::__set(this->FMGL(axis0),
                                                   low0);
        
        //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        newMin->x10::lang::Rail< x10_long >::__set(this->FMGL(axis1),
                                                   low1);
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        newMax->x10::lang::Rail< x10_long >::__set(this->FMGL(axis0),
                                                   hi0);
        
        //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        newMax->x10::lang::Rail< x10_long >::__set(this->FMGL(axis1),
                                                   hi1);
        
        //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        return reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
            ::x10::regionarray::RectRegion* alloc__108200 =
               (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion>()) ::x10::regionarray::RectRegion());
            (alloc__108200)->::x10::regionarray::RectRegion::_constructor(
              newMin, newMax);
            alloc__108200;
        }))
        );
        
    } else {
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        ::x10::regionarray::Region* beforeAxes = ((this->FMGL(axis1)) > (this->FMGL(axis0)))
          ? ((__extension__ ({
                 
                 //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                 x10_long rank__111170 = this->FMGL(axis0);
                 reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
                     ::x10::regionarray::FullRegion* alloc__111171 =
                        (new (::x10aux::alloc_z< ::x10::regionarray::FullRegion>()) ::x10::regionarray::FullRegion());
                     (alloc__111171)->::x10::regionarray::FullRegion::_constructor(
                       rank__111170);
                     alloc__111171;
                 }))
                 );
             }))
             ) : ((__extension__ ({
                      
                      //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                      x10_long rank__111504 = this->FMGL(axis1);
                      reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
                          ::x10::regionarray::FullRegion* alloc__111505 =
                             (new (::x10aux::alloc_z< ::x10::regionarray::FullRegion>()) ::x10::regionarray::FullRegion());
                          (alloc__111505)->::x10::regionarray::FullRegion::_constructor(
                            rank__111504);
                          alloc__111505;
                      }))
                      );
                  }))
                  );
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        ::x10::regionarray::Region* betweenAxes = ((this->FMGL(axis1)) > (this->FMGL(axis0)))
          ? ((__extension__ ({
                 
                 //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                 x10_long rank__111506 = ((((this->FMGL(axis1)) - (this->FMGL(axis0)))) - (((x10_long)(((x10_int)1)))));
                 reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
                     ::x10::regionarray::FullRegion* alloc__111507 =
                        (new (::x10aux::alloc_z< ::x10::regionarray::FullRegion>()) ::x10::regionarray::FullRegion());
                     (alloc__111507)->::x10::regionarray::FullRegion::_constructor(
                       rank__111506);
                     alloc__111507;
                 }))
                 );
             }))
             ) : ((__extension__ ({
                      
                      //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                      x10_long rank__111508 = ((((this->FMGL(axis0)) - (this->FMGL(axis1)))) - (((x10_long)(((x10_int)1)))));
                      reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
                          ::x10::regionarray::FullRegion* alloc__111509 =
                             (new (::x10aux::alloc_z< ::x10::regionarray::FullRegion>()) ::x10::regionarray::FullRegion());
                          (alloc__111509)->::x10::regionarray::FullRegion::_constructor(
                            rank__111508);
                          alloc__111509;
                      }))
                      );
                  }))
                  );
        
        //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        ::x10::regionarray::Region* afterAxes = ((this->FMGL(axis1)) > (this->FMGL(axis0)))
          ? ((__extension__ ({
                 
                 //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                 x10_long rank__111510 = ((((::x10aux::nullCheck(this->FMGL(region))->FMGL(rank)) - (this->FMGL(axis1)))) - (((x10_long)(((x10_int)1)))));
                 reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
                     ::x10::regionarray::FullRegion* alloc__111511 =
                        (new (::x10aux::alloc_z< ::x10::regionarray::FullRegion>()) ::x10::regionarray::FullRegion());
                     (alloc__111511)->::x10::regionarray::FullRegion::_constructor(
                       rank__111510);
                     alloc__111511;
                 }))
                 );
             }))
             ) : ((__extension__ ({
                      
                      //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                      x10_long rank__111512 = ((((::x10aux::nullCheck(this->FMGL(region))->FMGL(rank)) - (this->FMGL(axis0)))) - (((x10_long)(((x10_int)1)))));
                      reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
                          ::x10::regionarray::FullRegion* alloc__111513 =
                             (new (::x10aux::alloc_z< ::x10::regionarray::FullRegion>()) ::x10::regionarray::FullRegion());
                          (alloc__111513)->::x10::regionarray::FullRegion::_constructor(
                            rank__111512);
                          alloc__111513;
                      }))
                      );
                  }))
                  );
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        x10_long lowFirst;
        
        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        x10_long hiFirst;
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        x10_long lowSecond;
        
        //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        x10_long hiSecond;
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        if (((this->FMGL(axis1)) > (this->FMGL(axis0)))) {
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            lowFirst = low0;
            
            //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            lowSecond = low1;
            
            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            hiFirst = hi0;
            
            //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            hiSecond = hi1;
        } else {
            
            //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            lowFirst = low1;
            
            //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            lowSecond = low0;
            
            //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            hiFirst = hi1;
            
            //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            hiSecond = hi0;
        }
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        ::x10::regionarray::Region* rFirst = (__extension__ ({
            
            //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            x10_long min__111514 = lowFirst;
            x10_long max__111515 = hiFirst;
            reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
                ::x10::regionarray::RectRegion1D* alloc__111516 =
                   (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
                (alloc__111516)->::x10::regionarray::RectRegion1D::_constructor(
                  min__111514, max__111515);
                alloc__111516;
            }))
            );
        }))
        ;
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        ::x10::regionarray::Region* rSecond = (__extension__ ({
            
            //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            x10_long min__111517 = lowSecond;
            x10_long max__111518 = hiSecond;
            reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
                ::x10::regionarray::RectRegion1D* alloc__111519 =
                   (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
                (alloc__111519)->::x10::regionarray::RectRegion1D::_constructor(
                  min__111517, max__111518);
                alloc__111519;
            }))
            );
        }))
        ;
        
        //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        return (beforeAxes->product(rFirst)->product(betweenAxes)->product(
                  rSecond)->product(afterAxes))->intersection(
                 this->FMGL(region));
        
    }
    
}

//#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
::x10::lang::Place x10::regionarray::BlockBlockDist::mapIndexToPlace(
  x10_long index0, x10_long index1) {
    
    //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    ::x10::regionarray::Region* b = ::x10aux::nullCheck(this->FMGL(region))->boundingBox();
    
    //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long min0 = ::x10aux::nullCheck(b)->min(this->FMGL(axis0));
    
    //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long max0 = ::x10aux::nullCheck(b)->max(this->FMGL(axis0));
    
    //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long min1 = ::x10aux::nullCheck(b)->min(this->FMGL(axis1));
    
    //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long max1 = ::x10aux::nullCheck(b)->max(this->FMGL(axis1));
    
    //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long size0 = ((((max0) - (min0))) + (((x10_long)1ll)));
    
    //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long size1 = ((((max1) - (min1))) + (((x10_long)1ll)));
    
    //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long divisions0;
    
    //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long P;
    
    //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    if (((size0) > (((x10_long)1ll)))) {
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        x10_long size0Even = (::x10aux::struct_equals(((size0) % ::x10aux::zeroCheck(((x10_long)2ll))),
                                                      ((x10_long)0ll)))
          ? (size0) : (((size0) - (((x10_long)1ll))));
        
        //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        P = (__extension__ ({
            
            //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            x10_long a__111520 = ::x10aux::nullCheck(this->FMGL(pg))->numPlaces();
            x10_long b__111521 = ((size0Even) * (size1));
            ((a__111520) < (b__111521)) ? (a__111520) : (b__111521);
        }))
        ;
        
        //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        divisions0 = (__extension__ ({
            
            //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            x10_long a__111522 = size0Even;
            x10_long b__111523 = ::x10::lang::Math::pow2(
                                   ::x10::lang::DoubleNatives::toLong(::x10::lang::MathNatives::ceil(((((::x10::lang::MathNatives::log(((x10_double) (P)))) / (::x10::lang::MathNatives::log(2.0)))) / (2.0)))));
            ((a__111522) < (b__111523)) ? (a__111522) : (b__111523);
        }))
        ;
    } else {
        
        //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        P = (__extension__ ({
            
            //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
            x10_long a__111524 = ::x10aux::nullCheck(this->FMGL(pg))->numPlaces();
            x10_long b__111525 = size1;
            ((a__111524) < (b__111525)) ? (a__111524) : (b__111525);
        }))
        ;
        
        //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        divisions0 = ((x10_long)1ll);
    }
    
    //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long divisions1 = (__extension__ ({
        
        //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        x10_long a__111526 = size1;
        x10_long b__111527 = ::x10::lang::DoubleNatives::toLong(::x10::lang::MathNatives::ceil(((((x10_double) (P))) / (((x10_double) (divisions0))))));
        ((a__111526) < (b__111527)) ? (a__111526) : (b__111527);
    }))
    ;
    
    //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long numBlocks = ((divisions0) * (divisions1));
    
    //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long leftOver = ((numBlocks) - (P));
    
    //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long blockIndex0 = (::x10aux::struct_equals(divisions0,
                                                    ((x10_long)1ll)))
      ? (((x10_long)0ll)) : (((((((index0) - (min0))) * (divisions0))) / ::x10aux::zeroCheck(size0)));
    
    //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long blockIndex1 = (::x10aux::struct_equals(divisions1,
                                                    ((x10_long)1ll)))
      ? (((x10_long)0ll)) : (((((((index1) - (min1))) * (divisions1))) / ::x10aux::zeroCheck(size1)));
    
    //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long blockIndex = ((((blockIndex1) * (divisions0))) + (blockIndex0));
    
    //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    if (((blockIndex) <= (((leftOver) * (((x10_long)2ll))))))
    {
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        return ::x10aux::nullCheck(this->FMGL(pg))->__apply(
                 ((x10_long)(((x10_int) (((blockIndex) / ::x10aux::zeroCheck(((x10_long)2ll))))))));
        
    } else {
        
        //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        return ::x10aux::nullCheck(this->FMGL(pg))->__apply(
                 ((x10_long)(((x10_int) (((blockIndex) - (leftOver)))))));
        
    }
    
}

//#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
::x10::lang::PlaceGroup* x10::regionarray::BlockBlockDist::places(
  ) {
    return this->FMGL(pg);
    
}

//#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
x10_long x10::regionarray::BlockBlockDist::numPlaces() {
    return ::x10aux::nullCheck(this->FMGL(pg))->numPlaces();
    
}

//#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
::x10::lang::Iterable< ::x10::regionarray::Region*>* x10::regionarray::BlockBlockDist::regions(
  ) {
    
    //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    return reinterpret_cast< ::x10::lang::Iterable< ::x10::regionarray::Region*>*>(::x10::lang::Rail< ::x10::regionarray::Region* >::_make(::x10aux::nullCheck(this->FMGL(pg))->numPlaces(),
                                                                                                                                           reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::Region*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::Region*> >(sizeof(x10_regionarray_BlockBlockDist__closure__3)))x10_regionarray_BlockBlockDist__closure__3(this)))));
    
}

//#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
::x10::regionarray::Region* x10::regionarray::BlockBlockDist::get(
  ::x10::lang::Place p) {
    
    //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    if ((::x10aux::struct_equals(p, ::x10::lang::Place::_make(::x10aux::here))))
    {
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        if ((::x10aux::struct_equals(this->FMGL(regionForHere),
                                     reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
        {
            
            //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
            this->FMGL(regionForHere) = this->x10::regionarray::BlockBlockDist::blockBlockRegionForPlace(
                                          ::x10::lang::Place::_make(::x10aux::here));
        }
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        return this->FMGL(regionForHere);
        
    } else {
        
        //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        return this->x10::regionarray::BlockBlockDist::blockBlockRegionForPlace(
                 p);
        
    }
    
}

//#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
x10_boolean x10::regionarray::BlockBlockDist::containsLocally(
  ::x10::lang::Point* p) {
    return ::x10aux::nullCheck(this->x10::regionarray::BlockBlockDist::get(
                                 ::x10::lang::Place::_make(::x10aux::here)))->contains(
             p);
    
}

//#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
::x10::regionarray::Region* x10::regionarray::BlockBlockDist::__apply(
  ::x10::lang::Place p) {
    return this->x10::regionarray::BlockBlockDist::get(p);
    
}

//#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
::x10::lang::Place x10::regionarray::BlockBlockDist::__apply(
  ::x10::lang::Point* pt) {
    
    //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    return this->x10::regionarray::BlockBlockDist::mapIndexToPlace(
             ::x10aux::nullCheck(pt)->x10::lang::Point::__apply(
               this->FMGL(axis0)), ::x10aux::nullCheck(pt)->x10::lang::Point::__apply(
                                     this->FMGL(axis1)));
    
}

//#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
::x10::lang::Place x10::regionarray::BlockBlockDist::__apply(
  x10_long i0) {
    
    //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make((__extension__ ({ static ::x10::lang::String* strLit__126103 = ::x10aux::makeStringLit("operator(i0:Long)"); strLit__126103; })))));
}

//#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
::x10::lang::Place x10::regionarray::BlockBlockDist::__apply(
  x10_long i0, x10_long i1) {
    
    //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    return (::x10aux::struct_equals(this->FMGL(axis0), ((x10_long)0ll)))
      ? (this->x10::regionarray::BlockBlockDist::mapIndexToPlace(
           i0, i1)) : (this->x10::regionarray::BlockBlockDist::mapIndexToPlace(
                         i1, i0));
    
}

//#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
::x10::lang::Place x10::regionarray::BlockBlockDist::__apply(
  x10_long i0, x10_long i1, x10_long i2) {
    
    //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    if ((::x10aux::struct_equals(this->FMGL(axis0), ((x10_long)0ll))))
    {
        
        //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        return (::x10aux::struct_equals(this->FMGL(axis1),
                                        ((x10_long)1ll)))
          ? (this->x10::regionarray::BlockBlockDist::mapIndexToPlace(
               i0, i1)) : (this->x10::regionarray::BlockBlockDist::mapIndexToPlace(
                             i0, i2));
        
    } else 
    //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    if ((::x10aux::struct_equals(this->FMGL(axis0), ((x10_long)1ll))))
    {
        
        //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        return (::x10aux::struct_equals(this->FMGL(axis1),
                                        ((x10_long)0ll)))
          ? (this->x10::regionarray::BlockBlockDist::mapIndexToPlace(
               i1, i0)) : (this->x10::regionarray::BlockBlockDist::mapIndexToPlace(
                             i1, i2));
        
    } else {
        
        //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
        return (::x10aux::struct_equals(this->FMGL(axis1),
                                        ((x10_long)0ll)))
          ? (this->x10::regionarray::BlockBlockDist::mapIndexToPlace(
               i2, i0)) : (this->x10::regionarray::BlockBlockDist::mapIndexToPlace(
                             i2, i1));
        
    }
    
}

//#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
::x10::lang::Place x10::regionarray::BlockBlockDist::__apply(
  x10_long i0, x10_long i1, x10_long i2, x10_long i3) {
    
    //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    ::x10::lang::Point* pt = (__extension__ ({
        
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        x10_long i__111532 = i0;
        x10_long i__111533 = i1;
        x10_long i__111534 = i2;
        x10_long i__111535 = i3;
        (__extension__ ({
            ::x10::lang::Point* alloc__111536 =  (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
            (alloc__111536)->::x10::lang::Point::_constructor(
              i__111532, i__111533, i__111534, i__111535);
            alloc__111536;
        }))
        ;
    }))
    ;
    
    //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    return this->x10::regionarray::BlockBlockDist::mapIndexToPlace(
             pt->x10::lang::Point::__apply(this->FMGL(axis0)),
             pt->x10::lang::Point::__apply(this->FMGL(axis1)));
    
}

//#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
x10_long x10::regionarray::BlockBlockDist::offset(::x10::lang::Point* pt) {
    
    //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    ::x10::regionarray::Region* r = this->x10::regionarray::BlockBlockDist::get(
                                      ::x10::lang::Place::_make(::x10aux::here));
    
    //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long offset = ::x10aux::nullCheck(r)->indexOf(pt);
    
    //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    if ((::x10aux::struct_equals(offset, ((x10_long)-1ll))))
    {
     
    }
    
    //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    return offset;
    
}

//#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
x10_long x10::regionarray::BlockBlockDist::offset(x10_long i0) {
    
    //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    ::x10::regionarray::Region* r = this->x10::regionarray::BlockBlockDist::get(
                                      ::x10::lang::Place::_make(::x10aux::here));
    
    //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long offset = ::x10aux::nullCheck(r)->indexOf(i0);
    
    //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    if ((::x10aux::struct_equals(offset, ((x10_long)-1ll))))
    {
     
    }
    
    //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    return offset;
    
}

//#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
x10_long x10::regionarray::BlockBlockDist::offset(x10_long i0,
                                                  x10_long i1) {
    
    //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    ::x10::regionarray::Region* r = this->x10::regionarray::BlockBlockDist::get(
                                      ::x10::lang::Place::_make(::x10aux::here));
    
    //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long offset = ::x10aux::nullCheck(r)->indexOf(i0,
                                                      i1);
    
    //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    if ((::x10aux::struct_equals(offset, ((x10_long)-1ll))))
    {
     
    }
    
    //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    return offset;
    
}

//#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
x10_long x10::regionarray::BlockBlockDist::offset(x10_long i0,
                                                  x10_long i1,
                                                  x10_long i2) {
    
    //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    ::x10::regionarray::Region* r = this->x10::regionarray::BlockBlockDist::get(
                                      ::x10::lang::Place::_make(::x10aux::here));
    
    //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long offset = ::x10aux::nullCheck(r)->indexOf(i0,
                                                      i1,
                                                      i2);
    
    //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    if ((::x10aux::struct_equals(offset, ((x10_long)-1ll))))
    {
     
    }
    
    //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    return offset;
    
}

//#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
x10_long x10::regionarray::BlockBlockDist::offset(x10_long i0,
                                                  x10_long i1,
                                                  x10_long i2,
                                                  x10_long i3) {
    
    //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    ::x10::regionarray::Region* r = this->x10::regionarray::BlockBlockDist::get(
                                      ::x10::lang::Place::_make(::x10aux::here));
    
    //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    x10_long offset = ::x10aux::nullCheck(r)->indexOf(i0,
                                                      i1,
                                                      i2,
                                                      i3);
    
    //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    if ((::x10aux::struct_equals(offset, ((x10_long)-1ll))))
    {
     
    }
    
    //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    return offset;
    
}

//#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
x10_long x10::regionarray::BlockBlockDist::maxOffset() {
    
    //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    ::x10::regionarray::Region* r = this->x10::regionarray::BlockBlockDist::get(
                                      ::x10::lang::Place::_make(::x10aux::here));
    
    //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    return ((::x10aux::nullCheck(r)->size()) - (((x10_long)1ll)));
    
}

//#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
::x10::regionarray::Dist* x10::regionarray::BlockBlockDist::restriction(
  ::x10::regionarray::Region* r) {
    
    //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    ::x10::regionarray::WrappedDistRegionRestricted* alloc__111740 =
       (new (::x10aux::alloc_z< ::x10::regionarray::WrappedDistRegionRestricted>()) ::x10::regionarray::WrappedDistRegionRestricted());
    (alloc__111740)->::x10::regionarray::WrappedDistRegionRestricted::_constructor(
      reinterpret_cast< ::x10::regionarray::Dist*>(this),
      r);
    return alloc__111740;
    
}

//#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
::x10::regionarray::Dist* x10::regionarray::BlockBlockDist::restriction(
  ::x10::lang::Place p) {
    
    //#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    ::x10::regionarray::WrappedDistPlaceRestricted* alloc__111741 =
       (new (::x10aux::alloc_z< ::x10::regionarray::WrappedDistPlaceRestricted>()) ::x10::regionarray::WrappedDistPlaceRestricted());
    (alloc__111741)->::x10::regionarray::WrappedDistPlaceRestricted::_constructor(
      reinterpret_cast< ::x10::regionarray::Dist*>(this),
      p);
    return alloc__111741;
    
}

//#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
x10_boolean x10::regionarray::BlockBlockDist::equals(::x10::lang::Any* thatObj) {
    
    //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    if (!(::x10aux::instanceof< ::x10::regionarray::BlockBlockDist*>(thatObj)))
    {
        return false;
        
    }
    
    //#line 298 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    ::x10::regionarray::BlockBlockDist* that = ::x10aux::class_cast< ::x10::regionarray::BlockBlockDist*>(thatObj);
    
    //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
    return ((::x10aux::equals(this->FMGL(axis0), ::x10aux::nullCheck(that)->FMGL(axis0)) &&
    ::x10aux::equals(this->FMGL(axis1), ::x10aux::nullCheck(that)->FMGL(axis1))) &&
    ::x10aux::nullCheck(this->FMGL(region))->equals(reinterpret_cast< ::x10::lang::Any*>(::x10aux::nullCheck(that)->FMGL(region))));
    
}

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/BlockBlockDist.x10"
::x10::regionarray::BlockBlockDist* x10::regionarray::BlockBlockDist::x10__regionarray__BlockBlockDist____this__x10__regionarray__BlockBlockDist(
  ) {
    return this;
    
}
void x10::regionarray::BlockBlockDist::__fieldInitializers_x10_regionarray_BlockBlockDist(
  ) {
    this->FMGL(regionForHere) = (::x10aux::class_cast_unchecked< ::x10::regionarray::Region*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
const ::x10aux::serialization_id_t x10::regionarray::BlockBlockDist::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::BlockBlockDist::_deserializer);

void x10::regionarray::BlockBlockDist::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::regionarray::Dist::_serialize_body(buf);
    buf.write(this->FMGL(pg));
    buf.write(this->FMGL(axis0));
    buf.write(this->FMGL(axis1));
    
}

::x10::lang::Reference* ::x10::regionarray::BlockBlockDist::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::BlockBlockDist* this_ = new (::x10aux::alloc_z< ::x10::regionarray::BlockBlockDist>()) ::x10::regionarray::BlockBlockDist();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::regionarray::BlockBlockDist::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::Dist::_deserialize_body(buf);
    FMGL(pg) = buf.read< ::x10::lang::PlaceGroup*>();
    FMGL(axis0) = buf.read<x10_long>();
    FMGL(axis1) = buf.read<x10_long>();
    
}

::x10aux::RuntimeType x10::regionarray::BlockBlockDist::rtt;
void x10::regionarray::BlockBlockDist::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::regionarray::Dist>()};
    rtt.initStageTwo("x10.regionarray.BlockBlockDist",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_BlockBlockDist__closure__1>x10_regionarray_BlockBlockDist__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_BlockBlockDist__closure__1::__apply, &x10_regionarray_BlockBlockDist__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_BlockBlockDist__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_BlockBlockDist__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_BlockBlockDist__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_BlockBlockDist__closure__1::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_BlockBlockDist__closure__2>x10_regionarray_BlockBlockDist__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_BlockBlockDist__closure__2::__apply, &x10_regionarray_BlockBlockDist__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_BlockBlockDist__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_BlockBlockDist__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_BlockBlockDist__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_BlockBlockDist__closure__2::_deserialize);

::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::Region*>::itable<x10_regionarray_BlockBlockDist__closure__3>x10_regionarray_BlockBlockDist__closure__3::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_BlockBlockDist__closure__3::__apply, &x10_regionarray_BlockBlockDist__closure__3::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_BlockBlockDist__closure__3::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::Region*> >, &x10_regionarray_BlockBlockDist__closure__3::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_BlockBlockDist__closure__3::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_BlockBlockDist__closure__3::_deserialize);

/* END of BlockBlockDist */
/*************************************************/
