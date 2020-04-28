/*************************************************/
/* START of Marshal */
#include <x10/io/Marshal.h>

::x10aux::RuntimeType x10::io::Marshal<void>::rtt;
::x10::io::Marshal__BooleanMarshal* x10::io::Marshal<void>::FMGL(BOOLEAN);
void x10::io::Marshal<void>::FMGL(BOOLEAN__do_init)() {
    FMGL(BOOLEAN__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::io::Marshal<void>.BOOLEAN");
    ::x10::io::Marshal__BooleanMarshal* __var493__ = ::x10::io::Marshal__BooleanMarshal::_make();
    FMGL(BOOLEAN) = __var493__;
    FMGL(BOOLEAN__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::io::Marshal<void>::FMGL(BOOLEAN__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(BOOLEAN__status), &FMGL(BOOLEAN__do_init), &FMGL(BOOLEAN__exception), "x10::io::Marshal<void>.BOOLEAN");
    
}
volatile ::x10aux::StaticInitController::status x10::io::Marshal<void>::FMGL(BOOLEAN__status);
::x10::lang::CheckedThrowable* x10::io::Marshal<void>::FMGL(BOOLEAN__exception);
::x10::io::Marshal__ByteMarshal* x10::io::Marshal<void>::FMGL(BYTE);
void x10::io::Marshal<void>::FMGL(BYTE__do_init)() {
    FMGL(BYTE__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::io::Marshal<void>.BYTE");
    ::x10::io::Marshal__ByteMarshal* __var494__ = ::x10::io::Marshal__ByteMarshal::_make();
    FMGL(BYTE) = __var494__;
    FMGL(BYTE__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::io::Marshal<void>::FMGL(BYTE__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(BYTE__status), &FMGL(BYTE__do_init), &FMGL(BYTE__exception), "x10::io::Marshal<void>.BYTE");
    
}
volatile ::x10aux::StaticInitController::status x10::io::Marshal<void>::FMGL(BYTE__status);
::x10::lang::CheckedThrowable* x10::io::Marshal<void>::FMGL(BYTE__exception);
::x10::io::Marshal__UByteMarshal* x10::io::Marshal<void>::FMGL(UBYTE);
void x10::io::Marshal<void>::FMGL(UBYTE__do_init)() {
    FMGL(UBYTE__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::io::Marshal<void>.UBYTE");
    ::x10::io::Marshal__UByteMarshal* __var495__ = ::x10::io::Marshal__UByteMarshal::_make();
    FMGL(UBYTE) = __var495__;
    FMGL(UBYTE__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::io::Marshal<void>::FMGL(UBYTE__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(UBYTE__status), &FMGL(UBYTE__do_init), &FMGL(UBYTE__exception), "x10::io::Marshal<void>.UBYTE");
    
}
volatile ::x10aux::StaticInitController::status x10::io::Marshal<void>::FMGL(UBYTE__status);
::x10::lang::CheckedThrowable* x10::io::Marshal<void>::FMGL(UBYTE__exception);
::x10::io::Marshal__CharMarshal* x10::io::Marshal<void>::FMGL(CHAR);
void x10::io::Marshal<void>::FMGL(CHAR__do_init)() {
    FMGL(CHAR__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::io::Marshal<void>.CHAR");
    ::x10::io::Marshal__CharMarshal* __var496__ = ::x10::io::Marshal__CharMarshal::_make();
    FMGL(CHAR) = __var496__;
    FMGL(CHAR__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::io::Marshal<void>::FMGL(CHAR__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(CHAR__status), &FMGL(CHAR__do_init), &FMGL(CHAR__exception), "x10::io::Marshal<void>.CHAR");
    
}
volatile ::x10aux::StaticInitController::status x10::io::Marshal<void>::FMGL(CHAR__status);
::x10::lang::CheckedThrowable* x10::io::Marshal<void>::FMGL(CHAR__exception);
::x10::io::Marshal__ShortMarshal* x10::io::Marshal<void>::FMGL(SHORT);
void x10::io::Marshal<void>::FMGL(SHORT__do_init)() {
    FMGL(SHORT__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::io::Marshal<void>.SHORT");
    ::x10::io::Marshal__ShortMarshal* __var497__ = ::x10::io::Marshal__ShortMarshal::_make();
    FMGL(SHORT) = __var497__;
    FMGL(SHORT__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::io::Marshal<void>::FMGL(SHORT__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(SHORT__status), &FMGL(SHORT__do_init), &FMGL(SHORT__exception), "x10::io::Marshal<void>.SHORT");
    
}
volatile ::x10aux::StaticInitController::status x10::io::Marshal<void>::FMGL(SHORT__status);
::x10::lang::CheckedThrowable* x10::io::Marshal<void>::FMGL(SHORT__exception);
::x10::io::Marshal__UShortMarshal* x10::io::Marshal<void>::FMGL(USHORT);
void x10::io::Marshal<void>::FMGL(USHORT__do_init)() {
    FMGL(USHORT__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::io::Marshal<void>.USHORT");
    ::x10::io::Marshal__UShortMarshal* __var498__ = ::x10::io::Marshal__UShortMarshal::_make();
    FMGL(USHORT) = __var498__;
    FMGL(USHORT__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::io::Marshal<void>::FMGL(USHORT__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(USHORT__status), &FMGL(USHORT__do_init), &FMGL(USHORT__exception), "x10::io::Marshal<void>.USHORT");
    
}
volatile ::x10aux::StaticInitController::status x10::io::Marshal<void>::FMGL(USHORT__status);
::x10::lang::CheckedThrowable* x10::io::Marshal<void>::FMGL(USHORT__exception);
::x10::io::Marshal__IntMarshal* x10::io::Marshal<void>::FMGL(INT);
void x10::io::Marshal<void>::FMGL(INT__do_init)() {
    FMGL(INT__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::io::Marshal<void>.INT");
    ::x10::io::Marshal__IntMarshal* __var499__ = ::x10::io::Marshal__IntMarshal::_make();
    FMGL(INT) = __var499__;
    FMGL(INT__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::io::Marshal<void>::FMGL(INT__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(INT__status), &FMGL(INT__do_init), &FMGL(INT__exception), "x10::io::Marshal<void>.INT");
    
}
volatile ::x10aux::StaticInitController::status x10::io::Marshal<void>::FMGL(INT__status);
::x10::lang::CheckedThrowable* x10::io::Marshal<void>::FMGL(INT__exception);
::x10::io::Marshal__UIntMarshal* x10::io::Marshal<void>::FMGL(UINT);
void x10::io::Marshal<void>::FMGL(UINT__do_init)() {
    FMGL(UINT__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::io::Marshal<void>.UINT");
    ::x10::io::Marshal__UIntMarshal* __var500__ = ::x10::io::Marshal__UIntMarshal::_make();
    FMGL(UINT) = __var500__;
    FMGL(UINT__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::io::Marshal<void>::FMGL(UINT__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(UINT__status), &FMGL(UINT__do_init), &FMGL(UINT__exception), "x10::io::Marshal<void>.UINT");
    
}
volatile ::x10aux::StaticInitController::status x10::io::Marshal<void>::FMGL(UINT__status);
::x10::lang::CheckedThrowable* x10::io::Marshal<void>::FMGL(UINT__exception);
::x10::io::Marshal__LongMarshal* x10::io::Marshal<void>::FMGL(LONG);
void x10::io::Marshal<void>::FMGL(LONG__do_init)() {
    FMGL(LONG__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::io::Marshal<void>.LONG");
    ::x10::io::Marshal__LongMarshal* __var501__ = ::x10::io::Marshal__LongMarshal::_make();
    FMGL(LONG) = __var501__;
    FMGL(LONG__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::io::Marshal<void>::FMGL(LONG__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(LONG__status), &FMGL(LONG__do_init), &FMGL(LONG__exception), "x10::io::Marshal<void>.LONG");
    
}
volatile ::x10aux::StaticInitController::status x10::io::Marshal<void>::FMGL(LONG__status);
::x10::lang::CheckedThrowable* x10::io::Marshal<void>::FMGL(LONG__exception);
::x10::io::Marshal__ULongMarshal* x10::io::Marshal<void>::FMGL(ULONG);
void x10::io::Marshal<void>::FMGL(ULONG__do_init)() {
    FMGL(ULONG__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::io::Marshal<void>.ULONG");
    ::x10::io::Marshal__ULongMarshal* __var502__ = ::x10::io::Marshal__ULongMarshal::_make();
    FMGL(ULONG) = __var502__;
    FMGL(ULONG__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::io::Marshal<void>::FMGL(ULONG__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(ULONG__status), &FMGL(ULONG__do_init), &FMGL(ULONG__exception), "x10::io::Marshal<void>.ULONG");
    
}
volatile ::x10aux::StaticInitController::status x10::io::Marshal<void>::FMGL(ULONG__status);
::x10::lang::CheckedThrowable* x10::io::Marshal<void>::FMGL(ULONG__exception);
::x10::io::Marshal__FloatMarshal* x10::io::Marshal<void>::FMGL(FLOAT);
void x10::io::Marshal<void>::FMGL(FLOAT__do_init)() {
    FMGL(FLOAT__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::io::Marshal<void>.FLOAT");
    ::x10::io::Marshal__FloatMarshal* __var503__ = ::x10::io::Marshal__FloatMarshal::_make();
    FMGL(FLOAT) = __var503__;
    FMGL(FLOAT__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::io::Marshal<void>::FMGL(FLOAT__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(FLOAT__status), &FMGL(FLOAT__do_init), &FMGL(FLOAT__exception), "x10::io::Marshal<void>.FLOAT");
    
}
volatile ::x10aux::StaticInitController::status x10::io::Marshal<void>::FMGL(FLOAT__status);
::x10::lang::CheckedThrowable* x10::io::Marshal<void>::FMGL(FLOAT__exception);
::x10::io::Marshal__DoubleMarshal* x10::io::Marshal<void>::FMGL(DOUBLE);
void x10::io::Marshal<void>::FMGL(DOUBLE__do_init)() {
    FMGL(DOUBLE__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::io::Marshal<void>.DOUBLE");
    ::x10::io::Marshal__DoubleMarshal* __var504__ = ::x10::io::Marshal__DoubleMarshal::_make();
    FMGL(DOUBLE) = __var504__;
    FMGL(DOUBLE__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::io::Marshal<void>::FMGL(DOUBLE__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(DOUBLE__status), &FMGL(DOUBLE__do_init), &FMGL(DOUBLE__exception), "x10::io::Marshal<void>.DOUBLE");
    
}
volatile ::x10aux::StaticInitController::status x10::io::Marshal<void>::FMGL(DOUBLE__status);
::x10::lang::CheckedThrowable* x10::io::Marshal<void>::FMGL(DOUBLE__exception);
::x10::io::Marshal__LineMarshal* x10::io::Marshal<void>::FMGL(LINE);
void x10::io::Marshal<void>::FMGL(LINE__do_init)() {
    FMGL(LINE__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::io::Marshal<void>.LINE");
    ::x10::io::Marshal__LineMarshal* __var505__ = ::x10::io::Marshal__LineMarshal::_make();
    FMGL(LINE) = __var505__;
    FMGL(LINE__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::io::Marshal<void>::FMGL(LINE__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(LINE__status), &FMGL(LINE__do_init), &FMGL(LINE__exception), "x10::io::Marshal<void>.LINE");
    
}
volatile ::x10aux::StaticInitController::status x10::io::Marshal<void>::FMGL(LINE__status);
::x10::lang::CheckedThrowable* x10::io::Marshal<void>::FMGL(LINE__exception);

/* END of Marshal */
/*************************************************/
/*************************************************/
/* START of Marshal$LineMarshal */
#include <x10/io/Marshal__LineMarshal.h>

#include <x10/io/Marshal.h>
#include <x10/lang/String.h>
#include <x10/io/Reader.h>
#include <x10/util/GrowableRail.h>
#include <x10/lang/Byte.h>
#include <x10/lang/Char.h>
#include <x10/io/IOException.h>
#include <x10/lang/Long.h>
#include <x10/io/Writer.h>
#include <x10/lang/Rail.h>
#include <x10/compiler/Synthetic.h>
::x10::io::Marshal< ::x10::lang::String*>::itable< ::x10::io::Marshal__LineMarshal >  x10::io::Marshal__LineMarshal::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::io::Marshal__LineMarshal::read, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName, &x10::io::Marshal__LineMarshal::write);
::x10::lang::Any::itable< ::x10::io::Marshal__LineMarshal >  x10::io::Marshal__LineMarshal::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::io::Marshal__LineMarshal::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Marshal< ::x10::lang::String*> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::io::Marshal__LineMarshal")};

//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
::x10::lang::String* x10::io::Marshal__LineMarshal::read(::x10::io::Reader* r) {
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    ::x10::util::GrowableRail<x10_byte>* buf =  (new (::x10aux::alloc_z< ::x10::util::GrowableRail<x10_byte> >()) ::x10::util::GrowableRail<x10_byte>());
    (buf)->::x10::util::GrowableRail<x10_byte>::_constructor(((x10_long)32ll));
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    try {
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        while (true) {
            
            //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            x10_byte b = ::x10aux::nullCheck(r)->read();
            
            //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            if ((::x10aux::struct_equals((x10_char((x10_int)(b))), ((x10_char)'\n'))))
            {
                break;
            }
            
            //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            buf->x10::util::GrowableRail<x10_byte>::add(b);
        }
        
    }
    catch (::x10::lang::CheckedThrowable* __exc507) {
        if (::x10aux::instanceof< ::x10::io::IOException*>(__exc507)) {
            ::x10::io::IOException* e = static_cast< ::x10::io::IOException*>(__exc507);
            {
                
                //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                if ((::x10aux::struct_equals(buf->FMGL(size), ((x10_long)0ll))))
                {
                    
                    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
                    ::x10aux::throwException(::x10aux::nullCheck(e));
                }
                
            }
        } else
        throw;
    }
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    return ::x10::lang::String::_make(buf);
    
}

//#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
void x10::io::Marshal__LineMarshal::write(::x10::io::Writer* w, ::x10::lang::String* s) {
    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    ::x10aux::nullCheck(w)->write(::x10aux::nullCheck(s)->x10::lang::String::bytes());
}

//#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
::x10::io::Marshal__LineMarshal* x10::io::Marshal__LineMarshal::x10__io__Marshal__LineMarshal____this__x10__io__Marshal__LineMarshal(
  ) {
    return this;
    
}
void x10::io::Marshal__LineMarshal::_constructor() {
    ::x10::io::Marshal__LineMarshal* this__87687 = this;
    
}
::x10::io::Marshal__LineMarshal* x10::io::Marshal__LineMarshal::_make(
  ) {
    ::x10::io::Marshal__LineMarshal* this_ = new (::x10aux::alloc_z< ::x10::io::Marshal__LineMarshal>()) ::x10::io::Marshal__LineMarshal();
    this_->_constructor();
    return this_;
}


void x10::io::Marshal__LineMarshal::__fieldInitializers_x10_io_Marshal_LineMarshal(
  ) {
 
}
const ::x10aux::serialization_id_t x10::io::Marshal__LineMarshal::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::io::Marshal__LineMarshal::_deserializer);

void x10::io::Marshal__LineMarshal::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::io::Marshal__LineMarshal::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::io::Marshal__LineMarshal* this_ = new (::x10aux::alloc_z< ::x10::io::Marshal__LineMarshal>()) ::x10::io::Marshal__LineMarshal();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::io::Marshal__LineMarshal::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::io::Marshal__LineMarshal::rtt;
void x10::io::Marshal__LineMarshal::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::io::Marshal< ::x10::lang::String*> >()};
    rtt.initStageTwo("x10.io.Marshal.LineMarshal",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of Marshal$LineMarshal */
/*************************************************/
/*************************************************/
/* START of Marshal$BooleanMarshal */
#include <x10/io/Marshal__BooleanMarshal.h>

#include <x10/io/Marshal.h>
#include <x10/lang/Boolean.h>
#include <x10/io/Reader.h>
#include <x10/lang/Byte.h>
#include <x10/io/Writer.h>
#include <x10/compiler/Synthetic.h>
::x10::io::Marshal<x10_boolean>::itable< ::x10::io::Marshal__BooleanMarshal >  x10::io::Marshal__BooleanMarshal::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::io::Marshal__BooleanMarshal::read, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName, &x10::io::Marshal__BooleanMarshal::write);
::x10::lang::Any::itable< ::x10::io::Marshal__BooleanMarshal >  x10::io::Marshal__BooleanMarshal::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::io::Marshal__BooleanMarshal::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Marshal<x10_boolean> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::io::Marshal__BooleanMarshal")};

//#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
x10_boolean x10::io::Marshal__BooleanMarshal::read(::x10::io::Reader* r) {
    return (!::x10aux::struct_equals(::x10aux::nullCheck(r)->read(), ((x10_byte)0)));
    
}

//#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
void x10::io::Marshal__BooleanMarshal::write(::x10::io::Writer* w, x10_boolean b) {
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    ::x10aux::nullCheck(w)->write(((x10_byte) (b ? (((x10_long)0ll)) : (((x10_long)1ll)))));
}

//#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
::x10::io::Marshal__BooleanMarshal* x10::io::Marshal__BooleanMarshal::x10__io__Marshal__BooleanMarshal____this__x10__io__Marshal__BooleanMarshal(
  ) {
    return this;
    
}
void x10::io::Marshal__BooleanMarshal::_constructor() {
    ::x10::io::Marshal__BooleanMarshal* this__87688 = this;
    
}
::x10::io::Marshal__BooleanMarshal* x10::io::Marshal__BooleanMarshal::_make(
  ) {
    ::x10::io::Marshal__BooleanMarshal* this_ = new (::x10aux::alloc_z< ::x10::io::Marshal__BooleanMarshal>()) ::x10::io::Marshal__BooleanMarshal();
    this_->_constructor();
    return this_;
}


void x10::io::Marshal__BooleanMarshal::__fieldInitializers_x10_io_Marshal_BooleanMarshal(
  ) {
 
}
const ::x10aux::serialization_id_t x10::io::Marshal__BooleanMarshal::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::io::Marshal__BooleanMarshal::_deserializer);

void x10::io::Marshal__BooleanMarshal::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::io::Marshal__BooleanMarshal::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::io::Marshal__BooleanMarshal* this_ = new (::x10aux::alloc_z< ::x10::io::Marshal__BooleanMarshal>()) ::x10::io::Marshal__BooleanMarshal();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::io::Marshal__BooleanMarshal::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::io::Marshal__BooleanMarshal::rtt;
void x10::io::Marshal__BooleanMarshal::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::io::Marshal<x10_boolean> >()};
    rtt.initStageTwo("x10.io.Marshal.BooleanMarshal",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of Marshal$BooleanMarshal */
/*************************************************/
/*************************************************/
/* START of Marshal$ByteMarshal */
#include <x10/io/Marshal__ByteMarshal.h>

#include <x10/io/Marshal.h>
#include <x10/lang/Byte.h>
#include <x10/io/Reader.h>
#include <x10/io/Writer.h>
#include <x10/compiler/Synthetic.h>
::x10::io::Marshal<x10_byte>::itable< ::x10::io::Marshal__ByteMarshal >  x10::io::Marshal__ByteMarshal::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::io::Marshal__ByteMarshal::read, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName, &x10::io::Marshal__ByteMarshal::write);
::x10::lang::Any::itable< ::x10::io::Marshal__ByteMarshal >  x10::io::Marshal__ByteMarshal::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::io::Marshal__ByteMarshal::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Marshal<x10_byte> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::io::Marshal__ByteMarshal")};

//#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
x10_byte x10::io::Marshal__ByteMarshal::read(::x10::io::Reader* r) {
    return ::x10aux::nullCheck(r)->read();
    
}

//#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
void x10::io::Marshal__ByteMarshal::write(::x10::io::Writer* w, x10_byte b) {
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    ::x10aux::nullCheck(w)->write(b);
}

//#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
::x10::io::Marshal__ByteMarshal* x10::io::Marshal__ByteMarshal::x10__io__Marshal__ByteMarshal____this__x10__io__Marshal__ByteMarshal(
  ) {
    return this;
    
}
void x10::io::Marshal__ByteMarshal::_constructor() {
    ::x10::io::Marshal__ByteMarshal* this__87689 = this;
    
}
::x10::io::Marshal__ByteMarshal* x10::io::Marshal__ByteMarshal::_make(
  ) {
    ::x10::io::Marshal__ByteMarshal* this_ = new (::x10aux::alloc_z< ::x10::io::Marshal__ByteMarshal>()) ::x10::io::Marshal__ByteMarshal();
    this_->_constructor();
    return this_;
}


void x10::io::Marshal__ByteMarshal::__fieldInitializers_x10_io_Marshal_ByteMarshal(
  ) {
 
}
const ::x10aux::serialization_id_t x10::io::Marshal__ByteMarshal::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::io::Marshal__ByteMarshal::_deserializer);

void x10::io::Marshal__ByteMarshal::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::io::Marshal__ByteMarshal::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::io::Marshal__ByteMarshal* this_ = new (::x10aux::alloc_z< ::x10::io::Marshal__ByteMarshal>()) ::x10::io::Marshal__ByteMarshal();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::io::Marshal__ByteMarshal::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::io::Marshal__ByteMarshal::rtt;
void x10::io::Marshal__ByteMarshal::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::io::Marshal<x10_byte> >()};
    rtt.initStageTwo("x10.io.Marshal.ByteMarshal",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of Marshal$ByteMarshal */
/*************************************************/
/*************************************************/
/* START of Marshal$UByteMarshal */
#include <x10/io/Marshal__UByteMarshal.h>

#include <x10/io/Marshal.h>
#include <x10/lang/UByte.h>
#include <x10/io/Reader.h>
#include <x10/lang/Byte.h>
#include <x10/io/Writer.h>
#include <x10/compiler/Synthetic.h>
::x10::io::Marshal<x10_ubyte>::itable< ::x10::io::Marshal__UByteMarshal >  x10::io::Marshal__UByteMarshal::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::io::Marshal__UByteMarshal::read, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName, &x10::io::Marshal__UByteMarshal::write);
::x10::lang::Any::itable< ::x10::io::Marshal__UByteMarshal >  x10::io::Marshal__UByteMarshal::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::io::Marshal__UByteMarshal::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Marshal<x10_ubyte> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::io::Marshal__UByteMarshal")};

//#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
x10_ubyte x10::io::Marshal__UByteMarshal::read(::x10::io::Reader* r) {
    return ((x10_ubyte) (::x10aux::nullCheck(r)->readByte()));
    
}

//#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
void x10::io::Marshal__UByteMarshal::write(::x10::io::Writer* w, x10_ubyte ub) {
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    ::x10aux::nullCheck(w)->write(((x10_byte) (ub)));
}

//#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
::x10::io::Marshal__UByteMarshal* x10::io::Marshal__UByteMarshal::x10__io__Marshal__UByteMarshal____this__x10__io__Marshal__UByteMarshal(
  ) {
    return this;
    
}
void x10::io::Marshal__UByteMarshal::_constructor() {
    ::x10::io::Marshal__UByteMarshal* this__87690 = this;
    
}
::x10::io::Marshal__UByteMarshal* x10::io::Marshal__UByteMarshal::_make(
  ) {
    ::x10::io::Marshal__UByteMarshal* this_ = new (::x10aux::alloc_z< ::x10::io::Marshal__UByteMarshal>()) ::x10::io::Marshal__UByteMarshal();
    this_->_constructor();
    return this_;
}


void x10::io::Marshal__UByteMarshal::__fieldInitializers_x10_io_Marshal_UByteMarshal(
  ) {
 
}
const ::x10aux::serialization_id_t x10::io::Marshal__UByteMarshal::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::io::Marshal__UByteMarshal::_deserializer);

void x10::io::Marshal__UByteMarshal::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::io::Marshal__UByteMarshal::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::io::Marshal__UByteMarshal* this_ = new (::x10aux::alloc_z< ::x10::io::Marshal__UByteMarshal>()) ::x10::io::Marshal__UByteMarshal();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::io::Marshal__UByteMarshal::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::io::Marshal__UByteMarshal::rtt;
void x10::io::Marshal__UByteMarshal::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::io::Marshal<x10_ubyte> >()};
    rtt.initStageTwo("x10.io.Marshal.UByteMarshal",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of Marshal$UByteMarshal */
/*************************************************/
/*************************************************/
/* START of Marshal$CharMarshal */
#include <x10/io/Marshal__CharMarshal.h>

#include <x10/io/Marshal.h>
#include <x10/lang/Char.h>
#include <x10/io/Reader.h>
#include <x10/lang/Byte.h>
#include <x10/io/EOFException.h>
#include <x10/lang/Long.h>
#include <x10/lang/Int.h>
#include <x10/io/Writer.h>
#include <x10/compiler/Synthetic.h>
::x10::io::Marshal<x10_char>::itable< ::x10::io::Marshal__CharMarshal >  x10::io::Marshal__CharMarshal::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::io::Marshal__CharMarshal::read, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName, &x10::io::Marshal__CharMarshal::write);
::x10::lang::Any::itable< ::x10::io::Marshal__CharMarshal >  x10::io::Marshal__CharMarshal::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::io::Marshal__CharMarshal::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Marshal<x10_char> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::io::Marshal__CharMarshal")};

//#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
x10_char x10::io::Marshal__CharMarshal::read(::x10::io::Reader* r) {
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    x10_byte b1 = ::x10aux::nullCheck(r)->read();
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    if ((::x10aux::struct_equals(b1, ((x10_byte)-1)))) {
        ::x10aux::throwException(::x10aux::nullCheck(::x10::io::EOFException::_make()));
    }
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    if ((::x10aux::struct_equals(((((x10_long)(b1))) & (((x10_long)248ll))),
                                 ((x10_long)240ll)))) {
        
        //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        x10_byte b2 = ::x10aux::nullCheck(r)->read();
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        x10_byte b3 = ::x10aux::nullCheck(r)->read();
        
        //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        x10_byte b4 = ::x10aux::nullCheck(r)->read();
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        return (x10_char(((((((((((((x10_int) (b1))) & (((x10_int)3)))) << (0x1f & (x10_int)(((x10_long)(((x10_int)18))))))) | (((((((x10_int) (b2))) & (((x10_int)63)))) << (0x1f & (x10_int)(((x10_long)(((x10_int)12))))))))) | (((((((x10_int) (b3))) & (((x10_int)63)))) << (0x1f & (x10_int)(((x10_long)(((x10_int)6))))))))) | (((((x10_int) (b4))) & (((x10_int)63)))))));
        
    }
    
    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    if ((::x10aux::struct_equals(((((x10_long)(b1))) & (((x10_long)240ll))),
                                 ((x10_long)224ll)))) {
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        x10_byte b2 = ::x10aux::nullCheck(r)->read();
        
        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        x10_byte b3 = ::x10aux::nullCheck(r)->read();
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        return (x10_char(((((((((((x10_int) (b1))) & (((x10_int)31)))) << (0x1f & (x10_int)(((x10_long)(((x10_int)12))))))) | (((((((x10_int) (b2))) & (((x10_int)63)))) << (0x1f & (x10_int)(((x10_long)(((x10_int)6))))))))) | (((((x10_int) (b3))) & (((x10_int)63)))))));
        
    }
    
    //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    if ((::x10aux::struct_equals(((((x10_long)(b1))) & (((x10_long)224ll))),
                                 ((x10_long)192ll)))) {
        
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        x10_byte b2 = ::x10aux::nullCheck(r)->read();
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        return (x10_char(((((((((x10_int) (b1))) & (((x10_int)31)))) << (0x1f & (x10_int)(((x10_long)(((x10_int)6))))))) | (((((x10_int) (b2))) & (((x10_int)63)))))));
        
    }
    
    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    return (x10_char(((x10_int) (b1))));
    
}

//#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
void x10::io::Marshal__CharMarshal::write(::x10::io::Writer* w, x10_char c) {
    
    //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    x10_int i = ((x10_int) (c).v);
    
    //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    if ((::x10aux::struct_equals(((((x10_long)(i))) & (((x10_long)4294967168ll))),
                                 ((x10_long)0ll)))) {
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        ::x10aux::nullCheck(w)->write(((x10_byte) (i)));
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        return;
    }
    
    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    if ((::x10aux::struct_equals(((((x10_long)(i))) & (((x10_long)4294965248ll))),
                                 ((x10_long)0ll)))) {
        
        //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        ::x10aux::nullCheck(w)->write(((x10_byte) (((((((x10_long)(((i) >> (0x1f & (x10_int)(((x10_long)(((x10_int)6))))))))) & (((x10_long)31ll)))) | (((x10_long)192ll))))));
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        ::x10aux::nullCheck(w)->write(((x10_byte) (((((((x10_long)(i))) & (((x10_long)63ll)))) | (((x10_long)128ll))))));
        
        //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        return;
    }
    
    //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    if ((::x10aux::struct_equals(((((x10_long)(i))) & (((x10_long)4294901760ll))),
                                 ((x10_long)0ll)))) {
        
        //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        ::x10aux::nullCheck(w)->write(((x10_byte) (((((((x10_long)(((i) >> (0x1f & (x10_int)(((x10_long)(((x10_int)12))))))))) & (((x10_long)15ll)))) | (((x10_long)224ll))))));
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        ::x10aux::nullCheck(w)->write(((x10_byte) (((((((x10_long)(((i) >> (0x1f & (x10_int)(((x10_long)(((x10_int)6))))))))) & (((x10_long)63ll)))) | (((x10_long)128ll))))));
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        ::x10aux::nullCheck(w)->write(((x10_byte) (((((((x10_long)(i))) & (((x10_long)63ll)))) | (((x10_long)128ll))))));
        
        //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        return;
    }
    
    //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    if ((::x10aux::struct_equals(((((x10_long)(i))) & (((x10_long)4292870144ll))),
                                 ((x10_long)0ll)))) {
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        ::x10aux::nullCheck(w)->write(((x10_byte) (((((((x10_long)(((i) >> (0x1f & (x10_int)(((x10_long)(((x10_int)18))))))))) & (((x10_long)7ll)))) | (((x10_long)240ll))))));
        
        //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        ::x10aux::nullCheck(w)->write(((x10_byte) (((((((x10_long)(((i) >> (0x1f & (x10_int)(((x10_long)(((x10_int)12))))))))) & (((x10_long)63ll)))) | (((x10_long)128ll))))));
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        ::x10aux::nullCheck(w)->write(((x10_byte) (((((((x10_long)(((i) >> (0x1f & (x10_int)(((x10_long)(((x10_int)6))))))))) & (((x10_long)63ll)))) | (((x10_long)128ll))))));
        
        //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        ::x10aux::nullCheck(w)->write(((x10_byte) (((((((x10_long)(i))) & (((x10_long)63ll)))) | (((x10_long)128ll))))));
        
        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        return;
    }
    
}

//#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
::x10::io::Marshal__CharMarshal* x10::io::Marshal__CharMarshal::x10__io__Marshal__CharMarshal____this__x10__io__Marshal__CharMarshal(
  ) {
    return this;
    
}
void x10::io::Marshal__CharMarshal::_constructor() {
    ::x10::io::Marshal__CharMarshal* this__87691 = this;
    
}
::x10::io::Marshal__CharMarshal* x10::io::Marshal__CharMarshal::_make(
  ) {
    ::x10::io::Marshal__CharMarshal* this_ = new (::x10aux::alloc_z< ::x10::io::Marshal__CharMarshal>()) ::x10::io::Marshal__CharMarshal();
    this_->_constructor();
    return this_;
}


void x10::io::Marshal__CharMarshal::__fieldInitializers_x10_io_Marshal_CharMarshal(
  ) {
 
}
const ::x10aux::serialization_id_t x10::io::Marshal__CharMarshal::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::io::Marshal__CharMarshal::_deserializer);

void x10::io::Marshal__CharMarshal::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::io::Marshal__CharMarshal::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::io::Marshal__CharMarshal* this_ = new (::x10aux::alloc_z< ::x10::io::Marshal__CharMarshal>()) ::x10::io::Marshal__CharMarshal();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::io::Marshal__CharMarshal::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::io::Marshal__CharMarshal::rtt;
void x10::io::Marshal__CharMarshal::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::io::Marshal<x10_char> >()};
    rtt.initStageTwo("x10.io.Marshal.CharMarshal",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of Marshal$CharMarshal */
/*************************************************/
/*************************************************/
/* START of Marshal$ShortMarshal */
#include <x10/io/Marshal__ShortMarshal.h>

#include <x10/io/Marshal.h>
#include <x10/lang/Short.h>
#include <x10/io/Reader.h>
#include <x10/lang/Byte.h>
#include <x10/lang/Int.h>
#include <x10/lang/Long.h>
#include <x10/io/Writer.h>
#include <x10/compiler/Synthetic.h>
::x10::io::Marshal<x10_short>::itable< ::x10::io::Marshal__ShortMarshal >  x10::io::Marshal__ShortMarshal::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::io::Marshal__ShortMarshal::read, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName, &x10::io::Marshal__ShortMarshal::write);
::x10::lang::Any::itable< ::x10::io::Marshal__ShortMarshal >  x10::io::Marshal__ShortMarshal::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::io::Marshal__ShortMarshal::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Marshal<x10_short> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::io::Marshal__ShortMarshal")};

//#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
x10_short x10::io::Marshal__ShortMarshal::read(::x10::io::Reader* r) {
    
    //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    x10_byte b1 = ::x10aux::nullCheck(r)->read();
    
    //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    x10_byte b2 = ::x10aux::nullCheck(r)->read();
    
    //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    return ((x10_short) (((((((((x10_int) (b1))) & (((x10_int)255)))) << (0x1f & (x10_int)(((x10_long)(((x10_int)8))))))) | (((((x10_int) (b2))) & (((x10_int)255)))))));
    
}

//#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
void x10::io::Marshal__ShortMarshal::write(::x10::io::Writer* w, x10_short s) {
    
    //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    x10_int i = ((x10_int) (s));
    
    //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    x10_byte b1 = ((x10_byte) (((i) >> (0x1f & (x10_int)(((x10_long)(((x10_int)8))))))));
    
    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    x10_byte b2 = ((x10_byte) (i));
    
    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    ::x10aux::nullCheck(w)->write(b1);
    
    //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    ::x10aux::nullCheck(w)->write(b2);
}

//#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
::x10::io::Marshal__ShortMarshal* x10::io::Marshal__ShortMarshal::x10__io__Marshal__ShortMarshal____this__x10__io__Marshal__ShortMarshal(
  ) {
    return this;
    
}
void x10::io::Marshal__ShortMarshal::_constructor() {
    ::x10::io::Marshal__ShortMarshal* this__87692 = this;
    
}
::x10::io::Marshal__ShortMarshal* x10::io::Marshal__ShortMarshal::_make(
  ) {
    ::x10::io::Marshal__ShortMarshal* this_ = new (::x10aux::alloc_z< ::x10::io::Marshal__ShortMarshal>()) ::x10::io::Marshal__ShortMarshal();
    this_->_constructor();
    return this_;
}


void x10::io::Marshal__ShortMarshal::__fieldInitializers_x10_io_Marshal_ShortMarshal(
  ) {
 
}
const ::x10aux::serialization_id_t x10::io::Marshal__ShortMarshal::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::io::Marshal__ShortMarshal::_deserializer);

void x10::io::Marshal__ShortMarshal::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::io::Marshal__ShortMarshal::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::io::Marshal__ShortMarshal* this_ = new (::x10aux::alloc_z< ::x10::io::Marshal__ShortMarshal>()) ::x10::io::Marshal__ShortMarshal();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::io::Marshal__ShortMarshal::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::io::Marshal__ShortMarshal::rtt;
void x10::io::Marshal__ShortMarshal::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::io::Marshal<x10_short> >()};
    rtt.initStageTwo("x10.io.Marshal.ShortMarshal",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of Marshal$ShortMarshal */
/*************************************************/
/*************************************************/
/* START of Marshal$UShortMarshal */
#include <x10/io/Marshal__UShortMarshal.h>

#include <x10/io/Marshal.h>
#include <x10/lang/UShort.h>
#include <x10/io/Reader.h>
#include <x10/lang/Short.h>
#include <x10/io/Writer.h>
#include <x10/compiler/Synthetic.h>
::x10::io::Marshal<x10_ushort>::itable< ::x10::io::Marshal__UShortMarshal >  x10::io::Marshal__UShortMarshal::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::io::Marshal__UShortMarshal::read, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName, &x10::io::Marshal__UShortMarshal::write);
::x10::lang::Any::itable< ::x10::io::Marshal__UShortMarshal >  x10::io::Marshal__UShortMarshal::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::io::Marshal__UShortMarshal::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Marshal<x10_ushort> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::io::Marshal__UShortMarshal")};

//#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
x10_ushort x10::io::Marshal__UShortMarshal::read(::x10::io::Reader* r) {
    return ((x10_ushort) (::x10aux::nullCheck(r)->readShort()));
    
}

//#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
void x10::io::Marshal__UShortMarshal::write(::x10::io::Writer* w, x10_ushort us) {
    
    //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    ::x10aux::nullCheck(w)->writeShort(((x10_short) (us)));
}

//#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
::x10::io::Marshal__UShortMarshal* x10::io::Marshal__UShortMarshal::x10__io__Marshal__UShortMarshal____this__x10__io__Marshal__UShortMarshal(
  ) {
    return this;
    
}
void x10::io::Marshal__UShortMarshal::_constructor() {
    ::x10::io::Marshal__UShortMarshal* this__87693 = this;
    
}
::x10::io::Marshal__UShortMarshal* x10::io::Marshal__UShortMarshal::_make(
  ) {
    ::x10::io::Marshal__UShortMarshal* this_ = new (::x10aux::alloc_z< ::x10::io::Marshal__UShortMarshal>()) ::x10::io::Marshal__UShortMarshal();
    this_->_constructor();
    return this_;
}


void x10::io::Marshal__UShortMarshal::__fieldInitializers_x10_io_Marshal_UShortMarshal(
  ) {
 
}
const ::x10aux::serialization_id_t x10::io::Marshal__UShortMarshal::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::io::Marshal__UShortMarshal::_deserializer);

void x10::io::Marshal__UShortMarshal::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::io::Marshal__UShortMarshal::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::io::Marshal__UShortMarshal* this_ = new (::x10aux::alloc_z< ::x10::io::Marshal__UShortMarshal>()) ::x10::io::Marshal__UShortMarshal();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::io::Marshal__UShortMarshal::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::io::Marshal__UShortMarshal::rtt;
void x10::io::Marshal__UShortMarshal::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::io::Marshal<x10_ushort> >()};
    rtt.initStageTwo("x10.io.Marshal.UShortMarshal",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of Marshal$UShortMarshal */
/*************************************************/
/*************************************************/
/* START of Marshal$IntMarshal */
#include <x10/io/Marshal__IntMarshal.h>

#include <x10/io/Marshal.h>
#include <x10/lang/Int.h>
#include <x10/io/Reader.h>
#include <x10/lang/Byte.h>
#include <x10/lang/Long.h>
#include <x10/io/Writer.h>
#include <x10/compiler/Synthetic.h>
::x10::io::Marshal<x10_int>::itable< ::x10::io::Marshal__IntMarshal >  x10::io::Marshal__IntMarshal::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::io::Marshal__IntMarshal::read, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName, &x10::io::Marshal__IntMarshal::write);
::x10::lang::Any::itable< ::x10::io::Marshal__IntMarshal >  x10::io::Marshal__IntMarshal::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::io::Marshal__IntMarshal::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Marshal<x10_int> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::io::Marshal__IntMarshal")};

//#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
x10_int x10::io::Marshal__IntMarshal::read(::x10::io::Reader* r) {
    
    //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    x10_byte b1 = ::x10aux::nullCheck(r)->read();
    
    //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    x10_byte b2 = ::x10aux::nullCheck(r)->read();
    
    //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    x10_byte b3 = ::x10aux::nullCheck(r)->read();
    
    //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    x10_byte b4 = ::x10aux::nullCheck(r)->read();
    
    //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    return ((((((((((((x10_int) (b1))) & (((x10_int)255)))) << (0x1f & (x10_int)(((x10_long)(((x10_int)24))))))) | (((((((x10_int) (b2))) & (((x10_int)255)))) << (0x1f & (x10_int)(((x10_long)(((x10_int)16))))))))) | (((((((x10_int) (b3))) & (((x10_int)255)))) << (0x1f & (x10_int)(((x10_long)(((x10_int)8))))))))) | (((((x10_int) (b4))) & (((x10_int)255)))));
    
}

//#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
void x10::io::Marshal__IntMarshal::write(::x10::io::Writer* w, x10_int i) {
    
    //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    x10_byte b1 = ((x10_byte) (((i) >> (0x1f & (x10_int)(((x10_long)(((x10_int)24))))))));
    
    //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    x10_byte b2 = ((x10_byte) (((i) >> (0x1f & (x10_int)(((x10_long)(((x10_int)16))))))));
    
    //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    x10_byte b3 = ((x10_byte) (((i) >> (0x1f & (x10_int)(((x10_long)(((x10_int)8))))))));
    
    //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    x10_byte b4 = ((x10_byte) (i));
    
    //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    ::x10aux::nullCheck(w)->write(b1);
    
    //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    ::x10aux::nullCheck(w)->write(b2);
    
    //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    ::x10aux::nullCheck(w)->write(b3);
    
    //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    ::x10aux::nullCheck(w)->write(b4);
}

//#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
::x10::io::Marshal__IntMarshal* x10::io::Marshal__IntMarshal::x10__io__Marshal__IntMarshal____this__x10__io__Marshal__IntMarshal(
  ) {
    return this;
    
}
void x10::io::Marshal__IntMarshal::_constructor() {
    ::x10::io::Marshal__IntMarshal* this__87694 = this;
    
}
::x10::io::Marshal__IntMarshal* x10::io::Marshal__IntMarshal::_make(
  ) {
    ::x10::io::Marshal__IntMarshal* this_ = new (::x10aux::alloc_z< ::x10::io::Marshal__IntMarshal>()) ::x10::io::Marshal__IntMarshal();
    this_->_constructor();
    return this_;
}


void x10::io::Marshal__IntMarshal::__fieldInitializers_x10_io_Marshal_IntMarshal(
  ) {
 
}
const ::x10aux::serialization_id_t x10::io::Marshal__IntMarshal::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::io::Marshal__IntMarshal::_deserializer);

void x10::io::Marshal__IntMarshal::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::io::Marshal__IntMarshal::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::io::Marshal__IntMarshal* this_ = new (::x10aux::alloc_z< ::x10::io::Marshal__IntMarshal>()) ::x10::io::Marshal__IntMarshal();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::io::Marshal__IntMarshal::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::io::Marshal__IntMarshal::rtt;
void x10::io::Marshal__IntMarshal::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::io::Marshal<x10_int> >()};
    rtt.initStageTwo("x10.io.Marshal.IntMarshal",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of Marshal$IntMarshal */
/*************************************************/
/*************************************************/
/* START of Marshal$UIntMarshal */
#include <x10/io/Marshal__UIntMarshal.h>

#include <x10/io/Marshal.h>
#include <x10/lang/UInt.h>
#include <x10/io/Reader.h>
#include <x10/lang/Int.h>
#include <x10/io/Writer.h>
#include <x10/compiler/Synthetic.h>
::x10::io::Marshal<x10_uint>::itable< ::x10::io::Marshal__UIntMarshal >  x10::io::Marshal__UIntMarshal::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::io::Marshal__UIntMarshal::read, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName, &x10::io::Marshal__UIntMarshal::write);
::x10::lang::Any::itable< ::x10::io::Marshal__UIntMarshal >  x10::io::Marshal__UIntMarshal::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::io::Marshal__UIntMarshal::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Marshal<x10_uint> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::io::Marshal__UIntMarshal")};

//#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
x10_uint x10::io::Marshal__UIntMarshal::read(::x10::io::Reader* r) {
    return ((x10_uint) (::x10aux::nullCheck(r)->readInt()));
    
}

//#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
void x10::io::Marshal__UIntMarshal::write(::x10::io::Writer* w, x10_uint ui) {
    
    //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    ::x10aux::nullCheck(w)->writeInt(((x10_int)(ui)));
}

//#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
::x10::io::Marshal__UIntMarshal* x10::io::Marshal__UIntMarshal::x10__io__Marshal__UIntMarshal____this__x10__io__Marshal__UIntMarshal(
  ) {
    return this;
    
}
void x10::io::Marshal__UIntMarshal::_constructor() {
    ::x10::io::Marshal__UIntMarshal* this__87695 = this;
    
}
::x10::io::Marshal__UIntMarshal* x10::io::Marshal__UIntMarshal::_make(
  ) {
    ::x10::io::Marshal__UIntMarshal* this_ = new (::x10aux::alloc_z< ::x10::io::Marshal__UIntMarshal>()) ::x10::io::Marshal__UIntMarshal();
    this_->_constructor();
    return this_;
}


void x10::io::Marshal__UIntMarshal::__fieldInitializers_x10_io_Marshal_UIntMarshal(
  ) {
 
}
const ::x10aux::serialization_id_t x10::io::Marshal__UIntMarshal::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::io::Marshal__UIntMarshal::_deserializer);

void x10::io::Marshal__UIntMarshal::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::io::Marshal__UIntMarshal::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::io::Marshal__UIntMarshal* this_ = new (::x10aux::alloc_z< ::x10::io::Marshal__UIntMarshal>()) ::x10::io::Marshal__UIntMarshal();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::io::Marshal__UIntMarshal::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::io::Marshal__UIntMarshal::rtt;
void x10::io::Marshal__UIntMarshal::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::io::Marshal<x10_uint> >()};
    rtt.initStageTwo("x10.io.Marshal.UIntMarshal",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of Marshal$UIntMarshal */
/*************************************************/
/*************************************************/
/* START of Marshal$LongMarshal */
#include <x10/io/Marshal__LongMarshal.h>

#include <x10/io/Marshal.h>
#include <x10/lang/Long.h>
#include <x10/io/Reader.h>
#include <x10/lang/Int.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Byte.h>
#include <x10/io/Writer.h>
#include <x10/compiler/Synthetic.h>
::x10::io::Marshal<x10_long>::itable< ::x10::io::Marshal__LongMarshal >  x10::io::Marshal__LongMarshal::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::io::Marshal__LongMarshal::read, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName, &x10::io::Marshal__LongMarshal::write);
::x10::lang::Any::itable< ::x10::io::Marshal__LongMarshal >  x10::io::Marshal__LongMarshal::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::io::Marshal__LongMarshal::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Marshal<x10_long> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::io::Marshal__LongMarshal")};

//#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
x10_long x10::io::Marshal__LongMarshal::read(::x10::io::Reader* r) {
    
    //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    x10_long l = ((x10_long)0ll);
    
    //#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    {
        x10_int i;
        for (i = ((x10_int)0); ((i) < (((x10_int)8))); i = ((i) + (((x10_int)1))))
        {
            
            //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            x10_byte b = ::x10aux::nullCheck(r)->read();
            
            //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
            l = ((((l) << (0x3f & (x10_int)(((x10_long)(((x10_int)8))))))) | (((x10_long)(((((x10_int) (b))) & (((x10_int)255)))))));
        }
    }
    
    //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    return l;
    
}

//#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
void x10::io::Marshal__LongMarshal::write(::x10::io::Writer* w, x10_long l) {
    
    //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    x10_int shift = ((x10_int)64);
    
    //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    while (((((x10_long)(shift))) > (((x10_long)0ll)))) {
        
        //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        shift = (::x10aux::class_cast_unchecked<x10_int>(((((x10_long)(shift))) - (((x10_long)8ll)))));
        
        //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        x10_byte b = ((x10_byte) (((l) >> (0x3f & (x10_int)(((x10_long)(shift)))))));
        
        //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
        ::x10aux::nullCheck(w)->write(b);
    }
    
}

//#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
::x10::io::Marshal__LongMarshal* x10::io::Marshal__LongMarshal::x10__io__Marshal__LongMarshal____this__x10__io__Marshal__LongMarshal(
  ) {
    return this;
    
}
void x10::io::Marshal__LongMarshal::_constructor() {
    ::x10::io::Marshal__LongMarshal* this__87696 = this;
    
}
::x10::io::Marshal__LongMarshal* x10::io::Marshal__LongMarshal::_make(
  ) {
    ::x10::io::Marshal__LongMarshal* this_ = new (::x10aux::alloc_z< ::x10::io::Marshal__LongMarshal>()) ::x10::io::Marshal__LongMarshal();
    this_->_constructor();
    return this_;
}


void x10::io::Marshal__LongMarshal::__fieldInitializers_x10_io_Marshal_LongMarshal(
  ) {
 
}
const ::x10aux::serialization_id_t x10::io::Marshal__LongMarshal::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::io::Marshal__LongMarshal::_deserializer);

void x10::io::Marshal__LongMarshal::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::io::Marshal__LongMarshal::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::io::Marshal__LongMarshal* this_ = new (::x10aux::alloc_z< ::x10::io::Marshal__LongMarshal>()) ::x10::io::Marshal__LongMarshal();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::io::Marshal__LongMarshal::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::io::Marshal__LongMarshal::rtt;
void x10::io::Marshal__LongMarshal::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::io::Marshal<x10_long> >()};
    rtt.initStageTwo("x10.io.Marshal.LongMarshal",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of Marshal$LongMarshal */
/*************************************************/
/*************************************************/
/* START of Marshal$ULongMarshal */
#include <x10/io/Marshal__ULongMarshal.h>

#include <x10/io/Marshal.h>
#include <x10/lang/ULong.h>
#include <x10/io/Reader.h>
#include <x10/lang/Long.h>
#include <x10/io/Writer.h>
#include <x10/compiler/Synthetic.h>
::x10::io::Marshal<x10_ulong>::itable< ::x10::io::Marshal__ULongMarshal >  x10::io::Marshal__ULongMarshal::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::io::Marshal__ULongMarshal::read, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName, &x10::io::Marshal__ULongMarshal::write);
::x10::lang::Any::itable< ::x10::io::Marshal__ULongMarshal >  x10::io::Marshal__ULongMarshal::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::io::Marshal__ULongMarshal::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Marshal<x10_ulong> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::io::Marshal__ULongMarshal")};

//#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
x10_ulong x10::io::Marshal__ULongMarshal::read(::x10::io::Reader* r) {
    return ((x10_ulong) (::x10aux::nullCheck(r)->readLong()));
    
}

//#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
void x10::io::Marshal__ULongMarshal::write(::x10::io::Writer* w, x10_ulong ul) {
    
    //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    ::x10aux::nullCheck(w)->writeLong(((x10_long)(ul)));
}

//#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
::x10::io::Marshal__ULongMarshal* x10::io::Marshal__ULongMarshal::x10__io__Marshal__ULongMarshal____this__x10__io__Marshal__ULongMarshal(
  ) {
    return this;
    
}
void x10::io::Marshal__ULongMarshal::_constructor() {
    ::x10::io::Marshal__ULongMarshal* this__87697 = this;
    
}
::x10::io::Marshal__ULongMarshal* x10::io::Marshal__ULongMarshal::_make(
  ) {
    ::x10::io::Marshal__ULongMarshal* this_ = new (::x10aux::alloc_z< ::x10::io::Marshal__ULongMarshal>()) ::x10::io::Marshal__ULongMarshal();
    this_->_constructor();
    return this_;
}


void x10::io::Marshal__ULongMarshal::__fieldInitializers_x10_io_Marshal_ULongMarshal(
  ) {
 
}
const ::x10aux::serialization_id_t x10::io::Marshal__ULongMarshal::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::io::Marshal__ULongMarshal::_deserializer);

void x10::io::Marshal__ULongMarshal::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::io::Marshal__ULongMarshal::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::io::Marshal__ULongMarshal* this_ = new (::x10aux::alloc_z< ::x10::io::Marshal__ULongMarshal>()) ::x10::io::Marshal__ULongMarshal();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::io::Marshal__ULongMarshal::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::io::Marshal__ULongMarshal::rtt;
void x10::io::Marshal__ULongMarshal::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::io::Marshal<x10_ulong> >()};
    rtt.initStageTwo("x10.io.Marshal.ULongMarshal",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of Marshal$ULongMarshal */
/*************************************************/
/*************************************************/
/* START of Marshal$FloatMarshal */
#include <x10/io/Marshal__FloatMarshal.h>

#include <x10/io/Marshal.h>
#include <x10/lang/Float.h>
#include <x10/io/Reader.h>
#include <x10/lang/Int.h>
#include <x10/io/Marshal__IntMarshal.h>
#include <x10/io/Writer.h>
#include <x10/compiler/Synthetic.h>
::x10::io::Marshal<x10_float>::itable< ::x10::io::Marshal__FloatMarshal >  x10::io::Marshal__FloatMarshal::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::io::Marshal__FloatMarshal::read, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName, &x10::io::Marshal__FloatMarshal::write);
::x10::lang::Any::itable< ::x10::io::Marshal__FloatMarshal >  x10::io::Marshal__FloatMarshal::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::io::Marshal__FloatMarshal::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Marshal<x10_float> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::io::Marshal__FloatMarshal")};

//#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
x10_float x10::io::Marshal__FloatMarshal::read(::x10::io::Reader* r) {
    
    //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    x10_int i = ::x10::io::Marshal<void>::FMGL(INT__get)()->x10::io::Marshal__IntMarshal::read(
                  r);
    
    //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    return ::x10::lang::FloatNatives::fromIntBits(i);
    
}

//#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
void x10::io::Marshal__FloatMarshal::write(::x10::io::Writer* w, x10_float f) {
    
    //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    x10_int i = ::x10::lang::FloatNatives::toIntBits(f);
    
    //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    ::x10::io::Marshal<void>::FMGL(INT__get)()->x10::io::Marshal__IntMarshal::write(
      w, i);
}

//#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
::x10::io::Marshal__FloatMarshal* x10::io::Marshal__FloatMarshal::x10__io__Marshal__FloatMarshal____this__x10__io__Marshal__FloatMarshal(
  ) {
    return this;
    
}
void x10::io::Marshal__FloatMarshal::_constructor() {
    ::x10::io::Marshal__FloatMarshal* this__87698 = this;
    
}
::x10::io::Marshal__FloatMarshal* x10::io::Marshal__FloatMarshal::_make(
  ) {
    ::x10::io::Marshal__FloatMarshal* this_ = new (::x10aux::alloc_z< ::x10::io::Marshal__FloatMarshal>()) ::x10::io::Marshal__FloatMarshal();
    this_->_constructor();
    return this_;
}


void x10::io::Marshal__FloatMarshal::__fieldInitializers_x10_io_Marshal_FloatMarshal(
  ) {
 
}
const ::x10aux::serialization_id_t x10::io::Marshal__FloatMarshal::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::io::Marshal__FloatMarshal::_deserializer);

void x10::io::Marshal__FloatMarshal::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::io::Marshal__FloatMarshal::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::io::Marshal__FloatMarshal* this_ = new (::x10aux::alloc_z< ::x10::io::Marshal__FloatMarshal>()) ::x10::io::Marshal__FloatMarshal();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::io::Marshal__FloatMarshal::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::io::Marshal__FloatMarshal::rtt;
void x10::io::Marshal__FloatMarshal::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::io::Marshal<x10_float> >()};
    rtt.initStageTwo("x10.io.Marshal.FloatMarshal",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of Marshal$FloatMarshal */
/*************************************************/
/*************************************************/
/* START of Marshal$DoubleMarshal */
#include <x10/io/Marshal__DoubleMarshal.h>

#include <x10/io/Marshal.h>
#include <x10/lang/Double.h>
#include <x10/io/Reader.h>
#include <x10/lang/Long.h>
#include <x10/io/Marshal__LongMarshal.h>
#include <x10/io/Writer.h>
#include <x10/compiler/Synthetic.h>
::x10::io::Marshal<x10_double>::itable< ::x10::io::Marshal__DoubleMarshal >  x10::io::Marshal__DoubleMarshal::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::io::Marshal__DoubleMarshal::read, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName, &x10::io::Marshal__DoubleMarshal::write);
::x10::lang::Any::itable< ::x10::io::Marshal__DoubleMarshal >  x10::io::Marshal__DoubleMarshal::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::io::Marshal__DoubleMarshal::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Marshal<x10_double> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::io::Marshal__DoubleMarshal")};

//#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
x10_double x10::io::Marshal__DoubleMarshal::read(::x10::io::Reader* r) {
    
    //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    x10_long l = ::x10::io::Marshal<void>::FMGL(LONG__get)()->x10::io::Marshal__LongMarshal::read(
                   r);
    
    //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    return ::x10::lang::DoubleNatives::fromLongBits(l);
    
}

//#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
void x10::io::Marshal__DoubleMarshal::write(::x10::io::Writer* w,
                                            x10_double d) {
    
    //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    x10_long l = ::x10::lang::DoubleNatives::toLongBits(d);
    
    //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
    ::x10::io::Marshal<void>::FMGL(LONG__get)()->x10::io::Marshal__LongMarshal::write(
      w, l);
}

//#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/Marshal.x10"
::x10::io::Marshal__DoubleMarshal* x10::io::Marshal__DoubleMarshal::x10__io__Marshal__DoubleMarshal____this__x10__io__Marshal__DoubleMarshal(
  ) {
    return this;
    
}
void x10::io::Marshal__DoubleMarshal::_constructor() {
    ::x10::io::Marshal__DoubleMarshal* this__87699 = this;
    
}
::x10::io::Marshal__DoubleMarshal* x10::io::Marshal__DoubleMarshal::_make(
  ) {
    ::x10::io::Marshal__DoubleMarshal* this_ = new (::x10aux::alloc_z< ::x10::io::Marshal__DoubleMarshal>()) ::x10::io::Marshal__DoubleMarshal();
    this_->_constructor();
    return this_;
}


void x10::io::Marshal__DoubleMarshal::__fieldInitializers_x10_io_Marshal_DoubleMarshal(
  ) {
 
}
const ::x10aux::serialization_id_t x10::io::Marshal__DoubleMarshal::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::io::Marshal__DoubleMarshal::_deserializer);

void x10::io::Marshal__DoubleMarshal::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::io::Marshal__DoubleMarshal::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::io::Marshal__DoubleMarshal* this_ = new (::x10aux::alloc_z< ::x10::io::Marshal__DoubleMarshal>()) ::x10::io::Marshal__DoubleMarshal();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::io::Marshal__DoubleMarshal::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::io::Marshal__DoubleMarshal::rtt;
void x10::io::Marshal__DoubleMarshal::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::io::Marshal<x10_double> >()};
    rtt.initStageTwo("x10.io.Marshal.DoubleMarshal",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of Marshal$DoubleMarshal */
/*************************************************/
