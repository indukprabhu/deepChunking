#ifndef __X10_UTIL_CONCURRENT_SPMDBARRIER_H
#define __X10_UTIL_CONCURRENT_SPMDBARRIER_H

#include <x10rt.h>


#define X10_LANG_INT_H_NODEPS
#include <x10/lang/Int.h>
#undef X10_LANG_INT_H_NODEPS
#define X10_LANG_INT_H_NODEPS
#include <x10/lang/Int.h>
#undef X10_LANG_INT_H_NODEPS
namespace x10 { namespace util { namespace concurrent { 
class AtomicInteger;
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
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace util { namespace concurrent { 

class SPMDBarrier : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    x10_int FMGL(count);
    
    ::x10::util::concurrent::AtomicInteger* FMGL(alive);
    
    ::x10::lang::Rail< ::x10::lang::Runtime__Worker* >* FMGL(workers);
    
    ::x10::util::concurrent::AtomicInteger* FMGL(index);
    
    void _constructor(x10_int count);
    
    static ::x10::util::concurrent::SPMDBarrier* _make(x10_int count);
    
    virtual void _kwd__register();
    virtual void advance();
    virtual ::x10::util::concurrent::SPMDBarrier* x10__util__concurrent__SPMDBarrier____this__x10__util__concurrent__SPMDBarrier(
      );
    virtual void __fieldInitializers_x10_util_concurrent_SPMDBarrier(
      );
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};


} } } 
#endif // X10_UTIL_CONCURRENT_SPMDBARRIER_H

namespace x10 { namespace util { namespace concurrent { 
class SPMDBarrier;
} } } 

#ifndef X10_UTIL_CONCURRENT_SPMDBARRIER_H_NODEPS
#define X10_UTIL_CONCURRENT_SPMDBARRIER_H_NODEPS
#ifndef X10_UTIL_CONCURRENT_SPMDBARRIER_H_GENERICS
#define X10_UTIL_CONCURRENT_SPMDBARRIER_H_GENERICS
#endif // X10_UTIL_CONCURRENT_SPMDBARRIER_H_GENERICS
#endif // __X10_UTIL_CONCURRENT_SPMDBARRIER_H_NODEPS
