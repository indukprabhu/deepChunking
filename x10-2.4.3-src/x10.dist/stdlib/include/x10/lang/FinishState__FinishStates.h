#ifndef __X10_LANG_FINISHSTATE__FINISHSTATES_H
#define __X10_LANG_FINISHSTATE__FINISHSTATES_H

#include <x10rt.h>


#define X10_LANG_GLOBALREF_H_NODEPS
#include <x10/lang/GlobalRef.h>
#undef X10_LANG_GLOBALREF_H_NODEPS
#define X10_UTIL_CONCURRENT_LOCK_H_NODEPS
#include <x10/util/concurrent/Lock.h>
#undef X10_UTIL_CONCURRENT_LOCK_H_NODEPS
namespace x10 { namespace util { 
template<class TPMGL(K), class TPMGL(V)> class HashMap;
} } 
namespace x10 { namespace lang { 
class FinishState;
} } 
namespace x10 { namespace compiler { 
class Embed;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(U)> class Fun_0_0;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class Box;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 

class FinishState__FinishStates : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    ::x10::util::HashMap< ::x10::lang::GlobalRef< ::x10::lang::FinishState* >, ::x10::lang::FinishState*>*
      FMGL(map);
    
    ::x10::util::concurrent::Lock _Embed_lock;
    ::x10::util::concurrent::Lock* FMGL(lock);
    
    virtual ::x10::lang::FinishState* __apply(::x10::lang::GlobalRef< ::x10::lang::FinishState* > root,
                                              ::x10::lang::Fun_0_0< ::x10::lang::FinishState*>* factory);
    virtual void remove(::x10::lang::GlobalRef< ::x10::lang::FinishState* > root);
    virtual ::x10::lang::FinishState__FinishStates* x10__lang__FinishState__FinishStates____this__x10__lang__FinishState__FinishStates(
      );
    void _constructor();
    
    static ::x10::lang::FinishState__FinishStates* _make(
             );
    
    virtual void __fieldInitializers_x10_lang_FinishState_FinishStates(
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
#endif // X10_LANG_FINISHSTATE__FINISHSTATES_H

namespace x10 { namespace lang { 
class FinishState__FinishStates;
} } 

#ifndef X10_LANG_FINISHSTATE__FINISHSTATES_H_NODEPS
#define X10_LANG_FINISHSTATE__FINISHSTATES_H_NODEPS
#ifndef X10_LANG_FINISHSTATE__FINISHSTATES_H_GENERICS
#define X10_LANG_FINISHSTATE__FINISHSTATES_H_GENERICS
#endif // X10_LANG_FINISHSTATE__FINISHSTATES_H_GENERICS
#endif // __X10_LANG_FINISHSTATE__FINISHSTATES_H_NODEPS
