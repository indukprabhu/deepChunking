/*************************************************/
/* START of AtomicDouble */
#include <x10/util/concurrent/AtomicDouble.h>

#include <x10/util/concurrent/AtomicLong.h>
#include <x10/lang/Double.h>
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/String.h>
#include <x10/lang/Int.h>
#include <x10/lang/Float.h>
#include <x10/compiler/Synthetic.h>

//#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
void x10::util::concurrent::AtomicDouble::_constructor() {
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    ::x10::util::concurrent::AtomicDouble* this__117232 = this;
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    this->FMGL(v) = ::x10::util::concurrent::AtomicLong::_make(::x10::lang::DoubleNatives::toRawLongBits(0.0));
}
::x10::util::concurrent::AtomicDouble* x10::util::concurrent::AtomicDouble::_make(
  ) {
    ::x10::util::concurrent::AtomicDouble* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::AtomicDouble>()) ::x10::util::concurrent::AtomicDouble();
    this_->_constructor();
    return this_;
}



//#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
void x10::util::concurrent::AtomicDouble::_constructor(x10_double v) {
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    ::x10::util::concurrent::AtomicDouble* this__117233 = this;
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    this->FMGL(v) = ::x10::util::concurrent::AtomicLong::_make(::x10::lang::DoubleNatives::toRawLongBits(v));
}
::x10::util::concurrent::AtomicDouble* x10::util::concurrent::AtomicDouble::_make(
  x10_double v) {
    ::x10::util::concurrent::AtomicDouble* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::AtomicDouble>()) ::x10::util::concurrent::AtomicDouble();
    this_->_constructor(v);
    return this_;
}



//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
x10_double x10::util::concurrent::AtomicDouble::get() {
    return ::x10::lang::DoubleNatives::fromLongBits(::x10aux::nullCheck(this->FMGL(v))->x10::util::concurrent::AtomicLong::get());
    
}

//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
void x10::util::concurrent::AtomicDouble::set(x10_double v) {
    ::x10aux::nullCheck(this->FMGL(v))->x10::util::concurrent::AtomicLong::set(
      ::x10::lang::DoubleNatives::toRawLongBits(v));
}

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
x10_boolean x10::util::concurrent::AtomicDouble::compareAndSet(
  x10_double expect, x10_double update) {
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    x10_long exp = ::x10::lang::DoubleNatives::toRawLongBits(expect);
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    x10_long upd = ::x10::lang::DoubleNatives::toRawLongBits(update);
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    return ::x10aux::nullCheck(this->FMGL(v))->x10::util::concurrent::AtomicLong::compareAndSet(
             exp, upd);
    
}

//#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
x10_boolean x10::util::concurrent::AtomicDouble::weakCompareAndSet(
  x10_double expect, x10_double update) {
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    x10_long exp = ::x10::lang::DoubleNatives::toRawLongBits(expect);
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    x10_long upd = ::x10::lang::DoubleNatives::toRawLongBits(update);
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    return ::x10aux::nullCheck(this->FMGL(v))->x10::util::concurrent::AtomicLong::weakCompareAndSet(
             exp, upd);
    
}

//#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
x10_double x10::util::concurrent::AtomicDouble::getAndIncrement(
  ) {
    return this->x10::util::concurrent::AtomicDouble::getAndAdd(
             ((x10_double) (((x10_long)1ll))));
    
}

//#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
x10_double x10::util::concurrent::AtomicDouble::getAndDecrement(
  ) {
    return this->x10::util::concurrent::AtomicDouble::getAndAdd(
             ((x10_double) (((x10_long)-1ll))));
    
}

//#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
x10_double x10::util::concurrent::AtomicDouble::getAndAdd(
  x10_double delta) {
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    do {
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        x10_long exp = ::x10aux::nullCheck(this->FMGL(v))->x10::util::concurrent::AtomicLong::get();
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        x10_double expect = ::x10::lang::DoubleNatives::fromLongBits(exp);
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        x10_double update = ((expect) + (delta));
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        x10_long upd = ::x10::lang::DoubleNatives::toRawLongBits(update);
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        if (::x10aux::nullCheck(this->FMGL(v))->x10::util::concurrent::AtomicLong::weakCompareAndSet(
              exp, upd)) {
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
            return expect;
            
        }
        
    } while (true);
    
}

//#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
x10_double x10::util::concurrent::AtomicDouble::incrementAndGet(
  ) {
    return this->x10::util::concurrent::AtomicDouble::addAndGet(
             ((x10_double) (((x10_long)1ll))));
    
}

//#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
x10_double x10::util::concurrent::AtomicDouble::decrementAndGet(
  ) {
    return this->x10::util::concurrent::AtomicDouble::addAndGet(
             ((x10_double) (((x10_long)-1ll))));
    
}

//#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
x10_double x10::util::concurrent::AtomicDouble::addAndGet(
  x10_double delta) {
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
    do {
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        x10_long exp = ::x10aux::nullCheck(this->FMGL(v))->x10::util::concurrent::AtomicLong::get();
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        x10_double expect = ::x10::lang::DoubleNatives::fromLongBits(exp);
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        x10_double update = ((expect) + (delta));
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        x10_long upd = ::x10::lang::DoubleNatives::toRawLongBits(update);
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
        if (::x10aux::nullCheck(this->FMGL(v))->x10::util::concurrent::AtomicLong::weakCompareAndSet(
              exp, upd)) {
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
            return update;
            
        }
        
    } while (true);
    
}

//#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
::x10::lang::String* x10::util::concurrent::AtomicDouble::toString(
  ) {
    return ::x10aux::to_string(this->x10::util::concurrent::AtomicDouble::get());
    
}

//#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
x10_int x10::util::concurrent::AtomicDouble::intValue() {
    return ::x10::lang::DoubleNatives::toInt(this->x10::util::concurrent::AtomicDouble::get());
    
}

//#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
x10_long x10::util::concurrent::AtomicDouble::longValue() {
    return ::x10::lang::DoubleNatives::toLong(this->x10::util::concurrent::AtomicDouble::get());
    
}

//#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
x10_float x10::util::concurrent::AtomicDouble::floatValue(
  ) {
    return ((x10_float) (this->x10::util::concurrent::AtomicDouble::get()));
    
}

//#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
x10_double x10::util::concurrent::AtomicDouble::doubleValue(
  ) {
    return this->x10::util::concurrent::AtomicDouble::get();
    
}

//#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicDouble.x10"
::x10::util::concurrent::AtomicDouble* x10::util::concurrent::AtomicDouble::x10__util__concurrent__AtomicDouble____this__x10__util__concurrent__AtomicDouble(
  ) {
    return this;
    
}
void x10::util::concurrent::AtomicDouble::__fieldInitializers_x10_util_concurrent_AtomicDouble(
  ) {
 
}
const ::x10aux::serialization_id_t x10::util::concurrent::AtomicDouble::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::concurrent::AtomicDouble::_deserializer);

void x10::util::concurrent::AtomicDouble::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(v));
    
}

::x10::lang::Reference* ::x10::util::concurrent::AtomicDouble::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::concurrent::AtomicDouble* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::AtomicDouble>()) ::x10::util::concurrent::AtomicDouble();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::util::concurrent::AtomicDouble::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(v) = buf.read< ::x10::util::concurrent::AtomicLong*>();
}

::x10aux::RuntimeType x10::util::concurrent::AtomicDouble::rtt;
void x10::util::concurrent::AtomicDouble::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.util.concurrent.AtomicDouble",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of AtomicDouble */
/*************************************************/
