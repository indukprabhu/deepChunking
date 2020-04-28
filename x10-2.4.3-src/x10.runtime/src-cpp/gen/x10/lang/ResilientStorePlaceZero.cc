/*************************************************/
/* START of ResilientStorePlaceZero */
#include <x10/lang/ResilientStorePlaceZero.h>

#ifndef X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__2_CLOSURE
#define X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_ResilientStorePlaceZero__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_ResilientStorePlaceZero__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        ::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::lang::Cell< ::x10::lang::Exception*>* >(exc)->x10::lang::Cell< ::x10::lang::Exception*>::__apply(
          t__104014);
        
        //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        ::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::util::concurrent::AtomicBoolean* >(c)->x10::util::concurrent::AtomicBoolean::getAndSet(
          true);
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* > exc;
    ::x10::lang::Exception* t__104014;
    ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > c;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->exc);
        buf.write(this->t__104014);
        buf.write(this->c);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_ResilientStorePlaceZero__closure__2* storage = ::x10aux::alloc_z<x10_lang_ResilientStorePlaceZero__closure__2>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* > that_exc = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* > >();
        ::x10::lang::Exception* that_t__104014 = buf.read< ::x10::lang::Exception*>();
        ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > that_c = buf.read< ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > >();
        x10_lang_ResilientStorePlaceZero__closure__2* this_ = new (storage) x10_lang_ResilientStorePlaceZero__closure__2(that_exc, that_t__104014, that_c);
        return this_;
    }
    
    x10_lang_ResilientStorePlaceZero__closure__2(::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* > exc, ::x10::lang::Exception* t__104014, ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > c) : exc(exc), t__104014(t__104014), c(c) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10:48-52";
    }

};

#endif // X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__2_CLOSURE
#ifndef X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__3_CLOSURE
#define X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_ResilientStorePlaceZero__closure__3 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_ResilientStorePlaceZero__closure__3> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        ::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::util::concurrent::AtomicBoolean* >(c)->x10::util::concurrent::AtomicBoolean::getAndSet(
          true);
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > c;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->c);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_ResilientStorePlaceZero__closure__3* storage = ::x10aux::alloc_z<x10_lang_ResilientStorePlaceZero__closure__3>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > that_c = buf.read< ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > >();
        x10_lang_ResilientStorePlaceZero__closure__3* this_ = new (storage) x10_lang_ResilientStorePlaceZero__closure__3(that_c);
        return this_;
    }
    
    x10_lang_ResilientStorePlaceZero__closure__3(::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > c) : c(c) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10:55-57";
    }

};

#endif // X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__3_CLOSURE
#ifndef X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__1_CLOSURE
#define X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_ResilientStorePlaceZero__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_ResilientStorePlaceZero__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        x10_boolean exc_thrown__104013 = false;
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        try {
            
            //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            ::x10::lang::VoidFun_0_0::__apply(::x10aux::nullCheck(cl));
        }
        catch (::x10::lang::CheckedThrowable* __exc1521) {
            if (::x10aux::instanceof< ::x10::lang::Exception*>(__exc1521)) {
                ::x10::lang::Exception* t__104014 = static_cast< ::x10::lang::Exception*>(__exc1521);
                {
                    
                    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (::x10::lang::FinishState::FMGL(VERBOSE__get)()) {
                        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125580 = ::x10aux::makeStringLit("lowLevelAt caught exception "); strLit__125580; })), t__104014)))->c_str());
                    }
                    
                    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    exc_thrown__104013 = true;
                    
                    //#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    ::x10::lang::Runtime::x10rtSendMessage(::x10::lang::Place::place((c)->location)->FMGL(id),
                                                           reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_ResilientStorePlaceZero__closure__2)))x10_lang_ResilientStorePlaceZero__closure__2(exc, t__104014, c))),
                                                           ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
                }
            } else
            throw;
        }
        
        //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        if (!(exc_thrown__104013)) {
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            ::x10::lang::Runtime::x10rtSendMessage(::x10::lang::Place::place((c)->location)->FMGL(id),
                                                   reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_ResilientStorePlaceZero__closure__3)))x10_lang_ResilientStorePlaceZero__closure__3(c))),
                                                   ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        }
        
    }
    
    // captured environment
    ::x10::lang::VoidFun_0_0* cl;
    ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > c;
    ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* > exc;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->cl);
        buf.write(this->c);
        buf.write(this->exc);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_ResilientStorePlaceZero__closure__1* storage = ::x10aux::alloc_z<x10_lang_ResilientStorePlaceZero__closure__1>();
        buf.record_reference(storage);
        ::x10::lang::VoidFun_0_0* that_cl = buf.read< ::x10::lang::VoidFun_0_0*>();
        ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > that_c = buf.read< ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > >();
        ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* > that_exc = buf.read< ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* > >();
        x10_lang_ResilientStorePlaceZero__closure__1* this_ = new (storage) x10_lang_ResilientStorePlaceZero__closure__1(that_cl, that_c, that_exc);
        return this_;
    }
    
    x10_lang_ResilientStorePlaceZero__closure__1(::x10::lang::VoidFun_0_0* cl, ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > c, ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* > exc) : cl(cl), c(c), exc(exc) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10:41-59";
    }

};

#endif // X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__1_CLOSURE
#ifndef X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__5_CLOSURE
#define X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__5_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_ResilientStorePlaceZero__closure__5 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_ResilientStorePlaceZero__closure__5> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        ::x10::lang::GlobalRef__LocalEval::getLocalOrCopy< ::x10::util::concurrent::AtomicLong* >(c)->x10::util::concurrent::AtomicLong::set(
          r__104017);
    }
    
    // captured environment
    ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicLong* > c;
    x10_long r__104017;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->c);
        buf.write(this->r__104017);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_ResilientStorePlaceZero__closure__5* storage = ::x10aux::alloc_z<x10_lang_ResilientStorePlaceZero__closure__5>();
        buf.record_reference(storage);
        ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicLong* > that_c = buf.read< ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicLong* > >();
        x10_long that_r__104017 = buf.read<x10_long>();
        x10_lang_ResilientStorePlaceZero__closure__5* this_ = new (storage) x10_lang_ResilientStorePlaceZero__closure__5(that_c, that_r__104017);
        return this_;
    }
    
    x10_lang_ResilientStorePlaceZero__closure__5(::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicLong* > c, x10_long r__104017) : c(c), r__104017(r__104017) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10:79-81";
    }

};

#endif // X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__5_CLOSURE
#ifndef X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__4_CLOSURE
#define X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__4_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_ResilientStorePlaceZero__closure__4 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_ResilientStorePlaceZero__closure__4> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        x10_long r__104017 = ::x10::lang::Fun_0_0<x10_long>::__apply(::x10aux::nullCheck(cl));
        
        //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        ::x10::lang::Runtime::x10rtSendMessage(::x10::lang::Place::place((c)->location)->FMGL(id),
                                               reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_ResilientStorePlaceZero__closure__5)))x10_lang_ResilientStorePlaceZero__closure__5(c, r__104017))),
                                               ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    }
    
    // captured environment
    ::x10::lang::Fun_0_0<x10_long>* cl;
    ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicLong* > c;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    ::x10aux::serialization_id_t _get_network_id() {
        return _network_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->cl);
        buf.write(this->c);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_ResilientStorePlaceZero__closure__4* storage = ::x10aux::alloc_z<x10_lang_ResilientStorePlaceZero__closure__4>();
        buf.record_reference(storage);
        ::x10::lang::Fun_0_0<x10_long>* that_cl = buf.read< ::x10::lang::Fun_0_0<x10_long>*>();
        ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicLong* > that_c = buf.read< ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicLong* > >();
        x10_lang_ResilientStorePlaceZero__closure__4* this_ = new (storage) x10_lang_ResilientStorePlaceZero__closure__4(that_cl, that_c);
        return this_;
    }
    
    x10_lang_ResilientStorePlaceZero__closure__4(::x10::lang::Fun_0_0<x10_long>* cl, ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicLong* > c) : cl(cl), c(c) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::serialization_id_t _network_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10:77-82";
    }

};

#endif // X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__4_CLOSURE
#ifndef X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__6_CLOSURE
#define X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__6_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
class x10_lang_ResilientStorePlaceZero__closure__6 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_0<x10_long>::itable<x10_lang_ResilientStorePlaceZero__closure__6> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply() {
        {
            
            //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            ::x10::lang::CheckedThrowable* throwable__104109 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                {
                    ::x10::lang::Runtime::enterAtomic();
                    {
                        
                        //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        ::x10::lang::ResilientStorePlaceZero__State* pfs =
                          (::x10aux::struct_equals(parentId, ((x10_long)-1ll)))
                          ? ((::x10aux::class_cast_unchecked< ::x10::lang::ResilientStorePlaceZero__State*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
                          : ((__extension__ ({
                                 ::x10::util::GrowableRail< ::x10::lang::ResilientStorePlaceZero__State*>* this__103964 =
                                   ::x10::lang::ResilientStorePlaceZero::FMGL(me__get)()->FMGL(states);
                                 
                                 //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                 x10_long idx__103963 = parentId;
                                 ::x10::lang::ResilientStorePlaceZero__State* ret__103965;
                                 
                                 //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                 ret__103965 = ::x10aux::nullCheck(this__103964->FMGL(data))->x10::lang::Rail< ::x10::lang::ResilientStorePlaceZero__State* >::__apply(
                                                 idx__103963);
                                 ret__103965;
                             }))
                             );
                        
                        //#line 235 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        x10_long id = (__extension__ ({
                            ::x10::util::GrowableRail< ::x10::lang::ResilientStorePlaceZero__State*>* this__103967 =
                              ::x10::lang::ResilientStorePlaceZero::FMGL(me__get)()->FMGL(states);
                            this__103967->FMGL(size);
                        }))
                        ;
                        
                        //#line 236 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
                        {
                            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125582 = ::x10aux::makeStringLit("make("); strLit__125582; })), parentId), (__extension__ ({ static ::x10::lang::String* strLit__125583 = ::x10aux::makeStringLit(","); strLit__125583; }))), id), (__extension__ ({ static ::x10::lang::String* strLit__125584 = ::x10aux::makeStringLit(") @ "); strLit__125584; }))), homeId)))->c_str());
                        }
                        
                        //#line 237 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        ::x10::lang::ResilientStorePlaceZero__State* fs =
                           (new (::x10aux::alloc_z< ::x10::lang::ResilientStorePlaceZero__State>()) ::x10::lang::ResilientStorePlaceZero__State());
                        (fs)->::x10::lang::ResilientStorePlaceZero__State::_constructor(
                          pfs, homeId, id, (::x10aux::struct_equals(latch,
                                                                    reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
                            ? (::x10::util::concurrent::SimpleLatch::_make())
                            : (latch));
                        
                        //#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        ::x10::lang::ResilientStorePlaceZero::FMGL(me__get)()->FMGL(states)->x10::util::GrowableRail< ::x10::lang::ResilientStorePlaceZero__State*>::add(
                          fs);
                        {
                            
                            //#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            x10_long t__104108 = fs->FMGL(id);
                            {
                                
                                //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                                ::x10::lang::Runtime::exitAtomic();
                            }
                            return t__104108;
                            
                        }
                    }
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc1524) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__104110 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1524);
                    {
                        throwable__104109 = formal__104110;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__104109)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__104109))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__104109));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::exitAtomic();
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__104109)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__104109)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__104109));
                }
                
            }
            
        }
    }
    
    // captured environment
    x10_long parentId;
    x10_long homeId;
    ::x10::util::concurrent::SimpleLatch* latch;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->parentId);
        buf.write(this->homeId);
        buf.write(this->latch);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_ResilientStorePlaceZero__closure__6* storage = ::x10aux::alloc_z<x10_lang_ResilientStorePlaceZero__closure__6>();
        buf.record_reference(storage);
        x10_long that_parentId = buf.read<x10_long>();
        x10_long that_homeId = buf.read<x10_long>();
        ::x10::util::concurrent::SimpleLatch* that_latch = buf.read< ::x10::util::concurrent::SimpleLatch*>();
        x10_lang_ResilientStorePlaceZero__closure__6* this_ = new (storage) x10_lang_ResilientStorePlaceZero__closure__6(that_parentId, that_homeId, that_latch);
        return this_;
    }
    
    x10_lang_ResilientStorePlaceZero__closure__6(x10_long parentId, x10_long homeId, ::x10::util::concurrent::SimpleLatch* latch) : parentId(parentId), homeId(homeId), latch(latch) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10:232-241";
    }

};

#endif // X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__6_CLOSURE
#ifndef X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__7_CLOSURE
#define X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__7_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_ResilientStorePlaceZero__closure__7 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_ResilientStorePlaceZero__closure__7> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        {
            ::x10::lang::CheckedThrowable* throwable__104112 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                {
                    ::x10::lang::Runtime::enterAtomic();
                    {
                        
                        //#line 256 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
                        {
                            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125587 = ::x10aux::makeStringLit("notifySubActivitySpawn("); strLit__125587; })), id), (__extension__ ({ static ::x10::lang::String* strLit__125588 = ::x10aux::makeStringLit(", "); strLit__125588; }))), srcId), (__extension__ ({ static ::x10::lang::String* strLit__125589 = ::x10aux::makeStringLit(", "); strLit__125589; }))), dstId), (__extension__ ({ static ::x10::lang::String* strLit__125590 = ::x10aux::makeStringLit(")"); strLit__125590; })))))->c_str());
                        }
                        
                        //#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        ::x10::util::Pair< ::x10::lang::ResilientStorePlaceZero__State*, x10_boolean> pair =
                          ::x10::lang::ResilientStorePlaceZero::getStateAccountingForAdoption(
                            id);
                        
                        //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        ::x10::lang::ResilientStorePlaceZero__State* fs =
                          pair->FMGL(first);
                        
                        //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        x10_boolean adopted = pair->FMGL(second);
                        
                        //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        if (adopted) {
                            
                            //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            ::x10aux::nullCheck(fs)->transitAdoptedInc(
                              srcId, dstId);
                            
                            //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
                            {
                                ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125591 = ::x10aux::makeStringLit("    transitAdopted("); strLit__125591; })), srcId), (__extension__ ({ static ::x10::lang::String* strLit__125592 = ::x10aux::makeStringLit(","); strLit__125592; }))), dstId), (__extension__ ({ static ::x10::lang::String* strLit__125593 = ::x10aux::makeStringLit(") == "); strLit__125593; }))), ::x10aux::nullCheck(fs)->transitAdoptedGet(
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          srcId,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          dstId))))->c_str());
                            }
                            
                        } else {
                            
                            //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            ::x10aux::nullCheck(fs)->transitInc(
                              srcId, dstId);
                            
                            //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
                            {
                                ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125594 = ::x10aux::makeStringLit("    transit("); strLit__125594; })), srcId), (__extension__ ({ static ::x10::lang::String* strLit__125595 = ::x10aux::makeStringLit(","); strLit__125595; }))), dstId), (__extension__ ({ static ::x10::lang::String* strLit__125596 = ::x10aux::makeStringLit(") == "); strLit__125596; }))), ::x10aux::nullCheck(fs)->transitGet(
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   srcId,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   dstId))))->c_str());
                            }
                            
                        }
                        
                        //#line 267 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        ::x10aux::nullCheck(fs)->FMGL(totalCounter) =
                          ((::x10aux::nullCheck(fs)->FMGL(totalCounter)) + (((x10_long)1ll)));
                    }
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc1527) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__104113 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1527);
                    {
                        throwable__104112 = formal__104113;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__104112)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__104112))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__104112));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::exitAtomic();
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__104112)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__104112)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__104112));
                }
                
            }
            
        }
    }
    
    // captured environment
    x10_long id;
    x10_long srcId;
    x10_long dstId;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->id);
        buf.write(this->srcId);
        buf.write(this->dstId);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_ResilientStorePlaceZero__closure__7* storage = ::x10aux::alloc_z<x10_lang_ResilientStorePlaceZero__closure__7>();
        buf.record_reference(storage);
        x10_long that_id = buf.read<x10_long>();
        x10_long that_srcId = buf.read<x10_long>();
        x10_long that_dstId = buf.read<x10_long>();
        x10_lang_ResilientStorePlaceZero__closure__7* this_ = new (storage) x10_lang_ResilientStorePlaceZero__closure__7(that_id, that_srcId, that_dstId);
        return this_;
    }
    
    x10_lang_ResilientStorePlaceZero__closure__7(x10_long id, x10_long srcId, x10_long dstId) : id(id), srcId(srcId), dstId(dstId) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10:255-268";
    }

};

#endif // X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__7_CLOSURE
#ifndef X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__8_CLOSURE
#define X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__8_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_0.h>
class x10_lang_ResilientStorePlaceZero__closure__8 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_0<x10_long>::itable<x10_lang_ResilientStorePlaceZero__closure__8> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply() {
        {
            ::x10::lang::CheckedThrowable* throwable__104117 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                {
                    ::x10::lang::Runtime::enterAtomic();
                    {
                        
                        //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
                        {
                            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125597 = ::x10aux::makeStringLit("notifyActivityCreation("); strLit__125597; })), id), (__extension__ ({ static ::x10::lang::String* strLit__125598 = ::x10aux::makeStringLit(", "); strLit__125598; }))), srcId), (__extension__ ({ static ::x10::lang::String* strLit__125599 = ::x10aux::makeStringLit(", "); strLit__125599; }))), dstId), (__extension__ ({ static ::x10::lang::String* strLit__125600 = ::x10aux::makeStringLit(")"); strLit__125600; })))))->c_str());
                        }
                        
                        //#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        if ((__extension__ ({
                                ::x10::lang::Place this__103981 = (__extension__ ({
                                    ::x10::lang::Place alloc__101400 =  ::x10::lang::Place::_alloc();
                                    (alloc__101400)->::x10::lang::Place::_constructor(
                                      srcId);
                                    alloc__101400;
                                }))
                                ;
                                x10rt_is_place_dead((x10_int)this__103981->FMGL(id));
                            }))
                            ) {
                            {
                                x10_long t__104115 = ((x10_long)0ll);
                                {
                                    
                                    //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                                    ::x10::lang::Runtime::exitAtomic();
                                }
                                return t__104115;
                                
                            }
                        }
                        
                        //#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        ::x10::util::Pair< ::x10::lang::ResilientStorePlaceZero__State*, x10_boolean> pair =
                          ::x10::lang::ResilientStorePlaceZero::getStateAccountingForAdoption(
                            id);
                        
                        //#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        ::x10::lang::ResilientStorePlaceZero__State* fs =
                          pair->FMGL(first);
                        
                        //#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        x10_boolean adopted = pair->FMGL(second);
                        
                        //#line 278 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        if (adopted) {
                            
                            //#line 279 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            ::x10::lang::Rail< x10_int >* a__104054 =
                              ::x10aux::nullCheck(fs)->FMGL(liveAdopted);
                            x10_long i__104055 = dstId;
                            x10_int r__104056 = ((::x10aux::nullCheck(a__104054)->x10::lang::Rail< x10_int >::__apply(
                                                    i__104055)) + (((x10_int)1)));
                            ::x10aux::nullCheck(a__104054)->x10::lang::Rail< x10_int >::__set(
                              i__104055, r__104056);
                            
                            //#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            ::x10aux::nullCheck(fs)->transitAdoptedDec(
                              srcId, dstId);
                            
                            //#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
                            {
                                ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125602 = ::x10aux::makeStringLit("    liveAdopted("); strLit__125602; })), dstId), (__extension__ ({ static ::x10::lang::String* strLit__125603 = ::x10aux::makeStringLit(") == "); strLit__125603; }))), ::x10aux::nullCheck(::x10aux::nullCheck(fs)->FMGL(liveAdopted))->x10::lang::Rail< x10_int >::__apply(
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    dstId))))->c_str());
                            }
                            
                            //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
                            {
                                ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125605 = ::x10aux::makeStringLit("    transitAdopted("); strLit__125605; })), srcId), (__extension__ ({ static ::x10::lang::String* strLit__125606 = ::x10aux::makeStringLit(","); strLit__125606; }))), dstId), (__extension__ ({ static ::x10::lang::String* strLit__125607 = ::x10aux::makeStringLit(") == "); strLit__125607; }))), ::x10aux::nullCheck(fs)->transitAdoptedGet(
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          srcId,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          dstId))))->c_str());
                            }
                            
                        } else {
                            
                            //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            ::x10::lang::Rail< x10_int >* a__104057 =
                              ::x10aux::nullCheck(fs)->FMGL(live);
                            x10_long i__104058 = dstId;
                            x10_int r__104059 = ((::x10aux::nullCheck(a__104057)->x10::lang::Rail< x10_int >::__apply(
                                                    i__104058)) + (((x10_int)1)));
                            ::x10aux::nullCheck(a__104057)->x10::lang::Rail< x10_int >::__set(
                              i__104058, r__104059);
                            
                            //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            ::x10aux::nullCheck(fs)->transitDec(
                              srcId, dstId);
                            
                            //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
                            {
                                ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125609 = ::x10aux::makeStringLit("    live("); strLit__125609; })), dstId), (__extension__ ({ static ::x10::lang::String* strLit__125610 = ::x10aux::makeStringLit(") == "); strLit__125610; }))), ::x10aux::nullCheck(::x10aux::nullCheck(fs)->FMGL(live))->x10::lang::Rail< x10_int >::__apply(
                                                                                                                                                                                                                                                                                                                                                                                                                                                                             dstId))))->c_str());
                            }
                            
                            //#line 287 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
                            {
                                ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125612 = ::x10aux::makeStringLit("    transit("); strLit__125612; })), srcId), (__extension__ ({ static ::x10::lang::String* strLit__125613 = ::x10aux::makeStringLit(","); strLit__125613; }))), dstId), (__extension__ ({ static ::x10::lang::String* strLit__125614 = ::x10aux::makeStringLit(") == "); strLit__125614; }))), ::x10aux::nullCheck(fs)->transitGet(
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   srcId,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   dstId))))->c_str());
                            }
                            
                        }
                        {
                            
                            //#line 289 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            x10_long t__104116 = ((x10_long)1ll);
                            {
                                
                                //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                                ::x10::lang::Runtime::exitAtomic();
                            }
                            return t__104116;
                            
                        }
                    }
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc1529) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__104118 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1529);
                    {
                        throwable__104117 = formal__104118;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__104117)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__104117))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__104117));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::exitAtomic();
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__104117)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__104117)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__104117));
                }
                
            }
            
        }
    }
    
    // captured environment
    x10_long id;
    x10_long srcId;
    x10_long dstId;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->id);
        buf.write(this->srcId);
        buf.write(this->dstId);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_ResilientStorePlaceZero__closure__8* storage = ::x10aux::alloc_z<x10_lang_ResilientStorePlaceZero__closure__8>();
        buf.record_reference(storage);
        x10_long that_id = buf.read<x10_long>();
        x10_long that_srcId = buf.read<x10_long>();
        x10_long that_dstId = buf.read<x10_long>();
        x10_lang_ResilientStorePlaceZero__closure__8* this_ = new (storage) x10_lang_ResilientStorePlaceZero__closure__8(that_id, that_srcId, that_dstId);
        return this_;
    }
    
    x10_lang_ResilientStorePlaceZero__closure__8(x10_long id, x10_long srcId, x10_long dstId) : id(id), srcId(srcId), dstId(dstId) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10:272-290";
    }

};

#endif // X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__8_CLOSURE
#ifndef X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__9_CLOSURE
#define X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__9_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_ResilientStorePlaceZero__closure__9 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_ResilientStorePlaceZero__closure__9> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        {
            ::x10::lang::CheckedThrowable* throwable__104120 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                {
                    ::x10::lang::Runtime::enterAtomic();
                    {
                        
                        //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
                        {
                            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125615 = ::x10aux::makeStringLit("notifyActivityTermination("); strLit__125615; })), id), (__extension__ ({ static ::x10::lang::String* strLit__125616 = ::x10aux::makeStringLit(", "); strLit__125616; }))), dstId), (__extension__ ({ static ::x10::lang::String* strLit__125617 = ::x10aux::makeStringLit(")"); strLit__125617; })))))->c_str());
                        }
                        
                        //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        ::x10::util::Pair< ::x10::lang::ResilientStorePlaceZero__State*, x10_boolean> pair =
                          ::x10::lang::ResilientStorePlaceZero::getStateAccountingForAdoption(
                            id);
                        
                        //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        ::x10::lang::ResilientStorePlaceZero__State* fs =
                          pair->FMGL(first);
                        
                        //#line 298 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        x10_boolean adopted = pair->FMGL(second);
                        
                        //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        if (adopted) {
                            
                            //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            ::x10::lang::Rail< x10_int >* a__104060 =
                              ::x10aux::nullCheck(fs)->FMGL(liveAdopted);
                            x10_long i__104061 = dstId;
                            x10_int r__104062 = ((::x10aux::nullCheck(a__104060)->x10::lang::Rail< x10_int >::__apply(
                                                    i__104061)) - (((x10_int)1)));
                            ::x10aux::nullCheck(a__104060)->x10::lang::Rail< x10_int >::__set(
                              i__104061, r__104062);
                        } else {
                            
                            //#line 302 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            ::x10::lang::Rail< x10_int >* a__104063 =
                              ::x10aux::nullCheck(fs)->FMGL(live);
                            x10_long i__104064 = dstId;
                            x10_int r__104065 = ((::x10aux::nullCheck(a__104063)->x10::lang::Rail< x10_int >::__apply(
                                                    i__104064)) - (((x10_int)1)));
                            ::x10aux::nullCheck(a__104063)->x10::lang::Rail< x10_int >::__set(
                              i__104064, r__104065);
                        }
                        
                        //#line 304 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        ::x10aux::nullCheck(fs)->FMGL(totalCounter) =
                          ((::x10aux::nullCheck(fs)->FMGL(totalCounter)) - (((x10_long)1ll)));
                        
                        //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
                        {
                            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125620 = ::x10aux::makeStringLit("    live("); strLit__125620; })), dstId), (__extension__ ({ static ::x10::lang::String* strLit__125621 = ::x10aux::makeStringLit(") == "); strLit__125621; }))), ::x10aux::nullCheck(::x10aux::nullCheck(fs)->FMGL(live))->x10::lang::Rail< x10_int >::__apply(
                                                                                                                                                                                                                                                                                                                                                                                                                                                                         dstId))))->c_str());
                        }
                        
                        //#line 306 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        if (::x10::lang::ResilientStorePlaceZero::FMGL(me__get)()->quiescent(
                              fs)) {
                            
                            //#line 307 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
                            {
                                ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__125623 = ::x10aux::makeStringLit("    Releasing latch..."); strLit__125623; }))))->c_str());
                            }
                            
                            //#line 308 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            ::x10aux::nullCheck(::x10aux::nullCheck(fs)->FMGL(latch))->release();
                        }
                        
                    }
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc1531) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__104121 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1531);
                    {
                        throwable__104120 = formal__104121;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__104120)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__104120))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__104120));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::exitAtomic();
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__104120)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__104120)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__104120));
                }
                
            }
            
        }
    }
    
    // captured environment
    x10_long id;
    x10_long dstId;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->id);
        buf.write(this->dstId);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_ResilientStorePlaceZero__closure__9* storage = ::x10aux::alloc_z<x10_lang_ResilientStorePlaceZero__closure__9>();
        buf.record_reference(storage);
        x10_long that_id = buf.read<x10_long>();
        x10_long that_dstId = buf.read<x10_long>();
        x10_lang_ResilientStorePlaceZero__closure__9* this_ = new (storage) x10_lang_ResilientStorePlaceZero__closure__9(that_id, that_dstId);
        return this_;
    }
    
    x10_lang_ResilientStorePlaceZero__closure__9(x10_long id, x10_long dstId) : id(id), dstId(dstId) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10:294-310";
    }

};

#endif // X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__9_CLOSURE
#ifndef X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__10_CLOSURE
#define X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__10_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_ResilientStorePlaceZero__closure__10 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_ResilientStorePlaceZero__closure__10> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        {
            ::x10::lang::CheckedThrowable* throwable__104123 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                {
                    ::x10::lang::Runtime::enterAtomic();
                    {
                        
                        //#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        ::x10::lang::ResilientStorePlaceZero__State* fs =
                          (__extension__ ({
                            ::x10::util::GrowableRail< ::x10::lang::ResilientStorePlaceZero__State*>* this__103983 =
                              ::x10::lang::ResilientStorePlaceZero::FMGL(me__get)()->FMGL(states);
                            
                            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            x10_long idx__103982 = id;
                            ::x10::lang::ResilientStorePlaceZero__State* ret__103984;
                            
                            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            ret__103984 = ::x10aux::nullCheck(this__103983->FMGL(data))->x10::lang::Rail< ::x10::lang::ResilientStorePlaceZero__State* >::__apply(
                                            idx__103982);
                            ret__103984;
                        }))
                        ;
                        
                        //#line 321 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        if (::x10aux::nullCheck(fs)->FMGL(adopted))
                        {
                            
                            //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
                            {
                                ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125625 = ::x10aux::makeStringLit("pushException("); strLit__125625; })), id), (__extension__ ({ static ::x10::lang::String* strLit__125626 = ::x10aux::makeStringLit(", "); strLit__125626; }))), t), (__extension__ ({ static ::x10::lang::String* strLit__125627 = ::x10aux::makeStringLit(") dropped due to dead finish"); strLit__125627; })))))->c_str());
                            }
                            
                        } else {
                            
                            //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
                            {
                                ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125628 = ::x10aux::makeStringLit("pushException("); strLit__125628; })), id), (__extension__ ({ static ::x10::lang::String* strLit__125629 = ::x10aux::makeStringLit(", "); strLit__125629; }))), t), (__extension__ ({ static ::x10::lang::String* strLit__125630 = ::x10aux::makeStringLit(")"); strLit__125630; })))))->c_str());
                            }
                            
                            //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            ::x10aux::nullCheck(::x10aux::nullCheck(fs)->ensureMultipleExceptions())->x10::util::GrowableRail< ::x10::lang::Exception*>::add(
                              t);
                        }
                        
                    }
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc1534) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__104124 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1534);
                    {
                        throwable__104123 = formal__104124;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__104123)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__104123))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__104123));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::exitAtomic();
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__104123)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__104123)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__104123));
                }
                
            }
            
        }
    }
    
    // captured environment
    x10_long id;
    ::x10::lang::Exception* t;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->id);
        buf.write(this->t);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_ResilientStorePlaceZero__closure__10* storage = ::x10aux::alloc_z<x10_lang_ResilientStorePlaceZero__closure__10>();
        buf.record_reference(storage);
        x10_long that_id = buf.read<x10_long>();
        ::x10::lang::Exception* that_t = buf.read< ::x10::lang::Exception*>();
        x10_lang_ResilientStorePlaceZero__closure__10* this_ = new (storage) x10_lang_ResilientStorePlaceZero__closure__10(that_id, that_t);
        return this_;
    }
    
    x10_lang_ResilientStorePlaceZero__closure__10(x10_long id, ::x10::lang::Exception* t) : id(id), t(t) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10:319-328";
    }

};

#endif // X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__10_CLOSURE
#ifndef X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__11_CLOSURE
#define X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__11_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_0.h>
class x10_lang_ResilientStorePlaceZero__closure__11 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_0::itable<x10_lang_ResilientStorePlaceZero__closure__11> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply() {
        
        //#line 433 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        if (::x10::lang::FinishState::FMGL(VERBOSE__get)()) {
            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125653 = ::x10aux::makeStringLit("waitForFinish("); strLit__125653; })), id), (__extension__ ({ static ::x10::lang::String* strLit__125654 = ::x10aux::makeStringLit(")"); strLit__125654; })))))->c_str());
        }
        
        //#line 434 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        ::x10::lang::ResilientStorePlaceZero__State* s;
        {
            
            //#line 435 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            ::x10::lang::CheckedThrowable* throwable__104129 = ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            try {
                {
                    ::x10::lang::Runtime::enterAtomic();
                    {
                        
                        //#line 436 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        s = (__extension__ ({
                            ::x10::util::GrowableRail< ::x10::lang::ResilientStorePlaceZero__State*>* this__103997 =
                              ::x10::lang::ResilientStorePlaceZero::FMGL(me__get)()->FMGL(states);
                            
                            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            x10_long idx__103996 = id;
                            ::x10::lang::ResilientStorePlaceZero__State* ret__103998;
                            
                            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            ret__103998 = ::x10aux::nullCheck(this__103997->FMGL(data))->x10::lang::Rail< ::x10::lang::ResilientStorePlaceZero__State* >::__apply(
                                            idx__103996);
                            ret__103998;
                        }))
                        ;
                    }
                }
                ::x10::compiler::Finalization::plausibleThrow();
            }
            catch (::x10::lang::CheckedThrowable* __exc1539) {
                if (true) {
                    ::x10::lang::CheckedThrowable* formal__104130 =
                      static_cast< ::x10::lang::CheckedThrowable*>(__exc1539);
                    {
                        throwable__104129 = formal__104130;
                    }
                } else
                throw;
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__104129)))
            {
                if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__104129))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__104129));
                }
                
            }
            if (true) {
                ::x10::lang::Runtime::exitAtomic();
            }
            if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                          throwable__104129)))
            {
                if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__104129)))
                {
                    ::x10aux::throwException(::x10aux::nullCheck(throwable__104129));
                }
                
            }
            
        }
        
        //#line 438 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        ::x10::lang::ResilientStorePlaceZero::notifyActivityTermination(
          id, ::x10aux::nullCheck(s)->FMGL(homeId));
        
        //#line 440 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        ::x10aux::nullCheck(::x10aux::nullCheck(s)->FMGL(latch))->await();
        
        //#line 444 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        if (!(::x10aux::nullCheck(s)->FMGL(adopted))) {
            {
                
                //#line 445 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                ::x10::lang::CheckedThrowable* throwable__104132 =
                  ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                try {
                    {
                        ::x10::lang::Runtime::enterAtomic();
                        {
                            ::x10::util::GrowableRail< ::x10::lang::ResilientStorePlaceZero__State*>* this__104103 =
                              ::x10::lang::ResilientStorePlaceZero::FMGL(me__get)()->FMGL(states);
                            
                            //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            x10_long idx__104104 = id;
                            ::x10::lang::ResilientStorePlaceZero__State* v__104105 =
                              ::x10aux::class_cast_unchecked< ::x10::lang::ResilientStorePlaceZero__State*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
                            
                            //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                            if ((::x10aux::struct_equals(idx__104104,
                                                         this__104103->FMGL(size))))
                            {
                                
                                //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                this__104103->x10::util::GrowableRail< ::x10::lang::ResilientStorePlaceZero__State*>::add(
                                  reinterpret_cast< ::x10::lang::ResilientStorePlaceZero__State*>(X10_NULL));
                            } else {
                                
                                //#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                ::x10aux::nullCheck(this__104103->FMGL(data))->x10::lang::Rail< ::x10::lang::ResilientStorePlaceZero__State* >::__set(
                                  idx__104104, reinterpret_cast< ::x10::lang::ResilientStorePlaceZero__State*>(X10_NULL));
                            }
                            
                        }
                    }
                    ::x10::compiler::Finalization::plausibleThrow();
                }
                catch (::x10::lang::CheckedThrowable* __exc1540) {
                    if (true) {
                        ::x10::lang::CheckedThrowable* formal__104133 =
                          static_cast< ::x10::lang::CheckedThrowable*>(__exc1540);
                        {
                            throwable__104132 = formal__104133;
                        }
                    } else
                    throw;
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__104132)))
                {
                    if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__104132))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__104132));
                    }
                    
                }
                if (true) {
                    ::x10::lang::Runtime::exitAtomic();
                }
                if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                              throwable__104132)))
                {
                    if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__104132)))
                    {
                        ::x10aux::throwException(::x10aux::nullCheck(throwable__104132));
                    }
                    
                }
                
            }
            
            //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            if ((!::x10aux::struct_equals(::x10aux::nullCheck(s)->FMGL(multipleExceptions),
                                          reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
            {
                
                //#line 447 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
                {
                    ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125656 = ::x10aux::makeStringLit("waitForFinish("); strLit__125656; })), id), (__extension__ ({ static ::x10::lang::String* strLit__125657 = ::x10aux::makeStringLit(") done waiting (throwing exceptions)"); strLit__125657; })))))->c_str());
                }
                
                //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::MultipleExceptions::_make(::x10aux::nullCheck(s)->FMGL(multipleExceptions))));
            }
            
            //#line 450 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
            {
                ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125658 = ::x10aux::makeStringLit("waitForFinish("); strLit__125658; })), id), (__extension__ ({ static ::x10::lang::String* strLit__125659 = ::x10aux::makeStringLit(") done waiting"); strLit__125659; })))))->c_str());
            }
            
        } else 
        //#line 452 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
        {
            ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125660 = ::x10aux::makeStringLit("waitForFinish("); strLit__125660; })), id), (__extension__ ({ static ::x10::lang::String* strLit__125661 = ::x10aux::makeStringLit(") done waiting, finish was dead (cleaning up)"); strLit__125661; })))))->c_str());
        }
        
    }
    
    // captured environment
    x10_long id;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->id);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_ResilientStorePlaceZero__closure__11* storage = ::x10aux::alloc_z<x10_lang_ResilientStorePlaceZero__closure__11>();
        buf.record_reference(storage);
        x10_long that_id = buf.read<x10_long>();
        x10_lang_ResilientStorePlaceZero__closure__11* this_ = new (storage) x10_lang_ResilientStorePlaceZero__closure__11(that_id);
        return this_;
    }
    
    x10_lang_ResilientStorePlaceZero__closure__11(x10_long id) : id(id) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_0>(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10:432-454";
    }

};

#endif // X10_LANG_RESILIENTSTOREPLACEZERO__CLOSURE__11_CLOSURE

//#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
::x10::lang::ResilientStorePlaceZero* x10::lang::ResilientStorePlaceZero::FMGL(me);
void x10::lang::ResilientStorePlaceZero::FMGL(me__do_init)() {
    FMGL(me__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::lang::ResilientStorePlaceZero.me");
    ::x10::lang::ResilientStorePlaceZero* __var1519__ = ::x10::lang::ResilientStorePlaceZero::_make();
    FMGL(me) = __var1519__;
    FMGL(me__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::lang::ResilientStorePlaceZero::FMGL(me__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(me__status), &FMGL(me__do_init), &FMGL(me__exception), "x10::lang::ResilientStorePlaceZero.me");
    
}
volatile ::x10aux::StaticInitController::status x10::lang::ResilientStorePlaceZero::FMGL(me__status);
::x10::lang::CheckedThrowable* x10::lang::ResilientStorePlaceZero::FMGL(me__exception);

//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
void x10::lang::ResilientStorePlaceZero::lowLevelAt(::x10::lang::VoidFun_0_0* cl) {
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    if ((::x10aux::struct_equals(::x10::lang::Place::_make(::x10aux::here)->FMGL(id),
                                 ((x10_long)0ll)))) {
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        ::x10::lang::VoidFun_0_0::__apply(::x10aux::nullCheck(cl));
    } else {
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* > exc =
          ::x10::lang::GlobalRef< ::x10::lang::Cell< ::x10::lang::Exception*>* >((__extension__ ({
            ::x10::lang::Cell< ::x10::lang::Exception*>* alloc__101395 =
               (new (::x10aux::alloc_z< ::x10::lang::Cell< ::x10::lang::Exception*> >()) ::x10::lang::Cell< ::x10::lang::Exception*>());
            
            //#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Cell.x10"
            ::x10::lang::Exception* x__104011 = ::x10aux::class_cast_unchecked< ::x10::lang::Exception*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            alloc__101395->FMGL(value) = (reinterpret_cast< ::x10::lang::Exception*>(reinterpret_cast< ::x10::lang::Exception*>(X10_NULL)));
            alloc__101395;
        }))
        );
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* > c =
          ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicBoolean* >(::x10::util::concurrent::AtomicBoolean::_make());
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::VoidFun_0_0* msgBody__104012 = reinterpret_cast< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_ResilientStorePlaceZero__closure__1)))x10_lang_ResilientStorePlaceZero__closure__1(cl, c, exc))));
        ::x10::lang::Runtime__Profile* prof__104015 = ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::run_closure_at((x10_int)((x10_long)0ll), msgBody__104012, reinterpret_cast< ::x10::lang::Runtime__Profile*>(X10_NULL), ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        if (!((c)->__apply()->x10::util::concurrent::AtomicBoolean::get()))
        {
            
            //#line 1559 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
            {
                
                //#line 1560 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                ::x10::lang::Runtime::FMGL(pool__get)()->increase();
            }
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            do {
                ::x10aux::event_probe();
            } while (!((c)->__apply()->x10::util::concurrent::AtomicBoolean::get()));
            
            //#line 1566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
            {
                
                //#line 1567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                ::x10::lang::Runtime::FMGL(pool__get)()->decrease(
                  ((x10_int)1));
            }
            
        }
        
        //#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        if ((!::x10aux::struct_equals((__extension__ ({
                                          ::x10::lang::Cell< ::x10::lang::Exception*>* this__103907 =
                                            (exc)->__apply();
                                          this__103907->FMGL(value);
                                      }))
                                      , reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
        {
            ::x10aux::throwException(::x10aux::nullCheck((__extension__ ({
                ::x10::lang::Cell< ::x10::lang::Exception*>* this__103908 =
                  (exc)->__apply();
                this__103908->FMGL(value);
            }))
            ));
        }
        
    }
    
}

//#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
x10_long x10::lang::ResilientStorePlaceZero::lowLevelAtExprLong(
  ::x10::lang::Fun_0_0<x10_long>* cl) {
    
    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    if ((::x10aux::struct_equals(::x10::lang::Place::_make(::x10aux::here)->FMGL(id),
                                 ((x10_long)0ll)))) {
        
        //#line 74 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        return ::x10::lang::Fun_0_0<x10_long>::__apply(::x10aux::nullCheck(cl));
        
    } else {
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicLong* > c =
          ::x10::lang::GlobalRef< ::x10::util::concurrent::AtomicLong* >(::x10::util::concurrent::AtomicLong::_make(((x10_long)-1ll)));
        
        //#line 76 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10::lang::VoidFun_0_0* msgBody__104016 = reinterpret_cast< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_ResilientStorePlaceZero__closure__4)))x10_lang_ResilientStorePlaceZero__closure__4(cl, c))));
        ::x10::lang::Runtime__Profile* prof__104018 = ::x10aux::class_cast_unchecked< ::x10::lang::Runtime__Profile*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        
        //#line 77 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
        ::x10aux::run_closure_at((x10_int)((x10_long)0ll), msgBody__104016, reinterpret_cast< ::x10::lang::Runtime__Profile*>(X10_NULL), ::x10aux::class_cast_unchecked< ::x10::lang::VoidFun_0_0*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        
        //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        if ((::x10aux::struct_equals((c)->__apply()->x10::util::concurrent::AtomicLong::get(),
                                     ((x10_long)-1ll)))) {
            
            //#line 1559 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
            {
                
                //#line 1560 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                ::x10::lang::Runtime::FMGL(pool__get)()->increase();
            }
            
            //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            do {
                ::x10aux::event_probe();
            } while ((::x10aux::struct_equals((c)->__apply()->x10::util::concurrent::AtomicLong::get(),
                                              ((x10_long)-1ll))));
            
            //#line 1566 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
            if (!(::x10::lang::Runtime::FMGL(STATIC_THREADS__get)()))
            {
                
                //#line 1567 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Runtime.x10"
                ::x10::lang::Runtime::FMGL(pool__get)()->decrease(
                  ((x10_int)1));
            }
            
        }
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        return (c)->__apply()->x10::util::concurrent::AtomicLong::get();
        
    }
    
}

//#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"

//#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"

//#line 231 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
x10_long x10::lang::ResilientStorePlaceZero::make(x10_long homeId,
                                                  x10_long parentId,
                                                  ::x10::util::concurrent::SimpleLatch* latch) {
    
    //#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    return ::x10::lang::ResilientStorePlaceZero::lowLevelAtExprLong(
             reinterpret_cast< ::x10::lang::Fun_0_0<x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0<x10_long> >(sizeof(x10_lang_ResilientStorePlaceZero__closure__6)))x10_lang_ResilientStorePlaceZero__closure__6(parentId, homeId, latch))));
    
}

//#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
::x10::util::Pair< ::x10::lang::ResilientStorePlaceZero__State*, x10_boolean>
  x10::lang::ResilientStorePlaceZero::getStateAccountingForAdoption(
  x10_long id) {
    
    //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    ::x10::lang::ResilientStorePlaceZero__State* fs = (__extension__ ({
        ::x10::util::GrowableRail< ::x10::lang::ResilientStorePlaceZero__State*>* this__103969 =
          ::x10::lang::ResilientStorePlaceZero::FMGL(me__get)()->FMGL(states);
        
        //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        x10_long idx__103968 = id;
        ::x10::lang::ResilientStorePlaceZero__State* ret__103970;
        
        //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        ret__103970 = ::x10aux::nullCheck(this__103969->FMGL(data))->x10::lang::Rail< ::x10::lang::ResilientStorePlaceZero__State* >::__apply(
                        idx__103968);
        ret__103970;
    }))
    ;
    
    //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    x10_boolean adopted = false;
    
    //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    while (::x10aux::nullCheck(fs)->FMGL(adopted)) {
        
        //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        adopted = true;
        
        //#line 249 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        fs = (__extension__ ({
            ::x10::util::GrowableRail< ::x10::lang::ResilientStorePlaceZero__State*>* this__103973 =
              ::x10::lang::ResilientStorePlaceZero::FMGL(me__get)()->FMGL(states);
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            x10_long idx__103972 = ::x10aux::nullCheck(fs)->FMGL(adoptedParent);
            ::x10::lang::ResilientStorePlaceZero__State* ret__103974;
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ret__103974 = ::x10aux::nullCheck(this__103973->FMGL(data))->x10::lang::Rail< ::x10::lang::ResilientStorePlaceZero__State* >::__apply(
                            idx__103972);
            ret__103974;
        }))
        ;
    }
    
    //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    ::x10::util::Pair< ::x10::lang::ResilientStorePlaceZero__State*, x10_boolean> alloc__104053 =
       ::x10::util::Pair< ::x10::lang::ResilientStorePlaceZero__State*, x10_boolean>::_alloc();
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    ::x10::lang::ResilientStorePlaceZero__State* first__104051 =
      fs;
    x10_boolean second__104052 = adopted;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    alloc__104053->FMGL(first) = first__104051;
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    alloc__104053->FMGL(second) = second__104052;
    
    //#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    return alloc__104053;
    
}

//#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
void x10::lang::ResilientStorePlaceZero::notifySubActivitySpawn(
  x10_long id, x10_long srcId, x10_long dstId) {
    
    //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    ::x10::lang::ResilientStorePlaceZero::lowLevelAt(reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_ResilientStorePlaceZero__closure__7)))x10_lang_ResilientStorePlaceZero__closure__7(id, srcId, dstId))));
}

//#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
x10_boolean x10::lang::ResilientStorePlaceZero::notifyActivityCreation(
  x10_long id, x10_long srcId, x10_long dstId) {
    
    //#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    return (::x10aux::struct_equals(((x10_long)1ll), ::x10::lang::ResilientStorePlaceZero::lowLevelAtExprLong(
                                                       reinterpret_cast< ::x10::lang::Fun_0_0<x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_0<x10_long> >(sizeof(x10_lang_ResilientStorePlaceZero__closure__8)))x10_lang_ResilientStorePlaceZero__closure__8(id, srcId, dstId))))));
    
}

//#line 293 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
void x10::lang::ResilientStorePlaceZero::notifyActivityTermination(
  x10_long id, x10_long dstId) {
    
    //#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    ::x10::lang::ResilientStorePlaceZero::lowLevelAt(reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_ResilientStorePlaceZero__closure__9)))x10_lang_ResilientStorePlaceZero__closure__9(id, dstId))));
}

//#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
void x10::lang::ResilientStorePlaceZero::notifyPlaceDeath(
  x10_long root_id) {
    
    //#line 314 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    #ifndef NO_ASSERTIONS
    if (::x10aux::x10__assertions_enabled)
        ::x10aux::x10__assert((::x10aux::struct_equals(::x10::lang::Place::_make(::x10aux::here),
                                                       ::x10::lang::Place::FMGL(FIRST_PLACE__get)())));
    #endif//NO_ASSERTIONS
    
    //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    ::x10::lang::ResilientStorePlaceZero::FMGL(me__get)()->pushUp();
}

//#line 318 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
void x10::lang::ResilientStorePlaceZero::pushException(x10_long id,
                                                       ::x10::lang::Exception* t) {
    
    //#line 319 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    ::x10::lang::ResilientStorePlaceZero::lowLevelAt(reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_ResilientStorePlaceZero__closure__10)))x10_lang_ResilientStorePlaceZero__closure__10(id, t))));
}

//#line 331 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
x10_boolean x10::lang::ResilientStorePlaceZero::quiescent(
  ::x10::lang::ResilientStorePlaceZero__State* fs) {
    
    //#line 338 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    x10_long nd = ((x10_long)x10rt_ndead());
    
    //#line 339 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    if ((!::x10aux::struct_equals(nd, ::x10::lang::ResilientStorePlaceZero::FMGL(me__get)()->FMGL(numDead))))
    {
        
        //#line 340 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        this->FMGL(numDead) = nd;
        
        //#line 341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        this->pushUp();
    }
    
    //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    x10_boolean recalc_needed = false;
    
    //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    x10_long i__101517max__104083 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
    {
        x10_long i__104084;
        for (i__104084 = ((x10_long)0ll); ((i__104084) <= (i__101517max__104083));
             i__104084 = ((i__104084) + (((x10_long)1ll))))
        {
            x10_long i__104085 = i__104084;
            
            //#line 347 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            if (x10rt_is_place_dead((x10_int)i__104085)) {
                
                //#line 348 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                x10_long i__101463max__104071 = ((x10_long)(::x10aux::nullCheck(::x10aux::nullCheck(fs)->FMGL(live))->x10::lang::Rail< x10_int >::__apply(
                                                              i__104085)));
                {
                    x10_long i__104072;
                    for (i__104072 = ((x10_long)1ll); ((i__104072) <= (i__101463max__104071));
                         i__104072 = ((i__104072) + (((x10_long)1ll))))
                    {
                        x10_long unused__104073 = i__104072;
                        
                        //#line 349 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        ::x10aux::nullCheck(fs)->addDeadPlaceException(
                          (__extension__ ({
                              ::x10::lang::Place alloc__104066 =
                                 ::x10::lang::Place::_alloc();
                              (alloc__104066)->::x10::lang::Place::_constructor(
                                i__104085);
                              alloc__104066;
                          }))
                          );
                    }
                }
                
                //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                ::x10aux::nullCheck(::x10aux::nullCheck(fs)->FMGL(live))->x10::lang::Rail< x10_int >::__set(
                  i__104085, ((x10_int)0));
                
                //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                ::x10aux::nullCheck(::x10aux::nullCheck(fs)->FMGL(liveAdopted))->x10::lang::Rail< x10_int >::__set(
                  i__104085, ((x10_int)0));
                
                //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                x10_long i__101499max__104074 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
                {
                    x10_long i__104075;
                    for (i__104075 = ((x10_long)0ll); ((i__104075) <= (i__101499max__104074));
                         i__104075 = ((i__104075) + (((x10_long)1ll))))
                    {
                        x10_long j__104076 = i__104075;
                        
                        //#line 357 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        ::x10aux::nullCheck(fs)->transitSet(
                          i__104085, j__104076, ((x10_int)0));
                        
                        //#line 358 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        ::x10aux::nullCheck(fs)->transitAdoptedSet(
                          i__104085, j__104076, ((x10_int)0));
                        
                        //#line 360 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        x10_long i__101481max__104068 = ((x10_long)(::x10aux::nullCheck(fs)->transitGet(
                                                                      j__104076,
                                                                      i__104085)));
                        {
                            x10_long i__104069;
                            for (i__104069 = ((x10_long)1ll);
                                 ((i__104069) <= (i__101481max__104068));
                                 i__104069 = ((i__104069) + (((x10_long)1ll))))
                            {
                                x10_long unused__104070 =
                                  i__104069;
                                
                                //#line 361 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                                ::x10aux::nullCheck(fs)->addDeadPlaceException(
                                  (__extension__ ({
                                      ::x10::lang::Place alloc__104067 =
                                         ::x10::lang::Place::_alloc();
                                      (alloc__104067)->::x10::lang::Place::_constructor(
                                        i__104085);
                                      alloc__104067;
                                  }))
                                  );
                            }
                        }
                        
                        //#line 363 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        ::x10aux::nullCheck(fs)->transitSet(
                          j__104076, i__104085, ((x10_int)0));
                        
                        //#line 364 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                        ::x10aux::nullCheck(fs)->transitAdoptedSet(
                          j__104076, i__104085, ((x10_int)0));
                    }
                }
                
                //#line 366 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                recalc_needed = true;
            }
            
        }
    }
    
    //#line 369 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    if (recalc_needed) {
        ::x10aux::nullCheck(fs)->recalculateTotal();
    }
    
    //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    if (((::x10aux::nullCheck(fs)->FMGL(totalCounter)) <= (((x10_long)0ll))))
    {
        return true;
        
    }
    
    //#line 375 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    if (::x10::lang::FinishState::FMGL(VERBOSE__get)()) {
        
        //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125632 = ::x10aux::makeStringLit("quiescent("); strLit__125632; })), ::x10aux::nullCheck(fs)->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__125633 = ::x10aux::makeStringLit(")"); strLit__125633; })))))->c_str());
        
        //#line 377 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        x10_long i__101535max__104077 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
        {
            x10_long i__104078;
            for (i__104078 = ((x10_long)0ll); ((i__104078) <= (i__101535max__104077));
                 i__104078 = ((i__104078) + (((x10_long)1ll))))
            {
                x10_long i__104079 = i__104078;
                
                //#line 378 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                if (((((x10_long)(::x10aux::nullCheck(::x10aux::nullCheck(fs)->FMGL(live))->x10::lang::Rail< x10_int >::__apply(
                                    i__104079)))) > (((x10_long)0ll))))
                {
                    
                    //#line 379 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
                    {
                        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125635 = ::x10aux::makeStringLit("    "); strLit__125635; })), ::x10aux::nullCheck(fs)->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__125636 = ::x10aux::makeStringLit(" Live at "); strLit__125636; }))), i__104079)))->c_str());
                    }
                    
                    //#line 380 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    return false;
                    
                }
                
            }
        }
        
        //#line 383 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        {
            ::x10::lang::Iterator< ::x10::util::Map__Entry< ::x10::util::Pair<x10_long, x10_long>, x10_int>*>* ent__101553;
            for (ent__101553 = ::x10::util::Set< ::x10::util::Map__Entry< ::x10::util::Pair<x10_long, x10_long>, x10_int>*>::iterator(::x10aux::nullCheck(::x10aux::nullCheck(::x10aux::nullCheck(fs)->FMGL(transit))->entries()));
                 ::x10::lang::Iterator< ::x10::util::Map__Entry< ::x10::util::Pair<x10_long, x10_long>, x10_int>*>::hasNext(::x10aux::nullCheck(ent__101553));
                 ) {
                ::x10::util::Map__Entry< ::x10::util::Pair<x10_long, x10_long>, x10_int>* ent =
                  ::x10::lang::Iterator< ::x10::util::Map__Entry< ::x10::util::Pair<x10_long, x10_long>, x10_int>*>::next(::x10aux::nullCheck(ent__101553));
                
                //#line 384 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                if (((((x10_long)(::x10::util::Map__Entry< ::x10::util::Pair<x10_long, x10_long>, x10_int>::getValue(::x10aux::nullCheck(ent))))) > (((x10_long)0ll))))
                {
                    
                    //#line 385 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    ::x10::util::Pair<x10_long, x10_long> pair =
                      ::x10::util::Map__Entry< ::x10::util::Pair<x10_long, x10_long>, x10_int>::getKey(::x10aux::nullCheck(ent));
                    
                    //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
                    {
                        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125637 = ::x10aux::makeStringLit("    "); strLit__125637; })), ::x10aux::nullCheck(fs)->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__125638 = ::x10aux::makeStringLit(" In transit from "); strLit__125638; }))), pair->FMGL(first)), (__extension__ ({ static ::x10::lang::String* strLit__125639 = ::x10aux::makeStringLit(" -> "); strLit__125639; }))), pair->FMGL(second))))->c_str());
                    }
                    
                    //#line 387 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    return false;
                    
                }
                
            }
        }
        
        //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        x10_long i__101555max__104080 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
        {
            x10_long i__104081;
            for (i__104081 = ((x10_long)0ll); ((i__104081) <= (i__101555max__104080));
                 i__104081 = ((i__104081) + (((x10_long)1ll))))
            {
                x10_long i__104082 = i__104081;
                
                //#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                if (((((x10_long)(::x10aux::nullCheck(::x10aux::nullCheck(fs)->FMGL(liveAdopted))->x10::lang::Rail< x10_int >::__apply(
                                    i__104082)))) > (((x10_long)0ll))))
                {
                    
                    //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
                    {
                        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125641 = ::x10aux::makeStringLit("    "); strLit__125641; })), ::x10aux::nullCheck(fs)->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__125642 = ::x10aux::makeStringLit(" Live (adopted) at "); strLit__125642; }))), i__104082)))->c_str());
                    }
                    
                    //#line 393 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    return false;
                    
                }
                
            }
        }
        
        //#line 396 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        {
            ::x10::lang::Iterator< ::x10::util::Map__Entry< ::x10::util::Pair<x10_long, x10_long>, x10_int>*>* ent__101573;
            for (ent__101573 = ::x10::util::Set< ::x10::util::Map__Entry< ::x10::util::Pair<x10_long, x10_long>, x10_int>*>::iterator(::x10aux::nullCheck(::x10aux::nullCheck(::x10aux::nullCheck(fs)->FMGL(transitAdopted))->entries()));
                 ::x10::lang::Iterator< ::x10::util::Map__Entry< ::x10::util::Pair<x10_long, x10_long>, x10_int>*>::hasNext(::x10aux::nullCheck(ent__101573));
                 ) {
                ::x10::util::Map__Entry< ::x10::util::Pair<x10_long, x10_long>, x10_int>* ent =
                  ::x10::lang::Iterator< ::x10::util::Map__Entry< ::x10::util::Pair<x10_long, x10_long>, x10_int>*>::next(::x10aux::nullCheck(ent__101573));
                
                //#line 397 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                if (((((x10_long)(::x10::util::Map__Entry< ::x10::util::Pair<x10_long, x10_long>, x10_int>::getValue(::x10aux::nullCheck(ent))))) > (((x10_long)0ll))))
                {
                    
                    //#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    ::x10::util::Pair<x10_long, x10_long> pair =
                      ::x10::util::Map__Entry< ::x10::util::Pair<x10_long, x10_long>, x10_int>::getKey(::x10aux::nullCheck(ent));
                    
                    //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
                    {
                        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125643 = ::x10aux::makeStringLit("    "); strLit__125643; })), ::x10aux::nullCheck(fs)->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__125644 = ::x10aux::makeStringLit(" In transit (adopted) from "); strLit__125644; }))), pair->FMGL(first)), (__extension__ ({ static ::x10::lang::String* strLit__125645 = ::x10aux::makeStringLit(" -> "); strLit__125645; }))), pair->FMGL(second))))->c_str());
                    }
                    
                    //#line 400 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    return false;
                    
                }
                
            }
        }
        
    }
    
    //#line 405 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    return false;
    
}

//#line 409 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
void x10::lang::ResilientStorePlaceZero::pushUp() {
    {
        
        //#line 410 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        ::x10::lang::CheckedThrowable* throwable__104126 =
          ::x10aux::class_cast_unchecked< ::x10::lang::CheckedThrowable*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        try {
            {
                ::x10::lang::Runtime::enterAtomic();
                {
                    
                    //#line 411 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
                    {
                        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__125646 = ::x10aux::makeStringLit("pushUp called"); strLit__125646; }))))->c_str());
                    }
                    
                    //#line 412 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    x10_long i__101575max__104095 = (((__extension__ ({
                        ::x10::util::GrowableRail< ::x10::lang::ResilientStorePlaceZero__State*>* this__104096 =
                          this->FMGL(states);
                        this__104096->FMGL(size);
                    }))
                    ) - (((x10_long)1ll)));
                    {
                        x10_long i__104097;
                        for (i__104097 = ((x10_long)0ll);
                             ((i__104097) <= (i__101575max__104095));
                             i__104097 = ((i__104097) + (((x10_long)1ll))))
                        {
                            x10_long i__104098 = i__104097;
                            
                            //#line 413 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            ::x10::lang::ResilientStorePlaceZero__State* fs__104086 =
                              (__extension__ ({
                                ::x10::util::GrowableRail< ::x10::lang::ResilientStorePlaceZero__State*>* this__104087 =
                                  this->FMGL(states);
                                
                                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                x10_long idx__104088 = i__104098;
                                ::x10::lang::ResilientStorePlaceZero__State* ret__104089;
                                
                                //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                ret__104089 = ::x10aux::nullCheck(this__104087->FMGL(data))->x10::lang::Rail< ::x10::lang::ResilientStorePlaceZero__State* >::__apply(
                                                idx__104088);
                                ret__104089;
                            }))
                            ;
                            
                            //#line 414 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            if (((::x10aux::struct_equals(fs__104086,
                                                          reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))) ||
                                ::x10aux::nullCheck(fs__104086)->FMGL(adopted)))
                            {
                                continue;
                            }
                            
                            //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            if (x10rt_is_place_dead((x10_int)::x10aux::nullCheck(fs__104086)->FMGL(homeId)))
                            {
                                
                                //#line 416 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                                ::x10::lang::ResilientStorePlaceZero__State* pfs__104090 =
                                  ::x10aux::nullCheck(fs__104086)->findFirstNonDeadParent();
                                
                                //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                                if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
                                {
                                    ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125648 = ::x10aux::makeStringLit("Finish has died ("); strLit__125648; })), ::x10aux::nullCheck(fs__104086)->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__125649 = ::x10aux::makeStringLit("), adopting activities into ("); strLit__125649; }))), ::x10aux::nullCheck(pfs__104090)->FMGL(id)), (__extension__ ({ static ::x10::lang::String* strLit__125650 = ::x10aux::makeStringLit(")"); strLit__125650; })))))->c_str());
                                }
                                
                                //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                                ::x10aux::nullCheck(pfs__104090)->adopt(
                                  fs__104086);
                            }
                            
                        }
                    }
                    
                    //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    x10_long i__101593max__104099 = (((__extension__ ({
                        ::x10::util::GrowableRail< ::x10::lang::ResilientStorePlaceZero__State*>* this__104100 =
                          this->FMGL(states);
                        this__104100->FMGL(size);
                    }))
                    ) - (((x10_long)1ll)));
                    {
                        x10_long i__104101;
                        for (i__104101 = ((x10_long)0ll);
                             ((i__104101) <= (i__101593max__104099));
                             i__104101 = ((i__104101) + (((x10_long)1ll))))
                        {
                            x10_long i__104102 = i__104101;
                            
                            //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            ::x10::lang::ResilientStorePlaceZero__State* fs__104091 =
                              (__extension__ ({
                                ::x10::util::GrowableRail< ::x10::lang::ResilientStorePlaceZero__State*>* this__104092 =
                                  this->FMGL(states);
                                
                                //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                x10_long idx__104093 = i__104102;
                                ::x10::lang::ResilientStorePlaceZero__State* ret__104094;
                                
                                //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
                                ret__104094 = ::x10aux::nullCheck(this__104092->FMGL(data))->x10::lang::Rail< ::x10::lang::ResilientStorePlaceZero__State* >::__apply(
                                                idx__104093);
                                ret__104094;
                            }))
                            ;
                            
                            //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            if (((::x10aux::struct_equals(fs__104091,
                                                          reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))) ||
                                ::x10aux::nullCheck(fs__104091)->FMGL(adopted)))
                            {
                                continue;
                            }
                            
                            //#line 425 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                            if (::x10::lang::ResilientStorePlaceZero::FMGL(me__get)()->quiescent(
                                  fs__104091)) {
                                ::x10aux::nullCheck(::x10aux::nullCheck(fs__104091)->FMGL(latch))->release();
                            }
                            
                        }
                    }
                    
                    //#line 427 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    if (::x10::lang::FinishState::FMGL(VERBOSE__get)())
                    {
                        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__125652 = ::x10aux::makeStringLit("pushUp returning"); strLit__125652; }))))->c_str());
                    }
                    
                }
            }
            ::x10::compiler::Finalization::plausibleThrow();
        }
        catch (::x10::lang::CheckedThrowable* __exc1537) {
            if (true) {
                ::x10::lang::CheckedThrowable* formal__104127 =
                  static_cast< ::x10::lang::CheckedThrowable*>(__exc1537);
                {
                    throwable__104126 = formal__104127;
                }
            } else
            throw;
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__104126)))
        {
            if (::x10aux::instanceof< ::x10::compiler::Abort*>(throwable__104126))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__104126));
            }
            
        }
        if (true) {
            ::x10::lang::Runtime::exitAtomic();
        }
        if ((!::x10aux::struct_equals(reinterpret_cast< ::x10::lang::CheckedThrowable*>(X10_NULL),
                                      throwable__104126)))
        {
            if (!(::x10aux::instanceof< ::x10::compiler::Finalization*>(throwable__104126)))
            {
                ::x10aux::throwException(::x10aux::nullCheck(throwable__104126));
            }
            
        }
        
    }
}

//#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
void x10::lang::ResilientStorePlaceZero::waitForFinish(x10_long id) {
    
    //#line 432 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    ::x10::lang::ResilientStorePlaceZero::lowLevelAt(reinterpret_cast< ::x10::lang::VoidFun_0_0*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_0>(sizeof(x10_lang_ResilientStorePlaceZero__closure__11)))x10_lang_ResilientStorePlaceZero__closure__11(id))));
}

//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
::x10::lang::ResilientStorePlaceZero* x10::lang::ResilientStorePlaceZero::x10__lang__ResilientStorePlaceZero____this__x10__lang__ResilientStorePlaceZero(
  ) {
    return this;
    
}
void x10::lang::ResilientStorePlaceZero::_constructor() {
    ::x10::lang::ResilientStorePlaceZero* this__104107 = this;
    ::x10aux::nullCheck(this__104107)->FMGL(states) = (__extension__ ({
        
        //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        ::x10::util::GrowableRail< ::x10::lang::ResilientStorePlaceZero__State*>* alloc__104106 =
           (new (::x10aux::alloc_z< ::x10::util::GrowableRail< ::x10::lang::ResilientStorePlaceZero__State*> >()) ::x10::util::GrowableRail< ::x10::lang::ResilientStorePlaceZero__State*>());
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        (alloc__104106)->::x10::util::GrowableRail< ::x10::lang::ResilientStorePlaceZero__State*>::_constructor(
          ((x10_long)0ll));
        alloc__104106;
    }))
    ;
    ::x10aux::nullCheck(this__104107)->FMGL(numDead) = ((x10_long)0ll);
}
::x10::lang::ResilientStorePlaceZero* x10::lang::ResilientStorePlaceZero::_make(
  ) {
    ::x10::lang::ResilientStorePlaceZero* this_ = new (::x10aux::alloc_z< ::x10::lang::ResilientStorePlaceZero>()) ::x10::lang::ResilientStorePlaceZero();
    this_->_constructor();
    return this_;
}


void x10::lang::ResilientStorePlaceZero::__fieldInitializers_x10_lang_ResilientStorePlaceZero(
  ) {
    this->FMGL(states) = (__extension__ ({
        
        //#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
        ::x10::util::GrowableRail< ::x10::lang::ResilientStorePlaceZero__State*>* alloc__101403 =
           (new (::x10aux::alloc_z< ::x10::util::GrowableRail< ::x10::lang::ResilientStorePlaceZero__State*> >()) ::x10::util::GrowableRail< ::x10::lang::ResilientStorePlaceZero__State*>());
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        (alloc__101403)->::x10::util::GrowableRail< ::x10::lang::ResilientStorePlaceZero__State*>::_constructor(
          ((x10_long)0ll));
        alloc__101403;
    }))
    ;
    this->FMGL(numDead) = ((x10_long)0ll);
}
const ::x10aux::serialization_id_t x10::lang::ResilientStorePlaceZero::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::ResilientStorePlaceZero::_deserializer);

void x10::lang::ResilientStorePlaceZero::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(states));
    buf.write(this->FMGL(numDead));
    
}

::x10::lang::Reference* ::x10::lang::ResilientStorePlaceZero::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::ResilientStorePlaceZero* this_ = new (::x10aux::alloc_z< ::x10::lang::ResilientStorePlaceZero>()) ::x10::lang::ResilientStorePlaceZero();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::ResilientStorePlaceZero::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(states) = buf.read< ::x10::util::GrowableRail< ::x10::lang::ResilientStorePlaceZero__State*>*>();
    FMGL(numDead) = buf.read<x10_long>();
}

::x10aux::RuntimeType x10::lang::ResilientStorePlaceZero::rtt;
void x10::lang::ResilientStorePlaceZero::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.lang.ResilientStorePlaceZero",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

::x10::lang::VoidFun_0_0::itable<x10_lang_ResilientStorePlaceZero__closure__2>x10_lang_ResilientStorePlaceZero__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_ResilientStorePlaceZero__closure__2::__apply, &x10_lang_ResilientStorePlaceZero__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_ResilientStorePlaceZero__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_ResilientStorePlaceZero__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_ResilientStorePlaceZero__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_ResilientStorePlaceZero__closure__2::_deserialize);
const ::x10aux::serialization_id_t x10_lang_ResilientStorePlaceZero__closure__2::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_ResilientStorePlaceZero__closure__2::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_ResilientStorePlaceZero__closure__3>x10_lang_ResilientStorePlaceZero__closure__3::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_ResilientStorePlaceZero__closure__3::__apply, &x10_lang_ResilientStorePlaceZero__closure__3::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_ResilientStorePlaceZero__closure__3::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_ResilientStorePlaceZero__closure__3::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_ResilientStorePlaceZero__closure__3::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_ResilientStorePlaceZero__closure__3::_deserialize);
const ::x10aux::serialization_id_t x10_lang_ResilientStorePlaceZero__closure__3::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_ResilientStorePlaceZero__closure__3::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_ResilientStorePlaceZero__closure__1>x10_lang_ResilientStorePlaceZero__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_ResilientStorePlaceZero__closure__1::__apply, &x10_lang_ResilientStorePlaceZero__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_ResilientStorePlaceZero__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_ResilientStorePlaceZero__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_ResilientStorePlaceZero__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_ResilientStorePlaceZero__closure__1::_deserialize);
const ::x10aux::serialization_id_t x10_lang_ResilientStorePlaceZero__closure__1::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_ResilientStorePlaceZero__closure__1::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_ResilientStorePlaceZero__closure__5>x10_lang_ResilientStorePlaceZero__closure__5::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_ResilientStorePlaceZero__closure__5::__apply, &x10_lang_ResilientStorePlaceZero__closure__5::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_ResilientStorePlaceZero__closure__5::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_ResilientStorePlaceZero__closure__5::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_ResilientStorePlaceZero__closure__5::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_ResilientStorePlaceZero__closure__5::_deserialize);
const ::x10aux::serialization_id_t x10_lang_ResilientStorePlaceZero__closure__5::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_ResilientStorePlaceZero__closure__5::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::VoidFun_0_0::itable<x10_lang_ResilientStorePlaceZero__closure__4>x10_lang_ResilientStorePlaceZero__closure__4::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_ResilientStorePlaceZero__closure__4::__apply, &x10_lang_ResilientStorePlaceZero__closure__4::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_ResilientStorePlaceZero__closure__4::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_ResilientStorePlaceZero__closure__4::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_ResilientStorePlaceZero__closure__4::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_ResilientStorePlaceZero__closure__4::_deserialize);
const ::x10aux::serialization_id_t x10_lang_ResilientStorePlaceZero__closure__4::_network_id = 
    ::x10aux::NetworkDispatcher::addNetworkDeserializer(x10_lang_ResilientStorePlaceZero__closure__4::_deserialize,::x10aux::CLOSURE_KIND_REMOTE_INVOCATION);

::x10::lang::Fun_0_0<x10_long>::itable<x10_lang_ResilientStorePlaceZero__closure__6>x10_lang_ResilientStorePlaceZero__closure__6::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_ResilientStorePlaceZero__closure__6::__apply, &x10_lang_ResilientStorePlaceZero__closure__6::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_ResilientStorePlaceZero__closure__6::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_long> >, &x10_lang_ResilientStorePlaceZero__closure__6::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_ResilientStorePlaceZero__closure__6::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_ResilientStorePlaceZero__closure__6::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_ResilientStorePlaceZero__closure__7>x10_lang_ResilientStorePlaceZero__closure__7::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_ResilientStorePlaceZero__closure__7::__apply, &x10_lang_ResilientStorePlaceZero__closure__7::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_ResilientStorePlaceZero__closure__7::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_ResilientStorePlaceZero__closure__7::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_ResilientStorePlaceZero__closure__7::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_ResilientStorePlaceZero__closure__7::_deserialize);

::x10::lang::Fun_0_0<x10_long>::itable<x10_lang_ResilientStorePlaceZero__closure__8>x10_lang_ResilientStorePlaceZero__closure__8::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_ResilientStorePlaceZero__closure__8::__apply, &x10_lang_ResilientStorePlaceZero__closure__8::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_ResilientStorePlaceZero__closure__8::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_0<x10_long> >, &x10_lang_ResilientStorePlaceZero__closure__8::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_ResilientStorePlaceZero__closure__8::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_ResilientStorePlaceZero__closure__8::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_ResilientStorePlaceZero__closure__9>x10_lang_ResilientStorePlaceZero__closure__9::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_ResilientStorePlaceZero__closure__9::__apply, &x10_lang_ResilientStorePlaceZero__closure__9::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_ResilientStorePlaceZero__closure__9::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_ResilientStorePlaceZero__closure__9::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_ResilientStorePlaceZero__closure__9::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_ResilientStorePlaceZero__closure__9::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_ResilientStorePlaceZero__closure__10>x10_lang_ResilientStorePlaceZero__closure__10::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_ResilientStorePlaceZero__closure__10::__apply, &x10_lang_ResilientStorePlaceZero__closure__10::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_ResilientStorePlaceZero__closure__10::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_ResilientStorePlaceZero__closure__10::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_ResilientStorePlaceZero__closure__10::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_ResilientStorePlaceZero__closure__10::_deserialize);

::x10::lang::VoidFun_0_0::itable<x10_lang_ResilientStorePlaceZero__closure__11>x10_lang_ResilientStorePlaceZero__closure__11::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_ResilientStorePlaceZero__closure__11::__apply, &x10_lang_ResilientStorePlaceZero__closure__11::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_ResilientStorePlaceZero__closure__11::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_0>, &x10_lang_ResilientStorePlaceZero__closure__11::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_ResilientStorePlaceZero__closure__11::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_ResilientStorePlaceZero__closure__11::_deserialize);

/* END of ResilientStorePlaceZero */
/*************************************************/
/*************************************************/
/* START of ResilientStorePlaceZero$State */
#include <x10/lang/ResilientStorePlaceZero__State.h>

#include <x10/lang/Long.h>
#include <x10/util/Pair.h>
#include <x10/lang/Int.h>
#include <x10/lang/Boolean.h>
#include <x10/util/HashMap.h>
#include <x10/lang/Rail.h>
#include <x10/util/GrowableRail.h>
#include <x10/lang/Exception.h>
#include <x10/util/concurrent/SimpleLatch.h>
#include <x10/lang/Place.h>
#include <x10/lang/Iterator.h>
#include <x10/util/Map__Entry.h>
#include <x10/lang/Iterable.h>
#include <x10/util/Set.h>
#include <x10/lang/FinishState.h>
#include <x10/lang/Runtime.h>
#include <x10/lang/Any.h>
#include <x10/lang/String.h>
#include <x10/util/Box.h>
#include <x10/lang/DeadPlaceException.h>
#include <x10/lang/CheckedThrowable.h>
#include <x10/compiler/Synthetic.h>

//#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"

//#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"

//#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"

//#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"

//#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"

//#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"

//#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"

//#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"

//#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"

//#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"

//#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"

//#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"

//#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
void x10::lang::ResilientStorePlaceZero__State::recalculateTotal() {
    
    //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    this->FMGL(totalCounter) = ((x10_long)0ll);
    
    //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    x10_long i__101405max__104019 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
    {
        x10_long i__104020;
        for (i__104020 = ((x10_long)0ll); ((i__104020) <= (i__101405max__104019));
             i__104020 = ((i__104020) + (((x10_long)1ll)))) {
            x10_long i__104021 = i__104020;
            
            //#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            this->FMGL(totalCounter) = ((this->FMGL(totalCounter)) + (((x10_long)(::x10aux::nullCheck(this->FMGL(live))->x10::lang::Rail< x10_int >::__apply(
                                                                                    i__104021)))));
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            this->FMGL(totalCounter) = ((this->FMGL(totalCounter)) + (((x10_long)(::x10aux::nullCheck(this->FMGL(liveAdopted))->x10::lang::Rail< x10_int >::__apply(
                                                                                    i__104021)))));
        }
    }
    
    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    {
        ::x10::lang::Iterator< ::x10::util::Map__Entry< ::x10::util::Pair<x10_long, x10_long>, x10_int>*>* ent__101423;
        for (ent__101423 = ::x10::util::Set< ::x10::util::Map__Entry< ::x10::util::Pair<x10_long, x10_long>, x10_int>*>::iterator(::x10aux::nullCheck(::x10aux::nullCheck(this->FMGL(transit))->entries()));
             ::x10::lang::Iterator< ::x10::util::Map__Entry< ::x10::util::Pair<x10_long, x10_long>, x10_int>*>::hasNext(::x10aux::nullCheck(ent__101423));
             ) {
            ::x10::util::Map__Entry< ::x10::util::Pair<x10_long, x10_long>, x10_int>* ent =
              ::x10::lang::Iterator< ::x10::util::Map__Entry< ::x10::util::Pair<x10_long, x10_long>, x10_int>*>::next(::x10aux::nullCheck(ent__101423));
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            this->FMGL(totalCounter) = ((this->FMGL(totalCounter)) + (((x10_long)(::x10::util::Map__Entry< ::x10::util::Pair<x10_long, x10_long>, x10_int>::getValue(::x10aux::nullCheck(ent))))));
        }
    }
    
    //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    {
        ::x10::lang::Iterator< ::x10::util::Map__Entry< ::x10::util::Pair<x10_long, x10_long>, x10_int>*>* ent__101425;
        for (ent__101425 = ::x10::util::Set< ::x10::util::Map__Entry< ::x10::util::Pair<x10_long, x10_long>, x10_int>*>::iterator(::x10aux::nullCheck(::x10aux::nullCheck(this->FMGL(transitAdopted))->entries()));
             ::x10::lang::Iterator< ::x10::util::Map__Entry< ::x10::util::Pair<x10_long, x10_long>, x10_int>*>::hasNext(::x10aux::nullCheck(ent__101425));
             ) {
            ::x10::util::Map__Entry< ::x10::util::Pair<x10_long, x10_long>, x10_int>* ent =
              ::x10::lang::Iterator< ::x10::util::Map__Entry< ::x10::util::Pair<x10_long, x10_long>, x10_int>*>::next(::x10aux::nullCheck(ent__101425));
            
            //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            this->FMGL(totalCounter) = ((this->FMGL(totalCounter)) + (((x10_long)(::x10::util::Map__Entry< ::x10::util::Pair<x10_long, x10_long>, x10_int>::getValue(::x10aux::nullCheck(ent))))));
        }
    }
    
}

//#line 125 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
::x10::util::GrowableRail< ::x10::lang::Exception*>* x10::lang::ResilientStorePlaceZero__State::ensureMultipleExceptions(
  ) {
    
    //#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    if ((::x10aux::struct_equals(this->FMGL(multipleExceptions),
                                 reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        this->FMGL(multipleExceptions) = (__extension__ ({
            ::x10::util::GrowableRail< ::x10::lang::Exception*>* alloc__101396 =
               (new (::x10aux::alloc_z< ::x10::util::GrowableRail< ::x10::lang::Exception*> >()) ::x10::util::GrowableRail< ::x10::lang::Exception*>());
            
            //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            (alloc__101396)->::x10::util::GrowableRail< ::x10::lang::Exception*>::_constructor(
              ((x10_long)0ll));
            alloc__101396;
        }))
        ;
    }
    
    //#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    return this->FMGL(multipleExceptions);
    
}

//#line 130 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
void x10::lang::ResilientStorePlaceZero__State::_constructor(
  ::x10::lang::ResilientStorePlaceZero__State* pfs, x10_long homeId,
  x10_long id, ::x10::util::concurrent::SimpleLatch* latch) {
    
    //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    ::x10::lang::ResilientStorePlaceZero__State* this__104022 =
      this;
    ::x10aux::nullCheck(this__104022)->FMGL(adopted) = false;
    ::x10aux::nullCheck(this__104022)->FMGL(adoptedParent) =
      ((x10_long)0ll);
    ::x10aux::nullCheck(this__104022)->FMGL(multipleExceptions) =
      (::x10aux::class_cast_unchecked< ::x10::util::GrowableRail< ::x10::lang::Exception*>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    ::x10aux::nullCheck(this__104022)->FMGL(totalCounter) =
      ((x10_long)0ll);
    
    //#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    this->FMGL(id) = id;
    
    //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    this->FMGL(parent) = pfs;
    
    //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    this->FMGL(transit) = (__extension__ ({
        ::x10::util::HashMap< ::x10::util::Pair<x10_long, x10_long>, x10_int>* alloc__101397 =
           (new (::x10aux::alloc_z< ::x10::util::HashMap< ::x10::util::Pair<x10_long, x10_long>, x10_int> >()) ::x10::util::HashMap< ::x10::util::Pair<x10_long, x10_long>, x10_int>());
        (alloc__101397)->::x10::util::HashMap< ::x10::util::Pair<x10_long, x10_long>, x10_int>::_constructor();
        alloc__101397;
    }))
    ;
    
    //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    this->FMGL(live) = ::x10::lang::Rail< x10_int >::_make(((x10_long)::x10aux::num_hosts),
                                                           ((x10_int)0));
    
    //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    this->FMGL(transitAdopted) = (__extension__ ({
        ::x10::util::HashMap< ::x10::util::Pair<x10_long, x10_long>, x10_int>* alloc__101398 =
           (new (::x10aux::alloc_z< ::x10::util::HashMap< ::x10::util::Pair<x10_long, x10_long>, x10_int> >()) ::x10::util::HashMap< ::x10::util::Pair<x10_long, x10_long>, x10_int>());
        (alloc__101398)->::x10::util::HashMap< ::x10::util::Pair<x10_long, x10_long>, x10_int>::_constructor();
        alloc__101398;
    }))
    ;
    
    //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    this->FMGL(liveAdopted) = ::x10::lang::Rail< x10_int >::_make(((x10_long)::x10aux::num_hosts),
                                                                  ((x10_int)0));
    
    //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    ::x10aux::nullCheck(this->FMGL(live))->x10::lang::Rail< x10_int >::__set(
      homeId, ((x10_int)1));
    
    //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    if (::x10::lang::FinishState::FMGL(VERBOSE__get)()) {
        ::x10::lang::RuntimeNatives::println(::x10aux::to_string(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125664 = ::x10aux::makeStringLit("    initial live("); strLit__125664; })), homeId), (__extension__ ({ static ::x10::lang::String* strLit__125665 = ::x10aux::makeStringLit(") == 1"); strLit__125665; })))))->c_str());
    }
    
    //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    this->FMGL(totalCounter) = ((x10_long)1ll);
    
    //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    this->FMGL(homeId) = homeId;
    
    //#line 143 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    this->FMGL(adopted) = false;
    
    //#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    this->FMGL(latch) = latch;
}
::x10::lang::ResilientStorePlaceZero__State* x10::lang::ResilientStorePlaceZero__State::_make(
  ::x10::lang::ResilientStorePlaceZero__State* pfs, x10_long homeId,
  x10_long id, ::x10::util::concurrent::SimpleLatch* latch)
{
    ::x10::lang::ResilientStorePlaceZero__State* this_ = new (::x10aux::alloc_z< ::x10::lang::ResilientStorePlaceZero__State>()) ::x10::lang::ResilientStorePlaceZero__State();
    this_->_constructor(pfs, homeId, id, latch);
    return this_;
}



//#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
void x10::lang::ResilientStorePlaceZero__State::transitInc(
  x10_long src, x10_long dst, x10_int v) {
    
    //#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    if ((::x10aux::struct_equals(v, ((x10_int)0)))) {
        return;
    }
    
    //#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    ::x10::util::Pair<x10_long, x10_long> p =  ::x10::util::Pair<x10_long, x10_long>::_alloc();
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    x10_long first__104023 = src;
    x10_long second__104024 = dst;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    p->FMGL(first) = first__104023;
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    p->FMGL(second) = second__104024;
    
    //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    x10_int old = ::x10aux::nullCheck(this->FMGL(transit))->getOrElse(
                    p, ((x10_int)0));
    
    //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    ::x10aux::nullCheck(this->FMGL(transit))->put(p, ((old) + (v)));
}

//#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
void x10::lang::ResilientStorePlaceZero__State::transitDec(
  x10_long src, x10_long dst) {
    
    //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    ::x10::util::Pair<x10_long, x10_long> p =  ::x10::util::Pair<x10_long, x10_long>::_alloc();
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    x10_long first__104025 = src;
    x10_long second__104026 = dst;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    p->FMGL(first) = first__104025;
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    p->FMGL(second) = second__104026;
    
    //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    x10_int old = ::x10aux::nullCheck(this->FMGL(transit))->getOrElse(
                    p, ((x10_int)0));
    
    //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    ::x10aux::nullCheck(this->FMGL(transit))->put(p, ((old) - (((x10_int)1))));
}

//#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
x10_int x10::lang::ResilientStorePlaceZero__State::transitGet(
  x10_long src, x10_long dst) {
    
    //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    ::x10::util::Pair<x10_long, x10_long> p =  ::x10::util::Pair<x10_long, x10_long>::_alloc();
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    x10_long first__104027 = src;
    x10_long second__104028 = dst;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    p->FMGL(first) = first__104027;
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    p->FMGL(second) = second__104028;
    
    //#line 164 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    return ::x10aux::nullCheck(this->FMGL(transit))->getOrElse(
             p, ((x10_int)0));
    
}

//#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
void x10::lang::ResilientStorePlaceZero__State::transitSet(
  x10_long src, x10_long dst, x10_int v) {
    
    //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    ::x10::util::Pair<x10_long, x10_long> p =  ::x10::util::Pair<x10_long, x10_long>::_alloc();
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    x10_long first__104029 = src;
    x10_long second__104030 = dst;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    p->FMGL(first) = first__104029;
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    p->FMGL(second) = second__104030;
    
    //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    ::x10aux::nullCheck(this->FMGL(transit))->put(p, v);
}

//#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
void x10::lang::ResilientStorePlaceZero__State::transitAdoptedInc(
  x10_long src, x10_long dst, x10_int v) {
    
    //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    if ((::x10aux::struct_equals(v, ((x10_int)0)))) {
        return;
    }
    
    //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    ::x10::util::Pair<x10_long, x10_long> p =  ::x10::util::Pair<x10_long, x10_long>::_alloc();
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    x10_long first__104031 = src;
    x10_long second__104032 = dst;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    p->FMGL(first) = first__104031;
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    p->FMGL(second) = second__104032;
    
    //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    x10_int old = ::x10aux::nullCheck(this->FMGL(transitAdopted))->getOrElse(
                    p, ((x10_int)0));
    
    //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    ::x10aux::nullCheck(this->FMGL(transitAdopted))->put(
      p, ((old) + (v)));
}

//#line 180 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
void x10::lang::ResilientStorePlaceZero__State::transitAdoptedDec(
  x10_long src, x10_long dst) {
    
    //#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    ::x10::util::Pair<x10_long, x10_long> p =  ::x10::util::Pair<x10_long, x10_long>::_alloc();
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    x10_long first__104033 = src;
    x10_long second__104034 = dst;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    p->FMGL(first) = first__104033;
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    p->FMGL(second) = second__104034;
    
    //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    x10_int old = ::x10aux::nullCheck(this->FMGL(transitAdopted))->getOrElse(
                    p, ((x10_int)0));
    
    //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    ::x10aux::nullCheck(this->FMGL(transitAdopted))->put(
      p, ((old) - (((x10_int)1))));
}

//#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
x10_int x10::lang::ResilientStorePlaceZero__State::transitAdoptedGet(
  x10_long src, x10_long dst) {
    
    //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    ::x10::util::Pair<x10_long, x10_long> p =  ::x10::util::Pair<x10_long, x10_long>::_alloc();
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    x10_long first__104035 = src;
    x10_long second__104036 = dst;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    p->FMGL(first) = first__104035;
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    p->FMGL(second) = second__104036;
    
    //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    return ::x10aux::nullCheck(this->FMGL(transitAdopted))->getOrElse(
             p, ((x10_int)0));
    
}

//#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
void x10::lang::ResilientStorePlaceZero__State::transitAdoptedSet(
  x10_long src, x10_long dst, x10_int v) {
    
    //#line 190 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    ::x10::util::Pair<x10_long, x10_long> p =  ::x10::util::Pair<x10_long, x10_long>::_alloc();
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    x10_long first__104037 = src;
    x10_long second__104038 = dst;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    p->FMGL(first) = first__104037;
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Pair.x10"
    p->FMGL(second) = second__104038;
    
    //#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    ::x10aux::nullCheck(this->FMGL(transitAdopted))->put(
      p, v);
}

//#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
void x10::lang::ResilientStorePlaceZero__State::transitInc(
  x10_long src, x10_long dst) {
    this->transitInc(src, dst, ((x10_int)1));
}

//#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
void x10::lang::ResilientStorePlaceZero__State::transitAdoptedInc(
  x10_long src, x10_long dst) {
    this->transitAdoptedInc(src, dst, ((x10_int)1));
}

//#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
::x10::lang::ResilientStorePlaceZero__State* x10::lang::ResilientStorePlaceZero__State::findFirstNonDeadParent(
  ) {
    
    //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    if (!(x10rt_is_place_dead((x10_int)::x10aux::nullCheck(this->FMGL(parent))->FMGL(homeId))))
    {
        return this->FMGL(parent);
        
    }
    
    //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    return ::x10aux::nullCheck(this->FMGL(parent))->findFirstNonDeadParent();
    
}

//#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
void x10::lang::ResilientStorePlaceZero__State::adopt(::x10::lang::ResilientStorePlaceZero__State* child) {
    
    //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    x10_long i__101445max__104048 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
    {
        x10_long i__104049;
        for (i__104049 = ((x10_long)0ll); ((i__104049) <= (i__101445max__104048));
             i__104049 = ((i__104049) + (((x10_long)1ll))))
        {
            x10_long i__104050 = i__104049;
            
            //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            ::x10::lang::Rail< x10_int >* a__104039 = this->FMGL(liveAdopted);
            x10_long i__104040 = i__104050;
            x10_int r__104041 = ((::x10aux::nullCheck(a__104039)->x10::lang::Rail< x10_int >::__apply(
                                    i__104040)) + (::x10aux::nullCheck(::x10aux::nullCheck(child)->FMGL(live))->x10::lang::Rail< x10_int >::__apply(
                                                     i__104050)));
            ::x10aux::nullCheck(a__104039)->x10::lang::Rail< x10_int >::__set(
              i__104040, r__104041);
            
            //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            ::x10::lang::Rail< x10_int >* a__104042 = this->FMGL(liveAdopted);
            x10_long i__104043 = i__104050;
            x10_int r__104044 = ((::x10aux::nullCheck(a__104042)->x10::lang::Rail< x10_int >::__apply(
                                    i__104043)) + (::x10aux::nullCheck(::x10aux::nullCheck(child)->FMGL(liveAdopted))->x10::lang::Rail< x10_int >::__apply(
                                                     i__104050)));
            ::x10aux::nullCheck(a__104042)->x10::lang::Rail< x10_int >::__set(
              i__104043, r__104044);
            
            //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
            x10_long i__101427max__104045 = ((((x10_long)::x10aux::num_hosts)) - (((x10_long)1ll)));
            {
                x10_long i__104046;
                for (i__104046 = ((x10_long)0ll); ((i__104046) <= (i__101427max__104045));
                     i__104046 = ((i__104046) + (((x10_long)1ll))))
                {
                    x10_long j__104047 = i__104046;
                    
                    //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    this->transitAdoptedInc(j__104047, i__104050,
                                            ::x10aux::nullCheck(child)->transitGet(
                                              j__104047, i__104050));
                    
                    //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
                    this->transitAdoptedInc(j__104047, i__104050,
                                            ::x10aux::nullCheck(child)->transitAdoptedGet(
                                              j__104047, i__104050));
                }
            }
            
        }
    }
    
    //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    this->recalculateTotal();
    
    //#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    ::x10aux::nullCheck(child)->FMGL(adopted) = true;
    
    //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    ::x10aux::nullCheck(child)->FMGL(adoptedParent) = this->FMGL(id);
    
    //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    ::x10aux::nullCheck(::x10aux::nullCheck(child)->FMGL(latch))->release();
}

//#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
void x10::lang::ResilientStorePlaceZero__State::addDeadPlaceException(
  ::x10::lang::Place p) {
    
    //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    ::x10::lang::DeadPlaceException* e = ::x10::lang::DeadPlaceException::_make(p);
    
    //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    e->fillInStackTrace();
    
    //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
    ::x10aux::nullCheck(this->ensureMultipleExceptions())->x10::util::GrowableRail< ::x10::lang::Exception*>::add(
      reinterpret_cast< ::x10::lang::Exception*>(e));
}

//#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/ResilientStorePlaceZero.x10"
::x10::lang::ResilientStorePlaceZero__State* x10::lang::ResilientStorePlaceZero__State::x10__lang__ResilientStorePlaceZero__State____this__x10__lang__ResilientStorePlaceZero__State(
  ) {
    return this;
    
}
void x10::lang::ResilientStorePlaceZero__State::__fieldInitializers_x10_lang_ResilientStorePlaceZero_State(
  ) {
    this->FMGL(adopted) = false;
    this->FMGL(adoptedParent) = ((x10_long)0ll);
    this->FMGL(multipleExceptions) = (::x10aux::class_cast_unchecked< ::x10::util::GrowableRail< ::x10::lang::Exception*>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(totalCounter) = ((x10_long)0ll);
}
const ::x10aux::serialization_id_t x10::lang::ResilientStorePlaceZero__State::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::ResilientStorePlaceZero__State::_deserializer);

void x10::lang::ResilientStorePlaceZero__State::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(id));
    buf.write(this->FMGL(parent));
    buf.write(this->FMGL(transit));
    buf.write(this->FMGL(live));
    buf.write(this->FMGL(transitAdopted));
    buf.write(this->FMGL(liveAdopted));
    buf.write(this->FMGL(homeId));
    buf.write(this->FMGL(adopted));
    buf.write(this->FMGL(adoptedParent));
    buf.write(this->FMGL(multipleExceptions));
    buf.write(this->FMGL(latch));
    buf.write(this->FMGL(totalCounter));
    
}

::x10::lang::Reference* ::x10::lang::ResilientStorePlaceZero__State::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::ResilientStorePlaceZero__State* this_ = new (::x10aux::alloc_z< ::x10::lang::ResilientStorePlaceZero__State>()) ::x10::lang::ResilientStorePlaceZero__State();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::ResilientStorePlaceZero__State::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(id) = buf.read<x10_long>();
    FMGL(parent) = buf.read< ::x10::lang::ResilientStorePlaceZero__State*>();
    FMGL(transit) = buf.read< ::x10::util::HashMap< ::x10::util::Pair<x10_long, x10_long>, x10_int>*>();
    FMGL(live) = buf.read< ::x10::lang::Rail< x10_int >*>();
    FMGL(transitAdopted) = buf.read< ::x10::util::HashMap< ::x10::util::Pair<x10_long, x10_long>, x10_int>*>();
    FMGL(liveAdopted) = buf.read< ::x10::lang::Rail< x10_int >*>();
    FMGL(homeId) = buf.read<x10_long>();
    FMGL(adopted) = buf.read<x10_boolean>();
    FMGL(adoptedParent) = buf.read<x10_long>();
    FMGL(multipleExceptions) = buf.read< ::x10::util::GrowableRail< ::x10::lang::Exception*>*>();
    FMGL(latch) = buf.read< ::x10::util::concurrent::SimpleLatch*>();
    FMGL(totalCounter) = buf.read<x10_long>();
}

::x10aux::RuntimeType x10::lang::ResilientStorePlaceZero__State::rtt;
void x10::lang::ResilientStorePlaceZero__State::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.lang.ResilientStorePlaceZero.State",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of ResilientStorePlaceZero$State */
/*************************************************/
