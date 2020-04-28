#ifndef __X10_ARRAY_ARRAY_H
#define __X10_ARRAY_ARRAY_H

#include <x10rt.h>


#define X10_LANG_ITERABLE_H_NODEPS
#include <x10/lang/Iterable.h>
#undef X10_LANG_ITERABLE_H_NODEPS
#define X10_LANG_FUN_0_1_H_NODEPS
#include <x10/lang/Fun_0_1.h>
#undef X10_LANG_FUN_0_1_H_NODEPS
namespace x10 { namespace lang { 
class Point;
} } 
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace lang { 
class Unsafe;
} } 
namespace x10 { namespace compiler { 
class Inline;
} } 
namespace x10 { namespace lang { 
class IllegalArgumentException;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Iterator;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(Z1), class TPMGL(Z2), class TPMGL(U)> class Fun_0_2;
} } 
namespace x10 { namespace array { 
class IterationSpace;
} } 
namespace x10 { namespace lang { 
class ArrayIndexOutOfBoundsException;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace compiler { 
class NoInline;
} } 
namespace x10 { namespace compiler { 
class NoReturn;
} } 
namespace x10 { namespace lang { 
class NegativeArraySizeException;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace array { 

template<class TPMGL(T)> class Array;
template <> class Array<void>;
template<class TPMGL(T)> class Array : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    x10_long FMGL(size);
    
    x10_long rank();
    ::x10::lang::Rail< TPMGL(T) >* FMGL(raw);
    
    void _constructor(x10_long s, x10_boolean zero);
    
    void _constructor(::x10::lang::Rail< TPMGL(T) >* r);
    
    virtual ::x10::lang::Rail< TPMGL(T) >* raw();
    virtual void modifyRaw(::x10::lang::Rail< TPMGL(T) >* r);
    virtual ::x10::lang::Iterator<TPMGL(T)>* iterator();
    virtual void fill(TPMGL(T) v);
    virtual void clear();
    template<class TPMGL(U)> TPMGL(U) reduce(::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>* op,
                                             TPMGL(U) unit);
    template<class TPMGL(U)> ::x10::array::Array<TPMGL(U)>* map(::x10::array::Array<TPMGL(U)>* dst,
                                                                ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op);
    template<class TPMGL(S), class TPMGL(U)> ::x10::array::Array<TPMGL(U)>*
      map(::x10::array::Array<TPMGL(S)>* src2, ::x10::array::Array<TPMGL(U)>* dst,
          ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(S), TPMGL(U)>* op);
    virtual ::x10::array::IterationSpace* indices() = 0;
    virtual TPMGL(T) __apply(::x10::lang::Point* p) = 0;
    virtual TPMGL(T) __set(::x10::lang::Point* p, TPMGL(T) v) = 0;
    virtual ::x10::array::Array<TPMGL(T)>* x10__array__Array____this__x10__array__Array(
      );
    virtual void __fieldInitializers_x10_array_Array();
    
    // Serialization
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

template<class TPMGL(T)> ::x10aux::RuntimeType x10::array::Array<TPMGL(T)>::rtt;
template<class TPMGL(T)> void x10::array::Array<TPMGL(T)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::array::Array<void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::Iterable<TPMGL(T)> >(), ::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::Point*, TPMGL(T)> >()};
    const ::x10aux::RuntimeType* params[1] = { ::x10aux::getRTT<TPMGL(T)>()};
    ::x10aux::RuntimeType::Variance variances[1] = { ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.array.Array";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 2, parents, 1, params, variances);
}

template <> class Array<void> : public ::x10::lang::X10Class
{
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    template<class TPMGL(T)> static void copy(::x10::array::Array<TPMGL(T)>* src,
                                              ::x10::array::Array<TPMGL(T)>* dst);
    
    template<class TPMGL(T)> static void copy(::x10::array::Array<TPMGL(T)>* src,
                                              x10_long srcIndex,
                                              ::x10::array::Array<TPMGL(T)>* dst,
                                              x10_long dstIndex,
                                              x10_long numElems);
    
    static void raiseBoundsError(x10_long i) X10_PRAGMA_NORETURN ;
    
    static void raiseBoundsError(x10_long i, x10_long j) X10_PRAGMA_NORETURN ;
    
    static void raiseBoundsError(x10_long i, x10_long j, x10_long k) X10_PRAGMA_NORETURN ;
    
    static void raiseNegativeArraySizeException() X10_PRAGMA_NORETURN ;
    
    
};

} } 
#endif // X10_ARRAY_ARRAY_H

namespace x10 { namespace array { 
template<class TPMGL(T)> class Array;
} } 

#ifndef X10_ARRAY_ARRAY_H_NODEPS
#define X10_ARRAY_ARRAY_H_NODEPS
#include <x10/lang/Iterable.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/lang/Point.h>
#include <x10/lang/Long.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Unsafe.h>
#include <x10/compiler/Inline.h>
#include <x10/lang/IllegalArgumentException.h>
#include <x10/lang/Iterator.h>
#include <x10/lang/Fun_0_2.h>
#include <x10/array/IterationSpace.h>
#include <x10/lang/ArrayIndexOutOfBoundsException.h>
#include <x10/lang/String.h>
#include <x10/compiler/NoInline.h>
#include <x10/compiler/NoReturn.h>
#include <x10/lang/NegativeArraySizeException.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_ARRAY_ARRAY_H_GENERICS
#define X10_ARRAY_ARRAY_H_GENERICS
#ifndef X10_ARRAY_ARRAY_H_reduce_35
#define X10_ARRAY_ARRAY_H_reduce_35
template<class TPMGL(T)> template<class TPMGL(U)> TPMGL(U) x10::array::Array<TPMGL(T)>::reduce(
  ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>* op, TPMGL(U) unit) {
    
    //#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    ::x10::lang::Rail< TPMGL(T) >* src__72879 = this->FMGL(raw);
    ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>* op__72880 =
      op;
    TPMGL(U) unit__72881 = unit;
    TPMGL(U) ret__72882;
    
    //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    TPMGL(U) accum__72878 = unit__72881;
    
    //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    ::x10::lang::Rail< TPMGL(T) >* rail__72874 = src__72879;
    x10_long i__72784max__72875 = (x10_long)(::x10aux::nullCheck(rail__72874)->FMGL(size));
    {
        x10_long i__72876;
        for (i__72876 = ((x10_long)0ll); ((i__72876) < (i__72784max__72875));
             i__72876 = ((i__72876) + (((x10_long)1ll)))) {
            x10_long i__72877 = i__72876;
            
            //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            accum__72878 = ::x10::lang::Fun_0_2<TPMGL(U), TPMGL(T), TPMGL(U)>::__apply(::x10aux::nullCheck(op__72880), 
              accum__72878, ::x10aux::nullCheck(src__72879)->x10::lang::template Rail< TPMGL(T) >::__apply(
                              i__72877));
        }
    }
    
    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    ret__72882 = accum__72878;
    
    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    return ret__72882;
    
}
#endif // X10_ARRAY_ARRAY_H_reduce_35
#ifndef X10_ARRAY_ARRAY_H_map_36
#define X10_ARRAY_ARRAY_H_map_36
template<class TPMGL(T)> template<class TPMGL(U)> ::x10::array::Array<TPMGL(U)>*
  x10::array::Array<TPMGL(T)>::map(::x10::array::Array<TPMGL(U)>* dst,
                                   ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op) {
    
    //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    ::x10::lang::Rail< TPMGL(T) >* src__72887 = this->FMGL(raw);
    ::x10::lang::Rail< TPMGL(U) >* dst__72888 = ::x10aux::nullCheck(dst)->FMGL(raw);
    
    //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>* op__72889 =
      op;
    
    //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    ::x10::lang::Rail< TPMGL(U) >* ret__72890;
    
    //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    ::x10::lang::Rail< TPMGL(T) >* rail__72883 = src__72887;
    x10_long i__72803max__72884 = (x10_long)(::x10aux::nullCheck(rail__72883)->FMGL(size));
    {
        x10_long i__72885;
        for (i__72885 = ((x10_long)0ll); ((i__72885) < (i__72803max__72884));
             i__72885 = ((i__72885) + (((x10_long)1ll))))
        {
            x10_long i__72886 = i__72885;
            
            //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            ::x10aux::nullCheck(dst__72888)->x10::lang::template Rail< TPMGL(U) >::__set(
              i__72886, ::x10::lang::Fun_0_1<TPMGL(T), TPMGL(U)>::__apply(::x10aux::nullCheck(op__72889), 
                ::x10aux::nullCheck(src__72887)->x10::lang::template Rail< TPMGL(T) >::__apply(
                  i__72886)));
        }
    }
    
    //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    ret__72890 = dst__72888;
    
    //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    ret__72890;
    
    //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    return dst;
    
}
#endif // X10_ARRAY_ARRAY_H_map_36
#ifndef X10_ARRAY_ARRAY_H_map_37
#define X10_ARRAY_ARRAY_H_map_37
template<class TPMGL(T)> template<class TPMGL(S), class TPMGL(U)>
::x10::array::Array<TPMGL(U)>* x10::array::Array<TPMGL(T)>::map(
  ::x10::array::Array<TPMGL(S)>* src2, ::x10::array::Array<TPMGL(U)>* dst,
  ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(S), TPMGL(U)>* op) {
    
    //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    ::x10::lang::Rail< TPMGL(T) >* src__72895 = this->FMGL(raw);
    ::x10::lang::Rail< TPMGL(S) >* src__72896 = ::x10aux::nullCheck(src2)->FMGL(raw);
    ::x10::lang::Rail< TPMGL(U) >* dst__72897 = ::x10aux::nullCheck(dst)->FMGL(raw);
    ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(S), TPMGL(U)>* op__72898 =
      op;
    ::x10::lang::Rail< TPMGL(U) >* ret__72899;
    
    //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    ::x10::lang::Rail< TPMGL(T) >* rail__72891 = src__72895;
    x10_long i__72822max__72892 = (x10_long)(::x10aux::nullCheck(rail__72891)->FMGL(size));
    {
        x10_long i__72893;
        for (i__72893 = ((x10_long)0ll); ((i__72893) < (i__72822max__72892));
             i__72893 = ((i__72893) + (((x10_long)1ll))))
        {
            x10_long i__72894 = i__72893;
            
            //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
            ::x10aux::nullCheck(dst__72897)->x10::lang::template Rail< TPMGL(U) >::__set(
              i__72894, ::x10::lang::Fun_0_2<TPMGL(T), TPMGL(S), TPMGL(U)>::__apply(::x10aux::nullCheck(op__72898), 
                ::x10aux::nullCheck(src__72895)->x10::lang::template Rail< TPMGL(T) >::__apply(
                  i__72894), ::x10aux::nullCheck(src__72896)->x10::lang::template Rail< TPMGL(S) >::__apply(
                               i__72894)));
        }
    }
    
    //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    ret__72899 = dst__72897;
    
    //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/RailUtils.x10"
    ret__72899;
    
    //#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    return dst;
    
}
#endif // X10_ARRAY_ARRAY_H_map_37
#endif // X10_ARRAY_ARRAY_H_GENERICS
#ifndef X10_ARRAY_ARRAY_H_IMPLEMENTATION
#define X10_ARRAY_ARRAY_H_IMPLEMENTATION
#include <x10/array/Array.h>


//#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"

//#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"

//#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
/**
     * The backing storage for the array's elements
     */

//#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
template<class TPMGL(T)> void x10::array::Array<TPMGL(T)>::_constructor(x10_long s,
                                                                        x10_boolean zero) {
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    FMGL(size) = s;
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    ::x10::array::Array<TPMGL(T)>* this__72872 = this;
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    this->FMGL(raw) = zero ? (::x10::lang::Rail< TPMGL(T) >::_makeUnsafe(s, true))
      : (::x10::lang::Rail< TPMGL(T) >::_makeUnsafe(s, false));
}


//#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
template<class TPMGL(T)> void x10::array::Array<TPMGL(T)>::_constructor(
                           ::x10::lang::Rail< TPMGL(T) >* r) {
    
    //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    FMGL(size) = (x10_long)(::x10aux::nullCheck(r)->FMGL(size));
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    ::x10::array::Array<TPMGL(T)>* this__72873 = this;
    
    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    this->FMGL(raw) = r;
}


//#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
template<class TPMGL(T)> ::x10::lang::Rail< TPMGL(T) >* x10::array::Array<TPMGL(T)>::raw(
  ) {
    return this->FMGL(raw);
    
}

//#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
template<class TPMGL(T)> void x10::array::Array<TPMGL(T)>::modifyRaw(
  ::x10::lang::Rail< TPMGL(T) >* r) {
    
    //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    if ((!::x10aux::struct_equals((x10_long)(::x10aux::nullCheck(this->FMGL(raw))->FMGL(size)),
                                  this->FMGL(size)))) {
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::IllegalArgumentException::_make((__extension__ ({ static ::x10::lang::String* strLit__123294 = ::x10aux::makeStringLit("size mismatch"); strLit__123294; })))));
    }
    
    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    this->FMGL(raw) = (r);
}

//#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
template<class TPMGL(T)> ::x10::lang::Iterator<TPMGL(T)>*
  x10::array::Array<TPMGL(T)>::iterator() {
    return this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::iterator();
    
}

//#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
template<class TPMGL(T)> void x10::array::Array<TPMGL(T)>::fill(
  TPMGL(T) v) {
    
    //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::fill(
      v);
}

//#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
template<class TPMGL(T)> void x10::array::Array<TPMGL(T)>::clear(
  ) {
    
    //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    this->FMGL(raw)->x10::lang::template Rail< TPMGL(T) >::clear();
}

//#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"

//#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"

//#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"

//#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"

//#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"

//#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"

//#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"

//#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"

//#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"

//#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"

//#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"

//#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"

//#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
template<class TPMGL(T)> ::x10::array::Array<TPMGL(T)>* x10::array::Array<TPMGL(T)>::x10__array__Array____this__x10__array__Array(
  ) {
    return this;
    
}
template<class TPMGL(T)> void x10::array::Array<TPMGL(T)>::__fieldInitializers_x10_array_Array(
  ) {
 
}
template<class TPMGL(T)> void x10::array::Array<TPMGL(T)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(raw));
    buf.write(this->FMGL(size));
    
}

template<class TPMGL(T)> void x10::array::Array<TPMGL(T)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(raw) = buf.read< ::x10::lang::Rail< TPMGL(T) >*>();
    FMGL(size) = buf.read<x10_long>();
}

template<class TPMGL(T)> void x10::array::Array<void>::copy(::x10::array::Array<TPMGL(T)>* src,
                                                            ::x10::array::Array<TPMGL(T)>* dst) {
    
    //#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    ::x10::lang::Rail< void >::template copy< TPMGL(T) >(
      ::x10aux::nullCheck(src)->FMGL(raw), ((x10_long)0ll),
      ::x10aux::nullCheck(dst)->FMGL(raw), ((x10_long)0ll),
      (x10_long)(::x10aux::nullCheck(::x10aux::nullCheck(src)->FMGL(raw))->FMGL(size)));
}
template<class TPMGL(T)> void x10::array::Array<void>::copy(::x10::array::Array<TPMGL(T)>* src,
                                                            x10_long srcIndex,
                                                            ::x10::array::Array<TPMGL(T)>* dst,
                                                            x10_long dstIndex,
                                                            x10_long numElems) {
    
    //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/array/Array.x10"
    ::x10::lang::Rail< void >::template copy< TPMGL(T) >(
      ::x10aux::nullCheck(src)->FMGL(raw), srcIndex, ::x10aux::nullCheck(dst)->FMGL(raw),
      dstIndex, numElems);
}
#endif // X10_ARRAY_ARRAY_H_IMPLEMENTATION
#endif // __X10_ARRAY_ARRAY_H_NODEPS
