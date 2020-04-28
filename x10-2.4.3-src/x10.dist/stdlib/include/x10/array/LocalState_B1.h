#ifndef __X10_ARRAY_LOCALSTATE_B1_H
#define __X10_ARRAY_LOCALSTATE_B1_H

#include <x10rt.h>


#define X10_ARRAY_LOCALSTATE_H_NODEPS
#include <x10/array/LocalState.h>
#undef X10_ARRAY_LOCALSTATE_H_NODEPS
namespace x10 { namespace array { 
class DenseIterationSpace_1;
} } 
namespace x10 { namespace lang { 
class PlaceGroup;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(Z1), class TPMGL(U)> class Fun_0_1;
} } 
namespace x10 { namespace array { 
class BlockingUtils;
} } 
namespace x10 { namespace array { 
class IterationSpace;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
class Unsafe;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace array { 

template<class TPMGL(S)> class LocalState_B1;
template <> class LocalState_B1<void>;
template<class TPMGL(S)> class LocalState_B1 : public ::x10::array::LocalState<TPMGL(S)>
  {
    public:
    RTT_H_DECLS_CLASS
    
    ::x10::array::DenseIterationSpace_1* FMGL(globalIndices);
    
    ::x10::array::DenseIterationSpace_1* FMGL(localIndices);
    
    void _constructor(::x10::lang::PlaceGroup* pg, ::x10::lang::Rail< TPMGL(S) >* data,
                      x10_long size, ::x10::array::DenseIterationSpace_1* gs,
                      ::x10::array::DenseIterationSpace_1* ls);
    
    static ::x10::array::LocalState_B1<TPMGL(S)>* _make(::x10::lang::PlaceGroup* pg,
                                                        ::x10::lang::Rail< TPMGL(S) >* data,
                                                        x10_long size,
                                                        ::x10::array::DenseIterationSpace_1* gs,
                                                        ::x10::array::DenseIterationSpace_1* ls);
    
    virtual ::x10::array::LocalState_B1<TPMGL(S)>* x10__array__LocalState_B1____this__x10__array__LocalState_B1(
      );
    virtual void __fieldInitializers_x10_array_LocalState_B1(
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

template<class TPMGL(S)> ::x10aux::RuntimeType x10::array::LocalState_B1<TPMGL(S)>::rtt;
template<class TPMGL(S)> void x10::array::LocalState_B1<TPMGL(S)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::array::LocalState_B1<void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::array::LocalState<TPMGL(S)> >()};
    const ::x10aux::RuntimeType* params[1] = { ::x10aux::getRTT<TPMGL(S)>()};
    ::x10aux::RuntimeType::Variance variances[1] = { ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.array.LocalState_B1";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 1, parents, 1, params, variances);
}

template <> class LocalState_B1<void> : public ::x10::array::LocalState<void>
{
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    template<class TPMGL(S)> static ::x10::array::LocalState_B1<TPMGL(S)>*
      make(::x10::lang::PlaceGroup* pg, x10_long n, ::x10::lang::Fun_0_1<x10_long, TPMGL(S)>* init);
    
    
};

} } 
#endif // X10_ARRAY_LOCALSTATE_B1_H

namespace x10 { namespace array { 
template<class TPMGL(S)> class LocalState_B1;
} } 

#ifndef X10_ARRAY_LOCALSTATE_B1_H_NODEPS
#define X10_ARRAY_LOCALSTATE_B1_H_NODEPS
#include <x10/array/LocalState.h>
#include <x10/array/DenseIterationSpace_1.h>
#include <x10/lang/PlaceGroup.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Long.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/array/BlockingUtils.h>
#include <x10/array/IterationSpace.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Place.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Unsafe.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_ARRAY_LOCALSTATE_B1_H_GENERICS
#define X10_ARRAY_LOCALSTATE_B1_H_GENERICS
#endif // X10_ARRAY_LOCALSTATE_B1_H_GENERICS
#ifndef X10_ARRAY_LOCALSTATE_B1_H_IMPLEMENTATION
#define X10_ARRAY_LOCALSTATE_B1_H_IMPLEMENTATION
#include <x10/array/LocalState_B1.h>


//#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"

//#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"

//#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
template<class TPMGL(S)> void x10::array::LocalState_B1<TPMGL(S)>::_constructor(
                           ::x10::lang::PlaceGroup* pg, ::x10::lang::Rail< TPMGL(S) >* data,
                           x10_long size, ::x10::array::DenseIterationSpace_1* gs,
                           ::x10::array::DenseIterationSpace_1* ls) {
    
    //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    ::x10::array::LocalState<TPMGL(S)>* this__75412 = this;
    
    //#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    ::x10::lang::PlaceGroup* pg__75413 = pg;
    ::x10::lang::Rail< TPMGL(S) >* rail__75414 = data;
    x10_long size__75415 = size;
    
    //#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray.x10"
    ::x10aux::nullCheck(this__75412)->FMGL(pg) = pg__75413;
    ::x10aux::nullCheck(this__75412)->FMGL(rail) = rail__75414;
    ::x10aux::nullCheck(this__75412)->FMGL(size) = size__75415;
    
    //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    
    //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    ::x10::array::LocalState_B1<TPMGL(S)>* this__75411 = this;
    
    //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    this->FMGL(globalIndices) = gs;
    
    //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    this->FMGL(localIndices) = ls;
}
template<class TPMGL(S)> ::x10::array::LocalState_B1<TPMGL(S)>* x10::array::LocalState_B1<TPMGL(S)>::_make(
                           ::x10::lang::PlaceGroup* pg, ::x10::lang::Rail< TPMGL(S) >* data,
                           x10_long size, ::x10::array::DenseIterationSpace_1* gs,
                           ::x10::array::DenseIterationSpace_1* ls)
{
    ::x10::array::LocalState_B1<TPMGL(S)>* this_ = new (::x10aux::alloc_z< ::x10::array::LocalState_B1<TPMGL(S)> >()) ::x10::array::LocalState_B1<TPMGL(S)>();
    this_->_constructor(pg, data, size, gs, ls);
    return this_;
}



//#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"

//#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
template<class TPMGL(S)> ::x10::array::LocalState_B1<TPMGL(S)>*
  x10::array::LocalState_B1<TPMGL(S)>::x10__array__LocalState_B1____this__x10__array__LocalState_B1(
  ) {
    return this;
    
}
template<class TPMGL(S)> void x10::array::LocalState_B1<TPMGL(S)>::__fieldInitializers_x10_array_LocalState_B1(
  ) {
 
}
template<class TPMGL(S)> const ::x10aux::serialization_id_t x10::array::LocalState_B1<TPMGL(S)>::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::array::LocalState_B1<TPMGL(S)>::_deserializer);

template<class TPMGL(S)> void x10::array::LocalState_B1<TPMGL(S)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::array::LocalState<TPMGL(S)>::_serialize_body(buf);
    buf.write(this->FMGL(globalIndices));
    buf.write(this->FMGL(localIndices));
    
}

template<class TPMGL(S)> ::x10::lang::Reference* ::x10::array::LocalState_B1<TPMGL(S)>::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::array::LocalState_B1<TPMGL(S)>* this_ = new (::x10aux::alloc_z< ::x10::array::LocalState_B1<TPMGL(S)> >()) ::x10::array::LocalState_B1<TPMGL(S)>();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

template<class TPMGL(S)> void x10::array::LocalState_B1<TPMGL(S)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::array::LocalState<TPMGL(S)>::_deserialize_body(buf);
    FMGL(globalIndices) = buf.read< ::x10::array::DenseIterationSpace_1*>();
    FMGL(localIndices) = buf.read< ::x10::array::DenseIterationSpace_1*>();
}

template<class TPMGL(S)> ::x10::array::LocalState_B1<TPMGL(S)>*
  x10::array::LocalState_B1<void>::make(::x10::lang::PlaceGroup* pg,
                                        x10_long n, ::x10::lang::Fun_0_1<x10_long, TPMGL(S)>* init) {
    
    //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    ::x10::array::DenseIterationSpace_1* globalSpace =  (new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_1>()) ::x10::array::DenseIterationSpace_1());
    (globalSpace)->::x10::array::DenseIterationSpace_1::_constructor(
      ((x10_long)0ll), ((n) - (((x10_long)1ll))));
    
    //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    ::x10::array::DenseIterationSpace_1* localSpace = ::x10::array::BlockingUtils::partitionBlock(
                                                        reinterpret_cast< ::x10::array::IterationSpace*>(globalSpace),
                                                        pg->numPlaces(),
                                                        pg->indexOf(
                                                          ::x10::lang::Place::_make(::x10aux::here)));
    
    //#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    ::x10::lang::Rail< TPMGL(S) >* data;
    
    //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    if (((localSpace->FMGL(max)) < (localSpace->FMGL(min))))
    {
        
        //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        data = ::x10::lang::Rail< TPMGL(S) >::_make();
    } else {
        
        //#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        x10_long low = localSpace->x10::array::DenseIterationSpace_1::min(
                         ((x10_long)0ll));
        
        //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        x10_long hi = localSpace->x10::array::DenseIterationSpace_1::max(
                        ((x10_long)0ll));
        
        //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        x10_long dataSize = ((((hi) - (low))) + (((x10_long)1ll)));
        
        //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        data = ::x10::lang::Rail< TPMGL(S) >::_makeUnsafe(dataSize, false);
        
        //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
        x10_long i__74507min__75417 = low;
        x10_long i__74507max__75418 = hi;
        {
            x10_long i__75419;
            for (i__75419 = i__74507min__75417; ((i__75419) <= (i__74507max__75418));
                 i__75419 = ((i__75419) + (((x10_long)1ll))))
            {
                x10_long i__75420 = i__75419;
                
                //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
                x10_long offset__75416 = ((i__75420) - (low));
                
                //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
                data->x10::lang::template Rail< TPMGL(S) >::__set(
                  offset__75416, ::x10::lang::Fun_0_1<x10_long, TPMGL(S)>::__apply(::x10aux::nullCheck(init), 
                    i__75420));
            }
        }
        
    }
    
    //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/DistArray_Block_1.x10"
    ::x10::array::LocalState_B1<TPMGL(S)>* alloc__75421 =
       (new (::x10aux::alloc_z< ::x10::array::LocalState_B1<TPMGL(S)> >()) ::x10::array::LocalState_B1<TPMGL(S)>());
    (alloc__75421)->::x10::array::LocalState_B1<TPMGL(S)>::_constructor(
      pg, data, n, globalSpace, localSpace);
    return alloc__75421;
    
}
#endif // X10_ARRAY_LOCALSTATE_B1_H_IMPLEMENTATION
#endif // __X10_ARRAY_LOCALSTATE_B1_H_NODEPS
