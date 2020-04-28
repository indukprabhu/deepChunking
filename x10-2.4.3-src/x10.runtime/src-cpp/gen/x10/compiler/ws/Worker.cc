/*************************************************/
/* START of Worker */
#include <x10/compiler/ws/Worker.h>

#include <x10/lang/Int.h>
#include <x10/lang/Rail.h>
#include <x10/util/Random.h>
#include <x10/lang/Deque.h>
#include <x10/util/concurrent/Lock.h>
#include <x10/lang/Exception.h>
#include <x10/lang/Long.h>
#include <x10/compiler/ws/RegularFrame.h>
#include <x10/compiler/ws/Frame.h>
#include <x10/lang/Any.h>
#include <x10/compiler/Ifdef.h>
#include <x10/util/concurrent/Monitor.h>
#include <x10/lang/Runtime.h>
#include <x10/compiler/ws/FinishFrame.h>
#include <x10/compiler/Abort.h>
#include <x10/lang/String.h>
#include <x10/lang/Place.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/Runtime__Pool.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Unsafe.h>
#include <x10/compiler/NoReturn.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/compiler/RemoteInvocation.h>
#include <x10/lang/Runtime__Worker.h>
#include <x10/lang/Thread.h>
#include <x10/lang/Error.h>
#include <x10/compiler/AsyncClosure.h>
#include <x10/compiler/ws/MainFrame.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/util/GrowableRail.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_COMPILER_WS_WORKER__CLOSURE__1_CLOSURE
#define X10_COMPILER_WS_WORKER__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_compiler_ws_Worker__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_compiler_ws_Worker__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(::x10::lang::Runtime::wsFIFO())->x10::lang::Deque::push(
          reinterpret_cast< ::x10::lang::Any*>(frame));
    }
    
    // captured environment
    ::x10::compiler::ws::RegularFrame* frame;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->frame);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_compiler_ws_Worker__closure__1* storage = ::x10aux::alloc_z<x10_compiler_ws_Worker__closure__1>();
        buf.record_reference(storage);
        ::x10::compiler::ws::RegularFrame* that_frame = buf.read< ::x10::compiler::ws::RegularFrame*>();
        x10_compiler_ws_Worker__closure__1* this_ = new (storage) x10_compiler_ws_Worker__closure__1(that_frame);
        return this_;
    }
    
    x10_compiler_ws_Worker__closure__1(::x10::compiler::ws::RegularFrame* frame) : frame(frame) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10:122";
    }

};

#endif // X10_COMPILER_WS_WORKER__CLOSURE__1_CLOSURE
#ifndef X10_COMPILER_WS_WORKER__CLOSURE__2_CLOSURE
#define X10_COMPILER_WS_WORKER__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_compiler_ws_Worker__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_compiler_ws_Worker__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10aux::nullCheck(::x10::lang::Runtime::wsFIFO())->x10::lang::Deque::push(
          reinterpret_cast< ::x10::lang::Any*>(frame));
    }
    
    // captured environment
    ::x10::compiler::ws::RegularFrame* frame;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->frame);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_compiler_ws_Worker__closure__2* storage = ::x10aux::alloc_z<x10_compiler_ws_Worker__closure__2>();
        buf.record_reference(storage);
        ::x10::compiler::ws::RegularFrame* that_frame = buf.read< ::x10::compiler::ws::RegularFrame*>();
        x10_compiler_ws_Worker__closure__2* this_ = new (storage) x10_compiler_ws_Worker__closure__2(that_frame);
        return this_;
    }
    
    x10_compiler_ws_Worker__closure__2(::x10::compiler::ws::RegularFrame* frame) : frame(frame) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10:127";
    }

};

#endif // X10_COMPILER_WS_WORKER__CLOSURE__2_CLOSURE
#ifndef X10_COMPILER_WS_WORKER__CLOSURE__3_CLOSURE
#define X10_COMPILER_WS_WORKER__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_compiler_ws_Worker__closure__3 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_compiler_ws_Worker__closure__3> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10::lang::Runtime::wsEnd();
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
        x10_compiler_ws_Worker__closure__3* storage = ::x10aux::alloc_z<x10_compiler_ws_Worker__closure__3>();
        buf.record_reference(storage);
        x10_compiler_ws_Worker__closure__3* this_ = new (storage) x10_compiler_ws_Worker__closure__3();
        return this_;
    }
    
    x10_compiler_ws_Worker__closure__3() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10:133";
    }

};

#endif // X10_COMPILER_WS_WORKER__CLOSURE__3_CLOSURE
#ifndef X10_COMPILER_WS_WORKER__CLOSURE__4_CLOSURE
#define X10_COMPILER_WS_WORKER__CLOSURE__4_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_compiler_ws_Worker__closure__4 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_compiler_ws_Worker__closure__4> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            ::x10aux::nullCheck(worker)->FMGL(fifo) = ::x10aux::nullCheck((::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread())))->FMGL(wsfifo);
            
            //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            ::x10aux::nullCheck(worker)->x10::compiler::ws::Worker::run();
        }
        catch (::x10::lang::CheckedThrowable* __exc276) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc276)) {
                ::x10::lang::Error* __lowerer__var__0__ = static_cast< ::x10::lang::Error*>(__exc276);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc276);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::compiler::ws::Worker* worker;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->worker);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_compiler_ws_Worker__closure__4* storage = ::x10aux::alloc_z<x10_compiler_ws_Worker__closure__4>();
        buf.record_reference(storage);
        ::x10::compiler::ws::Worker* that_worker = buf.read< ::x10::compiler::ws::Worker*>();
        x10_compiler_ws_Worker__closure__4* this_ = new (storage) x10_compiler_ws_Worker__closure__4(that_worker);
        return this_;
    }
    
    x10_compiler_ws_Worker__closure__4(::x10::compiler::ws::Worker* worker) : worker(worker) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10:150-153";
    }

};

#endif // X10_COMPILER_WS_WORKER__CLOSURE__4_CLOSURE
#ifndef X10_COMPILER_WS_WORKER__CLOSURE__5_CLOSURE
#define X10_COMPILER_WS_WORKER__CLOSURE__5_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_compiler_ws_Worker__closure__5 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_compiler_ws_Worker__closure__5> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            ::x10aux::nullCheck(::x10::compiler::ws::Worker::startHere())->x10::compiler::ws::Worker::run();
        }
        catch (::x10::lang::CheckedThrowable* __exc278) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc278)) {
                ::x10::lang::Error* __lowerer__var__0__ = static_cast< ::x10::lang::Error*>(__exc278);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc278);
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
        x10_compiler_ws_Worker__closure__5* storage = ::x10aux::alloc_z<x10_compiler_ws_Worker__closure__5>();
        buf.record_reference(storage);
        x10_compiler_ws_Worker__closure__5* this_ = new (storage) x10_compiler_ws_Worker__closure__5();
        return this_;
    }
    
    x10_compiler_ws_Worker__closure__5() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10:162";
    }

};

#endif // X10_COMPILER_WS_WORKER__CLOSURE__5_CLOSURE

//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"

//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"

//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"

//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
void x10::compiler::ws::Worker::_constructor(x10_int i, ::x10::lang::Rail< ::x10::compiler::ws::Worker* >* workers) {
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    this->x10::compiler::ws::Worker::__fieldInitializers_x10_compiler_ws_Worker();
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    this->FMGL(random) = (__extension__ ({
        ::x10::util::Random* alloc__76816 =  (new (::x10aux::alloc_z< ::x10::util::Random>()) ::x10::util::Random());
        (alloc__76816)->::x10::util::Random::_constructor(((x10_long)(((((((i) + (((i) << (0x1f & (x10_int)(((x10_long)(((x10_int)8))))))))) + (((i) << (0x1f & (x10_int)(((x10_long)(((x10_int)16))))))))) + (((i) << (0x1f & (x10_int)(((x10_long)(((x10_int)24)))))))))));
        alloc__76816;
    }))
    ;
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    this->FMGL(id) = i;
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    this->FMGL(workers) = workers;
}
::x10::compiler::ws::Worker* x10::compiler::ws::Worker::_make(x10_int i, ::x10::lang::Rail< ::x10::compiler::ws::Worker* >* workers)
{
    ::x10::compiler::ws::Worker* this_ = new (::x10aux::alloc_z< ::x10::compiler::ws::Worker>()) ::x10::compiler::ws::Worker();
    this_->_constructor(i, workers);
    return this_;
}



//#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
void x10::compiler::ws::Worker::migrate() {
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    ::x10::compiler::ws::RegularFrame* k;
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    this->FMGL(lock)->lock();
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    while ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                     (k = reinterpret_cast< ::x10::compiler::ws::RegularFrame* >(this->FMGL(deque)->x10::lang::Deque::steal())))))
    {
        {
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            k = reinterpret_cast< ::x10::compiler::ws::RegularFrame*>(::x10aux::nullCheck(k)->remap());
        }
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->lock();
        ::x10::compiler::ws::FinishFrame* obj__78886 = ::x10aux::nullCheck(k)->FMGL(ff);
        ::x10aux::nullCheck(obj__78886)->FMGL(asyncs) = ((::x10aux::nullCheck(obj__78886)->FMGL(asyncs)) + (((x10_int)1)));
        ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->unlock();
        
        //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        ::x10aux::nullCheck(this->FMGL(fifo))->x10::lang::Deque::push(
          reinterpret_cast< ::x10::lang::Any*>(k));
    }
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    this->FMGL(lock)->unlock();
}

//#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
void x10::compiler::ws::Worker::run() {
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    try {
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        while (true) {
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            ::x10::lang::Any* k = this->x10::compiler::ws::Worker::find();
            
            //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            if ((::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                         k))) {
                return;
            }
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            try {
                
                //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                this->x10::compiler::ws::Worker::unroll(reinterpret_cast< ::x10::compiler::ws::Frame* >(k));
            }
            catch (::x10::lang::CheckedThrowable* __exc267) {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(__exc267)) {
                    ::x10::compiler::Abort* id__53 = static_cast< ::x10::compiler::Abort*>(__exc267);
                    {
                     
                    }
                } else
                throw;
            }
        }
        
    }
    catch (::x10::lang::CheckedThrowable* __exc268) {
        if (::x10aux::instanceof< ::x10::lang::Exception*>(__exc268)) {
            ::x10::lang::Exception* t = static_cast< ::x10::lang::Exception*>(__exc268);
            {
                
                //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__123525 = ::x10aux::makeStringLit("Uncaught exception at place "); strLit__123525; })), ::x10::lang::Place::_make(::x10aux::here)), (__extension__ ({ static ::x10::lang::String* strLit__123526 = ::x10aux::makeStringLit(" in WS worker: "); strLit__123526; }))), t)))->c_str());
                
                //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                ::x10aux::nullCheck(t)->printStackTrace();
            }
        } else
        throw;
    }
}

//#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
::x10::lang::Any* x10::compiler::ws::Worker::find() {
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    ::x10::lang::Any* k;
    
    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    k = ::x10aux::nullCheck(this->FMGL(fifo))->x10::lang::Deque::steal();
    
    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    while ((::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                    k))) {
        
        //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        if (::x10::lang::Runtime::FMGL(pool__get)()->FMGL(wsEnd))
        {
            return ::x10aux::class_cast_unchecked< ::x10::lang::Any*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            
        }
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        x10_int rand = ::x10aux::nullCheck(this->FMGL(random))->nextInt(
                         ::x10::lang::Runtime::FMGL(NTHREADS__get)());
        
        //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        ::x10::compiler::ws::Worker* victim = ::x10aux::nullCheck(this->FMGL(workers))->x10::lang::Rail< ::x10::compiler::ws::Worker* >::__apply(
                                                ((x10_long)(rand)));
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        k = ::x10aux::nullCheck(::x10aux::nullCheck(victim)->FMGL(fifo))->x10::lang::Deque::steal();
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                      k))) {
            break;
        }
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        if (::x10aux::nullCheck(victim)->FMGL(lock)->tryLock())
        {
            
            //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            k = ::x10aux::nullCheck(victim)->FMGL(deque)->x10::lang::Deque::steal();
            
            //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                          k))) {
                
                //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                ::x10::compiler::ws::RegularFrame* r = reinterpret_cast< ::x10::compiler::ws::RegularFrame* >(k);
                {
                    
                    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                    r = reinterpret_cast< ::x10::compiler::ws::RegularFrame*>(::x10aux::nullCheck(r)->remap());
                    
                    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                    k = (reinterpret_cast< ::x10::lang::Any*>(r));
                }
                
                //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->lock();
                ::x10::compiler::ws::FinishFrame* obj__78887 =
                  ::x10aux::nullCheck(r)->FMGL(ff);
                ::x10aux::nullCheck(obj__78887)->FMGL(asyncs) =
                  ((::x10aux::nullCheck(obj__78887)->FMGL(asyncs)) + (((x10_int)1)));
                ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->unlock();
            }
            
            //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            ::x10aux::nullCheck(victim)->FMGL(lock)->unlock();
        }
        
        //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                      k))) {
            break;
        }
        
        //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        ::x10aux::event_probe();
        
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        k = ::x10aux::nullCheck(this->FMGL(fifo))->x10::lang::Deque::steal();
    }
    
    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    return k;
    
}

//#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
void x10::compiler::ws::Worker::unroll(::x10::compiler::ws::Frame* frame) {
    
    //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    ::x10::compiler::ws::Frame* up;
    
    //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    while (true) {
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        ::x10aux::nullCheck(frame)->wrapResume(this);
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        up = ::x10aux::nullCheck(frame)->FMGL(up);
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        ::x10aux::nullCheck(up)->wrapBack(this, frame);
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        ::x10aux::dealloc(frame);
        
        //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        frame = up;
    }
    
}

//#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
void x10::compiler::ws::Worker::wsRunAsync(x10_long id, ::x10::lang::VoidFun_0_0* body) {
    
    //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    if ((::x10aux::struct_equals(id, ((x10_long)::x10aux::here))))
    {
        
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        ::x10::lang::VoidFun_0_0* copy = (__extension__ ({
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10::lang::VoidFun_0_0* o__78759 = body;
            ::x10::lang::Runtime::deepCopy< ::x10::lang::VoidFun_0_0* >(
              o__78759, ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        }))
        ;
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        ::x10::lang::VoidFun_0_0::__apply(::x10aux::nullCheck(copy));
        
        //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        ::x10aux::dealloc(copy);
    } else {
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10_long id__78888 = id;
        ::x10::lang::VoidFun_0_0* msgBody__78889 = body;
        ::x10::lang::Runtime__Profile* prof__78890 = ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::run_closure_at((x10_int)id__78888, msgBody__78889, reinterpret_cast< ::x10::lang::Runtime__Profile*>(X10_NULL), ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
    
    //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    ::x10aux::dealloc(body);
}

//#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
void x10::compiler::ws::Worker::runAsyncAt(::x10::lang::Place place,
                                           ::x10::compiler::ws::RegularFrame* frame) {
    
    //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    ::x10::lang::VoidFun_0_0* body = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_compiler_ws_Worker__closure__1)))x10_compiler_ws_Worker__closure__1(frame)));
    
    //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    ::x10::compiler::ws::Worker::wsRunAsync(place->FMGL(id),
                                            body);
}

//#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
void x10::compiler::ws::Worker::runAt(::x10::lang::Place place,
                                      ::x10::compiler::ws::RegularFrame* frame) {
    
    //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    ::x10::lang::VoidFun_0_0* body = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_compiler_ws_Worker__closure__2)))x10_compiler_ws_Worker__closure__2(frame)));
    
    //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    ::x10::compiler::ws::Worker::wsRunAsync(place->FMGL(id),
                                            body);
    
    //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    ::x10aux::throwException(::x10aux::nullCheck(::x10::compiler::Abort::FMGL(ABORT__get)()));
}

//#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
void x10::compiler::ws::Worker::stop() {
    
    //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    ::x10::lang::VoidFun_0_0* body = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_compiler_ws_Worker__closure__3)))x10_compiler_ws_Worker__closure__3()));
    
    //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    {
        x10_int i;
        for (i = ((x10_int)1); ((((x10_long)(i))) < (((x10_long)::x10aux::num_hosts)));
             i = ((i) + (((x10_int)1)))) {
            
            //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            x10_long id__78891 = ((x10_long)(i));
            ::x10::lang::VoidFun_0_0* msgBody__78892 = body;
            ::x10::lang::Runtime__Profile* prof__78893 = ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            
            //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10aux::run_closure_at((x10_int)id__78891, msgBody__78892, reinterpret_cast< ::x10::lang::Runtime__Profile*>(X10_NULL), ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        }
    }
    
    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    ::x10aux::dealloc(body);
    
    //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::FMGL(pool__get)()->FMGL(wsEnd) =
      true;
}

//#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
::x10::compiler::ws::Worker* x10::compiler::ws::Worker::startHere(
  ) {
    
    //#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::FMGL(pool__get)()->FMGL(wsBlockedContinuations) =
      ::x10::lang::Deque::_make();
    
    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    ::x10::lang::Rail< ::x10::compiler::ws::Worker* >* workers =
      ::x10::lang::Rail< ::x10::compiler::ws::Worker* >::_make(((x10_long)(::x10::lang::Runtime::FMGL(NTHREADS__get)())));
    
    //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    {
        x10_int i;
        for (i = ((x10_int)0); ((i) < (::x10::lang::Runtime::FMGL(NTHREADS__get)()));
             i = ((i) + (((x10_int)1)))) {
            
            //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            workers->x10::lang::Rail< ::x10::compiler::ws::Worker* >::__set(
              ((x10_long)(i)), (__extension__ ({
                  ::x10::compiler::ws::Worker* alloc__76817 =
                     (new (::x10aux::alloc_z< ::x10::compiler::ws::Worker>()) ::x10::compiler::ws::Worker());
                  (alloc__76817)->::x10::compiler::ws::Worker::_constructor(
                    i, workers);
                  alloc__76817;
              }))
              );
        }
    }
    
    //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    ::x10aux::nullCheck(workers->x10::lang::Rail< ::x10::compiler::ws::Worker* >::__apply(
                          ((x10_long)0ll)))->FMGL(fifo) =
      ::x10aux::nullCheck((::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread())))->FMGL(wsfifo);
    
    //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    {
        x10_int i;
        for (i = ((x10_int)1); ((i) < (::x10::lang::Runtime::FMGL(NTHREADS__get)()));
             i = ((i) + (((x10_int)1)))) {
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            ::x10::compiler::ws::Worker* worker = workers->x10::lang::Rail< ::x10::compiler::ws::Worker* >::__apply(
                                                    ((x10_long)(i)));
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            ::x10::lang::Runtime::runAsync(reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_compiler_ws_Worker__closure__4)))x10_compiler_ws_Worker__closure__4(worker))));
        }
    }
    
    //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    return workers->x10::lang::Rail< ::x10::compiler::ws::Worker* >::__apply(
             ((x10_long)0ll));
    
}

//#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
::x10::compiler::ws::Worker* x10::compiler::ws::Worker::start(
  ) {
    
    //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    ::x10::compiler::ws::Worker* worker = ::x10::compiler::ws::Worker::startHere();
    
    //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    {
        x10_int i;
        for (i = ((x10_int)1); ((((x10_long)(i))) < (((x10_long)::x10aux::num_hosts)));
             i = ((i) + (((x10_int)1)))) {
            
            //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            ::x10::lang::Place p = (__extension__ ({
                
                //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
                x10_long id__78881 = ((x10_long)(i));
                (__extension__ ({
                    ::x10::lang::Place alloc__78882 =  ::x10::lang::Place::_alloc();
                    (alloc__78882)->::x10::lang::Place::_constructor(
                      id__78881);
                    alloc__78882;
                }))
                ;
            }))
            ;
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            ::x10::lang::Runtime::runAsync(p, reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_compiler_ws_Worker__closure__5)))x10_compiler_ws_Worker__closure__5())),
                                           ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        }
    }
    
    //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    return worker;
    
}

//#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
void x10::compiler::ws::Worker::main(::x10::compiler::ws::MainFrame* frame) {
    
    //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    ::x10::compiler::ws::Worker* worker = ::x10::compiler::ws::Worker::start();
    
    //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    ::x10::compiler::ws::FinishFrame* ff = ::x10aux::nullCheck(frame)->FMGL(ff);
    
    //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    x10_boolean finalize = true;
    {
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        ::x10::lang::CheckedThrowable* throwable__78901 =
          ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        try {
            try {
                
                //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                ::x10aux::nullCheck(frame)->fast(worker);
            }
            catch (::x10::lang::CheckedThrowable* __exc280) {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(__exc280)) {
                    ::x10::compiler::Abort* t = static_cast< ::x10::compiler::Abort*>(__exc280);
                    {
                        
                        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                        finalize = false;
                        
                        //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                        ::x10aux::nullCheck(worker)->x10::compiler::ws::Worker::run();
                    }
                } else
                if (::x10aux::instanceof< ::x10::lang::Exception*>(__exc280)) {
                    ::x10::lang::Exception* t = static_cast< ::x10::lang::Exception*>(__exc280);
                    {
                        
                        //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
                        ::x10aux::nullCheck(ff)->x10::compiler::ws::FinishFrame::caught(
                          t);
                    }
                } else
                throw;
            }
            ::x10::compiler::Finalization::plausibleThrow();
        }
        catch (::x10::lang::CheckedThrowable* __exc281) {
            if (true) {
                ::x10::lang::CheckedThrowable* formal__78902 =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc281);
                {
                    throwable__78901 = formal__78902;
                }
            } else
            throw;
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__78901)))
        {
            if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__78901))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__78901));
            }
            
        }
        
        //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        if (true) {
            
            //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
            if (finalize) {
                ::x10::compiler::ws::Worker::stop();
            }
            
        }
        
        //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__78901)))
        {
            if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__78901)))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__78901));
            }
            
        }
        
    }
    
    //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                  ::x10aux::nullCheck(ff)->FMGL(exceptions))))
    {
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
        while (!((__extension__ ({
                   ::x10::util::GrowableRail< ::x10::lang::Exception*>* this__78894 =
                     ::x10aux::nullCheck(ff)->FMGL(exceptions);
                   (::x10aux::struct_equals(::x10aux::nullCheck(this__78894)->FMGL(size),
                                            ((x10_long)0ll)));
               }))
               )) {
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/FinishFrame.x10"
            ::x10::lang::Runtime::pushException(reinterpret_cast< ::x10::lang::CheckedThrowable*>(::x10aux::nullCheck(::x10aux::nullCheck(ff)->FMGL(exceptions))->x10::util::GrowableRail< ::x10::lang::Exception*>::removeLast()));
        }
        
    }
    
}

//#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
void x10::compiler::ws::Worker::rethrow() {
    
    //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                  this->FMGL(throwable))))
    {
        
        //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        ::x10::lang::Exception* t = this->FMGL(throwable);
        
        //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        this->FMGL(throwable) = (::x10aux::class_cast_unchecked< ::x10::lang::Exception*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
        //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
        ::x10aux::throwException(::x10aux::nullCheck(t));
    }
    
}

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/compiler/ws/Worker.x10"
::x10::compiler::ws::Worker* x10::compiler::ws::Worker::x10__compiler__ws__Worker____this__x10__compiler__ws__Worker(
  ) {
    return this;
    
}
void x10::compiler::ws::Worker::__fieldInitializers_x10_compiler_ws_Worker(
  ) {
    this->FMGL(deque) = ::x10::lang::Deque::_make();
    this->FMGL(fifo) = this->FMGL(deque);
    this->FMGL(lock) = ::x10::util::concurrent::Lock::_make();
    this->FMGL(throwable) = (::x10aux::class_cast_unchecked< ::x10::lang::Exception*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
const ::x10aux::serialization_id_t x10::compiler::ws::Worker::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::compiler::ws::Worker::_deserializer);

void x10::compiler::ws::Worker::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(workers));
    buf.write(this->FMGL(random));
    buf.write(this->FMGL(id));
    buf.write(this->FMGL(deque));
    buf.write(this->FMGL(fifo));
    buf.write(this->FMGL(lock));
    buf.write(this->FMGL(throwable));
    
}

::x10::lang::Reference* ::x10::compiler::ws::Worker::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::compiler::ws::Worker* this_ = new (::x10aux::alloc_z< ::x10::compiler::ws::Worker>()) ::x10::compiler::ws::Worker();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::compiler::ws::Worker::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(workers) = buf.read< ::x10::lang::Rail< ::x10::compiler::ws::Worker* >*>();
    FMGL(random) = buf.read< ::x10::util::Random*>();
    FMGL(id) = buf.read<x10_int>();
    FMGL(deque) = buf.read< ::x10::lang::Deque*>();
    FMGL(fifo) = buf.read< ::x10::lang::Deque*>();
    FMGL(lock) = buf.read< ::x10::util::concurrent::Lock*>();
    FMGL(throwable) = buf.read< ::x10::lang::Exception*>();
}

::x10aux::RuntimeType x10::compiler::ws::Worker::rtt;
void x10::compiler::ws::Worker::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.compiler.ws.Worker",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

::x10::lang::VoidFun_0_0::itable<x10_compiler_ws_Worker__closure__1>x10_compiler_ws_Worker__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_compiler_ws_Worker__closure__1::__apply, &x10_compiler_ws_Worker__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_compiler_ws_Worker__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_compiler_ws_Worker__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_compiler_ws_Worker__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_compiler_ws_Worker__closure__1::_deserialize);
const ::x10aux::serialization_id_t x10_compiler_ws_Worker__closure__1::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_compiler_ws_Worker__closure__1::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_compiler_ws_Worker__closure__2>x10_compiler_ws_Worker__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_compiler_ws_Worker__closure__2::__apply, &x10_compiler_ws_Worker__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_compiler_ws_Worker__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_compiler_ws_Worker__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_compiler_ws_Worker__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_compiler_ws_Worker__closure__2::_deserialize);
const ::x10aux::serialization_id_t x10_compiler_ws_Worker__closure__2::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_compiler_ws_Worker__closure__2::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_compiler_ws_Worker__closure__3>x10_compiler_ws_Worker__closure__3::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_compiler_ws_Worker__closure__3::__apply, &x10_compiler_ws_Worker__closure__3::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_compiler_ws_Worker__closure__3::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_compiler_ws_Worker__closure__3::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_compiler_ws_Worker__closure__3::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_compiler_ws_Worker__closure__3::_deserialize);
const ::x10aux::serialization_id_t x10_compiler_ws_Worker__closure__3::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_compiler_ws_Worker__closure__3::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_compiler_ws_Worker__closure__4>x10_compiler_ws_Worker__closure__4::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_compiler_ws_Worker__closure__4::__apply, &x10_compiler_ws_Worker__closure__4::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_compiler_ws_Worker__closure__4::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_compiler_ws_Worker__closure__4::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_compiler_ws_Worker__closure__4::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_compiler_ws_Worker__closure__4::_deserialize);
const ::x10aux::serialization_id_t x10_compiler_ws_Worker__closure__4::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_compiler_ws_Worker__closure__4::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

::x10::lang::VoidFun_0_0::itable<x10_compiler_ws_Worker__closure__5>x10_compiler_ws_Worker__closure__5::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_compiler_ws_Worker__closure__5::__apply, &x10_compiler_ws_Worker__closure__5::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_compiler_ws_Worker__closure__5::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_compiler_ws_Worker__closure__5::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_compiler_ws_Worker__closure__5::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_compiler_ws_Worker__closure__5::_deserialize);
const ::x10aux::serialization_id_t x10_compiler_ws_Worker__closure__5::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_compiler_ws_Worker__closure__5::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

/* END of Worker */
/*************************************************/
