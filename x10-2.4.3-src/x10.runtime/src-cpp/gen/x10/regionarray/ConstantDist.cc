/*************************************************/
/* START of ConstantDist */
#include <x10/regionarray/ConstantDist.h>

#include <x10/regionarray/Dist.h>
#include <x10/lang/Place.h>
#include <x10/regionarray/Region.h>
#include <x10/lang/PlaceGroup.h>
#include <x10/lang/SparsePlaceGroup.h>
#include <x10/lang/Long.h>
#include <x10/lang/Iterable.h>
#include <x10/lang/Rail.h>
#include <x10/regionarray/EmptyRegion.h>
#include <x10/lang/Point.h>
#include <x10/regionarray/WrappedDistRegionRestricted.h>
#include <x10/regionarray/WrappedDistPlaceRestricted.h>
#include <x10/lang/Any.h>
#include <x10/lang/Boolean.h>
#include <x10/compiler/Synthetic.h>

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
::x10::lang::Fun_0_1< ::x10::lang::Point*, ::x10::lang::Place>::itable< ::x10::regionarray::ConstantDist >  x10::regionarray::ConstantDist::_itable_0(&x10::regionarray::ConstantDist::equals, &::x10::lang::X10Class::hashCode, &x10::regionarray::ConstantDist::__apply, &::x10::regionarray::Dist::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::regionarray::ConstantDist >  x10::regionarray::ConstantDist::_itable_1(&x10::regionarray::ConstantDist::equals, &::x10::lang::X10Class::hashCode, &::x10::regionarray::Dist::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Iterable< ::x10::lang::Point*>::itable< ::x10::regionarray::ConstantDist >  x10::regionarray::ConstantDist::_itable_2(&x10::regionarray::ConstantDist::equals, &::x10::lang::X10Class::hashCode, &::x10::regionarray::Dist::iterator, &::x10::regionarray::Dist::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::regionarray::ConstantDist::_itables[4] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::Point*, ::x10::lang::Place> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Point*> >, &_itable_2), ::x10aux::itable_entry(NULL, (void*)"::x10::regionarray::ConstantDist")};

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
void x10::regionarray::ConstantDist::_constructor(::x10::regionarray::Region* r,
                                                  ::x10::lang::Place p) {
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    ::x10::regionarray::Dist* this__111997 = this;
    
    //#line 659 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10::regionarray::Region* region__111998 = r;
    
    //#line 660 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10aux::nullCheck(this__111997)->FMGL(region) = region__111998;
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    FMGL(onePlace) = p;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    ::x10::regionarray::ConstantDist* this__111996 = this;
    
}
::x10::regionarray::ConstantDist* x10::regionarray::ConstantDist::_make(::x10::regionarray::Region* r,
                                                                        ::x10::lang::Place p)
{
    ::x10::regionarray::ConstantDist* this_ = new (::x10aux::alloc_z< ::x10::regionarray::ConstantDist>()) ::x10::regionarray::ConstantDist();
    this_->_constructor(r, p);
    return this_;
}



//#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
::x10::lang::PlaceGroup* x10::regionarray::ConstantDist::places(
  ) {
    ::x10::lang::SparsePlaceGroup* alloc__111999 =  (new (::x10aux::alloc_z< ::x10::lang::SparsePlaceGroup>()) ::x10::lang::SparsePlaceGroup());
    (alloc__111999)->::x10::lang::SparsePlaceGroup::_constructor(
      this->FMGL(onePlace));
    return alloc__111999;
    
}

//#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
x10_long x10::regionarray::ConstantDist::numPlaces() {
    return ((x10_long)1ll);
    
}

//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
::x10::lang::Iterable< ::x10::regionarray::Region*>* x10::regionarray::ConstantDist::regions(
  ) {
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    return reinterpret_cast< ::x10::lang::Iterable< ::x10::regionarray::Region*>*>(::x10::lang::Rail< ::x10::regionarray::Region* >::_make(((x10_long)1ll),
                                                                                                                                           this->FMGL(region)));
    
}

//#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
::x10::regionarray::Region* x10::regionarray::ConstantDist::get(
  ::x10::lang::Place p) {
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    if ((::x10aux::struct_equals(p, this->FMGL(onePlace))))
    {
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        return this->FMGL(region);
        
    } else {
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        x10_long rank__112000 = (__extension__ ({
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
            ::x10::regionarray::Dist* this__112001 = reinterpret_cast< ::x10::regionarray::Dist*>(this);
            ::x10aux::nullCheck(::x10aux::nullCheck(this__112001)->FMGL(region))->FMGL(rank);
        }))
        ;
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
        return reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            ::x10::regionarray::EmptyRegion* alloc__112002 =
               (new (::x10aux::alloc_z< ::x10::regionarray::EmptyRegion>()) ::x10::regionarray::EmptyRegion());
            (alloc__112002)->::x10::regionarray::EmptyRegion::_constructor(
              rank__112000);
            alloc__112002;
        }))
        );
        
    }
    
}

//#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
::x10::regionarray::Region* x10::regionarray::ConstantDist::__apply(
  ::x10::lang::Place p) {
    return this->x10::regionarray::ConstantDist::get(p);
    
}

//#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
::x10::lang::Place x10::regionarray::ConstantDist::__apply(
  ::x10::lang::Point* pt) {
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    return this->FMGL(onePlace);
    
}

//#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
::x10::lang::Place x10::regionarray::ConstantDist::__apply(
  x10_long i0) {
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    return this->FMGL(onePlace);
    
}

//#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
::x10::lang::Place x10::regionarray::ConstantDist::__apply(
  x10_long i0, x10_long i1) {
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    return this->FMGL(onePlace);
    
}

//#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
::x10::lang::Place x10::regionarray::ConstantDist::__apply(
  x10_long i0, x10_long i1, x10_long i2) {
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    return this->FMGL(onePlace);
    
}

//#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
::x10::lang::Place x10::regionarray::ConstantDist::__apply(
  x10_long i0, x10_long i1, x10_long i2, x10_long i3) {
    
    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    return this->FMGL(onePlace);
    
}

//#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
x10_long x10::regionarray::ConstantDist::offset(::x10::lang::Point* pt) {
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    x10_long offset = ::x10aux::nullCheck(this->FMGL(region))->indexOf(
                        pt);
    
    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    return offset;
    
}

//#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
x10_long x10::regionarray::ConstantDist::offset(x10_long i0) {
    
    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    x10_long offset = ::x10aux::nullCheck(this->FMGL(region))->indexOf(
                        i0);
    
    //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    return offset;
    
}

//#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
x10_long x10::regionarray::ConstantDist::offset(x10_long i0,
                                                x10_long i1) {
    
    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    x10_long offset = ::x10aux::nullCheck(this->FMGL(region))->indexOf(
                        i0, i1);
    
    //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    return offset;
    
}

//#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
x10_long x10::regionarray::ConstantDist::offset(x10_long i0,
                                                x10_long i1,
                                                x10_long i2) {
    
    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    x10_long offset = ::x10aux::nullCheck(this->FMGL(region))->indexOf(
                        i0, i1, i2);
    
    //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    return offset;
    
}

//#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
x10_long x10::regionarray::ConstantDist::offset(x10_long i0,
                                                x10_long i1,
                                                x10_long i2,
                                                x10_long i3) {
    
    //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    x10_long offset = ::x10aux::nullCheck(this->FMGL(region))->indexOf(
                        i0, i1, i2, i3);
    
    //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    return offset;
    
}

//#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
x10_long x10::regionarray::ConstantDist::maxOffset() {
    
    //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    return ::x10aux::nullCheck(this->FMGL(region))->size();
    
}

//#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
::x10::regionarray::Dist* x10::regionarray::ConstantDist::restriction(
  ::x10::regionarray::Region* r) {
    
    //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    ::x10::regionarray::WrappedDistRegionRestricted* alloc__112003 =
       (new (::x10aux::alloc_z< ::x10::regionarray::WrappedDistRegionRestricted>()) ::x10::regionarray::WrappedDistRegionRestricted());
    (alloc__112003)->::x10::regionarray::WrappedDistRegionRestricted::_constructor(
      reinterpret_cast< ::x10::regionarray::Dist*>(this),
      r);
    return alloc__112003;
    
}

//#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
::x10::regionarray::Dist* x10::regionarray::ConstantDist::restriction(
  ::x10::lang::Place p) {
    
    //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    ::x10::regionarray::WrappedDistPlaceRestricted* alloc__112004 =
       (new (::x10aux::alloc_z< ::x10::regionarray::WrappedDistPlaceRestricted>()) ::x10::regionarray::WrappedDistPlaceRestricted());
    (alloc__112004)->::x10::regionarray::WrappedDistPlaceRestricted::_constructor(
      reinterpret_cast< ::x10::regionarray::Dist*>(this),
      p);
    return alloc__112004;
    
}

//#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
x10_boolean x10::regionarray::ConstantDist::equals(::x10::lang::Any* thatObj) {
    
    //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    if (!(::x10aux::instanceof< ::x10::regionarray::ConstantDist*>(thatObj)))
    {
        return false;
        
    }
    
    //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    ::x10::regionarray::ConstantDist* that = ::x10aux::class_cast< ::x10::regionarray::ConstantDist*>(thatObj);
    
    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
    return ((__extension__ ({
        ::x10::lang::Place this__111995 = this->FMGL(onePlace);
        
        //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        ::x10::lang::Place p__111994 = ::x10aux::nullCheck(that)->FMGL(onePlace);
        (::x10aux::struct_equals(p__111994->FMGL(id), this__111995->FMGL(id)));
    }))
     && ::x10aux::nullCheck(this->FMGL(region))->equals(reinterpret_cast< ::x10::lang::Any*>(::x10aux::nullCheck(that)->FMGL(region))));
    
}

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/ConstantDist.x10"
::x10::regionarray::ConstantDist* x10::regionarray::ConstantDist::x10__regionarray__ConstantDist____this__x10__regionarray__ConstantDist(
  ) {
    return this;
    
}
void x10::regionarray::ConstantDist::__fieldInitializers_x10_regionarray_ConstantDist(
  ) {
 
}
const ::x10aux::serialization_id_t x10::regionarray::ConstantDist::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::ConstantDist::_deserializer);

void x10::regionarray::ConstantDist::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::regionarray::Dist::_serialize_body(buf);
    buf.write(this->FMGL(onePlace));
    
}

::x10::lang::Reference* ::x10::regionarray::ConstantDist::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::ConstantDist* this_ = new (::x10aux::alloc_z< ::x10::regionarray::ConstantDist>()) ::x10::regionarray::ConstantDist();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::regionarray::ConstantDist::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::Dist::_deserialize_body(buf);
    FMGL(onePlace) = buf.read< ::x10::lang::Place>();
}

::x10aux::RuntimeType x10::regionarray::ConstantDist::rtt;
void x10::regionarray::ConstantDist::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::regionarray::Dist>()};
    rtt.initStageTwo("x10.regionarray.ConstantDist",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of ConstantDist */
/*************************************************/
