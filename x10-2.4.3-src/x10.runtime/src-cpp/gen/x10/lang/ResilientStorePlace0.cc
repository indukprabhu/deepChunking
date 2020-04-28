/*************************************************/
/* START of ResilientStorePlace0 */
#include <x10/lang/ResilientStorePlace0.h>

::x10aux::RuntimeType x10::lang::ResilientStorePlace0<void, void>::rtt;
x10_long x10::lang::ResilientStorePlace0<void, void>::FMGL(verbose);
void x10::lang::ResilientStorePlace0<void, void>::FMGL(verbose__do_init)() {
    FMGL(verbose__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::ResilientStorePlace0<void, void>.verbose");
    x10_long __var1507__ = ::x10::lang::ResilientStore<void, void>::FMGL(verbose__get)();
    FMGL(verbose) = __var1507__;
    FMGL(verbose__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::ResilientStorePlace0<void, void>::FMGL(verbose__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(verbose__status), &FMGL(verbose__do_init), &FMGL(verbose__exception), "x10::lang::ResilientStorePlace0<void, void>.verbose");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::ResilientStorePlace0<void, void>::FMGL(verbose__status);
::x10::lang::CheckedThrowable* x10::lang::ResilientStorePlace0<void, void>::FMGL(verbose__exception);
x10_boolean x10::lang::ResilientStorePlace0<void, void>::lowLevelSend(::x10::lang::Place dst,
                                                                      ::x10::lang::VoidFun_0_0* cl) {
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    return ::x10::lang::FinishResilient::lowLevelSend(dst, cl);
    
}
x10_boolean x10::lang::ResilientStorePlace0<void, void>::lowLevelAt(::x10::lang::Place dst,
                                                                    ::x10::lang::VoidFun_0_0* cl) {
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    return ::x10::lang::FinishResilient::lowLevelAt(dst, cl);
    
}
::x10::util::HashMap< ::x10::lang::Any*, ::x10::lang::Any*>*
  x10::lang::ResilientStorePlace0<void, void>::FMGL(ALL);
void x10::lang::ResilientStorePlace0<void, void>::FMGL(ALL__do_init)() {
    FMGL(ALL__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::ResilientStorePlace0<void, void>.ALL");
    ::x10::util::HashMap< ::x10::lang::Any*, ::x10::lang::Any*>* __var1508__ = (::x10aux::struct_equals(::x10::lang::Place::_make(::x10aux::here)->FMGL(id),
                                                                                                        ((x10_long)0ll)))
      ? (::x10::util::HashMap< ::x10::lang::Any*, ::x10::lang::Any*>::_make())
      : ((::x10aux::class_cast_unchecked< ::x10::util::HashMap< ::x10::lang::Any*, ::x10::lang::Any*>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))));
    FMGL(ALL) = __var1508__;
    FMGL(ALL__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::ResilientStorePlace0<void, void>::FMGL(ALL__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(ALL__status), &FMGL(ALL__do_init), &FMGL(ALL__exception), "x10::lang::ResilientStorePlace0<void, void>.ALL");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::ResilientStorePlace0<void, void>::FMGL(ALL__status);
::x10::lang::CheckedThrowable* x10::lang::ResilientStorePlace0<void, void>::FMGL(ALL__exception);
void x10::lang::ResilientStorePlace0<void, void>::_kwd__delete(::x10::lang::Any* name) {
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    if (((::x10::lang::ResilientStorePlace0<void, void>::FMGL(verbose__get)()) >= (((x10_long)3ll))))
    {
        
        //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        ::x10::lang::String* msg__103828 = ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125574 = ::x10aux::makeStringLit("delete called, name="); strLit__125574; })), name);
        ::x10::lang::FinishResilient::debug(msg__103828);
    }
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    ::x10::lang::Place dst__103830 = (__extension__ ({
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
        ::x10::lang::Place alloc__103831 =  ::x10::lang::Place::_alloc();
        (alloc__103831)->::x10::lang::Place::_constructor(
          ((x10_long)0ll));
        alloc__103831;
    }))
    ;
    ::x10::lang::FinishResilient::lowLevelAt(dst__103830,
                                             reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_ResilientStorePlace0__closure__8)))x10_lang_ResilientStorePlace0__closure__8(name))));
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    if (((::x10::lang::ResilientStorePlace0<void, void>::FMGL(verbose__get)()) >= (((x10_long)3ll))))
    {
        
        //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        ::x10::lang::String* msg__103829 = (__extension__ ({ static ::x10::lang::String* strLit__125576 = ::x10aux::makeStringLit("delete returning"); strLit__125576; }));
        ::x10::lang::FinishResilient::debug(msg__103829);
    }
    
}

::x10::lang::VoidFun_0_0::itable<x10_lang_ResilientStorePlace0__closure__8>x10_lang_ResilientStorePlace0__closure__8::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_ResilientStorePlace0__closure__8::__apply, &x10_lang_ResilientStorePlace0__closure__8::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_ResilientStorePlace0__closure__8::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_ResilientStorePlace0__closure__8::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_ResilientStorePlace0__closure__8::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_ResilientStorePlace0__closure__8::_deserialize);

/* END of ResilientStorePlace0 */
/*************************************************/
/*************************************************/
/* START of ResilientStorePlace0$MyQueue$Entry */
#include <x10/lang/ResilientStorePlace0__MyQueue__Entry.h>

::x10aux::RuntimeType x10::lang::ResilientStorePlace0__MyQueue__Entry<void>::rtt;

/* END of ResilientStorePlace0$MyQueue$Entry */
/*************************************************/
/*************************************************/
/* START of ResilientStorePlace0$MyQueue */
#include <x10/lang/ResilientStorePlace0__MyQueue.h>

::x10aux::RuntimeType x10::lang::ResilientStorePlace0__MyQueue<void>::rtt;

/* END of ResilientStorePlace0$MyQueue */
/*************************************************/
/*************************************************/
/* START of ResilientStorePlace0$MyLatch */
#include <x10/lang/ResilientStorePlace0__MyLatch.h>

#include <x10/util/concurrent/SimpleLatch.h>
#include <x10/lang/Runtime__Mortal.h>
#include <x10/compiler/Synthetic.h>
::x10::io::Unserializable::itable< ::x10::lang::ResilientStorePlace0__MyLatch >  x10::lang::ResilientStorePlace0__MyLatch::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::lang::ResilientStorePlace0__MyLatch >  x10::lang::ResilientStorePlace0__MyLatch::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Runtime__Mortal::itable< ::x10::lang::ResilientStorePlace0__MyLatch >  x10::lang::ResilientStorePlace0__MyLatch::_itable_2(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::lang::ResilientStorePlace0__MyLatch::_itables[4] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Unserializable>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Runtime__Mortal>, &_itable_2), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::ResilientStorePlace0__MyLatch")};

//#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
::x10::lang::ResilientStorePlace0__MyLatch* x10::lang::ResilientStorePlace0__MyLatch::x10__lang__ResilientStorePlace0__MyLatch____this__x10__lang__ResilientStorePlace0__MyLatch(
  ) {
    return this;
    
}
void x10::lang::ResilientStorePlace0__MyLatch::_constructor() {
    (this)->::x10::util::concurrent::SimpleLatch::_constructor();
    ::x10::lang::ResilientStorePlace0__MyLatch* this__103848 = this;
    
}
::x10::lang::ResilientStorePlace0__MyLatch* x10::lang::ResilientStorePlace0__MyLatch::_make(
  ) {
    ::x10::lang::ResilientStorePlace0__MyLatch* this_ = new (::x10aux::alloc_z< ::x10::lang::ResilientStorePlace0__MyLatch>()) ::x10::lang::ResilientStorePlace0__MyLatch();
    this_->_constructor();
    return this_;
}


void x10::lang::ResilientStorePlace0__MyLatch::__fieldInitializers_x10_lang_ResilientStorePlace0_MyLatch(
  ) {
 
}
::x10aux::RuntimeType x10::lang::ResilientStorePlace0__MyLatch::rtt;
void x10::lang::ResilientStorePlace0__MyLatch::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::util::concurrent::SimpleLatch>(), ::x10aux::getRTT< ::x10::lang::Runtime__Mortal>()};
    rtt.initStageTwo("x10.lang.ResilientStorePlace0.MyLatch",::x10aux::RuntimeType::class_kind, 2, parents, 0, NULL, NULL);
}

/* END of ResilientStorePlace0$MyLatch */
/*************************************************/
