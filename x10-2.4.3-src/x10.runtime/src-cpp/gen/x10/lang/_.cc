/*************************************************/
/* START of _ */
#include <x10/lang/_.h>

#include <x10/lang/Boolean.h>
#include <x10/lang/Byte.h>
#include <x10/lang/Short.h>
#include <x10/lang/Char.h>
#include <x10/lang/Int.h>
#include <x10/lang/Long.h>
#include <x10/lang/Float.h>
#include <x10/lang/Double.h>
#include <x10/lang/String.h>
#include <x10/lang/UInt.h>
#include <x10/lang/UByte.h>
#include <x10/lang/UShort.h>
#include <x10/lang/ULong.h>
#include <x10/io/Console.h>
#include <x10/compiler/Synthetic.h>
 /* public static type boolean = x10.lang.Boolean; */ 
 /* public static type byte = x10.lang.Byte; */ 
 /* public static type short = x10.lang.Short; */ 
 /* public static type char = x10.lang.Char; */ 
 /* public static type int = x10.lang.Int; */ 
 /* public static type long = x10.lang.Long; */ 
 /* public static type float = x10.lang.Float; */ 
 /* public static type double = x10.lang.Double; */ 
 /* public static type boolean(b: x10.lang.Boolean) = x10.lang.Boolean{self==b}; */ 
 /* public static type byte(b: x10.lang.Byte) = x10.lang.Byte{self==b}; */ 
 /* public static type short(b: x10.lang.Short) = x10.lang.Short{self==b}; */ 
 /* public static type char(b: x10.lang.Char) = x10.lang.Char{self==b}; */ 
 /* public static type int(b: x10.lang.Int) = x10.lang.Int{self==b}; */ 
 /* public static type long(b: x10.lang.Long) = x10.lang.Long{self==b}; */ 
 /* public static type float(b: x10.lang.Float) = x10.lang.Float{self==b}; */ 
 /* public static type double(b: x10.lang.Double) = x10.lang.Double{self==b}; */ 
 /* public static type string(s: x10.lang.String) = x10.lang.String{self==s}; */ 
 /* public static type signed = x10.lang.Int; */ 
 /* public static type unsigned = x10.lang.UInt; */ 
 /* public static type ubyte = x10.lang.UByte; */ 
 /* public static type uint8 = x10.lang.UByte; */ 
 /* public static type nat8 = x10.lang.UByte; */ 
 /* public static type ushort = x10.lang.UShort; */ 
 /* public static type uint16 = x10.lang.UShort; */ 
 /* public static type nat16 = x10.lang.UShort; */ 
 /* public static type uint = x10.lang.UInt; */ 
 /* public static type uint32 = x10.lang.UInt; */ 
 /* public static type nat32 = x10.lang.UInt; */ 
 /* public static type ulong = x10.lang.ULong; */ 
 /* public static type uint64 = x10.lang.ULong; */ 
 /* public static type nat64 = x10.lang.ULong; */ 
 /* public static type int8 = x10.lang.Byte; */ 
 /* public static type int16 = x10.lang.Short; */ 
 /* public static type int32 = x10.lang.Int; */ 
 /* public static type int64 = x10.lang.Long; */ 
 /* public static type Console = x10.io.Console; */ 

//#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/_.x10"
::x10::lang::_* x10::lang::_::x10__lang_______this__x10__lang___() {
    return this;
    
}
void x10::lang::_::_constructor() {
    ::x10::lang::_* this__104678 = this;
    
}
::x10::lang::_* x10::lang::_::_make() {
    ::x10::lang::_* this_ = new (::x10aux::alloc_z< ::x10::lang::_>()) ::x10::lang::_();
    this_->_constructor();
    return this_;
}


void x10::lang::_::__fieldInitializers_x10_lang__() {
 
}
const ::x10aux::serialization_id_t x10::lang::_::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::_::_deserializer);

void x10::lang::_::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::lang::_::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::_* this_ = new (::x10aux::alloc_z< ::x10::lang::_>()) ::x10::lang::_();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::_::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::lang::_::rtt;
void x10::lang::_::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.lang._",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of _ */
/*************************************************/
