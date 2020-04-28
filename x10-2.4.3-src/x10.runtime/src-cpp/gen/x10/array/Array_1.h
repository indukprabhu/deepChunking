#ifndef __X10_ARRAY_ARRAY_1_H
#define __X10_ARRAY_ARRAY_1_H

#include <x10rt.h>


#define X10_ARRAY_ARRAY_H_NODEPS
#include <x10/array/Array.h>
#undef X10_ARRAY_ARRAY_H_NODEPS
#define X10_LANG_FUN_0_1_H_NODEPS
#include <x10/lang/Fun_0_1.h>
#undef X10_LANG_FUN_0_1_H_NODEPS
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace compiler { 
class Inline;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace array { 
class DenseIterationSpace_1;
} } 
namespace x10 { namespace lang { 
class Point;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace array { 

template<class TPMGL(T)> class Array_1;
template <> class Array_1<void>;
template<class TPMGL(T)> class Array_1 : public ::x10::array::Array<TPMGL(T)>
  {
    public:
    RTT_H_DECLS_CLASS
    
    static ::x10aux::itable_entry _itables[5];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static typename ::x10::lang::Iterable<TPMGL(T)>::template itable< ::x10::array::Array_1<TPMGL(T)> > _itable_0;
    
    static ::x10::lang::Any::itable< ::x10::array::Array_1<TPMGL(T)> > _itable_1;
    
    static typename ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)>::template itable< ::x10::array::Array_1<TPMGL(T)> > _itable_2;
    
    static typename ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>::template itable< ::x10::array::Array_1<TPMGL(T)> > _itable_3;
    
    x10_long rank();
    void _constructor(x10_long n);
    
    static ::x10::array::Array_1<TPMGL(T)>* _make(x10_long n);
    
    void _constructor(x10_long n, TPMGL(T) init);
    
    static ::x10::array::Array_1<TPMGL(T)>* _make(x10_long n, TPMGL(T) init);
    
    void _constructor(x10_long n, ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* init);
    
    static ::x10::array::Array_1<TPMGL(T)>* _make(x10_long n, ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* init);
    
    void _constructor(::x10::array::Array_1<TPMGL(T)>* src);
    
    static ::x10::array::Array_1<TPMGL(T)>* _make(::x10::array::Array_1<TPMGL(T)>* src);
    
    void _constructor(::x10::lang::Rail< TPMGL(T) >* r);
    
    static ::x10::array::Array_1<TPMGL(T)>* _make(::x10::lang::Rail< TPMGL(T) >* r);
    
    virtual ::x10::lang::String* toString();
    virtual ::x10::array::IterationSpace* indices();
    virtual TPMGL(T) __apply(x10_long i);
    virtual TPMGL(T) __apply(::x10::lang::Point* p);
    virtual TPMGL(T) __set(x10_long i, TPMGL(T) v);
    virtual TPMGL(T) __set(::x10::lang::Point* p, TPMGL(T) v);
    virtual ::x10::array::Array_1<TPMGL(T)>* x10__array__Array_1____this__x10__array__Array_1(
      );
    virtual void __fieldInitializers_x10_array_Array_1();
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

template<class TPMGL(T)> ::x10aux::RuntimeType x10::array::Array_1<TPMGL(T)>::rtt;
template<class TPMGL(T)> void x10::array::Array_1<TPMGL(T)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::array::Array_1<void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::array::Array<TPMGL(T)> >(), ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)> >()};
    const ::x10aux::RuntimeType* params[1] = { ::x10aux::getRTT<TPMGL(T)>()};
    ::x10aux::RuntimeType::Variance variances[1] = { ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.array.Array_1";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 2, parents, 1, params, variances);
}

template <> class Array_1<void> : public ::x10::array::Array<void>
{
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    template<class TPMGL(T)> static ::x10::array::Array_1<TPMGL(T)>*
      makeView(::x10::lang::Rail< TPMGL(T) >* r);
    
    static x10_long validateSize(x10_long n);
    
    
};

} } 
#endif // X10_ARRAY_ARRAY_1_H

namespace x10 { namespace array { 
template<class TPMGL(T)> class Array_1;
} } 

#ifndef X10_ARRAY_ARRAY_1_H_NODEPS
#define X10_ARRAY_ARRAY_1_H_NODEPS
#include <x10/array/Array.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Rail.h>
#include <x10/compiler/Inline.h>
#include <x10/lang/String.h>
#include <x10/array/DenseIterationSpace_1.h>
#include <x10/lang/Point.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_ARRAY_ARRAY_1_H_GENERICS
#define X10_ARRAY_ARRAY_1_H_GENERICS
#endif // X10_ARRAY_ARRAY_1_H_GENERICS
#ifndef X10_ARRAY_ARRAY_1_H_IMPLEMENTATION
#define X10_ARRAY_ARRAY_1_H_IMPLEMENTATION
#include <x10/array/Array_1.h>

template<class TPMGL(T)> typename ::x10::lang::Iterable<TPMGL(T)>::template itable< ::x10::array::Array_1<TPMGL(T)> >  x10::array::Array_1<TPMGL(T)>::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::array::Array<TPMGL(T)>::iterator, &x10::array::Array_1<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10::lang::Any::itable< ::x10::array::Array_1<TPMGL(T)> >  x10::array::Array_1<TPMGL(T)>::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::array::Array_1<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> typename ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)>::template itable< ::x10::array::Array_1<TPMGL(T)> >  x10::array::Array_1<TPMGL(T)>::_itable_2(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::array::Array_1<TPMGL(T)>::__apply, &x10::array::Array_1<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> typename ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>::template itable< ::x10::array::Array_1<TPMGL(T)> >  x10::array::Array_1<TPMGL(T)>::_itable_3(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::array::Array_1<TPMGL(T)>::__apply, &x10::array::Array_1<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10::array::Array_1<TPMGL(T)>::_itables[5] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable<TPMGL(T)> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)> >, &_itable_2), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, TPMGL(T)> >, &_itable_3), ::x10aux::itable_entry(NULL, (void*)"::x10::array::Array_1<TPMGL(T)>")};

//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
template<class TPMGL(T)> x10_long x10::array::Array_1<TPMGL(T)>::rank() {
    return ((x10_long)1ll);
    
}

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
template<class TPMGL(T)> void x10::array::Array_1<TPMGL(T)>::_constructor(
                           x10_long n) {
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    (this)->::x10::array::Array<TPMGL(T)>::_constructor((__extension__ ({
                                                            
                                                            //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
                                                            x10_long n__70147 =
                                                              n;
                                                            x10_long ret__70148;
                                                            
                                                            //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
                                                            if (((n__70147) < (((x10_long)0ll))))
                                                            {
                                                                ::x10::array::Array<void>::raiseNegativeArraySizeException();
                                                            }
                                                            
                                                            //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
                                                            ret__70148 =
                                                              n__70147;
                                                            ret__70148;
                                                        }))
                                                        , true);
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    ::x10::array::Array_1<TPMGL(T)>* this__71164 = this;
    
}
template<class TPMGL(T)> ::x10::array::Array_1<TPMGL(T)>* x10::array::Array_1<TPMGL(T)>::_make(
                           x10_long n) {
    ::x10::array::Array_1<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::Array_1<TPMGL(T)> >()) ::x10::array::Array_1<TPMGL(T)>();
    this_->_constructor(n);
    return this_;
}



//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
template<class TPMGL(T)> void x10::array::Array_1<TPMGL(T)>::_constructor(
                           x10_long n, TPMGL(T) init) {
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    (this)->::x10::array::Array<TPMGL(T)>::_constructor((__extension__ ({
                                                            
                                                            //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
                                                            x10_long n__70429 =
                                                              n;
                                                            x10_long ret__70430;
                                                            
                                                            //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
                                                            if (((n__70429) < (((x10_long)0ll))))
                                                            {
                                                                ::x10::array::Array<void>::raiseNegativeArraySizeException();
                                                            }
                                                            
                                                            //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
                                                            ret__70430 =
                                                              n__70429;
                                                            ret__70430;
                                                        }))
                                                        ,
                                                        false);
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    ::x10::array::Array_1<TPMGL(T)>* this__71165 = this;
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::fill(
      init);
}
template<class TPMGL(T)> ::x10::array::Array_1<TPMGL(T)>* x10::array::Array_1<TPMGL(T)>::_make(
                           x10_long n, TPMGL(T) init) {
    ::x10::array::Array_1<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::Array_1<TPMGL(T)> >()) ::x10::array::Array_1<TPMGL(T)>();
    this_->_constructor(n, init);
    return this_;
}



//#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
template<class TPMGL(T)> void x10::array::Array_1<TPMGL(T)>::_constructor(
                           x10_long n, ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* init) {
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    (this)->::x10::array::Array<TPMGL(T)>::_constructor((__extension__ ({
                                                            
                                                            //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
                                                            x10_long n__70435 =
                                                              n;
                                                            x10_long ret__70436;
                                                            
                                                            //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
                                                            if (((n__70435) < (((x10_long)0ll))))
                                                            {
                                                                ::x10::array::Array<void>::raiseNegativeArraySizeException();
                                                            }
                                                            
                                                            //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
                                                            ret__70436 =
                                                              n__70435;
                                                            ret__70436;
                                                        }))
                                                        ,
                                                        false);
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    ::x10::array::Array_1<TPMGL(T)>* this__71166 = this;
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    ::x10::lang::Rail< TPMGL(T) >* rail__71167 = this->FMGL(raw);
    x10_long i__70129max__71168 = (x10_long)(::x10aux::nullCheck(rail__71167)->FMGL(size));
    {
        x10_long i__71169;
        for (i__71169 = ((x10_long)0ll); ((i__71169) < (i__70129max__71168));
             i__71169 = ((i__71169) + (((x10_long)1ll))))
        {
            x10_long i__71170 = i__71169;
            
            //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
            this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__set(
              i__71170, ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>::__apply(::x10aux::nullCheck(init), 
                i__71170));
        }
    }
    
}
template<class TPMGL(T)> ::x10::array::Array_1<TPMGL(T)>* x10::array::Array_1<TPMGL(T)>::_make(
                           x10_long n, ::x10::lang::Fun_0_1<x10_long, TPMGL(T)>* init)
{
    ::x10::array::Array_1<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::Array_1<TPMGL(T)> >()) ::x10::array::Array_1<TPMGL(T)>();
    this_->_constructor(n, init);
    return this_;
}



//#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
template<class TPMGL(T)> void x10::array::Array_1<TPMGL(T)>::_constructor(
                           ::x10::array::Array_1<TPMGL(T)>* src) {
    
    //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    ::x10::array::Array<TPMGL(T)>* this__71172 = this;
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    ::x10::lang::Rail< TPMGL(T) >* r__71173 = ::x10::lang::Rail< TPMGL(T) >::_make(::x10aux::nullCheck(src)->FMGL(raw));
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    ::x10aux::nullCheck(this__71172)->FMGL(size) = (x10_long)(::x10aux::nullCheck(r__71173)->FMGL(size));
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    ::x10aux::nullCheck(this__71172)->FMGL(raw) = r__71173;
    
    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    ::x10::array::Array_1<TPMGL(T)>* this__71171 = this;
    
}
template<class TPMGL(T)> ::x10::array::Array_1<TPMGL(T)>* x10::array::Array_1<TPMGL(T)>::_make(
                           ::x10::array::Array_1<TPMGL(T)>* src)
{
    ::x10::array::Array_1<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::Array_1<TPMGL(T)> >()) ::x10::array::Array_1<TPMGL(T)>();
    this_->_constructor(src);
    return this_;
}



//#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
template<class TPMGL(T)> void x10::array::Array_1<TPMGL(T)>::_constructor(
                           ::x10::lang::Rail< TPMGL(T) >* r) {
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    ::x10::array::Array<TPMGL(T)>* this__71175 = this;
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    ::x10::lang::Rail< TPMGL(T) >* r__71176 = r;
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    ::x10aux::nullCheck(this__71175)->FMGL(size) = (x10_long)(::x10aux::nullCheck(r__71176)->FMGL(size));
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    ::x10aux::nullCheck(this__71175)->FMGL(raw) = r__71176;
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    ::x10::array::Array_1<TPMGL(T)>* this__71174 = this;
    
}
template<class TPMGL(T)> ::x10::array::Array_1<TPMGL(T)>* x10::array::Array_1<TPMGL(T)>::_make(
                           ::x10::lang::Rail< TPMGL(T) >* r)
{
    ::x10::array::Array_1<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::Array_1<TPMGL(T)> >()) ::x10::array::Array_1<TPMGL(T)>();
    this_->_constructor(r);
    return this_;
}



//#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"

//#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
template<class TPMGL(T)> ::x10::lang::String* x10::array::Array_1<TPMGL(T)>::toString(
  ) {
    return this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::toString();
    
}

//#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
template<class TPMGL(T)> ::x10::array::IterationSpace* x10::array::Array_1<TPMGL(T)>::indices(
  ) {
    
    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    ::x10::array::DenseIterationSpace_1* alloc__71178 =  (new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_1>()) ::x10::array::DenseIterationSpace_1());
    (alloc__71178)->::x10::array::DenseIterationSpace_1::_constructor(
      ((x10_long)0ll), ((this->FMGL(size)) - (((x10_long)1ll))));
    return reinterpret_cast< ::x10::array::IterationSpace*>(alloc__71178);
    
}

//#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
template<class TPMGL(T)> TPMGL(T) x10::array::Array_1<TPMGL(T)>::__apply(
  x10_long i) {
    
    //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    return this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__apply(
             i);
    
}

//#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
template<class TPMGL(T)> TPMGL(T) x10::array::Array_1<TPMGL(T)>::__apply(
  ::x10::lang::Point* p) {
    ::x10::array::Array_1<TPMGL(T)>* this__71179 = this;
    
    //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    x10_long i__71180 = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                          ((x10_long)0ll));
    
    //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    return ::x10aux::nullCheck(this__71179)->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__apply(
             i__71180);
    
}

//#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
template<class TPMGL(T)> TPMGL(T) x10::array::Array_1<TPMGL(T)>::__set(
  x10_long i, TPMGL(T) v) {
    
    //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__set(
      i, v);
    
    //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    return v;
    
}

//#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
template<class TPMGL(T)> TPMGL(T) x10::array::Array_1<TPMGL(T)>::__set(
  ::x10::lang::Point* p, TPMGL(T) v) {
    ::x10::array::Array_1<TPMGL(T)>* this__71181 = this;
    
    //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    x10_long i__71182 = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                          ((x10_long)0ll));
    TPMGL(T) v__71183 = v;
    TPMGL(T) ret__71184;
    
    //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    ::x10aux::nullCheck(this__71181)->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__set(
      i__71182, v__71183);
    
    //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    ret__71184 = v__71183;
    
    //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    return ret__71184;
    
}

//#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
template<class TPMGL(T)> ::x10::array::Array_1<TPMGL(T)>*
  x10::array::Array_1<TPMGL(T)>::x10__array__Array_1____this__x10__array__Array_1(
  ) {
    return this;
    
}
template<class TPMGL(T)> void x10::array::Array_1<TPMGL(T)>::__fieldInitializers_x10_array_Array_1(
  ) {
 
}
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10::array::Array_1<TPMGL(T)>::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::array::Array_1<TPMGL(T)>::_deserializer);

template<class TPMGL(T)> void x10::array::Array_1<TPMGL(T)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::array::Array<TPMGL(T)>::_serialize_body(buf);
    
}

template<class TPMGL(T)> ::x10::lang::Reference* ::x10::array::Array_1<TPMGL(T)>::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::array::Array_1<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::Array_1<TPMGL(T)> >()) ::x10::array::Array_1<TPMGL(T)>();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

template<class TPMGL(T)> void x10::array::Array_1<TPMGL(T)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::array::Array<TPMGL(T)>::_deserialize_body(buf);
    
}

template<class TPMGL(T)> ::x10::array::Array_1<TPMGL(T)>*
  x10::array::Array_1<void>::makeView(::x10::lang::Rail< TPMGL(T) >* r) {
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_1.x10"
    ::x10::array::Array_1<TPMGL(T)>* alloc__71177 =  (new (::x10aux::alloc_z< ::x10::array::Array_1<TPMGL(T)> >()) ::x10::array::Array_1<TPMGL(T)>());
    (alloc__71177)->::x10::array::Array_1<TPMGL(T)>::_constructor(
      r);
    return alloc__71177;
    
}
#endif // X10_ARRAY_ARRAY_1_H_IMPLEMENTATION
#endif // __X10_ARRAY_ARRAY_1_H_NODEPS
