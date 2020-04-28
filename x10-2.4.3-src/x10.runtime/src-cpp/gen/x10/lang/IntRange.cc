/*************************************************/
/* START of IntRange */
#include <x10/lang/IntRange.h>

#include <x10/lang/Any.h>
#include <x10/lang/Iterable.h>
#include <x10/lang/Int.h>
#include <x10/lang/LongRange.h>
#include <x10/lang/Long.h>
#include <x10/lang/String.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Iterator.h>
#include <x10/lang/IntRange__IntRangeIt.h>
#include <x10/compiler/Native.h>
#include <x10/compiler/NonEscaping.h>
#include <x10/compiler/Synthetic.h>

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
namespace x10 { namespace lang { 
class IntRange_ibox0 : public ::x10::lang::IBox< ::x10::lang::IntRange> {
public:
    static ::x10::lang::Any::itable< IntRange_ibox0 > itable;
    x10_boolean equals(::x10::lang::Any* arg0) {
        return this->value->equals(arg0);
    }
    x10_int hashCode() {
        return this->value->hashCode();
    }
    ::x10::lang::String* toString() {
        return this->value->toString();
    }
    ::x10::lang::String* typeName() {
        return this->value->typeName();
    }
    
};
::x10::lang::Any::itable< IntRange_ibox0 >  IntRange_ibox0::itable(&IntRange_ibox0::equals, &IntRange_ibox0::hashCode, &IntRange_ibox0::toString, &IntRange_ibox0::typeName);
} } 
::x10::lang::Any::itable< ::x10::lang::IntRange >  x10::lang::IntRange::_itable_0(&x10::lang::IntRange::equals, &x10::lang::IntRange::hashCode, &x10::lang::IntRange::toString, &x10::lang::IntRange::typeName);
namespace x10 { namespace lang { 
class IntRange_ibox1 : public ::x10::lang::IBox< ::x10::lang::IntRange> {
public:
    static ::x10::lang::Iterable<x10_int>::itable< IntRange_ibox1 > itable;
    x10_boolean equals(::x10::lang::Any* arg0) {
        return this->value->equals(arg0);
    }
    x10_int hashCode() {
        return this->value->hashCode();
    }
    ::x10::lang::Iterator<x10_int>* iterator() {
        return this->value->iterator();
    }
    ::x10::lang::String* toString() {
        return this->value->toString();
    }
    ::x10::lang::String* typeName() {
        return this->value->typeName();
    }
    
};
::x10::lang::Iterable<x10_int>::itable< IntRange_ibox1 >  IntRange_ibox1::itable(&IntRange_ibox1::equals, &IntRange_ibox1::hashCode, &IntRange_ibox1::iterator, &IntRange_ibox1::toString, &IntRange_ibox1::typeName);
} } 
::x10::lang::Iterable<x10_int>::itable< ::x10::lang::IntRange >  x10::lang::IntRange::_itable_1(&x10::lang::IntRange::equals, &x10::lang::IntRange::hashCode, &x10::lang::IntRange::iterator, &x10::lang::IntRange::toString, &x10::lang::IntRange::typeName);
::x10aux::itable_entry x10::lang::IntRange::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &x10::lang::IntRange::_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable<x10_int> >, &x10::lang::IntRange::_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::IntRange")};
::x10aux::itable_entry x10::lang::IntRange::_iboxitables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &x10::lang::IntRange_ibox0::itable), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable<x10_int> >, &x10::lang::IntRange_ibox1::itable), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::IntRange")};

//#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"


//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
::x10::lang::IntRange x10::lang::IntRange::__convert(::x10::lang::LongRange x) {
    ::x10::lang::IntRange alloc__103040 =  ::x10::lang::IntRange::_alloc();
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
    x10_int min__103038 = ((x10_int) (x->FMGL(min)));
    x10_int max__103039 = ((x10_int) (x->FMGL(max)));
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
    alloc__103040->FMGL(min) = min__103038;
    alloc__103040->FMGL(max) = max__103039;
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
    return alloc__103040;
    
}

//#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
::x10::lang::String* x10::lang::IntRange::toString() {
    return ::x10::lang::String::__plus(::x10::lang::String::__plus((*this)->FMGL(min), (__extension__ ({ static ::x10::lang::String* strLit__125002 = ::x10aux::makeStringLit(".."); strLit__125002; }))), (*this)->FMGL(max));
    
}

//#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
x10_boolean x10::lang::IntRange::equals(::x10::lang::Any* that) {
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
    if (::x10aux::instanceof< ::x10::lang::IntRange>(that)) {
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        ::x10::lang::IntRange other = ::x10aux::class_cast< ::x10::lang::IntRange>(that);
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
        return ((::x10aux::struct_equals((*this)->FMGL(min), other->FMGL(min))) &&
        (::x10aux::struct_equals((*this)->FMGL(max), other->FMGL(max))));
        
    }
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
    return false;
    
}

//#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
x10_int x10::lang::IntRange::hashCode() {
    return ::x10aux::hash_code((((*this)->FMGL(max)) - ((*this)->FMGL(min))));
    
}

//#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
::x10::lang::Iterator<x10_int>* x10::lang::IntRange::iterator() {
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
    ::x10::lang::IntRange__IntRangeIt* alloc__103043 =  (new (::x10aux::alloc_z< ::x10::lang::IntRange__IntRangeIt>()) ::x10::lang::IntRange__IntRangeIt());
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
    x10_int min__103041 = (*this)->FMGL(min);
    x10_int max__103042 = (*this)->FMGL(max);
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
    alloc__103043->FMGL(cur) = ((x10_int)0);
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
    alloc__103043->FMGL(cur) = min__103041;
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
    alloc__103043->FMGL(max) = max__103042;
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
    return reinterpret_cast< ::x10::lang::Iterator<x10_int>*>(alloc__103043);
    
}

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
::x10::lang::String* x10::lang::IntRange::typeName(){
    return ::x10aux::type_name((*this));
}
x10_boolean x10::lang::IntRange::_struct_equals(::x10::lang::Any* other) {
    if (!(::x10aux::instanceof< ::x10::lang::IntRange>(other))) {
        return false;
        
    }
    return (*this)->x10::lang::IntRange::_struct_equals(::x10aux::class_cast< ::x10::lang::IntRange>(other));
    
}

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
void ::x10::lang::IntRange::_serialize(::x10::lang::IntRange this_, ::x10aux::serialization_buffer& buf) {
    buf.write(this_->FMGL(min));
    buf.write(this_->FMGL(max));
    
}

void ::x10::lang::IntRange::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(min) = buf.read<x10_int>();
    FMGL(max) = buf.read<x10_int>();
}


::x10aux::RuntimeType x10::lang::IntRange::rtt;
void x10::lang::IntRange::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::Any>(), ::x10aux::getRTT< ::x10::lang::Iterable<x10_int> >()};
    rtt.initStageTwo("x10.lang.IntRange",::x10aux::RuntimeType::struct_kind, 2, parents, 0, NULL, NULL);
    rtt.containsPtrs = false;
}

/* END of IntRange */
/*************************************************/
/*************************************************/
/* START of IntRange$IntRangeIt */
#include <x10/lang/IntRange__IntRangeIt.h>

#include <x10/lang/Iterator.h>
#include <x10/lang/Int.h>
#include <x10/lang/Boolean.h>
#include <x10/compiler/Synthetic.h>
::x10::lang::Iterator<x10_int>::itable< ::x10::lang::IntRange__IntRangeIt >  x10::lang::IntRange__IntRangeIt::_itable_0(&::x10::lang::X10Class::equals, &x10::lang::IntRange__IntRangeIt::hasNext, &::x10::lang::X10Class::hashCode, &x10::lang::IntRange__IntRangeIt::next, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::lang::IntRange__IntRangeIt >  x10::lang::IntRange__IntRangeIt::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::lang::IntRange__IntRangeIt::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterator<x10_int> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::IntRange__IntRangeIt")};

//#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"

//#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"

//#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
void x10::lang::IntRange__IntRangeIt::_constructor(x10_int min, x10_int max) {
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
    ::x10::lang::IntRange__IntRangeIt* this__103044 = this;
    ::x10aux::nullCheck(this__103044)->FMGL(cur) = ((x10_int)0);
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
    this->FMGL(cur) = min;
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
    this->FMGL(max) = max;
}
::x10::lang::IntRange__IntRangeIt* x10::lang::IntRange__IntRangeIt::_make(
  x10_int min, x10_int max) {
    ::x10::lang::IntRange__IntRangeIt* this_ = new (::x10aux::alloc_z< ::x10::lang::IntRange__IntRangeIt>()) ::x10::lang::IntRange__IntRangeIt();
    this_->_constructor(min, max);
    return this_;
}



//#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
x10_boolean x10::lang::IntRange__IntRangeIt::hasNext() {
    return ((this->FMGL(cur)) <= (this->FMGL(max)));
    
}

//#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
x10_int x10::lang::IntRange__IntRangeIt::next() {
    return ((this->FMGL(cur) = ((this->FMGL(cur)) + (((x10_int)1)))) - (((x10_int)1)));
    
}

//#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/IntRange.x10"
::x10::lang::IntRange__IntRangeIt* x10::lang::IntRange__IntRangeIt::x10__lang__IntRange__IntRangeIt____this__x10__lang__IntRange__IntRangeIt(
  ) {
    return this;
    
}
void x10::lang::IntRange__IntRangeIt::__fieldInitializers_x10_lang_IntRange_IntRangeIt(
  ) {
    this->FMGL(cur) = ((x10_int)0);
}
const ::x10aux::serialization_id_t x10::lang::IntRange__IntRangeIt::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::IntRange__IntRangeIt::_deserializer);

void x10::lang::IntRange__IntRangeIt::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(cur));
    buf.write(this->FMGL(max));
    
}

::x10::lang::Reference* ::x10::lang::IntRange__IntRangeIt::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::IntRange__IntRangeIt* this_ = new (::x10aux::alloc_z< ::x10::lang::IntRange__IntRangeIt>()) ::x10::lang::IntRange__IntRangeIt();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::IntRange__IntRangeIt::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(cur) = buf.read<x10_int>();
    FMGL(max) = buf.read<x10_int>();
}

::x10aux::RuntimeType x10::lang::IntRange__IntRangeIt::rtt;
void x10::lang::IntRange__IntRangeIt::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Iterator<x10_int> >()};
    rtt.initStageTwo("x10.lang.IntRange.IntRangeIt",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of IntRange$IntRangeIt */
/*************************************************/
