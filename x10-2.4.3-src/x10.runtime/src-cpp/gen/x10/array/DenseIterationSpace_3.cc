/*************************************************/
/* START of DenseIterationSpace_3 */
#include <x10/array/DenseIterationSpace_3.h>

::x10::lang::Iterable< ::x10::lang::Point*>::itable< ::x10::array::DenseIterationSpace_3 >  x10::array::DenseIterationSpace_3::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::array::DenseIterationSpace_3::iterator, &::x10::array::IterationSpace::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::array::DenseIterationSpace_3 >  x10::array::DenseIterationSpace_3::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::array::IterationSpace::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::array::DenseIterationSpace_3::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Point*> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::array::DenseIterationSpace_3")};

//#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"

//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"

//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"

//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
::x10::array::DenseIterationSpace_3* x10::array::DenseIterationSpace_3::FMGL(EMPTY);
void x10::array::DenseIterationSpace_3::FMGL(EMPTY__do_init)() {
    FMGL(EMPTY__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::array::DenseIterationSpace_3.EMPTY");
    ::x10::array::DenseIterationSpace_3* __var74__ = ::x10::array::DenseIterationSpace_3::_make(((x10_long)0ll),
                                                                                                ((x10_long)0ll),
                                                                                                ((x10_long)0ll),
                                                                                                ((x10_long)-1ll),
                                                                                                ((x10_long)-1ll),
                                                                                                ((x10_long)-1ll));
    FMGL(EMPTY) = __var74__;
    FMGL(EMPTY__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::array::DenseIterationSpace_3::FMGL(EMPTY__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(EMPTY__status), &FMGL(EMPTY__do_init), &FMGL(EMPTY__exception), "x10::array::DenseIterationSpace_3.EMPTY");
    
}
volatile ::x10aux::StaticInitController::status x10::array::DenseIterationSpace_3::FMGL(EMPTY__status);
::x10::lang::CheckedThrowable* x10::array::DenseIterationSpace_3::FMGL(EMPTY__exception);

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
void x10::array::DenseIterationSpace_3::_constructor(x10_long min0,
                                                     x10_long min1,
                                                     x10_long min2,
                                                     x10_long max0,
                                                     x10_long max1,
                                                     x10_long max2) {
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    ::x10::array::IterationSpace* this__74386 = this;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
    ::x10aux::nullCheck(this__74386)->FMGL(rank) = ((x10_long)3ll);
    ::x10aux::nullCheck(this__74386)->FMGL(rect) = true;
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    ::x10::array::DenseIterationSpace_3* this__74385 = this;
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    this->FMGL(min0) = min0;
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    this->FMGL(min1) = min1;
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    this->FMGL(min2) = min2;
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    this->FMGL(max0) = max0;
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    this->FMGL(max1) = max1;
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    this->FMGL(max2) = max2;
}
::x10::array::DenseIterationSpace_3* x10::array::DenseIterationSpace_3::_make(
  x10_long min0, x10_long min1, x10_long min2, x10_long max0,
  x10_long max1, x10_long max2) {
    ::x10::array::DenseIterationSpace_3* this_ = new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_3>()) ::x10::array::DenseIterationSpace_3();
    this_->_constructor(min0, min1, min2, max0, max1, max2);
    return this_;
}



//#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
x10_long x10::array::DenseIterationSpace_3::min(x10_long i) {
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    if ((::x10aux::struct_equals(i, ((x10_long)0ll)))) {
        return this->FMGL(min0);
        
    }
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    if ((::x10aux::struct_equals(i, ((x10_long)1ll)))) {
        return this->FMGL(min1);
        
    }
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    if ((::x10aux::struct_equals(i, ((x10_long)2ll)))) {
        return this->FMGL(min2);
        
    }
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::IllegalOperationException::_make(::x10::lang::String::__plus(i, (__extension__ ({ static ::x10::lang::String* strLit__123346 = ::x10aux::makeStringLit(" is not a valid rank"); strLit__123346; }))))));
}

//#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
x10_long x10::array::DenseIterationSpace_3::max(x10_long i) {
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    if ((::x10aux::struct_equals(i, ((x10_long)0ll)))) {
        return this->FMGL(max0);
        
    }
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    if ((::x10aux::struct_equals(i, ((x10_long)1ll)))) {
        return this->FMGL(max1);
        
    }
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    if ((::x10aux::struct_equals(i, ((x10_long)2ll)))) {
        return this->FMGL(max2);
        
    }
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::IllegalOperationException::_make(::x10::lang::String::__plus(i, (__extension__ ({ static ::x10::lang::String* strLit__123351 = ::x10aux::makeStringLit(" is not a valid rank"); strLit__123351; }))))));
}

//#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
x10_boolean x10::array::DenseIterationSpace_3::isEmpty() {
    return ((((this->FMGL(max0)) < (this->FMGL(min0))) ||
    ((this->FMGL(max1)) < (this->FMGL(min1)))) || ((this->FMGL(max2)) < (this->FMGL(min2))));
    
}

//#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
::x10::lang::Iterator< ::x10::lang::Point*>* x10::array::DenseIterationSpace_3::iterator(
  ) {
    ::x10::array::DenseIterationSpace_3__DIS3_It* alloc__74387 =
       (new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_3__DIS3_It>()) ::x10::array::DenseIterationSpace_3__DIS3_It());
    (alloc__74387)->::x10::array::DenseIterationSpace_3__DIS3_It::_constructor(
      this);
    return reinterpret_cast< ::x10::lang::Iterator< ::x10::lang::Point*>*>(alloc__74387);
    
}

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
::x10::array::DenseIterationSpace_3* x10::array::DenseIterationSpace_3::x10__array__DenseIterationSpace_3____this__x10__array__DenseIterationSpace_3(
  ) {
    return this;
    
}
void x10::array::DenseIterationSpace_3::__fieldInitializers_x10_array_DenseIterationSpace_3(
  ) {
 
}
const ::x10aux::serialization_id_t x10::array::DenseIterationSpace_3::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::array::DenseIterationSpace_3::_deserializer);

void x10::array::DenseIterationSpace_3::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::array::IterationSpace::_serialize_body(buf);
    buf.write(this->FMGL(min0));
    buf.write(this->FMGL(min1));
    buf.write(this->FMGL(min2));
    buf.write(this->FMGL(max0));
    buf.write(this->FMGL(max1));
    buf.write(this->FMGL(max2));
    
}

::x10::lang::Reference* ::x10::array::DenseIterationSpace_3::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::array::DenseIterationSpace_3* this_ = new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_3>()) ::x10::array::DenseIterationSpace_3();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::array::DenseIterationSpace_3::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::array::IterationSpace::_deserialize_body(buf);
    FMGL(min0) = buf.read<x10_long>();
    FMGL(min1) = buf.read<x10_long>();
    FMGL(min2) = buf.read<x10_long>();
    FMGL(max0) = buf.read<x10_long>();
    FMGL(max1) = buf.read<x10_long>();
    FMGL(max2) = buf.read<x10_long>();
    
}

::x10aux::RuntimeType x10::array::DenseIterationSpace_3::rtt;
void x10::array::DenseIterationSpace_3::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::array::IterationSpace>()};
    rtt.initStageTwo("x10.array.DenseIterationSpace_3",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of DenseIterationSpace_3 */
/*************************************************/
/*************************************************/
/* START of DenseIterationSpace_3$DIS3_It */
#include <x10/array/DenseIterationSpace_3__DIS3_It.h>

#include <x10/lang/Iterator.h>
#include <x10/lang/Point.h>
#include <x10/lang/Long.h>
#include <x10/array/DenseIterationSpace_3.h>
#include <x10/lang/Boolean.h>
#include <x10/compiler/Synthetic.h>
::x10::lang::Iterator< ::x10::lang::Point*>::itable< ::x10::array::DenseIterationSpace_3__DIS3_It >  x10::array::DenseIterationSpace_3__DIS3_It::_itable_0(&::x10::lang::X10Class::equals, &x10::array::DenseIterationSpace_3__DIS3_It::hasNext, &::x10::lang::X10Class::hashCode, &x10::array::DenseIterationSpace_3__DIS3_It::next, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::array::DenseIterationSpace_3__DIS3_It >  x10::array::DenseIterationSpace_3__DIS3_It::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::array::DenseIterationSpace_3__DIS3_It::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterator< ::x10::lang::Point*> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::array::DenseIterationSpace_3__DIS3_It")};

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"

//#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"

//#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"

//#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"

//#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
void x10::array::DenseIterationSpace_3__DIS3_It::_constructor(::x10::array::DenseIterationSpace_3* out__) {
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    this->FMGL(out__) = out__;
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    ::x10::array::DenseIterationSpace_3__DIS3_It* this__74388 = this;
    ::x10aux::nullCheck(this__74388)->FMGL(cur0) = ((x10_long)0ll);
    ::x10aux::nullCheck(this__74388)->FMGL(cur1) = ((x10_long)0ll);
    ::x10aux::nullCheck(this__74388)->FMGL(cur2) = ((x10_long)0ll);
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    this->FMGL(cur0) = ::x10aux::nullCheck(this->FMGL(out__))->FMGL(min0);
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    this->FMGL(cur1) = ::x10aux::nullCheck(this->FMGL(out__))->FMGL(min1);
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    this->FMGL(cur2) = ::x10aux::nullCheck(this->FMGL(out__))->FMGL(min2);
}
::x10::array::DenseIterationSpace_3__DIS3_It* x10::array::DenseIterationSpace_3__DIS3_It::_make(
  ::x10::array::DenseIterationSpace_3* out__) {
    ::x10::array::DenseIterationSpace_3__DIS3_It* this_ = new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_3__DIS3_It>()) ::x10::array::DenseIterationSpace_3__DIS3_It();
    this_->_constructor(out__);
    return this_;
}



//#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
x10_boolean x10::array::DenseIterationSpace_3__DIS3_It::hasNext() {
    return ((((this->FMGL(cur0)) <= (::x10aux::nullCheck(this->FMGL(out__))->FMGL(max0))) &&
    ((this->FMGL(cur1)) <= (::x10aux::nullCheck(this->FMGL(out__))->FMGL(max1)))) &&
    ((this->FMGL(cur2)) <= (::x10aux::nullCheck(this->FMGL(out__))->FMGL(max2))));
    
}

//#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
::x10::lang::Point* x10::array::DenseIterationSpace_3__DIS3_It::next(
  ) {
    
    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    ::x10::lang::Point* p = (__extension__ ({
        
        //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        x10_long i__74381 = this->FMGL(cur0);
        x10_long i__74382 = this->FMGL(cur1);
        x10_long i__74383 = this->FMGL(cur2);
        (__extension__ ({
            ::x10::lang::Point* alloc__74384 =  (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
            (alloc__74384)->::x10::lang::Point::_constructor(
              i__74381, i__74382, i__74383);
            alloc__74384;
        }))
        ;
    }))
    ;
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    this->FMGL(cur2) = ((this->FMGL(cur2)) + (((x10_long)1ll)));
    
    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    if (((this->FMGL(cur2)) > (::x10aux::nullCheck(this->FMGL(out__))->FMGL(max2))))
    {
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        this->FMGL(cur2) = ::x10aux::nullCheck(this->FMGL(out__))->FMGL(min2);
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        this->FMGL(cur1) = ((this->FMGL(cur1)) + (((x10_long)1ll)));
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
        if (((this->FMGL(cur1)) > (::x10aux::nullCheck(this->FMGL(out__))->FMGL(max1))))
        {
            
            //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            this->FMGL(cur1) = ::x10aux::nullCheck(this->FMGL(out__))->FMGL(min1);
            
            //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
            this->FMGL(cur0) = ((this->FMGL(cur0)) + (((x10_long)1ll)));
        }
        
    }
    
    //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
    return p;
    
}

//#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_3.x10"
::x10::array::DenseIterationSpace_3__DIS3_It* x10::array::DenseIterationSpace_3__DIS3_It::x10__array__DenseIterationSpace_3__DIS3_It____this__x10__array__DenseIterationSpace_3__DIS3_It(
  ) {
    return this;
    
}
::x10::array::DenseIterationSpace_3* x10::array::DenseIterationSpace_3__DIS3_It::x10__array__DenseIterationSpace_3__DIS3_It____this__x10__array__DenseIterationSpace_3(
  ) {
    return this->FMGL(out__);
    
}
void x10::array::DenseIterationSpace_3__DIS3_It::__fieldInitializers_x10_array_DenseIterationSpace_3_DIS3_It(
  ) {
    this->FMGL(cur0) = ((x10_long)0ll);
    this->FMGL(cur1) = ((x10_long)0ll);
    this->FMGL(cur2) = ((x10_long)0ll);
}
const ::x10aux::serialization_id_t x10::array::DenseIterationSpace_3__DIS3_It::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::array::DenseIterationSpace_3__DIS3_It::_deserializer);

void x10::array::DenseIterationSpace_3__DIS3_It::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(cur0));
    buf.write(this->FMGL(cur1));
    buf.write(this->FMGL(cur2));
    buf.write(this->FMGL(out__));
    
}

::x10::lang::Reference* ::x10::array::DenseIterationSpace_3__DIS3_It::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::array::DenseIterationSpace_3__DIS3_It* this_ = new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_3__DIS3_It>()) ::x10::array::DenseIterationSpace_3__DIS3_It();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::array::DenseIterationSpace_3__DIS3_It::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(cur0) = buf.read<x10_long>();
    FMGL(cur1) = buf.read<x10_long>();
    FMGL(cur2) = buf.read<x10_long>();
    FMGL(out__) = buf.read< ::x10::array::DenseIterationSpace_3*>();
}

::x10aux::RuntimeType x10::array::DenseIterationSpace_3__DIS3_It::rtt;
void x10::array::DenseIterationSpace_3__DIS3_It::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Iterator< ::x10::lang::Point*> >()};
    rtt.initStageTwo("x10.array.DenseIterationSpace_3.DIS3_It",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of DenseIterationSpace_3$DIS3_It */
/*************************************************/
