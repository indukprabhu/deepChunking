#ifndef __X10_UTIL_ARRAYLIST_H
#define __X10_UTIL_ARRAYLIST_H

#include <x10rt.h>


#define X10_UTIL_ABSTRACTCOLLECTION_H_NODEPS
#include <x10/util/AbstractCollection.h>
#undef X10_UTIL_ABSTRACTCOLLECTION_H_NODEPS
#define X10_UTIL_LIST_H_NODEPS
#include <x10/util/List.h>
#undef X10_UTIL_LIST_H_NODEPS
namespace x10 { namespace util { 
template<class TPMGL(T)> class GrowableRail;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class Container;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace lang { 
class Unsafe;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class ListIterator;
} } 
namespace x10 { namespace util { 
template<class TPMGL(S)> class ArrayList__It;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Comparable;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(Z1), class TPMGL(Z2), class TPMGL(U)> class Fun_0_2;
} } 
namespace x10 { namespace util { 
class RailUtils;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace util { 
class StringBuilder;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace util { 

template<class TPMGL(T)> class ArrayList;
template <> class ArrayList<void>;
template<class TPMGL(T)> class ArrayList : public ::x10::util::AbstractCollection<TPMGL(T)>
  {
    public:
    RTT_H_DECLS_CLASS
    
    static ::x10aux::itable_entry _itables[9];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static typename ::x10::util::Container<TPMGL(T)>::template itable< ::x10::util::ArrayList<TPMGL(T)> > _itable_0;
    
    static ::x10::lang::Any::itable< ::x10::util::ArrayList<TPMGL(T)> > _itable_1;
    
    static typename ::x10::lang::Iterable<TPMGL(T)>::template itable< ::x10::util::ArrayList<TPMGL(T)> > _itable_2;
    
    static typename ::x10::util::Collection<TPMGL(T)>::template itable< ::x10::util::ArrayList<TPMGL(T)> > _itable_3;
    
    static typename ::x10::util::List<TPMGL(T)>::template itable< ::x10::util::ArrayList<TPMGL(T)> > _itable_4;
    
    static typename ::x10::util::Indexed<TPMGL(T)>::template itable< ::x10::util::ArrayList<TPMGL(T)> > _itable_5;
    
    static typename ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>::template itable< ::x10::util::ArrayList<TPMGL(T)> > _itable_6;
    
    static typename ::x10::lang::Settable<x10_long, TPMGL(T)>::template itable< ::x10::util::ArrayList<TPMGL(T)> > _itable_7;
    
    ::x10::util::GrowableRail<TPMGL(T)>* FMGL(a);
    
    virtual x10_boolean contains(TPMGL(T) v);
    virtual void clear();
    virtual ::x10::util::Container<TPMGL(T)>* clone();
    virtual x10_boolean add(TPMGL(T) v);
    virtual x10_boolean remove(TPMGL(T) v);
    virtual void addBefore(x10_long i, TPMGL(T) v);
    virtual TPMGL(T) __set(x10_long i, TPMGL(T) v);
    virtual TPMGL(T) set(TPMGL(T) v, x10_long i);
    virtual TPMGL(T) removeAt(x10_long i);
    virtual TPMGL(T) __apply(x10_long i);
    virtual TPMGL(T) get(x10_long i);
    virtual x10_long size();
    virtual x10_boolean isEmpty();
    virtual ::x10::lang::Rail< TPMGL(T) >* toRail();
    void _constructor();
    
    static ::x10::util::ArrayList<TPMGL(T)>* _make();
    
    void _constructor(x10_long size);
    
    static ::x10::util::ArrayList<TPMGL(T)>* _make(x10_long size);
    
    virtual TPMGL(T) removeFirst();
    virtual TPMGL(T) removeLast();
    virtual TPMGL(T) getFirst();
    virtual TPMGL(T) getLast();
    virtual ::x10::util::List<x10_long>* indices();
    virtual ::x10::util::List<TPMGL(T)>* subList(x10_long begin, x10_long end);
    virtual x10_long indexOf(TPMGL(T) v);
    virtual x10_long indexOf(x10_long index, TPMGL(T) v);
    virtual x10_long lastIndexOf(TPMGL(T) v);
    virtual x10_long lastIndexOf(x10_long index, TPMGL(T) v);
    virtual ::x10::lang::Rail< TPMGL(T) >* moveSectionToRail(x10_long i,
                                                             x10_long j);
    virtual ::x10::lang::Iterator<TPMGL(T)>* iterator();
    virtual ::x10::util::ListIterator<TPMGL(T)>* iteratorFrom(x10_long i);
    virtual void reverse();
    virtual void sort();
    virtual void sort(::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>* cmp);
    void exch(::x10::util::GrowableRail<TPMGL(T)>* a, x10_long i,
              x10_long j);
    virtual x10_long binarySearch(TPMGL(T) key, ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>* cmp);
    virtual x10_long binarySearch(TPMGL(T) key);
    virtual ::x10::lang::String* toString();
    virtual ::x10::util::ArrayList<TPMGL(T)>* x10__util__ArrayList____this__x10__util__ArrayList(
      );
    virtual void __fieldInitializers_x10_util_ArrayList();
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: virtual ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

template<class TPMGL(T)> ::x10aux::RuntimeType x10::util::ArrayList<TPMGL(T)>::rtt;
template<class TPMGL(T)> void x10::util::ArrayList<TPMGL(T)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::util::ArrayList<void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::util::AbstractCollection<TPMGL(T)> >(), ::x10aux::getRTT< ::x10::util::List<TPMGL(T)> >()};
    const ::x10aux::RuntimeType* params[1] = { ::x10aux::getRTT<TPMGL(T)>()};
    ::x10aux::RuntimeType::Variance variances[1] = { ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.util.ArrayList";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 2, parents, 1, params, variances);
}

template <> class ArrayList<void> : public ::x10::util::AbstractCollection<void>
{
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    template<class TPMGL(T)> static ::x10::util::ArrayList<TPMGL(T)>*
      make(::x10::util::Container<TPMGL(T)>* c);
    
    
};

} } 
#endif // X10_UTIL_ARRAYLIST_H

namespace x10 { namespace util { 
template<class TPMGL(T)> class ArrayList;
} } 

#ifndef X10_UTIL_ARRAYLIST_H_NODEPS
#define X10_UTIL_ARRAYLIST_H_NODEPS
#include <x10/util/AbstractCollection.h>
#include <x10/util/List.h>
#include <x10/util/GrowableRail.h>
#include <x10/util/Container.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Long.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Any.h>
#include <x10/lang/Unsafe.h>
#include <x10/util/ListIterator.h>
#include <x10/util/ArrayList__It.h>
#include <x10/lang/Comparable.h>
#include <x10/lang/Fun_0_2.h>
#include <x10/lang/Int.h>
#include <x10/util/RailUtils.h>
#include <x10/lang/String.h>
#include <x10/util/StringBuilder.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_UTIL_ARRAYLIST_H_GENERICS
#define X10_UTIL_ARRAYLIST_H_GENERICS
#endif // X10_UTIL_ARRAYLIST_H_GENERICS
#ifndef X10_UTIL_ARRAYLIST_H_IMPLEMENTATION
#define X10_UTIL_ARRAYLIST_H_IMPLEMENTATION
#include <x10/util/ArrayList.h>

#ifndef X10_UTIL_ARRAYLIST__CLOSURE__1_CLOSURE
#define X10_UTIL_ARRAYLIST__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_2.h>
template<class TPMGL(T)> class x10_util_ArrayList__closure__1 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>::template itable <x10_util_ArrayList__closure__1<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_int __apply(TPMGL(T) x, TPMGL(T) y) {
        return ::x10::lang::Comparable< TPMGL(T) >::compareTo(::x10aux::class_cast_unchecked< ::x10::lang::Comparable< TPMGL(T) >*>(x), y);
        
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_ArrayList__closure__1<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_util_ArrayList__closure__1<TPMGL(T) > >();
        buf.record_reference(storage);
        x10_util_ArrayList__closure__1<TPMGL(T) >* this_ = new (storage) x10_util_ArrayList__closure__1<TPMGL(T) >();
        return this_;
    }
    
    x10_util_ArrayList__closure__1() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10:219";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>::template itable <x10_util_ArrayList__closure__1<TPMGL(T) > >x10_util_ArrayList__closure__1<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_ArrayList__closure__1<TPMGL(T) >::__apply, &x10_util_ArrayList__closure__1<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_util_ArrayList__closure__1<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int> >, &x10_util_ArrayList__closure__1<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_ArrayList__closure__1<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_ArrayList__closure__1<TPMGL(T) >::_deserialize);

#endif // X10_UTIL_ARRAYLIST__CLOSURE__1_CLOSURE
#ifndef X10_UTIL_ARRAYLIST__CLOSURE__2_CLOSURE
#define X10_UTIL_ARRAYLIST__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_2.h>
template<class TPMGL(T)> class x10_util_ArrayList__closure__2 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>::template itable <x10_util_ArrayList__closure__2<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_int __apply(TPMGL(T) x, TPMGL(T) y) {
        return ::x10::lang::Comparable< TPMGL(T) >::compareTo(::x10aux::class_cast_unchecked< ::x10::lang::Comparable< TPMGL(T) >*>(x), y);
        
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_ArrayList__closure__2<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_util_ArrayList__closure__2<TPMGL(T) > >();
        buf.record_reference(storage);
        x10_util_ArrayList__closure__2<TPMGL(T) >* this_ = new (storage) x10_util_ArrayList__closure__2<TPMGL(T) >();
        return this_;
    }
    
    x10_util_ArrayList__closure__2() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10:241";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>::template itable <x10_util_ArrayList__closure__2<TPMGL(T) > >x10_util_ArrayList__closure__2<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_ArrayList__closure__2<TPMGL(T) >::__apply, &x10_util_ArrayList__closure__2<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_util_ArrayList__closure__2<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int> >, &x10_util_ArrayList__closure__2<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_util_ArrayList__closure__2<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_ArrayList__closure__2<TPMGL(T) >::_deserialize);

#endif // X10_UTIL_ARRAYLIST__CLOSURE__2_CLOSURE
template<class TPMGL(T)> typename ::x10::util::Container<TPMGL(T)>::template itable< ::x10::util::ArrayList<TPMGL(T)> >  x10::util::ArrayList<TPMGL(T)>::_itable_0(&x10::util::ArrayList<TPMGL(T)>::clone, &x10::util::ArrayList<TPMGL(T)>::contains, &::x10::util::AbstractContainer<TPMGL(T)>::containsAll, &::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::util::ArrayList<TPMGL(T)>::isEmpty, &x10::util::ArrayList<TPMGL(T)>::iterator, &x10::util::ArrayList<TPMGL(T)>::size, &x10::util::ArrayList<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10::lang::Any::itable< ::x10::util::ArrayList<TPMGL(T)> >  x10::util::ArrayList<TPMGL(T)>::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::util::ArrayList<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> typename ::x10::lang::Iterable<TPMGL(T)>::template itable< ::x10::util::ArrayList<TPMGL(T)> >  x10::util::ArrayList<TPMGL(T)>::_itable_2(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::util::ArrayList<TPMGL(T)>::iterator, &x10::util::ArrayList<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> typename ::x10::util::Collection<TPMGL(T)>::template itable< ::x10::util::ArrayList<TPMGL(T)> >  x10::util::ArrayList<TPMGL(T)>::_itable_3(&x10::util::ArrayList<TPMGL(T)>::add, &::x10::util::AbstractCollection<TPMGL(T)>::addAll, &::x10::util::AbstractCollection<TPMGL(T)>::addAllWhere, &x10::util::ArrayList<TPMGL(T)>::clear, &x10::util::ArrayList<TPMGL(T)>::clone, &x10::util::ArrayList<TPMGL(T)>::contains, &::x10::util::AbstractContainer<TPMGL(T)>::containsAll, &::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::util::ArrayList<TPMGL(T)>::isEmpty, &x10::util::ArrayList<TPMGL(T)>::iterator, &x10::util::ArrayList<TPMGL(T)>::remove, &::x10::util::AbstractCollection<TPMGL(T)>::removeAll, &::x10::util::AbstractCollection<TPMGL(T)>::removeAllWhere, &::x10::util::AbstractCollection<TPMGL(T)>::retainAll, &x10::util::ArrayList<TPMGL(T)>::size, &x10::util::ArrayList<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> typename ::x10::util::List<TPMGL(T)>::template itable< ::x10::util::ArrayList<TPMGL(T)> >  x10::util::ArrayList<TPMGL(T)>::_itable_4(&x10::util::ArrayList<TPMGL(T)>::add, &::x10::util::AbstractCollection<TPMGL(T)>::addAll, &::x10::util::AbstractCollection<TPMGL(T)>::addAllWhere, &x10::util::ArrayList<TPMGL(T)>::addBefore, &x10::util::ArrayList<TPMGL(T)>::clear, &x10::util::ArrayList<TPMGL(T)>::clone, &x10::util::ArrayList<TPMGL(T)>::contains, &::x10::util::AbstractContainer<TPMGL(T)>::containsAll, &::x10::lang::X10Class::equals, &x10::util::ArrayList<TPMGL(T)>::getFirst, &x10::util::ArrayList<TPMGL(T)>::getLast, &::x10::lang::X10Class::hashCode, &x10::util::ArrayList<TPMGL(T)>::indexOf, &x10::util::ArrayList<TPMGL(T)>::indexOf, &x10::util::ArrayList<TPMGL(T)>::indices, &x10::util::ArrayList<TPMGL(T)>::isEmpty, &x10::util::ArrayList<TPMGL(T)>::iterator, &x10::util::ArrayList<TPMGL(T)>::iteratorFrom, &x10::util::ArrayList<TPMGL(T)>::lastIndexOf, &x10::util::ArrayList<TPMGL(T)>::lastIndexOf, &x10::util::ArrayList<TPMGL(T)>::__apply, &x10::util::ArrayList<TPMGL(T)>::__set, &x10::util::ArrayList<TPMGL(T)>::remove, &::x10::util::AbstractCollection<TPMGL(T)>::removeAll, &::x10::util::AbstractCollection<TPMGL(T)>::removeAllWhere, &x10::util::ArrayList<TPMGL(T)>::removeAt, &x10::util::ArrayList<TPMGL(T)>::removeFirst, &x10::util::ArrayList<TPMGL(T)>::removeLast, &::x10::util::AbstractCollection<TPMGL(T)>::retainAll, &x10::util::ArrayList<TPMGL(T)>::reverse, &x10::util::ArrayList<TPMGL(T)>::size, &x10::util::ArrayList<TPMGL(T)>::sort, &x10::util::ArrayList<TPMGL(T)>::sort, &x10::util::ArrayList<TPMGL(T)>::subList, &x10::util::ArrayList<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> typename ::x10::util::Indexed<TPMGL(T)>::template itable< ::x10::util::ArrayList<TPMGL(T)> >  x10::util::ArrayList<TPMGL(T)>::_itable_5(&x10::util::ArrayList<TPMGL(T)>::clone, &x10::util::ArrayList<TPMGL(T)>::contains, &::x10::util::AbstractContainer<TPMGL(T)>::containsAll, &::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::util::ArrayList<TPMGL(T)>::isEmpty, &x10::util::ArrayList<TPMGL(T)>::iterator, &x10::util::ArrayList<TPMGL(T)>::__apply, &x10::util::ArrayList<TPMGL(T)>::size, &x10::util::ArrayList<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> typename ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>::template itable< ::x10::util::ArrayList<TPMGL(T)> >  x10::util::ArrayList<TPMGL(T)>::_itable_6(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::util::ArrayList<TPMGL(T)>::__apply, &x10::util::ArrayList<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> typename ::x10::lang::Settable<x10_long, TPMGL(T)>::template itable< ::x10::util::ArrayList<TPMGL(T)> >  x10::util::ArrayList<TPMGL(T)>::_itable_7(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::util::ArrayList<TPMGL(T)>::__set, &x10::util::ArrayList<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10::util::ArrayList<TPMGL(T)>::_itables[9] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::util::Container<TPMGL(T)> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable<TPMGL(T)> >, &_itable_2), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::util::Collection<TPMGL(T)> >, &_itable_3), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::util::List<TPMGL(T)> >, &_itable_4), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::util::Indexed<TPMGL(T)> >, &_itable_5), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)> >, &_itable_6), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Settable<x10_long, TPMGL(T)> >, &_itable_7), ::x10aux::itable_entry(NULL, (void*)"::x10::util::ArrayList<TPMGL(T)>")};

//#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"

//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> x10_boolean x10::util::ArrayList<TPMGL(T)>::contains(
  TPMGL(T) v) {
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    x10_long i__79281max__117141 = (((__extension__ ({
        ::x10::util::GrowableRail<TPMGL(T)>* this__117142 = this->FMGL(a);
        ::x10aux::nullCheck(this__117142)->FMGL(size);
    }))
    ) - (((x10_long)1ll)));
    {
        x10_long i__117143;
        for (i__117143 = ((x10_long)0ll); ((i__117143) <= (i__79281max__117141));
             i__117143 = ((i__117143) + (((x10_long)1ll)))) {
            x10_long i__117144 = i__117143;
            
            //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            if ((::x10aux::struct_equals(v, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
                  ? ((::x10aux::struct_equals((__extension__ ({
                                                  ::x10::util::GrowableRail<TPMGL(T)>* this__117135 =
                                                    this->FMGL(a);
                                                  
                                                  //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                  x10_long idx__117136 =
                                                    i__117144;
                                                  TPMGL(T) ret__117137;
                                                  
                                                  //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                  ret__117137 =
                                                    ::x10aux::nullCheck(::x10aux::nullCheck(this__117135)->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__apply(
                                                      idx__117136);
                                                  ret__117137;
                                              }))
                                              , reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
                  : (::x10aux::equals(v,(__extension__ ({
                         ::x10::util::GrowableRail<TPMGL(T)>* this__117138 =
                           this->FMGL(a);
                         
                         //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                         x10_long idx__117139 = i__117144;
                         TPMGL(T) ret__117140;
                         
                         //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                         ret__117140 = ::x10aux::nullCheck(::x10aux::nullCheck(this__117138)->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__apply(
                                         idx__117139);
                         ret__117140;
                     }))
                     ))) {
                
                //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                return true;
                
            }
            
        }
    }
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    return false;
    
}

//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> void x10::util::ArrayList<TPMGL(T)>::clear(
  ) {
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    ::x10::util::GrowableRail<TPMGL(T)>* this__117145 = this->FMGL(a);
    
    //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    (::x10aux::nullCheck(this__117145)->FMGL(data))->clear();
    
    //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    ::x10aux::nullCheck(this__117145)->FMGL(size) = ((x10_long)0ll);
}

//#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> ::x10::util::Container<TPMGL(T)>*
  x10::util::ArrayList<TPMGL(T)>::clone() {
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    ::x10::util::ArrayList<TPMGL(T)>* a =  (new (::x10aux::alloc_z< ::x10::util::ArrayList<TPMGL(T)> >()) ::x10::util::ArrayList<TPMGL(T)>());
    (a)->::x10::util::ArrayList<TPMGL(T)>::_constructor();
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    a->addAll(reinterpret_cast< ::x10::util::Container<TPMGL(T)>*>(this));
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    return reinterpret_cast< ::x10::util::Container<TPMGL(T)>*>(a);
    
}

//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> x10_boolean x10::util::ArrayList<TPMGL(T)>::add(
  TPMGL(T) v) {
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    ::x10aux::nullCheck(this->FMGL(a))->x10::util::template GrowableRail<TPMGL(T)>::add(
      v);
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    return true;
    
}

//#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> x10_boolean x10::util::ArrayList<TPMGL(T)>::remove(
  TPMGL(T) v) {
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    x10_long i__79299max__117152 = (((__extension__ ({
        ::x10::util::GrowableRail<TPMGL(T)>* this__117153 =
          this->FMGL(a);
        ::x10aux::nullCheck(this__117153)->FMGL(size);
    }))
    ) - (((x10_long)1ll)));
    {
        x10_long i__117154;
        for (i__117154 = ((x10_long)0ll); ((i__117154) <= (i__79299max__117152));
             i__117154 = ((i__117154) + (((x10_long)1ll))))
        {
            x10_long i__117155 = i__117154;
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            if ((::x10aux::struct_equals(v, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
                  ? ((::x10aux::struct_equals((__extension__ ({
                                                  ::x10::util::GrowableRail<TPMGL(T)>* this__117146 =
                                                    this->FMGL(a);
                                                  
                                                  //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                  x10_long idx__117147 =
                                                    i__117155;
                                                  TPMGL(T) ret__117148;
                                                  
                                                  //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                  ret__117148 =
                                                    ::x10aux::nullCheck(::x10aux::nullCheck(this__117146)->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__apply(
                                                      idx__117147);
                                                  ret__117148;
                                              }))
                                              , reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
                  : (::x10aux::equals(v,(__extension__ ({
                         ::x10::util::GrowableRail<TPMGL(T)>* this__117149 =
                           this->FMGL(a);
                         
                         //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                         x10_long idx__117150 = i__117155;
                         TPMGL(T) ret__117151;
                         
                         //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                         ret__117151 = ::x10aux::nullCheck(::x10aux::nullCheck(this__117149)->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__apply(
                                         idx__117150);
                         ret__117151;
                     }))
                     ))) {
                
                //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                this->removeAt(i__117155);
                
                //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                return true;
                
            }
            
        }
    }
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    return false;
    
}

//#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> void x10::util::ArrayList<TPMGL(T)>::addBefore(
  x10_long i, TPMGL(T) v) {
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    ::x10aux::nullCheck(this->FMGL(a))->x10::util::template GrowableRail<TPMGL(T)>::add(
      v);
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    {
        x10_long j;
        for (j = (((__extension__ ({
                 ::x10::util::GrowableRail<TPMGL(T)>* this__117007 =
                   this->FMGL(a);
                 ::x10aux::nullCheck(this__117007)->FMGL(size);
             }))
             ) - (((x10_long)1ll))); ((j) > (i)); j = ((j) - (((x10_long)1ll))))
        {
            
            //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            ::x10::util::GrowableRail<TPMGL(T)>* this__117156 =
              this->FMGL(a);
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            x10_long idx__117157 = j;
            TPMGL(T) v__117158 = (__extension__ ({
                
                //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                ::x10::util::GrowableRail<TPMGL(T)>* this__117159 =
                  this->FMGL(a);
                
                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                x10_long idx__117160 = ((j) - (((x10_long)1ll)));
                TPMGL(T) ret__117161;
                
                //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                ret__117161 = ::x10aux::nullCheck(::x10aux::nullCheck(this__117159)->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__apply(
                                idx__117160);
                ret__117161;
            }))
            ;
            
            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            if ((::x10aux::struct_equals(idx__117157, ::x10aux::nullCheck(this__117156)->FMGL(size))))
            {
                
                //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                ::x10aux::nullCheck(this__117156)->x10::util::template GrowableRail<TPMGL(T)>::add(
                  v__117158);
            } else {
                
                //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                ::x10aux::nullCheck(::x10aux::nullCheck(this__117156)->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__set(
                  idx__117157, v__117158);
            }
            
        }
    }
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    ::x10::util::GrowableRail<TPMGL(T)>* this__117162 = this->FMGL(a);
    
    //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    x10_long idx__117163 = i;
    TPMGL(T) v__117164 = v;
    
    //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    if ((::x10aux::struct_equals(idx__117163, ::x10aux::nullCheck(this__117162)->FMGL(size))))
    {
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ::x10aux::nullCheck(this__117162)->x10::util::template GrowableRail<TPMGL(T)>::add(
          v__117164);
    } else {
        
        //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ::x10aux::nullCheck(::x10aux::nullCheck(this__117162)->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__set(
          idx__117163, v__117164);
    }
    
}

//#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> TPMGL(T) x10::util::ArrayList<TPMGL(T)>::__set(
  x10_long i, TPMGL(T) v) {
    return this->set(v, i);
    
}

//#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> TPMGL(T) x10::util::ArrayList<TPMGL(T)>::set(
  TPMGL(T) v, x10_long i) {
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    ::x10::util::GrowableRail<TPMGL(T)>* this__117165 = this->FMGL(a);
    
    //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    x10_long idx__117166 = i;
    TPMGL(T) v__117167 = v;
    
    //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    if ((::x10aux::struct_equals(idx__117166, ::x10aux::nullCheck(this__117165)->FMGL(size))))
    {
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ::x10aux::nullCheck(this__117165)->x10::util::template GrowableRail<TPMGL(T)>::add(
          v__117167);
    } else {
        
        //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ::x10aux::nullCheck(::x10aux::nullCheck(this__117165)->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__set(
          idx__117166, v__117167);
    }
    
    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    return v;
    
}

//#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> TPMGL(T) x10::util::ArrayList<TPMGL(T)>::removeAt(
  x10_long i) {
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    TPMGL(T) v = (__extension__ ({
        ::x10::util::GrowableRail<TPMGL(T)>* this__117028 =
          this->FMGL(a);
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        x10_long idx__117027 = i;
        TPMGL(T) ret__117029;
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ret__117029 = ::x10aux::nullCheck(::x10aux::nullCheck(this__117028)->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__apply(
                        idx__117027);
        ret__117029;
    }))
    ;
    
    //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    {
        x10_long j;
        for (j = ((i) + (((x10_long)1ll))); ((j) < ((__extension__ ({
                                                ::x10::util::GrowableRail<TPMGL(T)>* this__117031 =
                                                  this->FMGL(a);
                                                ::x10aux::nullCheck(this__117031)->FMGL(size);
                                            }))
                                            )); j = ((j) + (((x10_long)1ll))))
        {
            
            //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            ::x10::util::GrowableRail<TPMGL(T)>* this__117168 =
              this->FMGL(a);
            
            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            x10_long idx__117169 = ((j) - (((x10_long)1ll)));
            TPMGL(T) v__117170 = (__extension__ ({
                
                //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                ::x10::util::GrowableRail<TPMGL(T)>* this__117171 =
                  this->FMGL(a);
                
                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                x10_long idx__117172 = j;
                TPMGL(T) ret__117173;
                
                //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                ret__117173 = ::x10aux::nullCheck(::x10aux::nullCheck(this__117171)->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__apply(
                                idx__117172);
                ret__117173;
            }))
            ;
            
            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            if ((::x10aux::struct_equals(idx__117169, ::x10aux::nullCheck(this__117168)->FMGL(size))))
            {
                
                //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                ::x10aux::nullCheck(this__117168)->x10::util::template GrowableRail<TPMGL(T)>::add(
                  v__117170);
            } else {
                
                //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                ::x10aux::nullCheck(::x10aux::nullCheck(this__117168)->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__set(
                  idx__117169, v__117170);
            }
            
        }
    }
    
    //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    ::x10aux::nullCheck(this->FMGL(a))->x10::util::template GrowableRail<TPMGL(T)>::removeLast();
    
    //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    return v;
    
}

//#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> TPMGL(T) x10::util::ArrayList<TPMGL(T)>::__apply(
  x10_long i) {
    ::x10::util::GrowableRail<TPMGL(T)>* this__117174 = this->FMGL(a);
    
    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    x10_long idx__117175 = i;
    TPMGL(T) ret__117176;
    
    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    ret__117176 = ::x10aux::nullCheck(::x10aux::nullCheck(this__117174)->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__apply(
                    idx__117175);
    
    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    return ret__117176;
    
}

//#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> TPMGL(T) x10::util::ArrayList<TPMGL(T)>::get(
  x10_long i) {
    ::x10::util::GrowableRail<TPMGL(T)>* this__117177 = this->FMGL(a);
    
    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    x10_long idx__117178 = i;
    TPMGL(T) ret__117179;
    
    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    ret__117179 = ::x10aux::nullCheck(::x10aux::nullCheck(this__117177)->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__apply(
                    idx__117178);
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    return ret__117179;
    
}

//#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> x10_long x10::util::ArrayList<TPMGL(T)>::size(
  ) {
    ::x10::util::GrowableRail<TPMGL(T)>* this__117180 = this->FMGL(a);
    return ::x10aux::nullCheck(this__117180)->FMGL(size);
    
}

//#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> x10_boolean x10::util::ArrayList<TPMGL(T)>::isEmpty(
  ) {
    return (::x10aux::struct_equals(this->size(), ((x10_long)0ll)));
    
}

//#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> ::x10::lang::Rail< TPMGL(T) >* x10::util::ArrayList<TPMGL(T)>::toRail(
  ) {
    return ::x10aux::nullCheck(this->FMGL(a))->x10::util::template GrowableRail<TPMGL(T)>::toRail();
    
}

//#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> void x10::util::ArrayList<TPMGL(T)>::_constructor(
                           ) {
    (this)->::x10::util::AbstractCollection<TPMGL(T)>::_constructor();
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    ::x10::util::ArrayList<TPMGL(T)>* this__117181 = this;
    
    //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    this->FMGL(a) = (__extension__ ({
        ::x10::util::GrowableRail<TPMGL(T)>* alloc__79276 =
           (new (::x10aux::alloc_z< ::x10::util::GrowableRail<TPMGL(T)> >()) ::x10::util::GrowableRail<TPMGL(T)>());
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        (alloc__79276)->::x10::util::GrowableRail<TPMGL(T)>::_constructor(
          ((x10_long)0ll));
        alloc__79276;
    }))
    ;
}
template<class TPMGL(T)> ::x10::util::ArrayList<TPMGL(T)>* x10::util::ArrayList<TPMGL(T)>::_make(
                           ) {
    ::x10::util::ArrayList<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::util::ArrayList<TPMGL(T)> >()) ::x10::util::ArrayList<TPMGL(T)>();
    this_->_constructor();
    return this_;
}



//#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> void x10::util::ArrayList<TPMGL(T)>::_constructor(
                           x10_long size) {
    (this)->::x10::util::AbstractCollection<TPMGL(T)>::_constructor();
    
    //#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    ::x10::util::ArrayList<TPMGL(T)>* this__117182 = this;
    
    //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    this->FMGL(a) = (__extension__ ({
        ::x10::util::GrowableRail<TPMGL(T)>* alloc__79277 =
           (new (::x10aux::alloc_z< ::x10::util::GrowableRail<TPMGL(T)> >()) ::x10::util::GrowableRail<TPMGL(T)>());
        (alloc__79277)->::x10::util::GrowableRail<TPMGL(T)>::_constructor(
          size);
        alloc__79277;
    }))
    ;
}
template<class TPMGL(T)> ::x10::util::ArrayList<TPMGL(T)>* x10::util::ArrayList<TPMGL(T)>::_make(
                           x10_long size) {
    ::x10::util::ArrayList<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::util::ArrayList<TPMGL(T)> >()) ::x10::util::ArrayList<TPMGL(T)>();
    this_->_constructor(size);
    return this_;
}



//#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> TPMGL(T) x10::util::ArrayList<TPMGL(T)>::removeFirst(
  ) {
    return this->removeAt(((x10_long)0ll));
    
}

//#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> TPMGL(T) x10::util::ArrayList<TPMGL(T)>::removeLast(
  ) {
    return this->removeAt((((__extension__ ({
                              ::x10::util::GrowableRail<TPMGL(T)>* this__117057 =
                                this->FMGL(a);
                              ::x10aux::nullCheck(this__117057)->FMGL(size);
                          }))
                          ) - (((x10_long)1ll))));
    
}

//#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> TPMGL(T) x10::util::ArrayList<TPMGL(T)>::getFirst(
  ) {
    return this->get(((x10_long)0ll));
    
}

//#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> TPMGL(T) x10::util::ArrayList<TPMGL(T)>::getLast(
  ) {
    return this->get((((__extension__ ({
                         ::x10::util::GrowableRail<TPMGL(T)>* this__117058 =
                           this->FMGL(a);
                         ::x10aux::nullCheck(this__117058)->FMGL(size);
                     }))
                     ) - (((x10_long)1ll))));
    
}

//#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> ::x10::util::List<x10_long>* x10::util::ArrayList<TPMGL(T)>::indices(
  ) {
    
    //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    ::x10::util::ArrayList<x10_long>* l =  (new (::x10aux::alloc_z< ::x10::util::ArrayList<x10_long> >()) ::x10::util::ArrayList<x10_long>());
    (l)->::x10::util::ArrayList<x10_long>::_constructor();
    
    //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    x10_long i__79317max__117183 = (((__extension__ ({
        ::x10::util::GrowableRail<TPMGL(T)>* this__117184 =
          this->FMGL(a);
        ::x10aux::nullCheck(this__117184)->FMGL(size);
    }))
    ) - (((x10_long)1ll)));
    {
        x10_long i__117185;
        for (i__117185 = ((x10_long)0ll); ((i__117185) <= (i__79317max__117183));
             i__117185 = ((i__117185) + (((x10_long)1ll))))
        {
            x10_long i__117186 = i__117185;
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            l->add(i__117186);
        }
    }
    
    //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    return reinterpret_cast< ::x10::util::List<x10_long>*>(l);
    
}

//#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> ::x10::util::List<TPMGL(T)>* x10::util::ArrayList<TPMGL(T)>::subList(
  x10_long begin, x10_long end) {
    
    //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    ::x10::util::ArrayList<TPMGL(T)>* l =  (new (::x10aux::alloc_z< ::x10::util::ArrayList<TPMGL(T)> >()) ::x10::util::ArrayList<TPMGL(T)>());
    (l)->::x10::util::ArrayList<TPMGL(T)>::_constructor();
    
    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    {
        x10_long i;
        for (i = begin; (((i) < ((__extension__ ({
                            ::x10::util::GrowableRail<TPMGL(T)>* this__117060 =
                              this->FMGL(a);
                            ::x10aux::nullCheck(this__117060)->FMGL(size);
                        }))
                        )) && ((i) < (end))); i = ((i) + (((x10_long)1ll))))
        {
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            l->add((__extension__ ({
                       ::x10::util::GrowableRail<TPMGL(T)>* this__117062 =
                         this->FMGL(a);
                       
                       //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                       x10_long idx__117061 = i;
                       TPMGL(T) ret__117063;
                       
                       //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                       ret__117063 = ::x10aux::nullCheck(::x10aux::nullCheck(this__117062)->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__apply(
                                       idx__117061);
                       ret__117063;
                   }))
                   );
        }
    }
    
    //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    return reinterpret_cast< ::x10::util::List<TPMGL(T)>*>(l);
    
}

//#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> x10_long x10::util::ArrayList<TPMGL(T)>::indexOf(
  TPMGL(T) v) {
    
    //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    return this->indexOf(((x10_long)0ll), v);
    
}

//#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> x10_long x10::util::ArrayList<TPMGL(T)>::indexOf(
  x10_long index, TPMGL(T) v) {
    
    //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    {
        x10_long i;
        for (i = index; ((i) < ((__extension__ ({
                            ::x10::util::GrowableRail<TPMGL(T)>* this__117065 =
                              this->FMGL(a);
                            ::x10aux::nullCheck(this__117065)->FMGL(size);
                        }))
                        )); i = ((i) + (((x10_long)1ll))))
        {
            
            //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            if ((::x10aux::struct_equals(v, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
                  ? ((::x10aux::struct_equals((__extension__ ({
                                                  ::x10::util::GrowableRail<TPMGL(T)>* this__117067 =
                                                    this->FMGL(a);
                                                  
                                                  //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                  x10_long idx__117066 =
                                                    i;
                                                  TPMGL(T) ret__117068;
                                                  
                                                  //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                  ret__117068 =
                                                    ::x10aux::nullCheck(::x10aux::nullCheck(this__117067)->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__apply(
                                                      idx__117066);
                                                  ret__117068;
                                              }))
                                              , reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
                  : (::x10aux::equals(v,(__extension__ ({
                         ::x10::util::GrowableRail<TPMGL(T)>* this__117071 =
                           this->FMGL(a);
                         
                         //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                         x10_long idx__117070 = i;
                         TPMGL(T) ret__117072;
                         
                         //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                         ret__117072 = ::x10aux::nullCheck(::x10aux::nullCheck(this__117071)->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__apply(
                                         idx__117070);
                         ret__117072;
                     }))
                     ))) {
                
                //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                return i;
                
            }
            
        }
    }
    
    //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    return ((x10_long)-1ll);
    
}

//#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> x10_long x10::util::ArrayList<TPMGL(T)>::lastIndexOf(
  TPMGL(T) v) {
    
    //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    return this->lastIndexOf((((__extension__ ({
                                 ::x10::util::GrowableRail<TPMGL(T)>* this__117074 =
                                   this->FMGL(a);
                                 ::x10aux::nullCheck(this__117074)->FMGL(size);
                             }))
                             ) - (((x10_long)1ll))), v);
    
}

//#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> x10_long x10::util::ArrayList<TPMGL(T)>::lastIndexOf(
  x10_long index, TPMGL(T) v) {
    
    //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    {
        x10_long i;
        for (i = index; ((i) >= (((x10_long)0ll))); i = ((i) - (((x10_long)1ll))))
        {
            
            //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            if ((::x10aux::struct_equals(v, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
                  ? ((::x10aux::struct_equals((__extension__ ({
                                                  ::x10::util::GrowableRail<TPMGL(T)>* this__117076 =
                                                    this->FMGL(a);
                                                  
                                                  //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                  x10_long idx__117075 =
                                                    i;
                                                  TPMGL(T) ret__117077;
                                                  
                                                  //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                                  ret__117077 =
                                                    ::x10aux::nullCheck(::x10aux::nullCheck(this__117076)->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__apply(
                                                      idx__117075);
                                                  ret__117077;
                                              }))
                                              , reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
                  : (::x10aux::equals(v,(__extension__ ({
                         ::x10::util::GrowableRail<TPMGL(T)>* this__117080 =
                           this->FMGL(a);
                         
                         //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                         x10_long idx__117079 = i;
                         TPMGL(T) ret__117081;
                         
                         //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                         ret__117081 = ::x10aux::nullCheck(::x10aux::nullCheck(this__117080)->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__apply(
                                         idx__117079);
                         ret__117081;
                     }))
                     ))) {
                
                //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
                return i;
                
            }
            
        }
    }
    
    //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    return ((x10_long)-1ll);
    
}

//#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> ::x10::lang::Rail< TPMGL(T) >* x10::util::ArrayList<TPMGL(T)>::moveSectionToRail(
  x10_long i, x10_long j) {
    return ::x10aux::nullCheck(this->FMGL(a))->x10::util::template GrowableRail<TPMGL(T)>::moveSectionToRail(
             i, j);
    
}

//#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> ::x10::lang::Iterator<TPMGL(T)>*
  x10::util::ArrayList<TPMGL(T)>::iterator() {
    
    //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    ::x10::util::ArrayList__It<TPMGL(T)>* alloc__117198 =
       (new (::x10aux::alloc_z< ::x10::util::ArrayList__It<TPMGL(T)> >()) ::x10::util::ArrayList__It<TPMGL(T)>());
    
    //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    ::x10::util::ArrayList<TPMGL(T)>* al__117197 = this;
    
    //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    ::x10::util::ArrayList<TPMGL(T)>* al__117196 = al__117197;
    
    //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    alloc__117198->FMGL(i) = ((x10_long)0ll);
    
    //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    alloc__117198->FMGL(al) = al__117196;
    
    //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    alloc__117198->FMGL(i) = ((x10_long)-1ll);
    
    //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    return reinterpret_cast< ::x10::lang::Iterator<TPMGL(T)>*>(reinterpret_cast< ::x10::util::ListIterator<TPMGL(T)>*>(alloc__117198));
    
}

//#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> ::x10::util::ListIterator<TPMGL(T)>*
  x10::util::ArrayList<TPMGL(T)>::iteratorFrom(x10_long i) {
    
    //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    ::x10::util::ArrayList__It<TPMGL(T)>* alloc__117201 =
       (new (::x10aux::alloc_z< ::x10::util::ArrayList__It<TPMGL(T)> >()) ::x10::util::ArrayList__It<TPMGL(T)>());
    
    //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    ::x10::util::ArrayList<TPMGL(T)>* al__117199 = this;
    x10_long i__117200 = i;
    
    //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    alloc__117201->FMGL(i) = ((x10_long)0ll);
    
    //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    alloc__117201->FMGL(al) = al__117199;
    
    //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    alloc__117201->FMGL(i) = i__117200;
    
    //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    return reinterpret_cast< ::x10::util::ListIterator<TPMGL(T)>*>(alloc__117201);
    
}

//#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> void x10::util::ArrayList<TPMGL(T)>::reverse(
  ) {
    
    //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    x10_long length = (__extension__ ({
        ::x10::util::GrowableRail<TPMGL(T)>* this__117112 =
          this->FMGL(a);
        ::x10aux::nullCheck(this__117112)->FMGL(size);
    }))
    ;
    
    //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    {
        x10_long i;
        for (i = ((x10_long)0ll); ((i) < (((length) / ::x10aux::zeroCheck(((x10_long)2ll)))));
             i = ((i) + (((x10_long)1ll)))) {
            
            //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            this->exch(this->FMGL(a), i, ((((length) - (((x10_long)1ll)))) - (i)));
        }
    }
    
}

//#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> void x10::util::ArrayList<TPMGL(T)>::sort(
  ) {
    this->sort(reinterpret_cast< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int> >(sizeof(x10_util_ArrayList__closure__1<TPMGL(T)>)))x10_util_ArrayList__closure__1<TPMGL(T)>())));
}

//#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> void x10::util::ArrayList<TPMGL(T)>::sort(
  ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>* cmp) {
    ::x10::util::RailUtils::template qsort< TPMGL(T) >((__extension__ ({
                                                           ::x10::util::GrowableRail<TPMGL(T)>* this__117113 =
                                                             this->FMGL(a);
                                                           ::x10aux::nullCheck(this__117113)->FMGL(data);
                                                       }))
                                                       , ((x10_long)0ll),
                                                       (((__extension__ ({
                                                           ::x10::util::GrowableRail<TPMGL(T)>* this__117114 =
                                                             this->FMGL(a);
                                                           ::x10aux::nullCheck(this__117114)->FMGL(size);
                                                       }))
                                                       ) - (((x10_long)1ll))),
                                                       cmp);
}

//#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> void x10::util::ArrayList<TPMGL(T)>::exch(
  ::x10::util::GrowableRail<TPMGL(T)>* a, x10_long i, x10_long j) {
    
    //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    TPMGL(T) temp = (__extension__ ({
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        x10_long idx__117115 = i;
        TPMGL(T) ret__117116;
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ret__117116 = ::x10aux::nullCheck(::x10aux::nullCheck(a)->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__apply(
                        idx__117115);
        ret__117116;
    }))
    ;
    
    //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    x10_long idx__117202 = i;
    TPMGL(T) v__117203 = (__extension__ ({
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        x10_long idx__117204 = j;
        TPMGL(T) ret__117205;
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ret__117205 = ::x10aux::nullCheck(::x10aux::nullCheck(a)->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__apply(
                        idx__117204);
        ret__117205;
    }))
    ;
    
    //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    if ((::x10aux::struct_equals(idx__117202, ::x10aux::nullCheck(a)->FMGL(size))))
    {
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ::x10aux::nullCheck(a)->x10::util::template GrowableRail<TPMGL(T)>::add(
          v__117203);
    } else {
        
        //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ::x10aux::nullCheck(::x10aux::nullCheck(a)->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__set(
          idx__117202, v__117203);
    }
    
    //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    x10_long idx__117206 = j;
    TPMGL(T) v__117207 = temp;
    
    //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
    if ((::x10aux::struct_equals(idx__117206, ::x10aux::nullCheck(a)->FMGL(size))))
    {
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ::x10aux::nullCheck(a)->x10::util::template GrowableRail<TPMGL(T)>::add(
          v__117207);
    } else {
        
        //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ::x10aux::nullCheck(::x10aux::nullCheck(a)->FMGL(data))->x10::lang::template Rail< TPMGL(T) >::__set(
          idx__117206, v__117207);
    }
    
}

//#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> x10_long x10::util::ArrayList<TPMGL(T)>::binarySearch(
  TPMGL(T) key, ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>* cmp) {
    return ::x10::util::RailUtils::template binarySearch< TPMGL(T) >(
             (__extension__ ({
                 ::x10::util::GrowableRail<TPMGL(T)>* this__117129 =
                   this->FMGL(a);
                 ::x10aux::nullCheck(this__117129)->FMGL(data);
             }))
             , key, ((x10_long)0ll), (__extension__ ({
                 ::x10::util::GrowableRail<TPMGL(T)>* this__117130 =
                   this->FMGL(a);
                 ::x10aux::nullCheck(this__117130)->FMGL(size);
             }))
             , cmp);
    
}

//#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> x10_long x10::util::ArrayList<TPMGL(T)>::binarySearch(
  TPMGL(T) key) {
    
    //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    return ::x10::util::RailUtils::template binarySearch< TPMGL(T) >(
             (__extension__ ({
                 ::x10::util::GrowableRail<TPMGL(T)>* this__117131 =
                   this->FMGL(a);
                 ::x10aux::nullCheck(this__117131)->FMGL(data);
             }))
             , key, ((x10_long)0ll), (__extension__ ({
                 ::x10::util::GrowableRail<TPMGL(T)>* this__117132 =
                   this->FMGL(a);
                 ::x10aux::nullCheck(this__117132)->FMGL(size);
             }))
             , reinterpret_cast< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(T), x10_int> >(sizeof(x10_util_ArrayList__closure__2<TPMGL(T)>)))x10_util_ArrayList__closure__2<TPMGL(T)>())));
    
}

//#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> ::x10::lang::String* x10::util::ArrayList<TPMGL(T)>::toString(
  ) {
    
    //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    ::x10::util::StringBuilder* sb =  (new (::x10aux::alloc_z< ::x10::util::StringBuilder>()) ::x10::util::StringBuilder());
    (sb)->::x10::util::StringBuilder::_constructor();
    
    //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    sb->add((__extension__ ({ static ::x10::lang::String* strLit__128593 = ::x10aux::makeStringLit("["); strLit__128593; })));
    
    //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    x10_long sz = (__extension__ ({
        
        //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
        x10_long a__117133 = this->size();
        ((a__117133) < (((x10_long)10ll))) ? (a__117133) : (((x10_long)10ll));
    }))
    ;
    
    //#line 253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    {
        x10_long i;
        for (i = ((x10_long)0ll); ((i) < (sz)); i = ((i) + (((x10_long)1ll))))
        {
            
            //#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            if (((i) > (((x10_long)0ll)))) {
                sb->add((__extension__ ({ static ::x10::lang::String* strLit__128595 = ::x10aux::makeStringLit(","); strLit__128595; })));
            }
            
            //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
            sb->add(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__128597 = ::x10aux::makeStringLit(""); strLit__128597; })), this->__apply(
                                                                                                                                                                   i)));
        }
    }
    
    //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    if (((sz) < (this->size()))) {
        sb->add(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__128602 = ::x10aux::makeStringLit("...(omitted "); strLit__128602; })), ((this->size()) - (sz))), (__extension__ ({ static ::x10::lang::String* strLit__128603 = ::x10aux::makeStringLit(" elements)"); strLit__128603; }))));
    }
    
    //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    sb->add((__extension__ ({ static ::x10::lang::String* strLit__128605 = ::x10aux::makeStringLit("]"); strLit__128605; })));
    
    //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    return sb->toString();
    
}

//#line 14 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
template<class TPMGL(T)> ::x10::util::ArrayList<TPMGL(T)>*
  x10::util::ArrayList<TPMGL(T)>::x10__util__ArrayList____this__x10__util__ArrayList(
  ) {
    return this;
    
}
template<class TPMGL(T)> void x10::util::ArrayList<TPMGL(T)>::__fieldInitializers_x10_util_ArrayList(
  ) {
 
}
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10::util::ArrayList<TPMGL(T)>::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::ArrayList<TPMGL(T)>::_deserializer);

template<class TPMGL(T)> void x10::util::ArrayList<TPMGL(T)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::util::AbstractCollection<TPMGL(T)>::_serialize_body(buf);
    buf.write(this->FMGL(a));
    
}

template<class TPMGL(T)> ::x10::lang::Reference* ::x10::util::ArrayList<TPMGL(T)>::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::ArrayList<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::util::ArrayList<TPMGL(T)> >()) ::x10::util::ArrayList<TPMGL(T)>();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

template<class TPMGL(T)> void x10::util::ArrayList<TPMGL(T)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::util::AbstractCollection<TPMGL(T)>::_deserialize_body(buf);
    FMGL(a) = buf.read< ::x10::util::GrowableRail<TPMGL(T)>*>();
}

template<class TPMGL(T)> ::x10::util::ArrayList<TPMGL(T)>*
  x10::util::ArrayList<void>::make(::x10::util::Container<TPMGL(T)>* c) {
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    ::x10::util::ArrayList<TPMGL(T)>* a =  (new (::x10aux::alloc_z< ::x10::util::ArrayList<TPMGL(T)> >()) ::x10::util::ArrayList<TPMGL(T)>());
    (a)->::x10::util::ArrayList<TPMGL(T)>::_constructor();
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    a->addAll(c);
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/ArrayList.x10"
    return a;
    
}
#endif // X10_UTIL_ARRAYLIST_H_IMPLEMENTATION
#endif // __X10_UTIL_ARRAYLIST_H_NODEPS
