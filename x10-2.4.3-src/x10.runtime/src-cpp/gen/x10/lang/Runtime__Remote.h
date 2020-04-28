#ifndef __X10_LANG_RUNTIME__REMOTE_H
#define __X10_LANG_RUNTIME__REMOTE_H

#include <x10rt.h>


#define X10_LANG_RUNTIME__REMOTECONTROL_H_NODEPS
#include <x10/lang/Runtime__RemoteControl.h>
#undef X10_LANG_RUNTIME__REMOTECONTROL_H_NODEPS
namespace x10 { namespace util { 
template<class TPMGL(T)> class Box;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 

template<class TPMGL(T)> class Runtime__Remote;
template <> class Runtime__Remote<void>;
template<class TPMGL(T)> class Runtime__Remote : public ::x10::lang::Runtime__RemoteControl
  {
    public:
    RTT_H_DECLS_CLASS
    
    static ::x10aux::itable_entry _itables[4];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static ::x10::io::Unserializable::itable< ::x10::lang::Runtime__Remote<TPMGL(T)> > _itable_0;
    
    static ::x10::lang::Any::itable< ::x10::lang::Runtime__Remote<TPMGL(T)> > _itable_1;
    
    static ::x10::lang::Runtime__Mortal::itable< ::x10::lang::Runtime__Remote<TPMGL(T)> > _itable_2;
    
    virtual x10_boolean _isMortal() { return true; }
    
    void _constructor();
    
    static ::x10::lang::Runtime__Remote<TPMGL(T)>* _make();
    
    ::x10::util::Box<TPMGL(T)>* FMGL(t);
    
    virtual ::x10::lang::Runtime__Remote<TPMGL(T)>* x10__lang__Runtime__Remote____this__x10__lang__Runtime__Remote(
      );
    virtual void __fieldInitializers_x10_lang_Runtime_Remote(
      );
    
    // Serialization
    virtual void _serialize_body(::x10aux::serialization_buffer& buf) {
        ::x10aux::throwNotSerializableException("Can't serialize x10.lang.Runtime$Remote");
    }
    
    virtual ::x10aux::serialization_id_t _get_serialization_id() {
        ::x10aux::throwNotSerializableException("Can't serialize x10.lang.Runtime$Remote");
    }
    
    
};

template<class TPMGL(T)> ::x10aux::RuntimeType x10::lang::Runtime__Remote<TPMGL(T)>::rtt;
template<class TPMGL(T)> void x10::lang::Runtime__Remote<TPMGL(T)>::_initRTT() {
    const ::x10aux::RuntimeType *canonical = ::x10aux::getRTT< ::x10::lang::Runtime__Remote<void> >();
    if (rtt.initStageOne(canonical)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Runtime__RemoteControl>()};
    const ::x10aux::RuntimeType* params[1] = { ::x10aux::getRTT<TPMGL(T)>()};
    ::x10aux::RuntimeType::Variance variances[1] = { ::x10aux::RuntimeType::invariant};
    const char *baseName = "x10.lang.Runtime.Remote";
    rtt.initStageTwo(baseName, ::x10aux::RuntimeType::class_kind, 1, parents, 1, params, variances);
}

template <> class Runtime__Remote<void> : public ::x10::lang::Runtime__RemoteControl
{
    public:
    static ::x10aux::RuntimeType rtt;
    static const ::x10aux::RuntimeType* getRTT() { return & rtt; }
    
};

} } 
#endif // X10_LANG_RUNTIME__REMOTE_H

namespace x10 { namespace lang { 
template<class TPMGL(T)> class Runtime__Remote;
} } 

#ifndef X10_LANG_RUNTIME__REMOTE_H_NODEPS
#define X10_LANG_RUNTIME__REMOTE_H_NODEPS
#include <x10/lang/Runtime__RemoteControl.h>
#include <x10/util/Box.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_RUNTIME__REMOTE_H_GENERICS
#define X10_LANG_RUNTIME__REMOTE_H_GENERICS
#endif // X10_LANG_RUNTIME__REMOTE_H_GENERICS
#ifndef X10_LANG_RUNTIME__REMOTE_H_IMPLEMENTATION
#define X10_LANG_RUNTIME__REMOTE_H_IMPLEMENTATION
#include <x10/lang/Runtime__Remote.h>

template<class TPMGL(T)> ::x10::io::Unserializable::itable< ::x10::lang::Runtime__Remote<TPMGL(T)> >  x10::lang::Runtime__Remote<TPMGL(T)>::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10::lang::Any::itable< ::x10::lang::Runtime__Remote<TPMGL(T)> >  x10::lang::Runtime__Remote<TPMGL(T)>::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10::lang::Runtime__Mortal::itable< ::x10::lang::Runtime__Remote<TPMGL(T)> >  x10::lang::Runtime__Remote<TPMGL(T)>::_itable_2(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
template<class TPMGL(T)> ::x10aux::itable_entry x10::lang::Runtime__Remote<TPMGL(T)>::_itables[4] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Unserializable>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Runtime__Mortal>, &_itable_2), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::Runtime__Remote<TPMGL(T)>")};

//#line 1287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
template<class TPMGL(T)> void x10::lang::Runtime__Remote<TPMGL(T)>::_constructor(
                           ) {
    (this)->::x10::lang::Runtime__RemoteControl::_constructor();
    
    //#line 1286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime__Remote<TPMGL(T)>* this__104448 = this;
    ::x10aux::nullCheck(this__104448)->FMGL(t) = (::x10aux::class_cast_unchecked< ::x10::util::Box<TPMGL(T)>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
template<class TPMGL(T)> ::x10::lang::Runtime__Remote<TPMGL(T)>* x10::lang::Runtime__Remote<TPMGL(T)>::_make(
                           ) {
    ::x10::lang::Runtime__Remote<TPMGL(T)>* this_ = new (::x10aux::alloc_z< ::x10::lang::Runtime__Remote<TPMGL(T)> >()) ::x10::lang::Runtime__Remote<TPMGL(T)>();
    this_->_constructor();
    return this_;
}



//#line 1288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 1286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
template<class TPMGL(T)> ::x10::lang::Runtime__Remote<TPMGL(T)>*
  x10::lang::Runtime__Remote<TPMGL(T)>::x10__lang__Runtime__Remote____this__x10__lang__Runtime__Remote(
  ) {
    return this;
    
}
template<class TPMGL(T)> void x10::lang::Runtime__Remote<TPMGL(T)>::__fieldInitializers_x10_lang_Runtime_Remote(
  ) {
    this->FMGL(t) = (::x10aux::class_cast_unchecked< ::x10::util::Box<TPMGL(T)>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
#endif // X10_LANG_RUNTIME__REMOTE_H_IMPLEMENTATION
#endif // __X10_LANG_RUNTIME__REMOTE_H_NODEPS
