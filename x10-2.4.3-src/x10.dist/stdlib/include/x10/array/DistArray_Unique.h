#ifndef __X10_ARRAY_DISTARRAY_UNIQUE_H
#define __X10_ARRAY_DISTARRAY_UNIQUE_H

#include <x10rt.h>


#define X10_ARRAY_DISTARRAY_H_NODEPS
#include <x10/array/DistArray.h>
#undef X10_ARRAY_DISTARRAY_H_NODEPS
#define X10_LANG_FUN_0_1_H_NODEPS
#include <x10/lang/Fun_0_1.h>
#undef X10_LANG_FUN_0_1_H_NODEPS
namespace x10 { namespace lang { 
class PlaceGroup;
} } 
namespace x10 { namespace lang { 
class PlaceGroup__SimplePlaceGroup;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(U)> class Fun_0_0;
} } 
namespace x10 { namespace array { 
template<class TPMGL(S)> class LocalState;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace array { 
class DenseIterationSpace_1;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
class Point;
} } 
namespace x10 { namespace compiler { 
class Inline;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace array { 

template<class TPMGL(T)> class DistArray_Unique;
template <> class DistArray_Unique<void>;
template<class TPMGL(T)> class DistArray_Unique : public ::x10::array::DistArray<TPMGL(T)>
  {
    public:
    RTT_H_DECLS_CLASS
    
    static ::x10aux::itable_entry _itables[4];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static typename ::x10::lang::Iterable< ::x10::lang::Point*>::template itable< ::x10::array::DistArray_Unique<TPMGL(T)> > _itable_0;
    
    static ::x10::lang::Any::itable< ::x10::array::DistArray_Unique<TPMGL(T)> > _itable_1;
    
    static typename ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>::template itable< ::x10::array::DistArray_Unique<TPMGL(T)> > _itable_2;
    
    x10_long rank();
    void _constructor();
    
    static ::x10::array::DistArray_Unique<TPMGL(T)>* _make();
    
    void _constructor(::x10::lang::Fun_0_0<TPMGL(T)>* init);
    
    static ::x10::array::DistArray_Unique<TPMGL(T)>* _make(::x10::lang::Fun_0_0<TPMGL(T)>* init);
    
    void _constructor(::x10::lang::PlaceGroup* pg, ::x10::lang::Fun_0_0<TPMGL(T)>* init);
    
    static ::x10::array::DistArray_Unique<TPMGL(T)>* _make(::x10::lang::PlaceGroup* pg,
                                                           ::x10::lang::Fun_0_0<TPMGL(T)>* init);
    
    virtual ::x10::array::IterationSpace* globalIndices();
    virtual ::x10::array::IterationSpace* localIndices();
    virtual ::x10::lang::Place place(x10_long i);
    virtual ::x10::lang::Place place(::x10::lang::Point* p);
    virtual TPMGL(T) __apply(x10_long i);
    virtual TPMGL(T) __apply(::x10::lang::Point* p);
    virtual TPMGL(T) __set(x10_long i, TPMGL(T) v);
    virtual TPMGL(T) __set(::x10::lang::Point* p, TPMGL(T) v);
    void validateIndex(x10_long i);
    virtual ::x10::array::DistArray_Unique<TPMGL(T)>* x10__array__DistArray_Unique____this__x10__array__DistArray_Unique(
      );
    virtual void __fieldInitializers_x10_array_DistArray_Unique(
      );
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

template<class TPMGL(T)> ::x10aux::RuntimeType x10::array::DistArray_Unique<TPMGL(T)>::rtt;
template<class TPMGL(T)> void x10::array::DistArray_Unique<TPMGL(T)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::array::DistArray_Unique<void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::array::DistArray<TPMGL(T)> >(), ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)> >()};
    const ::x10aux::RuntimeType* params[1] = { ::x10aux::getRTT<TPMGL(T)>()};
    ::x10aux::RuntimeType::Variance variances[1] = { ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.array.DistArray_Unique";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 2, parents, 1, params, variances);
}

template <> class DistArray_Unique<void> : public ::x10::array::DistArray<void>
{
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    
};

} } 
#endif // X10_ARRAY_DISTARRAY_UNIQUE_H

namespace x10 { namespace array { 
template<class TPMGL(T)> class DistArray_Unique;
} } 

#ifndef X10_ARRAY_DISTARRAY_UNIQUE_H_NODEPS
#define X10_ARRAY_DISTARRAY_UNIQUE_H_NODEPS
#include <x10/array/DistArray.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/lang/Long.h>
#include <x10/lang/PlaceGroup.h>
#include <x10/lang/PlaceGroup__SimplePlaceGroup.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/array/LocalState.h>
#include <x10/lang/Rail.h>
#include <x10/array/DenseIterationSpace_1.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Place.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Point.h>
#include <x10/compiler/Inline.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_ARRAY_DISTARRAY_UNIQUE_H_GENERICS
#define X10_ARRAY_DISTARRAY_UNIQUE_H_GENERICS
#endif // X10_ARRAY_DISTARRAY_UNIQUE_H_GENERICS
#ifndef X10_ARRAY_DISTARRAY_UNIQUE_H_IMPLEMENTATION
#define X10_ARRAY_DISTARRAY_UNIQUE_H_IMPLEMENTATION
#include <x10/array/DistArray_Unique.h>

#ifndef X10_ARRAY_DISTARRAY_UNIQUE__CLOSURE__1_CLOSURE
#define X10_ARRAY_DISTARRAY_UNIQUE__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T)> class x10_array_DistArray_Unique__closure__1 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*>::template itable <x10_array_DistArray_Unique__closure__1<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::array::LocalState<TPMGL(T)>* __apply() {
        ::x10::array::LocalState<TPMGL(T)>* alloc__75894 =  (new (::x10aux::alloc_z< ::x10::array::LocalState<TPMGL(T)> >()) ::x10::array::LocalState<TPMGL(T)>());
        
        //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        ::x10::lang::PlaceGroup* pg__75890 = reinterpret_cast< ::x10::lang::PlaceGroup*>(::x10::lang::PlaceGroup::FMGL(WORLD__get)());
        ::x10::lang::Rail< TPMGL(T) >* rail__75891 = ::x10::lang::Rail< TPMGL(T) >::_make(((x10_long)1ll));
        x10_long size__75892 = (__extension__ ({
            
            //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            ::x10::lang::PlaceGroup* this__75893 = reinterpret_cast< ::x10::lang::PlaceGroup*>(::x10::lang::PlaceGroup::FMGL(WORLD__get)());
            ::x10aux::nullCheck(this__75893)->numPlaces();
        }))
        ;
        
        //#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        alloc__75894->FMGL(pg) = pg__75890;
        alloc__75894->FMGL(rail) = rail__75891;
        alloc__75894->FMGL(size) = size__75892;
        
        //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        return alloc__75894;
        
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_array_DistArray_Unique__closure__1<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_array_DistArray_Unique__closure__1<TPMGL(T) > >();
        buf.record_reference(storage);
        x10_array_DistArray_Unique__closure__1<TPMGL(T) >* this_ = new (storage) x10_array_DistArray_Unique__closure__1<TPMGL(T) >();
        return this_;
    }
    
    x10_array_DistArray_Unique__closure__1() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10:30";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*>::template itable <x10_array_DistArray_Unique__closure__1<TPMGL(T) > >x10_array_DistArray_Unique__closure__1<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_array_DistArray_Unique__closure__1<TPMGL(T) >::__apply, &x10_array_DistArray_Unique__closure__1<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_array_DistArray_Unique__closure__1<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*> >, &x10_array_DistArray_Unique__closure__1<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_array_DistArray_Unique__closure__1<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_array_DistArray_Unique__closure__1<TPMGL(T) >::_deserialize);

#endif // X10_ARRAY_DISTARRAY_UNIQUE__CLOSURE__1_CLOSURE
#ifndef X10_ARRAY_DISTARRAY_UNIQUE__CLOSURE__2_CLOSURE
#define X10_ARRAY_DISTARRAY_UNIQUE__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T)> class x10_array_DistArray_Unique__closure__2 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*>::template itable <x10_array_DistArray_Unique__closure__2<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::array::LocalState<TPMGL(T)>* __apply() {
        ::x10::array::LocalState<TPMGL(T)>* alloc__75900 =  (new (::x10aux::alloc_z< ::x10::array::LocalState<TPMGL(T)> >()) ::x10::array::LocalState<TPMGL(T)>());
        
        //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        ::x10::lang::PlaceGroup* pg__75896 = reinterpret_cast< ::x10::lang::PlaceGroup*>(::x10::lang::PlaceGroup::FMGL(WORLD__get)());
        ::x10::lang::Rail< TPMGL(T) >* rail__75897 = ::x10::lang::Rail< TPMGL(T) >::_make(((x10_long)1ll),
                                                                                          ::x10::lang::Fun_0_0<TPMGL(T)>::__apply(::x10aux::nullCheck(init)));
        x10_long size__75898 = (__extension__ ({
            
            //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
            ::x10::lang::PlaceGroup* this__75899 = reinterpret_cast< ::x10::lang::PlaceGroup*>(::x10::lang::PlaceGroup::FMGL(WORLD__get)());
            ::x10aux::nullCheck(this__75899)->numPlaces();
        }))
        ;
        
        //#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        alloc__75900->FMGL(pg) = pg__75896;
        alloc__75900->FMGL(rail) = rail__75897;
        alloc__75900->FMGL(size) = size__75898;
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        return alloc__75900;
        
    }
    
    // captured environment
    ::x10::lang::Fun_0_0<TPMGL(T)>* init;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->init);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_array_DistArray_Unique__closure__2<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_array_DistArray_Unique__closure__2<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::Fun_0_0<TPMGL(T)>* that_init = buf.read< ::x10::lang::Fun_0_0<TPMGL(T)>*>();
        x10_array_DistArray_Unique__closure__2<TPMGL(T) >* this_ = new (storage) x10_array_DistArray_Unique__closure__2<TPMGL(T) >(that_init);
        return this_;
    }
    
    x10_array_DistArray_Unique__closure__2(::x10::lang::Fun_0_0<TPMGL(T)>* init) : init(init) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10:38";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*>::template itable <x10_array_DistArray_Unique__closure__2<TPMGL(T) > >x10_array_DistArray_Unique__closure__2<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_array_DistArray_Unique__closure__2<TPMGL(T) >::__apply, &x10_array_DistArray_Unique__closure__2<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_array_DistArray_Unique__closure__2<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*> >, &x10_array_DistArray_Unique__closure__2<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_array_DistArray_Unique__closure__2<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_array_DistArray_Unique__closure__2<TPMGL(T) >::_deserialize);

#endif // X10_ARRAY_DISTARRAY_UNIQUE__CLOSURE__2_CLOSURE
#ifndef X10_ARRAY_DISTARRAY_UNIQUE__CLOSURE__3_CLOSURE
#define X10_ARRAY_DISTARRAY_UNIQUE__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T)> class x10_array_DistArray_Unique__closure__3 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*>::template itable <x10_array_DistArray_Unique__closure__3<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::array::LocalState<TPMGL(T)>* __apply() {
        ::x10::array::LocalState<TPMGL(T)>* alloc__75905 =  (new (::x10aux::alloc_z< ::x10::array::LocalState<TPMGL(T)> >()) ::x10::array::LocalState<TPMGL(T)>());
        
        //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        ::x10::lang::PlaceGroup* pg__75902 = pg;
        ::x10::lang::Rail< TPMGL(T) >* rail__75903 = ::x10::lang::Rail< TPMGL(T) >::_make(((x10_long)1ll),
                                                                                          ::x10::lang::Fun_0_0<TPMGL(T)>::__apply(::x10aux::nullCheck(init)));
        x10_long size__75904 = pg->numPlaces();
        
        //#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
        alloc__75905->FMGL(pg) = pg__75902;
        alloc__75905->FMGL(rail) = rail__75903;
        alloc__75905->FMGL(size) = size__75904;
        
        //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
        return alloc__75905;
        
    }
    
    // captured environment
    ::x10::lang::PlaceGroup* pg;
    ::x10::lang::Fun_0_0<TPMGL(T)>* init;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->pg);
        buf.write(this->init);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_array_DistArray_Unique__closure__3<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_array_DistArray_Unique__closure__3<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceGroup* that_pg = buf.read< ::x10::lang::PlaceGroup*>();
        ::x10::lang::Fun_0_0<TPMGL(T)>* that_init = buf.read< ::x10::lang::Fun_0_0<TPMGL(T)>*>();
        x10_array_DistArray_Unique__closure__3<TPMGL(T) >* this_ = new (storage) x10_array_DistArray_Unique__closure__3<TPMGL(T) >(that_pg, that_init);
        return this_;
    }
    
    x10_array_DistArray_Unique__closure__3(::x10::lang::PlaceGroup* pg, ::x10::lang::Fun_0_0<TPMGL(T)>* init) : pg(pg), init(init) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10:46";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*>::template itable <x10_array_DistArray_Unique__closure__3<TPMGL(T) > >x10_array_DistArray_Unique__closure__3<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_array_DistArray_Unique__closure__3<TPMGL(T) >::__apply, &x10_array_DistArray_Unique__closure__3<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_array_DistArray_Unique__closure__3<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*> >, &x10_array_DistArray_Unique__closure__3<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_array_DistArray_Unique__closure__3<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_array_DistArray_Unique__closure__3<TPMGL(T) >::_deserialize);

#endif // X10_ARRAY_DISTARRAY_UNIQUE__CLOSURE__3_CLOSURE
template<class TPMGL(T)> typename ::x10::lang::Iterable< ::x10::lang::Point*>::template itable< ::x10::array::DistArray_Unique<TPMGL(T)> >  x10::array::DistArray_Unique<TPMGL(T)>::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::array::DistArray<TPMGL(T)>::iterator, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10::lang::Any::itable< ::x10::array::DistArray_Unique<TPMGL(T)> >  x10::array::DistArray_Unique<TPMGL(T)>::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> typename ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>::template itable< ::x10::array::DistArray_Unique<TPMGL(T)> >  x10::array::DistArray_Unique<TPMGL(T)>::_itable_2(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::array::DistArray_Unique<TPMGL(T)>::__apply, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10::array::DistArray_Unique<TPMGL(T)>::_itables[4] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Point*> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)> >, &_itable_2), ::x10aux::itable_entry(NULL, (void*)"::x10::array::DistArray_Unique<TPMGL(T)>")};

//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
template<class TPMGL(T)> x10_long x10::array::DistArray_Unique<TPMGL(T)>::rank(
  ) {
    return ((x10_long)1ll);
    
}

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
template<class TPMGL(T)> void x10::array::DistArray_Unique<TPMGL(T)>::_constructor(
                           ) {
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    (this)->::x10::array::DistArray<TPMGL(T)>::_constructor(reinterpret_cast< ::x10::lang::PlaceGroup*>(::x10::lang::PlaceGroup::FMGL(WORLD__get)()),
                                                            reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*> >(sizeof(x10_array_DistArray_Unique__closure__1<TPMGL(T)>)))x10_array_DistArray_Unique__closure__1<TPMGL(T)>())),
                                                            (__extension__ ({
                                                                ::x10::lang::PlaceGroup* this__75855 =
                                                                  reinterpret_cast< ::x10::lang::PlaceGroup*>(::x10::lang::PlaceGroup::FMGL(WORLD__get)());
                                                                ::x10aux::nullCheck(this__75855)->numPlaces();
                                                            }))
                                                            );
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    ::x10::array::DistArray_Unique<TPMGL(T)>* this__75895 =
      this;
    
}
template<class TPMGL(T)> ::x10::array::DistArray_Unique<TPMGL(T)>* x10::array::DistArray_Unique<TPMGL(T)>::_make(
                           ) {
    ::x10::array::DistArray_Unique<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::DistArray_Unique<TPMGL(T)> >()) ::x10::array::DistArray_Unique<TPMGL(T)>();
    this_->_constructor();
    return this_;
}



//#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
template<class TPMGL(T)> void x10::array::DistArray_Unique<TPMGL(T)>::_constructor(
                           ::x10::lang::Fun_0_0<TPMGL(T)>* init) {
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    (this)->::x10::array::DistArray<TPMGL(T)>::_constructor(
      reinterpret_cast< ::x10::lang::PlaceGroup*>(::x10::lang::PlaceGroup::FMGL(WORLD__get)()),
      reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*> >(sizeof(x10_array_DistArray_Unique__closure__2<TPMGL(T)>)))x10_array_DistArray_Unique__closure__2<TPMGL(T)>(init))),
      (__extension__ ({
          ::x10::lang::PlaceGroup* this__75866 = reinterpret_cast< ::x10::lang::PlaceGroup*>(::x10::lang::PlaceGroup::FMGL(WORLD__get)());
          ::x10aux::nullCheck(this__75866)->numPlaces();
      }))
      );
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    ::x10::array::DistArray_Unique<TPMGL(T)>* this__75901 =
      this;
    
}
template<class TPMGL(T)> ::x10::array::DistArray_Unique<TPMGL(T)>* x10::array::DistArray_Unique<TPMGL(T)>::_make(
                           ::x10::lang::Fun_0_0<TPMGL(T)>* init)
{
    ::x10::array::DistArray_Unique<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::DistArray_Unique<TPMGL(T)> >()) ::x10::array::DistArray_Unique<TPMGL(T)>();
    this_->_constructor(init);
    return this_;
}



//#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
template<class TPMGL(T)> void x10::array::DistArray_Unique<TPMGL(T)>::_constructor(
                           ::x10::lang::PlaceGroup* pg, ::x10::lang::Fun_0_0<TPMGL(T)>* init) {
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    (this)->::x10::array::DistArray<TPMGL(T)>::_constructor(
      pg, reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*> >(sizeof(x10_array_DistArray_Unique__closure__3<TPMGL(T)>)))x10_array_DistArray_Unique__closure__3<TPMGL(T)>(pg, init))),
      pg->numPlaces());
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    ::x10::array::DistArray_Unique<TPMGL(T)>* this__75906 =
      this;
    
}
template<class TPMGL(T)> ::x10::array::DistArray_Unique<TPMGL(T)>* x10::array::DistArray_Unique<TPMGL(T)>::_make(
                           ::x10::lang::PlaceGroup* pg, ::x10::lang::Fun_0_0<TPMGL(T)>* init)
{
    ::x10::array::DistArray_Unique<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::DistArray_Unique<TPMGL(T)> >()) ::x10::array::DistArray_Unique<TPMGL(T)>();
    this_->_constructor(pg, init);
    return this_;
}



//#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
template<class TPMGL(T)> ::x10::array::IterationSpace* x10::array::DistArray_Unique<TPMGL(T)>::globalIndices(
  ) {
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    ::x10::array::DenseIterationSpace_1* alloc__75907 =  (new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_1>()) ::x10::array::DenseIterationSpace_1());
    (alloc__75907)->::x10::array::DenseIterationSpace_1::_constructor(
      ((x10_long)0ll), (((__extension__ ({
          ::x10::lang::PlaceGroup* this__75908 = this->FMGL(placeGroup);
          ::x10aux::nullCheck(this__75908)->numPlaces();
      }))
      ) - (((x10_long)1ll))));
    return reinterpret_cast< ::x10::array::IterationSpace*>(alloc__75907);
    
}

//#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
template<class TPMGL(T)> ::x10::array::IterationSpace* x10::array::DistArray_Unique<TPMGL(T)>::localIndices(
  ) {
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    x10_long idx = ::x10aux::nullCheck(this->FMGL(placeGroup))->indexOf(
                     ::x10::lang::Place::_make(::x10aux::here));
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    ::x10::array::DenseIterationSpace_1* alloc__75909 =  (new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_1>()) ::x10::array::DenseIterationSpace_1());
    (alloc__75909)->::x10::array::DenseIterationSpace_1::_constructor(
      idx, idx);
    return reinterpret_cast< ::x10::array::IterationSpace*>(alloc__75909);
    
}

//#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
template<class TPMGL(T)> ::x10::lang::Place x10::array::DistArray_Unique<TPMGL(T)>::place(
  x10_long i) {
    return (((i) >= (((x10_long)0ll))) && ((i) < ((__extension__ ({
        ::x10::lang::PlaceGroup* this__75880 = this->FMGL(placeGroup);
        ::x10aux::nullCheck(this__75880)->numPlaces();
    }))
    ))) ? (::x10aux::nullCheck(this->FMGL(placeGroup))->__apply(
             i)) : (::x10::lang::Place::FMGL(INVALID_PLACE__get)());
    
}

//#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
template<class TPMGL(T)> ::x10::lang::Place x10::array::DistArray_Unique<TPMGL(T)>::place(
  ::x10::lang::Point* p) {
    return this->x10::array::template DistArray_Unique<TPMGL(T)>::place(
             ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
               ((x10_long)0ll)));
    
}

//#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
template<class TPMGL(T)> TPMGL(T) x10::array::DistArray_Unique<TPMGL(T)>::__apply(
  x10_long i) {
    
    //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    return this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__apply(
             ((x10_long)0ll));
    
}

//#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
template<class TPMGL(T)> TPMGL(T) x10::array::DistArray_Unique<TPMGL(T)>::__apply(
  ::x10::lang::Point* p) {
    ::x10::array::DistArray_Unique<TPMGL(T)>* this__75910 =
      this;
    
    //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    x10_long i__75911 = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                          ((x10_long)0ll));
    TPMGL(T) ret__75912;
    
    //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    ret__75912 = ::x10aux::nullCheck(this__75910)->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__apply(
                   ((x10_long)0ll));
    
    //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    return ret__75912;
    
}

//#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
template<class TPMGL(T)> TPMGL(T) x10::array::DistArray_Unique<TPMGL(T)>::__set(
  x10_long i, TPMGL(T) v) {
    
    //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__set(
      ((x10_long)0ll), v);
    
    //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    return v;
    
}

//#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
template<class TPMGL(T)> TPMGL(T) x10::array::DistArray_Unique<TPMGL(T)>::__set(
  ::x10::lang::Point* p, TPMGL(T) v) {
    ::x10::array::DistArray_Unique<TPMGL(T)>* this__75913 =
      this;
    
    //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    x10_long i__75914 = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                          ((x10_long)0ll));
    TPMGL(T) v__75915 = v;
    TPMGL(T) ret__75916;
    
    //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    ::x10aux::nullCheck(this__75913)->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__set(
      ((x10_long)0ll), v__75915);
    
    //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    ret__75916 = v__75915;
    
    //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
    return ret__75916;
    
}

//#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
template<class TPMGL(T)> void x10::array::DistArray_Unique<TPMGL(T)>::validateIndex(
  x10_long i) {
 
}

//#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Unique.x10"
template<class TPMGL(T)> ::x10::array::DistArray_Unique<TPMGL(T)>*
  x10::array::DistArray_Unique<TPMGL(T)>::x10__array__DistArray_Unique____this__x10__array__DistArray_Unique(
  ) {
    return this;
    
}
template<class TPMGL(T)> void x10::array::DistArray_Unique<TPMGL(T)>::__fieldInitializers_x10_array_DistArray_Unique(
  ) {
 
}
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10::array::DistArray_Unique<TPMGL(T)>::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::array::DistArray_Unique<TPMGL(T)>::_deserializer);

template<class TPMGL(T)> void x10::array::DistArray_Unique<TPMGL(T)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::array::DistArray<TPMGL(T)>::_serialize_body(buf);
    
}

template<class TPMGL(T)> ::x10::lang::Reference* ::x10::array::DistArray_Unique<TPMGL(T)>::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::array::DistArray_Unique<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::DistArray_Unique<TPMGL(T)> >()) ::x10::array::DistArray_Unique<TPMGL(T)>();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

template<class TPMGL(T)> void x10::array::DistArray_Unique<TPMGL(T)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::array::DistArray<TPMGL(T)>::_deserialize_body(buf);
    
}

#endif // X10_ARRAY_DISTARRAY_UNIQUE_H_IMPLEMENTATION
#endif // __X10_ARRAY_DISTARRAY_UNIQUE_H_NODEPS
