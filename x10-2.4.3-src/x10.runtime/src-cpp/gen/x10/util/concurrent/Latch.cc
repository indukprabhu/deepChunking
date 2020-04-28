/*************************************************/
/* START of Latch */
#include <x10/util/concurrent/Latch.h>

#include <x10/util/concurrent/Monitor.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Any.h>
#include <x10/lang/UnsupportedOperationException.h>
#include <x10/lang/String.h>
#include <x10/util/concurrent/Lock.h>
#include <x10/lang/Runtime.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/Pinned.h>
::x10::io::Unserializable::itable< ::x10::util::concurrent::Latch >  x10::util::concurrent::Latch::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::util::concurrent::Latch >  x10::util::concurrent::Latch::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Fun_0_0<x10_boolean>::itable< ::x10::util::concurrent::Latch >  x10::util::concurrent::Latch::_itable_2(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::util::concurrent::Latch::__apply, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::util::concurrent::Latch::_itables[4] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Unserializable>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_boolean> >, &_itable_2), ::x10aux::itable_entry(NULL, (void*)"::x10::util::concurrent::Latch")};

//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
void x10::util::concurrent::Latch::_constructor() {
    (this)->::x10::util::concurrent::Monitor::_constructor();
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
    ::x10::util::concurrent::Latch* this__117396 = this;
    ::x10aux::nullCheck(this__117396)->FMGL(state) = false;
}
::x10::util::concurrent::Latch* x10::util::concurrent::Latch::_make() {
    ::x10::util::concurrent::Latch* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::Latch>()) ::x10::util::concurrent::Latch();
    this_->_constructor();
    return this_;
}



//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
void x10::util::concurrent::Latch::_constructor(::x10::lang::Any* id__170) {
    (this)->::x10::util::concurrent::Monitor::_constructor();
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
    ::x10::util::concurrent::Latch* this__117397 = this;
    ::x10aux::nullCheck(this__117397)->FMGL(state) = false;
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__128660 = ::x10aux::makeStringLit("Cannot deserialize "); strLit__128660; })), ::x10aux::type_name(this)))));
}
::x10::util::concurrent::Latch* x10::util::concurrent::Latch::_make(::x10::lang::Any* id__170)
{
    ::x10::util::concurrent::Latch* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::Latch>()) ::x10::util::concurrent::Latch();
    this_->_constructor(id__170);
    return this_;
}



//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"

//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
void x10::util::concurrent::Latch::release() {
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
    this->lock();
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
    this->FMGL(state) = true;
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
    ::x10::util::concurrent::Monitor::release();
}

//#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
void x10::util::concurrent::Latch::await() {
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
    ::x10::lang::Runtime::ensureNotInAtomic();
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
    if (!(this->FMGL(state))) {
        
        //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
        this->lock();
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
        while (!(this->FMGL(state))) {
            ::x10::util::concurrent::Monitor::await();
        }
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
        this->unlock();
    }
    
}

//#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
x10_boolean x10::util::concurrent::Latch::__apply() {
    return this->FMGL(state);
    
}

//#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Latch.x10"
::x10::util::concurrent::Latch* x10::util::concurrent::Latch::x10__util__concurrent__Latch____this__x10__util__concurrent__Latch(
  ) {
    return this;
    
}
void x10::util::concurrent::Latch::__fieldInitializers_x10_util_concurrent_Latch(
  ) {
    this->FMGL(state) = false;
}
::x10aux::RuntimeType x10::util::concurrent::Latch::rtt;
void x10::util::concurrent::Latch::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::util::concurrent::Monitor>(), ::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_boolean> >()};
    rtt.initStageTwo("x10.util.concurrent.Latch",::x10aux::RuntimeType::class_kind, 2, parents, 0, NULL, NULL);
}

/* END of Latch */
/*************************************************/
