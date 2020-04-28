#ifndef __HISTORYSCHED_H
#define __HISTORYSCHED_H

#include <x10rt.h>


#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
#define X10_LANG_LONG_H_NODEPS
#include <x10/lang/Long.h>
#undef X10_LANG_LONG_H_NODEPS
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
class chunk;
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace lang { 
class Math;
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
class HistorySched : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    x10_long FMGL(curPos);
    
    x10_long FMGL(remain);
    
    x10_long FMGL(Wmin);
    
    void _constructor();
    
    static ::HistorySched* _make();
    
    virtual ::chunk* scheduleHistory(x10_long nproc, x10_long t_proc, x10_long n,
                                     ::x10::lang::Rail< x10_long >* costArray);
    virtual ::HistorySched* HistorySched____this__HistorySched();
    virtual void __fieldInitializers_HistorySched();
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: virtual ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

#endif // HISTORYSCHED_H

class HistorySched;

#ifndef HISTORYSCHED_H_NODEPS
#define HISTORYSCHED_H_NODEPS
#ifndef HISTORYSCHED_H_GENERICS
#define HISTORYSCHED_H_GENERICS
#endif // HISTORYSCHED_H_GENERICS
#endif // __HISTORYSCHED_H_NODEPS
