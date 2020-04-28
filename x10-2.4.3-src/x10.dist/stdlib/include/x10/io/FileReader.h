#ifndef __X10_IO_FILEREADER_H
#define __X10_IO_FILEREADER_H

#include <x10rt.h>


#define X10_IO_INPUTSTREAMREADER_H_NODEPS
#include <x10/io/InputStreamReader.h>
#undef X10_IO_INPUTSTREAMREADER_H_NODEPS
#define X10_IO_UNSERIALIZABLE_H_NODEPS
#include <x10/io/Unserializable.h>
#undef X10_IO_UNSERIALIZABLE_H_NODEPS
#define X10_LANG_BYTE_H_NODEPS
#include <x10/lang/Byte.h>
#undef X10_LANG_BYTE_H_NODEPS
namespace x10 { namespace io { 
class File;
} } 
namespace x10 { namespace util { 
template<class TPMGL(T)> class GrowableRail;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace lang { 
class Char;
} } 
namespace x10 { namespace io { 
class IOException;
} } 
namespace x10 { namespace lang { 
class Unsafe;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace compiler { 
class Native;
} } 
namespace x10 { namespace io { 
class FileReader__FRLM;
} } 
namespace x10 { namespace io { 
template<class TPMGL(T)> class ReaderIterator;
} } 
namespace x10 { namespace io { 
template<class TPMGL(T)> class Marshal;
} } 
namespace x10 { namespace io { 
class Reader;
} } 
namespace x10 { namespace lang { 
class Zero;
} } 
namespace x10 { namespace io { 
class InputStreamReader__InputStream;
} } 
namespace x10 { namespace io { 
class FileReader__FileInputStream;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace io { 

class FileReader : public ::x10::io::InputStreamReader   {
    public:
    RTT_H_DECLS_CLASS
    
    static ::x10aux::itable_entry _itables[3];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    static ::x10::io::Unserializable::itable< ::x10::io::FileReader > _itable_0;
    
    static ::x10::lang::Any::itable< ::x10::io::FileReader > _itable_1;
    
    ::x10::io::File* FMGL(file);
    
    ::x10::util::GrowableRail<x10_byte>* FMGL(buf);
    
    virtual ::x10::lang::String* readLine();
    static ::x10::io::FileReader__FRLM* FMGL(M);
    static void FMGL(M__do_init)();
    static void FMGL(M__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(M__status);
    static ::x10::lang::CheckedThrowable* FMGL(M__exception);
    static ::x10::io::FileReader__FRLM* FMGL(M__get)();
    
    virtual ::x10::io::ReaderIterator< ::x10::lang::String*>* lines();
    void _constructor(::x10::io::File* file);
    
    static ::x10::io::FileReader* _make(::x10::io::File* file);
    
    virtual ::x10::io::FileReader* x10__io__FileReader____this__x10__io__FileReader(
      );
    virtual void __fieldInitializers_x10_io_FileReader();
    
    // Serialization
    virtual void _serialize_body(::x10aux::serialization_buffer& buf) {
        ::x10aux::throwNotSerializableException("Can't serialize x10.io.FileReader");
    }
    
    virtual ::x10aux::serialization_id_t _get_serialization_id() {
        ::x10aux::throwNotSerializableException("Can't serialize x10.io.FileReader");
    }
    
    
};


} } 
#endif // X10_IO_FILEREADER_H

namespace x10 { namespace io { 
class FileReader;
} } 

#ifndef X10_IO_FILEREADER_H_NODEPS
#define X10_IO_FILEREADER_H_NODEPS
#include <x10/io/InputStreamReader.h>
#include <x10/io/Unserializable.h>
#include <x10/lang/Byte.h>
#include <x10/io/File.h>
#include <x10/util/GrowableRail.h>
#include <x10/lang/String.h>
#include <x10/lang/Char.h>
#include <x10/io/IOException.h>
#include <x10/lang/Long.h>
#include <x10/lang/Unsafe.h>
#include <x10/lang/Rail.h>
#include <x10/compiler/Native.h>
#include <x10/io/FileReader__FRLM.h>
#include <x10/io/ReaderIterator.h>
#include <x10/io/Marshal.h>
#include <x10/io/Reader.h>
#include <x10/lang/Zero.h>
#include <x10/io/InputStreamReader__InputStream.h>
#include <x10/io/FileReader__FileInputStream.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_IO_FILEREADER_H_GENERICS
#define X10_IO_FILEREADER_H_GENERICS
inline ::x10::io::FileReader__FRLM* x10::io::FileReader::FMGL(M__get)() {
    if (FMGL(M__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(M__init)();
    }
    return x10::io::FileReader::FMGL(M);
}

#endif // X10_IO_FILEREADER_H_GENERICS
#endif // __X10_IO_FILEREADER_H_NODEPS
