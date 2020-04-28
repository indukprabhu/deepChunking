/*************************************************/
/* START of Lock */
#include <x10/util/concurrent/Lock.h>

#include <x10/io/Unserializable.h>
#include <x10/lang/Lock__ReentrantLock.h>
#include <x10/compiler/Embed.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Int.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeClass.h>
#include <x10/compiler/Pinned.h>
::x10::io::Unserializable::itable< ::x10::util::concurrent::Lock >  x10::util::concurrent::Lock::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::util::concurrent::Lock >  x10::util::concurrent::Lock::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::util::concurrent::Lock::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Unserializable>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::util::concurrent::Lock")};

//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
void x10::util::concurrent::Lock::_constructor(::x10::lang::Lock__ReentrantLock* id0) {
    this->FMGL(__NATIVE_FIELD__) = id0;
}
::x10::util::concurrent::Lock* x10::util::concurrent::Lock::_make(::x10::lang::Lock__ReentrantLock* id0)
{
    ::x10::util::concurrent::Lock* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::Lock>()) ::x10::util::concurrent::Lock();
    this_->_constructor(id0);
    return this_;
}



//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
void x10::util::concurrent::Lock::_constructor() {
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
    this->FMGL(__NATIVE_FIELD__) = &_Embed___NATIVE_FIELD__;
    _Embed___NATIVE_FIELD__._constructor();
}
::x10::util::concurrent::Lock* x10::util::concurrent::Lock::_make(
  ) {
    ::x10::util::concurrent::Lock* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::Lock>()) ::x10::util::concurrent::Lock();
    this_->_constructor();
    return this_;
}



//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
void x10::util::concurrent::Lock::lock() {
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
    ::x10aux::nullCheck(this->FMGL(__NATIVE_FIELD__))->lock();
}

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
x10_boolean x10::util::concurrent::Lock::tryLock() {
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
    return ::x10aux::nullCheck(this->FMGL(__NATIVE_FIELD__))->tryLock();
    
}

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
void x10::util::concurrent::Lock::unlock() {
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
    ::x10aux::nullCheck(this->FMGL(__NATIVE_FIELD__))->unlock();
}

//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
x10_int x10::util::concurrent::Lock::getHoldCount() {
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
    return ::x10aux::nullCheck(this->FMGL(__NATIVE_FIELD__))->getHoldCount();
    
}

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Lock.x10"
::x10::util::concurrent::Lock* x10::util::concurrent::Lock::x10__util__concurrent__Lock____this__x10__util__concurrent__Lock(
  ) {
    return this;
    
}
void x10::util::concurrent::Lock::__fieldInitializers_x10_util_concurrent_Lock(
  ) {
 
}
::x10aux::RuntimeType x10::util::concurrent::Lock::rtt;
void x10::util::concurrent::Lock::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::io::Unserializable>()};
    rtt.initStageTwo("x10.util.concurrent.Lock",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of Lock */
/*************************************************/
