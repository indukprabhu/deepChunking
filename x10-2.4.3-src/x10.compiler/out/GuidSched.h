#ifndef __GUIDSCHED_H
#define __GUIDSCHED_H

#include <x10rt.h>


#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
class chunk;
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace compiler { 
class Finalization;
} } 
namespace x10 { namespace compiler { 
class Abort;
} } 
namespace x10 { namespace compiler { 
class CompilerFlags;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
class GuidSched : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    x10_long FMGL(curPos);
    
    void _constructor();
    
    static ::GuidSched* _make();
    
    virtual ::chunk* scheduleGuided(x10_long nproc, x10_long t_proc, x10_long n);
    virtual ::GuidSched* GuidSched____this__GuidSched();
    virtual void __fieldInitializers_GuidSched();
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: virtual ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

#endif // GUIDSCHED_H

class GuidSched;

#ifndef GUIDSCHED_H_NODEPS
#define GUIDSCHED_H_NODEPS
#ifndef GUIDSCHED_H_GENERICS
#define GUIDSCHED_H_GENERICS
#endif // GUIDSCHED_H_GENERICS
#endif // __GUIDSCHED_H_NODEPS
