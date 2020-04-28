#ifndef __X10_LANG_FINISHSTATE__REMOTEFINISHSPMD_H
#define __X10_LANG_FINISHSTATE__REMOTEFINISHSPMD_H

#include <x10rt.h>


#define X10_LANG_FINISHSTATE__REMOTEFINISHSKELETON_H_NODEPS
#include <x10/lang/FinishState__RemoteFinishSkeleton.h>
#undef X10_LANG_FINISHSTATE__REMOTEFINISHSKELETON_H_NODEPS
#define X10_UTIL_CONCURRENT_ATOMICINTEGER_H_NODEPS
#include <x10/util/concurrent/AtomicInteger.h>
#undef X10_UTIL_CONCURRENT_ATOMICINTEGER_H_NODEPS
#define X10_UTIL_CONCURRENT_LOCK_H_NODEPS
#include <x10/util/concurrent/Lock.h>
#undef X10_UTIL_CONCURRENT_LOCK_H_NODEPS
namespace x10 { namespace compiler { 
class Embed;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class GrowableRail;
} } 
namespace x10 { namespace lang { 
class Exception;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class GlobalRef;
} } 
namespace x10 { namespace lang { 
class FinishState;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace lang { 
class MultipleExceptions;
} } 
namespace x10 { namespace lang { 
class VoidFun_0_0;
} } 
namespace x10 { namespace compiler { 
class RemoteInvocation;
} } 
namespace x10 { namespace lang { 
class Runtime__Profile;
} } 
namespace x10 { namespace lang { 
class Unsafe;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 

class FinishState__RemoteFinishSPMD : public ::x10::lang::FinishState__RemoteFinishSkeleton
  {
    public:
    RTT_H_DECLS_CLASS
    
    ::x10::util::concurrent::AtomicInteger _Embed_count;
    ::x10::util::concurrent::AtomicInteger* FMGL(count);
    
    ::x10::util::GrowableRail< ::x10::lang::Exception*>* FMGL(exceptions);
    
    ::x10::util::concurrent::Lock _Embed_lock;
    ::x10::util::concurrent::Lock* FMGL(lock);
    
    void _constructor(::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref);
    
    static ::x10::lang::FinishState__RemoteFinishSPMD* _make(::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref);
    
    virtual void notifySubActivitySpawn(::x10::lang::Place place);
    virtual x10_boolean notifyActivityCreation(::x10::lang::Place srcPlace);
    virtual void notifyActivityTermination();
    virtual void pushException(::x10::lang::Exception* t);
    virtual ::x10::lang::FinishState__RemoteFinishSPMD* x10__lang__FinishState__RemoteFinishSPMD____this__x10__lang__FinishState__RemoteFinishSPMD(
      );
    virtual void __fieldInitializers_x10_lang_FinishState_RemoteFinishSPMD(
      );
    
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
#endif // X10_LANG_FINISHSTATE__REMOTEFINISHSPMD_H

namespace x10 { namespace lang { 
class FinishState__RemoteFinishSPMD;
} } 

#ifndef X10_LANG_FINISHSTATE__REMOTEFINISHSPMD_H_NODEPS
#define X10_LANG_FINISHSTATE__REMOTEFINISHSPMD_H_NODEPS
#ifndef X10_LANG_FINISHSTATE__REMOTEFINISHSPMD_H_GENERICS
#define X10_LANG_FINISHSTATE__REMOTEFINISHSPMD_H_GENERICS
#endif // X10_LANG_FINISHSTATE__REMOTEFINISHSPMD_H_GENERICS
#endif // __X10_LANG_FINISHSTATE__REMOTEFINISHSPMD_H_NODEPS
