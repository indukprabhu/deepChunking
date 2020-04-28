/*************************************************/
/* START of GlobalRail */
#include <x10/lang/GlobalRail.h>

::x10aux::RuntimeType x10::lang::GlobalRail<void>::rtt;
void x10::lang::GlobalRail<void>::remoteAdd(::x10::lang::GlobalRail<x10_ulong> target,
                                            x10_long idx, x10_ulong v) {
    {
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        ::x10::lang::Runtime::runAt(::x10::lang::Place::place((target->FMGL(rail))->location),
                                    reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_GlobalRail__closure__1)))x10_lang_GlobalRail__closure__1(target, idx, v))),
                                    ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
}
void x10::lang::GlobalRail<void>::remoteAdd(::x10::lang::GlobalRail<x10_long> target,
                                            x10_long idx,
                                            x10_long v) {
    {
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        ::x10::lang::Runtime::runAt(::x10::lang::Place::place((target->FMGL(rail))->location),
                                    reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_GlobalRail__closure__2)))x10_lang_GlobalRail__closure__2(target, idx, v))),
                                    ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
}
void x10::lang::GlobalRail<void>::remoteAnd(::x10::lang::GlobalRail<x10_ulong> target,
                                            x10_long idx,
                                            x10_ulong v) {
    {
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        ::x10::lang::Runtime::runAt(::x10::lang::Place::place((target->FMGL(rail))->location),
                                    reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_GlobalRail__closure__3)))x10_lang_GlobalRail__closure__3(target, idx, v))),
                                    ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
}
void x10::lang::GlobalRail<void>::remoteAnd(::x10::lang::GlobalRail<x10_long> target,
                                            x10_long idx,
                                            x10_long v) {
    {
        
        //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        ::x10::lang::Runtime::runAt(::x10::lang::Place::place((target->FMGL(rail))->location),
                                    reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_GlobalRail__closure__4)))x10_lang_GlobalRail__closure__4(target, idx, v))),
                                    ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
}
void x10::lang::GlobalRail<void>::remoteOr(::x10::lang::GlobalRail<x10_ulong> target,
                                           x10_long idx, x10_ulong v) {
    {
        
        //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        ::x10::lang::Runtime::runAt(::x10::lang::Place::place((target->FMGL(rail))->location),
                                    reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_GlobalRail__closure__5)))x10_lang_GlobalRail__closure__5(target, idx, v))),
                                    ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
}
void x10::lang::GlobalRail<void>::remoteOr(::x10::lang::GlobalRail<x10_long> target,
                                           x10_long idx, x10_long v) {
    {
        
        //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        ::x10::lang::Runtime::runAt(::x10::lang::Place::place((target->FMGL(rail))->location),
                                    reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_GlobalRail__closure__6)))x10_lang_GlobalRail__closure__6(target, idx, v))),
                                    ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
}
void x10::lang::GlobalRail<void>::remoteXor(::x10::lang::GlobalRail<x10_ulong> target,
                                            x10_long idx,
                                            x10_ulong v) {
    {
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        ::x10::lang::Runtime::runAt(::x10::lang::Place::place((target->FMGL(rail))->location),
                                    reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_GlobalRail__closure__7)))x10_lang_GlobalRail__closure__7(target, idx, v))),
                                    ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
}
void x10::lang::GlobalRail<void>::remoteXor(::x10::lang::GlobalRail<x10_long> target,
                                            x10_long idx,
                                            x10_long v) {
    {
        
        //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
        ::x10::lang::Runtime::runAt(::x10::lang::Place::place((target->FMGL(rail))->location),
                                    reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_GlobalRail__closure__8)))x10_lang_GlobalRail__closure__8(target, idx, v))),
                                    ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
}

::x10::lang::VoidFun_0_0::itable<x10_lang_GlobalRail__closure__1>x10_lang_GlobalRail__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_GlobalRail__closure__1::__apply, &x10_lang_GlobalRail__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_GlobalRail__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_GlobalRail__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_GlobalRail__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_GlobalRail__closure__1::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_GlobalRail__closure__2>x10_lang_GlobalRail__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_GlobalRail__closure__2::__apply, &x10_lang_GlobalRail__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_GlobalRail__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_GlobalRail__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_GlobalRail__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_GlobalRail__closure__2::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_GlobalRail__closure__3>x10_lang_GlobalRail__closure__3::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_GlobalRail__closure__3::__apply, &x10_lang_GlobalRail__closure__3::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_GlobalRail__closure__3::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_GlobalRail__closure__3::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_GlobalRail__closure__3::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_GlobalRail__closure__3::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_GlobalRail__closure__4>x10_lang_GlobalRail__closure__4::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_GlobalRail__closure__4::__apply, &x10_lang_GlobalRail__closure__4::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_GlobalRail__closure__4::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_GlobalRail__closure__4::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_GlobalRail__closure__4::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_GlobalRail__closure__4::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_GlobalRail__closure__5>x10_lang_GlobalRail__closure__5::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_GlobalRail__closure__5::__apply, &x10_lang_GlobalRail__closure__5::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_GlobalRail__closure__5::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_GlobalRail__closure__5::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_GlobalRail__closure__5::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_GlobalRail__closure__5::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_GlobalRail__closure__6>x10_lang_GlobalRail__closure__6::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_GlobalRail__closure__6::__apply, &x10_lang_GlobalRail__closure__6::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_GlobalRail__closure__6::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_GlobalRail__closure__6::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_GlobalRail__closure__6::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_GlobalRail__closure__6::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_GlobalRail__closure__7>x10_lang_GlobalRail__closure__7::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_GlobalRail__closure__7::__apply, &x10_lang_GlobalRail__closure__7::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_GlobalRail__closure__7::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_GlobalRail__closure__7::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_GlobalRail__closure__7::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_GlobalRail__closure__7::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_GlobalRail__closure__8>x10_lang_GlobalRail__closure__8::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_GlobalRail__closure__8::__apply, &x10_lang_GlobalRail__closure__8::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_GlobalRail__closure__8::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_GlobalRail__closure__8::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_GlobalRail__closure__8::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_GlobalRail__closure__8::_deserialize);

/* END of GlobalRail */
/*************************************************/
