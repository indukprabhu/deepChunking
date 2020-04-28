#ifndef __X10_LANG_MULTIPLEEXCEPTIONS_H
#define __X10_LANG_MULTIPLEEXCEPTIONS_H

#include <x10rt.h>


#define X10_LANG_EXCEPTION_H_NODEPS
#include <x10/lang/Exception.h>
#undef X10_LANG_EXCEPTION_H_NODEPS
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class GrowableRail;
} } 
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace lang { 

class MultipleExceptions : public ::x10::lang::Exception   {
    public:
    RTT_H_DECLS_CLASS
    
    ::x10::lang::Rail< ::x10::lang::Exception* >* FMGL(exceptions);
    
    using ::x10::lang::CheckedThrowable::printStackTrace;
    
    ::x10::lang::Rail< ::x10::lang::Exception* >* exceptions();
    void _constructor(::x10::util::GrowableRail< ::x10::lang::Exception*>* es);
    
    static ::x10::lang::MultipleExceptions* _make(::x10::util::GrowableRail< ::x10::lang::Exception*>* es);
    
    void _constructor();
    
    static ::x10::lang::MultipleExceptions* _make();
    
    void _constructor(::x10::lang::Exception* t);
    
    static ::x10::lang::MultipleExceptions* _make(::x10::lang::Exception* t);
    
    virtual void printStackTrace();
    static ::x10::lang::MultipleExceptions* make(::x10::util::GrowableRail< ::x10::lang::Exception*>* es);
    static ::x10::lang::MultipleExceptions* make(::x10::lang::Exception* t);
    virtual ::x10::lang::MultipleExceptions* x10__lang__MultipleExceptions____this__x10__lang__MultipleExceptions(
      );
    virtual void __fieldInitializers_x10_lang_MultipleExceptions(
      );
    
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
#endif // X10_LANG_MULTIPLEEXCEPTIONS_H

namespace x10 { namespace lang { 
class MultipleExceptions;
} } 

#ifndef X10_LANG_MULTIPLEEXCEPTIONS_H_NODEPS
#define X10_LANG_MULTIPLEEXCEPTIONS_H_NODEPS
#ifndef X10_LANG_MULTIPLEEXCEPTIONS_H_GENERICS
#define X10_LANG_MULTIPLEEXCEPTIONS_H_GENERICS
#endif // X10_LANG_MULTIPLEEXCEPTIONS_H_GENERICS
#endif // __X10_LANG_MULTIPLEEXCEPTIONS_H_NODEPS
