#ifndef __CHUNK_H
#define __CHUNK_H

#include <x10rt.h>


#define X10_LANG_BOOLEAN_H_NODEPS
#include <x10/lang/Boolean.h>
#undef X10_LANG_BOOLEAN_H_NODEPS
#define X10_LANG_BOOLEAN_H_NODEPS
#include <x10/lang/Boolean.h>
#undef X10_LANG_BOOLEAN_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
namespace x10 { namespace compiler { 
class Synthetic;
} } 
class chunk : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    x10_boolean FMGL(isfull);
    
    x10_long FMGL(mytotalcost);
    
    x10_long FMGL(myChunkStart);
    
    x10_long FMGL(myChunkEnd);
    
    virtual ::chunk* chunk____this__chunk();
    void _constructor();
    
    static ::chunk* _make();
    
    virtual void __fieldInitializers_chunk();
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: virtual ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

#endif // CHUNK_H

class chunk;

#ifndef CHUNK_H_NODEPS
#define CHUNK_H_NODEPS
#ifndef CHUNK_H_GENERICS
#define CHUNK_H_GENERICS
#endif // CHUNK_H_GENERICS
#endif // __CHUNK_H_NODEPS
