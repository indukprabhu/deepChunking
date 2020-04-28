/*************************************************/
/* START of Runtime */
#include <x10/lang/Runtime.h>

#ifndef X10_LANG_RUNTIME__CLOSURE__1_CLOSURE
#define X10_LANG_RUNTIME__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_Runtime__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        {
            
            //#line 858 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10::lang::CheckedThrowable* throwable__104497 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                try {
                    {
                        ::x10::lang::Runtime::ensureNotInAtomic();
                        ::x10::lang::FinishState* x10____var14 = ::x10::lang::Runtime::startFinish();
                        {
                            ::x10::lang::CheckedThrowable* throwable__104494 =
                              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                            try {
                                try {
                                    {
                                        ::x10::lang::VoidFun_0_0::__apply(::x10aux::nullCheck(job));
                                    }
                                }
                                catch (::x10::lang::CheckedThrowable* __exc1608) {
                                    if (true) {
                                        ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                                          static_cast< ::x10::lang::CheckedThrowable*>(__exc1608);
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
                            catch (::x10::lang::CheckedThrowable* __exc1609) {
                                if (true) {
                                    ::x10::lang::CheckedThrowable* formal__104495 =
                                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1609);
                                    {
                                        throwable__104494 =
                                          formal__104495;
                                    }
                                } else
                                throw;
                            }
                            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                          throwable__104494)))
                            {
                                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__104494))
                                {
                                    ::x10aux::throwException(::x10aux::nullCheck(throwable__104494));
                                }
                                
                            }
                            if (true) {
                                ::x10::lang::Runtime::stopFinish(
                                  x10____var14);
                            }
                            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                          throwable__104494)))
                            {
                                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__104494)))
                                {
                                    ::x10aux::throwException(::x10aux::nullCheck(throwable__104494));
                                }
                                
                            }
                            
                        }
                    }
                }
                catch (::x10::lang::CheckedThrowable* __exc1610) {
                    if (::x10aux::instanceof< ::x10::lang::MultipleExceptions*>(__exc1610)) {
                        ::x10::lang::MultipleExceptions* t =
                          static_cast< ::x10::lang::MultipleExceptions*>(__exc1610);
                        {
                            
                            //#line 819 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            ::x10::lang::MultipleExceptions* t__104390 =
                              t;
                            watcher->FMGL(t) = t__104390;
                        }
                    } else
                    throw;
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc1611) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__104498 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1611);
                    {
                        throwable__104497 = formal__104498;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__104497)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__104497))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__104497));
                }
                
            }
            if (true) {
                watcher->x10::lang::Runtime__Watcher::release();
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__104497)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__104497)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__104497));
                }
                
            }
            
        }
    }
    
    // captured environment
    ::x10::lang::VoidFun_0_0* job;
    ::x10::lang::Runtime__Watcher* watcher;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->job);
        buf.write(this->watcher);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Runtime__closure__1* storage = ::x10aux::alloc_z<x10_lang_Runtime__closure__1>();
        buf.record_reference(storage);
        ::x10::lang::VoidFun_0_0* that_job = buf.read< ::x10::lang::VoidFun_0_0*>();
        ::x10::lang::Runtime__Watcher* that_watcher = buf.read< ::x10::lang::Runtime__Watcher*>();
        x10_lang_Runtime__closure__1* this_ = new (storage) x10_lang_Runtime__closure__1(that_job, that_watcher);
        return this_;
    }
    
    x10_lang_Runtime__closure__1(::x10::lang::VoidFun_0_0* job, ::x10::lang::Runtime__Watcher* watcher) : job(job), watcher(watcher) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10:858";
    }

};

#endif // X10_LANG_RUNTIME__CLOSURE__1_CLOSURE
#ifndef X10_LANG_RUNTIME__CLOSURE__2_CLOSURE
#define X10_LANG_RUNTIME__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_Runtime__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        {
            
            //#line 898 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10::lang::CheckedThrowable* throwable__104503 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                try {
                    {
                        ::x10::lang::Runtime::ensureNotInAtomic();
                        ::x10::lang::FinishState* x10____var15 = ::x10::lang::Runtime::startFinish();
                        {
                            ::x10::lang::CheckedThrowable* throwable__104500 =
                              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                            try {
                                try {
                                    {
                                        ::x10::lang::VoidFun_0_0::__apply(::x10aux::nullCheck(job));
                                    }
                                }
                                catch (::x10::lang::CheckedThrowable* __exc1615) {
                                    if (true) {
                                        ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                                          static_cast< ::x10::lang::CheckedThrowable*>(__exc1615);
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
                            catch (::x10::lang::CheckedThrowable* __exc1616) {
                                if (true) {
                                    ::x10::lang::CheckedThrowable* formal__104501 =
                                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1616);
                                    {
                                        throwable__104500 =
                                          formal__104501;
                                    }
                                } else
                                throw;
                            }
                            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                          throwable__104500)))
                            {
                                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__104500))
                                {
                                    ::x10aux::throwException(::x10aux::nullCheck(throwable__104500));
                                }
                                
                            }
                            if (true) {
                                ::x10::lang::Runtime::stopFinish(
                                  x10____var15);
                            }
                            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                          throwable__104500)))
                            {
                                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__104500)))
                                {
                                    ::x10aux::throwException(::x10aux::nullCheck(throwable__104500));
                                }
                                
                            }
                            
                        }
                    }
                }
                catch (::x10::lang::CheckedThrowable* __exc1617) {
                    if (::x10aux::instanceof< ::x10::lang::MultipleExceptions*>(__exc1617)) {
                        ::x10::lang::MultipleExceptions* t =
                          static_cast< ::x10::lang::MultipleExceptions*>(__exc1617);
                        {
                            ::x10::lang::Runtime__Watcher* this__104393 =
                              ::x10::lang::Runtime::FMGL(pool__get)()->FMGL(watcher);
                            
                            //#line 819 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            ::x10::lang::MultipleExceptions* t__104394 =
                              t;
                            this__104393->FMGL(t) = t__104394;
                        }
                    } else
                    throw;
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc1618) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__104504 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1618);
                    {
                        throwable__104503 = formal__104504;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__104503)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__104503))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__104503));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::terminateAll();
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__104503)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__104503)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__104503));
                }
                
            }
            
        }
    }
    
    // captured environment
    ::x10::lang::VoidFun_0_0* job;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->job);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Runtime__closure__2* storage = ::x10aux::alloc_z<x10_lang_Runtime__closure__2>();
        buf.record_reference(storage);
        ::x10::lang::VoidFun_0_0* that_job = buf.read< ::x10::lang::VoidFun_0_0*>();
        x10_lang_Runtime__closure__2* this_ = new (storage) x10_lang_Runtime__closure__2(that_job);
        return this_;
    }
    
    x10_lang_Runtime__closure__2(::x10::lang::VoidFun_0_0* job) : job(job) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10:898";
    }

};

#endif // X10_LANG_RUNTIME__CLOSURE__2_CLOSURE
#ifndef X10_LANG_RUNTIME__CLOSURE__4_CLOSURE
#define X10_LANG_RUNTIME__CLOSURE__4_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_Runtime__closure__4 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__4> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10::lang::Runtime::terminate();
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Runtime__closure__4* storage = ::x10aux::alloc_z<x10_lang_Runtime__closure__4>();
        buf.record_reference(storage);
        x10_lang_Runtime__closure__4* this_ = new (storage) x10_lang_Runtime__closure__4();
        return this_;
    }
    
    x10_lang_Runtime__closure__4() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10:925";
    }

};

#endif // X10_LANG_RUNTIME__CLOSURE__4_CLOSURE
#ifndef X10_LANG_RUNTIME__CLOSURE__3_CLOSURE
#define X10_LANG_RUNTIME__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_Runtime__closure__3 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__3> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 924 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10_int h = ::x10aux::here;
        
        //#line 925 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::VoidFun_0_0* cl = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Runtime__closure__4)))x10_lang_Runtime__closure__4()));
        
        //#line 926 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        {
            x10_int j;
            for (j = ::x10::lang::Math::max(((x10_int)1), ((h) - (((x10_int)31))));
                 ((j) < (h)); j = ((j) + (((x10_int)1)))) {
                
                //#line 927 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                ::x10::lang::Runtime::x10rtSendMessage(((x10_long)(j)),
                                                       cl, ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            }
        }
        
        //#line 929 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime::terminate();
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Runtime__closure__3* storage = ::x10aux::alloc_z<x10_lang_Runtime__closure__3>();
        buf.record_reference(storage);
        x10_lang_Runtime__closure__3* this_ = new (storage) x10_lang_Runtime__closure__3();
        return this_;
    }
    
    x10_lang_Runtime__closure__3() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10:923-930";
    }

};

#endif // X10_LANG_RUNTIME__CLOSURE__3_CLOSURE
#ifndef X10_LANG_RUNTIME__CLOSURE__5_CLOSURE
#define X10_LANG_RUNTIME__CLOSURE__5_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_Runtime__closure__5 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__5> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10::lang::Runtime::terminate();
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Runtime__closure__5* storage = ::x10aux::alloc_z<x10_lang_Runtime__closure__5>();
        buf.record_reference(storage);
        x10_lang_Runtime__closure__5* this_ = new (storage) x10_lang_Runtime__closure__5();
        return this_;
    }
    
    x10_lang_Runtime__closure__5() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10:935";
    }

};

#endif // X10_LANG_RUNTIME__CLOSURE__5_CLOSURE
#ifndef X10_LANG_RUNTIME__CLOSURE__6_CLOSURE
#define X10_LANG_RUNTIME__CLOSURE__6_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_Runtime__closure__6 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__6> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 1016 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::io::Deserializer* deser = ::x10::io::Deserializer::_make(ser);
        
        //#line 1017 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::VoidFun_0_0* bodyCopy = ::x10aux::class_cast< ::x10::lang::VoidFun_0_0*>(deser->x10::io::Deserializer::readAny());
        
        //#line 1018 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::VoidFun_0_0::__apply(::x10aux::nullCheck(bodyCopy));
    }
    
    // captured environment
    ::x10::io::Serializer* ser;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->ser);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Runtime__closure__6* storage = ::x10aux::alloc_z<x10_lang_Runtime__closure__6>();
        buf.record_reference(storage);
        ::x10::io::Serializer* that_ser = buf.read< ::x10::io::Serializer*>();
        x10_lang_Runtime__closure__6* this_ = new (storage) x10_lang_Runtime__closure__6(that_ser);
        return this_;
    }
    
    x10_lang_Runtime__closure__6(::x10::io::Serializer* ser) : ser(ser) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10:1015-1019";
    }

};

#endif // X10_LANG_RUNTIME__CLOSURE__6_CLOSURE
#ifndef X10_LANG_RUNTIME__CLOSURE__7_CLOSURE
#define X10_LANG_RUNTIME__CLOSURE__7_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_Runtime__closure__7 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__7> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10::lang::Runtime::execute((__extension__ ({
                                          ::x10::lang::Activity* alloc__77962 =
                                             (new (::x10aux::alloc_z< ::x10::lang::Activity>()) ::x10::lang::Activity());
                                          (alloc__77962)->::x10::lang::Activity::_constructor(
                                            body, src, state, clockPhases);
                                          alloc__77962;
                                      }))
                                      );
    }
    
    // captured environment
    ::x10::lang::VoidFun_0_0* body;
    ::x10::lang::Place src;
    ::x10::lang::FinishState* state;
    ::x10::lang::Activity__ClockPhases* clockPhases;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->body);
        buf.write(this->src);
        buf.write(this->state);
        buf.write(this->clockPhases);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Runtime__closure__7* storage = ::x10aux::alloc_z<x10_lang_Runtime__closure__7>();
        buf.record_reference(storage);
        ::x10::lang::VoidFun_0_0* that_body = buf.read< ::x10::lang::VoidFun_0_0*>();
        ::x10::lang::Place that_src = buf.read< ::x10::lang::Place>();
        ::x10::lang::FinishState* that_state = buf.read< ::x10::lang::FinishState*>();
        ::x10::lang::Activity__ClockPhases* that_clockPhases = buf.read< ::x10::lang::Activity__ClockPhases*>();
        x10_lang_Runtime__closure__7* this_ = new (storage) x10_lang_Runtime__closure__7(that_body, that_src, that_state, that_clockPhases);
        return this_;
    }
    
    x10_lang_Runtime__closure__7(::x10::lang::VoidFun_0_0* body, ::x10::lang::Place src, ::x10::lang::FinishState* state, ::x10::lang::Activity__ClockPhases* clockPhases) : body(body), src(src), state(state), clockPhases(clockPhases) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10:1023";
    }

};

#endif // X10_LANG_RUNTIME__CLOSURE__7_CLOSURE
#ifndef X10_LANG_RUNTIME__CLOSURE__8_CLOSURE
#define X10_LANG_RUNTIME__CLOSURE__8_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_Runtime__closure__8 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__8> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 1024 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::nullCheck(state)->notifySubActivitySpawn(place);
    }
    
    // captured environment
    ::x10::lang::FinishState* state;
    ::x10::lang::Place place;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->state);
        buf.write(this->place);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Runtime__closure__8* storage = ::x10aux::alloc_z<x10_lang_Runtime__closure__8>();
        buf.record_reference(storage);
        ::x10::lang::FinishState* that_state = buf.read< ::x10::lang::FinishState*>();
        ::x10::lang::Place that_place = buf.read< ::x10::lang::Place>();
        x10_lang_Runtime__closure__8* this_ = new (storage) x10_lang_Runtime__closure__8(that_state, that_place);
        return this_;
    }
    
    x10_lang_Runtime__closure__8(::x10::lang::FinishState* state, ::x10::lang::Place place) : state(state), place(place) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10:1024";
    }

};

#endif // X10_LANG_RUNTIME__CLOSURE__8_CLOSURE
#ifndef X10_LANG_RUNTIME__CLOSURE__9_CLOSURE
#define X10_LANG_RUNTIME__CLOSURE__9_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_Runtime__closure__9 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__9> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 1051 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::io::Deserializer* deser__104406 = ::x10::io::Deserializer::_make(ser);
        
        //#line 1052 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::VoidFun_0_0* bodyCopy__104407 = ::x10aux::class_cast< ::x10::lang::VoidFun_0_0*>(deser__104406->x10::io::Deserializer::readAny());
        
        //#line 1053 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::VoidFun_0_0::__apply(::x10aux::nullCheck(bodyCopy__104407));
    }
    
    // captured environment
    ::x10::io::Serializer* ser;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->ser);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Runtime__closure__9* storage = ::x10aux::alloc_z<x10_lang_Runtime__closure__9>();
        buf.record_reference(storage);
        ::x10::io::Serializer* that_ser = buf.read< ::x10::io::Serializer*>();
        x10_lang_Runtime__closure__9* this_ = new (storage) x10_lang_Runtime__closure__9(that_ser);
        return this_;
    }
    
    x10_lang_Runtime__closure__9(::x10::io::Serializer* ser) : ser(ser) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10:1050-1054";
    }

};

#endif // X10_LANG_RUNTIME__CLOSURE__9_CLOSURE
#ifndef X10_LANG_RUNTIME__CLOSURE__10_CLOSURE
#define X10_LANG_RUNTIME__CLOSURE__10_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_Runtime__closure__10 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__10> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 1057 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::nullCheck(state)->notifySubActivitySpawn(place);
    }
    
    // captured environment
    ::x10::lang::FinishState* state;
    ::x10::lang::Place place;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->state);
        buf.write(this->place);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Runtime__closure__10* storage = ::x10aux::alloc_z<x10_lang_Runtime__closure__10>();
        buf.record_reference(storage);
        ::x10::lang::FinishState* that_state = buf.read< ::x10::lang::FinishState*>();
        ::x10::lang::Place that_place = buf.read< ::x10::lang::Place>();
        x10_lang_Runtime__closure__10* this_ = new (storage) x10_lang_Runtime__closure__10(that_state, that_place);
        return this_;
    }
    
    x10_lang_Runtime__closure__10(::x10::lang::FinishState* state, ::x10::lang::Place place) : state(state), place(place) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10:1057";
    }

};

#endif // X10_LANG_RUNTIME__CLOSURE__10_CLOSURE
#ifndef X10_LANG_RUNTIME__CLOSURE__11_CLOSURE
#define X10_LANG_RUNTIME__CLOSURE__11_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_Runtime__closure__11 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__11> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 1112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::io::Deserializer* deser__104418 = ::x10::io::Deserializer::_make(ser);
        
        //#line 1113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::VoidFun_0_0* bodyCopy__104419 = ::x10aux::class_cast< ::x10::lang::VoidFun_0_0*>(deser__104418->x10::io::Deserializer::readAny());
        
        //#line 1114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::VoidFun_0_0::__apply(::x10aux::nullCheck(bodyCopy__104419));
    }
    
    // captured environment
    ::x10::io::Serializer* ser;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->ser);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Runtime__closure__11* storage = ::x10aux::alloc_z<x10_lang_Runtime__closure__11>();
        buf.record_reference(storage);
        ::x10::io::Serializer* that_ser = buf.read< ::x10::io::Serializer*>();
        x10_lang_Runtime__closure__11* this_ = new (storage) x10_lang_Runtime__closure__11(that_ser);
        return this_;
    }
    
    x10_lang_Runtime__closure__11(::x10::io::Serializer* ser) : ser(ser) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10:1111-1115";
    }

};

#endif // X10_LANG_RUNTIME__CLOSURE__11_CLOSURE
#ifndef X10_LANG_RUNTIME__CLOSURE__12_CLOSURE
#define X10_LANG_RUNTIME__CLOSURE__12_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_Runtime__closure__12 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__12> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10::lang::Runtime::execute((__extension__ ({
                                          ::x10::lang::Activity* alloc__77967 =
                                             (new (::x10aux::alloc_z< ::x10::lang::Activity>()) ::x10::lang::Activity());
                                          (alloc__77967)->::x10::lang::Activity::_constructor(
                                            body, ::x10::lang::Place::FMGL(FIRST_PLACE__get)(),
                                            reinterpret_cast< ::x10::lang::FinishState*>(::x10::lang::FinishState::FMGL(UNCOUNTED_FINISH__get)()));
                                          alloc__77967;
                                      }))
                                      );
    }
    
    // captured environment
    ::x10::lang::VoidFun_0_0* body;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->body);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Runtime__closure__12* storage = ::x10aux::alloc_z<x10_lang_Runtime__closure__12>();
        buf.record_reference(storage);
        ::x10::lang::VoidFun_0_0* that_body = buf.read< ::x10::lang::VoidFun_0_0*>();
        x10_lang_Runtime__closure__12* this_ = new (storage) x10_lang_Runtime__closure__12(that_body);
        return this_;
    }
    
    x10_lang_Runtime__closure__12(::x10::lang::VoidFun_0_0* body) : body(body) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10:1120";
    }

};

#endif // X10_LANG_RUNTIME__CLOSURE__12_CLOSURE
#ifndef X10_LANG_RUNTIME__CLOSURE__14_CLOSURE
#define X10_LANG_RUNTIME__CLOSURE__14_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_Runtime__closure__14 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__14> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 1211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime__RemoteControl* me2 = (box)->__apply();
        
        //#line 1212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::nullCheck(me2)->FMGL(clockPhases) = clockPhases;
        
        //#line 1213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::nullCheck(me2)->release();
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::Runtime__RemoteControl* > box;
    ::x10::lang::Activity__ClockPhases* clockPhases;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->box);
        buf.write(this->clockPhases);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Runtime__closure__14* storage = ::x10aux::alloc_z<x10_lang_Runtime__closure__14>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::Runtime__RemoteControl* > that_box = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Runtime__RemoteControl* > >();
        ::x10::lang::Activity__ClockPhases* that_clockPhases = buf.read< ::x10::lang::Activity__ClockPhases*>();
        x10_lang_Runtime__closure__14* this_ = new (storage) x10_lang_Runtime__closure__14(that_box, that_clockPhases);
        return this_;
    }
    
    x10_lang_Runtime__closure__14(::x10::lang::GlobalRef< ::x10::lang::Runtime__RemoteControl* > box, ::x10::lang::Activity__ClockPhases* clockPhases) : box(box), clockPhases(clockPhases) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10:1210-1214";
    }

};

#endif // X10_LANG_RUNTIME__CLOSURE__14_CLOSURE
#ifndef X10_LANG_RUNTIME__CLOSURE__15_CLOSURE
#define X10_LANG_RUNTIME__CLOSURE__15_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_Runtime__closure__15 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__15> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 1222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime__RemoteControl* me2 = (box)->__apply();
        
        //#line 1223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::nullCheck(me2)->FMGL(e) = e;
        
        //#line 1224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::nullCheck(me2)->FMGL(clockPhases) = clockPhases;
        
        //#line 1225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::nullCheck(me2)->release();
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::Runtime__RemoteControl* > box;
    ::x10::lang::CheckedThrowable* e;
    ::x10::lang::Activity__ClockPhases* clockPhases;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->box);
        buf.write(this->e);
        buf.write(this->clockPhases);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Runtime__closure__15* storage = ::x10aux::alloc_z<x10_lang_Runtime__closure__15>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::Runtime__RemoteControl* > that_box = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Runtime__RemoteControl* > >();
        ::x10::lang::CheckedThrowable* that_e = buf.read< ::x10::lang::CheckedThrowable*>();
        ::x10::lang::Activity__ClockPhases* that_clockPhases = buf.read< ::x10::lang::Activity__ClockPhases*>();
        x10_lang_Runtime__closure__15* this_ = new (storage) x10_lang_Runtime__closure__15(that_box, that_e, that_clockPhases);
        return this_;
    }
    
    x10_lang_Runtime__closure__15(::x10::lang::GlobalRef< ::x10::lang::Runtime__RemoteControl* > box, ::x10::lang::CheckedThrowable* e, ::x10::lang::Activity__ClockPhases* clockPhases) : box(box), e(e), clockPhases(clockPhases) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10:1221-1226";
    }

};

#endif // X10_LANG_RUNTIME__CLOSURE__15_CLOSURE
#ifndef X10_LANG_RUNTIME__CLOSURE__13_CLOSURE
#define X10_LANG_RUNTIME__CLOSURE__13_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_Runtime__closure__13 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__13> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 1203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10aux::nullCheck(::x10::lang::Runtime::activity())->FMGL(clockPhases) =
              clockPhases;
            
            //#line 1204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            try {
                
                //#line 1205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                try {
                    
                    //#line 1207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ::x10::io::Deserializer _StackAllocate_deser;
                     _StackAllocate_deser._constructor(bytes);
                    ::x10::io::Deserializer* deser(&_StackAllocate_deser);
                    
                    //#line 1208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ::x10::lang::VoidFun_0_0* bodyPrime = ::x10aux::class_cast< ::x10::lang::VoidFun_0_0*>(deser->x10::io::Deserializer::readAny());
                    
                    //#line 1209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ::x10::lang::VoidFun_0_0::__apply(::x10aux::nullCheck(bodyPrime));
                    
                    //#line 1210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ::x10::lang::VoidFun_0_0* closure = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Runtime__closure__14)))x10_lang_Runtime__closure__14(box, clockPhases)));
                    
                    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    x10_long id__104436 = ::x10::lang::Place::place((box)->location)->FMGL(id);
                    ::x10::lang::VoidFun_0_0* msgBody__104437 = closure;
                    ::x10::lang::Runtime__Profile* prof__104438 =
                      ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                    
                    //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ::x10aux::run_closure_at((x10_int)id__104436, msgBody__104437, reinterpret_cast< ::x10::lang::Runtime__Profile*>(X10_NULL), ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                    
                    //#line 1216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ::x10aux::dealloc(closure);
                }
                catch (::x10::lang::CheckedThrowable* __exc1636) {
                    if (::x10aux::instanceof< ::x10::lang::Runtime__AtCheckedWrapper*>(__exc1636)) {
                        ::x10::lang::Runtime__AtCheckedWrapper* e =
                          static_cast< ::x10::lang::Runtime__AtCheckedWrapper*>(__exc1636);
                        {
                            
                            //#line 1218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            ::x10aux::throwException(::x10aux::nullCheck(::x10aux::nullCheck(e)->x10::lang::Runtime__AtCheckedWrapper::getCheckedCause()));
                        }
                    } else
                    throw;
                }
            }
            catch (::x10::lang::CheckedThrowable* __exc1637) {
                if (true) {
                    ::x10::lang::CheckedThrowable* e = static_cast< ::x10::lang::CheckedThrowable*>(__exc1637);
                    {
                        
                        //#line 1221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        ::x10::lang::VoidFun_0_0* closure = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Runtime__closure__15)))x10_lang_Runtime__closure__15(box, e, clockPhases)));
                        
                        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        x10_long id__104439 = ::x10::lang::Place::place((box)->location)->FMGL(id);
                        ::x10::lang::VoidFun_0_0* msgBody__104440 =
                          closure;
                        ::x10::lang::Runtime__Profile* prof__104441 =
                          ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                        
                        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        ::x10aux::run_closure_at((x10_int)id__104439, msgBody__104440, reinterpret_cast< ::x10::lang::Runtime__Profile*>(X10_NULL), ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                        
                        //#line 1228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        ::x10aux::dealloc(closure);
                    }
                } else
                throw;
            }
            
            //#line 1230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10aux::nullCheck(::x10::lang::Runtime::activity())->FMGL(clockPhases) =
              (::x10aux::class_cast_unchecked< ::x10::lang::Activity__ClockPhases*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        }
        catch (::x10::lang::CheckedThrowable* __exc1638) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc1638)) {
                ::x10::lang::Error* __lowerer__var__0__ =
                  static_cast< ::x10::lang::Error*>(__exc1638);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1638);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::Activity__ClockPhases* clockPhases;
    ::x10::lang::Rail< x10_byte >* bytes;
    ::x10::lang::GlobalRef< ::x10::lang::Runtime__RemoteControl* > box;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->clockPhases);
        buf.write(this->bytes);
        buf.write(this->box);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Runtime__closure__13* storage = ::x10aux::alloc_z<x10_lang_Runtime__closure__13>();
        buf.record_reference(storage);
        ::x10::lang::Activity__ClockPhases* that_clockPhases = buf.read< ::x10::lang::Activity__ClockPhases*>();
        ::x10::lang::Rail< x10_byte >* that_bytes = buf.read< ::x10::lang::Rail< x10_byte >*>();
        ::x10::lang::GlobalRef< ::x10::lang::Runtime__RemoteControl* > that_box = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Runtime__RemoteControl* > >();
        x10_lang_Runtime__closure__13* this_ = new (storage) x10_lang_Runtime__closure__13(that_clockPhases, that_bytes, that_box);
        return this_;
    }
    
    x10_lang_Runtime__closure__13(::x10::lang::Activity__ClockPhases* clockPhases, ::x10::lang::Rail< x10_byte >* bytes, ::x10::lang::GlobalRef< ::x10::lang::Runtime__RemoteControl* > box) : clockPhases(clockPhases), bytes(bytes), box(box) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10:1202-1231";
    }

};

#endif // X10_LANG_RUNTIME__CLOSURE__13_CLOSURE
#ifndef X10_LANG_RUNTIME__CLOSURE__17_CLOSURE
#define X10_LANG_RUNTIME__CLOSURE__17_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_Runtime__closure__17 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__17> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 1265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime__RemoteControl* me2 = (box)->__apply();
        
        //#line 1266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::nullCheck(me2)->release();
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::Runtime__RemoteControl* > box;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->box);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Runtime__closure__17* storage = ::x10aux::alloc_z<x10_lang_Runtime__closure__17>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::Runtime__RemoteControl* > that_box = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Runtime__RemoteControl* > >();
        x10_lang_Runtime__closure__17* this_ = new (storage) x10_lang_Runtime__closure__17(that_box);
        return this_;
    }
    
    x10_lang_Runtime__closure__17(::x10::lang::GlobalRef< ::x10::lang::Runtime__RemoteControl* > box) : box(box) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10:1264-1267";
    }

};

#endif // X10_LANG_RUNTIME__CLOSURE__17_CLOSURE
#ifndef X10_LANG_RUNTIME__CLOSURE__16_CLOSURE
#define X10_LANG_RUNTIME__CLOSURE__16_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_Runtime__closure__16 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__16> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 1263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::VoidFun_0_0::__apply(::x10aux::nullCheck(body));
        
        //#line 1264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::VoidFun_0_0* closure = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Runtime__closure__17)))x10_lang_Runtime__closure__17(box)));
        
        //#line 1268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime::x10rtSendMessage(::x10::lang::Place::place((box)->location)->FMGL(id),
                                               closure, ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
        //#line 1269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::dealloc(closure);
    }
    
    // captured environment
    ::x10::lang::VoidFun_0_0* body;
    ::x10::lang::GlobalRef< ::x10::lang::Runtime__RemoteControl* > box;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->body);
        buf.write(this->box);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Runtime__closure__16* storage = ::x10aux::alloc_z<x10_lang_Runtime__closure__16>();
        buf.record_reference(storage);
        ::x10::lang::VoidFun_0_0* that_body = buf.read< ::x10::lang::VoidFun_0_0*>();
        ::x10::lang::GlobalRef< ::x10::lang::Runtime__RemoteControl* > that_box = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Runtime__RemoteControl* > >();
        x10_lang_Runtime__closure__16* this_ = new (storage) x10_lang_Runtime__closure__16(that_body, that_box);
        return this_;
    }
    
    x10_lang_Runtime__closure__16(::x10::lang::VoidFun_0_0* body, ::x10::lang::GlobalRef< ::x10::lang::Runtime__RemoteControl* > box) : body(body), box(box) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10:1262-1270";
    }

};

#endif // X10_LANG_RUNTIME__CLOSURE__16_CLOSURE
#ifndef X10_LANG_RUNTIME__CLOSURE__18_CLOSURE
#define X10_LANG_RUNTIME__CLOSURE__18_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_Runtime__closure__18 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__18> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        ::x10::lang::VoidFun_0_0::__apply(::x10aux::nullCheck(body));
    }
    
    // captured environment
    ::x10::lang::VoidFun_0_0* body;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->body);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Runtime__closure__18* storage = ::x10aux::alloc_z<x10_lang_Runtime__closure__18>();
        buf.record_reference(storage);
        ::x10::lang::VoidFun_0_0* that_body = buf.read< ::x10::lang::VoidFun_0_0*>();
        x10_lang_Runtime__closure__18* this_ = new (storage) x10_lang_Runtime__closure__18(that_body);
        return this_;
    }
    
    x10_lang_Runtime__closure__18(::x10::lang::VoidFun_0_0* body) : body(body) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10:1275";
    }

};

#endif // X10_LANG_RUNTIME__CLOSURE__18_CLOSURE
#ifndef X10_LANG_RUNTIME__CLOSURE__20_CLOSURE
#define X10_LANG_RUNTIME__CLOSURE__20_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_Runtime__closure__20 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__20> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 1343 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime__Remote< ::x10::lang::Any*>* me2 = (box)->__apply();
        
        //#line 1345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::nullCheck(me2)->FMGL(clockPhases) = clockPhases;
        
        //#line 1346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::io::Deserializer _StackAllocate_deser2;
         _StackAllocate_deser2._constructor(bytes2);
        ::x10::io::Deserializer* deser2(&_StackAllocate_deser2);
        
        //#line 1347 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        try {
            
            //#line 1348 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10::lang::Any* resultPrime = deser2->x10::io::Deserializer::readAny();
            
            //#line 1349 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10aux::nullCheck(me2)->FMGL(t) = (__extension__ ({
                ::x10::util::Box< ::x10::lang::Any*>* alloc__77970 =  (new (::x10aux::alloc_z< ::x10::util::Box< ::x10::lang::Any*> >()) ::x10::util::Box< ::x10::lang::Any*>());
                (alloc__77970)->::x10::util::Box< ::x10::lang::Any*>::_constructor(
                  resultPrime);
                alloc__77970;
            }))
            ;
        }
        catch (::x10::lang::CheckedThrowable* __exc1644) {
            if (true) {
                ::x10::lang::CheckedThrowable* e = static_cast< ::x10::lang::CheckedThrowable*>(__exc1644);
                {
                    
                    //#line 1351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ::x10aux::nullCheck(me2)->FMGL(e) = e;
                }
            } else
            throw;
        }
        
        //#line 1353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::nullCheck(me2)->release();
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::Runtime__Remote< ::x10::lang::Any*>* > box;
    ::x10::lang::Activity__ClockPhases* clockPhases;
    ::x10::lang::Rail< x10_byte >* bytes2;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->box);
        buf.write(this->clockPhases);
        buf.write(this->bytes2);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Runtime__closure__20* storage = ::x10aux::alloc_z<x10_lang_Runtime__closure__20>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::Runtime__Remote< ::x10::lang::Any*>* > that_box = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Runtime__Remote< ::x10::lang::Any*>* > >();
        ::x10::lang::Activity__ClockPhases* that_clockPhases = buf.read< ::x10::lang::Activity__ClockPhases*>();
        ::x10::lang::Rail< x10_byte >* that_bytes2 = buf.read< ::x10::lang::Rail< x10_byte >*>();
        x10_lang_Runtime__closure__20* this_ = new (storage) x10_lang_Runtime__closure__20(that_box, that_clockPhases, that_bytes2);
        return this_;
    }
    
    x10_lang_Runtime__closure__20(::x10::lang::GlobalRef< ::x10::lang::Runtime__Remote< ::x10::lang::Any*>* > box, ::x10::lang::Activity__ClockPhases* clockPhases, ::x10::lang::Rail< x10_byte >* bytes2) : box(box), clockPhases(clockPhases), bytes2(bytes2) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10:1342-1354";
    }

};

#endif // X10_LANG_RUNTIME__CLOSURE__20_CLOSURE
#ifndef X10_LANG_RUNTIME__CLOSURE__21_CLOSURE
#define X10_LANG_RUNTIME__CLOSURE__21_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_Runtime__closure__21 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__21> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 1362 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime__Remote< ::x10::lang::Any*>* me2 = (box)->__apply();
        
        //#line 1363 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::nullCheck(me2)->FMGL(e) = e;
        
        //#line 1364 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::nullCheck(me2)->FMGL(clockPhases) = clockPhases;
        
        //#line 1365 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::nullCheck(me2)->release();
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::Runtime__Remote< ::x10::lang::Any*>* > box;
    ::x10::lang::CheckedThrowable* e;
    ::x10::lang::Activity__ClockPhases* clockPhases;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->box);
        buf.write(this->e);
        buf.write(this->clockPhases);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Runtime__closure__21* storage = ::x10aux::alloc_z<x10_lang_Runtime__closure__21>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::Runtime__Remote< ::x10::lang::Any*>* > that_box = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Runtime__Remote< ::x10::lang::Any*>* > >();
        ::x10::lang::CheckedThrowable* that_e = buf.read< ::x10::lang::CheckedThrowable*>();
        ::x10::lang::Activity__ClockPhases* that_clockPhases = buf.read< ::x10::lang::Activity__ClockPhases*>();
        x10_lang_Runtime__closure__21* this_ = new (storage) x10_lang_Runtime__closure__21(that_box, that_e, that_clockPhases);
        return this_;
    }
    
    x10_lang_Runtime__closure__21(::x10::lang::GlobalRef< ::x10::lang::Runtime__Remote< ::x10::lang::Any*>* > box, ::x10::lang::CheckedThrowable* e, ::x10::lang::Activity__ClockPhases* clockPhases) : box(box), e(e), clockPhases(clockPhases) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10:1361-1366";
    }

};

#endif // X10_LANG_RUNTIME__CLOSURE__21_CLOSURE
#ifndef X10_LANG_RUNTIME__CLOSURE__19_CLOSURE
#define X10_LANG_RUNTIME__CLOSURE__19_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_Runtime__closure__19 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__19> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 1332 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10aux::nullCheck(::x10::lang::Runtime::activity())->FMGL(clockPhases) =
              clockPhases;
            
            //#line 1333 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            try {
                
                //#line 1334 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                try {
                    
                    //#line 1336 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ::x10::io::Deserializer _StackAllocate_deser;
                     _StackAllocate_deser._constructor(bytes);
                    ::x10::io::Deserializer* deser(&_StackAllocate_deser);
                    
                    //#line 1337 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ::x10::lang::Fun_0_0< ::x10::lang::Any*>* evalPrime =
                      ::x10aux::class_cast< ::x10::lang::Fun_0_0< ::x10::lang::Any*>*>(deser->x10::io::Deserializer::readAny());
                    
                    //#line 1338 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ::x10::lang::Any* result = ::x10::lang::Fun_0_0< ::x10::lang::Any*>::__apply(::x10aux::nullCheck(evalPrime));
                    
                    //#line 1339 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ::x10::io::Serializer _StackAllocate_ser2;
                     _StackAllocate_ser2._constructor();
                    ::x10::io::Serializer* ser2(&_StackAllocate_ser2);
                    
                    //#line 1340 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ser2->x10::io::Serializer::writeAny(result);
                    
                    //#line 1341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ::x10::lang::Rail< x10_byte >* bytes2 = ser2->x10::io::Serializer::toRail();
                    
                    //#line 1342 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ::x10::lang::VoidFun_0_0* closure = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Runtime__closure__20)))x10_lang_Runtime__closure__20(box, clockPhases, bytes2)));
                    
                    //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    x10_long id__104450 = ::x10::lang::Place::place((box)->location)->FMGL(id);
                    ::x10::lang::VoidFun_0_0* msgBody__104451 = closure;
                    ::x10::lang::Runtime__Profile* prof__104452 =
                      ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                    
                    //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ::x10aux::run_closure_at((x10_int)id__104450, msgBody__104451, reinterpret_cast< ::x10::lang::Runtime__Profile*>(X10_NULL), ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                    
                    //#line 1356 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ::x10aux::dealloc(closure);
                }
                catch (::x10::lang::CheckedThrowable* __exc1645) {
                    if (::x10aux::instanceof< ::x10::lang::Runtime__AtCheckedWrapper*>(__exc1645)) {
                        ::x10::lang::Runtime__AtCheckedWrapper* t =
                          static_cast< ::x10::lang::Runtime__AtCheckedWrapper*>(__exc1645);
                        {
                            
                            //#line 1358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                            ::x10aux::throwException(::x10aux::nullCheck(::x10aux::nullCheck(t)->x10::lang::Runtime__AtCheckedWrapper::getCheckedCause()));
                        }
                    } else
                    throw;
                }
            }
            catch (::x10::lang::CheckedThrowable* __exc1646) {
                if (true) {
                    ::x10::lang::CheckedThrowable* e = static_cast< ::x10::lang::CheckedThrowable*>(__exc1646);
                    {
                        
                        //#line 1361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        ::x10::lang::VoidFun_0_0* closure = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Runtime__closure__21)))x10_lang_Runtime__closure__21(box, e, clockPhases)));
                        
                        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        x10_long id__104453 = ::x10::lang::Place::place((box)->location)->FMGL(id);
                        ::x10::lang::VoidFun_0_0* msgBody__104454 =
                          closure;
                        ::x10::lang::Runtime__Profile* prof__104455 =
                          ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                        
                        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        ::x10aux::run_closure_at((x10_int)id__104453, msgBody__104454, reinterpret_cast< ::x10::lang::Runtime__Profile*>(X10_NULL), ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                        
                        //#line 1368 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        ::x10aux::dealloc(closure);
                    }
                } else
                throw;
            }
            
            //#line 1370 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10aux::nullCheck(::x10::lang::Runtime::activity())->FMGL(clockPhases) =
              (::x10aux::class_cast_unchecked< ::x10::lang::Activity__ClockPhases*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        }
        catch (::x10::lang::CheckedThrowable* __exc1647) {
            if (::x10aux::instanceof< ::x10::lang::Error*>(__exc1647)) {
                ::x10::lang::Error* __lowerer__var__0__ =
                  static_cast< ::x10::lang::Error*>(__exc1647);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(__lowerer__var__0__));
                }
            } else
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__1__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1647);
                {
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::ensureException(
                                                                   __lowerer__var__1__)));
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::Activity__ClockPhases* clockPhases;
    ::x10::lang::Rail< x10_byte >* bytes;
    ::x10::lang::GlobalRef< ::x10::lang::Runtime__Remote< ::x10::lang::Any*>* > box;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->clockPhases);
        buf.write(this->bytes);
        buf.write(this->box);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Runtime__closure__19* storage = ::x10aux::alloc_z<x10_lang_Runtime__closure__19>();
        buf.record_reference(storage);
        ::x10::lang::Activity__ClockPhases* that_clockPhases = buf.read< ::x10::lang::Activity__ClockPhases*>();
        ::x10::lang::Rail< x10_byte >* that_bytes = buf.read< ::x10::lang::Rail< x10_byte >*>();
        ::x10::lang::GlobalRef< ::x10::lang::Runtime__Remote< ::x10::lang::Any*>* > that_box = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Runtime__Remote< ::x10::lang::Any*>* > >();
        x10_lang_Runtime__closure__19* this_ = new (storage) x10_lang_Runtime__closure__19(that_clockPhases, that_bytes, that_box);
        return this_;
    }
    
    x10_lang_Runtime__closure__19(::x10::lang::Activity__ClockPhases* clockPhases, ::x10::lang::Rail< x10_byte >* bytes, ::x10::lang::GlobalRef< ::x10::lang::Runtime__Remote< ::x10::lang::Any*>* > box) : clockPhases(clockPhases), bytes(bytes), box(box) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10:1331-1371";
    }

};

#endif // X10_LANG_RUNTIME__CLOSURE__19_CLOSURE

//#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::x10rtSendMessage(x10_long id, ::x10::lang::VoidFun_0_0* msgBody,
                                          ::x10::lang::Runtime__Profile* prof) {
    
    //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::run_closure_at((x10_int)id, msgBody, prof, ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}

//#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::String*>*
  x10::lang::Runtime::FMGL(env);
void x10::lang::Runtime::FMGL(env__do_init)() {
    FMGL(env__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Runtime.env");
    ::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::String*>* __var1572__ = ::x10::lang::RuntimeNatives::loadenv();
    FMGL(env) = __var1572__;
    FMGL(env__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Runtime::FMGL(env__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(env__status), &FMGL(env__do_init), &FMGL(env__exception), "x10::lang::Runtime.env");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Runtime::FMGL(env__status);
::x10::lang::CheckedThrowable* x10::lang::Runtime::FMGL(env__exception);

//#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
x10_boolean x10::lang::Runtime::FMGL(STRICT_FINISH);
void x10::lang::Runtime::FMGL(STRICT_FINISH__do_init)() {
    FMGL(STRICT_FINISH__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Runtime.STRICT_FINISH");
    x10_boolean __var1573__ = ::x10::lang::Configuration::strict_finish();
    FMGL(STRICT_FINISH) = __var1573__;
    FMGL(STRICT_FINISH__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Runtime::FMGL(STRICT_FINISH__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(STRICT_FINISH__status), &FMGL(STRICT_FINISH__do_init), &FMGL(STRICT_FINISH__exception), "x10::lang::Runtime.STRICT_FINISH");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Runtime::FMGL(STRICT_FINISH__status);
::x10::lang::CheckedThrowable* x10::lang::Runtime::FMGL(STRICT_FINISH__exception);

//#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
x10_int x10::lang::Runtime::FMGL(NTHREADS);
void x10::lang::Runtime::FMGL(NTHREADS__do_init)() {
    FMGL(NTHREADS__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Runtime.NTHREADS");
    x10_int __var1574__ = ::x10::lang::Configuration::nthreads();
    FMGL(NTHREADS) = __var1574__;
    FMGL(NTHREADS__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Runtime::FMGL(NTHREADS__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(NTHREADS__status), &FMGL(NTHREADS__do_init), &FMGL(NTHREADS__exception), "x10::lang::Runtime.NTHREADS");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Runtime::FMGL(NTHREADS__status);
::x10::lang::CheckedThrowable* x10::lang::Runtime::FMGL(NTHREADS__exception);

//#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
x10_int x10::lang::Runtime::FMGL(MAX_THREADS);
void x10::lang::Runtime::FMGL(MAX_THREADS__do_init)() {
    FMGL(MAX_THREADS__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Runtime.MAX_THREADS");
    x10_int __var1575__ = ::x10::lang::Configuration::max_threads();
    FMGL(MAX_THREADS) = __var1575__;
    FMGL(MAX_THREADS__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Runtime::FMGL(MAX_THREADS__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(MAX_THREADS__status), &FMGL(MAX_THREADS__do_init), &FMGL(MAX_THREADS__exception), "x10::lang::Runtime.MAX_THREADS");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Runtime::FMGL(MAX_THREADS__status);
::x10::lang::CheckedThrowable* x10::lang::Runtime::FMGL(MAX_THREADS__exception);

//#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
x10_boolean x10::lang::Runtime::FMGL(STATIC_THREADS);
void x10::lang::Runtime::FMGL(STATIC_THREADS__do_init)() {
    FMGL(STATIC_THREADS__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Runtime.STATIC_THREADS");
    x10_boolean __var1576__ = ::x10::lang::Configuration::static_threads();
    FMGL(STATIC_THREADS) = __var1576__;
    FMGL(STATIC_THREADS__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Runtime::FMGL(STATIC_THREADS__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(STATIC_THREADS__status), &FMGL(STATIC_THREADS__do_init), &FMGL(STATIC_THREADS__exception), "x10::lang::Runtime.STATIC_THREADS");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Runtime::FMGL(STATIC_THREADS__status);
::x10::lang::CheckedThrowable* x10::lang::Runtime::FMGL(STATIC_THREADS__exception);

//#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
x10_boolean x10::lang::Runtime::FMGL(WARN_ON_THREAD_CREATION);
void x10::lang::Runtime::FMGL(WARN_ON_THREAD_CREATION__do_init)() {
    FMGL(WARN_ON_THREAD_CREATION__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Runtime.WARN_ON_THREAD_CREATION");
    x10_boolean __var1577__ = ::x10::lang::Configuration::warn_on_thread_creation();
    FMGL(WARN_ON_THREAD_CREATION) = __var1577__;
    FMGL(WARN_ON_THREAD_CREATION__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Runtime::FMGL(WARN_ON_THREAD_CREATION__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(WARN_ON_THREAD_CREATION__status), &FMGL(WARN_ON_THREAD_CREATION__do_init), &FMGL(WARN_ON_THREAD_CREATION__exception), "x10::lang::Runtime.WARN_ON_THREAD_CREATION");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Runtime::FMGL(WARN_ON_THREAD_CREATION__status);
::x10::lang::CheckedThrowable* x10::lang::Runtime::FMGL(WARN_ON_THREAD_CREATION__exception);

//#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
x10_boolean x10::lang::Runtime::FMGL(BUSY_WAITING);
void x10::lang::Runtime::FMGL(BUSY_WAITING__do_init)() {
    FMGL(BUSY_WAITING__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Runtime.BUSY_WAITING");
    x10_boolean __var1578__ = ::x10::lang::Configuration::busy_waiting();
    FMGL(BUSY_WAITING) = __var1578__;
    FMGL(BUSY_WAITING__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Runtime::FMGL(BUSY_WAITING__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(BUSY_WAITING__status), &FMGL(BUSY_WAITING__do_init), &FMGL(BUSY_WAITING__exception), "x10::lang::Runtime.BUSY_WAITING");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Runtime::FMGL(BUSY_WAITING__status);
::x10::lang::CheckedThrowable* x10::lang::Runtime::FMGL(BUSY_WAITING__exception);

//#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
x10_int x10::lang::Runtime::FMGL(RESILIENT_MODE);
void x10::lang::Runtime::FMGL(RESILIENT_MODE__do_init)() {
    FMGL(RESILIENT_MODE__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Runtime.RESILIENT_MODE");
    x10_int __var1579__ = ::x10::lang::Configuration::resilient_mode();
    FMGL(RESILIENT_MODE) = __var1579__;
    FMGL(RESILIENT_MODE__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Runtime::FMGL(RESILIENT_MODE__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(RESILIENT_MODE__status), &FMGL(RESILIENT_MODE__do_init), &FMGL(RESILIENT_MODE__exception), "x10::lang::Runtime.RESILIENT_MODE");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Runtime::FMGL(RESILIENT_MODE__status);
::x10::lang::CheckedThrowable* x10::lang::Runtime::FMGL(RESILIENT_MODE__exception);

//#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
x10_double x10::lang::Runtime::FMGL(CHUNK_DELTA);
void x10::lang::Runtime::FMGL(CHUNK_DELTA__do_init)() {
    FMGL(CHUNK_DELTA__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Runtime.CHUNK_DELTA");
    x10_double __var1580__ = ::x10::lang::Configuration::deltaCustom();
    FMGL(CHUNK_DELTA) = __var1580__;
    FMGL(CHUNK_DELTA__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Runtime::FMGL(CHUNK_DELTA__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(CHUNK_DELTA__status), &FMGL(CHUNK_DELTA__do_init), &FMGL(CHUNK_DELTA__exception), "x10::lang::Runtime.CHUNK_DELTA");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Runtime::FMGL(CHUNK_DELTA__status);
::x10::lang::CheckedThrowable* x10::lang::Runtime::FMGL(CHUNK_DELTA__exception);

//#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 266 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::util::concurrent::Monitor* x10::lang::Runtime::FMGL(staticMonitor);
void x10::lang::Runtime::FMGL(staticMonitor__do_init)() {
    FMGL(staticMonitor__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Runtime.staticMonitor");
    ::x10::util::concurrent::Monitor* __var1581__ = ::x10::util::concurrent::Monitor::_make();
    FMGL(staticMonitor) = __var1581__;
    FMGL(staticMonitor__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Runtime::FMGL(staticMonitor__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(staticMonitor__status), &FMGL(staticMonitor__do_init), &FMGL(staticMonitor__exception), "x10::lang::Runtime.staticMonitor");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Runtime::FMGL(staticMonitor__status);
::x10::lang::CheckedThrowable* x10::lang::Runtime::FMGL(staticMonitor__exception);

//#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::util::concurrent::Monitor* x10::lang::Runtime::FMGL(atomicMonitor);
void x10::lang::Runtime::FMGL(atomicMonitor__do_init)() {
    FMGL(atomicMonitor__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Runtime.atomicMonitor");
    ::x10::util::concurrent::Monitor* __var1582__ = ::x10::util::concurrent::Monitor::_make();
    FMGL(atomicMonitor) = __var1582__;
    FMGL(atomicMonitor__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Runtime::FMGL(atomicMonitor__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(atomicMonitor__status), &FMGL(atomicMonitor__do_init), &FMGL(atomicMonitor__exception), "x10::lang::Runtime.atomicMonitor");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Runtime::FMGL(atomicMonitor__status);
::x10::lang::CheckedThrowable* x10::lang::Runtime::FMGL(atomicMonitor__exception);

//#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Runtime__Pool* x10::lang::Runtime::FMGL(pool);
void x10::lang::Runtime::FMGL(pool__do_init)() {
    FMGL(pool__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Runtime.pool");
    ::x10::lang::Runtime__Pool* __var1583__ = ::x10::lang::Runtime__Pool::_make();
    FMGL(pool) = __var1583__;
    FMGL(pool__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Runtime::FMGL(pool__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(pool__status), &FMGL(pool__do_init), &FMGL(pool__exception), "x10::lang::Runtime.pool");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Runtime::FMGL(pool__status);
::x10::lang::CheckedThrowable* x10::lang::Runtime::FMGL(pool__exception);

//#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::FinishState__FinishStates* x10::lang::Runtime::FMGL(finishStates);
void x10::lang::Runtime::FMGL(finishStates__do_init)() {
    FMGL(finishStates__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Runtime.finishStates");
    ::x10::lang::FinishState__FinishStates* __var1584__ = ::x10::lang::FinishState__FinishStates::_make();
    FMGL(finishStates) = __var1584__;
    FMGL(finishStates__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Runtime::FMGL(finishStates__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(finishStates__status), &FMGL(finishStates__do_init), &FMGL(finishStates__exception), "x10::lang::Runtime.finishStates");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Runtime::FMGL(finishStates__status);
::x10::lang::CheckedThrowable* x10::lang::Runtime::FMGL(finishStates__exception);

//#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Runtime__Workers* x10::lang::Runtime::FMGL(workerInstance);
void x10::lang::Runtime::FMGL(workerInstance__do_init)() {
    FMGL(workerInstance__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Runtime.workerInstance");
    ::x10::lang::Runtime__Workers* __var1585__ = ::x10::lang::Runtime::FMGL(pool__get)()->getWorkers();
    FMGL(workerInstance) = __var1585__;
    FMGL(workerInstance__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Runtime::FMGL(workerInstance__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(workerInstance__status), &FMGL(workerInstance__do_init), &FMGL(workerInstance__exception), "x10::lang::Runtime.workerInstance");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Runtime::FMGL(workerInstance__status);
::x10::lang::CheckedThrowable* x10::lang::Runtime::FMGL(workerInstance__exception);

//#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
x10_int x10::lang::Runtime::FMGL(IdleWorkers);
void x10::lang::Runtime::FMGL(IdleWorkers__do_init)() {
    FMGL(IdleWorkers__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Runtime.IdleWorkers");
    x10_int __var1586__ = ::x10aux::nullCheck(::x10::lang::Runtime::FMGL(workerInstance__get)())->FMGL(idleCount);
    FMGL(IdleWorkers) = __var1586__;
    FMGL(IdleWorkers__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Runtime::FMGL(IdleWorkers__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(IdleWorkers__status), &FMGL(IdleWorkers__do_init), &FMGL(IdleWorkers__exception), "x10::lang::Runtime.IdleWorkers");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Runtime::FMGL(IdleWorkers__status);
::x10::lang::CheckedThrowable* x10::lang::Runtime::FMGL(IdleWorkers__exception);

//#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
x10_int x10::lang::Runtime::retNthreads() {
    
    //#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    return ::x10::lang::Runtime::FMGL(NTHREADS__get)();
    
}

//#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
x10_int x10::lang::Runtime::retIdleWorkers() {
    
    //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    return ::x10::lang::Runtime::FMGL(pool__get)()->FMGL(workers)->FMGL(idleCount);
    
}

//#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
x10_int x10::lang::Runtime::retTotalWorkers() {
    
    //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    return ::x10::lang::Runtime::FMGL(pool__get)()->FMGL(workers)->FMGL(count);
    
}

//#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::wsInit() {
    
    //#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::FMGL(pool__get)()->FMGL(wsBlockedContinuations) =
      ::x10::lang::Deque::_make();
}

//#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Deque* x10::lang::Runtime::wsFIFO() {
    
    //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    return ::x10aux::nullCheck((::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread())))->FMGL(wsfifo);
    
}

//#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::wsBlock(::x10::lang::Any* k) {
    
    //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::nullCheck(::x10::lang::Runtime::FMGL(pool__get)()->FMGL(wsBlockedContinuations))->x10::lang::Deque::push(
      k);
}

//#line 304 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::wsUnblock() {
    
    //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Deque* src = ::x10::lang::Runtime::FMGL(pool__get)()->FMGL(wsBlockedContinuations);
    
    //#line 306 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Deque* dst = ::x10aux::nullCheck((::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread())))->FMGL(wsfifo);
    
    //#line 307 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Any* k;
    
    //#line 308 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    while ((!::x10aux::struct_equals((k = ::x10aux::nullCheck(src)->x10::lang::Deque::poll()),
                                     reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        ::x10aux::nullCheck(dst)->x10::lang::Deque::push(
          k);
    }
    
}

//#line 311 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::wsEnd() {
    
    //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::FMGL(pool__get)()->FMGL(wsEnd) =
      true;
}

//#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
x10_boolean x10::lang::Runtime::wsEnded() {
    return ::x10::lang::Runtime::FMGL(pool__get)()->FMGL(wsEnd);
    
}

//#line 765 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Runtime__Worker* x10::lang::Runtime::worker(
  ) {
    return ::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread());
    
}

//#line 770 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
x10_int x10::lang::Runtime::workerId() {
    return ::x10aux::nullCheck((::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread())))->FMGL(workerId);
    
}

//#line 776 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
x10_int x10::lang::Runtime::poolSize() {
    return ::x10::lang::Runtime::FMGL(pool__get)()->size();
    
}

//#line 781 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Activity* x10::lang::Runtime::activity() {
    ::x10::lang::Runtime__Worker* this__104377 = ::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread());
    return ::x10aux::nullCheck(this__104377)->FMGL(activity);
    
}

//#line 786 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 794 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
x10_int x10::lang::Runtime::hereInt(){
    return ::x10aux::here;
}

//#line 798 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
x10_long x10::lang::Runtime::hereLong(){
    return ((x10_long)::x10aux::here);
}

//#line 808 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
x10_int x10::lang::Runtime::surplusActivityCount() {
    ::x10::lang::Runtime__Worker* this__104378 = ::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread());
    return ::x10aux::nullCheck(this__104378)->FMGL(queue)->x10::lang::Deque::size();
    
}

//#line 811 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
/** The finish state that manages the 'main' activity and sub activities. */
::x10::lang::FinishState* x10::lang::Runtime::FMGL(rootFinish);
void x10::lang::Runtime::FMGL(rootFinish__do_init)() {
    FMGL(rootFinish__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Runtime.rootFinish");
    ::x10::lang::FinishState* __var1603__ = ::x10::lang::Runtime::makeDefaultFinish(
                                              ::x10::lang::Runtime::FMGL(pool__get)()->FMGL(latch));
    FMGL(rootFinish) = __var1603__;
    FMGL(rootFinish__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Runtime::FMGL(rootFinish__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(rootFinish__status), &FMGL(rootFinish__do_init), &FMGL(rootFinish__exception), "x10::lang::Runtime.rootFinish");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Runtime::FMGL(rootFinish__status);
::x10::lang::CheckedThrowable* x10::lang::Runtime::FMGL(rootFinish__exception);

//#line 813 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Cell<x10_long>* x10::lang::Runtime::FMGL(processStartNanos_);
void x10::lang::Runtime::FMGL(processStartNanos___do_init)() {
    FMGL(processStartNanos___status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Runtime.processStartNanos_");
    ::x10::lang::Cell<x10_long>* __var1604__ = ::x10::lang::Cell<x10_long>::_make(((x10_long)0ll));
    FMGL(processStartNanos_) = __var1604__;
    FMGL(processStartNanos___status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Runtime::FMGL(processStartNanos___init)() {
    ::x10aux::StaticInitController::initField(&FMGL(processStartNanos___status), &FMGL(processStartNanos___do_init), &FMGL(processStartNanos___exception), "x10::lang::Runtime.processStartNanos_");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Runtime::FMGL(processStartNanos___status);
::x10::lang::CheckedThrowable* x10::lang::Runtime::FMGL(processStartNanos___exception);

//#line 814 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
x10_long x10::lang::Runtime::processStartNanos() {
    ::x10::lang::Cell<x10_long>* this__104379 = ::x10::lang::Runtime::FMGL(processStartNanos___get)();
    return this__104379->FMGL(value);
    
}

//#line 845 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::submitUncounted(::x10::lang::VoidFun_0_0* job) {
    
    //#line 846 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime__Worker* this__104387 = ::x10::lang::Runtime::FMGL(pool__get)()->FMGL(workers)->x10::lang::Runtime__Workers::__apply(
                                                   ((x10_int)0));
    
    //#line 567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Activity* activity__104388 = (__extension__ ({
        
        //#line 846 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Activity* alloc__104389 =  (new (::x10aux::alloc_z< ::x10::lang::Activity>()) ::x10::lang::Activity());
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        ::x10::lang::VoidFun_0_0* body__104384 = job;
        ::x10::lang::Place srcPlace__104385 = ::x10::lang::Place::_make(::x10aux::here);
        ::x10::lang::FinishState* finishState__104386 = reinterpret_cast< ::x10::lang::FinishState*>(::x10::lang::FinishState::FMGL(UNCOUNTED_FINISH__get)());
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        ::x10::lang::VoidFun_0_0* body__104381 = body__104384;
        ::x10::lang::Place srcPlace__104382 = srcPlace__104385;
        ::x10::lang::FinishState* finishState__104383 = finishState__104386;
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        (alloc__104389)->::x10::lang::Activity::_constructor(
          body__104381, srcPlace__104382, finishState__104383,
          true, true);
        alloc__104389;
    }))
    ;
    ::x10aux::nullCheck(this__104387)->FMGL(queue)->x10::lang::Deque::push(
      reinterpret_cast< ::x10::lang::Any*>(activity__104388));
    
    //#line 847 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::FMGL(pool__get)()->FMGL(workers)->x10::lang::Runtime__Workers::wakeup();
}

//#line 856 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Runtime__Watcher* x10::lang::Runtime::submit(
  ::x10::lang::VoidFun_0_0* job) {
    
    //#line 857 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime__Watcher* watcher = ::x10::lang::Runtime__Watcher::_make();
    
    //#line 859 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::submitUncounted(reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Runtime__closure__1)))x10_lang_Runtime__closure__1(job, watcher))));
    
    //#line 860 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    return watcher;
    
}

//#line 868 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::start(x10_int n) {
    
    //#line 869 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Cell<x10_long>* this__104391 = ::x10::lang::Runtime::FMGL(processStartNanos___get)();
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    x10_long x__104392 = ::x10::lang::RuntimeNatives::nanoTime();
    this__104391->FMGL(value) = x__104392;
    
    //#line 870 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::FMGL(pool__get)()->__apply(((n) + (((x10_int)1))));
}

//#line 881 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::join() {
    
    //#line 882 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::FMGL(pool__get)()->FMGL(watcher)->x10::lang::Runtime__Watcher::await();
}

//#line 895 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::start(::x10::lang::VoidFun_0_0* job) {
    
    //#line 896 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::start(((::x10::lang::Runtime::FMGL(NTHREADS__get)()) - (((x10_int)1))));
    
    //#line 897 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if ((::x10aux::struct_equals(((x10_long)::x10aux::here),
                                 ((x10_long)0ll)))) {
        
        //#line 899 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime::submitUncounted(reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Runtime__closure__2)))x10_lang_Runtime__closure__2(job))));
    }
    
    //#line 901 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::FMGL(pool__get)()->run();
}

//#line 911 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::terminate() {
    
    //#line 912 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::FMGL(pool__get)()->FMGL(latch)->release();
}

//#line 921 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::terminateAll() {
    
    //#line 922 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (((((x10_long)::x10aux::num_hosts)) >= (((x10_long)1024ll))))
    {
        
        //#line 923 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::VoidFun_0_0* cl1 = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Runtime__closure__3)))x10_lang_Runtime__closure__3()));
        
        //#line 931 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        {
            x10_long i;
            for (i = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
                 ((i) > (((x10_long)0ll))); i = ((i) - (((x10_long)32ll))))
            {
                
                //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                x10_long id__104395 = i;
                ::x10::lang::VoidFun_0_0* msgBody__104396 =
                  cl1;
                ::x10::lang::Runtime__Profile* prof__104397 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                
                //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                ::x10aux::run_closure_at((x10_int)id__104395, msgBody__104396, reinterpret_cast< ::x10::lang::Runtime__Profile*>(X10_NULL), ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            }
        }
        
    } else {
        
        //#line 935 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::VoidFun_0_0* cl = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Runtime__closure__5)))x10_lang_Runtime__closure__5()));
        
        //#line 936 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        {
            x10_long i;
            for (i = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
                 ((i) > (((x10_long)0ll))); i = ((i) - (((x10_long)1ll))))
            {
                
                //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                x10_long id__104398 = i;
                ::x10::lang::VoidFun_0_0* msgBody__104399 =
                  cl;
                ::x10::lang::Runtime__Profile* prof__104400 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                
                //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                ::x10aux::run_closure_at((x10_int)id__104398, msgBody__104399, reinterpret_cast< ::x10::lang::Runtime__Profile*>(X10_NULL), ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            }
        }
        
    }
    
    //#line 912 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::FMGL(pool__get)()->FMGL(latch)->release();
}

//#line 949 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::startDeprecated(::x10::lang::VoidFun_0_0* body) {
    
    //#line 953 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Cell<x10_long>* this__104404 = ::x10::lang::Runtime::FMGL(processStartNanos___get)();
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
    x10_long x__104405 = ::x10::lang::RuntimeNatives::nanoTime();
    this__104404->FMGL(value) = x__104405;
    
    //#line 955 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if ((::x10aux::struct_equals(::x10aux::here, ((x10_int)0))))
    {
        
        //#line 959 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime::FMGL(pool__get)()->__apply(
          ::x10::lang::Runtime::FMGL(NTHREADS__get)());
        
        //#line 960 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime::executeLocal((__extension__ ({
                                               ::x10::lang::Activity* alloc__77960 =
                                                  (new (::x10aux::alloc_z< ::x10::lang::Activity>()) ::x10::lang::Activity());
                                               
                                               //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                                               ::x10::lang::VoidFun_0_0* body__104401 =
                                                 body;
                                               ::x10::lang::Place srcPlace__104402 =
                                                 ::x10::lang::Place::_make(::x10aux::here);
                                               ::x10::lang::FinishState* finishState__104403 =
                                                 ::x10::lang::Runtime::FMGL(rootFinish__get)();
                                               
                                               //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                                               (alloc__77960)->::x10::lang::Activity::_constructor(
                                                 body__104401,
                                                 srcPlace__104402,
                                                 finishState__104403,
                                                 false, true);
                                               alloc__77960;
                                           }))
                                           );
        
        //#line 961 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime::FMGL(pool__get)()->run();
        {
            
            //#line 971 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10::lang::CheckedThrowable* throwable__104506 =
              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                {
                    
                    //#line 972 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ::x10aux::nullCheck(::x10::lang::Runtime::FMGL(rootFinish__get)())->waitForFinish();
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc1622) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__104507 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1622);
                    {
                        throwable__104506 = formal__104507;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__104506)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__104506))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__104506));
                }
                
            }
            
            //#line 974 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (true) {
                
                //#line 976 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                ::x10::lang::Runtime::terminateAll();
            }
            
            //#line 971 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__104506)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__104506)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__104506));
                }
                
            }
            
        }
    } else {
        
        //#line 981 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime::FMGL(pool__get)()->__apply(
          ::x10::lang::Runtime::FMGL(NTHREADS__get)());
        
        //#line 982 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime::FMGL(pool__get)()->run();
    }
    
}

//#line 995 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::runAsync(::x10::lang::Place place,
                                  ::x10::lang::Rail< ::x10::lang::Clock* >* clocks,
                                  ::x10::lang::VoidFun_0_0* body,
                                  ::x10::lang::Runtime__Profile* prof) {
    
    //#line 997 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Activity* a = ::x10::lang::Runtime::activity();
    
    //#line 998 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::nullCheck(a)->ensureNotInAtomic();
    
    //#line 1000 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::FinishState* state = ::x10aux::nullCheck(a)->finishState();
    
    //#line 1001 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Activity__ClockPhases* clockPhases = ::x10::lang::Activity__ClockPhases::make(
                                                        clocks);
    
    //#line 1002 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if ((::x10aux::struct_equals(place->FMGL(id), ((x10_long)::x10aux::here))))
    {
        
        //#line 1004 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10_long start = (!::x10aux::struct_equals(prof, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
          ? (::x10::lang::RuntimeNatives::nanoTime()) : (((x10_long)0ll));
        
        //#line 1005 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::io::Serializer* ser = ::x10::io::Serializer::_make();
        
        //#line 1006 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ser->x10::io::Serializer::writeAny(reinterpret_cast< ::x10::lang::Any*>(body));
        
        //#line 1007 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if ((!::x10aux::struct_equals(prof, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
        {
            
            //#line 1008 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            x10_long end = ::x10::lang::RuntimeNatives::nanoTime();
            
            //#line 1009 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10aux::nullCheck(prof)->FMGL(serializationNanos) =
              ((::x10aux::nullCheck(prof)->FMGL(serializationNanos)) + (((end) - (start))));
            
            //#line 1010 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10aux::nullCheck(prof)->FMGL(bytes) = ((::x10aux::nullCheck(prof)->FMGL(bytes)) + (((x10_long)(ser->x10::io::Serializer::dataBytesWritten()))));
        }
        
        //#line 1014 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::nullCheck(state)->notifySubActivitySpawn(
          place);
        
        //#line 1020 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime::executeLocal((__extension__ ({
                                               ::x10::lang::Activity* alloc__77961 =
                                                  (new (::x10aux::alloc_z< ::x10::lang::Activity>()) ::x10::lang::Activity());
                                               (alloc__77961)->::x10::lang::Activity::_constructor(
                                                 reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Runtime__closure__6)))x10_lang_Runtime__closure__6(ser))),
                                                 ::x10::lang::Place::_make(::x10aux::here),
                                                 state, clockPhases);
                                               alloc__77961;
                                           }))
                                           );
    } else {
        
        //#line 1022 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Place src = ::x10::lang::Place::_make(::x10aux::here);
        
        //#line 1023 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::VoidFun_0_0* closure = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Runtime__closure__7)))x10_lang_Runtime__closure__7(body, src, state, clockPhases)));
        
        //#line 1025 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::run_closure_at((x10_int)place->FMGL(id), closure, prof, reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Runtime__closure__8)))x10_lang_Runtime__closure__8(state, place))));
        
        //#line 1026 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::dealloc(closure);
    }
    
    //#line 1028 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::dealloc(body);
}

//#line 1031 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::runAsync(::x10::lang::Place place,
                                  ::x10::lang::VoidFun_0_0* body,
                                  ::x10::lang::Runtime__Profile* prof) {
    
    //#line 1033 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Activity* a = ::x10::lang::Runtime::activity();
    
    //#line 1034 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::nullCheck(a)->ensureNotInAtomic();
    
    //#line 1036 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::FinishState* state = ::x10aux::nullCheck(a)->finishState();
    
    //#line 1037 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if ((::x10aux::struct_equals(place->FMGL(id), ((x10_long)::x10aux::here))))
    {
        
        //#line 1039 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10_long start = (!::x10aux::struct_equals(prof, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
          ? (::x10::lang::RuntimeNatives::nanoTime()) : (((x10_long)0ll));
        
        //#line 1040 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::io::Serializer* ser = ::x10::io::Serializer::_make();
        
        //#line 1041 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ser->x10::io::Serializer::writeAny(reinterpret_cast< ::x10::lang::Any*>(body));
        
        //#line 1042 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if ((!::x10aux::struct_equals(prof, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
        {
            
            //#line 1043 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            x10_long end = ::x10::lang::RuntimeNatives::nanoTime();
            
            //#line 1044 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10aux::nullCheck(prof)->FMGL(serializationNanos) =
              ((::x10aux::nullCheck(prof)->FMGL(serializationNanos)) + (((end) - (start))));
            
            //#line 1045 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10aux::nullCheck(prof)->FMGL(bytes) = ((::x10aux::nullCheck(prof)->FMGL(bytes)) + (((x10_long)(ser->x10::io::Serializer::dataBytesWritten()))));
        }
        
        //#line 1049 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::nullCheck(state)->notifySubActivitySpawn(
          place);
        
        //#line 1055 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime::executeLocal((__extension__ ({
                                               ::x10::lang::Activity* alloc__77963 =
                                                  (new (::x10aux::alloc_z< ::x10::lang::Activity>()) ::x10::lang::Activity());
                                               
                                               //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                                               ::x10::lang::Place srcPlace__104410 =
                                                 ::x10::lang::Place::_make(::x10aux::here);
                                               ::x10::lang::FinishState* finishState__104411 =
                                                 state;
                                               
                                               //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                                               ::x10::lang::Place srcPlace__104408 =
                                                 srcPlace__104410;
                                               ::x10::lang::FinishState* finishState__104409 =
                                                 finishState__104411;
                                               
                                               //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                                               (alloc__77963)->::x10::lang::Activity::_constructor(
                                                 reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Runtime__closure__9)))x10_lang_Runtime__closure__9(ser))),
                                                 srcPlace__104408,
                                                 finishState__104409,
                                                 true, true);
                                               alloc__77963;
                                           }))
                                           );
    } else {
        
        //#line 1058 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::run_async_at((x10_long)(place->FMGL(id)), body, state, prof, reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Runtime__closure__10)))x10_lang_Runtime__closure__10(state, place))));
    }
    
    //#line 1060 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::dealloc(body);
}

//#line 1066 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::runAsync(::x10::lang::Rail< ::x10::lang::Clock* >* clocks,
                                  ::x10::lang::VoidFun_0_0* body) {
    
    //#line 1068 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Activity* a = ::x10::lang::Runtime::activity();
    
    //#line 1069 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::nullCheck(a)->ensureNotInAtomic();
    
    //#line 1071 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::FinishState* state = ::x10aux::nullCheck(a)->finishState();
    
    //#line 1072 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Activity__ClockPhases* clockPhases = ::x10::lang::Activity__ClockPhases::make(
                                                        clocks);
    
    //#line 1073 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::nullCheck(state)->notifySubActivitySpawn(::x10::lang::Place::_make(::x10aux::here));
    
    //#line 1074 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::executeLocal((__extension__ ({
                                           ::x10::lang::Activity* alloc__77964 =
                                              (new (::x10aux::alloc_z< ::x10::lang::Activity>()) ::x10::lang::Activity());
                                           (alloc__77964)->::x10::lang::Activity::_constructor(
                                             body, ::x10::lang::Place::_make(::x10aux::here),
                                             state, clockPhases);
                                           alloc__77964;
                                       }))
                                       );
}

//#line 1077 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::runAsync(::x10::lang::VoidFun_0_0* body) {
    
    //#line 1079 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Activity* a = ::x10::lang::Runtime::activity();
    
    //#line 1080 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::nullCheck(a)->ensureNotInAtomic();
    
    //#line 1082 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::FinishState* state = ::x10aux::nullCheck(a)->finishState();
    
    //#line 1083 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::nullCheck(state)->notifySubActivitySpawn(::x10::lang::Place::_make(::x10aux::here));
    
    //#line 1084 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::executeLocal((__extension__ ({
                                           ::x10::lang::Activity* alloc__77965 =
                                              (new (::x10aux::alloc_z< ::x10::lang::Activity>()) ::x10::lang::Activity());
                                           
                                           //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                                           ::x10::lang::VoidFun_0_0* body__104415 =
                                             body;
                                           ::x10::lang::Place srcPlace__104416 =
                                             ::x10::lang::Place::_make(::x10aux::here);
                                           ::x10::lang::FinishState* finishState__104417 =
                                             state;
                                           
                                           //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                                           ::x10::lang::VoidFun_0_0* body__104412 =
                                             body__104415;
                                           ::x10::lang::Place srcPlace__104413 =
                                             srcPlace__104416;
                                           ::x10::lang::FinishState* finishState__104414 =
                                             finishState__104417;
                                           
                                           //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                                           (alloc__77965)->::x10::lang::Activity::_constructor(
                                             body__104412,
                                             srcPlace__104413,
                                             finishState__104414,
                                             true, true);
                                           alloc__77965;
                                       }))
                                       );
}

//#line 1087 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::runFinish(::x10::lang::VoidFun_0_0* body) {
    {
        
        //#line 1088 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime::ensureNotInAtomic();
        ::x10::lang::FinishState* x10____var16 = ::x10::lang::Runtime::startFinish();
        {
            ::x10::lang::CheckedThrowable* throwable__104509 =
              ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                try {
                    {
                        ::x10::lang::VoidFun_0_0::__apply(::x10aux::nullCheck(body));
                    }
                }
                catch (::x10::lang::CheckedThrowable* __exc1628) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc1628);
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
            catch (::x10::lang::CheckedThrowable* __exc1629) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__104510 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1629);
                    {
                        throwable__104509 = formal__104510;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__104509)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__104509))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__104509));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::stopFinish(x10____var16);
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__104509)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__104509)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__104509));
                }
                
            }
            
        }
    }
}

//#line 1094 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::runUncountedAsync(::x10::lang::Place place,
                                           ::x10::lang::VoidFun_0_0* body,
                                           ::x10::lang::Runtime__Profile* prof) {
    
    //#line 1096 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Activity* a = ::x10::lang::Runtime::activity();
    
    //#line 1097 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::nullCheck(a)->ensureNotInAtomic();
    
    //#line 1099 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if ((::x10aux::struct_equals(place->FMGL(id), ((x10_long)::x10aux::here))))
    {
        
        //#line 1101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10_long start = (!::x10aux::struct_equals(prof, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
          ? (::x10::lang::RuntimeNatives::nanoTime()) : (((x10_long)0ll));
        
        //#line 1102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::io::Serializer* ser = ::x10::io::Serializer::_make();
        
        //#line 1103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ser->x10::io::Serializer::writeAny(reinterpret_cast< ::x10::lang::Any*>(body));
        
        //#line 1104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if ((!::x10aux::struct_equals(prof, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
        {
            
            //#line 1105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            x10_long end = ::x10::lang::RuntimeNatives::nanoTime();
            
            //#line 1106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10aux::nullCheck(prof)->FMGL(serializationNanos) =
              ((::x10aux::nullCheck(prof)->FMGL(serializationNanos)) + (((end) - (start))));
            
            //#line 1107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10aux::nullCheck(prof)->FMGL(bytes) = ((::x10aux::nullCheck(prof)->FMGL(bytes)) + (((x10_long)(ser->x10::io::Serializer::dataBytesWritten()))));
        }
        
        //#line 1116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime::executeLocal((__extension__ ({
                                               ::x10::lang::Activity* alloc__77966 =
                                                  (new (::x10aux::alloc_z< ::x10::lang::Activity>()) ::x10::lang::Activity());
                                               
                                               //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                                               ::x10::lang::Place srcPlace__104422 =
                                                 ::x10::lang::Place::_make(::x10aux::here);
                                               ::x10::lang::FinishState* finishState__104423 =
                                                 reinterpret_cast< ::x10::lang::FinishState*>(::x10::lang::FinishState::FMGL(UNCOUNTED_FINISH__get)());
                                               
                                               //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                                               ::x10::lang::Place srcPlace__104420 =
                                                 srcPlace__104422;
                                               ::x10::lang::FinishState* finishState__104421 =
                                                 finishState__104423;
                                               
                                               //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                                               (alloc__77966)->::x10::lang::Activity::_constructor(
                                                 reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Runtime__closure__11)))x10_lang_Runtime__closure__11(ser))),
                                                 srcPlace__104420,
                                                 finishState__104421,
                                                 true, true);
                                               alloc__77966;
                                           }))
                                           );
    } else {
        
        //#line 1120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::VoidFun_0_0* closure = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Runtime__closure__12)))x10_lang_Runtime__closure__12(body)));
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10_long id__104424 = place->FMGL(id);
        ::x10::lang::VoidFun_0_0* msgBody__104425 = closure;
        ::x10::lang::Runtime__Profile* prof__104426 = prof;
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::run_closure_at((x10_int)id__104424, msgBody__104425, prof__104426, ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
        //#line 1122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::dealloc(closure);
    }
    
    //#line 1124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::dealloc(body);
}

//#line 1130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::runUncountedAsync(::x10::lang::VoidFun_0_0* body) {
    
    //#line 1132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Activity* a = ::x10::lang::Runtime::activity();
    
    //#line 1133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::nullCheck(a)->ensureNotInAtomic();
    
    //#line 1135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::executeLocal((__extension__ ({
                                           ::x10::lang::Activity* alloc__77969 =
                                              (new (::x10aux::alloc_z< ::x10::lang::Activity>()) ::x10::lang::Activity());
                                           
                                           //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                                           ::x10::lang::VoidFun_0_0* body__104430 =
                                             body;
                                           ::x10::lang::Place srcPlace__104431 =
                                             ::x10::lang::Place::_make(::x10aux::here);
                                           ::x10::lang::FinishState* finishState__104432 =
                                             reinterpret_cast< ::x10::lang::FinishState*>((__extension__ ({
                                               
                                               //#line 1135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                               ::x10::lang::FinishState__UncountedFinish* alloc__104433 =
                                                  (new (::x10aux::alloc_z< ::x10::lang::FinishState__UncountedFinish>()) ::x10::lang::FinishState__UncountedFinish());
                                               (alloc__104433)->::x10::lang::FinishState__UncountedFinish::_constructor();
                                               alloc__104433;
                                           }))
                                           );
                                           
                                           //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                                           ::x10::lang::VoidFun_0_0* body__104427 =
                                             body__104430;
                                           ::x10::lang::Place srcPlace__104428 =
                                             srcPlace__104431;
                                           ::x10::lang::FinishState* finishState__104429 =
                                             finishState__104432;
                                           
                                           //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                                           (alloc__77969)->::x10::lang::Activity::_constructor(
                                             body__104427,
                                             srcPlace__104428,
                                             finishState__104429,
                                             true, true);
                                           alloc__77969;
                                       }))
                                       );
}

//#line 1149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 1166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 1182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::runAtNonResilient(::x10::lang::Place place,
                                           ::x10::lang::VoidFun_0_0* body,
                                           ::x10::lang::Runtime__Profile* prof) {
    
    //#line 1183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::ensureNotInAtomic();
    
    //#line 1184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if ((::x10aux::struct_equals(place->FMGL(id), ((x10_long)::x10aux::here))))
    {
        
        //#line 1185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        try {
            
            //#line 1186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            try {
                
                //#line 1187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                ::x10::lang::VoidFun_0_0::__apply(::x10aux::nullCheck(::x10::lang::Runtime::deepCopy< ::x10::lang::VoidFun_0_0* >(
                                                                        body,
                                                                        prof)));
                
                //#line 1188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                return;
            }
            catch (::x10::lang::CheckedThrowable* __exc1634) {
                if (::x10aux::instanceof< ::x10::lang::Runtime__AtCheckedWrapper*>(__exc1634)) {
                    ::x10::lang::Runtime__AtCheckedWrapper* t =
                      static_cast< ::x10::lang::Runtime__AtCheckedWrapper*>(__exc1634);
                    {
                        
                        //#line 1190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        ::x10aux::throwException(::x10aux::nullCheck(::x10aux::nullCheck(t)->x10::lang::Runtime__AtCheckedWrapper::getCheckedCause()));
                    }
                } else
                throw;
            }
        }
        catch (::x10::lang::CheckedThrowable* __exc1635) {
            if (true) {
                ::x10::lang::CheckedThrowable* t = static_cast< ::x10::lang::CheckedThrowable*>(__exc1635);
                {
                    
                    //#line 1193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Runtime::deepCopy< ::x10::lang::CheckedThrowable* >(
                                                                   t,
                                                                   ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))));
                }
            } else
            throw;
        }
    }
    
    //#line 1196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime__RemoteControl _StackAllocate_me;
     _StackAllocate_me._constructor();
    ::x10::lang::Runtime__RemoteControl* me(&_StackAllocate_me);
    
    //#line 1197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::GlobalRef< ::x10::lang::Runtime__RemoteControl* > box =
      ::x10::lang::GlobalRef< ::x10::lang::Runtime__RemoteControl* >(me);
    
    //#line 1198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Activity__ClockPhases* clockPhases = ::x10aux::nullCheck(::x10::lang::Runtime::activity())->FMGL(clockPhases);
    
    //#line 1199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::io::Serializer _StackAllocate_ser;
     _StackAllocate_ser._constructor();
    ::x10::io::Serializer* ser(&_StackAllocate_ser);
    
    //#line 1200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ser->x10::io::Serializer::writeAny(reinterpret_cast< ::x10::lang::Any*>(body));
    
    //#line 1201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Rail< x10_byte >* bytes = ser->x10::io::Serializer::toRail();
    
    //#line 1202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::runAsync(place, reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Runtime__closure__13)))x10_lang_Runtime__closure__13(clockPhases, bytes, box))),
                                   prof);
    
    //#line 1232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    me->await();
    
    //#line 1233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::dealloc(body);
    
    //#line 1234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::dealloc(bytes);
    
    //#line 1235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::nullCheck(::x10::lang::Runtime::activity())->FMGL(clockPhases) =
      me->FMGL(clockPhases);
    
    //#line 1236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                  me->FMGL(e)))) {
        
        //#line 1237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::throwException(::x10aux::nullCheck(me->FMGL(e)));
    }
    
}

//#line 1244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::runAt(::x10::lang::Place place, ::x10::lang::VoidFun_0_0* body,
                               ::x10::lang::Runtime__Profile* prof) {
    
    //#line 1245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::nullCheck(::x10aux::nullCheck(::x10::lang::Runtime::activity())->finishState())->runAt(
      place, body, prof);
}

//#line 1253 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::runAtSimple(::x10::lang::Place place,
                                     ::x10::lang::VoidFun_0_0* body,
                                     x10_boolean toWait) {
    
    //#line 1255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if ((::x10aux::struct_equals(place->FMGL(id), ((x10_long)::x10aux::here))))
    {
        
        //#line 1256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::VoidFun_0_0::__apply(::x10aux::nullCheck(::x10::lang::Runtime::deepCopy< ::x10::lang::VoidFun_0_0* >(
                                                                body,
                                                                ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))));
        
        //#line 1257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return;
    }
    
    //#line 1259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (toWait) {
        
        //#line 1260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime__RemoteControl _StackAllocate_me;
         _StackAllocate_me._constructor();
        ::x10::lang::Runtime__RemoteControl* me(&_StackAllocate_me);
        
        //#line 1261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::GlobalRef< ::x10::lang::Runtime__RemoteControl* > box =
          ::x10::lang::GlobalRef< ::x10::lang::Runtime__RemoteControl* >(me);
        
        //#line 1262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::VoidFun_0_0* latchedBody = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Runtime__closure__16)))x10_lang_Runtime__closure__16(body, box)));
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10_long id__104442 = place->FMGL(id);
        ::x10::lang::VoidFun_0_0* msgBody__104443 = latchedBody;
        ::x10::lang::Runtime__Profile* prof__104444 = ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::run_closure_at((x10_int)id__104442, msgBody__104443, reinterpret_cast< ::x10::lang::Runtime__Profile*>(X10_NULL), ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
        //#line 1272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::dealloc(latchedBody);
        
        //#line 1273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        me->await();
    } else {
        
        //#line 1275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::VoidFun_0_0* simpleBody = reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Runtime__closure__18)))x10_lang_Runtime__closure__18(body)));
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10_long id__104445 = place->FMGL(id);
        ::x10::lang::VoidFun_0_0* msgBody__104446 = simpleBody;
        ::x10::lang::Runtime__Profile* prof__104447 = ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::run_closure_at((x10_int)id__104445, msgBody__104446, reinterpret_cast< ::x10::lang::Runtime__Profile*>(X10_NULL), ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
        //#line 1277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::dealloc(simpleBody);
    }
    
    //#line 1280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::dealloc(body);
}

//#line 1311 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Any* x10::lang::Runtime::evalAtNonResilient(
  ::x10::lang::Place place, ::x10::lang::Fun_0_0< ::x10::lang::Any*>* eval,
  ::x10::lang::Runtime__Profile* prof) {
    
    //#line 1312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::ensureNotInAtomic();
    
    //#line 1313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if ((::x10aux::struct_equals(place->FMGL(id), ((x10_long)::x10aux::here))))
    {
        
        //#line 1314 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        try {
            
            //#line 1315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            try {
                
                //#line 1316 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                ::x10::lang::Any* result = ::x10::lang::Fun_0_0< ::x10::lang::Any*>::__apply(::x10aux::nullCheck(::x10::lang::Runtime::deepCopy< ::x10::lang::Fun_0_0< ::x10::lang::Any*>* >(
                                                                                                                   eval,
                                                                                                                   prof)));
                
                //#line 1317 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                return ::x10::lang::Runtime::deepCopy< ::x10::lang::Any* >(
                         result, prof);
                
            }
            catch (::x10::lang::CheckedThrowable* __exc1642) {
                if (::x10aux::instanceof< ::x10::lang::Runtime__AtCheckedWrapper*>(__exc1642)) {
                    ::x10::lang::Runtime__AtCheckedWrapper* t =
                      static_cast< ::x10::lang::Runtime__AtCheckedWrapper*>(__exc1642);
                    {
                        
                        //#line 1319 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        ::x10aux::throwException(::x10aux::nullCheck(::x10aux::nullCheck(t)->x10::lang::Runtime__AtCheckedWrapper::getCheckedCause()));
                    }
                } else
                throw;
            }
        }
        catch (::x10::lang::CheckedThrowable* __exc1643) {
            if (true) {
                ::x10::lang::CheckedThrowable* t = static_cast< ::x10::lang::CheckedThrowable*>(__exc1643);
                {
                    
                    //#line 1322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Runtime::deepCopy< ::x10::lang::CheckedThrowable* >(
                                                                   t,
                                                                   ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))));
                }
            } else
            throw;
        }
    }
    
    //#line 1325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime__Remote< ::x10::lang::Any*> _StackAllocate_me;
     _StackAllocate_me._constructor();
    ::x10::lang::Runtime__Remote< ::x10::lang::Any*>* me(&_StackAllocate_me);
    
    //#line 1326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::GlobalRef< ::x10::lang::Runtime__Remote< ::x10::lang::Any*>* > box =
      ::x10::lang::GlobalRef< ::x10::lang::Runtime__Remote< ::x10::lang::Any*>* >(me);
    
    //#line 1327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Activity__ClockPhases* clockPhases = ::x10aux::nullCheck(::x10::lang::Runtime::activity())->FMGL(clockPhases);
    
    //#line 1328 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::io::Serializer _StackAllocate_ser;
     _StackAllocate_ser._constructor();
    ::x10::io::Serializer* ser(&_StackAllocate_ser);
    
    //#line 1329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ser->x10::io::Serializer::writeAny(reinterpret_cast< ::x10::lang::Any*>(eval));
    
    //#line 1330 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Rail< x10_byte >* bytes = ser->x10::io::Serializer::toRail();
    
    //#line 1331 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::runAsync(place, reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Runtime__closure__19)))x10_lang_Runtime__closure__19(clockPhases, bytes, box))),
                                   prof);
    
    //#line 1372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    me->await();
    
    //#line 1373 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::dealloc(eval);
    
    //#line 1374 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::nullCheck(::x10::lang::Runtime::activity())->FMGL(clockPhases) =
      me->FMGL(clockPhases);
    
    //#line 1375 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                  me->FMGL(e)))) {
        
        //#line 1376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::throwException(::x10aux::nullCheck(me->FMGL(e)));
    }
    
    //#line 1378 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    return ::x10aux::nullCheck(me->FMGL(t))->FMGL(value);
    
}

//#line 1384 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 1393 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::StaticInitBroadcastDispatcherLock(
  ) {
    
    //#line 1394 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::FMGL(staticMonitor__get)()->lock();
}

//#line 1397 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::StaticInitBroadcastDispatcherAwait(
  ) {
    
    //#line 1398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::FMGL(staticMonitor__get)()->await();
}

//#line 1401 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::StaticInitBroadcastDispatcherUnlock(
  ) {
    
    //#line 1402 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::FMGL(staticMonitor__get)()->unlock();
}

//#line 1405 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::StaticInitBroadcastDispatcherNotify(
  ) {
    
    //#line 1406 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::FMGL(staticMonitor__get)()->release();
}

//#line 1411 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::enterAtomic() {
    
    //#line 1412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->lock();
    
    //#line 1413 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Activity* a = ::x10::lang::Runtime::activity();
    
    //#line 1414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if ((!::x10aux::struct_equals(a, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        
        //#line 1415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::nullCheck(a)->pushAtomic();
    }
    
}

//#line 1418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::ensureNotInAtomic() {
    
    //#line 1419 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Activity* a = ::x10::lang::Runtime::activity();
    
    //#line 1420 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if ((!::x10aux::struct_equals(a, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        
        //#line 1421 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::nullCheck(a)->ensureNotInAtomic();
    }
    
}

//#line 1424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::exitAtomic() {
    
    //#line 1425 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Activity* a = ::x10::lang::Runtime::activity();
    
    //#line 1426 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if ((!::x10aux::struct_equals(a, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        
        //#line 1427 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::nullCheck(a)->popAtomic();
    }
    
    //#line 1428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                  ::x10::lang::Runtime::FMGL(pool__get)()->FMGL(wsBlockedContinuations))))
    {
        ::x10::lang::Runtime::wsUnblock();
    }
    
    //#line 1429 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->release();
}

//#line 1432 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::exitWSWhen(x10_boolean b) {
    
    //#line 1433 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Activity* a = ::x10::lang::Runtime::activity();
    
    //#line 1434 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if ((!::x10aux::struct_equals(a, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        
        //#line 1435 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::nullCheck(a)->popAtomic();
    }
    
    //#line 1436 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (b) {
        
        //#line 1437 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime::wsUnblock();
        
        //#line 1438 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->release();
    } else {
        
        //#line 1440 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->unlock();
    }
    
}

//#line 1444 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::awaitAtomic() {
    
    //#line 1445 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::FMGL(atomicMonitor__get)()->await();
}

//#line 1449 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::FinishState* x10::lang::Runtime::makeDefaultFinish(
  ) {
    
    //#line 1450 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if ((::x10aux::struct_equals(::x10::lang::Runtime::FMGL(RESILIENT_MODE__get)(),
                                 ((x10_int)0)))) {
        
        //#line 1451 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::FinishState__Finish* alloc__104457 =
           (new (::x10aux::alloc_z< ::x10::lang::FinishState__Finish>()) ::x10::lang::FinishState__Finish());
        
        //#line 364 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        (alloc__104457)->::x10::lang::FinishState__Finish::_constructor(
          (__extension__ ({
              ::x10::lang::FinishState__RootFinish* alloc__104456 =
                 (new (::x10aux::alloc_z< ::x10::lang::FinishState__RootFinish>()) ::x10::lang::FinishState__RootFinish());
              (alloc__104456)->::x10::lang::FinishState__RootFinish::_constructor();
              alloc__104456;
          }))
          );
        
        //#line 1451 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return alloc__104457;
        
    } else {
        
        //#line 1453 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return ::x10::lang::FinishResilient::make(::x10aux::class_cast_unchecked< ::x10::lang::FinishState*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)),
                                                  ::x10aux::class_cast_unchecked< ::x10::util::concurrent::SimpleLatch*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
    }
    
}

//#line 1455 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::FinishState* x10::lang::Runtime::makeDefaultFinish(
  ::x10::util::concurrent::SimpleLatch* latch) {
    
    //#line 1456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if ((::x10aux::struct_equals(::x10::lang::Runtime::FMGL(RESILIENT_MODE__get)(),
                                 ((x10_int)0)))) {
        
        //#line 1457 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::FinishState__Finish* alloc__104460 =
           (new (::x10aux::alloc_z< ::x10::lang::FinishState__Finish>()) ::x10::lang::FinishState__Finish());
        
        //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        ::x10::util::concurrent::SimpleLatch* latch__104459 =
          latch;
        
        //#line 361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
        (alloc__104460)->::x10::lang::FinishState__Finish::_constructor(
          (__extension__ ({
              ::x10::lang::FinishState__RootFinish* alloc__104458 =
                 (new (::x10aux::alloc_z< ::x10::lang::FinishState__RootFinish>()) ::x10::lang::FinishState__RootFinish());
              (alloc__104458)->::x10::lang::FinishState__RootFinish::_constructor(
                latch__104459);
              alloc__104458;
          }))
          );
        
        //#line 1457 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return alloc__104460;
        
    } else {
        
        //#line 1459 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return ::x10::lang::FinishResilient::make(::x10aux::class_cast_unchecked< ::x10::lang::FinishState*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)),
                                                  latch);
        
    }
    
}

//#line 1466 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::FinishState* x10::lang::Runtime::startFinish(
  ) {
    
    //#line 1467 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    return ::x10aux::nullCheck(::x10::lang::Runtime::activity())->swapFinish(
             ::x10::lang::Runtime::makeDefaultFinish());
    
}

//#line 1470 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::FinishState* x10::lang::Runtime::startFinish(
  x10_int pragma) {
    
    //#line 1471 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::FinishState* f;
    
    //#line 1472 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    switch (pragma) {
        
        //#line 1473 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        case ((x10_int)1): ;
        {
            
            //#line 1474 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            f = (__extension__ ({
                ::x10::lang::FinishState__FinishAsync* alloc__77973 =
                   (new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishAsync>()) ::x10::lang::FinishState__FinishAsync());
                (alloc__77973)->::x10::lang::FinishState__FinishAsync::_constructor();
                alloc__77973;
            }))
            ;
            break;
        }
        //#line 1475 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        case ((x10_int)2): ;
        {
            
            //#line 1476 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            f = (__extension__ ({
                ::x10::lang::FinishState__FinishHere* alloc__77974 =
                   (new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishHere>()) ::x10::lang::FinishState__FinishHere());
                (alloc__77974)->::x10::lang::FinishState__FinishHere::_constructor();
                alloc__77974;
            }))
            ;
            break;
        }
        //#line 1477 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        case ((x10_int)3): ;
        {
            
            //#line 1478 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            f = (__extension__ ({
                ::x10::lang::FinishState__FinishSPMD* alloc__77975 =
                   (new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishSPMD>()) ::x10::lang::FinishState__FinishSPMD());
                (alloc__77975)->::x10::lang::FinishState__FinishSPMD::_constructor();
                alloc__77975;
            }))
            ;
            break;
        }
        //#line 1479 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        case ((x10_int)4): ;
        {
            
            //#line 1480 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            f = (__extension__ ({
                ::x10::lang::FinishState__LocalFinish* alloc__77976 =
                   (new (::x10aux::alloc_z< ::x10::lang::FinishState__LocalFinish>()) ::x10::lang::FinishState__LocalFinish());
                (alloc__77976)->::x10::lang::FinishState__LocalFinish::_constructor();
                alloc__77976;
            }))
            ;
            break;
        }
        //#line 1481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        case ((x10_int)5): ;
        {
            
            //#line 1482 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            f = (__extension__ ({
                ::x10::lang::FinishState__DenseFinish* alloc__77977 =
                   (new (::x10aux::alloc_z< ::x10::lang::FinishState__DenseFinish>()) ::x10::lang::FinishState__DenseFinish());
                
                //#line 608 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                (alloc__77977)->::x10::lang::FinishState__DenseFinish::_constructor(
                  (__extension__ ({
                      ::x10::lang::FinishState__RootFinish* alloc__104461 =
                         (new (::x10aux::alloc_z< ::x10::lang::FinishState__RootFinish>()) ::x10::lang::FinishState__RootFinish());
                      (alloc__104461)->::x10::lang::FinishState__RootFinish::_constructor();
                      alloc__104461;
                  }))
                  );
                alloc__77977;
            }))
            ;
            break;
        }
        //#line 1483 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        case ((x10_int)100): ;
        {
            
            //#line 1484 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            f = (__extension__ ({
                ::x10::lang::FinishState__FinishResilientPlaceZero* alloc__77978 =
                   (new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishResilientPlaceZero>()) ::x10::lang::FinishState__FinishResilientPlaceZero());
                (alloc__77978)->::x10::lang::FinishState__FinishResilientPlaceZero::_constructor(
                  ::x10aux::class_cast_unchecked< ::x10::util::concurrent::SimpleLatch*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                alloc__77978;
            }))
            ;
            break;
        }
        //#line 1485 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        case ((x10_int)101): ;
        {
            
            //#line 1486 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            f = (__extension__ ({
                ::x10::lang::FinishState__FinishResilientZooKeeper* alloc__77979 =
                   (new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishResilientZooKeeper>()) ::x10::lang::FinishState__FinishResilientZooKeeper());
                (alloc__77979)->::x10::lang::FinishState__FinishResilientZooKeeper::_constructor(
                  ::x10aux::class_cast_unchecked< ::x10::util::concurrent::SimpleLatch*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                alloc__77979;
            }))
            ;
            break;
        }
        //#line 1487 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        case ((x10_int)102): ;
        {
            
            //#line 1488 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            f = (__extension__ ({
                ::x10::lang::FinishState__FinishResilientDistributed* alloc__77980 =
                   (new (::x10aux::alloc_z< ::x10::lang::FinishState__FinishResilientDistributed>()) ::x10::lang::FinishState__FinishResilientDistributed());
                (alloc__77980)->::x10::lang::FinishState__FinishResilientDistributed::_constructor(
                  ::x10aux::class_cast_unchecked< ::x10::util::concurrent::SimpleLatch*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                alloc__77980;
            }))
            ;
            break;
        }
        //#line 1489 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        default: ;
        {
            
            //#line 1490 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            f = ::x10::lang::Runtime::makeDefaultFinish();
        }
    }
    
    //#line 1492 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    return ::x10aux::nullCheck(::x10::lang::Runtime::activity())->swapFinish(
             f);
    
}

//#line 1495 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::FinishState* x10::lang::Runtime::startLocalFinish(
  ) {
    
    //#line 1496 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    return ::x10aux::nullCheck(::x10::lang::Runtime::activity())->swapFinish(
             reinterpret_cast< ::x10::lang::FinishState*>((__extension__ ({
                 ::x10::lang::FinishState__LocalFinish* alloc__77981 =
                    (new (::x10aux::alloc_z< ::x10::lang::FinishState__LocalFinish>()) ::x10::lang::FinishState__LocalFinish());
                 (alloc__77981)->::x10::lang::FinishState__LocalFinish::_constructor();
                 alloc__77981;
             }))
             ));
    
}

//#line 1499 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::FinishState* x10::lang::Runtime::startSimpleFinish(
  ) {
    
    //#line 1500 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    return ::x10aux::nullCheck(::x10::lang::Runtime::activity())->swapFinish(
             reinterpret_cast< ::x10::lang::FinishState*>((__extension__ ({
                 ::x10::lang::FinishState__Finish* alloc__77982 =
                    (new (::x10aux::alloc_z< ::x10::lang::FinishState__Finish>()) ::x10::lang::FinishState__Finish());
                 
                 //#line 364 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                 (alloc__77982)->::x10::lang::FinishState__Finish::_constructor(
                   (__extension__ ({
                       ::x10::lang::FinishState__RootFinish* alloc__104462 =
                          (new (::x10aux::alloc_z< ::x10::lang::FinishState__RootFinish>()) ::x10::lang::FinishState__RootFinish());
                       (alloc__104462)->::x10::lang::FinishState__RootFinish::_constructor();
                       alloc__104462;
                   }))
                   );
                 alloc__77982;
             }))
             ));
    
}

//#line 1509 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::stopFinish(::x10::lang::FinishState* f) {
    
    //#line 1510 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Activity* a = ::x10::lang::Runtime::activity();
    
    //#line 1511 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::FinishState* finishState = ::x10aux::nullCheck(a)->swapFinish(
                                              f);
    
    //#line 1512 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::nullCheck(finishState)->waitForFinish();
    
    //#line 1513 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::dealloc(finishState);
}

//#line 1520 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::pushException(::x10::lang::CheckedThrowable* t) {
    
    //#line 1521 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Exception* e = ::x10::lang::Exception::ensureException(
                                  t);
    
    //#line 1522 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::nullCheck(::x10aux::nullCheck(::x10::lang::Runtime::activity())->finishState())->pushException(
      e);
}

//#line 1524 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 1528 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 1534 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 1540 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::execute(::x10::lang::Activity* activity) {
    
    //#line 1541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime__Worker* this__104463 = ::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread());
    
    //#line 567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Activity* activity__104464 = activity;
    ::x10aux::nullCheck(this__104463)->FMGL(queue)->x10::lang::Deque::push(
      reinterpret_cast< ::x10::lang::Any*>(activity__104464));
}

//#line 1544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::executeLocal(::x10::lang::Activity* activity) {
    
    //#line 1545 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (!(::x10::lang::Runtime::FMGL(pool__get)()->deal(activity)))
    {
        ::x10::lang::Runtime__Worker* this__104465 = ::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread());
        
        //#line 567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Activity* activity__104466 = activity;
        ::x10aux::nullCheck(this__104465)->FMGL(queue)->x10::lang::Deque::push(
          reinterpret_cast< ::x10::lang::Any*>(activity__104466));
    }
    
}

//#line 1549 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::execute(::x10::lang::VoidFun_0_0* body,
                                 ::x10::lang::Place src, ::x10::lang::FinishState* finishState) {
    
    //#line 1550 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::execute((__extension__ ({
                                      ::x10::lang::Activity* alloc__77984 =
                                         (new (::x10aux::alloc_z< ::x10::lang::Activity>()) ::x10::lang::Activity());
                                      
                                      //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                                      ::x10::lang::VoidFun_0_0* body__104470 =
                                        body;
                                      ::x10::lang::Place srcPlace__104471 =
                                        src;
                                      ::x10::lang::FinishState* finishState__104472 =
                                        finishState;
                                      
                                      //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                                      ::x10::lang::VoidFun_0_0* body__104467 =
                                        body__104470;
                                      ::x10::lang::Place srcPlace__104468 =
                                        srcPlace__104471;
                                      ::x10::lang::FinishState* finishState__104469 =
                                        finishState__104472;
                                      
                                      //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
                                      (alloc__77984)->::x10::lang::Activity::_constructor(
                                        body__104467, srcPlace__104468,
                                        finishState__104469,
                                        true, true);
                                      alloc__77984;
                                  }))
                                  );
}

//#line 1553 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::probe() {
    
    //#line 1554 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::nullCheck((::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread())))->x10::lang::Runtime__Worker::probe();
}

//#line 1558 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::increaseParallelism() {
    
    //#line 1559 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
    {
        
        //#line 1560 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime::FMGL(pool__get)()->increase();
    }
    
}

//#line 1565 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::decreaseParallelism(x10_int n) {
    
    //#line 1566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
    {
        
        //#line 1567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime::FMGL(pool__get)()->decrease(
          n);
    }
    
}

//#line 1571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::removeThreadLocalContexts() {
    
    //#line 1572 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::FMGL(pool__get)()->removeThreadLocalContexts();
}

//#line 1575 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Runtime__Worker* x10::lang::Runtime::wrapNativeThread(
  ) {
    
    //#line 1576 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    return ::x10::lang::Runtime::FMGL(pool__get)()->wrapNativeThread();
    
}

//#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Runtime* x10::lang::Runtime::x10__lang__Runtime____this__x10__lang__Runtime(
  ) {
    return this;
    
}

//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::_constructor() {
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime* this__104473 = this;
    
}
::x10::lang::Runtime* x10::lang::Runtime::_make() {
    ::x10::lang::Runtime* this_ = new (::x10aux::alloc_z< ::x10::lang::Runtime>()) ::x10::lang::Runtime();
    this_->_constructor();
    return this_;
}



//#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime::__fieldInitializers_x10_lang_Runtime(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::Runtime::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::Runtime::_deserializer);

void x10::lang::Runtime::_serialize_body(::x10aux::serialization_buffer& buf) {
    
}

::x10::lang::Reference* ::x10::lang::Runtime::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Runtime* this_ = new (::x10aux::alloc_z< ::x10::lang::Runtime>()) ::x10::lang::Runtime();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::Runtime::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    
}

::x10aux::RuntimeType x10::lang::Runtime::rtt;
void x10::lang::Runtime::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.lang.Runtime",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__1>x10_lang_Runtime__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Runtime__closure__1::__apply, &x10_lang_Runtime__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Runtime__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Runtime__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Runtime__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Runtime__closure__1::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__2>x10_lang_Runtime__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Runtime__closure__2::__apply, &x10_lang_Runtime__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Runtime__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Runtime__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Runtime__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Runtime__closure__2::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__4>x10_lang_Runtime__closure__4::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Runtime__closure__4::__apply, &x10_lang_Runtime__closure__4::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Runtime__closure__4::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Runtime__closure__4::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Runtime__closure__4::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Runtime__closure__4::_deserialize);
const ::x10aux::serialization_id_t x10_lang_Runtime__closure__4::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_Runtime__closure__4::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__3>x10_lang_Runtime__closure__3::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Runtime__closure__3::__apply, &x10_lang_Runtime__closure__3::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Runtime__closure__3::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Runtime__closure__3::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Runtime__closure__3::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Runtime__closure__3::_deserialize);
const ::x10aux::serialization_id_t x10_lang_Runtime__closure__3::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_Runtime__closure__3::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__5>x10_lang_Runtime__closure__5::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Runtime__closure__5::__apply, &x10_lang_Runtime__closure__5::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Runtime__closure__5::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Runtime__closure__5::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Runtime__closure__5::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Runtime__closure__5::_deserialize);
const ::x10aux::serialization_id_t x10_lang_Runtime__closure__5::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_Runtime__closure__5::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__6>x10_lang_Runtime__closure__6::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Runtime__closure__6::__apply, &x10_lang_Runtime__closure__6::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Runtime__closure__6::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Runtime__closure__6::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Runtime__closure__6::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Runtime__closure__6::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__7>x10_lang_Runtime__closure__7::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Runtime__closure__7::__apply, &x10_lang_Runtime__closure__7::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Runtime__closure__7::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Runtime__closure__7::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Runtime__closure__7::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Runtime__closure__7::_deserialize);
const ::x10aux::serialization_id_t x10_lang_Runtime__closure__7::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_Runtime__closure__7::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__8>x10_lang_Runtime__closure__8::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Runtime__closure__8::__apply, &x10_lang_Runtime__closure__8::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Runtime__closure__8::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Runtime__closure__8::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Runtime__closure__8::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Runtime__closure__8::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__9>x10_lang_Runtime__closure__9::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Runtime__closure__9::__apply, &x10_lang_Runtime__closure__9::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Runtime__closure__9::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Runtime__closure__9::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Runtime__closure__9::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Runtime__closure__9::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__10>x10_lang_Runtime__closure__10::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Runtime__closure__10::__apply, &x10_lang_Runtime__closure__10::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Runtime__closure__10::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Runtime__closure__10::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Runtime__closure__10::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Runtime__closure__10::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__11>x10_lang_Runtime__closure__11::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Runtime__closure__11::__apply, &x10_lang_Runtime__closure__11::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Runtime__closure__11::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Runtime__closure__11::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Runtime__closure__11::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Runtime__closure__11::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__12>x10_lang_Runtime__closure__12::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Runtime__closure__12::__apply, &x10_lang_Runtime__closure__12::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Runtime__closure__12::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Runtime__closure__12::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Runtime__closure__12::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Runtime__closure__12::_deserialize);
const ::x10aux::serialization_id_t x10_lang_Runtime__closure__12::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_Runtime__closure__12::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__14>x10_lang_Runtime__closure__14::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Runtime__closure__14::__apply, &x10_lang_Runtime__closure__14::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Runtime__closure__14::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Runtime__closure__14::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Runtime__closure__14::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Runtime__closure__14::_deserialize);
const ::x10aux::serialization_id_t x10_lang_Runtime__closure__14::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_Runtime__closure__14::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__15>x10_lang_Runtime__closure__15::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Runtime__closure__15::__apply, &x10_lang_Runtime__closure__15::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Runtime__closure__15::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Runtime__closure__15::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Runtime__closure__15::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Runtime__closure__15::_deserialize);
const ::x10aux::serialization_id_t x10_lang_Runtime__closure__15::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_Runtime__closure__15::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__13>x10_lang_Runtime__closure__13::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Runtime__closure__13::__apply, &x10_lang_Runtime__closure__13::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Runtime__closure__13::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Runtime__closure__13::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Runtime__closure__13::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Runtime__closure__13::_deserialize);
const ::x10aux::serialization_id_t x10_lang_Runtime__closure__13::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_Runtime__closure__13::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__17>x10_lang_Runtime__closure__17::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Runtime__closure__17::__apply, &x10_lang_Runtime__closure__17::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Runtime__closure__17::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Runtime__closure__17::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Runtime__closure__17::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Runtime__closure__17::_deserialize);
const ::x10aux::serialization_id_t x10_lang_Runtime__closure__17::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_Runtime__closure__17::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__16>x10_lang_Runtime__closure__16::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Runtime__closure__16::__apply, &x10_lang_Runtime__closure__16::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Runtime__closure__16::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Runtime__closure__16::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Runtime__closure__16::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Runtime__closure__16::_deserialize);
const ::x10aux::serialization_id_t x10_lang_Runtime__closure__16::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_Runtime__closure__16::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__18>x10_lang_Runtime__closure__18::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Runtime__closure__18::__apply, &x10_lang_Runtime__closure__18::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Runtime__closure__18::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Runtime__closure__18::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Runtime__closure__18::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Runtime__closure__18::_deserialize);
const ::x10aux::serialization_id_t x10_lang_Runtime__closure__18::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_Runtime__closure__18::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__20>x10_lang_Runtime__closure__20::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Runtime__closure__20::__apply, &x10_lang_Runtime__closure__20::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Runtime__closure__20::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Runtime__closure__20::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Runtime__closure__20::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Runtime__closure__20::_deserialize);
const ::x10aux::serialization_id_t x10_lang_Runtime__closure__20::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_Runtime__closure__20::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__21>x10_lang_Runtime__closure__21::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Runtime__closure__21::__apply, &x10_lang_Runtime__closure__21::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Runtime__closure__21::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Runtime__closure__21::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Runtime__closure__21::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Runtime__closure__21::_deserialize);
const ::x10aux::serialization_id_t x10_lang_Runtime__closure__21::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_Runtime__closure__21::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__closure__19>x10_lang_Runtime__closure__19::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Runtime__closure__19::__apply, &x10_lang_Runtime__closure__19::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Runtime__closure__19::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Runtime__closure__19::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Runtime__closure__19::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Runtime__closure__19::_deserialize);
const ::x10aux::serialization_id_t x10_lang_Runtime__closure__19::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_Runtime__closure__19::_deserialize,::x10aux::CLOSURE_KIND_ASYNC_CLOSURE);

/* END of Runtime */
/*************************************************/
/*************************************************/
/* START of Runtime$MemoryAllocator */
#include <x10/lang/Runtime__MemoryAllocator.h>


//#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Runtime__MemoryAllocator* x10::lang::Runtime__MemoryAllocator::FMGL(DEFAULT_ALLOCATOR);
void x10::lang::Runtime__MemoryAllocator::FMGL(DEFAULT_ALLOCATOR__do_init)() {
    FMGL(DEFAULT_ALLOCATOR__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Runtime__MemoryAllocator.DEFAULT_ALLOCATOR");
    ::x10::lang::Runtime__MemoryAllocator* __var1679__ = ::x10::lang::Runtime__MemoryAllocator::_make(false,
                                                                                                      false);
    FMGL(DEFAULT_ALLOCATOR) = __var1679__;
    FMGL(DEFAULT_ALLOCATOR__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Runtime__MemoryAllocator::FMGL(DEFAULT_ALLOCATOR__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(DEFAULT_ALLOCATOR__status), &FMGL(DEFAULT_ALLOCATOR__do_init), &FMGL(DEFAULT_ALLOCATOR__exception), "x10::lang::Runtime__MemoryAllocator.DEFAULT_ALLOCATOR");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Runtime__MemoryAllocator::FMGL(DEFAULT_ALLOCATOR__status);
::x10::lang::CheckedThrowable* x10::lang::Runtime__MemoryAllocator::FMGL(DEFAULT_ALLOCATOR__exception);

//#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Runtime__MemoryAllocator* x10::lang::Runtime__MemoryAllocator::FMGL(ALLOC_HC);
void x10::lang::Runtime__MemoryAllocator::FMGL(ALLOC_HC__do_init)() {
    FMGL(ALLOC_HC__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Runtime__MemoryAllocator.ALLOC_HC");
    ::x10::lang::Runtime__MemoryAllocator* __var1680__ = (::x10aux::congruent_huge &&
    true) ? (::x10::lang::Runtime__MemoryAllocator::_make(true,
                                                          true))
      : ((::x10aux::class_cast_unchecked< ::x10::lang::Runtime__MemoryAllocator*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))));
    FMGL(ALLOC_HC) = __var1680__;
    FMGL(ALLOC_HC__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Runtime__MemoryAllocator::FMGL(ALLOC_HC__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(ALLOC_HC__status), &FMGL(ALLOC_HC__do_init), &FMGL(ALLOC_HC__exception), "x10::lang::Runtime__MemoryAllocator.ALLOC_HC");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Runtime__MemoryAllocator::FMGL(ALLOC_HC__status);
::x10::lang::CheckedThrowable* x10::lang::Runtime__MemoryAllocator::FMGL(ALLOC_HC__exception);

//#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Runtime__MemoryAllocator* x10::lang::Runtime__MemoryAllocator::FMGL(ALLOC_H);
void x10::lang::Runtime__MemoryAllocator::FMGL(ALLOC_H__do_init)() {
    FMGL(ALLOC_H__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Runtime__MemoryAllocator.ALLOC_H");
    ::x10::lang::Runtime__MemoryAllocator* __var1681__ = ::x10aux::congruent_huge
      ? (::x10::lang::Runtime__MemoryAllocator::_make(true,
                                                      false))
      : ((::x10aux::class_cast_unchecked< ::x10::lang::Runtime__MemoryAllocator*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))));
    FMGL(ALLOC_H) = __var1681__;
    FMGL(ALLOC_H__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Runtime__MemoryAllocator::FMGL(ALLOC_H__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(ALLOC_H__status), &FMGL(ALLOC_H__do_init), &FMGL(ALLOC_H__exception), "x10::lang::Runtime__MemoryAllocator.ALLOC_H");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Runtime__MemoryAllocator::FMGL(ALLOC_H__status);
::x10::lang::CheckedThrowable* x10::lang::Runtime__MemoryAllocator::FMGL(ALLOC_H__exception);

//#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Runtime__MemoryAllocator* x10::lang::Runtime__MemoryAllocator::FMGL(ALLOC_C);
void x10::lang::Runtime__MemoryAllocator::FMGL(ALLOC_C__do_init)() {
    FMGL(ALLOC_C__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Runtime__MemoryAllocator.ALLOC_C");
    ::x10::lang::Runtime__MemoryAllocator* __var1682__ = true
      ? (::x10::lang::Runtime__MemoryAllocator::_make(false,
                                                      true))
      : ((::x10aux::class_cast_unchecked< ::x10::lang::Runtime__MemoryAllocator*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))));
    FMGL(ALLOC_C) = __var1682__;
    FMGL(ALLOC_C__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Runtime__MemoryAllocator::FMGL(ALLOC_C__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(ALLOC_C__status), &FMGL(ALLOC_C__do_init), &FMGL(ALLOC_C__exception), "x10::lang::Runtime__MemoryAllocator.ALLOC_C");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Runtime__MemoryAllocator::FMGL(ALLOC_C__status);
::x10::lang::CheckedThrowable* x10::lang::Runtime__MemoryAllocator::FMGL(ALLOC_C__exception);

//#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime__MemoryAllocator::_constructor(x10_boolean h,
                                                       x10_boolean c) {
    
    //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime__MemoryAllocator* this__104371 =
      this;
    
    //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(hugePages) = h;
    
    //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(congruent) = c;
}
::x10::lang::Runtime__MemoryAllocator* x10::lang::Runtime__MemoryAllocator::_make(
  x10_boolean h, x10_boolean c) {
    ::x10::lang::Runtime__MemoryAllocator* this_ = new (::x10aux::alloc_z< ::x10::lang::Runtime__MemoryAllocator>()) ::x10::lang::Runtime__MemoryAllocator();
    this_->_constructor(h, c);
    return this_;
}



//#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Runtime__MemoryAllocator* x10::lang::Runtime__MemoryAllocator::requestAllocator(
  x10_boolean hugePages, x10_boolean congruent) {
    
    //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (((congruent && hugePages) && (!::x10aux::struct_equals(::x10::lang::Runtime__MemoryAllocator::FMGL(ALLOC_HC__get)(),
                                                               reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))))
    {
        return ::x10::lang::Runtime__MemoryAllocator::FMGL(ALLOC_HC__get)();
        
    }
    
    //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if ((congruent && (!::x10aux::struct_equals(::x10::lang::Runtime__MemoryAllocator::FMGL(ALLOC_C__get)(),
                                                reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))))
    {
        return ::x10::lang::Runtime__MemoryAllocator::FMGL(ALLOC_C__get)();
        
    }
    
    //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if ((hugePages && (!::x10aux::struct_equals(::x10::lang::Runtime__MemoryAllocator::FMGL(ALLOC_H__get)(),
                                                reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))))
    {
        return ::x10::lang::Runtime__MemoryAllocator::FMGL(ALLOC_H__get)();
        
    }
    
    //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    return ::x10::lang::Runtime__MemoryAllocator::FMGL(DEFAULT_ALLOCATOR__get)();
    
}

//#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Runtime__MemoryAllocator* x10::lang::Runtime__MemoryAllocator::requireAllocator(
  x10_boolean hugePages, x10_boolean congruent) {
    
    //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if ((congruent && hugePages)) {
        
        //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if ((::x10aux::struct_equals(::x10::lang::Runtime__MemoryAllocator::FMGL(ALLOC_HC__get)(),
                                     reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
        {
            ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::OutOfMemoryError::_make((__extension__ ({ static ::x10::lang::String* strLit__125698 = ::x10aux::makeStringLit("Required Memory Allocator unavailable"); strLit__125698; })))));
        }
        
        //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return ::x10::lang::Runtime__MemoryAllocator::FMGL(ALLOC_HC__get)();
        
    }
    
    //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (congruent) {
        
        //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if ((::x10aux::struct_equals(::x10::lang::Runtime__MemoryAllocator::FMGL(ALLOC_C__get)(),
                                     reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
        {
            ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::OutOfMemoryError::_make((__extension__ ({ static ::x10::lang::String* strLit__125699 = ::x10aux::makeStringLit("Required Memory Allocator unavailable"); strLit__125699; })))));
        }
        
        //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return ::x10::lang::Runtime__MemoryAllocator::FMGL(ALLOC_C__get)();
        
    }
    
    //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (hugePages) {
        
        //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if ((::x10aux::struct_equals(::x10::lang::Runtime__MemoryAllocator::FMGL(ALLOC_H__get)(),
                                     reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
        {
            ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::OutOfMemoryError::_make((__extension__ ({ static ::x10::lang::String* strLit__125700 = ::x10aux::makeStringLit("Required Memory Allocator unavailable"); strLit__125700; })))));
        }
        
        //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return ::x10::lang::Runtime__MemoryAllocator::FMGL(ALLOC_H__get)();
        
    }
    
    //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    return ::x10::lang::Runtime__MemoryAllocator::FMGL(DEFAULT_ALLOCATOR__get)();
    
}

//#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Runtime__MemoryAllocator* x10::lang::Runtime__MemoryAllocator::x10__lang__Runtime__MemoryAllocator____this__x10__lang__Runtime__MemoryAllocator(
  ) {
    return this;
    
}
void x10::lang::Runtime__MemoryAllocator::__fieldInitializers_x10_lang_Runtime_MemoryAllocator(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::Runtime__MemoryAllocator::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::Runtime__MemoryAllocator::_deserializer);

void x10::lang::Runtime__MemoryAllocator::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(hugePages));
    buf.write(this->FMGL(congruent));
    
}

::x10::lang::Reference* ::x10::lang::Runtime__MemoryAllocator::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Runtime__MemoryAllocator* this_ = new (::x10aux::alloc_z< ::x10::lang::Runtime__MemoryAllocator>()) ::x10::lang::Runtime__MemoryAllocator();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::Runtime__MemoryAllocator::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(hugePages) = buf.read<x10_boolean>();
    FMGL(congruent) = buf.read<x10_boolean>();
}

::x10aux::RuntimeType x10::lang::Runtime__MemoryAllocator::rtt;
void x10::lang::Runtime__MemoryAllocator::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.lang.Runtime.MemoryAllocator",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of Runtime$MemoryAllocator */
/*************************************************/
/*************************************************/
/* START of Runtime$Mortal */
#include <x10/lang/Runtime__Mortal.h>

::x10aux::RuntimeType x10::lang::Runtime__Mortal::rtt;
void x10::lang::Runtime__Mortal::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Any>()};
    rtt.initStageTwo("x10.lang.Runtime.Mortal",::x10aux::RuntimeType::interface_kind, 1, parents, 0, NULL, NULL);
}

/* END of Runtime$Mortal */
/*************************************************/
/*************************************************/
/* START of Runtime$Workers */
#include <x10/lang/Runtime__Workers.h>

#include <x10/lang/Int.h>
#include <x10/lang/Boolean.h>
#include <x10/util/concurrent/Lock.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Runtime__Worker.h>
#include <x10/lang/Long.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Thread.h>
#include <x10/lang/Any.h>
#include <x10/lang/String.h>
#include <x10/lang/Place.h>
#include <x10/lang/InternalError.h>
#include <x10/lang/Exception.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/Activity.h>
#include <x10/lang/Deque.h>
#include <x10/compiler/Synthetic.h>

//#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 331 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 332 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 333 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 334 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 335 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 336 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 337 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 338 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime__Workers::reduce(x10_int n) {
    
    //#line 342 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(lock)->lock();
    
    //#line 343 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(spareNeeded) = ((this->FMGL(spareNeeded)) + (n));
    
    //#line 344 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(lock)->unlock();
}

//#line 349 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
x10_int x10::lang::Runtime__Workers::increase() {
    
    //#line 350 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(lock)->lock();
    
    //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (((this->FMGL(spareNeeded)) > (((x10_int)0)))) {
        
        //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        this->FMGL(spareNeeded) = ((this->FMGL(spareNeeded)) - (((x10_int)1)));
        
        //#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        this->FMGL(lock)->unlock();
        
        //#line 354 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return ((x10_int)0);
        
    } else 
    //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (((this->FMGL(spareCount)) > (((x10_int)0)))) {
        
        //#line 357 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10_int i = ((this->FMGL(spareCount) = ((this->FMGL(spareCount)) - (((x10_int)1)))) + (this->FMGL(idleCount)));
        
        //#line 358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime__Worker* worker = this->FMGL(parkedWorkers)->x10::lang::Rail< ::x10::lang::Runtime__Worker* >::__apply(
                                                 ((x10_long)(i)));
        
        //#line 359 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        this->FMGL(parkedWorkers)->x10::lang::Rail< ::x10::lang::Runtime__Worker* >::__set(
          ((x10_long)(i)), ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Worker*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
        //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        this->FMGL(lock)->unlock();
        
        //#line 644 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
        {
            
            //#line 645 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10aux::nullCheck(worker)->x10::lang::Runtime__Worker::unpark();
        }
        
        //#line 362 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return ((x10_int)0);
        
    } else {
        
        //#line 365 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10_int i = ((this->FMGL(count) = ((this->FMGL(count)) + (((x10_int)1)))) - (((x10_int)1)));
        
        //#line 366 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        this->FMGL(lock)->unlock();
        
        //#line 367 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        this->x10::lang::Runtime__Workers::check(((i) + (((x10_int)1))));
        
        //#line 368 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return i;
        
    }
    
}

//#line 374 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
x10_int x10::lang::Runtime__Workers::promote() {
    
    //#line 375 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(lock)->lock();
    
    //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    x10_int i = ((this->FMGL(count) = ((this->FMGL(count)) + (((x10_int)1)))) - (((x10_int)1)));
    
    //#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(deadCount) = ((this->FMGL(deadCount)) + (((x10_int)1)));
    
    //#line 378 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(lock)->unlock();
    
    //#line 379 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->x10::lang::Runtime__Workers::check(((i) + (((x10_int)1))));
    
    //#line 380 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    return i;
    
}

//#line 384 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime__Workers::check(x10_int new_count) {
    
    //#line 385 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (((new_count) > (::x10::lang::Runtime::FMGL(MAX_THREADS__get)())))
    {
        
        //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::Place::_make(::x10aux::here), (__extension__ ({ static ::x10::lang::String* strLit__125702 = ::x10aux::makeStringLit(": TOO MANY THREADS (there are now "); strLit__125702; }))), new_count), (__extension__ ({ static ::x10::lang::String* strLit__125703 = ::x10aux::makeStringLit(" threads)."); strLit__125703; })))))->c_str());
        
        //#line 387 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::InternalError::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::Place::_make(::x10aux::here), (__extension__ ({ static ::x10::lang::String* strLit__125704 = ::x10aux::makeStringLit(": TOO MANY THREADS (there are now "); strLit__125704; }))), new_count), (__extension__ ({ static ::x10::lang::String* strLit__125705 = ::x10aux::makeStringLit(" threads)."); strLit__125705; }))))));
    }
    
    //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (::x10::lang::Runtime::FMGL(WARN_ON_THREAD_CREATION__get)())
    {
        
        //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::Place::_make(::x10aux::here), (__extension__ ({ static ::x10::lang::String* strLit__125706 = ::x10aux::makeStringLit(": WARNING: A new OS-level thread was discovered (there are now "); strLit__125706; }))), new_count), (__extension__ ({ static ::x10::lang::String* strLit__125707 = ::x10aux::makeStringLit(" threads)."); strLit__125707; })))))->c_str());
        
        //#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__125708 = ::x10aux::makeStringLit("NOTE: The following stack trace is not an error, but to help identify the origin of the new OS-level thread."); strLit__125708; }))))->c_str());
        
        //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        try {
            ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::Exception::_make()));
        }
        catch (::x10::lang::CheckedThrowable* __exc1691) {
            if (::x10aux::instanceof< ::x10::lang::Exception*>(__exc1691)) {
                ::x10::lang::Exception* e = static_cast< ::x10::lang::Exception*>(__exc1691);
                {
                    ::x10aux::nullCheck(e)->printStackTrace();
                }
            } else
            throw;
        }
    }
    
}

//#line 397 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime__Workers::convert() {
    
    //#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    while ((((this->FMGL(spareNeeded)) > (((x10_int)0))) &&
           ((this->FMGL(idleCount)) > (((x10_int)0))))) {
        
        //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        this->FMGL(spareNeeded) = ((this->FMGL(spareNeeded)) - (((x10_int)1)));
        
        //#line 400 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        this->FMGL(idleCount) = ((this->FMGL(idleCount)) - (((x10_int)1)));
        
        //#line 401 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        this->FMGL(spareCount) = ((this->FMGL(spareCount)) + (((x10_int)1)));
    }
    
}

//#line 406 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Activity* x10::lang::Runtime__Workers::yield(
  ::x10::lang::Runtime__Worker* worker) {
    
    //#line 407 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (((this->FMGL(spareNeeded)) <= (((x10_int)0)))) {
        return ::x10aux::class_cast_unchecked< ::x10::lang::Activity*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        
    }
    
    //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(lock)->lock();
    
    //#line 409 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->x10::lang::Runtime__Workers::convert();
    
    //#line 410 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (((this->FMGL(spareNeeded)) <= (((x10_int)0)))) {
        
        //#line 411 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        this->FMGL(lock)->unlock();
        
        //#line 412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return ::x10aux::class_cast_unchecked< ::x10::lang::Activity*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        
    }
    
    //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(spareNeeded) = ((this->FMGL(spareNeeded)) - (((x10_int)1)));
    
    //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    x10_int i = ((((this->FMGL(spareCount) = ((this->FMGL(spareCount)) + (((x10_int)1)))) - (((x10_int)1)))) + (this->FMGL(idleCount)));
    
    //#line 416 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(parkedWorkers)->x10::lang::Rail< ::x10::lang::Runtime__Worker* >::__set(
      ((x10_long)(i)), worker);
    
    //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    while ((::x10aux::struct_equals(this->FMGL(parkedWorkers)->x10::lang::Rail< ::x10::lang::Runtime__Worker* >::__apply(
                                      ((x10_long)(i))), worker)))
    {
        
        //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        this->FMGL(lock)->unlock();
        
        //#line 419 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime__Worker::park();
        
        //#line 420 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        this->FMGL(lock)->lock();
    }
    
    //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(lock)->unlock();
    
    //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    return ::x10aux::nullCheck(worker)->FMGL(activity);
    
}

//#line 427 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Activity* x10::lang::Runtime__Workers::take(
  ::x10::lang::Runtime__Worker* worker) {
    
    //#line 428 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (((this->FMGL(multiplace) && this->FMGL(busyWaiting)) &&
        ((((x10_long)(((this->FMGL(idleCount)) - (this->FMGL(spareNeeded)))))) >= (((((x10_long)(::x10::lang::Runtime::FMGL(NTHREADS__get)()))) - (((x10_long)1ll)))))))
    {
        return ::x10aux::class_cast_unchecked< ::x10::lang::Activity*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        
    }
    
    //#line 429 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(lock)->lock();
    
    //#line 430 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->x10::lang::Runtime__Workers::convert();
    
    //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (((this->FMGL(multiplace) && this->FMGL(busyWaiting)) &&
        ((((x10_long)(this->FMGL(idleCount)))) >= (((((x10_long)(::x10::lang::Runtime::FMGL(NTHREADS__get)()))) - (((x10_long)1ll)))))))
    {
        
        //#line 432 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        this->FMGL(lock)->unlock();
        
        //#line 433 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return ::x10aux::class_cast_unchecked< ::x10::lang::Activity*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        
    }
    
    //#line 435 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (((this->FMGL(multiplace) && !(this->FMGL(busyWaiting))) &&
        !(this->FMGL(probing)))) {
        
        //#line 436 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        this->FMGL(probing) = true;
        
        //#line 437 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        this->FMGL(lock)->unlock();
        
        //#line 438 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::blocking_probe();
        
        //#line 439 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        this->FMGL(lock)->lock();
        
        //#line 440 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        this->FMGL(probing) = false;
        
        //#line 441 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        this->FMGL(lock)->unlock();
        
        //#line 442 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return ::x10aux::class_cast< ::x10::lang::Activity*>(::x10aux::nullCheck(worker)->FMGL(queue)->x10::lang::Deque::poll());
        
    }
    
    //#line 444 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    x10_int i = ((this->FMGL(spareCount)) + (((this->FMGL(idleCount) =
      ((this->FMGL(idleCount)) + (((x10_int)1)))) - (((x10_int)1)))));
    
    //#line 445 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(parkedWorkers)->x10::lang::Rail< ::x10::lang::Runtime__Worker* >::__set(
      ((x10_long)(i)), worker);
    
    //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    while ((::x10aux::struct_equals(this->FMGL(parkedWorkers)->x10::lang::Rail< ::x10::lang::Runtime__Worker* >::__apply(
                                      ((x10_long)(i))), worker)))
    {
        
        //#line 447 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        this->FMGL(lock)->unlock();
        
        //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime__Worker::park();
        
        //#line 449 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        this->FMGL(lock)->lock();
    }
    
    //#line 451 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(lock)->unlock();
    
    //#line 452 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    return ::x10aux::nullCheck(worker)->FMGL(activity);
    
}

//#line 455 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime__Workers::wakeup() {
    
    //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if ((((((this->FMGL(idleCount)) - (this->FMGL(spareNeeded)))) <= (((x10_int)0))) &&
        !(this->FMGL(probing)))) {
        return;
    }
    
    //#line 457 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(lock)->lock();
    
    //#line 458 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->x10::lang::Runtime__Workers::convert();
    
    //#line 459 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (((this->FMGL(idleCount)) <= (((x10_int)0)))) {
        
        //#line 460 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10_boolean p = this->FMGL(probing);
        
        //#line 461 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        this->FMGL(lock)->unlock();
        
        //#line 462 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if ((p && this->FMGL(multiplace))) {
            ::x10aux::unblock_probe();
        }
        
        //#line 463 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return;
    }
    
    //#line 465 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    x10_int i = ((this->FMGL(spareCount)) + (this->FMGL(idleCount) =
      ((this->FMGL(idleCount)) - (((x10_int)1)))));
    
    //#line 466 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime__Worker* worker = this->FMGL(parkedWorkers)->x10::lang::Rail< ::x10::lang::Runtime__Worker* >::__apply(
                                             ((x10_long)(i)));
    
    //#line 467 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(parkedWorkers)->x10::lang::Rail< ::x10::lang::Runtime__Worker* >::__set(
      ((x10_long)(i)), ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Worker*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 468 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(lock)->unlock();
    
    //#line 644 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
    {
        
        //#line 645 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::nullCheck(worker)->x10::lang::Runtime__Worker::unpark();
    }
    
}

//#line 474 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
x10_boolean x10::lang::Runtime__Workers::give(::x10::lang::Activity* activity) {
    
    //#line 475 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if ((((((this->FMGL(idleCount)) - (this->FMGL(spareNeeded)))) <= (((x10_int)0))) &&
        !(this->FMGL(probing)))) {
        return false;
        
    }
    
    //#line 476 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(lock)->lock();
    
    //#line 477 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->x10::lang::Runtime__Workers::convert();
    
    //#line 478 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (((this->FMGL(idleCount)) <= (((x10_int)0)))) {
        
        //#line 479 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10_boolean p = this->FMGL(probing);
        
        //#line 480 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        this->FMGL(lock)->unlock();
        
        //#line 481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if ((p && this->FMGL(multiplace))) {
            ::x10aux::unblock_probe();
        }
        
        //#line 482 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        return false;
        
    }
    
    //#line 484 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    x10_int i = ((this->FMGL(spareCount)) + (this->FMGL(idleCount) =
      ((this->FMGL(idleCount)) - (((x10_int)1)))));
    
    //#line 485 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime__Worker* worker = this->FMGL(parkedWorkers)->x10::lang::Rail< ::x10::lang::Runtime__Worker* >::__apply(
                                             ((x10_long)(i)));
    
    //#line 486 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::nullCheck(worker)->FMGL(activity) = activity;
    
    //#line 487 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(parkedWorkers)->x10::lang::Rail< ::x10::lang::Runtime__Worker* >::__set(
      ((x10_long)(i)), ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Worker*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    
    //#line 488 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(lock)->unlock();
    
    //#line 644 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
    {
        
        //#line 645 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::nullCheck(worker)->x10::lang::Runtime__Worker::unpark();
    }
    
    //#line 490 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    return true;
    
}

//#line 494 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime__Workers::reclaim() {
    
    //#line 495 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(lock)->lock();
    
    //#line 496 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(deadCount) = ((this->FMGL(deadCount)) + (((x10_int)1)));
    
    //#line 497 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    while (((this->FMGL(idleCount)) > (((x10_int)0)))) {
        
        //#line 498 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        x10_int i = ((this->FMGL(spareCount)) + (this->FMGL(idleCount) =
          ((this->FMGL(idleCount)) - (((x10_int)1)))));
        
        //#line 499 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime__Worker* worker = this->FMGL(parkedWorkers)->x10::lang::Rail< ::x10::lang::Runtime__Worker* >::__apply(
                                                 ((x10_long)(i)));
        
        //#line 500 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        this->FMGL(parkedWorkers)->x10::lang::Rail< ::x10::lang::Runtime__Worker* >::__set(
          ((x10_long)(i)), ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Worker*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
        //#line 644 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
        {
            
            //#line 645 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10aux::nullCheck(worker)->x10::lang::Runtime__Worker::unpark();
        }
        
    }
    
    //#line 503 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (((this->FMGL(spareCount)) > (((x10_int)0)))) {
        
        //#line 504 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime__Worker* worker = this->FMGL(parkedWorkers)->x10::lang::Rail< ::x10::lang::Runtime__Worker* >::__apply(
                                                 ((x10_long)(this->FMGL(spareCount) =
                                                   ((this->FMGL(spareCount)) - (((x10_int)1))))));
        
        //#line 505 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        this->FMGL(parkedWorkers)->x10::lang::Rail< ::x10::lang::Runtime__Worker* >::__set(
          ((x10_long)(this->FMGL(spareCount))), ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Worker*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
        //#line 644 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
        {
            
            //#line 645 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10aux::nullCheck(worker)->x10::lang::Runtime__Worker::unpark();
        }
        
    }
    
    //#line 508 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    x10_boolean p = this->FMGL(probing);
    
    //#line 509 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(lock)->unlock();
    
    //#line 510 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if ((p && this->FMGL(multiplace))) {
        ::x10aux::unblock_probe();
    }
    
}

//#line 513 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Runtime__Worker* x10::lang::Runtime__Workers::__apply(
  x10_int i) {
    return this->FMGL(workers)->x10::lang::Rail< ::x10::lang::Runtime__Worker* >::__apply(
             ((x10_long)(i)));
    
}

//#line 514 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime__Workers::__set(x10_int i, ::x10::lang::Runtime__Worker* worker) {
    this->FMGL(workers)->x10::lang::Rail< ::x10::lang::Runtime__Worker* >::__set(
      ((x10_long)(i)), worker);
}

//#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Runtime__Workers* x10::lang::Runtime__Workers::x10__lang__Runtime__Workers____this__x10__lang__Runtime__Workers(
  ) {
    return this;
    
}
void x10::lang::Runtime__Workers::_constructor() {
    this->x10::lang::Runtime__Workers::__fieldInitializers_x10_lang_Runtime_Workers();
}
::x10::lang::Runtime__Workers* x10::lang::Runtime__Workers::_make(
  ) {
    ::x10::lang::Runtime__Workers* this_ = new (::x10aux::alloc_z< ::x10::lang::Runtime__Workers>()) ::x10::lang::Runtime__Workers();
    this_->_constructor();
    return this_;
}


void x10::lang::Runtime__Workers::__fieldInitializers_x10_lang_Runtime_Workers(
  ) {
    this->FMGL(lock) = ::x10::util::concurrent::Lock::_make();
    this->FMGL(workers) = ::x10::lang::Rail< ::x10::lang::Runtime__Worker* >::_make(((x10_long)(::x10::lang::Runtime::FMGL(MAX_THREADS__get)())));
    this->FMGL(parkedWorkers) = ::x10::lang::Rail< ::x10::lang::Runtime__Worker* >::_make(((x10_long)(::x10::lang::Runtime::FMGL(MAX_THREADS__get)())));
    this->FMGL(count) = ((x10_int)0);
    this->FMGL(spareCount) = ((x10_int)0);
    this->FMGL(idleCount) = ((x10_int)0);
    this->FMGL(deadCount) = ((x10_int)0);
    this->FMGL(spareNeeded) = ((x10_int)0);
    this->FMGL(multiplace) = true;
    this->FMGL(busyWaiting) = true;
    this->FMGL(probing) = false;
}
const ::x10aux::serialization_id_t x10::lang::Runtime__Workers::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::Runtime__Workers::_deserializer);

void x10::lang::Runtime__Workers::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(lock));
    buf.write(this->FMGL(workers));
    buf.write(this->FMGL(parkedWorkers));
    buf.write(this->FMGL(count));
    buf.write(this->FMGL(spareCount));
    buf.write(this->FMGL(idleCount));
    buf.write(this->FMGL(deadCount));
    buf.write(this->FMGL(spareNeeded));
    buf.write(this->FMGL(multiplace));
    buf.write(this->FMGL(busyWaiting));
    buf.write(this->FMGL(probing));
    
}

::x10::lang::Reference* ::x10::lang::Runtime__Workers::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Runtime__Workers* this_ = new (::x10aux::alloc_z< ::x10::lang::Runtime__Workers>()) ::x10::lang::Runtime__Workers();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::Runtime__Workers::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(lock) = buf.read< ::x10::util::concurrent::Lock*>();
    FMGL(workers) = buf.read< ::x10::lang::Rail< ::x10::lang::Runtime__Worker* >*>();
    FMGL(parkedWorkers) = buf.read< ::x10::lang::Rail< ::x10::lang::Runtime__Worker* >*>();
    FMGL(count) = buf.read<x10_int>();
    FMGL(spareCount) = buf.read<x10_int>();
    FMGL(idleCount) = buf.read<x10_int>();
    FMGL(deadCount) = buf.read<x10_int>();
    FMGL(spareNeeded) = buf.read<x10_int>();
    FMGL(multiplace) = buf.read<x10_boolean>();
    FMGL(busyWaiting) = buf.read<x10_boolean>();
    FMGL(probing) = buf.read<x10_boolean>();
}

::x10aux::RuntimeType x10::lang::Runtime__Workers::rtt;
void x10::lang::Runtime__Workers::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.lang.Runtime.Workers",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of Runtime$Workers */
/*************************************************/
/*************************************************/
/* START of Runtime$Worker */
#include <x10/lang/Runtime__Worker.h>

#include <x10/lang/Thread.h>
#include <x10/io/Unserializable.h>
#include <x10/lang/Int.h>
#include <x10/lang/Activity.h>
#include <x10/lang/Deque.h>
#include <x10/util/Random.h>
#include <x10/lang/String.h>
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Place.h>
#include <x10/lang/FinishState.h>
#include <x10/lang/FinishState__UncountedFinish.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Any.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/Runtime.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/lang/Runtime__Pool.h>
#include <x10/lang/Unsafe.h>
#include <x10/util/concurrent/SimpleLatch.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_RUNTIME__WORKER__CLOSURE__24_CLOSURE
#define X10_LANG_RUNTIME__WORKER__CLOSURE__24_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_Runtime__Worker__closure__24 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__Worker__closure__24> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
     
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Runtime__Worker__closure__24* storage = ::x10aux::alloc_z<x10_lang_Runtime__Worker__closure__24>();
        buf.record_reference(storage);
        x10_lang_Runtime__Worker__closure__24* this_ = new (storage) x10_lang_Runtime__Worker__closure__24();
        return this_;
    }
    
    x10_lang_Runtime__Worker__closure__24() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10:551";
    }

};

#endif // X10_LANG_RUNTIME__WORKER__CLOSURE__24_CLOSURE
::x10::io::Unserializable::itable< ::x10::lang::Runtime__Worker >  x10::lang::Runtime__Worker::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::lang::Runtime__Worker >  x10::lang::Runtime__Worker::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::lang::Runtime__Worker::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Unserializable>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::Runtime__Worker")};

//#line 519 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
x10_int x10::lang::Runtime__Worker::FMGL(BOUND);
void x10::lang::Runtime__Worker::FMGL(BOUND__do_init)() {
    FMGL(BOUND__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Runtime__Worker.BOUND");
    x10_int __var1702__ = ((x10_int)100);
    FMGL(BOUND) = __var1702__;
    FMGL(BOUND__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Runtime__Worker::FMGL(BOUND__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(BOUND__status), &FMGL(BOUND__do_init), &FMGL(BOUND__exception), "x10::lang::Runtime__Worker.BOUND");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Runtime__Worker::FMGL(BOUND__status);
::x10::lang::CheckedThrowable* x10::lang::Runtime__Worker::FMGL(BOUND__exception);

//#line 522 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 528 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 531 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 534 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 536 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime__Worker::_constructor(x10_int workerId) {
    
    //#line 537 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    (this)->::x10::lang::Thread::_constructor(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125718 = ::x10aux::makeStringLit("X10 worker thread-"); strLit__125718; })), workerId));
    
    //#line 536 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    
    //#line 517 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->x10::lang::Runtime__Worker::__fieldInitializers_x10_lang_Runtime_Worker();
    
    //#line 538 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(workerId) = workerId;
    
    //#line 539 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(random) = (__extension__ ({
        ::x10::util::Random* alloc__77954 =  (new (::x10aux::alloc_z< ::x10::util::Random>()) ::x10::util::Random());
        (alloc__77954)->::x10::util::Random::_constructor(((x10_long)(((((((workerId) + (((workerId) << (0x1f & (x10_int)(((x10_long)(((x10_int)8))))))))) + (((workerId) << (0x1f & (x10_int)(((x10_long)(((x10_int)16))))))))) + (((workerId) << (0x1f & (x10_int)(((x10_long)(((x10_int)24)))))))))));
        alloc__77954;
    }))
    ;
}
::x10::lang::Runtime__Worker* x10::lang::Runtime__Worker::_make(x10_int workerId)
{
    ::x10::lang::Runtime__Worker* this_ = new (::x10aux::alloc_z< ::x10::lang::Runtime__Worker>()) ::x10::lang::Runtime__Worker();
    this_->_constructor(workerId);
    return this_;
}



//#line 542 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime__Worker::_constructor(x10_int workerId, x10_boolean dummy) {
    
    //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    (this)->::x10::lang::Thread::_constructor();
    
    //#line 542 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    
    //#line 517 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->x10::lang::Runtime__Worker::__fieldInitializers_x10_lang_Runtime_Worker();
    
    //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(workerId) = workerId;
    
    //#line 545 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(random) = (__extension__ ({
        ::x10::util::Random* alloc__77955 =  (new (::x10aux::alloc_z< ::x10::util::Random>()) ::x10::util::Random());
        (alloc__77955)->::x10::util::Random::_constructor(((x10_long)(((((((workerId) + (((workerId) << (0x1f & (x10_int)(((x10_long)(((x10_int)8))))))))) + (((workerId) << (0x1f & (x10_int)(((x10_long)(((x10_int)16))))))))) + (((workerId) << (0x1f & (x10_int)(((x10_long)(((x10_int)24)))))))))));
        alloc__77955;
    }))
    ;
    
    //#line 551 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(activity) = (__extension__ ({
        ::x10::lang::Activity* alloc__77957 =  (new (::x10aux::alloc_z< ::x10::lang::Activity>()) ::x10::lang::Activity());
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        ::x10::lang::Place srcPlace__104374 = (__extension__ ({
            
            //#line 551 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10::lang::Place alloc__104375 =  ::x10::lang::Place::_alloc();
            (alloc__104375)->::x10::lang::Place::_constructor(((x10_long)0ll));
            alloc__104375;
        }))
        ;
        ::x10::lang::FinishState* finishState__104376 = reinterpret_cast< ::x10::lang::FinishState*>(::x10::lang::FinishState::FMGL(UNCOUNTED_FINISH__get)());
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        ::x10::lang::Place srcPlace__104372 = srcPlace__104374;
        ::x10::lang::FinishState* finishState__104373 = finishState__104376;
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Activity.x10"
        (alloc__77957)->::x10::lang::Activity::_constructor(reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Runtime__Worker__closure__24)))x10_lang_Runtime__Worker__closure__24())),
                                                            srcPlace__104372,
                                                            finishState__104373,
                                                            true,
                                                            true);
        alloc__77957;
    }))
    ;
}
::x10::lang::Runtime__Worker* x10::lang::Runtime__Worker::_make(
  x10_int workerId, x10_boolean dummy) {
    ::x10::lang::Runtime__Worker* this_ = new (::x10aux::alloc_z< ::x10::lang::Runtime__Worker>()) ::x10::lang::Runtime__Worker();
    this_->_constructor(workerId, dummy);
    return this_;
}



//#line 555 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
x10_int x10::lang::Runtime__Worker::size() {
    return this->FMGL(queue)->x10::lang::Deque::size();
    
}

//#line 558 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Activity* x10::lang::Runtime__Worker::activity(
  ) {
    return this->FMGL(activity);
    
}

//#line 561 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Activity* x10::lang::Runtime__Worker::poll() {
    return ::x10aux::class_cast< ::x10::lang::Activity*>(this->FMGL(queue)->x10::lang::Deque::poll());
    
}

//#line 564 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Activity* x10::lang::Runtime__Worker::steal(
  ) {
    return ::x10aux::class_cast< ::x10::lang::Activity*>(this->FMGL(queue)->x10::lang::Deque::steal());
    
}

//#line 567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime__Worker::push(::x10::lang::Activity* activity) {
    this->FMGL(queue)->x10::lang::Deque::push(reinterpret_cast< ::x10::lang::Any*>(activity));
}

//#line 570 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime__Worker::__apply() {
    {
        
        //#line 571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::CheckedThrowable* throwable__104488 =
          ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        try {
            try {
                
                //#line 572 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                while (this->x10::lang::Runtime__Worker::loop())
                {
                    ;
                }
                
            }
            catch (::x10::lang::CheckedThrowable* __exc1709) {
                if (true) {
                    ::x10::lang::CheckedThrowable* t = static_cast< ::x10::lang::CheckedThrowable*>(__exc1709);
                    {
                        
                        //#line 574 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__125719 = ::x10aux::makeStringLit("Uncaught exception in worker thread"); strLit__125719; }))))->c_str());
                        
                        //#line 575 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                        ::x10aux::nullCheck(t)->printStackTrace();
                    }
                } else
                throw;
            }
            ::x10::compiler::Finalization::plausibleThrow();
        }
        catch (::x10::lang::CheckedThrowable* __exc1710) {
            if (true) {
                ::x10::lang::CheckedThrowable* formal__104489 =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1710);
                {
                    throwable__104488 = formal__104489;
                }
            } else
            throw;
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__104488)))
        {
            if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__104488))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__104488));
            }
            
        }
        
        //#line 576 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if (true) {
            
            //#line 577 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10::lang::Runtime::FMGL(pool__get)()->release();
        }
        
        //#line 571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__104488)))
        {
            if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__104488)))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__104488));
            }
            
        }
        
    }
}

//#line 582 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
x10_boolean x10::lang::Runtime__Worker::loop() {
    
    //#line 583 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    {
        x10_int i;
        for (i = ((x10_int)0); ((i) < (((x10_int)100))); i =
                                                           ((i) + (((x10_int)1))))
        {
            
            //#line 584 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            do {
                this->FMGL(activity) = (__extension__ ({
                    ::x10::lang::Runtime__Worker* this__104177 =
                      this;
                    ::x10aux::class_cast< ::x10::lang::Activity*>(::x10aux::nullCheck(this__104177)->FMGL(queue)->x10::lang::Deque::poll());
                }))
                ;
            } while (((!::x10aux::struct_equals(this->FMGL(activity),
                                                reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))) &&
                     ::x10::lang::Runtime::FMGL(pool__get)()->deal(
                       this->FMGL(activity))));
            
            //#line 585 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if ((::x10aux::struct_equals(this->FMGL(activity),
                                         reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
            {
                
                //#line 586 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this->FMGL(activity) = ::x10::lang::Runtime::FMGL(pool__get)()->scan(
                                         this->FMGL(random),
                                         this);
                
                //#line 587 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if ((::x10aux::struct_equals(this->FMGL(activity),
                                             reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
                {
                    return false;
                    
                }
                
            }
            
            //#line 589 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10aux::nullCheck(this->FMGL(activity))->run();
            
            //#line 590 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10aux::dealloc(this->FMGL(activity));
        }
    }
    
    //#line 592 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    return true;
    
}

//#line 595 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime__Worker::probe() {
    
    //#line 597 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Activity* tmp = this->FMGL(activity);
    
    //#line 598 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::event_probe();
    
    //#line 599 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    {
        for (; ; ) {
            
            //#line 600 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this->FMGL(activity) = (__extension__ ({
                ::x10::lang::Runtime__Worker* this__104178 =
                  this;
                ::x10aux::class_cast< ::x10::lang::Activity*>(::x10aux::nullCheck(this__104178)->FMGL(queue)->x10::lang::Deque::poll());
            }))
            ;
            
            //#line 601 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if ((::x10aux::struct_equals(this->FMGL(activity),
                                         reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
            {
                
                //#line 602 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                this->FMGL(activity) = tmp;
                
                //#line 603 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                return;
            }
            
            //#line 605 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10aux::nullCheck(this->FMGL(activity))->run();
            
            //#line 606 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10aux::dealloc(this->FMGL(activity));
        }
    }
    
}

//#line 611 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime__Worker::join(::x10::util::concurrent::SimpleLatch* latch) {
    
    //#line 612 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Activity* tmp = this->FMGL(activity);
    
    //#line 613 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    while (this->x10::lang::Runtime__Worker::loop2(latch))
    {
        ;
    }
    
    //#line 614 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(activity) = tmp;
}

//#line 618 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
x10_boolean x10::lang::Runtime__Worker::loop2(::x10::util::concurrent::SimpleLatch* latch) {
    
    //#line 619 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    {
        x10_int i;
        for (i = ((x10_int)0); ((i) < (((x10_int)100))); i =
                                                           ((i) + (((x10_int)1))))
        {
            
            //#line 620 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (::x10aux::nullCheck(latch)->__apply()) {
                return false;
                
            }
            
            //#line 621 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            do {
                this->FMGL(activity) = (__extension__ ({
                    ::x10::lang::Runtime__Worker* this__104179 =
                      this;
                    ::x10aux::class_cast< ::x10::lang::Activity*>(::x10aux::nullCheck(this__104179)->FMGL(queue)->x10::lang::Deque::poll());
                }))
                ;
            } while (((!::x10aux::struct_equals(this->FMGL(activity),
                                                reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))) &&
                     ::x10::lang::Runtime::FMGL(pool__get)()->deal(
                       this->FMGL(activity))));
            
            //#line 622 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if ((::x10aux::struct_equals(this->FMGL(activity),
                                         reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
            {
                return false;
                
            }
            
            //#line 627 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10aux::nullCheck(this->FMGL(activity))->run();
            
            //#line 628 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10aux::dealloc(this->FMGL(activity));
        }
    }
    
    //#line 630 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    return true;
    
}

//#line 634 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime__Worker::park() {
    
    //#line 635 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
    {
        
        //#line 636 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Thread::park();
    } else {
        
        //#line 638 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime::probe();
    }
    
}

//#line 643 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime__Worker::unpark() {
    
    //#line 644 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
    {
        
        //#line 645 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Thread::unpark();
    }
    
}

//#line 517 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Runtime__Worker* x10::lang::Runtime__Worker::x10__lang__Runtime__Worker____this__x10__lang__Runtime__Worker(
  ) {
    return this;
    
}
void x10::lang::Runtime__Worker::__fieldInitializers_x10_lang_Runtime_Worker(
  ) {
    this->FMGL(activity) = (::x10aux::class_cast_unchecked< ::x10::lang::Activity*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(queue) = ::x10::lang::Deque::_make();
    this->FMGL(wsfifo) = ::x10::lang::Deque::_make();
}
::x10aux::RuntimeType x10::lang::Runtime__Worker::rtt;
void x10::lang::Runtime__Worker::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::lang::Thread>(), ::x10aux::getRTT< ::x10::io::Unserializable>()};
    rtt.initStageTwo("x10.lang.Runtime.Worker",::x10aux::RuntimeType::class_kind, 2, parents, 0, NULL, NULL);
}

::x10::lang::VoidFun_0_0::itable<x10_lang_Runtime__Worker__closure__24>x10_lang_Runtime__Worker__closure__24::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Runtime__Worker__closure__24::__apply, &x10_lang_Runtime__Worker__closure__24::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Runtime__Worker__closure__24::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Runtime__Worker__closure__24::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Runtime__Worker__closure__24::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Runtime__Worker__closure__24::_deserialize);

/* END of Runtime$Worker */
/*************************************************/
/*************************************************/
/* START of Runtime$Pool */
#include <x10/lang/Runtime__Pool.h>

#include <x10/lang/Boolean.h>
#include <x10/lang/Long.h>
#include <x10/util/concurrent/SimpleLatch.h>
#include <x10/lang/Runtime__Watcher.h>
#include <x10/lang/Runtime__Workers.h>
#include <x10/lang/Deque.h>
#include <x10/lang/Int.h>
#include <x10/lang/Thread.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Runtime__Worker.h>
#include <x10/lang/Place.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Activity.h>
#include <x10/util/concurrent/Condition.h>
#include <x10/util/Random.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/lang/FinishResilient.h>
#include <x10/lang/Any.h>
#include <x10/compiler/Synthetic.h>

//#line 651 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 652 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 654 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 656 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 658 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 659 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Runtime__Workers* x10::lang::Runtime__Pool::getWorkers() {
    return this->FMGL(workers);
    
}

//#line 661 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 663 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime__Pool::removeThreadLocalContexts() {
    
    //#line 664 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    {
        x10_int i;
        for (i = ((x10_int)0); ((i) < (this->FMGL(workers)->FMGL(count)));
             i = ((i) + (((x10_int)1)))) {
            
            //#line 665 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10aux::nullCheck(this->FMGL(workers)->FMGL(workers)->x10::lang::Rail< ::x10::lang::Runtime__Worker* >::__apply(
                                  ((x10_long)(i))))->x10::lang::Runtime__Worker::removeWorkerContext();
        }
    }
    
}

//#line 668 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime__Pool::__apply(x10_int n) {
    
    //#line 669 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(workers)->FMGL(multiplace) = ((((x10_long)::x10aux::num_places)) > (((x10_long)1ll)));
    
    //#line 671 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(workers)->FMGL(busyWaiting) = ((::x10::lang::Runtime::FMGL(BUSY_WAITING__get)() ||
    !(x10rt_blocking_probe_support())) || (!::x10aux::struct_equals(::x10::lang::Runtime::FMGL(RESILIENT_MODE__get)(),
                                                                    ((x10_int)0))));
    
    //#line 672 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(workers)->FMGL(count) = n;
    
    //#line 673 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(workers)->x10::lang::Runtime__Workers::__set(
      ((x10_int)0), ::x10aux::class_cast< ::x10::lang::Runtime__Worker*>(::x10::lang::Thread::currentThread()));
    
    //#line 674 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    {
        x10_int i;
        for (i = ((x10_int)1); ((i) < (n)); i = ((i) + (((x10_int)1))))
        {
            
            //#line 675 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            this->FMGL(workers)->x10::lang::Runtime__Workers::__set(
              i, ::x10::lang::Runtime__Worker::_make(i));
        }
    }
    
    //#line 677 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    {
        x10_int i;
        for (i = ((x10_int)1); ((i) < (n)); i = ((i) + (((x10_int)1))))
        {
            
            //#line 678 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10aux::nullCheck(this->FMGL(workers)->x10::lang::Runtime__Workers::__apply(
                                  i))->x10::lang::Runtime__Worker::start();
        }
    }
    
}

//#line 682 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime__Pool::run() {
    
    //#line 683 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10aux::nullCheck(this->FMGL(workers)->x10::lang::Runtime__Workers::__apply(
                          ((x10_int)0)))->x10::lang::Runtime__Worker::__apply();
    
    //#line 882 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime::FMGL(pool__get)()->FMGL(watcher)->x10::lang::Runtime__Watcher::await();
}

//#line 688 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime__Pool::increase() {
    
    //#line 689 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    x10_int i = this->FMGL(workers)->x10::lang::Runtime__Workers::increase();
    
    //#line 690 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if (((i) > (((x10_int)0)))) {
        
        //#line 692 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime__Worker* worker = ::x10::lang::Runtime__Worker::_make(i);
        
        //#line 693 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        this->FMGL(workers)->x10::lang::Runtime__Workers::__set(
          i, worker);
        
        //#line 694 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        worker->x10::lang::Runtime__Worker::start();
    }
    
}

//#line 699 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Runtime__Worker* x10::lang::Runtime__Pool::wrapNativeThread(
  ) {
    
    //#line 700 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    x10_int i = this->FMGL(workers)->x10::lang::Runtime__Workers::promote();
    
    //#line 701 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime__Worker* worker = ::x10::lang::Runtime__Worker::_make(i,
                                                                               false);
    
    //#line 702 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(workers)->x10::lang::Runtime__Workers::__set(
      i, worker);
    
    //#line 703 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    return worker;
    
}

//#line 707 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime__Pool::decrease(x10_int n) {
    
    //#line 708 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(workers)->x10::lang::Runtime__Workers::reduce(
      n);
}

//#line 712 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
x10_boolean x10::lang::Runtime__Pool::deal(::x10::lang::Activity* activity) {
    return this->FMGL(workers)->x10::lang::Runtime__Workers::give(
             activity);
    
}

//#line 715 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime__Pool::release() {
    
    //#line 716 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    this->FMGL(workers)->x10::lang::Runtime__Workers::reclaim();
    
    //#line 717 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if ((::x10aux::struct_equals(this->FMGL(workers)->FMGL(count),
                                 this->FMGL(workers)->FMGL(deadCount))))
    {
        ::x10::lang::Runtime::FMGL(pool__get)()->FMGL(watcher)->x10::lang::Runtime__Watcher::release();
    }
    
}

//#line 721 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Activity* x10::lang::Runtime__Pool::scan(::x10::util::Random* random,
                                                      ::x10::lang::Runtime__Worker* worker) {
    
    //#line 722 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Activity* activity = ::x10aux::class_cast_unchecked< ::x10::lang::Activity*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
    
    //#line 723 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    x10_int next = ::x10aux::nullCheck(random)->nextInt(this->FMGL(workers)->FMGL(count));
    
    //#line 724 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    x10_int init = next;
    
    //#line 725 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    {
        for (; ; ) {
            
            //#line 726 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                           activity)) || this->FMGL(latch)->__apply()))
            {
                return activity;
                
            }
            
            //#line 728 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            activity = this->FMGL(workers)->x10::lang::Runtime__Workers::yield(
                         worker);
            
            //#line 729 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                           activity)) || this->FMGL(latch)->__apply()))
            {
                return activity;
                
            }
            
            //#line 731 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            ::x10aux::event_probe();
            
            //#line 732 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if ((!::x10aux::struct_equals(((x10_long)x10rt_ndead()),
                                          this->FMGL(numDead))))
            {
                {
                    
                    //#line 733 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    ::x10::lang::CheckedThrowable* throwable__104491 =
                      ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                    try {
                        {
                            ::x10::lang::Runtime::enterAtomic();
                            {
                                
                                //#line 734 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                                this->FMGL(numDead) = ((x10_long)x10rt_ndead());
                            }
                        }
                        ::x10::compiler::Finalization::plausibleThrow();
                    }
                    catch (::x10::lang::CheckedThrowable* __exc1729) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* formal__104492 =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc1729);
                            {
                                throwable__104491 = formal__104492;
                            }
                        } else
                        throw;
                    }
                    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                  throwable__104491)))
                    {
                        if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__104491))
                        {
                            ::x10aux::throwException(::x10aux::nullCheck(throwable__104491));
                        }
                        
                    }
                    if (true) {
                        ::x10::lang::Runtime::exitAtomic();
                    }
                    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                  throwable__104491)))
                    {
                        if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__104491)))
                        {
                            ::x10aux::throwException(::x10aux::nullCheck(throwable__104491));
                        }
                        
                    }
                    
                }
                
                //#line 1910 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                if ((::x10aux::struct_equals(::x10::lang::Runtime::FMGL(RESILIENT_MODE__get)(),
                                             ((x10_int)0))))
                {
                 
                } else {
                    
                    //#line 1915 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/FinishState.x10"
                    ::x10::lang::FinishResilient::notifyPlaceDeath();
                }
                
            }
            
            //#line 743 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            activity = (::x10aux::class_cast< ::x10::lang::Activity*>(::x10aux::nullCheck(worker)->FMGL(queue)->x10::lang::Deque::poll()));
            
            //#line 744 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                           activity)) || this->FMGL(latch)->__apply()))
            {
                return activity;
                
            }
            
            //#line 745 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            do {
                
                //#line 747 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if ((((next) < (::x10::lang::Runtime::FMGL(MAX_THREADS__get)())) &&
                    (!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                              this->FMGL(workers)->x10::lang::Runtime__Workers::__apply(
                                                next)))))
                {
                    
                    //#line 748 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                    activity = (__extension__ ({
                        ::x10::lang::Runtime__Worker* this__104184 =
                          this->FMGL(workers)->x10::lang::Runtime__Workers::__apply(
                            next);
                        ::x10aux::class_cast< ::x10::lang::Activity*>(::x10aux::nullCheck(this__104184)->FMGL(queue)->x10::lang::Deque::steal());
                    }))
                    ;
                }
                
                //#line 750 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if (((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                               activity)) ||
                    this->FMGL(latch)->__apply())) {
                    return activity;
                    
                }
                
                //#line 751 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                if ((::x10aux::struct_equals((next = ((next) + (((x10_int)1)))),
                                             this->FMGL(workers)->FMGL(count))))
                {
                    next = ((x10_int)0);
                }
                
            } while ((!::x10aux::struct_equals(next, init)));
            
            //#line 754 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            activity = this->FMGL(workers)->x10::lang::Runtime__Workers::take(
                         worker);
        }
    }
    
}

//#line 758 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
x10_int x10::lang::Runtime__Pool::size() {
    return this->FMGL(workers)->FMGL(count);
    
}

//#line 650 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Runtime__Pool* x10::lang::Runtime__Pool::x10__lang__Runtime__Pool____this__x10__lang__Runtime__Pool(
  ) {
    return this;
    
}
void x10::lang::Runtime__Pool::_constructor() {
    this->x10::lang::Runtime__Pool::__fieldInitializers_x10_lang_Runtime_Pool();
}
::x10::lang::Runtime__Pool* x10::lang::Runtime__Pool::_make(
  ) {
    ::x10::lang::Runtime__Pool* this_ = new (::x10aux::alloc_z< ::x10::lang::Runtime__Pool>()) ::x10::lang::Runtime__Pool();
    this_->_constructor();
    return this_;
}


void x10::lang::Runtime__Pool::__fieldInitializers_x10_lang_Runtime_Pool(
  ) {
    this->FMGL(latch) = ::x10::util::concurrent::SimpleLatch::_make();
    this->FMGL(watcher) = ::x10::lang::Runtime__Watcher::_make();
    this->FMGL(wsEnd) = false;
    this->FMGL(workers) = (__extension__ ({
        
        //#line 656 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::Runtime__Workers* alloc__77958 =  (new (::x10aux::alloc_z< ::x10::lang::Runtime__Workers>()) ::x10::lang::Runtime__Workers());
        
        //#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        alloc__77958->x10::lang::Runtime__Workers::__fieldInitializers_x10_lang_Runtime_Workers();
        alloc__77958;
    }))
    ;
    this->FMGL(wsBlockedContinuations) = (::x10aux::class_cast_unchecked< ::x10::lang::Deque*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(numDead) = ((x10_long)0ll);
}
const ::x10aux::serialization_id_t x10::lang::Runtime__Pool::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::Runtime__Pool::_deserializer);

void x10::lang::Runtime__Pool::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(latch));
    buf.write(this->FMGL(watcher));
    buf.write(this->FMGL(wsEnd));
    buf.write(this->FMGL(workers));
    buf.write(this->FMGL(wsBlockedContinuations));
    buf.write(this->FMGL(numDead));
    
}

::x10::lang::Reference* ::x10::lang::Runtime__Pool::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Runtime__Pool* this_ = new (::x10aux::alloc_z< ::x10::lang::Runtime__Pool>()) ::x10::lang::Runtime__Pool();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::Runtime__Pool::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(latch) = buf.read< ::x10::util::concurrent::SimpleLatch*>();
    FMGL(watcher) = buf.read< ::x10::lang::Runtime__Watcher*>();
    FMGL(wsEnd) = buf.read<x10_boolean>();
    FMGL(workers) = buf.read< ::x10::lang::Runtime__Workers*>();
    FMGL(wsBlockedContinuations) = buf.read< ::x10::lang::Deque*>();
    FMGL(numDead) = buf.read<x10_long>();
}

::x10aux::RuntimeType x10::lang::Runtime__Pool::rtt;
void x10::lang::Runtime__Pool::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.lang.Runtime.Pool",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of Runtime$Pool */
/*************************************************/
/*************************************************/
/* START of Runtime$Watcher */
#include <x10/lang/Runtime__Watcher.h>

#include <x10/util/concurrent/Condition.h>
#include <x10/io/Unserializable.h>
#include <x10/lang/MultipleExceptions.h>
#include <x10/compiler/Synthetic.h>
::x10::io::Unserializable::itable< ::x10::lang::Runtime__Watcher >  x10::lang::Runtime__Watcher::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::lang::Runtime__Watcher >  x10::lang::Runtime__Watcher::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::lang::Runtime__Watcher::_itables[3] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Unserializable>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::Runtime__Watcher")};

//#line 817 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 819 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime__Watcher::raise(::x10::lang::MultipleExceptions* t) {
    this->FMGL(t) = t;
}

//#line 827 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime__Watcher::await() {
    
    //#line 828 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::util::concurrent::Condition::await();
    
    //#line 829 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL),
                                  this->FMGL(t)))) {
        ::x10aux::throwException(::x10aux::nullCheck(this->FMGL(t)));
    }
    
}

//#line 837 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime__Watcher::cancel() {
 
}

//#line 816 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Runtime__Watcher* x10::lang::Runtime__Watcher::x10__lang__Runtime__Watcher____this__x10__lang__Runtime__Watcher(
  ) {
    return this;
    
}
void x10::lang::Runtime__Watcher::_constructor() {
    (this)->::x10::util::concurrent::Condition::_constructor();
    ::x10::lang::Runtime__Watcher* this__104380 = this;
    ::x10aux::nullCheck(this__104380)->FMGL(t) = (::x10aux::class_cast_unchecked< ::x10::lang::MultipleExceptions*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
::x10::lang::Runtime__Watcher* x10::lang::Runtime__Watcher::_make(
  ) {
    ::x10::lang::Runtime__Watcher* this_ = new (::x10aux::alloc_z< ::x10::lang::Runtime__Watcher>()) ::x10::lang::Runtime__Watcher();
    this_->_constructor();
    return this_;
}


void x10::lang::Runtime__Watcher::__fieldInitializers_x10_lang_Runtime_Watcher(
  ) {
    this->FMGL(t) = (::x10aux::class_cast_unchecked< ::x10::lang::MultipleExceptions*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
::x10aux::RuntimeType x10::lang::Runtime__Watcher::rtt;
void x10::lang::Runtime__Watcher::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::util::concurrent::Condition>(), ::x10aux::getRTT< ::x10::io::Unserializable>()};
    rtt.initStageTwo("x10.lang.Runtime.Watcher",::x10aux::RuntimeType::class_kind, 2, parents, 0, NULL, NULL);
}

/* END of Runtime$Watcher */
/*************************************************/
/*************************************************/
/* START of Runtime$RemoteControl */
#include <x10/lang/Runtime__RemoteControl.h>

#include <x10/util/concurrent/SimpleLatch.h>
#include <x10/lang/Runtime__Mortal.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/lang/Activity__ClockPhases.h>
#include <x10/compiler/Synthetic.h>
::x10::io::Unserializable::itable< ::x10::lang::Runtime__RemoteControl >  x10::lang::Runtime__RemoteControl::_itable_0(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::lang::Runtime__RemoteControl >  x10::lang::Runtime__RemoteControl::_itable_1(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Runtime__Mortal::itable< ::x10::lang::Runtime__RemoteControl >  x10::lang::Runtime__RemoteControl::_itable_2(&::x10::lang::X10Class::equals, &::x10::lang::X10Class::hashCode, &::x10::lang::X10Class::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::lang::Runtime__RemoteControl::_itables[4] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::io::Unserializable>, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Runtime__Mortal>, &_itable_2), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::Runtime__RemoteControl")};

//#line 1142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime__RemoteControl::_constructor() {
    (this)->::x10::util::concurrent::SimpleLatch::_constructor();
    
    //#line 1141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime__RemoteControl* this__104434 = this;
    ::x10aux::nullCheck(this__104434)->FMGL(e) = (::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    ::x10aux::nullCheck(this__104434)->FMGL(clockPhases) = (::x10aux::class_cast_unchecked< ::x10::lang::Activity__ClockPhases*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
::x10::lang::Runtime__RemoteControl* x10::lang::Runtime__RemoteControl::_make(
  ) {
    ::x10::lang::Runtime__RemoteControl* this_ = new (::x10aux::alloc_z< ::x10::lang::Runtime__RemoteControl>()) ::x10::lang::Runtime__RemoteControl();
    this_->_constructor();
    return this_;
}



//#line 1143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 1144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"

//#line 1141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Runtime__RemoteControl* x10::lang::Runtime__RemoteControl::x10__lang__Runtime__RemoteControl____this__x10__lang__Runtime__RemoteControl(
  ) {
    return this;
    
}
void x10::lang::Runtime__RemoteControl::__fieldInitializers_x10_lang_Runtime_RemoteControl(
  ) {
    this->FMGL(e) = (::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(clockPhases) = (::x10aux::class_cast_unchecked< ::x10::lang::Activity__ClockPhases*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
::x10aux::RuntimeType x10::lang::Runtime__RemoteControl::rtt;
void x10::lang::Runtime__RemoteControl::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[2] = { ::x10aux::getRTT< ::x10::util::concurrent::SimpleLatch>(), ::x10aux::getRTT< ::x10::lang::Runtime__Mortal>()};
    rtt.initStageTwo("x10.lang.Runtime.RemoteControl",::x10aux::RuntimeType::class_kind, 2, parents, 0, NULL, NULL);
}

/* END of Runtime$RemoteControl */
/*************************************************/
/*************************************************/
/* START of Runtime$AtCheckedWrapper */
#include <x10/lang/Runtime__AtCheckedWrapper.h>

#include <x10/lang/Exception.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/compiler/Synthetic.h>

//#line 1157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime__AtCheckedWrapper::_constructor(::x10::lang::CheckedThrowable* cause) {
    (this)->::x10::lang::Exception::_constructor(cause);
    
    //#line 1156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
    ::x10::lang::Runtime__AtCheckedWrapper* this__104435 = this;
    
}
::x10::lang::Runtime__AtCheckedWrapper* x10::lang::Runtime__AtCheckedWrapper::_make(
  ::x10::lang::CheckedThrowable* cause) {
    ::x10::lang::Runtime__AtCheckedWrapper* this_ = new (::x10aux::alloc_z< ::x10::lang::Runtime__AtCheckedWrapper>()) ::x10::lang::Runtime__AtCheckedWrapper();
    this_->_constructor(cause);
    return this_;
}



//#line 1156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Runtime__AtCheckedWrapper* x10::lang::Runtime__AtCheckedWrapper::x10__lang__Runtime__AtCheckedWrapper____this__x10__lang__Runtime__AtCheckedWrapper(
  ) {
    return this;
    
}
void x10::lang::Runtime__AtCheckedWrapper::__fieldInitializers_x10_lang_Runtime_AtCheckedWrapper(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::Runtime__AtCheckedWrapper::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::Runtime__AtCheckedWrapper::_deserializer);

void x10::lang::Runtime__AtCheckedWrapper::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::Exception::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::lang::Runtime__AtCheckedWrapper::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Runtime__AtCheckedWrapper* this_ = new (::x10aux::alloc_z< ::x10::lang::Runtime__AtCheckedWrapper>()) ::x10::lang::Runtime__AtCheckedWrapper();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::Runtime__AtCheckedWrapper::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Exception::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::lang::Runtime__AtCheckedWrapper::rtt;
void x10::lang::Runtime__AtCheckedWrapper::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Exception>()};
    rtt.initStageTwo("x10.lang.Runtime.AtCheckedWrapper",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of Runtime$AtCheckedWrapper */
/*************************************************/
/*************************************************/
/* START of Runtime$Remote */
#include <x10/lang/Runtime__Remote.h>

::x10aux::RuntimeType x10::lang::Runtime__Remote<void>::rtt;

/* END of Runtime$Remote */
/*************************************************/
/*************************************************/
/* START of Runtime$Profile */
#include <x10/lang/Runtime__Profile.h>

#include <x10/lang/Long.h>
#include <x10/compiler/Synthetic.h>

//#line 1299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
/** Number of bytes that were serialized. */

//#line 1301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
/** Time spent serializing. */

//#line 1303 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
/** Time spent sending the message (does not include time spent waiting for the completion notification). */

//#line 1305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
void x10::lang::Runtime__Profile::reset() {
    this->FMGL(bytes) = ((x10_long)0ll);
    this->FMGL(serializationNanos) = ((x10_long)0ll);
    this->FMGL(communicationNanos) = ((x10_long)0ll);
}

//#line 1297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
::x10::lang::Runtime__Profile* x10::lang::Runtime__Profile::x10__lang__Runtime__Profile____this__x10__lang__Runtime__Profile(
  ) {
    return this;
    
}
void x10::lang::Runtime__Profile::_constructor() {
    ::x10::lang::Runtime__Profile* this__104449 = this;
    ::x10aux::nullCheck(this__104449)->FMGL(bytes) = ((x10_long)0ll);
    ::x10aux::nullCheck(this__104449)->FMGL(serializationNanos) =
      ((x10_long)0ll);
    ::x10aux::nullCheck(this__104449)->FMGL(communicationNanos) =
      ((x10_long)0ll);
}
::x10::lang::Runtime__Profile* x10::lang::Runtime__Profile::_make(
  ) {
    ::x10::lang::Runtime__Profile* this_ = new (::x10aux::alloc_z< ::x10::lang::Runtime__Profile>()) ::x10::lang::Runtime__Profile();
    this_->_constructor();
    return this_;
}


void x10::lang::Runtime__Profile::__fieldInitializers_x10_lang_Runtime_Profile(
  ) {
    this->FMGL(bytes) = ((x10_long)0ll);
    this->FMGL(serializationNanos) = ((x10_long)0ll);
    this->FMGL(communicationNanos) = ((x10_long)0ll);
}
const ::x10aux::serialization_id_t x10::lang::Runtime__Profile::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::Runtime__Profile::_deserializer);

void x10::lang::Runtime__Profile::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(bytes));
    buf.write(this->FMGL(serializationNanos));
    buf.write(this->FMGL(communicationNanos));
    
}

::x10::lang::Reference* ::x10::lang::Runtime__Profile::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Runtime__Profile* this_ = new (::x10aux::alloc_z< ::x10::lang::Runtime__Profile>()) ::x10::lang::Runtime__Profile();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::Runtime__Profile::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(bytes) = buf.read<x10_long>();
    FMGL(serializationNanos) = buf.read<x10_long>();
    FMGL(communicationNanos) = buf.read<x10_long>();
}

::x10aux::RuntimeType x10::lang::Runtime__Profile::rtt;
void x10::lang::Runtime__Profile::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.lang.Runtime.Profile",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of Runtime$Profile */
/*************************************************/
