#ifndef __X10_UTIL_HASHMAP__ENTRYSET_H
#define __X10_UTIL_HASHMAP__ENTRYSET_H

#include <x10rt.h>


#define X10_UTIL_ABSTRACTCOLLECTION_H_NODEPS
#include <x10/util/AbstractCollection.h>
#undef X10_UTIL_ABSTRACTCOLLECTION_H_NODEPS
namespace x10 { namespace util { 
template<class TPMGL(Key), class TPMGL(Val)> class Map__Entry;
} } 
#define X10_UTIL_SET_H_NODEPS
#include <x10/util/Set.h>
#undef X10_UTIL_SET_H_NODEPS
namespace x10 { namespace util { 
template<class TPMGL(K), class TPMGL(V)> class HashMap;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Iterator;
} } 
namespace x10 { namespace util { 
template<class TPMGL(S), class TPMGL(T)> class MapIterator;
} } 
namespace x10 { namespace util { 
template<class TPMGL(Key), class TPMGL(Value)> class HashMap__HashEntry;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(Z1), class TPMGL(U)> class Fun_0_1;
} } 
namespace x10 { namespace lang { 
class UnsupportedOperationException;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace util { 

template<class TPMGL(Key), class TPMGL(Value)> class HashMap__EntrySet;
template <> class HashMap__EntrySet<void, void>;
template<class TPMGL(Key), class TPMGL(Value)> class HashMap__EntrySet : public ::x10::util::AbstractCollection< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>
  {
    public:
    RTT_H_DECLS_CLASS
    
    static ::x10aux::itable_entry _itables[6];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static typename ::x10::util::Container< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::template itable< ::x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)> > _itable_0;
    
    static ::x10::lang::Any::itable< ::x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)> > _itable_1;
    
    static typename ::x10::lang::Iterable< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::template itable< ::x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)> > _itable_2;
    
    static typename ::x10::util::Collection< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::template itable< ::x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)> > _itable_3;
    
    static typename ::x10::util::Set< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::template itable< ::x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)> > _itable_4;
    
    ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* FMGL(map);
    
    void _constructor(::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* map);
    
    static ::x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>* _make(
             ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* map);
    
    virtual ::x10::lang::Iterator< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>*
      iterator();
    virtual x10_boolean contains(::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>* k);
    virtual x10_boolean add(::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>* k);
    virtual x10_boolean remove(::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>* k);
    virtual ::x10::util::Container< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>*
      clone();
    virtual x10_long size();
    virtual ::x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>*
      x10__util__HashMap__EntrySet____this__x10__util__HashMap__EntrySet(
      );
    virtual void __fieldInitializers_x10_util_HashMap_EntrySet(
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

template<class TPMGL(Key), class TPMGL(Value)> ::x10aux::RuntimeType x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::rtt;
template<class TPMGL(Key), class TPMGL(Value)> void x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::util::HashMap__EntrySet<void, void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::util::AbstractCollection< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*> >(), ::x10aux::getRTT< ::x10::util::Set< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*> >()};
    const ::x10aux::RuntimeType* params[2] = { ::x10aux::getRTT<TPMGL(Key)>(), ::x10aux::getRTT<TPMGL(Value)>()};
    ::x10aux::RuntimeType::Variance variances[2] = { ::x10aux::RuntimeType::invariant, ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.util.HashMap.EntrySet";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 2, parents, 2, params, variances);
}

template <> class HashMap__EntrySet<void, void> : public ::x10::util::AbstractCollection<void>
{
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    
};

} } 
#endif // X10_UTIL_HASHMAP__ENTRYSET_H

namespace x10 { namespace util { 
template<class TPMGL(Key), class TPMGL(Value)> class HashMap__EntrySet;
} } 

#ifndef X10_UTIL_HASHMAP__ENTRYSET_H_NODEPS
#define X10_UTIL_HASHMAP__ENTRYSET_H_NODEPS
#include <x10/util/AbstractCollection.h>
#include <x10/util/Map__Entry.h>
#include <x10/util/Set.h>
#include <x10/util/HashMap.h>
#include <x10/lang/Iterator.h>
#include <x10/util/MapIterator.h>
#include <x10/util/HashMap__HashEntry.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/UnsupportedOperationException.h>
#include <x10/lang/Long.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_UTIL_HASHMAP__ENTRYSET_H_GENERICS
#define X10_UTIL_HASHMAP__ENTRYSET_H_GENERICS
#endif // X10_UTIL_HASHMAP__ENTRYSET_H_GENERICS
#ifndef X10_UTIL_HASHMAP__ENTRYSET_H_IMPLEMENTATION
#define X10_UTIL_HASHMAP__ENTRYSET_H_IMPLEMENTATION
#include <x10/util/HashMap__EntrySet.h>

#ifndef X10_UTIL_HASHMAP__ENTRYSET__CLOSURE__2_CLOSURE
#define X10_UTIL_HASHMAP__ENTRYSET__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
template<class TPMGL(Key), class TPMGL(Value)> class x10_util_HashMap__EntrySet__closure__2 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_1< ::x10::util::HashMap__HashEntry<TPMGL(Key), TPMGL(Value)>*, ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::template itable <x10_util_HashMap__EntrySet__closure__2<TPMGL(Key),TPMGL(Value) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>* __apply(::x10::util::HashMap__HashEntry<TPMGL(Key), TPMGL(Value)>* e__117638) {
        
        //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
        return reinterpret_cast< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>(e__117638);
        
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_HashMap__EntrySet__closure__2<TPMGL(Key),TPMGL(Value) >* storage = ::x10aux::alloc_z<x10_util_HashMap__EntrySet__closure__2<TPMGL(Key),TPMGL(Value) > >();
        buf.record_reference(storage);
        x10_util_HashMap__EntrySet__closure__2<TPMGL(Key),TPMGL(Value) >* this_ = new (storage) x10_util_HashMap__EntrySet__closure__2<TPMGL(Key),TPMGL(Value) >();
        return this_;
    }
    
    x10_util_HashMap__EntrySet__closure__2() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::util::HashMap__HashEntry<TPMGL(Key), TPMGL(Value)>*, ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::util::HashMap__HashEntry<TPMGL(Key), TPMGL(Value)>*, ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10:273";
    }

};

template<class TPMGL(Key), class TPMGL(Value)> typename ::x10::lang::Fun_0_1< ::x10::util::HashMap__HashEntry<TPMGL(Key), TPMGL(Value)>*, ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::template itable <x10_util_HashMap__EntrySet__closure__2<TPMGL(Key),TPMGL(Value) > >x10_util_HashMap__EntrySet__closure__2<TPMGL(Key),TPMGL(Value) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_HashMap__EntrySet__closure__2<TPMGL(Key),TPMGL(Value) >::__apply, &x10_util_HashMap__EntrySet__closure__2<TPMGL(Key),TPMGL(Value) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(Key), class TPMGL(Value)> ::x10aux::itable_entry x10_util_HashMap__EntrySet__closure__2<TPMGL(Key),TPMGL(Value) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::util::HashMap__HashEntry<TPMGL(Key), TPMGL(Value)>*, ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*> >, &x10_util_HashMap__EntrySet__closure__2<TPMGL(Key),TPMGL(Value) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(Key), class TPMGL(Value)> const ::x10aux::serialization_id_t x10_util_HashMap__EntrySet__closure__2<TPMGL(Key),TPMGL(Value) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_HashMap__EntrySet__closure__2<TPMGL(Key),TPMGL(Value) >::_deserialize);

#endif // X10_UTIL_HASHMAP__ENTRYSET__CLOSURE__2_CLOSURE
template<class TPMGL(Key), class TPMGL(Value)> typename ::x10::util::Container< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::template itable< ::x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)> >  x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::_itable_0(&x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::clone, &x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::contains, &::x10::util::AbstractContainer< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::containsAll, &::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::util::AbstractContainer< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::isEmpty, &x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::iterator, &x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::size, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(Key), class TPMGL(Value)> ::x10::lang::Any::itable< ::x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)> >  x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(Key), class TPMGL(Value)> typename ::x10::lang::Iterable< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::template itable< ::x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)> >  x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::_itable_2(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::iterator, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(Key), class TPMGL(Value)> typename ::x10::util::Collection< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::template itable< ::x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)> >  x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::_itable_3(&x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::add, &::x10::util::AbstractCollection< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::addAll, &::x10::util::AbstractCollection< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::addAllWhere, &::x10::util::AbstractCollection< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::clear, &x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::clone, &x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::contains, &::x10::util::AbstractContainer< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::containsAll, &::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::util::AbstractContainer< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::isEmpty, &x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::iterator, &x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::remove, &::x10::util::AbstractCollection< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::removeAll, &::x10::util::AbstractCollection< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::removeAllWhere, &::x10::util::AbstractCollection< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::retainAll, &x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::size, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(Key), class TPMGL(Value)> typename ::x10::util::Set< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::template itable< ::x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)> >  x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::_itable_4(&x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::add, &::x10::util::AbstractCollection< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::addAll, &::x10::util::AbstractCollection< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::addAllWhere, &::x10::util::AbstractCollection< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::clear, &x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::clone, &x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::contains, &::x10::util::AbstractContainer< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::containsAll, &::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::util::AbstractContainer< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::isEmpty, &x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::iterator, &x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::remove, &::x10::util::AbstractCollection< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::removeAll, &::x10::util::AbstractCollection< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::removeAllWhere, &::x10::util::AbstractCollection< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::retainAll, &x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::size, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(Key), class TPMGL(Value)> ::x10aux::itable_entry x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::_itables[6] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::util::Container< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*> >, &_itable_2), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::util::Collection< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*> >, &_itable_3), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::util::Set< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*> >, &_itable_4), ::x10aux::itable_entry(NULL, (void*)"::x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>")};

//#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"

//#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(Key), class TPMGL(Value)> void x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::_constructor(
                                                 ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* map) {
    (this)->::x10::util::AbstractCollection< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::_constructor();
    
    //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    ::x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>* this__117637 =
      this;
    
    //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    this->FMGL(map) = map;
}
template<class TPMGL(Key), class TPMGL(Value)> ::x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>* x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::_make(
                                                 ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>* map)
{
    ::x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>* this_ = new (::x10aux::alloc_z< ::x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)> >()) ::x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>();
    this_->_constructor(map);
    return this_;
}



//#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(Key), class TPMGL(Value)> ::x10::lang::Iterator< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>*
  x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::iterator(
  ) {
    
    //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    ::x10::util::MapIterator< ::x10::util::HashMap__HashEntry<TPMGL(Key), TPMGL(Value)>*, ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>* alloc__117640 =
       (new (::x10aux::alloc_z< ::x10::util::MapIterator< ::x10::util::HashMap__HashEntry<TPMGL(Key), TPMGL(Value)>*, ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*> >()) ::x10::util::MapIterator< ::x10::util::HashMap__HashEntry<TPMGL(Key), TPMGL(Value)>*, ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>());
    
    //#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
    ::x10::lang::Iterator< ::x10::util::HashMap__HashEntry<TPMGL(Key), TPMGL(Value)>*>* i__117639 =
      ::x10aux::nullCheck(this->FMGL(map))->entriesIterator();
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
    alloc__117640->FMGL(i) = i__117639;
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/MapIterator.x10"
    alloc__117640->FMGL(f) = reinterpret_cast< ::x10::lang::Fun_0_1< ::x10::util::HashMap__HashEntry<TPMGL(Key), TPMGL(Value)>*, ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1< ::x10::util::HashMap__HashEntry<TPMGL(Key), TPMGL(Value)>*, ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*> >(sizeof(x10_util_HashMap__EntrySet__closure__2<TPMGL(Key),TPMGL(Value)>)))x10_util_HashMap__EntrySet__closure__2<TPMGL(Key),TPMGL(Value)>()));
    
    //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
    return reinterpret_cast< ::x10::lang::Iterator< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>*>(alloc__117640);
    
}

//#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(Key), class TPMGL(Value)> x10_boolean
  x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::contains(
  ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>* k) {
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
}

//#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(Key), class TPMGL(Value)> x10_boolean
  x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::add(
  ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>* k) {
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
}

//#line 278 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(Key), class TPMGL(Value)> x10_boolean
  x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::remove(
  ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>* k) {
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
}

//#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(Key), class TPMGL(Value)> ::x10::util::Container< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>*
  x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::clone(
  ) {
    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
}

//#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(Key), class TPMGL(Value)> x10_long x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::size(
  ) {
    return ::x10aux::nullCheck(this->FMGL(map))->size();
    
}

//#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/HashMap.x10"
template<class TPMGL(Key), class TPMGL(Value)> ::x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>*
  x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::x10__util__HashMap__EntrySet____this__x10__util__HashMap__EntrySet(
  ) {
    return this;
    
}
template<class TPMGL(Key), class TPMGL(Value)> void x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::__fieldInitializers_x10_util_HashMap_EntrySet(
  ) {
 
}
template<class TPMGL(Key), class TPMGL(Value)> const ::x10aux::serialization_id_t x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::_deserializer);

template<class TPMGL(Key), class TPMGL(Value)> void x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::util::AbstractCollection< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::_serialize_body(buf);
    buf.write(this->FMGL(map));
    
}

template<class TPMGL(Key), class TPMGL(Value)> ::x10::lang::Reference* ::x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>* this_ = new (::x10aux::alloc_z< ::x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)> >()) ::x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

template<class TPMGL(Key), class TPMGL(Value)> void x10::util::HashMap__EntrySet<TPMGL(Key), TPMGL(Value)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::util::AbstractCollection< ::x10::util::Map__Entry<TPMGL(Key), TPMGL(Value)>*>::_deserialize_body(buf);
    FMGL(map) = buf.read< ::x10::util::HashMap<TPMGL(Key), TPMGL(Value)>*>();
}

#endif // X10_UTIL_HASHMAP__ENTRYSET_H_IMPLEMENTATION
#endif // __X10_UTIL_HASHMAP__ENTRYSET_H_NODEPS
