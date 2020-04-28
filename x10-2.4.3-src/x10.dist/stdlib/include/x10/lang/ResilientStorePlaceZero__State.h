#ifndef __X10_LANG_RESILIENTSTOREPLACEZERO__STATE_H
#define __X10_LANG_RESILIENTSTOREPLACEZERO__STATE_H

#include <x10rt.h>


#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_UTIL_PAIR_H_NODEPS
#include <x10/util/Pair.h>
#undef X10_UTIL_PAIR_H_NODEPS
#define X10_LANG_INT_H_NODEPS
#include <x10/lang/Int.h>
#undef X10_LANG_INT_H_NODEPS
#define X10_LANG_BOOLEAN_H_NODEPS
#include <x10/lang/Boolean.h>
#undef X10_LANG_BOOLEAN_H_NODEPS
#define X10_LANG_BOOLEAN_H_NODEPS
#include <x10/lang/Boolean.h>
#undef X10_LANG_BOOLEAN_H_NODEPS
namespace x10 { namespace util { 
template<class TPMGL(K), class TPMGL(V)> class HashMap;
} } 
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
class Place;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Iterator;
} } 
namespace x10 { namespace util { 
template<class TPMGL(Key), class TPMGL(Val)> class Map__Entry;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Iterable;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class Set;
} } 
namespace x10 { namespace lang { 
class FinishState;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class Box;
} } 
namespace x10 { namespace lang { 
class DeadPlaceException;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 

class ResilientStorePlaceZero__State : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    x10_long FMGL(id);
    
    ::x10::lang::ResilientStorePlaceZero__State* FMGL(parent);
    
    ::x10::util::HashMap< ::x10::util::Pair<x10_long, x10_long>, x10_int>*
      FMGL(transit);
    
    ::x10::lang::Rail< x10_int >* FMGL(live);
    
    ::x10::util::HashMap< ::x10::util::Pair<x10_long, x10_long>, x10_int>*
      FMGL(transitAdopted);
    
    ::x10::lang::Rail< x10_int >* FMGL(liveAdopted);
    
    x10_long FMGL(homeId);
    
    x10_boolean FMGL(adopted);
    
    x10_long FMGL(adoptedParent);
    
    ::x10::util::GrowableRail< ::x10::lang::Exception*>* FMGL(multipleExceptions);
    
    ::x10::util::concurrent::SimpleLatch* FMGL(latch);
    
    x10_long FMGL(totalCounter);
    
    void recalculateTotal();
    ::x10::util::GrowableRail< ::x10::lang::Exception*>* ensureMultipleExceptions(
      );
    void _constructor(::x10::lang::ResilientStorePlaceZero__State* pfs,
                      x10_long homeId, x10_long id, ::x10::util::concurrent::SimpleLatch* latch);
    
    static ::x10::lang::ResilientStorePlaceZero__State* _make(::x10::lang::ResilientStorePlaceZero__State* pfs,
                                                              x10_long homeId,
                                                              x10_long id,
                                                              ::x10::util::concurrent::SimpleLatch* latch);
    
    virtual void transitInc(x10_long src, x10_long dst, x10_int v);
    virtual void transitDec(x10_long src, x10_long dst);
    virtual x10_int transitGet(x10_long src, x10_long dst);
    virtual void transitSet(x10_long src, x10_long dst, x10_int v);
    virtual void transitAdoptedInc(x10_long src, x10_long dst,
                                   x10_int v);
    virtual void transitAdoptedDec(x10_long src, x10_long dst);
    virtual x10_int transitAdoptedGet(x10_long src, x10_long dst);
    virtual void transitAdoptedSet(x10_long src, x10_long dst,
                                   x10_int v);
    virtual void transitInc(x10_long src, x10_long dst);
    virtual void transitAdoptedInc(x10_long src, x10_long dst);
    virtual ::x10::lang::ResilientStorePlaceZero__State* findFirstNonDeadParent(
      );
    virtual void adopt(::x10::lang::ResilientStorePlaceZero__State* child);
    virtual void addDeadPlaceException(::x10::lang::Place p);
    virtual ::x10::lang::ResilientStorePlaceZero__State* x10__lang__ResilientStorePlaceZero__State____this__x10__lang__ResilientStorePlaceZero__State(
      );
    virtual void __fieldInitializers_x10_lang_ResilientStorePlaceZero_State(
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
#endif // X10_LANG_RESILIENTSTOREPLACEZERO__STATE_H

namespace x10 { namespace lang { 
class ResilientStorePlaceZero__State;
} } 

#ifndef X10_LANG_RESILIENTSTOREPLACEZERO__STATE_H_NODEPS
#define X10_LANG_RESILIENTSTOREPLACEZERO__STATE_H_NODEPS
#ifndef X10_LANG_RESILIENTSTOREPLACEZERO__STATE_H_GENERICS
#define X10_LANG_RESILIENTSTOREPLACEZERO__STATE_H_GENERICS
#endif // X10_LANG_RESILIENTSTOREPLACEZERO__STATE_H_GENERICS
#endif // __X10_LANG_RESILIENTSTOREPLACEZERO__STATE_H_NODEPS
