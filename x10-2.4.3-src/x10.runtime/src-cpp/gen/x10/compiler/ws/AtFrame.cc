/*************************************************/
/* START of AtFrame */
#include <x10/compiler/ws/AtFrame.h>

#include <x10/compiler/ws/Frame.h>
#include <x10/lang/GlobalRef.h>
#include <x10/compiler/ws/FinishFrame.h>
#include <x10/compiler/Ifdef.h>
#include <x10/compiler/ws/Worker.h>
#include <x10/lang/Exception.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/compiler/ws/ThrowFrame.h>
#include <x10/lang/Deque.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Any.h>
#include <x10/compiler/RemoteInvocation.h>
#include <x10/lang/Place.h>
#include <x10/lang/Long.h>
#include <x10/compiler/Inline.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_COMPILER_WS_ATFRAME__CLOSURE__1_CLOSURE
#define X10_COMPILER_WS_ATFRAME__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_compiler_ws_AtFrame__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_compiler_ws_AtFrame__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
        ::x10::compiler::ws::Frame* up__76848 = (upRef__76850)->__apply();
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                      throwable__76851))) {
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
            up__76848 = (__extension__ ({
                ::x10::compiler::ws::ThrowFrame* alloc__76849 =  (new (::x10aux::alloc_z< ::x10::compiler::ws::ThrowFrame>()) ::x10::compiler::ws::ThrowFrame());
                (alloc__76849)->::x10::compiler::ws::ThrowFrame::_constructor(
                  up__76848, throwable__76851);
                alloc__76849;
            }))
            ;
        }
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
        ::x10aux::nullCheck(::x10::lang::Runtime::wsFIFO())->x10::lang::Deque::push(
          reinterpret_cast< ::x10::lang::Any*>(up__76848));
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::compiler::ws::Frame* > upRef__76850;
    ::x10::lang::Exception* throwable__76851;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->upRef__76850);
        buf.write(this->throwable__76851);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_compiler_ws_AtFrame__closure__1* storage = ::x10aux::alloc_z<x10_compiler_ws_AtFrame__closure__1>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::compiler::ws::Frame* > that_upRef__76850 = buf.read< ::x10::lang::GlobalRef< ::x10::compiler::ws::Frame* > >();
        ::x10::lang::Exception* that_throwable__76851 = buf.read< ::x10::lang::Exception*>();
        x10_compiler_ws_AtFrame__closure__1* this_ = new (storage) x10_compiler_ws_AtFrame__closure__1(that_upRef__76850, that_throwable__76851);
        return this_;
    }
    
    x10_compiler_ws_AtFrame__closure__1(::x10::lang::GlobalRef< ::x10::compiler::ws::Frame* > upRef__76850, ::x10::lang::Exception* throwable__76851) : upRef__76850(upRef__76850), throwable__76851(throwable__76851) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10:34-40";
    }

};

#endif // X10_COMPILER_WS_ATFRAME__CLOSURE__1_CLOSURE
#ifndef X10_COMPILER_WS_ATFRAME__CLOSURE__2_CLOSURE
#define X10_COMPILER_WS_ATFRAME__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_compiler_ws_AtFrame__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_compiler_ws_AtFrame__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
        ::x10::compiler::ws::Frame* up = (upRef)->__apply();
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                      throwable))) {
            
            //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
            up = (__extension__ ({
                ::x10::compiler::ws::ThrowFrame* alloc__76828 =  (new (::x10aux::alloc_z< ::x10::compiler::ws::ThrowFrame>()) ::x10::compiler::ws::ThrowFrame());
                (alloc__76828)->::x10::compiler::ws::ThrowFrame::_constructor(
                  up, throwable);
                alloc__76828;
            }))
            ;
        }
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
        ::x10aux::nullCheck(::x10::lang::Runtime::wsFIFO())->x10::lang::Deque::push(
          reinterpret_cast< ::x10::lang::Any*>(up));
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::compiler::ws::Frame* > upRef;
    ::x10::lang::Exception* throwable;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->upRef);
        buf.write(this->throwable);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_compiler_ws_AtFrame__closure__2* storage = ::x10aux::alloc_z<x10_compiler_ws_AtFrame__closure__2>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::compiler::ws::Frame* > that_upRef = buf.read< ::x10::lang::GlobalRef< ::x10::compiler::ws::Frame* > >();
        ::x10::lang::Exception* that_throwable = buf.read< ::x10::lang::Exception*>();
        x10_compiler_ws_AtFrame__closure__2* this_ = new (storage) x10_compiler_ws_AtFrame__closure__2(that_upRef, that_throwable);
        return this_;
    }
    
    x10_compiler_ws_AtFrame__closure__2(::x10::lang::GlobalRef< ::x10::compiler::ws::Frame* > upRef, ::x10::lang::Exception* throwable) : upRef(upRef), throwable(throwable) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10:34-40";
    }

};

#endif // X10_COMPILER_WS_ATFRAME__CLOSURE__2_CLOSURE

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"

//#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
void x10::compiler::ws::AtFrame::_constructor(::x10::compiler::ws::Frame* up,
                                              ::x10::compiler::ws::FinishFrame* ff) {
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
    ::x10::compiler::ws::Frame* this__76845 = this;
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
    ::x10::compiler::ws::Frame* up__76846 = reinterpret_cast< ::x10::compiler::ws::Frame*>(ff);
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Frame.x10"
    ::x10aux::nullCheck(this__76845)->FMGL(up) = up__76846;
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
    
    //#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
    ::x10::compiler::ws::AtFrame* this__76844 = this;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
    this->FMGL(upRef) = ::x10::lang::GlobalRef< ::x10::compiler::ws::Frame* >(up);
}
::x10::compiler::ws::AtFrame* x10::compiler::ws::AtFrame::_make(::x10::compiler::ws::Frame* up,
                                                                ::x10::compiler::ws::FinishFrame* ff)
{
    ::x10::compiler::ws::AtFrame* this_ = new (::x10aux::alloc_z< ::x10::compiler::ws::AtFrame>()) ::x10::compiler::ws::AtFrame();
    this_->_constructor(up, ff);
    return this_;
}



//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
::x10::compiler::ws::Frame* x10::compiler::ws::AtFrame::remap(
  ) {
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
    return reinterpret_cast< ::x10::compiler::ws::Frame*>(this);
    
}

//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
void x10::compiler::ws::AtFrame::wrapResume(::x10::compiler::ws::Worker* worker) {
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
    ::x10::lang::GlobalRef< ::x10::compiler::ws::Frame* > upRef__76850 =
      this->FMGL(upRef);
    ::x10::lang::Exception* throwable__76851 = ::x10aux::nullCheck(worker)->FMGL(throwable);
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
    ::x10::lang::VoidFun_0_0* body__76847 = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_compiler_ws_AtFrame__closure__1)))x10_compiler_ws_AtFrame__closure__1(upRef__76850, throwable__76851)));
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
    ::x10::compiler::ws::Worker::wsRunAsync(::x10::lang::Place::place((upRef__76850)->location)->FMGL(id),
                                            body__76847);
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
    ::x10aux::nullCheck(worker)->FMGL(throwable) = (::x10aux::class_cast_unchecked< ::x10::lang::Exception*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}

//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
void x10::compiler::ws::AtFrame::update(::x10::lang::GlobalRef< ::x10::compiler::ws::Frame* > upRef,
                                        ::x10::lang::Exception* throwable) {
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
    ::x10::lang::VoidFun_0_0* body = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_compiler_ws_AtFrame__closure__2)))x10_compiler_ws_AtFrame__closure__2(upRef, throwable)));
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
    ::x10::compiler::ws::Worker::wsRunAsync(::x10::lang::Place::place((upRef)->location)->FMGL(id),
                                            body);
}

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/AtFrame.x10"
::x10::compiler::ws::AtFrame* x10::compiler::ws::AtFrame::x10__compiler__ws__AtFrame____this__x10__compiler__ws__AtFrame(
  ) {
    return this;
    
}
void x10::compiler::ws::AtFrame::__fieldInitializers_x10_compiler_ws_AtFrame(
  ) {
 
}
const ::x10aux::serialization_id_t x10::compiler::ws::AtFrame::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::compiler::ws::AtFrame::_deserializer);

void x10::compiler::ws::AtFrame::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::compiler::ws::Frame::_serialize_body(buf);
    buf.write(this->FMGL(upRef));
    
}

::x10::lang::Reference* ::x10::compiler::ws::AtFrame::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::compiler::ws::AtFrame* this_ = new (::x10aux::alloc_z< ::x10::compiler::ws::AtFrame>()) ::x10::compiler::ws::AtFrame();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::compiler::ws::AtFrame::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::compiler::ws::Frame::_deserialize_body(buf);
    FMGL(upRef) = buf.read< ::x10::lang::GlobalRef< ::x10::compiler::ws::Frame* > >();
}

::x10aux::RuntimeType x10::compiler::ws::AtFrame::rtt;
void x10::compiler::ws::AtFrame::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::compiler::ws::Frame>()};
    rtt.initStageTwo("x10.compiler.ws.AtFrame",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::VoidFun_0_0::itable<x10_compiler_ws_AtFrame__closure__1>x10_compiler_ws_AtFrame__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_compiler_ws_AtFrame__closure__1::__apply, &x10_compiler_ws_AtFrame__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_compiler_ws_AtFrame__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_compiler_ws_AtFrame__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_compiler_ws_AtFrame__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_compiler_ws_AtFrame__closure__1::_deserialize);
const ::x10aux::serialization_id_t x10_compiler_ws_AtFrame__closure__1::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_compiler_ws_AtFrame__closure__1::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_compiler_ws_AtFrame__closure__2>x10_compiler_ws_AtFrame__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_compiler_ws_AtFrame__closure__2::__apply, &x10_compiler_ws_AtFrame__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_compiler_ws_AtFrame__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_compiler_ws_AtFrame__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_compiler_ws_AtFrame__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_compiler_ws_AtFrame__closure__2::_deserialize);
const ::x10aux::serialization_id_t x10_compiler_ws_AtFrame__closure__2::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_compiler_ws_AtFrame__closure__2::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

/* END of AtFrame */
/*************************************************/
