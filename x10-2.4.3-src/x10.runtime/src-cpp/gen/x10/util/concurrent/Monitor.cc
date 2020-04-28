/*************************************************/
/* START of Monitor */
#include <x10/util/concurrent/Monitor.h>

#include <x10/util/concurrent/Lock.h>
#include <x10/util/GrowableRail.h>
#include <x10/lang/Runtime__Worker.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Runtime__Pool.h>
#include <x10/lang/Thread.h>
#include <x10/lang/Int.h>
#include <x10/lang/Long.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/Pinned.h>
::x10::io::Unserializable::itable< ::x10::util::concurrent::Monitor >  x10::util::concurrent::Monitor::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::util::concurrent::Monitor >  x10::util::concurrent::Monitor::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::util::concurrent::Monitor::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Unserializable>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::util::concurrent::Monitor")};

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
void x10::util::concurrent::Monitor::_constructor() {
    (this)->::x10::util::concurrent::Lock::_constructor();
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
    ::x10::util::concurrent::Monitor* this__117414 = this;
    ::x10aux::nullCheck(this__117414)->FMGL(workers) = (__extension__ ({
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
        ::x10::util::GrowableRail< ::x10::lang::Runtime__Worker*>* alloc__117413 =
           (new (::x10aux::alloc_z< ::x10::util::GrowableRail< ::x10::lang::Runtime__Worker*> >()) ::x10::util::GrowableRail< ::x10::lang::Runtime__Worker*>());
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        (alloc__117413)->::x10::util::GrowableRail< ::x10::lang::Runtime__Worker*>::_constructor(
          ((x10_long)0ll));
        alloc__117413;
    }))
    ;
}
::x10::util::concurrent::Monitor* x10::util::concurrent::Monitor::_make(
  ) {
    ::x10::util::concurrent::Monitor* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::Monitor>()) ::x10::util::concurrent::Monitor();
    this_->_constructor();
    return this_;
}


 /* static type Worker = x10.lang.Runtime$Worker; */ 

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
/**
     * Parked workers
     */

//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
void x10::util::concurrent::Monitor::await() {
    
    //#line 1559 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
    {
        
        //#line 1560 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime::FMGL(pool__get)()->increase();
    }
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
    ::x10::lang::Runtime__Worker* worker = ::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread());
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
    this->FMGL(workers)->x10::util::GrowableRail< ::x10::lang::Runtime__Worker*>::add(
      worker);
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
    while (this->FMGL(workers)->x10::util::GrowableRail< ::x10::lang::Runtime__Worker*>::contains(
             worker)) {
        
        //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
        ::x10::util::concurrent::Lock::unlock();
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
        ::x10::lang::Runtime__Worker::park();
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
        ::x10::util::concurrent::Lock::lock();
    }
    
}

//#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
void x10::util::concurrent::Monitor::release() {
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
    x10_int size = ((x10_int) ((__extension__ ({
        ::x10::util::GrowableRail< ::x10::lang::Runtime__Worker*>* this__117405 =
          this->FMGL(workers);
        this__117405->FMGL(size);
    }))
    ));
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
    if (((((x10_long)(size))) > (((x10_long)0ll)))) {
        
        //#line 1565 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10_int n__117416 = size;
        
        //#line 1566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
        {
            
            //#line 1567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10::lang::Runtime::FMGL(pool__get)()->decrease(
              n__117416);
        }
        
        //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
        {
            x10_int i;
            for (i = ((x10_int)0); ((i) < (size)); i = ((i) + (((x10_int)1))))
            {
                ::x10::lang::Runtime__Worker* this__117415 =
                  this->FMGL(workers)->x10::util::GrowableRail< ::x10::lang::Runtime__Worker*>::removeLast();
                
                //#line 644 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
                {
                    
                    //#line 645 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ::x10aux::nullCheck(this__117415)->x10::lang::Runtime__Worker::unpark();
                }
                
            }
        }
        
    }
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
    ::x10::util::concurrent::Lock::unlock();
}

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
::x10::util::concurrent::Monitor* x10::util::concurrent::Monitor::x10__util__concurrent__Monitor____this__x10__util__concurrent__Monitor(
  ) {
    return this;
    
}
void x10::util::concurrent::Monitor::__fieldInitializers_x10_util_concurrent_Monitor(
  ) {
    this->FMGL(workers) = (__extension__ ({
        
        //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/Monitor.x10"
        ::x10::util::GrowableRail< ::x10::lang::Runtime__Worker*>* alloc__104341 =
           (new (::x10aux::alloc_z< ::x10::util::GrowableRail< ::x10::lang::Runtime__Worker*> >()) ::x10::util::GrowableRail< ::x10::lang::Runtime__Worker*>());
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        (alloc__104341)->::x10::util::GrowableRail< ::x10::lang::Runtime__Worker*>::_constructor(
          ((x10_long)0ll));
        alloc__104341;
    }))
    ;
}
::x10aux::RuntimeType x10::util::concurrent::Monitor::rtt;
void x10::util::concurrent::Monitor::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::util::concurrent::Lock>()};
    rtt.initStageTwo("x10.util.concurrent.Monitor",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of Monitor */
/*************************************************/
