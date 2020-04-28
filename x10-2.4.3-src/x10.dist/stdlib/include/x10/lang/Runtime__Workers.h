#ifndef __X10_LANG_RUNTIME__WORKERS_H
#define __X10_LANG_RUNTIME__WORKERS_H

#include <x10rt.h>


#define X10_LANG_INT_H_NODEPS
#include <x10/lang/Int.h>
#undef X10_LANG_INT_H_NODEPS
#define X10_LANG_INT_H_NODEPS
#include <x10/lang/Int.h>
#undef X10_LANG_INT_H_NODEPS
#define X10_LANG_BOOLEAN_H_NODEPS
#include <x10/lang/Boolean.h>
#undef X10_LANG_BOOLEAN_H_NODEPS
#define X10_LANG_BOOLEAN_H_NODEPS
#include <x10/lang/Boolean.h>
#undef X10_LANG_BOOLEAN_H_NODEPS
namespace x10 { namespace util { namespace concurrent { 
class Lock;
} } } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace lang { 
class Runtime__Worker;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace lang { 
class Thread;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
class InternalError;
} } 
namespace x10 { namespace lang { 
class Exception;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace lang { 
class Activity;
} } 
namespace x10 { namespace lang { 
class Deque;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 

class Runtime__Workers : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    ::x10::util::concurrent::Lock* FMGL(lock);
    
    ::x10::lang::Rail< ::x10::lang::Runtime__Worker* >* FMGL(workers);
    
    ::x10::lang::Rail< ::x10::lang::Runtime__Worker* >* FMGL(parkedWorkers);
    
    x10_int FMGL(count);
    
    x10_int FMGL(spareCount);
    
    x10_int FMGL(idleCount);
    
    x10_int FMGL(deadCount);
    
    x10_int FMGL(spareNeeded);
    
    x10_boolean FMGL(multiplace);
    
    x10_boolean FMGL(busyWaiting);
    
    x10_boolean FMGL(probing);
    
    virtual void reduce(x10_int n);
    virtual x10_int increase();
    virtual x10_int promote();
    virtual void check(x10_int new_count);
    virtual void convert();
    virtual ::x10::lang::Activity* yield(::x10::lang::Runtime__Worker* worker);
    virtual ::x10::lang::Activity* take(::x10::lang::Runtime__Worker* worker);
    virtual void wakeup();
    virtual x10_boolean give(::x10::lang::Activity* activity);
    virtual void reclaim();
    virtual ::x10::lang::Runtime__Worker* __apply(x10_int i);
    virtual void __set(x10_int i, ::x10::lang::Runtime__Worker* worker);
    virtual ::x10::lang::Runtime__Workers* x10__lang__Runtime__Workers____this__x10__lang__Runtime__Workers(
      );
    void _constructor();
    
    static ::x10::lang::Runtime__Workers* _make();
    
    virtual void __fieldInitializers_x10_lang_Runtime_Workers();
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};


} } 
#endif // X10_LANG_RUNTIME__WORKERS_H

namespace x10 { namespace lang { 
class Runtime__Workers;
} } 

#ifndef X10_LANG_RUNTIME__WORKERS_H_NODEPS
#define X10_LANG_RUNTIME__WORKERS_H_NODEPS
#ifndef X10_LANG_RUNTIME__WORKERS_H_GENERICS
#define X10_LANG_RUNTIME__WORKERS_H_GENERICS
#endif // X10_LANG_RUNTIME__WORKERS_H_GENERICS
#endif // __X10_LANG_RUNTIME__WORKERS_H_NODEPS
