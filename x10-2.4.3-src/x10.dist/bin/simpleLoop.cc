/*************************************************/
/* START of simpleLoop */
#include <simpleLoop.h>

#include <x10/lang/Rail.h>
#include <x10/lang/String.h>
#include <x10/io/Printer.h>
#include <x10/io/Console.h>
#include <x10/lang/Any.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/FinishState.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/VoidFun_0_0.h>
#include <chunk.h>
#include <x10/lang/Error.h>
#include <x10/lang/Exception.h>
#include <x10/compiler/AsyncClosure.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/compiler/Synthetic.h>
#ifndef SIMPLELOOP__CLOSURE__1_CLOSURE
#define SIMPLELOOP__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class simpleLoop__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<simpleLoop__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 12 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
            ::x10::lang::Rail< ::chunk* >* sample__90 = ::x10::lang::Rail< ::chunk* >::_make(((x10_long)2ll));
            
        }
        catch (::x10::lang::CheckedThrowable* __exc1) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc1)) {
                ::x10::lang::Error* __lowerer__var__0__ = static_cast< ::x10::lang::Error*>(__exc1);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc1);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        simpleLoop__closure__1* storage = ::x10aux::alloc_z<simpleLoop__closure__1>();
        buf.record_reference(storage);
        simpleLoop__closure__1* this_ = new (storage) simpleLoop__closure__1();
        return this_;
    }
    
    simpleLoop__closure__1() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/testprgms/src/simpleLoop.x10:11-13";
    }

};

#endif // SIMPLELOOP__CLOSURE__1_CLOSURE

//#line 5 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
void simpleLoop::main(::x10::lang::Rail< ::x10::lang::String* >* args) {
    
    //#line 8 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
    ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__110 = ::x10aux::makeStringLit("hi"); strLit__110; }))));
    {
        
        //#line 9 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
        ::x10::lang::Runtime::ensureNotInAtomic();
        ::x10::lang::FinishState* x10____var0 = ::x10::lang::Runtime::startFinish();
        {
            ::x10::lang::CheckedThrowable* throwable__97 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                try {
                    {
                        x10_long nproc__86 = ((x10_long)4ll);
                        ::x10::lang::Rail< x10_boolean >* done__87 = ::x10::lang::Rail< x10_boolean >::_make(((x10_long)8ll));
                        {
                            x10_long proc__88;
                            for (proc__88 = ((x10_long)0ll); ((proc__88) < (nproc__86));
                                 proc__88 = ((proc__88) + (((x10_long)1ll))))
                            {
                                x10_long tproc__89 = proc__88;
                                
                                //#line 10 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
                                ::x10::lang::Runtime::runAsync(reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(simpleLoop__closure__1)))simpleLoop__closure__1())));
                            }
                        }
                        
                    }
                }
                catch (::x10::lang::CheckedThrowable* __exc2) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc2);
                        {
                            ::x10::lang::Runtime::pushException(__lowerer__var__0__);
                            ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make()));
                        }
                    } else
                    throw;
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc3) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__98 = static_cast< ::x10::lang::CheckedThrowable*>(__exc3);
                    {
                        throwable__97 = formal__98;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__97)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__97))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__97));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::stopFinish(x10____var0);
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__97)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__97)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__97));
                }
                
            }
            
        }
    }
}

//#line 4 "/home/induk/workspace/testprgms/src/simpleLoop.x10"
::simpleLoop* simpleLoop::simpleLoop____this__simpleLoop(
  ) {
    return this;
    
}
void simpleLoop::_constructor() {
    this->simpleLoop::__fieldInitializers_simpleLoop();
}
::simpleLoop* simpleLoop::_make() {
    ::simpleLoop* this_ = new (::x10aux::alloc_z< ::simpleLoop>()) ::simpleLoop();
    this_->_constructor();
    return this_;
}


void simpleLoop::__fieldInitializers_simpleLoop() {
 
}
const ::x10aux::serialization_id_t simpleLoop::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::simpleLoop::_deserializer);

void simpleLoop::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::simpleLoop::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::simpleLoop* this_ = new (::x10aux::alloc_z< ::simpleLoop>()) ::simpleLoop();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void simpleLoop::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType simpleLoop::rtt;
void simpleLoop::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("simpleLoop",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

::x10::lang::VoidFun_0_0::itable<simpleLoop__closure__1>simpleLoop__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &simpleLoop__closure__1::__apply, &simpleLoop__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry simpleLoop__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &simpleLoop__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t simpleLoop__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(simpleLoop__closure__1::_deserialize);
const ::x10aux::serialization_id_t simpleLoop__closure__1::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(simpleLoop__closure__1::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

/* END of simpleLoop */
/*************************************************/
