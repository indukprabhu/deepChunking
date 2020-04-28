#ifndef __HARNESS_X10TEST_H
#define __HARNESS_X10TEST_H

#include <x10rt.h>


namespace x10 { namespace compiler { 
class WS;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Cell;
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
namespace x10 { namespace lang { 
class VoidFun_0_0;
} } 
namespace x10 { namespace lang { 
class Error;
} } 
namespace x10 { namespace lang { 
class Exception;
} } 
namespace x10 { namespace compiler { 
class AsyncClosure;
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
class String;
} } 
namespace x10 { namespace util { 
template<class TPMGL(K), class TPMGL(V)> class Map;
} } 
namespace x10 { namespace lang { 
class System;
} } 
namespace x10 { namespace lang { 
class Char;
} } 
namespace x10 { namespace io { 
class File;
} } 
namespace x10 { namespace lang { 
template<class TPMGL(T)> class Rail;
} } 
namespace x10 { namespace util { 
class StringBuilder;
} } 
namespace x10 { namespace lang { 
class Place;
} } 
namespace x10 { namespace lang { 
class Runtime__Profile;
} } 
namespace harness { 
class x10Test__TestException;
} 
namespace x10 { namespace util { 
class Random;
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
namespace x10 { namespace compiler { 
class Synthetic;
} } 
namespace harness { 

class x10Test : public ::x10::lang::X10Class   {
    public:
    RTT_H_DECLS_CLASS
    
    virtual x10_boolean run() = 0;
    virtual void executeAsync();
    virtual void execute();
    static ::x10::lang::String* pathCombine(::x10::lang::String* prefix, ::x10::lang::String* file);
    static ::x10::lang::String* pathCombine(::x10::lang::Rail< ::x10::lang::String* >* prefix,
                                            ::x10::lang::String* file);
    static ::x10::lang::String* FMGL(PREFIX);
    static void FMGL(PREFIX__do_init)();
    static void FMGL(PREFIX__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(PREFIX__status);
    static ::x10::lang::CheckedThrowable* FMGL(PREFIX__exception);
    static ::x10::lang::String* FMGL(PREFIX__get)();
    
    static void success();
    static void failure();
    static void reportResult(x10_boolean b);
    static void chk(x10_boolean b);
    static void chk(x10_boolean b, ::x10::lang::String* s);
    ::x10::util::Random* FMGL(myRand);
    
    virtual x10_int ranInt(x10_int lb, x10_int ub);
    static void println(::x10::lang::String* s);
    virtual ::harness::x10Test* harness__x10Test____this__harness__x10Test(
      );
    void _constructor();
    
    virtual void __fieldInitializers_harness_x10Test();
    
    // Serialization
    public: virtual void _serialize_body(::x10aux::serialization_buffer& buf);
    
    public: void _deserialize_body(::x10aux::deserialization_buffer& buf);
    
};


} 
#endif // HARNESS_X10TEST_H

namespace harness { 
class x10Test;
} 

#ifndef HARNESS_X10TEST_H_NODEPS
#define HARNESS_X10TEST_H_NODEPS
#include <x10/lang/Boolean.h>
#include <x10/compiler/WS.h>
#include <x10/lang/Cell.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/FinishState.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Error.h>
#include <x10/lang/Exception.h>
#include <x10/compiler/AsyncClosure.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/lang/String.h>
#include <x10/util/Map.h>
#include <x10/lang/System.h>
#include <x10/lang/Char.h>
#include <x10/io/File.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Long.h>
#include <x10/util/StringBuilder.h>
#include <x10/lang/Place.h>
#include <x10/lang/Int.h>
#include <x10/lang/Runtime__Profile.h>
#include <harness/x10Test__TestException.h>
#include <x10/util/Random.h>
#include <x10/io/Printer.h>
#include <x10/io/Console.h>
#include <x10/lang/Any.h>
#include <x10/compiler/Synthetic.h>
#ifndef HARNESS_X10TEST_H_GENERICS
#define HARNESS_X10TEST_H_GENERICS
inline ::x10::lang::String* harness::x10Test::FMGL(PREFIX__get)() {
    if (FMGL(PREFIX__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(PREFIX__init)();
    }
    return harness::x10Test::FMGL(PREFIX);
}

#endif // HARNESS_X10TEST_H_GENERICS
#endif // __HARNESS_X10TEST_H_NODEPS
