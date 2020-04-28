/*************************************************/
/* START of PolyMatBuilder */
#include <x10/regionarray/PolyMatBuilder.h>

#include <x10/regionarray/MatBuilder.h>
#include <x10/lang/Long.h>
#include <x10/lang/Int.h>
#include <x10/lang/Boolean.h>
#include <x10/regionarray/PolyMat.h>
#include <x10/util/ArrayList.h>
#include <x10/regionarray/Row.h>
#include <x10/lang/Fun_0_2.h>
#include <x10/regionarray/PolyRow.h>
#include <x10/regionarray/Array.h>
#include <x10/regionarray/RectRegion1D.h>
#include <x10/regionarray/Region.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_REGIONARRAY_POLYMATBUILDER__CLOSURE__1_CLOSURE
#define X10_REGIONARRAY_POLYMATBUILDER__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_2.h>
class x10_regionarray_PolyMatBuilder__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_2< ::x10::regionarray::Row*, ::x10::regionarray::Row*, x10_int>::itable<x10_regionarray_PolyMatBuilder__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_int __apply(::x10::regionarray::Row* x, ::x10::regionarray::Row* y) {
        return ::x10::regionarray::PolyRow::compare(x, y);
        
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_PolyMatBuilder__closure__1* storage = ::x10aux::alloc_z<x10_regionarray_PolyMatBuilder__closure__1>();
        buf.record_reference(storage);
        x10_regionarray_PolyMatBuilder__closure__1* this_ = new (storage) x10_regionarray_PolyMatBuilder__closure__1();
        return this_;
    }
    
    x10_regionarray_PolyMatBuilder__closure__1() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_2< ::x10::regionarray::Row*, ::x10::regionarray::Row*, x10_int> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_2< ::x10::regionarray::Row*, ::x10::regionarray::Row*, x10_int> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10:42";
    }

};

#endif // X10_REGIONARRAY_POLYMATBUILDER__CLOSURE__1_CLOSURE
#ifndef X10_REGIONARRAY_POLYMATBUILDER__CLOSURE__2_CLOSURE
#define X10_REGIONARRAY_POLYMATBUILDER__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_2.h>
class x10_regionarray_PolyMatBuilder__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_2<x10_int, x10_int, x10_int>::itable<x10_regionarray_PolyMatBuilder__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_int __apply(x10_int i, x10_int j) {
        return ::x10aux::nullCheck(::x10aux::nullCheck(saved_this->FMGL(mat))->__apply(
                                     ((x10_long)(i))))->__apply(j);
        
    }
    
    // captured environment
    ::x10::regionarray::PolyMatBuilder* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_PolyMatBuilder__closure__2* storage = ::x10aux::alloc_z<x10_regionarray_PolyMatBuilder__closure__2>();
        buf.record_reference(storage);
        ::x10::regionarray::PolyMatBuilder* that_saved_this = buf.read< ::x10::regionarray::PolyMatBuilder*>();
        x10_regionarray_PolyMatBuilder__closure__2* this_ = new (storage) x10_regionarray_PolyMatBuilder__closure__2(that_saved_this);
        return this_;
    }
    
    x10_regionarray_PolyMatBuilder__closure__2(::x10::regionarray::PolyMatBuilder* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_2<x10_int, x10_int, x10_int> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_2<x10_int, x10_int, x10_int> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10:43";
    }

};

#endif // X10_REGIONARRAY_POLYMATBUILDER__CLOSURE__2_CLOSURE
#ifndef X10_REGIONARRAY_POLYMATBUILDER__CLOSURE__3_CLOSURE
#define X10_REGIONARRAY_POLYMATBUILDER__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_PolyMatBuilder__closure__3 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_int, x10_int>::itable<x10_regionarray_PolyMatBuilder__closure__3> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_int __apply(x10_int i) {
        
        //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        x10_long i__114930 = ((x10_long)(i));
        
        //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        x10_int ret__114931;
        
        //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
        ret__114931 = as_->FMGL(raw)->x10::lang::Rail< x10_int >::__apply(
                        i__114930);
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
        return ret__114931;
        
    }
    
    // captured environment
    ::x10::regionarray::Array<x10_int>* as_;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->as_);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_PolyMatBuilder__closure__3* storage = ::x10aux::alloc_z<x10_regionarray_PolyMatBuilder__closure__3>();
        buf.record_reference(storage);
        ::x10::regionarray::Array<x10_int>* that_as_ = buf.read< ::x10::regionarray::Array<x10_int>*>();
        x10_regionarray_PolyMatBuilder__closure__3* this_ = new (storage) x10_regionarray_PolyMatBuilder__closure__3(that_as_);
        return this_;
    }
    
    x10_regionarray_PolyMatBuilder__closure__3(::x10::regionarray::Array<x10_int>* as_) : as_(as_) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_int, x10_int> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_int, x10_int> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10:75";
    }

};

#endif // X10_REGIONARRAY_POLYMATBUILDER__CLOSURE__3_CLOSURE

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
void x10::regionarray::PolyMatBuilder::_constructor(x10_long rank) {
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
    (this)->::x10::regionarray::MatBuilder::_constructor(((x10_int) (((rank) + (((x10_long)1ll))))));
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
    FMGL(rank) = rank;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
    ::x10::regionarray::PolyMatBuilder* this__114925 = this;
    
}
::x10::regionarray::PolyMatBuilder* x10::regionarray::PolyMatBuilder::_make(
  x10_long rank) {
    ::x10::regionarray::PolyMatBuilder* this_ = new (::x10aux::alloc_z< ::x10::regionarray::PolyMatBuilder>()) ::x10::regionarray::PolyMatBuilder();
    this_->_constructor(rank);
    return this_;
}



//#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
::x10::regionarray::PolyMat* x10::regionarray::PolyMatBuilder::toSortedPolyMat(
  x10_boolean isSimplified) {
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
    ::x10aux::nullCheck(this->FMGL(mat))->sort(reinterpret_cast< ::x10::lang::Fun_0_2< ::x10::regionarray::Row*, ::x10::regionarray::Row*, x10_int>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_2< ::x10::regionarray::Row*, ::x10::regionarray::Row*, x10_int> >(sizeof(x10_regionarray_PolyMatBuilder__closure__1)))x10_regionarray_PolyMatBuilder__closure__1())));
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
    ::x10::regionarray::PolyMat* result =  (new (::x10aux::alloc_z< ::x10::regionarray::PolyMat>()) ::x10::regionarray::PolyMat());
    (result)->::x10::regionarray::PolyMat::_constructor(((x10_int) (::x10aux::nullCheck(this->FMGL(mat))->size())),
                                                        ((x10_int) (((this->FMGL(rank)) + (((x10_long)1ll))))),
                                                        reinterpret_cast< ::x10::lang::Fun_0_2<x10_int, x10_int, x10_int>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_2<x10_int, x10_int, x10_int> >(sizeof(x10_regionarray_PolyMatBuilder__closure__2)))x10_regionarray_PolyMatBuilder__closure__2(this))),
                                                        isSimplified);
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
    return result;
    
}

//#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
/**
     * a simple mechanism of somewhat dubious utility to allow
     * semi-symbolic specification of halfspaces. For example
     * X0-Y1 >= n is specified as add(X(0)-Y(1), GE, n)
     *
     * XXX coefficients must be -1,0,+1; can allow larger coefficients
     * by increasing # bits per coeff
     */
x10_int x10::regionarray::PolyMatBuilder::FMGL(ZERO);
void x10::regionarray::PolyMatBuilder::FMGL(ZERO__do_init)() {
    FMGL(ZERO__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::regionarray::PolyMatBuilder.ZERO");
    x10_int __var2094__ = ((x10_int)178956970);
    FMGL(ZERO) = __var2094__;
    FMGL(ZERO__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::regionarray::PolyMatBuilder::FMGL(ZERO__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(ZERO__status), &FMGL(ZERO__do_init), &FMGL(ZERO__exception), "x10::regionarray::PolyMatBuilder.ZERO");
    
}
volatile ::x10aux::StaticInitController::status x10::regionarray::PolyMatBuilder::FMGL(ZERO__status);
::x10::lang::CheckedThrowable* x10::regionarray::PolyMatBuilder::FMGL(ZERO__exception);

//#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
x10_int x10::regionarray::PolyMatBuilder::FMGL(GE);
void x10::regionarray::PolyMatBuilder::FMGL(GE__do_init)() {
    FMGL(GE__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::regionarray::PolyMatBuilder.GE");
    x10_int __var2095__ = ((x10_int)0);
    FMGL(GE) = __var2095__;
    FMGL(GE__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::regionarray::PolyMatBuilder::FMGL(GE__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(GE__status), &FMGL(GE__do_init), &FMGL(GE__exception), "x10::regionarray::PolyMatBuilder.GE");
    
}
volatile ::x10aux::StaticInitController::status x10::regionarray::PolyMatBuilder::FMGL(GE__status);
::x10::lang::CheckedThrowable* x10::regionarray::PolyMatBuilder::FMGL(GE__exception);

//#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
x10_int x10::regionarray::PolyMatBuilder::FMGL(LE);
void x10::regionarray::PolyMatBuilder::FMGL(LE__do_init)() {
    FMGL(LE__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::regionarray::PolyMatBuilder.LE");
    x10_int __var2096__ = ((x10_int)1);
    FMGL(LE) = __var2096__;
    FMGL(LE__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::regionarray::PolyMatBuilder::FMGL(LE__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(LE__status), &FMGL(LE__do_init), &FMGL(LE__exception), "x10::regionarray::PolyMatBuilder.LE");
    
}
volatile ::x10aux::StaticInitController::status x10::regionarray::PolyMatBuilder::FMGL(LE__status);
::x10::lang::CheckedThrowable* x10::regionarray::PolyMatBuilder::FMGL(LE__exception);

//#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
x10_int x10::regionarray::PolyMatBuilder::X(x10_int axis) {
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
    return ((((x10_int)1)) << (0x1f & (x10_int)(((x10_long)(((((x10_int)2)) * (axis)))))));
    
}

//#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
void x10::regionarray::PolyMatBuilder::add(x10_int coeff,
                                           x10_int op, x10_int k) {
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
    coeff = ((coeff) + (((x10_int)178956970)));
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
    ::x10::regionarray::Array<x10_int>* as_ =  (new (::x10aux::alloc_z< ::x10::regionarray::Array<x10_int> >()) ::x10::regionarray::Array<x10_int>());
    
    //#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long size__114932 = ((this->FMGL(rank)) + (((x10_long)1ll)));
    
    //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ::x10::regionarray::RectRegion1D* myReg__114926 =  (new (::x10aux::alloc_z< ::x10::regionarray::RectRegion1D>()) ::x10::regionarray::RectRegion1D());
    (myReg__114926)->::x10::regionarray::RectRegion1D::_constructor(
      ((size__114932) - (((x10_long)1ll))));
    
    //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    as_->FMGL(region) = reinterpret_cast< ::x10::regionarray::Region*>(myReg__114926);
    as_->FMGL(rank) = ((x10_long)1ll);
    as_->FMGL(rect) = true;
    as_->FMGL(zeroBased) = true;
    as_->FMGL(rail) = true;
    as_->FMGL(size) = size__114932;
    
    //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    as_->FMGL(layout_min0) = as_->FMGL(layout_stride1) = as_->FMGL(layout_min1) =
      ((x10_long)0ll);
    
    //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    as_->FMGL(layout) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    as_->FMGL(raw) = ::x10::lang::Rail< x10_int >::_make(size__114932);
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
    {
        x10_int i;
        for (i = ((x10_int)0); ((((x10_long)(i))) < (this->FMGL(rank)));
             i = ((i) + (((x10_int)1)))) {
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            x10_int a = ((((coeff) & (((x10_int)3)))) - (((x10_int)2)));
            
            //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            x10_long i__114927 = ((x10_long)(i));
            x10_int v__114928 = (::x10aux::struct_equals(op,
                                                         ((x10_int)1)))
              ? (a) : ((-(a)));
            
            //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            x10_int ret__114929;
            
            //#line 547 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            as_->FMGL(raw)->x10::lang::Rail< x10_int >::__set(
              i__114927, v__114928);
            
            //#line 554 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret__114929 = v__114928;
            
            //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
            ret__114929;
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
            coeff = ((coeff) >> (0x1f & (x10_int)(((x10_long)(((x10_int)2))))));
        }
    }
    
    //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_long i__114933 = this->FMGL(rank);
    x10_int v__114934 = (::x10aux::struct_equals(op, ((x10_int)1)))
      ? ((-(k))) : (k);
    
    //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    x10_int ret__114935;
    
    //#line 547 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    as_->FMGL(raw)->x10::lang::Rail< x10_int >::__set(i__114933,
                                                      v__114934);
    
    //#line 554 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ret__114935 = v__114934;
    
    //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Array.x10"
    ret__114935;
    
    //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
    this->add(reinterpret_cast< ::x10::lang::Fun_0_1<x10_int, x10_int>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_int, x10_int> >(sizeof(x10_regionarray_PolyMatBuilder__closure__3)))x10_regionarray_PolyMatBuilder__closure__3(as_))));
}

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PolyMatBuilder.x10"
::x10::regionarray::PolyMatBuilder* x10::regionarray::PolyMatBuilder::x10__regionarray__PolyMatBuilder____this__x10__regionarray__PolyMatBuilder(
  ) {
    return this;
    
}
void x10::regionarray::PolyMatBuilder::__fieldInitializers_x10_regionarray_PolyMatBuilder(
  ) {
 
}
const ::x10aux::serialization_id_t x10::regionarray::PolyMatBuilder::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::PolyMatBuilder::_deserializer);

void x10::regionarray::PolyMatBuilder::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::regionarray::MatBuilder::_serialize_body(buf);
    buf.write(this->FMGL(rank));
    
}

::x10::lang::Reference* ::x10::regionarray::PolyMatBuilder::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::PolyMatBuilder* this_ = new (::x10aux::alloc_z< ::x10::regionarray::PolyMatBuilder>()) ::x10::regionarray::PolyMatBuilder();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::regionarray::PolyMatBuilder::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::MatBuilder::_deserialize_body(buf);
    FMGL(rank) = buf.read<x10_long>();
}

::x10aux::RuntimeType x10::regionarray::PolyMatBuilder::rtt;
void x10::regionarray::PolyMatBuilder::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::regionarray::MatBuilder>()};
    rtt.initStageTwo("x10.regionarray.PolyMatBuilder",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::Fun_0_2< ::x10::regionarray::Row*, ::x10::regionarray::Row*, x10_int>::itable<x10_regionarray_PolyMatBuilder__closure__1>x10_regionarray_PolyMatBuilder__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_PolyMatBuilder__closure__1::__apply, &x10_regionarray_PolyMatBuilder__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_PolyMatBuilder__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_2< ::x10::regionarray::Row*, ::x10::regionarray::Row*, x10_int> >, &x10_regionarray_PolyMatBuilder__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_PolyMatBuilder__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_PolyMatBuilder__closure__1::_deserialize);

::x10::lang::Fun_0_2<x10_int, x10_int, x10_int>::itable<x10_regionarray_PolyMatBuilder__closure__2>x10_regionarray_PolyMatBuilder__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_PolyMatBuilder__closure__2::__apply, &x10_regionarray_PolyMatBuilder__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_PolyMatBuilder__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_2<x10_int, x10_int, x10_int> >, &x10_regionarray_PolyMatBuilder__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_PolyMatBuilder__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_PolyMatBuilder__closure__2::_deserialize);

::x10::lang::Fun_0_1<x10_int, x10_int>::itable<x10_regionarray_PolyMatBuilder__closure__3>x10_regionarray_PolyMatBuilder__closure__3::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_PolyMatBuilder__closure__3::__apply, &x10_regionarray_PolyMatBuilder__closure__3::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_PolyMatBuilder__closure__3::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_int, x10_int> >, &x10_regionarray_PolyMatBuilder__closure__3::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_PolyMatBuilder__closure__3::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_PolyMatBuilder__closure__3::_deserialize);

/* END of PolyMatBuilder */
/*************************************************/
