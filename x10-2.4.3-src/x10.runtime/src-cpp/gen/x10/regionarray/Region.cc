/*************************************************/
/* START of Region */
#include <x10/regionarray/Region.h>

#include <x10/lang/Iterable.h>
#include <x10/lang/Point.h>
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/regionarray/EmptyRegion.h>
#include <x10/regionarray/FullRegion.h>
#include <x10/regionarray/PolyMatBuilder.h>
#include <x10/regionarray/PolyRow.h>
#include <x10/lang/Int.h>
#include <x10/regionarray/MatBuilder.h>
#include <x10/regionarray/Row.h>
#include <x10/regionarray/PolyMat.h>
#include <x10/regionarray/PolyRegion.h>
#include <x10/lang/Rail.h>
#include <x10/lang/IllegalArgumentException.h>
#include <x10/lang/String.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/regionarray/RectRegion1D.h>
#include <x10/regionarray/RectRegion.h>
#include <x10/lang/IntRange.h>
#include <x10/lang/LongRange.h>
#include <x10/lang/Unsafe.h>
#include <x10/lang/Iterator.h>
#include <x10/lang/Any.h>
#include <x10/compiler/Inline.h>
#include <x10/lang/Place.h>
#include <x10/regionarray/Dist.h>
#include <x10/regionarray/ConstantDist.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_REGIONARRAY_REGION__CLOSURE__1_CLOSURE
#define X10_REGIONARRAY_REGION__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_Region__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_Region__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long j__116671) {
        return (::x10aux::struct_equals(i__116676, j__116671)) ? (((x10_long)-1ll))
          : (((x10_long)0ll));
        
    }
    
    // captured environment
    x10_long i__116676;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->i__116676);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_Region__closure__1* storage = ::x10aux::alloc_z<x10_regionarray_Region__closure__1>();
        buf.record_reference(storage);
        x10_long that_i__116676 = buf.read<x10_long>();
        x10_regionarray_Region__closure__1* this_ = new (storage) x10_regionarray_Region__closure__1(that_i__116676);
        return this_;
    }
    
    x10_regionarray_Region__closure__1(x10_long i__116676) : i__116676(i__116676) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10:110";
    }

};

#endif // X10_REGIONARRAY_REGION__CLOSURE__1_CLOSURE
#ifndef X10_REGIONARRAY_REGION__CLOSURE__2_CLOSURE
#define X10_REGIONARRAY_REGION__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_Region__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_Region__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long j__116673) {
        return (::x10aux::struct_equals(i__116676, j__116673)) ? (((x10_long)1ll))
          : (((x10_long)0ll));
        
    }
    
    // captured environment
    x10_long i__116676;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->i__116676);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_Region__closure__2* storage = ::x10aux::alloc_z<x10_regionarray_Region__closure__2>();
        buf.record_reference(storage);
        x10_long that_i__116676 = buf.read<x10_long>();
        x10_regionarray_Region__closure__2* this_ = new (storage) x10_regionarray_Region__closure__2(that_i__116676);
        return this_;
    }
    
    x10_regionarray_Region__closure__2(x10_long i__116676) : i__116676(i__116676) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10:115";
    }

};

#endif // X10_REGIONARRAY_REGION__CLOSURE__2_CLOSURE
#ifndef X10_REGIONARRAY_REGION__CLOSURE__3_CLOSURE
#define X10_REGIONARRAY_REGION__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_Region__closure__3 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_Region__closure__3> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ((x10_long)(::x10aux::nullCheck(ranges)->x10::lang::Rail< ::x10::lang::IntRange >::__apply(
                             i)->FMGL(min)));
        
    }
    
    // captured environment
    ::x10::lang::Rail< ::x10::lang::IntRange >* ranges;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->ranges);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_Region__closure__3* storage = ::x10aux::alloc_z<x10_regionarray_Region__closure__3>();
        buf.record_reference(storage);
        ::x10::lang::Rail< ::x10::lang::IntRange >* that_ranges = buf.read< ::x10::lang::Rail< ::x10::lang::IntRange >*>();
        x10_regionarray_Region__closure__3* this_ = new (storage) x10_regionarray_Region__closure__3(that_ranges);
        return this_;
    }
    
    x10_regionarray_Region__closure__3(::x10::lang::Rail< ::x10::lang::IntRange >* ranges) : ranges(ranges) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10:144";
    }

};

#endif // X10_REGIONARRAY_REGION__CLOSURE__3_CLOSURE
#ifndef X10_REGIONARRAY_REGION__CLOSURE__4_CLOSURE
#define X10_REGIONARRAY_REGION__CLOSURE__4_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_Region__closure__4 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_Region__closure__4> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ((x10_long)(::x10aux::nullCheck(ranges)->x10::lang::Rail< ::x10::lang::IntRange >::__apply(
                             i)->FMGL(max)));
        
    }
    
    // captured environment
    ::x10::lang::Rail< ::x10::lang::IntRange >* ranges;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->ranges);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_Region__closure__4* storage = ::x10aux::alloc_z<x10_regionarray_Region__closure__4>();
        buf.record_reference(storage);
        ::x10::lang::Rail< ::x10::lang::IntRange >* that_ranges = buf.read< ::x10::lang::Rail< ::x10::lang::IntRange >*>();
        x10_regionarray_Region__closure__4* this_ = new (storage) x10_regionarray_Region__closure__4(that_ranges);
        return this_;
    }
    
    x10_regionarray_Region__closure__4(::x10::lang::Rail< ::x10::lang::IntRange >* ranges) : ranges(ranges) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10:145";
    }

};

#endif // X10_REGIONARRAY_REGION__CLOSURE__4_CLOSURE
#ifndef X10_REGIONARRAY_REGION__CLOSURE__5_CLOSURE
#define X10_REGIONARRAY_REGION__CLOSURE__5_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_Region__closure__5 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_Region__closure__5> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ::x10aux::nullCheck(ranges)->x10::lang::Rail< ::x10::lang::LongRange >::__apply(
                 i)->FMGL(min);
        
    }
    
    // captured environment
    ::x10::lang::Rail< ::x10::lang::LongRange >* ranges;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->ranges);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_Region__closure__5* storage = ::x10aux::alloc_z<x10_regionarray_Region__closure__5>();
        buf.record_reference(storage);
        ::x10::lang::Rail< ::x10::lang::LongRange >* that_ranges = buf.read< ::x10::lang::Rail< ::x10::lang::LongRange >*>();
        x10_regionarray_Region__closure__5* this_ = new (storage) x10_regionarray_Region__closure__5(that_ranges);
        return this_;
    }
    
    x10_regionarray_Region__closure__5(::x10::lang::Rail< ::x10::lang::LongRange >* ranges) : ranges(ranges) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10:162";
    }

};

#endif // X10_REGIONARRAY_REGION__CLOSURE__5_CLOSURE
#ifndef X10_REGIONARRAY_REGION__CLOSURE__6_CLOSURE
#define X10_REGIONARRAY_REGION__CLOSURE__6_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_Region__closure__6 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_Region__closure__6> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ::x10aux::nullCheck(ranges)->x10::lang::Rail< ::x10::lang::LongRange >::__apply(
                 i)->FMGL(max);
        
    }
    
    // captured environment
    ::x10::lang::Rail< ::x10::lang::LongRange >* ranges;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->ranges);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_Region__closure__6* storage = ::x10aux::alloc_z<x10_regionarray_Region__closure__6>();
        buf.record_reference(storage);
        ::x10::lang::Rail< ::x10::lang::LongRange >* that_ranges = buf.read< ::x10::lang::Rail< ::x10::lang::LongRange >*>();
        x10_regionarray_Region__closure__6* this_ = new (storage) x10_regionarray_Region__closure__6(that_ranges);
        return this_;
    }
    
    x10_regionarray_Region__closure__6(::x10::lang::Rail< ::x10::lang::LongRange >* ranges) : ranges(ranges) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10:163";
    }

};

#endif // X10_REGIONARRAY_REGION__CLOSURE__6_CLOSURE

//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"

//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"

//#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"

//#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"

//#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
x10_long x10::regionarray::Region::rank() {
    return this->FMGL(rank);
    
}

//#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
x10_boolean x10::regionarray::Region::rect() {
    return this->FMGL(rect);
    
}

//#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
x10_boolean x10::regionarray::Region::zeroBased() {
    return this->FMGL(zeroBased);
    
}

//#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
x10_boolean x10::regionarray::Region::rail() {
    return this->FMGL(rail);
    
}

//#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::makeEmpty(x10_long rank) {
    ::x10::regionarray::EmptyRegion* alloc__116667 =  (new (::x10aux::alloc_z< ::x10::regionarray::EmptyRegion>()) ::x10::regionarray::EmptyRegion());
    (alloc__116667)->::x10::regionarray::EmptyRegion::_constructor(rank);
    return alloc__116667;
    
}

//#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::makeFull(x10_long rank) {
    ::x10::regionarray::FullRegion* alloc__116668 =  (new (::x10aux::alloc_z< ::x10::regionarray::FullRegion>()) ::x10::regionarray::FullRegion());
    (alloc__116668)->::x10::regionarray::FullRegion::_constructor(rank);
    return alloc__116668;
    
}

//#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::makeUnit() {
    ::x10::regionarray::FullRegion* alloc__116669 =  (new (::x10aux::alloc_z< ::x10::regionarray::FullRegion>()) ::x10::regionarray::FullRegion());
    (alloc__116669)->::x10::regionarray::FullRegion::_constructor(((x10_long)0ll));
    return alloc__116669;
    
}

//#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::makeHalfspace(::x10::lang::Point* normal,
                                                                    x10_long k) {
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    x10_long rank = ::x10aux::nullCheck(normal)->FMGL(rank);
    
    //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    ::x10::regionarray::PolyMatBuilder* pmb =  (new (::x10aux::alloc_z< ::x10::regionarray::PolyMatBuilder>()) ::x10::regionarray::PolyMatBuilder());
    (pmb)->::x10::regionarray::PolyMatBuilder::_constructor(rank);
    
    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    ::x10::regionarray::PolyRow* r =  (new (::x10aux::alloc_z< ::x10::regionarray::PolyRow>()) ::x10::regionarray::PolyRow());
    (r)->::x10::regionarray::PolyRow::_constructor(normal, ((x10_int) (k)));
    
    //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    pmb->add(reinterpret_cast< ::x10::regionarray::Row*>(r));
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    ::x10::regionarray::PolyMat* pm = pmb->toSortedPolyMat(false);
    
    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    return ::x10::regionarray::PolyRegion::make(pm);
    
}

//#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::makeRectangularPoly(
  ::x10::lang::Rail< x10_long >* minArg, ::x10::lang::Rail< x10_long >* maxArg) {
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    if ((!::x10aux::struct_equals((x10_long)(::x10aux::nullCheck(minArg)->FMGL(size)),
                                  (x10_long)(::x10aux::nullCheck(maxArg)->FMGL(size)))))
    {
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::IllegalArgumentException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__127601 = ::x10aux::makeStringLit("min and max not equal size ("); strLit__127601; })), (x10_long)(::x10aux::nullCheck(minArg)->FMGL(size))), (__extension__ ({ static ::x10::lang::String* strLit__127602 = ::x10aux::makeStringLit(" != "); strLit__127602; }))), (x10_long)(::x10aux::nullCheck(maxArg)->FMGL(size))), (__extension__ ({ static ::x10::lang::String* strLit__127603 = ::x10aux::makeStringLit(")"); strLit__127603; }))))));
    }
    
    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    x10_long rank = (x10_long)(::x10aux::nullCheck(minArg)->FMGL(size));
    
    //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    ::x10::regionarray::PolyMatBuilder* pmb =  (new (::x10aux::alloc_z< ::x10::regionarray::PolyMatBuilder>()) ::x10::regionarray::PolyMatBuilder());
    (pmb)->::x10::regionarray::PolyMatBuilder::_constructor(
      rank);
    
    //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    x10_long i__106471max__116674 = ((rank) - (((x10_long)1ll)));
    {
        x10_long i__116675;
        for (i__116675 = ((x10_long)0ll); ((i__116675) <= (i__106471max__116674));
             i__116675 = ((i__116675) + (((x10_long)1ll))))
        {
            x10_long i__116676 = i__116675;
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            if (((::x10aux::nullCheck(minArg)->x10::lang::Rail< x10_long >::__apply(
                    i__116676)) > ((x10_long)0x8000000000000000LL)))
            {
                
                //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                ::x10::regionarray::PolyRow* r__116670 = 
                (new (::x10aux::alloc_z< ::x10::regionarray::PolyRow>()) ::x10::regionarray::PolyRow());
                (r__116670)->::x10::regionarray::PolyRow::_constructor(
                  ::x10::lang::Point::make(rank, reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_Region__closure__1)))x10_regionarray_Region__closure__1(i__116676)))),
                  ((x10_int) (::x10aux::nullCheck(minArg)->x10::lang::Rail< x10_long >::__apply(
                                i__116676))));
                
                //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                pmb->add(reinterpret_cast< ::x10::regionarray::Row*>(r__116670));
            }
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            if (((::x10aux::nullCheck(maxArg)->x10::lang::Rail< x10_long >::__apply(
                    i__116676)) < ((x10_long)0x7fffffffffffffffLL)))
            {
                
                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                ::x10::regionarray::PolyRow* s__116672 = 
                (new (::x10aux::alloc_z< ::x10::regionarray::PolyRow>()) ::x10::regionarray::PolyRow());
                (s__116672)->::x10::regionarray::PolyRow::_constructor(
                  ::x10::lang::Point::make(rank, reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_Region__closure__2)))x10_regionarray_Region__closure__2(i__116676)))),
                  (-(((x10_int) (::x10aux::nullCheck(maxArg)->x10::lang::Rail< x10_long >::__apply(
                                   i__116676))))));
                
                //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
                pmb->add(reinterpret_cast< ::x10::regionarray::Row*>(s__116672));
            }
            
        }
    }
    
    //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    ::x10::regionarray::PolyMat* pm = pmb->toSortedPolyMat(
                                        false);
    
    //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    return ::x10::regionarray::PolyRegion::make(pm);
    
}

//#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::makeRectangular(
  ::x10::lang::Rail< x10_long >* minArg, ::x10::lang::Rail< x10_long >* maxArg) {
    
    //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    if ((::x10aux::struct_equals((x10_long)(::x10aux::nullCheck(minArg)->FMGL(size)),
                                 ((x10_long)1ll)))) {
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return ::x10aux::class_cast< ::x10::regionarray::Region*>((__extension__ ({
            ::x10::regionarray::RectRegion1D* alloc__106452 =
               (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
            (alloc__106452)->::x10::regionarray::RectRegion1D::_constructor(
              ::x10aux::nullCheck(minArg)->x10::lang::Rail< x10_long >::__apply(
                ((x10_long)0ll)), ::x10aux::nullCheck(maxArg)->x10::lang::Rail< x10_long >::__apply(
                                    ((x10_long)0ll)));
            alloc__106452;
        }))
        );
        
    } else {
        
        //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        ::x10::regionarray::RectRegion* alloc__116677 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion>()) ::x10::regionarray::RectRegion());
        (alloc__116677)->::x10::regionarray::RectRegion::_constructor(
          ::x10::lang::Rail< x10_long >::_make((x10_long)(::x10aux::nullCheck(minArg)->FMGL(size)),
                                               reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>(minArg)),
          ::x10::lang::Rail< x10_long >::_make((x10_long)(::x10aux::nullCheck(maxArg)->FMGL(size)),
                                               reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>(maxArg)));
        return alloc__116677;
        
    }
    
}

//#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::makeRectangular(
  ::x10::lang::Rail< ::x10::lang::IntRange >* ranges) {
    
    //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    if ((::x10aux::struct_equals((x10_long)(::x10aux::nullCheck(ranges)->FMGL(size)),
                                 ((x10_long)1ll)))) {
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return ::x10aux::class_cast< ::x10::regionarray::Region*>((__extension__ ({
            ::x10::regionarray::RectRegion1D* alloc__106454 =
               (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
            (alloc__106454)->::x10::regionarray::RectRegion1D::_constructor(
              ((x10_long)(::x10aux::nullCheck(ranges)->x10::lang::Rail< ::x10::lang::IntRange >::__apply(
                            ((x10_long)0ll))->FMGL(min))),
              ((x10_long)(::x10aux::nullCheck(ranges)->x10::lang::Rail< ::x10::lang::IntRange >::__apply(
                            ((x10_long)0ll))->FMGL(max))));
            alloc__106454;
        }))
        );
        
    } else {
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        ::x10::lang::Rail< x10_long >* mins = ::x10::lang::Rail< x10_long >::_make((x10_long)(::x10aux::nullCheck(ranges)->FMGL(size)),
                                                                                   reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_Region__closure__3)))x10_regionarray_Region__closure__3(ranges))));
        
        //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        ::x10::lang::Rail< x10_long >* maxs = ::x10::lang::Rail< x10_long >::_make((x10_long)(::x10aux::nullCheck(ranges)->FMGL(size)),
                                                                                   reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_Region__closure__4)))x10_regionarray_Region__closure__4(ranges))));
        
        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        ::x10::regionarray::RectRegion* alloc__116678 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion>()) ::x10::regionarray::RectRegion());
        (alloc__116678)->::x10::regionarray::RectRegion::_constructor(
          mins, maxs);
        return alloc__116678;
        
    }
    
}

//#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::make(
  ::x10::lang::Rail< ::x10::lang::IntRange >* ranges) {
    return ::x10::regionarray::Region::makeRectangular(ranges);
    
}

//#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::makeRectangular(
  ::x10::lang::Rail< ::x10::lang::LongRange >* ranges) {
    
    //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    if ((::x10aux::struct_equals((x10_long)(::x10aux::nullCheck(ranges)->FMGL(size)),
                                 ((x10_long)1ll)))) {
        
        //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        return ::x10aux::class_cast< ::x10::regionarray::Region*>((__extension__ ({
            ::x10::regionarray::RectRegion1D* alloc__106456 =
               (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
            (alloc__106456)->::x10::regionarray::RectRegion1D::_constructor(
              ::x10aux::nullCheck(ranges)->x10::lang::Rail< ::x10::lang::LongRange >::__apply(
                ((x10_long)0ll))->FMGL(min), ::x10aux::nullCheck(ranges)->x10::lang::Rail< ::x10::lang::LongRange >::__apply(
                                               ((x10_long)0ll))->FMGL(max));
            alloc__106456;
        }))
        );
        
    } else {
        
        //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        ::x10::lang::Rail< x10_long >* mins = ::x10::lang::Rail< x10_long >::_make((x10_long)(::x10aux::nullCheck(ranges)->FMGL(size)),
                                                                                   reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_Region__closure__5)))x10_regionarray_Region__closure__5(ranges))));
        
        //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        ::x10::lang::Rail< x10_long >* maxs = ::x10::lang::Rail< x10_long >::_make((x10_long)(::x10aux::nullCheck(ranges)->FMGL(size)),
                                                                                   reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_Region__closure__6)))x10_regionarray_Region__closure__6(ranges))));
        
        //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        ::x10::regionarray::RectRegion* alloc__116679 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion>()) ::x10::regionarray::RectRegion());
        (alloc__116679)->::x10::regionarray::RectRegion::_constructor(
          mins, maxs);
        return alloc__116679;
        
    }
    
}

//#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::make(
  ::x10::lang::Rail< ::x10::lang::LongRange >* ranges) {
    return ::x10::regionarray::Region::makeRectangular(ranges);
    
}

//#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::make(
  ::x10::lang::IntRange r) {
    ::x10::regionarray::RectRegion1D* alloc__116680 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
    (alloc__116680)->::x10::regionarray::RectRegion1D::_constructor(
      ((x10_long)(r->FMGL(min))), ((x10_long)(r->FMGL(max))));
    return alloc__116680;
    
}

//#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::makeRectangular(
  ::x10::lang::IntRange r) {
    ::x10::regionarray::RectRegion1D* alloc__116681 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
    (alloc__116681)->::x10::regionarray::RectRegion1D::_constructor(
      ((x10_long)(r->FMGL(min))), ((x10_long)(r->FMGL(max))));
    return alloc__116681;
    
}

//#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::make(
  ::x10::lang::LongRange r) {
    ::x10::regionarray::RectRegion1D* alloc__116682 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
    (alloc__116682)->::x10::regionarray::RectRegion1D::_constructor(
      r->FMGL(min), r->FMGL(max));
    return alloc__116682;
    
}

//#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::makeRectangular(
  ::x10::lang::LongRange r) {
    ::x10::regionarray::RectRegion1D* alloc__116683 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
    (alloc__116683)->::x10::regionarray::RectRegion1D::_constructor(
      r->FMGL(min), r->FMGL(max));
    return alloc__116683;
    
}

//#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::makeRectangular(
  ::x10::lang::IntRange r1, ::x10::lang::IntRange r2) {
    
    //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    return reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
        ::x10::regionarray::RectRegion* alloc__106462 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion>()) ::x10::regionarray::RectRegion());
        (alloc__106462)->::x10::regionarray::RectRegion::_constructor(
          (__extension__ ({
              ::x10::lang::Rail< x10_long >* t__127506 = ::x10::lang::Rail< x10_long >::_makeUnsafe(((x10_long)2ll), false);
              t__127506->x10::lang::Rail< x10_long >::__set(
                ((x10_long)0ll), ((x10_long)(r1->FMGL(min))));
              t__127506->x10::lang::Rail< x10_long >::__set(
                ((x10_long)1ll), ((x10_long)(r2->FMGL(min))));
              t__127506;
          }))
          , (__extension__ ({
              
              //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
              ::x10::lang::Rail< x10_long >* t__127512 = ::x10::lang::Rail< x10_long >::_makeUnsafe(((x10_long)2ll), false);
              t__127512->x10::lang::Rail< x10_long >::__set(
                ((x10_long)0ll), ((x10_long)(r1->FMGL(max))));
              t__127512->x10::lang::Rail< x10_long >::__set(
                ((x10_long)1ll), ((x10_long)(r2->FMGL(max))));
              t__127512;
          }))
          );
        alloc__106462;
    }))
    );
    
}

//#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::make(
  ::x10::lang::IntRange r1, ::x10::lang::IntRange r2) {
    return ::x10::regionarray::Region::makeRectangular(r1,
                                                       r2);
    
}

//#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::makeRectangular(
  ::x10::lang::LongRange r1, ::x10::lang::LongRange r2) {
    
    //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    return reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
        ::x10::regionarray::RectRegion* alloc__106463 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion>()) ::x10::regionarray::RectRegion());
        (alloc__106463)->::x10::regionarray::RectRegion::_constructor(
          (__extension__ ({
              ::x10::lang::Rail< x10_long >* t__127518 = ::x10::lang::Rail< x10_long >::_makeUnsafe(((x10_long)2ll), false);
              t__127518->x10::lang::Rail< x10_long >::__set(
                ((x10_long)0ll), r1->FMGL(min));
              t__127518->x10::lang::Rail< x10_long >::__set(
                ((x10_long)1ll), r2->FMGL(min));
              t__127518;
          }))
          , (__extension__ ({
              ::x10::lang::Rail< x10_long >* t__127524 = ::x10::lang::Rail< x10_long >::_makeUnsafe(((x10_long)2ll), false);
              t__127524->x10::lang::Rail< x10_long >::__set(
                ((x10_long)0ll), r1->FMGL(max));
              t__127524->x10::lang::Rail< x10_long >::__set(
                ((x10_long)1ll), r2->FMGL(max));
              t__127524;
          }))
          );
        alloc__106463;
    }))
    );
    
}

//#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::make(
  ::x10::lang::LongRange r1, ::x10::lang::LongRange r2) {
    return ::x10::regionarray::Region::makeRectangular(r1,
                                                       r2);
    
}

//#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::makeRectangular(
  ::x10::lang::IntRange r1, ::x10::lang::IntRange r2, ::x10::lang::IntRange r3) {
    
    //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    return reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
        ::x10::regionarray::RectRegion* alloc__106464 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion>()) ::x10::regionarray::RectRegion());
        (alloc__106464)->::x10::regionarray::RectRegion::_constructor(
          (__extension__ ({
              ::x10::lang::Rail< x10_long >* t__127530 = ::x10::lang::Rail< x10_long >::_makeUnsafe(((x10_long)3ll), false);
              t__127530->x10::lang::Rail< x10_long >::__set(
                ((x10_long)0ll), ((x10_long)(r1->FMGL(min))));
              t__127530->x10::lang::Rail< x10_long >::__set(
                ((x10_long)1ll), ((x10_long)(r2->FMGL(min))));
              t__127530->x10::lang::Rail< x10_long >::__set(
                ((x10_long)2ll), ((x10_long)(r3->FMGL(min))));
              t__127530;
          }))
          , (__extension__ ({
              
              //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
              ::x10::lang::Rail< x10_long >* t__127538 = ::x10::lang::Rail< x10_long >::_makeUnsafe(((x10_long)3ll), false);
              t__127538->x10::lang::Rail< x10_long >::__set(
                ((x10_long)0ll), ((x10_long)(r1->FMGL(max))));
              t__127538->x10::lang::Rail< x10_long >::__set(
                ((x10_long)1ll), ((x10_long)(r2->FMGL(max))));
              t__127538->x10::lang::Rail< x10_long >::__set(
                ((x10_long)2ll), ((x10_long)(r3->FMGL(max))));
              t__127538;
          }))
          );
        alloc__106464;
    }))
    );
    
}

//#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::make(
  ::x10::lang::IntRange r1, ::x10::lang::IntRange r2, ::x10::lang::IntRange r3) {
    
    //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    return ::x10::regionarray::Region::makeRectangular(r1,
                                                       r2,
                                                       r3);
    
}

//#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::makeRectangular(
  ::x10::lang::LongRange r1, ::x10::lang::LongRange r2, ::x10::lang::LongRange r3) {
    
    //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    return reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
        ::x10::regionarray::RectRegion* alloc__106465 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion>()) ::x10::regionarray::RectRegion());
        (alloc__106465)->::x10::regionarray::RectRegion::_constructor(
          (__extension__ ({
              ::x10::lang::Rail< x10_long >* t__127546 = ::x10::lang::Rail< x10_long >::_makeUnsafe(((x10_long)3ll), false);
              t__127546->x10::lang::Rail< x10_long >::__set(
                ((x10_long)0ll), r1->FMGL(min));
              t__127546->x10::lang::Rail< x10_long >::__set(
                ((x10_long)1ll), r2->FMGL(min));
              t__127546->x10::lang::Rail< x10_long >::__set(
                ((x10_long)2ll), r3->FMGL(min));
              t__127546;
          }))
          , (__extension__ ({
              ::x10::lang::Rail< x10_long >* t__127554 = ::x10::lang::Rail< x10_long >::_makeUnsafe(((x10_long)3ll), false);
              t__127554->x10::lang::Rail< x10_long >::__set(
                ((x10_long)0ll), r1->FMGL(max));
              t__127554->x10::lang::Rail< x10_long >::__set(
                ((x10_long)1ll), r2->FMGL(max));
              t__127554->x10::lang::Rail< x10_long >::__set(
                ((x10_long)2ll), r3->FMGL(max));
              t__127554;
          }))
          );
        alloc__106465;
    }))
    );
    
}

//#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::make(
  ::x10::lang::LongRange r1, ::x10::lang::LongRange r2, ::x10::lang::LongRange r3) {
    
    //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    return ::x10::regionarray::Region::makeRectangular(r1,
                                                       r2,
                                                       r3);
    
}

//#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::makeRectangular(
  ::x10::lang::IntRange r1, ::x10::lang::IntRange r2, ::x10::lang::IntRange r3,
  ::x10::lang::IntRange r4) {
    
    //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    return reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
        ::x10::regionarray::RectRegion* alloc__106466 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion>()) ::x10::regionarray::RectRegion());
        (alloc__106466)->::x10::regionarray::RectRegion::_constructor(
          (__extension__ ({
              ::x10::lang::Rail< x10_long >* t__127562 = ::x10::lang::Rail< x10_long >::_makeUnsafe(((x10_long)4ll), false);
              t__127562->x10::lang::Rail< x10_long >::__set(
                ((x10_long)0ll), ((x10_long)(r1->FMGL(min))));
              t__127562->x10::lang::Rail< x10_long >::__set(
                ((x10_long)1ll), ((x10_long)(r2->FMGL(min))));
              t__127562->x10::lang::Rail< x10_long >::__set(
                ((x10_long)2ll), ((x10_long)(r3->FMGL(min))));
              t__127562->x10::lang::Rail< x10_long >::__set(
                ((x10_long)3ll), ((x10_long)(r4->FMGL(min))));
              t__127562;
          }))
          , (__extension__ ({
              
              //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
              ::x10::lang::Rail< x10_long >* t__127572 = ::x10::lang::Rail< x10_long >::_makeUnsafe(((x10_long)4ll), false);
              t__127572->x10::lang::Rail< x10_long >::__set(
                ((x10_long)0ll), ((x10_long)(r1->FMGL(max))));
              t__127572->x10::lang::Rail< x10_long >::__set(
                ((x10_long)1ll), ((x10_long)(r2->FMGL(max))));
              t__127572->x10::lang::Rail< x10_long >::__set(
                ((x10_long)2ll), ((x10_long)(r3->FMGL(max))));
              t__127572->x10::lang::Rail< x10_long >::__set(
                ((x10_long)3ll), ((x10_long)(r4->FMGL(max))));
              t__127572;
          }))
          );
        alloc__106466;
    }))
    );
    
}

//#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::make(
  ::x10::lang::IntRange r1, ::x10::lang::IntRange r2, ::x10::lang::IntRange r3,
  ::x10::lang::IntRange r4) {
    
    //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    return ::x10::regionarray::Region::makeRectangular(r1,
                                                       r2,
                                                       r3,
                                                       r4);
    
}

//#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::makeRectangular(
  ::x10::lang::LongRange r1, ::x10::lang::LongRange r2, ::x10::lang::LongRange r3,
  ::x10::lang::LongRange r4) {
    
    //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    return reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
        ::x10::regionarray::RectRegion* alloc__106467 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion>()) ::x10::regionarray::RectRegion());
        (alloc__106467)->::x10::regionarray::RectRegion::_constructor(
          (__extension__ ({
              ::x10::lang::Rail< x10_long >* t__127582 = ::x10::lang::Rail< x10_long >::_makeUnsafe(((x10_long)4ll), false);
              t__127582->x10::lang::Rail< x10_long >::__set(
                ((x10_long)0ll), r1->FMGL(min));
              t__127582->x10::lang::Rail< x10_long >::__set(
                ((x10_long)1ll), r2->FMGL(min));
              t__127582->x10::lang::Rail< x10_long >::__set(
                ((x10_long)2ll), r3->FMGL(min));
              t__127582->x10::lang::Rail< x10_long >::__set(
                ((x10_long)3ll), r4->FMGL(min));
              t__127582;
          }))
          , (__extension__ ({
              ::x10::lang::Rail< x10_long >* t__127592 = ::x10::lang::Rail< x10_long >::_makeUnsafe(((x10_long)4ll), false);
              t__127592->x10::lang::Rail< x10_long >::__set(
                ((x10_long)0ll), r1->FMGL(max));
              t__127592->x10::lang::Rail< x10_long >::__set(
                ((x10_long)1ll), r2->FMGL(max));
              t__127592->x10::lang::Rail< x10_long >::__set(
                ((x10_long)2ll), r3->FMGL(max));
              t__127592->x10::lang::Rail< x10_long >::__set(
                ((x10_long)3ll), r4->FMGL(max));
              t__127592;
          }))
          );
        alloc__106467;
    }))
    );
    
}

//#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::make(
  ::x10::lang::LongRange r1, ::x10::lang::LongRange r2, ::x10::lang::LongRange r3,
  ::x10::lang::LongRange r4) {
    
    //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    return ::x10::regionarray::Region::makeRectangular(r1,
                                                       r2,
                                                       r3,
                                                       r4);
    
}

//#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::makeRectangular(
  x10_long min, x10_long max) {
    
    //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    ::x10::regionarray::RectRegion1D* alloc__116684 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
    (alloc__116684)->::x10::regionarray::RectRegion1D::_constructor(
      min, max);
    return alloc__116684;
    
}

//#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::make(
  x10_long min, x10_long max) {
    ::x10::regionarray::RectRegion1D* alloc__116685 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
    (alloc__116685)->::x10::regionarray::RectRegion1D::_constructor(
      min, max);
    return alloc__116685;
    
}

//#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::makeBanded(
  x10_long size, x10_long upper, x10_long lower) {
    
    //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyRegion.x10"
    x10_int size__116686 = ((x10_int) (size));
    x10_int upper__116687 = ((x10_int) (upper));
    x10_int lower__116688 = ((x10_int) (lower));
    
    //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    return ::x10::regionarray::PolyRegion::makeBanded(((x10_int)0),
                                                      ((x10_int)0),
                                                      ((size__116686) - (((x10_int)1))),
                                                      ((size__116686) - (((x10_int)1))),
                                                      upper__116687,
                                                      lower__116688);
    
}

//#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::makeBanded(
  x10_long size) {
    return ::x10::regionarray::PolyRegion::makeBanded(((x10_long)(((x10_int) (size)))),
                                                      ((x10_long)1ll),
                                                      ((x10_long)1ll));
    
}

//#line 306 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::makeUpperTriangular(
  x10_long size) {
    return ::x10::regionarray::Region::makeUpperTriangular(
             ((x10_long)0ll), ((x10_long)0ll), size);
    
}

//#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::makeUpperTriangular(
  x10_long rowMin, x10_long colMin, x10_long size) {
    
    //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    return ::x10::regionarray::PolyRegion::makeUpperTriangular2(
             ((x10_int) (rowMin)), ((x10_int) (colMin)), ((x10_int) (size)));
    
}

//#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::makeLowerTriangular(
  x10_long size) {
    return ::x10::regionarray::Region::makeLowerTriangular(
             ((x10_long)0ll), ((x10_long)0ll), size);
    
}

//#line 324 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::makeLowerTriangular(
  x10_long rowMin, x10_long colMin, x10_long size) {
    
    //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    return ::x10::regionarray::PolyRegion::makeLowerTriangular2(
             ((x10_int) (rowMin)), ((x10_int) (colMin)), ((x10_int) (size)));
    
}

//#line 335 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"

//#line 340 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"

//#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"

//#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"

//#line 362 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
x10_long x10::regionarray::Region::indexOf(x10_long i0) {
    return this->indexOf((__extension__ ({
                             
                             //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                             x10_long i__116630 = i0;
                             (__extension__ ({
                                 ::x10::lang::Point* alloc__116631 =
                                    (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
                                 (alloc__116631)->::x10::lang::Point::_constructor(
                                   i__116630);
                                 alloc__116631;
                             }))
                             ;
                         }))
                         );
    
}

//#line 363 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
x10_long x10::regionarray::Region::indexOf(x10_long i0, x10_long i1) {
    return this->indexOf((__extension__ ({
                             
                             //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                             x10_long i__116632 = i0;
                             x10_long i__116633 = i1;
                             (__extension__ ({
                                 ::x10::lang::Point* alloc__116634 =
                                    (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
                                 (alloc__116634)->::x10::lang::Point::_constructor(
                                   i__116632, i__116633);
                                 alloc__116634;
                             }))
                             ;
                         }))
                         );
    
}

//#line 364 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
x10_long x10::regionarray::Region::indexOf(x10_long i0, x10_long i1,
                                           x10_long i2) {
    return this->indexOf((__extension__ ({
                             
                             //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                             x10_long i__116635 = i0;
                             x10_long i__116636 = i1;
                             x10_long i__116637 = i2;
                             (__extension__ ({
                                 ::x10::lang::Point* alloc__116638 =
                                    (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
                                 (alloc__116638)->::x10::lang::Point::_constructor(
                                   i__116635, i__116636, i__116637);
                                 alloc__116638;
                             }))
                             ;
                         }))
                         );
    
}

//#line 365 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
x10_long x10::regionarray::Region::indexOf(x10_long i0, x10_long i1,
                                           x10_long i2, x10_long i3) {
    return this->indexOf((__extension__ ({
                             
                             //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                             x10_long i__116639 = i0;
                             x10_long i__116640 = i1;
                             x10_long i__116641 = i2;
                             x10_long i__116642 = i3;
                             (__extension__ ({
                                 ::x10::lang::Point* alloc__116643 =
                                    (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
                                 (alloc__116643)->::x10::lang::Point::_constructor(
                                   i__116639, i__116640, i__116641,
                                   i__116642);
                                 alloc__116643;
                             }))
                             ;
                         }))
                         );
    
}

//#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::boundingBox(
  ) {
    return this->computeBoundingBox();
    
}

//#line 379 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"

//#line 385 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"

//#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"

//#line 397 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
x10_long x10::regionarray::Region::min(x10_long i) {
    return ::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(this->min()), 
      i);
    
}

//#line 403 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
x10_long x10::regionarray::Region::max(x10_long i) {
    return ::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(this->max()), 
      i);
    
}

//#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::lang::Point* x10::regionarray::Region::minPoint() {
    return ::x10::lang::Point::make(this->FMGL(rank), this->min());
    
}

//#line 413 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::lang::Point* x10::regionarray::Region::maxPoint() {
    return ::x10::lang::Point::make(this->FMGL(rank), this->max());
    
}

//#line 450 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"

//#line 464 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
x10_boolean x10::regionarray::Region::disjoint(::x10::regionarray::Region* that) {
    return ::x10aux::nullCheck(this->intersection(that))->isEmpty();
    
}

//#line 475 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"

//#line 483 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"

//#line 492 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"

//#line 500 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"

//#line 511 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"

//#line 519 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::__and(
  ::x10::regionarray::Region* that) {
    return this->intersection(that);
    
}

//#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::__times(
  ::x10::regionarray::Region* that) {
    return this->product(that);
    
}

//#line 525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::__plus(
  ::x10::lang::Point* v) {
    return this->translate(v);
    
}

//#line 526 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::__inv_plus(
  ::x10::lang::Point* v) {
    return this->translate(v);
    
}

//#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::__minus(
  ::x10::lang::Point* v) {
    return this->translate(::x10aux::nullCheck(v)->x10::lang::Point::__minus());
    
}

//#line 534 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
x10_boolean x10::regionarray::Region::equals(::x10::lang::Any* that) {
    
    //#line 535 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    if ((::x10aux::struct_equals(this, that))) {
        return true;
        
    }
    
    //#line 536 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    if (!(::x10aux::instanceof< ::x10::regionarray::Region*>(that)))
    {
        return false;
        
    }
    
    //#line 537 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    ::x10::regionarray::Region* t1 = ::x10aux::class_cast< ::x10::regionarray::Region*>(that);
    
    //#line 538 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    if ((!::x10aux::struct_equals(this->FMGL(rank), ::x10aux::nullCheck(t1)->FMGL(rank))))
    {
        return false;
        
    }
    
    //#line 539 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    ::x10::regionarray::Region* t2 = t1;
    
    //#line 540 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    return (this->contains(t2) && ::x10aux::nullCheck(t2)->contains(
                                    this));
    
}

//#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"

//#line 546 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"

//#line 548 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
x10_boolean x10::regionarray::Region::contains(x10_long i) {
    return this->contains((__extension__ ({
                              
                              //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                              x10_long i__116644 = i;
                              (__extension__ ({
                                  ::x10::lang::Point* alloc__116645 =
                                     (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
                                  (alloc__116645)->::x10::lang::Point::_constructor(
                                    i__116644);
                                  alloc__116645;
                              }))
                              ;
                          }))
                          );
    
}

//#line 550 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
x10_boolean x10::regionarray::Region::contains(x10_long i0,
                                               x10_long i1) {
    return this->contains((__extension__ ({
                              
                              //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                              x10_long i__116646 = i0;
                              x10_long i__116647 = i1;
                              (__extension__ ({
                                  ::x10::lang::Point* alloc__116648 =
                                     (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
                                  (alloc__116648)->::x10::lang::Point::_constructor(
                                    i__116646, i__116647);
                                  alloc__116648;
                              }))
                              ;
                          }))
                          );
    
}

//#line 552 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
x10_boolean x10::regionarray::Region::contains(x10_long i0,
                                               x10_long i1,
                                               x10_long i2) {
    return this->contains((__extension__ ({
                              
                              //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                              x10_long i__116649 = i0;
                              x10_long i__116650 = i1;
                              x10_long i__116651 = i2;
                              (__extension__ ({
                                  ::x10::lang::Point* alloc__116652 =
                                     (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
                                  (alloc__116652)->::x10::lang::Point::_constructor(
                                    i__116649, i__116650,
                                    i__116651);
                                  alloc__116652;
                              }))
                              ;
                          }))
                          );
    
}

//#line 554 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
x10_boolean x10::regionarray::Region::contains(x10_long i0,
                                               x10_long i1,
                                               x10_long i2,
                                               x10_long i3) {
    return this->contains((__extension__ ({
                              
                              //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                              x10_long i__116653 = i0;
                              x10_long i__116654 = i1;
                              x10_long i__116655 = i2;
                              x10_long i__116656 = i3;
                              (__extension__ ({
                                  ::x10::lang::Point* alloc__116657 =
                                     (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
                                  (alloc__116657)->::x10::lang::Point::_constructor(
                                    i__116653, i__116654,
                                    i__116655, i__116656);
                                  alloc__116657;
                              }))
                              ;
                          }))
                          );
    
}

//#line 556 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
void x10::regionarray::Region::_constructor(x10_long r, x10_boolean t,
                                            x10_boolean z) {
    
    //#line 557 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    x10_boolean isRail = (((::x10aux::struct_equals(r, ((x10_long)1ll))) &&
    t) && z);
    
    //#line 558 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    FMGL(rank) = r;
    FMGL(rect) = t;
    FMGL(zeroBased) = z;
    FMGL(rail) = isRail;
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    ::x10::regionarray::Region* this__116689 = this;
    
}


//#line 565 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
void x10::regionarray::Region::_constructor(x10_long r) {
    
    //#line 566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    FMGL(rank) = r;
    FMGL(rect) = true;
    FMGL(zeroBased) = true;
    FMGL(rail) = true;
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    ::x10::regionarray::Region* this__116690 = this;
    
}


//#line 575 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Dist* x10::regionarray::Region::__arrow(
  ::x10::lang::Place p) {
    
    //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10::regionarray::Region* r__116691 = this;
    ::x10::lang::Place p__116692 = p;
    
    //#line 575 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    return reinterpret_cast< ::x10::regionarray::Dist*>((__extension__ ({
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
        ::x10::regionarray::ConstantDist* alloc__116693 =
           (new (::x10aux::alloc_z< ::x10::regionarray::ConstantDist>()) ::x10::regionarray::ConstantDist());
        (alloc__116693)->::x10::regionarray::ConstantDist::_constructor(
          r__116691, p__116692);
        alloc__116693;
    }))
    );
    
}

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
::x10::regionarray::Region* x10::regionarray::Region::x10__regionarray__Region____this__x10__regionarray__Region(
  ) {
    return this;
    
}
void x10::regionarray::Region::__fieldInitializers_x10_regionarray_Region(
  ) {
 
}
void x10::regionarray::Region::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(rank));
    buf.write(this->FMGL(rect));
    buf.write(this->FMGL(zeroBased));
    buf.write(this->FMGL(rail));
    
}

void x10::regionarray::Region::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(rank) = buf.read<x10_long>();
    FMGL(rect) = buf.read<x10_boolean>();
    FMGL(zeroBased) = buf.read<x10_boolean>();
    FMGL(rail) = buf.read<x10_boolean>();
}

::x10aux::RuntimeType x10::regionarray::Region::rtt;
void x10::regionarray::Region::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Point*> >()};
    rtt.initStageTwo("x10.regionarray.Region",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_Region__closure__1>x10_regionarray_Region__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_Region__closure__1::__apply, &x10_regionarray_Region__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_Region__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_Region__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_Region__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_Region__closure__1::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_Region__closure__2>x10_regionarray_Region__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_Region__closure__2::__apply, &x10_regionarray_Region__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_Region__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_Region__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_Region__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_Region__closure__2::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_Region__closure__3>x10_regionarray_Region__closure__3::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_Region__closure__3::__apply, &x10_regionarray_Region__closure__3::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_Region__closure__3::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_Region__closure__3::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_Region__closure__3::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_Region__closure__3::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_Region__closure__4>x10_regionarray_Region__closure__4::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_Region__closure__4::__apply, &x10_regionarray_Region__closure__4::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_Region__closure__4::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_Region__closure__4::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_Region__closure__4::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_Region__closure__4::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_Region__closure__5>x10_regionarray_Region__closure__5::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_Region__closure__5::__apply, &x10_regionarray_Region__closure__5::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_Region__closure__5::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_Region__closure__5::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_Region__closure__5::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_Region__closure__5::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_Region__closure__6>x10_regionarray_Region__closure__6::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_Region__closure__6::__apply, &x10_regionarray_Region__closure__6::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_Region__closure__6::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_Region__closure__6::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_Region__closure__6::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_Region__closure__6::_deserialize);

/* END of Region */
/*************************************************/
