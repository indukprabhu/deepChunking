/*************************************************/
/* START of RectRegion1D */
#include <x10/regionarray/RectRegion1D.h>

#include <x10/regionarray/Region.h>
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/regionarray/UnboundedRegionException.h>
#include <x10/lang/Point.h>
#include <x10/lang/ArrayIndexOutOfBoundsException.h>
#include <x10/lang/String.h>
#include <x10/regionarray/RectRegion.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/lang/Iterator.h>
#include <x10/regionarray/RectRegion1D__RRIterator.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_REGIONARRAY_RECTREGION1D__CLOSURE__1_CLOSURE
#define X10_REGIONARRAY_RECTREGION1D__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion1D__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion1D__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return saved_this->x10::regionarray::RectRegion1D::min(i);
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion1D* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion1D__closure__1* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion1D__closure__1>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion1D* that_saved_this = buf.read< ::x10::regionarray::RectRegion1D*>();
        x10_regionarray_RectRegion1D__closure__1* this_ = new (storage) x10_regionarray_RectRegion1D__closure__1(that_saved_this);
        return this_;
    }
    
    x10_regionarray_RectRegion1D__closure__1(::x10::regionarray::RectRegion1D* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10:108";
    }

};

#endif // X10_REGIONARRAY_RECTREGION1D__CLOSURE__1_CLOSURE
#ifndef X10_REGIONARRAY_RECTREGION1D__CLOSURE__2_CLOSURE
#define X10_REGIONARRAY_RECTREGION1D__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_RectRegion1D__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion1D__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return saved_this->x10::regionarray::RectRegion1D::max(i);
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion1D* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_RectRegion1D__closure__2* storage = ::x10aux::alloc_z<x10_regionarray_RectRegion1D__closure__2>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion1D* that_saved_this = buf.read< ::x10::regionarray::RectRegion1D*>();
        x10_regionarray_RectRegion1D__closure__2* this_ = new (storage) x10_regionarray_RectRegion1D__closure__2(that_saved_this);
        return this_;
    }
    
    x10_regionarray_RectRegion1D__closure__2(::x10::regionarray::RectRegion1D* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10:109";
    }

};

#endif // X10_REGIONARRAY_RECTREGION1D__CLOSURE__2_CLOSURE
::x10::lang::Iterable< ::x10::lang::Point*>::itable< ::x10::regionarray::RectRegion1D >  x10::regionarray::RectRegion1D::_itable_0(&::x10::regionarray::Region::equals, &::x10::lang::X10Class::hashCode, &x10::regionarray::RectRegion1D::iterator, &x10::regionarray::RectRegion1D::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::regionarray::RectRegion1D >  x10::regionarray::RectRegion1D::_itable_1(&::x10::regionarray::Region::equals, &::x10::lang::X10Class::hashCode, &x10::regionarray::RectRegion1D::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::regionarray::RectRegion1D::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Point*> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::regionarray::RectRegion1D")};

//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"

//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"

//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"

//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
void x10::regionarray::RectRegion1D::_constructor(x10_long minArg, x10_long maxArg) {
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    ::x10::regionarray::Region* this__116460 = this;
    
    //#line 556 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    x10_boolean z__116461 = (::x10aux::struct_equals(minArg, ((x10_long)0ll)));
    
    //#line 557 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    x10_boolean isRail__116458 = (true && z__116461);
    
    //#line 558 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    ::x10aux::nullCheck(this__116460)->FMGL(rank) = ((x10_long)1ll);
    ::x10aux::nullCheck(this__116460)->FMGL(rect) = true;
    ::x10aux::nullCheck(this__116460)->FMGL(zeroBased) = z__116461;
    ::x10aux::nullCheck(this__116460)->FMGL(rail) = isRail__116458;
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    ::x10::regionarray::RectRegion1D* this__116459 = this;
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    x10_long s = ((((maxArg) - (minArg))) + (((x10_long)1ll)));
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    if (((::x10aux::struct_equals(minArg, (x10_long)0x8000000000000000LL)) &&
        (::x10aux::struct_equals(maxArg, (x10_long)0x7fffffffffffffffLL))))
    {
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        this->FMGL(size) = ((x10_long)-1ll);
    } else {
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        this->FMGL(size) = ((s) > (((x10_long)0ll))) ? (s) : (((x10_long)0ll));
    }
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    this->FMGL(min) = minArg;
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    this->FMGL(max) = maxArg;
}
::x10::regionarray::RectRegion1D* x10::regionarray::RectRegion1D::_make(x10_long minArg,
                                                                        x10_long maxArg)
{
    ::x10::regionarray::RectRegion1D* this_ = new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D();
    this_->_constructor(minArg, maxArg);
    return this_;
}



//#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
void x10::regionarray::RectRegion1D::_constructor(x10_long maxArg) {
    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    ::x10::regionarray::Region* this__116463 = this;
    
    //#line 565 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    x10_long r__116464 = ((x10_long)(((x10_int)1)));
    
    //#line 566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    ::x10aux::nullCheck(this__116463)->FMGL(rank) = r__116464;
    ::x10aux::nullCheck(this__116463)->FMGL(rect) = true;
    ::x10aux::nullCheck(this__116463)->FMGL(zeroBased) = true;
    ::x10aux::nullCheck(this__116463)->FMGL(rail) = true;
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    ::x10::regionarray::RectRegion1D* this__116462 = this;
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    this->FMGL(size) = ((maxArg) + (((x10_long)1ll)));
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    this->FMGL(min) = ((x10_long)0ll);
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    this->FMGL(max) = maxArg;
}
::x10::regionarray::RectRegion1D* x10::regionarray::RectRegion1D::_make(
  x10_long maxArg) {
    ::x10::regionarray::RectRegion1D* this_ = new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D();
    this_->_constructor(maxArg);
    return this_;
}



//#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
x10_long x10::regionarray::RectRegion1D::size() {
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    if (((this->FMGL(size)) < (((x10_long)0ll)))) {
        ::x10aux::throwException(::x10aux::nullCheck(::x10::regionarray::UnboundedRegionException::_make((__extension__ ({ static ::x10::lang::String* strLit__127154 = ::x10aux::makeStringLit("size exceeds capacity of long"); strLit__127154; })))));
    }
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    return this->FMGL(size);
    
}

//#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
x10_boolean x10::regionarray::RectRegion1D::isConvex() {
    return true;
    
}

//#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
x10_boolean x10::regionarray::RectRegion1D::isEmpty() {
    return (::x10aux::struct_equals(this->FMGL(size), ((x10_long)0ll)));
    
}

//#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
x10_long x10::regionarray::RectRegion1D::indexOf(::x10::lang::Point* pt) {
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    if (!(this->x10::regionarray::RectRegion1D::contains(
            pt))) {
        return ((x10_long)-1ll);
        
    }
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    return ((::x10aux::nullCheck(pt)->x10::lang::Point::__apply(
               ((x10_long)0ll))) - (this->FMGL(min)));
    
}

//#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
x10_long x10::regionarray::RectRegion1D::indexOf(x10_long i0) {
    
    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    if (this->FMGL(zeroBased)) {
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        if (!((__extension__ ({
                ::x10::regionarray::RectRegion1D* this__116436 =
                  this;
                
                //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
                x10_long i__116435 = i0;
                (((i__116435) >= (::x10aux::nullCheck(this__116436)->FMGL(min))) &&
                ((i__116435) <= (::x10aux::nullCheck(this__116436)->FMGL(max))));
            }))
            )) {
            return ((x10_long)-1ll);
            
        }
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        return i0;
        
    } else {
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        if (!((__extension__ ({
                ::x10::regionarray::RectRegion1D* this__116438 =
                  this;
                
                //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
                x10_long i__116437 = i0;
                (((i__116437) >= (::x10aux::nullCheck(this__116438)->FMGL(min))) &&
                ((i__116437) <= (::x10aux::nullCheck(this__116438)->FMGL(max))));
            }))
            )) {
            return ((x10_long)-1ll);
            
        }
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
        return ((i0) - (this->FMGL(min)));
        
    }
    
}

//#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
x10_long x10::regionarray::RectRegion1D::indexOf(x10_long i0,
                                                 x10_long i1) {
    return ((x10_long)-1ll);
    
}

//#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
x10_long x10::regionarray::RectRegion1D::indexOf(x10_long i0,
                                                 x10_long i1,
                                                 x10_long i2) {
    return ((x10_long)-1ll);
    
}

//#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
x10_long x10::regionarray::RectRegion1D::indexOf(x10_long i0,
                                                 x10_long i1,
                                                 x10_long i2,
                                                 x10_long i3) {
    return ((x10_long)-1ll);
    
}

//#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
x10_long x10::regionarray::RectRegion1D::min(x10_long i) {
    
    //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    if ((!::x10aux::struct_equals(i, ((x10_long)0ll)))) {
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__127184 = ::x10aux::makeStringLit("min: "); strLit__127184; })), i), (__extension__ ({ static ::x10::lang::String* strLit__127185 = ::x10aux::makeStringLit(" is not a valid rank for "); strLit__127185; }))), this))));
    }
    
    //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    return this->FMGL(min);
    
}

//#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
x10_long x10::regionarray::RectRegion1D::max(x10_long i) {
    
    //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    if ((!::x10aux::struct_equals(i, ((x10_long)0ll)))) {
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__127188 = ::x10aux::makeStringLit("max: "); strLit__127188; })), i), (__extension__ ({ static ::x10::lang::String* strLit__127189 = ::x10aux::makeStringLit(" is not a valid rank for "); strLit__127189; }))), this))));
    }
    
    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    return this->FMGL(max);
    
}

//#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
::x10::regionarray::Region* x10::regionarray::RectRegion1D::computeBoundingBox(
  ) {
    return this;
    
}

//#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
::x10::regionarray::RectRegion* x10::regionarray::RectRegion1D::toRectRegion(
  ) {
    ::x10::regionarray::RectRegion* alloc__116469 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion>()) ::x10::regionarray::RectRegion());
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    x10_long min__116467 = this->FMGL(min);
    x10_long max__116468 = this->FMGL(max);
    
    //#line 556 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    x10_boolean z__116466 = (::x10aux::struct_equals(min__116467,
                                                     ((x10_long)0ll)));
    
    //#line 557 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    x10_boolean isRail__116465 = (true && z__116466);
    
    //#line 558 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    alloc__116469->FMGL(rank) = ((x10_long)1ll);
    alloc__116469->FMGL(rect) = true;
    alloc__116469->FMGL(zeroBased) = z__116466;
    alloc__116469->FMGL(rail) = isRail__116465;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    alloc__116469->FMGL(polyRep) = (::x10aux::class_cast_unchecked< ::x10::regionarray::Region*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    alloc__116469->FMGL(size) = ((::x10aux::struct_equals(min__116467,
                                                          (x10_long)0x8000000000000000LL)) &&
    (::x10aux::struct_equals(max__116468, (x10_long)0x7fffffffffffffffLL)))
      ? (((x10_long)-1ll)) : (((((max__116468) - (min__116467))) + (((x10_long)1ll))));
    
    //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    alloc__116469->FMGL(min0) = min__116467;
    
    //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    alloc__116469->FMGL(max0) = max__116468;
    
    //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    alloc__116469->FMGL(min1) = alloc__116469->FMGL(min2) =
      alloc__116469->FMGL(min3) = ((x10_long)0ll);
    
    //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    alloc__116469->FMGL(max1) = alloc__116469->FMGL(max2) =
      alloc__116469->FMGL(max3) = ((x10_long)0ll);
    
    //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    alloc__116469->FMGL(mins) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
    alloc__116469->FMGL(maxs) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    return alloc__116469;
    
}

//#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
::x10::lang::Fun_0_1<x10_long, x10_long>* x10::regionarray::RectRegion1D::min(
  ) {
    return reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion1D__closure__1)))x10_regionarray_RectRegion1D__closure__1(this)));
    
}

//#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
::x10::lang::Fun_0_1<x10_long, x10_long>* x10::regionarray::RectRegion1D::max(
  ) {
    return reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_RectRegion1D__closure__2)))x10_regionarray_RectRegion1D__closure__2(this)));
    
}

//#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
x10_boolean x10::regionarray::RectRegion1D::contains(::x10::regionarray::Region* that) {
    
    //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    return this->x10::regionarray::RectRegion1D::toRectRegion()->x10::regionarray::RectRegion::contains(
             that);
    
}

//#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
x10_boolean x10::regionarray::RectRegion1D::contains(::x10::lang::Point* p) {
    
    //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    return this->x10::regionarray::RectRegion1D::toRectRegion()->x10::regionarray::RectRegion::contains(
             p);
    
}

//#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
x10_boolean x10::regionarray::RectRegion1D::contains(x10_long i0) {
    ::x10::regionarray::RectRegion1D* this__116470 = this;
    
    //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    x10_long i__116471 = i0;
    
    //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    return (((i__116471) >= (::x10aux::nullCheck(this__116470)->FMGL(min))) &&
    ((i__116471) <= (::x10aux::nullCheck(this__116470)->FMGL(max))));
    
}

//#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
x10_boolean x10::regionarray::RectRegion1D::containsInternal(
  x10_long i0) {
    
    //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    return (((i0) >= (this->FMGL(min))) && ((i0) <= (this->FMGL(max))));
    
}

//#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
::x10::regionarray::Region* x10::regionarray::RectRegion1D::toPolyRegion(
  ) {
    
    //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    return this->x10::regionarray::RectRegion1D::toRectRegion()->x10::regionarray::RectRegion::toPolyRegion();
    
}

//#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
::x10::regionarray::Region* x10::regionarray::RectRegion1D::intersection(
  ::x10::regionarray::Region* that) {
    
    //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    return this->x10::regionarray::RectRegion1D::toRectRegion()->x10::regionarray::RectRegion::intersection(
             that);
    
}

//#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
::x10::regionarray::Region* x10::regionarray::RectRegion1D::product(
  ::x10::regionarray::Region* that) {
    
    //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    return this->x10::regionarray::RectRegion1D::toRectRegion()->x10::regionarray::RectRegion::product(
             that);
    
}

//#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
::x10::regionarray::Region* x10::regionarray::RectRegion1D::translate(
  ::x10::lang::Point* v) {
    
    //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    ::x10::regionarray::RectRegion1D* alloc__116472 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
    (alloc__116472)->::x10::regionarray::RectRegion1D::_constructor(
      ((this->FMGL(min)) + (::x10aux::nullCheck(v)->x10::lang::Point::__apply(
                              ((x10_long)0ll)))), ((this->FMGL(max)) + (::x10aux::nullCheck(v)->x10::lang::Point::__apply(
                                                                          ((x10_long)0ll)))));
    return alloc__116472;
    
}

//#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
::x10::regionarray::Region* x10::regionarray::RectRegion1D::projection(
  x10_long axis) {
    
    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    if ((::x10aux::struct_equals(axis, ((x10_long)0ll))))
    {
        return this;
        
    }
    
    //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__127213 = ::x10aux::makeStringLit("projection: "); strLit__127213; })), axis), (__extension__ ({ static ::x10::lang::String* strLit__127214 = ::x10aux::makeStringLit(" is not a valid rank for "); strLit__127214; }))), this))));
}

//#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
::x10::regionarray::Region* x10::regionarray::RectRegion1D::eliminate(
  x10_long axis) {
    
    //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    return this->x10::regionarray::RectRegion1D::toRectRegion()->x10::regionarray::RectRegion::eliminate(
             axis);
    
}

//#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
::x10::lang::Iterator< ::x10::lang::Point*>* x10::regionarray::RectRegion1D::iterator(
  ) {
    
    //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    ::x10::regionarray::RectRegion1D__RRIterator* alloc__116476 =
       (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D__RRIterator>()) ::x10::regionarray::RectRegion1D__RRIterator());
    (alloc__116476)->::x10::regionarray::RectRegion1D__RRIterator::_constructor(
      this);
    return reinterpret_cast< ::x10::lang::Iterator< ::x10::lang::Point*>*>(alloc__116476);
    
}

//#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
::x10::lang::String* x10::regionarray::RectRegion1D::toString(
  ) {
    
    //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    return ::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__127218 = ::x10aux::makeStringLit("["); strLit__127218; })), this->FMGL(min)), (__extension__ ({ static ::x10::lang::String* strLit__127219 = ::x10aux::makeStringLit(".."); strLit__127219; }))), this->FMGL(max)), (__extension__ ({ static ::x10::lang::String* strLit__127220 = ::x10aux::makeStringLit("]"); strLit__127220; })));
    
}

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
::x10::regionarray::RectRegion1D* x10::regionarray::RectRegion1D::x10__regionarray__RectRegion1D____this__x10__regionarray__RectRegion1D(
  ) {
    return this;
    
}
void x10::regionarray::RectRegion1D::__fieldInitializers_x10_regionarray_RectRegion1D(
  ) {
 
}
const ::x10aux::serialization_id_t x10::regionarray::RectRegion1D::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::RectRegion1D::_deserializer);

void x10::regionarray::RectRegion1D::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::regionarray::Region::_serialize_body(buf);
    buf.write(this->FMGL(size));
    buf.write(this->FMGL(min));
    buf.write(this->FMGL(max));
    
}

::x10::lang::Reference* ::x10::regionarray::RectRegion1D::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::RectRegion1D* this_ = new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::regionarray::RectRegion1D::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::Region::_deserialize_body(buf);
    FMGL(size) = buf.read<x10_long>();
    FMGL(min) = buf.read<x10_long>();
    FMGL(max) = buf.read<x10_long>();
}

::x10aux::RuntimeType x10::regionarray::RectRegion1D::rtt;
void x10::regionarray::RectRegion1D::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::regionarray::Region>()};
    rtt.initStageTwo("x10.regionarray.RectRegion1D",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion1D__closure__1>x10_regionarray_RectRegion1D__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion1D__closure__1::__apply, &x10_regionarray_RectRegion1D__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion1D__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion1D__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion1D__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion1D__closure__1::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_RectRegion1D__closure__2>x10_regionarray_RectRegion1D__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_RectRegion1D__closure__2::__apply, &x10_regionarray_RectRegion1D__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_RectRegion1D__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_RectRegion1D__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_RectRegion1D__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_RectRegion1D__closure__2::_deserialize);

/* END of RectRegion1D */
/*************************************************/
/*************************************************/
/* START of RectRegion1D$RRIterator */
#include <x10/regionarray/RectRegion1D__RRIterator.h>

#include <x10/lang/Iterator.h>
#include <x10/lang/Point.h>
#include <x10/lang/Long.h>
#include <x10/regionarray/RectRegion1D.h>
#include <x10/lang/Boolean.h>
#include <x10/compiler/Synthetic.h>
::x10::lang::Iterator< ::x10::lang::Point*>::itable< ::x10::regionarray::RectRegion1D__RRIterator >  x10::regionarray::RectRegion1D__RRIterator::_itable_0(&::x10::lang::X10Class::equals, &x10::regionarray::RectRegion1D__RRIterator::hasNext, &::x10::lang::X10Class::hashCode, &x10::regionarray::RectRegion1D__RRIterator::next, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::regionarray::RectRegion1D__RRIterator >  x10::regionarray::RectRegion1D__RRIterator::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::regionarray::RectRegion1D__RRIterator::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterator< ::x10::lang::Point*> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::regionarray::RectRegion1D__RRIterator")};

//#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"

//#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"

//#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"

//#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
void x10::regionarray::RectRegion1D__RRIterator::_constructor(::x10::regionarray::RectRegion1D* rr) {
    
    //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    ::x10::regionarray::RectRegion1D__RRIterator* this__116473 = this;
    ::x10aux::nullCheck(this__116473)->FMGL(cur) = ((x10_long)0ll);
    
    //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    this->FMGL(min) = ::x10aux::nullCheck(rr)->FMGL(min);
    
    //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    this->FMGL(max) = ::x10aux::nullCheck(rr)->FMGL(max);
    
    //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    this->FMGL(cur) = this->FMGL(min);
}
::x10::regionarray::RectRegion1D__RRIterator* x10::regionarray::RectRegion1D__RRIterator::_make(
  ::x10::regionarray::RectRegion1D* rr) {
    ::x10::regionarray::RectRegion1D__RRIterator* this_ = new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D__RRIterator>()) ::x10::regionarray::RectRegion1D__RRIterator();
    this_->_constructor(rr);
    return this_;
}



//#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
x10_boolean x10::regionarray::RectRegion1D__RRIterator::hasNext() {
    return ((this->FMGL(cur)) <= (this->FMGL(max)));
    
}

//#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
::x10::lang::Point* x10::regionarray::RectRegion1D__RRIterator::next(
  ) {
    
    //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    x10_long i__116475 = ((this->FMGL(cur) = ((this->FMGL(cur)) + (((x10_long)1ll)))) - (((x10_long)1ll)));
    ::x10::lang::Point* alloc__116474 =  (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
    (alloc__116474)->::x10::lang::Point::_constructor(i__116475);
    
    //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
    return alloc__116474;
    
}

//#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion1D.x10"
::x10::regionarray::RectRegion1D__RRIterator* x10::regionarray::RectRegion1D__RRIterator::x10__regionarray__RectRegion1D__RRIterator____this__x10__regionarray__RectRegion1D__RRIterator(
  ) {
    return this;
    
}
void x10::regionarray::RectRegion1D__RRIterator::__fieldInitializers_x10_regionarray_RectRegion1D_RRIterator(
  ) {
    this->FMGL(cur) = ((x10_long)0ll);
}
const ::x10aux::serialization_id_t x10::regionarray::RectRegion1D__RRIterator::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::RectRegion1D__RRIterator::_deserializer);

void x10::regionarray::RectRegion1D__RRIterator::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(min));
    buf.write(this->FMGL(max));
    buf.write(this->FMGL(cur));
    
}

::x10::lang::Reference* ::x10::regionarray::RectRegion1D__RRIterator::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::RectRegion1D__RRIterator* this_ = new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D__RRIterator>()) ::x10::regionarray::RectRegion1D__RRIterator();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::regionarray::RectRegion1D__RRIterator::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(min) = buf.read<x10_long>();
    FMGL(max) = buf.read<x10_long>();
    FMGL(cur) = buf.read<x10_long>();
}

::x10aux::RuntimeType x10::regionarray::RectRegion1D__RRIterator::rtt;
void x10::regionarray::RectRegion1D__RRIterator::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Iterator< ::x10::lang::Point*> >()};
    rtt.initStageTwo("x10.regionarray.RectRegion1D.RRIterator",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of RectRegion1D$RRIterator */
/*************************************************/
