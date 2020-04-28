#ifndef __X10_LANG_FINISHSTATE__ROOTFINISHASYNC_H
#define __X10_LANG_FINISHSTATE__ROOTFINISHASYNC_H

#include <x10rt.h>


#define X10_LANG_FINISHSTATE__ROOTFINISHSKELETON_H_NODEPS
#include <x10/lang/FinishState__RootFinishSkeleton.h>
#undef X10_LANG_FINISHSTATE__ROOTFINISHSKELETON_H_NODEPS
#define X10_UTIL_CONCURRENT_SIMPLELATCH_H_NODEPS
#include <x10/util/concurrent/SimpleLatch.h>
#undef X10_UTIL_CONCURRENT_SIMPLELATCH_H_NODEPS
namespace x10 { namespace compiler { 
class Embed;
} } 
namespace x10 { namespace lang { 
class Exception;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
class MultipleExceptions;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 

class FinishState__RootFinishAsync : public ::x10::lang::FinishState__RootFinishSkeleton
  {
    public:
    RTT_H_DECLS_CLASS
    
    static ::x10aux::itable_entry _itables[3];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static ::x10::lang::Runtime__Mortal::itable< ::x10::lang::FinishState__RootFinishAsync > _itable_0;
    
    static ::x10::lang::Any::itable< ::x10::lang::FinishState__RootFinishAsync > _itable_1;
    
    virtual x10_boolean _isMortal() { return true; }
    
    ::x10::util::concurrent::SimpleLatch _Embed_latch;
    ::x10::util::concurrent::SimpleLatch* FMGL(latch);
    
    ::x10::lang::Exception* FMGL(exception);
    
    virtual void notifySubActivitySpawn(::x10::lang::Place place);
    virtual void notifyActivityTermination();
    virtual void pushException(::x10::lang::Exception* t);
    virtual void waitForFinish();
    virtual ::x10::util::concurrent::SimpleLatch* simpleLatch();
    virtual ::x10::lang::FinishState__RootFinishAsync* x10__lang__FinishState__RootFinishAsync____this__x10__lang__FinishState__RootFinishAsync(
      );
    void _constructor();
    
    static ::x10::lang::FinishState__RootFinishAsync* _make(
             );
    
    virtual void __fieldInitializers_x10_lang_FinishState_RootFinishAsync(
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
#endif // X10_LANG_FINISHSTATE__ROOTFINISHASYNC_H

namespace x10 { namespace lang { 
class FinishState__RootFinishAsync;
} } 

#ifndef X10_LANG_FINISHSTATE__ROOTFINISHASYNC_H_NODEPS
#define X10_LANG_FINISHSTATE__ROOTFINISHASYNC_H_NODEPS
#ifndef X10_LANG_FINISHSTATE__ROOTFINISHASYNC_H_GENERICS
#define X10_LANG_FINISHSTATE__ROOTFINISHASYNC_H_GENERICS
#endif // X10_LANG_FINISHSTATE__ROOTFINISHASYNC_H_GENERICS
#endif // __X10_LANG_FINISHSTATE__ROOTFINISHASYNC_H_NODEPS
