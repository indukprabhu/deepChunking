/*************************************************/
/* START of RemoteFinish */
#include <x10/compiler/ws/RemoteFinish.h>

#include <x10/compiler/ws/FinishFrame.h>
#include <x10/lang/GlobalRef.h>
#include <x10/compiler/ws/Frame.h>
#include <x10/util/concurrent/Lock.h>
#include <x10/util/concurrent/Monitor.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Int.h>
#include <x10/compiler/Ifdef.h>
#include <x10/compiler/ws/Worker.h>
#include <x10/util/GrowableRail.h>
#include <x10/lang/Exception.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Deque.h>
#include <x10/lang/Any.h>
#include <x10/compiler/RemoteInvocation.h>
#include <x10/lang/Place.h>
#include <x10/lang/Long.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/Inline.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_COMPILER_WS_REMOTEFINISH__CLOSURE__1_CLOSURE
#define X10_COMPILER_WS_REMOTEFINISH__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_compiler_ws_RemoteFinish__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_compiler_ws_RemoteFinish__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
        ::x10::compiler::ws::FinishFrame* ff__78050 = (ffRef__78051)->__apply();
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
        ::x10aux::nullCheck(ff__78050)->x10::compiler::ws::FinishFrame::append(
          exceptions__78052);
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
        ::x10aux::nullCheck(::x10::lang::Runtime::wsFIFO())->x10::lang::Deque::push(
          reinterpret_cast< ::x10::lang::Any*>(ff__78050));
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::compiler::ws::FinishFrame* > ffRef__78051;
    ::x10::util::GrowableRail< ::x10::lang::Exception*>* exceptions__78052;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->ffRef__78051);
        buf.write(this->exceptions__78052);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_compiler_ws_RemoteFinish__closure__1* storage = ::x10aux::alloc_z<x10_compiler_ws_RemoteFinish__closure__1>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::compiler::ws::FinishFrame* > that_ffRef__78051 = buf.read< ::x10::lang::GlobalRef< ::x10::compiler::ws::FinishFrame* > >();
        ::x10::util::GrowableRail< ::x10::lang::Exception*>* that_exceptions__78052 = buf.read< ::x10::util::GrowableRail< ::x10::lang::Exception*>*>();
        x10_compiler_ws_RemoteFinish__closure__1* this_ = new (storage) x10_compiler_ws_RemoteFinish__closure__1(that_ffRef__78051, that_exceptions__78052);
        return this_;
    }
    
    x10_compiler_ws_RemoteFinish__closure__1(::x10::lang::GlobalRef< ::x10::compiler::ws::FinishFrame* > ffRef__78051, ::x10::util::GrowableRail< ::x10::lang::Exception*>* exceptions__78052) : ffRef__78051(ffRef__78051), exceptions__78052(exceptions__78052) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10:41-45";
    }

};

#endif // X10_COMPILER_WS_REMOTEFINISH__CLOSURE__1_CLOSURE
#ifndef X10_COMPILER_WS_REMOTEFINISH__CLOSURE__2_CLOSURE
#define X10_COMPILER_WS_REMOTEFINISH__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_compiler_ws_RemoteFinish__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_compiler_ws_RemoteFinish__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
        ::x10::compiler::ws::FinishFrame* ff = (ffRef)->__apply();
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
        ::x10aux::nullCheck(ff)->x10::compiler::ws::FinishFrame::append(exceptions);
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
        ::x10aux::nullCheck(::x10::lang::Runtime::wsFIFO())->x10::lang::Deque::push(
          reinterpret_cast< ::x10::lang::Any*>(ff));
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::compiler::ws::FinishFrame* > ffRef;
    ::x10::util::GrowableRail< ::x10::lang::Exception*>* exceptions;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->ffRef);
        buf.write(this->exceptions);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_compiler_ws_RemoteFinish__closure__2* storage = ::x10aux::alloc_z<x10_compiler_ws_RemoteFinish__closure__2>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::compiler::ws::FinishFrame* > that_ffRef = buf.read< ::x10::lang::GlobalRef< ::x10::compiler::ws::FinishFrame* > >();
        ::x10::util::GrowableRail< ::x10::lang::Exception*>* that_exceptions = buf.read< ::x10::util::GrowableRail< ::x10::lang::Exception*>*>();
        x10_compiler_ws_RemoteFinish__closure__2* this_ = new (storage) x10_compiler_ws_RemoteFinish__closure__2(that_ffRef, that_exceptions);
        return this_;
    }
    
    x10_compiler_ws_RemoteFinish__closure__2(::x10::lang::GlobalRef< ::x10::compiler::ws::FinishFrame* > ffRef, ::x10::util::GrowableRail< ::x10::lang::Exception*>* exceptions) : ffRef(ffRef), exceptions(exceptions) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10:41-45";
    }

};

#endif // X10_COMPILER_WS_REMOTEFINISH__CLOSURE__2_CLOSURE

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"

//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
void x10::compiler::ws::RemoteFinish::_constructor(::x10::compiler::ws::FinishFrame* ff) {
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
    (this)->::x10::compiler::ws::FinishFrame::_constructor(::x10aux::class_cast_unchecked< ::x10::compiler::ws::Frame*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
    ::x10::compiler::ws::RemoteFinish* this__78048 = this;
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
    this->FMGL(asyncs) = ((x10_int)1);
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
    this->FMGL(ffRef) = ::x10::lang::GlobalRef< ::x10::compiler::ws::FinishFrame* >(ff);
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
    ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->lock();
    ::x10aux::nullCheck(ff)->FMGL(asyncs) = ((::x10aux::nullCheck(ff)->FMGL(asyncs)) + (((x10_int)1)));
    ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->unlock();
}
::x10::compiler::ws::RemoteFinish* x10::compiler::ws::RemoteFinish::_make(
  ::x10::compiler::ws::FinishFrame* ff) {
    ::x10::compiler::ws::RemoteFinish* this_ = new (::x10aux::alloc_z< ::x10::compiler::ws::RemoteFinish>()) ::x10::compiler::ws::RemoteFinish();
    this_->_constructor(ff);
    return this_;
}



//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
::x10::compiler::ws::Frame* x10::compiler::ws::RemoteFinish::remap() {
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
    return reinterpret_cast< ::x10::compiler::ws::Frame*>(this);
    
}

//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
void x10::compiler::ws::RemoteFinish::wrapResume(::x10::compiler::ws::Worker* worker) {
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
    ::x10::compiler::ws::FinishFrame::wrapResume(worker);
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
    ::x10::lang::GlobalRef< ::x10::compiler::ws::FinishFrame* > ffRef__78051 =
      this->FMGL(ffRef);
    ::x10::util::GrowableRail< ::x10::lang::Exception*>* exceptions__78052 =
      this->FMGL(exceptions);
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
    ::x10::lang::VoidFun_0_0* body__78049 = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_compiler_ws_RemoteFinish__closure__1)))x10_compiler_ws_RemoteFinish__closure__1(ffRef__78051, exceptions__78052)));
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
    ::x10::compiler::ws::Worker::wsRunAsync(::x10::lang::Place::place((ffRef__78051)->location)->FMGL(id),
                                            body__78049);
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
    ::x10aux::nullCheck(worker)->FMGL(throwable) = (::x10aux::class_cast_unchecked< ::x10::lang::Exception*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::compiler::Abort::FMGL(ABORT__get)()));
}

//#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
void x10::compiler::ws::RemoteFinish::update(::x10::lang::GlobalRef< ::x10::compiler::ws::FinishFrame* > ffRef,
                                             ::x10::util::GrowableRail< ::x10::lang::Exception*>* exceptions) {
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
    ::x10::lang::VoidFun_0_0* body = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_compiler_ws_RemoteFinish__closure__2)))x10_compiler_ws_RemoteFinish__closure__2(ffRef, exceptions)));
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
    ::x10::compiler::ws::Worker::wsRunAsync(::x10::lang::Place::place((ffRef)->location)->FMGL(id),
                                            body);
}

//#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/RemoteFinish.x10"
::x10::compiler::ws::RemoteFinish* x10::compiler::ws::RemoteFinish::x10__compiler__ws__RemoteFinish____this__x10__compiler__ws__RemoteFinish(
  ) {
    return this;
    
}
void x10::compiler::ws::RemoteFinish::__fieldInitializers_x10_compiler_ws_RemoteFinish(
  ) {
 
}
const ::x10aux::serialization_id_t x10::compiler::ws::RemoteFinish::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::compiler::ws::RemoteFinish::_deserializer);

void x10::compiler::ws::RemoteFinish::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::compiler::ws::FinishFrame::_serialize_body(buf);
    buf.write(this->FMGL(ffRef));
    
}

::x10::lang::Reference* ::x10::compiler::ws::RemoteFinish::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::compiler::ws::RemoteFinish* this_ = new (::x10aux::alloc_z< ::x10::compiler::ws::RemoteFinish>()) ::x10::compiler::ws::RemoteFinish();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::compiler::ws::RemoteFinish::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::compiler::ws::FinishFrame::_deserialize_body(buf);
    FMGL(ffRef) = buf.read< ::x10::lang::GlobalRef< ::x10::compiler::ws::FinishFrame* > >();
}

::x10aux::RuntimeType x10::compiler::ws::RemoteFinish::rtt;
void x10::compiler::ws::RemoteFinish::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::compiler::ws::FinishFrame>()};
    rtt.initStageTwo("x10.compiler.ws.RemoteFinish",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::VoidFun_0_0::itable<x10_compiler_ws_RemoteFinish__closure__1>x10_compiler_ws_RemoteFinish__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_compiler_ws_RemoteFinish__closure__1::__apply, &x10_compiler_ws_RemoteFinish__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_compiler_ws_RemoteFinish__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_compiler_ws_RemoteFinish__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_compiler_ws_RemoteFinish__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_compiler_ws_RemoteFinish__closure__1::_deserialize);
const ::x10aux::serialization_id_t x10_compiler_ws_RemoteFinish__closure__1::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_compiler_ws_RemoteFinish__closure__1::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_compiler_ws_RemoteFinish__closure__2>x10_compiler_ws_RemoteFinish__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_compiler_ws_RemoteFinish__closure__2::__apply, &x10_compiler_ws_RemoteFinish__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_compiler_ws_RemoteFinish__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_compiler_ws_RemoteFinish__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_compiler_ws_RemoteFinish__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_compiler_ws_RemoteFinish__closure__2::_deserialize);
const ::x10aux::serialization_id_t x10_compiler_ws_RemoteFinish__closure__2::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_compiler_ws_RemoteFinish__closure__2::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

/* END of RemoteFinish */
/*************************************************/
