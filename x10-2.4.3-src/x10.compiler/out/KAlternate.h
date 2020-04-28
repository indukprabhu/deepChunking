#ifndef __KALTERNATE_H
#define __KALTERNATE_H

#include <x10rt.h>


#define X10_LANG_DOUBLE_H_NODEPS
#include <x10/lang/Double.h>
#undef X10_LANG_DOUBLE_H_NODEPS
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
class HistProfile;
namespace x10 { namespace io { 
class Printer;
} } 
namespace x10 { namespace io { 
class Console;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace lang { 
class FinishState;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
class WriteToHistoryFile;
namespace x10 { namespace lang { 
class Exception;
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
namespace x10 { namespace lang { 
class System;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
class KAlternate : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    ::x10::lang::Rail< x10_double >* FMGL(A);
    
    ::x10::lang::Rail< x10_double >* FMGL(B);
    
    ::x10::lang::Rail< x10_double >* FMGL(C);
    
    ::HistProfile* FMGL(histObj);
    
    void _constructor(x10_long size);
    
    static ::KAlternate* _make(x10_long size);
    
    virtual void matgen(x10_long size);
    virtual void calc(x10_long size, x10_long k1, x10_long k2, x10_long scale);
    virtual x10_double floatOperations(x10_double b, x10_double c, x10_long n);
    static void main(::x10::lang::Rail< ::x10::lang::String* >* args);
    virtual ::KAlternate* KAlternate____this__KAlternate();
    virtual void __fieldInitializers_KAlternate();
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: virtual ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

#endif // KALTERNATE_H

class KAlternate;

#ifndef KALTERNATE_H_NODEPS
#define KALTERNATE_H_NODEPS
#ifndef KALTERNATE_H_GENERICS
#define KALTERNATE_H_GENERICS
#endif // KALTERNATE_H_GENERICS
#endif // __KALTERNATE_H_NODEPS
