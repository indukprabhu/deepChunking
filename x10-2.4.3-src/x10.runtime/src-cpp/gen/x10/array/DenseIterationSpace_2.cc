/*************************************************/
/* START of DenseIterationSpace_2 */
#include <x10/array/DenseIterationSpace_2.h>

::x10::lang::Iterable< ::x10::lang::Point*>::itable< ::x10::array::DenseIterationSpace_2 >  x10::array::DenseIterationSpace_2::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::array::DenseIterationSpace_2::iterator, &::x10::array::IterationSpace::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::array::DenseIterationSpace_2 >  x10::array::DenseIterationSpace_2::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::array::IterationSpace::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::array::DenseIterationSpace_2::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Point*> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::array::DenseIterationSpace_2")};

//#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"

//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"

//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
::x10::array::DenseIterationSpace_2* x10::array::DenseIterationSpace_2::FMGL(EMPTY);
void x10::array::DenseIterationSpace_2::FMGL(EMPTY__do_init)() {
    FMGL(EMPTY__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::array::DenseIterationSpace_2.EMPTY");
    ::x10::array::DenseIterationSpace_2* __var62__ = ::x10::array::DenseIterationSpace_2::_make(((x10_long)0ll),
                                                                                                ((x10_long)0ll),
                                                                                                ((x10_long)-1ll),
                                                                                                ((x10_long)-1ll));
    FMGL(EMPTY) = __var62__;
    FMGL(EMPTY__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::array::DenseIterationSpace_2::FMGL(EMPTY__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(EMPTY__status), &FMGL(EMPTY__do_init), &FMGL(EMPTY__exception), "x10::array::DenseIterationSpace_2.EMPTY");
    
}
volatile ::x10aux::StaticInitController::status x10::array::DenseIterationSpace_2::FMGL(EMPTY__status);
::x10::lang::CheckedThrowable* x10::array::DenseIterationSpace_2::FMGL(EMPTY__exception);

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
void x10::array::DenseIterationSpace_2::_constructor(x10_long min0,
                                                     x10_long min1,
                                                     x10_long max0,
                                                     x10_long max1) {
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    ::x10::array::IterationSpace* this__74366 = this;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
    ::x10aux::nullCheck(this__74366)->FMGL(rank) = ((x10_long)2ll);
    ::x10aux::nullCheck(this__74366)->FMGL(rect) = true;
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    ::x10::array::DenseIterationSpace_2* this__74365 = this;
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    this->FMGL(min0) = min0;
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    this->FMGL(min1) = min1;
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    this->FMGL(max0) = max0;
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    this->FMGL(max1) = max1;
}
::x10::array::DenseIterationSpace_2* x10::array::DenseIterationSpace_2::_make(
  x10_long min0, x10_long min1, x10_long max0, x10_long max1)
{
    ::x10::array::DenseIterationSpace_2* this_ = new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_2>()) ::x10::array::DenseIterationSpace_2();
    this_->_constructor(min0, min1, max0, max1);
    return this_;
}



//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
x10_long x10::array::DenseIterationSpace_2::min(x10_long i) {
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    if ((::x10aux::struct_equals(i, ((x10_long)0ll)))) {
        return this->FMGL(min0);
        
    }
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    if ((::x10aux::struct_equals(i, ((x10_long)1ll)))) {
        return this->FMGL(min1);
        
    }
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::IllegalOperationException::_make(::x10::lang::String::__plus(i, (__extension__ ({ static ::x10::lang::String* strLit__123333 = ::x10aux::makeStringLit(" is not a valid rank"); strLit__123333; }))))));
}

//#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
x10_long x10::array::DenseIterationSpace_2::max(x10_long i) {
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    if ((::x10aux::struct_equals(i, ((x10_long)0ll)))) {
        return this->FMGL(max0);
        
    }
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    if ((::x10aux::struct_equals(i, ((x10_long)1ll)))) {
        return this->FMGL(max1);
        
    }
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::IllegalOperationException::_make(::x10::lang::String::__plus(i, (__extension__ ({ static ::x10::lang::String* strLit__123337 = ::x10aux::makeStringLit(" is not a valid rank"); strLit__123337; }))))));
}

//#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
x10_boolean x10::array::DenseIterationSpace_2::isEmpty() {
    return (((this->FMGL(max0)) < (this->FMGL(min0))) || ((this->FMGL(max1)) < (this->FMGL(min1))));
    
}

//#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
::x10::lang::Iterator< ::x10::lang::Point*>* x10::array::DenseIterationSpace_2::iterator(
  ) {
    ::x10::array::DenseIterationSpace_2__DIS2_It* alloc__74367 =
       (new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_2__DIS2_It>()) ::x10::array::DenseIterationSpace_2__DIS2_It());
    (alloc__74367)->::x10::array::DenseIterationSpace_2__DIS2_It::_constructor(
      this);
    return reinterpret_cast< ::x10::lang::Iterator< ::x10::lang::Point*>*>(alloc__74367);
    
}

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
::x10::array::DenseIterationSpace_2* x10::array::DenseIterationSpace_2::x10__array__DenseIterationSpace_2____this__x10__array__DenseIterationSpace_2(
  ) {
    return this;
    
}
void x10::array::DenseIterationSpace_2::__fieldInitializers_x10_array_DenseIterationSpace_2(
  ) {
 
}
const ::x10aux::serialization_id_t x10::array::DenseIterationSpace_2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::array::DenseIterationSpace_2::_deserializer);

void x10::array::DenseIterationSpace_2::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::array::IterationSpace::_serialize_body(buf);
    buf.write(this->FMGL(min0));
    buf.write(this->FMGL(min1));
    buf.write(this->FMGL(max0));
    buf.write(this->FMGL(max1));
    
}

::x10::lang::Reference* ::x10::array::DenseIterationSpace_2::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::array::DenseIterationSpace_2* this_ = new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_2>()) ::x10::array::DenseIterationSpace_2();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::array::DenseIterationSpace_2::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::array::IterationSpace::_deserialize_body(buf);
    FMGL(min0) = buf.read<x10_long>();
    FMGL(min1) = buf.read<x10_long>();
    FMGL(max0) = buf.read<x10_long>();
    FMGL(max1) = buf.read<x10_long>();
    
}

::x10aux::RuntimeType x10::array::DenseIterationSpace_2::rtt;
void x10::array::DenseIterationSpace_2::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::array::IterationSpace>()};
    rtt.initStageTwo("x10.array.DenseIterationSpace_2",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of DenseIterationSpace_2 */
/*************************************************/
/*************************************************/
/* START of DenseIterationSpace_2$DIS2_It */
#include <x10/array/DenseIterationSpace_2__DIS2_It.h>

#include <x10/lang/Iterator.h>
#include <x10/lang/Point.h>
#include <x10/lang/Long.h>
#include <x10/array/DenseIterationSpace_2.h>
#include <x10/lang/Boolean.h>
#include <x10/compiler/Synthetic.h>
::x10::lang::Iterator< ::x10::lang::Point*>::itable< ::x10::array::DenseIterationSpace_2__DIS2_It >  x10::array::DenseIterationSpace_2__DIS2_It::_itable_0(&::x10::lang::X10Class::equals, &x10::array::DenseIterationSpace_2__DIS2_It::hasNext, &::x10::lang::X10Class::hashCode, &x10::array::DenseIterationSpace_2__DIS2_It::next, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::array::DenseIterationSpace_2__DIS2_It >  x10::array::DenseIterationSpace_2__DIS2_It::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::array::DenseIterationSpace_2__DIS2_It::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterator< ::x10::lang::Point*> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::array::DenseIterationSpace_2__DIS2_It")};

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"

//#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"

//#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"

//#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
void x10::array::DenseIterationSpace_2__DIS2_It::_constructor(::x10::array::DenseIterationSpace_2* out__) {
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    this->FMGL(out__) = out__;
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    ::x10::array::DenseIterationSpace_2__DIS2_It* this__74368 = this;
    ::x10aux::nullCheck(this__74368)->FMGL(cur0) = ((x10_long)0ll);
    ::x10aux::nullCheck(this__74368)->FMGL(cur1) = ((x10_long)0ll);
    
    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    this->FMGL(cur0) = ::x10aux::nullCheck(this->FMGL(out__))->FMGL(min0);
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    this->FMGL(cur1) = ::x10aux::nullCheck(this->FMGL(out__))->FMGL(min1);
}
::x10::array::DenseIterationSpace_2__DIS2_It* x10::array::DenseIterationSpace_2__DIS2_It::_make(
  ::x10::array::DenseIterationSpace_2* out__) {
    ::x10::array::DenseIterationSpace_2__DIS2_It* this_ = new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_2__DIS2_It>()) ::x10::array::DenseIterationSpace_2__DIS2_It();
    this_->_constructor(out__);
    return this_;
}



//#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
x10_boolean x10::array::DenseIterationSpace_2__DIS2_It::hasNext() {
    return (((this->FMGL(cur0)) <= (::x10aux::nullCheck(this->FMGL(out__))->FMGL(max0))) &&
    ((this->FMGL(cur1)) <= (::x10aux::nullCheck(this->FMGL(out__))->FMGL(max1))));
    
}

//#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
::x10::lang::Point* x10::array::DenseIterationSpace_2__DIS2_It::next(
  ) {
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    ::x10::lang::Point* p = (__extension__ ({
        
        //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        x10_long i__74362 = this->FMGL(cur0);
        x10_long i__74363 = this->FMGL(cur1);
        (__extension__ ({
            ::x10::lang::Point* alloc__74364 =  (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
            (alloc__74364)->::x10::lang::Point::_constructor(
              i__74362, i__74363);
            alloc__74364;
        }))
        ;
    }))
    ;
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    this->FMGL(cur1) = ((this->FMGL(cur1)) + (((x10_long)1ll)));
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    if (((this->FMGL(cur1)) > (::x10aux::nullCheck(this->FMGL(out__))->FMGL(max1))))
    {
        
        //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        this->FMGL(cur1) = ::x10aux::nullCheck(this->FMGL(out__))->FMGL(min1);
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
        this->FMGL(cur0) = ((this->FMGL(cur0)) + (((x10_long)1ll)));
    }
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
    return p;
    
}

//#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_2.x10"
::x10::array::DenseIterationSpace_2__DIS2_It* x10::array::DenseIterationSpace_2__DIS2_It::x10__array__DenseIterationSpace_2__DIS2_It____this__x10__array__DenseIterationSpace_2__DIS2_It(
  ) {
    return this;
    
}
::x10::array::DenseIterationSpace_2* x10::array::DenseIterationSpace_2__DIS2_It::x10__array__DenseIterationSpace_2__DIS2_It____this__x10__array__DenseIterationSpace_2(
  ) {
    return this->FMGL(out__);
    
}
void x10::array::DenseIterationSpace_2__DIS2_It::__fieldInitializers_x10_array_DenseIterationSpace_2_DIS2_It(
  ) {
    this->FMGL(cur0) = ((x10_long)0ll);
    this->FMGL(cur1) = ((x10_long)0ll);
}
const ::x10aux::serialization_id_t x10::array::DenseIterationSpace_2__DIS2_It::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::array::DenseIterationSpace_2__DIS2_It::_deserializer);

void x10::array::DenseIterationSpace_2__DIS2_It::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(cur0));
    buf.write(this->FMGL(cur1));
    buf.write(this->FMGL(out__));
    
}

::x10::lang::Reference* ::x10::array::DenseIterationSpace_2__DIS2_It::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::array::DenseIterationSpace_2__DIS2_It* this_ = new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_2__DIS2_It>()) ::x10::array::DenseIterationSpace_2__DIS2_It();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::array::DenseIterationSpace_2__DIS2_It::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(cur0) = buf.read<x10_long>();
    FMGL(cur1) = buf.read<x10_long>();
    FMGL(out__) = buf.read< ::x10::array::DenseIterationSpace_2*>();
}

::x10aux::RuntimeType x10::array::DenseIterationSpace_2__DIS2_It::rtt;
void x10::array::DenseIterationSpace_2__DIS2_It::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Iterator< ::x10::lang::Point*> >()};
    rtt.initStageTwo("x10.array.DenseIterationSpace_2.DIS2_It",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of DenseIterationSpace_2$DIS2_It */
/*************************************************/
