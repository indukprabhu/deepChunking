/*************************************************/
/* START of Deserializer */
#include <x10/io/Deserializer.h>

#include <x10/io/Unserializable.h>
#include <x10aux/deserialization_buffer.h>
#include <x10/compiler/Embed.h>
#include <x10/io/Serializer.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Byte.h>
#include <x10/io/InputStreamReader.h>
#include <x10/lang/Any.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeClass.h>
::x10::io::Unserializable::itable< ::x10::io::Deserializer >  x10::io::Deserializer::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::io::Deserializer >  x10::io::Deserializer::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::io::Deserializer::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Unserializable>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::io::Deserializer")};

//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Deserializer.x10"
void x10::io::Deserializer::_constructor(::x10aux::deserialization_buffer* id0) {
    this->FMGL(__NATIVE_FIELD__) = id0;
}
::x10::io::Deserializer* x10::io::Deserializer::_make(::x10aux::deserialization_buffer* id0)
{
    ::x10::io::Deserializer* this_ = new (::x10aux::alloc_z< ::x10::io::Deserializer>()) ::x10::io::Deserializer();
    this_->_constructor(id0);
    return this_;
}



//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Deserializer.x10"
void x10::io::Deserializer::_constructor(::x10::io::Serializer* s) {
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Deserializer.x10"
    this->FMGL(__NATIVE_FIELD__) = &_Embed___NATIVE_FIELD__;
    _Embed___NATIVE_FIELD__._constructor(s);
}
::x10::io::Deserializer* x10::io::Deserializer::_make(::x10::io::Serializer* s)
{
    ::x10::io::Deserializer* this_ = new (::x10aux::alloc_z< ::x10::io::Deserializer>()) ::x10::io::Deserializer();
    this_->_constructor(s);
    return this_;
}



//#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Deserializer.x10"
void x10::io::Deserializer::_constructor(::x10::lang::Rail< x10_byte >* r) {
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Deserializer.x10"
    this->FMGL(__NATIVE_FIELD__) = &_Embed___NATIVE_FIELD__;
    _Embed___NATIVE_FIELD__._constructor(r);
}
::x10::io::Deserializer* x10::io::Deserializer::_make(::x10::lang::Rail< x10_byte >* r)
{
    ::x10::io::Deserializer* this_ = new (::x10aux::alloc_z< ::x10::io::Deserializer>()) ::x10::io::Deserializer();
    this_->_constructor(r);
    return this_;
}



//#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Deserializer.x10"
void x10::io::Deserializer::_constructor(::x10::io::InputStreamReader* i) {
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Deserializer.x10"
    this->FMGL(__NATIVE_FIELD__) = &_Embed___NATIVE_FIELD__;
    _Embed___NATIVE_FIELD__._constructor(i);
}
::x10::io::Deserializer* x10::io::Deserializer::_make(::x10::io::InputStreamReader* i)
{
    ::x10::io::Deserializer* this_ = new (::x10aux::alloc_z< ::x10::io::Deserializer>()) ::x10::io::Deserializer();
    this_->_constructor(i);
    return this_;
}



//#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Deserializer.x10"
::x10::lang::Any* x10::io::Deserializer::readAny() {
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Deserializer.x10"
    return ::x10aux::nullCheck(this->FMGL(__NATIVE_FIELD__))->readAny();
    
}

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Deserializer.x10"
::x10::io::Deserializer* x10::io::Deserializer::x10__io__Deserializer____this__x10__io__Deserializer(
  ) {
    return this;
    
}
void x10::io::Deserializer::__fieldInitializers_x10_io_Deserializer(
  ) {
 
}
::x10aux::RuntimeType x10::io::Deserializer::rtt;
void x10::io::Deserializer::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::io::Unserializable>()};
    rtt.initStageTwo("x10.io.Deserializer",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of Deserializer */
/*************************************************/
