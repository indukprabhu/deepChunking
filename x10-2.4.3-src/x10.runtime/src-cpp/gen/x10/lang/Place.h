#ifndef __X10_LANG_PLACE_H
#define __X10_LANG_PLACE_H

#include <x10rt.h>


#define X10_LANG_ANY_H_NODEPS
#include <x10/lang/Any.h>
#undef X10_LANG_ANY_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
namespace x10 { namespace compiler { 
class Native;
} } 
namespace x10 { namespace lang { 
class BadPlaceException;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(Z1), class TPMGL(U)> class Fun_0_1;
} } 
namespace x10 { namespace lang { 
class PlaceGroup;
} } 
namespace x10 { namespace lang { 
class PlaceGroup__SimplePlaceGroup;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class GlobalRef;
} } 
namespace x10 { namespace compiler { 
class NonEscaping;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 

class Place   {
    public:
    RTT_H_DECLS_STRUCT
    
    ::x10::lang::Place* operator->() { return this; }
    
    x10_long FMGL(id);
    
    static ::x10aux::itable_entry _itables[2];
    
    ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static ::x10::lang::Any::itable< ::x10::lang::Place > _itable_0;
    
    static ::x10aux::itable_entry _iboxitables[2];
    
    ::x10aux::itable_entry* _getIBoxITables() { return _iboxitables; }
    
    static ::x10::lang::Place _alloc(){::x10::lang::Place t; return t; }
    
    x10_long id() {
        return (*this)->FMGL(id);
        
    }
    static x10_long numDead(){
        return ((x10_long)x10rt_ndead());
    }
    static x10_long FMGL(NUM_ACCELS);
    static void FMGL(NUM_ACCELS__do_init)();
    static void FMGL(NUM_ACCELS__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(NUM_ACCELS__status);
    static ::x10::lang::CheckedThrowable* FMGL(NUM_ACCELS__exception);
    static x10_long FMGL(NUM_ACCELS__get)();
    
    static x10_long numChildren(x10_long id){
        return ((x10_long)::x10aux::num_children((x10_int)id));
    }
    static x10_boolean isHost(x10_long id){
        return ::x10aux::is_host((x10_int)id);
    }
    static x10_boolean isDead(x10_long id){
        return x10rt_is_place_dead((x10_int)id);
    }
    static x10_long numPlaces(){
        return ((x10_long)::x10aux::num_places);
    }
    static x10_boolean isCUDA(x10_long id){
        return ::x10aux::is_cuda((x10_int)id);
    }
    static x10_long parent(x10_long id){
        return ::x10aux::parent((x10_int)id);
    }
    static x10_long child(x10_long p, x10_long i);
    static x10_long childIndex(x10_long id);
    static ::x10::lang::Rail< ::x10::lang::Rail< ::x10::lang::Place >* >*
      FMGL(children);
    static void FMGL(children__do_init)();
    static void FMGL(children__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(children__status);
    static ::x10::lang::CheckedThrowable* FMGL(children__exception);
    static ::x10::lang::Rail< ::x10::lang::Rail< ::x10::lang::Place >* >*
      FMGL(children__get)();
    
    static ::x10::lang::PlaceGroup* places();
    static ::x10::lang::Place FMGL(FIRST_PLACE);
    static void FMGL(FIRST_PLACE__do_init)();
    static void FMGL(FIRST_PLACE__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(FIRST_PLACE__status);
    static ::x10::lang::CheckedThrowable* FMGL(FIRST_PLACE__exception);
    static ::x10::lang::Place FMGL(FIRST_PLACE__get)();
    
    static ::x10::lang::Place FMGL(INVALID_PLACE);
    static void FMGL(INVALID_PLACE__do_init)();
    static void FMGL(INVALID_PLACE__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(INVALID_PLACE__status);
    static ::x10::lang::CheckedThrowable* FMGL(INVALID_PLACE__exception);
    static ::x10::lang::Place FMGL(INVALID_PLACE__get)();
    
    void _constructor(x10_long id) {
        
        //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        FMGL(id) = id;
        
        //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        ::x10::lang::Place this__103298 = (*this);
        
    }
    static ::x10::lang::Place _make(x10_long id) {
        ::x10::lang::Place this_; 
        this_->_constructor(id);
        return this_;
    }
    
    static ::x10::lang::Place place(x10_long id) {
        ::x10::lang::Place alloc__103299 =  ::x10::lang::Place::_alloc();
        (alloc__103299)->::x10::lang::Place::_constructor(id);
        return alloc__103299;
        
    }
    ::x10::lang::Place next() {
        return (*this)->x10::lang::Place::next(((x10_long)1ll));
        
    }
    ::x10::lang::Place prev() {
        return (*this)->x10::lang::Place::next(((x10_long)-1ll));
        
    }
    ::x10::lang::Place prev(x10_long i) {
        return (*this)->x10::lang::Place::next((-(i)));
        
    }
    ::x10::lang::Place next(x10_long i) {
        
        //#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        if (::x10aux::is_host((x10_int)(*this)->FMGL(id))) {
            
            //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            x10_long k = (((((((*this)->FMGL(id)) + (((i) % ::x10aux::zeroCheck(((x10_long)::x10aux::num_hosts)))))) + (((x10_long)::x10aux::num_hosts)))) % ::x10aux::zeroCheck(((x10_long)::x10aux::num_hosts)));
            
            //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            x10_long id__103301 = k;
            ::x10::lang::Place alloc__103300 =  ::x10::lang::Place::_alloc();
            (alloc__103300)->::x10::lang::Place::_constructor(id__103301);
            
            //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
            return alloc__103300;
            
        }
        
        //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Place.x10"
        return (*this);
        
    }
    x10_boolean isFirst() {
        return (::x10aux::struct_equals((*this)->FMGL(id), ((x10_long)0ll)));
        
    }
    x10_boolean isLast() {
        return (::x10aux::struct_equals((*this)->FMGL(id), ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)))));
        
    }
    x10_boolean isHost() {
        return ::x10aux::is_host((x10_int)(*this)->FMGL(id));
        
    }
    x10_boolean isCUDA() {
        return ::x10aux::is_cuda((x10_int)(*this)->FMGL(id));
        
    }
    x10_boolean isDead() {
        return x10rt_is_place_dead((x10_int)(*this)->FMGL(id));
        
    }
    x10_long numChildren() {
        return ((x10_long)::x10aux::num_children((x10_int)(*this)->FMGL(id)));
        
    }
    ::x10::lang::Place child(x10_long i) {
        ::x10::lang::Place alloc__103302 =  ::x10::lang::Place::_alloc();
        (alloc__103302)->::x10::lang::Place::_constructor(((x10_long)::x10aux::child((x10_int)(*this)->FMGL(id),(x10_int)i)));
        return alloc__103302;
        
    }
    ::x10::lang::Rail< ::x10::lang::Place >* children();
    ::x10::lang::Place parent() {
        ::x10::lang::Place alloc__103303 =  ::x10::lang::Place::_alloc();
        (alloc__103303)->::x10::lang::Place::_constructor(::x10aux::parent((x10_int)(*this)->FMGL(id)));
        return alloc__103303;
        
    }
    x10_long childIndex();
    ::x10::lang::String* toString();
    x10_boolean equals(::x10::lang::Place p) {
        return (::x10aux::struct_equals(p->FMGL(id), (*this)->FMGL(id)));
        
    }
    x10_boolean equals(::x10::lang::Any* p);
    x10_int hashCode() {
        return ((x10_int) ((*this)->FMGL(id)));
        
    }
    ::x10::lang::String* typeName();
    x10_boolean _struct_equals(::x10::lang::Any* other);
    x10_boolean _struct_equals(::x10::lang::Place other) {
        return (::x10aux::struct_equals((*this)->FMGL(id), other->FMGL(id)));
        
    }
    ::x10::lang::Place x10__lang__Place____this__x10__lang__Place() {
        return (*this);
        
    }
    void __fieldInitializers_x10_lang_Place() {
     
    }
    
    static void _serialize(::x10::lang::Place this_, ::x10aux::serialization_buffer& buf);
    
    static ::x10::lang::Place _deserialize(::x10aux::deserialization_buffer& buf) {
        ::x10::lang::Place this_;
        this_->_deserialize_body(buf);
        return this_;
    }
    
    void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};


} } 
#endif // X10_LANG_PLACE_H

namespace x10 { namespace lang { 
class Place;
} } 

#ifndef X10_LANG_PLACE_H_NODEPS
#define X10_LANG_PLACE_H_NODEPS
#include <x10/lang/Any.h>
#include <x10/lang/Long.h>
#include <x10/compiler/Native.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/BadPlaceException.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/lang/PlaceGroup.h>
#include <x10/lang/PlaceGroup__SimplePlaceGroup.h>
#include <x10/lang/String.h>
#include <x10/lang/Int.h>
#include <x10/lang/GlobalRef.h>
#include <x10/compiler/NonEscaping.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_PLACE_H_GENERICS
#define X10_LANG_PLACE_H_GENERICS
inline x10_long x10::lang::Place::FMGL(NUM_ACCELS__get)() {
    if (FMGL(NUM_ACCELS__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(NUM_ACCELS__init)();
    }
    return x10::lang::Place::FMGL(NUM_ACCELS);
}

inline ::x10::lang::Rail< ::x10::lang::Rail< ::x10::lang::Place >* >* x10::lang::Place::FMGL(children__get)() {
    if (FMGL(children__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(children__init)();
    }
    return x10::lang::Place::FMGL(children);
}

inline ::x10::lang::Place x10::lang::Place::FMGL(FIRST_PLACE__get)() {
    if (FMGL(FIRST_PLACE__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(FIRST_PLACE__init)();
    }
    return x10::lang::Place::FMGL(FIRST_PLACE);
}

inline ::x10::lang::Place x10::lang::Place::FMGL(INVALID_PLACE__get)() {
    if (FMGL(INVALID_PLACE__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(INVALID_PLACE__init)();
    }
    return x10::lang::Place::FMGL(INVALID_PLACE);
}

#endif // X10_LANG_PLACE_H_GENERICS
#endif // __X10_LANG_PLACE_H_NODEPS
