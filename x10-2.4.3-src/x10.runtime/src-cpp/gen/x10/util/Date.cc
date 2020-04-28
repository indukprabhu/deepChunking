/*************************************************/
/* START of Date */
#include <x10/util/Date.h>

#include <x10/lang/Comparable.h>
#include <x10/lang/Long.h>
#include <x10/util/Timer.h>
#include <x10/lang/Int.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/String.h>
#include <x10/compiler/Native.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeCPPInclude.h>
::x10::lang::Comparable< ::x10::util::Date* >::itable< ::x10::util::Date >  x10::util::Date::_itable_0(&x10::util::Date::compareTo, &::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::util::Date::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::util::Date >  x10::util::Date::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::util::Date::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::util::Date::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Comparable< ::x10::util::Date* > >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::util::Date")};

//#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"

//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
void x10::util::Date::_constructor() {
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
    ::x10::util::Date* this__117533 = this;
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
    x10_long millis__117534 = ::x10::lang::RuntimeNatives::currentTimeMillis();
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
    ::x10aux::nullCheck(this__117533)->FMGL(millis) = ((x10_long)0ll);
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
    ::x10aux::nullCheck(this__117533)->FMGL(millis) = millis__117534;
}
::x10::util::Date* x10::util::Date::_make() {
    ::x10::util::Date* this_ = new (::x10aux::alloc_z< ::x10::util::Date>()) ::x10::util::Date();
    this_->_constructor();
    return this_;
}



//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
void x10::util::Date::_constructor(x10_long millis) {
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
    ::x10::util::Date* this__117535 = this;
    ::x10aux::nullCheck(this__117535)->FMGL(millis) = ((x10_long)0ll);
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
    this->FMGL(millis) = millis;
}
::x10::util::Date* x10::util::Date::_make(x10_long millis) {
    ::x10::util::Date* this_ = new (::x10aux::alloc_z< ::x10::util::Date>()) ::x10::util::Date();
    this_->_constructor(millis);
    return this_;
}



//#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
x10_long x10::util::Date::getTime() {
    return this->FMGL(millis);
    
}

//#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
void x10::util::Date::setTime(x10_long millis) {
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
    this->FMGL(millis) = millis;
}

//#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
x10_int x10::util::Date::compareTo(::x10::util::Date* x) {
    return ::x10::lang::LongNatives::compareTo(this->FMGL(millis), ::x10aux::nullCheck(x)->FMGL(millis));
    
}

//#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
x10_boolean x10::util::Date::equals(::x10::util::Date* x) {
    return (::x10aux::struct_equals(this->FMGL(millis), ::x10aux::nullCheck(x)->FMGL(millis)));
    
}

//#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
x10_boolean x10::util::Date::before(::x10::util::Date* x) {
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
    return ((((x10_long)(this->compareTo(x)))) < (((x10_long)0ll)));
    
}

//#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
x10_boolean x10::util::Date::after(::x10::util::Date* x) {
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
    return ((((x10_long)(this->compareTo(x)))) > (((x10_long)0ll)));
    
}

//#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
::x10::lang::String* x10::util::Date::toString(){
    return ::x10::lang::RuntimeNatives::timeToString((this)->FMGL(millis) / 1000);
}

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Date.x10"
::x10::util::Date* x10::util::Date::x10__util__Date____this__x10__util__Date(
  ) {
    return this;
    
}
void x10::util::Date::__fieldInitializers_x10_util_Date() {
    this->FMGL(millis) = ((x10_long)0ll);
}
const ::x10aux::serialization_id_t x10::util::Date::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::Date::_deserializer);

void x10::util::Date::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(millis));
    
}

::x10::lang::Reference* ::x10::util::Date::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::Date* this_ = new (::x10aux::alloc_z< ::x10::util::Date>()) ::x10::util::Date();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::util::Date::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(millis) = buf.read<x10_long>();
}

::x10aux::RuntimeType x10::util::Date::rtt;
void x10::util::Date::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Comparable< ::x10::util::Date* > >()};
    rtt.initStageTwo("x10.util.Date",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of Date */
/*************************************************/
