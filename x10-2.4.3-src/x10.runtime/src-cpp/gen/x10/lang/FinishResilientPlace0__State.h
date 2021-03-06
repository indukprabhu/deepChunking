#ifndef __X10_LANG_FINISHRESILIENTPLACE0__STATE_H
#define __X10_LANG_FINISHRESILIENTPLACE0__STATE_H

#include <x10rt.h>


#define X10_LANG_INT_H_NODEPS
#include <x10/lang/Int.h>
#undef X10_LANG_INT_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_GLOBALREF_H_NODEPS
#include <x10/lang/GlobalRef.h>
#undef X10_LANG_GLOBALREF_H_NODEPS
#define X10_LANG_GLOBALREF_H_NODEPS
#include <x10/lang/GlobalRef.h>
#undef X10_LANG_GLOBALREF_H_NODEPS
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class GrowableRail;
} } 
namespace x10 { namespace lang { 
class Exception;
} } 
namespace x10 { namespace util { namespace concurrent { 
class SimpleLatch;
} } } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace util { 
class StringBuilder;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace lang { 
class FinishResilient;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 

class FinishResilientPlace0__State : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    ::x10::lang::Rail< x10_int >* FMGL(transit);
    
    ::x10::lang::Rail< x10_int >* FMGL(transitAdopted);
    
    ::x10::lang::Rail< x10_int >* FMGL(live);
    
    ::x10::lang::Rail< x10_int >* FMGL(liveAdopted);
    
    ::x10::util::GrowableRail< ::x10::lang::Exception*>* FMGL(excs);
    
    ::x10::util::GrowableRail<x10_long>* FMGL(children);
    
    x10_long FMGL(adopterId);
    
    virtual x10_boolean isAdopted();
    x10_long FMGL(numDead);
    
    x10_long FMGL(parentId);
    
    ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > FMGL(gLatch);
    
    void _constructor(x10_long parentId, ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > gLatch);
    
    static ::x10::lang::FinishResilientPlace0__State* _make(x10_long parentId,
                                                            ::x10::lang::GlobalRef< ::x10::util::concurrent::SimpleLatch* > gLatch);
    
    virtual void dump(::x10::lang::Any* msg);
    virtual ::x10::lang::FinishResilientPlace0__State* x10__lang__FinishResilientPlace0__State____this__x10__lang__FinishResilientPlace0__State(
      );
    virtual void __fieldInitializers_x10_lang_FinishResilientPlace0_State(
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
#endif // X10_LANG_FINISHRESILIENTPLACE0__STATE_H

namespace x10 { namespace lang { 
class FinishResilientPlace0__State;
} } 

#ifndef X10_LANG_FINISHRESILIENTPLACE0__STATE_H_NODEPS
#define X10_LANG_FINISHRESILIENTPLACE0__STATE_H_NODEPS
#ifndef X10_LANG_FINISHRESILIENTPLACE0__STATE_H_GENERICS
#define X10_LANG_FINISHRESILIENTPLACE0__STATE_H_GENERICS
#endif // X10_LANG_FINISHRESILIENTPLACE0__STATE_H_GENERICS
#endif // __X10_LANG_FINISHRESILIENTPLACE0__STATE_H_NODEPS
