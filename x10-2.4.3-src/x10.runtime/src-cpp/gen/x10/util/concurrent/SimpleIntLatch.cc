/*************************************************/
/* START of SimpleIntLatch */
#include <x10/util/concurrent/SimpleIntLatch.h>

#include <x10/util/concurrent/Lock.h>
#include <x10/lang/Int.h>
#include <x10/lang/Runtime__Worker.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Runtime__Pool.h>
#include <x10/lang/Thread.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/Pinned.h>
::x10::io::Unserializable::itable< ::x10::util::concurrent::SimpleIntLatch >  x10::util::concurrent::SimpleIntLatch::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::util::concurrent::SimpleIntLatch >  x10::util::concurrent::SimpleIntLatch::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::util::concurrent::SimpleIntLatch::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Unserializable>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::util::concurrent::SimpleIntLatch")};

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
void x10::util::concurrent::SimpleIntLatch::_constructor() {
    (this)->::x10::util::concurrent::Lock::_constructor();
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
    ::x10::util::concurrent::SimpleIntLatch* this__117428 = this;
    ::x10aux::nullCheck(this__117428)->FMGL(worker) = (::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Worker*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    ::x10aux::nullCheck(this__117428)->FMGL(value) = ((x10_int)0);
}
::x10::util::concurrent::SimpleIntLatch* x10::util::concurrent::SimpleIntLatch::_make(
  ) {
    ::x10::util::concurrent::SimpleIntLatch* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::SimpleIntLatch>()) ::x10::util::concurrent::SimpleIntLatch();
    this_->_constructor();
    return this_;
}


 /* static type Worker = x10.lang.Runtime$Worker; */ 

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"

//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
void x10::util::concurrent::SimpleIntLatch::await() {
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
    if ((!::x10aux::struct_equals(this->FMGL(value), ((x10_int)0))))
    {
        return;
    }
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
    this->lock();
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
    if ((!::x10aux::struct_equals(this->FMGL(value), ((x10_int)0))))
    {
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        this->unlock();
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        return;
    }
    
    //#line 1559 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)())) {
        
        //#line 1560 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime::FMGL(pool__get)()->increase();
    }
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
    this->FMGL(worker) = (::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread()));
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
    while ((::x10aux::struct_equals(this->FMGL(value), ((x10_int)0))))
    {
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        this->unlock();
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        ::x10::lang::Runtime__Worker::park();
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        this->lock();
    }
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
    this->unlock();
}

//#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
void x10::util::concurrent::SimpleIntLatch::__set(x10_int v) {
    this->set(v);
}

//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
void x10::util::concurrent::SimpleIntLatch::set(x10_int v) {
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
    this->lock();
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
    if ((!::x10aux::struct_equals(this->FMGL(value), ((x10_int)0))))
    {
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        this->unlock();
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        return;
    }
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
    this->FMGL(value) = v;
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
    if ((!::x10aux::struct_equals(this->FMGL(worker), reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        
        //#line 1566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
        {
            
            //#line 1567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10::lang::Runtime::FMGL(pool__get)()->decrease(
              ((x10_int)1));
        }
        
        //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
        ::x10::lang::Runtime__Worker* this__117429 = this->FMGL(worker);
        
        //#line 644 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
        {
            
            //#line 645 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10aux::nullCheck(this__117429)->x10::lang::Runtime__Worker::unpark();
        }
        
    }
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
    this->unlock();
}

//#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
x10_int x10::util::concurrent::SimpleIntLatch::__apply() {
    return this->FMGL(value);
    
}

//#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SimpleIntLatch.x10"
::x10::util::concurrent::SimpleIntLatch* x10::util::concurrent::SimpleIntLatch::x10__util__concurrent__SimpleIntLatch____this__x10__util__concurrent__SimpleIntLatch(
  ) {
    return this;
    
}
void x10::util::concurrent::SimpleIntLatch::__fieldInitializers_x10_util_concurrent_SimpleIntLatch(
  ) {
    this->FMGL(worker) = (::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Worker*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(value) = ((x10_int)0);
}
::x10aux::RuntimeType x10::util::concurrent::SimpleIntLatch::rtt;
void x10::util::concurrent::SimpleIntLatch::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::util::concurrent::Lock>()};
    rtt.initStageTwo("x10.util.concurrent.SimpleIntLatch",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of SimpleIntLatch */
/*************************************************/
