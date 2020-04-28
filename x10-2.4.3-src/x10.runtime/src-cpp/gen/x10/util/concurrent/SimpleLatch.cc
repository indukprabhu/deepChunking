/*************************************************/
/* START of SimpleLatch */
#include <x10/util/concurrent/SimpleLatch.h>

#include <x10/util/concurrent/Lock.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Runtime__Worker.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Runtime__Pool.h>
#include <x10/lang/Thread.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/Pinned.h>
::x10::io::Unserializable::itable< ::x10::util::concurrent::SimpleLatch >  x10::util::concurrent::SimpleLatch::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::util::concurrent::SimpleLatch >  x10::util::concurrent::SimpleLatch::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::util::concurrent::SimpleLatch::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Unserializable>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::util::concurrent::SimpleLatch")};

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
void x10::util::concurrent::SimpleLatch::_constructor() {
    (this)->::x10::util::concurrent::Lock::_constructor();
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
    ::x10::util::concurrent::SimpleLatch* this__117441 = this;
    ::x10aux::nullCheck(this__117441)->FMGL(worker) = (::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Worker*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    ::x10aux::nullCheck(this__117441)->FMGL(state) = false;
}
::x10::util::concurrent::SimpleLatch* x10::util::concurrent::SimpleLatch::_make(
  ) {
    ::x10::util::concurrent::SimpleLatch* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::SimpleLatch>()) ::x10::util::concurrent::SimpleLatch();
    this_->_constructor();
    return this_;
}


 /* static type Worker = x10.lang.Runtime$Worker; */ 

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"

//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
void x10::util::concurrent::SimpleLatch::await() {
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
    if (this->FMGL(state)) {
        return;
    }
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
    this->lock();
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
    if (this->FMGL(state)) {
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        this->unlock();
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        return;
    }
    
    //#line 1559 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)())) {
        
        //#line 1560 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime::FMGL(pool__get)()->increase();
    }
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
    this->FMGL(worker) = (::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread()));
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
    while (!(this->FMGL(state))) {
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        this->unlock();
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        ::x10::lang::Runtime__Worker::park();
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        this->lock();
    }
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
    this->unlock();
}

//#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
void x10::util::concurrent::SimpleLatch::release() {
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
    if (this->FMGL(state)) {
        return;
    }
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
    this->lock();
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
    if (this->FMGL(state)) {
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        this->unlock();
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        return;
    }
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
    this->FMGL(state) = true;
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
    if ((!::x10aux::struct_equals(this->FMGL(worker), reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        
        //#line 1566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
        {
            
            //#line 1567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10::lang::Runtime::FMGL(pool__get)()->decrease(((x10_int)1));
        }
        
        //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
        ::x10::lang::Runtime__Worker* this__117442 = this->FMGL(worker);
        
        //#line 644 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
        {
            
            //#line 645 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10aux::nullCheck(this__117442)->x10::lang::Runtime__Worker::unpark();
        }
        
    }
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
    this->unlock();
}

//#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
x10_boolean x10::util::concurrent::SimpleLatch::__apply() {
    return this->FMGL(state);
    
}

//#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleLatch.x10"
::x10::util::concurrent::SimpleLatch* x10::util::concurrent::SimpleLatch::x10__util__concurrent__SimpleLatch____this__x10__util__concurrent__SimpleLatch(
  ) {
    return this;
    
}
void x10::util::concurrent::SimpleLatch::__fieldInitializers_x10_util_concurrent_SimpleLatch(
  ) {
    this->FMGL(worker) = (::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Worker*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(state) = false;
}
::x10aux::RuntimeType x10::util::concurrent::SimpleLatch::rtt;
void x10::util::concurrent::SimpleLatch::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::util::concurrent::Lock>()};
    rtt.initStageTwo("x10.util.concurrent.SimpleLatch",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of SimpleLatch */
/*************************************************/
