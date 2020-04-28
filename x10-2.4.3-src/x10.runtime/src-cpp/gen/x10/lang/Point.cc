/*************************************************/
/* START of Point */
#include <x10/lang/Point.h>

#include <x10/lang/Fun_0_1.h>
#include <x10/util/Ordered.h>
#include <x10/lang/Comparable.h>
#include <x10/lang/Long.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/ArrayIndexOutOfBoundsException.h>
#include <x10/lang/String.h>
#include <x10/lang/Int.h>
#include <x10/lang/Any.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_LANG_POINT__CLOSURE__1_CLOSURE
#define X10_LANG_POINT__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_lang_Point__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return saved_this->x10::lang::Point::__apply(i);
        
    }
    
    // captured environment
    ::x10::lang::Point* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Point__closure__1* storage = ::x10aux::alloc_z<x10_lang_Point__closure__1>();
        buf.record_reference(storage);
        ::x10::lang::Point* that_saved_this = buf.read< ::x10::lang::Point*>();
        x10_lang_Point__closure__1* this_ = new (storage) x10_lang_Point__closure__1(that_saved_this);
        return this_;
    }
    
    x10_lang_Point__closure__1(::x10::lang::Point* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10:92";
    }

};

#endif // X10_LANG_POINT__CLOSURE__1_CLOSURE
#ifndef X10_LANG_POINT__CLOSURE__2_CLOSURE
#define X10_LANG_POINT__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_lang_Point__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i__103327) {
        return ((x10_long)(::x10aux::nullCheck(r)->x10::lang::Rail< x10_int >::__apply(
                             i__103327)));
        
    }
    
    // captured environment
    ::x10::lang::Rail< x10_int >* r;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->r);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Point__closure__2* storage = ::x10aux::alloc_z<x10_lang_Point__closure__2>();
        buf.record_reference(storage);
        ::x10::lang::Rail< x10_int >* that_r = buf.read< ::x10::lang::Rail< x10_int >*>();
        x10_lang_Point__closure__2* this_ = new (storage) x10_lang_Point__closure__2(that_r);
        return this_;
    }
    
    x10_lang_Point__closure__2(::x10::lang::Rail< x10_int >* r) : r(r) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10:107";
    }

};

#endif // X10_LANG_POINT__CLOSURE__2_CLOSURE
#ifndef X10_LANG_POINT__CLOSURE__3_CLOSURE
#define X10_LANG_POINT__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_lang_Point__closure__3 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__3> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long l) {
        return ::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(init), 
          l);
        
    }
    
    // captured environment
    ::x10::lang::Fun_0_1<x10_long, x10_long>* init;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->init);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Point__closure__3* storage = ::x10aux::alloc_z<x10_lang_Point__closure__3>();
        buf.record_reference(storage);
        ::x10::lang::Fun_0_1<x10_long, x10_long>* that_init = buf.read< ::x10::lang::Fun_0_1<x10_long, x10_long>*>();
        x10_lang_Point__closure__3* this_ = new (storage) x10_lang_Point__closure__3(that_init);
        return this_;
    }
    
    x10_lang_Point__closure__3(::x10::lang::Fun_0_1<x10_long, x10_long>* init) : init(init) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10:141";
    }

};

#endif // X10_LANG_POINT__CLOSURE__3_CLOSURE
#ifndef X10_LANG_POINT__CLOSURE__4_CLOSURE
#define X10_LANG_POINT__CLOSURE__4_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_lang_Point__closure__4 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__4> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return (-(saved_this->x10::lang::Point::__apply(i)));
        
    }
    
    // captured environment
    ::x10::lang::Point* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Point__closure__4* storage = ::x10aux::alloc_z<x10_lang_Point__closure__4>();
        buf.record_reference(storage);
        ::x10::lang::Point* that_saved_this = buf.read< ::x10::lang::Point*>();
        x10_lang_Point__closure__4* this_ = new (storage) x10_lang_Point__closure__4(that_saved_this);
        return this_;
    }
    
    x10_lang_Point__closure__4(::x10::lang::Point* saved_this) : saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10:179";
    }

};

#endif // X10_LANG_POINT__CLOSURE__4_CLOSURE
#ifndef X10_LANG_POINT__CLOSURE__5_CLOSURE
#define X10_LANG_POINT__CLOSURE__5_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_lang_Point__closure__5 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__5> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ((saved_this->x10::lang::Point::__apply(i)) + (::x10aux::nullCheck(that)->x10::lang::Point::__apply(
                                                                i)));
        
    }
    
    // captured environment
    ::x10::lang::Point* saved_this;
    ::x10::lang::Point* that;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->that);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Point__closure__5* storage = ::x10aux::alloc_z<x10_lang_Point__closure__5>();
        buf.record_reference(storage);
        ::x10::lang::Point* that_saved_this = buf.read< ::x10::lang::Point*>();
        ::x10::lang::Point* that_that = buf.read< ::x10::lang::Point*>();
        x10_lang_Point__closure__5* this_ = new (storage) x10_lang_Point__closure__5(that_saved_this, that_that);
        return this_;
    }
    
    x10_lang_Point__closure__5(::x10::lang::Point* saved_this, ::x10::lang::Point* that) : saved_this(saved_this), that(that) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10:185";
    }

};

#endif // X10_LANG_POINT__CLOSURE__5_CLOSURE
#ifndef X10_LANG_POINT__CLOSURE__6_CLOSURE
#define X10_LANG_POINT__CLOSURE__6_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_lang_Point__closure__6 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__6> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ((saved_this->x10::lang::Point::__apply(i)) - (::x10aux::nullCheck(that)->x10::lang::Point::__apply(
                                                                i)));
        
    }
    
    // captured environment
    ::x10::lang::Point* saved_this;
    ::x10::lang::Point* that;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->that);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Point__closure__6* storage = ::x10aux::alloc_z<x10_lang_Point__closure__6>();
        buf.record_reference(storage);
        ::x10::lang::Point* that_saved_this = buf.read< ::x10::lang::Point*>();
        ::x10::lang::Point* that_that = buf.read< ::x10::lang::Point*>();
        x10_lang_Point__closure__6* this_ = new (storage) x10_lang_Point__closure__6(that_saved_this, that_that);
        return this_;
    }
    
    x10_lang_Point__closure__6(::x10::lang::Point* saved_this, ::x10::lang::Point* that) : saved_this(saved_this), that(that) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10:192";
    }

};

#endif // X10_LANG_POINT__CLOSURE__6_CLOSURE
#ifndef X10_LANG_POINT__CLOSURE__7_CLOSURE
#define X10_LANG_POINT__CLOSURE__7_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_lang_Point__closure__7 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__7> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ((saved_this->x10::lang::Point::__apply(i)) * (::x10aux::nullCheck(that)->x10::lang::Point::__apply(
                                                                i)));
        
    }
    
    // captured environment
    ::x10::lang::Point* saved_this;
    ::x10::lang::Point* that;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->that);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Point__closure__7* storage = ::x10aux::alloc_z<x10_lang_Point__closure__7>();
        buf.record_reference(storage);
        ::x10::lang::Point* that_saved_this = buf.read< ::x10::lang::Point*>();
        ::x10::lang::Point* that_that = buf.read< ::x10::lang::Point*>();
        x10_lang_Point__closure__7* this_ = new (storage) x10_lang_Point__closure__7(that_saved_this, that_that);
        return this_;
    }
    
    x10_lang_Point__closure__7(::x10::lang::Point* saved_this, ::x10::lang::Point* that) : saved_this(saved_this), that(that) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10:198";
    }

};

#endif // X10_LANG_POINT__CLOSURE__7_CLOSURE
#ifndef X10_LANG_POINT__CLOSURE__8_CLOSURE
#define X10_LANG_POINT__CLOSURE__8_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_lang_Point__closure__8 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__8> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ((saved_this->x10::lang::Point::__apply(i)) / ::x10aux::zeroCheck(::x10aux::nullCheck(that)->x10::lang::Point::__apply(
                                                                                   i)));
        
    }
    
    // captured environment
    ::x10::lang::Point* saved_this;
    ::x10::lang::Point* that;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->that);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Point__closure__8* storage = ::x10aux::alloc_z<x10_lang_Point__closure__8>();
        buf.record_reference(storage);
        ::x10::lang::Point* that_saved_this = buf.read< ::x10::lang::Point*>();
        ::x10::lang::Point* that_that = buf.read< ::x10::lang::Point*>();
        x10_lang_Point__closure__8* this_ = new (storage) x10_lang_Point__closure__8(that_saved_this, that_that);
        return this_;
    }
    
    x10_lang_Point__closure__8(::x10::lang::Point* saved_this, ::x10::lang::Point* that) : saved_this(saved_this), that(that) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10:204";
    }

};

#endif // X10_LANG_POINT__CLOSURE__8_CLOSURE
#ifndef X10_LANG_POINT__CLOSURE__9_CLOSURE
#define X10_LANG_POINT__CLOSURE__9_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_lang_Point__closure__9 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__9> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ((saved_this->x10::lang::Point::__apply(i)) + (c));
        
    }
    
    // captured environment
    ::x10::lang::Point* saved_this;
    x10_long c;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->c);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Point__closure__9* storage = ::x10aux::alloc_z<x10_lang_Point__closure__9>();
        buf.record_reference(storage);
        ::x10::lang::Point* that_saved_this = buf.read< ::x10::lang::Point*>();
        x10_long that_c = buf.read<x10_long>();
        x10_lang_Point__closure__9* this_ = new (storage) x10_lang_Point__closure__9(that_saved_this, that_c);
        return this_;
    }
    
    x10_lang_Point__closure__9(::x10::lang::Point* saved_this, x10_long c) : saved_this(saved_this), c(c) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10:210";
    }

};

#endif // X10_LANG_POINT__CLOSURE__9_CLOSURE
#ifndef X10_LANG_POINT__CLOSURE__10_CLOSURE
#define X10_LANG_POINT__CLOSURE__10_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_lang_Point__closure__10 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__10> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ((saved_this->x10::lang::Point::__apply(i)) - (c));
        
    }
    
    // captured environment
    ::x10::lang::Point* saved_this;
    x10_long c;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->c);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Point__closure__10* storage = ::x10aux::alloc_z<x10_lang_Point__closure__10>();
        buf.record_reference(storage);
        ::x10::lang::Point* that_saved_this = buf.read< ::x10::lang::Point*>();
        x10_long that_c = buf.read<x10_long>();
        x10_lang_Point__closure__10* this_ = new (storage) x10_lang_Point__closure__10(that_saved_this, that_c);
        return this_;
    }
    
    x10_lang_Point__closure__10(::x10::lang::Point* saved_this, x10_long c) : saved_this(saved_this), c(c) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10:216";
    }

};

#endif // X10_LANG_POINT__CLOSURE__10_CLOSURE
#ifndef X10_LANG_POINT__CLOSURE__11_CLOSURE
#define X10_LANG_POINT__CLOSURE__11_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_lang_Point__closure__11 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__11> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ((saved_this->x10::lang::Point::__apply(i)) * (c));
        
    }
    
    // captured environment
    ::x10::lang::Point* saved_this;
    x10_long c;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->c);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Point__closure__11* storage = ::x10aux::alloc_z<x10_lang_Point__closure__11>();
        buf.record_reference(storage);
        ::x10::lang::Point* that_saved_this = buf.read< ::x10::lang::Point*>();
        x10_long that_c = buf.read<x10_long>();
        x10_lang_Point__closure__11* this_ = new (storage) x10_lang_Point__closure__11(that_saved_this, that_c);
        return this_;
    }
    
    x10_lang_Point__closure__11(::x10::lang::Point* saved_this, x10_long c) : saved_this(saved_this), c(c) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10:222";
    }

};

#endif // X10_LANG_POINT__CLOSURE__11_CLOSURE
#ifndef X10_LANG_POINT__CLOSURE__12_CLOSURE
#define X10_LANG_POINT__CLOSURE__12_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_lang_Point__closure__12 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__12> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ((saved_this->x10::lang::Point::__apply(i)) / ::x10aux::zeroCheck(c));
        
    }
    
    // captured environment
    ::x10::lang::Point* saved_this;
    x10_long c;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->c);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Point__closure__12* storage = ::x10aux::alloc_z<x10_lang_Point__closure__12>();
        buf.record_reference(storage);
        ::x10::lang::Point* that_saved_this = buf.read< ::x10::lang::Point*>();
        x10_long that_c = buf.read<x10_long>();
        x10_lang_Point__closure__12* this_ = new (storage) x10_lang_Point__closure__12(that_saved_this, that_c);
        return this_;
    }
    
    x10_lang_Point__closure__12(::x10::lang::Point* saved_this, x10_long c) : saved_this(saved_this), c(c) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10:228";
    }

};

#endif // X10_LANG_POINT__CLOSURE__12_CLOSURE
#ifndef X10_LANG_POINT__CLOSURE__13_CLOSURE
#define X10_LANG_POINT__CLOSURE__13_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_lang_Point__closure__13 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__13> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ((c) + (saved_this->x10::lang::Point::__apply(i)));
        
    }
    
    // captured environment
    x10_long c;
    ::x10::lang::Point* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->c);
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Point__closure__13* storage = ::x10aux::alloc_z<x10_lang_Point__closure__13>();
        buf.record_reference(storage);
        x10_long that_c = buf.read<x10_long>();
        ::x10::lang::Point* that_saved_this = buf.read< ::x10::lang::Point*>();
        x10_lang_Point__closure__13* this_ = new (storage) x10_lang_Point__closure__13(that_c, that_saved_this);
        return this_;
    }
    
    x10_lang_Point__closure__13(x10_long c, ::x10::lang::Point* saved_this) : c(c), saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10:234";
    }

};

#endif // X10_LANG_POINT__CLOSURE__13_CLOSURE
#ifndef X10_LANG_POINT__CLOSURE__14_CLOSURE
#define X10_LANG_POINT__CLOSURE__14_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_lang_Point__closure__14 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__14> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ((c) - (saved_this->x10::lang::Point::__apply(i)));
        
    }
    
    // captured environment
    x10_long c;
    ::x10::lang::Point* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->c);
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Point__closure__14* storage = ::x10aux::alloc_z<x10_lang_Point__closure__14>();
        buf.record_reference(storage);
        x10_long that_c = buf.read<x10_long>();
        ::x10::lang::Point* that_saved_this = buf.read< ::x10::lang::Point*>();
        x10_lang_Point__closure__14* this_ = new (storage) x10_lang_Point__closure__14(that_c, that_saved_this);
        return this_;
    }
    
    x10_lang_Point__closure__14(x10_long c, ::x10::lang::Point* saved_this) : c(c), saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10:240";
    }

};

#endif // X10_LANG_POINT__CLOSURE__14_CLOSURE
#ifndef X10_LANG_POINT__CLOSURE__15_CLOSURE
#define X10_LANG_POINT__CLOSURE__15_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_lang_Point__closure__15 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__15> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ((c) * (saved_this->x10::lang::Point::__apply(i)));
        
    }
    
    // captured environment
    x10_long c;
    ::x10::lang::Point* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->c);
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Point__closure__15* storage = ::x10aux::alloc_z<x10_lang_Point__closure__15>();
        buf.record_reference(storage);
        x10_long that_c = buf.read<x10_long>();
        ::x10::lang::Point* that_saved_this = buf.read< ::x10::lang::Point*>();
        x10_lang_Point__closure__15* this_ = new (storage) x10_lang_Point__closure__15(that_c, that_saved_this);
        return this_;
    }
    
    x10_lang_Point__closure__15(x10_long c, ::x10::lang::Point* saved_this) : c(c), saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10:246";
    }

};

#endif // X10_LANG_POINT__CLOSURE__15_CLOSURE
#ifndef X10_LANG_POINT__CLOSURE__16_CLOSURE
#define X10_LANG_POINT__CLOSURE__16_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_lang_Point__closure__16 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__16> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ((c) / ::x10aux::zeroCheck(saved_this->x10::lang::Point::__apply(
                                            i)));
        
    }
    
    // captured environment
    x10_long c;
    ::x10::lang::Point* saved_this;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->c);
        buf.write(this->saved_this);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_lang_Point__closure__16* storage = ::x10aux::alloc_z<x10_lang_Point__closure__16>();
        buf.record_reference(storage);
        x10_long that_c = buf.read<x10_long>();
        ::x10::lang::Point* that_saved_this = buf.read< ::x10::lang::Point*>();
        x10_lang_Point__closure__16* this_ = new (storage) x10_lang_Point__closure__16(that_c, that_saved_this);
        return this_;
    }
    
    x10_lang_Point__closure__16(x10_long c, ::x10::lang::Point* saved_this) : c(c), saved_this(saved_this) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10:252";
    }

};

#endif // X10_LANG_POINT__CLOSURE__16_CLOSURE

//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Fun_0_1<x10_long, x10_long>::itable< ::x10::lang::Point >  x10::lang::Point::_itable_0(&x10::lang::Point::equals, &x10::lang::Point::hashCode, &x10::lang::Point::__apply, &x10::lang::Point::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::lang::Point >  x10::lang::Point::_itable_1(&x10::lang::Point::equals, &x10::lang::Point::hashCode, &x10::lang::Point::toString, &::x10::lang::X10Class::typeName);
::x10::util::Ordered< ::x10::lang::Point* >::itable< ::x10::lang::Point >  x10::lang::Point::_itable_2(&x10::lang::Point::equals, &x10::lang::Point::hashCode, &x10::lang::Point::__lt, &x10::lang::Point::__le, &x10::lang::Point::__gt, &x10::lang::Point::__ge, &x10::lang::Point::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Comparable< ::x10::lang::Point* >::itable< ::x10::lang::Point >  x10::lang::Point::_itable_3(&x10::lang::Point::compareTo, &x10::lang::Point::equals, &x10::lang::Point::hashCode, &x10::lang::Point::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::lang::Point::_itables[5] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::util::Ordered< ::x10::lang::Point* > >, &_itable_2), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Comparable< ::x10::lang::Point* > >, &_itable_3), ::x10aux::itable_entry(NULL, (void*)"::x10::lang::Point")};

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"

//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"

//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"

//#line 31 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"

//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
void x10::lang::Point::_constructor(::x10::lang::Rail< x10_long >* coords) {
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    FMGL(rank) = (x10_long)(::x10aux::nullCheck(coords)->FMGL(size));
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    ::x10::lang::Point* this__103321 = this;
    
    //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    this->FMGL(c0) = ::x10aux::nullCheck(coords)->x10::lang::Rail< x10_long >::__apply(
                       ((x10_long)0ll));
    
    //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    this->FMGL(c1) = ((this->FMGL(rank)) > (((x10_long)1ll))) ? (::x10aux::nullCheck(coords)->x10::lang::Rail< x10_long >::__apply(
                                                                   ((x10_long)1ll)))
      : (((x10_long)0ll));
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    this->FMGL(c2) = ((this->FMGL(rank)) > (((x10_long)2ll)))
      ? (::x10aux::nullCheck(coords)->x10::lang::Rail< x10_long >::__apply(
           ((x10_long)2ll))) : (((x10_long)0ll));
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    this->FMGL(c3) = ((this->FMGL(rank)) > (((x10_long)3ll)))
      ? (::x10aux::nullCheck(coords)->x10::lang::Rail< x10_long >::__apply(
           ((x10_long)3ll))) : (((x10_long)0ll));
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    this->FMGL(cs) = ((this->FMGL(rank)) > (((x10_long)4ll)))
      ? (coords) : ((::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL))));
}
::x10::lang::Point* x10::lang::Point::_make(::x10::lang::Rail< x10_long >* coords)
{
    ::x10::lang::Point* this_ = new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point();
    this_->_constructor(coords);
    return this_;
}



//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
void x10::lang::Point::_constructor(x10_long i0) {
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    FMGL(rank) = ((x10_long)1ll);
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    ::x10::lang::Point* this__103322 = this;
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    this->FMGL(c0) = i0;
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    this->FMGL(c1) = this->FMGL(c2) = this->FMGL(c3) = ((x10_long)0ll);
    
    //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    this->FMGL(cs) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
::x10::lang::Point* x10::lang::Point::_make(x10_long i0) {
    ::x10::lang::Point* this_ = new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point();
    this_->_constructor(i0);
    return this_;
}



//#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
void x10::lang::Point::_constructor(x10_long i0, x10_long i1) {
    
    //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    FMGL(rank) = ((x10_long)2ll);
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    ::x10::lang::Point* this__103323 = this;
    
    //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    this->FMGL(c0) = i0;
    
    //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    this->FMGL(c1) = i1;
    
    //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    this->FMGL(c2) = this->FMGL(c3) = ((x10_long)0ll);
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    this->FMGL(cs) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
::x10::lang::Point* x10::lang::Point::_make(x10_long i0, x10_long i1)
{
    ::x10::lang::Point* this_ = new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point();
    this_->_constructor(i0, i1);
    return this_;
}



//#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
void x10::lang::Point::_constructor(x10_long i0, x10_long i1,
                                    x10_long i2) {
    
    //#line 59 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    FMGL(rank) = ((x10_long)3ll);
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    ::x10::lang::Point* this__103324 = this;
    
    //#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    this->FMGL(c0) = i0;
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    this->FMGL(c1) = i1;
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    this->FMGL(c2) = i2;
    
    //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    this->FMGL(c3) = ((x10_long)0ll);
    
    //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    this->FMGL(cs) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
::x10::lang::Point* x10::lang::Point::_make(x10_long i0, x10_long i1,
                                            x10_long i2) {
    ::x10::lang::Point* this_ = new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point();
    this_->_constructor(i0, i1, i2);
    return this_;
}



//#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
void x10::lang::Point::_constructor(x10_long i0, x10_long i1,
                                    x10_long i2, x10_long i3) {
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    FMGL(rank) = ((x10_long)4ll);
    
    //#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    ::x10::lang::Point* this__103325 = this;
    
    //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    this->FMGL(c0) = i0;
    
    //#line 70 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    this->FMGL(c1) = i1;
    
    //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    this->FMGL(c2) = i2;
    
    //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    this->FMGL(c3) = i3;
    
    //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    this->FMGL(cs) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
}
::x10::lang::Point* x10::lang::Point::_make(x10_long i0, x10_long i1,
                                            x10_long i2, x10_long i3)
{
    ::x10::lang::Point* this_ = new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point();
    this_->_constructor(i0, i1, i2, i3);
    return this_;
}



//#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
x10_long x10::lang::Point::__apply(x10_long i) {
    
    //#line 81 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    if ((((i) < (((x10_long)0ll))) || ((i) >= (this->FMGL(rank)))))
    {
        ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::ArrayIndexOutOfBoundsException::_make(::x10::lang::String::__plus(::x10::lang::String::__plus(::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125204 = ::x10aux::makeStringLit("index "); strLit__125204; })), i), (__extension__ ({ static ::x10::lang::String* strLit__125205 = ::x10aux::makeStringLit(" not contained in "); strLit__125205; }))), this))));
    }
    
    //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    if ((::x10aux::struct_equals(i, ((x10_long)0ll)))) {
        return this->FMGL(c0);
        
    }
    
    //#line 83 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    if ((::x10aux::struct_equals(i, ((x10_long)1ll)))) {
        return this->FMGL(c1);
        
    }
    
    //#line 84 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    if ((::x10aux::struct_equals(i, ((x10_long)2ll)))) {
        return this->FMGL(c2);
        
    }
    
    //#line 85 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    if ((::x10aux::struct_equals(i, ((x10_long)3ll)))) {
        return this->FMGL(c3);
        
    }
    
    //#line 86 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    return ::x10aux::nullCheck(this->FMGL(cs))->x10::lang::Rail< x10_long >::__apply(
             i);
    
}

//#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Fun_0_1<x10_long, x10_long>* x10::lang::Point::coords(
  ) {
    return reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_lang_Point__closure__1)))x10_lang_Point__closure__1(this)));
    
}

//#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Point* x10::lang::Point::make(::x10::lang::Rail< x10_int >* r) {
    
    //#line 98 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    if ((::x10aux::struct_equals((x10_long)(::x10aux::nullCheck(r)->FMGL(size)),
                                 ((x10_long)1ll)))) {
        
        //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return (__extension__ ({
            ::x10::lang::Point* alloc__71008 =  (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
            (alloc__71008)->::x10::lang::Point::_constructor(
              ((x10_long)(::x10aux::nullCheck(r)->x10::lang::Rail< x10_int >::__apply(
                            ((x10_long)0ll)))));
            alloc__71008;
        }))
        ;
        
    } else 
    //#line 100 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    if ((::x10aux::struct_equals((x10_long)(::x10aux::nullCheck(r)->FMGL(size)),
                                 ((x10_long)2ll)))) {
        
        //#line 101 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return (__extension__ ({
            ::x10::lang::Point* alloc__71009 =  (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
            (alloc__71009)->::x10::lang::Point::_constructor(
              ((x10_long)(::x10aux::nullCheck(r)->x10::lang::Rail< x10_int >::__apply(
                            ((x10_long)0ll)))), ((x10_long)(::x10aux::nullCheck(r)->x10::lang::Rail< x10_int >::__apply(
                                                              ((x10_long)1ll)))));
            alloc__71009;
        }))
        ;
        
    } else 
    //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    if ((::x10aux::struct_equals((x10_long)(::x10aux::nullCheck(r)->FMGL(size)),
                                 ((x10_long)3ll)))) {
        
        //#line 103 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return (__extension__ ({
            ::x10::lang::Point* alloc__71010 =  (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
            (alloc__71010)->::x10::lang::Point::_constructor(
              ((x10_long)(::x10aux::nullCheck(r)->x10::lang::Rail< x10_int >::__apply(
                            ((x10_long)0ll)))), ((x10_long)(::x10aux::nullCheck(r)->x10::lang::Rail< x10_int >::__apply(
                                                              ((x10_long)1ll)))),
              ((x10_long)(::x10aux::nullCheck(r)->x10::lang::Rail< x10_int >::__apply(
                            ((x10_long)2ll)))));
            alloc__71010;
        }))
        ;
        
    } else 
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    if ((::x10aux::struct_equals((x10_long)(::x10aux::nullCheck(r)->FMGL(size)),
                                 ((x10_long)4ll)))) {
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return (__extension__ ({
            ::x10::lang::Point* alloc__71011 =  (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
            (alloc__71011)->::x10::lang::Point::_constructor(
              ((x10_long)(::x10aux::nullCheck(r)->x10::lang::Rail< x10_int >::__apply(
                            ((x10_long)0ll)))), ((x10_long)(::x10aux::nullCheck(r)->x10::lang::Rail< x10_int >::__apply(
                                                              ((x10_long)1ll)))),
              ((x10_long)(::x10aux::nullCheck(r)->x10::lang::Rail< x10_int >::__apply(
                            ((x10_long)2ll)))), ((x10_long)(::x10aux::nullCheck(r)->x10::lang::Rail< x10_int >::__apply(
                                                              ((x10_long)3ll)))));
            alloc__71011;
        }))
        ;
        
    } else {
        
        //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        ::x10::lang::Point* alloc__103326 =  (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
        (alloc__103326)->::x10::lang::Point::_constructor(
          ::x10::lang::Rail< x10_long >::_make((x10_long)(::x10aux::nullCheck(r)->FMGL(size)),
                                               reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_lang_Point__closure__2)))x10_lang_Point__closure__2(r)))));
        return alloc__103326;
        
    }
    
}

//#line 114 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Point* x10::lang::Point::make(::x10::lang::Rail< x10_long >* r) {
    
    //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    if ((::x10aux::struct_equals((x10_long)(::x10aux::nullCheck(r)->FMGL(size)),
                                 ((x10_long)1ll)))) {
        
        //#line 116 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return (__extension__ ({
            ::x10::lang::Point* alloc__71013 =  (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
            (alloc__71013)->::x10::lang::Point::_constructor(
              ::x10aux::nullCheck(r)->x10::lang::Rail< x10_long >::__apply(
                ((x10_long)0ll)));
            alloc__71013;
        }))
        ;
        
    } else 
    //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    if ((::x10aux::struct_equals((x10_long)(::x10aux::nullCheck(r)->FMGL(size)),
                                 ((x10_long)2ll)))) {
        
        //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return (__extension__ ({
            ::x10::lang::Point* alloc__71014 =  (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
            (alloc__71014)->::x10::lang::Point::_constructor(
              ::x10aux::nullCheck(r)->x10::lang::Rail< x10_long >::__apply(
                ((x10_long)0ll)), ::x10aux::nullCheck(r)->x10::lang::Rail< x10_long >::__apply(
                                    ((x10_long)1ll)));
            alloc__71014;
        }))
        ;
        
    } else 
    //#line 119 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    if ((::x10aux::struct_equals((x10_long)(::x10aux::nullCheck(r)->FMGL(size)),
                                 ((x10_long)3ll)))) {
        
        //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return (__extension__ ({
            ::x10::lang::Point* alloc__71015 =  (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
            (alloc__71015)->::x10::lang::Point::_constructor(
              ::x10aux::nullCheck(r)->x10::lang::Rail< x10_long >::__apply(
                ((x10_long)0ll)), ::x10aux::nullCheck(r)->x10::lang::Rail< x10_long >::__apply(
                                    ((x10_long)1ll)), ::x10aux::nullCheck(r)->x10::lang::Rail< x10_long >::__apply(
                                                        ((x10_long)2ll)));
            alloc__71015;
        }))
        ;
        
    } else 
    //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    if ((::x10aux::struct_equals((x10_long)(::x10aux::nullCheck(r)->FMGL(size)),
                                 ((x10_long)4ll)))) {
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return (__extension__ ({
            ::x10::lang::Point* alloc__71016 =  (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
            (alloc__71016)->::x10::lang::Point::_constructor(
              ::x10aux::nullCheck(r)->x10::lang::Rail< x10_long >::__apply(
                ((x10_long)0ll)), ::x10aux::nullCheck(r)->x10::lang::Rail< x10_long >::__apply(
                                    ((x10_long)1ll)), ::x10aux::nullCheck(r)->x10::lang::Rail< x10_long >::__apply(
                                                        ((x10_long)2ll)),
              ::x10aux::nullCheck(r)->x10::lang::Rail< x10_long >::__apply(
                ((x10_long)3ll)));
            alloc__71016;
        }))
        ;
        
    } else {
        
        //#line 124 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        ::x10::lang::Point* alloc__103328 =  (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
        (alloc__103328)->::x10::lang::Point::_constructor(
          ::x10::lang::Rail< x10_long >::_make((x10_long)(::x10aux::nullCheck(r)->FMGL(size)),
                                               reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>(r)));
        return alloc__103328;
        
    }
    
}

//#line 131 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Point* x10::lang::Point::make(x10_long rank,
                                           ::x10::lang::Fun_0_1<x10_long, x10_long>* init) {
    
    //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    if ((::x10aux::struct_equals(rank, ((x10_long)1ll))))
    {
        
        //#line 133 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return (__extension__ ({
            ::x10::lang::Point* alloc__71018 =  (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
            (alloc__71018)->::x10::lang::Point::_constructor(
              ::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(init), 
                ((x10_long)0ll)));
            alloc__71018;
        }))
        ;
        
    } else 
    //#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    if ((::x10aux::struct_equals(rank, ((x10_long)2ll))))
    {
        
        //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return (__extension__ ({
            ::x10::lang::Point* alloc__71019 =  (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
            (alloc__71019)->::x10::lang::Point::_constructor(
              ::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(init), 
                ((x10_long)0ll)), ::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(init), 
                ((x10_long)1ll)));
            alloc__71019;
        }))
        ;
        
    } else 
    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    if ((::x10aux::struct_equals(rank, ((x10_long)3ll))))
    {
        
        //#line 137 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return (__extension__ ({
            ::x10::lang::Point* alloc__71020 =  (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
            (alloc__71020)->::x10::lang::Point::_constructor(
              ::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(init), 
                ((x10_long)0ll)), ::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(init), 
                ((x10_long)1ll)), ::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(init), 
                ((x10_long)2ll)));
            alloc__71020;
        }))
        ;
        
    } else 
    //#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    if ((::x10aux::struct_equals(rank, ((x10_long)4ll))))
    {
        
        //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return (__extension__ ({
            ::x10::lang::Point* alloc__71021 =  (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
            (alloc__71021)->::x10::lang::Point::_constructor(
              ::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(init), 
                ((x10_long)0ll)), ::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(init), 
                ((x10_long)1ll)), ::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(init), 
                ((x10_long)2ll)), ::x10::lang::Fun_0_1<x10_long, x10_long>::__apply(::x10aux::nullCheck(init), 
                ((x10_long)3ll)));
            alloc__71021;
        }))
        ;
        
    } else {
        
        //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
        return (__extension__ ({
            ::x10::lang::Point* alloc__71022 =  (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
            (alloc__71022)->::x10::lang::Point::_constructor(
              ::x10::lang::Rail< x10_long >::_make(rank, reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_lang_Point__closure__3)))x10_lang_Point__closure__3(init)))));
            alloc__71022;
        }))
        ;
        
    }
    
}

//#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Point* x10::lang::Point::make(x10_int i0) {
    ::x10::lang::Point* alloc__103329 =  (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
    (alloc__103329)->::x10::lang::Point::_constructor(((x10_long)(i0)));
    return alloc__103329;
    
}

//#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Point* x10::lang::Point::make(x10_int i0, x10_int i1) {
    ::x10::lang::Point* alloc__103330 =  (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
    (alloc__103330)->::x10::lang::Point::_constructor(((x10_long)(i0)),
                                                      ((x10_long)(i1)));
    return alloc__103330;
    
}

//#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Point* x10::lang::Point::make(x10_int i0, x10_int i1,
                                           x10_int i2) {
    ::x10::lang::Point* alloc__103331 =  (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
    (alloc__103331)->::x10::lang::Point::_constructor(((x10_long)(i0)),
                                                      ((x10_long)(i1)),
                                                      ((x10_long)(i2)));
    return alloc__103331;
    
}

//#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Point* x10::lang::Point::make(x10_int i0, x10_int i1,
                                           x10_int i2, x10_int i3) {
    ::x10::lang::Point* alloc__103332 =  (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
    (alloc__103332)->::x10::lang::Point::_constructor(((x10_long)(i0)),
                                                      ((x10_long)(i1)),
                                                      ((x10_long)(i2)),
                                                      ((x10_long)(i3)));
    return alloc__103332;
    
}

//#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Point* x10::lang::Point::make(x10_long i0) {
    ::x10::lang::Point* alloc__103333 =  (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
    (alloc__103333)->::x10::lang::Point::_constructor(i0);
    return alloc__103333;
    
}

//#line 152 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Point* x10::lang::Point::make(x10_long i0, x10_long i1) {
    ::x10::lang::Point* alloc__103334 =  (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
    (alloc__103334)->::x10::lang::Point::_constructor(i0,
                                                      i1);
    return alloc__103334;
    
}

//#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Point* x10::lang::Point::make(x10_long i0, x10_long i1,
                                           x10_long i2) {
    ::x10::lang::Point* alloc__103335 =  (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
    (alloc__103335)->::x10::lang::Point::_constructor(i0,
                                                      i1,
                                                      i2);
    return alloc__103335;
    
}

//#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Point* x10::lang::Point::make(x10_long i0, x10_long i1,
                                           x10_long i2, x10_long i3) {
    ::x10::lang::Point* alloc__103336 =  (new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point());
    (alloc__103336)->::x10::lang::Point::_constructor(i0,
                                                      i1,
                                                      i2,
                                                      i3);
    return alloc__103336;
    
}

//#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Point* x10::lang::Point::__implicit_convert(
  ::x10::lang::Rail< x10_long >* r) {
    return ::x10::lang::Point::make(r);
    
}

//#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Point* x10::lang::Point::__implicit_convert(
  ::x10::lang::Rail< x10_int >* r) {
    return ::x10::lang::Point::make(r);
    
}

//#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Point* x10::lang::Point::__plus() {
    return this;
    
}

//#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Point* x10::lang::Point::__minus() {
    
    //#line 179 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    return ::x10::lang::Point::make(this->FMGL(rank), reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_lang_Point__closure__4)))x10_lang_Point__closure__4(this))));
    
}

//#line 184 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Point* x10::lang::Point::__plus(::x10::lang::Point* that) {
    
    //#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    return ::x10::lang::Point::make(this->FMGL(rank), reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_lang_Point__closure__5)))x10_lang_Point__closure__5(this, that))));
    
}

//#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Point* x10::lang::Point::__minus(::x10::lang::Point* that) {
    
    //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    return ::x10::lang::Point::make(this->FMGL(rank), reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_lang_Point__closure__6)))x10_lang_Point__closure__6(this, that))));
    
}

//#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Point* x10::lang::Point::__times(::x10::lang::Point* that) {
    
    //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    return ::x10::lang::Point::make(this->FMGL(rank), reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_lang_Point__closure__7)))x10_lang_Point__closure__7(this, that))));
    
}

//#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Point* x10::lang::Point::__over(::x10::lang::Point* that) {
    
    //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    return ::x10::lang::Point::make(this->FMGL(rank), reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_lang_Point__closure__8)))x10_lang_Point__closure__8(this, that))));
    
}

//#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Point* x10::lang::Point::__plus(x10_long c) {
    
    //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    return ::x10::lang::Point::make(this->FMGL(rank), reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_lang_Point__closure__9)))x10_lang_Point__closure__9(this, c))));
    
}

//#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Point* x10::lang::Point::__minus(x10_long c) {
    
    //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    return ::x10::lang::Point::make(this->FMGL(rank), reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_lang_Point__closure__10)))x10_lang_Point__closure__10(this, c))));
    
}

//#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Point* x10::lang::Point::__times(x10_long c) {
    
    //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    return ::x10::lang::Point::make(this->FMGL(rank), reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_lang_Point__closure__11)))x10_lang_Point__closure__11(this, c))));
    
}

//#line 227 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Point* x10::lang::Point::__over(x10_long c) {
    
    //#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    return ::x10::lang::Point::make(this->FMGL(rank), reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_lang_Point__closure__12)))x10_lang_Point__closure__12(this, c))));
    
}

//#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Point* x10::lang::Point::__inv_plus(x10_long c) {
    
    //#line 234 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    return ::x10::lang::Point::make(this->FMGL(rank), reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_lang_Point__closure__13)))x10_lang_Point__closure__13(c, this))));
    
}

//#line 239 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Point* x10::lang::Point::__inv_minus(x10_long c) {
    
    //#line 240 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    return ::x10::lang::Point::make(this->FMGL(rank), reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_lang_Point__closure__14)))x10_lang_Point__closure__14(c, this))));
    
}

//#line 245 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Point* x10::lang::Point::__inv_times(x10_long c) {
    
    //#line 246 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    return ::x10::lang::Point::make(this->FMGL(rank), reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_lang_Point__closure__15)))x10_lang_Point__closure__15(c, this))));
    
}

//#line 251 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Point* x10::lang::Point::__inv_over(x10_long c) {
    
    //#line 252 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    return ::x10::lang::Point::make(this->FMGL(rank), reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_lang_Point__closure__16)))x10_lang_Point__closure__16(c, this))));
    
}

//#line 257 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
x10_int x10::lang::Point::compareTo(::x10::lang::Point* that) {
    
    //#line 258 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    return this->x10::lang::Point::equals(reinterpret_cast< ::x10::lang::Any*>(that))
      ? (((x10_int)0)) : (this->x10::lang::Point::__lt(that)
                            ? (((x10_int)-1)) : (((x10_int)1)));
    
}

//#line 268 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
x10_int x10::lang::Point::hashCode() {
    
    //#line 269 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    x10_long hc = this->x10::lang::Point::__apply(((x10_long)0ll));
    
    //#line 270 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    x10_long i__71032max__103337 = ((this->FMGL(rank)) - (((x10_long)1ll)));
    {
        x10_long i__103338;
        for (i__103338 = ((x10_long)1ll); ((i__103338) <= (i__71032max__103337));
             i__103338 = ((i__103338) + (((x10_long)1ll))))
        {
            x10_long i__103339 = i__103338;
            
            //#line 271 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            hc = ((((hc) * (((x10_long)17ll)))) ^ (this->x10::lang::Point::__apply(
                                                     i__103339)));
        }
    }
    
    //#line 273 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    return ((x10_int) (hc));
    
}

//#line 280 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
x10_boolean x10::lang::Point::equals(::x10::lang::Any* other) {
    
    //#line 281 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    if (!(::x10aux::instanceof< ::x10::lang::Point*>(other)))
    {
        return false;
        
    }
    
    //#line 282 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    ::x10::lang::Point* otherPoint = ::x10aux::class_cast< ::x10::lang::Point*>(other);
    
    //#line 283 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    if ((!::x10aux::struct_equals(this->FMGL(rank), ::x10aux::nullCheck(otherPoint)->FMGL(rank))))
    {
        return false;
        
    }
    
    //#line 284 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    x10_long i__71050max__103340 = ((this->FMGL(rank)) - (((x10_long)1ll)));
    {
        x10_long i__103341;
        for (i__103341 = ((x10_long)0ll); ((i__103341) <= (i__71050max__103340));
             i__103341 = ((i__103341) + (((x10_long)1ll))))
        {
            x10_long i__103342 = i__103341;
            
            //#line 285 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (!((::x10aux::struct_equals(this->x10::lang::Point::__apply(
                                             i__103342), ::x10aux::nullCheck(otherPoint)->x10::lang::Point::__apply(
                                                           i__103342)))))
            {
                
                //#line 286 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
                return false;
                
            }
            
        }
    }
    
    //#line 288 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    return true;
    
}

//#line 294 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
x10_boolean x10::lang::Point::__lt(::x10::lang::Point* that) {
    
    //#line 295 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    x10_long i__71068max__103345 = ((this->FMGL(rank)) - (((x10_long)2ll)));
    {
        x10_long i__103346;
        for (i__103346 = ((x10_long)0ll); ((i__103346) <= (i__71068max__103345));
             i__103346 = ((i__103346) + (((x10_long)1ll))))
        {
            x10_long i__103347 = i__103346;
            
            //#line 296 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            x10_long a__103343 = this->x10::lang::Point::__apply(
                                   i__103347);
            
            //#line 297 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            x10_long b__103344 = ::x10aux::nullCheck(that)->x10::lang::Point::__apply(
                                   i__103347);
            
            //#line 298 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (((a__103343) > (b__103344))) {
                return false;
                
            }
            
            //#line 299 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (((a__103343) < (b__103344))) {
                return true;
                
            }
            
        }
    }
    
    //#line 301 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    return ((this->x10::lang::Point::__apply(((this->FMGL(rank)) - (((x10_long)1ll))))) < (::x10aux::nullCheck(that)->x10::lang::Point::__apply(
                                                                                             ((this->FMGL(rank)) - (((x10_long)1ll))))));
    
}

//#line 308 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
x10_boolean x10::lang::Point::__gt(::x10::lang::Point* that) {
    
    //#line 309 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    x10_long i__71086max__103350 = ((this->FMGL(rank)) - (((x10_long)2ll)));
    {
        x10_long i__103351;
        for (i__103351 = ((x10_long)0ll); ((i__103351) <= (i__71086max__103350));
             i__103351 = ((i__103351) + (((x10_long)1ll))))
        {
            x10_long i__103352 = i__103351;
            
            //#line 310 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            x10_long a__103348 = this->x10::lang::Point::__apply(
                                   i__103352);
            
            //#line 311 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            x10_long b__103349 = ::x10aux::nullCheck(that)->x10::lang::Point::__apply(
                                   i__103352);
            
            //#line 312 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (((a__103348) < (b__103349))) {
                return false;
                
            }
            
            //#line 313 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (((a__103348) > (b__103349))) {
                return true;
                
            }
            
        }
    }
    
    //#line 315 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    return ((this->x10::lang::Point::__apply(((this->FMGL(rank)) - (((x10_long)1ll))))) > (::x10aux::nullCheck(that)->x10::lang::Point::__apply(
                                                                                             ((this->FMGL(rank)) - (((x10_long)1ll))))));
    
}

//#line 322 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
x10_boolean x10::lang::Point::__le(::x10::lang::Point* that) {
    
    //#line 323 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    x10_long i__71104max__103355 = ((this->FMGL(rank)) - (((x10_long)2ll)));
    {
        x10_long i__103356;
        for (i__103356 = ((x10_long)0ll); ((i__103356) <= (i__71104max__103355));
             i__103356 = ((i__103356) + (((x10_long)1ll))))
        {
            x10_long i__103357 = i__103356;
            
            //#line 324 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            x10_long a__103353 = this->x10::lang::Point::__apply(
                                   i__103357);
            
            //#line 325 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            x10_long b__103354 = ::x10aux::nullCheck(that)->x10::lang::Point::__apply(
                                   i__103357);
            
            //#line 326 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (((a__103353) > (b__103354))) {
                return false;
                
            }
            
            //#line 327 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (((a__103353) < (b__103354))) {
                return true;
                
            }
            
        }
    }
    
    //#line 329 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    return ((this->x10::lang::Point::__apply(((this->FMGL(rank)) - (((x10_long)1ll))))) <= (::x10aux::nullCheck(that)->x10::lang::Point::__apply(
                                                                                              ((this->FMGL(rank)) - (((x10_long)1ll))))));
    
}

//#line 336 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
x10_boolean x10::lang::Point::__ge(::x10::lang::Point* that) {
    
    //#line 337 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    x10_long i__71122max__103360 = ((this->FMGL(rank)) - (((x10_long)2ll)));
    {
        x10_long i__103361;
        for (i__103361 = ((x10_long)0ll); ((i__103361) <= (i__71122max__103360));
             i__103361 = ((i__103361) + (((x10_long)1ll))))
        {
            x10_long i__103362 = i__103361;
            
            //#line 338 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            x10_long a__103358 = this->x10::lang::Point::__apply(
                                   i__103362);
            
            //#line 339 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            x10_long b__103359 = ::x10aux::nullCheck(that)->x10::lang::Point::__apply(
                                   i__103362);
            
            //#line 340 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (((a__103358) < (b__103359))) {
                return false;
                
            }
            
            //#line 341 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            if (((a__103358) > (b__103359))) {
                return true;
                
            }
            
        }
    }
    
    //#line 343 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    return ((this->x10::lang::Point::__apply(((this->FMGL(rank)) - (((x10_long)1ll))))) >= (::x10aux::nullCheck(that)->x10::lang::Point::__apply(
                                                                                              ((this->FMGL(rank)) - (((x10_long)1ll))))));
    
}

//#line 349 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::String* x10::lang::Point::toString() {
    
    //#line 350 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    ::x10::lang::String* s = (__extension__ ({ static ::x10::lang::String* strLit__125319 = ::x10aux::makeStringLit("["); strLit__125319; }));
    
    //#line 351 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    if (((this->FMGL(rank)) > (((x10_long)0ll)))) {
        s = ::x10::lang::String::__plus(s, this->x10::lang::Point::__apply(
                                             ((x10_long)0ll)));
    }
    
    //#line 352 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    x10_long i__71140max__103363 = ((this->FMGL(rank)) - (((x10_long)1ll)));
    {
        x10_long i__103364;
        for (i__103364 = ((x10_long)1ll); ((i__103364) <= (i__71140max__103363));
             i__103364 = ((i__103364) + (((x10_long)1ll))))
        {
            x10_long i__103365 = i__103364;
            
            //#line 353 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
            s = ::x10::lang::String::__plus(s, ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__125321 = ::x10aux::makeStringLit(","); strLit__125321; })), this->x10::lang::Point::__apply(
                                                                                                                                                                                               i__103365)));
        }
    }
    
    //#line 355 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    s = ::x10::lang::String::__plus(s, (__extension__ ({ static ::x10::lang::String* strLit__125323 = ::x10aux::makeStringLit("]"); strLit__125323; })));
    
    //#line 356 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
    return s;
    
}

//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/lang/Point.x10"
::x10::lang::Point* x10::lang::Point::x10__lang__Point____this__x10__lang__Point(
  ) {
    return this;
    
}
void x10::lang::Point::__fieldInitializers_x10_lang_Point(
  ) {
 
}
const ::x10aux::serialization_id_t x10::lang::Point::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::lang::Point::_deserializer);

void x10::lang::Point::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(c0));
    buf.write(this->FMGL(c1));
    buf.write(this->FMGL(c2));
    buf.write(this->FMGL(c3));
    buf.write(this->FMGL(cs));
    buf.write(this->FMGL(rank));
    
}

::x10::lang::Reference* ::x10::lang::Point::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::lang::Point* this_ = new (::x10aux::alloc_z< ::x10::lang::Point>()) ::x10::lang::Point();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::lang::Point::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(c0) = buf.read<x10_long>();
    FMGL(c1) = buf.read<x10_long>();
    FMGL(c2) = buf.read<x10_long>();
    FMGL(c3) = buf.read<x10_long>();
    FMGL(cs) = buf.read< ::x10::lang::Rail< x10_long >*>();
    FMGL(rank) = buf.read<x10_long>();
}

::x10aux::RuntimeType x10::lang::Point::rtt;
void x10::lang::Point::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[3] = { ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(), ::x10aux::getRTT< ::x10::util::Ordered< ::x10::lang::Point* > >(), ::x10aux::getRTT< ::x10::lang::Comparable< ::x10::lang::Point* > >()};
    rtt.initStageTwo("x10.lang.Point",::x10aux::RuntimeType::class_kind, 3, parents, 0, NULL, NULL);
}

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__1>x10_lang_Point__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Point__closure__1::__apply, &x10_lang_Point__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Point__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_lang_Point__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Point__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Point__closure__1::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__2>x10_lang_Point__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Point__closure__2::__apply, &x10_lang_Point__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Point__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_lang_Point__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Point__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Point__closure__2::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__3>x10_lang_Point__closure__3::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Point__closure__3::__apply, &x10_lang_Point__closure__3::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Point__closure__3::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_lang_Point__closure__3::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Point__closure__3::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Point__closure__3::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__4>x10_lang_Point__closure__4::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Point__closure__4::__apply, &x10_lang_Point__closure__4::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Point__closure__4::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_lang_Point__closure__4::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Point__closure__4::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Point__closure__4::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__5>x10_lang_Point__closure__5::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Point__closure__5::__apply, &x10_lang_Point__closure__5::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Point__closure__5::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_lang_Point__closure__5::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Point__closure__5::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Point__closure__5::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__6>x10_lang_Point__closure__6::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Point__closure__6::__apply, &x10_lang_Point__closure__6::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Point__closure__6::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_lang_Point__closure__6::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Point__closure__6::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Point__closure__6::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__7>x10_lang_Point__closure__7::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Point__closure__7::__apply, &x10_lang_Point__closure__7::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Point__closure__7::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_lang_Point__closure__7::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Point__closure__7::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Point__closure__7::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__8>x10_lang_Point__closure__8::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Point__closure__8::__apply, &x10_lang_Point__closure__8::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Point__closure__8::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_lang_Point__closure__8::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Point__closure__8::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Point__closure__8::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__9>x10_lang_Point__closure__9::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Point__closure__9::__apply, &x10_lang_Point__closure__9::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Point__closure__9::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_lang_Point__closure__9::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Point__closure__9::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Point__closure__9::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__10>x10_lang_Point__closure__10::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Point__closure__10::__apply, &x10_lang_Point__closure__10::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Point__closure__10::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_lang_Point__closure__10::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Point__closure__10::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Point__closure__10::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__11>x10_lang_Point__closure__11::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Point__closure__11::__apply, &x10_lang_Point__closure__11::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Point__closure__11::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_lang_Point__closure__11::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Point__closure__11::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Point__closure__11::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__12>x10_lang_Point__closure__12::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Point__closure__12::__apply, &x10_lang_Point__closure__12::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Point__closure__12::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_lang_Point__closure__12::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Point__closure__12::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Point__closure__12::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__13>x10_lang_Point__closure__13::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Point__closure__13::__apply, &x10_lang_Point__closure__13::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Point__closure__13::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_lang_Point__closure__13::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Point__closure__13::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Point__closure__13::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__14>x10_lang_Point__closure__14::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Point__closure__14::__apply, &x10_lang_Point__closure__14::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Point__closure__14::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_lang_Point__closure__14::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Point__closure__14::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Point__closure__14::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__15>x10_lang_Point__closure__15::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Point__closure__15::__apply, &x10_lang_Point__closure__15::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Point__closure__15::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_lang_Point__closure__15::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Point__closure__15::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Point__closure__15::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_lang_Point__closure__16>x10_lang_Point__closure__16::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_lang_Point__closure__16::__apply, &x10_lang_Point__closure__16::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_lang_Point__closure__16::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_lang_Point__closure__16::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_lang_Point__closure__16::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_lang_Point__closure__16::_deserialize);

/* END of Point */
/*************************************************/
