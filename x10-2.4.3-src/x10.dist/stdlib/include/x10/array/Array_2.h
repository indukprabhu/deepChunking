#ifndef __X10_ARRAY_ARRAY_2_H
#define __X10_ARRAY_ARRAY_2_H

#include <x10rt.h>


#define X10_ARRAY_ARRAY_H_NODEPS
#include <x10/array/Array.h>
#undef X10_ARRAY_ARRAY_H_NODEPS
#define X10_LANG_FUN_0_2_H_NODEPS
#include <x10/lang/Fun_0_2.h>
#undef X10_LANG_FUN_0_2_H_NODEPS
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
class DenseIterationSpace_2;
} } 
namespace x10 { namespace lang { 
class Point;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace array { 

template<class TPMGL(T)> class Array_2;
template <> class Array_2<void>;
template<class TPMGL(T)> class Array_2 : public ::x10::array::Array<TPMGL(T)>
  {
    public:
    RTT_H_DECLS_CLASS
    
    x10_long FMGL(numElems_1);
    
    x10_long FMGL(numElems_2);
    
    static ::x10aux::itable_entry _itables[5];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static typename ::x10::lang::Iterable<TPMGL(T)>::template itable< ::x10::array::Array_2<TPMGL(T)> > _itable_0;
    
    static ::x10::lang::Any::itable< ::x10::array::Array_2<TPMGL(T)> > _itable_1;
    
    static typename ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)>::template itable< ::x10::array::Array_2<TPMGL(T)> > _itable_2;
    
    static typename ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>::template itable< ::x10::array::Array_2<TPMGL(T)> > _itable_3;
    
    x10_long rank();
    void _constructor(x10_long m, x10_long n);
    
    static ::x10::array::Array_2<TPMGL(T)>* _make(x10_long m, x10_long n);
    
    void _constructor(x10_long m, x10_long n, TPMGL(T) init);
    
    static ::x10::array::Array_2<TPMGL(T)>* _make(x10_long m, x10_long n,
                                                  TPMGL(T) init);
    
    void _constructor(x10_long m, x10_long n, ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>* init);
    
    static ::x10::array::Array_2<TPMGL(T)>* _make(x10_long m, x10_long n,
                                                  ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>* init);
    
    void _constructor(::x10::array::Array_2<TPMGL(T)>* src);
    
    static ::x10::array::Array_2<TPMGL(T)>* _make(::x10::array::Array_2<TPMGL(T)>* src);
    
    void _constructor(::x10::lang::Rail< TPMGL(T) >* r, x10_long m, x10_long n);
    
    static ::x10::array::Array_2<TPMGL(T)>* _make(::x10::lang::Rail< TPMGL(T) >* r,
                                                  x10_long m, x10_long n);
    
    virtual ::x10::lang::String* toString();
    virtual ::x10::array::IterationSpace* indices();
    virtual x10_long offset(x10_long i, x10_long j);
    virtual TPMGL(T) __apply(x10_long i, x10_long j);
    virtual TPMGL(T) __apply(::x10::lang::Point* p);
    virtual TPMGL(T) __set(x10_long i, x10_long j, TPMGL(T) v);
    virtual TPMGL(T) __set(::x10::lang::Point* p, TPMGL(T) v);
    virtual ::x10::array::Array_2<TPMGL(T)>* x10__array__Array_2____this__x10__array__Array_2(
      );
    virtual void __fieldInitializers_x10_array_Array_2();
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

template<class TPMGL(T)> ::x10aux::RuntimeType x10::array::Array_2<TPMGL(T)>::rtt;
template<class TPMGL(T)> void x10::array::Array_2<TPMGL(T)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::array::Array_2<void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::array::Array<TPMGL(T)> >(), ::x10aux::getRTT< ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)> >()};
    const ::x10aux::RuntimeType* params[1] = { ::x10aux::getRTT<TPMGL(T)>()};
    ::x10aux::RuntimeType::Variance variances[1] = { ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.array.Array_2";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 2, parents, 1, params, variances);
}

template <> class Array_2<void> : public ::x10::array::Array<void>
{
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    template<class TPMGL(T)> static ::x10::array::Array_2<TPMGL(T)>*
      makeView(::x10::lang::Rail< TPMGL(T) >* r, x10_long m,
               x10_long n);
    
    static x10_long validateSize(x10_long m, x10_long n);
    
    
};

} } 
#endif // X10_ARRAY_ARRAY_2_H

namespace x10 { namespace array { 
template<class TPMGL(T)> class Array_2;
} } 

#ifndef X10_ARRAY_ARRAY_2_H_NODEPS
#define X10_ARRAY_ARRAY_2_H_NODEPS
#include <x10/array/Array.h>
#include <x10/lang/Fun_0_2.h>
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Rail.h>
#include <x10/compiler/Inline.h>
#include <x10/lang/IllegalOperationException.h>
#include <x10/lang/String.h>
#include <x10/util/StringBuilder.h>
#include <x10/lang/Any.h>
#include <x10/lang/Unsafe.h>
#include <x10/array/DenseIterationSpace_2.h>
#include <x10/lang/Point.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_ARRAY_ARRAY_2_H_GENERICS
#define X10_ARRAY_ARRAY_2_H_GENERICS
#endif // X10_ARRAY_ARRAY_2_H_GENERICS
#ifndef X10_ARRAY_ARRAY_2_H_IMPLEMENTATION
#define X10_ARRAY_ARRAY_2_H_IMPLEMENTATION
#include <x10/array/Array_2.h>


//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"

//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
template<class TPMGL(T)> typename ::x10::lang::Iterable<TPMGL(T)>::template itable< ::x10::array::Array_2<TPMGL(T)> >  x10::array::Array_2<TPMGL(T)>::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::array::Array<TPMGL(T)>::iterator, &x10::array::Array_2<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10::lang::Any::itable< ::x10::array::Array_2<TPMGL(T)> >  x10::array::Array_2<TPMGL(T)>::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::array::Array_2<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> typename ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)>::template itable< ::x10::array::Array_2<TPMGL(T)> >  x10::array::Array_2<TPMGL(T)>::_itable_2(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::array::Array_2<TPMGL(T)>::__apply, &x10::array::Array_2<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> typename ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>::template itable< ::x10::array::Array_2<TPMGL(T)> >  x10::array::Array_2<TPMGL(T)>::_itable_3(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &x10::array::Array_2<TPMGL(T)>::__apply, &x10::array::Array_2<TPMGL(T)>::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10::array::Array_2<TPMGL(T)>::_itables[5] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable<TPMGL(T)> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)> >, &_itable_2), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)> >, &_itable_3), ::x10aux::itable_entry(NULL, (void*)"::x10::array::Array_2<TPMGL(T)>")};

//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
template<class TPMGL(T)> x10_long x10::array::Array_2<TPMGL(T)>::rank() {
    return ((x10_long)2ll);
    
}

//#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
template<class TPMGL(T)> void x10::array::Array_2<TPMGL(T)>::_constructor(
                           x10_long m, x10_long n) {
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    (this)->::x10::array::Array<TPMGL(T)>::_constructor((__extension__ ({
                                                            
                                                            //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                                                            x10_long m__71578 =
                                                              m;
                                                            x10_long n__71579 =
                                                              n;
                                                            x10_long ret__71580;
                                                            
                                                            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                                                            if ((((m__71578) < (((x10_long)0ll))) ||
                                                                ((n__71579) < (((x10_long)0ll)))))
                                                            {
                                                                ::x10::array::Array<void>::raiseNegativeArraySizeException();
                                                            }
                                                            
                                                            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                                                            ret__71580 =
                                                              ((m__71578) * (n__71579));
                                                            ret__71580;
                                                        }))
                                                        ,
                                                        true);
    
    //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    FMGL(numElems_1) = m;
    FMGL(numElems_2) = n;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    ::x10::array::Array_2<TPMGL(T)>* this__71782 = this;
    
}
template<class TPMGL(T)> ::x10::array::Array_2<TPMGL(T)>* x10::array::Array_2<TPMGL(T)>::_make(
                           x10_long m, x10_long n) {
    ::x10::array::Array_2<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::Array_2<TPMGL(T)> >()) ::x10::array::Array_2<TPMGL(T)>();
    this_->_constructor(m, n);
    return this_;
}



//#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
template<class TPMGL(T)> void x10::array::Array_2<TPMGL(T)>::_constructor(
                           x10_long m, x10_long n, TPMGL(T) init) {
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    (this)->::x10::array::Array<TPMGL(T)>::_constructor((__extension__ ({
                                                            
                                                            //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                                                            x10_long m__71585 =
                                                              m;
                                                            x10_long n__71586 =
                                                              n;
                                                            x10_long ret__71587;
                                                            
                                                            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                                                            if ((((m__71585) < (((x10_long)0ll))) ||
                                                                ((n__71586) < (((x10_long)0ll)))))
                                                            {
                                                                ::x10::array::Array<void>::raiseNegativeArraySizeException();
                                                            }
                                                            
                                                            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                                                            ret__71587 =
                                                              ((m__71585) * (n__71586));
                                                            ret__71587;
                                                        }))
                                                        ,
                                                        false);
    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    FMGL(numElems_1) = m;
    FMGL(numElems_2) = n;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    ::x10::array::Array_2<TPMGL(T)>* this__71783 = this;
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::fill(
      init);
}
template<class TPMGL(T)> ::x10::array::Array_2<TPMGL(T)>* x10::array::Array_2<TPMGL(T)>::_make(
                           x10_long m, x10_long n, TPMGL(T) init)
{
    ::x10::array::Array_2<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::Array_2<TPMGL(T)> >()) ::x10::array::Array_2<TPMGL(T)>();
    this_->_constructor(m, n, init);
    return this_;
}



//#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
template<class TPMGL(T)> void x10::array::Array_2<TPMGL(T)>::_constructor(
                           x10_long m, x10_long n, ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>* init) {
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    (this)->::x10::array::Array<TPMGL(T)>::_constructor((__extension__ ({
                                                            
                                                            //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                                                            x10_long m__71592 =
                                                              m;
                                                            x10_long n__71593 =
                                                              n;
                                                            x10_long ret__71594;
                                                            
                                                            //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                                                            if ((((m__71592) < (((x10_long)0ll))) ||
                                                                ((n__71593) < (((x10_long)0ll)))))
                                                            {
                                                                ::x10::array::Array<void>::raiseNegativeArraySizeException();
                                                            }
                                                            
                                                            //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                                                            ret__71594 =
                                                              ((m__71592) * (n__71593));
                                                            ret__71594;
                                                        }))
                                                        ,
                                                        false);
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    FMGL(numElems_1) = m;
    FMGL(numElems_2) = n;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    ::x10::array::Array_2<TPMGL(T)>* this__71784 = this;
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    x10_long i__71525max__71791 = ((m) - (((x10_long)1ll)));
    {
        x10_long i__71792;
        for (i__71792 = ((x10_long)0ll); ((i__71792) <= (i__71525max__71791));
             i__71792 = ((i__71792) + (((x10_long)1ll))))
        {
            x10_long i__71793 = i__71792;
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            x10_long i__71507max__71788 = ((n) - (((x10_long)1ll)));
            {
                x10_long i__71789;
                for (i__71789 = ((x10_long)0ll); ((i__71789) <= (i__71507max__71788));
                     i__71789 = ((i__71789) + (((x10_long)1ll))))
                {
                    x10_long j__71790 = i__71789;
                    
                    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                    this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::__set(
                      (__extension__ ({
                          ::x10::array::Array_2<TPMGL(T)>* this__71785 =
                            this;
                          
                          //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                          x10_long i__71786 = i__71793;
                          x10_long j__71787 = j__71790;
                          ((j__71787) + (((i__71786) * (::x10aux::nullCheck(this__71785)->FMGL(numElems_2)))));
                      }))
                      , ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>::__apply(::x10aux::nullCheck(init), 
                        i__71793, j__71790));
                }
            }
            
        }
    }
    
}
template<class TPMGL(T)> ::x10::array::Array_2<TPMGL(T)>* x10::array::Array_2<TPMGL(T)>::_make(
                           x10_long m, x10_long n, ::x10::lang::Fun_0_2<x10_long, x10_long, TPMGL(T)>* init)
{
    ::x10::array::Array_2<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::Array_2<TPMGL(T)> >()) ::x10::array::Array_2<TPMGL(T)>();
    this_->_constructor(m, n, init);
    return this_;
}



//#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
template<class TPMGL(T)> void x10::array::Array_2<TPMGL(T)>::_constructor(
                           ::x10::array::Array_2<TPMGL(T)>* src) {
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    ::x10::array::Array<TPMGL(T)>* this__71795 = this;
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    ::x10::lang::Rail< TPMGL(T) >* r__71796 = ::x10::lang::Rail< TPMGL(T) >::_make(::x10aux::nullCheck(src)->FMGL(raw));
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    ::x10aux::nullCheck(this__71795)->FMGL(size) = (x10_long)(::x10aux::nullCheck(r__71796)->FMGL(size));
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    ::x10aux::nullCheck(this__71795)->FMGL(raw) = r__71796;
    
    //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    FMGL(numElems_1) = ::x10aux::nullCheck(src)->FMGL(numElems_1);
    FMGL(numElems_2) = ::x10aux::nullCheck(src)->FMGL(numElems_2);
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    ::x10::array::Array_2<TPMGL(T)>* this__71794 = this;
    
}
template<class TPMGL(T)> ::x10::array::Array_2<TPMGL(T)>* x10::array::Array_2<TPMGL(T)>::_make(
                           ::x10::array::Array_2<TPMGL(T)>* src)
{
    ::x10::array::Array_2<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::Array_2<TPMGL(T)> >()) ::x10::array::Array_2<TPMGL(T)>();
    this_->_constructor(src);
    return this_;
}



//#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
template<class TPMGL(T)> void x10::array::Array_2<TPMGL(T)>::_constructor(
                           ::x10::lang::Rail< TPMGL(T) >* r,
                           x10_long m, x10_long n) {
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    ::x10::array::Array<TPMGL(T)>* this__71798 = this;
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    ::x10::lang::Rail< TPMGL(T) >* r__71799 = r;
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    ::x10aux::nullCheck(this__71798)->FMGL(size) = (x10_long)(::x10aux::nullCheck(r__71799)->FMGL(size));
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    ::x10aux::nullCheck(this__71798)->FMGL(raw) = r__71799;
    
    //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    FMGL(numElems_1) = m;
    FMGL(numElems_2) = n;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    ::x10::array::Array_2<TPMGL(T)>* this__71797 = this;
    
}
template<class TPMGL(T)> ::x10::array::Array_2<TPMGL(T)>* x10::array::Array_2<TPMGL(T)>::_make(
                           ::x10::lang::Rail< TPMGL(T) >* r,
                           x10_long m, x10_long n) {
    ::x10::array::Array_2<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::Array_2<TPMGL(T)> >()) ::x10::array::Array_2<TPMGL(T)>();
    this_->_constructor(r, m, n);
    return this_;
}



//#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"

//#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
template<class TPMGL(T)> ::x10::lang::String* x10::array::Array_2<TPMGL(T)>::toString(
  ) {
    
    //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    ::x10::util::StringBuilder* sb =  (new (::x10aux::alloc_z< ::x10::util::StringBuilder>()) ::x10::util::StringBuilder());
    (sb)->::x10::util::StringBuilder::_constructor();
    
    //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    sb->add((__extension__ ({ static ::x10::lang::String* strLit__123181 = ::x10aux::makeStringLit("["); strLit__123181; })));
    
    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    x10_long printed = ((x10_long)0ll);
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    x10_long i__71561max__71810 = ((this->FMGL(numElems_1)) - (((x10_long)1ll)));
    goto outer__71811; outer__71811: {
        x10_long i__71812;
        for (i__71812 = ((x10_long)0ll); ((i__71812) <= (i__71561max__71810));
             i__71812 = ((i__71812) + (((x10_long)1ll))))
        {
        {
            x10_long i__71813 = i__71812;
            
            //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            x10_long i__71543max__71807 = ((this->FMGL(numElems_2)) - (((x10_long)1ll)));
            {
                x10_long i__71808;
                for (i__71808 = ((x10_long)0ll); ((i__71808) <= (i__71543max__71807));
                     i__71808 = ((i__71808) + (((x10_long)1ll))))
                {
                    x10_long j__71809 = i__71808;
                    
                    //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                    if ((!::x10aux::struct_equals(j__71809,
                                                  ((x10_long)0ll))))
                    {
                        sb->add((__extension__ ({ static ::x10::lang::String* strLit__123183 = ::x10aux::makeStringLit(", "); strLit__123183; })));
                    }
                    
                    //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                    reinterpret_cast< ::x10::util::StringBuilder*>(sb->add(
                                                                     ::x10aux::class_cast_unchecked< ::x10::lang::Any*>((__extension__ ({
                                                                         ::x10::array::Array_2<TPMGL(T)>* this__71803 =
                                                                           this;
                                                                         
                                                                         //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                                                                         x10_long i__71804 =
                                                                           i__71813;
                                                                         x10_long j__71805 =
                                                                           j__71809;
                                                                         TPMGL(T) ret__71806;
                                                                         
                                                                         //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                                                                         ret__71806 =
                                                                           (::x10aux::nullCheck(this__71803)->FMGL(raw))->unchecked_apply((__extension__ ({
                                                                             
                                                                             //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                                                                             x10_long i__71801 =
                                                                               i__71804;
                                                                             x10_long j__71802 =
                                                                               j__71805;
                                                                             ((j__71802) + (((i__71801) * (::x10aux::nullCheck(this__71803)->FMGL(numElems_2)))));
                                                                         }))
                                                                         );
                                                                         ret__71806;
                                                                     }))
                                                                     )));
                    
                    //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
                    if (((printed = ((printed) + (((x10_long)1ll)))) > (((x10_long)10ll))))
                    {
                        goto outer__71811_end_;
                    }
                    
                }
            }
            
            //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
            sb->add((__extension__ ({ static ::x10::lang::String* strLit__123186 = ::x10aux::makeStringLit("; "); strLit__123186; })));
        }
        goto outer__71811_next_; outer__71811_next_: ;
        }
        goto outer__71811_end_; outer__71811_end_: ;
    }
    
    //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    if (((((x10_long)10ll)) < (this->FMGL(size)))) {
        
        //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        sb->add(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__123188 = ::x10aux::makeStringLit("...(omitted "); strLit__123188; })), ((this->FMGL(size)) - (((x10_long)10ll)))), (__extension__ ({ static ::x10::lang::String* strLit__123189 = ::x10aux::makeStringLit(" elements)"); strLit__123189; }))));
    }
    
    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    sb->add((__extension__ ({ static ::x10::lang::String* strLit__123191 = ::x10aux::makeStringLit("]"); strLit__123191; })));
    
    //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    return sb->toString();
    
}

//#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
template<class TPMGL(T)> ::x10::array::IterationSpace* x10::array::Array_2<TPMGL(T)>::indices(
  ) {
    
    //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    ::x10::array::DenseIterationSpace_2* alloc__71814 =  (new (::x10aux::alloc_z< ::x10::array::DenseIterationSpace_2>()) ::x10::array::DenseIterationSpace_2());
    (alloc__71814)->::x10::array::DenseIterationSpace_2::_constructor(
      ((x10_long)0ll), ((x10_long)0ll), ((this->FMGL(numElems_1)) - (((x10_long)1ll))),
      ((this->FMGL(numElems_2)) - (((x10_long)1ll))));
    return reinterpret_cast< ::x10::array::IterationSpace*>(alloc__71814);
    
}

//#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
template<class TPMGL(T)> x10_long x10::array::Array_2<TPMGL(T)>::offset(
  x10_long i, x10_long j) {
    
    //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    return ((j) + (((i) * (this->FMGL(numElems_2)))));
    
}

//#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
template<class TPMGL(T)> TPMGL(T) x10::array::Array_2<TPMGL(T)>::__apply(
  x10_long i, x10_long j) {
    
    //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    return (this->FMGL(raw))->unchecked_apply((__extension__ ({
        ::x10::array::Array_2<TPMGL(T)>* this__71763 = this;
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        x10_long i__71761 = i;
        x10_long j__71762 = j;
        ((j__71762) + (((i__71761) * (::x10aux::nullCheck(this__71763)->FMGL(numElems_2)))));
    }))
    );
    
}

//#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
template<class TPMGL(T)> TPMGL(T) x10::array::Array_2<TPMGL(T)>::__apply(
  ::x10::lang::Point* p) {
    ::x10::array::Array_2<TPMGL(T)>* this__71817 = this;
    
    //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    x10_long i__71818 = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                          ((x10_long)0ll));
    x10_long j__71819 = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                          ((x10_long)1ll));
    TPMGL(T) ret__71820;
    
    //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    ret__71820 = (::x10aux::nullCheck(this__71817)->FMGL(raw))->unchecked_apply((__extension__ ({
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        x10_long i__71815 = i__71818;
        x10_long j__71816 = j__71819;
        ((j__71816) + (((i__71815) * (::x10aux::nullCheck(this__71817)->FMGL(numElems_2)))));
    }))
    );
    
    //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    return ret__71820;
    
}

//#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
template<class TPMGL(T)> TPMGL(T) x10::array::Array_2<TPMGL(T)>::__set(
  x10_long i, x10_long j, TPMGL(T) v) {
    
    //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    (this->FMGL(raw))->unchecked_set((__extension__ ({
        ::x10::array::Array_2<TPMGL(T)>* this__71773 = this;
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        x10_long i__71771 = i;
        x10_long j__71772 = j;
        ((j__71772) + (((i__71771) * (::x10aux::nullCheck(this__71773)->FMGL(numElems_2)))));
    }))
    , v);
    
    //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    return v;
    
}

//#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
template<class TPMGL(T)> TPMGL(T) x10::array::Array_2<TPMGL(T)>::__set(
  ::x10::lang::Point* p, TPMGL(T) v) {
    ::x10::array::Array_2<TPMGL(T)>* this__71823 = this;
    
    //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    x10_long i__71824 = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                          ((x10_long)0ll));
    x10_long j__71825 = ::x10aux::nullCheck(p)->x10::lang::Point::__apply(
                          ((x10_long)1ll));
    TPMGL(T) v__71826 = v;
    TPMGL(T) ret__71827;
    
    //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    (::x10aux::nullCheck(this__71823)->FMGL(raw))->unchecked_set((__extension__ ({
        
        //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
        x10_long i__71821 = i__71824;
        x10_long j__71822 = j__71825;
        ((j__71822) + (((i__71821) * (::x10aux::nullCheck(this__71823)->FMGL(numElems_2)))));
    }))
    , v__71826);
    
    //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    ret__71827 = v__71826;
    
    //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    return ret__71827;
    
}

//#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
template<class TPMGL(T)> ::x10::array::Array_2<TPMGL(T)>*
  x10::array::Array_2<TPMGL(T)>::x10__array__Array_2____this__x10__array__Array_2(
  ) {
    return this;
    
}
template<class TPMGL(T)> void x10::array::Array_2<TPMGL(T)>::__fieldInitializers_x10_array_Array_2(
  ) {
 
}
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10::array::Array_2<TPMGL(T)>::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::array::Array_2<TPMGL(T)>::_deserializer);

template<class TPMGL(T)> void x10::array::Array_2<TPMGL(T)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::array::Array<TPMGL(T)>::_serialize_body(buf);
    buf.write(this->FMGL(numElems_1));
    buf.write(this->FMGL(numElems_2));
    
}

template<class TPMGL(T)> ::x10::lang::Reference* ::x10::array::Array_2<TPMGL(T)>::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::array::Array_2<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::array::Array_2<TPMGL(T)> >()) ::x10::array::Array_2<TPMGL(T)>();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

template<class TPMGL(T)> void x10::array::Array_2<TPMGL(T)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::array::Array<TPMGL(T)>::_deserialize_body(buf);
    FMGL(numElems_1) = buf.read<x10_long>();
    FMGL(numElems_2) = buf.read<x10_long>();
}

template<class TPMGL(T)> ::x10::array::Array_2<TPMGL(T)>*
  x10::array::Array_2<void>::makeView(::x10::lang::Rail< TPMGL(T) >* r,
                                      x10_long m, x10_long n) {
    
    //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    x10_long size = ((m) * (n));
    
    //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    if ((!::x10aux::struct_equals(size, (x10_long)(::x10aux::nullCheck(r)->FMGL(size)))))
    {
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::IllegalOperationException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__123210 = ::x10aux::makeStringLit("size mismatch: "); strLit__123210; })), m), (__extension__ ({ static ::x10::lang::String* strLit__123211 = ::x10aux::makeStringLit(" * "); strLit__123211; }))), n), (__extension__ ({ static ::x10::lang::String* strLit__123212 = ::x10aux::makeStringLit(" != "); strLit__123212; }))), (x10_long)(::x10aux::nullCheck(r)->FMGL(size))))));
    }
    
    //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array_2.x10"
    ::x10::array::Array_2<TPMGL(T)>* alloc__71800 =  (new (::x10aux::alloc_z< ::x10::array::Array_2<TPMGL(T)> >()) ::x10::array::Array_2<TPMGL(T)>());
    (alloc__71800)->::x10::array::Array_2<TPMGL(T)>::_constructor(
      r, m, n);
    return alloc__71800;
    
}
#endif // X10_ARRAY_ARRAY_2_H_IMPLEMENTATION
#endif // __X10_ARRAY_ARRAY_2_H_NODEPS
