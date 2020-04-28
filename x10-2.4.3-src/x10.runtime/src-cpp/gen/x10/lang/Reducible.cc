/*************************************************/
/* START of Reducible */
#include <x10/lang/Reducible.h>

::x10aux::RuntimeType x10::lang::Reducible<void>::rtt;

/* END of Reducible */
/*************************************************/
/*************************************************/
/* START of Reducible$AndReducer */
#include <x10/lang/Reducible__AndReducer.h>

#include <x10/lang/Any.h>
#include <x10/lang/Reducible.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/String.h>
#include <x10/compiler/Native.h>
#include <x10/compiler/NonEscaping.h>
#include <x10/compiler/Synthetic.h>
#include <x10/lang/Int.h>
namespace x10 { namespace lang { 
class Reducible__AndReducer_ibox0 : public ::x10::lang::IBox< ::x10::lang::Reducible__AndReducer> {
public:
    static ::x10::lang::Any::itable< Reducible__AndReducer_ibox0 > itable;
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
::x10::lang::Any::itable< Reducible__AndReducer_ibox0 >  Reducible__AndReducer_ibox0::itable(&Reducible__AndReducer_ibox0::equals, &Reducible__AndReducer_ibox0::hashCode, &Reducible__AndReducer_ibox0::toString, &Reducible__AndReducer_ibox0::typeName);
} } 
::x10::lang::Any::itable< ::x10::lang::Reducible__AndReducer >  x10::lang::Reducible__AndReducer::_itable_0(&x10::lang::Reducible__AndReducer::equals, &x10::lang::Reducible__AndReducer::hashCode, &x10::lang::Reducible__AndReducer::toString, &x10::lang::Reducible__AndReducer::typeName);
namespace x10 { namespace lang { 
class Reducible__AndReducer_ibox1 : public ::x10::lang::IBox< ::x10::lang::Reducible__AndReducer> {
public:
    static ::x10::lang::Reducible<x10_boolean>::itable< Reducible__AndReducer_ibox1 > itable;
    x10_boolean equals(::x10::lang::Any* arg0) {
        return this->value->equals(arg0);
    }
    x10_int hashCode() {
        return this->value->hashCode();
    }
    x10_boolean __apply(x10_boolean arg0, x10_boolean arg1) {
        return this->value->__apply(arg0, arg1);
    }
    ::x10::lang::String* toString() {
        return this->value->toString();
    }
    ::x10::lang::String* typeName() {
        return this->value->typeName();
    }
    x10_boolean zero() {
        return this->value->zero();
    }
    
};
::x10::lang::Reducible<x10_boolean>::itable< Reducible__AndReducer_ibox1 >  Reducible__AndReducer_ibox1::itable(&Reducible__AndReducer_ibox1::equals, &Reducible__AndReducer_ibox1::hashCode, &Reducible__AndReducer_ibox1::__apply, &Reducible__AndReducer_ibox1::toString, &Reducible__AndReducer_ibox1::typeName, &Reducible__AndReducer_ibox1::zero);
} } 
::x10::lang::Reducible<x10_boolean>::itable< ::x10::lang::Reducible__AndReducer >  x10::lang::Reducible__AndReducer::_itable_1(&x10::lang::Reducible__AndReducer::equals, &x10::lang::Reducible__AndReducer::hashCode, &x10::lang::Reducible__AndReducer::__apply, &x10::lang::Reducible__AndReducer::toString, &x10::lang::Reducible__AndReducer::typeName, &x10::lang::Reducible__AndReducer::zero);
::x10aux::itable_entry x10::lang::Reducible__AndReducer::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &x10::lang::Reducible__AndReducer::_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Reducible<x10_boolean> >, &x10::lang::Reducible__AndReducer::_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::Reducible__AndReducer")};
::x10aux::itable_entry x10::lang::Reducible__AndReducer::_iboxitables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &x10::lang::Reducible__AndReducer_ibox0::itable), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Reducible<x10_boolean> >, &x10::lang::Reducible__AndReducer_ibox1::itable), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::Reducible__AndReducer")};

//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"

//#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"

//#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
::x10::lang::String* x10::lang::Reducible__AndReducer::typeName(){
    return ::x10aux::type_name((*this));
}
::x10::lang::String* x10::lang::Reducible__AndReducer::toString() {
    return (__extension__ ({ static ::x10::lang::String* strLit__125359 = ::x10aux::makeStringLit("struct x10.lang.Reducible.AndReducer"); strLit__125359; }));
    
}
x10_boolean x10::lang::Reducible__AndReducer::equals(::x10::lang::Any* other) {
    if (!(::x10aux::instanceof< ::x10::lang::Reducible__AndReducer>(other)))
    {
        return false;
        
    }
    ::x10::lang::Reducible__AndReducer this__103426 = (*this);
    ::x10::lang::Reducible__AndReducer other__103427 = ::x10aux::class_cast< ::x10::lang::Reducible__AndReducer>(other);
    return true;
    
}
x10_boolean x10::lang::Reducible__AndReducer::_struct_equals(::x10::lang::Any* other) {
    if (!(::x10aux::instanceof< ::x10::lang::Reducible__AndReducer>(other)))
    {
        return false;
        
    }
    ::x10::lang::Reducible__AndReducer this__103428 = (*this);
    ::x10::lang::Reducible__AndReducer other__103429 = ::x10aux::class_cast< ::x10::lang::Reducible__AndReducer>(other);
    return true;
    
}

void ::x10::lang::Reducible__AndReducer::_serialize(::x10::lang::Reducible__AndReducer this_, ::x10aux::serialization_buffer& buf) {
    
}

void ::x10::lang::Reducible__AndReducer::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}


::x10aux::RuntimeType x10::lang::Reducible__AndReducer::rtt;
void x10::lang::Reducible__AndReducer::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::Any>(), ::x10aux::getRTT< ::x10::lang::Reducible<x10_boolean> >()};
    rtt.initStageTwo("x10.lang.Reducible.AndReducer",::x10aux::RuntimeType::struct_kind, 2, parents, 0, NULL, NULL);
    rtt.containsPtrs = false;
}

/* END of Reducible$AndReducer */
/*************************************************/
/*************************************************/
/* START of Reducible$OrReducer */
#include <x10/lang/Reducible__OrReducer.h>

#include <x10/lang/Any.h>
#include <x10/lang/Reducible.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/String.h>
#include <x10/compiler/Native.h>
#include <x10/compiler/NonEscaping.h>
#include <x10/compiler/Synthetic.h>
#include <x10/lang/Int.h>
namespace x10 { namespace lang { 
class Reducible__OrReducer_ibox0 : public ::x10::lang::IBox< ::x10::lang::Reducible__OrReducer> {
public:
    static ::x10::lang::Any::itable< Reducible__OrReducer_ibox0 > itable;
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
::x10::lang::Any::itable< Reducible__OrReducer_ibox0 >  Reducible__OrReducer_ibox0::itable(&Reducible__OrReducer_ibox0::equals, &Reducible__OrReducer_ibox0::hashCode, &Reducible__OrReducer_ibox0::toString, &Reducible__OrReducer_ibox0::typeName);
} } 
::x10::lang::Any::itable< ::x10::lang::Reducible__OrReducer >  x10::lang::Reducible__OrReducer::_itable_0(&x10::lang::Reducible__OrReducer::equals, &x10::lang::Reducible__OrReducer::hashCode, &x10::lang::Reducible__OrReducer::toString, &x10::lang::Reducible__OrReducer::typeName);
namespace x10 { namespace lang { 
class Reducible__OrReducer_ibox1 : public ::x10::lang::IBox< ::x10::lang::Reducible__OrReducer> {
public:
    static ::x10::lang::Reducible<x10_boolean>::itable< Reducible__OrReducer_ibox1 > itable;
    x10_boolean equals(::x10::lang::Any* arg0) {
        return this->value->equals(arg0);
    }
    x10_int hashCode() {
        return this->value->hashCode();
    }
    x10_boolean __apply(x10_boolean arg0, x10_boolean arg1) {
        return this->value->__apply(arg0, arg1);
    }
    ::x10::lang::String* toString() {
        return this->value->toString();
    }
    ::x10::lang::String* typeName() {
        return this->value->typeName();
    }
    x10_boolean zero() {
        return this->value->zero();
    }
    
};
::x10::lang::Reducible<x10_boolean>::itable< Reducible__OrReducer_ibox1 >  Reducible__OrReducer_ibox1::itable(&Reducible__OrReducer_ibox1::equals, &Reducible__OrReducer_ibox1::hashCode, &Reducible__OrReducer_ibox1::__apply, &Reducible__OrReducer_ibox1::toString, &Reducible__OrReducer_ibox1::typeName, &Reducible__OrReducer_ibox1::zero);
} } 
::x10::lang::Reducible<x10_boolean>::itable< ::x10::lang::Reducible__OrReducer >  x10::lang::Reducible__OrReducer::_itable_1(&x10::lang::Reducible__OrReducer::equals, &x10::lang::Reducible__OrReducer::hashCode, &x10::lang::Reducible__OrReducer::__apply, &x10::lang::Reducible__OrReducer::toString, &x10::lang::Reducible__OrReducer::typeName, &x10::lang::Reducible__OrReducer::zero);
::x10aux::itable_entry x10::lang::Reducible__OrReducer::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &x10::lang::Reducible__OrReducer::_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Reducible<x10_boolean> >, &x10::lang::Reducible__OrReducer::_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::Reducible__OrReducer")};
::x10aux::itable_entry x10::lang::Reducible__OrReducer::_iboxitables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &x10::lang::Reducible__OrReducer_ibox0::itable), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Reducible<x10_boolean> >, &x10::lang::Reducible__OrReducer_ibox1::itable), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::Reducible__OrReducer")};

//#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"

//#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"

//#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Reducible.x10"
::x10::lang::String* x10::lang::Reducible__OrReducer::typeName(){
    return ::x10aux::type_name((*this));
}
::x10::lang::String* x10::lang::Reducible__OrReducer::toString() {
    return (__extension__ ({ static ::x10::lang::String* strLit__125402 = ::x10aux::makeStringLit("struct x10.lang.Reducible.OrReducer"); strLit__125402; }));
    
}
x10_boolean x10::lang::Reducible__OrReducer::equals(::x10::lang::Any* other) {
    if (!(::x10aux::instanceof< ::x10::lang::Reducible__OrReducer>(other)))
    {
        return false;
        
    }
    ::x10::lang::Reducible__OrReducer this__103431 = (*this);
    ::x10::lang::Reducible__OrReducer other__103432 = ::x10aux::class_cast< ::x10::lang::Reducible__OrReducer>(other);
    return true;
    
}
x10_boolean x10::lang::Reducible__OrReducer::_struct_equals(::x10::lang::Any* other) {
    if (!(::x10aux::instanceof< ::x10::lang::Reducible__OrReducer>(other)))
    {
        return false;
        
    }
    ::x10::lang::Reducible__OrReducer this__103433 = (*this);
    ::x10::lang::Reducible__OrReducer other__103434 = ::x10aux::class_cast< ::x10::lang::Reducible__OrReducer>(other);
    return true;
    
}

void ::x10::lang::Reducible__OrReducer::_serialize(::x10::lang::Reducible__OrReducer this_, ::x10aux::serialization_buffer& buf) {
    
}

void ::x10::lang::Reducible__OrReducer::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}


::x10aux::RuntimeType x10::lang::Reducible__OrReducer::rtt;
void x10::lang::Reducible__OrReducer::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::Any>(), ::x10aux::getRTT< ::x10::lang::Reducible<x10_boolean> >()};
    rtt.initStageTwo("x10.lang.Reducible.OrReducer",::x10aux::RuntimeType::struct_kind, 2, parents, 0, NULL, NULL);
    rtt.containsPtrs = false;
}

/* END of Reducible$OrReducer */
/*************************************************/
/*************************************************/
/* START of Reducible$SumReducer */
#include <x10/lang/Reducible__SumReducer.h>

::x10aux::RuntimeType x10::lang::Reducible__SumReducer<void>::rtt;

/* END of Reducible$SumReducer */
/*************************************************/
/*************************************************/
/* START of Reducible$MinReducer */
#include <x10/lang/Reducible__MinReducer.h>

::x10aux::RuntimeType x10::lang::Reducible__MinReducer<void>::rtt;

/* END of Reducible$MinReducer */
/*************************************************/
/*************************************************/
/* START of Reducible$MaxReducer */
#include <x10/lang/Reducible__MaxReducer.h>

::x10aux::RuntimeType x10::lang::Reducible__MaxReducer<void>::rtt;

/* END of Reducible$MaxReducer */
/*************************************************/
