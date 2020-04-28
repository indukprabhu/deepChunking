#ifndef __X10_LANG_FINISHSTATE__ROOTFINISHSKELETON_H
#define __X10_LANG_FINISHSTATE__ROOTFINISHSKELETON_H

#include <x10rt.h>


#define X10_LANG_FINISHSTATE_H_NODEPS
#include <x10/lang/FinishState.h>
#undef X10_LANG_FINISHSTATE_H_NODEPS
#define X10_LANG_RUNTIME__MORTAL_H_NODEPS
#include <x10/lang/Runtime__Mortal.h>
#undef X10_LANG_RUNTIME__MORTAL_H_NODEPS
#define X10_LANG_GLOBALREF_H_NODEPS
#include <x10/lang/GlobalRef.h>
#undef X10_LANG_GLOBALREF_H_NODEPS
#define X10_LANG_GLOBALREF_H_NODEPS
#include <x10/lang/GlobalRef.h>
#undef X10_LANG_GLOBALREF_H_NODEPS
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

class FinishState__RootFinishSkeleton : public ::x10::lang::FinishState   {
    public:
    RTT_H_DECLS_CLASS
    
    virtual x10_boolean _isMortal() { return true; }
    
    ::x10::lang::GlobalRef< ::x10::lang::FinishState* > FMGL(xxxx);
    
    virtual ::x10::lang::GlobalRef< ::x10::lang::FinishState* > ref();
    virtual x10_boolean notifyActivityCreation(::x10::lang::Place srcPlace);
    virtual void runAt(::x10::lang::Place place, ::x10::lang::VoidFun_0_0* body,
                       ::x10::lang::Runtime__Profile* prof);
    virtual ::x10::lang::Any* evalAt(::x10::lang::Place place, ::x10::lang::Fun_0_0< ::x10::lang::Any*>* body,
                                     ::x10::lang::Runtime__Profile* prof);
    virtual ::x10::lang::FinishState__RootFinishSkeleton* x10__lang__FinishState__RootFinishSkeleton____this__x10__lang__FinishState__RootFinishSkeleton(
      );
    void _constructor();
    
    virtual void __fieldInitializers_x10_lang_FinishState_RootFinishSkeleton(
      );
    
    // Serialization
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};


} } 
#endif // X10_LANG_FINISHSTATE__ROOTFINISHSKELETON_H

namespace x10 { namespace lang { 
class FinishState__RootFinishSkeleton;
} } 

#ifndef X10_LANG_FINISHSTATE__ROOTFINISHSKELETON_H_NODEPS
#define X10_LANG_FINISHSTATE__ROOTFINISHSKELETON_H_NODEPS
#ifndef X10_LANG_FINISHSTATE__ROOTFINISHSKELETON_H_GENERICS
#define X10_LANG_FINISHSTATE__ROOTFINISHSKELETON_H_GENERICS
#endif // X10_LANG_FINISHSTATE__ROOTFINISHSKELETON_H_GENERICS
#endif // __X10_LANG_FINISHSTATE__ROOTFINISHSKELETON_H_NODEPS
