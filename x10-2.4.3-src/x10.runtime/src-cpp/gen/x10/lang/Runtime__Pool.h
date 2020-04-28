#ifndef __X10_LANG_RUNTIME__POOL_H
#define __X10_LANG_RUNTIME__POOL_H

#include <x10rt.h>


#define X10_LANG_BOOLEAN_H_NODEPS
#include <x10/lang/Boolean.h>
#undef X10_LANG_BOOLEAN_H_NODEPS
#define X10_LANG_BOOLEAN_H_NODEPS
#include <x10/lang/Boolean.h>
#undef X10_LANG_BOOLEAN_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
namespace x10 { namespace util { namespace concurrent { 
class SimpleLatch;
} } } 
namespace x10 { namespace lang { 
class Runtime__Watcher;
} } 
namespace x10 { namespace lang { 
class Runtime__Workers;
} } 
namespace x10 { namespace lang { 
class Deque;
} } 
namespace x10 { namespace lang { 
class Thread;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace lang { 
class Runtime__Worker;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace lang { 
class Activity;
} } 
namespace x10 { namespace util { namespace concurrent { 
class Condition;
} } } 
namespace x10 { namespace util { 
class Random;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
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
class FinishResilient;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 

class Runtime__Pool : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    ::x10::util::concurrent::SimpleLatch* FMGL(latch);
    
    ::x10::lang::Runtime__Watcher* FMGL(watcher);
    
    x10_boolean FMGL(wsEnd);
    
    ::x10::lang::Runtime__Workers* FMGL(workers);
    
    ::x10::lang::Deque* FMGL(wsBlockedContinuations);
    
    virtual ::x10::lang::Runtime__Workers* getWorkers();
    x10_long FMGL(numDead);
    
    virtual void removeThreadLocalContexts();
    virtual void __apply(x10_int n);
    virtual void run();
    virtual void increase();
    virtual ::x10::lang::Runtime__Worker* wrapNativeThread();
    virtual void decrease(x10_int n);
    virtual x10_boolean deal(::x10::lang::Activity* activity);
    virtual void release();
    virtual ::x10::lang::Activity* scan(::x10::util::Random* random, ::x10::lang::Runtime__Worker* worker);
    virtual x10_int size();
    virtual ::x10::lang::Runtime__Pool* x10__lang__Runtime__Pool____this__x10__lang__Runtime__Pool(
      );
    void _constructor();
    
    static ::x10::lang::Runtime__Pool* _make();
    
    virtual void __fieldInitializers_x10_lang_Runtime_Pool();
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: virtual ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};


} } 
#endif // X10_LANG_RUNTIME__POOL_H

namespace x10 { namespace lang { 
class Runtime__Pool;
} } 

#ifndef X10_LANG_RUNTIME__POOL_H_NODEPS
#define X10_LANG_RUNTIME__POOL_H_NODEPS
#ifndef X10_LANG_RUNTIME__POOL_H_GENERICS
#define X10_LANG_RUNTIME__POOL_H_GENERICS
#endif // X10_LANG_RUNTIME__POOL_H_GENERICS
#endif // __X10_LANG_RUNTIME__POOL_H_NODEPS
