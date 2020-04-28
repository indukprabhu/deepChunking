/*************************************************/
/* START of SPMDBarrier */
#include <x10/util/concurrent/SPMDBarrier.h>

#include <x10/lang/Int.h>
#include <x10/util/concurrent/AtomicInteger.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Runtime__Worker.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Long.h>
#include <x10/lang/Thread.h>
#include <x10/compiler/Synthetic.h>

//#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"

//#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"

//#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"

//#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"

//#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
void x10::util::concurrent::SPMDBarrier::_constructor(x10_int count) {
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
    FMGL(count) = count;
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
    this->x10::util::concurrent::SPMDBarrier::__fieldInitializers_x10_util_concurrent_SPMDBarrier();
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
    #ifndef NO_ASSERTIONS
    if (::x10aux::x10__assertions_enabled)
        ::x10aux::x10__assert(((::x10::lang::Runtime::FMGL(NTHREADS__get)()) >= (count)),
            (__extension__ ({ static ::x10::lang::String* strLit__128669 = ::x10aux::makeStringLit("SPMDBarrier constructor invoked with task count greater than Runtime.NTHREADS"); strLit__128669; })));
    #endif//NO_ASSERTIONS
    
}
::x10::util::concurrent::SPMDBarrier* x10::util::concurrent::SPMDBarrier::_make(
  x10_int count) {
    ::x10::util::concurrent::SPMDBarrier* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::SPMDBarrier>()) ::x10::util::concurrent::SPMDBarrier();
    this_->_constructor(count);
    return this_;
}



//#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
void x10::util::concurrent::SPMDBarrier::_kwd__register() {
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
    x10_int i = this->FMGL(index)->x10::util::concurrent::AtomicInteger::getAndIncrement();
    
    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
    #ifndef NO_ASSERTIONS
    if (::x10aux::x10__assertions_enabled)
        ::x10aux::x10__assert(((i) < (this->FMGL(count))), (__extension__ ({ static ::x10::lang::String* strLit__128670 = ::x10aux::makeStringLit("SPMDBarrier register invoked too many times"); strLit__128670; })));
    #endif//NO_ASSERTIONS
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
    this->FMGL(workers)->x10::lang::Rail< ::x10::lang::Runtime__Worker* >::__set(
      ((x10_long)(i)), ::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread()));
}

//#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
void x10::util::concurrent::SPMDBarrier::advance() {
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
    if ((::x10aux::struct_equals(this->FMGL(alive)->x10::util::concurrent::AtomicInteger::decrementAndGet(),
                                 ((x10_int)0)))) {
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
        this->FMGL(alive)->x10::util::concurrent::AtomicInteger::set(
          this->FMGL(count));
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
        ::x10::lang::Runtime__Worker* me = ::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread());
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
        {
            x10_int i;
            for (i = ((x10_int)0); ((i) < (this->FMGL(count)));
                 i = ((i) + (((x10_int)1)))) {
                
                //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
                if ((!::x10aux::struct_equals(this->FMGL(workers)->x10::lang::Rail< ::x10::lang::Runtime__Worker* >::__apply(
                                                ((x10_long)(i))),
                                              me))) {
                    ::x10::lang::Runtime__Worker* this__117474 =
                      this->FMGL(workers)->x10::lang::Rail< ::x10::lang::Runtime__Worker* >::__apply(
                        ((x10_long)(i)));
                    
                    //#line 644 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
                    {
                        
                        //#line 645 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        ::x10aux::nullCheck(this__117474)->x10::lang::Runtime__Worker::unpark();
                    }
                    
                }
                
            }
        }
        
    } else {
        
        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
        ::x10::lang::Runtime__Worker::park();
    }
    
}

//#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/SPMDBarrier.x10"
::x10::util::concurrent::SPMDBarrier* x10::util::concurrent::SPMDBarrier::x10__util__concurrent__SPMDBarrier____this__x10__util__concurrent__SPMDBarrier(
  ) {
    return this;
    
}
void x10::util::concurrent::SPMDBarrier::__fieldInitializers_x10_util_concurrent_SPMDBarrier(
  ) {
    this->FMGL(alive) = ::x10::util::concurrent::AtomicInteger::_make(this->FMGL(count));
    this->FMGL(workers) = ::x10::lang::Rail< ::x10::lang::Runtime__Worker* >::_make(((x10_long)(this->FMGL(count))));
    this->FMGL(index) = ::x10::util::concurrent::AtomicInteger::_make(((x10_int)0));
}
const ::x10aux::serialization_id_t x10::util::concurrent::SPMDBarrier::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::concurrent::SPMDBarrier::_deserializer);

void x10::util::concurrent::SPMDBarrier::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(alive));
    buf.write(this->FMGL(workers));
    buf.write(this->FMGL(index));
    buf.write(this->FMGL(count));
    
}

::x10::lang::Reference* ::x10::util::concurrent::SPMDBarrier::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::concurrent::SPMDBarrier* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::SPMDBarrier>()) ::x10::util::concurrent::SPMDBarrier();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::util::concurrent::SPMDBarrier::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(alive) = buf.read< ::x10::util::concurrent::AtomicInteger*>();
    FMGL(workers) = buf.read< ::x10::lang::Rail< ::x10::lang::Runtime__Worker* >*>();
    FMGL(index) = buf.read< ::x10::util::concurrent::AtomicInteger*>();
    FMGL(count) = buf.read<x10_int>();
}

::x10aux::RuntimeType x10::util::concurrent::SPMDBarrier::rtt;
void x10::util::concurrent::SPMDBarrier::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.util.concurrent.SPMDBarrier",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of SPMDBarrier */
/*************************************************/
