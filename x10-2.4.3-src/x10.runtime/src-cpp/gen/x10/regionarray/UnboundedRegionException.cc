/*************************************************/
/* START of UnboundedRegionException */
#include <x10/regionarray/UnboundedRegionException.h>

#include <x10/lang/Exception.h>
#include <x10/lang/String.h>
#include <x10/compiler/Synthetic.h>

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UnboundedRegionException.x10"
void x10::regionarray::UnboundedRegionException::_constructor(::x10::lang::String* msg) {
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UnboundedRegionException.x10"
    (this)->::x10::lang::Exception::_constructor(msg);
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UnboundedRegionException.x10"
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UnboundedRegionException.x10"
    ::x10::regionarray::UnboundedRegionException* this__116773 = this;
    
}
::x10::regionarray::UnboundedRegionException* x10::regionarray::UnboundedRegionException::_make(
  ::x10::lang::String* msg) {
    ::x10::regionarray::UnboundedRegionException* this_ = new (::x10aux::alloc_z< ::x10::regionarray::UnboundedRegionException>()) ::x10::regionarray::UnboundedRegionException();
    this_->_constructor(msg);
    return this_;
}



//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UnboundedRegionException.x10"
void x10::regionarray::UnboundedRegionException::_constructor() {
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UnboundedRegionException.x10"
    (this)->::x10::lang::Exception::_constructor();
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UnboundedRegionException.x10"
    
    //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UnboundedRegionException.x10"
    ::x10::regionarray::UnboundedRegionException* this__116774 = this;
    
}
::x10::regionarray::UnboundedRegionException* x10::regionarray::UnboundedRegionException::_make(
  ) {
    ::x10::regionarray::UnboundedRegionException* this_ = new (::x10aux::alloc_z< ::x10::regionarray::UnboundedRegionException>()) ::x10::regionarray::UnboundedRegionException();
    this_->_constructor();
    return this_;
}



//#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/UnboundedRegionException.x10"
::x10::regionarray::UnboundedRegionException* x10::regionarray::UnboundedRegionException::x10__regionarray__UnboundedRegionException____this__x10__regionarray__UnboundedRegionException(
  ) {
    return this;
    
}
void x10::regionarray::UnboundedRegionException::__fieldInitializers_x10_regionarray_UnboundedRegionException(
  ) {
 
}
const ::x10aux::serialization_id_t x10::regionarray::UnboundedRegionException::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::UnboundedRegionException::_deserializer);

void x10::regionarray::UnboundedRegionException::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::Exception::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::regionarray::UnboundedRegionException::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::UnboundedRegionException* this_ = new (::x10aux::alloc_z< ::x10::regionarray::UnboundedRegionException>()) ::x10::regionarray::UnboundedRegionException();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::regionarray::UnboundedRegionException::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Exception::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::regionarray::UnboundedRegionException::rtt;
void x10::regionarray::UnboundedRegionException::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Exception>()};
    rtt.initStageTwo("x10.regionarray.UnboundedRegionException",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of UnboundedRegionException */
/*************************************************/
