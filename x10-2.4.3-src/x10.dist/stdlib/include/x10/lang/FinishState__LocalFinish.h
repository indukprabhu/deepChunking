#ifndef __X10_LANG_FINISHSTATE__LOCALFINISH_H
#define __X10_LANG_FINISHSTATE__LOCALFINISH_H

#include <x10rt.h>


#define X10_LANG_FINISHSTATE_H_NODEPS
#include <x10/lang/FinishState.h>
#undef X10_LANG_FINISHSTATE_H_NODEPS
#define X10_UTIL_CONCURRENT_ATOMICINTEGER_H_NODEPS
#include <x10/util/concurrent/AtomicInteger.h>
#undef X10_UTIL_CONCURRENT_ATOMICINTEGER_H_NODEPS
#define X10_UTIL_CONCURRENT_SIMPLELATCH_H_NODEPS
#include <x10/util/concurrent/SimpleLatch.h>
#undef X10_UTIL_CONCURRENT_SIMPLELATCH_H_NODEPS
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
class Place;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace util { namespace concurrent { 
class Lock;
} } } 
namespace x10 { namespace lang { 
class Runtime__Worker;
} } 
namespace x10 { namespace lang { 
class Thread;
} } 
namespace x10 { namespace lang { 
class MultipleExceptions;
} } 
namespace x10 { namespace lang { 
class VoidFun_0_0;
} } 
namespace x10 { namespace lang { 
class Runtime__Profile;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(U)> class Fun_0_0;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 

class FinishState__LocalFinish : public ::x10::lang::FinishState   {
    public:
    RTT_H_DECLS_CLASS
    
    ::x10::util::concurrent::AtomicInteger _Embed_count;
    ::x10::util::concurrent::AtomicInteger* FMGL(count);
    
    ::x10::util::concurrent::SimpleLatch _Embed_latch;
    ::x10::util::concurrent::SimpleLatch* FMGL(latch);
    
    ::x10::util::GrowableRail< ::x10::lang::Exception*>* FMGL(exceptions);
    
    virtual void notifySubActivitySpawn(::x10::lang::Place place);
    virtual x10_boolean notifyActivityCreation(::x10::lang::Place srcPlace);
    virtual void notifyActivityTermination();
    virtual void pushException(::x10::lang::Exception* t);
    virtual void waitForFinish();
    virtual ::x10::util::concurrent::SimpleLatch* simpleLatch();
    virtual void runAt(::x10::lang::Place place, ::x10::lang::VoidFun_0_0* body,
                       ::x10::lang::Runtime__Profile* prof);
    virtual ::x10::lang::Any* evalAt(::x10::lang::Place place, ::x10::lang::Fun_0_0< ::x10::lang::Any*>* body,
                                     ::x10::lang::Runtime__Profile* prof);
    virtual ::x10::lang::FinishState__LocalFinish* x10__lang__FinishState__LocalFinish____this__x10__lang__FinishState__LocalFinish(
      );
    void _constructor();
    
    static ::x10::lang::FinishState__LocalFinish* _make();
    
    virtual void __fieldInitializers_x10_lang_FinishState_LocalFinish(
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
#endif // X10_LANG_FINISHSTATE__LOCALFINISH_H

namespace x10 { namespace lang { 
class FinishState__LocalFinish;
} } 

#ifndef X10_LANG_FINISHSTATE__LOCALFINISH_H_NODEPS
#define X10_LANG_FINISHSTATE__LOCALFINISH_H_NODEPS
#ifndef X10_LANG_FINISHSTATE__LOCALFINISH_H_GENERICS
#define X10_LANG_FINISHSTATE__LOCALFINISH_H_GENERICS
#endif // X10_LANG_FINISHSTATE__LOCALFINISH_H_GENERICS
#endif // __X10_LANG_FINISHSTATE__LOCALFINISH_H_NODEPS
