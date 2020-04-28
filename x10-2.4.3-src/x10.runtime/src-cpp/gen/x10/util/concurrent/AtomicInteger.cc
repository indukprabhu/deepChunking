/*************************************************/
/* START of AtomicInteger */
#include <x10/util/concurrent/AtomicInteger.h>

#include <x10/lang/Int.h>
#include <x10/compiler/Volatile.h>
#include <x10/util/concurrent/Fences.h>
#include <x10/compiler/Native.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/String.h>
#include <x10/lang/Long.h>
#include <x10/lang/Float.h>
#include <x10/lang/Double.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeCPPInclude.h>
#include <x10/compiler/NativeRep.h>

//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"

//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
void x10::util::concurrent::AtomicInteger::_constructor() {
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
    this->x10::util::concurrent::AtomicInteger::__fieldInitializers_x10_util_concurrent_AtomicInteger();
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
    this->FMGL(value) = ((x10_int)0);
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
    ::x10aux::atomic_ops::store_load_barrier();
}
::x10::util::concurrent::AtomicInteger* x10::util::concurrent::AtomicInteger::_make(
  ) {
    ::x10::util::concurrent::AtomicInteger* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::AtomicInteger>()) ::x10::util::concurrent::AtomicInteger();
    this_->_constructor();
    return this_;
}



//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
void x10::util::concurrent::AtomicInteger::_constructor(x10_int v) {
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
    this->x10::util::concurrent::AtomicInteger::__fieldInitializers_x10_util_concurrent_AtomicInteger();
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
    this->FMGL(value) = v;
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
    ::x10aux::atomic_ops::store_load_barrier();
}
::x10::util::concurrent::AtomicInteger* x10::util::concurrent::AtomicInteger::_make(
  x10_int v) {
    ::x10::util::concurrent::AtomicInteger* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::AtomicInteger>()) ::x10::util::concurrent::AtomicInteger();
    this_->_constructor(v);
    return this_;
}



//#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
x10_int x10::util::concurrent::AtomicInteger::get() {
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
    ::x10aux::atomic_ops::load_store_barrier();
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
    ::x10aux::atomic_ops::store_load_barrier();
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
    return this->FMGL(value);
    
}

//#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
void x10::util::concurrent::AtomicInteger::set(x10_int newV) {
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
    this->FMGL(value) = newV;
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
    ::x10aux::atomic_ops::store_load_barrier();
}

//#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
x10_boolean x10::util::concurrent::AtomicInteger::compareAndSet(
  x10_int expect, x10_int update){
    return ::x10::util::concurrent::AtomicIntegerNatives::compareAndSet(this,expect,update);
}

//#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
x10_boolean x10::util::concurrent::AtomicInteger::weakCompareAndSet(
  x10_int expect, x10_int update){
    return ::x10::util::concurrent::AtomicIntegerNatives::weakCompareAndSet(this,expect,update);
}

//#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
x10_int x10::util::concurrent::AtomicInteger::getAndIncrement(
  ) {
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
    return this->x10::util::concurrent::AtomicInteger::getAndAdd(
             ((x10_int)1));
    
}

//#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
x10_int x10::util::concurrent::AtomicInteger::getAndDecrement(
  ) {
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
    return this->x10::util::concurrent::AtomicInteger::getAndAdd(
             ((x10_int)-1));
    
}

//#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
x10_int x10::util::concurrent::AtomicInteger::getAndAdd(x10_int delta){
    return ::x10::util::concurrent::AtomicIntegerNatives::getAndAdd(this, delta);
}

//#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
x10_int x10::util::concurrent::AtomicInteger::incrementAndGet(
  ) {
    
    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
    return this->x10::util::concurrent::AtomicInteger::addAndGet(
             ((x10_int)1));
    
}

//#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
x10_int x10::util::concurrent::AtomicInteger::decrementAndGet(
  ) {
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
    return this->x10::util::concurrent::AtomicInteger::addAndGet(
             ((x10_int)-1));
    
}

//#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
x10_int x10::util::concurrent::AtomicInteger::addAndGet(x10_int delta){
    return ::x10::util::concurrent::AtomicIntegerNatives::addAndGet(this, delta);
}

//#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
::x10::lang::String* x10::util::concurrent::AtomicInteger::toString(
  ) {
    
    //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
    return ::x10aux::to_string(this->x10::util::concurrent::AtomicInteger::get());
    
}

//#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
x10_int x10::util::concurrent::AtomicInteger::intValue() {
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
    return this->x10::util::concurrent::AtomicInteger::get();
    
}

//#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
x10_long x10::util::concurrent::AtomicInteger::longValue(
  ) {
    
    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
    return ((x10_long)(this->x10::util::concurrent::AtomicInteger::get()));
    
}

//#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
x10_float x10::util::concurrent::AtomicInteger::floatValue(
  ) {
    
    //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
    return ((x10_float) (this->x10::util::concurrent::AtomicInteger::get()));
    
}

//#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
x10_double x10::util::concurrent::AtomicInteger::doubleValue(
  ) {
    
    //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
    return ((x10_double) (this->x10::util::concurrent::AtomicInteger::get()));
    
}

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicInteger.x10"
::x10::util::concurrent::AtomicInteger* x10::util::concurrent::AtomicInteger::x10__util__concurrent__AtomicInteger____this__x10__util__concurrent__AtomicInteger(
  ) {
    return this;
    
}
void x10::util::concurrent::AtomicInteger::__fieldInitializers_x10_util_concurrent_AtomicInteger(
  ) {
    this->FMGL(value) = ((x10_int)0);
}
const ::x10aux::serialization_id_t x10::util::concurrent::AtomicInteger::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::concurrent::AtomicInteger::_deserializer);

void x10::util::concurrent::AtomicInteger::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(value));
    
}

::x10::lang::Reference* ::x10::util::concurrent::AtomicInteger::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::concurrent::AtomicInteger* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::AtomicInteger>()) ::x10::util::concurrent::AtomicInteger();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::util::concurrent::AtomicInteger::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(value) = buf.read<x10_int>();
}

::x10aux::RuntimeType x10::util::concurrent::AtomicInteger::rtt;
void x10::util::concurrent::AtomicInteger::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.util.concurrent.AtomicInteger",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of AtomicInteger */
/*************************************************/
