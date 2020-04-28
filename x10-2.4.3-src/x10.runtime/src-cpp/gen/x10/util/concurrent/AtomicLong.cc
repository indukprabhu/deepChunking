/*************************************************/
/* START of AtomicLong */
#include <x10/util/concurrent/AtomicLong.h>

#include <x10/lang/Long.h>
#include <x10/compiler/Volatile.h>
#include <x10/util/concurrent/Fences.h>
#include <x10/compiler/Native.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/String.h>
#include <x10/lang/Int.h>
#include <x10/lang/Float.h>
#include <x10/lang/Double.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeCPPInclude.h>
#include <x10/compiler/NativeRep.h>

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"

//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
void x10::util::concurrent::AtomicLong::_constructor() {
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
    this->x10::util::concurrent::AtomicLong::__fieldInitializers_x10_util_concurrent_AtomicLong();
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
    this->FMGL(value) = ((x10_long)0ll);
}
::x10::util::concurrent::AtomicLong* x10::util::concurrent::AtomicLong::_make(
  ) {
    ::x10::util::concurrent::AtomicLong* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::AtomicLong>()) ::x10::util::concurrent::AtomicLong();
    this_->_constructor();
    return this_;
}



//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
void x10::util::concurrent::AtomicLong::_constructor(x10_long v) {
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
    this->x10::util::concurrent::AtomicLong::__fieldInitializers_x10_util_concurrent_AtomicLong();
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
    this->FMGL(value) = v;
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
    ::x10aux::atomic_ops::store_load_barrier();
}
::x10::util::concurrent::AtomicLong* x10::util::concurrent::AtomicLong::_make(
  x10_long v) {
    ::x10::util::concurrent::AtomicLong* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::AtomicLong>()) ::x10::util::concurrent::AtomicLong();
    this_->_constructor(v);
    return this_;
}



//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
x10_long x10::util::concurrent::AtomicLong::get() {
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
    ::x10aux::atomic_ops::load_store_barrier();
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
    ::x10aux::atomic_ops::store_load_barrier();
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
    return this->FMGL(value);
    
}

//#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
void x10::util::concurrent::AtomicLong::set(x10_long newV) {
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
    this->FMGL(value) = newV;
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
    ::x10aux::atomic_ops::store_load_barrier();
}

//#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
x10_boolean x10::util::concurrent::AtomicLong::compareAndSet(x10_long expect,
                                                             x10_long update){
    return ::x10::util::concurrent::AtomicLongNatives::compareAndSet(this,expect,update);
}

//#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
x10_boolean x10::util::concurrent::AtomicLong::weakCompareAndSet(x10_long expect,
                                                                 x10_long update){
    return ::x10::util::concurrent::AtomicLongNatives::weakCompareAndSet(this,expect,update);
}

//#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
x10_long x10::util::concurrent::AtomicLong::getAndIncrement() {
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
    return this->x10::util::concurrent::AtomicLong::getAndAdd(((x10_long)1ll));
    
}

//#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
x10_long x10::util::concurrent::AtomicLong::getAndDecrement() {
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
    return this->x10::util::concurrent::AtomicLong::getAndAdd(((x10_long)-1ll));
    
}

//#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
x10_long x10::util::concurrent::AtomicLong::getAndAdd(x10_long delta){
    return ::x10::util::concurrent::AtomicLongNatives::getAndAdd(this,delta);
}

//#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
x10_long x10::util::concurrent::AtomicLong::incrementAndGet() {
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
    return this->x10::util::concurrent::AtomicLong::addAndGet(((x10_long)1ll));
    
}

//#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
x10_long x10::util::concurrent::AtomicLong::decrementAndGet() {
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
    return this->x10::util::concurrent::AtomicLong::addAndGet(((x10_long)-1ll));
    
}

//#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
x10_long x10::util::concurrent::AtomicLong::addAndGet(x10_long delta){
    return ::x10::util::concurrent::AtomicLongNatives::addAndGet(this, delta);
}

//#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
::x10::lang::String* x10::util::concurrent::AtomicLong::toString(
  ) {
    
    //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
    return ::x10aux::to_string(this->x10::util::concurrent::AtomicLong::get());
    
}

//#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
x10_int x10::util::concurrent::AtomicLong::intValue() {
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
    return ((x10_int) (this->x10::util::concurrent::AtomicLong::get()));
    
}

//#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
x10_long x10::util::concurrent::AtomicLong::longValue() {
    
    //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
    return this->x10::util::concurrent::AtomicLong::get();
    
}

//#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
x10_float x10::util::concurrent::AtomicLong::floatValue() {
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
    return ((x10_float) (this->x10::util::concurrent::AtomicLong::get()));
    
}

//#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
x10_double x10::util::concurrent::AtomicLong::doubleValue() {
    
    //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
    return ((x10_double) (this->x10::util::concurrent::AtomicLong::get()));
    
}

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicLong.x10"
::x10::util::concurrent::AtomicLong* x10::util::concurrent::AtomicLong::x10__util__concurrent__AtomicLong____this__x10__util__concurrent__AtomicLong(
  ) {
    return this;
    
}
void x10::util::concurrent::AtomicLong::__fieldInitializers_x10_util_concurrent_AtomicLong(
  ) {
    this->FMGL(value) = ((x10_long)0ll);
}
const ::x10aux::serialization_id_t x10::util::concurrent::AtomicLong::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::concurrent::AtomicLong::_deserializer);

void x10::util::concurrent::AtomicLong::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(value));
    
}

::x10::lang::Reference* ::x10::util::concurrent::AtomicLong::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::concurrent::AtomicLong* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::AtomicLong>()) ::x10::util::concurrent::AtomicLong();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::util::concurrent::AtomicLong::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(value) = buf.read<x10_long>();
}

::x10aux::RuntimeType x10::util::concurrent::AtomicLong::rtt;
void x10::util::concurrent::AtomicLong::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.util.concurrent.AtomicLong",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of AtomicLong */
/*************************************************/
