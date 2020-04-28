#ifndef __X10_LANG_RESILIENTSTORE_H
#define __X10_LANG_RESILIENTSTORE_H

#include <x10rt.h>


namespace x10 { namespace lang { 
class FinishResilient;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(K), class TPMGL(V)> class ResilientStorePlace0;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 

template<class TPMGL(K), class TPMGL(V)> class ResilientStore;
template <> class ResilientStore<void, void>;
template<class TPMGL(K), class TPMGL(V)> class ResilientStore : public ::x10::lang::X10Class
  {
    public:
    RTT_H_DECLS_CLASS
    
    virtual void create(TPMGL(K) key, TPMGL(V) value) = 0;
    virtual void put(TPMGL(K) key, TPMGL(V) value) = 0;
    virtual TPMGL(V) getOrElse(TPMGL(K) key, TPMGL(V) orelse) = 0;
    virtual void remove(TPMGL(K) key) = 0;
    virtual void lock() = 0;
    virtual void unlock() = 0;
    virtual ::x10::lang::ResilientStore<TPMGL(K), TPMGL(V)>* x10__lang__ResilientStore____this__x10__lang__ResilientStore(
      );
    void _constructor();
    
    virtual void __fieldInitializers_x10_lang_ResilientStore(
      );
    
    // Serialization
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

template<class TPMGL(K), class TPMGL(V)> ::x10aux::RuntimeType x10::lang::ResilientStore<TPMGL(K), TPMGL(V)>::rtt;
template<class TPMGL(K), class TPMGL(V)> void x10::lang::ResilientStore<TPMGL(K), TPMGL(V)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::lang::ResilientStore<void, void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    const ::x10aux::RuntimeType* params[2] = { ::x10aux::getRTT<TPMGL(K)>(), ::x10aux::getRTT<TPMGL(V)>()};
    ::x10aux::RuntimeType::Variance variances[2] = { ::x10aux::RuntimeType::invariant, ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.lang.ResilientStore";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 0, parents, 2, params, variances);
}

template <> class ResilientStore<void, void> : public ::x10::lang::X10Class
{
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    static x10_long FMGL(verbose);
    
    static void debug(::x10::lang::String* msg);
    
    template<class TPMGL(K), class TPMGL(V)> static ::x10::lang::ResilientStore<TPMGL(K), TPMGL(V)>*
      make(::x10::lang::Any* name);
    
    static void _kwd__delete(::x10::lang::Any* name);
    
    static void FMGL(verbose__do_init)();
    static void FMGL(verbose__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(verbose__status);
    static ::x10::lang::CheckedThrowable* FMGL(verbose__exception);
    static x10_long FMGL(verbose__get)();
    
};

} } 
#endif // X10_LANG_RESILIENTSTORE_H

namespace x10 { namespace lang { 
template<class TPMGL(K), class TPMGL(V)> class ResilientStore;
} } 

#ifndef X10_LANG_RESILIENTSTORE_H_NODEPS
#define X10_LANG_RESILIENTSTORE_H_NODEPS
#include <x10/lang/Long.h>
#include <x10/lang/FinishResilient.h>
#include <x10/lang/String.h>
#include <x10/lang/Any.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/ResilientStorePlace0.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_RESILIENTSTORE_H_GENERICS
#define X10_LANG_RESILIENTSTORE_H_GENERICS
inline x10_long x10::lang::ResilientStore<void, void>::FMGL(verbose__get)() {
    if (FMGL(verbose__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(verbose__init)();
    }
    return x10::lang::ResilientStore<void, void>::FMGL(verbose);
}

#endif // X10_LANG_RESILIENTSTORE_H_GENERICS
#ifndef X10_LANG_RESILIENTSTORE_H_IMPLEMENTATION
#define X10_LANG_RESILIENTSTORE_H_IMPLEMENTATION
#include <x10/lang/ResilientStore.h>


//#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"

//#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"

//#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"

//#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"

//#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"

//#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"

//#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"

//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"

//#line 13 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
template<class TPMGL(K), class TPMGL(V)> ::x10::lang::ResilientStore<TPMGL(K), TPMGL(V)>*
  x10::lang::ResilientStore<TPMGL(K), TPMGL(V)>::x10__lang__ResilientStore____this__x10__lang__ResilientStore(
  ) {
    return this;
    
}
template<class TPMGL(K), class TPMGL(V)> void x10::lang::ResilientStore<TPMGL(K), TPMGL(V)>::_constructor(
                                           ) {
    ::x10::lang::ResilientStore<TPMGL(K), TPMGL(V)>* this__104154 =
      this;
    
}

template<class TPMGL(K), class TPMGL(V)> void x10::lang::ResilientStore<TPMGL(K), TPMGL(V)>::__fieldInitializers_x10_lang_ResilientStore(
  ) {
 
}
template<class TPMGL(K), class TPMGL(V)> void x10::lang::ResilientStore<TPMGL(K), TPMGL(V)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

template<class TPMGL(K), class TPMGL(V)> void x10::lang::ResilientStore<TPMGL(K), TPMGL(V)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

template<class TPMGL(K), class TPMGL(V)> ::x10::lang::ResilientStore<TPMGL(K), TPMGL(V)>*
  x10::lang::ResilientStore<void, void>::make(::x10::lang::Any* name) {
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
    if (((::x10::lang::ResilientStore<void, void>::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        
        //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        ::x10::lang::String* msg__104150 = ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125694 = ::x10aux::makeStringLit("ResilientStore.make called, name="); strLit__125694; })), name);
        ::x10::lang::FinishResilient::debug(msg__104150);
    }
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
    ::x10::lang::ResilientStore<TPMGL(K), TPMGL(V)>* rs;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
    rs = ::x10::lang::ResilientStorePlace0<void, void>::template make< TPMGL(K),
         TPMGL(V) >(name);
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
    if (((::x10::lang::ResilientStore<void, void>::FMGL(verbose__get)()) >= (((x10_long)1ll))))
    {
        
        //#line 15 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
        ::x10::lang::String* msg__104151 = ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125695 = ::x10aux::makeStringLit("ResilientStore.make returning rs="); strLit__125695; })), rs);
        ::x10::lang::FinishResilient::debug(msg__104151);
    }
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStore.x10"
    return rs;
    
}
#endif // X10_LANG_RESILIENTSTORE_H_IMPLEMENTATION
#endif // __X10_LANG_RESILIENTSTORE_H_NODEPS
