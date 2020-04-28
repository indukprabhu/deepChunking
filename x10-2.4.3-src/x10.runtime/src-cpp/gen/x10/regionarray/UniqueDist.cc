/*************************************************/
/* START of UniqueDist */
#include <x10/regionarray/UniqueDist.h>

#include <x10/regionarray/Dist.h>
#include <x10/lang/PlaceGroup.h>
#include <x10/regionarray/Region.h>
#include <x10/lang/Long.h>
#include <x10/regionarray/RectRegion1D.h>
#include <x10/lang/PlaceGroup__SimplePlaceGroup.h>
#include <x10/lang/Iterable.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/lang/Place.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Point.h>
#include <x10/lang/UnsupportedOperationException.h>
#include <x10/regionarray/WrappedDistRegionRestricted.h>
#include <x10/regionarray/WrappedDistPlaceRestricted.h>
#include <x10/lang/Any.h>
#include <x10/lang/Boolean.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_REGIONARRAY_UNIQUEDIST__CLOSURE__1_CLOSURE
#define X10_REGIONARRAY_UNIQUEDIST__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_UniqueDist__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::Region*>::itable<x10_regionarray_UniqueDist__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::regionarray::Region* __apply(x10_long i) {
        return (__extension__ ({
            
            //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            x10_long min__116786 = i;
            x10_long max__116787 = i;
            reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
                ::x10::regionarray::RectRegion1D* alloc__116788 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
                (alloc__116788)->::x10::regionarray::RectRegion1D::_constructor(
                  min__116786, max__116787);
                alloc__116788;
            }))
            );
        }))
        ;
        
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_UniqueDist__closure__1* storage = ::x10aux::alloc_z<x10_regionarray_UniqueDist__closure__1>();
        buf.record_reference(storage);
        x10_regionarray_UniqueDist__closure__1* this_ = new (storage) x10_regionarray_UniqueDist__closure__1();
        return this_;
    }
    
    x10_regionarray_UniqueDist__closure__1() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::Region*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::Region*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10:59";
    }

};

#endif // X10_REGIONARRAY_UNIQUEDIST__CLOSURE__1_CLOSURE
::x10::lang::Fun_0_1< ::x10::lang::Point*, ::x10::lang::Place>::itable< ::x10::regionarray::UniqueDist >  x10::regionarray::UniqueDist::_itable_0(&x10::regionarray::UniqueDist::equals, &::x10::lang::X10Class::hashCode, &x10::regionarray::UniqueDist::__apply, &::x10::regionarray::Dist::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::regionarray::UniqueDist >  x10::regionarray::UniqueDist::_itable_1(&x10::regionarray::UniqueDist::equals, &::x10::lang::X10Class::hashCode, &::x10::regionarray::Dist::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Iterable< ::x10::lang::Point*>::itable< ::x10::regionarray::UniqueDist >  x10::regionarray::UniqueDist::_itable_2(&x10::regionarray::UniqueDist::equals, &::x10::lang::X10Class::hashCode, &::x10::regionarray::Dist::iterator, &::x10::regionarray::Dist::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::regionarray::UniqueDist::_itables[4] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::Point*, ::x10::lang::Place> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Point*> >, &_itable_2), ::x10aux::itable_entry(NULL, (void*)"::x10::regionarray::UniqueDist")};

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
/**
    * The place group for this distribution
    */

//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
/**
     * Cached restricted region for the current place.
     */

//#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
void x10::regionarray::UniqueDist::_constructor(::x10::lang::PlaceGroup* g) {
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    ::x10::regionarray::Dist* this__116801 = this;
    
    //#line 659 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10::regionarray::Region* region__116802 = (__extension__ ({
        
        //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        x10_long max__116803 = ((::x10aux::nullCheck(g)->numPlaces()) - (((x10_long)1ll)));
        reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
            ::x10::regionarray::RectRegion1D* alloc__116804 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
            (alloc__116804)->::x10::regionarray::RectRegion1D::_constructor(
              ((x10_long)0ll), max__116803);
            alloc__116804;
        }))
        );
    }))
    ;
    
    //#line 660 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10aux::nullCheck(this__116801)->FMGL(region) = region__116802;
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    ::x10::regionarray::UniqueDist* this__116800 = this;
    ::x10aux::nullCheck(this__116800)->FMGL(regionForHere) = (::x10aux::class_cast_unchecked< ::x10::regionarray::Region*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    this->FMGL(pg) = g;
}
::x10::regionarray::UniqueDist* x10::regionarray::UniqueDist::_make(::x10::lang::PlaceGroup* g)
{
    ::x10::regionarray::UniqueDist* this_ = new (::x10aux::alloc_z< ::x10::regionarray::UniqueDist>()) ::x10::regionarray::UniqueDist();
    this_->_constructor(g);
    return this_;
}



//#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
void x10::regionarray::UniqueDist::_constructor() {
    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    (this)->::x10::regionarray::UniqueDist::_constructor(reinterpret_cast< ::x10::lang::PlaceGroup*>(::x10::lang::PlaceGroup::FMGL(WORLD__get)()));
    
}
::x10::regionarray::UniqueDist* x10::regionarray::UniqueDist::_make(
  ) {
    ::x10::regionarray::UniqueDist* this_ = new (::x10aux::alloc_z< ::x10::regionarray::UniqueDist>()) ::x10::regionarray::UniqueDist();
    this_->_constructor();
    return this_;
}



//#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
::x10::lang::PlaceGroup* x10::regionarray::UniqueDist::places() {
    return this->FMGL(pg);
    
}

//#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
x10_long x10::regionarray::UniqueDist::numPlaces() {
    return ::x10aux::nullCheck(this->FMGL(pg))->numPlaces();
    
}

//#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
::x10::lang::Iterable< ::x10::regionarray::Region*>* x10::regionarray::UniqueDist::regions(
  ) {
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    return reinterpret_cast< ::x10::lang::Iterable< ::x10::regionarray::Region*>*>(::x10::lang::Rail< ::x10::regionarray::Region* >::_make(::x10aux::nullCheck(this->FMGL(pg))->numPlaces(),
                                                                                                                                           reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::Region*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::Region*> >(sizeof(x10_regionarray_UniqueDist__closure__1)))x10_regionarray_UniqueDist__closure__1()))));
    
}

//#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
::x10::regionarray::Region* x10::regionarray::UniqueDist::get(
  ::x10::lang::Place p) {
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    if ((::x10aux::struct_equals(p, ::x10::lang::Place::_make(::x10aux::here))))
    {
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        if ((::x10aux::struct_equals(this->FMGL(regionForHere),
                                     reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
        {
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
            x10_long idx = ::x10aux::nullCheck(this->FMGL(pg))->indexOf(
                             ::x10::lang::Place::_make(::x10aux::here));
            
            //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
            this->FMGL(regionForHere) = ((__extension__ ({
                                             
                                             //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                                             x10_long min__116789 =
                                               idx;
                                             x10_long max__116790 =
                                               idx;
                                             reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
                                                 ::x10::regionarray::RectRegion1D* alloc__116791 =
                                                    (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
                                                 (alloc__116791)->::x10::regionarray::RectRegion1D::_constructor(
                                                   min__116789,
                                                   max__116790);
                                                 alloc__116791;
                                             }))
                                             );
                                         }))
                                         );
        }
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        return this->FMGL(regionForHere);
        
    } else {
        
        //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        x10_long idx = ::x10aux::nullCheck(this->FMGL(pg))->indexOf(
                         p);
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        return (__extension__ ({
            
            //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            x10_long min__116792 = idx;
            x10_long max__116793 = idx;
            reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
                ::x10::regionarray::RectRegion1D* alloc__116794 =
                   (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
                (alloc__116794)->::x10::regionarray::RectRegion1D::_constructor(
                  min__116792, max__116793);
                alloc__116794;
            }))
            );
        }))
        ;
        
    }
    
}

//#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
::x10::regionarray::Region* x10::regionarray::UniqueDist::__apply(
  ::x10::lang::Place p) {
    return this->x10::regionarray::UniqueDist::get(p);
    
}

//#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
::x10::lang::Place x10::regionarray::UniqueDist::__apply(
  ::x10::lang::Point* pt) {
    return ::x10aux::nullCheck(this->FMGL(pg))->__apply(::x10aux::nullCheck(pt)->x10::lang::Point::__apply(
                                                          ((x10_long)(((x10_int)0)))));
    
}

//#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
::x10::lang::Place x10::regionarray::UniqueDist::__apply(
  x10_long i0) {
    return ::x10aux::nullCheck(this->FMGL(pg))->__apply(i0);
    
}

//#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
x10_long x10::regionarray::UniqueDist::offset(::x10::lang::Point* pt) {
    
    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    return ((x10_long)0ll);
    
}

//#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
x10_long x10::regionarray::UniqueDist::offset(x10_long i0) {
    
    //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    return ((x10_long)0ll);
    
}

//#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
::x10::lang::Place x10::regionarray::UniqueDist::__apply(
  x10_long i0, x10_long i1) {
    
    //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make((__extension__ ({ static ::x10::lang::String* strLit__127736 = ::x10aux::makeStringLit("operator(i0:Long,i1:Long)"); strLit__127736; })))));
}

//#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
::x10::lang::Place x10::regionarray::UniqueDist::__apply(
  x10_long i0, x10_long i1, x10_long i2) {
    
    //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make((__extension__ ({ static ::x10::lang::String* strLit__127740 = ::x10aux::makeStringLit("operator(i0:Long,i1:Long,i2:Long)"); strLit__127740; })))));
}

//#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
::x10::lang::Place x10::regionarray::UniqueDist::__apply(
  x10_long i0, x10_long i1, x10_long i2, x10_long i3) {
    
    //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make((__extension__ ({ static ::x10::lang::String* strLit__127745 = ::x10aux::makeStringLit("operator(i0:Long,i1:Long,i2:Long,i3:Long)"); strLit__127745; })))));
}

//#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
x10_long x10::regionarray::UniqueDist::maxOffset() {
    return ((x10_long)0ll);
    
}

//#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
::x10::regionarray::Dist* x10::regionarray::UniqueDist::restriction(
  ::x10::regionarray::Region* r) {
    
    //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    ::x10::regionarray::WrappedDistRegionRestricted* alloc__116805 =
       (new (::x10aux::alloc_z< ::x10::regionarray::WrappedDistRegionRestricted>()) ::x10::regionarray::WrappedDistRegionRestricted());
    (alloc__116805)->::x10::regionarray::WrappedDistRegionRestricted::_constructor(
      reinterpret_cast< ::x10::regionarray::Dist*>(this),
      r);
    return alloc__116805;
    
}

//#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
::x10::regionarray::Dist* x10::regionarray::UniqueDist::restriction(
  ::x10::lang::Place p) {
    
    //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    return reinterpret_cast< ::x10::regionarray::Dist*>((__extension__ ({
        ::x10::regionarray::WrappedDistPlaceRestricted* alloc__112371 =
           (new (::x10aux::alloc_z< ::x10::regionarray::WrappedDistPlaceRestricted>()) ::x10::regionarray::WrappedDistPlaceRestricted());
        (alloc__112371)->::x10::regionarray::WrappedDistPlaceRestricted::_constructor(
          reinterpret_cast< ::x10::regionarray::Dist*>(this),
          p);
        alloc__112371;
    }))
    );
    
}

//#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
x10_boolean x10::regionarray::UniqueDist::equals(::x10::lang::Any* thatObj) {
    
    //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
    if (::x10aux::instanceof< ::x10::regionarray::UniqueDist*>(thatObj))
    {
        
        //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        ::x10::regionarray::UniqueDist* that = ::x10aux::class_cast< ::x10::regionarray::UniqueDist*>(thatObj);
        
        //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        return ::x10aux::nullCheck(this->FMGL(pg))->equals(
                 reinterpret_cast< ::x10::lang::Any*>(::x10aux::nullCheck(that)->FMGL(pg)));
        
    } else {
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
        return ::x10::regionarray::Dist::equals(thatObj);
        
    }
    
}

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UniqueDist.x10"
::x10::regionarray::UniqueDist* x10::regionarray::UniqueDist::x10__regionarray__UniqueDist____this__x10__regionarray__UniqueDist(
  ) {
    return this;
    
}
void x10::regionarray::UniqueDist::__fieldInitializers_x10_regionarray_UniqueDist(
  ) {
    this->FMGL(regionForHere) = (::x10aux::class_cast_unchecked< ::x10::regionarray::Region*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
const ::x10aux::serialization_id_t x10::regionarray::UniqueDist::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::UniqueDist::_deserializer);

void x10::regionarray::UniqueDist::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::regionarray::Dist::_serialize_body(buf);
    buf.write(this->FMGL(pg));
    
}

::x10::lang::Reference* ::x10::regionarray::UniqueDist::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::UniqueDist* this_ = new (::x10aux::alloc_z< ::x10::regionarray::UniqueDist>()) ::x10::regionarray::UniqueDist();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::regionarray::UniqueDist::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::Dist::_deserialize_body(buf);
    FMGL(pg) = buf.read< ::x10::lang::PlaceGroup*>();
    
}

::x10aux::RuntimeType x10::regionarray::UniqueDist::rtt;
void x10::regionarray::UniqueDist::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::regionarray::Dist>()};
    rtt.initStageTwo("x10.regionarray.UniqueDist",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::Region*>::itable<x10_regionarray_UniqueDist__closure__1>x10_regionarray_UniqueDist__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_UniqueDist__closure__1::__apply, &x10_regionarray_UniqueDist__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_UniqueDist__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::Region*> >, &x10_regionarray_UniqueDist__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_UniqueDist__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_UniqueDist__closure__1::_deserialize);

/* END of UniqueDist */
/*************************************************/
