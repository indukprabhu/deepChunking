/*************************************************/
/* START of FullRegion */
#include <x10/regionarray/FullRegion.h>

#include <x10/regionarray/Region.h>
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/IllegalArgumentException.h>
#include <x10/lang/String.h>
#include <x10/regionarray/UnboundedRegionException.h>
#include <x10/lang/Point.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/lang/ArrayIndexOutOfBoundsException.h>
#include <x10/regionarray/EmptyRegion.h>
#include <x10/regionarray/RectRegion.h>
#include <x10/lang/Rail.h>
#include <x10/regionarray/RectRegion1D.h>
#include <x10/lang/UnsupportedOperationException.h>
#include <x10/lang/Any.h>
#include <x10/lang/Iterator.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_REGIONARRAY_FULLREGION__CLOSURE__1_CLOSURE
#define X10_REGIONARRAY_FULLREGION__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_FullRegion__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_FullRegion__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        
        //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        if ((((i) < (((x10_long)0ll))) || ((i) >= (saved_this->FMGL(rank)))))
        {
            ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126643 = ::x10aux::makeStringLit("min: "); strLit__126643; })), i), (__extension__ ({ static ::x10::lang::String* strLit__126644 = ::x10aux::makeStringLit(" is not a valid rank for "); strLit__126644; }))), saved_this))));
        }
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        return (x10_long)0x8000000000000000LL;
        
    }
    
    // captured environment
    ::x10::regionarray::FullRegion* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_FullRegion__closure__1* storage = ::x10aux::alloc_z<x10_regionarray_FullRegion__closure__1>();
        buf.record_reference(storage);
        ::x10::regionarray::FullRegion* that_saved_this = buf.read< ::x10::regionarray::FullRegion*>();
        x10_regionarray_FullRegion__closure__1* this_ = new (storage) x10_regionarray_FullRegion__closure__1(that_saved_this);
        return this_;
    }
    
    x10_regionarray_FullRegion__closure__1(::x10::regionarray::FullRegion* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10:33-36";
    }

};

#endif // X10_REGIONARRAY_FULLREGION__CLOSURE__1_CLOSURE
#ifndef X10_REGIONARRAY_FULLREGION__CLOSURE__2_CLOSURE
#define X10_REGIONARRAY_FULLREGION__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_FullRegion__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_FullRegion__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        if ((((i) < (((x10_long)0ll))) || ((i) >= (saved_this->FMGL(rank)))))
        {
            ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126645 = ::x10aux::makeStringLit("max: "); strLit__126645; })), i), (__extension__ ({ static ::x10::lang::String* strLit__126646 = ::x10aux::makeStringLit(" is not a valid rank for "); strLit__126646; }))), saved_this))));
        }
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        return (x10_long)0x7fffffffffffffffLL;
        
    }
    
    // captured environment
    ::x10::regionarray::FullRegion* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_FullRegion__closure__2* storage = ::x10aux::alloc_z<x10_regionarray_FullRegion__closure__2>();
        buf.record_reference(storage);
        ::x10::regionarray::FullRegion* that_saved_this = buf.read< ::x10::regionarray::FullRegion*>();
        x10_regionarray_FullRegion__closure__2* this_ = new (storage) x10_regionarray_FullRegion__closure__2(that_saved_this);
        return this_;
    }
    
    x10_regionarray_FullRegion__closure__2(::x10::regionarray::FullRegion* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10:39-42";
    }

};

#endif // X10_REGIONARRAY_FULLREGION__CLOSURE__2_CLOSURE
#ifndef X10_REGIONARRAY_FULLREGION__CLOSURE__3_CLOSURE
#define X10_REGIONARRAY_FULLREGION__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_FullRegion__closure__3 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_FullRegion__closure__3> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i__112467) {
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return ::x10aux::nullCheck(this__112468)->x10::regionarray::RectRegion::min(
                 i__112467);
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* this__112468;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->this__112468);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_FullRegion__closure__3* storage = ::x10aux::alloc_z<x10_regionarray_FullRegion__closure__3>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_this__112468 = buf.read< ::x10::regionarray::RectRegion*>();
        x10_regionarray_FullRegion__closure__3* this_ = new (storage) x10_regionarray_FullRegion__closure__3(that_this__112468);
        return this_;
    }
    
    x10_regionarray_FullRegion__closure__3(::x10::regionarray::RectRegion* this__112468) : this__112468(this__112468) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:223";
    }

};

#endif // X10_REGIONARRAY_FULLREGION__CLOSURE__3_CLOSURE
#ifndef X10_REGIONARRAY_FULLREGION__CLOSURE__4_CLOSURE
#define X10_REGIONARRAY_FULLREGION__CLOSURE__4_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_FullRegion__closure__4 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_FullRegion__closure__4> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i__112469) {
        
        //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10"
        return ::x10aux::nullCheck(this__112470)->x10::regionarray::RectRegion::max(
                 i__112469);
        
    }
    
    // captured environment
    ::x10::regionarray::RectRegion* this__112470;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->this__112470);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_FullRegion__closure__4* storage = ::x10aux::alloc_z<x10_regionarray_FullRegion__closure__4>();
        buf.record_reference(storage);
        ::x10::regionarray::RectRegion* that_this__112470 = buf.read< ::x10::regionarray::RectRegion*>();
        x10_regionarray_FullRegion__closure__4* this_ = new (storage) x10_regionarray_FullRegion__closure__4(that_this__112470);
        return this_;
    }
    
    x10_regionarray_FullRegion__closure__4(::x10::regionarray::RectRegion* this__112470) : this__112470(this__112470) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/RectRegion.x10:224";
    }

};

#endif // X10_REGIONARRAY_FULLREGION__CLOSURE__4_CLOSURE
#ifndef X10_REGIONARRAY_FULLREGION__CLOSURE__5_CLOSURE
#define X10_REGIONARRAY_FULLREGION__CLOSURE__5_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_FullRegion__closure__5 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_FullRegion__closure__5> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ((i) < (saved_this->FMGL(rank))) ? ((x10_long)0x8000000000000000LL)
          : (::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(thatMin), 
               ((i) - (saved_this->FMGL(rank)))));
        
    }
    
    // captured environment
    ::x10::regionarray::FullRegion* saved_this;
    ::x10::lang::Fun_0_1<x10_long, x10_long>* thatMin;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->thatMin);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_FullRegion__closure__5* storage = ::x10aux::alloc_z<x10_regionarray_FullRegion__closure__5>();
        buf.record_reference(storage);
        ::x10::regionarray::FullRegion* that_saved_this = buf.read< ::x10::regionarray::FullRegion*>();
        ::x10::lang::Fun_0_1<x10_long, x10_long>* that_thatMin = buf.read< ::x10::lang::Fun_0_1<x10_long, x10_long>*>();
        x10_regionarray_FullRegion__closure__5* this_ = new (storage) x10_regionarray_FullRegion__closure__5(that_saved_this, that_thatMin);
        return this_;
    }
    
    x10_regionarray_FullRegion__closure__5(::x10::regionarray::FullRegion* saved_this, ::x10::lang::Fun_0_1<x10_long, x10_long>* thatMin) : saved_this(saved_this), thatMin(thatMin) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10:54";
    }

};

#endif // X10_REGIONARRAY_FULLREGION__CLOSURE__5_CLOSURE
#ifndef X10_REGIONARRAY_FULLREGION__CLOSURE__6_CLOSURE
#define X10_REGIONARRAY_FULLREGION__CLOSURE__6_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_FullRegion__closure__6 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_FullRegion__closure__6> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ((i) < (saved_this->FMGL(rank))) ? ((x10_long)0x7fffffffffffffffLL)
          : (::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(thatMax), 
               ((i) - (saved_this->FMGL(rank)))));
        
    }
    
    // captured environment
    ::x10::regionarray::FullRegion* saved_this;
    ::x10::lang::Fun_0_1<x10_long, x10_long>* thatMax;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->thatMax);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_FullRegion__closure__6* storage = ::x10aux::alloc_z<x10_regionarray_FullRegion__closure__6>();
        buf.record_reference(storage);
        ::x10::regionarray::FullRegion* that_saved_this = buf.read< ::x10::regionarray::FullRegion*>();
        ::x10::lang::Fun_0_1<x10_long, x10_long>* that_thatMax = buf.read< ::x10::lang::Fun_0_1<x10_long, x10_long>*>();
        x10_regionarray_FullRegion__closure__6* this_ = new (storage) x10_regionarray_FullRegion__closure__6(that_saved_this, that_thatMax);
        return this_;
    }
    
    x10_regionarray_FullRegion__closure__6(::x10::regionarray::FullRegion* saved_this, ::x10::lang::Fun_0_1<x10_long, x10_long>* thatMax) : saved_this(saved_this), thatMax(thatMax) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10:55";
    }

};

#endif // X10_REGIONARRAY_FULLREGION__CLOSURE__6_CLOSURE
::x10::lang::Iterable< ::x10::lang::Point*>::itable< ::x10::regionarray::FullRegion >  x10::regionarray::FullRegion::_itable_0(&::x10::regionarray::Region::equals, &::x10::lang::X10Class::hashCode, &x10::regionarray::FullRegion::iterator, &x10::regionarray::FullRegion::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::regionarray::FullRegion >  x10::regionarray::FullRegion::_itable_1(&::x10::regionarray::Region::equals, &::x10::lang::X10Class::hashCode, &x10::regionarray::FullRegion::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::regionarray::FullRegion::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Point*> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::regionarray::FullRegion")};

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
void x10::regionarray::FullRegion::_constructor(x10_long rank) {
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    ::x10::regionarray::Region* this__112473 = this;
    
    //#line 556 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    x10_long r__112474 = rank;
    
    //#line 557 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    x10_boolean isRail__112471 = (((::x10aux::struct_equals(r__112474, ((x10_long)1ll))) &&
    true) && false);
    
    //#line 558 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
    ::x10aux::nullCheck(this__112473)->FMGL(rank) = r__112474;
    ::x10aux::nullCheck(this__112473)->FMGL(rect) = true;
    ::x10aux::nullCheck(this__112473)->FMGL(zeroBased) = false;
    ::x10aux::nullCheck(this__112473)->FMGL(rail) = isRail__112471;
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    ::x10::regionarray::FullRegion* this__112472 = this;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    if (((rank) < (((x10_long)0ll)))) {
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::IllegalArgumentException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126638 = ::x10aux::makeStringLit("Rank is negative ("); strLit__126638; })), rank), (__extension__ ({ static ::x10::lang::String* strLit__126639 = ::x10aux::makeStringLit(")"); strLit__126639; }))))));
    }
    
}
::x10::regionarray::FullRegion* x10::regionarray::FullRegion::_make(
  x10_long rank) {
    ::x10::regionarray::FullRegion* this_ = new (::x10aux::alloc_z< ::x10::regionarray::FullRegion>()) ::x10::regionarray::FullRegion();
    this_->_constructor(rank);
    return this_;
}



//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
x10_boolean x10::regionarray::FullRegion::isConvex() {
    return true;
    
}

//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
x10_boolean x10::regionarray::FullRegion::isEmpty() {
    return false;
    
}

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
x10_long x10::regionarray::FullRegion::size() {
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::regionarray::UnboundedRegionException::_make((__extension__ ({ static ::x10::lang::String* strLit__126640 = ::x10aux::makeStringLit("size not supported"); strLit__126640; })))));
}

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
x10_long x10::regionarray::FullRegion::indexOf(::x10::lang::Point* id__135) {
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::regionarray::UnboundedRegionException::_make((__extension__ ({ static ::x10::lang::String* strLit__126642 = ::x10aux::makeStringLit("indexOf not supported"); strLit__126642; })))));
}

//#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
::x10::lang::Fun_0_1<x10_long, x10_long>* x10::regionarray::FullRegion::min(
  ) {
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    return reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_FullRegion__closure__1)))x10_regionarray_FullRegion__closure__1(this)));
    
}

//#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
::x10::lang::Fun_0_1<x10_long, x10_long>* x10::regionarray::FullRegion::max(
  ) {
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    return reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_FullRegion__closure__2)))x10_regionarray_FullRegion__closure__2(this)));
    
}

//#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
::x10::regionarray::Region* x10::regionarray::FullRegion::intersection(
  ::x10::regionarray::Region* that) {
    return that;
    
}

//#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
::x10::regionarray::Region* x10::regionarray::FullRegion::product(
  ::x10::regionarray::Region* that) {
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    if (::x10aux::nullCheck(that)->isEmpty()) {
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
        x10_long rank__112475 = ((this->FMGL(rank)) + (::x10aux::nullCheck(that)->FMGL(rank)));
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        return reinterpret_cast< ::x10::regionarray::Region*>((__extension__ ({
            
            //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Region.x10"
            ::x10::regionarray::EmptyRegion* alloc__112476 =  (new (::x10aux::alloc_z< ::x10::regionarray::EmptyRegion>()) ::x10::regionarray::EmptyRegion());
            (alloc__112476)->::x10::regionarray::EmptyRegion::_constructor(
              rank__112475);
            alloc__112476;
        }))
        );
        
    } else 
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    if (::x10aux::instanceof< ::x10::regionarray::FullRegion*>(that))
    {
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        ::x10::regionarray::FullRegion* alloc__112477 =  (new (::x10aux::alloc_z< ::x10::regionarray::FullRegion>()) ::x10::regionarray::FullRegion());
        (alloc__112477)->::x10::regionarray::FullRegion::_constructor(
          ((this->FMGL(rank)) + (::x10aux::nullCheck(that)->FMGL(rank))));
        return alloc__112477;
        
    } else 
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    if (::x10aux::instanceof< ::x10::regionarray::RectRegion*>(that))
    {
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        ::x10::lang::Fun_0_1<x10_long, x10_long>* thatMin = (__extension__ ({
            ::x10::regionarray::RectRegion* this__112468 = ::x10aux::class_cast< ::x10::regionarray::RectRegion*>(that);
            reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_FullRegion__closure__3)))x10_regionarray_FullRegion__closure__3(this__112468)));
        }))
        ;
        
        //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        ::x10::lang::Fun_0_1<x10_long, x10_long>* thatMax = (__extension__ ({
            ::x10::regionarray::RectRegion* this__112470 = ::x10aux::class_cast< ::x10::regionarray::RectRegion*>(that);
            reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_FullRegion__closure__4)))x10_regionarray_FullRegion__closure__4(this__112470)));
        }))
        ;
        
        //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        x10_long newRank = ((this->FMGL(rank)) + (::x10aux::nullCheck(that)->FMGL(rank)));
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        ::x10::lang::Rail< x10_long >* newMin = ::x10::lang::Rail< x10_long >::_make(newRank,
                                                                                     reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_FullRegion__closure__5)))x10_regionarray_FullRegion__closure__5(this, thatMin))));
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        ::x10::lang::Rail< x10_long >* newMax = ::x10::lang::Rail< x10_long >::_make(newRank,
                                                                                     reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_FullRegion__closure__6)))x10_regionarray_FullRegion__closure__6(this, thatMax))));
        
        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        ::x10::regionarray::RectRegion* alloc__112478 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion>()) ::x10::regionarray::RectRegion());
        (alloc__112478)->::x10::regionarray::RectRegion::_constructor(
          newMin, newMax);
        return alloc__112478;
        
    } else 
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    if (::x10aux::instanceof< ::x10::regionarray::RectRegion1D*>(that))
    {
        
        //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        return this->x10::regionarray::FullRegion::product(
                 reinterpret_cast< ::x10::regionarray::Region*>(::x10aux::nullCheck((::x10aux::class_cast< ::x10::regionarray::RectRegion1D*>(that)))->x10::regionarray::RectRegion1D::toRectRegion()));
        
    } else {
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126659 = ::x10aux::makeStringLit("haven\'t implemented FullRegion product with "); strLit__126659; })), ::x10aux::type_name(that)))));
    }
    
}

//#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
::x10::regionarray::Region* x10::regionarray::FullRegion::projection(
  x10_long axis) {
    ::x10::regionarray::FullRegion* alloc__112479 =  (new (::x10aux::alloc_z< ::x10::regionarray::FullRegion>()) ::x10::regionarray::FullRegion());
    (alloc__112479)->::x10::regionarray::FullRegion::_constructor(
      ((x10_long)1ll));
    return alloc__112479;
    
}

//#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
::x10::regionarray::Region* x10::regionarray::FullRegion::translate(
  ::x10::lang::Point* p) {
    return this;
    
}

//#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
::x10::regionarray::Region* x10::regionarray::FullRegion::eliminate(
  x10_long i) {
    ::x10::regionarray::FullRegion* alloc__112480 =  (new (::x10aux::alloc_z< ::x10::regionarray::FullRegion>()) ::x10::regionarray::FullRegion());
    (alloc__112480)->::x10::regionarray::FullRegion::_constructor(
      ((this->FMGL(rank)) - (((x10_long)1ll))));
    return reinterpret_cast< ::x10::regionarray::Region*>(alloc__112480);
    
}

//#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
::x10::regionarray::Region* x10::regionarray::FullRegion::computeBoundingBox(
  ) {
    return this;
    
}

//#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
x10_boolean x10::regionarray::FullRegion::contains(::x10::regionarray::Region* that) {
    return true;
    
}

//#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
x10_boolean x10::regionarray::FullRegion::contains(::x10::lang::Point* p) {
    return true;
    
}

//#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
::x10::lang::String* x10::regionarray::FullRegion::toString(
  ) {
    return ::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126670 = ::x10aux::makeStringLit("full("); strLit__126670; })), this->FMGL(rank)), (__extension__ ({ static ::x10::lang::String* strLit__126671 = ::x10aux::makeStringLit(")"); strLit__126671; })));
    
}

//#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
::x10::lang::Iterator< ::x10::lang::Point*>* x10::regionarray::FullRegion::iterator(
  ) {
    
    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::regionarray::UnboundedRegionException::_make((__extension__ ({ static ::x10::lang::String* strLit__126672 = ::x10aux::makeStringLit("iterator not supported"); strLit__126672; })))));
}

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/FullRegion.x10"
::x10::regionarray::FullRegion* x10::regionarray::FullRegion::x10__regionarray__FullRegion____this__x10__regionarray__FullRegion(
  ) {
    return this;
    
}
void x10::regionarray::FullRegion::__fieldInitializers_x10_regionarray_FullRegion(
  ) {
 
}
const ::x10aux::serialization_id_t x10::regionarray::FullRegion::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::FullRegion::_deserializer);

void x10::regionarray::FullRegion::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::regionarray::Region::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::regionarray::FullRegion::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::FullRegion* this_ = new (::x10aux::alloc_z< ::x10::regionarray::FullRegion>()) ::x10::regionarray::FullRegion();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::regionarray::FullRegion::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::Region::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::regionarray::FullRegion::rtt;
void x10::regionarray::FullRegion::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::regionarray::Region>()};
    rtt.initStageTwo("x10.regionarray.FullRegion",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_FullRegion__closure__1>x10_regionarray_FullRegion__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_FullRegion__closure__1::__apply, &x10_regionarray_FullRegion__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_FullRegion__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_FullRegion__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_FullRegion__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_FullRegion__closure__1::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_FullRegion__closure__2>x10_regionarray_FullRegion__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_FullRegion__closure__2::__apply, &x10_regionarray_FullRegion__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_FullRegion__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_FullRegion__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_FullRegion__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_FullRegion__closure__2::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_FullRegion__closure__3>x10_regionarray_FullRegion__closure__3::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_FullRegion__closure__3::__apply, &x10_regionarray_FullRegion__closure__3::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_FullRegion__closure__3::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_FullRegion__closure__3::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_FullRegion__closure__3::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_FullRegion__closure__3::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_FullRegion__closure__4>x10_regionarray_FullRegion__closure__4::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_FullRegion__closure__4::__apply, &x10_regionarray_FullRegion__closure__4::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_FullRegion__closure__4::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_FullRegion__closure__4::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_FullRegion__closure__4::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_FullRegion__closure__4::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_FullRegion__closure__5>x10_regionarray_FullRegion__closure__5::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_FullRegion__closure__5::__apply, &x10_regionarray_FullRegion__closure__5::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_FullRegion__closure__5::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_FullRegion__closure__5::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_FullRegion__closure__5::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_FullRegion__closure__5::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_FullRegion__closure__6>x10_regionarray_FullRegion__closure__6::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_FullRegion__closure__6::__apply, &x10_regionarray_FullRegion__closure__6::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_FullRegion__closure__6::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_FullRegion__closure__6::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_FullRegion__closure__6::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_FullRegion__closure__6::_deserialize);

/* END of FullRegion */
/*************************************************/
