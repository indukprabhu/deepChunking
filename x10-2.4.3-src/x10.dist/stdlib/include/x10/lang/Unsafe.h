#ifndef __X10_LANG_UNSAFE_H
#define __X10_LANG_UNSAFE_H

#include <x10rt.h>

#include "x10/lang/UnsafeNatives.h"

namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace compiler { 
class Native;
} } 
namespace x10 { namespace compiler { 
class Inline;
} } 
namespace x10 { namespace lang { 
class UnsupportedOperationException;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class GlobalRef;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class GlobalRail;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace compiler { 
class NativeCPPInclude;
} } 
namespace x10 { namespace lang { 

class Unsafe : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    template<class TPMGL(T)> static TPMGL(T) uncheckedRailApply(::x10::lang::Rail< TPMGL(T) >* r,
                                                                x10_long i);
    template<class TPMGL(T)> static TPMGL(T) uncheckedRailSet(::x10::lang::Rail< TPMGL(T) >* r,
                                                              x10_long i,
                                                              TPMGL(T) v);
    template<class TPMGL(T)> static void dealloc(TPMGL(T) o);
    template<class TPMGL(T)> static ::x10::lang::Rail< TPMGL(T) >*
      getCongruentSibling(::x10::lang::Rail< TPMGL(T) >* r,
                          x10_long dst);
    template<class TPMGL(T)> static ::x10::lang::GlobalRail<TPMGL(T)>
      getCongruentSibling(::x10::lang::Rail< TPMGL(T) >* r,
                          ::x10::lang::Place dst);
    virtual ::x10::lang::Unsafe* x10__lang__Unsafe____this__x10__lang__Unsafe(
      );
    void _constructor();
    
    static ::x10::lang::Unsafe* _make();
    
    virtual void __fieldInitializers_x10_lang_Unsafe();
    
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
#endif // X10_LANG_UNSAFE_H

namespace x10 { namespace lang { 
class Unsafe;
} } 

#ifndef X10_LANG_UNSAFE_H_NODEPS
#define X10_LANG_UNSAFE_H_NODEPS
#include <x10/lang/Long.h>
#include <x10/lang/Rail.h>
#include <x10/compiler/Native.h>
#include <x10/compiler/Inline.h>
#include <x10/lang/UnsupportedOperationException.h>
#include <x10/lang/Place.h>
#include <x10/lang/GlobalRef.h>
#include <x10/lang/GlobalRail.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeCPPInclude.h>
#ifndef X10_LANG_UNSAFE_H_GENERICS
#define X10_LANG_UNSAFE_H_GENERICS
#ifndef X10_LANG_UNSAFE_H_uncheckedRailApply_1774
#define X10_LANG_UNSAFE_H_uncheckedRailApply_1774
template<class TPMGL(T)> TPMGL(T) x10::lang::Unsafe::uncheckedRailApply(::x10::lang::Rail< TPMGL(T) >* r,
                                                                        x10_long i){
    return (r)->unchecked_apply(i);
}
#endif // X10_LANG_UNSAFE_H_uncheckedRailApply_1774
#ifndef X10_LANG_UNSAFE_H_uncheckedRailSet_1775
#define X10_LANG_UNSAFE_H_uncheckedRailSet_1775
template<class TPMGL(T)> TPMGL(T) x10::lang::Unsafe::uncheckedRailSet(
  ::x10::lang::Rail< TPMGL(T) >* r, x10_long i, TPMGL(T) v){
    return (r)->unchecked_set(i, v);
}
#endif // X10_LANG_UNSAFE_H_uncheckedRailSet_1775
#ifndef X10_LANG_UNSAFE_H_dealloc_1776
#define X10_LANG_UNSAFE_H_dealloc_1776
template<class TPMGL(T)> void x10::lang::Unsafe::dealloc(TPMGL(T) o){
    ::x10aux::dealloc(o);
}
#endif // X10_LANG_UNSAFE_H_dealloc_1776
#ifndef X10_LANG_UNSAFE_H_getCongruentSibling_1777
#define X10_LANG_UNSAFE_H_getCongruentSibling_1777
template<class TPMGL(T)> ::x10::lang::Rail< TPMGL(T) >* x10::lang::Unsafe::getCongruentSibling(
  ::x10::lang::Rail< TPMGL(T) >* r, x10_long dst){
    return ::x10::lang::UnsafeNatives::getCongruentSibling(r, dst);
}
#endif // X10_LANG_UNSAFE_H_getCongruentSibling_1777
#ifndef X10_LANG_UNSAFE_H_getCongruentSibling_1778
#define X10_LANG_UNSAFE_H_getCongruentSibling_1778
template<class TPMGL(T)> ::x10::lang::GlobalRail<TPMGL(T)>
  x10::lang::Unsafe::getCongruentSibling(::x10::lang::Rail< TPMGL(T) >* r,
                                         ::x10::lang::Place dst) {
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
    ::x10::lang::Rail< TPMGL(T) >* remoteRail = ::x10::lang::UnsafeNatives::getCongruentSibling(r, dst->FMGL(id));
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
    ::x10::lang::GlobalRef< ::x10::lang::Rail< TPMGL(T) >* > globalRef =
      ::x10::lang::GlobalRef< ::x10::lang::Rail< TPMGL(T) >* >((::x10aux::place)((dst).FMGL(id)), (x10_ulong)(remoteRail));
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
    ::x10::lang::GlobalRail<TPMGL(T)> globalRail =  ::x10::lang::GlobalRail<TPMGL(T)>::_alloc();
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    x10_long size__104660 = (x10_long)(::x10aux::nullCheck(r)->FMGL(size));
    ::x10::lang::GlobalRef< ::x10::lang::Rail< TPMGL(T) >* > raw__104661 =
      globalRef;
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/GlobalRail.x10"
    globalRail->FMGL(size) = size__104660;
    globalRail->FMGL(rail) = raw__104661;
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Unsafe.x10"
    return globalRail;
    
}
#endif // X10_LANG_UNSAFE_H_getCongruentSibling_1778
#endif // X10_LANG_UNSAFE_H_GENERICS
#endif // __X10_LANG_UNSAFE_H_NODEPS
