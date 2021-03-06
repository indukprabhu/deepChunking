#ifndef __X10_UTIL_RANDOM_H
#define __X10_UTIL_RANDOM_H

#include <x10rt.h>


#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_INT_H_NODEPS
#include <x10/lang/Int.h>
#undef X10_LANG_INT_H_NODEPS
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace util { 
class Timer;
} } 
namespace x10 { namespace lang { 
class Unsafe;
} } 
namespace x10 { namespace compiler { 
class NonEscaping;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace util { 

class Random : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    static x10_long FMGL(N);
    static void FMGL(N__do_init)();
    static void FMGL(N__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(N__status);
    static ::x10::lang::CheckedThrowable* FMGL(N__exception);
    static x10_long FMGL(N__get)();
    
    static x10_long FMGL(M);
    static void FMGL(M__do_init)();
    static void FMGL(M__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(M__status);
    static ::x10::lang::CheckedThrowable* FMGL(M__exception);
    static x10_long FMGL(M__get)();
    
    x10_long FMGL(index);
    
    ::x10::lang::Rail< x10_int >* FMGL(mt);
    
    void _constructor();
    
    static ::x10::util::Random* _make();
    
    void _constructor(x10_long seed);
    
    static ::x10::util::Random* _make(x10_long seed);
    
    virtual void setSeed(x10_long seed);
    virtual x10_int nextInt();
    virtual x10_int nextInt(x10_int maxPlus1);
    virtual void nextBytes(::x10::lang::Rail< x10_byte >* buf);
    virtual x10_long nextLong();
    virtual x10_long nextLong(x10_long maxPlus1);
    virtual x10_boolean nextBoolean();
    virtual x10_float nextFloat();
    virtual x10_double nextDouble();
    virtual void init(x10_long seed);
    virtual x10_int random();
    void twist();
    virtual ::x10::util::Random* x10__util__Random____this__x10__util__Random(
      );
    virtual void __fieldInitializers_x10_util_Random();
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: virtual ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};


} } 
#endif // X10_UTIL_RANDOM_H

namespace x10 { namespace util { 
class Random;
} } 

#ifndef X10_UTIL_RANDOM_H_NODEPS
#define X10_UTIL_RANDOM_H_NODEPS
#ifndef X10_UTIL_RANDOM_H_GENERICS
#define X10_UTIL_RANDOM_H_GENERICS
inline x10_long x10::util::Random::FMGL(N__get)() {
    if (FMGL(N__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(N__init)();
    }
    return x10::util::Random::FMGL(N);
}

inline x10_long x10::util::Random::FMGL(M__get)() {
    if (FMGL(M__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(M__init)();
    }
    return x10::util::Random::FMGL(M);
}

#endif // X10_UTIL_RANDOM_H_GENERICS
#endif // __X10_UTIL_RANDOM_H_NODEPS
