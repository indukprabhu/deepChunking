/*************************************************/
/* START of AtomicFloat */
#include <x10/util/concurrent/AtomicFloat.h>

#include <x10/util/concurrent/AtomicInteger.h>
#include <x10/lang/Float.h>
#include <x10/lang/Int.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/String.h>
#include <x10/lang/Long.h>
#include <x10/lang/Double.h>
#include <x10/compiler/Synthetic.h>

//#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
void x10::util::concurrent::AtomicFloat::_constructor() {
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    ::x10::util::concurrent::AtomicFloat* this__117254 = this;
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    this->FMGL(v) = ::x10::util::concurrent::AtomicInteger::_make(::x10::lang::FloatNatives::toRawIntBits(0.0f));
}
::x10::util::concurrent::AtomicFloat* x10::util::concurrent::AtomicFloat::_make(
  ) {
    ::x10::util::concurrent::AtomicFloat* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::AtomicFloat>()) ::x10::util::concurrent::AtomicFloat();
    this_->_constructor();
    return this_;
}



//#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
void x10::util::concurrent::AtomicFloat::_constructor(x10_float v) {
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    ::x10::util::concurrent::AtomicFloat* this__117255 = this;
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    this->FMGL(v) = ::x10::util::concurrent::AtomicInteger::_make(::x10::lang::FloatNatives::toRawIntBits(v));
}
::x10::util::concurrent::AtomicFloat* x10::util::concurrent::AtomicFloat::_make(
  x10_float v) {
    ::x10::util::concurrent::AtomicFloat* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::AtomicFloat>()) ::x10::util::concurrent::AtomicFloat();
    this_->_constructor(v);
    return this_;
}



//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
x10_float x10::util::concurrent::AtomicFloat::get() {
    return ::x10::lang::FloatNatives::fromIntBits(::x10aux::nullCheck(this->FMGL(v))->x10::util::concurrent::AtomicInteger::get());
    
}

//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
void x10::util::concurrent::AtomicFloat::set(x10_float v) {
    ::x10aux::nullCheck(this->FMGL(v))->x10::util::concurrent::AtomicInteger::set(
      ::x10::lang::FloatNatives::toRawIntBits(v));
}

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
x10_boolean x10::util::concurrent::AtomicFloat::compareAndSet(x10_float expect,
                                                              x10_float update) {
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    x10_int exp = ::x10::lang::FloatNatives::toRawIntBits(expect);
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    x10_int upd = ::x10::lang::FloatNatives::toRawIntBits(update);
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    return ::x10aux::nullCheck(this->FMGL(v))->x10::util::concurrent::AtomicInteger::compareAndSet(
             exp, upd);
    
}

//#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
x10_boolean x10::util::concurrent::AtomicFloat::weakCompareAndSet(
  x10_float expect, x10_float update) {
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    x10_int exp = ::x10::lang::FloatNatives::toRawIntBits(expect);
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    x10_int upd = ::x10::lang::FloatNatives::toRawIntBits(update);
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    return ::x10aux::nullCheck(this->FMGL(v))->x10::util::concurrent::AtomicInteger::weakCompareAndSet(
             exp, upd);
    
}

//#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
x10_float x10::util::concurrent::AtomicFloat::getAndIncrement(
  ) {
    return this->x10::util::concurrent::AtomicFloat::getAndAdd(
             ((x10_float) (((x10_long)1ll))));
    
}

//#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
x10_float x10::util::concurrent::AtomicFloat::getAndDecrement(
  ) {
    return this->x10::util::concurrent::AtomicFloat::getAndAdd(
             ((x10_float) (((x10_long)-1ll))));
    
}

//#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
x10_float x10::util::concurrent::AtomicFloat::getAndAdd(x10_float delta) {
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    do {
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        x10_int exp = ::x10aux::nullCheck(this->FMGL(v))->x10::util::concurrent::AtomicInteger::get();
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        x10_float expect = ::x10::lang::FloatNatives::fromIntBits(exp);
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        x10_float update = ((expect) + (delta));
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        x10_int upd = ::x10::lang::FloatNatives::toRawIntBits(update);
        
        //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        if (::x10aux::nullCheck(this->FMGL(v))->x10::util::concurrent::AtomicInteger::weakCompareAndSet(
              exp, upd)) {
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
            return expect;
            
        }
        
    } while (true);
    
}

//#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
x10_float x10::util::concurrent::AtomicFloat::incrementAndGet(
  ) {
    return this->x10::util::concurrent::AtomicFloat::addAndGet(
             ((x10_float) (((x10_long)1ll))));
    
}

//#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
x10_float x10::util::concurrent::AtomicFloat::decrementAndGet(
  ) {
    return this->x10::util::concurrent::AtomicFloat::addAndGet(
             ((x10_float) (((x10_long)-1ll))));
    
}

//#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
x10_float x10::util::concurrent::AtomicFloat::addAndGet(x10_float delta) {
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
    do {
        
        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        x10_int exp = ::x10aux::nullCheck(this->FMGL(v))->x10::util::concurrent::AtomicInteger::get();
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        x10_float expect = ::x10::lang::FloatNatives::fromIntBits(exp);
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        x10_float update = ((expect) + (delta));
        
        //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        x10_int upd = ::x10::lang::FloatNatives::toRawIntBits(update);
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
        if (::x10aux::nullCheck(this->FMGL(v))->x10::util::concurrent::AtomicInteger::weakCompareAndSet(
              exp, upd)) {
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
            return update;
            
        }
        
    } while (true);
    
}

//#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
::x10::lang::String* x10::util::concurrent::AtomicFloat::toString(
  ) {
    return ::x10aux::to_string(this->x10::util::concurrent::AtomicFloat::get());
    
}

//#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
x10_int x10::util::concurrent::AtomicFloat::intValue() {
    return ::x10::lang::FloatNatives::toInt(this->x10::util::concurrent::AtomicFloat::get());
    
}

//#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
x10_long x10::util::concurrent::AtomicFloat::longValue() {
    return ::x10::lang::FloatNatives::toLong(this->x10::util::concurrent::AtomicFloat::get());
    
}

//#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
x10_float x10::util::concurrent::AtomicFloat::floatValue(
  ) {
    return this->x10::util::concurrent::AtomicFloat::get();
    
}

//#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
x10_double x10::util::concurrent::AtomicFloat::doubleValue(
  ) {
    return ((x10_double) (this->x10::util::concurrent::AtomicFloat::get()));
    
}

//#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/concurrent/AtomicFloat.x10"
::x10::util::concurrent::AtomicFloat* x10::util::concurrent::AtomicFloat::x10__util__concurrent__AtomicFloat____this__x10__util__concurrent__AtomicFloat(
  ) {
    return this;
    
}
void x10::util::concurrent::AtomicFloat::__fieldInitializers_x10_util_concurrent_AtomicFloat(
  ) {
 
}
const ::x10aux::serialization_id_t x10::util::concurrent::AtomicFloat::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::concurrent::AtomicFloat::_deserializer);

void x10::util::concurrent::AtomicFloat::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(v));
    
}

::x10::lang::Reference* ::x10::util::concurrent::AtomicFloat::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::concurrent::AtomicFloat* this_ = new (::x10aux::alloc_z< ::x10::util::concurrent::AtomicFloat>()) ::x10::util::concurrent::AtomicFloat();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::util::concurrent::AtomicFloat::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(v) = buf.read< ::x10::util::concurrent::AtomicInteger*>();
}

::x10aux::RuntimeType x10::util::concurrent::AtomicFloat::rtt;
void x10::util::concurrent::AtomicFloat::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.util.concurrent.AtomicFloat",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of AtomicFloat */
/*************************************************/
