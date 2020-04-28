#ifndef __X10_LANG_RESILIENTSTOREPLACE0__MYLATCH_H
#define __X10_LANG_RESILIENTSTOREPLACE0__MYLATCH_H

#include <x10rt.h>


#define X10_UTIL_CONCURRENT_SIMPLELATCH_H_NODEPS
#include <x10/util/concurrent/SimpleLatch.h>
#undef X10_UTIL_CONCURRENT_SIMPLELATCH_H_NODEPS
#define X10_LANG_RUNTIME__MORTAL_H_NODEPS
#include <x10/lang/Runtime__Mortal.h>
#undef X10_LANG_RUNTIME__MORTAL_H_NODEPS
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 

class ResilientStorePlace0__MyLatch : public ::x10::util::concurrent::SimpleLatch
  {
    public:
    RTT_H_DECLS_CLASS
    
    static ::x10aux::itable_entry _itables[4];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static ::x10::io::Unserializable::itable< ::x10::lang::ResilientStorePlace0__MyLatch > _itable_0;
    
    static ::x10::lang::Any::itable< ::x10::lang::ResilientStorePlace0__MyLatch > _itable_1;
    
    static ::x10::lang::Runtime__Mortal::itable< ::x10::lang::ResilientStorePlace0__MyLatch > _itable_2;
    
    virtual x10_boolean _isMortal() { return true; }
    
    virtual ::x10::lang::ResilientStorePlace0__MyLatch* x10__lang__ResilientStorePlace0__MyLatch____this__x10__lang__ResilientStorePlace0__MyLatch(
      );
    void _constructor();
    
    static ::x10::lang::ResilientStorePlace0__MyLatch* _make(
             );
    
    virtual void __fieldInitializers_x10_lang_ResilientStorePlace0_MyLatch(
      );
    
    // Serialization
    virtual void _serialize_body(::x10aux::serialization_buffer& buf) {
        ::x10aux::throwNotSerializableException("Can't serialize x10.lang.ResilientStorePlace0$MyLatch");
    }
    
    virtual ::x10aux::serialization_id_t _get_serialization_id() {
        ::x10aux::throwNotSerializableException("Can't serialize x10.lang.ResilientStorePlace0$MyLatch");
    }
    
    
};


} } 
#endif // X10_LANG_RESILIENTSTOREPLACE0__MYLATCH_H

namespace x10 { namespace lang { 
class ResilientStorePlace0__MyLatch;
} } 

#ifndef X10_LANG_RESILIENTSTOREPLACE0__MYLATCH_H_NODEPS
#define X10_LANG_RESILIENTSTOREPLACE0__MYLATCH_H_NODEPS
#ifndef X10_LANG_RESILIENTSTOREPLACE0__MYLATCH_H_GENERICS
#define X10_LANG_RESILIENTSTOREPLACE0__MYLATCH_H_GENERICS
#endif // X10_LANG_RESILIENTSTOREPLACE0__MYLATCH_H_GENERICS
#endif // __X10_LANG_RESILIENTSTOREPLACE0__MYLATCH_H_NODEPS
