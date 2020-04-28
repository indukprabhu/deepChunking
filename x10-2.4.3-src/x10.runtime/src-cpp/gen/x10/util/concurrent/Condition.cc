/*************************************************/
/* START of Condition */
#include <x10/util/concurrent/Condition.h>

#include <x10/io/Unserializable.h>
#include <x10/lang/Condition.h>
#include <x10/compiler/Embed.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeClass.h>
::x10::io::Unserializable::itable< ::x10::util::concurrent::Condition >  x10::util::concurrent::Condition::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::util::concurrent::Condition >  x10::util::concurrent::Condition::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::util::concurrent::Condition::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Unserializable>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::util::concurrent::Condition")};

//#line 13 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Condition.x10"
void x10::util::concurrent::Condition::_constructor(::x10::lang::Condition* id0) {
    this->FMGL(__NATIVE_FIELD__) = id0;
}
::x10::util::concurrent::Condition* x10::util::concurrent::Condition::_make(
  ::x10::lang::Condition* id0) {
    ::x10::util::concurrent::Condition* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::Condition>()) ::x10::util::concurrent::Condition();
    this_->_constructor(id0);
    return this_;
}



//#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Condition.x10"
void x10::util::concurrent::Condition::_constructor() {
    
    //#line 13 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Condition.x10"
    this->FMGL(__NATIVE_FIELD__) = &_Embed___NATIVE_FIELD__;
    _Embed___NATIVE_FIELD__._constructor();
}
::x10::util::concurrent::Condition* x10::util::concurrent::Condition::_make(
  ) {
    ::x10::util::concurrent::Condition* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::Condition>()) ::x10::util::concurrent::Condition();
    this_->_constructor();
    return this_;
}



//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Condition.x10"
void x10::util::concurrent::Condition::release() {
    
    //#line 13 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Condition.x10"
    ::x10aux::nullCheck(this->FMGL(__NATIVE_FIELD__))->release();
}

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Condition.x10"
void x10::util::concurrent::Condition::await() {
    
    //#line 13 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Condition.x10"
    ::x10aux::nullCheck(this->FMGL(__NATIVE_FIELD__))->await();
}

//#line 11 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Condition.x10"
::x10::util::concurrent::Condition* x10::util::concurrent::Condition::x10__util__concurrent__Condition____this__x10__util__concurrent__Condition(
  ) {
    return this;
    
}
void x10::util::concurrent::Condition::__fieldInitializers_x10_util_concurrent_Condition(
  ) {
 
}
::x10aux::RuntimeType x10::util::concurrent::Condition::rtt;
void x10::util::concurrent::Condition::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::io::Unserializable>()};
    rtt.initStageTwo("x10.util.concurrent.Condition",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of Condition */
/*************************************************/
