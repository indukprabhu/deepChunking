#ifndef __HISTPROFILE_H
#define __HISTPROFILE_H

#include <x10rt.h>


#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
namespace x10 { namespace regionarray { 
template<class TPMGL(T)> class Array;
} } 
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
class String;
} } 
namespace x10 { namespace io { 
class File;
} } 
namespace x10 { namespace io { 
class FileReader;
} } 
namespace x10 { namespace regionarray { 
class Region;
} } 
namespace x10 { namespace lang { 
class LongRange;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace lang { 
class FailedDynamicCheckException;
} } 
namespace x10 { namespace lang { 
class Exception;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
class HistProfile : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    ::x10::regionarray::Array<x10_long>* FMGL(costHistArray);
    
    void _constructor();
    
    static ::HistProfile* _make();
    
    virtual ::x10::lang::Rail< x10_long >* populateArray(x10_long forId, x10_long n,
                                                         ::x10::lang::Rail< x10_long >* costArray);
    virtual ::HistProfile* HistProfile____this__HistProfile();
    virtual void __fieldInitializers_HistProfile();
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: virtual ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

#endif // HISTPROFILE_H

class HistProfile;

#ifndef HISTPROFILE_H_NODEPS
#define HISTPROFILE_H_NODEPS
#ifndef HISTPROFILE_H_GENERICS
#define HISTPROFILE_H_GENERICS
#endif // HISTPROFILE_H_GENERICS
#endif // __HISTPROFILE_H_NODEPS
