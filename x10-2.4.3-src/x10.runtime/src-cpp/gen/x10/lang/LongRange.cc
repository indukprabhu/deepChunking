/*************************************************/
/* START of LongRange */
#include <x10/lang/LongRange.h>

#include <x10/lang/Any.h>
#include <x10/lang/Iterable.h>
#include <x10/lang/Long.h>
#include <x10/lang/IntRange.h>
#include <x10/lang/Int.h>
#include <x10/lang/String.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Iterator.h>
#include <x10/lang/LongRange__LongRangeIt.h>
#include <x10/compiler/Native.h>
#include <x10/compiler/NonEscaping.h>
#include <x10/compiler/Synthetic.h>

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
namespace x10 { namespace lang { 
class LongRange_ibox0 : public ::x10::lang::IBox< ::x10::lang::LongRange> {
public:
    static ::x10::lang::Any::itable< LongRange_ibox0 > itable;
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
::x10::lang::Any::itable< LongRange_ibox0 >  LongRange_ibox0::itable(&LongRange_ibox0::equals, &LongRange_ibox0::hashCode, &LongRange_ibox0::toString, &LongRange_ibox0::typeName);
} } 
::x10::lang::Any::itable< ::x10::lang::LongRange >  x10::lang::LongRange::_itable_0(&x10::lang::LongRange::equals, &x10::lang::LongRange::hashCode, &x10::lang::LongRange::toString, &x10::lang::LongRange::typeName);
namespace x10 { namespace lang { 
class LongRange_ibox1 : public ::x10::lang::IBox< ::x10::lang::LongRange> {
public:
    static ::x10::lang::Iterable<x10_long>::itable< LongRange_ibox1 > itable;
    x10_boolean equals(::x10::lang::Any* arg0) {
        return this->value->equals(arg0);
    }
    x10_int hashCode() {
        return this->value->hashCode();
    }
    ::x10::lang::Iterator<x10_long>* iterator() {
        return this->value->iterator();
    }
    ::x10::lang::String* toString() {
        return this->value->toString();
    }
    ::x10::lang::String* typeName() {
        return this->value->typeName();
    }
    
};
::x10::lang::Iterable<x10_long>::itable< LongRange_ibox1 >  LongRange_ibox1::itable(&LongRange_ibox1::equals, &LongRange_ibox1::hashCode, &LongRange_ibox1::iterator, &LongRange_ibox1::toString, &LongRange_ibox1::typeName);
} } 
::x10::lang::Iterable<x10_long>::itable< ::x10::lang::LongRange >  x10::lang::LongRange::_itable_1(&x10::lang::LongRange::equals, &x10::lang::LongRange::hashCode, &x10::lang::LongRange::iterator, &x10::lang::LongRange::toString, &x10::lang::LongRange::typeName);
::x10aux::itable_entry x10::lang::LongRange::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &x10::lang::LongRange::_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable<x10_long> >, &x10::lang::LongRange::_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::LongRange")};
::x10aux::itable_entry x10::lang::LongRange::_iboxitables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &x10::lang::LongRange_ibox0::itable), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable<x10_long> >, &x10::lang::LongRange_ibox1::itable), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::LongRange")};

//#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"


//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
::x10::lang::LongRange x10::lang::LongRange::__implicit_convert(::x10::lang::IntRange x) {
    ::x10::lang::LongRange alloc__103106 =  ::x10::lang::LongRange::_alloc();
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
    x10_long min__103104 = ((x10_long)(x->FMGL(min)));
    x10_long max__103105 = ((x10_long)(x->FMGL(max)));
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
    alloc__103106->FMGL(min) = min__103104;
    alloc__103106->FMGL(max) = max__103105;
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
    return alloc__103106;
    
}

//#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
::x10::lang::String* x10::lang::LongRange::toString() {
    return ::x10::lang::String::__plus(::x10::lang::String::__plus((*this)->FMGL(min), (__extension__ ({ static ::x10::lang::String* strLit__125025 = ::x10aux::makeStringLit(".."); strLit__125025; }))), (*this)->FMGL(max));
    
}

//#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
x10_boolean x10::lang::LongRange::equals(::x10::lang::Any* that) {
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
    if (::x10aux::instanceof< ::x10::lang::LongRange>(that)) {
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        ::x10::lang::LongRange other = ::x10aux::class_cast< ::x10::lang::LongRange>(that);
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
        return ((::x10aux::struct_equals((*this)->FMGL(min), other->FMGL(min))) &&
        (::x10aux::struct_equals((*this)->FMGL(max), other->FMGL(max))));
        
    }
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
    return false;
    
}

//#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
x10_int x10::lang::LongRange::hashCode() {
    return ::x10aux::hash_code((((*this)->FMGL(max)) - ((*this)->FMGL(min))));
    
}

//#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
::x10::lang::Iterator<x10_long>* x10::lang::LongRange::iterator() {
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
    ::x10::lang::LongRange__LongRangeIt* alloc__103109 =  (new (::x10aux::alloc_z< ::x10::lang::LongRange__LongRangeIt>()) ::x10::lang::LongRange__LongRangeIt());
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
    x10_long min__103107 = (*this)->FMGL(min);
    x10_long max__103108 = (*this)->FMGL(max);
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
    alloc__103109->FMGL(cur) = ((x10_long)0ll);
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
    alloc__103109->FMGL(cur) = min__103107;
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
    alloc__103109->FMGL(max) = max__103108;
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
    return reinterpret_cast< ::x10::lang::Iterator<x10_long>*>(alloc__103109);
    
}

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
::x10::lang::String* x10::lang::LongRange::typeName(){
    return ::x10aux::type_name((*this));
}
x10_boolean x10::lang::LongRange::_struct_equals(::x10::lang::Any* other) {
    if (!(::x10aux::instanceof< ::x10::lang::LongRange>(other))) {
        return false;
        
    }
    return (*this)->x10::lang::LongRange::_struct_equals(::x10aux::class_cast< ::x10::lang::LongRange>(other));
    
}

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
void ::x10::lang::LongRange::_serialize(::x10::lang::LongRange this_, ::x10aux::serialization_buffer& buf) {
    buf.write(this_->FMGL(min));
    buf.write(this_->FMGL(max));
    
}

void ::x10::lang::LongRange::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(min) = buf.read<x10_long>();
    FMGL(max) = buf.read<x10_long>();
}


::x10aux::RuntimeType x10::lang::LongRange::rtt;
void x10::lang::LongRange::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::Any>(), ::x10aux::getRTT< ::x10::lang::Iterable<x10_long> >()};
    rtt.initStageTwo("x10.lang.LongRange",::x10aux::RuntimeType::struct_kind, 2, parents, 0, NULL, NULL);
    rtt.containsPtrs = false;
}

/* END of LongRange */
/*************************************************/
/*************************************************/
/* START of LongRange$LongRangeIt */
#include <x10/lang/LongRange__LongRangeIt.h>

#include <x10/lang/Iterator.h>
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/compiler/Synthetic.h>
::x10::lang::Iterator<x10_long>::itable< ::x10::lang::LongRange__LongRangeIt >  x10::lang::LongRange__LongRangeIt::_itable_0(&::x10::lang::X10Class::equals, &x10::lang::LongRange__LongRangeIt::hasNext, &::x10::lang::X10Class::hashCode, &x10::lang::LongRange__LongRangeIt::next, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::lang::LongRange__LongRangeIt >  x10::lang::LongRange__LongRangeIt::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::lang::LongRange__LongRangeIt::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterator<x10_long> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::LongRange__LongRangeIt")};

//#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"

//#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"

//#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
void x10::lang::LongRange__LongRangeIt::_constructor(x10_long min, x10_long max) {
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
    ::x10::lang::LongRange__LongRangeIt* this__103110 = this;
    ::x10aux::nullCheck(this__103110)->FMGL(cur) = ((x10_long)0ll);
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
    this->FMGL(cur) = min;
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
    this->FMGL(max) = max;
}
::x10::lang::LongRange__LongRangeIt* x10::lang::LongRange__LongRangeIt::_make(
  x10_long min, x10_long max) {
    ::x10::lang::LongRange__LongRangeIt* this_ = new (::x10aux::alloc_z< ::x10::lang::LongRange__LongRangeIt>()) ::x10::lang::LongRange__LongRangeIt();
    this_->_constructor(min, max);
    return this_;
}



//#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
x10_boolean x10::lang::LongRange__LongRangeIt::hasNext() {
    return ((this->FMGL(cur)) <= (this->FMGL(max)));
    
}

//#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
x10_long x10::lang::LongRange__LongRangeIt::next() {
    return ((this->FMGL(cur) = ((this->FMGL(cur)) + (((x10_long)1ll)))) - (((x10_long)1ll)));
    
}

//#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/LongRange.x10"
::x10::lang::LongRange__LongRangeIt* x10::lang::LongRange__LongRangeIt::x10__lang__LongRange__LongRangeIt____this__x10__lang__LongRange__LongRangeIt(
  ) {
    return this;
    
}
void x10::lang::LongRange__LongRangeIt::__fieldInitializers_x10_lang_LongRange_LongRangeIt(
  ) {
    this->FMGL(cur) = ((x10_long)0ll);
}
const ::x10aux::serialization_id_t x10::lang::LongRange__LongRangeIt::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::LongRange__LongRangeIt::_deserializer);

void x10::lang::LongRange__LongRangeIt::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(cur));
    buf.write(this->FMGL(max));
    
}

::x10::lang::Reference* ::x10::lang::LongRange__LongRangeIt::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::LongRange__LongRangeIt* this_ = new (::x10aux::alloc_z< ::x10::lang::LongRange__LongRangeIt>()) ::x10::lang::LongRange__LongRangeIt();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::LongRange__LongRangeIt::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(cur) = buf.read<x10_long>();
    FMGL(max) = buf.read<x10_long>();
}

::x10aux::RuntimeType x10::lang::LongRange__LongRangeIt::rtt;
void x10::lang::LongRange__LongRangeIt::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Iterator<x10_long> >()};
    rtt.initStageTwo("x10.lang.LongRange.LongRangeIt",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of LongRange$LongRangeIt */
/*************************************************/
