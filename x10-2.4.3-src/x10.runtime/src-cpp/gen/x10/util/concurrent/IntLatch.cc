/*************************************************/
/* START of IntLatch */
#include <x10/util/concurrent/IntLatch.h>

#include <x10/util/concurrent/Monitor.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/lang/Int.h>
#include <x10/lang/Any.h>
#include <x10/lang/UnsupportedOperationException.h>
#include <x10/lang/String.h>
#include <x10/util/concurrent/Lock.h>
#include <x10/lang/Runtime.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/Pinned.h>
::x10::io::Unserializable::itable< ::x10::util::concurrent::IntLatch >  x10::util::concurrent::IntLatch::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::util::concurrent::IntLatch >  x10::util::concurrent::IntLatch::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Fun_0_0<x10_int>::itable< ::x10::util::concurrent::IntLatch >  x10::util::concurrent::IntLatch::_itable_2(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::util::concurrent::IntLatch::__apply, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::util::concurrent::IntLatch::_itables[4] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Unserializable>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_int> >, &_itable_2), ::x10aux::itable_entry(NULL, (void*)"::x10::util::concurrent::IntLatch")};

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
void x10::util::concurrent::IntLatch::_constructor() {
    (this)->::x10::util::concurrent::Monitor::_constructor();
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
    ::x10::util::concurrent::IntLatch* this__117388 = this;
    ::x10aux::nullCheck(this__117388)->FMGL(value) = ((x10_int)0);
}
::x10::util::concurrent::IntLatch* x10::util::concurrent::IntLatch::_make(
  ) {
    ::x10::util::concurrent::IntLatch* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::IntLatch>()) ::x10::util::concurrent::IntLatch();
    this_->_constructor();
    return this_;
}



//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
void x10::util::concurrent::IntLatch::_constructor(::x10::lang::Any* id__169) {
    (this)->::x10::util::concurrent::Monitor::_constructor();
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
    ::x10::util::concurrent::IntLatch* this__117389 = this;
    ::x10aux::nullCheck(this__117389)->FMGL(value) = ((x10_int)0);
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__128656 = ::x10aux::makeStringLit("Cannot deserialize "); strLit__128656; })), ::x10aux::type_name(this)))));
}
::x10::util::concurrent::IntLatch* x10::util::concurrent::IntLatch::_make(
  ::x10::lang::Any* id__169) {
    ::x10::util::concurrent::IntLatch* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::IntLatch>()) ::x10::util::concurrent::IntLatch();
    this_->_constructor(id__169);
    return this_;
}



//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
void x10::util::concurrent::IntLatch::__set(x10_int i) {
    this->set(i);
}

//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
void x10::util::concurrent::IntLatch::set(x10_int i) {
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
    this->lock();
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
    this->FMGL(value) = i;
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
    ::x10::util::concurrent::Monitor::release();
}

//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
void x10::util::concurrent::IntLatch::await() {
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
    ::x10::lang::Runtime::ensureNotInAtomic();
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
    if ((::x10aux::struct_equals(this->FMGL(value), ((x10_int)0)))) {
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
        this->lock();
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
        while ((::x10aux::struct_equals(this->FMGL(value), ((x10_int)0))))
        {
            ::x10::util::concurrent::Monitor::await();
        }
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
        this->unlock();
    }
    
}

//#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
x10_int x10::util::concurrent::IntLatch::__apply() {
    return this->FMGL(value);
    
}

//#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/IntLatch.x10"
::x10::util::concurrent::IntLatch* x10::util::concurrent::IntLatch::x10__util__concurrent__IntLatch____this__x10__util__concurrent__IntLatch(
  ) {
    return this;
    
}
void x10::util::concurrent::IntLatch::__fieldInitializers_x10_util_concurrent_IntLatch(
  ) {
    this->FMGL(value) = ((x10_int)0);
}
::x10aux::RuntimeType x10::util::concurrent::IntLatch::rtt;
void x10::util::concurrent::IntLatch::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::util::concurrent::Monitor>(), ::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_int> >()};
    rtt.initStageTwo("x10.util.concurrent.IntLatch",::x10aux::RuntimeType::class_kind, 2, parents, 0, NULL, NULL);
}

/* END of IntLatch */
/*************************************************/
