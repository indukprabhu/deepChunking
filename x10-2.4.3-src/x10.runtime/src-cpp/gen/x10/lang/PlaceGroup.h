#ifndef __X10_LANG_PLACEGROUP_H
#define __X10_LANG_PLACEGROUP_H

#include <x10rt.h>


#define X10_LANG_ITERABLE_H_NODEPS
#include <x10/lang/Iterable.h>
#undef X10_LANG_ITERABLE_H_NODEPS
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
class PlaceGroup__SimplePlaceGroup;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace lang { 
class VoidFun_0_0;
} } 
namespace x10 { namespace io { 
class Serializer;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace lang { 
class FinishState;
} } 
namespace x10 { namespace compiler { 
class Pragma;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Iterator;
} } 
namespace x10 { namespace io { 
class Deserializer;
} } 
namespace x10 { namespace lang { 
class Error;
} } 
namespace x10 { namespace lang { 
class Exception;
} } 
namespace x10 { namespace compiler { 
class AsyncClosure;
} } 
namespace x10 { namespace lang { 
class Runtime__Profile;
} } 
namespace x10 { namespace compiler { 
class Finalization;
} } 
namespace x10 { namespace compiler { 
class Abort;
} } 
namespace x10 { namespace compiler { 
class CompilerFlags;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(Z1), class TPMGL(U)> class Fun_0_1;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 

class PlaceGroup : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    static ::x10::lang::PlaceGroup__SimplePlaceGroup* FMGL(WORLD);
    static void FMGL(WORLD__do_init)();
    static void FMGL(WORLD__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(WORLD__status);
    static ::x10::lang::CheckedThrowable* FMGL(WORLD__exception);
    static ::x10::lang::PlaceGroup__SimplePlaceGroup* FMGL(WORLD__get)();
    
    x10_long size();
    virtual x10_long numPlaces() = 0;
    virtual x10_boolean contains(::x10::lang::Place place);
    virtual x10_boolean contains(x10_long id) = 0;
    virtual x10_long indexOf(::x10::lang::Place place);
    virtual x10_long indexOf(x10_long id) = 0;
    virtual ::x10::lang::Place __apply(x10_long i) = 0;
    virtual x10_boolean equals(::x10::lang::Any* thatObj);
    virtual void broadcastFlat(::x10::lang::VoidFun_0_0* cl);
    virtual void broadcastFlat(::x10::lang::VoidFun_0_0* cl, ::x10::lang::Fun_0_1< ::x10::lang::Place, x10_boolean>* ignoreIfDead);
    static ::x10::lang::PlaceGroup__SimplePlaceGroup* make(x10_long numPlaces);
    virtual ::x10::lang::PlaceGroup* x10__lang__PlaceGroup____this__x10__lang__PlaceGroup(
      );
    void _constructor();
    
    virtual ::x10::lang::Iterator< ::x10::lang::Place>* iterator(
      ) = 0;
    virtual void __fieldInitializers_x10_lang_PlaceGroup();
    
    // Serialization
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};


} } 
#endif // X10_LANG_PLACEGROUP_H

namespace x10 { namespace lang { 
class PlaceGroup;
} } 

#ifndef X10_LANG_PLACEGROUP_H_NODEPS
#define X10_LANG_PLACEGROUP_H_NODEPS
#include <x10/lang/Iterable.h>
#include <x10/lang/Place.h>
#include <x10/lang/PlaceGroup__SimplePlaceGroup.h>
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Any.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/io/Serializer.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Byte.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/FinishState.h>
#include <x10/lang/Int.h>
#include <x10/compiler/Pragma.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/Iterator.h>
#include <x10/io/Deserializer.h>
#include <x10/lang/Error.h>
#include <x10/lang/Exception.h>
#include <x10/compiler/AsyncClosure.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_PLACEGROUP_H_GENERICS
#define X10_LANG_PLACEGROUP_H_GENERICS
inline ::x10::lang::PlaceGroup__SimplePlaceGroup* x10::lang::PlaceGroup::FMGL(WORLD__get)() {
    if (FMGL(WORLD__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(WORLD__init)();
    }
    return x10::lang::PlaceGroup::FMGL(WORLD);
}

#endif // X10_LANG_PLACEGROUP_H_GENERICS
#endif // __X10_LANG_PLACEGROUP_H_NODEPS
