#ifndef __WORKDIVIDER_H
#define __WORKDIVIDER_H

#include <x10rt.h>


namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
class chunk;
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
class WorkDivider : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    static ::chunk* divideWork(x10_long nproc, x10_long t_proc, x10_long n,
                               x10_long blockSize, ::x10::lang::Rail< x10_long >* costArray,
                               ::x10::lang::Rail< x10_long >* partialCostArr);
    virtual ::WorkDivider* WorkDivider____this__WorkDivider();
    void _constructor();
    
    static ::WorkDivider* _make();
    
    virtual void __fieldInitializers_WorkDivider();
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: virtual ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

#endif // WORKDIVIDER_H

class WorkDivider;

#ifndef WORKDIVIDER_H_NODEPS
#define WORKDIVIDER_H_NODEPS
#ifndef WORKDIVIDER_H_GENERICS
#define WORKDIVIDER_H_GENERICS
#endif // WORKDIVIDER_H_GENERICS
#endif // __WORKDIVIDER_H_NODEPS
