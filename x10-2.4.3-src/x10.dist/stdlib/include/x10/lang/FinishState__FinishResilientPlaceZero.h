#ifndef __X10_LANG_FINISHSTATE__FINISHRESILIENTPLACEZERO_H
#define __X10_LANG_FINISHSTATE__FINISHRESILIENTPLACEZERO_H

#include <x10rt.h>


#define X10_LANG_FINISHSTATE_H_NODEPS
#include <x10/lang/FinishState.h>
#undef X10_LANG_FINISHSTATE_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
namespace x10 { namespace lang { 
class Activity;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace util { namespace concurrent { 
class SimpleLatch;
} } } 
namespace x10 { namespace lang { 
class ResilientStorePlaceZero;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
class Exception;
} } 
namespace x10 { namespace lang { 
class VoidFun_0_0;
} } 
namespace x10 { namespace lang { 
class Runtime__Profile;
} } 
namespace x10 { namespace lang { 
class Activity__ClockPhases;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Cell;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class GlobalRef;
} } 
namespace x10 { namespace lang { 
class Runtime__AtCheckedWrapper;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace compiler { 
class RemoteInvocation;
} } 
namespace x10 { namespace lang { 
class Unsafe;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace lang { 
class MultipleExceptions;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace lang { 
class WrappedThrowable;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(U)> class Fun_0_0;
} } 
namespace x10 { namespace lang { 
class Empty;
} } 
namespace x10 { namespace compiler { 
class StackAllocate;
} } 
namespace x10 { namespace lang { 
class DeadPlaceException;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 

class FinishState__FinishResilientPlaceZero : public ::x10::lang::FinishState
  {
    public:
    RTT_H_DECLS_CLASS
    
    x10_long FMGL(id);
    
    static x10_long parentFinish();
    void _constructor(x10_long parent, ::x10::util::concurrent::SimpleLatch* latch);
    
    static ::x10::lang::FinishState__FinishResilientPlaceZero* _make(x10_long parent,
                                                                     ::x10::util::concurrent::SimpleLatch* latch);
    
    void _constructor(::x10::util::concurrent::SimpleLatch* latch);
    
    static ::x10::lang::FinishState__FinishResilientPlaceZero* _make(
             ::x10::util::concurrent::SimpleLatch* latch);
    
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
    virtual ::x10::lang::FinishState__FinishResilientPlaceZero*
      x10__lang__FinishState__FinishResilientPlaceZero____this__x10__lang__FinishState__FinishResilientPlaceZero(
      );
    virtual void __fieldInitializers_x10_lang_FinishState_FinishResilientPlaceZero(
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


} } 
#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTPLACEZERO_H

namespace x10 { namespace lang { 
class FinishState__FinishResilientPlaceZero;
} } 

#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTPLACEZERO_H_NODEPS
#define X10_LANG_FINISHSTATE__FINISHRESILIENTPLACEZERO_H_NODEPS
#ifndef X10_LANG_FINISHSTATE__FINISHRESILIENTPLACEZERO_H_GENERICS
#define X10_LANG_FINISHSTATE__FINISHRESILIENTPLACEZERO_H_GENERICS
#endif // X10_LANG_FINISHSTATE__FINISHRESILIENTPLACEZERO_H_GENERICS
#endif // __X10_LANG_FINISHSTATE__FINISHRESILIENTPLACEZERO_H_NODEPS
