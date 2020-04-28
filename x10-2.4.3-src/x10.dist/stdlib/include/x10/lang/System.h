#ifndef __X10_LANG_SYSTEM_H
#define __X10_LANG_SYSTEM_H

#include <x10rt.h>

#include "x10/lang/RuntimeNatives.h"

namespace x10 { namespace util { 
class Timer;
} } 
namespace x10 { namespace compiler { 
class Native;
} } 
namespace x10 { namespace lang { 
class Runtime;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace util { 
template<class TPMGL(K), class TPMGL(V)> class Map;
} } 
namespace x10 { namespace lang { 
class String;
} } 
namespace x10 { namespace util { 
template<class TPMGL(K), class TPMGL(V)> class HashMap;
} } 
namespace x10 { namespace lang { 
class Any;
} } 
namespace x10 { namespace lang { 
class Runtime__Pool;
} } 
namespace x10 { namespace lang { 
class Thread;
} } 
namespace x10 { namespace lang { 
class InterruptedException;
} } 
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace x10 { namespace compiler { 
class NativeCPPInclude;
} } 
namespace x10 { namespace lang { 

class System : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    void _constructor();
    
    static ::x10::lang::System* _make();
    
    static x10_long currentTimeMillis();
    static x10_long nanoTime();
    static void setExitCode(x10_int exitCode);
    static ::x10::util::Map< ::x10::lang::String*, ::x10::lang::String*>*
      getenv();
    static ::x10::lang::String* getenv(::x10::lang::String* name);
    static ::x10::lang::String* identityToString(::x10::lang::Any* o);
    static x10_boolean identityEquals(::x10::lang::Any* o1, ::x10::lang::Any* o2);
    static x10_boolean sleep(x10_long millis);
    static x10_boolean threadSleep(x10_long millis);
    virtual ::x10::lang::System* x10__lang__System____this__x10__lang__System(
      );
    virtual void __fieldInitializers_x10_lang_System();
    
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
#endif // X10_LANG_SYSTEM_H

namespace x10 { namespace lang { 
class System;
} } 

#ifndef X10_LANG_SYSTEM_H_NODEPS
#define X10_LANG_SYSTEM_H_NODEPS
#include <x10/lang/Long.h>
#include <x10/util/Timer.h>
#include <x10/compiler/Native.h>
#include <x10/lang/Int.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Place.h>
#include <x10/util/Map.h>
#include <x10/lang/String.h>
#include <x10/util/HashMap.h>
#include <x10/lang/Any.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Runtime__Pool.h>
#include <x10/lang/Thread.h>
#include <x10/lang/InterruptedException.h>
#include <x10/compiler/Synthetic.h>
#include <x10/compiler/NativeCPPInclude.h>
#ifndef X10_LANG_SYSTEM_H_GENERICS
#define X10_LANG_SYSTEM_H_GENERICS
#endif // X10_LANG_SYSTEM_H_GENERICS
#endif // __X10_LANG_SYSTEM_H_NODEPS
