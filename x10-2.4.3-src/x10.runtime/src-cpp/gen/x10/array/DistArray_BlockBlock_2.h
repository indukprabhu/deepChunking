#ifndef __X10_ARRAY_DISTARRAY_BLOCKBLOCK_2_H
#define __X10_ARRAY_DISTARRAY_BLOCKBLOCK_2_H

#include <x10rt.h>


#define X10_ARRAY_DISTARRAY_H_NODEPS
#include <x10/array/DistArray.h>
#undef X10_ARRAY_DISTARRAY_H_NODEPS
#define X10_LANG_FUN_0_2_H_NODEPS
#include <x10/lang/Fun_0_2.h>
#undef X10_LANG_FUN_0_2_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
namespace x10 { namespace array { 
class DenseIterationSpace_2;
} } 
namespace x10 { namespace compiler { 
class TransientInitExpr;
} } 
namespace x10 { namespace array { 
template<class TPMGL(S)> class LocalState_BB2;
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

template<class TPMGL(T)> class DistArray_BlockBlock_2;
template <> class DistArray_BlockBlock_2<void>;
template<class TPMGL(T)> class DistArray_BlockBlock_2 : public ::x10::array::DistArray<TPMGL(T)>
  {
    public:
    RTT_H_DECLS_CLASS
    
    static ::x10aux::itable_entry _itables[4];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static typename ::x10::lang::Iterable< ::x10::lang::Point*>::template itable< ::x10::array::DistArray_BlockBlock_2<TPMGL(T)> > _itable_0;
    
    static ::x10::lang::Any::itable< ::x10::array::DistArray_BlockBlock_2<TPMGL(T)> > _itable_1;
    
    static typename ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>::template itable< ::x10::array::DistArray_BlockBlock_2<TPMGL(T)> > _itable_2;
    
    x10_long rank();
    ::x10::array::DenseIterationSpace_2* FMGL(globalIndices);
    
    x10_long FMGL(numElems_1);
    
    x10_long FMGL(numElems_2);
    
    ::x10::array::DenseIterationSpace_2* FMGL(localIndices);
    
    virtual ::x10::array::DenseIterationSpace_2* reloadLocalIndices(
      );
    x10_long FMGL(minIndex_1);
    
    virtual x10_long reloadMinIndex_1();
    x10_long FMGL(minIndex_2);
    
    virtual x10_long reloadMinIndex_2();
    x10_long FMGL(numElemsLocal_1);
    
    virtual x10_long reloadNumElemsLocal_1();
    x10_long FMGL(numElemsLocal_2);
    
    virtual x10_long reloadNumElemsLocal_2();
    void _constructor(x10_long m, x10_long n, ::x10::lang::PlaceGroup* pg,
                      ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>* init);
    
    static ::x10::array::DistArray_BlockBlock_2<TPMGL(T)>* _make(
             x10_long m, x10_long n, ::x10::lang::PlaceGroup* pg,
             ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>* init);
    
    void _constructor(x10_long m, x10_long n, ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>* init);
    
    static ::x10::array::DistArray_BlockBlock_2<TPMGL(T)>* _make(
             x10_long m, x10_long n, ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>* init);
    
    void _constructor(x10_long m, x10_long n, ::x10::lang::PlaceGroup* pg);
    
    static ::x10::array::DistArray_BlockBlock_2<TPMGL(T)>* _make(
             x10_long m, x10_long n, ::x10::lang::PlaceGroup* pg);
    
    void _constructor(x10_long m, x10_long n);
    
    static ::x10::array::DistArray_BlockBlock_2<TPMGL(T)>* _make(
             x10_long m, x10_long n);
    
    virtual ::x10::array::IterationSpace* globalIndices();
    virtual ::x10::array::IterationSpace* localIndices();
    virtual ::x10::lang::Place place(x10_long i, x10_long j);
    virtual ::x10::lang::Place place(::x10::lang::Point* p);
    virtual TPMGL(T) __apply(x10_long i, x10_long j);
    virtual TPMGL(T) __apply(::x10::lang::Point* p);
    virtual TPMGL(T) __set(x10_long i, x10_long j, TPMGL(T) v);
    virtual TPMGL(T) __set(::x10::lang::Point* p, TPMGL(T) v);
    virtual void validateIndex(x10_long i, x10_long j);
    virtual x10_long offset(x10_long i, x10_long j);
    virtual ::x10::array::DistArray_BlockBlock_2<TPMGL(T)>* x10__array__DistArray_BlockBlock_2____this__x10__array__DistArray_BlockBlock_2(
      );
    virtual void __fieldInitializers_x10_array_DistArray_BlockBlock_2(
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

template<class TPMGL(T)> ::x10aux::RuntimeType x10::array::DistArray_BlockBlock_2<TPMGL(T)>::rtt;
template<class TPMGL(T)> void x10::array::DistArray_BlockBlock_2<TPMGL(T)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::array::DistArray_BlockBlock_2<void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::array::DistArray<TPMGL(T)> >(), ::x10aux::getRTT< ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)> >()};
    const ::x10aux::RuntimeType* params[1] = { ::x10aux::getRTT<TPMGL(T)>()};
    ::x10aux::RuntimeType::Variance variances[1] = { ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.array.DistArray_BlockBlock_2";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 2, parents, 1, params, variances);
}

template <> class DistArray_BlockBlock_2<void> : public ::x10::array::DistArray<void>
{
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    static x10_long validateSize(x10_long m, x10_long n);
    
    
};

} } 
#endif // X10_ARRAY_DISTARRAY_BLOCKBLOCK_2_H

namespace x10 { namespace array { 
template<class TPMGL(T)> class DistArray_BlockBlock_2;
} } 

#ifndef X10_ARRAY_DISTARRAY_BLOCKBLOCK_2_H_NODEPS
#define X10_ARRAY_DISTARRAY_BLOCKBLOCK_2_H_NODEPS
#include <x10/array/DistArray.h>
#include <x10/lang/Fun_0_2.h>
#include <x10/lang/Long.h>
#include <x10/array/DenseIterationSpace_2.h>
#include <x10/compiler/TransientInitExpr.h>
#include <x10/array/LocalState_BB2.h>
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
#ifndef X10_ARRAY_DISTARRAY_BLOCKBLOCK_2_H_GENERICS
#define X10_ARRAY_DISTARRAY_BLOCKBLOCK_2_H_GENERICS
#endif // X10_ARRAY_DISTARRAY_BLOCKBLOCK_2_H_GENERICS
#ifndef X10_ARRAY_DISTARRAY_BLOCKBLOCK_2_H_IMPLEMENTATION
#define X10_ARRAY_DISTARRAY_BLOCKBLOCK_2_H_IMPLEMENTATION
#include <x10/array/DistArray_BlockBlock_2.h>

#ifndef X10_ARRAY_DISTARRAY_BLOCKBLOCK_2__CLOSURE__2_CLOSURE
#define X10_ARRAY_DISTARRAY_BLOCKBLOCK_2__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T)> class x10_array_DistArray_BlockBlock_2__closure__2 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::array::LocalState_BB2<TPMGL(T)>*>::template itable <x10_array_DistArray_BlockBlock_2__closure__2<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::array::LocalState_BB2<TPMGL(T)>* __apply() {
        return ::x10::array::LocalState_BB2<void>::template make< TPMGL(T) >(
                 pg, m, n, init);
        
    }
    
    // captured environment
    ::x10::lang::PlaceGroup* pg;
    x10_long m;
    x10_long n;
    ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>* init;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->pg);
        buf.write(this->m);
        buf.write(this->n);
        buf.write(this->init);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_array_DistArray_BlockBlock_2__closure__2<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_array_DistArray_BlockBlock_2__closure__2<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceGroup* that_pg = buf.read< ::x10::lang::PlaceGroup*>();
        x10_long that_m = buf.read<x10_long>();
        x10_long that_n = buf.read<x10_long>();
        ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>* that_init = buf.read< ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>*>();
        x10_array_DistArray_BlockBlock_2__closure__2<TPMGL(T) >* this_ = new (storage) x10_array_DistArray_BlockBlock_2__closure__2<TPMGL(T) >(that_pg, that_m, that_n, that_init);
        return this_;
    }
    
    x10_array_DistArray_BlockBlock_2__closure__2(::x10::lang::PlaceGroup* pg, x10_long m, x10_long n, ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>* init) : pg(pg), m(m), n(n), init(init) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::array::LocalState_BB2<TPMGL(T)>*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::array::LocalState_BB2<TPMGL(T)>*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10:68";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_0< ::x10::array::LocalState_BB2<TPMGL(T)>*>::template itable <x10_array_DistArray_BlockBlock_2__closure__2<TPMGL(T) > >x10_array_DistArray_BlockBlock_2__closure__2<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_array_DistArray_BlockBlock_2__closure__2<TPMGL(T) >::__apply, &x10_array_DistArray_BlockBlock_2__closure__2<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_array_DistArray_BlockBlock_2__closure__2<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::array::LocalState_BB2<TPMGL(T)>*> >, &x10_array_DistArray_BlockBlock_2__closure__2<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_array_DistArray_BlockBlock_2__closure__2<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_array_DistArray_BlockBlock_2__closure__2<TPMGL(T) >::_deserialize);

#endif // X10_ARRAY_DISTARRAY_BLOCKBLOCK_2__CLOSURE__2_CLOSURE
#ifndef X10_ARRAY_DISTARRAY_BLOCKBLOCK_2__CLOSURE__1_CLOSURE
#define X10_ARRAY_DISTARRAY_BLOCKBLOCK_2__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
template<class TPMGL(T)> class x10_array_DistArray_BlockBlock_2__closure__1 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*>::template itable <x10_array_DistArray_BlockBlock_2__closure__1<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::array::LocalState<TPMGL(T)>* __apply() {
        return reinterpret_cast< ::x10::array::LocalState<TPMGL(T)>*>(x10_array_DistArray_BlockBlock_2__closure__2<TPMGL(T)>(pg, m, n, init).__apply());
        
    }
    
    // captured environment
    ::x10::lang::PlaceGroup* pg;
    x10_long m;
    x10_long n;
    ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>* init;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->pg);
        buf.write(this->m);
        buf.write(this->n);
        buf.write(this->init);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_array_DistArray_BlockBlock_2__closure__1<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_array_DistArray_BlockBlock_2__closure__1<TPMGL(T) > >();
        buf.record_reference(storage);
        ::x10::lang::PlaceGroup* that_pg = buf.read< ::x10::lang::PlaceGroup*>();
        x10_long that_m = buf.read<x10_long>();
        x10_long that_n = buf.read<x10_long>();
        ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>* that_init = buf.read< ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>*>();
        x10_array_DistArray_BlockBlock_2__closure__1<TPMGL(T) >* this_ = new (storage) x10_array_DistArray_BlockBlock_2__closure__1<TPMGL(T) >(that_pg, that_m, that_n, that_init);
        return this_;
    }
    
    x10_array_DistArray_BlockBlock_2__closure__1(::x10::lang::PlaceGroup* pg, x10_long m, x10_long n, ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>* init) : pg(pg), m(m), n(n), init(init) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10:68";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*>::template itable <x10_array_DistArray_BlockBlock_2__closure__1<TPMGL(T) > >x10_array_DistArray_BlockBlock_2__closure__1<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_array_DistArray_BlockBlock_2__closure__1<TPMGL(T) >::__apply, &x10_array_DistArray_BlockBlock_2__closure__1<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_array_DistArray_BlockBlock_2__closure__1<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*> >, &x10_array_DistArray_BlockBlock_2__closure__1<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_array_DistArray_BlockBlock_2__closure__1<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_array_DistArray_BlockBlock_2__closure__1<TPMGL(T) >::_deserialize);

#endif // X10_ARRAY_DISTARRAY_BLOCKBLOCK_2__CLOSURE__1_CLOSURE
#ifndef X10_ARRAY_DISTARRAY_BLOCKBLOCK_2__CLOSURE__3_CLOSURE
#define X10_ARRAY_DISTARRAY_BLOCKBLOCK_2__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_2.h>
template<class TPMGL(T)> class x10_array_DistArray_BlockBlock_2__closure__3 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>::template itable <x10_array_DistArray_BlockBlock_2__closure__3<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    TPMGL(T) __apply(x10_long id__30, x10_long id__31) {
        return ::x10aux::zeroValue< TPMGL(T) >();
        
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_array_DistArray_BlockBlock_2__closure__3<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_array_DistArray_BlockBlock_2__closure__3<TPMGL(T) > >();
        buf.record_reference(storage);
        x10_array_DistArray_BlockBlock_2__closure__3<TPMGL(T) >* this_ = new (storage) x10_array_DistArray_BlockBlock_2__closure__3<TPMGL(T) >();
        return this_;
    }
    
    x10_array_DistArray_BlockBlock_2__closure__3() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10:103";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>::template itable <x10_array_DistArray_BlockBlock_2__closure__3<TPMGL(T) > >x10_array_DistArray_BlockBlock_2__closure__3<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_array_DistArray_BlockBlock_2__closure__3<TPMGL(T) >::__apply, &x10_array_DistArray_BlockBlock_2__closure__3<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_array_DistArray_BlockBlock_2__closure__3<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)> >, &x10_array_DistArray_BlockBlock_2__closure__3<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_array_DistArray_BlockBlock_2__closure__3<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_array_DistArray_BlockBlock_2__closure__3<TPMGL(T) >::_deserialize);

#endif // X10_ARRAY_DISTARRAY_BLOCKBLOCK_2__CLOSURE__3_CLOSURE
#ifndef X10_ARRAY_DISTARRAY_BLOCKBLOCK_2__CLOSURE__4_CLOSURE
#define X10_ARRAY_DISTARRAY_BLOCKBLOCK_2__CLOSURE__4_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_2.h>
template<class TPMGL(T)> class x10_array_DistArray_BlockBlock_2__closure__4 : public ::x10::lang::Closure {
    public:
    
    static typename ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>::template itable <x10_array_DistArray_BlockBlock_2__closure__4<TPMGL(T) > > _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    TPMGL(T) __apply(x10_long id__32, x10_long id__33) {
        return ::x10aux::zeroValue< TPMGL(T) >();
        
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_array_DistArray_BlockBlock_2__closure__4<TPMGL(T) >* storage = ::x10aux::alloc_z<x10_array_DistArray_BlockBlock_2__closure__4<TPMGL(T) > >();
        buf.record_reference(storage);
        x10_array_DistArray_BlockBlock_2__closure__4<TPMGL(T) >* this_ = new (storage) x10_array_DistArray_BlockBlock_2__closure__4<TPMGL(T) >();
        return this_;
    }
    
    x10_array_DistArray_BlockBlock_2__closure__4() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10:116";
    }

};

template<class TPMGL(T)> typename ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>::template itable <x10_array_DistArray_BlockBlock_2__closure__4<TPMGL(T) > >x10_array_DistArray_BlockBlock_2__closure__4<TPMGL(T) >::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_array_DistArray_BlockBlock_2__closure__4<TPMGL(T) >::__apply, &x10_array_DistArray_BlockBlock_2__closure__4<TPMGL(T) >::toString, &::x10::lang::Closure::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10_array_DistArray_BlockBlock_2__closure__4<TPMGL(T) >::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)> >, &x10_array_DistArray_BlockBlock_2__closure__4<TPMGL(T) >::_itable),::x10aux::itable_entry(NULL, NULL)};

template<class TPMGL(T)> const ::x10aux::serialization_id_t x10_array_DistArray_BlockBlock_2__closure__4<TPMGL(T) >::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_array_DistArray_BlockBlock_2__closure__4<TPMGL(T) >::_deserialize);

#endif // X10_ARRAY_DISTARRAY_BLOCKBLOCK_2__CLOSURE__4_CLOSURE
template<class TPMGL(T)> typename ::x10::lang::Iterable< ::x10::lang::Point*>::template itable< ::x10::array::DistArray_BlockBlock_2<TPMGL(T)> >  x10::array::DistArray_BlockBlock_2<TPMGL(T)>::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::array::DistArray<TPMGL(T)>::iterator, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10::lang::Any::itable< ::x10::array::DistArray_BlockBlock_2<TPMGL(T)> >  x10::array::DistArray_BlockBlock_2<TPMGL(T)>::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> typename ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>::template itable< ::x10::array::DistArray_BlockBlock_2<TPMGL(T)> >  x10::array::DistArray_BlockBlock_2<TPMGL(T)>::_itable_2(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::array::DistArray_BlockBlock_2<TPMGL(T)>::__apply, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10::array::DistArray_BlockBlock_2<TPMGL(T)>::_itables[4] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Point*> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)> >, &_itable_2), ::x10aux::itable_entry(NULL, (void*)"::x10::array::DistArray_BlockBlock_2<TPMGL(T)>")};

//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
template<class TPMGL(T)> x10_long x10::array::DistArray_BlockBlock_2<TPMGL(T)>::rank(
  ) {
    return ((x10_long)2ll);
    
}

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"

//#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"

//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
template<class TPMGL(T)> ::x10::array::DenseIterationSpace_2* x10::array::DistArray_BlockBlock_2<TPMGL(T)>::reloadLocalIndices(
  ) {
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    ::x10::array::LocalState_BB2<TPMGL(T)>* ls = ::x10aux::class_cast< ::x10::array::LocalState_BB2<TPMGL(T)>*>(this->FMGL(localHandle)->x10::lang::template PlaceLocalHandle< ::x10::array::LocalState<TPMGL(T)>*>::__apply());
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    return (!::x10aux::struct_equals(ls, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
      ? (::x10aux::nullCheck(ls)->FMGL(localIndices)) : ((__extension__ ({
                                                             ::x10::array::DenseIterationSpace_2* alloc__75699 =
                                                               
                                                             (new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_2>()) ::x10::array::DenseIterationSpace_2());
                                                             (alloc__75699)->::x10::array::DenseIterationSpace_2::_constructor(
                                                               ((x10_long)0ll),
                                                               ((x10_long)-1ll),
                                                               ((x10_long)0ll),
                                                               ((x10_long)-1ll));
                                                             alloc__75699;
                                                         }))
                                                         );
    
}

//#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"

//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
template<class TPMGL(T)> x10_long x10::array::DistArray_BlockBlock_2<TPMGL(T)>::reloadMinIndex_1(
  ) {
    return this->FMGL(localIndices)->x10::array::DenseIterationSpace_2::min(
             ((x10_long)0ll));
    
}

//#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"

//#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
template<class TPMGL(T)> x10_long x10::array::DistArray_BlockBlock_2<TPMGL(T)>::reloadMinIndex_2(
  ) {
    return this->FMGL(localIndices)->x10::array::DenseIterationSpace_2::min(
             ((x10_long)1ll));
    
}

//#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"

//#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
template<class TPMGL(T)> x10_long x10::array::DistArray_BlockBlock_2<TPMGL(T)>::reloadNumElemsLocal_1(
  ) {
    return ((((this->FMGL(localIndices)->x10::array::DenseIterationSpace_2::max(
                 ((x10_long)0ll))) - (this->FMGL(minIndex_1)))) + (((x10_long)1ll)));
    
}

//#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"

//#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
template<class TPMGL(T)> x10_long x10::array::DistArray_BlockBlock_2<TPMGL(T)>::reloadNumElemsLocal_2(
  ) {
    return ((((this->FMGL(localIndices)->x10::array::DenseIterationSpace_2::max(
                 ((x10_long)1ll))) - (this->FMGL(minIndex_2)))) + (((x10_long)1ll)));
    
}

//#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
template<class TPMGL(T)> void x10::array::DistArray_BlockBlock_2<TPMGL(T)>::_constructor(
                           x10_long m, x10_long n, ::x10::lang::PlaceGroup* pg,
                           ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>* init) {
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    (this)->::x10::array::DistArray<TPMGL(T)>::_constructor(
      pg, reinterpret_cast< ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0< ::x10::array::LocalState<TPMGL(T)>*> >(sizeof(x10_array_DistArray_BlockBlock_2__closure__1<TPMGL(T)>)))x10_array_DistArray_BlockBlock_2__closure__1<TPMGL(T)>(pg, m, n, init))),
      (__extension__ ({
          
          //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
          x10_long m__75738 = m;
          x10_long n__75739 = n;
          x10_long ret__75740;
          
          //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
          if ((((m__75738) < (((x10_long)0ll))) || ((n__75739) < (((x10_long)0ll)))))
          {
              ::x10::array::DistArray<void>::raiseNegativeArraySizeException();
          }
          
          //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
          ret__75740 = ((m__75738) * (n__75739));
          ret__75740;
      }))
      );
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    ::x10::array::DistArray_BlockBlock_2<TPMGL(T)>* this__75779 =
      this;
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    this->FMGL(globalIndices) = (__extension__ ({
        ::x10::array::DenseIterationSpace_2* alloc__75700 =
           (new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_2>()) ::x10::array::DenseIterationSpace_2());
        (alloc__75700)->::x10::array::DenseIterationSpace_2::_constructor(
          ((x10_long)0ll), ((x10_long)0ll), ((m) - (((x10_long)1ll))),
          ((n) - (((x10_long)1ll))));
        alloc__75700;
    }))
    ;
    
    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    this->FMGL(numElems_1) = ((((this->FMGL(globalIndices)->x10::array::DenseIterationSpace_2::max(
                                   ((x10_long)0ll))) - (this->FMGL(globalIndices)->x10::array::DenseIterationSpace_2::min(
                                                          ((x10_long)0ll))))) + (((x10_long)1ll)));
    
    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    this->FMGL(numElems_2) = ((((this->FMGL(globalIndices)->x10::array::DenseIterationSpace_2::max(
                                   ((x10_long)1ll))) - (this->FMGL(globalIndices)->x10::array::DenseIterationSpace_2::min(
                                                          ((x10_long)1ll))))) + (((x10_long)1ll)));
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    this->FMGL(localIndices) = this->x10::array::template DistArray_BlockBlock_2<TPMGL(T)>::reloadLocalIndices();
    
    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    this->FMGL(minIndex_1) = (__extension__ ({
        ::x10::array::DistArray_BlockBlock_2<TPMGL(T)>* this__75745 =
          this;
        ::x10aux::nullCheck(this__75745)->FMGL(localIndices)->x10::array::DenseIterationSpace_2::min(
          ((x10_long)0ll));
    }))
    ;
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    this->FMGL(minIndex_2) = (__extension__ ({
        ::x10::array::DistArray_BlockBlock_2<TPMGL(T)>* this__75746 =
          this;
        ::x10aux::nullCheck(this__75746)->FMGL(localIndices)->x10::array::DenseIterationSpace_2::min(
          ((x10_long)1ll));
    }))
    ;
    
    //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    this->FMGL(numElemsLocal_1) = this->x10::array::template DistArray_BlockBlock_2<TPMGL(T)>::reloadNumElemsLocal_1();
    
    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    this->FMGL(numElemsLocal_2) = this->x10::array::template DistArray_BlockBlock_2<TPMGL(T)>::reloadNumElemsLocal_2();
}
template<class TPMGL(T)> ::x10::array::DistArray_BlockBlock_2<TPMGL(T)>* x10::array::DistArray_BlockBlock_2<TPMGL(T)>::_make(
                           x10_long m, x10_long n, ::x10::lang::PlaceGroup* pg,
                           ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>* init)
{
    ::x10::array::DistArray_BlockBlock_2<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::DistArray_BlockBlock_2<TPMGL(T)> >()) ::x10::array::DistArray_BlockBlock_2<TPMGL(T)>();
    this_->_constructor(m, n, pg, init);
    return this_;
}



//#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
template<class TPMGL(T)> void x10::array::DistArray_BlockBlock_2<TPMGL(T)>::_constructor(
                           x10_long m, x10_long n, ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>* init) {
    
    //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    (this)->::x10::array::DistArray_BlockBlock_2<TPMGL(T)>::_constructor(
      m, n, reinterpret_cast< ::x10::lang::PlaceGroup*>(::x10::lang::PlaceGroup::FMGL(WORLD__get)()),
      init);
    
}
template<class TPMGL(T)> ::x10::array::DistArray_BlockBlock_2<TPMGL(T)>* x10::array::DistArray_BlockBlock_2<TPMGL(T)>::_make(
                           x10_long m, x10_long n, ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>* init)
{
    ::x10::array::DistArray_BlockBlock_2<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::DistArray_BlockBlock_2<TPMGL(T)> >()) ::x10::array::DistArray_BlockBlock_2<TPMGL(T)>();
    this_->_constructor(m, n, init);
    return this_;
}



//#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
template<class TPMGL(T)> void x10::array::DistArray_BlockBlock_2<TPMGL(T)>::_constructor(
                           x10_long m, x10_long n, ::x10::lang::PlaceGroup* pg) {
    
    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    (this)->::x10::array::DistArray_BlockBlock_2<TPMGL(T)>::_constructor(
      m, n, pg, reinterpret_cast< ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)> >(sizeof(x10_array_DistArray_BlockBlock_2__closure__3<TPMGL(T)>)))x10_array_DistArray_BlockBlock_2__closure__3<TPMGL(T)>())));
    
}
template<class TPMGL(T)> ::x10::array::DistArray_BlockBlock_2<TPMGL(T)>* x10::array::DistArray_BlockBlock_2<TPMGL(T)>::_make(
                           x10_long m, x10_long n, ::x10::lang::PlaceGroup* pg)
{
    ::x10::array::DistArray_BlockBlock_2<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::DistArray_BlockBlock_2<TPMGL(T)> >()) ::x10::array::DistArray_BlockBlock_2<TPMGL(T)>();
    this_->_constructor(m, n, pg);
    return this_;
}



//#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
template<class TPMGL(T)> void x10::array::DistArray_BlockBlock_2<TPMGL(T)>::_constructor(
                           x10_long m, x10_long n) {
    
    //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    (this)->::x10::array::DistArray_BlockBlock_2<TPMGL(T)>::_constructor(
      m, n, reinterpret_cast< ::x10::lang::PlaceGroup*>(::x10::lang::PlaceGroup::FMGL(WORLD__get)()),
      reinterpret_cast< ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)> >(sizeof(x10_array_DistArray_BlockBlock_2__closure__4<TPMGL(T)>)))x10_array_DistArray_BlockBlock_2__closure__4<TPMGL(T)>())));
    
}
template<class TPMGL(T)> ::x10::array::DistArray_BlockBlock_2<TPMGL(T)>* x10::array::DistArray_BlockBlock_2<TPMGL(T)>::_make(
                           x10_long m, x10_long n) {
    ::x10::array::DistArray_BlockBlock_2<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::DistArray_BlockBlock_2<TPMGL(T)> >()) ::x10::array::DistArray_BlockBlock_2<TPMGL(T)>();
    this_->_constructor(m, n);
    return this_;
}



//#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
template<class TPMGL(T)> ::x10::array::IterationSpace* x10::array::DistArray_BlockBlock_2<TPMGL(T)>::globalIndices(
  ) {
    return reinterpret_cast< ::x10::array::IterationSpace*>(this->FMGL(globalIndices));
    
}

//#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
template<class TPMGL(T)> ::x10::array::IterationSpace* x10::array::DistArray_BlockBlock_2<TPMGL(T)>::localIndices(
  ) {
    return reinterpret_cast< ::x10::array::IterationSpace*>(this->FMGL(localIndices));
    
}

//#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
template<class TPMGL(T)> ::x10::lang::Place x10::array::DistArray_BlockBlock_2<TPMGL(T)>::place(
  x10_long i, x10_long j) {
    
    //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    x10_long tmp = ::x10::array::BlockingUtils::mapIndexToBlockBlockPartition(
                     reinterpret_cast< ::x10::array::IterationSpace*>(this->FMGL(globalIndices)),
                     (__extension__ ({
                         ::x10::lang::PlaceGroup* this__75747 =
                           this->FMGL(placeGroup);
                         ::x10aux::nullCheck(this__75747)->numPlaces();
                     }))
                     , i, j);
    
    //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    return (::x10aux::struct_equals(tmp, ((x10_long)-1ll)))
      ? (::x10::lang::Place::FMGL(INVALID_PLACE__get)()) : (::x10aux::nullCheck(this->FMGL(placeGroup))->__apply(
                                                              tmp));
    
}

//#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
template<class TPMGL(T)> ::x10::lang::Place x10::array::DistArray_BlockBlock_2<TPMGL(T)>::place(
  ::x10::lang::Point* p) {
    return this->x10::array::template DistArray_BlockBlock_2<TPMGL(T)>::place(
             ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
               ((x10_long)0ll)), ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                                   ((x10_long)1ll)));
    
}

//#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
template<class TPMGL(T)> TPMGL(T) x10::array::DistArray_BlockBlock_2<TPMGL(T)>::__apply(
  x10_long i, x10_long j) {
    
    //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    return (this->FMGL(raw))->unchecked_apply((__extension__ ({
        ::x10::array::DistArray_BlockBlock_2<TPMGL(T)>* this__75750 =
          this;
        
        //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        x10_long i__75748 = i;
        x10_long j__75749 = j;
        ((((j__75749) - (::x10aux::nullCheck(this__75750)->FMGL(minIndex_2)))) + (((((i__75748) - (::x10aux::nullCheck(this__75750)->FMGL(minIndex_1)))) * (::x10aux::nullCheck(this__75750)->FMGL(numElemsLocal_2)))));
    }))
    );
    
}

//#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
template<class TPMGL(T)> TPMGL(T) x10::array::DistArray_BlockBlock_2<TPMGL(T)>::__apply(
  ::x10::lang::Point* p) {
    ::x10::array::DistArray_BlockBlock_2<TPMGL(T)>* this__75782 =
      this;
    
    //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    x10_long i__75783 = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                          ((x10_long)0ll));
    x10_long j__75784 = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                          ((x10_long)1ll));
    TPMGL(T) ret__75785;
    
    //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    ret__75785 = (::x10aux::nullCheck(this__75782)->FMGL(raw))->unchecked_apply((__extension__ ({
        
        //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        x10_long i__75780 = i__75783;
        x10_long j__75781 = j__75784;
        ((((j__75781) - (::x10aux::nullCheck(this__75782)->FMGL(minIndex_2)))) + (((((i__75780) - (::x10aux::nullCheck(this__75782)->FMGL(minIndex_1)))) * (::x10aux::nullCheck(this__75782)->FMGL(numElemsLocal_2)))));
    }))
    );
    
    //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    return ret__75785;
    
}

//#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
template<class TPMGL(T)> TPMGL(T) x10::array::DistArray_BlockBlock_2<TPMGL(T)>::__set(
  x10_long i, x10_long j, TPMGL(T) v) {
    
    //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    (this->FMGL(raw))->unchecked_set((__extension__ ({
        ::x10::array::DistArray_BlockBlock_2<TPMGL(T)>* this__75760 =
          this;
        
        //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        x10_long i__75758 = i;
        x10_long j__75759 = j;
        ((((j__75759) - (::x10aux::nullCheck(this__75760)->FMGL(minIndex_2)))) + (((((i__75758) - (::x10aux::nullCheck(this__75760)->FMGL(minIndex_1)))) * (::x10aux::nullCheck(this__75760)->FMGL(numElemsLocal_2)))));
    }))
    , v);
    
    //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    return v;
    
}

//#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
template<class TPMGL(T)> TPMGL(T) x10::array::DistArray_BlockBlock_2<TPMGL(T)>::__set(
  ::x10::lang::Point* p, TPMGL(T) v) {
    ::x10::array::DistArray_BlockBlock_2<TPMGL(T)>* this__75788 =
      this;
    
    //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    x10_long i__75789 = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                          ((x10_long)0ll));
    x10_long j__75790 = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                          ((x10_long)1ll));
    TPMGL(T) v__75791 = v;
    TPMGL(T) ret__75792;
    
    //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    (::x10aux::nullCheck(this__75788)->FMGL(raw))->unchecked_set((__extension__ ({
        
        //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
        x10_long i__75786 = i__75789;
        x10_long j__75787 = j__75790;
        ((((j__75787) - (::x10aux::nullCheck(this__75788)->FMGL(minIndex_2)))) + (((((i__75786) - (::x10aux::nullCheck(this__75788)->FMGL(minIndex_1)))) * (::x10aux::nullCheck(this__75788)->FMGL(numElemsLocal_2)))));
    }))
    , v__75791);
    
    //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    ret__75792 = v__75791;
    
    //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    return ret__75792;
    
}

//#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
template<class TPMGL(T)> void x10::array::DistArray_BlockBlock_2<TPMGL(T)>::validateIndex(
  x10_long i, x10_long j) {
 
}

//#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
template<class TPMGL(T)> x10_long x10::array::DistArray_BlockBlock_2<TPMGL(T)>::offset(
  x10_long i, x10_long j) {
    
    //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
    return ((((j) - (this->FMGL(minIndex_2)))) + (((((i) - (this->FMGL(minIndex_1)))) * (this->FMGL(numElemsLocal_2)))));
    
}

//#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"

//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_BlockBlock_2.x10"
template<class TPMGL(T)> ::x10::array::DistArray_BlockBlock_2<TPMGL(T)>*
  x10::array::DistArray_BlockBlock_2<TPMGL(T)>::x10__array__DistArray_BlockBlock_2____this__x10__array__DistArray_BlockBlock_2(
  ) {
    return this;
    
}
template<class TPMGL(T)> void x10::array::DistArray_BlockBlock_2<TPMGL(T)>::__fieldInitializers_x10_array_DistArray_BlockBlock_2(
  ) {
 
}
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10::array::DistArray_BlockBlock_2<TPMGL(T)>::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::array::DistArray_BlockBlock_2<TPMGL(T)>::_deserializer);

template<class TPMGL(T)> void x10::array::DistArray_BlockBlock_2<TPMGL(T)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::array::DistArray<TPMGL(T)>::_serialize_body(buf);
    buf.write(this->FMGL(globalIndices));
    buf.write(this->FMGL(numElems_1));
    buf.write(this->FMGL(numElems_2));
    
}

template<class TPMGL(T)> ::x10::lang::Reference* ::x10::array::DistArray_BlockBlock_2<TPMGL(T)>::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::array::DistArray_BlockBlock_2<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::DistArray_BlockBlock_2<TPMGL(T)> >()) ::x10::array::DistArray_BlockBlock_2<TPMGL(T)>();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

template<class TPMGL(T)> void x10::array::DistArray_BlockBlock_2<TPMGL(T)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::array::DistArray<TPMGL(T)>::_deserialize_body(buf);
    FMGL(globalIndices) = buf.read< ::x10::array::DenseIterationSpace_2*>();
    FMGL(numElems_1) = buf.read<x10_long>();
    FMGL(numElems_2) = buf.read<x10_long>();
    /* fields with @TransientInitExpr annotations */
    FMGL(localIndices) = x10::array::template DistArray_BlockBlock_2<TPMGL(T)>::reloadLocalIndices();
    FMGL(minIndex_1) = x10::array::template DistArray_BlockBlock_2<TPMGL(T)>::reloadMinIndex_1();
    FMGL(minIndex_2) = x10::array::template DistArray_BlockBlock_2<TPMGL(T)>::reloadMinIndex_2();
    FMGL(numElemsLocal_1) = x10::array::template DistArray_BlockBlock_2<TPMGL(T)>::reloadNumElemsLocal_1();
    FMGL(numElemsLocal_2) = x10::array::template DistArray_BlockBlock_2<TPMGL(T)>::reloadNumElemsLocal_2();
    
}

#endif // X10_ARRAY_DISTARRAY_BLOCKBLOCK_2_H_IMPLEMENTATION
#endif // __X10_ARRAY_DISTARRAY_BLOCKBLOCK_2_H_NODEPS
