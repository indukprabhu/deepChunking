#ifndef __X10_LANG_FINISHSTATE__REMOTEFINISHASYNC_H
#define __X10_LANG_FINISHSTATE__REMOTEFINISHASYNC_H

#include <x10rt.h>


#define X10_LANG_FINISHSTATE__REMOTEFINISHSKELETON_H_NODEPS
#include <x10/lang/FinishState__RemoteFinishSkeleton.h>
#undef X10_LANG_FINISHSTATE__REMOTEFINISHSKELETON_H_NODEPS
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
class Runtime;
} } 
namespace x10 { namespace lang { 
class Unsafe;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 

class FinishState__RemoteFinishAsync : public ::x10::lang::FinishState__RemoteFinishSkeleton
  {
    public:
    RTT_H_DECLS_CLASS
    
    ::x10::lang::Exception* FMGL(exception);
    
    void _constructor(::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref);
    
    static ::x10::lang::FinishState__RemoteFinishAsync* _make(::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref);
    
    virtual x10_boolean notifyActivityCreation(::x10::lang::Place srcPlace);
    virtual void notifySubActivitySpawn(::x10::lang::Place place);
    virtual void pushException(::x10::lang::Exception* t);
    virtual void notifyActivityTermination();
    virtual ::x10::lang::FinishState__RemoteFinishAsync* x10__lang__FinishState__RemoteFinishAsync____this__x10__lang__FinishState__RemoteFinishAsync(
      );
    virtual void __fieldInitializers_x10_lang_FinishState_RemoteFinishAsync(
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
#endif // X10_LANG_FINISHSTATE__REMOTEFINISHASYNC_H

namespace x10 { namespace lang { 
class FinishState__RemoteFinishAsync;
} } 

#ifndef X10_LANG_FINISHSTATE__REMOTEFINISHASYNC_H_NODEPS
#define X10_LANG_FINISHSTATE__REMOTEFINISHASYNC_H_NODEPS
#ifndef X10_LANG_FINISHSTATE__REMOTEFINISHASYNC_H_GENERICS
#define X10_LANG_FINISHSTATE__REMOTEFINISHASYNC_H_GENERICS
#endif // X10_LANG_FINISHSTATE__REMOTEFINISHASYNC_H_GENERICS
#endif // __X10_LANG_FINISHSTATE__REMOTEFINISHASYNC_H_NODEPS
