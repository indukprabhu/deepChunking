#ifndef __WRITETOHISTORYFILE_H
#define __WRITETOHISTORYFILE_H

#include <x10rt.h>


namespace x10 { namespace util { 
template<class TPMGL(T)> class ArrayList;
} } 
namespace x10 { namespace lang { 
class String;
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
namespace x10 { namespace io { 
class File;
} } 
namespace x10 { namespace io { 
class FileWriter;
} } 
namespace x10 { namespace lang { 
class Char;
} } 
namespace x10 { namespace io { 
class Writer;
} } 
namespace x10 { namespace io { 
class OutputStreamWriter;
} } 
namespace x10 { namespace lang { 
class Exception;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
class WriteToHistoryFile : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    ::x10::util::ArrayList< ::x10::lang::String*>* FMGL(timerDone);
    
    void _constructor();
    
    static ::WriteToHistoryFile* _make();
    
    virtual void writeToFile(::x10::lang::String* timer, x10_double time,
                             x10_boolean flush, x10_boolean itPresent, x10_long itIndex,
                             x10_long forIndex);
    virtual ::WriteToHistoryFile* WriteToHistoryFile____this__WriteToHistoryFile(
      );
    virtual void __fieldInitializers_WriteToHistoryFile();
    
    // Serialization
    public: static const ::x10aux::serialization_id_t _serialization_id;
    
    public: virtual ::x10aux::serialization_id_t _get_serialization_id() {
         return _serialization_id;
    }
    
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: static ::x10::lang::Reference* _deserializer(::x10aux::deserialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};

#endif // WRITETOHISTORYFILE_H

class WriteToHistoryFile;

#ifndef WRITETOHISTORYFILE_H_NODEPS
#define WRITETOHISTORYFILE_H_NODEPS
#ifndef WRITETOHISTORYFILE_H_GENERICS
#define WRITETOHISTORYFILE_H_GENERICS
#endif // WRITETOHISTORYFILE_H_GENERICS
#endif // __WRITETOHISTORYFILE_H_NODEPS
