#ifndef __HARNESS_X10TEST__TESTEXCEPTION_H
#define __HARNESS_X10TEST__TESTEXCEPTION_H

#include <x10rt.h>


#define X10_LANG_EXCEPTION_H_NODEPS
#include <x10/lang/Exception.h>
#undef X10_LANG_EXCEPTION_H_NODEPS
namespace x10 { namespace lang { 
class CheckedThrowable;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace harness { 

class x10Test__TestException : public ::x10::lang::Exception   {
    public:
    RTT_H_DECLS_CLASS
    
    void _constructor();
    
    static ::harness::x10Test__TestException* _make();
    
    void _constructor(::x10::lang::CheckedThrowable* cause);
    
    static ::harness::x10Test__TestException* _make(::x10::lang::CheckedThrowable* cause);
    
    void _constructor(::x10::lang::String* message);
    
    static ::harness::x10Test__TestException* _make(::x10::lang::String* message);
    
    void _constructor(::x10::lang::String* message, ::x10::lang::CheckedThrowable* cause);
    
    static ::harness::x10Test__TestException* _make(::x10::lang::String* message,
                                                    ::x10::lang::CheckedThrowable* cause);
    
    virtual ::harness::x10Test__TestException* harness__x10Test__TestException____this__harness__x10Test__TestException(
      );
    virtual void __fieldInitializers_harness_x10Test_TestException(
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


} 
#endif // HARNESS_X10TEST__TESTEXCEPTION_H

namespace harness { 
class x10Test__TestException;
} 

#ifndef HARNESS_X10TEST__TESTEXCEPTION_H_NODEPS
#define HARNESS_X10TEST__TESTEXCEPTION_H_NODEPS
#ifndef HARNESS_X10TEST__TESTEXCEPTION_H_GENERICS
#define HARNESS_X10TEST__TESTEXCEPTION_H_GENERICS
#endif // HARNESS_X10TEST__TESTEXCEPTION_H_GENERICS
#endif // __HARNESS_X10TEST__TESTEXCEPTION_H_NODEPS
