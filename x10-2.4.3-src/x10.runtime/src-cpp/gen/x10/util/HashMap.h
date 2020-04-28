#ifndef __X10_UTIL_HASHMAP_H
#define __X10_UTIL_HASHMAP_H

#include <x10rt.h>


#define X10_UTIL_MAP_H_NODEPS
#include <x10/util/Map.h>
#undef X10_UTIL_MAP_H_NODEPS
#define X10_IO_CUSTOMSERIALIZATION_H_NODEPS
#include <x10/io/CustomSerialization.h>
#undef X10_IO_CUSTOMSERIALIZATION_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace util { 
template<class TPMGL(Key), class TPMGL(Value)> class HashMap__HashEntry;
} } 
namespace x10 { namespace compiler { 
class NonEscaping;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class Box;
} } 
namespace x10 { namespace util { 
class NoSuchElementException;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class Set;
} } 
namespace x10 { namespace util { 
template<class TPMGL(Key), class TPMGL(Value)> class HashMap__KeySet;
} } 
namespace x10 { namespace util { 
template<class TPMGL(Key), class TPMGL(Val)> class Map__Entry;
} } 
namespace x10 { namespace util { 
template<class TPMGL(Key), class TPMGL(Value)> class HashMap__EntrySet;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Iterator;
} } 
namespace x10 { namespace util { 
template<class TPMGL(Key), class TPMGL(Value)> class HashMap__EntriesIterator;
} } 
namespace x10 { namespace io { 
class Deserializer;
} } 
namespace x10 { namespace io { 
class Serializer;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace util { 

template<class TPMGL(K), class TPMGL(V)> class HashMap;
template <> class HashMap<void, void>;
template<class TPMGL(K), class TPMGL(V)> class HashMap : public ::x10::lang::X10Class
  {
    public:
    RTT_H_DECLS_CLASS
    
    static ::x10aux::itable_entry _itables[4];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static typename ::x10::util::Map<TPMGL(K), TPMGL(V)>::template itable< ::x10::util::HashMap<TPMGL(K), TPMGL(V)> > _itable_0;
    
    static ::x10::lang::Any::itable< ::x10::util::HashMap<TPMGL(K), TPMGL(V)> > _itable_1;
    
    static ::x10::io::CustomSerialization::itable< ::x10::util::HashMap<TPMGL(K), TPMGL(V)> > _itable_2;
    
    ::x10::lang::Rail< ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>* >*
      FMGL(table);
    
    x10_long FMGL(size);
    
    x10_long FMGL(occupation);
    
    x10_long FMGL(mask);
    
    x10_long FMGL(modCount);
    
    void _constructor();
    
    static ::x10::util::HashMap<TPMGL(K), TPMGL(V)>* _make();
    
    void _constructor(x10_long sz);
    
    static ::x10::util::HashMap<TPMGL(K), TPMGL(V)>* _make(x10_long sz);
    
    virtual void init(x10_long sz);
    virtual void clear();
    virtual x10_int hash(TPMGL(K) k);
    virtual x10_int hashInternal(TPMGL(K) k);
    virtual ::x10::util::Box<TPMGL(V)>* __apply(TPMGL(K) k);
    virtual ::x10::util::Box<TPMGL(V)>* get(TPMGL(K) k);
    virtual TPMGL(V) getOrElse(TPMGL(K) k, TPMGL(V) orelse);
    virtual TPMGL(V) getOrThrow(TPMGL(K) k);
    virtual ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>* getEntry(
      TPMGL(K) k);
    virtual ::x10::util::Box<TPMGL(V)>* put(TPMGL(K) k, TPMGL(V) v);
    virtual ::x10::util::Box<TPMGL(V)>* putInternal(TPMGL(K) k, TPMGL(V) v,
                                                    x10_boolean mayRehash);
    virtual void rehash();
    virtual void rehashInternal();
    virtual x10_boolean containsKey(TPMGL(K) k);
    virtual ::x10::util::Box<TPMGL(V)>* remove(TPMGL(K) k);
    virtual ::x10::util::Set<TPMGL(K)>* keySet();
    virtual ::x10::util::Set< ::x10::util::Map__Entry<TPMGL(K), TPMGL(V)>*>*
      entries();
    virtual ::x10::lang::Iterator< ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>*>*
      entriesIterator();
    virtual x10_long size();
    void _constructor(::x10::io::Deserializer* ds);
    
    static ::x10::util::HashMap<TPMGL(K), TPMGL(V)>* _make(
             ::x10::io::Deserializer* ds);
    
    virtual void serialize(::x10::io::Serializer* s);
    virtual ::x10::util::HashMap<TPMGL(K), TPMGL(V)>* x10__util__HashMap____this__x10__util__HashMap(
      );
    virtual void __fieldInitializers_x10_util_HashMap();
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: virtual ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

template<class TPMGL(K), class TPMGL(V)> ::x10aux::RuntimeType x10::util::HashMap<TPMGL(K), TPMGL(V)>::rtt;
template<class TPMGL(K), class TPMGL(V)> void x10::util::HashMap<TPMGL(K), TPMGL(V)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::util::HashMap<void, void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::util::Map<TPMGL(K), TPMGL(V)> >(), ::x10aux::getRTT< ::x10::io::CustomSerialization>()};
    const ::x10aux::RuntimeType* params[2] = { ::x10aux::getRTT<TPMGL(K)>(), ::x10aux::getRTT<TPMGL(V)>()};
    ::x10aux::RuntimeType::Variance variances[2] = { ::x10aux::RuntimeType::invariant, ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.util.HashMap";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 2, parents, 2, params, variances);
}

template <> class HashMap<void, void> : public ::x10::lang::X10Class
{
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    static x10_long FMGL(MAX_PROBES);
    
    static x10_long FMGL(MIN_SIZE);
    
    static void FMGL(MAX_PROBES__do_init)();
    static void FMGL(MAX_PROBES__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(MAX_PROBES__status);
    static ::x10::lang::CheckedThrowable* FMGL(MAX_PROBES__exception);
    static x10_long FMGL(MAX_PROBES__get)();
    static void FMGL(MIN_SIZE__do_init)();
    static void FMGL(MIN_SIZE__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(MIN_SIZE__status);
    static ::x10::lang::CheckedThrowable* FMGL(MIN_SIZE__exception);
    static x10_long FMGL(MIN_SIZE__get)();
    
};

} } 
#endif // X10_UTIL_HASHMAP_H

namespace x10 { namespace util { 
template<class TPMGL(K), class TPMGL(V)> class HashMap;
} } 

#ifndef X10_UTIL_HASHMAP_H_NODEPS
#define X10_UTIL_HASHMAP_H_NODEPS
#include <x10/util/Map.h>
#include <x10/io/CustomSerialization.h>
#include <x10/lang/Long.h>
#include <x10/lang/Rail.h>
#include <x10/util/HashMap__HashEntry.h>
#include <x10/lang/Boolean.h>
#include <x10/compiler/NonEscaping.h>
#include <x10/lang/Int.h>
#include <x10/lang/Any.h>
#include <x10/util/Box.h>
#include <x10/util/NoSuchElementException.h>
#include <x10/lang/String.h>
#include <x10/util/Set.h>
#include <x10/util/HashMap__KeySet.h>
#include <x10/util/Map__Entry.h>
#include <x10/util/HashMap__EntrySet.h>
#include <x10/lang/Iterator.h>
#include <x10/util/HashMap__EntriesIterator.h>
#include <x10/io/Deserializer.h>
#include <x10/io/Serializer.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_UTIL_HASHMAP_H_GENERICS
#define X10_UTIL_HASHMAP_H_GENERICS
inline x10_long x10::util::HashMap<void, void>::FMGL(MAX_PROBES__get)() {
    if (FMGL(MAX_PROBES__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(MAX_PROBES__init)();
    }
    return x10::util::HashMap<void, void>::FMGL(MAX_PROBES);
}

inline x10_long x10::util::HashMap<void, void>::FMGL(MIN_SIZE__get)() {
    if (FMGL(MIN_SIZE__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(MIN_SIZE__init)();
    }
    return x10::util::HashMap<void, void>::FMGL(MIN_SIZE);
}

#endif // X10_UTIL_HASHMAP_H_GENERICS
#ifndef X10_UTIL_HASHMAP_H_IMPLEMENTATION
#define X10_UTIL_HASHMAP_H_IMPLEMENTATION
#include <x10/util/HashMap.h>

template<class TPMGL(K), class TPMGL(V)> typename ::x10::util::Map<TPMGL(K), TPMGL(V)>::template itable< ::x10::util::HashMap<TPMGL(K), TPMGL(V)> >  x10::util::HashMap<TPMGL(K), TPMGL(V)>::_itable_0(&x10::util::HashMap<TPMGL(K), TPMGL(V)>::clear, &x10::util::HashMap<TPMGL(K), TPMGL(V)>::containsKey, &x10::util::HashMap<TPMGL(K), TPMGL(V)>::entries, &::x10::lang::X10Class::equals, &x10::util::HashMap<TPMGL(K), TPMGL(V)>::get, &x10::util::HashMap<TPMGL(K), TPMGL(V)>::getOrElse, &x10::util::HashMap<TPMGL(K), TPMGL(V)>::getOrThrow, &::x10::lang::X10Class::hashCode, &x10::util::HashMap<TPMGL(K), TPMGL(V)>::keySet, &x10::util::HashMap<TPMGL(K), TPMGL(V)>::put, &x10::util::HashMap<TPMGL(K), TPMGL(V)>::remove, &x10::util::HashMap<TPMGL(K), TPMGL(V)>::size, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(K), class TPMGL(V)> ::x10::lang::Any::itable< ::x10::util::HashMap<TPMGL(K), TPMGL(V)> >  x10::util::HashMap<TPMGL(K), TPMGL(V)>::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(K), class TPMGL(V)> ::x10::io::CustomSerialization::itable< ::x10::util::HashMap<TPMGL(K), TPMGL(V)> >  x10::util::HashMap<TPMGL(K), TPMGL(V)>::_itable_2(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::util::HashMap<TPMGL(K), TPMGL(V)>::serialize, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(K), class TPMGL(V)> ::x10aux::itable_entry x10::util::HashMap<TPMGL(K), TPMGL(V)>::_itables[4] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::util::Map<TPMGL(K), TPMGL(V)> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::CustomSerialization>, &_itable_2), ::x10aux::itable_entry(NULL, (void*)"::x10::util::HashMap<TPMGL(K), TPMGL(V)>")};

//#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
/** The actual table, must be of size 2**n */

//#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
/** Number of non-null, non-removed entries in the table. */

//#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
/** Number of non-null entries in the table. */

//#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
/** table.length - 1 */

//#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"

//#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"

//#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"

//#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(K), class TPMGL(V)> void x10::util::HashMap<TPMGL(K), TPMGL(V)>::_constructor(
                                           ) {
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    ::x10::util::HashMap<TPMGL(K), TPMGL(V)>* this__117620 = this;
    ::x10aux::nullCheck(this__117620)->FMGL(table) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>* >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    ::x10aux::nullCheck(this__117620)->FMGL(size) = ((x10_long)0ll);
    ::x10aux::nullCheck(this__117620)->FMGL(occupation) = ((x10_long)0ll);
    ::x10aux::nullCheck(this__117620)->FMGL(mask) = ((x10_long)0ll);
    ::x10aux::nullCheck(this__117620)->FMGL(modCount) = ((x10_long)0ll);
    
    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    this->x10::util::template HashMap<TPMGL(K), TPMGL(V)>::init(((x10_long)4ll));
}
template<class TPMGL(K), class TPMGL(V)> ::x10::util::HashMap<TPMGL(K), TPMGL(V)>* x10::util::HashMap<TPMGL(K), TPMGL(V)>::_make(
                                           ) {
    ::x10::util::HashMap<TPMGL(K), TPMGL(V)>* this_ = new (::x10aux::alloc_z< ::x10::util::HashMap<TPMGL(K), TPMGL(V)> >()) ::x10::util::HashMap<TPMGL(K), TPMGL(V)>();
    this_->_constructor();
    return this_;
}



//#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(K), class TPMGL(V)> void x10::util::HashMap<TPMGL(K), TPMGL(V)>::_constructor(
                                           x10_long sz) {
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    ::x10::util::HashMap<TPMGL(K), TPMGL(V)>* this__117621 =
      this;
    ::x10aux::nullCheck(this__117621)->FMGL(table) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>* >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    ::x10aux::nullCheck(this__117621)->FMGL(size) = ((x10_long)0ll);
    ::x10aux::nullCheck(this__117621)->FMGL(occupation) =
      ((x10_long)0ll);
    ::x10aux::nullCheck(this__117621)->FMGL(mask) = ((x10_long)0ll);
    ::x10aux::nullCheck(this__117621)->FMGL(modCount) = ((x10_long)0ll);
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    x10_long pow2 = ((x10_long)4ll);
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    while (((pow2) < (sz))) {
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        pow2 = ((pow2) << (0x3f & (x10_int)(((x10_long)(((x10_int)1))))));
    }
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    this->x10::util::template HashMap<TPMGL(K), TPMGL(V)>::init(
      pow2);
}
template<class TPMGL(K), class TPMGL(V)> ::x10::util::HashMap<TPMGL(K), TPMGL(V)>* x10::util::HashMap<TPMGL(K), TPMGL(V)>::_make(
                                           x10_long sz) {
    ::x10::util::HashMap<TPMGL(K), TPMGL(V)>* this_ = new (::x10aux::alloc_z< ::x10::util::HashMap<TPMGL(K), TPMGL(V)> >()) ::x10::util::HashMap<TPMGL(K), TPMGL(V)>();
    this_->_constructor(sz);
    return this_;
}



//#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(K), class TPMGL(V)> void x10::util::HashMap<TPMGL(K), TPMGL(V)>::init(
  x10_long sz) {
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    #ifndef NO_ASSERTIONS
    if (::x10aux::x10__assertions_enabled)
        ::x10aux::x10__assert((::x10aux::struct_equals(((sz) & ((-(sz)))),
                                                       sz)));
    #endif//NO_ASSERTIONS
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    #ifndef NO_ASSERTIONS
    if (::x10aux::x10__assertions_enabled)
        ::x10aux::x10__assert(((sz) >= (((x10_long)4ll))));
    #endif//NO_ASSERTIONS
    
    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    this->FMGL(table) = ::x10::lang::Rail< ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>* >::_make(sz);
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    this->FMGL(mask) = ((sz) - (((x10_long)1ll)));
    
    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    this->FMGL(size) = ((x10_long)0ll);
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    this->FMGL(occupation) = ((x10_long)0ll);
}

//#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(K), class TPMGL(V)> void x10::util::HashMap<TPMGL(K), TPMGL(V)>::clear(
  ) {
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    this->FMGL(modCount) = ((this->FMGL(modCount)) + (((x10_long)1ll)));
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    this->x10::util::template HashMap<TPMGL(K), TPMGL(V)>::init(
      ((x10_long)4ll));
}

//#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(K), class TPMGL(V)> x10_int x10::util::HashMap<TPMGL(K), TPMGL(V)>::hash(
  TPMGL(K) k) {
    ::x10::util::HashMap<TPMGL(K), TPMGL(V)>* this__117622 =
      this;
    
    //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    TPMGL(K) k__117623 = k;
    
    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    return ((::x10aux::hash_code(k__117623)) * (((x10_int)17)));
    
}

//#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(K), class TPMGL(V)> x10_int x10::util::HashMap<TPMGL(K), TPMGL(V)>::hashInternal(
  TPMGL(K) k) {
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    return ((::x10aux::hash_code(k)) * (((x10_int)17)));
    
}

//#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(K), class TPMGL(V)> ::x10::util::Box<TPMGL(V)>*
  x10::util::HashMap<TPMGL(K), TPMGL(V)>::__apply(TPMGL(K) k) {
    return this->get(k);
    
}

//#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(K), class TPMGL(V)> ::x10::util::Box<TPMGL(V)>*
  x10::util::HashMap<TPMGL(K), TPMGL(V)>::get(TPMGL(K) k) {
    
    //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>* e =
      this->getEntry(k);
    
    //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    if (((::x10aux::struct_equals(e, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))) ||
        ::x10aux::nullCheck(e)->FMGL(removed))) {
        return ::x10aux::class_cast_unchecked< ::x10::util::Box<TPMGL(V)>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        
    }
    
    //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    ::x10::util::Box<TPMGL(V)>* alloc__117625 =  (new (::x10aux::alloc_z< ::x10::util::Box<TPMGL(V)> >()) ::x10::util::Box<TPMGL(V)>());
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
    TPMGL(V) x__117624 = ::x10aux::nullCheck(e)->FMGL(value);
    alloc__117625->FMGL(value) = x__117624;
    
    //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    return alloc__117625;
    
}

//#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(K), class TPMGL(V)> TPMGL(V) x10::util::HashMap<TPMGL(K), TPMGL(V)>::getOrElse(
  TPMGL(K) k, TPMGL(V) orelse) {
    
    //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>* e =
      this->getEntry(k);
    
    //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    if (((::x10aux::struct_equals(e, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))) ||
        ::x10aux::nullCheck(e)->FMGL(removed))) {
        return orelse;
        
    }
    
    //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    return ::x10aux::nullCheck(e)->FMGL(value);
    
}

//#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(K), class TPMGL(V)> TPMGL(V) x10::util::HashMap<TPMGL(K), TPMGL(V)>::getOrThrow(
  TPMGL(K) k) {
    
    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>* e =
      this->getEntry(k);
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    if (((::x10aux::struct_equals(e, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))) ||
        ::x10aux::nullCheck(e)->FMGL(removed))) {
        ::x10aux::throwException(::x10aux::nullCheck(::x10::util::NoSuchElementException::_make(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__128797 = ::x10aux::makeStringLit("Not found: "); strLit__128797; })), k))));
    }
    
    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    return ::x10aux::nullCheck(e)->FMGL(value);
    
}

//#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(K), class TPMGL(V)> ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>*
  x10::util::HashMap<TPMGL(K), TPMGL(V)>::getEntry(TPMGL(K) k) {
    
    //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    if ((::x10aux::struct_equals(this->FMGL(size), ((x10_long)0ll))))
    {
        
        //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        return ::x10aux::class_cast_unchecked< ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        
    }
    
    //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    x10_int h = this->hash(k);
    
    //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    x10_long i = ((x10_long)(h));
    
    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    while (true) {
        
        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        x10_long j = ((i) & (this->FMGL(mask)));
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        i = ((i) + (((x10_long)1ll)));
        
        //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>* e =
          ::x10aux::nullCheck(this->FMGL(table))->x10::lang::template Rail< ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>* >::__apply(
            j);
        
        //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        if ((::x10aux::struct_equals(e, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
        {
            
            //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            return ::x10aux::class_cast_unchecked< ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            
        }
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        if ((!::x10aux::struct_equals(e, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
        {
            
            //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            if (((::x10aux::struct_equals(::x10aux::nullCheck(e)->FMGL(hash),
                                          h)) && ::x10aux::equals(k,::x10aux::nullCheck(e)->FMGL(key))))
            {
                
                //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                return e;
                
            }
            
            //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            if (((((i) - (((x10_long)(h))))) > ((x10_long)(::x10aux::nullCheck(this->FMGL(table))->FMGL(size)))))
            {
                
                //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                return ::x10aux::class_cast_unchecked< ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                
            }
            
        }
        
    }
    
}

//#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(K), class TPMGL(V)> ::x10::util::Box<TPMGL(V)>*
  x10::util::HashMap<TPMGL(K), TPMGL(V)>::put(TPMGL(K) k,
                                              TPMGL(V) v) {
    return this->x10::util::template HashMap<TPMGL(K), TPMGL(V)>::putInternal(
             k, v, true);
    
}

//#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(K), class TPMGL(V)> ::x10::util::Box<TPMGL(V)>*
  x10::util::HashMap<TPMGL(K), TPMGL(V)>::putInternal(TPMGL(K) k,
                                                      TPMGL(V) v,
                                                      x10_boolean mayRehash) {
    
    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    x10_int h = (__extension__ ({
        ::x10::util::HashMap<TPMGL(K), TPMGL(V)>* this__117591 =
          this;
        
        //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        TPMGL(K) k__117590 = k;
        ((::x10aux::hash_code(k__117590)) * (((x10_int)17)));
    }))
    ;
    
    //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    x10_long i = ((x10_long)(h));
    
    //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    while (true) {
        
        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        x10_long j = ((i) & (this->FMGL(mask)));
        
        //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        i = ((i) + (((x10_long)1ll)));
        
        //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>* e =
          ::x10aux::nullCheck(this->FMGL(table))->x10::lang::template Rail< ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>* >::__apply(
            j);
        
        //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        if ((::x10aux::struct_equals(e, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
        {
            
            //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            this->FMGL(modCount) = ((this->FMGL(modCount)) + (((x10_long)1ll)));
            
            //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            ::x10aux::nullCheck(this->FMGL(table))->x10::lang::template Rail< ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>* >::__set(
              j, (__extension__ ({
                  ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>* alloc__88643 =
                     (new (::x10aux::alloc_z< ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)> >()) ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>());
                  (alloc__88643)->::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>::_constructor(
                    k, v, h);
                  alloc__88643;
              }))
              );
            
            //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            this->FMGL(size) = ((this->FMGL(size)) + (((x10_long)1ll)));
            
            //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            this->FMGL(occupation) = ((this->FMGL(occupation)) + (((x10_long)1ll)));
            
            //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            if ((mayRehash && (((((((i) - (((x10_long)(h))))) > (((x10_long)3ll))) &&
                               ((this->FMGL(occupation)) >= ((((x10_long)(::x10aux::nullCheck(this->FMGL(table))->FMGL(size))) / ::x10aux::zeroCheck(((x10_long)2ll)))))) ||
                               (::x10aux::struct_equals(this->FMGL(occupation),
                                                        (x10_long)(::x10aux::nullCheck(this->FMGL(table))->FMGL(size))))))))
            {
                
                //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                this->x10::util::template HashMap<TPMGL(K), TPMGL(V)>::rehashInternal();
            }
            
            //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            return ::x10aux::class_cast_unchecked< ::x10::util::Box<TPMGL(V)>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            
        } else 
        //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        if (((::x10aux::struct_equals(::x10aux::nullCheck(e)->FMGL(hash),
                                      h)) && ::x10aux::equals(k,::x10aux::nullCheck(e)->FMGL(key))))
        {
            
            //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            TPMGL(V) old = ::x10aux::nullCheck(e)->FMGL(value);
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            ::x10aux::nullCheck(e)->FMGL(value) = v;
            
            //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            if (::x10aux::nullCheck(e)->FMGL(removed)) {
                
                //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                ::x10aux::nullCheck(e)->FMGL(removed) = false;
                
                //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                this->FMGL(size) = ((this->FMGL(size)) + (((x10_long)1ll)));
                
                //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                return ::x10aux::class_cast_unchecked< ::x10::util::Box<TPMGL(V)>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                
            }
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            ::x10::util::Box<TPMGL(V)>* alloc__117627 =  (new (::x10aux::alloc_z< ::x10::util::Box<TPMGL(V)> >()) ::x10::util::Box<TPMGL(V)>());
            
            //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
            TPMGL(V) x__117626 = old;
            alloc__117627->FMGL(value) = x__117626;
            
            //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            return alloc__117627;
            
        }
        
    }
    
}

//#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(K), class TPMGL(V)> void x10::util::HashMap<TPMGL(K), TPMGL(V)>::rehash(
  ) {
    this->x10::util::template HashMap<TPMGL(K), TPMGL(V)>::rehashInternal();
}

//#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(K), class TPMGL(V)> void x10::util::HashMap<TPMGL(K), TPMGL(V)>::rehashInternal(
  ) {
    
    //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    this->FMGL(modCount) = ((this->FMGL(modCount)) + (((x10_long)1ll)));
    
    //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    ::x10::lang::Rail< ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>* >* t =
      this->FMGL(table);
    
    //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    x10_long oldSize = this->FMGL(size);
    
    //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    this->FMGL(table) = ::x10::lang::Rail< ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>* >::_make((((x10_long)(::x10aux::nullCheck(t)->FMGL(size))) * (((x10_long)2ll))));
    
    //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    this->FMGL(mask) = (((x10_long)(::x10aux::nullCheck(this->FMGL(table))->FMGL(size))) - (((x10_long)1ll)));
    
    //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    this->FMGL(size) = ((x10_long)0ll);
    
    //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    this->FMGL(occupation) = ((x10_long)0ll);
    
    //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    {
        x10_long i;
        for (i = ((x10_long)0ll); ((i) < ((x10_long)(::x10aux::nullCheck(t)->FMGL(size))));
             i = ((i) + (((x10_long)1ll)))) {
            
            //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            if (((!::x10aux::struct_equals(::x10aux::nullCheck(t)->x10::lang::template Rail< ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>* >::__apply(
                                             i), reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))) &&
                !(::x10aux::nullCheck(::x10aux::nullCheck(t)->x10::lang::template Rail< ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>* >::__apply(
                                        i))->FMGL(removed))))
            {
                
                //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
                this->x10::util::template HashMap<TPMGL(K), TPMGL(V)>::putInternal(
                  ::x10aux::nullCheck(::x10aux::nullCheck(t)->x10::lang::template Rail< ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>* >::__apply(
                                        i))->FMGL(key), ::x10aux::nullCheck(::x10aux::nullCheck(t)->x10::lang::template Rail< ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>* >::__apply(
                                                                              i))->FMGL(value),
                  false);
            }
            
        }
    }
    
    //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    #ifndef NO_ASSERTIONS
    if (::x10aux::x10__assertions_enabled)
        ::x10aux::x10__assert((::x10aux::struct_equals(this->FMGL(size),
                                                       oldSize)));
    #endif//NO_ASSERTIONS
    
}

//#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(K), class TPMGL(V)> x10_boolean x10::util::HashMap<TPMGL(K), TPMGL(V)>::containsKey(
  TPMGL(K) k) {
    
    //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>* e =
      this->getEntry(k);
    
    //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    return ((!::x10aux::struct_equals(e, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))) &&
    !(::x10aux::nullCheck(e)->FMGL(removed)));
    
}

//#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(K), class TPMGL(V)> ::x10::util::Box<TPMGL(V)>*
  x10::util::HashMap<TPMGL(K), TPMGL(V)>::remove(TPMGL(K) k) {
    
    //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    this->FMGL(modCount) = ((this->FMGL(modCount)) + (((x10_long)1ll)));
    
    //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>* e =
      this->getEntry(k);
    
    //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    if (((!::x10aux::struct_equals(e, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))) &&
        !(::x10aux::nullCheck(e)->FMGL(removed)))) {
        
        //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        this->FMGL(size) = ((this->FMGL(size)) - (((x10_long)1ll)));
        
        //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        ::x10aux::nullCheck(e)->FMGL(removed) = true;
        
        //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        ::x10::util::Box<TPMGL(V)>* alloc__117629 =  (new (::x10aux::alloc_z< ::x10::util::Box<TPMGL(V)> >()) ::x10::util::Box<TPMGL(V)>());
        
        //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Box.x10"
        TPMGL(V) x__117628 = ::x10aux::nullCheck(e)->FMGL(value);
        alloc__117629->FMGL(value) = x__117628;
        
        //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        return alloc__117629;
        
    }
    
    //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    return ::x10aux::class_cast_unchecked< ::x10::util::Box<TPMGL(V)>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
    
}

//#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(K), class TPMGL(V)> ::x10::util::Set<TPMGL(K)>*
  x10::util::HashMap<TPMGL(K), TPMGL(V)>::keySet() {
    ::x10::util::HashMap__KeySet<TPMGL(K), TPMGL(V)>* alloc__117630 =
       (new (::x10aux::alloc_z< ::x10::util::HashMap__KeySet<TPMGL(K), TPMGL(V)> >()) ::x10::util::HashMap__KeySet<TPMGL(K), TPMGL(V)>());
    (alloc__117630)->::x10::util::HashMap__KeySet<TPMGL(K), TPMGL(V)>::_constructor(
      this);
    return reinterpret_cast< ::x10::util::Set<TPMGL(K)>*>(alloc__117630);
    
}

//#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(K), class TPMGL(V)> ::x10::util::Set< ::x10::util::Map__Entry<TPMGL(K), TPMGL(V)>*>*
  x10::util::HashMap<TPMGL(K), TPMGL(V)>::entries() {
    ::x10::util::HashMap__EntrySet<TPMGL(K), TPMGL(V)>* alloc__117631 =
       (new (::x10aux::alloc_z< ::x10::util::HashMap__EntrySet<TPMGL(K), TPMGL(V)> >()) ::x10::util::HashMap__EntrySet<TPMGL(K), TPMGL(V)>());
    (alloc__117631)->::x10::util::HashMap__EntrySet<TPMGL(K), TPMGL(V)>::_constructor(
      this);
    return reinterpret_cast< ::x10::util::Set< ::x10::util::Map__Entry<TPMGL(K), TPMGL(V)>*>*>(alloc__117631);
    
}

//#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(K), class TPMGL(V)> ::x10::lang::Iterator< ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>*>*
  x10::util::HashMap<TPMGL(K), TPMGL(V)>::entriesIterator(
  ) {
    
    //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    ::x10::util::HashMap__EntriesIterator<TPMGL(K), TPMGL(V)>* iterator =
       (new (::x10aux::alloc_z< ::x10::util::HashMap__EntriesIterator<TPMGL(K), TPMGL(V)> >()) ::x10::util::HashMap__EntriesIterator<TPMGL(K), TPMGL(V)>());
    (iterator)->::x10::util::HashMap__EntriesIterator<TPMGL(K), TPMGL(V)>::_constructor(
      this);
    
    //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    iterator->advance();
    
    //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    return reinterpret_cast< ::x10::lang::Iterator< ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>*>*>(iterator);
    
}

//#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(K), class TPMGL(V)> x10_long x10::util::HashMap<TPMGL(K), TPMGL(V)>::size(
  ) {
    return this->FMGL(size);
    
}

//#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(K), class TPMGL(V)> void x10::util::HashMap<TPMGL(K), TPMGL(V)>::_constructor(
                                           ::x10::io::Deserializer* ds) {
    
    //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    (this)->::x10::util::HashMap<TPMGL(K), TPMGL(V)>::_constructor();
    
    //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    x10_long numEntries = ::x10aux::class_cast<x10_long>(::x10aux::nullCheck(ds)->x10::io::Deserializer::readAny());
    
    //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    x10_long i__88651max__117643 = numEntries;
    {
        x10_long i__117644;
        for (i__117644 = ((x10_long)1ll); ((i__117644) <= (i__88651max__117643));
             i__117644 = ((i__117644) + (((x10_long)1ll))))
        {
            
            //#line 290 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            TPMGL(K) key__117641 = ::x10aux::class_cast<TPMGL(K)>(::x10aux::nullCheck(ds)->x10::io::Deserializer::readAny());
            
            //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            TPMGL(V) value__117642 = ::x10aux::class_cast<TPMGL(V)>(::x10aux::nullCheck(ds)->x10::io::Deserializer::readAny());
            
            //#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
            this->x10::util::template HashMap<TPMGL(K), TPMGL(V)>::putInternal(
              key__117641, value__117642, true);
        }
    }
    
}
template<class TPMGL(K), class TPMGL(V)> ::x10::util::HashMap<TPMGL(K), TPMGL(V)>* x10::util::HashMap<TPMGL(K), TPMGL(V)>::_make(
                                           ::x10::io::Deserializer* ds)
{
    ::x10::util::HashMap<TPMGL(K), TPMGL(V)>* this_ = new (::x10aux::alloc_z< ::x10::util::HashMap<TPMGL(K), TPMGL(V)> >()) ::x10::util::HashMap<TPMGL(K), TPMGL(V)>();
    this_->_constructor(ds);
    return this_;
}



//#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(K), class TPMGL(V)> void x10::util::HashMap<TPMGL(K), TPMGL(V)>::serialize(
  ::x10::io::Serializer* s) {
    
    //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    ::x10::lang::Iterator< ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>*>* it =
      this->entriesIterator();
    
    //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    ::x10aux::nullCheck(s)->x10::io::Serializer::writeAny(
      ::x10aux::class_cast_unchecked< ::x10::lang::Any*>(this->size()));
    
    //#line 302 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    while (::x10::lang::Iterator< ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>*>::hasNext(::x10aux::nullCheck(it)))
    {
        
        //#line 303 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>* entry =
          ::x10::lang::Iterator< ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>*>::next(::x10aux::nullCheck(it));
        
        //#line 304 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        ::x10aux::nullCheck(s)->x10::io::Serializer::writeAny(
          ::x10aux::class_cast_unchecked< ::x10::lang::Any*>(::x10aux::nullCheck(entry)->getKey()));
        
        //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        ::x10aux::nullCheck(s)->x10::io::Serializer::writeAny(
          ::x10aux::class_cast_unchecked< ::x10::lang::Any*>(::x10aux::nullCheck(entry)->getValue()));
    }
    
}

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(K), class TPMGL(V)> ::x10::util::HashMap<TPMGL(K), TPMGL(V)>*
  x10::util::HashMap<TPMGL(K), TPMGL(V)>::x10__util__HashMap____this__x10__util__HashMap(
  ) {
    return this;
    
}
template<class TPMGL(K), class TPMGL(V)> void x10::util::HashMap<TPMGL(K), TPMGL(V)>::__fieldInitializers_x10_util_HashMap(
  ) {
    this->FMGL(table) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< ::x10::util::HashMap__HashEntry<TPMGL(K), TPMGL(V)>* >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(size) = ((x10_long)0ll);
    this->FMGL(occupation) = ((x10_long)0ll);
    this->FMGL(mask) = ((x10_long)0ll);
    this->FMGL(modCount) = ((x10_long)0ll);
}
template<class TPMGL(K), class TPMGL(V)> const ::x10aux::serialization_id_t x10::util::HashMap<TPMGL(K), TPMGL(V)>::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::HashMap<TPMGL(K), TPMGL(V)>::_deserializer);

template<class TPMGL(K), class TPMGL(V)> void x10::util::HashMap<TPMGL(K), TPMGL(V)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    /* NOTE: Implements x10.io.CustomSerialization */
    ::x10::io::Serializer* x10_buf = ::x10::io::Serializer::_make(&buf);
    this->serialize(x10_buf);
    buf.write(::x10aux::deserialization_buffer::CUSTOM_SERIALIZATION_END);
    
}

template<class TPMGL(K), class TPMGL(V)> ::x10::lang::Reference* ::x10::util::HashMap<TPMGL(K), TPMGL(V)>::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::HashMap<TPMGL(K), TPMGL(V)>* this_ = new (::x10aux::alloc_z< ::x10::util::HashMap<TPMGL(K), TPMGL(V)> >()) ::x10::util::HashMap<TPMGL(K), TPMGL(V)>();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

template<class TPMGL(K), class TPMGL(V)> void x10::util::HashMap<TPMGL(K), TPMGL(V)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    /* NOTE: Implements x10.io.CustomSerialization */
    ::x10::io::Deserializer* x10_buf = ::x10::io::Deserializer::_make(&buf);
    _constructor(x10_buf);
    ::x10aux::serialization_id_t tmp = buf.read< ::x10aux::serialization_id_t>();
    if (tmp != ::x10aux::deserialization_buffer::CUSTOM_SERIALIZATION_END) { ::x10aux::raiseSerializationProtocolError(); }
    
}

#endif // X10_UTIL_HASHMAP_H_IMPLEMENTATION
#endif // __X10_UTIL_HASHMAP_H_NODEPS
