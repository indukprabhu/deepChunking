/*************************************************/
/* START of Clock */
#include <x10/lang/Clock.h>

#include <x10/lang/GlobalRef.h>
#include <x10/lang/Int.h>
#include <x10/lang/String.h>
#include <x10/lang/Any.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/ClockUseException.h>
#include <x10/util/HashMap.h>
#include <x10/util/Box.h>
#include <x10/lang/Activity.h>
#include <x10/lang/Activity__ClockPhases.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/compiler/Finalization.h>
#include <x10/compiler/Abort.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/compiler/Pinned.h>
#include <x10/compiler/Global.h>
#include <x10/lang/Place.h>
#include <x10/lang/VoidFun_0_0.h>
#include <x10/lang/Runtime__Profile.h>
#include <x10/lang/Long.h>
#include <x10/lang/Math.h>
#include <x10/lang/System.h>
#include <x10/compiler/Native.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_CLOCK__CLOSURE__1_CLOSURE
#define X10_LANG_CLOCK__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_Clock__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_Clock__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            ::x10::lang::Clock* me = (saved_this->FMGL(root))->__apply();
            {
                
                //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                ::x10::lang::CheckedThrowable* throwable__93118 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    {
                        ::x10::lang::Runtime::enterAtomic();
                        {
                            
                            //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                            ::x10aux::nullCheck(me)->FMGL(count) = ((::x10aux::nullCheck(me)->FMGL(count)) + (((x10_int)1)));
                            
                            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                            if ((!::x10aux::struct_equals((-(ph)), ::x10aux::nullCheck(me)->FMGL(phase))))
                            {
                                
                                //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                                ::x10aux::nullCheck(me)->FMGL(alive) =
                                  ((::x10aux::nullCheck(me)->FMGL(alive)) + (((x10_int)1)));
                            }
                            
                        }
                    }
                    ::x10::compiler::Finalization::plausibleThrow();
                }
                catch (::x10::lang::CheckedThrowable* __exc754) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__93119 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc754);
                        {
                            throwable__93118 = formal__93119;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__93118)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__93118))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__93118));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::exitAtomic();
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__93118)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__93118)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__93118));
                    }
                    
                }
                
            }
        }
        catch (::x10::lang::CheckedThrowable* __exc755) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc755);
                {
                    x10_int __lowerer__var__1__ = ::x10aux::class_cast_unchecked<x10_int>(::x10::lang::Runtime::wrapAtChecked< x10_int >(
                                                                                            __lowerer__var__0__));
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::Clock* saved_this;
    x10_int ph;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->ph);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Clock__closure__1* storage = ::x10aux::alloc_z<x10_lang_Clock__closure__1>();
        buf.record_reference(storage);
        ::x10::lang::Clock* that_saved_this = buf.read< ::x10::lang::Clock*>();
        x10_int that_ph = buf.read<x10_int>();
        x10_lang_Clock__closure__1* this_ = new (storage) x10_lang_Clock__closure__1(that_saved_this, that_ph);
        return this_;
    }
    
    x10_lang_Clock__closure__1(::x10::lang::Clock* saved_this, x10_int ph) : saved_this(saved_this), ph(ph) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10:82-89";
    }

};

#endif // X10_LANG_CLOCK__CLOSURE__1_CLOSURE
#ifndef X10_LANG_CLOCK__CLOSURE__2_CLOSURE
#define X10_LANG_CLOCK__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_Clock__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_Clock__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            ::x10::lang::Clock* me = (saved_this->FMGL(root))->__apply();
            
            //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            ::x10aux::nullCheck(me)->x10::lang::Clock::resumeLocal();
        }
        catch (::x10::lang::CheckedThrowable* __exc757) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc757);
                {
                    x10_int __lowerer__var__1__ = ::x10aux::class_cast_unchecked<x10_int>(::x10::lang::Runtime::wrapAtChecked< x10_int >(
                                                                                            __lowerer__var__0__));
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::Clock* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Clock__closure__2* storage = ::x10aux::alloc_z<x10_lang_Clock__closure__2>();
        buf.record_reference(storage);
        ::x10::lang::Clock* that_saved_this = buf.read< ::x10::lang::Clock*>();
        x10_lang_Clock__closure__2* this_ = new (storage) x10_lang_Clock__closure__2(that_saved_this);
        return this_;
    }
    
    x10_lang_Clock__closure__2(::x10::lang::Clock* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10:96-99";
    }

};

#endif // X10_LANG_CLOCK__CLOSURE__2_CLOSURE
#ifndef X10_LANG_CLOCK__CLOSURE__3_CLOSURE
#define X10_LANG_CLOCK__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_Clock__closure__3 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_Clock__closure__3> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            ::x10::lang::Clock* me = (saved_this->FMGL(root))->__apply();
            
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            if (((((x10_long)(ph))) > (((x10_long)0ll)))) {
                ::x10aux::nullCheck(me)->x10::lang::Clock::resumeLocal();
            }
            {
                
                //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                ::x10::lang::Runtime::ensureNotInAtomic();
                {
                    ::x10::lang::CheckedThrowable* throwable__93121 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                    try {
                        {
                            ::x10::lang::Runtime::enterAtomic();
                            while (true) {
                                if (((abs) < (::x10aux::nullCheck(me)->FMGL(phase))))
                                {
                                    {
                                     
                                    }
                                    break;
                                }
                                ::x10::lang::Runtime::awaitAtomic();
                            }
                            
                        }
                        ::x10::compiler::Finalization::plausibleThrow();
                    }
                    catch (::x10::lang::CheckedThrowable* __exc759) {
                        if (true) {
                            ::x10::lang::CheckedThrowable* formal__93122 =
                              static_cast< ::x10::lang::CheckedThrowable*>(__exc759);
                            {
                                throwable__93121 = formal__93122;
                            }
                        } else
                        throw;
                    }
                    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                  throwable__93121)))
                    {
                        if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__93121))
                        {
                            ::x10aux::throwException(::x10aux::nullCheck(throwable__93121));
                        }
                        
                    }
                    if (true) {
                        ::x10::lang::Runtime::exitAtomic();
                    }
                    if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                                  throwable__93121)))
                    {
                        if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__93121)))
                        {
                            ::x10aux::throwException(::x10aux::nullCheck(throwable__93121));
                        }
                        
                    }
                    
                }
            }
        }
        catch (::x10::lang::CheckedThrowable* __exc760) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc760);
                {
                    x10_int __lowerer__var__1__ = ::x10aux::class_cast_unchecked<x10_int>(::x10::lang::Runtime::wrapAtChecked< x10_int >(
                                                                                            __lowerer__var__0__));
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::Clock* saved_this;
    x10_int ph;
    x10_int abs;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->ph);
        buf.write(this->abs);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Clock__closure__3* storage = ::x10aux::alloc_z<x10_lang_Clock__closure__3>();
        buf.record_reference(storage);
        ::x10::lang::Clock* that_saved_this = buf.read< ::x10::lang::Clock*>();
        x10_int that_ph = buf.read<x10_int>();
        x10_int that_abs = buf.read<x10_int>();
        x10_lang_Clock__closure__3* this_ = new (storage) x10_lang_Clock__closure__3(that_saved_this, that_ph, that_abs);
        return this_;
    }
    
    x10_lang_Clock__closure__3(::x10::lang::Clock* saved_this, x10_int ph, x10_int abs) : saved_this(saved_this), ph(ph), abs(abs) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10:106-110";
    }

};

#endif // X10_LANG_CLOCK__CLOSURE__3_CLOSURE
#ifndef X10_LANG_CLOCK__CLOSURE__4_CLOSURE
#define X10_LANG_CLOCK__CLOSURE__4_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_Clock__closure__4 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_Clock__closure__4> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            ::x10::lang::Clock* me = (saved_this->FMGL(root))->__apply();
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            ::x10aux::nullCheck(me)->x10::lang::Clock::dropLocal(ph);
        }
        catch (::x10::lang::CheckedThrowable* __exc762) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc762);
                {
                    x10_int __lowerer__var__1__ = ::x10aux::class_cast_unchecked<x10_int>(::x10::lang::Runtime::wrapAtChecked< x10_int >(
                                                                                            __lowerer__var__0__));
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::Clock* saved_this;
    x10_int ph;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->ph);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Clock__closure__4* storage = ::x10aux::alloc_z<x10_lang_Clock__closure__4>();
        buf.record_reference(storage);
        ::x10::lang::Clock* that_saved_this = buf.read< ::x10::lang::Clock*>();
        x10_int that_ph = buf.read<x10_int>();
        x10_lang_Clock__closure__4* this_ = new (storage) x10_lang_Clock__closure__4(that_saved_this, that_ph);
        return this_;
    }
    
    x10_lang_Clock__closure__4(::x10::lang::Clock* saved_this, x10_int ph) : saved_this(saved_this), ph(ph) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10:115-118";
    }

};

#endif // X10_LANG_CLOCK__CLOSURE__4_CLOSURE
#ifndef X10_LANG_CLOCK__CLOSURE__5_CLOSURE
#define X10_LANG_CLOCK__CLOSURE__5_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_Clock__closure__5 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_Clock__closure__5> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        try {
            
            //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            ::x10::lang::Clock* me = (saved_this->FMGL(root))->__apply();
            
            //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
            ::x10aux::nullCheck(me)->x10::lang::Clock::dropLocal(ph);
        }
        catch (::x10::lang::CheckedThrowable* __exc764) {
            if (true) {
                ::x10::lang::CheckedThrowable* __lowerer__var__0__ = static_cast< ::x10::lang::CheckedThrowable*>(__exc764);
                {
                    x10_int __lowerer__var__1__ = ::x10aux::class_cast_unchecked<x10_int>(::x10::lang::Runtime::wrapAtChecked< x10_int >(
                                                                                            __lowerer__var__0__));
                    
                }
            } else
            throw;
        }
    }
    
    // captured environment
    ::x10::lang::Clock* saved_this;
    x10_int ph;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->ph);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Clock__closure__5* storage = ::x10aux::alloc_z<x10_lang_Clock__closure__5>();
        buf.record_reference(storage);
        ::x10::lang::Clock* that_saved_this = buf.read< ::x10::lang::Clock*>();
        x10_int that_ph = buf.read<x10_int>();
        x10_lang_Clock__closure__5* this_ = new (storage) x10_lang_Clock__closure__5(that_saved_this, that_ph);
        return this_;
    }
    
    x10_lang_Clock__closure__5(::x10::lang::Clock* saved_this, x10_int ph) : saved_this(saved_this), ph(ph) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10:122-125";
    }

};

#endif // X10_LANG_CLOCK__CLOSURE__5_CLOSURE

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"

//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
x10_boolean x10::lang::Clock::equals(::x10::lang::Any* a) {
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    if (((::x10aux::struct_equals(a, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))) ||
        !(::x10aux::instanceof< ::x10::lang::Clock*>(a)))) {
        
        //#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        return false;
        
    }
    
    //#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    return (::x10aux::struct_equals(::x10aux::nullCheck((::x10aux::class_cast< ::x10::lang::Clock*>(a)))->FMGL(root),
                                    this->FMGL(root)));
    
}

//#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
x10_int x10::lang::Clock::hashCode() {
    return (this->FMGL(root))->hashCode();
    
}

//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
::x10::lang::Clock* x10::lang::Clock::make() {
    return ::x10::lang::Clock::make((__extension__ ({ static ::x10::lang::String* strLit__124155 = ::x10aux::makeStringLit(""); strLit__124155; })));
    
}

//#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
::x10::lang::Clock* x10::lang::Clock::make(::x10::lang::String* name) {
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    if (::x10::lang::Runtime::FMGL(STATIC_THREADS__get)())
    {
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ClockUseException::_make((__extension__ ({ static ::x10::lang::String* strLit__124156 = ::x10aux::makeStringLit("Clocks are not compatible with static threads."); strLit__124156; })))));
    }
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    ::x10::lang::Clock* clock =  (new (::x10aux::alloc_z< ::x10::lang::Clock>()) ::x10::lang::Clock());
    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    ::x10::lang::String* name__93091 = name;
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    clock->FMGL(name) = name__93091;
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    clock->x10::lang::Clock::__fieldInitializers_x10_lang_Clock();
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    ::x10aux::nullCheck(::x10aux::nullCheck(::x10::lang::Runtime::activity())->clockPhases())->put(
      clock, ((x10_int)1));
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    return clock;
    
}

//#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
x10_int x10::lang::Clock::FMGL(FIRST_PHASE);
void x10::lang::Clock::FMGL(FIRST_PHASE__do_init)() {
    FMGL(FIRST_PHASE__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::Clock.FIRST_PHASE");
    x10_int __var745__ = ((x10_int)1);
    FMGL(FIRST_PHASE) = __var745__;
    FMGL(FIRST_PHASE__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::Clock::FMGL(FIRST_PHASE__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(FIRST_PHASE__status), &FMGL(FIRST_PHASE__do_init), &FMGL(FIRST_PHASE__exception), "x10::lang::Clock.FIRST_PHASE");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::Clock::FMGL(FIRST_PHASE__status);
::x10::lang::CheckedThrowable* x10::lang::Clock::FMGL(FIRST_PHASE__exception);

//#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"

//#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"

//#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"

//#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
void x10::lang::Clock::_constructor(::x10::lang::String* name) {
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    FMGL(name) = name;
    
    //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    this->x10::lang::Clock::__fieldInitializers_x10_lang_Clock();
}
::x10::lang::Clock* x10::lang::Clock::_make(::x10::lang::String* name)
{
    ::x10::lang::Clock* this_ = new (::x10aux::alloc_z< ::x10::lang::Clock>()) ::x10::lang::Clock();
    this_->_constructor(name);
    return this_;
}



//#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
void x10::lang::Clock::resumeLocal() {
    {
        
        //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        ::x10::lang::CheckedThrowable* throwable__93112 =
          ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        try {
            {
                ::x10::lang::Runtime::enterAtomic();
                {
                    
                    //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                    if ((::x10aux::struct_equals((this->FMGL(alive) =
                                                    ((this->FMGL(alive)) - (((x10_int)1)))),
                                                 ((x10_int)0))))
                    {
                        
                        //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                        this->FMGL(alive) = this->FMGL(count);
                        
                        //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                        this->FMGL(phase) = ((this->FMGL(phase)) + (((x10_int)1)));
                    }
                    
                }
            }
            ::x10::compiler::Finalization::plausibleThrow();
        }
        catch (::x10::lang::CheckedThrowable* __exc747) {
            if (true) {
                ::x10::lang::CheckedThrowable* formal__93113 =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc747);
                {
                    throwable__93112 = formal__93113;
                }
            } else
            throw;
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__93112)))
        {
            if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__93112))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__93112));
            }
            
        }
        if (true) {
            ::x10::lang::Runtime::exitAtomic();
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__93112)))
        {
            if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__93112)))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__93112));
            }
            
        }
        
    }
}

//#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
void x10::lang::Clock::dropLocal(x10_int ph) {
    {
        
        //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        ::x10::lang::CheckedThrowable* throwable__93115 =
          ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        try {
            {
                ::x10::lang::Runtime::enterAtomic();
                {
                    
                    //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                    this->FMGL(count) = ((this->FMGL(count)) - (((x10_int)1)));
                    
                    //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                    if ((!::x10aux::struct_equals((-(ph)),
                                                  this->FMGL(phase))))
                    {
                        
                        //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                        if ((::x10aux::struct_equals((this->FMGL(alive) =
                                                        ((this->FMGL(alive)) - (((x10_int)1)))),
                                                     ((x10_int)0))))
                        {
                            
                            //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                            this->FMGL(alive) = this->FMGL(count);
                            
                            //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
                            this->FMGL(phase) = ((this->FMGL(phase)) + (((x10_int)1)));
                        }
                        
                    }
                    
                }
            }
            ::x10::compiler::Finalization::plausibleThrow();
        }
        catch (::x10::lang::CheckedThrowable* __exc749) {
            if (true) {
                ::x10::lang::CheckedThrowable* formal__93116 =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc749);
                {
                    throwable__93115 = formal__93116;
                }
            } else
            throw;
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__93115)))
        {
            if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__93115))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__93115));
            }
            
        }
        if (true) {
            ::x10::lang::Runtime::exitAtomic();
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__93115)))
        {
            if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__93115)))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__93115));
            }
            
        }
        
    }
}

//#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
x10_int x10::lang::Clock::get() {
    return ::x10aux::nullCheck(::x10aux::nullCheck(::x10aux::nullCheck(::x10::lang::Runtime::activity())->clockPhases())->get(
                                 this))->FMGL(value);
    
}

//#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
::x10::util::Box<x10_int>* x10::lang::Clock::put(x10_int ph) {
    return ::x10aux::nullCheck(::x10aux::nullCheck(::x10::lang::Runtime::activity())->clockPhases())->put(
             this, ph);
    
}

//#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
x10_int x10::lang::Clock::remove() {
    return ::x10aux::nullCheck(::x10aux::nullCheck(::x10aux::nullCheck(::x10::lang::Runtime::activity())->clockPhases())->remove(
                                 this))->FMGL(value);
    
}

//#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
x10_int x10::lang::Clock::_kwd__register() {
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    if ((__extension__ ({
            ::x10::lang::Clock* this__93085 = this;
            !(::x10aux::nullCheck(this__93085)->x10::lang::Clock::registered());
        }))
        ) {
        this->x10::lang::Clock::clockUseException((__extension__ ({ static ::x10::lang::String* strLit__124163 = ::x10aux::makeStringLit("async clocked"); strLit__124163; })));
    }
    
    //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    x10_int ph = this->x10::lang::Clock::get();
    {
        
        //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        ::x10::lang::Runtime::runAt(::x10::lang::Place::place(((x10_long)((this->FMGL(root))->location))),
                                    reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Clock__closure__1)))x10_lang_Clock__closure__1(this, ph))),
                                    ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
    
    //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    return ph;
    
}

//#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
void x10::lang::Clock::resumeUnsafe() {
    
    //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    ::x10::lang::Runtime::ensureNotInAtomic();
    
    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    x10_int ph = this->x10::lang::Clock::get();
    
    //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    if (((((x10_long)(ph))) < (((x10_long)0ll)))) {
        return;
    }
    {
        
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        ::x10::lang::Runtime::runAt(::x10::lang::Place::place(((x10_long)((this->FMGL(root))->location))),
                                    reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Clock__closure__2)))x10_lang_Clock__closure__2(this))),
                                    ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
    
    //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    this->x10::lang::Clock::put((-(ph)));
}

//#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
void x10::lang::Clock::advanceUnsafe() {
    
    //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    ::x10::lang::Runtime::ensureNotInAtomic();
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    x10_int ph = this->x10::lang::Clock::get();
    
    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    x10_int abs = ((x10_int)::labs(ph));
    {
        
        //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        ::x10::lang::Runtime::runAt(::x10::lang::Place::place(((x10_long)((this->FMGL(root))->location))),
                                    reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Clock__closure__3)))x10_lang_Clock__closure__3(this, ph, abs))),
                                    ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
    
    //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    this->x10::lang::Clock::put(((abs) + (((x10_int)1))));
}

//#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
void x10::lang::Clock::dropUnsafe() {
    
    //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    x10_int ph = this->x10::lang::Clock::remove();
    {
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        ::x10::lang::Runtime::runAt(::x10::lang::Place::place(((x10_long)((this->FMGL(root))->location))),
                                    reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Clock__closure__4)))x10_lang_Clock__closure__4(this, ph))),
                                    ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
}

//#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
void x10::lang::Clock::dropInternal() {
    
    //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    x10_int ph = this->x10::lang::Clock::get();
    {
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
        ::x10::lang::Runtime::runAt(::x10::lang::Place::place(((x10_long)((this->FMGL(root))->location))),
                                    reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_Clock__closure__5)))x10_lang_Clock__closure__5(this, ph))),
                                    ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
}

//#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
x10_boolean x10::lang::Clock::registered() {
    return ::x10aux::nullCheck(::x10aux::nullCheck(::x10::lang::Runtime::activity())->clockPhases())->containsKey(
             this);
    
}

//#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
x10_boolean x10::lang::Clock::dropped() {
    return !(this->x10::lang::Clock::registered());
    
}

//#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
x10_int x10::lang::Clock::phase() {
    
    //#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    if ((__extension__ ({
            ::x10::lang::Clock* this__93086 = this;
            !(::x10aux::nullCheck(this__93086)->x10::lang::Clock::registered());
        }))
        ) {
        this->x10::lang::Clock::clockUseException((__extension__ ({ static ::x10::lang::String* strLit__124165 = ::x10aux::makeStringLit("phase"); strLit__124165; })));
    }
    
    //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    return ((x10_int)::labs(this->x10::lang::Clock::get()));
    
}

//#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
void x10::lang::Clock::resume() {
    
    //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    if ((__extension__ ({
            ::x10::lang::Clock* this__93087 = this;
            !(::x10aux::nullCheck(this__93087)->x10::lang::Clock::registered());
        }))
        ) {
        this->x10::lang::Clock::clockUseException((__extension__ ({ static ::x10::lang::String* strLit__124166 = ::x10aux::makeStringLit("resume"); strLit__124166; })));
    }
    
    //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    this->x10::lang::Clock::resumeUnsafe();
}

//#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
void x10::lang::Clock::advance() {
    
    //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    if ((__extension__ ({
            ::x10::lang::Clock* this__93088 = this;
            !(::x10aux::nullCheck(this__93088)->x10::lang::Clock::registered());
        }))
        ) {
        this->x10::lang::Clock::clockUseException((__extension__ ({ static ::x10::lang::String* strLit__124167 = ::x10aux::makeStringLit("advance"); strLit__124167; })));
    }
    
    //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    this->x10::lang::Clock::advanceUnsafe();
}

//#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
void x10::lang::Clock::drop() {
    
    //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    if ((__extension__ ({
            ::x10::lang::Clock* this__93089 = this;
            !(::x10aux::nullCheck(this__93089)->x10::lang::Clock::registered());
        }))
        ) {
        this->x10::lang::Clock::clockUseException((__extension__ ({ static ::x10::lang::String* strLit__124168 = ::x10aux::makeStringLit("drop"); strLit__124168; })));
    }
    
    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    this->x10::lang::Clock::dropUnsafe();
}

//#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
::x10::lang::String* x10::lang::Clock::toString() {
    return ::x10aux::equals(this->FMGL(name),(__extension__ ({ static ::x10::lang::String* strLit__124169 = ::x10aux::makeStringLit(""); strLit__124169; })))
      ? (::x10::lang::System::identityToString(reinterpret_cast< ::x10::lang::Any*>(this)))
      : (this->FMGL(name));
    
}

//#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
void x10::lang::Clock::clockUseException(::x10::lang::String* method) {
    
    //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    if ((__extension__ ({
            ::x10::lang::Clock* this__93090 = this;
            !(::x10aux::nullCheck(this__93090)->x10::lang::Clock::registered());
        }))
        ) {
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ClockUseException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__124170 = ::x10aux::makeStringLit("invalid invocation of "); strLit__124170; })), method), (__extension__ ({ static ::x10::lang::String* strLit__124171 = ::x10aux::makeStringLit("() on clock "); strLit__124171; }))), this->x10::lang::Clock::toString()), (__extension__ ({ static ::x10::lang::String* strLit__124172 = ::x10aux::makeStringLit("; calling activity is not clocked on this clock"); strLit__124172; }))))));
    }
    
}

//#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
void x10::lang::Clock::advanceAll() {
    
    //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    ::x10::lang::Runtime::ensureNotInAtomic();
    
    //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
    ::x10aux::nullCheck(::x10aux::nullCheck(::x10::lang::Runtime::activity())->clockPhases())->advanceAll();
}

//#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
void x10::lang::Clock::resumeAll() {
    ::x10aux::nullCheck(::x10aux::nullCheck(::x10::lang::Runtime::activity())->clockPhases())->resumeAll();
}

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Clock.x10"
::x10::lang::Clock* x10::lang::Clock::x10__lang__Clock____this__x10__lang__Clock(
  ) {
    return this;
    
}
void x10::lang::Clock::__fieldInitializers_x10_lang_Clock(
  ) {
    this->FMGL(root) = ::x10::lang::GlobalRef< ::x10::lang::Clock* >(this);
    this->FMGL(count) = ((x10_int)1);
    this->FMGL(alive) = ((x10_int)1);
    this->FMGL(phase) = ((x10_int)1);
}
const ::x10aux::serialization_id_t x10::lang::Clock::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::Clock::_deserializer);

void x10::lang::Clock::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(root));
    buf.write(this->FMGL(name));
    
}

::x10::lang::Reference* ::x10::lang::Clock::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Clock* this_ = new (::x10aux::alloc_z< ::x10::lang::Clock>()) ::x10::lang::Clock();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::Clock::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(root) = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Clock* > >();
    FMGL(name) = buf.read< ::x10::lang::String*>();
}

::x10aux::RuntimeType x10::lang::Clock::rtt;
void x10::lang::Clock::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.lang.Clock",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

::x10::lang::VoidFun_0_0::itable<x10_lang_Clock__closure__1>x10_lang_Clock__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Clock__closure__1::__apply, &x10_lang_Clock__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Clock__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Clock__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Clock__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Clock__closure__1::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_Clock__closure__2>x10_lang_Clock__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Clock__closure__2::__apply, &x10_lang_Clock__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Clock__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Clock__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Clock__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Clock__closure__2::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_Clock__closure__3>x10_lang_Clock__closure__3::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Clock__closure__3::__apply, &x10_lang_Clock__closure__3::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Clock__closure__3::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Clock__closure__3::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Clock__closure__3::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Clock__closure__3::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_Clock__closure__4>x10_lang_Clock__closure__4::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Clock__closure__4::__apply, &x10_lang_Clock__closure__4::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Clock__closure__4::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Clock__closure__4::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Clock__closure__4::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Clock__closure__4::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_Clock__closure__5>x10_lang_Clock__closure__5::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Clock__closure__5::__apply, &x10_lang_Clock__closure__5::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Clock__closure__5::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_Clock__closure__5::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Clock__closure__5::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Clock__closure__5::_deserialize);

/* END of Clock */
/*************************************************/
