#ifndef __X10_REGIONARRAY_MAT_H
#define __X10_REGIONARRAY_MAT_H

#include <x10rt.h>


#define X10_LANG_FUN_0_1_H_NODEPS
#include <x10/lang/Fun_0_1.h>
#undef X10_LANG_FUN_0_1_H_NODEPS
#define X10_LANG_ITERABLE_H_NODEPS
#include <x10/lang/Iterable.h>
#undef X10_LANG_ITERABLE_H_NODEPS
#define X10_LANG_INT_H_NODEPS
#include <x10/lang/Int.h>
#undef X10_LANG_INT_H_NODEPS
#define X10_LANG_INT_H_NODEPS
#include <x10/lang/Int.h>
#undef X10_LANG_INT_H_NODEPS
namespace x10 { namespace regionarray { 
class Row;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Iterator;
} } 
namespace x10 { namespace io { 
class Printer;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace regionarray { 

template<class TPMGL(T)> class Mat;
template <> class Mat<void>;
template<class TPMGL(T)> class Mat : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    x10_int FMGL(rows);
    
    x10_int FMGL(cols);
    
    ::x10::lang::Rail< TPMGL(T) >* FMGL(mat);
    
    void _constructor(x10_int rows, x10_int cols, ::x10::lang::Rail< TPMGL(T) >* mat);
    
    virtual TPMGL(T) __apply(x10_int i);
    virtual ::x10::lang::Iterator<TPMGL(T)>* iterator();
    virtual void printInfo(::x10::io::Printer* ps, ::x10::lang::String* label);
    virtual ::x10::regionarray::Mat<TPMGL(T)>* x10__regionarray__Mat____this__x10__regionarray__Mat(
      );
    virtual void __fieldInitializers_x10_regionarray_Mat();
    
    // Serialization
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

template<class TPMGL(T)> ::x10aux::RuntimeType x10::regionarray::Mat<TPMGL(T)>::rtt;
template<class TPMGL(T)> void x10::regionarray::Mat<TPMGL(T)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::regionarray::Mat<void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_int, TPMGL(T)> >(), ::x10aux::getRTT< ::x10::lang::Iterable<TPMGL(T)> >()};
    const ::x10aux::RuntimeType* params[1] = { ::x10aux::getRTT<TPMGL(T)>()};
    ::x10aux::RuntimeType::Variance variances[1] = { ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.regionarray.Mat";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 2, parents, 1, params, variances);
}

template <> class Mat<void> : public ::x10::lang::X10Class {
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    
};

} } 
#endif // X10_REGIONARRAY_MAT_H

namespace x10 { namespace regionarray { 
template<class TPMGL(T)> class Mat;
} } 

#ifndef X10_REGIONARRAY_MAT_H_NODEPS
#define X10_REGIONARRAY_MAT_H_NODEPS
#include <x10/lang/Fun_0_1.h>
#include <x10/lang/Iterable.h>
#include <x10/lang/Int.h>
#include <x10/regionarray/Row.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Long.h>
#include <x10/lang/Iterator.h>
#include <x10/io/Printer.h>
#include <x10/lang/String.h>
#include <x10/lang/Any.h>
#include <x10/lang/Boolean.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_REGIONARRAY_MAT_H_GENERICS
#define X10_REGIONARRAY_MAT_H_GENERICS
#endif // X10_REGIONARRAY_MAT_H_GENERICS
#ifndef X10_REGIONARRAY_MAT_H_IMPLEMENTATION
#define X10_REGIONARRAY_MAT_H_IMPLEMENTATION
#include <x10/regionarray/Mat.h>


//#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
template<class TPMGL(T)> void x10::regionarray::Mat<TPMGL(T)>::_constructor(
                           x10_int rows, x10_int cols, ::x10::lang::Rail< TPMGL(T) >* mat) {
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
    FMGL(rows) = rows;
    FMGL(cols) = cols;
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
    ::x10::regionarray::Mat<TPMGL(T)>* this__112831 = this;
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
    this->FMGL(mat) = mat;
}


//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
template<class TPMGL(T)> TPMGL(T) x10::regionarray::Mat<TPMGL(T)>::__apply(
  x10_int i) {
    return ::x10aux::nullCheck(this->FMGL(mat))->x10::lang::template Rail< TPMGL(T) >::__apply(
             ((x10_long)(i)));
    
}

//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
template<class TPMGL(T)> ::x10::lang::Iterator<TPMGL(T)>* x10::regionarray::Mat<TPMGL(T)>::iterator(
  ) {
    return ::x10aux::nullCheck(this->FMGL(mat))->x10::lang::template Rail< TPMGL(T) >::iterator();
    
}

//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
template<class TPMGL(T)> void x10::regionarray::Mat<TPMGL(T)>::printInfo(
  ::x10::io::Printer* ps, ::x10::lang::String* label) {
    
    //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
    ::x10aux::nullCheck(ps)->printf((__extension__ ({ static ::x10::lang::String* strLit__126707 = ::x10aux::makeStringLit("%s\n"); strLit__126707; })),
                                    reinterpret_cast< ::x10::lang::Any*>(label));
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
    x10_int row = ((x10_int)0);
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
    {
        ::x10::lang::Iterator<TPMGL(T)>* r__112827;
        for (r__112827 = this->iterator(); ::x10::lang::Iterator<TPMGL(T)>::hasNext(::x10aux::nullCheck(r__112827));
             ) {
            ::x10::regionarray::Row* r = reinterpret_cast< ::x10::regionarray::Row*>(::x10::lang::Iterator<TPMGL(T)>::next(::x10aux::nullCheck(r__112827)));
            
            //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            ::x10aux::nullCheck(ps)->printf((__extension__ ({ static ::x10::lang::String* strLit__126708 = ::x10aux::makeStringLit("    "); strLit__126708; })));
            
            //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
            ::x10aux::nullCheck(r)->printInfo(ps, (__extension__ ({
                                                  x10_int pre__112818 =
                                                    row;
                                                  row = ((row) + (((x10_int)1)));
                                                  pre__112818;
                                              }))
                                              );
        }
    }
    
}

//#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Mat.x10"
template<class TPMGL(T)> ::x10::regionarray::Mat<TPMGL(T)>*
  x10::regionarray::Mat<TPMGL(T)>::x10__regionarray__Mat____this__x10__regionarray__Mat(
  ) {
    return this;
    
}
template<class TPMGL(T)> void x10::regionarray::Mat<TPMGL(T)>::__fieldInitializers_x10_regionarray_Mat(
  ) {
 
}
template<class TPMGL(T)> void x10::regionarray::Mat<TPMGL(T)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(mat));
    buf.write(this->FMGL(rows));
    buf.write(this->FMGL(cols));
    
}

template<class TPMGL(T)> void x10::regionarray::Mat<TPMGL(T)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(mat) = buf.read< ::x10::lang::Rail< TPMGL(T) >*>();
    FMGL(rows) = buf.read<x10_int>();
    FMGL(cols) = buf.read<x10_int>();
}

#endif // X10_REGIONARRAY_MAT_H_IMPLEMENTATION
#endif // __X10_REGIONARRAY_MAT_H_NODEPS
