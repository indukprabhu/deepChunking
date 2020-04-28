/*************************************************/
/* START of Serializer */
#include <x10/io/Serializer.h>

#include <x10/io/Unserializable.h>
#include <x10aux/serialization_buffer.h>
#include <x10/compiler/Embed.h>
#include <x10/io/OutputStreamWriter.h>
#include <x10/lang/Any.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Byte.h>
#include <x10/lang/Int.h>
#include <x10/lang/Long.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeClass.h>
::x10::io::Unserializable::itable< ::x10::io::Serializer >  x10::io::Serializer::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::io::Serializer >  x10::io::Serializer::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::io::Serializer::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Unserializable>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::io::Serializer")};

//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
void x10::io::Serializer::_constructor(::x10aux::serialization_buffer* id0) {
    this->FMGL(__NATIVE_FIELD__) = id0;
}
::x10::io::Serializer* x10::io::Serializer::_make(::x10aux::serialization_buffer* id0)
{
    ::x10::io::Serializer* this_ = new (::x10aux::alloc_z< ::x10::io::Serializer>()) ::x10::io::Serializer();
    this_->_constructor(id0);
    return this_;
}



//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
void x10::io::Serializer::_constructor() {
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
    this->FMGL(__NATIVE_FIELD__) = &_Embed___NATIVE_FIELD__;
    _Embed___NATIVE_FIELD__._constructor();
}
::x10::io::Serializer* x10::io::Serializer::_make() {
    ::x10::io::Serializer* this_ = new (::x10aux::alloc_z< ::x10::io::Serializer>()) ::x10::io::Serializer();
    this_->_constructor();
    return this_;
}



//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
void x10::io::Serializer::_constructor(::x10::io::OutputStreamWriter* o) {
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
    this->FMGL(__NATIVE_FIELD__) = &_Embed___NATIVE_FIELD__;
    _Embed___NATIVE_FIELD__._constructor(o);
}
::x10::io::Serializer* x10::io::Serializer::_make(::x10::io::OutputStreamWriter* o)
{
    ::x10::io::Serializer* this_ = new (::x10aux::alloc_z< ::x10::io::Serializer>()) ::x10::io::Serializer();
    this_->_constructor(o);
    return this_;
}



//#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
void x10::io::Serializer::writeAny(::x10::lang::Any* v) {
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
    ::x10aux::nullCheck(this->FMGL(__NATIVE_FIELD__))->writeAny(
      v);
}

//#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
::x10::lang::Rail< x10_byte >* x10::io::Serializer::toRail(
  ) {
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
    return ::x10aux::nullCheck(this->FMGL(__NATIVE_FIELD__))->toRail();
    
}

//#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
x10_int x10::io::Serializer::dataBytesWritten() {
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
    return ::x10aux::nullCheck(this->FMGL(__NATIVE_FIELD__))->dataBytesWritten();
    
}

//#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
void x10::io::Serializer::newObjectGraph() {
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
    ::x10aux::nullCheck(this->FMGL(__NATIVE_FIELD__))->newObjectGraph();
}

//#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
void x10::io::Serializer::addDeserializeCount(x10_long extraCount) {
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
    ::x10aux::nullCheck(this->FMGL(__NATIVE_FIELD__))->addDeserializeCount(
      extraCount);
}

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Serializer.x10"
::x10::io::Serializer* x10::io::Serializer::x10__io__Serializer____this__x10__io__Serializer(
  ) {
    return this;
    
}
void x10::io::Serializer::__fieldInitializers_x10_io_Serializer(
  ) {
 
}
::x10aux::RuntimeType x10::io::Serializer::rtt;
void x10::io::Serializer::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::io::Unserializable>()};
    rtt.initStageTwo("x10.io.Serializer",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of Serializer */
/*************************************************/
