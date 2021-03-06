#ifndef __X10_LANG_CELL_H
#define __X10_LANG_CELL_H

#include <x10rt.h>


namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 

template<class TPMGL(T)> class Cell;
template <> class Cell<void>;
template<class TPMGL(T)> class Cell : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    TPMGL(T) FMGL(value);
    
    void _constructor(TPMGL(T) x);
    
    static ::x10::lang::Cell<TPMGL(T)>* _make(TPMGL(T) x);
    
    virtual ::x10::lang::String* toString();
    virtual TPMGL(T) __apply();
    virtual void __apply(TPMGL(T) x);
    virtual void __set(TPMGL(T) x);
    virtual TPMGL(T) set(TPMGL(T) x);
    virtual ::x10::lang::Cell<TPMGL(T)>* x10__lang__Cell____this__x10__lang__Cell(
      );
    virtual void __fieldInitializers_x10_lang_Cell();
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

template<class TPMGL(T)> ::x10aux::RuntimeType x10::lang::Cell<TPMGL(T)>::rtt;
template<class TPMGL(T)> void x10::lang::Cell<TPMGL(T)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::lang::Cell<void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    const ::x10aux::RuntimeType* params[1] = { ::x10aux::getRTT<TPMGL(T)>()};
    ::x10aux::RuntimeType::Variance variances[1] = { ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.lang.Cell";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 0, parents, 1, params, variances);
}

template <> class Cell<void> : public ::x10::lang::X10Class {
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    template<class TPMGL(T)> static ::x10::lang::Cell<TPMGL(T)>* make(
      TPMGL(T) x);
    
    template<class TPMGL(W)> static ::x10::lang::Cell<TPMGL(W)>* __implicit_convert(
      TPMGL(W) x);
    
    
};

} } 
#endif // X10_LANG_CELL_H

namespace x10 { namespace lang { 
template<class TPMGL(T)> class Cell;
} } 

#ifndef X10_LANG_CELL_H_NODEPS
#define X10_LANG_CELL_H_NODEPS
#include <x10/lang/String.h>
#include <x10/lang/Any.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_CELL_H_GENERICS
#define X10_LANG_CELL_H_GENERICS
#endif // X10_LANG_CELL_H_GENERICS
#ifndef X10_LANG_CELL_H_IMPLEMENTATION
#define X10_LANG_CELL_H_IMPLEMENTATION
#include <x10/lang/Cell.h>


//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
/**
     * The value stored in this cell.
     */

//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
template<class TPMGL(T)> void x10::lang::Cell<TPMGL(T)>::_constructor(TPMGL(T) x) {
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    ::x10::lang::Cell<TPMGL(T)>* this__93066 = this;
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    this->FMGL(value) = x;
}
template<class TPMGL(T)> ::x10::lang::Cell<TPMGL(T)>* x10::lang::Cell<TPMGL(T)>::_make(
                           TPMGL(T) x) {
    ::x10::lang::Cell<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::lang::Cell<TPMGL(T)> >()) ::x10::lang::Cell<TPMGL(T)>();
    this_->_constructor(x);
    return this_;
}



//#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
template<class TPMGL(T)> ::x10::lang::String* x10::lang::Cell<TPMGL(T)>::toString(
  ) {
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    return ::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124151 = ::x10aux::makeStringLit("Cell("); strLit__124151; })), (::x10aux::struct_equals(this->FMGL(value),
                                                                                                                                                                                                                  reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
      ? ((__extension__ ({ static ::x10::lang::String* strLit__124152 = ::x10aux::makeStringLit("null"); strLit__124152; })))
      : (::x10aux::to_string(this->FMGL(value)))), (__extension__ ({ static ::x10::lang::String* strLit__124153 = ::x10aux::makeStringLit(")"); strLit__124153; })));
    
}

//#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
template<class TPMGL(T)> TPMGL(T) x10::lang::Cell<TPMGL(T)>::__apply(
  ) {
    return this->FMGL(value);
    
}

//#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
template<class TPMGL(T)> void x10::lang::Cell<TPMGL(T)>::__apply(
  TPMGL(T) x) {
    this->FMGL(value) = x;
}

//#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
template<class TPMGL(T)> void x10::lang::Cell<TPMGL(T)>::__set(
  TPMGL(T) x) {
    ::x10::lang::Cell<TPMGL(T)>* this__93067 = this;
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    TPMGL(T) x__93068 = x;
    TPMGL(T) ret__93069;
    ::x10aux::nullCheck(this__93067)->FMGL(value) = x__93068;
    ret__93069 = x__93068;
    ret__93069;
}

//#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
template<class TPMGL(T)> TPMGL(T) x10::lang::Cell<TPMGL(T)>::set(
  TPMGL(T) x) {
    this->FMGL(value) = x;
    return x;
    
}

//#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"

//#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
template<class TPMGL(T)> ::x10::lang::Cell<TPMGL(T)>* x10::lang::Cell<TPMGL(T)>::x10__lang__Cell____this__x10__lang__Cell(
  ) {
    return this;
    
}
template<class TPMGL(T)> void x10::lang::Cell<TPMGL(T)>::__fieldInitializers_x10_lang_Cell(
  ) {
 
}
template<class TPMGL(T)> const ::x10aux::serialization_id_t x10::lang::Cell<TPMGL(T)>::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::Cell<TPMGL(T)>::_deserializer);

template<class TPMGL(T)> void x10::lang::Cell<TPMGL(T)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(value));
    
}

template<class TPMGL(T)> ::x10::lang::Reference* ::x10::lang::Cell<TPMGL(T)>::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Cell<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::lang::Cell<TPMGL(T)> >()) ::x10::lang::Cell<TPMGL(T)>();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

template<class TPMGL(T)> void x10::lang::Cell<TPMGL(T)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(value) = buf.read<TPMGL(T)>();
}

template<class TPMGL(T)> ::x10::lang::Cell<TPMGL(T)>* x10::lang::Cell<void>::make(TPMGL(T) x) {
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    ::x10::lang::Cell<TPMGL(T)>* alloc__93071 =  (new (::x10aux::alloc_z< ::x10::lang::Cell<TPMGL(T)> >()) ::x10::lang::Cell<TPMGL(T)>());
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    TPMGL(T) x__93070 = x;
    alloc__93071->FMGL(value) = x__93070;
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    return alloc__93071;
    
}
template<class TPMGL(W)> ::x10::lang::Cell<TPMGL(W)>* x10::lang::Cell<void>::__implicit_convert(TPMGL(W) x) {
    
    //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    TPMGL(W) x__93074 = x;
    ::x10::lang::Cell<TPMGL(W)>* alloc__93073 =  (new (::x10aux::alloc_z< ::x10::lang::Cell<TPMGL(W)> >()) ::x10::lang::Cell<TPMGL(W)>());
    
    //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    TPMGL(W) x__93072 = x__93074;
    alloc__93073->FMGL(value) = x__93072;
    
    //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    return alloc__93073;
    
}
#endif // X10_LANG_CELL_H_IMPLEMENTATION
#endif // __X10_LANG_CELL_H_NODEPS
