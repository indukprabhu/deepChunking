/*************************************************/
/* START of OptionsParser */
#include <x10/util/OptionsParser.h>

#ifndef X10_UTIL_OPTIONSPARSER__CLOSURE__1_CLOSURE
#define X10_UTIL_OPTIONSPARSER__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_3.h>
class x10_util_OptionsParser__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*>::itable<x10_util_OptionsParser__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::String* __apply(::x10::lang::String* key, ::x10::lang::String* orElse, ::x10::lang::Rail< ::x10::lang::String* >* values) {
        
        //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return ::x10aux::nullCheck(values)->x10::lang::Rail< ::x10::lang::String* >::__apply(
                 ((x10_long)0ll));
        
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_OptionsParser__closure__1* storage = ::x10aux::alloc_z<x10_util_OptionsParser__closure__1>();
        buf.record_reference(storage);
        x10_util_OptionsParser__closure__1* this_ = new (storage) x10_util_OptionsParser__closure__1();
        return this_;
    }
    
    x10_util_OptionsParser__closure__1() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10:220";
    }

};

#endif // X10_UTIL_OPTIONSPARSER__CLOSURE__1_CLOSURE
#ifndef X10_UTIL_OPTIONSPARSER__CLOSURE__2_CLOSURE
#define X10_UTIL_OPTIONSPARSER__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_3.h>
class x10_util_OptionsParser__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*>::itable<x10_util_OptionsParser__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::String* __apply(::x10::lang::String* key, ::x10::lang::String* orElse, ::x10::lang::Rail< ::x10::lang::String* >* values) {
        
        //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return ::x10aux::nullCheck(values)->x10::lang::Rail< ::x10::lang::String* >::__apply(
                 (((x10_long)(::x10aux::nullCheck(values)->FMGL(size))) - (((x10_long)1ll))));
        
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_OptionsParser__closure__2* storage = ::x10aux::alloc_z<x10_util_OptionsParser__closure__2>();
        buf.record_reference(storage);
        x10_util_OptionsParser__closure__2* this_ = new (storage) x10_util_OptionsParser__closure__2();
        return this_;
    }
    
    x10_util_OptionsParser__closure__2() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10:227-228";
    }

};

#endif // X10_UTIL_OPTIONSPARSER__CLOSURE__2_CLOSURE
#ifndef X10_UTIL_OPTIONSPARSER__CLOSURE__3_CLOSURE
#define X10_UTIL_OPTIONSPARSER__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_2.h>
class x10_util_OptionsParser__closure__3 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_2< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>*, x10_int>::itable<x10_util_OptionsParser__closure__3> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_int __apply(::x10::lang::String* key, ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>* keyMap) {
        
        //#line 255 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return ((x10_int)1);
        
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_OptionsParser__closure__3* storage = ::x10aux::alloc_z<x10_util_OptionsParser__closure__3>();
        buf.record_reference(storage);
        x10_util_OptionsParser__closure__3* this_ = new (storage) x10_util_OptionsParser__closure__3();
        return this_;
    }
    
    x10_util_OptionsParser__closure__3() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_2< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>*, x10_int> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_2< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>*, x10_int> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10:255";
    }

};

#endif // X10_UTIL_OPTIONSPARSER__CLOSURE__3_CLOSURE
#ifndef X10_UTIL_OPTIONSPARSER__CLOSURE__4_CLOSURE
#define X10_UTIL_OPTIONSPARSER__CLOSURE__4_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_util_OptionsParser__closure__4 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_int>::itable<x10_util_OptionsParser__closure__4> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_int __apply(x10_long n) {
        
        //#line 408 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return ((n) <= (((x10_long)(thisK)))) ? (::x10aux::nullCheck(keyIndex)->x10::lang::Rail< x10_int >::__apply(
                                                   n)) : (newTail);
        
    }
    
    // captured environment
    x10_int thisK;
    ::x10::lang::Rail< x10_int >* keyIndex;
    x10_int newTail;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->thisK);
        buf.write(this->keyIndex);
        buf.write(this->newTail);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_OptionsParser__closure__4* storage = ::x10aux::alloc_z<x10_util_OptionsParser__closure__4>();
        buf.record_reference(storage);
        x10_int that_thisK = buf.read<x10_int>();
        ::x10::lang::Rail< x10_int >* that_keyIndex = buf.read< ::x10::lang::Rail< x10_int >*>();
        x10_int that_newTail = buf.read<x10_int>();
        x10_util_OptionsParser__closure__4* this_ = new (storage) x10_util_OptionsParser__closure__4(that_thisK, that_keyIndex, that_newTail);
        return this_;
    }
    
    x10_util_OptionsParser__closure__4(x10_int thisK, ::x10::lang::Rail< x10_int >* keyIndex, x10_int newTail) : thisK(thisK), keyIndex(keyIndex), newTail(newTail) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_int> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_int> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10:408";
    }

};

#endif // X10_UTIL_OPTIONSPARSER__CLOSURE__4_CLOSURE
#ifndef X10_UTIL_OPTIONSPARSER__CLOSURE__5_CLOSURE
#define X10_UTIL_OPTIONSPARSER__CLOSURE__5_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_util_OptionsParser__closure__5 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*>::itable<x10_util_OptionsParser__closure__5> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::String* __apply(x10_long n) {
        
        //#line 432 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return ::x10aux::nullCheck(thisArgs)->x10::lang::Rail< ::x10::lang::String* >::__apply(
                 ((((x10_long)(first))) + (n)));
        
    }
    
    // captured environment
    ::x10::lang::Rail< ::x10::lang::String* >* thisArgs;
    x10_int first;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->thisArgs);
        buf.write(this->first);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_OptionsParser__closure__5* storage = ::x10aux::alloc_z<x10_util_OptionsParser__closure__5>();
        buf.record_reference(storage);
        ::x10::lang::Rail< ::x10::lang::String* >* that_thisArgs = buf.read< ::x10::lang::Rail< ::x10::lang::String* >*>();
        x10_int that_first = buf.read<x10_int>();
        x10_util_OptionsParser__closure__5* this_ = new (storage) x10_util_OptionsParser__closure__5(that_thisArgs, that_first);
        return this_;
    }
    
    x10_util_OptionsParser__closure__5(::x10::lang::Rail< ::x10::lang::String* >* thisArgs, x10_int first) : thisArgs(thisArgs), first(first) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10:432";
    }

};

#endif // X10_UTIL_OPTIONSPARSER__CLOSURE__5_CLOSURE
#ifndef X10_UTIL_OPTIONSPARSER__CLOSURE__6_CLOSURE
#define X10_UTIL_OPTIONSPARSER__CLOSURE__6_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_util_OptionsParser__closure__6 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*>::itable<x10_util_OptionsParser__closure__6> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::String* __apply(x10_long k__121780) {
        return ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129771 = ::x10aux::makeStringLit("-"); strLit__129771; })), (argN__121776)->charAt(((((x10_int) (k__121780))) + (((x10_int)1)))));
        
    }
    
    // captured environment
    ::x10::lang::String* argN__121776;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->argN__121776);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_OptionsParser__closure__6* storage = ::x10aux::alloc_z<x10_util_OptionsParser__closure__6>();
        buf.record_reference(storage);
        ::x10::lang::String* that_argN__121776 = buf.read< ::x10::lang::String*>();
        x10_util_OptionsParser__closure__6* this_ = new (storage) x10_util_OptionsParser__closure__6(that_argN__121776);
        return this_;
    }
    
    x10_util_OptionsParser__closure__6(::x10::lang::String* argN__121776) : argN__121776(argN__121776) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10:535";
    }

};

#endif // X10_UTIL_OPTIONSPARSER__CLOSURE__6_CLOSURE
#ifndef X10_UTIL_OPTIONSPARSER__CLOSURE__7_CLOSURE
#define X10_UTIL_OPTIONSPARSER__CLOSURE__7_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_util_OptionsParser__closure__7 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*>::itable<x10_util_OptionsParser__closure__7> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::String* __apply(x10_long n) {
        
        //#line 572 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return ::x10aux::nullCheck(saved_this->FMGL(args))->x10::lang::Rail< ::x10::lang::String* >::__apply(
                 ((n) + (((x10_long)(first)))));
        
    }
    
    // captured environment
    ::x10::util::OptionsParser* saved_this;
    x10_int first;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->first);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_OptionsParser__closure__7* storage = ::x10aux::alloc_z<x10_util_OptionsParser__closure__7>();
        buf.record_reference(storage);
        ::x10::util::OptionsParser* that_saved_this = buf.read< ::x10::util::OptionsParser*>();
        x10_int that_first = buf.read<x10_int>();
        x10_util_OptionsParser__closure__7* this_ = new (storage) x10_util_OptionsParser__closure__7(that_saved_this, that_first);
        return this_;
    }
    
    x10_util_OptionsParser__closure__7(::x10::util::OptionsParser* saved_this, x10_int first) : saved_this(saved_this), first(first) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10:572";
    }

};

#endif // X10_UTIL_OPTIONSPARSER__CLOSURE__7_CLOSURE
#ifndef X10_UTIL_OPTIONSPARSER__CLOSURE__8_CLOSURE
#define X10_UTIL_OPTIONSPARSER__CLOSURE__8_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_3.h>
class x10_util_OptionsParser__closure__8 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_3< ::x10::lang::String*, x10_int, x10_int, ::x10::lang::Rail< ::x10::lang::String* >*>::itable<x10_util_OptionsParser__closure__8> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::Rail< ::x10::lang::String* >* __apply(::x10::lang::String* key, x10_int expected, x10_int got) {
        
        //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if (((((x10_long)(::x10aux::nullCheck(key)->x10::lang::String::length()))) > (((x10_long)0ll))))
        {
            
            //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            ::x10aux::throwException(::x10aux::nullCheck(::x10::util::OptionsParser__Err::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129865 = ::x10aux::makeStringLit("Missing arguments for "); strLit__129865; })), key), (__extension__ ({ static ::x10::lang::String* strLit__129866 = ::x10aux::makeStringLit(": "); strLit__129866; }))), expected), (__extension__ ({ static ::x10::lang::String* strLit__129867 = ::x10aux::makeStringLit(" expected, got "); strLit__129867; }))), got))));
        }
        
        //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return ::x10::lang::Rail< ::x10::lang::String* >::_make(((x10_long)0ll));
        
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_OptionsParser__closure__8* storage = ::x10aux::alloc_z<x10_util_OptionsParser__closure__8>();
        buf.record_reference(storage);
        x10_util_OptionsParser__closure__8* this_ = new (storage) x10_util_OptionsParser__closure__8();
        return this_;
    }
    
    x10_util_OptionsParser__closure__8() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_3< ::x10::lang::String*, x10_int, x10_int, ::x10::lang::Rail< ::x10::lang::String* >*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_3< ::x10::lang::String*, x10_int, x10_int, ::x10::lang::Rail< ::x10::lang::String* >*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10:173-178";
    }

};

#endif // X10_UTIL_OPTIONSPARSER__CLOSURE__8_CLOSURE
#ifndef X10_UTIL_OPTIONSPARSER__CLOSURE__9_CLOSURE
#define X10_UTIL_OPTIONSPARSER__CLOSURE__9_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_3.h>
class x10_util_OptionsParser__closure__9 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_3< ::x10::lang::String*, x10_int, x10_int, x10_int>::itable<x10_util_OptionsParser__closure__9> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_int __apply(::x10::lang::String* key, x10_int expected, x10_int got) {
        
        //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return expected;
        
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_OptionsParser__closure__9* storage = ::x10aux::alloc_z<x10_util_OptionsParser__closure__9>();
        buf.record_reference(storage);
        x10_util_OptionsParser__closure__9* this_ = new (storage) x10_util_OptionsParser__closure__9();
        return this_;
    }
    
    x10_util_OptionsParser__closure__9() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_3< ::x10::lang::String*, x10_int, x10_int, x10_int> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_3< ::x10::lang::String*, x10_int, x10_int, x10_int> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10:189";
    }

};

#endif // X10_UTIL_OPTIONSPARSER__CLOSURE__9_CLOSURE
#ifndef X10_UTIL_OPTIONSPARSER__CLOSURE__11_CLOSURE
#define X10_UTIL_OPTIONSPARSER__CLOSURE__11_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_util_OptionsParser__closure__11 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*>::itable<x10_util_OptionsParser__closure__11> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::String* __apply(x10_long n) {
        
        //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return ::x10aux::nullCheck(args)->x10::lang::Rail< ::x10::lang::String* >::__apply(
                 ((x10_long)(((first) + (((x10_int) (n)))))));
        
    }
    
    // captured environment
    ::x10::lang::Rail< ::x10::lang::String* >* args;
    x10_int first;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->args);
        buf.write(this->first);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_OptionsParser__closure__11* storage = ::x10aux::alloc_z<x10_util_OptionsParser__closure__11>();
        buf.record_reference(storage);
        ::x10::lang::Rail< ::x10::lang::String* >* that_args = buf.read< ::x10::lang::Rail< ::x10::lang::String* >*>();
        x10_int that_first = buf.read<x10_int>();
        x10_util_OptionsParser__closure__11* this_ = new (storage) x10_util_OptionsParser__closure__11(that_args, that_first);
        return this_;
    }
    
    x10_util_OptionsParser__closure__11(::x10::lang::Rail< ::x10::lang::String* >* args, x10_int first) : args(args), first(first) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10:198";
    }

};

#endif // X10_UTIL_OPTIONSPARSER__CLOSURE__11_CLOSURE
#ifndef X10_UTIL_OPTIONSPARSER__CLOSURE__10_CLOSURE
#define X10_UTIL_OPTIONSPARSER__CLOSURE__10_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/VoidFun_0_5.h>
class x10_util_OptionsParser__closure__10 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::VoidFun_0_5< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*>*, ::x10::lang::Rail< ::x10::lang::String* >*, x10_int, x10_int>::itable<x10_util_OptionsParser__closure__10> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    void __apply(::x10::lang::String* key, ::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*>* props, ::x10::lang::Rail< ::x10::lang::String* >* args, x10_int first, x10_int values) {
        
        //#line 199 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        ::x10::lang::Rail< ::x10::lang::String* >* valueArray = ::x10::lang::Rail< ::x10::lang::String* >::_make(((x10_long)(values)),
                                                                                                                 reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*> >(sizeof(x10_util_OptionsParser__closure__11)))x10_util_OptionsParser__closure__11(args, first))));
        
        //#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        ::x10::io::Console::FMGL(ERR__get)()->x10::io::Printer::println(
          reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129869 = ::x10aux::makeStringLit("Duplicated "); strLit__129869; })), key), (__extension__ ({ static ::x10::lang::String* strLit__129870 = ::x10aux::makeStringLit(", It\'s value now: "); strLit__129870; }))), valueArray->x10::lang::Rail< ::x10::lang::String* >::__apply(
                                                                                                                                                                                                                                                                                                                                                                                                            ((x10_long)0ll)))));
        
        //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        ::x10aux::nullCheck(props)->put(key, valueArray);
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_OptionsParser__closure__10* storage = ::x10aux::alloc_z<x10_util_OptionsParser__closure__10>();
        buf.record_reference(storage);
        x10_util_OptionsParser__closure__10* this_ = new (storage) x10_util_OptionsParser__closure__10();
        return this_;
    }
    
    x10_util_OptionsParser__closure__10() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_5< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*>*, ::x10::lang::Rail< ::x10::lang::String* >*, x10_int, x10_int> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::VoidFun_0_5< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*>*, ::x10::lang::Rail< ::x10::lang::String* >*, x10_int, x10_int> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10:197-202";
    }

};

#endif // X10_UTIL_OPTIONSPARSER__CLOSURE__10_CLOSURE
#ifndef X10_UTIL_OPTIONSPARSER__CLOSURE__12_CLOSURE
#define X10_UTIL_OPTIONSPARSER__CLOSURE__12_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_3.h>
class x10_util_OptionsParser__closure__12 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*>::itable<x10_util_OptionsParser__closure__12> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    ::x10::lang::String* __apply(::x10::lang::String* key, ::x10::lang::String* orElse, ::x10::lang::Rail< ::x10::lang::String* >* values) {
        
        //#line 211 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        ::x10aux::throwException(::x10aux::nullCheck(::x10::util::OptionsParser__Err::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129874 = ::x10aux::makeStringLit("request of value for ("); strLit__129874; })), key), (__extension__ ({ static ::x10::lang::String* strLit__129875 = ::x10aux::makeStringLit(", "); strLit__129875; }))), orElse), (__extension__ ({ static ::x10::lang::String* strLit__129876 = ::x10aux::makeStringLit(") failed: values == "); strLit__129876; }))), values))));
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_OptionsParser__closure__12* storage = ::x10aux::alloc_z<x10_util_OptionsParser__closure__12>();
        buf.record_reference(storage);
        x10_util_OptionsParser__closure__12* this_ = new (storage) x10_util_OptionsParser__closure__12();
        return this_;
    }
    
    x10_util_OptionsParser__closure__12() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10:210-213";
    }

};

#endif // X10_UTIL_OPTIONSPARSER__CLOSURE__12_CLOSURE
#ifndef X10_UTIL_OPTIONSPARSER__CLOSURE__13_CLOSURE
#define X10_UTIL_OPTIONSPARSER__CLOSURE__13_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_2.h>
class x10_util_OptionsParser__closure__13 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_2< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>*, x10_int>::itable<x10_util_OptionsParser__closure__13> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_int __apply(::x10::lang::String* key, ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>* keyMap) {
        
        //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        ::x10::io::Console::FMGL(ERR__get)()->x10::io::Printer::println(reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129877 = ::x10aux::makeStringLit("Unknown key, \'"); strLit__129877; })), key), (__extension__ ({ static ::x10::lang::String* strLit__129878 = ::x10aux::makeStringLit("\' will be treated as flag."); strLit__129878; })))));
        
        //#line 241 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        ::x10::lang::String* shortKey = (__extension__ ({ static ::x10::lang::String* strLit__129879 = ::x10aux::makeStringLit(""); strLit__129879; }));
        ::x10::lang::String* longKey = (__extension__ ({ static ::x10::lang::String* strLit__129880 = ::x10aux::makeStringLit(""); strLit__129880; }));
        
        //#line 242 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if ((::x10aux::struct_equals(::x10aux::nullCheck(key)->x10::lang::String::indexOf(
                                       (__extension__ ({ static ::x10::lang::String* strLit__129881 = ::x10aux::makeStringLit("--"); strLit__129881; }))),
                                     ((x10_int)0)))) {
            longKey = key;
        } else 
        //#line 243 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if ((::x10aux::struct_equals(::x10aux::nullCheck(key)->x10::lang::String::indexOf(
                                       (__extension__ ({ static ::x10::lang::String* strLit__129882 = ::x10aux::makeStringLit("-"); strLit__129882; }))),
                                     ((x10_int)0)))) {
            shortKey = key;
        } else {
            
            //#line 244 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            longKey = ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129883 = ::x10aux::makeStringLit("--"); strLit__129883; })), key);
            shortKey = ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129884 = ::x10aux::makeStringLit("-"); strLit__129884; })), key);
        }
        
        //#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if ((((((x10_long)(::x10aux::nullCheck(shortKey)->x10::lang::String::length()))) > (((x10_long)0ll))) ||
            ((((x10_long)(::x10aux::nullCheck(longKey)->x10::lang::String::length()))) > (((x10_long)0ll)))))
        {
            
            //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            ::x10::util::Option added =  ::x10::util::Option::_alloc();
            (added)->::x10::util::Option::_constructor(shortKey,
                                                       longKey,
                                                       (__extension__ ({ static ::x10::lang::String* strLit__129885 = ::x10aux::makeStringLit("???"); strLit__129885; })),
                                                       ((x10_int)0),
                                                       true,
                                                       false,
                                                       true);
            
            //#line 247 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (((((x10_long)(::x10aux::nullCheck(shortKey)->x10::lang::String::length()))) > (((x10_long)0ll))))
            {
                ::x10aux::nullCheck(keyMap)->put(shortKey,
                                                 added);
            }
            
            //#line 248 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (((((x10_long)(::x10aux::nullCheck(longKey)->x10::lang::String::length()))) > (((x10_long)0ll))))
            {
                ::x10aux::nullCheck(keyMap)->put(longKey,
                                                 added);
            }
            
        }
        
        //#line 250 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return ((x10_int)0);
        
    }
    
    // captured environment
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_util_OptionsParser__closure__13* storage = ::x10aux::alloc_z<x10_util_OptionsParser__closure__13>();
        buf.record_reference(storage);
        x10_util_OptionsParser__closure__13* this_ = new (storage) x10_util_OptionsParser__closure__13();
        return this_;
    }
    
    x10_util_OptionsParser__closure__13() { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_2< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>*, x10_int> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_2< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>*, x10_int> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10:239-251";
    }

};

#endif // X10_UTIL_OPTIONSPARSER__CLOSURE__13_CLOSURE
 /* public static type OptionsMap = x10.util.HashMap[x10.lang.String, x10.lang.Rail[x10.lang.String]]; */ 
 /* public static type TooManyHandler = (x10.lang.String,x10.lang.Int,x10.lang.Int)=>x10.lang.Int; */ 
 /* public static type TooFewHandler = (x10.lang.String,x10.lang.Int,x10.lang.Int)=>x10.lang.Rail[x10.lang.String]; */ 
 /* public static type DupHandler = (x10.lang.String,x10.util.HashMap[x10.lang.String, x10.lang.Rail[x10.lang.String]],x10.lang.Rail[x10.lang.String],x10.lang.Int,x10.lang.Int)=>void; */ 
 /* public static type MoreThanOneHandler = (x10.lang.String,x10.lang.String,x10.lang.Rail[x10.lang.String])=>x10.lang.String; */ 

//#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
/**
     * IGNORE and START_TAIL are the two things you can do when you hit an
     * unrecognized key that is not known to be in the tail.  Unknown key
     * handlers are assumed to return one of these two values.  IGNORE
     * means: don't assume this is part of the tail...keep looking for 
     * more keys.
     */
x10_int x10::util::OptionsParser::FMGL(IGNORE);
void x10::util::OptionsParser::FMGL(IGNORE__do_init)() {
    FMGL(IGNORE__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::OptionsParser.IGNORE");
    x10_int __var2793__ = ((x10_int)0);
    FMGL(IGNORE) = __var2793__;
    FMGL(IGNORE__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::OptionsParser::FMGL(IGNORE__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(IGNORE__status), &FMGL(IGNORE__do_init), &FMGL(IGNORE__exception), "x10::util::OptionsParser.IGNORE");
    
}
volatile ::x10aux::StaticInitController::status x10::util::OptionsParser::FMGL(IGNORE__status);
::x10::lang::CheckedThrowable* x10::util::OptionsParser::FMGL(IGNORE__exception);

//#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
/** assume that the tail begins at this key, if not before */
x10_int x10::util::OptionsParser::FMGL(START_TAIL);
void x10::util::OptionsParser::FMGL(START_TAIL__do_init)() {
    FMGL(START_TAIL__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::OptionsParser.START_TAIL");
    x10_int __var2794__ = ((x10_int)1);
    FMGL(START_TAIL) = __var2794__;
    FMGL(START_TAIL__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::OptionsParser::FMGL(START_TAIL__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(START_TAIL__status), &FMGL(START_TAIL__do_init), &FMGL(START_TAIL__exception), "x10::util::OptionsParser.START_TAIL");
    
}
volatile ::x10aux::StaticInitController::status x10::util::OptionsParser::FMGL(START_TAIL__status);
::x10::lang::CheckedThrowable* x10::util::OptionsParser::FMGL(START_TAIL__exception);
 /* public static type UnknownKeyHandler = (x10.lang.String,x10.util.HashMap[x10.lang.String, x10.util.Option])=>x10.lang.Int; */ 

//#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
/**
     * this handles the event in which too few values are provided for a key.
     * It is a function of three arguments: the key itself, how many arguments
     * were expected, and how many were actually found.  Nota bene: we are 
     * talking about parsing the command line and not finding a value.  We
     * are NOT talking about asking, once the command line has been read,
     * what value, if any, was supplied for a given option.
     */

//#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
/**
     * this handles the problem of what to do when too many values are provided
     * for a key.  The default action is just to use the number expected and
     * ignore the rest.  If you want different behavior, you need to supply a
     * function of three arguments: the key itself, how many arguments were
     * expected, and how many were actually found. It should return the number
     * to use.
     */

//#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
/**
     * this handles the problem of what to do when the same key (or the short
     * and long forms of the same key) appear multiple times in a single command.
     * The default is that the last wins.
     */

//#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
/**
     * this handles the problem of what to do when the application asks for the
     * value of an option, expecting that exactly none or one value will be
     * provided.  The default is to throw an exception.  
     */

//#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
/**
     * use this as the value for onMoreThanOne if you want the first value in
     * the values array when there is more than one.
     */
::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*>*
  x10::util::OptionsParser::FMGL(firstOnMoreThanOne);
void x10::util::OptionsParser::FMGL(firstOnMoreThanOne__do_init)() {
    FMGL(firstOnMoreThanOne__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::OptionsParser.firstOnMoreThanOne");
    ::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*>* __var2795__ = reinterpret_cast< ::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*> >(sizeof(x10_util_OptionsParser__closure__1)))x10_util_OptionsParser__closure__1()));
    FMGL(firstOnMoreThanOne) = __var2795__;
    FMGL(firstOnMoreThanOne__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::OptionsParser::FMGL(firstOnMoreThanOne__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(firstOnMoreThanOne__status), &FMGL(firstOnMoreThanOne__do_init), &FMGL(firstOnMoreThanOne__exception), "x10::util::OptionsParser.firstOnMoreThanOne");
    
}
volatile ::x10aux::StaticInitController::status x10::util::OptionsParser::FMGL(firstOnMoreThanOne__status);
::x10::lang::CheckedThrowable* x10::util::OptionsParser::FMGL(firstOnMoreThanOne__exception);

//#line 226 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
/**
     * use this as the value for onMoreThanOne if you want the last value in
     * the values array when there is more than one.
     */
::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*>*
  x10::util::OptionsParser::FMGL(lastOnMoreThanOne);
void x10::util::OptionsParser::FMGL(lastOnMoreThanOne__do_init)() {
    FMGL(lastOnMoreThanOne__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::OptionsParser.lastOnMoreThanOne");
    ::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*>* __var2796__ = reinterpret_cast< ::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*> >(sizeof(x10_util_OptionsParser__closure__2)))x10_util_OptionsParser__closure__2()));
    FMGL(lastOnMoreThanOne) = __var2796__;
    FMGL(lastOnMoreThanOne__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::OptionsParser::FMGL(lastOnMoreThanOne__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(lastOnMoreThanOne__status), &FMGL(lastOnMoreThanOne__do_init), &FMGL(lastOnMoreThanOne__exception), "x10::util::OptionsParser.lastOnMoreThanOne");
    
}
volatile ::x10aux::StaticInitController::status x10::util::OptionsParser::FMGL(lastOnMoreThanOne__status);
::x10::lang::CheckedThrowable* x10::util::OptionsParser::FMGL(lastOnMoreThanOne__exception);

//#line 238 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
/**
     * this handles the problem of what to do if an unexpected key is found while
     * parsing the command line.  The default action on reading an unrecognized
     * key is to add it as a flag and mark it as unexpected.  This means that
     * the tail will only be correctly recognized as such if either the unknown
     * key is not the last key, or the unexpected key really is a flag, or you
     * explicitly insert "--" to separate the tail.
     */

//#line 254 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
/** the other common thing to do on seeing an unknown key is to start the tail */
::x10::lang::Fun_0_2< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>*, x10_int>*
  x10::util::OptionsParser::FMGL(startTailOnUnknownKey);
void x10::util::OptionsParser::FMGL(startTailOnUnknownKey__do_init)() {
    FMGL(startTailOnUnknownKey__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::OptionsParser.startTailOnUnknownKey");
    ::x10::lang::Fun_0_2< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>*, x10_int>* __var2797__ = reinterpret_cast< ::x10::lang::Fun_0_2< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>*, x10_int>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_2< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>*, x10_int> >(sizeof(x10_util_OptionsParser__closure__3)))x10_util_OptionsParser__closure__3()));
    FMGL(startTailOnUnknownKey) = __var2797__;
    FMGL(startTailOnUnknownKey__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::OptionsParser::FMGL(startTailOnUnknownKey__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(startTailOnUnknownKey__status), &FMGL(startTailOnUnknownKey__do_init), &FMGL(startTailOnUnknownKey__exception), "x10::util::OptionsParser.startTailOnUnknownKey");
    
}
volatile ::x10aux::StaticInitController::status x10::util::OptionsParser::FMGL(startTailOnUnknownKey__status);
::x10::lang::CheckedThrowable* x10::util::OptionsParser::FMGL(startTailOnUnknownKey__exception);

//#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
void x10::util::OptionsParser::setHandlers(::x10::lang::Rail< ::x10::lang::Any* >* hndlrs) {
    
    //#line 259 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::lang::Rail< ::x10::lang::Any* >* rail__121733 =
      hndlrs;
    x10_long i__120218max__121734 = (x10_long)(::x10aux::nullCheck(rail__121733)->FMGL(size));
    {
        x10_long i__121735;
        for (i__121735 = ((x10_long)0ll); ((i__121735) < (i__120218max__121734));
             i__121735 = ((i__121735) + (((x10_long)1ll))))
        {
            x10_long n__121736 = i__121735;
            
            //#line 260 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            ::x10::lang::Any* hndlr__121732 = ::x10aux::nullCheck(hndlrs)->x10::lang::Rail< ::x10::lang::Any* >::__apply(
                                                n__121736);
            
            //#line 261 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (::x10aux::instanceof< ::x10::lang::Fun_0_3< ::x10::lang::String*, x10_int, x10_int, x10_int>*>(hndlr__121732))
            {
                this->FMGL(onTooMany) = (::x10aux::class_cast< ::x10::lang::Fun_0_3< ::x10::lang::String*, x10_int, x10_int, x10_int>*>(hndlr__121732));
            } else 
            //#line 262 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (::x10aux::instanceof< ::x10::lang::Fun_0_3< ::x10::lang::String*, x10_int, x10_int, ::x10::lang::Rail< ::x10::lang::String* >*>*>(hndlr__121732))
            {
                this->FMGL(onTooFew) = (::x10aux::class_cast< ::x10::lang::Fun_0_3< ::x10::lang::String*, x10_int, x10_int, ::x10::lang::Rail< ::x10::lang::String* >*>*>(hndlr__121732));
            } else 
            //#line 263 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (::x10aux::instanceof< ::x10::lang::VoidFun_0_5< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*>*, ::x10::lang::Rail< ::x10::lang::String* >*, x10_int, x10_int>*>(hndlr__121732))
            {
                this->FMGL(onDuplicate) = (::x10aux::class_cast< ::x10::lang::VoidFun_0_5< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*>*, ::x10::lang::Rail< ::x10::lang::String* >*, x10_int, x10_int>*>(hndlr__121732));
            } else 
            //#line 264 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (::x10aux::instanceof< ::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*>*>(hndlr__121732))
            {
                this->FMGL(onMoreThanOne) = (::x10aux::class_cast< ::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*>*>(hndlr__121732));
            } else 
            //#line 265 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (::x10aux::instanceof< ::x10::lang::Fun_0_2< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>*, x10_int>*>(hndlr__121732))
            {
                this->FMGL(onUnknownKey) = (::x10aux::class_cast< ::x10::lang::Fun_0_2< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>*, x10_int>*>(hndlr__121732));
            }
            
        }
    }
    
}

//#line 272 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"

//#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"

//#line 274 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"

//#line 275 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"

//#line 276 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"

//#line 277 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"

//#line 278 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"

//#line 291 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
void x10::util::OptionsParser::_constructor(::x10::lang::Rail< ::x10::lang::String* >* args) {
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    this->x10::util::OptionsParser::__fieldInitializers_x10_util_OptionsParser();
    
    //#line 292 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    this->parse(args, ::x10::util::OptionsParser::makeOptionArray(
                        args));
}
::x10::util::OptionsParser* x10::util::OptionsParser::_make(
  ::x10::lang::Rail< ::x10::lang::String* >* args) {
    ::x10::util::OptionsParser* this_ = new (::x10aux::alloc_z< ::x10::util::OptionsParser>()) ::x10::util::OptionsParser();
    this_->_constructor(args);
    return this_;
}



//#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
::x10::lang::Rail< ::x10::util::Option >* x10::util::OptionsParser::makeOptionArray(
  ::x10::lang::Rail< ::x10::lang::String* >* args) {
    
    //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::util::RailBuilder< ::x10::util::Option>* builder =
       (new (::x10aux::alloc_z< ::x10::util::RailBuilder< ::x10::util::Option> >()) ::x10::util::RailBuilder< ::x10::util::Option>());
    (builder)->::x10::util::RailBuilder< ::x10::util::Option>::_constructor(
      (x10_long)(::x10aux::nullCheck(args)->FMGL(size)));
    
    //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    x10_long lastArg = (((x10_long)(::x10aux::nullCheck(args)->FMGL(size))) - (((x10_long)1ll)));
    
    //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    x10_long i__120237max__121747 = lastArg;
    {
        x10_long i__121748;
        for (i__121748 = ((x10_long)0ll); ((i__121748) <= (i__120237max__121747));
             i__121748 = ((i__121748) + (((x10_long)1ll))))
        {
            x10_long n__121749 = i__121748;
            
            //#line 298 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            ::x10::lang::String* argN__121743 = ::x10aux::nullCheck(args)->x10::lang::Rail< ::x10::lang::String* >::__apply(
                                                  n__121749);
            
            //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if ((::x10aux::struct_equals((argN__121743)->charAt(((x10_int)0)),
                                         ((x10_char)'-'))))
            {
                
                //#line 300 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if ((((((x10_long)(::x10aux::nullCheck(argN__121743)->x10::lang::String::length()))) > (((x10_long)1ll))) &&
                    ::x10::lang::CharNatives::isDigit((argN__121743)->charAt(((x10_int)1)))))
                {
                    continue;
                } else 
                //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (::x10aux::equals(argN__121743,(__extension__ ({ static ::x10::lang::String* strLit__129688 = ::x10aux::makeStringLit("--"); strLit__129688; }))))
                {
                    break;
                }
                
                //#line 302 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                x10_int firstEq__121744 = ::x10aux::nullCheck(argN__121743)->x10::lang::String::indexOf(
                                            (__extension__ ({ static ::x10::lang::String* strLit__129689 = ::x10aux::makeStringLit("="); strLit__129689; })));
                
                //#line 303 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (((firstEq__121744) > (((x10_int)0))))
                {
                    argN__121743 = ::x10aux::nullCheck(argN__121743)->x10::lang::String::substring(
                                     ((x10_int)0), firstEq__121744);
                }
                
                //#line 304 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if ((::x10aux::struct_equals((argN__121743)->charAt(((x10_int)1)),
                                             ((x10_char)'-'))))
                {
                    
                    //#line 305 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    reinterpret_cast< ::x10::util::RailBuilder< ::x10::util::Option>*>(builder->add(
                                                                                         (__extension__ ({
                                                                                             ::x10::util::Option alloc__121745 =
                                                                                               
                                                                                             ::x10::util::Option::_alloc();
                                                                                             
                                                                                             //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                                                                                             ::x10::lang::String* s__121737 =
                                                                                               (__extension__ ({ static ::x10::lang::String* strLit__129691 = ::x10aux::makeStringLit(""); strLit__129691; }));
                                                                                             ::x10::lang::String* l__121738 =
                                                                                               argN__121743;
                                                                                             ::x10::lang::String* d__121739 =
                                                                                               (__extension__ ({ static ::x10::lang::String* strLit__129692 = ::x10aux::makeStringLit("no description given"); strLit__129692; }));
                                                                                             
                                                                                             //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                                                                                             (alloc__121745)->::x10::util::Option::_constructor(
                                                                                               s__121737,
                                                                                               l__121738,
                                                                                               d__121739,
                                                                                               ((x10_int)0),
                                                                                               true,
                                                                                               false,
                                                                                               false);
                                                                                             alloc__121745;
                                                                                         }))
                                                                                         ));
                } else {
                    
                    //#line 307 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    reinterpret_cast< ::x10::util::RailBuilder< ::x10::util::Option>*>(builder->add(
                                                                                         (__extension__ ({
                                                                                             ::x10::util::Option alloc__121746 =
                                                                                               
                                                                                             ::x10::util::Option::_alloc();
                                                                                             
                                                                                             //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                                                                                             ::x10::lang::String* s__121740 =
                                                                                               argN__121743;
                                                                                             ::x10::lang::String* l__121741 =
                                                                                               (__extension__ ({ static ::x10::lang::String* strLit__129694 = ::x10aux::makeStringLit(""); strLit__129694; }));
                                                                                             ::x10::lang::String* d__121742 =
                                                                                               (__extension__ ({ static ::x10::lang::String* strLit__129695 = ::x10aux::makeStringLit("no description given"); strLit__129695; }));
                                                                                             
                                                                                             //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/Option.x10"
                                                                                             (alloc__121746)->::x10::util::Option::_constructor(
                                                                                               s__121740,
                                                                                               l__121741,
                                                                                               d__121742,
                                                                                               ((x10_int)0),
                                                                                               true,
                                                                                               false,
                                                                                               false);
                                                                                             alloc__121746;
                                                                                         }))
                                                                                         ));
                }
                
            }
            
        }
    }
    
    //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    return builder->result();
    
}

//#line 320 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
void x10::util::OptionsParser::_constructor(::x10::lang::Rail< ::x10::lang::String* >* args,
                                            ::x10::lang::Rail< ::x10::util::Option >* options) {
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    this->x10::util::OptionsParser::__fieldInitializers_x10_util_OptionsParser();
    
    //#line 321 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    this->parse(args, ::x10::lang::Rail< ::x10::util::Option >::_make(options));
}
::x10::util::OptionsParser* x10::util::OptionsParser::_make(
  ::x10::lang::Rail< ::x10::lang::String* >* args, ::x10::lang::Rail< ::x10::util::Option >* options)
{
    ::x10::util::OptionsParser* this_ = new (::x10aux::alloc_z< ::x10::util::OptionsParser>()) ::x10::util::OptionsParser();
    this_->_constructor(args, options);
    return this_;
}



//#line 340 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
void x10::util::OptionsParser::_constructor(::x10::lang::Rail< ::x10::lang::String* >* args,
                                            ::x10::lang::Rail< ::x10::util::Option >* flags,
                                            ::x10::lang::Rail< ::x10::util::Option >* others) {
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    this->x10::util::OptionsParser::__fieldInitializers_x10_util_OptionsParser();
    
    //#line 341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    this->parse(args, ::x10::util::OptionsParser::merge(flags,
                                                        others));
}
::x10::util::OptionsParser* x10::util::OptionsParser::_make(
  ::x10::lang::Rail< ::x10::lang::String* >* args, ::x10::lang::Rail< ::x10::util::Option >* flags,
  ::x10::lang::Rail< ::x10::util::Option >* others) {
    ::x10::util::OptionsParser* this_ = new (::x10aux::alloc_z< ::x10::util::OptionsParser>()) ::x10::util::OptionsParser();
    this_->_constructor(args, flags, others);
    return this_;
}



//#line 343 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
::x10::lang::Rail< ::x10::util::Option >* x10::util::OptionsParser::merge(
  ::x10::lang::Rail< ::x10::util::Option >* flags, ::x10::lang::Rail< ::x10::util::Option >* parms) {
    
    //#line 344 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::util::RailBuilder< ::x10::util::Option>* builder =
       (new (::x10aux::alloc_z< ::x10::util::RailBuilder< ::x10::util::Option> >()) ::x10::util::RailBuilder< ::x10::util::Option>());
    (builder)->::x10::util::RailBuilder< ::x10::util::Option>::_constructor(
      (((x10_long)(::x10aux::nullCheck(flags)->FMGL(size))) + ((x10_long)(::x10aux::nullCheck(parms)->FMGL(size)))));
    
    //#line 345 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::lang::Rail< ::x10::util::Option >* rail__121750 =
      flags;
    x10_long i__120255max__121751 = (x10_long)(::x10aux::nullCheck(rail__121750)->FMGL(size));
    {
        x10_long i__121752;
        for (i__121752 = ((x10_long)0ll); ((i__121752) < (i__120255max__121751));
             i__121752 = ((i__121752) + (((x10_long)1ll))))
        {
            x10_long m__121753 = i__121752;
            reinterpret_cast< ::x10::util::RailBuilder< ::x10::util::Option>*>(builder->add(
                                                                                 ::x10aux::nullCheck(flags)->x10::lang::Rail< ::x10::util::Option >::__apply(
                                                                                   m__121753)->x10::util::Option::asFlag()));
        }
    }
    
    //#line 346 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::lang::Rail< ::x10::util::Option >* rail__121754 =
      parms;
    x10_long i__120274max__121755 = (x10_long)(::x10aux::nullCheck(rail__121754)->FMGL(size));
    {
        x10_long i__121756;
        for (i__121756 = ((x10_long)0ll); ((i__121756) < (i__120274max__121755));
             i__121756 = ((i__121756) + (((x10_long)1ll))))
        {
            x10_long n__121757 = i__121756;
            reinterpret_cast< ::x10::util::RailBuilder< ::x10::util::Option>*>(builder->add(
                                                                                 ::x10aux::nullCheck(parms)->x10::lang::Rail< ::x10::util::Option >::__apply(
                                                                                   n__121757)->x10::util::Option::asSimpleParm()));
        }
    }
    
    //#line 347 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    return builder->result();
    
}

//#line 370 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
void x10::util::OptionsParser::_constructor(::x10::lang::Rail< ::x10::lang::String* >* args,
                                            ::x10::lang::Rail< ::x10::util::Option >* options,
                                            ::x10::lang::Rail< ::x10::lang::Any* >* handlers) {
    
    //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    this->x10::util::OptionsParser::__fieldInitializers_x10_util_OptionsParser();
    
    //#line 371 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    this->x10::util::OptionsParser::setHandlers(handlers);
    
    //#line 372 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    this->parse(args, ::x10::lang::Rail< ::x10::util::Option >::_make(options));
}
::x10::util::OptionsParser* x10::util::OptionsParser::_make(
  ::x10::lang::Rail< ::x10::lang::String* >* args, ::x10::lang::Rail< ::x10::util::Option >* options,
  ::x10::lang::Rail< ::x10::lang::Any* >* handlers) {
    ::x10::util::OptionsParser* this_ = new (::x10aux::alloc_z< ::x10::util::OptionsParser>()) ::x10::util::OptionsParser();
    this_->_constructor(args, options, handlers);
    return this_;
}



//#line 378 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
void x10::util::OptionsParser::parse(::x10::lang::Rail< ::x10::lang::String* >* args,
                                     ::x10::lang::Rail< ::x10::util::Option >* options) {
    
    //#line 380 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    if ((!::x10aux::struct_equals(this->FMGL(properties),
                                  reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
    {
        
        //#line 381 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        ::x10::io::Console::FMGL(ERR__get)()->x10::io::Printer::println(
          reinterpret_cast< ::x10::lang::Any*>((__extension__ ({ static ::x10::lang::String* strLit__129700 = ::x10aux::makeStringLit("Command line already parsed!"); strLit__129700; }))));
        
        //#line 382 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return;
    }
    
    //#line 384 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    this->FMGL(options) = options;
    
    //#line 385 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    this->initializeKeyMap(options);
    
    //#line 386 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::lang::Rail< x10_int >* keyIndex = this->makeKeyIndex(
                                               args, options);
    
    //#line 387 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*>* props =
       (new (::x10aux::alloc_z< ::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*> >()) ::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*>());
    (props)->::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*>::_constructor();
    
    //#line 388 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::lang::Rail< x10_int >* keyInArgs = keyIndex;
    
    //#line 389 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    x10_int newTailStart = ((x10_int)0);
    
    //#line 390 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    x10_int lastIndex = ((((x10_int) ((x10_long)(::x10aux::nullCheck(keyInArgs)->FMGL(size))))) - (((x10_int)2)));
    
    //#line 391 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    this->FMGL(properties) = props;
    
    //#line 392 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    {
        x10_int k;
        for (k = ((x10_int)0); ((k) <= (lastIndex)); k = ((k) + (((x10_int)1))))
        {
            
            //#line 393 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            ::x10::lang::String* key = ::x10aux::nullCheck(this->FMGL(args))->x10::lang::Rail< ::x10::lang::String* >::__apply(
                                         ((x10_long)(::x10aux::nullCheck(keyInArgs)->x10::lang::Rail< x10_int >::__apply(
                                                       ((x10_long)(k))))));
            
            //#line 394 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            ::x10::util::Option option = ::x10aux::nullCheck(this->FMGL(keyMap))->getOrElse(
                                           key, ::x10::util::Option::FMGL(BAD__get)());
            
            //#line 395 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if ((::x10aux::struct_equals(option, ::x10::util::Option::FMGL(BAD__get)())))
            {
                break;
            }
            
            //#line 396 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            x10_int first = ((::x10aux::nullCheck(keyInArgs)->x10::lang::Rail< x10_int >::__apply(
                                ((x10_long)(k)))) + (((x10_int)1)));
            
            //#line 397 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            x10_int valueCount = ((::x10aux::nullCheck(keyInArgs)->x10::lang::Rail< x10_int >::__apply(
                                     ((x10_long)(((k) + (((x10_int)1))))))) - (first));
            
            //#line 398 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            x10_int expected = option->FMGL(minFollow);
            
            //#line 399 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            ::x10::lang::Rail< ::x10::lang::String* >* values =
              ::x10aux::class_cast_unchecked< ::x10::lang::Rail< ::x10::lang::String* >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
            
            //#line 400 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (((expected) > (valueCount))) {
                
                //#line 401 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                values = ::x10::lang::Fun_0_3< ::x10::lang::String*, x10_int, x10_int, ::x10::lang::Rail< ::x10::lang::String* >*>::__apply(::x10aux::nullCheck(this->FMGL(onTooFew)), 
                  key, expected, valueCount);
            } else 
            //#line 403 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (((expected) < (valueCount))) {
                
                //#line 404 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (!(option->FMGL(arbFollow))) {
                    
                    //#line 405 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    valueCount = ::x10::lang::Fun_0_3< ::x10::lang::String*, x10_int, x10_int, x10_int>::__apply(::x10aux::nullCheck(this->FMGL(onTooMany)), 
                      key, expected, valueCount);
                    
                    //#line 406 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    x10_int newTail = ((first) + (valueCount));
                    
                    //#line 407 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    x10_int thisK = lastIndex = k;
                    
                    //#line 409 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    keyInArgs = ::x10::lang::Rail< x10_int >::_make(((x10_long)(((k) + (((x10_int)2))))),
                                                                    reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_int>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_int> >(sizeof(x10_util_OptionsParser__closure__4)))x10_util_OptionsParser__closure__4(thisK, keyIndex, newTail))));
                }
                
            }
            
            //#line 415 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            newTailStart = ((first) + (valueCount));
            
            //#line 416 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (::x10aux::nullCheck(this->FMGL(properties))->containsKey(
                  key)) {
                
                //#line 417 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (((valueCount) > (((x10_int)0)))) {
                    
                    //#line 418 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    ::x10::lang::VoidFun_0_5< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*>*, ::x10::lang::Rail< ::x10::lang::String* >*, x10_int, x10_int>::__apply(::x10aux::nullCheck(this->FMGL(onDuplicate)), 
                      key, props, this->FMGL(args), first,
                      valueCount);
                }
                
            } else {
                
                //#line 422 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                ::x10::lang::Rail< ::x10::lang::String* >* whatToPut;
                
                //#line 423 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if ((::x10aux::struct_equals(valueCount, ((x10_int)0))))
                {
                    
                    //#line 424 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    if (option->FMGL(arbFollow)) {
                        
                        //#line 425 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        whatToPut = ::x10::lang::Rail< ::x10::lang::String* >::_make();
                    } else {
                        
                        //#line 427 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        whatToPut = ::x10::lang::Rail< ::x10::lang::String* >::_make(((x10_long)1ll),
                                                                                     (__extension__ ({ static ::x10::lang::String* strLit__129720 = ::x10aux::makeStringLit("true"); strLit__129720; })));
                    }
                    
                } else 
                //#line 429 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if ((!::x10aux::struct_equals(values, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))))
                {
                    whatToPut = values;
                } else {
                    
                    //#line 431 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    ::x10::lang::Rail< ::x10::lang::String* >* thisArgs =
                      this->FMGL(args);
                    
                    //#line 433 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    whatToPut = ::x10::lang::Rail< ::x10::lang::String* >::_make(((x10_long)(valueCount)),
                                                                                 reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*> >(sizeof(x10_util_OptionsParser__closure__5)))x10_util_OptionsParser__closure__5(thisArgs, first))));
                }
                
                //#line 435 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                ::x10aux::nullCheck(this->FMGL(properties))->put(
                  key, whatToPut);
                
                //#line 436 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                ::x10::lang::String* otherForm = option->x10::util::Option::otherForm(
                                                   key);
                
                //#line 437 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (((::x10aux::nullCheck(otherForm)->x10::lang::String::length()) > (((x10_int)0))))
                {
                    ::x10aux::nullCheck(this->FMGL(properties))->put(
                      otherForm, whatToPut);
                }
                
            }
            
        }
    }
    
    //#line 440 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    this->FMGL(tailStart) = ::x10aux::nullCheck(keyInArgs)->x10::lang::Rail< x10_int >::__set(
                              (((x10_long)(::x10aux::nullCheck(keyInArgs)->FMGL(size))) - (((x10_long)1ll))),
                              newTailStart);
}

//#line 443 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
void x10::util::OptionsParser::initializeKeyMap(::x10::lang::Rail< ::x10::util::Option >* options) {
    
    //#line 445 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>* km =
       (new (::x10aux::alloc_z< ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option> >()) ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>());
    (km)->::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>::_constructor(
      ((x10_long)(((x10_int) ((((x10_long)(::x10aux::nullCheck(options)->FMGL(size))) * (((x10_long)2ll))))))));
    
    //#line 446 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::util::HashSet< ::x10::util::Option>* req =  (new (::x10aux::alloc_z< ::x10::util::HashSet< ::x10::util::Option> >()) ::x10::util::HashSet< ::x10::util::Option>());
    (req)->::x10::util::HashSet< ::x10::util::Option>::_constructor(
      ((x10_int) ((x10_long)(::x10aux::nullCheck(options)->FMGL(size)))));
    
    //#line 447 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::util::HashSet< ::x10::lang::String*>* ocf =  (new (::x10aux::alloc_z< ::x10::util::HashSet< ::x10::lang::String*> >()) ::x10::util::HashSet< ::x10::lang::String*>());
    (ocf)->::x10::util::HashSet< ::x10::lang::String*>::_constructor(
      ((x10_int) ((x10_long)(::x10aux::nullCheck(options)->FMGL(size)))));
    
    //#line 448 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::lang::Rail< ::x10::util::Option >* rail__121759 =
      options;
    x10_long i__120293max__121760 = (x10_long)(::x10aux::nullCheck(rail__121759)->FMGL(size));
    {
        x10_long i__121761;
        for (i__121761 = ((x10_long)0ll); ((i__121761) < (i__120293max__121760));
             i__121761 = ((i__121761) + (((x10_long)1ll))))
        {
            x10_long ox__121762 = i__121761;
            
            //#line 449 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            ::x10::util::Option o__121758 = ::x10aux::nullCheck(options)->x10::lang::Rail< ::x10::util::Option >::__apply(
                                              ox__121762);
            
            //#line 450 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (((((x10_long)(::x10aux::nullCheck(o__121758->FMGL(shortForm))->x10::lang::String::length()))) > (((x10_long)0ll))))
            {
                
                //#line 451 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                km->put(o__121758->FMGL(shortForm), o__121758);
                
                //#line 452 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if ((((::x10aux::struct_equals(::x10aux::nullCheck(o__121758->FMGL(shortForm))->x10::lang::String::length(),
                                               ((x10_int)2))) &&
                    (::x10aux::struct_equals(o__121758->FMGL(minFollow),
                                             ((x10_int)0)))) &&
                    !(o__121758->FMGL(arbFollow)))) {
                    
                    //#line 453 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    ocf->add(o__121758->FMGL(shortForm));
                }
                
            }
            
            //#line 456 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (((::x10aux::nullCheck(o__121758->FMGL(longForm))->x10::lang::String::length()) > (((x10_int)0))))
            {
                km->put(o__121758->FMGL(longForm), o__121758);
            }
            
            //#line 457 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (o__121758->FMGL(required)) {
                req->add(o__121758);
            }
            
        }
    }
    
    //#line 459 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    this->FMGL(keyMap) = km;
    
    //#line 460 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    this->FMGL(required) = req;
    
    //#line 461 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    this->FMGL(oneCharFlags) = ocf;
}

//#line 470 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
::x10::lang::Rail< x10_int >* x10::util::OptionsParser::makeKeyIndex(
  ::x10::lang::Rail< ::x10::lang::String* >* args, ::x10::lang::Rail< ::x10::util::Option >* options) {
    
    //#line 472 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::util::RailBuilder<x10_int>* keyIndex =  (new (::x10aux::alloc_z< ::x10::util::RailBuilder<x10_int> >()) ::x10::util::RailBuilder<x10_int>());
    (keyIndex)->::x10::util::RailBuilder<x10_int>::_constructor(
      (x10_long)(::x10aux::nullCheck(args)->FMGL(size)));
    
    //#line 473 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    x10_int keyCount = ((x10_int)0);
    
    //#line 474 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    x10_boolean helpOnly = false;
    
    //#line 475 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::lang::Rail< ::x10::lang::String* >* expanded =
      this->expandArgs(args);
    
    //#line 476 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    x10_int tailStart = ((x10_int) ((x10_long)(::x10aux::nullCheck(expanded)->FMGL(size))));
    
    //#line 477 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    x10_int lastArg = ((((x10_int) ((x10_long)(::x10aux::nullCheck(expanded)->FMGL(size))))) - (((x10_int)1)));
    
    //#line 478 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::util::HashSet< ::x10::util::Option>* reqNotSeen =
      reinterpret_cast< ::x10::util::HashSet< ::x10::util::Option>*>(::x10aux::nullCheck(this->FMGL(required))->clone());
    
    //#line 479 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    x10_int i__120312max__121765 = lastArg;
    {
        x10_int i__121766;
        for (i__121766 = ((x10_int)0); ((i__121766) <= (i__120312max__121765));
             i__121766 = ((i__121766) + (((x10_int)1)))) {
            x10_int i__121767 = i__121766;
            
            //#line 480 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            ::x10::lang::String* s__121763 = ::x10aux::nullCheck(expanded)->x10::lang::Rail< ::x10::lang::String* >::__apply(
                                               ((x10_long)(i__121767)));
            
            //#line 481 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if ((((::x10aux::nullCheck(s__121763)->x10::lang::String::length()) > (((x10_int)0))) &&
                (::x10aux::struct_equals((s__121763)->charAt(((x10_int)0)),
                                         ((x10_char)'-')))))
            {
                
                //#line 482 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if ((((((x10_long)(::x10aux::nullCheck(s__121763)->x10::lang::String::length()))) > (((x10_long)1ll))) &&
                    ::x10::lang::CharNatives::isDigit((s__121763)->charAt(((x10_int)1)))))
                {
                    continue;
                } else 
                //#line 483 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (::x10aux::nullCheck(this->FMGL(keyMap))->containsKey(
                      s__121763)) {
                    
                    //#line 484 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    reinterpret_cast< ::x10::util::RailBuilder<x10_int>*>(keyIndex->add(
                                                                            i__121767));
                    
                    //#line 485 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    ::x10::util::Option optForS__121764 =
                      ::x10aux::nullCheck(this->FMGL(keyMap))->getOrElse(
                        s__121763, ::x10::util::Option::FMGL(BAD__get)());
                    
                    //#line 486 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    if (optForS__121764->FMGL(required)) {
                        ::x10aux::nullCheck(reqNotSeen)->remove(
                          optForS__121764);
                    } else 
                    //#line 487 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    if ((::x10aux::struct_equals(optForS__121764,
                                                 ::x10::util::Option::FMGL(HELP__get)())))
                    {
                        
                        //#line 488 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        helpOnly = true;
                    }
                    
                } else 
                //#line 491 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if ((::x10aux::equals(s__121763,(__extension__ ({ static ::x10::lang::String* strLit__129748 = ::x10aux::makeStringLit("--"); strLit__129748; }))) ||
                    (::x10aux::struct_equals(::x10::lang::Fun_0_2< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>*, x10_int>::__apply(::x10aux::nullCheck(this->FMGL(onUnknownKey)), 
                                               s__121763,
                                               this->FMGL(keyMap)),
                                             ((x10_int)1)))))
                {
                    
                    //#line 492 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    tailStart = i__121767;
                    break;
                } else {
                    
                    //#line 494 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    reinterpret_cast< ::x10::util::RailBuilder<x10_int>*>(keyIndex->add(
                                                                            i__121767));
                }
                
            }
            
        }
    }
    
    //#line 497 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    reinterpret_cast< ::x10::util::RailBuilder<x10_int>*>(keyIndex->add(
                                                            tailStart));
    
    //#line 498 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    x10_long howManyMissing = ::x10aux::nullCheck(reqNotSeen)->size();
    
    //#line 499 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    if ((helpOnly || (::x10aux::struct_equals(howManyMissing,
                                              ((x10_long)0ll)))))
    {
        
        //#line 500 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        this->FMGL(args) = expanded;
        
        //#line 501 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return keyIndex->result();
        
    } else {
        
        //#line 504 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        ::x10::util::StringBuilder* sb =  (new (::x10aux::alloc_z< ::x10::util::StringBuilder>()) ::x10::util::StringBuilder());
        (sb)->::x10::util::StringBuilder::_constructor();
        
        //#line 505 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        sb->add((__extension__ ({ static ::x10::lang::String* strLit__129754 = ::x10aux::makeStringLit("The following "); strLit__129754; })));
        
        //#line 506 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if ((::x10aux::struct_equals(howManyMissing, ((x10_long)1ll))))
        {
            sb->add((__extension__ ({ static ::x10::lang::String* strLit__129756 = ::x10aux::makeStringLit("option is missing:\n\t"); strLit__129756; })));
        } else {
            
            //#line 507 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            sb->add(::x10::lang::String::__plus(howManyMissing, (__extension__ ({ static ::x10::lang::String* strLit__129758 = ::x10aux::makeStringLit(" options are missing\n\t"); strLit__129758; }))));
        }
        
        //#line 508 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        {
            ::x10::lang::Iterator< ::x10::util::Option>* o__120330;
            for (o__120330 = ::x10aux::nullCheck(reqNotSeen)->iterator();
                 ::x10::lang::Iterator< ::x10::util::Option>::hasNext(::x10aux::nullCheck(o__120330));
                 ) {
                ::x10::util::Option o = ::x10::lang::Iterator< ::x10::util::Option>::next(::x10aux::nullCheck(o__120330));
                
                //#line 509 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                sb->add(o->x10::util::Option::usage());
                
                //#line 510 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                sb->add((__extension__ ({ static ::x10::lang::String* strLit__129761 = ::x10aux::makeStringLit("\n\t"); strLit__129761; })));
            }
        }
        
        //#line 512 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        ::x10aux::throwException(::x10aux::nullCheck(::x10::util::OptionsParser__Err::_make(::x10::lang::String::__plus(sb->result(), (__extension__ ({ static ::x10::lang::String* strLit__129762 = ::x10aux::makeStringLit("\n"); strLit__129762; }))))));
    }
    
}

//#line 521 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
::x10::lang::Rail< ::x10::lang::String* >* x10::util::OptionsParser::expandArgs(
  ::x10::lang::Rail< ::x10::lang::String* >* args) {
    
    //#line 523 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::util::RailBuilder< ::x10::lang::String*>* builder =
       (new (::x10aux::alloc_z< ::x10::util::RailBuilder< ::x10::lang::String*> >()) ::x10::util::RailBuilder< ::x10::lang::String*>());
    (builder)->::x10::util::RailBuilder< ::x10::lang::String*>::_constructor(
      (__extension__ ({
          
          //#line 376 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Math.x10"
          x10_long b__121380 = ((((x10_long)2ll)) * ((x10_long)(::x10aux::nullCheck(args)->FMGL(size))));
          ((((x10_long)8ll)) < (b__121380)) ? (((x10_long)8ll))
            : (b__121380);
      }))
      );
    
    //#line 524 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    x10_boolean inTail = false;
    
    //#line 525 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::lang::Rail< ::x10::lang::String* >* rail__121784 =
      args;
    x10_long i__120370max__121785 = (x10_long)(::x10aux::nullCheck(rail__121784)->FMGL(size));
    {
        x10_long i__121786;
        for (i__121786 = ((x10_long)0ll); ((i__121786) < (i__120370max__121785));
             i__121786 = ((i__121786) + (((x10_long)1ll))))
        {
            x10_long n__121787 = i__121786;
            
            //#line 526 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            ::x10::lang::String* argN__121776 = ::x10aux::nullCheck(args)->x10::lang::Rail< ::x10::lang::String* >::__apply(
                                                  n__121787);
            
            //#line 527 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if ((((::x10aux::struct_equals(::x10aux::nullCheck(argN__121776)->x10::lang::String::length(),
                                           ((x10_int)0))) ||
                (!::x10aux::struct_equals((argN__121776)->charAt(((x10_int)0)),
                                          ((x10_char)'-')))) ||
                inTail)) {
                reinterpret_cast< ::x10::util::RailBuilder< ::x10::lang::String*>*>(builder->add(
                                                                                      argN__121776));
            } else 
            //#line 528 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (::x10aux::equals(argN__121776,(__extension__ ({ static ::x10::lang::String* strLit__129765 = ::x10aux::makeStringLit("--"); strLit__129765; }))))
            {
                inTail = true;
                reinterpret_cast< ::x10::util::RailBuilder< ::x10::lang::String*>*>(builder->add(
                                                                                      argN__121776));
            } else 
            //#line 529 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (((::x10aux::nullCheck(argN__121776)->x10::lang::String::length()) < (((x10_int)2))))
            {
                reinterpret_cast< ::x10::util::RailBuilder< ::x10::lang::String*>*>(builder->add(
                                                                                      argN__121776));
            } else 
            //#line 530 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (::x10::lang::CharNatives::isDigit((argN__121776)->charAt(((x10_int)1))))
            {
                reinterpret_cast< ::x10::util::RailBuilder< ::x10::lang::String*>*>(builder->add(
                                                                                      argN__121776));
            } else 
            //#line 531 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (::x10aux::nullCheck(this->FMGL(keyMap))->containsKey(
                  argN__121776)) {
                reinterpret_cast< ::x10::util::RailBuilder< ::x10::lang::String*>*>(builder->add(
                                                                                      argN__121776));
            } else {
                
                //#line 533 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                x10_boolean isFlags__121777 = true;
                
                //#line 534 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                x10_int count__121778 = ((::x10aux::nullCheck(argN__121776)->x10::lang::String::length()) - (((x10_int)1)));
                
                //#line 535 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                ::x10::lang::Rail< ::x10::lang::String* >* exploded__121779 =
                  ::x10::lang::Rail< ::x10::lang::String* >::_make(((x10_long)(count__121778)),
                                                                   reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*> >(sizeof(x10_util_OptionsParser__closure__6)))x10_util_OptionsParser__closure__6(argN__121776))));
                
                //#line 536 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                ::x10::lang::Rail< ::x10::lang::String* >* rail__121772 =
                  exploded__121779;
                x10_long i__120332max__121773 = (x10_long)(::x10aux::nullCheck(rail__121772)->FMGL(size));
                {
                    x10_long i__121774;
                    for (i__121774 = ((x10_long)0ll); ((i__121774) < (i__120332max__121773));
                         i__121774 = ((i__121774) + (((x10_long)1ll))))
                    {
                        x10_long k__121775 = i__121774;
                        
                        //#line 537 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        if (!(::x10aux::nullCheck(this->FMGL(oneCharFlags))->contains(
                                exploded__121779->x10::lang::Rail< ::x10::lang::String* >::__apply(
                                  k__121775)))) {
                            
                            //#line 538 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            isFlags__121777 = false;
                            break;
                        }
                        
                    }
                }
                
                //#line 541 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                if (isFlags__121777) {
                    ::x10::lang::Rail< ::x10::lang::String* >* rail__121768 =
                      exploded__121779;
                    x10_long i__120351max__121769 = (x10_long)(::x10aux::nullCheck(rail__121768)->FMGL(size));
                    {
                        x10_long i__121770;
                        for (i__121770 = ((x10_long)0ll);
                             ((i__121770) < (i__120351max__121769));
                             i__121770 = ((i__121770) + (((x10_long)1ll))))
                        {
                            x10_long k__121771 = i__121770;
                            reinterpret_cast< ::x10::util::RailBuilder< ::x10::lang::String*>*>(builder->add(
                                                                                                  exploded__121779->x10::lang::Rail< ::x10::lang::String* >::__apply(
                                                                                                    k__121771)));
                        }
                    }
                    
                } else {
                    
                    //#line 543 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    x10_int firstEq__121781 = ::x10aux::nullCheck(argN__121776)->x10::lang::String::indexOf(
                                                (__extension__ ({ static ::x10::lang::String* strLit__129779 = ::x10aux::makeStringLit("="); strLit__129779; })));
                    
                    //#line 544 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                    if ((((firstEq__121781) > (((x10_int)0))) &&
                        ::x10aux::nullCheck(this->FMGL(keyMap))->containsKey(
                          ::x10aux::nullCheck(argN__121776)->x10::lang::String::substring(
                            ((x10_int)0), firstEq__121781))))
                    {
                        
                        //#line 545 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        reinterpret_cast< ::x10::util::RailBuilder< ::x10::lang::String*>*>(builder->add(
                                                                                              ::x10aux::nullCheck(argN__121776)->x10::lang::String::substring(
                                                                                                ((x10_int)0),
                                                                                                firstEq__121781)));
                        
                        //#line 546 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        reinterpret_cast< ::x10::util::RailBuilder< ::x10::lang::String*>*>(builder->add(
                                                                                              ::x10aux::nullCheck(argN__121776)->x10::lang::String::substring(
                                                                                                ((firstEq__121781) + (((x10_int)1))))));
                    } else {
                        
                        //#line 549 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        reinterpret_cast< ::x10::util::RailBuilder< ::x10::lang::String*>*>(builder->add(
                                                                                              argN__121776));
                        
                        //#line 550 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                        try {
                            
                            //#line 551 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            x10_int where__121782 = ::x10::lang::Fun_0_2< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>*, x10_int>::__apply(::x10aux::nullCheck(this->FMGL(onUnknownKey)), 
                              argN__121776, this->FMGL(keyMap));
                            
                            //#line 552 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                            if ((::x10aux::struct_equals(where__121782,
                                                         ((x10_int)1))))
                            {
                                inTail = true;
                            }
                            
                        }
                        catch (::x10::lang::CheckedThrowable* __exc2805) {
                            if (::x10aux::instanceof< ::x10::util::OptionsParser__Err*>(__exc2805)) {
                                ::x10::util::OptionsParser__Err* e__121783 =
                                  static_cast< ::x10::util::OptionsParser__Err*>(__exc2805);
                                {
                                 
                                }
                            } else
                            throw;
                        }
                    }
                    
                }
                
            }
            
        }
    }
    
    //#line 559 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    return this->FMGL(args) = builder->result();
    
}

//#line 569 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
::x10::lang::Rail< ::x10::lang::String* >* x10::util::OptionsParser::getTail(
  ) {
    
    //#line 570 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    if (((((x10_long)(this->FMGL(tailStart)))) >= ((x10_long)(::x10aux::nullCheck(this->FMGL(args))->FMGL(size)))))
    {
        return ::x10::lang::Rail< ::x10::lang::String* >::_make(((x10_long)0ll),
                                                                (__extension__ ({ static ::x10::lang::String* strLit__129786 = ::x10aux::makeStringLit(""); strLit__129786; })));
        
    }
    
    //#line 571 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    x10_int first = ::x10aux::equals(::x10aux::nullCheck(this->FMGL(args))->x10::lang::Rail< ::x10::lang::String* >::__apply(
                                       ((x10_long)(this->FMGL(tailStart)))),(__extension__ ({ static ::x10::lang::String* strLit__129788 = ::x10aux::makeStringLit("--"); strLit__129788; })))
      ? (((this->FMGL(tailStart)) + (((x10_int)1)))) : (this->FMGL(tailStart));
    
    //#line 573 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    return ::x10::lang::Rail< ::x10::lang::String* >::_make((((x10_long)(::x10aux::nullCheck(this->FMGL(args))->FMGL(size))) - (((x10_long)(first)))),
                                                            reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*> >(sizeof(x10_util_OptionsParser__closure__7)))x10_util_OptionsParser__closure__7(this, first))));
    
}

//#line 580 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
x10_boolean x10::util::OptionsParser::hasTail() {
    return ((((x10_long)(this->FMGL(tailStart)))) < ((x10_long)(::x10aux::nullCheck(this->FMGL(args))->FMGL(size))));
    
}

//#line 611 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
::x10::lang::Rail< ::x10::lang::String* >* x10::util::OptionsParser::get(
  ::x10::lang::String* key) {
    
    //#line 613 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::lang::String* winner = key;
    
    //#line 614 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    x10_boolean isValid = true;
    
    //#line 615 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    if ((::x10aux::struct_equals((key)->charAt(((x10_int)0)),
                                 ((x10_char)'-')))) {
        
        //#line 616 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if ((::x10aux::struct_equals(::x10aux::nullCheck(this->FMGL(keyMap))->getOrElse(
                                       key, ::x10::util::Option::FMGL(BAD__get)()),
                                     ::x10::util::Option::FMGL(BAD__get)())))
        {
            isValid = false;
        }
        
    } else {
        
        //#line 619 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        winner = ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129792 = ::x10aux::makeStringLit("-"); strLit__129792; })), key);
        
        //#line 620 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if ((::x10aux::struct_equals(::x10aux::nullCheck(this->FMGL(keyMap))->getOrElse(
                                       winner, ::x10::util::Option::FMGL(BAD__get)()),
                                     ::x10::util::Option::FMGL(BAD__get)())))
        {
            
            //#line 621 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            winner = ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129795 = ::x10aux::makeStringLit("--"); strLit__129795; })), key);
            
            //#line 622 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if ((::x10aux::struct_equals(::x10aux::nullCheck(this->FMGL(keyMap))->getOrElse(
                                           winner, ::x10::util::Option::FMGL(BAD__get)()),
                                         ::x10::util::Option::FMGL(BAD__get)())))
            {
                isValid = false;
            }
            
        }
        
    }
    
    //#line 625 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    if (isValid) {
        return ::x10aux::nullCheck(this->FMGL(properties))->getOrElse(
                 winner, ::x10::lang::Rail< ::x10::lang::String* >::_make(((x10_long)0ll)));
        
    } else {
        
        //#line 627 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        ::x10::lang::Fun_0_2< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>*, x10_int>::__apply(::x10aux::nullCheck(this->FMGL(onUnknownKey)), 
          key, this->FMGL(keyMap));
        
        //#line 628 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return ::x10aux::class_cast_unchecked< ::x10::lang::Rail< ::x10::lang::String* >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL));
        
    }
    
}

//#line 635 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
::x10::lang::Rail< ::x10::lang::String* >* x10::util::OptionsParser::getOrElse(
  ::x10::lang::String* key, ::x10::lang::Rail< ::x10::lang::String* >* orElse) {
    
    //#line 637 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::lang::Rail< ::x10::lang::String* >* found = this->x10::util::OptionsParser::get(
                                                         key);
    
    //#line 638 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    return ((::x10aux::struct_equals(found, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))) ||
    (::x10aux::struct_equals((x10_long)(::x10aux::nullCheck(found)->FMGL(size)),
                             ((x10_long)0ll)))) ? (orElse)
      : (found);
    
}

//#line 647 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
::x10::lang::Any* x10::util::OptionsParser::howManyValues(
  ::x10::lang::String* key) {
    
    //#line 648 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::lang::Rail< ::x10::lang::String* >* values = this->x10::util::OptionsParser::get(
                                                          key);
    
    //#line 649 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    return (::x10aux::struct_equals(values, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)))
      ? ((::x10aux::class_cast_unchecked< ::x10::lang::Any*>(((x10_long)-1ll))))
      : ((::x10aux::class_cast_unchecked< ::x10::lang::Any*>(((x10_int) ((x10_long)(::x10aux::nullCheck(values)->FMGL(size)))))));
    
}

//#line 657 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
x10_boolean x10::util::OptionsParser::__apply(::x10::lang::String* key) {
    
    //#line 658 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    if ((::x10aux::struct_equals((key)->charAt(((x10_int)0)),
                                 ((x10_char)'-')))) {
        
        //#line 659 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if ((::x10aux::struct_equals(::x10aux::nullCheck(this->FMGL(keyMap))->getOrElse(
                                       key, ::x10::util::Option::FMGL(BAD__get)()),
                                     ::x10::util::Option::FMGL(BAD__get)())))
        {
            return false;
            
        } else {
            
            //#line 660 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            return ::x10aux::nullCheck(this->FMGL(properties))->containsKey(
                     key);
            
        }
        
    } else {
        
        //#line 663 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        ::x10::lang::String* winner = ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129805 = ::x10aux::makeStringLit("-"); strLit__129805; })), key);
        
        //#line 664 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        if ((::x10aux::struct_equals(::x10aux::nullCheck(this->FMGL(keyMap))->getOrElse(
                                       winner, ::x10::util::Option::FMGL(BAD__get)()),
                                     ::x10::util::Option::FMGL(BAD__get)())))
        {
            
            //#line 665 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            winner = ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129808 = ::x10aux::makeStringLit("--"); strLit__129808; })), key);
            
            //#line 666 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if ((::x10aux::struct_equals(::x10aux::nullCheck(this->FMGL(keyMap))->getOrElse(
                                           winner, ::x10::util::Option::FMGL(BAD__get)()),
                                         ::x10::util::Option::FMGL(BAD__get)())))
            {
                return false;
                
            }
            
        }
        
        //#line 668 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return ::x10aux::nullCheck(this->FMGL(properties))->containsKey(
                 winner);
        
    }
    
}

//#line 682 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
::x10::lang::String* x10::util::OptionsParser::__apply(::x10::lang::String* key,
                                                       ::x10::lang::String* d) {
    
    //#line 683 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::lang::Rail< ::x10::lang::String* >* raw = this->x10::util::OptionsParser::get(
                                                       key);
    
    //#line 684 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    if (((::x10aux::struct_equals(raw, reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))) ||
        (::x10aux::struct_equals((x10_long)(::x10aux::nullCheck(raw)->FMGL(size)),
                                 ((x10_long)0ll))))) {
        return d;
        
    } else 
    //#line 685 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    if ((::x10aux::struct_equals((x10_long)(::x10aux::nullCheck(raw)->FMGL(size)),
                                 ((x10_long)1ll)))) {
        return ::x10aux::nullCheck(raw)->x10::lang::Rail< ::x10::lang::String* >::__apply(
                 ((x10_long)0ll));
        
    } else {
        
        //#line 686 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return ::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*>::__apply(::x10aux::nullCheck(this->FMGL(onMoreThanOne)), 
          key, d, raw);
        
    }
    
}

//#line 698 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
x10_byte x10::util::OptionsParser::__apply(::x10::lang::String* key,
                                           x10_byte d) {
    
    //#line 699 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::lang::String* v = this->x10::util::OptionsParser::__apply(
                               key, (__extension__ ({ static ::x10::lang::String* strLit__129816 = ::x10aux::makeStringLit(""); strLit__129816; })));
    
    //#line 700 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    if ((::x10aux::struct_equals(::x10aux::nullCheck(v)->x10::lang::String::length(),
                                 ((x10_int)0)))) {
        return d;
        
    }
    
    //#line 701 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    try {
        return ::x10::util::StringUtil::parseByte(v);
        
    }
    catch (::x10::lang::CheckedThrowable* __exc2814) {
        if (::x10aux::instanceof< ::x10::lang::NumberFormatException*>(__exc2814)) {
            ::x10::lang::NumberFormatException* e = static_cast< ::x10::lang::NumberFormatException*>(__exc2814);
            {
                
                //#line 703 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                ::x10aux::throwException(::x10aux::nullCheck(::x10::util::OptionsParser__Err::_make(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129817 = ::x10aux::makeStringLit("Expected a byte, got: \""); strLit__129817; })), v), (__extension__ ({ static ::x10::lang::String* strLit__129818 = ::x10aux::makeStringLit("\""); strLit__129818; }))))));
            }
        } else
        throw;
    }
}

//#line 716 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
x10_short x10::util::OptionsParser::__apply(::x10::lang::String* key,
                                            x10_short d) {
    
    //#line 717 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::lang::String* v = this->x10::util::OptionsParser::__apply(
                               key, (__extension__ ({ static ::x10::lang::String* strLit__129819 = ::x10aux::makeStringLit(""); strLit__129819; })));
    
    //#line 718 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    if ((::x10aux::struct_equals(::x10aux::nullCheck(v)->x10::lang::String::length(),
                                 ((x10_int)0)))) {
        return d;
        
    }
    
    //#line 719 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    try {
        return ::x10::util::StringUtil::parseShort(v);
        
    }
    catch (::x10::lang::CheckedThrowable* __exc2816) {
        if (::x10aux::instanceof< ::x10::lang::NumberFormatException*>(__exc2816)) {
            ::x10::lang::NumberFormatException* e = static_cast< ::x10::lang::NumberFormatException*>(__exc2816);
            {
                
                //#line 721 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                ::x10aux::throwException(::x10aux::nullCheck(::x10::util::OptionsParser__Err::_make(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129820 = ::x10aux::makeStringLit("Expected a Short, got: \""); strLit__129820; })), v), (__extension__ ({ static ::x10::lang::String* strLit__129821 = ::x10aux::makeStringLit("\""); strLit__129821; }))))));
            }
        } else
        throw;
    }
}

//#line 734 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
x10_int x10::util::OptionsParser::__apply(::x10::lang::String* key,
                                          x10_int d) {
    
    //#line 735 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::lang::String* v = this->x10::util::OptionsParser::__apply(
                               key, (__extension__ ({ static ::x10::lang::String* strLit__129822 = ::x10aux::makeStringLit(""); strLit__129822; })));
    
    //#line 736 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    if ((::x10aux::struct_equals(::x10aux::nullCheck(v)->x10::lang::String::length(),
                                 ((x10_int)0)))) {
        return d;
        
    }
    
    //#line 737 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    try {
        return ::x10::util::StringUtil::parseInt(v);
        
    }
    catch (::x10::lang::CheckedThrowable* __exc2818) {
        if (::x10aux::instanceof< ::x10::lang::NumberFormatException*>(__exc2818)) {
            ::x10::lang::NumberFormatException* e = static_cast< ::x10::lang::NumberFormatException*>(__exc2818);
            {
                
                //#line 739 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                ::x10aux::throwException(::x10aux::nullCheck(::x10::util::OptionsParser__Err::_make(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129823 = ::x10aux::makeStringLit("Expected an Int, got: \""); strLit__129823; })), v), (__extension__ ({ static ::x10::lang::String* strLit__129824 = ::x10aux::makeStringLit("\""); strLit__129824; }))))));
            }
        } else
        throw;
    }
}

//#line 752 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
x10_long x10::util::OptionsParser::__apply(::x10::lang::String* key,
                                           x10_long d) {
    
    //#line 753 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::lang::String* v = this->x10::util::OptionsParser::__apply(
                               key, (__extension__ ({ static ::x10::lang::String* strLit__129825 = ::x10aux::makeStringLit(""); strLit__129825; })));
    
    //#line 754 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    if ((::x10aux::struct_equals(::x10aux::nullCheck(v)->x10::lang::String::length(),
                                 ((x10_int)0)))) {
        return d;
        
    }
    
    //#line 755 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    try {
        return ::x10::util::StringUtil::parseLong(v);
        
    }
    catch (::x10::lang::CheckedThrowable* __exc2820) {
        if (::x10aux::instanceof< ::x10::lang::NumberFormatException*>(__exc2820)) {
            ::x10::lang::NumberFormatException* e = static_cast< ::x10::lang::NumberFormatException*>(__exc2820);
            {
                
                //#line 757 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                ::x10aux::throwException(::x10aux::nullCheck(::x10::util::OptionsParser__Err::_make(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129826 = ::x10aux::makeStringLit("Expected a Long, got: \""); strLit__129826; })), v), (__extension__ ({ static ::x10::lang::String* strLit__129827 = ::x10aux::makeStringLit("\""); strLit__129827; }))))));
            }
        } else
        throw;
    }
}

//#line 770 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
x10_ubyte x10::util::OptionsParser::__apply(::x10::lang::String* key,
                                            x10_ubyte d) {
    
    //#line 771 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::lang::String* v = this->x10::util::OptionsParser::__apply(
                               key, (__extension__ ({ static ::x10::lang::String* strLit__129828 = ::x10aux::makeStringLit(""); strLit__129828; })));
    
    //#line 772 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    if ((::x10aux::struct_equals(::x10aux::nullCheck(v)->x10::lang::String::length(),
                                 ((x10_int)0)))) {
        return d;
        
    }
    
    //#line 773 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    try {
        return ::x10::util::StringUtil::parseUByte(v);
        
    }
    catch (::x10::lang::CheckedThrowable* __exc2822) {
        if (::x10aux::instanceof< ::x10::lang::NumberFormatException*>(__exc2822)) {
            ::x10::lang::NumberFormatException* e = static_cast< ::x10::lang::NumberFormatException*>(__exc2822);
            {
                
                //#line 775 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                ::x10aux::throwException(::x10aux::nullCheck(::x10::util::OptionsParser__Err::_make(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129829 = ::x10aux::makeStringLit("Expected a UByte, got: \""); strLit__129829; })), v), (__extension__ ({ static ::x10::lang::String* strLit__129830 = ::x10aux::makeStringLit("\""); strLit__129830; }))))));
            }
        } else
        throw;
    }
}

//#line 788 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
x10_ushort x10::util::OptionsParser::__apply(::x10::lang::String* key,
                                             x10_ushort d) {
    
    //#line 789 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::lang::String* v = this->x10::util::OptionsParser::__apply(
                               key, (__extension__ ({ static ::x10::lang::String* strLit__129831 = ::x10aux::makeStringLit(""); strLit__129831; })));
    
    //#line 790 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    if ((::x10aux::struct_equals(::x10aux::nullCheck(v)->x10::lang::String::length(),
                                 ((x10_int)0)))) {
        return d;
        
    }
    
    //#line 791 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    try {
        return ::x10::util::StringUtil::parseUShort(v);
        
    }
    catch (::x10::lang::CheckedThrowable* __exc2824) {
        if (::x10aux::instanceof< ::x10::lang::NumberFormatException*>(__exc2824)) {
            ::x10::lang::NumberFormatException* e = static_cast< ::x10::lang::NumberFormatException*>(__exc2824);
            {
                
                //#line 793 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                ::x10aux::throwException(::x10aux::nullCheck(::x10::util::OptionsParser__Err::_make(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129832 = ::x10aux::makeStringLit("Expected a UShort, got: \""); strLit__129832; })), v), (__extension__ ({ static ::x10::lang::String* strLit__129833 = ::x10aux::makeStringLit("\""); strLit__129833; }))))));
            }
        } else
        throw;
    }
}

//#line 806 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
x10_uint x10::util::OptionsParser::__apply(::x10::lang::String* key,
                                           x10_uint d) {
    
    //#line 807 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::lang::String* v = this->x10::util::OptionsParser::__apply(
                               key, (__extension__ ({ static ::x10::lang::String* strLit__129834 = ::x10aux::makeStringLit(""); strLit__129834; })));
    
    //#line 808 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    if ((::x10aux::struct_equals(::x10aux::nullCheck(v)->x10::lang::String::length(),
                                 ((x10_int)0)))) {
        return d;
        
    }
    
    //#line 809 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    try {
        return ::x10::util::StringUtil::parseUInt(v);
        
    }
    catch (::x10::lang::CheckedThrowable* __exc2826) {
        if (::x10aux::instanceof< ::x10::lang::NumberFormatException*>(__exc2826)) {
            ::x10::lang::NumberFormatException* e = static_cast< ::x10::lang::NumberFormatException*>(__exc2826);
            {
                
                //#line 811 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                ::x10aux::throwException(::x10aux::nullCheck(::x10::util::OptionsParser__Err::_make(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129835 = ::x10aux::makeStringLit("Expected a UInt, got: \""); strLit__129835; })), v), (__extension__ ({ static ::x10::lang::String* strLit__129836 = ::x10aux::makeStringLit("\""); strLit__129836; }))))));
            }
        } else
        throw;
    }
}

//#line 824 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
x10_ulong x10::util::OptionsParser::__apply(::x10::lang::String* key,
                                            x10_ulong d) {
    
    //#line 825 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::lang::String* v = this->x10::util::OptionsParser::__apply(
                               key, (__extension__ ({ static ::x10::lang::String* strLit__129837 = ::x10aux::makeStringLit(""); strLit__129837; })));
    
    //#line 826 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    if ((::x10aux::struct_equals(::x10aux::nullCheck(v)->x10::lang::String::length(),
                                 ((x10_int)0)))) {
        return d;
        
    }
    
    //#line 827 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    try {
        return ::x10::util::StringUtil::parseULong(v);
        
    }
    catch (::x10::lang::CheckedThrowable* __exc2828) {
        if (::x10aux::instanceof< ::x10::lang::NumberFormatException*>(__exc2828)) {
            ::x10::lang::NumberFormatException* e = static_cast< ::x10::lang::NumberFormatException*>(__exc2828);
            {
                
                //#line 829 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                ::x10aux::throwException(::x10aux::nullCheck(::x10::util::OptionsParser__Err::_make(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129838 = ::x10aux::makeStringLit("Expected a ULong, got: \""); strLit__129838; })), v), (__extension__ ({ static ::x10::lang::String* strLit__129839 = ::x10aux::makeStringLit("\""); strLit__129839; }))))));
            }
        } else
        throw;
    }
}

//#line 842 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
x10_double x10::util::OptionsParser::__apply(::x10::lang::String* key,
                                             x10_double d) {
    
    //#line 843 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::lang::String* v = this->x10::util::OptionsParser::__apply(
                               key, (__extension__ ({ static ::x10::lang::String* strLit__129840 = ::x10aux::makeStringLit(""); strLit__129840; })));
    
    //#line 845 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    if ((::x10aux::struct_equals(::x10aux::nullCheck(v)->x10::lang::String::length(),
                                 ((x10_int)0)))) {
        return d;
        
    }
    
    //#line 846 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    try {
        return ::x10::lang::DoubleNatives::parseDouble(v);
        
    }
    catch (::x10::lang::CheckedThrowable* __exc2830) {
        if (::x10aux::instanceof< ::x10::lang::NumberFormatException*>(__exc2830)) {
            ::x10::lang::NumberFormatException* e = static_cast< ::x10::lang::NumberFormatException*>(__exc2830);
            {
                
                //#line 848 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                ::x10aux::throwException(::x10aux::nullCheck(::x10::util::OptionsParser__Err::_make(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129841 = ::x10aux::makeStringLit("Expected a Double, got: \""); strLit__129841; })), v), (__extension__ ({ static ::x10::lang::String* strLit__129842 = ::x10aux::makeStringLit("\""); strLit__129842; }))))));
            }
        } else
        throw;
    }
}

//#line 861 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
x10_float x10::util::OptionsParser::__apply(::x10::lang::String* key,
                                            x10_float d) {
    
    //#line 862 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::lang::String* v = this->x10::util::OptionsParser::__apply(
                               key, (__extension__ ({ static ::x10::lang::String* strLit__129843 = ::x10aux::makeStringLit(""); strLit__129843; })));
    
    //#line 863 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    if ((::x10aux::struct_equals(::x10aux::nullCheck(v)->x10::lang::String::length(),
                                 ((x10_int)0)))) {
        return d;
        
    }
    
    //#line 864 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    try {
        return ::x10::lang::FloatNatives::parseFloat(v);
        
    }
    catch (::x10::lang::CheckedThrowable* __exc2832) {
        if (::x10aux::instanceof< ::x10::lang::NumberFormatException*>(__exc2832)) {
            ::x10::lang::NumberFormatException* e = static_cast< ::x10::lang::NumberFormatException*>(__exc2832);
            {
                
                //#line 866 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                ::x10aux::throwException(::x10aux::nullCheck(::x10::util::OptionsParser__Err::_make(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129844 = ::x10aux::makeStringLit("Expected a Float, got: \""); strLit__129844; })), v), (__extension__ ({ static ::x10::lang::String* strLit__129845 = ::x10aux::makeStringLit("\""); strLit__129845; }))))));
            }
        } else
        throw;
    }
}

//#line 890 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
x10_boolean x10::util::OptionsParser::__apply(::x10::lang::String* key,
                                              x10_boolean d) {
    
    //#line 891 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::lang::String* v = this->x10::util::OptionsParser::__apply(
                               key, (__extension__ ({ static ::x10::lang::String* strLit__129846 = ::x10aux::makeStringLit(""); strLit__129846; })));
    
    //#line 892 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    return (::x10aux::struct_equals(::x10aux::nullCheck(v)->x10::lang::String::length(),
                                    ((x10_int)0))) ? (d) : (::x10::util::StringUtil::checkBoolean(
                                                              v));
    
}

//#line 900 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
::x10::lang::String* x10::util::OptionsParser::usage(::x10::lang::String* leader) {
    
    //#line 901 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::util::StringBuilder* details =  (new (::x10aux::alloc_z< ::x10::util::StringBuilder>()) ::x10::util::StringBuilder());
    (details)->::x10::util::StringBuilder::_constructor();
    
    //#line 902 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    details->add(leader);
    
    //#line 903 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::lang::Rail< ::x10::util::Option >* rail__121788 =
      this->FMGL(options);
    x10_long i__120389max__121789 = (x10_long)(::x10aux::nullCheck(rail__121788)->FMGL(size));
    {
        x10_long i__121790;
        for (i__121790 = ((x10_long)0ll); ((i__121790) < (i__120389max__121789));
             i__121790 = ((i__121790) + (((x10_long)1ll))))
        {
            x10_long n__121791 = i__121790;
            
            //#line 904 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            details->add((__extension__ ({ static ::x10::lang::String* strLit__129849 = ::x10aux::makeStringLit("   "); strLit__129849; })));
            
            //#line 905 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            details->add(::x10aux::nullCheck(this->FMGL(options))->x10::lang::Rail< ::x10::util::Option >::__apply(
                           n__121791)->x10::util::Option::usage());
            
            //#line 906 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            details->add((__extension__ ({ static ::x10::lang::String* strLit__129853 = ::x10aux::makeStringLit("\n"); strLit__129853; })));
        }
    }
    
    //#line 908 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    details->add((__extension__ ({ static ::x10::lang::String* strLit__129855 = ::x10aux::makeStringLit("\n"); strLit__129855; })));
    
    //#line 909 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    return details->result();
    
}

//#line 911 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
::x10::util::Option x10::util::OptionsParser::FMGL(HELP);
void x10::util::OptionsParser::FMGL(HELP__do_init)() {
    FMGL(HELP__status) = ::x10aux::StaticInitController::INITIALIZING;
    _SI_("Doing static initialization for field: x10::util::OptionsParser.HELP");
    ::x10::util::Option __var2835__ = ::x10::util::Option::FMGL(HELP__get)();
    FMGL(HELP) = __var2835__;
    FMGL(HELP__status) = ::x10aux::StaticInitController::INITIALIZED;
}
void x10::util::OptionsParser::FMGL(HELP__init)() {
    ::x10aux::StaticInitController::initField(&FMGL(HELP__status), &FMGL(HELP__do_init), &FMGL(HELP__exception), "x10::util::OptionsParser.HELP");
    
}
volatile ::x10aux::StaticInitController::status x10::util::OptionsParser::FMGL(HELP__status);
::x10::lang::CheckedThrowable* x10::util::OptionsParser::FMGL(HELP__exception);

//#line 912 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
void x10::util::OptionsParser::showHELP() {
    
    //#line 913 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::io::Console::FMGL(ERR__get)()->x10::io::Printer::println(
      reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129856 = ::x10aux::makeStringLit("Use "); strLit__129856; })), ::x10::util::OptionsParser::FMGL(HELP__get)()->FMGL(shortForm)), (__extension__ ({ static ::x10::lang::String* strLit__129857 = ::x10aux::makeStringLit(" or "); strLit__129857; }))), ::x10::util::OptionsParser::FMGL(HELP__get)()->FMGL(longForm)), (__extension__ ({ static ::x10::lang::String* strLit__129858 = ::x10aux::makeStringLit(" to see the correct usage."); strLit__129858; })))));
}

//#line 923 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
x10_boolean x10::util::OptionsParser::wantsUsageOnly(::x10::lang::String* leader) {
    
    //#line 924 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    if ((this->x10::util::OptionsParser::__apply(::x10::util::OptionsParser::FMGL(HELP__get)()->FMGL(shortForm)) ||
        this->x10::util::OptionsParser::__apply(::x10::util::OptionsParser::FMGL(HELP__get)()->FMGL(longForm))))
    {
        
        //#line 925 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        ::x10::io::Console::FMGL(ERR__get)()->print(this->usage(
                                                      leader));
        
        //#line 926 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return true;
        
    } else {
        
        //#line 928 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        return false;
        
    }
    
}

//#line 936 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
::x10::lang::Rail< ::x10::lang::String* >* x10::util::OptionsParser::filteredArgs(
  ) {
    
    //#line 937 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::util::RailBuilder< ::x10::lang::String*>* builder =
       (new (::x10aux::alloc_z< ::x10::util::RailBuilder< ::x10::lang::String*> >()) ::x10::util::RailBuilder< ::x10::lang::String*>());
    (builder)->::x10::util::RailBuilder< ::x10::lang::String*>::_constructor();
    
    //#line 938 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::lang::Rail< ::x10::util::Option >* rail__121793 =
      this->FMGL(options);
    x10_long size__121794 = (x10_long)(::x10aux::nullCheck(rail__121793)->FMGL(size));
    {
        x10_long idx__121795;
        for (idx__121795 = ((x10_long)0ll); ((idx__121795) < (size__121794));
             idx__121795 = ((idx__121795) + (((x10_long)1ll))))
        {
            ::x10::util::Option o__121796 = ::x10aux::nullCheck(rail__121793)->x10::lang::Rail< ::x10::util::Option >::__apply(
                                              idx__121795);
            
            //#line 939 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
            if (o__121796->FMGL(onTheFly)) {
                
                //#line 940 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                ::x10::lang::String* key__121792 = ((((x10_long)(::x10aux::nullCheck(o__121796->FMGL(shortForm))->x10::lang::String::length()))) > (((x10_long)0ll)))
                  ? (o__121796->FMGL(shortForm)) : (o__121796->FMGL(longForm));
                
                //#line 941 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
                reinterpret_cast< ::x10::util::RailBuilder< ::x10::lang::String*>*>(builder->add(
                                                                                      key__121792));
            }
            
        }
    }
    
    //#line 944 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    return builder->result();
    
}

//#line 951 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
x10_boolean x10::util::OptionsParser::hasUnexpectedArgs(x10_boolean show) {
    
    //#line 952 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::lang::Rail< ::x10::lang::String* >* badArgs = this->filteredArgs();
    
    //#line 953 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    x10_boolean rc = (((x10_long)(::x10aux::nullCheck(badArgs)->FMGL(size))) > (((x10_long)0ll)));
    
    //#line 954 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    if ((rc && show)) {
        
        //#line 955 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        ::x10::lang::String* badArgsString = (__extension__ ({
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/StringUtil.x10"
            ::x10::lang::Rail< ::x10::lang::String* >* a__121730 =
              badArgs;
            ::x10::util::StringUtil::formatArray< ::x10::lang::String* >(
              a__121730, (__extension__ ({ static ::x10::lang::String* strLit__129861 = ::x10aux::makeStringLit(", "); strLit__129861; })),
              (__extension__ ({ static ::x10::lang::String* strLit__129862 = ::x10aux::makeStringLit("    "); strLit__129862; })),
              ((x10_int)80));
        }))
        ;
        
        //#line 956 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        ::x10::io::Console::FMGL(ERR__get)()->x10::io::Printer::println(
          reinterpret_cast< ::x10::lang::Any*>(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__129863 = ::x10aux::makeStringLit("Unexpected arguments:\n\t"); strLit__129863; })), badArgsString), (__extension__ ({ static ::x10::lang::String* strLit__129864 = ::x10aux::makeStringLit("\n"); strLit__129864; })))));
        
        //#line 957 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
        this->showHELP();
    }
    
    //#line 959 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    return rc;
    
}

//#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
::x10::util::OptionsParser* x10::util::OptionsParser::x10__util__OptionsParser____this__x10__util__OptionsParser(
  ) {
    return this;
    
}
void x10::util::OptionsParser::__fieldInitializers_x10_util_OptionsParser(
  ) {
    this->FMGL(onTooFew) = reinterpret_cast< ::x10::lang::Fun_0_3< ::x10::lang::String*, x10_int, x10_int, ::x10::lang::Rail< ::x10::lang::String* >*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_3< ::x10::lang::String*, x10_int, x10_int, ::x10::lang::Rail< ::x10::lang::String* >*> >(sizeof(x10_util_OptionsParser__closure__8)))x10_util_OptionsParser__closure__8()));
    this->FMGL(onTooMany) = reinterpret_cast< ::x10::lang::Fun_0_3< ::x10::lang::String*, x10_int, x10_int, x10_int>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_3< ::x10::lang::String*, x10_int, x10_int, x10_int> >(sizeof(x10_util_OptionsParser__closure__9)))x10_util_OptionsParser__closure__9()));
    this->FMGL(onDuplicate) = reinterpret_cast< ::x10::lang::VoidFun_0_5< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*>*, ::x10::lang::Rail< ::x10::lang::String* >*, x10_int, x10_int>*>((new (::x10aux::alloc< ::x10::lang::VoidFun_0_5< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*>*, ::x10::lang::Rail< ::x10::lang::String* >*, x10_int, x10_int> >(sizeof(x10_util_OptionsParser__closure__10)))x10_util_OptionsParser__closure__10()));
    this->FMGL(onMoreThanOne) = reinterpret_cast< ::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*> >(sizeof(x10_util_OptionsParser__closure__12)))x10_util_OptionsParser__closure__12()));
    this->FMGL(onUnknownKey) = reinterpret_cast< ::x10::lang::Fun_0_2< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>*, x10_int>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_2< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>*, x10_int> >(sizeof(x10_util_OptionsParser__closure__13)))x10_util_OptionsParser__closure__13()));
    this->FMGL(options) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< ::x10::util::Option >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(keyMap) = (::x10aux::class_cast_unchecked< ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(args) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< ::x10::lang::String* >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(properties) = (::x10aux::class_cast_unchecked< ::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(tailStart) = ((x10_int)-1);
    this->FMGL(required) = (::x10aux::class_cast_unchecked< ::x10::util::HashSet< ::x10::util::Option>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
    this->FMGL(oneCharFlags) = (::x10aux::class_cast_unchecked< ::x10::util::HashSet< ::x10::lang::String*>*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
const ::x10aux::serialization_id_t x10::util::OptionsParser::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::OptionsParser::_deserializer);

void x10::util::OptionsParser::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(onTooFew));
    buf.write(this->FMGL(onTooMany));
    buf.write(this->FMGL(onDuplicate));
    buf.write(this->FMGL(onMoreThanOne));
    buf.write(this->FMGL(onUnknownKey));
    buf.write(this->FMGL(options));
    buf.write(this->FMGL(keyMap));
    buf.write(this->FMGL(args));
    buf.write(this->FMGL(properties));
    buf.write(this->FMGL(tailStart));
    buf.write(this->FMGL(required));
    buf.write(this->FMGL(oneCharFlags));
    
}

::x10::lang::Reference* ::x10::util::OptionsParser::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::OptionsParser* this_ = new (::x10aux::alloc_z< ::x10::util::OptionsParser>()) ::x10::util::OptionsParser();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::util::OptionsParser::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(onTooFew) = buf.read< ::x10::lang::Fun_0_3< ::x10::lang::String*, x10_int, x10_int, ::x10::lang::Rail< ::x10::lang::String* >*>*>();
    FMGL(onTooMany) = buf.read< ::x10::lang::Fun_0_3< ::x10::lang::String*, x10_int, x10_int, x10_int>*>();
    FMGL(onDuplicate) = buf.read< ::x10::lang::VoidFun_0_5< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*>*, ::x10::lang::Rail< ::x10::lang::String* >*, x10_int, x10_int>*>();
    FMGL(onMoreThanOne) = buf.read< ::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*>*>();
    FMGL(onUnknownKey) = buf.read< ::x10::lang::Fun_0_2< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>*, x10_int>*>();
    FMGL(options) = buf.read< ::x10::lang::Rail< ::x10::util::Option >*>();
    FMGL(keyMap) = buf.read< ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>*>();
    FMGL(args) = buf.read< ::x10::lang::Rail< ::x10::lang::String* >*>();
    FMGL(properties) = buf.read< ::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*>*>();
    FMGL(tailStart) = buf.read<x10_int>();
    FMGL(required) = buf.read< ::x10::util::HashSet< ::x10::util::Option>*>();
    FMGL(oneCharFlags) = buf.read< ::x10::util::HashSet< ::x10::lang::String*>*>();
    
}

::x10aux::RuntimeType x10::util::OptionsParser::rtt;
void x10::util::OptionsParser::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.util.OptionsParser",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*>::itable<x10_util_OptionsParser__closure__1>x10_util_OptionsParser__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_OptionsParser__closure__1::__apply, &x10_util_OptionsParser__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_util_OptionsParser__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*> >, &x10_util_OptionsParser__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_util_OptionsParser__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_OptionsParser__closure__1::_deserialize);

::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*>::itable<x10_util_OptionsParser__closure__2>x10_util_OptionsParser__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_OptionsParser__closure__2::__apply, &x10_util_OptionsParser__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_util_OptionsParser__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*> >, &x10_util_OptionsParser__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_util_OptionsParser__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_OptionsParser__closure__2::_deserialize);

::x10::lang::Fun_0_2< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>*, x10_int>::itable<x10_util_OptionsParser__closure__3>x10_util_OptionsParser__closure__3::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_OptionsParser__closure__3::__apply, &x10_util_OptionsParser__closure__3::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_util_OptionsParser__closure__3::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_2< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>*, x10_int> >, &x10_util_OptionsParser__closure__3::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_util_OptionsParser__closure__3::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_OptionsParser__closure__3::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_int>::itable<x10_util_OptionsParser__closure__4>x10_util_OptionsParser__closure__4::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_OptionsParser__closure__4::__apply, &x10_util_OptionsParser__closure__4::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_util_OptionsParser__closure__4::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_int> >, &x10_util_OptionsParser__closure__4::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_util_OptionsParser__closure__4::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_OptionsParser__closure__4::_deserialize);

::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*>::itable<x10_util_OptionsParser__closure__5>x10_util_OptionsParser__closure__5::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_OptionsParser__closure__5::__apply, &x10_util_OptionsParser__closure__5::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_util_OptionsParser__closure__5::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*> >, &x10_util_OptionsParser__closure__5::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_util_OptionsParser__closure__5::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_OptionsParser__closure__5::_deserialize);

::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*>::itable<x10_util_OptionsParser__closure__6>x10_util_OptionsParser__closure__6::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_OptionsParser__closure__6::__apply, &x10_util_OptionsParser__closure__6::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_util_OptionsParser__closure__6::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*> >, &x10_util_OptionsParser__closure__6::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_util_OptionsParser__closure__6::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_OptionsParser__closure__6::_deserialize);

::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*>::itable<x10_util_OptionsParser__closure__7>x10_util_OptionsParser__closure__7::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_OptionsParser__closure__7::__apply, &x10_util_OptionsParser__closure__7::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_util_OptionsParser__closure__7::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*> >, &x10_util_OptionsParser__closure__7::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_util_OptionsParser__closure__7::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_OptionsParser__closure__7::_deserialize);

::x10::lang::Fun_0_3< ::x10::lang::String*, x10_int, x10_int, ::x10::lang::Rail< ::x10::lang::String* >*>::itable<x10_util_OptionsParser__closure__8>x10_util_OptionsParser__closure__8::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_OptionsParser__closure__8::__apply, &x10_util_OptionsParser__closure__8::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_util_OptionsParser__closure__8::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_3< ::x10::lang::String*, x10_int, x10_int, ::x10::lang::Rail< ::x10::lang::String* >*> >, &x10_util_OptionsParser__closure__8::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_util_OptionsParser__closure__8::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_OptionsParser__closure__8::_deserialize);

::x10::lang::Fun_0_3< ::x10::lang::String*, x10_int, x10_int, x10_int>::itable<x10_util_OptionsParser__closure__9>x10_util_OptionsParser__closure__9::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_OptionsParser__closure__9::__apply, &x10_util_OptionsParser__closure__9::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_util_OptionsParser__closure__9::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_3< ::x10::lang::String*, x10_int, x10_int, x10_int> >, &x10_util_OptionsParser__closure__9::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_util_OptionsParser__closure__9::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_OptionsParser__closure__9::_deserialize);

::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*>::itable<x10_util_OptionsParser__closure__11>x10_util_OptionsParser__closure__11::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_OptionsParser__closure__11::__apply, &x10_util_OptionsParser__closure__11::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_util_OptionsParser__closure__11::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, ::x10::lang::String*> >, &x10_util_OptionsParser__closure__11::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_util_OptionsParser__closure__11::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_OptionsParser__closure__11::_deserialize);

::x10::lang::VoidFun_0_5< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*>*, ::x10::lang::Rail< ::x10::lang::String* >*, x10_int, x10_int>::itable<x10_util_OptionsParser__closure__10>x10_util_OptionsParser__closure__10::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_OptionsParser__closure__10::__apply, &x10_util_OptionsParser__closure__10::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_util_OptionsParser__closure__10::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::VoidFun_0_5< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*>*, ::x10::lang::Rail< ::x10::lang::String* >*, x10_int, x10_int> >, &x10_util_OptionsParser__closure__10::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_util_OptionsParser__closure__10::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_OptionsParser__closure__10::_deserialize);

::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*>::itable<x10_util_OptionsParser__closure__12>x10_util_OptionsParser__closure__12::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_OptionsParser__closure__12::__apply, &x10_util_OptionsParser__closure__12::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_util_OptionsParser__closure__12::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_3< ::x10::lang::String*, ::x10::lang::String*, ::x10::lang::Rail< ::x10::lang::String* >*, ::x10::lang::String*> >, &x10_util_OptionsParser__closure__12::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_util_OptionsParser__closure__12::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_OptionsParser__closure__12::_deserialize);

::x10::lang::Fun_0_2< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>*, x10_int>::itable<x10_util_OptionsParser__closure__13>x10_util_OptionsParser__closure__13::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_util_OptionsParser__closure__13::__apply, &x10_util_OptionsParser__closure__13::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_util_OptionsParser__closure__13::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_2< ::x10::lang::String*, ::x10::util::HashMap< ::x10::lang::String*, ::x10::util::Option>*, x10_int> >, &x10_util_OptionsParser__closure__13::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_util_OptionsParser__closure__13::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_util_OptionsParser__closure__13::_deserialize);

/* END of OptionsParser */
/*************************************************/
/*************************************************/
/* START of OptionsParser$Err */
#include <x10/util/OptionsParser__Err.h>

#include <x10/lang/Exception.h>
#include <x10/lang/String.h>
#include <x10/compiler/Synthetic.h>

//#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
void x10::util::OptionsParser__Err::_constructor(::x10::lang::String* m) {
    (this)->::x10::lang::Exception::_constructor(m);
    
    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
    ::x10::util::OptionsParser__Err* this__121731 = this;
    
}
::x10::util::OptionsParser__Err* x10::util::OptionsParser__Err::_make(::x10::lang::String* m)
{
    ::x10::util::OptionsParser__Err* this_ = new (::x10aux::alloc_z< ::x10::util::OptionsParser__Err>()) ::x10::util::OptionsParser__Err();
    this_->_constructor(m);
    return this_;
}



//#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/OptionsParser.x10"
::x10::util::OptionsParser__Err* x10::util::OptionsParser__Err::x10__util__OptionsParser__Err____this__x10__util__OptionsParser__Err(
  ) {
    return this;
    
}
void x10::util::OptionsParser__Err::__fieldInitializers_x10_util_OptionsParser_Err(
  ) {
 
}
const ::x10aux::serialization_id_t x10::util::OptionsParser__Err::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::util::OptionsParser__Err::_deserializer);

void x10::util::OptionsParser__Err::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::lang::Exception::_serialize_body(buf);
    
}

::x10::lang::Reference* ::x10::util::OptionsParser__Err::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::util::OptionsParser__Err* this_ = new (::x10aux::alloc_z< ::x10::util::OptionsParser__Err>()) ::x10::util::OptionsParser__Err();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::util::OptionsParser__Err::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Exception::_deserialize_body(buf);
    
}

::x10aux::RuntimeType x10::util::OptionsParser__Err::rtt;
void x10::util::OptionsParser__Err::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::lang::Exception>()};
    rtt.initStageTwo("x10.util.OptionsParser.Err",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of OptionsParser$Err */
/*************************************************/
