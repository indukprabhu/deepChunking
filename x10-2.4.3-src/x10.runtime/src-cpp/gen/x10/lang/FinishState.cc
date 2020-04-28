/*************************************************/
/* START of FinishState */
#include <x10/lang/FinishState.h>

#ifndef X10_LANG_FINISHSTATE__CLOSURE__2_CLOSURE
#define X10_LANG_FINISHSTATE__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 1037 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::util::concurrent::AtomicBoolean* >(c)->x10::util::concurrent::AtomicBoolean::getAndSet(
          true);
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > c;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->c);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__closure__2* storage = ::x10aux::alloc_z<x10_lang_FinishState__closure__2>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > that_c = buf.read< ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > >();
        x10_lang_FinishState__closure__2* this_ = new (storage) x10_lang_FinishState__closure__2(that_c);
        return this_;
    }
    
    x10_lang_FinishState__closure__2(::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > c) : c(c) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1036-1038";
    }

};

#endif // X10_LANG_FINISHSTATE__CLOSURE__2_CLOSURE
#ifndef X10_LANG_FINISHSTATE__CLOSURE__1_CLOSURE
#define X10_LANG_FINISHSTATE__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 1031 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        try {
            
            //#line 1032 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::lang::VoidFun_0_0::__apply(::x10aux::nullCheck(cl));
        }
        catch (::x10::lang::CheckedThrowable* __exc911) {
            if (true) {
                ::x10::lang::CheckedThrowable* t__102466 = static_cast< ::x10::lang::CheckedThrowable*>(__exc911);
                {
                    
                    //#line 1034 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    ::x10aux::nullCheck(t__102466)->printStackTrace();
                }
            } else
            throw;
        }
        
        //#line 1036 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::Runtime::x10rtSendMessage(::x10::lang::Place::place((c)->location)->FMGL(id),
                                               reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__closure__2)))x10_lang_FinishState__closure__2(c))),
                                               ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
    
    // captured environment
    ::x10::lang::VoidFun_0_0* cl;
    ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > c;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->cl);
        buf.write(this->c);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__closure__1* storage = ::x10aux::alloc_z<x10_lang_FinishState__closure__1>();
        buf.record_reference(storage);
        ::x10::lang::VoidFun_0_0* that_cl = buf.read< ::x10::lang::VoidFun_0_0*>();
        ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > that_c = buf.read< ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > >();
        x10_lang_FinishState__closure__1* this_ = new (storage) x10_lang_FinishState__closure__1(that_cl, that_c);
        return this_;
    }
    
    x10_lang_FinishState__closure__1(::x10::lang::VoidFun_0_0* cl, ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > c) : cl(cl), c(c) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1030-1039";
    }

};

#endif // X10_LANG_FINISHSTATE__CLOSURE__1_CLOSURE

//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
x10_boolean x10::lang::FinishState::FMGL(VERBOSE);
void x10::lang::FinishState::FMGL(VERBOSE__do_init)() {
    FMGL(VERBOSE__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::FinishState.VERBOSE");
    x10_boolean __var899__ = ::x10::lang::Configuration::envOrElse((__extension__ ({ static ::x10::lang::String* strLit__124547 = ::x10aux::makeStringLit("X10_FINISH_VERBOSE"); strLit__124547; })),
                                                                   false);
    FMGL(VERBOSE) = __var899__;
    FMGL(VERBOSE__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::FinishState::FMGL(VERBOSE__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(VERBOSE__status), &FMGL(VERBOSE__do_init), &FMGL(VERBOSE__exception), "x10::lang::FinishState.VERBOSE");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::FinishState::FMGL(VERBOSE__status);
::x10::lang::CheckedThrowable* x10::lang::FinishState::FMGL(VERBOSE__exception);

//#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::FinishState__UncountedFinish* x10::lang::FinishState::FMGL(UNCOUNTED_FINISH);
void x10::lang::FinishState::FMGL(UNCOUNTED_FINISH__do_init)() {
    FMGL(UNCOUNTED_FINISH__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::FinishState.UNCOUNTED_FINISH");
    ::x10::lang::FinishState__UncountedFinish* __var909__ = ::x10::lang::FinishState__UncountedFinish::_make();
    FMGL(UNCOUNTED_FINISH) = __var909__;
    FMGL(UNCOUNTED_FINISH__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::FinishState::FMGL(UNCOUNTED_FINISH__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(UNCOUNTED_FINISH__status), &FMGL(UNCOUNTED_FINISH__do_init), &FMGL(UNCOUNTED_FINISH__exception), "x10::lang::FinishState.UNCOUNTED_FINISH");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::FinishState::FMGL(UNCOUNTED_FINISH__status);
::x10::lang::CheckedThrowable* x10::lang::FinishState::FMGL(UNCOUNTED_FINISH__exception);

//#line 1024 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
x10_boolean x10::lang::FinishState::lowLevelAt(::x10::lang::Place dst,
                                               ::x10::lang::VoidFun_0_0* cl) {
    
    //#line 1025 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(::x10::lang::Place::_make(::x10aux::here),
                                 dst))) {
        
        //#line 1026 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::VoidFun_0_0::__apply(::x10aux::nullCheck(cl));
        
        //#line 1027 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        return true;
        
    } else {
        
        //#line 1029 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > c =
          ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* >(::x10::util::concurrent::AtomicBoolean::_make());
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10_long id__102464 = dst->FMGL(id);
        ::x10::lang::VoidFun_0_0* msgBody__102465 = reinterpret_cast< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__closure__1)))x10_lang_FinishState__closure__1(cl, c))));
        ::x10::lang::Runtime__Profile* prof__102467 = ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::run_closure_at((x10_int)id__102464, msgBody__102465, reinterpret_cast< ::x10::lang::Runtime__Profile*>(X10_NULL), ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
        //#line 1047 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (!((c)->__apply()->x10::util::concurrent::AtomicBoolean::get()))
        {
            
            //#line 1559 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
            {
                
                //#line 1560 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                ::x10::lang::Runtime::FMGL(pool__get)()->increase();
            }
            
            //#line 1049 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            do {
                
                //#line 1050 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                ::x10aux::event_probe();
                
                //#line 1051 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                if (x10rt_is_place_dead((x10_int)dst->FMGL(id))) {
                    
                    //#line 1566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
                    {
                        
                        //#line 1567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        ::x10::lang::Runtime::FMGL(pool__get)()->decrease(
                          ((x10_int)1));
                    }
                    
                    //#line 1053 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    return false;
                    
                }
                
            } while (!((c)->__apply()->x10::util::concurrent::AtomicBoolean::get()));
            
            //#line 1566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
            {
                
                //#line 1567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                ::x10::lang::Runtime::FMGL(pool__get)()->decrease(
                  ((x10_int)1));
            }
            
        }
        
        //#line 1059 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        return true;
        
    }
    
}

//#line 1063 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 1909 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState::notifyPlaceDeath() {
    
    //#line 1910 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(::x10::lang::Runtime::FMGL(RESILIENT_MODE__get)(),
                                 ((x10_int)0)))) {
     
    } else {
        
        //#line 1915 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::FinishResilient::notifyPlaceDeath();
    }
    
}

//#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::FinishState* x10::lang::FinishState::x10__lang__FinishState____this__x10__lang__FinishState(
  ) {
    return this;
    
}
void x10::lang::FinishState::_constructor() {
    ::x10::lang::FinishState* this__102610 = this;
    
}

void x10::lang::FinishState::__fieldInitializers_x10_lang_FinishState(
  ) {
 
}
void x10::lang::FinishState::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

void x10::lang::FinishState::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::lang::FinishState::rtt;
void x10::lang::FinishState::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.lang.FinishState",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__closure__2>x10_lang_FinishState__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__closure__2::__apply, &x10_lang_FinishState__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__closure__2::_deserialize);
const ::x10aux::serialization_id_t x10_lang_FinishState__closure__2::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishState__closure__2::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__closure__1>x10_lang_FinishState__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__closure__1::__apply, &x10_lang_FinishState__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__closure__1::_deserialize);
const ::x10aux::serialization_id_t x10_lang_FinishState__closure__1::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishState__closure__1::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

/* END of FinishState */
/*************************************************/
/*************************************************/
/* START of FinishState$LocalFinish */
#include <x10/lang/FinishState__LocalFinish.h>

#include <x10/lang/FinishState.h>
#include <x10/util/concurrent/AtomicInteger.h>
#include <x10/util/concurrent/SimpleLatch.h>
#include <x10/compiler/Embed.h>
#include <x10/util/GrowableRail.h>
#include <x10/lang/Exception.h>
#include <x10/lang/Place.h>
#include <x10/lang/Long.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Int.h>
#include <x10/lang/Boolean.h>
#include <x10/util/concurrent/Lock.h>
#include <x10/lang/Runtime__Worker.h>
#include <x10/lang/Thread.h>
#include <x10/lang/MultipleExceptions.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/lang/Any.h>
#include <x10/compiler/Synthetic.h>

//#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__LocalFinish::notifySubActivitySpawn(::x10::lang::Place place) {
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    #ifndef NO_ASSERTIONS
    if (::x10aux::x10__assertions_enabled)
        ::x10aux::x10__assert((::x10aux::struct_equals(place->FMGL(id), ((x10_long)::x10aux::here))));
    #endif//NO_ASSERTIONS
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(count)->x10::util::concurrent::AtomicInteger::getAndIncrement();
}

//#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
x10_boolean x10::lang::FinishState__LocalFinish::notifyActivityCreation(::x10::lang::Place srcPlace) {
    return true;
    
}

//#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__LocalFinish::notifyActivityTermination() {
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(this->FMGL(count)->x10::util::concurrent::AtomicInteger::decrementAndGet(),
                                 ((x10_int)0)))) {
        this->FMGL(latch)->release();
    }
    
}

//#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__LocalFinish::pushException(::x10::lang::Exception* t) {
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(latch)->lock();
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                 this->FMGL(exceptions))))
    {
        this->FMGL(exceptions) = (__extension__ ({
            ::x10::util::GrowableRail< ::x10::lang::Exception*>* alloc__92640 =
               (new (::x10aux::alloc_z< ::x10::util::GrowableRail< ::x10::lang::Exception*> >()) ::x10::util::GrowableRail< ::x10::lang::Exception*>());
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            (alloc__92640)->::x10::util::GrowableRail< ::x10::lang::Exception*>::_constructor(
              ((x10_long)0ll));
            alloc__92640;
        }))
        ;
    }
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(exceptions))->x10::util::GrowableRail< ::x10::lang::Exception*>::add(
      t);
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(latch)->unlock();
}

//#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__LocalFinish::waitForFinish() {
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->notifyActivityTermination();
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (!(::x10::lang::Runtime::FMGL(STRICT_FINISH__get)()))
    {
        ::x10aux::nullCheck((::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread())))->x10::lang::Runtime__Worker::join(
          this->FMGL(latch));
    }
    
    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(latch)->await();
    
    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::MultipleExceptions* t = ::x10::lang::MultipleExceptions::make(
                                           this->FMGL(exceptions));
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                  t))) {
        ::x10aux::throwException(::x10aux::nullCheck(t));
    }
    
}

//#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::util::concurrent::SimpleLatch* x10::lang::FinishState__LocalFinish::simpleLatch(
  ) {
    return this->FMGL(latch);
    
}

//#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__LocalFinish::runAt(::x10::lang::Place place,
                                                ::x10::lang::VoidFun_0_0* body,
                                                ::x10::lang::Runtime__Profile* prof) {
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Runtime::runAtNonResilient(place, body, prof);
}

//#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::Any* x10::lang::FinishState__LocalFinish::evalAt(
  ::x10::lang::Place place, ::x10::lang::Fun_0_0< ::x10::lang::Any*>* body,
  ::x10::lang::Runtime__Profile* prof) {
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    return ::x10::lang::Runtime::evalAtNonResilient(place,
                                                    body,
                                                    prof);
    
}

//#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::FinishState__LocalFinish* x10::lang::FinishState__LocalFinish::x10__lang__FinishState__LocalFinish____this__x10__lang__FinishState__LocalFinish(
  ) {
    return this;
    
}
void x10::lang::FinishState__LocalFinish::_constructor() {
    ::x10::lang::FinishState* this__102384 = this;
    this->x10::lang::FinishState__LocalFinish::__fieldInitializers_x10_lang_FinishState_LocalFinish();
}
::x10::lang::FinishState__LocalFinish* x10::lang::FinishState__LocalFinish::_make(
  ) {
    ::x10::lang::FinishState__LocalFinish* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__LocalFinish>()) ::x10::lang::FinishState__LocalFinish();
    this_->_constructor();
    return this_;
}


void x10::lang::FinishState__LocalFinish::__fieldInitializers_x10_lang_FinishState_LocalFinish(
  ) {
    this->FMGL(count) = &_Embed_count;
    _Embed_count._constructor(((x10_int)1));
    this->FMGL(latch) = &_Embed_latch;
    _Embed_latch._constructor();
    this->FMGL(exceptions) = (::x10aux::class_cast_unchecked< ::x10::util::GrowableRail< ::x10::lang::Exception*>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
const ::x10aux::serialization_id_t x10::lang::FinishState__LocalFinish::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::FinishState__LocalFinish::_deserializer);

void x10::lang::FinishState__LocalFinish::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::FinishState::_serialize_body(buf);
    buf.write(this->FMGL(count));
    buf.write(this->FMGL(latch));
    buf.write(this->FMGL(exceptions));
    
}

::x10::lang::Reference* ::x10::lang::FinishState__LocalFinish::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState__LocalFinish* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__LocalFinish>()) ::x10::lang::FinishState__LocalFinish();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::FinishState__LocalFinish::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState::_deserialize_body(buf);
    FMGL(count) = buf.read< ::x10::util::concurrent::AtomicInteger*>();
    FMGL(latch) = buf.read< ::x10::util::concurrent::SimpleLatch*>();
    FMGL(exceptions) = buf.read< ::x10::util::GrowableRail< ::x10::lang::Exception*>*>();
}

::x10aux::RuntimeType x10::lang::FinishState__LocalFinish::rtt;
void x10::lang::FinishState__LocalFinish::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::FinishState>()};
    rtt.initStageTwo("x10.lang.FinishState.LocalFinish",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of FinishState$LocalFinish */
/*************************************************/
/*************************************************/
/* START of FinishState$FinishSPMD */
#include <x10/lang/FinishState__FinishSPMD.h>

#include <x10/lang/FinishState__FinishSkeleton.h>
#include <x10/io/CustomSerialization.h>
#include <x10/lang/FinishState__RootFinishSkeleton.h>
#include <x10/lang/FinishState__RootFinishSPMD.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/FinishState.h>
#include <x10/io/Deserializer.h>
#include <x10/lang/Any.h>
#include <x10/lang/Place.h>
#include <x10/lang/Long.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/FinishState__RemoteFinishSPMD.h>
#include <x10/compiler/Synthetic.h>
::x10::io::CustomSerialization::itable< ::x10::lang::FinishState__FinishSPMD >  x10::lang::FinishState__FinishSPMD::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::FinishState__FinishSkeleton::serialize, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::lang::FinishState__FinishSPMD >  x10::lang::FinishState__FinishSPMD::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::lang::FinishState__FinishSPMD::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::CustomSerialization>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::FinishState__FinishSPMD")};

//#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishSPMD::_constructor() {
    
    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    (this)->::x10::lang::FinishState__FinishSkeleton::_constructor(reinterpret_cast< ::x10::lang::FinishState__RootFinishSkeleton*>((__extension__ ({
                                                                       ::x10::lang::FinishState__RootFinishSPMD* alloc__92641 =
                                                                         
                                                                       (new (::x10aux::alloc_z< ::x10::lang::FinishState__RootFinishSPMD>()) ::x10::lang::FinishState__RootFinishSPMD());
                                                                       (alloc__92641)->::x10::lang::FinishState__RootFinishSPMD::_constructor();
                                                                       alloc__92641;
                                                                   }))
                                                                   ));
    
    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__FinishSPMD* this__102385 = this;
    
}
::x10::lang::FinishState__FinishSPMD* x10::lang::FinishState__FinishSPMD::_make(
  ) {
    ::x10::lang::FinishState__FinishSPMD* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishSPMD>()) ::x10::lang::FinishState__FinishSPMD();
    this_->_constructor();
    return this_;
}



//#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishSPMD::_constructor(::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref) {
    
    //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    (this)->::x10::lang::FinishState__FinishSkeleton::_constructor(
      ref);
    
    //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__FinishSPMD* this__102386 = this;
    
}
::x10::lang::FinishState__FinishSPMD* x10::lang::FinishState__FinishSPMD::_make(
  ::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref) {
    ::x10::lang::FinishState__FinishSPMD* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishSPMD>()) ::x10::lang::FinishState__FinishSPMD();
    this_->_constructor(ref);
    return this_;
}



//#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishSPMD::_constructor(::x10::io::Deserializer* ds) {
    
    //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    (this)->::x10::lang::FinishState__FinishSkeleton::_constructor(
      ::x10aux::class_cast< ::x10::lang::GlobalRef< ::x10::lang::FinishState* > >(::x10aux::nullCheck(ds)->x10::io::Deserializer::readAny()));
    
    //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__FinishSPMD* this__102387 = this;
    
    //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(::x10::lang::Place::place((this->FMGL(ref))->location)->FMGL(id),
                                 ((x10_long)::x10aux::here))))
    {
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        this->FMGL(me) = (this->FMGL(ref))->__apply();
    } else {
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        this->FMGL(me) = (__extension__ ({
            ::x10::lang::FinishState__RemoteFinishSPMD* alloc__92642 =
               (new (::x10aux::alloc_z< ::x10::lang::FinishState__RemoteFinishSPMD>()) ::x10::lang::FinishState__RemoteFinishSPMD());
            (alloc__92642)->::x10::lang::FinishState__RemoteFinishSPMD::_constructor(
              this->FMGL(ref));
            alloc__92642;
        }))
        ;
    }
    
}
::x10::lang::FinishState__FinishSPMD* x10::lang::FinishState__FinishSPMD::_make(
  ::x10::io::Deserializer* ds) {
    ::x10::lang::FinishState__FinishSPMD* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishSPMD>()) ::x10::lang::FinishState__FinishSPMD();
    this_->_constructor(ds);
    return this_;
}



//#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::FinishState__FinishSPMD* x10::lang::FinishState__FinishSPMD::x10__lang__FinishState__FinishSPMD____this__x10__lang__FinishState__FinishSPMD(
  ) {
    return this;
    
}
void x10::lang::FinishState__FinishSPMD::__fieldInitializers_x10_lang_FinishState_FinishSPMD(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::FinishState__FinishSPMD::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::FinishState__FinishSPMD::_deserializer);

void x10::lang::FinishState__FinishSPMD::_serialize_body(::x10aux::serialization_buffer& buf) {
    /* NOTE: Implements x10.io.CustomSerialization */
    ::x10::io::Serializer* x10_buf = ::x10::io::Serializer::_make(&buf);
    this->serialize(x10_buf);
    buf.write(::x10aux::deserialization_buffer::CUSTOM_SERIALIZATION_END);
    
}

::x10::lang::Reference* ::x10::lang::FinishState__FinishSPMD::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState__FinishSPMD* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishSPMD>()) ::x10::lang::FinishState__FinishSPMD();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::FinishState__FinishSPMD::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    /* NOTE: Implements x10.io.CustomSerialization */
    ::x10::io::Deserializer* x10_buf = ::x10::io::Deserializer::_make(&buf);
    _constructor(x10_buf);
    ::x10aux::serialization_id_t tmp = buf.read< ::x10aux::serialization_id_t>();
    if (tmp != ::x10aux::deserialization_buffer::CUSTOM_SERIALIZATION_END) { ::x10aux::raiseSerializationProtocolError(); }
    
}

::x10aux::RuntimeType x10::lang::FinishState__FinishSPMD::rtt;
void x10::lang::FinishState__FinishSPMD::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::FinishState__FinishSkeleton>(), ::x10aux::getRTT< ::x10::io::CustomSerialization>()};
    rtt.initStageTwo("x10.lang.FinishState.FinishSPMD",::x10aux::RuntimeType::class_kind, 2, parents, 0, NULL, NULL);
}

/* END of FinishState$FinishSPMD */
/*************************************************/
/*************************************************/
/* START of FinishState$RootFinishSPMD */
#include <x10/lang/FinishState__RootFinishSPMD.h>

#include <x10/lang/FinishState__RootFinishSkeleton.h>
#include <x10/util/concurrent/SimpleLatch.h>
#include <x10/util/concurrent/AtomicInteger.h>
#include <x10/compiler/Embed.h>
#include <x10/util/GrowableRail.h>
#include <x10/lang/Exception.h>
#include <x10/lang/Place.h>
#include <x10/lang/Int.h>
#include <x10/util/concurrent/Lock.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Runtime__Worker.h>
#include <x10/lang/Thread.h>
#include <x10/lang/MultipleExceptions.h>
#include <x10/compiler/Synthetic.h>
::x10::lang::Runtime__Mortal::itable< ::x10::lang::FinishState__RootFinishSPMD >  x10::lang::FinishState__RootFinishSPMD::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::lang::FinishState__RootFinishSPMD >  x10::lang::FinishState__RootFinishSPMD::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::lang::FinishState__RootFinishSPMD::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Runtime__Mortal>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::FinishState__RootFinishSPMD")};

//#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RootFinishSPMD::notifySubActivitySpawn(::x10::lang::Place place) {
    
    //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(count)->x10::util::concurrent::AtomicInteger::incrementAndGet();
}

//#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RootFinishSPMD::notifyActivityTermination() {
    
    //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(this->FMGL(count)->x10::util::concurrent::AtomicInteger::decrementAndGet(),
                                 ((x10_int)0)))) {
        this->FMGL(latch)->release();
    }
    
}

//#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RootFinishSPMD::pushException(::x10::lang::Exception* t) {
    
    //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(latch)->lock();
    
    //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                 this->FMGL(exceptions))))
    {
        this->FMGL(exceptions) = (__extension__ ({
            ::x10::util::GrowableRail< ::x10::lang::Exception*>* alloc__92643 =
               (new (::x10aux::alloc_z< ::x10::util::GrowableRail< ::x10::lang::Exception*> >()) ::x10::util::GrowableRail< ::x10::lang::Exception*>());
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            (alloc__92643)->::x10::util::GrowableRail< ::x10::lang::Exception*>::_constructor(
              ((x10_long)0ll));
            alloc__92643;
        }))
        ;
    }
    
    //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(exceptions))->x10::util::GrowableRail< ::x10::lang::Exception*>::add(
      t);
    
    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(latch)->unlock();
}

//#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RootFinishSPMD::waitForFinish(
  ) {
    
    //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->notifyActivityTermination();
    
    //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((!(::x10::lang::Runtime::FMGL(STRICT_FINISH__get)()) &&
        ::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
    {
        ::x10aux::nullCheck((::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread())))->x10::lang::Runtime__Worker::join(
          this->FMGL(latch));
    }
    
    //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(latch)->await();
    
    //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::MultipleExceptions* t = ::x10::lang::MultipleExceptions::make(
                                           this->FMGL(exceptions));
    
    //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                  t))) {
        ::x10aux::throwException(::x10aux::nullCheck(t));
    }
    
}

//#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::util::concurrent::SimpleLatch* x10::lang::FinishState__RootFinishSPMD::simpleLatch(
  ) {
    return this->FMGL(latch);
    
}

//#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::FinishState__RootFinishSPMD* x10::lang::FinishState__RootFinishSPMD::x10__lang__FinishState__RootFinishSPMD____this__x10__lang__FinishState__RootFinishSPMD(
  ) {
    return this;
    
}
void x10::lang::FinishState__RootFinishSPMD::_constructor(
  ) {
    (this)->::x10::lang::FinishState__RootFinishSkeleton::_constructor();
    this->x10::lang::FinishState__RootFinishSPMD::__fieldInitializers_x10_lang_FinishState_RootFinishSPMD();
}
::x10::lang::FinishState__RootFinishSPMD* x10::lang::FinishState__RootFinishSPMD::_make(
  ) {
    ::x10::lang::FinishState__RootFinishSPMD* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__RootFinishSPMD>()) ::x10::lang::FinishState__RootFinishSPMD();
    this_->_constructor();
    return this_;
}


void x10::lang::FinishState__RootFinishSPMD::__fieldInitializers_x10_lang_FinishState_RootFinishSPMD(
  ) {
    this->FMGL(latch) = &_Embed_latch;
    _Embed_latch._constructor();
    this->FMGL(count) = &_Embed_count;
    _Embed_count._constructor(((x10_int)1));
    this->FMGL(exceptions) = (::x10aux::class_cast_unchecked< ::x10::util::GrowableRail< ::x10::lang::Exception*>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
const ::x10aux::serialization_id_t x10::lang::FinishState__RootFinishSPMD::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::FinishState__RootFinishSPMD::_deserializer);

void x10::lang::FinishState__RootFinishSPMD::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::FinishState__RootFinishSkeleton::_serialize_body(buf);
    buf.write(this->FMGL(latch));
    buf.write(this->FMGL(count));
    buf.write(this->FMGL(exceptions));
    
}

::x10::lang::Reference* ::x10::lang::FinishState__RootFinishSPMD::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState__RootFinishSPMD* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__RootFinishSPMD>()) ::x10::lang::FinishState__RootFinishSPMD();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::FinishState__RootFinishSPMD::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState__RootFinishSkeleton::_deserialize_body(buf);
    FMGL(latch) = buf.read< ::x10::util::concurrent::SimpleLatch*>();
    FMGL(count) = buf.read< ::x10::util::concurrent::AtomicInteger*>();
    FMGL(exceptions) = buf.read< ::x10::util::GrowableRail< ::x10::lang::Exception*>*>();
}

::x10aux::RuntimeType x10::lang::FinishState__RootFinishSPMD::rtt;
void x10::lang::FinishState__RootFinishSPMD::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::FinishState__RootFinishSkeleton>()};
    rtt.initStageTwo("x10.lang.FinishState.RootFinishSPMD",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of FinishState$RootFinishSPMD */
/*************************************************/
/*************************************************/
/* START of FinishState$RemoteFinishSPMD */
#include <x10/lang/FinishState__RemoteFinishSPMD.h>

#include <x10/lang/FinishState__RemoteFinishSkeleton.h>
#include <x10/util/concurrent/AtomicInteger.h>
#include <x10/util/concurrent/Lock.h>
#include <x10/compiler/Embed.h>
#include <x10/util/GrowableRail.h>
#include <x10/lang/Exception.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/FinishState.h>
#include <x10/lang/Place.h>
#include <x10/lang/Long.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Int.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/MultipleExceptions.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/compiler/RemoteInvocation.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/lang/Unsafe.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_FINISHSTATE__REMOTEFINISHSPMD__CLOSURE__5_CLOSURE
#define X10_LANG_FINISHSTATE__REMOTEFINISHSPMD__CLOSURE__5_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__RemoteFinishSPMD__closure__5 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__RemoteFinishSPMD__closure__5> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(::x10::lang::FinishState::deref< ::x10::lang::FinishState* >(
                              ref))->pushException(reinterpret_cast< ::x10::lang::Exception*>(t));
        
        //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(::x10::lang::FinishState::deref< ::x10::lang::FinishState* >(
                              ref))->notifyActivityTermination();
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref;
    ::x10::lang::MultipleExceptions* t;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->ref);
        buf.write(this->t);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__RemoteFinishSPMD__closure__5* storage = ::x10aux::alloc_z<x10_lang_FinishState__RemoteFinishSPMD__closure__5>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState* > that_ref = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState* > >();
        ::x10::lang::MultipleExceptions* that_t = buf.read< ::x10::lang::MultipleExceptions*>();
        x10_lang_FinishState__RemoteFinishSPMD__closure__5* this_ = new (storage) x10_lang_FinishState__RemoteFinishSPMD__closure__5(that_ref, that_t);
        return this_;
    }
    
    x10_lang_FinishState__RemoteFinishSPMD__closure__5(::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref, ::x10::lang::MultipleExceptions* t) : ref(ref), t(t) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:145-148";
    }

};

#endif // X10_LANG_FINISHSTATE__REMOTEFINISHSPMD__CLOSURE__5_CLOSURE
#ifndef X10_LANG_FINISHSTATE__REMOTEFINISHSPMD__CLOSURE__6_CLOSURE
#define X10_LANG_FINISHSTATE__REMOTEFINISHSPMD__CLOSURE__6_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__RemoteFinishSPMD__closure__6 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__RemoteFinishSPMD__closure__6> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(::x10::lang::FinishState::deref< ::x10::lang::FinishState* >(
                              ref))->notifyActivityTermination();
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->ref);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__RemoteFinishSPMD__closure__6* storage = ::x10aux::alloc_z<x10_lang_FinishState__RemoteFinishSPMD__closure__6>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState* > that_ref = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState* > >();
        x10_lang_FinishState__RemoteFinishSPMD__closure__6* this_ = new (storage) x10_lang_FinishState__RemoteFinishSPMD__closure__6(that_ref);
        return this_;
    }
    
    x10_lang_FinishState__RemoteFinishSPMD__closure__6(::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref) : ref(ref) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:150-152";
    }

};

#endif // X10_LANG_FINISHSTATE__REMOTEFINISHSPMD__CLOSURE__6_CLOSURE

//#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RemoteFinishSPMD::_constructor(::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref) {
    
    //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    (this)->::x10::lang::FinishState__RemoteFinishSkeleton::_constructor(
      ref);
    
    //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    
    //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->x10::lang::FinishState__RemoteFinishSPMD::__fieldInitializers_x10_lang_FinishState_RemoteFinishSPMD();
}
::x10::lang::FinishState__RemoteFinishSPMD* x10::lang::FinishState__RemoteFinishSPMD::_make(
  ::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref) {
    ::x10::lang::FinishState__RemoteFinishSPMD* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__RemoteFinishSPMD>()) ::x10::lang::FinishState__RemoteFinishSPMD();
    this_->_constructor(ref);
    return this_;
}



//#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RemoteFinishSPMD::notifySubActivitySpawn(
  ::x10::lang::Place place) {
    
    //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    #ifndef NO_ASSERTIONS
    if (::x10aux::x10__assertions_enabled)
        ::x10aux::x10__assert((::x10aux::struct_equals(place->FMGL(id),
                                                       ((x10_long)::x10aux::here))));
    #endif//NO_ASSERTIONS
    
    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(count)->x10::util::concurrent::AtomicInteger::getAndIncrement();
}

//#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
x10_boolean x10::lang::FinishState__RemoteFinishSPMD::notifyActivityCreation(
  ::x10::lang::Place srcPlace) {
    return true;
    
}

//#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RemoteFinishSPMD::notifyActivityTermination(
  ) {
    
    //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(this->FMGL(count)->x10::util::concurrent::AtomicInteger::decrementAndGet(),
                                 ((x10_int)0)))) {
        
        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::MultipleExceptions* t = ::x10::lang::MultipleExceptions::make(
                                               this->FMGL(exceptions));
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref =
          this->ref();
        
        //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::VoidFun_0_0* closure;
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                      t))) {
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            closure = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__RemoteFinishSPMD__closure__5)))x10_lang_FinishState__RemoteFinishSPMD__closure__5(ref, t)));
        } else {
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            closure = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__RemoteFinishSPMD__closure__6)))x10_lang_FinishState__RemoteFinishSPMD__closure__6(ref)));
        }
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10_long id__102388 = ::x10::lang::Place::place((ref)->location)->FMGL(id);
        ::x10::lang::VoidFun_0_0* msgBody__102389 = closure;
        ::x10::lang::Runtime__Profile* prof__102390 = ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::run_closure_at((x10_int)id__102388, msgBody__102389, reinterpret_cast< ::x10::lang::Runtime__Profile*>(X10_NULL), ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
        //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::dealloc(closure);
    }
    
}

//#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RemoteFinishSPMD::pushException(
  ::x10::lang::Exception* t) {
    
    //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(lock)->lock();
    
    //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                 this->FMGL(exceptions))))
    {
        this->FMGL(exceptions) = (__extension__ ({
            ::x10::util::GrowableRail< ::x10::lang::Exception*>* alloc__92644 =
               (new (::x10aux::alloc_z< ::x10::util::GrowableRail< ::x10::lang::Exception*> >()) ::x10::util::GrowableRail< ::x10::lang::Exception*>());
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            (alloc__92644)->::x10::util::GrowableRail< ::x10::lang::Exception*>::_constructor(
              ((x10_long)0ll));
            alloc__92644;
        }))
        ;
    }
    
    //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(exceptions))->x10::util::GrowableRail< ::x10::lang::Exception*>::add(
      t);
    
    //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(lock)->unlock();
}

//#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::FinishState__RemoteFinishSPMD* x10::lang::FinishState__RemoteFinishSPMD::x10__lang__FinishState__RemoteFinishSPMD____this__x10__lang__FinishState__RemoteFinishSPMD(
  ) {
    return this;
    
}
void x10::lang::FinishState__RemoteFinishSPMD::__fieldInitializers_x10_lang_FinishState_RemoteFinishSPMD(
  ) {
    this->FMGL(count) = &_Embed_count;
    _Embed_count._constructor(((x10_int)1));
    this->FMGL(exceptions) = (::x10aux::class_cast_unchecked< ::x10::util::GrowableRail< ::x10::lang::Exception*>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(lock) = &_Embed_lock;
    _Embed_lock._constructor();
}
const ::x10aux::serialization_id_t x10::lang::FinishState__RemoteFinishSPMD::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::FinishState__RemoteFinishSPMD::_deserializer);

void x10::lang::FinishState__RemoteFinishSPMD::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::FinishState__RemoteFinishSkeleton::_serialize_body(buf);
    buf.write(this->FMGL(count));
    buf.write(this->FMGL(exceptions));
    buf.write(this->FMGL(lock));
    
}

::x10::lang::Reference* ::x10::lang::FinishState__RemoteFinishSPMD::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState__RemoteFinishSPMD* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__RemoteFinishSPMD>()) ::x10::lang::FinishState__RemoteFinishSPMD();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::FinishState__RemoteFinishSPMD::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState__RemoteFinishSkeleton::_deserialize_body(buf);
    FMGL(count) = buf.read< ::x10::util::concurrent::AtomicInteger*>();
    FMGL(exceptions) = buf.read< ::x10::util::GrowableRail< ::x10::lang::Exception*>*>();
    FMGL(lock) = buf.read< ::x10::util::concurrent::Lock*>();
}

::x10aux::RuntimeType x10::lang::FinishState__RemoteFinishSPMD::rtt;
void x10::lang::FinishState__RemoteFinishSPMD::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::FinishState__RemoteFinishSkeleton>()};
    rtt.initStageTwo("x10.lang.FinishState.RemoteFinishSPMD",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__RemoteFinishSPMD__closure__5>x10_lang_FinishState__RemoteFinishSPMD__closure__5::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__RemoteFinishSPMD__closure__5::__apply, &x10_lang_FinishState__RemoteFinishSPMD__closure__5::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__RemoteFinishSPMD__closure__5::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__RemoteFinishSPMD__closure__5::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__RemoteFinishSPMD__closure__5::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__RemoteFinishSPMD__closure__5::_deserialize);
const ::x10aux::serialization_id_t x10_lang_FinishState__RemoteFinishSPMD__closure__5::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishState__RemoteFinishSPMD__closure__5::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__RemoteFinishSPMD__closure__6>x10_lang_FinishState__RemoteFinishSPMD__closure__6::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__RemoteFinishSPMD__closure__6::__apply, &x10_lang_FinishState__RemoteFinishSPMD__closure__6::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__RemoteFinishSPMD__closure__6::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__RemoteFinishSPMD__closure__6::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__RemoteFinishSPMD__closure__6::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__RemoteFinishSPMD__closure__6::_deserialize);
const ::x10aux::serialization_id_t x10_lang_FinishState__RemoteFinishSPMD__closure__6::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishState__RemoteFinishSPMD__closure__6::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

/* END of FinishState$RemoteFinishSPMD */
/*************************************************/
/*************************************************/
/* START of FinishState$FinishAsync */
#include <x10/lang/FinishState__FinishAsync.h>

#include <x10/lang/FinishState__FinishSkeleton.h>
#include <x10/io/CustomSerialization.h>
#include <x10/lang/FinishState__RootFinishSkeleton.h>
#include <x10/lang/FinishState__RootFinishAsync.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/FinishState.h>
#include <x10/io/Deserializer.h>
#include <x10/lang/Any.h>
#include <x10/lang/Place.h>
#include <x10/lang/Long.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/FinishState__RemoteFinishAsync.h>
#include <x10/compiler/Synthetic.h>
::x10::io::CustomSerialization::itable< ::x10::lang::FinishState__FinishAsync >  x10::lang::FinishState__FinishAsync::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::FinishState__FinishSkeleton::serialize, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::lang::FinishState__FinishAsync >  x10::lang::FinishState__FinishAsync::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::lang::FinishState__FinishAsync::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::CustomSerialization>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::FinishState__FinishAsync")};

//#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishAsync::_constructor() {
    
    //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    (this)->::x10::lang::FinishState__FinishSkeleton::_constructor(reinterpret_cast< ::x10::lang::FinishState__RootFinishSkeleton*>((__extension__ ({
                                                                       ::x10::lang::FinishState__RootFinishAsync* alloc__92645 =
                                                                         
                                                                       (new (::x10aux::alloc_z< ::x10::lang::FinishState__RootFinishAsync>()) ::x10::lang::FinishState__RootFinishAsync());
                                                                       (alloc__92645)->::x10::lang::FinishState__RootFinishAsync::_constructor();
                                                                       alloc__92645;
                                                                   }))
                                                                   ));
    
    //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    
    //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__FinishAsync* this__102391 = this;
    
}
::x10::lang::FinishState__FinishAsync* x10::lang::FinishState__FinishAsync::_make(
  ) {
    ::x10::lang::FinishState__FinishAsync* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishAsync>()) ::x10::lang::FinishState__FinishAsync();
    this_->_constructor();
    return this_;
}



//#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishAsync::_constructor(::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref) {
    
    //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    (this)->::x10::lang::FinishState__FinishSkeleton::_constructor(
      ref);
    
    //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    
    //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__FinishAsync* this__102392 =
      this;
    
}
::x10::lang::FinishState__FinishAsync* x10::lang::FinishState__FinishAsync::_make(
  ::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref)
{
    ::x10::lang::FinishState__FinishAsync* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishAsync>()) ::x10::lang::FinishState__FinishAsync();
    this_->_constructor(ref);
    return this_;
}



//#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishAsync::_constructor(::x10::io::Deserializer* ds) {
    
    //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    (this)->::x10::lang::FinishState__FinishSkeleton::_constructor(
      ::x10aux::class_cast< ::x10::lang::GlobalRef< ::x10::lang::FinishState* > >(::x10aux::nullCheck(ds)->x10::io::Deserializer::readAny()));
    
    //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    
    //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__FinishAsync* this__102393 =
      this;
    
    //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(::x10::lang::Place::place((this->FMGL(ref))->location)->FMGL(id),
                                 ((x10_long)::x10aux::here))))
    {
        
        //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        this->FMGL(me) = (this->FMGL(ref))->__apply();
    } else {
        
        //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        this->FMGL(me) = (__extension__ ({
            ::x10::lang::FinishState__RemoteFinishAsync* alloc__92646 =
               (new (::x10aux::alloc_z< ::x10::lang::FinishState__RemoteFinishAsync>()) ::x10::lang::FinishState__RemoteFinishAsync());
            (alloc__92646)->::x10::lang::FinishState__RemoteFinishAsync::_constructor(
              this->FMGL(ref));
            alloc__92646;
        }))
        ;
    }
    
}
::x10::lang::FinishState__FinishAsync* x10::lang::FinishState__FinishAsync::_make(
  ::x10::io::Deserializer* ds) {
    ::x10::lang::FinishState__FinishAsync* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishAsync>()) ::x10::lang::FinishState__FinishAsync();
    this_->_constructor(ds);
    return this_;
}



//#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::FinishState__FinishAsync* x10::lang::FinishState__FinishAsync::x10__lang__FinishState__FinishAsync____this__x10__lang__FinishState__FinishAsync(
  ) {
    return this;
    
}
void x10::lang::FinishState__FinishAsync::__fieldInitializers_x10_lang_FinishState_FinishAsync(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::FinishState__FinishAsync::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::FinishState__FinishAsync::_deserializer);

void x10::lang::FinishState__FinishAsync::_serialize_body(::x10aux::serialization_buffer& buf) {
    /* NOTE: Implements x10.io.CustomSerialization */
    ::x10::io::Serializer* x10_buf = ::x10::io::Serializer::_make(&buf);
    this->serialize(x10_buf);
    buf.write(::x10aux::deserialization_buffer::CUSTOM_SERIALIZATION_END);
    
}

::x10::lang::Reference* ::x10::lang::FinishState__FinishAsync::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState__FinishAsync* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishAsync>()) ::x10::lang::FinishState__FinishAsync();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::FinishState__FinishAsync::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    /* NOTE: Implements x10.io.CustomSerialization */
    ::x10::io::Deserializer* x10_buf = ::x10::io::Deserializer::_make(&buf);
    _constructor(x10_buf);
    ::x10aux::serialization_id_t tmp = buf.read< ::x10aux::serialization_id_t>();
    if (tmp != ::x10aux::deserialization_buffer::CUSTOM_SERIALIZATION_END) { ::x10aux::raiseSerializationProtocolError(); }
    
}

::x10aux::RuntimeType x10::lang::FinishState__FinishAsync::rtt;
void x10::lang::FinishState__FinishAsync::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::FinishState__FinishSkeleton>(), ::x10aux::getRTT< ::x10::io::CustomSerialization>()};
    rtt.initStageTwo("x10.lang.FinishState.FinishAsync",::x10aux::RuntimeType::class_kind, 2, parents, 0, NULL, NULL);
}

/* END of FinishState$FinishAsync */
/*************************************************/
/*************************************************/
/* START of FinishState$RootFinishAsync */
#include <x10/lang/FinishState__RootFinishAsync.h>

#include <x10/lang/FinishState__RootFinishSkeleton.h>
#include <x10/util/concurrent/SimpleLatch.h>
#include <x10/compiler/Embed.h>
#include <x10/lang/Exception.h>
#include <x10/lang/Place.h>
#include <x10/lang/MultipleExceptions.h>
#include <x10/compiler/Synthetic.h>
::x10::lang::Runtime__Mortal::itable< ::x10::lang::FinishState__RootFinishAsync >  x10::lang::FinishState__RootFinishAsync::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::lang::FinishState__RootFinishAsync >  x10::lang::FinishState__RootFinishAsync::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::lang::FinishState__RootFinishAsync::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Runtime__Mortal>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::FinishState__RootFinishAsync")};

//#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RootFinishAsync::notifySubActivitySpawn(::x10::lang::Place place) {
 
}

//#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RootFinishAsync::notifyActivityTermination() {
    
    //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(latch)->release();
}

//#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RootFinishAsync::pushException(::x10::lang::Exception* t) {
    
    //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(exception) = t;
}

//#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RootFinishAsync::waitForFinish() {
    
    //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(latch)->await();
    
    //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::MultipleExceptions* t = (__extension__ ({
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
        ::x10::lang::Exception* t__101750 = this->FMGL(exception);
        ::x10::lang::MultipleExceptions* ret__101751;
        goto __ret__101752; __ret__101752: {
        {
            
            //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
            if ((::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                         t__101750))) {
                ret__101751 = (::x10aux::class_cast_unchecked< ::x10::lang::MultipleExceptions*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                goto __ret__101752_end_;
            }
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
            ret__101751 = ::x10::lang::MultipleExceptions::_make(t__101750);
        }goto __ret__101752_end_; __ret__101752_end_: ;
        }
        ret__101751;
        }))
        ;
        
    
    //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                  t))) {
        ::x10aux::throwException(::x10aux::nullCheck(t));
    }
    }
    

//#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::util::concurrent::SimpleLatch* x10::lang::FinishState__RootFinishAsync::simpleLatch(
  ) {
    return this->FMGL(latch);
    
}

//#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::FinishState__RootFinishAsync* x10::lang::FinishState__RootFinishAsync::x10__lang__FinishState__RootFinishAsync____this__x10__lang__FinishState__RootFinishAsync(
  ) {
    return this;
    
}
void x10::lang::FinishState__RootFinishAsync::_constructor(
  ) {
    (this)->::x10::lang::FinishState__RootFinishSkeleton::_constructor();
    this->x10::lang::FinishState__RootFinishAsync::__fieldInitializers_x10_lang_FinishState_RootFinishAsync();
}
::x10::lang::FinishState__RootFinishAsync* x10::lang::FinishState__RootFinishAsync::_make(
  ) {
    ::x10::lang::FinishState__RootFinishAsync* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__RootFinishAsync>()) ::x10::lang::FinishState__RootFinishAsync();
    this_->_constructor();
    return this_;
}


void x10::lang::FinishState__RootFinishAsync::__fieldInitializers_x10_lang_FinishState_RootFinishAsync(
  ) {
    this->FMGL(latch) = &_Embed_latch;
    _Embed_latch._constructor();
    this->FMGL(exception) = (::x10aux::class_cast_unchecked< ::x10::lang::Exception*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
const ::x10aux::serialization_id_t x10::lang::FinishState__RootFinishAsync::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::FinishState__RootFinishAsync::_deserializer);

void x10::lang::FinishState__RootFinishAsync::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::FinishState__RootFinishSkeleton::_serialize_body(buf);
    buf.write(this->FMGL(latch));
    buf.write(this->FMGL(exception));
    
}

::x10::lang::Reference* ::x10::lang::FinishState__RootFinishAsync::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState__RootFinishAsync* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__RootFinishAsync>()) ::x10::lang::FinishState__RootFinishAsync();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::FinishState__RootFinishAsync::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState__RootFinishSkeleton::_deserialize_body(buf);
    FMGL(latch) = buf.read< ::x10::util::concurrent::SimpleLatch*>();
    FMGL(exception) = buf.read< ::x10::lang::Exception*>();
}

::x10aux::RuntimeType x10::lang::FinishState__RootFinishAsync::rtt;
void x10::lang::FinishState__RootFinishAsync::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::FinishState__RootFinishSkeleton>()};
    rtt.initStageTwo("x10.lang.FinishState.RootFinishAsync",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of FinishState$RootFinishAsync */
/*************************************************/
/*************************************************/
/* START of FinishState$RemoteFinishAsync */
#include <x10/lang/FinishState__RemoteFinishAsync.h>

#include <x10/lang/FinishState__RemoteFinishSkeleton.h>
#include <x10/lang/Exception.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/FinishState.h>
#include <x10/lang/Place.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/MultipleExceptions.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/compiler/RemoteInvocation.h>
#include <x10/lang/Long.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Unsafe.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_FINISHSTATE__REMOTEFINISHASYNC__CLOSURE__7_CLOSURE
#define X10_LANG_FINISHSTATE__REMOTEFINISHASYNC__CLOSURE__7_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__RemoteFinishAsync__closure__7 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__RemoteFinishAsync__closure__7> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(::x10::lang::FinishState::deref< ::x10::lang::FinishState* >(
                              ref))->pushException(reinterpret_cast< ::x10::lang::Exception*>(t));
        
        //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(::x10::lang::FinishState::deref< ::x10::lang::FinishState* >(
                              ref))->notifyActivityTermination();
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref;
    ::x10::lang::MultipleExceptions* t;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->ref);
        buf.write(this->t);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__RemoteFinishAsync__closure__7* storage = ::x10aux::alloc_z<x10_lang_FinishState__RemoteFinishAsync__closure__7>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState* > that_ref = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState* > >();
        ::x10::lang::MultipleExceptions* that_t = buf.read< ::x10::lang::MultipleExceptions*>();
        x10_lang_FinishState__RemoteFinishAsync__closure__7* this_ = new (storage) x10_lang_FinishState__RemoteFinishAsync__closure__7(that_ref, that_t);
        return this_;
    }
    
    x10_lang_FinishState__RemoteFinishAsync__closure__7(::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref, ::x10::lang::MultipleExceptions* t) : ref(ref), t(t) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:217-220";
    }

};

#endif // X10_LANG_FINISHSTATE__REMOTEFINISHASYNC__CLOSURE__7_CLOSURE
#ifndef X10_LANG_FINISHSTATE__REMOTEFINISHASYNC__CLOSURE__8_CLOSURE
#define X10_LANG_FINISHSTATE__REMOTEFINISHASYNC__CLOSURE__8_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__RemoteFinishAsync__closure__8 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__RemoteFinishAsync__closure__8> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(::x10::lang::FinishState::deref< ::x10::lang::FinishState* >(
                              ref))->notifyActivityTermination();
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->ref);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__RemoteFinishAsync__closure__8* storage = ::x10aux::alloc_z<x10_lang_FinishState__RemoteFinishAsync__closure__8>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState* > that_ref = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState* > >();
        x10_lang_FinishState__RemoteFinishAsync__closure__8* this_ = new (storage) x10_lang_FinishState__RemoteFinishAsync__closure__8(that_ref);
        return this_;
    }
    
    x10_lang_FinishState__RemoteFinishAsync__closure__8(::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref) : ref(ref) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:222-224";
    }

};

#endif // X10_LANG_FINISHSTATE__REMOTEFINISHASYNC__CLOSURE__8_CLOSURE

//#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RemoteFinishAsync::_constructor(::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref) {
    
    //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    (this)->::x10::lang::FinishState__RemoteFinishSkeleton::_constructor(
      ref);
    
    //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    
    //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__RemoteFinishAsync* this__102394 = this;
    ::x10aux::nullCheck(this__102394)->FMGL(exception) = (::x10aux::class_cast_unchecked< ::x10::lang::Exception*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
::x10::lang::FinishState__RemoteFinishAsync* x10::lang::FinishState__RemoteFinishAsync::_make(
  ::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref) {
    ::x10::lang::FinishState__RemoteFinishAsync* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__RemoteFinishAsync>()) ::x10::lang::FinishState__RemoteFinishAsync();
    this_->_constructor(ref);
    return this_;
}



//#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
x10_boolean x10::lang::FinishState__RemoteFinishAsync::notifyActivityCreation(
  ::x10::lang::Place srcPlace) {
    return true;
    
}

//#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RemoteFinishAsync::notifySubActivitySpawn(
  ::x10::lang::Place place) {
 
}

//#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RemoteFinishAsync::pushException(::x10::lang::Exception* t) {
    
    //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(exception) = t;
}

//#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RemoteFinishAsync::notifyActivityTermination(
  ) {
    
    //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::MultipleExceptions* t = (__extension__ ({
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
        ::x10::lang::Exception* t__101756 = this->FMGL(exception);
        ::x10::lang::MultipleExceptions* ret__101757;
        goto __ret__101758; __ret__101758: {
        {
            
            //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
            if ((::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                         t__101756))) {
                ret__101757 = (::x10aux::class_cast_unchecked< ::x10::lang::MultipleExceptions*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                goto __ret__101758_end_;
            }
            
            //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/MultipleExceptions.x10"
            ret__101757 = ::x10::lang::MultipleExceptions::_make(t__101756);
        }goto __ret__101758_end_; __ret__101758_end_: ;
        }
        ret__101757;
        }))
        ;
        
    
    //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref =
      this->ref();
    
    //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::VoidFun_0_0* closure;
    
    //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                  t))) {
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        closure = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__RemoteFinishAsync__closure__7)))x10_lang_FinishState__RemoteFinishAsync__closure__7(ref, t)));
    } else {
        
        //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        closure = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__RemoteFinishAsync__closure__8)))x10_lang_FinishState__RemoteFinishAsync__closure__8(ref)));
    }
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    x10_long id__102395 = ::x10::lang::Place::place((ref)->location)->FMGL(id);
    ::x10::lang::VoidFun_0_0* msgBody__102396 = closure;
    ::x10::lang::Runtime__Profile* prof__102397 = ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
    
    //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::run_closure_at((x10_int)id__102395, msgBody__102396, reinterpret_cast< ::x10::lang::Runtime__Profile*>(X10_NULL), ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::dealloc(closure);
    }
    

//#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::FinishState__RemoteFinishAsync* x10::lang::FinishState__RemoteFinishAsync::x10__lang__FinishState__RemoteFinishAsync____this__x10__lang__FinishState__RemoteFinishAsync(
  ) {
    return this;
    
}
void x10::lang::FinishState__RemoteFinishAsync::__fieldInitializers_x10_lang_FinishState_RemoteFinishAsync(
  ) {
    this->FMGL(exception) = (::x10aux::class_cast_unchecked< ::x10::lang::Exception*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
const ::x10aux::serialization_id_t x10::lang::FinishState__RemoteFinishAsync::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::FinishState__RemoteFinishAsync::_deserializer);

void x10::lang::FinishState__RemoteFinishAsync::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::FinishState__RemoteFinishSkeleton::_serialize_body(buf);
    buf.write(this->FMGL(exception));
    
}

::x10::lang::Reference* ::x10::lang::FinishState__RemoteFinishAsync::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState__RemoteFinishAsync* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__RemoteFinishAsync>()) ::x10::lang::FinishState__RemoteFinishAsync();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::FinishState__RemoteFinishAsync::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState__RemoteFinishSkeleton::_deserialize_body(buf);
    FMGL(exception) = buf.read< ::x10::lang::Exception*>();
}

::x10aux::RuntimeType x10::lang::FinishState__RemoteFinishAsync::rtt;
void x10::lang::FinishState__RemoteFinishAsync::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::FinishState__RemoteFinishSkeleton>()};
    rtt.initStageTwo("x10.lang.FinishState.RemoteFinishAsync",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__RemoteFinishAsync__closure__7>x10_lang_FinishState__RemoteFinishAsync__closure__7::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__RemoteFinishAsync__closure__7::__apply, &x10_lang_FinishState__RemoteFinishAsync__closure__7::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__RemoteFinishAsync__closure__7::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__RemoteFinishAsync__closure__7::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__RemoteFinishAsync__closure__7::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__RemoteFinishAsync__closure__7::_deserialize);
const ::x10aux::serialization_id_t x10_lang_FinishState__RemoteFinishAsync__closure__7::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishState__RemoteFinishAsync__closure__7::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__RemoteFinishAsync__closure__8>x10_lang_FinishState__RemoteFinishAsync__closure__8::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__RemoteFinishAsync__closure__8::__apply, &x10_lang_FinishState__RemoteFinishAsync__closure__8::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__RemoteFinishAsync__closure__8::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__RemoteFinishAsync__closure__8::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__RemoteFinishAsync__closure__8::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__RemoteFinishAsync__closure__8::_deserialize);
const ::x10aux::serialization_id_t x10_lang_FinishState__RemoteFinishAsync__closure__8::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishState__RemoteFinishAsync__closure__8::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

/* END of FinishState$RemoteFinishAsync */
/*************************************************/
/*************************************************/
/* START of FinishState$FinishHere */
#include <x10/lang/FinishState__FinishHere.h>

#include <x10/lang/FinishState__FinishSkeleton.h>
#include <x10/io/CustomSerialization.h>
#include <x10/lang/FinishState__RootFinishSkeleton.h>
#include <x10/lang/FinishState__RootFinishSPMD.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/FinishState.h>
#include <x10/io/Deserializer.h>
#include <x10/lang/Any.h>
#include <x10/lang/Place.h>
#include <x10/lang/Long.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/FinishState__UncountedFinish.h>
#include <x10/compiler/Synthetic.h>
::x10::io::CustomSerialization::itable< ::x10::lang::FinishState__FinishHere >  x10::lang::FinishState__FinishHere::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::FinishState__FinishSkeleton::serialize, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::lang::FinishState__FinishHere >  x10::lang::FinishState__FinishHere::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::lang::FinishState__FinishHere::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::CustomSerialization>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::FinishState__FinishHere")};

//#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishHere::_constructor() {
    
    //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    (this)->::x10::lang::FinishState__FinishSkeleton::_constructor(reinterpret_cast< ::x10::lang::FinishState__RootFinishSkeleton*>((__extension__ ({
                                                                       ::x10::lang::FinishState__RootFinishSPMD* alloc__92647 =
                                                                         
                                                                       (new (::x10aux::alloc_z< ::x10::lang::FinishState__RootFinishSPMD>()) ::x10::lang::FinishState__RootFinishSPMD());
                                                                       (alloc__92647)->::x10::lang::FinishState__RootFinishSPMD::_constructor();
                                                                       alloc__92647;
                                                                   }))
                                                                   ));
    
    //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    
    //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__FinishHere* this__102398 = this;
    
}
::x10::lang::FinishState__FinishHere* x10::lang::FinishState__FinishHere::_make(
  ) {
    ::x10::lang::FinishState__FinishHere* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishHere>()) ::x10::lang::FinishState__FinishHere();
    this_->_constructor();
    return this_;
}



//#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishHere::_constructor(::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref) {
    
    //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    (this)->::x10::lang::FinishState__FinishSkeleton::_constructor(
      ref);
    
    //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    
    //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__FinishHere* this__102399 = this;
    
}
::x10::lang::FinishState__FinishHere* x10::lang::FinishState__FinishHere::_make(
  ::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref) {
    ::x10::lang::FinishState__FinishHere* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishHere>()) ::x10::lang::FinishState__FinishHere();
    this_->_constructor(ref);
    return this_;
}



//#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishHere::_constructor(::x10::io::Deserializer* ds) {
    
    //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    (this)->::x10::lang::FinishState__FinishSkeleton::_constructor(
      ::x10aux::class_cast< ::x10::lang::GlobalRef< ::x10::lang::FinishState* > >(::x10aux::nullCheck(ds)->x10::io::Deserializer::readAny()));
    
    //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    
    //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__FinishHere* this__102400 = this;
    
    //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(::x10::lang::Place::place((this->FMGL(ref))->location)->FMGL(id),
                                 ((x10_long)::x10aux::here))))
    {
        
        //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        this->FMGL(me) = (this->FMGL(ref))->__apply();
    } else {
        
        //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        this->FMGL(me) = ::x10::lang::FinishState::FMGL(UNCOUNTED_FINISH__get)();
    }
    
}
::x10::lang::FinishState__FinishHere* x10::lang::FinishState__FinishHere::_make(
  ::x10::io::Deserializer* ds) {
    ::x10::lang::FinishState__FinishHere* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishHere>()) ::x10::lang::FinishState__FinishHere();
    this_->_constructor(ds);
    return this_;
}



//#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::FinishState__FinishHere* x10::lang::FinishState__FinishHere::x10__lang__FinishState__FinishHere____this__x10__lang__FinishState__FinishHere(
  ) {
    return this;
    
}
void x10::lang::FinishState__FinishHere::__fieldInitializers_x10_lang_FinishState_FinishHere(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::FinishState__FinishHere::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::FinishState__FinishHere::_deserializer);

void x10::lang::FinishState__FinishHere::_serialize_body(::x10aux::serialization_buffer& buf) {
    /* NOTE: Implements x10.io.CustomSerialization */
    ::x10::io::Serializer* x10_buf = ::x10::io::Serializer::_make(&buf);
    this->serialize(x10_buf);
    buf.write(::x10aux::deserialization_buffer::CUSTOM_SERIALIZATION_END);
    
}

::x10::lang::Reference* ::x10::lang::FinishState__FinishHere::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState__FinishHere* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishHere>()) ::x10::lang::FinishState__FinishHere();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::FinishState__FinishHere::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    /* NOTE: Implements x10.io.CustomSerialization */
    ::x10::io::Deserializer* x10_buf = ::x10::io::Deserializer::_make(&buf);
    _constructor(x10_buf);
    ::x10aux::serialization_id_t tmp = buf.read< ::x10aux::serialization_id_t>();
    if (tmp != ::x10aux::deserialization_buffer::CUSTOM_SERIALIZATION_END) { ::x10aux::raiseSerializationProtocolError(); }
    
}

::x10aux::RuntimeType x10::lang::FinishState__FinishHere::rtt;
void x10::lang::FinishState__FinishHere::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::FinishState__FinishSkeleton>(), ::x10aux::getRTT< ::x10::io::CustomSerialization>()};
    rtt.initStageTwo("x10.lang.FinishState.FinishHere",::x10aux::RuntimeType::class_kind, 2, parents, 0, NULL, NULL);
}

/* END of FinishState$FinishHere */
/*************************************************/
/*************************************************/
/* START of FinishState$UncountedFinish */
#include <x10/lang/FinishState__UncountedFinish.h>

#include <x10/lang/FinishState.h>
#include <x10/lang/Place.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Exception.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Any.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/util/concurrent/SimpleLatch.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/compiler/Synthetic.h>

//#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__UncountedFinish::notifySubActivitySpawn(::x10::lang::Place place) {
 
}

//#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
x10_boolean x10::lang::FinishState__UncountedFinish::notifyActivityCreation(
  ::x10::lang::Place srcPlace) {
    return true;
    
}

//#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__UncountedFinish::notifyActivityTermination() {
 
}

//#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__UncountedFinish::pushException(::x10::lang::Exception* t) {
    
    //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__124596 = ::x10aux::makeStringLit("Uncaught exception in uncounted activity"); strLit__124596; }))))->c_str());
    
    //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(t)->printStackTrace();
}

//#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__UncountedFinish::waitForFinish() {
    #ifndef NO_ASSERTIONS
    if (::x10aux::x10__assertions_enabled)
        ::x10aux::x10__assert(false);
    #endif//NO_ASSERTIONS
    
}

//#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::util::concurrent::SimpleLatch* x10::lang::FinishState__UncountedFinish::simpleLatch(
  ) {
    return ::x10aux::class_cast_unchecked< ::x10::util::concurrent::SimpleLatch*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
    
}

//#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__UncountedFinish::runAt(::x10::lang::Place place,
                                                    ::x10::lang::VoidFun_0_0* body,
                                                    ::x10::lang::Runtime__Profile* prof) {
    
    //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Runtime::runAtNonResilient(place, body, prof);
}

//#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::Any* x10::lang::FinishState__UncountedFinish::evalAt(
  ::x10::lang::Place place, ::x10::lang::Fun_0_0< ::x10::lang::Any*>* body,
  ::x10::lang::Runtime__Profile* prof) {
    
    //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    return ::x10::lang::Runtime::evalAtNonResilient(place,
                                                    body,
                                                    prof);
    
}

//#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::FinishState__UncountedFinish* x10::lang::FinishState__UncountedFinish::x10__lang__FinishState__UncountedFinish____this__x10__lang__FinishState__UncountedFinish(
  ) {
    return this;
    
}
void x10::lang::FinishState__UncountedFinish::_constructor(
  ) {
    ::x10::lang::FinishState* this__102402 = this;
    ::x10::lang::FinishState__UncountedFinish* this__102401 =
      this;
    
}
::x10::lang::FinishState__UncountedFinish* x10::lang::FinishState__UncountedFinish::_make(
  ) {
    ::x10::lang::FinishState__UncountedFinish* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__UncountedFinish>()) ::x10::lang::FinishState__UncountedFinish();
    this_->_constructor();
    return this_;
}


void x10::lang::FinishState__UncountedFinish::__fieldInitializers_x10_lang_FinishState_UncountedFinish(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::FinishState__UncountedFinish::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::FinishState__UncountedFinish::_deserializer);

void x10::lang::FinishState__UncountedFinish::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::FinishState::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::lang::FinishState__UncountedFinish::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState__UncountedFinish* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__UncountedFinish>()) ::x10::lang::FinishState__UncountedFinish();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::FinishState__UncountedFinish::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::lang::FinishState__UncountedFinish::rtt;
void x10::lang::FinishState__UncountedFinish::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::FinishState>()};
    rtt.initStageTwo("x10.lang.FinishState.UncountedFinish",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of FinishState$UncountedFinish */
/*************************************************/
/*************************************************/
/* START of FinishState$FinishStates */
#include <x10/lang/FinishState__FinishStates.h>

#include <x10/lang/GlobalRef.h>
#include <x10/util/concurrent/Lock.h>
#include <x10/util/HashMap.h>
#include <x10/lang/FinishState.h>
#include <x10/compiler/Embed.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/util/Box.h>
#include <x10/compiler/Synthetic.h>

//#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::FinishState* x10::lang::FinishState__FinishStates::__apply(::x10::lang::GlobalRef< ::x10::lang::FinishState* > root,
                                                                        ::x10::lang::Fun_0_0< ::x10::lang::FinishState*>* factory) {
    
    //#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(lock)->lock();
    
    //#line 278 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState* f = this->FMGL(map)->getOrElse(root,
                                                             ::x10aux::class_cast_unchecked< ::x10::lang::FinishState*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                  f))) {
        
        //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        this->FMGL(lock)->unlock();
        
        //#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        return f;
        
    }
    
    //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    f = ::x10::lang::Fun_0_0< ::x10::lang::FinishState*>::__apply(::x10aux::nullCheck(factory));
    
    //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(map)->put(root, f);
    
    //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(lock)->unlock();
    
    //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    return f;
    
}

//#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishStates::remove(::x10::lang::GlobalRef< ::x10::lang::FinishState* > root) {
    
    //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(lock)->lock();
    
    //#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(map)->remove(root);
    
    //#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(lock)->unlock();
}

//#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::FinishState__FinishStates* x10::lang::FinishState__FinishStates::x10__lang__FinishState__FinishStates____this__x10__lang__FinishState__FinishStates(
  ) {
    return this;
    
}
void x10::lang::FinishState__FinishStates::_constructor() {
    this->x10::lang::FinishState__FinishStates::__fieldInitializers_x10_lang_FinishState_FinishStates();
}
::x10::lang::FinishState__FinishStates* x10::lang::FinishState__FinishStates::_make(
  ) {
    ::x10::lang::FinishState__FinishStates* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishStates>()) ::x10::lang::FinishState__FinishStates();
    this_->_constructor();
    return this_;
}


void x10::lang::FinishState__FinishStates::__fieldInitializers_x10_lang_FinishState_FinishStates(
  ) {
    this->FMGL(map) = (__extension__ ({
        
        //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::util::HashMap< ::x10::lang::GlobalRef< ::x10::lang::FinishState* >, ::x10::lang::FinishState*>* alloc__92648 =
           (new (::x10aux::alloc_z< ::x10::util::HashMap< ::x10::lang::GlobalRef< ::x10::lang::FinishState* >, ::x10::lang::FinishState*> >()) ::x10::util::HashMap< ::x10::lang::GlobalRef< ::x10::lang::FinishState* >, ::x10::lang::FinishState*>());
        (alloc__92648)->::x10::util::HashMap< ::x10::lang::GlobalRef< ::x10::lang::FinishState* >, ::x10::lang::FinishState*>::_constructor();
        alloc__92648;
    }))
    ;
    this->FMGL(lock) = &_Embed_lock;
    _Embed_lock._constructor();
}
const ::x10aux::serialization_id_t x10::lang::FinishState__FinishStates::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::FinishState__FinishStates::_deserializer);

void x10::lang::FinishState__FinishStates::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(map));
    buf.write(this->FMGL(lock));
    
}

::x10::lang::Reference* ::x10::lang::FinishState__FinishStates::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState__FinishStates* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishStates>()) ::x10::lang::FinishState__FinishStates();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::FinishState__FinishStates::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(map) = buf.read< ::x10::util::HashMap< ::x10::lang::GlobalRef< ::x10::lang::FinishState* >, ::x10::lang::FinishState*>*>();
    FMGL(lock) = buf.read< ::x10::util::concurrent::Lock*>();
}

::x10aux::RuntimeType x10::lang::FinishState__FinishStates::rtt;
void x10::lang::FinishState__FinishStates::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.lang.FinishState.FinishStates",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of FinishState$FinishStates */
/*************************************************/
/*************************************************/
/* START of FinishState$RootFinishSkeleton */
#include <x10/lang/FinishState__RootFinishSkeleton.h>

#include <x10/lang/FinishState.h>
#include <x10/lang/Runtime__Mortal.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/Place.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/lang/Any.h>
#include <x10/compiler/Synthetic.h>

//#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::GlobalRef< ::x10::lang::FinishState* > x10::lang::FinishState__RootFinishSkeleton::ref(
  ) {
    return this->FMGL(xxxx);
    
}

//#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
x10_boolean x10::lang::FinishState__RootFinishSkeleton::notifyActivityCreation(
  ::x10::lang::Place srcPlace) {
    return true;
    
}

//#line 302 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RootFinishSkeleton::runAt(::x10::lang::Place place,
                                                       ::x10::lang::VoidFun_0_0* body,
                                                       ::x10::lang::Runtime__Profile* prof) {
    
    //#line 303 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Runtime::runAtNonResilient(place, body, prof);
}

//#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::Any* x10::lang::FinishState__RootFinishSkeleton::evalAt(
  ::x10::lang::Place place, ::x10::lang::Fun_0_0< ::x10::lang::Any*>* body,
  ::x10::lang::Runtime__Profile* prof) {
    
    //#line 306 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    return ::x10::lang::Runtime::evalAtNonResilient(place,
                                                    body,
                                                    prof);
    
}

//#line 298 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::FinishState__RootFinishSkeleton* x10::lang::FinishState__RootFinishSkeleton::x10__lang__FinishState__RootFinishSkeleton____this__x10__lang__FinishState__RootFinishSkeleton(
  ) {
    return this;
    
}
void x10::lang::FinishState__RootFinishSkeleton::_constructor(
  ) {
    ::x10::lang::FinishState* this__102404 = this;
    ::x10::lang::FinishState__RootFinishSkeleton* this__102403 =
      this;
    ::x10aux::nullCheck(this__102403)->FMGL(xxxx) = ::x10::lang::GlobalRef< ::x10::lang::FinishState* >(reinterpret_cast< ::x10::lang::FinishState*>(this__102403));
}

void x10::lang::FinishState__RootFinishSkeleton::__fieldInitializers_x10_lang_FinishState_RootFinishSkeleton(
  ) {
    this->FMGL(xxxx) = ::x10::lang::GlobalRef< ::x10::lang::FinishState* >(reinterpret_cast< ::x10::lang::FinishState*>(this));
}
void x10::lang::FinishState__RootFinishSkeleton::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::FinishState::_serialize_body(buf);
    buf.write(this->FMGL(xxxx));
    
}

void x10::lang::FinishState__RootFinishSkeleton::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState::_deserialize_body(buf);
    FMGL(xxxx) = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState* > >();
}

::x10aux::RuntimeType x10::lang::FinishState__RootFinishSkeleton::rtt;
void x10::lang::FinishState__RootFinishSkeleton::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::FinishState>(), ::x10aux::getRTT< ::x10::lang::Runtime__Mortal>()};
    rtt.initStageTwo("x10.lang.FinishState.RootFinishSkeleton",::x10aux::RuntimeType::class_kind, 2, parents, 0, NULL, NULL);
}

/* END of FinishState$RootFinishSkeleton */
/*************************************************/
/*************************************************/
/* START of FinishState$RemoteFinishSkeleton */
#include <x10/lang/FinishState__RemoteFinishSkeleton.h>

#include <x10/lang/FinishState.h>
#include <x10/lang/GlobalRef.h>
#include <x10/util/concurrent/SimpleLatch.h>
#include <x10/lang/Place.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/lang/Any.h>
#include <x10/compiler/Synthetic.h>

//#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RemoteFinishSkeleton::_constructor(::x10::lang::GlobalRef< ::x10::lang::FinishState* > root) {
    ::x10::lang::FinishState* this__102406 = this;
    
    //#line 311 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__RemoteFinishSkeleton* this__102405 = this;
    
    //#line 314 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(xxxx) = root;
}


//#line 316 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::GlobalRef< ::x10::lang::FinishState* > x10::lang::FinishState__RemoteFinishSkeleton::ref(
  ) {
    return this->FMGL(xxxx);
    
}

//#line 317 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RemoteFinishSkeleton::waitForFinish(
  ) {
    #ifndef NO_ASSERTIONS
    if (::x10aux::x10__assertions_enabled)
        ::x10aux::x10__assert(false);
    #endif//NO_ASSERTIONS
    
}

//#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::util::concurrent::SimpleLatch* x10::lang::FinishState__RemoteFinishSkeleton::simpleLatch(
  ) {
    return ::x10aux::class_cast_unchecked< ::x10::util::concurrent::SimpleLatch*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
    
}

//#line 319 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RemoteFinishSkeleton::runAt(
  ::x10::lang::Place place, ::x10::lang::VoidFun_0_0* body,
  ::x10::lang::Runtime__Profile* prof) {
    
    //#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Runtime::runAtNonResilient(place, body, prof);
}

//#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::Any* x10::lang::FinishState__RemoteFinishSkeleton::evalAt(
  ::x10::lang::Place place, ::x10::lang::Fun_0_0< ::x10::lang::Any*>* body,
  ::x10::lang::Runtime__Profile* prof) {
    
    //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    return ::x10::lang::Runtime::evalAtNonResilient(place,
                                                    body,
                                                    prof);
    
}

//#line 311 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::FinishState__RemoteFinishSkeleton* x10::lang::FinishState__RemoteFinishSkeleton::x10__lang__FinishState__RemoteFinishSkeleton____this__x10__lang__FinishState__RemoteFinishSkeleton(
  ) {
    return this;
    
}
void x10::lang::FinishState__RemoteFinishSkeleton::__fieldInitializers_x10_lang_FinishState_RemoteFinishSkeleton(
  ) {
 
}
void x10::lang::FinishState__RemoteFinishSkeleton::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::FinishState::_serialize_body(buf);
    buf.write(this->FMGL(xxxx));
    
}

void x10::lang::FinishState__RemoteFinishSkeleton::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState::_deserialize_body(buf);
    FMGL(xxxx) = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState* > >();
}

::x10aux::RuntimeType x10::lang::FinishState__RemoteFinishSkeleton::rtt;
void x10::lang::FinishState__RemoteFinishSkeleton::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::FinishState>()};
    rtt.initStageTwo("x10.lang.FinishState.RemoteFinishSkeleton",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of FinishState$RemoteFinishSkeleton */
/*************************************************/
/*************************************************/
/* START of FinishState$FinishSkeleton */
#include <x10/lang/FinishState__FinishSkeleton.h>

#include <x10/lang/FinishState.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/FinishState__RootFinishSkeleton.h>
#include <x10/io/Serializer.h>
#include <x10/lang/Any.h>
#include <x10/lang/Place.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Exception.h>
#include <x10/util/concurrent/SimpleLatch.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/compiler/Synthetic.h>

//#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 330 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishSkeleton::_constructor(::x10::lang::FinishState__RootFinishSkeleton* root) {
    ::x10::lang::FinishState* this__102408 = this;
    
    //#line 331 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    FMGL(ref) = ::x10aux::nullCheck(root)->ref();
    
    //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__FinishSkeleton* this__102407 = this;
    ::x10aux::nullCheck(this__102407)->FMGL(me) = (::x10aux::class_cast_unchecked< ::x10::lang::FinishState*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 332 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(me) = root;
}


//#line 334 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishSkeleton::_constructor(::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref) {
    ::x10::lang::FinishState* this__102410 = this;
    
    //#line 335 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    FMGL(ref) = ref;
    
    //#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__FinishSkeleton* this__102409 = this;
    ::x10aux::nullCheck(this__102409)->FMGL(me) = (::x10aux::class_cast_unchecked< ::x10::lang::FinishState*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 336 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(me) = (::x10aux::class_cast_unchecked< ::x10::lang::FinishState*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}


//#line 338 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishSkeleton::serialize(::x10::io::Serializer* s) {
    
    //#line 339 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(s)->x10::io::Serializer::writeAny(::x10aux::class_cast_unchecked< ::x10::lang::Any*>(this->FMGL(ref)));
}

//#line 341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishSkeleton::notifySubActivitySpawn(::x10::lang::Place place) {
    ::x10aux::nullCheck(this->FMGL(me))->notifySubActivitySpawn(place);
}

//#line 342 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
x10_boolean x10::lang::FinishState__FinishSkeleton::notifyActivityCreation(
  ::x10::lang::Place srcPlace) {
    return ::x10aux::nullCheck(this->FMGL(me))->notifyActivityCreation(srcPlace);
    
}

//#line 343 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishSkeleton::notifyActivityTermination() {
    ::x10aux::nullCheck(this->FMGL(me))->notifyActivityTermination();
}

//#line 344 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishSkeleton::pushException(::x10::lang::Exception* t) {
    ::x10aux::nullCheck(this->FMGL(me))->pushException(t);
}

//#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishSkeleton::waitForFinish() {
    ::x10aux::nullCheck(this->FMGL(me))->waitForFinish();
}

//#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::util::concurrent::SimpleLatch* x10::lang::FinishState__FinishSkeleton::simpleLatch(
  ) {
    return ::x10aux::nullCheck(this->FMGL(me))->simpleLatch();
    
}

//#line 347 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishSkeleton::runAt(::x10::lang::Place place,
                                                   ::x10::lang::VoidFun_0_0* body,
                                                   ::x10::lang::Runtime__Profile* prof) {
    
    //#line 348 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Runtime::runAtNonResilient(place, body, prof);
}

//#line 350 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::Any* x10::lang::FinishState__FinishSkeleton::evalAt(
  ::x10::lang::Place place, ::x10::lang::Fun_0_0< ::x10::lang::Any*>* body,
  ::x10::lang::Runtime__Profile* prof) {
    
    //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    return ::x10::lang::Runtime::evalAtNonResilient(place,
                                                    body,
                                                    prof);
    
}

//#line 328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::FinishState__FinishSkeleton* x10::lang::FinishState__FinishSkeleton::x10__lang__FinishState__FinishSkeleton____this__x10__lang__FinishState__FinishSkeleton(
  ) {
    return this;
    
}
void x10::lang::FinishState__FinishSkeleton::__fieldInitializers_x10_lang_FinishState_FinishSkeleton(
  ) {
    this->FMGL(me) = (::x10aux::class_cast_unchecked< ::x10::lang::FinishState*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
void x10::lang::FinishState__FinishSkeleton::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::FinishState::_serialize_body(buf);
    buf.write(this->FMGL(ref));
    
}

void x10::lang::FinishState__FinishSkeleton::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState::_deserialize_body(buf);
    FMGL(ref) = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState* > >();
}

::x10aux::RuntimeType x10::lang::FinishState__FinishSkeleton::rtt;
void x10::lang::FinishState__FinishSkeleton::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::FinishState>()};
    rtt.initStageTwo("x10.lang.FinishState.FinishSkeleton",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of FinishState$FinishSkeleton */
/*************************************************/
/*************************************************/
/* START of FinishState$Finish */
#include <x10/lang/FinishState__Finish.h>

#include <x10/lang/FinishState__FinishSkeleton.h>
#include <x10/io/CustomSerialization.h>
#include <x10/lang/FinishState__RootFinish.h>
#include <x10/lang/FinishState__RootFinishSkeleton.h>
#include <x10/util/concurrent/SimpleLatch.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/FinishState.h>
#include <x10/io/Deserializer.h>
#include <x10/lang/Any.h>
#include <x10/lang/Place.h>
#include <x10/lang/Long.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/FinishState__FinishStates.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/lang/FinishState__RemoteFinish.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_FINISHSTATE__FINISH__CLOSURE__10_CLOSURE
#define X10_LANG_FINISHSTATE__FINISH__CLOSURE__10_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
class x10_lang_FinishState__Finish__closure__10 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_0< ::x10::lang::FinishState__RemoteFinish*>::itable<x10_lang_FinishState__Finish__closure__10> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::FinishState__RemoteFinish* __apply() {
        ::x10::lang::FinishState__RemoteFinish* alloc__102414 =  (new (::x10aux::alloc_z< ::x10::lang::FinishState__RemoteFinish>()) ::x10::lang::FinishState__RemoteFinish());
        (alloc__102414)->::x10::lang::FinishState__RemoteFinish::_constructor(
          _ref);
        return alloc__102414;
        
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState* > _ref;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->_ref);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__Finish__closure__10* storage = ::x10aux::alloc_z<x10_lang_FinishState__Finish__closure__10>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState* > that__ref = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState* > >();
        x10_lang_FinishState__Finish__closure__10* this_ = new (storage) x10_lang_FinishState__Finish__closure__10(that__ref);
        return this_;
    }
    
    x10_lang_FinishState__Finish__closure__10(::x10::lang::GlobalRef< ::x10::lang::FinishState* > _ref) : _ref(_ref) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::FinishState__RemoteFinish*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::FinishState__RemoteFinish*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:375";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISH__CLOSURE__10_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISH__CLOSURE__9_CLOSURE
#define X10_LANG_FINISHSTATE__FINISH__CLOSURE__9_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
class x10_lang_FinishState__Finish__closure__9 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_0< ::x10::lang::FinishState*>::itable<x10_lang_FinishState__Finish__closure__9> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::FinishState* __apply() {
        return reinterpret_cast< ::x10::lang::FinishState*>(x10_lang_FinishState__Finish__closure__10(_ref).__apply());
        
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState* > _ref;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->_ref);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__Finish__closure__9* storage = ::x10aux::alloc_z<x10_lang_FinishState__Finish__closure__9>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState* > that__ref = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState* > >();
        x10_lang_FinishState__Finish__closure__9* this_ = new (storage) x10_lang_FinishState__Finish__closure__9(that__ref);
        return this_;
    }
    
    x10_lang_FinishState__Finish__closure__9(::x10::lang::GlobalRef< ::x10::lang::FinishState* > _ref) : _ref(_ref) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::FinishState*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::FinishState*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:375";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISH__CLOSURE__9_CLOSURE
::x10::io::CustomSerialization::itable< ::x10::lang::FinishState__Finish >  x10::lang::FinishState__Finish::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::FinishState__FinishSkeleton::serialize, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::lang::FinishState__Finish >  x10::lang::FinishState__Finish::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::lang::FinishState__Finish::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::CustomSerialization>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::FinishState__Finish")};

//#line 357 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__Finish::_constructor(::x10::lang::FinishState__RootFinish* root) {
    
    //#line 358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    (this)->::x10::lang::FinishState__FinishSkeleton::_constructor(reinterpret_cast< ::x10::lang::FinishState__RootFinishSkeleton*>(root));
    
    //#line 357 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    
    //#line 356 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__Finish* this__102411 = this;
    
}
::x10::lang::FinishState__Finish* x10::lang::FinishState__Finish::_make(::x10::lang::FinishState__RootFinish* root)
{
    ::x10::lang::FinishState__Finish* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__Finish>()) ::x10::lang::FinishState__Finish();
    this_->_constructor(root);
    return this_;
}



//#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__Finish::_constructor(::x10::util::concurrent::SimpleLatch* latch) {
    
    //#line 361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    (this)->::x10::lang::FinishState__Finish::_constructor((__extension__ ({
                                                               ::x10::lang::FinishState__RootFinish* alloc__92649 =
                                                                 
                                                               (new (::x10aux::alloc_z< ::x10::lang::FinishState__RootFinish>()) ::x10::lang::FinishState__RootFinish());
                                                               (alloc__92649)->::x10::lang::FinishState__RootFinish::_constructor(
                                                                 latch);
                                                               alloc__92649;
                                                           }))
                                                           );
    
}
::x10::lang::FinishState__Finish* x10::lang::FinishState__Finish::_make(
  ::x10::util::concurrent::SimpleLatch* latch) {
    ::x10::lang::FinishState__Finish* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__Finish>()) ::x10::lang::FinishState__Finish();
    this_->_constructor(latch);
    return this_;
}



//#line 363 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__Finish::_constructor() {
    
    //#line 364 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    (this)->::x10::lang::FinishState__Finish::_constructor(
      (__extension__ ({
          ::x10::lang::FinishState__RootFinish* alloc__92650 =
             (new (::x10aux::alloc_z< ::x10::lang::FinishState__RootFinish>()) ::x10::lang::FinishState__RootFinish());
          (alloc__92650)->::x10::lang::FinishState__RootFinish::_constructor();
          alloc__92650;
      }))
      );
    
}
::x10::lang::FinishState__Finish* x10::lang::FinishState__Finish::_make(
  ) {
    ::x10::lang::FinishState__Finish* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__Finish>()) ::x10::lang::FinishState__Finish();
    this_->_constructor();
    return this_;
}



//#line 366 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__Finish::_constructor(::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref) {
    
    //#line 367 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    (this)->::x10::lang::FinishState__FinishSkeleton::_constructor(
      ref);
    
    //#line 366 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    
    //#line 356 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__Finish* this__102412 = this;
    
}
::x10::lang::FinishState__Finish* x10::lang::FinishState__Finish::_make(
  ::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref)
{
    ::x10::lang::FinishState__Finish* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__Finish>()) ::x10::lang::FinishState__Finish();
    this_->_constructor(ref);
    return this_;
}



//#line 369 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__Finish::_constructor(::x10::io::Deserializer* ds) {
    
    //#line 370 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    (this)->::x10::lang::FinishState__FinishSkeleton::_constructor(
      ::x10aux::class_cast< ::x10::lang::GlobalRef< ::x10::lang::FinishState* > >(::x10aux::nullCheck(ds)->x10::io::Deserializer::readAny()));
    
    //#line 369 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    
    //#line 356 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__Finish* this__102413 = this;
    
    //#line 371 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(::x10::lang::Place::place((this->FMGL(ref))->location)->FMGL(id),
                                 ((x10_long)::x10aux::here))))
    {
        
        //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        this->FMGL(me) = (this->FMGL(ref))->__apply();
    } else {
        
        //#line 374 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::GlobalRef< ::x10::lang::FinishState* > _ref =
          this->FMGL(ref);
        
        //#line 375 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        this->FMGL(me) = ::x10::lang::Runtime::FMGL(finishStates__get)()->__apply(
                           this->FMGL(ref), reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::lang::FinishState*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::lang::FinishState*> >(sizeof(x10_lang_FinishState__Finish__closure__9)))x10_lang_FinishState__Finish__closure__9(_ref))));
    }
    
}
::x10::lang::FinishState__Finish* x10::lang::FinishState__Finish::_make(
  ::x10::io::Deserializer* ds) {
    ::x10::lang::FinishState__Finish* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__Finish>()) ::x10::lang::FinishState__Finish();
    this_->_constructor(ds);
    return this_;
}



//#line 356 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::FinishState__Finish* x10::lang::FinishState__Finish::x10__lang__FinishState__Finish____this__x10__lang__FinishState__Finish(
  ) {
    return this;
    
}
void x10::lang::FinishState__Finish::__fieldInitializers_x10_lang_FinishState_Finish(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::FinishState__Finish::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::FinishState__Finish::_deserializer);

void x10::lang::FinishState__Finish::_serialize_body(::x10aux::serialization_buffer& buf) {
    /* NOTE: Implements x10.io.CustomSerialization */
    ::x10::io::Serializer* x10_buf = ::x10::io::Serializer::_make(&buf);
    this->serialize(x10_buf);
    buf.write(::x10aux::deserialization_buffer::CUSTOM_SERIALIZATION_END);
    
}

::x10::lang::Reference* ::x10::lang::FinishState__Finish::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState__Finish* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__Finish>()) ::x10::lang::FinishState__Finish();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::FinishState__Finish::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    /* NOTE: Implements x10.io.CustomSerialization */
    ::x10::io::Deserializer* x10_buf = ::x10::io::Deserializer::_make(&buf);
    _constructor(x10_buf);
    ::x10aux::serialization_id_t tmp = buf.read< ::x10aux::serialization_id_t>();
    if (tmp != ::x10aux::deserialization_buffer::CUSTOM_SERIALIZATION_END) { ::x10aux::raiseSerializationProtocolError(); }
    
}

::x10aux::RuntimeType x10::lang::FinishState__Finish::rtt;
void x10::lang::FinishState__Finish::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::FinishState__FinishSkeleton>(), ::x10aux::getRTT< ::x10::io::CustomSerialization>()};
    rtt.initStageTwo("x10.lang.FinishState.Finish",::x10aux::RuntimeType::class_kind, 2, parents, 0, NULL, NULL);
}

::x10::lang::Fun_0_0< ::x10::lang::FinishState__RemoteFinish*>::itable<x10_lang_FinishState__Finish__closure__10>x10_lang_FinishState__Finish__closure__10::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__Finish__closure__10::__apply, &x10_lang_FinishState__Finish__closure__10::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__Finish__closure__10::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::FinishState__RemoteFinish*> >, &x10_lang_FinishState__Finish__closure__10::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__Finish__closure__10::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__Finish__closure__10::_deserialize);

::x10::lang::Fun_0_0< ::x10::lang::FinishState*>::itable<x10_lang_FinishState__Finish__closure__9>x10_lang_FinishState__Finish__closure__9::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__Finish__closure__9::__apply, &x10_lang_FinishState__Finish__closure__9::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__Finish__closure__9::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::FinishState*> >, &x10_lang_FinishState__Finish__closure__9::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__Finish__closure__9::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__Finish__closure__9::_deserialize);

/* END of FinishState$Finish */
/*************************************************/
/*************************************************/
/* START of FinishState$RootFinish */
#include <x10/lang/FinishState__RootFinish.h>

#include <x10/lang/FinishState__RootFinishSkeleton.h>
#include <x10/util/concurrent/SimpleLatch.h>
#include <x10/lang/Int.h>
#include <x10/lang/Long.h>
#include <x10/compiler/Embed.h>
#include <x10/util/GrowableRail.h>
#include <x10/lang/Exception.h>
#include <x10/util/HashMap.h>
#include <x10/lang/Place.h>
#include <x10/util/concurrent/Lock.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/FinishState.h>
#include <x10/util/Box.h>
#include <x10/lang/Iterator.h>
#include <x10/util/Map__Entry.h>
#include <x10/lang/Iterable.h>
#include <x10/util/Set.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Runtime__Worker.h>
#include <x10/lang/Thread.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/FinishState__FinishStates.h>
#include <x10/compiler/RemoteInvocation.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/lang/Unsafe.h>
#include <x10/lang/MultipleExceptions.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Byte.h>
#include <x10/io/Deserializer.h>
#include <x10/lang/Any.h>
#include <x10/util/Pair.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_FINISHSTATE__ROOTFINISH__CLOSURE__11_CLOSURE
#define X10_LANG_FINISHSTATE__ROOTFINISH__CLOSURE__11_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__RootFinish__closure__11 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__RootFinish__closure__11> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10::lang::Runtime::FMGL(finishStates__get)()->remove(root);
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState* > root;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->root);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__RootFinish__closure__11* storage = ::x10aux::alloc_z<x10_lang_FinishState__RootFinish__closure__11>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState* > that_root = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState* > >();
        x10_lang_FinishState__RootFinish__closure__11* this_ = new (storage) x10_lang_FinishState__RootFinish__closure__11(that_root);
        return this_;
    }
    
    x10_lang_FinishState__RootFinish__closure__11(::x10::lang::GlobalRef< ::x10::lang::FinishState* > root) : root(root) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:443";
    }

};

#endif // X10_LANG_FINISHSTATE__ROOTFINISH__CLOSURE__11_CLOSURE
::x10::lang::Runtime__Mortal::itable< ::x10::lang::FinishState__RootFinish >  x10::lang::FinishState__RootFinish::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::lang::FinishState__RootFinish >  x10::lang::FinishState__RootFinish::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::lang::FinishState__RootFinish::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Runtime__Mortal>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::FinishState__RootFinish")};

//#line 381 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 382 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 383 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 385 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 387 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RootFinish::_constructor() {
    (this)->::x10::lang::FinishState__RootFinishSkeleton::_constructor();
    
    //#line 380 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__RootFinish* this__102415 = this;
    ::x10aux::nullCheck(this__102415)->FMGL(latch) = (::x10aux::class_cast_unchecked< ::x10::util::concurrent::SimpleLatch*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    ::x10aux::nullCheck(this__102415)->FMGL(count) = ((x10_int)1);
    ::x10aux::nullCheck(this__102415)->FMGL(exceptions) = (::x10aux::class_cast_unchecked< ::x10::util::GrowableRail< ::x10::lang::Exception*>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    ::x10aux::nullCheck(this__102415)->FMGL(remoteActivities) = (::x10aux::class_cast_unchecked< ::x10::util::HashMap<x10_long, x10_int>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(latch) = &_Embed_latch;
    _Embed_latch._constructor();
}
::x10::lang::FinishState__RootFinish* x10::lang::FinishState__RootFinish::_make(
  ) {
    ::x10::lang::FinishState__RootFinish* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__RootFinish>()) ::x10::lang::FinishState__RootFinish();
    this_->_constructor();
    return this_;
}



//#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RootFinish::_constructor(::x10::util::concurrent::SimpleLatch* latch) {
    (this)->::x10::lang::FinishState__RootFinishSkeleton::_constructor();
    
    //#line 380 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__RootFinish* this__102416 = this;
    ::x10aux::nullCheck(this__102416)->FMGL(latch) = (::x10aux::class_cast_unchecked< ::x10::util::concurrent::SimpleLatch*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    ::x10aux::nullCheck(this__102416)->FMGL(count) = ((x10_int)1);
    ::x10aux::nullCheck(this__102416)->FMGL(exceptions) = (::x10aux::class_cast_unchecked< ::x10::util::GrowableRail< ::x10::lang::Exception*>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    ::x10aux::nullCheck(this__102416)->FMGL(remoteActivities) = (::x10aux::class_cast_unchecked< ::x10::util::HashMap<x10_long, x10_int>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(latch) = latch;
}
::x10::lang::FinishState__RootFinish* x10::lang::FinishState__RootFinish::_make(
  ::x10::util::concurrent::SimpleLatch* latch) {
    ::x10::lang::FinishState__RootFinish* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__RootFinish>()) ::x10::lang::FinishState__RootFinish();
    this_->_constructor(latch);
    return this_;
}



//#line 393 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RootFinish::notifySubActivitySpawn(::x10::lang::Place place) {
    
    //#line 394 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Place p = place->x10::lang::Place::parent();
    
    //#line 395 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->lock();
    
    //#line 396 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(p, ::x10::lang::Place::place((this->ref())->location))))
    {
        
        //#line 397 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        this->FMGL(count) = ((this->FMGL(count)) + (((x10_int)1)));
        
        //#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(this->FMGL(latch))->unlock();
        
        //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        return;
    }
    
    //#line 401 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(this->FMGL(remoteActivities), reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        
        //#line 402 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        this->FMGL(remoteActivities) = (__extension__ ({
            ::x10::util::HashMap<x10_long, x10_int>* alloc__92652 =
               (new (::x10aux::alloc_z< ::x10::util::HashMap<x10_long, x10_int> >()) ::x10::util::HashMap<x10_long, x10_int>());
            (alloc__92652)->::x10::util::HashMap<x10_long, x10_int>::_constructor();
            alloc__92652;
        }))
        ;
    }
    
    //#line 404 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(remoteActivities))->put(
      p->FMGL(id), ((::x10aux::nullCheck(this->FMGL(remoteActivities))->getOrElse(
                       p->FMGL(id), ((x10_int)0))) + (((x10_int)1))));
    
    //#line 405 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->unlock();
}

//#line 407 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RootFinish::notifyActivityTermination(
  ) {
    
    //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->lock();
    
    //#line 409 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((!::x10aux::struct_equals((this->FMGL(count) = ((this->FMGL(count)) - (((x10_int)1)))),
                                  ((x10_int)0)))) {
        
        //#line 410 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(this->FMGL(latch))->unlock();
        
        //#line 411 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        return;
    }
    
    //#line 413 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (((!::x10aux::struct_equals(this->FMGL(remoteActivities),
                                   reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))) &&
        (!::x10aux::struct_equals(::x10aux::nullCheck(this->FMGL(remoteActivities))->size(),
                                  ((x10_long)0ll))))) {
        
        //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        {
            ::x10::lang::Iterator< ::x10::util::Map__Entry<x10_long, x10_int>*>* entry__92682;
            for (entry__92682 = ::x10::util::Set< ::x10::util::Map__Entry<x10_long, x10_int>*>::iterator(::x10aux::nullCheck(::x10aux::nullCheck(this->FMGL(remoteActivities))->entries()));
                 ::x10::lang::Iterator< ::x10::util::Map__Entry<x10_long, x10_int>*>::hasNext(::x10aux::nullCheck(entry__92682));
                 ) {
                ::x10::util::Map__Entry<x10_long, x10_int>* entry =
                  ::x10::lang::Iterator< ::x10::util::Map__Entry<x10_long, x10_int>*>::next(::x10aux::nullCheck(entry__92682));
                
                //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                if ((!::x10aux::struct_equals(::x10::util::Map__Entry<x10_long, x10_int>::getValue(::x10aux::nullCheck(entry)),
                                              ((x10_int)0))))
                {
                    
                    //#line 416 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    ::x10aux::nullCheck(this->FMGL(latch))->unlock();
                    
                    //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    return;
                }
                
            }
        }
        
    }
    
    //#line 421 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->unlock();
    
    //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->release();
}

//#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RootFinish::process(::x10::lang::Exception* t) {
    
    //#line 425 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                 this->FMGL(exceptions))))
    {
        this->FMGL(exceptions) = (__extension__ ({
            ::x10::util::GrowableRail< ::x10::lang::Exception*>* alloc__92653 =
               (new (::x10aux::alloc_z< ::x10::util::GrowableRail< ::x10::lang::Exception*> >()) ::x10::util::GrowableRail< ::x10::lang::Exception*>());
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            (alloc__92653)->::x10::util::GrowableRail< ::x10::lang::Exception*>::_constructor(
              ((x10_long)0ll));
            alloc__92653;
        }))
        ;
    }
    
    //#line 426 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(exceptions))->x10::util::GrowableRail< ::x10::lang::Exception*>::add(
      t);
}

//#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RootFinish::pushException(::x10::lang::Exception* t) {
    
    //#line 429 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->lock();
    
    //#line 430 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->process(t);
    
    //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->unlock();
}

//#line 433 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RootFinish::waitForFinish() {
    
    //#line 434 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->notifyActivityTermination();
    
    //#line 435 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((!(::x10::lang::Runtime::FMGL(STRICT_FINISH__get)()) &&
        ((::x10::lang::Runtime::FMGL(STATIC_THREADS__get)() ||
         (::x10aux::struct_equals(this->FMGL(remoteActivities),
                                  reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))))))
    {
        
        //#line 436 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck((::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread())))->x10::lang::Runtime__Worker::join(
          this->FMGL(latch));
    }
    
    //#line 438 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->await();
    
    //#line 441 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (((!::x10aux::struct_equals(this->FMGL(remoteActivities),
                                   reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))) &&
        (!::x10aux::struct_equals(::x10aux::nullCheck(this->FMGL(remoteActivities))->size(),
                                  ((x10_long)0ll))))) {
        
        //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::GlobalRef< ::x10::lang::FinishState* > root =
          this->ref();
        
        //#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::VoidFun_0_0* closure = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__RootFinish__closure__11)))x10_lang_FinishState__RootFinish__closure__11(root)));
        
        //#line 444 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(this->FMGL(remoteActivities))->remove(
          ::x10::lang::Place::_make(::x10aux::here)->FMGL(id));
        
        //#line 445 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        {
            ::x10::lang::Iterator<x10_long>* placeId__92684;
            for (placeId__92684 = ::x10::util::Set<x10_long>::iterator(::x10aux::nullCheck(::x10aux::nullCheck(this->FMGL(remoteActivities))->keySet()));
                 ::x10::lang::Iterator<x10_long>::hasNext(::x10aux::nullCheck(placeId__92684));
                 ) {
                x10_long placeId = ::x10::lang::Iterator<x10_long>::next(::x10aux::nullCheck(placeId__92684));
                
                //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                x10_long id__102417 = placeId;
                ::x10::lang::VoidFun_0_0* msgBody__102418 =
                  closure;
                ::x10::lang::Runtime__Profile* prof__102419 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                
                //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                ::x10aux::run_closure_at((x10_int)id__102417, msgBody__102418, reinterpret_cast< ::x10::lang::Runtime__Profile*>(X10_NULL), ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            }
        }
        
        //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::dealloc(closure);
    }
    
    //#line 451 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::MultipleExceptions* t = ::x10::lang::MultipleExceptions::make(
                                           this->FMGL(exceptions));
    
    //#line 452 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                  t))) {
        ::x10aux::throwException(::x10aux::nullCheck(t));
    }
    
}

//#line 457 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RootFinish::process(::x10::util::HashMap<x10_long, x10_int>* remoteMap) {
    
    //#line 459 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    {
        ::x10::lang::Iterator< ::x10::util::Map__Entry<x10_long, x10_int>*>* remoteEntry__92686;
        for (remoteEntry__92686 = ::x10::util::Set< ::x10::util::Map__Entry<x10_long, x10_int>*>::iterator(::x10aux::nullCheck(::x10aux::nullCheck(remoteMap)->entries()));
             ::x10::lang::Iterator< ::x10::util::Map__Entry<x10_long, x10_int>*>::hasNext(::x10aux::nullCheck(remoteEntry__92686));
             ) {
            ::x10::util::Map__Entry<x10_long, x10_int>* remoteEntry =
              ::x10::lang::Iterator< ::x10::util::Map__Entry<x10_long, x10_int>*>::next(::x10aux::nullCheck(remoteEntry__92686));
            
            //#line 460 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10aux::nullCheck(this->FMGL(remoteActivities))->put(
              ::x10::util::Map__Entry<x10_long, x10_int>::getKey(::x10aux::nullCheck(remoteEntry)),
              ((::x10aux::nullCheck(this->FMGL(remoteActivities))->getOrElse(
                  ::x10::util::Map__Entry<x10_long, x10_int>::getKey(::x10aux::nullCheck(remoteEntry)),
                  ((x10_int)0))) + (::x10::util::Map__Entry<x10_long, x10_int>::getValue(::x10aux::nullCheck(remoteEntry)))));
        }
    }
    
    //#line 464 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(count) = ((this->FMGL(count)) + (::x10aux::nullCheck(this->FMGL(remoteActivities))->getOrElse(
                                                  ::x10::lang::Place::place((this->ref())->location)->FMGL(id),
                                                  ((x10_int)0))));
    
    //#line 465 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(remoteActivities))->remove(
      ::x10::lang::Place::place((this->ref())->location)->FMGL(id));
    
    //#line 468 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((!::x10aux::struct_equals(this->FMGL(count), ((x10_int)0))))
    {
        return;
    }
    
    //#line 471 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    {
        ::x10::lang::Iterator< ::x10::util::Map__Entry<x10_long, x10_int>*>* entry__92688;
        for (entry__92688 = ::x10::util::Set< ::x10::util::Map__Entry<x10_long, x10_int>*>::iterator(::x10aux::nullCheck(::x10aux::nullCheck(this->FMGL(remoteActivities))->entries()));
             ::x10::lang::Iterator< ::x10::util::Map__Entry<x10_long, x10_int>*>::hasNext(::x10aux::nullCheck(entry__92688));
             ) {
            ::x10::util::Map__Entry<x10_long, x10_int>* entry =
              ::x10::lang::Iterator< ::x10::util::Map__Entry<x10_long, x10_int>*>::next(::x10aux::nullCheck(entry__92688));
            
            //#line 472 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            if ((!::x10aux::struct_equals(::x10::util::Map__Entry<x10_long, x10_int>::getValue(::x10aux::nullCheck(entry)),
                                          ((x10_int)0))))
            {
                return;
            }
            
        }
    }
    
    //#line 476 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->release();
}

//#line 479 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RootFinish::notify(::x10::lang::Rail< x10_byte >* remoteMapBytes) {
    
    //#line 480 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::util::HashMap<x10_long, x10_int>* remoteMap = ::x10aux::class_cast< ::x10::util::HashMap<x10_long, x10_int>*>((::x10::io::Deserializer::_make(remoteMapBytes))->x10::io::Deserializer::readAny());
    
    //#line 481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->lock();
    
    //#line 482 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->process(remoteMap);
    
    //#line 483 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->unlock();
}

//#line 486 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RootFinish::notify(::x10::lang::Rail< x10_byte >* remoteMapBytes,
                                                ::x10::lang::Exception* t) {
    
    //#line 487 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::util::HashMap<x10_long, x10_int>* remoteMap = ::x10aux::class_cast< ::x10::util::HashMap<x10_long, x10_int>*>((::x10::io::Deserializer::_make(remoteMapBytes))->x10::io::Deserializer::readAny());
    
    //#line 488 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->lock();
    
    //#line 489 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->process(t);
    
    //#line 490 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->process(remoteMap);
    
    //#line 491 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->unlock();
}

//#line 494 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RootFinish::process(::x10::util::Pair<x10_long, x10_int> remoteEntry) {
    
    //#line 496 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(remoteActivities))->put(
      remoteEntry->FMGL(first), ((::x10aux::nullCheck(this->FMGL(remoteActivities))->getOrElse(
                                    remoteEntry->FMGL(first),
                                    ((x10_int)0))) + (remoteEntry->FMGL(second))));
    
    //#line 499 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((!::x10aux::struct_equals(this->FMGL(count), ((x10_int)0))))
    {
        return;
    }
    
    //#line 502 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    {
        ::x10::lang::Iterator< ::x10::util::Map__Entry<x10_long, x10_int>*>* entry__92690;
        for (entry__92690 = ::x10::util::Set< ::x10::util::Map__Entry<x10_long, x10_int>*>::iterator(::x10aux::nullCheck(::x10aux::nullCheck(this->FMGL(remoteActivities))->entries()));
             ::x10::lang::Iterator< ::x10::util::Map__Entry<x10_long, x10_int>*>::hasNext(::x10aux::nullCheck(entry__92690));
             ) {
            ::x10::util::Map__Entry<x10_long, x10_int>* entry =
              ::x10::lang::Iterator< ::x10::util::Map__Entry<x10_long, x10_int>*>::next(::x10aux::nullCheck(entry__92690));
            
            //#line 503 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            if ((!::x10aux::struct_equals(::x10::util::Map__Entry<x10_long, x10_int>::getValue(::x10aux::nullCheck(entry)),
                                          ((x10_int)0))))
            {
                return;
            }
            
        }
    }
    
    //#line 507 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->release();
}

//#line 510 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RootFinish::notify(::x10::util::Pair<x10_long, x10_int> remoteEntry) {
    
    //#line 511 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->lock();
    
    //#line 512 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->process(remoteEntry);
    
    //#line 513 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->unlock();
}

//#line 516 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RootFinish::notify(::x10::util::Pair<x10_long, x10_int> remoteEntry,
                                                ::x10::lang::Exception* t) {
    
    //#line 517 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->lock();
    
    //#line 518 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->process(t);
    
    //#line 519 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->process(remoteEntry);
    
    //#line 520 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->unlock();
}

//#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::util::concurrent::SimpleLatch* x10::lang::FinishState__RootFinish::simpleLatch(
  ) {
    return this->FMGL(latch);
    
}

//#line 380 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::FinishState__RootFinish* x10::lang::FinishState__RootFinish::x10__lang__FinishState__RootFinish____this__x10__lang__FinishState__RootFinish(
  ) {
    return this;
    
}
void x10::lang::FinishState__RootFinish::__fieldInitializers_x10_lang_FinishState_RootFinish(
  ) {
    this->FMGL(latch) = (::x10aux::class_cast_unchecked< ::x10::util::concurrent::SimpleLatch*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(count) = ((x10_int)1);
    this->FMGL(exceptions) = (::x10aux::class_cast_unchecked< ::x10::util::GrowableRail< ::x10::lang::Exception*>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(remoteActivities) = (::x10aux::class_cast_unchecked< ::x10::util::HashMap<x10_long, x10_int>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
const ::x10aux::serialization_id_t x10::lang::FinishState__RootFinish::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::FinishState__RootFinish::_deserializer);

void x10::lang::FinishState__RootFinish::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::FinishState__RootFinishSkeleton::_serialize_body(buf);
    buf.write(this->FMGL(count));
    buf.write(this->FMGL(exceptions));
    buf.write(this->FMGL(remoteActivities));
    
}

::x10::lang::Reference* ::x10::lang::FinishState__RootFinish::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState__RootFinish* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__RootFinish>()) ::x10::lang::FinishState__RootFinish();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::FinishState__RootFinish::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState__RootFinishSkeleton::_deserialize_body(buf);
    FMGL(count) = buf.read<x10_int>();
    FMGL(exceptions) = buf.read< ::x10::util::GrowableRail< ::x10::lang::Exception*>*>();
    FMGL(remoteActivities) = buf.read< ::x10::util::HashMap<x10_long, x10_int>*>();
}

::x10aux::RuntimeType x10::lang::FinishState__RootFinish::rtt;
void x10::lang::FinishState__RootFinish::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::FinishState__RootFinishSkeleton>()};
    rtt.initStageTwo("x10.lang.FinishState.RootFinish",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__RootFinish__closure__11>x10_lang_FinishState__RootFinish__closure__11::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__RootFinish__closure__11::__apply, &x10_lang_FinishState__RootFinish__closure__11::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__RootFinish__closure__11::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__RootFinish__closure__11::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__RootFinish__closure__11::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__RootFinish__closure__11::_deserialize);
const ::x10aux::serialization_id_t x10_lang_FinishState__RootFinish__closure__11::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishState__RootFinish__closure__11::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

/* END of FinishState$RootFinish */
/*************************************************/
/*************************************************/
/* START of FinishState$RemoteFinish */
#include <x10/lang/FinishState__RemoteFinish.h>

#include <x10/lang/FinishState__RemoteFinishSkeleton.h>
#include <x10/util/concurrent/Lock.h>
#include <x10/lang/Int.h>
#include <x10/lang/Long.h>
#include <x10/util/concurrent/AtomicInteger.h>
#include <x10/util/GrowableRail.h>
#include <x10/lang/Exception.h>
#include <x10/compiler/Embed.h>
#include <x10/util/HashMap.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/FinishState.h>
#include <x10/lang/Place.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Runtime.h>
#include <x10/util/Box.h>
#include <x10/lang/MultipleExceptions.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/io/Serializer.h>
#include <x10/lang/Any.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Byte.h>
#include <x10/lang/FinishState__RootFinish.h>
#include <x10/compiler/RemoteInvocation.h>
#include <x10/util/Pair.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/lang/Unsafe.h>
#include <x10/lang/FinishState__FinishStates.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_FINISHSTATE__REMOTEFINISH__CLOSURE__12_CLOSURE
#define X10_LANG_FINISHSTATE__REMOTEFINISH__CLOSURE__12_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__RemoteFinish__closure__12 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__RemoteFinish__closure__12> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(::x10::lang::FinishState::deref< ::x10::lang::FinishState__RootFinish* >(
                              ref))->notify(serializedTable, reinterpret_cast< ::x10::lang::Exception*>(t));
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref;
    ::x10::lang::Rail< x10_byte >* serializedTable;
    ::x10::lang::MultipleExceptions* t;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->ref);
        buf.write(this->serializedTable);
        buf.write(this->t);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__RemoteFinish__closure__12* storage = ::x10aux::alloc_z<x10_lang_FinishState__RemoteFinish__closure__12>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState* > that_ref = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState* > >();
        ::x10::lang::Rail< x10_byte >* that_serializedTable = buf.read< ::x10::lang::Rail< x10_byte >*>();
        ::x10::lang::MultipleExceptions* that_t = buf.read< ::x10::lang::MultipleExceptions*>();
        x10_lang_FinishState__RemoteFinish__closure__12* this_ = new (storage) x10_lang_FinishState__RemoteFinish__closure__12(that_ref, that_serializedTable, that_t);
        return this_;
    }
    
    x10_lang_FinishState__RemoteFinish__closure__12(::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref, ::x10::lang::Rail< x10_byte >* serializedTable, ::x10::lang::MultipleExceptions* t) : ref(ref), serializedTable(serializedTable), t(t) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:578";
    }

};

#endif // X10_LANG_FINISHSTATE__REMOTEFINISH__CLOSURE__12_CLOSURE
#ifndef X10_LANG_FINISHSTATE__REMOTEFINISH__CLOSURE__13_CLOSURE
#define X10_LANG_FINISHSTATE__REMOTEFINISH__CLOSURE__13_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__RemoteFinish__closure__13 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__RemoteFinish__closure__13> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(::x10::lang::FinishState::deref< ::x10::lang::FinishState__RootFinish* >(
                              ref))->notify(serializedTable);
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref;
    ::x10::lang::Rail< x10_byte >* serializedTable;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->ref);
        buf.write(this->serializedTable);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__RemoteFinish__closure__13* storage = ::x10aux::alloc_z<x10_lang_FinishState__RemoteFinish__closure__13>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState* > that_ref = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState* > >();
        ::x10::lang::Rail< x10_byte >* that_serializedTable = buf.read< ::x10::lang::Rail< x10_byte >*>();
        x10_lang_FinishState__RemoteFinish__closure__13* this_ = new (storage) x10_lang_FinishState__RemoteFinish__closure__13(that_ref, that_serializedTable);
        return this_;
    }
    
    x10_lang_FinishState__RemoteFinish__closure__13(::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref, ::x10::lang::Rail< x10_byte >* serializedTable) : ref(ref), serializedTable(serializedTable) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:580";
    }

};

#endif // X10_LANG_FINISHSTATE__REMOTEFINISH__CLOSURE__13_CLOSURE
#ifndef X10_LANG_FINISHSTATE__REMOTEFINISH__CLOSURE__14_CLOSURE
#define X10_LANG_FINISHSTATE__REMOTEFINISH__CLOSURE__14_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__RemoteFinish__closure__14 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__RemoteFinish__closure__14> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(::x10::lang::FinishState::deref< ::x10::lang::FinishState__RootFinish* >(
                              ref))->notify(message, reinterpret_cast< ::x10::lang::Exception*>(t));
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref;
    ::x10::util::Pair<x10_long, x10_int> message;
    ::x10::lang::MultipleExceptions* t;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->ref);
        buf.write(this->message);
        buf.write(this->t);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__RemoteFinish__closure__14* storage = ::x10aux::alloc_z<x10_lang_FinishState__RemoteFinish__closure__14>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState* > that_ref = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState* > >();
        ::x10::util::Pair<x10_long, x10_int> that_message = buf.read< ::x10::util::Pair<x10_long, x10_int> >();
        ::x10::lang::MultipleExceptions* that_t = buf.read< ::x10::lang::MultipleExceptions*>();
        x10_lang_FinishState__RemoteFinish__closure__14* this_ = new (storage) x10_lang_FinishState__RemoteFinish__closure__14(that_ref, that_message, that_t);
        return this_;
    }
    
    x10_lang_FinishState__RemoteFinish__closure__14(::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref, ::x10::util::Pair<x10_long, x10_int> message, ::x10::lang::MultipleExceptions* t) : ref(ref), message(message), t(t) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:586";
    }

};

#endif // X10_LANG_FINISHSTATE__REMOTEFINISH__CLOSURE__14_CLOSURE
#ifndef X10_LANG_FINISHSTATE__REMOTEFINISH__CLOSURE__15_CLOSURE
#define X10_LANG_FINISHSTATE__REMOTEFINISH__CLOSURE__15_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__RemoteFinish__closure__15 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__RemoteFinish__closure__15> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(::x10::lang::FinishState::deref< ::x10::lang::FinishState__RootFinish* >(
                              ref))->notify(message);
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref;
    ::x10::util::Pair<x10_long, x10_int> message;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->ref);
        buf.write(this->message);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__RemoteFinish__closure__15* storage = ::x10aux::alloc_z<x10_lang_FinishState__RemoteFinish__closure__15>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState* > that_ref = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState* > >();
        ::x10::util::Pair<x10_long, x10_int> that_message = buf.read< ::x10::util::Pair<x10_long, x10_int> >();
        x10_lang_FinishState__RemoteFinish__closure__15* this_ = new (storage) x10_lang_FinishState__RemoteFinish__closure__15(that_ref, that_message);
        return this_;
    }
    
    x10_lang_FinishState__RemoteFinish__closure__15(::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref, ::x10::util::Pair<x10_long, x10_int> message) : ref(ref), message(message) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:588";
    }

};

#endif // X10_LANG_FINISHSTATE__REMOTEFINISH__CLOSURE__15_CLOSURE

//#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 528 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 529 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 530 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 531 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 533 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RemoteFinish::_constructor(::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref) {
    
    //#line 534 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    (this)->::x10::lang::FinishState__RemoteFinishSkeleton::_constructor(
      ref);
    
    //#line 533 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    
    //#line 526 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->x10::lang::FinishState__RemoteFinish::__fieldInitializers_x10_lang_FinishState_RemoteFinish();
}
::x10::lang::FinishState__RemoteFinish* x10::lang::FinishState__RemoteFinish::_make(
  ::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref) {
    ::x10::lang::FinishState__RemoteFinish* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__RemoteFinish>()) ::x10::lang::FinishState__RemoteFinish();
    this_->_constructor(ref);
    return this_;
}



//#line 536 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
x10_boolean x10::lang::FinishState__RemoteFinish::notifyActivityCreation(
  ::x10::lang::Place srcPlace) {
    
    //#line 537 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(local)->x10::util::concurrent::AtomicInteger::getAndIncrement();
    
    //#line 538 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    return true;
    
}

//#line 540 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RemoteFinish::notifySubActivitySpawn(
  ::x10::lang::Place place) {
    
    //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    x10_long id = ((x10_long)::x10aux::here);
    
    //#line 542 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(lock))->lock();
    
    //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(place->FMGL(id), id))) {
        
        //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        this->FMGL(count) = ((this->FMGL(count)) + (((x10_int)1)));
        
        //#line 545 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(this->FMGL(lock))->unlock();
        
        //#line 546 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        return;
    }
    
    //#line 548 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(this->FMGL(remoteActivities), reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        
        //#line 549 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        this->FMGL(remoteActivities) = (__extension__ ({
            ::x10::util::HashMap<x10_long, x10_int>* alloc__92654 =
               (new (::x10aux::alloc_z< ::x10::util::HashMap<x10_long, x10_int> >()) ::x10::util::HashMap<x10_long, x10_int>());
            (alloc__92654)->::x10::util::HashMap<x10_long, x10_int>::_constructor();
            alloc__92654;
        }))
        ;
    }
    
    //#line 551 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    x10_int old = ::x10aux::nullCheck(this->FMGL(remoteActivities))->getOrElse(
                    place->FMGL(id), ((x10_int)0));
    
    //#line 552 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(remoteActivities))->put(
      place->FMGL(id), ((old) + (((x10_int)1))));
    
    //#line 553 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(lock))->unlock();
}

//#line 555 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RemoteFinish::pushException(
  ::x10::lang::Exception* t) {
    
    //#line 556 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(lock))->lock();
    
    //#line 557 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                 this->FMGL(exceptions))))
    {
        this->FMGL(exceptions) = (__extension__ ({
            ::x10::util::GrowableRail< ::x10::lang::Exception*>* alloc__92655 =
               (new (::x10aux::alloc_z< ::x10::util::GrowableRail< ::x10::lang::Exception*> >()) ::x10::util::GrowableRail< ::x10::lang::Exception*>());
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            (alloc__92655)->::x10::util::GrowableRail< ::x10::lang::Exception*>::_constructor(
              ((x10_long)0ll));
            alloc__92655;
        }))
        ;
    }
    
    //#line 558 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(exceptions))->x10::util::GrowableRail< ::x10::lang::Exception*>::add(
      t);
    
    //#line 559 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(lock))->unlock();
}

//#line 561 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__RemoteFinish::notifyActivityTermination(
  ) {
    
    //#line 562 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(lock))->lock();
    
    //#line 563 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(count) = ((this->FMGL(count)) - (((x10_int)1)));
    
    //#line 564 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (((((x10_long)(this->FMGL(local)->x10::util::concurrent::AtomicInteger::decrementAndGet()))) > (((x10_long)0ll))))
    {
        
        //#line 565 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(this->FMGL(lock))->unlock();
        
        //#line 566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        return;
    }
    
    //#line 568 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::MultipleExceptions* t = ::x10::lang::MultipleExceptions::make(
                                           this->FMGL(exceptions));
    
    //#line 569 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref =
      this->ref();
    
    //#line 570 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::VoidFun_0_0* closure;
    
    //#line 571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (((!::x10aux::struct_equals(this->FMGL(remoteActivities),
                                   reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))) &&
        (!::x10aux::struct_equals(::x10aux::nullCheck(this->FMGL(remoteActivities))->size(),
                                  ((x10_long)0ll))))) {
        
        //#line 572 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(this->FMGL(remoteActivities))->put(
          ::x10::lang::Place::_make(::x10aux::here)->FMGL(id),
          this->FMGL(count));
        
        //#line 574 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::io::Serializer* serializer = ::x10::io::Serializer::_make();
        
        //#line 575 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        serializer->x10::io::Serializer::writeAny(reinterpret_cast< ::x10::lang::Any*>(this->FMGL(remoteActivities)));
        
        //#line 576 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::Rail< x10_byte >* serializedTable = serializer->x10::io::Serializer::toRail();
        
        //#line 577 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                      t))) {
            
            //#line 578 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            closure = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__RemoteFinish__closure__12)))x10_lang_FinishState__RemoteFinish__closure__12(ref, serializedTable, t)));
        } else {
            
            //#line 580 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            closure = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__RemoteFinish__closure__13)))x10_lang_FinishState__RemoteFinish__closure__13(ref, serializedTable)));
        }
        
        //#line 582 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(this->FMGL(remoteActivities))->clear();
    } else {
        
        //#line 584 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::util::Pair<x10_long, x10_int> message =  ::x10::util::Pair<x10_long, x10_int>::_alloc();
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        x10_long first__102420 = ::x10::lang::Place::_make(::x10aux::here)->FMGL(id);
        x10_int second__102421 = this->FMGL(count);
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        message->FMGL(first) = first__102420;
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        message->FMGL(second) = second__102421;
        
        //#line 585 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                      t))) {
            
            //#line 586 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            closure = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__RemoteFinish__closure__14)))x10_lang_FinishState__RemoteFinish__closure__14(ref, message, t)));
        } else {
            
            //#line 588 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            closure = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__RemoteFinish__closure__15)))x10_lang_FinishState__RemoteFinish__closure__15(ref, message)));
        }
        
    }
    
    //#line 591 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(count) = ((x10_int)0);
    
    //#line 592 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(exceptions) = (::x10aux::class_cast_unchecked< ::x10::util::GrowableRail< ::x10::lang::Exception*>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 593 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(lock))->unlock();
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    x10_long id__102422 = ::x10::lang::Place::place((ref)->location)->FMGL(id);
    ::x10::lang::VoidFun_0_0* msgBody__102423 = closure;
    ::x10::lang::Runtime__Profile* prof__102424 = ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
    
    //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::run_closure_at((x10_int)id__102422, msgBody__102423, reinterpret_cast< ::x10::lang::Runtime__Profile*>(X10_NULL), ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 595 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::dealloc(closure);
    
    //#line 596 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Runtime::FMGL(finishStates__get)()->remove(
      ref);
}

//#line 526 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::FinishState__RemoteFinish* x10::lang::FinishState__RemoteFinish::x10__lang__FinishState__RemoteFinish____this__x10__lang__FinishState__RemoteFinish(
  ) {
    return this;
    
}
void x10::lang::FinishState__RemoteFinish::__fieldInitializers_x10_lang_FinishState_RemoteFinish(
  ) {
    this->FMGL(exceptions) = (::x10aux::class_cast_unchecked< ::x10::util::GrowableRail< ::x10::lang::Exception*>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(lock) = &_Embed_lock;
    _Embed_lock._constructor();
    this->FMGL(count) = ((x10_int)0);
    this->FMGL(remoteActivities) = (::x10aux::class_cast_unchecked< ::x10::util::HashMap<x10_long, x10_int>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(local) = &_Embed_local;
    _Embed_local._constructor(((x10_int)0));
}
const ::x10aux::serialization_id_t x10::lang::FinishState__RemoteFinish::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::FinishState__RemoteFinish::_deserializer);

void x10::lang::FinishState__RemoteFinish::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::FinishState__RemoteFinishSkeleton::_serialize_body(buf);
    buf.write(this->FMGL(exceptions));
    buf.write(this->FMGL(count));
    buf.write(this->FMGL(remoteActivities));
    buf.write(this->FMGL(local));
    
}

::x10::lang::Reference* ::x10::lang::FinishState__RemoteFinish::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState__RemoteFinish* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__RemoteFinish>()) ::x10::lang::FinishState__RemoteFinish();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::FinishState__RemoteFinish::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState__RemoteFinishSkeleton::_deserialize_body(buf);
    FMGL(exceptions) = buf.read< ::x10::util::GrowableRail< ::x10::lang::Exception*>*>();
    FMGL(count) = buf.read<x10_int>();
    FMGL(remoteActivities) = buf.read< ::x10::util::HashMap<x10_long, x10_int>*>();
    FMGL(local) = buf.read< ::x10::util::concurrent::AtomicInteger*>();
}

::x10aux::RuntimeType x10::lang::FinishState__RemoteFinish::rtt;
void x10::lang::FinishState__RemoteFinish::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::FinishState__RemoteFinishSkeleton>()};
    rtt.initStageTwo("x10.lang.FinishState.RemoteFinish",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__RemoteFinish__closure__12>x10_lang_FinishState__RemoteFinish__closure__12::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__RemoteFinish__closure__12::__apply, &x10_lang_FinishState__RemoteFinish__closure__12::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__RemoteFinish__closure__12::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__RemoteFinish__closure__12::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__RemoteFinish__closure__12::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__RemoteFinish__closure__12::_deserialize);
const ::x10aux::serialization_id_t x10_lang_FinishState__RemoteFinish__closure__12::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishState__RemoteFinish__closure__12::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__RemoteFinish__closure__13>x10_lang_FinishState__RemoteFinish__closure__13::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__RemoteFinish__closure__13::__apply, &x10_lang_FinishState__RemoteFinish__closure__13::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__RemoteFinish__closure__13::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__RemoteFinish__closure__13::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__RemoteFinish__closure__13::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__RemoteFinish__closure__13::_deserialize);
const ::x10aux::serialization_id_t x10_lang_FinishState__RemoteFinish__closure__13::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishState__RemoteFinish__closure__13::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__RemoteFinish__closure__14>x10_lang_FinishState__RemoteFinish__closure__14::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__RemoteFinish__closure__14::__apply, &x10_lang_FinishState__RemoteFinish__closure__14::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__RemoteFinish__closure__14::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__RemoteFinish__closure__14::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__RemoteFinish__closure__14::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__RemoteFinish__closure__14::_deserialize);
const ::x10aux::serialization_id_t x10_lang_FinishState__RemoteFinish__closure__14::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishState__RemoteFinish__closure__14::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__RemoteFinish__closure__15>x10_lang_FinishState__RemoteFinish__closure__15::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__RemoteFinish__closure__15::__apply, &x10_lang_FinishState__RemoteFinish__closure__15::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__RemoteFinish__closure__15::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__RemoteFinish__closure__15::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__RemoteFinish__closure__15::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__RemoteFinish__closure__15::_deserialize);
const ::x10aux::serialization_id_t x10_lang_FinishState__RemoteFinish__closure__15::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishState__RemoteFinish__closure__15::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

/* END of FinishState$RemoteFinish */
/*************************************************/
/*************************************************/
/* START of FinishState$DenseFinish */
#include <x10/lang/FinishState__DenseFinish.h>

#include <x10/lang/FinishState__FinishSkeleton.h>
#include <x10/io/CustomSerialization.h>
#include <x10/lang/FinishState__RootFinish.h>
#include <x10/lang/FinishState__RootFinishSkeleton.h>
#include <x10/util/concurrent/SimpleLatch.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/FinishState.h>
#include <x10/io/Deserializer.h>
#include <x10/lang/Any.h>
#include <x10/lang/Place.h>
#include <x10/lang/Long.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/FinishState__FinishStates.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/lang/FinishState__DenseRemoteFinish.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_FINISHSTATE__DENSEFINISH__CLOSURE__17_CLOSURE
#define X10_LANG_FINISHSTATE__DENSEFINISH__CLOSURE__17_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
class x10_lang_FinishState__DenseFinish__closure__17 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_0< ::x10::lang::FinishState__DenseRemoteFinish*>::itable<x10_lang_FinishState__DenseFinish__closure__17> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::FinishState__DenseRemoteFinish* __apply() {
        ::x10::lang::FinishState__DenseRemoteFinish* alloc__102428 =  (new (::x10aux::alloc_z< ::x10::lang::FinishState__DenseRemoteFinish>()) ::x10::lang::FinishState__DenseRemoteFinish());
        (alloc__102428)->::x10::lang::FinishState__DenseRemoteFinish::_constructor(
          _ref);
        return alloc__102428;
        
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState* > _ref;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->_ref);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__DenseFinish__closure__17* storage = ::x10aux::alloc_z<x10_lang_FinishState__DenseFinish__closure__17>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState* > that__ref = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState* > >();
        x10_lang_FinishState__DenseFinish__closure__17* this_ = new (storage) x10_lang_FinishState__DenseFinish__closure__17(that__ref);
        return this_;
    }
    
    x10_lang_FinishState__DenseFinish__closure__17(::x10::lang::GlobalRef< ::x10::lang::FinishState* > _ref) : _ref(_ref) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::FinishState__DenseRemoteFinish*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::FinishState__DenseRemoteFinish*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:619";
    }

};

#endif // X10_LANG_FINISHSTATE__DENSEFINISH__CLOSURE__17_CLOSURE
#ifndef X10_LANG_FINISHSTATE__DENSEFINISH__CLOSURE__16_CLOSURE
#define X10_LANG_FINISHSTATE__DENSEFINISH__CLOSURE__16_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
class x10_lang_FinishState__DenseFinish__closure__16 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_0< ::x10::lang::FinishState*>::itable<x10_lang_FinishState__DenseFinish__closure__16> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::FinishState* __apply() {
        return reinterpret_cast< ::x10::lang::FinishState*>(x10_lang_FinishState__DenseFinish__closure__17(_ref).__apply());
        
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState* > _ref;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->_ref);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__DenseFinish__closure__16* storage = ::x10aux::alloc_z<x10_lang_FinishState__DenseFinish__closure__16>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState* > that__ref = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState* > >();
        x10_lang_FinishState__DenseFinish__closure__16* this_ = new (storage) x10_lang_FinishState__DenseFinish__closure__16(that__ref);
        return this_;
    }
    
    x10_lang_FinishState__DenseFinish__closure__16(::x10::lang::GlobalRef< ::x10::lang::FinishState* > _ref) : _ref(_ref) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::FinishState*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::FinishState*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:619";
    }

};

#endif // X10_LANG_FINISHSTATE__DENSEFINISH__CLOSURE__16_CLOSURE
::x10::io::CustomSerialization::itable< ::x10::lang::FinishState__DenseFinish >  x10::lang::FinishState__DenseFinish::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::FinishState__FinishSkeleton::serialize, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::lang::FinishState__DenseFinish >  x10::lang::FinishState__DenseFinish::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::lang::FinishState__DenseFinish::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::CustomSerialization>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::FinishState__DenseFinish")};

//#line 601 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__DenseFinish::_constructor(::x10::lang::FinishState__RootFinish* root) {
    
    //#line 602 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    (this)->::x10::lang::FinishState__FinishSkeleton::_constructor(reinterpret_cast< ::x10::lang::FinishState__RootFinishSkeleton*>(root));
    
    //#line 601 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    
    //#line 600 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__DenseFinish* this__102425 = this;
    
}
::x10::lang::FinishState__DenseFinish* x10::lang::FinishState__DenseFinish::_make(
  ::x10::lang::FinishState__RootFinish* root) {
    ::x10::lang::FinishState__DenseFinish* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__DenseFinish>()) ::x10::lang::FinishState__DenseFinish();
    this_->_constructor(root);
    return this_;
}



//#line 604 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__DenseFinish::_constructor(::x10::util::concurrent::SimpleLatch* latch) {
    
    //#line 605 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    (this)->::x10::lang::FinishState__DenseFinish::_constructor((__extension__ ({
                                                                    ::x10::lang::FinishState__RootFinish* alloc__92656 =
                                                                      
                                                                    (new (::x10aux::alloc_z< ::x10::lang::FinishState__RootFinish>()) ::x10::lang::FinishState__RootFinish());
                                                                    (alloc__92656)->::x10::lang::FinishState__RootFinish::_constructor(
                                                                      latch);
                                                                    alloc__92656;
                                                                }))
                                                                );
    
}
::x10::lang::FinishState__DenseFinish* x10::lang::FinishState__DenseFinish::_make(
  ::x10::util::concurrent::SimpleLatch* latch) {
    ::x10::lang::FinishState__DenseFinish* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__DenseFinish>()) ::x10::lang::FinishState__DenseFinish();
    this_->_constructor(latch);
    return this_;
}



//#line 607 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__DenseFinish::_constructor() {
    
    //#line 608 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    (this)->::x10::lang::FinishState__DenseFinish::_constructor(
      (__extension__ ({
          ::x10::lang::FinishState__RootFinish* alloc__92657 =
             (new (::x10aux::alloc_z< ::x10::lang::FinishState__RootFinish>()) ::x10::lang::FinishState__RootFinish());
          (alloc__92657)->::x10::lang::FinishState__RootFinish::_constructor();
          alloc__92657;
      }))
      );
    
}
::x10::lang::FinishState__DenseFinish* x10::lang::FinishState__DenseFinish::_make(
  ) {
    ::x10::lang::FinishState__DenseFinish* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__DenseFinish>()) ::x10::lang::FinishState__DenseFinish();
    this_->_constructor();
    return this_;
}



//#line 610 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__DenseFinish::_constructor(::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref) {
    
    //#line 611 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    (this)->::x10::lang::FinishState__FinishSkeleton::_constructor(
      ref);
    
    //#line 610 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    
    //#line 600 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__DenseFinish* this__102426 =
      this;
    
}
::x10::lang::FinishState__DenseFinish* x10::lang::FinishState__DenseFinish::_make(
  ::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref)
{
    ::x10::lang::FinishState__DenseFinish* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__DenseFinish>()) ::x10::lang::FinishState__DenseFinish();
    this_->_constructor(ref);
    return this_;
}



//#line 613 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__DenseFinish::_constructor(::x10::io::Deserializer* ds) {
    
    //#line 614 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    (this)->::x10::lang::FinishState__FinishSkeleton::_constructor(
      ::x10aux::class_cast< ::x10::lang::GlobalRef< ::x10::lang::FinishState* > >(::x10aux::nullCheck(ds)->x10::io::Deserializer::readAny()));
    
    //#line 613 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    
    //#line 600 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__DenseFinish* this__102427 =
      this;
    
    //#line 615 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(::x10::lang::Place::place((this->FMGL(ref))->location)->FMGL(id),
                                 ((x10_long)::x10aux::here))))
    {
        
        //#line 616 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        this->FMGL(me) = (this->FMGL(ref))->__apply();
    } else {
        
        //#line 618 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::GlobalRef< ::x10::lang::FinishState* > _ref =
          this->FMGL(ref);
        
        //#line 619 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        this->FMGL(me) = ::x10::lang::Runtime::FMGL(finishStates__get)()->__apply(
                           this->FMGL(ref), reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::lang::FinishState*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::lang::FinishState*> >(sizeof(x10_lang_FinishState__DenseFinish__closure__16)))x10_lang_FinishState__DenseFinish__closure__16(_ref))));
    }
    
}
::x10::lang::FinishState__DenseFinish* x10::lang::FinishState__DenseFinish::_make(
  ::x10::io::Deserializer* ds) {
    ::x10::lang::FinishState__DenseFinish* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__DenseFinish>()) ::x10::lang::FinishState__DenseFinish();
    this_->_constructor(ds);
    return this_;
}



//#line 600 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::FinishState__DenseFinish* x10::lang::FinishState__DenseFinish::x10__lang__FinishState__DenseFinish____this__x10__lang__FinishState__DenseFinish(
  ) {
    return this;
    
}
void x10::lang::FinishState__DenseFinish::__fieldInitializers_x10_lang_FinishState_DenseFinish(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::FinishState__DenseFinish::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::FinishState__DenseFinish::_deserializer);

void x10::lang::FinishState__DenseFinish::_serialize_body(::x10aux::serialization_buffer& buf) {
    /* NOTE: Implements x10.io.CustomSerialization */
    ::x10::io::Serializer* x10_buf = ::x10::io::Serializer::_make(&buf);
    this->serialize(x10_buf);
    buf.write(::x10aux::deserialization_buffer::CUSTOM_SERIALIZATION_END);
    
}

::x10::lang::Reference* ::x10::lang::FinishState__DenseFinish::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState__DenseFinish* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__DenseFinish>()) ::x10::lang::FinishState__DenseFinish();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::FinishState__DenseFinish::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    /* NOTE: Implements x10.io.CustomSerialization */
    ::x10::io::Deserializer* x10_buf = ::x10::io::Deserializer::_make(&buf);
    _constructor(x10_buf);
    ::x10aux::serialization_id_t tmp = buf.read< ::x10aux::serialization_id_t>();
    if (tmp != ::x10aux::deserialization_buffer::CUSTOM_SERIALIZATION_END) { ::x10aux::raiseSerializationProtocolError(); }
    
}

::x10aux::RuntimeType x10::lang::FinishState__DenseFinish::rtt;
void x10::lang::FinishState__DenseFinish::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::FinishState__FinishSkeleton>(), ::x10aux::getRTT< ::x10::io::CustomSerialization>()};
    rtt.initStageTwo("x10.lang.FinishState.DenseFinish",::x10aux::RuntimeType::class_kind, 2, parents, 0, NULL, NULL);
}

::x10::lang::Fun_0_0< ::x10::lang::FinishState__DenseRemoteFinish*>::itable<x10_lang_FinishState__DenseFinish__closure__17>x10_lang_FinishState__DenseFinish__closure__17::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__DenseFinish__closure__17::__apply, &x10_lang_FinishState__DenseFinish__closure__17::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__DenseFinish__closure__17::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::FinishState__DenseRemoteFinish*> >, &x10_lang_FinishState__DenseFinish__closure__17::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__DenseFinish__closure__17::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__DenseFinish__closure__17::_deserialize);

::x10::lang::Fun_0_0< ::x10::lang::FinishState*>::itable<x10_lang_FinishState__DenseFinish__closure__16>x10_lang_FinishState__DenseFinish__closure__16::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__DenseFinish__closure__16::__apply, &x10_lang_FinishState__DenseFinish__closure__16::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__DenseFinish__closure__16::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::FinishState*> >, &x10_lang_FinishState__DenseFinish__closure__16::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__DenseFinish__closure__16::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__DenseFinish__closure__16::_deserialize);

/* END of FinishState$DenseFinish */
/*************************************************/
/*************************************************/
/* START of FinishState$DenseRemoteFinish */
#include <x10/lang/FinishState__DenseRemoteFinish.h>

#include <x10/lang/FinishState__RemoteFinishSkeleton.h>
#include <x10/util/concurrent/Lock.h>
#include <x10/lang/Int.h>
#include <x10/lang/Long.h>
#include <x10/util/concurrent/AtomicInteger.h>
#include <x10/util/GrowableRail.h>
#include <x10/lang/Exception.h>
#include <x10/compiler/Embed.h>
#include <x10/util/HashMap.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/FinishState.h>
#include <x10/lang/Place.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Runtime.h>
#include <x10/util/Box.h>
#include <x10/lang/MultipleExceptions.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/io/Serializer.h>
#include <x10/lang/Any.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Byte.h>
#include <x10/lang/FinishState__RootFinish.h>
#include <x10/compiler/RemoteInvocation.h>
#include <x10/util/Pair.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/lang/Unsafe.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_FINISHSTATE__DENSEREMOTEFINISH__CLOSURE__18_CLOSURE
#define X10_LANG_FINISHSTATE__DENSEREMOTEFINISH__CLOSURE__18_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__DenseRemoteFinish__closure__18 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__DenseRemoteFinish__closure__18> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(::x10::lang::FinishState::deref< ::x10::lang::FinishState__RootFinish* >(
                              ref))->notify(serializedTable, reinterpret_cast< ::x10::lang::Exception*>(t));
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref;
    ::x10::lang::Rail< x10_byte >* serializedTable;
    ::x10::lang::MultipleExceptions* t;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->ref);
        buf.write(this->serializedTable);
        buf.write(this->t);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__DenseRemoteFinish__closure__18* storage = ::x10aux::alloc_z<x10_lang_FinishState__DenseRemoteFinish__closure__18>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState* > that_ref = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState* > >();
        ::x10::lang::Rail< x10_byte >* that_serializedTable = buf.read< ::x10::lang::Rail< x10_byte >*>();
        ::x10::lang::MultipleExceptions* that_t = buf.read< ::x10::lang::MultipleExceptions*>();
        x10_lang_FinishState__DenseRemoteFinish__closure__18* this_ = new (storage) x10_lang_FinishState__DenseRemoteFinish__closure__18(that_ref, that_serializedTable, that_t);
        return this_;
    }
    
    x10_lang_FinishState__DenseRemoteFinish__closure__18(::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref, ::x10::lang::Rail< x10_byte >* serializedTable, ::x10::lang::MultipleExceptions* t) : ref(ref), serializedTable(serializedTable), t(t) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:676";
    }

};

#endif // X10_LANG_FINISHSTATE__DENSEREMOTEFINISH__CLOSURE__18_CLOSURE
#ifndef X10_LANG_FINISHSTATE__DENSEREMOTEFINISH__CLOSURE__19_CLOSURE
#define X10_LANG_FINISHSTATE__DENSEREMOTEFINISH__CLOSURE__19_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__DenseRemoteFinish__closure__19 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__DenseRemoteFinish__closure__19> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(::x10::lang::FinishState::deref< ::x10::lang::FinishState__RootFinish* >(
                              ref))->notify(serializedTable);
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref;
    ::x10::lang::Rail< x10_byte >* serializedTable;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->ref);
        buf.write(this->serializedTable);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__DenseRemoteFinish__closure__19* storage = ::x10aux::alloc_z<x10_lang_FinishState__DenseRemoteFinish__closure__19>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState* > that_ref = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState* > >();
        ::x10::lang::Rail< x10_byte >* that_serializedTable = buf.read< ::x10::lang::Rail< x10_byte >*>();
        x10_lang_FinishState__DenseRemoteFinish__closure__19* this_ = new (storage) x10_lang_FinishState__DenseRemoteFinish__closure__19(that_ref, that_serializedTable);
        return this_;
    }
    
    x10_lang_FinishState__DenseRemoteFinish__closure__19(::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref, ::x10::lang::Rail< x10_byte >* serializedTable) : ref(ref), serializedTable(serializedTable) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:678";
    }

};

#endif // X10_LANG_FINISHSTATE__DENSEREMOTEFINISH__CLOSURE__19_CLOSURE
#ifndef X10_LANG_FINISHSTATE__DENSEREMOTEFINISH__CLOSURE__20_CLOSURE
#define X10_LANG_FINISHSTATE__DENSEREMOTEFINISH__CLOSURE__20_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__DenseRemoteFinish__closure__20 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__DenseRemoteFinish__closure__20> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(::x10::lang::FinishState::deref< ::x10::lang::FinishState__RootFinish* >(
                              ref))->notify(message, reinterpret_cast< ::x10::lang::Exception*>(t));
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref;
    ::x10::util::Pair<x10_long, x10_int> message;
    ::x10::lang::MultipleExceptions* t;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->ref);
        buf.write(this->message);
        buf.write(this->t);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__DenseRemoteFinish__closure__20* storage = ::x10aux::alloc_z<x10_lang_FinishState__DenseRemoteFinish__closure__20>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState* > that_ref = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState* > >();
        ::x10::util::Pair<x10_long, x10_int> that_message = buf.read< ::x10::util::Pair<x10_long, x10_int> >();
        ::x10::lang::MultipleExceptions* that_t = buf.read< ::x10::lang::MultipleExceptions*>();
        x10_lang_FinishState__DenseRemoteFinish__closure__20* this_ = new (storage) x10_lang_FinishState__DenseRemoteFinish__closure__20(that_ref, that_message, that_t);
        return this_;
    }
    
    x10_lang_FinishState__DenseRemoteFinish__closure__20(::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref, ::x10::util::Pair<x10_long, x10_int> message, ::x10::lang::MultipleExceptions* t) : ref(ref), message(message), t(t) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:684";
    }

};

#endif // X10_LANG_FINISHSTATE__DENSEREMOTEFINISH__CLOSURE__20_CLOSURE
#ifndef X10_LANG_FINISHSTATE__DENSEREMOTEFINISH__CLOSURE__21_CLOSURE
#define X10_LANG_FINISHSTATE__DENSEREMOTEFINISH__CLOSURE__21_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__DenseRemoteFinish__closure__21 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__DenseRemoteFinish__closure__21> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(::x10::lang::FinishState::deref< ::x10::lang::FinishState__RootFinish* >(
                              ref))->notify(message);
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref;
    ::x10::util::Pair<x10_long, x10_int> message;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->ref);
        buf.write(this->message);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__DenseRemoteFinish__closure__21* storage = ::x10aux::alloc_z<x10_lang_FinishState__DenseRemoteFinish__closure__21>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState* > that_ref = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState* > >();
        ::x10::util::Pair<x10_long, x10_int> that_message = buf.read< ::x10::util::Pair<x10_long, x10_int> >();
        x10_lang_FinishState__DenseRemoteFinish__closure__21* this_ = new (storage) x10_lang_FinishState__DenseRemoteFinish__closure__21(that_ref, that_message);
        return this_;
    }
    
    x10_lang_FinishState__DenseRemoteFinish__closure__21(::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref, ::x10::util::Pair<x10_long, x10_int> message) : ref(ref), message(message) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:686";
    }

};

#endif // X10_LANG_FINISHSTATE__DENSEREMOTEFINISH__CLOSURE__21_CLOSURE
#ifndef X10_LANG_FINISHSTATE__DENSEREMOTEFINISH__CLOSURE__22_CLOSURE
#define X10_LANG_FINISHSTATE__DENSEREMOTEFINISH__CLOSURE__22_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__DenseRemoteFinish__closure__22 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__DenseRemoteFinish__closure__22> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10::lang::Runtime::x10rtSendMessage(::x10::lang::Place::place((ref)->location)->FMGL(id),
                                               closure, ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref;
    ::x10::lang::VoidFun_0_0* closure;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->ref);
        buf.write(this->closure);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__DenseRemoteFinish__closure__22* storage = ::x10aux::alloc_z<x10_lang_FinishState__DenseRemoteFinish__closure__22>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState* > that_ref = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState* > >();
        ::x10::lang::VoidFun_0_0* that_closure = buf.read< ::x10::lang::VoidFun_0_0*>();
        x10_lang_FinishState__DenseRemoteFinish__closure__22* this_ = new (storage) x10_lang_FinishState__DenseRemoteFinish__closure__22(that_ref, that_closure);
        return this_;
    }
    
    x10_lang_FinishState__DenseRemoteFinish__closure__22(::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref, ::x10::lang::VoidFun_0_0* closure) : ref(ref), closure(closure) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:696";
    }

};

#endif // X10_LANG_FINISHSTATE__DENSEREMOTEFINISH__CLOSURE__22_CLOSURE

//#line 625 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 626 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 627 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 628 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 629 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 630 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__DenseRemoteFinish::_constructor(::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref) {
    
    //#line 631 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    (this)->::x10::lang::FinishState__RemoteFinishSkeleton::_constructor(
      ref);
    
    //#line 630 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    
    //#line 624 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->x10::lang::FinishState__DenseRemoteFinish::__fieldInitializers_x10_lang_FinishState_DenseRemoteFinish();
}
::x10::lang::FinishState__DenseRemoteFinish* x10::lang::FinishState__DenseRemoteFinish::_make(
  ::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref) {
    ::x10::lang::FinishState__DenseRemoteFinish* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__DenseRemoteFinish>()) ::x10::lang::FinishState__DenseRemoteFinish();
    this_->_constructor(ref);
    return this_;
}



//#line 633 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
x10_boolean x10::lang::FinishState__DenseRemoteFinish::notifyActivityCreation(
  ::x10::lang::Place srcPlace) {
    
    //#line 634 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(local)->x10::util::concurrent::AtomicInteger::getAndIncrement();
    
    //#line 635 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    return true;
    
}

//#line 637 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__DenseRemoteFinish::notifySubActivitySpawn(
  ::x10::lang::Place place) {
    
    //#line 638 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    x10_long id = ((x10_long)::x10aux::here);
    
    //#line 639 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(lock))->lock();
    
    //#line 640 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(place->FMGL(id), id))) {
        
        //#line 641 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        this->FMGL(count) = ((this->FMGL(count)) + (((x10_int)1)));
        
        //#line 642 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(this->FMGL(lock))->unlock();
        
        //#line 643 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        return;
    }
    
    //#line 645 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(this->FMGL(remoteActivities), reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        
        //#line 646 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        this->FMGL(remoteActivities) = (__extension__ ({
            ::x10::util::HashMap<x10_long, x10_int>* alloc__92659 =
               (new (::x10aux::alloc_z< ::x10::util::HashMap<x10_long, x10_int> >()) ::x10::util::HashMap<x10_long, x10_int>());
            (alloc__92659)->::x10::util::HashMap<x10_long, x10_int>::_constructor();
            alloc__92659;
        }))
        ;
    }
    
    //#line 649 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    x10_int old = ::x10aux::nullCheck(this->FMGL(remoteActivities))->getOrElse(
                    place->FMGL(id), ((x10_int)0));
    
    //#line 650 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(remoteActivities))->put(
      place->FMGL(id), ((old) + (((x10_int)1))));
    
    //#line 651 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(lock))->unlock();
}

//#line 653 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__DenseRemoteFinish::pushException(
  ::x10::lang::Exception* t) {
    
    //#line 654 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(lock))->lock();
    
    //#line 655 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                 this->FMGL(exceptions))))
    {
        this->FMGL(exceptions) = (__extension__ ({
            ::x10::util::GrowableRail< ::x10::lang::Exception*>* alloc__92660 =
               (new (::x10aux::alloc_z< ::x10::util::GrowableRail< ::x10::lang::Exception*> >()) ::x10::util::GrowableRail< ::x10::lang::Exception*>());
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            (alloc__92660)->::x10::util::GrowableRail< ::x10::lang::Exception*>::_constructor(
              ((x10_long)0ll));
            alloc__92660;
        }))
        ;
    }
    
    //#line 656 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(exceptions))->x10::util::GrowableRail< ::x10::lang::Exception*>::add(
      t);
    
    //#line 657 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(lock))->unlock();
}

//#line 659 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__DenseRemoteFinish::notifyActivityTermination(
  ) {
    
    //#line 660 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(lock))->lock();
    
    //#line 661 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(count) = ((this->FMGL(count)) - (((x10_int)1)));
    
    //#line 662 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (((((x10_long)(this->FMGL(local)->x10::util::concurrent::AtomicInteger::decrementAndGet()))) > (((x10_long)0ll))))
    {
        
        //#line 663 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(this->FMGL(lock))->unlock();
        
        //#line 664 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        return;
    }
    
    //#line 666 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::MultipleExceptions* t = ::x10::lang::MultipleExceptions::make(
                                           this->FMGL(exceptions));
    
    //#line 667 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref =
      this->ref();
    
    //#line 668 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::VoidFun_0_0* closure;
    
    //#line 669 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (((!::x10aux::struct_equals(this->FMGL(remoteActivities),
                                   reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))) &&
        (!::x10aux::struct_equals(::x10aux::nullCheck(this->FMGL(remoteActivities))->size(),
                                  ((x10_long)0ll))))) {
        
        //#line 670 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(this->FMGL(remoteActivities))->put(
          ::x10::lang::Place::_make(::x10aux::here)->FMGL(id),
          this->FMGL(count));
        
        //#line 672 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::io::Serializer* serializer = ::x10::io::Serializer::_make();
        
        //#line 673 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        serializer->x10::io::Serializer::writeAny(reinterpret_cast< ::x10::lang::Any*>(this->FMGL(remoteActivities)));
        
        //#line 674 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::Rail< x10_byte >* serializedTable = serializer->x10::io::Serializer::toRail();
        
        //#line 675 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                      t))) {
            
            //#line 676 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            closure = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__DenseRemoteFinish__closure__18)))x10_lang_FinishState__DenseRemoteFinish__closure__18(ref, serializedTable, t)));
        } else {
            
            //#line 678 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            closure = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__DenseRemoteFinish__closure__19)))x10_lang_FinishState__DenseRemoteFinish__closure__19(ref, serializedTable)));
        }
        
        //#line 680 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(this->FMGL(remoteActivities))->clear();
    } else {
        
        //#line 682 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::util::Pair<x10_long, x10_int> message =  ::x10::util::Pair<x10_long, x10_int>::_alloc();
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        x10_long first__102429 = ::x10::lang::Place::_make(::x10aux::here)->FMGL(id);
        x10_int second__102430 = this->FMGL(count);
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        message->FMGL(first) = first__102429;
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        message->FMGL(second) = second__102430;
        
        //#line 683 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                      t))) {
            
            //#line 684 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            closure = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__DenseRemoteFinish__closure__20)))x10_lang_FinishState__DenseRemoteFinish__closure__20(ref, message, t)));
        } else {
            
            //#line 686 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            closure = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__DenseRemoteFinish__closure__21)))x10_lang_FinishState__DenseRemoteFinish__closure__21(ref, message)));
        }
        
    }
    
    //#line 689 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(count) = ((x10_int)0);
    
    //#line 690 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(exceptions) = (::x10aux::class_cast_unchecked< ::x10::util::GrowableRail< ::x10::lang::Exception*>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 691 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(lock))->unlock();
    
    //#line 692 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    x10_int h = ::x10aux::here;
    
    //#line 693 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (((((((x10_long)::x10aux::num_hosts)) < (((x10_long)1024ll))) ||
        (::x10aux::struct_equals(((h) % ::x10aux::zeroCheck(((x10_int)32))),
                                 ((x10_int)0)))) || (::x10aux::struct_equals(((h) - (((h) % ::x10aux::zeroCheck(((x10_int)32))))),
                                                                             ((x10_int) (::x10::lang::Place::place((ref)->location)->FMGL(id)))))))
    {
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10_long id__102431 = ::x10::lang::Place::place((ref)->location)->FMGL(id);
        ::x10::lang::VoidFun_0_0* msgBody__102432 = closure;
        ::x10::lang::Runtime__Profile* prof__102433 = ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::run_closure_at((x10_int)id__102431, msgBody__102432, reinterpret_cast< ::x10::lang::Runtime__Profile*>(X10_NULL), ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    } else {
        
        //#line 696 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::VoidFun_0_0* clx = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__DenseRemoteFinish__closure__22)))x10_lang_FinishState__DenseRemoteFinish__closure__22(ref, closure)));
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10_long id__102434 = ((((x10_long)(h))) - (((((x10_long)(h))) % ::x10aux::zeroCheck(((x10_long)32ll)))));
        ::x10::lang::VoidFun_0_0* msgBody__102435 = clx;
        ::x10::lang::Runtime__Profile* prof__102436 = ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::run_closure_at((x10_int)id__102434, msgBody__102435, reinterpret_cast< ::x10::lang::Runtime__Profile*>(X10_NULL), ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
        //#line 698 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::dealloc(clx);
    }
    
    //#line 700 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::dealloc(closure);
}

//#line 624 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::FinishState__DenseRemoteFinish* x10::lang::FinishState__DenseRemoteFinish::x10__lang__FinishState__DenseRemoteFinish____this__x10__lang__FinishState__DenseRemoteFinish(
  ) {
    return this;
    
}
void x10::lang::FinishState__DenseRemoteFinish::__fieldInitializers_x10_lang_FinishState_DenseRemoteFinish(
  ) {
    this->FMGL(exceptions) = (::x10aux::class_cast_unchecked< ::x10::util::GrowableRail< ::x10::lang::Exception*>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(lock) = &_Embed_lock;
    _Embed_lock._constructor();
    this->FMGL(count) = ((x10_int)0);
    this->FMGL(remoteActivities) = (::x10aux::class_cast_unchecked< ::x10::util::HashMap<x10_long, x10_int>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(local) = &_Embed_local;
    _Embed_local._constructor(((x10_int)0));
}
const ::x10aux::serialization_id_t x10::lang::FinishState__DenseRemoteFinish::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::FinishState__DenseRemoteFinish::_deserializer);

void x10::lang::FinishState__DenseRemoteFinish::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::FinishState__RemoteFinishSkeleton::_serialize_body(buf);
    buf.write(this->FMGL(exceptions));
    buf.write(this->FMGL(count));
    buf.write(this->FMGL(remoteActivities));
    buf.write(this->FMGL(local));
    
}

::x10::lang::Reference* ::x10::lang::FinishState__DenseRemoteFinish::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState__DenseRemoteFinish* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__DenseRemoteFinish>()) ::x10::lang::FinishState__DenseRemoteFinish();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::FinishState__DenseRemoteFinish::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState__RemoteFinishSkeleton::_deserialize_body(buf);
    FMGL(exceptions) = buf.read< ::x10::util::GrowableRail< ::x10::lang::Exception*>*>();
    FMGL(count) = buf.read<x10_int>();
    FMGL(remoteActivities) = buf.read< ::x10::util::HashMap<x10_long, x10_int>*>();
    FMGL(local) = buf.read< ::x10::util::concurrent::AtomicInteger*>();
}

::x10aux::RuntimeType x10::lang::FinishState__DenseRemoteFinish::rtt;
void x10::lang::FinishState__DenseRemoteFinish::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::FinishState__RemoteFinishSkeleton>()};
    rtt.initStageTwo("x10.lang.FinishState.DenseRemoteFinish",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__DenseRemoteFinish__closure__18>x10_lang_FinishState__DenseRemoteFinish__closure__18::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__DenseRemoteFinish__closure__18::__apply, &x10_lang_FinishState__DenseRemoteFinish__closure__18::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__DenseRemoteFinish__closure__18::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__DenseRemoteFinish__closure__18::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__DenseRemoteFinish__closure__18::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__DenseRemoteFinish__closure__18::_deserialize);
const ::x10aux::serialization_id_t x10_lang_FinishState__DenseRemoteFinish__closure__18::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishState__DenseRemoteFinish__closure__18::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__DenseRemoteFinish__closure__19>x10_lang_FinishState__DenseRemoteFinish__closure__19::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__DenseRemoteFinish__closure__19::__apply, &x10_lang_FinishState__DenseRemoteFinish__closure__19::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__DenseRemoteFinish__closure__19::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__DenseRemoteFinish__closure__19::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__DenseRemoteFinish__closure__19::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__DenseRemoteFinish__closure__19::_deserialize);
const ::x10aux::serialization_id_t x10_lang_FinishState__DenseRemoteFinish__closure__19::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishState__DenseRemoteFinish__closure__19::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__DenseRemoteFinish__closure__20>x10_lang_FinishState__DenseRemoteFinish__closure__20::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__DenseRemoteFinish__closure__20::__apply, &x10_lang_FinishState__DenseRemoteFinish__closure__20::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__DenseRemoteFinish__closure__20::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__DenseRemoteFinish__closure__20::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__DenseRemoteFinish__closure__20::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__DenseRemoteFinish__closure__20::_deserialize);
const ::x10aux::serialization_id_t x10_lang_FinishState__DenseRemoteFinish__closure__20::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishState__DenseRemoteFinish__closure__20::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__DenseRemoteFinish__closure__21>x10_lang_FinishState__DenseRemoteFinish__closure__21::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__DenseRemoteFinish__closure__21::__apply, &x10_lang_FinishState__DenseRemoteFinish__closure__21::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__DenseRemoteFinish__closure__21::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__DenseRemoteFinish__closure__21::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__DenseRemoteFinish__closure__21::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__DenseRemoteFinish__closure__21::_deserialize);
const ::x10aux::serialization_id_t x10_lang_FinishState__DenseRemoteFinish__closure__21::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishState__DenseRemoteFinish__closure__21::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__DenseRemoteFinish__closure__22>x10_lang_FinishState__DenseRemoteFinish__closure__22::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__DenseRemoteFinish__closure__22::__apply, &x10_lang_FinishState__DenseRemoteFinish__closure__22::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__DenseRemoteFinish__closure__22::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__DenseRemoteFinish__closure__22::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__DenseRemoteFinish__closure__22::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__DenseRemoteFinish__closure__22::_deserialize);
const ::x10aux::serialization_id_t x10_lang_FinishState__DenseRemoteFinish__closure__22::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishState__DenseRemoteFinish__closure__22::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

/* END of FinishState$DenseRemoteFinish */
/*************************************************/
/*************************************************/
/* START of FinishState$StatefulReducer */
#include <x10/lang/FinishState__StatefulReducer.h>

::x10aux::RuntimeType x10::lang::FinishState__StatefulReducer<void>::rtt;

/* END of FinishState$StatefulReducer */
/*************************************************/
/*************************************************/
/* START of FinishState$CollectingFinishState */
#include <x10/lang/FinishState__CollectingFinishState.h>

::x10aux::RuntimeType x10::lang::FinishState__CollectingFinishState<void>::rtt;

/* END of FinishState$CollectingFinishState */
/*************************************************/
/*************************************************/
/* START of FinishState$CollectingFinish */
#include <x10/lang/FinishState__CollectingFinish.h>

::x10aux::RuntimeType x10::lang::FinishState__CollectingFinish<void>::rtt;

/* END of FinishState$CollectingFinish */
/*************************************************/
/*************************************************/
/* START of FinishState$RootCollectingFinish */
#include <x10/lang/FinishState__RootCollectingFinish.h>

::x10aux::RuntimeType x10::lang::FinishState__RootCollectingFinish<void>::rtt;

/* END of FinishState$RootCollectingFinish */
/*************************************************/
/*************************************************/
/* START of FinishState$RemoteCollectingFinish */
#include <x10/lang/FinishState__RemoteCollectingFinish.h>

::x10aux::RuntimeType x10::lang::FinishState__RemoteCollectingFinish<void>::rtt;

/* END of FinishState$RemoteCollectingFinish */
/*************************************************/
/*************************************************/
/* START of FinishState$FinishResilientPlaceZero */
#include <x10/lang/FinishState__FinishResilientPlaceZero.h>

#include <x10/lang/FinishState.h>
#include <x10/lang/Long.h>
#include <x10/lang/Activity.h>
#include <x10/lang/Runtime.h>
#include <x10/util/concurrent/SimpleLatch.h>
#include <x10/lang/ResilientStorePlaceZero.h>
#include <x10/lang/Place.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Exception.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/lang/Activity__ClockPhases.h>
#include <x10/lang/Cell.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/Runtime__AtCheckedWrapper.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/compiler/RemoteInvocation.h>
#include <x10/lang/Unsafe.h>
#include <x10/lang/Any.h>
#include <x10/lang/MultipleExceptions.h>
#include <x10/lang/Rail.h>
#include <x10/lang/String.h>
#include <x10/lang/WrappedThrowable.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/lang/Empty.h>
#include <x10/compiler/StackAllocate.h>
#include <x10/lang/Int.h>
#include <x10/lang/DeadPlaceException.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTPLACEZERO__CLOSURE__31_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTPLACEZERO__CLOSURE__31_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__FinishResilientPlaceZero__closure__31 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientPlaceZero__closure__31> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 932 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* > gref =
          cpGref;
        
        //#line 933 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* cell =
          (gref)->__apply();
        cell->x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>::set(
          clockPhases);
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* > cpGref;
    ::x10::lang::Activity__ClockPhases* clockPhases;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->cpGref);
        buf.write(this->clockPhases);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientPlaceZero__closure__31* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientPlaceZero__closure__31>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* > that_cpGref = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* > >();
        ::x10::lang::Activity__ClockPhases* that_clockPhases = buf.read< ::x10::lang::Activity__ClockPhases*>();
        x10_lang_FinishState__FinishResilientPlaceZero__closure__31* this_ = new (storage) x10_lang_FinishState__FinishResilientPlaceZero__closure__31(that_cpGref, that_clockPhases);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientPlaceZero__closure__31(::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* > cpGref, ::x10::lang::Activity__ClockPhases* clockPhases) : cpGref(cpGref), clockPhases(clockPhases) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:931-934";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTPLACEZERO__CLOSURE__31_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTPLACEZERO__CLOSURE__30_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTPLACEZERO__CLOSURE__30_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__FinishResilientPlaceZero__closure__30 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientPlaceZero__closure__30> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 916 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::Activity* remoteActivity = ::x10::lang::Runtime::activity();
        
        //#line 917 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(remoteActivity)->FMGL(clockPhases) = clockPhases;
        
        //#line 918 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (tmp_finish->x10::lang::FinishState__FinishResilientPlaceZero::notifyActivityCreation(
              home)) {
            
            //#line 919 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            try {
                
                //#line 920 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                try {
                    
                    //#line 921 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    ::x10::lang::VoidFun_0_0::__apply(::x10aux::nullCheck(body));
                }
                catch (::x10::lang::CheckedThrowable* __exc1057) {
                    if (::x10aux::instanceof< ::x10::lang::Runtime__AtCheckedWrapper*>(__exc1057)) {
                        ::x10::lang::Runtime__AtCheckedWrapper* e =
                          static_cast< ::x10::lang::Runtime__AtCheckedWrapper*>(__exc1057);
                        {
                            
                            //#line 923 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                            ::x10aux::throwException(::x10aux::nullCheck(::x10aux::nullCheck(e)->x10::lang::Runtime__AtCheckedWrapper::getCheckedCause()));
                        }
                    } else
                    throw;
                }
            }
            catch (::x10::lang::CheckedThrowable* __exc1058) {
                if (true) {
                    ::x10::lang::CheckedThrowable* t = static_cast< ::x10::lang::CheckedThrowable*>(__exc1058);
                    {
                        
                        //#line 926 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                        ::x10::lang::Exception* e = ::x10::lang::Exception::ensureException(
                                                      t);
                        
                        //#line 927 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                        tmp_finish->x10::lang::FinishState__FinishResilientPlaceZero::pushException(
                          e);
                    }
                } else
                throw;
            }
            
            //#line 931 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::lang::VoidFun_0_0* cl1 = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__FinishResilientPlaceZero__closure__31)))x10_lang_FinishState__FinishResilientPlaceZero__closure__31(cpGref, clockPhases)));
            
            //#line 935 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::lang::Runtime::x10rtSendMessage(::x10::lang::Place::place((cpGref)->location)->FMGL(id),
                                                   cl1, ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            
            //#line 936 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10aux::dealloc(cl1);
            
            //#line 938 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            tmp_finish->x10::lang::FinishState__FinishResilientPlaceZero::notifyActivityTermination();
        }
        
        //#line 940 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(remoteActivity)->FMGL(clockPhases) =
          (::x10aux::class_cast_unchecked< ::x10::lang::Activity__ClockPhases*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
    
    // captured environment
    ::x10::lang::Activity__ClockPhases* clockPhases;
    ::x10::lang::FinishState__FinishResilientPlaceZero* tmp_finish;
    ::x10::lang::Place home;
    ::x10::lang::VoidFun_0_0* body;
    ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* > cpGref;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->clockPhases);
        buf.write(this->tmp_finish);
        buf.write(this->home);
        buf.write(this->body);
        buf.write(this->cpGref);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientPlaceZero__closure__30* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientPlaceZero__closure__30>();
        buf.record_reference(storage);
        ::x10::lang::Activity__ClockPhases* that_clockPhases = buf.read< ::x10::lang::Activity__ClockPhases*>();
        ::x10::lang::FinishState__FinishResilientPlaceZero* that_tmp_finish = buf.read< ::x10::lang::FinishState__FinishResilientPlaceZero*>();
        ::x10::lang::Place that_home = buf.read< ::x10::lang::Place>();
        ::x10::lang::VoidFun_0_0* that_body = buf.read< ::x10::lang::VoidFun_0_0*>();
        ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* > that_cpGref = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* > >();
        x10_lang_FinishState__FinishResilientPlaceZero__closure__30* this_ = new (storage) x10_lang_FinishState__FinishResilientPlaceZero__closure__30(that_clockPhases, that_tmp_finish, that_home, that_body, that_cpGref);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientPlaceZero__closure__30(::x10::lang::Activity__ClockPhases* clockPhases, ::x10::lang::FinishState__FinishResilientPlaceZero* tmp_finish, ::x10::lang::Place home, ::x10::lang::VoidFun_0_0* body, ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* > cpGref) : clockPhases(clockPhases), tmp_finish(tmp_finish), home(home), body(body), cpGref(cpGref) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:915-941";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTPLACEZERO__CLOSURE__30_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTPLACEZERO__CLOSURE__29_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTPLACEZERO__CLOSURE__29_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__FinishResilientPlaceZero__closure__29 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientPlaceZero__closure__29> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 942 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::Runtime::execute((__extension__ ({
                                          ::x10::lang::Activity* alloc__92665 =
                                             (new (::x10aux::alloc_z< ::x10::lang::Activity>()) ::x10::lang::Activity());
                                          (alloc__92665)->::x10::lang::Activity::_constructor(
                                            reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__FinishResilientPlaceZero__closure__30)))x10_lang_FinishState__FinishResilientPlaceZero__closure__30(clockPhases, tmp_finish, home, body, cpGref))),
                                            home, reinterpret_cast< ::x10::lang::FinishState*>(real_finish),
                                            false, false);
                                          alloc__92665;
                                      }))
                                      );
    }
    
    // captured environment
    ::x10::lang::Activity__ClockPhases* clockPhases;
    ::x10::lang::FinishState__FinishResilientPlaceZero* tmp_finish;
    ::x10::lang::Place home;
    ::x10::lang::VoidFun_0_0* body;
    ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* > cpGref;
    ::x10::lang::FinishState__FinishResilientPlaceZero* real_finish;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->clockPhases);
        buf.write(this->tmp_finish);
        buf.write(this->home);
        buf.write(this->body);
        buf.write(this->cpGref);
        buf.write(this->real_finish);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientPlaceZero__closure__29* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientPlaceZero__closure__29>();
        buf.record_reference(storage);
        ::x10::lang::Activity__ClockPhases* that_clockPhases = buf.read< ::x10::lang::Activity__ClockPhases*>();
        ::x10::lang::FinishState__FinishResilientPlaceZero* that_tmp_finish = buf.read< ::x10::lang::FinishState__FinishResilientPlaceZero*>();
        ::x10::lang::Place that_home = buf.read< ::x10::lang::Place>();
        ::x10::lang::VoidFun_0_0* that_body = buf.read< ::x10::lang::VoidFun_0_0*>();
        ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* > that_cpGref = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* > >();
        ::x10::lang::FinishState__FinishResilientPlaceZero* that_real_finish = buf.read< ::x10::lang::FinishState__FinishResilientPlaceZero*>();
        x10_lang_FinishState__FinishResilientPlaceZero__closure__29* this_ = new (storage) x10_lang_FinishState__FinishResilientPlaceZero__closure__29(that_clockPhases, that_tmp_finish, that_home, that_body, that_cpGref, that_real_finish);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientPlaceZero__closure__29(::x10::lang::Activity__ClockPhases* clockPhases, ::x10::lang::FinishState__FinishResilientPlaceZero* tmp_finish, ::x10::lang::Place home, ::x10::lang::VoidFun_0_0* body, ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* > cpGref, ::x10::lang::FinishState__FinishResilientPlaceZero* real_finish) : clockPhases(clockPhases), tmp_finish(tmp_finish), home(home), body(body), cpGref(cpGref), real_finish(real_finish) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:914-944";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTPLACEZERO__CLOSURE__29_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTPLACEZERO__CLOSURE__33_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTPLACEZERO__CLOSURE__33_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__FinishResilientPlaceZero__closure__33 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientPlaceZero__closure__33> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 976 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::lang::Cell< ::x10::lang::Any*>* this__102458 = (me2)->__apply();
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
            ::x10::lang::Any* x__102459 = r;
            this__102458->FMGL(value) = x__102459;
        }
        catch (::x10::lang::CheckedThrowable* __exc1061) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc1061);
                {
                    x10_int __lowerer__var__1__ = ::x10aux::class_cast_unchecked<x10_int>(::x10::lang::Runtime::wrapAtChecked< x10_int >(
                                                                                            __lowerer__var__0__));
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* > me2;
    ::x10::lang::Any* r;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->me2);
        buf.write(this->r);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientPlaceZero__closure__33* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientPlaceZero__closure__33>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* > that_me2 = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* > >();
        ::x10::lang::Any* that_r = buf.read< ::x10::lang::Any*>();
        x10_lang_FinishState__FinishResilientPlaceZero__closure__33* this_ = new (storage) x10_lang_FinishState__FinishResilientPlaceZero__closure__33(that_me2, that_r);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientPlaceZero__closure__33(::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* > me2, ::x10::lang::Any* r) : me2(me2), r(r) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:975-977";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTPLACEZERO__CLOSURE__33_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTPLACEZERO__CLOSURE__32_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTPLACEZERO__CLOSURE__32_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__FinishResilientPlaceZero__closure__32 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientPlaceZero__closure__32> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 974 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::lang::Any* r = ::x10::lang::Fun_0_0< ::x10::lang::Any*>::__apply(::x10aux::nullCheck(body));
            {
                
                //#line 975 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                ::x10::lang::Runtime::runAt(::x10::lang::Place::place(((x10_long)((me2)->location))),
                                            reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__FinishResilientPlaceZero__closure__33)))x10_lang_FinishState__FinishResilientPlaceZero__closure__33(me2, r))),
                                            ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            }
        }
        catch (::x10::lang::CheckedThrowable* __exc1062) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1062);
                {
                    x10_int __lowerer__var__1__ = ::x10aux::class_cast_unchecked<x10_int>(::x10::lang::Runtime::wrapAtChecked< x10_int >(
                                                                                            __lowerer__var__0__));
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::Fun_0_0< ::x10::lang::Any*>* body;
    ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* > me2;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->body);
        buf.write(this->me2);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientPlaceZero__closure__32* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientPlaceZero__closure__32>();
        buf.record_reference(storage);
        ::x10::lang::Fun_0_0< ::x10::lang::Any*>* that_body = buf.read< ::x10::lang::Fun_0_0< ::x10::lang::Any*>*>();
        ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* > that_me2 = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* > >();
        x10_lang_FinishState__FinishResilientPlaceZero__closure__32* this_ = new (storage) x10_lang_FinishState__FinishResilientPlaceZero__closure__32(that_body, that_me2);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientPlaceZero__closure__32(::x10::lang::Fun_0_0< ::x10::lang::Any*>* body, ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* > me2) : body(body), me2(me2) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:973-978";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTPLACEZERO__CLOSURE__32_CLOSURE

//#line 852 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 853 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
x10_long x10::lang::FinishState__FinishResilientPlaceZero::parentFinish() {
    
    //#line 854 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Activity* a = ::x10::lang::Runtime::activity();
    
    //#line 855 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(a, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        return ((x10_long)-1ll);
        
    }
    
    //#line 856 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState* par = ::x10aux::nullCheck(a)->finishState();
    
    //#line 857 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (::x10aux::instanceof< ::x10::lang::FinishState__FinishResilientPlaceZero*>(par))
    {
        return ::x10aux::nullCheck((::x10aux::class_cast< ::x10::lang::FinishState__FinishResilientPlaceZero*>(par)))->FMGL(id);
        
    }
    
    //#line 858 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    return ((x10_long)-1ll);
    
}

//#line 860 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientPlaceZero::_constructor(
  x10_long parent, ::x10::util::concurrent::SimpleLatch* latch) {
    ::x10::lang::FinishState* this__102451 = this;
    
    //#line 861 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    FMGL(id) = ::x10::lang::ResilientStorePlaceZero::make(
                 ::x10::lang::Place::_make(::x10aux::here)->FMGL(id),
                 parent, latch);
    
    //#line 852 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__FinishResilientPlaceZero* this__102450 =
      this;
    
    //#line 862 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    #ifndef NO_ASSERTIONS
    if (::x10aux::x10__assertions_enabled)
        ::x10aux::x10__assert(((::x10aux::struct_equals(latch,
                                                        reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))) ||
        (::x10aux::struct_equals(::x10::lang::Place::_make(::x10aux::here)->FMGL(id),
                                 ((x10_long)0ll)))));
    #endif//NO_ASSERTIONS
    
}
::x10::lang::FinishState__FinishResilientPlaceZero* x10::lang::FinishState__FinishResilientPlaceZero::_make(
  x10_long parent, ::x10::util::concurrent::SimpleLatch* latch)
{
    ::x10::lang::FinishState__FinishResilientPlaceZero* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishResilientPlaceZero>()) ::x10::lang::FinishState__FinishResilientPlaceZero();
    this_->_constructor(parent, latch);
    return this_;
}



//#line 864 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientPlaceZero::_constructor(
  ::x10::util::concurrent::SimpleLatch* latch) {
    ::x10::lang::FinishState* this__102453 = this;
    
    //#line 865 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    FMGL(id) = ::x10::lang::ResilientStorePlaceZero::make(
                 ::x10::lang::Place::_make(::x10aux::here)->FMGL(id),
                 ::x10::lang::FinishState__FinishResilientPlaceZero::parentFinish(),
                 latch);
    
    //#line 852 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__FinishResilientPlaceZero* this__102452 =
      this;
    
    //#line 866 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    #ifndef NO_ASSERTIONS
    if (::x10aux::x10__assertions_enabled)
        ::x10aux::x10__assert(((::x10aux::struct_equals(latch,
                                                        reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))) ||
        (::x10aux::struct_equals(::x10::lang::Place::_make(::x10aux::here)->FMGL(id),
                                 ((x10_long)0ll)))));
    #endif//NO_ASSERTIONS
    
}
::x10::lang::FinishState__FinishResilientPlaceZero* x10::lang::FinishState__FinishResilientPlaceZero::_make(
  ::x10::util::concurrent::SimpleLatch* latch) {
    ::x10::lang::FinishState__FinishResilientPlaceZero* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishResilientPlaceZero>()) ::x10::lang::FinishState__FinishResilientPlaceZero();
    this_->_constructor(latch);
    return this_;
}



//#line 868 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientPlaceZero::notifySubActivitySpawn(
  ::x10::lang::Place place) {
    
    //#line 869 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    x10_long srcId = ::x10::lang::Place::_make(::x10aux::here)->FMGL(id);
    
    //#line 870 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    x10_long dstId = place->FMGL(id);
    
    //#line 871 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::ResilientStorePlaceZero::notifySubActivitySpawn(
      this->FMGL(id), srcId, dstId);
}

//#line 873 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
x10_boolean x10::lang::FinishState__FinishResilientPlaceZero::notifyActivityCreation(
  ::x10::lang::Place srcPlace) {
    
    //#line 874 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    x10_long srcId = srcPlace->FMGL(id);
    
    //#line 875 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    x10_long dstId = ::x10::lang::Place::_make(::x10aux::here)->FMGL(id);
    
    //#line 876 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    return ::x10::lang::ResilientStorePlaceZero::notifyActivityCreation(
             this->FMGL(id), srcId, dstId);
    
}

//#line 878 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientPlaceZero::notifyActivityTermination(
  ) {
    
    //#line 879 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    x10_long dstId = ::x10::lang::Place::_make(::x10aux::here)->FMGL(id);
    
    //#line 880 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::ResilientStorePlaceZero::notifyActivityTermination(
      this->FMGL(id), dstId);
}

//#line 882 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientPlaceZero::pushException(
  ::x10::lang::Exception* t) {
    
    //#line 883 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::ResilientStorePlaceZero::pushException(this->FMGL(id),
                                                        t);
}

//#line 885 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientPlaceZero::waitForFinish(
  ) {
    
    //#line 886 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::ResilientStorePlaceZero::waitForFinish(this->FMGL(id));
}

//#line 888 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::util::concurrent::SimpleLatch* x10::lang::FinishState__FinishResilientPlaceZero::simpleLatch(
  ) {
    return ::x10aux::class_cast_unchecked< ::x10::util::concurrent::SimpleLatch*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
    
}

//#line 889 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientPlaceZero::runAt(
  ::x10::lang::Place place, ::x10::lang::VoidFun_0_0* body,
  ::x10::lang::Runtime__Profile* prof) {
    
    //#line 890 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Runtime::ensureNotInAtomic();
    
    //#line 891 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(place->FMGL(id), ((x10_long)::x10aux::here))))
    {
        
        //#line 893 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::Runtime::runAtNonResilient(place, body,
                                                prof);
        
        //#line 894 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        return;
    }
    
    //#line 897 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__FinishResilientPlaceZero* real_finish =
      this;
    
    //#line 900 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__FinishResilientPlaceZero* tmp_finish =
       (new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishResilientPlaceZero>()) ::x10::lang::FinishState__FinishResilientPlaceZero());
    (tmp_finish)->::x10::lang::FinishState__FinishResilientPlaceZero::_constructor(
      this->FMGL(id), ::x10aux::class_cast_unchecked< ::x10::util::concurrent::SimpleLatch*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 903 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Place home = ::x10::lang::Place::_make(::x10aux::here);
    
    //#line 904 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    tmp_finish->x10::lang::FinishState__FinishResilientPlaceZero::notifySubActivitySpawn(
      place);
    
    //#line 907 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Activity* myActivity = ::x10::lang::Runtime::activity();
    
    //#line 908 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Activity__ClockPhases* clockPhases = ::x10aux::nullCheck(myActivity)->FMGL(clockPhases);
    
    //#line 909 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* cpCell =
       (new (::x10aux::alloc_z< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*> >()) ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>());
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    ::x10::lang::Activity__ClockPhases* x__102454 = clockPhases;
    cpCell->FMGL(value) = x__102454;
    
    //#line 910 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* > cpGref =
      ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Activity__ClockPhases*>* >(cpCell);
    
    //#line 914 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::VoidFun_0_0* cl = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__FinishResilientPlaceZero__closure__29)))x10_lang_FinishState__FinishResilientPlaceZero__closure__29(clockPhases, tmp_finish, home, body, cpGref, real_finish)));
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    x10_long id__102455 = place->FMGL(id);
    ::x10::lang::VoidFun_0_0* msgBody__102456 = cl;
    ::x10::lang::Runtime__Profile* prof__102457 = prof;
    
    //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::run_closure_at((x10_int)id__102455, msgBody__102456, prof__102457, ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 947 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    try {
        
        //#line 948 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
        {
            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__124755 = ::x10aux::makeStringLit("Entering resilient at waitForFinish"); strLit__124755; }))))->c_str());
        }
        
        //#line 886 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::ResilientStorePlaceZero::waitForFinish(
          tmp_finish->FMGL(id));
        
        //#line 950 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
        {
            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__124756 = ::x10aux::makeStringLit("Exiting resilient at waitForFinish"); strLit__124756; }))))->c_str());
        }
        
        //#line 951 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(myActivity)->FMGL(clockPhases) =
          cpCell->FMGL(value);
    }
    catch (::x10::lang::CheckedThrowable* __exc1059) {
        if (::x10aux::instanceof< ::x10::lang::MultipleExceptions*>(__exc1059)) {
            ::x10::lang::MultipleExceptions* e = static_cast< ::x10::lang::MultipleExceptions*>(__exc1059);
            {
                
                //#line 953 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                #ifndef NO_ASSERTIONS
                if (::x10aux::x10__assertions_enabled)
                    ::x10aux::x10__assert((::x10aux::struct_equals((x10_long)(::x10aux::nullCheck(::x10aux::nullCheck(e)->FMGL(exceptions))->FMGL(size)),
                                                                   ((x10_long)1ll))),
                        ::x10aux::nullCheck(e)->x10::lang::MultipleExceptions::exceptions());
                #endif//NO_ASSERTIONS
                
                //#line 954 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                ::x10::lang::Exception* e2 = ::x10aux::nullCheck(::x10aux::nullCheck(e)->FMGL(exceptions))->x10::lang::Rail< ::x10::lang::Exception* >::__apply(
                                               ((x10_long)0ll));
                
                //#line 955 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
                {
                    ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124758 = ::x10aux::makeStringLit("Received from resilient at: "); strLit__124758; })), e2)))->c_str());
                }
                
                //#line 956 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                if (::x10aux::instanceof< ::x10::lang::WrappedThrowable*>(e2))
                {
                    
                    //#line 957 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    ::x10aux::throwException(::x10aux::nullCheck(reinterpret_cast< ::x10::lang::CheckedThrowable*>(::x10aux::nullCheck(e2)->x10::lang::Exception::getCause())));
                } else {
                    
                    //#line 959 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    ::x10aux::throwException(::x10aux::nullCheck(e2));
                }
                
            }
        } else
        throw;
    }
}

//#line 963 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::Any* x10::lang::FinishState__FinishResilientPlaceZero::evalAt(
  ::x10::lang::Place place, ::x10::lang::Fun_0_0< ::x10::lang::Any*>* body,
  ::x10::lang::Runtime__Profile* prof) {
    
    //#line 964 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Runtime::ensureNotInAtomic();
    
    //#line 965 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(place->FMGL(id), ((x10_long)::x10aux::here))))
    {
        
        //#line 967 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        return ::x10::lang::Runtime::evalAtNonResilient(place,
                                                        body,
                                                        prof);
        
    }
    
    //#line 970 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Empty* dummy_data =  (new (::x10aux::alloc_z< ::x10::lang::Empty>()) ::x10::lang::Empty());
    
    //#line 971 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Cell< ::x10::lang::Any*> _StackAllocate_me;
      ;
    ::x10::lang::Cell< ::x10::lang::Any*>* me(&_StackAllocate_me);
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    ::x10::lang::Any* x__102461 = reinterpret_cast< ::x10::lang::Any*>(dummy_data);
    me->FMGL(value) = x__102461;
    
    //#line 972 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* > me2 =
      ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* >(me);
    {
        
        //#line 973 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::Runtime::runAt(place, reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__FinishResilientPlaceZero__closure__32)))x10_lang_FinishState__FinishResilientPlaceZero__closure__32(body, me2))),
                                    prof);
    }
    
    //#line 980 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(me->FMGL(value), dummy_data)))
    {
        
        //#line 981 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
        {
            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__124765 = ::x10aux::makeStringLit("evalAt returns no result, target place may died"); strLit__124765; }))))->c_str());
        }
        
        //#line 982 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (x10rt_is_place_dead((x10_int)place->FMGL(id)))
        {
            ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::DeadPlaceException::_make(place)));
        } else {
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
            ::x10::lang::Any* x__102460 = ::x10aux::class_cast_unchecked< ::x10::lang::Any*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            me->FMGL(value) = (reinterpret_cast< ::x10::lang::Any*>(reinterpret_cast< ::x10::lang::Any*>(X10_NULL)));
        }
        
    }
    
    //#line 986 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    return me->FMGL(value);
    
}

//#line 852 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::FinishState__FinishResilientPlaceZero* x10::lang::FinishState__FinishResilientPlaceZero::x10__lang__FinishState__FinishResilientPlaceZero____this__x10__lang__FinishState__FinishResilientPlaceZero(
  ) {
    return this;
    
}
void x10::lang::FinishState__FinishResilientPlaceZero::__fieldInitializers_x10_lang_FinishState_FinishResilientPlaceZero(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::FinishState__FinishResilientPlaceZero::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::FinishState__FinishResilientPlaceZero::_deserializer);

void x10::lang::FinishState__FinishResilientPlaceZero::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::FinishState::_serialize_body(buf);
    buf.write(this->FMGL(id));
    
}

::x10::lang::Reference* ::x10::lang::FinishState__FinishResilientPlaceZero::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState__FinishResilientPlaceZero* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishResilientPlaceZero>()) ::x10::lang::FinishState__FinishResilientPlaceZero();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::FinishState__FinishResilientPlaceZero::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState::_deserialize_body(buf);
    FMGL(id) = buf.read<x10_long>();
}

::x10aux::RuntimeType x10::lang::FinishState__FinishResilientPlaceZero::rtt;
void x10::lang::FinishState__FinishResilientPlaceZero::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::FinishState>()};
    rtt.initStageTwo("x10.lang.FinishState.FinishResilientPlaceZero",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientPlaceZero__closure__31>x10_lang_FinishState__FinishResilientPlaceZero__closure__31::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientPlaceZero__closure__31::__apply, &x10_lang_FinishState__FinishResilientPlaceZero__closure__31::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientPlaceZero__closure__31::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__FinishResilientPlaceZero__closure__31::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientPlaceZero__closure__31::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientPlaceZero__closure__31::_deserialize);
const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientPlaceZero__closure__31::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishState__FinishResilientPlaceZero__closure__31::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientPlaceZero__closure__30>x10_lang_FinishState__FinishResilientPlaceZero__closure__30::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientPlaceZero__closure__30::__apply, &x10_lang_FinishState__FinishResilientPlaceZero__closure__30::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientPlaceZero__closure__30::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__FinishResilientPlaceZero__closure__30::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientPlaceZero__closure__30::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientPlaceZero__closure__30::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientPlaceZero__closure__29>x10_lang_FinishState__FinishResilientPlaceZero__closure__29::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientPlaceZero__closure__29::__apply, &x10_lang_FinishState__FinishResilientPlaceZero__closure__29::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientPlaceZero__closure__29::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__FinishResilientPlaceZero__closure__29::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientPlaceZero__closure__29::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientPlaceZero__closure__29::_deserialize);
const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientPlaceZero__closure__29::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishState__FinishResilientPlaceZero__closure__29::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientPlaceZero__closure__33>x10_lang_FinishState__FinishResilientPlaceZero__closure__33::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientPlaceZero__closure__33::__apply, &x10_lang_FinishState__FinishResilientPlaceZero__closure__33::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientPlaceZero__closure__33::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__FinishResilientPlaceZero__closure__33::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientPlaceZero__closure__33::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientPlaceZero__closure__33::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientPlaceZero__closure__32>x10_lang_FinishState__FinishResilientPlaceZero__closure__32::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientPlaceZero__closure__32::__apply, &x10_lang_FinishState__FinishResilientPlaceZero__closure__32::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientPlaceZero__closure__32::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__FinishResilientPlaceZero__closure__32::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientPlaceZero__closure__32::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientPlaceZero__closure__32::_deserialize);

/* END of FinishState$FinishResilientPlaceZero */
/*************************************************/
/*************************************************/
/* START of FinishState$FinishResilientZooKeeper */
#include <x10/lang/FinishState__FinishResilientZooKeeper.h>

#include <x10/lang/FinishState.h>
#include <x10/lang/Long.h>
#include <x10/util/concurrent/SimpleLatch.h>
#include <x10/lang/Exception.h>
#include <x10/lang/Place.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/lang/Any.h>
#include <x10/compiler/Synthetic.h>

//#line 990 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 993 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 994 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientZooKeeper::_constructor(::x10::util::concurrent::SimpleLatch* latch) {
    ::x10::lang::FinishState* this__102463 = this;
    
    //#line 995 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    FMGL(id) = ((x10_long)0ll);
    
    //#line 990 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__FinishResilientZooKeeper* this__102462 = this;
    
    //#line 996 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(latch) = latch;
    
    //#line 997 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make((__extension__ ({ static ::x10::lang::String* strLit__124769 = ::x10aux::makeStringLit("under implementation"); strLit__124769; })))));
}
::x10::lang::FinishState__FinishResilientZooKeeper* x10::lang::FinishState__FinishResilientZooKeeper::_make(
  ::x10::util::concurrent::SimpleLatch* latch) {
    ::x10::lang::FinishState__FinishResilientZooKeeper* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishResilientZooKeeper>()) ::x10::lang::FinishState__FinishResilientZooKeeper();
    this_->_constructor(latch);
    return this_;
}



//#line 999 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientZooKeeper::notifySubActivitySpawn(
  ::x10::lang::Place place) {
    
    //#line 1000 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make((__extension__ ({ static ::x10::lang::String* strLit__124770 = ::x10aux::makeStringLit("under implementation"); strLit__124770; })))));
}

//#line 1002 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
x10_boolean x10::lang::FinishState__FinishResilientZooKeeper::notifyActivityCreation(
  ::x10::lang::Place srcPlace) {
    
    //#line 1003 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make((__extension__ ({ static ::x10::lang::String* strLit__124772 = ::x10aux::makeStringLit("under implementation"); strLit__124772; })))));
}

//#line 1005 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientZooKeeper::notifyActivityTermination(
  ) {
    
    //#line 1006 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make((__extension__ ({ static ::x10::lang::String* strLit__124773 = ::x10aux::makeStringLit("under implementation"); strLit__124773; })))));
}

//#line 1008 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientZooKeeper::pushException(
  ::x10::lang::Exception* t) {
    
    //#line 1009 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make((__extension__ ({ static ::x10::lang::String* strLit__124774 = ::x10aux::makeStringLit("under implementation"); strLit__124774; })))));
}

//#line 1011 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientZooKeeper::waitForFinish(
  ) {
    
    //#line 1012 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make((__extension__ ({ static ::x10::lang::String* strLit__124775 = ::x10aux::makeStringLit("under implementation"); strLit__124775; })))));
}

//#line 1014 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::util::concurrent::SimpleLatch* x10::lang::FinishState__FinishResilientZooKeeper::simpleLatch(
  ) {
    return ::x10aux::class_cast_unchecked< ::x10::util::concurrent::SimpleLatch*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
    
}

//#line 1015 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientZooKeeper::runAt(
  ::x10::lang::Place place, ::x10::lang::VoidFun_0_0* body,
  ::x10::lang::Runtime__Profile* prof) {
    
    //#line 1016 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make((__extension__ ({ static ::x10::lang::String* strLit__124776 = ::x10aux::makeStringLit("under implementation"); strLit__124776; })))));
}

//#line 1018 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::Any* x10::lang::FinishState__FinishResilientZooKeeper::evalAt(
  ::x10::lang::Place place, ::x10::lang::Fun_0_0< ::x10::lang::Any*>* body,
  ::x10::lang::Runtime__Profile* prof) {
    
    //#line 1019 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make((__extension__ ({ static ::x10::lang::String* strLit__124780 = ::x10aux::makeStringLit("under implementation"); strLit__124780; })))));
}

//#line 990 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::FinishState__FinishResilientZooKeeper* x10::lang::FinishState__FinishResilientZooKeeper::x10__lang__FinishState__FinishResilientZooKeeper____this__x10__lang__FinishState__FinishResilientZooKeeper(
  ) {
    return this;
    
}
void x10::lang::FinishState__FinishResilientZooKeeper::__fieldInitializers_x10_lang_FinishState_FinishResilientZooKeeper(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::FinishState__FinishResilientZooKeeper::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::FinishState__FinishResilientZooKeeper::_deserializer);

void x10::lang::FinishState__FinishResilientZooKeeper::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::FinishState::_serialize_body(buf);
    buf.write(this->FMGL(latch));
    buf.write(this->FMGL(id));
    
}

::x10::lang::Reference* ::x10::lang::FinishState__FinishResilientZooKeeper::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState__FinishResilientZooKeeper* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishResilientZooKeeper>()) ::x10::lang::FinishState__FinishResilientZooKeeper();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::FinishState__FinishResilientZooKeeper::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState::_deserialize_body(buf);
    FMGL(latch) = buf.read< ::x10::util::concurrent::SimpleLatch*>();
    FMGL(id) = buf.read<x10_long>();
}

::x10aux::RuntimeType x10::lang::FinishState__FinishResilientZooKeeper::rtt;
void x10::lang::FinishState__FinishResilientZooKeeper::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::FinishState>()};
    rtt.initStageTwo("x10.lang.FinishState.FinishResilientZooKeeper",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of FinishState$FinishResilientZooKeeper */
/*************************************************/
/*************************************************/
/* START of FinishState$FinishResilientDistributedBackup */
#include <x10/lang/FinishState__FinishResilientDistributedBackup.h>

#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDBACKUP__CLOSURE__34_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDBACKUP__CLOSURE__34_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__FinishResilientDistributedBackup__closure__34 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributedBackup__closure__34> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        {
            
            //#line 1111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::lang::CheckedThrowable* throwable__102627 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                {
                    ::x10::lang::Runtime::enterAtomic();
                    {
                        
                        //#line 1112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                        ::x10::util::Box< ::x10::lang::FinishState__FinishResilientDistributedBackup*>* bup__102476 =
                          ::x10::lang::FinishState__FinishResilientDistributedBackup::FMGL(MAP__get)()->put(
                            master, ::x10aux::class_cast_unchecked< ::x10::lang::FinishState__FinishResilientDistributedBackup*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                        
                    }
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc1077) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__102628 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1077);
                    {
                        throwable__102627 = formal__102628;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__102627)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__102627))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__102627));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::exitAtomic();
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__102627)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__102627)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__102627));
                }
                
            }
            
        }
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > master;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->master);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientDistributedBackup__closure__34* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientDistributedBackup__closure__34>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > that_master = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >();
        x10_lang_FinishState__FinishResilientDistributedBackup__closure__34* this_ = new (storage) x10_lang_FinishState__FinishResilientDistributedBackup__closure__34(that_master);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientDistributedBackup__closure__34(::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > master) : master(master) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1110-1114";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDBACKUP__CLOSURE__34_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDBACKUP__CLOSURE__38_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDBACKUP__CLOSURE__38_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
class x10_lang_FinishState__FinishResilientDistributedBackup__closure__38 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_0<x10_boolean>::itable<x10_lang_FinishState__FinishResilientDistributedBackup__closure__38> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_boolean __apply() {
        {
            
            //#line 1190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::lang::CheckedThrowable* throwable__102635 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                {
                    ::x10::lang::Runtime::enterAtomic();
                    {
                        
                        //#line 1191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                        ::x10::lang::FinishState__FinishResilientDistributedBackup* r =
                          ::x10::lang::FinishState__FinishResilientDistributedBackup::FMGL(MAP__get)()->getOrElse(
                            master, ::x10aux::class_cast_unchecked< ::x10::lang::FinishState__FinishResilientDistributedBackup*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                        
                        //#line 1192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                        if ((::x10aux::struct_equals(r, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
                        {
                            {
                                x10_boolean t__102633 = false;
                                {
                                    
                                    //#line 1190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                                    ::x10::lang::Runtime::exitAtomic();
                                }
                                return t__102633;
                                
                            }
                        }
                        
                        //#line 1193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                        ::x10::lang::VoidFun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*>::__apply(::x10aux::nullCheck(cl), 
                          r);
                        {
                            
                            //#line 1194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                            x10_boolean t__102634 = true;
                            {
                                
                                //#line 1190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                                ::x10::lang::Runtime::exitAtomic();
                            }
                            return t__102634;
                            
                        }
                    }
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc1082) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__102636 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1082);
                    {
                        throwable__102635 = formal__102636;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__102635)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__102635))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__102635));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::exitAtomic();
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__102635)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__102635)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__102635));
                }
                
            }
            
        }
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > master;
    ::x10::lang::VoidFun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*>* cl;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->master);
        buf.write(this->cl);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientDistributedBackup__closure__38* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientDistributedBackup__closure__38>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > that_master = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >();
        ::x10::lang::VoidFun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*>* that_cl = buf.read< ::x10::lang::VoidFun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*>*>();
        x10_lang_FinishState__FinishResilientDistributedBackup__closure__38* this_ = new (storage) x10_lang_FinishState__FinishResilientDistributedBackup__closure__38(that_master, that_cl);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientDistributedBackup__closure__38(::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > master, ::x10::lang::VoidFun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*>* cl) : master(master), cl(cl) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_boolean> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_boolean> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1189-1196";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDBACKUP__CLOSURE__38_CLOSURE
::x10::lang::Runtime__Mortal::itable< ::x10::lang::FinishState__FinishResilientDistributedBackup >  x10::lang::FinishState__FinishResilientDistributedBackup::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::lang::FinishState__FinishResilientDistributedBackup >  x10::lang::FinishState__FinishResilientDistributedBackup::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::lang::FinishState__FinishResilientDistributedBackup::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Runtime__Mortal>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::FinishState__FinishResilientDistributedBackup")};

//#line 1107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::util::HashMap< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >, ::x10::lang::FinishState__FinishResilientDistributedBackup*>*
  x10::lang::FinishState__FinishResilientDistributedBackup::FMGL(MAP);
void x10::lang::FinishState__FinishResilientDistributedBackup::FMGL(MAP__do_init)() {
    FMGL(MAP__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::FinishState__FinishResilientDistributedBackup.MAP");
    ::x10::util::HashMap< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >, ::x10::lang::FinishState__FinishResilientDistributedBackup*>* __var1075__ = ::x10::util::HashMap< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >, ::x10::lang::FinishState__FinishResilientDistributedBackup*>::_make();
    FMGL(MAP) = __var1075__;
    FMGL(MAP__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::FinishState__FinishResilientDistributedBackup::FMGL(MAP__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(MAP__status), &FMGL(MAP__do_init), &FMGL(MAP__exception), "x10::lang::FinishState__FinishResilientDistributedBackup.MAP");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::FinishState__FinishResilientDistributedBackup::FMGL(MAP__status);
::x10::lang::CheckedThrowable* x10::lang::FinishState__FinishResilientDistributedBackup::FMGL(MAP__exception);

//#line 1109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributedBackup::backupForget(
  ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > master,
  ::x10::lang::Place backup_place) {
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    x10_long id__102474 = backup_place->FMGL(id);
    ::x10::lang::VoidFun_0_0* msgBody__102475 = reinterpret_cast< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__FinishResilientDistributedBackup__closure__34)))x10_lang_FinishState__FinishResilientDistributedBackup__closure__34(master))));
    ::x10::lang::Runtime__Profile* prof__102477 = ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
    
    //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::run_closure_at((x10_int)id__102474, msgBody__102475, reinterpret_cast< ::x10::lang::Runtime__Profile*>(X10_NULL), ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}

//#line 1117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 1183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
x10_boolean x10::lang::FinishState__FinishResilientDistributedBackup::backupLowLevelAt(
  ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > master,
  ::x10::lang::VoidFun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*>* cl) {
    
    //#line 1184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Place place = ::x10::lang::Place::place((master)->location);
    
    //#line 1185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    while (true) {
        
        //#line 1186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        place = place->x10::lang::Place::next(((x10_long)1ll));
        
        //#line 1187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if ((::x10aux::struct_equals(place, ::x10::lang::Place::place((master)->location))))
        {
            return false;
            
        }
        
        //#line 1188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::Cell<x10_boolean>* found =  (new (::x10aux::alloc_z< ::x10::lang::Cell<x10_boolean> >()) ::x10::lang::Cell<x10_boolean>());
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        found->FMGL(value) = false;
        
        //#line 1189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        x10_boolean success = ::x10::lang::FinishState::lowLevelFetch< x10_boolean >(
                                place, reinterpret_cast< ::x10::lang::Fun_0_0<x10_boolean>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0<x10_boolean> >(sizeof(x10_lang_FinishState__FinishResilientDistributedBackup__closure__38)))x10_lang_FinishState__FinishResilientDistributedBackup__closure__38(master, cl))),
                                found);
        
        //#line 1197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (success) {
            return found->FMGL(value);
            
        }
        
    }
    
}

//#line 1202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 1203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 1204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 1205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 1206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 1208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributedBackup::_constructor(
  ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > root) {
    
    //#line 1104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->x10::lang::FinishState__FinishResilientDistributedBackup::__fieldInitializers_x10_lang_FinishState_FinishResilientDistributedBackup();
    
    //#line 1209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(transit) = ::x10::lang::Rail< x10_int >::_make(((((x10_long)::x10aux::num_hosts)) * (((x10_long)::x10aux::num_hosts))),
                                                              ((x10_int)0));
    
    //#line 1210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(live) = ::x10::lang::Rail< x10_int >::_make(((x10_long)::x10aux::num_hosts),
                                                           ((x10_int)0));
    
    //#line 1211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(adoptedRoot) = root;
}
::x10::lang::FinishState__FinishResilientDistributedBackup* x10::lang::FinishState__FinishResilientDistributedBackup::_make(
  ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > root)
{
    ::x10::lang::FinishState__FinishResilientDistributedBackup* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishResilientDistributedBackup>()) ::x10::lang::FinishState__FinishResilientDistributedBackup();
    this_->_constructor(root);
    return this_;
}



//#line 1213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* >
  x10::lang::FinishState__FinishResilientDistributedBackup::make(
  ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > root) {
    
    //#line 1214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__FinishResilientDistributedBackup* nu =
       (new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishResilientDistributedBackup>()) ::x10::lang::FinishState__FinishResilientDistributedBackup());
    (nu)->::x10::lang::FinishState__FinishResilientDistributedBackup::_constructor(
      root);
    {
        
        //#line 1215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::CheckedThrowable* throwable__102638 =
          ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        try {
            {
                ::x10::lang::Runtime::enterAtomic();
                {
                    
                    //#line 1216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    ::x10::lang::FinishState__FinishResilientDistributedBackup::FMGL(MAP__get)()->put(
                      root, nu);
                }
            }
            ::x10::compiler::Finalization::plausibleThrow();
        }
        catch (::x10::lang::CheckedThrowable* __exc1084) {
            if (true) {
                ::x10::lang::CheckedThrowable* formal__102639 =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1084);
                {
                    throwable__102638 = formal__102639;
                }
            } else
            throw;
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__102638)))
        {
            if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__102638))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__102638));
            }
            
        }
        if (true) {
            ::x10::lang::Runtime::exitAtomic();
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__102638)))
        {
            if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__102638)))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__102638));
            }
            
        }
        
    }
    
    //#line 1218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    return ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* >(nu);
    
}

//#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributedBackup::notifySubActivitySpawn(
  x10_long srcId, x10_long dstId) {
    {
        
        //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::CheckedThrowable* throwable__102641 =
          ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        try {
            {
                ::x10::lang::Runtime::enterAtomic();
                {
                    
                    //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    ::x10::lang::Rail< x10_int >* a__102485 =
                      this->FMGL(transit);
                    x10_long i__102486 = ((srcId) + (((dstId) * (((x10_long)::x10aux::num_hosts)))));
                    x10_int r__102487 = ((::x10aux::nullCheck(a__102485)->x10::lang::Rail< x10_int >::__apply(
                                            i__102486)) + (((x10_int)1)));
                    ::x10aux::nullCheck(a__102485)->x10::lang::Rail< x10_int >::__set(
                      i__102486, r__102487);
                }
            }
            ::x10::compiler::Finalization::plausibleThrow();
        }
        catch (::x10::lang::CheckedThrowable* __exc1086) {
            if (true) {
                ::x10::lang::CheckedThrowable* formal__102642 =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1086);
                {
                    throwable__102641 = formal__102642;
                }
            } else
            throw;
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__102641)))
        {
            if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__102641))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__102641));
            }
            
        }
        if (true) {
            ::x10::lang::Runtime::exitAtomic();
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__102641)))
        {
            if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__102641)))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__102641));
            }
            
        }
        
    }
}

//#line 1226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
x10_boolean x10::lang::FinishState__FinishResilientDistributedBackup::notifyActivityCreation(
  x10_long srcId, x10_long dstId) {
    {
        
        //#line 1227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::CheckedThrowable* throwable__102645 =
          ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        try {
            {
                ::x10::lang::Runtime::enterAtomic();
                {
                    
                    //#line 1229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    if ((__extension__ ({
                            ::x10::lang::Place this__102107 =
                              (__extension__ ({
                                ::x10::lang::Place alloc__92666 =
                                   ::x10::lang::Place::_alloc();
                                (alloc__92666)->::x10::lang::Place::_constructor(
                                  srcId);
                                alloc__92666;
                            }))
                            ;
                            x10rt_is_place_dead((x10_int)this__102107->FMGL(id));
                        }))
                        ) {
                        {
                            
                            //#line 1230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                            x10_boolean t__102644 = false;
                            {
                                
                                //#line 1227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                                ::x10::lang::Runtime::exitAtomic();
                            }
                            return t__102644;
                            
                        }
                    }
                    
                    //#line 1232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    ::x10::lang::Rail< x10_int >* a__102488 =
                      this->FMGL(transit);
                    x10_long i__102489 = ((srcId) + (((dstId) * (((x10_long)::x10aux::num_hosts)))));
                    x10_int r__102490 = ((::x10aux::nullCheck(a__102488)->x10::lang::Rail< x10_int >::__apply(
                                            i__102489)) - (((x10_int)1)));
                    ::x10aux::nullCheck(a__102488)->x10::lang::Rail< x10_int >::__set(
                      i__102489, r__102490);
                    
                    //#line 1233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    ::x10::lang::Rail< x10_int >* a__102491 =
                      this->FMGL(live);
                    x10_long i__102492 = dstId;
                    x10_int r__102493 = ((::x10aux::nullCheck(a__102491)->x10::lang::Rail< x10_int >::__apply(
                                            i__102492)) + (((x10_int)1)));
                    ::x10aux::nullCheck(a__102491)->x10::lang::Rail< x10_int >::__set(
                      i__102492, r__102493);
                }
            }
            ::x10::compiler::Finalization::plausibleThrow();
        }
        catch (::x10::lang::CheckedThrowable* __exc1088) {
            if (true) {
                ::x10::lang::CheckedThrowable* formal__102646 =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1088);
                {
                    throwable__102645 = formal__102646;
                }
            } else
            throw;
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__102645)))
        {
            if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__102645))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__102645));
            }
            
        }
        if (true) {
            ::x10::lang::Runtime::exitAtomic();
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__102645)))
        {
            if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__102645)))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__102645));
            }
            
        }
        
    }
    
    //#line 1235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    return true;
    
}

//#line 1237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributedBackup::notifyActivityTermination(
  x10_long dstId) {
    {
        
        //#line 1238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::CheckedThrowable* throwable__102648 =
          ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        try {
            {
                ::x10::lang::Runtime::enterAtomic();
                {
                    
                    //#line 1239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    ::x10::lang::Rail< x10_int >* a__102494 =
                      this->FMGL(live);
                    x10_long i__102495 = dstId;
                    x10_int r__102496 = ((::x10aux::nullCheck(a__102494)->x10::lang::Rail< x10_int >::__apply(
                                            i__102495)) - (((x10_int)1)));
                    ::x10aux::nullCheck(a__102494)->x10::lang::Rail< x10_int >::__set(
                      i__102495, r__102496);
                }
            }
            ::x10::compiler::Finalization::plausibleThrow();
        }
        catch (::x10::lang::CheckedThrowable* __exc1090) {
            if (true) {
                ::x10::lang::CheckedThrowable* formal__102649 =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1090);
                {
                    throwable__102648 = formal__102649;
                }
            } else
            throw;
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__102648)))
        {
            if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__102648))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__102648));
            }
            
        }
        if (true) {
            ::x10::lang::Runtime::exitAtomic();
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__102648)))
        {
            if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__102648)))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__102648));
            }
            
        }
        
    }
}

//#line 1104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::FinishState__FinishResilientDistributedBackup*
  x10::lang::FinishState__FinishResilientDistributedBackup::x10__lang__FinishState__FinishResilientDistributedBackup____this__x10__lang__FinishState__FinishResilientDistributedBackup(
  ) {
    return this;
    
}
void x10::lang::FinishState__FinishResilientDistributedBackup::__fieldInitializers_x10_lang_FinishState_FinishResilientDistributedBackup(
  ) {
    this->FMGL(children) = (__extension__ ({
        
        //#line 1204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >* alloc__92667 =
           (new (::x10aux::alloc_z< ::x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > >()) ::x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >());
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        (alloc__92667)->::x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >::_constructor(
          ((x10_long)0ll));
        alloc__92667;
    }))
    ;
    this->FMGL(adopted) = false;
    this->FMGL(adoptedRoot) = ::x10aux::zeroValue< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >();
}
const ::x10aux::serialization_id_t x10::lang::FinishState__FinishResilientDistributedBackup::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::FinishState__FinishResilientDistributedBackup::_deserializer);

void x10::lang::FinishState__FinishResilientDistributedBackup::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(transit));
    buf.write(this->FMGL(live));
    buf.write(this->FMGL(children));
    buf.write(this->FMGL(adopted));
    buf.write(this->FMGL(adoptedRoot));
    
}

::x10::lang::Reference* ::x10::lang::FinishState__FinishResilientDistributedBackup::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState__FinishResilientDistributedBackup* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishResilientDistributedBackup>()) ::x10::lang::FinishState__FinishResilientDistributedBackup();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::FinishState__FinishResilientDistributedBackup::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(transit) = buf.read< ::x10::lang::Rail< x10_int >*>();
    FMGL(live) = buf.read< ::x10::lang::Rail< x10_int >*>();
    FMGL(children) = buf.read< ::x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >*>();
    FMGL(adopted) = buf.read<x10_boolean>();
    FMGL(adoptedRoot) = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >();
}

::x10aux::RuntimeType x10::lang::FinishState__FinishResilientDistributedBackup::rtt;
void x10::lang::FinishState__FinishResilientDistributedBackup::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Runtime__Mortal>()};
    rtt.initStageTwo("x10.lang.FinishState.FinishResilientDistributedBackup",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributedBackup__closure__34>x10_lang_FinishState__FinishResilientDistributedBackup__closure__34::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientDistributedBackup__closure__34::__apply, &x10_lang_FinishState__FinishResilientDistributedBackup__closure__34::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientDistributedBackup__closure__34::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__FinishResilientDistributedBackup__closure__34::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributedBackup__closure__34::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientDistributedBackup__closure__34::_deserialize);
const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributedBackup__closure__34::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishState__FinishResilientDistributedBackup__closure__34::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::Fun_0_0<x10_boolean>::itable<x10_lang_FinishState__FinishResilientDistributedBackup__closure__38>x10_lang_FinishState__FinishResilientDistributedBackup__closure__38::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientDistributedBackup__closure__38::__apply, &x10_lang_FinishState__FinishResilientDistributedBackup__closure__38::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientDistributedBackup__closure__38::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_boolean> >, &x10_lang_FinishState__FinishResilientDistributedBackup__closure__38::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributedBackup__closure__38::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientDistributedBackup__closure__38::_deserialize);

/* END of FinishState$FinishResilientDistributedBackup */
/*************************************************/
/*************************************************/
/* START of FinishState$FinishResilientDistributedMaster */
#include <x10/lang/FinishState__FinishResilientDistributedMaster.h>

#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER__CLOSURE__39_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER__CLOSURE__39_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__FinishResilientDistributedMaster__closure__39 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributedMaster__closure__39> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::FinishState__FinishResilientDistributedMaster* >(parent))->x10::lang::FinishState__FinishResilientDistributedMaster::addChild(
          gnu);
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > parent;
    ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > gnu;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->parent);
        buf.write(this->gnu);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientDistributedMaster__closure__39* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientDistributedMaster__closure__39>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > that_parent = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >();
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > that_gnu = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >();
        x10_lang_FinishState__FinishResilientDistributedMaster__closure__39* this_ = new (storage) x10_lang_FinishState__FinishResilientDistributedMaster__closure__39(that_parent, that_gnu);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientDistributedMaster__closure__39(::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > parent, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > gnu) : parent(parent), gnu(gnu) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1333";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER__CLOSURE__39_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER__CLOSURE__40_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER__CLOSURE__40_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
class x10_lang_FinishState__FinishResilientDistributedMaster__closure__40 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_0< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > >::itable<x10_lang_FinishState__FinishResilientDistributedMaster__closure__40> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > __apply() {
        return ::x10::lang::FinishState__FinishResilientDistributedBackup::make(
                 gnu);
        
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > gnu;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->gnu);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientDistributedMaster__closure__40* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientDistributedMaster__closure__40>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > that_gnu = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >();
        x10_lang_FinishState__FinishResilientDistributedMaster__closure__40* this_ = new (storage) x10_lang_FinishState__FinishResilientDistributedMaster__closure__40(that_gnu);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientDistributedMaster__closure__40(::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > gnu) : gnu(gnu) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > > >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > > >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1346";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER__CLOSURE__40_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER__CLOSURE__41_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER__CLOSURE__41_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__FinishResilientDistributedMaster__closure__41 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributedMaster__closure__41> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::FinishState__FinishResilientDistributedBackup* >(bup))->x10::lang::FinishState__FinishResilientDistributedBackup::notifySubActivitySpawn(
          srcId, dstId);
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > bup;
    x10_long srcId;
    x10_long dstId;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->bup);
        buf.write(this->srcId);
        buf.write(this->dstId);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientDistributedMaster__closure__41* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientDistributedMaster__closure__41>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > that_bup = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > >();
        x10_long that_srcId = buf.read<x10_long>();
        x10_long that_dstId = buf.read<x10_long>();
        x10_lang_FinishState__FinishResilientDistributedMaster__closure__41* this_ = new (storage) x10_lang_FinishState__FinishResilientDistributedMaster__closure__41(that_bup, that_srcId, that_dstId);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientDistributedMaster__closure__41(::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > bup, x10_long srcId, x10_long dstId) : bup(bup), srcId(srcId), dstId(dstId) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1373";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER__CLOSURE__41_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER__CLOSURE__42_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER__CLOSURE__42_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__FinishResilientDistributedMaster__closure__42 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributedMaster__closure__42> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::FinishState__FinishResilientDistributedBackup* >(bup))->x10::lang::FinishState__FinishResilientDistributedBackup::notifySubActivitySpawn(
          srcId, dstId);
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > bup;
    x10_long srcId;
    x10_long dstId;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->bup);
        buf.write(this->srcId);
        buf.write(this->dstId);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientDistributedMaster__closure__42* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientDistributedMaster__closure__42>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > that_bup = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > >();
        x10_long that_srcId = buf.read<x10_long>();
        x10_long that_dstId = buf.read<x10_long>();
        x10_lang_FinishState__FinishResilientDistributedMaster__closure__42* this_ = new (storage) x10_lang_FinishState__FinishResilientDistributedMaster__closure__42(that_bup, that_srcId, that_dstId);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientDistributedMaster__closure__42(::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > bup, x10_long srcId, x10_long dstId) : bup(bup), srcId(srcId), dstId(dstId) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1391";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER__CLOSURE__42_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER__CLOSURE__43_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER__CLOSURE__43_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__FinishResilientDistributedMaster__closure__43 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributedMaster__closure__43> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::FinishState__FinishResilientDistributedBackup* >(bup))->x10::lang::FinishState__FinishResilientDistributedBackup::notifyActivityCreation(
          srcId, dstId);
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > bup;
    x10_long srcId;
    x10_long dstId;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->bup);
        buf.write(this->srcId);
        buf.write(this->dstId);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientDistributedMaster__closure__43* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientDistributedMaster__closure__43>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > that_bup = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > >();
        x10_long that_srcId = buf.read<x10_long>();
        x10_long that_dstId = buf.read<x10_long>();
        x10_lang_FinishState__FinishResilientDistributedMaster__closure__43* this_ = new (storage) x10_lang_FinishState__FinishResilientDistributedMaster__closure__43(that_bup, that_srcId, that_dstId);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientDistributedMaster__closure__43(::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > bup, x10_long srcId, x10_long dstId) : bup(bup), srcId(srcId), dstId(dstId) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1414";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER__CLOSURE__43_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER__CLOSURE__44_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER__CLOSURE__44_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__FinishResilientDistributedMaster__closure__44 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributedMaster__closure__44> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::FinishState__FinishResilientDistributedBackup* >(bup))->x10::lang::FinishState__FinishResilientDistributedBackup::notifyActivityCreation(
          srcId, dstId);
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > bup;
    x10_long srcId;
    x10_long dstId;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->bup);
        buf.write(this->srcId);
        buf.write(this->dstId);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientDistributedMaster__closure__44* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientDistributedMaster__closure__44>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > that_bup = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > >();
        x10_long that_srcId = buf.read<x10_long>();
        x10_long that_dstId = buf.read<x10_long>();
        x10_lang_FinishState__FinishResilientDistributedMaster__closure__44* this_ = new (storage) x10_lang_FinishState__FinishResilientDistributedMaster__closure__44(that_bup, that_srcId, that_dstId);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientDistributedMaster__closure__44(::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > bup, x10_long srcId, x10_long dstId) : bup(bup), srcId(srcId), dstId(dstId) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1438";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER__CLOSURE__44_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER__CLOSURE__45_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER__CLOSURE__45_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__FinishResilientDistributedMaster__closure__45 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributedMaster__closure__45> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::FinishState__FinishResilientDistributedBackup* >(bup))->x10::lang::FinishState__FinishResilientDistributedBackup::notifyActivityTermination(
          dstId);
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > bup;
    x10_long dstId;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->bup);
        buf.write(this->dstId);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientDistributedMaster__closure__45* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientDistributedMaster__closure__45>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > that_bup = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > >();
        x10_long that_dstId = buf.read<x10_long>();
        x10_lang_FinishState__FinishResilientDistributedMaster__closure__45* this_ = new (storage) x10_lang_FinishState__FinishResilientDistributedMaster__closure__45(that_bup, that_dstId);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientDistributedMaster__closure__45(::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > bup, x10_long dstId) : bup(bup), dstId(dstId) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1461";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER__CLOSURE__45_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER__CLOSURE__46_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER__CLOSURE__46_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__FinishResilientDistributedMaster__closure__46 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributedMaster__closure__46> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::FinishState__FinishResilientDistributedBackup* >(bup))->x10::lang::FinishState__FinishResilientDistributedBackup::notifyActivityTermination(
          dstId);
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > bup;
    x10_long dstId;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->bup);
        buf.write(this->dstId);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientDistributedMaster__closure__46* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientDistributedMaster__closure__46>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > that_bup = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > >();
        x10_long that_dstId = buf.read<x10_long>();
        x10_lang_FinishState__FinishResilientDistributedMaster__closure__46* this_ = new (storage) x10_lang_FinishState__FinishResilientDistributedMaster__closure__46(that_bup, that_dstId);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientDistributedMaster__closure__46(::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > bup, x10_long dstId) : bup(bup), dstId(dstId) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1483";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER__CLOSURE__46_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER__CLOSURE__47_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER__CLOSURE__47_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_lang_FinishState__FinishResilientDistributedMaster__closure__47 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, ::x10::lang::FinishState__FinishResilientDistributedBackup*>::itable<x10_lang_FinishState__FinishResilientDistributedMaster__closure__47> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::FinishState__FinishResilientDistributedBackup* __apply(::x10::lang::FinishState__FinishResilientDistributedBackup* r) {
        
        //#line 1539 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (::x10::lang::FinishState::FMGL(VERBOSE__get)()) {
            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124899 = ::x10aux::makeStringLit("Setting forwarding pointer on backup "); strLit__124899; })), r)))->c_str());
        }
        
        //#line 1540 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (::x10aux::nullCheck(r)->FMGL(adopted)) {
            
            //#line 1541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__124900 = ::x10aux::makeStringLit("should not be adopted already! FinishResilientDistributedBackup.fetchBackup"); strLit__124900; }))))->c_str());
        }
        
        //#line 1543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(r)->FMGL(adopted) = true;
        
        //#line 1544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(r)->FMGL(adoptedRoot) = this_;
        
        //#line 1545 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        return r;
        
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > this_;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->this_);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientDistributedMaster__closure__47* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientDistributedMaster__closure__47>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > that_this_ = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >();
        x10_lang_FinishState__FinishResilientDistributedMaster__closure__47* this_ = new (storage) x10_lang_FinishState__FinishResilientDistributedMaster__closure__47(that_this_);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientDistributedMaster__closure__47(::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > this_) : this_(this_) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, ::x10::lang::FinishState__FinishResilientDistributedBackup*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, ::x10::lang::FinishState__FinishResilientDistributedBackup*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1538-1546";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTEDMASTER__CLOSURE__47_CLOSURE
::x10::lang::Runtime__Mortal::itable< ::x10::lang::FinishState__FinishResilientDistributedMaster >  x10::lang::FinishState__FinishResilientDistributedMaster::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::lang::FinishState__FinishResilientDistributedMaster >  x10::lang::FinishState__FinishResilientDistributedMaster::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::lang::FinishState__FinishResilientDistributedMaster::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Runtime__Mortal>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::FinishState__FinishResilientDistributedMaster")};

//#line 1247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::util::HashSet< ::x10::lang::FinishState__FinishResilientDistributedMaster*>*
  x10::lang::FinishState__FinishResilientDistributedMaster::FMGL(ALL);
void x10::lang::FinishState__FinishResilientDistributedMaster::FMGL(ALL__do_init)() {
    FMGL(ALL__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::FinishState__FinishResilientDistributedMaster.ALL");
    ::x10::util::HashSet< ::x10::lang::FinishState__FinishResilientDistributedMaster*>* __var1093__ = ::x10::util::HashSet< ::x10::lang::FinishState__FinishResilientDistributedMaster*>::_make();
    FMGL(ALL) = __var1093__;
    FMGL(ALL__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::FinishState__FinishResilientDistributedMaster::FMGL(ALL__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(ALL__status), &FMGL(ALL__do_init), &FMGL(ALL__exception), "x10::lang::FinishState__FinishResilientDistributedMaster.ALL");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::FinishState__FinishResilientDistributedMaster::FMGL(ALL__status);
::x10::lang::CheckedThrowable* x10::lang::FinishState__FinishResilientDistributedMaster::FMGL(ALL__exception);

//#line 1249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::util::concurrent::AtomicInteger* x10::lang::FinishState__FinishResilientDistributedMaster::FMGL(nameCounter);
void x10::lang::FinishState__FinishResilientDistributedMaster::FMGL(nameCounter__do_init)() {
    FMGL(nameCounter__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::FinishState__FinishResilientDistributedMaster.nameCounter");
    ::x10::util::concurrent::AtomicInteger* __var1094__ = ::x10::util::concurrent::AtomicInteger::_make();
    FMGL(nameCounter) = __var1094__;
    FMGL(nameCounter__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::FinishState__FinishResilientDistributedMaster::FMGL(nameCounter__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(nameCounter__status), &FMGL(nameCounter__do_init), &FMGL(nameCounter__exception), "x10::lang::FinishState__FinishResilientDistributedMaster.nameCounter");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::FinishState__FinishResilientDistributedMaster::FMGL(nameCounter__status);
::x10::lang::CheckedThrowable* x10::lang::FinishState__FinishResilientDistributedMaster::FMGL(nameCounter__exception);

//#line 1251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 1252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 1253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 1254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 1255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 1256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 1257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 1259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 1260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 1262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 1263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 1265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 1267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributedMaster::transitInc(
  x10_long src, x10_long dst, x10_int v) {
    ::x10::lang::Rail< x10_int >* a__102497 = this->FMGL(transit);
    x10_long i__102498 = ((src) + (((dst) * (((x10_long)::x10aux::num_hosts)))));
    x10_int r__102499 = ((::x10aux::nullCheck(a__102497)->x10::lang::Rail< x10_int >::__apply(
                            i__102498)) + (v));
    ::x10aux::nullCheck(a__102497)->x10::lang::Rail< x10_int >::__set(
      i__102498, r__102499);
}

//#line 1268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributedMaster::transitDec(
  x10_long src, x10_long dst) {
    ::x10::lang::Rail< x10_int >* a__102500 = this->FMGL(transit);
    x10_long i__102501 = ((src) + (((dst) * (((x10_long)::x10aux::num_hosts)))));
    x10_int r__102502 = ((::x10aux::nullCheck(a__102500)->x10::lang::Rail< x10_int >::__apply(
                            i__102501)) - (((x10_int)1)));
    ::x10aux::nullCheck(a__102500)->x10::lang::Rail< x10_int >::__set(
      i__102501, r__102502);
}

//#line 1269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
x10_int x10::lang::FinishState__FinishResilientDistributedMaster::transitGet(
  x10_long src, x10_long dst) {
    return ::x10aux::nullCheck(this->FMGL(transit))->x10::lang::Rail< x10_int >::__apply(
             ((src) + (((dst) * (((x10_long)::x10aux::num_hosts))))));
    
}

//#line 1270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributedMaster::transitSet(
  x10_long src, x10_long dst, x10_int v) {
    ::x10aux::nullCheck(this->FMGL(transit))->x10::lang::Rail< x10_int >::__set(
      ((src) + (((dst) * (((x10_long)::x10aux::num_hosts))))),
      v);
}

//#line 1271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributedMaster::transitAdoptedInc(
  x10_long src, x10_long dst, x10_int v) {
    ::x10::lang::Rail< x10_int >* a__102503 = this->FMGL(transitAdopted);
    x10_long i__102504 = ((src) + (((dst) * (((x10_long)::x10aux::num_hosts)))));
    x10_int r__102505 = ((::x10aux::nullCheck(a__102503)->x10::lang::Rail< x10_int >::__apply(
                            i__102504)) + (v));
    ::x10aux::nullCheck(a__102503)->x10::lang::Rail< x10_int >::__set(
      i__102504, r__102505);
}

//#line 1272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributedMaster::transitAdoptedDec(
  x10_long src, x10_long dst) {
    ::x10::lang::Rail< x10_int >* a__102506 = this->FMGL(transitAdopted);
    x10_long i__102507 = ((src) + (((dst) * (((x10_long)::x10aux::num_hosts)))));
    x10_int r__102508 = ((::x10aux::nullCheck(a__102506)->x10::lang::Rail< x10_int >::__apply(
                            i__102507)) - (((x10_int)1)));
    ::x10aux::nullCheck(a__102506)->x10::lang::Rail< x10_int >::__set(
      i__102507, r__102508);
}

//#line 1273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
x10_int x10::lang::FinishState__FinishResilientDistributedMaster::transitAdoptedGet(
  x10_long src, x10_long dst) {
    return ::x10aux::nullCheck(this->FMGL(transitAdopted))->x10::lang::Rail< x10_int >::__apply(
             ((src) + (((dst) * (((x10_long)::x10aux::num_hosts))))));
    
}

//#line 1274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributedMaster::transitAdoptedSet(
  x10_long src, x10_long dst, x10_int v) {
    ::x10aux::nullCheck(this->FMGL(transitAdopted))->x10::lang::Rail< x10_int >::__set(
      ((src) + (((dst) * (((x10_long)::x10aux::num_hosts))))),
      v);
}

//#line 1276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributedMaster::transitInc(
  x10_long src, x10_long dst) {
    this->x10::lang::FinishState__FinishResilientDistributedMaster::transitInc(
      src, dst, ((x10_int)1));
}

//#line 1277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributedMaster::transitAdoptedInc(
  x10_long src, x10_long dst) {
    this->x10::lang::FinishState__FinishResilientDistributedMaster::transitAdoptedInc(
      src, dst, ((x10_int)1));
}

//#line 1280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributedMaster::recalculateTotal(
  ) {
    
    //#line 1281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(totalCounter) = ((x10_long)0ll);
    
    //#line 1282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    x10_long i__92728max__102512 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
    {
        x10_long i__102513;
        for (i__102513 = ((x10_long)0ll); ((i__102513) <= (i__92728max__102512));
             i__102513 = ((i__102513) + (((x10_long)1ll))))
        {
            x10_long i__102514 = i__102513;
            
            //#line 1283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            this->FMGL(totalCounter) = ((this->FMGL(totalCounter)) + (((x10_long)(::x10aux::nullCheck(this->FMGL(live))->x10::lang::Rail< x10_int >::__apply(
                                                                                    i__102514)))));
            
            //#line 1284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            this->FMGL(totalCounter) = ((this->FMGL(totalCounter)) + (((x10_long)(::x10aux::nullCheck(this->FMGL(liveAdopted))->x10::lang::Rail< x10_int >::__apply(
                                                                                    i__102514)))));
            
            //#line 1285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            x10_long i__92710max__102509 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
            {
                x10_long i__102510;
                for (i__102510 = ((x10_long)0ll); ((i__102510) <= (i__92710max__102509));
                     i__102510 = ((i__102510) + (((x10_long)1ll))))
                {
                    x10_long j__102511 = i__102510;
                    
                    //#line 1286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    this->FMGL(totalCounter) = ((this->FMGL(totalCounter)) + (((x10_long)(this->x10::lang::FinishState__FinishResilientDistributedMaster::transitGet(
                                                                                            j__102511,
                                                                                            i__102514)))));
                    
                    //#line 1287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    this->FMGL(totalCounter) = ((this->FMGL(totalCounter)) + (((x10_long)(this->x10::lang::FinishState__FinishResilientDistributedMaster::transitAdoptedGet(
                                                                                            j__102511,
                                                                                            i__102514)))));
                }
            }
            
        }
    }
    
}

//#line 1293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::util::GrowableRail< ::x10::lang::Exception*>* x10::lang::FinishState__FinishResilientDistributedMaster::ensureMultipleExceptions(
  ) {
    
    //#line 1294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(this->FMGL(multipleExceptions),
                                 reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        this->FMGL(multipleExceptions) = (__extension__ ({
            ::x10::util::GrowableRail< ::x10::lang::Exception*>* alloc__92668 =
               (new (::x10aux::alloc_z< ::x10::util::GrowableRail< ::x10::lang::Exception*> >()) ::x10::util::GrowableRail< ::x10::lang::Exception*>());
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            (alloc__92668)->::x10::util::GrowableRail< ::x10::lang::Exception*>::_constructor(
              ((x10_long)0ll));
            alloc__92668;
        }))
        ;
    }
    
    //#line 1295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    return this->FMGL(multipleExceptions);
    
}

//#line 1297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributedMaster::addDeadPlaceException(
  ::x10::lang::Place p) {
    
    //#line 1298 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::DeadPlaceException* e = ::x10::lang::DeadPlaceException::_make(p);
    
    //#line 1299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    e->fillInStackTrace();
    
    //#line 1300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->x10::lang::FinishState__FinishResilientDistributedMaster::ensureMultipleExceptions())->x10::util::GrowableRail< ::x10::lang::Exception*>::add(
      reinterpret_cast< ::x10::lang::Exception*>(e));
}

//#line 1303 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributedMaster::_constructor(
  ::x10::util::concurrent::SimpleLatch* latch) {
    
    //#line 1244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->x10::lang::FinishState__FinishResilientDistributedMaster::__fieldInitializers_x10_lang_FinishState_FinishResilientDistributedMaster();
    
    //#line 1304 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::String* name = ::x10::lang::FinishState::FMGL(VERBOSE__get)()
      ? (::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::FinishState__FinishResilientDistributedMaster::FMGL(nameCounter__get)()->x10::util::concurrent::AtomicInteger::getAndIncrement(), (__extension__ ({ static ::x10::lang::String* strLit__124810 = ::x10aux::makeStringLit("@"); strLit__124810; }))), ::x10::lang::Place::_make(::x10aux::here)->FMGL(id)))
      : ((::x10aux::class_cast_unchecked< ::x10::lang::String*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))));
    
    //#line 1305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(name) = name;
    
    //#line 1306 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (::x10::lang::FinishState::FMGL(VERBOSE__get)()) {
        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124811 = ::x10aux::makeStringLit("Creating master finish state ("); strLit__124811; })), name), (__extension__ ({ static ::x10::lang::String* strLit__124812 = ::x10aux::makeStringLit(")..."); strLit__124812; })))))->c_str());
    }
    
    //#line 1307 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(transit) = ::x10::lang::Rail< x10_int >::_make(((((x10_long)::x10aux::num_hosts)) * (((x10_long)::x10aux::num_hosts))),
                                                              ((x10_int)0));
    
    //#line 1308 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(live) = ::x10::lang::Rail< x10_int >::_make(((x10_long)::x10aux::num_hosts),
                                                           ((x10_int)0));
    
    //#line 1309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(transitAdopted) = ::x10::lang::Rail< x10_int >::_make(((((x10_long)::x10aux::num_hosts)) * (((x10_long)::x10aux::num_hosts))),
                                                                     ((x10_int)0));
    
    //#line 1310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(liveAdopted) = ::x10::lang::Rail< x10_int >::_make(((x10_long)::x10aux::num_hosts),
                                                                  ((x10_int)0));
    
    //#line 1311 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(children) = (__extension__ ({
        ::x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >* alloc__92669 =
           (new (::x10aux::alloc_z< ::x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > >()) ::x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >());
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        (alloc__92669)->::x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >::_constructor(
          ((x10_long)0ll));
        alloc__92669;
    }))
    ;
    
    //#line 1312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(live))->x10::lang::Rail< x10_int >::__set(
      ::x10::lang::Place::_make(::x10aux::here)->FMGL(id),
      ((x10_int)1));
    
    //#line 1313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(totalCounter) = ((x10_long)1ll);
    
    //#line 1314 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(numDead) = ((x10_long)0ll);
    
    //#line 1315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (::x10::lang::FinishState::FMGL(VERBOSE__get)()) {
        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124813 = ::x10aux::makeStringLit("    initial live("); strLit__124813; })), ::x10::lang::Place::_make(::x10aux::here)->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__124814 = ::x10aux::makeStringLit(") == 1"); strLit__124814; })))))->c_str());
    }
    
    //#line 1316 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(latch) = latch;
}
::x10::lang::FinishState__FinishResilientDistributedMaster* x10::lang::FinishState__FinishResilientDistributedMaster::_make(
  ::x10::util::concurrent::SimpleLatch* latch) {
    ::x10::lang::FinishState__FinishResilientDistributedMaster* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishResilientDistributedMaster>()) ::x10::lang::FinishState__FinishResilientDistributedMaster();
    this_->_constructor(latch);
    return this_;
}



//#line 1318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributedMaster::addChild(
  ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > child) {
    
    //#line 1319 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->lock();
    
    //#line 1320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(children))->x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >::add(
      child);
    
    //#line 1321 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->unlock();
}

//#line 1324 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::FinishState__FinishResilientDistributedMaster*
  x10::lang::FinishState__FinishResilientDistributedMaster::make(
  ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > parent,
  ::x10::util::concurrent::SimpleLatch* latch) {
    
    //#line 1325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__FinishResilientDistributedMaster* nu =
       (new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishResilientDistributedMaster>()) ::x10::lang::FinishState__FinishResilientDistributedMaster());
    (nu)->::x10::lang::FinishState__FinishResilientDistributedMaster::_constructor(
      latch);
    
    //#line 1326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > gnu =
      ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >(nu);
    
    //#line 1328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (::x10::lang::FinishState::FMGL(VERBOSE__get)()) {
        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124815 = ::x10aux::makeStringLit("    "); strLit__124815; })), gnu), (__extension__ ({ static ::x10::lang::String* strLit__124816 = ::x10aux::makeStringLit(" parent is "); strLit__124816; }))), parent)))->c_str());
    }
    
    //#line 1329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(::x10::lang::Place::_make(::x10aux::here)->FMGL(id),
                                 ((x10_long)0ll)))) {
     
    } else {
        
        //#line 1333 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        x10_boolean success = ::x10::lang::FinishState::lowLevelAt(
                                ::x10::lang::Place::place((parent)->location),
                                reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__FinishResilientDistributedMaster__closure__39)))x10_lang_FinishState__FinishResilientDistributedMaster__closure__39(parent, gnu))));
        
        //#line 1334 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (!(success)) {
            
            //#line 1335 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__124817 = ::x10aux::makeStringLit("TODO: registering new child with parent: handle case where parent is dead (find nearest workable parent or backup)"); strLit__124817; }))))->c_str());
        }
        
    }
    
    //#line 1339 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(::x10::lang::Place::_make(::x10aux::here)->FMGL(id),
                                 ((x10_long)0ll)))) {
        
        //#line 1341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        nu->FMGL(hasBackup) = false;
    } else {
        
        //#line 1344 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::Place dst = (__extension__ ({
            ::x10::lang::Place this__102111 = ::x10::lang::Place::_make(::x10aux::here);
            this__102111->x10::lang::Place::next(((x10_long)1ll));
        }))
        ;
        
        //#line 1345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::Cell< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > >* cell =
           (new (::x10aux::alloc_z< ::x10::lang::Cell< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > > >()) ::x10::lang::Cell< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > >());
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > x__102515 =
          ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* >(::x10aux::class_cast_unchecked< ::x10::lang::FinishState__FinishResilientDistributedBackup*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        cell->FMGL(value) = x__102515;
        
        //#line 1346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        x10_boolean success2 = ::x10::lang::FinishState::lowLevelFetch< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > >(
                                 dst, reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > >*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > > >(sizeof(x10_lang_FinishState__FinishResilientDistributedMaster__closure__40)))x10_lang_FinishState__FinishResilientDistributedMaster__closure__40(gnu))),
                                 cell);
        
        //#line 1347 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (!(success2)) {
            
            //#line 1349 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__124818 = ::x10aux::makeStringLit("Could not find a backup place"); strLit__124818; }))))->c_str());
        } else {
            
            //#line 1351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
            {
                ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124819 = ::x10aux::makeStringLit("    backup is "); strLit__124819; })), cell->FMGL(value))))->c_str());
            }
            
            //#line 1353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            nu->FMGL(backup) = cell->FMGL(value);
            
            //#line 1354 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            nu->FMGL(hasBackup) = true;
        }
        
    }
    {
        
        //#line 1358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::CheckedThrowable* throwable__102651 =
          ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        try {
            {
                ::x10::lang::Runtime::enterAtomic();
                {
                    
                    //#line 1359 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    ::x10::lang::FinishState__FinishResilientDistributedMaster::FMGL(ALL__get)()->add(
                      nu);
                }
            }
            ::x10::compiler::Finalization::plausibleThrow();
        }
        catch (::x10::lang::CheckedThrowable* __exc1110) {
            if (true) {
                ::x10::lang::CheckedThrowable* formal__102652 =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1110);
                {
                    throwable__102651 = formal__102652;
                }
            } else
            throw;
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__102651)))
        {
            if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__102651))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__102651));
            }
            
        }
        if (true) {
            ::x10::lang::Runtime::exitAtomic();
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__102651)))
        {
            if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__102651)))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__102651));
            }
            
        }
        
    }
    
    //#line 1361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    return nu;
    
}

//#line 1364 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributedMaster::notifyAdoptedSubActivitySpawn(
  x10_long srcId, x10_long dstId) {
    
    //#line 1365 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->lock();
    
    //#line 1366 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (::x10::lang::FinishState::FMGL(VERBOSE__get)()) {
        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124824 = ::x10aux::makeStringLit("("); strLit__124824; })), this->FMGL(name)), (__extension__ ({ static ::x10::lang::String* strLit__124825 = ::x10aux::makeStringLit(").notifyAdoptedSubActivitySpawn("); strLit__124825; }))), srcId), (__extension__ ({ static ::x10::lang::String* strLit__124826 = ::x10aux::makeStringLit(", "); strLit__124826; }))), dstId), (__extension__ ({ static ::x10::lang::String* strLit__124827 = ::x10aux::makeStringLit(")"); strLit__124827; })))))->c_str());
    }
    
    //#line 1367 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Rail< x10_int >* a__102516 = this->FMGL(transitAdopted);
    x10_long i__102517 = ((srcId) + (((dstId) * (((x10_long)::x10aux::num_hosts)))));
    x10_int r__102518 = ((::x10aux::nullCheck(a__102516)->x10::lang::Rail< x10_int >::__apply(
                            i__102517)) + (((x10_int)1)));
    ::x10aux::nullCheck(a__102516)->x10::lang::Rail< x10_int >::__set(
      i__102517, r__102518);
    
    //#line 1368 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(totalCounter) = ((this->FMGL(totalCounter)) + (((x10_long)1ll)));
    
    //#line 1369 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (::x10::lang::FinishState::FMGL(VERBOSE__get)()) {
        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124829 = ::x10aux::makeStringLit("    transitAdopted("); strLit__124829; })), srcId), (__extension__ ({ static ::x10::lang::String* strLit__124830 = ::x10aux::makeStringLit(","); strLit__124830; }))), dstId), (__extension__ ({ static ::x10::lang::String* strLit__124831 = ::x10aux::makeStringLit(") == "); strLit__124831; }))), ::x10aux::nullCheck(this->FMGL(transitAdopted))->x10::lang::Rail< x10_int >::__apply(
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ((srcId) + (((dstId) * (((x10_long)::x10aux::num_hosts)))))))))->c_str());
    }
    
    //#line 1370 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->unlock();
    
    //#line 1371 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((this->FMGL(hasBackup) && !(((::x10aux::struct_equals(srcId,
                                                              ::x10::lang::Place::_make(::x10aux::here)->FMGL(id))) &&
        (::x10aux::struct_equals(dstId, ::x10::lang::Place::_make(::x10aux::here)->FMGL(id)))))))
    {
        
        //#line 1372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > bup =
          this->FMGL(backup);
        
        //#line 1373 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        x10_boolean success = ::x10::lang::FinishState::lowLevelAt(
                                ::x10::lang::Place::place((bup)->location),
                                reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__FinishResilientDistributedMaster__closure__41)))x10_lang_FinishState__FinishResilientDistributedMaster__closure__41(bup, srcId, dstId))));
        
        //#line 1374 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (!(success)) {
            
            //#line 1376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__124833 = ::x10aux::makeStringLit("Could not back up notifyAdoptedSubActivitySpawn(), backup place dead"); strLit__124833; }))))->c_str());
            
            //#line 1377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            this->FMGL(hasBackup) = false;
        }
        
    }
    
}

//#line 1382 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributedMaster::notifySubActivitySpawn(
  x10_long srcId, x10_long dstId) {
    
    //#line 1383 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->lock();
    
    //#line 1384 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (::x10::lang::FinishState::FMGL(VERBOSE__get)()) {
        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124834 = ::x10aux::makeStringLit("("); strLit__124834; })), this->FMGL(name)), (__extension__ ({ static ::x10::lang::String* strLit__124835 = ::x10aux::makeStringLit(").notifySubActivitySpawn("); strLit__124835; }))), srcId), (__extension__ ({ static ::x10::lang::String* strLit__124836 = ::x10aux::makeStringLit(", "); strLit__124836; }))), dstId), (__extension__ ({ static ::x10::lang::String* strLit__124837 = ::x10aux::makeStringLit(")"); strLit__124837; })))))->c_str());
    }
    
    //#line 1385 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Rail< x10_int >* a__102519 = this->FMGL(transit);
    x10_long i__102520 = ((srcId) + (((dstId) * (((x10_long)::x10aux::num_hosts)))));
    x10_int r__102521 = ((::x10aux::nullCheck(a__102519)->x10::lang::Rail< x10_int >::__apply(
                            i__102520)) + (((x10_int)1)));
    ::x10aux::nullCheck(a__102519)->x10::lang::Rail< x10_int >::__set(
      i__102520, r__102521);
    
    //#line 1386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(totalCounter) = ((this->FMGL(totalCounter)) + (((x10_long)1ll)));
    
    //#line 1387 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (::x10::lang::FinishState::FMGL(VERBOSE__get)()) {
        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124839 = ::x10aux::makeStringLit("    transit("); strLit__124839; })), srcId), (__extension__ ({ static ::x10::lang::String* strLit__124840 = ::x10aux::makeStringLit(","); strLit__124840; }))), dstId), (__extension__ ({ static ::x10::lang::String* strLit__124841 = ::x10aux::makeStringLit(") == "); strLit__124841; }))), ::x10aux::nullCheck(this->FMGL(transit))->x10::lang::Rail< x10_int >::__apply(
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ((srcId) + (((dstId) * (((x10_long)::x10aux::num_hosts)))))))))->c_str());
    }
    
    //#line 1388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->unlock();
    
    //#line 1389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((this->FMGL(hasBackup) && !(((::x10aux::struct_equals(srcId,
                                                              ::x10::lang::Place::_make(::x10aux::here)->FMGL(id))) &&
        (::x10aux::struct_equals(dstId, ::x10::lang::Place::_make(::x10aux::here)->FMGL(id)))))))
    {
        
        //#line 1390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > bup =
          this->FMGL(backup);
        
        //#line 1391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        x10_boolean success = ::x10::lang::FinishState::lowLevelAt(
                                ::x10::lang::Place::place((bup)->location),
                                reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__FinishResilientDistributedMaster__closure__42)))x10_lang_FinishState__FinishResilientDistributedMaster__closure__42(bup, srcId, dstId))));
        
        //#line 1392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (!(success)) {
            
            //#line 1394 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__124843 = ::x10aux::makeStringLit("Could not back up notifySubActivitySpawn(), backup place dead"); strLit__124843; }))))->c_str());
            
            //#line 1395 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            this->FMGL(hasBackup) = false;
        }
        
    }
    
}

//#line 1400 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
x10_boolean x10::lang::FinishState__FinishResilientDistributedMaster::notifyAdoptedActivityCreation(
  x10_long srcId, x10_long dstId) {
    
    //#line 1401 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->lock();
    
    //#line 1402 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (::x10::lang::FinishState::FMGL(VERBOSE__get)()) {
        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124844 = ::x10aux::makeStringLit("("); strLit__124844; })), this->FMGL(name)), (__extension__ ({ static ::x10::lang::String* strLit__124845 = ::x10aux::makeStringLit(").notifyAdoptedActivityCreation("); strLit__124845; }))), srcId), (__extension__ ({ static ::x10::lang::String* strLit__124846 = ::x10aux::makeStringLit(", "); strLit__124846; }))), dstId), (__extension__ ({ static ::x10::lang::String* strLit__124847 = ::x10aux::makeStringLit(")"); strLit__124847; })))))->c_str());
    }
    
    //#line 1403 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((__extension__ ({
            ::x10::lang::Place this__102116 = (__extension__ ({
                ::x10::lang::Place alloc__92670 =  ::x10::lang::Place::_alloc();
                (alloc__92670)->::x10::lang::Place::_constructor(
                  srcId);
                alloc__92670;
            }))
            ;
            x10rt_is_place_dead((x10_int)this__102116->FMGL(id));
        }))
        ) {
        
        //#line 1404 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(this->FMGL(latch))->unlock();
        
        //#line 1405 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        return false;
        
    }
    
    //#line 1407 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Rail< x10_int >* a__102522 = this->FMGL(liveAdopted);
    x10_long i__102523 = dstId;
    x10_int r__102524 = ((::x10aux::nullCheck(a__102522)->x10::lang::Rail< x10_int >::__apply(
                            i__102523)) + (((x10_int)1)));
    ::x10aux::nullCheck(a__102522)->x10::lang::Rail< x10_int >::__set(
      i__102523, r__102524);
    
    //#line 1408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Rail< x10_int >* a__102525 = this->FMGL(transitAdopted);
    x10_long i__102526 = ((srcId) + (((dstId) * (((x10_long)::x10aux::num_hosts)))));
    x10_int r__102527 = ((::x10aux::nullCheck(a__102525)->x10::lang::Rail< x10_int >::__apply(
                            i__102526)) - (((x10_int)1)));
    ::x10aux::nullCheck(a__102525)->x10::lang::Rail< x10_int >::__set(
      i__102526, r__102527);
    
    //#line 1409 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (::x10::lang::FinishState::FMGL(VERBOSE__get)()) {
        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124850 = ::x10aux::makeStringLit("    liveAdopted("); strLit__124850; })), dstId), (__extension__ ({ static ::x10::lang::String* strLit__124851 = ::x10aux::makeStringLit(") == "); strLit__124851; }))), ::x10aux::nullCheck(this->FMGL(liveAdopted))->x10::lang::Rail< x10_int >::__apply(
                                                                                                                                                                                                                                                                                                                                                                                                                                                            dstId))))->c_str());
    }
    
    //#line 1410 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (::x10::lang::FinishState::FMGL(VERBOSE__get)()) {
        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124853 = ::x10aux::makeStringLit("    transitAdopted("); strLit__124853; })), srcId), (__extension__ ({ static ::x10::lang::String* strLit__124854 = ::x10aux::makeStringLit(","); strLit__124854; }))), dstId), (__extension__ ({ static ::x10::lang::String* strLit__124855 = ::x10aux::makeStringLit(") == "); strLit__124855; }))), ::x10aux::nullCheck(this->FMGL(transitAdopted))->x10::lang::Rail< x10_int >::__apply(
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ((srcId) + (((dstId) * (((x10_long)::x10aux::num_hosts)))))))))->c_str());
    }
    
    //#line 1411 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->unlock();
    
    //#line 1412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((this->FMGL(hasBackup) && !(((::x10aux::struct_equals(srcId,
                                                              ::x10::lang::Place::_make(::x10aux::here)->FMGL(id))) &&
        (::x10aux::struct_equals(dstId, ::x10::lang::Place::_make(::x10aux::here)->FMGL(id)))))))
    {
        
        //#line 1413 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > bup =
          this->FMGL(backup);
        
        //#line 1414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        x10_boolean success = ::x10::lang::FinishState::lowLevelAt(
                                ::x10::lang::Place::place((bup)->location),
                                reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__FinishResilientDistributedMaster__closure__43)))x10_lang_FinishState__FinishResilientDistributedMaster__closure__43(bup, srcId, dstId))));
        
        //#line 1415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (!(success)) {
            
            //#line 1417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__124857 = ::x10aux::makeStringLit("Could not back up notifyAdoptedActivityCreation(), backup place dead"); strLit__124857; }))))->c_str());
            
            //#line 1418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            this->FMGL(hasBackup) = false;
        }
        
    }
    
    //#line 1421 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    return true;
    
}

//#line 1424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
x10_boolean x10::lang::FinishState__FinishResilientDistributedMaster::notifyActivityCreation(
  x10_long srcId, x10_long dstId) {
    
    //#line 1425 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->lock();
    
    //#line 1426 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (::x10::lang::FinishState::FMGL(VERBOSE__get)()) {
        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124858 = ::x10aux::makeStringLit("("); strLit__124858; })), this->FMGL(name)), (__extension__ ({ static ::x10::lang::String* strLit__124859 = ::x10aux::makeStringLit(").notifyActivityCreation("); strLit__124859; }))), srcId), (__extension__ ({ static ::x10::lang::String* strLit__124860 = ::x10aux::makeStringLit(", "); strLit__124860; }))), dstId), (__extension__ ({ static ::x10::lang::String* strLit__124861 = ::x10aux::makeStringLit(")"); strLit__124861; })))))->c_str());
    }
    
    //#line 1427 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((__extension__ ({
            ::x10::lang::Place this__102117 = (__extension__ ({
                ::x10::lang::Place alloc__92671 =  ::x10::lang::Place::_alloc();
                (alloc__92671)->::x10::lang::Place::_constructor(
                  srcId);
                alloc__92671;
            }))
            ;
            x10rt_is_place_dead((x10_int)this__102117->FMGL(id));
        }))
        ) {
        
        //#line 1428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(this->FMGL(latch))->unlock();
        
        //#line 1429 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        return false;
        
    }
    
    //#line 1431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Rail< x10_int >* a__102528 = this->FMGL(live);
    x10_long i__102529 = dstId;
    x10_int r__102530 = ((::x10aux::nullCheck(a__102528)->x10::lang::Rail< x10_int >::__apply(
                            i__102529)) + (((x10_int)1)));
    ::x10aux::nullCheck(a__102528)->x10::lang::Rail< x10_int >::__set(
      i__102529, r__102530);
    
    //#line 1432 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Rail< x10_int >* a__102531 = this->FMGL(transit);
    x10_long i__102532 = ((srcId) + (((dstId) * (((x10_long)::x10aux::num_hosts)))));
    x10_int r__102533 = ((::x10aux::nullCheck(a__102531)->x10::lang::Rail< x10_int >::__apply(
                            i__102532)) - (((x10_int)1)));
    ::x10aux::nullCheck(a__102531)->x10::lang::Rail< x10_int >::__set(
      i__102532, r__102533);
    
    //#line 1433 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (::x10::lang::FinishState::FMGL(VERBOSE__get)()) {
        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124864 = ::x10aux::makeStringLit("    live("); strLit__124864; })), dstId), (__extension__ ({ static ::x10::lang::String* strLit__124865 = ::x10aux::makeStringLit(") == "); strLit__124865; }))), ::x10aux::nullCheck(this->FMGL(live))->x10::lang::Rail< x10_int >::__apply(
                                                                                                                                                                                                                                                                                                                                                                                                                                                     dstId))))->c_str());
    }
    
    //#line 1434 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (::x10::lang::FinishState::FMGL(VERBOSE__get)()) {
        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124867 = ::x10aux::makeStringLit("    transit("); strLit__124867; })), srcId), (__extension__ ({ static ::x10::lang::String* strLit__124868 = ::x10aux::makeStringLit(","); strLit__124868; }))), dstId), (__extension__ ({ static ::x10::lang::String* strLit__124869 = ::x10aux::makeStringLit(") == "); strLit__124869; }))), ::x10aux::nullCheck(this->FMGL(transit))->x10::lang::Rail< x10_int >::__apply(
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ((srcId) + (((dstId) * (((x10_long)::x10aux::num_hosts)))))))))->c_str());
    }
    
    //#line 1435 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->unlock();
    
    //#line 1436 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((this->FMGL(hasBackup) && !(((::x10aux::struct_equals(srcId,
                                                              ::x10::lang::Place::_make(::x10aux::here)->FMGL(id))) &&
        (::x10aux::struct_equals(dstId, ::x10::lang::Place::_make(::x10aux::here)->FMGL(id)))))))
    {
        
        //#line 1437 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > bup =
          this->FMGL(backup);
        
        //#line 1438 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        x10_boolean success = ::x10::lang::FinishState::lowLevelAt(
                                ::x10::lang::Place::place((bup)->location),
                                reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__FinishResilientDistributedMaster__closure__44)))x10_lang_FinishState__FinishResilientDistributedMaster__closure__44(bup, srcId, dstId))));
        
        //#line 1439 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (!(success)) {
            
            //#line 1441 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__124871 = ::x10aux::makeStringLit("Could not back up notifyActivityCreation(), backup place dead"); strLit__124871; }))))->c_str());
            
            //#line 1442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            this->FMGL(hasBackup) = false;
        }
        
    }
    
    //#line 1445 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    return true;
    
}

//#line 1448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributedMaster::notifyAdoptedActivityTermination(
  x10_long dstId) {
    
    //#line 1449 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->lock();
    
    //#line 1450 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (::x10::lang::FinishState::FMGL(VERBOSE__get)()) {
        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124872 = ::x10aux::makeStringLit("("); strLit__124872; })), this->FMGL(name)), (__extension__ ({ static ::x10::lang::String* strLit__124873 = ::x10aux::makeStringLit(").notifyAdoptedActivityTermination("); strLit__124873; }))), dstId), (__extension__ ({ static ::x10::lang::String* strLit__124874 = ::x10aux::makeStringLit(")"); strLit__124874; })))))->c_str());
    }
    
    //#line 1451 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Rail< x10_int >* a__102534 = this->FMGL(liveAdopted);
    x10_long i__102535 = dstId;
    x10_int r__102536 = ((::x10aux::nullCheck(a__102534)->x10::lang::Rail< x10_int >::__apply(
                            i__102535)) - (((x10_int)1)));
    ::x10aux::nullCheck(a__102534)->x10::lang::Rail< x10_int >::__set(
      i__102535, r__102536);
    
    //#line 1452 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(totalCounter) = ((this->FMGL(totalCounter)) - (((x10_long)1ll)));
    
    //#line 1453 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (::x10::lang::FinishState::FMGL(VERBOSE__get)()) {
        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124876 = ::x10aux::makeStringLit("    liveAdopted("); strLit__124876; })), dstId), (__extension__ ({ static ::x10::lang::String* strLit__124877 = ::x10aux::makeStringLit(") == "); strLit__124877; }))), ::x10aux::nullCheck(this->FMGL(liveAdopted))->x10::lang::Rail< x10_int >::__apply(
                                                                                                                                                                                                                                                                                                                                                                                                                                                            dstId))))->c_str());
    }
    
    //#line 1454 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (this->x10::lang::FinishState__FinishResilientDistributedMaster::quiescent())
    {
        
        //#line 1455 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
        {
            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__124879 = ::x10aux::makeStringLit("    Releasing latch..."); strLit__124879; }))))->c_str());
        }
        
        //#line 1456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(this->FMGL(latch))->release();
    }
    
    //#line 1458 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->unlock();
    
    //#line 1459 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((this->FMGL(hasBackup) && (!::x10aux::struct_equals(dstId,
                                                            ::x10::lang::Place::_make(::x10aux::here)->FMGL(id)))))
    {
        
        //#line 1460 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > bup =
          this->FMGL(backup);
        
        //#line 1461 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        x10_boolean success = ::x10::lang::FinishState::lowLevelAt(
                                ::x10::lang::Place::place((bup)->location),
                                reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__FinishResilientDistributedMaster__closure__45)))x10_lang_FinishState__FinishResilientDistributedMaster__closure__45(bup, dstId))));
        
        //#line 1462 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (!(success)) {
            
            //#line 1464 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__124880 = ::x10aux::makeStringLit("Could not back up notifyAdoptedActivityTermination(), backup place dead"); strLit__124880; }))))->c_str());
            
            //#line 1465 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            this->FMGL(hasBackup) = false;
        }
        
    }
    
}

//#line 1470 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributedMaster::notifyActivityTermination(
  x10_long dstId) {
    
    //#line 1471 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->lock();
    
    //#line 1472 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (::x10::lang::FinishState::FMGL(VERBOSE__get)()) {
        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124881 = ::x10aux::makeStringLit("("); strLit__124881; })), this->FMGL(name)), (__extension__ ({ static ::x10::lang::String* strLit__124882 = ::x10aux::makeStringLit(").notifyActivityTermination("); strLit__124882; }))), dstId), (__extension__ ({ static ::x10::lang::String* strLit__124883 = ::x10aux::makeStringLit(")"); strLit__124883; })))))->c_str());
    }
    
    //#line 1473 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Rail< x10_int >* a__102537 = this->FMGL(live);
    x10_long i__102538 = dstId;
    x10_int r__102539 = ((::x10aux::nullCheck(a__102537)->x10::lang::Rail< x10_int >::__apply(
                            i__102538)) - (((x10_int)1)));
    ::x10aux::nullCheck(a__102537)->x10::lang::Rail< x10_int >::__set(
      i__102538, r__102539);
    
    //#line 1474 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(totalCounter) = ((this->FMGL(totalCounter)) - (((x10_long)1ll)));
    
    //#line 1475 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (::x10::lang::FinishState::FMGL(VERBOSE__get)()) {
        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124885 = ::x10aux::makeStringLit("    live("); strLit__124885; })), dstId), (__extension__ ({ static ::x10::lang::String* strLit__124886 = ::x10aux::makeStringLit(") == "); strLit__124886; }))), ::x10aux::nullCheck(this->FMGL(live))->x10::lang::Rail< x10_int >::__apply(
                                                                                                                                                                                                                                                                                                                                                                                                                                                     dstId))))->c_str());
    }
    
    //#line 1476 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (this->x10::lang::FinishState__FinishResilientDistributedMaster::quiescent())
    {
        
        //#line 1477 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
        {
            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__124888 = ::x10aux::makeStringLit("    Releasing latch..."); strLit__124888; }))))->c_str());
        }
        
        //#line 1478 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(this->FMGL(latch))->release();
    }
    
    //#line 1480 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->unlock();
    
    //#line 1481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((this->FMGL(hasBackup) && (!::x10aux::struct_equals(dstId,
                                                            ::x10::lang::Place::_make(::x10aux::here)->FMGL(id)))))
    {
        
        //#line 1482 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > bup =
          this->FMGL(backup);
        
        //#line 1483 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        x10_boolean success = ::x10::lang::FinishState::lowLevelAt(
                                ::x10::lang::Place::place((bup)->location),
                                reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__FinishResilientDistributedMaster__closure__46)))x10_lang_FinishState__FinishResilientDistributedMaster__closure__46(bup, dstId))));
        
        //#line 1484 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (!(success)) {
            
            //#line 1486 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__124889 = ::x10aux::makeStringLit("Could not back up notifyActivityTermination(), backup place dead"); strLit__124889; }))))->c_str());
            
            //#line 1487 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            this->FMGL(hasBackup) = false;
        }
        
    }
    
}

//#line 1492 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributedMaster::notifyPlaceDeath(
  ) {
    
    //#line 1493 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->lock();
    
    //#line 1494 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (::x10::lang::FinishState::FMGL(VERBOSE__get)()) {
        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124890 = ::x10aux::makeStringLit("("); strLit__124890; })), this->FMGL(name)), (__extension__ ({ static ::x10::lang::String* strLit__124891 = ::x10aux::makeStringLit(").notifyPlaceDeath()"); strLit__124891; })))))->c_str());
    }
    
    //#line 1495 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (this->x10::lang::FinishState__FinishResilientDistributedMaster::quiescent())
    {
        
        //#line 1496 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
        {
            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__124892 = ::x10aux::makeStringLit("    Releasing latch..."); strLit__124892; }))))->c_str());
        }
        
        //#line 1497 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::nullCheck(this->FMGL(latch))->release();
    }
    
    //#line 1499 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->unlock();
}

//#line 1502 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributedMaster::notifyAllPlaceDeath(
  ) {
    {
        
        //#line 1503 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::CheckedThrowable* throwable__102654 =
          ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        try {
            {
                ::x10::lang::Runtime::enterAtomic();
                {
                    
                    //#line 1504 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    {
                        ::x10::lang::Iterator< ::x10::lang::FinishState__FinishResilientDistributedMaster*>* x__92746;
                        for (x__92746 = ::x10::lang::FinishState__FinishResilientDistributedMaster::FMGL(ALL__get)()->iterator();
                             ::x10::lang::Iterator< ::x10::lang::FinishState__FinishResilientDistributedMaster*>::hasNext(::x10aux::nullCheck(x__92746));
                             ) {
                            ::x10::lang::FinishState__FinishResilientDistributedMaster* x =
                              ::x10::lang::Iterator< ::x10::lang::FinishState__FinishResilientDistributedMaster*>::next(::x10aux::nullCheck(x__92746));
                            
                            //#line 1505 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                            if ((!::x10aux::struct_equals(x,
                                                          reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
                            {
                                ::x10aux::nullCheck(x)->x10::lang::FinishState__FinishResilientDistributedMaster::notifyPlaceDeath();
                            }
                            
                        }
                    }
                    
                }
            }
            ::x10::compiler::Finalization::plausibleThrow();
        }
        catch (::x10::lang::CheckedThrowable* __exc1119) {
            if (true) {
                ::x10::lang::CheckedThrowable* formal__102655 =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1119);
                {
                    throwable__102654 = formal__102655;
                }
            } else
            throw;
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__102654)))
        {
            if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__102654))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__102654));
            }
            
        }
        if (true) {
            ::x10::lang::Runtime::exitAtomic();
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__102654)))
        {
            if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__102654)))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__102654));
            }
            
        }
        
    }
}

//#line 1510 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributedMaster::pushException(
  ::x10::lang::Exception* t) {
    
    //#line 1511 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->lock();
    
    //#line 1512 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (::x10::lang::FinishState::FMGL(VERBOSE__get)()) {
        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124893 = ::x10aux::makeStringLit("("); strLit__124893; })), this->FMGL(name)), (__extension__ ({ static ::x10::lang::String* strLit__124894 = ::x10aux::makeStringLit(").pushException("); strLit__124894; }))), t), (__extension__ ({ static ::x10::lang::String* strLit__124895 = ::x10aux::makeStringLit(")"); strLit__124895; })))))->c_str());
    }
    
    //#line 1513 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->x10::lang::FinishState__FinishResilientDistributedMaster::ensureMultipleExceptions())->x10::util::GrowableRail< ::x10::lang::Exception*>::add(
      t);
    
    //#line 1514 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->unlock();
}

//#line 1519 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributedMaster::pullUpDeadChildFinishes(
  ) {
    
    //#line 1520 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > this_ =
      ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >(this);
    
    //#line 1521 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->lock();
    
    //#line 1522 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    {
        x10_long chindex;
        for (chindex = ((x10_long)0ll); ((chindex) < ((__extension__ ({
                                            ::x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >* this__102118 =
                                              this->FMGL(children);
                                            ::x10aux::nullCheck(this__102118)->FMGL(size);
                                        }))
                                        )); chindex = ((chindex) + (((x10_long)1ll))))
        {
            
            //#line 1523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > child =
              (__extension__ ({
                ::x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >* this__102120 =
                  this->FMGL(children);
                
                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                x10_long idx__102119 = chindex;
                ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > ret__102121;
                
                //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                ret__102121 = ::x10aux::nullCheck(::x10aux::nullCheck(this__102120)->FMGL(data))->x10::lang::Rail< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >::__apply(
                                idx__102119);
                ret__102121;
            }))
            ;
            
            //#line 1524 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            if (!((__extension__ ({
                    ::x10::lang::Place this__102123 = ::x10::lang::Place::place((child)->location);
                    x10rt_is_place_dead((x10_int)this__102123->FMGL(id));
                }))
                )) {
                continue;
            }
            
            //#line 1526 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
            {
                ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__124897 = ::x10aux::makeStringLit("Adopting child finish..."); strLit__124897; }))))->c_str());
            }
            
            //#line 1529 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            if ((!::x10aux::struct_equals(chindex, (((__extension__ ({
                                              ::x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >* this__102124 =
                                                this->FMGL(children);
                                              ::x10aux::nullCheck(this__102124)->FMGL(size);
                                          }))
                                          ) - (((x10_long)1ll))))))
            {
                
                //#line 1530 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                ::x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >* this__102540 =
                  this->FMGL(children);
                
                //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                x10_long idx__102541 = chindex;
                ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > v__102542 =
                  (__extension__ ({
                    
                    //#line 1530 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    ::x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >* this__102543 =
                      this->FMGL(children);
                    
                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    x10_long idx__102544 = (((__extension__ ({
                        
                        //#line 1530 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                        ::x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >* this__102545 =
                          this->FMGL(children);
                        ::x10aux::nullCheck(this__102545)->FMGL(size);
                    }))
                    ) - (((x10_long)1ll)));
                    ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > ret__102546;
                    
                    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    ret__102546 = ::x10aux::nullCheck(::x10aux::nullCheck(this__102543)->FMGL(data))->x10::lang::Rail< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >::__apply(
                                    idx__102544);
                    ret__102546;
                }))
                ;
                
                //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                if ((::x10aux::struct_equals(idx__102541,
                                             ::x10aux::nullCheck(this__102540)->FMGL(size))))
                {
                    
                    //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    ::x10aux::nullCheck(this__102540)->x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >::add(
                      v__102542);
                } else {
                    
                    //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                    ::x10aux::nullCheck(::x10aux::nullCheck(this__102540)->FMGL(data))->x10::lang::Rail< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >::__set(
                      idx__102541, v__102542);
                }
                
            }
            
            //#line 1532 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10aux::nullCheck(this->FMGL(children))->x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >::removeLast();
            
            //#line 1533 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            chindex = ((chindex) - (((x10_long)1ll)));
            
            //#line 1537 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::lang::Cell< ::x10::lang::FinishState__FinishResilientDistributedBackup*>* backup_cell =
               (new (::x10aux::alloc_z< ::x10::lang::Cell< ::x10::lang::FinishState__FinishResilientDistributedBackup*> >()) ::x10::lang::Cell< ::x10::lang::FinishState__FinishResilientDistributedBackup*>());
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
            ::x10::lang::FinishState__FinishResilientDistributedBackup* x__102556 =
              ::x10aux::class_cast_unchecked< ::x10::lang::FinishState__FinishResilientDistributedBackup*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            backup_cell->FMGL(value) = (reinterpret_cast< ::x10::lang::FinishState__FinishResilientDistributedBackup*>(reinterpret_cast< ::x10::lang::FinishState__FinishResilientDistributedBackup*>(X10_NULL)));
            
            //#line 1538 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            x10_boolean found = ::x10::lang::FinishState__FinishResilientDistributedBackup::backupLowLevelFetch< ::x10::lang::FinishState__FinishResilientDistributedBackup* >(
                                  child, reinterpret_cast< ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, ::x10::lang::FinishState__FinishResilientDistributedBackup*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, ::x10::lang::FinishState__FinishResilientDistributedBackup*> >(sizeof(x10_lang_FinishState__FinishResilientDistributedMaster__closure__47)))x10_lang_FinishState__FinishResilientDistributedMaster__closure__47(this_))),
                                  backup_cell);
            
            //#line 1547 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            if (!(found)) {
                
                //#line 1548 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__124901 = ::x10aux::makeStringLit("Fatal error: both master and backup finish store lost due to place failure."); strLit__124901; }))))->c_str());
            }
            
            //#line 1550 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::lang::FinishState__FinishResilientDistributedBackup* bup =
              backup_cell->FMGL(value);
            
            //#line 1552 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10aux::nullCheck(this->FMGL(children))->x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >::addAll(
              ::x10aux::nullCheck(bup)->FMGL(children));
            
            //#line 1553 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            x10_long i__92766max__102557 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
            {
                x10_long i__102558;
                for (i__102558 = ((x10_long)0ll); ((i__102558) <= (i__92766max__102557));
                     i__102558 = ((i__102558) + (((x10_long)1ll))))
                {
                    x10_long i__102559 = i__102558;
                    
                    //#line 1554 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    if ((::x10::lang::FinishState::FMGL(VERBOSE__get)() &&
                        (!::x10aux::struct_equals(::x10aux::nullCheck(::x10aux::nullCheck(bup)->FMGL(live))->x10::lang::Rail< x10_int >::__apply(
                                                    i__102559),
                                                  ((x10_int)0)))))
                    {
                        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124903 = ::x10aux::makeStringLit("live at adopted finish ("); strLit__124903; })), i__102559), (__extension__ ({ static ::x10::lang::String* strLit__124904 = ::x10aux::makeStringLit(") = "); strLit__124904; }))), ::x10aux::nullCheck(::x10aux::nullCheck(bup)->FMGL(live))->x10::lang::Rail< x10_int >::__apply(
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       i__102559))))->c_str());
                    }
                    
                    //#line 1555 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    ::x10::lang::Rail< x10_int >* a__102550 =
                      this->FMGL(liveAdopted);
                    x10_long i__102551 = i__102559;
                    x10_int r__102552 = ((::x10aux::nullCheck(a__102550)->x10::lang::Rail< x10_int >::__apply(
                                            i__102551)) + (::x10aux::nullCheck(::x10aux::nullCheck(bup)->FMGL(live))->x10::lang::Rail< x10_int >::__apply(
                                                             i__102559)));
                    ::x10aux::nullCheck(a__102550)->x10::lang::Rail< x10_int >::__set(
                      i__102551, r__102552);
                    
                    //#line 1556 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    x10_long i__92748max__102553 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
                    {
                        x10_long i__102554;
                        for (i__102554 = ((x10_long)0ll);
                             ((i__102554) <= (i__92748max__102553));
                             i__102554 = ((i__102554) + (((x10_long)1ll))))
                        {
                            x10_long j__102555 = i__102554;
                            
                            //#line 1557 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                            if ((::x10::lang::FinishState::FMGL(VERBOSE__get)() &&
                                (!::x10aux::struct_equals(::x10aux::nullCheck(::x10aux::nullCheck(bup)->FMGL(transit))->x10::lang::Rail< x10_int >::__apply(
                                                            ((i__102559) + (((j__102555) * (((x10_long)::x10aux::num_hosts)))))),
                                                          ((x10_int)0)))))
                            {
                                ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124909 = ::x10aux::makeStringLit("transit at adopted finish ("); strLit__124909; })), i__102559), (__extension__ ({ static ::x10::lang::String* strLit__124910 = ::x10aux::makeStringLit(","); strLit__124910; }))), j__102555), (__extension__ ({ static ::x10::lang::String* strLit__124911 = ::x10aux::makeStringLit(") = "); strLit__124911; }))), ::x10aux::nullCheck(::x10aux::nullCheck(bup)->FMGL(transit))->x10::lang::Rail< x10_int >::__apply(
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ((i__102559) + (((j__102555) * (((x10_long)::x10aux::num_hosts)))))))))->c_str());
                            }
                            
                            //#line 1558 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                            ::x10::lang::Rail< x10_int >* a__102547 =
                              this->FMGL(transitAdopted);
                            x10_long i__102548 = ((i__102559) + (((j__102555) * (((x10_long)::x10aux::num_hosts)))));
                            x10_int r__102549 = ((::x10aux::nullCheck(a__102547)->x10::lang::Rail< x10_int >::__apply(
                                                    i__102548)) + (::x10aux::nullCheck(::x10aux::nullCheck(bup)->FMGL(transit))->x10::lang::Rail< x10_int >::__apply(
                                                                     ((i__102559) + (((j__102555) * (((x10_long)::x10aux::num_hosts))))))));
                            ::x10aux::nullCheck(a__102547)->x10::lang::Rail< x10_int >::__set(
                              i__102548, r__102549);
                        }
                    }
                    
                }
            }
            
            //#line 1562 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            this->x10::lang::FinishState__FinishResilientDistributedMaster::recalculateTotal();
        }
    }
    
    //#line 1566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(this->FMGL(latch))->unlock();
}

//#line 1571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
x10_boolean x10::lang::FinishState__FinishResilientDistributedMaster::quiescent(
  ) {
    
    //#line 1578 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    x10_long nd = ((x10_long)x10rt_ndead());
    
    //#line 1579 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((!::x10aux::struct_equals(nd, this->FMGL(numDead))))
    {
        
        //#line 1580 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        this->FMGL(numDead) = nd;
        
        //#line 1581 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        this->x10::lang::FinishState__FinishResilientDistributedMaster::pullUpDeadChildFinishes();
    }
    
    //#line 1585 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    x10_boolean need_recalculate = false;
    
    //#line 1586 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    x10_long i__92838max__102583 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
    {
        x10_long i__102584;
        for (i__102584 = ((x10_long)0ll); ((i__102584) <= (i__92838max__102583));
             i__102584 = ((i__102584) + (((x10_long)1ll))))
        {
            x10_long i__102585 = i__102584;
            
            //#line 1587 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            if (x10rt_is_place_dead((x10_int)i__102585)) {
                
                //#line 1588 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                x10_long i__92784max__102565 = ((x10_long)(::x10aux::nullCheck(this->FMGL(live))->x10::lang::Rail< x10_int >::__apply(
                                                             i__102585)));
                {
                    x10_long i__102566;
                    for (i__102566 = ((x10_long)1ll); ((i__102566) <= (i__92784max__102565));
                         i__102566 = ((i__102566) + (((x10_long)1ll))))
                    {
                        x10_long unused__102567 = i__102566;
                        
                        //#line 1589 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                        this->x10::lang::FinishState__FinishResilientDistributedMaster::addDeadPlaceException(
                          (__extension__ ({
                              ::x10::lang::Place alloc__102560 =
                                 ::x10::lang::Place::_alloc();
                              (alloc__102560)->::x10::lang::Place::_constructor(
                                i__102585);
                              alloc__102560;
                          }))
                          );
                    }
                }
                
                //#line 1591 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                ::x10aux::nullCheck(this->FMGL(live))->x10::lang::Rail< x10_int >::__set(
                  i__102585, ((x10_int)0));
                
                //#line 1592 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                ::x10aux::nullCheck(this->FMGL(liveAdopted))->x10::lang::Rail< x10_int >::__set(
                  i__102585, ((x10_int)0));
                
                //#line 1595 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                x10_long i__92820max__102568 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
                {
                    x10_long i__102569;
                    for (i__102569 = ((x10_long)0ll); ((i__102569) <= (i__92820max__102568));
                         i__102569 = ((i__102569) + (((x10_long)1ll))))
                    {
                        x10_long j__102570 = i__102569;
                        
                        //#line 1600 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                        ::x10aux::nullCheck(this->FMGL(transit))->x10::lang::Rail< x10_int >::__set(
                          ((i__102585) + (((j__102570) * (((x10_long)::x10aux::num_hosts))))),
                          ((x10_int)0));
                        
                        //#line 1601 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                        ::x10aux::nullCheck(this->FMGL(transitAdopted))->x10::lang::Rail< x10_int >::__set(
                          ((i__102585) + (((j__102570) * (((x10_long)::x10aux::num_hosts))))),
                          ((x10_int)0));
                        
                        //#line 1603 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                        x10_long i__92802max__102562 = ((x10_long)(::x10aux::nullCheck(this->FMGL(transit))->x10::lang::Rail< x10_int >::__apply(
                                                                     ((j__102570) + (((i__102585) * (((x10_long)::x10aux::num_hosts))))))));
                        {
                            x10_long i__102563;
                            for (i__102563 = ((x10_long)1ll);
                                 ((i__102563) <= (i__92802max__102562));
                                 i__102563 = ((i__102563) + (((x10_long)1ll))))
                            {
                                x10_long unused__102564 =
                                  i__102563;
                                
                                //#line 1604 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                                this->x10::lang::FinishState__FinishResilientDistributedMaster::addDeadPlaceException(
                                  (__extension__ ({
                                      ::x10::lang::Place alloc__102561 =
                                         ::x10::lang::Place::_alloc();
                                      (alloc__102561)->::x10::lang::Place::_constructor(
                                        i__102585);
                                      alloc__102561;
                                  }))
                                  );
                            }
                        }
                        
                        //#line 1606 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                        ::x10aux::nullCheck(this->FMGL(transit))->x10::lang::Rail< x10_int >::__set(
                          ((j__102570) + (((i__102585) * (((x10_long)::x10aux::num_hosts))))),
                          ((x10_int)0));
                        
                        //#line 1607 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                        ::x10aux::nullCheck(this->FMGL(transitAdopted))->x10::lang::Rail< x10_int >::__set(
                          ((j__102570) + (((i__102585) * (((x10_long)::x10aux::num_hosts))))),
                          ((x10_int)0));
                    }
                }
                
                //#line 1609 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                need_recalculate = true;
            }
            
        }
    }
    
    //#line 1612 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (need_recalculate) {
        this->x10::lang::FinishState__FinishResilientDistributedMaster::recalculateTotal();
    }
    
    //#line 1615 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (((this->FMGL(totalCounter)) <= (((x10_long)0ll))))
    {
        return true;
        
    }
    
    //#line 1617 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (::x10::lang::FinishState::FMGL(VERBOSE__get)()) {
        
        //#line 1618 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124917 = ::x10aux::makeStringLit("("); strLit__124917; })), this->FMGL(name)), (__extension__ ({ static ::x10::lang::String* strLit__124918 = ::x10aux::makeStringLit(").quiescent()"); strLit__124918; })))))->c_str());
        
        //#line 1619 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        x10_long i__92874max__102577 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
        {
            x10_long i__102578;
            for (i__102578 = ((x10_long)0ll); ((i__102578) <= (i__92874max__102577));
                 i__102578 = ((i__102578) + (((x10_long)1ll))))
            {
                x10_long i__102579 = i__102578;
                
                //#line 1620 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                if (((((x10_long)(::x10aux::nullCheck(this->FMGL(live))->x10::lang::Rail< x10_int >::__apply(
                                    i__102579)))) > (((x10_long)0ll))))
                {
                    
                    //#line 1621 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
                    {
                        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124920 = ::x10aux::makeStringLit("    ("); strLit__124920; })), this->FMGL(name)), (__extension__ ({ static ::x10::lang::String* strLit__124921 = ::x10aux::makeStringLit(") Live at "); strLit__124921; }))), i__102579)))->c_str());
                    }
                    
                    //#line 1622 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    return false;
                    
                }
                
                //#line 1624 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                x10_long i__92856max__102571 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
                {
                    x10_long i__102572;
                    for (i__102572 = ((x10_long)0ll); ((i__102572) <= (i__92856max__102571));
                         i__102572 = ((i__102572) + (((x10_long)1ll))))
                    {
                        x10_long j__102573 = i__102572;
                        
                        //#line 1625 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                        if (((((x10_long)(::x10aux::nullCheck(this->FMGL(transit))->x10::lang::Rail< x10_int >::__apply(
                                            ((i__102579) + (((j__102573) * (((x10_long)::x10aux::num_hosts))))))))) > (((x10_long)0ll))))
                        {
                            
                            //#line 1626 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                            if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
                            {
                                ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124923 = ::x10aux::makeStringLit("    ("); strLit__124923; })), this->FMGL(name)), (__extension__ ({ static ::x10::lang::String* strLit__124924 = ::x10aux::makeStringLit(") In transit from "); strLit__124924; }))), i__102579), (__extension__ ({ static ::x10::lang::String* strLit__124925 = ::x10aux::makeStringLit(" -> "); strLit__124925; }))), j__102573)))->c_str());
                            }
                            
                            //#line 1627 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                            return false;
                            
                        }
                        
                    }
                }
                
            }
        }
        
        //#line 1631 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        x10_long i__92910max__102580 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
        {
            x10_long i__102581;
            for (i__102581 = ((x10_long)0ll); ((i__102581) <= (i__92910max__102580));
                 i__102581 = ((i__102581) + (((x10_long)1ll))))
            {
                x10_long i__102582 = i__102581;
                
                //#line 1632 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                if (((((x10_long)(::x10aux::nullCheck(this->FMGL(liveAdopted))->x10::lang::Rail< x10_int >::__apply(
                                    i__102582)))) > (((x10_long)0ll))))
                {
                    
                    //#line 1633 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
                    {
                        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124927 = ::x10aux::makeStringLit("    ("); strLit__124927; })), this->FMGL(name)), (__extension__ ({ static ::x10::lang::String* strLit__124928 = ::x10aux::makeStringLit(") Live (adopted) at "); strLit__124928; }))), i__102582)))->c_str());
                    }
                    
                    //#line 1634 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    return false;
                    
                }
                
                //#line 1636 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                x10_long i__92892max__102574 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
                {
                    x10_long i__102575;
                    for (i__102575 = ((x10_long)0ll); ((i__102575) <= (i__92892max__102574));
                         i__102575 = ((i__102575) + (((x10_long)1ll))))
                    {
                        x10_long j__102576 = i__102575;
                        
                        //#line 1637 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                        if (((((x10_long)(::x10aux::nullCheck(this->FMGL(transitAdopted))->x10::lang::Rail< x10_int >::__apply(
                                            ((i__102582) + (((j__102576) * (((x10_long)::x10aux::num_hosts))))))))) > (((x10_long)0ll))))
                        {
                            
                            //#line 1638 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                            if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
                            {
                                ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124930 = ::x10aux::makeStringLit("    ("); strLit__124930; })), this->FMGL(name)), (__extension__ ({ static ::x10::lang::String* strLit__124931 = ::x10aux::makeStringLit(") In transit (adopted) from "); strLit__124931; }))), i__102582), (__extension__ ({ static ::x10::lang::String* strLit__124932 = ::x10aux::makeStringLit(" -> "); strLit__124932; }))), j__102576)))->c_str());
                            }
                            
                            //#line 1639 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                            return false;
                            
                        }
                        
                    }
                }
                
            }
        }
        
    }
    
    //#line 1645 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    return false;
    
}

//#line 1244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::FinishState__FinishResilientDistributedMaster*
  x10::lang::FinishState__FinishResilientDistributedMaster::x10__lang__FinishState__FinishResilientDistributedMaster____this__x10__lang__FinishState__FinishResilientDistributedMaster(
  ) {
    return this;
    
}
void x10::lang::FinishState__FinishResilientDistributedMaster::__fieldInitializers_x10_lang_FinishState_FinishResilientDistributedMaster(
  ) {
    this->FMGL(totalCounter) = ((x10_long)0ll);
    this->FMGL(numDead) = ((x10_long)0ll);
    this->FMGL(multipleExceptions) = (::x10aux::class_cast_unchecked< ::x10::util::GrowableRail< ::x10::lang::Exception*>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(backup) = ::x10aux::zeroValue< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > >();
    this->FMGL(hasBackup) = false;
}
const ::x10aux::serialization_id_t x10::lang::FinishState__FinishResilientDistributedMaster::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::FinishState__FinishResilientDistributedMaster::_deserializer);

void x10::lang::FinishState__FinishResilientDistributedMaster::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(transit));
    buf.write(this->FMGL(live));
    buf.write(this->FMGL(transitAdopted));
    buf.write(this->FMGL(liveAdopted));
    buf.write(this->FMGL(totalCounter));
    buf.write(this->FMGL(children));
    buf.write(this->FMGL(numDead));
    buf.write(this->FMGL(multipleExceptions));
    buf.write(this->FMGL(latch));
    buf.write(this->FMGL(backup));
    buf.write(this->FMGL(hasBackup));
    buf.write(this->FMGL(name));
    
}

::x10::lang::Reference* ::x10::lang::FinishState__FinishResilientDistributedMaster::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState__FinishResilientDistributedMaster* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishResilientDistributedMaster>()) ::x10::lang::FinishState__FinishResilientDistributedMaster();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::FinishState__FinishResilientDistributedMaster::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(transit) = buf.read< ::x10::lang::Rail< x10_int >*>();
    FMGL(live) = buf.read< ::x10::lang::Rail< x10_int >*>();
    FMGL(transitAdopted) = buf.read< ::x10::lang::Rail< x10_int >*>();
    FMGL(liveAdopted) = buf.read< ::x10::lang::Rail< x10_int >*>();
    FMGL(totalCounter) = buf.read<x10_long>();
    FMGL(children) = buf.read< ::x10::util::GrowableRail< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >*>();
    FMGL(numDead) = buf.read<x10_long>();
    FMGL(multipleExceptions) = buf.read< ::x10::util::GrowableRail< ::x10::lang::Exception*>*>();
    FMGL(latch) = buf.read< ::x10::util::concurrent::SimpleLatch*>();
    FMGL(backup) = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > >();
    FMGL(hasBackup) = buf.read<x10_boolean>();
    FMGL(name) = buf.read< ::x10::lang::String*>();
}

::x10aux::RuntimeType x10::lang::FinishState__FinishResilientDistributedMaster::rtt;
void x10::lang::FinishState__FinishResilientDistributedMaster::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Runtime__Mortal>()};
    rtt.initStageTwo("x10.lang.FinishState.FinishResilientDistributedMaster",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributedMaster__closure__39>x10_lang_FinishState__FinishResilientDistributedMaster__closure__39::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientDistributedMaster__closure__39::__apply, &x10_lang_FinishState__FinishResilientDistributedMaster__closure__39::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientDistributedMaster__closure__39::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__FinishResilientDistributedMaster__closure__39::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributedMaster__closure__39::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientDistributedMaster__closure__39::_deserialize);

::x10::lang::Fun_0_0< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > >::itable<x10_lang_FinishState__FinishResilientDistributedMaster__closure__40>x10_lang_FinishState__FinishResilientDistributedMaster__closure__40::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientDistributedMaster__closure__40::__apply, &x10_lang_FinishState__FinishResilientDistributedMaster__closure__40::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientDistributedMaster__closure__40::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedBackup* > > >, &x10_lang_FinishState__FinishResilientDistributedMaster__closure__40::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributedMaster__closure__40::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientDistributedMaster__closure__40::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributedMaster__closure__41>x10_lang_FinishState__FinishResilientDistributedMaster__closure__41::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientDistributedMaster__closure__41::__apply, &x10_lang_FinishState__FinishResilientDistributedMaster__closure__41::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientDistributedMaster__closure__41::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__FinishResilientDistributedMaster__closure__41::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributedMaster__closure__41::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientDistributedMaster__closure__41::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributedMaster__closure__42>x10_lang_FinishState__FinishResilientDistributedMaster__closure__42::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientDistributedMaster__closure__42::__apply, &x10_lang_FinishState__FinishResilientDistributedMaster__closure__42::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientDistributedMaster__closure__42::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__FinishResilientDistributedMaster__closure__42::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributedMaster__closure__42::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientDistributedMaster__closure__42::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributedMaster__closure__43>x10_lang_FinishState__FinishResilientDistributedMaster__closure__43::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientDistributedMaster__closure__43::__apply, &x10_lang_FinishState__FinishResilientDistributedMaster__closure__43::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientDistributedMaster__closure__43::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__FinishResilientDistributedMaster__closure__43::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributedMaster__closure__43::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientDistributedMaster__closure__43::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributedMaster__closure__44>x10_lang_FinishState__FinishResilientDistributedMaster__closure__44::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientDistributedMaster__closure__44::__apply, &x10_lang_FinishState__FinishResilientDistributedMaster__closure__44::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientDistributedMaster__closure__44::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__FinishResilientDistributedMaster__closure__44::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributedMaster__closure__44::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientDistributedMaster__closure__44::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributedMaster__closure__45>x10_lang_FinishState__FinishResilientDistributedMaster__closure__45::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientDistributedMaster__closure__45::__apply, &x10_lang_FinishState__FinishResilientDistributedMaster__closure__45::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientDistributedMaster__closure__45::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__FinishResilientDistributedMaster__closure__45::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributedMaster__closure__45::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientDistributedMaster__closure__45::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributedMaster__closure__46>x10_lang_FinishState__FinishResilientDistributedMaster__closure__46::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientDistributedMaster__closure__46::__apply, &x10_lang_FinishState__FinishResilientDistributedMaster__closure__46::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientDistributedMaster__closure__46::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__FinishResilientDistributedMaster__closure__46::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributedMaster__closure__46::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientDistributedMaster__closure__46::_deserialize);

::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, ::x10::lang::FinishState__FinishResilientDistributedBackup*>::itable<x10_lang_FinishState__FinishResilientDistributedMaster__closure__47>x10_lang_FinishState__FinishResilientDistributedMaster__closure__47::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientDistributedMaster__closure__47::__apply, &x10_lang_FinishState__FinishResilientDistributedMaster__closure__47::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientDistributedMaster__closure__47::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, ::x10::lang::FinishState__FinishResilientDistributedBackup*> >, &x10_lang_FinishState__FinishResilientDistributedMaster__closure__47::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributedMaster__closure__47::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientDistributedMaster__closure__47::_deserialize);

/* END of FinishState$FinishResilientDistributedMaster */
/*************************************************/
/*************************************************/
/* START of FinishState$FinishResilientDistributed */
#include <x10/lang/FinishState__FinishResilientDistributed.h>

#include <x10/lang/FinishState.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/FinishState__FinishResilientDistributedMaster.h>
#include <x10/lang/Activity.h>
#include <x10/lang/Runtime.h>
#include <x10/util/concurrent/SimpleLatch.h>
#include <x10/lang/Place.h>
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Cell.h>
#include <x10/util/Pair.h>
#include <x10/lang/FinishState__FinishResilientDistributedBackup.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/lang/Any.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/util/Triple.h>
#include <x10/lang/String.h>
#include <x10/lang/Exception.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/util/MapSet.h>
#include <x10/util/HashSet.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/util/GrowableRail.h>
#include <x10/lang/MultipleExceptions.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/lang/Runtime__AtCheckedWrapper.h>
#include <x10/compiler/RemoteInvocation.h>
#include <x10/lang/Rail.h>
#include <x10/lang/WrappedThrowable.h>
#include <x10/lang/Empty.h>
#include <x10/compiler/StackAllocate.h>
#include <x10/lang/Int.h>
#include <x10/lang/DeadPlaceException.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__48_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__48_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__FinishResilientDistributed__closure__48 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributed__closure__48> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::FinishState__FinishResilientDistributedMaster* >(the_root_))->x10::lang::FinishState__FinishResilientDistributedMaster::notifyAdoptedSubActivitySpawn(
          srcId, dstId);
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > the_root_;
    x10_long srcId;
    x10_long dstId;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->the_root_);
        buf.write(this->srcId);
        buf.write(this->dstId);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientDistributed__closure__48* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientDistributed__closure__48>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > that_the_root_ = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >();
        x10_long that_srcId = buf.read<x10_long>();
        x10_long that_dstId = buf.read<x10_long>();
        x10_lang_FinishState__FinishResilientDistributed__closure__48* this_ = new (storage) x10_lang_FinishState__FinishResilientDistributed__closure__48(that_the_root_, that_srcId, that_dstId);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientDistributed__closure__48(::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > the_root_, x10_long srcId, x10_long dstId) : the_root_(the_root_), srcId(srcId), dstId(dstId) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1680";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__48_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__49_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__49_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__FinishResilientDistributed__closure__49 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributed__closure__49> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::FinishState__FinishResilientDistributedMaster* >(the_root_))->x10::lang::FinishState__FinishResilientDistributedMaster::notifySubActivitySpawn(
          srcId, dstId);
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > the_root_;
    x10_long srcId;
    x10_long dstId;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->the_root_);
        buf.write(this->srcId);
        buf.write(this->dstId);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientDistributed__closure__49* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientDistributed__closure__49>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > that_the_root_ = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >();
        x10_long that_srcId = buf.read<x10_long>();
        x10_long that_dstId = buf.read<x10_long>();
        x10_lang_FinishState__FinishResilientDistributed__closure__49* this_ = new (storage) x10_lang_FinishState__FinishResilientDistributed__closure__49(that_the_root_, that_srcId, that_dstId);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientDistributed__closure__49(::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > the_root_, x10_long srcId, x10_long dstId) : the_root_(the_root_), srcId(srcId), dstId(dstId) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1682";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__49_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__50_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__50_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_lang_FinishState__FinishResilientDistributed__closure__50 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > >::itable<x10_lang_FinishState__FinishResilientDistributed__closure__50> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > __apply(::x10::lang::FinishState__FinishResilientDistributedBackup* bup) {
        
        //#line 1691 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (!(::x10aux::nullCheck(bup)->FMGL(adopted))) {
            
            //#line 1692 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10aux::nullCheck(bup)->x10::lang::FinishState__FinishResilientDistributedBackup::notifySubActivitySpawn(
              srcId, dstId);
        }
        
        //#line 1694 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > alloc__102591 =
           ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >::_alloc();
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        x10_boolean first__102589 = ::x10aux::nullCheck(bup)->FMGL(adopted);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > second__102590 =
          ::x10aux::nullCheck(bup)->FMGL(adoptedRoot);
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        alloc__102591->FMGL(first) = first__102589;
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        alloc__102591->FMGL(second) = second__102590;
        
        //#line 1694 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        return alloc__102591;
        
    }
    
    // captured environment
    x10_long srcId;
    x10_long dstId;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->srcId);
        buf.write(this->dstId);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientDistributed__closure__50* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientDistributed__closure__50>();
        buf.record_reference(storage);
        x10_long that_srcId = buf.read<x10_long>();
        x10_long that_dstId = buf.read<x10_long>();
        x10_lang_FinishState__FinishResilientDistributed__closure__50* this_ = new (storage) x10_lang_FinishState__FinishResilientDistributed__closure__50(that_srcId, that_dstId);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientDistributed__closure__50(x10_long srcId, x10_long dstId) : srcId(srcId), dstId(dstId) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > > >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > > >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1689-1695";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__50_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__51_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__51_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
class x10_lang_FinishState__FinishResilientDistributed__closure__51 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_0<x10_boolean>::itable<x10_lang_FinishState__FinishResilientDistributed__closure__51> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_boolean __apply() {
        return ::x10aux::nullCheck(::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::FinishState__FinishResilientDistributedMaster* >(the_root_))->x10::lang::FinishState__FinishResilientDistributedMaster::notifyAdoptedActivityCreation(
                 srcId, dstId);
        
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > the_root_;
    x10_long srcId;
    x10_long dstId;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->the_root_);
        buf.write(this->srcId);
        buf.write(this->dstId);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientDistributed__closure__51* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientDistributed__closure__51>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > that_the_root_ = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >();
        x10_long that_srcId = buf.read<x10_long>();
        x10_long that_dstId = buf.read<x10_long>();
        x10_lang_FinishState__FinishResilientDistributed__closure__51* this_ = new (storage) x10_lang_FinishState__FinishResilientDistributed__closure__51(that_the_root_, that_srcId, that_dstId);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientDistributed__closure__51(::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > the_root_, x10_long srcId, x10_long dstId) : the_root_(the_root_), srcId(srcId), dstId(dstId) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_boolean> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_boolean> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1721";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__51_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__52_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__52_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
class x10_lang_FinishState__FinishResilientDistributed__closure__52 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_0<x10_boolean>::itable<x10_lang_FinishState__FinishResilientDistributed__closure__52> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_boolean __apply() {
        return ::x10aux::nullCheck(::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::FinishState__FinishResilientDistributedMaster* >(the_root_))->x10::lang::FinishState__FinishResilientDistributedMaster::notifyActivityCreation(
                 srcId, dstId);
        
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > the_root_;
    x10_long srcId;
    x10_long dstId;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->the_root_);
        buf.write(this->srcId);
        buf.write(this->dstId);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientDistributed__closure__52* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientDistributed__closure__52>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > that_the_root_ = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >();
        x10_long that_srcId = buf.read<x10_long>();
        x10_long that_dstId = buf.read<x10_long>();
        x10_lang_FinishState__FinishResilientDistributed__closure__52* this_ = new (storage) x10_lang_FinishState__FinishResilientDistributed__closure__52(that_the_root_, that_srcId, that_dstId);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientDistributed__closure__52(::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > the_root_, x10_long srcId, x10_long dstId) : the_root_(the_root_), srcId(srcId), dstId(dstId) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_boolean> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_boolean> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1723";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__52_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__53_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__53_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_lang_FinishState__FinishResilientDistributed__closure__53 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, ::x10::util::Triple<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >, x10_boolean> >::itable<x10_lang_FinishState__FinishResilientDistributed__closure__53> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::util::Triple<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >, x10_boolean> __apply(::x10::lang::FinishState__FinishResilientDistributedBackup* bup) {
        
        //#line 1732 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        x10_boolean r = false;
        
        //#line 1733 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (!(::x10aux::nullCheck(bup)->FMGL(adopted))) {
            
            //#line 1734 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            r = ::x10aux::nullCheck(bup)->x10::lang::FinishState__FinishResilientDistributedBackup::notifyActivityCreation(
                  srcId, dstId);
        }
        
        //#line 1736 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::util::Triple<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >, x10_boolean> alloc__102594 =
           ::x10::util::Triple<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >, x10_boolean>::_alloc();
        (alloc__102594)->::x10::util::Triple<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >, x10_boolean>::_constructor(
          ::x10aux::nullCheck(bup)->FMGL(adopted), ::x10aux::nullCheck(bup)->FMGL(adoptedRoot),
          r);
        return alloc__102594;
        
    }
    
    // captured environment
    x10_long srcId;
    x10_long dstId;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->srcId);
        buf.write(this->dstId);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientDistributed__closure__53* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientDistributed__closure__53>();
        buf.record_reference(storage);
        x10_long that_srcId = buf.read<x10_long>();
        x10_long that_dstId = buf.read<x10_long>();
        x10_lang_FinishState__FinishResilientDistributed__closure__53* this_ = new (storage) x10_lang_FinishState__FinishResilientDistributed__closure__53(that_srcId, that_dstId);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientDistributed__closure__53(x10_long srcId, x10_long dstId) : srcId(srcId), dstId(dstId) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, ::x10::util::Triple<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >, x10_boolean> > >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, ::x10::util::Triple<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >, x10_boolean> > >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1730-1737";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__53_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__54_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__54_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__FinishResilientDistributed__closure__54 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributed__closure__54> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::FinishState__FinishResilientDistributedMaster* >(the_root_))->x10::lang::FinishState__FinishResilientDistributedMaster::notifyAdoptedActivityTermination(
          dstId);
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > the_root_;
    x10_long dstId;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->the_root_);
        buf.write(this->dstId);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientDistributed__closure__54* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientDistributed__closure__54>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > that_the_root_ = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >();
        x10_long that_dstId = buf.read<x10_long>();
        x10_lang_FinishState__FinishResilientDistributed__closure__54* this_ = new (storage) x10_lang_FinishState__FinishResilientDistributed__closure__54(that_the_root_, that_dstId);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientDistributed__closure__54(::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > the_root_, x10_long dstId) : the_root_(the_root_), dstId(dstId) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1765";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__54_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__55_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__55_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__FinishResilientDistributed__closure__55 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributed__closure__55> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::FinishState__FinishResilientDistributedMaster* >(the_root_))->x10::lang::FinishState__FinishResilientDistributedMaster::notifyActivityTermination(
          dstId);
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > the_root_;
    x10_long dstId;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->the_root_);
        buf.write(this->dstId);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientDistributed__closure__55* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientDistributed__closure__55>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > that_the_root_ = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >();
        x10_long that_dstId = buf.read<x10_long>();
        x10_lang_FinishState__FinishResilientDistributed__closure__55* this_ = new (storage) x10_lang_FinishState__FinishResilientDistributed__closure__55(that_the_root_, that_dstId);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientDistributed__closure__55(::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > the_root_, x10_long dstId) : the_root_(the_root_), dstId(dstId) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1767";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__55_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__56_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__56_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_lang_FinishState__FinishResilientDistributed__closure__56 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > >::itable<x10_lang_FinishState__FinishResilientDistributed__closure__56> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > __apply(::x10::lang::FinishState__FinishResilientDistributedBackup* bup) {
        
        //#line 1778 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (!(::x10aux::nullCheck(bup)->FMGL(adopted))) {
            
            //#line 1779 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10aux::nullCheck(bup)->x10::lang::FinishState__FinishResilientDistributedBackup::notifyActivityTermination(
              dstId);
        }
        
        //#line 1781 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > alloc__102600 =
           ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >::_alloc();
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        x10_boolean first__102598 = ::x10aux::nullCheck(bup)->FMGL(adopted);
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > second__102599 =
          ::x10aux::nullCheck(bup)->FMGL(adoptedRoot);
        
        //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        alloc__102600->FMGL(first) = first__102598;
        
        //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
        alloc__102600->FMGL(second) = second__102599;
        
        //#line 1781 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        return alloc__102600;
        
    }
    
    // captured environment
    x10_long dstId;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->dstId);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientDistributed__closure__56* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientDistributed__closure__56>();
        buf.record_reference(storage);
        x10_long that_dstId = buf.read<x10_long>();
        x10_lang_FinishState__FinishResilientDistributed__closure__56* this_ = new (storage) x10_lang_FinishState__FinishResilientDistributed__closure__56(that_dstId);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientDistributed__closure__56(x10_long dstId) : dstId(dstId) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > > >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > > >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1776-1782";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__56_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__57_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__57_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__FinishResilientDistributed__closure__57 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributed__closure__57> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::FinishState__FinishResilientDistributedMaster* >(saved_this->FMGL(root)))->x10::lang::FinishState__FinishResilientDistributedMaster::pushException(
          t);
    }
    
    // captured environment
    ::x10::lang::FinishState__FinishResilientDistributed* saved_this;
    ::x10::lang::Exception* t;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->t);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientDistributed__closure__57* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientDistributed__closure__57>();
        buf.record_reference(storage);
        ::x10::lang::FinishState__FinishResilientDistributed* that_saved_this = buf.read< ::x10::lang::FinishState__FinishResilientDistributed*>();
        ::x10::lang::Exception* that_t = buf.read< ::x10::lang::Exception*>();
        x10_lang_FinishState__FinishResilientDistributed__closure__57* this_ = new (storage) x10_lang_FinishState__FinishResilientDistributed__closure__57(that_saved_this, that_t);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientDistributed__closure__57(::x10::lang::FinishState__FinishResilientDistributed* saved_this, ::x10::lang::Exception* t) : saved_this(saved_this), t(t) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1803";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__57_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__59_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__59_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__FinishResilientDistributed__closure__59 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributed__closure__59> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 1847 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (tmp_finish->x10::lang::FinishState__FinishResilientDistributed::notifyActivityCreation(
              home)) {
            
            //#line 1848 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            try {
                
                //#line 1849 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                try {
                    
                    //#line 1850 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    ::x10::lang::VoidFun_0_0::__apply(::x10aux::nullCheck(body));
                }
                catch (::x10::lang::CheckedThrowable* __exc1134) {
                    if (::x10aux::instanceof< ::x10::lang::Runtime__AtCheckedWrapper*>(__exc1134)) {
                        ::x10::lang::Runtime__AtCheckedWrapper* e =
                          static_cast< ::x10::lang::Runtime__AtCheckedWrapper*>(__exc1134);
                        {
                            
                            //#line 1852 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                            ::x10aux::throwException(::x10aux::nullCheck(::x10aux::nullCheck(e)->x10::lang::Runtime__AtCheckedWrapper::getCheckedCause()));
                        }
                    } else
                    throw;
                }
            }
            catch (::x10::lang::CheckedThrowable* __exc1135) {
                if (true) {
                    ::x10::lang::CheckedThrowable* t = static_cast< ::x10::lang::CheckedThrowable*>(__exc1135);
                    {
                        
                        //#line 1855 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                        ::x10::lang::Exception* e = ::x10::lang::Exception::ensureException(
                                                      t);
                        
                        //#line 1856 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                        tmp_finish->x10::lang::FinishState__FinishResilientDistributed::pushException(
                          e);
                    }
                } else
                throw;
            }
            
            //#line 1858 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            tmp_finish->x10::lang::FinishState__FinishResilientDistributed::notifyActivityTermination();
        }
        
    }
    
    // captured environment
    ::x10::lang::FinishState__FinishResilientDistributed* tmp_finish;
    ::x10::lang::Place home;
    ::x10::lang::VoidFun_0_0* body;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->tmp_finish);
        buf.write(this->home);
        buf.write(this->body);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientDistributed__closure__59* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientDistributed__closure__59>();
        buf.record_reference(storage);
        ::x10::lang::FinishState__FinishResilientDistributed* that_tmp_finish = buf.read< ::x10::lang::FinishState__FinishResilientDistributed*>();
        ::x10::lang::Place that_home = buf.read< ::x10::lang::Place>();
        ::x10::lang::VoidFun_0_0* that_body = buf.read< ::x10::lang::VoidFun_0_0*>();
        x10_lang_FinishState__FinishResilientDistributed__closure__59* this_ = new (storage) x10_lang_FinishState__FinishResilientDistributed__closure__59(that_tmp_finish, that_home, that_body);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientDistributed__closure__59(::x10::lang::FinishState__FinishResilientDistributed* tmp_finish, ::x10::lang::Place home, ::x10::lang::VoidFun_0_0* body) : tmp_finish(tmp_finish), home(home), body(body) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1846-1860";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__59_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__58_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__58_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__FinishResilientDistributed__closure__58 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributed__closure__58> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 1861 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::Runtime::execute((__extension__ ({
                                          ::x10::lang::Activity* alloc__92680 =
                                             (new (::x10aux::alloc_z< ::x10::lang::Activity>()) ::x10::lang::Activity());
                                          (alloc__92680)->::x10::lang::Activity::_constructor(
                                            reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__FinishResilientDistributed__closure__59)))x10_lang_FinishState__FinishResilientDistributed__closure__59(tmp_finish, home, body))),
                                            home, reinterpret_cast< ::x10::lang::FinishState*>(real_finish),
                                            false, false);
                                          alloc__92680;
                                      }))
                                      );
    }
    
    // captured environment
    ::x10::lang::FinishState__FinishResilientDistributed* tmp_finish;
    ::x10::lang::Place home;
    ::x10::lang::VoidFun_0_0* body;
    ::x10::lang::FinishState__FinishResilientDistributed* real_finish;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->tmp_finish);
        buf.write(this->home);
        buf.write(this->body);
        buf.write(this->real_finish);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientDistributed__closure__58* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientDistributed__closure__58>();
        buf.record_reference(storage);
        ::x10::lang::FinishState__FinishResilientDistributed* that_tmp_finish = buf.read< ::x10::lang::FinishState__FinishResilientDistributed*>();
        ::x10::lang::Place that_home = buf.read< ::x10::lang::Place>();
        ::x10::lang::VoidFun_0_0* that_body = buf.read< ::x10::lang::VoidFun_0_0*>();
        ::x10::lang::FinishState__FinishResilientDistributed* that_real_finish = buf.read< ::x10::lang::FinishState__FinishResilientDistributed*>();
        x10_lang_FinishState__FinishResilientDistributed__closure__58* this_ = new (storage) x10_lang_FinishState__FinishResilientDistributed__closure__58(that_tmp_finish, that_home, that_body, that_real_finish);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientDistributed__closure__58(::x10::lang::FinishState__FinishResilientDistributed* tmp_finish, ::x10::lang::Place home, ::x10::lang::VoidFun_0_0* body, ::x10::lang::FinishState__FinishResilientDistributed* real_finish) : tmp_finish(tmp_finish), home(home), body(body), real_finish(real_finish) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1845-1862";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__58_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__61_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__61_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__FinishResilientDistributed__closure__61 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributed__closure__61> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 1894 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::lang::Cell< ::x10::lang::Any*>* this__102606 = (me2)->__apply();
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
            ::x10::lang::Any* x__102607 = r;
            this__102606->FMGL(value) = x__102607;
        }
        catch (::x10::lang::CheckedThrowable* __exc1138) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc1138);
                {
                    x10_int __lowerer__var__1__ = ::x10aux::class_cast_unchecked<x10_int>(::x10::lang::Runtime::wrapAtChecked< x10_int >(
                                                                                            __lowerer__var__0__));
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* > me2;
    ::x10::lang::Any* r;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->me2);
        buf.write(this->r);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientDistributed__closure__61* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientDistributed__closure__61>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* > that_me2 = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* > >();
        ::x10::lang::Any* that_r = buf.read< ::x10::lang::Any*>();
        x10_lang_FinishState__FinishResilientDistributed__closure__61* this_ = new (storage) x10_lang_FinishState__FinishResilientDistributed__closure__61(that_me2, that_r);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientDistributed__closure__61(::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* > me2, ::x10::lang::Any* r) : me2(me2), r(r) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1893-1895";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__61_CLOSURE
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__60_CLOSURE
#define X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__60_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_FinishState__FinishResilientDistributed__closure__60 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributed__closure__60> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 1892 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::lang::Any* r = ::x10::lang::Fun_0_0< ::x10::lang::Any*>::__apply(::x10aux::nullCheck(body));
            {
                
                //#line 1893 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                ::x10::lang::Runtime::runAt(::x10::lang::Place::place(((x10_long)((me2)->location))),
                                            reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__FinishResilientDistributed__closure__61)))x10_lang_FinishState__FinishResilientDistributed__closure__61(me2, r))),
                                            ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            }
        }
        catch (::x10::lang::CheckedThrowable* __exc1139) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1139);
                {
                    x10_int __lowerer__var__1__ = ::x10aux::class_cast_unchecked<x10_int>(::x10::lang::Runtime::wrapAtChecked< x10_int >(
                                                                                            __lowerer__var__0__));
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::Fun_0_0< ::x10::lang::Any*>* body;
    ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* > me2;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->body);
        buf.write(this->me2);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_FinishState__FinishResilientDistributed__closure__60* storage = ::x10aux::alloc_z<x10_lang_FinishState__FinishResilientDistributed__closure__60>();
        buf.record_reference(storage);
        ::x10::lang::Fun_0_0< ::x10::lang::Any*>* that_body = buf.read< ::x10::lang::Fun_0_0< ::x10::lang::Any*>*>();
        ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* > that_me2 = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* > >();
        x10_lang_FinishState__FinishResilientDistributed__closure__60* this_ = new (storage) x10_lang_FinishState__FinishResilientDistributed__closure__60(that_body, that_me2);
        return this_;
    }
    
    x10_lang_FinishState__FinishResilientDistributed__closure__60(::x10::lang::Fun_0_0< ::x10::lang::Any*>* body, ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* > me2) : body(body), me2(me2) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10:1891-1896";
    }

};

#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTDISTRIBUTED__CLOSURE__60_CLOSURE

//#line 1652 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"

//#line 1654 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >
  x10::lang::FinishState__FinishResilientDistributed::parentFinish(
  ) {
    
    //#line 1655 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Activity* a = ::x10::lang::Runtime::activity();
    
    //#line 1656 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(a, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        return ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >(::x10aux::class_cast_unchecked< ::x10::lang::FinishState__FinishResilientDistributedMaster*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
    }
    
    //#line 1657 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState* par = ::x10aux::nullCheck(a)->finishState();
    
    //#line 1658 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (::x10aux::instanceof< ::x10::lang::FinishState__FinishResilientDistributed*>(par))
    {
        return ::x10aux::nullCheck((::x10aux::class_cast< ::x10::lang::FinishState__FinishResilientDistributed*>(par)))->FMGL(root);
        
    }
    
    //#line 1659 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    return ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >(::x10aux::class_cast_unchecked< ::x10::lang::FinishState__FinishResilientDistributedMaster*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
}

//#line 1662 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributed::_constructor(
  ::x10::util::concurrent::SimpleLatch* latch) {
    ::x10::lang::FinishState* this__102587 = this;
    
    //#line 1650 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__FinishResilientDistributed* this__102586 =
      this;
    
    //#line 1664 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__FinishResilientDistributedMaster* the_root =
      ::x10::lang::FinishState__FinishResilientDistributedMaster::make(
        ::x10::lang::FinishState__FinishResilientDistributed::parentFinish(),
        latch);
    
    //#line 1666 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    this->FMGL(root) = ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >(the_root);
}
::x10::lang::FinishState__FinishResilientDistributed* x10::lang::FinishState__FinishResilientDistributed::_make(
  ::x10::util::concurrent::SimpleLatch* latch) {
    ::x10::lang::FinishState__FinishResilientDistributed* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishResilientDistributed>()) ::x10::lang::FinishState__FinishResilientDistributed();
    this_->_constructor(latch);
    return this_;
}



//#line 1669 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributed::notifySubActivitySpawn(
  ::x10::lang::Place place) {
    
    //#line 1670 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    x10_long srcId = ::x10::lang::Place::_make(::x10aux::here)->FMGL(id);
    
    //#line 1671 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    x10_long dstId = place->FMGL(id);
    
    //#line 1673 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    x10_boolean success = false;
    
    //#line 1674 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > the_root =
      this->FMGL(root);
    
    //#line 1675 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    x10_boolean adopted = false;
    
    //#line 1676 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    while (true) {
        
        //#line 1677 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > the_root_ =
          the_root;
        
        //#line 1679 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (adopted) {
            
            //#line 1680 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            success = ::x10::lang::FinishState::lowLevelAt(
                        ::x10::lang::Place::place((the_root_)->location),
                        reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__FinishResilientDistributed__closure__48)))x10_lang_FinishState__FinishResilientDistributed__closure__48(the_root_, srcId, dstId))));
        } else {
            
            //#line 1682 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            success = ::x10::lang::FinishState::lowLevelAt(
                        ::x10::lang::Place::place((the_root_)->location),
                        reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__FinishResilientDistributed__closure__49)))x10_lang_FinishState__FinishResilientDistributed__closure__49(the_root_, srcId, dstId))));
        }
        
        //#line 1685 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (success) {
            break;
        }
        
        //#line 1688 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::Cell< ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > >* cell =
           (new (::x10aux::alloc_z< ::x10::lang::Cell< ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > > >()) ::x10::lang::Cell< ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > >());
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > x__102592 =
          (__extension__ ({
            
            //#line 1688 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > alloc__102593 =
               ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >::_alloc();
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > second__102588 =
              the_root_;
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            alloc__102593->FMGL(first) = false;
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            alloc__102593->FMGL(second) = second__102588;
            alloc__102593;
        }))
        ;
        cell->FMGL(value) = x__102592;
        
        //#line 1689 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        success = ::x10::lang::FinishState__FinishResilientDistributedBackup::backupLowLevelFetch< ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > >(
                    the_root_, reinterpret_cast< ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > >*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > > >(sizeof(x10_lang_FinishState__FinishResilientDistributed__closure__50)))x10_lang_FinishState__FinishResilientDistributed__closure__50(srcId, dstId))),
                    cell);
        
        //#line 1697 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (!(success)) {
            
            //#line 1698 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__124933 = ::x10aux::makeStringLit("Fatal Error: master and backup dead, in notifySubActivitySpawn()"); strLit__124933; }))))->c_str());
            
            //#line 1699 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            break;
        }
        
        //#line 1702 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (!(cell->FMGL(value)->FMGL(first))) {
            break;
        }
        
        //#line 1704 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        adopted = true;
        
        //#line 1705 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        the_root = cell->FMGL(value)->FMGL(second);
    }
    
}

//#line 1709 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
x10_boolean x10::lang::FinishState__FinishResilientDistributed::notifyActivityCreation(
  ::x10::lang::Place srcPlace) {
    
    //#line 1710 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    x10_long srcId = srcPlace->FMGL(id);
    
    //#line 1711 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    x10_long dstId = ::x10::lang::Place::_make(::x10aux::here)->FMGL(id);
    
    //#line 1713 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    x10_boolean success = false;
    
    //#line 1714 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > the_root =
      this->FMGL(root);
    
    //#line 1715 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    x10_boolean adopted = false;
    
    //#line 1716 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    while (true) {
        
        //#line 1717 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > the_root_ =
          the_root;
        
        //#line 1719 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::Cell<x10_boolean>* simple_cell =  (new (::x10aux::alloc_z< ::x10::lang::Cell<x10_boolean> >()) ::x10::lang::Cell<x10_boolean>());
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        simple_cell->FMGL(value) = false;
        
        //#line 1720 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (adopted) {
            
            //#line 1721 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            success = ::x10::lang::FinishState::lowLevelFetch< x10_boolean >(
                        ::x10::lang::Place::place((the_root_)->location),
                        reinterpret_cast< ::x10::lang::Fun_0_0<x10_boolean>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0<x10_boolean> >(sizeof(x10_lang_FinishState__FinishResilientDistributed__closure__51)))x10_lang_FinishState__FinishResilientDistributed__closure__51(the_root_, srcId, dstId))),
                        simple_cell);
        } else {
            
            //#line 1723 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            success = ::x10::lang::FinishState::lowLevelFetch< x10_boolean >(
                        ::x10::lang::Place::place((the_root_)->location),
                        reinterpret_cast< ::x10::lang::Fun_0_0<x10_boolean>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0<x10_boolean> >(sizeof(x10_lang_FinishState__FinishResilientDistributed__closure__52)))x10_lang_FinishState__FinishResilientDistributed__closure__52(the_root_, srcId, dstId))),
                        simple_cell);
        }
        
        //#line 1726 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (success) {
            return simple_cell->FMGL(value);
            
        }
        
        //#line 1729 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::Cell< ::x10::util::Triple<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >, x10_boolean> >* cell =
           (new (::x10aux::alloc_z< ::x10::lang::Cell< ::x10::util::Triple<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >, x10_boolean> > >()) ::x10::lang::Cell< ::x10::util::Triple<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >, x10_boolean> >());
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        ::x10::util::Triple<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >, x10_boolean> x__102595 =
          (__extension__ ({
            
            //#line 1729 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::util::Triple<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >, x10_boolean> alloc__102596 =
               ::x10::util::Triple<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >, x10_boolean>::_alloc();
            (alloc__102596)->::x10::util::Triple<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >, x10_boolean>::_constructor(
              false, the_root_, false);
            alloc__102596;
        }))
        ;
        cell->FMGL(value) = x__102595;
        
        //#line 1730 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        success = ::x10::lang::FinishState__FinishResilientDistributedBackup::backupLowLevelFetch< ::x10::util::Triple<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >, x10_boolean> >(
                    the_root_, reinterpret_cast< ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, ::x10::util::Triple<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >, x10_boolean> >*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, ::x10::util::Triple<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >, x10_boolean> > >(sizeof(x10_lang_FinishState__FinishResilientDistributed__closure__53)))x10_lang_FinishState__FinishResilientDistributed__closure__53(srcId, dstId))),
                    cell);
        
        //#line 1739 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (!(success)) {
            
            //#line 1740 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__124936 = ::x10aux::makeStringLit("Fatal Error: master and backup dead, in notifyActivityCreation()"); strLit__124936; }))))->c_str());
            
            //#line 1741 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            break;
        }
        
        //#line 1744 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (!(cell->FMGL(value)->FMGL(first))) {
            return cell->FMGL(value)->FMGL(third);
            
        }
        
        //#line 1746 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        adopted = true;
        
        //#line 1747 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        the_root = cell->FMGL(value)->FMGL(second);
    }
    
    //#line 1751 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    #ifndef NO_ASSERTIONS
    if (::x10aux::x10__assertions_enabled)
        ::x10aux::x10__assert(false);
    #endif//NO_ASSERTIONS
    
    //#line 1752 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    return true;
    
}

//#line 1755 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributed::notifyActivityTermination(
  ) {
    
    //#line 1756 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    x10_long dstId = ::x10::lang::Place::_make(::x10aux::here)->FMGL(id);
    
    //#line 1758 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    x10_boolean success = false;
    
    //#line 1759 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > the_root =
      this->FMGL(root);
    
    //#line 1760 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    x10_boolean adopted = false;
    
    //#line 1761 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    while (true) {
        
        //#line 1762 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > the_root_ =
          the_root;
        
        //#line 1764 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (adopted) {
            
            //#line 1765 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            success = ::x10::lang::FinishState::lowLevelAt(
                        ::x10::lang::Place::place((the_root_)->location),
                        reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__FinishResilientDistributed__closure__54)))x10_lang_FinishState__FinishResilientDistributed__closure__54(the_root_, dstId))));
        } else {
            
            //#line 1767 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            success = ::x10::lang::FinishState::lowLevelAt(
                        ::x10::lang::Place::place((the_root_)->location),
                        reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__FinishResilientDistributed__closure__55)))x10_lang_FinishState__FinishResilientDistributed__closure__55(the_root_, dstId))));
        }
        
        //#line 1770 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (success) {
            break;
        }
        
        //#line 1772 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
        {
            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(the_root, (__extension__ ({ static ::x10::lang::String* strLit__124939 = ::x10aux::makeStringLit(" master dead, looking for backup"); strLit__124939; })))))->c_str());
        }
        
        //#line 1775 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::Cell< ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > >* cell =
           (new (::x10aux::alloc_z< ::x10::lang::Cell< ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > > >()) ::x10::lang::Cell< ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > >());
        
        //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
        ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > x__102601 =
          (__extension__ ({
            
            //#line 1775 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > alloc__102602 =
               ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >::_alloc();
            
            //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > second__102597 =
              the_root_;
            
            //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            alloc__102602->FMGL(first) = false;
            
            //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
            alloc__102602->FMGL(second) = second__102597;
            alloc__102602;
        }))
        ;
        cell->FMGL(value) = x__102601;
        
        //#line 1776 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        success = ::x10::lang::FinishState__FinishResilientDistributedBackup::backupLowLevelFetch< ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > >(
                    the_root_, reinterpret_cast< ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > >*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > > >(sizeof(x10_lang_FinishState__FinishResilientDistributed__closure__56)))x10_lang_FinishState__FinishResilientDistributed__closure__56(dstId))),
                    cell);
        
        //#line 1784 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (!(success)) {
            
            //#line 1785 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__124940 = ::x10aux::makeStringLit("Fatal Error: master and backup dead, in notifyActivityTermination()"); strLit__124940; }))))->c_str());
            
            //#line 1786 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            break;
        }
        
        //#line 1789 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (!(cell->FMGL(value)->FMGL(first))) {
            
            //#line 1790 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
            {
                ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(the_root, (__extension__ ({ static ::x10::lang::String* strLit__124941 = ::x10aux::makeStringLit(" found backup, updated it"); strLit__124941; })))))->c_str());
            }
            
            //#line 1791 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
            break;
        }
        
        //#line 1794 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
        {
            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(the_root, (__extension__ ({ static ::x10::lang::String* strLit__124942 = ::x10aux::makeStringLit(" found backup, using forwarding pointer: "); strLit__124942; }))), cell->FMGL(value)->FMGL(second))))->c_str());
        }
        
        //#line 1796 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        adopted = true;
        
        //#line 1797 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        the_root = cell->FMGL(value)->FMGL(second);
    }
    
}

//#line 1802 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributed::pushException(
  ::x10::lang::Exception* t) {
    
    //#line 1803 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    x10_boolean success = ::x10::lang::FinishState::lowLevelAt(
                            ::x10::lang::Place::place((this->FMGL(root))->location),
                            reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__FinishResilientDistributed__closure__57)))x10_lang_FinishState__FinishResilientDistributed__closure__57(this, t))));
    
    //#line 1804 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (!(success)) {
     
    }
    
}

//#line 1809 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributed::waitForFinish(
  ) {
    
    //#line 1810 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__FinishResilientDistributedMaster* the_root =
      ::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::FinishState__FinishResilientDistributedMaster* >(this->FMGL(root));
    
    //#line 1811 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (::x10::lang::FinishState::FMGL(VERBOSE__get)()) {
        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124943 = ::x10aux::makeStringLit("("); strLit__124943; })), ::x10aux::nullCheck(the_root)->FMGL(name)), (__extension__ ({ static ::x10::lang::String* strLit__124944 = ::x10aux::makeStringLit(").waitForFinish()"); strLit__124944; })))))->c_str());
    }
    
    //#line 1812 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(the_root)->x10::lang::FinishState__FinishResilientDistributedMaster::notifyActivityTermination(
      ::x10::lang::Place::_make(::x10aux::here)->FMGL(id));
    
    //#line 1814 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10aux::nullCheck(::x10aux::nullCheck(the_root)->FMGL(latch))->await();
    {
        
        //#line 1815 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::CheckedThrowable* throwable__102657 =
          ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        try {
            {
                ::x10::lang::Runtime::enterAtomic();
                {
                    
                    //#line 1816 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    ::x10::lang::FinishState__FinishResilientDistributedMaster::FMGL(ALL__get)()->remove(
                      the_root);
                }
            }
            ::x10::compiler::Finalization::plausibleThrow();
        }
        catch (::x10::lang::CheckedThrowable* __exc1131) {
            if (true) {
                ::x10::lang::CheckedThrowable* formal__102658 =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1131);
                {
                    throwable__102657 = formal__102658;
                }
            } else
            throw;
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__102657)))
        {
            if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__102657))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__102657));
            }
            
        }
        if (true) {
            ::x10::lang::Runtime::exitAtomic();
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__102657)))
        {
            if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__102657)))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__102657));
            }
            
        }
        
    }
    
    //#line 1818 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((!::x10aux::struct_equals(::x10aux::nullCheck(the_root)->FMGL(multipleExceptions),
                                  reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        
        //#line 1819 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
        {
            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124949 = ::x10aux::makeStringLit("("); strLit__124949; })), ::x10aux::nullCheck(the_root)->FMGL(name)), (__extension__ ({ static ::x10::lang::String* strLit__124950 = ::x10aux::makeStringLit(").waitForFinish() done waiting (throwing exceptions)"); strLit__124950; })))))->c_str());
        }
        
        //#line 1820 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::MultipleExceptions::make(
                                                       ::x10aux::nullCheck(the_root)->FMGL(multipleExceptions))));
    }
    
    //#line 1822 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if (::x10::lang::FinishState::FMGL(VERBOSE__get)()) {
        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124951 = ::x10aux::makeStringLit("("); strLit__124951; })), ::x10aux::nullCheck(the_root)->FMGL(name)), (__extension__ ({ static ::x10::lang::String* strLit__124952 = ::x10aux::makeStringLit(").waitForFinish() done waiting"); strLit__124952; })))))->c_str());
    }
    
}

//#line 1825 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::util::concurrent::SimpleLatch* x10::lang::FinishState__FinishResilientDistributed::simpleLatch(
  ) {
    return ::x10aux::nullCheck((this->FMGL(root))->__apply())->FMGL(latch);
    
}

//#line 1827 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
void x10::lang::FinishState__FinishResilientDistributed::runAt(
  ::x10::lang::Place place, ::x10::lang::VoidFun_0_0* body,
  ::x10::lang::Runtime__Profile* prof) {
    
    //#line 1828 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Runtime::ensureNotInAtomic();
    
    //#line 1829 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(place->FMGL(id), ((x10_long)::x10aux::here))))
    {
        
        //#line 1831 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::Runtime::runAtNonResilient(place, body,
                                                prof);
        
        //#line 1832 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        return;
    }
    
    //#line 1835 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__FinishResilientDistributed* real_finish =
      this;
    
    //#line 1837 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::FinishState__FinishResilientDistributed* tmp_finish =
       (new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishResilientDistributed>()) ::x10::lang::FinishState__FinishResilientDistributed());
    (tmp_finish)->::x10::lang::FinishState__FinishResilientDistributed::_constructor(
      ::x10::util::concurrent::SimpleLatch::_make());
    
    //#line 1840 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Place home = ::x10::lang::Place::_make(::x10aux::here);
    
    //#line 1841 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    tmp_finish->x10::lang::FinishState__FinishResilientDistributed::notifySubActivitySpawn(
      place);
    
    //#line 1845 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::VoidFun_0_0* cl = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__FinishResilientDistributed__closure__58)))x10_lang_FinishState__FinishResilientDistributed__closure__58(tmp_finish, home, body, real_finish)));
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    x10_long id__102603 = place->FMGL(id);
    ::x10::lang::VoidFun_0_0* msgBody__102604 = cl;
    ::x10::lang::Runtime__Profile* prof__102605 = prof;
    
    //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::run_closure_at((x10_int)id__102603, msgBody__102604, prof__102605, ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 1865 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    try {
        
        //#line 1866 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
        {
            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__124954 = ::x10aux::makeStringLit("Entering resilient at waitForFinish"); strLit__124954; }))))->c_str());
        }
        
        //#line 1867 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        tmp_finish->x10::lang::FinishState__FinishResilientDistributed::waitForFinish();
        
        //#line 1868 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
        {
            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__124955 = ::x10aux::makeStringLit("Exiting resilient at waitForFinish"); strLit__124955; }))))->c_str());
        }
        
    }
    catch (::x10::lang::CheckedThrowable* __exc1136) {
        if (::x10aux::instanceof< ::x10::lang::MultipleExceptions*>(__exc1136)) {
            ::x10::lang::MultipleExceptions* e = static_cast< ::x10::lang::MultipleExceptions*>(__exc1136);
            {
                
                //#line 1870 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                #ifndef NO_ASSERTIONS
                if (::x10aux::x10__assertions_enabled)
                    ::x10aux::x10__assert((::x10aux::struct_equals((x10_long)(::x10aux::nullCheck(::x10aux::nullCheck(e)->FMGL(exceptions))->FMGL(size)),
                                                                   ((x10_long)1ll))),
                        ::x10aux::nullCheck(e)->x10::lang::MultipleExceptions::exceptions());
                #endif//NO_ASSERTIONS
                
                //#line 1871 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                ::x10::lang::Exception* e2 = ::x10aux::nullCheck(::x10aux::nullCheck(e)->FMGL(exceptions))->x10::lang::Rail< ::x10::lang::Exception* >::__apply(
                                               ((x10_long)0ll));
                
                //#line 1872 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
                {
                    ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124957 = ::x10aux::makeStringLit("Received from resilient at: "); strLit__124957; })), e2)))->c_str());
                }
                
                //#line 1873 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                if (::x10aux::instanceof< ::x10::lang::WrappedThrowable*>(e2))
                {
                    
                    //#line 1874 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    ::x10aux::throwException(::x10aux::nullCheck(reinterpret_cast< ::x10::lang::CheckedThrowable*>(::x10aux::nullCheck(e2)->x10::lang::Exception::getCause())));
                } else {
                    
                    //#line 1876 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    ::x10aux::throwException(::x10aux::nullCheck(e2));
                }
                
            }
        } else
        throw;
    }
}

//#line 1881 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::Any* x10::lang::FinishState__FinishResilientDistributed::evalAt(
  ::x10::lang::Place place, ::x10::lang::Fun_0_0< ::x10::lang::Any*>* body,
  ::x10::lang::Runtime__Profile* prof) {
    
    //#line 1882 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Runtime::ensureNotInAtomic();
    
    //#line 1883 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(place->FMGL(id), ((x10_long)::x10aux::here))))
    {
        
        //#line 1885 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        return ::x10::lang::Runtime::evalAtNonResilient(place,
                                                        body,
                                                        prof);
        
    }
    
    //#line 1888 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Empty* dummy_data =  (new (::x10aux::alloc_z< ::x10::lang::Empty>()) ::x10::lang::Empty());
    
    //#line 1889 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::Cell< ::x10::lang::Any*> _StackAllocate_me;
      ;
    ::x10::lang::Cell< ::x10::lang::Any*>* me(&_StackAllocate_me);
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    ::x10::lang::Any* x__102609 = reinterpret_cast< ::x10::lang::Any*>(dummy_data);
    me->FMGL(value) = x__102609;
    
    //#line 1890 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* > me2 =
      ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Any*>* >(me);
    {
        
        //#line 1891 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::lang::Runtime::runAt(place, reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_FinishState__FinishResilientDistributed__closure__60)))x10_lang_FinishState__FinishResilientDistributed__closure__60(body, me2))),
                                    prof);
    }
    
    //#line 1898 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    if ((::x10aux::struct_equals(me->FMGL(value), dummy_data)))
    {
        
        //#line 1899 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
        {
            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__124964 = ::x10aux::makeStringLit("evalAt returns no result, target place may died"); strLit__124964; }))))->c_str());
        }
        
        //#line 1900 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        if (x10rt_is_place_dead((x10_int)place->FMGL(id)))
        {
            ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::DeadPlaceException::_make(place)));
        } else {
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
            ::x10::lang::Any* x__102608 = ::x10aux::class_cast_unchecked< ::x10::lang::Any*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            me->FMGL(value) = (reinterpret_cast< ::x10::lang::Any*>(reinterpret_cast< ::x10::lang::Any*>(X10_NULL)));
        }
        
    }
    
    //#line 1904 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
    return me->FMGL(value);
    
}

//#line 1650 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
::x10::lang::FinishState__FinishResilientDistributed* x10::lang::FinishState__FinishResilientDistributed::x10__lang__FinishState__FinishResilientDistributed____this__x10__lang__FinishState__FinishResilientDistributed(
  ) {
    return this;
    
}
void x10::lang::FinishState__FinishResilientDistributed::__fieldInitializers_x10_lang_FinishState_FinishResilientDistributed(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::FinishState__FinishResilientDistributed::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::FinishState__FinishResilientDistributed::_deserializer);

void x10::lang::FinishState__FinishResilientDistributed::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::FinishState::_serialize_body(buf);
    buf.write(this->FMGL(root));
    
}

::x10::lang::Reference* ::x10::lang::FinishState__FinishResilientDistributed::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState__FinishResilientDistributed* this_ = new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishResilientDistributed>()) ::x10::lang::FinishState__FinishResilientDistributed();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::FinishState__FinishResilientDistributed::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::FinishState::_deserialize_body(buf);
    FMGL(root) = buf.read< ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > >();
}

::x10aux::RuntimeType x10::lang::FinishState__FinishResilientDistributed::rtt;
void x10::lang::FinishState__FinishResilientDistributed::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::FinishState>()};
    rtt.initStageTwo("x10.lang.FinishState.FinishResilientDistributed",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributed__closure__48>x10_lang_FinishState__FinishResilientDistributed__closure__48::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientDistributed__closure__48::__apply, &x10_lang_FinishState__FinishResilientDistributed__closure__48::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientDistributed__closure__48::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__FinishResilientDistributed__closure__48::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributed__closure__48::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientDistributed__closure__48::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributed__closure__49>x10_lang_FinishState__FinishResilientDistributed__closure__49::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientDistributed__closure__49::__apply, &x10_lang_FinishState__FinishResilientDistributed__closure__49::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientDistributed__closure__49::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__FinishResilientDistributed__closure__49::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributed__closure__49::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientDistributed__closure__49::_deserialize);

::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > >::itable<x10_lang_FinishState__FinishResilientDistributed__closure__50>x10_lang_FinishState__FinishResilientDistributed__closure__50::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientDistributed__closure__50::__apply, &x10_lang_FinishState__FinishResilientDistributed__closure__50::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientDistributed__closure__50::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > > >, &x10_lang_FinishState__FinishResilientDistributed__closure__50::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributed__closure__50::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientDistributed__closure__50::_deserialize);

::x10::lang::Fun_0_0<x10_boolean>::itable<x10_lang_FinishState__FinishResilientDistributed__closure__51>x10_lang_FinishState__FinishResilientDistributed__closure__51::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientDistributed__closure__51::__apply, &x10_lang_FinishState__FinishResilientDistributed__closure__51::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientDistributed__closure__51::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_boolean> >, &x10_lang_FinishState__FinishResilientDistributed__closure__51::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributed__closure__51::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientDistributed__closure__51::_deserialize);

::x10::lang::Fun_0_0<x10_boolean>::itable<x10_lang_FinishState__FinishResilientDistributed__closure__52>x10_lang_FinishState__FinishResilientDistributed__closure__52::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientDistributed__closure__52::__apply, &x10_lang_FinishState__FinishResilientDistributed__closure__52::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientDistributed__closure__52::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_boolean> >, &x10_lang_FinishState__FinishResilientDistributed__closure__52::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributed__closure__52::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientDistributed__closure__52::_deserialize);

::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, ::x10::util::Triple<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >, x10_boolean> >::itable<x10_lang_FinishState__FinishResilientDistributed__closure__53>x10_lang_FinishState__FinishResilientDistributed__closure__53::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientDistributed__closure__53::__apply, &x10_lang_FinishState__FinishResilientDistributed__closure__53::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientDistributed__closure__53::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, ::x10::util::Triple<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* >, x10_boolean> > >, &x10_lang_FinishState__FinishResilientDistributed__closure__53::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributed__closure__53::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientDistributed__closure__53::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributed__closure__54>x10_lang_FinishState__FinishResilientDistributed__closure__54::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientDistributed__closure__54::__apply, &x10_lang_FinishState__FinishResilientDistributed__closure__54::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientDistributed__closure__54::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__FinishResilientDistributed__closure__54::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributed__closure__54::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientDistributed__closure__54::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributed__closure__55>x10_lang_FinishState__FinishResilientDistributed__closure__55::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientDistributed__closure__55::__apply, &x10_lang_FinishState__FinishResilientDistributed__closure__55::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientDistributed__closure__55::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__FinishResilientDistributed__closure__55::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributed__closure__55::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientDistributed__closure__55::_deserialize);

::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > >::itable<x10_lang_FinishState__FinishResilientDistributed__closure__56>x10_lang_FinishState__FinishResilientDistributed__closure__56::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientDistributed__closure__56::__apply, &x10_lang_FinishState__FinishResilientDistributed__closure__56::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientDistributed__closure__56::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::FinishState__FinishResilientDistributedBackup*, ::x10::util::Pair<x10_boolean, ::x10::lang::GlobalRef< ::x10::lang::FinishState__FinishResilientDistributedMaster* > > > >, &x10_lang_FinishState__FinishResilientDistributed__closure__56::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributed__closure__56::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientDistributed__closure__56::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributed__closure__57>x10_lang_FinishState__FinishResilientDistributed__closure__57::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientDistributed__closure__57::__apply, &x10_lang_FinishState__FinishResilientDistributed__closure__57::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientDistributed__closure__57::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__FinishResilientDistributed__closure__57::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributed__closure__57::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientDistributed__closure__57::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributed__closure__59>x10_lang_FinishState__FinishResilientDistributed__closure__59::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientDistributed__closure__59::__apply, &x10_lang_FinishState__FinishResilientDistributed__closure__59::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientDistributed__closure__59::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__FinishResilientDistributed__closure__59::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributed__closure__59::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientDistributed__closure__59::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributed__closure__58>x10_lang_FinishState__FinishResilientDistributed__closure__58::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientDistributed__closure__58::__apply, &x10_lang_FinishState__FinishResilientDistributed__closure__58::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientDistributed__closure__58::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__FinishResilientDistributed__closure__58::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributed__closure__58::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientDistributed__closure__58::_deserialize);
const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributed__closure__58::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_FinishState__FinishResilientDistributed__closure__58::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributed__closure__61>x10_lang_FinishState__FinishResilientDistributed__closure__61::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientDistributed__closure__61::__apply, &x10_lang_FinishState__FinishResilientDistributed__closure__61::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientDistributed__closure__61::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__FinishResilientDistributed__closure__61::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributed__closure__61::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientDistributed__closure__61::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_FinishState__FinishResilientDistributed__closure__60>x10_lang_FinishState__FinishResilientDistributed__closure__60::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_FinishState__FinishResilientDistributed__closure__60::__apply, &x10_lang_FinishState__FinishResilientDistributed__closure__60::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_FinishState__FinishResilientDistributed__closure__60::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_FinishState__FinishResilientDistributed__closure__60::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_FinishState__FinishResilientDistributed__closure__60::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_FinishState__FinishResilientDistributed__closure__60::_deserialize);

/* END of FinishState$FinishResilientDistributed */
/*************************************************/
