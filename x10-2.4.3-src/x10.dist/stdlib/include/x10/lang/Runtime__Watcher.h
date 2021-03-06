#ifndef __X10_LANG_RUNTIME__WATCHER_H
#define __X10_LANG_RUNTIME__WATCHER_H

#include <x10rt.h>


#define X10_UTIL_CONCURRENT_CONDITION_H_NODEPS
#include <x10/util/concurrent/Condition.h>
#undef X10_UTIL_CONCURRENT_CONDITION_H_NODEPS
#define X10_IO_UNSERIALIZABLE_H_NODEPS
#include <x10/io/Unserializable.h>
#undef X10_IO_UNSERIALIZABLE_H_NODEPS
namespace x10 { namespace lang { 
class MultipleExceptions;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 

class Runtime__Watcher : public ::x10::util::concurrent::Condition   {
    public:
    RTT_H_DECLS_CLASS
    
    static ::x10aux::itable_entry _itables[3];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static ::x10::io::Unserializable::itable< ::x10::lang::Runtime__Watcher > _itable_0;
    
    static ::x10::lang::Any::itable< ::x10::lang::Runtime__Watcher > _itable_1;
    
    ::x10::lang::MultipleExceptions* FMGL(t);
    
    virtual void raise(::x10::lang::MultipleExceptions* t);
    virtual void await();
    virtual void cancel();
    virtual ::x10::lang::Runtime__Watcher* x10__lang__Runtime__Watcher____this__x10__lang__Runtime__Watcher(
      );
    void _constructor();
    
    static ::x10::lang::Runtime__Watcher* _make();
    
    virtual void __fieldInitializers_x10_lang_Runtime_Watcher();
    
    // Serialization
    virtual void _serialize_body(::x10aux::serialization_buffer& buf) {
        ::x10aux::throwNotSerializableException("Can't serialize x10.lang.Runtime$Watcher");
    }
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        ::x10aux::throwNotSerializableException("Can't serialize x10.lang.Runtime$Watcher");
    }
    
    
};


} } 
#endif // X10_LANG_RUNTIME__WATCHER_H

namespace x10 { namespace lang { 
class Runtime__Watcher;
} } 

#ifndef X10_LANG_RUNTIME__WATCHER_H_NODEPS
#define X10_LANG_RUNTIME__WATCHER_H_NODEPS
#ifndef X10_LANG_RUNTIME__WATCHER_H_GENERICS
#define X10_LANG_RUNTIME__WATCHER_H_GENERICS
#endif // X10_LANG_RUNTIME__WATCHER_H_GENERICS
#endif // __X10_LANG_RUNTIME__WATCHER_H_NODEPS
