#ifndef __X10_COMPILER_PRAGMA_H
#define __X10_COMPILER_PRAGMA_H

#include <x10rt.h>


#define X10_LANG_ANY_H_NODEPS
#include <x10/lang/Any.h>
#undef X10_LANG_ANY_H_NODEPS
#define X10_LANG_ANNOTATIONS_STATEMENTANNOTATION_H_NODEPS
#include <x10/lang/annotations/StatementAnnotation.h>
#undef X10_LANG_ANNOTATIONS_STATEMENTANNOTATION_H_NODEPS
#define X10_LANG_INT_H_NODEPS
#include <x10/lang/Int.h>
#undef X10_LANG_INT_H_NODEPS
#define X10_LANG_INT_H_NODEPS
#include <x10/lang/Int.h>
#undef X10_LANG_INT_H_NODEPS
namespace x10 { namespace compiler { 

class Pragma   {
    public:
    RTT_H_DECLS_INTERFACE
    
    x10_int FMGL(pragma);
    
    template <class Iface> struct itable {
        itable(x10_boolean (Iface::*equals) (::x10::lang::Any*), x10_int (Iface::*hashCode) (), ::x10::lang::String* (Iface::*toString) (), ::x10::lang::String* (Iface::*typeName) ()) : equals(equals), hashCode(hashCode), toString(toString), typeName(typeName) {}
        x10_boolean (Iface::*equals) (::x10::lang::Any*);
        x10_int (Iface::*hashCode) ();
        ::x10::lang::String* (Iface::*toString) ();
        ::x10::lang::String* (Iface::*typeName) ();
    };
    
    template <class R> static x10_boolean equals(R* _recv, ::x10::lang::Any* arg0) {
        ::x10::lang::Reference* _refRecv = reinterpret_cast< ::x10::lang::Reference*>(_recv);
        return (_refRecv->*(::x10aux::findITable< ::x10::compiler::Pragma>(_refRecv->_getITables())->equals))(arg0);
    }
    template <class R> static x10_boolean equals(R _recv, ::x10::lang::Any* arg0) {
        return _recv->equals(arg0);
    }
    template <class R> static x10_int hashCode(R* _recv) {
        ::x10::lang::Reference* _refRecv = reinterpret_cast< ::x10::lang::Reference*>(_recv);
        return (_refRecv->*(::x10aux::findITable< ::x10::compiler::Pragma>(_refRecv->_getITables())->hashCode))();
    }
    template <class R> static x10_int hashCode(R _recv) {
        return _recv->hashCode();
    }
    template <class R> static ::x10::lang::String* toString(R* _recv) {
        ::x10::lang::Reference* _refRecv = reinterpret_cast< ::x10::lang::Reference*>(_recv);
        return (_refRecv->*(::x10aux::findITable< ::x10::compiler::Pragma>(_refRecv->_getITables())->toString))();
    }
    template <class R> static ::x10::lang::String* toString(R _recv) {
        return _recv->toString();
    }
    template <class R> static ::x10::lang::String* typeName(R* _recv) {
        ::x10::lang::Reference* _refRecv = reinterpret_cast< ::x10::lang::Reference*>(_recv);
        return (_refRecv->*(::x10aux::findITable< ::x10::compiler::Pragma>(_refRecv->_getITables())->typeName))();
    }
    template <class R> static ::x10::lang::String* typeName(R _recv) {
        return _recv->typeName();
    }
    static x10_int FMGL(FINISH_ASYNC);
    static void FMGL(FINISH_ASYNC__do_init)();
    static void FMGL(FINISH_ASYNC__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(FINISH_ASYNC__status);
    static ::x10::lang::CheckedThrowable* FMGL(FINISH_ASYNC__exception);
    static x10_int FMGL(FINISH_ASYNC__get)();
    
    static x10_int FMGL(FINISH_HERE);
    static void FMGL(FINISH_HERE__do_init)();
    static void FMGL(FINISH_HERE__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(FINISH_HERE__status);
    static ::x10::lang::CheckedThrowable* FMGL(FINISH_HERE__exception);
    static x10_int FMGL(FINISH_HERE__get)();
    
    static x10_int FMGL(FINISH_SPMD);
    static void FMGL(FINISH_SPMD__do_init)();
    static void FMGL(FINISH_SPMD__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(FINISH_SPMD__status);
    static ::x10::lang::CheckedThrowable* FMGL(FINISH_SPMD__exception);
    static x10_int FMGL(FINISH_SPMD__get)();
    
    static x10_int FMGL(FINISH_LOCAL);
    static void FMGL(FINISH_LOCAL__do_init)();
    static void FMGL(FINISH_LOCAL__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(FINISH_LOCAL__status);
    static ::x10::lang::CheckedThrowable* FMGL(FINISH_LOCAL__exception);
    static x10_int FMGL(FINISH_LOCAL__get)();
    
    static x10_int FMGL(FINISH_DENSE);
    static void FMGL(FINISH_DENSE__do_init)();
    static void FMGL(FINISH_DENSE__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(FINISH_DENSE__status);
    static ::x10::lang::CheckedThrowable* FMGL(FINISH_DENSE__exception);
    static x10_int FMGL(FINISH_DENSE__get)();
    
    static x10_int FMGL(FINISH_ASYNC_AND_BACK);
    static void FMGL(FINISH_ASYNC_AND_BACK__do_init)();
    static void FMGL(FINISH_ASYNC_AND_BACK__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(FINISH_ASYNC_AND_BACK__status);
    static ::x10::lang::CheckedThrowable* FMGL(FINISH_ASYNC_AND_BACK__exception);
    static x10_int FMGL(FINISH_ASYNC_AND_BACK__get)();
    
    static x10_int FMGL(FINISH_ATEACH_UNIQUE);
    static void FMGL(FINISH_ATEACH_UNIQUE__do_init)();
    static void FMGL(FINISH_ATEACH_UNIQUE__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(FINISH_ATEACH_UNIQUE__status);
    static ::x10::lang::CheckedThrowable* FMGL(FINISH_ATEACH_UNIQUE__exception);
    static x10_int FMGL(FINISH_ATEACH_UNIQUE__get)();
    
    static x10_int FMGL(FINISH_RESILIENT_PLACE_ZERO);
    static void FMGL(FINISH_RESILIENT_PLACE_ZERO__do_init)();
    static void FMGL(FINISH_RESILIENT_PLACE_ZERO__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(FINISH_RESILIENT_PLACE_ZERO__status);
    static ::x10::lang::CheckedThrowable* FMGL(FINISH_RESILIENT_PLACE_ZERO__exception);
    static x10_int FMGL(FINISH_RESILIENT_PLACE_ZERO__get)();
    
    static x10_int FMGL(FINISH_RESILIENT_ZOO_KEEPER);
    static void FMGL(FINISH_RESILIENT_ZOO_KEEPER__do_init)();
    static void FMGL(FINISH_RESILIENT_ZOO_KEEPER__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(FINISH_RESILIENT_ZOO_KEEPER__status);
    static ::x10::lang::CheckedThrowable* FMGL(FINISH_RESILIENT_ZOO_KEEPER__exception);
    static x10_int FMGL(FINISH_RESILIENT_ZOO_KEEPER__get)();
    
    static x10_int FMGL(FINISH_RESILIENT_DISTRIBUTED);
    static void FMGL(FINISH_RESILIENT_DISTRIBUTED__do_init)();
    static void FMGL(FINISH_RESILIENT_DISTRIBUTED__init)();
    static volatile ::x10aux::StaticInitController::status FMGL(FINISH_RESILIENT_DISTRIBUTED__status);
    static ::x10::lang::CheckedThrowable* FMGL(FINISH_RESILIENT_DISTRIBUTED__exception);
    static x10_int FMGL(FINISH_RESILIENT_DISTRIBUTED__get)();
    
    
};


} } 
#endif // X10_COMPILER_PRAGMA_H

namespace x10 { namespace compiler { 
class Pragma;
} } 

#ifndef X10_COMPILER_PRAGMA_H_NODEPS
#define X10_COMPILER_PRAGMA_H_NODEPS
#include <x10/lang/Any.h>
#include <x10/lang/annotations/StatementAnnotation.h>
#include <x10/lang/Int.h>
#ifndef X10_COMPILER_PRAGMA_H_GENERICS
#define X10_COMPILER_PRAGMA_H_GENERICS
inline x10_int x10::compiler::Pragma::FMGL(FINISH_ASYNC__get)() {
    if (FMGL(FINISH_ASYNC__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(FINISH_ASYNC__init)();
    }
    return x10::compiler::Pragma::FMGL(FINISH_ASYNC);
}

inline x10_int x10::compiler::Pragma::FMGL(FINISH_HERE__get)() {
    if (FMGL(FINISH_HERE__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(FINISH_HERE__init)();
    }
    return x10::compiler::Pragma::FMGL(FINISH_HERE);
}

inline x10_int x10::compiler::Pragma::FMGL(FINISH_SPMD__get)() {
    if (FMGL(FINISH_SPMD__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(FINISH_SPMD__init)();
    }
    return x10::compiler::Pragma::FMGL(FINISH_SPMD);
}

inline x10_int x10::compiler::Pragma::FMGL(FINISH_LOCAL__get)() {
    if (FMGL(FINISH_LOCAL__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(FINISH_LOCAL__init)();
    }
    return x10::compiler::Pragma::FMGL(FINISH_LOCAL);
}

inline x10_int x10::compiler::Pragma::FMGL(FINISH_DENSE__get)() {
    if (FMGL(FINISH_DENSE__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(FINISH_DENSE__init)();
    }
    return x10::compiler::Pragma::FMGL(FINISH_DENSE);
}

inline x10_int x10::compiler::Pragma::FMGL(FINISH_ASYNC_AND_BACK__get)() {
    if (FMGL(FINISH_ASYNC_AND_BACK__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(FINISH_ASYNC_AND_BACK__init)();
    }
    return x10::compiler::Pragma::FMGL(FINISH_ASYNC_AND_BACK);
}

inline x10_int x10::compiler::Pragma::FMGL(FINISH_ATEACH_UNIQUE__get)() {
    if (FMGL(FINISH_ATEACH_UNIQUE__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(FINISH_ATEACH_UNIQUE__init)();
    }
    return x10::compiler::Pragma::FMGL(FINISH_ATEACH_UNIQUE);
}

inline x10_int x10::compiler::Pragma::FMGL(FINISH_RESILIENT_PLACE_ZERO__get)() {
    if (FMGL(FINISH_RESILIENT_PLACE_ZERO__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(FINISH_RESILIENT_PLACE_ZERO__init)();
    }
    return x10::compiler::Pragma::FMGL(FINISH_RESILIENT_PLACE_ZERO);
}

inline x10_int x10::compiler::Pragma::FMGL(FINISH_RESILIENT_ZOO_KEEPER__get)() {
    if (FMGL(FINISH_RESILIENT_ZOO_KEEPER__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(FINISH_RESILIENT_ZOO_KEEPER__init)();
    }
    return x10::compiler::Pragma::FMGL(FINISH_RESILIENT_ZOO_KEEPER);
}

inline x10_int x10::compiler::Pragma::FMGL(FINISH_RESILIENT_DISTRIBUTED__get)() {
    if (FMGL(FINISH_RESILIENT_DISTRIBUTED__status) != ::x10aux::StaticInitController::INITIALIZED) {
        FMGL(FINISH_RESILIENT_DISTRIBUTED__init)();
    }
    return x10::compiler::Pragma::FMGL(FINISH_RESILIENT_DISTRIBUTED);
}

#endif // X10_COMPILER_PRAGMA_H_GENERICS
#endif // __X10_COMPILER_PRAGMA_H_NODEPS
