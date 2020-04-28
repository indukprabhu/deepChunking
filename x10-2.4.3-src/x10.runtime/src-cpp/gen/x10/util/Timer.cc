/*************************************************/
/* START of Timer */
#include <x10/util/Timer.h>

#include <x10/lang/Long.h>
#include <x10/compiler/Native.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeCPPInclude.h>

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Timer.x10"

//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Timer.x10"

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Timer.x10"
::x10::util::Timer* x10::util::Timer::x10__util__Timer____this__x10__util__Timer(
  ) {
    return this;
    
}

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Timer.x10"
void x10::util::Timer::_constructor() {
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Timer.x10"
    ::x10::util::Timer* this__122988 = this;
    
}
::x10::util::Timer* x10::util::Timer::_make() {
    ::x10::util::Timer* this_ = new (::x10aux::alloc_z< ::x10::util::Timer>()) ::x10::util::Timer();
    this_->_constructor();
    return this_;
}



//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Timer.x10"
void x10::util::Timer::__fieldInitializers_x10_util_Timer() {
 
}
const ::x10aux::serialization_id_t x10::util::Timer::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::Timer::_deserializer);

void x10::util::Timer::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::util::Timer::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::Timer* this_ = new (::x10aux::alloc_z< ::x10::util::Timer>()) ::x10::util::Timer();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::util::Timer::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::util::Timer::rtt;
void x10::util::Timer::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.util.Timer",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of Timer */
/*************************************************/
