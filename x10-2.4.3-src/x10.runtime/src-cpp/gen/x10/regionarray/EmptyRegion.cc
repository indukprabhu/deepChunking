/*************************************************/
/* START of EmptyRegion */
#include <x10/regionarray/EmptyRegion.h>

#include <x10/regionarray/Region.h>
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/IllegalArgumentException.h>
#include <x10/lang/String.h>
#include <x10/lang/Point.h>
#include <x10/lang/IllegalOperationException.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/lang/Iterator.h>
#include <x10/regionarray/EmptyRegion__ERIterator.h>
#include <x10/compiler/Synthetic.h>
::x10::lang::Iterable< ::x10::lang::Point*>::itable< ::x10::regionarray::EmptyRegion >  x10::regionarray::EmptyRegion::_itable_0(&::x10::regionarray::Region::equals, &::x10::lang::X10Class::hashCode, &x10::regionarray::EmptyRegion::iterator, &x10::regionarray::EmptyRegion::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::regionarray::EmptyRegion >  x10::regionarray::EmptyRegion::_itable_1(&::x10::regionarray::Region::equals, &::x10::lang::X10Class::hashCode, &x10::regionarray::EmptyRegion::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::regionarray::EmptyRegion::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Point*> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::regionarray::EmptyRegion")};

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
void x10::regionarray::EmptyRegion::_constructor(x10_long rank) {
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    ::x10::regionarray::Region* this__112446 = this;
    
    //#line 556 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    x10_long r__112447 = rank;
    
    //#line 557 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    x10_boolean isRail__112444 = (((::x10aux::struct_equals(r__112447, ((x10_long)1ll))) &&
    true) && false);
    
    //#line 558 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    ::x10aux::nullCheck(this__112446)->FMGL(rank) = r__112447;
    ::x10aux::nullCheck(this__112446)->FMGL(rect) = true;
    ::x10aux::nullCheck(this__112446)->FMGL(zeroBased) = false;
    ::x10aux::nullCheck(this__112446)->FMGL(rail) = isRail__112444;
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    ::x10::regionarray::EmptyRegion* this__112445 = this;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    if (((rank) < (((x10_long)0ll)))) {
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::IllegalArgumentException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126601 = ::x10aux::makeStringLit("Rank is negative ("); strLit__126601; })), rank), (__extension__ ({ static ::x10::lang::String* strLit__126602 = ::x10aux::makeStringLit(")"); strLit__126602; }))))));
    }
    
}
::x10::regionarray::EmptyRegion* x10::regionarray::EmptyRegion::_make(
  x10_long rank) {
    ::x10::regionarray::EmptyRegion* this_ = new (::x10aux::alloc_z< ::x10::regionarray::EmptyRegion>()) ::x10::regionarray::EmptyRegion();
    this_->_constructor(rank);
    return this_;
}



//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
x10_boolean x10::regionarray::EmptyRegion::isConvex() {
    return true;
    
}

//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
x10_boolean x10::regionarray::EmptyRegion::isEmpty() {
    return true;
    
}

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
x10_long x10::regionarray::EmptyRegion::size() {
    return ((x10_long)0ll);
    
}

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
x10_long x10::regionarray::EmptyRegion::indexOf(::x10::lang::Point* id__132) {
    return ((x10_long)-1ll);
    
}

//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
::x10::regionarray::Region* x10::regionarray::EmptyRegion::intersection(
  ::x10::regionarray::Region* that) {
    return this;
    
}

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
::x10::regionarray::Region* x10::regionarray::EmptyRegion::product(
  ::x10::regionarray::Region* that) {
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    ::x10::regionarray::EmptyRegion* alloc__112448 =  (new (::x10aux::alloc_z< ::x10::regionarray::EmptyRegion>()) ::x10::regionarray::EmptyRegion());
    (alloc__112448)->::x10::regionarray::EmptyRegion::_constructor(
      ((this->FMGL(rank)) + (::x10aux::nullCheck(that)->FMGL(rank))));
    return reinterpret_cast< ::x10::regionarray::Region*>(alloc__112448);
    
}

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
::x10::regionarray::Region* x10::regionarray::EmptyRegion::projection(
  x10_long axis) {
    ::x10::regionarray::EmptyRegion* alloc__112449 =  (new (::x10aux::alloc_z< ::x10::regionarray::EmptyRegion>()) ::x10::regionarray::EmptyRegion());
    (alloc__112449)->::x10::regionarray::EmptyRegion::_constructor(
      ((x10_long)1ll));
    return alloc__112449;
    
}

//#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
::x10::regionarray::Region* x10::regionarray::EmptyRegion::translate(
  ::x10::lang::Point* p) {
    return reinterpret_cast< ::x10::regionarray::Region*>(this);
    
}

//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
::x10::regionarray::Region* x10::regionarray::EmptyRegion::eliminate(
  x10_long i) {
    ::x10::regionarray::EmptyRegion* alloc__112450 =  (new (::x10aux::alloc_z< ::x10::regionarray::EmptyRegion>()) ::x10::regionarray::EmptyRegion());
    (alloc__112450)->::x10::regionarray::EmptyRegion::_constructor(
      ((this->FMGL(rank)) - (((x10_long)1ll))));
    return reinterpret_cast< ::x10::regionarray::Region*>(alloc__112450);
    
}

//#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
::x10::regionarray::Region* x10::regionarray::EmptyRegion::computeBoundingBox(
  ) {
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::IllegalOperationException::_make((__extension__ ({ static ::x10::lang::String* strLit__126615 = ::x10aux::makeStringLit("bounding box not not defined for empty region"); strLit__126615; })))));
}

//#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
::x10::lang::Fun_0_1<x10_long, x10_long>* x10::regionarray::EmptyRegion::min(
  ) {
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::IllegalOperationException::_make((__extension__ ({ static ::x10::lang::String* strLit__126616 = ::x10aux::makeStringLit("min not not defined for empty region"); strLit__126616; })))));
}

//#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
::x10::lang::Fun_0_1<x10_long, x10_long>* x10::regionarray::EmptyRegion::max(
  ) {
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::IllegalOperationException::_make((__extension__ ({ static ::x10::lang::String* strLit__126617 = ::x10aux::makeStringLit("max not not defined for empty region"); strLit__126617; })))));
}

//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
x10_boolean x10::regionarray::EmptyRegion::contains(::x10::regionarray::Region* that) {
    return ::x10aux::nullCheck(that)->isEmpty();
    
}

//#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
x10_boolean x10::regionarray::EmptyRegion::contains(::x10::lang::Point* p) {
    return false;
    
}

//#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
::x10::lang::Iterator< ::x10::lang::Point*>* x10::regionarray::EmptyRegion::iterator(
  ) {
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    ::x10::regionarray::EmptyRegion__ERIterator* alloc__112453 =
       (new (::x10aux::alloc_z< ::x10::regionarray::EmptyRegion__ERIterator>()) ::x10::regionarray::EmptyRegion__ERIterator());
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    x10_long r__112452 = this->FMGL(rank);
    alloc__112453->FMGL(myRank) = r__112452;
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    return reinterpret_cast< ::x10::lang::Iterator< ::x10::lang::Point*>*>(alloc__112453);
    
}

//#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
::x10::lang::String* x10::regionarray::EmptyRegion::toString(
  ) {
    return ::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126622 = ::x10aux::makeStringLit("empty("); strLit__126622; })), this->FMGL(rank)), (__extension__ ({ static ::x10::lang::String* strLit__126623 = ::x10aux::makeStringLit(")"); strLit__126623; })));
    
}

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
::x10::regionarray::EmptyRegion* x10::regionarray::EmptyRegion::x10__regionarray__EmptyRegion____this__x10__regionarray__EmptyRegion(
  ) {
    return this;
    
}
void x10::regionarray::EmptyRegion::__fieldInitializers_x10_regionarray_EmptyRegion(
  ) {
 
}
const ::x10aux::serialization_id_t x10::regionarray::EmptyRegion::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::EmptyRegion::_deserializer);

void x10::regionarray::EmptyRegion::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::regionarray::Region::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::regionarray::EmptyRegion::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::EmptyRegion* this_ = new (::x10aux::alloc_z< ::x10::regionarray::EmptyRegion>()) ::x10::regionarray::EmptyRegion();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::regionarray::EmptyRegion::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::Region::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::regionarray::EmptyRegion::rtt;
void x10::regionarray::EmptyRegion::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::regionarray::Region>()};
    rtt.initStageTwo("x10.regionarray.EmptyRegion",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of EmptyRegion */
/*************************************************/
/*************************************************/
/* START of EmptyRegion$ERIterator */
#include <x10/regionarray/EmptyRegion__ERIterator.h>

#include <x10/lang/Iterator.h>
#include <x10/lang/Point.h>
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/util/NoSuchElementException.h>
#include <x10/compiler/Synthetic.h>

//#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
::x10::lang::Iterator< ::x10::lang::Point*>::itable< ::x10::regionarray::EmptyRegion__ERIterator >  x10::regionarray::EmptyRegion__ERIterator::_itable_0(&::x10::lang::X10Class::equals, &x10::regionarray::EmptyRegion__ERIterator::hasNext, &::x10::lang::X10Class::hashCode, &x10::regionarray::EmptyRegion__ERIterator::next, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::regionarray::EmptyRegion__ERIterator >  x10::regionarray::EmptyRegion__ERIterator::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::regionarray::EmptyRegion__ERIterator::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterator< ::x10::lang::Point*> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::regionarray::EmptyRegion__ERIterator")};

//#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
void x10::regionarray::EmptyRegion__ERIterator::_constructor(x10_long r) {
    FMGL(myRank) = r;
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    ::x10::regionarray::EmptyRegion__ERIterator* this__112451 = this;
    
}
::x10::regionarray::EmptyRegion__ERIterator* x10::regionarray::EmptyRegion__ERIterator::_make(
  x10_long r) {
    ::x10::regionarray::EmptyRegion__ERIterator* this_ = new (::x10aux::alloc_z< ::x10::regionarray::EmptyRegion__ERIterator>()) ::x10::regionarray::EmptyRegion__ERIterator();
    this_->_constructor(r);
    return this_;
}



//#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
x10_boolean x10::regionarray::EmptyRegion__ERIterator::hasNext() {
    return false;
    
}

//#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
::x10::lang::Point* x10::regionarray::EmptyRegion__ERIterator::next(
  ) {
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::util::NoSuchElementException::_make()));
}

//#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/EmptyRegion.x10"
::x10::regionarray::EmptyRegion__ERIterator* x10::regionarray::EmptyRegion__ERIterator::x10__regionarray__EmptyRegion__ERIterator____this__x10__regionarray__EmptyRegion__ERIterator(
  ) {
    return this;
    
}
void x10::regionarray::EmptyRegion__ERIterator::__fieldInitializers_x10_regionarray_EmptyRegion_ERIterator(
  ) {
 
}
const ::x10aux::serialization_id_t x10::regionarray::EmptyRegion__ERIterator::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::EmptyRegion__ERIterator::_deserializer);

void x10::regionarray::EmptyRegion__ERIterator::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(myRank));
    
}

::x10::lang::Reference* ::x10::regionarray::EmptyRegion__ERIterator::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::EmptyRegion__ERIterator* this_ = new (::x10aux::alloc_z< ::x10::regionarray::EmptyRegion__ERIterator>()) ::x10::regionarray::EmptyRegion__ERIterator();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::regionarray::EmptyRegion__ERIterator::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(myRank) = buf.read<x10_long>();
}

::x10aux::RuntimeType x10::regionarray::EmptyRegion__ERIterator::rtt;
void x10::regionarray::EmptyRegion__ERIterator::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Iterator< ::x10::lang::Point*> >()};
    rtt.initStageTwo("x10.regionarray.EmptyRegion.ERIterator",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of EmptyRegion$ERIterator */
/*************************************************/
