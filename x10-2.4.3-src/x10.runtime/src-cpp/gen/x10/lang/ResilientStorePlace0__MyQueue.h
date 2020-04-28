#ifndef __X10_LANG_RESILIENTSTOREPLACE0__MYQUEUE_H
#define __X10_LANG_RESILIENTSTOREPLACE0__MYQUEUE_H

#include <x10rt.h>


namespace x10 { namespace lang { 
template<class TPMGL(E)> class ResilientStorePlace0__MyQueue__Entry;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 

template<class TPMGL(E)> class ResilientStorePlace0__MyQueue;
template <> class ResilientStorePlace0__MyQueue<void>;
template<class TPMGL(E)> class ResilientStorePlace0__MyQueue : public ::x10::lang::X10Class
  {
    public:
    RTT_H_DECLS_CLASS
    
    ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>* FMGL(head);
    
    ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>* FMGL(tail);
    
    virtual void add(TPMGL(E) e);
    virtual TPMGL(E) remove();
    virtual ::x10::lang::ResilientStorePlace0__MyQueue<TPMGL(E)>*
      x10__lang__ResilientStorePlace0__MyQueue____this__x10__lang__ResilientStorePlace0__MyQueue(
      );
    void _constructor();
    
    static ::x10::lang::ResilientStorePlace0__MyQueue<TPMGL(E)>* _make(
             );
    
    virtual void __fieldInitializers_x10_lang_ResilientStorePlace0_MyQueue(
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

template<class TPMGL(E)> ::x10aux::RuntimeType x10::lang::ResilientStorePlace0__MyQueue<TPMGL(E)>::rtt;
template<class TPMGL(E)> void x10::lang::ResilientStorePlace0__MyQueue<TPMGL(E)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::lang::ResilientStorePlace0__MyQueue<void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    const ::x10aux::RuntimeType* params[1] = { ::x10aux::getRTT<TPMGL(E)>()};
    ::x10aux::RuntimeType::Variance variances[1] = { ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.lang.ResilientStorePlace0.MyQueue";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 0, parents, 1, params, variances);
}

template <> class ResilientStorePlace0__MyQueue<void> : public ::x10::lang::X10Class
{
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    
};

} } 
#endif // X10_LANG_RESILIENTSTOREPLACE0__MYQUEUE_H

namespace x10 { namespace lang { 
template<class TPMGL(E)> class ResilientStorePlace0__MyQueue;
} } 

#ifndef X10_LANG_RESILIENTSTOREPLACE0__MYQUEUE_H_NODEPS
#define X10_LANG_RESILIENTSTOREPLACE0__MYQUEUE_H_NODEPS
#include <x10/lang/ResilientStorePlace0__MyQueue__Entry.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_RESILIENTSTOREPLACE0__MYQUEUE_H_GENERICS
#define X10_LANG_RESILIENTSTOREPLACE0__MYQUEUE_H_GENERICS
#endif // X10_LANG_RESILIENTSTOREPLACE0__MYQUEUE_H_GENERICS
#ifndef X10_LANG_RESILIENTSTOREPLACE0__MYQUEUE_H_IMPLEMENTATION
#define X10_LANG_RESILIENTSTOREPLACE0__MYQUEUE_H_IMPLEMENTATION
#include <x10/lang/ResilientStorePlace0__MyQueue.h>


//#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"

//#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
template<class TPMGL(E)> void x10::lang::ResilientStorePlace0__MyQueue<TPMGL(E)>::add(
  TPMGL(E) e) {
    
    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>* entry =
       (new (::x10aux::alloc_z< ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)> >()) ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>());
    
    //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    TPMGL(E) e__103846 = e;
    entry->FMGL(next) = (::x10aux::class_cast_unchecked< ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    entry->FMGL(e) = e__103846;
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    if ((::x10aux::struct_equals(this->FMGL(tail), reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        this->FMGL(head) = entry;
    } else {
        ::x10aux::nullCheck(this->FMGL(tail))->FMGL(next) =
          entry;
    }
    
    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    this->FMGL(tail) = entry;
}

//#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
template<class TPMGL(E)> TPMGL(E) x10::lang::ResilientStorePlace0__MyQueue<TPMGL(E)>::remove(
  ) {
    
    //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>* entry =
      this->FMGL(head);
    
    //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    this->FMGL(head) = ::x10aux::nullCheck(entry)->FMGL(next);
    if ((::x10aux::struct_equals(this->FMGL(head), reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        this->FMGL(tail) = (::x10aux::class_cast_unchecked< ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
    
    //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
    return ::x10aux::nullCheck(entry)->FMGL(e);
    
}

//#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlace0.x10"
template<class TPMGL(E)> ::x10::lang::ResilientStorePlace0__MyQueue<TPMGL(E)>*
  x10::lang::ResilientStorePlace0__MyQueue<TPMGL(E)>::x10__lang__ResilientStorePlace0__MyQueue____this__x10__lang__ResilientStorePlace0__MyQueue(
  ) {
    return this;
    
}
template<class TPMGL(E)> void x10::lang::ResilientStorePlace0__MyQueue<TPMGL(E)>::_constructor(
                           ) {
    ::x10::lang::ResilientStorePlace0__MyQueue<TPMGL(E)>* this__103847 =
      this;
    ::x10aux::nullCheck(this__103847)->FMGL(head) = (::x10aux::class_cast_unchecked< ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    ::x10aux::nullCheck(this__103847)->FMGL(tail) = (::x10aux::class_cast_unchecked< ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
template<class TPMGL(E)> ::x10::lang::ResilientStorePlace0__MyQueue<TPMGL(E)>* x10::lang::ResilientStorePlace0__MyQueue<TPMGL(E)>::_make(
                           ) {
    ::x10::lang::ResilientStorePlace0__MyQueue<TPMGL(E)>* this_ = new (::x10aux::alloc_z< ::x10::lang::ResilientStorePlace0__MyQueue<TPMGL(E)> >()) ::x10::lang::ResilientStorePlace0__MyQueue<TPMGL(E)>();
    this_->_constructor();
    return this_;
}


template<class TPMGL(E)> void x10::lang::ResilientStorePlace0__MyQueue<TPMGL(E)>::__fieldInitializers_x10_lang_ResilientStorePlace0_MyQueue(
  ) {
    this->FMGL(head) = (::x10aux::class_cast_unchecked< ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(tail) = (::x10aux::class_cast_unchecked< ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
template<class TPMGL(E)> const ::x10aux::serialization_id_t x10::lang::ResilientStorePlace0__MyQueue<TPMGL(E)>::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::ResilientStorePlace0__MyQueue<TPMGL(E)>::_deserializer);

template<class TPMGL(E)> void x10::lang::ResilientStorePlace0__MyQueue<TPMGL(E)>::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(head));
    buf.write(this->FMGL(tail));
    
}

template<class TPMGL(E)> ::x10::lang::Reference* ::x10::lang::ResilientStorePlace0__MyQueue<TPMGL(E)>::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::ResilientStorePlace0__MyQueue<TPMGL(E)>* this_ = new (::x10aux::alloc_z< ::x10::lang::ResilientStorePlace0__MyQueue<TPMGL(E)> >()) ::x10::lang::ResilientStorePlace0__MyQueue<TPMGL(E)>();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

template<class TPMGL(E)> void x10::lang::ResilientStorePlace0__MyQueue<TPMGL(E)>::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(head) = buf.read< ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>*>();
    FMGL(tail) = buf.read< ::x10::lang::ResilientStorePlace0__MyQueue__Entry<TPMGL(E)>*>();
}

#endif // X10_LANG_RESILIENTSTOREPLACE0__MYQUEUE_H_IMPLEMENTATION
#endif // __X10_LANG_RESILIENTSTOREPLACE0__MYQUEUE_H_NODEPS
