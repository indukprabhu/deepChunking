#ifndef __X10_LANG_RUNTIME__WORKER_H
#define __X10_LANG_RUNTIME__WORKER_H

#include <x10rt.h>


#define X10_LANG_THREAD_H_NODEPS
#include <x10/lang/Thread.h>
#undef X10_LANG_THREAD_H_NODEPS
#define X10_IO_UNSERIALIZABLE_H_NODEPS
#include <x10/io/Unserializable.h>
#undef X10_IO_UNSERIALIZABLE_H_NODEPS
#define X10_LANG_INT_H_NODEPS
#include <x10/lang/Int.h>
#undef X10_LANG_INT_H_NODEPS
#define X10_LANG_INT_H_NODEPS
#include <x10/lang/Int.h>
#undef X10_LANG_INT_H_NODEPS
namespace x10 { namespace lang { 
class Activity;
} } 
namespace x10 { namespace lang { 
class Deque;
} } 
namespace x10 { namespace util { 
class Random;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
class FinishState;
} } 
namespace x10 { namespace lang { 
class FinishState__UncountedFinish;
} } 
namespace x10 { namespace lang { 
class VoidFun_0_0;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace compiler { 
class Finalization;
} } 
namespace x10 { namespace compiler { 
class Abort;
} } 
namespace x10 { namespace compiler { 
class CompilerFlags;
} } 
namespace x10 { namespace lang { 
class Runtime__Pool;
} } 
namespace x10 { namespace lang { 
class Unsafe;
} } 
namespace x10 { namespace util { namespace concurrent { 
class SimpleLatch;
} } } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 

class Runtime__Worker : public ::x10::lang::Thread   {
    public:
    RTT_H_DECLS_CLASS
    
    static ::x10aux::itable_entry _itables[3];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static ::x10::io::Unserializable::itable< ::x10::lang::Runtime__Worker > _itable_0;
    
    static ::x10::lang::Any::itable< ::x10::lang::Runtime__Worker > _itable_1;
    
    static x10_int FMGL(BOUND);
    static void FMGL(BOUND__do_init)();
    static void FMGL(BOUND__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(BOUND__status);
    static ::x10::lang::CheckedThrowable* FMGL(BOUND__exception);
    static x10_int FMGL(BOUND__get)();
    
    ::x10::lang::Activity* FMGL(activity);
    
    ::x10::lang::Deque* FMGL(queue);
    
    ::x10::util::Random* FMGL(random);
    
    x10_int FMGL(workerId);
    
    ::x10::lang::Deque* FMGL(wsfifo);
    
    void _constructor(x10_int workerId);
    
    static ::x10::lang::Runtime__Worker* _make(x10_int workerId);
    
    void _constructor(x10_int workerId, x10_boolean dummy);
    
    static ::x10::lang::Runtime__Worker* _make(x10_int workerId, x10_boolean dummy);
    
    virtual x10_int size();
    virtual ::x10::lang::Activity* activity();
    virtual ::x10::lang::Activity* poll();
    virtual ::x10::lang::Activity* steal();
    virtual void push(::x10::lang::Activity* activity);
    virtual void __apply();
    x10_boolean loop();
    virtual void probe();
    virtual void join(::x10::util::concurrent::SimpleLatch* latch);
    x10_boolean loop2(::x10::util::concurrent::SimpleLatch* latch);
    static void park();
    virtual void unpark();
    virtual ::x10::lang::Runtime__Worker* x10__lang__Runtime__Worker____this__x10__lang__Runtime__Worker(
      );
    virtual void __fieldInitializers_x10_lang_Runtime_Worker();
    
    // Serialization
    virtual void _serialize_body(::x10aux::serialization_buffer& buf) {
        ::x10aux::throwNotSerializableException("Can't serialize x10.lang.Runtime$Worker");
    }
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        ::x10aux::throwNotSerializableException("Can't serialize x10.lang.Runtime$Worker");
    }
    
    
};


} } 
#endif // X10_LANG_RUNTIME__WORKER_H

namespace x10 { namespace lang { 
class Runtime__Worker;
} } 

#ifndef X10_LANG_RUNTIME__WORKER_H_NODEPS
#define X10_LANG_RUNTIME__WORKER_H_NODEPS
#ifndef X10_LANG_RUNTIME__WORKER_H_GENERICS
#define X10_LANG_RUNTIME__WORKER_H_GENERICS
inline x10_int x10::lang::Runtime__Worker::FMGL(BOUND__get)() {
    if (FMGL(BOUND__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(BOUND__init)();
    }
    return x10::lang::Runtime__Worker::FMGL(BOUND);
}

#endif // X10_LANG_RUNTIME__WORKER_H_GENERICS
#endif // __X10_LANG_RUNTIME__WORKER_H_NODEPS
