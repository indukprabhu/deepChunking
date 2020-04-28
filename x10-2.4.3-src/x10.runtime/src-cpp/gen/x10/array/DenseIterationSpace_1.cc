/*************************************************/
/* START of DenseIterationSpace_1 */
#include <x10/array/DenseIterationSpace_1.h>

::x10::lang::Iterable< ::x10::lang::Point*>::itable< ::x10::array::DenseIterationSpace_1 >  x10::array::DenseIterationSpace_1::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::array::DenseIterationSpace_1::iterator, &::x10::array::IterationSpace::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::array::DenseIterationSpace_1 >  x10::array::DenseIterationSpace_1::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::array::IterationSpace::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::array::DenseIterationSpace_1::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Point*> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::array::DenseIterationSpace_1")};

//#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"

//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
::x10::array::DenseIterationSpace_1* x10::array::DenseIterationSpace_1::FMGL(EMPTY);
void x10::array::DenseIterationSpace_1::FMGL(EMPTY__do_init)() {
    FMGL(EMPTY__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::array::DenseIterationSpace_1.EMPTY");
    ::x10::array::DenseIterationSpace_1* __var51__ = ::x10::array::DenseIterationSpace_1::_make(((x10_long)0ll),
                                                                                                ((x10_long)-1ll));
    FMGL(EMPTY) = __var51__;
    FMGL(EMPTY__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::array::DenseIterationSpace_1::FMGL(EMPTY__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(EMPTY__status), &FMGL(EMPTY__do_init), &FMGL(EMPTY__exception), "x10::array::DenseIterationSpace_1.EMPTY");
    
}
volatile ::x10aux::StaticInitController::status x10::array::DenseIterationSpace_1::FMGL(EMPTY__status);
::x10::lang::CheckedThrowable* x10::array::DenseIterationSpace_1::FMGL(EMPTY__exception);

//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
void x10::array::DenseIterationSpace_1::_constructor(x10_long min,
                                                     x10_long max) {
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    ::x10::array::IterationSpace* this__74343 = this;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/IterationSpace.x10"
    ::x10aux::nullCheck(this__74343)->FMGL(rank) = ((x10_long)1ll);
    ::x10aux::nullCheck(this__74343)->FMGL(rect) = true;
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    ::x10::array::DenseIterationSpace_1* this__74342 = this;
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    this->FMGL(min) = min;
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    this->FMGL(max) = max;
}
::x10::array::DenseIterationSpace_1* x10::array::DenseIterationSpace_1::_make(
  x10_long min, x10_long max) {
    ::x10::array::DenseIterationSpace_1* this_ = new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_1>()) ::x10::array::DenseIterationSpace_1();
    this_->_constructor(min, max);
    return this_;
}



//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
x10_long x10::array::DenseIterationSpace_1::min(x10_long i) {
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    if ((!::x10aux::struct_equals(i, ((x10_long)0ll)))) {
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::IllegalOperationException::_make(::x10::lang::String::__plus(i, (__extension__ ({ static ::x10::lang::String* strLit__123321 = ::x10aux::makeStringLit(" is not a valid rank"); strLit__123321; }))))));
    }
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    return this->FMGL(min);
    
}

//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
x10_long x10::array::DenseIterationSpace_1::max(x10_long i) {
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    if ((!::x10aux::struct_equals(i, ((x10_long)0ll)))) {
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::IllegalOperationException::_make(::x10::lang::String::__plus(i, (__extension__ ({ static ::x10::lang::String* strLit__123324 = ::x10aux::makeStringLit(" is not a valid rank"); strLit__123324; }))))));
    }
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    return this->FMGL(max);
    
}

//#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
x10_boolean x10::array::DenseIterationSpace_1::isEmpty() {
    return ((this->FMGL(max)) < (this->FMGL(min)));
    
}

//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
::x10::lang::Iterator< ::x10::lang::Point*>* x10::array::DenseIterationSpace_1::iterator(
  ) {
    ::x10::array::DenseIterationSpace_1__DIS_1_It* alloc__74346 =
       (new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_1__DIS_1_It>()) ::x10::array::DenseIterationSpace_1__DIS_1_It());
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    x10_long min__74344 = this->FMGL(min);
    x10_long max__74345 = this->FMGL(max);
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    alloc__74346->FMGL(cur) = ((x10_long)0ll);
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    alloc__74346->FMGL(cur) = min__74344;
    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    alloc__74346->FMGL(last) = max__74345;
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    return reinterpret_cast< ::x10::lang::Iterator< ::x10::lang::Point*>*>(alloc__74346);
    
}

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
::x10::array::DenseIterationSpace_1* x10::array::DenseIterationSpace_1::x10__array__DenseIterationSpace_1____this__x10__array__DenseIterationSpace_1(
  ) {
    return this;
    
}
void x10::array::DenseIterationSpace_1::__fieldInitializers_x10_array_DenseIterationSpace_1(
  ) {
 
}
const ::x10aux::serialization_id_t x10::array::DenseIterationSpace_1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::array::DenseIterationSpace_1::_deserializer);

void x10::array::DenseIterationSpace_1::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::array::IterationSpace::_serialize_body(buf);
    buf.write(this->FMGL(min));
    buf.write(this->FMGL(max));
    
}

::x10::lang::Reference* ::x10::array::DenseIterationSpace_1::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::array::DenseIterationSpace_1* this_ = new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_1>()) ::x10::array::DenseIterationSpace_1();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::array::DenseIterationSpace_1::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::array::IterationSpace::_deserialize_body(buf);
    FMGL(min) = buf.read<x10_long>();
    FMGL(max) = buf.read<x10_long>();
    
}

::x10aux::RuntimeType x10::array::DenseIterationSpace_1::rtt;
void x10::array::DenseIterationSpace_1::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::array::IterationSpace>()};
    rtt.initStageTwo("x10.array.DenseIterationSpace_1",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of DenseIterationSpace_1 */
/*************************************************/
/*************************************************/
/* START of DenseIterationSpace_1$DIS_1_It */
#include <x10/array/DenseIterationSpace_1__DIS_1_It.h>

#include <x10/lang/Iterator.h>
#include <x10/lang/Point.h>
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/compiler/Synthetic.h>
::x10::lang::Iterator< ::x10::lang::Point*>::itable< ::x10::array::DenseIterationSpace_1__DIS_1_It >  x10::array::DenseIterationSpace_1__DIS_1_It::_itable_0(&::x10::lang::X10Class::equals, &x10::array::DenseIterationSpace_1__DIS_1_It::hasNext, &::x10::lang::X10Class::hashCode, &x10::array::DenseIterationSpace_1__DIS_1_It::next, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::array::DenseIterationSpace_1__DIS_1_It >  x10::array::DenseIterationSpace_1__DIS_1_It::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::array::DenseIterationSpace_1__DIS_1_It::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterator< ::x10::lang::Point*> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::array::DenseIterationSpace_1__DIS_1_It")};

//#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"

//#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"

//#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
void x10::array::DenseIterationSpace_1__DIS_1_It::_constructor(x10_long min,
                                                               x10_long max) {
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    ::x10::array::DenseIterationSpace_1__DIS_1_It* this__74347 = this;
    ::x10aux::nullCheck(this__74347)->FMGL(cur) = ((x10_long)0ll);
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    this->FMGL(cur) = min;
    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    this->FMGL(last) = max;
}
::x10::array::DenseIterationSpace_1__DIS_1_It* x10::array::DenseIterationSpace_1__DIS_1_It::_make(
  x10_long min, x10_long max) {
    ::x10::array::DenseIterationSpace_1__DIS_1_It* this_ = new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_1__DIS_1_It>()) ::x10::array::DenseIterationSpace_1__DIS_1_It();
    this_->_constructor(min, max);
    return this_;
}



//#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
x10_boolean x10::array::DenseIterationSpace_1__DIS_1_It::hasNext(
  ) {
    return ((this->FMGL(cur)) <= (this->FMGL(last)));
    
}

//#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
::x10::lang::Point* x10::array::DenseIterationSpace_1__DIS_1_It::next(
  ) {
    
    //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    x10_long i__74349 = ((this->FMGL(cur) = ((this->FMGL(cur)) + (((x10_long)1ll)))) - (((x10_long)1ll)));
    ::x10::lang::Point* alloc__74348 =  (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
    (alloc__74348)->::x10::lang::Point::_constructor(i__74349);
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
    return alloc__74348;
    
}

//#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DenseIterationSpace_1.x10"
::x10::array::DenseIterationSpace_1__DIS_1_It* x10::array::DenseIterationSpace_1__DIS_1_It::x10__array__DenseIterationSpace_1__DIS_1_It____this__x10__array__DenseIterationSpace_1__DIS_1_It(
  ) {
    return this;
    
}
void x10::array::DenseIterationSpace_1__DIS_1_It::__fieldInitializers_x10_array_DenseIterationSpace_1_DIS_1_It(
  ) {
    this->FMGL(cur) = ((x10_long)0ll);
}
const ::x10aux::serialization_id_t x10::array::DenseIterationSpace_1__DIS_1_It::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::array::DenseIterationSpace_1__DIS_1_It::_deserializer);

void x10::array::DenseIterationSpace_1__DIS_1_It::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(cur));
    buf.write(this->FMGL(last));
    
}

::x10::lang::Reference* ::x10::array::DenseIterationSpace_1__DIS_1_It::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::array::DenseIterationSpace_1__DIS_1_It* this_ = new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_1__DIS_1_It>()) ::x10::array::DenseIterationSpace_1__DIS_1_It();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::array::DenseIterationSpace_1__DIS_1_It::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(cur) = buf.read<x10_long>();
    FMGL(last) = buf.read<x10_long>();
}

::x10aux::RuntimeType x10::array::DenseIterationSpace_1__DIS_1_It::rtt;
void x10::array::DenseIterationSpace_1__DIS_1_It::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Iterator< ::x10::lang::Point*> >()};
    rtt.initStageTwo("x10.array.DenseIterationSpace_1.DIS_1_It",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of DenseIterationSpace_1$DIS_1_It */
/*************************************************/
