#ifndef __X10_LANG_FINISHSTATE__REMOTEFINISHSKELETON_H
#define __X10_LANG_FINISHSTATE__REMOTEFINISHSKELETON_H

#include <x10rt.h>


#define X10_LANG_FINISHSTATE_H_NODEPS
#include <x10/lang/FinishState.h>
#undef X10_LANG_FINISHSTATE_H_NODEPS
#define X10_LANG_GLOBALREF_H_NODEPS
#include <x10/lang/GlobalRef.h>
#undef X10_LANG_GLOBALREF_H_NODEPS
#define X10_LANG_GLOBALREF_H_NODEPS
#include <x10/lang/GlobalRef.h>
#undef X10_LANG_GLOBALREF_H_NODEPS
namespace x10 { namespace util { namespace concurrent { 
class SimpleLatch;
} } } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
class VoidFun_0_0;
} } 
namespace x10 { namespace lang { 
class Runtime__Profile;
} } 
namespace x10 { namespace lang { 
class Runtime;
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

class FinishState__RemoteFinishSkeleton : public ::x10::lang::FinishState
  {
    public:
    RTT_H_DECLS_CLASS
    
    ::x10::lang::GlobalRef< ::x10::lang::FinishState* > FMGL(xxxx);
    
    void _constructor(::x10::lang::GlobalRef< ::x10::lang::FinishState* > root);
    
    virtual ::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref();
    virtual void waitForFinish();
    virtual ::x10::util::concurrent::SimpleLatch* simpleLatch();
    virtual void runAt(::x10::lang::Place place, ::x10::lang::VoidFun_0_0* body,
                       ::x10::lang::Runtime__Profile* prof);
    virtual ::x10::lang::Any* evalAt(::x10::lang::Place place, ::x10::lang::Fun_0_0< ::x10::lang::Any*>* body,
                                     ::x10::lang::Runtime__Profile* prof);
    virtual ::x10::lang::FinishState__RemoteFinishSkeleton* x10__lang__FinishState__RemoteFinishSkeleton____this__x10__lang__FinishState__RemoteFinishSkeleton(
      );
    virtual void __fieldInitializers_x10_lang_FinishState_RemoteFinishSkeleton(
      );
    
    // Serialization
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};


} } 
#endif // X10_LANG_FINISHSTATE__REMOTEFINISHSKELETON_H

namespace x10 { namespace lang { 
class FinishState__RemoteFinishSkeleton;
} } 

#ifndef X10_LANG_FINISHSTATE__REMOTEFINISHSKELETON_H_NODEPS
#define X10_LANG_FINISHSTATE__REMOTEFINISHSKELETON_H_NODEPS
#ifndef X10_LANG_FINISHSTATE__REMOTEFINISHSKELETON_H_GENERICS
#define X10_LANG_FINISHSTATE__REMOTEFINISHSKELETON_H_GENERICS
#endif // X10_LANG_FINISHSTATE__REMOTEFINISHSKELETON_H_GENERICS
#endif // __X10_LANG_FINISHSTATE__REMOTEFINISHSKELETON_H_NODEPS
