/*************************************************/
/* START of WrappedDistRegionRestricted */
#include <x10/regionarray/WrappedDistRegionRestricted.h>

#include <x10/regionarray/Dist.h>
#include <x10/regionarray/Region.h>
#include <x10/lang/PlaceGroup.h>
#include <x10/lang/Long.h>
#include <x10/lang/Iterable.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Place.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/lang/Int.h>
#include <x10/lang/Point.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/ArrayIndexOutOfBoundsException.h>
#include <x10/lang/String.h>
#include <x10/regionarray/WrappedDistPlaceRestricted.h>
#include <x10/lang/Any.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_REGIONARRAY_WRAPPEDDISTREGIONRESTRICTED__CLOSURE__1_CLOSURE
#define X10_REGIONARRAY_WRAPPEDDISTREGIONRESTRICTED__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_WrappedDistRegionRestricted__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::Region*>::itable<x10_regionarray_WrappedDistRegionRestricted__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::regionarray::Region* __apply(x10_long i) {
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        return ::x10aux::nullCheck(::x10aux::nullCheck(saved_this->FMGL(base))->get(
                                     (__extension__ ({
                                         ::x10::lang::Place alloc__111635 =
                                            ::x10::lang::Place::_alloc();
                                         (alloc__111635)->::x10::lang::Place::_constructor(
                                           ((x10_long)(((x10_int) (i)))));
                                         alloc__111635;
                                     }))
                                     ))->intersection(saved_this->FMGL(filter));
        
    }
    
    // captured environment
    ::x10::regionarray::WrappedDistRegionRestricted* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_WrappedDistRegionRestricted__closure__1* storage = ::x10aux::alloc_z<x10_regionarray_WrappedDistRegionRestricted__closure__1>();
        buf.record_reference(storage);
        ::x10::regionarray::WrappedDistRegionRestricted* that_saved_this = buf.read< ::x10::regionarray::WrappedDistRegionRestricted*>();
        x10_regionarray_WrappedDistRegionRestricted__closure__1* this_ = new (storage) x10_regionarray_WrappedDistRegionRestricted__closure__1(that_saved_this);
        return this_;
    }
    
    x10_regionarray_WrappedDistRegionRestricted__closure__1(::x10::regionarray::WrappedDistRegionRestricted* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::Region*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::Region*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10:35";
    }

};

#endif // X10_REGIONARRAY_WRAPPEDDISTREGIONRESTRICTED__CLOSURE__1_CLOSURE
::x10::lang::Fun_0_1< ::x10::lang::Point*, ::x10::lang::Place>::itable< ::x10::regionarray::WrappedDistRegionRestricted >  x10::regionarray::WrappedDistRegionRestricted::_itable_0(&x10::regionarray::WrappedDistRegionRestricted::equals, &::x10::lang::X10Class::hashCode, &x10::regionarray::WrappedDistRegionRestricted::__apply, &::x10::regionarray::Dist::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::regionarray::WrappedDistRegionRestricted >  x10::regionarray::WrappedDistRegionRestricted::_itable_1(&x10::regionarray::WrappedDistRegionRestricted::equals, &::x10::lang::X10Class::hashCode, &::x10::regionarray::Dist::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Iterable< ::x10::lang::Point*>::itable< ::x10::regionarray::WrappedDistRegionRestricted >  x10::regionarray::WrappedDistRegionRestricted::_itable_2(&x10::regionarray::WrappedDistRegionRestricted::equals, &::x10::lang::X10Class::hashCode, &::x10::regionarray::Dist::iterator, &::x10::regionarray::Dist::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::regionarray::WrappedDistRegionRestricted::_itables[4] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::Point*, ::x10::lang::Place> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Point*> >, &_itable_2), ::x10aux::itable_entry(NULL, (void*)"::x10::regionarray::WrappedDistRegionRestricted")};

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
void x10::regionarray::WrappedDistRegionRestricted::_constructor(::x10::regionarray::Dist* d,
                                                                 ::x10::regionarray::Region* r) {
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    ::x10::regionarray::Dist* this__116967 = this;
    
    //#line 659 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10::regionarray::Region* region__116968 = ::x10aux::nullCheck(::x10aux::nullCheck(d)->FMGL(region))->intersection(
                                                   r);
    
    //#line 660 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10aux::nullCheck(this__116967)->FMGL(region) = region__116968;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    ::x10::regionarray::WrappedDistRegionRestricted* this__116966 =
      this;
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    this->FMGL(base) = d;
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    this->FMGL(filter) = r;
}
::x10::regionarray::WrappedDistRegionRestricted* x10::regionarray::WrappedDistRegionRestricted::_make(
  ::x10::regionarray::Dist* d, ::x10::regionarray::Region* r)
{
    ::x10::regionarray::WrappedDistRegionRestricted* this_ = new (::x10aux::alloc_z< ::x10::regionarray::WrappedDistRegionRestricted>()) ::x10::regionarray::WrappedDistRegionRestricted();
    this_->_constructor(d, r);
    return this_;
}



//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
::x10::lang::PlaceGroup* x10::regionarray::WrappedDistRegionRestricted::places(
  ) {
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    return ::x10aux::nullCheck(this->FMGL(base))->places();
    
}

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
x10_long x10::regionarray::WrappedDistRegionRestricted::numPlaces(
  ) {
    return ::x10aux::nullCheck(this->FMGL(base))->numPlaces();
    
}

//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
::x10::lang::Iterable< ::x10::regionarray::Region*>* x10::regionarray::WrappedDistRegionRestricted::regions(
  ) {
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    return reinterpret_cast< ::x10::lang::Iterable< ::x10::regionarray::Region*>*>(::x10::lang::Rail< ::x10::regionarray::Region* >::_make(((x10_long)::x10aux::num_hosts),
                                                                                                                                           reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::Region*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::Region*> >(sizeof(x10_regionarray_WrappedDistRegionRestricted__closure__1)))x10_regionarray_WrappedDistRegionRestricted__closure__1(this)))));
    
}

//#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
::x10::regionarray::Region* x10::regionarray::WrappedDistRegionRestricted::get(
  ::x10::lang::Place p) {
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    return ::x10aux::nullCheck(::x10aux::nullCheck(this->FMGL(base))->get(
                                 p))->intersection(this->FMGL(filter));
    
}

//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
::x10::regionarray::Region* x10::regionarray::WrappedDistRegionRestricted::__apply(
  ::x10::lang::Place p) {
    return this->x10::regionarray::WrappedDistRegionRestricted::get(
             p);
    
}

//#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
::x10::lang::Place x10::regionarray::WrappedDistRegionRestricted::__apply(
  ::x10::lang::Point* pt) {
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    if (::x10aux::nullCheck(this->FMGL(filter))->contains(
          pt)) {
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        return ::x10aux::nullCheck(this->FMGL(base))->__apply(
                 pt);
        
    } else {
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__128027 = ::x10aux::makeStringLit("point "); strLit__128027; })), pt), (__extension__ ({ static ::x10::lang::String* strLit__128028 = ::x10aux::makeStringLit(" not contained in distribution"); strLit__128028; }))))));
    }
    
}

//#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
::x10::lang::Place x10::regionarray::WrappedDistRegionRestricted::__apply(
  x10_long i0) {
    return this->x10::regionarray::WrappedDistRegionRestricted::__apply(
             (__extension__ ({
                 
                 //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                 x10_long i__116949 = i0;
                 (__extension__ ({
                     ::x10::lang::Point* alloc__116950 = 
                     (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
                     (alloc__116950)->::x10::lang::Point::_constructor(
                       i__116949);
                     alloc__116950;
                 }))
                 ;
             }))
             );
    
}

//#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
::x10::lang::Place x10::regionarray::WrappedDistRegionRestricted::__apply(
  x10_long i0, x10_long i1) {
    return this->x10::regionarray::WrappedDistRegionRestricted::__apply(
             (__extension__ ({
                 
                 //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                 x10_long i__116952 = i0;
                 x10_long i__116953 = i1;
                 (__extension__ ({
                     ::x10::lang::Point* alloc__116954 = 
                     (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
                     (alloc__116954)->::x10::lang::Point::_constructor(
                       i__116952, i__116953);
                     alloc__116954;
                 }))
                 ;
             }))
             );
    
}

//#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
::x10::lang::Place x10::regionarray::WrappedDistRegionRestricted::__apply(
  x10_long i0, x10_long i1, x10_long i2) {
    return this->x10::regionarray::WrappedDistRegionRestricted::__apply(
             (__extension__ ({
                 
                 //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                 x10_long i__116956 = i0;
                 x10_long i__116957 = i1;
                 x10_long i__116958 = i2;
                 (__extension__ ({
                     ::x10::lang::Point* alloc__116959 = 
                     (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
                     (alloc__116959)->::x10::lang::Point::_constructor(
                       i__116956, i__116957, i__116958);
                     alloc__116959;
                 }))
                 ;
             }))
             );
    
}

//#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
::x10::lang::Place x10::regionarray::WrappedDistRegionRestricted::__apply(
  x10_long i0, x10_long i1, x10_long i2, x10_long i3) {
    return this->x10::regionarray::WrappedDistRegionRestricted::__apply(
             (__extension__ ({
                 
                 //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                 x10_long i__116961 = i0;
                 x10_long i__116962 = i1;
                 x10_long i__116963 = i2;
                 x10_long i__116964 = i3;
                 (__extension__ ({
                     ::x10::lang::Point* alloc__116965 = 
                     (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
                     (alloc__116965)->::x10::lang::Point::_constructor(
                       i__116961, i__116962, i__116963, i__116964);
                     alloc__116965;
                 }))
                 ;
             }))
             );
    
}

//#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
x10_long x10::regionarray::WrappedDistRegionRestricted::offset(
  ::x10::lang::Point* pt) {
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    if (::x10aux::nullCheck(this->FMGL(filter))->contains(
          pt)) {
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        return ::x10aux::nullCheck(this->FMGL(base))->offset(
                 pt);
        
    } else {
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__128063 = ::x10aux::makeStringLit("point "); strLit__128063; })), pt), (__extension__ ({ static ::x10::lang::String* strLit__128064 = ::x10aux::makeStringLit(" not contained in distribution"); strLit__128064; }))))));
    }
    
}

//#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
x10_long x10::regionarray::WrappedDistRegionRestricted::maxOffset(
  ) {
    return ::x10aux::nullCheck(this->FMGL(base))->maxOffset();
    
}

//#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
::x10::regionarray::Dist* x10::regionarray::WrappedDistRegionRestricted::restriction(
  ::x10::regionarray::Region* r) {
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    ::x10::regionarray::WrappedDistRegionRestricted* alloc__116969 =
       (new (::x10aux::alloc_z< ::x10::regionarray::WrappedDistRegionRestricted>()) ::x10::regionarray::WrappedDistRegionRestricted());
    (alloc__116969)->::x10::regionarray::WrappedDistRegionRestricted::_constructor(
      this->FMGL(base), ::x10aux::nullCheck(this->FMGL(filter))->intersection(
                          r));
    return alloc__116969;
    
}

//#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
::x10::regionarray::Dist* x10::regionarray::WrappedDistRegionRestricted::restriction(
  ::x10::lang::Place p) {
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    ::x10::regionarray::WrappedDistPlaceRestricted* alloc__116970 =
       (new (::x10aux::alloc_z< ::x10::regionarray::WrappedDistPlaceRestricted>()) ::x10::regionarray::WrappedDistPlaceRestricted());
    (alloc__116970)->::x10::regionarray::WrappedDistPlaceRestricted::_constructor(
      reinterpret_cast< ::x10::regionarray::Dist*>(this),
      p);
    return alloc__116970;
    
}

//#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
x10_boolean x10::regionarray::WrappedDistRegionRestricted::equals(
  ::x10::lang::Any* thatObj) {
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    if (!(::x10aux::instanceof< ::x10::regionarray::WrappedDistRegionRestricted*>(thatObj)))
    {
        return false;
        
    }
    
    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    ::x10::regionarray::WrappedDistRegionRestricted* that =
      ::x10aux::class_cast< ::x10::regionarray::WrappedDistRegionRestricted*>(thatObj);
    
    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
    return (::x10aux::nullCheck(this->FMGL(base))->equals(
              reinterpret_cast< ::x10::lang::Any*>(::x10aux::nullCheck(that)->FMGL(base))) &&
    ::x10aux::nullCheck(this->FMGL(filter))->equals(reinterpret_cast< ::x10::lang::Any*>(::x10aux::nullCheck(that)->FMGL(filter))));
    
}

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/WrappedDistRegionRestricted.x10"
::x10::regionarray::WrappedDistRegionRestricted* x10::regionarray::WrappedDistRegionRestricted::x10__regionarray__WrappedDistRegionRestricted____this__x10__regionarray__WrappedDistRegionRestricted(
  ) {
    return this;
    
}
void x10::regionarray::WrappedDistRegionRestricted::__fieldInitializers_x10_regionarray_WrappedDistRegionRestricted(
  ) {
 
}
const ::x10aux::serialization_id_t x10::regionarray::WrappedDistRegionRestricted::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::WrappedDistRegionRestricted::_deserializer);

void x10::regionarray::WrappedDistRegionRestricted::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::regionarray::Dist::_serialize_body(buf);
    buf.write(this->FMGL(base));
    buf.write(this->FMGL(filter));
    
}

::x10::lang::Reference* ::x10::regionarray::WrappedDistRegionRestricted::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::WrappedDistRegionRestricted* this_ = new (::x10aux::alloc_z< ::x10::regionarray::WrappedDistRegionRestricted>()) ::x10::regionarray::WrappedDistRegionRestricted();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::regionarray::WrappedDistRegionRestricted::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::Dist::_deserialize_body(buf);
    FMGL(base) = buf.read< ::x10::regionarray::Dist*>();
    FMGL(filter) = buf.read< ::x10::regionarray::Region*>();
}

::x10aux::RuntimeType x10::regionarray::WrappedDistRegionRestricted::rtt;
void x10::regionarray::WrappedDistRegionRestricted::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::regionarray::Dist>()};
    rtt.initStageTwo("x10.regionarray.WrappedDistRegionRestricted",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::Region*>::itable<x10_regionarray_WrappedDistRegionRestricted__closure__1>x10_regionarray_WrappedDistRegionRestricted__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_WrappedDistRegionRestricted__closure__1::__apply, &x10_regionarray_WrappedDistRegionRestricted__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_WrappedDistRegionRestricted__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::regionarray::Region*> >, &x10_regionarray_WrappedDistRegionRestricted__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_WrappedDistRegionRestricted__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_WrappedDistRegionRestricted__closure__1::_deserialize);

/* END of WrappedDistRegionRestricted */
/*************************************************/
