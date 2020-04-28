/*************************************************/
/* START of chunk */
#include <chunk.h>

#include <x10/lang/Boolean.h>
#include <x10/lang/Long.h>
#include <x10/compiler/Synthetic.h>

//#line 4 "/home/induk/workspace/testprgms/src/chunk.x10"

//#line 5 "/home/induk/workspace/testprgms/src/chunk.x10"

//#line 6 "/home/induk/workspace/testprgms/src/chunk.x10"

//#line 7 "/home/induk/workspace/testprgms/src/chunk.x10"

//#line 1 "/home/induk/workspace/testprgms/src/chunk.x10"
::chunk* chunk::chunk____this__chunk() {
    return this;
    
}

//#line 2 "/home/induk/workspace/testprgms/src/chunk.x10"
void chunk::_constructor() {
    
    //#line 1 "/home/induk/workspace/testprgms/src/chunk.x10"
    this->chunk::__fieldInitializers_chunk();
}
::chunk* chunk::_make() {
    ::chunk* this_ = new (::x10aux::alloc_z< ::chunk>()) ::chunk();
    this_->_constructor();
    return this_;
}



//#line 1 "/home/induk/workspace/testprgms/src/chunk.x10"
void chunk::__fieldInitializers_chunk() {
    this->FMGL(isfull) = false;
    this->FMGL(mytotalcost) = ((x10_long)0ll);
    this->FMGL(myChunkStart) = ((x10_long)-1ll);
    this->FMGL(myChunkEnd) = ((x10_long)0ll);
}
const ::x10aux::serialization_id_t chunk::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::chunk::_deserializer);

void chunk::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(isfull));
    buf.write(this->FMGL(mytotalcost));
    buf.write(this->FMGL(myChunkStart));
    buf.write(this->FMGL(myChunkEnd));
    
}

::x10::lang::Reference* ::chunk::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::chunk* this_ = new (::x10aux::alloc_z< ::chunk>()) ::chunk();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void chunk::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(isfull) = buf.read<x10_boolean>();
    FMGL(mytotalcost) = buf.read<x10_long>();
    FMGL(myChunkStart) = buf.read<x10_long>();
    FMGL(myChunkEnd) = buf.read<x10_long>();
}

::x10aux::RuntimeType chunk::rtt;
void chunk::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("chunk",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of chunk */
/*************************************************/
