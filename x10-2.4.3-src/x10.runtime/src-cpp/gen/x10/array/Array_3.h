#ifndef __X10_ARRAY_ARRAY_3_H
#define __X10_ARRAY_ARRAY_3_H

#include <x10rt.h>


#define X10_ARRAY_ARRAY_H_NODEPS
#include <x10/array/Array.h>
#undef X10_ARRAY_ARRAY_H_NODEPS
#define X10_LANG_FUN_0_3_H_NODEPS
#include <x10/lang/Fun_0_3.h>
#undef X10_LANG_FUN_0_3_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace compiler { 
class Inline;
} } 
namespace x10 { namespace lang { 
class IllegalOperationException;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace util { 
class StringBuilder;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace lang { 
class Unsafe;
} } 
namespace x10 { namespace array { 
class DenseIterationSpace_3;
} } 
namespace x10 { namespace lang { 
class Point;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace array { 

template<class TPMGL(T)> class Array_3;
template <> class Array_3<void>;
template<class TPMGL(T)> class Array_3 : public ::x10::array::Array<TPMGL(T)>
  {
    public:
    RTT_H_DECLS_CLASS
    
    x10_long FMGL(numElems_1);
    
    x10_long FMGL(numElems_2);
    
    x10_long FMGL(numElems_3);
    
    static ::x10aux::itable_entry _itables[5];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static typename ::x10::lang::Iterable<TPMGL(T)>::template itable< ::x10::array::Array_3<TPMGL(T)> > _itable_0;
    
    static ::x10::lang::Any::itable< ::x10::array::Array_3<TPMGL(T)> > _itable_1;
    
    static typename ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)>::template itable< ::x10::array::Array_3<TPMGL(T)> > _itable_2;
    
    static typename ::x10::lang::Fun_0_3<x10_long, x10_long, x10_long, TPMGL(T)>::template itable< ::x10::array::Array_3<TPMGL(T)> > _itable_3;
    
    x10_long rank();
    void _constructor(x10_long m, x10_long n, x10_long p);
    
    static ::x10::array::Array_3<TPMGL(T)>* _make(x10_long m, x10_long n,
                                                  x10_long p);
    
    void _constructor(x10_long m, x10_long n, x10_long p, TPMGL(T) init);
    
    static ::x10::array::Array_3<TPMGL(T)>* _make(x10_long m, x10_long n,
                                                  x10_long p, TPMGL(T) init);
    
    void _constructor(x10_long m, x10_long n, x10_long p, ::x10::lang::Fun_0_3<x10_long, x10_long, x10_long, TPMGL(T)>* init);
    
    static ::x10::array::Array_3<TPMGL(T)>* _make(x10_long m, x10_long n,
                                                  x10_long p, ::x10::lang::Fun_0_3<x10_long, x10_long, x10_long, TPMGL(T)>* init);
    
    void _constructor(::x10::array::Array_3<TPMGL(T)>* src);
    
    static ::x10::array::Array_3<TPMGL(T)>* _make(::x10::array::Array_3<TPMGL(T)>* src);
    
    void _constructor(::x10::lang::Rail< TPMGL(T) >* r, x10_long m, x10_long n,
                      x10_long p);
    
    static ::x10::array::Array_3<TPMGL(T)>* _make(::x10::lang::Rail< TPMGL(T) >* r,
                                                  x10_long m, x10_long n,
                                                  x10_long p);
    
    virtual ::x10::lang::String* toString();
    virtual ::x10::array::IterationSpace* indices();
    virtual x10_long offset(x10_long i, x10_long j, x10_long k);
    virtual TPMGL(T) __apply(x10_long i, x10_long j, x10_long k);
    virtual TPMGL(T) __apply(::x10::lang::Point* p);
    virtual TPMGL(T) __set(x10_long i, x10_long j, x10_long k, TPMGL(T) v);
    virtual TPMGL(T) __set(::x10::lang::Point* p, TPMGL(T) v);
    virtual ::x10::array::Array_3<TPMGL(T)>* x10__array__Array_3____this__x10__array__Array_3(
      );
    virtual void __fieldInitializers_x10_array_Array_3();
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

template<class TPMGL(T)> ::x10aux::RuntimeType x10::array::Array_3<TPMGL(T)>::rtt;
template<class TPMGL(T)> void x10::array::Array_3<TPMGL(T)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::array::Array_3<void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::array::Array<TPMGL(T)> >(), ::x10aux::getRTT< ::x10::lang::Fun_0_3<x10_long, x10_long, x10_long, TPMGL(T)> >()};
    const ::x10aux::RuntimeType* params[1] = { ::x10aux::getRTT<TPMGL(T)>()};
    ::x10aux::RuntimeType::Variance variances[1] = { ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.array.Array_3";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 2, parents, 1, params, variances);
}

template <> class Array_3<void> : public ::x10::array::Array<void>
{
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    template<class TPMGL(T)> static ::x10::array::Array_3<TPMGL(T)>*
      makeView(::x10::lang::Rail< TPMGL(T) >* r, x10_long m,
               x10_long n, x10_long p);
    
    static x10_long validateSize(x10_long m, x10_long n, x10_long p);
    
    
};

} } 
#endif // X10_ARRAY_ARRAY_3_H

namespace x10 { namespace array { 
template<class TPMGL(T)> class Array_3;
} } 

#ifndef X10_ARRAY_ARRAY_3_H_NODEPS
#define X10_ARRAY_ARRAY_3_H_NODEPS
#include <x10/array/Array.h>
#include <x10/lang/Fun_0_3.h>
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Rail.h>
#include <x10/compiler/Inline.h>
#include <x10/lang/IllegalOperationException.h>
#include <x10/lang/String.h>
#include <x10/util/StringBuilder.h>
#include <x10/lang/Any.h>
#include <x10/lang/Unsafe.h>
#include <x10/array/DenseIterationSpace_3.h>
#include <x10/lang/Point.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_ARRAY_ARRAY_3_H_GENERICS
#define X10_ARRAY_ARRAY_3_H_GENERICS
#endif // X10_ARRAY_ARRAY_3_H_GENERICS
#ifndef X10_ARRAY_ARRAY_3_H_IMPLEMENTATION
#define X10_ARRAY_ARRAY_3_H_IMPLEMENTATION
#include <x10/array/Array_3.h>


//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"

//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"

//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
template<class TPMGL(T)> typename ::x10::lang::Iterable<TPMGL(T)>::template itable< ::x10::array::Array_3<TPMGL(T)> >  x10::array::Array_3<TPMGL(T)>::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::array::Array<TPMGL(T)>::iterator, &x10::array::Array_3<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10::lang::Any::itable< ::x10::array::Array_3<TPMGL(T)> >  x10::array::Array_3<TPMGL(T)>::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::array::Array_3<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> typename ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)>::template itable< ::x10::array::Array_3<TPMGL(T)> >  x10::array::Array_3<TPMGL(T)>::_itable_2(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::array::Array_3<TPMGL(T)>::__apply, &x10::array::Array_3<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> typename ::x10::lang::Fun_0_3<x10_long, x10_long, x10_long, TPMGL(T)>::template itable< ::x10::array::Array_3<TPMGL(T)> >  x10::array::Array_3<TPMGL(T)>::_itable_3(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::array::Array_3<TPMGL(T)>::__apply, &x10::array::Array_3<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10::array::Array_3<TPMGL(T)>::_itables[5] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable<TPMGL(T)> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)> >, &_itable_2), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_3<x10_long, x10_long, x10_long, TPMGL(T)> >, &_itable_3), ::x10aux::itable_entry(NULL, (void*)"::x10::array::Array_3<TPMGL(T)>")};

//#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
template<class TPMGL(T)> x10_long x10::array::Array_3<TPMGL(T)>::rank() {
    return ((x10_long)3ll);
    
}

//#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
template<class TPMGL(T)> void x10::array::Array_3<TPMGL(T)>::_constructor(
                           x10_long m, x10_long n, x10_long p) {
    
    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    (this)->::x10::array::Array<TPMGL(T)>::_constructor((__extension__ ({
                                                            
                                                            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                                                            x10_long m__72398 =
                                                              m;
                                                            x10_long n__72399 =
                                                              n;
                                                            x10_long p__72400 =
                                                              p;
                                                            x10_long ret__72401;
                                                            
                                                            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                                                            if (((((m__72398) < (((x10_long)0ll))) ||
                                                                ((n__72399) < (((x10_long)0ll)))) ||
                                                                ((p__72400) < (((x10_long)0ll)))))
                                                            {
                                                                ::x10::array::Array<void>::raiseNegativeArraySizeException();
                                                            }
                                                            
                                                            //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                                                            ret__72401 =
                                                              ((((m__72398) * (n__72399))) * (p__72400));
                                                            ret__72401;
                                                        }))
                                                        ,
                                                        true);
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    FMGL(numElems_1) = m;
    FMGL(numElems_2) = n;
    FMGL(numElems_3) = p;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    ::x10::array::Array_3<TPMGL(T)>* this__72571 = this;
    
}
template<class TPMGL(T)> ::x10::array::Array_3<TPMGL(T)>* x10::array::Array_3<TPMGL(T)>::_make(
                           x10_long m, x10_long n, x10_long p)
{
    ::x10::array::Array_3<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::Array_3<TPMGL(T)> >()) ::x10::array::Array_3<TPMGL(T)>();
    this_->_constructor(m, n, p);
    return this_;
}



//#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
template<class TPMGL(T)> void x10::array::Array_3<TPMGL(T)>::_constructor(
                           x10_long m, x10_long n, x10_long p,
                           TPMGL(T) init) {
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    (this)->::x10::array::Array<TPMGL(T)>::_constructor((__extension__ ({
                                                            
                                                            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                                                            x10_long m__72406 =
                                                              m;
                                                            x10_long n__72407 =
                                                              n;
                                                            x10_long p__72408 =
                                                              p;
                                                            x10_long ret__72409;
                                                            
                                                            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                                                            if (((((m__72406) < (((x10_long)0ll))) ||
                                                                ((n__72407) < (((x10_long)0ll)))) ||
                                                                ((p__72408) < (((x10_long)0ll)))))
                                                            {
                                                                ::x10::array::Array<void>::raiseNegativeArraySizeException();
                                                            }
                                                            
                                                            //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                                                            ret__72409 =
                                                              ((((m__72406) * (n__72407))) * (p__72408));
                                                            ret__72409;
                                                        }))
                                                        ,
                                                        false);
    
    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    FMGL(numElems_1) = m;
    FMGL(numElems_2) = n;
    FMGL(numElems_3) = p;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    ::x10::array::Array_3<TPMGL(T)>* this__72572 = this;
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::fill(
      init);
}
template<class TPMGL(T)> ::x10::array::Array_3<TPMGL(T)>* x10::array::Array_3<TPMGL(T)>::_make(
                           x10_long m, x10_long n, x10_long p,
                           TPMGL(T) init) {
    ::x10::array::Array_3<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::Array_3<TPMGL(T)> >()) ::x10::array::Array_3<TPMGL(T)>();
    this_->_constructor(m, n, p, init);
    return this_;
}



//#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
template<class TPMGL(T)> void x10::array::Array_3<TPMGL(T)>::_constructor(
                           x10_long m, x10_long n, x10_long p,
                           ::x10::lang::Fun_0_3<x10_long, x10_long, x10_long, TPMGL(T)>* init) {
    
    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    (this)->::x10::array::Array<TPMGL(T)>::_constructor((__extension__ ({
                                                            
                                                            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                                                            x10_long m__72414 =
                                                              m;
                                                            x10_long n__72415 =
                                                              n;
                                                            x10_long p__72416 =
                                                              p;
                                                            x10_long ret__72417;
                                                            
                                                            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                                                            if (((((m__72414) < (((x10_long)0ll))) ||
                                                                ((n__72415) < (((x10_long)0ll)))) ||
                                                                ((p__72416) < (((x10_long)0ll)))))
                                                            {
                                                                ::x10::array::Array<void>::raiseNegativeArraySizeException();
                                                            }
                                                            
                                                            //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                                                            ret__72417 =
                                                              ((((m__72414) * (n__72415))) * (p__72416));
                                                            ret__72417;
                                                        }))
                                                        ,
                                                        false);
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    FMGL(numElems_1) = m;
    FMGL(numElems_2) = n;
    FMGL(numElems_3) = p;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    ::x10::array::Array_3<TPMGL(T)>* this__72573 = this;
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    x10_long i__72327max__72584 = ((m) - (((x10_long)1ll)));
    {
        x10_long i__72585;
        for (i__72585 = ((x10_long)0ll); ((i__72585) <= (i__72327max__72584));
             i__72585 = ((i__72585) + (((x10_long)1ll))))
        {
            x10_long i__72586 = i__72585;
            
            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            x10_long i__72309max__72581 = ((n) - (((x10_long)1ll)));
            {
                x10_long i__72582;
                for (i__72582 = ((x10_long)0ll); ((i__72582) <= (i__72309max__72581));
                     i__72582 = ((i__72582) + (((x10_long)1ll))))
                {
                    x10_long j__72583 = i__72582;
                    
                    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    x10_long i__72291max__72578 = ((p) - (((x10_long)1ll)));
                    {
                        x10_long i__72579;
                        for (i__72579 = ((x10_long)0ll); ((i__72579) <= (i__72291max__72578));
                             i__72579 = ((i__72579) + (((x10_long)1ll))))
                        {
                            x10_long k__72580 = i__72579;
                            
                            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                            this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__set(
                              (__extension__ ({
                                  ::x10::array::Array_3<TPMGL(T)>* this__72574 =
                                    this;
                                  
                                  //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                                  x10_long i__72575 = i__72586;
                                  x10_long j__72576 = j__72583;
                                  x10_long k__72577 = k__72580;
                                  ((k__72577) + (((::x10aux::nullCheck(this__72574)->FMGL(numElems_3)) * (((j__72576) + (((i__72575) * (::x10aux::nullCheck(this__72574)->FMGL(numElems_2)))))))));
                              }))
                              , ::x10::lang::Fun_0_3<x10_long, x10_long, x10_long, TPMGL(T)>::__apply(::x10aux::nullCheck(init), 
                                i__72586, j__72583, k__72580));
                        }
                    }
                    
                }
            }
            
        }
    }
    
}
template<class TPMGL(T)> ::x10::array::Array_3<TPMGL(T)>* x10::array::Array_3<TPMGL(T)>::_make(
                           x10_long m, x10_long n, x10_long p,
                           ::x10::lang::Fun_0_3<x10_long, x10_long, x10_long, TPMGL(T)>* init)
{
    ::x10::array::Array_3<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::Array_3<TPMGL(T)> >()) ::x10::array::Array_3<TPMGL(T)>();
    this_->_constructor(m, n, p, init);
    return this_;
}



//#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
template<class TPMGL(T)> void x10::array::Array_3<TPMGL(T)>::_constructor(
                           ::x10::array::Array_3<TPMGL(T)>* src) {
    
    //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    ::x10::array::Array<TPMGL(T)>* this__72588 = this;
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    ::x10::lang::Rail< TPMGL(T) >* r__72589 = ::x10::lang::Rail< TPMGL(T) >::_make(::x10aux::nullCheck(src)->FMGL(raw));
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    ::x10aux::nullCheck(this__72588)->FMGL(size) = (x10_long)(::x10aux::nullCheck(r__72589)->FMGL(size));
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    ::x10aux::nullCheck(this__72588)->FMGL(raw) = r__72589;
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    FMGL(numElems_1) = ::x10aux::nullCheck(src)->FMGL(numElems_1);
    FMGL(numElems_2) = ::x10aux::nullCheck(src)->FMGL(numElems_2);
    FMGL(numElems_3) = ::x10aux::nullCheck(src)->FMGL(numElems_3);
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    ::x10::array::Array_3<TPMGL(T)>* this__72587 = this;
    
}
template<class TPMGL(T)> ::x10::array::Array_3<TPMGL(T)>* x10::array::Array_3<TPMGL(T)>::_make(
                           ::x10::array::Array_3<TPMGL(T)>* src)
{
    ::x10::array::Array_3<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::Array_3<TPMGL(T)> >()) ::x10::array::Array_3<TPMGL(T)>();
    this_->_constructor(src);
    return this_;
}



//#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
template<class TPMGL(T)> void x10::array::Array_3<TPMGL(T)>::_constructor(
                           ::x10::lang::Rail< TPMGL(T) >* r,
                           x10_long m, x10_long n, x10_long p) {
    
    //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    ::x10::array::Array<TPMGL(T)>* this__72591 = this;
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    ::x10::lang::Rail< TPMGL(T) >* r__72592 = r;
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    ::x10aux::nullCheck(this__72591)->FMGL(size) = (x10_long)(::x10aux::nullCheck(r__72592)->FMGL(size));
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    ::x10aux::nullCheck(this__72591)->FMGL(raw) = r__72592;
    
    //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    FMGL(numElems_1) = m;
    FMGL(numElems_2) = n;
    FMGL(numElems_3) = p;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    ::x10::array::Array_3<TPMGL(T)>* this__72590 = this;
    
}
template<class TPMGL(T)> ::x10::array::Array_3<TPMGL(T)>* x10::array::Array_3<TPMGL(T)>::_make(
                           ::x10::lang::Rail< TPMGL(T) >* r,
                           x10_long m, x10_long n, x10_long p)
{
    ::x10::array::Array_3<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::Array_3<TPMGL(T)> >()) ::x10::array::Array_3<TPMGL(T)>();
    this_->_constructor(r, m, n, p);
    return this_;
}



//#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"

//#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
template<class TPMGL(T)> ::x10::lang::String* x10::array::Array_3<TPMGL(T)>::toString(
  ) {
    
    //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    ::x10::util::StringBuilder* sb =  (new (::x10aux::alloc_z< ::x10::util::StringBuilder>()) ::x10::util::StringBuilder());
    (sb)->::x10::util::StringBuilder::_constructor();
    
    //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    sb->add((__extension__ ({ static ::x10::lang::String* strLit__123256 = ::x10aux::makeStringLit("["); strLit__123256; })));
    
    //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    x10_long printed = ((x10_long)0ll);
    
    //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    x10_long i__72381max__72608 = ((this->FMGL(numElems_1)) - (((x10_long)1ll)));
    goto outer__72609; outer__72609: {
        x10_long i__72610;
        for (i__72610 = ((x10_long)0ll); ((i__72610) <= (i__72381max__72608));
             i__72610 = ((i__72610) + (((x10_long)1ll))))
        {
        {
            x10_long i__72611 = i__72610;
            
            //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
            x10_long i__72363max__72605 = ((this->FMGL(numElems_2)) - (((x10_long)1ll)));
            {
                x10_long i__72606;
                for (i__72606 = ((x10_long)0ll); ((i__72606) <= (i__72363max__72605));
                     i__72606 = ((i__72606) + (((x10_long)1ll))))
                {
                    x10_long j__72607 = i__72606;
                    
                    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    x10_long i__72345max__72602 = ((this->FMGL(numElems_3)) - (((x10_long)1ll)));
                    {
                        x10_long i__72603;
                        for (i__72603 = ((x10_long)0ll); ((i__72603) <= (i__72345max__72602));
                             i__72603 = ((i__72603) + (((x10_long)1ll))))
                        {
                            x10_long k__72604 = i__72603;
                            
                            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                            if ((!::x10aux::struct_equals(k__72604,
                                                          ((x10_long)0ll))))
                            {
                                sb->add((__extension__ ({ static ::x10::lang::String* strLit__123258 = ::x10aux::makeStringLit(", "); strLit__123258; })));
                            }
                            
                            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                            reinterpret_cast< ::x10::util::StringBuilder*>(sb->add(
                                                                             ::x10aux::class_cast_unchecked< ::x10::lang::Any*>((__extension__ ({
                                                                                 ::x10::array::Array_3<TPMGL(T)>* this__72597 =
                                                                                   this;
                                                                                 
                                                                                 //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                                                                                 x10_long i__72598 =
                                                                                   i__72611;
                                                                                 x10_long j__72599 =
                                                                                   j__72607;
                                                                                 x10_long k__72600 =
                                                                                   k__72604;
                                                                                 TPMGL(T) ret__72601;
                                                                                 
                                                                                 //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                                                                                 ret__72601 =
                                                                                   (::x10aux::nullCheck(this__72597)->FMGL(raw))->unchecked_apply((__extension__ ({
                                                                                     
                                                                                     //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                                                                                     x10_long i__72594 =
                                                                                       i__72598;
                                                                                     x10_long j__72595 =
                                                                                       j__72599;
                                                                                     x10_long k__72596 =
                                                                                       k__72600;
                                                                                     ((k__72596) + (((::x10aux::nullCheck(this__72597)->FMGL(numElems_3)) * (((j__72595) + (((i__72594) * (::x10aux::nullCheck(this__72597)->FMGL(numElems_2)))))))));
                                                                                 }))
                                                                                 );
                                                                                 ret__72601;
                                                                             }))
                                                                             )));
                            
                            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                            if (((printed = ((printed) + (((x10_long)1ll)))) > (((x10_long)10ll))))
                            {
                                goto outer__72609_end_;
                            }
                            
                        }
                    }
                    
                    //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
                    sb->add((::x10aux::struct_equals(j__72607,
                                                     ((this->FMGL(numElems_2)) - (((x10_long)1ll)))))
                              ? ((__extension__ ({ static ::x10::lang::String* strLit__123261 = ::x10aux::makeStringLit(";; "); strLit__123261; })))
                              : ((__extension__ ({ static ::x10::lang::String* strLit__123262 = ::x10aux::makeStringLit("; "); strLit__123262; }))));
                }
            }
            
        }
        goto outer__72609_next_; outer__72609_next_: ;
        }
        goto outer__72609_end_; outer__72609_end_: ;
    }
    
    //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    if (((((x10_long)10ll)) < (this->FMGL(size)))) {
        
        //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        sb->add(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__123264 = ::x10aux::makeStringLit("...(omitted "); strLit__123264; })), ((this->FMGL(size)) - (((x10_long)10ll)))), (__extension__ ({ static ::x10::lang::String* strLit__123265 = ::x10aux::makeStringLit(" elements)"); strLit__123265; }))));
    }
    
    //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    sb->add((__extension__ ({ static ::x10::lang::String* strLit__123267 = ::x10aux::makeStringLit("]"); strLit__123267; })));
    
    //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    return sb->toString();
    
}

//#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
template<class TPMGL(T)> ::x10::array::IterationSpace* x10::array::Array_3<TPMGL(T)>::indices(
  ) {
    
    //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    ::x10::array::DenseIterationSpace_3* alloc__72612 =  (new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_3>()) ::x10::array::DenseIterationSpace_3());
    (alloc__72612)->::x10::array::DenseIterationSpace_3::_constructor(
      ((x10_long)0ll), ((x10_long)0ll), ((x10_long)0ll), ((this->FMGL(numElems_1)) - (((x10_long)1ll))),
      ((this->FMGL(numElems_2)) - (((x10_long)1ll))), ((this->FMGL(numElems_3)) - (((x10_long)1ll))));
    return reinterpret_cast< ::x10::array::IterationSpace*>(alloc__72612);
    
}

//#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
template<class TPMGL(T)> x10_long x10::array::Array_3<TPMGL(T)>::offset(
  x10_long i, x10_long j, x10_long k) {
    
    //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    return ((k) + (((this->FMGL(numElems_3)) * (((j) + (((i) * (this->FMGL(numElems_2)))))))));
    
}

//#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
template<class TPMGL(T)> TPMGL(T) x10::array::Array_3<TPMGL(T)>::__apply(
  x10_long i, x10_long j, x10_long k) {
    
    //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    return (this->FMGL(raw))->unchecked_apply((__extension__ ({
        ::x10::array::Array_3<TPMGL(T)>* this__72547 = this;
        
        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        x10_long i__72544 = i;
        x10_long j__72545 = j;
        x10_long k__72546 = k;
        ((k__72546) + (((::x10aux::nullCheck(this__72547)->FMGL(numElems_3)) * (((j__72545) + (((i__72544) * (::x10aux::nullCheck(this__72547)->FMGL(numElems_2)))))))));
    }))
    );
    
}

//#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
template<class TPMGL(T)> TPMGL(T) x10::array::Array_3<TPMGL(T)>::__apply(
  ::x10::lang::Point* p) {
    ::x10::array::Array_3<TPMGL(T)>* this__72616 = this;
    
    //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    x10_long i__72617 = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                          ((x10_long)0ll));
    x10_long j__72618 = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                          ((x10_long)1ll));
    x10_long k__72619 = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                          ((x10_long)2ll));
    TPMGL(T) ret__72620;
    
    //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    ret__72620 = (::x10aux::nullCheck(this__72616)->FMGL(raw))->unchecked_apply((__extension__ ({
        
        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        x10_long i__72613 = i__72617;
        x10_long j__72614 = j__72618;
        x10_long k__72615 = k__72619;
        ((k__72615) + (((::x10aux::nullCheck(this__72616)->FMGL(numElems_3)) * (((j__72614) + (((i__72613) * (::x10aux::nullCheck(this__72616)->FMGL(numElems_2)))))))));
    }))
    );
    
    //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    return ret__72620;
    
}

//#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
template<class TPMGL(T)> TPMGL(T) x10::array::Array_3<TPMGL(T)>::__set(
  x10_long i, x10_long j, x10_long k, TPMGL(T) v) {
    
    //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    (this->FMGL(raw))->unchecked_set((__extension__ ({
        ::x10::array::Array_3<TPMGL(T)>* this__72560 = this;
        
        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        x10_long i__72557 = i;
        x10_long j__72558 = j;
        x10_long k__72559 = k;
        ((k__72559) + (((::x10aux::nullCheck(this__72560)->FMGL(numElems_3)) * (((j__72558) + (((i__72557) * (::x10aux::nullCheck(this__72560)->FMGL(numElems_2)))))))));
    }))
    , v);
    
    //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    return v;
    
}

//#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
template<class TPMGL(T)> TPMGL(T) x10::array::Array_3<TPMGL(T)>::__set(
  ::x10::lang::Point* p, TPMGL(T) v) {
    ::x10::array::Array_3<TPMGL(T)>* this__72624 = this;
    
    //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    x10_long i__72625 = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                          ((x10_long)0ll));
    x10_long j__72626 = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                          ((x10_long)1ll));
    x10_long k__72627 = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                          ((x10_long)2ll));
    TPMGL(T) v__72628 = v;
    TPMGL(T) ret__72629;
    
    //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    (::x10aux::nullCheck(this__72624)->FMGL(raw))->unchecked_set((__extension__ ({
        
        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
        x10_long i__72621 = i__72625;
        x10_long j__72622 = j__72626;
        x10_long k__72623 = k__72627;
        ((k__72623) + (((::x10aux::nullCheck(this__72624)->FMGL(numElems_3)) * (((j__72622) + (((i__72621) * (::x10aux::nullCheck(this__72624)->FMGL(numElems_2)))))))));
    }))
    , v__72628);
    
    //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    ret__72629 = v__72628;
    
    //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    return ret__72629;
    
}

//#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
template<class TPMGL(T)> ::x10::array::Array_3<TPMGL(T)>*
  x10::array::Array_3<TPMGL(T)>::x10__array__Array_3____this__x10__array__Array_3(
  ) {
    return this;
    
}
template<class TPMGL(T)> void x10::array::Array_3<TPMGL(T)>::__fieldInitializers_x10_array_Array_3(
  ) {
 
}
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10::array::Array_3<TPMGL(T)>::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::array::Array_3<TPMGL(T)>::_deserializer);

template<class TPMGL(T)> void x10::array::Array_3<TPMGL(T)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::array::Array<TPMGL(T)>::_serialize_body(buf);
    buf.write(this->FMGL(numElems_1));
    buf.write(this->FMGL(numElems_2));
    buf.write(this->FMGL(numElems_3));
    
}

template<class TPMGL(T)> ::x10::lang::Reference* ::x10::array::Array_3<TPMGL(T)>::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::array::Array_3<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::Array_3<TPMGL(T)> >()) ::x10::array::Array_3<TPMGL(T)>();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

template<class TPMGL(T)> void x10::array::Array_3<TPMGL(T)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::array::Array<TPMGL(T)>::_deserialize_body(buf);
    FMGL(numElems_1) = buf.read<x10_long>();
    FMGL(numElems_2) = buf.read<x10_long>();
    FMGL(numElems_3) = buf.read<x10_long>();
}

template<class TPMGL(T)> ::x10::array::Array_3<TPMGL(T)>*
  x10::array::Array_3<void>::makeView(::x10::lang::Rail< TPMGL(T) >* r,
                                      x10_long m, x10_long n,
                                      x10_long p) {
    
    //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    x10_long size = ((((n) * (m))) * (p));
    
    //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    if ((!::x10aux::struct_equals(size, (x10_long)(::x10aux::nullCheck(r)->FMGL(size)))))
    {
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::IllegalOperationException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__123290 = ::x10aux::makeStringLit("size mismatch: "); strLit__123290; })), m), (__extension__ ({ static ::x10::lang::String* strLit__123291 = ::x10aux::makeStringLit(" * "); strLit__123291; }))), n), (__extension__ ({ static ::x10::lang::String* strLit__123292 = ::x10aux::makeStringLit(" * "); strLit__123292; }))), p), (__extension__ ({ static ::x10::lang::String* strLit__123293 = ::x10aux::makeStringLit(" != "); strLit__123293; }))), (x10_long)(::x10aux::nullCheck(r)->FMGL(size))))));
    }
    
    //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_3.x10"
    ::x10::array::Array_3<TPMGL(T)>* alloc__72593 =  (new (::x10aux::alloc_z< ::x10::array::Array_3<TPMGL(T)> >()) ::x10::array::Array_3<TPMGL(T)>());
    (alloc__72593)->::x10::array::Array_3<TPMGL(T)>::_constructor(
      r, m, n, p);
    return alloc__72593;
    
}
#endif // X10_ARRAY_ARRAY_3_H_IMPLEMENTATION
#endif // __X10_ARRAY_ARRAY_3_H_NODEPS
