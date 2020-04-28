/*************************************************/
/* START of AtomicBoolean */
#include <x10/util/concurrent/AtomicBoolean.h>

#include <x10/lang/Int.h>
#include <x10/compiler/Volatile.h>
#include <x10/util/concurrent/Fences.h>
#include <x10/lang/Boolean.h>
#include <x10/compiler/Native.h>
#include <x10/lang/String.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeCPPInclude.h>
#include <x10/compiler/NativeRep.h>

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicBoolean.x10"

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicBoolean.x10"
void x10::util::concurrent::AtomicBoolean::_constructor() {
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicBoolean.x10"
    this->x10::util::concurrent::AtomicBoolean::__fieldInitializers_x10_util_concurrent_AtomicBoolean();
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicBoolean.x10"
    this->FMGL(value) = ((x10_int)0);
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicBoolean.x10"
    ::x10aux::atomic_ops::store_load_barrier();
}
::x10::util::concurrent::AtomicBoolean* x10::util::concurrent::AtomicBoolean::_make(
  ) {
    ::x10::util::concurrent::AtomicBoolean* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::AtomicBoolean>()) ::x10::util::concurrent::AtomicBoolean();
    this_->_constructor();
    return this_;
}



//#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicBoolean.x10"
void x10::util::concurrent::AtomicBoolean::_constructor(x10_boolean v) {
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicBoolean.x10"
    this->x10::util::concurrent::AtomicBoolean::__fieldInitializers_x10_util_concurrent_AtomicBoolean();
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicBoolean.x10"
    this->FMGL(value) = v ? (((x10_int)1)) : (((x10_int)0));
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicBoolean.x10"
    ::x10aux::atomic_ops::store_load_barrier();
}
::x10::util::concurrent::AtomicBoolean* x10::util::concurrent::AtomicBoolean::_make(
  x10_boolean v) {
    ::x10::util::concurrent::AtomicBoolean* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::AtomicBoolean>()) ::x10::util::concurrent::AtomicBoolean();
    this_->_constructor(v);
    return this_;
}



//#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicBoolean.x10"
x10_boolean x10::util::concurrent::AtomicBoolean::get() {
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicBoolean.x10"
    ::x10aux::atomic_ops::load_store_barrier();
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicBoolean.x10"
    ::x10aux::atomic_ops::store_load_barrier();
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicBoolean.x10"
    return (::x10aux::struct_equals(this->FMGL(value), ((x10_int)1)));
    
}

//#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicBoolean.x10"
void x10::util::concurrent::AtomicBoolean::set(x10_boolean v) {
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicBoolean.x10"
    this->FMGL(value) = v ? (((x10_int)1)) : (((x10_int)0));
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicBoolean.x10"
    ::x10aux::atomic_ops::store_load_barrier();
}

//#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicBoolean.x10"
x10_boolean x10::util::concurrent::AtomicBoolean::compareAndSet(
  x10_boolean expect, x10_boolean update){
    return ::x10::util::concurrent::AtomicBooleanNatives::compareAndSet(this, expect, update);
}

//#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicBoolean.x10"
x10_boolean x10::util::concurrent::AtomicBoolean::weakCompareAndSet(
  x10_boolean expect, x10_boolean update){
    return ::x10::util::concurrent::AtomicBooleanNatives::weakCompareAndSet(this, expect, update);
}

//#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicBoolean.x10"
x10_boolean x10::util::concurrent::AtomicBoolean::getAndSet(
  x10_boolean v) {
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicBoolean.x10"
    x10_boolean oldVal = this->x10::util::concurrent::AtomicBoolean::get();
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicBoolean.x10"
    this->x10::util::concurrent::AtomicBoolean::set(v);
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicBoolean.x10"
    return oldVal;
    
}

//#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicBoolean.x10"
::x10::lang::String* x10::util::concurrent::AtomicBoolean::toString(
  ) {
    
    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicBoolean.x10"
    return ::x10aux::to_string(this->x10::util::concurrent::AtomicBoolean::get());
    
}

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicBoolean.x10"
::x10::util::concurrent::AtomicBoolean* x10::util::concurrent::AtomicBoolean::x10__util__concurrent__AtomicBoolean____this__x10__util__concurrent__AtomicBoolean(
  ) {
    return this;
    
}
void x10::util::concurrent::AtomicBoolean::__fieldInitializers_x10_util_concurrent_AtomicBoolean(
  ) {
    this->FMGL(value) = ((x10_int)0);
}
const ::x10aux::serialization_id_t x10::util::concurrent::AtomicBoolean::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::concurrent::AtomicBoolean::_deserializer);

void x10::util::concurrent::AtomicBoolean::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(value));
    
}

::x10::lang::Reference* ::x10::util::concurrent::AtomicBoolean::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::concurrent::AtomicBoolean* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::AtomicBoolean>()) ::x10::util::concurrent::AtomicBoolean();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::util::concurrent::AtomicBoolean::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(value) = buf.read<x10_int>();
}

::x10aux::RuntimeType x10::util::concurrent::AtomicBoolean::rtt;
void x10::util::concurrent::AtomicBoolean::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.util.concurrent.AtomicBoolean",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of AtomicBoolean */
/*************************************************/
