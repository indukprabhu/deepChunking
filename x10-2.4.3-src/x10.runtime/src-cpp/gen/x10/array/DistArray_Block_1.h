#ifndef __X10_ARRAY_DISTARRAY_BLOCK_1_H
#define __X10_ARRAY_DISTARRAY_BLOCK_1_H

#include <x10rt.h>


#define X10_ARRAY_DISTARRAY_H_NODEPS
#include <x10/array/DistArray.h>
#undef X10_ARRAY_DISTARRAY_H_NODEPS
#define X10_LANG_FUN_0_1_H_NODEPS
#include <x10/lang/Fun_0_1.h>
#undef X10_LANG_FUN_0_1_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
namespace x10 { namespace array { 
class DenseIterationSpace_1;
} } 
namespace x10 { namespace compiler { 
class TransientInitExpr;
} } 
namespace x10 { namespace array { 
template<class TPMGL(S)> class LocalState_B1;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class PlaceLocalHandle;
} } 
namespace x10 { namespace array { 
template<class TPMGL(S)> class LocalState;
} } 
namespace x10 { namespace compiler { 
class NonEscaping;
} } 
namespace x10 { namespace lang { 
class PlaceGroup;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(U)> class Fun_0_0;
} } 
namespace x10 { namespace lang { 
class PlaceGroup__SimplePlaceGroup;
} } 
namespace x10 { namespace lang { 
class Zero;
} } 
namespace x10 { namespace compiler { 
class Inline;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace array { 
class BlockingUtils;
} } 
namespace x10 { namespace array { 
class IterationSpace;
} } 
namespace x10 { namespace lang { 
class Point;
} } 
namespace x10 { namespace lang { 
class Unsafe;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace array { 

template<class TPMGL(T)> class DistArray_Block_1;
template <> class DistArray_Block_1<void>;
template<class TPMGL(T)> class DistArray_Block_1 : public ::x10::array::DistArray<TPMGL(T)>
  {
    public:
    RTT_H_DECLS_CLASS
    
    static ::x10aux::itable_entry _itables[4];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static typename ::x10::lang::Iterable< ::x10::lang::Point*>::template itable< ::x10::array::DistArray_Block_1<TPMGL(T)> > _itable_0;
    
    static ::x10::lang::Any::itable< ::x10::array::DistArray_Block_1<TPMGL(T)> > _itable_1;
    
    static typename ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>::template itable< ::x10::array::DistArray_Block_1<TPMGL(T)> > _itable_2;
    
    x10_long rank();
    ::x10::array::DenseIterationSpace_1* FMGL(globalIndices);
    
    ::x10::array::DenseIterationSpace_1* FMGL(localIndices);
    
    virtual ::x10::array::DenseIterationSpace_1* reloadLocalIndices(
      );
    x10_long FMGL(minLocalIndex);
    
    virtual x10_long reloadMinLocalIndex();
    x10_long FMGL(maxLocalIndex);
    
    virtual x10_long reloadMaxLocalIndex();
    void _constructor(x10_long n, ::x10::lang::PlaceGroup* pg, ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* init);
    
    static ::x10::array::DistArray_Block_1<TPMGL(T)>* _make(x10_long n,
                                                            ::x10::lang::PlaceGroup* pg,
                                                            ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* init);
    
    void _constructor(x10_long n, ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* init);
    
    static ::x10::array::DistArray_Block_1<TPMGL(T)>* _make(
             x10_long n, ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* init);
    
    void _constructor(x10_long n, ::x10::lang::PlaceGroup* pg);
    
    static ::x10::array::DistArray_Block_1<TPMGL(T)>* _make(
             x10_long n, ::x10::lang::PlaceGroup* pg);
    
    void _constructor(x10_long n);
    
    static ::x10::array::DistArray_Block_1<TPMGL(T)>* _make(
             x10_long n);
    
    virtual ::x10::array::IterationSpace* globalIndices();
    virtual ::x10::array::IterationSpace* localIndices();
    virtual ::x10::lang::Place place(x10_long i);
    virtual ::x10::lang::Place place(::x10::lang::Point* p);
    virtual TPMGL(T) __apply(x10_long i);
    virtual TPMGL(T) __apply(::x10::lang::Point* p);
    virtual TPMGL(T) __set(x10_long i, TPMGL(T) v);
    virtual TPMGL(T) __set(::x10::lang::Point* p, TPMGL(T) v);
    virtual ::x10::array::DistArray_Block_1<TPMGL(T)>* x10__array__DistArray_Block_1____this__x10__array__DistArray_Block_1(
      );
    virtual void __fieldInitializers_x10_array_DistArray_Block_1(
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

template<class TPMGL(T)> ::x10aux::RuntimeType x10::array::DistArray_Block_1<TPMGL(T)>::rtt;
template<class TPMGL(T)> void x10::array::DistArray_Block_1<TPMGL(T)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::array::DistArray_Block_1<void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::array::DistArray<TPMGL(T)> >(), ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)> >()};
    const ::x10aux::RuntimeType* params[1] = { ::x10aux::getRTT<TPMGL(T)>()};
    ::x10aux::RuntimeType::Variance variances[1] = { ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.array.DistArray_Block_1";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 2, parents, 1, params, variances);
}

template <> class DistArray_Block_1<void> : public ::x10::array::DistArray<void>
{
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    static x10_long validateSize(x10_long n);
    
    
};

} } 
#endif // X10_ARRAY_DISTARRAY_BLOCK_1_H

namespace x10 { namespace array { 
template<class TPMGL(T)> class DistArray_Block_1;
} } 

#ifndef X10_ARRAY_DISTARRAY_BLOCK_1_H_NODEPS
#define X10_ARRAY_DISTARRAY_BLOCK_1_H_NODEPS
#include <x10/array/DistArray.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/lang/Long.h>
#include <x10/array/DenseIterationSpace_1.h>
#include <x10/compiler/TransientInitExpr.h>
#include <x10/array/LocalState_B1.h>
#include <x10/lang/PlaceLocalHandle.h>
#include <x10/array/LocalState.h>
#include <x10/compiler/NonEscaping.h>
#include <x10/lang/PlaceGroup.h>
#include <x10/lang/Fun_0_0.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/PlaceGroup__SimplePlaceGroup.h>
#include <x10/lang/Zero.h>
#include <x10/compiler/Inline.h>
#include <x10/lang/Place.h>
#include <x10/array/BlockingUtils.h>
#include <x10/array/IterationSpace.h>
#include <x10/lang/Point.h>
#include <x10/lang/Unsafe.h>
#include <x10/lang/Rail.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_ARRAY_DISTARRAY_BLOCK_1_H_GENERICS
#define X10_ARRAY_DISTARRAY_BLOCK_1_H_GENERICS
#endif // X10_ARRAY_DISTARRAY_BLOCK_1_H_GENERICS
#ifndef X10_ARRAY_DISTARRAY_BLOCK_1_H_IMPLEMENTATION
#define X10_ARRAY_DISTARRAY_BLOCK_1_H_IMPLEMENTATION
#include <x10/array/DistArray_Block_1.h>

#ifndef X10_ARRAY_DISTARRAY_BLOCK_1__CLOSURE__2_CLOSURE
#define X10_ARRAY_DISTARRAY_BLOCK_1__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T)> class x10_array_DistArray_Block_1__closure__2 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::array::LocalState_B1<TPMGL(T)>*>::template itable <x10_array_DistArray_Block_1__closure__2<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::array::LocalState_B1<TPMGL(T)>* __apply() {
        return ::x10::array::LocalState_B1<void>::template make< TPMGL(T) >(
                 pg, n, init);
        
    }
    
    // captured environment
    ::x10::lang::PlaceGroup* pg;
    x10_long n;
    ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* init;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->pg);
        buf.write(this->n);
        buf.write(this->init);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_array_DistArray_Block_1__closure__2<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_array_DistArray_Block_1__closure__2<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceGroup* that_pg = buf.read< ::x10::lang::PlaceGroup*>();
        x10_long that_n = buf.read<x10_long>();
        ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* that_init = buf.read< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>*>();
        x10_array_DistArray_Block_1__closure__2<TPMGL(T) >* this_ = new (storage) x10_array_DistArray_Block_1__closure__2<TPMGL(T) >(that_pg, that_n, that_init);
        return this_;
    }
    
    x10_array_DistArray_Block_1__closure__2(::x10::lang::PlaceGroup* pg, x10_long n, ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* init) : pg(pg), n(n), init(init) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::array::LocalState_B1<TPMGL(T)>*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::array::LocalState_B1<TPMGL(T)>*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10:54";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_0< ::x10::array::LocalState_B1<TPMGL(T)>*>::template itable <x10_array_DistArray_Block_1__closure__2<TPMGL(T) > >x10_array_DistArray_Block_1__closure__2<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_array_DistArray_Block_1__closure__2<TPMGL(T) >::__apply, &x10_array_DistArray_Block_1__closure__2<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_array_DistArray_Block_1__closure__2<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::array::LocalState_B1<TPMGL(T)>*> >, &x10_array_DistArray_Block_1__closure__2<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_array_DistArray_Block_1__closure__2<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_array_DistArray_Block_1__closure__2<TPMGL(T) >::_deserialize);

#endif // X10_ARRAY_DISTARRAY_BLOCK_1__CLOSURE__2_CLOSURE
#ifndef X10_ARRAY_DISTARRAY_BLOCK_1__CLOSURE__1_CLOSURE
#define X10_ARRAY_DISTARRAY_BLOCK_1__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T)> class x10_array_DistArray_Block_1__closure__1 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*>::template itable <x10_array_DistArray_Block_1__closure__1<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::array::LocalState<TPMGL(T)>* __apply() {
        return reinterpret_cast< ::x10::array::LocalState<TPMGL(T)>*>(x10_array_DistArray_Block_1__closure__2<TPMGL(T)>(pg, n, init).__apply());
        
    }
    
    // captured environment
    ::x10::lang::PlaceGroup* pg;
    x10_long n;
    ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* init;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->pg);
        buf.write(this->n);
        buf.write(this->init);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_array_DistArray_Block_1__closure__1<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_array_DistArray_Block_1__closure__1<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceGroup* that_pg = buf.read< ::x10::lang::PlaceGroup*>();
        x10_long that_n = buf.read<x10_long>();
        ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* that_init = buf.read< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>*>();
        x10_array_DistArray_Block_1__closure__1<TPMGL(T) >* this_ = new (storage) x10_array_DistArray_Block_1__closure__1<TPMGL(T) >(that_pg, that_n, that_init);
        return this_;
    }
    
    x10_array_DistArray_Block_1__closure__1(::x10::lang::PlaceGroup* pg, x10_long n, ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* init) : pg(pg), n(n), init(init) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10:54";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*>::template itable <x10_array_DistArray_Block_1__closure__1<TPMGL(T) > >x10_array_DistArray_Block_1__closure__1<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_array_DistArray_Block_1__closure__1<TPMGL(T) >::__apply, &x10_array_DistArray_Block_1__closure__1<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_array_DistArray_Block_1__closure__1<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*> >, &x10_array_DistArray_Block_1__closure__1<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_array_DistArray_Block_1__closure__1<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_array_DistArray_Block_1__closure__1<TPMGL(T) >::_deserialize);

#endif // X10_ARRAY_DISTARRAY_BLOCK_1__CLOSURE__1_CLOSURE
#ifndef X10_ARRAY_DISTARRAY_BLOCK_1__CLOSURE__3_CLOSURE
#define X10_ARRAY_DISTARRAY_BLOCK_1__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
template<class TPMGL(T)> class x10_array_DistArray_Block_1__closure__3 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>::template itable <x10_array_DistArray_Block_1__closure__3<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    TPMGL(T) __apply(x10_long id__21) {
        return ::x10aux::zeroValue< TPMGL(T) >();
        
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_array_DistArray_Block_1__closure__3<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_array_DistArray_Block_1__closure__3<TPMGL(T) > >();
        buf.record_reference(storage);
        x10_array_DistArray_Block_1__closure__3<TPMGL(T) >* this_ = new (storage) x10_array_DistArray_Block_1__closure__3<TPMGL(T) >();
        return this_;
    }
    
    x10_array_DistArray_Block_1__closure__3() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10:83";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>::template itable <x10_array_DistArray_Block_1__closure__3<TPMGL(T) > >x10_array_DistArray_Block_1__closure__3<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_array_DistArray_Block_1__closure__3<TPMGL(T) >::__apply, &x10_array_DistArray_Block_1__closure__3<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_array_DistArray_Block_1__closure__3<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)> >, &x10_array_DistArray_Block_1__closure__3<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_array_DistArray_Block_1__closure__3<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_array_DistArray_Block_1__closure__3<TPMGL(T) >::_deserialize);

#endif // X10_ARRAY_DISTARRAY_BLOCK_1__CLOSURE__3_CLOSURE
#ifndef X10_ARRAY_DISTARRAY_BLOCK_1__CLOSURE__4_CLOSURE
#define X10_ARRAY_DISTARRAY_BLOCK_1__CLOSURE__4_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
template<class TPMGL(T)> class x10_array_DistArray_Block_1__closure__4 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>::template itable <x10_array_DistArray_Block_1__closure__4<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    TPMGL(T) __apply(x10_long id__22) {
        return ::x10aux::zeroValue< TPMGL(T) >();
        
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_array_DistArray_Block_1__closure__4<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_array_DistArray_Block_1__closure__4<TPMGL(T) > >();
        buf.record_reference(storage);
        x10_array_DistArray_Block_1__closure__4<TPMGL(T) >* this_ = new (storage) x10_array_DistArray_Block_1__closure__4<TPMGL(T) >();
        return this_;
    }
    
    x10_array_DistArray_Block_1__closure__4() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10:95";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>::template itable <x10_array_DistArray_Block_1__closure__4<TPMGL(T) > >x10_array_DistArray_Block_1__closure__4<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_array_DistArray_Block_1__closure__4<TPMGL(T) >::__apply, &x10_array_DistArray_Block_1__closure__4<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_array_DistArray_Block_1__closure__4<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)> >, &x10_array_DistArray_Block_1__closure__4<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_array_DistArray_Block_1__closure__4<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_array_DistArray_Block_1__closure__4<TPMGL(T) >::_deserialize);

#endif // X10_ARRAY_DISTARRAY_BLOCK_1__CLOSURE__4_CLOSURE
template<class TPMGL(T)> typename ::x10::lang::Iterable< ::x10::lang::Point*>::template itable< ::x10::array::DistArray_Block_1<TPMGL(T)> >  x10::array::DistArray_Block_1<TPMGL(T)>::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::array::DistArray<TPMGL(T)>::iterator, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10::lang::Any::itable< ::x10::array::DistArray_Block_1<TPMGL(T)> >  x10::array::DistArray_Block_1<TPMGL(T)>::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> typename ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>::template itable< ::x10::array::DistArray_Block_1<TPMGL(T)> >  x10::array::DistArray_Block_1<TPMGL(T)>::_itable_2(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::array::DistArray_Block_1<TPMGL(T)>::__apply, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10::array::DistArray_Block_1<TPMGL(T)>::_itables[4] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Point*> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)> >, &_itable_2), ::x10aux::itable_entry(NULL, (void*)"::x10::array::DistArray_Block_1<TPMGL(T)>")};

//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
template<class TPMGL(T)> x10_long x10::array::DistArray_Block_1<TPMGL(T)>::rank(
  ) {
    return ((x10_long)1ll);
    
}

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"

//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
template<class TPMGL(T)> ::x10::array::DenseIterationSpace_1* x10::array::DistArray_Block_1<TPMGL(T)>::reloadLocalIndices(
  ) {
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    ::x10::array::LocalState_B1<TPMGL(T)>* ls = ::x10aux::class_cast< ::x10::array::LocalState_B1<TPMGL(T)>*>(this->FMGL(localHandle)->x10::lang::template PlaceLocalHandle< ::x10::array::LocalState<TPMGL(T)>*>::__apply());
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    return (!::x10aux::struct_equals(ls, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
      ? (::x10aux::nullCheck(ls)->FMGL(localIndices)) : ((__extension__ ({
                                                             ::x10::array::DenseIterationSpace_1* alloc__74503 =
                                                               
                                                             (new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_1>()) ::x10::array::DenseIterationSpace_1());
                                                             (alloc__74503)->::x10::array::DenseIterationSpace_1::_constructor(
                                                               ((x10_long)0ll),
                                                               ((x10_long)-1ll));
                                                             alloc__74503;
                                                         }))
                                                         );
    
}

//#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"

//#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
template<class TPMGL(T)> x10_long x10::array::DistArray_Block_1<TPMGL(T)>::reloadMinLocalIndex(
  ) {
    return this->FMGL(localIndices)->x10::array::DenseIterationSpace_1::min(
             ((x10_long)0ll));
    
}

//#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"

//#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
template<class TPMGL(T)> x10_long x10::array::DistArray_Block_1<TPMGL(T)>::reloadMaxLocalIndex(
  ) {
    return this->FMGL(localIndices)->x10::array::DenseIterationSpace_1::max(
             ((x10_long)0ll));
    
}

//#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
template<class TPMGL(T)> void x10::array::DistArray_Block_1<TPMGL(T)>::_constructor(
                           x10_long n, ::x10::lang::PlaceGroup* pg,
                           ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* init) {
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    (this)->::x10::array::DistArray<TPMGL(T)>::_constructor(
      pg, reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*> >(sizeof(x10_array_DistArray_Block_1__closure__1<TPMGL(T)>)))x10_array_DistArray_Block_1__closure__1<TPMGL(T)>(pg, n, init))),
      (__extension__ ({
          
          //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
          x10_long n__74536 = n;
          x10_long ret__74537;
          
          //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
          if (((n__74536) < (((x10_long)0ll)))) {
              ::x10::array::DistArray<void>::raiseNegativeArraySizeException();
          }
          
          //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
          ret__74537 = n__74536;
          ret__74537;
      }))
      );
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    ::x10::array::DistArray_Block_1<TPMGL(T)>* this__75403 =
      this;
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    this->FMGL(globalIndices) = (__extension__ ({
        ::x10::array::DenseIterationSpace_1* alloc__74504 =
           (new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_1>()) ::x10::array::DenseIterationSpace_1());
        (alloc__74504)->::x10::array::DenseIterationSpace_1::_constructor(
          ((x10_long)0ll), ((n) - (((x10_long)1ll))));
        alloc__74504;
    }))
    ;
    
    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    this->FMGL(localIndices) = this->x10::array::template DistArray_Block_1<TPMGL(T)>::reloadLocalIndices();
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    this->FMGL(minLocalIndex) = (__extension__ ({
        ::x10::array::DistArray_Block_1<TPMGL(T)>* this__75217 =
          this;
        ::x10aux::nullCheck(this__75217)->FMGL(localIndices)->x10::array::DenseIterationSpace_1::min(
          ((x10_long)0ll));
    }))
    ;
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    this->FMGL(maxLocalIndex) = (__extension__ ({
        ::x10::array::DistArray_Block_1<TPMGL(T)>* this__75218 =
          this;
        ::x10aux::nullCheck(this__75218)->FMGL(localIndices)->x10::array::DenseIterationSpace_1::max(
          ((x10_long)0ll));
    }))
    ;
}
template<class TPMGL(T)> ::x10::array::DistArray_Block_1<TPMGL(T)>* x10::array::DistArray_Block_1<TPMGL(T)>::_make(
                           x10_long n, ::x10::lang::PlaceGroup* pg,
                           ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* init)
{
    ::x10::array::DistArray_Block_1<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::DistArray_Block_1<TPMGL(T)> >()) ::x10::array::DistArray_Block_1<TPMGL(T)>();
    this_->_constructor(n, pg, init);
    return this_;
}



//#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
template<class TPMGL(T)> void x10::array::DistArray_Block_1<TPMGL(T)>::_constructor(
                           x10_long n, ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* init) {
    
    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    (this)->::x10::array::DistArray_Block_1<TPMGL(T)>::_constructor(
      n, reinterpret_cast< ::x10::lang::PlaceGroup*>(::x10::lang::PlaceGroup::FMGL(WORLD__get)()),
      init);
    
}
template<class TPMGL(T)> ::x10::array::DistArray_Block_1<TPMGL(T)>* x10::array::DistArray_Block_1<TPMGL(T)>::_make(
                           x10_long n, ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* init)
{
    ::x10::array::DistArray_Block_1<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::DistArray_Block_1<TPMGL(T)> >()) ::x10::array::DistArray_Block_1<TPMGL(T)>();
    this_->_constructor(n, init);
    return this_;
}



//#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
template<class TPMGL(T)> void x10::array::DistArray_Block_1<TPMGL(T)>::_constructor(
                           x10_long n, ::x10::lang::PlaceGroup* pg) {
    
    //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    (this)->::x10::array::DistArray_Block_1<TPMGL(T)>::_constructor(
      n, pg, reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)> >(sizeof(x10_array_DistArray_Block_1__closure__3<TPMGL(T)>)))x10_array_DistArray_Block_1__closure__3<TPMGL(T)>())));
    
}
template<class TPMGL(T)> ::x10::array::DistArray_Block_1<TPMGL(T)>* x10::array::DistArray_Block_1<TPMGL(T)>::_make(
                           x10_long n, ::x10::lang::PlaceGroup* pg)
{
    ::x10::array::DistArray_Block_1<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::DistArray_Block_1<TPMGL(T)> >()) ::x10::array::DistArray_Block_1<TPMGL(T)>();
    this_->_constructor(n, pg);
    return this_;
}



//#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
template<class TPMGL(T)> void x10::array::DistArray_Block_1<TPMGL(T)>::_constructor(
                           x10_long n) {
    
    //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    (this)->::x10::array::DistArray_Block_1<TPMGL(T)>::_constructor(
      n, reinterpret_cast< ::x10::lang::PlaceGroup*>(::x10::lang::PlaceGroup::FMGL(WORLD__get)()),
      reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)> >(sizeof(x10_array_DistArray_Block_1__closure__4<TPMGL(T)>)))x10_array_DistArray_Block_1__closure__4<TPMGL(T)>())));
    
}
template<class TPMGL(T)> ::x10::array::DistArray_Block_1<TPMGL(T)>* x10::array::DistArray_Block_1<TPMGL(T)>::_make(
                           x10_long n) {
    ::x10::array::DistArray_Block_1<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::DistArray_Block_1<TPMGL(T)> >()) ::x10::array::DistArray_Block_1<TPMGL(T)>();
    this_->_constructor(n);
    return this_;
}



//#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
template<class TPMGL(T)> ::x10::array::IterationSpace* x10::array::DistArray_Block_1<TPMGL(T)>::globalIndices(
  ) {
    return reinterpret_cast< ::x10::array::IterationSpace*>(this->FMGL(globalIndices));
    
}

//#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
template<class TPMGL(T)> ::x10::array::IterationSpace* x10::array::DistArray_Block_1<TPMGL(T)>::localIndices(
  ) {
    return reinterpret_cast< ::x10::array::IterationSpace*>(this->FMGL(localIndices));
    
}

//#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
template<class TPMGL(T)> ::x10::lang::Place x10::array::DistArray_Block_1<TPMGL(T)>::place(
  x10_long i) {
    
    //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    x10_long tmp = ::x10::array::BlockingUtils::mapIndexToBlockPartition(
                     reinterpret_cast< ::x10::array::IterationSpace*>(this->FMGL(globalIndices)),
                     (__extension__ ({
                         ::x10::lang::PlaceGroup* this__75383 =
                           this->FMGL(placeGroup);
                         ::x10aux::nullCheck(this__75383)->numPlaces();
                     }))
                     , i);
    
    //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    return (::x10aux::struct_equals(tmp, ((x10_long)-1ll)))
      ? (::x10::lang::Place::FMGL(INVALID_PLACE__get)()) : (::x10aux::nullCheck(this->FMGL(placeGroup))->__apply(
                                                              tmp));
    
}

//#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
template<class TPMGL(T)> ::x10::lang::Place x10::array::DistArray_Block_1<TPMGL(T)>::place(
  ::x10::lang::Point* p) {
    return this->x10::array::template DistArray_Block_1<TPMGL(T)>::place(
             ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
               ((x10_long)0ll)));
    
}

//#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
template<class TPMGL(T)> TPMGL(T) x10::array::DistArray_Block_1<TPMGL(T)>::__apply(
  x10_long i) {
    
    //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    return (this->FMGL(raw))->unchecked_apply(((i) - (this->FMGL(minLocalIndex))));
    
}

//#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
template<class TPMGL(T)> TPMGL(T) x10::array::DistArray_Block_1<TPMGL(T)>::__apply(
  ::x10::lang::Point* p) {
    ::x10::array::DistArray_Block_1<TPMGL(T)>* this__75404 =
      this;
    
    //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    x10_long i__75405 = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                          ((x10_long)0ll));
    TPMGL(T) ret__75406;
    
    //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    ret__75406 = (::x10aux::nullCheck(this__75404)->FMGL(raw))->unchecked_apply(((i__75405) - (::x10aux::nullCheck(this__75404)->FMGL(minLocalIndex))));
    
    //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    return ret__75406;
    
}

//#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
template<class TPMGL(T)> TPMGL(T) x10::array::DistArray_Block_1<TPMGL(T)>::__set(
  x10_long i, TPMGL(T) v) {
    
    //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    (this->FMGL(raw))->unchecked_set(((i) - (this->FMGL(minLocalIndex))), v);
    
    //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    return v;
    
}

//#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
template<class TPMGL(T)> TPMGL(T) x10::array::DistArray_Block_1<TPMGL(T)>::__set(
  ::x10::lang::Point* p, TPMGL(T) v) {
    ::x10::array::DistArray_Block_1<TPMGL(T)>* this__75407 =
      this;
    
    //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    x10_long i__75408 = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                          ((x10_long)0ll));
    TPMGL(T) v__75409 = v;
    TPMGL(T) ret__75410;
    
    //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    (::x10aux::nullCheck(this__75407)->FMGL(raw))->unchecked_set(((i__75408) - (::x10aux::nullCheck(this__75407)->FMGL(minLocalIndex))), v__75409);
    
    //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    ret__75410 = v__75409;
    
    //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    return ret__75410;
    
}

//#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"

//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
template<class TPMGL(T)> ::x10::array::DistArray_Block_1<TPMGL(T)>*
  x10::array::DistArray_Block_1<TPMGL(T)>::x10__array__DistArray_Block_1____this__x10__array__DistArray_Block_1(
  ) {
    return this;
    
}
template<class TPMGL(T)> void x10::array::DistArray_Block_1<TPMGL(T)>::__fieldInitializers_x10_array_DistArray_Block_1(
  ) {
 
}
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10::array::DistArray_Block_1<TPMGL(T)>::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::array::DistArray_Block_1<TPMGL(T)>::_deserializer);

template<class TPMGL(T)> void x10::array::DistArray_Block_1<TPMGL(T)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::array::DistArray<TPMGL(T)>::_serialize_body(buf);
    buf.write(this->FMGL(globalIndices));
    
}

template<class TPMGL(T)> ::x10::lang::Reference* ::x10::array::DistArray_Block_1<TPMGL(T)>::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::array::DistArray_Block_1<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::DistArray_Block_1<TPMGL(T)> >()) ::x10::array::DistArray_Block_1<TPMGL(T)>();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

template<class TPMGL(T)> void x10::array::DistArray_Block_1<TPMGL(T)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::array::DistArray<TPMGL(T)>::_deserialize_body(buf);
    FMGL(globalIndices) = buf.read< ::x10::array::DenseIterationSpace_1*>();
    /* fields with @TransientInitExpr annotations */
    FMGL(localIndices) = x10::array::template DistArray_Block_1<TPMGL(T)>::reloadLocalIndices();
    FMGL(minLocalIndex) = x10::array::template DistArray_Block_1<TPMGL(T)>::reloadMinLocalIndex();
    FMGL(maxLocalIndex) = x10::array::template DistArray_Block_1<TPMGL(T)>::reloadMaxLocalIndex();
    
}

#endif // X10_ARRAY_DISTARRAY_BLOCK_1_H_IMPLEMENTATION
#endif // __X10_ARRAY_DISTARRAY_BLOCK_1_H_NODEPS
