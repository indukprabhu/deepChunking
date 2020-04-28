#ifndef __X10_LANG_RESILIENTSTOREPLACE0__MYQUEUE__ENTRY_H
#define __X10_LANG_RESILIENTSTOREPLACE0__MYQUEUE__ENTRY_H

#include <x10rt.h>


namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 

template<class TPMGL(E)> class ResilientStorePlace0__MyQueue__Entry;
template <> class ResilientStorePlace0__MyQueue__Entry<void>;
template<class TPMGL(E)> class ResilientStorePlace0__MyQueue__Entry : public ::x10::lang::X10Class
  {
    public:
    RTT_H_DECLS_CLASS
    
    TPMGL(E) FMGL(e);
    
    ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>* FMGL(next);
    
    void _constructor(TPMGL(E) e);
    
    static ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>* _make(
             TPMGL(E) e);
    
    virtual ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>*
      x10__lang__ResilientStorePlace0__MyQueue__Entry____this__x10__lang__ResilientStorePlace0__MyQueue__Entry(
      );
    virtual void __fieldInitializers_x10_lang_ResilientStorePlace0_MyQueue_Entry(
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

template<class TPMGL(E)> ::x10aux::RuntimeType x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>::rtt;
template<class TPMGL(E)> void x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::lang::ResilientStorePlace0__MyQueue__Entry<void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    const ::x10aux::RuntimeType* params[1] = { ::x10aux::getRTT<TPMGL(E)>()};
    ::x10aux::RuntimeType::Variance variances[1] = { ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.lang.ResilientStorePlace0.MyQueue.Entry";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 0, parents, 1, params, variances);
}

template <> class ResilientStorePlace0__MyQueue__Entry<void> : public ::x10::lang::X10Class
{
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    
};

} } 
#endif // X10_LANG_RESILIENTSTOREPLACE0__MYQUEUE__ENTRY_H

namespace x10 { namespace lang { 
template<class TPMGL(E)> class ResilientStorePlace0__MyQueue__Entry;
} } 

#ifndef X10_LANG_RESILIENTSTOREPLACE0__MYQUEUE__ENTRY_H_NODEPS
#define X10_LANG_RESILIENTSTOREPLACE0__MYQUEUE__ENTRY_H_NODEPS
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_RESILIENTSTOREPLACE0__MYQUEUE__ENTRY_H_GENERICS
#define X10_LANG_RESILIENTSTOREPLACE0__MYQUEUE__ENTRY_H_GENERICS
#endif // X10_LANG_RESILIENTSTOREPLACE0__MYQUEUE__ENTRY_H_GENERICS
#ifndef X10_LANG_RESILIENTSTOREPLACE0__MYQUEUE__ENTRY_H_IMPLEMENTATION
#define X10_LANG_RESILIENTSTOREPLACE0__MYQUEUE__ENTRY_H_IMPLEMENTATION
#include <x10/lang/ResilientStorePlace0__MyQueue__Entry.h>


//#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
template<class TPMGL(E)> void x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>::_constructor(
                           TPMGL(E) e) {
    ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>* this__103845 =
      this;
    ::x10aux::nullCheck(this__103845)->FMGL(next) = (::x10aux::class_cast_unchecked< ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(e) = e;
}
template<class TPMGL(E)> ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>* x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>::_make(
                           TPMGL(E) e) {
    ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>* this_ = new (::x10aux::alloc_z< ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)> >()) ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>();
    this_->_constructor(e);
    return this_;
}


template<class TPMGL(E)> ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>*
  x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>::x10__lang__ResilientStorePlace0__MyQueue__Entry____this__x10__lang__ResilientStorePlace0__MyQueue__Entry(
  ) {
    return this;
    
}
template<class TPMGL(E)> void x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>::__fieldInitializers_x10_lang_ResilientStorePlace0_MyQueue_Entry(
  ) {
    this->FMGL(next) = (::x10aux::class_cast_unchecked< ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
template<class TPMGL(E)> const ::x10aux::serialization_id_t x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>::_deserializer);

template<class TPMGL(E)> void x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(e));
    buf.write(this->FMGL(next));
    
}

template<class TPMGL(E)> ::x10::lang::Reference* ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>* this_ = new (::x10aux::alloc_z< ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)> >()) ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

template<class TPMGL(E)> void x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(e) = buf.read<TPMGL(E)>();
    FMGL(next) = buf.read< ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>*>();
}

#endif // X10_LANG_RESILIENTSTOREPLACE0__MYQUEUE__ENTRY_H_IMPLEMENTATION
#endif // __X10_LANG_RESILIENTSTOREPLACE0__MYQUEUE__ENTRY_H_NODEPS
