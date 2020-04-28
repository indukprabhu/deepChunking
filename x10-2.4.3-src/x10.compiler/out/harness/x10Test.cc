/*************************************************/
/* START of x10Test */
#include <harness/x10Test.h>

#ifndef HARNESS_X10TEST__CLOSURE__1_CLOSURE
#define HARNESS_X10TEST__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class harness_x10Test__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<harness_x10Test__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            b->x10::lang::Cell<x10_boolean>::__apply(saved_this->run());
        }
        catch (::x10::lang::CheckedThrowable* __exc40) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc40)) {
                ::x10::lang::Error* __lowerer__var__0__ = static_cast< ::x10::lang::Error*>(__exc40);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc40);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::Cell<x10_boolean>* b;
    ::harness::x10Test* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->b);
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        harness_x10Test__closure__1* storage = ::x10aux::alloc_z<harness_x10Test__closure__1>();
        buf.record_reference(storage);
        ::x10::lang::Cell<x10_boolean>* that_b = buf.read< ::x10::lang::Cell<x10_boolean>*>();
        ::harness::x10Test* that_saved_this = buf.read< ::harness::x10Test*>();
        harness_x10Test__closure__1* this_ = new (storage) harness_x10Test__closure__1(that_b, that_saved_this);
        return this_;
    }
    
    harness_x10Test__closure__1(::x10::lang::Cell<x10_boolean>* b, ::harness::x10Test* saved_this) : b(b), saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10:35";
    }

};

#endif // HARNESS_X10TEST__CLOSURE__1_CLOSURE
#ifndef HARNESS_X10TEST__CLOSURE__2_CLOSURE
#define HARNESS_X10TEST__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class harness_x10Test__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<harness_x10Test__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 83 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
            (::x10aux::exitCode = (((x10_int)0)));
        }
        catch (::x10::lang::CheckedThrowable* __exc52) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc52);
                {
                    x10_int __lowerer__var__1__ = ::x10aux::class_cast_unchecked<x10_int>(::x10::lang::Runtime::wrapAtChecked< x10_int >(
                                                                                            __lowerer__var__0__));
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        harness_x10Test__closure__2* storage = ::x10aux::alloc_z<harness_x10Test__closure__2>();
        buf.record_reference(storage);
        harness_x10Test__closure__2* this_ = new (storage) harness_x10Test__closure__2();
        return this_;
    }
    
    harness_x10Test__closure__2() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10:83";
    }

};

#endif // HARNESS_X10TEST__CLOSURE__2_CLOSURE
#ifndef HARNESS_X10TEST__CLOSURE__3_CLOSURE
#define HARNESS_X10TEST__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class harness_x10Test__closure__3 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<harness_x10Test__closure__3> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 89 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
            (::x10aux::exitCode = (((x10_int)1)));
        }
        catch (::x10::lang::CheckedThrowable* __exc54) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc54);
                {
                    x10_int __lowerer__var__1__ = ::x10aux::class_cast_unchecked<x10_int>(::x10::lang::Runtime::wrapAtChecked< x10_int >(
                                                                                            __lowerer__var__0__));
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        harness_x10Test__closure__3* storage = ::x10aux::alloc_z<harness_x10Test__closure__3>();
        buf.record_reference(storage);
        harness_x10Test__closure__3* this_ = new (storage) harness_x10Test__closure__3();
        return this_;
    }
    
    harness_x10Test__closure__3() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10:89";
    }

};

#endif // HARNESS_X10TEST__CLOSURE__3_CLOSURE

//#line 30 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"

//#line 32 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
void harness::x10Test::executeAsync() {
    
    //#line 33 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
    ::x10::lang::Cell<x10_boolean>* b = ::x10::lang::Cell<x10_boolean>::_make(false);
    
    //#line 34 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
    try {
        {
            
            //#line 35 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var1 = ::x10::lang::Runtime::startFinish();
            {
                ::x10::lang::CheckedThrowable* throwable__5505 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            ::x10::lang::Runtime::runAsync(reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(harness_x10Test__closure__1)))harness_x10Test__closure__1(b, this))));
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc41) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc41);
                            {
                                ::x10::lang::Runtime::pushException(__lowerer__var__0__);
                                ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make()));
                            }
                        } else
                        throw;
                    }
                    ::x10::compiler::Finalization::plausibleThrow();
                }
                catch (::x10::lang::CheckedThrowable* __exc42) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__5506 = static_cast< ::x10::lang::CheckedThrowable*>(__exc42);
                        {
                            throwable__5505 = formal__5506;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__5505))) {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__5505))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__5505));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var1);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__5505)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__5505)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__5505));
                    }
                    
                }
                
            }
        }
    }
    catch (::x10::lang::CheckedThrowable* __exc43) {
        if (true) {
            ::x10::lang::CheckedThrowable* e = static_cast< ::x10::lang::CheckedThrowable*>(__exc43);
            {
                
                //#line 37 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
                ::x10aux::nullCheck(e)->printStackTrace();
            }
        } else
        throw;
    }
    
    //#line 39 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
    ::harness::x10Test::reportResult(b->x10::lang::Cell<x10_boolean>::__apply());
}

//#line 42 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
void harness::x10Test::execute() {
    
    //#line 43 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
    x10_boolean b = false;
    
    //#line 44 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
    try {
        {
            
            //#line 45 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
            ::x10::lang::Runtime::ensureNotInAtomic();
            ::x10::lang::FinishState* x10____var2 = ::x10::lang::Runtime::startFinish();
            {
                ::x10::lang::CheckedThrowable* throwable__5508 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    try {
                        {
                            b = this->run();
                        }
                    }
                    catch (::x10::lang::CheckedThrowable* __exc45) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc45);
                            {
                                ::x10::lang::Runtime::pushException(
                                  __lowerer__var__0__);
                                ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make()));
                            }
                        } else
                        throw;
                    }
                    ::x10::compiler::Finalization::plausibleThrow();
                }
                catch (::x10::lang::CheckedThrowable* __exc46) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__5509 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc46);
                        {
                            throwable__5508 = formal__5509;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__5508)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__5508))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__5508));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::stopFinish(x10____var2);
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__5508)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__5508)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__5508));
                    }
                    
                }
                
            }
        }
    }
    catch (::x10::lang::CheckedThrowable* __exc47) {
        if (true) {
            ::x10::lang::CheckedThrowable* e = static_cast< ::x10::lang::CheckedThrowable*>(__exc47);
            {
                
                //#line 47 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
                ::x10aux::nullCheck(e)->printStackTrace();
            }
        } else
        throw;
    }
    
    //#line 49 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
    ::harness::x10Test::reportResult(b);
}

//#line 58 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
::x10::lang::String* harness::x10Test::pathCombine(::x10::lang::String* prefix,
                                                   ::x10::lang::String* file) {
    
    //#line 59 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
    ::x10::util::Map< ::x10::lang::String*, ::x10::lang::String*>* env =
      ::x10::lang::System::getenv();
    
    //#line 60 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
    ::x10::lang::String* home = ::x10::util::Map< ::x10::lang::String*, ::x10::lang::String*>::getOrElse(::x10aux::nullCheck(env), 
                                  (__extension__ ({ static ::x10::lang::String* strLit__5648 = ::x10aux::makeStringLit("X10_TEST_DIR"); strLit__5648; })),
                                  ::x10aux::class_cast_unchecked< ::x10::lang::String*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 61 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
    if ((::x10aux::struct_equals(home, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        
        //#line 62 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
        return file;
        
    } else {
        
        //#line 64 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
        return ::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(home, ::x10::io::File::FMGL(SEPARATOR__get)()), prefix), ::x10::io::File::FMGL(SEPARATOR__get)()), file);
        
    }
    
}

//#line 67 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
::x10::lang::String* harness::x10Test::pathCombine(::x10::lang::Rail< ::x10::lang::String* >* prefix,
                                                   ::x10::lang::String* file) {
    
    //#line 68 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
    if ((::x10aux::struct_equals((x10_long)(::x10aux::nullCheck(prefix)->FMGL(size)),
                                 ((x10_long)0ll)))) {
        return file;
        
    }
    
    //#line 69 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
    ::x10::util::StringBuilder* sb = ::x10::util::StringBuilder::_make();
    
    //#line 70 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
    x10_long i__5470min__5487 = ((x10_long)0ll);
    x10_long i__5470max__5488 = (((x10_long)(::x10aux::nullCheck(prefix)->FMGL(size))) - (((x10_long)2ll)));
    {
        x10_long i__5489;
        for (i__5489 = i__5470min__5487; ((i__5489) <= (i__5470max__5488));
             i__5489 = ((i__5489) + (((x10_long)1ll)))) {
            x10_long i__5490 = i__5489;
            
            //#line 71 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
            sb->add(::x10aux::nullCheck(prefix)->x10::lang::Rail< ::x10::lang::String* >::__apply(
                      i__5490));
            
            //#line 72 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
            sb->add(::x10::io::File::FMGL(SEPARATOR__get)());
        }
    }
    
    //#line 74 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
    sb->add(::x10aux::nullCheck(prefix)->x10::lang::Rail< ::x10::lang::String* >::__apply(
              (((x10_long)(::x10aux::nullCheck(prefix)->FMGL(size))) - (((x10_long)1ll)))));
    
    //#line 75 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
    return ::harness::x10Test::pathCombine(sb->toString(),
                                           file);
    
}

//#line 78 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
::x10::lang::String* harness::x10Test::FMGL(PREFIX);
void harness::x10Test::FMGL(PREFIX__do_init)() {
    FMGL(PREFIX__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: harness::x10Test.PREFIX");
    ::x10::lang::String* __var50__ = (__extension__ ({ static ::x10::lang::String* strLit__5654 = ::x10aux::makeStringLit("++++++ "); strLit__5654; }));
    FMGL(PREFIX) = __var50__;
    FMGL(PREFIX__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void harness::x10Test::FMGL(PREFIX__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(PREFIX__status), &FMGL(PREFIX__do_init), &FMGL(PREFIX__exception), "harness::x10Test.PREFIX");
    
}
volatile ::x10aux::StaticInitController::status harness::x10Test::FMGL(PREFIX__status);
::x10::lang::CheckedThrowable* harness::x10Test::FMGL(PREFIX__exception);

//#line 80 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
void harness::x10Test::success() {
    
    //#line 81 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
    ::harness::x10Test::println(::x10::lang::String::__plus(::harness::x10Test::FMGL(PREFIX__get)(), (__extension__ ({ static ::x10::lang::String* strLit__5655 = ::x10aux::makeStringLit("Test succeeded."); strLit__5655; }))));
    {
        
        //#line 82 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
        ::x10::lang::Runtime::runAt(::x10::lang::Place::FMGL(FIRST_PLACE__get)(),
                                    reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(harness_x10Test__closure__2)))harness_x10Test__closure__2())),
                                    ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
}

//#line 86 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
void harness::x10Test::failure() {
    
    //#line 87 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
    ::harness::x10Test::println(::x10::lang::String::__plus(::harness::x10Test::FMGL(PREFIX__get)(), (__extension__ ({ static ::x10::lang::String* strLit__5656 = ::x10aux::makeStringLit("Test failed."); strLit__5656; }))));
    {
        
        //#line 88 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
        ::x10::lang::Runtime::runAt(::x10::lang::Place::FMGL(FIRST_PLACE__get)(),
                                    reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(harness_x10Test__closure__3)))harness_x10Test__closure__3())),
                                    ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
}

//#line 92 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
void harness::x10Test::reportResult(x10_boolean b) {
    
    //#line 93 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
    if (b) {
        ::harness::x10Test::success();
    } else {
        ::harness::x10Test::failure();
    }
    
}

//#line 111 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
void harness::x10Test::chk(x10_boolean b) {
    
    //#line 112 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
    if (!(b)) {
        ::x10aux::throwException(::x10aux::nullCheck(::harness::x10Test__TestException::_make()));
    }
    
}

//#line 119 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
void harness::x10Test::chk(x10_boolean b, ::x10::lang::String* s) {
    
    //#line 120 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
    if (!(b)) {
        ::x10aux::throwException(::x10aux::nullCheck(::harness::x10Test__TestException::_make(s)));
    }
    
}

//#line 123 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"

//#line 128 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
x10_int harness::x10Test::ranInt(x10_int lb, x10_int ub) {
    
    //#line 129 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
    return ((lb) + (::x10aux::nullCheck(this->FMGL(myRand))->nextInt(
                      ((((ub) - (lb))) + (((x10_int)1))))));
    
}

//#line 132 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
void harness::x10Test::println(::x10::lang::String* s) {
    ::x10::io::Console::FMGL(OUT__get)()->x10::io::Printer::println(
      reinterpret_cast< ::x10::lang::Any*>(s));
}

//#line 24 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
::harness::x10Test* harness::x10Test::harness__x10Test____this__harness__x10Test(
  ) {
    return this;
    
}
void harness::x10Test::_constructor() {
    this->harness::x10Test::__fieldInitializers_harness_x10Test();
}

void harness::x10Test::__fieldInitializers_harness_x10Test(
  ) {
    this->FMGL(myRand) = ::x10::util::Random::_make(((x10_long)1ll));
}
void harness::x10Test::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(myRand));
    
}

void harness::x10Test::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(myRand) = buf.read< ::x10::util::Random*>();
}

::x10aux::RuntimeType harness::x10Test::rtt;
void harness::x10Test::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("harness.x10Test",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

::x10::lang::VoidFun_0_0::itable<harness_x10Test__closure__1>harness_x10Test__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &harness_x10Test__closure__1::__apply, &harness_x10Test__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry harness_x10Test__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &harness_x10Test__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t harness_x10Test__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(harness_x10Test__closure__1::_deserialize);
const ::x10aux::serialization_id_t harness_x10Test__closure__1::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(harness_x10Test__closure__1::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

::x10::lang::VoidFun_0_0::itable<harness_x10Test__closure__2>harness_x10Test__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &harness_x10Test__closure__2::__apply, &harness_x10Test__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry harness_x10Test__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &harness_x10Test__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t harness_x10Test__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(harness_x10Test__closure__2::_deserialize);

::x10::lang::VoidFun_0_0::itable<harness_x10Test__closure__3>harness_x10Test__closure__3::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &harness_x10Test__closure__3::__apply, &harness_x10Test__closure__3::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry harness_x10Test__closure__3::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &harness_x10Test__closure__3::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t harness_x10Test__closure__3::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(harness_x10Test__closure__3::_deserialize);

/* END of x10Test */
/*************************************************/
/*************************************************/
/* START of x10Test$TestException */
#include <harness/x10Test__TestException.h>

#include <x10/lang/Exception.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/String.h>
#include <x10/compiler/Synthetic.h>

//#line 98 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
void harness::x10Test__TestException::_constructor() {
    (this)->::x10::lang::Exception::_constructor();
    
    //#line 96 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
    this->harness::x10Test__TestException::__fieldInitializers_harness_x10Test_TestException();
}
::harness::x10Test__TestException* harness::x10Test__TestException::_make(
  ) {
    ::harness::x10Test__TestException* this_ = new (::x10aux::alloc_z< ::harness::x10Test__TestException>()) ::harness::x10Test__TestException();
    this_->_constructor();
    return this_;
}



//#line 100 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
void harness::x10Test__TestException::_constructor(::x10::lang::CheckedThrowable* cause) {
    (this)->::x10::lang::Exception::_constructor(cause);
    
    //#line 96 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
    this->harness::x10Test__TestException::__fieldInitializers_harness_x10Test_TestException();
}
::harness::x10Test__TestException* harness::x10Test__TestException::_make(
  ::x10::lang::CheckedThrowable* cause) {
    ::harness::x10Test__TestException* this_ = new (::x10aux::alloc_z< ::harness::x10Test__TestException>()) ::harness::x10Test__TestException();
    this_->_constructor(cause);
    return this_;
}



//#line 102 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
void harness::x10Test__TestException::_constructor(::x10::lang::String* message) {
    (this)->::x10::lang::Exception::_constructor(message);
    
    //#line 96 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
    this->harness::x10Test__TestException::__fieldInitializers_harness_x10Test_TestException();
}
::harness::x10Test__TestException* harness::x10Test__TestException::_make(
  ::x10::lang::String* message) {
    ::harness::x10Test__TestException* this_ = new (::x10aux::alloc_z< ::harness::x10Test__TestException>()) ::harness::x10Test__TestException();
    this_->_constructor(message);
    return this_;
}



//#line 104 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
void harness::x10Test__TestException::_constructor(::x10::lang::String* message,
                                                   ::x10::lang::CheckedThrowable* cause) {
    (this)->::x10::lang::Exception::_constructor(message, cause);
    
    //#line 96 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
    this->harness::x10Test__TestException::__fieldInitializers_harness_x10Test_TestException();
}
::harness::x10Test__TestException* harness::x10Test__TestException::_make(
  ::x10::lang::String* message, ::x10::lang::CheckedThrowable* cause) {
    ::harness::x10Test__TestException* this_ = new (::x10aux::alloc_z< ::harness::x10Test__TestException>()) ::harness::x10Test__TestException();
    this_->_constructor(message, cause);
    return this_;
}



//#line 96 "/home/induk/workspace/x10.tests/tests/x10lib/harness/x10Test.x10"
::harness::x10Test__TestException* harness::x10Test__TestException::harness__x10Test__TestException____this__harness__x10Test__TestException(
  ) {
    return this;
    
}
void harness::x10Test__TestException::__fieldInitializers_harness_x10Test_TestException(
  ) {
 
}
const ::x10aux::serialization_id_t harness::x10Test__TestException::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::harness::x10Test__TestException::_deserializer);

void harness::x10Test__TestException::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::Exception::_serialize_body(buf);
    
}

::x10::lang::Reference* ::harness::x10Test__TestException::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::harness::x10Test__TestException* this_ = new (::x10aux::alloc_z< ::harness::x10Test__TestException>()) ::harness::x10Test__TestException();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void harness::x10Test__TestException::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Exception::_deserialize_body(buf);
    
}

::x10aux::RuntimeType harness::x10Test__TestException::rtt;
void harness::x10Test__TestException::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Exception>()};
    rtt.initStageTwo("harness.x10Test.TestException",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of x10Test$TestException */
/*************************************************/
